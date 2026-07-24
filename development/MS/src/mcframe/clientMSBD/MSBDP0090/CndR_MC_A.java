package mcframe.clientMSBD.MSBDP0090;

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
	 * INS,Create,0;BNDL,Consolidate,4;DEL,Cancel,2;REF,View,3;PRNT,Issue report,5;SEND,Export after approval,6;RE_SEND,Re-export,7; INS,登録する,0;BNDL,まとめる,4;DEL,取り消す,2;REF,参照する,3;PRNT,帳票発行,5;SEND,承認後送信,6;RE_SEND,再送信する,7;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Dtl,Details;Hdr,Header Dtl,明細;Hdr,ヘッダ.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_dlv_prnt_flg = "not_dlv_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_purc_ddlv_dlv_prnt_flg = "not_purc_ddlv_dlv_prnt_flg";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_prnt_flg = "purc_ddlv_dlv_prnt_flg";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $opn_flg = "opn_flg";
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public static final String $acpt_flg = "acpt_flg";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $rjct_flg = "rjct_flg";
	/**
	 * Denied 否認.<p>
	 *
	 */
	public static final String $last_rjct_flg = "last_rjct_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $aprv_invalid_flg = "aprv_invalid_flg";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $not_po_prnt_flg = "not_po_prnt_flg";
	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public static final String $po_prnt_flg = "po_prnt_flg";
	/**
	 * Normal item 通常品.<p>
	 *
	 */
	public static final String $not_sundry_itm_flg = "not_sundry_itm_flg";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $iv_trgt_flg = "iv_trgt_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $iv_not_trgt_flg = "iv_not_trgt_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_edi_flg = "not_edi_flg";
	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public static final String $not_arr_flg = "not_arr_flg";
	/**
	 * Partial receipt 一部入荷.<p>
	 *
	 */
	public static final String $part_arr_flg = "part_arr_flg";
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public static final String $arr_compl_flg = "arr_compl_flg";
	/**
	 * Not purchased 未仕入.<p>
	 *
	 */
	public static final String $not_purc_flg = "not_purc_flg";
	/**
	 * Partial purchase 一部仕入.<p>
	 *
	 */
	public static final String $part_purc_flg = "part_purc_flg";
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public static final String $purc_compl_flg = "purc_compl_flg";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $purc_if_tgt_flg = "purc_if_tgt_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $not_purc_if_tgt_flg = "not_purc_if_tgt_flg";
	public static final String $dlv_rqst_dt_frto_p = "dlv_rqst_dt_frto_p";
	public static final String $rqst_dlv_rqst_dt_frto_p = "rqst_dlv_rqst_dt_frto_p";
	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_schd_dt_fr = "po_schd_dt_fr";
	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public static final String $po_schd_dt_to = "po_schd_dt_to";
	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_dt_fr = "po_dt_fr";
	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public static final String $po_dt_to = "po_dt_to";
	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public static final String $po_conf_rcpt_flg = "po_conf_rcpt_flg";
	/**
	 * Confirmation received date FROM 請書受領日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $po_conf_rcpt_dt_fr = "po_conf_rcpt_dt_fr";
	/**
	 * Confirmation received date TO 請書受領日ＴＯ.<p>
	 *
	 */
	public static final String $po_conf_rcpt_dt_to = "po_conf_rcpt_dt_to";
	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_inst_dt_fr = "dlv_inst_dt_fr";
	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public static final String $dlv_inst_dt_to = "dlv_inst_dt_to";
	public static final String $arr_dt_frto_p = "arr_dt_frto_p";
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public static final String $purc_sts_typ = "purc_sts_typ";
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public static final String $purc_sts_typ_nm = "purc_sts_typ_nm";
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
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $in_to_loc_wg_nm = "in_to_loc_wg_nm";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
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
	public static final String $ver_no_p = "ver_no_p";
	public static final String $sno_p = "sno_p";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public static final String $drct_dlv_typ_nm = "drct_dlv_typ_nm";
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
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_usr_cd = "rqst_fr_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_fr_usr_nm = "rqst_fr_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_cd = "rqst_fr_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_nm = "rqst_fr_dpt_nm";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
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
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
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
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
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
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public static final String $ext_po_no = "ext_po_no";
	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_po_d_no = "ext_po_d_no";
	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public static final String $pr_arr_fr = "pr_arr_fr";
	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public static final String $pr_arr_to = "pr_arr_to";
	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public static final String $pr_purc_fr = "pr_purc_fr";
	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public static final String $pr_purc_to = "pr_purc_to";
	/**
	 * Replied delivery date delayed 回答納入日遅れ.<p>
	 *
	 */
	public static final String $prms_dlv_dt_overdue_flg = "prms_dlv_dt_overdue_flg";
	/**
	 * Desired delivery date delayed 納入希望日遅れ.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_flg = "dlv_rqst_dt_overdue_flg";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $incl_can_flg = "incl_can_flg";
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public static final String $inc_past_flg = "inc_past_flg";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $incl_abort_flg = "incl_abort_flg";
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public static final String $po_cnt_rmrks = "po_cnt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public static final String $dlv_slip_rmrks = "dlv_slip_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $dtl_intr_rmrks = "dtl_intr_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $dtl_trd_d_rmrks = "dtl_trd_d_rmrks";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
	/**
	 * PO schedule spare 1 発注予定予備１.<p>
	 *
	 */
	public static final String $po_schd_sub_char1 = "po_schd_sub_char1";
	/**
	 * PO schedule spare 2 発注予定予備２.<p>
	 *
	 */
	public static final String $po_schd_sub_char2 = "po_schd_sub_char2";
	/**
	 * PO schedule spare 3 発注予定予備３.<p>
	 *
	 */
	public static final String $po_schd_sub_char3 = "po_schd_sub_char3";
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
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	public static final String $bp_grp_p = "bp_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
	/**
	 * Update 更新.<p>
	 *
	 */
	public static final String $upd_flg = "upd_flg";

	public static final String $dlv_rqst_dt_fr = $dlv_rqst_dt_frto_p + ".ymd_fr";
	public static final String $dlv_rqst_hm_fr = $dlv_rqst_dt_frto_p + ".hm_fr";
	public static final String $dlv_rqst_dt_to = $dlv_rqst_dt_frto_p + ".ymd_to";
	public static final String $dlv_rqst_hm_to = $dlv_rqst_dt_frto_p + ".hm_to";
	public static final String $rqst_dlv_rqst_dt_fr = $rqst_dlv_rqst_dt_frto_p + ".ymd_fr";
	public static final String $rqst_dlv_rqst_hm_fr = $rqst_dlv_rqst_dt_frto_p + ".hm_fr";
	public static final String $rqst_dlv_rqst_dt_to = $rqst_dlv_rqst_dt_frto_p + ".ymd_to";
	public static final String $rqst_dlv_rqst_hm_to = $rqst_dlv_rqst_dt_frto_p + ".hm_to";
	public static final String $arr_dt_fr = $arr_dt_frto_p + ".ymd_fr";
	public static final String $arr_hm_fr = $arr_dt_frto_p + ".hm_fr";
	public static final String $arr_dt_to = $arr_dt_frto_p + ".ymd_to";
	public static final String $arr_hm_to = $arr_dt_frto_p + ".hm_to";
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
	public static final String $bp_grp_lab1 = $bp_grp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta disp_unit_META = createStringMeta($disp_unit);
	public static final MCMeta not_dlv_prnt_flg_META = createCommonMeta($not_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_purc_ddlv_dlv_prnt_flg_META = createCommonMeta($not_purc_ddlv_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_prnt_flg_META = createCommonMeta($purc_ddlv_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta opn_flg_META = createCommonMeta($opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acpt_flg_META = createCommonMeta($acpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rjct_flg_META = createCommonMeta($rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_rjct_flg_META = createCommonMeta($last_rjct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_invalid_flg_META = createCommonMeta($aprv_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_po_prnt_flg_META = createCommonMeta($not_po_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_prnt_flg_META = createCommonMeta($po_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sundry_itm_flg_META = createCommonMeta($not_sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trgt_flg_META = createCommonMeta($iv_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_not_trgt_flg_META = createCommonMeta($iv_not_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_edi_flg_META = createCommonMeta($not_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_arr_flg_META = createCommonMeta($not_arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_arr_flg_META = createCommonMeta($part_arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_compl_flg_META = createCommonMeta($arr_compl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_purc_flg_META = createCommonMeta($not_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_purc_flg_META = createCommonMeta($part_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_compl_flg_META = createCommonMeta($purc_compl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_if_tgt_flg_META = createCommonMeta($purc_if_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_purc_if_tgt_flg_META = createCommonMeta($not_purc_if_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_frto_p_META = createInnerRowMeta($dlv_rqst_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta rqst_dlv_rqst_dt_frto_p_META = createInnerRowMeta($rqst_dlv_rqst_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta po_schd_dt_fr_META = createCommonMeta($po_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_to_META = createCommonMeta($po_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_dt_fr_META = createCommonMeta($po_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_dt_to_META = createCommonMeta($po_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_conf_rcpt_flg_META = createCommonMeta($po_conf_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_conf_rcpt_dt_fr_META = createCommonMeta($po_conf_rcpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_conf_rcpt_dt_to_META = createCommonMeta($po_conf_rcpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_fr_META = createCommonMeta($dlv_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_to_META = createCommonMeta($dlv_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_dt_frto_p_META = createInnerRowMeta($arr_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta purc_sts_typ_nm_META = createCommonMeta($purc_sts_typ_nm, mcframe.commonMS.meta.MS_META.PURC_STS_TYP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta in_to_loc_wg_nm_META = createCommonMeta($in_to_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_po_no_META = createCommonMeta($ext_po_no, mcframe.commonMA.meta.MA_META.EXT_PO_NO);
	public static final MCMeta ext_po_d_no_META = createCommonMeta($ext_po_d_no, mcframe.commonMA.meta.MA_META.EXT_PO_D_NO);
	public static final MCMeta pr_arr_fr_META = createCommonMeta($pr_arr_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_arr_to_META = createCommonMeta($pr_arr_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_purc_fr_META = createCommonMeta($pr_purc_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_purc_to_META = createCommonMeta($pr_purc_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta prms_dlv_dt_overdue_flg_META = createCommonMeta($prms_dlv_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_overdue_flg_META = createCommonMeta($dlv_rqst_dt_overdue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta incl_can_flg_META = createCommonMeta($incl_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_past_flg_META = createCommonMeta($inc_past_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta incl_abort_flg_META = createCommonMeta($incl_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_cnt_rmrks_META = createCommonMeta($po_cnt_rmrks, mcframe.commonMS.meta.MS_META.PO_CNT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PO_INTR_RMRKS);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta dlv_slip_rmrks_META = createCommonMeta($dlv_slip_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.PO_D_INTR_RMRKS);
	public static final MCMeta dtl_trd_d_rmrks_META = createCommonMeta($dtl_trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_schd_sub_char1_META = createCommonMeta($po_schd_sub_char1, mcframe.commonMS.meta.MS_META.PO_SCHD_SUB_CHAR1);
	public static final MCMeta po_schd_sub_char2_META = createCommonMeta($po_schd_sub_char2, mcframe.commonMS.meta.MS_META.PO_SCHD_SUB_CHAR2);
	public static final MCMeta po_schd_sub_char3_META = createCommonMeta($po_schd_sub_char3, mcframe.commonMS.meta.MS_META.PO_SCHD_SUB_CHAR3);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR3);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta upd_flg_META = createCommonMeta($upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			disp_unit_META,
			not_dlv_prnt_flg_META,
			dlv_prnt_flg_META,
			not_purc_ddlv_dlv_prnt_flg_META,
			purc_ddlv_dlv_prnt_flg_META,
			opn_flg_META,
			fix_flg_META,
			acpt_flg_META,
			rjct_flg_META,
			last_rjct_flg_META,
			aprv_invalid_flg_META,
			not_po_prnt_flg_META,
			po_prnt_flg_META,
			not_sundry_itm_flg_META,
			sundry_itm_flg_META,
			iv_trgt_flg_META,
			iv_not_trgt_flg_META,
			edi_flg_META,
			not_edi_flg_META,
			not_arr_flg_META,
			part_arr_flg_META,
			arr_compl_flg_META,
			not_purc_flg_META,
			part_purc_flg_META,
			purc_compl_flg_META,
			purc_if_tgt_flg_META,
			not_purc_if_tgt_flg_META,
			dlv_rqst_dt_frto_p_META,
			rqst_dlv_rqst_dt_frto_p_META,
			po_schd_dt_fr_META,
			po_schd_dt_to_META,
			po_dt_fr_META,
			po_dt_to_META,
			po_conf_rcpt_flg_META,
			po_conf_rcpt_dt_fr_META,
			po_conf_rcpt_dt_to_META,
			dlv_inst_dt_fr_META,
			dlv_inst_dt_to_META,
			arr_dt_frto_p_META,
			purc_sts_typ_META,
			purc_sts_typ_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			bp_lot_no_META,
			site_cd_META,
			site_nm_META,
			in_to_loc_wg_cd_META,
			in_to_loc_wg_nm_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			itm_typ_p_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			ver_no_p_META,
			sno_p_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			po_schd_no_META,
			po_no_META,
			po_d_no_META,
			slo_no_META,
			slo_d_no_META,
			aprv_no_META,
			maker_cd_META,
			maker_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			data_no_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_po_no_META,
			ext_po_d_no_META,
			pr_arr_fr_META,
			pr_arr_to_META,
			pr_purc_fr_META,
			pr_purc_to_META,
			prms_dlv_dt_overdue_flg_META,
			dlv_rqst_dt_overdue_flg_META,
			incl_can_flg_META,
			inc_past_flg_META,
			incl_abort_flg_META,
			po_cnt_rmrks_META,
			trd_rmrks_META,
			intr_rmrks_META,
			po_print_rmrks_META,
			dlv_slip_rmrks_META,
			dtl_intr_rmrks_META,
			dtl_trd_d_rmrks_META,
			po_print_d_rmrks_META,
			dlv_slip_d_rmrks_META,
			po_schd_sub_char1_META,
			po_schd_sub_char2_META,
			po_schd_sub_char3_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			bp_grp_p_META,
			itm_grp_p_META,
			upd_flg_META
		},
		new String[][]{
			{
				"dlv_rqst_dt_fr",
				"dlv_rqst_hm_fr",
				"dlv_rqst_dt_to",
				"dlv_rqst_hm_to",
				"rqst_dlv_rqst_dt_fr",
				"rqst_dlv_rqst_hm_fr",
				"rqst_dlv_rqst_dt_to",
				"rqst_dlv_rqst_hm_to",
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
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10",
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
				$dlv_rqst_dt_fr,
				$dlv_rqst_hm_fr,
				$dlv_rqst_dt_to,
				$dlv_rqst_hm_to,
				$rqst_dlv_rqst_dt_fr,
				$rqst_dlv_rqst_hm_fr,
				$rqst_dlv_rqst_dt_to,
				$rqst_dlv_rqst_hm_to,
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
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10,
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
				{$purc_sts_typ, "purc_sts_typ_nm"},	// purc_sts_typ
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$in_to_loc_wg_cd, "wg_nm"},	// in_to_loc_wg_cd
				{$in_to_loc_cd, "loc_nm"},	// in_to_loc_cd
				{$str_ln_cd, "str_ln_nm"},	// str_ln_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$cst_itm_cd, "bp_itm_nm"},	// cst_itm_cd
				{$asset_mng_typ, "asset_mng_typ_nm"},	// asset_mng_typ
				{$purc_usr_cd, "usr_nm"},	// purc_usr_cd
				{$purc_dpt_cd, "dpt_nm"},	// purc_dpt_cd
				{$purc_dpt_wg_cd, "wg_nm"},	// purc_dpt_wg_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$po_schd_src_typ, "po_schd_src_typ_nm"},	// po_schd_src_typ
				{$rqst_fr_usr_cd, "usr_nm"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "dpt_nm"},	// rqst_fr_dpt_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$ext_sys_cd, "ext_sys_nm"}	// ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;true"},	// dlv_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"},	// itm_p.itm_sub3
				{$purc_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.PURC"},	// purc_dpt_cd
				{$ap_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$rqst_fr_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_fr_dpt_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"},	// maker_cd
				{$ext_sys_cd, "MAC_EXT_SYS_TYP.SCM"}	// ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$dlv_cd, "bp_is_srch_typ;sundry_bp_nm_rem_flg"},	// dlv_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub3
				{$purc_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// purc_dpt_cd
				{$ap_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// ap_dpt_cd
				{$rqst_fr_dpt_cd, "mode_today_flg;dpt_nm_rem_flg;dpt_is_srch_typ"},	// rqst_fr_dpt_cd
				{$maker_cd, "bp_is_srch_typ"},	// maker_cd
				{$ext_sys_cd, "ext_sys_typ"}	// ext_sys_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$in_to_loc_wg_cd, "WG"},	// in_to_loc_wg_cd
				{$in_to_loc_wg_nm, "WG"},	// in_to_loc_wg_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$purc_dpt_wg_cd, "WG"},	// purc_dpt_wg_cd
				{$purc_dpt_wg_nm, "WG"},	// purc_dpt_wg_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"}	// maker_nm
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
	 * INS,Create,0;BNDL,Consolidate,4;DEL,Cancel,2;REF,View,3;PRNT,Issue report,5;SEND,Export after approval,6;RE_SEND,Re-export,7; INS,登録する,0;BNDL,まとめる,4;DEL,取り消す,2;REF,参照する,3;PRNT,帳票発行,5;SEND,承認後送信,6;RE_SEND,再送信する,7;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create,0;BNDL,Consolidate,4;DEL,Cancel,2;REF,View,3;PRNT,Issue report,5;SEND,Export after approval,6;RE_SEND,Re-export,7; INS,登録する,0;BNDL,まとめる,4;DEL,取り消す,2;REF,参照する,3;PRNT,帳票発行,5;SEND,承認後送信,6;RE_SEND,再送信する,7;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Dtl,Details;Hdr,Header Dtl,明細;Hdr,ヘッダ.<p>
	 *
	 */
	public String disp_unit() {
		return getConstString(offset + 1, $disp_unit);
	}

	/**
	 * Dtl,Details;Hdr,Header Dtl,明細;Hdr,ヘッダ.<p>
	 *
	 */
	public void disp_unit(String value) {
		setConstString(offset + 1, $disp_unit, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_dlv_prnt_flg() {
		return getConstBoolean(offset + 2, $not_dlv_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 2, $not_dlv_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 3, $dlv_prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $dlv_prnt_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_purc_ddlv_dlv_prnt_flg() {
		return getConstBoolean(offset + 4, $not_purc_ddlv_dlv_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_purc_ddlv_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $not_purc_ddlv_dlv_prnt_flg, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean purc_ddlv_dlv_prnt_flg() {
		return getConstBoolean(offset + 5, $purc_ddlv_dlv_prnt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void purc_ddlv_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_ddlv_dlv_prnt_flg, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean opn_flg() {
		return getConstBoolean(offset + 6, $opn_flg);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void opn_flg(boolean value) {
		setConstBoolean(offset + 6, $opn_flg, value);
	}


	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 7, $fix_flg);
	}

	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 7, $fix_flg, value);
	}


	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public boolean acpt_flg() {
		return getConstBoolean(offset + 8, $acpt_flg);
	}

	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public void acpt_flg(boolean value) {
		setConstBoolean(offset + 8, $acpt_flg, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean rjct_flg() {
		return getConstBoolean(offset + 9, $rjct_flg);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void rjct_flg(boolean value) {
		setConstBoolean(offset + 9, $rjct_flg, value);
	}


	/**
	 * Denied 否認.<p>
	 *
	 */
	public boolean last_rjct_flg() {
		return getConstBoolean(offset + 10, $last_rjct_flg);
	}

	/**
	 * Denied 否認.<p>
	 *
	 */
	public void last_rjct_flg(boolean value) {
		setConstBoolean(offset + 10, $last_rjct_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean aprv_invalid_flg() {
		return getConstBoolean(offset + 11, $aprv_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void aprv_invalid_flg(boolean value) {
		setConstBoolean(offset + 11, $aprv_invalid_flg, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean not_po_prnt_flg() {
		return getConstBoolean(offset + 12, $not_po_prnt_flg);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void not_po_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $not_po_prnt_flg, value);
	}


	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public boolean po_prnt_flg() {
		return getConstBoolean(offset + 13, $po_prnt_flg);
	}

	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public void po_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $po_prnt_flg, value);
	}


	/**
	 * Normal item 通常品.<p>
	 *
	 */
	public boolean not_sundry_itm_flg() {
		return getConstBoolean(offset + 14, $not_sundry_itm_flg);
	}

	/**
	 * Normal item 通常品.<p>
	 *
	 */
	public void not_sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 14, $not_sundry_itm_flg, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 15, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 15, $sundry_itm_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean iv_trgt_flg() {
		return getConstBoolean(offset + 16, $iv_trgt_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void iv_trgt_flg(boolean value) {
		setConstBoolean(offset + 16, $iv_trgt_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean iv_not_trgt_flg() {
		return getConstBoolean(offset + 17, $iv_not_trgt_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void iv_not_trgt_flg(boolean value) {
		setConstBoolean(offset + 17, $iv_not_trgt_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 18, $edi_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 18, $edi_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_edi_flg() {
		return getConstBoolean(offset + 19, $not_edi_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_edi_flg(boolean value) {
		setConstBoolean(offset + 19, $not_edi_flg, value);
	}


	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public boolean not_arr_flg() {
		return getConstBoolean(offset + 20, $not_arr_flg);
	}

	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public void not_arr_flg(boolean value) {
		setConstBoolean(offset + 20, $not_arr_flg, value);
	}


	/**
	 * Partial receipt 一部入荷.<p>
	 *
	 */
	public boolean part_arr_flg() {
		return getConstBoolean(offset + 21, $part_arr_flg);
	}

	/**
	 * Partial receipt 一部入荷.<p>
	 *
	 */
	public void part_arr_flg(boolean value) {
		setConstBoolean(offset + 21, $part_arr_flg, value);
	}


	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_compl_flg() {
		return getConstBoolean(offset + 22, $arr_compl_flg);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_compl_flg(boolean value) {
		setConstBoolean(offset + 22, $arr_compl_flg, value);
	}


	/**
	 * Not purchased 未仕入.<p>
	 *
	 */
	public boolean not_purc_flg() {
		return getConstBoolean(offset + 23, $not_purc_flg);
	}

	/**
	 * Not purchased 未仕入.<p>
	 *
	 */
	public void not_purc_flg(boolean value) {
		setConstBoolean(offset + 23, $not_purc_flg, value);
	}


	/**
	 * Partial purchase 一部仕入.<p>
	 *
	 */
	public boolean part_purc_flg() {
		return getConstBoolean(offset + 24, $part_purc_flg);
	}

	/**
	 * Partial purchase 一部仕入.<p>
	 *
	 */
	public void part_purc_flg(boolean value) {
		setConstBoolean(offset + 24, $part_purc_flg, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_compl_flg() {
		return getConstBoolean(offset + 25, $purc_compl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_compl_flg(boolean value) {
		setConstBoolean(offset + 25, $purc_compl_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean purc_if_tgt_flg() {
		return getConstBoolean(offset + 26, $purc_if_tgt_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void purc_if_tgt_flg(boolean value) {
		setConstBoolean(offset + 26, $purc_if_tgt_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_purc_if_tgt_flg() {
		return getConstBoolean(offset + 27, $not_purc_if_tgt_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_purc_if_tgt_flg(boolean value) {
		setConstBoolean(offset + 27, $not_purc_if_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_rqst_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 28, $dlv_rqst_dt_frto_p);
	}
	
	public void dlv_rqst_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 28, $dlv_rqst_dt_frto_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR rqst_dlv_rqst_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 29, $rqst_dlv_rqst_dt_frto_p);
	}
	
	public void rqst_dlv_rqst_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 29, $rqst_dlv_rqst_dt_frto_p, row);
	}


	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_schd_dt_fr() {
		return getConstDate(offset + 30, $po_schd_dt_fr);
	}

	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public void po_schd_dt_fr(MCDate value) {
		setConstDate(offset + 30, $po_schd_dt_fr, value);
	}


	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public MCDate po_schd_dt_to() {
		return getConstDate(offset + 31, $po_schd_dt_to);
	}

	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public void po_schd_dt_to(MCDate value) {
		setConstDate(offset + 31, $po_schd_dt_to, value);
	}


	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_dt_fr() {
		return getConstDate(offset + 32, $po_dt_fr);
	}

	/**
	 * PO date FROM 発注日ＦＲＯＭ.<p>
	 *
	 */
	public void po_dt_fr(MCDate value) {
		setConstDate(offset + 32, $po_dt_fr, value);
	}


	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public MCDate po_dt_to() {
		return getConstDate(offset + 33, $po_dt_to);
	}

	/**
	 * PO date TO 発注日ＴＯ.<p>
	 *
	 */
	public void po_dt_to(MCDate value) {
		setConstDate(offset + 33, $po_dt_to, value);
	}


	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return getConstBoolean(offset + 34, $po_conf_rcpt_flg);
	}

	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public void po_conf_rcpt_flg(boolean value) {
		setConstBoolean(offset + 34, $po_conf_rcpt_flg, value);
	}


	/**
	 * Confirmation received date FROM 請書受領日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt_fr() {
		return getConstDate(offset + 35, $po_conf_rcpt_dt_fr);
	}

	/**
	 * Confirmation received date FROM 請書受領日ＦＲＯＭ.<p>
	 *
	 */
	public void po_conf_rcpt_dt_fr(MCDate value) {
		setConstDate(offset + 35, $po_conf_rcpt_dt_fr, value);
	}


	/**
	 * Confirmation received date TO 請書受領日ＴＯ.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt_to() {
		return getConstDate(offset + 36, $po_conf_rcpt_dt_to);
	}

	/**
	 * Confirmation received date TO 請書受領日ＴＯ.<p>
	 *
	 */
	public void po_conf_rcpt_dt_to(MCDate value) {
		setConstDate(offset + 36, $po_conf_rcpt_dt_to, value);
	}


	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_fr() {
		return getConstDate(offset + 37, $dlv_inst_dt_fr);
	}

	/**
	 * Delivery order date FROM 納入指示日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_inst_dt_fr(MCDate value) {
		setConstDate(offset + 37, $dlv_inst_dt_fr, value);
	}


	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_inst_dt_to() {
		return getConstDate(offset + 38, $dlv_inst_dt_to);
	}

	/**
	 * Delivery order date TO 納入指示日ＴＯ.<p>
	 *
	 */
	public void dlv_inst_dt_to(MCDate value) {
		setConstDate(offset + 38, $dlv_inst_dt_to, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR arr_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 39, $arr_dt_frto_p);
	}
	
	public void arr_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 39, $arr_dt_frto_p, row);
	}


	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 40, $purc_sts_typ);
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 40, $purc_sts_typ, value);
	}


	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public String purc_sts_typ_nm() {
		return getConstString(offset + 41, $purc_sts_typ_nm);
	}

	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public void purc_sts_typ_nm(String value) {
		setConstString(offset + 41, $purc_sts_typ_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 42, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 42, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 43, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 43, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 44, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 44, $subcon_flg, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 45, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 45, $bp_lot_no, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 46, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 46, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 47, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 47, $site_nm, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 48, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 48, $in_to_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public String in_to_loc_wg_nm() {
		return getConstString(offset + 49, $in_to_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public void in_to_loc_wg_nm(String value) {
		setConstString(offset + 49, $in_to_loc_wg_nm, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 50, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 50, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 51, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 51, $in_to_loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 52, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 52, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 53, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 53, $str_ln_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 54, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 54, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 55, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 55, $dlv_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 56, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 56, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 57, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 57, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 58, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 58, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 59, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 59, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 60, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 60, $ver_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 61, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 61, $sno_p, row);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 62, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 62, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 63, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 63, $asset_mng_typ_nm, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 64, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 64, $purc_usr_cd, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 65, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 65, $purc_usr_nm, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 66, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 66, $purc_dpt_cd, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 67, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 67, $purc_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 68, $purc_dpt_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 68, $purc_dpt_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 69, $purc_dpt_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 69, $purc_dpt_wg_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 70, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 70, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 71, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 71, $ap_dpt_nm, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 72, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 72, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 73, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 73, $drct_dlv_typ_nm, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 74, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 74, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 75, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 75, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 76, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 76, $po_schd_src_no, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 77, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 77, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 78, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 78, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 79, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 79, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 80, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 80, $rqst_fr_dpt_nm, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 81, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 81, $po_schd_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 82, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 82, $po_no, value);
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 84, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 84, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 85, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 85, $slo_d_no, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 86, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 86, $aprv_no, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 87, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 87, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 88, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 88, $maker_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 89, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 89, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 90, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 90, $trd_cur_nm, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 91, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 91, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 91, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 91, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 91, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 91, $data_no, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 92, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 92, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 93, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 93, $ext_sys_nm, value);
	}


	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public String ext_po_no() {
		return getConstString(offset + 94, $ext_po_no);
	}

	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public void ext_po_no(String value) {
		setConstString(offset + 94, $ext_po_no, value);
	}


	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public String ext_po_d_no() {
		return getConstString(offset + 95, $ext_po_d_no);
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		setConstString(offset + 95, $ext_po_d_no, value);
	}


	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_arr_fr() {
		return getConstNumber(offset + 96, $pr_arr_fr);
	}

	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public void pr_arr_fr(MCNumber value) {
		setConstNumber(offset + 96, $pr_arr_fr, value);
	}

	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public void pr_arr_fr(int value) {
		setConstNumber(offset + 96, $pr_arr_fr, value);
	}

	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public void pr_arr_fr(long value) {
		setConstNumber(offset + 96, $pr_arr_fr, value);
	}

	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public void pr_arr_fr(float value) {
		setConstNumber(offset + 96, $pr_arr_fr, value);
	}

	/**
	 * Receipt progress rate (Equal or more) 入荷進捗率（以上）.<p>
	 *
	 */
	public void pr_arr_fr(double value) {
		setConstNumber(offset + 96, $pr_arr_fr, value);
	}


	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_arr_to() {
		return getConstNumber(offset + 97, $pr_arr_to);
	}

	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public void pr_arr_to(MCNumber value) {
		setConstNumber(offset + 97, $pr_arr_to, value);
	}

	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public void pr_arr_to(int value) {
		setConstNumber(offset + 97, $pr_arr_to, value);
	}

	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public void pr_arr_to(long value) {
		setConstNumber(offset + 97, $pr_arr_to, value);
	}

	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public void pr_arr_to(float value) {
		setConstNumber(offset + 97, $pr_arr_to, value);
	}

	/**
	 * Receipt progress rate (Equal or less) 入荷進捗率（以下）.<p>
	 *
	 */
	public void pr_arr_to(double value) {
		setConstNumber(offset + 97, $pr_arr_to, value);
	}


	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_purc_fr() {
		return getConstNumber(offset + 98, $pr_purc_fr);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void pr_purc_fr(MCNumber value) {
		setConstNumber(offset + 98, $pr_purc_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void pr_purc_fr(int value) {
		setConstNumber(offset + 98, $pr_purc_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void pr_purc_fr(long value) {
		setConstNumber(offset + 98, $pr_purc_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void pr_purc_fr(float value) {
		setConstNumber(offset + 98, $pr_purc_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void pr_purc_fr(double value) {
		setConstNumber(offset + 98, $pr_purc_fr, value);
	}


	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_purc_to() {
		return getConstNumber(offset + 99, $pr_purc_to);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void pr_purc_to(MCNumber value) {
		setConstNumber(offset + 99, $pr_purc_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void pr_purc_to(int value) {
		setConstNumber(offset + 99, $pr_purc_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void pr_purc_to(long value) {
		setConstNumber(offset + 99, $pr_purc_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void pr_purc_to(float value) {
		setConstNumber(offset + 99, $pr_purc_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void pr_purc_to(double value) {
		setConstNumber(offset + 99, $pr_purc_to, value);
	}


	/**
	 * Replied delivery date delayed 回答納入日遅れ.<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_flg() {
		return getConstBoolean(offset + 100, $prms_dlv_dt_overdue_flg);
	}

	/**
	 * Replied delivery date delayed 回答納入日遅れ.<p>
	 *
	 */
	public void prms_dlv_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 100, $prms_dlv_dt_overdue_flg, value);
	}


	/**
	 * Desired delivery date delayed 納入希望日遅れ.<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_flg() {
		return getConstBoolean(offset + 101, $dlv_rqst_dt_overdue_flg);
	}

	/**
	 * Desired delivery date delayed 納入希望日遅れ.<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_flg(boolean value) {
		setConstBoolean(offset + 101, $dlv_rqst_dt_overdue_flg, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean incl_can_flg() {
		return getConstBoolean(offset + 102, $incl_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void incl_can_flg(boolean value) {
		setConstBoolean(offset + 102, $incl_can_flg, value);
	}


	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public boolean inc_past_flg() {
		return getConstBoolean(offset + 103, $inc_past_flg);
	}

	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public void inc_past_flg(boolean value) {
		setConstBoolean(offset + 103, $inc_past_flg, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean incl_abort_flg() {
		return getConstBoolean(offset + 104, $incl_abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void incl_abort_flg(boolean value) {
		setConstBoolean(offset + 104, $incl_abort_flg, value);
	}


	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public String po_cnt_rmrks() {
		return getConstString(offset + 105, $po_cnt_rmrks);
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public void po_cnt_rmrks(String value) {
		setConstString(offset + 105, $po_cnt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 106, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 106, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 107, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 107, $intr_rmrks, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 108, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 108, $po_print_rmrks, value);
	}


	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public String dlv_slip_rmrks() {
		return getConstString(offset + 109, $dlv_slip_rmrks);
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public void dlv_slip_rmrks(String value) {
		setConstString(offset + 109, $dlv_slip_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 110, $dtl_intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 110, $dtl_intr_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String dtl_trd_d_rmrks() {
		return getConstString(offset + 111, $dtl_trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void dtl_trd_d_rmrks(String value) {
		setConstString(offset + 111, $dtl_trd_d_rmrks, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 112, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 112, $po_print_d_rmrks, value);
	}


	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 113, $dlv_slip_d_rmrks);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 113, $dlv_slip_d_rmrks, value);
	}


	/**
	 * PO schedule spare 1 発注予定予備１.<p>
	 *
	 */
	public String po_schd_sub_char1() {
		return getConstString(offset + 114, $po_schd_sub_char1);
	}

	/**
	 * PO schedule spare 1 発注予定予備１.<p>
	 *
	 */
	public void po_schd_sub_char1(String value) {
		setConstString(offset + 114, $po_schd_sub_char1, value);
	}


	/**
	 * PO schedule spare 2 発注予定予備２.<p>
	 *
	 */
	public String po_schd_sub_char2() {
		return getConstString(offset + 115, $po_schd_sub_char2);
	}

	/**
	 * PO schedule spare 2 発注予定予備２.<p>
	 *
	 */
	public void po_schd_sub_char2(String value) {
		setConstString(offset + 115, $po_schd_sub_char2, value);
	}


	/**
	 * PO schedule spare 3 発注予定予備３.<p>
	 *
	 */
	public String po_schd_sub_char3() {
		return getConstString(offset + 116, $po_schd_sub_char3);
	}

	/**
	 * PO schedule spare 3 発注予定予備３.<p>
	 *
	 */
	public void po_schd_sub_char3(String value) {
		setConstString(offset + 116, $po_schd_sub_char3, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 117, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 117, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 118, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 118, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 119, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 119, $sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 120, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 120, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 121, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 121, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 122, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 122, $dtl_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 123, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 123, $bp_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 124, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 124, $itm_grp_p, row);
	}


	/**
	 * Update 更新.<p>
	 *
	 */
	public boolean upd_flg() {
		return getConstBoolean(offset + 125, $upd_flg);
	}

	/**
	 * Update 更新.<p>
	 *
	 */
	public void upd_flg(boolean value) {
		setConstBoolean(offset + 125, $upd_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_po_no.equalsIgnoreCase(name)) {
			return ext_po_no();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_trd_d_rmrks.equalsIgnoreCase(name)) {
			return dtl_trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($po_schd_sub_char1.equalsIgnoreCase(name)) {
			return po_schd_sub_char1();
		}
		if ($po_schd_sub_char2.equalsIgnoreCase(name)) {
			return po_schd_sub_char2();
		}
		if ($po_schd_sub_char3.equalsIgnoreCase(name)) {
			return po_schd_sub_char3();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			return pr_arr_fr();
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			return pr_arr_to();
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			return pr_purc_fr();
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			return pr_purc_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			return po_dt_fr();
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			return po_dt_to();
		}
		if ($po_conf_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt_fr();
		}
		if ($po_conf_rcpt_dt_to.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt_to();
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_dt_fr();
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return not_dlv_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($not_purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return not_purc_ddlv_dlv_prnt_flg();
		}
		if ($purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_prnt_flg();
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			return rjct_flg();
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			return last_rjct_flg();
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			return aprv_invalid_flg();
		}
		if ($not_po_prnt_flg.equalsIgnoreCase(name)) {
			return not_po_prnt_flg();
		}
		if ($po_prnt_flg.equalsIgnoreCase(name)) {
			return po_prnt_flg();
		}
		if ($not_sundry_itm_flg.equalsIgnoreCase(name)) {
			return not_sundry_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($not_arr_flg.equalsIgnoreCase(name)) {
			return not_arr_flg();
		}
		if ($part_arr_flg.equalsIgnoreCase(name)) {
			return part_arr_flg();
		}
		if ($arr_compl_flg.equalsIgnoreCase(name)) {
			return arr_compl_flg();
		}
		if ($not_purc_flg.equalsIgnoreCase(name)) {
			return not_purc_flg();
		}
		if ($part_purc_flg.equalsIgnoreCase(name)) {
			return part_purc_flg();
		}
		if ($purc_compl_flg.equalsIgnoreCase(name)) {
			return purc_compl_flg();
		}
		if ($purc_if_tgt_flg.equalsIgnoreCase(name)) {
			return purc_if_tgt_flg();
		}
		if ($not_purc_if_tgt_flg.equalsIgnoreCase(name)) {
			return not_purc_if_tgt_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		if ($incl_abort_flg.equalsIgnoreCase(name)) {
			return incl_abort_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_po_no.equalsIgnoreCase(name)) {
			return ext_po_no();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_rmrks();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_trd_d_rmrks.equalsIgnoreCase(name)) {
			return dtl_trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($po_schd_sub_char1.equalsIgnoreCase(name)) {
			return po_schd_sub_char1();
		}
		if ($po_schd_sub_char2.equalsIgnoreCase(name)) {
			return po_schd_sub_char2();
		}
		if ($po_schd_sub_char3.equalsIgnoreCase(name)) {
			return po_schd_sub_char3();
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			return pr_arr_fr();
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			return pr_arr_to();
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			return pr_purc_fr();
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			return pr_purc_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			return po_schd_dt_fr();
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			return po_schd_dt_to();
		}
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			return po_dt_fr();
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			return po_dt_to();
		}
		if ($po_conf_rcpt_dt_fr.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt_fr();
		}
		if ($po_conf_rcpt_dt_to.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt_to();
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_inst_dt_fr();
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			return dlv_inst_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return not_dlv_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($not_purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return not_purc_ddlv_dlv_prnt_flg();
		}
		if ($purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_prnt_flg();
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			return acpt_flg();
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			return rjct_flg();
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			return last_rjct_flg();
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			return aprv_invalid_flg();
		}
		if ($not_po_prnt_flg.equalsIgnoreCase(name)) {
			return not_po_prnt_flg();
		}
		if ($po_prnt_flg.equalsIgnoreCase(name)) {
			return po_prnt_flg();
		}
		if ($not_sundry_itm_flg.equalsIgnoreCase(name)) {
			return not_sundry_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($not_arr_flg.equalsIgnoreCase(name)) {
			return not_arr_flg();
		}
		if ($part_arr_flg.equalsIgnoreCase(name)) {
			return part_arr_flg();
		}
		if ($arr_compl_flg.equalsIgnoreCase(name)) {
			return arr_compl_flg();
		}
		if ($not_purc_flg.equalsIgnoreCase(name)) {
			return not_purc_flg();
		}
		if ($part_purc_flg.equalsIgnoreCase(name)) {
			return part_purc_flg();
		}
		if ($purc_compl_flg.equalsIgnoreCase(name)) {
			return purc_compl_flg();
		}
		if ($purc_if_tgt_flg.equalsIgnoreCase(name)) {
			return purc_if_tgt_flg();
		}
		if ($not_purc_if_tgt_flg.equalsIgnoreCase(name)) {
			return not_purc_if_tgt_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_flg();
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_flg();
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			return incl_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
		}
		if ($incl_abort_flg.equalsIgnoreCase(name)) {
			return incl_abort_flg();
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			return upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
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
		if ($ext_po_no.equalsIgnoreCase(name)) {
			ext_po_no(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_trd_d_rmrks.equalsIgnoreCase(name)) {
			dtl_trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($po_schd_sub_char1.equalsIgnoreCase(name)) {
			po_schd_sub_char1(value);
			return;
		}
		if ($po_schd_sub_char2.equalsIgnoreCase(name)) {
			po_schd_sub_char2(value);
			return;
		}
		if ($po_schd_sub_char3.equalsIgnoreCase(name)) {
			po_schd_sub_char3(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			po_dt_fr(value);
			return;
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			po_dt_to(value);
			return;
		}
		if ($po_conf_rcpt_dt_fr.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt_fr(value);
			return;
		}
		if ($po_conf_rcpt_dt_to.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt_to(value);
			return;
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_dt_fr(value);
			return;
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_dlv_prnt_flg.equalsIgnoreCase(name)) {
			not_dlv_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($not_purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			not_purc_ddlv_dlv_prnt_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_prnt_flg(value);
			return;
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			rjct_flg(value);
			return;
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			last_rjct_flg(value);
			return;
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			aprv_invalid_flg(value);
			return;
		}
		if ($not_po_prnt_flg.equalsIgnoreCase(name)) {
			not_po_prnt_flg(value);
			return;
		}
		if ($po_prnt_flg.equalsIgnoreCase(name)) {
			po_prnt_flg(value);
			return;
		}
		if ($not_sundry_itm_flg.equalsIgnoreCase(name)) {
			not_sundry_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($not_arr_flg.equalsIgnoreCase(name)) {
			not_arr_flg(value);
			return;
		}
		if ($part_arr_flg.equalsIgnoreCase(name)) {
			part_arr_flg(value);
			return;
		}
		if ($arr_compl_flg.equalsIgnoreCase(name)) {
			arr_compl_flg(value);
			return;
		}
		if ($not_purc_flg.equalsIgnoreCase(name)) {
			not_purc_flg(value);
			return;
		}
		if ($part_purc_flg.equalsIgnoreCase(name)) {
			part_purc_flg(value);
			return;
		}
		if ($purc_compl_flg.equalsIgnoreCase(name)) {
			purc_compl_flg(value);
			return;
		}
		if ($purc_if_tgt_flg.equalsIgnoreCase(name)) {
			purc_if_tgt_flg(value);
			return;
		}
		if ($not_purc_if_tgt_flg.equalsIgnoreCase(name)) {
			not_purc_if_tgt_flg(value);
			return;
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		if ($incl_abort_flg.equalsIgnoreCase(name)) {
			incl_abort_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			disp_unit(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
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
		if ($ext_po_no.equalsIgnoreCase(name)) {
			ext_po_no(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
			return;
		}
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($dlv_slip_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_rmrks(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_trd_d_rmrks.equalsIgnoreCase(name)) {
			dtl_trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($po_schd_sub_char1.equalsIgnoreCase(name)) {
			po_schd_sub_char1(value);
			return;
		}
		if ($po_schd_sub_char2.equalsIgnoreCase(name)) {
			po_schd_sub_char2(value);
			return;
		}
		if ($po_schd_sub_char3.equalsIgnoreCase(name)) {
			po_schd_sub_char3(value);
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
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($pr_arr_fr.equalsIgnoreCase(name)) {
			pr_arr_fr(value);
			return;
		}
		if ($pr_arr_to.equalsIgnoreCase(name)) {
			pr_arr_to(value);
			return;
		}
		if ($pr_purc_fr.equalsIgnoreCase(name)) {
			pr_purc_fr(value);
			return;
		}
		if ($pr_purc_to.equalsIgnoreCase(name)) {
			pr_purc_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($po_schd_dt_fr.equalsIgnoreCase(name)) {
			po_schd_dt_fr(value);
			return;
		}
		if ($po_schd_dt_to.equalsIgnoreCase(name)) {
			po_schd_dt_to(value);
			return;
		}
		if ($po_dt_fr.equalsIgnoreCase(name)) {
			po_dt_fr(value);
			return;
		}
		if ($po_dt_to.equalsIgnoreCase(name)) {
			po_dt_to(value);
			return;
		}
		if ($po_conf_rcpt_dt_fr.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt_fr(value);
			return;
		}
		if ($po_conf_rcpt_dt_to.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt_to(value);
			return;
		}
		if ($dlv_inst_dt_fr.equalsIgnoreCase(name)) {
			dlv_inst_dt_fr(value);
			return;
		}
		if ($dlv_inst_dt_to.equalsIgnoreCase(name)) {
			dlv_inst_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_dlv_prnt_flg.equalsIgnoreCase(name)) {
			not_dlv_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($not_purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			not_purc_ddlv_dlv_prnt_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_prnt_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_prnt_flg(value);
			return;
		}
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($acpt_flg.equalsIgnoreCase(name)) {
			acpt_flg(value);
			return;
		}
		if ($rjct_flg.equalsIgnoreCase(name)) {
			rjct_flg(value);
			return;
		}
		if ($last_rjct_flg.equalsIgnoreCase(name)) {
			last_rjct_flg(value);
			return;
		}
		if ($aprv_invalid_flg.equalsIgnoreCase(name)) {
			aprv_invalid_flg(value);
			return;
		}
		if ($not_po_prnt_flg.equalsIgnoreCase(name)) {
			not_po_prnt_flg(value);
			return;
		}
		if ($po_prnt_flg.equalsIgnoreCase(name)) {
			po_prnt_flg(value);
			return;
		}
		if ($not_sundry_itm_flg.equalsIgnoreCase(name)) {
			not_sundry_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($not_arr_flg.equalsIgnoreCase(name)) {
			not_arr_flg(value);
			return;
		}
		if ($part_arr_flg.equalsIgnoreCase(name)) {
			part_arr_flg(value);
			return;
		}
		if ($arr_compl_flg.equalsIgnoreCase(name)) {
			arr_compl_flg(value);
			return;
		}
		if ($not_purc_flg.equalsIgnoreCase(name)) {
			not_purc_flg(value);
			return;
		}
		if ($part_purc_flg.equalsIgnoreCase(name)) {
			part_purc_flg(value);
			return;
		}
		if ($purc_compl_flg.equalsIgnoreCase(name)) {
			purc_compl_flg(value);
			return;
		}
		if ($purc_if_tgt_flg.equalsIgnoreCase(name)) {
			purc_if_tgt_flg(value);
			return;
		}
		if ($not_purc_if_tgt_flg.equalsIgnoreCase(name)) {
			not_purc_if_tgt_flg(value);
			return;
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_flg(value);
			return;
		}
		if ($incl_can_flg.equalsIgnoreCase(name)) {
			incl_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
			return;
		}
		if ($incl_abort_flg.equalsIgnoreCase(name)) {
			incl_abort_flg(value);
			return;
		}
		if ($upd_flg.equalsIgnoreCase(name)) {
			upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_frto_p();
		}
		if ($rqst_dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt_frto_p();
		}
		if ($arr_dt_frto_p.equalsIgnoreCase(name)) {
			return arr_dt_frto_p();
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
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_frto_p(
				((MCContainerMeta) dlv_rqst_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($rqst_dlv_rqst_dt_frto_p.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt_frto_p(
				((MCContainerMeta) rqst_dlv_rqst_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($arr_dt_frto_p.equalsIgnoreCase(name)) {
			arr_dt_frto_p(
				((MCContainerMeta) arr_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return dlv_rqst_dt_frto_p().ymd_fr();
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		dlv_rqst_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return dlv_rqst_dt_frto_p().hm_fr();
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		dlv_rqst_dt_frto_p().hm_fr(value);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return dlv_rqst_dt_frto_p().ymd_to();
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		dlv_rqst_dt_frto_p().ymd_to(value);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return dlv_rqst_dt_frto_p().hm_to();
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		dlv_rqst_dt_frto_p().hm_to(value);
	}

	/**
	 * Request source desired delivery date FROM 依頼元納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_fr() {
		return rqst_dlv_rqst_dt_frto_p().ymd_fr();
	}

	/**
	 * Request source desired delivery date FROM 依頼元納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_fr(MCDate value) {
		rqst_dlv_rqst_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Request source desired delivery time FROM 依頼元納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_fr() {
		return rqst_dlv_rqst_dt_frto_p().hm_fr();
	}

	/**
	 * Request source desired delivery time FROM 依頼元納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_fr(MCDate value) {
		rqst_dlv_rqst_dt_frto_p().hm_fr(value);
	}

	/**
	 * Request source desired delivery date TO 依頼元納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt_to() {
		return rqst_dlv_rqst_dt_frto_p().ymd_to();
	}

	/**
	 * Request source desired delivery date TO 依頼元納入希望日ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt_to(MCDate value) {
		rqst_dlv_rqst_dt_frto_p().ymd_to(value);
	}

	/**
	 * Request source desired delivery time TO 依頼元納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm_to() {
		return rqst_dlv_rqst_dt_frto_p().hm_to();
	}

	/**
	 * Request source desired delivery time TO 依頼元納入希望時刻ＴＯ.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm_to(MCDate value) {
		rqst_dlv_rqst_dt_frto_p().hm_to(value);
	}

	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_dt_fr() {
		return arr_dt_frto_p().ymd_fr();
	}

	/**
	 * Receipt date FROM 入荷日ＦＲＯＭ.<p>
	 *
	 */
	public void arr_dt_fr(MCDate value) {
		arr_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate arr_hm_fr() {
		return arr_dt_frto_p().hm_fr();
	}

	/**
	 * Receipt time FROM 入荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void arr_hm_fr(MCDate value) {
		arr_dt_frto_p().hm_fr(value);
	}

	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public MCDate arr_dt_to() {
		return arr_dt_frto_p().ymd_to();
	}

	/**
	 * Receipt date TO 入荷日ＴＯ.<p>
	 *
	 */
	public void arr_dt_to(MCDate value) {
		arr_dt_frto_p().ymd_to(value);
	}

	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate arr_hm_to() {
		return arr_dt_frto_p().hm_to();
	}

	/**
	 * Receipt time TO 入荷時刻ＴＯ.<p>
	 *
	 */
	public void arr_hm_to(MCDate value) {
		arr_dt_frto_p().hm_to(value);
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
	public boolean bp_grp_flg1() {
		return bp_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
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

