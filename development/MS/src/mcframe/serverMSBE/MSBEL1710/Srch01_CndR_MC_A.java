package mcframe.serverMSBE.MSBEL1710;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $srch_mode = "srch_mode";
	/**
	 * Unordered (Progress status type) 未指図（進捗状況区分）.<p>
	 *
	 */
	public static final String $not_inst_flg = "not_inst_flg";
	/**
	 * Ordered (Progress status) 指図済（進捗状況）.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Not shipped (Shipping progress status) 未出荷（出荷進捗状況）.<p>
	 *
	 */
	public static final String $not_ship_flg = "not_ship_flg";
	/**
	 * Partial shipment (Shipping progress status) 一部出荷（出荷進捗状況）.<p>
	 *
	 */
	public static final String $part_ship_flg = "part_ship_flg";
	/**
	 * Shipped (Shipping progress status) 出荷済（出荷進捗状況）.<p>
	 *
	 */
	public static final String $ship_flg = "ship_flg";
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
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
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
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
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
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_schd_dt_fr = "ship_schd_dt_fr";
	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_schd_hm_fr = "ship_schd_hm_fr";
	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public static final String $ship_schd_dt_to = "ship_schd_dt_to";
	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $ship_schd_hm_to = "ship_schd_hm_to";
	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_inst_dt_fr = "ship_inst_dt_fr";
	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_inst_hm_fr = "ship_inst_hm_fr";
	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public static final String $ship_inst_dt_to = "ship_inst_dt_to";
	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public static final String $ship_inst_hm_to = "ship_inst_hm_to";
	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_dt_fr = "ship_dt_fr";
	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_hm_fr = "ship_hm_fr";
	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public static final String $ship_dt_to = "ship_dt_to";
	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public static final String $ship_hm_to = "ship_hm_to";
	/**
	 * Delivery date FROM 納品日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_dt_fr = "dlv_dt_fr";
	/**
	 * Delivery time FROM 納品時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_hm_fr = "dlv_hm_fr";
	/**
	 * Delivery date TO 納品日ＴＯ.<p>
	 *
	 */
	public static final String $dlv_dt_to = "dlv_dt_to";
	/**
	 * Delivery time TO 納品時刻ＴＯ.<p>
	 *
	 */
	public static final String $dlv_hm_to = "dlv_hm_to";
	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_fr = "dlv_rqst_dt_fr";
	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dlv_rqst_hm_fr = "dlv_rqst_hm_fr";
	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_to = "dlv_rqst_dt_to";
	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public static final String $dlv_rqst_hm_to = "dlv_rqst_hm_to";
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
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg1 = "ship_rqst_id_grp_flg1";
	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd1 = "ship_rqst_id_grp_cd1";
	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm1 = "ship_rqst_id_grp_nm1";
	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg2 = "ship_rqst_id_grp_flg2";
	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd2 = "ship_rqst_id_grp_cd2";
	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm2 = "ship_rqst_id_grp_nm2";
	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg3 = "ship_rqst_id_grp_flg3";
	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd3 = "ship_rqst_id_grp_cd3";
	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm3 = "ship_rqst_id_grp_nm3";
	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg4 = "ship_rqst_id_grp_flg4";
	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd4 = "ship_rqst_id_grp_cd4";
	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm4 = "ship_rqst_id_grp_nm4";
	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg5 = "ship_rqst_id_grp_flg5";
	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd5 = "ship_rqst_id_grp_cd5";
	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm5 = "ship_rqst_id_grp_nm5";
	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg6 = "ship_rqst_id_grp_flg6";
	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd6 = "ship_rqst_id_grp_cd6";
	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm6 = "ship_rqst_id_grp_nm6";
	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg7 = "ship_rqst_id_grp_flg7";
	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd7 = "ship_rqst_id_grp_cd7";
	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm7 = "ship_rqst_id_grp_nm7";
	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg8 = "ship_rqst_id_grp_flg8";
	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd8 = "ship_rqst_id_grp_cd8";
	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm8 = "ship_rqst_id_grp_nm8";
	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg9 = "ship_rqst_id_grp_flg9";
	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd9 = "ship_rqst_id_grp_cd9";
	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm9 = "ship_rqst_id_grp_nm9";
	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_flg10 = "ship_rqst_id_grp_flg10";
	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_cd10 = "ship_rqst_id_grp_cd10";
	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public static final String $ship_rqst_id_grp_nm10 = "ship_rqst_id_grp_nm10";
	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public static final String $dlv_grp_flg1 = "dlv_grp_flg1";
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public static final String $dlv_grp_cd1 = "dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public static final String $dlv_grp_nm1 = "dlv_grp_nm1";
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public static final String $dlv_grp_flg2 = "dlv_grp_flg2";
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public static final String $dlv_grp_cd2 = "dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public static final String $dlv_grp_nm2 = "dlv_grp_nm2";
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public static final String $dlv_grp_flg3 = "dlv_grp_flg3";
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public static final String $dlv_grp_cd3 = "dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public static final String $dlv_grp_nm3 = "dlv_grp_nm3";
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public static final String $dlv_grp_flg4 = "dlv_grp_flg4";
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public static final String $dlv_grp_cd4 = "dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public static final String $dlv_grp_nm4 = "dlv_grp_nm4";
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public static final String $dlv_grp_flg5 = "dlv_grp_flg5";
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public static final String $dlv_grp_cd5 = "dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public static final String $dlv_grp_nm5 = "dlv_grp_nm5";
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public static final String $dlv_grp_flg6 = "dlv_grp_flg6";
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public static final String $dlv_grp_cd6 = "dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public static final String $dlv_grp_nm6 = "dlv_grp_nm6";
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public static final String $dlv_grp_flg7 = "dlv_grp_flg7";
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public static final String $dlv_grp_cd7 = "dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public static final String $dlv_grp_nm7 = "dlv_grp_nm7";
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public static final String $dlv_grp_flg8 = "dlv_grp_flg8";
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public static final String $dlv_grp_cd8 = "dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public static final String $dlv_grp_nm8 = "dlv_grp_nm8";
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public static final String $dlv_grp_flg9 = "dlv_grp_flg9";
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public static final String $dlv_grp_cd9 = "dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public static final String $dlv_grp_nm9 = "dlv_grp_nm9";
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public static final String $dlv_grp_flg10 = "dlv_grp_flg10";
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $dlv_grp_cd10 = "dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public static final String $dlv_grp_nm10 = "dlv_grp_nm10";
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


	public static final MCMeta srch_mode_META = createStringMeta($srch_mode);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ship_flg_META = createCommonMeta($not_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_ship_flg_META = createCommonMeta($part_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_flg_META = createCommonMeta($ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
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
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ship_schd_dt_fr_META = createCommonMeta($ship_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_fr_META = createCommonMeta($ship_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_schd_dt_to_META = createCommonMeta($ship_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_to_META = createCommonMeta($ship_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_inst_dt_fr_META = createCommonMeta($ship_inst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_hm_fr_META = createCommonMeta($ship_inst_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_inst_dt_to_META = createCommonMeta($ship_inst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_inst_hm_to_META = createCommonMeta($ship_inst_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_dt_fr_META = createCommonMeta($ship_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_hm_fr_META = createCommonMeta($ship_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_dt_to_META = createCommonMeta($ship_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_hm_to_META = createCommonMeta($ship_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_dt_fr_META = createCommonMeta($dlv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_hm_fr_META = createCommonMeta($dlv_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_dt_to_META = createCommonMeta($dlv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_hm_to_META = createCommonMeta($dlv_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_rqst_dt_fr_META = createCommonMeta($dlv_rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_fr_META = createCommonMeta($dlv_rqst_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_rqst_dt_to_META = createCommonMeta($dlv_rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_to_META = createCommonMeta($dlv_rqst_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta etd_dt_fr_META = createCommonMeta($etd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta etd_dt_to_META = createCommonMeta($etd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta eta_dt_fr_META = createCommonMeta($eta_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta eta_dt_to_META = createCommonMeta($eta_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_schd_dt_fr_META = createCommonMeta($via_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_schd_dt_to_META = createCommonMeta($via_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_id_grp_flg1_META = createCommonMeta($ship_rqst_id_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd1_META = createCommonMeta($ship_rqst_id_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm1_META = createCommonMeta($ship_rqst_id_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg2_META = createCommonMeta($ship_rqst_id_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd2_META = createCommonMeta($ship_rqst_id_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm2_META = createCommonMeta($ship_rqst_id_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg3_META = createCommonMeta($ship_rqst_id_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd3_META = createCommonMeta($ship_rqst_id_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm3_META = createCommonMeta($ship_rqst_id_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg4_META = createCommonMeta($ship_rqst_id_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd4_META = createCommonMeta($ship_rqst_id_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm4_META = createCommonMeta($ship_rqst_id_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg5_META = createCommonMeta($ship_rqst_id_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd5_META = createCommonMeta($ship_rqst_id_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm5_META = createCommonMeta($ship_rqst_id_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg6_META = createCommonMeta($ship_rqst_id_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd6_META = createCommonMeta($ship_rqst_id_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm6_META = createCommonMeta($ship_rqst_id_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg7_META = createCommonMeta($ship_rqst_id_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd7_META = createCommonMeta($ship_rqst_id_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm7_META = createCommonMeta($ship_rqst_id_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg8_META = createCommonMeta($ship_rqst_id_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd8_META = createCommonMeta($ship_rqst_id_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm8_META = createCommonMeta($ship_rqst_id_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg9_META = createCommonMeta($ship_rqst_id_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd9_META = createCommonMeta($ship_rqst_id_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm9_META = createCommonMeta($ship_rqst_id_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_flg10_META = createCommonMeta($ship_rqst_id_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_id_grp_cd10_META = createCommonMeta($ship_rqst_id_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm10_META = createCommonMeta($ship_rqst_id_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg1_META = createCommonMeta($dlv_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd1_META = createCommonMeta($dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm1_META = createCommonMeta($dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg2_META = createCommonMeta($dlv_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd2_META = createCommonMeta($dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm2_META = createCommonMeta($dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg3_META = createCommonMeta($dlv_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd3_META = createCommonMeta($dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm3_META = createCommonMeta($dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg4_META = createCommonMeta($dlv_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd4_META = createCommonMeta($dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm4_META = createCommonMeta($dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg5_META = createCommonMeta($dlv_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd5_META = createCommonMeta($dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm5_META = createCommonMeta($dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg6_META = createCommonMeta($dlv_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd6_META = createCommonMeta($dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm6_META = createCommonMeta($dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg7_META = createCommonMeta($dlv_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd7_META = createCommonMeta($dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm7_META = createCommonMeta($dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg8_META = createCommonMeta($dlv_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd8_META = createCommonMeta($dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm8_META = createCommonMeta($dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg9_META = createCommonMeta($dlv_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd9_META = createCommonMeta($dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm9_META = createCommonMeta($dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg10_META = createCommonMeta($dlv_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd10_META = createCommonMeta($dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm10_META = createCommonMeta($dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			srch_mode_META,
			not_inst_flg_META,
			inst_flg_META,
			not_ship_flg_META,
			part_ship_flg_META,
			ship_flg_META,
			tdlv_cd_META,
			tdlv_nm_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
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
			dlv_id_typ_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			ship_schd_dt_fr_META,
			ship_schd_hm_fr_META,
			ship_schd_dt_to_META,
			ship_schd_hm_to_META,
			ship_inst_dt_fr_META,
			ship_inst_hm_fr_META,
			ship_inst_dt_to_META,
			ship_inst_hm_to_META,
			ship_dt_fr_META,
			ship_hm_fr_META,
			ship_dt_to_META,
			ship_hm_to_META,
			dlv_dt_fr_META,
			dlv_hm_fr_META,
			dlv_dt_to_META,
			dlv_hm_to_META,
			dlv_rqst_dt_fr_META,
			dlv_rqst_hm_fr_META,
			dlv_rqst_dt_to_META,
			dlv_rqst_hm_to_META,
			etd_dt_fr_META,
			etd_dt_to_META,
			eta_dt_fr_META,
			eta_dt_to_META,
			via_schd_dt_fr_META,
			via_schd_dt_to_META,
			ship_rqst_id_grp_flg1_META,
			ship_rqst_id_grp_cd1_META,
			ship_rqst_id_grp_nm1_META,
			ship_rqst_id_grp_flg2_META,
			ship_rqst_id_grp_cd2_META,
			ship_rqst_id_grp_nm2_META,
			ship_rqst_id_grp_flg3_META,
			ship_rqst_id_grp_cd3_META,
			ship_rqst_id_grp_nm3_META,
			ship_rqst_id_grp_flg4_META,
			ship_rqst_id_grp_cd4_META,
			ship_rqst_id_grp_nm4_META,
			ship_rqst_id_grp_flg5_META,
			ship_rqst_id_grp_cd5_META,
			ship_rqst_id_grp_nm5_META,
			ship_rqst_id_grp_flg6_META,
			ship_rqst_id_grp_cd6_META,
			ship_rqst_id_grp_nm6_META,
			ship_rqst_id_grp_flg7_META,
			ship_rqst_id_grp_cd7_META,
			ship_rqst_id_grp_nm7_META,
			ship_rqst_id_grp_flg8_META,
			ship_rqst_id_grp_cd8_META,
			ship_rqst_id_grp_nm8_META,
			ship_rqst_id_grp_flg9_META,
			ship_rqst_id_grp_cd9_META,
			ship_rqst_id_grp_nm9_META,
			ship_rqst_id_grp_flg10_META,
			ship_rqst_id_grp_cd10_META,
			ship_rqst_id_grp_nm10_META,
			dlv_grp_flg1_META,
			dlv_grp_cd1_META,
			dlv_grp_nm1_META,
			dlv_grp_flg2_META,
			dlv_grp_cd2_META,
			dlv_grp_nm2_META,
			dlv_grp_flg3_META,
			dlv_grp_cd3_META,
			dlv_grp_nm3_META,
			dlv_grp_flg4_META,
			dlv_grp_cd4_META,
			dlv_grp_nm4_META,
			dlv_grp_flg5_META,
			dlv_grp_cd5_META,
			dlv_grp_nm5_META,
			dlv_grp_flg6_META,
			dlv_grp_cd6_META,
			dlv_grp_nm6_META,
			dlv_grp_flg7_META,
			dlv_grp_cd7_META,
			dlv_grp_nm7_META,
			dlv_grp_flg8_META,
			dlv_grp_cd8_META,
			dlv_grp_nm8_META,
			dlv_grp_flg9_META,
			dlv_grp_cd9_META,
			dlv_grp_nm9_META,
			dlv_grp_flg10_META,
			dlv_grp_cd10_META,
			dlv_grp_nm10_META,
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
	/** 項目属性情報のグループ[SIM_CND_GRP]のキー定数 */
	public static final String $$SIM_CND_GRP = "SIM_CND_GRP";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SIM_CND_GRP, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public String srch_mode() {
		return getConstString(offset + 0, $srch_mode);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void srch_mode(String value) {
		setConstString(offset + 0, $srch_mode, value);
	}


	/**
	 * Unordered (Progress status type) 未指図（進捗状況区分）.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 1, $not_inst_flg);
	}

	/**
	 * Unordered (Progress status type) 未指図（進捗状況区分）.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 1, $not_inst_flg, value);
	}


	/**
	 * Ordered (Progress status) 指図済（進捗状況）.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 2, $inst_flg);
	}

	/**
	 * Ordered (Progress status) 指図済（進捗状況）.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 2, $inst_flg, value);
	}


	/**
	 * Not shipped (Shipping progress status) 未出荷（出荷進捗状況）.<p>
	 *
	 */
	public boolean not_ship_flg() {
		return getConstBoolean(offset + 3, $not_ship_flg);
	}

	/**
	 * Not shipped (Shipping progress status) 未出荷（出荷進捗状況）.<p>
	 *
	 */
	public void not_ship_flg(boolean value) {
		setConstBoolean(offset + 3, $not_ship_flg, value);
	}


	/**
	 * Partial shipment (Shipping progress status) 一部出荷（出荷進捗状況）.<p>
	 *
	 */
	public boolean part_ship_flg() {
		return getConstBoolean(offset + 4, $part_ship_flg);
	}

	/**
	 * Partial shipment (Shipping progress status) 一部出荷（出荷進捗状況）.<p>
	 *
	 */
	public void part_ship_flg(boolean value) {
		setConstBoolean(offset + 4, $part_ship_flg, value);
	}


	/**
	 * Shipped (Shipping progress status) 出荷済（出荷進捗状況）.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 5, $ship_flg);
	}

	/**
	 * Shipped (Shipping progress status) 出荷済（出荷進捗状況）.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 5, $ship_flg, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 6, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 6, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 7, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 7, $tdlv_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 8, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 8, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 9, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 9, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 11, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 11, $trd_nm, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 12, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 12, $ship_schd_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 13, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 13, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 14, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 14, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 15, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 15, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 16, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 16, $cst_po_d_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 17, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 17, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 18, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 18, $ship_inst_d_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 19, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 19, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 20, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 20, $ship_act_d_no, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 21, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 21, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 22, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 22, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 23, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 23, $dlv_id_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 24, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 24, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 25, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 25, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 26, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 26, $ship_rqst_id_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 27, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 27, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 28, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 28, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 29, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 29, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 30, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 30, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 31, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 31, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 32, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 32, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 33, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 33, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 34, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 34, $itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 35, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 35, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 36, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 36, $cst_itm_nm, value);
	}


	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_dt_fr() {
		return getConstDate(offset + 37, $ship_schd_dt_fr);
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_dt_fr(MCDate value) {
		setConstDate(offset + 37, $ship_schd_dt_fr, value);
	}


	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_hm_fr() {
		return getConstDate(offset + 38, $ship_schd_hm_fr);
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_hm_fr(MCDate value) {
		setConstDate(offset + 38, $ship_schd_hm_fr, value);
	}


	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_dt_to() {
		return getConstDate(offset + 39, $ship_schd_dt_to);
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public void ship_schd_dt_to(MCDate value) {
		setConstDate(offset + 39, $ship_schd_dt_to, value);
	}


	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_hm_to() {
		return getConstDate(offset + 40, $ship_schd_hm_to);
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public void ship_schd_hm_to(MCDate value) {
		setConstDate(offset + 40, $ship_schd_hm_to, value);
	}


	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_dt_fr() {
		return getConstDate(offset + 41, $ship_inst_dt_fr);
	}

	/**
	 * Shipping order date FROM 出荷指図日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_dt_fr(MCDate value) {
		setConstDate(offset + 41, $ship_inst_dt_fr, value);
	}


	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_inst_hm_fr() {
		return getConstDate(offset + 42, $ship_inst_hm_fr);
	}

	/**
	 * Shipping order time FROM 出荷指図時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_inst_hm_fr(MCDate value) {
		setConstDate(offset + 42, $ship_inst_hm_fr, value);
	}


	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_dt_to() {
		return getConstDate(offset + 43, $ship_inst_dt_to);
	}

	/**
	 * Shipping order date TO 出荷指図日ＴＯ.<p>
	 *
	 */
	public void ship_inst_dt_to(MCDate value) {
		setConstDate(offset + 43, $ship_inst_dt_to, value);
	}


	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_inst_hm_to() {
		return getConstDate(offset + 44, $ship_inst_hm_to);
	}

	/**
	 * Shipping order time TO 出荷指図時刻ＴＯ.<p>
	 *
	 */
	public void ship_inst_hm_to(MCDate value) {
		setConstDate(offset + 44, $ship_inst_hm_to, value);
	}


	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_dt_fr() {
		return getConstDate(offset + 45, $ship_dt_fr);
	}

	/**
	 * Shipping date FROM 出荷日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_dt_fr(MCDate value) {
		setConstDate(offset + 45, $ship_dt_fr, value);
	}


	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_hm_fr() {
		return getConstDate(offset + 46, $ship_hm_fr);
	}

	/**
	 * Shipping time FROM 出荷時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_hm_fr(MCDate value) {
		setConstDate(offset + 46, $ship_hm_fr, value);
	}


	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public MCDate ship_dt_to() {
		return getConstDate(offset + 47, $ship_dt_to);
	}

	/**
	 * Shipping date TO 出荷日ＴＯ.<p>
	 *
	 */
	public void ship_dt_to(MCDate value) {
		setConstDate(offset + 47, $ship_dt_to, value);
	}


	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_hm_to() {
		return getConstDate(offset + 48, $ship_hm_to);
	}

	/**
	 * Shipping time TO 出荷時刻ＴＯ.<p>
	 *
	 */
	public void ship_hm_to(MCDate value) {
		setConstDate(offset + 48, $ship_hm_to, value);
	}


	/**
	 * Delivery date FROM 納品日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_dt_fr() {
		return getConstDate(offset + 49, $dlv_dt_fr);
	}

	/**
	 * Delivery date FROM 納品日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_dt_fr(MCDate value) {
		setConstDate(offset + 49, $dlv_dt_fr, value);
	}


	/**
	 * Delivery time FROM 納品時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_hm_fr() {
		return getConstDate(offset + 50, $dlv_hm_fr);
	}

	/**
	 * Delivery time FROM 納品時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_hm_fr(MCDate value) {
		setConstDate(offset + 50, $dlv_hm_fr, value);
	}


	/**
	 * Delivery date TO 納品日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_dt_to() {
		return getConstDate(offset + 51, $dlv_dt_to);
	}

	/**
	 * Delivery date TO 納品日ＴＯ.<p>
	 *
	 */
	public void dlv_dt_to(MCDate value) {
		setConstDate(offset + 51, $dlv_dt_to, value);
	}


	/**
	 * Delivery time TO 納品時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_hm_to() {
		return getConstDate(offset + 52, $dlv_hm_to);
	}

	/**
	 * Delivery time TO 納品時刻ＴＯ.<p>
	 *
	 */
	public void dlv_hm_to(MCDate value) {
		setConstDate(offset + 52, $dlv_hm_to, value);
	}


	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return getConstDate(offset + 53, $dlv_rqst_dt_fr);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		setConstDate(offset + 53, $dlv_rqst_dt_fr, value);
	}


	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return getConstDate(offset + 54, $dlv_rqst_hm_fr);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		setConstDate(offset + 54, $dlv_rqst_hm_fr, value);
	}


	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return getConstDate(offset + 55, $dlv_rqst_dt_to);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		setConstDate(offset + 55, $dlv_rqst_dt_to, value);
	}


	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return getConstDate(offset + 56, $dlv_rqst_hm_to);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		setConstDate(offset + 56, $dlv_rqst_hm_to, value);
	}


	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate etd_dt_fr() {
		return getConstDate(offset + 57, $etd_dt_fr);
	}

	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public void etd_dt_fr(MCDate value) {
		setConstDate(offset + 57, $etd_dt_fr, value);
	}


	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public MCDate etd_dt_to() {
		return getConstDate(offset + 58, $etd_dt_to);
	}

	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public void etd_dt_to(MCDate value) {
		setConstDate(offset + 58, $etd_dt_to, value);
	}


	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate eta_dt_fr() {
		return getConstDate(offset + 59, $eta_dt_fr);
	}

	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public void eta_dt_fr(MCDate value) {
		setConstDate(offset + 59, $eta_dt_fr, value);
	}


	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public MCDate eta_dt_to() {
		return getConstDate(offset + 60, $eta_dt_to);
	}

	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public void eta_dt_to(MCDate value) {
		setConstDate(offset + 60, $eta_dt_to, value);
	}


	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate via_schd_dt_fr() {
		return getConstDate(offset + 61, $via_schd_dt_fr);
	}

	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public void via_schd_dt_fr(MCDate value) {
		setConstDate(offset + 61, $via_schd_dt_fr, value);
	}


	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public MCDate via_schd_dt_to() {
		return getConstDate(offset + 62, $via_schd_dt_to);
	}

	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public void via_schd_dt_to(MCDate value) {
		setConstDate(offset + 62, $via_schd_dt_to, value);
	}


	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg1() {
		return getConstBoolean(offset + 63, $ship_rqst_id_grp_flg1);
	}

	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg1(boolean value) {
		setConstBoolean(offset + 63, $ship_rqst_id_grp_flg1, value);
	}


	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd1() {
		return getConstString(offset + 64, $ship_rqst_id_grp_cd1);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd1(String value) {
		setConstString(offset + 64, $ship_rqst_id_grp_cd1, value);
	}


	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm1() {
		return getConstString(offset + 65, $ship_rqst_id_grp_nm1);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm1(String value) {
		setConstString(offset + 65, $ship_rqst_id_grp_nm1, value);
	}


	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg2() {
		return getConstBoolean(offset + 66, $ship_rqst_id_grp_flg2);
	}

	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg2(boolean value) {
		setConstBoolean(offset + 66, $ship_rqst_id_grp_flg2, value);
	}


	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd2() {
		return getConstString(offset + 67, $ship_rqst_id_grp_cd2);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd2(String value) {
		setConstString(offset + 67, $ship_rqst_id_grp_cd2, value);
	}


	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm2() {
		return getConstString(offset + 68, $ship_rqst_id_grp_nm2);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm2(String value) {
		setConstString(offset + 68, $ship_rqst_id_grp_nm2, value);
	}


	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg3() {
		return getConstBoolean(offset + 69, $ship_rqst_id_grp_flg3);
	}

	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg3(boolean value) {
		setConstBoolean(offset + 69, $ship_rqst_id_grp_flg3, value);
	}


	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd3() {
		return getConstString(offset + 70, $ship_rqst_id_grp_cd3);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd3(String value) {
		setConstString(offset + 70, $ship_rqst_id_grp_cd3, value);
	}


	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm3() {
		return getConstString(offset + 71, $ship_rqst_id_grp_nm3);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm3(String value) {
		setConstString(offset + 71, $ship_rqst_id_grp_nm3, value);
	}


	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg4() {
		return getConstBoolean(offset + 72, $ship_rqst_id_grp_flg4);
	}

	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg4(boolean value) {
		setConstBoolean(offset + 72, $ship_rqst_id_grp_flg4, value);
	}


	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd4() {
		return getConstString(offset + 73, $ship_rqst_id_grp_cd4);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd4(String value) {
		setConstString(offset + 73, $ship_rqst_id_grp_cd4, value);
	}


	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm4() {
		return getConstString(offset + 74, $ship_rqst_id_grp_nm4);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm4(String value) {
		setConstString(offset + 74, $ship_rqst_id_grp_nm4, value);
	}


	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg5() {
		return getConstBoolean(offset + 75, $ship_rqst_id_grp_flg5);
	}

	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg5(boolean value) {
		setConstBoolean(offset + 75, $ship_rqst_id_grp_flg5, value);
	}


	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd5() {
		return getConstString(offset + 76, $ship_rqst_id_grp_cd5);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd5(String value) {
		setConstString(offset + 76, $ship_rqst_id_grp_cd5, value);
	}


	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm5() {
		return getConstString(offset + 77, $ship_rqst_id_grp_nm5);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm5(String value) {
		setConstString(offset + 77, $ship_rqst_id_grp_nm5, value);
	}


	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg6() {
		return getConstBoolean(offset + 78, $ship_rqst_id_grp_flg6);
	}

	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg6(boolean value) {
		setConstBoolean(offset + 78, $ship_rqst_id_grp_flg6, value);
	}


	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd6() {
		return getConstString(offset + 79, $ship_rqst_id_grp_cd6);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd6(String value) {
		setConstString(offset + 79, $ship_rqst_id_grp_cd6, value);
	}


	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm6() {
		return getConstString(offset + 80, $ship_rqst_id_grp_nm6);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm6(String value) {
		setConstString(offset + 80, $ship_rqst_id_grp_nm6, value);
	}


	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg7() {
		return getConstBoolean(offset + 81, $ship_rqst_id_grp_flg7);
	}

	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg7(boolean value) {
		setConstBoolean(offset + 81, $ship_rqst_id_grp_flg7, value);
	}


	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd7() {
		return getConstString(offset + 82, $ship_rqst_id_grp_cd7);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd7(String value) {
		setConstString(offset + 82, $ship_rqst_id_grp_cd7, value);
	}


	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm7() {
		return getConstString(offset + 83, $ship_rqst_id_grp_nm7);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm7(String value) {
		setConstString(offset + 83, $ship_rqst_id_grp_nm7, value);
	}


	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg8() {
		return getConstBoolean(offset + 84, $ship_rqst_id_grp_flg8);
	}

	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg8(boolean value) {
		setConstBoolean(offset + 84, $ship_rqst_id_grp_flg8, value);
	}


	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd8() {
		return getConstString(offset + 85, $ship_rqst_id_grp_cd8);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd8(String value) {
		setConstString(offset + 85, $ship_rqst_id_grp_cd8, value);
	}


	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm8() {
		return getConstString(offset + 86, $ship_rqst_id_grp_nm8);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm8(String value) {
		setConstString(offset + 86, $ship_rqst_id_grp_nm8, value);
	}


	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg9() {
		return getConstBoolean(offset + 87, $ship_rqst_id_grp_flg9);
	}

	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg9(boolean value) {
		setConstBoolean(offset + 87, $ship_rqst_id_grp_flg9, value);
	}


	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd9() {
		return getConstString(offset + 88, $ship_rqst_id_grp_cd9);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd9(String value) {
		setConstString(offset + 88, $ship_rqst_id_grp_cd9, value);
	}


	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm9() {
		return getConstString(offset + 89, $ship_rqst_id_grp_nm9);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm9(String value) {
		setConstString(offset + 89, $ship_rqst_id_grp_nm9, value);
	}


	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg10() {
		return getConstBoolean(offset + 90, $ship_rqst_id_grp_flg10);
	}

	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg10(boolean value) {
		setConstBoolean(offset + 90, $ship_rqst_id_grp_flg10, value);
	}


	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd10() {
		return getConstString(offset + 91, $ship_rqst_id_grp_cd10);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd10(String value) {
		setConstString(offset + 91, $ship_rqst_id_grp_cd10, value);
	}


	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm10() {
		return getConstString(offset + 92, $ship_rqst_id_grp_nm10);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm10(String value) {
		setConstString(offset + 92, $ship_rqst_id_grp_nm10, value);
	}


	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return getConstBoolean(offset + 93, $dlv_grp_flg1);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		setConstBoolean(offset + 93, $dlv_grp_flg1, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 94, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 94, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 95, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 95, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return getConstBoolean(offset + 96, $dlv_grp_flg2);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		setConstBoolean(offset + 96, $dlv_grp_flg2, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 97, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 97, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 98, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 98, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return getConstBoolean(offset + 99, $dlv_grp_flg3);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		setConstBoolean(offset + 99, $dlv_grp_flg3, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 100, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 100, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 101, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 101, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return getConstBoolean(offset + 102, $dlv_grp_flg4);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		setConstBoolean(offset + 102, $dlv_grp_flg4, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 103, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 103, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 104, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 104, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return getConstBoolean(offset + 105, $dlv_grp_flg5);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		setConstBoolean(offset + 105, $dlv_grp_flg5, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 106, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 106, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 107, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 107, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return getConstBoolean(offset + 108, $dlv_grp_flg6);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		setConstBoolean(offset + 108, $dlv_grp_flg6, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 109, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 109, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 110, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 110, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return getConstBoolean(offset + 111, $dlv_grp_flg7);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		setConstBoolean(offset + 111, $dlv_grp_flg7, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 112, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 112, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 113, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 113, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return getConstBoolean(offset + 114, $dlv_grp_flg8);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		setConstBoolean(offset + 114, $dlv_grp_flg8, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 115, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 115, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 116, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 116, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return getConstBoolean(offset + 117, $dlv_grp_flg9);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		setConstBoolean(offset + 117, $dlv_grp_flg9, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 118, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 118, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 119, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 119, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return getConstBoolean(offset + 120, $dlv_grp_flg10);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		setConstBoolean(offset + 120, $dlv_grp_flg10, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 121, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 121, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 122, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 122, $dlv_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 123, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 123, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 124, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 124, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 125, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 125, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 126, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 126, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 127, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 127, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 128, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 128, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 129, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 129, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 130, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 130, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 131, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 131, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 132, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 132, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 133, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 133, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 134, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 134, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 135, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 135, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 136, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 136, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 137, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 137, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 138, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 138, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 139, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 139, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 140, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 140, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 141, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 141, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 142, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 142, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 143, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 143, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 144, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 144, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 145, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 145, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 146, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 146, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 147, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 147, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 148, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 148, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 149, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 149, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 150, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 150, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 151, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 151, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 152, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 152, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($ship_rqst_id_grp_cd1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd1();
		}
		if ($ship_rqst_id_grp_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm1();
		}
		if ($ship_rqst_id_grp_cd2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd2();
		}
		if ($ship_rqst_id_grp_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm2();
		}
		if ($ship_rqst_id_grp_cd3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd3();
		}
		if ($ship_rqst_id_grp_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm3();
		}
		if ($ship_rqst_id_grp_cd4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd4();
		}
		if ($ship_rqst_id_grp_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm4();
		}
		if ($ship_rqst_id_grp_cd5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd5();
		}
		if ($ship_rqst_id_grp_nm5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm5();
		}
		if ($ship_rqst_id_grp_cd6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd6();
		}
		if ($ship_rqst_id_grp_nm6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm6();
		}
		if ($ship_rqst_id_grp_cd7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd7();
		}
		if ($ship_rqst_id_grp_nm7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm7();
		}
		if ($ship_rqst_id_grp_cd8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd8();
		}
		if ($ship_rqst_id_grp_nm8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm8();
		}
		if ($ship_rqst_id_grp_cd9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd9();
		}
		if ($ship_rqst_id_grp_nm9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm9();
		}
		if ($ship_rqst_id_grp_cd10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd10();
		}
		if ($ship_rqst_id_grp_nm10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm10();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
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
	public MCDate getDate(String name) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			return ship_schd_dt_fr();
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			return ship_schd_hm_fr();
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			return ship_schd_dt_to();
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			return ship_schd_hm_to();
		}
		if ($ship_inst_dt_fr.equalsIgnoreCase(name)) {
			return ship_inst_dt_fr();
		}
		if ($ship_inst_hm_fr.equalsIgnoreCase(name)) {
			return ship_inst_hm_fr();
		}
		if ($ship_inst_dt_to.equalsIgnoreCase(name)) {
			return ship_inst_dt_to();
		}
		if ($ship_inst_hm_to.equalsIgnoreCase(name)) {
			return ship_inst_hm_to();
		}
		if ($ship_dt_fr.equalsIgnoreCase(name)) {
			return ship_dt_fr();
		}
		if ($ship_hm_fr.equalsIgnoreCase(name)) {
			return ship_hm_fr();
		}
		if ($ship_dt_to.equalsIgnoreCase(name)) {
			return ship_dt_to();
		}
		if ($ship_hm_to.equalsIgnoreCase(name)) {
			return ship_hm_to();
		}
		if ($dlv_dt_fr.equalsIgnoreCase(name)) {
			return dlv_dt_fr();
		}
		if ($dlv_hm_fr.equalsIgnoreCase(name)) {
			return dlv_hm_fr();
		}
		if ($dlv_dt_to.equalsIgnoreCase(name)) {
			return dlv_dt_to();
		}
		if ($dlv_hm_to.equalsIgnoreCase(name)) {
			return dlv_hm_to();
		}
		if ($dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_fr();
		}
		if ($dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			return dlv_rqst_hm_fr();
		}
		if ($dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_to();
		}
		if ($dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			return dlv_rqst_hm_to();
		}
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
		if ($ship_rqst_id_grp_flg1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg1();
		}
		if ($ship_rqst_id_grp_flg2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg2();
		}
		if ($ship_rqst_id_grp_flg3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg3();
		}
		if ($ship_rqst_id_grp_flg4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg4();
		}
		if ($ship_rqst_id_grp_flg5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg5();
		}
		if ($ship_rqst_id_grp_flg6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg6();
		}
		if ($ship_rqst_id_grp_flg7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg7();
		}
		if ($ship_rqst_id_grp_flg8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg8();
		}
		if ($ship_rqst_id_grp_flg9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg9();
		}
		if ($ship_rqst_id_grp_flg10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($ship_rqst_id_grp_cd1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd1();
		}
		if ($ship_rqst_id_grp_nm1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm1();
		}
		if ($ship_rqst_id_grp_cd2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd2();
		}
		if ($ship_rqst_id_grp_nm2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm2();
		}
		if ($ship_rqst_id_grp_cd3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd3();
		}
		if ($ship_rqst_id_grp_nm3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm3();
		}
		if ($ship_rqst_id_grp_cd4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd4();
		}
		if ($ship_rqst_id_grp_nm4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm4();
		}
		if ($ship_rqst_id_grp_cd5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd5();
		}
		if ($ship_rqst_id_grp_nm5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm5();
		}
		if ($ship_rqst_id_grp_cd6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd6();
		}
		if ($ship_rqst_id_grp_nm6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm6();
		}
		if ($ship_rqst_id_grp_cd7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd7();
		}
		if ($ship_rqst_id_grp_nm7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm7();
		}
		if ($ship_rqst_id_grp_cd8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd8();
		}
		if ($ship_rqst_id_grp_nm8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm8();
		}
		if ($ship_rqst_id_grp_cd9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd9();
		}
		if ($ship_rqst_id_grp_nm9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm9();
		}
		if ($ship_rqst_id_grp_cd10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_cd10();
		}
		if ($ship_rqst_id_grp_nm10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_nm10();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
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
	public MCDate getDateNE(String name) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			return ship_schd_dt_fr();
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			return ship_schd_hm_fr();
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			return ship_schd_dt_to();
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			return ship_schd_hm_to();
		}
		if ($ship_inst_dt_fr.equalsIgnoreCase(name)) {
			return ship_inst_dt_fr();
		}
		if ($ship_inst_hm_fr.equalsIgnoreCase(name)) {
			return ship_inst_hm_fr();
		}
		if ($ship_inst_dt_to.equalsIgnoreCase(name)) {
			return ship_inst_dt_to();
		}
		if ($ship_inst_hm_to.equalsIgnoreCase(name)) {
			return ship_inst_hm_to();
		}
		if ($ship_dt_fr.equalsIgnoreCase(name)) {
			return ship_dt_fr();
		}
		if ($ship_hm_fr.equalsIgnoreCase(name)) {
			return ship_hm_fr();
		}
		if ($ship_dt_to.equalsIgnoreCase(name)) {
			return ship_dt_to();
		}
		if ($ship_hm_to.equalsIgnoreCase(name)) {
			return ship_hm_to();
		}
		if ($dlv_dt_fr.equalsIgnoreCase(name)) {
			return dlv_dt_fr();
		}
		if ($dlv_hm_fr.equalsIgnoreCase(name)) {
			return dlv_hm_fr();
		}
		if ($dlv_dt_to.equalsIgnoreCase(name)) {
			return dlv_dt_to();
		}
		if ($dlv_hm_to.equalsIgnoreCase(name)) {
			return dlv_hm_to();
		}
		if ($dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_fr();
		}
		if ($dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			return dlv_rqst_hm_fr();
		}
		if ($dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_to();
		}
		if ($dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			return dlv_rqst_hm_to();
		}
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
		if ($ship_rqst_id_grp_flg1.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg1();
		}
		if ($ship_rqst_id_grp_flg2.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg2();
		}
		if ($ship_rqst_id_grp_flg3.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg3();
		}
		if ($ship_rqst_id_grp_flg4.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg4();
		}
		if ($ship_rqst_id_grp_flg5.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg5();
		}
		if ($ship_rqst_id_grp_flg6.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg6();
		}
		if ($ship_rqst_id_grp_flg7.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg7();
		}
		if ($ship_rqst_id_grp_flg8.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg8();
		}
		if ($ship_rqst_id_grp_flg9.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg9();
		}
		if ($ship_rqst_id_grp_flg10.equalsIgnoreCase(name)) {
			return ship_rqst_id_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
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
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($ship_rqst_id_grp_cd1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd1(value);
			return;
		}
		if ($ship_rqst_id_grp_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm1(value);
			return;
		}
		if ($ship_rqst_id_grp_cd2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd2(value);
			return;
		}
		if ($ship_rqst_id_grp_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm2(value);
			return;
		}
		if ($ship_rqst_id_grp_cd3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd3(value);
			return;
		}
		if ($ship_rqst_id_grp_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm3(value);
			return;
		}
		if ($ship_rqst_id_grp_cd4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd4(value);
			return;
		}
		if ($ship_rqst_id_grp_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm4(value);
			return;
		}
		if ($ship_rqst_id_grp_cd5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd5(value);
			return;
		}
		if ($ship_rqst_id_grp_nm5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm5(value);
			return;
		}
		if ($ship_rqst_id_grp_cd6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd6(value);
			return;
		}
		if ($ship_rqst_id_grp_nm6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm6(value);
			return;
		}
		if ($ship_rqst_id_grp_cd7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd7(value);
			return;
		}
		if ($ship_rqst_id_grp_nm7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm7(value);
			return;
		}
		if ($ship_rqst_id_grp_cd8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd8(value);
			return;
		}
		if ($ship_rqst_id_grp_nm8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm8(value);
			return;
		}
		if ($ship_rqst_id_grp_cd9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd9(value);
			return;
		}
		if ($ship_rqst_id_grp_nm9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm9(value);
			return;
		}
		if ($ship_rqst_id_grp_cd10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd10(value);
			return;
		}
		if ($ship_rqst_id_grp_nm10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm10(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
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
	public void setDate(String name, MCDate value) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			ship_schd_dt_fr(value);
			return;
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			ship_schd_hm_fr(value);
			return;
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			ship_schd_dt_to(value);
			return;
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			ship_schd_hm_to(value);
			return;
		}
		if ($ship_inst_dt_fr.equalsIgnoreCase(name)) {
			ship_inst_dt_fr(value);
			return;
		}
		if ($ship_inst_hm_fr.equalsIgnoreCase(name)) {
			ship_inst_hm_fr(value);
			return;
		}
		if ($ship_inst_dt_to.equalsIgnoreCase(name)) {
			ship_inst_dt_to(value);
			return;
		}
		if ($ship_inst_hm_to.equalsIgnoreCase(name)) {
			ship_inst_hm_to(value);
			return;
		}
		if ($ship_dt_fr.equalsIgnoreCase(name)) {
			ship_dt_fr(value);
			return;
		}
		if ($ship_hm_fr.equalsIgnoreCase(name)) {
			ship_hm_fr(value);
			return;
		}
		if ($ship_dt_to.equalsIgnoreCase(name)) {
			ship_dt_to(value);
			return;
		}
		if ($ship_hm_to.equalsIgnoreCase(name)) {
			ship_hm_to(value);
			return;
		}
		if ($dlv_dt_fr.equalsIgnoreCase(name)) {
			dlv_dt_fr(value);
			return;
		}
		if ($dlv_hm_fr.equalsIgnoreCase(name)) {
			dlv_hm_fr(value);
			return;
		}
		if ($dlv_dt_to.equalsIgnoreCase(name)) {
			dlv_dt_to(value);
			return;
		}
		if ($dlv_hm_to.equalsIgnoreCase(name)) {
			dlv_hm_to(value);
			return;
		}
		if ($dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			dlv_rqst_dt_fr(value);
			return;
		}
		if ($dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			dlv_rqst_hm_fr(value);
			return;
		}
		if ($dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			dlv_rqst_dt_to(value);
			return;
		}
		if ($dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			dlv_rqst_hm_to(value);
			return;
		}
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
		if ($ship_rqst_id_grp_flg1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg1(value);
			return;
		}
		if ($ship_rqst_id_grp_flg2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg2(value);
			return;
		}
		if ($ship_rqst_id_grp_flg3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg3(value);
			return;
		}
		if ($ship_rqst_id_grp_flg4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg4(value);
			return;
		}
		if ($ship_rqst_id_grp_flg5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg5(value);
			return;
		}
		if ($ship_rqst_id_grp_flg6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg6(value);
			return;
		}
		if ($ship_rqst_id_grp_flg7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg7(value);
			return;
		}
		if ($ship_rqst_id_grp_flg8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg8(value);
			return;
		}
		if ($ship_rqst_id_grp_flg9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg9(value);
			return;
		}
		if ($ship_rqst_id_grp_flg10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
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
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
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
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
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
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($ship_rqst_id_grp_cd1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd1(value);
			return;
		}
		if ($ship_rqst_id_grp_nm1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm1(value);
			return;
		}
		if ($ship_rqst_id_grp_cd2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd2(value);
			return;
		}
		if ($ship_rqst_id_grp_nm2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm2(value);
			return;
		}
		if ($ship_rqst_id_grp_cd3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd3(value);
			return;
		}
		if ($ship_rqst_id_grp_nm3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm3(value);
			return;
		}
		if ($ship_rqst_id_grp_cd4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd4(value);
			return;
		}
		if ($ship_rqst_id_grp_nm4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm4(value);
			return;
		}
		if ($ship_rqst_id_grp_cd5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd5(value);
			return;
		}
		if ($ship_rqst_id_grp_nm5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm5(value);
			return;
		}
		if ($ship_rqst_id_grp_cd6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd6(value);
			return;
		}
		if ($ship_rqst_id_grp_nm6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm6(value);
			return;
		}
		if ($ship_rqst_id_grp_cd7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd7(value);
			return;
		}
		if ($ship_rqst_id_grp_nm7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm7(value);
			return;
		}
		if ($ship_rqst_id_grp_cd8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd8(value);
			return;
		}
		if ($ship_rqst_id_grp_nm8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm8(value);
			return;
		}
		if ($ship_rqst_id_grp_cd9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd9(value);
			return;
		}
		if ($ship_rqst_id_grp_nm9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm9(value);
			return;
		}
		if ($ship_rqst_id_grp_cd10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_cd10(value);
			return;
		}
		if ($ship_rqst_id_grp_nm10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_nm10(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			ship_schd_dt_fr(value);
			return;
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			ship_schd_hm_fr(value);
			return;
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			ship_schd_dt_to(value);
			return;
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			ship_schd_hm_to(value);
			return;
		}
		if ($ship_inst_dt_fr.equalsIgnoreCase(name)) {
			ship_inst_dt_fr(value);
			return;
		}
		if ($ship_inst_hm_fr.equalsIgnoreCase(name)) {
			ship_inst_hm_fr(value);
			return;
		}
		if ($ship_inst_dt_to.equalsIgnoreCase(name)) {
			ship_inst_dt_to(value);
			return;
		}
		if ($ship_inst_hm_to.equalsIgnoreCase(name)) {
			ship_inst_hm_to(value);
			return;
		}
		if ($ship_dt_fr.equalsIgnoreCase(name)) {
			ship_dt_fr(value);
			return;
		}
		if ($ship_hm_fr.equalsIgnoreCase(name)) {
			ship_hm_fr(value);
			return;
		}
		if ($ship_dt_to.equalsIgnoreCase(name)) {
			ship_dt_to(value);
			return;
		}
		if ($ship_hm_to.equalsIgnoreCase(name)) {
			ship_hm_to(value);
			return;
		}
		if ($dlv_dt_fr.equalsIgnoreCase(name)) {
			dlv_dt_fr(value);
			return;
		}
		if ($dlv_hm_fr.equalsIgnoreCase(name)) {
			dlv_hm_fr(value);
			return;
		}
		if ($dlv_dt_to.equalsIgnoreCase(name)) {
			dlv_dt_to(value);
			return;
		}
		if ($dlv_hm_to.equalsIgnoreCase(name)) {
			dlv_hm_to(value);
			return;
		}
		if ($dlv_rqst_dt_fr.equalsIgnoreCase(name)) {
			dlv_rqst_dt_fr(value);
			return;
		}
		if ($dlv_rqst_hm_fr.equalsIgnoreCase(name)) {
			dlv_rqst_hm_fr(value);
			return;
		}
		if ($dlv_rqst_dt_to.equalsIgnoreCase(name)) {
			dlv_rqst_dt_to(value);
			return;
		}
		if ($dlv_rqst_hm_to.equalsIgnoreCase(name)) {
			dlv_rqst_hm_to(value);
			return;
		}
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
		if ($ship_rqst_id_grp_flg1.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg1(value);
			return;
		}
		if ($ship_rqst_id_grp_flg2.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg2(value);
			return;
		}
		if ($ship_rqst_id_grp_flg3.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg3(value);
			return;
		}
		if ($ship_rqst_id_grp_flg4.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg4(value);
			return;
		}
		if ($ship_rqst_id_grp_flg5.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg5(value);
			return;
		}
		if ($ship_rqst_id_grp_flg6.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg6(value);
			return;
		}
		if ($ship_rqst_id_grp_flg7.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg7(value);
			return;
		}
		if ($ship_rqst_id_grp_flg8.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg8(value);
			return;
		}
		if ($ship_rqst_id_grp_flg9.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg9(value);
			return;
		}
		if ($ship_rqst_id_grp_flg10.equalsIgnoreCase(name)) {
			ship_rqst_id_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
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

