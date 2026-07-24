package mcframe.clientMSBB.MSBBP1220;

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
	 * Order received 注文受領済.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	/**
	 * Completed order promising 納期回答済.<p>
	 *
	 */
	public static final String $prms_flg = "prms_flg";
	/**
	 * Delivery order received 納入指示受領済.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_flg = "dlv_inst_rcpt_flg";
	/**
	 * Delivery order replied 納入指示回答済.<p>
	 *
	 */
	public static final String $dlv_inst_prms_flg = "dlv_inst_prms_flg";
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public static final String $sls_ship_flg = "sls_ship_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $sls_compl_flg = "sls_compl_flg";
	/**
	 * DTL,Details;HDR,Header;SHIP_SCHD,Shipping schedule DTL,明細;HDR,ヘッダ;SHIP_SCHD,出荷予定.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * SRCH,Search;IMP,Input file SRCH,検索する;IMP,ファイル入力.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $aprv_open_flg = "aprv_open_flg";
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public static final String $aprv_fix_flg = "aprv_fix_flg";
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public static final String $aprv_acpt_flg = "aprv_acpt_flg";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $aprv_rjct_flg = "aprv_rjct_flg";
	/**
	 * Denied 否認.<p>
	 *
	 */
	public static final String $aprv_last_rjct_flg = "aprv_last_rjct_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $aprv_invalid_flg = "aprv_invalid_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $iv_trd_invalid_flg = "iv_trd_invalid_flg";
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
	 * Unallocated 未引当.<p>
	 *
	 */
	public static final String $not_alloc_flg = "not_alloc_flg";
	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public static final String $part_alloc_flg = "part_alloc_flg";
	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public static final String $all_alloc_flg = "all_alloc_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $alloc_invalid_flg = "alloc_invalid_flg";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $not_inst_flg = "not_inst_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public static final String $not_ship_flg = "not_ship_flg";
	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public static final String $part_ship_flg = "part_ship_flg";
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public static final String $ship_flg = "ship_flg";
	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $slo_dt_fr = "slo_dt_fr";
	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public static final String $slo_dt_to = "slo_dt_to";
	/**
	 * Delivery order received date FROM 納入指示受領日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_dt_fr = "dlv_inst_rcpt_dt_fr";
	/**
	 * Delivery order received date TO 納入指示受領日ＴＯ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_dt_to = "dlv_inst_rcpt_dt_to";
	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rcpt_dt_fr = "rcpt_dt_fr";
	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public static final String $rcpt_dt_to = "rcpt_dt_to";
	public static final String $ship_rqst_dt_p = "ship_rqst_dt_p";
	public static final String $dlv_rqst_dt_p = "dlv_rqst_dt_p";
	public static final String $ship_schd_dt_p = "ship_schd_dt_p";
	public static final String $dlv_schd_dt_p = "dlv_schd_dt_p";
	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sls_schd_dt_fr = "sls_schd_dt_fr";
	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public static final String $sls_schd_dt_to = "sls_schd_dt_to";
	public static final String $dlv_dt_p = "dlv_dt_p";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
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
	 * Desired shipping date delayed (Schedule) 出荷希望日遅れ（予定）.<p>
	 *
	 */
	public static final String $ship_rqst_dt_overdue_flg = "ship_rqst_dt_overdue_flg";
	/**
	 * Desired delivery date delayed (Schedule) 納入希望日遅れ（予定）.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_flg = "dlv_rqst_dt_overdue_flg";
	/**
	 * Delivery request date delayed (Schedule) 納品依頼日遅れ（予定）.<p>
	 *
	 */
	public static final String $pd_inst_dlv_dt_overdue_flg = "pd_inst_dlv_dt_overdue_flg";
	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_act_flg = "dlv_rqst_dt_overdue_act_flg";
	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public static final String $prms_dlv_dt_overdue_act_flg = "prms_dlv_dt_overdue_act_flg";
	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public static final String $ship_pr_fr = "ship_pr_fr";
	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public static final String $ship_pr_to = "ship_pr_to";
	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public static final String $sls_pr_fr = "sls_pr_fr";
	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public static final String $sls_pr_to = "sls_pr_to";
	/**
	 * Display delay expectation qty. 遅れ見込数量表示.<p>
	 *
	 */
	public static final String $overdue_prspct_disp_flg = "overdue_prspct_disp_flg";
	/**
	 * Delay expectation qty. only 遅れ見込数量ありのみ.<p>
	 *
	 */
	public static final String $overdue_prspct_only_flg = "overdue_prspct_only_flg";
	public static final String $itm_typ_p = "itm_typ_p";
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
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $sno_p = "sno_p";
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
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
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_cd = "rqst_to_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_to_loc_nm = "rqst_to_loc_nm";
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public static final String $rcpt_usr_cd = "rcpt_usr_cd";
	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public static final String $rcpt_usr_nm = "rcpt_usr_nm";
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
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public static final String $sls_rsn_nm = "sls_rsn_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public static final String $slo_typ = "slo_typ";
	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public static final String $slo_typ_nm = "slo_typ_nm";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public static final String $ship_inst_typ_nm = "ship_inst_typ_nm";
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public static final String $proc_typ_nm = "proc_typ_nm";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public static final String $alloc_typ_nm = "alloc_typ_nm";
	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public static final String $cst_po_rmrks = "cst_po_rmrks";
	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public static final String $cst_po_d_rmrks = "cst_po_d_rmrks";
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
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $slo_d_intr_rmrks = "slo_d_intr_rmrks";
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public static final String $can_rsn_nm = "can_rsn_nm";
	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public static final String $slo_d_can_rsn_cd = "slo_d_can_rsn_cd";
	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public static final String $slo_d_can_rsn_nm = "slo_d_can_rsn_nm";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $slo_d_sub_char1 = "slo_d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $slo_d_sub_char2 = "slo_d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $slo_d_sub_char3 = "slo_d_sub_char3";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $inc_abort_flg = "inc_abort_flg";
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public static final String $inc_past_flg = "inc_past_flg";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $ship_rqst_dt_fr = $ship_rqst_dt_p + ".ymd_fr";
	public static final String $ship_rqst_hm_fr = $ship_rqst_dt_p + ".hm_fr";
	public static final String $ship_rqst_dt_to = $ship_rqst_dt_p + ".ymd_to";
	public static final String $ship_rqst_hm_to = $ship_rqst_dt_p + ".hm_to";
	public static final String $dlv_rqst_dt_fr = $dlv_rqst_dt_p + ".ymd_fr";
	public static final String $dlv_rqst_hm_fr = $dlv_rqst_dt_p + ".hm_fr";
	public static final String $dlv_rqst_dt_to = $dlv_rqst_dt_p + ".ymd_to";
	public static final String $dlv_rqst_hm_to = $dlv_rqst_dt_p + ".hm_to";
	public static final String $ship_schd_dt_fr = $ship_schd_dt_p + ".ymd_fr";
	public static final String $ship_schd_hm_fr = $ship_schd_dt_p + ".hm_fr";
	public static final String $ship_schd_dt_to = $ship_schd_dt_p + ".ymd_to";
	public static final String $ship_schd_hm_to = $ship_schd_dt_p + ".hm_to";
	public static final String $dlv_schd_dt_fr = $dlv_schd_dt_p + ".ymd_fr";
	public static final String $dlv_schd_hm_fr = $dlv_schd_dt_p + ".hm_fr";
	public static final String $dlv_schd_dt_to = $dlv_schd_dt_p + ".ymd_to";
	public static final String $dlv_schd_hm_to = $dlv_schd_dt_p + ".hm_to";
	public static final String $dlv_dt_fr = $dlv_dt_p + ".ymd_fr";
	public static final String $dlv_hm_fr = $dlv_dt_p + ".hm_fr";
	public static final String $dlv_dt_to = $dlv_dt_p + ".ymd_to";
	public static final String $dlv_hm_to = $dlv_dt_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
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
	public static final String $dlv_grp_lab1 = $dlv_grp_p + ".bp_grp_lab1";
	public static final String $dlv_grp_flg1 = $dlv_grp_p + ".bp_grp_flg1";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_lab2 = $dlv_grp_p + ".bp_grp_lab2";
	public static final String $dlv_grp_flg2 = $dlv_grp_p + ".bp_grp_flg2";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_lab3 = $dlv_grp_p + ".bp_grp_lab3";
	public static final String $dlv_grp_flg3 = $dlv_grp_p + ".bp_grp_flg3";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_lab4 = $dlv_grp_p + ".bp_grp_lab4";
	public static final String $dlv_grp_flg4 = $dlv_grp_p + ".bp_grp_flg4";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_lab5 = $dlv_grp_p + ".bp_grp_lab5";
	public static final String $dlv_grp_flg5 = $dlv_grp_p + ".bp_grp_flg5";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_lab6 = $dlv_grp_p + ".bp_grp_lab6";
	public static final String $dlv_grp_flg6 = $dlv_grp_p + ".bp_grp_flg6";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_lab7 = $dlv_grp_p + ".bp_grp_lab7";
	public static final String $dlv_grp_flg7 = $dlv_grp_p + ".bp_grp_flg7";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_lab8 = $dlv_grp_p + ".bp_grp_lab8";
	public static final String $dlv_grp_flg8 = $dlv_grp_p + ".bp_grp_flg8";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_lab9 = $dlv_grp_p + ".bp_grp_lab9";
	public static final String $dlv_grp_flg9 = $dlv_grp_p + ".bp_grp_flg9";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_lab10 = $dlv_grp_p + ".bp_grp_lab10";
	public static final String $dlv_grp_flg10 = $dlv_grp_p + ".bp_grp_flg10";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
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

	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_flg_META = createCommonMeta($prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_rcpt_flg_META = createCommonMeta($dlv_inst_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_prms_flg_META = createCommonMeta($dlv_inst_prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ship_flg_META = createCommonMeta($sls_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_compl_flg_META = createCommonMeta($sls_compl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_unit_META = createStringMeta($disp_unit);
	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta aprv_open_flg_META = createCommonMeta($aprv_open_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_fix_flg_META = createCommonMeta($aprv_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_acpt_flg_META = createCommonMeta($aprv_acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_rjct_flg_META = createCommonMeta($aprv_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_last_rjct_flg_META = createCommonMeta($aprv_last_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_invalid_flg_META = createCommonMeta($aprv_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trd_invalid_flg_META = createCommonMeta($iv_trd_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_invalid_flg_META = createCommonMeta($edi_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_alloc_flg_META = createCommonMeta($not_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_alloc_flg_META = createCommonMeta($part_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_alloc_flg_META = createCommonMeta($all_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_invalid_flg_META = createCommonMeta($alloc_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ship_flg_META = createCommonMeta($not_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_ship_flg_META = createCommonMeta($part_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_flg_META = createCommonMeta($ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_dt_fr_META = createCommonMeta($slo_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_dt_to_META = createCommonMeta($slo_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_rcpt_dt_fr_META = createCommonMeta($dlv_inst_rcpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_rcpt_dt_to_META = createCommonMeta($dlv_inst_rcpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_dt_fr_META = createCommonMeta($rcpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_dt_to_META = createCommonMeta($rcpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_dt_p_META = createInnerRowMeta($ship_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_rqst_dt_p_META = createInnerRowMeta($dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_schd_dt_p_META = createInnerRowMeta($ship_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_schd_dt_p_META = createInnerRowMeta($dlv_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta sls_schd_dt_fr_META = createCommonMeta($sls_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_to_META = createCommonMeta($sls_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_dt_p_META = createInnerRowMeta($dlv_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta ship_rqst_dt_overdue_flg_META = createCommonMeta($ship_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_flg_META = createCommonMeta($dlv_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pd_inst_dlv_dt_overdue_flg_META = createCommonMeta($pd_inst_dlv_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_act_flg_META = createCommonMeta($dlv_rqst_dt_overdue_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dlv_dt_overdue_act_flg_META = createCommonMeta($prms_dlv_dt_overdue_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_pr_fr_META = createCommonMeta($ship_pr_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta ship_pr_to_META = createCommonMeta($ship_pr_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta sls_pr_fr_META = createCommonMeta($sls_pr_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta sls_pr_to_META = createCommonMeta($sls_pr_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta overdue_prspct_disp_flg_META = createCommonMeta($overdue_prspct_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta overdue_prspct_only_flg_META = createCommonMeta($overdue_prspct_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_to_loc_nm_META = createCommonMeta($rqst_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_rsn_nm_META = createCommonMeta($sls_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta slo_typ_nm_META = createCommonMeta($slo_typ_nm, mcframe.commonMS.meta.MS_META.SLO_TYP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_typ_nm_META = createCommonMeta($ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta proc_typ_nm_META = createCommonMeta($proc_typ_nm, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP_NM);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_typ_nm_META = createCommonMeta($alloc_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_TYP_NM);
	public static final MCMeta cst_po_rmrks_META = createCommonMeta($cst_po_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_RMRKS);
	public static final MCMeta cst_po_d_rmrks_META = createCommonMeta($cst_po_d_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_D_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_INTR_RMRKS);
	public static final MCMeta slo_d_intr_rmrks_META = createCommonMeta($slo_d_intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_D_INTR_RMRKS);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rsn_nm_META = createCommonMeta($can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta slo_d_can_rsn_cd_META = createCommonMeta($slo_d_can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_d_can_rsn_nm_META = createCommonMeta($slo_d_can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta slo_d_sub_char1_META = createCommonMeta($slo_d_sub_char1, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR1);
	public static final MCMeta slo_d_sub_char2_META = createCommonMeta($slo_d_sub_char2, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR2);
	public static final MCMeta slo_d_sub_char3_META = createCommonMeta($slo_d_sub_char3, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR3);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_abort_flg_META = createCommonMeta($inc_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_past_flg_META = createCommonMeta($inc_past_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_flg_META,
			prms_flg_META,
			dlv_inst_rcpt_flg_META,
			dlv_inst_prms_flg_META,
			sls_flg_META,
			sls_ship_flg_META,
			sls_compl_flg_META,
			disp_unit_META,
			ope_META,
			aprv_open_flg_META,
			aprv_fix_flg_META,
			aprv_acpt_flg_META,
			aprv_rjct_flg_META,
			aprv_last_rjct_flg_META,
			aprv_invalid_flg_META,
			iv_trd_flg_META,
			iv_trd_invalid_flg_META,
			edi_flg_META,
			edi_invalid_flg_META,
			not_alloc_flg_META,
			part_alloc_flg_META,
			all_alloc_flg_META,
			alloc_invalid_flg_META,
			not_inst_flg_META,
			inst_flg_META,
			not_ship_flg_META,
			part_ship_flg_META,
			ship_flg_META,
			slo_dt_fr_META,
			slo_dt_to_META,
			dlv_inst_rcpt_dt_fr_META,
			dlv_inst_rcpt_dt_to_META,
			rcpt_dt_fr_META,
			rcpt_dt_to_META,
			ship_rqst_dt_p_META,
			dlv_rqst_dt_p_META,
			ship_schd_dt_p_META,
			dlv_schd_dt_p_META,
			sls_schd_dt_fr_META,
			sls_schd_dt_to_META,
			dlv_dt_p_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			tdlv_cd_META,
			tdlv_nm_META,
			slo_no_META,
			slo_d_no_META,
			qtn_no_META,
			qtn_rev_META,
			cst_po_no_META,
			cst_po_d_no_META,
			aprv_no_META,
			trd_cd_META,
			trd_nm_META,
			ship_rqst_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_flg_META,
			pd_inst_dlv_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_act_flg_META,
			prms_dlv_dt_overdue_act_flg_META,
			ship_pr_fr_META,
			ship_pr_to_META,
			sls_pr_fr_META,
			sls_pr_to_META,
			overdue_prspct_disp_flg_META,
			overdue_prspct_only_flg_META,
			itm_typ_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_p_META,
			ver_no_p_META,
			sno_p_META,
			ship_block_flg_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			lot_no_META,
			sublot_no_META,
			rqst_to_loc_cd_META,
			rqst_to_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			gd_cd_META,
			gd_nm_META,
			sls_rsn_cd_META,
			sls_rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			slo_typ_META,
			slo_typ_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			ship_inst_typ_META,
			ship_inst_typ_nm_META,
			proc_typ_META,
			proc_typ_nm_META,
			alloc_typ_META,
			alloc_typ_nm_META,
			cst_po_rmrks_META,
			cst_po_d_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			slo_d_intr_rmrks_META,
			can_rsn_cd_META,
			can_rsn_nm_META,
			slo_d_can_rsn_cd_META,
			slo_d_can_rsn_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			slo_d_sub_char1_META,
			slo_d_sub_char2_META,
			slo_d_sub_char3_META,
			inc_can_flg_META,
			inc_abort_flg_META,
			inc_past_flg_META,
			cst_grp_p_META,
			dlv_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"ship_rqst_dt_fr",
				"ship_rqst_hm_fr",
				"ship_rqst_dt_to",
				"ship_rqst_hm_to",
				"dlv_rqst_dt_fr",
				"dlv_rqst_hm_fr",
				"dlv_rqst_dt_to",
				"dlv_rqst_hm_to",
				"ship_schd_dt_fr",
				"ship_schd_hm_fr",
				"ship_schd_dt_to",
				"ship_schd_hm_to",
				"dlv_schd_dt_fr",
				"dlv_schd_hm_fr",
				"dlv_schd_dt_to",
				"dlv_schd_hm_to",
				"dlv_dt_fr",
				"dlv_hm_fr",
				"dlv_dt_to",
				"dlv_hm_to",
				"itm_typ",
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
				"dlv_grp_flg1",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_flg2",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_flg3",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_flg4",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_flg5",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_flg6",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_flg7",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_flg8",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_flg9",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_flg10",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
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
				$ship_rqst_dt_fr,
				$ship_rqst_hm_fr,
				$ship_rqst_dt_to,
				$ship_rqst_hm_to,
				$dlv_rqst_dt_fr,
				$dlv_rqst_hm_fr,
				$dlv_rqst_dt_to,
				$dlv_rqst_hm_to,
				$ship_schd_dt_fr,
				$ship_schd_hm_fr,
				$ship_schd_dt_to,
				$ship_schd_hm_to,
				$dlv_schd_dt_fr,
				$dlv_schd_hm_fr,
				$dlv_schd_dt_to,
				$dlv_schd_hm_to,
				$dlv_dt_fr,
				$dlv_hm_fr,
				$dlv_dt_to,
				$dlv_hm_to,
				$itm_typ,
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
				$dlv_grp_flg1,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_flg2,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_flg3,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_flg4,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_flg5,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_flg6,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_flg7,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_flg8,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_flg9,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_flg10,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
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
				{$sls_usr_cd, "usr_nm"},	// sls_usr_cd
				{$sls_dpt_cd, "dpt_nm"},	// sls_dpt_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$tdlv_cd, "bp_nm"},	// tdlv_cd
				{$cst_itm_cd, "bp_itm_nm"},	// cst_itm_cd
				{$ship_lg_grp_cd, "lg_grp_nm"},	// ship_lg_grp_cd
				{$str_ln_cd, "str_ln_nm"},	// str_ln_cd
				{$rqst_to_loc_cd, "loc_nm"},	// rqst_to_loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$rcpt_usr_cd, "usr_nm"},	// rcpt_usr_cd
				{$sls_rsn_cd, "biz_rsn_nm"},	// sls_rsn_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$proc_typ, "slo_proc_typ_nm"},	// proc_typ
				{$can_rsn_cd, "slo_rsn_nm"},	// can_rsn_cd
				{$slo_d_can_rsn_cd, "slo_rsn_nm"}	// slo_d_can_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sls_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true;true"},	// sls_dpt_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// cst_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV"},	// tdlv_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"},	// itm_p.itm_sub3
				{$ship_lg_grp_cd, "true"},	// ship_lg_grp_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.LG_WG_ALL"},	// loc_cd
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$rqst_to_loc_cd, "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// rqst_to_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;true;true"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sls_dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"},	// sls_dpt_cd
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$tdlv_cd, "bp_is_srch_typ"},	// tdlv_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$ship_lg_grp_cd, "loc_flg"},	// ship_lg_grp_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$rqst_to_loc_cd, "loc_is_srch_typ"},	// rqst_to_loc_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$ship_lg_grp_cd, "LG_GRP"},	// ship_lg_grp_cd
				{$ship_lg_grp_nm, "LG_GRP"},	// ship_lg_grp_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	 * Order received 注文受領済.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 0, $slo_flg);
	}

	/**
	 * Order received 注文受領済.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 0, $slo_flg, value);
	}


	/**
	 * Completed order promising 納期回答済.<p>
	 *
	 */
	public boolean prms_flg() {
		return getConstBoolean(offset + 1, $prms_flg);
	}

	/**
	 * Completed order promising 納期回答済.<p>
	 *
	 */
	public void prms_flg(boolean value) {
		setConstBoolean(offset + 1, $prms_flg, value);
	}


	/**
	 * Delivery order received 納入指示受領済.<p>
	 *
	 */
	public boolean dlv_inst_rcpt_flg() {
		return getConstBoolean(offset + 2, $dlv_inst_rcpt_flg);
	}

	/**
	 * Delivery order received 納入指示受領済.<p>
	 *
	 */
	public void dlv_inst_rcpt_flg(boolean value) {
		setConstBoolean(offset + 2, $dlv_inst_rcpt_flg, value);
	}


	/**
	 * Delivery order replied 納入指示回答済.<p>
	 *
	 */
	public boolean dlv_inst_prms_flg() {
		return getConstBoolean(offset + 3, $dlv_inst_prms_flg);
	}

	/**
	 * Delivery order replied 納入指示回答済.<p>
	 *
	 */
	public void dlv_inst_prms_flg(boolean value) {
		setConstBoolean(offset + 3, $dlv_inst_prms_flg, value);
	}


	/**
	 * Sold 売上済.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 4, $sls_flg);
	}

	/**
	 * Sold 売上済.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 4, $sls_flg, value);
	}


	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public boolean sls_ship_flg() {
		return getConstBoolean(offset + 5, $sls_ship_flg);
	}

	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public void sls_ship_flg(boolean value) {
		setConstBoolean(offset + 5, $sls_ship_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean sls_compl_flg() {
		return getConstBoolean(offset + 6, $sls_compl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void sls_compl_flg(boolean value) {
		setConstBoolean(offset + 6, $sls_compl_flg, value);
	}


	/**
	 * DTL,Details;HDR,Header;SHIP_SCHD,Shipping schedule DTL,明細;HDR,ヘッダ;SHIP_SCHD,出荷予定.<p>
	 *
	 */
	public String disp_unit() {
		return getConstString(offset + 7, $disp_unit);
	}

	/**
	 * DTL,Details;HDR,Header;SHIP_SCHD,Shipping schedule DTL,明細;HDR,ヘッダ;SHIP_SCHD,出荷予定.<p>
	 *
	 */
	public void disp_unit(String value) {
		setConstString(offset + 7, $disp_unit, value);
	}


	/**
	 * SRCH,Search;IMP,Input file SRCH,検索する;IMP,ファイル入力.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 8, $ope);
	}

	/**
	 * SRCH,Search;IMP,Input file SRCH,検索する;IMP,ファイル入力.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 8, $ope, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean aprv_open_flg() {
		return getConstBoolean(offset + 9, $aprv_open_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void aprv_open_flg(boolean value) {
		setConstBoolean(offset + 9, $aprv_open_flg, value);
	}


	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public boolean aprv_fix_flg() {
		return getConstBoolean(offset + 10, $aprv_fix_flg);
	}

	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public void aprv_fix_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_fix_flg, value);
	}


	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public boolean aprv_acpt_flg() {
		return getConstBoolean(offset + 11, $aprv_acpt_flg);
	}

	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public void aprv_acpt_flg(boolean value) {
		setConstBoolean(offset + 11, $aprv_acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean aprv_rjct_flg() {
		return getConstBoolean(offset + 12, $aprv_rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void aprv_rjct_flg(boolean value) {
		setConstBoolean(offset + 12, $aprv_rjct_flg, value);
	}


	/**
	 * Denied 否認.<p>
	 *
	 */
	public boolean aprv_last_rjct_flg() {
		return getConstBoolean(offset + 13, $aprv_last_rjct_flg);
	}

	/**
	 * Denied 否認.<p>
	 *
	 */
	public void aprv_last_rjct_flg(boolean value) {
		setConstBoolean(offset + 13, $aprv_last_rjct_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean aprv_invalid_flg() {
		return getConstBoolean(offset + 14, $aprv_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void aprv_invalid_flg(boolean value) {
		setConstBoolean(offset + 14, $aprv_invalid_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 15, $iv_trd_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 15, $iv_trd_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean iv_trd_invalid_flg() {
		return getConstBoolean(offset + 16, $iv_trd_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void iv_trd_invalid_flg(boolean value) {
		setConstBoolean(offset + 16, $iv_trd_invalid_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 17, $edi_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 17, $edi_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean edi_invalid_flg() {
		return getConstBoolean(offset + 18, $edi_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void edi_invalid_flg(boolean value) {
		setConstBoolean(offset + 18, $edi_invalid_flg, value);
	}


	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public boolean not_alloc_flg() {
		return getConstBoolean(offset + 19, $not_alloc_flg);
	}

	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public void not_alloc_flg(boolean value) {
		setConstBoolean(offset + 19, $not_alloc_flg, value);
	}


	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public boolean part_alloc_flg() {
		return getConstBoolean(offset + 20, $part_alloc_flg);
	}

	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public void part_alloc_flg(boolean value) {
		setConstBoolean(offset + 20, $part_alloc_flg, value);
	}


	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public boolean all_alloc_flg() {
		return getConstBoolean(offset + 21, $all_alloc_flg);
	}

	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public void all_alloc_flg(boolean value) {
		setConstBoolean(offset + 21, $all_alloc_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean alloc_invalid_flg() {
		return getConstBoolean(offset + 22, $alloc_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void alloc_invalid_flg(boolean value) {
		setConstBoolean(offset + 22, $alloc_invalid_flg, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 23, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 23, $not_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 24, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 24, $inst_flg, value);
	}


	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public boolean not_ship_flg() {
		return getConstBoolean(offset + 25, $not_ship_flg);
	}

	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public void not_ship_flg(boolean value) {
		setConstBoolean(offset + 25, $not_ship_flg, value);
	}


	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public boolean part_ship_flg() {
		return getConstBoolean(offset + 26, $part_ship_flg);
	}

	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public void part_ship_flg(boolean value) {
		setConstBoolean(offset + 26, $part_ship_flg, value);
	}


	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 27, $ship_flg);
	}

	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 27, $ship_flg, value);
	}


	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate slo_dt_fr() {
		return getConstDate(offset + 28, $slo_dt_fr);
	}

	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public void slo_dt_fr(MCDate value) {
		setConstDate(offset + 28, $slo_dt_fr, value);
	}


	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public MCDate slo_dt_to() {
		return getConstDate(offset + 29, $slo_dt_to);
	}

	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public void slo_dt_to(MCDate value) {
		setConstDate(offset + 29, $slo_dt_to, value);
	}


	/**
	 * Delivery order received date FROM 納入指示受領日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_inst_rcpt_dt_fr() {
		return getConstDate(offset + 30, $dlv_inst_rcpt_dt_fr);
	}

	/**
	 * Delivery order received date FROM 納入指示受領日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_inst_rcpt_dt_fr(MCDate value) {
		setConstDate(offset + 30, $dlv_inst_rcpt_dt_fr, value);
	}


	/**
	 * Delivery order received date TO 納入指示受領日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_inst_rcpt_dt_to() {
		return getConstDate(offset + 31, $dlv_inst_rcpt_dt_to);
	}

	/**
	 * Delivery order received date TO 納入指示受領日ＴＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_dt_to(MCDate value) {
		setConstDate(offset + 31, $dlv_inst_rcpt_dt_to, value);
	}


	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcpt_dt_fr() {
		return getConstDate(offset + 32, $rcpt_dt_fr);
	}

	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public void rcpt_dt_fr(MCDate value) {
		setConstDate(offset + 32, $rcpt_dt_fr, value);
	}


	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public MCDate rcpt_dt_to() {
		return getConstDate(offset + 33, $rcpt_dt_to);
	}

	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public void rcpt_dt_to(MCDate value) {
		setConstDate(offset + 33, $rcpt_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 34, $ship_rqst_dt_p);
	}
	
	public void ship_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 34, $ship_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 35, $dlv_rqst_dt_p);
	}
	
	public void dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 35, $dlv_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 36, $ship_schd_dt_p);
	}
	
	public void ship_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 36, $ship_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 37, $dlv_schd_dt_p);
	}
	
	public void dlv_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 37, $dlv_schd_dt_p, row);
	}


	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sls_schd_dt_fr() {
		return getConstDate(offset + 38, $sls_schd_dt_fr);
	}

	/**
	 * Scheduled sales date FROM 売上予定日ＦＲＯＭ.<p>
	 *
	 */
	public void sls_schd_dt_fr(MCDate value) {
		setConstDate(offset + 38, $sls_schd_dt_fr, value);
	}


	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public MCDate sls_schd_dt_to() {
		return getConstDate(offset + 39, $sls_schd_dt_to);
	}

	/**
	 * Scheduled sales date TO 売上予定日ＴＯ.<p>
	 *
	 */
	public void sls_schd_dt_to(MCDate value) {
		setConstDate(offset + 39, $sls_schd_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 40, $dlv_dt_p);
	}
	
	public void dlv_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 40, $dlv_dt_p, row);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 41, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 41, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 42, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 42, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 43, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 43, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 44, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 44, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 45, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 45, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 46, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 46, $wg_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 47, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 47, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 48, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 48, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 49, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 49, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 50, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 50, $dlv_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 51, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 51, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 52, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 52, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 53, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 53, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 54, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 54, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 55, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 55, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 56, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 56, $dest_nm3, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 57, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 57, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 58, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 58, $tdlv_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 59, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 59, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 60, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 60, $slo_d_no, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 61, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 61, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 62, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 62, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 62, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 62, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 62, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 62, $qtn_rev, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 63, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 63, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 64, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 64, $cst_po_d_no, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 65, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 65, $aprv_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 66, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 66, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 67, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 67, $trd_nm, value);
	}


	/**
	 * Desired shipping date delayed (Schedule) 出荷希望日遅れ（予定）.<p>
	 *
	 */
	public boolean ship_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 68, $ship_rqst_dt_overdue_flg);
	}

	/**
	 * Desired shipping date delayed (Schedule) 出荷希望日遅れ（予定）.<p>
	 *
	 */
	public void ship_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 68, $ship_rqst_dt_overdue_flg, value);
	}


	/**
	 * Desired delivery date delayed (Schedule) 納入希望日遅れ（予定）.<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 69, $dlv_rqst_dt_overdue_flg);
	}

	/**
	 * Desired delivery date delayed (Schedule) 納入希望日遅れ（予定）.<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 69, $dlv_rqst_dt_overdue_flg, value);
	}


	/**
	 * Delivery request date delayed (Schedule) 納品依頼日遅れ（予定）.<p>
	 *
	 */
	public boolean pd_inst_dlv_dt_overdue_flg() {
		return getConstBoolean(offset + 70, $pd_inst_dlv_dt_overdue_flg);
	}

	/**
	 * Delivery request date delayed (Schedule) 納品依頼日遅れ（予定）.<p>
	 *
	 */
	public void pd_inst_dlv_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 70, $pd_inst_dlv_dt_overdue_flg, value);
	}


	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_act_flg() {
		return getConstBoolean(offset + 71, $dlv_rqst_dt_overdue_act_flg);
	}

	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_act_flg(boolean value) {
		setConstBoolean(offset + 71, $dlv_rqst_dt_overdue_act_flg, value);
	}


	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_act_flg() {
		return getConstBoolean(offset + 72, $prms_dlv_dt_overdue_act_flg);
	}

	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public void prms_dlv_dt_overdue_act_flg(boolean value) {
		setConstBoolean(offset + 72, $prms_dlv_dt_overdue_act_flg, value);
	}


	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public MCNumber ship_pr_fr() {
		return getConstNumber(offset + 73, $ship_pr_fr);
	}

	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public void ship_pr_fr(MCNumber value) {
		setConstNumber(offset + 73, $ship_pr_fr, value);
	}

	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public void ship_pr_fr(int value) {
		setConstNumber(offset + 73, $ship_pr_fr, value);
	}

	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public void ship_pr_fr(long value) {
		setConstNumber(offset + 73, $ship_pr_fr, value);
	}

	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public void ship_pr_fr(float value) {
		setConstNumber(offset + 73, $ship_pr_fr, value);
	}

	/**
	 * Shipping progress (Equal or more) 出荷進捗率（以上）.<p>
	 *
	 */
	public void ship_pr_fr(double value) {
		setConstNumber(offset + 73, $ship_pr_fr, value);
	}


	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public MCNumber ship_pr_to() {
		return getConstNumber(offset + 74, $ship_pr_to);
	}

	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public void ship_pr_to(MCNumber value) {
		setConstNumber(offset + 74, $ship_pr_to, value);
	}

	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public void ship_pr_to(int value) {
		setConstNumber(offset + 74, $ship_pr_to, value);
	}

	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public void ship_pr_to(long value) {
		setConstNumber(offset + 74, $ship_pr_to, value);
	}

	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public void ship_pr_to(float value) {
		setConstNumber(offset + 74, $ship_pr_to, value);
	}

	/**
	 * Shipping progress (Equal or less) 出荷進捗率（以下）.<p>
	 *
	 */
	public void ship_pr_to(double value) {
		setConstNumber(offset + 74, $ship_pr_to, value);
	}


	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public MCNumber sls_pr_fr() {
		return getConstNumber(offset + 75, $sls_pr_fr);
	}

	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public void sls_pr_fr(MCNumber value) {
		setConstNumber(offset + 75, $sls_pr_fr, value);
	}

	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public void sls_pr_fr(int value) {
		setConstNumber(offset + 75, $sls_pr_fr, value);
	}

	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public void sls_pr_fr(long value) {
		setConstNumber(offset + 75, $sls_pr_fr, value);
	}

	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public void sls_pr_fr(float value) {
		setConstNumber(offset + 75, $sls_pr_fr, value);
	}

	/**
	 * Sales progress (Equal or more) 売上進捗率（以上）.<p>
	 *
	 */
	public void sls_pr_fr(double value) {
		setConstNumber(offset + 75, $sls_pr_fr, value);
	}


	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public MCNumber sls_pr_to() {
		return getConstNumber(offset + 76, $sls_pr_to);
	}

	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public void sls_pr_to(MCNumber value) {
		setConstNumber(offset + 76, $sls_pr_to, value);
	}

	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public void sls_pr_to(int value) {
		setConstNumber(offset + 76, $sls_pr_to, value);
	}

	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public void sls_pr_to(long value) {
		setConstNumber(offset + 76, $sls_pr_to, value);
	}

	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public void sls_pr_to(float value) {
		setConstNumber(offset + 76, $sls_pr_to, value);
	}

	/**
	 * Sales progress (Equal or less) 売上進捗率（以下）.<p>
	 *
	 */
	public void sls_pr_to(double value) {
		setConstNumber(offset + 76, $sls_pr_to, value);
	}


	/**
	 * Display delay expectation qty. 遅れ見込数量表示.<p>
	 *
	 */
	public boolean overdue_prspct_disp_flg() {
		return getConstBoolean(offset + 77, $overdue_prspct_disp_flg);
	}

	/**
	 * Display delay expectation qty. 遅れ見込数量表示.<p>
	 *
	 */
	public void overdue_prspct_disp_flg(boolean value) {
		setConstBoolean(offset + 77, $overdue_prspct_disp_flg, value);
	}


	/**
	 * Delay expectation qty. only 遅れ見込数量ありのみ.<p>
	 *
	 */
	public boolean overdue_prspct_only_flg() {
		return getConstBoolean(offset + 78, $overdue_prspct_only_flg);
	}

	/**
	 * Delay expectation qty. only 遅れ見込数量ありのみ.<p>
	 *
	 */
	public void overdue_prspct_only_flg(boolean value) {
		setConstBoolean(offset + 78, $overdue_prspct_only_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 79, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 79, $itm_typ_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 80, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 80, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 81, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 81, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 82, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 82, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 83, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 83, $ver_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 84, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 84, $sno_p, row);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 85, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 85, $ship_block_flg, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 86, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 86, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 87, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 87, $alloc_grp_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 88, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 88, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 89, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 89, $ship_lg_grp_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 90, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 90, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 91, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 91, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 92, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 92, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 93, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 93, $str_ln_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 94, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 94, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 95, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 95, $sublot_no, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 96, $rqst_to_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 96, $rqst_to_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_to_loc_nm() {
		return getConstString(offset + 97, $rqst_to_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_to_loc_nm(String value) {
		setConstString(offset + 97, $rqst_to_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 98, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 98, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 99, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 99, $sppl_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 100, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 100, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 101, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 101, $trd_cur_nm, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 102, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 102, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 103, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 103, $rcpt_usr_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 104, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 104, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 105, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 105, $gd_nm, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 106, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 106, $sls_rsn_cd, value);
	}


	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public String sls_rsn_nm() {
		return getConstString(offset + 107, $sls_rsn_nm);
	}

	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public void sls_rsn_nm(String value) {
		setConstString(offset + 107, $sls_rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 108, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 108, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 109, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 109, $bd_dpt_nm, value);
	}


	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 110, $slo_typ);
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 110, $slo_typ, value);
	}


	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public String slo_typ_nm() {
		return getConstString(offset + 111, $slo_typ_nm);
	}

	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public void slo_typ_nm(String value) {
		setConstString(offset + 111, $slo_typ_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 112, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 112, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 113, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 113, $sls_basis_typ_nm, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 114, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 114, $ship_inst_typ, value);
	}


	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public String ship_inst_typ_nm() {
		return getConstString(offset + 115, $ship_inst_typ_nm);
	}

	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public void ship_inst_typ_nm(String value) {
		setConstString(offset + 115, $ship_inst_typ_nm, value);
	}


	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 116, $proc_typ);
	}

	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 116, $proc_typ, value);
	}


	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public String proc_typ_nm() {
		return getConstString(offset + 117, $proc_typ_nm);
	}

	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public void proc_typ_nm(String value) {
		setConstString(offset + 117, $proc_typ_nm, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 118, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 118, $alloc_typ, value);
	}


	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public String alloc_typ_nm() {
		return getConstString(offset + 119, $alloc_typ_nm);
	}

	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public void alloc_typ_nm(String value) {
		setConstString(offset + 119, $alloc_typ_nm, value);
	}


	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return getConstString(offset + 120, $cst_po_rmrks);
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		setConstString(offset + 120, $cst_po_rmrks, value);
	}


	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public String cst_po_d_rmrks() {
		return getConstString(offset + 121, $cst_po_d_rmrks);
	}

	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public void cst_po_d_rmrks(String value) {
		setConstString(offset + 121, $cst_po_d_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 122, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 122, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 123, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 123, $trd_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 124, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 124, $intr_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String slo_d_intr_rmrks() {
		return getConstString(offset + 125, $slo_d_intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void slo_d_intr_rmrks(String value) {
		setConstString(offset + 125, $slo_d_intr_rmrks, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 126, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 126, $can_rsn_cd, value);
	}


	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return getConstString(offset + 127, $can_rsn_nm);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		setConstString(offset + 127, $can_rsn_nm, value);
	}


	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public String slo_d_can_rsn_cd() {
		return getConstString(offset + 128, $slo_d_can_rsn_cd);
	}

	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public void slo_d_can_rsn_cd(String value) {
		setConstString(offset + 128, $slo_d_can_rsn_cd, value);
	}


	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public String slo_d_can_rsn_nm() {
		return getConstString(offset + 129, $slo_d_can_rsn_nm);
	}

	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public void slo_d_can_rsn_nm(String value) {
		setConstString(offset + 129, $slo_d_can_rsn_nm, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 130, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 130, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 131, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 131, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 132, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 132, $sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String slo_d_sub_char1() {
		return getConstString(offset + 133, $slo_d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void slo_d_sub_char1(String value) {
		setConstString(offset + 133, $slo_d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String slo_d_sub_char2() {
		return getConstString(offset + 134, $slo_d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void slo_d_sub_char2(String value) {
		setConstString(offset + 134, $slo_d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String slo_d_sub_char3() {
		return getConstString(offset + 135, $slo_d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void slo_d_sub_char3(String value) {
		setConstString(offset + 135, $slo_d_sub_char3, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 136, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 136, $inc_can_flg, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean inc_abort_flg() {
		return getConstBoolean(offset + 137, $inc_abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void inc_abort_flg(boolean value) {
		setConstBoolean(offset + 137, $inc_abort_flg, value);
	}


	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public boolean inc_past_flg() {
		return getConstBoolean(offset + 138, $inc_past_flg);
	}

	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public void inc_past_flg(boolean value) {
		setConstBoolean(offset + 138, $inc_past_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 139, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 139, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 140, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 140, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 141, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 141, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			return slo_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			return proc_typ_nm();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			return slo_d_intr_rmrks();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_cd();
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_nm();
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
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			return ship_pr_fr();
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			return ship_pr_to();
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			return sls_pr_fr();
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			return sls_pr_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			return slo_dt_fr();
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			return slo_dt_to();
		}
		if ($dlv_inst_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt_fr();
		}
		if ($dlv_inst_rcpt_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt_to();
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			return rcpt_dt_fr();
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			return rcpt_dt_to();
		}
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			return sls_schd_dt_fr();
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			return sls_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($dlv_inst_prms_flg.equalsIgnoreCase(name)) {
			return dlv_inst_prms_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_ship_flg.equalsIgnoreCase(name)) {
			return sls_ship_flg();
		}
		if ($sls_compl_flg.equalsIgnoreCase(name)) {
			return sls_compl_flg();
		}
		if ($aprv_open_flg.equalsIgnoreCase(name)) {
			return aprv_open_flg();
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			return aprv_fix_flg();
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			return aprv_acpt_flg();
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_rjct_flg();
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_last_rjct_flg();
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			return aprv_invalid_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($iv_trd_invalid_flg.equalsIgnoreCase(name)) {
			return iv_trd_invalid_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			return edi_invalid_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			return part_alloc_flg();
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			return all_alloc_flg();
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			return alloc_invalid_flg();
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			return not_ship_flg();
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			return part_ship_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		if ($ship_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return ship_rqst_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($pd_inst_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_act_flg();
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_act_flg();
		}
		if ($overdue_prspct_disp_flg.equalsIgnoreCase(name)) {
			return overdue_prspct_disp_flg();
		}
		if ($overdue_prspct_only_flg.equalsIgnoreCase(name)) {
			return overdue_prspct_only_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_abort_flg.equalsIgnoreCase(name)) {
			return inc_abort_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			return slo_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			return proc_typ_nm();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			return slo_d_intr_rmrks();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_cd();
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_nm();
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
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			return ship_pr_fr();
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			return ship_pr_to();
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			return sls_pr_fr();
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			return sls_pr_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			return slo_dt_fr();
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			return slo_dt_to();
		}
		if ($dlv_inst_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt_fr();
		}
		if ($dlv_inst_rcpt_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt_to();
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			return rcpt_dt_fr();
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			return rcpt_dt_to();
		}
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			return sls_schd_dt_fr();
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			return sls_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($dlv_inst_prms_flg.equalsIgnoreCase(name)) {
			return dlv_inst_prms_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($sls_ship_flg.equalsIgnoreCase(name)) {
			return sls_ship_flg();
		}
		if ($sls_compl_flg.equalsIgnoreCase(name)) {
			return sls_compl_flg();
		}
		if ($aprv_open_flg.equalsIgnoreCase(name)) {
			return aprv_open_flg();
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			return aprv_fix_flg();
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			return aprv_acpt_flg();
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_rjct_flg();
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			return aprv_last_rjct_flg();
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			return aprv_invalid_flg();
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($iv_trd_invalid_flg.equalsIgnoreCase(name)) {
			return iv_trd_invalid_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($edi_invalid_flg.equalsIgnoreCase(name)) {
			return edi_invalid_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			return part_alloc_flg();
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			return all_alloc_flg();
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			return alloc_invalid_flg();
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			return not_ship_flg();
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			return part_ship_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		if ($ship_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return ship_rqst_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($pd_inst_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_act_flg();
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_act_flg();
		}
		if ($overdue_prspct_disp_flg.equalsIgnoreCase(name)) {
			return overdue_prspct_disp_flg();
		}
		if ($overdue_prspct_only_flg.equalsIgnoreCase(name)) {
			return overdue_prspct_only_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_abort_flg.equalsIgnoreCase(name)) {
			return inc_abort_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			slo_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			proc_typ_nm(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			slo_d_intr_rmrks(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			slo_d_can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			slo_d_can_rsn_nm(value);
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
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			slo_dt_fr(value);
			return;
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			slo_dt_to(value);
			return;
		}
		if ($dlv_inst_rcpt_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt_fr(value);
			return;
		}
		if ($dlv_inst_rcpt_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt_to(value);
			return;
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			rcpt_dt_fr(value);
			return;
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			rcpt_dt_to(value);
			return;
		}
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			sls_schd_dt_fr(value);
			return;
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			sls_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($dlv_inst_prms_flg.equalsIgnoreCase(name)) {
			dlv_inst_prms_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_ship_flg.equalsIgnoreCase(name)) {
			sls_ship_flg(value);
			return;
		}
		if ($sls_compl_flg.equalsIgnoreCase(name)) {
			sls_compl_flg(value);
			return;
		}
		if ($aprv_open_flg.equalsIgnoreCase(name)) {
			aprv_open_flg(value);
			return;
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			aprv_fix_flg(value);
			return;
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			aprv_acpt_flg(value);
			return;
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			aprv_rjct_flg(value);
			return;
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			aprv_last_rjct_flg(value);
			return;
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			aprv_invalid_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($iv_trd_invalid_flg.equalsIgnoreCase(name)) {
			iv_trd_invalid_flg(value);
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
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			part_alloc_flg(value);
			return;
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			all_alloc_flg(value);
			return;
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			alloc_invalid_flg(value);
			return;
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			not_ship_flg(value);
			return;
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			part_ship_flg(value);
			return;
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			ship_flg(value);
			return;
		}
		if ($ship_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			ship_rqst_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($pd_inst_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_act_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_act_flg(value);
			return;
		}
		if ($overdue_prspct_disp_flg.equalsIgnoreCase(name)) {
			overdue_prspct_disp_flg(value);
			return;
		}
		if ($overdue_prspct_only_flg.equalsIgnoreCase(name)) {
			overdue_prspct_only_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_abort_flg.equalsIgnoreCase(name)) {
			inc_abort_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			slo_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			proc_typ_nm(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			slo_d_intr_rmrks(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			slo_d_can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			slo_d_can_rsn_nm(value);
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
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($ship_pr_fr.equalsIgnoreCase(name)) {
			ship_pr_fr(value);
			return;
		}
		if ($ship_pr_to.equalsIgnoreCase(name)) {
			ship_pr_to(value);
			return;
		}
		if ($sls_pr_fr.equalsIgnoreCase(name)) {
			sls_pr_fr(value);
			return;
		}
		if ($sls_pr_to.equalsIgnoreCase(name)) {
			sls_pr_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_dt_fr.equalsIgnoreCase(name)) {
			slo_dt_fr(value);
			return;
		}
		if ($slo_dt_to.equalsIgnoreCase(name)) {
			slo_dt_to(value);
			return;
		}
		if ($dlv_inst_rcpt_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt_fr(value);
			return;
		}
		if ($dlv_inst_rcpt_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt_to(value);
			return;
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			rcpt_dt_fr(value);
			return;
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			rcpt_dt_to(value);
			return;
		}
		if ($sls_schd_dt_fr.equalsIgnoreCase(name)) {
			sls_schd_dt_fr(value);
			return;
		}
		if ($sls_schd_dt_to.equalsIgnoreCase(name)) {
			sls_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($dlv_inst_prms_flg.equalsIgnoreCase(name)) {
			dlv_inst_prms_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($sls_ship_flg.equalsIgnoreCase(name)) {
			sls_ship_flg(value);
			return;
		}
		if ($sls_compl_flg.equalsIgnoreCase(name)) {
			sls_compl_flg(value);
			return;
		}
		if ($aprv_open_flg.equalsIgnoreCase(name)) {
			aprv_open_flg(value);
			return;
		}
		if ($aprv_fix_flg.equalsIgnoreCase(name)) {
			aprv_fix_flg(value);
			return;
		}
		if ($aprv_acpt_flg.equalsIgnoreCase(name)) {
			aprv_acpt_flg(value);
			return;
		}
		if ($aprv_rjct_flg.equalsIgnoreCase(name)) {
			aprv_rjct_flg(value);
			return;
		}
		if ($aprv_last_rjct_flg.equalsIgnoreCase(name)) {
			aprv_last_rjct_flg(value);
			return;
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			aprv_invalid_flg(value);
			return;
		}
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($iv_trd_invalid_flg.equalsIgnoreCase(name)) {
			iv_trd_invalid_flg(value);
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
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			part_alloc_flg(value);
			return;
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			all_alloc_flg(value);
			return;
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			alloc_invalid_flg(value);
			return;
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			not_ship_flg(value);
			return;
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			part_ship_flg(value);
			return;
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			ship_flg(value);
			return;
		}
		if ($ship_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			ship_rqst_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($pd_inst_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_act_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_act_flg(value);
			return;
		}
		if ($overdue_prspct_disp_flg.equalsIgnoreCase(name)) {
			overdue_prspct_disp_flg(value);
			return;
		}
		if ($overdue_prspct_only_flg.equalsIgnoreCase(name)) {
			overdue_prspct_only_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_abort_flg.equalsIgnoreCase(name)) {
			inc_abort_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_rqst_dt_p.equalsIgnoreCase(name)) {
			return ship_rqst_dt_p();
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_p();
		}
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			return ship_schd_dt_p();
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			return dlv_schd_dt_p();
		}
		if ($dlv_dt_p.equalsIgnoreCase(name)) {
			return dlv_dt_p();
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
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_rqst_dt_p.equalsIgnoreCase(name)) {
			ship_rqst_dt_p(
				((MCContainerMeta) ship_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_p(
				((MCContainerMeta) dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			ship_schd_dt_p(
				((MCContainerMeta) ship_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_schd_dt_p.equalsIgnoreCase(name)) {
			dlv_schd_dt_p(
				((MCContainerMeta) dlv_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_dt_p.equalsIgnoreCase(name)) {
			dlv_dt_p(
				((MCContainerMeta) dlv_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Desired shipping date FROM 出荷希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_rqst_dt_fr() {
		return ship_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired shipping date FROM 出荷希望日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_rqst_dt_fr(MCDate value) {
		ship_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired shipping time FROM 出荷希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_rqst_hm_fr() {
		return ship_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired shipping time FROM 出荷希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_rqst_hm_fr(MCDate value) {
		ship_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired shipping date TO 出荷希望日ＴＯ.<p>
	 *
	 */
	public MCDate ship_rqst_dt_to() {
		return ship_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired shipping date TO 出荷希望日ＴＯ.<p>
	 *
	 */
	public void ship_rqst_dt_to(MCDate value) {
		ship_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired shipping time TO 出荷希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_rqst_hm_to() {
		return ship_rqst_dt_p().hm_to();
	}

	/**
	 * Desired shipping time TO 出荷希望時刻ＴＯ.<p>
	 *
	 */
	public void ship_rqst_hm_to(MCDate value) {
		ship_rqst_dt_p().hm_to(value);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return dlv_rqst_dt_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		dlv_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return dlv_rqst_dt_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		dlv_rqst_dt_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return dlv_rqst_dt_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		dlv_rqst_dt_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return dlv_rqst_dt_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		dlv_rqst_dt_p().hm_to(value);
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_dt_fr() {
		return ship_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_dt_fr(MCDate value) {
		ship_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_hm_fr() {
		return ship_schd_dt_p().hm_fr();
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_hm_fr(MCDate value) {
		ship_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_dt_to() {
		return ship_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public void ship_schd_dt_to(MCDate value) {
		ship_schd_dt_p().ymd_to(value);
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_hm_to() {
		return ship_schd_dt_p().hm_to();
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public void ship_schd_hm_to(MCDate value) {
		ship_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled delivery date FROM 納品予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_schd_dt_fr() {
		return dlv_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled delivery date FROM 納品予定日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_schd_dt_fr(MCDate value) {
		dlv_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Scheduled delivery time FROM 納品予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_schd_hm_fr() {
		return dlv_schd_dt_p().hm_fr();
	}

	/**
	 * Scheduled delivery time FROM 納品予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_schd_hm_fr(MCDate value) {
		dlv_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled delivery date TO 納品予定日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_schd_dt_to() {
		return dlv_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled delivery date TO 納品予定日ＴＯ.<p>
	 *
	 */
	public void dlv_schd_dt_to(MCDate value) {
		dlv_schd_dt_p().ymd_to(value);
	}

	/**
	 * Scheduled delivery time TO 納品予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_schd_hm_to() {
		return dlv_schd_dt_p().hm_to();
	}

	/**
	 * Scheduled delivery time TO 納品予定時刻ＴＯ.<p>
	 *
	 */
	public void dlv_schd_hm_to(MCDate value) {
		dlv_schd_dt_p().hm_to(value);
	}

	/**
	 * Delivery date FROM 納品日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_dt_fr() {
		return dlv_dt_p().ymd_fr();
	}

	/**
	 * Delivery date FROM 納品日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_dt_fr(MCDate value) {
		dlv_dt_p().ymd_fr(value);
	}

	/**
	 * Delivery time FROM 納品時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_hm_fr() {
		return dlv_dt_p().hm_fr();
	}

	/**
	 * Delivery time FROM 納品時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_hm_fr(MCDate value) {
		dlv_dt_p().hm_fr(value);
	}

	/**
	 * Delivery date TO 納品日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_dt_to() {
		return dlv_dt_p().ymd_to();
	}

	/**
	 * Delivery date TO 納品日ＴＯ.<p>
	 *
	 */
	public void dlv_dt_to(MCDate value) {
		dlv_dt_p().ymd_to(value);
	}

	/**
	 * Delivery time TO 納品時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_hm_to() {
		return dlv_dt_p().hm_to();
	}

	/**
	 * Delivery time TO 納品時刻ＴＯ.<p>
	 *
	 */
	public void dlv_hm_to(MCDate value) {
		dlv_dt_p().hm_to(value);
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

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
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return dlv_grp_p().bp_grp_flg1();
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		dlv_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return dlv_grp_p().bp_grp_flg2();
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		dlv_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return dlv_grp_p().bp_grp_flg3();
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		dlv_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return dlv_grp_p().bp_grp_flg4();
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		dlv_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return dlv_grp_p().bp_grp_flg5();
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		dlv_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return dlv_grp_p().bp_grp_flg6();
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		dlv_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return dlv_grp_p().bp_grp_flg7();
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		dlv_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return dlv_grp_p().bp_grp_flg8();
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		dlv_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return dlv_grp_p().bp_grp_flg9();
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		dlv_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return dlv_grp_p().bp_grp_flg10();
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		dlv_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
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

