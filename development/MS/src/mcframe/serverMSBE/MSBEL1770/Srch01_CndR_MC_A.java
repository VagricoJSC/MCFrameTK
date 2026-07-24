package mcframe.serverMSBE.MSBEL1770;

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
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $srch_mode = "srch_mode";
	/**
	 * Export status_uncompleted 輸出状況_未完了.<p>
	 *
	 */
	public static final String $ex_im_not_comp_flg = "ex_im_not_comp_flg";
	/**
	 * Export status_completed 輸出状況_完了.<p>
	 *
	 */
	public static final String $ex_im_comp_flg = "ex_im_comp_flg";
	/**
	 * Purchase status_uncompleted 仕入状況_未完了.<p>
	 *
	 */
	public static final String $purc_im_not_comp_flg = "purc_im_not_comp_flg";
	/**
	 * Purchase status_ completed 仕入状況_完了.<p>
	 *
	 */
	public static final String $purc_im_comp_flg = "purc_im_comp_flg";
	/**
	 * I/V not entered Ｉ／Ｖ未登録.<p>
	 *
	 */
	public static final String $iv_not_reg_flg = "iv_not_reg_flg";
	/**
	 * I/V entered Ｉ／Ｖ登録済.<p>
	 *
	 */
	public static final String $iv_reg_flg = "iv_reg_flg";
	/**
	 * P/L not entered yet Ｐ／Ｌ未登録.<p>
	 *
	 */
	public static final String $pl_not_reg_flg = "pl_not_reg_flg";
	/**
	 * P/L entered Ｐ／Ｌ登録済.<p>
	 *
	 */
	public static final String $pl_reg_flg = "pl_reg_flg";
	/**
	 * P/L omitted Ｐ／Ｌ省略.<p>
	 *
	 */
	public static final String $pl_skip_flg = "pl_skip_flg";
	/**
	 * I/V not issued Ｉ／Ｖ未発行.<p>
	 *
	 */
	public static final String $iv_prnt_yet_flg = "iv_prnt_yet_flg";
	/**
	 * I/V issued Ｉ／Ｖ発行済.<p>
	 *
	 */
	public static final String $iv_prnt_done_flg = "iv_prnt_done_flg";
	/**
	 * P/L unissued Ｐ／Ｌ未発行.<p>
	 *
	 */
	public static final String $pl_prnt_yet_flg = "pl_prnt_yet_flg";
	/**
	 * P/L issued Ｐ／Ｌ発行済.<p>
	 *
	 */
	public static final String $pl_prnt_done_flg = "pl_prnt_done_flg";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $not_iv_flg = "not_iv_flg";
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public static final String $not_inst_flg = "not_inst_flg";
	/**
	 * Partially ordered 一部指図.<p>
	 *
	 */
	public static final String $part_inst_flg = "part_inst_flg";
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
	 * Unsold 未売上.<p>
	 *
	 */
	public static final String $not_sls_flg = "not_sls_flg";
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $comp_flg = "comp_flg";
	/**
	 * I/V transaction uncompleted Ｉ／Ｖ取引未完了.<p>
	 *
	 */
	public static final String $iv_not_comp_flg = "iv_not_comp_flg";
	/**
	 * I/V transaction completed Ｉ／Ｖ取引完了.<p>
	 *
	 */
	public static final String $iv_comp_flg = "iv_comp_flg";
	/**
	 * For sales keeping customer inventory 預り売上対象.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Not for sales keeping customer inventory 預り売上対象外.<p>
	 *
	 */
	public static final String $sls_cststk_invalid_flg = "sls_cststk_invalid_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Scheduled completion date FROM 完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $cmpl_schd_dt_fr = "cmpl_schd_dt_fr";
	/**
	 * Scheduled completion date TO 完了予定日ＴＯ.<p>
	 *
	 */
	public static final String $cmpl_schd_dt_to = "cmpl_schd_dt_to";
	/**
	 * Completion date FROM 完了日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $cmpl_dt_fr = "cmpl_dt_fr";
	/**
	 * Completion date TO 完了日ＴＯ.<p>
	 *
	 */
	public static final String $cmpl_dt_to = "cmpl_dt_to";
	/**
	 * Invoice date FROM インボイス日付ＦＲＯＭ.<p>
	 *
	 */
	public static final String $iv_dt_fr = "iv_dt_fr";
	/**
	 * Invoice date TO インボイス日付ＴＯ.<p>
	 *
	 */
	public static final String $iv_dt_to = "iv_dt_to";
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
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public static final String $ship_loc_nm = "ship_loc_nm";
	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $ship_site_cd = "ship_site_cd";
	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public static final String $ship_site_nm = "ship_site_nm";
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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
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
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public static final String $iv_rmrks = "iv_rmrks";
	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public static final String $iv_d_rmrks = "iv_d_rmrks";
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public static final String $pl_rmrks = "pl_rmrks";
	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public static final String $iv_intr_rmrks = "iv_intr_rmrks";
	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public static final String $iv_d_intr_rmrks = "iv_d_intr_rmrks";
	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public static final String $iv_sub_char1 = "iv_sub_char1";
	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public static final String $iv_sub_char2 = "iv_sub_char2";
	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public static final String $iv_sub_char3 = "iv_sub_char3";
	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public static final String $iv_d_sub_char1 = "iv_d_sub_char1";
	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public static final String $iv_d_sub_char2 = "iv_d_sub_char2";
	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public static final String $iv_d_sub_char3 = "iv_d_sub_char3";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public static final String $inc_past_flg = "inc_past_flg";
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
	public static final String $dlv_id_grp_flg1 = "dlv_id_grp_flg1";
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd1 = "dlv_id_grp_cd1";
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm1 = "dlv_id_grp_nm1";
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg2 = "dlv_id_grp_flg2";
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd2 = "dlv_id_grp_cd2";
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm2 = "dlv_id_grp_nm2";
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg3 = "dlv_id_grp_flg3";
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd3 = "dlv_id_grp_cd3";
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm3 = "dlv_id_grp_nm3";
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg4 = "dlv_id_grp_flg4";
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd4 = "dlv_id_grp_cd4";
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm4 = "dlv_id_grp_nm4";
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg5 = "dlv_id_grp_flg5";
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd5 = "dlv_id_grp_cd5";
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm5 = "dlv_id_grp_nm5";
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg6 = "dlv_id_grp_flg6";
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd6 = "dlv_id_grp_cd6";
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm6 = "dlv_id_grp_nm6";
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg7 = "dlv_id_grp_flg7";
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd7 = "dlv_id_grp_cd7";
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm7 = "dlv_id_grp_nm7";
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg8 = "dlv_id_grp_flg8";
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd8 = "dlv_id_grp_cd8";
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm8 = "dlv_id_grp_nm8";
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg9 = "dlv_id_grp_flg9";
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd9 = "dlv_id_grp_cd9";
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm9 = "dlv_id_grp_nm9";
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public static final String $dlv_id_grp_flg10 = "dlv_id_grp_flg10";
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $dlv_id_grp_cd10 = "dlv_id_grp_cd10";
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public static final String $dlv_id_grp_nm10 = "dlv_id_grp_nm10";
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
	public static final MCMeta srch_mode_META = createStringMeta($srch_mode);
	public static final MCMeta ex_im_not_comp_flg_META = createCommonMeta($ex_im_not_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ex_im_comp_flg_META = createCommonMeta($ex_im_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_im_not_comp_flg_META = createCommonMeta($purc_im_not_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_im_comp_flg_META = createCommonMeta($purc_im_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_not_reg_flg_META = createCommonMeta($iv_not_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_reg_flg_META = createCommonMeta($iv_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_not_reg_flg_META = createCommonMeta($pl_not_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_reg_flg_META = createCommonMeta($pl_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_skip_flg_META = createCommonMeta($pl_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_prnt_yet_flg_META = createCommonMeta($iv_prnt_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_prnt_done_flg_META = createCommonMeta($iv_prnt_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_prnt_yet_flg_META = createCommonMeta($pl_prnt_yet_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_prnt_done_flg_META = createCommonMeta($pl_prnt_done_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_iv_flg_META = createCommonMeta($not_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_inst_flg_META = createCommonMeta($not_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_inst_flg_META = createCommonMeta($part_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_ship_flg_META = createCommonMeta($not_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_ship_flg_META = createCommonMeta($part_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_flg_META = createCommonMeta($ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sls_flg_META = createCommonMeta($not_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_flg_META = createCommonMeta($comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_not_comp_flg_META = createCommonMeta($iv_not_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_comp_flg_META = createCommonMeta($iv_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_invalid_flg_META = createCommonMeta($sls_cststk_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta cmpl_schd_dt_fr_META = createCommonMeta($cmpl_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_schd_dt_to_META = createCommonMeta($cmpl_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_fr_META = createCommonMeta($cmpl_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_to_META = createCommonMeta($cmpl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_fr_META = createCommonMeta($iv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_to_META = createCommonMeta($iv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_dt_fr_META = createCommonMeta($dlv_rqst_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_fr_META = createCommonMeta($dlv_rqst_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_rqst_dt_to_META = createCommonMeta($dlv_rqst_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_to_META = createCommonMeta($dlv_rqst_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_site_cd_META = createCommonMeta($ship_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ship_site_nm_META = createCommonMeta($ship_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
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
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta iv_d_rmrks_META = createCommonMeta($iv_d_rmrks, mcframe.commonMS.meta.MS_META.IV_D_RMRKS);
	public static final MCMeta pl_rmrks_META = createCommonMeta($pl_rmrks, mcframe.commonMS.meta.MS_META.PL_RMRKS);
	public static final MCMeta iv_intr_rmrks_META = createCommonMeta($iv_intr_rmrks, mcframe.commonMS.meta.MS_META.IV_INTR_RMRKS);
	public static final MCMeta iv_d_intr_rmrks_META = createCommonMeta($iv_d_intr_rmrks, mcframe.commonMS.meta.MS_META.IV_D_INTR_D_RMRKS);
	public static final MCMeta iv_sub_char1_META = createCommonMeta($iv_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_sub_char2_META = createCommonMeta($iv_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_sub_char3_META = createCommonMeta($iv_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta iv_d_sub_char1_META = createCommonMeta($iv_d_sub_char1, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR1);
	public static final MCMeta iv_d_sub_char2_META = createCommonMeta($iv_d_sub_char2, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR2);
	public static final MCMeta iv_d_sub_char3_META = createCommonMeta($iv_d_sub_char3, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR3);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_past_flg_META = createCommonMeta($inc_past_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta dlv_id_grp_flg1_META = createCommonMeta($dlv_id_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd1_META = createCommonMeta($dlv_id_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm1_META = createCommonMeta($dlv_id_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg2_META = createCommonMeta($dlv_id_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd2_META = createCommonMeta($dlv_id_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm2_META = createCommonMeta($dlv_id_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg3_META = createCommonMeta($dlv_id_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd3_META = createCommonMeta($dlv_id_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm3_META = createCommonMeta($dlv_id_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg4_META = createCommonMeta($dlv_id_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd4_META = createCommonMeta($dlv_id_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm4_META = createCommonMeta($dlv_id_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg5_META = createCommonMeta($dlv_id_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd5_META = createCommonMeta($dlv_id_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm5_META = createCommonMeta($dlv_id_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg6_META = createCommonMeta($dlv_id_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd6_META = createCommonMeta($dlv_id_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm6_META = createCommonMeta($dlv_id_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg7_META = createCommonMeta($dlv_id_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd7_META = createCommonMeta($dlv_id_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm7_META = createCommonMeta($dlv_id_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg8_META = createCommonMeta($dlv_id_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd8_META = createCommonMeta($dlv_id_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm8_META = createCommonMeta($dlv_id_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg9_META = createCommonMeta($dlv_id_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd9_META = createCommonMeta($dlv_id_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm9_META = createCommonMeta($dlv_id_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_flg10_META = createCommonMeta($dlv_id_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_grp_cd10_META = createCommonMeta($dlv_id_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm10_META = createCommonMeta($dlv_id_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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
			ope_META,
			srch_mode_META,
			ex_im_not_comp_flg_META,
			ex_im_comp_flg_META,
			purc_im_not_comp_flg_META,
			purc_im_comp_flg_META,
			iv_not_reg_flg_META,
			iv_reg_flg_META,
			pl_not_reg_flg_META,
			pl_reg_flg_META,
			pl_skip_flg_META,
			iv_prnt_yet_flg_META,
			iv_prnt_done_flg_META,
			pl_prnt_yet_flg_META,
			pl_prnt_done_flg_META,
			not_iv_flg_META,
			not_inst_flg_META,
			part_inst_flg_META,
			inst_flg_META,
			not_ship_flg_META,
			part_ship_flg_META,
			ship_flg_META,
			not_sls_flg_META,
			sls_flg_META,
			comp_flg_META,
			iv_not_comp_flg_META,
			iv_comp_flg_META,
			sls_cststk_flg_META,
			sls_cststk_invalid_flg_META,
			iv_no_META,
			cmpl_schd_dt_fr_META,
			cmpl_schd_dt_to_META,
			cmpl_dt_fr_META,
			cmpl_dt_to_META,
			iv_dt_fr_META,
			iv_dt_to_META,
			dlv_rqst_dt_fr_META,
			dlv_rqst_hm_fr_META,
			dlv_rqst_dt_to_META,
			dlv_rqst_hm_to_META,
			tdlv_cd_META,
			tdlv_nm_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_site_cd_META,
			ship_site_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			slo_no_META,
			ship_rqst_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			rcpt_iv_no_META,
			ship_inst_no_META,
			trd_cd_META,
			trd_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
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
			iv_rmrks_META,
			iv_d_rmrks_META,
			pl_rmrks_META,
			iv_intr_rmrks_META,
			iv_d_intr_rmrks_META,
			iv_sub_char1_META,
			iv_sub_char2_META,
			iv_sub_char3_META,
			iv_d_sub_char1_META,
			iv_d_sub_char2_META,
			iv_d_sub_char3_META,
			inc_can_flg_META,
			inc_past_flg_META,
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
			dlv_id_grp_flg1_META,
			dlv_id_grp_cd1_META,
			dlv_id_grp_nm1_META,
			dlv_id_grp_flg2_META,
			dlv_id_grp_cd2_META,
			dlv_id_grp_nm2_META,
			dlv_id_grp_flg3_META,
			dlv_id_grp_cd3_META,
			dlv_id_grp_nm3_META,
			dlv_id_grp_flg4_META,
			dlv_id_grp_cd4_META,
			dlv_id_grp_nm4_META,
			dlv_id_grp_flg5_META,
			dlv_id_grp_cd5_META,
			dlv_id_grp_nm5_META,
			dlv_id_grp_flg6_META,
			dlv_id_grp_cd6_META,
			dlv_id_grp_nm6_META,
			dlv_id_grp_flg7_META,
			dlv_id_grp_cd7_META,
			dlv_id_grp_nm7_META,
			dlv_id_grp_flg8_META,
			dlv_id_grp_cd8_META,
			dlv_id_grp_nm8_META,
			dlv_id_grp_flg9_META,
			dlv_id_grp_cd9_META,
			dlv_id_grp_nm9_META,
			dlv_id_grp_flg10_META,
			dlv_id_grp_cd10_META,
			dlv_id_grp_nm10_META,
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
	/** 項目属性情報のグループ[TRIM_Dtl_COL]のキー定数 */
	public static final String $$TRIM_Dtl_COL = "TRIM_Dtl_COL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TRIM_Dtl_COL, new MCExtList(
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
	 * Search mode 検索モード.<p>
	 *
	 */
	public String srch_mode() {
		return getConstString(offset + 1, $srch_mode);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void srch_mode(String value) {
		setConstString(offset + 1, $srch_mode, value);
	}


	/**
	 * Export status_uncompleted 輸出状況_未完了.<p>
	 *
	 */
	public boolean ex_im_not_comp_flg() {
		return getConstBoolean(offset + 2, $ex_im_not_comp_flg);
	}

	/**
	 * Export status_uncompleted 輸出状況_未完了.<p>
	 *
	 */
	public void ex_im_not_comp_flg(boolean value) {
		setConstBoolean(offset + 2, $ex_im_not_comp_flg, value);
	}


	/**
	 * Export status_completed 輸出状況_完了.<p>
	 *
	 */
	public boolean ex_im_comp_flg() {
		return getConstBoolean(offset + 3, $ex_im_comp_flg);
	}

	/**
	 * Export status_completed 輸出状況_完了.<p>
	 *
	 */
	public void ex_im_comp_flg(boolean value) {
		setConstBoolean(offset + 3, $ex_im_comp_flg, value);
	}


	/**
	 * Purchase status_uncompleted 仕入状況_未完了.<p>
	 *
	 */
	public boolean purc_im_not_comp_flg() {
		return getConstBoolean(offset + 4, $purc_im_not_comp_flg);
	}

	/**
	 * Purchase status_uncompleted 仕入状況_未完了.<p>
	 *
	 */
	public void purc_im_not_comp_flg(boolean value) {
		setConstBoolean(offset + 4, $purc_im_not_comp_flg, value);
	}


	/**
	 * Purchase status_ completed 仕入状況_完了.<p>
	 *
	 */
	public boolean purc_im_comp_flg() {
		return getConstBoolean(offset + 5, $purc_im_comp_flg);
	}

	/**
	 * Purchase status_ completed 仕入状況_完了.<p>
	 *
	 */
	public void purc_im_comp_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_im_comp_flg, value);
	}


	/**
	 * I/V not entered Ｉ／Ｖ未登録.<p>
	 *
	 */
	public boolean iv_not_reg_flg() {
		return getConstBoolean(offset + 6, $iv_not_reg_flg);
	}

	/**
	 * I/V not entered Ｉ／Ｖ未登録.<p>
	 *
	 */
	public void iv_not_reg_flg(boolean value) {
		setConstBoolean(offset + 6, $iv_not_reg_flg, value);
	}


	/**
	 * I/V entered Ｉ／Ｖ登録済.<p>
	 *
	 */
	public boolean iv_reg_flg() {
		return getConstBoolean(offset + 7, $iv_reg_flg);
	}

	/**
	 * I/V entered Ｉ／Ｖ登録済.<p>
	 *
	 */
	public void iv_reg_flg(boolean value) {
		setConstBoolean(offset + 7, $iv_reg_flg, value);
	}


	/**
	 * P/L not entered yet Ｐ／Ｌ未登録.<p>
	 *
	 */
	public boolean pl_not_reg_flg() {
		return getConstBoolean(offset + 8, $pl_not_reg_flg);
	}

	/**
	 * P/L not entered yet Ｐ／Ｌ未登録.<p>
	 *
	 */
	public void pl_not_reg_flg(boolean value) {
		setConstBoolean(offset + 8, $pl_not_reg_flg, value);
	}


	/**
	 * P/L entered Ｐ／Ｌ登録済.<p>
	 *
	 */
	public boolean pl_reg_flg() {
		return getConstBoolean(offset + 9, $pl_reg_flg);
	}

	/**
	 * P/L entered Ｐ／Ｌ登録済.<p>
	 *
	 */
	public void pl_reg_flg(boolean value) {
		setConstBoolean(offset + 9, $pl_reg_flg, value);
	}


	/**
	 * P/L omitted Ｐ／Ｌ省略.<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return getConstBoolean(offset + 10, $pl_skip_flg);
	}

	/**
	 * P/L omitted Ｐ／Ｌ省略.<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		setConstBoolean(offset + 10, $pl_skip_flg, value);
	}


	/**
	 * I/V not issued Ｉ／Ｖ未発行.<p>
	 *
	 */
	public boolean iv_prnt_yet_flg() {
		return getConstBoolean(offset + 11, $iv_prnt_yet_flg);
	}

	/**
	 * I/V not issued Ｉ／Ｖ未発行.<p>
	 *
	 */
	public void iv_prnt_yet_flg(boolean value) {
		setConstBoolean(offset + 11, $iv_prnt_yet_flg, value);
	}


	/**
	 * I/V issued Ｉ／Ｖ発行済.<p>
	 *
	 */
	public boolean iv_prnt_done_flg() {
		return getConstBoolean(offset + 12, $iv_prnt_done_flg);
	}

	/**
	 * I/V issued Ｉ／Ｖ発行済.<p>
	 *
	 */
	public void iv_prnt_done_flg(boolean value) {
		setConstBoolean(offset + 12, $iv_prnt_done_flg, value);
	}


	/**
	 * P/L unissued Ｐ／Ｌ未発行.<p>
	 *
	 */
	public boolean pl_prnt_yet_flg() {
		return getConstBoolean(offset + 13, $pl_prnt_yet_flg);
	}

	/**
	 * P/L unissued Ｐ／Ｌ未発行.<p>
	 *
	 */
	public void pl_prnt_yet_flg(boolean value) {
		setConstBoolean(offset + 13, $pl_prnt_yet_flg, value);
	}


	/**
	 * P/L issued Ｐ／Ｌ発行済.<p>
	 *
	 */
	public boolean pl_prnt_done_flg() {
		return getConstBoolean(offset + 14, $pl_prnt_done_flg);
	}

	/**
	 * P/L issued Ｐ／Ｌ発行済.<p>
	 *
	 */
	public void pl_prnt_done_flg(boolean value) {
		setConstBoolean(offset + 14, $pl_prnt_done_flg, value);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public boolean not_iv_flg() {
		return getConstBoolean(offset + 15, $not_iv_flg);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void not_iv_flg(boolean value) {
		setConstBoolean(offset + 15, $not_iv_flg, value);
	}


	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public boolean not_inst_flg() {
		return getConstBoolean(offset + 16, $not_inst_flg);
	}

	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public void not_inst_flg(boolean value) {
		setConstBoolean(offset + 16, $not_inst_flg, value);
	}


	/**
	 * Partially ordered 一部指図.<p>
	 *
	 */
	public boolean part_inst_flg() {
		return getConstBoolean(offset + 17, $part_inst_flg);
	}

	/**
	 * Partially ordered 一部指図.<p>
	 *
	 */
	public void part_inst_flg(boolean value) {
		setConstBoolean(offset + 17, $part_inst_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 18, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 18, $inst_flg, value);
	}


	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public boolean not_ship_flg() {
		return getConstBoolean(offset + 19, $not_ship_flg);
	}

	/**
	 * Unshipped 未出荷.<p>
	 *
	 */
	public void not_ship_flg(boolean value) {
		setConstBoolean(offset + 19, $not_ship_flg, value);
	}


	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public boolean part_ship_flg() {
		return getConstBoolean(offset + 20, $part_ship_flg);
	}

	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public void part_ship_flg(boolean value) {
		setConstBoolean(offset + 20, $part_ship_flg, value);
	}


	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public boolean ship_flg() {
		return getConstBoolean(offset + 21, $ship_flg);
	}

	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public void ship_flg(boolean value) {
		setConstBoolean(offset + 21, $ship_flg, value);
	}


	/**
	 * Unsold 未売上.<p>
	 *
	 */
	public boolean not_sls_flg() {
		return getConstBoolean(offset + 22, $not_sls_flg);
	}

	/**
	 * Unsold 未売上.<p>
	 *
	 */
	public void not_sls_flg(boolean value) {
		setConstBoolean(offset + 22, $not_sls_flg, value);
	}


	/**
	 * Sold 売上済.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 23, $sls_flg);
	}

	/**
	 * Sold 売上済.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 23, $sls_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean comp_flg() {
		return getConstBoolean(offset + 24, $comp_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void comp_flg(boolean value) {
		setConstBoolean(offset + 24, $comp_flg, value);
	}


	/**
	 * I/V transaction uncompleted Ｉ／Ｖ取引未完了.<p>
	 *
	 */
	public boolean iv_not_comp_flg() {
		return getConstBoolean(offset + 25, $iv_not_comp_flg);
	}

	/**
	 * I/V transaction uncompleted Ｉ／Ｖ取引未完了.<p>
	 *
	 */
	public void iv_not_comp_flg(boolean value) {
		setConstBoolean(offset + 25, $iv_not_comp_flg, value);
	}


	/**
	 * I/V transaction completed Ｉ／Ｖ取引完了.<p>
	 *
	 */
	public boolean iv_comp_flg() {
		return getConstBoolean(offset + 26, $iv_comp_flg);
	}

	/**
	 * I/V transaction completed Ｉ／Ｖ取引完了.<p>
	 *
	 */
	public void iv_comp_flg(boolean value) {
		setConstBoolean(offset + 26, $iv_comp_flg, value);
	}


	/**
	 * For sales keeping customer inventory 預り売上対象.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 27, $sls_cststk_flg);
	}

	/**
	 * For sales keeping customer inventory 預り売上対象.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 27, $sls_cststk_flg, value);
	}


	/**
	 * Not for sales keeping customer inventory 預り売上対象外.<p>
	 *
	 */
	public boolean sls_cststk_invalid_flg() {
		return getConstBoolean(offset + 28, $sls_cststk_invalid_flg);
	}

	/**
	 * Not for sales keeping customer inventory 預り売上対象外.<p>
	 *
	 */
	public void sls_cststk_invalid_flg(boolean value) {
		setConstBoolean(offset + 28, $sls_cststk_invalid_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 29, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 29, $iv_no, value);
	}


	/**
	 * Scheduled completion date FROM 完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_fr() {
		return getConstDate(offset + 30, $cmpl_schd_dt_fr);
	}

	/**
	 * Scheduled completion date FROM 完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public void cmpl_schd_dt_fr(MCDate value) {
		setConstDate(offset + 30, $cmpl_schd_dt_fr, value);
	}


	/**
	 * Scheduled completion date TO 完了予定日ＴＯ.<p>
	 *
	 */
	public MCDate cmpl_schd_dt_to() {
		return getConstDate(offset + 31, $cmpl_schd_dt_to);
	}

	/**
	 * Scheduled completion date TO 完了予定日ＴＯ.<p>
	 *
	 */
	public void cmpl_schd_dt_to(MCDate value) {
		setConstDate(offset + 31, $cmpl_schd_dt_to, value);
	}


	/**
	 * Completion date FROM 完了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate cmpl_dt_fr() {
		return getConstDate(offset + 32, $cmpl_dt_fr);
	}

	/**
	 * Completion date FROM 完了日ＦＲＯＭ.<p>
	 *
	 */
	public void cmpl_dt_fr(MCDate value) {
		setConstDate(offset + 32, $cmpl_dt_fr, value);
	}


	/**
	 * Completion date TO 完了日ＴＯ.<p>
	 *
	 */
	public MCDate cmpl_dt_to() {
		return getConstDate(offset + 33, $cmpl_dt_to);
	}

	/**
	 * Completion date TO 完了日ＴＯ.<p>
	 *
	 */
	public void cmpl_dt_to(MCDate value) {
		setConstDate(offset + 33, $cmpl_dt_to, value);
	}


	/**
	 * Invoice date FROM インボイス日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDate iv_dt_fr() {
		return getConstDate(offset + 34, $iv_dt_fr);
	}

	/**
	 * Invoice date FROM インボイス日付ＦＲＯＭ.<p>
	 *
	 */
	public void iv_dt_fr(MCDate value) {
		setConstDate(offset + 34, $iv_dt_fr, value);
	}


	/**
	 * Invoice date TO インボイス日付ＴＯ.<p>
	 *
	 */
	public MCDate iv_dt_to() {
		return getConstDate(offset + 35, $iv_dt_to);
	}

	/**
	 * Invoice date TO インボイス日付ＴＯ.<p>
	 *
	 */
	public void iv_dt_to(MCDate value) {
		setConstDate(offset + 35, $iv_dt_to, value);
	}


	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_fr() {
		return getConstDate(offset + 36, $dlv_rqst_dt_fr);
	}

	/**
	 * Desired delivery date FROM 納入希望日ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_dt_fr(MCDate value) {
		setConstDate(offset + 36, $dlv_rqst_dt_fr, value);
	}


	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_fr() {
		return getConstDate(offset + 37, $dlv_rqst_hm_fr);
	}

	/**
	 * Desired delivery time FROM 納入希望時刻ＦＲＯＭ.<p>
	 *
	 */
	public void dlv_rqst_hm_fr(MCDate value) {
		setConstDate(offset + 37, $dlv_rqst_hm_fr, value);
	}


	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_dt_to() {
		return getConstDate(offset + 38, $dlv_rqst_dt_to);
	}

	/**
	 * Desired delivery date TO 納入希望日ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_dt_to(MCDate value) {
		setConstDate(offset + 38, $dlv_rqst_dt_to, value);
	}


	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public MCDate dlv_rqst_hm_to() {
		return getConstDate(offset + 39, $dlv_rqst_hm_to);
	}

	/**
	 * Desired delivery time TO 納入希望時刻ＴＯ.<p>
	 *
	 */
	public void dlv_rqst_hm_to(MCDate value) {
		setConstDate(offset + 39, $dlv_rqst_hm_to, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 40, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 40, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 41, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 41, $tdlv_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 42, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 42, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 43, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 43, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 44, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 44, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 45, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 45, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 46, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 46, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 47, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 47, $dlv_id_nm, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 48, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 48, $ship_loc_cd, value);
	}


	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 49, $ship_loc_nm);
	}

	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 49, $ship_loc_nm, value);
	}


	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String ship_site_cd() {
		return getConstString(offset + 50, $ship_site_cd);
	}

	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void ship_site_cd(String value) {
		setConstString(offset + 50, $ship_site_cd, value);
	}


	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public String ship_site_nm() {
		return getConstString(offset + 51, $ship_site_nm);
	}

	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public void ship_site_nm(String value) {
		setConstString(offset + 51, $ship_site_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 52, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 52, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 53, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 53, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 54, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 54, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 55, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 55, $ship_rqst_id_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 56, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 56, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 57, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 57, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 58, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 58, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 59, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 59, $cst_po_d_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 60, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 60, $rcpt_iv_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 61, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 61, $ship_inst_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 62, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 62, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 63, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 63, $trd_nm, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 64, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 64, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 65, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 65, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 66, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 66, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 67, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 67, $sls_dpt_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 68, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 68, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 69, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 69, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 70, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 70, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 71, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 71, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 72, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 72, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 73, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 73, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 74, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 74, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 75, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 75, $itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 76, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 76, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 77, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 77, $cst_itm_nm, value);
	}


	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 78, $iv_rmrks);
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 78, $iv_rmrks, value);
	}


	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public String iv_d_rmrks() {
		return getConstString(offset + 79, $iv_d_rmrks);
	}

	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public void iv_d_rmrks(String value) {
		setConstString(offset + 79, $iv_d_rmrks, value);
	}


	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public String pl_rmrks() {
		return getConstString(offset + 80, $pl_rmrks);
	}

	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		setConstString(offset + 80, $pl_rmrks, value);
	}


	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public String iv_intr_rmrks() {
		return getConstString(offset + 81, $iv_intr_rmrks);
	}

	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public void iv_intr_rmrks(String value) {
		setConstString(offset + 81, $iv_intr_rmrks, value);
	}


	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public String iv_d_intr_rmrks() {
		return getConstString(offset + 82, $iv_d_intr_rmrks);
	}

	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public void iv_d_intr_rmrks(String value) {
		setConstString(offset + 82, $iv_d_intr_rmrks, value);
	}


	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public String iv_sub_char1() {
		return getConstString(offset + 83, $iv_sub_char1);
	}

	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public void iv_sub_char1(String value) {
		setConstString(offset + 83, $iv_sub_char1, value);
	}


	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public String iv_sub_char2() {
		return getConstString(offset + 84, $iv_sub_char2);
	}

	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public void iv_sub_char2(String value) {
		setConstString(offset + 84, $iv_sub_char2, value);
	}


	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public String iv_sub_char3() {
		return getConstString(offset + 85, $iv_sub_char3);
	}

	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public void iv_sub_char3(String value) {
		setConstString(offset + 85, $iv_sub_char3, value);
	}


	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public String iv_d_sub_char1() {
		return getConstString(offset + 86, $iv_d_sub_char1);
	}

	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public void iv_d_sub_char1(String value) {
		setConstString(offset + 86, $iv_d_sub_char1, value);
	}


	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public String iv_d_sub_char2() {
		return getConstString(offset + 87, $iv_d_sub_char2);
	}

	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public void iv_d_sub_char2(String value) {
		setConstString(offset + 87, $iv_d_sub_char2, value);
	}


	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public String iv_d_sub_char3() {
		return getConstString(offset + 88, $iv_d_sub_char3);
	}

	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public void iv_d_sub_char3(String value) {
		setConstString(offset + 88, $iv_d_sub_char3, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 89, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 89, $inc_can_flg, value);
	}


	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public boolean inc_past_flg() {
		return getConstBoolean(offset + 90, $inc_past_flg);
	}

	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public void inc_past_flg(boolean value) {
		setConstBoolean(offset + 90, $inc_past_flg, value);
	}


	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg1() {
		return getConstBoolean(offset + 91, $ship_rqst_id_grp_flg1);
	}

	/**
	 * Shipping requested classification 1 出荷依頼先分類１.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg1(boolean value) {
		setConstBoolean(offset + 91, $ship_rqst_id_grp_flg1, value);
	}


	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd1() {
		return getConstString(offset + 92, $ship_rqst_id_grp_cd1);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd1(String value) {
		setConstString(offset + 92, $ship_rqst_id_grp_cd1, value);
	}


	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm1() {
		return getConstString(offset + 93, $ship_rqst_id_grp_nm1);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm1(String value) {
		setConstString(offset + 93, $ship_rqst_id_grp_nm1, value);
	}


	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg2() {
		return getConstBoolean(offset + 94, $ship_rqst_id_grp_flg2);
	}

	/**
	 * Shipping requested classification 2 出荷依頼先分類２.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg2(boolean value) {
		setConstBoolean(offset + 94, $ship_rqst_id_grp_flg2, value);
	}


	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd2() {
		return getConstString(offset + 95, $ship_rqst_id_grp_cd2);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd2(String value) {
		setConstString(offset + 95, $ship_rqst_id_grp_cd2, value);
	}


	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm2() {
		return getConstString(offset + 96, $ship_rqst_id_grp_nm2);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm2(String value) {
		setConstString(offset + 96, $ship_rqst_id_grp_nm2, value);
	}


	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg3() {
		return getConstBoolean(offset + 97, $ship_rqst_id_grp_flg3);
	}

	/**
	 * Shipping requested classification 3 出荷依頼先分類３.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg3(boolean value) {
		setConstBoolean(offset + 97, $ship_rqst_id_grp_flg3, value);
	}


	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd3() {
		return getConstString(offset + 98, $ship_rqst_id_grp_cd3);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd3(String value) {
		setConstString(offset + 98, $ship_rqst_id_grp_cd3, value);
	}


	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm3() {
		return getConstString(offset + 99, $ship_rqst_id_grp_nm3);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm3(String value) {
		setConstString(offset + 99, $ship_rqst_id_grp_nm3, value);
	}


	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg4() {
		return getConstBoolean(offset + 100, $ship_rqst_id_grp_flg4);
	}

	/**
	 * Shipping requested classification 4 出荷依頼先分類４.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg4(boolean value) {
		setConstBoolean(offset + 100, $ship_rqst_id_grp_flg4, value);
	}


	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd4() {
		return getConstString(offset + 101, $ship_rqst_id_grp_cd4);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd4(String value) {
		setConstString(offset + 101, $ship_rqst_id_grp_cd4, value);
	}


	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm4() {
		return getConstString(offset + 102, $ship_rqst_id_grp_nm4);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm4(String value) {
		setConstString(offset + 102, $ship_rqst_id_grp_nm4, value);
	}


	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg5() {
		return getConstBoolean(offset + 103, $ship_rqst_id_grp_flg5);
	}

	/**
	 * Shipping requested classification 5 出荷依頼先分類５.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg5(boolean value) {
		setConstBoolean(offset + 103, $ship_rqst_id_grp_flg5, value);
	}


	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd5() {
		return getConstString(offset + 104, $ship_rqst_id_grp_cd5);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd5(String value) {
		setConstString(offset + 104, $ship_rqst_id_grp_cd5, value);
	}


	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm5() {
		return getConstString(offset + 105, $ship_rqst_id_grp_nm5);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm5(String value) {
		setConstString(offset + 105, $ship_rqst_id_grp_nm5, value);
	}


	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg6() {
		return getConstBoolean(offset + 106, $ship_rqst_id_grp_flg6);
	}

	/**
	 * Shipping requested classification 6 出荷依頼先分類６.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg6(boolean value) {
		setConstBoolean(offset + 106, $ship_rqst_id_grp_flg6, value);
	}


	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd6() {
		return getConstString(offset + 107, $ship_rqst_id_grp_cd6);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd6(String value) {
		setConstString(offset + 107, $ship_rqst_id_grp_cd6, value);
	}


	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm6() {
		return getConstString(offset + 108, $ship_rqst_id_grp_nm6);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm6(String value) {
		setConstString(offset + 108, $ship_rqst_id_grp_nm6, value);
	}


	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg7() {
		return getConstBoolean(offset + 109, $ship_rqst_id_grp_flg7);
	}

	/**
	 * Shipping requested classification 7 出荷依頼先分類７.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg7(boolean value) {
		setConstBoolean(offset + 109, $ship_rqst_id_grp_flg7, value);
	}


	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd7() {
		return getConstString(offset + 110, $ship_rqst_id_grp_cd7);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd7(String value) {
		setConstString(offset + 110, $ship_rqst_id_grp_cd7, value);
	}


	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm7() {
		return getConstString(offset + 111, $ship_rqst_id_grp_nm7);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm7(String value) {
		setConstString(offset + 111, $ship_rqst_id_grp_nm7, value);
	}


	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg8() {
		return getConstBoolean(offset + 112, $ship_rqst_id_grp_flg8);
	}

	/**
	 * Shipping requested classification 8 出荷依頼先分類８.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg8(boolean value) {
		setConstBoolean(offset + 112, $ship_rqst_id_grp_flg8, value);
	}


	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd8() {
		return getConstString(offset + 113, $ship_rqst_id_grp_cd8);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd8(String value) {
		setConstString(offset + 113, $ship_rqst_id_grp_cd8, value);
	}


	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm8() {
		return getConstString(offset + 114, $ship_rqst_id_grp_nm8);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm8(String value) {
		setConstString(offset + 114, $ship_rqst_id_grp_nm8, value);
	}


	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg9() {
		return getConstBoolean(offset + 115, $ship_rqst_id_grp_flg9);
	}

	/**
	 * Shipping requested classification 9 出荷依頼先分類９.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg9(boolean value) {
		setConstBoolean(offset + 115, $ship_rqst_id_grp_flg9, value);
	}


	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd9() {
		return getConstString(offset + 116, $ship_rqst_id_grp_cd9);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd9(String value) {
		setConstString(offset + 116, $ship_rqst_id_grp_cd9, value);
	}


	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm9() {
		return getConstString(offset + 117, $ship_rqst_id_grp_nm9);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm9(String value) {
		setConstString(offset + 117, $ship_rqst_id_grp_nm9, value);
	}


	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public boolean ship_rqst_id_grp_flg10() {
		return getConstBoolean(offset + 118, $ship_rqst_id_grp_flg10);
	}

	/**
	 * Shipping requested classification 10 出荷依頼先分類１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_flg10(boolean value) {
		setConstBoolean(offset + 118, $ship_rqst_id_grp_flg10, value);
	}


	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd10() {
		return getConstString(offset + 119, $ship_rqst_id_grp_cd10);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd10(String value) {
		setConstString(offset + 119, $ship_rqst_id_grp_cd10, value);
	}


	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm10() {
		return getConstString(offset + 120, $ship_rqst_id_grp_nm10);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm10(String value) {
		setConstString(offset + 120, $ship_rqst_id_grp_nm10, value);
	}


	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_id_grp_flg1() {
		return getConstBoolean(offset + 121, $dlv_id_grp_flg1);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_id_grp_flg1(boolean value) {
		setConstBoolean(offset + 121, $dlv_id_grp_flg1, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_id_grp_cd1() {
		return getConstString(offset + 122, $dlv_id_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_id_grp_cd1(String value) {
		setConstString(offset + 122, $dlv_id_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_id_grp_nm1() {
		return getConstString(offset + 123, $dlv_id_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_id_grp_nm1(String value) {
		setConstString(offset + 123, $dlv_id_grp_nm1, value);
	}


	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_id_grp_flg2() {
		return getConstBoolean(offset + 124, $dlv_id_grp_flg2);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_id_grp_flg2(boolean value) {
		setConstBoolean(offset + 124, $dlv_id_grp_flg2, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_id_grp_cd2() {
		return getConstString(offset + 125, $dlv_id_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_id_grp_cd2(String value) {
		setConstString(offset + 125, $dlv_id_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_id_grp_nm2() {
		return getConstString(offset + 126, $dlv_id_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_id_grp_nm2(String value) {
		setConstString(offset + 126, $dlv_id_grp_nm2, value);
	}


	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_id_grp_flg3() {
		return getConstBoolean(offset + 127, $dlv_id_grp_flg3);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_id_grp_flg3(boolean value) {
		setConstBoolean(offset + 127, $dlv_id_grp_flg3, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_id_grp_cd3() {
		return getConstString(offset + 128, $dlv_id_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_id_grp_cd3(String value) {
		setConstString(offset + 128, $dlv_id_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_id_grp_nm3() {
		return getConstString(offset + 129, $dlv_id_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_id_grp_nm3(String value) {
		setConstString(offset + 129, $dlv_id_grp_nm3, value);
	}


	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_id_grp_flg4() {
		return getConstBoolean(offset + 130, $dlv_id_grp_flg4);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_id_grp_flg4(boolean value) {
		setConstBoolean(offset + 130, $dlv_id_grp_flg4, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_id_grp_cd4() {
		return getConstString(offset + 131, $dlv_id_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_id_grp_cd4(String value) {
		setConstString(offset + 131, $dlv_id_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_id_grp_nm4() {
		return getConstString(offset + 132, $dlv_id_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_id_grp_nm4(String value) {
		setConstString(offset + 132, $dlv_id_grp_nm4, value);
	}


	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_id_grp_flg5() {
		return getConstBoolean(offset + 133, $dlv_id_grp_flg5);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_id_grp_flg5(boolean value) {
		setConstBoolean(offset + 133, $dlv_id_grp_flg5, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_id_grp_cd5() {
		return getConstString(offset + 134, $dlv_id_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_id_grp_cd5(String value) {
		setConstString(offset + 134, $dlv_id_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_id_grp_nm5() {
		return getConstString(offset + 135, $dlv_id_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_id_grp_nm5(String value) {
		setConstString(offset + 135, $dlv_id_grp_nm5, value);
	}


	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_id_grp_flg6() {
		return getConstBoolean(offset + 136, $dlv_id_grp_flg6);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_id_grp_flg6(boolean value) {
		setConstBoolean(offset + 136, $dlv_id_grp_flg6, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_id_grp_cd6() {
		return getConstString(offset + 137, $dlv_id_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_id_grp_cd6(String value) {
		setConstString(offset + 137, $dlv_id_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_id_grp_nm6() {
		return getConstString(offset + 138, $dlv_id_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_id_grp_nm6(String value) {
		setConstString(offset + 138, $dlv_id_grp_nm6, value);
	}


	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_id_grp_flg7() {
		return getConstBoolean(offset + 139, $dlv_id_grp_flg7);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_id_grp_flg7(boolean value) {
		setConstBoolean(offset + 139, $dlv_id_grp_flg7, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_id_grp_cd7() {
		return getConstString(offset + 140, $dlv_id_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_id_grp_cd7(String value) {
		setConstString(offset + 140, $dlv_id_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_id_grp_nm7() {
		return getConstString(offset + 141, $dlv_id_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_id_grp_nm7(String value) {
		setConstString(offset + 141, $dlv_id_grp_nm7, value);
	}


	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_id_grp_flg8() {
		return getConstBoolean(offset + 142, $dlv_id_grp_flg8);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_id_grp_flg8(boolean value) {
		setConstBoolean(offset + 142, $dlv_id_grp_flg8, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_id_grp_cd8() {
		return getConstString(offset + 143, $dlv_id_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_id_grp_cd8(String value) {
		setConstString(offset + 143, $dlv_id_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_id_grp_nm8() {
		return getConstString(offset + 144, $dlv_id_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_id_grp_nm8(String value) {
		setConstString(offset + 144, $dlv_id_grp_nm8, value);
	}


	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_id_grp_flg9() {
		return getConstBoolean(offset + 145, $dlv_id_grp_flg9);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_id_grp_flg9(boolean value) {
		setConstBoolean(offset + 145, $dlv_id_grp_flg9, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_id_grp_cd9() {
		return getConstString(offset + 146, $dlv_id_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_id_grp_cd9(String value) {
		setConstString(offset + 146, $dlv_id_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_id_grp_nm9() {
		return getConstString(offset + 147, $dlv_id_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_id_grp_nm9(String value) {
		setConstString(offset + 147, $dlv_id_grp_nm9, value);
	}


	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_id_grp_flg10() {
		return getConstBoolean(offset + 148, $dlv_id_grp_flg10);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_id_grp_flg10(boolean value) {
		setConstBoolean(offset + 148, $dlv_id_grp_flg10, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_id_grp_cd10() {
		return getConstString(offset + 149, $dlv_id_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_id_grp_cd10(String value) {
		setConstString(offset + 149, $dlv_id_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_id_grp_nm10() {
		return getConstString(offset + 150, $dlv_id_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_id_grp_nm10(String value) {
		setConstString(offset + 150, $dlv_id_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 151, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 151, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 152, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 152, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 153, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 153, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 154, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 154, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 155, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 155, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 156, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 156, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 157, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 157, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 158, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 158, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 159, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 159, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 160, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 160, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 161, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 161, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 162, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 162, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 163, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 163, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 164, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 164, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 165, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 165, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 166, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 166, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 167, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 167, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 168, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 168, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 169, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 169, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 170, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 170, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 171, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 171, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 172, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 172, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 173, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 173, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 174, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 174, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 175, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 175, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 176, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 176, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 177, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 177, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 178, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 178, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 179, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 179, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 180, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 180, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			return ship_site_nm();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_d_intr_rmrks();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_d_sub_char1();
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_d_sub_char2();
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_d_sub_char3();
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
		if ($dlv_id_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd1();
		}
		if ($dlv_id_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm1();
		}
		if ($dlv_id_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd2();
		}
		if ($dlv_id_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm2();
		}
		if ($dlv_id_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd3();
		}
		if ($dlv_id_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm3();
		}
		if ($dlv_id_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd4();
		}
		if ($dlv_id_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm4();
		}
		if ($dlv_id_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd5();
		}
		if ($dlv_id_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm5();
		}
		if ($dlv_id_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd6();
		}
		if ($dlv_id_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm6();
		}
		if ($dlv_id_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd7();
		}
		if ($dlv_id_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm7();
		}
		if ($dlv_id_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd8();
		}
		if ($dlv_id_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm8();
		}
		if ($dlv_id_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd9();
		}
		if ($dlv_id_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm9();
		}
		if ($dlv_id_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd10();
		}
		if ($dlv_id_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm10();
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
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		if ($cmpl_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_dt_fr();
		}
		if ($cmpl_dt_to.equalsIgnoreCase(name)) {
			return cmpl_dt_to();
		}
		if ($iv_dt_fr.equalsIgnoreCase(name)) {
			return iv_dt_fr();
		}
		if ($iv_dt_to.equalsIgnoreCase(name)) {
			return iv_dt_to();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ex_im_not_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_not_comp_flg();
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_comp_flg();
		}
		if ($purc_im_not_comp_flg.equalsIgnoreCase(name)) {
			return purc_im_not_comp_flg();
		}
		if ($purc_im_comp_flg.equalsIgnoreCase(name)) {
			return purc_im_comp_flg();
		}
		if ($iv_not_reg_flg.equalsIgnoreCase(name)) {
			return iv_not_reg_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		if ($pl_not_reg_flg.equalsIgnoreCase(name)) {
			return pl_not_reg_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($iv_prnt_yet_flg.equalsIgnoreCase(name)) {
			return iv_prnt_yet_flg();
		}
		if ($iv_prnt_done_flg.equalsIgnoreCase(name)) {
			return iv_prnt_done_flg();
		}
		if ($pl_prnt_yet_flg.equalsIgnoreCase(name)) {
			return pl_prnt_yet_flg();
		}
		if ($pl_prnt_done_flg.equalsIgnoreCase(name)) {
			return pl_prnt_done_flg();
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			return not_iv_flg();
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
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
		if ($not_sls_flg.equalsIgnoreCase(name)) {
			return not_sls_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($iv_not_comp_flg.equalsIgnoreCase(name)) {
			return iv_not_comp_flg();
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			return iv_comp_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($sls_cststk_invalid_flg.equalsIgnoreCase(name)) {
			return sls_cststk_invalid_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
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
		if ($dlv_id_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg1();
		}
		if ($dlv_id_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg2();
		}
		if ($dlv_id_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg3();
		}
		if ($dlv_id_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg4();
		}
		if ($dlv_id_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg5();
		}
		if ($dlv_id_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg6();
		}
		if ($dlv_id_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg7();
		}
		if ($dlv_id_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg8();
		}
		if ($dlv_id_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg9();
		}
		if ($dlv_id_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg10();
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			return srch_mode();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			return ship_loc_nm();
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			return ship_site_nm();
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_d_intr_rmrks();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_d_sub_char1();
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_d_sub_char2();
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_d_sub_char3();
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
		if ($dlv_id_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd1();
		}
		if ($dlv_id_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm1();
		}
		if ($dlv_id_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd2();
		}
		if ($dlv_id_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm2();
		}
		if ($dlv_id_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd3();
		}
		if ($dlv_id_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm3();
		}
		if ($dlv_id_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd4();
		}
		if ($dlv_id_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm4();
		}
		if ($dlv_id_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd5();
		}
		if ($dlv_id_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm5();
		}
		if ($dlv_id_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd6();
		}
		if ($dlv_id_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm6();
		}
		if ($dlv_id_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd7();
		}
		if ($dlv_id_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm7();
		}
		if ($dlv_id_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd8();
		}
		if ($dlv_id_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm8();
		}
		if ($dlv_id_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd9();
		}
		if ($dlv_id_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm9();
		}
		if ($dlv_id_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_id_grp_cd10();
		}
		if ($dlv_id_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_id_grp_nm10();
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
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_fr();
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			return cmpl_schd_dt_to();
		}
		if ($cmpl_dt_fr.equalsIgnoreCase(name)) {
			return cmpl_dt_fr();
		}
		if ($cmpl_dt_to.equalsIgnoreCase(name)) {
			return cmpl_dt_to();
		}
		if ($iv_dt_fr.equalsIgnoreCase(name)) {
			return iv_dt_fr();
		}
		if ($iv_dt_to.equalsIgnoreCase(name)) {
			return iv_dt_to();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ex_im_not_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_not_comp_flg();
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_comp_flg();
		}
		if ($purc_im_not_comp_flg.equalsIgnoreCase(name)) {
			return purc_im_not_comp_flg();
		}
		if ($purc_im_comp_flg.equalsIgnoreCase(name)) {
			return purc_im_comp_flg();
		}
		if ($iv_not_reg_flg.equalsIgnoreCase(name)) {
			return iv_not_reg_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		if ($pl_not_reg_flg.equalsIgnoreCase(name)) {
			return pl_not_reg_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($iv_prnt_yet_flg.equalsIgnoreCase(name)) {
			return iv_prnt_yet_flg();
		}
		if ($iv_prnt_done_flg.equalsIgnoreCase(name)) {
			return iv_prnt_done_flg();
		}
		if ($pl_prnt_yet_flg.equalsIgnoreCase(name)) {
			return pl_prnt_yet_flg();
		}
		if ($pl_prnt_done_flg.equalsIgnoreCase(name)) {
			return pl_prnt_done_flg();
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			return not_iv_flg();
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			return not_inst_flg();
		}
		if ($part_inst_flg.equalsIgnoreCase(name)) {
			return part_inst_flg();
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
		if ($not_sls_flg.equalsIgnoreCase(name)) {
			return not_sls_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			return comp_flg();
		}
		if ($iv_not_comp_flg.equalsIgnoreCase(name)) {
			return iv_not_comp_flg();
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			return iv_comp_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($sls_cststk_invalid_flg.equalsIgnoreCase(name)) {
			return sls_cststk_invalid_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			return inc_past_flg();
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
		if ($dlv_id_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg1();
		}
		if ($dlv_id_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg2();
		}
		if ($dlv_id_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg3();
		}
		if ($dlv_id_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg4();
		}
		if ($dlv_id_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg5();
		}
		if ($dlv_id_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg6();
		}
		if ($dlv_id_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg7();
		}
		if ($dlv_id_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg8();
		}
		if ($dlv_id_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg9();
		}
		if ($dlv_id_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_id_grp_flg10();
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
			return;
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			ship_site_nm(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
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
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
			return;
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			iv_d_intr_rmrks(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			iv_d_sub_char1(value);
			return;
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			iv_d_sub_char2(value);
			return;
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			iv_d_sub_char3(value);
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
		if ($dlv_id_grp_cd1.equalsIgnoreCase(name)) {
			dlv_id_grp_cd1(value);
			return;
		}
		if ($dlv_id_grp_nm1.equalsIgnoreCase(name)) {
			dlv_id_grp_nm1(value);
			return;
		}
		if ($dlv_id_grp_cd2.equalsIgnoreCase(name)) {
			dlv_id_grp_cd2(value);
			return;
		}
		if ($dlv_id_grp_nm2.equalsIgnoreCase(name)) {
			dlv_id_grp_nm2(value);
			return;
		}
		if ($dlv_id_grp_cd3.equalsIgnoreCase(name)) {
			dlv_id_grp_cd3(value);
			return;
		}
		if ($dlv_id_grp_nm3.equalsIgnoreCase(name)) {
			dlv_id_grp_nm3(value);
			return;
		}
		if ($dlv_id_grp_cd4.equalsIgnoreCase(name)) {
			dlv_id_grp_cd4(value);
			return;
		}
		if ($dlv_id_grp_nm4.equalsIgnoreCase(name)) {
			dlv_id_grp_nm4(value);
			return;
		}
		if ($dlv_id_grp_cd5.equalsIgnoreCase(name)) {
			dlv_id_grp_cd5(value);
			return;
		}
		if ($dlv_id_grp_nm5.equalsIgnoreCase(name)) {
			dlv_id_grp_nm5(value);
			return;
		}
		if ($dlv_id_grp_cd6.equalsIgnoreCase(name)) {
			dlv_id_grp_cd6(value);
			return;
		}
		if ($dlv_id_grp_nm6.equalsIgnoreCase(name)) {
			dlv_id_grp_nm6(value);
			return;
		}
		if ($dlv_id_grp_cd7.equalsIgnoreCase(name)) {
			dlv_id_grp_cd7(value);
			return;
		}
		if ($dlv_id_grp_nm7.equalsIgnoreCase(name)) {
			dlv_id_grp_nm7(value);
			return;
		}
		if ($dlv_id_grp_cd8.equalsIgnoreCase(name)) {
			dlv_id_grp_cd8(value);
			return;
		}
		if ($dlv_id_grp_nm8.equalsIgnoreCase(name)) {
			dlv_id_grp_nm8(value);
			return;
		}
		if ($dlv_id_grp_cd9.equalsIgnoreCase(name)) {
			dlv_id_grp_cd9(value);
			return;
		}
		if ($dlv_id_grp_nm9.equalsIgnoreCase(name)) {
			dlv_id_grp_nm9(value);
			return;
		}
		if ($dlv_id_grp_cd10.equalsIgnoreCase(name)) {
			dlv_id_grp_cd10(value);
			return;
		}
		if ($dlv_id_grp_nm10.equalsIgnoreCase(name)) {
			dlv_id_grp_nm10(value);
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
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			cmpl_schd_dt_fr(value);
			return;
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			cmpl_schd_dt_to(value);
			return;
		}
		if ($cmpl_dt_fr.equalsIgnoreCase(name)) {
			cmpl_dt_fr(value);
			return;
		}
		if ($cmpl_dt_to.equalsIgnoreCase(name)) {
			cmpl_dt_to(value);
			return;
		}
		if ($iv_dt_fr.equalsIgnoreCase(name)) {
			iv_dt_fr(value);
			return;
		}
		if ($iv_dt_to.equalsIgnoreCase(name)) {
			iv_dt_to(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ex_im_not_comp_flg.equalsIgnoreCase(name)) {
			ex_im_not_comp_flg(value);
			return;
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			ex_im_comp_flg(value);
			return;
		}
		if ($purc_im_not_comp_flg.equalsIgnoreCase(name)) {
			purc_im_not_comp_flg(value);
			return;
		}
		if ($purc_im_comp_flg.equalsIgnoreCase(name)) {
			purc_im_comp_flg(value);
			return;
		}
		if ($iv_not_reg_flg.equalsIgnoreCase(name)) {
			iv_not_reg_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		if ($pl_not_reg_flg.equalsIgnoreCase(name)) {
			pl_not_reg_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($iv_prnt_yet_flg.equalsIgnoreCase(name)) {
			iv_prnt_yet_flg(value);
			return;
		}
		if ($iv_prnt_done_flg.equalsIgnoreCase(name)) {
			iv_prnt_done_flg(value);
			return;
		}
		if ($pl_prnt_yet_flg.equalsIgnoreCase(name)) {
			pl_prnt_yet_flg(value);
			return;
		}
		if ($pl_prnt_done_flg.equalsIgnoreCase(name)) {
			pl_prnt_done_flg(value);
			return;
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			not_iv_flg(value);
			return;
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
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
		if ($not_sls_flg.equalsIgnoreCase(name)) {
			not_sls_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($iv_not_comp_flg.equalsIgnoreCase(name)) {
			iv_not_comp_flg(value);
			return;
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			iv_comp_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($sls_cststk_invalid_flg.equalsIgnoreCase(name)) {
			sls_cststk_invalid_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
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
		if ($dlv_id_grp_flg1.equalsIgnoreCase(name)) {
			dlv_id_grp_flg1(value);
			return;
		}
		if ($dlv_id_grp_flg2.equalsIgnoreCase(name)) {
			dlv_id_grp_flg2(value);
			return;
		}
		if ($dlv_id_grp_flg3.equalsIgnoreCase(name)) {
			dlv_id_grp_flg3(value);
			return;
		}
		if ($dlv_id_grp_flg4.equalsIgnoreCase(name)) {
			dlv_id_grp_flg4(value);
			return;
		}
		if ($dlv_id_grp_flg5.equalsIgnoreCase(name)) {
			dlv_id_grp_flg5(value);
			return;
		}
		if ($dlv_id_grp_flg6.equalsIgnoreCase(name)) {
			dlv_id_grp_flg6(value);
			return;
		}
		if ($dlv_id_grp_flg7.equalsIgnoreCase(name)) {
			dlv_id_grp_flg7(value);
			return;
		}
		if ($dlv_id_grp_flg8.equalsIgnoreCase(name)) {
			dlv_id_grp_flg8(value);
			return;
		}
		if ($dlv_id_grp_flg9.equalsIgnoreCase(name)) {
			dlv_id_grp_flg9(value);
			return;
		}
		if ($dlv_id_grp_flg10.equalsIgnoreCase(name)) {
			dlv_id_grp_flg10(value);
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
		if ($srch_mode.equalsIgnoreCase(name)) {
			srch_mode(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_loc_nm.equalsIgnoreCase(name)) {
			ship_loc_nm(value);
			return;
		}
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
			return;
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			ship_site_nm(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
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
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
			return;
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			iv_d_intr_rmrks(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($iv_d_sub_char1.equalsIgnoreCase(name)) {
			iv_d_sub_char1(value);
			return;
		}
		if ($iv_d_sub_char2.equalsIgnoreCase(name)) {
			iv_d_sub_char2(value);
			return;
		}
		if ($iv_d_sub_char3.equalsIgnoreCase(name)) {
			iv_d_sub_char3(value);
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
		if ($dlv_id_grp_cd1.equalsIgnoreCase(name)) {
			dlv_id_grp_cd1(value);
			return;
		}
		if ($dlv_id_grp_nm1.equalsIgnoreCase(name)) {
			dlv_id_grp_nm1(value);
			return;
		}
		if ($dlv_id_grp_cd2.equalsIgnoreCase(name)) {
			dlv_id_grp_cd2(value);
			return;
		}
		if ($dlv_id_grp_nm2.equalsIgnoreCase(name)) {
			dlv_id_grp_nm2(value);
			return;
		}
		if ($dlv_id_grp_cd3.equalsIgnoreCase(name)) {
			dlv_id_grp_cd3(value);
			return;
		}
		if ($dlv_id_grp_nm3.equalsIgnoreCase(name)) {
			dlv_id_grp_nm3(value);
			return;
		}
		if ($dlv_id_grp_cd4.equalsIgnoreCase(name)) {
			dlv_id_grp_cd4(value);
			return;
		}
		if ($dlv_id_grp_nm4.equalsIgnoreCase(name)) {
			dlv_id_grp_nm4(value);
			return;
		}
		if ($dlv_id_grp_cd5.equalsIgnoreCase(name)) {
			dlv_id_grp_cd5(value);
			return;
		}
		if ($dlv_id_grp_nm5.equalsIgnoreCase(name)) {
			dlv_id_grp_nm5(value);
			return;
		}
		if ($dlv_id_grp_cd6.equalsIgnoreCase(name)) {
			dlv_id_grp_cd6(value);
			return;
		}
		if ($dlv_id_grp_nm6.equalsIgnoreCase(name)) {
			dlv_id_grp_nm6(value);
			return;
		}
		if ($dlv_id_grp_cd7.equalsIgnoreCase(name)) {
			dlv_id_grp_cd7(value);
			return;
		}
		if ($dlv_id_grp_nm7.equalsIgnoreCase(name)) {
			dlv_id_grp_nm7(value);
			return;
		}
		if ($dlv_id_grp_cd8.equalsIgnoreCase(name)) {
			dlv_id_grp_cd8(value);
			return;
		}
		if ($dlv_id_grp_nm8.equalsIgnoreCase(name)) {
			dlv_id_grp_nm8(value);
			return;
		}
		if ($dlv_id_grp_cd9.equalsIgnoreCase(name)) {
			dlv_id_grp_cd9(value);
			return;
		}
		if ($dlv_id_grp_nm9.equalsIgnoreCase(name)) {
			dlv_id_grp_nm9(value);
			return;
		}
		if ($dlv_id_grp_cd10.equalsIgnoreCase(name)) {
			dlv_id_grp_cd10(value);
			return;
		}
		if ($dlv_id_grp_nm10.equalsIgnoreCase(name)) {
			dlv_id_grp_nm10(value);
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
		if ($cmpl_schd_dt_fr.equalsIgnoreCase(name)) {
			cmpl_schd_dt_fr(value);
			return;
		}
		if ($cmpl_schd_dt_to.equalsIgnoreCase(name)) {
			cmpl_schd_dt_to(value);
			return;
		}
		if ($cmpl_dt_fr.equalsIgnoreCase(name)) {
			cmpl_dt_fr(value);
			return;
		}
		if ($cmpl_dt_to.equalsIgnoreCase(name)) {
			cmpl_dt_to(value);
			return;
		}
		if ($iv_dt_fr.equalsIgnoreCase(name)) {
			iv_dt_fr(value);
			return;
		}
		if ($iv_dt_to.equalsIgnoreCase(name)) {
			iv_dt_to(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ex_im_not_comp_flg.equalsIgnoreCase(name)) {
			ex_im_not_comp_flg(value);
			return;
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			ex_im_comp_flg(value);
			return;
		}
		if ($purc_im_not_comp_flg.equalsIgnoreCase(name)) {
			purc_im_not_comp_flg(value);
			return;
		}
		if ($purc_im_comp_flg.equalsIgnoreCase(name)) {
			purc_im_comp_flg(value);
			return;
		}
		if ($iv_not_reg_flg.equalsIgnoreCase(name)) {
			iv_not_reg_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		if ($pl_not_reg_flg.equalsIgnoreCase(name)) {
			pl_not_reg_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($iv_prnt_yet_flg.equalsIgnoreCase(name)) {
			iv_prnt_yet_flg(value);
			return;
		}
		if ($iv_prnt_done_flg.equalsIgnoreCase(name)) {
			iv_prnt_done_flg(value);
			return;
		}
		if ($pl_prnt_yet_flg.equalsIgnoreCase(name)) {
			pl_prnt_yet_flg(value);
			return;
		}
		if ($pl_prnt_done_flg.equalsIgnoreCase(name)) {
			pl_prnt_done_flg(value);
			return;
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			not_iv_flg(value);
			return;
		}
		if ($not_inst_flg.equalsIgnoreCase(name)) {
			not_inst_flg(value);
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
		if ($not_sls_flg.equalsIgnoreCase(name)) {
			not_sls_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($comp_flg.equalsIgnoreCase(name)) {
			comp_flg(value);
			return;
		}
		if ($iv_not_comp_flg.equalsIgnoreCase(name)) {
			iv_not_comp_flg(value);
			return;
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			iv_comp_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($sls_cststk_invalid_flg.equalsIgnoreCase(name)) {
			sls_cststk_invalid_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		if ($inc_past_flg.equalsIgnoreCase(name)) {
			inc_past_flg(value);
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
		if ($dlv_id_grp_flg1.equalsIgnoreCase(name)) {
			dlv_id_grp_flg1(value);
			return;
		}
		if ($dlv_id_grp_flg2.equalsIgnoreCase(name)) {
			dlv_id_grp_flg2(value);
			return;
		}
		if ($dlv_id_grp_flg3.equalsIgnoreCase(name)) {
			dlv_id_grp_flg3(value);
			return;
		}
		if ($dlv_id_grp_flg4.equalsIgnoreCase(name)) {
			dlv_id_grp_flg4(value);
			return;
		}
		if ($dlv_id_grp_flg5.equalsIgnoreCase(name)) {
			dlv_id_grp_flg5(value);
			return;
		}
		if ($dlv_id_grp_flg6.equalsIgnoreCase(name)) {
			dlv_id_grp_flg6(value);
			return;
		}
		if ($dlv_id_grp_flg7.equalsIgnoreCase(name)) {
			dlv_id_grp_flg7(value);
			return;
		}
		if ($dlv_id_grp_flg8.equalsIgnoreCase(name)) {
			dlv_id_grp_flg8(value);
			return;
		}
		if ($dlv_id_grp_flg9.equalsIgnoreCase(name)) {
			dlv_id_grp_flg9(value);
			return;
		}
		if ($dlv_id_grp_flg10.equalsIgnoreCase(name)) {
			dlv_id_grp_flg10(value);
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

