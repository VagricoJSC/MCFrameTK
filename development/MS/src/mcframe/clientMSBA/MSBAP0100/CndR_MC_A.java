package mcframe.clientMSBA.MSBAP0100;

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
	 * UPD,Create/Modify,UPD;DEL,Cancel,DEL;REF,View,REF UPD,登録・訂正する,UPD;DEL,取り消す,DEL;REF,参照する,REF.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Transport 移送.<p>
	 *
	 */
	public static final String $xfr_rqst_flg = "xfr_rqst_flg";
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public static final String $purc_rqst_flg = "purc_rqst_flg";
	/**
	 * Shipping 出荷.<p>
	 *
	 */
	public static final String $ship_rqst_flg = "ship_rqst_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $rqst_sts_flg = "rqst_sts_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $prms_sts_flg = "prms_sts_flg";
	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public static final String $part_inst_sts_flg = "part_inst_sts_flg";
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public static final String $inst_sts_flg = "inst_sts_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_sts_flg = "cmpl_sts_flg";
	/**
	 * Exist あり.<p>
	 *
	 */
	public static final String $slo_rqst_flg = "slo_rqst_flg";
	/**
	 * None なし.<p>
	 *
	 */
	public static final String $un_slo_rqst_flg = "un_slo_rqst_flg";
	public static final String $gr_rqst_dt_p = "gr_rqst_dt_p";
	public static final String $gi_rqst_dt_p = "gi_rqst_dt_p";
	public static final String $gr_schd_dt_p = "gr_schd_dt_p";
	public static final String $gi_schd_dt_p = "gi_schd_dt_p";
	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rqst_dt_fr = "rqst_dt_fr";
	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public static final String $rqst_dt_to = "rqst_dt_to";
	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $re_rqst_dt_fr = "re_rqst_dt_fr";
	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public static final String $re_rqst_dt_to = "re_rqst_dt_to";
	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public static final String $wg_rqst_ntc_day_typ = "wg_rqst_ntc_day_typ";
	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public static final String $wg_rqst_ntc_day_typ_nm = "wg_rqst_ntc_day_typ_nm";
	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $srch_dt_fr = "srch_dt_fr";
	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public static final String $srch_dt_to = "srch_dt_to";
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_wg_cd = "rqst_fr_wg_cd";
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_fr_wg_nm = "rqst_fr_wg_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_wg_cd = "rqst_to_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_to_wg_nm = "rqst_to_wg_nm";
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
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_wg_cd = "gr_loc_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_loc_wg_nm = "gr_loc_wg_nm";
	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gr_lg_grp_cd = "gr_lg_grp_cd";
	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public static final String $gr_lg_grp_nm = "gr_lg_grp_nm";
	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_grp_cd = "gr_loc_grp_cd";
	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public static final String $gr_loc_grp_nm = "gr_loc_grp_nm";
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
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_site_cd = "rqst_to_site_cd";
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $rqst_to_site_nm = "rqst_to_site_nm";
	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_cd = "rqst_to_lg_grp_cd";
	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_nm = "rqst_to_lg_grp_nm";
	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_grp_cd = "rqst_to_loc_grp_cd";
	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public static final String $rqst_to_loc_grp_nm = "rqst_to_loc_grp_nm";
	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_cd = "rqst_to_str_ln_cd";
	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public static final String $rqst_to_str_ln_nm = "rqst_to_str_ln_nm";
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
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public static final String $wg_rqst_src_typ = "wg_rqst_src_typ";
	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public static final String $wg_rqst_src_typ_nm = "wg_rqst_src_typ_nm";
	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_src_no = "wg_rqst_src_no";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
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
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public static final String $re_rqst_flg = "re_rqst_flg";
	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public static final String $prms_div_flg = "prms_div_flg";
	/**
	 * Only replied qty. shortage 回答数不足のみ.<p>
	 *
	 */
	public static final String $prms_shrtg_flg = "prms_shrtg_flg";
	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public static final String $due_delay_flg = "due_delay_flg";
	/**
	 * Reply unchecked only 回答未確認のみ.<p>
	 *
	 */
	public static final String $prms_uncn_flg = "prms_uncn_flg";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public static final String $wg_rqst_cnt_rmrks = "wg_rqst_cnt_rmrks";
	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public static final String $wg_re_rqst_cnt_rmrks = "wg_re_rqst_cnt_rmrks";
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
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $sppl_grp_p = "sppl_grp_p";

	public static final String $gr_rqst_dt_fr = $gr_rqst_dt_p + ".ymd_fr";
	public static final String $gr_rqst_hm_fr = $gr_rqst_dt_p + ".hm_fr";
	public static final String $gr_rqst_dt_to = $gr_rqst_dt_p + ".ymd_to";
	public static final String $gr_rqst_hm_to = $gr_rqst_dt_p + ".hm_to";
	public static final String $gi_rqst_dt_fr = $gi_rqst_dt_p + ".ymd_fr";
	public static final String $gi_rqst_hm_fr = $gi_rqst_dt_p + ".hm_fr";
	public static final String $gi_rqst_dt_to = $gi_rqst_dt_p + ".ymd_to";
	public static final String $gi_rqst_hm_to = $gi_rqst_dt_p + ".hm_to";
	public static final String $gr_schd_dt_fr = $gr_schd_dt_p + ".ymd_fr";
	public static final String $gr_schd_hm_fr = $gr_schd_dt_p + ".hm_fr";
	public static final String $gr_schd_dt_to = $gr_schd_dt_p + ".ymd_to";
	public static final String $gr_schd_hm_to = $gr_schd_dt_p + ".hm_to";
	public static final String $gi_schd_dt_fr = $gi_schd_dt_p + ".ymd_fr";
	public static final String $gi_schd_hm_fr = $gi_schd_dt_p + ".hm_fr";
	public static final String $gi_schd_dt_to = $gi_schd_dt_p + ".ymd_to";
	public static final String $gi_schd_hm_to = $gi_schd_dt_p + ".hm_to";
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
	public static final MCMeta xfr_rqst_flg_META = createCommonMeta($xfr_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rqst_flg_META = createCommonMeta($purc_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_flg_META = createCommonMeta($ship_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_sts_flg_META = createCommonMeta($rqst_sts_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_sts_flg_META = createCommonMeta($prms_sts_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_inst_sts_flg_META = createCommonMeta($part_inst_sts_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_sts_flg_META = createCommonMeta($inst_sts_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_sts_flg_META = createCommonMeta($cmpl_sts_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_rqst_flg_META = createCommonMeta($slo_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta un_slo_rqst_flg_META = createCommonMeta($un_slo_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_rqst_dt_p_META = createInnerRowMeta($gr_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta gi_rqst_dt_p_META = createInnerRowMeta($gi_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta gr_schd_dt_p_META = createInnerRowMeta($gr_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta gi_schd_dt_p_META = createInnerRowMeta($gi_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta rqst_dt_fr_META = createCommonMeta($rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dt_to_META = createCommonMeta($rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_rqst_dt_fr_META = createCommonMeta($re_rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_rqst_dt_to_META = createCommonMeta($re_rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_rqst_ntc_day_typ_META = createCommonMeta($wg_rqst_ntc_day_typ, mcframe.commonMS.meta.MS_META.WG_RQST_NTC_DAY_TYP);
	public static final MCMeta wg_rqst_ntc_day_typ_nm_META = createCommonMeta($wg_rqst_ntc_day_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_NTC_DAY_TYP_NM);
	public static final MCMeta srch_dt_fr_META = createCommonMeta($srch_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta srch_dt_to_META = createCommonMeta($srch_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_fr_wg_cd_META = createCommonMeta($rqst_fr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_fr_wg_nm_META = createCommonMeta($rqst_fr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rqst_to_wg_cd_META = createCommonMeta($rqst_to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_to_wg_nm_META = createCommonMeta($rqst_to_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_nm_META = createCommonMeta($gr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gr_loc_wg_cd_META = createCommonMeta($gr_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_loc_wg_nm_META = createCommonMeta($gr_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_lg_grp_nm_META = createCommonMeta($gr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gr_loc_grp_cd_META = createCommonMeta($gr_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta gr_loc_grp_nm_META = createCommonMeta($gr_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_to_loc_nm_META = createCommonMeta($rqst_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_to_site_cd_META = createCommonMeta($rqst_to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_to_site_nm_META = createCommonMeta($rqst_to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_to_lg_grp_cd_META = createCommonMeta($rqst_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta rqst_to_lg_grp_nm_META = createCommonMeta($rqst_to_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta rqst_to_loc_grp_cd_META = createCommonMeta($rqst_to_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_to_loc_grp_nm_META = createCommonMeta($rqst_to_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta rqst_to_str_ln_cd_META = createCommonMeta($rqst_to_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta rqst_to_str_ln_nm_META = createCommonMeta($rqst_to_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_rqst_src_typ_META = createCommonMeta($wg_rqst_src_typ, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP);
	public static final MCMeta wg_rqst_src_typ_nm_META = createCommonMeta($wg_rqst_src_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_SRC_TYP_NM);
	public static final MCMeta wg_rqst_src_no_META = createCommonMeta($wg_rqst_src_no, mcframe.commonMA.meta.MA_META.WG_RQST_SRC_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta re_rqst_flg_META = createCommonMeta($re_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_div_flg_META = createCommonMeta($prms_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_shrtg_flg_META = createCommonMeta($prms_shrtg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta due_delay_flg_META = createCommonMeta($due_delay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_uncn_flg_META = createCommonMeta($prms_uncn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta wg_re_rqst_cnt_rmrks_META = createCommonMeta($wg_re_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RE_RQST_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			xfr_rqst_flg_META,
			purc_rqst_flg_META,
			ship_rqst_flg_META,
			rqst_sts_flg_META,
			prms_sts_flg_META,
			part_inst_sts_flg_META,
			inst_sts_flg_META,
			cmpl_sts_flg_META,
			slo_rqst_flg_META,
			un_slo_rqst_flg_META,
			gr_rqst_dt_p_META,
			gi_rqst_dt_p_META,
			gr_schd_dt_p_META,
			gi_schd_dt_p_META,
			rqst_dt_fr_META,
			rqst_dt_to_META,
			re_rqst_dt_fr_META,
			re_rqst_dt_to_META,
			wg_rqst_ntc_day_typ_META,
			wg_rqst_ntc_day_typ_nm_META,
			srch_dt_fr_META,
			srch_dt_to_META,
			rqst_fr_wg_cd_META,
			rqst_fr_wg_nm_META,
			rqst_to_wg_cd_META,
			rqst_to_wg_nm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_site_cd_META,
			gr_site_nm_META,
			gr_loc_wg_cd_META,
			gr_loc_wg_nm_META,
			gr_lg_grp_cd_META,
			gr_lg_grp_nm_META,
			gr_loc_grp_cd_META,
			gr_loc_grp_nm_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			rqst_to_loc_cd_META,
			rqst_to_loc_nm_META,
			rqst_to_site_cd_META,
			rqst_to_site_nm_META,
			rqst_to_lg_grp_cd_META,
			rqst_to_lg_grp_nm_META,
			rqst_to_loc_grp_cd_META,
			rqst_to_loc_grp_nm_META,
			rqst_to_str_ln_cd_META,
			rqst_to_str_ln_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			itm_typ_p_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			sno_p_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			wg_rqst_src_typ_META,
			wg_rqst_src_typ_nm_META,
			wg_rqst_src_no_META,
			wg_rqst_no_META,
			slo_no_META,
			slo_d_no_META,
			re_rqst_flg_META,
			prms_div_flg_META,
			prms_shrtg_flg_META,
			due_delay_flg_META,
			prms_uncn_flg_META,
			inc_can_flg_META,
			wg_rqst_cnt_rmrks_META,
			wg_re_rqst_cnt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_grp_p_META,
			dlv_grp_p_META,
			sppl_grp_p_META
		},
		new String[][]{
			{
				"gr_rqst_dt_fr",
				"gr_rqst_hm_fr",
				"gr_rqst_dt_to",
				"gr_rqst_hm_to",
				"gi_rqst_dt_fr",
				"gi_rqst_hm_fr",
				"gi_rqst_dt_to",
				"gi_rqst_hm_to",
				"gr_schd_dt_fr",
				"gr_schd_hm_fr",
				"gr_schd_dt_to",
				"gr_schd_hm_to",
				"gi_schd_dt_fr",
				"gi_schd_hm_fr",
				"gi_schd_dt_to",
				"gi_schd_hm_to",
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
				$gr_rqst_dt_fr,
				$gr_rqst_hm_fr,
				$gr_rqst_dt_to,
				$gr_rqst_hm_to,
				$gi_rqst_dt_fr,
				$gi_rqst_hm_fr,
				$gi_rqst_dt_to,
				$gi_rqst_hm_to,
				$gr_schd_dt_fr,
				$gr_schd_hm_fr,
				$gr_schd_dt_to,
				$gr_schd_hm_to,
				$gi_schd_dt_fr,
				$gi_schd_hm_fr,
				$gi_schd_dt_to,
				$gi_schd_hm_to,
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
				{$rqst_fr_wg_cd, "wg_nm"},	// rqst_fr_wg_cd
				{$rqst_to_wg_cd, "wg_nm"},	// rqst_to_wg_cd
				{$gr_loc_cd, "loc_nm"},	// gr_loc_cd
				{$gr_site_cd, "site_nm"},	// gr_site_cd
				{$gr_loc_wg_cd, "wg_nm"},	// gr_loc_wg_cd
				{$gr_lg_grp_cd, "lg_grp_nm"},	// gr_lg_grp_cd
				{$gr_loc_grp_cd, "loc_grp_nm"},	// gr_loc_grp_cd
				{$gr_str_ln_cd, "str_ln_nm"},	// gr_str_ln_cd
				{$rqst_to_loc_cd, "loc_nm"},	// rqst_to_loc_cd
				{$rqst_to_site_cd, "site_nm"},	// rqst_to_site_cd
				{$rqst_to_lg_grp_cd, "lg_grp_nm"},	// rqst_to_lg_grp_cd
				{$rqst_to_loc_grp_cd, "loc_grp_nm"},	// rqst_to_loc_grp_cd
				{$rqst_to_str_ln_cd, "str_ln_nm"},	// rqst_to_str_ln_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$rqst_fr_usr_cd, "usr_nm"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "dpt_nm"}	// rqst_fr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$gr_str_ln_cd, "gr_loc_cd;true"},	// gr_str_ln_cd
				{$rqst_to_str_ln_cd, "rqst_to_loc_cd;true"},	// rqst_to_str_ln_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$rqst_fr_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"}	// rqst_fr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$gr_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gr_str_ln_cd
				{$rqst_to_str_ln_cd, "loc_cd;mode_nullval_flg"},	// rqst_to_str_ln_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// sublot_no
				{$rqst_fr_dpt_cd, "mode_today_flg;dpt_nm_rem_flg;dpt_is_srch_typ"}	// rqst_fr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$gr_site_cd, "SITE"},	// gr_site_cd
				{$gr_site_nm, "SITE"},	// gr_site_nm
				{$gr_lg_grp_cd, "LG_GRP"},	// gr_lg_grp_cd
				{$gr_lg_grp_nm, "LG_GRP"},	// gr_lg_grp_nm
				{$gr_loc_grp_cd, "LOC_GRP"},	// gr_loc_grp_cd
				{$gr_loc_grp_nm, "LOC_GRP"},	// gr_loc_grp_nm
				{$gr_str_ln_cd, "STR_LN"},	// gr_str_ln_cd
				{$gr_str_ln_nm, "STR_LN"},	// gr_str_ln_nm
				{$rqst_to_site_cd, "SITE"},	// rqst_to_site_cd
				{$rqst_to_site_nm, "SITE"},	// rqst_to_site_nm
				{$rqst_to_lg_grp_cd, "LG_GRP"},	// rqst_to_lg_grp_cd
				{$rqst_to_lg_grp_nm, "LG_GRP"},	// rqst_to_lg_grp_nm
				{$rqst_to_loc_grp_cd, "LOC_GRP"},	// rqst_to_loc_grp_cd
				{$rqst_to_loc_grp_nm, "LOC_GRP"},	// rqst_to_loc_grp_nm
				{$rqst_to_str_ln_cd, "STR_LN"},	// rqst_to_str_ln_cd
				{$rqst_to_str_ln_nm, "STR_LN"}	// rqst_to_str_ln_nm
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
	 * UPD,Create/Modify,UPD;DEL,Cancel,DEL;REF,View,REF UPD,登録・訂正する,UPD;DEL,取り消す,DEL;REF,参照する,REF.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,UPD;DEL,Cancel,DEL;REF,View,REF UPD,登録・訂正する,UPD;DEL,取り消す,DEL;REF,参照する,REF.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Transport 移送.<p>
	 *
	 */
	public boolean xfr_rqst_flg() {
		return getConstBoolean(offset + 1, $xfr_rqst_flg);
	}

	/**
	 * Transport 移送.<p>
	 *
	 */
	public void xfr_rqst_flg(boolean value) {
		setConstBoolean(offset + 1, $xfr_rqst_flg, value);
	}


	/**
	 * Purchase 購買.<p>
	 *
	 */
	public boolean purc_rqst_flg() {
		return getConstBoolean(offset + 2, $purc_rqst_flg);
	}

	/**
	 * Purchase 購買.<p>
	 *
	 */
	public void purc_rqst_flg(boolean value) {
		setConstBoolean(offset + 2, $purc_rqst_flg, value);
	}


	/**
	 * Shipping 出荷.<p>
	 *
	 */
	public boolean ship_rqst_flg() {
		return getConstBoolean(offset + 3, $ship_rqst_flg);
	}

	/**
	 * Shipping 出荷.<p>
	 *
	 */
	public void ship_rqst_flg(boolean value) {
		setConstBoolean(offset + 3, $ship_rqst_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean rqst_sts_flg() {
		return getConstBoolean(offset + 4, $rqst_sts_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void rqst_sts_flg(boolean value) {
		setConstBoolean(offset + 4, $rqst_sts_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean prms_sts_flg() {
		return getConstBoolean(offset + 5, $prms_sts_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void prms_sts_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_sts_flg, value);
	}


	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public boolean part_inst_sts_flg() {
		return getConstBoolean(offset + 6, $part_inst_sts_flg);
	}

	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public void part_inst_sts_flg(boolean value) {
		setConstBoolean(offset + 6, $part_inst_sts_flg, value);
	}


	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public boolean inst_sts_flg() {
		return getConstBoolean(offset + 7, $inst_sts_flg);
	}

	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public void inst_sts_flg(boolean value) {
		setConstBoolean(offset + 7, $inst_sts_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_sts_flg() {
		return getConstBoolean(offset + 8, $cmpl_sts_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_sts_flg(boolean value) {
		setConstBoolean(offset + 8, $cmpl_sts_flg, value);
	}


	/**
	 * Exist あり.<p>
	 *
	 */
	public boolean slo_rqst_flg() {
		return getConstBoolean(offset + 9, $slo_rqst_flg);
	}

	/**
	 * Exist あり.<p>
	 *
	 */
	public void slo_rqst_flg(boolean value) {
		setConstBoolean(offset + 9, $slo_rqst_flg, value);
	}


	/**
	 * None なし.<p>
	 *
	 */
	public boolean un_slo_rqst_flg() {
		return getConstBoolean(offset + 10, $un_slo_rqst_flg);
	}

	/**
	 * None なし.<p>
	 *
	 */
	public void un_slo_rqst_flg(boolean value) {
		setConstBoolean(offset + 10, $un_slo_rqst_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gr_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 11, $gr_rqst_dt_p);
	}
	
	public void gr_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 11, $gr_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gi_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 12, $gi_rqst_dt_p);
	}
	
	public void gi_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 12, $gi_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 13, $gr_schd_dt_p);
	}
	
	public void gr_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 13, $gr_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gi_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 14, $gi_schd_dt_p);
	}
	
	public void gi_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 14, $gi_schd_dt_p, row);
	}


	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dt_fr() {
		return getConstDate(offset + 15, $rqst_dt_fr);
	}

	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dt_fr(MCDate value) {
		setConstDate(offset + 15, $rqst_dt_fr, value);
	}


	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dt_to() {
		return getConstDate(offset + 16, $rqst_dt_to);
	}

	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public void rqst_dt_to(MCDate value) {
		setConstDate(offset + 16, $rqst_dt_to, value);
	}


	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate re_rqst_dt_fr() {
		return getConstDate(offset + 17, $re_rqst_dt_fr);
	}

	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void re_rqst_dt_fr(MCDate value) {
		setConstDate(offset + 17, $re_rqst_dt_fr, value);
	}


	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public MCDate re_rqst_dt_to() {
		return getConstDate(offset + 18, $re_rqst_dt_to);
	}

	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public void re_rqst_dt_to(MCDate value) {
		setConstDate(offset + 18, $re_rqst_dt_to, value);
	}


	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public String wg_rqst_ntc_day_typ() {
		return getConstString(offset + 19, $wg_rqst_ntc_day_typ);
	}

	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public void wg_rqst_ntc_day_typ(String value) {
		setConstString(offset + 19, $wg_rqst_ntc_day_typ, value);
	}


	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public String wg_rqst_ntc_day_typ_nm() {
		return getConstString(offset + 20, $wg_rqst_ntc_day_typ_nm);
	}

	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public void wg_rqst_ntc_day_typ_nm(String value) {
		setConstString(offset + 20, $wg_rqst_ntc_day_typ_nm, value);
	}


	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate srch_dt_fr() {
		return getConstDate(offset + 21, $srch_dt_fr);
	}

	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public void srch_dt_fr(MCDate value) {
		setConstDate(offset + 21, $srch_dt_fr, value);
	}


	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public MCDate srch_dt_to() {
		return getConstDate(offset + 22, $srch_dt_to);
	}

	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public void srch_dt_to(MCDate value) {
		setConstDate(offset + 22, $srch_dt_to, value);
	}


	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return getConstString(offset + 23, $rqst_fr_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		setConstString(offset + 23, $rqst_fr_wg_cd, value);
	}


	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public String rqst_fr_wg_nm() {
		return getConstString(offset + 24, $rqst_fr_wg_nm);
	}

	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public void rqst_fr_wg_nm(String value) {
		setConstString(offset + 24, $rqst_fr_wg_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 25, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 25, $rqst_to_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_to_wg_nm() {
		return getConstString(offset + 26, $rqst_to_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_to_wg_nm(String value) {
		setConstString(offset + 26, $rqst_to_wg_nm, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 27, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 27, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 28, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 28, $gr_loc_nm, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 29, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 29, $gr_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public String gr_site_nm() {
		return getConstString(offset + 30, $gr_site_nm);
	}

	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public void gr_site_nm(String value) {
		setConstString(offset + 30, $gr_site_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_loc_wg_cd() {
		return getConstString(offset + 31, $gr_loc_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_loc_wg_cd(String value) {
		setConstString(offset + 31, $gr_loc_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_loc_wg_nm() {
		return getConstString(offset + 32, $gr_loc_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_loc_wg_nm(String value) {
		setConstString(offset + 32, $gr_loc_wg_nm, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 33, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 33, $gr_lg_grp_cd, value);
	}


	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public String gr_lg_grp_nm() {
		return getConstString(offset + 34, $gr_lg_grp_nm);
	}

	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public void gr_lg_grp_nm(String value) {
		setConstString(offset + 34, $gr_lg_grp_nm, value);
	}


	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public String gr_loc_grp_cd() {
		return getConstString(offset + 35, $gr_loc_grp_cd);
	}

	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public void gr_loc_grp_cd(String value) {
		setConstString(offset + 35, $gr_loc_grp_cd, value);
	}


	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public String gr_loc_grp_nm() {
		return getConstString(offset + 36, $gr_loc_grp_nm);
	}

	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public void gr_loc_grp_nm(String value) {
		setConstString(offset + 36, $gr_loc_grp_nm, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 37, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 37, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 38, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 38, $gr_str_ln_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 39, $rqst_to_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 39, $rqst_to_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_to_loc_nm() {
		return getConstString(offset + 40, $rqst_to_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_to_loc_nm(String value) {
		setConstString(offset + 40, $rqst_to_loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String rqst_to_site_cd() {
		return getConstString(offset + 41, $rqst_to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void rqst_to_site_cd(String value) {
		setConstString(offset + 41, $rqst_to_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public String rqst_to_site_nm() {
		return getConstString(offset + 42, $rqst_to_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public void rqst_to_site_nm(String value) {
		setConstString(offset + 42, $rqst_to_site_nm, value);
	}


	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public String rqst_to_lg_grp_cd() {
		return getConstString(offset + 43, $rqst_to_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (Requested) 依頼先物流グループＣＤ.<p>
	 *
	 */
	public void rqst_to_lg_grp_cd(String value) {
		setConstString(offset + 43, $rqst_to_lg_grp_cd, value);
	}


	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public String rqst_to_lg_grp_nm() {
		return getConstString(offset + 44, $rqst_to_lg_grp_nm);
	}

	/**
	 * Distribution group name (Requested) 依頼先物流グループ名.<p>
	 *
	 */
	public void rqst_to_lg_grp_nm(String value) {
		setConstString(offset + 44, $rqst_to_lg_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_grp_cd() {
		return getConstString(offset + 45, $rqst_to_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. (Requested) 依頼先製造場所グループＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_grp_cd(String value) {
		setConstString(offset + 45, $rqst_to_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public String rqst_to_loc_grp_nm() {
		return getConstString(offset + 46, $rqst_to_loc_grp_nm);
	}

	/**
	 * Mfg. location group name (Requested) 依頼先製造場所グループ名.<p>
	 *
	 */
	public void rqst_to_loc_grp_nm(String value) {
		setConstString(offset + 46, $rqst_to_loc_grp_nm, value);
	}


	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_to_str_ln_cd() {
		return getConstString(offset + 47, $rqst_to_str_ln_cd);
	}

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_to_str_ln_cd(String value) {
		setConstString(offset + 47, $rqst_to_str_ln_cd, value);
	}


	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public String rqst_to_str_ln_nm() {
		return getConstString(offset + 48, $rqst_to_str_ln_nm);
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public void rqst_to_str_ln_nm(String value) {
		setConstString(offset + 48, $rqst_to_str_ln_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 49, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 49, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 50, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 50, $sppl_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 51, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 51, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 52, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 52, $dlv_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 53, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 53, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 54, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 54, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 55, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 55, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 56, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 56, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 57, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 57, $sno_p, row);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 58, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 58, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 59, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 59, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 60, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 60, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 61, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 61, $rqst_fr_dpt_nm, value);
	}


	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return getConstString(offset + 62, $wg_rqst_src_typ);
	}

	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		setConstString(offset + 62, $wg_rqst_src_typ, value);
	}


	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public String wg_rqst_src_typ_nm() {
		return getConstString(offset + 63, $wg_rqst_src_typ_nm);
	}

	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public void wg_rqst_src_typ_nm(String value) {
		setConstString(offset + 63, $wg_rqst_src_typ_nm, value);
	}


	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return getConstString(offset + 64, $wg_rqst_src_no);
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		setConstString(offset + 64, $wg_rqst_src_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 65, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 65, $wg_rqst_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 66, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 66, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 67, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 67, $slo_d_no, value);
	}


	/**
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return getConstBoolean(offset + 68, $re_rqst_flg);
	}

	/**
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		setConstBoolean(offset + 68, $re_rqst_flg, value);
	}


	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public boolean prms_div_flg() {
		return getConstBoolean(offset + 69, $prms_div_flg);
	}

	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public void prms_div_flg(boolean value) {
		setConstBoolean(offset + 69, $prms_div_flg, value);
	}


	/**
	 * Only replied qty. shortage 回答数不足のみ.<p>
	 *
	 */
	public boolean prms_shrtg_flg() {
		return getConstBoolean(offset + 70, $prms_shrtg_flg);
	}

	/**
	 * Only replied qty. shortage 回答数不足のみ.<p>
	 *
	 */
	public void prms_shrtg_flg(boolean value) {
		setConstBoolean(offset + 70, $prms_shrtg_flg, value);
	}


	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public boolean due_delay_flg() {
		return getConstBoolean(offset + 71, $due_delay_flg);
	}

	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public void due_delay_flg(boolean value) {
		setConstBoolean(offset + 71, $due_delay_flg, value);
	}


	/**
	 * Reply unchecked only 回答未確認のみ.<p>
	 *
	 */
	public boolean prms_uncn_flg() {
		return getConstBoolean(offset + 72, $prms_uncn_flg);
	}

	/**
	 * Reply unchecked only 回答未確認のみ.<p>
	 *
	 */
	public void prms_uncn_flg(boolean value) {
		setConstBoolean(offset + 72, $prms_uncn_flg, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 73, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 73, $inc_can_flg, value);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 74, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 74, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return getConstString(offset + 75, $wg_re_rqst_cnt_rmrks);
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		setConstString(offset + 75, $wg_re_rqst_cnt_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 76, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 76, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 77, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 77, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 78, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 78, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 79, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 79, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 80, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 80, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 81, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 81, $sppl_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_rqst_ntc_day_typ.equalsIgnoreCase(name)) {
			return wg_rqst_ntc_day_typ();
		}
		if ($wg_rqst_ntc_day_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_ntc_day_typ_nm();
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			return rqst_fr_wg_cd();
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			return rqst_fr_wg_nm();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			return gr_loc_wg_cd();
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			return gr_loc_wg_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_grp_cd();
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			return gr_loc_grp_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			return rqst_to_site_cd();
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			return rqst_to_site_nm();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_nm();
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_cd();
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_nm();
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd();
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ();
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ_nm();
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			return wg_rqst_src_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
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
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($re_rqst_dt_fr.equalsIgnoreCase(name)) {
			return re_rqst_dt_fr();
		}
		if ($re_rqst_dt_to.equalsIgnoreCase(name)) {
			return re_rqst_dt_to();
		}
		if ($srch_dt_fr.equalsIgnoreCase(name)) {
			return srch_dt_fr();
		}
		if ($srch_dt_to.equalsIgnoreCase(name)) {
			return srch_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($xfr_rqst_flg.equalsIgnoreCase(name)) {
			return xfr_rqst_flg();
		}
		if ($purc_rqst_flg.equalsIgnoreCase(name)) {
			return purc_rqst_flg();
		}
		if ($ship_rqst_flg.equalsIgnoreCase(name)) {
			return ship_rqst_flg();
		}
		if ($rqst_sts_flg.equalsIgnoreCase(name)) {
			return rqst_sts_flg();
		}
		if ($prms_sts_flg.equalsIgnoreCase(name)) {
			return prms_sts_flg();
		}
		if ($part_inst_sts_flg.equalsIgnoreCase(name)) {
			return part_inst_sts_flg();
		}
		if ($inst_sts_flg.equalsIgnoreCase(name)) {
			return inst_sts_flg();
		}
		if ($cmpl_sts_flg.equalsIgnoreCase(name)) {
			return cmpl_sts_flg();
		}
		if ($slo_rqst_flg.equalsIgnoreCase(name)) {
			return slo_rqst_flg();
		}
		if ($un_slo_rqst_flg.equalsIgnoreCase(name)) {
			return un_slo_rqst_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			return prms_div_flg();
		}
		if ($prms_shrtg_flg.equalsIgnoreCase(name)) {
			return prms_shrtg_flg();
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			return due_delay_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($wg_rqst_ntc_day_typ.equalsIgnoreCase(name)) {
			return wg_rqst_ntc_day_typ();
		}
		if ($wg_rqst_ntc_day_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_ntc_day_typ_nm();
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			return rqst_fr_wg_cd();
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			return rqst_fr_wg_nm();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			return rqst_to_wg_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			return gr_site_cd();
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			return gr_site_nm();
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			return gr_loc_wg_cd();
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			return gr_loc_wg_nm();
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			return gr_lg_grp_cd();
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			return gr_lg_grp_nm();
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			return gr_loc_grp_cd();
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			return gr_loc_grp_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			return rqst_to_site_cd();
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			return rqst_to_site_nm();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_nm();
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_cd();
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_grp_nm();
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_cd();
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_to_str_ln_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ();
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_src_typ_nm();
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			return wg_rqst_src_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
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
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			return rqst_dt_fr();
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			return rqst_dt_to();
		}
		if ($re_rqst_dt_fr.equalsIgnoreCase(name)) {
			return re_rqst_dt_fr();
		}
		if ($re_rqst_dt_to.equalsIgnoreCase(name)) {
			return re_rqst_dt_to();
		}
		if ($srch_dt_fr.equalsIgnoreCase(name)) {
			return srch_dt_fr();
		}
		if ($srch_dt_to.equalsIgnoreCase(name)) {
			return srch_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($xfr_rqst_flg.equalsIgnoreCase(name)) {
			return xfr_rqst_flg();
		}
		if ($purc_rqst_flg.equalsIgnoreCase(name)) {
			return purc_rqst_flg();
		}
		if ($ship_rqst_flg.equalsIgnoreCase(name)) {
			return ship_rqst_flg();
		}
		if ($rqst_sts_flg.equalsIgnoreCase(name)) {
			return rqst_sts_flg();
		}
		if ($prms_sts_flg.equalsIgnoreCase(name)) {
			return prms_sts_flg();
		}
		if ($part_inst_sts_flg.equalsIgnoreCase(name)) {
			return part_inst_sts_flg();
		}
		if ($inst_sts_flg.equalsIgnoreCase(name)) {
			return inst_sts_flg();
		}
		if ($cmpl_sts_flg.equalsIgnoreCase(name)) {
			return cmpl_sts_flg();
		}
		if ($slo_rqst_flg.equalsIgnoreCase(name)) {
			return slo_rqst_flg();
		}
		if ($un_slo_rqst_flg.equalsIgnoreCase(name)) {
			return un_slo_rqst_flg();
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			return re_rqst_flg();
		}
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			return prms_div_flg();
		}
		if ($prms_shrtg_flg.equalsIgnoreCase(name)) {
			return prms_shrtg_flg();
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			return due_delay_flg();
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			return prms_uncn_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wg_rqst_ntc_day_typ.equalsIgnoreCase(name)) {
			wg_rqst_ntc_day_typ(value);
			return;
		}
		if ($wg_rqst_ntc_day_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_ntc_day_typ_nm(value);
			return;
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			rqst_fr_wg_cd(value);
			return;
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			rqst_fr_wg_nm(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			rqst_to_wg_nm(value);
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
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			gr_loc_wg_cd(value);
			return;
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			gr_loc_wg_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_grp_cd(value);
			return;
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			gr_loc_grp_nm(value);
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			rqst_to_site_cd(value);
			return;
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			rqst_to_site_nm(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_nm(value);
			return;
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_cd(value);
			return;
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_nm(value);
			return;
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd(value);
			return;
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_to_str_ln_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			wg_rqst_src_typ(value);
			return;
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_src_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			wg_rqst_src_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
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
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($re_rqst_dt_fr.equalsIgnoreCase(name)) {
			re_rqst_dt_fr(value);
			return;
		}
		if ($re_rqst_dt_to.equalsIgnoreCase(name)) {
			re_rqst_dt_to(value);
			return;
		}
		if ($srch_dt_fr.equalsIgnoreCase(name)) {
			srch_dt_fr(value);
			return;
		}
		if ($srch_dt_to.equalsIgnoreCase(name)) {
			srch_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($xfr_rqst_flg.equalsIgnoreCase(name)) {
			xfr_rqst_flg(value);
			return;
		}
		if ($purc_rqst_flg.equalsIgnoreCase(name)) {
			purc_rqst_flg(value);
			return;
		}
		if ($ship_rqst_flg.equalsIgnoreCase(name)) {
			ship_rqst_flg(value);
			return;
		}
		if ($rqst_sts_flg.equalsIgnoreCase(name)) {
			rqst_sts_flg(value);
			return;
		}
		if ($prms_sts_flg.equalsIgnoreCase(name)) {
			prms_sts_flg(value);
			return;
		}
		if ($part_inst_sts_flg.equalsIgnoreCase(name)) {
			part_inst_sts_flg(value);
			return;
		}
		if ($inst_sts_flg.equalsIgnoreCase(name)) {
			inst_sts_flg(value);
			return;
		}
		if ($cmpl_sts_flg.equalsIgnoreCase(name)) {
			cmpl_sts_flg(value);
			return;
		}
		if ($slo_rqst_flg.equalsIgnoreCase(name)) {
			slo_rqst_flg(value);
			return;
		}
		if ($un_slo_rqst_flg.equalsIgnoreCase(name)) {
			un_slo_rqst_flg(value);
			return;
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			prms_div_flg(value);
			return;
		}
		if ($prms_shrtg_flg.equalsIgnoreCase(name)) {
			prms_shrtg_flg(value);
			return;
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			due_delay_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($wg_rqst_ntc_day_typ.equalsIgnoreCase(name)) {
			wg_rqst_ntc_day_typ(value);
			return;
		}
		if ($wg_rqst_ntc_day_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_ntc_day_typ_nm(value);
			return;
		}
		if ($rqst_fr_wg_cd.equalsIgnoreCase(name)) {
			rqst_fr_wg_cd(value);
			return;
		}
		if ($rqst_fr_wg_nm.equalsIgnoreCase(name)) {
			rqst_fr_wg_nm(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($rqst_to_wg_nm.equalsIgnoreCase(name)) {
			rqst_to_wg_nm(value);
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
		if ($gr_site_cd.equalsIgnoreCase(name)) {
			gr_site_cd(value);
			return;
		}
		if ($gr_site_nm.equalsIgnoreCase(name)) {
			gr_site_nm(value);
			return;
		}
		if ($gr_loc_wg_cd.equalsIgnoreCase(name)) {
			gr_loc_wg_cd(value);
			return;
		}
		if ($gr_loc_wg_nm.equalsIgnoreCase(name)) {
			gr_loc_wg_nm(value);
			return;
		}
		if ($gr_lg_grp_cd.equalsIgnoreCase(name)) {
			gr_lg_grp_cd(value);
			return;
		}
		if ($gr_lg_grp_nm.equalsIgnoreCase(name)) {
			gr_lg_grp_nm(value);
			return;
		}
		if ($gr_loc_grp_cd.equalsIgnoreCase(name)) {
			gr_loc_grp_cd(value);
			return;
		}
		if ($gr_loc_grp_nm.equalsIgnoreCase(name)) {
			gr_loc_grp_nm(value);
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
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($rqst_to_site_cd.equalsIgnoreCase(name)) {
			rqst_to_site_cd(value);
			return;
		}
		if ($rqst_to_site_nm.equalsIgnoreCase(name)) {
			rqst_to_site_nm(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_nm(value);
			return;
		}
		if ($rqst_to_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_cd(value);
			return;
		}
		if ($rqst_to_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_grp_nm(value);
			return;
		}
		if ($rqst_to_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_to_str_ln_cd(value);
			return;
		}
		if ($rqst_to_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_to_str_ln_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($wg_rqst_src_typ.equalsIgnoreCase(name)) {
			wg_rqst_src_typ(value);
			return;
		}
		if ($wg_rqst_src_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_src_typ_nm(value);
			return;
		}
		if ($wg_rqst_src_no.equalsIgnoreCase(name)) {
			wg_rqst_src_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_re_rqst_cnt_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_dt_fr.equalsIgnoreCase(name)) {
			rqst_dt_fr(value);
			return;
		}
		if ($rqst_dt_to.equalsIgnoreCase(name)) {
			rqst_dt_to(value);
			return;
		}
		if ($re_rqst_dt_fr.equalsIgnoreCase(name)) {
			re_rqst_dt_fr(value);
			return;
		}
		if ($re_rqst_dt_to.equalsIgnoreCase(name)) {
			re_rqst_dt_to(value);
			return;
		}
		if ($srch_dt_fr.equalsIgnoreCase(name)) {
			srch_dt_fr(value);
			return;
		}
		if ($srch_dt_to.equalsIgnoreCase(name)) {
			srch_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($xfr_rqst_flg.equalsIgnoreCase(name)) {
			xfr_rqst_flg(value);
			return;
		}
		if ($purc_rqst_flg.equalsIgnoreCase(name)) {
			purc_rqst_flg(value);
			return;
		}
		if ($ship_rqst_flg.equalsIgnoreCase(name)) {
			ship_rqst_flg(value);
			return;
		}
		if ($rqst_sts_flg.equalsIgnoreCase(name)) {
			rqst_sts_flg(value);
			return;
		}
		if ($prms_sts_flg.equalsIgnoreCase(name)) {
			prms_sts_flg(value);
			return;
		}
		if ($part_inst_sts_flg.equalsIgnoreCase(name)) {
			part_inst_sts_flg(value);
			return;
		}
		if ($inst_sts_flg.equalsIgnoreCase(name)) {
			inst_sts_flg(value);
			return;
		}
		if ($cmpl_sts_flg.equalsIgnoreCase(name)) {
			cmpl_sts_flg(value);
			return;
		}
		if ($slo_rqst_flg.equalsIgnoreCase(name)) {
			slo_rqst_flg(value);
			return;
		}
		if ($un_slo_rqst_flg.equalsIgnoreCase(name)) {
			un_slo_rqst_flg(value);
			return;
		}
		if ($re_rqst_flg.equalsIgnoreCase(name)) {
			re_rqst_flg(value);
			return;
		}
		if ($prms_div_flg.equalsIgnoreCase(name)) {
			prms_div_flg(value);
			return;
		}
		if ($prms_shrtg_flg.equalsIgnoreCase(name)) {
			prms_shrtg_flg(value);
			return;
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			due_delay_flg(value);
			return;
		}
		if ($prms_uncn_flg.equalsIgnoreCase(name)) {
			prms_uncn_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($gr_rqst_dt_p.equalsIgnoreCase(name)) {
			return gr_rqst_dt_p();
		}
		if ($gi_rqst_dt_p.equalsIgnoreCase(name)) {
			return gi_rqst_dt_p();
		}
		if ($gr_schd_dt_p.equalsIgnoreCase(name)) {
			return gr_schd_dt_p();
		}
		if ($gi_schd_dt_p.equalsIgnoreCase(name)) {
			return gi_schd_dt_p();
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
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($gr_rqst_dt_p.equalsIgnoreCase(name)) {
			gr_rqst_dt_p(
				((MCContainerMeta) gr_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($gi_rqst_dt_p.equalsIgnoreCase(name)) {
			gi_rqst_dt_p(
				((MCContainerMeta) gi_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($gr_schd_dt_p.equalsIgnoreCase(name)) {
			gr_schd_dt_p(
				((MCContainerMeta) gr_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($gi_schd_dt_p.equalsIgnoreCase(name)) {
			gi_schd_dt_p(
				((MCContainerMeta) gi_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * GR request date FROM 入庫依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gr_rqst_dt_fr() {
		return gr_rqst_dt_p().ymd_fr();
	}

	/**
	 * GR request date FROM 入庫依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void gr_rqst_dt_fr(MCDate value) {
		gr_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * GR request time FROM 入庫依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gr_rqst_hm_fr() {
		return gr_rqst_dt_p().hm_fr();
	}

	/**
	 * GR request time FROM 入庫依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public void gr_rqst_hm_fr(MCDate value) {
		gr_rqst_dt_p().hm_fr(value);
	}

	/**
	 * GR request date TO 入庫依頼日ＴＯ.<p>
	 *
	 */
	public MCDate gr_rqst_dt_to() {
		return gr_rqst_dt_p().ymd_to();
	}

	/**
	 * GR request date TO 入庫依頼日ＴＯ.<p>
	 *
	 */
	public void gr_rqst_dt_to(MCDate value) {
		gr_rqst_dt_p().ymd_to(value);
	}

	/**
	 * GR request time TO 入庫依頼時刻ＴＯ.<p>
	 *
	 */
	public MCDate gr_rqst_hm_to() {
		return gr_rqst_dt_p().hm_to();
	}

	/**
	 * GR request time TO 入庫依頼時刻ＴＯ.<p>
	 *
	 */
	public void gr_rqst_hm_to(MCDate value) {
		gr_rqst_dt_p().hm_to(value);
	}

	/**
	 * GI request date FROM 出庫依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_rqst_dt_fr() {
		return gi_rqst_dt_p().ymd_fr();
	}

	/**
	 * GI request date FROM 出庫依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void gi_rqst_dt_fr(MCDate value) {
		gi_rqst_dt_p().ymd_fr(value);
	}

	/**
	 * GI request time FROM 出庫依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_rqst_hm_fr() {
		return gi_rqst_dt_p().hm_fr();
	}

	/**
	 * GI request time FROM 出庫依頼時刻ＦＲＯＭ.<p>
	 *
	 */
	public void gi_rqst_hm_fr(MCDate value) {
		gi_rqst_dt_p().hm_fr(value);
	}

	/**
	 * GI request date TO 出庫依頼日ＴＯ.<p>
	 *
	 */
	public MCDate gi_rqst_dt_to() {
		return gi_rqst_dt_p().ymd_to();
	}

	/**
	 * GI request date TO 出庫依頼日ＴＯ.<p>
	 *
	 */
	public void gi_rqst_dt_to(MCDate value) {
		gi_rqst_dt_p().ymd_to(value);
	}

	/**
	 * GI request time TO 出庫依頼時刻ＴＯ.<p>
	 *
	 */
	public MCDate gi_rqst_hm_to() {
		return gi_rqst_dt_p().hm_to();
	}

	/**
	 * GI request time TO 出庫依頼時刻ＴＯ.<p>
	 *
	 */
	public void gi_rqst_hm_to(MCDate value) {
		gi_rqst_dt_p().hm_to(value);
	}

	/**
	 * Scheduled replied GR date FROM 回答入庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gr_schd_dt_fr() {
		return gr_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled replied GR date FROM 回答入庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public void gr_schd_dt_fr(MCDate value) {
		gr_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Replied GR schedule time FROM 回答入庫予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gr_schd_hm_fr() {
		return gr_schd_dt_p().hm_fr();
	}

	/**
	 * Replied GR schedule time FROM 回答入庫予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void gr_schd_hm_fr(MCDate value) {
		gr_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled replied GR date TO 回答入庫予定日ＴＯ.<p>
	 *
	 */
	public MCDate gr_schd_dt_to() {
		return gr_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled replied GR date TO 回答入庫予定日ＴＯ.<p>
	 *
	 */
	public void gr_schd_dt_to(MCDate value) {
		gr_schd_dt_p().ymd_to(value);
	}

	/**
	 * Replied GR schedule time TO 回答入庫予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate gr_schd_hm_to() {
		return gr_schd_dt_p().hm_to();
	}

	/**
	 * Replied GR schedule time TO 回答入庫予定時刻ＴＯ.<p>
	 *
	 */
	public void gr_schd_hm_to(MCDate value) {
		gr_schd_dt_p().hm_to(value);
	}

	/**
	 * Scheduled replied GI date FROM 回答出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_schd_dt_fr() {
		return gi_schd_dt_p().ymd_fr();
	}

	/**
	 * Scheduled replied GI date FROM 回答出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public void gi_schd_dt_fr(MCDate value) {
		gi_schd_dt_p().ymd_fr(value);
	}

	/**
	 * Replied GI schedule time FROM 回答出庫予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_schd_hm_fr() {
		return gi_schd_dt_p().hm_fr();
	}

	/**
	 * Replied GI schedule time FROM 回答出庫予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void gi_schd_hm_fr(MCDate value) {
		gi_schd_dt_p().hm_fr(value);
	}

	/**
	 * Scheduled replied GI date TO 回答出庫予定日ＴＯ.<p>
	 *
	 */
	public MCDate gi_schd_dt_to() {
		return gi_schd_dt_p().ymd_to();
	}

	/**
	 * Scheduled replied GI date TO 回答出庫予定日ＴＯ.<p>
	 *
	 */
	public void gi_schd_dt_to(MCDate value) {
		gi_schd_dt_p().ymd_to(value);
	}

	/**
	 * Replied GI schedule time TO 回答出庫予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate gi_schd_hm_to() {
		return gi_schd_dt_p().hm_to();
	}

	/**
	 * Replied GI schedule time TO 回答出庫予定時刻ＴＯ.<p>
	 *
	 */
	public void gi_schd_hm_to(MCDate value) {
		gi_schd_dt_p().hm_to(value);
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

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return sppl_grp_p().bp_grp_flg1();
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		sppl_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return sppl_grp_p().bp_grp_flg2();
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		sppl_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return sppl_grp_p().bp_grp_flg3();
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		sppl_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return sppl_grp_p().bp_grp_flg4();
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		sppl_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return sppl_grp_p().bp_grp_flg5();
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		sppl_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return sppl_grp_p().bp_grp_flg6();
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		sppl_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return sppl_grp_p().bp_grp_flg7();
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		sppl_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return sppl_grp_p().bp_grp_flg8();
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		sppl_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return sppl_grp_p().bp_grp_flg9();
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		sppl_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return sppl_grp_p().bp_grp_flg10();
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		sppl_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
	}

}

