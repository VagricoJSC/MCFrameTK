package mcframe.serverMSLA.MSLAL5120;

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
 * ブロック"SloRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SloRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $slo = "slo";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public static final String $dpt_wg_cd = "dpt_wg_cd";
	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_trd_cur_cd = "cst_trd_cur_cd";
	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $cst_upri_dec_place = "cst_upri_dec_place";
	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $cst_amt_dec_place = "cst_amt_dec_place";
	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_ar_dpt_cd = "cst_ar_dpt_cd";
	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public static final String $cst_bill_crryovr_times = "cst_bill_crryovr_times";
	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Sales unit price acquisition type (Master) 販売単価取得区分（マスタ）.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_usr_cd = "cst_sls_usr_cd";
	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_dpt_cd = "cst_sls_dpt_cd";
	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public static final String $mst_itm_nm = "mst_itm_nm";
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item (Master) 諸口品（マスタ）.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Inventory management type (Master) 在庫管理区分（マスタ）.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Asset management type (Master) 資産管理区分（マスタ）.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $itm_trd_unit_cd = "itm_trd_unit_cd";
	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";
	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public static final String $slo_proc_flg = "slo_proc_flg";
	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Sales order SEIBAN No. 1 required (Master) 受注手配ＮＯ１必須（マスタ）.<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	/**
	 * Sales order SEIBAN No. 2 required (Master) 受注手配ＮＯ２必須（マスタ）.<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	/**
	 * Sales order SEIBAN No. 3 required (Master) 受注手配ＮＯ３必須（マスタ）.<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	/**
	 * Sales order SEIBAN No. 4 required (Master) 受注手配ＮＯ４必須（マスタ）.<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	/**
	 * SEIBAN No. 1 numbering type (Master) 手配ＮＯ１発番区分（マスタ）.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type (Master) 手配ＮＯ２発番区分（マスタ）.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type (Master) 手配ＮＯ３発番区分（マスタ）.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type (Master) 手配ＮＯ４発番区分（マスタ）.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_nm = "mst_dlv_nm";
	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_dpt = "mst_dlv_cntct_dpt";
	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_psn = "mst_dlv_cntct_psn";
	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_zip_cd = "mst_dlv_zip_cd";
	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr1 = "mst_dlv_addr1";
	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr2 = "mst_dlv_addr2";
	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr3 = "mst_dlv_addr3";
	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr4 = "mst_dlv_addr4";
	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_tel = "mst_dlv_tel";
	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_fax = "mst_dlv_fax";
	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Print price (Master) 価格印字（マスタ）.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Delivery destination mandatory (master) 配送先必須（マスタ）.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_nm = "mst_tdlv_nm";
	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_dpt = "mst_tdlv_cntct_dpt";
	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_psn = "mst_tdlv_cntct_psn";
	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_zip_cd = "mst_tdlv_zip_cd";
	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr1 = "mst_tdlv_addr1";
	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr2 = "mst_tdlv_addr2";
	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr3 = "mst_tdlv_addr3";
	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr4 = "mst_tdlv_addr4";
	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_tel = "mst_tdlv_tel";
	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_fax = "mst_tdlv_fax";
	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
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
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public static final String $adv_ship_ctrl_typ = "adv_ship_ctrl_typ";
	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public static final String $adv_bill_amt = "adv_bill_amt";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public static final String $sno_num_flg = "sno_num_flg";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public static final String $not_dt_calc_flg = "not_dt_calc_flg";
	/**
	 * Tax cd. (After completion) 税ＣＤ（補完後）.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public static final String $mst_trd_cur_upri = "mst_trd_cur_upri";
	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public static final String $mst_interim_flg = "mst_interim_flg";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public static final String $mid_loc_cd = "mid_loc_cd";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public static final String $loc_lg_grp_cd = "loc_lg_grp_cd";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public static final String $rem_abort_qty = "rem_abort_qty";
	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public static final String $rem_abort_flg = "rem_abort_flg";

	public static final String $data_lno = $slo + ".data_lno";
	public static final String $data_no = $slo + ".data_no";
	public static final String $data_crud_typ = $slo + ".data_crud_typ";
	public static final String $ext_sys_cd = $slo + ".ext_sys_cd";
	public static final String $exe_sts_typ = $slo + ".exe_sts_typ";
	public static final String $ext_data_no = $slo + ".ext_data_no";
	public static final String $ext_data_lno = $slo + ".ext_data_lno";
	public static final String $data_make_dt = $slo + ".data_make_dt";
	public static final String $imp_flg = $slo + ".imp_flg";
	public static final String $recv_dt = $slo + ".recv_dt";
	public static final String $cst_po_no = $slo + ".cst_po_no";
	public static final String $cst_po_rev = $slo + ".cst_po_rev";
	public static final String $cst_po_d_no = $slo + ".cst_po_d_no";
	public static final String $cst_cd = $slo + ".cst_cd";
	public static final String $dest_cd1 = $slo + ".dest_cd1";
	public static final String $dest_cd2 = $slo + ".dest_cd2";
	public static final String $dest_cd3 = $slo + ".dest_cd3";
	public static final String $po_dt = $slo + ".po_dt";
	public static final String $purc_id_typ = $slo + ".purc_id_typ";
	public static final String $sls_cststk_flg = $slo + ".sls_cststk_flg";
	public static final String $slo_typ = $slo + ".slo_typ";
	public static final String $trd_cur_cd = $slo + ".trd_cur_cd";
	public static final String $sls_dpt_cd = $slo + ".sls_dpt_cd";
	public static final String $sls_usr_cd = $slo + ".sls_usr_cd";
	public static final String $dlv_cd = $slo + ".dlv_cd";
	public static final String $dlv_nm = $slo + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $slo + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $slo + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $slo + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $slo + ".dlv_addr1";
	public static final String $dlv_addr2 = $slo + ".dlv_addr2";
	public static final String $dlv_addr3 = $slo + ".dlv_addr3";
	public static final String $dlv_addr4 = $slo + ".dlv_addr4";
	public static final String $dlv_tel = $slo + ".dlv_tel";
	public static final String $dlv_fax = $slo + ".dlv_fax";
	public static final String $dlv_cntry_cd = $slo + ".dlv_cntry_cd";
	public static final String $tdlv_cd = $slo + ".tdlv_cd";
	public static final String $tdlv_nm = $slo + ".tdlv_nm";
	public static final String $tdlv_cntct_dpt = $slo + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $slo + ".tdlv_cntct_psn";
	public static final String $tdlv_zip_cd = $slo + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $slo + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $slo + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $slo + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $slo + ".tdlv_addr4";
	public static final String $tdlv_tel = $slo + ".tdlv_tel";
	public static final String $tdlv_fax = $slo + ".tdlv_fax";
	public static final String $tdlv_cntry_cd = $slo + ".tdlv_cntry_cd";
	public static final String $dlv_day_week_typ = $slo + ".dlv_day_week_typ";
	public static final String $pri_prnt_typ = $slo + ".pri_prnt_typ";
	public static final String $wrk_no = $slo + ".wrk_no";
	public static final String $tterm_cd1 = $slo + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $slo + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $slo + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $slo + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $slo + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $slo + ".tterm_rmrks3";
	public static final String $trnspt_cd = $slo + ".trnspt_cd";
	public static final String $load_port_cd = $slo + ".load_port_cd";
	public static final String $dschrg_port_cd = $slo + ".dschrg_port_cd";
	public static final String $via_port_cd = $slo + ".via_port_cd";
	public static final String $cst_itm_cd = $slo + ".cst_itm_cd";
	public static final String $cst_itm_nm = $slo + ".cst_itm_nm";
	public static final String $itm_cd = $slo + ".itm_cd";
	public static final String $itm_sub1 = $slo + ".itm_sub1";
	public static final String $itm_sub2 = $slo + ".itm_sub2";
	public static final String $itm_sub3 = $slo + ".itm_sub3";
	public static final String $itm_nm = $slo + ".itm_nm";
	public static final String $cntry_org_cd = $slo + ".cntry_org_cd";
	public static final String $sno1 = $slo + ".sno1";
	public static final String $sno2 = $slo + ".sno2";
	public static final String $sno3 = $slo + ".sno3";
	public static final String $sno4 = $slo + ".sno4";
	public static final String $gd_cd = $slo + ".gd_cd";
	public static final String $trd_unit_cd = $slo + ".trd_unit_cd";
	public static final String $trd_unit_qty = $slo + ".trd_unit_qty";
	public static final String $inc_tax_flg = $slo + ".inc_tax_flg";
	public static final String $interim_flg = $slo + ".interim_flg";
	public static final String $trd_cur_upri = $slo + ".trd_cur_upri";
	public static final String $trd_cur_amt = $slo + ".trd_cur_amt";
	public static final String $tax_fix_flg = $slo + ".tax_fix_flg";
	public static final String $tax_rate = $slo + ".tax_rate";
	public static final String $tax_typ = $slo + ".tax_typ";
	public static final String $trd_cur_tax_amt = $slo + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $slo + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $slo + ".dscnt_rsn_cd";
	public static final String $ship_wh_cd = $slo + ".ship_wh_cd";
	public static final String $ship_block_flg = $slo + ".ship_block_flg";
	public static final String $abort_flg = $slo + ".abort_flg";
	public static final String $set_itm_grp_no = $slo + ".set_itm_grp_no";
	public static final String $ver_no = $slo + ".ver_no";
	public static final String $lot_no = $slo + ".lot_no";
	public static final String $sublot_no = $slo + ".sublot_no";
	public static final String $dlv_rqst_tm = $slo + ".dlv_rqst_tm";
	public static final String $accpt_schd_dt = $slo + ".accpt_schd_dt";
	public static final String $maker_cd = $slo + ".maker_cd";
	public static final String $trd_rmrks = $slo + ".trd_rmrks";
	public static final String $trd_d_rmrks = $slo + ".trd_d_rmrks";
	public static final String $cst_po_rmrks = $slo + ".cst_po_rmrks";
	public static final String $cst_po_d_rmrks = $slo + ".cst_po_d_rmrks";
	public static final String $upri_not_chk_flg = $slo + ".upri_not_chk_flg";
	public static final String $amt_not_chk_flg = $slo + ".amt_not_chk_flg";
	public static final String $tax_not_chk_flg = $slo + ".tax_not_chk_flg";
	public static final String $edi_sub_char1 = $slo + ".edi_sub_char1";
	public static final String $edi_sub_char2 = $slo + ".edi_sub_char2";
	public static final String $edi_sub_char3 = $slo + ".edi_sub_char3";
	public static final String $edi_sub_char4 = $slo + ".edi_sub_char4";
	public static final String $edi_sub_char5 = $slo + ".edi_sub_char5";
	public static final String $edi_sub_num1 = $slo + ".edi_sub_num1";
	public static final String $edi_sub_dt1 = $slo + ".edi_sub_dt1";
	public static final String $edi_sub_d_char1 = $slo + ".edi_sub_d_char1";
	public static final String $edi_sub_d_char2 = $slo + ".edi_sub_d_char2";
	public static final String $edi_sub_d_char3 = $slo + ".edi_sub_d_char3";
	public static final String $edi_sub_d_char4 = $slo + ".edi_sub_d_char4";
	public static final String $edi_sub_d_char5 = $slo + ".edi_sub_d_char5";
	public static final String $edi_sub_d_num1 = $slo + ".edi_sub_d_num1";
	public static final String $edi_sub_d_dt1 = $slo + ".edi_sub_d_dt1";

	public static final MCMeta slo_META = createInnerRowMeta($slo, mcframe.serverMS.dbc.MST_SLO_RECV_IF_R.class);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_wg_cd_META = createCommonMeta($dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta cst_trd_cur_cd_META = createCommonMeta($cst_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cst_upri_dec_place_META = createCommonMeta($cst_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cst_amt_dec_place_META = createCommonMeta($cst_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cst_ar_dpt_cd_META = createCommonMeta($cst_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_bill_crryovr_times_META = createCommonMeta($cst_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta cst_sls_usr_cd_META = createCommonMeta($cst_sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_sls_dpt_cd_META = createCommonMeta($cst_sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta mst_itm_nm_META = createCommonMeta($mst_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta itm_trd_unit_cd_META = createCommonMeta($itm_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta slo_proc_flg_META = createCommonMeta($slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_dlv_nm_META = createCommonMeta($mst_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mst_dlv_cntct_dpt_META = createCommonMeta($mst_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_dlv_cntct_psn_META = createCommonMeta($mst_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_dlv_zip_cd_META = createCommonMeta($mst_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_dlv_addr1_META = createCommonMeta($mst_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr2_META = createCommonMeta($mst_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr3_META = createCommonMeta($mst_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr4_META = createCommonMeta($mst_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_tel_META = createCommonMeta($mst_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_fax_META = createCommonMeta($mst_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_tdlv_nm_META = createCommonMeta($mst_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta mst_tdlv_cntct_dpt_META = createCommonMeta($mst_tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_tdlv_cntct_psn_META = createCommonMeta($mst_tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_tdlv_zip_cd_META = createCommonMeta($mst_tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_tdlv_addr1_META = createCommonMeta($mst_tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr2_META = createCommonMeta($mst_tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr3_META = createCommonMeta($mst_tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr4_META = createCommonMeta($mst_tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_tel_META = createCommonMeta($mst_tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_fax_META = createCommonMeta($mst_tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_ship_ctrl_typ_META = createCommonMeta($adv_ship_ctrl_typ, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP);
	public static final MCMeta adv_bill_amt_META = createCommonMeta($adv_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sno_num_flg_META = createCommonMeta($sno_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta not_dt_calc_flg_META = createCommonMeta($not_dt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta mst_trd_cur_upri_META = createCommonMeta($mst_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mst_interim_flg_META = createCommonMeta($mst_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta mid_loc_cd_META = createCommonMeta($mid_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta loc_lg_grp_cd_META = createCommonMeta($loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rem_abort_qty_META = createCommonMeta($rem_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rem_abort_flg_META = createCommonMeta($rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SloRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<SloRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_META,
			vmi_flg_META,
			slo_dt_META,
			dpt_wg_cd_META,
			bd_dpt_flg_META,
			cst_iv_flg_META,
			sls_basis_typ_META,
			cst_trd_cur_cd_META,
			cst_upri_dec_place_META,
			cst_amt_dec_place_META,
			cst_ar_dpt_cd_META,
			cst_bill_crryovr_times_META,
			ship_schd_split_typ_META,
			sls_upri_req_typ_META,
			cst_sls_usr_cd_META,
			cst_sls_dpt_cd_META,
			ar_dpt_typ_META,
			cst_tterm_cd1_META,
			cst_tterm_cd2_META,
			cst_tterm_cd3_META,
			mst_itm_nm_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			itm_trd_unit_cd_META,
			itm_bill_crryovr_times_META,
			proc_typ_META,
			slo_proc_flg_META,
			ship_inst_typ_META,
			ship_term_cd_META,
			slo_sno1_flg_META,
			slo_sno2_flg_META,
			slo_sno3_flg_META,
			slo_sno4_flg_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			itm_ship_grp_cd_META,
			dlv_sundry_flg_META,
			mst_dlv_nm_META,
			mst_dlv_cntct_dpt_META,
			mst_dlv_cntct_psn_META,
			mst_dlv_zip_cd_META,
			mst_dlv_addr1_META,
			mst_dlv_addr2_META,
			mst_dlv_addr3_META,
			mst_dlv_addr4_META,
			mst_dlv_tel_META,
			mst_dlv_fax_META,
			dlv_lg_grp_cd_META,
			pri_prnt_flg_META,
			tdlv_req_flg_META,
			prnt_lcl_cd_META,
			tdlv_sundry_flg_META,
			mst_tdlv_nm_META,
			via_dlv_typ_META,
			mst_tdlv_cntct_dpt_META,
			mst_tdlv_cntct_psn_META,
			mst_tdlv_zip_cd_META,
			mst_tdlv_addr1_META,
			mst_tdlv_addr2_META,
			mst_tdlv_addr3_META,
			mst_tdlv_addr4_META,
			mst_tdlv_tel_META,
			mst_tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			assort_typ_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			adv_ship_ctrl_typ_META,
			adv_bill_amt_META,
			ar_dpt_cd_META,
			upri_not_tgt_flg_META,
			cost_upri_META,
			iv_upri_META,
			wtax_rate_META,
			bill_crryovr_times_META,
			sno_num_flg_META,
			sno1_null_flg_META,
			sno2_null_flg_META,
			sno3_null_flg_META,
			sno4_null_flg_META,
			alloc_typ_META,
			not_lg_mix_flg_META,
			alloc_scope_typ_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			not_dt_calc_flg_META,
			tax_cd_META,
			trd_unit_dec_place_META,
			upri_dec_place_META,
			amt_dec_place_META,
			mst_trd_cur_upri_META,
			mst_interim_flg_META,
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			sls_schd_dt_META,
			ship_rqst_tm_META,
			sppl_cd_META,
			sls_rsn_cd_META,
			sls_acxfr_flg_META,
			bd_dpt_cd_META,
			alloc_grp_cd_META,
			ship_lg_grp_cd_META,
			mid_loc_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			loc_wg_cd_META,
			loc_lg_grp_cd_META,
			ver_flg_META,
			sublot_mng_typ_META,
			lot_mng_typ_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			slo_no_META,
			slo_d_no_META,
			wg_cd_META,
			err_flg_META,
			peg_no_META,
			rem_abort_qty_META,
			rem_abort_flg_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"ext_sys_cd",
				"exe_sts_typ",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"cst_po_no",
				"cst_po_rev",
				"cst_po_d_no",
				"cst_cd",
				"dest_cd1",
				"dest_cd2",
				"dest_cd3",
				"po_dt",
				"purc_id_typ",
				"sls_cststk_flg",
				"slo_typ",
				"trd_cur_cd",
				"sls_dpt_cd",
				"sls_usr_cd",
				"dlv_cd",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntry_cd",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntry_cd",
				"dlv_day_week_typ",
				"pri_prnt_typ",
				"wrk_no",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"trnspt_cd",
				"load_port_cd",
				"dschrg_port_cd",
				"via_port_cd",
				"cst_itm_cd",
				"cst_itm_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"cntry_org_cd",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"gd_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"inc_tax_flg",
				"interim_flg",
				"trd_cur_upri",
				"trd_cur_amt",
				"tax_fix_flg",
				"tax_rate",
				"tax_typ",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"ship_wh_cd",
				"ship_block_flg",
				"abort_flg",
				"set_itm_grp_no",
				"ver_no",
				"lot_no",
				"sublot_no",
				"dlv_rqst_tm",
				"accpt_schd_dt",
				"maker_cd",
				"trd_rmrks",
				"trd_d_rmrks",
				"cst_po_rmrks",
				"cst_po_d_rmrks",
				"upri_not_chk_flg",
				"amt_not_chk_flg",
				"tax_not_chk_flg",
				"edi_sub_char1",
				"edi_sub_char2",
				"edi_sub_char3",
				"edi_sub_char4",
				"edi_sub_char5",
				"edi_sub_num1",
				"edi_sub_dt1",
				"edi_sub_d_char1",
				"edi_sub_d_char2",
				"edi_sub_d_char3",
				"edi_sub_d_char4",
				"edi_sub_d_char5",
				"edi_sub_d_num1",
				"edi_sub_d_dt1"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$ext_sys_cd,
				$exe_sts_typ,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$cst_po_no,
				$cst_po_rev,
				$cst_po_d_no,
				$cst_cd,
				$dest_cd1,
				$dest_cd2,
				$dest_cd3,
				$po_dt,
				$purc_id_typ,
				$sls_cststk_flg,
				$slo_typ,
				$trd_cur_cd,
				$sls_dpt_cd,
				$sls_usr_cd,
				$dlv_cd,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntry_cd,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntry_cd,
				$dlv_day_week_typ,
				$pri_prnt_typ,
				$wrk_no,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$trnspt_cd,
				$load_port_cd,
				$dschrg_port_cd,
				$via_port_cd,
				$cst_itm_cd,
				$cst_itm_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$cntry_org_cd,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$gd_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$inc_tax_flg,
				$interim_flg,
				$trd_cur_upri,
				$trd_cur_amt,
				$tax_fix_flg,
				$tax_rate,
				$tax_typ,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$ship_wh_cd,
				$ship_block_flg,
				$abort_flg,
				$set_itm_grp_no,
				$ver_no,
				$lot_no,
				$sublot_no,
				$dlv_rqst_tm,
				$accpt_schd_dt,
				$maker_cd,
				$trd_rmrks,
				$trd_d_rmrks,
				$cst_po_rmrks,
				$cst_po_d_rmrks,
				$upri_not_chk_flg,
				$amt_not_chk_flg,
				$tax_not_chk_flg,
				$edi_sub_char1,
				$edi_sub_char2,
				$edi_sub_char3,
				$edi_sub_char4,
				$edi_sub_char5,
				$edi_sub_num1,
				$edi_sub_dt1,
				$edi_sub_d_char1,
				$edi_sub_d_char2,
				$edi_sub_d_char3,
				$edi_sub_d_char4,
				$edi_sub_d_char5,
				$edi_sub_d_num1,
				$edi_sub_d_dt1
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$slo + ".cst_po_no", "E"},	// slo.cst_po_no
				{$slo + ".cst_cd", "E"}	// slo.cst_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$slo + ".cst_cd", "MA.MAUAL0010.Bp"},	// slo.cst_cd
				{$slo + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// slo.trd_cur_cd
				{$slo + ".sls_dpt_cd", "MA.MAUAL0010.Dpt"},	// slo.sls_dpt_cd
				{$slo + ".dlv_cd", "MA.MAUAL0010.Bp"},	// slo.dlv_cd
				{$slo + ".tdlv_cd", "MA.MAUAL0010.Bp"},	// slo.tdlv_cd
				{$slo + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// slo.itm_sub3
				{$slo + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// slo.trd_unit_cd
				{$cst_sls_usr_cd, "MA.MAUAL0010.Usr"}	// cst_sls_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$slo + ".cst_cd", "cst_iv_flg;sls_basis_typ;cst_trd_cur_cd;cst_upri_dec_place;cst_amt_dec_place;sls_amt_rnd_typ;sls_tax_rnd_typ;cst_ar_dpt_cd;cst_bill_crryovr_times;ship_schd_split_typ;sls_upri_req_typ;cst_sls_usr_cd;cst_sls_dpt_cd;ar_dpt_typ;cst_tterm_cd1;cst_tterm_cd2;cst_tterm_cd3"},	// slo.cst_cd
				{$slo + ".trd_cur_cd", "upri_dec_place;amt_dec_place"},	// slo.trd_cur_cd
				{$slo + ".sls_dpt_cd", "dpt_wg_cd"},	// slo.sls_dpt_cd
				{$slo + ".dlv_cd", "mst_dlv_nm;dlv_sundry_flg;pri_prnt_flg;mst_dlv_zip_cd;mst_dlv_addr1;mst_dlv_addr2;mst_dlv_addr3;mst_dlv_addr4;mst_dlv_cntry_cd;mst_dlv_tel;mst_dlv_fax;mst_dlv_cntct_dpt;mst_dlv_cntct_psn;dlv_lg_grp_cd;tdlv_req_flg;prnt_lcl_cd"},	// slo.dlv_cd
				{$slo + ".tdlv_cd", "mst_tdlv_nm;tdlv_sundry_flg;tdlv_lg_grp_cd;mst_tdlv_zip_cd;mst_tdlv_addr1;mst_tdlv_addr2;mst_tdlv_addr3;mst_tdlv_addr4;mst_tdlv_tel;mst_tdlv_fax;mst_tdlv_cntct_dpt;mst_tdlv_cntct_psn;via_dlv_typ"},	// slo.tdlv_cd
				{$slo + ".itm_sub3", "mst_itm_nm;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;itm_trd_unit_cd;itm_bill_crryovr_times;proc_typ;slo_proc_flg;ship_inst_typ;ship_term_cd;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;itm_ship_grp_cd;ver_flg;lot_mng_typ;sublot_mng_typ"},	// slo.itm_sub3
				{$slo + ".trd_unit_cd", "trd_unit_dec_place"},	// slo.trd_unit_cd
				{$cst_sls_usr_cd, "sls_usr_def_dpt_cd"}	// cst_sls_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$slo + ".cst_cd", "cst_iv_flg;sls_basis_typ;cur_cd;upri_dec_place;amt_dec_place;sls_amt_rnd_typ;sls_tax_rnd_typ;ar_dpt_cd;bill_crryovr_times;ship_schd_split_typ;sls_upri_req_typ;cst_usr_cd;cst_dpt_cd;ar_dpt_typ;cst_tterm_cd1;cst_tterm_cd2;cst_tterm_cd3"},	// slo.cst_cd
				{$slo + ".trd_cur_cd", "upri_dec_place;amt_dec_place"},	// slo.trd_cur_cd
				{$slo + ".sls_dpt_cd", "wg_cd"},	// slo.sls_dpt_cd
				{$slo + ".dlv_cd", "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd;tdlv_req_flg;prnt_lcl_cd"},	// slo.dlv_cd
				{$slo + ".tdlv_cd", "bp_nm;dlv_sundry_flg;lg_grp_cd;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;via_dlv_typ"},	// slo.tdlv_cd
				{$slo + ".itm_sub3", "itm_nm;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;asset_mng_typ;ship_unit_cd;bill_crryovr_times;slo_proc_typ;slo_proc_flg;ship_inst_typ;ship_term_cd;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;itm_ship_grp_cd;ver_flg;lot_mng_typ;sublot_mng_typ"},	// slo.itm_sub3
				{$slo + ".trd_unit_cd", "dec_place"},	// slo.trd_unit_cd
				{$cst_sls_usr_cd, "dpt_cd"}	// cst_sls_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$slo + ".cst_cd", "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;slo_dt"},	// slo.cst_cd
				{$slo + ".sls_dpt_cd", "slo_dt;MAC_DPT_IS_SRCH_TYP.SLS;sls_usr_cd"},	// slo.sls_dpt_cd
				{$slo + ".dlv_cd", "MAC_BP_IS_SRCH_TYP.DLV;slo_dt"},	// slo.dlv_cd
				{$slo + ".tdlv_cd", "MAC_BP_IS_SRCH_TYP.TDLV;slo_dt"},	// slo.tdlv_cd
				{$slo + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// slo.itm_sub3
				{$slo + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// slo.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$slo + ".cst_cd", "bp_is_srch_typ;dt"},	// slo.cst_cd
				{$slo + ".sls_dpt_cd", "dt;dpt_is_srch_typ;usr_cd"},	// slo.sls_dpt_cd
				{$slo + ".dlv_cd", "bp_is_srch_typ;dt"},	// slo.dlv_cd
				{$slo + ".tdlv_cd", "bp_is_srch_typ;dt"},	// slo.tdlv_cd
				{$slo + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// slo.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$slo + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// slo.data_crud_typ
				{$slo + ".dlv_day_week_typ", "MAC_DAY_WEEK_TYP"}	// slo.dlv_day_week_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected SloRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends SloRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Chk01_DtlR clone() {
		return (SloRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Chk01_DtlR createInstance() {
		return (SloRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloRecvIf_Chk01_DtlR getValues(String... names) {
		return (SloRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_SLO_RECV_IF_R slo(){
		return (mcframe.serverMS.dbc.MST_SLO_RECV_IF_R) getConstInnerRow(offset + 0, $slo);
	}
	
	public void slo(mcframe.serverMS.dbc.MST_SLO_RECV_IF_R row){
		setConstInnerRow(offset + 0, $slo, row);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 1, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 1, $vmi_flg, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 2, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 2, $slo_dt, value);
	}


	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 3, $dpt_wg_cd);
	}

	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 3, $dpt_wg_cd, value);
	}


	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 4, $bd_dpt_flg);
	}

	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 4, $bd_dpt_flg, value);
	}


	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 5, $cst_iv_flg);
	}

	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 5, $cst_iv_flg, value);
	}


	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 6, $sls_basis_typ);
	}

	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 6, $sls_basis_typ, value);
	}


	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_trd_cur_cd() {
		return getConstString(offset + 7, $cst_trd_cur_cd);
	}

	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_trd_cur_cd(String value) {
		setConstString(offset + 7, $cst_trd_cur_cd, value);
	}


	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber cst_upri_dec_place() {
		return getConstNumber(offset + 8, $cst_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(int value) {
		setConstNumber(offset + 8, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(long value) {
		setConstNumber(offset + 8, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(float value) {
		setConstNumber(offset + 8, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(double value) {
		setConstNumber(offset + 8, $cst_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber cst_amt_dec_place() {
		return getConstNumber(offset + 9, $cst_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 9, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(int value) {
		setConstNumber(offset + 9, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(long value) {
		setConstNumber(offset + 9, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(float value) {
		setConstNumber(offset + 9, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(double value) {
		setConstNumber(offset + 9, $cst_amt_dec_place, value);
	}


	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_ar_dpt_cd() {
		return getConstString(offset + 10, $cst_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_ar_dpt_cd(String value) {
		setConstString(offset + 10, $cst_ar_dpt_cd, value);
	}


	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public MCNumber cst_bill_crryovr_times() {
		return getConstNumber(offset + 11, $cst_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 11, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(int value) {
		setConstNumber(offset + 11, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(long value) {
		setConstNumber(offset + 11, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(float value) {
		setConstNumber(offset + 11, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(double value) {
		setConstNumber(offset + 11, $cst_bill_crryovr_times, value);
	}


	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 12, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 12, $ship_schd_split_typ, value);
	}


	/**
	 * Sales unit price acquisition type (Master) 販売単価取得区分（マスタ）.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 13, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type (Master) 販売単価取得区分（マスタ）.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 13, $sls_upri_req_typ, value);
	}


	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_sls_usr_cd() {
		return getConstString(offset + 14, $cst_sls_usr_cd);
	}

	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_sls_usr_cd(String value) {
		setConstString(offset + 14, $cst_sls_usr_cd, value);
	}


	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_sls_dpt_cd() {
		return getConstString(offset + 15, $cst_sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_sls_dpt_cd(String value) {
		setConstString(offset + 15, $cst_sls_dpt_cd, value);
	}


	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 16, $ar_dpt_typ);
	}

	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 16, $ar_dpt_typ, value);
	}


	public String cst_tterm_cd1() {
		return getConstString(offset + 17, $cst_tterm_cd1);
	}

	public void cst_tterm_cd1(String value) {
		setConstString(offset + 17, $cst_tterm_cd1, value);
	}


	public String cst_tterm_cd2() {
		return getConstString(offset + 18, $cst_tterm_cd2);
	}

	public void cst_tterm_cd2(String value) {
		setConstString(offset + 18, $cst_tterm_cd2, value);
	}


	public String cst_tterm_cd3() {
		return getConstString(offset + 19, $cst_tterm_cd3);
	}

	public void cst_tterm_cd3(String value) {
		setConstString(offset + 19, $cst_tterm_cd3, value);
	}


	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public String mst_itm_nm() {
		return getConstString(offset + 20, $mst_itm_nm);
	}

	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public void mst_itm_nm(String value) {
		setConstString(offset + 20, $mst_itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 21, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 21, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item (Master) 諸口品（マスタ）.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 22, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item (Master) 諸口品（マスタ）.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 22, $sundry_itm_flg, value);
	}


	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 23, $dscnt_itm_flg);
	}

	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 23, $dscnt_itm_flg, value);
	}


	/**
	 * Inventory management type (Master) 在庫管理区分（マスタ）.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 24, $stk_mng_typ);
	}

	/**
	 * Inventory management type (Master) 在庫管理区分（マスタ）.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 24, $stk_mng_typ, value);
	}


	/**
	 * Asset management type (Master) 資産管理区分（マスタ）.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 25, $asset_mng_typ);
	}

	/**
	 * Asset management type (Master) 資産管理区分（マスタ）.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 25, $asset_mng_typ, value);
	}


	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public String itm_trd_unit_cd() {
		return getConstString(offset + 26, $itm_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public void itm_trd_unit_cd(String value) {
		setConstString(offset + 26, $itm_trd_unit_cd, value);
	}


	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 27, $itm_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 27, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 27, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 27, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 27, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 27, $itm_bill_crryovr_times, value);
	}


	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 28, $proc_typ);
	}

	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 28, $proc_typ, value);
	}


	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public boolean slo_proc_flg() {
		return getConstBoolean(offset + 29, $slo_proc_flg);
	}

	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public void slo_proc_flg(boolean value) {
		setConstBoolean(offset + 29, $slo_proc_flg, value);
	}


	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 30, $ship_inst_typ);
	}

	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 30, $ship_inst_typ, value);
	}


	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 31, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 31, $ship_term_cd, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required (Master) 受注手配ＮＯ１必須（マスタ）.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 32, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required (Master) 受注手配ＮＯ１必須（マスタ）.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 32, $slo_sno1_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required (Master) 受注手配ＮＯ２必須（マスタ）.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 33, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required (Master) 受注手配ＮＯ２必須（マスタ）.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 33, $slo_sno2_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required (Master) 受注手配ＮＯ３必須（マスタ）.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 34, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required (Master) 受注手配ＮＯ３必須（マスタ）.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 34, $slo_sno3_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required (Master) 受注手配ＮＯ４必須（マスタ）.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 35, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required (Master) 受注手配ＮＯ４必須（マスタ）.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 35, $slo_sno4_flg, value);
	}


	/**
	 * SEIBAN No. 1 numbering type (Master) 手配ＮＯ１発番区分（マスタ）.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 36, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type (Master) 手配ＮＯ１発番区分（マスタ）.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 36, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type (Master) 手配ＮＯ２発番区分（マスタ）.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 37, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type (Master) 手配ＮＯ２発番区分（マスタ）.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 37, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type (Master) 手配ＮＯ３発番区分（マスタ）.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 38, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type (Master) 手配ＮＯ３発番区分（マスタ）.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 38, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type (Master) 手配ＮＯ４発番区分（マスタ）.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 39, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type (Master) 手配ＮＯ４発番区分（マスタ）.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 39, $sno4_num_typ, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 40, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 40, $itm_ship_grp_cd, value);
	}


	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 41, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 41, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public String mst_dlv_nm() {
		return getConstString(offset + 42, $mst_dlv_nm);
	}

	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public void mst_dlv_nm(String value) {
		setConstString(offset + 42, $mst_dlv_nm, value);
	}


	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_dpt() {
		return getConstString(offset + 43, $mst_dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_dpt(String value) {
		setConstString(offset + 43, $mst_dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_psn() {
		return getConstString(offset + 44, $mst_dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_psn(String value) {
		setConstString(offset + 44, $mst_dlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_dlv_zip_cd() {
		return getConstString(offset + 45, $mst_dlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_dlv_zip_cd(String value) {
		setConstString(offset + 45, $mst_dlv_zip_cd, value);
	}


	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr1() {
		return getConstString(offset + 46, $mst_dlv_addr1);
	}

	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr1(String value) {
		setConstString(offset + 46, $mst_dlv_addr1, value);
	}


	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr2() {
		return getConstString(offset + 47, $mst_dlv_addr2);
	}

	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr2(String value) {
		setConstString(offset + 47, $mst_dlv_addr2, value);
	}


	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr3() {
		return getConstString(offset + 48, $mst_dlv_addr3);
	}

	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr3(String value) {
		setConstString(offset + 48, $mst_dlv_addr3, value);
	}


	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr4() {
		return getConstString(offset + 49, $mst_dlv_addr4);
	}

	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr4(String value) {
		setConstString(offset + 49, $mst_dlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_tel() {
		return getConstString(offset + 50, $mst_dlv_tel);
	}

	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_tel(String value) {
		setConstString(offset + 50, $mst_dlv_tel, value);
	}


	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_fax() {
		return getConstString(offset + 51, $mst_dlv_fax);
	}

	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_fax(String value) {
		setConstString(offset + 51, $mst_dlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 52, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 52, $dlv_lg_grp_cd, value);
	}


	/**
	 * Print price (Master) 価格印字（マスタ）.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 53, $pri_prnt_flg);
	}

	/**
	 * Print price (Master) 価格印字（マスタ）.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 53, $pri_prnt_flg, value);
	}


	/**
	 * Delivery destination mandatory (master) 配送先必須（マスタ）.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 54, $tdlv_req_flg);
	}

	/**
	 * Delivery destination mandatory (master) 配送先必須（マスタ）.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 54, $tdlv_req_flg, value);
	}


	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 55, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 55, $prnt_lcl_cd, value);
	}


	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 56, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 56, $tdlv_sundry_flg, value);
	}


	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_nm() {
		return getConstString(offset + 57, $mst_tdlv_nm);
	}

	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_nm(String value) {
		setConstString(offset + 57, $mst_tdlv_nm, value);
	}


	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 58, $via_dlv_typ);
	}

	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 58, $via_dlv_typ, value);
	}


	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_dpt() {
		return getConstString(offset + 59, $mst_tdlv_cntct_dpt);
	}

	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_dpt(String value) {
		setConstString(offset + 59, $mst_tdlv_cntct_dpt, value);
	}


	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_psn() {
		return getConstString(offset + 60, $mst_tdlv_cntct_psn);
	}

	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_psn(String value) {
		setConstString(offset + 60, $mst_tdlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_zip_cd() {
		return getConstString(offset + 61, $mst_tdlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_zip_cd(String value) {
		setConstString(offset + 61, $mst_tdlv_zip_cd, value);
	}


	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr1() {
		return getConstString(offset + 62, $mst_tdlv_addr1);
	}

	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr1(String value) {
		setConstString(offset + 62, $mst_tdlv_addr1, value);
	}


	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr2() {
		return getConstString(offset + 63, $mst_tdlv_addr2);
	}

	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr2(String value) {
		setConstString(offset + 63, $mst_tdlv_addr2, value);
	}


	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr3() {
		return getConstString(offset + 64, $mst_tdlv_addr3);
	}

	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr3(String value) {
		setConstString(offset + 64, $mst_tdlv_addr3, value);
	}


	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr4() {
		return getConstString(offset + 65, $mst_tdlv_addr4);
	}

	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr4(String value) {
		setConstString(offset + 65, $mst_tdlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_tel() {
		return getConstString(offset + 66, $mst_tdlv_tel);
	}

	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_tel(String value) {
		setConstString(offset + 66, $mst_tdlv_tel, value);
	}


	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_fax() {
		return getConstString(offset + 67, $mst_tdlv_fax);
	}

	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_fax(String value) {
		setConstString(offset + 67, $mst_tdlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 68, $tdlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 68, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 69, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 69, $assort_typ, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 70, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 70, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 71, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 71, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 71, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 71, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 71, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 71, $xrate, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 72, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 72, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 73, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 73, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 73, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 73, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 73, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 73, $ptax_xrate, value);
	}


	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public String adv_ship_ctrl_typ() {
		return getConstString(offset + 74, $adv_ship_ctrl_typ);
	}

	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public void adv_ship_ctrl_typ(String value) {
		setConstString(offset + 74, $adv_ship_ctrl_typ, value);
	}


	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public MCNumber adv_bill_amt() {
		return getConstNumber(offset + 75, $adv_bill_amt);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(MCNumber value) {
		setConstNumber(offset + 75, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(int value) {
		setConstNumber(offset + 75, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(long value) {
		setConstNumber(offset + 75, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(float value) {
		setConstNumber(offset + 75, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(double value) {
		setConstNumber(offset + 75, $adv_bill_amt, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 76, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 76, $ar_dpt_cd, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 77, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 77, $upri_not_tgt_flg, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 78, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 78, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 78, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 78, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 78, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 78, $cost_upri, value);
	}


	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 79, $iv_upri);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 79, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 79, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 79, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 79, $iv_upri, value);
	}

	/**
	 * Invoice unit price インボイス単価.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 79, $iv_upri, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 80, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 80, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 80, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 80, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 80, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 80, $wtax_rate, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 81, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 81, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 81, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 81, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 81, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 81, $bill_crryovr_times, value);
	}


	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public boolean sno_num_flg() {
		return getConstBoolean(offset + 82, $sno_num_flg);
	}

	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public void sno_num_flg(boolean value) {
		setConstBoolean(offset + 82, $sno_num_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 83, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 83, $sno1_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 84, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 84, $sno2_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 85, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 85, $sno3_null_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 86, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 86, $sno4_null_flg, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 87, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 87, $alloc_typ, value);
	}


	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 88, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 88, $not_lg_mix_flg, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 89, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 89, $alloc_scope_typ, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 90, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 90, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 91, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 91, $dlv_schd_tm, value);
	}


	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public boolean not_dt_calc_flg() {
		return getConstBoolean(offset + 92, $not_dt_calc_flg);
	}

	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public void not_dt_calc_flg(boolean value) {
		setConstBoolean(offset + 92, $not_dt_calc_flg, value);
	}


	/**
	 * Tax cd. (After completion) 税ＣＤ（補完後）.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 93, $tax_cd);
	}

	/**
	 * Tax cd. (After completion) 税ＣＤ（補完後）.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 93, $tax_cd, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 94, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 94, $trd_unit_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 95, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 95, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 95, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 95, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 95, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 95, $upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 96, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 96, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 96, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 96, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 96, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 96, $amt_dec_place, value);
	}


	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public MCNumber mst_trd_cur_upri() {
		return getConstNumber(offset + 97, $mst_trd_cur_upri);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 97, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(int value) {
		setConstNumber(offset + 97, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(long value) {
		setConstNumber(offset + 97, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(float value) {
		setConstNumber(offset + 97, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(double value) {
		setConstNumber(offset + 97, $mst_trd_cur_upri, value);
	}


	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public boolean mst_interim_flg() {
		return getConstBoolean(offset + 98, $mst_interim_flg);
	}

	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public void mst_interim_flg(boolean value) {
		setConstBoolean(offset + 98, $mst_interim_flg, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 99, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 99, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 100, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 100, $sls_tax_rnd_typ, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 101, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 101, $sls_schd_dt, value);
	}


	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 102, $ship_rqst_tm);
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 102, $ship_rqst_tm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 103, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 103, $sppl_cd, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 104, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 104, $sls_rsn_cd, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 105, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 105, $sls_acxfr_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 106, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 106, $bd_dpt_cd, value);
	}


	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 107, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location G cd. 総量引当場所ＧＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 107, $alloc_grp_cd, value);
	}


	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 108, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution G cd. 出荷物流ＧＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 108, $ship_lg_grp_cd, value);
	}


	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public String mid_loc_cd() {
		return getConstString(offset + 109, $mid_loc_cd);
	}

	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public void mid_loc_cd(String value) {
		setConstString(offset + 109, $mid_loc_cd, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 110, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 110, $loc_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 111, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 111, $str_ln_cd, value);
	}


	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 112, $loc_wg_cd);
	}

	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 112, $loc_wg_cd, value);
	}


	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public String loc_lg_grp_cd() {
		return getConstString(offset + 113, $loc_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (Location) 物流グループＣＤ（場所）.<p>
	 *
	 */
	public void loc_lg_grp_cd(String value) {
		setConstString(offset + 113, $loc_lg_grp_cd, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 114, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 114, $ver_flg, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 115, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 115, $sublot_mng_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 116, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 116, $lot_mng_typ, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 117, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 117, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 118, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 118, $not_sublot_mix_flg, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 119, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 119, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 120, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 120, $slo_d_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 121, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 121, $wg_cd, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 122, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 122, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 123, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 123, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 123, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 123, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 123, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 123, $peg_no, value);
	}


	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public MCNumber rem_abort_qty() {
		return getConstNumber(offset + 124, $rem_abort_qty);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(MCNumber value) {
		setConstNumber(offset + 124, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(int value) {
		setConstNumber(offset + 124, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(long value) {
		setConstNumber(offset + 124, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(float value) {
		setConstNumber(offset + 124, $rem_abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 残数打切数量.<p>
	 *
	 */
	public void rem_abort_qty(double value) {
		setConstNumber(offset + 124, $rem_abort_qty, value);
	}


	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public boolean rem_abort_flg() {
		return getConstBoolean(offset + 125, $rem_abort_flg);
	}

	/**
	 * Cancel remaining qty. 残数打切.<p>
	 *
	 */
	public void rem_abort_flg(boolean value) {
		setConstBoolean(offset + 125, $rem_abort_flg, value);
	}


	public String getString(String name) {
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			return cst_trd_cur_cd();
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			return cst_ar_dpt_cd();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			return cst_sls_usr_cd();
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			return cst_sls_dpt_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			return itm_trd_unit_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			return mid_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return loc_lg_grp_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			return cst_upri_dec_place();
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			return cst_amt_dec_place();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			return mst_trd_cur_upri();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			return rem_abort_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
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
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			return mst_interim_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			return cst_trd_cur_cd();
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			return cst_ar_dpt_cd();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			return cst_sls_usr_cd();
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			return cst_sls_dpt_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			return itm_trd_unit_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			return mid_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return loc_lg_grp_cd();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			return cst_upri_dec_place();
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			return cst_amt_dec_place();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			return mst_trd_cur_upri();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			return rem_abort_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
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
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			return mst_interim_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			return rem_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			cst_trd_cur_cd(value);
			return;
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			cst_ar_dpt_cd(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			cst_sls_usr_cd(value);
			return;
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			cst_sls_dpt_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			itm_trd_unit_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			mid_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			loc_lg_grp_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			mst_interim_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			cst_trd_cur_cd(value);
			return;
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			cst_ar_dpt_cd(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			cst_sls_usr_cd(value);
			return;
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			cst_sls_dpt_cd(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			itm_trd_unit_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			mid_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($loc_lg_grp_cd.equalsIgnoreCase(name)) {
			loc_lg_grp_cd(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
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
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($rem_abort_qty.equalsIgnoreCase(name)) {
			rem_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			mst_interim_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($rem_abort_flg.equalsIgnoreCase(name)) {
			rem_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($slo.equalsIgnoreCase(name)) {
			return slo();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($slo.equalsIgnoreCase(name)) {
			slo(
				((MCContainerMeta) slo_META).castInnerRow(mcframe.serverMS.dbc.MST_SLO_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return slo().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		slo().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		slo().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return slo().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		slo().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		slo().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return slo().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		slo().data_crud_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return slo().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		slo().ext_sys_cd(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return slo().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		slo().exe_sts_typ(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return slo().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		slo().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return slo().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		slo().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		slo().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return slo().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		slo().data_make_dt(value);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return slo().imp_flg();
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		slo().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return slo().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		slo().recv_dt(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return slo().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		slo().cst_po_no(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return slo().cst_po_rev();
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		slo().cst_po_rev(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return slo().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		slo().cst_po_d_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return slo().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		slo().cst_cd(value);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return slo().dest_cd1();
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		slo().dest_cd1(value);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return slo().dest_cd2();
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		slo().dest_cd2(value);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return slo().dest_cd3();
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		slo().dest_cd3(value);
	}

	/**
	 * PO date 注文日.<p>
	 *
	 */
	public MCDate po_dt() {
		return slo().po_dt();
	}

	/**
	 * PO date 注文日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		slo().po_dt(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return slo().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		slo().purc_id_typ(value);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return slo().sls_cststk_flg();
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		slo().sls_cststk_flg(value);
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return slo().slo_typ();
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		slo().slo_typ(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return slo().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		slo().trd_cur_cd(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return slo().sls_dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		slo().sls_dpt_cd(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return slo().sls_usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		slo().sls_usr_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return slo().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		slo().dlv_cd(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return slo().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		slo().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return slo().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		slo().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return slo().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		slo().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return slo().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		slo().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return slo().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		slo().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return slo().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		slo().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return slo().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		slo().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return slo().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		slo().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return slo().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		slo().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return slo().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		slo().dlv_fax(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return slo().dlv_cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		slo().dlv_cntry_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return slo().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		slo().tdlv_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return slo().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		slo().tdlv_nm(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return slo().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		slo().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return slo().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		slo().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return slo().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		slo().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return slo().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		slo().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return slo().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		slo().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return slo().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		slo().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return slo().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		slo().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return slo().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		slo().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return slo().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		slo().tdlv_fax(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return slo().tdlv_cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		slo().tdlv_cntry_cd(value);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return slo().dlv_day_week_typ();
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		slo().dlv_day_week_typ(value);
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return slo().pri_prnt_typ();
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		slo().pri_prnt_typ(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return slo().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		slo().wrk_no(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return slo().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		slo().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return slo().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		slo().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return slo().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		slo().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return slo().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		slo().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return slo().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		slo().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return slo().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		slo().tterm_rmrks3(value);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return slo().trnspt_cd();
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		slo().trnspt_cd(value);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return slo().load_port_cd();
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		slo().load_port_cd(value);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return slo().dschrg_port_cd();
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		slo().dschrg_port_cd(value);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return slo().via_port_cd();
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		slo().via_port_cd(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return slo().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		slo().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return slo().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		slo().cst_itm_nm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return slo().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		slo().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return slo().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		slo().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return slo().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		slo().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return slo().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		slo().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return slo().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		slo().itm_nm(value);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return slo().cntry_org_cd();
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		slo().cntry_org_cd(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return slo().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		slo().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return slo().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		slo().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return slo().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		slo().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return slo().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		slo().sno4(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return slo().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		slo().gd_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return slo().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		slo().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return slo().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		slo().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		slo().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		slo().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		slo().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		slo().trd_unit_qty(value);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return slo().inc_tax_flg();
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		slo().inc_tax_flg(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return slo().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		slo().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return slo().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		slo().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		slo().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		slo().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		slo().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		slo().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return slo().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		slo().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		slo().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		slo().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		slo().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		slo().trd_cur_amt(value);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return slo().tax_fix_flg();
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		slo().tax_fix_flg(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return slo().tax_rate();
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		slo().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		slo().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		slo().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		slo().tax_rate(value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		slo().tax_rate(value);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return slo().tax_typ();
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		slo().tax_typ(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return slo().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		slo().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		slo().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		slo().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		slo().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		slo().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return slo().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		slo().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		slo().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		slo().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		slo().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		slo().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return slo().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		slo().dscnt_rsn_cd(value);
	}

	/**
	 * Shipping warehouse cd. 出荷倉庫ＣＤ.<p>
	 *
	 */
	public String ship_wh_cd() {
		return slo().ship_wh_cd();
	}

	/**
	 * Shipping warehouse cd. 出荷倉庫ＣＤ.<p>
	 *
	 */
	public void ship_wh_cd(String value) {
		slo().ship_wh_cd(value);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return slo().ship_block_flg();
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		slo().ship_block_flg(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return slo().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		slo().abort_flg(value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return slo().set_itm_grp_no();
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		slo().set_itm_grp_no(value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		slo().set_itm_grp_no(value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		slo().set_itm_grp_no(value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		slo().set_itm_grp_no(value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		slo().set_itm_grp_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return slo().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		slo().ver_no(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return slo().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		slo().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return slo().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		slo().sublot_no(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return slo().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		slo().dlv_rqst_tm(value);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return slo().accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		slo().accpt_schd_dt(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return slo().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		slo().maker_cd(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return slo().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		slo().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return slo().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		slo().trd_d_rmrks(value);
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return slo().cst_po_rmrks();
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		slo().cst_po_rmrks(value);
	}

	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public String cst_po_d_rmrks() {
		return slo().cst_po_d_rmrks();
	}

	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public void cst_po_d_rmrks(String value) {
		slo().cst_po_d_rmrks(value);
	}

	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public boolean upri_not_chk_flg() {
		return slo().upri_not_chk_flg();
	}

	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public void upri_not_chk_flg(boolean value) {
		slo().upri_not_chk_flg(value);
	}

	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public boolean amt_not_chk_flg() {
		return slo().amt_not_chk_flg();
	}

	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public void amt_not_chk_flg(boolean value) {
		slo().amt_not_chk_flg(value);
	}

	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public boolean tax_not_chk_flg() {
		return slo().tax_not_chk_flg();
	}

	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public void tax_not_chk_flg(boolean value) {
		slo().tax_not_chk_flg(value);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return slo().edi_sub_char1();
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		slo().edi_sub_char1(value);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return slo().edi_sub_char2();
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		slo().edi_sub_char2(value);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return slo().edi_sub_char3();
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		slo().edi_sub_char3(value);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return slo().edi_sub_char4();
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		slo().edi_sub_char4(value);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return slo().edi_sub_char5();
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		slo().edi_sub_char5(value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return slo().edi_sub_num1();
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		slo().edi_sub_num1(value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		slo().edi_sub_num1(value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		slo().edi_sub_num1(value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		slo().edi_sub_num1(value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		slo().edi_sub_num1(value);
	}

	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return slo().edi_sub_dt1();
	}

	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		slo().edi_sub_dt1(value);
	}

	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return slo().edi_sub_d_char1();
	}

	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		slo().edi_sub_d_char1(value);
	}

	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return slo().edi_sub_d_char2();
	}

	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		slo().edi_sub_d_char2(value);
	}

	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return slo().edi_sub_d_char3();
	}

	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		slo().edi_sub_d_char3(value);
	}

	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return slo().edi_sub_d_char4();
	}

	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		slo().edi_sub_d_char4(value);
	}

	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return slo().edi_sub_d_char5();
	}

	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		slo().edi_sub_d_char5(value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return slo().edi_sub_d_num1();
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		slo().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		slo().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		slo().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		slo().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		slo().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return slo().edi_sub_d_dt1();
	}

	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		slo().edi_sub_d_dt1(value);
	}

}

