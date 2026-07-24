package mcframe.clientMSBE.MSBEP1050;

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
	 * INS,Create,1;UPD,Modify,2;PRNT,Issue report,3;DEL,Cancel,4;REF,View,5 INS,登録する,1;UPD,訂正する,2;PRNT,帳票発行,3;DEL,取り消す,4;REF,参照する,5.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * SCHD,Schedule,1;INST,Orders,2;ACT,Result,3 SCHD,予定,1;INST,指図,2;ACT,実績,3.<p>
	 *
	 */
	public static final String $tgt = "tgt";
	/**
	 * DTL,Details,1;HDR,Header,2;Delivery note,3 DTL,明細,1;HDR,ヘッダ,2;DLV,納品書,3.<p>
	 *
	 */
	public static final String $md = "md";
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
	 * Partially completed 一部完了.<p>
	 *
	 */
	public static final String $p_xfr_flg = "p_xfr_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $sts_cmpl_flg = "sts_cmpl_flg";
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public static final String $not_alloc_flg = "not_alloc_flg";
	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $schd_not_cmpl_flg = "schd_not_cmpl_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $schd_cmpl_flg = "schd_cmpl_flg";
	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public static final String $pick_not_prnt_flg = "pick_not_prnt_flg";
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public static final String $pick_prnt_flg = "pick_prnt_flg";
	/**
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public static final String $inst_not_prnt_flg = "inst_not_prnt_flg";
	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public static final String $dlv_not_prnt_flg = "dlv_not_prnt_flg";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
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
	/**
	 * Scheduled movement date FROM 移動予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $xfr_schd_dt_fr = "xfr_schd_dt_fr";
	/**
	 * Scheduled movement date TO 移動予定日ＴＯ.<p>
	 *
	 */
	public static final String $xfr_schd_dt_to = "xfr_schd_dt_to";
	/**
	 * Movement order date FROM 移動指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $xfr_inst_dt_fr = "xfr_inst_dt_fr";
	/**
	 * Movement order date TO 移動指図日ＴＯ.<p>
	 *
	 */
	public static final String $xfr_inst_dt_to = "xfr_inst_dt_to";
	/**
	 * Actual movement date FROM 移動実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $xfr_act_dt_fr = "xfr_act_dt_fr";
	/**
	 * Actual movement date TO 移動実績日ＴＯ.<p>
	 *
	 */
	public static final String $xfr_act_dt_to = "xfr_act_dt_to";
	/**
	 * Movement recording date FROM 移動計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $xfr_ac_dt_fr = "xfr_ac_dt_fr";
	/**
	 * Movement recording date TO 移動計上日ＴＯ.<p>
	 *
	 */
	public static final String $xfr_ac_dt_to = "xfr_ac_dt_to";
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
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Only data edited by request source 依頼元訂正のみ.<p>
	 *
	 */
	public static final String $rqst_mod_flg = "rqst_mod_flg";
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gi_site_nm = "gi_site_nm";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_nm = "gi_stk_arrv_bp_nm";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gr_site_cd = "gr_site_cd";
	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public static final String $gr_site_nm = "gr_site_nm";
	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gr_stk_arrv_bp_cd = "gr_stk_arrv_bp_cd";
	/**
	 * GR inventory arriving point name 入庫在庫着荷先名.<p>
	 *
	 */
	public static final String $gr_stk_arrv_bp_nm = "gr_stk_arrv_bp_nm";
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
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
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
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public static final String $pckg_unit_nm = "pckg_unit_nm";
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
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
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
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
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
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
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
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Header transaction remarks ヘッダ取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Header order remarks ヘッダ指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public static final String $h_sub_char1 = "h_sub_char1";
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public static final String $h_sub_char2 = "h_sub_char2";
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public static final String $h_sub_char3 = "h_sub_char3";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public static final String $rqst_cnt_rmrks = "rqst_cnt_rmrks";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public static final String $schd_intr_rmrks = "schd_intr_rmrks";
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public static final String $xfr_src_typ_nm = "xfr_src_typ_nm";
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $xfr_alloc_sts_no = "xfr_alloc_sts_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_no = "xfr_inst_no";
	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_d_no = "xfr_inst_d_no";
	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_no = "xfr_act_no";
	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_d_no = "xfr_act_d_no";
	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_xfr_act_no = "ext_xfr_act_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	public static final String $itm_grp_p = "itm_grp_p";

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
	public static final MCMeta tgt_META = createStringMeta($tgt);
	public static final MCMeta md_META = createStringMeta($md);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta p_xfr_flg_META = createCommonMeta($p_xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sts_cmpl_flg_META = createCommonMeta($sts_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_alloc_flg_META = createCommonMeta($not_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_not_cmpl_flg_META = createCommonMeta($schd_not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_cmpl_flg_META = createCommonMeta($schd_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_not_prnt_flg_META = createCommonMeta($pick_not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_prnt_flg_META = createCommonMeta($pick_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_not_prnt_flg_META = createCommonMeta($inst_not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_not_prnt_flg_META = createCommonMeta($dlv_not_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_schd_dt_fr_META = createCommonMeta($xfr_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_schd_dt_to_META = createCommonMeta($xfr_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_inst_dt_fr_META = createCommonMeta($xfr_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_inst_dt_to_META = createCommonMeta($xfr_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_act_dt_fr_META = createCommonMeta($xfr_act_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_act_dt_to_META = createCommonMeta($xfr_act_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_ac_dt_fr_META = createCommonMeta($xfr_ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_ac_dt_to_META = createCommonMeta($xfr_ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pr_rate_fr_META = createCommonMeta($pr_rate_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta pr_rate_to_META = createCommonMeta($pr_rate_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_mod_flg_META = createCommonMeta($rqst_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_nm_META = createCommonMeta($gi_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_arrv_bp_nm_META = createCommonMeta($gi_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_nm_META = createCommonMeta($gr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gr_stk_arrv_bp_cd_META = createCommonMeta($gr_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_stk_arrv_bp_nm_META = createCommonMeta($gr_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_typ_nm_META = createCommonMeta($ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.XFR_ACT_INTR_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_RMRKS);
	public static final MCMeta h_sub_char1_META = createCommonMeta($h_sub_char1, mcframe.commonMS.meta.MS_META.XFR_INST_SUB_CHAR1);
	public static final MCMeta h_sub_char2_META = createCommonMeta($h_sub_char2, mcframe.commonMS.meta.MS_META.XFR_INST_SUB_CHAR2);
	public static final MCMeta h_sub_char3_META = createCommonMeta($h_sub_char3, mcframe.commonMS.meta.MS_META.XFR_INST_SUB_CHAR3);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_INTR_D_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR3);
	public static final MCMeta rqst_cnt_rmrks_META = createCommonMeta($rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.RQST_CNT_RMRKS);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta schd_intr_rmrks_META = createCommonMeta($schd_intr_rmrks, mcframe.commonMS.meta.MS_META.XFR_SCHD_INTR_RMRKS);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_typ_nm_META = createCommonMeta($xfr_src_typ_nm, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP_NM);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta xfr_inst_no_META = createCommonMeta($xfr_inst_no, mcframe.commonMA.meta.MA_META.XFR_INST_NO);
	public static final MCMeta xfr_inst_d_no_META = createCommonMeta($xfr_inst_d_no, mcframe.commonMA.meta.MA_META.XFR_INST_D_NO);
	public static final MCMeta xfr_act_no_META = createCommonMeta($xfr_act_no, mcframe.commonMA.meta.MA_META.XFR_ACT_NO);
	public static final MCMeta xfr_act_d_no_META = createCommonMeta($xfr_act_d_no, mcframe.commonMA.meta.MA_META.XFR_ACT_D_NO);
	public static final MCMeta ext_xfr_act_no_META = createCommonMeta($ext_xfr_act_no, mcframe.commonMA.meta.MA_META.EXT_XFR_ACT_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			tgt_META,
			md_META,
			not_inst_flg_META,
			inst_flg_META,
			p_xfr_flg_META,
			sts_cmpl_flg_META,
			not_alloc_flg_META,
			alloc_flg_META,
			schd_not_cmpl_flg_META,
			schd_cmpl_flg_META,
			pick_not_prnt_flg_META,
			pick_prnt_flg_META,
			inst_not_prnt_flg_META,
			inst_prnt_flg_META,
			dlv_not_prnt_flg_META,
			dlv_prnt_flg_META,
			wms_flg_META,
			not_wms_flg_META,
			xfr_schd_dt_fr_META,
			xfr_schd_dt_to_META,
			xfr_inst_dt_fr_META,
			xfr_inst_dt_to_META,
			xfr_act_dt_fr_META,
			xfr_act_dt_to_META,
			xfr_ac_dt_fr_META,
			xfr_ac_dt_to_META,
			pr_rate_fr_META,
			pr_rate_to_META,
			abort_flg_META,
			rqst_mod_flg_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			gi_site_cd_META,
			gi_site_nm_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_arrv_bp_nm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_site_cd_META,
			gr_site_nm_META,
			gr_stk_arrv_bp_cd_META,
			gr_stk_arrv_bp_nm_META,
			itm_typ_p_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			sno_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			ship_inst_typ_META,
			ship_inst_typ_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			trd_cd_META,
			trd_nm_META,
			intr_rmrks_META,
			trd_rmrks_META,
			inst_rmrks_META,
			h_sub_char1_META,
			h_sub_char2_META,
			h_sub_char3_META,
			intr_d_rmrks_META,
			trd_d_rmrks_META,
			inst_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			rqst_cnt_rmrks_META,
			ship_cnt_rmrks_META,
			schd_intr_rmrks_META,
			xfr_src_typ_META,
			xfr_src_typ_nm_META,
			xfr_src_no_META,
			xfr_schd_no_META,
			xfr_alloc_sts_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			xfr_inst_no_META,
			xfr_inst_d_no_META,
			xfr_act_no_META,
			xfr_act_d_no_META,
			ext_xfr_act_no_META,
			slo_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			io_schd_pr_no_META,
			itm_grp_p_META
		},
		new String[][]{
			{
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
				{$wg_cd, "wg_nm"},	// wg_cd
				{$gi_loc_cd, "loc_nm"},	// gi_loc_cd
				{$gi_str_ln_cd, "str_ln_nm"},	// gi_str_ln_cd
				{$gi_site_cd, "site_nm"},	// gi_site_cd
				{$gi_stk_arrv_bp_cd, "bp_nm"},	// gi_stk_arrv_bp_cd
				{$gr_loc_cd, "loc_nm"},	// gr_loc_cd
				{$gr_str_ln_cd, "str_ln_nm"},	// gr_str_ln_cd
				{$gr_site_cd, "site_nm"},	// gr_site_cd
				{$gr_stk_arrv_bp_cd, "bp_nm"},	// gr_stk_arrv_bp_cd
				{$trd_unit_cd, "unit_nm"},	// trd_unit_cd
				{$base_unit_cd, "unit_nm"},	// base_unit_cd
				{$pckg_unit_cd, "unit_nm"},	// pckg_unit_cd
				{$stk_bp_cd, "bp_nm"},	// stk_bp_cd
				{$rqst_usr_cd, "usr_nm"},	// rqst_usr_cd
				{$rqst_dpt_cd, "dpt_nm"},	// rqst_dpt_cd
				{$inst_usr_cd, "usr_nm"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_nm"},	// inst_dpt_cd
				{$act_usr_cd, "usr_nm"},	// act_usr_cd
				{$act_dpt_cd, "dpt_nm"},	// act_dpt_cd
				{$rsn_cd, "biz_rsn_nm"},	// rsn_cd
				{$bd_dpt_cd, "dpt_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// gi_loc_cd
				{$gi_str_ln_cd, "gi_loc_cd;true"},	// gi_str_ln_cd
				{$gi_stk_arrv_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// gi_stk_arrv_bp_cd
				{$gr_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// gr_loc_cd
				{$gr_str_ln_cd, "ship_loc_cd;true"},	// gr_str_ln_cd
				{$gr_stk_arrv_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// gr_stk_arrv_bp_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$stk_bp_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// stk_bp_cd
				{$rqst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_dpt_cd
				{$inst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// inst_dpt_cd
				{$act_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"},	// act_dpt_cd
				{$bd_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.BD"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$gi_loc_cd, "loc_is_srch_typ"},	// gi_loc_cd
				{$gi_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gi_str_ln_cd
				{$gi_stk_arrv_bp_cd, "bp_is_srch_typ"},	// gi_stk_arrv_bp_cd
				{$gr_loc_cd, "loc_is_srch_typ"},	// gr_loc_cd
				{$gr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gr_str_ln_cd
				{$gr_stk_arrv_bp_cd, "bp_is_srch_typ"},	// gr_stk_arrv_bp_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$stk_bp_cd, "bp_is_srch_typ"},	// stk_bp_cd
				{$rqst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// rqst_dpt_cd
				{$inst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// inst_dpt_cd
				{$act_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// act_dpt_cd
				{$bd_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$gi_str_ln_cd, "STR_LN"},	// gi_str_ln_cd
				{$gi_str_ln_nm, "STR_LN"},	// gi_str_ln_nm
				{$gi_site_cd, "SITE"},	// gi_site_cd
				{$gi_site_nm, "SITE"},	// gi_site_nm
				{$gr_str_ln_cd, "STR_LN"},	// gr_str_ln_cd
				{$gr_str_ln_nm, "STR_LN"},	// gr_str_ln_nm
				{$gr_site_cd, "SITE"},	// gr_site_cd
				{$gr_site_nm, "SITE"},	// gr_site_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
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
	 * INS,Create,1;UPD,Modify,2;PRNT,Issue report,3;DEL,Cancel,4;REF,View,5 INS,登録する,1;UPD,訂正する,2;PRNT,帳票発行,3;DEL,取り消す,4;REF,参照する,5.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create,1;UPD,Modify,2;PRNT,Issue report,3;DEL,Cancel,4;REF,View,5 INS,登録する,1;UPD,訂正する,2;PRNT,帳票発行,3;DEL,取り消す,4;REF,参照する,5.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * SCHD,Schedule,1;INST,Orders,2;ACT,Result,3 SCHD,予定,1;INST,指図,2;ACT,実績,3.<p>
	 *
	 */
	public String tgt() {
		return getConstString(offset + 1, $tgt);
	}

	/**
	 * SCHD,Schedule,1;INST,Orders,2;ACT,Result,3 SCHD,予定,1;INST,指図,2;ACT,実績,3.<p>
	 *
	 */
	public void tgt(String value) {
		setConstString(offset + 1, $tgt, value);
	}


	/**
	 * DTL,Details,1;HDR,Header,2;Delivery note,3 DTL,明細,1;HDR,ヘッダ,2;DLV,納品書,3.<p>
	 *
	 */
	public String md() {
		return getConstString(offset + 2, $md);
	}

	/**
	 * DTL,Details,1;HDR,Header,2;Delivery note,3 DTL,明細,1;HDR,ヘッダ,2;DLV,納品書,3.<p>
	 *
	 */
	public void md(String value) {
		setConstString(offset + 2, $md, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 3, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 3, $not_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 4, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 4, $inst_flg, value);
	}


	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public boolean p_xfr_flg() {
		return getConstBoolean(offset + 5, $p_xfr_flg);
	}

	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public void p_xfr_flg(boolean value) {
		setConstBoolean(offset + 5, $p_xfr_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean sts_cmpl_flg() {
		return getConstBoolean(offset + 6, $sts_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void sts_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $sts_cmpl_flg, value);
	}


	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public boolean not_alloc_flg() {
		return getConstBoolean(offset + 7, $not_alloc_flg);
	}

	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public void not_alloc_flg(boolean value) {
		setConstBoolean(offset + 7, $not_alloc_flg, value);
	}


	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 8, $alloc_flg);
	}

	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 8, $alloc_flg, value);
	}


	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean schd_not_cmpl_flg() {
		return getConstBoolean(offset + 9, $schd_not_cmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void schd_not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 9, $schd_not_cmpl_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean schd_cmpl_flg() {
		return getConstBoolean(offset + 10, $schd_cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void schd_cmpl_flg(boolean value) {
		setConstBoolean(offset + 10, $schd_cmpl_flg, value);
	}


	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public boolean pick_not_prnt_flg() {
		return getConstBoolean(offset + 11, $pick_not_prnt_flg);
	}

	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public void pick_not_prnt_flg(boolean value) {
		setConstBoolean(offset + 11, $pick_not_prnt_flg, value);
	}


	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnt_flg() {
		return getConstBoolean(offset + 12, $pick_prnt_flg);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $pick_prnt_flg, value);
	}


	/**
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public boolean inst_not_prnt_flg() {
		return getConstBoolean(offset + 13, $inst_not_prnt_flg);
	}

	/**
	 * Order sheet unissued 指図書未発行.<p>
	 *
	 */
	public void inst_not_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $inst_not_prnt_flg, value);
	}


	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 14, $inst_prnt_flg);
	}

	/**
	 * Order sheet issued 指図書発行済.<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 14, $inst_prnt_flg, value);
	}


	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public boolean dlv_not_prnt_flg() {
		return getConstBoolean(offset + 15, $dlv_not_prnt_flg);
	}

	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public void dlv_not_prnt_flg(boolean value) {
		setConstBoolean(offset + 15, $dlv_not_prnt_flg, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 16, $dlv_prnt_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 16, $dlv_prnt_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 17, $wms_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 17, $wms_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 18, $not_wms_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 18, $not_wms_flg, value);
	}


	/**
	 * Scheduled movement date FROM 移動予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate xfr_schd_dt_fr() {
		return getConstDate(offset + 19, $xfr_schd_dt_fr);
	}

	/**
	 * Scheduled movement date FROM 移動予定日ＦＲＯＭ.<p>
	 *
	 */
	public void xfr_schd_dt_fr(MCDate value) {
		setConstDate(offset + 19, $xfr_schd_dt_fr, value);
	}


	/**
	 * Scheduled movement date TO 移動予定日ＴＯ.<p>
	 *
	 */
	public MCDate xfr_schd_dt_to() {
		return getConstDate(offset + 20, $xfr_schd_dt_to);
	}

	/**
	 * Scheduled movement date TO 移動予定日ＴＯ.<p>
	 *
	 */
	public void xfr_schd_dt_to(MCDate value) {
		setConstDate(offset + 20, $xfr_schd_dt_to, value);
	}


	/**
	 * Movement order date FROM 移動指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate xfr_inst_dt_fr() {
		return getConstDate(offset + 21, $xfr_inst_dt_fr);
	}

	/**
	 * Movement order date FROM 移動指図日ＦＲＯＭ.<p>
	 *
	 */
	public void xfr_inst_dt_fr(MCDate value) {
		setConstDate(offset + 21, $xfr_inst_dt_fr, value);
	}


	/**
	 * Movement order date TO 移動指図日ＴＯ.<p>
	 *
	 */
	public MCDate xfr_inst_dt_to() {
		return getConstDate(offset + 22, $xfr_inst_dt_to);
	}

	/**
	 * Movement order date TO 移動指図日ＴＯ.<p>
	 *
	 */
	public void xfr_inst_dt_to(MCDate value) {
		setConstDate(offset + 22, $xfr_inst_dt_to, value);
	}


	/**
	 * Actual movement date FROM 移動実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate xfr_act_dt_fr() {
		return getConstDate(offset + 23, $xfr_act_dt_fr);
	}

	/**
	 * Actual movement date FROM 移動実績日ＦＲＯＭ.<p>
	 *
	 */
	public void xfr_act_dt_fr(MCDate value) {
		setConstDate(offset + 23, $xfr_act_dt_fr, value);
	}


	/**
	 * Actual movement date TO 移動実績日ＴＯ.<p>
	 *
	 */
	public MCDate xfr_act_dt_to() {
		return getConstDate(offset + 24, $xfr_act_dt_to);
	}

	/**
	 * Actual movement date TO 移動実績日ＴＯ.<p>
	 *
	 */
	public void xfr_act_dt_to(MCDate value) {
		setConstDate(offset + 24, $xfr_act_dt_to, value);
	}


	/**
	 * Movement recording date FROM 移動計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate xfr_ac_dt_fr() {
		return getConstDate(offset + 25, $xfr_ac_dt_fr);
	}

	/**
	 * Movement recording date FROM 移動計上日ＦＲＯＭ.<p>
	 *
	 */
	public void xfr_ac_dt_fr(MCDate value) {
		setConstDate(offset + 25, $xfr_ac_dt_fr, value);
	}


	/**
	 * Movement recording date TO 移動計上日ＴＯ.<p>
	 *
	 */
	public MCDate xfr_ac_dt_to() {
		return getConstDate(offset + 26, $xfr_ac_dt_to);
	}

	/**
	 * Movement recording date TO 移動計上日ＴＯ.<p>
	 *
	 */
	public void xfr_ac_dt_to(MCDate value) {
		setConstDate(offset + 26, $xfr_ac_dt_to, value);
	}


	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumber pr_rate_fr() {
		return getConstNumber(offset + 27, $pr_rate_fr);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(MCNumber value) {
		setConstNumber(offset + 27, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(int value) {
		setConstNumber(offset + 27, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(long value) {
		setConstNumber(offset + 27, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(float value) {
		setConstNumber(offset + 27, $pr_rate_fr, value);
	}

	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public void pr_rate_fr(double value) {
		setConstNumber(offset + 27, $pr_rate_fr, value);
	}


	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumber pr_rate_to() {
		return getConstNumber(offset + 28, $pr_rate_to);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(MCNumber value) {
		setConstNumber(offset + 28, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(int value) {
		setConstNumber(offset + 28, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(long value) {
		setConstNumber(offset + 28, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(float value) {
		setConstNumber(offset + 28, $pr_rate_to, value);
	}

	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public void pr_rate_to(double value) {
		setConstNumber(offset + 28, $pr_rate_to, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 29, $abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 29, $abort_flg, value);
	}


	/**
	 * Only data edited by request source 依頼元訂正のみ.<p>
	 *
	 */
	public boolean rqst_mod_flg() {
		return getConstBoolean(offset + 30, $rqst_mod_flg);
	}

	/**
	 * Only data edited by request source 依頼元訂正のみ.<p>
	 *
	 */
	public void rqst_mod_flg(boolean value) {
		setConstBoolean(offset + 30, $rqst_mod_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 31, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 31, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 32, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 32, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 33, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 33, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 34, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 34, $lg_grp_nm, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 35, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 35, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 36, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 36, $gi_loc_nm, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 37, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 37, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 38, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 38, $gi_str_ln_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 39, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 39, $gi_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public String gi_site_nm() {
		return getConstString(offset + 40, $gi_site_nm);
	}

	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public void gi_site_nm(String value) {
		setConstString(offset + 40, $gi_site_nm, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 41, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 41, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public String gi_stk_arrv_bp_nm() {
		return getConstString(offset + 42, $gi_stk_arrv_bp_nm);
	}

	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public void gi_stk_arrv_bp_nm(String value) {
		setConstString(offset + 42, $gi_stk_arrv_bp_nm, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 43, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 43, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 44, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 44, $gr_loc_nm, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 45, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 45, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 46, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 46, $gr_str_ln_nm, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 47, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 47, $gr_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public String gr_site_nm() {
		return getConstString(offset + 48, $gr_site_nm);
	}

	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public void gr_site_nm(String value) {
		setConstString(offset + 48, $gr_site_nm, value);
	}


	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return getConstString(offset + 49, $gr_stk_arrv_bp_cd);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		setConstString(offset + 49, $gr_stk_arrv_bp_cd, value);
	}


	/**
	 * GR inventory arriving point name 入庫在庫着荷先名.<p>
	 *
	 */
	public String gr_stk_arrv_bp_nm() {
		return getConstString(offset + 50, $gr_stk_arrv_bp_nm);
	}

	/**
	 * GR inventory arriving point name 入庫在庫着荷先名.<p>
	 *
	 */
	public void gr_stk_arrv_bp_nm(String value) {
		setConstString(offset + 50, $gr_stk_arrv_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 51, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 51, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 52, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 52, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 53, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 53, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 54, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 54, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 55, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 55, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 56, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 56, $sno_p, row);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 57, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 57, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 58, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 58, $trd_unit_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 59, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 59, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 60, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 60, $base_unit_nm, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 61, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 61, $pckg_unit_cd, value);
	}


	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 62, $pckg_unit_nm);
	}

	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 62, $pckg_unit_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 63, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 63, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 64, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 64, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 65, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 65, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 66, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 66, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 67, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 67, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 68, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 68, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 69, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 69, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 70, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 70, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 71, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 71, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 72, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 72, $stk_bp_nm, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 73, $rqst_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 73, $rqst_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 74, $rqst_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 74, $rqst_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 75, $rqst_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 75, $rqst_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 76, $rqst_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 76, $rqst_dpt_nm, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 77, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 77, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 78, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 78, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 79, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 79, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 80, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 80, $inst_dpt_nm, value);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 81, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 81, $act_usr_cd, value);
	}


	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 82, $act_usr_nm);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 82, $act_usr_nm, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 83, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 83, $act_dpt_cd, value);
	}


	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 84, $act_dpt_nm);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 84, $act_dpt_nm, value);
	}


	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 85, $ship_inst_typ);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 85, $ship_inst_typ, value);
	}


	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public String ship_inst_typ_nm() {
		return getConstString(offset + 86, $ship_inst_typ_nm);
	}

	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public void ship_inst_typ_nm(String value) {
		setConstString(offset + 86, $ship_inst_typ_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 87, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 87, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 88, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 88, $rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 89, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 89, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 90, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 90, $bd_dpt_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 91, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 91, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 92, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 92, $trd_nm, value);
	}


	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 93, $intr_rmrks);
	}

	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 93, $intr_rmrks, value);
	}


	/**
	 * Header transaction remarks ヘッダ取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 94, $trd_rmrks);
	}

	/**
	 * Header transaction remarks ヘッダ取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 94, $trd_rmrks, value);
	}


	/**
	 * Header order remarks ヘッダ指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 95, $inst_rmrks);
	}

	/**
	 * Header order remarks ヘッダ指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 95, $inst_rmrks, value);
	}


	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public String h_sub_char1() {
		return getConstString(offset + 96, $h_sub_char1);
	}

	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public void h_sub_char1(String value) {
		setConstString(offset + 96, $h_sub_char1, value);
	}


	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public String h_sub_char2() {
		return getConstString(offset + 97, $h_sub_char2);
	}

	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public void h_sub_char2(String value) {
		setConstString(offset + 97, $h_sub_char2, value);
	}


	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public String h_sub_char3() {
		return getConstString(offset + 98, $h_sub_char3);
	}

	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public void h_sub_char3(String value) {
		setConstString(offset + 98, $h_sub_char3, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 99, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 99, $intr_d_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 100, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 100, $trd_d_rmrks, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 101, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 101, $inst_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 102, $d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 102, $d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 103, $d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 103, $d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 104, $d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 104, $d_sub_char3, value);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String rqst_cnt_rmrks() {
		return getConstString(offset + 105, $rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void rqst_cnt_rmrks(String value) {
		setConstString(offset + 105, $rqst_cnt_rmrks, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 106, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 106, $ship_cnt_rmrks, value);
	}


	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public String schd_intr_rmrks() {
		return getConstString(offset + 107, $schd_intr_rmrks);
	}

	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public void schd_intr_rmrks(String value) {
		setConstString(offset + 107, $schd_intr_rmrks, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 108, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 108, $xfr_src_typ, value);
	}


	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public String xfr_src_typ_nm() {
		return getConstString(offset + 109, $xfr_src_typ_nm);
	}

	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public void xfr_src_typ_nm(String value) {
		setConstString(offset + 109, $xfr_src_typ_nm, value);
	}


	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 110, $xfr_src_no);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 110, $xfr_src_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 111, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 111, $xfr_schd_no, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 112, $xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 112, $xfr_alloc_sts_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 113, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 113, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 114, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 114, $dlv_slip_d_no, value);
	}


	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return getConstString(offset + 115, $xfr_inst_no);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		setConstString(offset + 115, $xfr_inst_no, value);
	}


	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return getConstString(offset + 116, $xfr_inst_d_no);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		setConstString(offset + 116, $xfr_inst_d_no, value);
	}


	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public String xfr_act_no() {
		return getConstString(offset + 117, $xfr_act_no);
	}

	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public void xfr_act_no(String value) {
		setConstString(offset + 117, $xfr_act_no, value);
	}


	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return getConstString(offset + 118, $xfr_act_d_no);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		setConstString(offset + 118, $xfr_act_d_no, value);
	}


	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public String ext_xfr_act_no() {
		return getConstString(offset + 119, $ext_xfr_act_no);
	}

	/**
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public void ext_xfr_act_no(String value) {
		setConstString(offset + 119, $ext_xfr_act_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 120, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 120, $slo_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 121, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 121, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 122, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 122, $oper_inst_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 123, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 123, $io_schd_pr_no, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 124, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 124, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tgt.equalsIgnoreCase(name)) {
			return tgt();
		}
		if ($md.equalsIgnoreCase(name)) {
			return md();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
		}
		if ($gr_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($h_sub_char1.equalsIgnoreCase(name)) {
			return h_sub_char1();
		}
		if ($h_sub_char2.equalsIgnoreCase(name)) {
			return h_sub_char2();
		}
		if ($h_sub_char3.equalsIgnoreCase(name)) {
			return h_sub_char3();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($ext_xfr_act_no.equalsIgnoreCase(name)) {
			return ext_xfr_act_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($xfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return xfr_schd_dt_fr();
		}
		if ($xfr_schd_dt_to.equalsIgnoreCase(name)) {
			return xfr_schd_dt_to();
		}
		if ($xfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return xfr_inst_dt_fr();
		}
		if ($xfr_inst_dt_to.equalsIgnoreCase(name)) {
			return xfr_inst_dt_to();
		}
		if ($xfr_act_dt_fr.equalsIgnoreCase(name)) {
			return xfr_act_dt_fr();
		}
		if ($xfr_act_dt_to.equalsIgnoreCase(name)) {
			return xfr_act_dt_to();
		}
		if ($xfr_ac_dt_fr.equalsIgnoreCase(name)) {
			return xfr_ac_dt_fr();
		}
		if ($xfr_ac_dt_to.equalsIgnoreCase(name)) {
			return xfr_ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($p_xfr_flg.equalsIgnoreCase(name)) {
			return p_xfr_flg();
		}
		if ($sts_cmpl_flg.equalsIgnoreCase(name)) {
			return sts_cmpl_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($schd_not_cmpl_flg.equalsIgnoreCase(name)) {
			return schd_not_cmpl_flg();
		}
		if ($schd_cmpl_flg.equalsIgnoreCase(name)) {
			return schd_cmpl_flg();
		}
		if ($pick_not_prnt_flg.equalsIgnoreCase(name)) {
			return pick_not_prnt_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_not_prnt_flg.equalsIgnoreCase(name)) {
			return inst_not_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_not_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_not_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tgt.equalsIgnoreCase(name)) {
			return tgt();
		}
		if ($md.equalsIgnoreCase(name)) {
			return md();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_cd();
		}
		if ($gr_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gr_stk_arrv_bp_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($h_sub_char1.equalsIgnoreCase(name)) {
			return h_sub_char1();
		}
		if ($h_sub_char2.equalsIgnoreCase(name)) {
			return h_sub_char2();
		}
		if ($h_sub_char3.equalsIgnoreCase(name)) {
			return h_sub_char3();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return rqst_cnt_rmrks();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			return schd_intr_rmrks();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			return xfr_act_no();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($ext_xfr_act_no.equalsIgnoreCase(name)) {
			return ext_xfr_act_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($xfr_schd_dt_fr.equalsIgnoreCase(name)) {
			return xfr_schd_dt_fr();
		}
		if ($xfr_schd_dt_to.equalsIgnoreCase(name)) {
			return xfr_schd_dt_to();
		}
		if ($xfr_inst_dt_fr.equalsIgnoreCase(name)) {
			return xfr_inst_dt_fr();
		}
		if ($xfr_inst_dt_to.equalsIgnoreCase(name)) {
			return xfr_inst_dt_to();
		}
		if ($xfr_act_dt_fr.equalsIgnoreCase(name)) {
			return xfr_act_dt_fr();
		}
		if ($xfr_act_dt_to.equalsIgnoreCase(name)) {
			return xfr_act_dt_to();
		}
		if ($xfr_ac_dt_fr.equalsIgnoreCase(name)) {
			return xfr_ac_dt_fr();
		}
		if ($xfr_ac_dt_to.equalsIgnoreCase(name)) {
			return xfr_ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($p_xfr_flg.equalsIgnoreCase(name)) {
			return p_xfr_flg();
		}
		if ($sts_cmpl_flg.equalsIgnoreCase(name)) {
			return sts_cmpl_flg();
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($schd_not_cmpl_flg.equalsIgnoreCase(name)) {
			return schd_not_cmpl_flg();
		}
		if ($schd_cmpl_flg.equalsIgnoreCase(name)) {
			return schd_cmpl_flg();
		}
		if ($pick_not_prnt_flg.equalsIgnoreCase(name)) {
			return pick_not_prnt_flg();
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			return pick_prnt_flg();
		}
		if ($inst_not_prnt_flg.equalsIgnoreCase(name)) {
			return inst_not_prnt_flg();
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($dlv_not_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_not_prnt_flg();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tgt.equalsIgnoreCase(name)) {
			tgt(value);
			return;
		}
		if ($md.equalsIgnoreCase(name)) {
			md(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_nm(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($h_sub_char1.equalsIgnoreCase(name)) {
			h_sub_char1(value);
			return;
		}
		if ($h_sub_char2.equalsIgnoreCase(name)) {
			h_sub_char2(value);
			return;
		}
		if ($h_sub_char3.equalsIgnoreCase(name)) {
			h_sub_char3(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
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
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($ext_xfr_act_no.equalsIgnoreCase(name)) {
			ext_xfr_act_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($xfr_schd_dt_fr.equalsIgnoreCase(name)) {
			xfr_schd_dt_fr(value);
			return;
		}
		if ($xfr_schd_dt_to.equalsIgnoreCase(name)) {
			xfr_schd_dt_to(value);
			return;
		}
		if ($xfr_inst_dt_fr.equalsIgnoreCase(name)) {
			xfr_inst_dt_fr(value);
			return;
		}
		if ($xfr_inst_dt_to.equalsIgnoreCase(name)) {
			xfr_inst_dt_to(value);
			return;
		}
		if ($xfr_act_dt_fr.equalsIgnoreCase(name)) {
			xfr_act_dt_fr(value);
			return;
		}
		if ($xfr_act_dt_to.equalsIgnoreCase(name)) {
			xfr_act_dt_to(value);
			return;
		}
		if ($xfr_ac_dt_fr.equalsIgnoreCase(name)) {
			xfr_ac_dt_fr(value);
			return;
		}
		if ($xfr_ac_dt_to.equalsIgnoreCase(name)) {
			xfr_ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($p_xfr_flg.equalsIgnoreCase(name)) {
			p_xfr_flg(value);
			return;
		}
		if ($sts_cmpl_flg.equalsIgnoreCase(name)) {
			sts_cmpl_flg(value);
			return;
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($schd_not_cmpl_flg.equalsIgnoreCase(name)) {
			schd_not_cmpl_flg(value);
			return;
		}
		if ($schd_cmpl_flg.equalsIgnoreCase(name)) {
			schd_cmpl_flg(value);
			return;
		}
		if ($pick_not_prnt_flg.equalsIgnoreCase(name)) {
			pick_not_prnt_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_not_prnt_flg.equalsIgnoreCase(name)) {
			inst_not_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_not_prnt_flg.equalsIgnoreCase(name)) {
			dlv_not_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tgt.equalsIgnoreCase(name)) {
			tgt(value);
			return;
		}
		if ($md.equalsIgnoreCase(name)) {
			md(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			gi_site_nm(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($gr_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gr_stk_arrv_bp_nm(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($h_sub_char1.equalsIgnoreCase(name)) {
			h_sub_char1(value);
			return;
		}
		if ($h_sub_char2.equalsIgnoreCase(name)) {
			h_sub_char2(value);
			return;
		}
		if ($h_sub_char3.equalsIgnoreCase(name)) {
			h_sub_char3(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($schd_intr_rmrks.equalsIgnoreCase(name)) {
			schd_intr_rmrks(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
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
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_act_no.equalsIgnoreCase(name)) {
			xfr_act_no(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($ext_xfr_act_no.equalsIgnoreCase(name)) {
			ext_xfr_act_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($xfr_schd_dt_fr.equalsIgnoreCase(name)) {
			xfr_schd_dt_fr(value);
			return;
		}
		if ($xfr_schd_dt_to.equalsIgnoreCase(name)) {
			xfr_schd_dt_to(value);
			return;
		}
		if ($xfr_inst_dt_fr.equalsIgnoreCase(name)) {
			xfr_inst_dt_fr(value);
			return;
		}
		if ($xfr_inst_dt_to.equalsIgnoreCase(name)) {
			xfr_inst_dt_to(value);
			return;
		}
		if ($xfr_act_dt_fr.equalsIgnoreCase(name)) {
			xfr_act_dt_fr(value);
			return;
		}
		if ($xfr_act_dt_to.equalsIgnoreCase(name)) {
			xfr_act_dt_to(value);
			return;
		}
		if ($xfr_ac_dt_fr.equalsIgnoreCase(name)) {
			xfr_ac_dt_fr(value);
			return;
		}
		if ($xfr_ac_dt_to.equalsIgnoreCase(name)) {
			xfr_ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($p_xfr_flg.equalsIgnoreCase(name)) {
			p_xfr_flg(value);
			return;
		}
		if ($sts_cmpl_flg.equalsIgnoreCase(name)) {
			sts_cmpl_flg(value);
			return;
		}
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($schd_not_cmpl_flg.equalsIgnoreCase(name)) {
			schd_not_cmpl_flg(value);
			return;
		}
		if ($schd_cmpl_flg.equalsIgnoreCase(name)) {
			schd_cmpl_flg(value);
			return;
		}
		if ($pick_not_prnt_flg.equalsIgnoreCase(name)) {
			pick_not_prnt_flg(value);
			return;
		}
		if ($pick_prnt_flg.equalsIgnoreCase(name)) {
			pick_prnt_flg(value);
			return;
		}
		if ($inst_not_prnt_flg.equalsIgnoreCase(name)) {
			inst_not_prnt_flg(value);
			return;
		}
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($dlv_not_prnt_flg.equalsIgnoreCase(name)) {
			dlv_not_prnt_flg(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
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
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
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
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
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
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_nm() {
		return itm_typ_p().itm_typ_nm();
	}

	public void itm_typ_nm(String value) {
		itm_typ_p().itm_typ_nm(value);
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

