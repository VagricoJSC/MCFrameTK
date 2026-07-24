package mcframe.clientMABC.MABCP0020;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public static final String $co_alt_nm1 = "co_alt_nm1";
	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public static final String $co_alt_nm2 = "co_alt_nm2";
	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public static final String $co_alt_nm3 = "co_alt_nm3";
	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public static final String $co_alt_nm4 = "co_alt_nm4";
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
	 * Representative name 代表者名.<p>
	 *
	 */
	public static final String $co_repl_nm = "co_repl_nm";
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public static final String $ein = "ein";
	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public static final String $st_mon = "st_mon";
	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public static final String $dt_switch_time = "dt_switch_time";
	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public static final String $ac_cl_day = "ac_cl_day";
	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public static final String $ac_cl_mon_base = "ac_cl_mon_base";
	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public static final String $std_cal_cd = "std_cal_cd";
	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public static final String $bill_cl_cal_cd = "bill_cl_cal_cd";
	/**
	 * AR not used 債権不使用.<p>
	 *
	 */
	public static final String $ar_no_use_flg = "ar_no_use_flg";
	/**
	 * AP not used 債務不使用.<p>
	 *
	 */
	public static final String $ap_no_use_flg = "ap_no_use_flg";
	/**
	 * Temporary AP use 暫定買掛使用.<p>
	 *
	 */
	public static final String $temp_ap_use_flg = "temp_ap_use_flg";
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public static final String $stk_cl_cal_cd = "stk_cl_cal_cd";
	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public static final String $sls_cl_cal_cd = "sls_cl_cal_cd";
	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public static final String $rcv_cl_cal_cd = "rcv_cl_cal_cd";
	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public static final String $purc_cl_cal_cd = "purc_cl_cal_cd";
	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public static final String $pay_cl_cal_cd = "pay_cl_cal_cd";
	/**
	 * Payment schedule closing calendar cd. 支払予定締カレンダＣＤ.<p>
	 *
	 */
	public static final String $pay_schd_cl_cal_cd = "pay_schd_cl_cal_cd";
	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public static final String $stk_cl_delay_days = "stk_cl_delay_days";
	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public static final String $stk_cl_ba_typ = "stk_cl_ba_typ";
	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public static final String $sls_cl_delay_days = "sls_cl_delay_days";
	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public static final String $sls_cl_ba_typ = "sls_cl_ba_typ";
	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public static final String $rcv_cl_delay_days = "rcv_cl_delay_days";
	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public static final String $rcv_cl_ba_typ = "rcv_cl_ba_typ";
	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public static final String $purc_cl_delay_days = "purc_cl_delay_days";
	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public static final String $purc_cl_ba_typ = "purc_cl_ba_typ";
	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public static final String $pay_cl_delay_days = "pay_cl_delay_days";
	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public static final String $pay_cl_ba_typ = "pay_cl_ba_typ";
	/**
	 * Convert at exchange rate upon billing 請求時為替レート換算.<p>
	 *
	 */
	public static final String $bill_xrate_conv_flg = "bill_xrate_conv_flg";
	/**
	 * Convert at exchange rate upon payment collation 支払照合時為替レート換算.<p>
	 *
	 */
	public static final String $pay_xrate_conv_flg = "pay_xrate_conv_flg";
	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public static final String $sls_xrate_cd = "sls_xrate_cd";
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public static final String $purc_xrate_cd = "purc_xrate_cd";
	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public static final String $prov_xrate_cd = "prov_xrate_cd";
	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public static final String $bill_xrate_cd = "bill_xrate_cd";
	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public static final String $pay_xrate_cd = "pay_xrate_cd";
	/**
	 * January １月.<p>
	 *
	 */
	public static final String $mon01_xrate_rev_flg = "mon01_xrate_rev_flg";
	/**
	 * February ２月.<p>
	 *
	 */
	public static final String $mon02_xrate_rev_flg = "mon02_xrate_rev_flg";
	/**
	 * March ３月.<p>
	 *
	 */
	public static final String $mon03_xrate_rev_flg = "mon03_xrate_rev_flg";
	/**
	 * April ４月.<p>
	 *
	 */
	public static final String $mon04_xrate_rev_flg = "mon04_xrate_rev_flg";
	/**
	 * May ５月.<p>
	 *
	 */
	public static final String $mon05_xrate_rev_flg = "mon05_xrate_rev_flg";
	/**
	 * June ６月.<p>
	 *
	 */
	public static final String $mon06_xrate_rev_flg = "mon06_xrate_rev_flg";
	/**
	 * July ７月.<p>
	 *
	 */
	public static final String $mon07_xrate_rev_flg = "mon07_xrate_rev_flg";
	/**
	 * August ８月.<p>
	 *
	 */
	public static final String $mon08_xrate_rev_flg = "mon08_xrate_rev_flg";
	/**
	 * September ９月.<p>
	 *
	 */
	public static final String $mon09_xrate_rev_flg = "mon09_xrate_rev_flg";
	/**
	 * October １０月.<p>
	 *
	 */
	public static final String $mon10_xrate_rev_flg = "mon10_xrate_rev_flg";
	/**
	 * November １１月.<p>
	 *
	 */
	public static final String $mon11_xrate_rev_flg = "mon11_xrate_rev_flg";
	/**
	 * December １２月.<p>
	 *
	 */
	public static final String $mon12_xrate_rev_flg = "mon12_xrate_rev_flg";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
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
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public static final String $xfr_stk_mng_typ = "xfr_stk_mng_typ";
	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public static final String $setoff_tax_rnd_typ = "setoff_tax_rnd_typ";
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public static final String $com_paid_tax_rnd_typ = "com_paid_tax_rnd_typ";
	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public static final String $stk_amt_rnd_typ = "stk_amt_rnd_typ";
	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public static final String $stk_amt_dec_place = "stk_amt_dec_place";
	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public static final String $stk_lst_cnf_num = "stk_lst_cnf_num";
	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public static final String $stk_lst_limit_num = "stk_lst_limit_num";
	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public static final String $gm_std_upri_typ = "gm_std_upri_typ";
	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public static final String $stk_std_upri_typ = "stk_std_upri_typ";
	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public static final String $early_ship_dt_add_days = "early_ship_dt_add_days";
	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public static final String $ac_slip_digit = "ac_slip_digit";
	/**
	 * Debit and credit details number 貸借明細番号.<p>
	 *
	 */
	public static final String $ac_slip_seq_flg = "ac_slip_seq_flg";
	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public static final String $sls_bdj_rnd_typ = "sls_bdj_rnd_typ";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public static final String $std_cal_nm = "std_cal_nm";
	/**
	 * Inventory closing calendar name 在庫締カレンダ名.<p>
	 *
	 */
	public static final String $stk_cl_cal_nm = "stk_cl_cal_nm";
	/**
	 * Sales closing calendar name 売上締カレンダ名.<p>
	 *
	 */
	public static final String $sls_cl_cal_nm = "sls_cl_cal_nm";
	/**
	 * Billing closing calendar name 請求締カレンダ名.<p>
	 *
	 */
	public static final String $bill_cl_cal_nm = "bill_cl_cal_nm";
	/**
	 * Payment received closing calendar name 入金締カレンダ名.<p>
	 *
	 */
	public static final String $rcv_cl_cal_nm = "rcv_cl_cal_nm";
	/**
	 * Purchase closing calendar name 仕入締カレンダ名.<p>
	 *
	 */
	public static final String $purc_cl_cal_nm = "purc_cl_cal_nm";
	/**
	 * Payment closing calendar name 支払締カレンダ名.<p>
	 *
	 */
	public static final String $pay_cl_cal_nm = "pay_cl_cal_nm";
	/**
	 * Payment schedule closing calendar name 支払予定締カレンダ名.<p>
	 *
	 */
	public static final String $pay_schd_cl_cal_nm = "pay_schd_cl_cal_nm";
	/**
	 * Sales exchange rate name 売上為替レート名.<p>
	 *
	 */
	public static final String $sls_xrate_nm = "sls_xrate_nm";
	/**
	 * Purchase exchange rate name 仕入為替レート名.<p>
	 *
	 */
	public static final String $purc_xrate_nm = "purc_xrate_nm";
	/**
	 * Supply exchange rate name 支給為替レート名.<p>
	 *
	 */
	public static final String $prov_xrate_nm = "prov_xrate_nm";
	/**
	 * Billing exchange rate name 請求為替レート名.<p>
	 *
	 */
	public static final String $bill_xrate_nm = "bill_xrate_nm";
	/**
	 * Payment collation exchange rate name 支払照合為替レート名.<p>
	 *
	 */
	public static final String $pay_xrate_nm = "pay_xrate_nm";
	/**
	 * Inventory closing day before/after type name 在庫締日前後区分名.<p>
	 *
	 */
	public static final String $stk_cl_ba_typ_nm = "stk_cl_ba_typ_nm";
	/**
	 * Before/after sales closing day type name 売上締日前後区分名.<p>
	 *
	 */
	public static final String $sls_cl_ba_typ_nm = "sls_cl_ba_typ_nm";
	/**
	 * Before/after payment received closing day type name 入金締日前後区分名.<p>
	 *
	 */
	public static final String $rcv_cl_ba_typ_nm = "rcv_cl_ba_typ_nm";
	/**
	 * Before/after purchase closing day type name 仕入締日前後区分名.<p>
	 *
	 */
	public static final String $purc_cl_ba_typ_nm = "purc_cl_ba_typ_nm";
	/**
	 * Before/after payment closing day type name 支払締日前後区分名.<p>
	 *
	 */
	public static final String $pay_cl_ba_typ_nm = "pay_cl_ba_typ_nm";
	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public static final String $sls_upri_req_typ_nm = "sls_upri_req_typ_nm";
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public static final String $purc_upri_req_typ_nm = "purc_upri_req_typ_nm";
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public static final String $outsrc_upri_typ_nm = "outsrc_upri_typ_nm";
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public static final String $sls_basis_typ_nm = "sls_basis_typ_nm";
	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public static final String $bill_basis_typ_nm = "bill_basis_typ_nm";
	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public static final String $ship_schd_split_typ_nm = "ship_schd_split_typ_nm";
	/**
	 * In-transit inventory controlling site type name 積送在庫管轄区分名.<p>
	 *
	 */
	public static final String $xfr_stk_mng_typ_nm = "xfr_stk_mng_typ_nm";
	/**
	 * Exchange rounding type name 為替端数処理区分名.<p>
	 *
	 */
	public static final String $xrate_rnd_typ_nm = "xrate_rnd_typ_nm";
	/**
	 * Offset tax amount rounding type 相殺税額端数処理区分名.<p>
	 *
	 */
	public static final String $setoff_tax_rnd_typ_nm = "setoff_tax_rnd_typ_nm";
	/**
	 * Payment fee rounding type name 支払手数料税額端数処理区分名.<p>
	 *
	 */
	public static final String $com_paid_tax_rnd_typ_nm = "com_paid_tax_rnd_typ_nm";
	/**
	 * Withholding tax amount rounding type 源泉税額端数処理区分名.<p>
	 *
	 */
	public static final String $wtax_rnd_typ_nm = "wtax_rnd_typ_nm";
	/**
	 * Inventory amount rounding type 在庫金額端数処理区分名.<p>
	 *
	 */
	public static final String $stk_amt_rnd_typ_nm = "stk_amt_rnd_typ_nm";
	/**
	 * Sales budget unit type name 販売予算単位区分名.<p>
	 *
	 */
	public static final String $sls_bdj_rnd_typ_nm = "sls_bdj_rnd_typ_nm";
	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public static final String $po_print_nm = "po_print_nm";
	/**
	 * Standard unit cost acquisition type name (For gross profit calculation) 標準単価取得区分名（粗利計算用）.<p>
	 *
	 */
	public static final String $gm_std_upri_typ_nm = "gm_std_upri_typ_nm";
	/**
	 * Standard unit cost acquisition type name (For inventory valuation) 標準単価取得区分名（在庫評価用）.<p>
	 *
	 */
	public static final String $stk_std_upri_typ_nm = "stk_std_upri_typ_nm";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public static final String $rpt_strg_ext_sys_cd = "rpt_strg_ext_sys_cd";
	/**
	 * Report storage system name 帳票保存システム名.<p>
	 *
	 */
	public static final String $rpt_strg_ext_sys_nm = "rpt_strg_ext_sys_nm";
	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public static final String $cst_prnt_typ_nm = "cst_prnt_typ_nm";
	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public static final String $acst_prnt_typ = "acst_prnt_typ";
	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public static final String $acst_prnt_typ_nm = "acst_prnt_typ_nm";
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public static final String $bcst_prnt_typ_nm = "bcst_prnt_typ_nm";
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public static final String $rcst_prnt_typ_nm = "rcst_prnt_typ_nm";
	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public static final String $dlv_prnt_typ = "dlv_prnt_typ";
	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public static final String $dlv_prnt_typ_nm = "dlv_prnt_typ_nm";
	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public static final String $sppl_prnt_typ_nm = "sppl_prnt_typ_nm";
	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public static final String $asppl_prnt_typ = "asppl_prnt_typ";
	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public static final String $asppl_prnt_typ_nm = "asppl_prnt_typ_nm";
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public static final String $bsppl_prnt_typ_nm = "bsppl_prnt_typ_nm";
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public static final String $psppl_prnt_typ_nm = "psppl_prnt_typ_nm";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_alt_nm1_META = createCommonMeta($co_alt_nm1, mcframe.commonMA.meta.MA_META.CO_ALT_NM1);
	public static final MCMeta co_alt_nm2_META = createCommonMeta($co_alt_nm2, mcframe.commonMA.meta.MA_META.CO_ALT_NM2);
	public static final MCMeta co_alt_nm3_META = createCommonMeta($co_alt_nm3, mcframe.commonMA.meta.MA_META.CO_ALT_NM3);
	public static final MCMeta co_alt_nm4_META = createCommonMeta($co_alt_nm4, mcframe.commonMA.meta.MA_META.CO_ALT_NM4);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_repl_nm_META = createCommonMeta($co_repl_nm, mcframe.commonMA.meta.MA_META.CO_REPL_NM);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta st_mon_META = createCommonMeta($st_mon, mcframe.commonMA.meta.MA_META.MON);
	public static final MCMeta dt_switch_time_META = createCommonMeta($dt_switch_time, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta ac_cl_day_META = createCommonMeta($ac_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ac_cl_mon_base_META = createCommonMeta($ac_cl_mon_base, mcframe.commonMA.meta.MA_META.CL_MON_BASE);
	public static final MCMeta std_cal_cd_META = createCommonMeta($std_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bill_cl_cal_cd_META = createCommonMeta($bill_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta ar_no_use_flg_META = createCommonMeta($ar_no_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_no_use_flg_META = createCommonMeta($ap_no_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_use_flg_META = createCommonMeta($temp_ap_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cl_cal_cd_META = createCommonMeta($stk_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sls_cl_cal_cd_META = createCommonMeta($sls_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_cl_cal_cd_META = createCommonMeta($rcv_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta purc_cl_cal_cd_META = createCommonMeta($purc_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta pay_cl_cal_cd_META = createCommonMeta($pay_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta pay_schd_cl_cal_cd_META = createCommonMeta($pay_schd_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta stk_cl_delay_days_META = createCommonMeta($stk_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta stk_cl_ba_typ_META = createCommonMeta($stk_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta sls_cl_delay_days_META = createCommonMeta($sls_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta sls_cl_ba_typ_META = createCommonMeta($sls_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta rcv_cl_delay_days_META = createCommonMeta($rcv_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta rcv_cl_ba_typ_META = createCommonMeta($rcv_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta purc_cl_delay_days_META = createCommonMeta($purc_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta purc_cl_ba_typ_META = createCommonMeta($purc_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_cl_delay_days_META = createCommonMeta($pay_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_cl_ba_typ_META = createCommonMeta($pay_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta bill_xrate_conv_flg_META = createCommonMeta($bill_xrate_conv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_xrate_conv_flg_META = createCommonMeta($pay_xrate_conv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_xrate_cd_META = createCommonMeta($sls_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta purc_xrate_cd_META = createCommonMeta($purc_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta prov_xrate_cd_META = createCommonMeta($prov_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta bill_xrate_cd_META = createCommonMeta($bill_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_cd_META = createCommonMeta($pay_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta mon01_xrate_rev_flg_META = createCommonMeta($mon01_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon02_xrate_rev_flg_META = createCommonMeta($mon02_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon03_xrate_rev_flg_META = createCommonMeta($mon03_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon04_xrate_rev_flg_META = createCommonMeta($mon04_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon05_xrate_rev_flg_META = createCommonMeta($mon05_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon06_xrate_rev_flg_META = createCommonMeta($mon06_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon07_xrate_rev_flg_META = createCommonMeta($mon07_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon08_xrate_rev_flg_META = createCommonMeta($mon08_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon09_xrate_rev_flg_META = createCommonMeta($mon09_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon10_xrate_rev_flg_META = createCommonMeta($mon10_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon11_xrate_rev_flg_META = createCommonMeta($mon11_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon12_xrate_rev_flg_META = createCommonMeta($mon12_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta xfr_stk_mng_typ_META = createCommonMeta($xfr_stk_mng_typ, mcframe.commonMA.meta.MA_META.XFR_STK_MNG_TYP);
	public static final MCMeta setoff_tax_rnd_typ_META = createCommonMeta($setoff_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta com_paid_tax_rnd_typ_META = createCommonMeta($com_paid_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_amt_rnd_typ_META = createCommonMeta($stk_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_amt_dec_place_META = createCommonMeta($stk_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta stk_lst_cnf_num_META = createCommonMeta($stk_lst_cnf_num, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta stk_lst_limit_num_META = createCommonMeta($stk_lst_limit_num, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta gm_std_upri_typ_META = createCommonMeta($gm_std_upri_typ, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta stk_std_upri_typ_META = createCommonMeta($stk_std_upri_typ, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta early_ship_dt_add_days_META = createCommonMeta($early_ship_dt_add_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta ac_slip_digit_META = createCommonMeta($ac_slip_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta ac_slip_seq_flg_META = createCommonMeta($ac_slip_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_bdj_rnd_typ_META = createCommonMeta($sls_bdj_rnd_typ, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta std_cal_nm_META = createCommonMeta($std_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta stk_cl_cal_nm_META = createCommonMeta($stk_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta sls_cl_cal_nm_META = createCommonMeta($sls_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta bill_cl_cal_nm_META = createCommonMeta($bill_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta rcv_cl_cal_nm_META = createCommonMeta($rcv_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta purc_cl_cal_nm_META = createCommonMeta($purc_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta pay_cl_cal_nm_META = createCommonMeta($pay_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta pay_schd_cl_cal_nm_META = createCommonMeta($pay_schd_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta sls_xrate_nm_META = createCommonMeta($sls_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta purc_xrate_nm_META = createCommonMeta($purc_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta prov_xrate_nm_META = createCommonMeta($prov_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta bill_xrate_nm_META = createCommonMeta($bill_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta pay_xrate_nm_META = createCommonMeta($pay_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta stk_cl_ba_typ_nm_META = createCommonMeta($stk_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta sls_cl_ba_typ_nm_META = createCommonMeta($sls_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta rcv_cl_ba_typ_nm_META = createCommonMeta($rcv_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta purc_cl_ba_typ_nm_META = createCommonMeta($purc_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta pay_cl_ba_typ_nm_META = createCommonMeta($pay_cl_ba_typ_nm, mcframe.commonMA.meta.MA_META.BA_TYP_NM);
	public static final MCMeta sls_upri_req_typ_nm_META = createCommonMeta($sls_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP_NM);
	public static final MCMeta purc_upri_req_typ_nm_META = createCommonMeta($purc_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP_NM);
	public static final MCMeta outsrc_upri_typ_nm_META = createCommonMeta($outsrc_upri_typ_nm, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP_NM);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta bill_basis_typ_nm_META = createCommonMeta($bill_basis_typ_nm, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP_NM);
	public static final MCMeta ship_schd_split_typ_nm_META = createCommonMeta($ship_schd_split_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP_NM);
	public static final MCMeta xfr_stk_mng_typ_nm_META = createCommonMeta($xfr_stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.XFR_STK_MNG_TYP_NM);
	public static final MCMeta xrate_rnd_typ_nm_META = createCommonMeta($xrate_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta setoff_tax_rnd_typ_nm_META = createCommonMeta($setoff_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta com_paid_tax_rnd_typ_nm_META = createCommonMeta($com_paid_tax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta wtax_rnd_typ_nm_META = createCommonMeta($wtax_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta stk_amt_rnd_typ_nm_META = createCommonMeta($stk_amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta sls_bdj_rnd_typ_nm_META = createCommonMeta($sls_bdj_rnd_typ_nm, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP_NM);
	public static final MCMeta po_print_nm_META = createCommonMeta($po_print_nm, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta gm_std_upri_typ_nm_META = createCommonMeta($gm_std_upri_typ_nm, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta stk_std_upri_typ_nm_META = createCommonMeta($stk_std_upri_typ_nm, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta rpt_strg_ext_sys_cd_META = createCommonMeta($rpt_strg_ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta rpt_strg_ext_sys_nm_META = createCommonMeta($rpt_strg_ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta cst_prnt_typ_nm_META = createCommonMeta($cst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta acst_prnt_typ_META = createCommonMeta($acst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta acst_prnt_typ_nm_META = createCommonMeta($acst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_nm_META = createCommonMeta($bcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_nm_META = createCommonMeta($rcst_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta dlv_prnt_typ_META = createCommonMeta($dlv_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta dlv_prnt_typ_nm_META = createCommonMeta($dlv_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_nm_META = createCommonMeta($sppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta asppl_prnt_typ_META = createCommonMeta($asppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta asppl_prnt_typ_nm_META = createCommonMeta($asppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_nm_META = createCommonMeta($bsppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_nm_META = createCommonMeta($psppl_prnt_typ_nm, mcframe.commonMA.meta.MA_META.PRNT_TYP_NM);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			co_cd_META,
			co_alt_nm1_META,
			co_alt_nm2_META,
			co_alt_nm3_META,
			co_alt_nm4_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			co_repl_nm_META,
			ein_META,
			biz_co_no_META,
			std_co_cd_META,
			cntry_cd_META,
			area_cd_META,
			base_cur_cd_META,
			ptax_cur_cd_META,
			st_mon_META,
			dt_switch_time_META,
			ac_cl_day_META,
			ac_cl_mon_base_META,
			std_cal_cd_META,
			bill_cl_cal_cd_META,
			ar_no_use_flg_META,
			ap_no_use_flg_META,
			temp_ap_use_flg_META,
			sls_cl_flg_META,
			rcv_cl_flg_META,
			purc_cl_flg_META,
			pay_cl_flg_META,
			stk_cl_cal_cd_META,
			sls_cl_cal_cd_META,
			rcv_cl_cal_cd_META,
			purc_cl_cal_cd_META,
			pay_cl_cal_cd_META,
			pay_schd_cl_cal_cd_META,
			stk_cl_delay_days_META,
			stk_cl_ba_typ_META,
			sls_cl_delay_days_META,
			sls_cl_ba_typ_META,
			rcv_cl_delay_days_META,
			rcv_cl_ba_typ_META,
			purc_cl_delay_days_META,
			purc_cl_ba_typ_META,
			pay_cl_delay_days_META,
			pay_cl_ba_typ_META,
			bill_xrate_conv_flg_META,
			pay_xrate_conv_flg_META,
			sls_xrate_cd_META,
			purc_xrate_cd_META,
			prov_xrate_cd_META,
			bill_xrate_cd_META,
			pay_xrate_cd_META,
			mon01_xrate_rev_flg_META,
			mon02_xrate_rev_flg_META,
			mon03_xrate_rev_flg_META,
			mon04_xrate_rev_flg_META,
			mon05_xrate_rev_flg_META,
			mon06_xrate_rev_flg_META,
			mon07_xrate_rev_flg_META,
			mon08_xrate_rev_flg_META,
			mon09_xrate_rev_flg_META,
			mon10_xrate_rev_flg_META,
			mon11_xrate_rev_flg_META,
			mon12_xrate_rev_flg_META,
			sls_upri_req_typ_META,
			purc_upri_req_typ_META,
			outsrc_upri_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			xfr_stk_mng_typ_META,
			setoff_tax_rnd_typ_META,
			xrate_rnd_typ_META,
			com_paid_tax_rnd_typ_META,
			wtax_rnd_typ_META,
			stk_amt_rnd_typ_META,
			stk_amt_dec_place_META,
			po_print_cd_META,
			stk_lst_cnf_num_META,
			stk_lst_limit_num_META,
			gm_std_upri_typ_META,
			stk_std_upri_typ_META,
			early_ship_dt_add_days_META,
			ac_slip_digit_META,
			ac_slip_seq_flg_META,
			sls_bdj_rnd_typ_META,
			cntry_nm_META,
			area_nm_META,
			base_cur_nm_META,
			ptax_cur_nm_META,
			std_cal_nm_META,
			stk_cl_cal_nm_META,
			sls_cl_cal_nm_META,
			bill_cl_cal_nm_META,
			rcv_cl_cal_nm_META,
			purc_cl_cal_nm_META,
			pay_cl_cal_nm_META,
			pay_schd_cl_cal_nm_META,
			sls_xrate_nm_META,
			purc_xrate_nm_META,
			prov_xrate_nm_META,
			bill_xrate_nm_META,
			pay_xrate_nm_META,
			stk_cl_ba_typ_nm_META,
			sls_cl_ba_typ_nm_META,
			rcv_cl_ba_typ_nm_META,
			purc_cl_ba_typ_nm_META,
			pay_cl_ba_typ_nm_META,
			sls_upri_req_typ_nm_META,
			purc_upri_req_typ_nm_META,
			outsrc_upri_typ_nm_META,
			sls_basis_typ_nm_META,
			bill_basis_typ_nm_META,
			ship_schd_split_typ_nm_META,
			xfr_stk_mng_typ_nm_META,
			xrate_rnd_typ_nm_META,
			setoff_tax_rnd_typ_nm_META,
			com_paid_tax_rnd_typ_nm_META,
			wtax_rnd_typ_nm_META,
			stk_amt_rnd_typ_nm_META,
			sls_bdj_rnd_typ_nm_META,
			po_print_nm_META,
			gm_std_upri_typ_nm_META,
			stk_std_upri_typ_nm_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			rpt_strg_ext_sys_cd_META,
			rpt_strg_ext_sys_nm_META,
			cst_prnt_typ_META,
			cst_prnt_typ_nm_META,
			acst_prnt_typ_META,
			acst_prnt_typ_nm_META,
			bcst_prnt_typ_META,
			bcst_prnt_typ_nm_META,
			rcst_prnt_typ_META,
			rcst_prnt_typ_nm_META,
			dlv_prnt_typ_META,
			dlv_prnt_typ_nm_META,
			sppl_prnt_typ_META,
			sppl_prnt_typ_nm_META,
			asppl_prnt_typ_META,
			asppl_prnt_typ_nm_META,
			bsppl_prnt_typ_META,
			bsppl_prnt_typ_nm_META,
			psppl_prnt_typ_META,
			psppl_prnt_typ_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$co_cd	// co_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
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
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}


	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public String co_alt_nm1() {
		return getConstString(offset + 2, $co_alt_nm1);
	}

	/**
	 * Company alias 1 会社別名１.<p>
	 *
	 */
	public void co_alt_nm1(String value) {
		setConstString(offset + 2, $co_alt_nm1, value);
	}


	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public String co_alt_nm2() {
		return getConstString(offset + 3, $co_alt_nm2);
	}

	/**
	 * Company alias 2 会社別名２.<p>
	 *
	 */
	public void co_alt_nm2(String value) {
		setConstString(offset + 3, $co_alt_nm2, value);
	}


	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public String co_alt_nm3() {
		return getConstString(offset + 4, $co_alt_nm3);
	}

	/**
	 * Company alias 3 会社別名３.<p>
	 *
	 */
	public void co_alt_nm3(String value) {
		setConstString(offset + 4, $co_alt_nm3, value);
	}


	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public String co_alt_nm4() {
		return getConstString(offset + 5, $co_alt_nm4);
	}

	/**
	 * Company alias 4 会社別名４.<p>
	 *
	 */
	public void co_alt_nm4(String value) {
		setConstString(offset + 5, $co_alt_nm4, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 6, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 6, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 7, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 7, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 8, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 8, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 9, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 9, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 10, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 10, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 11, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 11, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 12, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 12, $fax, value);
	}


	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public String co_repl_nm() {
		return getConstString(offset + 13, $co_repl_nm);
	}

	/**
	 * Representative name 代表者名.<p>
	 *
	 */
	public void co_repl_nm(String value) {
		setConstString(offset + 13, $co_repl_nm, value);
	}


	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 14, $ein);
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 14, $ein, value);
	}


	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 15, $biz_co_no);
	}

	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 15, $biz_co_no, value);
	}


	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 16, $std_co_cd);
	}

	/**
	 * Standard company code 標準企業コード.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 16, $std_co_cd, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 17, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 17, $cntry_cd, value);
	}


	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 18, $area_cd);
	}

	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 18, $area_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 19, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 19, $base_cur_cd, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 20, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 20, $ptax_cur_cd, value);
	}


	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public MCNumber st_mon() {
		return getConstNumber(offset + 21, $st_mon);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(MCNumber value) {
		setConstNumber(offset + 21, $st_mon, value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(int value) {
		setConstNumber(offset + 21, $st_mon, value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(long value) {
		setConstNumber(offset + 21, $st_mon, value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(float value) {
		setConstNumber(offset + 21, $st_mon, value);
	}

	/**
	 * Beginning year 期首年月.<p>
	 *
	 */
	public void st_mon(double value) {
		setConstNumber(offset + 21, $st_mon, value);
	}


	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public MCNumber dt_switch_time() {
		return getConstNumber(offset + 22, $dt_switch_time);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(MCNumber value) {
		setConstNumber(offset + 22, $dt_switch_time, value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(int value) {
		setConstNumber(offset + 22, $dt_switch_time, value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(long value) {
		setConstNumber(offset + 22, $dt_switch_time, value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(float value) {
		setConstNumber(offset + 22, $dt_switch_time, value);
	}

	/**
	 * Date switching time 日付切替時間.<p>
	 *
	 */
	public void dt_switch_time(double value) {
		setConstNumber(offset + 22, $dt_switch_time, value);
	}


	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public MCNumber ac_cl_day() {
		return getConstNumber(offset + 23, $ac_cl_day);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(MCNumber value) {
		setConstNumber(offset + 23, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(int value) {
		setConstNumber(offset + 23, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(long value) {
		setConstNumber(offset + 23, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(float value) {
		setConstNumber(offset + 23, $ac_cl_day, value);
	}

	/**
	 * Accounting closing day 会計締日.<p>
	 *
	 */
	public void ac_cl_day(double value) {
		setConstNumber(offset + 23, $ac_cl_day, value);
	}


	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public MCNumber ac_cl_mon_base() {
		return getConstNumber(offset + 24, $ac_cl_mon_base);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(MCNumber value) {
		setConstNumber(offset + 24, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(int value) {
		setConstNumber(offset + 24, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(long value) {
		setConstNumber(offset + 24, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(float value) {
		setConstNumber(offset + 24, $ac_cl_mon_base, value);
	}

	/**
	 * Accounting month basis 会計月度基準.<p>
	 *
	 */
	public void ac_cl_mon_base(double value) {
		setConstNumber(offset + 24, $ac_cl_mon_base, value);
	}


	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public String std_cal_cd() {
		return getConstString(offset + 25, $std_cal_cd);
	}

	/**
	 * Standard calendar cd. 標準カレンダＣＤ.<p>
	 *
	 */
	public void std_cal_cd(String value) {
		setConstString(offset + 25, $std_cal_cd, value);
	}


	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public String bill_cl_cal_cd() {
		return getConstString(offset + 26, $bill_cl_cal_cd);
	}

	/**
	 * Billing closing calendar cd. 請求締カレンダＣＤ.<p>
	 *
	 */
	public void bill_cl_cal_cd(String value) {
		setConstString(offset + 26, $bill_cl_cal_cd, value);
	}


	/**
	 * AR not used 債権不使用.<p>
	 *
	 */
	public boolean ar_no_use_flg() {
		return getConstBoolean(offset + 27, $ar_no_use_flg);
	}

	/**
	 * AR not used 債権不使用.<p>
	 *
	 */
	public void ar_no_use_flg(boolean value) {
		setConstBoolean(offset + 27, $ar_no_use_flg, value);
	}


	/**
	 * AP not used 債務不使用.<p>
	 *
	 */
	public boolean ap_no_use_flg() {
		return getConstBoolean(offset + 28, $ap_no_use_flg);
	}

	/**
	 * AP not used 債務不使用.<p>
	 *
	 */
	public void ap_no_use_flg(boolean value) {
		setConstBoolean(offset + 28, $ap_no_use_flg, value);
	}


	/**
	 * Temporary AP use 暫定買掛使用.<p>
	 *
	 */
	public boolean temp_ap_use_flg() {
		return getConstBoolean(offset + 29, $temp_ap_use_flg);
	}

	/**
	 * Temporary AP use 暫定買掛使用.<p>
	 *
	 */
	public void temp_ap_use_flg(boolean value) {
		setConstBoolean(offset + 29, $temp_ap_use_flg, value);
	}


	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 30, $sls_cl_flg);
	}

	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 30, $sls_cl_flg, value);
	}


	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 31, $rcv_cl_flg);
	}

	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 31, $rcv_cl_flg, value);
	}


	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 32, $purc_cl_flg);
	}

	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 32, $purc_cl_flg, value);
	}


	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 33, $pay_cl_flg);
	}

	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 33, $pay_cl_flg, value);
	}


	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public String stk_cl_cal_cd() {
		return getConstString(offset + 34, $stk_cl_cal_cd);
	}

	/**
	 * Inventory closing calendar cd. 在庫締カレンダＣＤ.<p>
	 *
	 */
	public void stk_cl_cal_cd(String value) {
		setConstString(offset + 34, $stk_cl_cal_cd, value);
	}


	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public String sls_cl_cal_cd() {
		return getConstString(offset + 35, $sls_cl_cal_cd);
	}

	/**
	 * Sales closing calendar cd. 売上締カレンダＣＤ.<p>
	 *
	 */
	public void sls_cl_cal_cd(String value) {
		setConstString(offset + 35, $sls_cl_cal_cd, value);
	}


	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public String rcv_cl_cal_cd() {
		return getConstString(offset + 36, $rcv_cl_cal_cd);
	}

	/**
	 * Payment received closing calendar cd. 入金締カレンダＣＤ.<p>
	 *
	 */
	public void rcv_cl_cal_cd(String value) {
		setConstString(offset + 36, $rcv_cl_cal_cd, value);
	}


	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public String purc_cl_cal_cd() {
		return getConstString(offset + 37, $purc_cl_cal_cd);
	}

	/**
	 * Purchase closing calendar cd. 仕入締カレンダＣＤ.<p>
	 *
	 */
	public void purc_cl_cal_cd(String value) {
		setConstString(offset + 37, $purc_cl_cal_cd, value);
	}


	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public String pay_cl_cal_cd() {
		return getConstString(offset + 38, $pay_cl_cal_cd);
	}

	/**
	 * Payment closing calendar cd. 支払締カレンダＣＤ.<p>
	 *
	 */
	public void pay_cl_cal_cd(String value) {
		setConstString(offset + 38, $pay_cl_cal_cd, value);
	}


	/**
	 * Payment schedule closing calendar cd. 支払予定締カレンダＣＤ.<p>
	 *
	 */
	public String pay_schd_cl_cal_cd() {
		return getConstString(offset + 39, $pay_schd_cl_cal_cd);
	}

	/**
	 * Payment schedule closing calendar cd. 支払予定締カレンダＣＤ.<p>
	 *
	 */
	public void pay_schd_cl_cal_cd(String value) {
		setConstString(offset + 39, $pay_schd_cl_cal_cd, value);
	}


	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public MCNumber stk_cl_delay_days() {
		return getConstNumber(offset + 40, $stk_cl_delay_days);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 40, $stk_cl_delay_days, value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(int value) {
		setConstNumber(offset + 40, $stk_cl_delay_days, value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(long value) {
		setConstNumber(offset + 40, $stk_cl_delay_days, value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(float value) {
		setConstNumber(offset + 40, $stk_cl_delay_days, value);
	}

	/**
	 * Delay days (Inventory closing day) 在庫締日遅延日数.<p>
	 *
	 */
	public void stk_cl_delay_days(double value) {
		setConstNumber(offset + 40, $stk_cl_delay_days, value);
	}


	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public String stk_cl_ba_typ() {
		return getConstString(offset + 41, $stk_cl_ba_typ);
	}

	/**
	 * Inventory closing day before/after type 在庫締日前後区分.<p>
	 *
	 */
	public void stk_cl_ba_typ(String value) {
		setConstString(offset + 41, $stk_cl_ba_typ, value);
	}


	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public MCNumber sls_cl_delay_days() {
		return getConstNumber(offset + 42, $sls_cl_delay_days);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 42, $sls_cl_delay_days, value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(int value) {
		setConstNumber(offset + 42, $sls_cl_delay_days, value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(long value) {
		setConstNumber(offset + 42, $sls_cl_delay_days, value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(float value) {
		setConstNumber(offset + 42, $sls_cl_delay_days, value);
	}

	/**
	 * Delay days (Sales closing day) 売上締日遅延日数.<p>
	 *
	 */
	public void sls_cl_delay_days(double value) {
		setConstNumber(offset + 42, $sls_cl_delay_days, value);
	}


	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public String sls_cl_ba_typ() {
		return getConstString(offset + 43, $sls_cl_ba_typ);
	}

	/**
	 * Sales closing day before/after type 売上締日前後区分.<p>
	 *
	 */
	public void sls_cl_ba_typ(String value) {
		setConstString(offset + 43, $sls_cl_ba_typ, value);
	}


	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public MCNumber rcv_cl_delay_days() {
		return getConstNumber(offset + 44, $rcv_cl_delay_days);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 44, $rcv_cl_delay_days, value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(int value) {
		setConstNumber(offset + 44, $rcv_cl_delay_days, value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(long value) {
		setConstNumber(offset + 44, $rcv_cl_delay_days, value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(float value) {
		setConstNumber(offset + 44, $rcv_cl_delay_days, value);
	}

	/**
	 * Delayed days (Payment received closing day) 入金締日遅延日数.<p>
	 *
	 */
	public void rcv_cl_delay_days(double value) {
		setConstNumber(offset + 44, $rcv_cl_delay_days, value);
	}


	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public String rcv_cl_ba_typ() {
		return getConstString(offset + 45, $rcv_cl_ba_typ);
	}

	/**
	 * Payment received closing day before/after type 入金締日前後区分.<p>
	 *
	 */
	public void rcv_cl_ba_typ(String value) {
		setConstString(offset + 45, $rcv_cl_ba_typ, value);
	}


	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public MCNumber purc_cl_delay_days() {
		return getConstNumber(offset + 46, $purc_cl_delay_days);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 46, $purc_cl_delay_days, value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(int value) {
		setConstNumber(offset + 46, $purc_cl_delay_days, value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(long value) {
		setConstNumber(offset + 46, $purc_cl_delay_days, value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(float value) {
		setConstNumber(offset + 46, $purc_cl_delay_days, value);
	}

	/**
	 * Delay days (Purchase closing day) 仕入締日遅延日数.<p>
	 *
	 */
	public void purc_cl_delay_days(double value) {
		setConstNumber(offset + 46, $purc_cl_delay_days, value);
	}


	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public String purc_cl_ba_typ() {
		return getConstString(offset + 47, $purc_cl_ba_typ);
	}

	/**
	 * Purchase closing day before/after type 仕入締日前後区分.<p>
	 *
	 */
	public void purc_cl_ba_typ(String value) {
		setConstString(offset + 47, $purc_cl_ba_typ, value);
	}


	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public MCNumber pay_cl_delay_days() {
		return getConstNumber(offset + 48, $pay_cl_delay_days);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 48, $pay_cl_delay_days, value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(int value) {
		setConstNumber(offset + 48, $pay_cl_delay_days, value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(long value) {
		setConstNumber(offset + 48, $pay_cl_delay_days, value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(float value) {
		setConstNumber(offset + 48, $pay_cl_delay_days, value);
	}

	/**
	 * Delay days (Payment closing day) 支払締日遅延日数.<p>
	 *
	 */
	public void pay_cl_delay_days(double value) {
		setConstNumber(offset + 48, $pay_cl_delay_days, value);
	}


	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public String pay_cl_ba_typ() {
		return getConstString(offset + 49, $pay_cl_ba_typ);
	}

	/**
	 * Payment closing day before/after type 支払締日前後区分.<p>
	 *
	 */
	public void pay_cl_ba_typ(String value) {
		setConstString(offset + 49, $pay_cl_ba_typ, value);
	}


	/**
	 * Convert at exchange rate upon billing 請求時為替レート換算.<p>
	 *
	 */
	public boolean bill_xrate_conv_flg() {
		return getConstBoolean(offset + 50, $bill_xrate_conv_flg);
	}

	/**
	 * Convert at exchange rate upon billing 請求時為替レート換算.<p>
	 *
	 */
	public void bill_xrate_conv_flg(boolean value) {
		setConstBoolean(offset + 50, $bill_xrate_conv_flg, value);
	}


	/**
	 * Convert at exchange rate upon payment collation 支払照合時為替レート換算.<p>
	 *
	 */
	public boolean pay_xrate_conv_flg() {
		return getConstBoolean(offset + 51, $pay_xrate_conv_flg);
	}

	/**
	 * Convert at exchange rate upon payment collation 支払照合時為替レート換算.<p>
	 *
	 */
	public void pay_xrate_conv_flg(boolean value) {
		setConstBoolean(offset + 51, $pay_xrate_conv_flg, value);
	}


	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public String sls_xrate_cd() {
		return getConstString(offset + 52, $sls_xrate_cd);
	}

	/**
	 * Sales exchange rate cd. 売上為替レートＣＤ.<p>
	 *
	 */
	public void sls_xrate_cd(String value) {
		setConstString(offset + 52, $sls_xrate_cd, value);
	}


	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public String purc_xrate_cd() {
		return getConstString(offset + 53, $purc_xrate_cd);
	}

	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public void purc_xrate_cd(String value) {
		setConstString(offset + 53, $purc_xrate_cd, value);
	}


	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public String prov_xrate_cd() {
		return getConstString(offset + 54, $prov_xrate_cd);
	}

	/**
	 * Supply exchange rate cd. 支給為替レートＣＤ.<p>
	 *
	 */
	public void prov_xrate_cd(String value) {
		setConstString(offset + 54, $prov_xrate_cd, value);
	}


	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public String bill_xrate_cd() {
		return getConstString(offset + 55, $bill_xrate_cd);
	}

	/**
	 * Billing exchange rate cd. 請求為替レートＣＤ.<p>
	 *
	 */
	public void bill_xrate_cd(String value) {
		setConstString(offset + 55, $bill_xrate_cd, value);
	}


	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public String pay_xrate_cd() {
		return getConstString(offset + 56, $pay_xrate_cd);
	}

	/**
	 * Payment collation exchange rate cd. 支払照合為替レートＣＤ.<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		setConstString(offset + 56, $pay_xrate_cd, value);
	}


	/**
	 * January １月.<p>
	 *
	 */
	public boolean mon01_xrate_rev_flg() {
		return getConstBoolean(offset + 57, $mon01_xrate_rev_flg);
	}

	/**
	 * January １月.<p>
	 *
	 */
	public void mon01_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 57, $mon01_xrate_rev_flg, value);
	}


	/**
	 * February ２月.<p>
	 *
	 */
	public boolean mon02_xrate_rev_flg() {
		return getConstBoolean(offset + 58, $mon02_xrate_rev_flg);
	}

	/**
	 * February ２月.<p>
	 *
	 */
	public void mon02_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 58, $mon02_xrate_rev_flg, value);
	}


	/**
	 * March ３月.<p>
	 *
	 */
	public boolean mon03_xrate_rev_flg() {
		return getConstBoolean(offset + 59, $mon03_xrate_rev_flg);
	}

	/**
	 * March ３月.<p>
	 *
	 */
	public void mon03_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 59, $mon03_xrate_rev_flg, value);
	}


	/**
	 * April ４月.<p>
	 *
	 */
	public boolean mon04_xrate_rev_flg() {
		return getConstBoolean(offset + 60, $mon04_xrate_rev_flg);
	}

	/**
	 * April ４月.<p>
	 *
	 */
	public void mon04_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 60, $mon04_xrate_rev_flg, value);
	}


	/**
	 * May ５月.<p>
	 *
	 */
	public boolean mon05_xrate_rev_flg() {
		return getConstBoolean(offset + 61, $mon05_xrate_rev_flg);
	}

	/**
	 * May ５月.<p>
	 *
	 */
	public void mon05_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 61, $mon05_xrate_rev_flg, value);
	}


	/**
	 * June ６月.<p>
	 *
	 */
	public boolean mon06_xrate_rev_flg() {
		return getConstBoolean(offset + 62, $mon06_xrate_rev_flg);
	}

	/**
	 * June ６月.<p>
	 *
	 */
	public void mon06_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 62, $mon06_xrate_rev_flg, value);
	}


	/**
	 * July ７月.<p>
	 *
	 */
	public boolean mon07_xrate_rev_flg() {
		return getConstBoolean(offset + 63, $mon07_xrate_rev_flg);
	}

	/**
	 * July ７月.<p>
	 *
	 */
	public void mon07_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 63, $mon07_xrate_rev_flg, value);
	}


	/**
	 * August ８月.<p>
	 *
	 */
	public boolean mon08_xrate_rev_flg() {
		return getConstBoolean(offset + 64, $mon08_xrate_rev_flg);
	}

	/**
	 * August ８月.<p>
	 *
	 */
	public void mon08_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 64, $mon08_xrate_rev_flg, value);
	}


	/**
	 * September ９月.<p>
	 *
	 */
	public boolean mon09_xrate_rev_flg() {
		return getConstBoolean(offset + 65, $mon09_xrate_rev_flg);
	}

	/**
	 * September ９月.<p>
	 *
	 */
	public void mon09_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 65, $mon09_xrate_rev_flg, value);
	}


	/**
	 * October １０月.<p>
	 *
	 */
	public boolean mon10_xrate_rev_flg() {
		return getConstBoolean(offset + 66, $mon10_xrate_rev_flg);
	}

	/**
	 * October １０月.<p>
	 *
	 */
	public void mon10_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 66, $mon10_xrate_rev_flg, value);
	}


	/**
	 * November １１月.<p>
	 *
	 */
	public boolean mon11_xrate_rev_flg() {
		return getConstBoolean(offset + 67, $mon11_xrate_rev_flg);
	}

	/**
	 * November １１月.<p>
	 *
	 */
	public void mon11_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 67, $mon11_xrate_rev_flg, value);
	}


	/**
	 * December １２月.<p>
	 *
	 */
	public boolean mon12_xrate_rev_flg() {
		return getConstBoolean(offset + 68, $mon12_xrate_rev_flg);
	}

	/**
	 * December １２月.<p>
	 *
	 */
	public void mon12_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 68, $mon12_xrate_rev_flg, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 69, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 69, $sls_upri_req_typ, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 70, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 70, $purc_upri_req_typ, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 71, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 71, $outsrc_upri_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 72, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 72, $sls_basis_typ, value);
	}


	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 73, $bill_basis_typ);
	}

	/**
	 * Billing initial base type 請求起算区分.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 73, $bill_basis_typ, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 74, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 74, $ship_schd_split_typ, value);
	}


	/**
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public String xfr_stk_mng_typ() {
		return getConstString(offset + 75, $xfr_stk_mng_typ);
	}

	/**
	 * In-transit inventory controlled site type 積送在庫管轄先区分.<p>
	 *
	 */
	public void xfr_stk_mng_typ(String value) {
		setConstString(offset + 75, $xfr_stk_mng_typ, value);
	}


	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public String setoff_tax_rnd_typ() {
		return getConstString(offset + 76, $setoff_tax_rnd_typ);
	}

	/**
	 * Offset tax rounding type 相殺税額端数処理区分.<p>
	 *
	 */
	public void setoff_tax_rnd_typ(String value) {
		setConstString(offset + 76, $setoff_tax_rnd_typ, value);
	}


	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 77, $xrate_rnd_typ);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 77, $xrate_rnd_typ, value);
	}


	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public String com_paid_tax_rnd_typ() {
		return getConstString(offset + 78, $com_paid_tax_rnd_typ);
	}

	/**
	 * Rounding type (Payment fee tax) 支払手数料税額端数処理区分.<p>
	 *
	 */
	public void com_paid_tax_rnd_typ(String value) {
		setConstString(offset + 78, $com_paid_tax_rnd_typ, value);
	}


	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 79, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉税額端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 79, $wtax_rnd_typ, value);
	}


	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return getConstString(offset + 80, $stk_amt_rnd_typ);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		setConstString(offset + 80, $stk_amt_rnd_typ, value);
	}


	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return getConstNumber(offset + 81, $stk_amt_dec_place);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 81, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		setConstNumber(offset + 81, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		setConstNumber(offset + 81, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		setConstNumber(offset + 81, $stk_amt_dec_place, value);
	}

	/**
	 * Inventory amount number of decimal places 在庫金額小数部有効桁数.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		setConstNumber(offset + 81, $stk_amt_dec_place, value);
	}


	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 82, $po_print_cd);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 82, $po_print_cd, value);
	}


	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public MCNumber stk_lst_cnf_num() {
		return getConstNumber(offset + 83, $stk_lst_cnf_num);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(MCNumber value) {
		setConstNumber(offset + 83, $stk_lst_cnf_num, value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(int value) {
		setConstNumber(offset + 83, $stk_lst_cnf_num, value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(long value) {
		setConstNumber(offset + 83, $stk_lst_cnf_num, value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(float value) {
		setConstNumber(offset + 83, $stk_lst_cnf_num, value);
	}

	/**
	 * Checked number of identification tags 現品票確認枚数.<p>
	 *
	 */
	public void stk_lst_cnf_num(double value) {
		setConstNumber(offset + 83, $stk_lst_cnf_num, value);
	}


	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public MCNumber stk_lst_limit_num() {
		return getConstNumber(offset + 84, $stk_lst_limit_num);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(MCNumber value) {
		setConstNumber(offset + 84, $stk_lst_limit_num, value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(int value) {
		setConstNumber(offset + 84, $stk_lst_limit_num, value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(long value) {
		setConstNumber(offset + 84, $stk_lst_limit_num, value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(float value) {
		setConstNumber(offset + 84, $stk_lst_limit_num, value);
	}

	/**
	 * Maximum number of identification tag printing 現品票印刷上限枚数.<p>
	 *
	 */
	public void stk_lst_limit_num(double value) {
		setConstNumber(offset + 84, $stk_lst_limit_num, value);
	}


	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public String gm_std_upri_typ() {
		return getConstString(offset + 85, $gm_std_upri_typ);
	}

	/**
	 * Standard unit cost acquisition type (For gross profit calculation) 標準単価取得区分（粗利計算用）.<p>
	 *
	 */
	public void gm_std_upri_typ(String value) {
		setConstString(offset + 85, $gm_std_upri_typ, value);
	}


	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public String stk_std_upri_typ() {
		return getConstString(offset + 86, $stk_std_upri_typ);
	}

	/**
	 * Standard unit cost acquisition type (For inventory valuation) 標準単価取得区分（在庫評価用）.<p>
	 *
	 */
	public void stk_std_upri_typ(String value) {
		setConstString(offset + 86, $stk_std_upri_typ, value);
	}


	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return getConstNumber(offset + 87, $early_ship_dt_add_days);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		setConstNumber(offset + 87, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		setConstNumber(offset + 87, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		setConstNumber(offset + 87, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		setConstNumber(offset + 87, $early_ship_dt_add_days, value);
	}

	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		setConstNumber(offset + 87, $early_ship_dt_add_days, value);
	}


	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public MCNumber ac_slip_digit() {
		return getConstNumber(offset + 88, $ac_slip_digit);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(MCNumber value) {
		setConstNumber(offset + 88, $ac_slip_digit, value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(int value) {
		setConstNumber(offset + 88, $ac_slip_digit, value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(long value) {
		setConstNumber(offset + 88, $ac_slip_digit, value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(float value) {
		setConstNumber(offset + 88, $ac_slip_digit, value);
	}

	/**
	 * Journal slip No. digits 仕訳伝票ＮＯ桁数.<p>
	 *
	 */
	public void ac_slip_digit(double value) {
		setConstNumber(offset + 88, $ac_slip_digit, value);
	}


	/**
	 * Debit and credit details number 貸借明細番号.<p>
	 *
	 */
	public boolean ac_slip_seq_flg() {
		return getConstBoolean(offset + 89, $ac_slip_seq_flg);
	}

	/**
	 * Debit and credit details number 貸借明細番号.<p>
	 *
	 */
	public void ac_slip_seq_flg(boolean value) {
		setConstBoolean(offset + 89, $ac_slip_seq_flg, value);
	}


	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public String sls_bdj_rnd_typ() {
		return getConstString(offset + 90, $sls_bdj_rnd_typ);
	}

	/**
	 * Sales budget unit type 販売予算単位区分.<p>
	 *
	 */
	public void sls_bdj_rnd_typ(String value) {
		setConstString(offset + 90, $sls_bdj_rnd_typ, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 91, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 91, $cntry_nm, value);
	}


	/**
	 * Region name 地域名.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 92, $area_nm);
	}

	/**
	 * Region name 地域名.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 92, $area_nm, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 93, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 93, $base_cur_nm, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 94, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 94, $ptax_cur_nm, value);
	}


	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public String std_cal_nm() {
		return getConstString(offset + 95, $std_cal_nm);
	}

	/**
	 * Standard calendar name 標準カレンダ名.<p>
	 *
	 */
	public void std_cal_nm(String value) {
		setConstString(offset + 95, $std_cal_nm, value);
	}


	/**
	 * Inventory closing calendar name 在庫締カレンダ名.<p>
	 *
	 */
	public String stk_cl_cal_nm() {
		return getConstString(offset + 96, $stk_cl_cal_nm);
	}

	/**
	 * Inventory closing calendar name 在庫締カレンダ名.<p>
	 *
	 */
	public void stk_cl_cal_nm(String value) {
		setConstString(offset + 96, $stk_cl_cal_nm, value);
	}


	/**
	 * Sales closing calendar name 売上締カレンダ名.<p>
	 *
	 */
	public String sls_cl_cal_nm() {
		return getConstString(offset + 97, $sls_cl_cal_nm);
	}

	/**
	 * Sales closing calendar name 売上締カレンダ名.<p>
	 *
	 */
	public void sls_cl_cal_nm(String value) {
		setConstString(offset + 97, $sls_cl_cal_nm, value);
	}


	/**
	 * Billing closing calendar name 請求締カレンダ名.<p>
	 *
	 */
	public String bill_cl_cal_nm() {
		return getConstString(offset + 98, $bill_cl_cal_nm);
	}

	/**
	 * Billing closing calendar name 請求締カレンダ名.<p>
	 *
	 */
	public void bill_cl_cal_nm(String value) {
		setConstString(offset + 98, $bill_cl_cal_nm, value);
	}


	/**
	 * Payment received closing calendar name 入金締カレンダ名.<p>
	 *
	 */
	public String rcv_cl_cal_nm() {
		return getConstString(offset + 99, $rcv_cl_cal_nm);
	}

	/**
	 * Payment received closing calendar name 入金締カレンダ名.<p>
	 *
	 */
	public void rcv_cl_cal_nm(String value) {
		setConstString(offset + 99, $rcv_cl_cal_nm, value);
	}


	/**
	 * Purchase closing calendar name 仕入締カレンダ名.<p>
	 *
	 */
	public String purc_cl_cal_nm() {
		return getConstString(offset + 100, $purc_cl_cal_nm);
	}

	/**
	 * Purchase closing calendar name 仕入締カレンダ名.<p>
	 *
	 */
	public void purc_cl_cal_nm(String value) {
		setConstString(offset + 100, $purc_cl_cal_nm, value);
	}


	/**
	 * Payment closing calendar name 支払締カレンダ名.<p>
	 *
	 */
	public String pay_cl_cal_nm() {
		return getConstString(offset + 101, $pay_cl_cal_nm);
	}

	/**
	 * Payment closing calendar name 支払締カレンダ名.<p>
	 *
	 */
	public void pay_cl_cal_nm(String value) {
		setConstString(offset + 101, $pay_cl_cal_nm, value);
	}


	/**
	 * Payment schedule closing calendar name 支払予定締カレンダ名.<p>
	 *
	 */
	public String pay_schd_cl_cal_nm() {
		return getConstString(offset + 102, $pay_schd_cl_cal_nm);
	}

	/**
	 * Payment schedule closing calendar name 支払予定締カレンダ名.<p>
	 *
	 */
	public void pay_schd_cl_cal_nm(String value) {
		setConstString(offset + 102, $pay_schd_cl_cal_nm, value);
	}


	/**
	 * Sales exchange rate name 売上為替レート名.<p>
	 *
	 */
	public String sls_xrate_nm() {
		return getConstString(offset + 103, $sls_xrate_nm);
	}

	/**
	 * Sales exchange rate name 売上為替レート名.<p>
	 *
	 */
	public void sls_xrate_nm(String value) {
		setConstString(offset + 103, $sls_xrate_nm, value);
	}


	/**
	 * Purchase exchange rate name 仕入為替レート名.<p>
	 *
	 */
	public String purc_xrate_nm() {
		return getConstString(offset + 104, $purc_xrate_nm);
	}

	/**
	 * Purchase exchange rate name 仕入為替レート名.<p>
	 *
	 */
	public void purc_xrate_nm(String value) {
		setConstString(offset + 104, $purc_xrate_nm, value);
	}


	/**
	 * Supply exchange rate name 支給為替レート名.<p>
	 *
	 */
	public String prov_xrate_nm() {
		return getConstString(offset + 105, $prov_xrate_nm);
	}

	/**
	 * Supply exchange rate name 支給為替レート名.<p>
	 *
	 */
	public void prov_xrate_nm(String value) {
		setConstString(offset + 105, $prov_xrate_nm, value);
	}


	/**
	 * Billing exchange rate name 請求為替レート名.<p>
	 *
	 */
	public String bill_xrate_nm() {
		return getConstString(offset + 106, $bill_xrate_nm);
	}

	/**
	 * Billing exchange rate name 請求為替レート名.<p>
	 *
	 */
	public void bill_xrate_nm(String value) {
		setConstString(offset + 106, $bill_xrate_nm, value);
	}


	/**
	 * Payment collation exchange rate name 支払照合為替レート名.<p>
	 *
	 */
	public String pay_xrate_nm() {
		return getConstString(offset + 107, $pay_xrate_nm);
	}

	/**
	 * Payment collation exchange rate name 支払照合為替レート名.<p>
	 *
	 */
	public void pay_xrate_nm(String value) {
		setConstString(offset + 107, $pay_xrate_nm, value);
	}


	/**
	 * Inventory closing day before/after type name 在庫締日前後区分名.<p>
	 *
	 */
	public String stk_cl_ba_typ_nm() {
		return getConstString(offset + 108, $stk_cl_ba_typ_nm);
	}

	/**
	 * Inventory closing day before/after type name 在庫締日前後区分名.<p>
	 *
	 */
	public void stk_cl_ba_typ_nm(String value) {
		setConstString(offset + 108, $stk_cl_ba_typ_nm, value);
	}


	/**
	 * Before/after sales closing day type name 売上締日前後区分名.<p>
	 *
	 */
	public String sls_cl_ba_typ_nm() {
		return getConstString(offset + 109, $sls_cl_ba_typ_nm);
	}

	/**
	 * Before/after sales closing day type name 売上締日前後区分名.<p>
	 *
	 */
	public void sls_cl_ba_typ_nm(String value) {
		setConstString(offset + 109, $sls_cl_ba_typ_nm, value);
	}


	/**
	 * Before/after payment received closing day type name 入金締日前後区分名.<p>
	 *
	 */
	public String rcv_cl_ba_typ_nm() {
		return getConstString(offset + 110, $rcv_cl_ba_typ_nm);
	}

	/**
	 * Before/after payment received closing day type name 入金締日前後区分名.<p>
	 *
	 */
	public void rcv_cl_ba_typ_nm(String value) {
		setConstString(offset + 110, $rcv_cl_ba_typ_nm, value);
	}


	/**
	 * Before/after purchase closing day type name 仕入締日前後区分名.<p>
	 *
	 */
	public String purc_cl_ba_typ_nm() {
		return getConstString(offset + 111, $purc_cl_ba_typ_nm);
	}

	/**
	 * Before/after purchase closing day type name 仕入締日前後区分名.<p>
	 *
	 */
	public void purc_cl_ba_typ_nm(String value) {
		setConstString(offset + 111, $purc_cl_ba_typ_nm, value);
	}


	/**
	 * Before/after payment closing day type name 支払締日前後区分名.<p>
	 *
	 */
	public String pay_cl_ba_typ_nm() {
		return getConstString(offset + 112, $pay_cl_ba_typ_nm);
	}

	/**
	 * Before/after payment closing day type name 支払締日前後区分名.<p>
	 *
	 */
	public void pay_cl_ba_typ_nm(String value) {
		setConstString(offset + 112, $pay_cl_ba_typ_nm, value);
	}


	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public String sls_upri_req_typ_nm() {
		return getConstString(offset + 113, $sls_upri_req_typ_nm);
	}

	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public void sls_upri_req_typ_nm(String value) {
		setConstString(offset + 113, $sls_upri_req_typ_nm, value);
	}


	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public String purc_upri_req_typ_nm() {
		return getConstString(offset + 114, $purc_upri_req_typ_nm);
	}

	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public void purc_upri_req_typ_nm(String value) {
		setConstString(offset + 114, $purc_upri_req_typ_nm, value);
	}


	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public String outsrc_upri_typ_nm() {
		return getConstString(offset + 115, $outsrc_upri_typ_nm);
	}

	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public void outsrc_upri_typ_nm(String value) {
		setConstString(offset + 115, $outsrc_upri_typ_nm, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 116, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 116, $sls_basis_typ_nm, value);
	}


	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public String bill_basis_typ_nm() {
		return getConstString(offset + 117, $bill_basis_typ_nm);
	}

	/**
	 * Billing calculation base type name 請求起算区分名.<p>
	 *
	 */
	public void bill_basis_typ_nm(String value) {
		setConstString(offset + 117, $bill_basis_typ_nm, value);
	}


	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public String ship_schd_split_typ_nm() {
		return getConstString(offset + 118, $ship_schd_split_typ_nm);
	}

	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public void ship_schd_split_typ_nm(String value) {
		setConstString(offset + 118, $ship_schd_split_typ_nm, value);
	}


	/**
	 * In-transit inventory controlling site type name 積送在庫管轄区分名.<p>
	 *
	 */
	public String xfr_stk_mng_typ_nm() {
		return getConstString(offset + 119, $xfr_stk_mng_typ_nm);
	}

	/**
	 * In-transit inventory controlling site type name 積送在庫管轄区分名.<p>
	 *
	 */
	public void xfr_stk_mng_typ_nm(String value) {
		setConstString(offset + 119, $xfr_stk_mng_typ_nm, value);
	}


	/**
	 * Exchange rounding type name 為替端数処理区分名.<p>
	 *
	 */
	public String xrate_rnd_typ_nm() {
		return getConstString(offset + 120, $xrate_rnd_typ_nm);
	}

	/**
	 * Exchange rounding type name 為替端数処理区分名.<p>
	 *
	 */
	public void xrate_rnd_typ_nm(String value) {
		setConstString(offset + 120, $xrate_rnd_typ_nm, value);
	}


	/**
	 * Offset tax amount rounding type 相殺税額端数処理区分名.<p>
	 *
	 */
	public String setoff_tax_rnd_typ_nm() {
		return getConstString(offset + 121, $setoff_tax_rnd_typ_nm);
	}

	/**
	 * Offset tax amount rounding type 相殺税額端数処理区分名.<p>
	 *
	 */
	public void setoff_tax_rnd_typ_nm(String value) {
		setConstString(offset + 121, $setoff_tax_rnd_typ_nm, value);
	}


	/**
	 * Payment fee rounding type name 支払手数料税額端数処理区分名.<p>
	 *
	 */
	public String com_paid_tax_rnd_typ_nm() {
		return getConstString(offset + 122, $com_paid_tax_rnd_typ_nm);
	}

	/**
	 * Payment fee rounding type name 支払手数料税額端数処理区分名.<p>
	 *
	 */
	public void com_paid_tax_rnd_typ_nm(String value) {
		setConstString(offset + 122, $com_paid_tax_rnd_typ_nm, value);
	}


	/**
	 * Withholding tax amount rounding type 源泉税額端数処理区分名.<p>
	 *
	 */
	public String wtax_rnd_typ_nm() {
		return getConstString(offset + 123, $wtax_rnd_typ_nm);
	}

	/**
	 * Withholding tax amount rounding type 源泉税額端数処理区分名.<p>
	 *
	 */
	public void wtax_rnd_typ_nm(String value) {
		setConstString(offset + 123, $wtax_rnd_typ_nm, value);
	}


	/**
	 * Inventory amount rounding type 在庫金額端数処理区分名.<p>
	 *
	 */
	public String stk_amt_rnd_typ_nm() {
		return getConstString(offset + 124, $stk_amt_rnd_typ_nm);
	}

	/**
	 * Inventory amount rounding type 在庫金額端数処理区分名.<p>
	 *
	 */
	public void stk_amt_rnd_typ_nm(String value) {
		setConstString(offset + 124, $stk_amt_rnd_typ_nm, value);
	}


	/**
	 * Sales budget unit type name 販売予算単位区分名.<p>
	 *
	 */
	public String sls_bdj_rnd_typ_nm() {
		return getConstString(offset + 125, $sls_bdj_rnd_typ_nm);
	}

	/**
	 * Sales budget unit type name 販売予算単位区分名.<p>
	 *
	 */
	public void sls_bdj_rnd_typ_nm(String value) {
		setConstString(offset + 125, $sls_bdj_rnd_typ_nm, value);
	}


	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public String po_print_nm() {
		return getConstString(offset + 126, $po_print_nm);
	}

	/**
	 * Display PO sheet name 注文書表示名.<p>
	 *
	 */
	public void po_print_nm(String value) {
		setConstString(offset + 126, $po_print_nm, value);
	}


	/**
	 * Standard unit cost acquisition type name (For gross profit calculation) 標準単価取得区分名（粗利計算用）.<p>
	 *
	 */
	public String gm_std_upri_typ_nm() {
		return getConstString(offset + 127, $gm_std_upri_typ_nm);
	}

	/**
	 * Standard unit cost acquisition type name (For gross profit calculation) 標準単価取得区分名（粗利計算用）.<p>
	 *
	 */
	public void gm_std_upri_typ_nm(String value) {
		setConstString(offset + 127, $gm_std_upri_typ_nm, value);
	}


	/**
	 * Standard unit cost acquisition type name (For inventory valuation) 標準単価取得区分名（在庫評価用）.<p>
	 *
	 */
	public String stk_std_upri_typ_nm() {
		return getConstString(offset + 128, $stk_std_upri_typ_nm);
	}

	/**
	 * Standard unit cost acquisition type name (For inventory valuation) 標準単価取得区分名（在庫評価用）.<p>
	 *
	 */
	public void stk_std_upri_typ_nm(String value) {
		setConstString(offset + 128, $stk_std_upri_typ_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 129, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 129, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 130, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 130, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 131, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 131, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 132, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 132, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 133, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 133, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 134, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 134, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 135, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 135, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 136, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 136, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 137, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 137, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 138, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 138, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 139, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 139, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 140, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 140, $upd_srv_req_no, value);
	}


	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public String rpt_strg_ext_sys_cd() {
		return getConstString(offset + 141, $rpt_strg_ext_sys_cd);
	}

	/**
	 * Report storage system cd. 帳票保存システムＣＤ.<p>
	 *
	 */
	public void rpt_strg_ext_sys_cd(String value) {
		setConstString(offset + 141, $rpt_strg_ext_sys_cd, value);
	}


	/**
	 * Report storage system name 帳票保存システム名.<p>
	 *
	 */
	public String rpt_strg_ext_sys_nm() {
		return getConstString(offset + 142, $rpt_strg_ext_sys_nm);
	}

	/**
	 * Report storage system name 帳票保存システム名.<p>
	 *
	 */
	public void rpt_strg_ext_sys_nm(String value) {
		setConstString(offset + 142, $rpt_strg_ext_sys_nm, value);
	}


	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 143, $cst_prnt_typ);
	}

	/**
	 * Report issue type (Customer) 帳票発行区分（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 143, $cst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public String cst_prnt_typ_nm() {
		return getConstString(offset + 144, $cst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Customer) 帳票発行区分名（得意先）.<p>
	 *
	 */
	public void cst_prnt_typ_nm(String value) {
		setConstString(offset + 144, $cst_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public String acst_prnt_typ() {
		return getConstString(offset + 145, $acst_prnt_typ);
	}

	/**
	 * Report issue type (AR customer) 帳票発行区分（売掛先）.<p>
	 *
	 */
	public void acst_prnt_typ(String value) {
		setConstString(offset + 145, $acst_prnt_typ, value);
	}


	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public String acst_prnt_typ_nm() {
		return getConstString(offset + 146, $acst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (AR customer) 帳票発行区分名（売掛先）.<p>
	 *
	 */
	public void acst_prnt_typ_nm(String value) {
		setConstString(offset + 146, $acst_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 147, $bcst_prnt_typ);
	}

	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 147, $bcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public String bcst_prnt_typ_nm() {
		return getConstString(offset + 148, $bcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public void bcst_prnt_typ_nm(String value) {
		setConstString(offset + 148, $bcst_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 149, $rcst_prnt_typ);
	}

	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 149, $rcst_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public String rcst_prnt_typ_nm() {
		return getConstString(offset + 150, $rcst_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public void rcst_prnt_typ_nm(String value) {
		setConstString(offset + 150, $rcst_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public String dlv_prnt_typ() {
		return getConstString(offset + 151, $dlv_prnt_typ);
	}

	/**
	 * Report issue type (Delivery destination) 帳票発行区分（納品先）.<p>
	 *
	 */
	public void dlv_prnt_typ(String value) {
		setConstString(offset + 151, $dlv_prnt_typ, value);
	}


	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public String dlv_prnt_typ_nm() {
		return getConstString(offset + 152, $dlv_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Delivery destination) 帳票発行区分名（納品先）.<p>
	 *
	 */
	public void dlv_prnt_typ_nm(String value) {
		setConstString(offset + 152, $dlv_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 153, $sppl_prnt_typ);
	}

	/**
	 * Report issue type (Supplier) 帳票発行区分（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 153, $sppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public String sppl_prnt_typ_nm() {
		return getConstString(offset + 154, $sppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Supplier) 帳票発行区分名（発注先）.<p>
	 *
	 */
	public void sppl_prnt_typ_nm(String value) {
		setConstString(offset + 154, $sppl_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public String asppl_prnt_typ() {
		return getConstString(offset + 155, $asppl_prnt_typ);
	}

	/**
	 * Report issue type (AP supplier) 帳票発行区分（買掛先）.<p>
	 *
	 */
	public void asppl_prnt_typ(String value) {
		setConstString(offset + 155, $asppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public String asppl_prnt_typ_nm() {
		return getConstString(offset + 156, $asppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (AP supplier) 帳票発行区分名（買掛先）.<p>
	 *
	 */
	public void asppl_prnt_typ_nm(String value) {
		setConstString(offset + 156, $asppl_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 157, $bsppl_prnt_typ);
	}

	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 157, $bsppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public String bsppl_prnt_typ_nm() {
		return getConstString(offset + 158, $bsppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public void bsppl_prnt_typ_nm(String value) {
		setConstString(offset + 158, $bsppl_prnt_typ_nm, value);
	}


	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 159, $psppl_prnt_typ);
	}

	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 159, $psppl_prnt_typ, value);
	}


	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public String psppl_prnt_typ_nm() {
		return getConstString(offset + 160, $psppl_prnt_typ_nm);
	}

	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public void psppl_prnt_typ_nm(String value) {
		setConstString(offset + 160, $psppl_prnt_typ_nm, value);
	}


	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			return co_alt_nm1();
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			return co_alt_nm2();
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			return co_alt_nm3();
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			return co_alt_nm4();
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
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			return co_repl_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			return std_cal_cd();
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			return bill_cl_cal_cd();
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			return stk_cl_cal_cd();
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			return sls_cl_cal_cd();
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			return rcv_cl_cal_cd();
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			return purc_cl_cal_cd();
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_cl_cal_cd();
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_cd();
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ();
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ();
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ();
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ();
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ();
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			return sls_xrate_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			return bill_xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
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
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ();
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			return gm_std_upri_typ();
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			return stk_std_upri_typ();
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			return std_cal_nm();
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			return stk_cl_cal_nm();
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			return sls_cl_cal_nm();
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			return bill_cl_cal_nm();
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			return rcv_cl_cal_nm();
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			return purc_cl_cal_nm();
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_cl_cal_nm();
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_nm();
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			return sls_xrate_nm();
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			return purc_xrate_nm();
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			return prov_xrate_nm();
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			return bill_xrate_nm();
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			return pay_xrate_nm();
		}
		if ($stk_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ_nm();
		}
		if ($sls_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ_nm();
		}
		if ($rcv_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ_nm();
		}
		if ($purc_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ_nm();
		}
		if ($pay_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ_nm();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($xfr_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ_nm();
		}
		if ($xrate_rnd_typ_nm.equalsIgnoreCase(name)) {
			return xrate_rnd_typ_nm();
		}
		if ($setoff_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ_nm();
		}
		if ($com_paid_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ_nm();
		}
		if ($wtax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return wtax_rnd_typ_nm();
		}
		if ($stk_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ_nm();
		}
		if ($sls_bdj_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($gm_std_upri_typ_nm.equalsIgnoreCase(name)) {
			return gm_std_upri_typ_nm();
		}
		if ($stk_std_upri_typ_nm.equalsIgnoreCase(name)) {
			return stk_std_upri_typ_nm();
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
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_cd();
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_nm();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return acst_prnt_typ_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return dlv_prnt_typ_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return asppl_prnt_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($st_mon.equalsIgnoreCase(name)) {
			return st_mon();
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			return dt_switch_time();
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			return stk_cl_delay_days();
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			return sls_cl_delay_days();
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			return rcv_cl_delay_days();
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			return purc_cl_delay_days();
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_cl_delay_days();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			return stk_lst_cnf_num();
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			return stk_lst_limit_num();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			return ac_slip_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			return ar_no_use_flg();
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			return ap_no_use_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			return bill_xrate_conv_flg();
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			return pay_xrate_conv_flg();
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon01_xrate_rev_flg();
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon02_xrate_rev_flg();
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon03_xrate_rev_flg();
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon04_xrate_rev_flg();
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon05_xrate_rev_flg();
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon06_xrate_rev_flg();
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon07_xrate_rev_flg();
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon08_xrate_rev_flg();
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon09_xrate_rev_flg();
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon10_xrate_rev_flg();
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon11_xrate_rev_flg();
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon12_xrate_rev_flg();
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			return ac_slip_seq_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			return co_alt_nm1();
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			return co_alt_nm2();
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			return co_alt_nm3();
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			return co_alt_nm4();
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
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			return co_repl_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			return std_cal_cd();
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			return bill_cl_cal_cd();
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			return stk_cl_cal_cd();
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			return sls_cl_cal_cd();
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			return rcv_cl_cal_cd();
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			return purc_cl_cal_cd();
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_cl_cal_cd();
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_cd();
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ();
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ();
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ();
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ();
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ();
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			return sls_xrate_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			return bill_xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
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
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ();
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			return gm_std_upri_typ();
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			return stk_std_upri_typ();
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			return std_cal_nm();
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			return stk_cl_cal_nm();
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			return sls_cl_cal_nm();
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			return bill_cl_cal_nm();
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			return rcv_cl_cal_nm();
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			return purc_cl_cal_nm();
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_cl_cal_nm();
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_nm();
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			return sls_xrate_nm();
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			return purc_xrate_nm();
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			return prov_xrate_nm();
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			return bill_xrate_nm();
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			return pay_xrate_nm();
		}
		if ($stk_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ_nm();
		}
		if ($sls_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ_nm();
		}
		if ($rcv_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ_nm();
		}
		if ($purc_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ_nm();
		}
		if ($pay_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ_nm();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			return bill_basis_typ_nm();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($xfr_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ_nm();
		}
		if ($xrate_rnd_typ_nm.equalsIgnoreCase(name)) {
			return xrate_rnd_typ_nm();
		}
		if ($setoff_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ_nm();
		}
		if ($com_paid_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ_nm();
		}
		if ($wtax_rnd_typ_nm.equalsIgnoreCase(name)) {
			return wtax_rnd_typ_nm();
		}
		if ($stk_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ_nm();
		}
		if ($sls_bdj_rnd_typ_nm.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($gm_std_upri_typ_nm.equalsIgnoreCase(name)) {
			return gm_std_upri_typ_nm();
		}
		if ($stk_std_upri_typ_nm.equalsIgnoreCase(name)) {
			return stk_std_upri_typ_nm();
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
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_cd();
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_nm();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return cst_prnt_typ_nm();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return acst_prnt_typ_nm();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bcst_prnt_typ_nm();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			return rcst_prnt_typ_nm();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			return dlv_prnt_typ_nm();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return sppl_prnt_typ_nm();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return asppl_prnt_typ_nm();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ_nm();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			return psppl_prnt_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($st_mon.equalsIgnoreCase(name)) {
			return st_mon();
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			return dt_switch_time();
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			return stk_cl_delay_days();
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			return sls_cl_delay_days();
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			return rcv_cl_delay_days();
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			return purc_cl_delay_days();
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_cl_delay_days();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			return stk_lst_cnf_num();
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			return stk_lst_limit_num();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			return ac_slip_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			return ar_no_use_flg();
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			return ap_no_use_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			return bill_xrate_conv_flg();
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			return pay_xrate_conv_flg();
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon01_xrate_rev_flg();
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon02_xrate_rev_flg();
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon03_xrate_rev_flg();
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon04_xrate_rev_flg();
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon05_xrate_rev_flg();
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon06_xrate_rev_flg();
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon07_xrate_rev_flg();
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon08_xrate_rev_flg();
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon09_xrate_rev_flg();
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon10_xrate_rev_flg();
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon11_xrate_rev_flg();
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon12_xrate_rev_flg();
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			return ac_slip_seq_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			co_alt_nm1(value);
			return;
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			co_alt_nm2(value);
			return;
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			co_alt_nm3(value);
			return;
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			co_alt_nm4(value);
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
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			co_repl_nm(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			std_cal_cd(value);
			return;
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			bill_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			stk_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			sls_cl_cal_cd(value);
			return;
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			rcv_cl_cal_cd(value);
			return;
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			purc_cl_cal_cd(value);
			return;
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_cl_cal_cd(value);
			return;
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			stk_cl_ba_typ(value);
			return;
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			sls_cl_ba_typ(value);
			return;
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ(value);
			return;
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			purc_cl_ba_typ(value);
			return;
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_cl_ba_typ(value);
			return;
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			sls_xrate_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
			return;
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			bill_xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
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
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ(value);
			return;
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			gm_std_upri_typ(value);
			return;
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			stk_std_upri_typ(value);
			return;
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			std_cal_nm(value);
			return;
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			stk_cl_cal_nm(value);
			return;
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			sls_cl_cal_nm(value);
			return;
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			bill_cl_cal_nm(value);
			return;
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			rcv_cl_cal_nm(value);
			return;
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			purc_cl_cal_nm(value);
			return;
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_cl_cal_nm(value);
			return;
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_nm(value);
			return;
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			sls_xrate_nm(value);
			return;
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			purc_xrate_nm(value);
			return;
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			prov_xrate_nm(value);
			return;
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			bill_xrate_nm(value);
			return;
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			pay_xrate_nm(value);
			return;
		}
		if ($stk_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			stk_cl_ba_typ_nm(value);
			return;
		}
		if ($sls_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			sls_cl_ba_typ_nm(value);
			return;
		}
		if ($rcv_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ_nm(value);
			return;
		}
		if ($purc_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			purc_cl_ba_typ_nm(value);
			return;
		}
		if ($pay_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_cl_ba_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($xfr_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ_nm(value);
			return;
		}
		if ($xrate_rnd_typ_nm.equalsIgnoreCase(name)) {
			xrate_rnd_typ_nm(value);
			return;
		}
		if ($setoff_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ_nm(value);
			return;
		}
		if ($com_paid_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ_nm(value);
			return;
		}
		if ($wtax_rnd_typ_nm.equalsIgnoreCase(name)) {
			wtax_rnd_typ_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_bdj_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($gm_std_upri_typ_nm.equalsIgnoreCase(name)) {
			gm_std_upri_typ_nm(value);
			return;
		}
		if ($stk_std_upri_typ_nm.equalsIgnoreCase(name)) {
			stk_std_upri_typ_nm(value);
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
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_cd(value);
			return;
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_nm(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			acst_prnt_typ_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			dlv_prnt_typ_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			asppl_prnt_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			ar_no_use_flg(value);
			return;
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			ap_no_use_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			bill_xrate_conv_flg(value);
			return;
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			pay_xrate_conv_flg(value);
			return;
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon01_xrate_rev_flg(value);
			return;
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon02_xrate_rev_flg(value);
			return;
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon03_xrate_rev_flg(value);
			return;
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon04_xrate_rev_flg(value);
			return;
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon05_xrate_rev_flg(value);
			return;
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon06_xrate_rev_flg(value);
			return;
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon07_xrate_rev_flg(value);
			return;
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon08_xrate_rev_flg(value);
			return;
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon09_xrate_rev_flg(value);
			return;
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon10_xrate_rev_flg(value);
			return;
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon11_xrate_rev_flg(value);
			return;
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon12_xrate_rev_flg(value);
			return;
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			ac_slip_seq_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			co_alt_nm1(value);
			return;
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			co_alt_nm2(value);
			return;
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			co_alt_nm3(value);
			return;
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			co_alt_nm4(value);
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
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			co_repl_nm(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			std_cal_cd(value);
			return;
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			bill_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			stk_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			sls_cl_cal_cd(value);
			return;
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			rcv_cl_cal_cd(value);
			return;
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			purc_cl_cal_cd(value);
			return;
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_cl_cal_cd(value);
			return;
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			stk_cl_ba_typ(value);
			return;
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			sls_cl_ba_typ(value);
			return;
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ(value);
			return;
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			purc_cl_ba_typ(value);
			return;
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_cl_ba_typ(value);
			return;
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			sls_xrate_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
			return;
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			bill_xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
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
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ(value);
			return;
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			gm_std_upri_typ(value);
			return;
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			stk_std_upri_typ(value);
			return;
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			std_cal_nm(value);
			return;
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			stk_cl_cal_nm(value);
			return;
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			sls_cl_cal_nm(value);
			return;
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			bill_cl_cal_nm(value);
			return;
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			rcv_cl_cal_nm(value);
			return;
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			purc_cl_cal_nm(value);
			return;
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_cl_cal_nm(value);
			return;
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_nm(value);
			return;
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			sls_xrate_nm(value);
			return;
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			purc_xrate_nm(value);
			return;
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			prov_xrate_nm(value);
			return;
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			bill_xrate_nm(value);
			return;
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			pay_xrate_nm(value);
			return;
		}
		if ($stk_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			stk_cl_ba_typ_nm(value);
			return;
		}
		if ($sls_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			sls_cl_ba_typ_nm(value);
			return;
		}
		if ($rcv_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ_nm(value);
			return;
		}
		if ($purc_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			purc_cl_ba_typ_nm(value);
			return;
		}
		if ($pay_cl_ba_typ_nm.equalsIgnoreCase(name)) {
			pay_cl_ba_typ_nm(value);
			return;
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_req_typ_nm(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			sls_basis_typ_nm(value);
			return;
		}
		if ($bill_basis_typ_nm.equalsIgnoreCase(name)) {
			bill_basis_typ_nm(value);
			return;
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			ship_schd_split_typ_nm(value);
			return;
		}
		if ($xfr_stk_mng_typ_nm.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ_nm(value);
			return;
		}
		if ($xrate_rnd_typ_nm.equalsIgnoreCase(name)) {
			xrate_rnd_typ_nm(value);
			return;
		}
		if ($setoff_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ_nm(value);
			return;
		}
		if ($com_paid_tax_rnd_typ_nm.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ_nm(value);
			return;
		}
		if ($wtax_rnd_typ_nm.equalsIgnoreCase(name)) {
			wtax_rnd_typ_nm(value);
			return;
		}
		if ($stk_amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ_nm(value);
			return;
		}
		if ($sls_bdj_rnd_typ_nm.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($gm_std_upri_typ_nm.equalsIgnoreCase(name)) {
			gm_std_upri_typ_nm(value);
			return;
		}
		if ($stk_std_upri_typ_nm.equalsIgnoreCase(name)) {
			stk_std_upri_typ_nm(value);
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
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_cd(value);
			return;
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_nm(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($cst_prnt_typ_nm.equalsIgnoreCase(name)) {
			cst_prnt_typ_nm(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ_nm.equalsIgnoreCase(name)) {
			acst_prnt_typ_nm(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			bcst_prnt_typ_nm(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ_nm.equalsIgnoreCase(name)) {
			rcst_prnt_typ_nm(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ_nm.equalsIgnoreCase(name)) {
			dlv_prnt_typ_nm(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			sppl_prnt_typ_nm(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			asppl_prnt_typ_nm(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			bsppl_prnt_typ_nm(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ_nm.equalsIgnoreCase(name)) {
			psppl_prnt_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			ar_no_use_flg(value);
			return;
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			ap_no_use_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			bill_xrate_conv_flg(value);
			return;
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			pay_xrate_conv_flg(value);
			return;
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon01_xrate_rev_flg(value);
			return;
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon02_xrate_rev_flg(value);
			return;
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon03_xrate_rev_flg(value);
			return;
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon04_xrate_rev_flg(value);
			return;
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon05_xrate_rev_flg(value);
			return;
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon06_xrate_rev_flg(value);
			return;
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon07_xrate_rev_flg(value);
			return;
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon08_xrate_rev_flg(value);
			return;
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon09_xrate_rev_flg(value);
			return;
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon10_xrate_rev_flg(value);
			return;
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon11_xrate_rev_flg(value);
			return;
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon12_xrate_rev_flg(value);
			return;
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			ac_slip_seq_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

