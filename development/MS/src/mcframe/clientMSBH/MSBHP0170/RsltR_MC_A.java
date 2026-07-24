package mcframe.clientMSBH.MSBHP0170;

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
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public static final String $bill_rcpt_no = "bill_rcpt_no";
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
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public static final String $invalid_flg = "invalid_flg";
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
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public static final String $bill_src_cd = "bill_src_cd";
	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public static final String $bill_src_nm = "bill_src_nm";
	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public static final String $bill_src_ein = "bill_src_ein";
	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public static final String $bill_src_biz_co_no = "bill_src_biz_co_no";
	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public static final String $bill_src_zip_cd = "bill_src_zip_cd";
	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public static final String $bill_src_addr1 = "bill_src_addr1";
	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public static final String $bill_src_addr2 = "bill_src_addr2";
	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public static final String $bill_src_addr3 = "bill_src_addr3";
	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public static final String $bill_src_addr4 = "bill_src_addr4";
	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public static final String $bill_src_dpt = "bill_src_dpt";
	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_src_tel = "bill_src_tel";
	public static final String $billGrp_p = "billGrp_p";
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
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
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
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 * Current payment amount 今回買上額.<p>
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
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
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
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
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
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
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
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
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
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
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
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
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
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
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
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
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
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
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
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
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
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
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
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
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
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public static final String $pay_schd_dt1 = "pay_schd_dt1";
	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public static final String $pay_schd_amt1 = "pay_schd_amt1";
	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public static final String $pay_mtd_cd1 = "pay_mtd_cd1";
	/**
	 * Payment method name 1 支払方法名１.<p>
	 *
	 */
	public static final String $pay_mtd_nm1 = "pay_mtd_nm1";
	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public static final String $pay_schd_dt2 = "pay_schd_dt2";
	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public static final String $pay_schd_amt2 = "pay_schd_amt2";
	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public static final String $pay_mtd_cd2 = "pay_mtd_cd2";
	/**
	 * Payment method name 2 支払方法名２.<p>
	 *
	 */
	public static final String $pay_mtd_nm2 = "pay_mtd_nm2";
	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public static final String $pay_schd_dt3 = "pay_schd_dt3";
	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public static final String $pay_schd_amt3 = "pay_schd_amt3";
	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public static final String $pay_mtd_cd3 = "pay_mtd_cd3";
	/**
	 * Payment method name 3 支払方法名３.<p>
	 *
	 */
	public static final String $pay_mtd_nm3 = "pay_mtd_nm3";
	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public static final String $pay_schd_dt4 = "pay_schd_dt4";
	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public static final String $pay_schd_amt4 = "pay_schd_amt4";
	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public static final String $pay_mtd_cd4 = "pay_mtd_cd4";
	/**
	 * Payment method name 4 支払方法名４.<p>
	 *
	 */
	public static final String $pay_mtd_nm4 = "pay_mtd_nm4";
	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public static final String $pay_schd_dt5 = "pay_schd_dt5";
	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public static final String $pay_schd_amt5 = "pay_schd_amt5";
	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public static final String $pay_mtd_cd5 = "pay_mtd_cd5";
	/**
	 * Payment method name 5 支払方法名５.<p>
	 *
	 */
	public static final String $pay_mtd_nm5 = "pay_mtd_nm5";
	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public static final String $pay_schd_dt6 = "pay_schd_dt6";
	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public static final String $pay_schd_amt6 = "pay_schd_amt6";
	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public static final String $pay_mtd_cd6 = "pay_mtd_cd6";
	/**
	 * Payment method name 6 支払方法名６.<p>
	 *
	 */
	public static final String $pay_mtd_nm6 = "pay_mtd_nm6";
	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public static final String $pay_schd_dt7 = "pay_schd_dt7";
	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public static final String $pay_schd_amt7 = "pay_schd_amt7";
	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public static final String $pay_mtd_cd7 = "pay_mtd_cd7";
	/**
	 * Payment method name 7 支払方法名７.<p>
	 *
	 */
	public static final String $pay_mtd_nm7 = "pay_mtd_nm7";
	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public static final String $pay_schd_dt8 = "pay_schd_dt8";
	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public static final String $pay_schd_amt8 = "pay_schd_amt8";
	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public static final String $pay_mtd_cd8 = "pay_mtd_cd8";
	/**
	 * Payment method name 8 支払方法名８.<p>
	 *
	 */
	public static final String $pay_mtd_nm8 = "pay_mtd_nm8";
	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public static final String $pay_schd_dt9 = "pay_schd_dt9";
	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public static final String $pay_schd_amt9 = "pay_schd_amt9";
	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public static final String $pay_mtd_cd9 = "pay_mtd_cd9";
	/**
	 * Payment method name 9 支払方法名９.<p>
	 *
	 */
	public static final String $pay_mtd_nm9 = "pay_mtd_nm9";
	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public static final String $pay_schd_dt10 = "pay_schd_dt10";
	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public static final String $pay_schd_amt10 = "pay_schd_amt10";
	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public static final String $pay_mtd_cd10 = "pay_mtd_cd10";
	/**
	 * Payment method name 10 支払方法名１０.<p>
	 *
	 */
	public static final String $pay_mtd_nm10 = "pay_mtd_nm10";
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public static final String $bill_ein = "bill_ein";
	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public static final String $bill_biz_co_no = "bill_biz_co_no";
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
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

	public static final String $bp_grp_cd1 = $billGrp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $billGrp_p + ".bp_grp_nm1";
	public static final String $bp_grp_cd2 = $billGrp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $billGrp_p + ".bp_grp_nm2";
	public static final String $bp_grp_cd3 = $billGrp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $billGrp_p + ".bp_grp_nm3";
	public static final String $bp_grp_cd4 = $billGrp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $billGrp_p + ".bp_grp_nm4";
	public static final String $bp_grp_cd5 = $billGrp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $billGrp_p + ".bp_grp_nm5";
	public static final String $bp_grp_cd6 = $billGrp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $billGrp_p + ".bp_grp_nm6";
	public static final String $bp_grp_cd7 = $billGrp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $billGrp_p + ".bp_grp_nm7";
	public static final String $bp_grp_cd8 = $billGrp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $billGrp_p + ".bp_grp_nm8";
	public static final String $bp_grp_cd9 = $billGrp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $billGrp_p + ".bp_grp_nm9";
	public static final String $bp_grp_cd10 = $billGrp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $billGrp_p + ".bp_grp_nm10";

	public static final MCMeta bill_rcpt_no_META = createCommonMeta($bill_rcpt_no, mcframe.commonMA.meta.MA_META.BILL_RCPT_NO);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta invalid_flg_META = createCommonMeta($invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_src_cd_META = createCommonMeta($bill_src_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_src_nm_META = createCommonMeta($bill_src_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_src_ein_META = createCommonMeta($bill_src_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_src_biz_co_no_META = createCommonMeta($bill_src_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_src_zip_cd_META = createCommonMeta($bill_src_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_src_addr1_META = createCommonMeta($bill_src_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr2_META = createCommonMeta($bill_src_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr3_META = createCommonMeta($bill_src_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr4_META = createCommonMeta($bill_src_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_dpt_META = createCommonMeta($bill_src_dpt, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_src_tel_META = createCommonMeta($bill_src_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta billGrp_p_META = createInnerRowMeta($billGrp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_ac_holder_sub_META = createCommonMeta($bank_ac_holder_sub, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER_SUB);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
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
	public static final MCMeta pay_schd_dt1_META = createCommonMeta($pay_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt1_META = createCommonMeta($pay_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd1_META = createCommonMeta($pay_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm1_META = createCommonMeta($pay_mtd_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt2_META = createCommonMeta($pay_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt2_META = createCommonMeta($pay_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd2_META = createCommonMeta($pay_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm2_META = createCommonMeta($pay_mtd_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt3_META = createCommonMeta($pay_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt3_META = createCommonMeta($pay_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd3_META = createCommonMeta($pay_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm3_META = createCommonMeta($pay_mtd_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt4_META = createCommonMeta($pay_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt4_META = createCommonMeta($pay_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd4_META = createCommonMeta($pay_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm4_META = createCommonMeta($pay_mtd_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt5_META = createCommonMeta($pay_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt5_META = createCommonMeta($pay_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd5_META = createCommonMeta($pay_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm5_META = createCommonMeta($pay_mtd_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt6_META = createCommonMeta($pay_schd_dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt6_META = createCommonMeta($pay_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd6_META = createCommonMeta($pay_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm6_META = createCommonMeta($pay_mtd_nm6, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt7_META = createCommonMeta($pay_schd_dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt7_META = createCommonMeta($pay_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd7_META = createCommonMeta($pay_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm7_META = createCommonMeta($pay_mtd_nm7, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt8_META = createCommonMeta($pay_schd_dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt8_META = createCommonMeta($pay_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd8_META = createCommonMeta($pay_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm8_META = createCommonMeta($pay_mtd_nm8, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt9_META = createCommonMeta($pay_schd_dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt9_META = createCommonMeta($pay_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd9_META = createCommonMeta($pay_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm9_META = createCommonMeta($pay_mtd_nm9, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_dt10_META = createCommonMeta($pay_schd_dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt10_META = createCommonMeta($pay_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd10_META = createCommonMeta($pay_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_mtd_nm10_META = createCommonMeta($pay_mtd_nm10, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_ein_META = createCommonMeta($bill_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_biz_co_no_META = createCommonMeta($bill_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_rcpt_no_META,
			bill_cl_dt_META,
			bill_dt_META,
			bill_no_META,
			invalid_flg_META,
			pre_bill_no_META,
			pre_bill_dt_META,
			bill_st_dt_META,
			bill_end_dt_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			bill_src_cd_META,
			bill_src_nm_META,
			bill_src_ein_META,
			bill_src_biz_co_no_META,
			bill_src_zip_cd_META,
			bill_src_addr1_META,
			bill_src_addr2_META,
			bill_src_addr3_META,
			bill_src_addr4_META,
			bill_src_dpt_META,
			bill_src_tel_META,
			billGrp_p_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			bill_xrate_META,
			last_bill_amt_META,
			rcv_amt_META,
			sw_amt_META,
			bfw_amt_META,
			sls_amt_META,
			dscnt_amt_META,
			ret_amt_META,
			setoff_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			bill_amt_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			bank_ac_no_META,
			bank_ac_typ_META,
			bank_ac_holder_META,
			bank_ac_holder_sub_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
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
			pay_schd_dt1_META,
			pay_schd_amt1_META,
			pay_mtd_cd1_META,
			pay_mtd_nm1_META,
			pay_schd_dt2_META,
			pay_schd_amt2_META,
			pay_mtd_cd2_META,
			pay_mtd_nm2_META,
			pay_schd_dt3_META,
			pay_schd_amt3_META,
			pay_mtd_cd3_META,
			pay_mtd_nm3_META,
			pay_schd_dt4_META,
			pay_schd_amt4_META,
			pay_mtd_cd4_META,
			pay_mtd_nm4_META,
			pay_schd_dt5_META,
			pay_schd_amt5_META,
			pay_mtd_cd5_META,
			pay_mtd_nm5_META,
			pay_schd_dt6_META,
			pay_schd_amt6_META,
			pay_mtd_cd6_META,
			pay_mtd_nm6_META,
			pay_schd_dt7_META,
			pay_schd_amt7_META,
			pay_mtd_cd7_META,
			pay_mtd_nm7_META,
			pay_schd_dt8_META,
			pay_schd_amt8_META,
			pay_mtd_cd8_META,
			pay_mtd_nm8_META,
			pay_schd_dt9_META,
			pay_schd_amt9_META,
			pay_mtd_cd9_META,
			pay_mtd_nm9_META,
			pay_schd_dt10_META,
			pay_schd_amt10_META,
			pay_mtd_cd10_META,
			pay_mtd_nm10_META,
			bill_bcst_nm_META,
			bill_ein_META,
			bill_biz_co_no_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_bcst_dpt_META,
			bill_tel_META,
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
			upd_srv_req_no_META
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
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public String bill_rcpt_no() {
		return getConstString(offset + 0, $bill_rcpt_no);
	}

	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public void bill_rcpt_no(String value) {
		setConstString(offset + 0, $bill_rcpt_no, value);
	}


	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 1, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 1, $bill_cl_dt, value);
	}


	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 2, $bill_dt);
	}

	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 2, $bill_dt, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 3, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 3, $bill_no, value);
	}


	/**
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public boolean invalid_flg() {
		return getConstBoolean(offset + 4, $invalid_flg);
	}

	/**
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public void invalid_flg(boolean value) {
		setConstBoolean(offset + 4, $invalid_flg, value);
	}


	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 5, $pre_bill_no);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 5, $pre_bill_no, value);
	}


	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 6, $pre_bill_dt);
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 6, $pre_bill_dt, value);
	}


	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return getConstDate(offset + 7, $bill_st_dt);
	}

	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		setConstDate(offset + 7, $bill_st_dt, value);
	}


	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return getConstDate(offset + 8, $bill_end_dt);
	}

	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		setConstDate(offset + 8, $bill_end_dt, value);
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 10, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 10, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 11, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 11, $wrk_nm, value);
	}


	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public String bill_src_cd() {
		return getConstString(offset + 12, $bill_src_cd);
	}

	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public void bill_src_cd(String value) {
		setConstString(offset + 12, $bill_src_cd, value);
	}


	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public String bill_src_nm() {
		return getConstString(offset + 13, $bill_src_nm);
	}

	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public void bill_src_nm(String value) {
		setConstString(offset + 13, $bill_src_nm, value);
	}


	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public String bill_src_ein() {
		return getConstString(offset + 14, $bill_src_ein);
	}

	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public void bill_src_ein(String value) {
		setConstString(offset + 14, $bill_src_ein, value);
	}


	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public String bill_src_biz_co_no() {
		return getConstString(offset + 15, $bill_src_biz_co_no);
	}

	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public void bill_src_biz_co_no(String value) {
		setConstString(offset + 15, $bill_src_biz_co_no, value);
	}


	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public String bill_src_zip_cd() {
		return getConstString(offset + 16, $bill_src_zip_cd);
	}

	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public void bill_src_zip_cd(String value) {
		setConstString(offset + 16, $bill_src_zip_cd, value);
	}


	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public String bill_src_addr1() {
		return getConstString(offset + 17, $bill_src_addr1);
	}

	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public void bill_src_addr1(String value) {
		setConstString(offset + 17, $bill_src_addr1, value);
	}


	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public String bill_src_addr2() {
		return getConstString(offset + 18, $bill_src_addr2);
	}

	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public void bill_src_addr2(String value) {
		setConstString(offset + 18, $bill_src_addr2, value);
	}


	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public String bill_src_addr3() {
		return getConstString(offset + 19, $bill_src_addr3);
	}

	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public void bill_src_addr3(String value) {
		setConstString(offset + 19, $bill_src_addr3, value);
	}


	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public String bill_src_addr4() {
		return getConstString(offset + 20, $bill_src_addr4);
	}

	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public void bill_src_addr4(String value) {
		setConstString(offset + 20, $bill_src_addr4, value);
	}


	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public String bill_src_dpt() {
		return getConstString(offset + 21, $bill_src_dpt);
	}

	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public void bill_src_dpt(String value) {
		setConstString(offset + 21, $bill_src_dpt, value);
	}


	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public String bill_src_tel() {
		return getConstString(offset + 22, $bill_src_tel);
	}

	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public void bill_src_tel(String value) {
		setConstString(offset + 22, $bill_src_tel, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR billGrp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 23, $billGrp_p);
	}
	
	public void billGrp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 23, $billGrp_p, row);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 24, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 24, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 25, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 25, $trd_cur_nm, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 26, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 26, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 27, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 27, $base_cur_nm, value);
	}


	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 28, $bill_xrate);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 28, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 28, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 28, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 28, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 28, $bill_xrate, value);
	}


	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 29, $last_bill_amt);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 29, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 29, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 29, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 29, $last_bill_amt, value);
	}

	/**
	 * Last billing amount 前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 29, $last_bill_amt, value);
	}


	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 30, $rcv_amt);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 30, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 30, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 30, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 30, $rcv_amt, value);
	}

	/**
	 * Payment amount 支払額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 30, $rcv_amt, value);
	}


	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 31, $sw_amt);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 31, $sw_amt, value);
	}


	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 32, $bfw_amt);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 32, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 32, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 32, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 32, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 32, $bfw_amt, value);
	}


	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 33, $sls_amt);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 33, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 33, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 33, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 33, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 33, $sls_amt, value);
	}


	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 34, $dscnt_amt);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 34, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 34, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 34, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 34, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 34, $dscnt_amt, value);
	}


	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 35, $ret_amt);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 35, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 35, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 35, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 35, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 35, $ret_amt, value);
	}


	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 36, $setoff_amt);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 36, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 36, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 36, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 36, $setoff_amt, value);
	}

	/**
	 * Current offset amount 今回相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 36, $setoff_amt, value);
	}


	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 37, $tax_amt);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 37, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 37, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 37, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 37, $tax_amt, value);
	}

	/**
	 * Current tax amount 今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 37, $tax_amt, value);
	}


	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 38, $sw_to_amt);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 38, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 38, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 38, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 38, $sw_to_amt, value);
	}

	/**
	 * Current transfer amount 今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 38, $sw_to_amt, value);
	}


	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 39, $bill_amt);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 39, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 39, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 39, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 39, $bill_amt, value);
	}

	/**
	 * Current billing amount 今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 39, $bill_amt, value);
	}


	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 40, $bank_ac_cd);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 40, $bank_ac_cd, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 41, $bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 41, $bank_ac_nm, value);
	}


	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 42, $bank_ac_no);
	}

	/**
	 * Bank account type 口座区分.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 42, $bank_ac_no, value);
	}


	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 43, $bank_ac_typ);
	}

	/**
	 * Bank account number 口座番号.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 43, $bank_ac_typ, value);
	}


	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 44, $bank_ac_holder);
	}

	/**
	 * Bank account holder 口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 44, $bank_ac_holder, value);
	}


	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return getConstString(offset + 45, $bank_ac_holder_sub);
	}

	/**
	 * Account holder alias name 口座名義別名.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		setConstString(offset + 45, $bank_ac_holder_sub, value);
	}


	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 46, $bank_cd);
	}

	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 46, $bank_cd, value);
	}


	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 47, $bank_nm);
	}

	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 47, $bank_nm, value);
	}


	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 48, $branch_cd);
	}

	/**
	 * Branch cd. 支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 48, $branch_cd, value);
	}


	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 49, $branch_nm);
	}

	/**
	 * Branch name 支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 49, $branch_nm, value);
	}


	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 50, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 50, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 50, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 50, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 50, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 50, $tax_rate1, value);
	}


	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 51, $tax_rate_sls_amt1);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 51, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 51, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 51, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 51, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 51, $tax_rate_sls_amt1, value);
	}


	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 52, $tax_rate_tax_amt1);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 52, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 52, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 52, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 52, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 52, $tax_rate_tax_amt1, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 53, $tax_rate_base_tax_amt1);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 53, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 53, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 53, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 53, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 53, $tax_rate_base_tax_amt1, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 54, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 54, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 54, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 54, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 54, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 54, $tax_rate2, value);
	}


	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 55, $tax_rate_sls_amt2);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt2, value);
	}


	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 56, $tax_rate_tax_amt2);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt2, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 57, $tax_rate_base_tax_amt2);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt2, value);
	}


	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 58, $tax_rate3);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 58, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 58, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 58, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 58, $tax_rate3, value);
	}


	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 59, $tax_rate_sls_amt3);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt3, value);
	}


	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 60, $tax_rate_tax_amt3);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt3, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 61, $tax_rate_base_tax_amt3);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt3, value);
	}


	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 62, $tax_rate4);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 62, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 62, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 62, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 62, $tax_rate4, value);
	}


	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 63, $tax_rate_sls_amt4);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt4, value);
	}


	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 64, $tax_rate_tax_amt4);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt4, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 65, $tax_rate_base_tax_amt4);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt4, value);
	}


	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 66, $tax_rate5);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 66, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 66, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 66, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 66, $tax_rate5, value);
	}


	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 67, $tax_rate_sls_amt5);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt5, value);
	}


	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 68, $tax_rate_tax_amt5);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt5, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 69, $tax_rate_base_tax_amt5);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt5, value);
	}


	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 70, $tax_rate6);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 70, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 70, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 70, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 70, $tax_rate6, value);
	}


	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 71, $tax_rate_sls_amt6);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt6, value);
	}


	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 72, $tax_rate_tax_amt6);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt6, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 73, $tax_rate_base_tax_amt6);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt6, value);
	}


	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 74, $tax_rate7);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 74, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 74, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 74, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 74, $tax_rate7, value);
	}


	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 75, $tax_rate_sls_amt7);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt7, value);
	}


	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 76, $tax_rate_tax_amt7);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt7, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 77, $tax_rate_base_tax_amt7);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt7, value);
	}


	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 78, $tax_rate8);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 78, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 78, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 78, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 78, $tax_rate8, value);
	}


	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 79, $tax_rate_sls_amt8);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt8, value);
	}


	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 80, $tax_rate_tax_amt8);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt8, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 81, $tax_rate_base_tax_amt8);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt8, value);
	}


	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 82, $tax_rate9);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 82, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 82, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 82, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 82, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 82, $tax_rate9, value);
	}


	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 83, $tax_rate_sls_amt9);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt9, value);
	}


	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 84, $tax_rate_tax_amt9);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt9, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 85, $tax_rate_base_tax_amt9);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt9, value);
	}


	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 86, $tax_rate10);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 86, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 86, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 86, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 86, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 86, $tax_rate10, value);
	}


	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 87, $tax_rate_sls_amt10);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt10, value);
	}


	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 88, $tax_rate_tax_amt10);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt10, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 89, $tax_rate_base_tax_amt10);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt10, value);
	}


	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 90, $adv_amt_bal);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 90, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 90, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 90, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 90, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 90, $adv_amt_bal, value);
	}


	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 91, $adv_amt);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 91, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 91, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 91, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 91, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 91, $adv_amt, value);
	}


	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 92, $adv_setoff_amt);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 92, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 92, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 92, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 92, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 92, $adv_setoff_amt, value);
	}


	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 93, $adv_setoff_tax_amt);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 93, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 93, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 93, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 93, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 93, $adv_setoff_tax_amt, value);
	}


	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return getConstDate(offset + 94, $pay_schd_dt1);
	}

	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		setConstDate(offset + 94, $pay_schd_dt1, value);
	}


	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return getConstNumber(offset + 95, $pay_schd_amt1);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		setConstNumber(offset + 95, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		setConstNumber(offset + 95, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		setConstNumber(offset + 95, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		setConstNumber(offset + 95, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		setConstNumber(offset + 95, $pay_schd_amt1, value);
	}


	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public String pay_mtd_cd1() {
		return getConstString(offset + 96, $pay_mtd_cd1);
	}

	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public void pay_mtd_cd1(String value) {
		setConstString(offset + 96, $pay_mtd_cd1, value);
	}


	/**
	 * Payment method name 1 支払方法名１.<p>
	 *
	 */
	public String pay_mtd_nm1() {
		return getConstString(offset + 97, $pay_mtd_nm1);
	}

	/**
	 * Payment method name 1 支払方法名１.<p>
	 *
	 */
	public void pay_mtd_nm1(String value) {
		setConstString(offset + 97, $pay_mtd_nm1, value);
	}


	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return getConstDate(offset + 98, $pay_schd_dt2);
	}

	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		setConstDate(offset + 98, $pay_schd_dt2, value);
	}


	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return getConstNumber(offset + 99, $pay_schd_amt2);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		setConstNumber(offset + 99, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		setConstNumber(offset + 99, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		setConstNumber(offset + 99, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		setConstNumber(offset + 99, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		setConstNumber(offset + 99, $pay_schd_amt2, value);
	}


	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public String pay_mtd_cd2() {
		return getConstString(offset + 100, $pay_mtd_cd2);
	}

	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public void pay_mtd_cd2(String value) {
		setConstString(offset + 100, $pay_mtd_cd2, value);
	}


	/**
	 * Payment method name 2 支払方法名２.<p>
	 *
	 */
	public String pay_mtd_nm2() {
		return getConstString(offset + 101, $pay_mtd_nm2);
	}

	/**
	 * Payment method name 2 支払方法名２.<p>
	 *
	 */
	public void pay_mtd_nm2(String value) {
		setConstString(offset + 101, $pay_mtd_nm2, value);
	}


	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return getConstDate(offset + 102, $pay_schd_dt3);
	}

	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		setConstDate(offset + 102, $pay_schd_dt3, value);
	}


	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return getConstNumber(offset + 103, $pay_schd_amt3);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		setConstNumber(offset + 103, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		setConstNumber(offset + 103, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		setConstNumber(offset + 103, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		setConstNumber(offset + 103, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		setConstNumber(offset + 103, $pay_schd_amt3, value);
	}


	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public String pay_mtd_cd3() {
		return getConstString(offset + 104, $pay_mtd_cd3);
	}

	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public void pay_mtd_cd3(String value) {
		setConstString(offset + 104, $pay_mtd_cd3, value);
	}


	/**
	 * Payment method name 3 支払方法名３.<p>
	 *
	 */
	public String pay_mtd_nm3() {
		return getConstString(offset + 105, $pay_mtd_nm3);
	}

	/**
	 * Payment method name 3 支払方法名３.<p>
	 *
	 */
	public void pay_mtd_nm3(String value) {
		setConstString(offset + 105, $pay_mtd_nm3, value);
	}


	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return getConstDate(offset + 106, $pay_schd_dt4);
	}

	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		setConstDate(offset + 106, $pay_schd_dt4, value);
	}


	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return getConstNumber(offset + 107, $pay_schd_amt4);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}


	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public String pay_mtd_cd4() {
		return getConstString(offset + 108, $pay_mtd_cd4);
	}

	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public void pay_mtd_cd4(String value) {
		setConstString(offset + 108, $pay_mtd_cd4, value);
	}


	/**
	 * Payment method name 4 支払方法名４.<p>
	 *
	 */
	public String pay_mtd_nm4() {
		return getConstString(offset + 109, $pay_mtd_nm4);
	}

	/**
	 * Payment method name 4 支払方法名４.<p>
	 *
	 */
	public void pay_mtd_nm4(String value) {
		setConstString(offset + 109, $pay_mtd_nm4, value);
	}


	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return getConstDate(offset + 110, $pay_schd_dt5);
	}

	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		setConstDate(offset + 110, $pay_schd_dt5, value);
	}


	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return getConstNumber(offset + 111, $pay_schd_amt5);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		setConstNumber(offset + 111, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		setConstNumber(offset + 111, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		setConstNumber(offset + 111, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		setConstNumber(offset + 111, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		setConstNumber(offset + 111, $pay_schd_amt5, value);
	}


	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public String pay_mtd_cd5() {
		return getConstString(offset + 112, $pay_mtd_cd5);
	}

	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public void pay_mtd_cd5(String value) {
		setConstString(offset + 112, $pay_mtd_cd5, value);
	}


	/**
	 * Payment method name 5 支払方法名５.<p>
	 *
	 */
	public String pay_mtd_nm5() {
		return getConstString(offset + 113, $pay_mtd_nm5);
	}

	/**
	 * Payment method name 5 支払方法名５.<p>
	 *
	 */
	public void pay_mtd_nm5(String value) {
		setConstString(offset + 113, $pay_mtd_nm5, value);
	}


	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public MCDate pay_schd_dt6() {
		return getConstDate(offset + 114, $pay_schd_dt6);
	}

	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public void pay_schd_dt6(MCDate value) {
		setConstDate(offset + 114, $pay_schd_dt6, value);
	}


	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public MCNumber pay_schd_amt6() {
		return getConstNumber(offset + 115, $pay_schd_amt6);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(MCNumber value) {
		setConstNumber(offset + 115, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(int value) {
		setConstNumber(offset + 115, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(long value) {
		setConstNumber(offset + 115, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(float value) {
		setConstNumber(offset + 115, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(double value) {
		setConstNumber(offset + 115, $pay_schd_amt6, value);
	}


	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public String pay_mtd_cd6() {
		return getConstString(offset + 116, $pay_mtd_cd6);
	}

	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public void pay_mtd_cd6(String value) {
		setConstString(offset + 116, $pay_mtd_cd6, value);
	}


	/**
	 * Payment method name 6 支払方法名６.<p>
	 *
	 */
	public String pay_mtd_nm6() {
		return getConstString(offset + 117, $pay_mtd_nm6);
	}

	/**
	 * Payment method name 6 支払方法名６.<p>
	 *
	 */
	public void pay_mtd_nm6(String value) {
		setConstString(offset + 117, $pay_mtd_nm6, value);
	}


	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public MCDate pay_schd_dt7() {
		return getConstDate(offset + 118, $pay_schd_dt7);
	}

	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public void pay_schd_dt7(MCDate value) {
		setConstDate(offset + 118, $pay_schd_dt7, value);
	}


	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public MCNumber pay_schd_amt7() {
		return getConstNumber(offset + 119, $pay_schd_amt7);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(MCNumber value) {
		setConstNumber(offset + 119, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(int value) {
		setConstNumber(offset + 119, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(long value) {
		setConstNumber(offset + 119, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(float value) {
		setConstNumber(offset + 119, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(double value) {
		setConstNumber(offset + 119, $pay_schd_amt7, value);
	}


	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public String pay_mtd_cd7() {
		return getConstString(offset + 120, $pay_mtd_cd7);
	}

	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public void pay_mtd_cd7(String value) {
		setConstString(offset + 120, $pay_mtd_cd7, value);
	}


	/**
	 * Payment method name 7 支払方法名７.<p>
	 *
	 */
	public String pay_mtd_nm7() {
		return getConstString(offset + 121, $pay_mtd_nm7);
	}

	/**
	 * Payment method name 7 支払方法名７.<p>
	 *
	 */
	public void pay_mtd_nm7(String value) {
		setConstString(offset + 121, $pay_mtd_nm7, value);
	}


	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public MCDate pay_schd_dt8() {
		return getConstDate(offset + 122, $pay_schd_dt8);
	}

	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public void pay_schd_dt8(MCDate value) {
		setConstDate(offset + 122, $pay_schd_dt8, value);
	}


	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public MCNumber pay_schd_amt8() {
		return getConstNumber(offset + 123, $pay_schd_amt8);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(MCNumber value) {
		setConstNumber(offset + 123, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(int value) {
		setConstNumber(offset + 123, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(long value) {
		setConstNumber(offset + 123, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(float value) {
		setConstNumber(offset + 123, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(double value) {
		setConstNumber(offset + 123, $pay_schd_amt8, value);
	}


	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public String pay_mtd_cd8() {
		return getConstString(offset + 124, $pay_mtd_cd8);
	}

	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public void pay_mtd_cd8(String value) {
		setConstString(offset + 124, $pay_mtd_cd8, value);
	}


	/**
	 * Payment method name 8 支払方法名８.<p>
	 *
	 */
	public String pay_mtd_nm8() {
		return getConstString(offset + 125, $pay_mtd_nm8);
	}

	/**
	 * Payment method name 8 支払方法名８.<p>
	 *
	 */
	public void pay_mtd_nm8(String value) {
		setConstString(offset + 125, $pay_mtd_nm8, value);
	}


	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public MCDate pay_schd_dt9() {
		return getConstDate(offset + 126, $pay_schd_dt9);
	}

	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public void pay_schd_dt9(MCDate value) {
		setConstDate(offset + 126, $pay_schd_dt9, value);
	}


	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public MCNumber pay_schd_amt9() {
		return getConstNumber(offset + 127, $pay_schd_amt9);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(MCNumber value) {
		setConstNumber(offset + 127, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(int value) {
		setConstNumber(offset + 127, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(long value) {
		setConstNumber(offset + 127, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(float value) {
		setConstNumber(offset + 127, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(double value) {
		setConstNumber(offset + 127, $pay_schd_amt9, value);
	}


	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public String pay_mtd_cd9() {
		return getConstString(offset + 128, $pay_mtd_cd9);
	}

	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public void pay_mtd_cd9(String value) {
		setConstString(offset + 128, $pay_mtd_cd9, value);
	}


	/**
	 * Payment method name 9 支払方法名９.<p>
	 *
	 */
	public String pay_mtd_nm9() {
		return getConstString(offset + 129, $pay_mtd_nm9);
	}

	/**
	 * Payment method name 9 支払方法名９.<p>
	 *
	 */
	public void pay_mtd_nm9(String value) {
		setConstString(offset + 129, $pay_mtd_nm9, value);
	}


	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public MCDate pay_schd_dt10() {
		return getConstDate(offset + 130, $pay_schd_dt10);
	}

	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public void pay_schd_dt10(MCDate value) {
		setConstDate(offset + 130, $pay_schd_dt10, value);
	}


	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public MCNumber pay_schd_amt10() {
		return getConstNumber(offset + 131, $pay_schd_amt10);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(MCNumber value) {
		setConstNumber(offset + 131, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(int value) {
		setConstNumber(offset + 131, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(long value) {
		setConstNumber(offset + 131, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(float value) {
		setConstNumber(offset + 131, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(double value) {
		setConstNumber(offset + 131, $pay_schd_amt10, value);
	}


	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public String pay_mtd_cd10() {
		return getConstString(offset + 132, $pay_mtd_cd10);
	}

	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public void pay_mtd_cd10(String value) {
		setConstString(offset + 132, $pay_mtd_cd10, value);
	}


	/**
	 * Payment method name 10 支払方法名１０.<p>
	 *
	 */
	public String pay_mtd_nm10() {
		return getConstString(offset + 133, $pay_mtd_nm10);
	}

	/**
	 * Payment method name 10 支払方法名１０.<p>
	 *
	 */
	public void pay_mtd_nm10(String value) {
		setConstString(offset + 133, $pay_mtd_nm10, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 134, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 134, $bill_bcst_nm, value);
	}


	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public String bill_ein() {
		return getConstString(offset + 135, $bill_ein);
	}

	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public void bill_ein(String value) {
		setConstString(offset + 135, $bill_ein, value);
	}


	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public String bill_biz_co_no() {
		return getConstString(offset + 136, $bill_biz_co_no);
	}

	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public void bill_biz_co_no(String value) {
		setConstString(offset + 136, $bill_biz_co_no, value);
	}


	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 137, $bill_zip_cd);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 137, $bill_zip_cd, value);
	}


	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 138, $bill_addr1);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 138, $bill_addr1, value);
	}


	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 139, $bill_addr2);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 139, $bill_addr2, value);
	}


	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 140, $bill_addr3);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 140, $bill_addr3, value);
	}


	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 141, $bill_addr4);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 141, $bill_addr4, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 142, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 142, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 143, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 143, $bill_tel, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 144, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 144, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 145, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 145, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 146, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 146, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 147, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 147, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 148, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 148, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 149, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 149, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 150, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 150, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 151, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 151, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 152, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 152, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 153, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 153, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 154, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 154, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			return bill_src_ein();
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			return bill_src_biz_co_no();
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			return bill_src_zip_cd();
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			return bill_src_addr1();
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			return bill_src_addr2();
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			return bill_src_addr3();
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			return bill_src_addr4();
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			return bill_src_dpt();
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			return bill_src_tel();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			return pay_mtd_nm1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			return pay_mtd_nm2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			return pay_mtd_nm3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			return pay_mtd_nm4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			return pay_mtd_nm5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			return pay_mtd_nm6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			return pay_mtd_nm7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			return pay_mtd_nm8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			return pay_mtd_nm9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			return pay_mtd_nm10();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			return bill_ein();
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			return bill_biz_co_no();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			return pay_schd_amt1();
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			return pay_schd_amt2();
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			return pay_schd_amt3();
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			return pay_schd_amt4();
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			return pay_schd_amt5();
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			return pay_schd_amt6();
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			return pay_schd_amt7();
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			return pay_schd_amt8();
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			return pay_schd_amt9();
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			return pay_schd_amt10();
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
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			return pay_schd_dt1();
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			return pay_schd_dt2();
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			return pay_schd_dt3();
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			return pay_schd_dt4();
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			return pay_schd_dt5();
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			return pay_schd_dt6();
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			return pay_schd_dt7();
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			return pay_schd_dt8();
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			return pay_schd_dt9();
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			return pay_schd_dt10();
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			return invalid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			return bill_src_ein();
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			return bill_src_biz_co_no();
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			return bill_src_zip_cd();
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			return bill_src_addr1();
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			return bill_src_addr2();
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			return bill_src_addr3();
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			return bill_src_addr4();
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			return bill_src_dpt();
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			return bill_src_tel();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			return pay_mtd_nm1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			return pay_mtd_nm2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			return pay_mtd_nm3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			return pay_mtd_nm4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			return pay_mtd_nm5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			return pay_mtd_nm6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			return pay_mtd_nm7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			return pay_mtd_nm8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			return pay_mtd_nm9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			return pay_mtd_nm10();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			return bill_ein();
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			return bill_biz_co_no();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			return pay_schd_amt1();
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			return pay_schd_amt2();
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			return pay_schd_amt3();
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			return pay_schd_amt4();
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			return pay_schd_amt5();
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			return pay_schd_amt6();
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			return pay_schd_amt7();
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			return pay_schd_amt8();
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			return pay_schd_amt9();
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			return pay_schd_amt10();
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
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			return pay_schd_dt1();
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			return pay_schd_dt2();
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			return pay_schd_dt3();
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			return pay_schd_dt4();
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			return pay_schd_dt5();
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			return pay_schd_dt6();
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			return pay_schd_dt7();
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			return pay_schd_dt8();
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			return pay_schd_dt9();
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			return pay_schd_dt10();
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			return invalid_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			bill_src_ein(value);
			return;
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			bill_src_biz_co_no(value);
			return;
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			bill_src_zip_cd(value);
			return;
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			bill_src_addr1(value);
			return;
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			bill_src_addr2(value);
			return;
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			bill_src_addr3(value);
			return;
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			bill_src_addr4(value);
			return;
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			bill_src_dpt(value);
			return;
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			bill_src_tel(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			pay_mtd_nm10(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			bill_ein(value);
			return;
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			bill_biz_co_no(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			pay_schd_dt1(value);
			return;
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			pay_schd_dt2(value);
			return;
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			pay_schd_dt3(value);
			return;
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			pay_schd_dt4(value);
			return;
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			pay_schd_dt5(value);
			return;
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			pay_schd_dt6(value);
			return;
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			pay_schd_dt7(value);
			return;
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			pay_schd_dt8(value);
			return;
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			pay_schd_dt9(value);
			return;
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			pay_schd_dt10(value);
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			invalid_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			bill_src_ein(value);
			return;
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			bill_src_biz_co_no(value);
			return;
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			bill_src_zip_cd(value);
			return;
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			bill_src_addr1(value);
			return;
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			bill_src_addr2(value);
			return;
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			bill_src_addr3(value);
			return;
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			bill_src_addr4(value);
			return;
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			bill_src_dpt(value);
			return;
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			bill_src_tel(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			pay_mtd_nm10(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			bill_ein(value);
			return;
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			bill_biz_co_no(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
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
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			pay_schd_dt1(value);
			return;
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			pay_schd_dt2(value);
			return;
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			pay_schd_dt3(value);
			return;
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			pay_schd_dt4(value);
			return;
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			pay_schd_dt5(value);
			return;
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			pay_schd_dt6(value);
			return;
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			pay_schd_dt7(value);
			return;
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			pay_schd_dt8(value);
			return;
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			pay_schd_dt9(value);
			return;
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			pay_schd_dt10(value);
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			invalid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($billGrp_p.equalsIgnoreCase(name)) {
			return billGrp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($billGrp_p.equalsIgnoreCase(name)) {
			billGrp_p(
				((MCContainerMeta) billGrp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return billGrp_p().bp_grp_cd1();
	}

	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		billGrp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return billGrp_p().bp_grp_nm1();
	}

	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		billGrp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return billGrp_p().bp_grp_cd2();
	}

	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		billGrp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return billGrp_p().bp_grp_nm2();
	}

	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		billGrp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return billGrp_p().bp_grp_cd3();
	}

	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		billGrp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return billGrp_p().bp_grp_nm3();
	}

	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		billGrp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return billGrp_p().bp_grp_cd4();
	}

	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		billGrp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return billGrp_p().bp_grp_nm4();
	}

	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		billGrp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return billGrp_p().bp_grp_cd5();
	}

	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		billGrp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return billGrp_p().bp_grp_nm5();
	}

	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		billGrp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return billGrp_p().bp_grp_cd6();
	}

	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		billGrp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return billGrp_p().bp_grp_nm6();
	}

	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		billGrp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return billGrp_p().bp_grp_cd7();
	}

	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		billGrp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return billGrp_p().bp_grp_nm7();
	}

	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		billGrp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return billGrp_p().bp_grp_cd8();
	}

	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		billGrp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return billGrp_p().bp_grp_nm8();
	}

	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		billGrp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return billGrp_p().bp_grp_cd9();
	}

	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		billGrp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return billGrp_p().bp_grp_nm9();
	}

	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		billGrp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return billGrp_p().bp_grp_cd10();
	}

	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		billGrp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return billGrp_p().bp_grp_nm10();
	}

	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		billGrp_p().bp_grp_nm10(value);
	}

}

