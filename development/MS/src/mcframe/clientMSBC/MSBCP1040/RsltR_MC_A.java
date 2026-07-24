package mcframe.clientMSBC.MSBCP1040;

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
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
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
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	public static final String $itm_p = "itm_p";
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
	public static final String $mfg_str_ln_p = "mfg_str_ln_p";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $lot_issue_typ = "lot_issue_typ";
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public static final String $ln_stk_flg = "ln_stk_flg";
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
	public static final String $strg_str_ln_p = "strg_str_ln_p";
	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public static final String $mst_yield_schd_qty = "mst_yield_schd_qty";
	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public static final String $mst_mfg_inst_qty = "mst_mfg_inst_qty";
	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public static final String $mst_fxd_rqmt_qty = "mst_fxd_rqmt_qty";
	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public static final String $not_qty_rlt_flg = "not_qty_rlt_flg";
	public static final String $inst_qty_p = "inst_qty_p";
	public static final String $yield_qty_p = "yield_qty_p";
	public static final String $oper_base_unit_qty_p = "oper_base_unit_qty_p";
	public static final String $ord_qty_p = "ord_qty_p";
	public static final String $not_inst_qty_p = "not_inst_qty_p";
	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public static final String $ord_abort_flg = "ord_abort_flg";
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
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	public static final String $oper_unit_qty_p = "oper_unit_qty_p";
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
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	/**
	 * Operation unit conversion rounding type 工程単位換算端数処理区分.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	public static final String $rqst_dlv_rqst_p = "rqst_dlv_rqst_p";
	public static final String $st_schd_p = "st_schd_p";
	public static final String $end_schd_p = "end_schd_p";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
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
	public static final String $oper_str_ln_p = "oper_str_ln_p";
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
	 * Operation resources 工程資源.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
	public static final String $lot_no_p = "lot_no_p";
	public static final String $sno_p = "sno_p";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	public static final String $inst_usr_dpt_p = "inst_usr_dpt_p";
	/**
	 * Disable PO correction/cancellation 発注の訂正・取消を不可にする.<p>
	 *
	 */
	public static final String $po_locked_flg = "po_locked_flg";
	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public static final String $disp_po_locked_flg = "disp_po_locked_flg";
	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public static final String $xfr_inst_del_enable_flg = "xfr_inst_del_enable_flg";
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $oper_intr_rmrks = "oper_intr_rmrks";
	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public static final String $oper_inst_rpt_rmrks = "oper_inst_rpt_rmrks";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public static final String $inst_prnt_tm = "inst_prnt_tm";
	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
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
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_tgt_flg = "aprv_tgt_flg";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public static final String $unschd_inst_flg = "unschd_inst_flg";
	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public static final String $schd_chg_flg = "schd_chg_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_wg_cd = "mfg_loc_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $mfg_loc_wg_nm = "mfg_loc_wg_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_site_cd = "mfg_loc_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $mfg_loc_site_nm = "mfg_loc_site_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $mfg_loc_grp_nm = "mfg_loc_grp_nm";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public static final String $po_aprv_sts_typ = "po_aprv_sts_typ";
	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public static final String $po_aprv_sts_typ_nm = "po_aprv_sts_typ_nm";
	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public static final String $po_auto_reg_flg = "po_auto_reg_flg";
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public static final String $yield_oper_ratio = "yield_oper_ratio";
	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Current MES 今回ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * Last MES 前回ＭＥＳ.<p>
	 *
	 */
	public static final String $last_mes_flg = "last_mes_flg";
	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public static final String $mes_tgt_flg = "mes_tgt_flg";
	/**
	 * Initial mfg. order (Operation unit) 初回製造指図（工程単位）.<p>
	 *
	 */
	public static final String $frst_mfg_inst_flg = "frst_mfg_inst_flg";
	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public static final String $itm_mfg_inst_sub_char1 = "itm_mfg_inst_sub_char1";
	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public static final String $itm_mfg_inst_sub_char2 = "itm_mfg_inst_sub_char2";
	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public static final String $itm_mfg_inst_sub_char3 = "itm_mfg_inst_sub_char3";
	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char1 = "mfg_inst_sub_char1";
	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char2 = "mfg_inst_sub_char2";
	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char3 = "mfg_inst_sub_char3";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $oper_inst_sub_char1 = "oper_inst_sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $oper_inst_sub_char2 = "oper_inst_sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $oper_inst_sub_char3 = "oper_inst_sub_char3";
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
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public static final String $for_scheduler_frozen_flg = "for_scheduler_frozen_flg";
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public static final String $scheduler_frozen_flg = "scheduler_frozen_flg";
	/**
	 * Scheduler frozen (Item) スケジューラ凍結（品目）.<p>
	 *
	 */
	public static final String $scheduler_frozen_itm_flg = "scheduler_frozen_itm_flg";
	/**
	 * Scheduler frozen (Operation) スケジューラ凍結（工程）.<p>
	 *
	 */
	public static final String $scheduler_frozen_oper_flg = "scheduler_frozen_oper_flg";
	public static final String $rts_msg_p = "rts_msg_p";
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
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public static final String $itm_ord_upd_cntr = "itm_ord_upd_cntr";
	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_upd_cntr = "itm_mfg_inst_upd_cntr";
	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $mfg_str_ln_cd = $mfg_str_ln_p + ".str_ln_cd";
	public static final String $mfg_str_ln_nm = $mfg_str_ln_p + ".str_ln_nm";
	public static final String $mfg_str_ln_cd_none_flg = $mfg_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $strg_str_ln_cd = $strg_str_ln_p + ".str_ln_cd";
	public static final String $strg_str_ln_nm = $strg_str_ln_p + ".str_ln_nm";
	public static final String $strg_str_ln_cd_none_flg = $strg_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $base_unit_inst_qty = $inst_qty_p + ".qty";
	public static final String $base_unit_yield_qty = $yield_qty_p + ".qty";
	public static final String $oper_base_unit_qty = $oper_base_unit_qty_p + ".qty";
	public static final String $base_unit_ord_qty = $ord_qty_p + ".qty";
	public static final String $base_unit_not_inst_qty = $not_inst_qty_p + ".qty";
	public static final String $oper_unit_qty = $oper_unit_qty_p + ".qty";
	public static final String $rqst_dlv_rqst_dt = $rqst_dlv_rqst_p + ".ymd";
	public static final String $rqst_dlv_rqst_hm = $rqst_dlv_rqst_p + ".hm";
	public static final String $st_schd_dt = $st_schd_p + ".ymd";
	public static final String $st_schd_hm = $st_schd_p + ".hm";
	public static final String $end_schd_dt = $end_schd_p + ".ymd";
	public static final String $end_schd_hm = $end_schd_p + ".hm";
	public static final String $oper_str_ln_cd = $oper_str_ln_p + ".str_ln_cd";
	public static final String $oper_str_ln_nm = $oper_str_ln_p + ".str_ln_nm";
	public static final String $oper_str_ln_cd_none_flg = $oper_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $sno1 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $inst_usr_cd = $inst_usr_dpt_p + ".usr_cd";
	public static final String $inst_usr_nm = $inst_usr_dpt_p + ".usr_nm";
	public static final String $inst_dpt_cd = $inst_usr_dpt_p + ".dpt_cd";
	public static final String $inst_dpt_nm = $inst_usr_dpt_p + ".dpt_nm";
	public static final String $aprv_usr_cd = $aprv_usr_dpt_p + ".usr_cd";
	public static final String $aprv_usr_nm = $aprv_usr_dpt_p + ".usr_nm";
	public static final String $aprv_dpt_cd = $aprv_usr_dpt_p + ".dpt_cd";
	public static final String $aprv_dpt_nm = $aprv_usr_dpt_p + ".dpt_nm";
	public static final String $aprv_rsn = $aprv_rsn_p + ".txt";
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
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
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
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_tgt_flg_META = createCommonMeta($mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_str_ln_p_META = createInnerRowMeta($mfg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta lot_issue_typ_META = createCommonMeta($lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta ln_stk_flg_META = createCommonMeta($ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_str_ln_p_META = createInnerRowMeta($strg_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta mst_yield_schd_qty_META = createCommonMeta($mst_yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mst_mfg_inst_qty_META = createCommonMeta($mst_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mst_fxd_rqmt_qty_META = createCommonMeta($mst_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_qty_rlt_flg_META = createCommonMeta($not_qty_rlt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta yield_qty_p_META = createInnerRowMeta($yield_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_base_unit_qty_p_META = createInnerRowMeta($oper_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ord_qty_p_META = createInnerRowMeta($ord_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta not_inst_qty_p_META = createInnerRowMeta($not_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ord_abort_flg_META = createCommonMeta($ord_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_unit_qty_p_META = createInnerRowMeta($oper_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rqst_dlv_rqst_p_META = createInnerRowMeta($rqst_dlv_rqst_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta st_schd_p_META = createInnerRowMeta($st_schd_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_schd_p_META = createInnerRowMeta($end_schd_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_tgt_flg_META = createCommonMeta($oper_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_str_ln_p_META = createInnerRowMeta($oper_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_dpt_p_META = createInnerRowMeta($inst_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta po_locked_flg_META = createCommonMeta($po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_po_locked_flg_META = createCommonMeta($disp_po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_inst_del_enable_flg_META = createCommonMeta($xfr_inst_del_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta oper_intr_rmrks_META = createCommonMeta($oper_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta inst_prnt_tm_META = createCommonMeta($inst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta aprv_tgt_flg_META = createCommonMeta($aprv_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_usr_dpt_p_META = createInnerRowMeta($aprv_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta aprv_rsn_p_META = createInnerRowMeta($aprv_rsn_p, mcframe.clientMAUB.MAUBP5370.TxtR.class);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta unschd_inst_flg_META = createCommonMeta($unschd_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_chg_flg_META = createCommonMeta($schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_wg_nm_META = createCommonMeta($mfg_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_loc_site_cd_META = createCommonMeta($mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_loc_site_nm_META = createCommonMeta($mfg_loc_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_aprv_sts_typ_META = createCommonMeta($po_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta po_aprv_sts_typ_nm_META = createCommonMeta($po_aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta po_auto_reg_flg_META = createCommonMeta($po_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_oper_ratio_META = createCommonMeta($yield_oper_ratio, mcframe.commonMA.meta.MA_META.YIELD_OPER_RATIO);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_mes_flg_META = createCommonMeta($last_mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_tgt_flg_META = createCommonMeta($mes_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta frst_mfg_inst_flg_META = createCommonMeta($frst_mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_sub_char1_META = createCommonMeta($itm_mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char2_META = createCommonMeta($itm_mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta itm_mfg_inst_sub_char3_META = createCommonMeta($itm_mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta oper_inst_sub_char1_META = createCommonMeta($oper_inst_sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char2_META = createCommonMeta($oper_inst_sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR2);
	public static final MCMeta oper_inst_sub_char3_META = createCommonMeta($oper_inst_sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta for_scheduler_frozen_flg_META = createCommonMeta($for_scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scheduler_frozen_flg_META = createCommonMeta($scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scheduler_frozen_itm_flg_META = createCommonMeta($scheduler_frozen_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scheduler_frozen_oper_flg_META = createCommonMeta($scheduler_frozen_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta itm_ord_upd_cntr_META = createCommonMeta($itm_ord_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_mfg_inst_upd_cntr_META = createCommonMeta($itm_mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
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
			mfg_flg_META,
			outsrc_flg_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
			master_dt_META,
			itm_p_META,
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
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_tgt_flg_META,
			mfg_str_ln_p_META,
			sppl_cd_META,
			sppl_nm_META,
			bom_ptn_META,
			lot_issue_typ_META,
			ln_stk_flg_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_tgt_flg_META,
			strg_str_ln_p_META,
			mst_yield_schd_qty_META,
			mst_mfg_inst_qty_META,
			mst_fxd_rqmt_qty_META,
			not_qty_rlt_flg_META,
			inst_qty_p_META,
			yield_qty_p_META,
			oper_base_unit_qty_p_META,
			ord_qty_p_META,
			not_inst_qty_p_META,
			ord_abort_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			oper_unit_qty_p_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_unit_dec_place_META,
			oper_unit_conv_rnd_typ_META,
			rqst_dlv_rqst_p_META,
			st_schd_p_META,
			end_schd_p_META,
			oper_ptn_META,
			disp_seq_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_tgt_flg_META,
			oper_str_ln_p_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			oper_rsrc_META,
			lot_no_p_META,
			sno_p_META,
			inst_dt_META,
			inst_usr_dpt_p_META,
			po_locked_flg_META,
			disp_po_locked_flg_META,
			xfr_inst_del_enable_flg_META,
			inst_rpt_rmrks_META,
			intr_rmrks_META,
			oper_intr_rmrks_META,
			oper_inst_rpt_rmrks_META,
			inst_po_cnt_rmrks_META,
			disp_pd_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			inst_prnt_tm_META,
			inst_prnt_flg_META,
			inst_abort_flg_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			aprv_tgt_flg_META,
			aprv_dt_META,
			aprv_tm_META,
			aprv_usr_dpt_p_META,
			aprv_rsn_p_META,
			itm_mfg_inst_no_META,
			itm_ord_no_META,
			oper_ord_no_META,
			oper_inst_no_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			unschd_inst_flg_META,
			unschd_act_flg_META,
			schd_chg_flg_META,
			mfg_loc_wg_cd_META,
			mfg_loc_wg_nm_META,
			mfg_loc_site_cd_META,
			mfg_loc_site_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			po_d_no_META,
			po_aprv_sts_typ_META,
			po_aprv_sts_typ_nm_META,
			po_auto_reg_flg_META,
			yield_oper_flg_META,
			yield_oper_ratio_META,
			oper_inst_grp_META,
			bkf_flg_META,
			wk_cost_calc_flg_META,
			mes_flg_META,
			last_mes_flg_META,
			mes_tgt_flg_META,
			frst_mfg_inst_flg_META,
			itm_mfg_inst_sub_char1_META,
			itm_mfg_inst_sub_char2_META,
			itm_mfg_inst_sub_char3_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			oper_inst_sub_char1_META,
			oper_inst_sub_char2_META,
			oper_inst_sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			for_scheduler_frozen_flg_META,
			scheduler_frozen_flg_META,
			scheduler_frozen_itm_flg_META,
			scheduler_frozen_oper_flg_META,
			rts_msg_p_META,
			itm_grp_p_META,
			sppl_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			itm_ord_upd_cntr_META,
			itm_mfg_inst_upd_cntr_META,
			mfg_inst_upd_cntr_META,
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
				"itm_nm",
				"mfg_str_ln_cd",
				"mfg_str_ln_nm",
				"mfg_str_ln_cd_none_flg",
				"strg_str_ln_cd",
				"strg_str_ln_nm",
				"strg_str_ln_cd_none_flg",
				"base_unit_inst_qty",
				"base_unit_yield_qty",
				"oper_base_unit_qty",
				"base_unit_ord_qty",
				"base_unit_not_inst_qty",
				"oper_unit_qty",
				"rqst_dlv_rqst_dt",
				"rqst_dlv_rqst_hm",
				"st_schd_dt",
				"st_schd_hm",
				"end_schd_dt",
				"end_schd_hm",
				"oper_str_ln_cd",
				"oper_str_ln_nm",
				"oper_str_ln_cd_none_flg",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"inst_usr_cd",
				"inst_usr_nm",
				"inst_dpt_cd",
				"inst_dpt_nm",
				"aprv_usr_cd",
				"aprv_usr_nm",
				"aprv_dpt_cd",
				"aprv_dpt_nm",
				"aprv_rsn",
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
				$mfg_str_ln_cd,
				$mfg_str_ln_nm,
				$mfg_str_ln_cd_none_flg,
				$strg_str_ln_cd,
				$strg_str_ln_nm,
				$strg_str_ln_cd_none_flg,
				$base_unit_inst_qty,
				$base_unit_yield_qty,
				$oper_base_unit_qty,
				$base_unit_ord_qty,
				$base_unit_not_inst_qty,
				$oper_unit_qty,
				$rqst_dlv_rqst_dt,
				$rqst_dlv_rqst_hm,
				$st_schd_dt,
				$st_schd_hm,
				$end_schd_dt,
				$end_schd_hm,
				$oper_str_ln_cd,
				$oper_str_ln_nm,
				$oper_str_ln_cd_none_flg,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$inst_usr_cd,
				$inst_usr_nm,
				$inst_dpt_cd,
				$inst_dpt_nm,
				$aprv_usr_cd,
				$aprv_usr_nm,
				$aprv_dpt_cd,
				$aprv_dpt_nm,
				$aprv_rsn,
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
				{$bom_ptn, "lot_issue_typ;oper_ptn;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;ln_stk_flg"},	// bom_ptn
				{$strg_loc_cd, "loc_nm;str_ln_tgt_flg;str_ln_cd;str_ln_cd_none_flg"},	// strg_loc_cd
				{$oper_loc_cd, "loc_nm;str_ln_tgt_flg"},	// oper_loc_cd
				{$oper_usr_cd, "usr_nm"},	// oper_usr_cd
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// inst_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "dpt_nm"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "mfg_flg;outsrc_flg;master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;true"},	// mfg_loc_cd
				{$bom_ptn, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_wg_cd;mfg_loc_cd"},	// bom_ptn
				{$strg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// strg_loc_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_cd;st_schd_dt"},	// oper_ptn
				{$inst_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;inst_dt;inst_usr_cd"},	// inst_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.MFG;aprv_dt;aprv_usr_cd"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "mfg_flg;outsrc_flg;master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wr_flg"},	// mfg_loc_cd
				{$bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd"},	// bom_ptn
				{$strg_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// strg_loc_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt"},	// oper_ptn
				{$inst_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"},	// inst_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd"}	// aprv_usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$mfg_str_ln_tgt_flg, "STR_LN"},	// mfg_str_ln_tgt_flg
				{$ln_stk_flg, "STR_LN"},	// ln_stk_flg
				{$strg_str_ln_tgt_flg, "STR_LN"},	// strg_str_ln_tgt_flg
				{$oper_str_ln_tgt_flg, "STR_LN"},	// oper_str_ln_tgt_flg
				{$oper_lower_yield, "YIELD"},	// oper_lower_yield
				{$oper_std_yield, "YIELD"},	// oper_std_yield
				{$oper_upper_yield, "YIELD"},	// oper_upper_yield
				{$itm_lower_yield, "YIELD"},	// itm_lower_yield
				{$itm_std_yield, "YIELD"},	// itm_std_yield
				{$itm_upper_yield, "YIELD"},	// itm_upper_yield
				{$mfg_aprv_sts_typ, "MFG_APRV"},	// mfg_aprv_sts_typ
				{$mfg_aprv_sts_typ_nm, "MFG_APRV"},	// mfg_aprv_sts_typ_nm
				{$aprv_tgt_flg, "MFG_APRV"},	// aprv_tgt_flg
				{$aprv_dt, "MFG_APRV"},	// aprv_dt
				{$aprv_tm, "MFG_APRV"},	// aprv_tm
				{$aprv_usr_dpt_p + ".usr_cd", "MFG_APRV"},	// aprv_usr_dpt_p.usr_cd
				{$aprv_usr_dpt_p + ".usr_nm", "MFG_APRV"},	// aprv_usr_dpt_p.usr_nm
				{$aprv_usr_dpt_p + ".dpt_cd", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_cd
				{$aprv_usr_dpt_p + ".dpt_nm", "MFG_APRV"},	// aprv_usr_dpt_p.dpt_nm
				{$aprv_rsn_p + ".txt", "MFG_APRV"},	// aprv_rsn_p.txt
				{$mfg_loc_wg_cd, "WG"},	// mfg_loc_wg_cd
				{$mfg_loc_wg_nm, "WG"},	// mfg_loc_wg_nm
				{$mfg_loc_site_cd, "SITE"},	// mfg_loc_site_cd
				{$mfg_loc_site_nm, "SITE"},	// mfg_loc_site_nm
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"}	// mfg_loc_grp_nm
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
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 1, $mfg_flg);
	}

	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 1, $mfg_flg, value);
	}


	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 2, $outsrc_flg);
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 2, $outsrc_flg, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 3, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 3, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 4, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 4, $mfg_sts_typ_nm, value);
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
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 7, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 7, $master_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 8, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 8, $itm_p, row);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 9, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 9, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 10, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 10, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 11, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 11, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 12, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 12, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 13, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 13, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 14, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 14, $sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 15, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 15, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 16, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 16, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 17, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 17, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 18, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 18, $sno4_mng_typ, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 19, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 19, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 20, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 20, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 21, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 22, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 22, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 23, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 23, $mfg_loc_nm, value);
	}


	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public boolean mfg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 24, $mfg_str_ln_tgt_flg);
	}

	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public void mfg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 24, $mfg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR mfg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 25, $mfg_str_ln_p);
	}
	
	public void mfg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 25, $mfg_str_ln_p, row);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 26, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 26, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 27, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 27, $sppl_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 28, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 28, $bom_ptn, value);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String lot_issue_typ() {
		return getConstString(offset + 29, $lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void lot_issue_typ(String value) {
		setConstString(offset + 29, $lot_issue_typ, value);
	}


	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public boolean ln_stk_flg() {
		return getConstBoolean(offset + 30, $ln_stk_flg);
	}

	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public void ln_stk_flg(boolean value) {
		setConstBoolean(offset + 30, $ln_stk_flg, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 31, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 31, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 32, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 32, $strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 33, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 33, $strg_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR strg_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 34, $strg_str_ln_p);
	}
	
	public void strg_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 34, $strg_str_ln_p, row);
	}


	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public MCNumber mst_yield_schd_qty() {
		return getConstNumber(offset + 35, $mst_yield_schd_qty);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void mst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 35, $mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void mst_yield_schd_qty(int value) {
		setConstNumber(offset + 35, $mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void mst_yield_schd_qty(long value) {
		setConstNumber(offset + 35, $mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void mst_yield_schd_qty(float value) {
		setConstNumber(offset + 35, $mst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Master) 出来高予定数量（マスタ）.<p>
	 *
	 */
	public void mst_yield_schd_qty(double value) {
		setConstNumber(offset + 35, $mst_yield_schd_qty, value);
	}


	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public MCNumber mst_mfg_inst_qty() {
		return getConstNumber(offset + 36, $mst_mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void mst_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 36, $mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void mst_mfg_inst_qty(int value) {
		setConstNumber(offset + 36, $mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void mst_mfg_inst_qty(long value) {
		setConstNumber(offset + 36, $mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void mst_mfg_inst_qty(float value) {
		setConstNumber(offset + 36, $mst_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. (Master) 製造指図数量（マスタ）.<p>
	 *
	 */
	public void mst_mfg_inst_qty(double value) {
		setConstNumber(offset + 36, $mst_mfg_inst_qty, value);
	}


	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public MCNumber mst_fxd_rqmt_qty() {
		return getConstNumber(offset + 37, $mst_fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void mst_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 37, $mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void mst_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 37, $mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void mst_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 37, $mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void mst_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 37, $mst_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. (Master) 固定必要数量（マスタ）.<p>
	 *
	 */
	public void mst_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 37, $mst_fxd_rqmt_qty, value);
	}


	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public boolean not_qty_rlt_flg() {
		return getConstBoolean(offset + 38, $not_qty_rlt_flg);
	}

	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public void not_qty_rlt_flg(boolean value) {
		setConstBoolean(offset + 38, $not_qty_rlt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $yield_qty_p);
	}
	
	public void yield_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $yield_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 41, $oper_base_unit_qty_p);
	}
	
	public void oper_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 41, $oper_base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR ord_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $ord_qty_p);
	}
	
	public void ord_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $ord_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR not_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $not_inst_qty_p);
	}
	
	public void not_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $not_inst_qty_p, row);
	}


	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public boolean ord_abort_flg() {
		return getConstBoolean(offset + 44, $ord_abort_flg);
	}

	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public void ord_abort_flg(boolean value) {
		setConstBoolean(offset + 44, $ord_abort_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 45, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 45, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 46, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 46, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 47, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 47, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 47, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 47, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 47, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 47, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 48, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 48, $base_unit_conv_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $oper_unit_qty_p);
	}
	
	public void oper_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $oper_unit_qty_p, row);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 50, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 50, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 50, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 50, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 50, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 50, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 51, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 51, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 51, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 51, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 51, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 51, $oper_conv_qty, value);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 52, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 52, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 53, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 53, $oper_unit_nm, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 54, $oper_unit_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 54, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 54, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 54, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 54, $oper_unit_dec_place, value);
	}


	/**
	 * Operation unit conversion rounding type 工程単位換算端数処理区分.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 55, $oper_unit_conv_rnd_typ);
	}

	/**
	 * Operation unit conversion rounding type 工程単位換算端数処理区分.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 55, $oper_unit_conv_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR rqst_dlv_rqst_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 56, $rqst_dlv_rqst_p);
	}
	
	public void rqst_dlv_rqst_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 56, $rqst_dlv_rqst_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_schd_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 57, $st_schd_p);
	}
	
	public void st_schd_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 57, $st_schd_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_schd_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 58, $end_schd_p);
	}
	
	public void end_schd_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 58, $end_schd_p, row);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 59, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 59, $oper_ptn, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 60, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 60, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 60, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 60, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 60, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 60, $disp_seq, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 61, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 61, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 62, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 62, $oper_loc_nm, value);
	}


	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public boolean oper_str_ln_tgt_flg() {
		return getConstBoolean(offset + 63, $oper_str_ln_tgt_flg);
	}

	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public void oper_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 63, $oper_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR oper_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 64, $oper_str_ln_p);
	}
	
	public void oper_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 64, $oper_str_ln_p, row);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 65, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 65, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 65, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 65, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 65, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 65, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 66, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 66, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 66, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 66, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 66, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 66, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 67, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 67, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 67, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 67, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 67, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 67, $oper_upper_yield, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 68, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 68, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 69, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 69, $oper_usr_nm, value);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 70, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 70, $oper_rsrc, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 71, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 71, $lot_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 72, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 72, $sno_p, row);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 73, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 73, $inst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR inst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 74, $inst_usr_dpt_p);
	}
	
	public void inst_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 74, $inst_usr_dpt_p, row);
	}


	/**
	 * Disable PO correction/cancellation 発注の訂正・取消を不可にする.<p>
	 *
	 */
	public boolean po_locked_flg() {
		return getConstBoolean(offset + 75, $po_locked_flg);
	}

	/**
	 * Disable PO correction/cancellation 発注の訂正・取消を不可にする.<p>
	 *
	 */
	public void po_locked_flg(boolean value) {
		setConstBoolean(offset + 75, $po_locked_flg, value);
	}


	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public boolean disp_po_locked_flg() {
		return getConstBoolean(offset + 76, $disp_po_locked_flg);
	}

	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public void disp_po_locked_flg(boolean value) {
		setConstBoolean(offset + 76, $disp_po_locked_flg, value);
	}


	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public boolean xfr_inst_del_enable_flg() {
		return getConstBoolean(offset + 77, $xfr_inst_del_enable_flg);
	}

	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public void xfr_inst_del_enable_flg(boolean value) {
		setConstBoolean(offset + 77, $xfr_inst_del_enable_flg, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 78, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 78, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 79, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 79, $intr_rmrks, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_intr_rmrks() {
		return getConstString(offset + 80, $oper_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_intr_rmrks(String value) {
		setConstString(offset + 80, $oper_intr_rmrks, value);
	}


	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 81, $oper_inst_rpt_rmrks);
	}

	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 81, $oper_inst_rpt_rmrks, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 82, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 82, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 83, $disp_pd);
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 83, $disp_pd, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 84, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 84, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 84, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 84, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 84, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 84, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 85, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 85, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 85, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 85, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 85, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 85, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 86, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 86, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 86, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 86, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 86, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 86, $itm_upper_yield, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 87, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 87, $mfg_inst_no, value);
	}


	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 88, $mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 88, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 88, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 88, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 88, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 88, $mfg_inst_rev, value);
	}


	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return getConstDate(offset + 89, $inst_prnt_tm);
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		setConstDate(offset + 89, $inst_prnt_tm, value);
	}


	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 90, $inst_prnt_flg);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 90, $inst_prnt_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 91, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 91, $inst_abort_flg, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 92, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 92, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 93, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 93, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_tgt_flg() {
		return getConstBoolean(offset + 94, $aprv_tgt_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_tgt_flg(boolean value) {
		setConstBoolean(offset + 94, $aprv_tgt_flg, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 95, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 95, $aprv_dt, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 96, $aprv_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 96, $aprv_tm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR aprv_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 97, $aprv_usr_dpt_p);
	}
	
	public void aprv_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 97, $aprv_usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5370.TxtR aprv_rsn_p(){
		return (mcframe.clientMAUB.MAUBP5370.TxtR) getConstInnerRow(offset + 98, $aprv_rsn_p);
	}
	
	public void aprv_rsn_p(mcframe.clientMAUB.MAUBP5370.TxtR row){
		setConstInnerRow(offset + 98, $aprv_rsn_p, row);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 99, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 99, $itm_mfg_inst_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 100, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 100, $itm_ord_no, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 101, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 101, $oper_ord_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 102, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 102, $oper_inst_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 103, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 103, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 104, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 104, $mfg_inst_unit_typ_nm, value);
	}


	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return getConstBoolean(offset + 105, $unschd_inst_flg);
	}

	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		setConstBoolean(offset + 105, $unschd_inst_flg, value);
	}


	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 106, $unschd_act_flg);
	}

	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 106, $unschd_act_flg, value);
	}


	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return getConstBoolean(offset + 107, $schd_chg_flg);
	}

	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		setConstBoolean(offset + 107, $schd_chg_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 108, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 108, $mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String mfg_loc_wg_nm() {
		return getConstString(offset + 109, $mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void mfg_loc_wg_nm(String value) {
		setConstString(offset + 109, $mfg_loc_wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 110, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 110, $mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_loc_site_nm() {
		return getConstString(offset + 111, $mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_loc_site_nm(String value) {
		setConstString(offset + 111, $mfg_loc_site_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 112, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 112, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 113, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 113, $mfg_loc_grp_nm, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 114, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 114, $po_d_no, value);
	}


	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public String po_aprv_sts_typ() {
		return getConstString(offset + 115, $po_aprv_sts_typ);
	}

	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public void po_aprv_sts_typ(String value) {
		setConstString(offset + 115, $po_aprv_sts_typ, value);
	}


	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public String po_aprv_sts_typ_nm() {
		return getConstString(offset + 116, $po_aprv_sts_typ_nm);
	}

	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public void po_aprv_sts_typ_nm(String value) {
		setConstString(offset + 116, $po_aprv_sts_typ_nm, value);
	}


	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public boolean po_auto_reg_flg() {
		return getConstBoolean(offset + 117, $po_auto_reg_flg);
	}

	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public void po_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 117, $po_auto_reg_flg, value);
	}


	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 118, $yield_oper_flg);
	}

	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 118, $yield_oper_flg, value);
	}


	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCNumber yield_oper_ratio() {
		return getConstNumber(offset + 119, $yield_oper_ratio);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(MCNumber value) {
		setConstNumber(offset + 119, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(int value) {
		setConstNumber(offset + 119, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(long value) {
		setConstNumber(offset + 119, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(float value) {
		setConstNumber(offset + 119, $yield_oper_ratio, value);
	}

	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public void yield_oper_ratio(double value) {
		setConstNumber(offset + 119, $yield_oper_ratio, value);
	}


	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 120, $oper_inst_grp);
	}

	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 120, $oper_inst_grp, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 121, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 121, $bkf_flg, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 122, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 122, $wk_cost_calc_flg, value);
	}


	/**
	 * Current MES 今回ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 123, $mes_flg);
	}

	/**
	 * Current MES 今回ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 123, $mes_flg, value);
	}


	/**
	 * Last MES 前回ＭＥＳ.<p>
	 *
	 */
	public boolean last_mes_flg() {
		return getConstBoolean(offset + 124, $last_mes_flg);
	}

	/**
	 * Last MES 前回ＭＥＳ.<p>
	 *
	 */
	public void last_mes_flg(boolean value) {
		setConstBoolean(offset + 124, $last_mes_flg, value);
	}


	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public boolean mes_tgt_flg() {
		return getConstBoolean(offset + 125, $mes_tgt_flg);
	}

	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public void mes_tgt_flg(boolean value) {
		setConstBoolean(offset + 125, $mes_tgt_flg, value);
	}


	/**
	 * Initial mfg. order (Operation unit) 初回製造指図（工程単位）.<p>
	 *
	 */
	public boolean frst_mfg_inst_flg() {
		return getConstBoolean(offset + 126, $frst_mfg_inst_flg);
	}

	/**
	 * Initial mfg. order (Operation unit) 初回製造指図（工程単位）.<p>
	 *
	 */
	public void frst_mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 126, $frst_mfg_inst_flg, value);
	}


	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char1() {
		return getConstString(offset + 127, $itm_mfg_inst_sub_char1);
	}

	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char1(String value) {
		setConstString(offset + 127, $itm_mfg_inst_sub_char1, value);
	}


	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char2() {
		return getConstString(offset + 128, $itm_mfg_inst_sub_char2);
	}

	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char2(String value) {
		setConstString(offset + 128, $itm_mfg_inst_sub_char2, value);
	}


	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char3() {
		return getConstString(offset + 129, $itm_mfg_inst_sub_char3);
	}

	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char3(String value) {
		setConstString(offset + 129, $itm_mfg_inst_sub_char3, value);
	}


	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 130, $mfg_inst_sub_char1);
	}

	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 130, $mfg_inst_sub_char1, value);
	}


	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 131, $mfg_inst_sub_char2);
	}

	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 131, $mfg_inst_sub_char2, value);
	}


	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 132, $mfg_inst_sub_char3);
	}

	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 132, $mfg_inst_sub_char3, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_inst_sub_char1() {
		return getConstString(offset + 133, $oper_inst_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_inst_sub_char1(String value) {
		setConstString(offset + 133, $oper_inst_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_inst_sub_char2() {
		return getConstString(offset + 134, $oper_inst_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_inst_sub_char2(String value) {
		setConstString(offset + 134, $oper_inst_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_inst_sub_char3() {
		return getConstString(offset + 135, $oper_inst_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_inst_sub_char3(String value) {
		setConstString(offset + 135, $oper_inst_sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 136, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 136, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 137, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 137, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 138, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 138, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 139, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 139, $itm_typ_d_nm, value);
	}


	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public boolean for_scheduler_frozen_flg() {
		return getConstBoolean(offset + 140, $for_scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public void for_scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 140, $for_scheduler_frozen_flg, value);
	}


	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 141, $scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 141, $scheduler_frozen_flg, value);
	}


	/**
	 * Scheduler frozen (Item) スケジューラ凍結（品目）.<p>
	 *
	 */
	public boolean scheduler_frozen_itm_flg() {
		return getConstBoolean(offset + 142, $scheduler_frozen_itm_flg);
	}

	/**
	 * Scheduler frozen (Item) スケジューラ凍結（品目）.<p>
	 *
	 */
	public void scheduler_frozen_itm_flg(boolean value) {
		setConstBoolean(offset + 142, $scheduler_frozen_itm_flg, value);
	}


	/**
	 * Scheduler frozen (Operation) スケジューラ凍結（工程）.<p>
	 *
	 */
	public boolean scheduler_frozen_oper_flg() {
		return getConstBoolean(offset + 143, $scheduler_frozen_oper_flg);
	}

	/**
	 * Scheduler frozen (Operation) スケジューラ凍結（工程）.<p>
	 *
	 */
	public void scheduler_frozen_oper_flg(boolean value) {
		setConstBoolean(offset + 143, $scheduler_frozen_oper_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 144, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 144, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 145, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 145, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 146, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 146, $sppl_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 147, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 147, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 148, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 148, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 149, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 149, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 150, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 150, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 151, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 151, $ins_ts, value);
	}


	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_ord_upd_cntr() {
		return getConstNumber(offset + 152, $itm_ord_upd_cntr);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(MCNumber value) {
		setConstNumber(offset + 152, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(int value) {
		setConstNumber(offset + 152, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(long value) {
		setConstNumber(offset + 152, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(float value) {
		setConstNumber(offset + 152, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(double value) {
		setConstNumber(offset + 152, $itm_ord_upd_cntr, value);
	}


	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_upd_cntr() {
		return getConstNumber(offset + 153, $itm_mfg_inst_upd_cntr);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 153, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 153, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 153, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 153, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 153, $itm_mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 154, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 154, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 154, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 154, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 154, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 154, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 155, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 155, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 156, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 156, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 157, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 157, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 158, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 158, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 159, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 159, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 160, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 160, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ_nm();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($itm_mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char1();
		}
		if ($itm_mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char2();
		}
		if ($itm_mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char3();
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char1();
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char2();
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char3();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return mst_yield_schd_qty();
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return mst_mfg_inst_qty();
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return mst_fxd_rqmt_qty();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			return not_qty_rlt_flg();
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($disp_po_locked_flg.equalsIgnoreCase(name)) {
			return disp_po_locked_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($aprv_tgt_flg.equalsIgnoreCase(name)) {
			return aprv_tgt_flg();
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($last_mes_flg.equalsIgnoreCase(name)) {
			return last_mes_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($frst_mfg_inst_flg.equalsIgnoreCase(name)) {
			return frst_mfg_inst_flg();
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return for_scheduler_frozen_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($scheduler_frozen_itm_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_itm_flg();
		}
		if ($scheduler_frozen_oper_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_oper_flg();
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ_nm();
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			return oper_inst_grp();
		}
		if ($itm_mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char1();
		}
		if ($itm_mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char2();
		}
		if ($itm_mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return itm_mfg_inst_sub_char3();
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char1();
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char2();
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char3();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			return mst_yield_schd_qty();
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			return mst_mfg_inst_qty();
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return mst_fxd_rqmt_qty();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
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
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			return yield_oper_ratio();
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			return not_qty_rlt_flg();
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($disp_po_locked_flg.equalsIgnoreCase(name)) {
			return disp_po_locked_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($aprv_tgt_flg.equalsIgnoreCase(name)) {
			return aprv_tgt_flg();
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($last_mes_flg.equalsIgnoreCase(name)) {
			return last_mes_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($frst_mfg_inst_flg.equalsIgnoreCase(name)) {
			return frst_mfg_inst_flg();
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return for_scheduler_frozen_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($scheduler_frozen_itm_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_itm_flg();
		}
		if ($scheduler_frozen_oper_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_oper_flg();
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			mfg_loc_site_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			po_aprv_sts_typ_nm(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($itm_mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char1(value);
			return;
		}
		if ($itm_mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char2(value);
			return;
		}
		if ($itm_mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char3(value);
			return;
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			mfg_inst_sub_char1(value);
			return;
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			mfg_inst_sub_char2(value);
			return;
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			mfg_inst_sub_char3(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
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
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			not_qty_rlt_flg(value);
			return;
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($disp_po_locked_flg.equalsIgnoreCase(name)) {
			disp_po_locked_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($aprv_tgt_flg.equalsIgnoreCase(name)) {
			aprv_tgt_flg(value);
			return;
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($last_mes_flg.equalsIgnoreCase(name)) {
			last_mes_flg(value);
			return;
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			mes_tgt_flg(value);
			return;
		}
		if ($frst_mfg_inst_flg.equalsIgnoreCase(name)) {
			frst_mfg_inst_flg(value);
			return;
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			for_scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_itm_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_itm_flg(value);
			return;
		}
		if ($scheduler_frozen_oper_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_oper_flg(value);
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			mfg_loc_site_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			po_aprv_sts_typ_nm(value);
			return;
		}
		if ($oper_inst_grp.equalsIgnoreCase(name)) {
			oper_inst_grp(value);
			return;
		}
		if ($itm_mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char1(value);
			return;
		}
		if ($itm_mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char2(value);
			return;
		}
		if ($itm_mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			itm_mfg_inst_sub_char3(value);
			return;
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			mfg_inst_sub_char1(value);
			return;
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			mfg_inst_sub_char2(value);
			return;
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			mfg_inst_sub_char3(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
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
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($mst_yield_schd_qty.equalsIgnoreCase(name)) {
			mst_yield_schd_qty(value);
			return;
		}
		if ($mst_mfg_inst_qty.equalsIgnoreCase(name)) {
			mst_mfg_inst_qty(value);
			return;
		}
		if ($mst_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			mst_fxd_rqmt_qty(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($yield_oper_ratio.equalsIgnoreCase(name)) {
			yield_oper_ratio(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
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
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($not_qty_rlt_flg.equalsIgnoreCase(name)) {
			not_qty_rlt_flg(value);
			return;
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($disp_po_locked_flg.equalsIgnoreCase(name)) {
			disp_po_locked_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($aprv_tgt_flg.equalsIgnoreCase(name)) {
			aprv_tgt_flg(value);
			return;
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($last_mes_flg.equalsIgnoreCase(name)) {
			last_mes_flg(value);
			return;
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			mes_tgt_flg(value);
			return;
		}
		if ($frst_mfg_inst_flg.equalsIgnoreCase(name)) {
			frst_mfg_inst_flg(value);
			return;
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			for_scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_itm_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_itm_flg(value);
			return;
		}
		if ($scheduler_frozen_oper_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_oper_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($mfg_str_ln_p.equalsIgnoreCase(name)) {
			return mfg_str_ln_p();
		}
		if ($strg_str_ln_p.equalsIgnoreCase(name)) {
			return strg_str_ln_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($yield_qty_p.equalsIgnoreCase(name)) {
			return yield_qty_p();
		}
		if ($oper_base_unit_qty_p.equalsIgnoreCase(name)) {
			return oper_base_unit_qty_p();
		}
		if ($ord_qty_p.equalsIgnoreCase(name)) {
			return ord_qty_p();
		}
		if ($not_inst_qty_p.equalsIgnoreCase(name)) {
			return not_inst_qty_p();
		}
		if ($oper_unit_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_qty_p();
		}
		if ($rqst_dlv_rqst_p.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_p();
		}
		if ($st_schd_p.equalsIgnoreCase(name)) {
			return st_schd_p();
		}
		if ($end_schd_p.equalsIgnoreCase(name)) {
			return end_schd_p();
		}
		if ($oper_str_ln_p.equalsIgnoreCase(name)) {
			return oper_str_ln_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			return inst_usr_dpt_p();
		}
		if ($aprv_usr_dpt_p.equalsIgnoreCase(name)) {
			return aprv_usr_dpt_p();
		}
		if ($aprv_rsn_p.equalsIgnoreCase(name)) {
			return aprv_rsn_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($mfg_str_ln_p.equalsIgnoreCase(name)) {
			mfg_str_ln_p(
				((MCContainerMeta) mfg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($strg_str_ln_p.equalsIgnoreCase(name)) {
			strg_str_ln_p(
				((MCContainerMeta) strg_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			inst_qty_p(
				((MCContainerMeta) inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($yield_qty_p.equalsIgnoreCase(name)) {
			yield_qty_p(
				((MCContainerMeta) yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_base_unit_qty_p.equalsIgnoreCase(name)) {
			oper_base_unit_qty_p(
				((MCContainerMeta) oper_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ord_qty_p.equalsIgnoreCase(name)) {
			ord_qty_p(
				((MCContainerMeta) ord_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($not_inst_qty_p.equalsIgnoreCase(name)) {
			not_inst_qty_p(
				((MCContainerMeta) not_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_qty_p.equalsIgnoreCase(name)) {
			oper_unit_qty_p(
				((MCContainerMeta) oper_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rqst_dlv_rqst_p.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_p(
				((MCContainerMeta) rqst_dlv_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($st_schd_p.equalsIgnoreCase(name)) {
			st_schd_p(
				((MCContainerMeta) st_schd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_schd_p.equalsIgnoreCase(name)) {
			end_schd_p(
				((MCContainerMeta) end_schd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($oper_str_ln_p.equalsIgnoreCase(name)) {
			oper_str_ln_p(
				((MCContainerMeta) oper_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($inst_usr_dpt_p.equalsIgnoreCase(name)) {
			inst_usr_dpt_p(
				((MCContainerMeta) inst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
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
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return mfg_str_ln_p().str_ln_cd();
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		mfg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return mfg_str_ln_p().str_ln_nm();
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		mfg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public boolean mfg_str_ln_cd_none_flg() {
		return mfg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public void mfg_str_ln_cd_none_flg(boolean value) {
		mfg_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return strg_str_ln_p().str_ln_cd();
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		strg_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return strg_str_ln_p().str_ln_nm();
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		strg_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return strg_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		strg_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return inst_qty_p().qty();
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return yield_qty_p().qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		yield_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		yield_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		yield_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		yield_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		yield_qty_p().qty(value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public MCNumber oper_base_unit_qty() {
		return oper_base_unit_qty_p().qty();
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(MCNumber value) {
		oper_base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(int value) {
		oper_base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(long value) {
		oper_base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(float value) {
		oper_base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(double value) {
		oper_base_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public MCNumber base_unit_ord_qty() {
		return ord_qty_p().qty();
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(MCNumber value) {
		ord_qty_p().qty(value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(int value) {
		ord_qty_p().qty(value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(long value) {
		ord_qty_p().qty(value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(float value) {
		ord_qty_p().qty(value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(double value) {
		ord_qty_p().qty(value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public MCNumber base_unit_not_inst_qty() {
		return not_inst_qty_p().qty();
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(MCNumber value) {
		not_inst_qty_p().qty(value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(int value) {
		not_inst_qty_p().qty(value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(long value) {
		not_inst_qty_p().qty(value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(float value) {
		not_inst_qty_p().qty(value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(double value) {
		not_inst_qty_p().qty(value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public MCNumber oper_unit_qty() {
		return oper_unit_qty_p().qty();
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(MCNumber value) {
		oper_unit_qty_p().qty(value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(int value) {
		oper_unit_qty_p().qty(value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(long value) {
		oper_unit_qty_p().qty(value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(float value) {
		oper_unit_qty_p().qty(value);
	}

	/**
	 * Operation unit qty. 工程単位数量.<p>
	 *
	 */
	public void oper_unit_qty(double value) {
		oper_unit_qty_p().qty(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return rqst_dlv_rqst_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		rqst_dlv_rqst_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm() {
		return rqst_dlv_rqst_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm(MCDate value) {
		rqst_dlv_rqst_p().hm(value);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return st_schd_p().ymd();
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		st_schd_p().ymd(value);
	}

	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return st_schd_p().hm();
	}

	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		st_schd_p().hm(value);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return end_schd_p().ymd();
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		end_schd_p().ymd(value);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return end_schd_p().hm();
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		end_schd_p().hm(value);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return oper_str_ln_p().str_ln_cd();
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		oper_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return oper_str_ln_p().str_ln_nm();
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		oper_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return oper_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		oper_str_ln_p().str_ln_cd_none_flg(value);
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

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return inst_usr_dpt_p().usr_cd();
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		inst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return inst_usr_dpt_p().usr_nm();
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		inst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return inst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		inst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return inst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		inst_usr_dpt_p().dpt_nm(value);
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

