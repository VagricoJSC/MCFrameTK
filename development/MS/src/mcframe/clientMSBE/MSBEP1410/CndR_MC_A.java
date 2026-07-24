package mcframe.clientMSBE.MSBEP1410;

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
	 * UPD,Create,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Hdr,Header;Dtl,Details;Dlv,Delivery note Hdr,ヘッダ;Dtl,明細;Dlv,納品書.<p>
	 *
	 */
	public static final String $disp_unit = "disp_unit";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $uninst = "uninst";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst = "inst";
	/**
	 * Partially shipped 一部出荷済.<p>
	 *
	 */
	public static final String $p_ship = "p_ship";
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public static final String $ship = "ship";
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
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public static final String $late_ship = "late_ship";
	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public static final String $late_rqst = "late_rqst";
	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public static final String $pick_not_prnted = "pick_not_prnted";
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public static final String $pick_prnted = "pick_prnted";
	/**
	 * Shipping order sheet unissued 出荷指図書未発行.<p>
	 *
	 */
	public static final String $inst_not_prnted = "inst_not_prnted";
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public static final String $inst_prnted = "inst_prnted";
	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public static final String $dlv_not_prnted = "dlv_not_prnted";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_prnted = "dlv_prnted";
	/**
	 * Shipping guide unissued 出荷案内書未発行.<p>
	 *
	 */
	public static final String $adv_not_prnted = "adv_not_prnted";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $adv_prnted = "adv_prnted";
	public static final String $ship_schd_dt_frto_p = "ship_schd_dt_frto_p";
	public static final String $ship_inst_dt_frto_p = "ship_inst_dt_frto_p";
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
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping point location name 出荷元場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	/**
	 * Shipping point rack/line cd. 出荷元棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	/**
	 * Shipping point rack/line name 出荷元棚・ライン名.<p>
	 *
	 */
	public static final String $ship_str_ln_nm = "ship_str_ln_nm";
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
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
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
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
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
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public static final String $ship_wk_nm = "ship_wk_nm";
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
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
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
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $can_disp_flg = "can_disp_flg";
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
	public static final String $ship_to_grp_p = "ship_to_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $ship_schd_dt_fr = $ship_schd_dt_frto_p + ".ymd_fr";
	public static final String $ship_schd_hm_fr = $ship_schd_dt_frto_p + ".hm_fr";
	public static final String $ship_schd_dt_to = $ship_schd_dt_frto_p + ".ymd_to";
	public static final String $ship_schd_hm_to = $ship_schd_dt_frto_p + ".hm_to";
	public static final String $ship_inst_dt_fr = $ship_inst_dt_frto_p + ".ymd_fr";
	public static final String $ship_inst_hm_fr = $ship_inst_dt_frto_p + ".hm_fr";
	public static final String $ship_inst_dt_to = $ship_inst_dt_frto_p + ".ymd_to";
	public static final String $ship_inst_hm_to = $ship_inst_dt_frto_p + ".hm_to";
	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ship_to_grp_lab1 = $ship_to_grp_p + ".bp_grp_lab1";
	public static final String $ship_to_grp_flg1 = $ship_to_grp_p + ".bp_grp_flg1";
	public static final String $ship_to_grp_cd1 = $ship_to_grp_p + ".bp_grp_cd1";
	public static final String $ship_to_grp_nm1 = $ship_to_grp_p + ".bp_grp_nm1";
	public static final String $ship_to_grp_lab2 = $ship_to_grp_p + ".bp_grp_lab2";
	public static final String $ship_to_grp_flg2 = $ship_to_grp_p + ".bp_grp_flg2";
	public static final String $ship_to_grp_cd2 = $ship_to_grp_p + ".bp_grp_cd2";
	public static final String $ship_to_grp_nm2 = $ship_to_grp_p + ".bp_grp_nm2";
	public static final String $ship_to_grp_lab3 = $ship_to_grp_p + ".bp_grp_lab3";
	public static final String $ship_to_grp_flg3 = $ship_to_grp_p + ".bp_grp_flg3";
	public static final String $ship_to_grp_cd3 = $ship_to_grp_p + ".bp_grp_cd3";
	public static final String $ship_to_grp_nm3 = $ship_to_grp_p + ".bp_grp_nm3";
	public static final String $ship_to_grp_lab4 = $ship_to_grp_p + ".bp_grp_lab4";
	public static final String $ship_to_grp_flg4 = $ship_to_grp_p + ".bp_grp_flg4";
	public static final String $ship_to_grp_cd4 = $ship_to_grp_p + ".bp_grp_cd4";
	public static final String $ship_to_grp_nm4 = $ship_to_grp_p + ".bp_grp_nm4";
	public static final String $ship_to_grp_lab5 = $ship_to_grp_p + ".bp_grp_lab5";
	public static final String $ship_to_grp_flg5 = $ship_to_grp_p + ".bp_grp_flg5";
	public static final String $ship_to_grp_cd5 = $ship_to_grp_p + ".bp_grp_cd5";
	public static final String $ship_to_grp_nm5 = $ship_to_grp_p + ".bp_grp_nm5";
	public static final String $ship_to_grp_lab6 = $ship_to_grp_p + ".bp_grp_lab6";
	public static final String $ship_to_grp_flg6 = $ship_to_grp_p + ".bp_grp_flg6";
	public static final String $ship_to_grp_cd6 = $ship_to_grp_p + ".bp_grp_cd6";
	public static final String $ship_to_grp_nm6 = $ship_to_grp_p + ".bp_grp_nm6";
	public static final String $ship_to_grp_lab7 = $ship_to_grp_p + ".bp_grp_lab7";
	public static final String $ship_to_grp_flg7 = $ship_to_grp_p + ".bp_grp_flg7";
	public static final String $ship_to_grp_cd7 = $ship_to_grp_p + ".bp_grp_cd7";
	public static final String $ship_to_grp_nm7 = $ship_to_grp_p + ".bp_grp_nm7";
	public static final String $ship_to_grp_lab8 = $ship_to_grp_p + ".bp_grp_lab8";
	public static final String $ship_to_grp_flg8 = $ship_to_grp_p + ".bp_grp_flg8";
	public static final String $ship_to_grp_cd8 = $ship_to_grp_p + ".bp_grp_cd8";
	public static final String $ship_to_grp_nm8 = $ship_to_grp_p + ".bp_grp_nm8";
	public static final String $ship_to_grp_lab9 = $ship_to_grp_p + ".bp_grp_lab9";
	public static final String $ship_to_grp_flg9 = $ship_to_grp_p + ".bp_grp_flg9";
	public static final String $ship_to_grp_cd9 = $ship_to_grp_p + ".bp_grp_cd9";
	public static final String $ship_to_grp_nm9 = $ship_to_grp_p + ".bp_grp_nm9";
	public static final String $ship_to_grp_lab10 = $ship_to_grp_p + ".bp_grp_lab10";
	public static final String $ship_to_grp_flg10 = $ship_to_grp_p + ".bp_grp_flg10";
	public static final String $ship_to_grp_cd10 = $ship_to_grp_p + ".bp_grp_cd10";
	public static final String $ship_to_grp_nm10 = $ship_to_grp_p + ".bp_grp_nm10";
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
	public static final MCMeta uninst_META = createCommonMeta($uninst, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_META = createCommonMeta($inst, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta p_ship_META = createCommonMeta($p_ship, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_META = createCommonMeta($ship, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_alloc_flg_META = createCommonMeta($not_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_alloc_flg_META = createCommonMeta($part_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_alloc_flg_META = createCommonMeta($all_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_invalid_flg_META = createCommonMeta($alloc_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wms_flg_META = createCommonMeta($not_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta late_ship_META = createCommonMeta($late_ship, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta late_rqst_META = createCommonMeta($late_rqst, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_not_prnted_META = createCommonMeta($pick_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_prnted_META = createCommonMeta($pick_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_not_prnted_META = createCommonMeta($inst_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_prnted_META = createCommonMeta($inst_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_not_prnted_META = createCommonMeta($dlv_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_prnted_META = createCommonMeta($dlv_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_not_prnted_META = createCommonMeta($adv_not_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_prnted_META = createCommonMeta($adv_prnted, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_dt_frto_p_META = createInnerRowMeta($ship_schd_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_inst_dt_frto_p_META = createInnerRowMeta($ship_inst_dt_frto_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_str_ln_nm_META = createCommonMeta($ship_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta ship_wk_nm_META = createCommonMeta($ship_wk_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_RMRKS);
	public static final MCMeta can_disp_flg_META = createCommonMeta($can_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_SUB_CHAR3);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_D_RMRKS);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR3);
	public static final MCMeta ship_to_grp_p_META = createInnerRowMeta($ship_to_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			disp_unit_META,
			uninst_META,
			inst_META,
			p_ship_META,
			ship_META,
			not_alloc_flg_META,
			part_alloc_flg_META,
			all_alloc_flg_META,
			alloc_invalid_flg_META,
			wms_flg_META,
			not_wms_flg_META,
			late_ship_META,
			late_rqst_META,
			pick_not_prnted_META,
			pick_prnted_META,
			inst_not_prnted_META,
			inst_prnted_META,
			dlv_not_prnted_META,
			dlv_prnted_META,
			adv_not_prnted_META,
			adv_prnted_META,
			ship_schd_dt_frto_p_META,
			ship_inst_dt_frto_p_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_cd_META,
			ship_str_ln_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			cst_cd_META,
			cst_nm_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_wk_cd_META,
			ship_wk_nm_META,
			trd_cd_META,
			trd_nm_META,
			itm_typ_p_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			iv_itm_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			ship_schd_no_META,
			ship_inst_no_META,
			dlv_slip_no_META,
			xfr_schd_no_META,
			slo_d_no_META,
			slo_no_META,
			iv_no_META,
			inst_rmrks_META,
			intr_rmrks_META,
			can_disp_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			intr_d_rmrks_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			ship_to_grp_p_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"ship_schd_dt_fr",
				"ship_schd_hm_fr",
				"ship_schd_dt_to",
				"ship_schd_hm_to",
				"ship_inst_dt_fr",
				"ship_inst_hm_fr",
				"ship_inst_dt_to",
				"ship_inst_hm_to",
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ship_to_grp_flg1",
				"ship_to_grp_cd1",
				"ship_to_grp_nm1",
				"ship_to_grp_flg2",
				"ship_to_grp_cd2",
				"ship_to_grp_nm2",
				"ship_to_grp_flg3",
				"ship_to_grp_cd3",
				"ship_to_grp_nm3",
				"ship_to_grp_flg4",
				"ship_to_grp_cd4",
				"ship_to_grp_nm4",
				"ship_to_grp_flg5",
				"ship_to_grp_cd5",
				"ship_to_grp_nm5",
				"ship_to_grp_flg6",
				"ship_to_grp_cd6",
				"ship_to_grp_nm6",
				"ship_to_grp_flg7",
				"ship_to_grp_cd7",
				"ship_to_grp_nm7",
				"ship_to_grp_flg8",
				"ship_to_grp_cd8",
				"ship_to_grp_nm8",
				"ship_to_grp_flg9",
				"ship_to_grp_cd9",
				"ship_to_grp_nm9",
				"ship_to_grp_flg10",
				"ship_to_grp_cd10",
				"ship_to_grp_nm10",
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
				$ship_schd_dt_fr,
				$ship_schd_hm_fr,
				$ship_schd_dt_to,
				$ship_schd_hm_to,
				$ship_inst_dt_fr,
				$ship_inst_hm_fr,
				$ship_inst_dt_to,
				$ship_inst_hm_to,
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ship_to_grp_flg1,
				$ship_to_grp_cd1,
				$ship_to_grp_nm1,
				$ship_to_grp_flg2,
				$ship_to_grp_cd2,
				$ship_to_grp_nm2,
				$ship_to_grp_flg3,
				$ship_to_grp_cd3,
				$ship_to_grp_nm3,
				$ship_to_grp_flg4,
				$ship_to_grp_cd4,
				$ship_to_grp_nm4,
				$ship_to_grp_flg5,
				$ship_to_grp_cd5,
				$ship_to_grp_nm5,
				$ship_to_grp_flg6,
				$ship_to_grp_cd6,
				$ship_to_grp_nm6,
				$ship_to_grp_flg7,
				$ship_to_grp_cd7,
				$ship_to_grp_nm7,
				$ship_to_grp_flg8,
				$ship_to_grp_cd8,
				$ship_to_grp_nm8,
				$ship_to_grp_flg9,
				$ship_to_grp_cd9,
				$ship_to_grp_nm9,
				$ship_to_grp_flg10,
				$ship_to_grp_cd10,
				$ship_to_grp_nm10,
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
				{$ship_loc_cd, "loc_nm"},	// ship_loc_cd
				{$ship_str_ln_cd, "str_ln_nm"},	// ship_str_ln_cd
				{$ship_to_id_cd, "ship_to_id_nm"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_nm"},	// dlv_id_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$ship_term_cd, "ship_term_nm"},	// ship_term_cd
				{$ship_wk_cd, "ship_wk_nm"},	// ship_wk_cd
				{$cst_itm_cd, "bp_itm_nm"},	// cst_itm_cd
				{$inst_usr_cd, "usr_nm"},	// inst_usr_cd
				{$inst_dpt_cd, "dpt_nm"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ship_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// ship_loc_cd
				{$ship_str_ln_cd, "ship_loc_cd;true"},	// ship_str_ln_cd
				{$ship_to_id_cd, "ship_to_id_typ"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// cst_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$inst_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SHIP"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ship_loc_cd, "loc_is_srch_typ"},	// ship_loc_cd
				{$ship_str_ln_cd, "loc_cd;mode_nullval_flg"},	// ship_str_ln_cd
				{$ship_to_id_cd, "ship_to_id_typ"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$inst_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// inst_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$ship_str_ln_cd, "STR_LN"},	// ship_str_ln_cd
				{$ship_str_ln_nm, "STR_LN"},	// ship_str_ln_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"}	// alloc_grp_nm
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
	 * UPD,Create,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Hdr,Header;Dtl,Details;Dlv,Delivery note Hdr,ヘッダ;Dtl,明細;Dlv,納品書.<p>
	 *
	 */
	public String disp_unit() {
		return getConstString(offset + 1, $disp_unit);
	}

	/**
	 * Hdr,Header;Dtl,Details;Dlv,Delivery note Hdr,ヘッダ;Dtl,明細;Dlv,納品書.<p>
	 *
	 */
	public void disp_unit(String value) {
		setConstString(offset + 1, $disp_unit, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean uninst() {
		return getConstBoolean(offset + 2, $uninst);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void uninst(boolean value) {
		setConstBoolean(offset + 2, $uninst, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst() {
		return getConstBoolean(offset + 3, $inst);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst(boolean value) {
		setConstBoolean(offset + 3, $inst, value);
	}


	/**
	 * Partially shipped 一部出荷済.<p>
	 *
	 */
	public boolean p_ship() {
		return getConstBoolean(offset + 4, $p_ship);
	}

	/**
	 * Partially shipped 一部出荷済.<p>
	 *
	 */
	public void p_ship(boolean value) {
		setConstBoolean(offset + 4, $p_ship, value);
	}


	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public boolean ship() {
		return getConstBoolean(offset + 5, $ship);
	}

	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public void ship(boolean value) {
		setConstBoolean(offset + 5, $ship, value);
	}


	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public boolean not_alloc_flg() {
		return getConstBoolean(offset + 6, $not_alloc_flg);
	}

	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public void not_alloc_flg(boolean value) {
		setConstBoolean(offset + 6, $not_alloc_flg, value);
	}


	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public boolean part_alloc_flg() {
		return getConstBoolean(offset + 7, $part_alloc_flg);
	}

	/**
	 * Partial allocation 一部引当.<p>
	 *
	 */
	public void part_alloc_flg(boolean value) {
		setConstBoolean(offset + 7, $part_alloc_flg, value);
	}


	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public boolean all_alloc_flg() {
		return getConstBoolean(offset + 8, $all_alloc_flg);
	}

	/**
	 * 100% allocation 全数引当.<p>
	 *
	 */
	public void all_alloc_flg(boolean value) {
		setConstBoolean(offset + 8, $all_alloc_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean alloc_invalid_flg() {
		return getConstBoolean(offset + 9, $alloc_invalid_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void alloc_invalid_flg(boolean value) {
		setConstBoolean(offset + 9, $alloc_invalid_flg, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 10, $wms_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 10, $wms_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean not_wms_flg() {
		return getConstBoolean(offset + 11, $not_wms_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void not_wms_flg(boolean value) {
		setConstBoolean(offset + 11, $not_wms_flg, value);
	}


	/**
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public boolean late_ship() {
		return getConstBoolean(offset + 12, $late_ship);
	}

	/**
	 * Desired shipping date delayed 出荷希望日遅れ.<p>
	 *
	 */
	public void late_ship(boolean value) {
		setConstBoolean(offset + 12, $late_ship, value);
	}


	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public boolean late_rqst() {
		return getConstBoolean(offset + 13, $late_rqst);
	}

	/**
	 * Delivery request date delayed 納品依頼日遅れ.<p>
	 *
	 */
	public void late_rqst(boolean value) {
		setConstBoolean(offset + 13, $late_rqst, value);
	}


	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public boolean pick_not_prnted() {
		return getConstBoolean(offset + 14, $pick_not_prnted);
	}

	/**
	 * Picking list unissued ピッキングリスト未発行.<p>
	 *
	 */
	public void pick_not_prnted(boolean value) {
		setConstBoolean(offset + 14, $pick_not_prnted, value);
	}


	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public boolean pick_prnted() {
		return getConstBoolean(offset + 15, $pick_prnted);
	}

	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public void pick_prnted(boolean value) {
		setConstBoolean(offset + 15, $pick_prnted, value);
	}


	/**
	 * Shipping order sheet unissued 出荷指図書未発行.<p>
	 *
	 */
	public boolean inst_not_prnted() {
		return getConstBoolean(offset + 16, $inst_not_prnted);
	}

	/**
	 * Shipping order sheet unissued 出荷指図書未発行.<p>
	 *
	 */
	public void inst_not_prnted(boolean value) {
		setConstBoolean(offset + 16, $inst_not_prnted, value);
	}


	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public boolean inst_prnted() {
		return getConstBoolean(offset + 17, $inst_prnted);
	}

	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public void inst_prnted(boolean value) {
		setConstBoolean(offset + 17, $inst_prnted, value);
	}


	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public boolean dlv_not_prnted() {
		return getConstBoolean(offset + 18, $dlv_not_prnted);
	}

	/**
	 * Delivery note unissued 納品書未発行.<p>
	 *
	 */
	public void dlv_not_prnted(boolean value) {
		setConstBoolean(offset + 18, $dlv_not_prnted, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_prnted() {
		return getConstBoolean(offset + 19, $dlv_prnted);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_prnted(boolean value) {
		setConstBoolean(offset + 19, $dlv_prnted, value);
	}


	/**
	 * Shipping guide unissued 出荷案内書未発行.<p>
	 *
	 */
	public boolean adv_not_prnted() {
		return getConstBoolean(offset + 20, $adv_not_prnted);
	}

	/**
	 * Shipping guide unissued 出荷案内書未発行.<p>
	 *
	 */
	public void adv_not_prnted(boolean value) {
		setConstBoolean(offset + 20, $adv_not_prnted, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean adv_prnted() {
		return getConstBoolean(offset + 21, $adv_prnted);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void adv_prnted(boolean value) {
		setConstBoolean(offset + 21, $adv_prnted, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_schd_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 22, $ship_schd_dt_frto_p);
	}
	
	public void ship_schd_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 22, $ship_schd_dt_frto_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_inst_dt_frto_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 23, $ship_inst_dt_frto_p);
	}
	
	public void ship_inst_dt_frto_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 23, $ship_inst_dt_frto_p, row);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 24, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 24, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 25, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 25, $lg_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 26, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 26, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 27, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 27, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 28, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 28, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 29, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 29, $wg_nm, value);
	}


	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 30, $ship_loc_cd);
	}

	/**
	 * Shipping point location cd. 出荷元場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 30, $ship_loc_cd, value);
	}


	/**
	 * Shipping point location name 出荷元場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 31, $ship_loc_nm);
	}

	/**
	 * Shipping point location name 出荷元場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 31, $ship_loc_nm, value);
	}


	/**
	 * Shipping point rack/line cd. 出荷元棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 32, $ship_str_ln_cd);
	}

	/**
	 * Shipping point rack/line cd. 出荷元棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 32, $ship_str_ln_cd, value);
	}


	/**
	 * Shipping point rack/line name 出荷元棚・ライン名.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return getConstString(offset + 33, $ship_str_ln_nm);
	}

	/**
	 * Shipping point rack/line name 出荷元棚・ライン名.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		setConstString(offset + 33, $ship_str_ln_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 34, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 34, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 35, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 35, $alloc_grp_nm, value);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 36, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 36, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 37, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 37, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 38, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 38, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 39, $ship_to_id_nm);
	}

	/**
	 * Receiving point name 送付先名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 39, $ship_to_id_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 40, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 40, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 41, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 41, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 42, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 42, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 43, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 43, $dlv_id_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 44, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 44, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 45, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 45, $cst_nm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 46, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 46, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 47, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 47, $ship_term_nm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 48, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 48, $ship_wk_cd, value);
	}


	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public String ship_wk_nm() {
		return getConstString(offset + 49, $ship_wk_nm);
	}

	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public void ship_wk_nm(String value) {
		setConstString(offset + 49, $ship_wk_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 50, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 50, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 51, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 51, $trd_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 52, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 52, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 53, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 53, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 54, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 54, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 55, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 55, $cst_itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 56, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 56, $iv_itm_nm, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 57, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 57, $inst_usr_cd, value);
	}


	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 58, $inst_usr_nm);
	}

	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 58, $inst_usr_nm, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 59, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 59, $inst_dpt_cd, value);
	}


	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 60, $inst_dpt_nm);
	}

	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 60, $inst_dpt_nm, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 61, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 61, $ship_schd_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 62, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 62, $ship_inst_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 63, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 63, $dlv_slip_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 64, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 64, $xfr_schd_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 65, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 65, $slo_d_no, value);
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 67, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 67, $iv_no, value);
	}


	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 68, $inst_rmrks);
	}

	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 68, $inst_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 69, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 69, $intr_rmrks, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean can_disp_flg() {
		return getConstBoolean(offset + 70, $can_disp_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void can_disp_flg(boolean value) {
		setConstBoolean(offset + 70, $can_disp_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 71, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 71, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 72, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 72, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 73, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 73, $sub_char3, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 74, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 74, $intr_d_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 75, $d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 75, $d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 76, $d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 76, $d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 77, $d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 77, $d_sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR ship_to_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 78, $ship_to_grp_p);
	}
	
	public void ship_to_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 78, $ship_to_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 79, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 79, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 80, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 80, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 81, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 81, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp_unit.equalsIgnoreCase(name)) {
			return disp_unit();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
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
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($uninst.equalsIgnoreCase(name)) {
			return uninst();
		}
		if ($inst.equalsIgnoreCase(name)) {
			return inst();
		}
		if ($p_ship.equalsIgnoreCase(name)) {
			return p_ship();
		}
		if ($ship.equalsIgnoreCase(name)) {
			return ship();
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($late_ship.equalsIgnoreCase(name)) {
			return late_ship();
		}
		if ($late_rqst.equalsIgnoreCase(name)) {
			return late_rqst();
		}
		if ($pick_not_prnted.equalsIgnoreCase(name)) {
			return pick_not_prnted();
		}
		if ($pick_prnted.equalsIgnoreCase(name)) {
			return pick_prnted();
		}
		if ($inst_not_prnted.equalsIgnoreCase(name)) {
			return inst_not_prnted();
		}
		if ($inst_prnted.equalsIgnoreCase(name)) {
			return inst_prnted();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($adv_not_prnted.equalsIgnoreCase(name)) {
			return adv_not_prnted();
		}
		if ($adv_prnted.equalsIgnoreCase(name)) {
			return adv_prnted();
		}
		if ($can_disp_flg.equalsIgnoreCase(name)) {
			return can_disp_flg();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_str_ln_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			return ship_wk_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
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
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($uninst.equalsIgnoreCase(name)) {
			return uninst();
		}
		if ($inst.equalsIgnoreCase(name)) {
			return inst();
		}
		if ($p_ship.equalsIgnoreCase(name)) {
			return p_ship();
		}
		if ($ship.equalsIgnoreCase(name)) {
			return ship();
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			return not_wms_flg();
		}
		if ($late_ship.equalsIgnoreCase(name)) {
			return late_ship();
		}
		if ($late_rqst.equalsIgnoreCase(name)) {
			return late_rqst();
		}
		if ($pick_not_prnted.equalsIgnoreCase(name)) {
			return pick_not_prnted();
		}
		if ($pick_prnted.equalsIgnoreCase(name)) {
			return pick_prnted();
		}
		if ($inst_not_prnted.equalsIgnoreCase(name)) {
			return inst_not_prnted();
		}
		if ($inst_prnted.equalsIgnoreCase(name)) {
			return inst_prnted();
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			return dlv_not_prnted();
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			return dlv_prnted();
		}
		if ($adv_not_prnted.equalsIgnoreCase(name)) {
			return adv_not_prnted();
		}
		if ($adv_prnted.equalsIgnoreCase(name)) {
			return adv_prnted();
		}
		if ($can_disp_flg.equalsIgnoreCase(name)) {
			return can_disp_flg();
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
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
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($uninst.equalsIgnoreCase(name)) {
			uninst(value);
			return;
		}
		if ($inst.equalsIgnoreCase(name)) {
			inst(value);
			return;
		}
		if ($p_ship.equalsIgnoreCase(name)) {
			p_ship(value);
			return;
		}
		if ($ship.equalsIgnoreCase(name)) {
			ship(value);
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($late_ship.equalsIgnoreCase(name)) {
			late_ship(value);
			return;
		}
		if ($late_rqst.equalsIgnoreCase(name)) {
			late_rqst(value);
			return;
		}
		if ($pick_not_prnted.equalsIgnoreCase(name)) {
			pick_not_prnted(value);
			return;
		}
		if ($pick_prnted.equalsIgnoreCase(name)) {
			pick_prnted(value);
			return;
		}
		if ($inst_not_prnted.equalsIgnoreCase(name)) {
			inst_not_prnted(value);
			return;
		}
		if ($inst_prnted.equalsIgnoreCase(name)) {
			inst_prnted(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($adv_not_prnted.equalsIgnoreCase(name)) {
			adv_not_prnted(value);
			return;
		}
		if ($adv_prnted.equalsIgnoreCase(name)) {
			adv_prnted(value);
			return;
		}
		if ($can_disp_flg.equalsIgnoreCase(name)) {
			can_disp_flg(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_str_ln_nm.equalsIgnoreCase(name)) {
			ship_str_ln_nm(value);
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
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($ship_wk_nm.equalsIgnoreCase(name)) {
			ship_wk_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($uninst.equalsIgnoreCase(name)) {
			uninst(value);
			return;
		}
		if ($inst.equalsIgnoreCase(name)) {
			inst(value);
			return;
		}
		if ($p_ship.equalsIgnoreCase(name)) {
			p_ship(value);
			return;
		}
		if ($ship.equalsIgnoreCase(name)) {
			ship(value);
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
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($not_wms_flg.equalsIgnoreCase(name)) {
			not_wms_flg(value);
			return;
		}
		if ($late_ship.equalsIgnoreCase(name)) {
			late_ship(value);
			return;
		}
		if ($late_rqst.equalsIgnoreCase(name)) {
			late_rqst(value);
			return;
		}
		if ($pick_not_prnted.equalsIgnoreCase(name)) {
			pick_not_prnted(value);
			return;
		}
		if ($pick_prnted.equalsIgnoreCase(name)) {
			pick_prnted(value);
			return;
		}
		if ($inst_not_prnted.equalsIgnoreCase(name)) {
			inst_not_prnted(value);
			return;
		}
		if ($inst_prnted.equalsIgnoreCase(name)) {
			inst_prnted(value);
			return;
		}
		if ($dlv_not_prnted.equalsIgnoreCase(name)) {
			dlv_not_prnted(value);
			return;
		}
		if ($dlv_prnted.equalsIgnoreCase(name)) {
			dlv_prnted(value);
			return;
		}
		if ($adv_not_prnted.equalsIgnoreCase(name)) {
			adv_not_prnted(value);
			return;
		}
		if ($adv_prnted.equalsIgnoreCase(name)) {
			adv_prnted(value);
			return;
		}
		if ($can_disp_flg.equalsIgnoreCase(name)) {
			can_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_schd_dt_frto_p.equalsIgnoreCase(name)) {
			return ship_schd_dt_frto_p();
		}
		if ($ship_inst_dt_frto_p.equalsIgnoreCase(name)) {
			return ship_inst_dt_frto_p();
		}
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ship_to_grp_p.equalsIgnoreCase(name)) {
			return ship_to_grp_p();
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
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ship_schd_dt_frto_p.equalsIgnoreCase(name)) {
			ship_schd_dt_frto_p(
				((MCContainerMeta) ship_schd_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_inst_dt_frto_p.equalsIgnoreCase(name)) {
			ship_inst_dt_frto_p(
				((MCContainerMeta) ship_inst_dt_frto_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($ship_to_grp_p.equalsIgnoreCase(name)) {
			ship_to_grp_p(
				((MCContainerMeta) ship_to_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_dt_fr() {
		return ship_schd_dt_frto_p().ymd_fr();
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_dt_fr(MCDate value) {
		ship_schd_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_hm_fr() {
		return ship_schd_dt_frto_p().hm_fr();
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_hm_fr(MCDate value) {
		ship_schd_dt_frto_p().hm_fr(value);
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_dt_to() {
		return ship_schd_dt_frto_p().ymd_to();
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public void ship_schd_dt_to(MCDate value) {
		ship_schd_dt_frto_p().ymd_to(value);
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_hm_to() {
		return ship_schd_dt_frto_p().hm_to();
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public void ship_schd_hm_to(MCDate value) {
		ship_schd_dt_frto_p().hm_to(value);
	}

	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_dt_fr() {
		return ship_inst_dt_frto_p().ymd_fr();
	}

	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_dt_fr(MCDate value) {
		ship_inst_dt_frto_p().ymd_fr(value);
	}

	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_hm_fr() {
		return ship_inst_dt_frto_p().hm_fr();
	}

	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_hm_fr(MCDate value) {
		ship_inst_dt_frto_p().hm_fr(value);
	}

	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_dt_to() {
		return ship_inst_dt_frto_p().ymd_to();
	}

	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public void ship_inst_dt_to(MCDate value) {
		ship_inst_dt_frto_p().ymd_to(value);
	}

	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_hm_to() {
		return ship_inst_dt_frto_p().hm_to();
	}

	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public void ship_inst_hm_to(MCDate value) {
		ship_inst_dt_frto_p().hm_to(value);
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

	/**
	 * Receiving point classification 1 送付先分類１.<p>
	 *
	 */
	public boolean ship_to_grp_flg1() {
		return ship_to_grp_p().bp_grp_flg1();
	}

	/**
	 * Receiving point classification 1 送付先分類１.<p>
	 *
	 */
	public void ship_to_grp_flg1(boolean value) {
		ship_to_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Receiving point classification cd. 1 送付先分類ＣＤ１.<p>
	 *
	 */
	public String ship_to_grp_cd1() {
		return ship_to_grp_p().bp_grp_cd1();
	}

	/**
	 * Receiving point classification cd. 1 送付先分類ＣＤ１.<p>
	 *
	 */
	public void ship_to_grp_cd1(String value) {
		ship_to_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Receiving point classification name 1 送付先分類名１.<p>
	 *
	 */
	public String ship_to_grp_nm1() {
		return ship_to_grp_p().bp_grp_nm1();
	}

	/**
	 * Receiving point classification name 1 送付先分類名１.<p>
	 *
	 */
	public void ship_to_grp_nm1(String value) {
		ship_to_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Receiving point classification 2 送付先分類２.<p>
	 *
	 */
	public boolean ship_to_grp_flg2() {
		return ship_to_grp_p().bp_grp_flg2();
	}

	/**
	 * Receiving point classification 2 送付先分類２.<p>
	 *
	 */
	public void ship_to_grp_flg2(boolean value) {
		ship_to_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Receiving point classification cd. 2 送付先分類ＣＤ２.<p>
	 *
	 */
	public String ship_to_grp_cd2() {
		return ship_to_grp_p().bp_grp_cd2();
	}

	/**
	 * Receiving point classification cd. 2 送付先分類ＣＤ２.<p>
	 *
	 */
	public void ship_to_grp_cd2(String value) {
		ship_to_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Receiving point classification name 2 送付先分類名２.<p>
	 *
	 */
	public String ship_to_grp_nm2() {
		return ship_to_grp_p().bp_grp_nm2();
	}

	/**
	 * Receiving point classification name 2 送付先分類名２.<p>
	 *
	 */
	public void ship_to_grp_nm2(String value) {
		ship_to_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Receiving point classification 3 送付先分類３.<p>
	 *
	 */
	public boolean ship_to_grp_flg3() {
		return ship_to_grp_p().bp_grp_flg3();
	}

	/**
	 * Receiving point classification 3 送付先分類３.<p>
	 *
	 */
	public void ship_to_grp_flg3(boolean value) {
		ship_to_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Receiving point classification cd. 3 送付先分類ＣＤ３.<p>
	 *
	 */
	public String ship_to_grp_cd3() {
		return ship_to_grp_p().bp_grp_cd3();
	}

	/**
	 * Receiving point classification cd. 3 送付先分類ＣＤ３.<p>
	 *
	 */
	public void ship_to_grp_cd3(String value) {
		ship_to_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Receiving point classification name 3 送付先分類名３.<p>
	 *
	 */
	public String ship_to_grp_nm3() {
		return ship_to_grp_p().bp_grp_nm3();
	}

	/**
	 * Receiving point classification name 3 送付先分類名３.<p>
	 *
	 */
	public void ship_to_grp_nm3(String value) {
		ship_to_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Receiving point classification 4 送付先分類４.<p>
	 *
	 */
	public boolean ship_to_grp_flg4() {
		return ship_to_grp_p().bp_grp_flg4();
	}

	/**
	 * Receiving point classification 4 送付先分類４.<p>
	 *
	 */
	public void ship_to_grp_flg4(boolean value) {
		ship_to_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Receiving point classification cd. 4 送付先分類ＣＤ４.<p>
	 *
	 */
	public String ship_to_grp_cd4() {
		return ship_to_grp_p().bp_grp_cd4();
	}

	/**
	 * Receiving point classification cd. 4 送付先分類ＣＤ４.<p>
	 *
	 */
	public void ship_to_grp_cd4(String value) {
		ship_to_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Receiving point classification name 4 送付先分類名４.<p>
	 *
	 */
	public String ship_to_grp_nm4() {
		return ship_to_grp_p().bp_grp_nm4();
	}

	/**
	 * Receiving point classification name 4 送付先分類名４.<p>
	 *
	 */
	public void ship_to_grp_nm4(String value) {
		ship_to_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Receiving point classification 5 送付先分類５.<p>
	 *
	 */
	public boolean ship_to_grp_flg5() {
		return ship_to_grp_p().bp_grp_flg5();
	}

	/**
	 * Receiving point classification 5 送付先分類５.<p>
	 *
	 */
	public void ship_to_grp_flg5(boolean value) {
		ship_to_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Receiving point classification cd. 5 送付先分類ＣＤ５.<p>
	 *
	 */
	public String ship_to_grp_cd5() {
		return ship_to_grp_p().bp_grp_cd5();
	}

	/**
	 * Receiving point classification cd. 5 送付先分類ＣＤ５.<p>
	 *
	 */
	public void ship_to_grp_cd5(String value) {
		ship_to_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Receiving point classification name 5 送付先分類名５.<p>
	 *
	 */
	public String ship_to_grp_nm5() {
		return ship_to_grp_p().bp_grp_nm5();
	}

	/**
	 * Receiving point classification name 5 送付先分類名５.<p>
	 *
	 */
	public void ship_to_grp_nm5(String value) {
		ship_to_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Receiving point classification 6 送付先分類６.<p>
	 *
	 */
	public boolean ship_to_grp_flg6() {
		return ship_to_grp_p().bp_grp_flg6();
	}

	/**
	 * Receiving point classification 6 送付先分類６.<p>
	 *
	 */
	public void ship_to_grp_flg6(boolean value) {
		ship_to_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Receiving point classification cd. 6 送付先分類ＣＤ６.<p>
	 *
	 */
	public String ship_to_grp_cd6() {
		return ship_to_grp_p().bp_grp_cd6();
	}

	/**
	 * Receiving point classification cd. 6 送付先分類ＣＤ６.<p>
	 *
	 */
	public void ship_to_grp_cd6(String value) {
		ship_to_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Receiving point classification name 6 送付先分類名６.<p>
	 *
	 */
	public String ship_to_grp_nm6() {
		return ship_to_grp_p().bp_grp_nm6();
	}

	/**
	 * Receiving point classification name 6 送付先分類名６.<p>
	 *
	 */
	public void ship_to_grp_nm6(String value) {
		ship_to_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Receiving point classification 7 送付先分類７.<p>
	 *
	 */
	public boolean ship_to_grp_flg7() {
		return ship_to_grp_p().bp_grp_flg7();
	}

	/**
	 * Receiving point classification 7 送付先分類７.<p>
	 *
	 */
	public void ship_to_grp_flg7(boolean value) {
		ship_to_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Receiving point classification cd. 7 送付先分類ＣＤ７.<p>
	 *
	 */
	public String ship_to_grp_cd7() {
		return ship_to_grp_p().bp_grp_cd7();
	}

	/**
	 * Receiving point classification cd. 7 送付先分類ＣＤ７.<p>
	 *
	 */
	public void ship_to_grp_cd7(String value) {
		ship_to_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Receiving point classification name 7 送付先分類名７.<p>
	 *
	 */
	public String ship_to_grp_nm7() {
		return ship_to_grp_p().bp_grp_nm7();
	}

	/**
	 * Receiving point classification name 7 送付先分類名７.<p>
	 *
	 */
	public void ship_to_grp_nm7(String value) {
		ship_to_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Receiving point classification 8 送付先分類８.<p>
	 *
	 */
	public boolean ship_to_grp_flg8() {
		return ship_to_grp_p().bp_grp_flg8();
	}

	/**
	 * Receiving point classification 8 送付先分類８.<p>
	 *
	 */
	public void ship_to_grp_flg8(boolean value) {
		ship_to_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Receiving point classification cd. 8 送付先分類ＣＤ８.<p>
	 *
	 */
	public String ship_to_grp_cd8() {
		return ship_to_grp_p().bp_grp_cd8();
	}

	/**
	 * Receiving point classification cd. 8 送付先分類ＣＤ８.<p>
	 *
	 */
	public void ship_to_grp_cd8(String value) {
		ship_to_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Receiving point classification name 8 送付先分類名８.<p>
	 *
	 */
	public String ship_to_grp_nm8() {
		return ship_to_grp_p().bp_grp_nm8();
	}

	/**
	 * Receiving point classification name 8 送付先分類名８.<p>
	 *
	 */
	public void ship_to_grp_nm8(String value) {
		ship_to_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Receiving point classification 9 送付先分類９.<p>
	 *
	 */
	public boolean ship_to_grp_flg9() {
		return ship_to_grp_p().bp_grp_flg9();
	}

	/**
	 * Receiving point classification 9 送付先分類９.<p>
	 *
	 */
	public void ship_to_grp_flg9(boolean value) {
		ship_to_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Receiving point classification cd. 9 送付先分類ＣＤ９.<p>
	 *
	 */
	public String ship_to_grp_cd9() {
		return ship_to_grp_p().bp_grp_cd9();
	}

	/**
	 * Receiving point classification cd. 9 送付先分類ＣＤ９.<p>
	 *
	 */
	public void ship_to_grp_cd9(String value) {
		ship_to_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Receiving point classification name 9 送付先分類名９.<p>
	 *
	 */
	public String ship_to_grp_nm9() {
		return ship_to_grp_p().bp_grp_nm9();
	}

	/**
	 * Receiving point classification name 9 送付先分類名９.<p>
	 *
	 */
	public void ship_to_grp_nm9(String value) {
		ship_to_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Receiving point classification 10 送付先分類１０.<p>
	 *
	 */
	public boolean ship_to_grp_flg10() {
		return ship_to_grp_p().bp_grp_flg10();
	}

	/**
	 * Receiving point classification 10 送付先分類１０.<p>
	 *
	 */
	public void ship_to_grp_flg10(boolean value) {
		ship_to_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Receiving point classification cd. 10 送付先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_to_grp_cd10() {
		return ship_to_grp_p().bp_grp_cd10();
	}

	/**
	 * Receiving point classification cd. 10 送付先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_to_grp_cd10(String value) {
		ship_to_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Receiving point classification name 10 送付先分類名１０.<p>
	 *
	 */
	public String ship_to_grp_nm10() {
		return ship_to_grp_p().bp_grp_nm10();
	}

	/**
	 * Receiving point classification name 10 送付先分類名１０.<p>
	 *
	 */
	public void ship_to_grp_nm10(String value) {
		ship_to_grp_p().bp_grp_nm10(value);
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

