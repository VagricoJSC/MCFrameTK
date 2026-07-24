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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * UPD,Order,UPD;ALLOC,Allocate,ALLOC;DEL,Cancel order,DEL;APRV,Approve,APRV;APRV_DEL,Cancel approval,APRV_DEL;PRNT_INST,Issue order sheet ,PRNT_INST;PRNT_STKLST,Issue identification tag,PRNT_STKLST;REF,View,REF UPD,指図する,UPD;ALLOC,引当する,ALLOC;DEL,指図を取り消す,DEL;APRV,承認する,APRV;APRV_DEL,承認を取り消す,APRV_DEL;PRNT_INST,指図書発行,PRNT_INST;PRNT_STKLST,現品票発行,PRNT_STKLST;REF,参照する,REF.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * HDR,Header,HDR;OPER,Operation,OPER HDR,ヘッダ,HDR;OPER,工程,OPER.<p>
	 *
	 */
	public static final String $srch_mode = "srch_mode";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $tmp_sts_yet_flg = "tmp_sts_yet_flg";
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
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public static final String $not_inst_prnt_flg = "not_inst_prnt_flg";
	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	/**
	 * Identification tag unissued 現品票未発行.<p>
	 *
	 */
	public static final String $not_stk_lst_issue_flg = "not_stk_lst_issue_flg";
	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
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
	 * Before frozen 凍結前.<p>
	 *
	 */
	public static final String $before_frozen_flg = "before_frozen_flg";
	/**
	 * Frozen 凍結.<p>
	 *
	 */
	public static final String $frozen_flg = "frozen_flg";
	public static final String $st_schd_dt_p = "st_schd_dt_p";
	public static final String $end_schd_dt_p = "end_schd_dt_p";
	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public static final String $comp_dt_from_oper_flg = "comp_dt_from_oper_flg";
	public static final String $rqst_dlv_rqst_dt_p = "rqst_dlv_rqst_dt_p";
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
	 * With unallocated only 未引当ありのみ.<p>
	 *
	 */
	public static final String $not_alloc_srch_flg = "not_alloc_srch_flg";
	/**
	 * Without unallocated only 未引当なしのみ.<p>
	 *
	 */
	public static final String $all_alloc_srch_flg = "all_alloc_srch_flg";
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
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	public static final String $itm_typ_p = "itm_typ_p";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Exclude unfirm order オーダ未確定除く.<p>
	 *
	 */
	public static final String $not_srch_opn_flg = "not_srch_opn_flg";
	/**
	 * Exclude saved order オーダ保存除く.<p>
	 *
	 */
	public static final String $not_srch_sav_flg = "not_srch_sav_flg";
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
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	public static final String $sno_p = "sno_p";
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
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
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
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
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
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $sppl_grp_p = "sppl_grp_p";

	public static final String $st_schd_dt_fr = $st_schd_dt_p + ".ymd_fr";
	public static final String $st_schd_hm_fr = $st_schd_dt_p + ".hm_fr";
	public static final String $st_schd_dt_to = $st_schd_dt_p + ".ymd_to";
	public static final String $st_schd_hm_to = $st_schd_dt_p + ".hm_to";
	public static final String $end_schd_dt_fr = $end_schd_dt_p + ".ymd_fr";
	public static final String $end_schd_hm_fr = $end_schd_dt_p + ".hm_fr";
	public static final String $end_schd_dt_to = $end_schd_dt_p + ".ymd_to";
	public static final String $end_schd_hm_to = $end_schd_dt_p + ".hm_to";
	public static final String $rqst_dlv_rqst_dt_fr = $rqst_dlv_rqst_dt_p + ".ymd_fr";
	public static final String $rqst_dlv_rqst_hm_fr = $rqst_dlv_rqst_dt_p + ".hm_fr";
	public static final String $rqst_dlv_rqst_dt_to = $rqst_dlv_rqst_dt_p + ".ymd_to";
	public static final String $rqst_dlv_rqst_hm_to = $rqst_dlv_rqst_dt_p + ".hm_to";
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
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $sppl_grp_lab1 = $sppl_grp_p + ".bp_grp_lab1";
	public static final String $sppl_grp_flg1 = $sppl_grp_p + ".bp_grp_flg1";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_lab2 = $sppl_grp_p + ".bp_grp_lab2";
	public static final String $sppl_grp_flg2 = $sppl_grp_p + ".bp_grp_flg2";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_lab3 = $sppl_grp_p + ".bp_grp_lab3";
	public static final String $sppl_grp_flg3 = $sppl_grp_p + ".bp_grp_flg3";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_lab4 = $sppl_grp_p + ".bp_grp_lab4";
	public static final String $sppl_grp_flg4 = $sppl_grp_p + ".bp_grp_flg4";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_lab5 = $sppl_grp_p + ".bp_grp_lab5";
	public static final String $sppl_grp_flg5 = $sppl_grp_p + ".bp_grp_flg5";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_lab6 = $sppl_grp_p + ".bp_grp_lab6";
	public static final String $sppl_grp_flg6 = $sppl_grp_p + ".bp_grp_flg6";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_lab7 = $sppl_grp_p + ".bp_grp_lab7";
	public static final String $sppl_grp_flg7 = $sppl_grp_p + ".bp_grp_flg7";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_lab8 = $sppl_grp_p + ".bp_grp_lab8";
	public static final String $sppl_grp_flg8 = $sppl_grp_p + ".bp_grp_flg8";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_lab9 = $sppl_grp_p + ".bp_grp_lab9";
	public static final String $sppl_grp_flg9 = $sppl_grp_p + ".bp_grp_flg9";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_lab10 = $sppl_grp_p + ".bp_grp_lab10";
	public static final String $sppl_grp_flg10 = $sppl_grp_p + ".bp_grp_flg10";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta srch_mode_META = createStringMeta($srch_mode);
	public static final MCMeta tmp_sts_yet_flg_META = createCommonMeta($tmp_sts_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_sav_flg_META = createCommonMeta($tmp_sts_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_ord_flg_META = createCommonMeta($tmp_sts_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_stt_flg_META = createCommonMeta($tmp_sts_stt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_sts_cmpl_flg_META = createCommonMeta($tmp_sts_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_inst_prnt_flg_META = createCommonMeta($not_inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_stk_lst_issue_flg_META = createCommonMeta($not_stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mes_tgt_flg_META = createCommonMeta($mes_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_mes_tgt_flg_META = createCommonMeta($not_mes_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_unschd_act_flg_META = createCommonMeta($not_unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_act_flg_META = createCommonMeta($unschd_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta before_frozen_flg_META = createCommonMeta($before_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta frozen_flg_META = createCommonMeta($frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_schd_dt_p_META = createInnerRowMeta($st_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta end_schd_dt_p_META = createInnerRowMeta($end_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta comp_dt_from_oper_flg_META = createCommonMeta($comp_dt_from_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_dlv_rqst_dt_p_META = createInnerRowMeta($rqst_dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta inst_dt_fr_META = createCommonMeta($inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dt_to_META = createCommonMeta($inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
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
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta not_alloc_srch_flg_META = createCommonMeta($not_alloc_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_alloc_srch_flg_META = createCommonMeta($all_alloc_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta not_srch_opn_flg_META = createCommonMeta($not_srch_opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_srch_sav_flg_META = createCommonMeta($not_srch_sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta po_aprv_sts_typ_META = createCommonMeta($po_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta po_aprv_sts_typ_nm_META = createCommonMeta($po_aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta aprv_dt_fr_META = createCommonMeta($aprv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dt_to_META = createCommonMeta($aprv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_aprv_sts_typ_META = createCommonMeta($mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta mfg_aprv_sts_typ_nm_META = createCommonMeta($mfg_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_INST_INTR_RMRKS);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta oper_inst_rpt_rmrks_META = createCommonMeta($oper_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta oper_intr_rmrks_META = createCommonMeta($oper_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta itm_mfg_inst_sub_char1_META = createCommonMeta($itm_mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR1);
	public static final MCMeta itm_mfg_inst_sub_char2_META = createCommonMeta($itm_mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR2);
	public static final MCMeta itm_mfg_inst_sub_char3_META = createCommonMeta($itm_mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.ITM_MFG_INST_SUB_CHAR3);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta oper_inst_sub_char1_META = createCommonMeta($oper_inst_sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char2_META = createCommonMeta($oper_inst_sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char3_META = createCommonMeta($oper_inst_sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			srch_mode_META,
			tmp_sts_yet_flg_META,
			tmp_sts_sav_flg_META,
			tmp_sts_ord_flg_META,
			tmp_sts_stt_flg_META,
			tmp_sts_cmpl_flg_META,
			not_inst_prnt_flg_META,
			inst_prnt_flg_META,
			not_stk_lst_issue_flg_META,
			stk_lst_issue_flg_META,
			mes_tgt_flg_META,
			not_mes_tgt_flg_META,
			not_unschd_act_flg_META,
			unschd_act_flg_META,
			before_frozen_flg_META,
			frozen_flg_META,
			st_schd_dt_p_META,
			end_schd_dt_p_META,
			comp_dt_from_oper_flg_META,
			rqst_dlv_rqst_dt_p_META,
			inst_dt_fr_META,
			inst_dt_to_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
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
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_cd_META,
			oper_nm_META,
			not_alloc_srch_flg_META,
			all_alloc_srch_flg_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_p_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			itm_p_META,
			not_srch_opn_flg_META,
			not_srch_sav_flg_META,
			lot_no_META,
			sublot_no_META,
			mfg_inst_no_META,
			po_d_no_META,
			sno_p_META,
			itm_ord_no_META,
			itm_mfg_inst_no_META,
			po_aprv_sts_typ_META,
			po_aprv_sts_typ_nm_META,
			oper_ord_no_META,
			oper_inst_no_META,
			disp_pd_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			oper_rsrc_META,
			aprv_dt_fr_META,
			aprv_dt_to_META,
			mfg_aprv_sts_typ_META,
			mfg_aprv_sts_typ_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			abort_flg_META,
			inst_rpt_rmrks_META,
			intr_rmrks_META,
			inst_po_cnt_rmrks_META,
			oper_inst_rpt_rmrks_META,
			oper_intr_rmrks_META,
			itm_mfg_inst_sub_char1_META,
			itm_mfg_inst_sub_char2_META,
			itm_mfg_inst_sub_char3_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			oper_inst_sub_char1_META,
			oper_inst_sub_char2_META,
			oper_inst_sub_char3_META,
			itm_grp_p_META,
			sppl_grp_p_META
		},
		new String[][]{
			{
				"st_schd_dt_fr",
				"st_schd_hm_fr",
				"st_schd_dt_to",
				"st_schd_hm_to",
				"end_schd_dt_fr",
				"end_schd_hm_fr",
				"end_schd_dt_to",
				"end_schd_hm_to",
				"rqst_dlv_rqst_dt_fr",
				"rqst_dlv_rqst_hm_fr",
				"rqst_dlv_rqst_dt_to",
				"rqst_dlv_rqst_hm_to",
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
				"itm_grp_nm10",
				"sppl_grp_flg1",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_flg2",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_flg3",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_flg4",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_flg5",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_flg6",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_flg7",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_flg8",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_flg9",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_flg10",
				"sppl_grp_cd10",
				"sppl_grp_nm10"
			},
			{
				$st_schd_dt_fr,
				$st_schd_hm_fr,
				$st_schd_dt_to,
				$st_schd_hm_to,
				$end_schd_dt_fr,
				$end_schd_hm_fr,
				$end_schd_dt_to,
				$end_schd_hm_to,
				$rqst_dlv_rqst_dt_fr,
				$rqst_dlv_rqst_hm_fr,
				$rqst_dlv_rqst_dt_to,
				$rqst_dlv_rqst_hm_to,
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
				$itm_grp_nm10,
				$sppl_grp_flg1,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_flg2,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_flg3,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_flg4,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_flg5,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_flg6,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_flg7,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_flg8,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_flg9,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_flg10,
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
				{$mfg_loc_site_cd, "site_nm"},	// mfg_loc_site_cd
				{$mfg_loc_wg_cd, "wg_nm"},	// mfg_loc_wg_cd
				{$mfg_loc_grp_cd, "loc_grp_nm"},	// mfg_loc_grp_cd
				{$strg_loc_grp_cd, "loc_grp_nm"},	// strg_loc_grp_cd
				{$mfg_loc_cd, "loc_nm"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "str_ln_nm"},	// mfg_str_ln_cd
				{$oper_loc_cd, "loc_nm"},	// oper_loc_cd
				{$oper_str_ln_cd, "str_ln_nm"},	// oper_str_ln_cd
				{$strg_loc_cd, "loc_nm"},	// strg_loc_cd
				{$strg_str_ln_cd, "str_ln_nm"},	// strg_str_ln_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$po_aprv_sts_typ, "aprv_sts_typ_nm"},	// po_aprv_sts_typ
				{$inst_usr_cd, "usr_nm"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_nm"},	// inst_dpt_cd
				{$oper_usr_cd, "usr_nm"},	// oper_usr_cd
				{$mfg_aprv_sts_typ, "mfg_aprv_sts_typ_nm"},	// mfg_aprv_sts_typ
				{$aprv_usr_cd, "usr_nm"},	// aprv_usr_cd
				{$aprv_dpt_cd, "dpt_nm"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "mfg_loc_cd;true"},	// mfg_str_ln_cd
				{$oper_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG"},	// oper_loc_cd
				{$oper_str_ln_cd, "oper_loc_cd;true"},	// oper_str_ln_cd
				{$strg_str_ln_cd, "strg_loc_cd;true"},	// strg_str_ln_cd
				{$sppl_cd, "bp_cd;true"},	// sppl_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$inst_dpt_cd, "inst_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG;true;true"},	// inst_dpt_cd
				{$aprv_dpt_cd, "aprv_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG;true;true"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "loc_is_srch_typ"},	// mfg_loc_cd
				{$mfg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// mfg_str_ln_cd
				{$oper_loc_cd, "loc_is_srch_typ"},	// oper_loc_cd
				{$oper_str_ln_cd, "loc_cd;mode_nullval_flg"},	// oper_str_ln_cd
				{$strg_str_ln_cd, "loc_cd;mode_nullval_flg"},	// strg_str_ln_cd
				{$sppl_cd, "bp_cd;sppl_flg"},	// sppl_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$inst_dpt_cd, "usr_cd;dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"},	// inst_dpt_cd
				{$aprv_dpt_cd, "usr_cd;dpt_is_srch_typ;dpt_nm_rem_flg;mode_today_flg"}	// aprv_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$mfg_loc_site_cd, "SITE"},	// mfg_loc_site_cd
				{$mfg_loc_site_nm, "SITE"},	// mfg_loc_site_nm
				{$mfg_loc_wg_cd, "WG"},	// mfg_loc_wg_cd
				{$mfg_loc_wg_nm, "WG"},	// mfg_loc_wg_nm
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"},	// mfg_loc_grp_nm
				{$strg_loc_grp_cd, "LOC_GRP"},	// strg_loc_grp_cd
				{$strg_loc_grp_nm, "LOC_GRP"},	// strg_loc_grp_nm
				{$mfg_str_ln_cd, "STR_LN"},	// mfg_str_ln_cd
				{$mfg_str_ln_nm, "STR_LN"},	// mfg_str_ln_nm
				{$oper_str_ln_cd, "STR_LN"},	// oper_str_ln_cd
				{$oper_str_ln_nm, "STR_LN"},	// oper_str_ln_nm
				{$strg_str_ln_cd, "STR_LN"},	// strg_str_ln_cd
				{$strg_str_ln_nm, "STR_LN"},	// strg_str_ln_nm
				{$aprv_dt_fr, "MFG_APRV"},	// aprv_dt_fr
				{$aprv_dt_to, "MFG_APRV"},	// aprv_dt_to
				{$mfg_aprv_sts_typ, "MFG_APRV"},	// mfg_aprv_sts_typ
				{$mfg_aprv_sts_typ_nm, "MFG_APRV"},	// mfg_aprv_sts_typ_nm
				{$aprv_usr_cd, "MFG_APRV"},	// aprv_usr_cd
				{$aprv_usr_nm, "MFG_APRV"},	// aprv_usr_nm
				{$aprv_dpt_cd, "MFG_APRV"},	// aprv_dpt_cd
				{$aprv_dpt_nm, "MFG_APRV"}	// aprv_dpt_nm
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
	 * UPD,Order,UPD;ALLOC,Allocate,ALLOC;DEL,Cancel order,DEL;APRV,Approve,APRV;APRV_DEL,Cancel approval,APRV_DEL;PRNT_INST,Issue order sheet ,PRNT_INST;PRNT_STKLST,Issue identification tag,PRNT_STKLST;REF,View,REF UPD,指図する,UPD;ALLOC,引当する,ALLOC;DEL,指図を取り消す,DEL;APRV,承認する,APRV;APRV_DEL,承認を取り消す,APRV_DEL;PRNT_INST,指図書発行,PRNT_INST;PRNT_STKLST,現品票発行,PRNT_STKLST;REF,参照する,REF.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Order,UPD;ALLOC,Allocate,ALLOC;DEL,Cancel order,DEL;APRV,Approve,APRV;APRV_DEL,Cancel approval,APRV_DEL;PRNT_INST,Issue order sheet ,PRNT_INST;PRNT_STKLST,Issue identification tag,PRNT_STKLST;REF,View,REF UPD,指図する,UPD;ALLOC,引当する,ALLOC;DEL,指図を取り消す,DEL;APRV,承認する,APRV;APRV_DEL,承認を取り消す,APRV_DEL;PRNT_INST,指図書発行,PRNT_INST;PRNT_STKLST,現品票発行,PRNT_STKLST;REF,参照する,REF.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * HDR,Header,HDR;OPER,Operation,OPER HDR,ヘッダ,HDR;OPER,工程,OPER.<p>
	 *
	 */
	public String srch_mode() {
		return getConstString(offset + 1, $srch_mode);
	}

	/**
	 * HDR,Header,HDR;OPER,Operation,OPER HDR,ヘッダ,HDR;OPER,工程,OPER.<p>
	 *
	 */
	public void srch_mode(String value) {
		setConstString(offset + 1, $srch_mode, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean tmp_sts_yet_flg() {
		return getConstBoolean(offset + 2, $tmp_sts_yet_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void tmp_sts_yet_flg(boolean value) {
		setConstBoolean(offset + 2, $tmp_sts_yet_flg, value);
	}


	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public boolean tmp_sts_sav_flg() {
		return getConstBoolean(offset + 3, $tmp_sts_sav_flg);
	}

	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public void tmp_sts_sav_flg(boolean value) {
		setConstBoolean(offset + 3, $tmp_sts_sav_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean tmp_sts_ord_flg() {
		return getConstBoolean(offset + 4, $tmp_sts_ord_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void tmp_sts_ord_flg(boolean value) {
		setConstBoolean(offset + 4, $tmp_sts_ord_flg, value);
	}


	/**
	 * In process 着手中.<p>
	 *
	 */
	public boolean tmp_sts_stt_flg() {
		return getConstBoolean(offset + 5, $tmp_sts_stt_flg);
	}

	/**
	 * In process 着手中.<p>
	 *
	 */
	public void tmp_sts_stt_flg(boolean value) {
		setConstBoolean(offset + 5, $tmp_sts_stt_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean tmp_sts_cmpl_flg() {
		return getConstBoolean(offset + 6, $tmp_sts_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void tmp_sts_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $tmp_sts_cmpl_flg, value);
	}


	/**
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public boolean not_inst_prnt_flg() {
		return getConstBoolean(offset + 7, $not_inst_prnt_flg);
	}

	/**
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public void not_inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $not_inst_prnt_flg, value);
	}


	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 8, $inst_prnt_flg);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 8, $inst_prnt_flg, value);
	}


	/**
	 * Identification tag unissued 現品票未発行.<p>
	 *
	 */
	public boolean not_stk_lst_issue_flg() {
		return getConstBoolean(offset + 9, $not_stk_lst_issue_flg);
	}

	/**
	 * Identification tag unissued 現品票未発行.<p>
	 *
	 */
	public void not_stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 9, $not_stk_lst_issue_flg, value);
	}


	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 10, $stk_lst_issue_flg);
	}

	/**
	 * Identification tag issued 現品票発行済.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 10, $stk_lst_issue_flg, value);
	}


	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public boolean mes_tgt_flg() {
		return getConstBoolean(offset + 11, $mes_tgt_flg);
	}

	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public void mes_tgt_flg(boolean value) {
		setConstBoolean(offset + 11, $mes_tgt_flg, value);
	}


	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public boolean not_mes_tgt_flg() {
		return getConstBoolean(offset + 12, $not_mes_tgt_flg);
	}

	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public void not_mes_tgt_flg(boolean value) {
		setConstBoolean(offset + 12, $not_mes_tgt_flg, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public boolean not_unschd_act_flg() {
		return getConstBoolean(offset + 13, $not_unschd_act_flg);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void not_unschd_act_flg(boolean value) {
		setConstBoolean(offset + 13, $not_unschd_act_flg, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean unschd_act_flg() {
		return getConstBoolean(offset + 14, $unschd_act_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void unschd_act_flg(boolean value) {
		setConstBoolean(offset + 14, $unschd_act_flg, value);
	}


	/**
	 * Before frozen 凍結前.<p>
	 *
	 */
	public boolean before_frozen_flg() {
		return getConstBoolean(offset + 15, $before_frozen_flg);
	}

	/**
	 * Before frozen 凍結前.<p>
	 *
	 */
	public void before_frozen_flg(boolean value) {
		setConstBoolean(offset + 15, $before_frozen_flg, value);
	}


	/**
	 * Frozen 凍結.<p>
	 *
	 */
	public boolean frozen_flg() {
		return getConstBoolean(offset + 16, $frozen_flg);
	}

	/**
	 * Frozen 凍結.<p>
	 *
	 */
	public void frozen_flg(boolean value) {
		setConstBoolean(offset + 16, $frozen_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR st_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 17, $st_schd_dt_p);
	}
	
	public void st_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 17, $st_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR end_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 18, $end_schd_dt_p);
	}
	
	public void end_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 18, $end_schd_dt_p, row);
	}


	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public boolean comp_dt_from_oper_flg() {
		return getConstBoolean(offset + 19, $comp_dt_from_oper_flg);
	}

	/**
	 * Scheduled date correction 予定日補正.<p>
	 *
	 */
	public void comp_dt_from_oper_flg(boolean value) {
		setConstBoolean(offset + 19, $comp_dt_from_oper_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR rqst_dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 20, $rqst_dlv_rqst_dt_p);
	}
	
	public void rqst_dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 20, $rqst_dlv_rqst_dt_p, row);
	}


	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate inst_dt_fr() {
		return getConstDate(offset + 21, $inst_dt_fr);
	}

	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public void inst_dt_fr(MCDate value) {
		setConstDate(offset + 21, $inst_dt_fr, value);
	}


	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public MCDate inst_dt_to() {
		return getConstDate(offset + 22, $inst_dt_to);
	}

	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public void inst_dt_to(MCDate value) {
		setConstDate(offset + 22, $inst_dt_to, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 23, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 23, $mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String mfg_mtd_typ_nm() {
		return getConstString(offset + 24, $mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void mfg_mtd_typ_nm(String value) {
		setConstString(offset + 24, $mfg_mtd_typ_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 25, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 25, $mfg_loc_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_loc_site_nm() {
		return getConstString(offset + 26, $mfg_loc_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_loc_site_nm(String value) {
		setConstString(offset + 26, $mfg_loc_site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 27, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 27, $mfg_loc_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String mfg_loc_wg_nm() {
		return getConstString(offset + 28, $mfg_loc_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void mfg_loc_wg_nm(String value) {
		setConstString(offset + 28, $mfg_loc_wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 29, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 29, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 30, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location G name 製造場所Ｇ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 30, $mfg_loc_grp_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 31, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 31, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location G name 格納場所Ｇ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 32, $strg_loc_grp_nm);
	}

	/**
	 * Storage location G name 格納場所Ｇ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 32, $strg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 33, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 33, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 34, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 34, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 35, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 35, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 36, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 36, $mfg_str_ln_nm, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 37, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 37, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 38, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 38, $oper_loc_nm, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 39, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 39, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 40, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 40, $oper_str_ln_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 41, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 41, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 42, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 42, $oper_nm, value);
	}


	/**
	 * With unallocated only 未引当ありのみ.<p>
	 *
	 */
	public boolean not_alloc_srch_flg() {
		return getConstBoolean(offset + 43, $not_alloc_srch_flg);
	}

	/**
	 * With unallocated only 未引当ありのみ.<p>
	 *
	 */
	public void not_alloc_srch_flg(boolean value) {
		setConstBoolean(offset + 43, $not_alloc_srch_flg, value);
	}


	/**
	 * Without unallocated only 未引当なしのみ.<p>
	 *
	 */
	public boolean all_alloc_srch_flg() {
		return getConstBoolean(offset + 44, $all_alloc_srch_flg);
	}

	/**
	 * Without unallocated only 未引当なしのみ.<p>
	 *
	 */
	public void all_alloc_srch_flg(boolean value) {
		setConstBoolean(offset + 44, $all_alloc_srch_flg, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 45, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 45, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 46, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 46, $strg_loc_nm, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 47, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 47, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 48, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 48, $strg_str_ln_nm, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 49, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 49, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 50, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 50, $sppl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 51, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 51, $itm_typ_p, row);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 52, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 52, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 53, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 53, $mfg_inst_unit_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 54, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 54, $itm_p, row);
	}


	/**
	 * Exclude unfirm order オーダ未確定除く.<p>
	 *
	 */
	public boolean not_srch_opn_flg() {
		return getConstBoolean(offset + 55, $not_srch_opn_flg);
	}

	/**
	 * Exclude unfirm order オーダ未確定除く.<p>
	 *
	 */
	public void not_srch_opn_flg(boolean value) {
		setConstBoolean(offset + 55, $not_srch_opn_flg, value);
	}


	/**
	 * Exclude saved order オーダ保存除く.<p>
	 *
	 */
	public boolean not_srch_sav_flg() {
		return getConstBoolean(offset + 56, $not_srch_sav_flg);
	}

	/**
	 * Exclude saved order オーダ保存除く.<p>
	 *
	 */
	public void not_srch_sav_flg(boolean value) {
		setConstBoolean(offset + 56, $not_srch_sav_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 57, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 57, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 58, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 58, $sublot_no, value);
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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 60, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 60, $po_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 61, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 61, $sno_p, row);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 62, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 62, $itm_ord_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 63, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 63, $itm_mfg_inst_no, value);
	}


	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public String po_aprv_sts_typ() {
		return getConstString(offset + 64, $po_aprv_sts_typ);
	}

	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public void po_aprv_sts_typ(String value) {
		setConstString(offset + 64, $po_aprv_sts_typ, value);
	}


	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public String po_aprv_sts_typ_nm() {
		return getConstString(offset + 65, $po_aprv_sts_typ_nm);
	}

	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public void po_aprv_sts_typ_nm(String value) {
		setConstString(offset + 65, $po_aprv_sts_typ_nm, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 66, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 66, $oper_ord_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 67, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 67, $oper_inst_no, value);
	}


	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 68, $disp_pd);
	}

	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 68, $disp_pd, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 69, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 69, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 70, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 70, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 71, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 71, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 72, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 72, $inst_dpt_nm, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 73, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 73, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 74, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 74, $oper_usr_nm, value);
	}


	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 75, $oper_rsrc);
	}

	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 75, $oper_rsrc, value);
	}


	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate aprv_dt_fr() {
		return getConstDate(offset + 76, $aprv_dt_fr);
	}

	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public void aprv_dt_fr(MCDate value) {
		setConstDate(offset + 76, $aprv_dt_fr, value);
	}


	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public MCDate aprv_dt_to() {
		return getConstDate(offset + 77, $aprv_dt_to);
	}

	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public void aprv_dt_to(MCDate value) {
		setConstDate(offset + 77, $aprv_dt_to, value);
	}


	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 78, $mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 78, $mfg_aprv_sts_typ, value);
	}


	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public String mfg_aprv_sts_typ_nm() {
		return getConstString(offset + 79, $mfg_aprv_sts_typ_nm);
	}

	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public void mfg_aprv_sts_typ_nm(String value) {
		setConstString(offset + 79, $mfg_aprv_sts_typ_nm, value);
	}


	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 80, $aprv_usr_cd);
	}

	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 80, $aprv_usr_cd, value);
	}


	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 81, $aprv_usr_nm);
	}

	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 81, $aprv_usr_nm, value);
	}


	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 82, $aprv_dpt_cd);
	}

	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 82, $aprv_dpt_cd, value);
	}


	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 83, $aprv_dpt_nm);
	}

	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 83, $aprv_dpt_nm, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 84, $abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 84, $abort_flg, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 85, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 85, $inst_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 86, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 86, $intr_rmrks, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 87, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 87, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public String oper_inst_rpt_rmrks() {
		return getConstString(offset + 88, $oper_inst_rpt_rmrks);
	}

	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public void oper_inst_rpt_rmrks(String value) {
		setConstString(offset + 88, $oper_inst_rpt_rmrks, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_intr_rmrks() {
		return getConstString(offset + 89, $oper_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_intr_rmrks(String value) {
		setConstString(offset + 89, $oper_intr_rmrks, value);
	}


	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char1() {
		return getConstString(offset + 90, $itm_mfg_inst_sub_char1);
	}

	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char1(String value) {
		setConstString(offset + 90, $itm_mfg_inst_sub_char1, value);
	}


	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char2() {
		return getConstString(offset + 91, $itm_mfg_inst_sub_char2);
	}

	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char2(String value) {
		setConstString(offset + 91, $itm_mfg_inst_sub_char2, value);
	}


	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public String itm_mfg_inst_sub_char3() {
		return getConstString(offset + 92, $itm_mfg_inst_sub_char3);
	}

	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public void itm_mfg_inst_sub_char3(String value) {
		setConstString(offset + 92, $itm_mfg_inst_sub_char3, value);
	}


	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 93, $mfg_inst_sub_char1);
	}

	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 93, $mfg_inst_sub_char1, value);
	}


	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 94, $mfg_inst_sub_char2);
	}

	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 94, $mfg_inst_sub_char2, value);
	}


	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 95, $mfg_inst_sub_char3);
	}

	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 95, $mfg_inst_sub_char3, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_inst_sub_char1() {
		return getConstString(offset + 96, $oper_inst_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_inst_sub_char1(String value) {
		setConstString(offset + 96, $oper_inst_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_inst_sub_char2() {
		return getConstString(offset + 97, $oper_inst_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_inst_sub_char2(String value) {
		setConstString(offset + 97, $oper_inst_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_inst_sub_char3() {
		return getConstString(offset + 98, $oper_inst_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_inst_sub_char3(String value) {
		setConstString(offset + 98, $oper_inst_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 99, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 99, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 100, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 100, $sppl_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ_nm();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($tmp_sts_yet_flg.equalsIgnoreCase(name)) {
			return tmp_sts_yet_flg();
		}
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
		if ($not_inst_prnt_flg.equalsIgnoreCase(name)) {
			return not_inst_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($not_stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return not_stk_lst_issue_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			return not_mes_tgt_flg();
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			return not_unschd_act_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($before_frozen_flg.equalsIgnoreCase(name)) {
			return before_frozen_flg();
		}
		if ($frozen_flg.equalsIgnoreCase(name)) {
			return frozen_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			return not_alloc_srch_flg();
		}
		if ($all_alloc_srch_flg.equalsIgnoreCase(name)) {
			return all_alloc_srch_flg();
		}
		if ($not_srch_opn_flg.equalsIgnoreCase(name)) {
			return not_srch_opn_flg();
		}
		if ($not_srch_sav_flg.equalsIgnoreCase(name)) {
			return not_srch_sav_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ();
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return po_aprv_sts_typ_nm();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
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
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ_nm();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($tmp_sts_yet_flg.equalsIgnoreCase(name)) {
			return tmp_sts_yet_flg();
		}
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
		if ($not_inst_prnt_flg.equalsIgnoreCase(name)) {
			return not_inst_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($not_stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return not_stk_lst_issue_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($mes_tgt_flg.equalsIgnoreCase(name)) {
			return mes_tgt_flg();
		}
		if ($not_mes_tgt_flg.equalsIgnoreCase(name)) {
			return not_mes_tgt_flg();
		}
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			return not_unschd_act_flg();
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			return unschd_act_flg();
		}
		if ($before_frozen_flg.equalsIgnoreCase(name)) {
			return before_frozen_flg();
		}
		if ($frozen_flg.equalsIgnoreCase(name)) {
			return frozen_flg();
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			return comp_dt_from_oper_flg();
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			return not_alloc_srch_flg();
		}
		if ($all_alloc_srch_flg.equalsIgnoreCase(name)) {
			return all_alloc_srch_flg();
		}
		if ($not_srch_opn_flg.equalsIgnoreCase(name)) {
			return not_srch_opn_flg();
		}
		if ($not_srch_sav_flg.equalsIgnoreCase(name)) {
			return not_srch_sav_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			po_aprv_sts_typ_nm(value);
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($tmp_sts_yet_flg.equalsIgnoreCase(name)) {
			tmp_sts_yet_flg(value);
			return;
		}
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
		if ($not_inst_prnt_flg.equalsIgnoreCase(name)) {
			not_inst_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($not_stk_lst_issue_flg.equalsIgnoreCase(name)) {
			not_stk_lst_issue_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
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
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			not_unschd_act_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($before_frozen_flg.equalsIgnoreCase(name)) {
			before_frozen_flg(value);
			return;
		}
		if ($frozen_flg.equalsIgnoreCase(name)) {
			frozen_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			not_alloc_srch_flg(value);
			return;
		}
		if ($all_alloc_srch_flg.equalsIgnoreCase(name)) {
			all_alloc_srch_flg(value);
			return;
		}
		if ($not_srch_opn_flg.equalsIgnoreCase(name)) {
			not_srch_opn_flg(value);
			return;
		}
		if ($not_srch_sav_flg.equalsIgnoreCase(name)) {
			not_srch_sav_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($po_aprv_sts_typ.equalsIgnoreCase(name)) {
			po_aprv_sts_typ(value);
			return;
		}
		if ($po_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			po_aprv_sts_typ_nm(value);
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
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
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
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($mfg_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($tmp_sts_yet_flg.equalsIgnoreCase(name)) {
			tmp_sts_yet_flg(value);
			return;
		}
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
		if ($not_inst_prnt_flg.equalsIgnoreCase(name)) {
			not_inst_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($not_stk_lst_issue_flg.equalsIgnoreCase(name)) {
			not_stk_lst_issue_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
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
		if ($not_unschd_act_flg.equalsIgnoreCase(name)) {
			not_unschd_act_flg(value);
			return;
		}
		if ($unschd_act_flg.equalsIgnoreCase(name)) {
			unschd_act_flg(value);
			return;
		}
		if ($before_frozen_flg.equalsIgnoreCase(name)) {
			before_frozen_flg(value);
			return;
		}
		if ($frozen_flg.equalsIgnoreCase(name)) {
			frozen_flg(value);
			return;
		}
		if ($comp_dt_from_oper_flg.equalsIgnoreCase(name)) {
			comp_dt_from_oper_flg(value);
			return;
		}
		if ($not_alloc_srch_flg.equalsIgnoreCase(name)) {
			not_alloc_srch_flg(value);
			return;
		}
		if ($all_alloc_srch_flg.equalsIgnoreCase(name)) {
			all_alloc_srch_flg(value);
			return;
		}
		if ($not_srch_opn_flg.equalsIgnoreCase(name)) {
			not_srch_opn_flg(value);
			return;
		}
		if ($not_srch_sav_flg.equalsIgnoreCase(name)) {
			not_srch_sav_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($st_schd_dt_p.equalsIgnoreCase(name)) {
			return st_schd_dt_p();
		}
		if ($end_schd_dt_p.equalsIgnoreCase(name)) {
			return end_schd_dt_p();
		}
		if ($rqst_dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_p();
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
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($st_schd_dt_p.equalsIgnoreCase(name)) {
			st_schd_dt_p(
				((MCContainerMeta) st_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($end_schd_dt_p.equalsIgnoreCase(name)) {
			end_schd_dt_p(
				((MCContainerMeta) end_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($rqst_dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_p(
				((MCContainerMeta) rqst_dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_dt_fr() {
		return st_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled start date FROM 着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_dt_fr(MCDate value) {
		st_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Schedule start time FROM 着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_schd_hm_fr() {
		return st_schd_dt_p().hm_fr();
	}

	/**
	 * Schedule start time FROM 着手予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void st_schd_hm_fr(MCDate value) {
		st_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_dt_to() {
		return st_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled start date TO 着手予定日ＴＯ.<p>
	 *
	 */
	public void st_schd_dt_to(MCDate value) {
		st_schd_dt_p().ymd_to(value);
	}

	/**
	 * Schedule start time TO 着手予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate st_schd_hm_to() {
		return st_schd_dt_p().hm_to();
	}

	/**
	 * Schedule start time TO 着手予定時刻ＴＯ.<p>
	 *
	 */
	public void st_schd_hm_to(MCDate value) {
		st_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_dt_fr() {
		return end_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled end date FROM 終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_dt_fr(MCDate value) {
		end_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_schd_hm_fr() {
		return end_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled end time FROM 終了予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void end_schd_hm_fr(MCDate value) {
		end_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_dt_to() {
		return end_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled end date TO 終了予定日ＴＯ.<p>
	 *
	 */
	public void end_schd_dt_to(MCDate value) {
		end_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate end_schd_hm_to() {
		return end_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled end time TO 終了予定時刻ＴＯ.<p>
	 *
	 */
	public void end_schd_hm_to(MCDate value) {
		end_schd_dt_p().hm_to(value);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_fr() {
		return rqst_dlv_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_fr(MCDate value) {
		rqst_dlv_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_fr() {
		return rqst_dlv_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_fr(MCDate value) {
		rqst_dlv_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_to() {
		return rqst_dlv_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_to(MCDate value) {
		rqst_dlv_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_to() {
		return rqst_dlv_rqst_dt_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_to(MCDate value) {
		rqst_dlv_rqst_dt_p().hm_to(value);
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

	/**
	 * Subcontractor classification 1 外注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return sppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Subcontractor classification 1 外注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		sppl_grp_p().bp_grp_flg1(value);
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
	 * Subcontractor classification 2 外注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return sppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Subcontractor classification 2 外注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		sppl_grp_p().bp_grp_flg2(value);
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
	 * Subcontractor classification 3 外注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return sppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Subcontractor classification 3 外注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		sppl_grp_p().bp_grp_flg3(value);
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
	 * Subcontractor classification 4 外注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return sppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Subcontractor classification 4 外注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		sppl_grp_p().bp_grp_flg4(value);
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
	 * Subcontractor classification 5 外注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return sppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Subcontractor classification 5 外注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		sppl_grp_p().bp_grp_flg5(value);
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
	 * Subcontractor classification 6 外注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return sppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Subcontractor classification 6 外注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		sppl_grp_p().bp_grp_flg6(value);
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
	 * Subcontractor classification 7 外注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return sppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Subcontractor classification 7 外注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		sppl_grp_p().bp_grp_flg7(value);
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
	 * Subcontractor classification 8 外注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return sppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Subcontractor classification 8 外注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		sppl_grp_p().bp_grp_flg8(value);
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
	 * Subcontractor classification 9 外注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return sppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Subcontractor classification 9 外注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		sppl_grp_p().bp_grp_flg9(value);
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
	 * Subcontractor classification 10 外注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return sppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Subcontractor classification 10 外注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		sppl_grp_p().bp_grp_flg10(value);
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

