package mcframe.clientMSBE.MSBEP1710;

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
	 * SHIP_SCHD,Shipping schedule,0;SHIP_INST,Shipping order,1;SHIP_ACT,Shipping result,2 SHIP_SCHD,出荷予定,0;SHIP_INST,出荷指図,1;SHIP_ACT,出荷実績,2.<p>
	 *
	 */
	public static final String $srch_mode = "srch_mode";
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
	public static final String $ship_schd_dt_p = "ship_schd_dt_p";
	public static final String $dlv_rqst_dt_p = "dlv_rqst_dt_p";
	public static final String $ship_inst_dt_p = "ship_inst_dt_p";
	public static final String $ship_dt_p = "ship_dt_p";
	public static final String $dlv_dt_p = "dlv_dt_p";
	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $etd_dt_fr = "etd_dt_fr";
	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public static final String $etd_dt_to = "etd_dt_to";
	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $eta_dt_fr = "eta_dt_fr";
	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public static final String $eta_dt_to = "eta_dt_to";
	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $via_schd_dt_fr = "via_schd_dt_fr";
	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public static final String $via_schd_dt_to = "via_schd_dt_to";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
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
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
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
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
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
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public static final String $ship_rqst_no = "ship_rqst_no";
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
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
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
	public static final String $ship_rqst_id_grp_p = "ship_rqst_id_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $ship_schd_dt_fr = $ship_schd_dt_p + ".ymd_fr";
	public static final String $ship_schd_hm_fr = $ship_schd_dt_p + ".hm_fr";
	public static final String $ship_schd_dt_to = $ship_schd_dt_p + ".ymd_to";
	public static final String $ship_schd_hm_to = $ship_schd_dt_p + ".hm_to";
	public static final String $dlv_rqst_dt_fr = $dlv_rqst_dt_p + ".ymd_fr";
	public static final String $dlv_rqst_hm_fr = $dlv_rqst_dt_p + ".hm_fr";
	public static final String $dlv_rqst_dt_to = $dlv_rqst_dt_p + ".ymd_to";
	public static final String $dlv_rqst_hm_to = $dlv_rqst_dt_p + ".hm_to";
	public static final String $ship_inst_dt_fr = $ship_inst_dt_p + ".ymd_fr";
	public static final String $ship_inst_hm_fr = $ship_inst_dt_p + ".hm_fr";
	public static final String $ship_inst_dt_to = $ship_inst_dt_p + ".ymd_to";
	public static final String $ship_inst_hm_to = $ship_inst_dt_p + ".hm_to";
	public static final String $ship_dt_fr = $ship_dt_p + ".ymd_fr";
	public static final String $ship_hm_fr = $ship_dt_p + ".hm_fr";
	public static final String $ship_dt_to = $ship_dt_p + ".ymd_to";
	public static final String $ship_hm_to = $ship_dt_p + ".hm_to";
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
	public static final String $ship_rqst_id_grp_lab1 = $ship_rqst_id_grp_p + ".bp_grp_lab1";
	public static final String $ship_rqst_id_grp_flg1 = $ship_rqst_id_grp_p + ".bp_grp_flg1";
	public static final String $ship_rqst_id_grp_cd1 = $ship_rqst_id_grp_p + ".bp_grp_cd1";
	public static final String $ship_rqst_id_grp_nm1 = $ship_rqst_id_grp_p + ".bp_grp_nm1";
	public static final String $ship_rqst_id_grp_lab2 = $ship_rqst_id_grp_p + ".bp_grp_lab2";
	public static final String $ship_rqst_id_grp_flg2 = $ship_rqst_id_grp_p + ".bp_grp_flg2";
	public static final String $ship_rqst_id_grp_cd2 = $ship_rqst_id_grp_p + ".bp_grp_cd2";
	public static final String $ship_rqst_id_grp_nm2 = $ship_rqst_id_grp_p + ".bp_grp_nm2";
	public static final String $ship_rqst_id_grp_lab3 = $ship_rqst_id_grp_p + ".bp_grp_lab3";
	public static final String $ship_rqst_id_grp_flg3 = $ship_rqst_id_grp_p + ".bp_grp_flg3";
	public static final String $ship_rqst_id_grp_cd3 = $ship_rqst_id_grp_p + ".bp_grp_cd3";
	public static final String $ship_rqst_id_grp_nm3 = $ship_rqst_id_grp_p + ".bp_grp_nm3";
	public static final String $ship_rqst_id_grp_lab4 = $ship_rqst_id_grp_p + ".bp_grp_lab4";
	public static final String $ship_rqst_id_grp_flg4 = $ship_rqst_id_grp_p + ".bp_grp_flg4";
	public static final String $ship_rqst_id_grp_cd4 = $ship_rqst_id_grp_p + ".bp_grp_cd4";
	public static final String $ship_rqst_id_grp_nm4 = $ship_rqst_id_grp_p + ".bp_grp_nm4";
	public static final String $ship_rqst_id_grp_lab5 = $ship_rqst_id_grp_p + ".bp_grp_lab5";
	public static final String $ship_rqst_id_grp_flg5 = $ship_rqst_id_grp_p + ".bp_grp_flg5";
	public static final String $ship_rqst_id_grp_cd5 = $ship_rqst_id_grp_p + ".bp_grp_cd5";
	public static final String $ship_rqst_id_grp_nm5 = $ship_rqst_id_grp_p + ".bp_grp_nm5";
	public static final String $ship_rqst_id_grp_lab6 = $ship_rqst_id_grp_p + ".bp_grp_lab6";
	public static final String $ship_rqst_id_grp_flg6 = $ship_rqst_id_grp_p + ".bp_grp_flg6";
	public static final String $ship_rqst_id_grp_cd6 = $ship_rqst_id_grp_p + ".bp_grp_cd6";
	public static final String $ship_rqst_id_grp_nm6 = $ship_rqst_id_grp_p + ".bp_grp_nm6";
	public static final String $ship_rqst_id_grp_lab7 = $ship_rqst_id_grp_p + ".bp_grp_lab7";
	public static final String $ship_rqst_id_grp_flg7 = $ship_rqst_id_grp_p + ".bp_grp_flg7";
	public static final String $ship_rqst_id_grp_cd7 = $ship_rqst_id_grp_p + ".bp_grp_cd7";
	public static final String $ship_rqst_id_grp_nm7 = $ship_rqst_id_grp_p + ".bp_grp_nm7";
	public static final String $ship_rqst_id_grp_lab8 = $ship_rqst_id_grp_p + ".bp_grp_lab8";
	public static final String $ship_rqst_id_grp_flg8 = $ship_rqst_id_grp_p + ".bp_grp_flg8";
	public static final String $ship_rqst_id_grp_cd8 = $ship_rqst_id_grp_p + ".bp_grp_cd8";
	public static final String $ship_rqst_id_grp_nm8 = $ship_rqst_id_grp_p + ".bp_grp_nm8";
	public static final String $ship_rqst_id_grp_lab9 = $ship_rqst_id_grp_p + ".bp_grp_lab9";
	public static final String $ship_rqst_id_grp_flg9 = $ship_rqst_id_grp_p + ".bp_grp_flg9";
	public static final String $ship_rqst_id_grp_cd9 = $ship_rqst_id_grp_p + ".bp_grp_cd9";
	public static final String $ship_rqst_id_grp_nm9 = $ship_rqst_id_grp_p + ".bp_grp_nm9";
	public static final String $ship_rqst_id_grp_lab10 = $ship_rqst_id_grp_p + ".bp_grp_lab10";
	public static final String $ship_rqst_id_grp_flg10 = $ship_rqst_id_grp_p + ".bp_grp_flg10";
	public static final String $ship_rqst_id_grp_cd10 = $ship_rqst_id_grp_p + ".bp_grp_cd10";
	public static final String $ship_rqst_id_grp_nm10 = $ship_rqst_id_grp_p + ".bp_grp_nm10";
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

	public static final MCMeta srch_mode_META = createStringMeta($srch_mode);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ship_flg_META = createCommonMeta($not_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_ship_flg_META = createCommonMeta($part_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_flg_META = createCommonMeta($ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_dt_p_META = createInnerRowMeta($ship_schd_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_rqst_dt_p_META = createInnerRowMeta($dlv_rqst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_inst_dt_p_META = createInnerRowMeta($ship_inst_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta ship_dt_p_META = createInnerRowMeta($ship_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta dlv_dt_p_META = createInnerRowMeta($dlv_dt_p, mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class);
	public static final MCMeta etd_dt_fr_META = createCommonMeta($etd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta etd_dt_to_META = createCommonMeta($etd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta eta_dt_fr_META = createCommonMeta($eta_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta eta_dt_to_META = createCommonMeta($eta_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_schd_dt_fr_META = createCommonMeta($via_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_schd_dt_to_META = createCommonMeta($via_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ship_rqst_id_grp_p_META = createInnerRowMeta($ship_rqst_id_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			srch_mode_META,
			not_inst_flg_META,
			inst_flg_META,
			not_ship_flg_META,
			part_ship_flg_META,
			ship_flg_META,
			ship_schd_dt_p_META,
			dlv_rqst_dt_p_META,
			ship_inst_dt_p_META,
			ship_dt_p_META,
			dlv_dt_p_META,
			etd_dt_fr_META,
			etd_dt_to_META,
			eta_dt_fr_META,
			eta_dt_to_META,
			via_schd_dt_fr_META,
			via_schd_dt_to_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			trd_cd_META,
			trd_nm_META,
			ship_schd_no_META,
			slo_no_META,
			ship_rqst_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			ship_act_no_META,
			ship_act_d_no_META,
			itm_typ_p_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			ship_rqst_id_grp_p_META,
			dlv_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"ship_schd_dt_fr",
				"ship_schd_hm_fr",
				"ship_schd_dt_to",
				"ship_schd_hm_to",
				"dlv_rqst_dt_fr",
				"dlv_rqst_hm_fr",
				"dlv_rqst_dt_to",
				"dlv_rqst_hm_to",
				"ship_inst_dt_fr",
				"ship_inst_hm_fr",
				"ship_inst_dt_to",
				"ship_inst_hm_to",
				"ship_dt_fr",
				"ship_hm_fr",
				"ship_dt_to",
				"ship_hm_to",
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
				"ship_rqst_id_grp_flg1",
				"ship_rqst_id_grp_cd1",
				"ship_rqst_id_grp_nm1",
				"ship_rqst_id_grp_flg2",
				"ship_rqst_id_grp_cd2",
				"ship_rqst_id_grp_nm2",
				"ship_rqst_id_grp_flg3",
				"ship_rqst_id_grp_cd3",
				"ship_rqst_id_grp_nm3",
				"ship_rqst_id_grp_flg4",
				"ship_rqst_id_grp_cd4",
				"ship_rqst_id_grp_nm4",
				"ship_rqst_id_grp_flg5",
				"ship_rqst_id_grp_cd5",
				"ship_rqst_id_grp_nm5",
				"ship_rqst_id_grp_flg6",
				"ship_rqst_id_grp_cd6",
				"ship_rqst_id_grp_nm6",
				"ship_rqst_id_grp_flg7",
				"ship_rqst_id_grp_cd7",
				"ship_rqst_id_grp_nm7",
				"ship_rqst_id_grp_flg8",
				"ship_rqst_id_grp_cd8",
				"ship_rqst_id_grp_nm8",
				"ship_rqst_id_grp_flg9",
				"ship_rqst_id_grp_cd9",
				"ship_rqst_id_grp_nm9",
				"ship_rqst_id_grp_flg10",
				"ship_rqst_id_grp_cd10",
				"ship_rqst_id_grp_nm10",
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
				$ship_schd_dt_fr,
				$ship_schd_hm_fr,
				$ship_schd_dt_to,
				$ship_schd_hm_to,
				$dlv_rqst_dt_fr,
				$dlv_rqst_hm_fr,
				$dlv_rqst_dt_to,
				$dlv_rqst_hm_to,
				$ship_inst_dt_fr,
				$ship_inst_hm_fr,
				$ship_inst_dt_to,
				$ship_inst_hm_to,
				$ship_dt_fr,
				$ship_hm_fr,
				$ship_dt_to,
				$ship_hm_to,
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
				$ship_rqst_id_grp_flg1,
				$ship_rqst_id_grp_cd1,
				$ship_rqst_id_grp_nm1,
				$ship_rqst_id_grp_flg2,
				$ship_rqst_id_grp_cd2,
				$ship_rqst_id_grp_nm2,
				$ship_rqst_id_grp_flg3,
				$ship_rqst_id_grp_cd3,
				$ship_rqst_id_grp_nm3,
				$ship_rqst_id_grp_flg4,
				$ship_rqst_id_grp_cd4,
				$ship_rqst_id_grp_nm4,
				$ship_rqst_id_grp_flg5,
				$ship_rqst_id_grp_cd5,
				$ship_rqst_id_grp_nm5,
				$ship_rqst_id_grp_flg6,
				$ship_rqst_id_grp_cd6,
				$ship_rqst_id_grp_nm6,
				$ship_rqst_id_grp_flg7,
				$ship_rqst_id_grp_cd7,
				$ship_rqst_id_grp_nm7,
				$ship_rqst_id_grp_flg8,
				$ship_rqst_id_grp_cd8,
				$ship_rqst_id_grp_nm8,
				$ship_rqst_id_grp_flg9,
				$ship_rqst_id_grp_cd9,
				$ship_rqst_id_grp_nm9,
				$ship_rqst_id_grp_flg10,
				$ship_rqst_id_grp_cd10,
				$ship_rqst_id_grp_nm10,
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
	/** 項目属性情報のグループ[DIF_CHK]のキー定数 */
	public static final String $$DIF_CHK = "DIF_CHK";
	/** 項目属性情報のグループ[SELECTABLE]のキー定数 */
	public static final String $$SELECTABLE = "SELECTABLE";
	/** 項目属性情報のグループ[CHK_SCRN_TRAN]のキー定数 */
	public static final String $$CHK_SCRN_TRAN = "CHK_SCRN_TRAN";
	/** 項目属性情報のグループ[SCRN_TRAN]のキー定数 */
	public static final String $$SCRN_TRAN = "SCRN_TRAN";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "lg_grp_nm"},	// ship_fr_lg_grp_cd
				{$tdlv_cd, "bp_nm"},	// tdlv_cd
				{$cst_itm_cd, "bp_itm_nm"}	// cst_itm_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV"},	// tdlv_cd
				{$ship_rqst_id_cd, "ship_rqst_id_typ"},	// ship_rqst_id_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$tdlv_cd, "bp_is_srch_typ"},	// tdlv_cd
				{$ship_rqst_id_cd, "ship_rqst_id_typ"},	// ship_rqst_id_cd
				{$dlv_id_cd, "dlv_id_typ"},	// dlv_id_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;sundry_itm_nm_rem_flg"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DIF_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SELECTABLE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_SCRN_TRAN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SCRN_TRAN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"}	// ship_fr_lg_grp_nm
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
	 * SHIP_SCHD,Shipping schedule,0;SHIP_INST,Shipping order,1;SHIP_ACT,Shipping result,2 SHIP_SCHD,出荷予定,0;SHIP_INST,出荷指図,1;SHIP_ACT,出荷実績,2.<p>
	 *
	 */
	public String srch_mode() {
		return getConstString(offset + 0, $srch_mode);
	}

	/**
	 * SHIP_SCHD,Shipping schedule,0;SHIP_INST,Shipping order,1;SHIP_ACT,Shipping result,2 SHIP_SCHD,出荷予定,0;SHIP_INST,出荷指図,1;SHIP_ACT,出荷実績,2.<p>
	 *
	 */
	public void srch_mode(String value) {
		setConstString(offset + 0, $srch_mode, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 1, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 1, $not_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 2, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 2, $inst_flg, value);
	}


	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public boolean not_ship_flg() {
		return getConstBoolean(offset + 3, $not_ship_flg);
	}

	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public void not_ship_flg(boolean value) {
		setConstBoolean(offset + 3, $not_ship_flg, value);
	}


	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public boolean part_ship_flg() {
		return getConstBoolean(offset + 4, $part_ship_flg);
	}

	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public void part_ship_flg(boolean value) {
		setConstBoolean(offset + 4, $part_ship_flg, value);
	}


	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 5, $ship_flg);
	}

	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 5, $ship_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_schd_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 6, $ship_schd_dt_p);
	}
	
	public void ship_schd_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 6, $ship_schd_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_rqst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 7, $dlv_rqst_dt_p);
	}
	
	public void dlv_rqst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 7, $dlv_rqst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_inst_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 8, $ship_inst_dt_p);
	}
	
	public void ship_inst_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 8, $ship_inst_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR ship_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 9, $ship_dt_p);
	}
	
	public void ship_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 9, $ship_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0400.YmdHmFrToR dlv_dt_p(){
		return (mcframe.clientMAUB.MAUBP0400.YmdHmFrToR) getConstInnerRow(offset + 10, $dlv_dt_p);
	}
	
	public void dlv_dt_p(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR row){
		setConstInnerRow(offset + 10, $dlv_dt_p, row);
	}


	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate etd_dt_fr() {
		return getConstDate(offset + 11, $etd_dt_fr);
	}

	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public void etd_dt_fr(MCDate value) {
		setConstDate(offset + 11, $etd_dt_fr, value);
	}


	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public MCDate etd_dt_to() {
		return getConstDate(offset + 12, $etd_dt_to);
	}

	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public void etd_dt_to(MCDate value) {
		setConstDate(offset + 12, $etd_dt_to, value);
	}


	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate eta_dt_fr() {
		return getConstDate(offset + 13, $eta_dt_fr);
	}

	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public void eta_dt_fr(MCDate value) {
		setConstDate(offset + 13, $eta_dt_fr, value);
	}


	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public MCDate eta_dt_to() {
		return getConstDate(offset + 14, $eta_dt_to);
	}

	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public void eta_dt_to(MCDate value) {
		setConstDate(offset + 14, $eta_dt_to, value);
	}


	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate via_schd_dt_fr() {
		return getConstDate(offset + 15, $via_schd_dt_fr);
	}

	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public void via_schd_dt_fr(MCDate value) {
		setConstDate(offset + 15, $via_schd_dt_fr, value);
	}


	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public MCDate via_schd_dt_to() {
		return getConstDate(offset + 16, $via_schd_dt_to);
	}

	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public void via_schd_dt_to(MCDate value) {
		setConstDate(offset + 16, $via_schd_dt_to, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 17, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 17, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 18, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 18, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 19, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 19, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 20, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 20, $tdlv_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 21, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 21, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 22, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 22, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 23, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 23, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 24, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 24, $ship_rqst_id_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 25, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 25, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 26, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 26, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 27, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 27, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 28, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 28, $dlv_id_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 29, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 29, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 30, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 30, $trd_nm, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 31, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 31, $ship_schd_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 32, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 32, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 33, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 33, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 34, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 34, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 35, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 35, $cst_po_d_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 36, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 36, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 37, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 37, $ship_inst_d_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 38, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 38, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 39, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 39, $ship_act_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 40, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 40, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 41, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 41, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 42, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 42, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 43, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 43, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR ship_rqst_id_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 44, $ship_rqst_id_grp_p);
	}
	
	public void ship_rqst_id_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 44, $ship_rqst_id_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 45, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 45, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 46, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 46, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($etd_dt_fr.equalsIgnoreCase(name)) {
			return etd_dt_fr();
		}
		if ($etd_dt_to.equalsIgnoreCase(name)) {
			return etd_dt_to();
		}
		if ($eta_dt_fr.equalsIgnoreCase(name)) {
			return eta_dt_fr();
		}
		if ($eta_dt_to.equalsIgnoreCase(name)) {
			return eta_dt_to();
		}
		if ($via_schd_dt_fr.equalsIgnoreCase(name)) {
			return via_schd_dt_fr();
		}
		if ($via_schd_dt_to.equalsIgnoreCase(name)) {
			return via_schd_dt_to();
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
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			return not_ship_flg();
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			return part_ship_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			return ship_rqst_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_act_d_no.equalsIgnoreCase(name)) {
			return ship_act_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($etd_dt_fr.equalsIgnoreCase(name)) {
			return etd_dt_fr();
		}
		if ($etd_dt_to.equalsIgnoreCase(name)) {
			return etd_dt_to();
		}
		if ($eta_dt_fr.equalsIgnoreCase(name)) {
			return eta_dt_fr();
		}
		if ($eta_dt_to.equalsIgnoreCase(name)) {
			return eta_dt_to();
		}
		if ($via_schd_dt_fr.equalsIgnoreCase(name)) {
			return via_schd_dt_fr();
		}
		if ($via_schd_dt_to.equalsIgnoreCase(name)) {
			return via_schd_dt_to();
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
		if ($not_ship_flg.equalsIgnoreCase(name)) {
			return not_ship_flg();
		}
		if ($part_ship_flg.equalsIgnoreCase(name)) {
			return part_ship_flg();
		}
		if ($ship_flg.equalsIgnoreCase(name)) {
			return ship_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
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
	public void setDate(String name, MCDate value) {
		if ($etd_dt_fr.equalsIgnoreCase(name)) {
			etd_dt_fr(value);
			return;
		}
		if ($etd_dt_to.equalsIgnoreCase(name)) {
			etd_dt_to(value);
			return;
		}
		if ($eta_dt_fr.equalsIgnoreCase(name)) {
			eta_dt_fr(value);
			return;
		}
		if ($eta_dt_to.equalsIgnoreCase(name)) {
			eta_dt_to(value);
			return;
		}
		if ($via_schd_dt_fr.equalsIgnoreCase(name)) {
			via_schd_dt_fr(value);
			return;
		}
		if ($via_schd_dt_to.equalsIgnoreCase(name)) {
			via_schd_dt_to(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_rqst_no.equalsIgnoreCase(name)) {
			ship_rqst_no(value);
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
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($etd_dt_fr.equalsIgnoreCase(name)) {
			etd_dt_fr(value);
			return;
		}
		if ($etd_dt_to.equalsIgnoreCase(name)) {
			etd_dt_to(value);
			return;
		}
		if ($eta_dt_fr.equalsIgnoreCase(name)) {
			eta_dt_fr(value);
			return;
		}
		if ($eta_dt_to.equalsIgnoreCase(name)) {
			eta_dt_to(value);
			return;
		}
		if ($via_schd_dt_fr.equalsIgnoreCase(name)) {
			via_schd_dt_fr(value);
			return;
		}
		if ($via_schd_dt_to.equalsIgnoreCase(name)) {
			via_schd_dt_to(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			return ship_schd_dt_p();
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_p();
		}
		if ($ship_inst_dt_p.equalsIgnoreCase(name)) {
			return ship_inst_dt_p();
		}
		if ($ship_dt_p.equalsIgnoreCase(name)) {
			return ship_dt_p();
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
		if ($ship_rqst_id_grp_p.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_p();
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
		if ($ship_schd_dt_p.equalsIgnoreCase(name)) {
			ship_schd_dt_p(
				((MCContainerMeta) ship_schd_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($dlv_rqst_dt_p.equalsIgnoreCase(name)) {
			dlv_rqst_dt_p(
				((MCContainerMeta) dlv_rqst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_inst_dt_p.equalsIgnoreCase(name)) {
			ship_inst_dt_p(
				((MCContainerMeta) ship_inst_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
			);
			return;
		}
		if ($ship_dt_p.equalsIgnoreCase(name)) {
			ship_dt_p(
				((MCContainerMeta) ship_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0400.YmdHmFrToR.class, value)
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
		if ($ship_rqst_id_grp_p.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_p(
				((MCContainerMeta) ship_rqst_id_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
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
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_dt_fr() {
		return ship_inst_dt_p().ymd_fr();
	}

	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_dt_fr(MCDate value) {
		ship_inst_dt_p().ymd_fr(value);
	}

	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_hm_fr() {
		return ship_inst_dt_p().hm_fr();
	}

	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_hm_fr(MCDate value) {
		ship_inst_dt_p().hm_fr(value);
	}

	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_dt_to() {
		return ship_inst_dt_p().ymd_to();
	}

	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public void ship_inst_dt_to(MCDate value) {
		ship_inst_dt_p().ymd_to(value);
	}

	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_hm_to() {
		return ship_inst_dt_p().hm_to();
	}

	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public void ship_inst_hm_to(MCDate value) {
		ship_inst_dt_p().hm_to(value);
	}

	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_dt_fr() {
		return ship_dt_p().ymd_fr();
	}

	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_dt_fr(MCDate value) {
		ship_dt_p().ymd_fr(value);
	}

	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_hm_fr() {
		return ship_dt_p().hm_fr();
	}

	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_hm_fr(MCDate value) {
		ship_dt_p().hm_fr(value);
	}

	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public MCDate ship_dt_to() {
		return ship_dt_p().ymd_to();
	}

	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public void ship_dt_to(MCDate value) {
		ship_dt_p().ymd_to(value);
	}

	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_hm_to() {
		return ship_dt_p().hm_to();
	}

	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public void ship_hm_to(MCDate value) {
		ship_dt_p().hm_to(value);
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

	/**
	 * Shipping requested classification flg.1 出荷依頼先分類ＦＬＧ１.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg1() {
		return ship_rqst_id_grp_p().bp_grp_flg1();
	}

	/**
	 * Shipping requested classification flg.1 出荷依頼先分類ＦＬＧ１.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg1(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd1() {
		return ship_rqst_id_grp_p().bp_grp_cd1();
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd1(String value) {
		ship_rqst_id_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm1() {
		return ship_rqst_id_grp_p().bp_grp_nm1();
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm1(String value) {
		ship_rqst_id_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Shipping requested classification flg.2 出荷依頼先分類ＦＬＧ２.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg2() {
		return ship_rqst_id_grp_p().bp_grp_flg2();
	}

	/**
	 * Shipping requested classification flg.2 出荷依頼先分類ＦＬＧ２.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg2(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd2() {
		return ship_rqst_id_grp_p().bp_grp_cd2();
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd2(String value) {
		ship_rqst_id_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm2() {
		return ship_rqst_id_grp_p().bp_grp_nm2();
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm2(String value) {
		ship_rqst_id_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Shipping requested classification flg.3 出荷依頼先分類ＦＬＧ３.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg3() {
		return ship_rqst_id_grp_p().bp_grp_flg3();
	}

	/**
	 * Shipping requested classification flg.3 出荷依頼先分類ＦＬＧ３.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg3(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd3() {
		return ship_rqst_id_grp_p().bp_grp_cd3();
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd3(String value) {
		ship_rqst_id_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm3() {
		return ship_rqst_id_grp_p().bp_grp_nm3();
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm3(String value) {
		ship_rqst_id_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Shipping requested classification flg.4 出荷依頼先分類ＦＬＧ４.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg4() {
		return ship_rqst_id_grp_p().bp_grp_flg4();
	}

	/**
	 * Shipping requested classification flg.4 出荷依頼先分類ＦＬＧ４.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg4(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd4() {
		return ship_rqst_id_grp_p().bp_grp_cd4();
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd4(String value) {
		ship_rqst_id_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm4() {
		return ship_rqst_id_grp_p().bp_grp_nm4();
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm4(String value) {
		ship_rqst_id_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Shipping requested classification flg.5 出荷依頼先分類ＦＬＧ５.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg5() {
		return ship_rqst_id_grp_p().bp_grp_flg5();
	}

	/**
	 * Shipping requested classification flg.5 出荷依頼先分類ＦＬＧ５.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg5(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd5() {
		return ship_rqst_id_grp_p().bp_grp_cd5();
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd5(String value) {
		ship_rqst_id_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm5() {
		return ship_rqst_id_grp_p().bp_grp_nm5();
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm5(String value) {
		ship_rqst_id_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Shipping requested classification flg.6 出荷依頼先分類ＦＬＧ６.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg6() {
		return ship_rqst_id_grp_p().bp_grp_flg6();
	}

	/**
	 * Shipping requested classification flg.6 出荷依頼先分類ＦＬＧ６.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg6(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd6() {
		return ship_rqst_id_grp_p().bp_grp_cd6();
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd6(String value) {
		ship_rqst_id_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm6() {
		return ship_rqst_id_grp_p().bp_grp_nm6();
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm6(String value) {
		ship_rqst_id_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Shipping requested classification flg.7 出荷依頼先分類ＦＬＧ７.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg7() {
		return ship_rqst_id_grp_p().bp_grp_flg7();
	}

	/**
	 * Shipping requested classification flg.7 出荷依頼先分類ＦＬＧ７.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg7(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd7() {
		return ship_rqst_id_grp_p().bp_grp_cd7();
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd7(String value) {
		ship_rqst_id_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm7() {
		return ship_rqst_id_grp_p().bp_grp_nm7();
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm7(String value) {
		ship_rqst_id_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Shipping requested classification flg.8 出荷依頼先分類ＦＬＧ８.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg8() {
		return ship_rqst_id_grp_p().bp_grp_flg8();
	}

	/**
	 * Shipping requested classification flg.8 出荷依頼先分類ＦＬＧ８.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg8(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd8() {
		return ship_rqst_id_grp_p().bp_grp_cd8();
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd8(String value) {
		ship_rqst_id_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm8() {
		return ship_rqst_id_grp_p().bp_grp_nm8();
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm8(String value) {
		ship_rqst_id_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Shipping requested classification flg.9 出荷依頼先分類ＦＬＧ９.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg9() {
		return ship_rqst_id_grp_p().bp_grp_flg9();
	}

	/**
	 * Shipping requested classification flg.9 出荷依頼先分類ＦＬＧ９.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg9(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd9() {
		return ship_rqst_id_grp_p().bp_grp_cd9();
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd9(String value) {
		ship_rqst_id_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm9() {
		return ship_rqst_id_grp_p().bp_grp_nm9();
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm9(String value) {
		ship_rqst_id_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Shipping requested classification flg.10 出荷依頼先分類ＦＬＧ１０.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg10() {
		return ship_rqst_id_grp_p().bp_grp_flg10();
	}

	/**
	 * Shipping requested classification flg.10 出荷依頼先分類ＦＬＧ１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg10(boolean value) {
		ship_rqst_id_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd10() {
		return ship_rqst_id_grp_p().bp_grp_cd10();
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd10(String value) {
		ship_rqst_id_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm10() {
		return ship_rqst_id_grp_p().bp_grp_nm10();
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm10(String value) {
		ship_rqst_id_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Delivery destination classification flg. 1 納品先分類ＦＬＧ１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return dlv_grp_p().bp_grp_flg1();
	}

	/**
	 * Delivery destination classification flg. 1 納品先分類ＦＬＧ１.<p>
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
	 * Delivery destination classification flg. 2 納品先分類ＦＬＧ２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return dlv_grp_p().bp_grp_flg2();
	}

	/**
	 * Delivery destination classification flg. 2 納品先分類ＦＬＧ２.<p>
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
	 * Delivery destination classification flg. 3 納品先分類ＦＬＧ３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return dlv_grp_p().bp_grp_flg3();
	}

	/**
	 * Delivery destination classification flg. 3 納品先分類ＦＬＧ３.<p>
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
	 * Delivery destination classification flg. 4 納品先分類ＦＬＧ４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return dlv_grp_p().bp_grp_flg4();
	}

	/**
	 * Delivery destination classification flg. 4 納品先分類ＦＬＧ４.<p>
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
	 * Delivery destination classification flg. 5 納品先分類ＦＬＧ５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return dlv_grp_p().bp_grp_flg5();
	}

	/**
	 * Delivery destination classification flg. 5 納品先分類ＦＬＧ５.<p>
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
	 * Delivery destination classification flg. 6 納品先分類ＦＬＧ６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return dlv_grp_p().bp_grp_flg6();
	}

	/**
	 * Delivery destination classification flg. 6 納品先分類ＦＬＧ６.<p>
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
	 * Delivery destination classification flg. 7 納品先分類ＦＬＧ７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return dlv_grp_p().bp_grp_flg7();
	}

	/**
	 * Delivery destination classification flg. 7 納品先分類ＦＬＧ７.<p>
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
	 * Delivery destination classification flg. 8 納品先分類ＦＬＧ８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return dlv_grp_p().bp_grp_flg8();
	}

	/**
	 * Delivery destination classification flg. 8 納品先分類ＦＬＧ８.<p>
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
	 * Delivery destination classification flg. 9 納品先分類ＦＬＧ９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return dlv_grp_p().bp_grp_flg9();
	}

	/**
	 * Delivery destination classification flg. 9 納品先分類ＦＬＧ９.<p>
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
	 * Delivery destination classification flg. 10 納品先分類ＦＬＧ１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return dlv_grp_p().bp_grp_flg10();
	}

	/**
	 * Delivery destination classification flg. 10 納品先分類ＦＬＧ１０.<p>
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

