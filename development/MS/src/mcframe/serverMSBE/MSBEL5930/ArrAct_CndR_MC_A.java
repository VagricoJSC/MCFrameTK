package mcframe.serverMSBE.MSBEL5930;

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
 * ブロック"ArrAct_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrAct_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
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
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public static final String $not_wms_flg = "not_wms_flg";
	/**
	 * Subcontracting location only 外注場所のみ.<p>
	 *
	 */
	public static final String $outsrc_loc_flg = "outsrc_loc_flg";
	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_schd_dt_fr = "arr_schd_dt_fr";
	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_schd_hm_fr = "arr_schd_hm_fr";
	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public static final String $arr_schd_dt_to = "arr_schd_dt_to";
	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $arr_schd_hm_to = "arr_schd_hm_to";
	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_dt_fr = "arr_dt_fr";
	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $arr_hm_fr = "arr_hm_fr";
	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public static final String $arr_dt_to = "arr_dt_to";
	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public static final String $arr_hm_to = "arr_hm_to";
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
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
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
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details 品目区分詳細.<p>
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public static final String $edi_invalid_flg = "edi_invalid_flg";
	/**
	 * Include unaccepted item in transit 未検収の未着品を含む.<p>
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
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public static final String $ship_wg_cd = "ship_wg_cd";
	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public static final String $ship_wg_nm = "ship_wg_nm";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
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
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public static final String $prov_src_schd_typ = "prov_src_schd_typ";
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
	 * Supply slip not issued 支給伝票未発行.<p>
	 *
	 */
	public static final String $prov_slip_prnt_yet_flg = "prov_slip_prnt_yet_flg";
	/**
	 * Supply slip issued 支給伝票発行済.<p>
	 *
	 */
	public static final String $prov_slip_prnt_done_flg = "prov_slip_prnt_done_flg";
	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public static final String $po_grp_flg1 = "po_grp_flg1";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $po_grp_cd1 = "po_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $po_grp_nm1 = "po_grp_nm1";
	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public static final String $po_grp_flg2 = "po_grp_flg2";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $po_grp_cd2 = "po_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $po_grp_nm2 = "po_grp_nm2";
	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public static final String $po_grp_flg3 = "po_grp_flg3";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $po_grp_cd3 = "po_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $po_grp_nm3 = "po_grp_nm3";
	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public static final String $po_grp_flg4 = "po_grp_flg4";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $po_grp_cd4 = "po_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $po_grp_nm4 = "po_grp_nm4";
	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public static final String $po_grp_flg5 = "po_grp_flg5";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $po_grp_cd5 = "po_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $po_grp_nm5 = "po_grp_nm5";
	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public static final String $po_grp_flg6 = "po_grp_flg6";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $po_grp_cd6 = "po_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $po_grp_nm6 = "po_grp_nm6";
	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public static final String $po_grp_flg7 = "po_grp_flg7";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $po_grp_cd7 = "po_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $po_grp_nm7 = "po_grp_nm7";
	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public static final String $po_grp_flg8 = "po_grp_flg8";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $po_grp_cd8 = "po_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $po_grp_nm8 = "po_grp_nm8";
	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public static final String $po_grp_flg9 = "po_grp_flg9";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $po_grp_cd9 = "po_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $po_grp_nm9 = "po_grp_nm9";
	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public static final String $po_grp_flg10 = "po_grp_flg10";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $po_grp_cd10 = "po_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $po_grp_nm10 = "po_grp_nm10";
	/**
	 * Pickup company classification 1 引取先分類１.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg1 = "sret_fr_grp_flg1";
	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd1 = "sret_fr_grp_cd1";
	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm1 = "sret_fr_grp_nm1";
	/**
	 * Pickup company classification 2 引取先分類２.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg2 = "sret_fr_grp_flg2";
	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd2 = "sret_fr_grp_cd2";
	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm2 = "sret_fr_grp_nm2";
	/**
	 * Pickup company classification 3 引取先分類３.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg3 = "sret_fr_grp_flg3";
	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd3 = "sret_fr_grp_cd3";
	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm3 = "sret_fr_grp_nm3";
	/**
	 * Pickup company classification 4 引取先分類４.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg4 = "sret_fr_grp_flg4";
	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd4 = "sret_fr_grp_cd4";
	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm4 = "sret_fr_grp_nm4";
	/**
	 * Pickup company classification 5 引取先分類５.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg5 = "sret_fr_grp_flg5";
	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd5 = "sret_fr_grp_cd5";
	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm5 = "sret_fr_grp_nm5";
	/**
	 * Pickup company classification 6 引取先分類６.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg6 = "sret_fr_grp_flg6";
	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd6 = "sret_fr_grp_cd6";
	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm6 = "sret_fr_grp_nm6";
	/**
	 * Pickup company classification 7 引取先分類７.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg7 = "sret_fr_grp_flg7";
	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd7 = "sret_fr_grp_cd7";
	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm7 = "sret_fr_grp_nm7";
	/**
	 * Pickup company classification 8 引取先分類８.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg8 = "sret_fr_grp_flg8";
	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd8 = "sret_fr_grp_cd8";
	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm8 = "sret_fr_grp_nm8";
	/**
	 * Pickup company classification 9 引取先分類９.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg9 = "sret_fr_grp_flg9";
	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd9 = "sret_fr_grp_cd9";
	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm9 = "sret_fr_grp_nm9";
	/**
	 * Pickup company classification 10 引取先分類１０.<p>
	 *
	 */
	public static final String $sret_fr_grp_flg10 = "sret_fr_grp_flg10";
	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sret_fr_grp_cd10 = "sret_fr_grp_cd10";
	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public static final String $sret_fr_grp_nm10 = "sret_fr_grp_nm10";
	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public static final String $cst_grp_flg1 = "cst_grp_flg1";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public static final String $cst_grp_flg2 = "cst_grp_flg2";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public static final String $cst_grp_flg3 = "cst_grp_flg3";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public static final String $cst_grp_flg4 = "cst_grp_flg4";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public static final String $cst_grp_flg5 = "cst_grp_flg5";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public static final String $cst_grp_flg6 = "cst_grp_flg6";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public static final String $cst_grp_flg7 = "cst_grp_flg7";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public static final String $cst_grp_flg8 = "cst_grp_flg8";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public static final String $cst_grp_flg9 = "cst_grp_flg9";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public static final String $cst_grp_flg10 = "cst_grp_flg10";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";
	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public static final String $prsppl_grp_flg1 = "prsppl_grp_flg1";
	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public static final String $prsppl_grp_cd1 = "prsppl_grp_cd1";
	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public static final String $prsppl_grp_nm1 = "prsppl_grp_nm1";
	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public static final String $prsppl_grp_flg2 = "prsppl_grp_flg2";
	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public static final String $prsppl_grp_cd2 = "prsppl_grp_cd2";
	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public static final String $prsppl_grp_nm2 = "prsppl_grp_nm2";
	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public static final String $prsppl_grp_flg3 = "prsppl_grp_flg3";
	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public static final String $prsppl_grp_cd3 = "prsppl_grp_cd3";
	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public static final String $prsppl_grp_nm3 = "prsppl_grp_nm3";
	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public static final String $prsppl_grp_flg4 = "prsppl_grp_flg4";
	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public static final String $prsppl_grp_cd4 = "prsppl_grp_cd4";
	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public static final String $prsppl_grp_nm4 = "prsppl_grp_nm4";
	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public static final String $prsppl_grp_flg5 = "prsppl_grp_flg5";
	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public static final String $prsppl_grp_cd5 = "prsppl_grp_cd5";
	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public static final String $prsppl_grp_nm5 = "prsppl_grp_nm5";
	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public static final String $prsppl_grp_flg6 = "prsppl_grp_flg6";
	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public static final String $prsppl_grp_cd6 = "prsppl_grp_cd6";
	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public static final String $prsppl_grp_nm6 = "prsppl_grp_nm6";
	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public static final String $prsppl_grp_flg7 = "prsppl_grp_flg7";
	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public static final String $prsppl_grp_cd7 = "prsppl_grp_cd7";
	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public static final String $prsppl_grp_nm7 = "prsppl_grp_nm7";
	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public static final String $prsppl_grp_flg8 = "prsppl_grp_flg8";
	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public static final String $prsppl_grp_cd8 = "prsppl_grp_cd8";
	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public static final String $prsppl_grp_nm8 = "prsppl_grp_nm8";
	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public static final String $prsppl_grp_flg9 = "prsppl_grp_flg9";
	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public static final String $prsppl_grp_cd9 = "prsppl_grp_cd9";
	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public static final String $prsppl_grp_nm9 = "prsppl_grp_nm9";
	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public static final String $prsppl_grp_flg10 = "prsppl_grp_flg10";
	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $prsppl_grp_cd10 = "prsppl_grp_cd10";
	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public static final String $prsppl_grp_nm10 = "prsppl_grp_nm10";
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
	public static final MCMeta prov_arrv_req_flg_META = createCommonMeta($prov_arrv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_yet_flg_META = createCommonMeta($arr_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_done_flg_META = createCommonMeta($arr_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_yet_flg_META = createCommonMeta($prnt_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_done_flg_META = createCommonMeta($prnt_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_loc_flg_META = createCommonMeta($outsrc_loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_dt_fr_META = createCommonMeta($arr_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_fr_META = createCommonMeta($arr_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_schd_dt_to_META = createCommonMeta($arr_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_hm_to_META = createCommonMeta($arr_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_dt_fr_META = createCommonMeta($arr_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_hm_fr_META = createCommonMeta($arr_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta arr_dt_to_META = createCommonMeta($arr_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_hm_to_META = createCommonMeta($arr_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta arr_dpt_cd_META = createCommonMeta($arr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta arr_dpt_nm_META = createCommonMeta($arr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta arr_usr_cd_META = createCommonMeta($arr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_usr_nm_META = createCommonMeta($arr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta arr_loc_cd_META = createCommonMeta($arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta arr_loc_nm_META = createCommonMeta($arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta arr_str_ln_cd_META = createCommonMeta($arr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta arr_str_ln_nm_META = createCommonMeta($arr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta arr_lg_grp_cd_META = createCommonMeta($arr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta arr_lg_grp_nm_META = createCommonMeta($arr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta arr_wg_cd_META = createCommonMeta($arr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_wg_nm_META = createCommonMeta($arr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta arr_site_cd_META = createCommonMeta($arr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta arr_site_nm_META = createCommonMeta($arr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta arr_alloc_grp_cd_META = createCommonMeta($arr_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta arr_alloc_grp_nm_META = createCommonMeta($arr_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
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
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
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
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_invalid_flg_META = createCommonMeta($edi_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_yet_flg_META = createCommonMeta($purc_act_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_print_d_rmrks_META = createCommonMeta($dlv_inst_print_d_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_D_RMRKS);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.PRMS_RMRKS);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_wg_cd_META = createCommonMeta($ship_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_wg_nm_META = createCommonMeta($ship_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta sret_fr_cd_META = createCommonMeta($sret_fr_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sret_fr_nm_META = createCommonMeta($sret_fr_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_src_schd_typ_META = createCommonMeta($prov_src_schd_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_SCHD_TYP);
	public static final MCMeta prov_src_schd_no1_META = createCommonMeta($prov_src_schd_no1, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_src_schd_no2_META = createCommonMeta($prov_src_schd_no2, mcframe.commonMA.meta.MA_META.PROV_SRC_SCHD_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta prov_src_act_typ_META = createCommonMeta($prov_src_act_typ, mcframe.commonMS.meta.MS_META.PROV_SRC_ACT_TYP);
	public static final MCMeta prov_src_act_no_META = createCommonMeta($prov_src_act_no, mcframe.commonMA.meta.MA_META.PROV_SRC_ACT_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta prov_slip_prnt_yet_flg_META = createCommonMeta($prov_slip_prnt_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_slip_prnt_done_flg_META = createCommonMeta($prov_slip_prnt_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_flg1_META = createCommonMeta($po_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd1_META = createCommonMeta($po_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm1_META = createCommonMeta($po_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg2_META = createCommonMeta($po_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd2_META = createCommonMeta($po_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm2_META = createCommonMeta($po_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg3_META = createCommonMeta($po_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd3_META = createCommonMeta($po_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm3_META = createCommonMeta($po_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg4_META = createCommonMeta($po_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd4_META = createCommonMeta($po_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm4_META = createCommonMeta($po_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg5_META = createCommonMeta($po_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd5_META = createCommonMeta($po_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm5_META = createCommonMeta($po_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg6_META = createCommonMeta($po_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd6_META = createCommonMeta($po_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm6_META = createCommonMeta($po_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg7_META = createCommonMeta($po_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd7_META = createCommonMeta($po_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm7_META = createCommonMeta($po_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg8_META = createCommonMeta($po_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd8_META = createCommonMeta($po_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm8_META = createCommonMeta($po_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg9_META = createCommonMeta($po_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd9_META = createCommonMeta($po_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm9_META = createCommonMeta($po_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta po_grp_flg10_META = createCommonMeta($po_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_grp_cd10_META = createCommonMeta($po_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta po_grp_nm10_META = createCommonMeta($po_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg1_META = createCommonMeta($sret_fr_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd1_META = createCommonMeta($sret_fr_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm1_META = createCommonMeta($sret_fr_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg2_META = createCommonMeta($sret_fr_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd2_META = createCommonMeta($sret_fr_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm2_META = createCommonMeta($sret_fr_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg3_META = createCommonMeta($sret_fr_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd3_META = createCommonMeta($sret_fr_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm3_META = createCommonMeta($sret_fr_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg4_META = createCommonMeta($sret_fr_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd4_META = createCommonMeta($sret_fr_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm4_META = createCommonMeta($sret_fr_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg5_META = createCommonMeta($sret_fr_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd5_META = createCommonMeta($sret_fr_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm5_META = createCommonMeta($sret_fr_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg6_META = createCommonMeta($sret_fr_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd6_META = createCommonMeta($sret_fr_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm6_META = createCommonMeta($sret_fr_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg7_META = createCommonMeta($sret_fr_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd7_META = createCommonMeta($sret_fr_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm7_META = createCommonMeta($sret_fr_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg8_META = createCommonMeta($sret_fr_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd8_META = createCommonMeta($sret_fr_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm8_META = createCommonMeta($sret_fr_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg9_META = createCommonMeta($sret_fr_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd9_META = createCommonMeta($sret_fr_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm9_META = createCommonMeta($sret_fr_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sret_fr_grp_flg10_META = createCommonMeta($sret_fr_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sret_fr_grp_cd10_META = createCommonMeta($sret_fr_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sret_fr_grp_nm10_META = createCommonMeta($sret_fr_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg1_META = createCommonMeta($cst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg2_META = createCommonMeta($cst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg3_META = createCommonMeta($cst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg4_META = createCommonMeta($cst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg5_META = createCommonMeta($cst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg6_META = createCommonMeta($cst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg7_META = createCommonMeta($cst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg8_META = createCommonMeta($cst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg9_META = createCommonMeta($cst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg10_META = createCommonMeta($cst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg1_META = createCommonMeta($prsppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd1_META = createCommonMeta($prsppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm1_META = createCommonMeta($prsppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg2_META = createCommonMeta($prsppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd2_META = createCommonMeta($prsppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm2_META = createCommonMeta($prsppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg3_META = createCommonMeta($prsppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd3_META = createCommonMeta($prsppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm3_META = createCommonMeta($prsppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg4_META = createCommonMeta($prsppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd4_META = createCommonMeta($prsppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm4_META = createCommonMeta($prsppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg5_META = createCommonMeta($prsppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd5_META = createCommonMeta($prsppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm5_META = createCommonMeta($prsppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg6_META = createCommonMeta($prsppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd6_META = createCommonMeta($prsppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm6_META = createCommonMeta($prsppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg7_META = createCommonMeta($prsppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd7_META = createCommonMeta($prsppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm7_META = createCommonMeta($prsppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg8_META = createCommonMeta($prsppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd8_META = createCommonMeta($prsppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm8_META = createCommonMeta($prsppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg9_META = createCommonMeta($prsppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd9_META = createCommonMeta($prsppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm9_META = createCommonMeta($prsppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta prsppl_grp_flg10_META = createCommonMeta($prsppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prsppl_grp_cd10_META = createCommonMeta($prsppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta prsppl_grp_nm10_META = createCommonMeta($prsppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<ArrAct_CndR> constMetas = new ConstMetaList<ArrAct_CndR>(
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
			outsrc_loc_flg_META,
			arr_schd_dt_fr_META,
			arr_schd_hm_fr_META,
			arr_schd_dt_to_META,
			arr_schd_hm_to_META,
			arr_dt_fr_META,
			arr_hm_fr_META,
			arr_dt_to_META,
			arr_hm_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			arr_dpt_cd_META,
			arr_dpt_nm_META,
			arr_usr_cd_META,
			arr_usr_nm_META,
			arr_loc_cd_META,
			arr_loc_nm_META,
			arr_str_ln_cd_META,
			arr_str_ln_nm_META,
			arr_lg_grp_cd_META,
			arr_lg_grp_nm_META,
			arr_wg_cd_META,
			arr_wg_nm_META,
			arr_site_cd_META,
			arr_site_nm_META,
			arr_alloc_grp_cd_META,
			arr_alloc_grp_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			trd_cd_META,
			trd_nm_META,
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
			edi_flg_META,
			edi_invalid_flg_META,
			purc_act_yet_flg_META,
			dlv_inst_print_d_rmrks_META,
			prms_rmrks_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			ship_wg_cd_META,
			ship_wg_nm_META,
			ship_act_no_META,
			sret_fr_cd_META,
			sret_fr_nm_META,
			cst_cd_META,
			cst_nm_META,
			sls_ret_schd_no_META,
			sls_act_no_META,
			iv_no_META,
			iv_d_no_META,
			cst_po_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			prsppl_cd_META,
			prsppl_nm_META,
			prov_typ_META,
			prov_basis_typ_META,
			prov_src_schd_typ_META,
			prov_src_schd_no1_META,
			prov_src_schd_no2_META,
			prov_schd_no_META,
			prov_src_act_typ_META,
			prov_src_act_no_META,
			prov_act_no_META,
			prov_slip_prnt_yet_flg_META,
			prov_slip_prnt_done_flg_META,
			po_grp_flg1_META,
			po_grp_cd1_META,
			po_grp_nm1_META,
			po_grp_flg2_META,
			po_grp_cd2_META,
			po_grp_nm2_META,
			po_grp_flg3_META,
			po_grp_cd3_META,
			po_grp_nm3_META,
			po_grp_flg4_META,
			po_grp_cd4_META,
			po_grp_nm4_META,
			po_grp_flg5_META,
			po_grp_cd5_META,
			po_grp_nm5_META,
			po_grp_flg6_META,
			po_grp_cd6_META,
			po_grp_nm6_META,
			po_grp_flg7_META,
			po_grp_cd7_META,
			po_grp_nm7_META,
			po_grp_flg8_META,
			po_grp_cd8_META,
			po_grp_nm8_META,
			po_grp_flg9_META,
			po_grp_cd9_META,
			po_grp_nm9_META,
			po_grp_flg10_META,
			po_grp_cd10_META,
			po_grp_nm10_META,
			sret_fr_grp_flg1_META,
			sret_fr_grp_cd1_META,
			sret_fr_grp_nm1_META,
			sret_fr_grp_flg2_META,
			sret_fr_grp_cd2_META,
			sret_fr_grp_nm2_META,
			sret_fr_grp_flg3_META,
			sret_fr_grp_cd3_META,
			sret_fr_grp_nm3_META,
			sret_fr_grp_flg4_META,
			sret_fr_grp_cd4_META,
			sret_fr_grp_nm4_META,
			sret_fr_grp_flg5_META,
			sret_fr_grp_cd5_META,
			sret_fr_grp_nm5_META,
			sret_fr_grp_flg6_META,
			sret_fr_grp_cd6_META,
			sret_fr_grp_nm6_META,
			sret_fr_grp_flg7_META,
			sret_fr_grp_cd7_META,
			sret_fr_grp_nm7_META,
			sret_fr_grp_flg8_META,
			sret_fr_grp_cd8_META,
			sret_fr_grp_nm8_META,
			sret_fr_grp_flg9_META,
			sret_fr_grp_cd9_META,
			sret_fr_grp_nm9_META,
			sret_fr_grp_flg10_META,
			sret_fr_grp_cd10_META,
			sret_fr_grp_nm10_META,
			cst_grp_flg1_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_flg2_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_flg3_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_flg4_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_flg5_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_flg6_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_flg7_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_flg8_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_flg9_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_flg10_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META,
			prsppl_grp_flg1_META,
			prsppl_grp_cd1_META,
			prsppl_grp_nm1_META,
			prsppl_grp_flg2_META,
			prsppl_grp_cd2_META,
			prsppl_grp_nm2_META,
			prsppl_grp_flg3_META,
			prsppl_grp_cd3_META,
			prsppl_grp_nm3_META,
			prsppl_grp_flg4_META,
			prsppl_grp_cd4_META,
			prsppl_grp_nm4_META,
			prsppl_grp_flg5_META,
			prsppl_grp_cd5_META,
			prsppl_grp_nm5_META,
			prsppl_grp_flg6_META,
			prsppl_grp_cd6_META,
			prsppl_grp_nm6_META,
			prsppl_grp_flg7_META,
			prsppl_grp_cd7_META,
			prsppl_grp_nm7_META,
			prsppl_grp_flg8_META,
			prsppl_grp_cd8_META,
			prsppl_grp_nm8_META,
			prsppl_grp_flg9_META,
			prsppl_grp_cd9_META,
			prsppl_grp_nm9_META,
			prsppl_grp_flg10_META,
			prsppl_grp_cd10_META,
			prsppl_grp_nm10_META,
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
	protected ArrAct_CndR_MC_A(ConstMetaList<? extends ArrAct_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_CndR clone() {
		return (ArrAct_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_CndR createInstance() {
		return (ArrAct_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_CndR getValues(String... names) {
		return (ArrAct_CndR) super.getValues(names);
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
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 8, $wms_flg);
	}

	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 8, $wms_flg, value);
	}


	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 9, $not_wms_flg);
	}

	/**
	 * Not for WMS ＷＭＳ対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 9, $not_wms_flg, value);
	}


	/**
	 * Subcontracting location only 外注場所のみ.<p>
	 *
	 */
	public boolean outsrc_loc_flg() {
		return getConstBoolean(offset + 10, $outsrc_loc_flg);
	}

	/**
	 * Subcontracting location only 外注場所のみ.<p>
	 *
	 */
	public void outsrc_loc_flg(boolean value) {
		setConstBoolean(offset + 10, $outsrc_loc_flg, value);
	}


	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_dt_fr() {
		return getConstDate(offset + 11, $arr_schd_dt_fr);
	}

	/**
	 * Scheduled receipt date FROM 入荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_dt_fr(MCDate value) {
		setConstDate(offset + 11, $arr_schd_dt_fr, value);
	}


	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_schd_hm_fr() {
		return getConstDate(offset + 12, $arr_schd_hm_fr);
	}

	/**
	 * Receipt schedule time FROM 入荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_schd_hm_fr(MCDate value) {
		setConstDate(offset + 12, $arr_schd_hm_fr, value);
	}


	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_dt_to() {
		return getConstDate(offset + 13, $arr_schd_dt_to);
	}

	/**
	 * Scheduled receipt date TO 入荷予定日ＴＯ.<p>
	 *
	 */
	public void arr_schd_dt_to(MCDate value) {
		setConstDate(offset + 13, $arr_schd_dt_to, value);
	}


	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_schd_hm_to() {
		return getConstDate(offset + 14, $arr_schd_hm_to);
	}

	/**
	 * Receipt schedule time TO 入荷予定時刻ＴＯ.<p>
	 *
	 */
	public void arr_schd_hm_to(MCDate value) {
		setConstDate(offset + 14, $arr_schd_hm_to, value);
	}


	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_dt_fr() {
		return getConstDate(offset + 15, $arr_dt_fr);
	}

	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_dt_fr(MCDate value) {
		setConstDate(offset + 15, $arr_dt_fr, value);
	}


	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_hm_fr() {
		return getConstDate(offset + 16, $arr_hm_fr);
	}

	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_hm_fr(MCDate value) {
		setConstDate(offset + 16, $arr_hm_fr, value);
	}


	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public MCDate arr_dt_to() {
		return getConstDate(offset + 17, $arr_dt_to);
	}

	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public void arr_dt_to(MCDate value) {
		setConstDate(offset + 17, $arr_dt_to, value);
	}


	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_hm_to() {
		return getConstDate(offset + 18, $arr_hm_to);
	}

	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public void arr_hm_to(MCDate value) {
		setConstDate(offset + 18, $arr_hm_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 19, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 19, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 20, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 20, $ac_dt_to, value);
	}


	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 21, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 21, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 21, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 21, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 21, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 21, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 22, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 22, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 22, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 22, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 22, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 22, $pr_rate_to, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 23, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 23, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 24, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 24, $rqst_dpt_nm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 25, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 25, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 26, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 26, $rqst_usr_nm, value);
	}


	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return getConstString(offset + 27, $arr_dpt_cd);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		setConstString(offset + 27, $arr_dpt_cd, value);
	}


	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public String arr_dpt_nm() {
		return getConstString(offset + 28, $arr_dpt_nm);
	}

	/**
	 * Receipt dept. name 入荷部門名.<p>
	 *
	 */
	public void arr_dpt_nm(String value) {
		setConstString(offset + 28, $arr_dpt_nm, value);
	}


	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return getConstString(offset + 29, $arr_usr_cd);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		setConstString(offset + 29, $arr_usr_cd, value);
	}


	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public String arr_usr_nm() {
		return getConstString(offset + 30, $arr_usr_nm);
	}

	/**
	 * Receipt PIC name 入荷担当者名.<p>
	 *
	 */
	public void arr_usr_nm(String value) {
		setConstString(offset + 30, $arr_usr_nm, value);
	}


	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return getConstString(offset + 31, $arr_loc_cd);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		setConstString(offset + 31, $arr_loc_cd, value);
	}


	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public String arr_loc_nm() {
		return getConstString(offset + 32, $arr_loc_nm);
	}

	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public void arr_loc_nm(String value) {
		setConstString(offset + 32, $arr_loc_nm, value);
	}


	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String arr_str_ln_cd() {
		return getConstString(offset + 33, $arr_str_ln_cd);
	}

	/**
	 * Receipt rack/line cd. 入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void arr_str_ln_cd(String value) {
		setConstString(offset + 33, $arr_str_ln_cd, value);
	}


	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public String arr_str_ln_nm() {
		return getConstString(offset + 34, $arr_str_ln_nm);
	}

	/**
	 * Receipt rack/line name 入荷棚・ライン名.<p>
	 *
	 */
	public void arr_str_ln_nm(String value) {
		setConstString(offset + 34, $arr_str_ln_nm, value);
	}


	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public String arr_lg_grp_cd() {
		return getConstString(offset + 35, $arr_lg_grp_cd);
	}

	/**
	 * Receipt distribution group cd. 入荷物流グループＣＤ.<p>
	 *
	 */
	public void arr_lg_grp_cd(String value) {
		setConstString(offset + 35, $arr_lg_grp_cd, value);
	}


	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public String arr_lg_grp_nm() {
		return getConstString(offset + 36, $arr_lg_grp_nm);
	}

	/**
	 * Receipt distribution group name 入荷物流グループ名.<p>
	 *
	 */
	public void arr_lg_grp_nm(String value) {
		setConstString(offset + 36, $arr_lg_grp_nm, value);
	}


	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public String arr_wg_cd() {
		return getConstString(offset + 37, $arr_wg_cd);
	}

	/**
	 * Receipt WG cd. 入荷ＷＧ ＣＤ.<p>
	 *
	 */
	public void arr_wg_cd(String value) {
		setConstString(offset + 37, $arr_wg_cd, value);
	}


	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public String arr_wg_nm() {
		return getConstString(offset + 38, $arr_wg_nm);
	}

	/**
	 * Receipt WG name 入荷ＷＧ名.<p>
	 *
	 */
	public void arr_wg_nm(String value) {
		setConstString(offset + 38, $arr_wg_nm, value);
	}


	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String arr_site_cd() {
		return getConstString(offset + 39, $arr_site_cd);
	}

	/**
	 * Receipt factory/distribution warehouse cd. 入荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void arr_site_cd(String value) {
		setConstString(offset + 39, $arr_site_cd, value);
	}


	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public String arr_site_nm() {
		return getConstString(offset + 40, $arr_site_nm);
	}

	/**
	 * Receipt factory/distribution warehouse name 入荷工場・物流倉庫名.<p>
	 *
	 */
	public void arr_site_nm(String value) {
		setConstString(offset + 40, $arr_site_nm, value);
	}


	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public String arr_alloc_grp_cd() {
		return getConstString(offset + 41, $arr_alloc_grp_cd);
	}

	/**
	 * Receipt gross allocation location group cd. 入荷総量引当場所グループＣＤ.<p>
	 *
	 */
	public void arr_alloc_grp_cd(String value) {
		setConstString(offset + 41, $arr_alloc_grp_cd, value);
	}


	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public String arr_alloc_grp_nm() {
		return getConstString(offset + 42, $arr_alloc_grp_nm);
	}

	/**
	 * Receipt gross allocation location group name 入荷総量引当場所グループ名.<p>
	 *
	 */
	public void arr_alloc_grp_nm(String value) {
		setConstString(offset + 42, $arr_alloc_grp_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 43, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 43, $itm_typ, value);
	}


	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 44, $itm_typ_d_cd);
	}

	/**
	 * Item type details 品目区分詳細.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 44, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 45, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 45, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 46, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 46, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 47, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 47, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 48, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 48, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 49, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 49, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 50, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 50, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 51, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 51, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 52, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 52, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 53, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 53, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 54, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 54, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 55, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 55, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 56, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 56, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 57, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 57, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 58, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 58, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 59, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 59, $wrk_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 60, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 60, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 61, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 61, $trd_nm, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 62, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 62, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 63, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 63, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 63, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 63, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 63, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 63, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 64, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 64, $dlv_slip_d_no, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 65, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 65, $arr_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 66, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 66, $arr_act_no, value);
	}


	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return getConstString(offset + 67, $ext_arr_act_no);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		setConstString(offset + 67, $ext_arr_act_no, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 68, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 68, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 69, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 69, $trd_d_rmrks, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 70, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 70, $arr_cnt_rmrks, value);
	}


	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_rqst_wg_cd() {
		return getConstString(offset + 71, $purc_rqst_wg_cd);
	}

	/**
	 * Purchase requesting WG cd. 購買依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_rqst_wg_cd(String value) {
		setConstString(offset + 71, $purc_rqst_wg_cd, value);
	}


	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public String purc_rqst_wg_nm() {
		return getConstString(offset + 72, $purc_rqst_wg_nm);
	}

	/**
	 * Purchase requesting WG name 購買依頼元ＷＧ名.<p>
	 *
	 */
	public void purc_rqst_wg_nm(String value) {
		setConstString(offset + 72, $purc_rqst_wg_nm, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 73, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 73, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 74, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 74, $po_schd_src_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 75, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 75, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 76, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 76, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 77, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 77, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 78, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 78, $maker_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 79, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 79, $bp_lot_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 80, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 80, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 81, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 81, $po_d_no, value);
	}


	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 82, $dlv_inst_no);
	}

	/**
	 * Delivery order No. 納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 82, $dlv_inst_no, value);
	}


	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public String prms_rcpt_no() {
		return getConstString(offset + 83, $prms_rcpt_no);
	}

	/**
	 * Order promising result received No. 納期回答受領ＮＯ.<p>
	 *
	 */
	public void prms_rcpt_no(String value) {
		setConstString(offset + 83, $prms_rcpt_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 84, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 84, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 85, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 85, $rcpt_iv_d_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 86, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 86, $purc_act_no, value);
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
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 88, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 88, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 89, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 89, $sppl_itm_nm, value);
	}


	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return getConstString(offset + 90, $rcpt_iv_itm_nm);
	}

	/**
	 * Item name for purchase I/V 受領Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		setConstString(offset + 90, $rcpt_iv_itm_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 91, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 91, $purc_id_typ, value);
	}


	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 92, $edi_flg);
	}

	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 92, $edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public boolean edi_invalid_flg() {
		return getConstBoolean(offset + 93, $edi_invalid_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public void edi_invalid_flg(boolean value) {
		setConstBoolean(offset + 93, $edi_invalid_flg, value);
	}


	/**
	 * Include unaccepted item in transit 未検収の未着品を含む.<p>
	 *
	 */
	public boolean purc_act_yet_flg() {
		return getConstBoolean(offset + 94, $purc_act_yet_flg);
	}

	/**
	 * Include unaccepted item in transit 未検収の未着品を含む.<p>
	 *
	 */
	public void purc_act_yet_flg(boolean value) {
		setConstBoolean(offset + 94, $purc_act_yet_flg, value);
	}


	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public String dlv_inst_print_d_rmrks() {
		return getConstString(offset + 95, $dlv_inst_print_d_rmrks);
	}

	/**
	 * Delivery order details remarks 納入指示書明細備考.<p>
	 *
	 */
	public void dlv_inst_print_d_rmrks(String value) {
		setConstString(offset + 95, $dlv_inst_print_d_rmrks, value);
	}


	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 96, $prms_rmrks);
	}

	/**
	 * Order promising remarks 納期回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 96, $prms_rmrks, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 97, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 97, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 98, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 98, $ship_lg_grp_nm, value);
	}


	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public String ship_wg_cd() {
		return getConstString(offset + 99, $ship_wg_cd);
	}

	/**
	 * Shipping WG cd. 出荷ＷＧＣＤ.<p>
	 *
	 */
	public void ship_wg_cd(String value) {
		setConstString(offset + 99, $ship_wg_cd, value);
	}


	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public String ship_wg_nm() {
		return getConstString(offset + 100, $ship_wg_nm);
	}

	/**
	 * Shipping WG name 出荷ＷＧ名.<p>
	 *
	 */
	public void ship_wg_nm(String value) {
		setConstString(offset + 100, $ship_wg_nm, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 101, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 101, $ship_act_no, value);
	}


	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return getConstString(offset + 102, $sret_fr_cd);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		setConstString(offset + 102, $sret_fr_cd, value);
	}


	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public String sret_fr_nm() {
		return getConstString(offset + 103, $sret_fr_nm);
	}

	/**
	 * Pickup company name 引取先名.<p>
	 *
	 */
	public void sret_fr_nm(String value) {
		setConstString(offset + 103, $sret_fr_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 104, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 104, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 105, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 105, $cst_nm, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 106, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 106, $sls_ret_schd_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 107, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 107, $sls_act_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 108, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 108, $iv_no, value);
	}


	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 109, $iv_d_no);
	}

	/**
	 * I/V details No. Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 109, $iv_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 110, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 110, $cst_po_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 111, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 111, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 112, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 112, $cst_itm_nm, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 113, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 113, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 114, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 114, $prsppl_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 115, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 115, $prov_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 116, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 116, $prov_basis_typ, value);
	}


	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public String prov_src_schd_typ() {
		return getConstString(offset + 117, $prov_src_schd_typ);
	}

	/**
	 * Supply-from schedule type 支給元予定区分.<p>
	 *
	 */
	public void prov_src_schd_typ(String value) {
		setConstString(offset + 117, $prov_src_schd_typ, value);
	}


	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public String prov_src_schd_no1() {
		return getConstString(offset + 118, $prov_src_schd_no1);
	}

	/**
	 * Supply-from schedule No. 1 支給元予定ＮＯ１.<p>
	 *
	 */
	public void prov_src_schd_no1(String value) {
		setConstString(offset + 118, $prov_src_schd_no1, value);
	}


	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public String prov_src_schd_no2() {
		return getConstString(offset + 119, $prov_src_schd_no2);
	}

	/**
	 * Supply-from schedule No. 2 支給元予定ＮＯ２.<p>
	 *
	 */
	public void prov_src_schd_no2(String value) {
		setConstString(offset + 119, $prov_src_schd_no2, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 120, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 120, $prov_schd_no, value);
	}


	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public String prov_src_act_typ() {
		return getConstString(offset + 121, $prov_src_act_typ);
	}

	/**
	 * Supply-from result type 支給元実績区分.<p>
	 *
	 */
	public void prov_src_act_typ(String value) {
		setConstString(offset + 121, $prov_src_act_typ, value);
	}


	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public String prov_src_act_no() {
		return getConstString(offset + 122, $prov_src_act_no);
	}

	/**
	 * Supply-from result No. 支給元実績ＮＯ.<p>
	 *
	 */
	public void prov_src_act_no(String value) {
		setConstString(offset + 122, $prov_src_act_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 123, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 123, $prov_act_no, value);
	}


	/**
	 * Supply slip not issued 支給伝票未発行.<p>
	 *
	 */
	public boolean prov_slip_prnt_yet_flg() {
		return getConstBoolean(offset + 124, $prov_slip_prnt_yet_flg);
	}

	/**
	 * Supply slip not issued 支給伝票未発行.<p>
	 *
	 */
	public void prov_slip_prnt_yet_flg(boolean value) {
		setConstBoolean(offset + 124, $prov_slip_prnt_yet_flg, value);
	}


	/**
	 * Supply slip issued 支給伝票発行済.<p>
	 *
	 */
	public boolean prov_slip_prnt_done_flg() {
		return getConstBoolean(offset + 125, $prov_slip_prnt_done_flg);
	}

	/**
	 * Supply slip issued 支給伝票発行済.<p>
	 *
	 */
	public void prov_slip_prnt_done_flg(boolean value) {
		setConstBoolean(offset + 125, $prov_slip_prnt_done_flg, value);
	}


	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean po_grp_flg1() {
		return getConstBoolean(offset + 126, $po_grp_flg1);
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void po_grp_flg1(boolean value) {
		setConstBoolean(offset + 126, $po_grp_flg1, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String po_grp_cd1() {
		return getConstString(offset + 127, $po_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void po_grp_cd1(String value) {
		setConstString(offset + 127, $po_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String po_grp_nm1() {
		return getConstString(offset + 128, $po_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void po_grp_nm1(String value) {
		setConstString(offset + 128, $po_grp_nm1, value);
	}


	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean po_grp_flg2() {
		return getConstBoolean(offset + 129, $po_grp_flg2);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void po_grp_flg2(boolean value) {
		setConstBoolean(offset + 129, $po_grp_flg2, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String po_grp_cd2() {
		return getConstString(offset + 130, $po_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void po_grp_cd2(String value) {
		setConstString(offset + 130, $po_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String po_grp_nm2() {
		return getConstString(offset + 131, $po_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void po_grp_nm2(String value) {
		setConstString(offset + 131, $po_grp_nm2, value);
	}


	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean po_grp_flg3() {
		return getConstBoolean(offset + 132, $po_grp_flg3);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void po_grp_flg3(boolean value) {
		setConstBoolean(offset + 132, $po_grp_flg3, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String po_grp_cd3() {
		return getConstString(offset + 133, $po_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void po_grp_cd3(String value) {
		setConstString(offset + 133, $po_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String po_grp_nm3() {
		return getConstString(offset + 134, $po_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void po_grp_nm3(String value) {
		setConstString(offset + 134, $po_grp_nm3, value);
	}


	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean po_grp_flg4() {
		return getConstBoolean(offset + 135, $po_grp_flg4);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void po_grp_flg4(boolean value) {
		setConstBoolean(offset + 135, $po_grp_flg4, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String po_grp_cd4() {
		return getConstString(offset + 136, $po_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void po_grp_cd4(String value) {
		setConstString(offset + 136, $po_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String po_grp_nm4() {
		return getConstString(offset + 137, $po_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void po_grp_nm4(String value) {
		setConstString(offset + 137, $po_grp_nm4, value);
	}


	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean po_grp_flg5() {
		return getConstBoolean(offset + 138, $po_grp_flg5);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void po_grp_flg5(boolean value) {
		setConstBoolean(offset + 138, $po_grp_flg5, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String po_grp_cd5() {
		return getConstString(offset + 139, $po_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void po_grp_cd5(String value) {
		setConstString(offset + 139, $po_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String po_grp_nm5() {
		return getConstString(offset + 140, $po_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void po_grp_nm5(String value) {
		setConstString(offset + 140, $po_grp_nm5, value);
	}


	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean po_grp_flg6() {
		return getConstBoolean(offset + 141, $po_grp_flg6);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void po_grp_flg6(boolean value) {
		setConstBoolean(offset + 141, $po_grp_flg6, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String po_grp_cd6() {
		return getConstString(offset + 142, $po_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void po_grp_cd6(String value) {
		setConstString(offset + 142, $po_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String po_grp_nm6() {
		return getConstString(offset + 143, $po_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void po_grp_nm6(String value) {
		setConstString(offset + 143, $po_grp_nm6, value);
	}


	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean po_grp_flg7() {
		return getConstBoolean(offset + 144, $po_grp_flg7);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void po_grp_flg7(boolean value) {
		setConstBoolean(offset + 144, $po_grp_flg7, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String po_grp_cd7() {
		return getConstString(offset + 145, $po_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void po_grp_cd7(String value) {
		setConstString(offset + 145, $po_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String po_grp_nm7() {
		return getConstString(offset + 146, $po_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void po_grp_nm7(String value) {
		setConstString(offset + 146, $po_grp_nm7, value);
	}


	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean po_grp_flg8() {
		return getConstBoolean(offset + 147, $po_grp_flg8);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void po_grp_flg8(boolean value) {
		setConstBoolean(offset + 147, $po_grp_flg8, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String po_grp_cd8() {
		return getConstString(offset + 148, $po_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void po_grp_cd8(String value) {
		setConstString(offset + 148, $po_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String po_grp_nm8() {
		return getConstString(offset + 149, $po_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void po_grp_nm8(String value) {
		setConstString(offset + 149, $po_grp_nm8, value);
	}


	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean po_grp_flg9() {
		return getConstBoolean(offset + 150, $po_grp_flg9);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void po_grp_flg9(boolean value) {
		setConstBoolean(offset + 150, $po_grp_flg9, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String po_grp_cd9() {
		return getConstString(offset + 151, $po_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void po_grp_cd9(String value) {
		setConstString(offset + 151, $po_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String po_grp_nm9() {
		return getConstString(offset + 152, $po_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void po_grp_nm9(String value) {
		setConstString(offset + 152, $po_grp_nm9, value);
	}


	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean po_grp_flg10() {
		return getConstBoolean(offset + 153, $po_grp_flg10);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void po_grp_flg10(boolean value) {
		setConstBoolean(offset + 153, $po_grp_flg10, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String po_grp_cd10() {
		return getConstString(offset + 154, $po_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void po_grp_cd10(String value) {
		setConstString(offset + 154, $po_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String po_grp_nm10() {
		return getConstString(offset + 155, $po_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void po_grp_nm10(String value) {
		setConstString(offset + 155, $po_grp_nm10, value);
	}


	/**
	 * Pickup company classification 1 引取先分類１.<p>
	 *
	 */
	public boolean sret_fr_grp_flg1() {
		return getConstBoolean(offset + 156, $sret_fr_grp_flg1);
	}

	/**
	 * Pickup company classification 1 引取先分類１.<p>
	 *
	 */
	public void sret_fr_grp_flg1(boolean value) {
		setConstBoolean(offset + 156, $sret_fr_grp_flg1, value);
	}


	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public String sret_fr_grp_cd1() {
		return getConstString(offset + 157, $sret_fr_grp_cd1);
	}

	/**
	 * Pickup company classification cd. 1 引取先分類ＣＤ１.<p>
	 *
	 */
	public void sret_fr_grp_cd1(String value) {
		setConstString(offset + 157, $sret_fr_grp_cd1, value);
	}


	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public String sret_fr_grp_nm1() {
		return getConstString(offset + 158, $sret_fr_grp_nm1);
	}

	/**
	 * Pickup company classification name 1 引取先分類名１.<p>
	 *
	 */
	public void sret_fr_grp_nm1(String value) {
		setConstString(offset + 158, $sret_fr_grp_nm1, value);
	}


	/**
	 * Pickup company classification 2 引取先分類２.<p>
	 *
	 */
	public boolean sret_fr_grp_flg2() {
		return getConstBoolean(offset + 159, $sret_fr_grp_flg2);
	}

	/**
	 * Pickup company classification 2 引取先分類２.<p>
	 *
	 */
	public void sret_fr_grp_flg2(boolean value) {
		setConstBoolean(offset + 159, $sret_fr_grp_flg2, value);
	}


	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public String sret_fr_grp_cd2() {
		return getConstString(offset + 160, $sret_fr_grp_cd2);
	}

	/**
	 * Pickup company classification cd. 2 引取先分類ＣＤ２.<p>
	 *
	 */
	public void sret_fr_grp_cd2(String value) {
		setConstString(offset + 160, $sret_fr_grp_cd2, value);
	}


	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public String sret_fr_grp_nm2() {
		return getConstString(offset + 161, $sret_fr_grp_nm2);
	}

	/**
	 * Pickup company classification name 2 引取先分類名２.<p>
	 *
	 */
	public void sret_fr_grp_nm2(String value) {
		setConstString(offset + 161, $sret_fr_grp_nm2, value);
	}


	/**
	 * Pickup company classification 3 引取先分類３.<p>
	 *
	 */
	public boolean sret_fr_grp_flg3() {
		return getConstBoolean(offset + 162, $sret_fr_grp_flg3);
	}

	/**
	 * Pickup company classification 3 引取先分類３.<p>
	 *
	 */
	public void sret_fr_grp_flg3(boolean value) {
		setConstBoolean(offset + 162, $sret_fr_grp_flg3, value);
	}


	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public String sret_fr_grp_cd3() {
		return getConstString(offset + 163, $sret_fr_grp_cd3);
	}

	/**
	 * Pickup company classification cd. 3 引取先分類ＣＤ３.<p>
	 *
	 */
	public void sret_fr_grp_cd3(String value) {
		setConstString(offset + 163, $sret_fr_grp_cd3, value);
	}


	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public String sret_fr_grp_nm3() {
		return getConstString(offset + 164, $sret_fr_grp_nm3);
	}

	/**
	 * Pickup company classification name 3 引取先分類名３.<p>
	 *
	 */
	public void sret_fr_grp_nm3(String value) {
		setConstString(offset + 164, $sret_fr_grp_nm3, value);
	}


	/**
	 * Pickup company classification 4 引取先分類４.<p>
	 *
	 */
	public boolean sret_fr_grp_flg4() {
		return getConstBoolean(offset + 165, $sret_fr_grp_flg4);
	}

	/**
	 * Pickup company classification 4 引取先分類４.<p>
	 *
	 */
	public void sret_fr_grp_flg4(boolean value) {
		setConstBoolean(offset + 165, $sret_fr_grp_flg4, value);
	}


	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public String sret_fr_grp_cd4() {
		return getConstString(offset + 166, $sret_fr_grp_cd4);
	}

	/**
	 * Pickup company classification cd. 4 引取先分類ＣＤ４.<p>
	 *
	 */
	public void sret_fr_grp_cd4(String value) {
		setConstString(offset + 166, $sret_fr_grp_cd4, value);
	}


	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public String sret_fr_grp_nm4() {
		return getConstString(offset + 167, $sret_fr_grp_nm4);
	}

	/**
	 * Pickup company classification name 4 引取先分類名４.<p>
	 *
	 */
	public void sret_fr_grp_nm4(String value) {
		setConstString(offset + 167, $sret_fr_grp_nm4, value);
	}


	/**
	 * Pickup company classification 5 引取先分類５.<p>
	 *
	 */
	public boolean sret_fr_grp_flg5() {
		return getConstBoolean(offset + 168, $sret_fr_grp_flg5);
	}

	/**
	 * Pickup company classification 5 引取先分類５.<p>
	 *
	 */
	public void sret_fr_grp_flg5(boolean value) {
		setConstBoolean(offset + 168, $sret_fr_grp_flg5, value);
	}


	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public String sret_fr_grp_cd5() {
		return getConstString(offset + 169, $sret_fr_grp_cd5);
	}

	/**
	 * Pickup company classification cd. 5 引取先分類ＣＤ５.<p>
	 *
	 */
	public void sret_fr_grp_cd5(String value) {
		setConstString(offset + 169, $sret_fr_grp_cd5, value);
	}


	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public String sret_fr_grp_nm5() {
		return getConstString(offset + 170, $sret_fr_grp_nm5);
	}

	/**
	 * Pickup company classification name 5 引取先分類名５.<p>
	 *
	 */
	public void sret_fr_grp_nm5(String value) {
		setConstString(offset + 170, $sret_fr_grp_nm5, value);
	}


	/**
	 * Pickup company classification 6 引取先分類６.<p>
	 *
	 */
	public boolean sret_fr_grp_flg6() {
		return getConstBoolean(offset + 171, $sret_fr_grp_flg6);
	}

	/**
	 * Pickup company classification 6 引取先分類６.<p>
	 *
	 */
	public void sret_fr_grp_flg6(boolean value) {
		setConstBoolean(offset + 171, $sret_fr_grp_flg6, value);
	}


	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public String sret_fr_grp_cd6() {
		return getConstString(offset + 172, $sret_fr_grp_cd6);
	}

	/**
	 * Pickup company classification cd. 6 引取先分類ＣＤ６.<p>
	 *
	 */
	public void sret_fr_grp_cd6(String value) {
		setConstString(offset + 172, $sret_fr_grp_cd6, value);
	}


	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public String sret_fr_grp_nm6() {
		return getConstString(offset + 173, $sret_fr_grp_nm6);
	}

	/**
	 * Pickup company classification name 6 引取先分類名６.<p>
	 *
	 */
	public void sret_fr_grp_nm6(String value) {
		setConstString(offset + 173, $sret_fr_grp_nm6, value);
	}


	/**
	 * Pickup company classification 7 引取先分類７.<p>
	 *
	 */
	public boolean sret_fr_grp_flg7() {
		return getConstBoolean(offset + 174, $sret_fr_grp_flg7);
	}

	/**
	 * Pickup company classification 7 引取先分類７.<p>
	 *
	 */
	public void sret_fr_grp_flg7(boolean value) {
		setConstBoolean(offset + 174, $sret_fr_grp_flg7, value);
	}


	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public String sret_fr_grp_cd7() {
		return getConstString(offset + 175, $sret_fr_grp_cd7);
	}

	/**
	 * Pickup company classification cd. 7 引取先分類ＣＤ７.<p>
	 *
	 */
	public void sret_fr_grp_cd7(String value) {
		setConstString(offset + 175, $sret_fr_grp_cd7, value);
	}


	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public String sret_fr_grp_nm7() {
		return getConstString(offset + 176, $sret_fr_grp_nm7);
	}

	/**
	 * Pickup company classification name 7 引取先分類名７.<p>
	 *
	 */
	public void sret_fr_grp_nm7(String value) {
		setConstString(offset + 176, $sret_fr_grp_nm7, value);
	}


	/**
	 * Pickup company classification 8 引取先分類８.<p>
	 *
	 */
	public boolean sret_fr_grp_flg8() {
		return getConstBoolean(offset + 177, $sret_fr_grp_flg8);
	}

	/**
	 * Pickup company classification 8 引取先分類８.<p>
	 *
	 */
	public void sret_fr_grp_flg8(boolean value) {
		setConstBoolean(offset + 177, $sret_fr_grp_flg8, value);
	}


	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public String sret_fr_grp_cd8() {
		return getConstString(offset + 178, $sret_fr_grp_cd8);
	}

	/**
	 * Pickup company classification cd. 8 引取先分類ＣＤ８.<p>
	 *
	 */
	public void sret_fr_grp_cd8(String value) {
		setConstString(offset + 178, $sret_fr_grp_cd8, value);
	}


	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public String sret_fr_grp_nm8() {
		return getConstString(offset + 179, $sret_fr_grp_nm8);
	}

	/**
	 * Pickup company classification name 8 引取先分類名８.<p>
	 *
	 */
	public void sret_fr_grp_nm8(String value) {
		setConstString(offset + 179, $sret_fr_grp_nm8, value);
	}


	/**
	 * Pickup company classification 9 引取先分類９.<p>
	 *
	 */
	public boolean sret_fr_grp_flg9() {
		return getConstBoolean(offset + 180, $sret_fr_grp_flg9);
	}

	/**
	 * Pickup company classification 9 引取先分類９.<p>
	 *
	 */
	public void sret_fr_grp_flg9(boolean value) {
		setConstBoolean(offset + 180, $sret_fr_grp_flg9, value);
	}


	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public String sret_fr_grp_cd9() {
		return getConstString(offset + 181, $sret_fr_grp_cd9);
	}

	/**
	 * Pickup company classification cd. 9 引取先分類ＣＤ９.<p>
	 *
	 */
	public void sret_fr_grp_cd9(String value) {
		setConstString(offset + 181, $sret_fr_grp_cd9, value);
	}


	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public String sret_fr_grp_nm9() {
		return getConstString(offset + 182, $sret_fr_grp_nm9);
	}

	/**
	 * Pickup company classification name 9 引取先分類名９.<p>
	 *
	 */
	public void sret_fr_grp_nm9(String value) {
		setConstString(offset + 182, $sret_fr_grp_nm9, value);
	}


	/**
	 * Pickup company classification 10 引取先分類１０.<p>
	 *
	 */
	public boolean sret_fr_grp_flg10() {
		return getConstBoolean(offset + 183, $sret_fr_grp_flg10);
	}

	/**
	 * Pickup company classification 10 引取先分類１０.<p>
	 *
	 */
	public void sret_fr_grp_flg10(boolean value) {
		setConstBoolean(offset + 183, $sret_fr_grp_flg10, value);
	}


	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public String sret_fr_grp_cd10() {
		return getConstString(offset + 184, $sret_fr_grp_cd10);
	}

	/**
	 * Pickup company classification cd. 10 引取先分類ＣＤ１０.<p>
	 *
	 */
	public void sret_fr_grp_cd10(String value) {
		setConstString(offset + 184, $sret_fr_grp_cd10, value);
	}


	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public String sret_fr_grp_nm10() {
		return getConstString(offset + 185, $sret_fr_grp_nm10);
	}

	/**
	 * Pickup company classification name 10 引取先分類名１０.<p>
	 *
	 */
	public void sret_fr_grp_nm10(String value) {
		setConstString(offset + 185, $sret_fr_grp_nm10, value);
	}


	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return getConstBoolean(offset + 186, $cst_grp_flg1);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		setConstBoolean(offset + 186, $cst_grp_flg1, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 187, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 187, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 188, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 188, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return getConstBoolean(offset + 189, $cst_grp_flg2);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		setConstBoolean(offset + 189, $cst_grp_flg2, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 190, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 190, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 191, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 191, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return getConstBoolean(offset + 192, $cst_grp_flg3);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		setConstBoolean(offset + 192, $cst_grp_flg3, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 193, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 193, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 194, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 194, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return getConstBoolean(offset + 195, $cst_grp_flg4);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		setConstBoolean(offset + 195, $cst_grp_flg4, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 196, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 196, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 197, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 197, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return getConstBoolean(offset + 198, $cst_grp_flg5);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		setConstBoolean(offset + 198, $cst_grp_flg5, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 199, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 199, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 200, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 200, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return getConstBoolean(offset + 201, $cst_grp_flg6);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		setConstBoolean(offset + 201, $cst_grp_flg6, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 202, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 202, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 203, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 203, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return getConstBoolean(offset + 204, $cst_grp_flg7);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		setConstBoolean(offset + 204, $cst_grp_flg7, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 205, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 205, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 206, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 206, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return getConstBoolean(offset + 207, $cst_grp_flg8);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		setConstBoolean(offset + 207, $cst_grp_flg8, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 208, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 208, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 209, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 209, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return getConstBoolean(offset + 210, $cst_grp_flg9);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		setConstBoolean(offset + 210, $cst_grp_flg9, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 211, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 211, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 212, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 212, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return getConstBoolean(offset + 213, $cst_grp_flg10);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		setConstBoolean(offset + 213, $cst_grp_flg10, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 214, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 214, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 215, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 215, $cst_grp_nm10, value);
	}


	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public boolean prsppl_grp_flg1() {
		return getConstBoolean(offset + 216, $prsppl_grp_flg1);
	}

	/**
	 * Subcontractor classification 1 支給先分類１.<p>
	 *
	 */
	public void prsppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 216, $prsppl_grp_flg1, value);
	}


	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public String prsppl_grp_cd1() {
		return getConstString(offset + 217, $prsppl_grp_cd1);
	}

	/**
	 * Subcontractor classification cd. 1 支給先分類ＣＤ１.<p>
	 *
	 */
	public void prsppl_grp_cd1(String value) {
		setConstString(offset + 217, $prsppl_grp_cd1, value);
	}


	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public String prsppl_grp_nm1() {
		return getConstString(offset + 218, $prsppl_grp_nm1);
	}

	/**
	 * Subcontractor classification name 1 支給先分類名１.<p>
	 *
	 */
	public void prsppl_grp_nm1(String value) {
		setConstString(offset + 218, $prsppl_grp_nm1, value);
	}


	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public boolean prsppl_grp_flg2() {
		return getConstBoolean(offset + 219, $prsppl_grp_flg2);
	}

	/**
	 * Subcontractor classification 2 支給先分類２.<p>
	 *
	 */
	public void prsppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 219, $prsppl_grp_flg2, value);
	}


	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public String prsppl_grp_cd2() {
		return getConstString(offset + 220, $prsppl_grp_cd2);
	}

	/**
	 * Subcontractor classification cd. 2 支給先分類ＣＤ２.<p>
	 *
	 */
	public void prsppl_grp_cd2(String value) {
		setConstString(offset + 220, $prsppl_grp_cd2, value);
	}


	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public String prsppl_grp_nm2() {
		return getConstString(offset + 221, $prsppl_grp_nm2);
	}

	/**
	 * Subcontractor classification name 2 支給先分類名２.<p>
	 *
	 */
	public void prsppl_grp_nm2(String value) {
		setConstString(offset + 221, $prsppl_grp_nm2, value);
	}


	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public boolean prsppl_grp_flg3() {
		return getConstBoolean(offset + 222, $prsppl_grp_flg3);
	}

	/**
	 * Subcontractor classification 3 支給先分類３.<p>
	 *
	 */
	public void prsppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 222, $prsppl_grp_flg3, value);
	}


	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public String prsppl_grp_cd3() {
		return getConstString(offset + 223, $prsppl_grp_cd3);
	}

	/**
	 * Subcontractor classification cd. 3 支給先分類ＣＤ３.<p>
	 *
	 */
	public void prsppl_grp_cd3(String value) {
		setConstString(offset + 223, $prsppl_grp_cd3, value);
	}


	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public String prsppl_grp_nm3() {
		return getConstString(offset + 224, $prsppl_grp_nm3);
	}

	/**
	 * Subcontractor classification name 3 支給先分類名３.<p>
	 *
	 */
	public void prsppl_grp_nm3(String value) {
		setConstString(offset + 224, $prsppl_grp_nm3, value);
	}


	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public boolean prsppl_grp_flg4() {
		return getConstBoolean(offset + 225, $prsppl_grp_flg4);
	}

	/**
	 * Subcontractor classification 4 支給先分類４.<p>
	 *
	 */
	public void prsppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 225, $prsppl_grp_flg4, value);
	}


	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public String prsppl_grp_cd4() {
		return getConstString(offset + 226, $prsppl_grp_cd4);
	}

	/**
	 * Subcontractor classification cd. 4 支給先分類ＣＤ４.<p>
	 *
	 */
	public void prsppl_grp_cd4(String value) {
		setConstString(offset + 226, $prsppl_grp_cd4, value);
	}


	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public String prsppl_grp_nm4() {
		return getConstString(offset + 227, $prsppl_grp_nm4);
	}

	/**
	 * Subcontractor classification name 4 支給先分類名４.<p>
	 *
	 */
	public void prsppl_grp_nm4(String value) {
		setConstString(offset + 227, $prsppl_grp_nm4, value);
	}


	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public boolean prsppl_grp_flg5() {
		return getConstBoolean(offset + 228, $prsppl_grp_flg5);
	}

	/**
	 * Subcontractor classification 5 支給先分類５.<p>
	 *
	 */
	public void prsppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 228, $prsppl_grp_flg5, value);
	}


	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public String prsppl_grp_cd5() {
		return getConstString(offset + 229, $prsppl_grp_cd5);
	}

	/**
	 * Subcontractor classification cd. 5 支給先分類ＣＤ５.<p>
	 *
	 */
	public void prsppl_grp_cd5(String value) {
		setConstString(offset + 229, $prsppl_grp_cd5, value);
	}


	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public String prsppl_grp_nm5() {
		return getConstString(offset + 230, $prsppl_grp_nm5);
	}

	/**
	 * Subcontractor classification name 5 支給先分類名５.<p>
	 *
	 */
	public void prsppl_grp_nm5(String value) {
		setConstString(offset + 230, $prsppl_grp_nm5, value);
	}


	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public boolean prsppl_grp_flg6() {
		return getConstBoolean(offset + 231, $prsppl_grp_flg6);
	}

	/**
	 * Subcontractor classification 6 支給先分類６.<p>
	 *
	 */
	public void prsppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 231, $prsppl_grp_flg6, value);
	}


	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public String prsppl_grp_cd6() {
		return getConstString(offset + 232, $prsppl_grp_cd6);
	}

	/**
	 * Subcontractor classification cd. 6 支給先分類ＣＤ６.<p>
	 *
	 */
	public void prsppl_grp_cd6(String value) {
		setConstString(offset + 232, $prsppl_grp_cd6, value);
	}


	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public String prsppl_grp_nm6() {
		return getConstString(offset + 233, $prsppl_grp_nm6);
	}

	/**
	 * Subcontractor classification name 6 支給先分類名６.<p>
	 *
	 */
	public void prsppl_grp_nm6(String value) {
		setConstString(offset + 233, $prsppl_grp_nm6, value);
	}


	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public boolean prsppl_grp_flg7() {
		return getConstBoolean(offset + 234, $prsppl_grp_flg7);
	}

	/**
	 * Subcontractor classification 7 支給先分類７.<p>
	 *
	 */
	public void prsppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 234, $prsppl_grp_flg7, value);
	}


	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public String prsppl_grp_cd7() {
		return getConstString(offset + 235, $prsppl_grp_cd7);
	}

	/**
	 * Subcontractor classification cd. 7 支給先分類ＣＤ７.<p>
	 *
	 */
	public void prsppl_grp_cd7(String value) {
		setConstString(offset + 235, $prsppl_grp_cd7, value);
	}


	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public String prsppl_grp_nm7() {
		return getConstString(offset + 236, $prsppl_grp_nm7);
	}

	/**
	 * Subcontractor classification name 7 支給先分類名７.<p>
	 *
	 */
	public void prsppl_grp_nm7(String value) {
		setConstString(offset + 236, $prsppl_grp_nm7, value);
	}


	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public boolean prsppl_grp_flg8() {
		return getConstBoolean(offset + 237, $prsppl_grp_flg8);
	}

	/**
	 * Subcontractor classification 8 支給先分類８.<p>
	 *
	 */
	public void prsppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 237, $prsppl_grp_flg8, value);
	}


	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public String prsppl_grp_cd8() {
		return getConstString(offset + 238, $prsppl_grp_cd8);
	}

	/**
	 * Subcontractor classification cd. 8 支給先分類ＣＤ８.<p>
	 *
	 */
	public void prsppl_grp_cd8(String value) {
		setConstString(offset + 238, $prsppl_grp_cd8, value);
	}


	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public String prsppl_grp_nm8() {
		return getConstString(offset + 239, $prsppl_grp_nm8);
	}

	/**
	 * Subcontractor classification name 8 支給先分類名８.<p>
	 *
	 */
	public void prsppl_grp_nm8(String value) {
		setConstString(offset + 239, $prsppl_grp_nm8, value);
	}


	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public boolean prsppl_grp_flg9() {
		return getConstBoolean(offset + 240, $prsppl_grp_flg9);
	}

	/**
	 * Subcontractor classification 9 支給先分類９.<p>
	 *
	 */
	public void prsppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 240, $prsppl_grp_flg9, value);
	}


	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public String prsppl_grp_cd9() {
		return getConstString(offset + 241, $prsppl_grp_cd9);
	}

	/**
	 * Subcontractor classification cd. 9 支給先分類ＣＤ９.<p>
	 *
	 */
	public void prsppl_grp_cd9(String value) {
		setConstString(offset + 241, $prsppl_grp_cd9, value);
	}


	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public String prsppl_grp_nm9() {
		return getConstString(offset + 242, $prsppl_grp_nm9);
	}

	/**
	 * Subcontractor classification name 9 支給先分類名９.<p>
	 *
	 */
	public void prsppl_grp_nm9(String value) {
		setConstString(offset + 242, $prsppl_grp_nm9, value);
	}


	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public boolean prsppl_grp_flg10() {
		return getConstBoolean(offset + 243, $prsppl_grp_flg10);
	}

	/**
	 * Subcontractor classification 10 支給先分類１０.<p>
	 *
	 */
	public void prsppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 243, $prsppl_grp_flg10, value);
	}


	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public String prsppl_grp_cd10() {
		return getConstString(offset + 244, $prsppl_grp_cd10);
	}

	/**
	 * Subcontractor classification cd. 10 支給先分類ＣＤ１０.<p>
	 *
	 */
	public void prsppl_grp_cd10(String value) {
		setConstString(offset + 244, $prsppl_grp_cd10, value);
	}


	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public String prsppl_grp_nm10() {
		return getConstString(offset + 245, $prsppl_grp_nm10);
	}

	/**
	 * Subcontractor classification name 10 支給先分類名１０.<p>
	 *
	 */
	public void prsppl_grp_nm10(String value) {
		setConstString(offset + 245, $prsppl_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 246, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 246, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 247, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 247, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 248, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 248, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 249, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 249, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 250, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 250, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 251, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 251, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 252, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 252, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 253, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 253, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 254, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 254, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 255, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 255, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 256, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 256, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 257, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 257, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 258, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 258, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 259, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 259, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 260, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 260, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 261, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 261, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 262, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 262, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 263, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 263, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 264, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 264, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 265, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 265, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 266, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 266, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 267, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 267, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 268, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 268, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 269, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 269, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 270, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 270, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 271, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 271, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 272, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 272, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 273, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 273, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 274, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 274, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 275, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 275, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
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
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			return po_grp_cd1();
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			return po_grp_nm1();
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			return po_grp_cd2();
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			return po_grp_nm2();
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			return po_grp_cd3();
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			return po_grp_nm3();
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			return po_grp_cd4();
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			return po_grp_nm4();
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			return po_grp_cd5();
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			return po_grp_nm5();
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			return po_grp_cd6();
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			return po_grp_nm6();
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			return po_grp_cd7();
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			return po_grp_nm7();
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			return po_grp_cd8();
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			return po_grp_nm8();
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			return po_grp_cd9();
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			return po_grp_nm9();
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			return po_grp_cd10();
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			return po_grp_nm10();
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd1();
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm1();
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd2();
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm2();
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd3();
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm3();
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd4();
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm4();
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd5();
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm5();
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd6();
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm6();
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd7();
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm7();
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd8();
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm8();
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd9();
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm9();
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd10();
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm10();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			return arr_schd_dt_fr();
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			return arr_schd_hm_fr();
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			return arr_schd_dt_to();
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			return arr_schd_hm_to();
		}
		if ($arr_dt_fr.equalsIgnoreCase(name)) {
			return arr_dt_fr();
		}
		if ($arr_hm_fr.equalsIgnoreCase(name)) {
			return arr_hm_fr();
		}
		if ($arr_dt_to.equalsIgnoreCase(name)) {
			return arr_dt_to();
		}
		if ($arr_hm_to.equalsIgnoreCase(name)) {
			return arr_hm_to();
		}
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
		if ($outsrc_loc_flg.equalsIgnoreCase(name)) {
			return outsrc_loc_flg();
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
		if ($prov_slip_prnt_yet_flg.equalsIgnoreCase(name)) {
			return prov_slip_prnt_yet_flg();
		}
		if ($prov_slip_prnt_done_flg.equalsIgnoreCase(name)) {
			return prov_slip_prnt_done_flg();
		}
		if ($po_grp_flg1.equalsIgnoreCase(name)) {
			return po_grp_flg1();
		}
		if ($po_grp_flg2.equalsIgnoreCase(name)) {
			return po_grp_flg2();
		}
		if ($po_grp_flg3.equalsIgnoreCase(name)) {
			return po_grp_flg3();
		}
		if ($po_grp_flg4.equalsIgnoreCase(name)) {
			return po_grp_flg4();
		}
		if ($po_grp_flg5.equalsIgnoreCase(name)) {
			return po_grp_flg5();
		}
		if ($po_grp_flg6.equalsIgnoreCase(name)) {
			return po_grp_flg6();
		}
		if ($po_grp_flg7.equalsIgnoreCase(name)) {
			return po_grp_flg7();
		}
		if ($po_grp_flg8.equalsIgnoreCase(name)) {
			return po_grp_flg8();
		}
		if ($po_grp_flg9.equalsIgnoreCase(name)) {
			return po_grp_flg9();
		}
		if ($po_grp_flg10.equalsIgnoreCase(name)) {
			return po_grp_flg10();
		}
		if ($sret_fr_grp_flg1.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg1();
		}
		if ($sret_fr_grp_flg2.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg2();
		}
		if ($sret_fr_grp_flg3.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg3();
		}
		if ($sret_fr_grp_flg4.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg4();
		}
		if ($sret_fr_grp_flg5.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg5();
		}
		if ($sret_fr_grp_flg6.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg6();
		}
		if ($sret_fr_grp_flg7.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg7();
		}
		if ($sret_fr_grp_flg8.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg8();
		}
		if ($sret_fr_grp_flg9.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg9();
		}
		if ($sret_fr_grp_flg10.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg10();
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			return prsppl_grp_flg1();
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			return prsppl_grp_flg2();
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			return prsppl_grp_flg3();
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			return prsppl_grp_flg4();
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			return prsppl_grp_flg5();
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			return prsppl_grp_flg6();
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			return prsppl_grp_flg7();
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			return prsppl_grp_flg8();
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			return prsppl_grp_flg9();
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			return prsppl_grp_flg10();
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_dpt_cd();
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_dpt_nm();
		}
		if ($rqst_usr_cd.equalsIgnoreCase(name)) {
			return rqst_usr_cd();
		}
		if ($rqst_usr_nm.equalsIgnoreCase(name)) {
			return rqst_usr_nm();
		}
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			return arr_dpt_cd();
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			return arr_dpt_nm();
		}
		if ($arr_usr_cd.equalsIgnoreCase(name)) {
			return arr_usr_cd();
		}
		if ($arr_usr_nm.equalsIgnoreCase(name)) {
			return arr_usr_nm();
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			return arr_lg_grp_cd();
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			return arr_lg_grp_nm();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_wg_nm.equalsIgnoreCase(name)) {
			return arr_wg_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			return ship_wg_cd();
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			return ship_wg_nm();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			return prov_src_schd_typ();
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
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			return prov_src_act_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			return po_grp_cd1();
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			return po_grp_nm1();
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			return po_grp_cd2();
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			return po_grp_nm2();
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			return po_grp_cd3();
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			return po_grp_nm3();
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			return po_grp_cd4();
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			return po_grp_nm4();
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			return po_grp_cd5();
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			return po_grp_nm5();
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			return po_grp_cd6();
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			return po_grp_nm6();
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			return po_grp_cd7();
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			return po_grp_nm7();
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			return po_grp_cd8();
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			return po_grp_nm8();
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			return po_grp_cd9();
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			return po_grp_nm9();
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			return po_grp_cd10();
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			return po_grp_nm10();
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd1();
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm1();
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd2();
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm2();
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd3();
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm3();
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd4();
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm4();
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd5();
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm5();
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd6();
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm6();
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd7();
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm7();
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd8();
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm8();
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd9();
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm9();
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			return sret_fr_grp_cd10();
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			return sret_fr_grp_nm10();
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			return prsppl_grp_cd1();
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			return prsppl_grp_nm1();
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			return prsppl_grp_cd2();
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			return prsppl_grp_nm2();
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			return prsppl_grp_cd3();
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			return prsppl_grp_nm3();
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			return prsppl_grp_cd4();
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			return prsppl_grp_nm4();
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			return prsppl_grp_cd5();
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			return prsppl_grp_nm5();
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			return prsppl_grp_cd6();
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			return prsppl_grp_nm6();
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			return prsppl_grp_cd7();
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			return prsppl_grp_nm7();
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			return prsppl_grp_cd8();
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			return prsppl_grp_nm8();
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			return prsppl_grp_cd9();
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			return prsppl_grp_nm9();
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			return prsppl_grp_cd10();
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			return prsppl_grp_nm10();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			return arr_schd_dt_fr();
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			return arr_schd_hm_fr();
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			return arr_schd_dt_to();
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			return arr_schd_hm_to();
		}
		if ($arr_dt_fr.equalsIgnoreCase(name)) {
			return arr_dt_fr();
		}
		if ($arr_hm_fr.equalsIgnoreCase(name)) {
			return arr_hm_fr();
		}
		if ($arr_dt_to.equalsIgnoreCase(name)) {
			return arr_dt_to();
		}
		if ($arr_hm_to.equalsIgnoreCase(name)) {
			return arr_hm_to();
		}
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
		if ($outsrc_loc_flg.equalsIgnoreCase(name)) {
			return outsrc_loc_flg();
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
		if ($prov_slip_prnt_yet_flg.equalsIgnoreCase(name)) {
			return prov_slip_prnt_yet_flg();
		}
		if ($prov_slip_prnt_done_flg.equalsIgnoreCase(name)) {
			return prov_slip_prnt_done_flg();
		}
		if ($po_grp_flg1.equalsIgnoreCase(name)) {
			return po_grp_flg1();
		}
		if ($po_grp_flg2.equalsIgnoreCase(name)) {
			return po_grp_flg2();
		}
		if ($po_grp_flg3.equalsIgnoreCase(name)) {
			return po_grp_flg3();
		}
		if ($po_grp_flg4.equalsIgnoreCase(name)) {
			return po_grp_flg4();
		}
		if ($po_grp_flg5.equalsIgnoreCase(name)) {
			return po_grp_flg5();
		}
		if ($po_grp_flg6.equalsIgnoreCase(name)) {
			return po_grp_flg6();
		}
		if ($po_grp_flg7.equalsIgnoreCase(name)) {
			return po_grp_flg7();
		}
		if ($po_grp_flg8.equalsIgnoreCase(name)) {
			return po_grp_flg8();
		}
		if ($po_grp_flg9.equalsIgnoreCase(name)) {
			return po_grp_flg9();
		}
		if ($po_grp_flg10.equalsIgnoreCase(name)) {
			return po_grp_flg10();
		}
		if ($sret_fr_grp_flg1.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg1();
		}
		if ($sret_fr_grp_flg2.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg2();
		}
		if ($sret_fr_grp_flg3.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg3();
		}
		if ($sret_fr_grp_flg4.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg4();
		}
		if ($sret_fr_grp_flg5.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg5();
		}
		if ($sret_fr_grp_flg6.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg6();
		}
		if ($sret_fr_grp_flg7.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg7();
		}
		if ($sret_fr_grp_flg8.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg8();
		}
		if ($sret_fr_grp_flg9.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg9();
		}
		if ($sret_fr_grp_flg10.equalsIgnoreCase(name)) {
			return sret_fr_grp_flg10();
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			return prsppl_grp_flg1();
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			return prsppl_grp_flg2();
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			return prsppl_grp_flg3();
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			return prsppl_grp_flg4();
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			return prsppl_grp_flg5();
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			return prsppl_grp_flg6();
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			return prsppl_grp_flg7();
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			return prsppl_grp_flg8();
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			return prsppl_grp_flg9();
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			return prsppl_grp_flg10();
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
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
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			po_grp_cd1(value);
			return;
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			po_grp_nm1(value);
			return;
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			po_grp_cd2(value);
			return;
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			po_grp_nm2(value);
			return;
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			po_grp_cd3(value);
			return;
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			po_grp_nm3(value);
			return;
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			po_grp_cd4(value);
			return;
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			po_grp_nm4(value);
			return;
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			po_grp_cd5(value);
			return;
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			po_grp_nm5(value);
			return;
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			po_grp_cd6(value);
			return;
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			po_grp_nm6(value);
			return;
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			po_grp_cd7(value);
			return;
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			po_grp_nm7(value);
			return;
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			po_grp_cd8(value);
			return;
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			po_grp_nm8(value);
			return;
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			po_grp_cd9(value);
			return;
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			po_grp_nm9(value);
			return;
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			po_grp_cd10(value);
			return;
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			po_grp_nm10(value);
			return;
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			sret_fr_grp_cd1(value);
			return;
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			sret_fr_grp_nm1(value);
			return;
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			sret_fr_grp_cd2(value);
			return;
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			sret_fr_grp_nm2(value);
			return;
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			sret_fr_grp_cd3(value);
			return;
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			sret_fr_grp_nm3(value);
			return;
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			sret_fr_grp_cd4(value);
			return;
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			sret_fr_grp_nm4(value);
			return;
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			sret_fr_grp_cd5(value);
			return;
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			sret_fr_grp_nm5(value);
			return;
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			sret_fr_grp_cd6(value);
			return;
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			sret_fr_grp_nm6(value);
			return;
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			sret_fr_grp_cd7(value);
			return;
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			sret_fr_grp_nm7(value);
			return;
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			sret_fr_grp_cd8(value);
			return;
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			sret_fr_grp_nm8(value);
			return;
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			sret_fr_grp_cd9(value);
			return;
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			sret_fr_grp_nm9(value);
			return;
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			sret_fr_grp_cd10(value);
			return;
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			sret_fr_grp_nm10(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
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
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			arr_schd_dt_fr(value);
			return;
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			arr_schd_hm_fr(value);
			return;
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			arr_schd_dt_to(value);
			return;
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			arr_schd_hm_to(value);
			return;
		}
		if ($arr_dt_fr.equalsIgnoreCase(name)) {
			arr_dt_fr(value);
			return;
		}
		if ($arr_hm_fr.equalsIgnoreCase(name)) {
			arr_hm_fr(value);
			return;
		}
		if ($arr_dt_to.equalsIgnoreCase(name)) {
			arr_dt_to(value);
			return;
		}
		if ($arr_hm_to.equalsIgnoreCase(name)) {
			arr_hm_to(value);
			return;
		}
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
		if ($outsrc_loc_flg.equalsIgnoreCase(name)) {
			outsrc_loc_flg(value);
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
		if ($prov_slip_prnt_yet_flg.equalsIgnoreCase(name)) {
			prov_slip_prnt_yet_flg(value);
			return;
		}
		if ($prov_slip_prnt_done_flg.equalsIgnoreCase(name)) {
			prov_slip_prnt_done_flg(value);
			return;
		}
		if ($po_grp_flg1.equalsIgnoreCase(name)) {
			po_grp_flg1(value);
			return;
		}
		if ($po_grp_flg2.equalsIgnoreCase(name)) {
			po_grp_flg2(value);
			return;
		}
		if ($po_grp_flg3.equalsIgnoreCase(name)) {
			po_grp_flg3(value);
			return;
		}
		if ($po_grp_flg4.equalsIgnoreCase(name)) {
			po_grp_flg4(value);
			return;
		}
		if ($po_grp_flg5.equalsIgnoreCase(name)) {
			po_grp_flg5(value);
			return;
		}
		if ($po_grp_flg6.equalsIgnoreCase(name)) {
			po_grp_flg6(value);
			return;
		}
		if ($po_grp_flg7.equalsIgnoreCase(name)) {
			po_grp_flg7(value);
			return;
		}
		if ($po_grp_flg8.equalsIgnoreCase(name)) {
			po_grp_flg8(value);
			return;
		}
		if ($po_grp_flg9.equalsIgnoreCase(name)) {
			po_grp_flg9(value);
			return;
		}
		if ($po_grp_flg10.equalsIgnoreCase(name)) {
			po_grp_flg10(value);
			return;
		}
		if ($sret_fr_grp_flg1.equalsIgnoreCase(name)) {
			sret_fr_grp_flg1(value);
			return;
		}
		if ($sret_fr_grp_flg2.equalsIgnoreCase(name)) {
			sret_fr_grp_flg2(value);
			return;
		}
		if ($sret_fr_grp_flg3.equalsIgnoreCase(name)) {
			sret_fr_grp_flg3(value);
			return;
		}
		if ($sret_fr_grp_flg4.equalsIgnoreCase(name)) {
			sret_fr_grp_flg4(value);
			return;
		}
		if ($sret_fr_grp_flg5.equalsIgnoreCase(name)) {
			sret_fr_grp_flg5(value);
			return;
		}
		if ($sret_fr_grp_flg6.equalsIgnoreCase(name)) {
			sret_fr_grp_flg6(value);
			return;
		}
		if ($sret_fr_grp_flg7.equalsIgnoreCase(name)) {
			sret_fr_grp_flg7(value);
			return;
		}
		if ($sret_fr_grp_flg8.equalsIgnoreCase(name)) {
			sret_fr_grp_flg8(value);
			return;
		}
		if ($sret_fr_grp_flg9.equalsIgnoreCase(name)) {
			sret_fr_grp_flg9(value);
			return;
		}
		if ($sret_fr_grp_flg10.equalsIgnoreCase(name)) {
			sret_fr_grp_flg10(value);
			return;
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			prsppl_grp_flg1(value);
			return;
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			prsppl_grp_flg2(value);
			return;
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			prsppl_grp_flg3(value);
			return;
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			prsppl_grp_flg4(value);
			return;
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			prsppl_grp_flg5(value);
			return;
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			prsppl_grp_flg6(value);
			return;
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			prsppl_grp_flg7(value);
			return;
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			prsppl_grp_flg8(value);
			return;
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			prsppl_grp_flg9(value);
			return;
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			prsppl_grp_flg10(value);
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
		if ($rqst_dpt_cd.equalsIgnoreCase(name)) {
			rqst_dpt_cd(value);
			return;
		}
		if ($rqst_dpt_nm.equalsIgnoreCase(name)) {
			rqst_dpt_nm(value);
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
		if ($arr_dpt_cd.equalsIgnoreCase(name)) {
			arr_dpt_cd(value);
			return;
		}
		if ($arr_dpt_nm.equalsIgnoreCase(name)) {
			arr_dpt_nm(value);
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
		if ($arr_lg_grp_cd.equalsIgnoreCase(name)) {
			arr_lg_grp_cd(value);
			return;
		}
		if ($arr_lg_grp_nm.equalsIgnoreCase(name)) {
			arr_lg_grp_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($ship_wg_cd.equalsIgnoreCase(name)) {
			ship_wg_cd(value);
			return;
		}
		if ($ship_wg_nm.equalsIgnoreCase(name)) {
			ship_wg_nm(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_src_schd_typ.equalsIgnoreCase(name)) {
			prov_src_schd_typ(value);
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
		if ($prov_src_act_no.equalsIgnoreCase(name)) {
			prov_src_act_no(value);
			return;
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($po_grp_cd1.equalsIgnoreCase(name)) {
			po_grp_cd1(value);
			return;
		}
		if ($po_grp_nm1.equalsIgnoreCase(name)) {
			po_grp_nm1(value);
			return;
		}
		if ($po_grp_cd2.equalsIgnoreCase(name)) {
			po_grp_cd2(value);
			return;
		}
		if ($po_grp_nm2.equalsIgnoreCase(name)) {
			po_grp_nm2(value);
			return;
		}
		if ($po_grp_cd3.equalsIgnoreCase(name)) {
			po_grp_cd3(value);
			return;
		}
		if ($po_grp_nm3.equalsIgnoreCase(name)) {
			po_grp_nm3(value);
			return;
		}
		if ($po_grp_cd4.equalsIgnoreCase(name)) {
			po_grp_cd4(value);
			return;
		}
		if ($po_grp_nm4.equalsIgnoreCase(name)) {
			po_grp_nm4(value);
			return;
		}
		if ($po_grp_cd5.equalsIgnoreCase(name)) {
			po_grp_cd5(value);
			return;
		}
		if ($po_grp_nm5.equalsIgnoreCase(name)) {
			po_grp_nm5(value);
			return;
		}
		if ($po_grp_cd6.equalsIgnoreCase(name)) {
			po_grp_cd6(value);
			return;
		}
		if ($po_grp_nm6.equalsIgnoreCase(name)) {
			po_grp_nm6(value);
			return;
		}
		if ($po_grp_cd7.equalsIgnoreCase(name)) {
			po_grp_cd7(value);
			return;
		}
		if ($po_grp_nm7.equalsIgnoreCase(name)) {
			po_grp_nm7(value);
			return;
		}
		if ($po_grp_cd8.equalsIgnoreCase(name)) {
			po_grp_cd8(value);
			return;
		}
		if ($po_grp_nm8.equalsIgnoreCase(name)) {
			po_grp_nm8(value);
			return;
		}
		if ($po_grp_cd9.equalsIgnoreCase(name)) {
			po_grp_cd9(value);
			return;
		}
		if ($po_grp_nm9.equalsIgnoreCase(name)) {
			po_grp_nm9(value);
			return;
		}
		if ($po_grp_cd10.equalsIgnoreCase(name)) {
			po_grp_cd10(value);
			return;
		}
		if ($po_grp_nm10.equalsIgnoreCase(name)) {
			po_grp_nm10(value);
			return;
		}
		if ($sret_fr_grp_cd1.equalsIgnoreCase(name)) {
			sret_fr_grp_cd1(value);
			return;
		}
		if ($sret_fr_grp_nm1.equalsIgnoreCase(name)) {
			sret_fr_grp_nm1(value);
			return;
		}
		if ($sret_fr_grp_cd2.equalsIgnoreCase(name)) {
			sret_fr_grp_cd2(value);
			return;
		}
		if ($sret_fr_grp_nm2.equalsIgnoreCase(name)) {
			sret_fr_grp_nm2(value);
			return;
		}
		if ($sret_fr_grp_cd3.equalsIgnoreCase(name)) {
			sret_fr_grp_cd3(value);
			return;
		}
		if ($sret_fr_grp_nm3.equalsIgnoreCase(name)) {
			sret_fr_grp_nm3(value);
			return;
		}
		if ($sret_fr_grp_cd4.equalsIgnoreCase(name)) {
			sret_fr_grp_cd4(value);
			return;
		}
		if ($sret_fr_grp_nm4.equalsIgnoreCase(name)) {
			sret_fr_grp_nm4(value);
			return;
		}
		if ($sret_fr_grp_cd5.equalsIgnoreCase(name)) {
			sret_fr_grp_cd5(value);
			return;
		}
		if ($sret_fr_grp_nm5.equalsIgnoreCase(name)) {
			sret_fr_grp_nm5(value);
			return;
		}
		if ($sret_fr_grp_cd6.equalsIgnoreCase(name)) {
			sret_fr_grp_cd6(value);
			return;
		}
		if ($sret_fr_grp_nm6.equalsIgnoreCase(name)) {
			sret_fr_grp_nm6(value);
			return;
		}
		if ($sret_fr_grp_cd7.equalsIgnoreCase(name)) {
			sret_fr_grp_cd7(value);
			return;
		}
		if ($sret_fr_grp_nm7.equalsIgnoreCase(name)) {
			sret_fr_grp_nm7(value);
			return;
		}
		if ($sret_fr_grp_cd8.equalsIgnoreCase(name)) {
			sret_fr_grp_cd8(value);
			return;
		}
		if ($sret_fr_grp_nm8.equalsIgnoreCase(name)) {
			sret_fr_grp_nm8(value);
			return;
		}
		if ($sret_fr_grp_cd9.equalsIgnoreCase(name)) {
			sret_fr_grp_cd9(value);
			return;
		}
		if ($sret_fr_grp_nm9.equalsIgnoreCase(name)) {
			sret_fr_grp_nm9(value);
			return;
		}
		if ($sret_fr_grp_cd10.equalsIgnoreCase(name)) {
			sret_fr_grp_cd10(value);
			return;
		}
		if ($sret_fr_grp_nm10.equalsIgnoreCase(name)) {
			sret_fr_grp_nm10(value);
			return;
		}
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($prsppl_grp_cd1.equalsIgnoreCase(name)) {
			prsppl_grp_cd1(value);
			return;
		}
		if ($prsppl_grp_nm1.equalsIgnoreCase(name)) {
			prsppl_grp_nm1(value);
			return;
		}
		if ($prsppl_grp_cd2.equalsIgnoreCase(name)) {
			prsppl_grp_cd2(value);
			return;
		}
		if ($prsppl_grp_nm2.equalsIgnoreCase(name)) {
			prsppl_grp_nm2(value);
			return;
		}
		if ($prsppl_grp_cd3.equalsIgnoreCase(name)) {
			prsppl_grp_cd3(value);
			return;
		}
		if ($prsppl_grp_nm3.equalsIgnoreCase(name)) {
			prsppl_grp_nm3(value);
			return;
		}
		if ($prsppl_grp_cd4.equalsIgnoreCase(name)) {
			prsppl_grp_cd4(value);
			return;
		}
		if ($prsppl_grp_nm4.equalsIgnoreCase(name)) {
			prsppl_grp_nm4(value);
			return;
		}
		if ($prsppl_grp_cd5.equalsIgnoreCase(name)) {
			prsppl_grp_cd5(value);
			return;
		}
		if ($prsppl_grp_nm5.equalsIgnoreCase(name)) {
			prsppl_grp_nm5(value);
			return;
		}
		if ($prsppl_grp_cd6.equalsIgnoreCase(name)) {
			prsppl_grp_cd6(value);
			return;
		}
		if ($prsppl_grp_nm6.equalsIgnoreCase(name)) {
			prsppl_grp_nm6(value);
			return;
		}
		if ($prsppl_grp_cd7.equalsIgnoreCase(name)) {
			prsppl_grp_cd7(value);
			return;
		}
		if ($prsppl_grp_nm7.equalsIgnoreCase(name)) {
			prsppl_grp_nm7(value);
			return;
		}
		if ($prsppl_grp_cd8.equalsIgnoreCase(name)) {
			prsppl_grp_cd8(value);
			return;
		}
		if ($prsppl_grp_nm8.equalsIgnoreCase(name)) {
			prsppl_grp_nm8(value);
			return;
		}
		if ($prsppl_grp_cd9.equalsIgnoreCase(name)) {
			prsppl_grp_cd9(value);
			return;
		}
		if ($prsppl_grp_nm9.equalsIgnoreCase(name)) {
			prsppl_grp_nm9(value);
			return;
		}
		if ($prsppl_grp_cd10.equalsIgnoreCase(name)) {
			prsppl_grp_cd10(value);
			return;
		}
		if ($prsppl_grp_nm10.equalsIgnoreCase(name)) {
			prsppl_grp_nm10(value);
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
		if ($arr_schd_dt_fr.equalsIgnoreCase(name)) {
			arr_schd_dt_fr(value);
			return;
		}
		if ($arr_schd_hm_fr.equalsIgnoreCase(name)) {
			arr_schd_hm_fr(value);
			return;
		}
		if ($arr_schd_dt_to.equalsIgnoreCase(name)) {
			arr_schd_dt_to(value);
			return;
		}
		if ($arr_schd_hm_to.equalsIgnoreCase(name)) {
			arr_schd_hm_to(value);
			return;
		}
		if ($arr_dt_fr.equalsIgnoreCase(name)) {
			arr_dt_fr(value);
			return;
		}
		if ($arr_hm_fr.equalsIgnoreCase(name)) {
			arr_hm_fr(value);
			return;
		}
		if ($arr_dt_to.equalsIgnoreCase(name)) {
			arr_dt_to(value);
			return;
		}
		if ($arr_hm_to.equalsIgnoreCase(name)) {
			arr_hm_to(value);
			return;
		}
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
		if ($outsrc_loc_flg.equalsIgnoreCase(name)) {
			outsrc_loc_flg(value);
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
		if ($prov_slip_prnt_yet_flg.equalsIgnoreCase(name)) {
			prov_slip_prnt_yet_flg(value);
			return;
		}
		if ($prov_slip_prnt_done_flg.equalsIgnoreCase(name)) {
			prov_slip_prnt_done_flg(value);
			return;
		}
		if ($po_grp_flg1.equalsIgnoreCase(name)) {
			po_grp_flg1(value);
			return;
		}
		if ($po_grp_flg2.equalsIgnoreCase(name)) {
			po_grp_flg2(value);
			return;
		}
		if ($po_grp_flg3.equalsIgnoreCase(name)) {
			po_grp_flg3(value);
			return;
		}
		if ($po_grp_flg4.equalsIgnoreCase(name)) {
			po_grp_flg4(value);
			return;
		}
		if ($po_grp_flg5.equalsIgnoreCase(name)) {
			po_grp_flg5(value);
			return;
		}
		if ($po_grp_flg6.equalsIgnoreCase(name)) {
			po_grp_flg6(value);
			return;
		}
		if ($po_grp_flg7.equalsIgnoreCase(name)) {
			po_grp_flg7(value);
			return;
		}
		if ($po_grp_flg8.equalsIgnoreCase(name)) {
			po_grp_flg8(value);
			return;
		}
		if ($po_grp_flg9.equalsIgnoreCase(name)) {
			po_grp_flg9(value);
			return;
		}
		if ($po_grp_flg10.equalsIgnoreCase(name)) {
			po_grp_flg10(value);
			return;
		}
		if ($sret_fr_grp_flg1.equalsIgnoreCase(name)) {
			sret_fr_grp_flg1(value);
			return;
		}
		if ($sret_fr_grp_flg2.equalsIgnoreCase(name)) {
			sret_fr_grp_flg2(value);
			return;
		}
		if ($sret_fr_grp_flg3.equalsIgnoreCase(name)) {
			sret_fr_grp_flg3(value);
			return;
		}
		if ($sret_fr_grp_flg4.equalsIgnoreCase(name)) {
			sret_fr_grp_flg4(value);
			return;
		}
		if ($sret_fr_grp_flg5.equalsIgnoreCase(name)) {
			sret_fr_grp_flg5(value);
			return;
		}
		if ($sret_fr_grp_flg6.equalsIgnoreCase(name)) {
			sret_fr_grp_flg6(value);
			return;
		}
		if ($sret_fr_grp_flg7.equalsIgnoreCase(name)) {
			sret_fr_grp_flg7(value);
			return;
		}
		if ($sret_fr_grp_flg8.equalsIgnoreCase(name)) {
			sret_fr_grp_flg8(value);
			return;
		}
		if ($sret_fr_grp_flg9.equalsIgnoreCase(name)) {
			sret_fr_grp_flg9(value);
			return;
		}
		if ($sret_fr_grp_flg10.equalsIgnoreCase(name)) {
			sret_fr_grp_flg10(value);
			return;
		}
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($prsppl_grp_flg1.equalsIgnoreCase(name)) {
			prsppl_grp_flg1(value);
			return;
		}
		if ($prsppl_grp_flg2.equalsIgnoreCase(name)) {
			prsppl_grp_flg2(value);
			return;
		}
		if ($prsppl_grp_flg3.equalsIgnoreCase(name)) {
			prsppl_grp_flg3(value);
			return;
		}
		if ($prsppl_grp_flg4.equalsIgnoreCase(name)) {
			prsppl_grp_flg4(value);
			return;
		}
		if ($prsppl_grp_flg5.equalsIgnoreCase(name)) {
			prsppl_grp_flg5(value);
			return;
		}
		if ($prsppl_grp_flg6.equalsIgnoreCase(name)) {
			prsppl_grp_flg6(value);
			return;
		}
		if ($prsppl_grp_flg7.equalsIgnoreCase(name)) {
			prsppl_grp_flg7(value);
			return;
		}
		if ($prsppl_grp_flg8.equalsIgnoreCase(name)) {
			prsppl_grp_flg8(value);
			return;
		}
		if ($prsppl_grp_flg9.equalsIgnoreCase(name)) {
			prsppl_grp_flg9(value);
			return;
		}
		if ($prsppl_grp_flg10.equalsIgnoreCase(name)) {
			prsppl_grp_flg10(value);
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

