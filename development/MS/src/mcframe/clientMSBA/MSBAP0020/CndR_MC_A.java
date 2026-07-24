package mcframe.clientMSBA.MSBAP0020;

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
	 * UPD,Reply,UPD;REF,Display requests/answers list,REF UPD,回答する,UPD;REF,依頼・回答を一覧表示する,REF.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $rqst_flg = "rqst_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $prms_flg = "prms_flg";
	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public static final String $part_inst_flg = "part_inst_flg";
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
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
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public static final String $wg_rqst_typ = "wg_rqst_typ";
	/**
	 * Inventory request from other WG classification type name ＷＧ間依頼種類区分名.<p>
	 *
	 */
	public static final String $wg_rqst_typ_nm = "wg_rqst_typ_nm";
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
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_wg_nm = "gr_wg_nm";
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
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public static final String $gi_lg_grp_nm = "gi_lg_grp_nm";
	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_grp_cd = "gi_loc_grp_cd";
	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public static final String $gi_loc_grp_nm = "gi_loc_grp_nm";
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
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
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
	 * Only less than requested qty. 依頼数未満のみ.<p>
	 *
	 */
	public static final String $prms_shrtg_flg = "prms_shrtg_flg";
	/**
	 * Only exceeded request qty. 依頼数超過のみ.<p>
	 *
	 */
	public static final String $prms_over_flg = "prms_over_flg";
	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public static final String $due_delay_flg = "due_delay_flg";
	/**
	 * Only with delivery order 納入指示有のみ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_flg = "dlv_inst_rcpt_flg";
	/**
	 * Cancel only 取消のみ.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
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
	 * Request spare 1 依頼予備１.<p>
	 *
	 */
	public static final String $wg_rqst_sub_char1 = "wg_rqst_sub_char1";
	/**
	 * Request spare 2 依頼予備２.<p>
	 *
	 */
	public static final String $wg_rqst_sub_char2 = "wg_rqst_sub_char2";
	/**
	 * Request spare 3 依頼予備３.<p>
	 *
	 */
	public static final String $wg_rqst_sub_char3 = "wg_rqst_sub_char3";
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
	public static final MCMeta rqst_flg_META = createCommonMeta($rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_flg_META = createCommonMeta($prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_inst_flg_META = createCommonMeta($part_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMS.meta.MS_META.WG_RQST_TYP);
	public static final MCMeta wg_rqst_typ_nm_META = createCommonMeta($wg_rqst_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_TYP_NM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_site_cd_META = createCommonMeta($gr_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gr_site_nm_META = createCommonMeta($gr_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_wg_nm_META = createCommonMeta($gr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gr_lg_grp_cd_META = createCommonMeta($gr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gr_lg_grp_nm_META = createCommonMeta($gr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gr_loc_grp_cd_META = createCommonMeta($gr_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta gr_loc_grp_nm_META = createCommonMeta($gr_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_site_nm_META = createCommonMeta($gi_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_lg_grp_nm_META = createCommonMeta($gi_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gi_loc_grp_cd_META = createCommonMeta($gi_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta gi_loc_grp_nm_META = createCommonMeta($gi_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
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
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta re_rqst_flg_META = createCommonMeta($re_rqst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_div_flg_META = createCommonMeta($prms_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_shrtg_flg_META = createCommonMeta($prms_shrtg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_over_flg_META = createCommonMeta($prms_over_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta due_delay_flg_META = createCommonMeta($due_delay_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_rcpt_flg_META = createCommonMeta($dlv_inst_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta wg_re_rqst_cnt_rmrks_META = createCommonMeta($wg_re_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RE_RQST_CNT_RMRKS);
	public static final MCMeta wg_rqst_sub_char1_META = createCommonMeta($wg_rqst_sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR1);
	public static final MCMeta wg_rqst_sub_char2_META = createCommonMeta($wg_rqst_sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR2);
	public static final MCMeta wg_rqst_sub_char3_META = createCommonMeta($wg_rqst_sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			rqst_flg_META,
			prms_flg_META,
			part_inst_flg_META,
			inst_flg_META,
			cmpl_flg_META,
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
			wg_rqst_typ_META,
			wg_rqst_typ_nm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_site_cd_META,
			gr_site_nm_META,
			gr_wg_cd_META,
			gr_wg_nm_META,
			gr_lg_grp_cd_META,
			gr_lg_grp_nm_META,
			gr_loc_grp_cd_META,
			gr_loc_grp_nm_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_site_cd_META,
			gi_site_nm_META,
			gi_lg_grp_cd_META,
			gi_lg_grp_nm_META,
			gi_loc_grp_cd_META,
			gi_loc_grp_nm_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
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
			slo_no_META,
			slo_d_no_META,
			wg_rqst_no_META,
			re_rqst_flg_META,
			prms_div_flg_META,
			prms_shrtg_flg_META,
			prms_over_flg_META,
			due_delay_flg_META,
			dlv_inst_rcpt_flg_META,
			can_flg_META,
			wg_rqst_cnt_rmrks_META,
			wg_re_rqst_cnt_rmrks_META,
			wg_rqst_sub_char1_META,
			wg_rqst_sub_char2_META,
			wg_rqst_sub_char3_META,
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
				{$gr_wg_cd, "wg_nm"},	// gr_wg_cd
				{$gr_lg_grp_cd, "lg_grp_nm"},	// gr_lg_grp_cd
				{$gr_loc_grp_cd, "loc_grp_nm"},	// gr_loc_grp_cd
				{$gr_str_ln_cd, "str_ln_nm"},	// gr_str_ln_cd
				{$gi_loc_cd, "loc_nm"},	// gi_loc_cd
				{$gi_site_cd, "site_nm"},	// gi_site_cd
				{$gi_lg_grp_cd, "lg_grp_nm"},	// gi_lg_grp_cd
				{$gi_loc_grp_cd, "loc_grp_nm"},	// gi_loc_grp_cd
				{$gi_str_ln_cd, "str_ln_nm"},	// gi_str_ln_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$rqst_fr_usr_cd, "usr_nm"},	// rqst_fr_usr_cd
				{$rqst_fr_dpt_cd, "dpt_nm"}	// rqst_fr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$gr_str_ln_cd, "gr_loc_cd;true"},	// gr_str_ln_cd
				{$gi_str_ln_cd, "gi_loc_cd;true"},	// gi_str_ln_cd
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
				{$gi_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gi_str_ln_cd
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
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
				{$gi_site_cd, "SITE"},	// gi_site_cd
				{$gi_site_nm, "SITE"},	// gi_site_nm
				{$gi_lg_grp_cd, "LG_GRP"},	// gi_lg_grp_cd
				{$gi_lg_grp_nm, "LG_GRP"},	// gi_lg_grp_nm
				{$gi_loc_grp_cd, "LOC_GRP"},	// gi_loc_grp_cd
				{$gi_loc_grp_nm, "LOC_GRP"},	// gi_loc_grp_nm
				{$gi_str_ln_cd, "STR_LN"},	// gi_str_ln_cd
				{$gi_str_ln_nm, "STR_LN"}	// gi_str_ln_nm
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
	 * UPD,Reply,UPD;REF,Display requests/answers list,REF UPD,回答する,UPD;REF,依頼・回答を一覧表示する,REF.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Reply,UPD;REF,Display requests/answers list,REF UPD,回答する,UPD;REF,依頼・回答を一覧表示する,REF.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean rqst_flg() {
		return getConstBoolean(offset + 1, $rqst_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void rqst_flg(boolean value) {
		setConstBoolean(offset + 1, $rqst_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean prms_flg() {
		return getConstBoolean(offset + 2, $prms_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void prms_flg(boolean value) {
		setConstBoolean(offset + 2, $prms_flg, value);
	}


	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public boolean part_inst_flg() {
		return getConstBoolean(offset + 3, $part_inst_flg);
	}

	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public void part_inst_flg(boolean value) {
		setConstBoolean(offset + 3, $part_inst_flg, value);
	}


	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 4, $inst_flg);
	}

	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 4, $inst_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 5, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 5, $cmpl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gr_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 6, $gr_rqst_dt_p);
	}
	
	public void gr_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 6, $gr_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gi_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 7, $gi_rqst_dt_p);
	}
	
	public void gi_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 7, $gi_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gr_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 8, $gr_schd_dt_p);
	}
	
	public void gr_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 8, $gr_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR gi_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 9, $gi_schd_dt_p);
	}
	
	public void gi_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 9, $gi_schd_dt_p, row);
	}


	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rqst_dt_fr() {
		return getConstDate(offset + 10, $rqst_dt_fr);
	}

	/**
	 * Request date FROM 依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void rqst_dt_fr(MCDate value) {
		setConstDate(offset + 10, $rqst_dt_fr, value);
	}


	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public MCDate rqst_dt_to() {
		return getConstDate(offset + 11, $rqst_dt_to);
	}

	/**
	 * Request date TO 依頼日ＴＯ.<p>
	 *
	 */
	public void rqst_dt_to(MCDate value) {
		setConstDate(offset + 11, $rqst_dt_to, value);
	}


	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate re_rqst_dt_fr() {
		return getConstDate(offset + 12, $re_rqst_dt_fr);
	}

	/**
	 * Readjustment request date FROM 再調整依頼日ＦＲＯＭ.<p>
	 *
	 */
	public void re_rqst_dt_fr(MCDate value) {
		setConstDate(offset + 12, $re_rqst_dt_fr, value);
	}


	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public MCDate re_rqst_dt_to() {
		return getConstDate(offset + 13, $re_rqst_dt_to);
	}

	/**
	 * Readjustment request date TO 再調整依頼日ＴＯ.<p>
	 *
	 */
	public void re_rqst_dt_to(MCDate value) {
		setConstDate(offset + 13, $re_rqst_dt_to, value);
	}


	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public String wg_rqst_ntc_day_typ() {
		return getConstString(offset + 14, $wg_rqst_ntc_day_typ);
	}

	/**
	 * Inventory request from other WG notification date type ＷＧ間依頼通知日区分.<p>
	 *
	 */
	public void wg_rqst_ntc_day_typ(String value) {
		setConstString(offset + 14, $wg_rqst_ntc_day_typ, value);
	}


	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public String wg_rqst_ntc_day_typ_nm() {
		return getConstString(offset + 15, $wg_rqst_ntc_day_typ_nm);
	}

	/**
	 * Inventory request from other WG notification date type name ＷＧ間依頼通知日区分名.<p>
	 *
	 */
	public void wg_rqst_ntc_day_typ_nm(String value) {
		setConstString(offset + 15, $wg_rqst_ntc_day_typ_nm, value);
	}


	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate srch_dt_fr() {
		return getConstDate(offset + 16, $srch_dt_fr);
	}

	/**
	 * Search date FROM 検索日ＦＲＯＭ.<p>
	 *
	 */
	public void srch_dt_fr(MCDate value) {
		setConstDate(offset + 16, $srch_dt_fr, value);
	}


	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public MCDate srch_dt_to() {
		return getConstDate(offset + 17, $srch_dt_to);
	}

	/**
	 * Search date TO 検索日ＴＯ.<p>
	 *
	 */
	public void srch_dt_to(MCDate value) {
		setConstDate(offset + 17, $srch_dt_to, value);
	}


	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_fr_wg_cd() {
		return getConstString(offset + 18, $rqst_fr_wg_cd);
	}

	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_fr_wg_cd(String value) {
		setConstString(offset + 18, $rqst_fr_wg_cd, value);
	}


	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public String rqst_fr_wg_nm() {
		return getConstString(offset + 19, $rqst_fr_wg_nm);
	}

	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public void rqst_fr_wg_nm(String value) {
		setConstString(offset + 19, $rqst_fr_wg_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 20, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 20, $rqst_to_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_to_wg_nm() {
		return getConstString(offset + 21, $rqst_to_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_to_wg_nm(String value) {
		setConstString(offset + 21, $rqst_to_wg_nm, value);
	}


	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 22, $wg_rqst_typ);
	}

	/**
	 * Inventory request from other WG classification type ＷＧ間依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 22, $wg_rqst_typ, value);
	}


	/**
	 * Inventory request from other WG classification type name ＷＧ間依頼種類区分名.<p>
	 *
	 */
	public String wg_rqst_typ_nm() {
		return getConstString(offset + 23, $wg_rqst_typ_nm);
	}

	/**
	 * Inventory request from other WG classification type name ＷＧ間依頼種類区分名.<p>
	 *
	 */
	public void wg_rqst_typ_nm(String value) {
		setConstString(offset + 23, $wg_rqst_typ_nm, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 24, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 24, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 25, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 25, $gr_loc_nm, value);
	}


	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gr_site_cd() {
		return getConstString(offset + 26, $gr_site_cd);
	}

	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gr_site_cd(String value) {
		setConstString(offset + 26, $gr_site_cd, value);
	}


	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public String gr_site_nm() {
		return getConstString(offset + 27, $gr_site_nm);
	}

	/**
	 * GR factory/distribution warehouse name 入庫工場・物流倉庫名.<p>
	 *
	 */
	public void gr_site_nm(String value) {
		setConstString(offset + 27, $gr_site_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 28, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 28, $gr_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_wg_nm() {
		return getConstString(offset + 29, $gr_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_wg_nm(String value) {
		setConstString(offset + 29, $gr_wg_nm, value);
	}


	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return getConstString(offset + 30, $gr_lg_grp_cd);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		setConstString(offset + 30, $gr_lg_grp_cd, value);
	}


	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public String gr_lg_grp_nm() {
		return getConstString(offset + 31, $gr_lg_grp_nm);
	}

	/**
	 * GR distribution group name 入庫物流グループ名.<p>
	 *
	 */
	public void gr_lg_grp_nm(String value) {
		setConstString(offset + 31, $gr_lg_grp_nm, value);
	}


	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public String gr_loc_grp_cd() {
		return getConstString(offset + 32, $gr_loc_grp_cd);
	}

	/**
	 * GR mfg. location group cd. 入庫製造場所グループＣＤ.<p>
	 *
	 */
	public void gr_loc_grp_cd(String value) {
		setConstString(offset + 32, $gr_loc_grp_cd, value);
	}


	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public String gr_loc_grp_nm() {
		return getConstString(offset + 33, $gr_loc_grp_nm);
	}

	/**
	 * GR mfg. location group name 入庫製造場所グループ名.<p>
	 *
	 */
	public void gr_loc_grp_nm(String value) {
		setConstString(offset + 33, $gr_loc_grp_nm, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 34, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 34, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 35, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 35, $gr_str_ln_nm, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 36, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 36, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 37, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 37, $gi_loc_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 38, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 38, $gi_site_cd, value);
	}


	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public String gi_site_nm() {
		return getConstString(offset + 39, $gi_site_nm);
	}

	/**
	 * GI factory/distribution warehouse name 出庫工場・物流倉庫名.<p>
	 *
	 */
	public void gi_site_nm(String value) {
		setConstString(offset + 39, $gi_site_nm, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 40, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 40, $gi_lg_grp_cd, value);
	}


	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public String gi_lg_grp_nm() {
		return getConstString(offset + 41, $gi_lg_grp_nm);
	}

	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public void gi_lg_grp_nm(String value) {
		setConstString(offset + 41, $gi_lg_grp_nm, value);
	}


	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public String gi_loc_grp_cd() {
		return getConstString(offset + 42, $gi_loc_grp_cd);
	}

	/**
	 * GI mfg. location group cd. 出庫製造場所グループＣＤ.<p>
	 *
	 */
	public void gi_loc_grp_cd(String value) {
		setConstString(offset + 42, $gi_loc_grp_cd, value);
	}


	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public String gi_loc_grp_nm() {
		return getConstString(offset + 43, $gi_loc_grp_nm);
	}

	/**
	 * GI mfg. location group name 出庫製造場所グループ名.<p>
	 *
	 */
	public void gi_loc_grp_nm(String value) {
		setConstString(offset + 43, $gi_loc_grp_nm, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 44, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 44, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 45, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 45, $gi_str_ln_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 46, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 46, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 47, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 47, $sppl_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 48, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 48, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 49, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 49, $dlv_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 50, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 50, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 51, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 51, $itm_p, row);
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


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 54, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 54, $sno_p, row);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 55, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 55, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 56, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 56, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 57, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 57, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 58, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 58, $rqst_fr_dpt_nm, value);
	}


	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public String wg_rqst_src_typ() {
		return getConstString(offset + 59, $wg_rqst_src_typ);
	}

	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public void wg_rqst_src_typ(String value) {
		setConstString(offset + 59, $wg_rqst_src_typ, value);
	}


	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public String wg_rqst_src_typ_nm() {
		return getConstString(offset + 60, $wg_rqst_src_typ_nm);
	}

	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public void wg_rqst_src_typ_nm(String value) {
		setConstString(offset + 60, $wg_rqst_src_typ_nm, value);
	}


	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public String wg_rqst_src_no() {
		return getConstString(offset + 61, $wg_rqst_src_no);
	}

	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public void wg_rqst_src_no(String value) {
		setConstString(offset + 61, $wg_rqst_src_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 62, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 62, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 63, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 63, $slo_d_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 64, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 64, $wg_rqst_no, value);
	}


	/**
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public boolean re_rqst_flg() {
		return getConstBoolean(offset + 65, $re_rqst_flg);
	}

	/**
	 * Readjustment request only 再調整依頼のみ.<p>
	 *
	 */
	public void re_rqst_flg(boolean value) {
		setConstBoolean(offset + 65, $re_rqst_flg, value);
	}


	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public boolean prms_div_flg() {
		return getConstBoolean(offset + 66, $prms_div_flg);
	}

	/**
	 * Replied split only 回答分割のみ.<p>
	 *
	 */
	public void prms_div_flg(boolean value) {
		setConstBoolean(offset + 66, $prms_div_flg, value);
	}


	/**
	 * Only less than requested qty. 依頼数未満のみ.<p>
	 *
	 */
	public boolean prms_shrtg_flg() {
		return getConstBoolean(offset + 67, $prms_shrtg_flg);
	}

	/**
	 * Only less than requested qty. 依頼数未満のみ.<p>
	 *
	 */
	public void prms_shrtg_flg(boolean value) {
		setConstBoolean(offset + 67, $prms_shrtg_flg, value);
	}


	/**
	 * Only exceeded request qty. 依頼数超過のみ.<p>
	 *
	 */
	public boolean prms_over_flg() {
		return getConstBoolean(offset + 68, $prms_over_flg);
	}

	/**
	 * Only exceeded request qty. 依頼数超過のみ.<p>
	 *
	 */
	public void prms_over_flg(boolean value) {
		setConstBoolean(offset + 68, $prms_over_flg, value);
	}


	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public boolean due_delay_flg() {
		return getConstBoolean(offset + 69, $due_delay_flg);
	}

	/**
	 * Late delivery only 納期遅れのみ.<p>
	 *
	 */
	public void due_delay_flg(boolean value) {
		setConstBoolean(offset + 69, $due_delay_flg, value);
	}


	/**
	 * Only with delivery order 納入指示有のみ.<p>
	 *
	 */
	public boolean dlv_inst_rcpt_flg() {
		return getConstBoolean(offset + 70, $dlv_inst_rcpt_flg);
	}

	/**
	 * Only with delivery order 納入指示有のみ.<p>
	 *
	 */
	public void dlv_inst_rcpt_flg(boolean value) {
		setConstBoolean(offset + 70, $dlv_inst_rcpt_flg, value);
	}


	/**
	 * Cancel only 取消のみ.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 71, $can_flg);
	}

	/**
	 * Cancel only 取消のみ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 71, $can_flg, value);
	}


	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 72, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 72, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public String wg_re_rqst_cnt_rmrks() {
		return getConstString(offset + 73, $wg_re_rqst_cnt_rmrks);
	}

	/**
	 * Readjustment request contact remarks 再調整依頼連絡備考.<p>
	 *
	 */
	public void wg_re_rqst_cnt_rmrks(String value) {
		setConstString(offset + 73, $wg_re_rqst_cnt_rmrks, value);
	}


	/**
	 * Request spare 1 依頼予備１.<p>
	 *
	 */
	public String wg_rqst_sub_char1() {
		return getConstString(offset + 74, $wg_rqst_sub_char1);
	}

	/**
	 * Request spare 1 依頼予備１.<p>
	 *
	 */
	public void wg_rqst_sub_char1(String value) {
		setConstString(offset + 74, $wg_rqst_sub_char1, value);
	}


	/**
	 * Request spare 2 依頼予備２.<p>
	 *
	 */
	public String wg_rqst_sub_char2() {
		return getConstString(offset + 75, $wg_rqst_sub_char2);
	}

	/**
	 * Request spare 2 依頼予備２.<p>
	 *
	 */
	public void wg_rqst_sub_char2(String value) {
		setConstString(offset + 75, $wg_rqst_sub_char2, value);
	}


	/**
	 * Request spare 3 依頼予備３.<p>
	 *
	 */
	public String wg_rqst_sub_char3() {
		return getConstString(offset + 76, $wg_rqst_sub_char3);
	}

	/**
	 * Request spare 3 依頼予備３.<p>
	 *
	 */
	public void wg_rqst_sub_char3(String value) {
		setConstString(offset + 76, $wg_rqst_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 77, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 77, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 78, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 78, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 79, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 79, $sppl_grp_p, row);
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
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return gi_loc_grp_cd();
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			return gi_loc_grp_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($wg_rqst_sub_char1.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char1();
		}
		if ($wg_rqst_sub_char2.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char2();
		}
		if ($wg_rqst_sub_char3.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char3();
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
		if ($rqst_flg.equalsIgnoreCase(name)) {
			return rqst_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
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
		if ($prms_over_flg.equalsIgnoreCase(name)) {
			return prms_over_flg();
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			return due_delay_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
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
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_site_nm.equalsIgnoreCase(name)) {
			return gi_site_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			return gi_loc_grp_cd();
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			return gi_loc_grp_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
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
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($wg_re_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_re_rqst_cnt_rmrks();
		}
		if ($wg_rqst_sub_char1.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char1();
		}
		if ($wg_rqst_sub_char2.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char2();
		}
		if ($wg_rqst_sub_char3.equalsIgnoreCase(name)) {
			return wg_rqst_sub_char3();
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
		if ($rqst_flg.equalsIgnoreCase(name)) {
			return rqst_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
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
		if ($prms_over_flg.equalsIgnoreCase(name)) {
			return prms_over_flg();
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			return due_delay_flg();
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
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
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
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
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			gi_loc_grp_cd(value);
			return;
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			gi_loc_grp_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($wg_rqst_sub_char1.equalsIgnoreCase(name)) {
			wg_rqst_sub_char1(value);
			return;
		}
		if ($wg_rqst_sub_char2.equalsIgnoreCase(name)) {
			wg_rqst_sub_char2(value);
			return;
		}
		if ($wg_rqst_sub_char3.equalsIgnoreCase(name)) {
			wg_rqst_sub_char3(value);
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
		if ($rqst_flg.equalsIgnoreCase(name)) {
			rqst_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			part_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
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
		if ($prms_over_flg.equalsIgnoreCase(name)) {
			prms_over_flg(value);
			return;
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			due_delay_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
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
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
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
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
			return;
		}
		if ($gi_loc_grp_cd.equalsIgnoreCase(name)) {
			gi_loc_grp_cd(value);
			return;
		}
		if ($gi_loc_grp_nm.equalsIgnoreCase(name)) {
			gi_loc_grp_nm(value);
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
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($wg_rqst_sub_char1.equalsIgnoreCase(name)) {
			wg_rqst_sub_char1(value);
			return;
		}
		if ($wg_rqst_sub_char2.equalsIgnoreCase(name)) {
			wg_rqst_sub_char2(value);
			return;
		}
		if ($wg_rqst_sub_char3.equalsIgnoreCase(name)) {
			wg_rqst_sub_char3(value);
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
		if ($rqst_flg.equalsIgnoreCase(name)) {
			rqst_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			part_inst_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
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
		if ($prms_over_flg.equalsIgnoreCase(name)) {
			prms_over_flg(value);
			return;
		}
		if ($due_delay_flg.equalsIgnoreCase(name)) {
			due_delay_flg(value);
			return;
		}
		if ($dlv_inst_rcpt_flg.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
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

