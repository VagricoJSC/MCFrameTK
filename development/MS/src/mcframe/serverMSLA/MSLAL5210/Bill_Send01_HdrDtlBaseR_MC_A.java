package mcframe.serverMSLA.MSLAL5210;

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
 * ブロック"Bill_Send01_HdrDtlBase"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Bill_Send01_HdrDtlBaseR_MC_A extends MCConstRow {

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public static final String $pre_bill_dt = "pre_bill_dt";
	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public static final String $bill_st_dt = "bill_st_dt";
	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public static final String $bill_end_dt = "bill_end_dt";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * IF company cd. ＩＦ会社ＣＤ.<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	/**
	 * Company name 会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
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
	 * Billing dept. 請求部門.<p>
	 *
	 */
	public static final String $bill_dpt = "bill_dpt";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * IF country cd. ＩＦ国ＣＤ.<p>
	 *
	 */
	public static final String $if_cntry_cd = "if_cntry_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * IF billing customer cd. ＩＦ請求先ＣＤ.<p>
	 *
	 */
	public static final String $if_bcst_cd = "if_bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 * Billing customer corporation number 請求先法人番号.<p>
	 *
	 */
	public static final String $bcst_ein = "bcst_ein";
	/**
	 * Billing customer business No. 請求先事業者ＮＯ.<p>
	 *
	 */
	public static final String $bcst_biz_co_no = "bcst_biz_co_no";
	/**
	 * Billing customer zip code 請求先郵便番号.<p>
	 *
	 */
	public static final String $bcst_zip_cd = "bcst_zip_cd";
	/**
	 * Billing customer address 1 請求先住所１.<p>
	 *
	 */
	public static final String $bcst_addr1 = "bcst_addr1";
	/**
	 * Billing customer address 2 請求先住所２.<p>
	 *
	 */
	public static final String $bcst_addr2 = "bcst_addr2";
	/**
	 * Billing customer address 3 請求先住所３.<p>
	 *
	 */
	public static final String $bcst_addr3 = "bcst_addr3";
	/**
	 * Billing customer address 4 請求先住所４.<p>
	 *
	 */
	public static final String $bcst_addr4 = "bcst_addr4";
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 * Billing customer country cd. 請求先国ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cntry_cd = "bcst_cntry_cd";
	/**
	 * IF billing customer country cd. ＩＦ請求先国ＣＤ.<p>
	 *
	 */
	public static final String $if_bcst_cntry_cd = "if_bcst_cntry_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * IF transaction currency cd. ＩＦ取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $if_trd_cur_cd = "if_trd_cur_cd";
	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt1 = "tax_rate_sls_amt1";
	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt1 = "tax_rate_tax_amt1";
	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt1 = "tax_rate_base_tax_amt1";
	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt2 = "tax_rate_sls_amt2";
	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt2 = "tax_rate_tax_amt2";
	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt2 = "tax_rate_base_tax_amt2";
	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt3 = "tax_rate_sls_amt3";
	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt3 = "tax_rate_tax_amt3";
	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt3 = "tax_rate_base_tax_amt3";
	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public static final String $tax_rate4 = "tax_rate4";
	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt4 = "tax_rate_sls_amt4";
	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt4 = "tax_rate_tax_amt4";
	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt4 = "tax_rate_base_tax_amt4";
	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public static final String $tax_rate5 = "tax_rate5";
	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt5 = "tax_rate_sls_amt5";
	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt5 = "tax_rate_tax_amt5";
	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt5 = "tax_rate_base_tax_amt5";
	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public static final String $tax_rate6 = "tax_rate6";
	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt6 = "tax_rate_sls_amt6";
	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt6 = "tax_rate_tax_amt6";
	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt6 = "tax_rate_base_tax_amt6";
	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public static final String $tax_rate7 = "tax_rate7";
	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt7 = "tax_rate_sls_amt7";
	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt7 = "tax_rate_tax_amt7";
	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt7 = "tax_rate_base_tax_amt7";
	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public static final String $tax_rate8 = "tax_rate8";
	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt8 = "tax_rate_sls_amt8";
	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt8 = "tax_rate_tax_amt8";
	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt8 = "tax_rate_base_tax_amt8";
	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public static final String $tax_rate9 = "tax_rate9";
	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt9 = "tax_rate_sls_amt9";
	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt9 = "tax_rate_tax_amt9";
	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt9 = "tax_rate_base_tax_amt9";
	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public static final String $tax_rate10 = "tax_rate10";
	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt10 = "tax_rate_sls_amt10";
	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt10 = "tax_rate_tax_amt10";
	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt10 = "tax_rate_base_tax_amt10";
	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public static final String $adv_amt_bal = "adv_amt_bal";
	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public static final String $adv_amt = "adv_amt";
	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public static final String $adv_setoff_amt = "adv_setoff_amt";
	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public static final String $adv_setoff_tax_amt = "adv_setoff_tax_amt";
	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public static final String $rcv_schd_dt1 = "rcv_schd_dt1";
	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public static final String $rcv_schd_amt1 = "rcv_schd_amt1";
	/**
	 * Payment receipt method cd. 1 入金方法ＣＤ１.<p>
	 *
	 */
	public static final String $rcv_mtd_cd1 = "rcv_mtd_cd1";
	/**
	 * IF payment receipt method cd. 1 ＩＦ入金方法ＣＤ１.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd1 = "if_rcv_mtd_cd1";
	/**
	 * Payment receipt method name 1 入金方法名１.<p>
	 *
	 */
	public static final String $rcv_mtd_nm1 = "rcv_mtd_nm1";
	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public static final String $rcv_schd_dt2 = "rcv_schd_dt2";
	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public static final String $rcv_schd_amt2 = "rcv_schd_amt2";
	/**
	 * Payment receipt method cd. 2 入金方法ＣＤ２.<p>
	 *
	 */
	public static final String $rcv_mtd_cd2 = "rcv_mtd_cd2";
	/**
	 * IF payment receipt method cd. 2 ＩＦ入金方法ＣＤ２.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd2 = "if_rcv_mtd_cd2";
	/**
	 * Payment receipt method name 2 入金方法名2.<p>
	 *
	 */
	public static final String $rcv_mtd_nm2 = "rcv_mtd_nm2";
	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public static final String $rcv_schd_dt3 = "rcv_schd_dt3";
	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public static final String $rcv_schd_amt3 = "rcv_schd_amt3";
	/**
	 * Payment receipt method cd. 3 入金方法ＣＤ３.<p>
	 *
	 */
	public static final String $rcv_mtd_cd3 = "rcv_mtd_cd3";
	/**
	 * IF payment receipt method cd. 3 ＩＦ入金方法ＣＤ３.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd3 = "if_rcv_mtd_cd3";
	/**
	 * Payment receipt method name 3 入金方法名3.<p>
	 *
	 */
	public static final String $rcv_mtd_nm3 = "rcv_mtd_nm3";
	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public static final String $rcv_schd_dt4 = "rcv_schd_dt4";
	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public static final String $rcv_schd_amt4 = "rcv_schd_amt4";
	/**
	 * Payment receipt method cd. 4 入金方法ＣＤ４.<p>
	 *
	 */
	public static final String $rcv_mtd_cd4 = "rcv_mtd_cd4";
	/**
	 * IF payment receipt method cd. 4 ＩＦ入金方法ＣＤ４.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd4 = "if_rcv_mtd_cd4";
	/**
	 * Payment receipt method name 4 入金方法名4.<p>
	 *
	 */
	public static final String $rcv_mtd_nm4 = "rcv_mtd_nm4";
	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public static final String $rcv_schd_dt5 = "rcv_schd_dt5";
	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public static final String $rcv_schd_amt5 = "rcv_schd_amt5";
	/**
	 * Payment receipt method cd. 5 入金方法ＣＤ５.<p>
	 *
	 */
	public static final String $rcv_mtd_cd5 = "rcv_mtd_cd5";
	/**
	 * IF payment receipt method cd. 5 ＩＦ入金方法ＣＤ５.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd5 = "if_rcv_mtd_cd5";
	/**
	 * Payment receipt method name 5 入金方法名5.<p>
	 *
	 */
	public static final String $rcv_mtd_nm5 = "rcv_mtd_nm5";
	/**
	 * Scheduled payment receipt date 6 入金予定日６.<p>
	 *
	 */
	public static final String $rcv_schd_dt6 = "rcv_schd_dt6";
	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public static final String $rcv_schd_amt6 = "rcv_schd_amt6";
	/**
	 * Payment receipt method cd. 6 入金方法ＣＤ６.<p>
	 *
	 */
	public static final String $rcv_mtd_cd6 = "rcv_mtd_cd6";
	/**
	 * IF payment receipt method cd. 6 ＩＦ入金方法ＣＤ６.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd6 = "if_rcv_mtd_cd6";
	/**
	 * Payment receipt method name 6 入金方法名6.<p>
	 *
	 */
	public static final String $rcv_mtd_nm6 = "rcv_mtd_nm6";
	/**
	 * Scheduled payment receipt date 7 入金予定日７.<p>
	 *
	 */
	public static final String $rcv_schd_dt7 = "rcv_schd_dt7";
	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public static final String $rcv_schd_amt7 = "rcv_schd_amt7";
	/**
	 * Payment receipt method cd. 7 入金方法ＣＤ７.<p>
	 *
	 */
	public static final String $rcv_mtd_cd7 = "rcv_mtd_cd7";
	/**
	 * IF payment receipt method cd. 7 ＩＦ入金方法ＣＤ７.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd7 = "if_rcv_mtd_cd7";
	/**
	 * Payment receipt method name 7 入金方法名7.<p>
	 *
	 */
	public static final String $rcv_mtd_nm7 = "rcv_mtd_nm7";
	/**
	 * Scheduled payment receipt date 8 入金予定日８.<p>
	 *
	 */
	public static final String $rcv_schd_dt8 = "rcv_schd_dt8";
	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public static final String $rcv_schd_amt8 = "rcv_schd_amt8";
	/**
	 * Payment receipt method cd. 8 入金方法ＣＤ８.<p>
	 *
	 */
	public static final String $rcv_mtd_cd8 = "rcv_mtd_cd8";
	/**
	 * IF payment receipt method cd. 8 ＩＦ入金方法ＣＤ８.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd8 = "if_rcv_mtd_cd8";
	/**
	 * Payment receipt method name 8 入金方法名8.<p>
	 *
	 */
	public static final String $rcv_mtd_nm8 = "rcv_mtd_nm8";
	/**
	 * Scheduled payment receipt date 9 入金予定日９.<p>
	 *
	 */
	public static final String $rcv_schd_dt9 = "rcv_schd_dt9";
	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public static final String $rcv_schd_amt9 = "rcv_schd_amt9";
	/**
	 * Payment receipt method cd. 9 入金方法ＣＤ９.<p>
	 *
	 */
	public static final String $rcv_mtd_cd9 = "rcv_mtd_cd9";
	/**
	 * IF payment receipt method cd. 9 ＩＦ入金方法ＣＤ９.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd9 = "if_rcv_mtd_cd9";
	/**
	 * Payment receipt method name 9 入金方法名9.<p>
	 *
	 */
	public static final String $rcv_mtd_nm9 = "rcv_mtd_nm9";
	/**
	 * Scheduled payment receipt date 10 入金予定日１０.<p>
	 *
	 */
	public static final String $rcv_schd_dt10 = "rcv_schd_dt10";
	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public static final String $rcv_schd_amt10 = "rcv_schd_amt10";
	/**
	 * Payment receipt method cd. 10 入金方法ＣＤ１０.<p>
	 *
	 */
	public static final String $rcv_mtd_cd10 = "rcv_mtd_cd10";
	/**
	 * IF payment receipt method cd. 10 ＩＦ入金方法ＣＤ１０.<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd10 = "if_rcv_mtd_cd10";
	/**
	 * Payment receipt method name 10 入金方法名１0.<p>
	 *
	 */
	public static final String $rcv_mtd_nm10 = "rcv_mtd_nm10";
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * IF bank account cd. ＩＦ口座ＣＤ.<p>
	 *
	 */
	public static final String $if_bank_ac_cd = "if_bank_ac_cd";
	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public static final String $bank_ac_holder = "bank_ac_holder";
	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public static final String $bank_ac_holder_sub = "bank_ac_holder_sub";
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * IF transaction cd. ＩＦ取引ＣＤ.<p>
	 *
	 */
	public static final String $if_trd_cd = "if_trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
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
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
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
	 * IF item cd. ＩＦ品目ＣＤ.<p>
	 *
	 */
	public static final String $if_itm_cd = "if_itm_cd";
	/**
	 * IF branch No. 1 ＩＦ枝番１.<p>
	 *
	 */
	public static final String $if_itm_sub1 = "if_itm_sub1";
	/**
	 * IF branch No. 2 ＩＦ枝番２.<p>
	 *
	 */
	public static final String $if_itm_sub2 = "if_itm_sub2";
	/**
	 * IF branch No. 3 ＩＦ枝番３.<p>
	 *
	 */
	public static final String $if_itm_sub3 = "if_itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
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
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * IF transaction unit cd. ＩＦ取引単位ＣＤ.<p>
	 *
	 */
	public static final String $if_trd_unit_cd = "if_trd_unit_cd";
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
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
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
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * IF tax cd. ＩＦ税ＣＤ.<p>
	 *
	 */
	public static final String $if_tax_cd = "if_tax_cd";
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
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
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
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Payment received result payment received date 入金実績入金日.<p>
	 *
	 */
	public static final String $ar_rcv_dt = "ar_rcv_dt";
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public static final String $ar_sttl_typ2 = "ar_sttl_typ2";
	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public static final String $trd_cur_amt1 = "trd_cur_amt1";
	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public static final String $trd_cur_amt2 = "trd_cur_amt2";
	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt2 = "trd_cur_tax_amt2";
	/**
	 * Payment received result item name 1 入金実績品名１.<p>
	 *
	 */
	public static final String $ar_sttl_nm1 = "ar_sttl_nm1";
	/**
	 * Payment received result item name 2 入金実績品名２.<p>
	 *
	 */
	public static final String $ar_sttl_nm2 = "ar_sttl_nm2";
	/**
	 * Payment received result tax cd. 1 入金実績税ＣＤ１.<p>
	 *
	 */
	public static final String $ar_tax_cd1 = "ar_tax_cd1";
	/**
	 * Payment received result tax cd. 2 入金実績税ＣＤ２.<p>
	 *
	 */
	public static final String $ar_tax_cd2 = "ar_tax_cd2";
	/**
	 * Payment received result tax name 1 入金実績税名１.<p>
	 *
	 */
	public static final String $ar_tax_nm1 = "ar_tax_nm1";
	/**
	 * Payment received result tax name 2 入金実績税名２.<p>
	 *
	 */
	public static final String $ar_tax_nm2 = "ar_tax_nm2";
	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public static final String $ar_tax_rate1 = "ar_tax_rate1";
	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public static final String $ar_tax_rate2 = "ar_tax_rate2";
	/**
	 * Tax inclusive flg. 1 内税ＦＬＧ１.<p>
	 *
	 */
	public static final String $inc_tax_flg1 = "inc_tax_flg1";
	/**
	 * Tax inclusive flg. 2 内税ＦＬＧ２.<p>
	 *
	 */
	public static final String $inc_tax_flg2 = "inc_tax_flg2";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public static final String $tax_sls_amt = "tax_sls_amt";
	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public static final String $tax_tax_amt = "tax_tax_amt";
	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public static final String $bfw_bal_disp_flg = "bfw_bal_disp_flg";
	/**
	 * Billing at each sales flg. 売上都度請求ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_each_sls_flg = "bill_each_sls_flg";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public static final String $bill_rev = "bill_rev";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public static final String $ship_tm = "ship_tm";
	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * NULL character IF flg. ＮＵＬＬ文字ＩＦＦＬＧ.<p>
	 *
	 */
	public static final String $null_val_if_flg = "null_val_if_flg";
	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg1 = "bill_tax_disp_flg1";
	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg2 = "bill_tax_disp_flg2";


	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_dpt_META = createCommonMeta($bill_dpt, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_cntry_cd_META = createCommonMeta($if_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_bcst_cd_META = createCommonMeta($if_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bcst_ein_META = createCommonMeta($bcst_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bcst_biz_co_no_META = createCommonMeta($bcst_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bcst_zip_cd_META = createCommonMeta($bcst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bcst_addr1_META = createCommonMeta($bcst_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bcst_addr2_META = createCommonMeta($bcst_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bcst_addr3_META = createCommonMeta($bcst_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bcst_addr4_META = createCommonMeta($bcst_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bcst_cntry_cd_META = createCommonMeta($bcst_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_bcst_cntry_cd_META = createCommonMeta($if_bcst_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta if_trd_cur_cd_META = createCommonMeta($if_trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt1_META = createCommonMeta($tax_rate_sls_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt1_META = createCommonMeta($tax_rate_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt1_META = createCommonMeta($tax_rate_base_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt2_META = createCommonMeta($tax_rate_sls_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt2_META = createCommonMeta($tax_rate_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt2_META = createCommonMeta($tax_rate_base_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt3_META = createCommonMeta($tax_rate_sls_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt3_META = createCommonMeta($tax_rate_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt3_META = createCommonMeta($tax_rate_base_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate4_META = createCommonMeta($tax_rate4, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt4_META = createCommonMeta($tax_rate_sls_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt4_META = createCommonMeta($tax_rate_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt4_META = createCommonMeta($tax_rate_base_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate5_META = createCommonMeta($tax_rate5, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt5_META = createCommonMeta($tax_rate_sls_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt5_META = createCommonMeta($tax_rate_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt5_META = createCommonMeta($tax_rate_base_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate6_META = createCommonMeta($tax_rate6, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt6_META = createCommonMeta($tax_rate_sls_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt6_META = createCommonMeta($tax_rate_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt6_META = createCommonMeta($tax_rate_base_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate7_META = createCommonMeta($tax_rate7, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt7_META = createCommonMeta($tax_rate_sls_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt7_META = createCommonMeta($tax_rate_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt7_META = createCommonMeta($tax_rate_base_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate8_META = createCommonMeta($tax_rate8, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt8_META = createCommonMeta($tax_rate_sls_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt8_META = createCommonMeta($tax_rate_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt8_META = createCommonMeta($tax_rate_base_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate9_META = createCommonMeta($tax_rate9, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt9_META = createCommonMeta($tax_rate_sls_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt9_META = createCommonMeta($tax_rate_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt9_META = createCommonMeta($tax_rate_base_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate10_META = createCommonMeta($tax_rate10, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt10_META = createCommonMeta($tax_rate_sls_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt10_META = createCommonMeta($tax_rate_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt10_META = createCommonMeta($tax_rate_base_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_bal_META = createCommonMeta($adv_amt_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_META = createCommonMeta($adv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_amt_META = createCommonMeta($adv_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_tax_amt_META = createCommonMeta($adv_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_schd_dt1_META = createCommonMeta($rcv_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt1_META = createCommonMeta($rcv_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd1_META = createCommonMeta($rcv_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd1_META = createCommonMeta($if_rcv_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm1_META = createCommonMeta($rcv_mtd_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt2_META = createCommonMeta($rcv_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt2_META = createCommonMeta($rcv_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd2_META = createCommonMeta($rcv_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd2_META = createCommonMeta($if_rcv_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm2_META = createCommonMeta($rcv_mtd_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt3_META = createCommonMeta($rcv_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt3_META = createCommonMeta($rcv_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd3_META = createCommonMeta($rcv_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd3_META = createCommonMeta($if_rcv_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm3_META = createCommonMeta($rcv_mtd_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt4_META = createCommonMeta($rcv_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt4_META = createCommonMeta($rcv_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd4_META = createCommonMeta($rcv_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd4_META = createCommonMeta($if_rcv_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm4_META = createCommonMeta($rcv_mtd_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt5_META = createCommonMeta($rcv_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt5_META = createCommonMeta($rcv_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd5_META = createCommonMeta($rcv_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd5_META = createCommonMeta($if_rcv_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm5_META = createCommonMeta($rcv_mtd_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt6_META = createCommonMeta($rcv_schd_dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt6_META = createCommonMeta($rcv_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd6_META = createCommonMeta($rcv_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd6_META = createCommonMeta($if_rcv_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm6_META = createCommonMeta($rcv_mtd_nm6, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt7_META = createCommonMeta($rcv_schd_dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt7_META = createCommonMeta($rcv_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd7_META = createCommonMeta($rcv_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd7_META = createCommonMeta($if_rcv_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm7_META = createCommonMeta($rcv_mtd_nm7, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt8_META = createCommonMeta($rcv_schd_dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt8_META = createCommonMeta($rcv_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd8_META = createCommonMeta($rcv_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd8_META = createCommonMeta($if_rcv_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm8_META = createCommonMeta($rcv_mtd_nm8, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt9_META = createCommonMeta($rcv_schd_dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt9_META = createCommonMeta($rcv_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd9_META = createCommonMeta($rcv_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd9_META = createCommonMeta($if_rcv_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm9_META = createCommonMeta($rcv_mtd_nm9, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt10_META = createCommonMeta($rcv_schd_dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt10_META = createCommonMeta($rcv_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd10_META = createCommonMeta($rcv_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd10_META = createCommonMeta($if_rcv_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm10_META = createCommonMeta($rcv_mtd_nm10, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta if_bank_ac_cd_META = createCommonMeta($if_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_ac_holder_sub_META = createCommonMeta($bank_ac_holder_sub, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta if_trd_cd_META = createCommonMeta($if_trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_trd_unit_cd_META = createCommonMeta($if_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta if_tax_cd_META = createCommonMeta($if_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ar_rcv_dt_META = createCommonMeta($ar_rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_typ2_META = createCommonMeta($ar_sttl_typ2, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta trd_cur_amt1_META = createCommonMeta($trd_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt2_META = createCommonMeta($trd_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt2_META = createCommonMeta($trd_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_sttl_nm1_META = createCommonMeta($ar_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_nm2_META = createCommonMeta($ar_sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_tax_cd1_META = createCommonMeta($ar_tax_cd1, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ar_tax_cd2_META = createCommonMeta($ar_tax_cd2, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ar_tax_nm1_META = createCommonMeta($ar_tax_nm1, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta ar_tax_nm2_META = createCommonMeta($ar_tax_nm2, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta ar_tax_rate1_META = createCommonMeta($ar_tax_rate1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_tax_rate2_META = createCommonMeta($ar_tax_rate2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_flg1_META = createCommonMeta($inc_tax_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_tax_flg2_META = createCommonMeta($inc_tax_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta tax_sls_amt_META = createCommonMeta($tax_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_tax_amt_META = createCommonMeta($tax_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_bal_disp_flg_META = createCommonMeta($bfw_bal_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_each_sls_flg_META = createCommonMeta($bill_each_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_rev_META = createCommonMeta($bill_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ship_tm_META = createCommonMeta($ship_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta null_val_if_flg_META = createCommonMeta($null_val_if_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_disp_flg1_META = createCommonMeta($bill_tax_disp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_disp_flg2_META = createCommonMeta($bill_tax_disp_flg2, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Bill_Send01_HdrDtlBaseR> constMetas = new ConstMetaList<Bill_Send01_HdrDtlBaseR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_sys_cd_META,
			bill_mng_no_META,
			bill_cl_dt_META,
			bill_dt_META,
			bill_no_META,
			bill_d_no_META,
			pre_bill_no_META,
			pre_bill_dt_META,
			bill_st_dt_META,
			bill_end_dt_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			if_co_cd_META,
			co_nm_META,
			ein_META,
			biz_co_no_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			bill_dpt_META,
			tel_META,
			cntry_cd_META,
			if_cntry_cd_META,
			bcst_cd_META,
			if_bcst_cd_META,
			bcst_nm_META,
			bill_bcst_nm_META,
			bcst_ein_META,
			bcst_biz_co_no_META,
			bcst_zip_cd_META,
			bcst_addr1_META,
			bcst_addr2_META,
			bcst_addr3_META,
			bcst_addr4_META,
			bill_bcst_dpt_META,
			bill_tel_META,
			bcst_cntry_cd_META,
			if_bcst_cntry_cd_META,
			trd_cur_cd_META,
			if_trd_cur_cd_META,
			bill_xrate_META,
			last_bill_amt_META,
			rcv_amt_META,
			sw_amt_META,
			setoff_amt_META,
			bfw_amt_META,
			sls_amt_META,
			dscnt_amt_META,
			ret_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			bill_amt_META,
			tax_rate1_META,
			tax_rate_sls_amt1_META,
			tax_rate_tax_amt1_META,
			tax_rate_base_tax_amt1_META,
			tax_rate2_META,
			tax_rate_sls_amt2_META,
			tax_rate_tax_amt2_META,
			tax_rate_base_tax_amt2_META,
			tax_rate3_META,
			tax_rate_sls_amt3_META,
			tax_rate_tax_amt3_META,
			tax_rate_base_tax_amt3_META,
			tax_rate4_META,
			tax_rate_sls_amt4_META,
			tax_rate_tax_amt4_META,
			tax_rate_base_tax_amt4_META,
			tax_rate5_META,
			tax_rate_sls_amt5_META,
			tax_rate_tax_amt5_META,
			tax_rate_base_tax_amt5_META,
			tax_rate6_META,
			tax_rate_sls_amt6_META,
			tax_rate_tax_amt6_META,
			tax_rate_base_tax_amt6_META,
			tax_rate7_META,
			tax_rate_sls_amt7_META,
			tax_rate_tax_amt7_META,
			tax_rate_base_tax_amt7_META,
			tax_rate8_META,
			tax_rate_sls_amt8_META,
			tax_rate_tax_amt8_META,
			tax_rate_base_tax_amt8_META,
			tax_rate9_META,
			tax_rate_sls_amt9_META,
			tax_rate_tax_amt9_META,
			tax_rate_base_tax_amt9_META,
			tax_rate10_META,
			tax_rate_sls_amt10_META,
			tax_rate_tax_amt10_META,
			tax_rate_base_tax_amt10_META,
			adv_amt_bal_META,
			adv_amt_META,
			adv_setoff_amt_META,
			adv_setoff_tax_amt_META,
			rcv_schd_dt1_META,
			rcv_schd_amt1_META,
			rcv_mtd_cd1_META,
			if_rcv_mtd_cd1_META,
			rcv_mtd_nm1_META,
			rcv_schd_dt2_META,
			rcv_schd_amt2_META,
			rcv_mtd_cd2_META,
			if_rcv_mtd_cd2_META,
			rcv_mtd_nm2_META,
			rcv_schd_dt3_META,
			rcv_schd_amt3_META,
			rcv_mtd_cd3_META,
			if_rcv_mtd_cd3_META,
			rcv_mtd_nm3_META,
			rcv_schd_dt4_META,
			rcv_schd_amt4_META,
			rcv_mtd_cd4_META,
			if_rcv_mtd_cd4_META,
			rcv_mtd_nm4_META,
			rcv_schd_dt5_META,
			rcv_schd_amt5_META,
			rcv_mtd_cd5_META,
			if_rcv_mtd_cd5_META,
			rcv_mtd_nm5_META,
			rcv_schd_dt6_META,
			rcv_schd_amt6_META,
			rcv_mtd_cd6_META,
			if_rcv_mtd_cd6_META,
			rcv_mtd_nm6_META,
			rcv_schd_dt7_META,
			rcv_schd_amt7_META,
			rcv_mtd_cd7_META,
			if_rcv_mtd_cd7_META,
			rcv_mtd_nm7_META,
			rcv_schd_dt8_META,
			rcv_schd_amt8_META,
			rcv_mtd_cd8_META,
			if_rcv_mtd_cd8_META,
			rcv_mtd_nm8_META,
			rcv_schd_dt9_META,
			rcv_schd_amt9_META,
			rcv_mtd_cd9_META,
			if_rcv_mtd_cd9_META,
			rcv_mtd_nm9_META,
			rcv_schd_dt10_META,
			rcv_schd_amt10_META,
			rcv_mtd_cd10_META,
			if_rcv_mtd_cd10_META,
			rcv_mtd_nm10_META,
			bank_ac_cd_META,
			if_bank_ac_cd_META,
			bank_ac_typ_META,
			bank_ac_no_META,
			bank_ac_holder_META,
			bank_ac_holder_sub_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			trd_cd_META,
			if_trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			slip_sts_typ_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			ship_dlv_slip_no_META,
			ship_dlv_slip_d_no_META,
			act_no_META,
			act_rev_META,
			act_d_no_META,
			cst_po_no_META,
			cst_po_d_no_META,
			ac_dt_META,
			dlv_dt_META,
			rcv_dt_META,
			bill_basis_dt_META,
			base_ac_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			trd_unit_cd_META,
			if_trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			tax_cd_META,
			if_tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			trd_d_rmrks_META,
			amt_dec_place_META,
			bill_cl_typ_META,
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META,
			dlv_slip_seq_META,
			ar_rcv_dt_META,
			rcv_act_no_META,
			ar_sttl_typ1_META,
			ar_sttl_typ2_META,
			trd_cur_amt1_META,
			trd_cur_amt2_META,
			trd_cur_tax_amt1_META,
			trd_cur_tax_amt2_META,
			ar_sttl_nm1_META,
			ar_sttl_nm2_META,
			ar_tax_cd1_META,
			ar_tax_cd2_META,
			ar_tax_nm1_META,
			ar_tax_nm2_META,
			ar_tax_rate1_META,
			ar_tax_rate2_META,
			inc_tax_flg1_META,
			inc_tax_flg2_META,
			ar_trd_grp_typ_META,
			tax_sls_amt_META,
			tax_tax_amt_META,
			bfw_bal_disp_flg_META,
			bill_each_sls_flg_META,
			base_cur_tax_amt_META,
			base_cur_tax_amt1_META,
			base_cur_tax_amt2_META,
			bill_rev_META,
			dlv_slip_rev_META,
			wg_cd_META,
			bill_dpt_cd_META,
			ship_tm_META,
			dscnt_itm_flg_META,
			null_val_if_flg_META,
			bill_tax_disp_flg1_META,
			bill_tax_disp_flg2_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Bill_Send01_HdrDtlBaseR_MC_A(ConstMetaList<? extends Bill_Send01_HdrDtlBaseR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Send01_HdrDtlBaseR clone() {
		return (Bill_Send01_HdrDtlBaseR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Send01_HdrDtlBaseR createInstance() {
		return (Bill_Send01_HdrDtlBaseR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bill_Send01_HdrDtlBaseR getValues(String... names) {
		return (Bill_Send01_HdrDtlBaseR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 0, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 0, $ext_sys_cd, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 1, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 1, $bill_mng_no, value);
	}


	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 2, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 2, $bill_cl_dt, value);
	}


	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 3, $bill_dt);
	}

	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 3, $bill_dt, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 4, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 4, $bill_no, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 5, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 5, $bill_d_no, value);
	}


	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 6, $pre_bill_no);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 6, $pre_bill_no, value);
	}


	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 7, $pre_bill_dt);
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 7, $pre_bill_dt, value);
	}


	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return getConstDate(offset + 8, $bill_st_dt);
	}

	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		setConstDate(offset + 8, $bill_st_dt, value);
	}


	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return getConstDate(offset + 9, $bill_end_dt);
	}

	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		setConstDate(offset + 9, $bill_end_dt, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 10, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 10, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 11, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 11, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 12, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 12, $wrk_nm, value);
	}


	/**
	 * IF company cd. ＩＦ会社ＣＤ.<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 13, $if_co_cd);
	}

	/**
	 * IF company cd. ＩＦ会社ＣＤ.<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 13, $if_co_cd, value);
	}


	/**
	 * Company name 会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 14, $co_nm);
	}

	/**
	 * Company name 会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 14, $co_nm, value);
	}


	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 15, $ein);
	}

	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 15, $ein, value);
	}


	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 16, $biz_co_no);
	}

	/**
	 * Business No. 事業者ＮＯ.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 16, $biz_co_no, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 17, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 17, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 18, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 18, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 19, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 19, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 20, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 20, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 21, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 21, $addr4, value);
	}


	/**
	 * Billing dept. 請求部門.<p>
	 *
	 */
	public String bill_dpt() {
		return getConstString(offset + 22, $bill_dpt);
	}

	/**
	 * Billing dept. 請求部門.<p>
	 *
	 */
	public void bill_dpt(String value) {
		setConstString(offset + 22, $bill_dpt, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 23, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 23, $tel, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 24, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 24, $cntry_cd, value);
	}


	/**
	 * IF country cd. ＩＦ国ＣＤ.<p>
	 *
	 */
	public String if_cntry_cd() {
		return getConstString(offset + 25, $if_cntry_cd);
	}

	/**
	 * IF country cd. ＩＦ国ＣＤ.<p>
	 *
	 */
	public void if_cntry_cd(String value) {
		setConstString(offset + 25, $if_cntry_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 26, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 26, $bcst_cd, value);
	}


	/**
	 * IF billing customer cd. ＩＦ請求先ＣＤ.<p>
	 *
	 */
	public String if_bcst_cd() {
		return getConstString(offset + 27, $if_bcst_cd);
	}

	/**
	 * IF billing customer cd. ＩＦ請求先ＣＤ.<p>
	 *
	 */
	public void if_bcst_cd(String value) {
		setConstString(offset + 27, $if_bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 28, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 28, $bcst_nm, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 29, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 29, $bill_bcst_nm, value);
	}


	/**
	 * Billing customer corporation number 請求先法人番号.<p>
	 *
	 */
	public String bcst_ein() {
		return getConstString(offset + 30, $bcst_ein);
	}

	/**
	 * Billing customer corporation number 請求先法人番号.<p>
	 *
	 */
	public void bcst_ein(String value) {
		setConstString(offset + 30, $bcst_ein, value);
	}


	/**
	 * Billing customer business No. 請求先事業者ＮＯ.<p>
	 *
	 */
	public String bcst_biz_co_no() {
		return getConstString(offset + 31, $bcst_biz_co_no);
	}

	/**
	 * Billing customer business No. 請求先事業者ＮＯ.<p>
	 *
	 */
	public void bcst_biz_co_no(String value) {
		setConstString(offset + 31, $bcst_biz_co_no, value);
	}


	/**
	 * Billing customer zip code 請求先郵便番号.<p>
	 *
	 */
	public String bcst_zip_cd() {
		return getConstString(offset + 32, $bcst_zip_cd);
	}

	/**
	 * Billing customer zip code 請求先郵便番号.<p>
	 *
	 */
	public void bcst_zip_cd(String value) {
		setConstString(offset + 32, $bcst_zip_cd, value);
	}


	/**
	 * Billing customer address 1 請求先住所１.<p>
	 *
	 */
	public String bcst_addr1() {
		return getConstString(offset + 33, $bcst_addr1);
	}

	/**
	 * Billing customer address 1 請求先住所１.<p>
	 *
	 */
	public void bcst_addr1(String value) {
		setConstString(offset + 33, $bcst_addr1, value);
	}


	/**
	 * Billing customer address 2 請求先住所２.<p>
	 *
	 */
	public String bcst_addr2() {
		return getConstString(offset + 34, $bcst_addr2);
	}

	/**
	 * Billing customer address 2 請求先住所２.<p>
	 *
	 */
	public void bcst_addr2(String value) {
		setConstString(offset + 34, $bcst_addr2, value);
	}


	/**
	 * Billing customer address 3 請求先住所３.<p>
	 *
	 */
	public String bcst_addr3() {
		return getConstString(offset + 35, $bcst_addr3);
	}

	/**
	 * Billing customer address 3 請求先住所３.<p>
	 *
	 */
	public void bcst_addr3(String value) {
		setConstString(offset + 35, $bcst_addr3, value);
	}


	/**
	 * Billing customer address 4 請求先住所４.<p>
	 *
	 */
	public String bcst_addr4() {
		return getConstString(offset + 36, $bcst_addr4);
	}

	/**
	 * Billing customer address 4 請求先住所４.<p>
	 *
	 */
	public void bcst_addr4(String value) {
		setConstString(offset + 36, $bcst_addr4, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 37, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 37, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 38, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 38, $bill_tel, value);
	}


	/**
	 * Billing customer country cd. 請求先国ＣＤ.<p>
	 *
	 */
	public String bcst_cntry_cd() {
		return getConstString(offset + 39, $bcst_cntry_cd);
	}

	/**
	 * Billing customer country cd. 請求先国ＣＤ.<p>
	 *
	 */
	public void bcst_cntry_cd(String value) {
		setConstString(offset + 39, $bcst_cntry_cd, value);
	}


	/**
	 * IF billing customer country cd. ＩＦ請求先国ＣＤ.<p>
	 *
	 */
	public String if_bcst_cntry_cd() {
		return getConstString(offset + 40, $if_bcst_cntry_cd);
	}

	/**
	 * IF billing customer country cd. ＩＦ請求先国ＣＤ.<p>
	 *
	 */
	public void if_bcst_cntry_cd(String value) {
		setConstString(offset + 40, $if_bcst_cntry_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 41, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 41, $trd_cur_cd, value);
	}


	/**
	 * IF transaction currency cd. ＩＦ取引通貨ＣＤ.<p>
	 *
	 */
	public String if_trd_cur_cd() {
		return getConstString(offset + 42, $if_trd_cur_cd);
	}

	/**
	 * IF transaction currency cd. ＩＦ取引通貨ＣＤ.<p>
	 *
	 */
	public void if_trd_cur_cd(String value) {
		setConstString(offset + 42, $if_trd_cur_cd, value);
	}


	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 43, $bill_xrate);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 43, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 43, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 43, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 43, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 43, $bill_xrate, value);
	}


	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 44, $last_bill_amt);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 44, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 44, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 44, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 44, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 44, $last_bill_amt, value);
	}


	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 45, $rcv_amt);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 45, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 45, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 45, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 45, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 45, $rcv_amt, value);
	}


	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 46, $sw_amt);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 46, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 46, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 46, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 46, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 46, $sw_amt, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 47, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}


	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 48, $bfw_amt);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 48, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 48, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 48, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 48, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 48, $bfw_amt, value);
	}


	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 49, $sls_amt);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 49, $sls_amt, value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 49, $sls_amt, value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 49, $sls_amt, value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 49, $sls_amt, value);
	}

	/**
	 * Current sales amount 今回売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 49, $sls_amt, value);
	}


	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 50, $dscnt_amt);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 50, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 50, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 50, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 50, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 50, $dscnt_amt, value);
	}


	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 51, $ret_amt);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}


	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 52, $tax_amt);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 52, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 52, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 52, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 52, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 52, $tax_amt, value);
	}


	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 53, $sw_to_amt);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 53, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 53, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 53, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 53, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 53, $sw_to_amt, value);
	}


	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 54, $bill_amt);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 54, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 54, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 54, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 54, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 54, $bill_amt, value);
	}


	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 55, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 55, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 55, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 55, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 55, $tax_rate1, value);
	}


	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 56, $tax_rate_sls_amt1);
	}

	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt1, value);
	}

	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt1, value);
	}

	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt1, value);
	}

	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt1, value);
	}

	/**
	 * Sales amount per tax rate 1 税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt1, value);
	}


	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 57, $tax_rate_tax_amt1);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt1, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 58, $tax_rate_base_tax_amt1);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt1, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 59, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 59, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 59, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 59, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 59, $tax_rate2, value);
	}


	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 60, $tax_rate_sls_amt2);
	}

	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt2, value);
	}

	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt2, value);
	}

	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt2, value);
	}

	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt2, value);
	}

	/**
	 * Sales amount per tax rate 2 税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt2, value);
	}


	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 61, $tax_rate_tax_amt2);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt2, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 62, $tax_rate_base_tax_amt2);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt2, value);
	}


	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 63, $tax_rate3);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 63, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 63, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 63, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 63, $tax_rate3, value);
	}


	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 64, $tax_rate_sls_amt3);
	}

	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt3, value);
	}

	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt3, value);
	}

	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt3, value);
	}

	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt3, value);
	}

	/**
	 * Sales amount per tax rate 3 税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt3, value);
	}


	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 65, $tax_rate_tax_amt3);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt3, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 66, $tax_rate_base_tax_amt3);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt3, value);
	}


	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 67, $tax_rate4);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 67, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 67, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 67, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 67, $tax_rate4, value);
	}


	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 68, $tax_rate_sls_amt4);
	}

	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt4, value);
	}

	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt4, value);
	}

	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt4, value);
	}

	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt4, value);
	}

	/**
	 * Sales amount per tax rate 4 税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt4, value);
	}


	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 69, $tax_rate_tax_amt4);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt4, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 70, $tax_rate_base_tax_amt4);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt4, value);
	}


	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 71, $tax_rate5);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 71, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 71, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 71, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 71, $tax_rate5, value);
	}


	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 72, $tax_rate_sls_amt5);
	}

	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt5, value);
	}

	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt5, value);
	}

	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt5, value);
	}

	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt5, value);
	}

	/**
	 * Sales amount per tax rate 5 税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt5, value);
	}


	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 73, $tax_rate_tax_amt5);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt5, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 74, $tax_rate_base_tax_amt5);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt5, value);
	}


	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 75, $tax_rate6);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 75, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 75, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 75, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 75, $tax_rate6, value);
	}


	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 76, $tax_rate_sls_amt6);
	}

	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt6, value);
	}

	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt6, value);
	}

	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt6, value);
	}

	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt6, value);
	}

	/**
	 * Sales amount per tax rate 6 税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt6, value);
	}


	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 77, $tax_rate_tax_amt6);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt6, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 78, $tax_rate_base_tax_amt6);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt6, value);
	}


	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 79, $tax_rate7);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 79, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 79, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 79, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 79, $tax_rate7, value);
	}


	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 80, $tax_rate_sls_amt7);
	}

	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt7, value);
	}

	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt7, value);
	}

	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt7, value);
	}

	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt7, value);
	}

	/**
	 * Sales amount per tax rate 7 税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt7, value);
	}


	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 81, $tax_rate_tax_amt7);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt7, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 82, $tax_rate_base_tax_amt7);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt7, value);
	}


	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 83, $tax_rate8);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 83, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 83, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 83, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 83, $tax_rate8, value);
	}


	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 84, $tax_rate_sls_amt8);
	}

	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt8, value);
	}

	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt8, value);
	}

	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt8, value);
	}

	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt8, value);
	}

	/**
	 * Sales amount per tax rate 8 税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt8, value);
	}


	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 85, $tax_rate_tax_amt8);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt8, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 86, $tax_rate_base_tax_amt8);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt8, value);
	}


	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 87, $tax_rate9);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 87, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 87, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 87, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 87, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 87, $tax_rate9, value);
	}


	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 88, $tax_rate_sls_amt9);
	}

	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 88, $tax_rate_sls_amt9, value);
	}

	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 88, $tax_rate_sls_amt9, value);
	}

	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 88, $tax_rate_sls_amt9, value);
	}

	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 88, $tax_rate_sls_amt9, value);
	}

	/**
	 * Sales amount per tax rate 9 税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 88, $tax_rate_sls_amt9, value);
	}


	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 89, $tax_rate_tax_amt9);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt9, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 90, $tax_rate_base_tax_amt9);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 90, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 90, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 90, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 90, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 90, $tax_rate_base_tax_amt9, value);
	}


	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 91, $tax_rate10);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 91, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 91, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 91, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 91, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 91, $tax_rate10, value);
	}


	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 92, $tax_rate_sls_amt10);
	}

	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 92, $tax_rate_sls_amt10, value);
	}

	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 92, $tax_rate_sls_amt10, value);
	}

	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 92, $tax_rate_sls_amt10, value);
	}

	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 92, $tax_rate_sls_amt10, value);
	}

	/**
	 * Sales amount per tax rate 10 税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 92, $tax_rate_sls_amt10, value);
	}


	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 93, $tax_rate_tax_amt10);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt10, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 94, $tax_rate_base_tax_amt10);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 94, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 94, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 94, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 94, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 94, $tax_rate_base_tax_amt10, value);
	}


	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 95, $adv_amt_bal);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 95, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 95, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 95, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 95, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 95, $adv_amt_bal, value);
	}


	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 96, $adv_amt);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 96, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 96, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 96, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 96, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 96, $adv_amt, value);
	}


	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 97, $adv_setoff_amt);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 97, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 97, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 97, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 97, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 97, $adv_setoff_amt, value);
	}


	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 98, $adv_setoff_tax_amt);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 98, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 98, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 98, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 98, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 98, $adv_setoff_tax_amt, value);
	}


	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public MCDate rcv_schd_dt1() {
		return getConstDate(offset + 99, $rcv_schd_dt1);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_schd_dt1(MCDate value) {
		setConstDate(offset + 99, $rcv_schd_dt1, value);
	}


	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public MCNumber rcv_schd_amt1() {
		return getConstNumber(offset + 100, $rcv_schd_amt1);
	}

	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(MCNumber value) {
		setConstNumber(offset + 100, $rcv_schd_amt1, value);
	}

	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(int value) {
		setConstNumber(offset + 100, $rcv_schd_amt1, value);
	}

	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(long value) {
		setConstNumber(offset + 100, $rcv_schd_amt1, value);
	}

	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(float value) {
		setConstNumber(offset + 100, $rcv_schd_amt1, value);
	}

	/**
	 * Scheduled payment receipt amount 1 入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(double value) {
		setConstNumber(offset + 100, $rcv_schd_amt1, value);
	}


	/**
	 * Payment receipt method cd. 1 入金方法ＣＤ１.<p>
	 *
	 */
	public String rcv_mtd_cd1() {
		return getConstString(offset + 101, $rcv_mtd_cd1);
	}

	/**
	 * Payment receipt method cd. 1 入金方法ＣＤ１.<p>
	 *
	 */
	public void rcv_mtd_cd1(String value) {
		setConstString(offset + 101, $rcv_mtd_cd1, value);
	}


	/**
	 * IF payment receipt method cd. 1 ＩＦ入金方法ＣＤ１.<p>
	 *
	 */
	public String if_rcv_mtd_cd1() {
		return getConstString(offset + 102, $if_rcv_mtd_cd1);
	}

	/**
	 * IF payment receipt method cd. 1 ＩＦ入金方法ＣＤ１.<p>
	 *
	 */
	public void if_rcv_mtd_cd1(String value) {
		setConstString(offset + 102, $if_rcv_mtd_cd1, value);
	}


	/**
	 * Payment receipt method name 1 入金方法名１.<p>
	 *
	 */
	public String rcv_mtd_nm1() {
		return getConstString(offset + 103, $rcv_mtd_nm1);
	}

	/**
	 * Payment receipt method name 1 入金方法名１.<p>
	 *
	 */
	public void rcv_mtd_nm1(String value) {
		setConstString(offset + 103, $rcv_mtd_nm1, value);
	}


	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public MCDate rcv_schd_dt2() {
		return getConstDate(offset + 104, $rcv_schd_dt2);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_schd_dt2(MCDate value) {
		setConstDate(offset + 104, $rcv_schd_dt2, value);
	}


	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public MCNumber rcv_schd_amt2() {
		return getConstNumber(offset + 105, $rcv_schd_amt2);
	}

	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(MCNumber value) {
		setConstNumber(offset + 105, $rcv_schd_amt2, value);
	}

	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(int value) {
		setConstNumber(offset + 105, $rcv_schd_amt2, value);
	}

	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(long value) {
		setConstNumber(offset + 105, $rcv_schd_amt2, value);
	}

	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(float value) {
		setConstNumber(offset + 105, $rcv_schd_amt2, value);
	}

	/**
	 * Scheduled payment receipt amount 2 入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(double value) {
		setConstNumber(offset + 105, $rcv_schd_amt2, value);
	}


	/**
	 * Payment receipt method cd. 2 入金方法ＣＤ２.<p>
	 *
	 */
	public String rcv_mtd_cd2() {
		return getConstString(offset + 106, $rcv_mtd_cd2);
	}

	/**
	 * Payment receipt method cd. 2 入金方法ＣＤ２.<p>
	 *
	 */
	public void rcv_mtd_cd2(String value) {
		setConstString(offset + 106, $rcv_mtd_cd2, value);
	}


	/**
	 * IF payment receipt method cd. 2 ＩＦ入金方法ＣＤ２.<p>
	 *
	 */
	public String if_rcv_mtd_cd2() {
		return getConstString(offset + 107, $if_rcv_mtd_cd2);
	}

	/**
	 * IF payment receipt method cd. 2 ＩＦ入金方法ＣＤ２.<p>
	 *
	 */
	public void if_rcv_mtd_cd2(String value) {
		setConstString(offset + 107, $if_rcv_mtd_cd2, value);
	}


	/**
	 * Payment receipt method name 2 入金方法名2.<p>
	 *
	 */
	public String rcv_mtd_nm2() {
		return getConstString(offset + 108, $rcv_mtd_nm2);
	}

	/**
	 * Payment receipt method name 2 入金方法名2.<p>
	 *
	 */
	public void rcv_mtd_nm2(String value) {
		setConstString(offset + 108, $rcv_mtd_nm2, value);
	}


	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public MCDate rcv_schd_dt3() {
		return getConstDate(offset + 109, $rcv_schd_dt3);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_schd_dt3(MCDate value) {
		setConstDate(offset + 109, $rcv_schd_dt3, value);
	}


	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public MCNumber rcv_schd_amt3() {
		return getConstNumber(offset + 110, $rcv_schd_amt3);
	}

	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(MCNumber value) {
		setConstNumber(offset + 110, $rcv_schd_amt3, value);
	}

	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(int value) {
		setConstNumber(offset + 110, $rcv_schd_amt3, value);
	}

	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(long value) {
		setConstNumber(offset + 110, $rcv_schd_amt3, value);
	}

	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(float value) {
		setConstNumber(offset + 110, $rcv_schd_amt3, value);
	}

	/**
	 * Scheduled payment receipt amount 3 入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(double value) {
		setConstNumber(offset + 110, $rcv_schd_amt3, value);
	}


	/**
	 * Payment receipt method cd. 3 入金方法ＣＤ３.<p>
	 *
	 */
	public String rcv_mtd_cd3() {
		return getConstString(offset + 111, $rcv_mtd_cd3);
	}

	/**
	 * Payment receipt method cd. 3 入金方法ＣＤ３.<p>
	 *
	 */
	public void rcv_mtd_cd3(String value) {
		setConstString(offset + 111, $rcv_mtd_cd3, value);
	}


	/**
	 * IF payment receipt method cd. 3 ＩＦ入金方法ＣＤ３.<p>
	 *
	 */
	public String if_rcv_mtd_cd3() {
		return getConstString(offset + 112, $if_rcv_mtd_cd3);
	}

	/**
	 * IF payment receipt method cd. 3 ＩＦ入金方法ＣＤ３.<p>
	 *
	 */
	public void if_rcv_mtd_cd3(String value) {
		setConstString(offset + 112, $if_rcv_mtd_cd3, value);
	}


	/**
	 * Payment receipt method name 3 入金方法名3.<p>
	 *
	 */
	public String rcv_mtd_nm3() {
		return getConstString(offset + 113, $rcv_mtd_nm3);
	}

	/**
	 * Payment receipt method name 3 入金方法名3.<p>
	 *
	 */
	public void rcv_mtd_nm3(String value) {
		setConstString(offset + 113, $rcv_mtd_nm3, value);
	}


	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public MCDate rcv_schd_dt4() {
		return getConstDate(offset + 114, $rcv_schd_dt4);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_schd_dt4(MCDate value) {
		setConstDate(offset + 114, $rcv_schd_dt4, value);
	}


	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public MCNumber rcv_schd_amt4() {
		return getConstNumber(offset + 115, $rcv_schd_amt4);
	}

	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(MCNumber value) {
		setConstNumber(offset + 115, $rcv_schd_amt4, value);
	}

	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(int value) {
		setConstNumber(offset + 115, $rcv_schd_amt4, value);
	}

	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(long value) {
		setConstNumber(offset + 115, $rcv_schd_amt4, value);
	}

	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(float value) {
		setConstNumber(offset + 115, $rcv_schd_amt4, value);
	}

	/**
	 * Scheduled payment receipt amount 4 入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(double value) {
		setConstNumber(offset + 115, $rcv_schd_amt4, value);
	}


	/**
	 * Payment receipt method cd. 4 入金方法ＣＤ４.<p>
	 *
	 */
	public String rcv_mtd_cd4() {
		return getConstString(offset + 116, $rcv_mtd_cd4);
	}

	/**
	 * Payment receipt method cd. 4 入金方法ＣＤ４.<p>
	 *
	 */
	public void rcv_mtd_cd4(String value) {
		setConstString(offset + 116, $rcv_mtd_cd4, value);
	}


	/**
	 * IF payment receipt method cd. 4 ＩＦ入金方法ＣＤ４.<p>
	 *
	 */
	public String if_rcv_mtd_cd4() {
		return getConstString(offset + 117, $if_rcv_mtd_cd4);
	}

	/**
	 * IF payment receipt method cd. 4 ＩＦ入金方法ＣＤ４.<p>
	 *
	 */
	public void if_rcv_mtd_cd4(String value) {
		setConstString(offset + 117, $if_rcv_mtd_cd4, value);
	}


	/**
	 * Payment receipt method name 4 入金方法名4.<p>
	 *
	 */
	public String rcv_mtd_nm4() {
		return getConstString(offset + 118, $rcv_mtd_nm4);
	}

	/**
	 * Payment receipt method name 4 入金方法名4.<p>
	 *
	 */
	public void rcv_mtd_nm4(String value) {
		setConstString(offset + 118, $rcv_mtd_nm4, value);
	}


	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public MCDate rcv_schd_dt5() {
		return getConstDate(offset + 119, $rcv_schd_dt5);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_schd_dt5(MCDate value) {
		setConstDate(offset + 119, $rcv_schd_dt5, value);
	}


	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public MCNumber rcv_schd_amt5() {
		return getConstNumber(offset + 120, $rcv_schd_amt5);
	}

	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(MCNumber value) {
		setConstNumber(offset + 120, $rcv_schd_amt5, value);
	}

	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(int value) {
		setConstNumber(offset + 120, $rcv_schd_amt5, value);
	}

	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(long value) {
		setConstNumber(offset + 120, $rcv_schd_amt5, value);
	}

	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(float value) {
		setConstNumber(offset + 120, $rcv_schd_amt5, value);
	}

	/**
	 * Scheduled payment receipt amount 5 入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(double value) {
		setConstNumber(offset + 120, $rcv_schd_amt5, value);
	}


	/**
	 * Payment receipt method cd. 5 入金方法ＣＤ５.<p>
	 *
	 */
	public String rcv_mtd_cd5() {
		return getConstString(offset + 121, $rcv_mtd_cd5);
	}

	/**
	 * Payment receipt method cd. 5 入金方法ＣＤ５.<p>
	 *
	 */
	public void rcv_mtd_cd5(String value) {
		setConstString(offset + 121, $rcv_mtd_cd5, value);
	}


	/**
	 * IF payment receipt method cd. 5 ＩＦ入金方法ＣＤ５.<p>
	 *
	 */
	public String if_rcv_mtd_cd5() {
		return getConstString(offset + 122, $if_rcv_mtd_cd5);
	}

	/**
	 * IF payment receipt method cd. 5 ＩＦ入金方法ＣＤ５.<p>
	 *
	 */
	public void if_rcv_mtd_cd5(String value) {
		setConstString(offset + 122, $if_rcv_mtd_cd5, value);
	}


	/**
	 * Payment receipt method name 5 入金方法名5.<p>
	 *
	 */
	public String rcv_mtd_nm5() {
		return getConstString(offset + 123, $rcv_mtd_nm5);
	}

	/**
	 * Payment receipt method name 5 入金方法名5.<p>
	 *
	 */
	public void rcv_mtd_nm5(String value) {
		setConstString(offset + 123, $rcv_mtd_nm5, value);
	}


	/**
	 * Scheduled payment receipt date 6 入金予定日６.<p>
	 *
	 */
	public MCDate rcv_schd_dt6() {
		return getConstDate(offset + 124, $rcv_schd_dt6);
	}

	/**
	 * Scheduled payment receipt date 6 入金予定日６.<p>
	 *
	 */
	public void rcv_schd_dt6(MCDate value) {
		setConstDate(offset + 124, $rcv_schd_dt6, value);
	}


	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public MCNumber rcv_schd_amt6() {
		return getConstNumber(offset + 125, $rcv_schd_amt6);
	}

	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(MCNumber value) {
		setConstNumber(offset + 125, $rcv_schd_amt6, value);
	}

	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(int value) {
		setConstNumber(offset + 125, $rcv_schd_amt6, value);
	}

	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(long value) {
		setConstNumber(offset + 125, $rcv_schd_amt6, value);
	}

	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(float value) {
		setConstNumber(offset + 125, $rcv_schd_amt6, value);
	}

	/**
	 * Scheduled payment receipt amount 6 入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(double value) {
		setConstNumber(offset + 125, $rcv_schd_amt6, value);
	}


	/**
	 * Payment receipt method cd. 6 入金方法ＣＤ６.<p>
	 *
	 */
	public String rcv_mtd_cd6() {
		return getConstString(offset + 126, $rcv_mtd_cd6);
	}

	/**
	 * Payment receipt method cd. 6 入金方法ＣＤ６.<p>
	 *
	 */
	public void rcv_mtd_cd6(String value) {
		setConstString(offset + 126, $rcv_mtd_cd6, value);
	}


	/**
	 * IF payment receipt method cd. 6 ＩＦ入金方法ＣＤ６.<p>
	 *
	 */
	public String if_rcv_mtd_cd6() {
		return getConstString(offset + 127, $if_rcv_mtd_cd6);
	}

	/**
	 * IF payment receipt method cd. 6 ＩＦ入金方法ＣＤ６.<p>
	 *
	 */
	public void if_rcv_mtd_cd6(String value) {
		setConstString(offset + 127, $if_rcv_mtd_cd6, value);
	}


	/**
	 * Payment receipt method name 6 入金方法名6.<p>
	 *
	 */
	public String rcv_mtd_nm6() {
		return getConstString(offset + 128, $rcv_mtd_nm6);
	}

	/**
	 * Payment receipt method name 6 入金方法名6.<p>
	 *
	 */
	public void rcv_mtd_nm6(String value) {
		setConstString(offset + 128, $rcv_mtd_nm6, value);
	}


	/**
	 * Scheduled payment receipt date 7 入金予定日７.<p>
	 *
	 */
	public MCDate rcv_schd_dt7() {
		return getConstDate(offset + 129, $rcv_schd_dt7);
	}

	/**
	 * Scheduled payment receipt date 7 入金予定日７.<p>
	 *
	 */
	public void rcv_schd_dt7(MCDate value) {
		setConstDate(offset + 129, $rcv_schd_dt7, value);
	}


	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public MCNumber rcv_schd_amt7() {
		return getConstNumber(offset + 130, $rcv_schd_amt7);
	}

	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(MCNumber value) {
		setConstNumber(offset + 130, $rcv_schd_amt7, value);
	}

	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(int value) {
		setConstNumber(offset + 130, $rcv_schd_amt7, value);
	}

	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(long value) {
		setConstNumber(offset + 130, $rcv_schd_amt7, value);
	}

	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(float value) {
		setConstNumber(offset + 130, $rcv_schd_amt7, value);
	}

	/**
	 * Scheduled payment receipt amount 7 入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(double value) {
		setConstNumber(offset + 130, $rcv_schd_amt7, value);
	}


	/**
	 * Payment receipt method cd. 7 入金方法ＣＤ７.<p>
	 *
	 */
	public String rcv_mtd_cd7() {
		return getConstString(offset + 131, $rcv_mtd_cd7);
	}

	/**
	 * Payment receipt method cd. 7 入金方法ＣＤ７.<p>
	 *
	 */
	public void rcv_mtd_cd7(String value) {
		setConstString(offset + 131, $rcv_mtd_cd7, value);
	}


	/**
	 * IF payment receipt method cd. 7 ＩＦ入金方法ＣＤ７.<p>
	 *
	 */
	public String if_rcv_mtd_cd7() {
		return getConstString(offset + 132, $if_rcv_mtd_cd7);
	}

	/**
	 * IF payment receipt method cd. 7 ＩＦ入金方法ＣＤ７.<p>
	 *
	 */
	public void if_rcv_mtd_cd7(String value) {
		setConstString(offset + 132, $if_rcv_mtd_cd7, value);
	}


	/**
	 * Payment receipt method name 7 入金方法名7.<p>
	 *
	 */
	public String rcv_mtd_nm7() {
		return getConstString(offset + 133, $rcv_mtd_nm7);
	}

	/**
	 * Payment receipt method name 7 入金方法名7.<p>
	 *
	 */
	public void rcv_mtd_nm7(String value) {
		setConstString(offset + 133, $rcv_mtd_nm7, value);
	}


	/**
	 * Scheduled payment receipt date 8 入金予定日８.<p>
	 *
	 */
	public MCDate rcv_schd_dt8() {
		return getConstDate(offset + 134, $rcv_schd_dt8);
	}

	/**
	 * Scheduled payment receipt date 8 入金予定日８.<p>
	 *
	 */
	public void rcv_schd_dt8(MCDate value) {
		setConstDate(offset + 134, $rcv_schd_dt8, value);
	}


	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public MCNumber rcv_schd_amt8() {
		return getConstNumber(offset + 135, $rcv_schd_amt8);
	}

	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(MCNumber value) {
		setConstNumber(offset + 135, $rcv_schd_amt8, value);
	}

	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(int value) {
		setConstNumber(offset + 135, $rcv_schd_amt8, value);
	}

	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(long value) {
		setConstNumber(offset + 135, $rcv_schd_amt8, value);
	}

	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(float value) {
		setConstNumber(offset + 135, $rcv_schd_amt8, value);
	}

	/**
	 * Scheduled payment receipt amount 8 入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(double value) {
		setConstNumber(offset + 135, $rcv_schd_amt8, value);
	}


	/**
	 * Payment receipt method cd. 8 入金方法ＣＤ８.<p>
	 *
	 */
	public String rcv_mtd_cd8() {
		return getConstString(offset + 136, $rcv_mtd_cd8);
	}

	/**
	 * Payment receipt method cd. 8 入金方法ＣＤ８.<p>
	 *
	 */
	public void rcv_mtd_cd8(String value) {
		setConstString(offset + 136, $rcv_mtd_cd8, value);
	}


	/**
	 * IF payment receipt method cd. 8 ＩＦ入金方法ＣＤ８.<p>
	 *
	 */
	public String if_rcv_mtd_cd8() {
		return getConstString(offset + 137, $if_rcv_mtd_cd8);
	}

	/**
	 * IF payment receipt method cd. 8 ＩＦ入金方法ＣＤ８.<p>
	 *
	 */
	public void if_rcv_mtd_cd8(String value) {
		setConstString(offset + 137, $if_rcv_mtd_cd8, value);
	}


	/**
	 * Payment receipt method name 8 入金方法名8.<p>
	 *
	 */
	public String rcv_mtd_nm8() {
		return getConstString(offset + 138, $rcv_mtd_nm8);
	}

	/**
	 * Payment receipt method name 8 入金方法名8.<p>
	 *
	 */
	public void rcv_mtd_nm8(String value) {
		setConstString(offset + 138, $rcv_mtd_nm8, value);
	}


	/**
	 * Scheduled payment receipt date 9 入金予定日９.<p>
	 *
	 */
	public MCDate rcv_schd_dt9() {
		return getConstDate(offset + 139, $rcv_schd_dt9);
	}

	/**
	 * Scheduled payment receipt date 9 入金予定日９.<p>
	 *
	 */
	public void rcv_schd_dt9(MCDate value) {
		setConstDate(offset + 139, $rcv_schd_dt9, value);
	}


	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public MCNumber rcv_schd_amt9() {
		return getConstNumber(offset + 140, $rcv_schd_amt9);
	}

	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(MCNumber value) {
		setConstNumber(offset + 140, $rcv_schd_amt9, value);
	}

	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(int value) {
		setConstNumber(offset + 140, $rcv_schd_amt9, value);
	}

	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(long value) {
		setConstNumber(offset + 140, $rcv_schd_amt9, value);
	}

	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(float value) {
		setConstNumber(offset + 140, $rcv_schd_amt9, value);
	}

	/**
	 * Scheduled payment receipt amount 9 入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(double value) {
		setConstNumber(offset + 140, $rcv_schd_amt9, value);
	}


	/**
	 * Payment receipt method cd. 9 入金方法ＣＤ９.<p>
	 *
	 */
	public String rcv_mtd_cd9() {
		return getConstString(offset + 141, $rcv_mtd_cd9);
	}

	/**
	 * Payment receipt method cd. 9 入金方法ＣＤ９.<p>
	 *
	 */
	public void rcv_mtd_cd9(String value) {
		setConstString(offset + 141, $rcv_mtd_cd9, value);
	}


	/**
	 * IF payment receipt method cd. 9 ＩＦ入金方法ＣＤ９.<p>
	 *
	 */
	public String if_rcv_mtd_cd9() {
		return getConstString(offset + 142, $if_rcv_mtd_cd9);
	}

	/**
	 * IF payment receipt method cd. 9 ＩＦ入金方法ＣＤ９.<p>
	 *
	 */
	public void if_rcv_mtd_cd9(String value) {
		setConstString(offset + 142, $if_rcv_mtd_cd9, value);
	}


	/**
	 * Payment receipt method name 9 入金方法名9.<p>
	 *
	 */
	public String rcv_mtd_nm9() {
		return getConstString(offset + 143, $rcv_mtd_nm9);
	}

	/**
	 * Payment receipt method name 9 入金方法名9.<p>
	 *
	 */
	public void rcv_mtd_nm9(String value) {
		setConstString(offset + 143, $rcv_mtd_nm9, value);
	}


	/**
	 * Scheduled payment receipt date 10 入金予定日１０.<p>
	 *
	 */
	public MCDate rcv_schd_dt10() {
		return getConstDate(offset + 144, $rcv_schd_dt10);
	}

	/**
	 * Scheduled payment receipt date 10 入金予定日１０.<p>
	 *
	 */
	public void rcv_schd_dt10(MCDate value) {
		setConstDate(offset + 144, $rcv_schd_dt10, value);
	}


	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public MCNumber rcv_schd_amt10() {
		return getConstNumber(offset + 145, $rcv_schd_amt10);
	}

	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(MCNumber value) {
		setConstNumber(offset + 145, $rcv_schd_amt10, value);
	}

	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(int value) {
		setConstNumber(offset + 145, $rcv_schd_amt10, value);
	}

	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(long value) {
		setConstNumber(offset + 145, $rcv_schd_amt10, value);
	}

	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(float value) {
		setConstNumber(offset + 145, $rcv_schd_amt10, value);
	}

	/**
	 * Scheduled payment receipt amount 10 入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(double value) {
		setConstNumber(offset + 145, $rcv_schd_amt10, value);
	}


	/**
	 * Payment receipt method cd. 10 入金方法ＣＤ１０.<p>
	 *
	 */
	public String rcv_mtd_cd10() {
		return getConstString(offset + 146, $rcv_mtd_cd10);
	}

	/**
	 * Payment receipt method cd. 10 入金方法ＣＤ１０.<p>
	 *
	 */
	public void rcv_mtd_cd10(String value) {
		setConstString(offset + 146, $rcv_mtd_cd10, value);
	}


	/**
	 * IF payment receipt method cd. 10 ＩＦ入金方法ＣＤ１０.<p>
	 *
	 */
	public String if_rcv_mtd_cd10() {
		return getConstString(offset + 147, $if_rcv_mtd_cd10);
	}

	/**
	 * IF payment receipt method cd. 10 ＩＦ入金方法ＣＤ１０.<p>
	 *
	 */
	public void if_rcv_mtd_cd10(String value) {
		setConstString(offset + 147, $if_rcv_mtd_cd10, value);
	}


	/**
	 * Payment receipt method name 10 入金方法名１0.<p>
	 *
	 */
	public String rcv_mtd_nm10() {
		return getConstString(offset + 148, $rcv_mtd_nm10);
	}

	/**
	 * Payment receipt method name 10 入金方法名１0.<p>
	 *
	 */
	public void rcv_mtd_nm10(String value) {
		setConstString(offset + 148, $rcv_mtd_nm10, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 149, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 149, $bank_ac_cd, value);
	}


	/**
	 * IF bank account cd. ＩＦ口座ＣＤ.<p>
	 *
	 */
	public String if_bank_ac_cd() {
		return getConstString(offset + 150, $if_bank_ac_cd);
	}

	/**
	 * IF bank account cd. ＩＦ口座ＣＤ.<p>
	 *
	 */
	public void if_bank_ac_cd(String value) {
		setConstString(offset + 150, $if_bank_ac_cd, value);
	}


	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 151, $bank_ac_typ);
	}

	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 151, $bank_ac_typ, value);
	}


	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 152, $bank_ac_no);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 152, $bank_ac_no, value);
	}


	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 153, $bank_ac_holder);
	}

	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 153, $bank_ac_holder, value);
	}


	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return getConstString(offset + 154, $bank_ac_holder_sub);
	}

	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		setConstString(offset + 154, $bank_ac_holder_sub, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 155, $bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 155, $bank_cd, value);
	}


	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 156, $bank_nm);
	}

	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 156, $bank_nm, value);
	}


	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 157, $branch_cd);
	}

	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 157, $branch_cd, value);
	}


	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 158, $branch_nm);
	}

	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 158, $branch_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 159, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 159, $trd_cd, value);
	}


	/**
	 * IF transaction cd. ＩＦ取引ＣＤ.<p>
	 *
	 */
	public String if_trd_cd() {
		return getConstString(offset + 160, $if_trd_cd);
	}

	/**
	 * IF transaction cd. ＩＦ取引ＣＤ.<p>
	 *
	 */
	public void if_trd_cd(String value) {
		setConstString(offset + 160, $if_trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 161, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 161, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 162, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 162, $trd_ptn_typ, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 163, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 163, $slip_sts_typ, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 164, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 164, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 165, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 165, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 166, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 166, $ship_dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 167, $ship_dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 167, $ship_dlv_slip_d_no, value);
	}


	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 168, $act_no);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 168, $act_no, value);
	}


	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 169, $act_rev);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 169, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 169, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 169, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 169, $act_rev, value);
	}

	/**
	 * Header result rev. number ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 169, $act_rev, value);
	}


	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 170, $act_d_no);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 170, $act_d_no, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 171, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 171, $cst_po_no, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 172, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 172, $cst_po_d_no, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 173, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 173, $ac_dt, value);
	}


	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 174, $dlv_dt);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 174, $dlv_dt, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 175, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 175, $rcv_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 176, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 176, $bill_basis_dt, value);
	}


	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 177, $base_ac_dt);
	}

	/**
	 * Recording date (Base) 計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 177, $base_ac_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 178, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 178, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 179, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 179, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 180, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 180, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 181, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 181, $itm_sub3, value);
	}


	/**
	 * IF item cd. ＩＦ品目ＣＤ.<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 182, $if_itm_cd);
	}

	/**
	 * IF item cd. ＩＦ品目ＣＤ.<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 182, $if_itm_cd, value);
	}


	/**
	 * IF branch No. 1 ＩＦ枝番１.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 183, $if_itm_sub1);
	}

	/**
	 * IF branch No. 1 ＩＦ枝番１.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 183, $if_itm_sub1, value);
	}


	/**
	 * IF branch No. 2 ＩＦ枝番２.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 184, $if_itm_sub2);
	}

	/**
	 * IF branch No. 2 ＩＦ枝番２.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 184, $if_itm_sub2, value);
	}


	/**
	 * IF branch No. 3 ＩＦ枝番３.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 185, $if_itm_sub3);
	}

	/**
	 * IF branch No. 3 ＩＦ枝番３.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 185, $if_itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 186, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 186, $itm_nm, value);
	}


	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 187, $itm_alt_nm1);
	}

	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 187, $itm_alt_nm1, value);
	}


	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 188, $itm_alt_nm2);
	}

	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 188, $itm_alt_nm2, value);
	}


	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 189, $itm_alt_nm3);
	}

	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 189, $itm_alt_nm3, value);
	}


	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 190, $itm_alt_nm4);
	}

	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 190, $itm_alt_nm4, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 191, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 191, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 192, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 192, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 193, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 193, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 194, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 194, $sno4, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 195, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 195, $trd_unit_cd, value);
	}


	/**
	 * IF transaction unit cd. ＩＦ取引単位ＣＤ.<p>
	 *
	 */
	public String if_trd_unit_cd() {
		return getConstString(offset + 196, $if_trd_unit_cd);
	}

	/**
	 * IF transaction unit cd. ＩＦ取引単位ＣＤ.<p>
	 *
	 */
	public void if_trd_unit_cd(String value) {
		setConstString(offset + 196, $if_trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 197, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 197, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 198, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 198, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 198, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 198, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 198, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 198, $trd_unit_qty, value);
	}


	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 199, $interim_flg);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 199, $interim_flg, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 200, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 200, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 200, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 200, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 200, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 200, $trd_cur_upri, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 201, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 201, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 201, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 201, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 201, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 201, $trd_cur_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 202, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 202, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 202, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 202, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 202, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 202, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 203, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 203, $tax_cd, value);
	}


	/**
	 * IF tax cd. ＩＦ税ＣＤ.<p>
	 *
	 */
	public String if_tax_cd() {
		return getConstString(offset + 204, $if_tax_cd);
	}

	/**
	 * IF tax cd. ＩＦ税ＣＤ.<p>
	 *
	 */
	public void if_tax_cd(String value) {
		setConstString(offset + 204, $if_tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 205, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 205, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 206, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 206, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 206, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 206, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 206, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 206, $tax_rate, value);
	}


	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 207, $inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. 内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 207, $inc_tax_flg, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 208, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 208, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 208, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 208, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 208, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 208, $trd_cur_tax_amt, value);
	}


	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 209, $trd_d_rmrks);
	}

	/**
	 * Details remarks 明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 209, $trd_d_rmrks, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 210, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 210, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 210, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 210, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 210, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 210, $amt_dec_place, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 211, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 211, $bill_cl_typ, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 212, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 212, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 212, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 212, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 212, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 212, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 213, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 213, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 213, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 213, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 213, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 213, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 214, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 214, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 214, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 214, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 214, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 214, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 215, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 215, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 215, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 215, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 215, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 215, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 216, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 216, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 216, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 216, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 216, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 216, $bill_cl_day5, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 217, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 217, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 217, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 217, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 217, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 217, $dlv_slip_seq, value);
	}


	/**
	 * Payment received result payment received date 入金実績入金日.<p>
	 *
	 */
	public MCDate ar_rcv_dt() {
		return getConstDate(offset + 218, $ar_rcv_dt);
	}

	/**
	 * Payment received result payment received date 入金実績入金日.<p>
	 *
	 */
	public void ar_rcv_dt(MCDate value) {
		setConstDate(offset + 218, $ar_rcv_dt, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 219, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 219, $rcv_act_no, value);
	}


	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 220, $ar_sttl_typ1);
	}

	/**
	 * AR settlement type 1 債権決済区分１.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 220, $ar_sttl_typ1, value);
	}


	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public String ar_sttl_typ2() {
		return getConstString(offset + 221, $ar_sttl_typ2);
	}

	/**
	 * AR settlement type 2 債権決済区分２.<p>
	 *
	 */
	public void ar_sttl_typ2(String value) {
		setConstString(offset + 221, $ar_sttl_typ2, value);
	}


	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public MCNumber trd_cur_amt1() {
		return getConstNumber(offset + 222, $trd_cur_amt1);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(MCNumber value) {
		setConstNumber(offset + 222, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(int value) {
		setConstNumber(offset + 222, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(long value) {
		setConstNumber(offset + 222, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(float value) {
		setConstNumber(offset + 222, $trd_cur_amt1, value);
	}

	/**
	 * Amount 1 (Transaction currency) 取引通貨金額１.<p>
	 *
	 */
	public void trd_cur_amt1(double value) {
		setConstNumber(offset + 222, $trd_cur_amt1, value);
	}


	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public MCNumber trd_cur_amt2() {
		return getConstNumber(offset + 223, $trd_cur_amt2);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(MCNumber value) {
		setConstNumber(offset + 223, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(int value) {
		setConstNumber(offset + 223, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(long value) {
		setConstNumber(offset + 223, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(float value) {
		setConstNumber(offset + 223, $trd_cur_amt2, value);
	}

	/**
	 * Amount 2 (Transaction currency) 取引通貨金額２.<p>
	 *
	 */
	public void trd_cur_amt2(double value) {
		setConstNumber(offset + 223, $trd_cur_amt2, value);
	}


	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 224, $trd_cur_tax_amt1);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 224, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 224, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 224, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 224, $trd_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Transaction currency) 取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 224, $trd_cur_tax_amt1, value);
	}


	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt2() {
		return getConstNumber(offset + 225, $trd_cur_tax_amt2);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 225, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(int value) {
		setConstNumber(offset + 225, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(long value) {
		setConstNumber(offset + 225, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(float value) {
		setConstNumber(offset + 225, $trd_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Transaction currency) 取引通貨内税額２.<p>
	 *
	 */
	public void trd_cur_tax_amt2(double value) {
		setConstNumber(offset + 225, $trd_cur_tax_amt2, value);
	}


	/**
	 * Payment received result item name 1 入金実績品名１.<p>
	 *
	 */
	public String ar_sttl_nm1() {
		return getConstString(offset + 226, $ar_sttl_nm1);
	}

	/**
	 * Payment received result item name 1 入金実績品名１.<p>
	 *
	 */
	public void ar_sttl_nm1(String value) {
		setConstString(offset + 226, $ar_sttl_nm1, value);
	}


	/**
	 * Payment received result item name 2 入金実績品名２.<p>
	 *
	 */
	public String ar_sttl_nm2() {
		return getConstString(offset + 227, $ar_sttl_nm2);
	}

	/**
	 * Payment received result item name 2 入金実績品名２.<p>
	 *
	 */
	public void ar_sttl_nm2(String value) {
		setConstString(offset + 227, $ar_sttl_nm2, value);
	}


	/**
	 * Payment received result tax cd. 1 入金実績税ＣＤ１.<p>
	 *
	 */
	public String ar_tax_cd1() {
		return getConstString(offset + 228, $ar_tax_cd1);
	}

	/**
	 * Payment received result tax cd. 1 入金実績税ＣＤ１.<p>
	 *
	 */
	public void ar_tax_cd1(String value) {
		setConstString(offset + 228, $ar_tax_cd1, value);
	}


	/**
	 * Payment received result tax cd. 2 入金実績税ＣＤ２.<p>
	 *
	 */
	public String ar_tax_cd2() {
		return getConstString(offset + 229, $ar_tax_cd2);
	}

	/**
	 * Payment received result tax cd. 2 入金実績税ＣＤ２.<p>
	 *
	 */
	public void ar_tax_cd2(String value) {
		setConstString(offset + 229, $ar_tax_cd2, value);
	}


	/**
	 * Payment received result tax name 1 入金実績税名１.<p>
	 *
	 */
	public String ar_tax_nm1() {
		return getConstString(offset + 230, $ar_tax_nm1);
	}

	/**
	 * Payment received result tax name 1 入金実績税名１.<p>
	 *
	 */
	public void ar_tax_nm1(String value) {
		setConstString(offset + 230, $ar_tax_nm1, value);
	}


	/**
	 * Payment received result tax name 2 入金実績税名２.<p>
	 *
	 */
	public String ar_tax_nm2() {
		return getConstString(offset + 231, $ar_tax_nm2);
	}

	/**
	 * Payment received result tax name 2 入金実績税名２.<p>
	 *
	 */
	public void ar_tax_nm2(String value) {
		setConstString(offset + 231, $ar_tax_nm2, value);
	}


	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public MCNumber ar_tax_rate1() {
		return getConstNumber(offset + 232, $ar_tax_rate1);
	}

	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public void ar_tax_rate1(MCNumber value) {
		setConstNumber(offset + 232, $ar_tax_rate1, value);
	}

	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public void ar_tax_rate1(int value) {
		setConstNumber(offset + 232, $ar_tax_rate1, value);
	}

	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public void ar_tax_rate1(long value) {
		setConstNumber(offset + 232, $ar_tax_rate1, value);
	}

	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public void ar_tax_rate1(float value) {
		setConstNumber(offset + 232, $ar_tax_rate1, value);
	}

	/**
	 * Payment received result tax rate 1 入金実績税率１.<p>
	 *
	 */
	public void ar_tax_rate1(double value) {
		setConstNumber(offset + 232, $ar_tax_rate1, value);
	}


	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public MCNumber ar_tax_rate2() {
		return getConstNumber(offset + 233, $ar_tax_rate2);
	}

	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public void ar_tax_rate2(MCNumber value) {
		setConstNumber(offset + 233, $ar_tax_rate2, value);
	}

	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public void ar_tax_rate2(int value) {
		setConstNumber(offset + 233, $ar_tax_rate2, value);
	}

	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public void ar_tax_rate2(long value) {
		setConstNumber(offset + 233, $ar_tax_rate2, value);
	}

	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public void ar_tax_rate2(float value) {
		setConstNumber(offset + 233, $ar_tax_rate2, value);
	}

	/**
	 * Payment received result tax rate 2 入金実績税率２.<p>
	 *
	 */
	public void ar_tax_rate2(double value) {
		setConstNumber(offset + 233, $ar_tax_rate2, value);
	}


	/**
	 * Tax inclusive flg. 1 内税ＦＬＧ１.<p>
	 *
	 */
	public boolean inc_tax_flg1() {
		return getConstBoolean(offset + 234, $inc_tax_flg1);
	}

	/**
	 * Tax inclusive flg. 1 内税ＦＬＧ１.<p>
	 *
	 */
	public void inc_tax_flg1(boolean value) {
		setConstBoolean(offset + 234, $inc_tax_flg1, value);
	}


	/**
	 * Tax inclusive flg. 2 内税ＦＬＧ２.<p>
	 *
	 */
	public boolean inc_tax_flg2() {
		return getConstBoolean(offset + 235, $inc_tax_flg2);
	}

	/**
	 * Tax inclusive flg. 2 内税ＦＬＧ２.<p>
	 *
	 */
	public void inc_tax_flg2(boolean value) {
		setConstBoolean(offset + 235, $inc_tax_flg2, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 236, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 236, $ar_trd_grp_typ, value);
	}


	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public MCNumber tax_sls_amt() {
		return getConstNumber(offset + 237, $tax_sls_amt);
	}

	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public void tax_sls_amt(MCNumber value) {
		setConstNumber(offset + 237, $tax_sls_amt, value);
	}

	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public void tax_sls_amt(int value) {
		setConstNumber(offset + 237, $tax_sls_amt, value);
	}

	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public void tax_sls_amt(long value) {
		setConstNumber(offset + 237, $tax_sls_amt, value);
	}

	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public void tax_sls_amt(float value) {
		setConstNumber(offset + 237, $tax_sls_amt, value);
	}

	/**
	 * Amount for tax aggregation (Transaction currency) 税集計用取引通貨金額.<p>
	 *
	 */
	public void tax_sls_amt(double value) {
		setConstNumber(offset + 237, $tax_sls_amt, value);
	}


	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public MCNumber tax_tax_amt() {
		return getConstNumber(offset + 238, $tax_tax_amt);
	}

	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public void tax_tax_amt(MCNumber value) {
		setConstNumber(offset + 238, $tax_tax_amt, value);
	}

	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public void tax_tax_amt(int value) {
		setConstNumber(offset + 238, $tax_tax_amt, value);
	}

	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public void tax_tax_amt(long value) {
		setConstNumber(offset + 238, $tax_tax_amt, value);
	}

	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public void tax_tax_amt(float value) {
		setConstNumber(offset + 238, $tax_tax_amt, value);
	}

	/**
	 * Transaction tax amount for tax aggregation 税集計用取引税金額.<p>
	 *
	 */
	public void tax_tax_amt(double value) {
		setConstNumber(offset + 238, $tax_tax_amt, value);
	}


	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public boolean bfw_bal_disp_flg() {
		return getConstBoolean(offset + 239, $bfw_bal_disp_flg);
	}

	/**
	 * Display balance of previous month on invoice flg. 請求書前月残高表示ＦＬＧ.<p>
	 *
	 */
	public void bfw_bal_disp_flg(boolean value) {
		setConstBoolean(offset + 239, $bfw_bal_disp_flg, value);
	}


	/**
	 * Billing at each sales flg. 売上都度請求ＦＬＧ.<p>
	 *
	 */
	public boolean bill_each_sls_flg() {
		return getConstBoolean(offset + 240, $bill_each_sls_flg);
	}

	/**
	 * Billing at each sales flg. 売上都度請求ＦＬＧ.<p>
	 *
	 */
	public void bill_each_sls_flg(boolean value) {
		setConstBoolean(offset + 240, $bill_each_sls_flg, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 241, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 241, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 241, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 241, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 241, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 241, $base_cur_tax_amt, value);
	}


	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 242, $base_cur_tax_amt1);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 242, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 242, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 242, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 242, $base_cur_tax_amt1, value);
	}

	/**
	 * Tax inclusive amount 1 (Base currency) 基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 242, $base_cur_tax_amt1, value);
	}


	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 243, $base_cur_tax_amt2);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 243, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 243, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 243, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 243, $base_cur_tax_amt2, value);
	}

	/**
	 * Tax inclusive amount 2 (Base currency) 基準通貨内税額２.<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 243, $base_cur_tax_amt2, value);
	}


	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCNumber bill_rev() {
		return getConstNumber(offset + 244, $bill_rev);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(MCNumber value) {
		setConstNumber(offset + 244, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(int value) {
		setConstNumber(offset + 244, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(long value) {
		setConstNumber(offset + 244, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(float value) {
		setConstNumber(offset + 244, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(double value) {
		setConstNumber(offset + 244, $bill_rev, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 245, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 245, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 245, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 245, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 245, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 245, $dlv_slip_rev, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 246, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 246, $wg_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 247, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 247, $bill_dpt_cd, value);
	}


	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return getConstDate(offset + 248, $ship_tm);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		setConstDate(offset + 248, $ship_tm, value);
	}


	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 249, $dscnt_itm_flg);
	}

	/**
	 * Discount item flg. 値引品目ＦＬＧ.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 249, $dscnt_itm_flg, value);
	}


	/**
	 * NULL character IF flg. ＮＵＬＬ文字ＩＦＦＬＧ.<p>
	 *
	 */
	public boolean null_val_if_flg() {
		return getConstBoolean(offset + 250, $null_val_if_flg);
	}

	/**
	 * NULL character IF flg. ＮＵＬＬ文字ＩＦＦＬＧ.<p>
	 *
	 */
	public void null_val_if_flg(boolean value) {
		setConstBoolean(offset + 250, $null_val_if_flg, value);
	}


	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public boolean bill_tax_disp_flg1() {
		return getConstBoolean(offset + 251, $bill_tax_disp_flg1);
	}

	/**
	 * Display tax amount on invoice 1 請求書税額表示１.<p>
	 *
	 */
	public void bill_tax_disp_flg1(boolean value) {
		setConstBoolean(offset + 251, $bill_tax_disp_flg1, value);
	}


	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public boolean bill_tax_disp_flg2() {
		return getConstBoolean(offset + 252, $bill_tax_disp_flg2);
	}

	/**
	 * Display tax amount on invoice 2 請求書税額表示２.<p>
	 *
	 */
	public void bill_tax_disp_flg2(boolean value) {
		setConstBoolean(offset + 252, $bill_tax_disp_flg2, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
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
		if ($bill_dpt.equalsIgnoreCase(name)) {
			return bill_dpt();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			return if_cntry_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			return if_bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bcst_ein.equalsIgnoreCase(name)) {
			return bcst_ein();
		}
		if ($bcst_biz_co_no.equalsIgnoreCase(name)) {
			return bcst_biz_co_no();
		}
		if ($bcst_zip_cd.equalsIgnoreCase(name)) {
			return bcst_zip_cd();
		}
		if ($bcst_addr1.equalsIgnoreCase(name)) {
			return bcst_addr1();
		}
		if ($bcst_addr2.equalsIgnoreCase(name)) {
			return bcst_addr2();
		}
		if ($bcst_addr3.equalsIgnoreCase(name)) {
			return bcst_addr3();
		}
		if ($bcst_addr4.equalsIgnoreCase(name)) {
			return bcst_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bcst_cntry_cd.equalsIgnoreCase(name)) {
			return bcst_cntry_cd();
		}
		if ($if_bcst_cntry_cd.equalsIgnoreCase(name)) {
			return if_bcst_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($if_rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd1();
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			return rcv_mtd_nm1();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($if_rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd2();
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			return rcv_mtd_nm2();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($if_rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd3();
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			return rcv_mtd_nm3();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($if_rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd4();
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			return rcv_mtd_nm4();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($if_rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd5();
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			return rcv_mtd_nm5();
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return rcv_mtd_cd6();
		}
		if ($if_rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd6();
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			return rcv_mtd_nm6();
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return rcv_mtd_cd7();
		}
		if ($if_rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd7();
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			return rcv_mtd_nm7();
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return rcv_mtd_cd8();
		}
		if ($if_rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd8();
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			return rcv_mtd_nm8();
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return rcv_mtd_cd9();
		}
		if ($if_rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd9();
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			return rcv_mtd_nm9();
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return rcv_mtd_cd10();
		}
		if ($if_rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd10();
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			return rcv_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($ar_tax_cd1.equalsIgnoreCase(name)) {
			return ar_tax_cd1();
		}
		if ($ar_tax_cd2.equalsIgnoreCase(name)) {
			return ar_tax_cd2();
		}
		if ($ar_tax_nm1.equalsIgnoreCase(name)) {
			return ar_tax_nm1();
		}
		if ($ar_tax_nm2.equalsIgnoreCase(name)) {
			return ar_tax_nm2();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt1();
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt1();
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt2();
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt2();
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt3();
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt3();
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt3();
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			return tax_rate4();
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt4();
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt4();
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt4();
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			return tax_rate5();
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt5();
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt5();
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt5();
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			return tax_rate6();
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt6();
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt6();
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt6();
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			return tax_rate7();
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt7();
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt7();
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt7();
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			return tax_rate8();
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt8();
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt8();
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt8();
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			return tax_rate9();
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt9();
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt9();
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt9();
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			return tax_rate10();
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			return adv_amt_bal();
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			return adv_amt();
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			return adv_setoff_amt();
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_setoff_tax_amt();
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			return rcv_schd_amt1();
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			return rcv_schd_amt2();
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			return rcv_schd_amt3();
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			return rcv_schd_amt4();
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			return rcv_schd_amt5();
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			return rcv_schd_amt6();
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			return rcv_schd_amt7();
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			return rcv_schd_amt8();
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			return rcv_schd_amt9();
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			return rcv_schd_amt10();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			return ar_tax_rate1();
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			return ar_tax_rate2();
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			return tax_sls_amt();
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			return tax_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			return rcv_schd_dt1();
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			return rcv_schd_dt2();
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			return rcv_schd_dt3();
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			return rcv_schd_dt4();
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			return rcv_schd_dt5();
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			return rcv_schd_dt6();
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			return rcv_schd_dt7();
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			return rcv_schd_dt8();
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			return rcv_schd_dt9();
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			return rcv_schd_dt10();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($ar_rcv_dt.equalsIgnoreCase(name)) {
			return ar_rcv_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			return inc_tax_flg1();
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			return inc_tax_flg2();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			return bill_each_sls_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg1();
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg2();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
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
		if ($bill_dpt.equalsIgnoreCase(name)) {
			return bill_dpt();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			return if_cntry_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			return if_bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bcst_ein.equalsIgnoreCase(name)) {
			return bcst_ein();
		}
		if ($bcst_biz_co_no.equalsIgnoreCase(name)) {
			return bcst_biz_co_no();
		}
		if ($bcst_zip_cd.equalsIgnoreCase(name)) {
			return bcst_zip_cd();
		}
		if ($bcst_addr1.equalsIgnoreCase(name)) {
			return bcst_addr1();
		}
		if ($bcst_addr2.equalsIgnoreCase(name)) {
			return bcst_addr2();
		}
		if ($bcst_addr3.equalsIgnoreCase(name)) {
			return bcst_addr3();
		}
		if ($bcst_addr4.equalsIgnoreCase(name)) {
			return bcst_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bcst_cntry_cd.equalsIgnoreCase(name)) {
			return bcst_cntry_cd();
		}
		if ($if_bcst_cntry_cd.equalsIgnoreCase(name)) {
			return if_bcst_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($if_rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd1();
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			return rcv_mtd_nm1();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($if_rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd2();
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			return rcv_mtd_nm2();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($if_rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd3();
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			return rcv_mtd_nm3();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($if_rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd4();
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			return rcv_mtd_nm4();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($if_rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd5();
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			return rcv_mtd_nm5();
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return rcv_mtd_cd6();
		}
		if ($if_rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd6();
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			return rcv_mtd_nm6();
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return rcv_mtd_cd7();
		}
		if ($if_rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd7();
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			return rcv_mtd_nm7();
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return rcv_mtd_cd8();
		}
		if ($if_rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd8();
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			return rcv_mtd_nm8();
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return rcv_mtd_cd9();
		}
		if ($if_rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd9();
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			return rcv_mtd_nm9();
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return rcv_mtd_cd10();
		}
		if ($if_rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd10();
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			return rcv_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			return ar_sttl_typ2();
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			return ar_sttl_nm1();
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			return ar_sttl_nm2();
		}
		if ($ar_tax_cd1.equalsIgnoreCase(name)) {
			return ar_tax_cd1();
		}
		if ($ar_tax_cd2.equalsIgnoreCase(name)) {
			return ar_tax_cd2();
		}
		if ($ar_tax_nm1.equalsIgnoreCase(name)) {
			return ar_tax_nm1();
		}
		if ($ar_tax_nm2.equalsIgnoreCase(name)) {
			return ar_tax_nm2();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt1();
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt1();
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt2();
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt2();
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt3();
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt3();
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt3();
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			return tax_rate4();
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt4();
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt4();
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt4();
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			return tax_rate5();
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt5();
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt5();
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt5();
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			return tax_rate6();
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt6();
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt6();
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt6();
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			return tax_rate7();
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt7();
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt7();
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt7();
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			return tax_rate8();
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt8();
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt8();
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt8();
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			return tax_rate9();
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt9();
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt9();
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt9();
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			return tax_rate10();
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			return adv_amt_bal();
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			return adv_amt();
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			return adv_setoff_amt();
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_setoff_tax_amt();
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			return rcv_schd_amt1();
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			return rcv_schd_amt2();
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			return rcv_schd_amt3();
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			return rcv_schd_amt4();
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			return rcv_schd_amt5();
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			return rcv_schd_amt6();
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			return rcv_schd_amt7();
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			return rcv_schd_amt8();
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			return rcv_schd_amt9();
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			return rcv_schd_amt10();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			return ar_tax_rate1();
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			return ar_tax_rate2();
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			return tax_sls_amt();
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			return tax_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			return rcv_schd_dt1();
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			return rcv_schd_dt2();
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			return rcv_schd_dt3();
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			return rcv_schd_dt4();
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			return rcv_schd_dt5();
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			return rcv_schd_dt6();
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			return rcv_schd_dt7();
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			return rcv_schd_dt8();
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			return rcv_schd_dt9();
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			return rcv_schd_dt10();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($ar_rcv_dt.equalsIgnoreCase(name)) {
			return ar_rcv_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			return inc_tax_flg1();
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			return inc_tax_flg2();
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			return bfw_bal_disp_flg();
		}
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			return bill_each_sls_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg1();
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg2();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($bill_dpt.equalsIgnoreCase(name)) {
			bill_dpt(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			if_cntry_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			if_bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bcst_ein.equalsIgnoreCase(name)) {
			bcst_ein(value);
			return;
		}
		if ($bcst_biz_co_no.equalsIgnoreCase(name)) {
			bcst_biz_co_no(value);
			return;
		}
		if ($bcst_zip_cd.equalsIgnoreCase(name)) {
			bcst_zip_cd(value);
			return;
		}
		if ($bcst_addr1.equalsIgnoreCase(name)) {
			bcst_addr1(value);
			return;
		}
		if ($bcst_addr2.equalsIgnoreCase(name)) {
			bcst_addr2(value);
			return;
		}
		if ($bcst_addr3.equalsIgnoreCase(name)) {
			bcst_addr3(value);
			return;
		}
		if ($bcst_addr4.equalsIgnoreCase(name)) {
			bcst_addr4(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bcst_cntry_cd.equalsIgnoreCase(name)) {
			bcst_cntry_cd(value);
			return;
		}
		if ($if_bcst_cntry_cd.equalsIgnoreCase(name)) {
			if_bcst_cntry_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			if_trd_cur_cd(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($if_rcv_mtd_cd1.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd1(value);
			return;
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			rcv_mtd_nm1(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($if_rcv_mtd_cd2.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd2(value);
			return;
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			rcv_mtd_nm2(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($if_rcv_mtd_cd3.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd3(value);
			return;
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			rcv_mtd_nm3(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($if_rcv_mtd_cd4.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd4(value);
			return;
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			rcv_mtd_nm4(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($if_rcv_mtd_cd5.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd5(value);
			return;
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			rcv_mtd_nm5(value);
			return;
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			rcv_mtd_cd6(value);
			return;
		}
		if ($if_rcv_mtd_cd6.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd6(value);
			return;
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			rcv_mtd_nm6(value);
			return;
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			rcv_mtd_cd7(value);
			return;
		}
		if ($if_rcv_mtd_cd7.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd7(value);
			return;
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			rcv_mtd_nm7(value);
			return;
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			rcv_mtd_cd8(value);
			return;
		}
		if ($if_rcv_mtd_cd8.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd8(value);
			return;
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			rcv_mtd_nm8(value);
			return;
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			rcv_mtd_cd9(value);
			return;
		}
		if ($if_rcv_mtd_cd9.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd9(value);
			return;
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			rcv_mtd_nm9(value);
			return;
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			rcv_mtd_cd10(value);
			return;
		}
		if ($if_rcv_mtd_cd10.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd10(value);
			return;
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			rcv_mtd_nm10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			if_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			if_tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($ar_tax_cd1.equalsIgnoreCase(name)) {
			ar_tax_cd1(value);
			return;
		}
		if ($ar_tax_cd2.equalsIgnoreCase(name)) {
			ar_tax_cd2(value);
			return;
		}
		if ($ar_tax_nm1.equalsIgnoreCase(name)) {
			ar_tax_nm1(value);
			return;
		}
		if ($ar_tax_nm2.equalsIgnoreCase(name)) {
			ar_tax_nm2(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			bill_st_dt(value);
			return;
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			bill_end_dt(value);
			return;
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			rcv_schd_dt1(value);
			return;
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			rcv_schd_dt2(value);
			return;
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			rcv_schd_dt3(value);
			return;
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			rcv_schd_dt4(value);
			return;
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			rcv_schd_dt5(value);
			return;
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			rcv_schd_dt6(value);
			return;
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			rcv_schd_dt7(value);
			return;
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			rcv_schd_dt8(value);
			return;
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			rcv_schd_dt9(value);
			return;
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			rcv_schd_dt10(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($ar_rcv_dt.equalsIgnoreCase(name)) {
			ar_rcv_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			inc_tax_flg1(value);
			return;
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			inc_tax_flg2(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			bill_each_sls_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			bill_tax_disp_flg1(value);
			return;
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			bill_tax_disp_flg2(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($bill_dpt.equalsIgnoreCase(name)) {
			bill_dpt(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			if_cntry_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			if_bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bcst_ein.equalsIgnoreCase(name)) {
			bcst_ein(value);
			return;
		}
		if ($bcst_biz_co_no.equalsIgnoreCase(name)) {
			bcst_biz_co_no(value);
			return;
		}
		if ($bcst_zip_cd.equalsIgnoreCase(name)) {
			bcst_zip_cd(value);
			return;
		}
		if ($bcst_addr1.equalsIgnoreCase(name)) {
			bcst_addr1(value);
			return;
		}
		if ($bcst_addr2.equalsIgnoreCase(name)) {
			bcst_addr2(value);
			return;
		}
		if ($bcst_addr3.equalsIgnoreCase(name)) {
			bcst_addr3(value);
			return;
		}
		if ($bcst_addr4.equalsIgnoreCase(name)) {
			bcst_addr4(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bcst_cntry_cd.equalsIgnoreCase(name)) {
			bcst_cntry_cd(value);
			return;
		}
		if ($if_bcst_cntry_cd.equalsIgnoreCase(name)) {
			if_bcst_cntry_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			if_trd_cur_cd(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($if_rcv_mtd_cd1.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd1(value);
			return;
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			rcv_mtd_nm1(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($if_rcv_mtd_cd2.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd2(value);
			return;
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			rcv_mtd_nm2(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($if_rcv_mtd_cd3.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd3(value);
			return;
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			rcv_mtd_nm3(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($if_rcv_mtd_cd4.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd4(value);
			return;
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			rcv_mtd_nm4(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($if_rcv_mtd_cd5.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd5(value);
			return;
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			rcv_mtd_nm5(value);
			return;
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			rcv_mtd_cd6(value);
			return;
		}
		if ($if_rcv_mtd_cd6.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd6(value);
			return;
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			rcv_mtd_nm6(value);
			return;
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			rcv_mtd_cd7(value);
			return;
		}
		if ($if_rcv_mtd_cd7.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd7(value);
			return;
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			rcv_mtd_nm7(value);
			return;
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			rcv_mtd_cd8(value);
			return;
		}
		if ($if_rcv_mtd_cd8.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd8(value);
			return;
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			rcv_mtd_nm8(value);
			return;
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			rcv_mtd_cd9(value);
			return;
		}
		if ($if_rcv_mtd_cd9.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd9(value);
			return;
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			rcv_mtd_nm9(value);
			return;
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			rcv_mtd_cd10(value);
			return;
		}
		if ($if_rcv_mtd_cd10.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd10(value);
			return;
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			rcv_mtd_nm10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			if_bank_ac_cd(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
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
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			if_tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($ar_sttl_typ2.equalsIgnoreCase(name)) {
			ar_sttl_typ2(value);
			return;
		}
		if ($ar_sttl_nm1.equalsIgnoreCase(name)) {
			ar_sttl_nm1(value);
			return;
		}
		if ($ar_sttl_nm2.equalsIgnoreCase(name)) {
			ar_sttl_nm2(value);
			return;
		}
		if ($ar_tax_cd1.equalsIgnoreCase(name)) {
			ar_tax_cd1(value);
			return;
		}
		if ($ar_tax_cd2.equalsIgnoreCase(name)) {
			ar_tax_cd2(value);
			return;
		}
		if ($ar_tax_nm1.equalsIgnoreCase(name)) {
			ar_tax_nm1(value);
			return;
		}
		if ($ar_tax_nm2.equalsIgnoreCase(name)) {
			ar_tax_nm2(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt1.equalsIgnoreCase(name)) {
			rcv_schd_amt1(value);
			return;
		}
		if ($rcv_schd_amt2.equalsIgnoreCase(name)) {
			rcv_schd_amt2(value);
			return;
		}
		if ($rcv_schd_amt3.equalsIgnoreCase(name)) {
			rcv_schd_amt3(value);
			return;
		}
		if ($rcv_schd_amt4.equalsIgnoreCase(name)) {
			rcv_schd_amt4(value);
			return;
		}
		if ($rcv_schd_amt5.equalsIgnoreCase(name)) {
			rcv_schd_amt5(value);
			return;
		}
		if ($rcv_schd_amt6.equalsIgnoreCase(name)) {
			rcv_schd_amt6(value);
			return;
		}
		if ($rcv_schd_amt7.equalsIgnoreCase(name)) {
			rcv_schd_amt7(value);
			return;
		}
		if ($rcv_schd_amt8.equalsIgnoreCase(name)) {
			rcv_schd_amt8(value);
			return;
		}
		if ($rcv_schd_amt9.equalsIgnoreCase(name)) {
			rcv_schd_amt9(value);
			return;
		}
		if ($rcv_schd_amt10.equalsIgnoreCase(name)) {
			rcv_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
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
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($ar_tax_rate1.equalsIgnoreCase(name)) {
			ar_tax_rate1(value);
			return;
		}
		if ($ar_tax_rate2.equalsIgnoreCase(name)) {
			ar_tax_rate2(value);
			return;
		}
		if ($tax_sls_amt.equalsIgnoreCase(name)) {
			tax_sls_amt(value);
			return;
		}
		if ($tax_tax_amt.equalsIgnoreCase(name)) {
			tax_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			bill_st_dt(value);
			return;
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			bill_end_dt(value);
			return;
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			rcv_schd_dt1(value);
			return;
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			rcv_schd_dt2(value);
			return;
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			rcv_schd_dt3(value);
			return;
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			rcv_schd_dt4(value);
			return;
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			rcv_schd_dt5(value);
			return;
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			rcv_schd_dt6(value);
			return;
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			rcv_schd_dt7(value);
			return;
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			rcv_schd_dt8(value);
			return;
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			rcv_schd_dt9(value);
			return;
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			rcv_schd_dt10(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($ar_rcv_dt.equalsIgnoreCase(name)) {
			ar_rcv_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($inc_tax_flg1.equalsIgnoreCase(name)) {
			inc_tax_flg1(value);
			return;
		}
		if ($inc_tax_flg2.equalsIgnoreCase(name)) {
			inc_tax_flg2(value);
			return;
		}
		if ($bfw_bal_disp_flg.equalsIgnoreCase(name)) {
			bfw_bal_disp_flg(value);
			return;
		}
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			bill_each_sls_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($bill_tax_disp_flg1.equalsIgnoreCase(name)) {
			bill_tax_disp_flg1(value);
			return;
		}
		if ($bill_tax_disp_flg2.equalsIgnoreCase(name)) {
			bill_tax_disp_flg2(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

