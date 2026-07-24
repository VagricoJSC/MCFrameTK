package mcframe.serverMSBC.MSBCL1070;

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
	 * HDR,Header;OPER,Operation;YIELD,Output qty. HDR,ヘッダ;OPER,工程;YIELD,出来高.<p>
	 *
	 */
	public static final String $disp_unit1 = "disp_unit1";
	/**
	 * INST,Order;ACT,Result INST,指図;ACT,実績.<p>
	 *
	 */
	public static final String $disp_unit2 = "disp_unit2";
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public static final String $tmp_sts_sav_flg = "tmp_sts_sav_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $tmp_sts_ord_flg = "tmp_sts_ord_flg";
	/**
	 * In process 着手中.<p>
	 *
	 */
	public static final String $tmp_sts_stt_flg = "tmp_sts_stt_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $tmp_sts_cmpl_flg = "tmp_sts_cmpl_flg";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $not_unschd_act_flg = "not_unschd_act_flg";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $unschd_act_flg = "unschd_act_flg";
	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_schd_dt_fr = "st_schd_dt_fr";
	/**
	 * Schedule start time FROM 着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_schd_hm_fr = "st_schd_hm_fr";
	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public static final String $st_schd_dt_to = "st_schd_dt_to";
	/**
	 * Schedule start time TO 着手予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $st_schd_hm_to = "st_schd_hm_to";
	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_schd_dt_fr = "end_schd_dt_fr";
	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_schd_hm_fr = "end_schd_hm_fr";
	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public static final String $end_schd_dt_to = "end_schd_dt_to";
	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $end_schd_hm_to = "end_schd_hm_to";
	/**
	 * Actual start date FROM 着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_act_dt_fr = "st_act_dt_fr";
	/**
	 * Actual start time FROM 着手実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_act_hm_fr = "st_act_hm_fr";
	/**
	 * Actual start date TO 着手実績日ＴＯ.<p>
	 *
	 */
	public static final String $st_act_dt_to = "st_act_dt_to";
	/**
	 * Actual start time TO 着手実績時刻ＴＯ.<p>
	 *
	 */
	public static final String $st_act_hm_to = "st_act_hm_to";
	/**
	 * Actual end date FROM 終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_act_dt_fr = "end_act_dt_fr";
	/**
	 * Actual end time FROM 終了実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_act_hm_fr = "end_act_hm_fr";
	/**
	 * Actual end date TO 終了実績日ＴＯ.<p>
	 *
	 */
	public static final String $end_act_dt_to = "end_act_dt_to";
	/**
	 * Actual end time TO 終了実績時刻ＴＯ.<p>
	 *
	 */
	public static final String $end_act_hm_to = "end_act_hm_to";
	/**
	 * Scheduled output date FROM 出来高予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $yield_schd_dt_fr = "yield_schd_dt_fr";
	/**
	 * Output schedule time FROM 出来高予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $yield_schd_hm_fr = "yield_schd_hm_fr";
	/**
	 * Scheduled output date TO 出来高予定日ＴＯ.<p>
	 *
	 */
	public static final String $yield_schd_dt_to = "yield_schd_dt_to";
	/**
	 * Output schedule time TO 出来高予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $yield_schd_hm_to = "yield_schd_hm_to";
	/**
	 * Actual output date FROM 出来高実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $yield_act_dt_fr = "yield_act_dt_fr";
	/**
	 * Actual output time FROM 出来高実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $yield_act_hm_fr = "yield_act_hm_fr";
	/**
	 * Actual output date TO 出来高実績日ＴＯ.<p>
	 *
	 */
	public static final String $yield_act_dt_to = "yield_act_dt_to";
	/**
	 * Actual output time TO 出来高実績時刻ＴＯ.<p>
	 *
	 */
	public static final String $yield_act_hm_to = "yield_act_hm_to";
	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt_fr = "rqst_dlv_rqst_dt_fr";
	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_hm_fr = "rqst_dlv_rqst_hm_fr";
	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt_to = "rqst_dlv_rqst_dt_to";
	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_hm_to = "rqst_dlv_rqst_hm_to";
	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $inst_dt_fr = "inst_dt_fr";
	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public static final String $inst_dt_to = "inst_dt_to";
	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $aprv_dt_fr = "aprv_dt_fr";
	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public static final String $aprv_dt_to = "aprv_dt_to";
	/**
	 * Start recording date FROM 着手計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_ac_dt_fr = "st_ac_dt_fr";
	/**
	 * Start recording date TO 着手計上日ＴＯ.<p>
	 *
	 */
	public static final String $st_ac_dt_to = "st_ac_dt_to";
	/**
	 * End recording date FROM 終了計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_ac_dt_fr = "end_ac_dt_fr";
	/**
	 * End recording date TO 終了計上日ＴＯ.<p>
	 *
	 */
	public static final String $end_ac_dt_to = "end_ac_dt_to";
	/**
	 * Output recording date FROM 出来高計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $yield_ac_dt_fr = "yield_ac_dt_fr";
	/**
	 * Output recording date TO 出来高計上日ＴＯ.<p>
	 *
	 */
	public static final String $yield_ac_dt_to = "yield_ac_dt_to";
	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $upd_ts_fr = "upd_ts_fr";
	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public static final String $upd_ts_to = "upd_ts_to";
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
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
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
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_grp_cd = "strg_loc_grp_cd";
	/**
	 * Storage location G name 格納場所Ｇ名.<p>
	 *
	 */
	public static final String $strg_loc_grp_nm = "strg_loc_grp_nm";
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
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
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
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public static final String $po_aprv_sts_typ = "po_aprv_sts_typ";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $yield_rsn_cd = "yield_rsn_cd";
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public static final String $yield_rsn_nm = "yield_rsn_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
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
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Only mfg. order including output recording operation 出来高計上工程含む製造指図のみ.<p>
	 *
	 */
	public static final String $inc_yield_oper_flg = "inc_yield_oper_flg";
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
	 * Output schedule internal remarks 出来高予定内部備考.<p>
	 *
	 */
	public static final String $yield_schd_intr_rmrks = "yield_schd_intr_rmrks";
	/**
	 * Output schedule order sheet remarks 出来高予定指図書備考.<p>
	 *
	 */
	public static final String $yield_schd_rpt_rmrks = "yield_schd_rpt_rmrks";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
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
	 * Output schedule spare 1 出来高予定予備１.<p>
	 *
	 */
	public static final String $yield_schd_sub_char1 = "yield_schd_sub_char1";
	/**
	 * Output schedule spare 2 出来高予定予備２.<p>
	 *
	 */
	public static final String $yield_schd_sub_char2 = "yield_schd_sub_char2";
	/**
	 * Output schedule spare 3 出来高予定予備３.<p>
	 *
	 */
	public static final String $yield_schd_sub_char3 = "yield_schd_sub_char3";
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
	/**
	 * Subcontractor classification 1 外注先分類１.<p>
	 *
	 */
	public static final String $sppl_grp_flg1 = "sppl_grp_flg1";
	/**
	 * Subcontractor classification cd. 1 外注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Subcontractor classification name 1 外注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Subcontractor classification 2 外注先分類２.<p>
	 *
	 */
	public static final String $sppl_grp_flg2 = "sppl_grp_flg2";
	/**
	 * Subcontractor classification cd. 2 外注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Subcontractor classification name 2 外注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Subcontractor classification 3 外注先分類３.<p>
	 *
	 */
	public static final String $sppl_grp_flg3 = "sppl_grp_flg3";
	/**
	 * Subcontractor classification cd. 3 外注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Subcontractor classification name 3 外注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Subcontractor classification 4 外注先分類４.<p>
	 *
	 */
	public static final String $sppl_grp_flg4 = "sppl_grp_flg4";
	/**
	 * Subcontractor classification cd. 4 外注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Subcontractor classification name 4 外注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Subcontractor classification 5 外注先分類５.<p>
	 *
	 */
	public static final String $sppl_grp_flg5 = "sppl_grp_flg5";
	/**
	 * Subcontractor classification cd. 5 外注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Subcontractor classification name 5 外注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Subcontractor classification 6 外注先分類６.<p>
	 *
	 */
	public static final String $sppl_grp_flg6 = "sppl_grp_flg6";
	/**
	 * Subcontractor classification cd. 6 外注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Subcontractor classification name 6 外注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Subcontractor classification 7 外注先分類７.<p>
	 *
	 */
	public static final String $sppl_grp_flg7 = "sppl_grp_flg7";
	/**
	 * Subcontractor classification cd. 7 外注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Subcontractor classification name 7 外注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Subcontractor classification 8 外注先分類８.<p>
	 *
	 */
	public static final String $sppl_grp_flg8 = "sppl_grp_flg8";
	/**
	 * Subcontractor classification cd. 8 外注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Subcontractor classification name 8 外注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Subcontractor classification 9 外注先分類９.<p>
	 *
	 */
	public static final String $sppl_grp_flg9 = "sppl_grp_flg9";
	/**
	 * Subcontractor classification cd. 9 外注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Subcontractor classification name 9 外注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Subcontractor classification 10 外注先分類１０.<p>
	 *
	 */
	public static final String $sppl_grp_flg10 = "sppl_grp_flg10";
	/**
	 * Subcontractor classification cd. 10 外注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Subcontractor classification name 10 外注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";


	public static final MCMeta disp_unit1_META = createStringMeta($disp_unit1);
	public static final MCMeta disp_unit2_META = createStringMeta($disp_unit2);
	public static final MCMeta tmp_sts_sav_flg_META = createCommonMeta($tmp_sts_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_ord_flg_META = createCommonMeta($tmp_sts_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_stt_flg_META = createCommonMeta($tmp_sts_stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_cmpl_flg_META = createCommonMeta($tmp_sts_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_unschd_act_flg_META = createCommonMeta($not_unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_schd_dt_fr_META = createCommonMeta($st_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_fr_META = createCommonMeta($st_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta st_schd_dt_to_META = createCommonMeta($st_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_to_META = createCommonMeta($st_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_fr_META = createCommonMeta($end_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_fr_META = createCommonMeta($end_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_to_META = createCommonMeta($end_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_to_META = createCommonMeta($end_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta st_act_dt_fr_META = createCommonMeta($st_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_act_hm_fr_META = createCommonMeta($st_act_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta st_act_dt_to_META = createCommonMeta($st_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_act_hm_to_META = createCommonMeta($st_act_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_act_dt_fr_META = createCommonMeta($end_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_hm_fr_META = createCommonMeta($end_act_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_act_dt_to_META = createCommonMeta($end_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_hm_to_META = createCommonMeta($end_act_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta yield_schd_dt_fr_META = createCommonMeta($yield_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_schd_hm_fr_META = createCommonMeta($yield_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta yield_schd_dt_to_META = createCommonMeta($yield_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_schd_hm_to_META = createCommonMeta($yield_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta yield_act_dt_fr_META = createCommonMeta($yield_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_act_hm_fr_META = createCommonMeta($yield_act_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta yield_act_dt_to_META = createCommonMeta($yield_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_act_hm_to_META = createCommonMeta($yield_act_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta rqst_dlv_rqst_dt_fr_META = createCommonMeta($rqst_dlv_rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_hm_fr_META = createCommonMeta($rqst_dlv_rqst_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta rqst_dlv_rqst_dt_to_META = createCommonMeta($rqst_dlv_rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_hm_to_META = createCommonMeta($rqst_dlv_rqst_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta inst_dt_fr_META = createCommonMeta($inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dt_to_META = createCommonMeta($inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dt_fr_META = createCommonMeta($aprv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dt_to_META = createCommonMeta($aprv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_ac_dt_fr_META = createCommonMeta($st_ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_ac_dt_to_META = createCommonMeta($st_ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_ac_dt_fr_META = createCommonMeta($end_ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_ac_dt_to_META = createCommonMeta($end_ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_ac_dt_fr_META = createCommonMeta($yield_ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta yield_ac_dt_to_META = createCommonMeta($yield_ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_ts_fr_META = createCommonMeta($upd_ts_fr, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_to_META = createCommonMeta($upd_ts_to, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_loc_site_cd_META = createCommonMeta($mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_loc_site_nm_META = createCommonMeta($mfg_loc_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_wg_nm_META = createCommonMeta($mfg_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta strg_loc_grp_nm_META = createCommonMeta($strg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
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
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta po_aprv_sts_typ_META = createCommonMeta($po_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta yield_rsn_cd_META = createCommonMeta($yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta yield_rsn_nm_META = createCommonMeta($yield_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_yield_oper_flg_META = createCommonMeta($inc_yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_RPT_RMRKS);
	public static final MCMeta oper_intr_rmrks_META = createCommonMeta($oper_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta yield_schd_intr_rmrks_META = createCommonMeta($yield_schd_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_SCHD_INTR_RMRKS);
	public static final MCMeta yield_schd_rpt_rmrks_META = createCommonMeta($yield_schd_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_SCHD_RPT_RMRKS);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char1_META = createCommonMeta($itm_mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char2_META = createCommonMeta($itm_mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta itm_mfg_inst_sub_char3_META = createCommonMeta($itm_mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta yield_schd_sub_char1_META = createCommonMeta($yield_schd_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR1);
	public static final MCMeta yield_schd_sub_char2_META = createCommonMeta($yield_schd_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR2);
	public static final MCMeta yield_schd_sub_char3_META = createCommonMeta($yield_schd_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR3);
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
	public static final MCMeta sppl_grp_flg1_META = createCommonMeta($sppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg2_META = createCommonMeta($sppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg3_META = createCommonMeta($sppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg4_META = createCommonMeta($sppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg5_META = createCommonMeta($sppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg6_META = createCommonMeta($sppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg7_META = createCommonMeta($sppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg8_META = createCommonMeta($sppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg9_META = createCommonMeta($sppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg10_META = createCommonMeta($sppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_unit1_META,
			disp_unit2_META,
			tmp_sts_sav_flg_META,
			tmp_sts_ord_flg_META,
			tmp_sts_stt_flg_META,
			tmp_sts_cmpl_flg_META,
			not_unschd_act_flg_META,
			unschd_act_flg_META,
			st_schd_dt_fr_META,
			st_schd_hm_fr_META,
			st_schd_dt_to_META,
			st_schd_hm_to_META,
			end_schd_dt_fr_META,
			end_schd_hm_fr_META,
			end_schd_dt_to_META,
			end_schd_hm_to_META,
			st_act_dt_fr_META,
			st_act_hm_fr_META,
			st_act_dt_to_META,
			st_act_hm_to_META,
			end_act_dt_fr_META,
			end_act_hm_fr_META,
			end_act_dt_to_META,
			end_act_hm_to_META,
			yield_schd_dt_fr_META,
			yield_schd_hm_fr_META,
			yield_schd_dt_to_META,
			yield_schd_hm_to_META,
			yield_act_dt_fr_META,
			yield_act_hm_fr_META,
			yield_act_dt_to_META,
			yield_act_hm_to_META,
			rqst_dlv_rqst_dt_fr_META,
			rqst_dlv_rqst_hm_fr_META,
			rqst_dlv_rqst_dt_to_META,
			rqst_dlv_rqst_hm_to_META,
			inst_dt_fr_META,
			inst_dt_to_META,
			aprv_dt_fr_META,
			aprv_dt_to_META,
			st_ac_dt_fr_META,
			st_ac_dt_to_META,
			end_ac_dt_fr_META,
			end_ac_dt_to_META,
			yield_ac_dt_fr_META,
			yield_ac_dt_to_META,
			upd_ts_fr_META,
			upd_ts_to_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			mfg_mtd_typ_META,
			mfg_loc_site_cd_META,
			mfg_loc_site_nm_META,
			mfg_loc_wg_cd_META,
			mfg_loc_wg_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			strg_loc_grp_cd_META,
			strg_loc_grp_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_cd_META,
			oper_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			mfg_aprv_sts_typ_META,
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
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			oper_rsrc_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			mfg_inst_unit_typ_META,
			po_aprv_sts_typ_META,
			yield_typ_META,
			yield_rsn_cd_META,
			yield_rsn_nm_META,
			gd_cd_META,
			gd_nm_META,
			itm_ord_no_META,
			oper_ord_no_META,
			po_d_no_META,
			itm_mfg_inst_no_META,
			mfg_inst_no_META,
			mfg_act_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			yield_schd_no_META,
			yield_act_no_META,
			abort_flg_META,
			inc_yield_oper_flg_META,
			inst_rpt_rmrks_META,
			intr_rmrks_META,
			inst_po_cnt_rmrks_META,
			oper_inst_rpt_rmrks_META,
			oper_intr_rmrks_META,
			yield_schd_intr_rmrks_META,
			yield_schd_rpt_rmrks_META,
			insp_cnt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_mfg_inst_sub_char1_META,
			itm_mfg_inst_sub_char2_META,
			itm_mfg_inst_sub_char3_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			yield_schd_sub_char1_META,
			yield_schd_sub_char2_META,
			yield_schd_sub_char3_META,
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
			itm_grp_nm10_META,
			sppl_grp_flg1_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_flg2_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_flg3_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_flg4_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_flg5_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_flg6_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_flg7_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_flg8_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_flg9_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_flg10_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META
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
	 * HDR,Header;OPER,Operation;YIELD,Output qty. HDR,ヘッダ;OPER,工程;YIELD,出来高.<p>
	 *
	 */
	public String disp_unit1() {
		return getConstString(offset + 0, $disp_unit1);
	}

	/**
	 * HDR,Header;OPER,Operation;YIELD,Output qty. HDR,ヘッダ;OPER,工程;YIELD,出来高.<p>
	 *
	 */
	public void disp_unit1(String value) {
		setConstString(offset + 0, $disp_unit1, value);
	}


	/**
	 * INST,Order;ACT,Result INST,指図;ACT,実績.<p>
	 *
	 */
	public String disp_unit2() {
		return getConstString(offset + 1, $disp_unit2);
	}

	/**
	 * INST,Order;ACT,Result INST,指図;ACT,実績.<p>
	 *
	 */
	public void disp_unit2(String value) {
		setConstString(offset + 1, $disp_unit2, value);
	}


	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public boolean tmp_sts_sav_flg() {
		return getConstBoolean(offset + 2, $tmp_sts_sav_flg);
	}

	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public void tmp_sts_sav_flg(boolean value) {
		setConstBoolean(offset + 2, $tmp_sts_sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean tmp_sts_ord_flg() {
		return getConstBoolean(offset + 3, $tmp_sts_ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void tmp_sts_ord_flg(boolean value) {
		setConstBoolean(offset + 3, $tmp_sts_ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean tmp_sts_stt_flg() {
		return getConstBoolean(offset + 4, $tmp_sts_stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void tmp_sts_stt_flg(boolean value) {
		setConstBoolean(offset + 4, $tmp_sts_stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean tmp_sts_cmpl_flg() {
		return getConstBoolean(offset + 5, $tmp_sts_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void tmp_sts_cmpl_flg(boolean value) {
		setConstBoolean(offset + 5, $tmp_sts_cmpl_flg, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public boolean not_unschd_act_flg() {
		return getConstBoolean(offset + 6, $not_unschd_act_flg);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void not_unschd_act_flg(boolean value) {
		setConstBoolean(offset + 6, $not_unschd_act_flg, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 7, $unschd_act_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 7, $unschd_act_flg, value);
	}


	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_dt_fr() {
		return getConstDate(offset + 8, $st_schd_dt_fr);
	}

	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_dt_fr(MCDate value) {
		setConstDate(offset + 8, $st_schd_dt_fr, value);
	}


	/**
	 * Schedule start time FROM 着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_hm_fr() {
		return getConstDate(offset + 9, $st_schd_hm_fr);
	}

	/**
	 * Schedule start time FROM 着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_hm_fr(MCDate value) {
		setConstDate(offset + 9, $st_schd_hm_fr, value);
	}


	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_dt_to() {
		return getConstDate(offset + 10, $st_schd_dt_to);
	}

	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public void st_schd_dt_to(MCDate value) {
		setConstDate(offset + 10, $st_schd_dt_to, value);
	}


	/**
	 * Schedule start time TO 着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_hm_to() {
		return getConstDate(offset + 11, $st_schd_hm_to);
	}

	/**
	 * Schedule start time TO 着手予定時刻ＴＯ.<p>
	 *
	 */
	public void st_schd_hm_to(MCDate value) {
		setConstDate(offset + 11, $st_schd_hm_to, value);
	}


	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_dt_fr() {
		return getConstDate(offset + 12, $end_schd_dt_fr);
	}

	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_dt_fr(MCDate value) {
		setConstDate(offset + 12, $end_schd_dt_fr, value);
	}


	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_hm_fr() {
		return getConstDate(offset + 13, $end_schd_hm_fr);
	}

	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_hm_fr(MCDate value) {
		setConstDate(offset + 13, $end_schd_hm_fr, value);
	}


	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_dt_to() {
		return getConstDate(offset + 14, $end_schd_dt_to);
	}

	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public void end_schd_dt_to(MCDate value) {
		setConstDate(offset + 14, $end_schd_dt_to, value);
	}


	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_hm_to() {
		return getConstDate(offset + 15, $end_schd_hm_to);
	}

	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public void end_schd_hm_to(MCDate value) {
		setConstDate(offset + 15, $end_schd_hm_to, value);
	}


	/**
	 * Actual start date FROM 着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_act_dt_fr() {
		return getConstDate(offset + 16, $st_act_dt_fr);
	}

	/**
	 * Actual start date FROM 着手実績日ＦＲＯＭ.<p>
	 *
	 */
	public void st_act_dt_fr(MCDate value) {
		setConstDate(offset + 16, $st_act_dt_fr, value);
	}


	/**
	 * Actual start time FROM 着手実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_act_hm_fr() {
		return getConstDate(offset + 17, $st_act_hm_fr);
	}

	/**
	 * Actual start time FROM 着手実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void st_act_hm_fr(MCDate value) {
		setConstDate(offset + 17, $st_act_hm_fr, value);
	}


	/**
	 * Actual start date TO 着手実績日ＴＯ.<p>
	 *
	 */
	public MCDate st_act_dt_to() {
		return getConstDate(offset + 18, $st_act_dt_to);
	}

	/**
	 * Actual start date TO 着手実績日ＴＯ.<p>
	 *
	 */
	public void st_act_dt_to(MCDate value) {
		setConstDate(offset + 18, $st_act_dt_to, value);
	}


	/**
	 * Actual start time TO 着手実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate st_act_hm_to() {
		return getConstDate(offset + 19, $st_act_hm_to);
	}

	/**
	 * Actual start time TO 着手実績時刻ＴＯ.<p>
	 *
	 */
	public void st_act_hm_to(MCDate value) {
		setConstDate(offset + 19, $st_act_hm_to, value);
	}


	/**
	 * Actual end date FROM 終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_act_dt_fr() {
		return getConstDate(offset + 20, $end_act_dt_fr);
	}

	/**
	 * Actual end date FROM 終了実績日ＦＲＯＭ.<p>
	 *
	 */
	public void end_act_dt_fr(MCDate value) {
		setConstDate(offset + 20, $end_act_dt_fr, value);
	}


	/**
	 * Actual end time FROM 終了実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_act_hm_fr() {
		return getConstDate(offset + 21, $end_act_hm_fr);
	}

	/**
	 * Actual end time FROM 終了実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void end_act_hm_fr(MCDate value) {
		setConstDate(offset + 21, $end_act_hm_fr, value);
	}


	/**
	 * Actual end date TO 終了実績日ＴＯ.<p>
	 *
	 */
	public MCDate end_act_dt_to() {
		return getConstDate(offset + 22, $end_act_dt_to);
	}

	/**
	 * Actual end date TO 終了実績日ＴＯ.<p>
	 *
	 */
	public void end_act_dt_to(MCDate value) {
		setConstDate(offset + 22, $end_act_dt_to, value);
	}


	/**
	 * Actual end time TO 終了実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate end_act_hm_to() {
		return getConstDate(offset + 23, $end_act_hm_to);
	}

	/**
	 * Actual end time TO 終了実績時刻ＴＯ.<p>
	 *
	 */
	public void end_act_hm_to(MCDate value) {
		setConstDate(offset + 23, $end_act_hm_to, value);
	}


	/**
	 * Scheduled output date FROM 出来高予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate yield_schd_dt_fr() {
		return getConstDate(offset + 24, $yield_schd_dt_fr);
	}

	/**
	 * Scheduled output date FROM 出来高予定日ＦＲＯＭ.<p>
	 *
	 */
	public void yield_schd_dt_fr(MCDate value) {
		setConstDate(offset + 24, $yield_schd_dt_fr, value);
	}


	/**
	 * Output schedule time FROM 出来高予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate yield_schd_hm_fr() {
		return getConstDate(offset + 25, $yield_schd_hm_fr);
	}

	/**
	 * Output schedule time FROM 出来高予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void yield_schd_hm_fr(MCDate value) {
		setConstDate(offset + 25, $yield_schd_hm_fr, value);
	}


	/**
	 * Scheduled output date TO 出来高予定日ＴＯ.<p>
	 *
	 */
	public MCDate yield_schd_dt_to() {
		return getConstDate(offset + 26, $yield_schd_dt_to);
	}

	/**
	 * Scheduled output date TO 出来高予定日ＴＯ.<p>
	 *
	 */
	public void yield_schd_dt_to(MCDate value) {
		setConstDate(offset + 26, $yield_schd_dt_to, value);
	}


	/**
	 * Output schedule time TO 出来高予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate yield_schd_hm_to() {
		return getConstDate(offset + 27, $yield_schd_hm_to);
	}

	/**
	 * Output schedule time TO 出来高予定時刻ＴＯ.<p>
	 *
	 */
	public void yield_schd_hm_to(MCDate value) {
		setConstDate(offset + 27, $yield_schd_hm_to, value);
	}


	/**
	 * Actual output date FROM 出来高実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate yield_act_dt_fr() {
		return getConstDate(offset + 28, $yield_act_dt_fr);
	}

	/**
	 * Actual output date FROM 出来高実績日ＦＲＯＭ.<p>
	 *
	 */
	public void yield_act_dt_fr(MCDate value) {
		setConstDate(offset + 28, $yield_act_dt_fr, value);
	}


	/**
	 * Actual output time FROM 出来高実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate yield_act_hm_fr() {
		return getConstDate(offset + 29, $yield_act_hm_fr);
	}

	/**
	 * Actual output time FROM 出来高実績時刻ＦＲＯＭ.<p>
	 *
	 */
	public void yield_act_hm_fr(MCDate value) {
		setConstDate(offset + 29, $yield_act_hm_fr, value);
	}


	/**
	 * Actual output date TO 出来高実績日ＴＯ.<p>
	 *
	 */
	public MCDate yield_act_dt_to() {
		return getConstDate(offset + 30, $yield_act_dt_to);
	}

	/**
	 * Actual output date TO 出来高実績日ＴＯ.<p>
	 *
	 */
	public void yield_act_dt_to(MCDate value) {
		setConstDate(offset + 30, $yield_act_dt_to, value);
	}


	/**
	 * Actual output time TO 出来高実績時刻ＴＯ.<p>
	 *
	 */
	public MCDate yield_act_hm_to() {
		return getConstDate(offset + 31, $yield_act_hm_to);
	}

	/**
	 * Actual output time TO 出来高実績時刻ＴＯ.<p>
	 *
	 */
	public void yield_act_hm_to(MCDate value) {
		setConstDate(offset + 31, $yield_act_hm_to, value);
	}


	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_fr() {
		return getConstDate(offset + 32, $rqst_dlv_rqst_dt_fr);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_fr(MCDate value) {
		setConstDate(offset + 32, $rqst_dlv_rqst_dt_fr, value);
	}


	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_fr() {
		return getConstDate(offset + 33, $rqst_dlv_rqst_hm_fr);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_fr(MCDate value) {
		setConstDate(offset + 33, $rqst_dlv_rqst_hm_fr, value);
	}


	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_to() {
		return getConstDate(offset + 34, $rqst_dlv_rqst_dt_to);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_to(MCDate value) {
		setConstDate(offset + 34, $rqst_dlv_rqst_dt_to, value);
	}


	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_to() {
		return getConstDate(offset + 35, $rqst_dlv_rqst_hm_to);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_to(MCDate value) {
		setConstDate(offset + 35, $rqst_dlv_rqst_hm_to, value);
	}


	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_dt_fr() {
		return getConstDate(offset + 36, $inst_dt_fr);
	}

	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public void inst_dt_fr(MCDate value) {
		setConstDate(offset + 36, $inst_dt_fr, value);
	}


	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public MCDate inst_dt_to() {
		return getConstDate(offset + 37, $inst_dt_to);
	}

	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public void inst_dt_to(MCDate value) {
		setConstDate(offset + 37, $inst_dt_to, value);
	}


	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate aprv_dt_fr() {
		return getConstDate(offset + 38, $aprv_dt_fr);
	}

	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public void aprv_dt_fr(MCDate value) {
		setConstDate(offset + 38, $aprv_dt_fr, value);
	}


	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public MCDate aprv_dt_to() {
		return getConstDate(offset + 39, $aprv_dt_to);
	}

	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public void aprv_dt_to(MCDate value) {
		setConstDate(offset + 39, $aprv_dt_to, value);
	}


	/**
	 * Start recording date FROM 着手計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_ac_dt_fr() {
		return getConstDate(offset + 40, $st_ac_dt_fr);
	}

	/**
	 * Start recording date FROM 着手計上日ＦＲＯＭ.<p>
	 *
	 */
	public void st_ac_dt_fr(MCDate value) {
		setConstDate(offset + 40, $st_ac_dt_fr, value);
	}


	/**
	 * Start recording date TO 着手計上日ＴＯ.<p>
	 *
	 */
	public MCDate st_ac_dt_to() {
		return getConstDate(offset + 41, $st_ac_dt_to);
	}

	/**
	 * Start recording date TO 着手計上日ＴＯ.<p>
	 *
	 */
	public void st_ac_dt_to(MCDate value) {
		setConstDate(offset + 41, $st_ac_dt_to, value);
	}


	/**
	 * End recording date FROM 終了計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_ac_dt_fr() {
		return getConstDate(offset + 42, $end_ac_dt_fr);
	}

	/**
	 * End recording date FROM 終了計上日ＦＲＯＭ.<p>
	 *
	 */
	public void end_ac_dt_fr(MCDate value) {
		setConstDate(offset + 42, $end_ac_dt_fr, value);
	}


	/**
	 * End recording date TO 終了計上日ＴＯ.<p>
	 *
	 */
	public MCDate end_ac_dt_to() {
		return getConstDate(offset + 43, $end_ac_dt_to);
	}

	/**
	 * End recording date TO 終了計上日ＴＯ.<p>
	 *
	 */
	public void end_ac_dt_to(MCDate value) {
		setConstDate(offset + 43, $end_ac_dt_to, value);
	}


	/**
	 * Output recording date FROM 出来高計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate yield_ac_dt_fr() {
		return getConstDate(offset + 44, $yield_ac_dt_fr);
	}

	/**
	 * Output recording date FROM 出来高計上日ＦＲＯＭ.<p>
	 *
	 */
	public void yield_ac_dt_fr(MCDate value) {
		setConstDate(offset + 44, $yield_ac_dt_fr, value);
	}


	/**
	 * Output recording date TO 出来高計上日ＴＯ.<p>
	 *
	 */
	public MCDate yield_ac_dt_to() {
		return getConstDate(offset + 45, $yield_ac_dt_to);
	}

	/**
	 * Output recording date TO 出来高計上日ＴＯ.<p>
	 *
	 */
	public void yield_ac_dt_to(MCDate value) {
		setConstDate(offset + 45, $yield_ac_dt_to, value);
	}


	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public MCTimestamp upd_ts_fr() {
		return getConstTimestamp(offset + 46, $upd_ts_fr);
	}

	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public void upd_ts_fr(MCTimestamp value) {
		setConstTimestamp(offset + 46, $upd_ts_fr, value);
	}


	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public MCTimestamp upd_ts_to() {
		return getConstTimestamp(offset + 47, $upd_ts_to);
	}

	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public void upd_ts_to(MCTimestamp value) {
		setConstTimestamp(offset + 47, $upd_ts_to, value);
	}


	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 48, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 48, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 48, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 48, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 48, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 48, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 49, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 49, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 49, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 49, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 49, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 49, $pr_rate_to, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 50, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 50, $mfg_mtd_typ, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 51, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 51, $mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_loc_site_nm() {
		return getConstString(offset + 52, $mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_loc_site_nm(String value) {
		setConstString(offset + 52, $mfg_loc_site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 53, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 53, $mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String mfg_loc_wg_nm() {
		return getConstString(offset + 54, $mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void mfg_loc_wg_nm(String value) {
		setConstString(offset + 54, $mfg_loc_wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 55, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 55, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 56, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 56, $mfg_loc_grp_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 57, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 57, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location G name 格納場所Ｇ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 58, $strg_loc_grp_nm);
	}

	/**
	 * Storage location G name 格納場所Ｇ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 58, $strg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 59, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 59, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 60, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 60, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 61, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 61, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 62, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 62, $mfg_str_ln_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 63, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 63, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 64, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 64, $strg_loc_nm, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 65, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 65, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 66, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 66, $strg_str_ln_nm, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 67, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 67, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 68, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 68, $oper_loc_nm, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 69, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 69, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 70, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 70, $oper_str_ln_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 71, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 71, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 72, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 72, $oper_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 73, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 73, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 74, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 74, $sppl_nm, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 75, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 75, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 76, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 76, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 77, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 77, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 78, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 78, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 79, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 79, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 80, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 80, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 81, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 81, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 82, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 82, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 83, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 83, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 84, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 84, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 85, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 85, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 86, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 86, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 87, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 87, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 88, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 88, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 89, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 89, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 90, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 90, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 91, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 91, $wrk_nm, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 92, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 92, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 93, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 93, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 94, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 94, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 95, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 95, $inst_dpt_nm, value);
	}


	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 96, $act_usr_cd);
	}

	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 96, $act_usr_cd, value);
	}


	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 97, $act_usr_nm);
	}

	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 97, $act_usr_nm, value);
	}


	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 98, $act_dpt_cd);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 98, $act_dpt_cd, value);
	}


	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 99, $act_dpt_nm);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 99, $act_dpt_nm, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 100, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 100, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 101, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 101, $oper_usr_nm, value);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 102, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 102, $oper_rsrc, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 103, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 103, $aprv_usr_cd, value);
	}


	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 104, $aprv_usr_nm);
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 104, $aprv_usr_nm, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 105, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 105, $aprv_dpt_cd, value);
	}


	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 106, $aprv_dpt_nm);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 106, $aprv_dpt_nm, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 107, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 107, $mfg_inst_unit_typ, value);
	}


	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public String po_aprv_sts_typ() {
		return getConstString(offset + 108, $po_aprv_sts_typ);
	}

	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public void po_aprv_sts_typ(String value) {
		setConstString(offset + 108, $po_aprv_sts_typ, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 109, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 109, $yield_typ, value);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String yield_rsn_cd() {
		return getConstString(offset + 110, $yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void yield_rsn_cd(String value) {
		setConstString(offset + 110, $yield_rsn_cd, value);
	}


	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public String yield_rsn_nm() {
		return getConstString(offset + 111, $yield_rsn_nm);
	}

	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public void yield_rsn_nm(String value) {
		setConstString(offset + 111, $yield_rsn_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 112, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 112, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 113, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 113, $gd_nm, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 114, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 114, $itm_ord_no, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 115, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 115, $oper_ord_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 116, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 116, $po_d_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 117, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 117, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 118, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 118, $mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 119, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 119, $mfg_act_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 120, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 120, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 121, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 121, $oper_act_no, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 122, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 122, $yield_schd_no, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 123, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 123, $yield_act_no, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 124, $abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 124, $abort_flg, value);
	}


	/**
	 * Only mfg. order including output recording operation 出来高計上工程含む製造指図のみ.<p>
	 *
	 */
	public boolean inc_yield_oper_flg() {
		return getConstBoolean(offset + 125, $inc_yield_oper_flg);
	}

	/**
	 * Only mfg. order including output recording operation 出来高計上工程含む製造指図のみ.<p>
	 *
	 */
	public void inc_yield_oper_flg(boolean value) {
		setConstBoolean(offset + 125, $inc_yield_oper_flg, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 126, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 126, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 127, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 127, $intr_rmrks, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 128, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 128, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 129, $oper_inst_rpt_rmrks);
	}

	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 129, $oper_inst_rpt_rmrks, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_intr_rmrks() {
		return getConstString(offset + 130, $oper_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_intr_rmrks(String value) {
		setConstString(offset + 130, $oper_intr_rmrks, value);
	}


	/**
	 * Output schedule internal remarks 出来高予定内部備考.<p>
	 *
	 */
	public String yield_schd_intr_rmrks() {
		return getConstString(offset + 131, $yield_schd_intr_rmrks);
	}

	/**
	 * Output schedule internal remarks 出来高予定内部備考.<p>
	 *
	 */
	public void yield_schd_intr_rmrks(String value) {
		setConstString(offset + 131, $yield_schd_intr_rmrks, value);
	}


	/**
	 * Output schedule order sheet remarks 出来高予定指図書備考.<p>
	 *
	 */
	public String yield_schd_rpt_rmrks() {
		return getConstString(offset + 132, $yield_schd_rpt_rmrks);
	}

	/**
	 * Output schedule order sheet remarks 出来高予定指図書備考.<p>
	 *
	 */
	public void yield_schd_rpt_rmrks(String value) {
		setConstString(offset + 132, $yield_schd_rpt_rmrks, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 133, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 133, $insp_cnt_rmrks, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 134, $sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 134, $sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 135, $sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 135, $sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 136, $sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 136, $sub_char3, value);
	}


	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char1() {
		return getConstString(offset + 137, $itm_mfg_inst_sub_char1);
	}

	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char1(String value) {
		setConstString(offset + 137, $itm_mfg_inst_sub_char1, value);
	}


	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char2() {
		return getConstString(offset + 138, $itm_mfg_inst_sub_char2);
	}

	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char2(String value) {
		setConstString(offset + 138, $itm_mfg_inst_sub_char2, value);
	}


	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char3() {
		return getConstString(offset + 139, $itm_mfg_inst_sub_char3);
	}

	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char3(String value) {
		setConstString(offset + 139, $itm_mfg_inst_sub_char3, value);
	}


	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 140, $mfg_inst_sub_char1);
	}

	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 140, $mfg_inst_sub_char1, value);
	}


	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 141, $mfg_inst_sub_char2);
	}

	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 141, $mfg_inst_sub_char2, value);
	}


	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 142, $mfg_inst_sub_char3);
	}

	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 142, $mfg_inst_sub_char3, value);
	}


	/**
	 * Output schedule spare 1 出来高予定予備１.<p>
	 *
	 */
	public String yield_schd_sub_char1() {
		return getConstString(offset + 143, $yield_schd_sub_char1);
	}

	/**
	 * Output schedule spare 1 出来高予定予備１.<p>
	 *
	 */
	public void yield_schd_sub_char1(String value) {
		setConstString(offset + 143, $yield_schd_sub_char1, value);
	}


	/**
	 * Output schedule spare 2 出来高予定予備２.<p>
	 *
	 */
	public String yield_schd_sub_char2() {
		return getConstString(offset + 144, $yield_schd_sub_char2);
	}

	/**
	 * Output schedule spare 2 出来高予定予備２.<p>
	 *
	 */
	public void yield_schd_sub_char2(String value) {
		setConstString(offset + 144, $yield_schd_sub_char2, value);
	}


	/**
	 * Output schedule spare 3 出来高予定予備３.<p>
	 *
	 */
	public String yield_schd_sub_char3() {
		return getConstString(offset + 145, $yield_schd_sub_char3);
	}

	/**
	 * Output schedule spare 3 出来高予定予備３.<p>
	 *
	 */
	public void yield_schd_sub_char3(String value) {
		setConstString(offset + 145, $yield_schd_sub_char3, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 146, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 146, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 147, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 147, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 148, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 148, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 149, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 149, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 150, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 150, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 151, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 151, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 152, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 152, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 153, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 153, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 154, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 154, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 155, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 155, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 156, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 156, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 157, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 157, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 158, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 158, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 159, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 159, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 160, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 160, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 161, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 161, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 162, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 162, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 163, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 163, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 164, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 164, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 165, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 165, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 166, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 166, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 167, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 167, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 168, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 168, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 169, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 169, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 170, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 170, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 171, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 171, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 172, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 172, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 173, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 173, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 174, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 174, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 175, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 175, $itm_grp_nm10, value);
	}


	/**
	 * Subcontractor classification 1 外注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return getConstBoolean(offset + 176, $sppl_grp_flg1);
	}

	/**
	 * Subcontractor classification 1 外注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 176, $sppl_grp_flg1, value);
	}


	/**
	 * Subcontractor classification cd. 1 外注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 177, $sppl_grp_cd1);
	}

	/**
	 * Subcontractor classification cd. 1 外注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 177, $sppl_grp_cd1, value);
	}


	/**
	 * Subcontractor classification name 1 外注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 178, $sppl_grp_nm1);
	}

	/**
	 * Subcontractor classification name 1 外注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 178, $sppl_grp_nm1, value);
	}


	/**
	 * Subcontractor classification 2 外注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return getConstBoolean(offset + 179, $sppl_grp_flg2);
	}

	/**
	 * Subcontractor classification 2 外注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 179, $sppl_grp_flg2, value);
	}


	/**
	 * Subcontractor classification cd. 2 外注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 180, $sppl_grp_cd2);
	}

	/**
	 * Subcontractor classification cd. 2 外注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 180, $sppl_grp_cd2, value);
	}


	/**
	 * Subcontractor classification name 2 外注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 181, $sppl_grp_nm2);
	}

	/**
	 * Subcontractor classification name 2 外注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 181, $sppl_grp_nm2, value);
	}


	/**
	 * Subcontractor classification 3 外注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return getConstBoolean(offset + 182, $sppl_grp_flg3);
	}

	/**
	 * Subcontractor classification 3 外注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 182, $sppl_grp_flg3, value);
	}


	/**
	 * Subcontractor classification cd. 3 外注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 183, $sppl_grp_cd3);
	}

	/**
	 * Subcontractor classification cd. 3 外注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 183, $sppl_grp_cd3, value);
	}


	/**
	 * Subcontractor classification name 3 外注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 184, $sppl_grp_nm3);
	}

	/**
	 * Subcontractor classification name 3 外注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 184, $sppl_grp_nm3, value);
	}


	/**
	 * Subcontractor classification 4 外注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return getConstBoolean(offset + 185, $sppl_grp_flg4);
	}

	/**
	 * Subcontractor classification 4 外注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 185, $sppl_grp_flg4, value);
	}


	/**
	 * Subcontractor classification cd. 4 外注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 186, $sppl_grp_cd4);
	}

	/**
	 * Subcontractor classification cd. 4 外注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 186, $sppl_grp_cd4, value);
	}


	/**
	 * Subcontractor classification name 4 外注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 187, $sppl_grp_nm4);
	}

	/**
	 * Subcontractor classification name 4 外注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 187, $sppl_grp_nm4, value);
	}


	/**
	 * Subcontractor classification 5 外注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return getConstBoolean(offset + 188, $sppl_grp_flg5);
	}

	/**
	 * Subcontractor classification 5 外注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 188, $sppl_grp_flg5, value);
	}


	/**
	 * Subcontractor classification cd. 5 外注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 189, $sppl_grp_cd5);
	}

	/**
	 * Subcontractor classification cd. 5 外注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 189, $sppl_grp_cd5, value);
	}


	/**
	 * Subcontractor classification name 5 外注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 190, $sppl_grp_nm5);
	}

	/**
	 * Subcontractor classification name 5 外注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 190, $sppl_grp_nm5, value);
	}


	/**
	 * Subcontractor classification 6 外注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return getConstBoolean(offset + 191, $sppl_grp_flg6);
	}

	/**
	 * Subcontractor classification 6 外注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 191, $sppl_grp_flg6, value);
	}


	/**
	 * Subcontractor classification cd. 6 外注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 192, $sppl_grp_cd6);
	}

	/**
	 * Subcontractor classification cd. 6 外注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 192, $sppl_grp_cd6, value);
	}


	/**
	 * Subcontractor classification name 6 外注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 193, $sppl_grp_nm6);
	}

	/**
	 * Subcontractor classification name 6 外注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 193, $sppl_grp_nm6, value);
	}


	/**
	 * Subcontractor classification 7 外注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return getConstBoolean(offset + 194, $sppl_grp_flg7);
	}

	/**
	 * Subcontractor classification 7 外注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 194, $sppl_grp_flg7, value);
	}


	/**
	 * Subcontractor classification cd. 7 外注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 195, $sppl_grp_cd7);
	}

	/**
	 * Subcontractor classification cd. 7 外注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 195, $sppl_grp_cd7, value);
	}


	/**
	 * Subcontractor classification name 7 外注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 196, $sppl_grp_nm7);
	}

	/**
	 * Subcontractor classification name 7 外注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 196, $sppl_grp_nm7, value);
	}


	/**
	 * Subcontractor classification 8 外注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return getConstBoolean(offset + 197, $sppl_grp_flg8);
	}

	/**
	 * Subcontractor classification 8 外注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 197, $sppl_grp_flg8, value);
	}


	/**
	 * Subcontractor classification cd. 8 外注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 198, $sppl_grp_cd8);
	}

	/**
	 * Subcontractor classification cd. 8 外注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 198, $sppl_grp_cd8, value);
	}


	/**
	 * Subcontractor classification name 8 外注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 199, $sppl_grp_nm8);
	}

	/**
	 * Subcontractor classification name 8 外注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 199, $sppl_grp_nm8, value);
	}


	/**
	 * Subcontractor classification 9 外注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return getConstBoolean(offset + 200, $sppl_grp_flg9);
	}

	/**
	 * Subcontractor classification 9 外注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 200, $sppl_grp_flg9, value);
	}


	/**
	 * Subcontractor classification cd. 9 外注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 201, $sppl_grp_cd9);
	}

	/**
	 * Subcontractor classification cd. 9 外注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 201, $sppl_grp_cd9, value);
	}


	/**
	 * Subcontractor classification name 9 外注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 202, $sppl_grp_nm9);
	}

	/**
	 * Subcontractor classification name 9 外注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 202, $sppl_grp_nm9, value);
	}


	/**
	 * Subcontractor classification 10 外注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return getConstBoolean(offset + 203, $sppl_grp_flg10);
	}

	/**
	 * Subcontractor classification 10 外注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 203, $sppl_grp_flg10, value);
	}


	/**
	 * Subcontractor classification cd. 10 外注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 204, $sppl_grp_cd10);
	}

	/**
	 * Subcontractor classification cd. 10 外注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 204, $sppl_grp_cd10, value);
	}


	/**
	 * Subcontractor classification name 10 外注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 205, $sppl_grp_nm10);
	}

	/**
	 * Subcontractor classification name 10 外注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 205, $sppl_grp_nm10, value);
	}


	public String getString(String name) {
		if ($disp_unit1.equalsIgnoreCase(name)) {
			return disp_unit1();
		}
		if ($disp_unit2.equalsIgnoreCase(name)) {
			return disp_unit2();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($yield_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_intr_rmrks();
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_rpt_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			return st_schd_dt_fr();
		}
		if ($st_schd_hm_fr.equalsIgnoreCase(name)) {
			return st_schd_hm_fr();
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			return st_schd_dt_to();
		}
		if ($st_schd_hm_to.equalsIgnoreCase(name)) {
			return st_schd_hm_to();
		}
		if ($end_schd_dt_fr.equalsIgnoreCase(name)) {
			return end_schd_dt_fr();
		}
		if ($end_schd_hm_fr.equalsIgnoreCase(name)) {
			return end_schd_hm_fr();
		}
		if ($end_schd_dt_to.equalsIgnoreCase(name)) {
			return end_schd_dt_to();
		}
		if ($end_schd_hm_to.equalsIgnoreCase(name)) {
			return end_schd_hm_to();
		}
		if ($st_act_dt_fr.equalsIgnoreCase(name)) {
			return st_act_dt_fr();
		}
		if ($st_act_hm_fr.equalsIgnoreCase(name)) {
			return st_act_hm_fr();
		}
		if ($st_act_dt_to.equalsIgnoreCase(name)) {
			return st_act_dt_to();
		}
		if ($st_act_hm_to.equalsIgnoreCase(name)) {
			return st_act_hm_to();
		}
		if ($end_act_dt_fr.equalsIgnoreCase(name)) {
			return end_act_dt_fr();
		}
		if ($end_act_hm_fr.equalsIgnoreCase(name)) {
			return end_act_hm_fr();
		}
		if ($end_act_dt_to.equalsIgnoreCase(name)) {
			return end_act_dt_to();
		}
		if ($end_act_hm_to.equalsIgnoreCase(name)) {
			return end_act_hm_to();
		}
		if ($yield_schd_dt_fr.equalsIgnoreCase(name)) {
			return yield_schd_dt_fr();
		}
		if ($yield_schd_hm_fr.equalsIgnoreCase(name)) {
			return yield_schd_hm_fr();
		}
		if ($yield_schd_dt_to.equalsIgnoreCase(name)) {
			return yield_schd_dt_to();
		}
		if ($yield_schd_hm_to.equalsIgnoreCase(name)) {
			return yield_schd_hm_to();
		}
		if ($yield_act_dt_fr.equalsIgnoreCase(name)) {
			return yield_act_dt_fr();
		}
		if ($yield_act_hm_fr.equalsIgnoreCase(name)) {
			return yield_act_hm_fr();
		}
		if ($yield_act_dt_to.equalsIgnoreCase(name)) {
			return yield_act_dt_to();
		}
		if ($yield_act_hm_to.equalsIgnoreCase(name)) {
			return yield_act_hm_to();
		}
		if ($rqst_dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_fr();
		}
		if ($rqst_dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm_fr();
		}
		if ($rqst_dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_to();
		}
		if ($rqst_dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm_to();
		}
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			return inst_dt_fr();
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			return inst_dt_to();
		}
		if ($aprv_dt_fr.equalsIgnoreCase(name)) {
			return aprv_dt_fr();
		}
		if ($aprv_dt_to.equalsIgnoreCase(name)) {
			return aprv_dt_to();
		}
		if ($st_ac_dt_fr.equalsIgnoreCase(name)) {
			return st_ac_dt_fr();
		}
		if ($st_ac_dt_to.equalsIgnoreCase(name)) {
			return st_ac_dt_to();
		}
		if ($end_ac_dt_fr.equalsIgnoreCase(name)) {
			return end_ac_dt_fr();
		}
		if ($end_ac_dt_to.equalsIgnoreCase(name)) {
			return end_ac_dt_to();
		}
		if ($yield_ac_dt_fr.equalsIgnoreCase(name)) {
			return yield_ac_dt_fr();
		}
		if ($yield_ac_dt_to.equalsIgnoreCase(name)) {
			return yield_ac_dt_to();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			return upd_ts_fr();
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			return upd_ts_to();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($tmp_sts_sav_flg.equalsIgnoreCase(name)) {
			return tmp_sts_sav_flg();
		}
		if ($tmp_sts_ord_flg.equalsIgnoreCase(name)) {
			return tmp_sts_ord_flg();
		}
		if ($tmp_sts_stt_flg.equalsIgnoreCase(name)) {
			return tmp_sts_stt_flg();
		}
		if ($tmp_sts_cmpl_flg.equalsIgnoreCase(name)) {
			return tmp_sts_cmpl_flg();
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			return not_unschd_act_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($inc_yield_oper_flg.equalsIgnoreCase(name)) {
			return inc_yield_oper_flg();
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($disp_unit1.equalsIgnoreCase(name)) {
			return disp_unit1();
		}
		if ($disp_unit2.equalsIgnoreCase(name)) {
			return disp_unit2();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($mfg_loc_site_nm.equalsIgnoreCase(name)) {
			return mfg_loc_site_nm();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			return mfg_loc_wg_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			return yield_rsn_cd();
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			return yield_rsn_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_inst_rpt_rmrks();
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_intr_rmrks();
		}
		if ($yield_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_intr_rmrks();
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_rpt_rmrks();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
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
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			return st_schd_dt_fr();
		}
		if ($st_schd_hm_fr.equalsIgnoreCase(name)) {
			return st_schd_hm_fr();
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			return st_schd_dt_to();
		}
		if ($st_schd_hm_to.equalsIgnoreCase(name)) {
			return st_schd_hm_to();
		}
		if ($end_schd_dt_fr.equalsIgnoreCase(name)) {
			return end_schd_dt_fr();
		}
		if ($end_schd_hm_fr.equalsIgnoreCase(name)) {
			return end_schd_hm_fr();
		}
		if ($end_schd_dt_to.equalsIgnoreCase(name)) {
			return end_schd_dt_to();
		}
		if ($end_schd_hm_to.equalsIgnoreCase(name)) {
			return end_schd_hm_to();
		}
		if ($st_act_dt_fr.equalsIgnoreCase(name)) {
			return st_act_dt_fr();
		}
		if ($st_act_hm_fr.equalsIgnoreCase(name)) {
			return st_act_hm_fr();
		}
		if ($st_act_dt_to.equalsIgnoreCase(name)) {
			return st_act_dt_to();
		}
		if ($st_act_hm_to.equalsIgnoreCase(name)) {
			return st_act_hm_to();
		}
		if ($end_act_dt_fr.equalsIgnoreCase(name)) {
			return end_act_dt_fr();
		}
		if ($end_act_hm_fr.equalsIgnoreCase(name)) {
			return end_act_hm_fr();
		}
		if ($end_act_dt_to.equalsIgnoreCase(name)) {
			return end_act_dt_to();
		}
		if ($end_act_hm_to.equalsIgnoreCase(name)) {
			return end_act_hm_to();
		}
		if ($yield_schd_dt_fr.equalsIgnoreCase(name)) {
			return yield_schd_dt_fr();
		}
		if ($yield_schd_hm_fr.equalsIgnoreCase(name)) {
			return yield_schd_hm_fr();
		}
		if ($yield_schd_dt_to.equalsIgnoreCase(name)) {
			return yield_schd_dt_to();
		}
		if ($yield_schd_hm_to.equalsIgnoreCase(name)) {
			return yield_schd_hm_to();
		}
		if ($yield_act_dt_fr.equalsIgnoreCase(name)) {
			return yield_act_dt_fr();
		}
		if ($yield_act_hm_fr.equalsIgnoreCase(name)) {
			return yield_act_hm_fr();
		}
		if ($yield_act_dt_to.equalsIgnoreCase(name)) {
			return yield_act_dt_to();
		}
		if ($yield_act_hm_to.equalsIgnoreCase(name)) {
			return yield_act_hm_to();
		}
		if ($rqst_dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_fr();
		}
		if ($rqst_dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm_fr();
		}
		if ($rqst_dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_to();
		}
		if ($rqst_dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_hm_to();
		}
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			return inst_dt_fr();
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			return inst_dt_to();
		}
		if ($aprv_dt_fr.equalsIgnoreCase(name)) {
			return aprv_dt_fr();
		}
		if ($aprv_dt_to.equalsIgnoreCase(name)) {
			return aprv_dt_to();
		}
		if ($st_ac_dt_fr.equalsIgnoreCase(name)) {
			return st_ac_dt_fr();
		}
		if ($st_ac_dt_to.equalsIgnoreCase(name)) {
			return st_ac_dt_to();
		}
		if ($end_ac_dt_fr.equalsIgnoreCase(name)) {
			return end_ac_dt_fr();
		}
		if ($end_ac_dt_to.equalsIgnoreCase(name)) {
			return end_ac_dt_to();
		}
		if ($yield_ac_dt_fr.equalsIgnoreCase(name)) {
			return yield_ac_dt_fr();
		}
		if ($yield_ac_dt_to.equalsIgnoreCase(name)) {
			return yield_ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			return upd_ts_fr();
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			return upd_ts_to();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($tmp_sts_sav_flg.equalsIgnoreCase(name)) {
			return tmp_sts_sav_flg();
		}
		if ($tmp_sts_ord_flg.equalsIgnoreCase(name)) {
			return tmp_sts_ord_flg();
		}
		if ($tmp_sts_stt_flg.equalsIgnoreCase(name)) {
			return tmp_sts_stt_flg();
		}
		if ($tmp_sts_cmpl_flg.equalsIgnoreCase(name)) {
			return tmp_sts_cmpl_flg();
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			return not_unschd_act_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($inc_yield_oper_flg.equalsIgnoreCase(name)) {
			return inc_yield_oper_flg();
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_unit1.equalsIgnoreCase(name)) {
			disp_unit1(value);
			return;
		}
		if ($disp_unit2.equalsIgnoreCase(name)) {
			disp_unit2(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
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
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($yield_schd_intr_rmrks.equalsIgnoreCase(name)) {
			yield_schd_intr_rmrks(value);
			return;
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_schd_rpt_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			st_schd_dt_fr(value);
			return;
		}
		if ($st_schd_hm_fr.equalsIgnoreCase(name)) {
			st_schd_hm_fr(value);
			return;
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			st_schd_dt_to(value);
			return;
		}
		if ($st_schd_hm_to.equalsIgnoreCase(name)) {
			st_schd_hm_to(value);
			return;
		}
		if ($end_schd_dt_fr.equalsIgnoreCase(name)) {
			end_schd_dt_fr(value);
			return;
		}
		if ($end_schd_hm_fr.equalsIgnoreCase(name)) {
			end_schd_hm_fr(value);
			return;
		}
		if ($end_schd_dt_to.equalsIgnoreCase(name)) {
			end_schd_dt_to(value);
			return;
		}
		if ($end_schd_hm_to.equalsIgnoreCase(name)) {
			end_schd_hm_to(value);
			return;
		}
		if ($st_act_dt_fr.equalsIgnoreCase(name)) {
			st_act_dt_fr(value);
			return;
		}
		if ($st_act_hm_fr.equalsIgnoreCase(name)) {
			st_act_hm_fr(value);
			return;
		}
		if ($st_act_dt_to.equalsIgnoreCase(name)) {
			st_act_dt_to(value);
			return;
		}
		if ($st_act_hm_to.equalsIgnoreCase(name)) {
			st_act_hm_to(value);
			return;
		}
		if ($end_act_dt_fr.equalsIgnoreCase(name)) {
			end_act_dt_fr(value);
			return;
		}
		if ($end_act_hm_fr.equalsIgnoreCase(name)) {
			end_act_hm_fr(value);
			return;
		}
		if ($end_act_dt_to.equalsIgnoreCase(name)) {
			end_act_dt_to(value);
			return;
		}
		if ($end_act_hm_to.equalsIgnoreCase(name)) {
			end_act_hm_to(value);
			return;
		}
		if ($yield_schd_dt_fr.equalsIgnoreCase(name)) {
			yield_schd_dt_fr(value);
			return;
		}
		if ($yield_schd_hm_fr.equalsIgnoreCase(name)) {
			yield_schd_hm_fr(value);
			return;
		}
		if ($yield_schd_dt_to.equalsIgnoreCase(name)) {
			yield_schd_dt_to(value);
			return;
		}
		if ($yield_schd_hm_to.equalsIgnoreCase(name)) {
			yield_schd_hm_to(value);
			return;
		}
		if ($yield_act_dt_fr.equalsIgnoreCase(name)) {
			yield_act_dt_fr(value);
			return;
		}
		if ($yield_act_hm_fr.equalsIgnoreCase(name)) {
			yield_act_hm_fr(value);
			return;
		}
		if ($yield_act_dt_to.equalsIgnoreCase(name)) {
			yield_act_dt_to(value);
			return;
		}
		if ($yield_act_hm_to.equalsIgnoreCase(name)) {
			yield_act_hm_to(value);
			return;
		}
		if ($rqst_dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_fr(value);
			return;
		}
		if ($rqst_dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm_fr(value);
			return;
		}
		if ($rqst_dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_to(value);
			return;
		}
		if ($rqst_dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm_to(value);
			return;
		}
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			inst_dt_fr(value);
			return;
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			inst_dt_to(value);
			return;
		}
		if ($aprv_dt_fr.equalsIgnoreCase(name)) {
			aprv_dt_fr(value);
			return;
		}
		if ($aprv_dt_to.equalsIgnoreCase(name)) {
			aprv_dt_to(value);
			return;
		}
		if ($st_ac_dt_fr.equalsIgnoreCase(name)) {
			st_ac_dt_fr(value);
			return;
		}
		if ($st_ac_dt_to.equalsIgnoreCase(name)) {
			st_ac_dt_to(value);
			return;
		}
		if ($end_ac_dt_fr.equalsIgnoreCase(name)) {
			end_ac_dt_fr(value);
			return;
		}
		if ($end_ac_dt_to.equalsIgnoreCase(name)) {
			end_ac_dt_to(value);
			return;
		}
		if ($yield_ac_dt_fr.equalsIgnoreCase(name)) {
			yield_ac_dt_fr(value);
			return;
		}
		if ($yield_ac_dt_to.equalsIgnoreCase(name)) {
			yield_ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			upd_ts_fr(value);
			return;
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			upd_ts_to(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($tmp_sts_sav_flg.equalsIgnoreCase(name)) {
			tmp_sts_sav_flg(value);
			return;
		}
		if ($tmp_sts_ord_flg.equalsIgnoreCase(name)) {
			tmp_sts_ord_flg(value);
			return;
		}
		if ($tmp_sts_stt_flg.equalsIgnoreCase(name)) {
			tmp_sts_stt_flg(value);
			return;
		}
		if ($tmp_sts_cmpl_flg.equalsIgnoreCase(name)) {
			tmp_sts_cmpl_flg(value);
			return;
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			not_unschd_act_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($inc_yield_oper_flg.equalsIgnoreCase(name)) {
			inc_yield_oper_flg(value);
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_unit1.equalsIgnoreCase(name)) {
			disp_unit1(value);
			return;
		}
		if ($disp_unit2.equalsIgnoreCase(name)) {
			disp_unit2(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
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
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_wg_nm.equalsIgnoreCase(name)) {
			mfg_loc_wg_nm(value);
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
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
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
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
			return;
		}
		if ($yield_rsn_cd.equalsIgnoreCase(name)) {
			yield_rsn_cd(value);
			return;
		}
		if ($yield_rsn_nm.equalsIgnoreCase(name)) {
			yield_rsn_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
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
		if ($oper_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_inst_rpt_rmrks(value);
			return;
		}
		if ($oper_intr_rmrks.equalsIgnoreCase(name)) {
			oper_intr_rmrks(value);
			return;
		}
		if ($yield_schd_intr_rmrks.equalsIgnoreCase(name)) {
			yield_schd_intr_rmrks(value);
			return;
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_schd_rpt_rmrks(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
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
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
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
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($st_schd_dt_fr.equalsIgnoreCase(name)) {
			st_schd_dt_fr(value);
			return;
		}
		if ($st_schd_hm_fr.equalsIgnoreCase(name)) {
			st_schd_hm_fr(value);
			return;
		}
		if ($st_schd_dt_to.equalsIgnoreCase(name)) {
			st_schd_dt_to(value);
			return;
		}
		if ($st_schd_hm_to.equalsIgnoreCase(name)) {
			st_schd_hm_to(value);
			return;
		}
		if ($end_schd_dt_fr.equalsIgnoreCase(name)) {
			end_schd_dt_fr(value);
			return;
		}
		if ($end_schd_hm_fr.equalsIgnoreCase(name)) {
			end_schd_hm_fr(value);
			return;
		}
		if ($end_schd_dt_to.equalsIgnoreCase(name)) {
			end_schd_dt_to(value);
			return;
		}
		if ($end_schd_hm_to.equalsIgnoreCase(name)) {
			end_schd_hm_to(value);
			return;
		}
		if ($st_act_dt_fr.equalsIgnoreCase(name)) {
			st_act_dt_fr(value);
			return;
		}
		if ($st_act_hm_fr.equalsIgnoreCase(name)) {
			st_act_hm_fr(value);
			return;
		}
		if ($st_act_dt_to.equalsIgnoreCase(name)) {
			st_act_dt_to(value);
			return;
		}
		if ($st_act_hm_to.equalsIgnoreCase(name)) {
			st_act_hm_to(value);
			return;
		}
		if ($end_act_dt_fr.equalsIgnoreCase(name)) {
			end_act_dt_fr(value);
			return;
		}
		if ($end_act_hm_fr.equalsIgnoreCase(name)) {
			end_act_hm_fr(value);
			return;
		}
		if ($end_act_dt_to.equalsIgnoreCase(name)) {
			end_act_dt_to(value);
			return;
		}
		if ($end_act_hm_to.equalsIgnoreCase(name)) {
			end_act_hm_to(value);
			return;
		}
		if ($yield_schd_dt_fr.equalsIgnoreCase(name)) {
			yield_schd_dt_fr(value);
			return;
		}
		if ($yield_schd_hm_fr.equalsIgnoreCase(name)) {
			yield_schd_hm_fr(value);
			return;
		}
		if ($yield_schd_dt_to.equalsIgnoreCase(name)) {
			yield_schd_dt_to(value);
			return;
		}
		if ($yield_schd_hm_to.equalsIgnoreCase(name)) {
			yield_schd_hm_to(value);
			return;
		}
		if ($yield_act_dt_fr.equalsIgnoreCase(name)) {
			yield_act_dt_fr(value);
			return;
		}
		if ($yield_act_hm_fr.equalsIgnoreCase(name)) {
			yield_act_hm_fr(value);
			return;
		}
		if ($yield_act_dt_to.equalsIgnoreCase(name)) {
			yield_act_dt_to(value);
			return;
		}
		if ($yield_act_hm_to.equalsIgnoreCase(name)) {
			yield_act_hm_to(value);
			return;
		}
		if ($rqst_dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_fr(value);
			return;
		}
		if ($rqst_dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm_fr(value);
			return;
		}
		if ($rqst_dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_to(value);
			return;
		}
		if ($rqst_dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_hm_to(value);
			return;
		}
		if ($inst_dt_fr.equalsIgnoreCase(name)) {
			inst_dt_fr(value);
			return;
		}
		if ($inst_dt_to.equalsIgnoreCase(name)) {
			inst_dt_to(value);
			return;
		}
		if ($aprv_dt_fr.equalsIgnoreCase(name)) {
			aprv_dt_fr(value);
			return;
		}
		if ($aprv_dt_to.equalsIgnoreCase(name)) {
			aprv_dt_to(value);
			return;
		}
		if ($st_ac_dt_fr.equalsIgnoreCase(name)) {
			st_ac_dt_fr(value);
			return;
		}
		if ($st_ac_dt_to.equalsIgnoreCase(name)) {
			st_ac_dt_to(value);
			return;
		}
		if ($end_ac_dt_fr.equalsIgnoreCase(name)) {
			end_ac_dt_fr(value);
			return;
		}
		if ($end_ac_dt_to.equalsIgnoreCase(name)) {
			end_ac_dt_to(value);
			return;
		}
		if ($yield_ac_dt_fr.equalsIgnoreCase(name)) {
			yield_ac_dt_fr(value);
			return;
		}
		if ($yield_ac_dt_to.equalsIgnoreCase(name)) {
			yield_ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($upd_ts_fr.equalsIgnoreCase(name)) {
			upd_ts_fr(value);
			return;
		}
		if ($upd_ts_to.equalsIgnoreCase(name)) {
			upd_ts_to(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($tmp_sts_sav_flg.equalsIgnoreCase(name)) {
			tmp_sts_sav_flg(value);
			return;
		}
		if ($tmp_sts_ord_flg.equalsIgnoreCase(name)) {
			tmp_sts_ord_flg(value);
			return;
		}
		if ($tmp_sts_stt_flg.equalsIgnoreCase(name)) {
			tmp_sts_stt_flg(value);
			return;
		}
		if ($tmp_sts_cmpl_flg.equalsIgnoreCase(name)) {
			tmp_sts_cmpl_flg(value);
			return;
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			not_unschd_act_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($inc_yield_oper_flg.equalsIgnoreCase(name)) {
			inc_yield_oper_flg(value);
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
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

