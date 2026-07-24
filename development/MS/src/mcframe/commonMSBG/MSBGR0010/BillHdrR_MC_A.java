package mcframe.commonMSBG.MSBGR0010;

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
 * ブロック"BillHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BillHdrR_MC_A extends MCConstRow {

	/**
	 *  請求年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 *  請求締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 *  請求日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	/**
	 *  帳票再発行マーク.<p>
	 *
	 */
	public static final String $re_issue = "re_issue";
	/**
	 *  発行日.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public static final String $bill_rev = "bill_rev";
	/**
	 *  案件.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  貴社案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	/**
	 *  請求書送付住所.<p>
	 *
	 */
	public static final String $bill_addr = "bill_addr";
	/**
	 *  請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 *  請求先部署名.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 *  請求先担当者名.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	/**
	 *  請求先担当者敬称.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	/**
	 *  請求書国名.<p>
	 *
	 */
	public static final String $bill_cntry_nm = "bill_cntry_nm";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 *  会社.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 *  住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 *  住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 *  住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 *  住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 *  住所.<p>
	 *
	 */
	public static final String $addr = "addr";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $dpt_tel = "dpt_tel";
	/**
	 *  事業者番号.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	/**
	 *  ご請求金額（請求額）文字列.<p>
	 *
	 */
	public static final String $s_bill_amt = "s_bill_amt";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  ご請求金額（通貨名）.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 *  基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	/**
	 *  前回ご請求額文字列.<p>
	 *
	 */
	public static final String $s_last_bill_amt = "s_last_bill_amt";
	/**
	 *  お支払い額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 *  お支払い額文字列.<p>
	 *
	 */
	public static final String $s_rcv_amt = "s_rcv_amt";
	/**
	 *  振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 *  振替額文字列.<p>
	 *
	 */
	public static final String $s_sw_amt = "s_sw_amt";
	/**
	 *  相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 *  相殺額文字列.<p>
	 *
	 */
	public static final String $s_setoff_amt = "s_setoff_amt";
	/**
	 *  相殺税額.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
	/**
	 *  相殺税額文字列.<p>
	 *
	 */
	public static final String $s_setoff_tax_amt = "s_setoff_tax_amt";
	/**
	 *  差引繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 *  差引繰越額文字列.<p>
	 *
	 */
	public static final String $s_bfw_amt = "s_bfw_amt";
	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 *  今回お買上げ額文字列.<p>
	 *
	 */
	public static final String $s_sls_amt = "s_sls_amt";
	/**
	 *  今回値引額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 *  今回値引額文字列.<p>
	 *
	 */
	public static final String $s_dscnt_amt = "s_dscnt_amt";
	/**
	 *  今回返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 *  今回返品額文字列.<p>
	 *
	 */
	public static final String $s_ret_amt = "s_ret_amt";
	/**
	 *  税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 *  税額文字列.<p>
	 *
	 */
	public static final String $s_tax_amt = "s_tax_amt";
	/**
	 *  今回振替額.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 *  今回振替額文字列.<p>
	 *
	 */
	public static final String $s_sw_to_amt = "s_sw_to_amt";
	/**
	 *  前受金残高.<p>
	 *
	 */
	public static final String $adv_amt_bal = "adv_amt_bal";
	/**
	 *  前受金残高文字列.<p>
	 *
	 */
	public static final String $s_adv_amt_bal = "s_adv_amt_bal";
	/**
	 *  前受金入金額.<p>
	 *
	 */
	public static final String $adv_amt = "adv_amt";
	/**
	 *  前受金入金額文字列.<p>
	 *
	 */
	public static final String $s_adv_amt = "s_adv_amt";
	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public static final String $adv_setoff_amt = "adv_setoff_amt";
	/**
	 *  前受金相殺額文字列.<p>
	 *
	 */
	public static final String $s_adv_setoff_amt = "s_adv_setoff_amt";
	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public static final String $adv_setoff_tax_amt = "adv_setoff_tax_amt";
	/**
	 *  前受金相殺税額文字列.<p>
	 *
	 */
	public static final String $s_adv_setoff_tax_amt = "s_adv_setoff_tax_amt";
	/**
	 *  為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public static final String $s_bill_xrate = "s_bill_xrate";
	/**
	 *  税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 *  税率１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate1 = "s_tax_rate1";
	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt1 = "tax_rate_sls_amt1";
	/**
	 *  税率毎お買上げ額１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt1 = "s_tax_rate_sls_amt1";
	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt1 = "tax_rate_tax_amt1";
	/**
	 *  税率毎消費税額１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt1 = "s_tax_rate_tax_amt1";
	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt1 = "tax_rate_base_tax_amt1";
	/**
	 *  税率毎基準通貨消費税額１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt1 = "s_tax_rate_base_tax_amt1";
	/**
	 *  税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 *  税率２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate2 = "s_tax_rate2";
	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt2 = "tax_rate_sls_amt2";
	/**
	 *  税率毎お買上げ額２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt2 = "s_tax_rate_sls_amt2";
	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt2 = "tax_rate_tax_amt2";
	/**
	 *  税率毎消費税額２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt2 = "s_tax_rate_tax_amt2";
	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt2 = "tax_rate_base_tax_amt2";
	/**
	 *  税率毎基準通貨消費税額２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt2 = "s_tax_rate_base_tax_amt2";
	/**
	 *  税率３.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	/**
	 *  税率３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate3 = "s_tax_rate3";
	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt3 = "tax_rate_sls_amt3";
	/**
	 *  税率毎お買上げ額３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt3 = "s_tax_rate_sls_amt3";
	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt3 = "tax_rate_tax_amt3";
	/**
	 *  税率毎消費税額３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt3 = "s_tax_rate_tax_amt3";
	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt3 = "tax_rate_base_tax_amt3";
	/**
	 *  税率毎基準通貨消費税額３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt3 = "s_tax_rate_base_tax_amt3";
	/**
	 *  税率４.<p>
	 *
	 */
	public static final String $tax_rate4 = "tax_rate4";
	/**
	 *  税率４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate4 = "s_tax_rate4";
	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt4 = "tax_rate_sls_amt4";
	/**
	 *  税率毎お買上げ額４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt4 = "s_tax_rate_sls_amt4";
	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt4 = "tax_rate_tax_amt4";
	/**
	 *  税率毎消費税額４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt4 = "s_tax_rate_tax_amt4";
	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt4 = "tax_rate_base_tax_amt4";
	/**
	 *  税率毎基準通貨消費税額４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt4 = "s_tax_rate_base_tax_amt4";
	/**
	 *  税率５.<p>
	 *
	 */
	public static final String $tax_rate5 = "tax_rate5";
	/**
	 *  税率５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate5 = "s_tax_rate5";
	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt5 = "tax_rate_sls_amt5";
	/**
	 *  税率毎お買上げ額５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt5 = "s_tax_rate_sls_amt5";
	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt5 = "tax_rate_tax_amt5";
	/**
	 *  税率毎消費税額５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt5 = "s_tax_rate_tax_amt5";
	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt5 = "tax_rate_base_tax_amt5";
	/**
	 *  税率毎基準通貨消費税額５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt5 = "s_tax_rate_base_tax_amt5";
	/**
	 *  税率６.<p>
	 *
	 */
	public static final String $tax_rate6 = "tax_rate6";
	/**
	 *  税率６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate6 = "s_tax_rate6";
	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt6 = "tax_rate_sls_amt6";
	/**
	 *  税率毎お買上げ額６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt6 = "s_tax_rate_sls_amt6";
	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt6 = "tax_rate_tax_amt6";
	/**
	 *  税率毎消費税額６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt6 = "s_tax_rate_tax_amt6";
	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt6 = "tax_rate_base_tax_amt6";
	/**
	 *  税率毎基準通貨消費税額６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt6 = "s_tax_rate_base_tax_amt6";
	/**
	 *  税率７.<p>
	 *
	 */
	public static final String $tax_rate7 = "tax_rate7";
	/**
	 *  税率７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate7 = "s_tax_rate7";
	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt7 = "tax_rate_sls_amt7";
	/**
	 *  税率毎お買上げ額７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt7 = "s_tax_rate_sls_amt7";
	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt7 = "tax_rate_tax_amt7";
	/**
	 *  税率毎消費税額７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt7 = "s_tax_rate_tax_amt7";
	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt7 = "tax_rate_base_tax_amt7";
	/**
	 *  税率毎基準通貨消費税額７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt7 = "s_tax_rate_base_tax_amt7";
	/**
	 *  税率８.<p>
	 *
	 */
	public static final String $tax_rate8 = "tax_rate8";
	/**
	 *  税率８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate8 = "s_tax_rate8";
	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt8 = "tax_rate_sls_amt8";
	/**
	 *  税率毎お買上げ額８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt8 = "s_tax_rate_sls_amt8";
	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt8 = "tax_rate_tax_amt8";
	/**
	 *  税率毎消費税額８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt8 = "s_tax_rate_tax_amt8";
	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt8 = "tax_rate_base_tax_amt8";
	/**
	 *  税率毎基準通貨消費税額８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt8 = "s_tax_rate_base_tax_amt8";
	/**
	 *  税率９.<p>
	 *
	 */
	public static final String $tax_rate9 = "tax_rate9";
	/**
	 *  税率９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate9 = "s_tax_rate9";
	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt9 = "tax_rate_sls_amt9";
	/**
	 *  税率毎お買上げ額９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt9 = "s_tax_rate_sls_amt9";
	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt9 = "tax_rate_tax_amt9";
	/**
	 *  税率毎消費税額９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt9 = "s_tax_rate_tax_amt9";
	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt9 = "tax_rate_base_tax_amt9";
	/**
	 *  税率毎基準通貨消費税額９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt9 = "s_tax_rate_base_tax_amt9";
	/**
	 *  税率１０.<p>
	 *
	 */
	public static final String $tax_rate10 = "tax_rate10";
	/**
	 *  税率１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate10 = "s_tax_rate10";
	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt10 = "tax_rate_sls_amt10";
	/**
	 *  税率毎お買上げ額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_sls_amt10 = "s_tax_rate_sls_amt10";
	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt10 = "tax_rate_tax_amt10";
	/**
	 *  税率毎消費税額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt10 = "s_tax_rate_tax_amt10";
	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt10 = "tax_rate_base_tax_amt10";
	/**
	 *  税率毎基準通貨消費税額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt10 = "s_tax_rate_base_tax_amt10";
	/**
	 *  お支払期限１.<p>
	 *
	 */
	public static final String $rcv_schd_dt1 = "rcv_schd_dt1";
	/**
	 *  お支払方法１.<p>
	 *
	 */
	public static final String $rcv_mtd_cd1 = "rcv_mtd_cd1";
	/**
	 *  お支払方法１.<p>
	 *
	 */
	public static final String $sttl_nm1 = "sttl_nm1";
	/**
	 *  お支払金額１.<p>
	 *
	 */
	public static final String $rcv_schd_amt1 = "rcv_schd_amt1";
	/**
	 *  お支払金額１文字列.<p>
	 *
	 */
	public static final String $s_rcv_schd_amt1 = "s_rcv_schd_amt1";
	/**
	 *  お支払期限２.<p>
	 *
	 */
	public static final String $rcv_schd_dt2 = "rcv_schd_dt2";
	/**
	 *  お支払方法２.<p>
	 *
	 */
	public static final String $rcv_mtd_cd2 = "rcv_mtd_cd2";
	/**
	 *  お支払方法２.<p>
	 *
	 */
	public static final String $sttl_nm2 = "sttl_nm2";
	/**
	 *  お支払金額２.<p>
	 *
	 */
	public static final String $rcv_schd_amt2 = "rcv_schd_amt2";
	/**
	 *  お支払金額２文字列.<p>
	 *
	 */
	public static final String $s_rcv_schd_amt2 = "s_rcv_schd_amt2";
	/**
	 *  お支払期限３.<p>
	 *
	 */
	public static final String $rcv_schd_dt3 = "rcv_schd_dt3";
	/**
	 *  お支払方法３.<p>
	 *
	 */
	public static final String $rcv_mtd_cd3 = "rcv_mtd_cd3";
	/**
	 *  お支払方法３.<p>
	 *
	 */
	public static final String $sttl_nm3 = "sttl_nm3";
	/**
	 *  お支払金額３.<p>
	 *
	 */
	public static final String $rcv_schd_amt3 = "rcv_schd_amt3";
	/**
	 *  お支払金額３文字列.<p>
	 *
	 */
	public static final String $s_rcv_schd_amt3 = "s_rcv_schd_amt3";
	/**
	 *  お支払期限４.<p>
	 *
	 */
	public static final String $rcv_schd_dt4 = "rcv_schd_dt4";
	/**
	 *  お支払方法４.<p>
	 *
	 */
	public static final String $rcv_mtd_cd4 = "rcv_mtd_cd4";
	/**
	 *  お支払方法４.<p>
	 *
	 */
	public static final String $sttl_nm4 = "sttl_nm4";
	/**
	 *  お支払金額４.<p>
	 *
	 */
	public static final String $rcv_schd_amt4 = "rcv_schd_amt4";
	/**
	 *  お支払金額４文字列.<p>
	 *
	 */
	public static final String $s_rcv_schd_amt4 = "s_rcv_schd_amt4";
	/**
	 *  お支払期限５.<p>
	 *
	 */
	public static final String $rcv_schd_dt5 = "rcv_schd_dt5";
	/**
	 *  お支払方法５.<p>
	 *
	 */
	public static final String $rcv_mtd_cd5 = "rcv_mtd_cd5";
	/**
	 *  お支払方法５.<p>
	 *
	 */
	public static final String $sttl_nm5 = "sttl_nm5";
	/**
	 *  お支払金額５.<p>
	 *
	 */
	public static final String $rcv_schd_amt5 = "rcv_schd_amt5";
	/**
	 *  お支払金額５文字列.<p>
	 *
	 */
	public static final String $s_rcv_schd_amt5 = "s_rcv_schd_amt5";
	/**
	 *  銀行口座.<p>
	 *
	 */
	public static final String $rcv_bank_ac_cd = "rcv_bank_ac_cd";
	/**
	 *  銀行.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 *  振込口座（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 *  支店.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 *  振込口座（支店名）.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 *  口座区分.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
	/**
	 *  振込口座（口座区分）.<p>
	 *
	 */
	public static final String $bank_ac_typ_nm = "bank_ac_typ_nm";
	/**
	 *  振込口座（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 *  口座名義.<p>
	 *
	 */
	public static final String $bank_ac_holder = "bank_ac_holder";
	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $bill_dtl_outp_flg = "bill_dtl_outp_flg";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public static final String $hdr_page = "hdr_page";
	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public static final String $hdr_page_sum = "hdr_page_sum";


	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_issue_META = createStringMeta($re_issue);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_rev_META = createCommonMeta($bill_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_addr_META = createStringMeta($bill_addr);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta bill_cntry_nm_META = createCommonMeta($bill_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta addr_META = createStringMeta($addr);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta biz_co_no_META = createStringMeta($biz_co_no);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_bill_amt_META = createStringMeta($s_bill_amt);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_last_bill_amt_META = createStringMeta($s_last_bill_amt);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_amt_META = createStringMeta($s_rcv_amt);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sw_amt_META = createStringMeta($s_sw_amt);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_setoff_amt_META = createStringMeta($s_setoff_amt);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_setoff_tax_amt_META = createStringMeta($s_setoff_tax_amt);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_bfw_amt_META = createStringMeta($s_bfw_amt);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sls_amt_META = createStringMeta($s_sls_amt);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_dscnt_amt_META = createStringMeta($s_dscnt_amt);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ret_amt_META = createStringMeta($s_ret_amt);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_amt_META = createStringMeta($s_tax_amt);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sw_to_amt_META = createStringMeta($s_sw_to_amt);
	public static final MCMeta adv_amt_bal_META = createCommonMeta($adv_amt_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_amt_bal_META = createStringMeta($s_adv_amt_bal);
	public static final MCMeta adv_amt_META = createCommonMeta($adv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_amt_META = createStringMeta($s_adv_amt);
	public static final MCMeta adv_setoff_amt_META = createCommonMeta($adv_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_setoff_amt_META = createStringMeta($s_adv_setoff_amt);
	public static final MCMeta adv_setoff_tax_amt_META = createCommonMeta($adv_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_setoff_tax_amt_META = createStringMeta($s_adv_setoff_tax_amt);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_bill_xrate_META = createStringMeta($s_bill_xrate);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate1_META = createStringMeta($s_tax_rate1);
	public static final MCMeta tax_rate_sls_amt1_META = createCommonMeta($tax_rate_sls_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt1_META = createStringMeta($s_tax_rate_sls_amt1);
	public static final MCMeta tax_rate_tax_amt1_META = createCommonMeta($tax_rate_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt1_META = createStringMeta($s_tax_rate_tax_amt1);
	public static final MCMeta tax_rate_base_tax_amt1_META = createCommonMeta($tax_rate_base_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt1_META = createStringMeta($s_tax_rate_base_tax_amt1);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate2_META = createStringMeta($s_tax_rate2);
	public static final MCMeta tax_rate_sls_amt2_META = createCommonMeta($tax_rate_sls_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt2_META = createStringMeta($s_tax_rate_sls_amt2);
	public static final MCMeta tax_rate_tax_amt2_META = createCommonMeta($tax_rate_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt2_META = createStringMeta($s_tax_rate_tax_amt2);
	public static final MCMeta tax_rate_base_tax_amt2_META = createCommonMeta($tax_rate_base_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt2_META = createStringMeta($s_tax_rate_base_tax_amt2);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate3_META = createStringMeta($s_tax_rate3);
	public static final MCMeta tax_rate_sls_amt3_META = createCommonMeta($tax_rate_sls_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt3_META = createStringMeta($s_tax_rate_sls_amt3);
	public static final MCMeta tax_rate_tax_amt3_META = createCommonMeta($tax_rate_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt3_META = createStringMeta($s_tax_rate_tax_amt3);
	public static final MCMeta tax_rate_base_tax_amt3_META = createCommonMeta($tax_rate_base_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt3_META = createStringMeta($s_tax_rate_base_tax_amt3);
	public static final MCMeta tax_rate4_META = createCommonMeta($tax_rate4, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate4_META = createStringMeta($s_tax_rate4);
	public static final MCMeta tax_rate_sls_amt4_META = createCommonMeta($tax_rate_sls_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt4_META = createStringMeta($s_tax_rate_sls_amt4);
	public static final MCMeta tax_rate_tax_amt4_META = createCommonMeta($tax_rate_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt4_META = createStringMeta($s_tax_rate_tax_amt4);
	public static final MCMeta tax_rate_base_tax_amt4_META = createCommonMeta($tax_rate_base_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt4_META = createStringMeta($s_tax_rate_base_tax_amt4);
	public static final MCMeta tax_rate5_META = createCommonMeta($tax_rate5, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate5_META = createStringMeta($s_tax_rate5);
	public static final MCMeta tax_rate_sls_amt5_META = createCommonMeta($tax_rate_sls_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt5_META = createStringMeta($s_tax_rate_sls_amt5);
	public static final MCMeta tax_rate_tax_amt5_META = createCommonMeta($tax_rate_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt5_META = createStringMeta($s_tax_rate_tax_amt5);
	public static final MCMeta tax_rate_base_tax_amt5_META = createCommonMeta($tax_rate_base_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt5_META = createStringMeta($s_tax_rate_base_tax_amt5);
	public static final MCMeta tax_rate6_META = createCommonMeta($tax_rate6, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate6_META = createStringMeta($s_tax_rate6);
	public static final MCMeta tax_rate_sls_amt6_META = createCommonMeta($tax_rate_sls_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt6_META = createStringMeta($s_tax_rate_sls_amt6);
	public static final MCMeta tax_rate_tax_amt6_META = createCommonMeta($tax_rate_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt6_META = createStringMeta($s_tax_rate_tax_amt6);
	public static final MCMeta tax_rate_base_tax_amt6_META = createCommonMeta($tax_rate_base_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt6_META = createStringMeta($s_tax_rate_base_tax_amt6);
	public static final MCMeta tax_rate7_META = createCommonMeta($tax_rate7, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate7_META = createStringMeta($s_tax_rate7);
	public static final MCMeta tax_rate_sls_amt7_META = createCommonMeta($tax_rate_sls_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt7_META = createStringMeta($s_tax_rate_sls_amt7);
	public static final MCMeta tax_rate_tax_amt7_META = createCommonMeta($tax_rate_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt7_META = createStringMeta($s_tax_rate_tax_amt7);
	public static final MCMeta tax_rate_base_tax_amt7_META = createCommonMeta($tax_rate_base_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt7_META = createStringMeta($s_tax_rate_base_tax_amt7);
	public static final MCMeta tax_rate8_META = createCommonMeta($tax_rate8, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate8_META = createStringMeta($s_tax_rate8);
	public static final MCMeta tax_rate_sls_amt8_META = createCommonMeta($tax_rate_sls_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt8_META = createStringMeta($s_tax_rate_sls_amt8);
	public static final MCMeta tax_rate_tax_amt8_META = createCommonMeta($tax_rate_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt8_META = createStringMeta($s_tax_rate_tax_amt8);
	public static final MCMeta tax_rate_base_tax_amt8_META = createCommonMeta($tax_rate_base_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt8_META = createStringMeta($s_tax_rate_base_tax_amt8);
	public static final MCMeta tax_rate9_META = createCommonMeta($tax_rate9, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate9_META = createStringMeta($s_tax_rate9);
	public static final MCMeta tax_rate_sls_amt9_META = createCommonMeta($tax_rate_sls_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt9_META = createStringMeta($s_tax_rate_sls_amt9);
	public static final MCMeta tax_rate_tax_amt9_META = createCommonMeta($tax_rate_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt9_META = createStringMeta($s_tax_rate_tax_amt9);
	public static final MCMeta tax_rate_base_tax_amt9_META = createCommonMeta($tax_rate_base_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt9_META = createStringMeta($s_tax_rate_base_tax_amt9);
	public static final MCMeta tax_rate10_META = createCommonMeta($tax_rate10, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate10_META = createStringMeta($s_tax_rate10);
	public static final MCMeta tax_rate_sls_amt10_META = createCommonMeta($tax_rate_sls_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_sls_amt10_META = createStringMeta($s_tax_rate_sls_amt10);
	public static final MCMeta tax_rate_tax_amt10_META = createCommonMeta($tax_rate_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt10_META = createStringMeta($s_tax_rate_tax_amt10);
	public static final MCMeta tax_rate_base_tax_amt10_META = createCommonMeta($tax_rate_base_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt10_META = createStringMeta($s_tax_rate_base_tax_amt10);
	public static final MCMeta rcv_schd_dt1_META = createCommonMeta($rcv_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd1_META = createCommonMeta($rcv_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm1_META = createCommonMeta($sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_amt1_META = createCommonMeta($rcv_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_schd_amt1_META = createStringMeta($s_rcv_schd_amt1);
	public static final MCMeta rcv_schd_dt2_META = createCommonMeta($rcv_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd2_META = createCommonMeta($rcv_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm2_META = createCommonMeta($sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_amt2_META = createCommonMeta($rcv_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_schd_amt2_META = createStringMeta($s_rcv_schd_amt2);
	public static final MCMeta rcv_schd_dt3_META = createCommonMeta($rcv_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd3_META = createCommonMeta($rcv_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm3_META = createCommonMeta($sttl_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_amt3_META = createCommonMeta($rcv_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_schd_amt3_META = createStringMeta($s_rcv_schd_amt3);
	public static final MCMeta rcv_schd_dt4_META = createCommonMeta($rcv_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd4_META = createCommonMeta($rcv_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm4_META = createCommonMeta($sttl_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_amt4_META = createCommonMeta($rcv_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_schd_amt4_META = createStringMeta($s_rcv_schd_amt4);
	public static final MCMeta rcv_schd_dt5_META = createCommonMeta($rcv_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd5_META = createCommonMeta($rcv_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm5_META = createCommonMeta($sttl_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_amt5_META = createCommonMeta($rcv_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_rcv_schd_amt5_META = createStringMeta($s_rcv_schd_amt5);
	public static final MCMeta rcv_bank_ac_cd_META = createCommonMeta($rcv_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_typ_nm_META = createCommonMeta($bank_ac_typ_nm, mcframe.commonMA.meta.MA_META.BANK_AC_TYP_NM);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bill_dtl_outp_flg_META = createCommonMeta($bill_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR3);
	public static final MCMeta hdr_page_META = createCommonMeta($hdr_page, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_page_sum_META = createCommonMeta($hdr_page_sum, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<BillHdrR> constMetas = new ConstMetaList<BillHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_ym_META,
			bill_cl_day_META,
			bill_dt_META,
			re_issue_META,
			prnt_tm_META,
			bill_no_META,
			bill_rev_META,
			wrk_no_META,
			wrk_nm_META,
			bcst_cd_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_addr_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			bill_cntry_nm_META,
			bill_tel_META,
			co_cd_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			addr_META,
			co_nm_META,
			cntry_nm_META,
			bill_dpt_cd_META,
			dpt_nm_META,
			dpt_tel_META,
			biz_co_no_META,
			bill_amt_META,
			s_bill_amt_META,
			cur_cd_META,
			cur_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			last_bill_amt_META,
			s_last_bill_amt_META,
			rcv_amt_META,
			s_rcv_amt_META,
			sw_amt_META,
			s_sw_amt_META,
			setoff_amt_META,
			s_setoff_amt_META,
			setoff_tax_amt_META,
			s_setoff_tax_amt_META,
			bfw_amt_META,
			s_bfw_amt_META,
			sls_amt_META,
			s_sls_amt_META,
			dscnt_amt_META,
			s_dscnt_amt_META,
			ret_amt_META,
			s_ret_amt_META,
			tax_amt_META,
			s_tax_amt_META,
			sw_to_amt_META,
			s_sw_to_amt_META,
			adv_amt_bal_META,
			s_adv_amt_bal_META,
			adv_amt_META,
			s_adv_amt_META,
			adv_setoff_amt_META,
			s_adv_setoff_amt_META,
			adv_setoff_tax_amt_META,
			s_adv_setoff_tax_amt_META,
			bill_xrate_META,
			s_bill_xrate_META,
			tax_rate1_META,
			s_tax_rate1_META,
			tax_rate_sls_amt1_META,
			s_tax_rate_sls_amt1_META,
			tax_rate_tax_amt1_META,
			s_tax_rate_tax_amt1_META,
			tax_rate_base_tax_amt1_META,
			s_tax_rate_base_tax_amt1_META,
			tax_rate2_META,
			s_tax_rate2_META,
			tax_rate_sls_amt2_META,
			s_tax_rate_sls_amt2_META,
			tax_rate_tax_amt2_META,
			s_tax_rate_tax_amt2_META,
			tax_rate_base_tax_amt2_META,
			s_tax_rate_base_tax_amt2_META,
			tax_rate3_META,
			s_tax_rate3_META,
			tax_rate_sls_amt3_META,
			s_tax_rate_sls_amt3_META,
			tax_rate_tax_amt3_META,
			s_tax_rate_tax_amt3_META,
			tax_rate_base_tax_amt3_META,
			s_tax_rate_base_tax_amt3_META,
			tax_rate4_META,
			s_tax_rate4_META,
			tax_rate_sls_amt4_META,
			s_tax_rate_sls_amt4_META,
			tax_rate_tax_amt4_META,
			s_tax_rate_tax_amt4_META,
			tax_rate_base_tax_amt4_META,
			s_tax_rate_base_tax_amt4_META,
			tax_rate5_META,
			s_tax_rate5_META,
			tax_rate_sls_amt5_META,
			s_tax_rate_sls_amt5_META,
			tax_rate_tax_amt5_META,
			s_tax_rate_tax_amt5_META,
			tax_rate_base_tax_amt5_META,
			s_tax_rate_base_tax_amt5_META,
			tax_rate6_META,
			s_tax_rate6_META,
			tax_rate_sls_amt6_META,
			s_tax_rate_sls_amt6_META,
			tax_rate_tax_amt6_META,
			s_tax_rate_tax_amt6_META,
			tax_rate_base_tax_amt6_META,
			s_tax_rate_base_tax_amt6_META,
			tax_rate7_META,
			s_tax_rate7_META,
			tax_rate_sls_amt7_META,
			s_tax_rate_sls_amt7_META,
			tax_rate_tax_amt7_META,
			s_tax_rate_tax_amt7_META,
			tax_rate_base_tax_amt7_META,
			s_tax_rate_base_tax_amt7_META,
			tax_rate8_META,
			s_tax_rate8_META,
			tax_rate_sls_amt8_META,
			s_tax_rate_sls_amt8_META,
			tax_rate_tax_amt8_META,
			s_tax_rate_tax_amt8_META,
			tax_rate_base_tax_amt8_META,
			s_tax_rate_base_tax_amt8_META,
			tax_rate9_META,
			s_tax_rate9_META,
			tax_rate_sls_amt9_META,
			s_tax_rate_sls_amt9_META,
			tax_rate_tax_amt9_META,
			s_tax_rate_tax_amt9_META,
			tax_rate_base_tax_amt9_META,
			s_tax_rate_base_tax_amt9_META,
			tax_rate10_META,
			s_tax_rate10_META,
			tax_rate_sls_amt10_META,
			s_tax_rate_sls_amt10_META,
			tax_rate_tax_amt10_META,
			s_tax_rate_tax_amt10_META,
			tax_rate_base_tax_amt10_META,
			s_tax_rate_base_tax_amt10_META,
			rcv_schd_dt1_META,
			rcv_mtd_cd1_META,
			sttl_nm1_META,
			rcv_schd_amt1_META,
			s_rcv_schd_amt1_META,
			rcv_schd_dt2_META,
			rcv_mtd_cd2_META,
			sttl_nm2_META,
			rcv_schd_amt2_META,
			s_rcv_schd_amt2_META,
			rcv_schd_dt3_META,
			rcv_mtd_cd3_META,
			sttl_nm3_META,
			rcv_schd_amt3_META,
			s_rcv_schd_amt3_META,
			rcv_schd_dt4_META,
			rcv_mtd_cd4_META,
			sttl_nm4_META,
			rcv_schd_amt4_META,
			s_rcv_schd_amt4_META,
			rcv_schd_dt5_META,
			rcv_mtd_cd5_META,
			sttl_nm5_META,
			rcv_schd_amt5_META,
			s_rcv_schd_amt5_META,
			rcv_bank_ac_cd_META,
			bank_cd_META,
			bank_nm_META,
			bank_ac_cd_META,
			bank_ac_nm_META,
			bank_ac_typ_META,
			bank_ac_typ_nm_META,
			bank_ac_no_META,
			bank_ac_holder_META,
			bill_dtl_outp_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			hdr_page_META,
			hdr_page_sum_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected BillHdrR_MC_A(ConstMetaList<? extends BillHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillHdrR clone() {
		return (BillHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillHdrR createInstance() {
		return (BillHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BillHdrR getValues(String... names) {
		return (BillHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 0, $bill_ym);
	}

	/**
	 *  請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 0, $bill_ym, value);
	}


	/**
	 *  請求締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 1, $bill_cl_day);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}

	/**
	 *  請求締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 1, $bill_cl_day, value);
	}


	/**
	 *  請求日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 2, $bill_dt);
	}

	/**
	 *  請求日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 2, $bill_dt, value);
	}


	/**
	 *  帳票再発行マーク.<p>
	 *
	 */
	public String re_issue() {
		return getConstString(offset + 3, $re_issue);
	}

	/**
	 *  帳票再発行マーク.<p>
	 *
	 */
	public void re_issue(String value) {
		setConstString(offset + 3, $re_issue, value);
	}


	/**
	 *  発行日.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 4, $prnt_tm);
	}

	/**
	 *  発行日.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 4, $prnt_tm, value);
	}


	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 5, $bill_no);
	}

	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 5, $bill_no, value);
	}


	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public MCNumber bill_rev() {
		return getConstNumber(offset + 6, $bill_rev);
	}

	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(MCNumber value) {
		setConstNumber(offset + 6, $bill_rev, value);
	}

	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(int value) {
		setConstNumber(offset + 6, $bill_rev, value);
	}

	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(long value) {
		setConstNumber(offset + 6, $bill_rev, value);
	}

	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(float value) {
		setConstNumber(offset + 6, $bill_rev, value);
	}

	/**
	 *  請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(double value) {
		setConstNumber(offset + 6, $bill_rev, value);
	}


	/**
	 *  案件.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 7, $wrk_no);
	}

	/**
	 *  案件.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 7, $wrk_no, value);
	}


	/**
	 *  貴社案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 8, $wrk_nm);
	}

	/**
	 *  貴社案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 8, $wrk_nm, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 9, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 9, $bcst_cd, value);
	}


	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 10, $bill_zip_cd);
	}

	/**
	 *  請求書送付郵便番号.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 10, $bill_zip_cd, value);
	}


	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 11, $bill_addr1);
	}

	/**
	 *  請求書送付住所１.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 11, $bill_addr1, value);
	}


	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 12, $bill_addr2);
	}

	/**
	 *  請求書送付住所２.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 12, $bill_addr2, value);
	}


	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 13, $bill_addr3);
	}

	/**
	 *  請求書送付住所３.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 13, $bill_addr3, value);
	}


	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 14, $bill_addr4);
	}

	/**
	 *  請求書送付住所４.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 14, $bill_addr4, value);
	}


	/**
	 *  請求書送付住所.<p>
	 *
	 */
	public String bill_addr() {
		return getConstString(offset + 15, $bill_addr);
	}

	/**
	 *  請求書送付住所.<p>
	 *
	 */
	public void bill_addr(String value) {
		setConstString(offset + 15, $bill_addr, value);
	}


	/**
	 *  請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 16, $bill_bcst_nm);
	}

	/**
	 *  請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 16, $bill_bcst_nm, value);
	}


	/**
	 *  請求先部署名.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 17, $bill_bcst_dpt);
	}

	/**
	 *  請求先部署名.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 17, $bill_bcst_dpt, value);
	}


	/**
	 *  請求先担当者名.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 18, $bill_bcst_psn);
	}

	/**
	 *  請求先担当者名.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 18, $bill_bcst_psn, value);
	}


	/**
	 *  請求先担当者敬称.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 19, $bill_bcst_psn_title);
	}

	/**
	 *  請求先担当者敬称.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 19, $bill_bcst_psn_title, value);
	}


	/**
	 *  請求書国名.<p>
	 *
	 */
	public String bill_cntry_nm() {
		return getConstString(offset + 20, $bill_cntry_nm);
	}

	/**
	 *  請求書国名.<p>
	 *
	 */
	public void bill_cntry_nm(String value) {
		setConstString(offset + 20, $bill_cntry_nm, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 21, $bill_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 21, $bill_tel, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 22, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 22, $co_cd, value);
	}


	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 23, $zip_cd);
	}

	/**
	 *  自社郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 23, $zip_cd, value);
	}


	/**
	 *  住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 24, $addr1);
	}

	/**
	 *  住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 24, $addr1, value);
	}


	/**
	 *  住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 25, $addr2);
	}

	/**
	 *  住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 25, $addr2, value);
	}


	/**
	 *  住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 26, $addr3);
	}

	/**
	 *  住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 26, $addr3, value);
	}


	/**
	 *  住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 27, $addr4);
	}

	/**
	 *  住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 27, $addr4, value);
	}


	/**
	 *  住所.<p>
	 *
	 */
	public String addr() {
		return getConstString(offset + 28, $addr);
	}

	/**
	 *  住所.<p>
	 *
	 */
	public void addr(String value) {
		setConstString(offset + 28, $addr, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 29, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 29, $co_nm, value);
	}


	/**
	 *  国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 30, $cntry_nm);
	}

	/**
	 *  国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 30, $cntry_nm, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 31, $bill_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 31, $bill_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 32, $dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 32, $dpt_nm, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 33, $dpt_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 33, $dpt_tel, value);
	}


	/**
	 *  事業者番号.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 34, $biz_co_no);
	}

	/**
	 *  事業者番号.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 34, $biz_co_no, value);
	}


	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 35, $bill_amt);
	}

	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}

	/**
	 *  ご請求金額（請求額）.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 35, $bill_amt, value);
	}


	/**
	 *  ご請求金額（請求額）文字列.<p>
	 *
	 */
	public String s_bill_amt() {
		return getConstString(offset + 36, $s_bill_amt);
	}

	/**
	 *  ご請求金額（請求額）文字列.<p>
	 *
	 */
	public void s_bill_amt(String value) {
		setConstString(offset + 36, $s_bill_amt, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 37, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 37, $cur_cd, value);
	}


	/**
	 *  ご請求金額（通貨名）.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 38, $cur_nm);
	}

	/**
	 *  ご請求金額（通貨名）.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 38, $cur_nm, value);
	}


	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 39, $base_cur_cd);
	}

	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 39, $base_cur_cd, value);
	}


	/**
	 *  基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 40, $base_cur_nm);
	}

	/**
	 *  基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 40, $base_cur_nm, value);
	}


	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 41, $last_bill_amt);
	}

	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 41, $last_bill_amt, value);
	}

	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 41, $last_bill_amt, value);
	}

	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 41, $last_bill_amt, value);
	}

	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 41, $last_bill_amt, value);
	}

	/**
	 *  前回ご請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 41, $last_bill_amt, value);
	}


	/**
	 *  前回ご請求額文字列.<p>
	 *
	 */
	public String s_last_bill_amt() {
		return getConstString(offset + 42, $s_last_bill_amt);
	}

	/**
	 *  前回ご請求額文字列.<p>
	 *
	 */
	public void s_last_bill_amt(String value) {
		setConstString(offset + 42, $s_last_bill_amt, value);
	}


	/**
	 *  お支払い額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 43, $rcv_amt);
	}

	/**
	 *  お支払い額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 43, $rcv_amt, value);
	}

	/**
	 *  お支払い額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 43, $rcv_amt, value);
	}

	/**
	 *  お支払い額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 43, $rcv_amt, value);
	}

	/**
	 *  お支払い額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 43, $rcv_amt, value);
	}

	/**
	 *  お支払い額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 43, $rcv_amt, value);
	}


	/**
	 *  お支払い額文字列.<p>
	 *
	 */
	public String s_rcv_amt() {
		return getConstString(offset + 44, $s_rcv_amt);
	}

	/**
	 *  お支払い額文字列.<p>
	 *
	 */
	public void s_rcv_amt(String value) {
		setConstString(offset + 44, $s_rcv_amt, value);
	}


	/**
	 *  振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 45, $sw_amt);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 45, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 45, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 45, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 45, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 45, $sw_amt, value);
	}


	/**
	 *  振替額文字列.<p>
	 *
	 */
	public String s_sw_amt() {
		return getConstString(offset + 46, $s_sw_amt);
	}

	/**
	 *  振替額文字列.<p>
	 *
	 */
	public void s_sw_amt(String value) {
		setConstString(offset + 46, $s_sw_amt, value);
	}


	/**
	 *  相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 47, $setoff_amt);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 47, $setoff_amt, value);
	}


	/**
	 *  相殺額文字列.<p>
	 *
	 */
	public String s_setoff_amt() {
		return getConstString(offset + 48, $s_setoff_amt);
	}

	/**
	 *  相殺額文字列.<p>
	 *
	 */
	public void s_setoff_amt(String value) {
		setConstString(offset + 48, $s_setoff_amt, value);
	}


	/**
	 *  相殺税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 49, $setoff_tax_amt);
	}

	/**
	 *  相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 49, $setoff_tax_amt, value);
	}

	/**
	 *  相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 49, $setoff_tax_amt, value);
	}

	/**
	 *  相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 49, $setoff_tax_amt, value);
	}

	/**
	 *  相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 49, $setoff_tax_amt, value);
	}

	/**
	 *  相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 49, $setoff_tax_amt, value);
	}


	/**
	 *  相殺税額文字列.<p>
	 *
	 */
	public String s_setoff_tax_amt() {
		return getConstString(offset + 50, $s_setoff_tax_amt);
	}

	/**
	 *  相殺税額文字列.<p>
	 *
	 */
	public void s_setoff_tax_amt(String value) {
		setConstString(offset + 50, $s_setoff_tax_amt, value);
	}


	/**
	 *  差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 51, $bfw_amt);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 51, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 51, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 51, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 51, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 51, $bfw_amt, value);
	}


	/**
	 *  差引繰越額文字列.<p>
	 *
	 */
	public String s_bfw_amt() {
		return getConstString(offset + 52, $s_bfw_amt);
	}

	/**
	 *  差引繰越額文字列.<p>
	 *
	 */
	public void s_bfw_amt(String value) {
		setConstString(offset + 52, $s_bfw_amt, value);
	}


	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 53, $sls_amt);
	}

	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 53, $sls_amt, value);
	}

	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 53, $sls_amt, value);
	}

	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 53, $sls_amt, value);
	}

	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 53, $sls_amt, value);
	}

	/**
	 *  今回お買上げ額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 53, $sls_amt, value);
	}


	/**
	 *  今回お買上げ額文字列.<p>
	 *
	 */
	public String s_sls_amt() {
		return getConstString(offset + 54, $s_sls_amt);
	}

	/**
	 *  今回お買上げ額文字列.<p>
	 *
	 */
	public void s_sls_amt(String value) {
		setConstString(offset + 54, $s_sls_amt, value);
	}


	/**
	 *  今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 55, $dscnt_amt);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 55, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 55, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 55, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 55, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 55, $dscnt_amt, value);
	}


	/**
	 *  今回値引額文字列.<p>
	 *
	 */
	public String s_dscnt_amt() {
		return getConstString(offset + 56, $s_dscnt_amt);
	}

	/**
	 *  今回値引額文字列.<p>
	 *
	 */
	public void s_dscnt_amt(String value) {
		setConstString(offset + 56, $s_dscnt_amt, value);
	}


	/**
	 *  今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 57, $ret_amt);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 57, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 57, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 57, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 57, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 57, $ret_amt, value);
	}


	/**
	 *  今回返品額文字列.<p>
	 *
	 */
	public String s_ret_amt() {
		return getConstString(offset + 58, $s_ret_amt);
	}

	/**
	 *  今回返品額文字列.<p>
	 *
	 */
	public void s_ret_amt(String value) {
		setConstString(offset + 58, $s_ret_amt, value);
	}


	/**
	 *  税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 59, $tax_amt);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 59, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 59, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 59, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 59, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 59, $tax_amt, value);
	}


	/**
	 *  税額文字列.<p>
	 *
	 */
	public String s_tax_amt() {
		return getConstString(offset + 60, $s_tax_amt);
	}

	/**
	 *  税額文字列.<p>
	 *
	 */
	public void s_tax_amt(String value) {
		setConstString(offset + 60, $s_tax_amt, value);
	}


	/**
	 *  今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 61, $sw_to_amt);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 61, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 61, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 61, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 61, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 61, $sw_to_amt, value);
	}


	/**
	 *  今回振替額文字列.<p>
	 *
	 */
	public String s_sw_to_amt() {
		return getConstString(offset + 62, $s_sw_to_amt);
	}

	/**
	 *  今回振替額文字列.<p>
	 *
	 */
	public void s_sw_to_amt(String value) {
		setConstString(offset + 62, $s_sw_to_amt, value);
	}


	/**
	 *  前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 63, $adv_amt_bal);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 63, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 63, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 63, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 63, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 63, $adv_amt_bal, value);
	}


	/**
	 *  前受金残高文字列.<p>
	 *
	 */
	public String s_adv_amt_bal() {
		return getConstString(offset + 64, $s_adv_amt_bal);
	}

	/**
	 *  前受金残高文字列.<p>
	 *
	 */
	public void s_adv_amt_bal(String value) {
		setConstString(offset + 64, $s_adv_amt_bal, value);
	}


	/**
	 *  前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 65, $adv_amt);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 65, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 65, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 65, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 65, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 65, $adv_amt, value);
	}


	/**
	 *  前受金入金額文字列.<p>
	 *
	 */
	public String s_adv_amt() {
		return getConstString(offset + 66, $s_adv_amt);
	}

	/**
	 *  前受金入金額文字列.<p>
	 *
	 */
	public void s_adv_amt(String value) {
		setConstString(offset + 66, $s_adv_amt, value);
	}


	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 67, $adv_setoff_amt);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 67, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 67, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 67, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 67, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 67, $adv_setoff_amt, value);
	}


	/**
	 *  前受金相殺額文字列.<p>
	 *
	 */
	public String s_adv_setoff_amt() {
		return getConstString(offset + 68, $s_adv_setoff_amt);
	}

	/**
	 *  前受金相殺額文字列.<p>
	 *
	 */
	public void s_adv_setoff_amt(String value) {
		setConstString(offset + 68, $s_adv_setoff_amt, value);
	}


	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 69, $adv_setoff_tax_amt);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 69, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 69, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 69, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 69, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 69, $adv_setoff_tax_amt, value);
	}


	/**
	 *  前受金相殺税額文字列.<p>
	 *
	 */
	public String s_adv_setoff_tax_amt() {
		return getConstString(offset + 70, $s_adv_setoff_tax_amt);
	}

	/**
	 *  前受金相殺税額文字列.<p>
	 *
	 */
	public void s_adv_setoff_tax_amt(String value) {
		setConstString(offset + 70, $s_adv_setoff_tax_amt, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 71, $bill_xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 71, $bill_xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 71, $bill_xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 71, $bill_xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 71, $bill_xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 71, $bill_xrate, value);
	}


	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public String s_bill_xrate() {
		return getConstString(offset + 72, $s_bill_xrate);
	}

	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public void s_bill_xrate(String value) {
		setConstString(offset + 72, $s_bill_xrate, value);
	}


	/**
	 *  税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 73, $tax_rate1);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 73, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 73, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 73, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 73, $tax_rate1, value);
	}


	/**
	 *  税率１文字列.<p>
	 *
	 */
	public String s_tax_rate1() {
		return getConstString(offset + 74, $s_tax_rate1);
	}

	/**
	 *  税率１文字列.<p>
	 *
	 */
	public void s_tax_rate1(String value) {
		setConstString(offset + 74, $s_tax_rate1, value);
	}


	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 75, $tax_rate_sls_amt1);
	}

	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎お買上げ額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt1, value);
	}


	/**
	 *  税率毎お買上げ額１文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt1() {
		return getConstString(offset + 76, $s_tax_rate_sls_amt1);
	}

	/**
	 *  税率毎お買上げ額１文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt1(String value) {
		setConstString(offset + 76, $s_tax_rate_sls_amt1, value);
	}


	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 77, $tax_rate_tax_amt1);
	}

	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎消費税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt1, value);
	}


	/**
	 *  税率毎消費税額１文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt1() {
		return getConstString(offset + 78, $s_tax_rate_tax_amt1);
	}

	/**
	 *  税率毎消費税額１文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt1(String value) {
		setConstString(offset + 78, $s_tax_rate_tax_amt1, value);
	}


	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 79, $tax_rate_base_tax_amt1);
	}

	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨消費税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 79, $tax_rate_base_tax_amt1, value);
	}


	/**
	 *  税率毎基準通貨消費税額１文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt1() {
		return getConstString(offset + 80, $s_tax_rate_base_tax_amt1);
	}

	/**
	 *  税率毎基準通貨消費税額１文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt1(String value) {
		setConstString(offset + 80, $s_tax_rate_base_tax_amt1, value);
	}


	/**
	 *  税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 81, $tax_rate2);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 81, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 81, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 81, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 81, $tax_rate2, value);
	}


	/**
	 *  税率２文字列.<p>
	 *
	 */
	public String s_tax_rate2() {
		return getConstString(offset + 82, $s_tax_rate2);
	}

	/**
	 *  税率２文字列.<p>
	 *
	 */
	public void s_tax_rate2(String value) {
		setConstString(offset + 82, $s_tax_rate2, value);
	}


	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 83, $tax_rate_sls_amt2);
	}

	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎お買上げ額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt2, value);
	}


	/**
	 *  税率毎お買上げ額２文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt2() {
		return getConstString(offset + 84, $s_tax_rate_sls_amt2);
	}

	/**
	 *  税率毎お買上げ額２文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt2(String value) {
		setConstString(offset + 84, $s_tax_rate_sls_amt2, value);
	}


	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 85, $tax_rate_tax_amt2);
	}

	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎消費税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt2, value);
	}


	/**
	 *  税率毎消費税額２文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt2() {
		return getConstString(offset + 86, $s_tax_rate_tax_amt2);
	}

	/**
	 *  税率毎消費税額２文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt2(String value) {
		setConstString(offset + 86, $s_tax_rate_tax_amt2, value);
	}


	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 87, $tax_rate_base_tax_amt2);
	}

	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 87, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 87, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 87, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 87, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨消費税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 87, $tax_rate_base_tax_amt2, value);
	}


	/**
	 *  税率毎基準通貨消費税額２文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt2() {
		return getConstString(offset + 88, $s_tax_rate_base_tax_amt2);
	}

	/**
	 *  税率毎基準通貨消費税額２文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt2(String value) {
		setConstString(offset + 88, $s_tax_rate_base_tax_amt2, value);
	}


	/**
	 *  税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 89, $tax_rate3);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 89, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 89, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 89, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 89, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 89, $tax_rate3, value);
	}


	/**
	 *  税率３文字列.<p>
	 *
	 */
	public String s_tax_rate3() {
		return getConstString(offset + 90, $s_tax_rate3);
	}

	/**
	 *  税率３文字列.<p>
	 *
	 */
	public void s_tax_rate3(String value) {
		setConstString(offset + 90, $s_tax_rate3, value);
	}


	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 91, $tax_rate_sls_amt3);
	}

	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎お買上げ額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt3, value);
	}


	/**
	 *  税率毎お買上げ額３文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt3() {
		return getConstString(offset + 92, $s_tax_rate_sls_amt3);
	}

	/**
	 *  税率毎お買上げ額３文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt3(String value) {
		setConstString(offset + 92, $s_tax_rate_sls_amt3, value);
	}


	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 93, $tax_rate_tax_amt3);
	}

	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎消費税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 93, $tax_rate_tax_amt3, value);
	}


	/**
	 *  税率毎消費税額３文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt3() {
		return getConstString(offset + 94, $s_tax_rate_tax_amt3);
	}

	/**
	 *  税率毎消費税額３文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt3(String value) {
		setConstString(offset + 94, $s_tax_rate_tax_amt3, value);
	}


	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 95, $tax_rate_base_tax_amt3);
	}

	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 95, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 95, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 95, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 95, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨消費税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 95, $tax_rate_base_tax_amt3, value);
	}


	/**
	 *  税率毎基準通貨消費税額３文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt3() {
		return getConstString(offset + 96, $s_tax_rate_base_tax_amt3);
	}

	/**
	 *  税率毎基準通貨消費税額３文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt3(String value) {
		setConstString(offset + 96, $s_tax_rate_base_tax_amt3, value);
	}


	/**
	 *  税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 97, $tax_rate4);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 97, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 97, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 97, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 97, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 97, $tax_rate4, value);
	}


	/**
	 *  税率４文字列.<p>
	 *
	 */
	public String s_tax_rate4() {
		return getConstString(offset + 98, $s_tax_rate4);
	}

	/**
	 *  税率４文字列.<p>
	 *
	 */
	public void s_tax_rate4(String value) {
		setConstString(offset + 98, $s_tax_rate4, value);
	}


	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 99, $tax_rate_sls_amt4);
	}

	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 99, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 99, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 99, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 99, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎お買上げ額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 99, $tax_rate_sls_amt4, value);
	}


	/**
	 *  税率毎お買上げ額４文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt4() {
		return getConstString(offset + 100, $s_tax_rate_sls_amt4);
	}

	/**
	 *  税率毎お買上げ額４文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt4(String value) {
		setConstString(offset + 100, $s_tax_rate_sls_amt4, value);
	}


	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 101, $tax_rate_tax_amt4);
	}

	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 101, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 101, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 101, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 101, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎消費税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 101, $tax_rate_tax_amt4, value);
	}


	/**
	 *  税率毎消費税額４文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt4() {
		return getConstString(offset + 102, $s_tax_rate_tax_amt4);
	}

	/**
	 *  税率毎消費税額４文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt4(String value) {
		setConstString(offset + 102, $s_tax_rate_tax_amt4, value);
	}


	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 103, $tax_rate_base_tax_amt4);
	}

	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 103, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 103, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 103, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 103, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨消費税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 103, $tax_rate_base_tax_amt4, value);
	}


	/**
	 *  税率毎基準通貨消費税額４文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt4() {
		return getConstString(offset + 104, $s_tax_rate_base_tax_amt4);
	}

	/**
	 *  税率毎基準通貨消費税額４文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt4(String value) {
		setConstString(offset + 104, $s_tax_rate_base_tax_amt4, value);
	}


	/**
	 *  税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 105, $tax_rate5);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 105, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 105, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 105, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 105, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 105, $tax_rate5, value);
	}


	/**
	 *  税率５文字列.<p>
	 *
	 */
	public String s_tax_rate5() {
		return getConstString(offset + 106, $s_tax_rate5);
	}

	/**
	 *  税率５文字列.<p>
	 *
	 */
	public void s_tax_rate5(String value) {
		setConstString(offset + 106, $s_tax_rate5, value);
	}


	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 107, $tax_rate_sls_amt5);
	}

	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 107, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 107, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 107, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 107, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎お買上げ額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 107, $tax_rate_sls_amt5, value);
	}


	/**
	 *  税率毎お買上げ額５文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt5() {
		return getConstString(offset + 108, $s_tax_rate_sls_amt5);
	}

	/**
	 *  税率毎お買上げ額５文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt5(String value) {
		setConstString(offset + 108, $s_tax_rate_sls_amt5, value);
	}


	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 109, $tax_rate_tax_amt5);
	}

	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 109, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 109, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 109, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 109, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎消費税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 109, $tax_rate_tax_amt5, value);
	}


	/**
	 *  税率毎消費税額５文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt5() {
		return getConstString(offset + 110, $s_tax_rate_tax_amt5);
	}

	/**
	 *  税率毎消費税額５文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt5(String value) {
		setConstString(offset + 110, $s_tax_rate_tax_amt5, value);
	}


	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 111, $tax_rate_base_tax_amt5);
	}

	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 111, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 111, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 111, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 111, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨消費税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 111, $tax_rate_base_tax_amt5, value);
	}


	/**
	 *  税率毎基準通貨消費税額５文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt5() {
		return getConstString(offset + 112, $s_tax_rate_base_tax_amt5);
	}

	/**
	 *  税率毎基準通貨消費税額５文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt5(String value) {
		setConstString(offset + 112, $s_tax_rate_base_tax_amt5, value);
	}


	/**
	 *  税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 113, $tax_rate6);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 113, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 113, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 113, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 113, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 113, $tax_rate6, value);
	}


	/**
	 *  税率６文字列.<p>
	 *
	 */
	public String s_tax_rate6() {
		return getConstString(offset + 114, $s_tax_rate6);
	}

	/**
	 *  税率６文字列.<p>
	 *
	 */
	public void s_tax_rate6(String value) {
		setConstString(offset + 114, $s_tax_rate6, value);
	}


	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 115, $tax_rate_sls_amt6);
	}

	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 115, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 115, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 115, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 115, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎お買上げ額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 115, $tax_rate_sls_amt6, value);
	}


	/**
	 *  税率毎お買上げ額６文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt6() {
		return getConstString(offset + 116, $s_tax_rate_sls_amt6);
	}

	/**
	 *  税率毎お買上げ額６文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt6(String value) {
		setConstString(offset + 116, $s_tax_rate_sls_amt6, value);
	}


	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 117, $tax_rate_tax_amt6);
	}

	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 117, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 117, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 117, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 117, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎消費税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 117, $tax_rate_tax_amt6, value);
	}


	/**
	 *  税率毎消費税額６文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt6() {
		return getConstString(offset + 118, $s_tax_rate_tax_amt6);
	}

	/**
	 *  税率毎消費税額６文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt6(String value) {
		setConstString(offset + 118, $s_tax_rate_tax_amt6, value);
	}


	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 119, $tax_rate_base_tax_amt6);
	}

	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 119, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 119, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 119, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 119, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨消費税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 119, $tax_rate_base_tax_amt6, value);
	}


	/**
	 *  税率毎基準通貨消費税額６文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt6() {
		return getConstString(offset + 120, $s_tax_rate_base_tax_amt6);
	}

	/**
	 *  税率毎基準通貨消費税額６文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt6(String value) {
		setConstString(offset + 120, $s_tax_rate_base_tax_amt6, value);
	}


	/**
	 *  税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 121, $tax_rate7);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 121, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 121, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 121, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 121, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 121, $tax_rate7, value);
	}


	/**
	 *  税率７文字列.<p>
	 *
	 */
	public String s_tax_rate7() {
		return getConstString(offset + 122, $s_tax_rate7);
	}

	/**
	 *  税率７文字列.<p>
	 *
	 */
	public void s_tax_rate7(String value) {
		setConstString(offset + 122, $s_tax_rate7, value);
	}


	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 123, $tax_rate_sls_amt7);
	}

	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 123, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 123, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 123, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 123, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎お買上げ額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 123, $tax_rate_sls_amt7, value);
	}


	/**
	 *  税率毎お買上げ額７文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt7() {
		return getConstString(offset + 124, $s_tax_rate_sls_amt7);
	}

	/**
	 *  税率毎お買上げ額７文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt7(String value) {
		setConstString(offset + 124, $s_tax_rate_sls_amt7, value);
	}


	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 125, $tax_rate_tax_amt7);
	}

	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 125, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 125, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 125, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 125, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎消費税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 125, $tax_rate_tax_amt7, value);
	}


	/**
	 *  税率毎消費税額７文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt7() {
		return getConstString(offset + 126, $s_tax_rate_tax_amt7);
	}

	/**
	 *  税率毎消費税額７文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt7(String value) {
		setConstString(offset + 126, $s_tax_rate_tax_amt7, value);
	}


	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 127, $tax_rate_base_tax_amt7);
	}

	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 127, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 127, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 127, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 127, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨消費税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 127, $tax_rate_base_tax_amt7, value);
	}


	/**
	 *  税率毎基準通貨消費税額７文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt7() {
		return getConstString(offset + 128, $s_tax_rate_base_tax_amt7);
	}

	/**
	 *  税率毎基準通貨消費税額７文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt7(String value) {
		setConstString(offset + 128, $s_tax_rate_base_tax_amt7, value);
	}


	/**
	 *  税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 129, $tax_rate8);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 129, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 129, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 129, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 129, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 129, $tax_rate8, value);
	}


	/**
	 *  税率８文字列.<p>
	 *
	 */
	public String s_tax_rate8() {
		return getConstString(offset + 130, $s_tax_rate8);
	}

	/**
	 *  税率８文字列.<p>
	 *
	 */
	public void s_tax_rate8(String value) {
		setConstString(offset + 130, $s_tax_rate8, value);
	}


	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 131, $tax_rate_sls_amt8);
	}

	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 131, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 131, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 131, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 131, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎お買上げ額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 131, $tax_rate_sls_amt8, value);
	}


	/**
	 *  税率毎お買上げ額８文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt8() {
		return getConstString(offset + 132, $s_tax_rate_sls_amt8);
	}

	/**
	 *  税率毎お買上げ額８文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt8(String value) {
		setConstString(offset + 132, $s_tax_rate_sls_amt8, value);
	}


	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 133, $tax_rate_tax_amt8);
	}

	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 133, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 133, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 133, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 133, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎消費税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 133, $tax_rate_tax_amt8, value);
	}


	/**
	 *  税率毎消費税額８文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt8() {
		return getConstString(offset + 134, $s_tax_rate_tax_amt8);
	}

	/**
	 *  税率毎消費税額８文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt8(String value) {
		setConstString(offset + 134, $s_tax_rate_tax_amt8, value);
	}


	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 135, $tax_rate_base_tax_amt8);
	}

	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 135, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 135, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 135, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 135, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨消費税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 135, $tax_rate_base_tax_amt8, value);
	}


	/**
	 *  税率毎基準通貨消費税額８文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt8() {
		return getConstString(offset + 136, $s_tax_rate_base_tax_amt8);
	}

	/**
	 *  税率毎基準通貨消費税額８文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt8(String value) {
		setConstString(offset + 136, $s_tax_rate_base_tax_amt8, value);
	}


	/**
	 *  税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 137, $tax_rate9);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 137, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 137, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 137, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 137, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 137, $tax_rate9, value);
	}


	/**
	 *  税率９文字列.<p>
	 *
	 */
	public String s_tax_rate9() {
		return getConstString(offset + 138, $s_tax_rate9);
	}

	/**
	 *  税率９文字列.<p>
	 *
	 */
	public void s_tax_rate9(String value) {
		setConstString(offset + 138, $s_tax_rate9, value);
	}


	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 139, $tax_rate_sls_amt9);
	}

	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 139, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 139, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 139, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 139, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎お買上げ額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 139, $tax_rate_sls_amt9, value);
	}


	/**
	 *  税率毎お買上げ額９文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt9() {
		return getConstString(offset + 140, $s_tax_rate_sls_amt9);
	}

	/**
	 *  税率毎お買上げ額９文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt9(String value) {
		setConstString(offset + 140, $s_tax_rate_sls_amt9, value);
	}


	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 141, $tax_rate_tax_amt9);
	}

	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 141, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 141, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 141, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 141, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎消費税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 141, $tax_rate_tax_amt9, value);
	}


	/**
	 *  税率毎消費税額９文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt9() {
		return getConstString(offset + 142, $s_tax_rate_tax_amt9);
	}

	/**
	 *  税率毎消費税額９文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt9(String value) {
		setConstString(offset + 142, $s_tax_rate_tax_amt9, value);
	}


	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 143, $tax_rate_base_tax_amt9);
	}

	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 143, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 143, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 143, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 143, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨消費税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 143, $tax_rate_base_tax_amt9, value);
	}


	/**
	 *  税率毎基準通貨消費税額９文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt9() {
		return getConstString(offset + 144, $s_tax_rate_base_tax_amt9);
	}

	/**
	 *  税率毎基準通貨消費税額９文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt9(String value) {
		setConstString(offset + 144, $s_tax_rate_base_tax_amt9, value);
	}


	/**
	 *  税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 145, $tax_rate10);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 145, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 145, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 145, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 145, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 145, $tax_rate10, value);
	}


	/**
	 *  税率１０文字列.<p>
	 *
	 */
	public String s_tax_rate10() {
		return getConstString(offset + 146, $s_tax_rate10);
	}

	/**
	 *  税率１０文字列.<p>
	 *
	 */
	public void s_tax_rate10(String value) {
		setConstString(offset + 146, $s_tax_rate10, value);
	}


	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 147, $tax_rate_sls_amt10);
	}

	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 147, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 147, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 147, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 147, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎お買上げ額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 147, $tax_rate_sls_amt10, value);
	}


	/**
	 *  税率毎お買上げ額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_sls_amt10() {
		return getConstString(offset + 148, $s_tax_rate_sls_amt10);
	}

	/**
	 *  税率毎お買上げ額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_sls_amt10(String value) {
		setConstString(offset + 148, $s_tax_rate_sls_amt10, value);
	}


	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 149, $tax_rate_tax_amt10);
	}

	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 149, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 149, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 149, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 149, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎消費税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 149, $tax_rate_tax_amt10, value);
	}


	/**
	 *  税率毎消費税額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt10() {
		return getConstString(offset + 150, $s_tax_rate_tax_amt10);
	}

	/**
	 *  税率毎消費税額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt10(String value) {
		setConstString(offset + 150, $s_tax_rate_tax_amt10, value);
	}


	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 151, $tax_rate_base_tax_amt10);
	}

	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 151, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 151, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 151, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 151, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨消費税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 151, $tax_rate_base_tax_amt10, value);
	}


	/**
	 *  税率毎基準通貨消費税額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt10() {
		return getConstString(offset + 152, $s_tax_rate_base_tax_amt10);
	}

	/**
	 *  税率毎基準通貨消費税額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt10(String value) {
		setConstString(offset + 152, $s_tax_rate_base_tax_amt10, value);
	}


	/**
	 *  お支払期限１.<p>
	 *
	 */
	public MCDate rcv_schd_dt1() {
		return getConstDate(offset + 153, $rcv_schd_dt1);
	}

	/**
	 *  お支払期限１.<p>
	 *
	 */
	public void rcv_schd_dt1(MCDate value) {
		setConstDate(offset + 153, $rcv_schd_dt1, value);
	}


	/**
	 *  お支払方法１.<p>
	 *
	 */
	public String rcv_mtd_cd1() {
		return getConstString(offset + 154, $rcv_mtd_cd1);
	}

	/**
	 *  お支払方法１.<p>
	 *
	 */
	public void rcv_mtd_cd1(String value) {
		setConstString(offset + 154, $rcv_mtd_cd1, value);
	}


	/**
	 *  お支払方法１.<p>
	 *
	 */
	public String sttl_nm1() {
		return getConstString(offset + 155, $sttl_nm1);
	}

	/**
	 *  お支払方法１.<p>
	 *
	 */
	public void sttl_nm1(String value) {
		setConstString(offset + 155, $sttl_nm1, value);
	}


	/**
	 *  お支払金額１.<p>
	 *
	 */
	public MCNumber rcv_schd_amt1() {
		return getConstNumber(offset + 156, $rcv_schd_amt1);
	}

	/**
	 *  お支払金額１.<p>
	 *
	 */
	public void rcv_schd_amt1(MCNumber value) {
		setConstNumber(offset + 156, $rcv_schd_amt1, value);
	}

	/**
	 *  お支払金額１.<p>
	 *
	 */
	public void rcv_schd_amt1(int value) {
		setConstNumber(offset + 156, $rcv_schd_amt1, value);
	}

	/**
	 *  お支払金額１.<p>
	 *
	 */
	public void rcv_schd_amt1(long value) {
		setConstNumber(offset + 156, $rcv_schd_amt1, value);
	}

	/**
	 *  お支払金額１.<p>
	 *
	 */
	public void rcv_schd_amt1(float value) {
		setConstNumber(offset + 156, $rcv_schd_amt1, value);
	}

	/**
	 *  お支払金額１.<p>
	 *
	 */
	public void rcv_schd_amt1(double value) {
		setConstNumber(offset + 156, $rcv_schd_amt1, value);
	}


	/**
	 *  お支払金額１文字列.<p>
	 *
	 */
	public String s_rcv_schd_amt1() {
		return getConstString(offset + 157, $s_rcv_schd_amt1);
	}

	/**
	 *  お支払金額１文字列.<p>
	 *
	 */
	public void s_rcv_schd_amt1(String value) {
		setConstString(offset + 157, $s_rcv_schd_amt1, value);
	}


	/**
	 *  お支払期限２.<p>
	 *
	 */
	public MCDate rcv_schd_dt2() {
		return getConstDate(offset + 158, $rcv_schd_dt2);
	}

	/**
	 *  お支払期限２.<p>
	 *
	 */
	public void rcv_schd_dt2(MCDate value) {
		setConstDate(offset + 158, $rcv_schd_dt2, value);
	}


	/**
	 *  お支払方法２.<p>
	 *
	 */
	public String rcv_mtd_cd2() {
		return getConstString(offset + 159, $rcv_mtd_cd2);
	}

	/**
	 *  お支払方法２.<p>
	 *
	 */
	public void rcv_mtd_cd2(String value) {
		setConstString(offset + 159, $rcv_mtd_cd2, value);
	}


	/**
	 *  お支払方法２.<p>
	 *
	 */
	public String sttl_nm2() {
		return getConstString(offset + 160, $sttl_nm2);
	}

	/**
	 *  お支払方法２.<p>
	 *
	 */
	public void sttl_nm2(String value) {
		setConstString(offset + 160, $sttl_nm2, value);
	}


	/**
	 *  お支払金額２.<p>
	 *
	 */
	public MCNumber rcv_schd_amt2() {
		return getConstNumber(offset + 161, $rcv_schd_amt2);
	}

	/**
	 *  お支払金額２.<p>
	 *
	 */
	public void rcv_schd_amt2(MCNumber value) {
		setConstNumber(offset + 161, $rcv_schd_amt2, value);
	}

	/**
	 *  お支払金額２.<p>
	 *
	 */
	public void rcv_schd_amt2(int value) {
		setConstNumber(offset + 161, $rcv_schd_amt2, value);
	}

	/**
	 *  お支払金額２.<p>
	 *
	 */
	public void rcv_schd_amt2(long value) {
		setConstNumber(offset + 161, $rcv_schd_amt2, value);
	}

	/**
	 *  お支払金額２.<p>
	 *
	 */
	public void rcv_schd_amt2(float value) {
		setConstNumber(offset + 161, $rcv_schd_amt2, value);
	}

	/**
	 *  お支払金額２.<p>
	 *
	 */
	public void rcv_schd_amt2(double value) {
		setConstNumber(offset + 161, $rcv_schd_amt2, value);
	}


	/**
	 *  お支払金額２文字列.<p>
	 *
	 */
	public String s_rcv_schd_amt2() {
		return getConstString(offset + 162, $s_rcv_schd_amt2);
	}

	/**
	 *  お支払金額２文字列.<p>
	 *
	 */
	public void s_rcv_schd_amt2(String value) {
		setConstString(offset + 162, $s_rcv_schd_amt2, value);
	}


	/**
	 *  お支払期限３.<p>
	 *
	 */
	public MCDate rcv_schd_dt3() {
		return getConstDate(offset + 163, $rcv_schd_dt3);
	}

	/**
	 *  お支払期限３.<p>
	 *
	 */
	public void rcv_schd_dt3(MCDate value) {
		setConstDate(offset + 163, $rcv_schd_dt3, value);
	}


	/**
	 *  お支払方法３.<p>
	 *
	 */
	public String rcv_mtd_cd3() {
		return getConstString(offset + 164, $rcv_mtd_cd3);
	}

	/**
	 *  お支払方法３.<p>
	 *
	 */
	public void rcv_mtd_cd3(String value) {
		setConstString(offset + 164, $rcv_mtd_cd3, value);
	}


	/**
	 *  お支払方法３.<p>
	 *
	 */
	public String sttl_nm3() {
		return getConstString(offset + 165, $sttl_nm3);
	}

	/**
	 *  お支払方法３.<p>
	 *
	 */
	public void sttl_nm3(String value) {
		setConstString(offset + 165, $sttl_nm3, value);
	}


	/**
	 *  お支払金額３.<p>
	 *
	 */
	public MCNumber rcv_schd_amt3() {
		return getConstNumber(offset + 166, $rcv_schd_amt3);
	}

	/**
	 *  お支払金額３.<p>
	 *
	 */
	public void rcv_schd_amt3(MCNumber value) {
		setConstNumber(offset + 166, $rcv_schd_amt3, value);
	}

	/**
	 *  お支払金額３.<p>
	 *
	 */
	public void rcv_schd_amt3(int value) {
		setConstNumber(offset + 166, $rcv_schd_amt3, value);
	}

	/**
	 *  お支払金額３.<p>
	 *
	 */
	public void rcv_schd_amt3(long value) {
		setConstNumber(offset + 166, $rcv_schd_amt3, value);
	}

	/**
	 *  お支払金額３.<p>
	 *
	 */
	public void rcv_schd_amt3(float value) {
		setConstNumber(offset + 166, $rcv_schd_amt3, value);
	}

	/**
	 *  お支払金額３.<p>
	 *
	 */
	public void rcv_schd_amt3(double value) {
		setConstNumber(offset + 166, $rcv_schd_amt3, value);
	}


	/**
	 *  お支払金額３文字列.<p>
	 *
	 */
	public String s_rcv_schd_amt3() {
		return getConstString(offset + 167, $s_rcv_schd_amt3);
	}

	/**
	 *  お支払金額３文字列.<p>
	 *
	 */
	public void s_rcv_schd_amt3(String value) {
		setConstString(offset + 167, $s_rcv_schd_amt3, value);
	}


	/**
	 *  お支払期限４.<p>
	 *
	 */
	public MCDate rcv_schd_dt4() {
		return getConstDate(offset + 168, $rcv_schd_dt4);
	}

	/**
	 *  お支払期限４.<p>
	 *
	 */
	public void rcv_schd_dt4(MCDate value) {
		setConstDate(offset + 168, $rcv_schd_dt4, value);
	}


	/**
	 *  お支払方法４.<p>
	 *
	 */
	public String rcv_mtd_cd4() {
		return getConstString(offset + 169, $rcv_mtd_cd4);
	}

	/**
	 *  お支払方法４.<p>
	 *
	 */
	public void rcv_mtd_cd4(String value) {
		setConstString(offset + 169, $rcv_mtd_cd4, value);
	}


	/**
	 *  お支払方法４.<p>
	 *
	 */
	public String sttl_nm4() {
		return getConstString(offset + 170, $sttl_nm4);
	}

	/**
	 *  お支払方法４.<p>
	 *
	 */
	public void sttl_nm4(String value) {
		setConstString(offset + 170, $sttl_nm4, value);
	}


	/**
	 *  お支払金額４.<p>
	 *
	 */
	public MCNumber rcv_schd_amt4() {
		return getConstNumber(offset + 171, $rcv_schd_amt4);
	}

	/**
	 *  お支払金額４.<p>
	 *
	 */
	public void rcv_schd_amt4(MCNumber value) {
		setConstNumber(offset + 171, $rcv_schd_amt4, value);
	}

	/**
	 *  お支払金額４.<p>
	 *
	 */
	public void rcv_schd_amt4(int value) {
		setConstNumber(offset + 171, $rcv_schd_amt4, value);
	}

	/**
	 *  お支払金額４.<p>
	 *
	 */
	public void rcv_schd_amt4(long value) {
		setConstNumber(offset + 171, $rcv_schd_amt4, value);
	}

	/**
	 *  お支払金額４.<p>
	 *
	 */
	public void rcv_schd_amt4(float value) {
		setConstNumber(offset + 171, $rcv_schd_amt4, value);
	}

	/**
	 *  お支払金額４.<p>
	 *
	 */
	public void rcv_schd_amt4(double value) {
		setConstNumber(offset + 171, $rcv_schd_amt4, value);
	}


	/**
	 *  お支払金額４文字列.<p>
	 *
	 */
	public String s_rcv_schd_amt4() {
		return getConstString(offset + 172, $s_rcv_schd_amt4);
	}

	/**
	 *  お支払金額４文字列.<p>
	 *
	 */
	public void s_rcv_schd_amt4(String value) {
		setConstString(offset + 172, $s_rcv_schd_amt4, value);
	}


	/**
	 *  お支払期限５.<p>
	 *
	 */
	public MCDate rcv_schd_dt5() {
		return getConstDate(offset + 173, $rcv_schd_dt5);
	}

	/**
	 *  お支払期限５.<p>
	 *
	 */
	public void rcv_schd_dt5(MCDate value) {
		setConstDate(offset + 173, $rcv_schd_dt5, value);
	}


	/**
	 *  お支払方法５.<p>
	 *
	 */
	public String rcv_mtd_cd5() {
		return getConstString(offset + 174, $rcv_mtd_cd5);
	}

	/**
	 *  お支払方法５.<p>
	 *
	 */
	public void rcv_mtd_cd5(String value) {
		setConstString(offset + 174, $rcv_mtd_cd5, value);
	}


	/**
	 *  お支払方法５.<p>
	 *
	 */
	public String sttl_nm5() {
		return getConstString(offset + 175, $sttl_nm5);
	}

	/**
	 *  お支払方法５.<p>
	 *
	 */
	public void sttl_nm5(String value) {
		setConstString(offset + 175, $sttl_nm5, value);
	}


	/**
	 *  お支払金額５.<p>
	 *
	 */
	public MCNumber rcv_schd_amt5() {
		return getConstNumber(offset + 176, $rcv_schd_amt5);
	}

	/**
	 *  お支払金額５.<p>
	 *
	 */
	public void rcv_schd_amt5(MCNumber value) {
		setConstNumber(offset + 176, $rcv_schd_amt5, value);
	}

	/**
	 *  お支払金額５.<p>
	 *
	 */
	public void rcv_schd_amt5(int value) {
		setConstNumber(offset + 176, $rcv_schd_amt5, value);
	}

	/**
	 *  お支払金額５.<p>
	 *
	 */
	public void rcv_schd_amt5(long value) {
		setConstNumber(offset + 176, $rcv_schd_amt5, value);
	}

	/**
	 *  お支払金額５.<p>
	 *
	 */
	public void rcv_schd_amt5(float value) {
		setConstNumber(offset + 176, $rcv_schd_amt5, value);
	}

	/**
	 *  お支払金額５.<p>
	 *
	 */
	public void rcv_schd_amt5(double value) {
		setConstNumber(offset + 176, $rcv_schd_amt5, value);
	}


	/**
	 *  お支払金額５文字列.<p>
	 *
	 */
	public String s_rcv_schd_amt5() {
		return getConstString(offset + 177, $s_rcv_schd_amt5);
	}

	/**
	 *  お支払金額５文字列.<p>
	 *
	 */
	public void s_rcv_schd_amt5(String value) {
		setConstString(offset + 177, $s_rcv_schd_amt5, value);
	}


	/**
	 *  銀行口座.<p>
	 *
	 */
	public String rcv_bank_ac_cd() {
		return getConstString(offset + 178, $rcv_bank_ac_cd);
	}

	/**
	 *  銀行口座.<p>
	 *
	 */
	public void rcv_bank_ac_cd(String value) {
		setConstString(offset + 178, $rcv_bank_ac_cd, value);
	}


	/**
	 *  銀行.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 179, $bank_cd);
	}

	/**
	 *  銀行.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 179, $bank_cd, value);
	}


	/**
	 *  振込口座（銀行名）.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 180, $bank_nm);
	}

	/**
	 *  振込口座（銀行名）.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 180, $bank_nm, value);
	}


	/**
	 *  支店.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 181, $bank_ac_cd);
	}

	/**
	 *  支店.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 181, $bank_ac_cd, value);
	}


	/**
	 *  振込口座（支店名）.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 182, $bank_ac_nm);
	}

	/**
	 *  振込口座（支店名）.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 182, $bank_ac_nm, value);
	}


	/**
	 *  口座区分.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 183, $bank_ac_typ);
	}

	/**
	 *  口座区分.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 183, $bank_ac_typ, value);
	}


	/**
	 *  振込口座（口座区分）.<p>
	 *
	 */
	public String bank_ac_typ_nm() {
		return getConstString(offset + 184, $bank_ac_typ_nm);
	}

	/**
	 *  振込口座（口座区分）.<p>
	 *
	 */
	public void bank_ac_typ_nm(String value) {
		setConstString(offset + 184, $bank_ac_typ_nm, value);
	}


	/**
	 *  振込口座（口座番号）.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 185, $bank_ac_no);
	}

	/**
	 *  振込口座（口座番号）.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 185, $bank_ac_no, value);
	}


	/**
	 *  口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 186, $bank_ac_holder);
	}

	/**
	 *  口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 186, $bank_ac_holder, value);
	}


	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public boolean bill_dtl_outp_flg() {
		return getConstBoolean(offset + 187, $bill_dtl_outp_flg);
	}

	/**
	 *  請求書明細出力ＦＬＧ.<p>
	 *
	 */
	public void bill_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 187, $bill_dtl_outp_flg, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 188, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 188, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 189, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 189, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 190, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 190, $sub_char3, value);
	}


	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public MCNumber hdr_page() {
		return getConstNumber(offset + 191, $hdr_page);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(MCNumber value) {
		setConstNumber(offset + 191, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(int value) {
		setConstNumber(offset + 191, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(long value) {
		setConstNumber(offset + 191, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(float value) {
		setConstNumber(offset + 191, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(double value) {
		setConstNumber(offset + 191, $hdr_page, value);
	}


	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public MCNumber hdr_page_sum() {
		return getConstNumber(offset + 192, $hdr_page_sum);
	}

	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public void hdr_page_sum(MCNumber value) {
		setConstNumber(offset + 192, $hdr_page_sum, value);
	}

	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public void hdr_page_sum(int value) {
		setConstNumber(offset + 192, $hdr_page_sum, value);
	}

	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public void hdr_page_sum(long value) {
		setConstNumber(offset + 192, $hdr_page_sum, value);
	}

	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public void hdr_page_sum(float value) {
		setConstNumber(offset + 192, $hdr_page_sum, value);
	}

	/**
	 *  ヘッダページ総数.<p>
	 *
	 */
	public void hdr_page_sum(double value) {
		setConstNumber(offset + 192, $hdr_page_sum, value);
	}


	public String getString(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
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
		if ($bill_addr.equalsIgnoreCase(name)) {
			return bill_addr();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_cntry_nm.equalsIgnoreCase(name)) {
			return bill_cntry_nm();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
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
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			return s_bill_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($s_last_bill_amt.equalsIgnoreCase(name)) {
			return s_last_bill_amt();
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			return s_rcv_amt();
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			return s_sw_amt();
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			return s_setoff_amt();
		}
		if ($s_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_setoff_tax_amt();
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			return s_bfw_amt();
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			return s_sls_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			return s_sw_to_amt();
		}
		if ($s_adv_amt_bal.equalsIgnoreCase(name)) {
			return s_adv_amt_bal();
		}
		if ($s_adv_amt.equalsIgnoreCase(name)) {
			return s_adv_amt();
		}
		if ($s_adv_setoff_amt.equalsIgnoreCase(name)) {
			return s_adv_setoff_amt();
		}
		if ($s_adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_adv_setoff_tax_amt();
		}
		if ($s_bill_xrate.equalsIgnoreCase(name)) {
			return s_bill_xrate();
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			return s_tax_rate1();
		}
		if ($s_tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt1();
		}
		if ($s_tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt1();
		}
		if ($s_tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt1();
		}
		if ($s_tax_rate2.equalsIgnoreCase(name)) {
			return s_tax_rate2();
		}
		if ($s_tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt2();
		}
		if ($s_tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt2();
		}
		if ($s_tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt2();
		}
		if ($s_tax_rate3.equalsIgnoreCase(name)) {
			return s_tax_rate3();
		}
		if ($s_tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt3();
		}
		if ($s_tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt3();
		}
		if ($s_tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt3();
		}
		if ($s_tax_rate4.equalsIgnoreCase(name)) {
			return s_tax_rate4();
		}
		if ($s_tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt4();
		}
		if ($s_tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt4();
		}
		if ($s_tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt4();
		}
		if ($s_tax_rate5.equalsIgnoreCase(name)) {
			return s_tax_rate5();
		}
		if ($s_tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt5();
		}
		if ($s_tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt5();
		}
		if ($s_tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt5();
		}
		if ($s_tax_rate6.equalsIgnoreCase(name)) {
			return s_tax_rate6();
		}
		if ($s_tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt6();
		}
		if ($s_tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt6();
		}
		if ($s_tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt6();
		}
		if ($s_tax_rate7.equalsIgnoreCase(name)) {
			return s_tax_rate7();
		}
		if ($s_tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt7();
		}
		if ($s_tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt7();
		}
		if ($s_tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt7();
		}
		if ($s_tax_rate8.equalsIgnoreCase(name)) {
			return s_tax_rate8();
		}
		if ($s_tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt8();
		}
		if ($s_tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt8();
		}
		if ($s_tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt8();
		}
		if ($s_tax_rate9.equalsIgnoreCase(name)) {
			return s_tax_rate9();
		}
		if ($s_tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt9();
		}
		if ($s_tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt9();
		}
		if ($s_tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt9();
		}
		if ($s_tax_rate10.equalsIgnoreCase(name)) {
			return s_tax_rate10();
		}
		if ($s_tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt10();
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt10();
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt10();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			return sttl_nm1();
		}
		if ($s_rcv_schd_amt1.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt1();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			return sttl_nm2();
		}
		if ($s_rcv_schd_amt2.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt2();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			return sttl_nm3();
		}
		if ($s_rcv_schd_amt3.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt3();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			return sttl_nm4();
		}
		if ($s_rcv_schd_amt4.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt4();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			return sttl_nm5();
		}
		if ($s_rcv_schd_amt5.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt5();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_typ_nm.equalsIgnoreCase(name)) {
			return bank_ac_typ_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			return hdr_page();
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			return hdr_page_sum();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
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
		if ($bill_addr.equalsIgnoreCase(name)) {
			return bill_addr();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($bill_cntry_nm.equalsIgnoreCase(name)) {
			return bill_cntry_nm();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
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
		if ($addr.equalsIgnoreCase(name)) {
			return addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			return s_bill_amt();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($s_last_bill_amt.equalsIgnoreCase(name)) {
			return s_last_bill_amt();
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			return s_rcv_amt();
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			return s_sw_amt();
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			return s_setoff_amt();
		}
		if ($s_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_setoff_tax_amt();
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			return s_bfw_amt();
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			return s_sls_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			return s_sw_to_amt();
		}
		if ($s_adv_amt_bal.equalsIgnoreCase(name)) {
			return s_adv_amt_bal();
		}
		if ($s_adv_amt.equalsIgnoreCase(name)) {
			return s_adv_amt();
		}
		if ($s_adv_setoff_amt.equalsIgnoreCase(name)) {
			return s_adv_setoff_amt();
		}
		if ($s_adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_adv_setoff_tax_amt();
		}
		if ($s_bill_xrate.equalsIgnoreCase(name)) {
			return s_bill_xrate();
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			return s_tax_rate1();
		}
		if ($s_tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt1();
		}
		if ($s_tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt1();
		}
		if ($s_tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt1();
		}
		if ($s_tax_rate2.equalsIgnoreCase(name)) {
			return s_tax_rate2();
		}
		if ($s_tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt2();
		}
		if ($s_tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt2();
		}
		if ($s_tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt2();
		}
		if ($s_tax_rate3.equalsIgnoreCase(name)) {
			return s_tax_rate3();
		}
		if ($s_tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt3();
		}
		if ($s_tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt3();
		}
		if ($s_tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt3();
		}
		if ($s_tax_rate4.equalsIgnoreCase(name)) {
			return s_tax_rate4();
		}
		if ($s_tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt4();
		}
		if ($s_tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt4();
		}
		if ($s_tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt4();
		}
		if ($s_tax_rate5.equalsIgnoreCase(name)) {
			return s_tax_rate5();
		}
		if ($s_tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt5();
		}
		if ($s_tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt5();
		}
		if ($s_tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt5();
		}
		if ($s_tax_rate6.equalsIgnoreCase(name)) {
			return s_tax_rate6();
		}
		if ($s_tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt6();
		}
		if ($s_tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt6();
		}
		if ($s_tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt6();
		}
		if ($s_tax_rate7.equalsIgnoreCase(name)) {
			return s_tax_rate7();
		}
		if ($s_tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt7();
		}
		if ($s_tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt7();
		}
		if ($s_tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt7();
		}
		if ($s_tax_rate8.equalsIgnoreCase(name)) {
			return s_tax_rate8();
		}
		if ($s_tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt8();
		}
		if ($s_tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt8();
		}
		if ($s_tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt8();
		}
		if ($s_tax_rate9.equalsIgnoreCase(name)) {
			return s_tax_rate9();
		}
		if ($s_tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt9();
		}
		if ($s_tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt9();
		}
		if ($s_tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt9();
		}
		if ($s_tax_rate10.equalsIgnoreCase(name)) {
			return s_tax_rate10();
		}
		if ($s_tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_sls_amt10();
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt10();
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt10();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			return sttl_nm1();
		}
		if ($s_rcv_schd_amt1.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt1();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			return sttl_nm2();
		}
		if ($s_rcv_schd_amt2.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt2();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			return sttl_nm3();
		}
		if ($s_rcv_schd_amt3.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt3();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			return sttl_nm4();
		}
		if ($s_rcv_schd_amt4.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt4();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			return sttl_nm5();
		}
		if ($s_rcv_schd_amt5.equalsIgnoreCase(name)) {
			return s_rcv_schd_amt5();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_typ_nm.equalsIgnoreCase(name)) {
			return bank_ac_typ_nm();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			return hdr_page();
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			return hdr_page_sum();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			return bill_dtl_outp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
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
		if ($bill_addr.equalsIgnoreCase(name)) {
			bill_addr(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_cntry_nm.equalsIgnoreCase(name)) {
			bill_cntry_nm(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
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
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			s_bill_amt(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($s_last_bill_amt.equalsIgnoreCase(name)) {
			s_last_bill_amt(value);
			return;
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			s_rcv_amt(value);
			return;
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			s_sw_amt(value);
			return;
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			s_setoff_amt(value);
			return;
		}
		if ($s_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_setoff_tax_amt(value);
			return;
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			s_bfw_amt(value);
			return;
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			s_sls_amt(value);
			return;
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			s_dscnt_amt(value);
			return;
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			s_ret_amt(value);
			return;
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			s_tax_amt(value);
			return;
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			s_sw_to_amt(value);
			return;
		}
		if ($s_adv_amt_bal.equalsIgnoreCase(name)) {
			s_adv_amt_bal(value);
			return;
		}
		if ($s_adv_amt.equalsIgnoreCase(name)) {
			s_adv_amt(value);
			return;
		}
		if ($s_adv_setoff_amt.equalsIgnoreCase(name)) {
			s_adv_setoff_amt(value);
			return;
		}
		if ($s_adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_adv_setoff_tax_amt(value);
			return;
		}
		if ($s_bill_xrate.equalsIgnoreCase(name)) {
			s_bill_xrate(value);
			return;
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			s_tax_rate1(value);
			return;
		}
		if ($s_tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt1(value);
			return;
		}
		if ($s_tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt1(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt1(value);
			return;
		}
		if ($s_tax_rate2.equalsIgnoreCase(name)) {
			s_tax_rate2(value);
			return;
		}
		if ($s_tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt2(value);
			return;
		}
		if ($s_tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt2(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt2(value);
			return;
		}
		if ($s_tax_rate3.equalsIgnoreCase(name)) {
			s_tax_rate3(value);
			return;
		}
		if ($s_tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt3(value);
			return;
		}
		if ($s_tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt3(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt3(value);
			return;
		}
		if ($s_tax_rate4.equalsIgnoreCase(name)) {
			s_tax_rate4(value);
			return;
		}
		if ($s_tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt4(value);
			return;
		}
		if ($s_tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt4(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt4(value);
			return;
		}
		if ($s_tax_rate5.equalsIgnoreCase(name)) {
			s_tax_rate5(value);
			return;
		}
		if ($s_tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt5(value);
			return;
		}
		if ($s_tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt5(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt5(value);
			return;
		}
		if ($s_tax_rate6.equalsIgnoreCase(name)) {
			s_tax_rate6(value);
			return;
		}
		if ($s_tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt6(value);
			return;
		}
		if ($s_tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt6(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt6(value);
			return;
		}
		if ($s_tax_rate7.equalsIgnoreCase(name)) {
			s_tax_rate7(value);
			return;
		}
		if ($s_tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt7(value);
			return;
		}
		if ($s_tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt7(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt7(value);
			return;
		}
		if ($s_tax_rate8.equalsIgnoreCase(name)) {
			s_tax_rate8(value);
			return;
		}
		if ($s_tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt8(value);
			return;
		}
		if ($s_tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt8(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt8(value);
			return;
		}
		if ($s_tax_rate9.equalsIgnoreCase(name)) {
			s_tax_rate9(value);
			return;
		}
		if ($s_tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt9(value);
			return;
		}
		if ($s_tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt9(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt9(value);
			return;
		}
		if ($s_tax_rate10.equalsIgnoreCase(name)) {
			s_tax_rate10(value);
			return;
		}
		if ($s_tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt10(value);
			return;
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt10(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt10(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			sttl_nm1(value);
			return;
		}
		if ($s_rcv_schd_amt1.equalsIgnoreCase(name)) {
			s_rcv_schd_amt1(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			sttl_nm2(value);
			return;
		}
		if ($s_rcv_schd_amt2.equalsIgnoreCase(name)) {
			s_rcv_schd_amt2(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			sttl_nm3(value);
			return;
		}
		if ($s_rcv_schd_amt3.equalsIgnoreCase(name)) {
			s_rcv_schd_amt3(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			sttl_nm4(value);
			return;
		}
		if ($s_rcv_schd_amt4.equalsIgnoreCase(name)) {
			s_rcv_schd_amt4(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			sttl_nm5(value);
			return;
		}
		if ($s_rcv_schd_amt5.equalsIgnoreCase(name)) {
			s_rcv_schd_amt5(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_typ_nm.equalsIgnoreCase(name)) {
			bank_ac_typ_nm(value);
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
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
		if ($bill_addr.equalsIgnoreCase(name)) {
			bill_addr(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($bill_cntry_nm.equalsIgnoreCase(name)) {
			bill_cntry_nm(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
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
		if ($addr.equalsIgnoreCase(name)) {
			addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($s_bill_amt.equalsIgnoreCase(name)) {
			s_bill_amt(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($s_last_bill_amt.equalsIgnoreCase(name)) {
			s_last_bill_amt(value);
			return;
		}
		if ($s_rcv_amt.equalsIgnoreCase(name)) {
			s_rcv_amt(value);
			return;
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			s_sw_amt(value);
			return;
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			s_setoff_amt(value);
			return;
		}
		if ($s_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_setoff_tax_amt(value);
			return;
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			s_bfw_amt(value);
			return;
		}
		if ($s_sls_amt.equalsIgnoreCase(name)) {
			s_sls_amt(value);
			return;
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			s_dscnt_amt(value);
			return;
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			s_ret_amt(value);
			return;
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			s_tax_amt(value);
			return;
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			s_sw_to_amt(value);
			return;
		}
		if ($s_adv_amt_bal.equalsIgnoreCase(name)) {
			s_adv_amt_bal(value);
			return;
		}
		if ($s_adv_amt.equalsIgnoreCase(name)) {
			s_adv_amt(value);
			return;
		}
		if ($s_adv_setoff_amt.equalsIgnoreCase(name)) {
			s_adv_setoff_amt(value);
			return;
		}
		if ($s_adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_adv_setoff_tax_amt(value);
			return;
		}
		if ($s_bill_xrate.equalsIgnoreCase(name)) {
			s_bill_xrate(value);
			return;
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			s_tax_rate1(value);
			return;
		}
		if ($s_tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt1(value);
			return;
		}
		if ($s_tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt1(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt1(value);
			return;
		}
		if ($s_tax_rate2.equalsIgnoreCase(name)) {
			s_tax_rate2(value);
			return;
		}
		if ($s_tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt2(value);
			return;
		}
		if ($s_tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt2(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt2(value);
			return;
		}
		if ($s_tax_rate3.equalsIgnoreCase(name)) {
			s_tax_rate3(value);
			return;
		}
		if ($s_tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt3(value);
			return;
		}
		if ($s_tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt3(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt3(value);
			return;
		}
		if ($s_tax_rate4.equalsIgnoreCase(name)) {
			s_tax_rate4(value);
			return;
		}
		if ($s_tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt4(value);
			return;
		}
		if ($s_tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt4(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt4(value);
			return;
		}
		if ($s_tax_rate5.equalsIgnoreCase(name)) {
			s_tax_rate5(value);
			return;
		}
		if ($s_tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt5(value);
			return;
		}
		if ($s_tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt5(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt5(value);
			return;
		}
		if ($s_tax_rate6.equalsIgnoreCase(name)) {
			s_tax_rate6(value);
			return;
		}
		if ($s_tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt6(value);
			return;
		}
		if ($s_tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt6(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt6(value);
			return;
		}
		if ($s_tax_rate7.equalsIgnoreCase(name)) {
			s_tax_rate7(value);
			return;
		}
		if ($s_tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt7(value);
			return;
		}
		if ($s_tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt7(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt7(value);
			return;
		}
		if ($s_tax_rate8.equalsIgnoreCase(name)) {
			s_tax_rate8(value);
			return;
		}
		if ($s_tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt8(value);
			return;
		}
		if ($s_tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt8(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt8(value);
			return;
		}
		if ($s_tax_rate9.equalsIgnoreCase(name)) {
			s_tax_rate9(value);
			return;
		}
		if ($s_tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt9(value);
			return;
		}
		if ($s_tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt9(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt9(value);
			return;
		}
		if ($s_tax_rate10.equalsIgnoreCase(name)) {
			s_tax_rate10(value);
			return;
		}
		if ($s_tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_sls_amt10(value);
			return;
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_tax_amt10(value);
			return;
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_base_tax_amt10(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			sttl_nm1(value);
			return;
		}
		if ($s_rcv_schd_amt1.equalsIgnoreCase(name)) {
			s_rcv_schd_amt1(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			sttl_nm2(value);
			return;
		}
		if ($s_rcv_schd_amt2.equalsIgnoreCase(name)) {
			s_rcv_schd_amt2(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			sttl_nm3(value);
			return;
		}
		if ($s_rcv_schd_amt3.equalsIgnoreCase(name)) {
			s_rcv_schd_amt3(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			sttl_nm4(value);
			return;
		}
		if ($s_rcv_schd_amt4.equalsIgnoreCase(name)) {
			s_rcv_schd_amt4(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			sttl_nm5(value);
			return;
		}
		if ($s_rcv_schd_amt5.equalsIgnoreCase(name)) {
			s_rcv_schd_amt5(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
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
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_typ_nm.equalsIgnoreCase(name)) {
			bank_ac_typ_nm(value);
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
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		if ($hdr_page_sum.equalsIgnoreCase(name)) {
			hdr_page_sum(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bill_dtl_outp_flg.equalsIgnoreCase(name)) {
			bill_dtl_outp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

