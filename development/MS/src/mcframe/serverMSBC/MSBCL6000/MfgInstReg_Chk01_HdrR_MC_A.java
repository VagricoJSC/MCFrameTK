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
 * ブロック"MfgInstReg_Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public static final String $mfg_inst_data_crud_typ = "mfg_inst_data_crud_typ";
	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public static final String $itm_mfg_inst_data_crud_typ = "itm_mfg_inst_data_crud_typ";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
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
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public static final String $mfg_str_ln_tgt_flg = "mfg_str_ln_tgt_flg";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $strg_str_ln_tgt_flg = "strg_str_ln_tgt_flg";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public static final String $inpt_itm_add_flg = "inpt_itm_add_flg";
	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public static final String $inpt_itm_del_flg = "inpt_itm_del_flg";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $lot_issue_typ = "lot_issue_typ";
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
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
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
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public static final String $po_locked_flg = "po_locked_flg";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
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
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public static final String $inst_immed_prnt_flg = "inst_immed_prnt_flg";
	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public static final String $chg_list_immed_prnt_flg = "chg_list_immed_prnt_flg";
	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public static final String $xfr_inst_del_enable_flg = "xfr_inst_del_enable_flg";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public static final String $frst_mfg_inst_no = "frst_mfg_inst_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
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
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public static final String $base_unit_ord_qty = "base_unit_ord_qty";
	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public static final String $base_unit_not_inst_qty = "base_unit_not_inst_qty";
	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public static final String $ord_abort_flg = "ord_abort_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_wg_cd = "mfg_loc_wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_site_cd = "mfg_loc_site_cd";
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
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public static final String $inst_rec_issue_flg = "inst_rec_issue_flg";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public static final String $po_auto_reg_flg = "po_auto_reg_flg";
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public static final String $po_schd_data_crud_typ = "po_schd_data_crud_typ";
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
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public static final String $no_mfg_aprv_flg = "no_mfg_aprv_flg";
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mfg_aprv_role_cd = "mfg_aprv_role_cd";
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
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
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public static final String $old_mfg_aprv_sts_typ = "old_mfg_aprv_sts_typ";
	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public static final String $old_aprv_flg = "old_aprv_flg";
	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public static final String $old_mfg_aprv_role_cd = "old_mfg_aprv_role_cd";
	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public static final String $old_inst_dt = "old_inst_dt";
	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public static final String $old_lot_no = "old_lot_no";
	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public static final String $old_sublot_no = "old_sublot_no";
	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public static final String $old_bom_ptn = "old_bom_ptn";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public static final String $old_sum_inst_qty = "old_sum_inst_qty";
	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public static final String $can_itm_mfg_inst_del_flg = "can_itm_mfg_inst_del_flg";
	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	/**
	 * Non-initial mfg. order entry (Operation unit) 初回製造指図以外の登録（工程単位）.<p>
	 *
	 */
	public static final String $not_frst_inst_reg_oper_flg = "not_frst_inst_reg_oper_flg";
	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public static final String $comp_dt_from_oper_flg = "comp_dt_from_oper_flg";
	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public static final String $is_src_alloc_flg = "is_src_alloc_flg";
	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public static final String $old_mfg_inst_rev = "old_mfg_inst_rev";
	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";


	public static final MCMeta mfg_inst_data_crud_typ_META = createCommonMeta($mfg_inst_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta itm_mfg_inst_data_crud_typ_META = createCommonMeta($itm_mfg_inst_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
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
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_str_ln_tgt_flg_META = createCommonMeta($mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta inpt_itm_add_flg_META = createCommonMeta($inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_del_flg_META = createCommonMeta($inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_issue_typ_META = createCommonMeta($lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta po_locked_flg_META = createCommonMeta($po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta inst_prnt_tm_META = createCommonMeta($inst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_immed_prnt_flg_META = createCommonMeta($inst_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chg_list_immed_prnt_flg_META = createCommonMeta($chg_list_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_inst_del_enable_flg_META = createCommonMeta($xfr_inst_del_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta frst_mfg_inst_no_META = createCommonMeta($frst_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta unschd_inst_flg_META = createCommonMeta($unschd_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_chg_flg_META = createCommonMeta($schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_ord_qty_META = createCommonMeta($base_unit_ord_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_not_inst_qty_META = createCommonMeta($base_unit_not_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ord_abort_flg_META = createCommonMeta($ord_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_site_cd_META = createCommonMeta($mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta inst_rec_issue_flg_META = createCommonMeta($inst_rec_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_auto_reg_flg_META = createCommonMeta($po_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta po_schd_data_crud_typ_META = createCommonMeta($po_schd_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta itm_mfg_inst_sub_char1_META = createCommonMeta($itm_mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char2_META = createCommonMeta($itm_mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta itm_mfg_inst_sub_char3_META = createCommonMeta($itm_mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mfg_aprv_flg_META = createCommonMeta($no_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_role_cd_META = createCommonMeta($mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
	public static final MCMeta itm_ord_upd_cntr_META = createCommonMeta($itm_ord_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_mfg_inst_upd_cntr_META = createCommonMeta($itm_mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_aprv_sts_typ_META = createCommonMeta($old_mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta old_aprv_flg_META = createCommonMeta($old_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_mfg_aprv_role_cd_META = createCommonMeta($old_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta old_inst_dt_META = createCommonMeta($old_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_lot_no_META = createCommonMeta($old_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta old_sublot_no_META = createCommonMeta($old_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta old_bom_ptn_META = createCommonMeta($old_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_sum_inst_qty_META = createCommonMeta($old_sum_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta can_itm_mfg_inst_del_flg_META = createCommonMeta($can_itm_mfg_inst_del_flg, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_reg_oper_flg_META = createCommonMeta($not_frst_inst_reg_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_dt_from_oper_flg_META = createCommonMeta($comp_dt_from_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_alloc_flg_META = createCommonMeta($is_src_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_mfg_inst_rev_META = createCommonMeta($old_mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);

	protected static final ConstMetaList<MfgInstReg_Chk01_HdrR> constMetas = new ConstMetaList<MfgInstReg_Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_data_crud_typ_META,
			itm_mfg_inst_data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			mfg_mtd_typ_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
			master_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
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
			mfg_loc_cd_META,
			mfg_str_ln_tgt_flg_META,
			sppl_cd_META,
			maker_cd_META,
			strg_loc_cd_META,
			strg_str_ln_tgt_flg_META,
			bom_ptn_META,
			inpt_itm_add_flg_META,
			inpt_itm_del_flg_META,
			lot_issue_typ_META,
			base_unit_inst_qty_META,
			base_unit_yield_qty_META,
			base_unit_cd_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			rqst_dlv_rqst_tm_META,
			st_schd_tm_META,
			end_schd_tm_META,
			oper_ptn_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			mfg_str_ln_cd_META,
			strg_str_ln_cd_META,
			po_locked_flg_META,
			inst_abort_flg_META,
			inst_rpt_rmrks_META,
			intr_rmrks_META,
			inst_po_cnt_rmrks_META,
			disp_pd_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			inst_prnt_tm_META,
			inst_prnt_flg_META,
			inst_immed_prnt_flg_META,
			chg_list_immed_prnt_flg_META,
			xfr_inst_del_enable_flg_META,
			itm_mfg_inst_no_META,
			frst_mfg_inst_no_META,
			io_schd_pr_no_META,
			itm_ord_no_META,
			mfg_inst_unit_typ_META,
			unschd_inst_flg_META,
			unschd_act_flg_META,
			schd_chg_flg_META,
			base_unit_ord_qty_META,
			base_unit_not_inst_qty_META,
			ord_abort_flg_META,
			mfg_loc_wg_cd_META,
			mfg_loc_site_cd_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			inst_rec_issue_flg_META,
			po_d_no_META,
			po_auto_reg_flg_META,
			po_schd_src_typ_META,
			po_schd_src_no_META,
			po_schd_data_crud_typ_META,
			itm_mfg_inst_sub_char1_META,
			itm_mfg_inst_sub_char2_META,
			itm_mfg_inst_sub_char3_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			aprv_flg_META,
			no_mfg_aprv_flg_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_role_cd_META,
			aprv_dt_META,
			aprv_dpt_cd_META,
			aprv_usr_cd_META,
			aprv_tm_META,
			aprv_rsn_META,
			itm_ord_upd_cntr_META,
			itm_mfg_inst_upd_cntr_META,
			mfg_inst_upd_cntr_META,
			old_mfg_sts_typ_META,
			old_mfg_aprv_sts_typ_META,
			old_aprv_flg_META,
			old_mfg_aprv_role_cd_META,
			old_inst_dt_META,
			old_lot_no_META,
			old_sublot_no_META,
			old_bom_ptn_META,
			old_inst_abort_flg_META,
			old_sum_inst_qty_META,
			can_itm_mfg_inst_del_flg_META,
			upd_cntr_chk_flg_META,
			is_src_batch_flg_META,
			lst_reg_flg_META,
			not_frst_inst_can_flg_META,
			not_frst_inst_reg_oper_flg_META,
			comp_dt_from_oper_flg_META,
			is_src_alloc_flg_META,
			old_mfg_inst_rev_META,
			itm_ord_sts_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$mfg_mtd_typ, "E"},	// mfg_mtd_typ
				{$mfg_sts_typ, "E"},	// mfg_sts_typ
				{$master_dt, "E"},	// master_dt
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$strg_loc_cd, "E"},	// strg_loc_cd
				{$bom_ptn, "E"},	// bom_ptn
				{$base_unit_inst_qty, "E"},	// base_unit_inst_qty
				{$base_unit_yield_qty, "E"},	// base_unit_yield_qty
				{$st_schd_tm, "E"},	// st_schd_tm
				{$end_schd_tm, "E"},	// end_schd_tm
				{$oper_ptn, "E"}	// oper_ptn
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$base_unit_inst_qty, "positive"},	// base_unit_inst_qty
				{$base_unit_yield_qty, "positive"}	// base_unit_yield_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$rqst_dlv_rqst_tm, "rqst_end:AF"},	// rqst_dlv_rqst_tm
				{$st_schd_tm, "st_end:BF"},	// st_schd_tm
				{$end_schd_tm, "st_end:AF,rqst_end:BF"}	// end_schd_tm
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$mfg_inst_no, "E"}	// mfg_inst_no
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$mfg_loc_cd, "MA.MAUAL0010.Loc"},	// mfg_loc_cd
				{$strg_loc_cd, "MA.MAUAL0010.Loc"},	// strg_loc_cd
				{$bom_ptn, "MS.MSUAL0040.ItmDtlBomPtn"},	// bom_ptn
				{$inst_usr_cd, "MA.MAUAL0010.Usr"},	// inst_usr_cd
				{$inst_dpt_cd, "MA.MAUAL0010.Dpt"},	// inst_dpt_cd
				{$oper_ptn, "MA.MAUAL0010.ItmOper"},	// oper_ptn
				{$mfg_str_ln_cd, "MA.MAUAL0010.StrLn"},	// mfg_str_ln_cd
				{$strg_str_ln_cd, "MA.MAUAL0010.StrLn"}	// strg_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;base_unit_cd;base_unit_dec_place;base_unit_conv_rnd_typ"},	// itm_sub3
				{$mfg_loc_cd, "mfg_str_ln_tgt_flg;mfg_loc_wg_cd;mfg_loc_site_cd;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$strg_loc_cd, "strg_str_ln_tgt_flg"},	// strg_loc_cd
				{$bom_ptn, "lot_issue_typ;mst_yield_schd_qty;mst_mfg_inst_qty;mst_fxd_rqmt_qty;ln_stk_flg;inst_rec_issue_flg;no_mfg_aprv_flg;itm_lower_yield;itm_std_yield;itm_upper_yield;inpt_itm_add_flg;inpt_itm_del_flg;mfg_inst_unit_typ"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "lot_mng_typ;lot_no_typ;lot_no_ptn_cd;sublot_mng_typ;sublot_no_typ;sublot_no_ptn_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;dec_place;rnd_typ"},	// itm_sub3
				{$mfg_loc_cd, "str_ln_tgt_flg;wg_cd;site_cd;sppl_cd;maker_cd"},	// mfg_loc_cd
				{$strg_loc_cd, "str_ln_tgt_flg"},	// strg_loc_cd
				{$bom_ptn, "lot_issue_typ;yield_schd_qty;mfg_inst_qty;fxd_rqmt_qty;ln_stk_flg;inst_rec_issue_flg;no_mfg_aprv_flg;itm_lower_yield;itm_std_yield;itm_upper_yield;inpt_itm_add_flg;inpt_itm_del_flg;mfg_inst_unit_typ"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// mfg_loc_cd
				{$strg_loc_cd, "mfg_loc_wg_cd"},	// strg_loc_cd
				{$bom_ptn, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_wg_cd;mfg_loc_cd;MAC_STR.NULL_VAL;MAC_STR.NULL_VAL;MAC_STR.NULL_VAL"},	// bom_ptn
				{$inst_usr_cd, "inst_dt"},	// inst_usr_cd
				{$inst_dpt_cd, "MAC_DPT_IS_SRCH_TYP.MFG;inst_dt;inst_usr_cd"},	// inst_dpt_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_cd;st_schd_tm;true"},	// oper_ptn
				{$mfg_str_ln_cd, "mfg_loc_cd;true"},	// mfg_str_ln_cd
				{$strg_str_ln_cd, "strg_loc_cd;true"}	// strg_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$mfg_loc_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// mfg_loc_cd
				{$strg_loc_cd, "wg_cd"},	// strg_loc_cd
				{$bom_ptn, "dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd;sppl_cd;maker_cd;rqst_loc_cd"},	// bom_ptn
				{$inst_usr_cd, "dt"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_is_srch_typ;dt;usr_cd"},	// inst_dpt_cd
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt;mode_nullval_flg"},	// oper_ptn
				{$mfg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// mfg_str_ln_cd
				{$strg_str_ln_cd, "loc_cd;mode_nullval_flg"}	// strg_str_ln_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$mfg_mtd_typ, "MSC_MFG_MTD_TYP"},	// mfg_mtd_typ
				{$mfg_sts_typ, "MSC_MFG_STS_TYP"}	// mfg_sts_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$oper_ptn, "E"},	// oper_ptn
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$mfg_str_ln_cd, "E"},	// mfg_str_ln_cd
				{$strg_str_ln_cd, "E"}	// strg_str_ln_cd
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
	protected MfgInstReg_Chk01_HdrR_MC_A(ConstMetaList<? extends MfgInstReg_Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_HdrR clone() {
		return (MfgInstReg_Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_HdrR createInstance() {
		return (MfgInstReg_Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_HdrR getValues(String... names) {
		return (MfgInstReg_Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public String mfg_inst_data_crud_typ() {
		return getConstString(offset + 0, $mfg_inst_data_crud_typ);
	}

	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public void mfg_inst_data_crud_typ(String value) {
		setConstString(offset + 0, $mfg_inst_data_crud_typ, value);
	}


	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public String itm_mfg_inst_data_crud_typ() {
		return getConstString(offset + 1, $itm_mfg_inst_data_crud_typ);
	}

	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public void itm_mfg_inst_data_crud_typ(String value) {
		setConstString(offset + 1, $itm_mfg_inst_data_crud_typ, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 4, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 4, $rtn_sts_typ, value);
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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 6, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 6, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 7, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 7, $mfg_sts_typ_nm, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 8, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 8, $master_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 10, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 10, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 11, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 11, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 13, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 13, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 14, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 14, $lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String lot_no_ptn_cd() {
		return getConstString(offset + 15, $lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void lot_no_ptn_cd(String value) {
		setConstString(offset + 15, $lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 16, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 16, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 17, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 17, $sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String sublot_no_ptn_cd() {
		return getConstString(offset + 18, $sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void sublot_no_ptn_cd(String value) {
		setConstString(offset + 18, $sublot_no_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 19, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 19, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 20, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 20, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 21, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 21, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 22, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 22, $sno4_mng_typ, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 23, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 23, $mfg_loc_cd, value);
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


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 25, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 25, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 26, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 26, $maker_cd, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 27, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 27, $strg_loc_cd, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 28, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 28, $strg_str_ln_tgt_flg, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 29, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 29, $bom_ptn, value);
	}


	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 30, $inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 30, $inpt_itm_add_flg, value);
	}


	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 31, $inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 31, $inpt_itm_del_flg, value);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String lot_issue_typ() {
		return getConstString(offset + 32, $lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void lot_issue_typ(String value) {
		setConstString(offset + 32, $lot_issue_typ, value);
	}


	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 33, $base_unit_inst_qty);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 33, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 33, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 33, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 33, $base_unit_inst_qty, value);
	}


	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 34, $base_unit_yield_qty);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 34, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 34, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 34, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 34, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 34, $base_unit_yield_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 35, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 35, $base_unit_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 36, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 36, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 37, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 37, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 38, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 38, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 39, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 39, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 40, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 40, $inst_dpt_cd, value);
	}


	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 41, $rqst_dlv_rqst_tm);
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 41, $rqst_dlv_rqst_tm, value);
	}


	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 42, $st_schd_tm);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 42, $st_schd_tm, value);
	}


	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 43, $end_schd_tm);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 43, $end_schd_tm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 44, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 44, $oper_ptn, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 45, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 45, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 46, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 46, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 47, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 47, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 48, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 48, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 49, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 49, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 50, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 50, $sno4, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 51, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 51, $mfg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 52, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 52, $strg_str_ln_cd, value);
	}


	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public boolean po_locked_flg() {
		return getConstBoolean(offset + 53, $po_locked_flg);
	}

	/**
	 * PO correction/cancel disallowed 発注訂正・取消不可.<p>
	 *
	 */
	public void po_locked_flg(boolean value) {
		setConstBoolean(offset + 53, $po_locked_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 54, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 54, $inst_abort_flg, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 55, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 55, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 56, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 56, $intr_rmrks, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 57, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 57, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 58, $disp_pd);
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 58, $disp_pd, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 59, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 59, $mfg_inst_no, value);
	}


	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 60, $mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 60, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 60, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 60, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 60, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 60, $mfg_inst_rev, value);
	}


	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return getConstDate(offset + 61, $inst_prnt_tm);
	}

	/**
	 * Order sheet issued date and time 指図書発行日時.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		setConstDate(offset + 61, $inst_prnt_tm, value);
	}


	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 62, $inst_prnt_flg);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 62, $inst_prnt_flg, value);
	}


	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public boolean inst_immed_prnt_flg() {
		return getConstBoolean(offset + 63, $inst_immed_prnt_flg);
	}

	/**
	 * Order sheet immediate issue 指図書即時発行.<p>
	 *
	 */
	public void inst_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 63, $inst_immed_prnt_flg, value);
	}


	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public boolean chg_list_immed_prnt_flg() {
		return getConstBoolean(offset + 64, $chg_list_immed_prnt_flg);
	}

	/**
	 * Change list immediate issue 変更リスト即時発行.<p>
	 *
	 */
	public void chg_list_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 64, $chg_list_immed_prnt_flg, value);
	}


	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public boolean xfr_inst_del_enable_flg() {
		return getConstBoolean(offset + 65, $xfr_inst_del_enable_flg);
	}

	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public void xfr_inst_del_enable_flg(boolean value) {
		setConstBoolean(offset + 65, $xfr_inst_del_enable_flg, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 66, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 66, $itm_mfg_inst_no, value);
	}


	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public String frst_mfg_inst_no() {
		return getConstString(offset + 67, $frst_mfg_inst_no);
	}

	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public void frst_mfg_inst_no(String value) {
		setConstString(offset + 67, $frst_mfg_inst_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 68, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 68, $io_schd_pr_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 69, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 69, $itm_ord_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 70, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 70, $mfg_inst_unit_typ, value);
	}


	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return getConstBoolean(offset + 71, $unschd_inst_flg);
	}

	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		setConstBoolean(offset + 71, $unschd_inst_flg, value);
	}


	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 72, $unschd_act_flg);
	}

	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 72, $unschd_act_flg, value);
	}


	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return getConstBoolean(offset + 73, $schd_chg_flg);
	}

	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		setConstBoolean(offset + 73, $schd_chg_flg, value);
	}


	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public MCNumber base_unit_ord_qty() {
		return getConstNumber(offset + 74, $base_unit_ord_qty);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(MCNumber value) {
		setConstNumber(offset + 74, $base_unit_ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(int value) {
		setConstNumber(offset + 74, $base_unit_ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(long value) {
		setConstNumber(offset + 74, $base_unit_ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(float value) {
		setConstNumber(offset + 74, $base_unit_ord_qty, value);
	}

	/**
	 * Order qty. オーダ数量.<p>
	 *
	 */
	public void base_unit_ord_qty(double value) {
		setConstNumber(offset + 74, $base_unit_ord_qty, value);
	}


	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public MCNumber base_unit_not_inst_qty() {
		return getConstNumber(offset + 75, $base_unit_not_inst_qty);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(MCNumber value) {
		setConstNumber(offset + 75, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(int value) {
		setConstNumber(offset + 75, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(long value) {
		setConstNumber(offset + 75, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(float value) {
		setConstNumber(offset + 75, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(double value) {
		setConstNumber(offset + 75, $base_unit_not_inst_qty, value);
	}


	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public boolean ord_abort_flg() {
		return getConstBoolean(offset + 76, $ord_abort_flg);
	}

	/**
	 * Cancel remaining unordered 未指図打切.<p>
	 *
	 */
	public void ord_abort_flg(boolean value) {
		setConstBoolean(offset + 76, $ord_abort_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 77, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 77, $mfg_loc_wg_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 78, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 78, $mfg_loc_site_cd, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 79, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 79, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 80, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 80, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 81, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 81, $itm_upper_yield, value);
	}


	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public boolean inst_rec_issue_flg() {
		return getConstBoolean(offset + 82, $inst_rec_issue_flg);
	}

	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public void inst_rec_issue_flg(boolean value) {
		setConstBoolean(offset + 82, $inst_rec_issue_flg, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 83, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 83, $po_d_no, value);
	}


	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public boolean po_auto_reg_flg() {
		return getConstBoolean(offset + 84, $po_auto_reg_flg);
	}

	/**
	 * Auto-create at PO 発注時自動作成.<p>
	 *
	 */
	public void po_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 84, $po_auto_reg_flg, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 85, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 85, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 86, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 86, $po_schd_src_no, value);
	}


	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public String po_schd_data_crud_typ() {
		return getConstString(offset + 87, $po_schd_data_crud_typ);
	}

	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public void po_schd_data_crud_typ(String value) {
		setConstString(offset + 87, $po_schd_data_crud_typ, value);
	}


	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char1() {
		return getConstString(offset + 88, $itm_mfg_inst_sub_char1);
	}

	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char1(String value) {
		setConstString(offset + 88, $itm_mfg_inst_sub_char1, value);
	}


	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char2() {
		return getConstString(offset + 89, $itm_mfg_inst_sub_char2);
	}

	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char2(String value) {
		setConstString(offset + 89, $itm_mfg_inst_sub_char2, value);
	}


	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char3() {
		return getConstString(offset + 90, $itm_mfg_inst_sub_char3);
	}

	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char3(String value) {
		setConstString(offset + 90, $itm_mfg_inst_sub_char3, value);
	}


	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 91, $mfg_inst_sub_char1);
	}

	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 91, $mfg_inst_sub_char1, value);
	}


	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 92, $mfg_inst_sub_char2);
	}

	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 92, $mfg_inst_sub_char2, value);
	}


	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 93, $mfg_inst_sub_char3);
	}

	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 93, $mfg_inst_sub_char3, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 94, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 94, $aprv_flg, value);
	}


	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public boolean no_mfg_aprv_flg() {
		return getConstBoolean(offset + 95, $no_mfg_aprv_flg);
	}

	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public void no_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 95, $no_mfg_aprv_flg, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 96, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 96, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return getConstString(offset + 97, $mfg_aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		setConstString(offset + 97, $mfg_aprv_role_cd, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 98, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 98, $aprv_dt, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 99, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 99, $aprv_dpt_cd, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 100, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 100, $aprv_usr_cd, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 101, $aprv_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 101, $aprv_tm, value);
	}


	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 102, $aprv_rsn);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 102, $aprv_rsn, value);
	}


	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_ord_upd_cntr() {
		return getConstNumber(offset + 103, $itm_ord_upd_cntr);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(MCNumber value) {
		setConstNumber(offset + 103, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(int value) {
		setConstNumber(offset + 103, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(long value) {
		setConstNumber(offset + 103, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(float value) {
		setConstNumber(offset + 103, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(double value) {
		setConstNumber(offset + 103, $itm_ord_upd_cntr, value);
	}


	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_upd_cntr() {
		return getConstNumber(offset + 104, $itm_mfg_inst_upd_cntr);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 104, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 104, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 104, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 104, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 104, $itm_mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 105, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 105, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 105, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 105, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 105, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 105, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 106, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 106, $old_mfg_sts_typ, value);
	}


	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public String old_mfg_aprv_sts_typ() {
		return getConstString(offset + 107, $old_mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public void old_mfg_aprv_sts_typ(String value) {
		setConstString(offset + 107, $old_mfg_aprv_sts_typ, value);
	}


	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public boolean old_aprv_flg() {
		return getConstBoolean(offset + 108, $old_aprv_flg);
	}

	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public void old_aprv_flg(boolean value) {
		setConstBoolean(offset + 108, $old_aprv_flg, value);
	}


	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public String old_mfg_aprv_role_cd() {
		return getConstString(offset + 109, $old_mfg_aprv_role_cd);
	}

	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public void old_mfg_aprv_role_cd(String value) {
		setConstString(offset + 109, $old_mfg_aprv_role_cd, value);
	}


	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public MCDate old_inst_dt() {
		return getConstDate(offset + 110, $old_inst_dt);
	}

	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public void old_inst_dt(MCDate value) {
		setConstDate(offset + 110, $old_inst_dt, value);
	}


	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public String old_lot_no() {
		return getConstString(offset + 111, $old_lot_no);
	}

	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public void old_lot_no(String value) {
		setConstString(offset + 111, $old_lot_no, value);
	}


	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public String old_sublot_no() {
		return getConstString(offset + 112, $old_sublot_no);
	}

	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public void old_sublot_no(String value) {
		setConstString(offset + 112, $old_sublot_no, value);
	}


	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public String old_bom_ptn() {
		return getConstString(offset + 113, $old_bom_ptn);
	}

	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public void old_bom_ptn(String value) {
		setConstString(offset + 113, $old_bom_ptn, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 114, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 114, $old_inst_abort_flg, value);
	}


	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public MCNumber old_sum_inst_qty() {
		return getConstNumber(offset + 115, $old_sum_inst_qty);
	}

	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public void old_sum_inst_qty(MCNumber value) {
		setConstNumber(offset + 115, $old_sum_inst_qty, value);
	}

	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public void old_sum_inst_qty(int value) {
		setConstNumber(offset + 115, $old_sum_inst_qty, value);
	}

	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public void old_sum_inst_qty(long value) {
		setConstNumber(offset + 115, $old_sum_inst_qty, value);
	}

	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public void old_sum_inst_qty(float value) {
		setConstNumber(offset + 115, $old_sum_inst_qty, value);
	}

	/**
	 * Item mfg. orders total before update 更新前品目製造指図数合計.<p>
	 *
	 */
	public void old_sum_inst_qty(double value) {
		setConstNumber(offset + 115, $old_sum_inst_qty, value);
	}


	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public MCNumber can_itm_mfg_inst_del_flg() {
		return getConstNumber(offset + 116, $can_itm_mfg_inst_del_flg);
	}

	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public void can_itm_mfg_inst_del_flg(MCNumber value) {
		setConstNumber(offset + 116, $can_itm_mfg_inst_del_flg, value);
	}

	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public void can_itm_mfg_inst_del_flg(int value) {
		setConstNumber(offset + 116, $can_itm_mfg_inst_del_flg, value);
	}

	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public void can_itm_mfg_inst_del_flg(long value) {
		setConstNumber(offset + 116, $can_itm_mfg_inst_del_flg, value);
	}

	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public void can_itm_mfg_inst_del_flg(float value) {
		setConstNumber(offset + 116, $can_itm_mfg_inst_del_flg, value);
	}

	/**
	 * Item mfg. order cancellable flg. 品目製造指図取消可ＦＬＧ.<p>
	 *
	 */
	public void can_itm_mfg_inst_del_flg(double value) {
		setConstNumber(offset + 116, $can_itm_mfg_inst_del_flg, value);
	}


	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 117, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 117, $upd_cntr_chk_flg, value);
	}


	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 118, $is_src_batch_flg);
	}

	/**
	 * Caller batch process flg. 呼出元バッチ処理ＦＬＧ.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 118, $is_src_batch_flg, value);
	}


	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 119, $lst_reg_flg);
	}

	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 119, $lst_reg_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 120, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 120, $not_frst_inst_can_flg, value);
	}


	/**
	 * Non-initial mfg. order entry (Operation unit) 初回製造指図以外の登録（工程単位）.<p>
	 *
	 */
	public boolean not_frst_inst_reg_oper_flg() {
		return getConstBoolean(offset + 121, $not_frst_inst_reg_oper_flg);
	}

	/**
	 * Non-initial mfg. order entry (Operation unit) 初回製造指図以外の登録（工程単位）.<p>
	 *
	 */
	public void not_frst_inst_reg_oper_flg(boolean value) {
		setConstBoolean(offset + 121, $not_frst_inst_reg_oper_flg, value);
	}


	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public boolean comp_dt_from_oper_flg() {
		return getConstBoolean(offset + 122, $comp_dt_from_oper_flg);
	}

	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public void comp_dt_from_oper_flg(boolean value) {
		setConstBoolean(offset + 122, $comp_dt_from_oper_flg, value);
	}


	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public boolean is_src_alloc_flg() {
		return getConstBoolean(offset + 123, $is_src_alloc_flg);
	}

	/**
	 * Caller allocation type 呼出元引当種別.<p>
	 *
	 */
	public void is_src_alloc_flg(boolean value) {
		setConstBoolean(offset + 123, $is_src_alloc_flg, value);
	}


	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public MCNumber old_mfg_inst_rev() {
		return getConstNumber(offset + 124, $old_mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public void old_mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 124, $old_mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public void old_mfg_inst_rev(int value) {
		setConstNumber(offset + 124, $old_mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public void old_mfg_inst_rev(long value) {
		setConstNumber(offset + 124, $old_mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public void old_mfg_inst_rev(float value) {
		setConstNumber(offset + 124, $old_mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. No. before update 更新前製造指図改訂番号.<p>
	 *
	 */
	public void old_mfg_inst_rev(double value) {
		setConstNumber(offset + 124, $old_mfg_inst_rev, value);
	}


	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 125, $itm_ord_sts_typ);
	}

	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 125, $itm_ord_sts_typ, value);
	}


	public String getString(String name) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return mfg_inst_data_crud_typ();
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return frst_mfg_inst_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			return po_schd_data_crud_typ();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_aprv_sts_typ();
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return old_mfg_aprv_role_cd();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			return old_bom_ptn();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			return base_unit_ord_qty();
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_not_inst_qty();
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
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			return old_sum_inst_qty();
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			return can_itm_mfg_inst_del_flg();
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			return old_mfg_inst_rev();
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
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
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
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			return old_inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			return chg_list_immed_prnt_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
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
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_frst_inst_reg_oper_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_reg_oper_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			return is_src_alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return mfg_inst_data_crud_typ();
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return frst_mfg_inst_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			return po_schd_data_crud_typ();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_aprv_sts_typ();
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return old_mfg_aprv_role_cd();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			return old_bom_ptn();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			return base_unit_ord_qty();
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_not_inst_qty();
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
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			return old_sum_inst_qty();
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			return can_itm_mfg_inst_del_flg();
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			return old_mfg_inst_rev();
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
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
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
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			return old_inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_tgt_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			return inst_immed_prnt_flg();
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			return chg_list_immed_prnt_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
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
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			return ord_abort_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_frst_inst_reg_oper_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_reg_oper_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			return is_src_alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			mfg_inst_data_crud_typ(value);
			return;
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			frst_mfg_inst_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			po_schd_data_crud_typ(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_aprv_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			old_mfg_aprv_role_cd(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			old_bom_ptn(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			old_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			chg_list_immed_prnt_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
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
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_frst_inst_reg_oper_flg.equalsIgnoreCase(name)) {
			not_frst_inst_reg_oper_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			is_src_alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			mfg_inst_data_crud_typ(value);
			return;
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			frst_mfg_inst_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			po_schd_data_crud_typ(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_aprv_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			old_mfg_aprv_role_cd(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			old_bom_ptn(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_ord_qty.equalsIgnoreCase(name)) {
			base_unit_ord_qty(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
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
		if ($old_sum_inst_qty.equalsIgnoreCase(name)) {
			old_sum_inst_qty(value);
			return;
		}
		if ($can_itm_mfg_inst_del_flg.equalsIgnoreCase(name)) {
			can_itm_mfg_inst_del_flg(value);
			return;
		}
		if ($old_mfg_inst_rev.equalsIgnoreCase(name)) {
			old_mfg_inst_rev(value);
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
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			old_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_tgt_flg(value);
			return;
		}
		if ($strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			strg_str_ln_tgt_flg(value);
			return;
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($inst_immed_prnt_flg.equalsIgnoreCase(name)) {
			inst_immed_prnt_flg(value);
			return;
		}
		if ($chg_list_immed_prnt_flg.equalsIgnoreCase(name)) {
			chg_list_immed_prnt_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
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
		if ($ord_abort_flg.equalsIgnoreCase(name)) {
			ord_abort_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_frst_inst_reg_oper_flg.equalsIgnoreCase(name)) {
			not_frst_inst_reg_oper_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		if ($is_src_alloc_flg.equalsIgnoreCase(name)) {
			is_src_alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

