package mcframe.serverMSBH.MSBHL5140;

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
 * ブロック"Chk01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_HdrR_MC_A extends MCConstRow {

	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public static final String $bill_rcpt_no = "bill_rcpt_no";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Invalid flg. 無効ＦＬＧ.<p>
	 *
	 */
	public static final String $invalid_flg = "invalid_flg";
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
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
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
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
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
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta bill_rcpt_no_META = createCommonMeta($bill_rcpt_no, mcframe.commonMA.meta.MA_META.BILL_RCPT_NO);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta invalid_flg_META = createCommonMeta($invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_src_cd_META = createCommonMeta($bill_src_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_src_ein_META = createCommonMeta($bill_src_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_src_biz_co_no_META = createCommonMeta($bill_src_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_src_zip_cd_META = createCommonMeta($bill_src_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_src_addr1_META = createCommonMeta($bill_src_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr2_META = createCommonMeta($bill_src_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr3_META = createCommonMeta($bill_src_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr4_META = createCommonMeta($bill_src_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_dpt_META = createCommonMeta($bill_src_dpt, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_src_tel_META = createCommonMeta($bill_src_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
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
	public static final MCMeta pay_schd_dt1_META = createCommonMeta($pay_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt1_META = createCommonMeta($pay_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd1_META = createCommonMeta($pay_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt2_META = createCommonMeta($pay_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt2_META = createCommonMeta($pay_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd2_META = createCommonMeta($pay_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt3_META = createCommonMeta($pay_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt3_META = createCommonMeta($pay_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd3_META = createCommonMeta($pay_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt4_META = createCommonMeta($pay_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt4_META = createCommonMeta($pay_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd4_META = createCommonMeta($pay_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt5_META = createCommonMeta($pay_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt5_META = createCommonMeta($pay_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd5_META = createCommonMeta($pay_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt6_META = createCommonMeta($pay_schd_dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt6_META = createCommonMeta($pay_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd6_META = createCommonMeta($pay_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt7_META = createCommonMeta($pay_schd_dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt7_META = createCommonMeta($pay_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd7_META = createCommonMeta($pay_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt8_META = createCommonMeta($pay_schd_dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt8_META = createCommonMeta($pay_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd8_META = createCommonMeta($pay_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt9_META = createCommonMeta($pay_schd_dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt9_META = createCommonMeta($pay_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd9_META = createCommonMeta($pay_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt10_META = createCommonMeta($pay_schd_dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt10_META = createCommonMeta($pay_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd10_META = createCommonMeta($pay_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
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
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_HdrR> constMetas = new ConstMetaList<Chk01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_rcpt_no_META,
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			invalid_flg_META,
			bill_cl_dt_META,
			bill_dt_META,
			bill_no_META,
			pre_bill_no_META,
			pre_bill_dt_META,
			bill_st_dt_META,
			bill_end_dt_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			bill_src_cd_META,
			bill_src_ein_META,
			bill_src_biz_co_no_META,
			bill_src_zip_cd_META,
			bill_src_addr1_META,
			bill_src_addr2_META,
			bill_src_addr3_META,
			bill_src_addr4_META,
			bill_src_dpt_META,
			bill_src_tel_META,
			trd_cur_cd_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
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
			pay_schd_dt1_META,
			pay_schd_amt1_META,
			pay_mtd_cd1_META,
			pay_schd_dt2_META,
			pay_schd_amt2_META,
			pay_mtd_cd2_META,
			pay_schd_dt3_META,
			pay_schd_amt3_META,
			pay_mtd_cd3_META,
			pay_schd_dt4_META,
			pay_schd_amt4_META,
			pay_mtd_cd4_META,
			pay_schd_dt5_META,
			pay_schd_amt5_META,
			pay_mtd_cd5_META,
			pay_schd_dt6_META,
			pay_schd_amt6_META,
			pay_mtd_cd6_META,
			pay_schd_dt7_META,
			pay_schd_amt7_META,
			pay_mtd_cd7_META,
			pay_schd_dt8_META,
			pay_schd_amt8_META,
			pay_mtd_cd8_META,
			pay_schd_dt9_META,
			pay_schd_amt9_META,
			pay_mtd_cd9_META,
			pay_schd_dt10_META,
			pay_schd_amt10_META,
			pay_mtd_cd10_META,
			bank_ac_cd_META,
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
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$invalid_flg, "E"},	// invalid_flg
				{$bill_no, "E"},	// bill_no
				{$bill_src_cd, "E"},	// bill_src_cd
				{$trd_cur_cd, "E"},	// trd_cur_cd
				{$last_bill_amt, "E"},	// last_bill_amt
				{$rcv_amt, "E"},	// rcv_amt
				{$sw_amt, "E"},	// sw_amt
				{$setoff_amt, "E"},	// setoff_amt
				{$bfw_amt, "E"},	// bfw_amt
				{$sls_amt, "E"},	// sls_amt
				{$dscnt_amt, "E"},	// dscnt_amt
				{$ret_amt, "E"},	// ret_amt
				{$tax_amt, "E"},	// tax_amt
				{$sw_to_amt, "E"},	// sw_to_amt
				{$bill_amt, "E"},	// bill_amt
				{$adv_amt_bal, "E"},	// adv_amt_bal
				{$adv_amt, "E"},	// adv_amt
				{$adv_setoff_amt, "E"},	// adv_setoff_amt
				{$adv_setoff_tax_amt, "E"}	// adv_setoff_tax_amt
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
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bill_src_cd, "MA.MAUAL0010.Bp"},	// bill_src_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$pay_mtd_cd1, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd1
				{$pay_mtd_cd2, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd2
				{$pay_mtd_cd3, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd3
				{$pay_mtd_cd4, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd4
				{$pay_mtd_cd5, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd5
				{$pay_mtd_cd6, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd6
				{$pay_mtd_cd7, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd7
				{$pay_mtd_cd8, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd8
				{$pay_mtd_cd9, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd9
				{$pay_mtd_cd10, "MA.MAUAL0010.ApSttl"},	// pay_mtd_cd10
				{$bank_ac_cd, "MA.MAUAL0010.ExtBankAc"}	// bank_ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cur_cd, "trd_cur_upri_dec_place;trd_cur_amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$trd_cur_cd, "upri_dec_place;amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bill_src_cd, "MAC_BP_IS_SRCH_TYP.BSPPL"}	// bill_src_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bill_src_cd, "bp_is_srch_typ"}	// bill_src_cd
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
	protected Chk01_HdrR_MC_A(ConstMetaList<? extends Chk01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR clone() {
		return (Chk01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR createInstance() {
		return (Chk01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_HdrR getValues(String... names) {
		return (Chk01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
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
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 5, $bill_cl_dt);
	}

	/**
	 * Billing closing day 請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 5, $bill_cl_dt, value);
	}


	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 6, $bill_dt);
	}

	/**
	 * Billing date 請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 6, $bill_dt, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 7, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 7, $bill_no, value);
	}


	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 8, $pre_bill_no);
	}

	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 8, $pre_bill_no, value);
	}


	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 9, $pre_bill_dt);
	}

	/**
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 9, $pre_bill_dt, value);
	}


	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return getConstDate(offset + 10, $bill_st_dt);
	}

	/**
	 * Billing period start date 請求期間開始日.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		setConstDate(offset + 10, $bill_st_dt, value);
	}


	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return getConstDate(offset + 11, $bill_end_dt);
	}

	/**
	 * Billing period end date 請求期間終了日.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		setConstDate(offset + 11, $bill_end_dt, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 12, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 12, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 13, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 13, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 14, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 14, $wrk_nm, value);
	}


	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public String bill_src_cd() {
		return getConstString(offset + 15, $bill_src_cd);
	}

	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public void bill_src_cd(String value) {
		setConstString(offset + 15, $bill_src_cd, value);
	}


	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public String bill_src_ein() {
		return getConstString(offset + 16, $bill_src_ein);
	}

	/**
	 * Billing source corporation No. 請求元法人番号.<p>
	 *
	 */
	public void bill_src_ein(String value) {
		setConstString(offset + 16, $bill_src_ein, value);
	}


	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public String bill_src_biz_co_no() {
		return getConstString(offset + 17, $bill_src_biz_co_no);
	}

	/**
	 * Billing source business No. 請求元事業者ＮＯ.<p>
	 *
	 */
	public void bill_src_biz_co_no(String value) {
		setConstString(offset + 17, $bill_src_biz_co_no, value);
	}


	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public String bill_src_zip_cd() {
		return getConstString(offset + 18, $bill_src_zip_cd);
	}

	/**
	 * Billing source zip code 請求元郵便番号.<p>
	 *
	 */
	public void bill_src_zip_cd(String value) {
		setConstString(offset + 18, $bill_src_zip_cd, value);
	}


	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public String bill_src_addr1() {
		return getConstString(offset + 19, $bill_src_addr1);
	}

	/**
	 * Billing source address 1 請求元住所１.<p>
	 *
	 */
	public void bill_src_addr1(String value) {
		setConstString(offset + 19, $bill_src_addr1, value);
	}


	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public String bill_src_addr2() {
		return getConstString(offset + 20, $bill_src_addr2);
	}

	/**
	 * Billing source address 2 請求元住所２.<p>
	 *
	 */
	public void bill_src_addr2(String value) {
		setConstString(offset + 20, $bill_src_addr2, value);
	}


	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public String bill_src_addr3() {
		return getConstString(offset + 21, $bill_src_addr3);
	}

	/**
	 * Billing source address 3 請求元住所３.<p>
	 *
	 */
	public void bill_src_addr3(String value) {
		setConstString(offset + 21, $bill_src_addr3, value);
	}


	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public String bill_src_addr4() {
		return getConstString(offset + 22, $bill_src_addr4);
	}

	/**
	 * Billing source address 4 請求元住所４.<p>
	 *
	 */
	public void bill_src_addr4(String value) {
		setConstString(offset + 22, $bill_src_addr4, value);
	}


	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public String bill_src_dpt() {
		return getConstString(offset + 23, $bill_src_dpt);
	}

	/**
	 * Billing source dept. 請求元部門.<p>
	 *
	 */
	public void bill_src_dpt(String value) {
		setConstString(offset + 23, $bill_src_dpt, value);
	}


	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public String bill_src_tel() {
		return getConstString(offset + 24, $bill_src_tel);
	}

	/**
	 * Billing source TEL 請求元ＴＥＬ.<p>
	 *
	 */
	public void bill_src_tel(String value) {
		setConstString(offset + 24, $bill_src_tel, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 25, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 25, $trd_cur_cd, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 26, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 26, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 26, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 26, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 26, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 27, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 27, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 27, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 27, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 27, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 27, $trd_cur_amt_dec_place, value);
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
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 32, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 32, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 32, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 32, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 32, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 32, $setoff_amt, value);
	}


	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 33, $bfw_amt);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 33, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 33, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 33, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 33, $bfw_amt, value);
	}

	/**
	 * Variance carry-over amount 差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 33, $bfw_amt, value);
	}


	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 34, $sls_amt);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 34, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 34, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 34, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 34, $sls_amt, value);
	}

	/**
	 * Current payment amount 今回買上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 34, $sls_amt, value);
	}


	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 35, $dscnt_amt);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 35, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 35, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 35, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 35, $dscnt_amt, value);
	}

	/**
	 * Current discount amount 今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 35, $dscnt_amt, value);
	}


	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 36, $ret_amt);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 36, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 36, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 36, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 36, $ret_amt, value);
	}

	/**
	 * Current return amount 今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 36, $ret_amt, value);
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
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 40, $tax_rate1);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 40, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 40, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 40, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 40, $tax_rate1, value);
	}

	/**
	 * Tax rate 1 税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 40, $tax_rate1, value);
	}


	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 41, $tax_rate_sls_amt1);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 41, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 41, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 41, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 41, $tax_rate_sls_amt1, value);
	}

	/**
	 * Purchase amount 1 per tax rate 税率毎買上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 41, $tax_rate_sls_amt1, value);
	}


	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 42, $tax_rate_tax_amt1);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 42, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 42, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 42, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 42, $tax_rate_tax_amt1, value);
	}

	/**
	 * Tax amount per tax rate 1 税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 42, $tax_rate_tax_amt1, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 43, $tax_rate_base_tax_amt1);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 43, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 43, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 43, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 43, $tax_rate_base_tax_amt1, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 1 税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 43, $tax_rate_base_tax_amt1, value);
	}


	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 44, $tax_rate2);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 44, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 44, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 44, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 44, $tax_rate2, value);
	}

	/**
	 * Tax rate 2 税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 44, $tax_rate2, value);
	}


	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 45, $tax_rate_sls_amt2);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 45, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 45, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 45, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 45, $tax_rate_sls_amt2, value);
	}

	/**
	 * Purchase amount 2 per tax rate 税率毎買上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 45, $tax_rate_sls_amt2, value);
	}


	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 46, $tax_rate_tax_amt2);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 46, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 46, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 46, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 46, $tax_rate_tax_amt2, value);
	}

	/**
	 * Tax amount per tax rate 2 税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 46, $tax_rate_tax_amt2, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 47, $tax_rate_base_tax_amt2);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 47, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 47, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 47, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 47, $tax_rate_base_tax_amt2, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 2 税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 47, $tax_rate_base_tax_amt2, value);
	}


	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 48, $tax_rate3);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 48, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 48, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 48, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 48, $tax_rate3, value);
	}

	/**
	 * Tax rate 3 税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 48, $tax_rate3, value);
	}


	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 49, $tax_rate_sls_amt3);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 49, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 49, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 49, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 49, $tax_rate_sls_amt3, value);
	}

	/**
	 * Purchase amount 3 per tax rate 税率毎買上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 49, $tax_rate_sls_amt3, value);
	}


	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 50, $tax_rate_tax_amt3);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 50, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 50, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 50, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 50, $tax_rate_tax_amt3, value);
	}

	/**
	 * Tax amount per tax rate 3 税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 50, $tax_rate_tax_amt3, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 51, $tax_rate_base_tax_amt3);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 51, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 51, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 51, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 51, $tax_rate_base_tax_amt3, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 3 税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 51, $tax_rate_base_tax_amt3, value);
	}


	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 52, $tax_rate4);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 52, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 52, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 52, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 52, $tax_rate4, value);
	}

	/**
	 * Tax rate 4 税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 52, $tax_rate4, value);
	}


	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 53, $tax_rate_sls_amt4);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 53, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 53, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 53, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 53, $tax_rate_sls_amt4, value);
	}

	/**
	 * Purchase amount 4 per tax rate 税率毎買上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 53, $tax_rate_sls_amt4, value);
	}


	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 54, $tax_rate_tax_amt4);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 54, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 54, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 54, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 54, $tax_rate_tax_amt4, value);
	}

	/**
	 * Tax amount per tax rate 4 税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 54, $tax_rate_tax_amt4, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 55, $tax_rate_base_tax_amt4);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 55, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 55, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 55, $tax_rate_base_tax_amt4, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 4 税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 55, $tax_rate_base_tax_amt4, value);
	}


	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 56, $tax_rate5);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 56, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 56, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 56, $tax_rate5, value);
	}

	/**
	 * Tax rate 5 税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 56, $tax_rate5, value);
	}


	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 57, $tax_rate_sls_amt5);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 57, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 57, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 57, $tax_rate_sls_amt5, value);
	}

	/**
	 * Purchase amount 5 per tax rate 税率毎買上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 57, $tax_rate_sls_amt5, value);
	}


	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 58, $tax_rate_tax_amt5);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 58, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 58, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 58, $tax_rate_tax_amt5, value);
	}

	/**
	 * Tax amount per tax rate 5 税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 58, $tax_rate_tax_amt5, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 59, $tax_rate_base_tax_amt5);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 59, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 59, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 59, $tax_rate_base_tax_amt5, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 5 税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 59, $tax_rate_base_tax_amt5, value);
	}


	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 60, $tax_rate6);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 60, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 60, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 60, $tax_rate6, value);
	}

	/**
	 * Tax rate 6 税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 60, $tax_rate6, value);
	}


	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 61, $tax_rate_sls_amt6);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 61, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 61, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 61, $tax_rate_sls_amt6, value);
	}

	/**
	 * Purchase amount 6 per tax rate 税率毎買上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 61, $tax_rate_sls_amt6, value);
	}


	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 62, $tax_rate_tax_amt6);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 62, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 62, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 62, $tax_rate_tax_amt6, value);
	}

	/**
	 * Tax amount per tax rate 6 税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 62, $tax_rate_tax_amt6, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 63, $tax_rate_base_tax_amt6);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 63, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 63, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 63, $tax_rate_base_tax_amt6, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 6 税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 63, $tax_rate_base_tax_amt6, value);
	}


	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 64, $tax_rate7);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 64, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 64, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 64, $tax_rate7, value);
	}

	/**
	 * Tax rate 7 税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 64, $tax_rate7, value);
	}


	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 65, $tax_rate_sls_amt7);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 65, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 65, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 65, $tax_rate_sls_amt7, value);
	}

	/**
	 * Purchase amount 7 per tax rate 税率毎買上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 65, $tax_rate_sls_amt7, value);
	}


	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 66, $tax_rate_tax_amt7);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 66, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 66, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 66, $tax_rate_tax_amt7, value);
	}

	/**
	 * Tax amount per tax rate 7 税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 66, $tax_rate_tax_amt7, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 67, $tax_rate_base_tax_amt7);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 67, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 67, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 67, $tax_rate_base_tax_amt7, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 7 税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 67, $tax_rate_base_tax_amt7, value);
	}


	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 68, $tax_rate8);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 68, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 68, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 68, $tax_rate8, value);
	}

	/**
	 * Tax rate 8 税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 68, $tax_rate8, value);
	}


	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 69, $tax_rate_sls_amt8);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 69, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 69, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 69, $tax_rate_sls_amt8, value);
	}

	/**
	 * Purchase amount 8 per tax rate 税率毎買上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 69, $tax_rate_sls_amt8, value);
	}


	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 70, $tax_rate_tax_amt8);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 70, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 70, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 70, $tax_rate_tax_amt8, value);
	}

	/**
	 * Tax amount per tax rate 8 税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 70, $tax_rate_tax_amt8, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 71, $tax_rate_base_tax_amt8);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 71, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 71, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 71, $tax_rate_base_tax_amt8, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 8 税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 71, $tax_rate_base_tax_amt8, value);
	}


	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 72, $tax_rate9);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 72, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 72, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 72, $tax_rate9, value);
	}

	/**
	 * Tax rate 9 税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 72, $tax_rate9, value);
	}


	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 73, $tax_rate_sls_amt9);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 73, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 73, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 73, $tax_rate_sls_amt9, value);
	}

	/**
	 * Purchase amount 9 per tax rate 税率毎買上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 73, $tax_rate_sls_amt9, value);
	}


	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 74, $tax_rate_tax_amt9);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 74, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 74, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 74, $tax_rate_tax_amt9, value);
	}

	/**
	 * Tax amount per tax rate 9 税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 74, $tax_rate_tax_amt9, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 75, $tax_rate_base_tax_amt9);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt9, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 9 税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt9, value);
	}


	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 76, $tax_rate10);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 76, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 76, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 76, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 76, $tax_rate10, value);
	}

	/**
	 * Tax rate 10 税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 76, $tax_rate10, value);
	}


	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 77, $tax_rate_sls_amt10);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 77, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 77, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 77, $tax_rate_sls_amt10, value);
	}

	/**
	 * Purchase amount 10 per tax rate 税率毎買上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 77, $tax_rate_sls_amt10, value);
	}


	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 78, $tax_rate_tax_amt10);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 78, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 78, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 78, $tax_rate_tax_amt10, value);
	}

	/**
	 * Tax amount per tax rate 10 税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 78, $tax_rate_tax_amt10, value);
	}


	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 79, $tax_rate_base_tax_amt10);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt10, value);
	}

	/**
	 * Tax amount (Base currency) per tax rate 10 税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt10, value);
	}


	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 80, $adv_amt_bal);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 80, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 80, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 80, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 80, $adv_amt_bal, value);
	}

	/**
	 * Advance received balance 前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 80, $adv_amt_bal, value);
	}


	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 81, $adv_amt);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 81, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 81, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 81, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 81, $adv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 81, $adv_amt, value);
	}


	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 82, $adv_setoff_amt);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 82, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 82, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 82, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 82, $adv_setoff_amt, value);
	}

	/**
	 * Advance received offset amount 前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 82, $adv_setoff_amt, value);
	}


	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 83, $adv_setoff_tax_amt);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 83, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 83, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 83, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 83, $adv_setoff_tax_amt, value);
	}

	/**
	 * Advance received offset tax amount 前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 83, $adv_setoff_tax_amt, value);
	}


	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return getConstDate(offset + 84, $pay_schd_dt1);
	}

	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		setConstDate(offset + 84, $pay_schd_dt1, value);
	}


	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return getConstNumber(offset + 85, $pay_schd_amt1);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		setConstNumber(offset + 85, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		setConstNumber(offset + 85, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		setConstNumber(offset + 85, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		setConstNumber(offset + 85, $pay_schd_amt1, value);
	}

	/**
	 * Payment schedule amount 1 支払予定額１.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		setConstNumber(offset + 85, $pay_schd_amt1, value);
	}


	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public String pay_mtd_cd1() {
		return getConstString(offset + 86, $pay_mtd_cd1);
	}

	/**
	 * Payment method cd. 1 支払方法ＣＤ１.<p>
	 *
	 */
	public void pay_mtd_cd1(String value) {
		setConstString(offset + 86, $pay_mtd_cd1, value);
	}


	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return getConstDate(offset + 87, $pay_schd_dt2);
	}

	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		setConstDate(offset + 87, $pay_schd_dt2, value);
	}


	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return getConstNumber(offset + 88, $pay_schd_amt2);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		setConstNumber(offset + 88, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		setConstNumber(offset + 88, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		setConstNumber(offset + 88, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		setConstNumber(offset + 88, $pay_schd_amt2, value);
	}

	/**
	 * Payment schedule amount 2 支払予定額２.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		setConstNumber(offset + 88, $pay_schd_amt2, value);
	}


	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public String pay_mtd_cd2() {
		return getConstString(offset + 89, $pay_mtd_cd2);
	}

	/**
	 * Payment method cd. 2 支払方法ＣＤ２.<p>
	 *
	 */
	public void pay_mtd_cd2(String value) {
		setConstString(offset + 89, $pay_mtd_cd2, value);
	}


	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return getConstDate(offset + 90, $pay_schd_dt3);
	}

	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		setConstDate(offset + 90, $pay_schd_dt3, value);
	}


	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return getConstNumber(offset + 91, $pay_schd_amt3);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		setConstNumber(offset + 91, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		setConstNumber(offset + 91, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		setConstNumber(offset + 91, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		setConstNumber(offset + 91, $pay_schd_amt3, value);
	}

	/**
	 * Payment schedule amount 3 支払予定額３.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		setConstNumber(offset + 91, $pay_schd_amt3, value);
	}


	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public String pay_mtd_cd3() {
		return getConstString(offset + 92, $pay_mtd_cd3);
	}

	/**
	 * Payment method cd. 3 支払方法ＣＤ３.<p>
	 *
	 */
	public void pay_mtd_cd3(String value) {
		setConstString(offset + 92, $pay_mtd_cd3, value);
	}


	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return getConstDate(offset + 93, $pay_schd_dt4);
	}

	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		setConstDate(offset + 93, $pay_schd_dt4, value);
	}


	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return getConstNumber(offset + 94, $pay_schd_amt4);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		setConstNumber(offset + 94, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		setConstNumber(offset + 94, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		setConstNumber(offset + 94, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		setConstNumber(offset + 94, $pay_schd_amt4, value);
	}

	/**
	 * Payment schedule amount 4 支払予定額４.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		setConstNumber(offset + 94, $pay_schd_amt4, value);
	}


	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public String pay_mtd_cd4() {
		return getConstString(offset + 95, $pay_mtd_cd4);
	}

	/**
	 * Payment method cd. 4 支払方法ＣＤ４.<p>
	 *
	 */
	public void pay_mtd_cd4(String value) {
		setConstString(offset + 95, $pay_mtd_cd4, value);
	}


	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return getConstDate(offset + 96, $pay_schd_dt5);
	}

	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		setConstDate(offset + 96, $pay_schd_dt5, value);
	}


	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return getConstNumber(offset + 97, $pay_schd_amt5);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		setConstNumber(offset + 97, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		setConstNumber(offset + 97, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		setConstNumber(offset + 97, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		setConstNumber(offset + 97, $pay_schd_amt5, value);
	}

	/**
	 * Payment schedule amount 5 支払予定額５.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		setConstNumber(offset + 97, $pay_schd_amt5, value);
	}


	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public String pay_mtd_cd5() {
		return getConstString(offset + 98, $pay_mtd_cd5);
	}

	/**
	 * Payment method cd. 5 支払方法ＣＤ５.<p>
	 *
	 */
	public void pay_mtd_cd5(String value) {
		setConstString(offset + 98, $pay_mtd_cd5, value);
	}


	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public MCDate pay_schd_dt6() {
		return getConstDate(offset + 99, $pay_schd_dt6);
	}

	/**
	 * Scheduled payment date 6 支払予定日６.<p>
	 *
	 */
	public void pay_schd_dt6(MCDate value) {
		setConstDate(offset + 99, $pay_schd_dt6, value);
	}


	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public MCNumber pay_schd_amt6() {
		return getConstNumber(offset + 100, $pay_schd_amt6);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(MCNumber value) {
		setConstNumber(offset + 100, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(int value) {
		setConstNumber(offset + 100, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(long value) {
		setConstNumber(offset + 100, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(float value) {
		setConstNumber(offset + 100, $pay_schd_amt6, value);
	}

	/**
	 * Payment schedule amount 6 支払予定額６.<p>
	 *
	 */
	public void pay_schd_amt6(double value) {
		setConstNumber(offset + 100, $pay_schd_amt6, value);
	}


	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public String pay_mtd_cd6() {
		return getConstString(offset + 101, $pay_mtd_cd6);
	}

	/**
	 * Payment method cd. 6 支払方法ＣＤ６.<p>
	 *
	 */
	public void pay_mtd_cd6(String value) {
		setConstString(offset + 101, $pay_mtd_cd6, value);
	}


	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public MCDate pay_schd_dt7() {
		return getConstDate(offset + 102, $pay_schd_dt7);
	}

	/**
	 * Scheduled payment date 7 支払予定日７.<p>
	 *
	 */
	public void pay_schd_dt7(MCDate value) {
		setConstDate(offset + 102, $pay_schd_dt7, value);
	}


	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public MCNumber pay_schd_amt7() {
		return getConstNumber(offset + 103, $pay_schd_amt7);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(MCNumber value) {
		setConstNumber(offset + 103, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(int value) {
		setConstNumber(offset + 103, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(long value) {
		setConstNumber(offset + 103, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(float value) {
		setConstNumber(offset + 103, $pay_schd_amt7, value);
	}

	/**
	 * Payment schedule amount 7 支払予定額７.<p>
	 *
	 */
	public void pay_schd_amt7(double value) {
		setConstNumber(offset + 103, $pay_schd_amt7, value);
	}


	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public String pay_mtd_cd7() {
		return getConstString(offset + 104, $pay_mtd_cd7);
	}

	/**
	 * Payment method cd. 7 支払方法ＣＤ７.<p>
	 *
	 */
	public void pay_mtd_cd7(String value) {
		setConstString(offset + 104, $pay_mtd_cd7, value);
	}


	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public MCDate pay_schd_dt8() {
		return getConstDate(offset + 105, $pay_schd_dt8);
	}

	/**
	 * Scheduled payment date 8 支払予定日８.<p>
	 *
	 */
	public void pay_schd_dt8(MCDate value) {
		setConstDate(offset + 105, $pay_schd_dt8, value);
	}


	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public MCNumber pay_schd_amt8() {
		return getConstNumber(offset + 106, $pay_schd_amt8);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(MCNumber value) {
		setConstNumber(offset + 106, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(int value) {
		setConstNumber(offset + 106, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(long value) {
		setConstNumber(offset + 106, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(float value) {
		setConstNumber(offset + 106, $pay_schd_amt8, value);
	}

	/**
	 * Payment schedule amount 8 支払予定額８.<p>
	 *
	 */
	public void pay_schd_amt8(double value) {
		setConstNumber(offset + 106, $pay_schd_amt8, value);
	}


	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public String pay_mtd_cd8() {
		return getConstString(offset + 107, $pay_mtd_cd8);
	}

	/**
	 * Payment method cd. 8 支払方法ＣＤ８.<p>
	 *
	 */
	public void pay_mtd_cd8(String value) {
		setConstString(offset + 107, $pay_mtd_cd8, value);
	}


	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public MCDate pay_schd_dt9() {
		return getConstDate(offset + 108, $pay_schd_dt9);
	}

	/**
	 * Scheduled payment date 9 支払予定日９.<p>
	 *
	 */
	public void pay_schd_dt9(MCDate value) {
		setConstDate(offset + 108, $pay_schd_dt9, value);
	}


	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public MCNumber pay_schd_amt9() {
		return getConstNumber(offset + 109, $pay_schd_amt9);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(MCNumber value) {
		setConstNumber(offset + 109, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(int value) {
		setConstNumber(offset + 109, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(long value) {
		setConstNumber(offset + 109, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(float value) {
		setConstNumber(offset + 109, $pay_schd_amt9, value);
	}

	/**
	 * Payment schedule amount 9 支払予定額９.<p>
	 *
	 */
	public void pay_schd_amt9(double value) {
		setConstNumber(offset + 109, $pay_schd_amt9, value);
	}


	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public String pay_mtd_cd9() {
		return getConstString(offset + 110, $pay_mtd_cd9);
	}

	/**
	 * Payment method cd. 9 支払方法ＣＤ９.<p>
	 *
	 */
	public void pay_mtd_cd9(String value) {
		setConstString(offset + 110, $pay_mtd_cd9, value);
	}


	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public MCDate pay_schd_dt10() {
		return getConstDate(offset + 111, $pay_schd_dt10);
	}

	/**
	 * Scheduled payment date 10 支払予定日１０.<p>
	 *
	 */
	public void pay_schd_dt10(MCDate value) {
		setConstDate(offset + 111, $pay_schd_dt10, value);
	}


	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public MCNumber pay_schd_amt10() {
		return getConstNumber(offset + 112, $pay_schd_amt10);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(MCNumber value) {
		setConstNumber(offset + 112, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(int value) {
		setConstNumber(offset + 112, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(long value) {
		setConstNumber(offset + 112, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(float value) {
		setConstNumber(offset + 112, $pay_schd_amt10, value);
	}

	/**
	 * Payment schedule amount 10 支払予定額１０.<p>
	 *
	 */
	public void pay_schd_amt10(double value) {
		setConstNumber(offset + 112, $pay_schd_amt10, value);
	}


	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public String pay_mtd_cd10() {
		return getConstString(offset + 113, $pay_mtd_cd10);
	}

	/**
	 * Payment method cd. 10 支払方法ＣＤ１０.<p>
	 *
	 */
	public void pay_mtd_cd10(String value) {
		setConstString(offset + 113, $pay_mtd_cd10, value);
	}


	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 114, $bank_ac_cd);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 114, $bank_ac_cd, value);
	}


	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 115, $bill_bcst_nm);
	}

	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 115, $bill_bcst_nm, value);
	}


	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public String bill_ein() {
		return getConstString(offset + 116, $bill_ein);
	}

	/**
	 * Invoice send-to corporation No. 請求書送付法人番号.<p>
	 *
	 */
	public void bill_ein(String value) {
		setConstString(offset + 116, $bill_ein, value);
	}


	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public String bill_biz_co_no() {
		return getConstString(offset + 117, $bill_biz_co_no);
	}

	/**
	 * Invoice send-to business No. 請求書送付事業者ＮＯ.<p>
	 *
	 */
	public void bill_biz_co_no(String value) {
		setConstString(offset + 117, $bill_biz_co_no, value);
	}


	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 118, $bill_zip_cd);
	}

	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 118, $bill_zip_cd, value);
	}


	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 119, $bill_addr1);
	}

	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 119, $bill_addr1, value);
	}


	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 120, $bill_addr2);
	}

	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 120, $bill_addr2, value);
	}


	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 121, $bill_addr3);
	}

	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 121, $bill_addr3, value);
	}


	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 122, $bill_addr4);
	}

	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 122, $bill_addr4, value);
	}


	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 123, $bill_bcst_dpt);
	}

	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 123, $bill_bcst_dpt, value);
	}


	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 124, $bill_tel);
	}

	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 124, $bill_tel, value);
	}


	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 125, $upd_cntr);
	}

	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 125, $upd_cntr, value);
	}

	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 125, $upd_cntr, value);
	}

	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 125, $upd_cntr, value);
	}

	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 125, $upd_cntr, value);
	}

	/**
	 * Billing import header update counter 請求受信ヘッダ更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 125, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($invalid_flg.equalsIgnoreCase(name)) {
			return invalid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
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
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($invalid_flg.equalsIgnoreCase(name)) {
			invalid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

