package mcframe.clientMSBC.MSBCP1130;

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
	public static final String $itm_p = "itm_p";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";
	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public static final String $mfg_mtd_typ_nm = "mfg_mtd_typ_nm";
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
	public static final String $st_act_p = "st_act_p";
	public static final String $st_ac_dt_p = "st_ac_dt_p";
	public static final String $end_act_p = "end_act_p";
	public static final String $end_ac_dt_p = "end_ac_dt_p";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $unschd_master_dt = "unschd_master_dt";
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $not_cmpl_flg = "not_cmpl_flg";
	public static final String $base_unit_st_act_qty_p = "base_unit_st_act_qty_p";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";
	public static final String $base_unit_mfg_rem_qty_p = "base_unit_mfg_rem_qty_p";
	public static final String $base_unit_mfg_inst_qty_p = "base_unit_mfg_inst_qty_p";
	public static final String $base_unit_yield_schd_qty_p = "base_unit_yield_schd_qty_p";
	public static final String $base_unit_yield_qty_p = "base_unit_yield_qty_p";
	public static final String $base_unit_dfct_qty_p = "base_unit_dfct_qty_p";
	public static final String $base_unit_oper_schd_qty_p = "base_unit_oper_schd_qty_p";
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
	public static final String $oper_unit_act_qty_p = "oper_unit_act_qty_p";
	public static final String $oper_unit_schd_qty_p = "oper_unit_schd_qty_p";
	public static final String $oper_unit_rem_qty_p = "oper_unit_rem_qty_p";
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
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
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $lot_no_ptn_cd = "lot_no_ptn_cd";
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
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sublot_no_ptn_cd = "sublot_no_ptn_cd";
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
	 * Output lot No. 出来高ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Output sublot No. 出来高サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Order lot No. 指図ロットＮＯ.<p>
	 *
	 */
	public static final String $inst_lot_no = "inst_lot_no";
	/**
	 * Order sublot No. 指図サブロットＮＯ.<p>
	 *
	 */
	public static final String $inst_sublot_no = "inst_sublot_no";
	public static final String $sno_p = "sno_p";
	public static final String $unschd_itm_p = "unschd_itm_p";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $unschd_lot_mng_typ = "unschd_lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_lot_no_typ = "unschd_lot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_lot_no_ptn_cd = "unschd_lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $unschd_sublot_mng_typ = "unschd_sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_sublot_no_typ = "unschd_sublot_no_typ";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_sublot_no_ptn_cd = "unschd_sublot_no_ptn_cd";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $unschd_sno1_mng_typ = "unschd_sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $unschd_sno2_mng_typ = "unschd_sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $unschd_sno3_mng_typ = "unschd_sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $unschd_sno4_mng_typ = "unschd_sno4_mng_typ";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_cd = "unschd_mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_nm = "unschd_mfg_loc_nm";
	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_mfg_str_ln_tgt_flg = "unschd_mfg_str_ln_tgt_flg";
	public static final String $unschd_mfg_str_ln_p = "unschd_mfg_str_ln_p";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_site_cd = "unschd_mfg_loc_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_site_nm = "unschd_mfg_loc_site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_wg_cd = "unschd_mfg_loc_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $unschd_mfg_loc_wg_nm = "unschd_mfg_loc_wg_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $unschd_bom_ptn = "unschd_bom_ptn";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $unschd_lot_issue_typ = "unschd_lot_issue_typ";
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public static final String $unschd_ln_stk_flg = "unschd_ln_stk_flg";
	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_yield_schd_qty = "unschd_mst_yield_schd_qty";
	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_mfg_inst_qty = "unschd_mst_mfg_inst_qty";
	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public static final String $unschd_mst_fxd_rqmt_qty = "unschd_mst_fxd_rqmt_qty";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_loc_cd = "unschd_strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $unschd_strg_loc_nm = "unschd_strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_tgt_flg = "unschd_strg_str_ln_tgt_flg";
	public static final String $unschd_strg_str_ln_p = "unschd_strg_str_ln_p";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $unschd_oper_ptn = "unschd_oper_ptn";
	public static final String $unschd_lot_no_p = "unschd_lot_no_p";
	public static final String $unschd_sno_p = "unschd_sno_p";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_trd_unit_cd = "unschd_trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $unschd_trd_unit_nm = "unschd_trd_unit_nm";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $unschd_conv_base_qty = "unschd_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $unschd_conv_qty = "unschd_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_trd_unit_dec_place = "unschd_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $unschd_trd_unit_rnd_typ = "unschd_trd_unit_rnd_typ";
	public static final String $unschd_trd_unit_yield_act_qty_p = "unschd_trd_unit_yield_act_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_base_unit_cd = "unschd_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unschd_base_unit_nm = "unschd_base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_base_unit_dec_place = "unschd_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $unschd_base_unit_conv_rnd_typ = "unschd_base_unit_conv_rnd_typ";
	public static final String $unschd_base_unit_yield_act_qty_p = "unschd_base_unit_yield_act_qty_p";
	public static final String $act_usr_dpt_p = "act_usr_dpt_p";
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public static final String $act_rpt_rmrks = "act_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public static final String $mfg_act_sub_char1 = "mfg_act_sub_char1";
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public static final String $mfg_act_sub_char2 = "mfg_act_sub_char2";
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public static final String $mfg_act_sub_char3 = "mfg_act_sub_char3";
	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public static final String $act_prnt_flg = "act_prnt_flg";
	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public static final String $act_prnt_tm = "act_prnt_tm";
	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $oper_act_intr_rmrks = "oper_act_intr_rmrks";
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks = "oper_act_rpt_rmrks";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $oper_act_sub_char1 = "oper_act_sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $oper_act_sub_char2 = "oper_act_sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $oper_act_sub_char3 = "oper_act_sub_char3";
	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public static final String $itm_yield = "itm_yield";
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public static final String $itm_lower_yield = "itm_lower_yield";
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public static final String $itm_std_yield = "itm_std_yield";
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public static final String $itm_upper_yield = "itm_upper_yield";
	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public static final String $oper_yield = "oper_yield";
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public static final String $bkf_upd_flg = "bkf_upd_flg";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Allow auto-update of man-hours 自動工数更新許可.<p>
	 *
	 */
	public static final String $wk_cost_upd_calc_flg = "wk_cost_upd_calc_flg";
	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public static final String $st_schd_hm = "st_schd_hm";
	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public static final String $end_schd_hm = "end_schd_hm";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
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
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public static final String $mfg_str_ln_tgt_flg = "mfg_str_ln_tgt_flg";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
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
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public static final String $oper_str_ln_tgt_flg = "oper_str_ln_tgt_flg";
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public static final String $oper_str_ln_cd_none_flg = "oper_str_ln_cd_none_flg";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $strg_str_ln_tgt_flg = "strg_str_ln_tgt_flg";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public static final String $strg_str_ln_cd_none_flg = "strg_str_ln_cd_none_flg";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public static final String $mfg_loc_grp_nm = "mfg_loc_grp_nm";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public static final String $arr_purc_auto_reg_flg = "arr_purc_auto_reg_flg";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
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
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_oper_act_no = "ext_oper_act_no";
	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
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
	 * Mfg. order sheet remarks 製造指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public static final String $oper_usr_cd = "oper_usr_cd";
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public static final String $oper_usr_nm = "oper_usr_nm";
	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public static final String $oper_inst_rpt_rmrks = "oper_inst_rpt_rmrks";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ_nm = "mfg_aprv_sts_typ_nm";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	public static final String $aprv_usr_dpt_p = "aprv_usr_dpt_p";
	public static final String $aprv_rsn_p = "aprv_rsn_p";
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
	public static final String $rtn_msg_p = "rtn_msg_p";
	public static final String $itm_grp_p = "itm_grp_p";
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
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_pr_upd_cntr = "mfg_inst_pr_upd_cntr";
	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_act_upd_cntr = "mfg_act_upd_cntr";
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
	 * Row to copy コピー行.<p>
	 *
	 */
	public static final String $copied_row_flg = "copied_row_flg";
	/**
	 * Actual end date before update 更新前終了実績日.<p>
	 *
	 */
	public static final String $old_end_act_dt = "old_end_act_dt";
	/**
	 * Result management PIC before update 更新前実績責任者.<p>
	 *
	 */
	public static final String $old_act_usr_cd = "old_act_usr_cd";
	/**
	 * Result dept. before update 更新前実績部門.<p>
	 *
	 */
	public static final String $old_act_usr_dpt_cd = "old_act_usr_dpt_cd";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $st_act_dt = $st_act_p + ".ymd";
	public static final String $st_act_hm = $st_act_p + ".hm";
	public static final String $st_ac_dt = $st_ac_dt_p + ".ac_dt";
	public static final String $end_act_dt = $end_act_p + ".ymd";
	public static final String $end_act_hm = $end_act_p + ".hm";
	public static final String $end_ac_dt = $end_ac_dt_p + ".ac_dt";
	public static final String $base_unit_st_act_qty = $base_unit_st_act_qty_p + ".qty";
	public static final String $base_unit_mfg_rem_qty = $base_unit_mfg_rem_qty_p + ".qty";
	public static final String $base_unit_mfg_inst_qty = $base_unit_mfg_inst_qty_p + ".qty";
	public static final String $base_unit_yield_schd_qty = $base_unit_yield_schd_qty_p + ".qty";
	public static final String $base_unit_yield_qty = $base_unit_yield_qty_p + ".qty";
	public static final String $base_unit_dfct_qty = $base_unit_dfct_qty_p + ".qty";
	public static final String $base_unit_oper_schd_qty = $base_unit_oper_schd_qty_p + ".qty";
	public static final String $oper_unit_act_qty = $oper_unit_act_qty_p + ".qty";
	public static final String $oper_unit_schd_qty = $oper_unit_schd_qty_p + ".qty";
	public static final String $oper_unit_rem_qty = $oper_unit_rem_qty_p + ".qty";
	public static final String $sno1 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $unschd_itm_cd = $unschd_itm_p + ".itm_cd";
	public static final String $unschd_itm_sub1 = $unschd_itm_p + ".itm_sub1";
	public static final String $unschd_itm_sub2 = $unschd_itm_p + ".itm_sub2";
	public static final String $unschd_itm_sub3 = $unschd_itm_p + ".itm_sub3";
	public static final String $unschd_itm_nm = $unschd_itm_p + ".itm_nm";
	public static final String $unschd_mfg_str_ln_cd = $unschd_mfg_str_ln_p + ".str_ln_cd";
	public static final String $unschd_mfg_str_ln_nm = $unschd_mfg_str_ln_p + ".str_ln_nm";
	public static final String $unschd_mfg_str_ln_cd_none_flg = $unschd_mfg_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $unschd_strg_str_ln_cd = $unschd_strg_str_ln_p + ".str_ln_cd";
	public static final String $unschd_strg_str_ln_nm = $unschd_strg_str_ln_p + ".str_ln_nm";
	public static final String $unschd_strg_str_ln_cd_none_flg = $unschd_strg_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $unschd_crt_lot_flg = $unschd_lot_no_p + ".crt_lot_flg";
	public static final String $unschd_lot_no = $unschd_lot_no_p + ".lot_no";
	public static final String $unschd_sublot_no = $unschd_lot_no_p + ".sublot_no";
	public static final String $unschd_sno1 = $unschd_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $unschd_sno2 = $unschd_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $unschd_sno3 = $unschd_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $unschd_sno4 = $unschd_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $unschd_wrk_no = $unschd_sno_p + ".wrk_no";
	public static final String $unschd_wrk_nm = $unschd_sno_p + ".wrk_nm";
	public static final String $unschd_trd_unit_yield_act_qty = $unschd_trd_unit_yield_act_qty_p + ".qty";
	public static final String $unschd_base_unit_yield_act_qty = $unschd_base_unit_yield_act_qty_p + ".qty";
	public static final String $act_usr_cd = $act_usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $act_usr_dpt_p + ".usr_nm";
	public static final String $act_usr_dpt_cd = $act_usr_dpt_p + ".dpt_cd";
	public static final String $act_usr_dpt_nm = $act_usr_dpt_p + ".dpt_nm";
	public static final String $aprv_usr_cd = $aprv_usr_dpt_p + ".usr_cd";
	public static final String $aprv_usr_nm = $aprv_usr_dpt_p + ".usr_nm";
	public static final String $aprv_usr_dpt_cd = $aprv_usr_dpt_p + ".dpt_cd";
	public static final String $aprv_usr_dpt_nm = $aprv_usr_dpt_p + ".dpt_nm";
	public static final String $aprv_rsn = $aprv_rsn_p + ".txt";
	public static final String $rtn_sts_typ = $rtn_msg_p + ".rtn_sts_typ";
	public static final String $rtn_sts_typ_nm = $rtn_msg_p + ".rtn_sts_typ_nm";
	public static final String $msg_id = $rtn_msg_p + ".msg_id";
	public static final String $msg = $rtn_msg_p + ".msg";
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
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta st_act_p_META = createInnerRowMeta($st_act_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta st_ac_dt_p_META = createInnerRowMeta($st_ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta end_act_p_META = createInnerRowMeta($end_act_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_ac_dt_p_META = createInnerRowMeta($end_ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta unschd_master_dt_META = createCommonMeta($unschd_master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta not_cmpl_flg_META = createCommonMeta($not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_st_act_qty_p_META = createInnerRowMeta($base_unit_st_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_mfg_rem_qty_p_META = createInnerRowMeta($base_unit_mfg_rem_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_mfg_inst_qty_p_META = createInnerRowMeta($base_unit_mfg_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_schd_qty_p_META = createInnerRowMeta($base_unit_yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_qty_p_META = createInnerRowMeta($base_unit_yield_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_dfct_qty_p_META = createInnerRowMeta($base_unit_dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_oper_schd_qty_p_META = createInnerRowMeta($base_unit_oper_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_act_qty_p_META = createInnerRowMeta($oper_unit_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_schd_qty_p_META = createInnerRowMeta($oper_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_rem_qty_p_META = createInnerRowMeta($oper_unit_rem_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta lot_no_ptn_cd_META = createCommonMeta($lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_ptn_cd_META = createCommonMeta($sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta inst_lot_no_META = createCommonMeta($inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inst_sublot_no_META = createCommonMeta($inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta unschd_itm_p_META = createInnerRowMeta($unschd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta unschd_lot_mng_typ_META = createCommonMeta($unschd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta unschd_lot_no_typ_META = createCommonMeta($unschd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_lot_no_ptn_cd_META = createCommonMeta($unschd_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sublot_mng_typ_META = createCommonMeta($unschd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta unschd_sublot_no_typ_META = createCommonMeta($unschd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_sublot_no_ptn_cd_META = createCommonMeta($unschd_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sno1_mng_typ_META = createCommonMeta($unschd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno2_mng_typ_META = createCommonMeta($unschd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno3_mng_typ_META = createCommonMeta($unschd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_sno4_mng_typ_META = createCommonMeta($unschd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta unschd_mfg_loc_cd_META = createCommonMeta($unschd_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_mfg_loc_nm_META = createCommonMeta($unschd_mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_mfg_str_ln_tgt_flg_META = createCommonMeta($unschd_mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_mfg_str_ln_p_META = createInnerRowMeta($unschd_mfg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta unschd_mfg_loc_site_cd_META = createCommonMeta($unschd_mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta unschd_mfg_loc_site_nm_META = createCommonMeta($unschd_mfg_loc_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta unschd_mfg_loc_wg_cd_META = createCommonMeta($unschd_mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta unschd_mfg_loc_wg_nm_META = createCommonMeta($unschd_mfg_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta unschd_bom_ptn_META = createCommonMeta($unschd_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta unschd_lot_issue_typ_META = createCommonMeta($unschd_lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta unschd_ln_stk_flg_META = createCommonMeta($unschd_ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_mst_yield_schd_qty_META = createCommonMeta($unschd_mst_yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_mst_mfg_inst_qty_META = createCommonMeta($unschd_mst_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_mst_fxd_rqmt_qty_META = createCommonMeta($unschd_mst_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_strg_loc_cd_META = createCommonMeta($unschd_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_strg_loc_nm_META = createCommonMeta($unschd_strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_strg_str_ln_tgt_flg_META = createCommonMeta($unschd_strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_strg_str_ln_p_META = createInnerRowMeta($unschd_strg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta unschd_oper_ptn_META = createCommonMeta($unschd_oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta unschd_lot_no_p_META = createInnerRowMeta($unschd_lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta unschd_sno_p_META = createInnerRowMeta($unschd_sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta unschd_trd_unit_cd_META = createCommonMeta($unschd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_trd_unit_nm_META = createCommonMeta($unschd_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_conv_base_qty_META = createCommonMeta($unschd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_conv_qty_META = createCommonMeta($unschd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_trd_unit_dec_place_META = createCommonMeta($unschd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_trd_unit_rnd_typ_META = createCommonMeta($unschd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_trd_unit_yield_act_qty_p_META = createInnerRowMeta($unschd_trd_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unschd_base_unit_cd_META = createCommonMeta($unschd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_base_unit_nm_META = createCommonMeta($unschd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_base_unit_dec_place_META = createCommonMeta($unschd_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_base_unit_conv_rnd_typ_META = createCommonMeta($unschd_base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_base_unit_yield_act_qty_p_META = createInnerRowMeta($unschd_base_unit_yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_usr_dpt_p_META = createInnerRowMeta($act_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta act_rpt_rmrks_META = createCommonMeta($act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_sub_char1_META = createCommonMeta($mfg_act_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta mfg_act_sub_char2_META = createCommonMeta($mfg_act_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta mfg_act_sub_char3_META = createCommonMeta($mfg_act_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);
	public static final MCMeta act_prnt_flg_META = createCommonMeta($act_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_prnt_tm_META = createCommonMeta($act_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta oper_act_intr_rmrks_META = createCommonMeta($oper_act_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_INTR_RMRKS);
	public static final MCMeta oper_act_rpt_rmrks_META = createCommonMeta($oper_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta oper_act_sub_char1_META = createCommonMeta($oper_act_sub_char1, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR1);
	public static final MCMeta oper_act_sub_char2_META = createCommonMeta($oper_act_sub_char2, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR2);
	public static final MCMeta oper_act_sub_char3_META = createCommonMeta($oper_act_sub_char3, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR3);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_yield_META = createCommonMeta($oper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_upd_flg_META = createCommonMeta($bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_upd_calc_flg_META = createCommonMeta($wk_cost_upd_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_META = createCommonMeta($st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_META = createCommonMeta($end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_tgt_flg_META = createCommonMeta($mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_str_ln_cd_none_flg_META = createCommonMeta($mfg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_tgt_flg_META = createCommonMeta($oper_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_str_ln_cd_none_flg_META = createCommonMeta($oper_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_str_ln_cd_none_flg_META = createCommonMeta($strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta arr_purc_auto_reg_flg_META = createCommonMeta($arr_purc_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_oper_act_no_META = createCommonMeta($ext_oper_act_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ACT_NO);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_usr_dpt_p_META = createInnerRowMeta($aprv_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta aprv_rsn_p_META = createInnerRowMeta($aprv_rsn_p, mcframe.clientMAUB.MAUBP5370.TxtR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rtn_msg_p_META = createInnerRowMeta($rtn_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_pr_upd_cntr_META = createCommonMeta($mfg_inst_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_act_upd_cntr_META = createCommonMeta($mfg_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta copied_row_flg_META = createCommonMeta($copied_row_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_end_act_dt_META = createCommonMeta($old_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_act_usr_cd_META = createCommonMeta($old_act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta old_act_usr_dpt_cd_META = createCommonMeta($old_act_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			itm_p_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			old_mfg_sts_typ_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			st_act_p_META,
			st_ac_dt_p_META,
			end_act_p_META,
			end_ac_dt_p_META,
			unschd_master_dt_META,
			not_cmpl_flg_META,
			base_unit_st_act_qty_p_META,
			rem_abort_flg_META,
			base_unit_mfg_rem_qty_p_META,
			base_unit_mfg_inst_qty_p_META,
			base_unit_yield_schd_qty_p_META,
			base_unit_yield_qty_p_META,
			base_unit_dfct_qty_p_META,
			base_unit_oper_schd_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			oper_unit_act_qty_p_META,
			oper_unit_schd_qty_p_META,
			oper_unit_rem_qty_p_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_conv_rnd_typ_META,
			oper_unit_dec_place_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			lot_no_ptn_cd_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sublot_no_ptn_cd_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			lot_no_META,
			sublot_no_META,
			inst_lot_no_META,
			inst_sublot_no_META,
			sno_p_META,
			unschd_itm_p_META,
			unschd_lot_mng_typ_META,
			unschd_lot_no_typ_META,
			unschd_lot_no_ptn_cd_META,
			unschd_sublot_mng_typ_META,
			unschd_sublot_no_typ_META,
			unschd_sublot_no_ptn_cd_META,
			unschd_sno1_mng_typ_META,
			unschd_sno2_mng_typ_META,
			unschd_sno3_mng_typ_META,
			unschd_sno4_mng_typ_META,
			unschd_mfg_loc_cd_META,
			unschd_mfg_loc_nm_META,
			unschd_mfg_str_ln_tgt_flg_META,
			unschd_mfg_str_ln_p_META,
			unschd_mfg_loc_site_cd_META,
			unschd_mfg_loc_site_nm_META,
			unschd_mfg_loc_wg_cd_META,
			unschd_mfg_loc_wg_nm_META,
			unschd_bom_ptn_META,
			unschd_lot_issue_typ_META,
			unschd_ln_stk_flg_META,
			unschd_mst_yield_schd_qty_META,
			unschd_mst_mfg_inst_qty_META,
			unschd_mst_fxd_rqmt_qty_META,
			unschd_strg_loc_cd_META,
			unschd_strg_loc_nm_META,
			unschd_strg_str_ln_tgt_flg_META,
			unschd_strg_str_ln_p_META,
			unschd_oper_ptn_META,
			unschd_lot_no_p_META,
			unschd_sno_p_META,
			unschd_trd_unit_cd_META,
			unschd_trd_unit_nm_META,
			unschd_conv_base_qty_META,
			unschd_conv_qty_META,
			unschd_trd_unit_dec_place_META,
			unschd_trd_unit_rnd_typ_META,
			unschd_trd_unit_yield_act_qty_p_META,
			unschd_base_unit_cd_META,
			unschd_base_unit_nm_META,
			unschd_base_unit_dec_place_META,
			unschd_base_unit_conv_rnd_typ_META,
			unschd_base_unit_yield_act_qty_p_META,
			act_usr_dpt_p_META,
			act_rpt_rmrks_META,
			intr_rmrks_META,
			mfg_act_sub_char1_META,
			mfg_act_sub_char2_META,
			mfg_act_sub_char3_META,
			act_prnt_flg_META,
			act_prnt_tm_META,
			wip_rate_META,
			oper_act_intr_rmrks_META,
			oper_act_rpt_rmrks_META,
			oper_act_sub_char1_META,
			oper_act_sub_char2_META,
			oper_act_sub_char3_META,
			itm_yield_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			oper_yield_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			bkf_flg_META,
			bkf_upd_flg_META,
			wk_cost_calc_flg_META,
			wk_cost_upd_calc_flg_META,
			st_schd_dt_META,
			st_schd_hm_META,
			end_schd_dt_META,
			end_schd_hm_META,
			sppl_cd_META,
			sppl_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_tgt_flg_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			mfg_str_ln_cd_none_flg_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_tgt_flg_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_str_ln_cd_none_flg_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_tgt_flg_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			strg_str_ln_cd_none_flg_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_ptn_META,
			itm_ord_no_META,
			mfg_inst_no_META,
			div_seq_META,
			po_d_no_META,
			mfg_act_no_META,
			unschd_act_flg_META,
			oper_inst_no_META,
			oper_act_no_META,
			disp_seq_META,
			arr_purc_auto_reg_flg_META,
			mes_id_META,
			data_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_oper_act_no_META,
			if_auto_reg_flg_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_rpt_rmrks_META,
			inst_po_cnt_rmrks_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			oper_inst_rpt_rmrks_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			aprv_flg_META,
			aprv_dt_META,
			aprv_tm_META,
			aprv_usr_dpt_p_META,
			aprv_rsn_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rtn_msg_p_META,
			itm_grp_p_META,
			sppl_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			mfg_inst_upd_cntr_META,
			mfg_inst_pr_upd_cntr_META,
			mfg_act_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			copied_row_flg_META,
			old_end_act_dt_META,
			old_act_usr_cd_META,
			old_act_usr_dpt_cd_META,
			peg_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"st_act_dt",
				"st_act_hm",
				"st_ac_dt",
				"end_act_dt",
				"end_act_hm",
				"end_ac_dt",
				"base_unit_st_act_qty",
				"base_unit_mfg_rem_qty",
				"base_unit_mfg_inst_qty",
				"base_unit_yield_schd_qty",
				"base_unit_yield_qty",
				"base_unit_dfct_qty",
				"base_unit_oper_schd_qty",
				"oper_unit_act_qty",
				"oper_unit_schd_qty",
				"oper_unit_rem_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"unschd_itm_cd",
				"unschd_itm_sub1",
				"unschd_itm_sub2",
				"unschd_itm_sub3",
				"unschd_itm_nm",
				"unschd_mfg_str_ln_cd",
				"unschd_mfg_str_ln_nm",
				"unschd_mfg_str_ln_cd_none_flg",
				"unschd_strg_str_ln_cd",
				"unschd_strg_str_ln_nm",
				"unschd_strg_str_ln_cd_none_flg",
				"unschd_crt_lot_flg",
				"unschd_lot_no",
				"unschd_sublot_no",
				"unschd_sno1",
				"unschd_sno2",
				"unschd_sno3",
				"unschd_sno4",
				"unschd_wrk_no",
				"unschd_wrk_nm",
				"unschd_trd_unit_yield_act_qty",
				"unschd_base_unit_yield_act_qty",
				"act_usr_cd",
				"act_usr_nm",
				"act_usr_dpt_cd",
				"act_usr_dpt_nm",
				"aprv_usr_cd",
				"aprv_usr_nm",
				"aprv_usr_dpt_cd",
				"aprv_usr_dpt_nm",
				"aprv_rsn",
				"rtn_sts_typ",
				"rtn_sts_typ_nm",
				"msg_id",
				"msg",
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
				$st_act_dt,
				$st_act_hm,
				$st_ac_dt,
				$end_act_dt,
				$end_act_hm,
				$end_ac_dt,
				$base_unit_st_act_qty,
				$base_unit_mfg_rem_qty,
				$base_unit_mfg_inst_qty,
				$base_unit_yield_schd_qty,
				$base_unit_yield_qty,
				$base_unit_dfct_qty,
				$base_unit_oper_schd_qty,
				$oper_unit_act_qty,
				$oper_unit_schd_qty,
				$oper_unit_rem_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$unschd_itm_cd,
				$unschd_itm_sub1,
				$unschd_itm_sub2,
				$unschd_itm_sub3,
				$unschd_itm_nm,
				$unschd_mfg_str_ln_cd,
				$unschd_mfg_str_ln_nm,
				$unschd_mfg_str_ln_cd_none_flg,
				$unschd_strg_str_ln_cd,
				$unschd_strg_str_ln_nm,
				$unschd_strg_str_ln_cd_none_flg,
				$unschd_crt_lot_flg,
				$unschd_lot_no,
				$unschd_sublot_no,
				$unschd_sno1,
				$unschd_sno2,
				$unschd_sno3,
				$unschd_sno4,
				$unschd_wrk_no,
				$unschd_wrk_nm,
				$unschd_trd_unit_yield_act_qty,
				$unschd_base_unit_yield_act_qty,
				$act_usr_cd,
				$act_usr_nm,
				$act_usr_dpt_cd,
				$act_usr_dpt_nm,
				$aprv_usr_cd,
				$aprv_usr_nm,
				$aprv_usr_dpt_cd,
				$aprv_usr_dpt_nm,
				$aprv_rsn,
				$rtn_sts_typ,
				$rtn_sts_typ_nm,
				$msg_id,
				$msg,
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$unschd_itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;lot_issue_typ;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;unit_cd;unit_nm;dec_place;ln_stk_flg;mfg_loc_cd;bom_ptn;unit_cd;rnd_typ"},	// unschd_itm_p.itm_cd
				{$unschd_itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;lot_issue_typ;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;unit_cd;unit_nm;dec_place;ln_stk_flg;mfg_loc_cd;bom_ptn;unit_cd;rnd_typ"},	// unschd_itm_p.itm_sub1
				{$unschd_itm_p + ".itm_sub2", "itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;lot_issue_typ;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;unit_cd;unit_nm;dec_place;ln_stk_flg;mfg_loc_cd;bom_ptn;unit_cd;rnd_typ"},	// unschd_itm_p.itm_sub2
				{$unschd_itm_p + ".itm_sub3", "itm_nm;lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;lot_issue_typ;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;unit_cd;unit_nm;dec_place;ln_stk_flg;mfg_loc_cd;bom_ptn;unit_cd;rnd_typ"},	// unschd_itm_p.itm_sub3
				{$unschd_mfg_loc_cd, "mfg_loc_nm;mfg_str_ln_tgt_flg;mfg_loc_wg_cd;mfg_loc_wg_nm;mfg_loc_site_cd;mfg_loc_site_nm"},	// unschd_mfg_loc_cd
				{$unschd_bom_ptn, "lot_issue_typ;oper_ptn;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;ln_stk_flg"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "loc_nm;str_ln_tgt_flg;str_ln_cd;str_ln_cd_none_flg"},	// unschd_strg_loc_cd
				{$unschd_trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place;rnd_typ"},	// unschd_trd_unit_cd
				{$act_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// act_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$unschd_itm_p + ".itm_cd", "true;false;unschd_master_dt"},	// unschd_itm_p.itm_cd
				{$unschd_itm_p + ".itm_sub1", "unschd_itm_cd;true;false;unschd_master_dt"},	// unschd_itm_p.itm_sub1
				{$unschd_itm_p + ".itm_sub2", "unschd_itm_cd;unschd_itm_sub1;true;false;unschd_master_dt"},	// unschd_itm_p.itm_sub2
				{$unschd_itm_p + ".itm_sub3", "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;true;false;unschd_master_dt"},	// unschd_itm_p.itm_sub3
				{$unschd_mfg_loc_cd, "true;false;unschd_master_dt;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3;true"},	// unschd_mfg_loc_cd
				{$unschd_bom_ptn, "unschd_master_dt;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3;unschd_mfg_loc_wg_cd;unschd_mfg_loc_cd"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG;unschd_mfg_loc_wg_cd;unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_strg_loc_cd
				{$unschd_oper_ptn, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3;unschd_mfg_loc_cd;unschd_st_schd_dt"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_trd_unit_cd
				{$act_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;st_ac_dt;act_usr_cd"},	// act_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;aprv_dt;aprv_usr_cd"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$unschd_itm_p + ".itm_cd", "mfg_flg;outsrc_flg;dt"},	// unschd_itm_p.itm_cd
				{$unschd_itm_p + ".itm_sub1", "itm_cd;mfg_flg;outsrc_flg;dt"},	// unschd_itm_p.itm_sub1
				{$unschd_itm_p + ".itm_sub2", "itm_cd;itm_sub1;mfg_flg;outsrc_flg;dt"},	// unschd_itm_p.itm_sub2
				{$unschd_itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;mfg_flg;outsrc_flg;dt"},	// unschd_itm_p.itm_sub3
				{$unschd_mfg_loc_cd, "mfg_flg;outsrc_flg;master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wr_flg"},	// unschd_mfg_loc_cd
				{$unschd_bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// unschd_bom_ptn
				{$unschd_strg_loc_cd, "loc_is_srch_typ;wg_cd;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_strg_loc_cd
				{$unschd_oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt"},	// unschd_oper_ptn
				{$unschd_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_trd_unit_cd
				{$act_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"},	// act_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$unschd_mfg_str_ln_tgt_flg, "STR_LN"},	// unschd_mfg_str_ln_tgt_flg
				{$unschd_mfg_loc_site_cd, "SITE"},	// unschd_mfg_loc_site_cd
				{$unschd_mfg_loc_site_nm, "SITE"},	// unschd_mfg_loc_site_nm
				{$unschd_mfg_loc_wg_cd, "WG"},	// unschd_mfg_loc_wg_cd
				{$unschd_mfg_loc_wg_nm, "WG"},	// unschd_mfg_loc_wg_nm
				{$unschd_ln_stk_flg, "STR_LN"},	// unschd_ln_stk_flg
				{$unschd_strg_str_ln_tgt_flg, "STR_LN"},	// unschd_strg_str_ln_tgt_flg
				{$unschd_base_unit_cd, "BASE_UNIT"},	// unschd_base_unit_cd
				{$unschd_base_unit_nm, "BASE_UNIT"},	// unschd_base_unit_nm
				{$unschd_base_unit_dec_place, "BASE_UNIT"},	// unschd_base_unit_dec_place
				{$unschd_base_unit_conv_rnd_typ, "BASE_UNIT"},	// unschd_base_unit_conv_rnd_typ
				{$unschd_base_unit_yield_act_qty_p + ".qty", "BASE_UNIT"},	// unschd_base_unit_yield_act_qty_p.qty
				{$itm_yield, "YIELD"},	// itm_yield
				{$itm_lower_yield, "YIELD"},	// itm_lower_yield
				{$itm_std_yield, "YIELD"},	// itm_std_yield
				{$itm_upper_yield, "YIELD"},	// itm_upper_yield
				{$oper_yield, "YIELD"},	// oper_yield
				{$oper_lower_yield, "YIELD"},	// oper_lower_yield
				{$oper_std_yield, "YIELD"},	// oper_std_yield
				{$oper_upper_yield, "YIELD"},	// oper_upper_yield
				{$st_schd_hm, "TM"},	// st_schd_hm
				{$end_schd_hm, "TM"},	// end_schd_hm
				{$mfg_str_ln_tgt_flg, "STR_LN"},	// mfg_str_ln_tgt_flg
				{$mfg_str_ln_cd, "STR_LN"},	// mfg_str_ln_cd
				{$mfg_str_ln_nm, "STR_LN"},	// mfg_str_ln_nm
				{$mfg_str_ln_cd_none_flg, "STR_LN"},	// mfg_str_ln_cd_none_flg
				{$oper_str_ln_tgt_flg, "STR_LN"},	// oper_str_ln_tgt_flg
				{$oper_str_ln_cd, "STR_LN"},	// oper_str_ln_cd
				{$oper_str_ln_nm, "STR_LN"},	// oper_str_ln_nm
				{$oper_str_ln_cd_none_flg, "STR_LN"},	// oper_str_ln_cd_none_flg
				{$strg_str_ln_tgt_flg, "STR_LN"},	// strg_str_ln_tgt_flg
				{$strg_str_ln_cd, "STR_LN"},	// strg_str_ln_cd
				{$strg_str_ln_nm, "STR_LN"},	// strg_str_ln_nm
				{$strg_str_ln_cd_none_flg, "STR_LN"},	// strg_str_ln_cd_none_flg
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"},	// mfg_loc_grp_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$mfg_aprv_sts_typ, "MFG_APRV"},	// mfg_aprv_sts_typ
				{$mfg_aprv_sts_typ_nm, "MFG_APRV"},	// mfg_aprv_sts_typ_nm
				{$aprv_flg, "MFG_APRV"},	// aprv_flg
				{$aprv_dt, "MFG_APRV"},	// aprv_dt
				{$aprv_tm, "MFG_APRV"},	// aprv_tm
				{$aprv_usr_dpt_p + ".usr_cd", "MFG_APRV"},	// aprv_usr_dpt_p.usr_cd
				{$aprv_usr_dpt_p + ".usr_nm", "MFG_APRV"},	// aprv_usr_dpt_p.usr_nm
				{$aprv_usr_dpt_p + ".dpt_cd", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_nm", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_nm
				{$aprv_rsn_p + ".txt", "MFG_APRV"}	// aprv_rsn_p.txt
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 2, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 2, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 3, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 3, $mfg_sts_typ_nm, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 4, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 4, $old_mfg_sts_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 5, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 5, $mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String mfg_mtd_typ_nm() {
		return getConstString(offset + 6, $mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void mfg_mtd_typ_nm(String value) {
		setConstString(offset + 6, $mfg_mtd_typ_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 7, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 7, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 8, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 8, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 9, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_act_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 10, $st_act_p);
	}
	
	public void st_act_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 10, $st_act_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR st_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 11, $st_ac_dt_p);
	}
	
	public void st_ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 11, $st_ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_act_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 12, $end_act_p);
	}
	
	public void end_act_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 12, $end_act_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR end_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 13, $end_ac_dt_p);
	}
	
	public void end_ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 13, $end_ac_dt_p, row);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate unschd_master_dt() {
		return getConstDate(offset + 14, $unschd_master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void unschd_master_dt(MCDate value) {
		setConstDate(offset + 14, $unschd_master_dt, value);
	}


	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean not_cmpl_flg() {
		return getConstBoolean(offset + 15, $not_cmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 15, $not_cmpl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_st_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $base_unit_st_act_qty_p);
	}
	
	public void base_unit_st_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $base_unit_st_act_qty_p, row);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 17, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 17, $rem_abort_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_mfg_rem_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $base_unit_mfg_rem_qty_p);
	}
	
	public void base_unit_mfg_rem_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $base_unit_mfg_rem_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_mfg_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $base_unit_mfg_inst_qty_p);
	}
	
	public void base_unit_mfg_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $base_unit_mfg_inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $base_unit_yield_schd_qty_p);
	}
	
	public void base_unit_yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $base_unit_yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $base_unit_yield_qty_p);
	}
	
	public void base_unit_yield_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $base_unit_yield_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $base_unit_dfct_qty_p);
	}
	
	public void base_unit_dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $base_unit_dfct_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_oper_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $base_unit_oper_schd_qty_p);
	}
	
	public void base_unit_oper_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $base_unit_oper_schd_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 24, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 24, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 25, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 25, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 26, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 26, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 26, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 26, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 26, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $oper_unit_act_qty_p);
	}
	
	public void oper_unit_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $oper_unit_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $oper_unit_schd_qty_p);
	}
	
	public void oper_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $oper_unit_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_rem_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $oper_unit_rem_qty_p);
	}
	
	public void oper_unit_rem_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $oper_unit_rem_qty_p, row);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 30, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 30, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 31, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 31, $oper_unit_nm, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 32, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 32, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 32, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 32, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 32, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 32, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 33, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 33, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 33, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 33, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 33, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 33, $oper_conv_qty, value);
	}


	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 34, $oper_unit_conv_rnd_typ);
	}

	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 34, $oper_unit_conv_rnd_typ, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 35, $oper_unit_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 35, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 35, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 35, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 35, $oper_unit_dec_place, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 36, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 36, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 37, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 37, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 38, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 38, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 39, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 39, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 40, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 40, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 41, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 41, $sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 42, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 42, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 43, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 43, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 44, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 44, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 45, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 45, $sno4_mng_typ, value);
	}


	/**
	 * Output lot No. 出来高ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 46, $lot_no);
	}

	/**
	 * Output lot No. 出来高ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 46, $lot_no, value);
	}


	/**
	 * Output sublot No. 出来高サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 47, $sublot_no);
	}

	/**
	 * Output sublot No. 出来高サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 47, $sublot_no, value);
	}


	/**
	 * Order lot No. 指図ロットＮＯ.<p>
	 *
	 */
	public String inst_lot_no() {
		return getConstString(offset + 48, $inst_lot_no);
	}

	/**
	 * Order lot No. 指図ロットＮＯ.<p>
	 *
	 */
	public void inst_lot_no(String value) {
		setConstString(offset + 48, $inst_lot_no, value);
	}


	/**
	 * Order sublot No. 指図サブロットＮＯ.<p>
	 *
	 */
	public String inst_sublot_no() {
		return getConstString(offset + 49, $inst_sublot_no);
	}

	/**
	 * Order sublot No. 指図サブロットＮＯ.<p>
	 *
	 */
	public void inst_sublot_no(String value) {
		setConstString(offset + 49, $inst_sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 50, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 50, $sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR unschd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 51, $unschd_itm_p);
	}
	
	public void unschd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 51, $unschd_itm_p, row);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String unschd_lot_mng_typ() {
		return getConstString(offset + 52, $unschd_lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void unschd_lot_mng_typ(String value) {
		setConstString(offset + 52, $unschd_lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_lot_no_typ() {
		return getConstString(offset + 53, $unschd_lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_lot_no_typ(String value) {
		setConstString(offset + 53, $unschd_lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_lot_no_ptn_cd() {
		return getConstString(offset + 54, $unschd_lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_lot_no_ptn_cd(String value) {
		setConstString(offset + 54, $unschd_lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String unschd_sublot_mng_typ() {
		return getConstString(offset + 55, $unschd_sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void unschd_sublot_mng_typ(String value) {
		setConstString(offset + 55, $unschd_sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_sublot_no_typ() {
		return getConstString(offset + 56, $unschd_sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_sublot_no_typ(String value) {
		setConstString(offset + 56, $unschd_sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_sublot_no_ptn_cd() {
		return getConstString(offset + 57, $unschd_sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_sublot_no_ptn_cd(String value) {
		setConstString(offset + 57, $unschd_sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String unschd_sno1_mng_typ() {
		return getConstString(offset + 58, $unschd_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void unschd_sno1_mng_typ(String value) {
		setConstString(offset + 58, $unschd_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String unschd_sno2_mng_typ() {
		return getConstString(offset + 59, $unschd_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void unschd_sno2_mng_typ(String value) {
		setConstString(offset + 59, $unschd_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String unschd_sno3_mng_typ() {
		return getConstString(offset + 60, $unschd_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void unschd_sno3_mng_typ(String value) {
		setConstString(offset + 60, $unschd_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String unschd_sno4_mng_typ() {
		return getConstString(offset + 61, $unschd_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void unschd_sno4_mng_typ(String value) {
		setConstString(offset + 61, $unschd_sno4_mng_typ, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_cd() {
		return getConstString(offset + 62, $unschd_mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_cd(String value) {
		setConstString(offset + 62, $unschd_mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String unschd_mfg_loc_nm() {
		return getConstString(offset + 63, $unschd_mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void unschd_mfg_loc_nm(String value) {
		setConstString(offset + 63, $unschd_mfg_loc_nm, value);
	}


	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_mfg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 64, $unschd_mfg_str_ln_tgt_flg);
	}

	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_mfg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 64, $unschd_mfg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR unschd_mfg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 65, $unschd_mfg_str_ln_p);
	}
	
	public void unschd_mfg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 65, $unschd_mfg_str_ln_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_site_cd() {
		return getConstString(offset + 66, $unschd_mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_site_cd(String value) {
		setConstString(offset + 66, $unschd_mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String unschd_mfg_loc_site_nm() {
		return getConstString(offset + 67, $unschd_mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void unschd_mfg_loc_site_nm(String value) {
		setConstString(offset + 67, $unschd_mfg_loc_site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String unschd_mfg_loc_wg_cd() {
		return getConstString(offset + 68, $unschd_mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void unschd_mfg_loc_wg_cd(String value) {
		setConstString(offset + 68, $unschd_mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String unschd_mfg_loc_wg_nm() {
		return getConstString(offset + 69, $unschd_mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void unschd_mfg_loc_wg_nm(String value) {
		setConstString(offset + 69, $unschd_mfg_loc_wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String unschd_bom_ptn() {
		return getConstString(offset + 70, $unschd_bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void unschd_bom_ptn(String value) {
		setConstString(offset + 70, $unschd_bom_ptn, value);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String unschd_lot_issue_typ() {
		return getConstString(offset + 71, $unschd_lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void unschd_lot_issue_typ(String value) {
		setConstString(offset + 71, $unschd_lot_issue_typ, value);
	}


	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public boolean unschd_ln_stk_flg() {
		return getConstBoolean(offset + 72, $unschd_ln_stk_flg);
	}

	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public void unschd_ln_stk_flg(boolean value) {
		setConstBoolean(offset + 72, $unschd_ln_stk_flg, value);
	}


	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_yield_schd_qty() {
		return getConstNumber(offset + 73, $unschd_mst_yield_schd_qty);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 73, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(int value) {
		setConstNumber(offset + 73, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(long value) {
		setConstNumber(offset + 73, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(float value) {
		setConstNumber(offset + 73, $unschd_mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_yield_schd_qty(double value) {
		setConstNumber(offset + 73, $unschd_mst_yield_schd_qty, value);
	}


	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_mfg_inst_qty() {
		return getConstNumber(offset + 74, $unschd_mst_mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 74, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(int value) {
		setConstNumber(offset + 74, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(long value) {
		setConstNumber(offset + 74, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(float value) {
		setConstNumber(offset + 74, $unschd_mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_mfg_inst_qty(double value) {
		setConstNumber(offset + 74, $unschd_mst_mfg_inst_qty, value);
	}


	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public MCNumber unschd_mst_fxd_rqmt_qty() {
		return getConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void unschd_mst_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 75, $unschd_mst_fxd_rqmt_qty, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String unschd_strg_loc_cd() {
		return getConstString(offset + 76, $unschd_strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void unschd_strg_loc_cd(String value) {
		setConstString(offset + 76, $unschd_strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String unschd_strg_loc_nm() {
		return getConstString(offset + 77, $unschd_strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void unschd_strg_loc_nm(String value) {
		setConstString(offset + 77, $unschd_strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 78, $unschd_strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 78, $unschd_strg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR unschd_strg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 79, $unschd_strg_str_ln_p);
	}
	
	public void unschd_strg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 79, $unschd_strg_str_ln_p, row);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String unschd_oper_ptn() {
		return getConstString(offset + 80, $unschd_oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void unschd_oper_ptn(String value) {
		setConstString(offset + 80, $unschd_oper_ptn, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR unschd_lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 81, $unschd_lot_no_p);
	}
	
	public void unschd_lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 81, $unschd_lot_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR unschd_sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 82, $unschd_sno_p);
	}
	
	public void unschd_sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 82, $unschd_sno_p, row);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String unschd_trd_unit_cd() {
		return getConstString(offset + 83, $unschd_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void unschd_trd_unit_cd(String value) {
		setConstString(offset + 83, $unschd_trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String unschd_trd_unit_nm() {
		return getConstString(offset + 84, $unschd_trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void unschd_trd_unit_nm(String value) {
		setConstString(offset + 84, $unschd_trd_unit_nm, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber unschd_conv_base_qty() {
		return getConstNumber(offset + 85, $unschd_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 85, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(int value) {
		setConstNumber(offset + 85, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(long value) {
		setConstNumber(offset + 85, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(float value) {
		setConstNumber(offset + 85, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(double value) {
		setConstNumber(offset + 85, $unschd_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber unschd_conv_qty() {
		return getConstNumber(offset + 86, $unschd_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(MCNumber value) {
		setConstNumber(offset + 86, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(int value) {
		setConstNumber(offset + 86, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(long value) {
		setConstNumber(offset + 86, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(float value) {
		setConstNumber(offset + 86, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(double value) {
		setConstNumber(offset + 86, $unschd_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_dec_place() {
		return getConstNumber(offset + 87, $unschd_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 87, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 87, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 87, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 87, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 87, $unschd_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String unschd_trd_unit_rnd_typ() {
		return getConstString(offset + 88, $unschd_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void unschd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 88, $unschd_trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR unschd_trd_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 89, $unschd_trd_unit_yield_act_qty_p);
	}
	
	public void unschd_trd_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 89, $unschd_trd_unit_yield_act_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unschd_base_unit_cd() {
		return getConstString(offset + 90, $unschd_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unschd_base_unit_cd(String value) {
		setConstString(offset + 90, $unschd_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unschd_base_unit_nm() {
		return getConstString(offset + 91, $unschd_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unschd_base_unit_nm(String value) {
		setConstString(offset + 91, $unschd_base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_base_unit_dec_place() {
		return getConstNumber(offset + 92, $unschd_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 92, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(int value) {
		setConstNumber(offset + 92, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(long value) {
		setConstNumber(offset + 92, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(float value) {
		setConstNumber(offset + 92, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(double value) {
		setConstNumber(offset + 92, $unschd_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String unschd_base_unit_conv_rnd_typ() {
		return getConstString(offset + 93, $unschd_base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void unschd_base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 93, $unschd_base_unit_conv_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR unschd_base_unit_yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 94, $unschd_base_unit_yield_act_qty_p);
	}
	
	public void unschd_base_unit_yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 94, $unschd_base_unit_yield_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR act_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 95, $act_usr_dpt_p);
	}
	
	public void act_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 95, $act_usr_dpt_p, row);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return getConstString(offset + 96, $act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		setConstString(offset + 96, $act_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 97, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 97, $intr_rmrks, value);
	}


	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return getConstString(offset + 98, $mfg_act_sub_char1);
	}

	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		setConstString(offset + 98, $mfg_act_sub_char1, value);
	}


	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return getConstString(offset + 99, $mfg_act_sub_char2);
	}

	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		setConstString(offset + 99, $mfg_act_sub_char2, value);
	}


	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return getConstString(offset + 100, $mfg_act_sub_char3);
	}

	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		setConstString(offset + 100, $mfg_act_sub_char3, value);
	}


	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public boolean act_prnt_flg() {
		return getConstBoolean(offset + 101, $act_prnt_flg);
	}

	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public void act_prnt_flg(boolean value) {
		setConstBoolean(offset + 101, $act_prnt_flg, value);
	}


	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public MCDate act_prnt_tm() {
		return getConstDate(offset + 102, $act_prnt_tm);
	}

	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public void act_prnt_tm(MCDate value) {
		setConstDate(offset + 102, $act_prnt_tm, value);
	}


	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 103, $wip_rate);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 103, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 103, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 103, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 103, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 103, $wip_rate, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_act_intr_rmrks() {
		return getConstString(offset + 104, $oper_act_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_act_intr_rmrks(String value) {
		setConstString(offset + 104, $oper_act_intr_rmrks, value);
	}


	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public String oper_act_rpt_rmrks() {
		return getConstString(offset + 105, $oper_act_rpt_rmrks);
	}

	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public void oper_act_rpt_rmrks(String value) {
		setConstString(offset + 105, $oper_act_rpt_rmrks, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_act_sub_char1() {
		return getConstString(offset + 106, $oper_act_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_act_sub_char1(String value) {
		setConstString(offset + 106, $oper_act_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_act_sub_char2() {
		return getConstString(offset + 107, $oper_act_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_act_sub_char2(String value) {
		setConstString(offset + 107, $oper_act_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_act_sub_char3() {
		return getConstString(offset + 108, $oper_act_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_act_sub_char3(String value) {
		setConstString(offset + 108, $oper_act_sub_char3, value);
	}


	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 109, $itm_yield);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 109, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 109, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 109, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 109, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 109, $itm_yield, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 110, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 110, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 110, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 110, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 110, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 110, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 111, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 111, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 111, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 111, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 111, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 111, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 112, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 112, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 112, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 112, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 112, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 112, $itm_upper_yield, value);
	}


	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCNumber oper_yield() {
		return getConstNumber(offset + 113, $oper_yield);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(MCNumber value) {
		setConstNumber(offset + 113, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(int value) {
		setConstNumber(offset + 113, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(long value) {
		setConstNumber(offset + 113, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(float value) {
		setConstNumber(offset + 113, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(double value) {
		setConstNumber(offset + 113, $oper_yield, value);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 114, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 114, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 114, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 114, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 114, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 114, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 115, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 115, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 115, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 115, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 115, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 115, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 116, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 116, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 116, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 116, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 116, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 116, $oper_upper_yield, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 117, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 117, $bkf_flg, value);
	}


	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_upd_flg() {
		return getConstBoolean(offset + 118, $bkf_upd_flg);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 118, $bkf_upd_flg, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 119, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 119, $wk_cost_calc_flg, value);
	}


	/**
	 * Allow auto-update of man-hours 自動工数更新許可.<p>
	 *
	 */
	public boolean wk_cost_upd_calc_flg() {
		return getConstBoolean(offset + 120, $wk_cost_upd_calc_flg);
	}

	/**
	 * Allow auto-update of man-hours 自動工数更新許可.<p>
	 *
	 */
	public void wk_cost_upd_calc_flg(boolean value) {
		setConstBoolean(offset + 120, $wk_cost_upd_calc_flg, value);
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 121, $st_schd_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 121, $st_schd_dt, value);
	}


	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return getConstDate(offset + 122, $st_schd_hm);
	}

	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		setConstDate(offset + 122, $st_schd_hm, value);
	}


	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 123, $end_schd_dt);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 123, $end_schd_dt, value);
	}


	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return getConstDate(offset + 124, $end_schd_hm);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		setConstDate(offset + 124, $end_schd_hm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 125, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 125, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 126, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 126, $sppl_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 127, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 127, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 128, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 128, $mfg_loc_nm, value);
	}


	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public boolean mfg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 129, $mfg_str_ln_tgt_flg);
	}

	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public void mfg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 129, $mfg_str_ln_tgt_flg, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 130, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 130, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 131, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 131, $mfg_str_ln_nm, value);
	}


	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public boolean mfg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 132, $mfg_str_ln_cd_none_flg);
	}

	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public void mfg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 132, $mfg_str_ln_cd_none_flg, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 133, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 133, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 134, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 134, $oper_loc_nm, value);
	}


	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public boolean oper_str_ln_tgt_flg() {
		return getConstBoolean(offset + 135, $oper_str_ln_tgt_flg);
	}

	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public void oper_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 135, $oper_str_ln_tgt_flg, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 136, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 136, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 137, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 137, $oper_str_ln_nm, value);
	}


	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 138, $oper_str_ln_cd_none_flg);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 138, $oper_str_ln_cd_none_flg, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 139, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 139, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 140, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 140, $strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 141, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 141, $strg_str_ln_tgt_flg, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 142, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 142, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 143, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 143, $strg_str_ln_nm, value);
	}


	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 144, $strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 144, $strg_str_ln_cd_none_flg, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 145, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 145, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 146, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 146, $mfg_loc_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 147, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 147, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 148, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 148, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 149, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 149, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 150, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 150, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 151, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 151, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 152, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 152, $oper_ptn, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 153, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 153, $itm_ord_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 154, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 154, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 155, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 155, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 155, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 155, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 155, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 155, $div_seq, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 156, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 156, $po_d_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 157, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 157, $mfg_act_no, value);
	}


	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 158, $unschd_act_flg);
	}

	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 158, $unschd_act_flg, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 159, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 159, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 160, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 160, $oper_act_no, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 161, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 161, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 161, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 161, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 161, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 161, $disp_seq, value);
	}


	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public boolean arr_purc_auto_reg_flg() {
		return getConstBoolean(offset + 162, $arr_purc_auto_reg_flg);
	}

	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public void arr_purc_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 162, $arr_purc_auto_reg_flg, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 163, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 163, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 164, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 164, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 164, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 164, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 164, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 164, $data_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 165, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 165, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 166, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 166, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 167, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 167, $ext_sys_nm, value);
	}


	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public String ext_oper_act_no() {
		return getConstString(offset + 168, $ext_oper_act_no);
	}

	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public void ext_oper_act_no(String value) {
		setConstString(offset + 168, $ext_oper_act_no, value);
	}


	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 169, $if_auto_reg_flg);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 169, $if_auto_reg_flg, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 170, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 170, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 171, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 171, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 172, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 172, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 173, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 173, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 174, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 174, $inst_dpt_nm, value);
	}


	/**
	 * Mfg. order sheet remarks 製造指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 175, $inst_rpt_rmrks);
	}

	/**
	 * Mfg. order sheet remarks 製造指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 175, $inst_rpt_rmrks, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 176, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 176, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 177, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 177, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 178, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 178, $oper_usr_nm, value);
	}


	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 179, $oper_inst_rpt_rmrks);
	}

	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 179, $oper_inst_rpt_rmrks, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 180, $mfg_aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 180, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 181, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 181, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 182, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 182, $aprv_flg, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 183, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 183, $aprv_dt, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 184, $aprv_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 184, $aprv_tm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR aprv_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 185, $aprv_usr_dpt_p);
	}
	
	public void aprv_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 185, $aprv_usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5370.TxtR aprv_rsn_p(){
		return (mcframe.clientMAUB.MAUBP5370.TxtR) getConstInnerRow(offset + 186, $aprv_rsn_p);
	}
	
	public void aprv_rsn_p(mcframe.clientMAUB.MAUBP5370.TxtR row){
		setConstInnerRow(offset + 186, $aprv_rsn_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 187, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 187, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 188, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 188, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 189, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 189, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 190, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 190, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rtn_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 191, $rtn_msg_p);
	}
	
	public void rtn_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 191, $rtn_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 192, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 192, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 193, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 193, $sppl_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 194, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 194, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 195, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 195, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 196, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 196, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 197, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 197, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 198, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 198, $ins_ts, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 199, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 199, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 199, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 199, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 199, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 199, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_pr_upd_cntr() {
		return getConstNumber(offset + 200, $mfg_inst_pr_upd_cntr);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 200, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(int value) {
		setConstNumber(offset + 200, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(long value) {
		setConstNumber(offset + 200, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(float value) {
		setConstNumber(offset + 200, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(double value) {
		setConstNumber(offset + 200, $mfg_inst_pr_upd_cntr, value);
	}


	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_act_upd_cntr() {
		return getConstNumber(offset + 201, $mfg_act_upd_cntr);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 201, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(int value) {
		setConstNumber(offset + 201, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(long value) {
		setConstNumber(offset + 201, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(float value) {
		setConstNumber(offset + 201, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(double value) {
		setConstNumber(offset + 201, $mfg_act_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 202, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 202, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 203, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 203, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 204, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 204, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 205, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 205, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 206, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 206, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 207, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 207, $upd_srv_req_no, value);
	}


	/**
	 * Row to copy コピー行.<p>
	 *
	 */
	public boolean copied_row_flg() {
		return getConstBoolean(offset + 208, $copied_row_flg);
	}

	/**
	 * Row to copy コピー行.<p>
	 *
	 */
	public void copied_row_flg(boolean value) {
		setConstBoolean(offset + 208, $copied_row_flg, value);
	}


	/**
	 * Actual end date before update 更新前終了実績日.<p>
	 *
	 */
	public MCDate old_end_act_dt() {
		return getConstDate(offset + 209, $old_end_act_dt);
	}

	/**
	 * Actual end date before update 更新前終了実績日.<p>
	 *
	 */
	public void old_end_act_dt(MCDate value) {
		setConstDate(offset + 209, $old_end_act_dt, value);
	}


	/**
	 * Result management PIC before update 更新前実績責任者.<p>
	 *
	 */
	public String old_act_usr_cd() {
		return getConstString(offset + 210, $old_act_usr_cd);
	}

	/**
	 * Result management PIC before update 更新前実績責任者.<p>
	 *
	 */
	public void old_act_usr_cd(String value) {
		setConstString(offset + 210, $old_act_usr_cd, value);
	}


	/**
	 * Result dept. before update 更新前実績部門.<p>
	 *
	 */
	public String old_act_usr_dpt_cd() {
		return getConstString(offset + 211, $old_act_usr_dpt_cd);
	}

	/**
	 * Result dept. before update 更新前実績部門.<p>
	 *
	 */
	public void old_act_usr_dpt_cd(String value) {
		setConstString(offset + 211, $old_act_usr_dpt_cd, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 212, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 212, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 212, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 212, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 212, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 212, $peg_no, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno1_mng_typ();
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno2_mng_typ();
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno3_mng_typ();
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno4_mng_typ();
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_cd();
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_nm();
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_cd();
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_nm();
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_cd();
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_nm();
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			return unschd_bom_ptn();
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			return unschd_lot_issue_typ();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			return unschd_oper_ptn();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		if ($old_act_usr_cd.equalsIgnoreCase(name)) {
			return old_act_usr_cd();
		}
		if ($old_act_usr_dpt_cd.equalsIgnoreCase(name)) {
			return old_act_usr_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return unschd_mst_yield_schd_qty();
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return unschd_mst_mfg_inst_qty();
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return unschd_mst_fxd_rqmt_qty();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_pr_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			return unschd_master_dt();
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			return act_prnt_tm();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($old_end_act_dt.equalsIgnoreCase(name)) {
			return old_end_act_dt();
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
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_tgt_flg();
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			return unschd_ln_stk_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_upd_calc_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			return copied_row_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return lot_no_ptn_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
		}
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return sublot_no_ptn_cd();
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno1_mng_typ();
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno2_mng_typ();
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno3_mng_typ();
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sno4_mng_typ();
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_cd();
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_nm();
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_cd();
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_site_nm();
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_cd();
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return unschd_mfg_loc_wg_nm();
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			return unschd_bom_ptn();
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			return unschd_lot_issue_typ();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			return unschd_oper_ptn();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
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
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		if ($old_act_usr_cd.equalsIgnoreCase(name)) {
			return old_act_usr_cd();
		}
		if ($old_act_usr_dpt_cd.equalsIgnoreCase(name)) {
			return old_act_usr_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return unschd_mst_yield_schd_qty();
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return unschd_mst_mfg_inst_qty();
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return unschd_mst_fxd_rqmt_qty();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_pr_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			return unschd_master_dt();
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			return act_prnt_tm();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($old_end_act_dt.equalsIgnoreCase(name)) {
			return old_end_act_dt();
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
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_tgt_flg();
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			return unschd_ln_stk_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_upd_calc_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			return copied_row_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
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
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
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
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno1_mng_typ(value);
			return;
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno2_mng_typ(value);
			return;
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno3_mng_typ(value);
			return;
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno4_mng_typ(value);
			return;
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_cd(value);
			return;
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_nm(value);
			return;
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_nm(value);
			return;
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_cd(value);
			return;
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_nm(value);
			return;
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			unschd_bom_ptn(value);
			return;
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			unschd_lot_issue_typ(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			unschd_oper_ptn(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
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
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
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
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
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
		if ($old_act_usr_cd.equalsIgnoreCase(name)) {
			old_act_usr_cd(value);
			return;
		}
		if ($old_act_usr_dpt_cd.equalsIgnoreCase(name)) {
			old_act_usr_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			unschd_master_dt(value);
			return;
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			act_prnt_tm(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($old_end_act_dt.equalsIgnoreCase(name)) {
			old_end_act_dt(value);
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
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			unschd_ln_stk_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_upd_calc_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			copied_row_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
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
		if ($lot_no_ptn_cd.equalsIgnoreCase(name)) {
			lot_no_ptn_cd(value);
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
		if ($sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			sublot_no_ptn_cd(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sno1_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno1_mng_typ(value);
			return;
		}
		if ($unschd_sno2_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno2_mng_typ(value);
			return;
		}
		if ($unschd_sno3_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno3_mng_typ(value);
			return;
		}
		if ($unschd_sno4_mng_typ.equalsIgnoreCase(name)) {
			unschd_sno4_mng_typ(value);
			return;
		}
		if ($unschd_mfg_loc_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_cd(value);
			return;
		}
		if ($unschd_mfg_loc_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_nm(value);
			return;
		}
		if ($unschd_mfg_loc_site_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_cd(value);
			return;
		}
		if ($unschd_mfg_loc_site_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_site_nm(value);
			return;
		}
		if ($unschd_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_cd(value);
			return;
		}
		if ($unschd_mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			unschd_mfg_loc_wg_nm(value);
			return;
		}
		if ($unschd_bom_ptn.equalsIgnoreCase(name)) {
			unschd_bom_ptn(value);
			return;
		}
		if ($unschd_lot_issue_typ.equalsIgnoreCase(name)) {
			unschd_lot_issue_typ(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_oper_ptn.equalsIgnoreCase(name)) {
			unschd_oper_ptn(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
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
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
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
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
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
		if ($old_act_usr_cd.equalsIgnoreCase(name)) {
			old_act_usr_cd(value);
			return;
		}
		if ($old_act_usr_dpt_cd.equalsIgnoreCase(name)) {
			old_act_usr_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($unschd_mst_yield_schd_qty.equalsIgnoreCase(name)) {
			unschd_mst_yield_schd_qty(value);
			return;
		}
		if ($unschd_mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			unschd_mst_mfg_inst_qty(value);
			return;
		}
		if ($unschd_mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			unschd_mst_fxd_rqmt_qty(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
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
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($unschd_master_dt.equalsIgnoreCase(name)) {
			unschd_master_dt(value);
			return;
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			act_prnt_tm(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($old_end_act_dt.equalsIgnoreCase(name)) {
			old_end_act_dt(value);
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
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($unschd_mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_ln_stk_flg.equalsIgnoreCase(name)) {
			unschd_ln_stk_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_upd_calc_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($copied_row_flg.equalsIgnoreCase(name)) {
			copied_row_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($st_act_p.equalsIgnoreCase(name)) {
			return st_act_p();
		}
		if ($st_ac_dt_p.equalsIgnoreCase(name)) {
			return st_ac_dt_p();
		}
		if ($end_act_p.equalsIgnoreCase(name)) {
			return end_act_p();
		}
		if ($end_ac_dt_p.equalsIgnoreCase(name)) {
			return end_ac_dt_p();
		}
		if ($base_unit_st_act_qty_p.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty_p();
		}
		if ($base_unit_mfg_rem_qty_p.equalsIgnoreCase(name)) {
			return base_unit_mfg_rem_qty_p();
		}
		if ($base_unit_mfg_inst_qty_p.equalsIgnoreCase(name)) {
			return base_unit_mfg_inst_qty_p();
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_schd_qty_p();
		}
		if ($base_unit_yield_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_qty_p();
		}
		if ($base_unit_dfct_qty_p.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty_p();
		}
		if ($base_unit_oper_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_oper_schd_qty_p();
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_act_qty_p();
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_schd_qty_p();
		}
		if ($oper_unit_rem_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_rem_qty_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($unschd_itm_p.equalsIgnoreCase(name)) {
			return unschd_itm_p();
		}
		if ($unschd_mfg_str_ln_p.equalsIgnoreCase(name)) {
			return unschd_mfg_str_ln_p();
		}
		if ($unschd_strg_str_ln_p.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_p();
		}
		if ($unschd_lot_no_p.equalsIgnoreCase(name)) {
			return unschd_lot_no_p();
		}
		if ($unschd_sno_p.equalsIgnoreCase(name)) {
			return unschd_sno_p();
		}
		if ($unschd_trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty_p();
		}
		if ($unschd_base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty_p();
		}
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			return act_usr_dpt_p();
		}
		if ($aprv_usr_dpt_p.equalsIgnoreCase(name)) {
			return aprv_usr_dpt_p();
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			return aprv_rsn_p();
		}
		if ($rtn_msg_p.equalsIgnoreCase(name)) {
			return rtn_msg_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
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
		if ($st_act_p.equalsIgnoreCase(name)) {
			st_act_p(
				((MCContainerMeta) st_act_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($st_ac_dt_p.equalsIgnoreCase(name)) {
			st_ac_dt_p(
				((MCContainerMeta) st_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($end_act_p.equalsIgnoreCase(name)) {
			end_act_p(
				((MCContainerMeta) end_act_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_ac_dt_p.equalsIgnoreCase(name)) {
			end_ac_dt_p(
				((MCContainerMeta) end_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($base_unit_st_act_qty_p.equalsIgnoreCase(name)) {
			base_unit_st_act_qty_p(
				((MCContainerMeta) base_unit_st_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_mfg_rem_qty_p.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty_p(
				((MCContainerMeta) base_unit_mfg_rem_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_mfg_inst_qty_p.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty_p(
				((MCContainerMeta) base_unit_mfg_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_schd_qty_p(
				((MCContainerMeta) base_unit_yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_qty_p(
				((MCContainerMeta) base_unit_yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_dfct_qty_p.equalsIgnoreCase(name)) {
			base_unit_dfct_qty_p(
				((MCContainerMeta) base_unit_dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_oper_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_oper_schd_qty_p(
				((MCContainerMeta) base_unit_oper_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			oper_unit_act_qty_p(
				((MCContainerMeta) oper_unit_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			oper_unit_schd_qty_p(
				((MCContainerMeta) oper_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_rem_qty_p.equalsIgnoreCase(name)) {
			oper_unit_rem_qty_p(
				((MCContainerMeta) oper_unit_rem_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($unschd_itm_p.equalsIgnoreCase(name)) {
			unschd_itm_p(
				((MCContainerMeta) unschd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($unschd_mfg_str_ln_p.equalsIgnoreCase(name)) {
			unschd_mfg_str_ln_p(
				((MCContainerMeta) unschd_mfg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($unschd_strg_str_ln_p.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_p(
				((MCContainerMeta) unschd_strg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($unschd_lot_no_p.equalsIgnoreCase(name)) {
			unschd_lot_no_p(
				((MCContainerMeta) unschd_lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($unschd_sno_p.equalsIgnoreCase(name)) {
			unschd_sno_p(
				((MCContainerMeta) unschd_sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($unschd_trd_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty_p(
				((MCContainerMeta) unschd_trd_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($unschd_base_unit_yield_act_qty_p.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty_p(
				((MCContainerMeta) unschd_base_unit_yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_usr_dpt_p.equalsIgnoreCase(name)) {
			act_usr_dpt_p(
				((MCContainerMeta) act_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
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
		if ($rtn_msg_p.equalsIgnoreCase(name)) {
			rtn_msg_p(
				((MCContainerMeta) rtn_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
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
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return st_act_p().ymd();
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		st_act_p().ymd(value);
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public MCDate st_act_hm() {
		return st_act_p().hm();
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public void st_act_hm(MCDate value) {
		st_act_p().hm(value);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return st_ac_dt_p().ac_dt();
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		st_ac_dt_p().ac_dt(value);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return end_act_p().ymd();
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		end_act_p().ymd(value);
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public MCDate end_act_hm() {
		return end_act_p().hm();
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public void end_act_hm(MCDate value) {
		end_act_p().hm(value);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return end_ac_dt_p().ac_dt();
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		end_ac_dt_p().ac_dt(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_act_qty() {
		return base_unit_st_act_qty_p().qty();
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(MCNumber value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(int value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(long value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(float value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(double value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_rem_qty() {
		return base_unit_mfg_rem_qty_p().qty();
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(MCNumber value) {
		base_unit_mfg_rem_qty_p().qty(value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(int value) {
		base_unit_mfg_rem_qty_p().qty(value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(long value) {
		base_unit_mfg_rem_qty_p().qty(value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(float value) {
		base_unit_mfg_rem_qty_p().qty(value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(double value) {
		base_unit_mfg_rem_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_inst_qty() {
		return base_unit_mfg_inst_qty_p().qty();
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(MCNumber value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(int value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(long value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(float value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(double value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_schd_qty() {
		return base_unit_yield_schd_qty_p().qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(MCNumber value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(int value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(long value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(float value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(double value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return base_unit_yield_qty_p().qty();
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public MCNumber base_unit_dfct_qty() {
		return base_unit_dfct_qty_p().qty();
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(MCNumber value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(int value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(long value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(float value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(double value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_oper_schd_qty() {
		return base_unit_oper_schd_qty_p().qty();
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public void base_unit_oper_schd_qty(MCNumber value) {
		base_unit_oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public void base_unit_oper_schd_qty(int value) {
		base_unit_oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public void base_unit_oper_schd_qty(long value) {
		base_unit_oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public void base_unit_oper_schd_qty(float value) {
		base_unit_oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation base unit scheduled qty. 工程基準単位予定数量.<p>
	 *
	 */
	public void base_unit_oper_schd_qty(double value) {
		base_unit_oper_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_act_qty() {
		return oper_unit_act_qty_p().qty();
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(MCNumber value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(int value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(long value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(float value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(double value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public MCNumber oper_unit_schd_qty() {
		return oper_unit_schd_qty_p().qty();
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(MCNumber value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(int value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(long value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(float value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(double value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public MCNumber oper_unit_rem_qty() {
		return oper_unit_rem_qty_p().qty();
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(MCNumber value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(int value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(long value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(float value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(double value) {
		oper_unit_rem_qty_p().qty(value);
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

	public String unschd_itm_cd() {
		return unschd_itm_p().itm_cd();
	}

	public void unschd_itm_cd(String value) {
		unschd_itm_p().itm_cd(value);
	}

	public String unschd_itm_sub1() {
		return unschd_itm_p().itm_sub1();
	}

	public void unschd_itm_sub1(String value) {
		unschd_itm_p().itm_sub1(value);
	}

	public String unschd_itm_sub2() {
		return unschd_itm_p().itm_sub2();
	}

	public void unschd_itm_sub2(String value) {
		unschd_itm_p().itm_sub2(value);
	}

	public String unschd_itm_sub3() {
		return unschd_itm_p().itm_sub3();
	}

	public void unschd_itm_sub3(String value) {
		unschd_itm_p().itm_sub3(value);
	}

	public String unschd_itm_nm() {
		return unschd_itm_p().itm_nm();
	}

	public void unschd_itm_nm(String value) {
		unschd_itm_p().itm_nm(value);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_mfg_str_ln_cd() {
		return unschd_mfg_str_ln_p().str_ln_cd();
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_mfg_str_ln_cd(String value) {
		unschd_mfg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String unschd_mfg_str_ln_nm() {
		return unschd_mfg_str_ln_p().str_ln_nm();
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void unschd_mfg_str_ln_nm(String value) {
		unschd_mfg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_mfg_str_ln_cd_none_flg() {
		return unschd_mfg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public void unschd_mfg_str_ln_cd_none_flg(boolean value) {
		unschd_mfg_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_strg_str_ln_cd() {
		return unschd_strg_str_ln_p().str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd(String value) {
		unschd_strg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String unschd_strg_str_ln_nm() {
		return unschd_strg_str_ln_p().str_ln_nm();
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void unschd_strg_str_ln_nm(String value) {
		unschd_strg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_cd_none_flg() {
		return unschd_strg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd_none_flg(boolean value) {
		unschd_strg_str_ln_p().str_ln_cd_none_flg(value);
	}

	public boolean unschd_crt_lot_flg() {
		return unschd_lot_no_p().crt_lot_flg();
	}

	public void unschd_crt_lot_flg(boolean value) {
		unschd_lot_no_p().crt_lot_flg(value);
	}

	public String unschd_lot_no() {
		return unschd_lot_no_p().lot_no();
	}

	public void unschd_lot_no(String value) {
		unschd_lot_no_p().lot_no(value);
	}

	public String unschd_sublot_no() {
		return unschd_lot_no_p().sublot_no();
	}

	public void unschd_sublot_no(String value) {
		unschd_lot_no_p().sublot_no(value);
	}

	public String unschd_sno1() {
		return unschd_sno_p().sno1();
	}

	public void unschd_sno1(String value) {
		unschd_sno_p().sno1(value);
	}

	public String unschd_sno2() {
		return unschd_sno_p().sno2();
	}

	public void unschd_sno2(String value) {
		unschd_sno_p().sno2(value);
	}

	public String unschd_sno3() {
		return unschd_sno_p().sno3();
	}

	public void unschd_sno3(String value) {
		unschd_sno_p().sno3(value);
	}

	public String unschd_sno4() {
		return unschd_sno_p().sno4();
	}

	public void unschd_sno4(String value) {
		unschd_sno_p().sno4(value);
	}

	public String unschd_wrk_no() {
		return unschd_sno_p().wrk_no();
	}

	public void unschd_wrk_no(String value) {
		unschd_sno_p().wrk_no(value);
	}

	public String unschd_wrk_nm() {
		return unschd_sno_p().wrk_nm();
	}

	public void unschd_wrk_nm(String value) {
		unschd_sno_p().wrk_nm(value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_yield_act_qty() {
		return unschd_trd_unit_yield_act_qty_p().qty();
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(MCNumber value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(int value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(long value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(float value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(double value) {
		unschd_trd_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_base_unit_yield_act_qty() {
		return unschd_base_unit_yield_act_qty_p().qty();
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(MCNumber value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(int value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(long value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(float value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(double value) {
		unschd_base_unit_yield_act_qty_p().qty(value);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return act_usr_dpt_p().usr_cd();
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		act_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return act_usr_dpt_p().usr_nm();
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		act_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_usr_dpt_cd() {
		return act_usr_dpt_p().dpt_cd();
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_usr_dpt_cd(String value) {
		act_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_usr_dpt_nm() {
		return act_usr_dpt_p().dpt_nm();
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_usr_dpt_nm(String value) {
		act_usr_dpt_p().dpt_nm(value);
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
	public String aprv_usr_dpt_cd() {
		return aprv_usr_dpt_p().dpt_cd();
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_usr_dpt_cd(String value) {
		aprv_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_usr_dpt_nm() {
		return aprv_usr_dpt_p().dpt_nm();
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_usr_dpt_nm(String value) {
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

	public String rtn_sts_typ() {
		return rtn_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rtn_msg_p().rtn_sts_typ(value);
	}

	public String rtn_sts_typ_nm() {
		return rtn_msg_p().rtn_sts_typ_nm();
	}

	public void rtn_sts_typ_nm(String value) {
		rtn_msg_p().rtn_sts_typ_nm(value);
	}

	public String msg_id() {
		return rtn_msg_p().msg_id();
	}

	public void msg_id(String value) {
		rtn_msg_p().msg_id(value);
	}

	public String msg() {
		return rtn_msg_p().msg();
	}

	public void msg(String value) {
		rtn_msg_p().msg(value);
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
	 * Subcontractor classification cd. 1 外注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Subcontractor classification cd. 1 外注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Subcontractor classification name 1 外注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Subcontractor classification name 1 外注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Subcontractor classification cd. 2 外注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Subcontractor classification cd. 2 外注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Subcontractor classification name 2 外注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Subcontractor classification name 2 外注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Subcontractor classification cd. 3 外注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Subcontractor classification cd. 3 外注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Subcontractor classification name 3 外注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Subcontractor classification name 3 外注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Subcontractor classification cd. 4 外注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Subcontractor classification cd. 4 外注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Subcontractor classification name 4 外注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Subcontractor classification name 4 外注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Subcontractor classification cd. 5 外注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Subcontractor classification cd. 5 外注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Subcontractor classification name 5 外注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Subcontractor classification name 5 外注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Subcontractor classification cd. 6 外注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Subcontractor classification cd. 6 外注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Subcontractor classification name 6 外注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Subcontractor classification name 6 外注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Subcontractor classification cd. 7 外注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Subcontractor classification cd. 7 外注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Subcontractor classification name 7 外注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Subcontractor classification name 7 外注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Subcontractor classification cd. 8 外注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Subcontractor classification cd. 8 外注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Subcontractor classification name 8 外注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Subcontractor classification name 8 外注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Subcontractor classification cd. 9 外注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Subcontractor classification cd. 9 外注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Subcontractor classification name 9 外注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Subcontractor classification name 9 外注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Subcontractor classification cd. 10 外注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Subcontractor classification cd. 10 外注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Subcontractor classification name 10 外注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Subcontractor classification name 10 外注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
	}

}

