package mcframe.clientMSBE.MSBEP2000;

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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue identification tag INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,現品票発行.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Receipt list of supplied inventory 支給品着荷一覧登録.<p>
	 *
	 */
	public static final String $prov_arrv_req_flg = "prov_arrv_req_flg";
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public static final String $arr_yet_flg = "arr_yet_flg";
	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public static final String $arr_done_flg = "arr_done_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $prnt_yet_flg = "prnt_yet_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt_done_flg = "prnt_done_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_wms_flg = "not_wms_flg";
	public static final String $arr_schd_dt_p = "arr_schd_dt_p";
	public static final String $arr_dt_p = "arr_dt_p";
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
	/**
	 * Requesting PIC cd. 依頼元担当ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public static final String $arr_usr_cd = "arr_usr_cd";
	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public static final String $arr_usr_nm = "arr_usr_nm";
	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public static final String $arr_dpt_cd = "arr_dpt_cd";
	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public static final String $arr_dpt_nm = "arr_dpt_nm";
	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public static final String $arr_loc_cd = "arr_loc_cd";
	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public static final String $arr_loc_nm = "arr_loc_nm";
	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $arr_str_ln_cd = "arr_str_ln_cd";
	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public static final String $arr_str_ln_nm = "arr_str_ln_nm";
	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $arr_wg_cd = "arr_wg_cd";
	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public static final String $arr_wg_nm = "arr_wg_nm";
	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $arr_lg_grp_cd = "arr_lg_grp_cd";
	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public static final String $arr_lg_grp_nm = "arr_lg_grp_nm";
	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $arr_site_cd = "arr_site_cd";
	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public static final String $arr_site_nm = "arr_site_nm";
	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $arr_alloc_grp_cd = "arr_alloc_grp_cd";
	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public static final String $arr_alloc_grp_nm = "arr_alloc_grp_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
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
	public static final String $sno_p = "sno_p";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_NM = "prov_basis_typ_NM";
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public static final String $prov_src_schd_typ = "prov_src_schd_typ";
	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public static final String $prov_src_schd_typ_nm = "prov_src_schd_typ_nm";
	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public static final String $prov_src_schd_no1 = "prov_src_schd_no1";
	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public static final String $prov_src_schd_no2 = "prov_src_schd_no2";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public static final String $prov_src_act_typ = "prov_src_act_typ";
	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public static final String $prov_src_act_typ_nm = "prov_src_act_typ_nm";
	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_src_act_no = "prov_src_act_no";
	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_arr_act_no = "ext_arr_act_no";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $purc_rqst_wg_cd = "purc_rqst_wg_cd";
	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public static final String $purc_rqst_wg_nm = "purc_rqst_wg_nm";
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public static final String $po_schd_src_typ_nm = "po_schd_src_typ_nm";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_no = "prms_rcpt_no";
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $rcpt_iv_itm_nm = "rcpt_iv_itm_nm";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $edi_invalid_flg = "edi_invalid_flg";
	/**
	 * Include item in transit 未着品を含む.<p>
	 *
	 */
	public static final String $purc_act_yet_flg = "purc_act_yet_flg";
	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public static final String $dlv_inst_print_d_rmrks = "dlv_inst_print_d_rmrks";
	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
	/**
	 * Shipping WG cd. 出荷ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $ship_wg_cd = "ship_wg_cd";
	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public static final String $ship_wg_nm = "ship_wg_nm";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_lg_grp_nm = "ship_lg_grp_nm";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public static final String $sret_fr_cd = "sret_fr_cd";
	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public static final String $sret_fr_nm = "sret_fr_nm";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_no = "sls_ret_schd_no";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	public static final String $po_grp_p = "po_grp_p";
	public static final String $sret_fr_grp_p = "sret_fr_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $prsppl_grp_p = "prsppl_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $arr_schd_dt_fr = $arr_schd_dt_p + ".ymd_fr";
	public static final String $arr_schd_hm_fr = $arr_schd_dt_p + ".hm_fr";
	public static final String $arr_schd_dt_to = $arr_schd_dt_p + ".ymd_to";
	public static final String $arr_schd_hm_to = $arr_schd_dt_p + ".hm_to";
	public static final String $arr_dt_fr = $arr_dt_p + ".ymd_fr";
	public static final String $arr_hm_fr = $arr_dt_p + ".hm_fr";
	public static final String $arr_dt_to = $arr_dt_p + ".ymd_to";
	public static final String $arr_hm_to = $arr_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_nm = $itm_typ_p + ".itm_typ_nm";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $po_grp_lab1 = $po_grp_p + ".bp_grp_lab1";
	public static final String $po_grp_flg1 = $po_grp_p + ".bp_grp_flg1";
	public static final String $po_grp_cd1 = $po_grp_p + ".bp_grp_cd1";
	public static final String $po_grp_nm1 = $po_grp_p + ".bp_grp_nm1";
	public static final String $po_grp_lab2 = $po_grp_p + ".bp_grp_lab2";
	public static final String $po_grp_flg2 = $po_grp_p + ".bp_grp_flg2";
	public static final String $po_grp_cd2 = $po_grp_p + ".bp_grp_cd2";
	public static final String $po_grp_nm2 = $po_grp_p + ".bp_grp_nm2";
	public static final String $po_grp_lab3 = $po_grp_p + ".bp_grp_lab3";
	public static final String $po_grp_flg3 = $po_grp_p + ".bp_grp_flg3";
	public static final String $po_grp_cd3 = $po_grp_p + ".bp_grp_cd3";
	public static final String $po_grp_nm3 = $po_grp_p + ".bp_grp_nm3";
	public static final String $po_grp_lab4 = $po_grp_p + ".bp_grp_lab4";
	public static final String $po_grp_flg4 = $po_grp_p + ".bp_grp_flg4";
	public static final String $po_grp_cd4 = $po_grp_p + ".bp_grp_cd4";
	public static final String $po_grp_nm4 = $po_grp_p + ".bp_grp_nm4";
	public static final String $po_grp_lab5 = $po_grp_p + ".bp_grp_lab5";
	public static final String $po_grp_flg5 = $po_grp_p + ".bp_grp_flg5";
	public static final String $po_grp_cd5 = $po_grp_p + ".bp_grp_cd5";
	public static final String $po_grp_nm5 = $po_grp_p + ".bp_grp_nm5";
	public static final String $po_grp_lab6 = $po_grp_p + ".bp_grp_lab6";
	public static final String $po_grp_flg6 = $po_grp_p + ".bp_grp_flg6";
	public static final String $po_grp_cd6 = $po_grp_p + ".bp_grp_cd6";
	public static final String $po_grp_nm6 = $po_grp_p + ".bp_grp_nm6";
	public static final String $po_grp_lab7 = $po_grp_p + ".bp_grp_lab7";
	public static final String $po_grp_flg7 = $po_grp_p + ".bp_grp_flg7";
	public static final String $po_grp_cd7 = $po_grp_p + ".bp_grp_cd7";
	public static final String $po_grp_nm7 = $po_grp_p + ".bp_grp_nm7";
	public static final String $po_grp_lab8 = $po_grp_p + ".bp_grp_lab8";
	public static final String $po_grp_flg8 = $po_grp_p + ".bp_grp_flg8";
	public static final String $po_grp_cd8 = $po_grp_p + ".bp_grp_cd8";
	public static final String $po_grp_nm8 = $po_grp_p + ".bp_grp_nm8";
	public static final String $po_grp_lab9 = $po_grp_p + ".bp_grp_lab9";
	public static final String $po_grp_flg9 = $po_grp_p + ".bp_grp_flg9";
	public static final String $po_grp_cd9 = $po_grp_p + ".bp_grp_cd9";
	public static final String $po_grp_nm9 = $po_grp_p + ".bp_grp_nm9";
	public static final String $po_grp_lab10 = $po_grp_p + ".bp_grp_lab10";
	public static final String $po_grp_flg10 = $po_grp_p + ".bp_grp_flg10";
	public static final String $po_grp_cd10 = $po_grp_p + ".bp_grp_cd10";
	public static final String $po_grp_nm10 = $po_grp_p + ".bp_grp_nm10";
	public static final String $sret_fr_grp_lab1 = $sret_fr_grp_p + ".bp_grp_lab1";
	public static final String $sret_fr_grp_flg1 = $sret_fr_grp_p + ".bp_grp_flg1";
	public static final String $sret_fr_grp_cd1 = $sret_fr_grp_p + ".bp_grp_cd1";
	public static final String $sret_fr_grp_nm1 = $sret_fr_grp_p + ".bp_grp_nm1";
	public static final String $sret_fr_grp_lab2 = $sret_fr_grp_p + ".bp_grp_lab2";
	public static final String $sret_fr_grp_flg2 = $sret_fr_grp_p + ".bp_grp_flg2";
	public static final String $sret_fr_grp_cd2 = $sret_fr_grp_p + ".bp_grp_cd2";
	public static final String $sret_fr_grp_nm2 = $sret_fr_grp_p + ".bp_grp_nm2";
	public static final String $sret_fr_grp_lab3 = $sret_fr_grp_p + ".bp_grp_lab3";
	public static final String $sret_fr_grp_flg3 = $sret_fr_grp_p + ".bp_grp_flg3";
	public static final String $sret_fr_grp_cd3 = $sret_fr_grp_p + ".bp_grp_cd3";
	public static final String $sret_fr_grp_nm3 = $sret_fr_grp_p + ".bp_grp_nm3";
	public static final String $sret_fr_grp_lab4 = $sret_fr_grp_p + ".bp_grp_lab4";
	public static final String $sret_fr_grp_flg4 = $sret_fr_grp_p + ".bp_grp_flg4";
	public static final String $sret_fr_grp_cd4 = $sret_fr_grp_p + ".bp_grp_cd4";
	public static final String $sret_fr_grp_nm4 = $sret_fr_grp_p + ".bp_grp_nm4";
	public static final String $sret_fr_grp_lab5 = $sret_fr_grp_p + ".bp_grp_lab5";
	public static final String $sret_fr_grp_flg5 = $sret_fr_grp_p + ".bp_grp_flg5";
	public static final String $sret_fr_grp_cd5 = $sret_fr_grp_p + ".bp_grp_cd5";
	public static final String $sret_fr_grp_nm5 = $sret_fr_grp_p + ".bp_grp_nm5";
	public static final String $sret_fr_grp_lab6 = $sret_fr_grp_p + ".bp_grp_lab6";
	public static final String $sret_fr_grp_flg6 = $sret_fr_grp_p + ".bp_grp_flg6";
	public static final String $sret_fr_grp_cd6 = $sret_fr_grp_p + ".bp_grp_cd6";
	public static final String $sret_fr_grp_nm6 = $sret_fr_grp_p + ".bp_grp_nm6";
	public static final String $sret_fr_grp_lab7 = $sret_fr_grp_p + ".bp_grp_lab7";
	public static final String $sret_fr_grp_flg7 = $sret_fr_grp_p + ".bp_grp_flg7";
	public static final String $sret_fr_grp_cd7 = $sret_fr_grp_p + ".bp_grp_cd7";
	public static final String $sret_fr_grp_nm7 = $sret_fr_grp_p + ".bp_grp_nm7";
	public static final String $sret_fr_grp_lab8 = $sret_fr_grp_p + ".bp_grp_lab8";
	public static final String $sret_fr_grp_flg8 = $sret_fr_grp_p + ".bp_grp_flg8";
	public static final String $sret_fr_grp_cd8 = $sret_fr_grp_p + ".bp_grp_cd8";
	public static final String $sret_fr_grp_nm8 = $sret_fr_grp_p + ".bp_grp_nm8";
	public static final String $sret_fr_grp_lab9 = $sret_fr_grp_p + ".bp_grp_lab9";
	public static final String $sret_fr_grp_flg9 = $sret_fr_grp_p + ".bp_grp_flg9";
	public static final String $sret_fr_grp_cd9 = $sret_fr_grp_p + ".bp_grp_cd9";
	public static final String $sret_fr_grp_nm9 = $sret_fr_grp_p + ".bp_grp_nm9";
	public static final String $sret_fr_grp_lab10 = $sret_fr_grp_p + ".bp_grp_lab10";
	public static final String $sret_fr_grp_flg10 = $sret_fr_grp_p + ".bp_grp_flg10";
	public static final String $sret_fr_grp_cd10 = $sret_fr_grp_p + ".bp_grp_cd10";
	public static final String $sret_fr_grp_nm10 = $sret_fr_grp_p + ".bp_grp_nm10";
	public static final String $cst_grp_lab1 = $cst_grp_p + ".bp_grp_lab1";
	public static final String $cst_grp_flg1 = $cst_grp_p + ".bp_grp_flg1";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_lab2 = $cst_grp_p + ".bp_grp_lab2";
	public static final String $cst_grp_flg2 = $cst_grp_p + ".bp_grp_flg2";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_lab3 = $cst_grp_p + ".bp_grp_lab3";
	public static final String $cst_grp_flg3 = $cst_grp_p + ".bp_grp_flg3";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_lab4 = $cst_grp_p + ".bp_grp_lab4";
	public static final String $cst_grp_flg4 = $cst_grp_p + ".bp_grp_flg4";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_lab5 = $cst_grp_p + ".bp_grp_lab5";
	public static final String $cst_grp_flg5 = $cst_grp_p + ".bp_grp_flg5";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_lab6 = $cst_grp_p + ".bp_grp_lab6";
	public static final String $cst_grp_flg6 = $cst_grp_p + ".bp_grp_flg6";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_lab7 = $cst_grp_p + ".bp_grp_lab7";
	public static final String $cst_grp_flg7 = $cst_grp_p + ".bp_grp_flg7";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_lab8 = $cst_grp_p + ".bp_grp_lab8";
	public static final String $cst_grp_flg8 = $cst_grp_p + ".bp_grp_flg8";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_lab9 = $cst_grp_p + ".bp_grp_lab9";
	public static final String $cst_grp_flg9 = $cst_grp_p + ".bp_grp_flg9";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_lab10 = $cst_grp_p + ".bp_grp_lab10";
	public static final String $cst_grp_flg10 = $cst_grp_p + ".bp_grp_flg10";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
	public static final String $prsppl_grp_lab1 = $prsppl_grp_p + ".bp_grp_lab1";
	public static final String $prsppl_grp_flg1 = $prsppl_grp_p + ".bp_grp_flg1";
	public static final String $prsppl_grp_cd1 = $prsppl_grp_p + ".bp_grp_cd1";
	public static final String $prsppl_grp_nm1 = $prsppl_grp_p + ".bp_grp_nm1";
	public static final String $prsppl_grp_lab2 = $prsppl_grp_p + ".bp_grp_lab2";
	public static final String $prsppl_grp_flg2 = $prsppl_grp_p + ".bp_grp_flg2";
	public static final String $prsppl_grp_cd2 = $prsppl_grp_p + ".bp_grp_cd2";
	public static final String $prsppl_grp_nm2 = $prsppl_grp_p + ".bp_grp_nm2";
	public static final String $prsppl_grp_lab3 = $prsppl_grp_p + ".bp_grp_lab3";
	public static final String $prsppl_grp_flg3 = $prsppl_grp_p + ".bp_grp_flg3";
	public static final String $prsppl_grp_cd3 = $prsppl_grp_p + ".bp_grp_cd3";
	public static final String $prsppl_grp_nm3 = $prsppl_grp_p + ".bp_grp_nm3";
	public static final String $prsppl_grp_lab4 = $prsppl_grp_p + ".bp_grp_lab4";
	public static final String $prsppl_grp_flg4 = $prsppl_grp_p + ".bp_grp_flg4";
	public static final String $prsppl_grp_cd4 = $prsppl_grp_p + ".bp_grp_cd4";
	public static final String $prsppl_grp_nm4 = $prsppl_grp_p + ".bp_grp_nm4";
	public static final String $prsppl_grp_lab5 = $prsppl_grp_p + ".bp_grp_lab5";
	public static final String $prsppl_grp_flg5 = $prsppl_grp_p + ".bp_grp_flg5";
	public static final String $prsppl_grp_cd5 = $prsppl_grp_p + ".bp_grp_cd5";
	public static final String $prsppl_grp_nm5 = $prsppl_grp_p + ".bp_grp_nm5";
	public static final String $prsppl_grp_lab6 = $prsppl_grp_p + ".bp_grp_lab6";
	public static final String $prsppl_grp_flg6 = $prsppl_grp_p + ".bp_grp_flg6";
	public static final String $prsppl_grp_cd6 = $prsppl_grp_p + ".bp_grp_cd6";
	public static final String $prsppl_grp_nm6 = $prsppl_grp_p + ".bp_grp_nm6";
	public static final String $prsppl_grp_lab7 = $prsppl_grp_p + ".bp_grp_lab7";
	public static final String $prsppl_grp_flg7 = $prsppl_grp_p + ".bp_grp_flg7";
	public static final String $prsppl_grp_cd7 = $prsppl_grp_p + ".bp_grp_cd7";
	public static final String $prsppl_grp_nm7 = $prsppl_grp_p + ".bp_grp_nm7";
	public static final String $prsppl_grp_lab8 = $prsppl_grp_p + ".bp_grp_lab8";
	public static final String $prsppl_grp_flg8 = $prsppl_grp_p + ".bp_grp_flg8";
	public static final String $prsppl_grp_cd8 = $prsppl_grp_p + ".bp_grp_cd8";
	public static final String $prsppl_grp_nm8 = $prsppl_grp_p + ".bp_grp_nm8";
	public static final String $prsppl_grp_lab9 = $prsppl_grp_p + ".bp_grp_lab9";
	public static final String $prsppl_grp_flg9 = $prsppl_grp_p + ".bp_grp_flg9";
	public static final String $prsppl_grp_cd9 = $prsppl_grp_p + ".bp_grp_cd9";
	public static final String $prsppl_grp_nm9 = $prsppl_grp_p + ".bp_grp_nm9";
	public static final String $prsppl_grp_lab10 = $prsppl_grp_p + ".bp_grp_lab10";
	public static final String $prsppl_grp_flg10 = $prsppl_grp_p + ".bp_grp_flg10";
	public static final String $prsppl_grp_cd10 = $prsppl_grp_p + ".bp_grp_cd10";
	public static final String $prsppl_grp_nm10 = $prsppl_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta prov_arrv_req_flg_META = createCommonMeta($prov_arrv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_yet_flg_META = createCommonMeta($arr_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_done_flg_META = createCommonMeta($arr_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_yet_flg_META = createCommonMeta($prnt_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_done_flg_META = createCommonMeta($prnt_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_dt_p_META = createInnerRowMeta($arr_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta arr_dt_p_META = createInnerRowMeta($arr_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta arr_usr_cd_META = createCommonMeta($arr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_usr_nm_META = createCommonMeta($arr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta arr_dpt_cd_META = createCommonMeta($arr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta arr_dpt_nm_META = createCommonMeta($arr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_str_ln_cd_META = createCommonMeta($arr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta arr_str_ln_nm_META = createCommonMeta($arr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta arr_wg_cd_META = createCommonMeta($arr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_wg_nm_META = createCommonMeta($arr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta arr_lg_grp_cd_META = createCommonMeta($arr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_lg_grp_nm_META = createCommonMeta($arr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta arr_site_cd_META = createCommonMeta($arr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta arr_site_nm_META = createCommonMeta($arr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta arr_alloc_grp_cd_META = createCommonMeta($arr_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta arr_alloc_grp_nm_META = createCommonMeta($arr_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_NM_META = createCommonMeta($prov_basis_typ_NM, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_typ_nm_META = createCommonMeta($prov_src_schd_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP_NM);
	public static final MCMeta prov_src_schd_no1_META = createCommonMeta($prov_src_schd_no1, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_src_schd_no2_META = createCommonMeta($prov_src_schd_no2, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_src_act_typ_nm_META = createCommonMeta($prov_src_act_typ_nm, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP_NM);
	public static final MCMeta prov_src_act_no_META = createCommonMeta($prov_src_act_no, mcframe.commonMA.meta.MA_META.PROV_SRC_ACT_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta ext_arr_act_no_META = createCommonMeta($ext_arr_act_no, mcframe.commonMA.meta.MA_META.EXT_ARR_ACT_NO);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta purc_rqst_wg_cd_META = createCommonMeta($purc_rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_rqst_wg_nm_META = createCommonMeta($purc_rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta prms_rcpt_no_META = createCommonMeta($prms_rcpt_no, mcframe.commonMA.meta.MA_META.PRMS_RCPT_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta rcpt_iv_itm_nm_META = createCommonMeta($rcpt_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_invalid_flg_META = createCommonMeta($edi_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_yet_flg_META = createCommonMeta($purc_act_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_print_d_rmrks_META = createCommonMeta($dlv_inst_print_d_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_D_RMRKS);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RMRKS);
	public static final MCMeta ship_wg_cd_META = createCommonMeta($ship_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_wg_nm_META = createCommonMeta($ship_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta sret_fr_cd_META = createCommonMeta($sret_fr_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sret_fr_nm_META = createCommonMeta($sret_fr_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta po_grp_p_META = createInnerRowMeta($po_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta sret_fr_grp_p_META = createInnerRowMeta($sret_fr_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta prsppl_grp_p_META = createInnerRowMeta($prsppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			prov_arrv_req_flg_META,
			stk_lst_prnt_flg_META,
			arr_yet_flg_META,
			arr_done_flg_META,
			abort_flg_META,
			prnt_yet_flg_META,
			prnt_done_flg_META,
			wms_flg_META,
			not_wms_flg_META,
			arr_schd_dt_p_META,
			arr_dt_p_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			prsppl_cd_META,
			prsppl_nm_META,
			arr_usr_cd_META,
			arr_usr_nm_META,
			arr_dpt_cd_META,
			arr_dpt_nm_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			arr_str_ln_cd_META,
			arr_str_ln_nm_META,
			arr_wg_cd_META,
			arr_wg_nm_META,
			arr_lg_grp_cd_META,
			arr_lg_grp_nm_META,
			arr_site_cd_META,
			arr_site_nm_META,
			arr_alloc_grp_cd_META,
			arr_alloc_grp_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			sno_p_META,
			trd_cd_META,
			trd_nm_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_NM_META,
			prov_src_schd_typ_META,
			prov_src_schd_typ_nm_META,
			prov_src_schd_no1_META,
			prov_src_schd_no2_META,
			prov_schd_no_META,
			prov_src_act_typ_META,
			prov_src_act_typ_nm_META,
			prov_src_act_no_META,
			prov_act_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_d_no_META,
			arr_schd_no_META,
			arr_act_no_META,
			ext_arr_act_no_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			arr_cnt_rmrks_META,
			purc_rqst_wg_cd_META,
			purc_rqst_wg_nm_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			bp_lot_no_META,
			po_no_META,
			po_d_no_META,
			dlv_inst_no_META,
			prms_rcpt_no_META,
			rcpt_iv_no_META,
			rcpt_iv_d_no_META,
			purc_act_no_META,
			mfg_inst_no_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			rcpt_iv_itm_nm_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			edi_flg_META,
			edi_invalid_flg_META,
			purc_act_yet_flg_META,
			dlv_inst_print_d_rmrks_META,
			prms_rmrks_META,
			ship_wg_cd_META,
			ship_wg_nm_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			ship_act_no_META,
			iv_no_META,
			iv_d_no_META,
			sret_fr_cd_META,
			sret_fr_nm_META,
			cst_cd_META,
			cst_nm_META,
			sls_ret_schd_no_META,
			sls_act_no_META,
			cst_po_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			po_grp_p_META,
			sret_fr_grp_p_META,
			cst_grp_p_META,
			prsppl_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"arr_schd_dt_fr",
				"arr_schd_hm_fr",
				"arr_schd_dt_to",
				"arr_schd_hm_to",
				"arr_dt_fr",
				"arr_hm_fr",
				"arr_dt_to",
				"arr_hm_to",
				"itm_typ",
				"itm_typ_nm",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"po_grp_flg1",
				"po_grp_cd1",
				"po_grp_nm1",
				"po_grp_flg2",
				"po_grp_cd2",
				"po_grp_nm2",
				"po_grp_flg3",
				"po_grp_cd3",
				"po_grp_nm3",
				"po_grp_flg4",
				"po_grp_cd4",
				"po_grp_nm4",
				"po_grp_flg5",
				"po_grp_cd5",
				"po_grp_nm5",
				"po_grp_flg6",
				"po_grp_cd6",
				"po_grp_nm6",
				"po_grp_flg7",
				"po_grp_cd7",
				"po_grp_nm7",
				"po_grp_flg8",
				"po_grp_cd8",
				"po_grp_nm8",
				"po_grp_flg9",
				"po_grp_cd9",
				"po_grp_nm9",
				"po_grp_flg10",
				"po_grp_cd10",
				"po_grp_nm10",
				"sret_fr_grp_flg1",
				"sret_fr_grp_cd1",
				"sret_fr_grp_nm1",
				"sret_fr_grp_flg2",
				"sret_fr_grp_cd2",
				"sret_fr_grp_nm2",
				"sret_fr_grp_flg3",
				"sret_fr_grp_cd3",
				"sret_fr_grp_nm3",
				"sret_fr_grp_flg4",
				"sret_fr_grp_cd4",
				"sret_fr_grp_nm4",
				"sret_fr_grp_flg5",
				"sret_fr_grp_cd5",
				"sret_fr_grp_nm5",
				"sret_fr_grp_flg6",
				"sret_fr_grp_cd6",
				"sret_fr_grp_nm6",
				"sret_fr_grp_flg7",
				"sret_fr_grp_cd7",
				"sret_fr_grp_nm7",
				"sret_fr_grp_flg8",
				"sret_fr_grp_cd8",
				"sret_fr_grp_nm8",
				"sret_fr_grp_flg9",
				"sret_fr_grp_cd9",
				"sret_fr_grp_nm9",
				"sret_fr_grp_flg10",
				"sret_fr_grp_cd10",
				"sret_fr_grp_nm10",
				"cst_grp_flg1",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_flg2",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_flg3",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_flg4",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_flg5",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_flg6",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_flg7",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_flg8",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_flg9",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_flg10",
				"cst_grp_cd10",
				"cst_grp_nm10",
				"prsppl_grp_flg1",
				"prsppl_grp_cd1",
				"prsppl_grp_nm1",
				"prsppl_grp_flg2",
				"prsppl_grp_cd2",
				"prsppl_grp_nm2",
				"prsppl_grp_flg3",
				"prsppl_grp_cd3",
				"prsppl_grp_nm3",
				"prsppl_grp_flg4",
				"prsppl_grp_cd4",
				"prsppl_grp_nm4",
				"prsppl_grp_flg5",
				"prsppl_grp_cd5",
				"prsppl_grp_nm5",
				"prsppl_grp_flg6",
				"prsppl_grp_cd6",
				"prsppl_grp_nm6",
				"prsppl_grp_flg7",
				"prsppl_grp_cd7",
				"prsppl_grp_nm7",
				"prsppl_grp_flg8",
				"prsppl_grp_cd8",
				"prsppl_grp_nm8",
				"prsppl_grp_flg9",
				"prsppl_grp_cd9",
				"prsppl_grp_nm9",
				"prsppl_grp_flg10",
				"prsppl_grp_cd10",
				"prsppl_grp_nm10",
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
				$arr_schd_dt_fr,
				$arr_schd_hm_fr,
				$arr_schd_dt_to,
				$arr_schd_hm_to,
				$arr_dt_fr,
				$arr_hm_fr,
				$arr_dt_to,
				$arr_hm_to,
				$itm_typ,
				$itm_typ_nm,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$po_grp_flg1,
				$po_grp_cd1,
				$po_grp_nm1,
				$po_grp_flg2,
				$po_grp_cd2,
				$po_grp_nm2,
				$po_grp_flg3,
				$po_grp_cd3,
				$po_grp_nm3,
				$po_grp_flg4,
				$po_grp_cd4,
				$po_grp_nm4,
				$po_grp_flg5,
				$po_grp_cd5,
				$po_grp_nm5,
				$po_grp_flg6,
				$po_grp_cd6,
				$po_grp_nm6,
				$po_grp_flg7,
				$po_grp_cd7,
				$po_grp_nm7,
				$po_grp_flg8,
				$po_grp_cd8,
				$po_grp_nm8,
				$po_grp_flg9,
				$po_grp_cd9,
				$po_grp_nm9,
				$po_grp_flg10,
				$po_grp_cd10,
				$po_grp_nm10,
				$sret_fr_grp_flg1,
				$sret_fr_grp_cd1,
				$sret_fr_grp_nm1,
				$sret_fr_grp_flg2,
				$sret_fr_grp_cd2,
				$sret_fr_grp_nm2,
				$sret_fr_grp_flg3,
				$sret_fr_grp_cd3,
				$sret_fr_grp_nm3,
				$sret_fr_grp_flg4,
				$sret_fr_grp_cd4,
				$sret_fr_grp_nm4,
				$sret_fr_grp_flg5,
				$sret_fr_grp_cd5,
				$sret_fr_grp_nm5,
				$sret_fr_grp_flg6,
				$sret_fr_grp_cd6,
				$sret_fr_grp_nm6,
				$sret_fr_grp_flg7,
				$sret_fr_grp_cd7,
				$sret_fr_grp_nm7,
				$sret_fr_grp_flg8,
				$sret_fr_grp_cd8,
				$sret_fr_grp_nm8,
				$sret_fr_grp_flg9,
				$sret_fr_grp_cd9,
				$sret_fr_grp_nm9,
				$sret_fr_grp_flg10,
				$sret_fr_grp_cd10,
				$sret_fr_grp_nm10,
				$cst_grp_flg1,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_flg2,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_flg3,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_flg4,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_flg5,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_flg6,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_flg7,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_flg8,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_flg9,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_flg10,
				$cst_grp_cd10,
				$cst_grp_nm10,
				$prsppl_grp_flg1,
				$prsppl_grp_cd1,
				$prsppl_grp_nm1,
				$prsppl_grp_flg2,
				$prsppl_grp_cd2,
				$prsppl_grp_nm2,
				$prsppl_grp_flg3,
				$prsppl_grp_cd3,
				$prsppl_grp_nm3,
				$prsppl_grp_flg4,
				$prsppl_grp_cd4,
				$prsppl_grp_nm4,
				$prsppl_grp_flg5,
				$prsppl_grp_cd5,
				$prsppl_grp_nm5,
				$prsppl_grp_flg6,
				$prsppl_grp_cd6,
				$prsppl_grp_nm6,
				$prsppl_grp_flg7,
				$prsppl_grp_cd7,
				$prsppl_grp_nm7,
				$prsppl_grp_flg8,
				$prsppl_grp_cd8,
				$prsppl_grp_nm8,
				$prsppl_grp_flg9,
				$prsppl_grp_cd9,
				$prsppl_grp_nm9,
				$prsppl_grp_flg10,
				$prsppl_grp_cd10,
				$prsppl_grp_nm10,
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
	/** 項目属性情報のグループ[PROV_ONLY_ITEM]のキー定数 */
	public static final String $$PROV_ONLY_ITEM = "PROV_ONLY_ITEM";
	/** 項目属性情報のグループ[ARR_ONLY_ITEM]のキー定数 */
	public static final String $$ARR_ONLY_ITEM = "ARR_ONLY_ITEM";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$rqst_usr_cd, "usr_nm"},	// rqst_usr_cd
				{$rqst_dpt_cd, "dpt_nm"},	// rqst_dpt_cd
				{$prsppl_cd, "bp_nm"},	// prsppl_cd
				{$arr_usr_cd, "usr_nm"},	// arr_usr_cd
				{$arr_dpt_cd, "dpt_nm"},	// arr_dpt_cd
				{$arr_loc_cd, "loc_nm"},	// arr_loc_cd
				{$arr_str_ln_cd, "str_ln_nm"},	// arr_str_ln_cd
				{$arr_wg_cd, "wg_nm"},	// arr_wg_cd
				{$arr_lg_grp_cd, "lg_grp_nm"},	// arr_lg_grp_cd
				{$arr_site_cd, "site_nm"},	// arr_site_cd
				{$arr_alloc_grp_cd, "alloc_grp_nm"},	// arr_alloc_grp_cd
				{$prov_typ, "prov_typ_nm"},	// prov_typ
				{$prov_basis_typ, "prov_basis_typ_NM"},	// prov_basis_typ
				{$prov_src_schd_typ, "prov_src_schd_typ_nm"},	// prov_src_schd_typ
				{$prov_src_act_typ, "prov_src_act_typ_nm"},	// prov_src_act_typ
				{$purc_rqst_wg_cd, "wg_nm"},	// purc_rqst_wg_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$ship_wg_cd, "wg_nm"},	// ship_wg_cd
				{$ship_lg_grp_cd, "lg_grp_nm"},	// ship_lg_grp_cd
				{$sret_fr_cd, "bp_nm"},	// sret_fr_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$cst_itm_cd, "bp_itm_nm"}	// cst_itm_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rqst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_dpt_cd
				{$prsppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// prsppl_cd
				{$arr_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.ARR;true;true"},	// arr_dpt_cd
				{$arr_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// arr_loc_cd
				{$arr_str_ln_cd, "arr_loc_cd;true"},	// arr_str_ln_cd
				{$arr_lg_grp_cd, "arr_wg_cd"},	// arr_lg_grp_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"},	// maker_cd
				{$ship_lg_grp_cd, "ship_wg_cd"},	// ship_lg_grp_cd
				{$sret_fr_cd, "MAC_BP_IS_SRCH_TYP.DLV;true"},	// sret_fr_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rqst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// rqst_dpt_cd
				{$prsppl_cd, "bp_is_srch_typ"},	// prsppl_cd
				{$arr_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ;rd_flg;wr_flg"},	// arr_dpt_cd
				{$arr_loc_cd, "loc_is_srch_typ"},	// arr_loc_cd
				{$arr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// arr_str_ln_cd
				{$arr_lg_grp_cd, "wg_cd"},	// arr_lg_grp_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ"},	// maker_cd
				{$ship_lg_grp_cd, "wg_cd"},	// ship_lg_grp_cd
				{$sret_fr_cd, "bp_is_srch_typ;sundry_bp_nm_rem_flg"},	// sret_fr_cd
				{$cst_cd, "bp_is_srch_typ"}	// cst_cd
			}
		)),
		new MCExtMap.Entry($$PROV_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$prsppl_cd, "E"},	// prsppl_cd
				{$prsppl_nm, "E"},	// prsppl_nm
				{$prov_typ, "E"},	// prov_typ
				{$prov_typ_nm, "E"},	// prov_typ_nm
				{$prov_basis_typ, "E"},	// prov_basis_typ
				{$prov_basis_typ_NM, "E"},	// prov_basis_typ_NM
				{$prov_src_schd_typ, "E"},	// prov_src_schd_typ
				{$prov_src_schd_typ_nm, "E"},	// prov_src_schd_typ_nm
				{$prov_src_schd_no1, "E"},	// prov_src_schd_no1
				{$prov_src_schd_no2, "E"},	// prov_src_schd_no2
				{$prov_schd_no, "E"},	// prov_schd_no
				{$prov_src_act_typ, "E"},	// prov_src_act_typ
				{$prov_src_act_typ_nm, "E"},	// prov_src_act_typ_nm
				{$prov_src_act_no, "E"},	// prov_src_act_no
				{$prov_act_no, "E"},	// prov_act_no
				{$prsppl_grp_p + ".bp_grp_lab1", "E"},	// prsppl_grp_p.bp_grp_lab1
				{$prsppl_grp_p + ".bp_grp_flg1", "E"},	// prsppl_grp_p.bp_grp_flg1
				{$prsppl_grp_p + ".bp_grp_cd1", "E"},	// prsppl_grp_p.bp_grp_cd1
				{$prsppl_grp_p + ".bp_grp_nm1", "E"},	// prsppl_grp_p.bp_grp_nm1
				{$prsppl_grp_p + ".bp_grp_lab2", "E"},	// prsppl_grp_p.bp_grp_lab2
				{$prsppl_grp_p + ".bp_grp_flg2", "E"},	// prsppl_grp_p.bp_grp_flg2
				{$prsppl_grp_p + ".bp_grp_cd2", "E"},	// prsppl_grp_p.bp_grp_cd2
				{$prsppl_grp_p + ".bp_grp_nm2", "E"},	// prsppl_grp_p.bp_grp_nm2
				{$prsppl_grp_p + ".bp_grp_lab3", "E"},	// prsppl_grp_p.bp_grp_lab3
				{$prsppl_grp_p + ".bp_grp_flg3", "E"},	// prsppl_grp_p.bp_grp_flg3
				{$prsppl_grp_p + ".bp_grp_cd3", "E"},	// prsppl_grp_p.bp_grp_cd3
				{$prsppl_grp_p + ".bp_grp_nm3", "E"},	// prsppl_grp_p.bp_grp_nm3
				{$prsppl_grp_p + ".bp_grp_lab4", "E"},	// prsppl_grp_p.bp_grp_lab4
				{$prsppl_grp_p + ".bp_grp_flg4", "E"},	// prsppl_grp_p.bp_grp_flg4
				{$prsppl_grp_p + ".bp_grp_cd4", "E"},	// prsppl_grp_p.bp_grp_cd4
				{$prsppl_grp_p + ".bp_grp_nm4", "E"},	// prsppl_grp_p.bp_grp_nm4
				{$prsppl_grp_p + ".bp_grp_lab5", "E"},	// prsppl_grp_p.bp_grp_lab5
				{$prsppl_grp_p + ".bp_grp_flg5", "E"},	// prsppl_grp_p.bp_grp_flg5
				{$prsppl_grp_p + ".bp_grp_cd5", "E"},	// prsppl_grp_p.bp_grp_cd5
				{$prsppl_grp_p + ".bp_grp_nm5", "E"},	// prsppl_grp_p.bp_grp_nm5
				{$prsppl_grp_p + ".bp_grp_lab6", "E"},	// prsppl_grp_p.bp_grp_lab6
				{$prsppl_grp_p + ".bp_grp_flg6", "E"},	// prsppl_grp_p.bp_grp_flg6
				{$prsppl_grp_p + ".bp_grp_cd6", "E"},	// prsppl_grp_p.bp_grp_cd6
				{$prsppl_grp_p + ".bp_grp_nm6", "E"},	// prsppl_grp_p.bp_grp_nm6
				{$prsppl_grp_p + ".bp_grp_lab7", "E"},	// prsppl_grp_p.bp_grp_lab7
				{$prsppl_grp_p + ".bp_grp_flg7", "E"},	// prsppl_grp_p.bp_grp_flg7
				{$prsppl_grp_p + ".bp_grp_cd7", "E"},	// prsppl_grp_p.bp_grp_cd7
				{$prsppl_grp_p + ".bp_grp_nm7", "E"},	// prsppl_grp_p.bp_grp_nm7
				{$prsppl_grp_p + ".bp_grp_lab8", "E"},	// prsppl_grp_p.bp_grp_lab8
				{$prsppl_grp_p + ".bp_grp_flg8", "E"},	// prsppl_grp_p.bp_grp_flg8
				{$prsppl_grp_p + ".bp_grp_cd8", "E"},	// prsppl_grp_p.bp_grp_cd8
				{$prsppl_grp_p + ".bp_grp_nm8", "E"},	// prsppl_grp_p.bp_grp_nm8
				{$prsppl_grp_p + ".bp_grp_lab9", "E"},	// prsppl_grp_p.bp_grp_lab9
				{$prsppl_grp_p + ".bp_grp_flg9", "E"},	// prsppl_grp_p.bp_grp_flg9
				{$prsppl_grp_p + ".bp_grp_cd9", "E"},	// prsppl_grp_p.bp_grp_cd9
				{$prsppl_grp_p + ".bp_grp_nm9", "E"},	// prsppl_grp_p.bp_grp_nm9
				{$prsppl_grp_p + ".bp_grp_lab10", "E"},	// prsppl_grp_p.bp_grp_lab10
				{$prsppl_grp_p + ".bp_grp_flg10", "E"},	// prsppl_grp_p.bp_grp_flg10
				{$prsppl_grp_p + ".bp_grp_cd10", "E"},	// prsppl_grp_p.bp_grp_cd10
				{$prsppl_grp_p + ".bp_grp_nm10", "E"}	// prsppl_grp_p.bp_grp_nm10
			}
		)),
		new MCExtMap.Entry($$ARR_ONLY_ITEM, new MCExtList(
			new String[][]{
				{$prnt_yet_flg, "E"},	// prnt_yet_flg
				{$prnt_done_flg, "E"},	// prnt_done_flg
				{$po_schd_src_typ, "E"},	// po_schd_src_typ
				{$po_schd_src_typ_nm, "E"},	// po_schd_src_typ_nm
				{$po_schd_src_no, "E"},	// po_schd_src_no
				{$sret_fr_cd, "E"},	// sret_fr_cd
				{$sret_fr_nm, "E"},	// sret_fr_nm
				{$cst_cd, "E"},	// cst_cd
				{$cst_nm, "E"},	// cst_nm
				{$sls_ret_schd_no, "E"},	// sls_ret_schd_no
				{$sls_act_no, "E"},	// sls_act_no
				{$cst_po_no, "E"},	// cst_po_no
				{$cst_itm_cd, "E"},	// cst_itm_cd
				{$cst_itm_nm, "E"},	// cst_itm_nm
				{$sret_fr_grp_p + ".bp_grp_lab1", "E"},	// sret_fr_grp_p.bp_grp_lab1
				{$sret_fr_grp_p + ".bp_grp_flg1", "E"},	// sret_fr_grp_p.bp_grp_flg1
				{$sret_fr_grp_p + ".bp_grp_cd1", "E"},	// sret_fr_grp_p.bp_grp_cd1
				{$sret_fr_grp_p + ".bp_grp_nm1", "E"},	// sret_fr_grp_p.bp_grp_nm1
				{$sret_fr_grp_p + ".bp_grp_lab2", "E"},	// sret_fr_grp_p.bp_grp_lab2
				{$sret_fr_grp_p + ".bp_grp_flg2", "E"},	// sret_fr_grp_p.bp_grp_flg2
				{$sret_fr_grp_p + ".bp_grp_cd2", "E"},	// sret_fr_grp_p.bp_grp_cd2
				{$sret_fr_grp_p + ".bp_grp_nm2", "E"},	// sret_fr_grp_p.bp_grp_nm2
				{$sret_fr_grp_p + ".bp_grp_lab3", "E"},	// sret_fr_grp_p.bp_grp_lab3
				{$sret_fr_grp_p + ".bp_grp_flg3", "E"},	// sret_fr_grp_p.bp_grp_flg3
				{$sret_fr_grp_p + ".bp_grp_cd3", "E"},	// sret_fr_grp_p.bp_grp_cd3
				{$sret_fr_grp_p + ".bp_grp_nm3", "E"},	// sret_fr_grp_p.bp_grp_nm3
				{$sret_fr_grp_p + ".bp_grp_lab4", "E"},	// sret_fr_grp_p.bp_grp_lab4
				{$sret_fr_grp_p + ".bp_grp_flg4", "E"},	// sret_fr_grp_p.bp_grp_flg4
				{$sret_fr_grp_p + ".bp_grp_cd4", "E"},	// sret_fr_grp_p.bp_grp_cd4
				{$sret_fr_grp_p + ".bp_grp_nm4", "E"},	// sret_fr_grp_p.bp_grp_nm4
				{$sret_fr_grp_p + ".bp_grp_lab5", "E"},	// sret_fr_grp_p.bp_grp_lab5
				{$sret_fr_grp_p + ".bp_grp_flg5", "E"},	// sret_fr_grp_p.bp_grp_flg5
				{$sret_fr_grp_p + ".bp_grp_cd5", "E"},	// sret_fr_grp_p.bp_grp_cd5
				{$sret_fr_grp_p + ".bp_grp_nm5", "E"},	// sret_fr_grp_p.bp_grp_nm5
				{$sret_fr_grp_p + ".bp_grp_lab6", "E"},	// sret_fr_grp_p.bp_grp_lab6
				{$sret_fr_grp_p + ".bp_grp_flg6", "E"},	// sret_fr_grp_p.bp_grp_flg6
				{$sret_fr_grp_p + ".bp_grp_cd6", "E"},	// sret_fr_grp_p.bp_grp_cd6
				{$sret_fr_grp_p + ".bp_grp_nm6", "E"},	// sret_fr_grp_p.bp_grp_nm6
				{$sret_fr_grp_p + ".bp_grp_lab7", "E"},	// sret_fr_grp_p.bp_grp_lab7
				{$sret_fr_grp_p + ".bp_grp_flg7", "E"},	// sret_fr_grp_p.bp_grp_flg7
				{$sret_fr_grp_p + ".bp_grp_cd7", "E"},	// sret_fr_grp_p.bp_grp_cd7
				{$sret_fr_grp_p + ".bp_grp_nm7", "E"},	// sret_fr_grp_p.bp_grp_nm7
				{$sret_fr_grp_p + ".bp_grp_lab8", "E"},	// sret_fr_grp_p.bp_grp_lab8
				{$sret_fr_grp_p + ".bp_grp_flg8", "E"},	// sret_fr_grp_p.bp_grp_flg8
				{$sret_fr_grp_p + ".bp_grp_cd8", "E"},	// sret_fr_grp_p.bp_grp_cd8
				{$sret_fr_grp_p + ".bp_grp_nm8", "E"},	// sret_fr_grp_p.bp_grp_nm8
				{$sret_fr_grp_p + ".bp_grp_lab9", "E"},	// sret_fr_grp_p.bp_grp_lab9
				{$sret_fr_grp_p + ".bp_grp_flg9", "E"},	// sret_fr_grp_p.bp_grp_flg9
				{$sret_fr_grp_p + ".bp_grp_cd9", "E"},	// sret_fr_grp_p.bp_grp_cd9
				{$sret_fr_grp_p + ".bp_grp_nm9", "E"},	// sret_fr_grp_p.bp_grp_nm9
				{$sret_fr_grp_p + ".bp_grp_lab10", "E"},	// sret_fr_grp_p.bp_grp_lab10
				{$sret_fr_grp_p + ".bp_grp_flg10", "E"},	// sret_fr_grp_p.bp_grp_flg10
				{$sret_fr_grp_p + ".bp_grp_cd10", "E"},	// sret_fr_grp_p.bp_grp_cd10
				{$sret_fr_grp_p + ".bp_grp_nm10", "E"},	// sret_fr_grp_p.bp_grp_nm10
				{$cst_grp_p + ".bp_grp_lab1", "E"},	// cst_grp_p.bp_grp_lab1
				{$cst_grp_p + ".bp_grp_flg1", "E"},	// cst_grp_p.bp_grp_flg1
				{$cst_grp_p + ".bp_grp_cd1", "E"},	// cst_grp_p.bp_grp_cd1
				{$cst_grp_p + ".bp_grp_nm1", "E"},	// cst_grp_p.bp_grp_nm1
				{$cst_grp_p + ".bp_grp_lab2", "E"},	// cst_grp_p.bp_grp_lab2
				{$cst_grp_p + ".bp_grp_flg2", "E"},	// cst_grp_p.bp_grp_flg2
				{$cst_grp_p + ".bp_grp_cd2", "E"},	// cst_grp_p.bp_grp_cd2
				{$cst_grp_p + ".bp_grp_nm2", "E"},	// cst_grp_p.bp_grp_nm2
				{$cst_grp_p + ".bp_grp_lab3", "E"},	// cst_grp_p.bp_grp_lab3
				{$cst_grp_p + ".bp_grp_flg3", "E"},	// cst_grp_p.bp_grp_flg3
				{$cst_grp_p + ".bp_grp_cd3", "E"},	// cst_grp_p.bp_grp_cd3
				{$cst_grp_p + ".bp_grp_nm3", "E"},	// cst_grp_p.bp_grp_nm3
				{$cst_grp_p + ".bp_grp_lab4", "E"},	// cst_grp_p.bp_grp_lab4
				{$cst_grp_p + ".bp_grp_flg4", "E"},	// cst_grp_p.bp_grp_flg4
				{$cst_grp_p + ".bp_grp_cd4", "E"},	// cst_grp_p.bp_grp_cd4
				{$cst_grp_p + ".bp_grp_nm4", "E"},	// cst_grp_p.bp_grp_nm4
				{$cst_grp_p + ".bp_grp_lab5", "E"},	// cst_grp_p.bp_grp_lab5
				{$cst_grp_p + ".bp_grp_flg5", "E"},	// cst_grp_p.bp_grp_flg5
				{$cst_grp_p + ".bp_grp_cd5", "E"},	// cst_grp_p.bp_grp_cd5
				{$cst_grp_p + ".bp_grp_nm5", "E"},	// cst_grp_p.bp_grp_nm5
				{$cst_grp_p + ".bp_grp_lab6", "E"},	// cst_grp_p.bp_grp_lab6
				{$cst_grp_p + ".bp_grp_flg6", "E"},	// cst_grp_p.bp_grp_flg6
				{$cst_grp_p + ".bp_grp_cd6", "E"},	// cst_grp_p.bp_grp_cd6
				{$cst_grp_p + ".bp_grp_nm6", "E"},	// cst_grp_p.bp_grp_nm6
				{$cst_grp_p + ".bp_grp_lab7", "E"},	// cst_grp_p.bp_grp_lab7
				{$cst_grp_p + ".bp_grp_flg7", "E"},	// cst_grp_p.bp_grp_flg7
				{$cst_grp_p + ".bp_grp_cd7", "E"},	// cst_grp_p.bp_grp_cd7
				{$cst_grp_p + ".bp_grp_nm7", "E"},	// cst_grp_p.bp_grp_nm7
				{$cst_grp_p + ".bp_grp_lab8", "E"},	// cst_grp_p.bp_grp_lab8
				{$cst_grp_p + ".bp_grp_flg8", "E"},	// cst_grp_p.bp_grp_flg8
				{$cst_grp_p + ".bp_grp_cd8", "E"},	// cst_grp_p.bp_grp_cd8
				{$cst_grp_p + ".bp_grp_nm8", "E"},	// cst_grp_p.bp_grp_nm8
				{$cst_grp_p + ".bp_grp_lab9", "E"},	// cst_grp_p.bp_grp_lab9
				{$cst_grp_p + ".bp_grp_flg9", "E"},	// cst_grp_p.bp_grp_flg9
				{$cst_grp_p + ".bp_grp_cd9", "E"},	// cst_grp_p.bp_grp_cd9
				{$cst_grp_p + ".bp_grp_nm9", "E"},	// cst_grp_p.bp_grp_nm9
				{$cst_grp_p + ".bp_grp_lab10", "E"},	// cst_grp_p.bp_grp_lab10
				{$cst_grp_p + ".bp_grp_flg10", "E"},	// cst_grp_p.bp_grp_flg10
				{$cst_grp_p + ".bp_grp_cd10", "E"},	// cst_grp_p.bp_grp_cd10
				{$cst_grp_p + ".bp_grp_nm10", "E"}	// cst_grp_p.bp_grp_nm10
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$arr_str_ln_cd, "STR_LN"},	// arr_str_ln_cd
				{$arr_str_ln_nm, "STR_LN"},	// arr_str_ln_nm
				{$arr_wg_cd, "WG"},	// arr_wg_cd
				{$arr_wg_nm, "WG"},	// arr_wg_nm
				{$arr_lg_grp_cd, "LG_GRP"},	// arr_lg_grp_cd
				{$arr_lg_grp_nm, "LG_GRP"},	// arr_lg_grp_nm
				{$arr_site_cd, "SITE"},	// arr_site_cd
				{$arr_site_nm, "SITE"},	// arr_site_nm
				{$arr_alloc_grp_cd, "ALLOC_GRP"},	// arr_alloc_grp_cd
				{$arr_alloc_grp_nm, "ALLOC_GRP"},	// arr_alloc_grp_nm
				{$purc_rqst_wg_cd, "WG"},	// purc_rqst_wg_cd
				{$purc_rqst_wg_nm, "WG"},	// purc_rqst_wg_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$ship_wg_cd, "WG"},	// ship_wg_cd
				{$ship_wg_nm, "WG"},	// ship_wg_nm
				{$ship_lg_grp_cd, "LG_GRP"},	// ship_lg_grp_cd
				{$ship_lg_grp_nm, "LG_GRP"}	// ship_lg_grp_nm
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
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue identification tag INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,現品票発行.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create;UPD,Modify;DEL,Cancel;REF,View;PRNT,Issue identification tag INS,登録する;UPD,訂正する;DEL,取り消す;REF,参照する;PRNT,現品票発行.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Receipt list of supplied inventory 支給品着荷一覧登録.<p>
	 *
	 */
	public boolean prov_arrv_req_flg() {
		return getConstBoolean(offset + 1, $prov_arrv_req_flg);
	}

	/**
	 * Receipt list of supplied inventory 支給品着荷一覧登録.<p>
	 *
	 */
	public void prov_arrv_req_flg(boolean value) {
		setConstBoolean(offset + 1, $prov_arrv_req_flg, value);
	}


	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 2, $stk_lst_prnt_flg);
	}

	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $stk_lst_prnt_flg, value);
	}


	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public boolean arr_yet_flg() {
		return getConstBoolean(offset + 3, $arr_yet_flg);
	}

	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public void arr_yet_flg(boolean value) {
		setConstBoolean(offset + 3, $arr_yet_flg, value);
	}


	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public boolean arr_done_flg() {
		return getConstBoolean(offset + 4, $arr_done_flg);
	}

	/**
	 * Receipt 入荷.<p>
	 *
	 */
	public void arr_done_flg(boolean value) {
		setConstBoolean(offset + 4, $arr_done_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 5, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 5, $abort_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean prnt_yet_flg() {
		return getConstBoolean(offset + 6, $prnt_yet_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void prnt_yet_flg(boolean value) {
		setConstBoolean(offset + 6, $prnt_yet_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt_done_flg() {
		return getConstBoolean(offset + 7, $prnt_done_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt_done_flg(boolean value) {
		setConstBoolean(offset + 7, $prnt_done_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 8, $wms_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 8, $wms_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 9, $not_wms_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 9, $not_wms_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 10, $arr_schd_dt_p);
	}
	
	public void arr_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 10, $arr_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $arr_dt_p);
	}
	
	public void arr_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $arr_dt_p, row);
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


	/**
	 * Requesting PIC cd. 依頼元担当ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 16, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 16, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 17, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 17, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 18, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 18, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 19, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 19, $rqst_dpt_nm, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 20, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 20, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 21, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 21, $prsppl_nm, value);
	}


	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return getConstString(offset + 22, $arr_usr_cd);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		setConstString(offset + 22, $arr_usr_cd, value);
	}


	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return getConstString(offset + 23, $arr_usr_nm);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		setConstString(offset + 23, $arr_usr_nm, value);
	}


	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return getConstString(offset + 24, $arr_dpt_cd);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		setConstString(offset + 24, $arr_dpt_cd, value);
	}


	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return getConstString(offset + 25, $arr_dpt_nm);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		setConstString(offset + 25, $arr_dpt_nm, value);
	}


	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 26, $arr_loc_cd);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 26, $arr_loc_cd, value);
	}


	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 27, $arr_loc_nm);
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 27, $arr_loc_nm, value);
	}


	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return getConstString(offset + 28, $arr_str_ln_cd);
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		setConstString(offset + 28, $arr_str_ln_cd, value);
	}


	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public String arr_str_ln_nm() {
		return getConstString(offset + 29, $arr_str_ln_nm);
	}

	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public void arr_str_ln_nm(String value) {
		setConstString(offset + 29, $arr_str_ln_nm, value);
	}


	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public String arr_wg_cd() {
		return getConstString(offset + 30, $arr_wg_cd);
	}

	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public void arr_wg_cd(String value) {
		setConstString(offset + 30, $arr_wg_cd, value);
	}


	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public String arr_wg_nm() {
		return getConstString(offset + 31, $arr_wg_nm);
	}

	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public void arr_wg_nm(String value) {
		setConstString(offset + 31, $arr_wg_nm, value);
	}


	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return getConstString(offset + 32, $arr_lg_grp_cd);
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		setConstString(offset + 32, $arr_lg_grp_cd, value);
	}


	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public String arr_lg_grp_nm() {
		return getConstString(offset + 33, $arr_lg_grp_nm);
	}

	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public void arr_lg_grp_nm(String value) {
		setConstString(offset + 33, $arr_lg_grp_nm, value);
	}


	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String arr_site_cd() {
		return getConstString(offset + 34, $arr_site_cd);
	}

	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void arr_site_cd(String value) {
		setConstString(offset + 34, $arr_site_cd, value);
	}


	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public String arr_site_nm() {
		return getConstString(offset + 35, $arr_site_nm);
	}

	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public void arr_site_nm(String value) {
		setConstString(offset + 35, $arr_site_nm, value);
	}


	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public String arr_alloc_grp_cd() {
		return getConstString(offset + 36, $arr_alloc_grp_cd);
	}

	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public void arr_alloc_grp_cd(String value) {
		setConstString(offset + 36, $arr_alloc_grp_cd, value);
	}


	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public String arr_alloc_grp_nm() {
		return getConstString(offset + 37, $arr_alloc_grp_nm);
	}

	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public void arr_alloc_grp_nm(String value) {
		setConstString(offset + 37, $arr_alloc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 38, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 38, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 39, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 39, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 40, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 40, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 41, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 41, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 42, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 42, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 43, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 43, $sno_p, row);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 44, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 44, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 45, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 45, $trd_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 46, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 46, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 47, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 47, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 48, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 48, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_NM() {
		return getConstString(offset + 49, $prov_basis_typ_NM);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_NM(String value) {
		setConstString(offset + 49, $prov_basis_typ_NM, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 50, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 50, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public String prov_src_schd_typ_nm() {
		return getConstString(offset + 51, $prov_src_schd_typ_nm);
	}

	/**
	 * Supply-from schedule type name 支給元予定区分名.<p>
	 *
	 */
	public void prov_src_schd_typ_nm(String value) {
		setConstString(offset + 51, $prov_src_schd_typ_nm, value);
	}


	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public String prov_src_schd_no1() {
		return getConstString(offset + 52, $prov_src_schd_no1);
	}

	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public void prov_src_schd_no1(String value) {
		setConstString(offset + 52, $prov_src_schd_no1, value);
	}


	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public String prov_src_schd_no2() {
		return getConstString(offset + 53, $prov_src_schd_no2);
	}

	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public void prov_src_schd_no2(String value) {
		setConstString(offset + 53, $prov_src_schd_no2, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 54, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 54, $prov_schd_no, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 55, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 55, $prov_src_act_typ, value);
	}


	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public String prov_src_act_typ_nm() {
		return getConstString(offset + 56, $prov_src_act_typ_nm);
	}

	/**
	 * Supply-from result type name 支給元実績区分名.<p>
	 *
	 */
	public void prov_src_act_typ_nm(String value) {
		setConstString(offset + 56, $prov_src_act_typ_nm, value);
	}


	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public String prov_src_act_no() {
		return getConstString(offset + 57, $prov_src_act_no);
	}

	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public void prov_src_act_no(String value) {
		setConstString(offset + 57, $prov_src_act_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 58, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 58, $prov_act_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 59, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 59, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 60, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 60, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 60, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 60, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 60, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 60, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 61, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 61, $dlv_slip_d_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 62, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 62, $arr_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 63, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 63, $arr_act_no, value);
	}


	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return getConstString(offset + 64, $ext_arr_act_no);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		setConstString(offset + 64, $ext_arr_act_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 65, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 65, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 66, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 66, $trd_d_rmrks, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 67, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 67, $arr_cnt_rmrks, value);
	}


	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_rqst_wg_cd() {
		return getConstString(offset + 68, $purc_rqst_wg_cd);
	}

	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_rqst_wg_cd(String value) {
		setConstString(offset + 68, $purc_rqst_wg_cd, value);
	}


	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public String purc_rqst_wg_nm() {
		return getConstString(offset + 69, $purc_rqst_wg_nm);
	}

	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public void purc_rqst_wg_nm(String value) {
		setConstString(offset + 69, $purc_rqst_wg_nm, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 70, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 70, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 71, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 71, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 72, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 72, $po_schd_src_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 73, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 73, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 74, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 74, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 75, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 75, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 76, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 76, $maker_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 77, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 77, $bp_lot_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 78, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 78, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 79, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 79, $po_d_no, value);
	}


	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 80, $dlv_inst_no);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 80, $dlv_inst_no, value);
	}


	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 81, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 81, $prms_rcpt_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 82, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 82, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 83, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 83, $rcpt_iv_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 84, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 84, $purc_act_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 85, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 85, $mfg_inst_no, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 86, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 86, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 87, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 87, $sppl_itm_nm, value);
	}


	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return getConstString(offset + 88, $rcpt_iv_itm_nm);
	}

	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		setConstString(offset + 88, $rcpt_iv_itm_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 89, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 89, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 90, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 90, $purc_id_typ_nm, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 91, $edi_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 91, $edi_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean edi_invalid_flg() {
		return getConstBoolean(offset + 92, $edi_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void edi_invalid_flg(boolean value) {
		setConstBoolean(offset + 92, $edi_invalid_flg, value);
	}


	/**
	 * Include item in transit 未着品を含む.<p>
	 *
	 */
	public boolean purc_act_yet_flg() {
		return getConstBoolean(offset + 93, $purc_act_yet_flg);
	}

	/**
	 * Include item in transit 未着品を含む.<p>
	 *
	 */
	public void purc_act_yet_flg(boolean value) {
		setConstBoolean(offset + 93, $purc_act_yet_flg, value);
	}


	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public String dlv_inst_print_d_rmrks() {
		return getConstString(offset + 94, $dlv_inst_print_d_rmrks);
	}

	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public void dlv_inst_print_d_rmrks(String value) {
		setConstString(offset + 94, $dlv_inst_print_d_rmrks, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 95, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 95, $prms_rmrks, value);
	}


	/**
	 * Shipping WG cd. 出荷ＷＧ ＣＤ.<p>
	 *
	 */
	public String ship_wg_cd() {
		return getConstString(offset + 96, $ship_wg_cd);
	}

	/**
	 * Shipping WG cd. 出荷ＷＧ ＣＤ.<p>
	 *
	 */
	public void ship_wg_cd(String value) {
		setConstString(offset + 96, $ship_wg_cd, value);
	}


	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public String ship_wg_nm() {
		return getConstString(offset + 97, $ship_wg_nm);
	}

	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public void ship_wg_nm(String value) {
		setConstString(offset + 97, $ship_wg_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 98, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 98, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 99, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 99, $ship_lg_grp_nm, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 100, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 100, $ship_act_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 101, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 101, $iv_no, value);
	}


	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 102, $iv_d_no);
	}

	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 102, $iv_d_no, value);
	}


	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 103, $sret_fr_cd);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 103, $sret_fr_cd, value);
	}


	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public String sret_fr_nm() {
		return getConstString(offset + 104, $sret_fr_nm);
	}

	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public void sret_fr_nm(String value) {
		setConstString(offset + 104, $sret_fr_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 105, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 105, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 106, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 106, $cst_nm, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 107, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 107, $sls_ret_schd_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 108, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 108, $sls_act_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 109, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 109, $cst_po_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 110, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 110, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 111, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 111, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR po_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 112, $po_grp_p);
	}
	
	public void po_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 112, $po_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sret_fr_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 113, $sret_fr_grp_p);
	}
	
	public void sret_fr_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 113, $sret_fr_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 114, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 114, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR prsppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 115, $prsppl_grp_p);
	}
	
	public void prsppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 115, $prsppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 116, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 116, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			return arr_str_ln_cd();
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			return arr_str_ln_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			return arr_site_cd();
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			return arr_site_nm();
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			return arr_alloc_grp_cd();
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			return arr_alloc_grp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_NM.equalsIgnoreCase(name)) {
			return prov_basis_typ_NM();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			return ext_arr_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			return purc_rqst_wg_cd();
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			return purc_rqst_wg_nm();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
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
		if ($prov_arrv_req_flg.equalsIgnoreCase(name)) {
			return prov_arrv_req_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($arr_yet_flg.equalsIgnoreCase(name)) {
			return arr_yet_flg();
		}
		if ($arr_done_flg.equalsIgnoreCase(name)) {
			return arr_done_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($prnt_yet_flg.equalsIgnoreCase(name)) {
			return prnt_yet_flg();
		}
		if ($prnt_done_flg.equalsIgnoreCase(name)) {
			return prnt_done_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			return edi_invalid_flg();
		}
		if ($purc_act_yet_flg.equalsIgnoreCase(name)) {
			return purc_act_yet_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			return arr_loc_cd();
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			return arr_loc_nm();
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			return arr_str_ln_cd();
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			return arr_str_ln_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			return arr_site_cd();
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			return arr_site_nm();
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			return arr_alloc_grp_cd();
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			return arr_alloc_grp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_NM.equalsIgnoreCase(name)) {
			return prov_basis_typ_NM();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_schd_typ_nm();
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			return prov_src_schd_no1();
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			return prov_src_schd_no2();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			return prov_src_act_typ();
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			return prov_src_act_typ_nm();
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			return ext_arr_act_no();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			return purc_rqst_wg_cd();
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			return purc_rqst_wg_nm();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			return prms_rcpt_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			return rcpt_iv_itm_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			return sret_fr_cd();
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			return sret_fr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
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
		if ($prov_arrv_req_flg.equalsIgnoreCase(name)) {
			return prov_arrv_req_flg();
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		if ($arr_yet_flg.equalsIgnoreCase(name)) {
			return arr_yet_flg();
		}
		if ($arr_done_flg.equalsIgnoreCase(name)) {
			return arr_done_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($prnt_yet_flg.equalsIgnoreCase(name)) {
			return prnt_yet_flg();
		}
		if ($prnt_done_flg.equalsIgnoreCase(name)) {
			return prnt_done_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			return edi_invalid_flg();
		}
		if ($purc_act_yet_flg.equalsIgnoreCase(name)) {
			return purc_act_yet_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			arr_str_ln_cd(value);
			return;
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			arr_str_ln_nm(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			arr_wg_nm(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			arr_site_cd(value);
			return;
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			arr_site_nm(value);
			return;
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			arr_alloc_grp_cd(value);
			return;
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			arr_alloc_grp_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_NM.equalsIgnoreCase(name)) {
			prov_basis_typ_NM(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			ext_arr_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			purc_rqst_wg_cd(value);
			return;
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			purc_rqst_wg_nm(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			sret_fr_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($prov_arrv_req_flg.equalsIgnoreCase(name)) {
			prov_arrv_req_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($arr_yet_flg.equalsIgnoreCase(name)) {
			arr_yet_flg(value);
			return;
		}
		if ($arr_done_flg.equalsIgnoreCase(name)) {
			arr_done_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($prnt_yet_flg.equalsIgnoreCase(name)) {
			prnt_yet_flg(value);
			return;
		}
		if ($prnt_done_flg.equalsIgnoreCase(name)) {
			prnt_done_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			edi_invalid_flg(value);
			return;
		}
		if ($purc_act_yet_flg.equalsIgnoreCase(name)) {
			purc_act_yet_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			rqst_usr_cd(value);
			return;
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			rqst_usr_nm(value);
			return;
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
			return;
		}
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			arr_usr_cd(value);
			return;
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			arr_usr_nm(value);
			return;
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
			return;
		}
		if ($arr_loc_cd.equalsIgnoreCase(name)) {
			arr_loc_cd(value);
			return;
		}
		if ($arr_loc_nm.equalsIgnoreCase(name)) {
			arr_loc_nm(value);
			return;
		}
		if ($arr_str_ln_cd.equalsIgnoreCase(name)) {
			arr_str_ln_cd(value);
			return;
		}
		if ($arr_str_ln_nm.equalsIgnoreCase(name)) {
			arr_str_ln_nm(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			arr_wg_nm(value);
			return;
		}
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
			return;
		}
		if ($arr_site_cd.equalsIgnoreCase(name)) {
			arr_site_cd(value);
			return;
		}
		if ($arr_site_nm.equalsIgnoreCase(name)) {
			arr_site_nm(value);
			return;
		}
		if ($arr_alloc_grp_cd.equalsIgnoreCase(name)) {
			arr_alloc_grp_cd(value);
			return;
		}
		if ($arr_alloc_grp_nm.equalsIgnoreCase(name)) {
			arr_alloc_grp_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_NM.equalsIgnoreCase(name)) {
			prov_basis_typ_NM(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
			return;
		}
		if ($prov_src_schd_typ_nm.equalsIgnoreCase(name)) {
			prov_src_schd_typ_nm(value);
			return;
		}
		if ($prov_src_schd_no1.equalsIgnoreCase(name)) {
			prov_src_schd_no1(value);
			return;
		}
		if ($prov_src_schd_no2.equalsIgnoreCase(name)) {
			prov_src_schd_no2(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($prov_src_act_typ.equalsIgnoreCase(name)) {
			prov_src_act_typ(value);
			return;
		}
		if ($prov_src_act_typ_nm.equalsIgnoreCase(name)) {
			prov_src_act_typ_nm(value);
			return;
		}
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($ext_arr_act_no.equalsIgnoreCase(name)) {
			ext_arr_act_no(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($purc_rqst_wg_cd.equalsIgnoreCase(name)) {
			purc_rqst_wg_cd(value);
			return;
		}
		if ($purc_rqst_wg_nm.equalsIgnoreCase(name)) {
			purc_rqst_wg_nm(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($prms_rcpt_no.equalsIgnoreCase(name)) {
			prms_rcpt_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($rcpt_iv_itm_nm.equalsIgnoreCase(name)) {
			rcpt_iv_itm_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($sret_fr_cd.equalsIgnoreCase(name)) {
			sret_fr_cd(value);
			return;
		}
		if ($sret_fr_nm.equalsIgnoreCase(name)) {
			sret_fr_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
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
		if ($prov_arrv_req_flg.equalsIgnoreCase(name)) {
			prov_arrv_req_flg(value);
			return;
		}
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		if ($arr_yet_flg.equalsIgnoreCase(name)) {
			arr_yet_flg(value);
			return;
		}
		if ($arr_done_flg.equalsIgnoreCase(name)) {
			arr_done_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($prnt_yet_flg.equalsIgnoreCase(name)) {
			prnt_yet_flg(value);
			return;
		}
		if ($prnt_done_flg.equalsIgnoreCase(name)) {
			prnt_done_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			edi_invalid_flg(value);
			return;
		}
		if ($purc_act_yet_flg.equalsIgnoreCase(name)) {
			purc_act_yet_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			return arr_schd_dt_p();
		}
		if ($arr_dt_p.equalsIgnoreCase(name)) {
			return arr_dt_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($po_grp_p.equalsIgnoreCase(name)) {
			return po_grp_p();
		}
		if ($sret_fr_grp_p.equalsIgnoreCase(name)) {
			return sret_fr_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			return prsppl_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_schd_dt_p.equalsIgnoreCase(name)) {
			arr_schd_dt_p(
				((MCContainerMeta) arr_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($arr_dt_p.equalsIgnoreCase(name)) {
			arr_dt_p(
				((MCContainerMeta) arr_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($po_grp_p.equalsIgnoreCase(name)) {
			po_grp_p(
				((MCContainerMeta) po_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($sret_fr_grp_p.equalsIgnoreCase(name)) {
			sret_fr_grp_p(
				((MCContainerMeta) sret_fr_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($prsppl_grp_p.equalsIgnoreCase(name)) {
			prsppl_grp_p(
				((MCContainerMeta) prsppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_dt_fr() {
		return arr_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_dt_fr(MCDate value) {
		arr_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_hm_fr() {
		return arr_schd_dt_p().hm_fr();
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_hm_fr(MCDate value) {
		arr_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_dt_to() {
		return arr_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public void arr_schd_dt_to(MCDate value) {
		arr_schd_dt_p().ymd_to(value);
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_hm_to() {
		return arr_schd_dt_p().hm_to();
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public void arr_schd_hm_to(MCDate value) {
		arr_schd_dt_p().hm_to(value);
	}

	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_dt_fr() {
		return arr_dt_p().ymd_fr();
	}

	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_dt_fr(MCDate value) {
		arr_dt_p().ymd_fr(value);
	}

	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_hm_fr() {
		return arr_dt_p().hm_fr();
	}

	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_hm_fr(MCDate value) {
		arr_dt_p().hm_fr(value);
	}

	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public MCDate arr_dt_to() {
		return arr_dt_p().ymd_to();
	}

	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public void arr_dt_to(MCDate value) {
		arr_dt_p().ymd_to(value);
	}

	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_hm_to() {
		return arr_dt_p().hm_to();
	}

	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public void arr_hm_to(MCDate value) {
		arr_dt_p().hm_to(value);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ver_no_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean po_grp_flg1() {
		return po_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void po_grp_flg1(boolean value) {
		po_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String po_grp_cd1() {
		return po_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void po_grp_cd1(String value) {
		po_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String po_grp_nm1() {
		return po_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void po_grp_nm1(String value) {
		po_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean po_grp_flg2() {
		return po_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void po_grp_flg2(boolean value) {
		po_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String po_grp_cd2() {
		return po_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void po_grp_cd2(String value) {
		po_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String po_grp_nm2() {
		return po_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void po_grp_nm2(String value) {
		po_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean po_grp_flg3() {
		return po_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void po_grp_flg3(boolean value) {
		po_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String po_grp_cd3() {
		return po_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void po_grp_cd3(String value) {
		po_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String po_grp_nm3() {
		return po_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void po_grp_nm3(String value) {
		po_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean po_grp_flg4() {
		return po_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void po_grp_flg4(boolean value) {
		po_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String po_grp_cd4() {
		return po_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void po_grp_cd4(String value) {
		po_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String po_grp_nm4() {
		return po_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void po_grp_nm4(String value) {
		po_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean po_grp_flg5() {
		return po_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void po_grp_flg5(boolean value) {
		po_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String po_grp_cd5() {
		return po_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void po_grp_cd5(String value) {
		po_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String po_grp_nm5() {
		return po_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void po_grp_nm5(String value) {
		po_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean po_grp_flg6() {
		return po_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void po_grp_flg6(boolean value) {
		po_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String po_grp_cd6() {
		return po_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void po_grp_cd6(String value) {
		po_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String po_grp_nm6() {
		return po_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void po_grp_nm6(String value) {
		po_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean po_grp_flg7() {
		return po_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void po_grp_flg7(boolean value) {
		po_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String po_grp_cd7() {
		return po_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void po_grp_cd7(String value) {
		po_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String po_grp_nm7() {
		return po_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void po_grp_nm7(String value) {
		po_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean po_grp_flg8() {
		return po_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void po_grp_flg8(boolean value) {
		po_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String po_grp_cd8() {
		return po_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void po_grp_cd8(String value) {
		po_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String po_grp_nm8() {
		return po_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void po_grp_nm8(String value) {
		po_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean po_grp_flg9() {
		return po_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void po_grp_flg9(boolean value) {
		po_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String po_grp_cd9() {
		return po_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void po_grp_cd9(String value) {
		po_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String po_grp_nm9() {
		return po_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void po_grp_nm9(String value) {
		po_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean po_grp_flg10() {
		return po_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void po_grp_flg10(boolean value) {
		po_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String po_grp_cd10() {
		return po_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void po_grp_cd10(String value) {
		po_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String po_grp_nm10() {
		return po_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void po_grp_nm10(String value) {
		po_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Pickup company classification 1 引取先分類１.<p>
	 *
	 */
	public boolean sret_fr_grp_flg1() {
		return sret_fr_grp_p().bp_grp_flg1();
	}

	/**
	 * Pickup company classification 1 引取先分類１.<p>
	 *
	 */
	public void sret_fr_grp_flg1(boolean value) {
		sret_fr_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public String sret_fr_grp_cd1() {
		return sret_fr_grp_p().bp_grp_cd1();
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public void sret_fr_grp_cd1(String value) {
		sret_fr_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public String sret_fr_grp_nm1() {
		return sret_fr_grp_p().bp_grp_nm1();
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public void sret_fr_grp_nm1(String value) {
		sret_fr_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Pickup company classification 2 引取先分類２.<p>
	 *
	 */
	public boolean sret_fr_grp_flg2() {
		return sret_fr_grp_p().bp_grp_flg2();
	}

	/**
	 * Pickup company classification 2 引取先分類２.<p>
	 *
	 */
	public void sret_fr_grp_flg2(boolean value) {
		sret_fr_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public String sret_fr_grp_cd2() {
		return sret_fr_grp_p().bp_grp_cd2();
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public void sret_fr_grp_cd2(String value) {
		sret_fr_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public String sret_fr_grp_nm2() {
		return sret_fr_grp_p().bp_grp_nm2();
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public void sret_fr_grp_nm2(String value) {
		sret_fr_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Pickup company classification 3 引取先分類３.<p>
	 *
	 */
	public boolean sret_fr_grp_flg3() {
		return sret_fr_grp_p().bp_grp_flg3();
	}

	/**
	 * Pickup company classification 3 引取先分類３.<p>
	 *
	 */
	public void sret_fr_grp_flg3(boolean value) {
		sret_fr_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public String sret_fr_grp_cd3() {
		return sret_fr_grp_p().bp_grp_cd3();
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public void sret_fr_grp_cd3(String value) {
		sret_fr_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public String sret_fr_grp_nm3() {
		return sret_fr_grp_p().bp_grp_nm3();
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public void sret_fr_grp_nm3(String value) {
		sret_fr_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Pickup company classification 4 引取先分類４.<p>
	 *
	 */
	public boolean sret_fr_grp_flg4() {
		return sret_fr_grp_p().bp_grp_flg4();
	}

	/**
	 * Pickup company classification 4 引取先分類４.<p>
	 *
	 */
	public void sret_fr_grp_flg4(boolean value) {
		sret_fr_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public String sret_fr_grp_cd4() {
		return sret_fr_grp_p().bp_grp_cd4();
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public void sret_fr_grp_cd4(String value) {
		sret_fr_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public String sret_fr_grp_nm4() {
		return sret_fr_grp_p().bp_grp_nm4();
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public void sret_fr_grp_nm4(String value) {
		sret_fr_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Pickup company classification 5 引取先分類５.<p>
	 *
	 */
	public boolean sret_fr_grp_flg5() {
		return sret_fr_grp_p().bp_grp_flg5();
	}

	/**
	 * Pickup company classification 5 引取先分類５.<p>
	 *
	 */
	public void sret_fr_grp_flg5(boolean value) {
		sret_fr_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public String sret_fr_grp_cd5() {
		return sret_fr_grp_p().bp_grp_cd5();
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public void sret_fr_grp_cd5(String value) {
		sret_fr_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public String sret_fr_grp_nm5() {
		return sret_fr_grp_p().bp_grp_nm5();
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public void sret_fr_grp_nm5(String value) {
		sret_fr_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Pickup company classification 6 引取先分類６.<p>
	 *
	 */
	public boolean sret_fr_grp_flg6() {
		return sret_fr_grp_p().bp_grp_flg6();
	}

	/**
	 * Pickup company classification 6 引取先分類６.<p>
	 *
	 */
	public void sret_fr_grp_flg6(boolean value) {
		sret_fr_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public String sret_fr_grp_cd6() {
		return sret_fr_grp_p().bp_grp_cd6();
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public void sret_fr_grp_cd6(String value) {
		sret_fr_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public String sret_fr_grp_nm6() {
		return sret_fr_grp_p().bp_grp_nm6();
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public void sret_fr_grp_nm6(String value) {
		sret_fr_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Pickup company classification 7 引取先分類７.<p>
	 *
	 */
	public boolean sret_fr_grp_flg7() {
		return sret_fr_grp_p().bp_grp_flg7();
	}

	/**
	 * Pickup company classification 7 引取先分類７.<p>
	 *
	 */
	public void sret_fr_grp_flg7(boolean value) {
		sret_fr_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public String sret_fr_grp_cd7() {
		return sret_fr_grp_p().bp_grp_cd7();
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public void sret_fr_grp_cd7(String value) {
		sret_fr_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public String sret_fr_grp_nm7() {
		return sret_fr_grp_p().bp_grp_nm7();
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public void sret_fr_grp_nm7(String value) {
		sret_fr_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Pickup company classification 8 引取先分類８.<p>
	 *
	 */
	public boolean sret_fr_grp_flg8() {
		return sret_fr_grp_p().bp_grp_flg8();
	}

	/**
	 * Pickup company classification 8 引取先分類８.<p>
	 *
	 */
	public void sret_fr_grp_flg8(boolean value) {
		sret_fr_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public String sret_fr_grp_cd8() {
		return sret_fr_grp_p().bp_grp_cd8();
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public void sret_fr_grp_cd8(String value) {
		sret_fr_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public String sret_fr_grp_nm8() {
		return sret_fr_grp_p().bp_grp_nm8();
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public void sret_fr_grp_nm8(String value) {
		sret_fr_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Pickup company classification 9 引取先分類９.<p>
	 *
	 */
	public boolean sret_fr_grp_flg9() {
		return sret_fr_grp_p().bp_grp_flg9();
	}

	/**
	 * Pickup company classification 9 引取先分類９.<p>
	 *
	 */
	public void sret_fr_grp_flg9(boolean value) {
		sret_fr_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public String sret_fr_grp_cd9() {
		return sret_fr_grp_p().bp_grp_cd9();
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public void sret_fr_grp_cd9(String value) {
		sret_fr_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public String sret_fr_grp_nm9() {
		return sret_fr_grp_p().bp_grp_nm9();
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public void sret_fr_grp_nm9(String value) {
		sret_fr_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Pickup company classification 10 引取先分類１０.<p>
	 *
	 */
	public boolean sret_fr_grp_flg10() {
		return sret_fr_grp_p().bp_grp_flg10();
	}

	/**
	 * Pickup company classification 10 引取先分類１０.<p>
	 *
	 */
	public void sret_fr_grp_flg10(boolean value) {
		sret_fr_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public String sret_fr_grp_cd10() {
		return sret_fr_grp_p().bp_grp_cd10();
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public void sret_fr_grp_cd10(String value) {
		sret_fr_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public String sret_fr_grp_nm10() {
		return sret_fr_grp_p().bp_grp_nm10();
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public void sret_fr_grp_nm10(String value) {
		sret_fr_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return cst_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		cst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return cst_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		cst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return cst_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		cst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return cst_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		cst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return cst_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		cst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return cst_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		cst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return cst_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		cst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return cst_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		cst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return cst_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		cst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return cst_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		cst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return cst_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		cst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return cst_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		cst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return cst_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		cst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return cst_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		cst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return cst_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		cst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return cst_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		cst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return cst_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		cst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return cst_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		cst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return cst_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		cst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return cst_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		cst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return cst_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		cst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return cst_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		cst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return cst_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		cst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return cst_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		cst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return cst_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		cst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return cst_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		cst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return cst_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		cst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return cst_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		cst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return cst_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		cst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return cst_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		cst_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public boolean prsppl_grp_flg1() {
		return prsppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public void prsppl_grp_flg1(boolean value) {
		prsppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return prsppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		prsppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return prsppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		prsppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public boolean prsppl_grp_flg2() {
		return prsppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public void prsppl_grp_flg2(boolean value) {
		prsppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return prsppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		prsppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return prsppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		prsppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public boolean prsppl_grp_flg3() {
		return prsppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public void prsppl_grp_flg3(boolean value) {
		prsppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return prsppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		prsppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return prsppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		prsppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public boolean prsppl_grp_flg4() {
		return prsppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public void prsppl_grp_flg4(boolean value) {
		prsppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return prsppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		prsppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return prsppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		prsppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public boolean prsppl_grp_flg5() {
		return prsppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public void prsppl_grp_flg5(boolean value) {
		prsppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return prsppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		prsppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return prsppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		prsppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public boolean prsppl_grp_flg6() {
		return prsppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public void prsppl_grp_flg6(boolean value) {
		prsppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return prsppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		prsppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return prsppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		prsppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public boolean prsppl_grp_flg7() {
		return prsppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public void prsppl_grp_flg7(boolean value) {
		prsppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return prsppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		prsppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return prsppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		prsppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public boolean prsppl_grp_flg8() {
		return prsppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public void prsppl_grp_flg8(boolean value) {
		prsppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return prsppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		prsppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return prsppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		prsppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public boolean prsppl_grp_flg9() {
		return prsppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public void prsppl_grp_flg9(boolean value) {
		prsppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return prsppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		prsppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return prsppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		prsppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public boolean prsppl_grp_flg10() {
		return prsppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public void prsppl_grp_flg10(boolean value) {
		prsppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return prsppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		prsppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return prsppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		prsppl_grp_p().bp_grp_nm10(value);
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

