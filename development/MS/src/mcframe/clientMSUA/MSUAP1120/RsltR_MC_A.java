package mcframe.clientMSUA.MSUAP1120;

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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public static final String $ein = "ein";
	/**
	 * Country 国.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Region 地域.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * Currency 通貨.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public static final String $cst_flg = "cst_flg";
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public static final String $acst_flg = "acst_flg";
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public static final String $bcst_flg = "bcst_flg";
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public static final String $rcst_flg = "rcst_flg";
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public static final String $dlv_flg = "dlv_flg";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public static final String $tdlv_flg = "tdlv_flg";
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public static final String $dest_flg = "dest_flg";
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public static final String $cred_flg = "cred_flg";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public static final String $asppl_flg = "asppl_flg";
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public static final String $bsppl_flg = "bsppl_flg";
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public static final String $psppl_flg = "psppl_flg";
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public static final String $maker_flg = "maker_flg";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	public static final String $bp_grp_p = "bp_grp_p";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Allow sales unit price change flg. 販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public static final String $sls_upri_rnd_typ = "sls_upri_rnd_typ";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public static final String $sls_tax_calc_typ = "sls_tax_calc_typ";
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public static final String $lot_back_stop_typ = "lot_back_stop_typ";
	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public static final String $slip_each_lot_typ = "slip_each_lot_typ";
	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public static final String $cst_ship_form_cd = "cst_ship_form_cd";
	/**
	 * Identification tag issue flg. 現品票発行ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_lst_issue_flg = "stk_lst_issue_flg";
	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public static final String $stk_lst_form_cd = "stk_lst_form_cd";
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	/**
	 * Sales tax priority flg. 売上税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_tax_cd_prio_flg = "sls_tax_cd_prio_flg";
	/**
	 * AR management by sales project flg. 案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ar_flg = "wrk_ar_flg";
	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $cst_tterm_cd1 = "cst_tterm_cd1";
	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public static final String $cst_tterm_nm1 = "cst_tterm_nm1";
	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $cst_tterm_cd2 = "cst_tterm_cd2";
	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public static final String $cst_tterm_nm2 = "cst_tterm_nm2";
	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $cst_tterm_cd3 = "cst_tterm_cd3";
	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public static final String $cst_tterm_nm3 = "cst_tterm_nm3";
	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ar_cred_cd = "ar_cred_cd";
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public static final String $bill_dpt_typ = "bill_dpt_typ";
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 * Billing tax calculation flg. 請求税計算ＦＬＧ.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 * Billing tax rounding type 請求税端数処理区分.<p>
	 *
	 */
	public static final String $bill_tax_rnd_typ = "bill_tax_rnd_typ";
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public static final String $bill_cl_delay_days = "bill_cl_delay_days";
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public static final String $bill_cl_ba_typ = "bill_cl_ba_typ";
	/**
	 * Sales temporary unit price closing flg. 売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_interim_cl_flg = "sls_interim_cl_flg";
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cal_cd = "bill_cal_cd";
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public static final String $rcv_ba_typ = "rcv_ba_typ";
	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public static final String $sls_dtl_outp_typ = "sls_dtl_outp_typ";
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public static final String $bill_prnt_typ = "bill_prnt_typ";
	/**
	 * Invoice details output flg. 請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 * Display payment receipt schedule in invoice details flg. 請求書明細入金予定表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_rcv_flg = "bill_dtl_rcv_flg";
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public static final String $bill_dtl_subttl_typ = "bill_dtl_subttl_typ";
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public static final String $bill_dtl_brk_typ = "bill_dtl_brk_typ";
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public static final String $bill_dtl_sort_typ = "bill_dtl_sort_typ";
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public static final String $bill_can_slip_typ = "bill_can_slip_typ";
	/**
	 * Details auto-reconciliation flg. 自動明細消込ＦＬＧ.<p>
	 *
	 */
	public static final String $auto_line_appl_flg = "auto_line_appl_flg";
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_grp_cd = "ar_setoff_grp_cd";
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	/**
	 * For auto-reconciliation flg. 入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	/**
	 * Match amount flg. 金額考慮ＦＬＧ.<p>
	 *
	 */
	public static final String $rcv_amt_match_flg = "rcv_amt_match_flg";
	/**
	 * Match payment option flg. 金種考慮ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_sttl_typ_match_flg = "ar_sttl_typ_match_flg";
	/**
	 * Fee calculation flg. 手数料計算ＦＬＧ.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public static final String $auto_appl_delay_days = "auto_appl_delay_days";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_tax_cd_prio_flg = "purc_tax_cd_prio_flg";
	/**
	 * PO sheet by sales project flg. 案件別注文書ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_po_flg = "wrk_po_flg";
	/**
	 * AP management by sales project flg. 案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public static final String $wrk_ap_flg = "wrk_ap_flg";
	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public static final String $prov_rcv_typ = "prov_rcv_typ";
	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public static final String $onr_prsppl_flg = "onr_prsppl_flg";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Allow supply unit price change flg. 支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_upri_cng_flg = "prov_upri_cng_flg";
	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public static final String $prov_amt_rnd_typ = "prov_amt_rnd_typ";
	/**
	 * Supply tax rounding type 支給税端数処理区分.<p>
	 *
	 */
	public static final String $prov_tax_rnd_typ = "prov_tax_rnd_typ";
	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public static final String $prov_tax_calc_typ = "prov_tax_calc_typ";
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	/**
	 * Supply tax priority flg. 支給税優先ＦＬＧ.<p>
	 *
	 */
	public static final String $prov_tax_cd_prio_flg = "prov_tax_cd_prio_flg";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Supplier invoice transaction flg. 発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Order promising check flg. 納期回答確認ＦＬＧ.<p>
	 *
	 */
	public static final String $prms_recv_flg = "prms_recv_flg";
	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public static final String $psppl_cl_day1 = "psppl_cl_day1";
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public static final String $psppl_cl_day2 = "psppl_cl_day2";
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public static final String $psppl_cl_day3 = "psppl_cl_day3";
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public static final String $psppl_cl_day4 = "psppl_cl_day4";
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public static final String $psppl_cl_day5 = "psppl_cl_day5";
	/**
	 * Purchase temporary unit price closing flg. 仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_interim_cl_flg = "purc_interim_cl_flg";
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public static final String $ap_setoff_grp_cd = "ap_setoff_grp_cd";
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public static final String $psppl_rmrks = "psppl_rmrks";
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public static final String $note_days = "note_days";
	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * For consignment inventory count flg. 貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public static final String $cnsgn_stktk_flg = "cnsgn_stktk_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point required flg. 配送先必須ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public static final String $dlv_chnnl1 = "dlv_chnnl1";
	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public static final String $dlv_chnnl2 = "dlv_chnnl2";
	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public static final String $dlv_chnnl3 = "dlv_chnnl3";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * For EDI PO export ＥＤＩ発注送信対象.<p>
	 *
	 */
	public static final String $edi_po_send_tgt_flg = "edi_po_send_tgt_flg";

	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cst_flg_META = createCommonMeta($cst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acst_flg_META = createCommonMeta($acst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_flg_META = createCommonMeta($bcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcst_flg_META = createCommonMeta($rcst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_flg_META = createCommonMeta($dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_flg_META = createCommonMeta($tdlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_flg_META = createCommonMeta($dest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_flg_META = createCommonMeta($cred_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asppl_flg_META = createCommonMeta($asppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_flg_META = createCommonMeta($bsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_flg_META = createCommonMeta($psppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_flg_META = createCommonMeta($maker_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_rnd_typ_META = createCommonMeta($sls_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_calc_typ_META = createCommonMeta($sls_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta lot_back_stop_typ_META = createCommonMeta($lot_back_stop_typ, mcframe.commonMA.meta.MA_META.LOT_BACK_STOP_TYP);
	public static final MCMeta slip_each_lot_typ_META = createCommonMeta($slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta cst_ship_form_cd_META = createCommonMeta($cst_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta stk_lst_issue_flg_META = createCommonMeta($stk_lst_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_lst_form_cd_META = createCommonMeta($stk_lst_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_tax_cd_prio_flg_META = createCommonMeta($sls_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ar_flg_META = createCommonMeta($wrk_ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_tterm_cd1_META = createCommonMeta($cst_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm1_META = createCommonMeta($cst_tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd2_META = createCommonMeta($cst_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm2_META = createCommonMeta($cst_tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta cst_tterm_cd3_META = createCommonMeta($cst_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta cst_tterm_nm3_META = createCommonMeta($cst_tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_cred_cd_META = createCommonMeta($ar_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_typ_META = createCommonMeta($bill_dpt_typ, mcframe.commonMA.meta.MA_META.BILL_DPT_TYP);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_rnd_typ_META = createCommonMeta($bill_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta bill_cl_delay_days_META = createCommonMeta($bill_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta bill_cl_ba_typ_META = createCommonMeta($bill_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta sls_interim_cl_flg_META = createCommonMeta($sls_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cal_cd_META = createCommonMeta($bill_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_ba_typ_META = createCommonMeta($rcv_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_outp_typ_META = createCommonMeta($sls_dtl_outp_typ, mcframe.commonMA.meta.MA_META.SLS_DTL_OUTP_TYP);
	public static final MCMeta bill_prnt_typ_META = createCommonMeta($bill_prnt_typ, mcframe.commonMA.meta.MA_META.BILL_PRNT_TYP);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_rcv_flg_META = createCommonMeta($bill_dtl_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_dtl_subttl_typ_META = createCommonMeta($bill_dtl_subttl_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SUBTTL_TYP);
	public static final MCMeta bill_dtl_brk_typ_META = createCommonMeta($bill_dtl_brk_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_BRK_TYP);
	public static final MCMeta bill_dtl_sort_typ_META = createCommonMeta($bill_dtl_sort_typ, mcframe.commonMA.meta.MA_META.BILL_DTL_SORT_TYP);
	public static final MCMeta bill_can_slip_typ_META = createCommonMeta($bill_can_slip_typ, mcframe.commonMA.meta.MA_META.BILL_CAN_SLIP_TYP);
	public static final MCMeta auto_line_appl_flg_META = createCommonMeta($auto_line_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_grp_cd_META = createCommonMeta($ar_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_amt_match_flg_META = createCommonMeta($rcv_amt_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_match_flg_META = createCommonMeta($ar_sttl_typ_match_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_delay_days_META = createCommonMeta($auto_appl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta purc_tax_cd_prio_flg_META = createCommonMeta($purc_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_po_flg_META = createCommonMeta($wrk_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_ap_flg_META = createCommonMeta($wrk_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_rcv_typ_META = createCommonMeta($prov_rcv_typ, mcframe.commonMA.meta.MA_META.PROV_RCV_TYP);
	public static final MCMeta onr_prsppl_flg_META = createCommonMeta($onr_prsppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_upri_cng_flg_META = createCommonMeta($prov_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_amt_rnd_typ_META = createCommonMeta($prov_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_rnd_typ_META = createCommonMeta($prov_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prov_tax_calc_typ_META = createCommonMeta($prov_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_prio_flg_META = createCommonMeta($prov_tax_cd_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_recv_flg_META = createCommonMeta($prms_recv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta psppl_cl_day1_META = createCommonMeta($psppl_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day2_META = createCommonMeta($psppl_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day3_META = createCommonMeta($psppl_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day4_META = createCommonMeta($psppl_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta psppl_cl_day5_META = createCommonMeta($psppl_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta purc_interim_cl_flg_META = createCommonMeta($purc_interim_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_setoff_grp_cd_META = createCommonMeta($ap_setoff_grp_cd, mcframe.commonMA.meta.MA_META.SETOFF_GRP_CD);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta psppl_rmrks_META = createCommonMeta($psppl_rmrks, mcframe.commonMA.meta.MA_META.PSPPL_RMRKS);
	public static final MCMeta note_days_META = createCommonMeta($note_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnsgn_stktk_flg_META = createCommonMeta($cnsgn_stktk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dlv_chnnl1_META = createCommonMeta($dlv_chnnl1, mcframe.commonMA.meta.MA_META.DLV_CHNNL1);
	public static final MCMeta dlv_chnnl2_META = createCommonMeta($dlv_chnnl2, mcframe.commonMA.meta.MA_META.DLV_CHNNL2);
	public static final MCMeta dlv_chnnl3_META = createCommonMeta($dlv_chnnl3, mcframe.commonMA.meta.MA_META.DLV_CHNNL3);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta edi_po_send_tgt_flg_META = createCommonMeta($edi_po_send_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bp_cd_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			ein_META,
			cntry_cd_META,
			cntry_nm_META,
			foreign_flg_META,
			area_cd_META,
			area_nm_META,
			cur_cd_META,
			cur_nm_META,
			cst_flg_META,
			cst_sundry_flg_META,
			acst_flg_META,
			bcst_flg_META,
			rcst_flg_META,
			dlv_flg_META,
			dlv_sundry_flg_META,
			tdlv_flg_META,
			dest_flg_META,
			cred_flg_META,
			sppl_flg_META,
			asppl_flg_META,
			bsppl_flg_META,
			psppl_flg_META,
			maker_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			bp_grp_p_META,
			ins_ts_META,
			upd_ts_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			std_co_cd_META,
			prnt_lcl_cd_META,
			bp_alc_grp_META,
			ar_dpt_typ_META,
			sls_upri_req_typ_META,
			sls_upri_cng_flg_META,
			sls_upri_rnd_typ_META,
			sls_amt_rnd_typ_META,
			sls_tax_calc_typ_META,
			sls_tax_rnd_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			bill_crryovr_times_META,
			lot_back_stop_typ_META,
			slip_each_lot_typ_META,
			cst_ship_form_cd_META,
			stk_lst_issue_flg_META,
			stk_lst_form_cd_META,
			sls_tax_cd_META,
			sls_tax_cd_prio_flg_META,
			wrk_ar_flg_META,
			cst_iv_flg_META,
			cst_tterm_cd1_META,
			cst_tterm_nm1_META,
			cst_tterm_cd2_META,
			cst_tterm_nm2_META,
			cst_tterm_cd3_META,
			cst_tterm_nm3_META,
			sls_anly_cd1_META,
			sls_anly_cd2_META,
			sls_anly_cd3_META,
			acst_cd_META,
			acst_nm_META,
			bcst_cd_META,
			rcst_cd_META,
			ar_cred_cd_META,
			bill_dpt_typ_META,
			bcst_dpt_cd_META,
			bill_cl_typ_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			tax_on_bill_flg_META,
			bill_tax_rnd_typ_META,
			bill_cl_delay_days_META,
			bill_cl_ba_typ_META,
			sls_interim_cl_flg_META,
			bill_cal_cd_META,
			rcv_ba_typ_META,
			bfw_bal_disp_flg_META,
			sls_dtl_outp_typ_META,
			bill_prnt_typ_META,
			bill_dtl_outp_flg_META,
			bill_dtl_rcv_flg_META,
			bill_dtl_subttl_typ_META,
			bill_dtl_brk_typ_META,
			bill_dtl_sort_typ_META,
			bill_can_slip_typ_META,
			auto_line_appl_flg_META,
			ar_setoff_grp_cd_META,
			xfr_psn_META,
			rcv_auto_appl_tgt_flg_META,
			rcv_amt_match_flg_META,
			ar_sttl_typ_match_flg_META,
			calc_com_paid_flg_META,
			auto_appl_delay_days_META,
			asppl_cd_META,
			vmi_purc_dpt_cd_META,
			subcon_flg_META,
			po_print_cd_META,
			sppl_ship_form_cd_META,
			pay_crryovr_times_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			purc_upri_req_typ_META,
			purc_upri_cng_flg_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			purc_tax_cd_META,
			purc_tax_cd_prio_flg_META,
			wrk_po_flg_META,
			wrk_ap_flg_META,
			prov_rcv_typ_META,
			onr_prsppl_flg_META,
			prov_basis_typ_META,
			prov_upri_cng_flg_META,
			prov_amt_rnd_typ_META,
			prov_tax_rnd_typ_META,
			prov_tax_calc_typ_META,
			prov_tax_cd_META,
			prov_tax_cd_prio_flg_META,
			sppl_cal_cd_META,
			sppl_iv_flg_META,
			prms_recv_flg_META,
			sppl_tterm_cd1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_cd3_META,
			bsppl_cd_META,
			ap_dpt_cd_META,
			psppl_cd_META,
			ap_cred_cd_META,
			bsppl_dpt_cd_META,
			pay_spot_flg_META,
			psppl_cl_day1_META,
			psppl_cl_day2_META,
			psppl_cl_day3_META,
			psppl_cl_day4_META,
			psppl_cl_day5_META,
			purc_interim_cl_flg_META,
			ap_setoff_grp_cd_META,
			pay_bank_ac_cd_META,
			psppl_rmrks_META,
			note_days_META,
			pri_prnt_flg_META,
			cnsgn_stktk_flg_META,
			via_dlv_typ_META,
			tdlv_req_flg_META,
			lg_grp_cd_META,
			dlv_cal_cd_META,
			dlv_chnnl1_META,
			dlv_chnnl2_META,
			dlv_chnnl3_META,
			amt_dec_place_META,
			upri_dec_place_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			purc_id_typ_META,
			purc_basis_typ_META,
			purc_usr_cd_META,
			purc_dpt_cd_META,
			edi_po_send_tgt_flg_META
		},
		new String[][]{
			{
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_cd10,
				$bp_grp_nm10
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 1, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 1, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 2, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 2, $bp_nm, value);
	}


	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 3, $bp_alt_nm1);
	}

	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 3, $bp_alt_nm1, value);
	}


	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 4, $bp_alt_nm2);
	}

	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 4, $bp_alt_nm2, value);
	}


	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 5, $bp_alt_nm3);
	}

	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 5, $bp_alt_nm3, value);
	}


	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 6, $bp_alt_nm4);
	}

	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 6, $bp_alt_nm4, value);
	}


	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 7, $ein);
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 7, $ein, value);
	}


	/**
	 * Country 国.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 8, $cntry_cd);
	}

	/**
	 * Country 国.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 8, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 9, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 9, $cntry_nm, value);
	}


	/**
	 * Foreign 国外.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 10, $foreign_flg);
	}

	/**
	 * Foreign 国外.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 10, $foreign_flg, value);
	}


	/**
	 * Region 地域.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 11, $area_cd);
	}

	/**
	 * Region 地域.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 11, $area_cd, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 12, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 12, $area_nm, value);
	}


	/**
	 * Currency 通貨.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 13, $cur_cd);
	}

	/**
	 * Currency 通貨.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 13, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 14, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 14, $cur_nm, value);
	}


	/**
	 * Customer 得意先.<p>
	 *
	 */
	public boolean cst_flg() {
		return getConstBoolean(offset + 15, $cst_flg);
	}

	/**
	 * Customer 得意先.<p>
	 *
	 */
	public void cst_flg(boolean value) {
		setConstBoolean(offset + 15, $cst_flg, value);
	}


	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 16, $cst_sundry_flg);
	}

	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 16, $cst_sundry_flg, value);
	}


	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public boolean acst_flg() {
		return getConstBoolean(offset + 17, $acst_flg);
	}

	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public void acst_flg(boolean value) {
		setConstBoolean(offset + 17, $acst_flg, value);
	}


	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public boolean bcst_flg() {
		return getConstBoolean(offset + 18, $bcst_flg);
	}

	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public void bcst_flg(boolean value) {
		setConstBoolean(offset + 18, $bcst_flg, value);
	}


	/**
	 * Payer 入金先.<p>
	 *
	 */
	public boolean rcst_flg() {
		return getConstBoolean(offset + 19, $rcst_flg);
	}

	/**
	 * Payer 入金先.<p>
	 *
	 */
	public void rcst_flg(boolean value) {
		setConstBoolean(offset + 19, $rcst_flg, value);
	}


	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public boolean dlv_flg() {
		return getConstBoolean(offset + 20, $dlv_flg);
	}

	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public void dlv_flg(boolean value) {
		setConstBoolean(offset + 20, $dlv_flg, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 21, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 21, $dlv_sundry_flg, value);
	}


	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public boolean tdlv_flg() {
		return getConstBoolean(offset + 22, $tdlv_flg);
	}

	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public void tdlv_flg(boolean value) {
		setConstBoolean(offset + 22, $tdlv_flg, value);
	}


	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public boolean dest_flg() {
		return getConstBoolean(offset + 23, $dest_flg);
	}

	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public void dest_flg(boolean value) {
		setConstBoolean(offset + 23, $dest_flg, value);
	}


	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public boolean cred_flg() {
		return getConstBoolean(offset + 24, $cred_flg);
	}

	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public void cred_flg(boolean value) {
		setConstBoolean(offset + 24, $cred_flg, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 25, $sppl_flg);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 25, $sppl_flg, value);
	}


	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public boolean asppl_flg() {
		return getConstBoolean(offset + 26, $asppl_flg);
	}

	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public void asppl_flg(boolean value) {
		setConstBoolean(offset + 26, $asppl_flg, value);
	}


	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public boolean bsppl_flg() {
		return getConstBoolean(offset + 27, $bsppl_flg);
	}

	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public void bsppl_flg(boolean value) {
		setConstBoolean(offset + 27, $bsppl_flg, value);
	}


	/**
	 * Payee 支払先.<p>
	 *
	 */
	public boolean psppl_flg() {
		return getConstBoolean(offset + 28, $psppl_flg);
	}

	/**
	 * Payee 支払先.<p>
	 *
	 */
	public void psppl_flg(boolean value) {
		setConstBoolean(offset + 28, $psppl_flg, value);
	}


	/**
	 * Maker メーカ.<p>
	 *
	 */
	public boolean maker_flg() {
		return getConstBoolean(offset + 29, $maker_flg);
	}

	/**
	 * Maker メーカ.<p>
	 *
	 */
	public void maker_flg(boolean value) {
		setConstBoolean(offset + 29, $maker_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 30, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 30, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 31, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 31, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 32, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 32, $memo3, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 33, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 33, $bp_grp_p, row);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 34, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 35, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $upd_ts, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 36, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 36, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 37, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 37, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 38, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 38, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 39, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 39, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 40, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 40, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 41, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 41, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 42, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 42, $fax, value);
	}


	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 43, $std_co_cd);
	}

	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 43, $std_co_cd, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 44, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 44, $prnt_lcl_cd, value);
	}


	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 45, $bp_alc_grp);
	}

	/**
	 * BP allocation group 取引先配賦グループ.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 45, $bp_alc_grp, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 46, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 46, $ar_dpt_typ, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 47, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 47, $sls_upri_req_typ, value);
	}


	/**
	 * Allow sales unit price change flg. 販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 48, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change flg. 販売単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 48, $sls_upri_cng_flg, value);
	}


	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public String sls_upri_rnd_typ() {
		return getConstString(offset + 49, $sls_upri_rnd_typ);
	}

	/**
	 * Sales unit price rounding type 販売単価端数処理区分.<p>
	 *
	 */
	public void sls_upri_rnd_typ(String value) {
		setConstString(offset + 49, $sls_upri_rnd_typ, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 50, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 50, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public String sls_tax_calc_typ() {
		return getConstString(offset + 51, $sls_tax_calc_typ);
	}

	/**
	 * Sales tax calculation type 売上税計算区分.<p>
	 *
	 */
	public void sls_tax_calc_typ(String value) {
		setConstString(offset + 51, $sls_tax_calc_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 52, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 52, $sls_tax_rnd_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 53, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 53, $sls_basis_typ, value);
	}


	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 54, $bill_basis_typ);
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 54, $bill_basis_typ, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 55, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 55, $ship_schd_split_typ, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 56, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 56, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 56, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 56, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 56, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 56, $bill_crryovr_times, value);
	}


	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public String lot_back_stop_typ() {
		return getConstString(offset + 57, $lot_back_stop_typ);
	}

	/**
	 * Lot reverse prohibit type ロット逆転禁止区分.<p>
	 *
	 */
	public void lot_back_stop_typ(String value) {
		setConstString(offset + 57, $lot_back_stop_typ, value);
	}


	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public String slip_each_lot_typ() {
		return getConstString(offset + 58, $slip_each_lot_typ);
	}

	/**
	 * Lot details split type ロット明細分割区分.<p>
	 *
	 */
	public void slip_each_lot_typ(String value) {
		setConstString(offset + 58, $slip_each_lot_typ, value);
	}


	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public String cst_ship_form_cd() {
		return getConstString(offset + 59, $cst_ship_form_cd);
	}

	/**
	 * Customer delivery note cd. 得意先納品書ＣＤ.<p>
	 *
	 */
	public void cst_ship_form_cd(String value) {
		setConstString(offset + 59, $cst_ship_form_cd, value);
	}


	/**
	 * Identification tag issue flg. 現品票発行ＦＬＧ.<p>
	 *
	 */
	public boolean stk_lst_issue_flg() {
		return getConstBoolean(offset + 60, $stk_lst_issue_flg);
	}

	/**
	 * Identification tag issue flg. 現品票発行ＦＬＧ.<p>
	 *
	 */
	public void stk_lst_issue_flg(boolean value) {
		setConstBoolean(offset + 60, $stk_lst_issue_flg, value);
	}


	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public String stk_lst_form_cd() {
		return getConstString(offset + 61, $stk_lst_form_cd);
	}

	/**
	 * Identification tag cd. 現品票ＣＤ.<p>
	 *
	 */
	public void stk_lst_form_cd(String value) {
		setConstString(offset + 61, $stk_lst_form_cd, value);
	}


	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 62, $sls_tax_cd);
	}

	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 62, $sls_tax_cd, value);
	}


	/**
	 * Sales tax priority flg. 売上税優先ＦＬＧ.<p>
	 *
	 */
	public boolean sls_tax_cd_prio_flg() {
		return getConstBoolean(offset + 63, $sls_tax_cd_prio_flg);
	}

	/**
	 * Sales tax priority flg. 売上税優先ＦＬＧ.<p>
	 *
	 */
	public void sls_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 63, $sls_tax_cd_prio_flg, value);
	}


	/**
	 * AR management by sales project flg. 案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ar_flg() {
		return getConstBoolean(offset + 64, $wrk_ar_flg);
	}

	/**
	 * AR management by sales project flg. 案件別債権管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ar_flg(boolean value) {
		setConstBoolean(offset + 64, $wrk_ar_flg, value);
	}


	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 65, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction flg. 得意先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 65, $cst_iv_flg, value);
	}


	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public String cst_tterm_cd1() {
		return getConstString(offset + 66, $cst_tterm_cd1);
	}

	/**
	 * Customer transaction terms cd. 1 得意先取引条件ＣＤ１.<p>
	 *
	 */
	public void cst_tterm_cd1(String value) {
		setConstString(offset + 66, $cst_tterm_cd1, value);
	}


	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public String cst_tterm_nm1() {
		return getConstString(offset + 67, $cst_tterm_nm1);
	}

	/**
	 * Customer transaction terms name 1 得意先取引条件名１.<p>
	 *
	 */
	public void cst_tterm_nm1(String value) {
		setConstString(offset + 67, $cst_tterm_nm1, value);
	}


	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public String cst_tterm_cd2() {
		return getConstString(offset + 68, $cst_tterm_cd2);
	}

	/**
	 * Customer transaction terms cd. 2 得意先取引条件ＣＤ２.<p>
	 *
	 */
	public void cst_tterm_cd2(String value) {
		setConstString(offset + 68, $cst_tterm_cd2, value);
	}


	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public String cst_tterm_nm2() {
		return getConstString(offset + 69, $cst_tterm_nm2);
	}

	/**
	 * Customer transaction terms name 2 得意先取引条件名２.<p>
	 *
	 */
	public void cst_tterm_nm2(String value) {
		setConstString(offset + 69, $cst_tterm_nm2, value);
	}


	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public String cst_tterm_cd3() {
		return getConstString(offset + 70, $cst_tterm_cd3);
	}

	/**
	 * Customer transaction terms cd. 3 得意先取引条件ＣＤ３.<p>
	 *
	 */
	public void cst_tterm_cd3(String value) {
		setConstString(offset + 70, $cst_tterm_cd3, value);
	}


	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public String cst_tterm_nm3() {
		return getConstString(offset + 71, $cst_tterm_nm3);
	}

	/**
	 * Customer transaction terms name 3 得意先取引条件名３.<p>
	 *
	 */
	public void cst_tterm_nm3(String value) {
		setConstString(offset + 71, $cst_tterm_nm3, value);
	}


	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 72, $sls_anly_cd1);
	}

	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 72, $sls_anly_cd1, value);
	}


	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 73, $sls_anly_cd2);
	}

	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 73, $sls_anly_cd2, value);
	}


	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 74, $sls_anly_cd3);
	}

	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 74, $sls_anly_cd3, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 75, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 75, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 76, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 76, $acst_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 77, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 77, $bcst_cd, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 78, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 78, $rcst_cd, value);
	}


	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public String ar_cred_cd() {
		return getConstString(offset + 79, $ar_cred_cd);
	}

	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public void ar_cred_cd(String value) {
		setConstString(offset + 79, $ar_cred_cd, value);
	}


	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public String bill_dpt_typ() {
		return getConstString(offset + 80, $bill_dpt_typ);
	}

	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public void bill_dpt_typ(String value) {
		setConstString(offset + 80, $bill_dpt_typ, value);
	}


	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 81, $bcst_dpt_cd);
	}

	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 81, $bcst_dpt_cd, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 82, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 82, $bill_cl_typ, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 83, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 83, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 83, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 83, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 83, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 83, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 84, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 84, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 84, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 84, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 84, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 84, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 85, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 85, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 85, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 85, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 85, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 85, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 86, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 86, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 86, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 86, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 86, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 86, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 87, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 87, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 87, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 87, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 87, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 87, $bill_cl_day5, value);
	}


	/**
	 * Billing tax calculation flg. 請求税計算ＦＬＧ.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 88, $tax_on_bill_flg);
	}

	/**
	 * Billing tax calculation flg. 請求税計算ＦＬＧ.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 88, $tax_on_bill_flg, value);
	}


	/**
	 * Billing tax rounding type 請求税端数処理区分.<p>
	 *
	 */
	public String bill_tax_rnd_typ() {
		return getConstString(offset + 89, $bill_tax_rnd_typ);
	}

	/**
	 * Billing tax rounding type 請求税端数処理区分.<p>
	 *
	 */
	public void bill_tax_rnd_typ(String value) {
		setConstString(offset + 89, $bill_tax_rnd_typ, value);
	}


	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCNumber bill_cl_delay_days() {
		return getConstNumber(offset + 90, $bill_cl_delay_days);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 90, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(int value) {
		setConstNumber(offset + 90, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(long value) {
		setConstNumber(offset + 90, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(float value) {
		setConstNumber(offset + 90, $bill_cl_delay_days, value);
	}

	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public void bill_cl_delay_days(double value) {
		setConstNumber(offset + 90, $bill_cl_delay_days, value);
	}


	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public String bill_cl_ba_typ() {
		return getConstString(offset + 91, $bill_cl_ba_typ);
	}

	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public void bill_cl_ba_typ(String value) {
		setConstString(offset + 91, $bill_cl_ba_typ, value);
	}


	/**
	 * Sales temporary unit price closing flg. 売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public boolean sls_interim_cl_flg() {
		return getConstBoolean(offset + 92, $sls_interim_cl_flg);
	}

	/**
	 * Sales temporary unit price closing flg. 売上仮単価締ＦＬＧ.<p>
	 *
	 */
	public void sls_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 92, $sls_interim_cl_flg, value);
	}


	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public String bill_cal_cd() {
		return getConstString(offset + 93, $bill_cal_cd);
	}

	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public void bill_cal_cd(String value) {
		setConstString(offset + 93, $bill_cal_cd, value);
	}


	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public String rcv_ba_typ() {
		return getConstString(offset + 94, $rcv_ba_typ);
	}

	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public void rcv_ba_typ(String value) {
		setConstString(offset + 94, $rcv_ba_typ, value);
	}


	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 95, $bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 95, $bfw_bal_disp_flg, value);
	}


	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public String sls_dtl_outp_typ() {
		return getConstString(offset + 96, $sls_dtl_outp_typ);
	}

	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public void sls_dtl_outp_typ(String value) {
		setConstString(offset + 96, $sls_dtl_outp_typ, value);
	}


	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public String bill_prnt_typ() {
		return getConstString(offset + 97, $bill_prnt_typ);
	}

	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public void bill_prnt_typ(String value) {
		setConstString(offset + 97, $bill_prnt_typ, value);
	}


	/**
	 * Invoice details output flg. 請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 98, $bill_dtl_outp_flg);
	}

	/**
	 * Invoice details output flg. 請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 98, $bill_dtl_outp_flg, value);
	}


	/**
	 * Display payment receipt schedule in invoice details flg. 請求書明細入金予定表示ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_rcv_flg() {
		return getConstBoolean(offset + 99, $bill_dtl_rcv_flg);
	}

	/**
	 * Display payment receipt schedule in invoice details flg. 請求書明細入金予定表示ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_rcv_flg(boolean value) {
		setConstBoolean(offset + 99, $bill_dtl_rcv_flg, value);
	}


	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public String bill_dtl_subttl_typ() {
		return getConstString(offset + 100, $bill_dtl_subttl_typ);
	}

	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public void bill_dtl_subttl_typ(String value) {
		setConstString(offset + 100, $bill_dtl_subttl_typ, value);
	}


	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public String bill_dtl_brk_typ() {
		return getConstString(offset + 101, $bill_dtl_brk_typ);
	}

	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public void bill_dtl_brk_typ(String value) {
		setConstString(offset + 101, $bill_dtl_brk_typ, value);
	}


	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public String bill_dtl_sort_typ() {
		return getConstString(offset + 102, $bill_dtl_sort_typ);
	}

	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public void bill_dtl_sort_typ(String value) {
		setConstString(offset + 102, $bill_dtl_sort_typ, value);
	}


	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public String bill_can_slip_typ() {
		return getConstString(offset + 103, $bill_can_slip_typ);
	}

	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public void bill_can_slip_typ(String value) {
		setConstString(offset + 103, $bill_can_slip_typ, value);
	}


	/**
	 * Details auto-reconciliation flg. 自動明細消込ＦＬＧ.<p>
	 *
	 */
	public boolean auto_line_appl_flg() {
		return getConstBoolean(offset + 104, $auto_line_appl_flg);
	}

	/**
	 * Details auto-reconciliation flg. 自動明細消込ＦＬＧ.<p>
	 *
	 */
	public void auto_line_appl_flg(boolean value) {
		setConstBoolean(offset + 104, $auto_line_appl_flg, value);
	}


	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public String ar_setoff_grp_cd() {
		return getConstString(offset + 105, $ar_setoff_grp_cd);
	}

	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public void ar_setoff_grp_cd(String value) {
		setConstString(offset + 105, $ar_setoff_grp_cd, value);
	}


	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 106, $xfr_psn);
	}

	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 106, $xfr_psn, value);
	}


	/**
	 * For auto-reconciliation flg. 入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 107, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * For auto-reconciliation flg. 入金自動消込対象ＦＬＧ.<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 107, $rcv_auto_appl_tgt_flg, value);
	}


	/**
	 * Match amount flg. 金額考慮ＦＬＧ.<p>
	 *
	 */
	public boolean rcv_amt_match_flg() {
		return getConstBoolean(offset + 108, $rcv_amt_match_flg);
	}

	/**
	 * Match amount flg. 金額考慮ＦＬＧ.<p>
	 *
	 */
	public void rcv_amt_match_flg(boolean value) {
		setConstBoolean(offset + 108, $rcv_amt_match_flg, value);
	}


	/**
	 * Match payment option flg. 金種考慮ＦＬＧ.<p>
	 *
	 */
	public boolean ar_sttl_typ_match_flg() {
		return getConstBoolean(offset + 109, $ar_sttl_typ_match_flg);
	}

	/**
	 * Match payment option flg. 金種考慮ＦＬＧ.<p>
	 *
	 */
	public void ar_sttl_typ_match_flg(boolean value) {
		setConstBoolean(offset + 109, $ar_sttl_typ_match_flg, value);
	}


	/**
	 * Fee calculation flg. 手数料計算ＦＬＧ.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 110, $calc_com_paid_flg);
	}

	/**
	 * Fee calculation flg. 手数料計算ＦＬＧ.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 110, $calc_com_paid_flg, value);
	}


	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumber auto_appl_delay_days() {
		return getConstNumber(offset + 111, $auto_appl_delay_days);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(MCNumber value) {
		setConstNumber(offset + 111, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(int value) {
		setConstNumber(offset + 111, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(long value) {
		setConstNumber(offset + 111, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(float value) {
		setConstNumber(offset + 111, $auto_appl_delay_days, value);
	}

	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public void auto_appl_delay_days(double value) {
		setConstNumber(offset + 111, $auto_appl_delay_days, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 112, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 112, $asppl_cd, value);
	}


	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 113, $vmi_purc_dpt_cd);
	}

	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 113, $vmi_purc_dpt_cd, value);
	}


	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 114, $subcon_flg);
	}

	/**
	 * For subcontract flg. 下請対象ＦＬＧ.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 114, $subcon_flg, value);
	}


	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 115, $po_print_cd);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 115, $po_print_cd, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 116, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 116, $sppl_ship_form_cd, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 117, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 117, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 117, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 117, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 117, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 117, $pay_crryovr_times, value);
	}


	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 118, $sppl_cntct_dpt);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 118, $sppl_cntct_dpt, value);
	}


	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 119, $sppl_cntct_psn);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 119, $sppl_cntct_psn, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 120, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 120, $purc_upri_req_typ, value);
	}


	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 121, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change flg. 購買単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 121, $purc_upri_cng_flg, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 122, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 122, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 123, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 123, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 124, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 124, $purc_tax_calc_typ, value);
	}


	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 125, $purc_tax_cd);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 125, $purc_tax_cd, value);
	}


	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public boolean purc_tax_cd_prio_flg() {
		return getConstBoolean(offset + 126, $purc_tax_cd_prio_flg);
	}

	/**
	 * Purchase tax priority flg. 仕入税優先ＦＬＧ.<p>
	 *
	 */
	public void purc_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 126, $purc_tax_cd_prio_flg, value);
	}


	/**
	 * PO sheet by sales project flg. 案件別注文書ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_po_flg() {
		return getConstBoolean(offset + 127, $wrk_po_flg);
	}

	/**
	 * PO sheet by sales project flg. 案件別注文書ＦＬＧ.<p>
	 *
	 */
	public void wrk_po_flg(boolean value) {
		setConstBoolean(offset + 127, $wrk_po_flg, value);
	}


	/**
	 * AP management by sales project flg. 案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public boolean wrk_ap_flg() {
		return getConstBoolean(offset + 128, $wrk_ap_flg);
	}

	/**
	 * AP management by sales project flg. 案件別債務管理ＦＬＧ.<p>
	 *
	 */
	public void wrk_ap_flg(boolean value) {
		setConstBoolean(offset + 128, $wrk_ap_flg, value);
	}


	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public String prov_rcv_typ() {
		return getConstString(offset + 129, $prov_rcv_typ);
	}

	/**
	 * In-transit supply management type 支給積送管理区分.<p>
	 *
	 */
	public void prov_rcv_typ(String value) {
		setConstString(offset + 129, $prov_rcv_typ, value);
	}


	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public boolean onr_prsppl_flg() {
		return getConstBoolean(offset + 130, $onr_prsppl_flg);
	}

	/**
	 * Chargeable supplier flg. 有償支給先ＦＬＧ.<p>
	 *
	 */
	public void onr_prsppl_flg(boolean value) {
		setConstBoolean(offset + 130, $onr_prsppl_flg, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 131, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 131, $prov_basis_typ, value);
	}


	/**
	 * Allow supply unit price change flg. 支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public boolean prov_upri_cng_flg() {
		return getConstBoolean(offset + 132, $prov_upri_cng_flg);
	}

	/**
	 * Allow supply unit price change flg. 支給単価変更許可ＦＬＧ.<p>
	 *
	 */
	public void prov_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 132, $prov_upri_cng_flg, value);
	}


	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public String prov_amt_rnd_typ() {
		return getConstString(offset + 133, $prov_amt_rnd_typ);
	}

	/**
	 * Supply amount rounding type 支給金額端数処理区分.<p>
	 *
	 */
	public void prov_amt_rnd_typ(String value) {
		setConstString(offset + 133, $prov_amt_rnd_typ, value);
	}


	/**
	 * Supply tax rounding type 支給税端数処理区分.<p>
	 *
	 */
	public String prov_tax_rnd_typ() {
		return getConstString(offset + 134, $prov_tax_rnd_typ);
	}

	/**
	 * Supply tax rounding type 支給税端数処理区分.<p>
	 *
	 */
	public void prov_tax_rnd_typ(String value) {
		setConstString(offset + 134, $prov_tax_rnd_typ, value);
	}


	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public String prov_tax_calc_typ() {
		return getConstString(offset + 135, $prov_tax_calc_typ);
	}

	/**
	 * Supply tax calculation type 支給税計算区分.<p>
	 *
	 */
	public void prov_tax_calc_typ(String value) {
		setConstString(offset + 135, $prov_tax_calc_typ, value);
	}


	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 136, $prov_tax_cd);
	}

	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 136, $prov_tax_cd, value);
	}


	/**
	 * Supply tax priority flg. 支給税優先ＦＬＧ.<p>
	 *
	 */
	public boolean prov_tax_cd_prio_flg() {
		return getConstBoolean(offset + 137, $prov_tax_cd_prio_flg);
	}

	/**
	 * Supply tax priority flg. 支給税優先ＦＬＧ.<p>
	 *
	 */
	public void prov_tax_cd_prio_flg(boolean value) {
		setConstBoolean(offset + 137, $prov_tax_cd_prio_flg, value);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 138, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 138, $sppl_cal_cd, value);
	}


	/**
	 * Supplier invoice transaction flg. 発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 139, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction flg. 発注先インボイス取引ＦＬＧ.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 139, $sppl_iv_flg, value);
	}


	/**
	 * Order promising check flg. 納期回答確認ＦＬＧ.<p>
	 *
	 */
	public boolean prms_recv_flg() {
		return getConstBoolean(offset + 140, $prms_recv_flg);
	}

	/**
	 * Order promising check flg. 納期回答確認ＦＬＧ.<p>
	 *
	 */
	public void prms_recv_flg(boolean value) {
		setConstBoolean(offset + 140, $prms_recv_flg, value);
	}


	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 141, $sppl_tterm_cd1);
	}

	/**
	 * Supplier transaction terms cd. 1 発注先取引条件ＣＤ１.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 141, $sppl_tterm_cd1, value);
	}


	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 142, $sppl_tterm_cd2);
	}

	/**
	 * Supplier transaction terms cd. 2 発注先取引条件ＣＤ２.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 142, $sppl_tterm_cd2, value);
	}


	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 143, $sppl_tterm_cd3);
	}

	/**
	 * Supplier transaction terms cd. 3 発注先取引条件ＣＤ３.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 143, $sppl_tterm_cd3, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 144, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 144, $bsppl_cd, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 145, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 145, $ap_dpt_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 146, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 146, $psppl_cd, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 147, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 147, $ap_cred_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 148, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 148, $bsppl_dpt_cd, value);
	}


	/**
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 149, $pay_spot_flg);
	}

	/**
	 * Payment per transaction flg. 都度支払ＦＬＧ.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 149, $pay_spot_flg, value);
	}


	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumber psppl_cl_day1() {
		return getConstNumber(offset + 150, $psppl_cl_day1);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(MCNumber value) {
		setConstNumber(offset + 150, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(int value) {
		setConstNumber(offset + 150, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(long value) {
		setConstNumber(offset + 150, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(float value) {
		setConstNumber(offset + 150, $psppl_cl_day1, value);
	}

	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public void psppl_cl_day1(double value) {
		setConstNumber(offset + 150, $psppl_cl_day1, value);
	}


	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumber psppl_cl_day2() {
		return getConstNumber(offset + 151, $psppl_cl_day2);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(MCNumber value) {
		setConstNumber(offset + 151, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(int value) {
		setConstNumber(offset + 151, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(long value) {
		setConstNumber(offset + 151, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(float value) {
		setConstNumber(offset + 151, $psppl_cl_day2, value);
	}

	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public void psppl_cl_day2(double value) {
		setConstNumber(offset + 151, $psppl_cl_day2, value);
	}


	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumber psppl_cl_day3() {
		return getConstNumber(offset + 152, $psppl_cl_day3);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(MCNumber value) {
		setConstNumber(offset + 152, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(int value) {
		setConstNumber(offset + 152, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(long value) {
		setConstNumber(offset + 152, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(float value) {
		setConstNumber(offset + 152, $psppl_cl_day3, value);
	}

	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public void psppl_cl_day3(double value) {
		setConstNumber(offset + 152, $psppl_cl_day3, value);
	}


	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumber psppl_cl_day4() {
		return getConstNumber(offset + 153, $psppl_cl_day4);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(MCNumber value) {
		setConstNumber(offset + 153, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(int value) {
		setConstNumber(offset + 153, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(long value) {
		setConstNumber(offset + 153, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(float value) {
		setConstNumber(offset + 153, $psppl_cl_day4, value);
	}

	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public void psppl_cl_day4(double value) {
		setConstNumber(offset + 153, $psppl_cl_day4, value);
	}


	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumber psppl_cl_day5() {
		return getConstNumber(offset + 154, $psppl_cl_day5);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(MCNumber value) {
		setConstNumber(offset + 154, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(int value) {
		setConstNumber(offset + 154, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(long value) {
		setConstNumber(offset + 154, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(float value) {
		setConstNumber(offset + 154, $psppl_cl_day5, value);
	}

	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public void psppl_cl_day5(double value) {
		setConstNumber(offset + 154, $psppl_cl_day5, value);
	}


	/**
	 * Purchase temporary unit price closing flg. 仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public boolean purc_interim_cl_flg() {
		return getConstBoolean(offset + 155, $purc_interim_cl_flg);
	}

	/**
	 * Purchase temporary unit price closing flg. 仕入仮単価締ＦＬＧ.<p>
	 *
	 */
	public void purc_interim_cl_flg(boolean value) {
		setConstBoolean(offset + 155, $purc_interim_cl_flg, value);
	}


	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public String ap_setoff_grp_cd() {
		return getConstString(offset + 156, $ap_setoff_grp_cd);
	}

	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public void ap_setoff_grp_cd(String value) {
		setConstString(offset + 156, $ap_setoff_grp_cd, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 157, $pay_bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 157, $pay_bank_ac_cd, value);
	}


	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public String psppl_rmrks() {
		return getConstString(offset + 158, $psppl_rmrks);
	}

	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public void psppl_rmrks(String value) {
		setConstString(offset + 158, $psppl_rmrks, value);
	}


	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumber note_days() {
		return getConstNumber(offset + 159, $note_days);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(MCNumber value) {
		setConstNumber(offset + 159, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(int value) {
		setConstNumber(offset + 159, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(long value) {
		setConstNumber(offset + 159, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(float value) {
		setConstNumber(offset + 159, $note_days, value);
	}

	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public void note_days(double value) {
		setConstNumber(offset + 159, $note_days, value);
	}


	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 160, $pri_prnt_flg);
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 160, $pri_prnt_flg, value);
	}


	/**
	 * For consignment inventory count flg. 貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public boolean cnsgn_stktk_flg() {
		return getConstBoolean(offset + 161, $cnsgn_stktk_flg);
	}

	/**
	 * For consignment inventory count flg. 貸出在庫棚卸対象ＦＬＧ.<p>
	 *
	 */
	public void cnsgn_stktk_flg(boolean value) {
		setConstBoolean(offset + 161, $cnsgn_stktk_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 162, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 162, $via_dlv_typ, value);
	}


	/**
	 * Receiving point required flg. 配送先必須ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 163, $tdlv_req_flg);
	}

	/**
	 * Receiving point required flg. 配送先必須ＦＬＧ.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 163, $tdlv_req_flg, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 164, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 164, $lg_grp_cd, value);
	}


	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public String dlv_cal_cd() {
		return getConstString(offset + 165, $dlv_cal_cd);
	}

	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public void dlv_cal_cd(String value) {
		setConstString(offset + 165, $dlv_cal_cd, value);
	}


	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public String dlv_chnnl1() {
		return getConstString(offset + 166, $dlv_chnnl1);
	}

	/**
	 * Delivery destination channel 1 納品先チャネル１.<p>
	 *
	 */
	public void dlv_chnnl1(String value) {
		setConstString(offset + 166, $dlv_chnnl1, value);
	}


	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public String dlv_chnnl2() {
		return getConstString(offset + 167, $dlv_chnnl2);
	}

	/**
	 * Delivery destination channel 2 納品先チャネル２.<p>
	 *
	 */
	public void dlv_chnnl2(String value) {
		setConstString(offset + 167, $dlv_chnnl2, value);
	}


	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public String dlv_chnnl3() {
		return getConstString(offset + 168, $dlv_chnnl3);
	}

	/**
	 * Delivery destination channel 3 納品先チャネル３.<p>
	 *
	 */
	public void dlv_chnnl3(String value) {
		setConstString(offset + 168, $dlv_chnnl3, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 169, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 169, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 169, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 169, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 169, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 169, $amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 170, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 170, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 170, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 170, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 170, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 170, $upri_dec_place, value);
	}


	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 171, $rqst_wg_cd);
	}

	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 171, $rqst_wg_cd, value);
	}


	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 172, $rqst_wg_nm);
	}

	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 172, $rqst_wg_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 173, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 173, $purc_id_typ, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 174, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 174, $purc_basis_typ, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 175, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 175, $purc_usr_cd, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 176, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 176, $purc_dpt_cd, value);
	}


	/**
	 * For EDI PO export ＥＤＩ発注送信対象.<p>
	 *
	 */
	public boolean edi_po_send_tgt_flg() {
		return getConstBoolean(offset + 177, $edi_po_send_tgt_flg);
	}

	/**
	 * For EDI PO export ＥＤＩ発注送信対象.<p>
	 *
	 */
	public void edi_po_send_tgt_flg(boolean value) {
		setConstBoolean(offset + 177, $edi_po_send_tgt_flg, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		return super.getNumber(name);
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
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($edi_po_send_tgt_flg.equalsIgnoreCase(name)) {
			return edi_po_send_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			return sls_upri_rnd_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			return sls_tax_calc_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			return lot_back_stop_typ();
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			return slip_each_lot_typ();
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			return cst_ship_form_cd();
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			return stk_lst_form_cd();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			return cst_tterm_cd1();
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			return cst_tterm_nm1();
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			return cst_tterm_cd2();
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			return cst_tterm_nm2();
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			return cst_tterm_cd3();
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			return cst_tterm_nm3();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			return ar_cred_cd();
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			return bill_dpt_typ();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			return bill_tax_rnd_typ();
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			return bill_cl_ba_typ();
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			return bill_cal_cd();
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			return rcv_ba_typ();
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			return sls_dtl_outp_typ();
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			return bill_prnt_typ();
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			return bill_dtl_subttl_typ();
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			return bill_dtl_brk_typ();
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			return bill_dtl_sort_typ();
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			return bill_can_slip_typ();
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ar_setoff_grp_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			return prov_rcv_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			return prov_amt_rnd_typ();
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			return prov_tax_rnd_typ();
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			return prov_tax_calc_typ();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			return ap_setoff_grp_cd();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			return psppl_rmrks();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			return dlv_chnnl1();
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			return dlv_chnnl2();
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			return dlv_chnnl3();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			return bill_cl_delay_days();
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			return auto_appl_delay_days();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			return psppl_cl_day1();
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			return psppl_cl_day2();
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			return psppl_cl_day3();
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			return psppl_cl_day4();
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			return psppl_cl_day5();
		}
		if ($note_days.equalsIgnoreCase(name)) {
			return note_days();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		return super.getNumberNE(name);
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
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			return cst_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			return acst_flg();
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			return bcst_flg();
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			return rcst_flg();
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			return dlv_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			return tdlv_flg();
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			return dest_flg();
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			return cred_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			return asppl_flg();
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			return bsppl_flg();
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			return psppl_flg();
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			return maker_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			return stk_lst_issue_flg();
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return sls_tax_cd_prio_flg();
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			return wrk_ar_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			return sls_interim_cl_flg();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			return bill_dtl_rcv_flg();
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			return auto_line_appl_flg();
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			return rcv_amt_match_flg();
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			return ar_sttl_typ_match_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return purc_tax_cd_prio_flg();
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			return wrk_po_flg();
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			return wrk_ap_flg();
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			return onr_prsppl_flg();
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			return prov_upri_cng_flg();
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			return prov_tax_cd_prio_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			return prms_recv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			return purc_interim_cl_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			return cnsgn_stktk_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($edi_po_send_tgt_flg.equalsIgnoreCase(name)) {
			return edi_po_send_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($edi_po_send_tgt_flg.equalsIgnoreCase(name)) {
			edi_po_send_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($sls_upri_rnd_typ.equalsIgnoreCase(name)) {
			sls_upri_rnd_typ(value);
			return;
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			sls_amt_rnd_typ(value);
			return;
		}
		if ($sls_tax_calc_typ.equalsIgnoreCase(name)) {
			sls_tax_calc_typ(value);
			return;
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			sls_tax_rnd_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($lot_back_stop_typ.equalsIgnoreCase(name)) {
			lot_back_stop_typ(value);
			return;
		}
		if ($slip_each_lot_typ.equalsIgnoreCase(name)) {
			slip_each_lot_typ(value);
			return;
		}
		if ($cst_ship_form_cd.equalsIgnoreCase(name)) {
			cst_ship_form_cd(value);
			return;
		}
		if ($stk_lst_form_cd.equalsIgnoreCase(name)) {
			stk_lst_form_cd(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($cst_tterm_cd1.equalsIgnoreCase(name)) {
			cst_tterm_cd1(value);
			return;
		}
		if ($cst_tterm_nm1.equalsIgnoreCase(name)) {
			cst_tterm_nm1(value);
			return;
		}
		if ($cst_tterm_cd2.equalsIgnoreCase(name)) {
			cst_tterm_cd2(value);
			return;
		}
		if ($cst_tterm_nm2.equalsIgnoreCase(name)) {
			cst_tterm_nm2(value);
			return;
		}
		if ($cst_tterm_cd3.equalsIgnoreCase(name)) {
			cst_tterm_cd3(value);
			return;
		}
		if ($cst_tterm_nm3.equalsIgnoreCase(name)) {
			cst_tterm_nm3(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($ar_cred_cd.equalsIgnoreCase(name)) {
			ar_cred_cd(value);
			return;
		}
		if ($bill_dpt_typ.equalsIgnoreCase(name)) {
			bill_dpt_typ(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_rnd_typ.equalsIgnoreCase(name)) {
			bill_tax_rnd_typ(value);
			return;
		}
		if ($bill_cl_ba_typ.equalsIgnoreCase(name)) {
			bill_cl_ba_typ(value);
			return;
		}
		if ($bill_cal_cd.equalsIgnoreCase(name)) {
			bill_cal_cd(value);
			return;
		}
		if ($rcv_ba_typ.equalsIgnoreCase(name)) {
			rcv_ba_typ(value);
			return;
		}
		if ($sls_dtl_outp_typ.equalsIgnoreCase(name)) {
			sls_dtl_outp_typ(value);
			return;
		}
		if ($bill_prnt_typ.equalsIgnoreCase(name)) {
			bill_prnt_typ(value);
			return;
		}
		if ($bill_dtl_subttl_typ.equalsIgnoreCase(name)) {
			bill_dtl_subttl_typ(value);
			return;
		}
		if ($bill_dtl_brk_typ.equalsIgnoreCase(name)) {
			bill_dtl_brk_typ(value);
			return;
		}
		if ($bill_dtl_sort_typ.equalsIgnoreCase(name)) {
			bill_dtl_sort_typ(value);
			return;
		}
		if ($bill_can_slip_typ.equalsIgnoreCase(name)) {
			bill_can_slip_typ(value);
			return;
		}
		if ($ar_setoff_grp_cd.equalsIgnoreCase(name)) {
			ar_setoff_grp_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_rcv_typ.equalsIgnoreCase(name)) {
			prov_rcv_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_amt_rnd_typ.equalsIgnoreCase(name)) {
			prov_amt_rnd_typ(value);
			return;
		}
		if ($prov_tax_rnd_typ.equalsIgnoreCase(name)) {
			prov_tax_rnd_typ(value);
			return;
		}
		if ($prov_tax_calc_typ.equalsIgnoreCase(name)) {
			prov_tax_calc_typ(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($ap_setoff_grp_cd.equalsIgnoreCase(name)) {
			ap_setoff_grp_cd(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($psppl_rmrks.equalsIgnoreCase(name)) {
			psppl_rmrks(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
			return;
		}
		if ($dlv_chnnl1.equalsIgnoreCase(name)) {
			dlv_chnnl1(value);
			return;
		}
		if ($dlv_chnnl2.equalsIgnoreCase(name)) {
			dlv_chnnl2(value);
			return;
		}
		if ($dlv_chnnl3.equalsIgnoreCase(name)) {
			dlv_chnnl3(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($bill_cl_delay_days.equalsIgnoreCase(name)) {
			bill_cl_delay_days(value);
			return;
		}
		if ($auto_appl_delay_days.equalsIgnoreCase(name)) {
			auto_appl_delay_days(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($psppl_cl_day1.equalsIgnoreCase(name)) {
			psppl_cl_day1(value);
			return;
		}
		if ($psppl_cl_day2.equalsIgnoreCase(name)) {
			psppl_cl_day2(value);
			return;
		}
		if ($psppl_cl_day3.equalsIgnoreCase(name)) {
			psppl_cl_day3(value);
			return;
		}
		if ($psppl_cl_day4.equalsIgnoreCase(name)) {
			psppl_cl_day4(value);
			return;
		}
		if ($psppl_cl_day5.equalsIgnoreCase(name)) {
			psppl_cl_day5(value);
			return;
		}
		if ($note_days.equalsIgnoreCase(name)) {
			note_days(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($cst_flg.equalsIgnoreCase(name)) {
			cst_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($acst_flg.equalsIgnoreCase(name)) {
			acst_flg(value);
			return;
		}
		if ($bcst_flg.equalsIgnoreCase(name)) {
			bcst_flg(value);
			return;
		}
		if ($rcst_flg.equalsIgnoreCase(name)) {
			rcst_flg(value);
			return;
		}
		if ($dlv_flg.equalsIgnoreCase(name)) {
			dlv_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_flg.equalsIgnoreCase(name)) {
			tdlv_flg(value);
			return;
		}
		if ($dest_flg.equalsIgnoreCase(name)) {
			dest_flg(value);
			return;
		}
		if ($cred_flg.equalsIgnoreCase(name)) {
			cred_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($asppl_flg.equalsIgnoreCase(name)) {
			asppl_flg(value);
			return;
		}
		if ($bsppl_flg.equalsIgnoreCase(name)) {
			bsppl_flg(value);
			return;
		}
		if ($psppl_flg.equalsIgnoreCase(name)) {
			psppl_flg(value);
			return;
		}
		if ($maker_flg.equalsIgnoreCase(name)) {
			maker_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($stk_lst_issue_flg.equalsIgnoreCase(name)) {
			stk_lst_issue_flg(value);
			return;
		}
		if ($sls_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			sls_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_ar_flg.equalsIgnoreCase(name)) {
			wrk_ar_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		if ($sls_interim_cl_flg.equalsIgnoreCase(name)) {
			sls_interim_cl_flg(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		if ($bill_dtl_rcv_flg.equalsIgnoreCase(name)) {
			bill_dtl_rcv_flg(value);
			return;
		}
		if ($auto_line_appl_flg.equalsIgnoreCase(name)) {
			auto_line_appl_flg(value);
			return;
		}
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($rcv_amt_match_flg.equalsIgnoreCase(name)) {
			rcv_amt_match_flg(value);
			return;
		}
		if ($ar_sttl_typ_match_flg.equalsIgnoreCase(name)) {
			ar_sttl_typ_match_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
			return;
		}
		if ($purc_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			purc_tax_cd_prio_flg(value);
			return;
		}
		if ($wrk_po_flg.equalsIgnoreCase(name)) {
			wrk_po_flg(value);
			return;
		}
		if ($wrk_ap_flg.equalsIgnoreCase(name)) {
			wrk_ap_flg(value);
			return;
		}
		if ($onr_prsppl_flg.equalsIgnoreCase(name)) {
			onr_prsppl_flg(value);
			return;
		}
		if ($prov_upri_cng_flg.equalsIgnoreCase(name)) {
			prov_upri_cng_flg(value);
			return;
		}
		if ($prov_tax_cd_prio_flg.equalsIgnoreCase(name)) {
			prov_tax_cd_prio_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($prms_recv_flg.equalsIgnoreCase(name)) {
			prms_recv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_interim_cl_flg.equalsIgnoreCase(name)) {
			purc_interim_cl_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($cnsgn_stktk_flg.equalsIgnoreCase(name)) {
			cnsgn_stktk_flg(value);
			return;
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($edi_po_send_tgt_flg.equalsIgnoreCase(name)) {
			edi_po_send_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

