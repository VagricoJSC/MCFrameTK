package mcframe.serverMSBC.MSBCL6000;

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
 * ブロック"MfgInstReg_Upd02_Hdr1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Upd02_Hdr1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public static final String $oper_base_unit_qty = "oper_base_unit_qty";
	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_tm = "rqst_dlv_rqst_tm";
	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
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
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
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
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public static final String $po_locked_flg = "po_locked_flg";
	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public static final String $ord_abort_flg = "ord_abort_flg";
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
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public static final String $oper_inst_rpt_rmrks = "oper_inst_rpt_rmrks";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $oper_intr_rmrks = "oper_intr_rmrks";
	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
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
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public static final String $oper_inst_grp = "oper_inst_grp";
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
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $inst_immed_prnt_flg = "inst_immed_prnt_flg";
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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Batch data No. バッチデータＮＯ.<p>
	 *
	 */
	public static final String $batch_data_no = "batch_data_no";
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
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
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $log_grp_cd = "log_grp_cd";
	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public static final String $same_mfg_inst_key = "same_mfg_inst_key";
	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public static final String $alloc_tgt_cnt = "alloc_tgt_cnt";
	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public static final String $alloc_success_cnt = "alloc_success_cnt";
	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public static final String $alloc_failure_cnt = "alloc_failure_cnt";
	/**
	 * Lot copy error ロット継承エラー.<p>
	 *
	 */
	public static final String $lot_inh_err_flg = "lot_inh_err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_base_unit_qty_META = createCommonMeta($oper_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta po_locked_flg_META = createCommonMeta($po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_abort_flg_META = createCommonMeta($ord_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta oper_intr_rmrks_META = createCommonMeta($oper_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_inst_grp_META = createCommonMeta($oper_inst_grp, mcframe.commonMA.meta.MA_META.OPER_INST_GRP);
	public static final MCMeta itm_mfg_inst_sub_char1_META = createCommonMeta($itm_mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char2_META = createCommonMeta($itm_mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta itm_mfg_inst_sub_char3_META = createCommonMeta($itm_mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta oper_inst_sub_char1_META = createCommonMeta($oper_inst_sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char2_META = createCommonMeta($oper_inst_sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR2);
	public static final MCMeta oper_inst_sub_char3_META = createCommonMeta($oper_inst_sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta inst_immed_prnt_flg_META = createCommonMeta($inst_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ord_upd_cntr_META = createCommonMeta($itm_ord_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_mfg_inst_upd_cntr_META = createCommonMeta($itm_mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta batch_data_no_META = createCommonMeta($batch_data_no, mcframe.commonMA.meta.MA_META.BATCH_DATA_NO);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta log_grp_cd_META = createCommonMeta($log_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta same_mfg_inst_key_META = createCommonMeta($same_mfg_inst_key, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_tgt_cnt_META = createCommonMeta($alloc_tgt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_success_cnt_META = createCommonMeta($alloc_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alloc_failure_cnt_META = createCommonMeta($alloc_failure_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_inh_err_flg_META = createCommonMeta($lot_inh_err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstReg_Upd02_Hdr1R> constMetas = new ConstMetaList<MfgInstReg_Upd02_Hdr1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			mfg_loc_cd_META,
			mfg_str_ln_cd_META,
			bom_ptn_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			base_unit_inst_qty_META,
			base_unit_yield_qty_META,
			oper_base_unit_qty_META,
			rqst_dlv_rqst_tm_META,
			st_schd_tm_META,
			end_schd_tm_META,
			oper_ptn_META,
			disp_seq_META,
			oper_loc_cd_META,
			oper_str_ln_cd_META,
			usr_cd_META,
			oper_rsrc_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			po_locked_flg_META,
			ord_abort_flg_META,
			inst_rpt_rmrks_META,
			intr_rmrks_META,
			oper_inst_rpt_rmrks_META,
			oper_intr_rmrks_META,
			disp_pd_META,
			bkf_flg_META,
			wk_cost_calc_flg_META,
			mes_flg_META,
			oper_inst_grp_META,
			itm_mfg_inst_sub_char1_META,
			itm_mfg_inst_sub_char2_META,
			itm_mfg_inst_sub_char3_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			oper_inst_sub_char1_META,
			oper_inst_sub_char2_META,
			oper_inst_sub_char3_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			itm_mfg_inst_no_META,
			itm_ord_no_META,
			oper_ord_no_META,
			oper_inst_no_META,
			inst_immed_prnt_flg_META,
			itm_ord_upd_cntr_META,
			itm_mfg_inst_upd_cntr_META,
			mfg_inst_upd_cntr_META,
			err_flg_META,
			rtn_sts_typ_META,
			batch_data_no_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			log_grp_cd_META,
			same_mfg_inst_key_META,
			alloc_tgt_cnt_META,
			alloc_success_cnt_META,
			alloc_failure_cnt_META,
			lot_inh_err_flg_META
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
	protected MfgInstReg_Upd02_Hdr1R_MC_A(ConstMetaList<? extends MfgInstReg_Upd02_Hdr1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_Hdr1R clone() {
		return (MfgInstReg_Upd02_Hdr1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_Hdr1R createInstance() {
		return (MfgInstReg_Upd02_Hdr1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Upd02_Hdr1R getValues(String... names) {
		return (MfgInstReg_Upd02_Hdr1R) super.getValues(names);
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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 1, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 1, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 2, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 2, $mfg_sts_typ_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 3, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 3, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 4, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 4, $mfg_str_ln_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 5, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 5, $bom_ptn, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 6, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 6, $strg_loc_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 7, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 7, $strg_str_ln_cd, value);
	}


	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 8, $base_unit_inst_qty);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 8, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 8, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 8, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 8, $base_unit_inst_qty, value);
	}


	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 9, $base_unit_yield_qty);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}


	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public MCNumber oper_base_unit_qty() {
		return getConstNumber(offset + 10, $oper_base_unit_qty);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $oper_base_unit_qty, value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(int value) {
		setConstNumber(offset + 10, $oper_base_unit_qty, value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(long value) {
		setConstNumber(offset + 10, $oper_base_unit_qty, value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(float value) {
		setConstNumber(offset + 10, $oper_base_unit_qty, value);
	}

	/**
	 * Base unit order qty. (Operation) 基準単位指図数量（工程）.<p>
	 *
	 */
	public void oper_base_unit_qty(double value) {
		setConstNumber(offset + 10, $oper_base_unit_qty, value);
	}


	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 11, $rqst_dlv_rqst_tm);
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 11, $rqst_dlv_rqst_tm, value);
	}


	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 12, $st_schd_tm);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 12, $st_schd_tm, value);
	}


	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 13, $end_schd_tm);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 13, $end_schd_tm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 14, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 14, $oper_ptn, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 15, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 16, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 16, $oper_loc_cd, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 17, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 17, $oper_str_ln_cd, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 18, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 18, $usr_cd, value);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 19, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 19, $oper_rsrc, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 20, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 20, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 21, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 21, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 22, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 22, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 23, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 23, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 24, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 24, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 25, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 25, $sno4, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 26, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 26, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 27, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 27, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 28, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 28, $inst_dpt_cd, value);
	}


	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public boolean po_locked_flg() {
		return getConstBoolean(offset + 29, $po_locked_flg);
	}

	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public void po_locked_flg(boolean value) {
		setConstBoolean(offset + 29, $po_locked_flg, value);
	}


	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public boolean ord_abort_flg() {
		return getConstBoolean(offset + 30, $ord_abort_flg);
	}

	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public void ord_abort_flg(boolean value) {
		setConstBoolean(offset + 30, $ord_abort_flg, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 31, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 31, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 32, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 32, $intr_rmrks, value);
	}


	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 33, $oper_inst_rpt_rmrks);
	}

	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 33, $oper_inst_rpt_rmrks, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_intr_rmrks() {
		return getConstString(offset + 34, $oper_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_intr_rmrks(String value) {
		setConstString(offset + 34, $oper_intr_rmrks, value);
	}


	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 35, $disp_pd);
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 35, $disp_pd, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 36, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 36, $bkf_flg, value);
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


	/**
	 * Current MES 今回ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 38, $mes_flg);
	}

	/**
	 * Current MES 今回ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 38, $mes_flg, value);
	}


	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public String oper_inst_grp() {
		return getConstString(offset + 39, $oper_inst_grp);
	}

	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public void oper_inst_grp(String value) {
		setConstString(offset + 39, $oper_inst_grp, value);
	}


	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char1() {
		return getConstString(offset + 40, $itm_mfg_inst_sub_char1);
	}

	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char1(String value) {
		setConstString(offset + 40, $itm_mfg_inst_sub_char1, value);
	}


	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char2() {
		return getConstString(offset + 41, $itm_mfg_inst_sub_char2);
	}

	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char2(String value) {
		setConstString(offset + 41, $itm_mfg_inst_sub_char2, value);
	}


	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char3() {
		return getConstString(offset + 42, $itm_mfg_inst_sub_char3);
	}

	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char3(String value) {
		setConstString(offset + 42, $itm_mfg_inst_sub_char3, value);
	}


	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 43, $mfg_inst_sub_char1);
	}

	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 43, $mfg_inst_sub_char1, value);
	}


	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 44, $mfg_inst_sub_char2);
	}

	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 44, $mfg_inst_sub_char2, value);
	}


	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 45, $mfg_inst_sub_char3);
	}

	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 45, $mfg_inst_sub_char3, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_inst_sub_char1() {
		return getConstString(offset + 46, $oper_inst_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_inst_sub_char1(String value) {
		setConstString(offset + 46, $oper_inst_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_inst_sub_char2() {
		return getConstString(offset + 47, $oper_inst_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_inst_sub_char2(String value) {
		setConstString(offset + 47, $oper_inst_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_inst_sub_char3() {
		return getConstString(offset + 48, $oper_inst_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_inst_sub_char3(String value) {
		setConstString(offset + 48, $oper_inst_sub_char3, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 49, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 49, $mfg_inst_no, value);
	}


	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 50, $mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 50, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 50, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 50, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 50, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 50, $mfg_inst_rev, value);
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
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 52, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 52, $itm_ord_no, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 53, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 53, $oper_ord_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 54, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 54, $oper_inst_no, value);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean inst_immed_prnt_flg() {
		return getConstBoolean(offset + 55, $inst_immed_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void inst_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 55, $inst_immed_prnt_flg, value);
	}


	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_ord_upd_cntr() {
		return getConstNumber(offset + 56, $itm_ord_upd_cntr);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(MCNumber value) {
		setConstNumber(offset + 56, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(int value) {
		setConstNumber(offset + 56, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(long value) {
		setConstNumber(offset + 56, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(float value) {
		setConstNumber(offset + 56, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(double value) {
		setConstNumber(offset + 56, $itm_ord_upd_cntr, value);
	}


	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_upd_cntr() {
		return getConstNumber(offset + 57, $itm_mfg_inst_upd_cntr);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 57, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 57, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 57, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 57, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 57, $itm_mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 58, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 58, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 58, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 58, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 58, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 58, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 59, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 59, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 60, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 60, $rtn_sts_typ, value);
	}


	/**
	 * Batch data No. バッチデータＮＯ.<p>
	 *
	 */
	public String batch_data_no() {
		return getConstString(offset + 61, $batch_data_no);
	}

	/**
	 * Batch data No. バッチデータＮＯ.<p>
	 *
	 */
	public void batch_data_no(String value) {
		setConstString(offset + 61, $batch_data_no, value);
	}


	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 62, $batch_log_no);
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 62, $batch_log_no, value);
	}


	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 63, $log_sub_key1);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 63, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 63, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 63, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 63, $log_sub_key1, value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 63, $log_sub_key1, value);
	}


	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 64, $log_sub_key2);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 64, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 64, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 64, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 64, $log_sub_key2, value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 64, $log_sub_key2, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 65, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 65, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 66, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 66, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 67, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 67, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 68, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 68, $itm_sub3, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String log_grp_cd() {
		return getConstString(offset + 69, $log_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void log_grp_cd(String value) {
		setConstString(offset + 69, $log_grp_cd, value);
	}


	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public MCNumber same_mfg_inst_key() {
		return getConstNumber(offset + 70, $same_mfg_inst_key);
	}

	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public void same_mfg_inst_key(MCNumber value) {
		setConstNumber(offset + 70, $same_mfg_inst_key, value);
	}

	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public void same_mfg_inst_key(int value) {
		setConstNumber(offset + 70, $same_mfg_inst_key, value);
	}

	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public void same_mfg_inst_key(long value) {
		setConstNumber(offset + 70, $same_mfg_inst_key, value);
	}

	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public void same_mfg_inst_key(float value) {
		setConstNumber(offset + 70, $same_mfg_inst_key, value);
	}

	/**
	 * Same mfg. order key 同一製造指図キー.<p>
	 *
	 */
	public void same_mfg_inst_key(double value) {
		setConstNumber(offset + 70, $same_mfg_inst_key, value);
	}


	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public MCNumber alloc_tgt_cnt() {
		return getConstNumber(offset + 71, $alloc_tgt_cnt);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(MCNumber value) {
		setConstNumber(offset + 71, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(int value) {
		setConstNumber(offset + 71, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(long value) {
		setConstNumber(offset + 71, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(float value) {
		setConstNumber(offset + 71, $alloc_tgt_cnt, value);
	}

	/**
	 * Number of allocatable items 引当対象件数.<p>
	 *
	 */
	public void alloc_tgt_cnt(double value) {
		setConstNumber(offset + 71, $alloc_tgt_cnt, value);
	}


	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public MCNumber alloc_success_cnt() {
		return getConstNumber(offset + 72, $alloc_success_cnt);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(MCNumber value) {
		setConstNumber(offset + 72, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(int value) {
		setConstNumber(offset + 72, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(long value) {
		setConstNumber(offset + 72, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(float value) {
		setConstNumber(offset + 72, $alloc_success_cnt, value);
	}

	/**
	 * Number of allocation succeeded 引当成功件数.<p>
	 *
	 */
	public void alloc_success_cnt(double value) {
		setConstNumber(offset + 72, $alloc_success_cnt, value);
	}


	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public MCNumber alloc_failure_cnt() {
		return getConstNumber(offset + 73, $alloc_failure_cnt);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(MCNumber value) {
		setConstNumber(offset + 73, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(int value) {
		setConstNumber(offset + 73, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(long value) {
		setConstNumber(offset + 73, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(float value) {
		setConstNumber(offset + 73, $alloc_failure_cnt, value);
	}

	/**
	 * Number of allocation failures 引当失敗件数.<p>
	 *
	 */
	public void alloc_failure_cnt(double value) {
		setConstNumber(offset + 73, $alloc_failure_cnt, value);
	}


	/**
	 * Lot copy error ロット継承エラー.<p>
	 *
	 */
	public boolean lot_inh_err_flg() {
		return getConstBoolean(offset + 74, $lot_inh_err_flg);
	}

	/**
	 * Lot copy error ロット継承エラー.<p>
	 *
	 */
	public void lot_inh_err_flg(boolean value) {
		setConstBoolean(offset + 74, $lot_inh_err_flg, value);
	}


	public String getString(String name) {
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($log_grp_cd.equalsIgnoreCase(name)) {
			return log_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			return oper_base_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			return same_mfg_inst_key();
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			return alloc_tgt_cnt();
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			return alloc_success_cnt();
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			return alloc_failure_cnt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
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
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($lot_inh_err_flg.equalsIgnoreCase(name)) {
			return lot_inh_err_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($log_grp_cd.equalsIgnoreCase(name)) {
			return log_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			return oper_base_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			return same_mfg_inst_key();
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			return alloc_tgt_cnt();
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			return alloc_success_cnt();
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			return alloc_failure_cnt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
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
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($lot_inh_err_flg.equalsIgnoreCase(name)) {
			return lot_inh_err_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($log_grp_cd.equalsIgnoreCase(name)) {
			log_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
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
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($lot_inh_err_flg.equalsIgnoreCase(name)) {
			lot_inh_err_flg(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
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
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($log_grp_cd.equalsIgnoreCase(name)) {
			log_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($oper_base_unit_qty.equalsIgnoreCase(name)) {
			oper_base_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
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
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($same_mfg_inst_key.equalsIgnoreCase(name)) {
			same_mfg_inst_key(value);
			return;
		}
		if ($alloc_tgt_cnt.equalsIgnoreCase(name)) {
			alloc_tgt_cnt(value);
			return;
		}
		if ($alloc_success_cnt.equalsIgnoreCase(name)) {
			alloc_success_cnt(value);
			return;
		}
		if ($alloc_failure_cnt.equalsIgnoreCase(name)) {
			alloc_failure_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
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
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($lot_inh_err_flg.equalsIgnoreCase(name)) {
			lot_inh_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

