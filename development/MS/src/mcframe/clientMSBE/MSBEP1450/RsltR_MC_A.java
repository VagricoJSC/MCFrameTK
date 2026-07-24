package mcframe.clientMSBE.MSBEP1450;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	public static final String $ship_p = "ship_p";
	public static final String $dlv_p = "dlv_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $ship_inst_p = "ship_inst_p";
	public static final String $ship_schd_p = "ship_schd_p";
	public static final String $dlv_schd_p = "dlv_schd_p";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_prnt_flg = "dlv_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $adv_prnt_flg = "adv_prnt_flg";
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	public static final String $ship_to_p = "ship_to_p";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $dlv_str_ln_cd = "dlv_str_ln_cd";
	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public static final String $dlv_str_ln_nm = "dlv_str_ln_nm";
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
	 * Request PIC cd. 依頼担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_usr_cd = "rqst_usr_cd";
	/**
	 * Request PIC name 依頼担当者名.<p>
	 *
	 */
	public static final String $rqst_usr_nm = "rqst_usr_nm";
	/**
	 * Request dept. cd. 依頼部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_dpt_cd = "rqst_dpt_cd";
	/**
	 * Request dept. name 依頼部門名.<p>
	 *
	 */
	public static final String $rqst_dpt_nm = "rqst_dpt_nm";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	public static final String $sno_p = "sno_p";
	public static final String $ver_p = "ver_p";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	public static final String $qty_p = "qty_p";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $base_qty_p = "base_qty_p";
	public static final String $schd_qty_p = "schd_qty_p";
	public static final String $inst_qty_p = "inst_qty_p";
	public static final String $act_cont_p = "act_cont_p";
	public static final String $act_fctr_p = "act_fctr_p";
	public static final String $std_cont_p = "std_cont_p";
	public static final String $std_fctr_p = "std_fctr_p";
	public static final String $cont_unit_p = "cont_unit_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	public static final String $dlv_rqst_p = "dlv_rqst_p";
	public static final String $pd_inst_dlv_p = "pd_inst_dlv_p";
	/**
	 * Arrival day type (Week) 着曜日区分.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
	public static final String $ship_rqst_p = "ship_rqst_p";
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public static final String $base_dlv_slip_no = "base_dlv_slip_no";
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public static final String $base_prov_act_no = "base_prov_act_no";
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
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
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	public static final String $ship_str_ln_p = "ship_str_ln_p";
	public static final String $lot_no_p = "lot_no_p";
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
	 * Number of details 明細数.<p>
	 *
	 */
	public static final String $d_cnt = "d_cnt";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $wt = "wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $dim = "dim";
	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public static final String $slip_cnt = "slip_cnt";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_d_no = "ship_act_d_no";
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
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_ship_act_no = "ext_ship_act_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public static final String $ship_inst_disp_seq = "ship_inst_disp_seq";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
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
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnted_flg = "dlv_prnted_flg";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $adv_prnted_flg = "adv_prnted_flg";
	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public static final String $non_dlv_prnt_flg = "non_dlv_prnt_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
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
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $rts_msg_p = "rts_msg_p";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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

	public static final String $ship_dt = $ship_p + ".ymd";
	public static final String $ship_hm = $ship_p + ".hm";
	public static final String $dlv_dt = $dlv_p + ".ymd";
	public static final String $dlv_hm = $dlv_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $ship_inst_dt = $ship_inst_p + ".ymd";
	public static final String $ship_inst_hm = $ship_inst_p + ".hm";
	public static final String $ship_schd_dt = $ship_schd_p + ".ymd";
	public static final String $ship_schd_hm = $ship_schd_p + ".hm";
	public static final String $dlv_schd_dt = $dlv_schd_p + ".ymd";
	public static final String $dlv_schd_hm = $dlv_schd_p + ".hm";
	public static final String $show_dtl = $ship_to_p + ".show_dtl";
	public static final String $ship_to_id_cd = $ship_to_p + ".bp_cd";
	public static final String $ship_to_id_nm = $ship_to_p + ".bp_nm";
	public static final String $ship_to_sundry_flg = $ship_to_p + ".dlv_sundry_flg";
	public static final String $pri_prnt_flg = $ship_to_p + ".pri_prnt_flg";
	public static final String $ship_to_lg_grp_cd = $ship_to_p + ".lg_grp_cd";
	public static final String $ship_to_lg_grp_nm = $ship_to_p + ".lg_grp_nm";
	public static final String $ship_to_cntry_cd = $ship_to_p + ".cntry_cd";
	public static final String $ship_to_cntry_nm = $ship_to_p + ".cntry_nm";
	public static final String $ship_to_zip_cd = $ship_to_p + ".zip_cd";
	public static final String $ship_to_addr1 = $ship_to_p + ".addr1";
	public static final String $ship_to_addr2 = $ship_to_p + ".addr2";
	public static final String $ship_to_addr3 = $ship_to_p + ".addr3";
	public static final String $ship_to_addr4 = $ship_to_p + ".addr4";
	public static final String $ship_to_tel = $ship_to_p + ".tel";
	public static final String $ship_to_fax = $ship_to_p + ".fax";
	public static final String $ship_to_cntct_dpt = $ship_to_p + ".dlv_cntct_dpt";
	public static final String $ship_to_cntct_psn = $ship_to_p + ".dlv_cntct_psn";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $ver_no = $ver_p + ".ver_no";
	public static final String $trd_unit_qty = $qty_p + ".qty";
	public static final String $base_unit_qty = $base_qty_p + ".qty";
	public static final String $schd_qty = $schd_qty_p + ".qty";
	public static final String $inst_qty = $inst_qty_p + ".qty";
	public static final String $act_cont_qty = $act_cont_p + ".cont_qty";
	public static final String $act_cont_fctr = $act_fctr_p + ".act_cont_fctr";
	public static final String $std_cont_qty = $std_cont_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_fctr_p + ".std_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_unit_p + ".cont_fctr_unit_nm";
	public static final String $dlv_rqst_dt = $dlv_rqst_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_p + ".hm";
	public static final String $pd_inst_dlv_dt = $pd_inst_dlv_p + ".ymd";
	public static final String $pd_inst_dlv_hm = $pd_inst_dlv_p + ".hm";
	public static final String $ship_rqst_dt = $ship_rqst_p + ".ymd";
	public static final String $ship_rqst_hm = $ship_rqst_p + ".hm";
	public static final String $ship_str_ln_cd = $ship_str_ln_p + ".str_ln_cd";
	public static final String $ship_str_ln_nm = $ship_str_ln_p + ".str_ln_nm";
	public static final String $ship_str_ln_cd_none_flg = $ship_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $act_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $act_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $act_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $act_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta ship_p_META = createInnerRowMeta($ship_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta ship_inst_p_META = createInnerRowMeta($ship_inst_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ship_schd_p_META = createInnerRowMeta($ship_schd_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta dlv_schd_p_META = createInnerRowMeta($dlv_schd_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta dlv_prnt_flg_META = createCommonMeta($dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnt_flg_META = createCommonMeta($adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_p_META = createInnerRowMeta($ship_to_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_str_ln_cd_META = createCommonMeta($dlv_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta dlv_str_ln_nm_META = createCommonMeta($dlv_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_usr_cd_META = createCommonMeta($rqst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_usr_nm_META = createCommonMeta($rqst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_dpt_cd_META = createCommonMeta($rqst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dpt_nm_META = createCommonMeta($rqst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta ver_p_META = createInnerRowMeta($ver_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_qty_p_META = createInnerRowMeta($base_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_qty_p_META = createInnerRowMeta($schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta act_cont_p_META = createInnerRowMeta($act_cont_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta act_fctr_p_META = createInnerRowMeta($act_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta std_cont_p_META = createInnerRowMeta($std_cont_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_fctr_p_META = createInnerRowMeta($std_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_unit_p_META = createInnerRowMeta($cont_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dlv_rqst_p_META = createInnerRowMeta($dlv_rqst_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta pd_inst_dlv_p_META = createInnerRowMeta($pd_inst_dlv_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta dlv_day_week_typ_nm_META = createCommonMeta($dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta ship_rqst_p_META = createInnerRowMeta($ship_rqst_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_p_META = createInnerRowMeta($ship_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
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
	public static final MCMeta d_cnt_META = createCommonMeta($d_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta slip_cnt_META = createCommonMeta($slip_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_ship_act_no_META = createCommonMeta($ext_ship_act_no, mcframe.commonMA.meta.MA_META.EXT_SHIP_ACT_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_inst_disp_seq_META = createCommonMeta($ship_inst_disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta dlv_prnted_flg_META = createCommonMeta($dlv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnted_flg_META = createCommonMeta($adv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_dlv_prnt_flg_META = createCommonMeta($non_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR3);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_ACT_INTR_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR3);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			trd_cd_META,
			trd_nm_META,
			ship_p_META,
			dlv_p_META,
			ac_dt_p_META,
			ship_inst_p_META,
			ship_schd_p_META,
			dlv_schd_p_META,
			ship_term_cd_META,
			ship_term_nm_META,
			dlv_prnt_flg_META,
			adv_prnt_flg_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_p_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_str_ln_cd_META,
			dlv_str_ln_nm_META,
			cst_cd_META,
			cst_nm_META,
			rqst_usr_cd_META,
			rqst_usr_nm_META,
			rqst_dpt_cd_META,
			rqst_dpt_nm_META,
			slo_no_META,
			iv_no_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			sno_p_META,
			ver_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_qty_p_META,
			schd_qty_p_META,
			inst_qty_p_META,
			act_cont_p_META,
			act_fctr_p_META,
			std_cont_p_META,
			std_fctr_p_META,
			cont_unit_p_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			dlv_rqst_p_META,
			pd_inst_dlv_p_META,
			dlv_day_week_typ_META,
			dlv_day_week_typ_nm_META,
			ship_rqst_p_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			ship_cnt_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_p_META,
			lot_no_p_META,
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
			d_cnt_META,
			wt_META,
			dim_META,
			slip_cnt_META,
			ship_act_no_META,
			ship_act_d_no_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_ship_act_no_META,
			disp_seq_META,
			ship_inst_no_META,
			wms_flg_META,
			ship_inst_d_no_META,
			ship_inst_disp_seq_META,
			ship_schd_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			dlv_slip_d_no_META,
			usr_dpt_p_META,
			dlv_prnted_flg_META,
			adv_prnted_flg_META,
			non_dlv_prnt_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			intr_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			can_flg_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			itm_grp_p_META,
			rts_msg_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"ship_dt",
				"ship_hm",
				"dlv_dt",
				"dlv_hm",
				"ac_dt",
				"ship_inst_dt",
				"ship_inst_hm",
				"ship_schd_dt",
				"ship_schd_hm",
				"dlv_schd_dt",
				"dlv_schd_hm",
				"ship_to_id_cd",
				"ship_to_id_nm",
				"ship_to_sundry_flg",
				"pri_prnt_flg",
				"ship_to_lg_grp_cd",
				"ship_to_lg_grp_nm",
				"ship_to_cntry_cd",
				"ship_to_cntry_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_tel",
				"ship_to_fax",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ver_no",
				"trd_unit_qty",
				"base_unit_qty",
				"schd_qty",
				"inst_qty",
				"act_cont_qty",
				"act_cont_fctr",
				"std_cont_qty",
				"std_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"dlv_rqst_dt",
				"dlv_rqst_hm",
				"pd_inst_dlv_dt",
				"pd_inst_dlv_hm",
				"ship_rqst_dt",
				"ship_rqst_hm",
				"ship_str_ln_cd",
				"ship_str_ln_nm",
				"ship_str_ln_cd_none_flg",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_cd10",
				"cst_grp_nm10",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_cd10",
				"itm_grp_nm10",
				"rtn_sts_typ"
			},
			{
				$ship_dt,
				$ship_hm,
				$dlv_dt,
				$dlv_hm,
				$ac_dt,
				$ship_inst_dt,
				$ship_inst_hm,
				$ship_schd_dt,
				$ship_schd_hm,
				$dlv_schd_dt,
				$dlv_schd_hm,
				$ship_to_id_cd,
				$ship_to_id_nm,
				$ship_to_sundry_flg,
				$pri_prnt_flg,
				$ship_to_lg_grp_cd,
				$ship_to_lg_grp_nm,
				$ship_to_cntry_cd,
				$ship_to_cntry_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_tel,
				$ship_to_fax,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ver_no,
				$trd_unit_qty,
				$base_unit_qty,
				$schd_qty,
				$inst_qty,
				$act_cont_qty,
				$act_cont_fctr,
				$std_cont_qty,
				$std_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$dlv_rqst_dt,
				$dlv_rqst_hm,
				$pd_inst_dlv_dt,
				$pd_inst_dlv_hm,
				$ship_rqst_dt,
				$ship_rqst_hm,
				$ship_str_ln_cd,
				$ship_str_ln_nm,
				$ship_str_ln_cd_none_flg,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_cd10,
				$cst_grp_nm10,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_cd10,
				$itm_grp_nm10,
				$rtn_sts_typ
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
				{$ship_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// ship_str_ln_p.str_ln_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ship_str_ln_p + ".str_ln_cd", "ship_loc_cd;true"},	// ship_str_ln_p.str_ln_cd
				{$usr_dpt_p + ".dpt_cd", "ship_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.SHIP"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ship_str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// ship_str_ln_p.str_ln_cd
				{$usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"},	// ship_fr_lg_grp_nm
				{$ship_to_p + ".lg_grp_cd", "LG_GRP"},	// ship_to_p.lg_grp_cd
				{$ship_to_p + ".lg_grp_nm", "LG_GRP"},	// ship_to_p.lg_grp_nm
				{$dlv_str_ln_cd, "STR_LN"},	// dlv_str_ln_cd
				{$dlv_str_ln_nm, "STR_LN"},	// dlv_str_ln_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_qty_p + ".qty", "BASE_UNIT"},	// base_qty_p.qty
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 1, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 1, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 2, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 2, $trd_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 3, $ship_p);
	}
	
	public void ship_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 3, $ship_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 4, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 4, $dlv_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 5, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 5, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_inst_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 6, $ship_inst_p);
	}
	
	public void ship_inst_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 6, $ship_inst_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_schd_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 7, $ship_schd_p);
	}
	
	public void ship_schd_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 7, $ship_schd_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_schd_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 8, $dlv_schd_p);
	}
	
	public void dlv_schd_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 8, $dlv_schd_p, row);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 9, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 9, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 10, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 10, $ship_term_nm, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_prnt_flg() {
		return getConstBoolean(offset + 11, $dlv_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 11, $dlv_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean adv_prnt_flg() {
		return getConstBoolean(offset + 12, $adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $adv_prnt_flg, value);
	}


	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 13, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 13, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 14, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 14, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 15, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 15, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 16, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 16, $ship_to_id_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR ship_to_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 17, $ship_to_p);
	}
	
	public void ship_to_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 17, $ship_to_p, row);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 18, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 18, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 19, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 19, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 20, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 20, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 21, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 21, $dlv_id_nm, value);
	}


	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return getConstString(offset + 22, $dlv_str_ln_cd);
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		setConstString(offset + 22, $dlv_str_ln_cd, value);
	}


	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public String dlv_str_ln_nm() {
		return getConstString(offset + 23, $dlv_str_ln_nm);
	}

	/**
	 * Delivery rack/line name 納品棚・ライン名.<p>
	 *
	 */
	public void dlv_str_ln_nm(String value) {
		setConstString(offset + 23, $dlv_str_ln_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 24, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 24, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 25, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 25, $cst_nm, value);
	}


	/**
	 * Request PIC cd. 依頼担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return getConstString(offset + 26, $rqst_usr_cd);
	}

	/**
	 * Request PIC cd. 依頼担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		setConstString(offset + 26, $rqst_usr_cd, value);
	}


	/**
	 * Request PIC name 依頼担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return getConstString(offset + 27, $rqst_usr_nm);
	}

	/**
	 * Request PIC name 依頼担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		setConstString(offset + 27, $rqst_usr_nm, value);
	}


	/**
	 * Request dept. cd. 依頼部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return getConstString(offset + 28, $rqst_dpt_cd);
	}

	/**
	 * Request dept. cd. 依頼部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		setConstString(offset + 28, $rqst_dpt_cd, value);
	}


	/**
	 * Request dept. name 依頼部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return getConstString(offset + 29, $rqst_dpt_nm);
	}

	/**
	 * Request dept. name 依頼部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		setConstString(offset + 29, $rqst_dpt_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 30, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 30, $slo_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 31, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 31, $iv_no, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 32, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 32, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 33, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 33, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 34, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 34, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 35, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 35, $sno_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 36, $ver_p);
	}
	
	public void ver_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 36, $ver_p, row);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 37, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 37, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 38, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 38, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 39, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 39, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 39, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 39, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 39, $trd_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 41, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 41, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 42, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 42, $base_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 43, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 43, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $base_qty_p);
	}
	
	public void base_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $schd_qty_p);
	}
	
	public void schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 47, $act_cont_p);
	}
	
	public void act_cont_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 47, $act_cont_p, row);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 48, $act_fctr_p);
	}
	
	public void act_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 48, $act_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 49, $std_cont_p);
	}
	
	public void std_cont_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 49, $std_cont_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 50, $std_fctr_p);
	}
	
	public void std_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 50, $std_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 51, $cont_unit_p);
	}
	
	public void cont_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 51, $cont_unit_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 52, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 52, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 53, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 53, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 54, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 54, $cont_fctr_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_rqst_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 55, $dlv_rqst_p);
	}
	
	public void dlv_rqst_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 55, $dlv_rqst_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR pd_inst_dlv_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 56, $pd_inst_dlv_p);
	}
	
	public void pd_inst_dlv_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 56, $pd_inst_dlv_p, row);
	}


	/**
	 * Arrival day type (Week) 着曜日区分.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 57, $dlv_day_week_typ);
	}

	/**
	 * Arrival day type (Week) 着曜日区分.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 57, $dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ_nm() {
		return getConstString(offset + 58, $dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ_nm(String value) {
		setConstString(offset + 58, $dlv_day_week_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR ship_rqst_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 59, $ship_rqst_p);
	}
	
	public void ship_rqst_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 59, $ship_rqst_p, row);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 60, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 60, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 61, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 61, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 62, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 62, $base_ac_dt, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 63, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 63, $ship_cnt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 64, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 64, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 65, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 65, $trd_d_rmrks, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 66, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 66, $ship_loc_cd, value);
	}


	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 67, $ship_loc_nm);
	}

	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 67, $ship_loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR ship_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 68, $ship_str_ln_p);
	}
	
	public void ship_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 68, $ship_str_ln_p, row);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 69, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 69, $lot_no_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 70, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 70, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 71, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 71, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 72, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 72, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 73, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 73, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 74, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 74, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 75, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 75, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 76, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 76, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 77, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 77, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 78, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 78, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 79, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 79, $stk_bp_nm, value);
	}


	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public MCNumber d_cnt() {
		return getConstNumber(offset + 80, $d_cnt);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void d_cnt(MCNumber value) {
		setConstNumber(offset + 80, $d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void d_cnt(int value) {
		setConstNumber(offset + 80, $d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void d_cnt(long value) {
		setConstNumber(offset + 80, $d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void d_cnt(float value) {
		setConstNumber(offset + 80, $d_cnt, value);
	}

	/**
	 * Number of details 明細数.<p>
	 *
	 */
	public void d_cnt(double value) {
		setConstNumber(offset + 80, $d_cnt, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 81, $wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 81, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 81, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 81, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 81, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 81, $wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 82, $dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 82, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 82, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 82, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 82, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 82, $dim, value);
	}


	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public MCNumber slip_cnt() {
		return getConstNumber(offset + 83, $slip_cnt);
	}

	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public void slip_cnt(MCNumber value) {
		setConstNumber(offset + 83, $slip_cnt, value);
	}

	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public void slip_cnt(int value) {
		setConstNumber(offset + 83, $slip_cnt, value);
	}

	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public void slip_cnt(long value) {
		setConstNumber(offset + 83, $slip_cnt, value);
	}

	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public void slip_cnt(float value) {
		setConstNumber(offset + 83, $slip_cnt, value);
	}

	/**
	 * Number of slips 伝票枚数.<p>
	 *
	 */
	public void slip_cnt(double value) {
		setConstNumber(offset + 83, $slip_cnt, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 84, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 84, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 85, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 85, $ship_act_d_no, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 86, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 86, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 87, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 87, $ext_sys_nm, value);
	}


	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public String ext_ship_act_no() {
		return getConstString(offset + 88, $ext_ship_act_no);
	}

	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public void ext_ship_act_no(String value) {
		setConstString(offset + 88, $ext_ship_act_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 89, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 89, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 89, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 89, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 89, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 89, $disp_seq, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 90, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 90, $ship_inst_no, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 91, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 91, $wms_flg, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 92, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 92, $ship_inst_d_no, value);
	}


	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public MCNumber ship_inst_disp_seq() {
		return getConstNumber(offset + 93, $ship_inst_disp_seq);
	}

	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public void ship_inst_disp_seq(MCNumber value) {
		setConstNumber(offset + 93, $ship_inst_disp_seq, value);
	}

	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public void ship_inst_disp_seq(int value) {
		setConstNumber(offset + 93, $ship_inst_disp_seq, value);
	}

	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public void ship_inst_disp_seq(long value) {
		setConstNumber(offset + 93, $ship_inst_disp_seq, value);
	}

	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public void ship_inst_disp_seq(float value) {
		setConstNumber(offset + 93, $ship_inst_disp_seq, value);
	}

	/**
	 * Shipping order display sequence 出荷指図表示順.<p>
	 *
	 */
	public void ship_inst_disp_seq(double value) {
		setConstNumber(offset + 93, $ship_inst_disp_seq, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 94, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 94, $ship_schd_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 95, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 95, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 96, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 96, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 96, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 96, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 96, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 96, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 97, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 97, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 97, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 97, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 97, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 97, $dlv_slip_rev, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 98, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 98, $dlv_slip_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 99, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 99, $usr_dpt_p, row);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnted_flg() {
		return getConstBoolean(offset + 100, $dlv_prnted_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnted_flg(boolean value) {
		setConstBoolean(offset + 100, $dlv_prnted_flg, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean adv_prnted_flg() {
		return getConstBoolean(offset + 101, $adv_prnted_flg);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void adv_prnted_flg(boolean value) {
		setConstBoolean(offset + 101, $adv_prnted_flg, value);
	}


	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public boolean non_dlv_prnt_flg() {
		return getConstBoolean(offset + 102, $non_dlv_prnt_flg);
	}

	/**
	 * Do not allow delivery note issue 納品書発行不可.<p>
	 *
	 */
	public void non_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 102, $non_dlv_prnt_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 103, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 103, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 104, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 104, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 105, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 105, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 106, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 106, $sub_char3, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 107, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 107, $intr_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 108, $d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 108, $d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 109, $d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 109, $d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 110, $d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 110, $d_sub_char3, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 111, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 111, $can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 112, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 112, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 113, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 113, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 114, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 114, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 115, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 115, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 116, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 116, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 117, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 117, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 118, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 118, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 119, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 119, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 120, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 120, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 121, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 121, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 121, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 121, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 121, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 121, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 122, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 122, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 123, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 123, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 124, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 124, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 125, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 125, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 126, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 126, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 127, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 127, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($dlv_str_ln_nm.equalsIgnoreCase(name)) {
			return dlv_str_ln_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
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
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_ship_act_no.equalsIgnoreCase(name)) {
			return ext_ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			return slip_cnt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			return ship_inst_disp_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_prnted_flg();
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			return adv_prnted_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($dlv_str_ln_nm.equalsIgnoreCase(name)) {
			return dlv_str_ln_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
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
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_ship_act_no.equalsIgnoreCase(name)) {
			return ext_ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			return d_cnt();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			return slip_cnt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			return ship_inst_disp_seq();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_prnt_flg();
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			return adv_prnt_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_prnted_flg();
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			return adv_prnted_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($dlv_str_ln_nm.equalsIgnoreCase(name)) {
			dlv_str_ln_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
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
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
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
		if ($ext_ship_act_no.equalsIgnoreCase(name)) {
			ext_ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			dlv_prnted_flg(value);
			return;
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			adv_prnted_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($dlv_str_ln_nm.equalsIgnoreCase(name)) {
			dlv_str_ln_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
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
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			ship_act_d_no(value);
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
		if ($ext_ship_act_no.equalsIgnoreCase(name)) {
			ext_ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($d_cnt.equalsIgnoreCase(name)) {
			d_cnt(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($slip_cnt.equalsIgnoreCase(name)) {
			slip_cnt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($ship_inst_disp_seq.equalsIgnoreCase(name)) {
			ship_inst_disp_seq(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($dlv_prnt_flg.equalsIgnoreCase(name)) {
			dlv_prnt_flg(value);
			return;
		}
		if ($adv_prnt_flg.equalsIgnoreCase(name)) {
			adv_prnt_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($dlv_prnted_flg.equalsIgnoreCase(name)) {
			dlv_prnted_flg(value);
			return;
		}
		if ($adv_prnted_flg.equalsIgnoreCase(name)) {
			adv_prnted_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_p.equalsIgnoreCase(name)) {
			return ship_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($ship_inst_p.equalsIgnoreCase(name)) {
			return ship_inst_p();
		}
		if ($ship_schd_p.equalsIgnoreCase(name)) {
			return ship_schd_p();
		}
		if ($dlv_schd_p.equalsIgnoreCase(name)) {
			return dlv_schd_p();
		}
		if ($ship_to_p.equalsIgnoreCase(name)) {
			return ship_to_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($ver_p.equalsIgnoreCase(name)) {
			return ver_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			return base_qty_p();
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			return schd_qty_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($act_cont_p.equalsIgnoreCase(name)) {
			return act_cont_p();
		}
		if ($act_fctr_p.equalsIgnoreCase(name)) {
			return act_fctr_p();
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			return std_cont_p();
		}
		if ($std_fctr_p.equalsIgnoreCase(name)) {
			return std_fctr_p();
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			return cont_unit_p();
		}
		if ($dlv_rqst_p.equalsIgnoreCase(name)) {
			return dlv_rqst_p();
		}
		if ($pd_inst_dlv_p.equalsIgnoreCase(name)) {
			return pd_inst_dlv_p();
		}
		if ($ship_rqst_p.equalsIgnoreCase(name)) {
			return ship_rqst_p();
		}
		if ($ship_str_ln_p.equalsIgnoreCase(name)) {
			return ship_str_ln_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_p.equalsIgnoreCase(name)) {
			ship_p(
				((MCContainerMeta) ship_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($ship_inst_p.equalsIgnoreCase(name)) {
			ship_inst_p(
				((MCContainerMeta) ship_inst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_schd_p.equalsIgnoreCase(name)) {
			ship_schd_p(
				((MCContainerMeta) ship_schd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_schd_p.equalsIgnoreCase(name)) {
			dlv_schd_p(
				((MCContainerMeta) dlv_schd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_to_p.equalsIgnoreCase(name)) {
			ship_to_p(
				((MCContainerMeta) ship_to_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($ver_p.equalsIgnoreCase(name)) {
			ver_p(
				((MCContainerMeta) ver_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			base_qty_p(
				((MCContainerMeta) base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			schd_qty_p(
				((MCContainerMeta) schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			inst_qty_p(
				((MCContainerMeta) inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_cont_p.equalsIgnoreCase(name)) {
			act_cont_p(
				((MCContainerMeta) act_cont_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($act_fctr_p.equalsIgnoreCase(name)) {
			act_fctr_p(
				((MCContainerMeta) act_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			std_cont_p(
				((MCContainerMeta) std_cont_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_fctr_p.equalsIgnoreCase(name)) {
			std_fctr_p(
				((MCContainerMeta) std_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			cont_unit_p(
				((MCContainerMeta) cont_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($dlv_rqst_p.equalsIgnoreCase(name)) {
			dlv_rqst_p(
				((MCContainerMeta) dlv_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($pd_inst_dlv_p.equalsIgnoreCase(name)) {
			pd_inst_dlv_p(
				((MCContainerMeta) pd_inst_dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_rqst_p.equalsIgnoreCase(name)) {
			ship_rqst_p(
				((MCContainerMeta) ship_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_str_ln_p.equalsIgnoreCase(name)) {
			ship_str_ln_p(
				((MCContainerMeta) ship_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public MCDate ship_dt() {
		return ship_p().ymd();
	}

	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		ship_p().ymd(value);
	}

	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public MCDate ship_hm() {
		return ship_p().hm();
	}

	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public void ship_hm(MCDate value) {
		ship_p().hm(value);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return dlv_p().ymd();
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		dlv_p().ymd(value);
	}

	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public MCDate dlv_hm() {
		return dlv_p().hm();
	}

	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public void dlv_hm(MCDate value) {
		dlv_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return ship_inst_p().ymd();
	}

	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		ship_inst_p().ymd(value);
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public MCDate ship_inst_hm() {
		return ship_inst_p().hm();
	}

	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public void ship_inst_hm(MCDate value) {
		ship_inst_p().hm(value);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return ship_schd_p().ymd();
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		ship_schd_p().ymd(value);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return ship_schd_p().hm();
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		ship_schd_p().hm(value);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return dlv_schd_p().ymd();
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		dlv_schd_p().ymd(value);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return dlv_schd_p().hm();
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		dlv_schd_p().hm(value);
	}

	/**
	 * Receiving point cd. 送付先ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return ship_to_p().bp_cd();
	}

	/**
	 * Receiving point cd. 送付先ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		ship_to_p().bp_cd(value);
	}

	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return ship_to_p().bp_nm();
	}

	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		ship_to_p().bp_nm(value);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return ship_to_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		ship_to_p().dlv_sundry_flg(value);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return ship_to_p().pri_prnt_flg();
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		ship_to_p().pri_prnt_flg(value);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return ship_to_p().lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		ship_to_p().lg_grp_cd(value);
	}

	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public String ship_to_lg_grp_nm() {
		return ship_to_p().lg_grp_nm();
	}

	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public void ship_to_lg_grp_nm(String value) {
		ship_to_p().lg_grp_nm(value);
	}

	/**
	 * Receiving point country cd. 送付先国ＣＤ.<p>
	 *
	 */
	public String ship_to_cntry_cd() {
		return ship_to_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 送付先国ＣＤ.<p>
	 *
	 */
	public void ship_to_cntry_cd(String value) {
		ship_to_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 送付先国名.<p>
	 *
	 */
	public String ship_to_cntry_nm() {
		return ship_to_p().cntry_nm();
	}

	/**
	 * Receiving point country name 送付先国名.<p>
	 *
	 */
	public void ship_to_cntry_nm(String value) {
		ship_to_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return ship_to_p().zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		ship_to_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return ship_to_p().addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		ship_to_p().addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return ship_to_p().addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		ship_to_p().addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return ship_to_p().addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		ship_to_p().addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return ship_to_p().addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		ship_to_p().addr4(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return ship_to_p().tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		ship_to_p().tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return ship_to_p().fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		ship_to_p().fax(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return ship_to_p().dlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		ship_to_p().dlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return ship_to_p().dlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		ship_to_p().dlv_cntct_psn(value);
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

	public String ver_no() {
		return ver_p().ver_no();
	}

	public void ver_no(String value) {
		ver_p().ver_no(value);
	}

	public MCNumber trd_unit_qty() {
		return qty_p().qty();
	}

	public void trd_unit_qty(MCNumber value) {
		qty_p().qty(value);
	}

	public void trd_unit_qty(int value) {
		qty_p().qty(value);
	}

	public void trd_unit_qty(long value) {
		qty_p().qty(value);
	}

	public void trd_unit_qty(float value) {
		qty_p().qty(value);
	}

	public void trd_unit_qty(double value) {
		qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return schd_qty_p().qty();
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(int value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(long value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(float value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(double value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return inst_qty_p().qty();
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return act_cont_p().cont_qty();
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		act_cont_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		act_cont_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		act_cont_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		act_cont_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		act_cont_p().cont_qty(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return act_fctr_p().act_cont_fctr();
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		act_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		act_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		act_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		act_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		act_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_p().cont_qty(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_fctr_p().std_cont_fctr();
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_fctr_p().std_cont_fctr(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_unit_p().cont_fctr_unit_nm(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_p().hm(value);
	}

	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt() {
		return pd_inst_dlv_p().ymd();
	}

	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public void pd_inst_dlv_dt(MCDate value) {
		pd_inst_dlv_p().ymd(value);
	}

	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm() {
		return pd_inst_dlv_p().hm();
	}

	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public void pd_inst_dlv_hm(MCDate value) {
		pd_inst_dlv_p().hm(value);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return ship_rqst_p().ymd();
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		ship_rqst_p().ymd(value);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return ship_rqst_p().hm();
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		ship_rqst_p().hm(value);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return ship_str_ln_p().str_ln_cd();
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		ship_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return ship_str_ln_p().str_ln_nm();
	}

	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		ship_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without Shipping rack/line 出荷棚・ライン無.<p>
	 *
	 */
	public boolean ship_str_ln_cd_none_flg() {
		return ship_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without Shipping rack/line 出荷棚・ライン無.<p>
	 *
	 */
	public void ship_str_ln_cd_none_flg(boolean value) {
		ship_str_ln_p().str_ln_cd_none_flg(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
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

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

