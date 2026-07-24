package mcframe.serverMSBC.MSBCL1100;

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
 * ブロック"Srch01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_HdrR_MC_A extends MCConstRow {

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
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public static final String $st_act_dt = "st_act_dt";
	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public static final String $st_act_hm = "st_act_hm";
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public static final String $end_act_dt = "end_act_dt";
	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public static final String $end_act_hm = "end_act_hm";
	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public static final String $end_ac_dt = "end_ac_dt";
	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public static final String $base_unit_st_act_qty = "base_unit_st_act_qty";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";
	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_rem_qty = "base_unit_mfg_rem_qty";
	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_inst_qty = "base_unit_mfg_inst_qty";
	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public static final String $base_unit_dfct_qty = "base_unit_dfct_qty";
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
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
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
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd_none_flg = "mfg_str_ln_cd_none_flg";
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
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public static final String $strg_str_ln_cd_none_flg = "strg_str_ln_cd_none_flg";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
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
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
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
	 * Approval date 承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public static final String $aprv_dpt_nm = "aprv_dpt_nm";
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
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
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public static final String $arr_purc_auto_reg_flg = "arr_purc_auto_reg_flg";


	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
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
	public static final MCMeta st_act_dt_META = createCommonMeta($st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_act_hm_META = createCommonMeta($st_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_dt_META = createCommonMeta($end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_hm_META = createCommonMeta($end_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_ac_dt_META = createCommonMeta($end_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_unit_st_act_qty_META = createCommonMeta($base_unit_st_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_mfg_rem_qty_META = createCommonMeta($base_unit_mfg_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_mfg_inst_qty_META = createCommonMeta($base_unit_mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dfct_qty_META = createCommonMeta($base_unit_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta act_rpt_rmrks_META = createCommonMeta($act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_sub_char1_META = createCommonMeta($mfg_act_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta mfg_act_sub_char2_META = createCommonMeta($mfg_act_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta mfg_act_sub_char3_META = createCommonMeta($mfg_act_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);
	public static final MCMeta act_prnt_flg_META = createCommonMeta($act_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_prnt_tm_META = createCommonMeta($act_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_META = createCommonMeta($st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_META = createCommonMeta($end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_tgt_flg_META = createCommonMeta($mfg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_str_ln_cd_none_flg_META = createCommonMeta($mfg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_tgt_flg_META = createCommonMeta($strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_str_ln_cd_none_flg_META = createCommonMeta($strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_RPT_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.APRV_RSN);
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
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_pr_upd_cntr_META = createCommonMeta($mfg_inst_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_act_upd_cntr_META = createCommonMeta($mfg_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta inpt_itm_add_flg_META = createCommonMeta($inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_del_flg_META = createCommonMeta($inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_purc_auto_reg_flg_META = createCommonMeta($arr_purc_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_HdrR> constMetas = new ConstMetaList<Srch01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META,
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
			st_act_dt_META,
			st_act_hm_META,
			st_ac_dt_META,
			end_act_dt_META,
			end_act_hm_META,
			end_ac_dt_META,
			base_unit_st_act_qty_META,
			rem_abort_flg_META,
			base_unit_mfg_rem_qty_META,
			base_unit_mfg_inst_qty_META,
			base_unit_yield_qty_META,
			base_unit_dfct_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			act_rpt_rmrks_META,
			intr_rmrks_META,
			mfg_act_sub_char1_META,
			mfg_act_sub_char2_META,
			mfg_act_sub_char3_META,
			act_prnt_flg_META,
			act_prnt_tm_META,
			itm_yield_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			st_schd_dt_META,
			st_schd_hm_META,
			end_schd_dt_META,
			end_schd_hm_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_tgt_flg_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			mfg_str_ln_cd_none_flg_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_tgt_flg_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			strg_str_ln_cd_none_flg_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_ptn_META,
			itm_ord_no_META,
			itm_mfg_inst_no_META,
			unschd_act_flg_META,
			mfg_inst_no_META,
			div_seq_META,
			po_d_no_META,
			mfg_act_no_META,
			inst_rpt_rmrks_META,
			inst_po_cnt_rmrks_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			aprv_dt_META,
			aprv_tm_META,
			aprv_flg_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_rsn_META,
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
			mfg_inst_upd_cntr_META,
			mfg_inst_pr_upd_cntr_META,
			mfg_act_upd_cntr_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			inpt_itm_add_flg_META,
			inpt_itm_del_flg_META,
			arr_purc_auto_reg_flg_META
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
				{$mfg_sts_typ, "MSC_MFG_STS_TYP"},	// mfg_sts_typ
				{$mfg_mtd_typ, "MSC_MFG_MTD_TYP"},	// mfg_mtd_typ
				{$mfg_aprv_sts_typ, "MSC_MFG_APRV_STS_TYP"}	// mfg_aprv_sts_typ
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
	protected Srch01_HdrR_MC_A(ConstMetaList<? extends Srch01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR clone() {
		return (Srch01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR createInstance() {
		return (Srch01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrR getValues(String... names) {
		return (Srch01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 0, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 0, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 1, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 1, $mfg_sts_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 7, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 7, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 8, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 8, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 9, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 9, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 10, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 10, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 11, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 11, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 12, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 12, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 13, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 13, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 14, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 14, $wrk_nm, value);
	}


	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return getConstDate(offset + 15, $st_act_dt);
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		setConstDate(offset + 15, $st_act_dt, value);
	}


	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public MCDate st_act_hm() {
		return getConstDate(offset + 16, $st_act_hm);
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public void st_act_hm(MCDate value) {
		setConstDate(offset + 16, $st_act_hm, value);
	}


	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 17, $st_ac_dt);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 17, $st_ac_dt, value);
	}


	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return getConstDate(offset + 18, $end_act_dt);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		setConstDate(offset + 18, $end_act_dt, value);
	}


	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public MCDate end_act_hm() {
		return getConstDate(offset + 19, $end_act_hm);
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public void end_act_hm(MCDate value) {
		setConstDate(offset + 19, $end_act_hm, value);
	}


	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return getConstDate(offset + 20, $end_ac_dt);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		setConstDate(offset + 20, $end_ac_dt, value);
	}


	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_act_qty() {
		return getConstNumber(offset + 21, $base_unit_st_act_qty);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(MCNumber value) {
		setConstNumber(offset + 21, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(int value) {
		setConstNumber(offset + 21, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(long value) {
		setConstNumber(offset + 21, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(float value) {
		setConstNumber(offset + 21, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(double value) {
		setConstNumber(offset + 21, $base_unit_st_act_qty, value);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 22, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 22, $rem_abort_flg, value);
	}


	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_rem_qty() {
		return getConstNumber(offset + 23, $base_unit_mfg_rem_qty);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(MCNumber value) {
		setConstNumber(offset + 23, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(int value) {
		setConstNumber(offset + 23, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(long value) {
		setConstNumber(offset + 23, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(float value) {
		setConstNumber(offset + 23, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Remaining mfg. qty. 製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(double value) {
		setConstNumber(offset + 23, $base_unit_mfg_rem_qty, value);
	}


	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_inst_qty() {
		return getConstNumber(offset + 24, $base_unit_mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 24, $base_unit_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(int value) {
		setConstNumber(offset + 24, $base_unit_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(long value) {
		setConstNumber(offset + 24, $base_unit_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(float value) {
		setConstNumber(offset + 24, $base_unit_mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(double value) {
		setConstNumber(offset + 24, $base_unit_mfg_inst_qty, value);
	}


	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 25, $base_unit_yield_qty);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 25, $base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 25, $base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 25, $base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 25, $base_unit_yield_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 25, $base_unit_yield_qty, value);
	}


	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public MCNumber base_unit_dfct_qty() {
		return getConstNumber(offset + 26, $base_unit_dfct_qty);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(MCNumber value) {
		setConstNumber(offset + 26, $base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(int value) {
		setConstNumber(offset + 26, $base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(long value) {
		setConstNumber(offset + 26, $base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(float value) {
		setConstNumber(offset + 26, $base_unit_dfct_qty, value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(double value) {
		setConstNumber(offset + 26, $base_unit_dfct_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 28, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 28, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 29, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 29, $base_unit_dec_place, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 30, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 30, $act_usr_cd, value);
	}


	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 31, $act_usr_nm);
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 31, $act_usr_nm, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 32, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 32, $act_dpt_cd, value);
	}


	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 33, $act_dpt_nm);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 33, $act_dpt_nm, value);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return getConstString(offset + 34, $act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		setConstString(offset + 34, $act_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 35, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 35, $intr_rmrks, value);
	}


	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return getConstString(offset + 36, $mfg_act_sub_char1);
	}

	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		setConstString(offset + 36, $mfg_act_sub_char1, value);
	}


	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return getConstString(offset + 37, $mfg_act_sub_char2);
	}

	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		setConstString(offset + 37, $mfg_act_sub_char2, value);
	}


	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return getConstString(offset + 38, $mfg_act_sub_char3);
	}

	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		setConstString(offset + 38, $mfg_act_sub_char3, value);
	}


	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public boolean act_prnt_flg() {
		return getConstBoolean(offset + 39, $act_prnt_flg);
	}

	/**
	 * Mfg. record sheet issued 製造記録書発行済.<p>
	 *
	 */
	public void act_prnt_flg(boolean value) {
		setConstBoolean(offset + 39, $act_prnt_flg, value);
	}


	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public MCDate act_prnt_tm() {
		return getConstDate(offset + 40, $act_prnt_tm);
	}

	/**
	 * Mfg. record sheet issued date and time 製造記録書発行日時.<p>
	 *
	 */
	public void act_prnt_tm(MCDate value) {
		setConstDate(offset + 40, $act_prnt_tm, value);
	}


	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 41, $itm_yield);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 41, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 41, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 41, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 41, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 41, $itm_yield, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 42, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 42, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 42, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 42, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 42, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 42, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 43, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 43, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 43, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 43, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 43, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 43, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 44, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 44, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 44, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 44, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 44, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 44, $itm_upper_yield, value);
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 45, $st_schd_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 45, $st_schd_dt, value);
	}


	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return getConstDate(offset + 46, $st_schd_hm);
	}

	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		setConstDate(offset + 46, $st_schd_hm, value);
	}


	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 47, $end_schd_dt);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 47, $end_schd_dt, value);
	}


	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return getConstDate(offset + 48, $end_schd_hm);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		setConstDate(offset + 48, $end_schd_hm, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 49, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 49, $mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String mfg_mtd_typ_nm() {
		return getConstString(offset + 50, $mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void mfg_mtd_typ_nm(String value) {
		setConstString(offset + 50, $mfg_mtd_typ_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 51, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 51, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 52, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 52, $sppl_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 53, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 53, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 54, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 54, $mfg_loc_nm, value);
	}


	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public boolean mfg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 55, $mfg_str_ln_tgt_flg);
	}

	/**
	 * For mfg. location rack/line 製造場所棚・ライン対象.<p>
	 *
	 */
	public void mfg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 55, $mfg_str_ln_tgt_flg, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 56, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 56, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 57, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 57, $mfg_str_ln_nm, value);
	}


	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public boolean mfg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 58, $mfg_str_ln_cd_none_flg);
	}

	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public void mfg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 58, $mfg_str_ln_cd_none_flg, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 59, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 59, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 60, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 60, $strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 61, $strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 61, $strg_str_ln_tgt_flg, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 62, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 62, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 63, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 63, $strg_str_ln_nm, value);
	}


	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 64, $strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 64, $strg_str_ln_cd_none_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 65, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 65, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 66, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 66, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 67, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 67, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 68, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 68, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 69, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 69, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 70, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 70, $oper_ptn, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 71, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 71, $itm_ord_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 72, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 72, $itm_mfg_inst_no, value);
	}


	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 73, $unschd_act_flg);
	}

	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 73, $unschd_act_flg, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 74, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 74, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 75, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 75, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 75, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 75, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 75, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 75, $div_seq, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 76, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 76, $po_d_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 77, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 77, $mfg_act_no, value);
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
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 79, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 79, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 80, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 80, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 81, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 81, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 82, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 82, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 83, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 83, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 84, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 84, $inst_dpt_nm, value);
	}


	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 85, $aprv_dt);
	}

	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 85, $aprv_dt, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 86, $aprv_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 86, $aprv_tm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 87, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 87, $aprv_flg, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 88, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 88, $aprv_dpt_cd, value);
	}


	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 89, $aprv_dpt_nm);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 89, $aprv_dpt_nm, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 90, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 90, $aprv_usr_cd, value);
	}


	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 91, $aprv_usr_nm);
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 91, $aprv_usr_nm, value);
	}


	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 92, $aprv_rsn);
	}

	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 92, $aprv_rsn, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 93, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 93, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 94, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 94, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 95, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 95, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 96, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 96, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 97, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 97, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 98, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 98, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 99, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 99, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 100, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 100, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 101, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 101, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 102, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 102, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 103, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 103, $upd_srv_req_no, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 104, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 104, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 104, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 104, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 104, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 104, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_pr_upd_cntr() {
		return getConstNumber(offset + 105, $mfg_inst_pr_upd_cntr);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 105, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(int value) {
		setConstNumber(offset + 105, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(long value) {
		setConstNumber(offset + 105, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(float value) {
		setConstNumber(offset + 105, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(double value) {
		setConstNumber(offset + 105, $mfg_inst_pr_upd_cntr, value);
	}


	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_act_upd_cntr() {
		return getConstNumber(offset + 106, $mfg_act_upd_cntr);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 106, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(int value) {
		setConstNumber(offset + 106, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(long value) {
		setConstNumber(offset + 106, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(float value) {
		setConstNumber(offset + 106, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(double value) {
		setConstNumber(offset + 106, $mfg_act_upd_cntr, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 107, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 107, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 108, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 108, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 109, $inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 109, $inpt_itm_add_flg, value);
	}


	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 110, $inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 110, $inpt_itm_del_flg, value);
	}


	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public boolean arr_purc_auto_reg_flg() {
		return getConstBoolean(offset + 111, $arr_purc_auto_reg_flg);
	}

	/**
	 * Auto-create at receipt/purchase 入荷・仕入時自動作成.<p>
	 *
	 */
	public void arr_purc_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 111, $arr_purc_auto_reg_flg, value);
	}


	public String getString(String name) {
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_rem_qty();
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
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
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			return st_act_hm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			return end_act_hm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
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
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
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
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_rem_qty();
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
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
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			return st_act_hm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			return end_act_hm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
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
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($mfg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_tgt_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
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
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			st_act_hm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			end_act_hm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
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
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
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
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
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
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
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
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
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
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_inst_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
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
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			st_act_hm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			end_act_hm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
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
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
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
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
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
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

