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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public static final String $pl_skip_flg = "pl_skip_flg";
	/**
	 * Exported 輸出済.<p>
	 *
	 */
	public static final String $ex_im_comp_flg = "ex_im_comp_flg";
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public static final String $non_cmpl_flg = "non_cmpl_flg";
	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public static final String $iv_ship_flg = "iv_ship_flg";
	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public static final String $iv_prnt_flg = "iv_prnt_flg";
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public static final String $pl_prnt_flg = "pl_prnt_flg";
	/**
	 * Invoice transaction completed インボイス取引完了.<p>
	 *
	 */
	public static final String $iv_comp_flg = "iv_comp_flg";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public static final String $cmpl_schd_dt = "cmpl_schd_dt";
	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public static final String $trd_schd_dt = "trd_schd_dt";
	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public static final String $cmpl_dt = "cmpl_dt";
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
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
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
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
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
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
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public static final String $load_port_nm = "load_port_nm";
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public static final String $dschrg_port_nm = "dschrg_port_nm";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public static final String $via_port_nm = "via_port_nm";
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Transaction terms 取引条件.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms name 取引条件名.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Delivery location 受渡場所.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Delivery location name 受渡場所名.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
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
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public static final String $ttl_trd_cur_amt = "ttl_trd_cur_amt";
	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public static final String $ttl_trd_cur_inc_tax_amt = "ttl_trd_cur_inc_tax_amt";
	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public static final String $ttl_net_wt = "ttl_net_wt";
	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public static final String $ttl_grss_wt = "ttl_grss_wt";
	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public static final String $ttl_dim = "ttl_dim";
	/**
	 * Payment terms 支払条件.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Payment terms name 支払条件名.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public static final String $pl_rmrks = "pl_rmrks";
	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public static final String $case_mrk1 = "case_mrk1";
	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public static final String $case_mrk2 = "case_mrk2";
	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public static final String $case_mrk3 = "case_mrk3";
	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public static final String $case_mrk4 = "case_mrk4";
	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public static final String $case_mrk5 = "case_mrk5";
	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public static final String $case_mrk6 = "case_mrk6";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public static final String $lc_no = "lc_no";
	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public static final String $lc_dt = "lc_dt";
	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public static final String $lc_rmrks = "lc_rmrks";
	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public static final String $bl_no = "bl_no";
	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public static final String $bl_dt = "bl_dt";
	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public static final String $bl_rmrks = "bl_rmrks";
	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public static final String $iv_rmrks = "iv_rmrks";
	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public static final String $pl_reg_flg = "pl_reg_flg";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice temporary entry 受領インボイス仮登録.<p>
	 *
	 */
	public static final String $pre_rcpt_iv_flg = "pre_rcpt_iv_flg";
	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public static final String $iv_reg_flg = "iv_reg_flg";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public static final String $purc_cmpl_flg = "purc_cmpl_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
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
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
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
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
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
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public static final String $ship_str_ln_nm = "ship_str_ln_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
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
	 * Invoice total インボイス計.<p>
	 *
	 */
	public static final String $ttl_iv_amt = "ttl_iv_amt";
	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public static final String $ttl_ncv_amt = "ttl_ncv_amt";
	/**
	 * Main body 本体.<p>
	 *
	 */
	public static final String $ttl_base_amt = "ttl_base_amt";
	/**
	 * Freight 運賃.<p>
	 *
	 */
	public static final String $ttl_freight_amt = "ttl_freight_amt";
	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public static final String $ttl_insurance_amt = "ttl_insurance_amt";
	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public static final String $ttl_oth_amt = "ttl_oth_amt";
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
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public static final String $ship_inst_qty = "ship_inst_qty";
	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public static final String $sum_ship_inst_qty = "sum_ship_inst_qty";
	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public static final String $iv_amt = "iv_amt";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Business reason name 業務理由名.<p>
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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public static final String $manual_add_flg = "manual_add_flg";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public static final String $iv_intr_rmrks = "iv_intr_rmrks";
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
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public static final String $iv_d_rmrks = "iv_d_rmrks";
	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public static final String $iv_d_intr_rmrks = "iv_d_intr_rmrks";
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
	 * Shipping order details spare 1 出荷指図明細予備１.<p>
	 *
	 */
	public static final String $ship_inst_d_sub_char1 = "ship_inst_d_sub_char1";
	/**
	 * Shipping order details spare 2 出荷指図明細予備２.<p>
	 *
	 */
	public static final String $ship_inst_d_sub_char2 = "ship_inst_d_sub_char2";
	/**
	 * Shipping order details spare 3 出荷指図明細予備３.<p>
	 *
	 */
	public static final String $ship_inst_d_sub_char3 = "ship_inst_d_sub_char3";
	/**
	 * Shipping result details spare 1 出荷実績明細予備１.<p>
	 *
	 */
	public static final String $ship_act_d_sub_char1 = "ship_act_d_sub_char1";
	/**
	 * Shipping result details spare 2 出荷実績明細予備２.<p>
	 *
	 */
	public static final String $ship_act_d_sub_char2 = "ship_act_d_sub_char2";
	/**
	 * Shipping result details spare 3 出荷実績明細予備３.<p>
	 *
	 */
	public static final String $ship_act_d_sub_char3 = "ship_act_d_sub_char3";
	/**
	 * Invoice shipping result details spare 1 インボイス出荷実績明細予備１.<p>
	 *
	 */
	public static final String $iv_ship_act_d_sub_char1 = "iv_ship_act_d_sub_char1";
	/**
	 * Invoice shipping result details spare 2 インボイス出荷実績明細予備２.<p>
	 *
	 */
	public static final String $iv_ship_act_d_sub_char2 = "iv_ship_act_d_sub_char2";
	/**
	 * Invoice shipping result details spare 3 インボイス出荷実績明細予備３.<p>
	 *
	 */
	public static final String $iv_ship_act_d_sub_char3 = "iv_ship_act_d_sub_char3";
	/**
	 * Sales result details spare 1 売上実績明細予備１.<p>
	 *
	 */
	public static final String $sls_act_d_sub_char1 = "sls_act_d_sub_char1";
	/**
	 * Sales result details spare 2 売上実績明細予備２.<p>
	 *
	 */
	public static final String $sls_act_d_sub_char2 = "sls_act_d_sub_char2";
	/**
	 * Sales result details spare 3 売上実績明細予備３.<p>
	 *
	 */
	public static final String $sls_act_d_sub_char3 = "sls_act_d_sub_char3";
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
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
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
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public static final String $exim_xpns_typ = "exim_xpns_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public static final String $sls_dpt_wg_cd = "sls_dpt_wg_cd";
	/**
	 * Distribution group WG 物流グループのワーキンググループ.<p>
	 *
	 */
	public static final String $lg_grp_wg_cd = "lg_grp_wg_cd";


	public static final MCMeta pl_skip_flg_META = createCommonMeta($pl_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ex_im_comp_flg_META = createCommonMeta($ex_im_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_cmpl_flg_META = createCommonMeta($non_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_ship_flg_META = createCommonMeta($iv_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_prnt_flg_META = createCommonMeta($iv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_prnt_flg_META = createCommonMeta($pl_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_comp_flg_META = createCommonMeta($iv_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta cmpl_schd_dt_META = createCommonMeta($cmpl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_schd_dt_META = createCommonMeta($trd_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cmpl_dt_META = createCommonMeta($cmpl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta tdlv_lg_grp_nm_META = createCommonMeta($tdlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta load_port_nm_META = createCommonMeta($load_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta dschrg_port_nm_META = createCommonMeta($dschrg_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_port_nm_META = createCommonMeta($via_port_nm, mcframe.commonMA.meta.MA_META.PORT_NM);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_trd_cur_amt_META = createCommonMeta($ttl_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_trd_cur_inc_tax_amt_META = createCommonMeta($ttl_trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_net_wt_META = createCommonMeta($ttl_net_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_grss_wt_META = createCommonMeta($ttl_grss_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_dim_META = createCommonMeta($ttl_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta pl_rmrks_META = createCommonMeta($pl_rmrks, mcframe.commonMS.meta.MS_META.PL_RMRKS);
	public static final MCMeta case_mrk1_META = createCommonMeta($case_mrk1, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk2_META = createCommonMeta($case_mrk2, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk3_META = createCommonMeta($case_mrk3, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk4_META = createCommonMeta($case_mrk4, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk5_META = createCommonMeta($case_mrk5, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk6_META = createCommonMeta($case_mrk6, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta pl_reg_flg_META = createCommonMeta($pl_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta pre_rcpt_iv_flg_META = createCommonMeta($pre_rcpt_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_reg_flg_META = createCommonMeta($iv_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_rqst_no_META = createCommonMeta($ship_rqst_no, mcframe.commonMA.meta.MA_META.SHIP_RQST_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_d_no_META = createCommonMeta($ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_loc_nm_META = createCommonMeta($ship_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_str_ln_nm_META = createCommonMeta($ship_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ship_site_cd_META = createCommonMeta($ship_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ship_site_nm_META = createCommonMeta($ship_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta ttl_iv_amt_META = createCommonMeta($ttl_iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_ncv_amt_META = createCommonMeta($ttl_ncv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_base_amt_META = createCommonMeta($ttl_base_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_freight_amt_META = createCommonMeta($ttl_freight_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_insurance_amt_META = createCommonMeta($ttl_insurance_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_oth_amt_META = createCommonMeta($ttl_oth_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_inst_qty_META = createCommonMeta($ship_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_ship_inst_qty_META = createCommonMeta($sum_ship_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_amt_META = createCommonMeta($iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta manual_add_flg_META = createCommonMeta($manual_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta iv_intr_rmrks_META = createCommonMeta($iv_intr_rmrks, mcframe.commonMS.meta.MS_META.IV_INTR_RMRKS);
	public static final MCMeta iv_sub_char1_META = createCommonMeta($iv_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_sub_char2_META = createCommonMeta($iv_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_sub_char3_META = createCommonMeta($iv_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta iv_d_rmrks_META = createCommonMeta($iv_d_rmrks, mcframe.commonMS.meta.MS_META.IV_D_RMRKS);
	public static final MCMeta iv_d_intr_rmrks_META = createCommonMeta($iv_d_intr_rmrks, mcframe.commonMS.meta.MS_META.IV_D_INTR_D_RMRKS);
	public static final MCMeta iv_d_sub_char1_META = createCommonMeta($iv_d_sub_char1, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR1);
	public static final MCMeta iv_d_sub_char2_META = createCommonMeta($iv_d_sub_char2, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR2);
	public static final MCMeta iv_d_sub_char3_META = createCommonMeta($iv_d_sub_char3, mcframe.commonMS.meta.MS_META.IV_D_SUB_CHAR3);
	public static final MCMeta ship_inst_d_sub_char1_META = createCommonMeta($ship_inst_d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR1);
	public static final MCMeta ship_inst_d_sub_char2_META = createCommonMeta($ship_inst_d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR2);
	public static final MCMeta ship_inst_d_sub_char3_META = createCommonMeta($ship_inst_d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR3);
	public static final MCMeta ship_act_d_sub_char1_META = createCommonMeta($ship_act_d_sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR1);
	public static final MCMeta ship_act_d_sub_char2_META = createCommonMeta($ship_act_d_sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR2);
	public static final MCMeta ship_act_d_sub_char3_META = createCommonMeta($ship_act_d_sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_D_SUB_CHAR3);
	public static final MCMeta iv_ship_act_d_sub_char1_META = createCommonMeta($iv_ship_act_d_sub_char1, mcframe.commonMS.meta.MS_META.IV_SHIP_ACT_D_SUB_CHAR1);
	public static final MCMeta iv_ship_act_d_sub_char2_META = createCommonMeta($iv_ship_act_d_sub_char2, mcframe.commonMS.meta.MS_META.IV_SHIP_ACT_D_SUB_CHAR2);
	public static final MCMeta iv_ship_act_d_sub_char3_META = createCommonMeta($iv_ship_act_d_sub_char3, mcframe.commonMS.meta.MS_META.IV_SHIP_ACT_D_SUB_CHAR3);
	public static final MCMeta sls_act_d_sub_char1_META = createCommonMeta($sls_act_d_sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR1);
	public static final MCMeta sls_act_d_sub_char2_META = createCommonMeta($sls_act_d_sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR2);
	public static final MCMeta sls_act_d_sub_char3_META = createCommonMeta($sls_act_d_sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR3);
	public static final MCMeta ship_rqst_id_grp_cd1_META = createCommonMeta($ship_rqst_id_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm1_META = createCommonMeta($ship_rqst_id_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd2_META = createCommonMeta($ship_rqst_id_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm2_META = createCommonMeta($ship_rqst_id_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd3_META = createCommonMeta($ship_rqst_id_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm3_META = createCommonMeta($ship_rqst_id_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd4_META = createCommonMeta($ship_rqst_id_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm4_META = createCommonMeta($ship_rqst_id_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd5_META = createCommonMeta($ship_rqst_id_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm5_META = createCommonMeta($ship_rqst_id_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd6_META = createCommonMeta($ship_rqst_id_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm6_META = createCommonMeta($ship_rqst_id_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd7_META = createCommonMeta($ship_rqst_id_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm7_META = createCommonMeta($ship_rqst_id_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd8_META = createCommonMeta($ship_rqst_id_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm8_META = createCommonMeta($ship_rqst_id_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd9_META = createCommonMeta($ship_rqst_id_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm9_META = createCommonMeta($ship_rqst_id_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ship_rqst_id_grp_cd10_META = createCommonMeta($ship_rqst_id_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta ship_rqst_id_grp_nm10_META = createCommonMeta($ship_rqst_id_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd1_META = createCommonMeta($dlv_id_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm1_META = createCommonMeta($dlv_id_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd2_META = createCommonMeta($dlv_id_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm2_META = createCommonMeta($dlv_id_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd3_META = createCommonMeta($dlv_id_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm3_META = createCommonMeta($dlv_id_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd4_META = createCommonMeta($dlv_id_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm4_META = createCommonMeta($dlv_id_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd5_META = createCommonMeta($dlv_id_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm5_META = createCommonMeta($dlv_id_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd6_META = createCommonMeta($dlv_id_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm6_META = createCommonMeta($dlv_id_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd7_META = createCommonMeta($dlv_id_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm7_META = createCommonMeta($dlv_id_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd8_META = createCommonMeta($dlv_id_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm8_META = createCommonMeta($dlv_id_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd9_META = createCommonMeta($dlv_id_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm9_META = createCommonMeta($dlv_id_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_id_grp_cd10_META = createCommonMeta($dlv_id_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_id_grp_nm10_META = createCommonMeta($dlv_id_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exim_xpns_typ_META = createCommonMeta($exim_xpns_typ, mcframe.commonMA.meta.MA_META.EXIM_XPNS_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta sls_dpt_wg_cd_META = createCommonMeta($sls_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta lg_grp_wg_cd_META = createCommonMeta($lg_grp_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pl_skip_flg_META,
			ex_im_comp_flg_META,
			non_cmpl_flg_META,
			iv_ship_flg_META,
			iv_prnt_flg_META,
			pl_prnt_flg_META,
			iv_comp_flg_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			iv_no_META,
			iv_rev_META,
			iv_d_no_META,
			iv_mng_no_META,
			cmpl_schd_dt_META,
			trd_schd_dt_META,
			cmpl_dt_META,
			iv_dt_META,
			sls_cststk_flg_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_sundry_flg_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_sundry_flg_META,
			tdlv_lg_grp_cd_META,
			tdlv_lg_grp_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			trnspt_cd_META,
			trnspt_nm_META,
			vssl_flght_META,
			load_port_cd_META,
			load_port_nm_META,
			etd_dt_META,
			dschrg_port_cd_META,
			dschrg_port_nm_META,
			eta_dt_META,
			via_port_cd_META,
			via_port_nm_META,
			via_schd_dt_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			ttl_trd_cur_amt_META,
			ttl_trd_cur_inc_tax_amt_META,
			ttl_net_wt_META,
			ttl_grss_wt_META,
			ttl_dim_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			pl_rmrks_META,
			case_mrk1_META,
			case_mrk2_META,
			case_mrk3_META,
			case_mrk4_META,
			case_mrk5_META,
			case_mrk6_META,
			bill_basis_dt_META,
			rcv_schd_dt_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META,
			iv_rmrks_META,
			pl_reg_flg_META,
			rcpt_iv_no_META,
			pre_rcpt_iv_flg_META,
			iv_reg_flg_META,
			rcpt_iv_mng_no_META,
			purc_schd_no_META,
			purc_cmpl_flg_META,
			can_flg_META,
			trd_cd_META,
			trd_nm_META,
			slo_no_META,
			ship_rqst_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			ship_inst_no_META,
			ship_inst_d_no_META,
			ship_act_no_META,
			ship_act_d_no_META,
			sls_act_no_META,
			sls_act_d_no_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			bndl_flg_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			gd_cd_META,
			gd_nm_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			ship_loc_cd_META,
			ship_loc_nm_META,
			ship_str_ln_cd_META,
			ship_str_ln_nm_META,
			ship_site_cd_META,
			ship_site_nm_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			ttl_iv_amt_META,
			ttl_ncv_amt_META,
			ttl_base_amt_META,
			ttl_freight_amt_META,
			ttl_insurance_amt_META,
			ttl_oth_amt_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_META,
			ship_inst_qty_META,
			sum_ship_inst_qty_META,
			ship_act_qty_META,
			sls_qty_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			iv_upri_META,
			iv_amt_META,
			ptax_cur_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			rsn_cd_META,
			rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			manual_add_flg_META,
			io_schd_pr_no_META,
			iv_intr_rmrks_META,
			iv_sub_char1_META,
			iv_sub_char2_META,
			iv_sub_char3_META,
			iv_d_rmrks_META,
			iv_d_intr_rmrks_META,
			iv_d_sub_char1_META,
			iv_d_sub_char2_META,
			iv_d_sub_char3_META,
			ship_inst_d_sub_char1_META,
			ship_inst_d_sub_char2_META,
			ship_inst_d_sub_char3_META,
			ship_act_d_sub_char1_META,
			ship_act_d_sub_char2_META,
			ship_act_d_sub_char3_META,
			iv_ship_act_d_sub_char1_META,
			iv_ship_act_d_sub_char2_META,
			iv_ship_act_d_sub_char3_META,
			sls_act_d_sub_char1_META,
			sls_act_d_sub_char2_META,
			sls_act_d_sub_char3_META,
			ship_rqst_id_grp_cd1_META,
			ship_rqst_id_grp_nm1_META,
			ship_rqst_id_grp_cd2_META,
			ship_rqst_id_grp_nm2_META,
			ship_rqst_id_grp_cd3_META,
			ship_rqst_id_grp_nm3_META,
			ship_rqst_id_grp_cd4_META,
			ship_rqst_id_grp_nm4_META,
			ship_rqst_id_grp_cd5_META,
			ship_rqst_id_grp_nm5_META,
			ship_rqst_id_grp_cd6_META,
			ship_rqst_id_grp_nm6_META,
			ship_rqst_id_grp_cd7_META,
			ship_rqst_id_grp_nm7_META,
			ship_rqst_id_grp_cd8_META,
			ship_rqst_id_grp_nm8_META,
			ship_rqst_id_grp_cd9_META,
			ship_rqst_id_grp_nm9_META,
			ship_rqst_id_grp_cd10_META,
			ship_rqst_id_grp_nm10_META,
			dlv_id_grp_cd1_META,
			dlv_id_grp_nm1_META,
			dlv_id_grp_cd2_META,
			dlv_id_grp_nm2_META,
			dlv_id_grp_cd3_META,
			dlv_id_grp_nm3_META,
			dlv_id_grp_cd4_META,
			dlv_id_grp_nm4_META,
			dlv_id_grp_cd5_META,
			dlv_id_grp_nm5_META,
			dlv_id_grp_cd6_META,
			dlv_id_grp_nm6_META,
			dlv_id_grp_cd7_META,
			dlv_id_grp_nm7_META,
			dlv_id_grp_cd8_META,
			dlv_id_grp_nm8_META,
			dlv_id_grp_cd9_META,
			dlv_id_grp_nm9_META,
			dlv_id_grp_cd10_META,
			dlv_id_grp_nm10_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			trd_unit_dec_place_META,
			base_unit_dec_place_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			ptax_cur_amt_dec_place_META,
			dscnt_itm_flg_META,
			exim_xpns_typ_META,
			trd_ptn_typ_META,
			sls_dpt_wg_cd_META,
			lg_grp_wg_cd_META
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
				{$pr_sts_typ, "MSC_IV_PR_STS_TYP"},	// pr_sts_typ
				{$dlv_id_typ, "MSC_DLV_ID_TYP"},	// dlv_id_typ
				{$ship_rqst_id_typ, "MSC_SHIP_RQST_ID_TYP"},	// ship_rqst_id_typ
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_insp_typ, "MSC_STK_INSP_TYP"}	// stk_insp_typ
			}
		)),
		new MCExtMap.Entry($$TRIM_Dtl_COL, new MCExtList(
			new String[][]{
				{$iv_d_no, "E"},	// iv_d_no
				{$purc_schd_no, "E"},	// purc_schd_no
				{$trd_cd, "E"},	// trd_cd
				{$trd_nm, "E"},	// trd_nm
				{$slo_no, "E"},	// slo_no
				{$ship_rqst_no, "E"},	// ship_rqst_no
				{$cst_po_no, "E"},	// cst_po_no
				{$cst_po_d_no, "E"},	// cst_po_d_no
				{$ship_inst_no, "E"},	// ship_inst_no
				{$ship_inst_d_no, "E"},	// ship_inst_d_no
				{$ship_act_no, "E"},	// ship_act_no
				{$ship_act_d_no, "E"},	// ship_act_d_no
				{$sls_act_no, "E"},	// sls_act_no
				{$sls_act_d_no, "E"},	// sls_act_d_no
				{$dlv_rqst_dt, "E"},	// dlv_rqst_dt
				{$dlv_rqst_hm, "E"},	// dlv_rqst_hm
				{$bndl_flg, "E"},	// bndl_flg
				{$itm_typ, "E"},	// itm_typ
				{$itm_typ_nm, "E"},	// itm_typ_nm
				{$itm_typ_d_cd, "E"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "E"},	// itm_typ_d_nm
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$itm_nm, "E"},	// itm_nm
				{$iv_itm_nm, "E"},	// iv_itm_nm
				{$sundry_itm_flg, "E"},	// sundry_itm_flg
				{$cntry_org_cd, "E"},	// cntry_org_cd
				{$cntry_org_nm, "E"},	// cntry_org_nm
				{$sno1, "E"},	// sno1
				{$sno2, "E"},	// sno2
				{$sno3, "E"},	// sno3
				{$sno4, "E"},	// sno4
				{$wrk_no, "E"},	// wrk_no
				{$wrk_nm, "E"},	// wrk_nm
				{$cst_itm_cd, "E"},	// cst_itm_cd
				{$cst_itm_nm, "E"},	// cst_itm_nm
				{$gd_cd, "E"},	// gd_cd
				{$gd_nm, "E"},	// gd_nm
				{$ship_fr_lg_grp_cd, "E"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "E"},	// ship_fr_lg_grp_nm
				{$ship_loc_cd, "E"},	// ship_loc_cd
				{$ship_loc_nm, "E"},	// ship_loc_nm
				{$ship_str_ln_cd, "E"},	// ship_str_ln_cd
				{$ship_str_ln_nm, "E"},	// ship_str_ln_nm
				{$ship_site_cd, "E"},	// ship_site_cd
				{$ship_site_nm, "E"},	// ship_site_nm
				{$lot_no, "E"},	// lot_no
				{$sublot_no, "E"},	// sublot_no
				{$ver_no, "E"},	// ver_no
				{$stk_arrv_bp_cd, "E"},	// stk_arrv_bp_cd
				{$stk_arrv_bp_nm, "E"},	// stk_arrv_bp_nm
				{$stk_id_typ, "E"},	// stk_id_typ
				{$stk_id_typ_nm, "E"},	// stk_id_typ_nm
				{$stk_bp_cd, "E"},	// stk_bp_cd
				{$stk_bp_nm, "E"},	// stk_bp_nm
				{$quality_typ, "E"},	// quality_typ
				{$quality_typ_nm, "E"},	// quality_typ_nm
				{$stk_insp_typ, "E"},	// stk_insp_typ
				{$stk_insp_typ_nm, "E"},	// stk_insp_typ_nm
				{$trd_unit_cd, "E"},	// trd_unit_cd
				{$trd_unit_nm, "E"},	// trd_unit_nm
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$base_unit_cd, "E"},	// base_unit_cd
				{$base_unit_nm, "E"},	// base_unit_nm
				{$base_unit_qty, "E"},	// base_unit_qty
				{$ship_inst_qty, "E"},	// ship_inst_qty
				{$sum_ship_inst_qty, "E"},	// sum_ship_inst_qty
				{$ship_act_qty, "E"},	// ship_act_qty
				{$sls_qty, "E"},	// sls_qty
				{$trd_cur_upri, "E"},	// trd_cur_upri
				{$trd_cur_amt, "E"},	// trd_cur_amt
				{$trd_cur_inc_tax_amt, "E"},	// trd_cur_inc_tax_amt
				{$tax_cd, "E"},	// tax_cd
				{$tax_nm, "E"},	// tax_nm
				{$tax_rate, "E"},	// tax_rate
				{$trd_cur_tax_amt, "E"},	// trd_cur_tax_amt
				{$trd_cur_dscnt_amt, "E"},	// trd_cur_dscnt_amt
				{$dscnt_rsn_cd, "E"},	// dscnt_rsn_cd
				{$dscnt_rsn_nm, "E"},	// dscnt_rsn_nm
				{$iv_upri, "E"},	// iv_upri
				{$iv_amt, "E"},	// iv_amt
				{$ptax_cur_amt, "E"},	// ptax_cur_amt
				{$wtax_rate, "E"},	// wtax_rate
				{$wtax_amt, "E"},	// wtax_amt
				{$rsn_cd, "E"},	// rsn_cd
				{$rsn_nm, "E"},	// rsn_nm
				{$bd_dpt_cd, "E"},	// bd_dpt_cd
				{$bd_dpt_nm, "E"},	// bd_dpt_nm
				{$sls_usr_cd, "E"},	// sls_usr_cd
				{$sls_usr_nm, "E"},	// sls_usr_nm
				{$sls_dpt_cd, "E"},	// sls_dpt_cd
				{$sls_dpt_nm, "E"},	// sls_dpt_nm
				{$ar_dpt_cd, "E"},	// ar_dpt_cd
				{$ar_dpt_nm, "E"},	// ar_dpt_nm
				{$manual_add_flg, "E"},	// manual_add_flg
				{$io_schd_pr_no, "E"},	// io_schd_pr_no
				{$iv_d_rmrks, "E"},	// iv_d_rmrks
				{$iv_d_intr_rmrks, "E"},	// iv_d_intr_rmrks
				{$iv_d_sub_char1, "E"},	// iv_d_sub_char1
				{$iv_d_sub_char2, "E"},	// iv_d_sub_char2
				{$iv_d_sub_char3, "E"},	// iv_d_sub_char3
				{$ship_inst_d_sub_char1, "E"},	// ship_inst_d_sub_char1
				{$ship_inst_d_sub_char2, "E"},	// ship_inst_d_sub_char2
				{$ship_inst_d_sub_char3, "E"},	// ship_inst_d_sub_char3
				{$ship_act_d_sub_char1, "E"},	// ship_act_d_sub_char1
				{$ship_act_d_sub_char2, "E"},	// ship_act_d_sub_char2
				{$ship_act_d_sub_char3, "E"},	// ship_act_d_sub_char3
				{$iv_ship_act_d_sub_char1, "E"},	// iv_ship_act_d_sub_char1
				{$iv_ship_act_d_sub_char2, "E"},	// iv_ship_act_d_sub_char2
				{$iv_ship_act_d_sub_char3, "E"},	// iv_ship_act_d_sub_char3
				{$sls_act_d_sub_char1, "E"},	// sls_act_d_sub_char1
				{$sls_act_d_sub_char2, "E"},	// sls_act_d_sub_char2
				{$sls_act_d_sub_char3, "E"},	// sls_act_d_sub_char3
				{$itm_grp_cd1, "E"},	// itm_grp_cd1
				{$itm_grp_nm1, "E"},	// itm_grp_nm1
				{$itm_grp_cd2, "E"},	// itm_grp_cd2
				{$itm_grp_nm2, "E"},	// itm_grp_nm2
				{$itm_grp_cd3, "E"},	// itm_grp_cd3
				{$itm_grp_nm3, "E"},	// itm_grp_nm3
				{$itm_grp_cd4, "E"},	// itm_grp_cd4
				{$itm_grp_nm4, "E"},	// itm_grp_nm4
				{$itm_grp_cd5, "E"},	// itm_grp_cd5
				{$itm_grp_nm5, "E"},	// itm_grp_nm5
				{$itm_grp_cd6, "E"},	// itm_grp_cd6
				{$itm_grp_nm6, "E"},	// itm_grp_nm6
				{$itm_grp_cd7, "E"},	// itm_grp_cd7
				{$itm_grp_nm7, "E"},	// itm_grp_nm7
				{$itm_grp_cd8, "E"},	// itm_grp_cd8
				{$itm_grp_nm8, "E"},	// itm_grp_nm8
				{$itm_grp_cd9, "E"},	// itm_grp_cd9
				{$itm_grp_nm9, "E"},	// itm_grp_nm9
				{$itm_grp_cd10, "E"},	// itm_grp_cd10
				{$itm_grp_nm10, "E"}	// itm_grp_nm10
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return getConstBoolean(offset + 0, $pl_skip_flg);
	}

	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		setConstBoolean(offset + 0, $pl_skip_flg, value);
	}


	/**
	 * Exported 輸出済.<p>
	 *
	 */
	public boolean ex_im_comp_flg() {
		return getConstBoolean(offset + 1, $ex_im_comp_flg);
	}

	/**
	 * Exported 輸出済.<p>
	 *
	 */
	public void ex_im_comp_flg(boolean value) {
		setConstBoolean(offset + 1, $ex_im_comp_flg, value);
	}


	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public boolean non_cmpl_flg() {
		return getConstBoolean(offset + 2, $non_cmpl_flg);
	}

	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public void non_cmpl_flg(boolean value) {
		setConstBoolean(offset + 2, $non_cmpl_flg, value);
	}


	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public boolean iv_ship_flg() {
		return getConstBoolean(offset + 3, $iv_ship_flg);
	}

	/**
	 * Invoice unit shipping インボイス単位出荷.<p>
	 *
	 */
	public void iv_ship_flg(boolean value) {
		setConstBoolean(offset + 3, $iv_ship_flg, value);
	}


	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public boolean iv_prnt_flg() {
		return getConstBoolean(offset + 4, $iv_prnt_flg);
	}

	/**
	 * Invoice issued インボイス発行済.<p>
	 *
	 */
	public void iv_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $iv_prnt_flg, value);
	}


	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public boolean pl_prnt_flg() {
		return getConstBoolean(offset + 5, $pl_prnt_flg);
	}

	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public void pl_prnt_flg(boolean value) {
		setConstBoolean(offset + 5, $pl_prnt_flg, value);
	}


	/**
	 * Invoice transaction completed インボイス取引完了.<p>
	 *
	 */
	public boolean iv_comp_flg() {
		return getConstBoolean(offset + 6, $iv_comp_flg);
	}

	/**
	 * Invoice transaction completed インボイス取引完了.<p>
	 *
	 */
	public void iv_comp_flg(boolean value) {
		setConstBoolean(offset + 6, $iv_comp_flg, value);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 7, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 7, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 8, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 8, $pr_sts_typ_nm, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 9, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 9, $iv_no, value);
	}


	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 10, $iv_rev);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 10, $iv_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 10, $iv_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 10, $iv_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 10, $iv_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 10, $iv_rev, value);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 11, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 11, $iv_d_no, value);
	}


	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 12, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 12, $iv_mng_no, value);
	}


	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCDate cmpl_schd_dt() {
		return getConstDate(offset + 13, $cmpl_schd_dt);
	}

	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public void cmpl_schd_dt(MCDate value) {
		setConstDate(offset + 13, $cmpl_schd_dt, value);
	}


	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public MCDate trd_schd_dt() {
		return getConstDate(offset + 14, $trd_schd_dt);
	}

	/**
	 * Scheduled transaction date 取引予定日.<p>
	 *
	 */
	public void trd_schd_dt(MCDate value) {
		setConstDate(offset + 14, $trd_schd_dt, value);
	}


	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return getConstDate(offset + 15, $cmpl_dt);
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		setConstDate(offset + 15, $cmpl_dt, value);
	}


	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 16, $iv_dt);
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 16, $iv_dt, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 17, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 17, $sls_cststk_flg, value);
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
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 22, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 22, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 23, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 23, $dlv_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 24, $dlv_cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 24, $dlv_cntry_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 25, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 25, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 26, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 26, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 27, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 27, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 28, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 28, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 29, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 29, $dlv_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 30, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 30, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 31, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 31, $dlv_fax, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 32, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 32, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 33, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 33, $dlv_cntct_psn, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 34, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 34, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 35, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 35, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 36, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 36, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 37, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 37, $ship_rqst_id_nm, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 38, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 38, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 39, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 39, $via_dlv_typ_nm, value);
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
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 42, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 42, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 43, $tdlv_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 43, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public String tdlv_lg_grp_nm() {
		return getConstString(offset + 44, $tdlv_lg_grp_nm);
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public void tdlv_lg_grp_nm(String value) {
		setConstString(offset + 44, $tdlv_lg_grp_nm, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 45, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 45, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 46, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 46, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 47, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 47, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 48, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 48, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 49, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 49, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 50, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 50, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 51, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 51, $tdlv_fax, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 52, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 52, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 53, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 53, $tdlv_cntct_psn, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 54, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 54, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 55, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 55, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 56, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 56, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 57, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 57, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 58, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 58, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 59, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 59, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 60, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 60, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 61, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 61, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 62, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 62, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 63, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 63, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 64, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 64, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 65, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 65, $via_schd_dt, value);
	}


	/**
	 * Transaction terms 取引条件.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 66, $tterm_cd1);
	}

	/**
	 * Transaction terms 取引条件.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 66, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 取引条件名.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 67, $tterm_nm1);
	}

	/**
	 * Transaction terms name 取引条件名.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 67, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 68, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 68, $tterm_rmrks1, value);
	}


	/**
	 * Delivery location 受渡場所.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 69, $tterm_cd2);
	}

	/**
	 * Delivery location 受渡場所.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 69, $tterm_cd2, value);
	}


	/**
	 * Delivery location name 受渡場所名.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 70, $tterm_nm2);
	}

	/**
	 * Delivery location name 受渡場所名.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 70, $tterm_nm2, value);
	}


	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 71, $tterm_rmrks2);
	}

	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 71, $tterm_rmrks2, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 72, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 72, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 73, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 73, $trd_cur_nm, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 74, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 74, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 75, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 75, $ptax_cur_nm, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 76, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 76, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 77, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 77, $xrate, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 78, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 78, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 79, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}


	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return getConstNumber(offset + 80, $ttl_trd_cur_amt);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 80, $ttl_trd_cur_amt, value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		setConstNumber(offset + 80, $ttl_trd_cur_amt, value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		setConstNumber(offset + 80, $ttl_trd_cur_amt, value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		setConstNumber(offset + 80, $ttl_trd_cur_amt, value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		setConstNumber(offset + 80, $ttl_trd_cur_amt, value);
	}


	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt);
	}

	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt, value);
	}

	/**
	 * Total tax included amount (Transaction currency) 取引通貨税込金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 81, $ttl_trd_cur_inc_tax_amt, value);
	}


	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public MCNumber ttl_net_wt() {
		return getConstNumber(offset + 82, $ttl_net_wt);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(MCNumber value) {
		setConstNumber(offset + 82, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(int value) {
		setConstNumber(offset + 82, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(long value) {
		setConstNumber(offset + 82, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(float value) {
		setConstNumber(offset + 82, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(double value) {
		setConstNumber(offset + 82, $ttl_net_wt, value);
	}


	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public MCNumber ttl_grss_wt() {
		return getConstNumber(offset + 83, $ttl_grss_wt);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(MCNumber value) {
		setConstNumber(offset + 83, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(int value) {
		setConstNumber(offset + 83, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(long value) {
		setConstNumber(offset + 83, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(float value) {
		setConstNumber(offset + 83, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(double value) {
		setConstNumber(offset + 83, $ttl_grss_wt, value);
	}


	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public MCNumber ttl_dim() {
		return getConstNumber(offset + 84, $ttl_dim);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(MCNumber value) {
		setConstNumber(offset + 84, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(int value) {
		setConstNumber(offset + 84, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(long value) {
		setConstNumber(offset + 84, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(float value) {
		setConstNumber(offset + 84, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(double value) {
		setConstNumber(offset + 84, $ttl_dim, value);
	}


	/**
	 * Payment terms 支払条件.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 85, $tterm_cd3);
	}

	/**
	 * Payment terms 支払条件.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 85, $tterm_cd3, value);
	}


	/**
	 * Payment terms name 支払条件名.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 86, $tterm_nm3);
	}

	/**
	 * Payment terms name 支払条件名.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 86, $tterm_nm3, value);
	}


	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 87, $tterm_rmrks3);
	}

	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 87, $tterm_rmrks3, value);
	}


	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public String pl_rmrks() {
		return getConstString(offset + 88, $pl_rmrks);
	}

	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		setConstString(offset + 88, $pl_rmrks, value);
	}


	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 89, $case_mrk1);
	}

	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 89, $case_mrk1, value);
	}


	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 90, $case_mrk2);
	}

	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 90, $case_mrk2, value);
	}


	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 91, $case_mrk3);
	}

	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 91, $case_mrk3, value);
	}


	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 92, $case_mrk4);
	}

	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 92, $case_mrk4, value);
	}


	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 93, $case_mrk5);
	}

	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 93, $case_mrk5, value);
	}


	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 94, $case_mrk6);
	}

	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 94, $case_mrk6, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 95, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 95, $bill_basis_dt, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 96, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 96, $rcv_schd_dt, value);
	}


	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 97, $lc_no);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 97, $lc_no, value);
	}


	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 98, $lc_dt);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 98, $lc_dt, value);
	}


	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 99, $lc_rmrks);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 99, $lc_rmrks, value);
	}


	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 100, $bl_no);
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 100, $bl_no, value);
	}


	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 101, $bl_dt);
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 101, $bl_dt, value);
	}


	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 102, $bl_rmrks);
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 102, $bl_rmrks, value);
	}


	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 103, $iv_rmrks);
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 103, $iv_rmrks, value);
	}


	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public boolean pl_reg_flg() {
		return getConstBoolean(offset + 104, $pl_reg_flg);
	}

	/**
	 * Packing list entered パッキングリスト登録済.<p>
	 *
	 */
	public void pl_reg_flg(boolean value) {
		setConstBoolean(offset + 104, $pl_reg_flg, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 105, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 105, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice temporary entry 受領インボイス仮登録.<p>
	 *
	 */
	public boolean pre_rcpt_iv_flg() {
		return getConstBoolean(offset + 106, $pre_rcpt_iv_flg);
	}

	/**
	 * Purchase invoice temporary entry 受領インボイス仮登録.<p>
	 *
	 */
	public void pre_rcpt_iv_flg(boolean value) {
		setConstBoolean(offset + 106, $pre_rcpt_iv_flg, value);
	}


	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public boolean iv_reg_flg() {
		return getConstBoolean(offset + 107, $iv_reg_flg);
	}

	/**
	 * Invoice entered インボイス登録済.<p>
	 *
	 */
	public void iv_reg_flg(boolean value) {
		setConstBoolean(offset + 107, $iv_reg_flg, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 108, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 108, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 109, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 109, $purc_schd_no, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 110, $purc_cmpl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 110, $purc_cmpl_flg, value);
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


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 112, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 112, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 113, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 113, $trd_nm, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 114, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 114, $slo_no, value);
	}


	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public String ship_rqst_no() {
		return getConstString(offset + 115, $ship_rqst_no);
	}

	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public void ship_rqst_no(String value) {
		setConstString(offset + 115, $ship_rqst_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 116, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 116, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 117, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 117, $cst_po_d_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 118, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 118, $ship_inst_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 119, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 119, $ship_inst_d_no, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 120, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 120, $ship_act_no, value);
	}


	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return getConstString(offset + 121, $ship_act_d_no);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		setConstString(offset + 121, $ship_act_d_no, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 122, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 122, $sls_act_no, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 123, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 123, $sls_act_d_no, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 124, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 124, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 125, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 125, $dlv_rqst_hm, value);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 126, $bndl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 126, $bndl_flg, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 127, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 127, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 128, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 128, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 129, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 129, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 130, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 130, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 131, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 131, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 132, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 132, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 133, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 133, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 134, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 134, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 135, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 135, $itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 136, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 136, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 137, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 137, $sundry_itm_flg, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 138, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 138, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 139, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 139, $cntry_org_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 140, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 140, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 141, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 141, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 142, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 142, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 143, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 143, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 144, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 144, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 145, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 145, $wrk_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 146, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 146, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 147, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 147, $cst_itm_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 148, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 148, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 149, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 149, $gd_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 150, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 150, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 151, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 151, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 152, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 152, $ship_loc_cd, value);
	}


	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public String ship_loc_nm() {
		return getConstString(offset + 153, $ship_loc_nm);
	}

	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public void ship_loc_nm(String value) {
		setConstString(offset + 153, $ship_loc_nm, value);
	}


	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 154, $ship_str_ln_cd);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 154, $ship_str_ln_cd, value);
	}


	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public String ship_str_ln_nm() {
		return getConstString(offset + 155, $ship_str_ln_nm);
	}

	/**
	 * Shipping rack/line name 出荷棚・ライン名.<p>
	 *
	 */
	public void ship_str_ln_nm(String value) {
		setConstString(offset + 155, $ship_str_ln_nm, value);
	}


	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String ship_site_cd() {
		return getConstString(offset + 156, $ship_site_cd);
	}

	/**
	 * Shipping factory/distribution warehouse cd. 出荷工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void ship_site_cd(String value) {
		setConstString(offset + 156, $ship_site_cd, value);
	}


	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public String ship_site_nm() {
		return getConstString(offset + 157, $ship_site_nm);
	}

	/**
	 * Shipping factory/distribution warehouse name 出荷工場・物流倉庫名.<p>
	 *
	 */
	public void ship_site_nm(String value) {
		setConstString(offset + 157, $ship_site_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 158, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 158, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 159, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 159, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 160, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 160, $ver_no, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 161, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 161, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 162, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 162, $stk_arrv_bp_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 163, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 163, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 164, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 164, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 165, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 165, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 166, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 166, $stk_bp_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 167, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 167, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 168, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 168, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 169, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 169, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 170, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 170, $stk_insp_typ_nm, value);
	}


	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public MCNumber ttl_iv_amt() {
		return getConstNumber(offset + 171, $ttl_iv_amt);
	}

	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public void ttl_iv_amt(MCNumber value) {
		setConstNumber(offset + 171, $ttl_iv_amt, value);
	}

	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public void ttl_iv_amt(int value) {
		setConstNumber(offset + 171, $ttl_iv_amt, value);
	}

	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public void ttl_iv_amt(long value) {
		setConstNumber(offset + 171, $ttl_iv_amt, value);
	}

	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public void ttl_iv_amt(float value) {
		setConstNumber(offset + 171, $ttl_iv_amt, value);
	}

	/**
	 * Invoice total インボイス計.<p>
	 *
	 */
	public void ttl_iv_amt(double value) {
		setConstNumber(offset + 171, $ttl_iv_amt, value);
	}


	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public MCNumber ttl_ncv_amt() {
		return getConstNumber(offset + 172, $ttl_ncv_amt);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(MCNumber value) {
		setConstNumber(offset + 172, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(int value) {
		setConstNumber(offset + 172, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(long value) {
		setConstNumber(offset + 172, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(float value) {
		setConstNumber(offset + 172, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(double value) {
		setConstNumber(offset + 172, $ttl_ncv_amt, value);
	}


	/**
	 * Main body 本体.<p>
	 *
	 */
	public MCNumber ttl_base_amt() {
		return getConstNumber(offset + 173, $ttl_base_amt);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(MCNumber value) {
		setConstNumber(offset + 173, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(int value) {
		setConstNumber(offset + 173, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(long value) {
		setConstNumber(offset + 173, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(float value) {
		setConstNumber(offset + 173, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(double value) {
		setConstNumber(offset + 173, $ttl_base_amt, value);
	}


	/**
	 * Freight 運賃.<p>
	 *
	 */
	public MCNumber ttl_freight_amt() {
		return getConstNumber(offset + 174, $ttl_freight_amt);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(MCNumber value) {
		setConstNumber(offset + 174, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(int value) {
		setConstNumber(offset + 174, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(long value) {
		setConstNumber(offset + 174, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(float value) {
		setConstNumber(offset + 174, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(double value) {
		setConstNumber(offset + 174, $ttl_freight_amt, value);
	}


	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public MCNumber ttl_insurance_amt() {
		return getConstNumber(offset + 175, $ttl_insurance_amt);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(MCNumber value) {
		setConstNumber(offset + 175, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(int value) {
		setConstNumber(offset + 175, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(long value) {
		setConstNumber(offset + 175, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(float value) {
		setConstNumber(offset + 175, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(double value) {
		setConstNumber(offset + 175, $ttl_insurance_amt, value);
	}


	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public MCNumber ttl_oth_amt() {
		return getConstNumber(offset + 176, $ttl_oth_amt);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_oth_amt(MCNumber value) {
		setConstNumber(offset + 176, $ttl_oth_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_oth_amt(int value) {
		setConstNumber(offset + 176, $ttl_oth_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_oth_amt(long value) {
		setConstNumber(offset + 176, $ttl_oth_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_oth_amt(float value) {
		setConstNumber(offset + 176, $ttl_oth_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_oth_amt(double value) {
		setConstNumber(offset + 176, $ttl_oth_amt, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 177, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 177, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 178, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 178, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 179, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 179, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 179, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 179, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 179, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 179, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 180, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 180, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 181, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 181, $base_unit_nm, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 182, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 182, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 182, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 182, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 182, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 182, $base_unit_qty, value);
	}


	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public MCNumber ship_inst_qty() {
		return getConstNumber(offset + 183, $ship_inst_qty);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void ship_inst_qty(MCNumber value) {
		setConstNumber(offset + 183, $ship_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void ship_inst_qty(int value) {
		setConstNumber(offset + 183, $ship_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void ship_inst_qty(long value) {
		setConstNumber(offset + 183, $ship_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void ship_inst_qty(float value) {
		setConstNumber(offset + 183, $ship_inst_qty, value);
	}

	/**
	 * Order qty. 指図数量.<p>
	 *
	 */
	public void ship_inst_qty(double value) {
		setConstNumber(offset + 183, $ship_inst_qty, value);
	}


	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public MCNumber sum_ship_inst_qty() {
		return getConstNumber(offset + 184, $sum_ship_inst_qty);
	}

	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public void sum_ship_inst_qty(MCNumber value) {
		setConstNumber(offset + 184, $sum_ship_inst_qty, value);
	}

	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public void sum_ship_inst_qty(int value) {
		setConstNumber(offset + 184, $sum_ship_inst_qty, value);
	}

	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public void sum_ship_inst_qty(long value) {
		setConstNumber(offset + 184, $sum_ship_inst_qty, value);
	}

	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public void sum_ship_inst_qty(float value) {
		setConstNumber(offset + 184, $sum_ship_inst_qty, value);
	}

	/**
	 * Total order qty. 合計指図数量.<p>
	 *
	 */
	public void sum_ship_inst_qty(double value) {
		setConstNumber(offset + 184, $sum_ship_inst_qty, value);
	}


	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 185, $ship_act_qty);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 185, $ship_act_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 185, $ship_act_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 185, $ship_act_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 185, $ship_act_qty, value);
	}

	/**
	 * Shipping qty. 出荷数量.<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 185, $ship_act_qty, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 186, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 186, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 186, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 186, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 186, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 186, $sls_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 187, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 187, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 187, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 187, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 187, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 187, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 188, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 188, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 188, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 188, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 188, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 188, $trd_cur_amt, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 189, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 189, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 189, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 189, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 189, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 189, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 190, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 190, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 191, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 191, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 192, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 192, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 192, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 192, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 192, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 192, $tax_rate, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 193, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 193, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 193, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 193, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 193, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 193, $trd_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 194, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 195, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 195, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 196, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 196, $dscnt_rsn_nm, value);
	}


	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 197, $iv_upri);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 197, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 197, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 197, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 197, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 197, $iv_upri, value);
	}


	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return getConstNumber(offset + 198, $iv_amt);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		setConstNumber(offset + 198, $iv_amt, value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(int value) {
		setConstNumber(offset + 198, $iv_amt, value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(long value) {
		setConstNumber(offset + 198, $iv_amt, value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(float value) {
		setConstNumber(offset + 198, $iv_amt, value);
	}

	/**
	 * Invoice amount インボイス金額.<p>
	 *
	 */
	public void iv_amt(double value) {
		setConstNumber(offset + 198, $iv_amt, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 199, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 199, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 199, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 199, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 199, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 199, $ptax_cur_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 200, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 200, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 200, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 200, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 200, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 200, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 201, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 201, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 201, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 201, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 201, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 201, $wtax_amt, value);
	}


	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 202, $rsn_cd);
	}

	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 202, $rsn_cd, value);
	}


	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 203, $rsn_nm);
	}

	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 203, $rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 204, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 204, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 205, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 205, $bd_dpt_nm, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 206, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 206, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 207, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 207, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 208, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 208, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 209, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 209, $sls_dpt_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 210, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 210, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 211, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 211, $ar_dpt_nm, value);
	}


	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public boolean manual_add_flg() {
		return getConstBoolean(offset + 212, $manual_add_flg);
	}

	/**
	 * Manual add マニュアル追加.<p>
	 *
	 */
	public void manual_add_flg(boolean value) {
		setConstBoolean(offset + 212, $manual_add_flg, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 213, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 213, $io_schd_pr_no, value);
	}


	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public String iv_intr_rmrks() {
		return getConstString(offset + 214, $iv_intr_rmrks);
	}

	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public void iv_intr_rmrks(String value) {
		setConstString(offset + 214, $iv_intr_rmrks, value);
	}


	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public String iv_sub_char1() {
		return getConstString(offset + 215, $iv_sub_char1);
	}

	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public void iv_sub_char1(String value) {
		setConstString(offset + 215, $iv_sub_char1, value);
	}


	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public String iv_sub_char2() {
		return getConstString(offset + 216, $iv_sub_char2);
	}

	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public void iv_sub_char2(String value) {
		setConstString(offset + 216, $iv_sub_char2, value);
	}


	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public String iv_sub_char3() {
		return getConstString(offset + 217, $iv_sub_char3);
	}

	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public void iv_sub_char3(String value) {
		setConstString(offset + 217, $iv_sub_char3, value);
	}


	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public String iv_d_rmrks() {
		return getConstString(offset + 218, $iv_d_rmrks);
	}

	/**
	 * Invoice details remarks インボイス明細備考.<p>
	 *
	 */
	public void iv_d_rmrks(String value) {
		setConstString(offset + 218, $iv_d_rmrks, value);
	}


	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public String iv_d_intr_rmrks() {
		return getConstString(offset + 219, $iv_d_intr_rmrks);
	}

	/**
	 * Invoice details internal remarks インボイス明細内部備考.<p>
	 *
	 */
	public void iv_d_intr_rmrks(String value) {
		setConstString(offset + 219, $iv_d_intr_rmrks, value);
	}


	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public String iv_d_sub_char1() {
		return getConstString(offset + 220, $iv_d_sub_char1);
	}

	/**
	 * Invoice details spare 1 インボイス明細予備１.<p>
	 *
	 */
	public void iv_d_sub_char1(String value) {
		setConstString(offset + 220, $iv_d_sub_char1, value);
	}


	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public String iv_d_sub_char2() {
		return getConstString(offset + 221, $iv_d_sub_char2);
	}

	/**
	 * Invoice details spare 2 インボイス明細予備２.<p>
	 *
	 */
	public void iv_d_sub_char2(String value) {
		setConstString(offset + 221, $iv_d_sub_char2, value);
	}


	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public String iv_d_sub_char3() {
		return getConstString(offset + 222, $iv_d_sub_char3);
	}

	/**
	 * Invoice details spare 3 インボイス明細予備３.<p>
	 *
	 */
	public void iv_d_sub_char3(String value) {
		setConstString(offset + 222, $iv_d_sub_char3, value);
	}


	/**
	 * Shipping order details spare 1 出荷指図明細予備１.<p>
	 *
	 */
	public String ship_inst_d_sub_char1() {
		return getConstString(offset + 223, $ship_inst_d_sub_char1);
	}

	/**
	 * Shipping order details spare 1 出荷指図明細予備１.<p>
	 *
	 */
	public void ship_inst_d_sub_char1(String value) {
		setConstString(offset + 223, $ship_inst_d_sub_char1, value);
	}


	/**
	 * Shipping order details spare 2 出荷指図明細予備２.<p>
	 *
	 */
	public String ship_inst_d_sub_char2() {
		return getConstString(offset + 224, $ship_inst_d_sub_char2);
	}

	/**
	 * Shipping order details spare 2 出荷指図明細予備２.<p>
	 *
	 */
	public void ship_inst_d_sub_char2(String value) {
		setConstString(offset + 224, $ship_inst_d_sub_char2, value);
	}


	/**
	 * Shipping order details spare 3 出荷指図明細予備３.<p>
	 *
	 */
	public String ship_inst_d_sub_char3() {
		return getConstString(offset + 225, $ship_inst_d_sub_char3);
	}

	/**
	 * Shipping order details spare 3 出荷指図明細予備３.<p>
	 *
	 */
	public void ship_inst_d_sub_char3(String value) {
		setConstString(offset + 225, $ship_inst_d_sub_char3, value);
	}


	/**
	 * Shipping result details spare 1 出荷実績明細予備１.<p>
	 *
	 */
	public String ship_act_d_sub_char1() {
		return getConstString(offset + 226, $ship_act_d_sub_char1);
	}

	/**
	 * Shipping result details spare 1 出荷実績明細予備１.<p>
	 *
	 */
	public void ship_act_d_sub_char1(String value) {
		setConstString(offset + 226, $ship_act_d_sub_char1, value);
	}


	/**
	 * Shipping result details spare 2 出荷実績明細予備２.<p>
	 *
	 */
	public String ship_act_d_sub_char2() {
		return getConstString(offset + 227, $ship_act_d_sub_char2);
	}

	/**
	 * Shipping result details spare 2 出荷実績明細予備２.<p>
	 *
	 */
	public void ship_act_d_sub_char2(String value) {
		setConstString(offset + 227, $ship_act_d_sub_char2, value);
	}


	/**
	 * Shipping result details spare 3 出荷実績明細予備３.<p>
	 *
	 */
	public String ship_act_d_sub_char3() {
		return getConstString(offset + 228, $ship_act_d_sub_char3);
	}

	/**
	 * Shipping result details spare 3 出荷実績明細予備３.<p>
	 *
	 */
	public void ship_act_d_sub_char3(String value) {
		setConstString(offset + 228, $ship_act_d_sub_char3, value);
	}


	/**
	 * Invoice shipping result details spare 1 インボイス出荷実績明細予備１.<p>
	 *
	 */
	public String iv_ship_act_d_sub_char1() {
		return getConstString(offset + 229, $iv_ship_act_d_sub_char1);
	}

	/**
	 * Invoice shipping result details spare 1 インボイス出荷実績明細予備１.<p>
	 *
	 */
	public void iv_ship_act_d_sub_char1(String value) {
		setConstString(offset + 229, $iv_ship_act_d_sub_char1, value);
	}


	/**
	 * Invoice shipping result details spare 2 インボイス出荷実績明細予備２.<p>
	 *
	 */
	public String iv_ship_act_d_sub_char2() {
		return getConstString(offset + 230, $iv_ship_act_d_sub_char2);
	}

	/**
	 * Invoice shipping result details spare 2 インボイス出荷実績明細予備２.<p>
	 *
	 */
	public void iv_ship_act_d_sub_char2(String value) {
		setConstString(offset + 230, $iv_ship_act_d_sub_char2, value);
	}


	/**
	 * Invoice shipping result details spare 3 インボイス出荷実績明細予備３.<p>
	 *
	 */
	public String iv_ship_act_d_sub_char3() {
		return getConstString(offset + 231, $iv_ship_act_d_sub_char3);
	}

	/**
	 * Invoice shipping result details spare 3 インボイス出荷実績明細予備３.<p>
	 *
	 */
	public void iv_ship_act_d_sub_char3(String value) {
		setConstString(offset + 231, $iv_ship_act_d_sub_char3, value);
	}


	/**
	 * Sales result details spare 1 売上実績明細予備１.<p>
	 *
	 */
	public String sls_act_d_sub_char1() {
		return getConstString(offset + 232, $sls_act_d_sub_char1);
	}

	/**
	 * Sales result details spare 1 売上実績明細予備１.<p>
	 *
	 */
	public void sls_act_d_sub_char1(String value) {
		setConstString(offset + 232, $sls_act_d_sub_char1, value);
	}


	/**
	 * Sales result details spare 2 売上実績明細予備２.<p>
	 *
	 */
	public String sls_act_d_sub_char2() {
		return getConstString(offset + 233, $sls_act_d_sub_char2);
	}

	/**
	 * Sales result details spare 2 売上実績明細予備２.<p>
	 *
	 */
	public void sls_act_d_sub_char2(String value) {
		setConstString(offset + 233, $sls_act_d_sub_char2, value);
	}


	/**
	 * Sales result details spare 3 売上実績明細予備３.<p>
	 *
	 */
	public String sls_act_d_sub_char3() {
		return getConstString(offset + 234, $sls_act_d_sub_char3);
	}

	/**
	 * Sales result details spare 3 売上実績明細予備３.<p>
	 *
	 */
	public void sls_act_d_sub_char3(String value) {
		setConstString(offset + 234, $sls_act_d_sub_char3, value);
	}


	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd1() {
		return getConstString(offset + 235, $ship_rqst_id_grp_cd1);
	}

	/**
	 * Shipping requested classification cd.1 出荷依頼先分類ＣＤ１.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd1(String value) {
		setConstString(offset + 235, $ship_rqst_id_grp_cd1, value);
	}


	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm1() {
		return getConstString(offset + 236, $ship_rqst_id_grp_nm1);
	}

	/**
	 * Shipping requested classification name 1 出荷依頼先分類名１.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm1(String value) {
		setConstString(offset + 236, $ship_rqst_id_grp_nm1, value);
	}


	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd2() {
		return getConstString(offset + 237, $ship_rqst_id_grp_cd2);
	}

	/**
	 * Shipping requested classification cd.2 出荷依頼先分類ＣＤ２.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd2(String value) {
		setConstString(offset + 237, $ship_rqst_id_grp_cd2, value);
	}


	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm2() {
		return getConstString(offset + 238, $ship_rqst_id_grp_nm2);
	}

	/**
	 * Shipping requested classification name 2 出荷依頼先分類名２.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm2(String value) {
		setConstString(offset + 238, $ship_rqst_id_grp_nm2, value);
	}


	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd3() {
		return getConstString(offset + 239, $ship_rqst_id_grp_cd3);
	}

	/**
	 * Shipping requested classification cd.3 出荷依頼先分類ＣＤ３.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd3(String value) {
		setConstString(offset + 239, $ship_rqst_id_grp_cd3, value);
	}


	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm3() {
		return getConstString(offset + 240, $ship_rqst_id_grp_nm3);
	}

	/**
	 * Shipping requested classification name 3 出荷依頼先分類名３.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm3(String value) {
		setConstString(offset + 240, $ship_rqst_id_grp_nm3, value);
	}


	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd4() {
		return getConstString(offset + 241, $ship_rqst_id_grp_cd4);
	}

	/**
	 * Shipping requested classification cd.4 出荷依頼先分類ＣＤ４.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd4(String value) {
		setConstString(offset + 241, $ship_rqst_id_grp_cd4, value);
	}


	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm4() {
		return getConstString(offset + 242, $ship_rqst_id_grp_nm4);
	}

	/**
	 * Shipping requested classification name 4 出荷依頼先分類名４.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm4(String value) {
		setConstString(offset + 242, $ship_rqst_id_grp_nm4, value);
	}


	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd5() {
		return getConstString(offset + 243, $ship_rqst_id_grp_cd5);
	}

	/**
	 * Shipping requested classification cd.5 出荷依頼先分類ＣＤ５.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd5(String value) {
		setConstString(offset + 243, $ship_rqst_id_grp_cd5, value);
	}


	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm5() {
		return getConstString(offset + 244, $ship_rqst_id_grp_nm5);
	}

	/**
	 * Shipping requested classification name 5 出荷依頼先分類名５.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm5(String value) {
		setConstString(offset + 244, $ship_rqst_id_grp_nm5, value);
	}


	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd6() {
		return getConstString(offset + 245, $ship_rqst_id_grp_cd6);
	}

	/**
	 * Shipping requested classification cd.6 出荷依頼先分類ＣＤ６.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd6(String value) {
		setConstString(offset + 245, $ship_rqst_id_grp_cd6, value);
	}


	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm6() {
		return getConstString(offset + 246, $ship_rqst_id_grp_nm6);
	}

	/**
	 * Shipping requested classification name 6 出荷依頼先分類名６.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm6(String value) {
		setConstString(offset + 246, $ship_rqst_id_grp_nm6, value);
	}


	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd7() {
		return getConstString(offset + 247, $ship_rqst_id_grp_cd7);
	}

	/**
	 * Shipping requested classification cd.7 出荷依頼先分類ＣＤ７.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd7(String value) {
		setConstString(offset + 247, $ship_rqst_id_grp_cd7, value);
	}


	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm7() {
		return getConstString(offset + 248, $ship_rqst_id_grp_nm7);
	}

	/**
	 * Shipping requested classification name 7 出荷依頼先分類名７.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm7(String value) {
		setConstString(offset + 248, $ship_rqst_id_grp_nm7, value);
	}


	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd8() {
		return getConstString(offset + 249, $ship_rqst_id_grp_cd8);
	}

	/**
	 * Shipping requested classification cd.8 出荷依頼先分類ＣＤ８.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd8(String value) {
		setConstString(offset + 249, $ship_rqst_id_grp_cd8, value);
	}


	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm8() {
		return getConstString(offset + 250, $ship_rqst_id_grp_nm8);
	}

	/**
	 * Shipping requested classification name 8 出荷依頼先分類名８.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm8(String value) {
		setConstString(offset + 250, $ship_rqst_id_grp_nm8, value);
	}


	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd9() {
		return getConstString(offset + 251, $ship_rqst_id_grp_cd9);
	}

	/**
	 * Shipping requested classification cd.9 出荷依頼先分類ＣＤ９.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd9(String value) {
		setConstString(offset + 251, $ship_rqst_id_grp_cd9, value);
	}


	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm9() {
		return getConstString(offset + 252, $ship_rqst_id_grp_nm9);
	}

	/**
	 * Shipping requested classification name 9 出荷依頼先分類名９.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm9(String value) {
		setConstString(offset + 252, $ship_rqst_id_grp_nm9, value);
	}


	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_cd10() {
		return getConstString(offset + 253, $ship_rqst_id_grp_cd10);
	}

	/**
	 * Shipping requested classification cd.10 出荷依頼先分類ＣＤ１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_cd10(String value) {
		setConstString(offset + 253, $ship_rqst_id_grp_cd10, value);
	}


	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public String ship_rqst_id_grp_nm10() {
		return getConstString(offset + 254, $ship_rqst_id_grp_nm10);
	}

	/**
	 * Shipping requested classification name 10 出荷依頼先分類名１０.<p>
	 *
	 */
	public void ship_rqst_id_grp_nm10(String value) {
		setConstString(offset + 254, $ship_rqst_id_grp_nm10, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_id_grp_cd1() {
		return getConstString(offset + 255, $dlv_id_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_id_grp_cd1(String value) {
		setConstString(offset + 255, $dlv_id_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_id_grp_nm1() {
		return getConstString(offset + 256, $dlv_id_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_id_grp_nm1(String value) {
		setConstString(offset + 256, $dlv_id_grp_nm1, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_id_grp_cd2() {
		return getConstString(offset + 257, $dlv_id_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_id_grp_cd2(String value) {
		setConstString(offset + 257, $dlv_id_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_id_grp_nm2() {
		return getConstString(offset + 258, $dlv_id_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_id_grp_nm2(String value) {
		setConstString(offset + 258, $dlv_id_grp_nm2, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_id_grp_cd3() {
		return getConstString(offset + 259, $dlv_id_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_id_grp_cd3(String value) {
		setConstString(offset + 259, $dlv_id_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_id_grp_nm3() {
		return getConstString(offset + 260, $dlv_id_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_id_grp_nm3(String value) {
		setConstString(offset + 260, $dlv_id_grp_nm3, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_id_grp_cd4() {
		return getConstString(offset + 261, $dlv_id_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_id_grp_cd4(String value) {
		setConstString(offset + 261, $dlv_id_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_id_grp_nm4() {
		return getConstString(offset + 262, $dlv_id_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_id_grp_nm4(String value) {
		setConstString(offset + 262, $dlv_id_grp_nm4, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_id_grp_cd5() {
		return getConstString(offset + 263, $dlv_id_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_id_grp_cd5(String value) {
		setConstString(offset + 263, $dlv_id_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_id_grp_nm5() {
		return getConstString(offset + 264, $dlv_id_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_id_grp_nm5(String value) {
		setConstString(offset + 264, $dlv_id_grp_nm5, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_id_grp_cd6() {
		return getConstString(offset + 265, $dlv_id_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_id_grp_cd6(String value) {
		setConstString(offset + 265, $dlv_id_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_id_grp_nm6() {
		return getConstString(offset + 266, $dlv_id_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_id_grp_nm6(String value) {
		setConstString(offset + 266, $dlv_id_grp_nm6, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_id_grp_cd7() {
		return getConstString(offset + 267, $dlv_id_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_id_grp_cd7(String value) {
		setConstString(offset + 267, $dlv_id_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_id_grp_nm7() {
		return getConstString(offset + 268, $dlv_id_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_id_grp_nm7(String value) {
		setConstString(offset + 268, $dlv_id_grp_nm7, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_id_grp_cd8() {
		return getConstString(offset + 269, $dlv_id_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_id_grp_cd8(String value) {
		setConstString(offset + 269, $dlv_id_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_id_grp_nm8() {
		return getConstString(offset + 270, $dlv_id_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_id_grp_nm8(String value) {
		setConstString(offset + 270, $dlv_id_grp_nm8, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_id_grp_cd9() {
		return getConstString(offset + 271, $dlv_id_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_id_grp_cd9(String value) {
		setConstString(offset + 271, $dlv_id_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_id_grp_nm9() {
		return getConstString(offset + 272, $dlv_id_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_id_grp_nm9(String value) {
		setConstString(offset + 272, $dlv_id_grp_nm9, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_id_grp_cd10() {
		return getConstString(offset + 273, $dlv_id_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_id_grp_cd10(String value) {
		setConstString(offset + 273, $dlv_id_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_id_grp_nm10() {
		return getConstString(offset + 274, $dlv_id_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_id_grp_nm10(String value) {
		setConstString(offset + 274, $dlv_id_grp_nm10, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 275, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 275, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 276, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 276, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 277, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 277, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 278, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 278, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 279, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 279, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 280, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 280, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 281, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 281, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 282, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 282, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 283, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 283, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 284, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 284, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 285, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 285, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 286, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 286, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 287, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 287, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 288, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 288, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 289, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 289, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 290, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 290, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 291, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 291, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 292, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 292, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 293, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 293, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 294, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 294, $itm_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 295, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 295, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 296, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 296, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 297, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 297, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 298, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 298, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 299, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 299, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 300, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 300, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 301, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 301, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 302, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 302, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 303, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 303, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 304, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 304, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 305, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 305, $upd_srv_req_no, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 306, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 306, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 307, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 307, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 308, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 308, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 309, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 309, $sno4_mng_typ, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 310, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 310, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 310, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 310, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 310, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 310, $trd_unit_dec_place, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 311, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 311, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 311, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 311, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 311, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 311, $base_unit_dec_place, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 312, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 312, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 312, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 312, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 312, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 312, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 313, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 313, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 313, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 313, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 313, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 313, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 314, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 314, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 314, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 314, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 314, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 314, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 315, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 315, $dscnt_itm_flg, value);
	}


	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public String exim_xpns_typ() {
		return getConstString(offset + 316, $exim_xpns_typ);
	}

	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public void exim_xpns_typ(String value) {
		setConstString(offset + 316, $exim_xpns_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 317, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 317, $trd_ptn_typ, value);
	}


	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public String sls_dpt_wg_cd() {
		return getConstString(offset + 318, $sls_dpt_wg_cd);
	}

	/**
	 * Sales dept. WG 売上部門のワーキンググループ.<p>
	 *
	 */
	public void sls_dpt_wg_cd(String value) {
		setConstString(offset + 318, $sls_dpt_wg_cd, value);
	}


	/**
	 * Distribution group WG 物流グループのワーキンググループ.<p>
	 *
	 */
	public String lg_grp_wg_cd() {
		return getConstString(offset + 319, $lg_grp_wg_cd);
	}

	/**
	 * Distribution group WG 物流グループのワーキンググループ.<p>
	 *
	 */
	public void lg_grp_wg_cd(String value) {
		setConstString(offset + 319, $lg_grp_wg_cd, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
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
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			return ship_site_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
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
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
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
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_d_intr_rmrks();
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
		if ($ship_inst_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char1();
		}
		if ($ship_inst_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char2();
		}
		if ($ship_inst_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char3();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($iv_ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char1();
		}
		if ($iv_ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char2();
		}
		if ($iv_ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char3();
		}
		if ($sls_act_d_sub_char1.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char1();
		}
		if ($sls_act_d_sub_char2.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char2();
		}
		if ($sls_act_d_sub_char3.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char3();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			return sls_dpt_wg_cd();
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return lg_grp_wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_inc_tax_amt();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			return ttl_iv_amt();
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			return ttl_ncv_amt();
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			return ttl_base_amt();
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			return ttl_freight_amt();
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			return ttl_insurance_amt();
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			return ttl_oth_amt();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			return sum_ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
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
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_comp_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			return iv_comp_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			return load_port_nm();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			return dschrg_port_nm();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			return via_port_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			return case_mrk1();
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			return case_mrk2();
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			return case_mrk3();
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			return case_mrk4();
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			return case_mrk5();
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			return case_mrk6();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			return bl_no();
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			return bl_rmrks();
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			return iv_rmrks();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
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
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
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
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			return ship_site_cd();
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			return ship_site_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
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
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
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
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			return iv_d_rmrks();
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_d_intr_rmrks();
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
		if ($ship_inst_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char1();
		}
		if ($ship_inst_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char2();
		}
		if ($ship_inst_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_inst_d_sub_char3();
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char1();
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char2();
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return ship_act_d_sub_char3();
		}
		if ($iv_ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char1();
		}
		if ($iv_ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char2();
		}
		if ($iv_ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			return iv_ship_act_d_sub_char3();
		}
		if ($sls_act_d_sub_char1.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char1();
		}
		if ($sls_act_d_sub_char2.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char2();
		}
		if ($sls_act_d_sub_char3.equalsIgnoreCase(name)) {
			return sls_act_d_sub_char3();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			return exim_xpns_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			return sls_dpt_wg_cd();
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			return lg_grp_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_inc_tax_amt();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			return ttl_iv_amt();
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			return ttl_ncv_amt();
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			return ttl_base_amt();
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			return ttl_freight_amt();
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			return ttl_insurance_amt();
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			return ttl_oth_amt();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			return sum_ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			return cmpl_schd_dt();
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			return trd_schd_dt();
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			return cmpl_dt();
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
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
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			return ex_im_comp_flg();
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			return iv_ship_flg();
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			return iv_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		if ($iv_comp_flg.equalsIgnoreCase(name)) {
			return iv_comp_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			return pl_reg_flg();
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			return pre_rcpt_iv_flg();
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			return iv_reg_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			return manual_add_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
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
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
			return;
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			ship_site_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
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
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			iv_d_intr_rmrks(value);
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
		if ($ship_inst_d_sub_char1.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char1(value);
			return;
		}
		if ($ship_inst_d_sub_char2.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char2(value);
			return;
		}
		if ($ship_inst_d_sub_char3.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char3(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($iv_ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char1(value);
			return;
		}
		if ($iv_ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char2(value);
			return;
		}
		if ($iv_ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char3(value);
			return;
		}
		if ($sls_act_d_sub_char1.equalsIgnoreCase(name)) {
			sls_act_d_sub_char1(value);
			return;
		}
		if ($sls_act_d_sub_char2.equalsIgnoreCase(name)) {
			sls_act_d_sub_char2(value);
			return;
		}
		if ($sls_act_d_sub_char3.equalsIgnoreCase(name)) {
			sls_act_d_sub_char3(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			sls_dpt_wg_cd(value);
			return;
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			lg_grp_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
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
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			ex_im_comp_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
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
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($load_port_nm.equalsIgnoreCase(name)) {
			load_port_nm(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($dschrg_port_nm.equalsIgnoreCase(name)) {
			dschrg_port_nm(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($via_port_nm.equalsIgnoreCase(name)) {
			via_port_nm(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
			return;
		}
		if ($case_mrk1.equalsIgnoreCase(name)) {
			case_mrk1(value);
			return;
		}
		if ($case_mrk2.equalsIgnoreCase(name)) {
			case_mrk2(value);
			return;
		}
		if ($case_mrk3.equalsIgnoreCase(name)) {
			case_mrk3(value);
			return;
		}
		if ($case_mrk4.equalsIgnoreCase(name)) {
			case_mrk4(value);
			return;
		}
		if ($case_mrk5.equalsIgnoreCase(name)) {
			case_mrk5(value);
			return;
		}
		if ($case_mrk6.equalsIgnoreCase(name)) {
			case_mrk6(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($bl_no.equalsIgnoreCase(name)) {
			bl_no(value);
			return;
		}
		if ($bl_rmrks.equalsIgnoreCase(name)) {
			bl_rmrks(value);
			return;
		}
		if ($iv_rmrks.equalsIgnoreCase(name)) {
			iv_rmrks(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
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
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($ship_site_cd.equalsIgnoreCase(name)) {
			ship_site_cd(value);
			return;
		}
		if ($ship_site_nm.equalsIgnoreCase(name)) {
			ship_site_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
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
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
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
		if ($iv_d_rmrks.equalsIgnoreCase(name)) {
			iv_d_rmrks(value);
			return;
		}
		if ($iv_d_intr_rmrks.equalsIgnoreCase(name)) {
			iv_d_intr_rmrks(value);
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
		if ($ship_inst_d_sub_char1.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char1(value);
			return;
		}
		if ($ship_inst_d_sub_char2.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char2(value);
			return;
		}
		if ($ship_inst_d_sub_char3.equalsIgnoreCase(name)) {
			ship_inst_d_sub_char3(value);
			return;
		}
		if ($ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			ship_act_d_sub_char1(value);
			return;
		}
		if ($ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			ship_act_d_sub_char2(value);
			return;
		}
		if ($ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			ship_act_d_sub_char3(value);
			return;
		}
		if ($iv_ship_act_d_sub_char1.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char1(value);
			return;
		}
		if ($iv_ship_act_d_sub_char2.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char2(value);
			return;
		}
		if ($iv_ship_act_d_sub_char3.equalsIgnoreCase(name)) {
			iv_ship_act_d_sub_char3(value);
			return;
		}
		if ($sls_act_d_sub_char1.equalsIgnoreCase(name)) {
			sls_act_d_sub_char1(value);
			return;
		}
		if ($sls_act_d_sub_char2.equalsIgnoreCase(name)) {
			sls_act_d_sub_char2(value);
			return;
		}
		if ($sls_act_d_sub_char3.equalsIgnoreCase(name)) {
			sls_act_d_sub_char3(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($exim_xpns_typ.equalsIgnoreCase(name)) {
			exim_xpns_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_dpt_wg_cd.equalsIgnoreCase(name)) {
			sls_dpt_wg_cd(value);
			return;
		}
		if ($lg_grp_wg_cd.equalsIgnoreCase(name)) {
			lg_grp_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_inc_tax_amt(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_oth_amt.equalsIgnoreCase(name)) {
			ttl_oth_amt(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($sum_ship_inst_qty.equalsIgnoreCase(name)) {
			sum_ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cmpl_schd_dt.equalsIgnoreCase(name)) {
			cmpl_schd_dt(value);
			return;
		}
		if ($trd_schd_dt.equalsIgnoreCase(name)) {
			trd_schd_dt(value);
			return;
		}
		if ($cmpl_dt.equalsIgnoreCase(name)) {
			cmpl_dt(value);
			return;
		}
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			bl_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
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
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($ex_im_comp_flg.equalsIgnoreCase(name)) {
			ex_im_comp_flg(value);
			return;
		}
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($iv_ship_flg.equalsIgnoreCase(name)) {
			iv_ship_flg(value);
			return;
		}
		if ($iv_prnt_flg.equalsIgnoreCase(name)) {
			iv_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
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
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($pl_reg_flg.equalsIgnoreCase(name)) {
			pl_reg_flg(value);
			return;
		}
		if ($pre_rcpt_iv_flg.equalsIgnoreCase(name)) {
			pre_rcpt_iv_flg(value);
			return;
		}
		if ($iv_reg_flg.equalsIgnoreCase(name)) {
			iv_reg_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($manual_add_flg.equalsIgnoreCase(name)) {
			manual_add_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

