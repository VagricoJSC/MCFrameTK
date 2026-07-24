package mcframe.commonMSBH.MSBHR0040;

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
 * ブロック"PayNtcHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PayNtcHdrR_MC_A extends MCConstRow {

	/**
	 *  支払年月.<p>
	 *
	 */
	public static final String $pay_ntc_ym = "pay_ntc_ym";
	/**
	 *  支払締日.<p>
	 *
	 */
	public static final String $pay_ntc_cl_day = "pay_ntc_cl_day";
	/**
	 *  登録日.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
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
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public static final String $pay_ntc_rev = "pay_ntc_rev";
	/**
	 *  案件.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public static final String $pay_ntc_zip_cd = "pay_ntc_zip_cd";
	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public static final String $pay_ntc_addr1 = "pay_ntc_addr1";
	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public static final String $pay_ntc_addr2 = "pay_ntc_addr2";
	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public static final String $pay_ntc_addr3 = "pay_ntc_addr3";
	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public static final String $pay_ntc_addr4 = "pay_ntc_addr4";
	/**
	 *  支払通知書送付住所.<p>
	 *
	 */
	public static final String $pay_ntc_addr = "pay_ntc_addr";
	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_nm = "pay_ntc_bsppl_nm";
	/**
	 *  支払通知書送付部署名.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_dpt = "pay_ntc_bsppl_dpt";
	/**
	 *  支払通知書送付担当者名.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn = "pay_ntc_bsppl_psn";
	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public static final String $pay_ntc_bsppl_psn_title = "pay_ntc_bsppl_psn_title";
	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public static final String $pay_ntc_tel = "pay_ntc_tel";
	/**
	 *  事業者番号.<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
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
	 *  部門.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
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
	 *  支払予定金額.<p>
	 *
	 */
	public static final String $schd_pay_amt = "schd_pay_amt";
	/**
	 *  支払予定金額文字列.<p>
	 *
	 */
	public static final String $s_schd_pay_amt = "s_schd_pay_amt";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  支払予定金額（通貨名）.<p>
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
	 *  前回支払予定額.<p>
	 *
	 */
	public static final String $last_pay_schd_amt = "last_pay_schd_amt";
	/**
	 *  前回支払予定額文字列.<p>
	 *
	 */
	public static final String $s_last_pay_schd_amt = "s_last_pay_schd_amt";
	/**
	 *  支払額.<p>
	 *
	 */
	public static final String $pay_amt = "pay_amt";
	/**
	 *  支払額文字列.<p>
	 *
	 */
	public static final String $s_pay_amt = "s_pay_amt";
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
	 *  今回繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 *  今回繰越額文字列.<p>
	 *
	 */
	public static final String $s_bfw_amt = "s_bfw_amt";
	/**
	 *  今回仕入額.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	/**
	 *  今回仕入額文字列.<p>
	 *
	 */
	public static final String $s_purc_amt = "s_purc_amt";
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
	 *  前渡金残高.<p>
	 *
	 */
	public static final String $adv_pay_bal = "adv_pay_bal";
	/**
	 *  前渡金残高文字列.<p>
	 *
	 */
	public static final String $s_adv_pay_bal = "s_adv_pay_bal";
	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public static final String $adv_pay_amt = "adv_pay_amt";
	/**
	 *  前渡金支払額文字列.<p>
	 *
	 */
	public static final String $s_adv_pay_amt = "s_adv_pay_amt";
	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public static final String $adv_pay_setoff_amt = "adv_pay_setoff_amt";
	/**
	 *  前渡金相殺額文字列.<p>
	 *
	 */
	public static final String $s_adv_pay_setoff_amt = "s_adv_pay_setoff_amt";
	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public static final String $adv_pay_setoff_tax_amt = "adv_pay_setoff_tax_amt";
	/**
	 *  前渡金相殺税額文字列.<p>
	 *
	 */
	public static final String $s_adv_pay_setoff_tax_amt = "s_adv_pay_setoff_tax_amt";
	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 *  支払照合為替レート文字列.<p>
	 *
	 */
	public static final String $s_pay_xrate = "s_pay_xrate";
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
	 *  税率毎仕入額１.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt1 = "tax_rate_purc_amt1";
	/**
	 *  税率毎仕入額１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt1 = "s_tax_rate_purc_amt1";
	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt1 = "tax_rate_tax_amt1";
	/**
	 *  税率毎税額１文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt1 = "s_tax_rate_tax_amt1";
	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt1 = "tax_rate_base_tax_amt1";
	/**
	 *  税率毎基準通貨税額１文字列.<p>
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
	 *  税率毎仕入額２.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt2 = "tax_rate_purc_amt2";
	/**
	 *  税率毎仕入額２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt2 = "s_tax_rate_purc_amt2";
	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt2 = "tax_rate_tax_amt2";
	/**
	 *  税率毎税額２文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt2 = "s_tax_rate_tax_amt2";
	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt2 = "tax_rate_base_tax_amt2";
	/**
	 *  税率毎基準通貨税額２文字列.<p>
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
	 *  税率毎仕入額３.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt3 = "tax_rate_purc_amt3";
	/**
	 *  税率毎仕入額３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt3 = "s_tax_rate_purc_amt3";
	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt3 = "tax_rate_tax_amt3";
	/**
	 *  税率毎税額３文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt3 = "s_tax_rate_tax_amt3";
	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt3 = "tax_rate_base_tax_amt3";
	/**
	 *  税率毎基準通貨税額３文字列.<p>
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
	 *  税率毎仕入額４.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt4 = "tax_rate_purc_amt4";
	/**
	 *  税率毎仕入額４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt4 = "s_tax_rate_purc_amt4";
	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt4 = "tax_rate_tax_amt4";
	/**
	 *  税率毎税額４文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt4 = "s_tax_rate_tax_amt4";
	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt4 = "tax_rate_base_tax_amt4";
	/**
	 *  税率毎基準通貨税額４文字列.<p>
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
	 *  税率毎仕入額５.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt5 = "tax_rate_purc_amt5";
	/**
	 *  税率毎仕入額５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt5 = "s_tax_rate_purc_amt5";
	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt5 = "tax_rate_tax_amt5";
	/**
	 *  税率毎税額５文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt5 = "s_tax_rate_tax_amt5";
	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt5 = "tax_rate_base_tax_amt5";
	/**
	 *  税率毎基準通貨税額５文字列.<p>
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
	 *  税率毎仕入額６.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt6 = "tax_rate_purc_amt6";
	/**
	 *  税率毎仕入額６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt6 = "s_tax_rate_purc_amt6";
	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt6 = "tax_rate_tax_amt6";
	/**
	 *  税率毎税額６文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt6 = "s_tax_rate_tax_amt6";
	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt6 = "tax_rate_base_tax_amt6";
	/**
	 *  税率毎基準通貨税額６文字列.<p>
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
	 *  税率毎仕入額７.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt7 = "tax_rate_purc_amt7";
	/**
	 *  税率毎仕入額７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt7 = "s_tax_rate_purc_amt7";
	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt7 = "tax_rate_tax_amt7";
	/**
	 *  税率毎税額７文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt7 = "s_tax_rate_tax_amt7";
	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt7 = "tax_rate_base_tax_amt7";
	/**
	 *  税率毎基準通貨税額７文字列.<p>
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
	 *  税率毎仕入額８.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt8 = "tax_rate_purc_amt8";
	/**
	 *  税率毎仕入額８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt8 = "s_tax_rate_purc_amt8";
	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt8 = "tax_rate_tax_amt8";
	/**
	 *  税率毎税額８文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt8 = "s_tax_rate_tax_amt8";
	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt8 = "tax_rate_base_tax_amt8";
	/**
	 *  税率毎基準通貨税額８文字列.<p>
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
	 *  税率毎仕入額９.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt9 = "tax_rate_purc_amt9";
	/**
	 *  税率毎仕入額９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt9 = "s_tax_rate_purc_amt9";
	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt9 = "tax_rate_tax_amt9";
	/**
	 *  税率毎税額９文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt9 = "s_tax_rate_tax_amt9";
	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt9 = "tax_rate_base_tax_amt9";
	/**
	 *  税率毎基準通貨税額９文字列.<p>
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
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public static final String $tax_rate_purc_amt10 = "tax_rate_purc_amt10";
	/**
	 *  税率毎仕入額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_purc_amt10 = "s_tax_rate_purc_amt10";
	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt10 = "tax_rate_tax_amt10";
	/**
	 *  税率毎税額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_tax_amt10 = "s_tax_rate_tax_amt10";
	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt10 = "tax_rate_base_tax_amt10";
	/**
	 *  税率毎基準通貨税額１０文字列.<p>
	 *
	 */
	public static final String $s_tax_rate_base_tax_amt10 = "s_tax_rate_base_tax_amt10";
	/**
	 *  支払予定日付１.<p>
	 *
	 */
	public static final String $pay_schd_dt1 = "pay_schd_dt1";
	/**
	 *  支払方法１.<p>
	 *
	 */
	public static final String $sttl_cd1 = "sttl_cd1";
	/**
	 *  支払方法１.<p>
	 *
	 */
	public static final String $sttl_nm1 = "sttl_nm1";
	/**
	 *  支払金額１.<p>
	 *
	 */
	public static final String $pay_schd_amt1 = "pay_schd_amt1";
	/**
	 *  支払金額１文字列.<p>
	 *
	 */
	public static final String $s_pay_schd_amt1 = "s_pay_schd_amt1";
	/**
	 *  銀行１.<p>
	 *
	 */
	public static final String $bank_cd1 = "bank_cd1";
	/**
	 *  振込口座１（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm1 = "bank_nm1";
	/**
	 *  支店１.<p>
	 *
	 */
	public static final String $branch_cd1 = "branch_cd1";
	/**
	 *  振込口座１（支店名）.<p>
	 *
	 */
	public static final String $branch_nm1 = "branch_nm1";
	/**
	 *  振込口座１（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no1 = "bank_ac_no1";
	/**
	 *  支払予定日付２.<p>
	 *
	 */
	public static final String $pay_schd_dt2 = "pay_schd_dt2";
	/**
	 *  支払方法２.<p>
	 *
	 */
	public static final String $sttl_cd2 = "sttl_cd2";
	/**
	 *  支払方法２.<p>
	 *
	 */
	public static final String $sttl_nm2 = "sttl_nm2";
	/**
	 *  支払金額２.<p>
	 *
	 */
	public static final String $pay_schd_amt2 = "pay_schd_amt2";
	/**
	 *  支払金額２文字列.<p>
	 *
	 */
	public static final String $s_pay_schd_amt2 = "s_pay_schd_amt2";
	/**
	 *  銀行２.<p>
	 *
	 */
	public static final String $bank_cd2 = "bank_cd2";
	/**
	 *  振込口座２（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm2 = "bank_nm2";
	/**
	 *  支店２.<p>
	 *
	 */
	public static final String $branch_cd2 = "branch_cd2";
	/**
	 *  振込口座２（支店名）.<p>
	 *
	 */
	public static final String $branch_nm2 = "branch_nm2";
	/**
	 *  振込口座２（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no2 = "bank_ac_no2";
	/**
	 *  支払予定日付３.<p>
	 *
	 */
	public static final String $pay_schd_dt3 = "pay_schd_dt3";
	/**
	 *  支払方法３.<p>
	 *
	 */
	public static final String $sttl_cd3 = "sttl_cd3";
	/**
	 *  支払方法３.<p>
	 *
	 */
	public static final String $sttl_nm3 = "sttl_nm3";
	/**
	 *  支払金額３.<p>
	 *
	 */
	public static final String $pay_schd_amt3 = "pay_schd_amt3";
	/**
	 *  支払金額３文字列.<p>
	 *
	 */
	public static final String $s_pay_schd_amt3 = "s_pay_schd_amt3";
	/**
	 *  銀行３.<p>
	 *
	 */
	public static final String $bank_cd3 = "bank_cd3";
	/**
	 *  振込口座３（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm3 = "bank_nm3";
	/**
	 *  支店３.<p>
	 *
	 */
	public static final String $branch_cd3 = "branch_cd3";
	/**
	 *  振込口座３（支店名）.<p>
	 *
	 */
	public static final String $branch_nm3 = "branch_nm3";
	/**
	 *  振込口座３（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no3 = "bank_ac_no3";
	/**
	 *  支払予定日付４.<p>
	 *
	 */
	public static final String $pay_schd_dt4 = "pay_schd_dt4";
	/**
	 *  支払方法４.<p>
	 *
	 */
	public static final String $sttl_cd4 = "sttl_cd4";
	/**
	 *  支払方法４.<p>
	 *
	 */
	public static final String $sttl_nm4 = "sttl_nm4";
	/**
	 *  支払金額４.<p>
	 *
	 */
	public static final String $pay_schd_amt4 = "pay_schd_amt4";
	/**
	 *  支払金額４文字列.<p>
	 *
	 */
	public static final String $s_pay_schd_amt4 = "s_pay_schd_amt4";
	/**
	 *  銀行４.<p>
	 *
	 */
	public static final String $bank_cd4 = "bank_cd4";
	/**
	 *  振込口座４（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm4 = "bank_nm4";
	/**
	 *  支店４.<p>
	 *
	 */
	public static final String $branch_cd4 = "branch_cd4";
	/**
	 *  振込口座４（支店名）.<p>
	 *
	 */
	public static final String $branch_nm4 = "branch_nm4";
	/**
	 *  振込口座４（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no4 = "bank_ac_no4";
	/**
	 *  支払予定日付５.<p>
	 *
	 */
	public static final String $pay_schd_dt5 = "pay_schd_dt5";
	/**
	 *  支払方法５.<p>
	 *
	 */
	public static final String $sttl_cd5 = "sttl_cd5";
	/**
	 *  支払方法５.<p>
	 *
	 */
	public static final String $sttl_nm5 = "sttl_nm5";
	/**
	 *  支払金額５.<p>
	 *
	 */
	public static final String $pay_schd_amt5 = "pay_schd_amt5";
	/**
	 *  支払金額５文字列.<p>
	 *
	 */
	public static final String $s_pay_schd_amt5 = "s_pay_schd_amt5";
	/**
	 *  銀行５.<p>
	 *
	 */
	public static final String $bank_cd5 = "bank_cd5";
	/**
	 *  振込口座５（銀行名）.<p>
	 *
	 */
	public static final String $bank_nm5 = "bank_nm5";
	/**
	 *  支店５.<p>
	 *
	 */
	public static final String $branch_cd5 = "branch_cd5";
	/**
	 *  振込口座５（支店名）.<p>
	 *
	 */
	public static final String $branch_nm5 = "branch_nm5";
	/**
	 *  振込口座５（口座番号）.<p>
	 *
	 */
	public static final String $bank_ac_no5 = "bank_ac_no5";
	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $pay_ntc_dtl_outp_flg = "pay_ntc_dtl_outp_flg";
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


	public static final MCMeta pay_ntc_ym_META = createCommonMeta($pay_ntc_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pay_ntc_cl_day_META = createCommonMeta($pay_ntc_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_issue_META = createStringMeta($re_issue);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_ntc_rev_META = createCommonMeta($pay_ntc_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta pay_ntc_zip_cd_META = createCommonMeta($pay_ntc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta pay_ntc_addr1_META = createCommonMeta($pay_ntc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta pay_ntc_addr2_META = createCommonMeta($pay_ntc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta pay_ntc_addr3_META = createCommonMeta($pay_ntc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta pay_ntc_addr4_META = createCommonMeta($pay_ntc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta pay_ntc_addr_META = createStringMeta($pay_ntc_addr);
	public static final MCMeta pay_ntc_bsppl_nm_META = createCommonMeta($pay_ntc_bsppl_nm, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_NM);
	public static final MCMeta pay_ntc_bsppl_dpt_META = createCommonMeta($pay_ntc_bsppl_dpt, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_DPT);
	public static final MCMeta pay_ntc_bsppl_psn_META = createCommonMeta($pay_ntc_bsppl_psn, mcframe.commonMA.meta.MA_META.PAY_NTC_BSPPL_PSN);
	public static final MCMeta pay_ntc_bsppl_psn_title_META = createCommonMeta($pay_ntc_bsppl_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta pay_ntc_tel_META = createCommonMeta($pay_ntc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta biz_co_no_META = createStringMeta($biz_co_no);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta addr_META = createStringMeta($addr);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta schd_pay_amt_META = createCommonMeta($schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_schd_pay_amt_META = createStringMeta($s_schd_pay_amt);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta last_pay_schd_amt_META = createCommonMeta($last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_last_pay_schd_amt_META = createStringMeta($s_last_pay_schd_amt);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_amt_META = createStringMeta($s_pay_amt);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sw_amt_META = createStringMeta($s_sw_amt);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_bfw_amt_META = createStringMeta($s_bfw_amt);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_purc_amt_META = createStringMeta($s_purc_amt);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_dscnt_amt_META = createStringMeta($s_dscnt_amt);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ret_amt_META = createStringMeta($s_ret_amt);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_setoff_amt_META = createStringMeta($s_setoff_amt);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_amt_META = createStringMeta($s_tax_amt);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_sw_to_amt_META = createStringMeta($s_sw_to_amt);
	public static final MCMeta adv_pay_bal_META = createCommonMeta($adv_pay_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_pay_bal_META = createStringMeta($s_adv_pay_bal);
	public static final MCMeta adv_pay_amt_META = createCommonMeta($adv_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_pay_amt_META = createStringMeta($s_adv_pay_amt);
	public static final MCMeta adv_pay_setoff_amt_META = createCommonMeta($adv_pay_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_pay_setoff_amt_META = createStringMeta($s_adv_pay_setoff_amt);
	public static final MCMeta adv_pay_setoff_tax_amt_META = createCommonMeta($adv_pay_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_adv_pay_setoff_tax_amt_META = createStringMeta($s_adv_pay_setoff_tax_amt);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_xrate_META = createStringMeta($s_pay_xrate);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate1_META = createStringMeta($s_tax_rate1);
	public static final MCMeta tax_rate_purc_amt1_META = createCommonMeta($tax_rate_purc_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt1_META = createStringMeta($s_tax_rate_purc_amt1);
	public static final MCMeta tax_rate_tax_amt1_META = createCommonMeta($tax_rate_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt1_META = createStringMeta($s_tax_rate_tax_amt1);
	public static final MCMeta tax_rate_base_tax_amt1_META = createCommonMeta($tax_rate_base_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt1_META = createStringMeta($s_tax_rate_base_tax_amt1);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate2_META = createStringMeta($s_tax_rate2);
	public static final MCMeta tax_rate_purc_amt2_META = createCommonMeta($tax_rate_purc_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt2_META = createStringMeta($s_tax_rate_purc_amt2);
	public static final MCMeta tax_rate_tax_amt2_META = createCommonMeta($tax_rate_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt2_META = createStringMeta($s_tax_rate_tax_amt2);
	public static final MCMeta tax_rate_base_tax_amt2_META = createCommonMeta($tax_rate_base_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt2_META = createStringMeta($s_tax_rate_base_tax_amt2);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate3_META = createStringMeta($s_tax_rate3);
	public static final MCMeta tax_rate_purc_amt3_META = createCommonMeta($tax_rate_purc_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt3_META = createStringMeta($s_tax_rate_purc_amt3);
	public static final MCMeta tax_rate_tax_amt3_META = createCommonMeta($tax_rate_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt3_META = createStringMeta($s_tax_rate_tax_amt3);
	public static final MCMeta tax_rate_base_tax_amt3_META = createCommonMeta($tax_rate_base_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt3_META = createStringMeta($s_tax_rate_base_tax_amt3);
	public static final MCMeta tax_rate4_META = createCommonMeta($tax_rate4, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate4_META = createStringMeta($s_tax_rate4);
	public static final MCMeta tax_rate_purc_amt4_META = createCommonMeta($tax_rate_purc_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt4_META = createStringMeta($s_tax_rate_purc_amt4);
	public static final MCMeta tax_rate_tax_amt4_META = createCommonMeta($tax_rate_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt4_META = createStringMeta($s_tax_rate_tax_amt4);
	public static final MCMeta tax_rate_base_tax_amt4_META = createCommonMeta($tax_rate_base_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt4_META = createStringMeta($s_tax_rate_base_tax_amt4);
	public static final MCMeta tax_rate5_META = createCommonMeta($tax_rate5, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate5_META = createStringMeta($s_tax_rate5);
	public static final MCMeta tax_rate_purc_amt5_META = createCommonMeta($tax_rate_purc_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt5_META = createStringMeta($s_tax_rate_purc_amt5);
	public static final MCMeta tax_rate_tax_amt5_META = createCommonMeta($tax_rate_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt5_META = createStringMeta($s_tax_rate_tax_amt5);
	public static final MCMeta tax_rate_base_tax_amt5_META = createCommonMeta($tax_rate_base_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt5_META = createStringMeta($s_tax_rate_base_tax_amt5);
	public static final MCMeta tax_rate6_META = createCommonMeta($tax_rate6, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate6_META = createStringMeta($s_tax_rate6);
	public static final MCMeta tax_rate_purc_amt6_META = createCommonMeta($tax_rate_purc_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt6_META = createStringMeta($s_tax_rate_purc_amt6);
	public static final MCMeta tax_rate_tax_amt6_META = createCommonMeta($tax_rate_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt6_META = createStringMeta($s_tax_rate_tax_amt6);
	public static final MCMeta tax_rate_base_tax_amt6_META = createCommonMeta($tax_rate_base_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt6_META = createStringMeta($s_tax_rate_base_tax_amt6);
	public static final MCMeta tax_rate7_META = createCommonMeta($tax_rate7, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate7_META = createStringMeta($s_tax_rate7);
	public static final MCMeta tax_rate_purc_amt7_META = createCommonMeta($tax_rate_purc_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt7_META = createStringMeta($s_tax_rate_purc_amt7);
	public static final MCMeta tax_rate_tax_amt7_META = createCommonMeta($tax_rate_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt7_META = createStringMeta($s_tax_rate_tax_amt7);
	public static final MCMeta tax_rate_base_tax_amt7_META = createCommonMeta($tax_rate_base_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt7_META = createStringMeta($s_tax_rate_base_tax_amt7);
	public static final MCMeta tax_rate8_META = createCommonMeta($tax_rate8, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate8_META = createStringMeta($s_tax_rate8);
	public static final MCMeta tax_rate_purc_amt8_META = createCommonMeta($tax_rate_purc_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt8_META = createStringMeta($s_tax_rate_purc_amt8);
	public static final MCMeta tax_rate_tax_amt8_META = createCommonMeta($tax_rate_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt8_META = createStringMeta($s_tax_rate_tax_amt8);
	public static final MCMeta tax_rate_base_tax_amt8_META = createCommonMeta($tax_rate_base_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt8_META = createStringMeta($s_tax_rate_base_tax_amt8);
	public static final MCMeta tax_rate9_META = createCommonMeta($tax_rate9, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate9_META = createStringMeta($s_tax_rate9);
	public static final MCMeta tax_rate_purc_amt9_META = createCommonMeta($tax_rate_purc_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt9_META = createStringMeta($s_tax_rate_purc_amt9);
	public static final MCMeta tax_rate_tax_amt9_META = createCommonMeta($tax_rate_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt9_META = createStringMeta($s_tax_rate_tax_amt9);
	public static final MCMeta tax_rate_base_tax_amt9_META = createCommonMeta($tax_rate_base_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt9_META = createStringMeta($s_tax_rate_base_tax_amt9);
	public static final MCMeta tax_rate10_META = createCommonMeta($tax_rate10, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate10_META = createStringMeta($s_tax_rate10);
	public static final MCMeta tax_rate_purc_amt10_META = createCommonMeta($tax_rate_purc_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_purc_amt10_META = createStringMeta($s_tax_rate_purc_amt10);
	public static final MCMeta tax_rate_tax_amt10_META = createCommonMeta($tax_rate_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_tax_amt10_META = createStringMeta($s_tax_rate_tax_amt10);
	public static final MCMeta tax_rate_base_tax_amt10_META = createCommonMeta($tax_rate_base_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_rate_base_tax_amt10_META = createStringMeta($s_tax_rate_base_tax_amt10);
	public static final MCMeta pay_schd_dt1_META = createCommonMeta($pay_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd1_META = createCommonMeta($sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm1_META = createCommonMeta($sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_amt1_META = createCommonMeta($pay_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_schd_amt1_META = createStringMeta($s_pay_schd_amt1);
	public static final MCMeta bank_cd1_META = createCommonMeta($bank_cd1, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm1_META = createCommonMeta($bank_nm1, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd1_META = createCommonMeta($branch_cd1, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm1_META = createCommonMeta($branch_nm1, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no1_META = createCommonMeta($bank_ac_no1, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta pay_schd_dt2_META = createCommonMeta($pay_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd2_META = createCommonMeta($sttl_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm2_META = createCommonMeta($sttl_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_amt2_META = createCommonMeta($pay_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_schd_amt2_META = createStringMeta($s_pay_schd_amt2);
	public static final MCMeta bank_cd2_META = createCommonMeta($bank_cd2, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm2_META = createCommonMeta($bank_nm2, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd2_META = createCommonMeta($branch_cd2, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm2_META = createCommonMeta($branch_nm2, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no2_META = createCommonMeta($bank_ac_no2, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta pay_schd_dt3_META = createCommonMeta($pay_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd3_META = createCommonMeta($sttl_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm3_META = createCommonMeta($sttl_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_amt3_META = createCommonMeta($pay_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_schd_amt3_META = createStringMeta($s_pay_schd_amt3);
	public static final MCMeta bank_cd3_META = createCommonMeta($bank_cd3, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm3_META = createCommonMeta($bank_nm3, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd3_META = createCommonMeta($branch_cd3, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm3_META = createCommonMeta($branch_nm3, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no3_META = createCommonMeta($bank_ac_no3, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta pay_schd_dt4_META = createCommonMeta($pay_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd4_META = createCommonMeta($sttl_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm4_META = createCommonMeta($sttl_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_amt4_META = createCommonMeta($pay_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_schd_amt4_META = createStringMeta($s_pay_schd_amt4);
	public static final MCMeta bank_cd4_META = createCommonMeta($bank_cd4, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm4_META = createCommonMeta($bank_nm4, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd4_META = createCommonMeta($branch_cd4, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm4_META = createCommonMeta($branch_nm4, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no4_META = createCommonMeta($bank_ac_no4, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta pay_schd_dt5_META = createCommonMeta($pay_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sttl_cd5_META = createCommonMeta($sttl_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm5_META = createCommonMeta($sttl_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_schd_amt5_META = createCommonMeta($pay_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_pay_schd_amt5_META = createStringMeta($s_pay_schd_amt5);
	public static final MCMeta bank_cd5_META = createCommonMeta($bank_cd5, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm5_META = createCommonMeta($bank_nm5, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd5_META = createCommonMeta($branch_cd5, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm5_META = createCommonMeta($branch_nm5, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta bank_ac_no5_META = createCommonMeta($bank_ac_no5, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta pay_ntc_dtl_outp_flg_META = createCommonMeta($pay_ntc_dtl_outp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
	public static final MCMeta hdr_page_META = createCommonMeta($hdr_page, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<PayNtcHdrR> constMetas = new ConstMetaList<PayNtcHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_ntc_ym_META,
			pay_ntc_cl_day_META,
			reg_dt_META,
			re_issue_META,
			prnt_tm_META,
			pay_chk_no_META,
			pay_ntc_rev_META,
			wrk_no_META,
			wrk_nm_META,
			bsppl_cd_META,
			pay_ntc_zip_cd_META,
			pay_ntc_addr1_META,
			pay_ntc_addr2_META,
			pay_ntc_addr3_META,
			pay_ntc_addr4_META,
			pay_ntc_addr_META,
			pay_ntc_bsppl_nm_META,
			pay_ntc_bsppl_dpt_META,
			pay_ntc_bsppl_psn_META,
			pay_ntc_bsppl_psn_title_META,
			pay_ntc_tel_META,
			biz_co_no_META,
			co_cd_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			addr_META,
			co_nm_META,
			bsppl_dpt_cd_META,
			dpt_nm_META,
			dpt_tel_META,
			schd_pay_amt_META,
			s_schd_pay_amt_META,
			cur_cd_META,
			cur_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			last_pay_schd_amt_META,
			s_last_pay_schd_amt_META,
			pay_amt_META,
			s_pay_amt_META,
			sw_amt_META,
			s_sw_amt_META,
			bfw_amt_META,
			s_bfw_amt_META,
			purc_amt_META,
			s_purc_amt_META,
			dscnt_amt_META,
			s_dscnt_amt_META,
			ret_amt_META,
			s_ret_amt_META,
			setoff_amt_META,
			s_setoff_amt_META,
			tax_amt_META,
			s_tax_amt_META,
			sw_to_amt_META,
			s_sw_to_amt_META,
			adv_pay_bal_META,
			s_adv_pay_bal_META,
			adv_pay_amt_META,
			s_adv_pay_amt_META,
			adv_pay_setoff_amt_META,
			s_adv_pay_setoff_amt_META,
			adv_pay_setoff_tax_amt_META,
			s_adv_pay_setoff_tax_amt_META,
			pay_xrate_META,
			s_pay_xrate_META,
			tax_rate1_META,
			s_tax_rate1_META,
			tax_rate_purc_amt1_META,
			s_tax_rate_purc_amt1_META,
			tax_rate_tax_amt1_META,
			s_tax_rate_tax_amt1_META,
			tax_rate_base_tax_amt1_META,
			s_tax_rate_base_tax_amt1_META,
			tax_rate2_META,
			s_tax_rate2_META,
			tax_rate_purc_amt2_META,
			s_tax_rate_purc_amt2_META,
			tax_rate_tax_amt2_META,
			s_tax_rate_tax_amt2_META,
			tax_rate_base_tax_amt2_META,
			s_tax_rate_base_tax_amt2_META,
			tax_rate3_META,
			s_tax_rate3_META,
			tax_rate_purc_amt3_META,
			s_tax_rate_purc_amt3_META,
			tax_rate_tax_amt3_META,
			s_tax_rate_tax_amt3_META,
			tax_rate_base_tax_amt3_META,
			s_tax_rate_base_tax_amt3_META,
			tax_rate4_META,
			s_tax_rate4_META,
			tax_rate_purc_amt4_META,
			s_tax_rate_purc_amt4_META,
			tax_rate_tax_amt4_META,
			s_tax_rate_tax_amt4_META,
			tax_rate_base_tax_amt4_META,
			s_tax_rate_base_tax_amt4_META,
			tax_rate5_META,
			s_tax_rate5_META,
			tax_rate_purc_amt5_META,
			s_tax_rate_purc_amt5_META,
			tax_rate_tax_amt5_META,
			s_tax_rate_tax_amt5_META,
			tax_rate_base_tax_amt5_META,
			s_tax_rate_base_tax_amt5_META,
			tax_rate6_META,
			s_tax_rate6_META,
			tax_rate_purc_amt6_META,
			s_tax_rate_purc_amt6_META,
			tax_rate_tax_amt6_META,
			s_tax_rate_tax_amt6_META,
			tax_rate_base_tax_amt6_META,
			s_tax_rate_base_tax_amt6_META,
			tax_rate7_META,
			s_tax_rate7_META,
			tax_rate_purc_amt7_META,
			s_tax_rate_purc_amt7_META,
			tax_rate_tax_amt7_META,
			s_tax_rate_tax_amt7_META,
			tax_rate_base_tax_amt7_META,
			s_tax_rate_base_tax_amt7_META,
			tax_rate8_META,
			s_tax_rate8_META,
			tax_rate_purc_amt8_META,
			s_tax_rate_purc_amt8_META,
			tax_rate_tax_amt8_META,
			s_tax_rate_tax_amt8_META,
			tax_rate_base_tax_amt8_META,
			s_tax_rate_base_tax_amt8_META,
			tax_rate9_META,
			s_tax_rate9_META,
			tax_rate_purc_amt9_META,
			s_tax_rate_purc_amt9_META,
			tax_rate_tax_amt9_META,
			s_tax_rate_tax_amt9_META,
			tax_rate_base_tax_amt9_META,
			s_tax_rate_base_tax_amt9_META,
			tax_rate10_META,
			s_tax_rate10_META,
			tax_rate_purc_amt10_META,
			s_tax_rate_purc_amt10_META,
			tax_rate_tax_amt10_META,
			s_tax_rate_tax_amt10_META,
			tax_rate_base_tax_amt10_META,
			s_tax_rate_base_tax_amt10_META,
			pay_schd_dt1_META,
			sttl_cd1_META,
			sttl_nm1_META,
			pay_schd_amt1_META,
			s_pay_schd_amt1_META,
			bank_cd1_META,
			bank_nm1_META,
			branch_cd1_META,
			branch_nm1_META,
			bank_ac_no1_META,
			pay_schd_dt2_META,
			sttl_cd2_META,
			sttl_nm2_META,
			pay_schd_amt2_META,
			s_pay_schd_amt2_META,
			bank_cd2_META,
			bank_nm2_META,
			branch_cd2_META,
			branch_nm2_META,
			bank_ac_no2_META,
			pay_schd_dt3_META,
			sttl_cd3_META,
			sttl_nm3_META,
			pay_schd_amt3_META,
			s_pay_schd_amt3_META,
			bank_cd3_META,
			bank_nm3_META,
			branch_cd3_META,
			branch_nm3_META,
			bank_ac_no3_META,
			pay_schd_dt4_META,
			sttl_cd4_META,
			sttl_nm4_META,
			pay_schd_amt4_META,
			s_pay_schd_amt4_META,
			bank_cd4_META,
			bank_nm4_META,
			branch_cd4_META,
			branch_nm4_META,
			bank_ac_no4_META,
			pay_schd_dt5_META,
			sttl_cd5_META,
			sttl_nm5_META,
			pay_schd_amt5_META,
			s_pay_schd_amt5_META,
			bank_cd5_META,
			bank_nm5_META,
			branch_cd5_META,
			branch_nm5_META,
			bank_ac_no5_META,
			pay_ntc_dtl_outp_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			hdr_page_META
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
	protected PayNtcHdrR_MC_A(ConstMetaList<? extends PayNtcHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcHdrR clone() {
		return (PayNtcHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcHdrR createInstance() {
		return (PayNtcHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PayNtcHdrR getValues(String... names) {
		return (PayNtcHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  支払年月.<p>
	 *
	 */
	public MCDate pay_ntc_ym() {
		return getConstDate(offset + 0, $pay_ntc_ym);
	}

	/**
	 *  支払年月.<p>
	 *
	 */
	public void pay_ntc_ym(MCDate value) {
		setConstDate(offset + 0, $pay_ntc_ym, value);
	}


	/**
	 *  支払締日.<p>
	 *
	 */
	public MCNumber pay_ntc_cl_day() {
		return getConstNumber(offset + 1, $pay_ntc_cl_day);
	}

	/**
	 *  支払締日.<p>
	 *
	 */
	public void pay_ntc_cl_day(MCNumber value) {
		setConstNumber(offset + 1, $pay_ntc_cl_day, value);
	}

	/**
	 *  支払締日.<p>
	 *
	 */
	public void pay_ntc_cl_day(int value) {
		setConstNumber(offset + 1, $pay_ntc_cl_day, value);
	}

	/**
	 *  支払締日.<p>
	 *
	 */
	public void pay_ntc_cl_day(long value) {
		setConstNumber(offset + 1, $pay_ntc_cl_day, value);
	}

	/**
	 *  支払締日.<p>
	 *
	 */
	public void pay_ntc_cl_day(float value) {
		setConstNumber(offset + 1, $pay_ntc_cl_day, value);
	}

	/**
	 *  支払締日.<p>
	 *
	 */
	public void pay_ntc_cl_day(double value) {
		setConstNumber(offset + 1, $pay_ntc_cl_day, value);
	}


	/**
	 *  登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 2, $reg_dt);
	}

	/**
	 *  登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 2, $reg_dt, value);
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
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 5, $pay_chk_no);
	}

	/**
	 *  支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 5, $pay_chk_no, value);
	}


	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 6, $pay_ntc_rev);
	}

	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 6, $pay_ntc_rev, value);
	}

	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 6, $pay_ntc_rev, value);
	}

	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 6, $pay_ntc_rev, value);
	}

	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 6, $pay_ntc_rev, value);
	}

	/**
	 *  通知書改訂番号.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 6, $pay_ntc_rev, value);
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
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 8, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 8, $wrk_nm, value);
	}


	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 9, $bsppl_cd);
	}

	/**
	 *  支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 9, $bsppl_cd, value);
	}


	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public String pay_ntc_zip_cd() {
		return getConstString(offset + 10, $pay_ntc_zip_cd);
	}

	/**
	 *  支払通知書送付郵便番号.<p>
	 *
	 */
	public void pay_ntc_zip_cd(String value) {
		setConstString(offset + 10, $pay_ntc_zip_cd, value);
	}


	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public String pay_ntc_addr1() {
		return getConstString(offset + 11, $pay_ntc_addr1);
	}

	/**
	 *  支払通知書送付住所１.<p>
	 *
	 */
	public void pay_ntc_addr1(String value) {
		setConstString(offset + 11, $pay_ntc_addr1, value);
	}


	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public String pay_ntc_addr2() {
		return getConstString(offset + 12, $pay_ntc_addr2);
	}

	/**
	 *  支払通知書送付住所２.<p>
	 *
	 */
	public void pay_ntc_addr2(String value) {
		setConstString(offset + 12, $pay_ntc_addr2, value);
	}


	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public String pay_ntc_addr3() {
		return getConstString(offset + 13, $pay_ntc_addr3);
	}

	/**
	 *  支払通知書送付住所３.<p>
	 *
	 */
	public void pay_ntc_addr3(String value) {
		setConstString(offset + 13, $pay_ntc_addr3, value);
	}


	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public String pay_ntc_addr4() {
		return getConstString(offset + 14, $pay_ntc_addr4);
	}

	/**
	 *  支払通知書送付住所４.<p>
	 *
	 */
	public void pay_ntc_addr4(String value) {
		setConstString(offset + 14, $pay_ntc_addr4, value);
	}


	/**
	 *  支払通知書送付住所.<p>
	 *
	 */
	public String pay_ntc_addr() {
		return getConstString(offset + 15, $pay_ntc_addr);
	}

	/**
	 *  支払通知書送付住所.<p>
	 *
	 */
	public void pay_ntc_addr(String value) {
		setConstString(offset + 15, $pay_ntc_addr, value);
	}


	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public String pay_ntc_bsppl_nm() {
		return getConstString(offset + 16, $pay_ntc_bsppl_nm);
	}

	/**
	 *  支払通知書宛先.<p>
	 *
	 */
	public void pay_ntc_bsppl_nm(String value) {
		setConstString(offset + 16, $pay_ntc_bsppl_nm, value);
	}


	/**
	 *  支払通知書送付部署名.<p>
	 *
	 */
	public String pay_ntc_bsppl_dpt() {
		return getConstString(offset + 17, $pay_ntc_bsppl_dpt);
	}

	/**
	 *  支払通知書送付部署名.<p>
	 *
	 */
	public void pay_ntc_bsppl_dpt(String value) {
		setConstString(offset + 17, $pay_ntc_bsppl_dpt, value);
	}


	/**
	 *  支払通知書送付担当者名.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn() {
		return getConstString(offset + 18, $pay_ntc_bsppl_psn);
	}

	/**
	 *  支払通知書送付担当者名.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn(String value) {
		setConstString(offset + 18, $pay_ntc_bsppl_psn, value);
	}


	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public String pay_ntc_bsppl_psn_title() {
		return getConstString(offset + 19, $pay_ntc_bsppl_psn_title);
	}

	/**
	 *  支払通知書送付担当者敬称.<p>
	 *
	 */
	public void pay_ntc_bsppl_psn_title(String value) {
		setConstString(offset + 19, $pay_ntc_bsppl_psn_title, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String pay_ntc_tel() {
		return getConstString(offset + 20, $pay_ntc_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void pay_ntc_tel(String value) {
		setConstString(offset + 20, $pay_ntc_tel, value);
	}


	/**
	 *  事業者番号.<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 21, $biz_co_no);
	}

	/**
	 *  事業者番号.<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 21, $biz_co_no, value);
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
	 *  部門.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 30, $bsppl_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 30, $bsppl_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 31, $dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 31, $dpt_nm, value);
	}


	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 32, $dpt_tel);
	}

	/**
	 *  ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 32, $dpt_tel, value);
	}


	/**
	 *  支払予定金額.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return getConstNumber(offset + 33, $schd_pay_amt);
	}

	/**
	 *  支払予定金額.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 33, $schd_pay_amt, value);
	}

	/**
	 *  支払予定金額.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		setConstNumber(offset + 33, $schd_pay_amt, value);
	}

	/**
	 *  支払予定金額.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		setConstNumber(offset + 33, $schd_pay_amt, value);
	}

	/**
	 *  支払予定金額.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		setConstNumber(offset + 33, $schd_pay_amt, value);
	}

	/**
	 *  支払予定金額.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		setConstNumber(offset + 33, $schd_pay_amt, value);
	}


	/**
	 *  支払予定金額文字列.<p>
	 *
	 */
	public String s_schd_pay_amt() {
		return getConstString(offset + 34, $s_schd_pay_amt);
	}

	/**
	 *  支払予定金額文字列.<p>
	 *
	 */
	public void s_schd_pay_amt(String value) {
		setConstString(offset + 34, $s_schd_pay_amt, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 35, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 35, $cur_cd, value);
	}


	/**
	 *  支払予定金額（通貨名）.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 36, $cur_nm);
	}

	/**
	 *  支払予定金額（通貨名）.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 36, $cur_nm, value);
	}


	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 37, $base_cur_cd);
	}

	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 37, $base_cur_cd, value);
	}


	/**
	 *  基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 38, $base_cur_nm);
	}

	/**
	 *  基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 38, $base_cur_nm, value);
	}


	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return getConstNumber(offset + 39, $last_pay_schd_amt);
	}

	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 39, $last_pay_schd_amt, value);
	}

	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		setConstNumber(offset + 39, $last_pay_schd_amt, value);
	}

	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		setConstNumber(offset + 39, $last_pay_schd_amt, value);
	}

	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		setConstNumber(offset + 39, $last_pay_schd_amt, value);
	}

	/**
	 *  前回支払予定額.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		setConstNumber(offset + 39, $last_pay_schd_amt, value);
	}


	/**
	 *  前回支払予定額文字列.<p>
	 *
	 */
	public String s_last_pay_schd_amt() {
		return getConstString(offset + 40, $s_last_pay_schd_amt);
	}

	/**
	 *  前回支払予定額文字列.<p>
	 *
	 */
	public void s_last_pay_schd_amt(String value) {
		setConstString(offset + 40, $s_last_pay_schd_amt, value);
	}


	/**
	 *  支払額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 41, $pay_amt);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 41, $pay_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 41, $pay_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 41, $pay_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 41, $pay_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 41, $pay_amt, value);
	}


	/**
	 *  支払額文字列.<p>
	 *
	 */
	public String s_pay_amt() {
		return getConstString(offset + 42, $s_pay_amt);
	}

	/**
	 *  支払額文字列.<p>
	 *
	 */
	public void s_pay_amt(String value) {
		setConstString(offset + 42, $s_pay_amt, value);
	}


	/**
	 *  振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 43, $sw_amt);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 43, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 43, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 43, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 43, $sw_amt, value);
	}

	/**
	 *  振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 43, $sw_amt, value);
	}


	/**
	 *  振替額文字列.<p>
	 *
	 */
	public String s_sw_amt() {
		return getConstString(offset + 44, $s_sw_amt);
	}

	/**
	 *  振替額文字列.<p>
	 *
	 */
	public void s_sw_amt(String value) {
		setConstString(offset + 44, $s_sw_amt, value);
	}


	/**
	 *  今回繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 45, $bfw_amt);
	}

	/**
	 *  今回繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 45, $bfw_amt, value);
	}

	/**
	 *  今回繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 45, $bfw_amt, value);
	}

	/**
	 *  今回繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 45, $bfw_amt, value);
	}

	/**
	 *  今回繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 45, $bfw_amt, value);
	}

	/**
	 *  今回繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 45, $bfw_amt, value);
	}


	/**
	 *  今回繰越額文字列.<p>
	 *
	 */
	public String s_bfw_amt() {
		return getConstString(offset + 46, $s_bfw_amt);
	}

	/**
	 *  今回繰越額文字列.<p>
	 *
	 */
	public void s_bfw_amt(String value) {
		setConstString(offset + 46, $s_bfw_amt, value);
	}


	/**
	 *  今回仕入額.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 47, $purc_amt);
	}

	/**
	 *  今回仕入額.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 47, $purc_amt, value);
	}

	/**
	 *  今回仕入額.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 47, $purc_amt, value);
	}

	/**
	 *  今回仕入額.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 47, $purc_amt, value);
	}

	/**
	 *  今回仕入額.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 47, $purc_amt, value);
	}

	/**
	 *  今回仕入額.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 47, $purc_amt, value);
	}


	/**
	 *  今回仕入額文字列.<p>
	 *
	 */
	public String s_purc_amt() {
		return getConstString(offset + 48, $s_purc_amt);
	}

	/**
	 *  今回仕入額文字列.<p>
	 *
	 */
	public void s_purc_amt(String value) {
		setConstString(offset + 48, $s_purc_amt, value);
	}


	/**
	 *  今回値引額.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 49, $dscnt_amt);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 49, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 49, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 49, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 49, $dscnt_amt, value);
	}

	/**
	 *  今回値引額.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 49, $dscnt_amt, value);
	}


	/**
	 *  今回値引額文字列.<p>
	 *
	 */
	public String s_dscnt_amt() {
		return getConstString(offset + 50, $s_dscnt_amt);
	}

	/**
	 *  今回値引額文字列.<p>
	 *
	 */
	public void s_dscnt_amt(String value) {
		setConstString(offset + 50, $s_dscnt_amt, value);
	}


	/**
	 *  今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 51, $ret_amt);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 51, $ret_amt, value);
	}


	/**
	 *  今回返品額文字列.<p>
	 *
	 */
	public String s_ret_amt() {
		return getConstString(offset + 52, $s_ret_amt);
	}

	/**
	 *  今回返品額文字列.<p>
	 *
	 */
	public void s_ret_amt(String value) {
		setConstString(offset + 52, $s_ret_amt, value);
	}


	/**
	 *  相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 53, $setoff_amt);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 53, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 53, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 53, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 53, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 53, $setoff_amt, value);
	}


	/**
	 *  相殺額文字列.<p>
	 *
	 */
	public String s_setoff_amt() {
		return getConstString(offset + 54, $s_setoff_amt);
	}

	/**
	 *  相殺額文字列.<p>
	 *
	 */
	public void s_setoff_amt(String value) {
		setConstString(offset + 54, $s_setoff_amt, value);
	}


	/**
	 *  税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 55, $tax_amt);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 55, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 55, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 55, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 55, $tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 55, $tax_amt, value);
	}


	/**
	 *  税額文字列.<p>
	 *
	 */
	public String s_tax_amt() {
		return getConstString(offset + 56, $s_tax_amt);
	}

	/**
	 *  税額文字列.<p>
	 *
	 */
	public void s_tax_amt(String value) {
		setConstString(offset + 56, $s_tax_amt, value);
	}


	/**
	 *  今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 57, $sw_to_amt);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 57, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 57, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 57, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 57, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 57, $sw_to_amt, value);
	}


	/**
	 *  今回振替額文字列.<p>
	 *
	 */
	public String s_sw_to_amt() {
		return getConstString(offset + 58, $s_sw_to_amt);
	}

	/**
	 *  今回振替額文字列.<p>
	 *
	 */
	public void s_sw_to_amt(String value) {
		setConstString(offset + 58, $s_sw_to_amt, value);
	}


	/**
	 *  前渡金残高.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return getConstNumber(offset + 59, $adv_pay_bal);
	}

	/**
	 *  前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		setConstNumber(offset + 59, $adv_pay_bal, value);
	}

	/**
	 *  前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		setConstNumber(offset + 59, $adv_pay_bal, value);
	}

	/**
	 *  前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		setConstNumber(offset + 59, $adv_pay_bal, value);
	}

	/**
	 *  前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		setConstNumber(offset + 59, $adv_pay_bal, value);
	}

	/**
	 *  前渡金残高.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		setConstNumber(offset + 59, $adv_pay_bal, value);
	}


	/**
	 *  前渡金残高文字列.<p>
	 *
	 */
	public String s_adv_pay_bal() {
		return getConstString(offset + 60, $s_adv_pay_bal);
	}

	/**
	 *  前渡金残高文字列.<p>
	 *
	 */
	public void s_adv_pay_bal(String value) {
		setConstString(offset + 60, $s_adv_pay_bal, value);
	}


	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public MCNumber adv_pay_amt() {
		return getConstNumber(offset + 61, $adv_pay_amt);
	}

	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(MCNumber value) {
		setConstNumber(offset + 61, $adv_pay_amt, value);
	}

	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(int value) {
		setConstNumber(offset + 61, $adv_pay_amt, value);
	}

	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(long value) {
		setConstNumber(offset + 61, $adv_pay_amt, value);
	}

	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(float value) {
		setConstNumber(offset + 61, $adv_pay_amt, value);
	}

	/**
	 *  前渡金支払額.<p>
	 *
	 */
	public void adv_pay_amt(double value) {
		setConstNumber(offset + 61, $adv_pay_amt, value);
	}


	/**
	 *  前渡金支払額文字列.<p>
	 *
	 */
	public String s_adv_pay_amt() {
		return getConstString(offset + 62, $s_adv_pay_amt);
	}

	/**
	 *  前渡金支払額文字列.<p>
	 *
	 */
	public void s_adv_pay_amt(String value) {
		setConstString(offset + 62, $s_adv_pay_amt, value);
	}


	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_amt() {
		return getConstNumber(offset + 63, $adv_pay_setoff_amt);
	}

	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(MCNumber value) {
		setConstNumber(offset + 63, $adv_pay_setoff_amt, value);
	}

	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(int value) {
		setConstNumber(offset + 63, $adv_pay_setoff_amt, value);
	}

	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(long value) {
		setConstNumber(offset + 63, $adv_pay_setoff_amt, value);
	}

	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(float value) {
		setConstNumber(offset + 63, $adv_pay_setoff_amt, value);
	}

	/**
	 *  前渡金相殺額.<p>
	 *
	 */
	public void adv_pay_setoff_amt(double value) {
		setConstNumber(offset + 63, $adv_pay_setoff_amt, value);
	}


	/**
	 *  前渡金相殺額文字列.<p>
	 *
	 */
	public String s_adv_pay_setoff_amt() {
		return getConstString(offset + 64, $s_adv_pay_setoff_amt);
	}

	/**
	 *  前渡金相殺額文字列.<p>
	 *
	 */
	public void s_adv_pay_setoff_amt(String value) {
		setConstString(offset + 64, $s_adv_pay_setoff_amt, value);
	}


	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_tax_amt() {
		return getConstNumber(offset + 65, $adv_pay_setoff_tax_amt);
	}

	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 65, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(int value) {
		setConstNumber(offset + 65, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(long value) {
		setConstNumber(offset + 65, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(float value) {
		setConstNumber(offset + 65, $adv_pay_setoff_tax_amt, value);
	}

	/**
	 *  前渡金相殺税額.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(double value) {
		setConstNumber(offset + 65, $adv_pay_setoff_tax_amt, value);
	}


	/**
	 *  前渡金相殺税額文字列.<p>
	 *
	 */
	public String s_adv_pay_setoff_tax_amt() {
		return getConstString(offset + 66, $s_adv_pay_setoff_tax_amt);
	}

	/**
	 *  前渡金相殺税額文字列.<p>
	 *
	 */
	public void s_adv_pay_setoff_tax_amt(String value) {
		setConstString(offset + 66, $s_adv_pay_setoff_tax_amt, value);
	}


	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 67, $pay_xrate);
	}

	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 67, $pay_xrate, value);
	}

	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 67, $pay_xrate, value);
	}

	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 67, $pay_xrate, value);
	}

	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 67, $pay_xrate, value);
	}

	/**
	 *  支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 67, $pay_xrate, value);
	}


	/**
	 *  支払照合為替レート文字列.<p>
	 *
	 */
	public String s_pay_xrate() {
		return getConstString(offset + 68, $s_pay_xrate);
	}

	/**
	 *  支払照合為替レート文字列.<p>
	 *
	 */
	public void s_pay_xrate(String value) {
		setConstString(offset + 68, $s_pay_xrate, value);
	}


	/**
	 *  税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 69, $tax_rate1);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 69, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 69, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 69, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 69, $tax_rate1, value);
	}


	/**
	 *  税率１文字列.<p>
	 *
	 */
	public String s_tax_rate1() {
		return getConstString(offset + 70, $s_tax_rate1);
	}

	/**
	 *  税率１文字列.<p>
	 *
	 */
	public void s_tax_rate1(String value) {
		setConstString(offset + 70, $s_tax_rate1, value);
	}


	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt1() {
		return getConstNumber(offset + 71, $tax_rate_purc_amt1);
	}

	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public void tax_rate_purc_amt1(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate_purc_amt1, value);
	}

	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public void tax_rate_purc_amt1(int value) {
		setConstNumber(offset + 71, $tax_rate_purc_amt1, value);
	}

	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public void tax_rate_purc_amt1(long value) {
		setConstNumber(offset + 71, $tax_rate_purc_amt1, value);
	}

	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public void tax_rate_purc_amt1(float value) {
		setConstNumber(offset + 71, $tax_rate_purc_amt1, value);
	}

	/**
	 *  税率毎仕入額１.<p>
	 *
	 */
	public void tax_rate_purc_amt1(double value) {
		setConstNumber(offset + 71, $tax_rate_purc_amt1, value);
	}


	/**
	 *  税率毎仕入額１文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt1() {
		return getConstString(offset + 72, $s_tax_rate_purc_amt1);
	}

	/**
	 *  税率毎仕入額１文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt1(String value) {
		setConstString(offset + 72, $s_tax_rate_purc_amt1, value);
	}


	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 73, $tax_rate_tax_amt1);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt1, value);
	}


	/**
	 *  税率毎税額１文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt1() {
		return getConstString(offset + 74, $s_tax_rate_tax_amt1);
	}

	/**
	 *  税率毎税額１文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt1(String value) {
		setConstString(offset + 74, $s_tax_rate_tax_amt1, value);
	}


	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 75, $tax_rate_base_tax_amt1);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 75, $tax_rate_base_tax_amt1, value);
	}


	/**
	 *  税率毎基準通貨税額１文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt1() {
		return getConstString(offset + 76, $s_tax_rate_base_tax_amt1);
	}

	/**
	 *  税率毎基準通貨税額１文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt1(String value) {
		setConstString(offset + 76, $s_tax_rate_base_tax_amt1, value);
	}


	/**
	 *  税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 77, $tax_rate2);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 77, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 77, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 77, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 77, $tax_rate2, value);
	}


	/**
	 *  税率２文字列.<p>
	 *
	 */
	public String s_tax_rate2() {
		return getConstString(offset + 78, $s_tax_rate2);
	}

	/**
	 *  税率２文字列.<p>
	 *
	 */
	public void s_tax_rate2(String value) {
		setConstString(offset + 78, $s_tax_rate2, value);
	}


	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt2() {
		return getConstNumber(offset + 79, $tax_rate_purc_amt2);
	}

	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public void tax_rate_purc_amt2(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate_purc_amt2, value);
	}

	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public void tax_rate_purc_amt2(int value) {
		setConstNumber(offset + 79, $tax_rate_purc_amt2, value);
	}

	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public void tax_rate_purc_amt2(long value) {
		setConstNumber(offset + 79, $tax_rate_purc_amt2, value);
	}

	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public void tax_rate_purc_amt2(float value) {
		setConstNumber(offset + 79, $tax_rate_purc_amt2, value);
	}

	/**
	 *  税率毎仕入額２.<p>
	 *
	 */
	public void tax_rate_purc_amt2(double value) {
		setConstNumber(offset + 79, $tax_rate_purc_amt2, value);
	}


	/**
	 *  税率毎仕入額２文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt2() {
		return getConstString(offset + 80, $s_tax_rate_purc_amt2);
	}

	/**
	 *  税率毎仕入額２文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt2(String value) {
		setConstString(offset + 80, $s_tax_rate_purc_amt2, value);
	}


	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 81, $tax_rate_tax_amt2);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt2, value);
	}


	/**
	 *  税率毎税額２文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt2() {
		return getConstString(offset + 82, $s_tax_rate_tax_amt2);
	}

	/**
	 *  税率毎税額２文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt2(String value) {
		setConstString(offset + 82, $s_tax_rate_tax_amt2, value);
	}


	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 83, $tax_rate_base_tax_amt2);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 83, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 83, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 83, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 83, $tax_rate_base_tax_amt2, value);
	}


	/**
	 *  税率毎基準通貨税額２文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt2() {
		return getConstString(offset + 84, $s_tax_rate_base_tax_amt2);
	}

	/**
	 *  税率毎基準通貨税額２文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt2(String value) {
		setConstString(offset + 84, $s_tax_rate_base_tax_amt2, value);
	}


	/**
	 *  税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 85, $tax_rate3);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 85, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 85, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 85, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 85, $tax_rate3, value);
	}


	/**
	 *  税率３文字列.<p>
	 *
	 */
	public String s_tax_rate3() {
		return getConstString(offset + 86, $s_tax_rate3);
	}

	/**
	 *  税率３文字列.<p>
	 *
	 */
	public void s_tax_rate3(String value) {
		setConstString(offset + 86, $s_tax_rate3, value);
	}


	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt3() {
		return getConstNumber(offset + 87, $tax_rate_purc_amt3);
	}

	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public void tax_rate_purc_amt3(MCNumber value) {
		setConstNumber(offset + 87, $tax_rate_purc_amt3, value);
	}

	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public void tax_rate_purc_amt3(int value) {
		setConstNumber(offset + 87, $tax_rate_purc_amt3, value);
	}

	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public void tax_rate_purc_amt3(long value) {
		setConstNumber(offset + 87, $tax_rate_purc_amt3, value);
	}

	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public void tax_rate_purc_amt3(float value) {
		setConstNumber(offset + 87, $tax_rate_purc_amt3, value);
	}

	/**
	 *  税率毎仕入額３.<p>
	 *
	 */
	public void tax_rate_purc_amt3(double value) {
		setConstNumber(offset + 87, $tax_rate_purc_amt3, value);
	}


	/**
	 *  税率毎仕入額３文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt3() {
		return getConstString(offset + 88, $s_tax_rate_purc_amt3);
	}

	/**
	 *  税率毎仕入額３文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt3(String value) {
		setConstString(offset + 88, $s_tax_rate_purc_amt3, value);
	}


	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 89, $tax_rate_tax_amt3);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 89, $tax_rate_tax_amt3, value);
	}


	/**
	 *  税率毎税額３文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt3() {
		return getConstString(offset + 90, $s_tax_rate_tax_amt3);
	}

	/**
	 *  税率毎税額３文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt3(String value) {
		setConstString(offset + 90, $s_tax_rate_tax_amt3, value);
	}


	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 91, $tax_rate_base_tax_amt3);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 91, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 91, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 91, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 91, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 91, $tax_rate_base_tax_amt3, value);
	}


	/**
	 *  税率毎基準通貨税額３文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt3() {
		return getConstString(offset + 92, $s_tax_rate_base_tax_amt3);
	}

	/**
	 *  税率毎基準通貨税額３文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt3(String value) {
		setConstString(offset + 92, $s_tax_rate_base_tax_amt3, value);
	}


	/**
	 *  税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 93, $tax_rate4);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 93, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 93, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 93, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 93, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 93, $tax_rate4, value);
	}


	/**
	 *  税率４文字列.<p>
	 *
	 */
	public String s_tax_rate4() {
		return getConstString(offset + 94, $s_tax_rate4);
	}

	/**
	 *  税率４文字列.<p>
	 *
	 */
	public void s_tax_rate4(String value) {
		setConstString(offset + 94, $s_tax_rate4, value);
	}


	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt4() {
		return getConstNumber(offset + 95, $tax_rate_purc_amt4);
	}

	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public void tax_rate_purc_amt4(MCNumber value) {
		setConstNumber(offset + 95, $tax_rate_purc_amt4, value);
	}

	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public void tax_rate_purc_amt4(int value) {
		setConstNumber(offset + 95, $tax_rate_purc_amt4, value);
	}

	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public void tax_rate_purc_amt4(long value) {
		setConstNumber(offset + 95, $tax_rate_purc_amt4, value);
	}

	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public void tax_rate_purc_amt4(float value) {
		setConstNumber(offset + 95, $tax_rate_purc_amt4, value);
	}

	/**
	 *  税率毎仕入額４.<p>
	 *
	 */
	public void tax_rate_purc_amt4(double value) {
		setConstNumber(offset + 95, $tax_rate_purc_amt4, value);
	}


	/**
	 *  税率毎仕入額４文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt4() {
		return getConstString(offset + 96, $s_tax_rate_purc_amt4);
	}

	/**
	 *  税率毎仕入額４文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt4(String value) {
		setConstString(offset + 96, $s_tax_rate_purc_amt4, value);
	}


	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 97, $tax_rate_tax_amt4);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 97, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 97, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 97, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 97, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 97, $tax_rate_tax_amt4, value);
	}


	/**
	 *  税率毎税額４文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt4() {
		return getConstString(offset + 98, $s_tax_rate_tax_amt4);
	}

	/**
	 *  税率毎税額４文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt4(String value) {
		setConstString(offset + 98, $s_tax_rate_tax_amt4, value);
	}


	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 99, $tax_rate_base_tax_amt4);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 99, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 99, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 99, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 99, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 99, $tax_rate_base_tax_amt4, value);
	}


	/**
	 *  税率毎基準通貨税額４文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt4() {
		return getConstString(offset + 100, $s_tax_rate_base_tax_amt4);
	}

	/**
	 *  税率毎基準通貨税額４文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt4(String value) {
		setConstString(offset + 100, $s_tax_rate_base_tax_amt4, value);
	}


	/**
	 *  税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 101, $tax_rate5);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 101, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 101, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 101, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 101, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 101, $tax_rate5, value);
	}


	/**
	 *  税率５文字列.<p>
	 *
	 */
	public String s_tax_rate5() {
		return getConstString(offset + 102, $s_tax_rate5);
	}

	/**
	 *  税率５文字列.<p>
	 *
	 */
	public void s_tax_rate5(String value) {
		setConstString(offset + 102, $s_tax_rate5, value);
	}


	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt5() {
		return getConstNumber(offset + 103, $tax_rate_purc_amt5);
	}

	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public void tax_rate_purc_amt5(MCNumber value) {
		setConstNumber(offset + 103, $tax_rate_purc_amt5, value);
	}

	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public void tax_rate_purc_amt5(int value) {
		setConstNumber(offset + 103, $tax_rate_purc_amt5, value);
	}

	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public void tax_rate_purc_amt5(long value) {
		setConstNumber(offset + 103, $tax_rate_purc_amt5, value);
	}

	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public void tax_rate_purc_amt5(float value) {
		setConstNumber(offset + 103, $tax_rate_purc_amt5, value);
	}

	/**
	 *  税率毎仕入額５.<p>
	 *
	 */
	public void tax_rate_purc_amt5(double value) {
		setConstNumber(offset + 103, $tax_rate_purc_amt5, value);
	}


	/**
	 *  税率毎仕入額５文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt5() {
		return getConstString(offset + 104, $s_tax_rate_purc_amt5);
	}

	/**
	 *  税率毎仕入額５文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt5(String value) {
		setConstString(offset + 104, $s_tax_rate_purc_amt5, value);
	}


	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 105, $tax_rate_tax_amt5);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 105, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 105, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 105, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 105, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 105, $tax_rate_tax_amt5, value);
	}


	/**
	 *  税率毎税額５文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt5() {
		return getConstString(offset + 106, $s_tax_rate_tax_amt5);
	}

	/**
	 *  税率毎税額５文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt5(String value) {
		setConstString(offset + 106, $s_tax_rate_tax_amt5, value);
	}


	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 107, $tax_rate_base_tax_amt5);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 107, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 107, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 107, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 107, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 107, $tax_rate_base_tax_amt5, value);
	}


	/**
	 *  税率毎基準通貨税額５文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt5() {
		return getConstString(offset + 108, $s_tax_rate_base_tax_amt5);
	}

	/**
	 *  税率毎基準通貨税額５文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt5(String value) {
		setConstString(offset + 108, $s_tax_rate_base_tax_amt5, value);
	}


	/**
	 *  税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 109, $tax_rate6);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 109, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 109, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 109, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 109, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 109, $tax_rate6, value);
	}


	/**
	 *  税率６文字列.<p>
	 *
	 */
	public String s_tax_rate6() {
		return getConstString(offset + 110, $s_tax_rate6);
	}

	/**
	 *  税率６文字列.<p>
	 *
	 */
	public void s_tax_rate6(String value) {
		setConstString(offset + 110, $s_tax_rate6, value);
	}


	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt6() {
		return getConstNumber(offset + 111, $tax_rate_purc_amt6);
	}

	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public void tax_rate_purc_amt6(MCNumber value) {
		setConstNumber(offset + 111, $tax_rate_purc_amt6, value);
	}

	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public void tax_rate_purc_amt6(int value) {
		setConstNumber(offset + 111, $tax_rate_purc_amt6, value);
	}

	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public void tax_rate_purc_amt6(long value) {
		setConstNumber(offset + 111, $tax_rate_purc_amt6, value);
	}

	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public void tax_rate_purc_amt6(float value) {
		setConstNumber(offset + 111, $tax_rate_purc_amt6, value);
	}

	/**
	 *  税率毎仕入額６.<p>
	 *
	 */
	public void tax_rate_purc_amt6(double value) {
		setConstNumber(offset + 111, $tax_rate_purc_amt6, value);
	}


	/**
	 *  税率毎仕入額６文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt6() {
		return getConstString(offset + 112, $s_tax_rate_purc_amt6);
	}

	/**
	 *  税率毎仕入額６文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt6(String value) {
		setConstString(offset + 112, $s_tax_rate_purc_amt6, value);
	}


	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 113, $tax_rate_tax_amt6);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 113, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 113, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 113, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 113, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 113, $tax_rate_tax_amt6, value);
	}


	/**
	 *  税率毎税額６文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt6() {
		return getConstString(offset + 114, $s_tax_rate_tax_amt6);
	}

	/**
	 *  税率毎税額６文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt6(String value) {
		setConstString(offset + 114, $s_tax_rate_tax_amt6, value);
	}


	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 115, $tax_rate_base_tax_amt6);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 115, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 115, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 115, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 115, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 115, $tax_rate_base_tax_amt6, value);
	}


	/**
	 *  税率毎基準通貨税額６文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt6() {
		return getConstString(offset + 116, $s_tax_rate_base_tax_amt6);
	}

	/**
	 *  税率毎基準通貨税額６文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt6(String value) {
		setConstString(offset + 116, $s_tax_rate_base_tax_amt6, value);
	}


	/**
	 *  税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 117, $tax_rate7);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 117, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 117, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 117, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 117, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 117, $tax_rate7, value);
	}


	/**
	 *  税率７文字列.<p>
	 *
	 */
	public String s_tax_rate7() {
		return getConstString(offset + 118, $s_tax_rate7);
	}

	/**
	 *  税率７文字列.<p>
	 *
	 */
	public void s_tax_rate7(String value) {
		setConstString(offset + 118, $s_tax_rate7, value);
	}


	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt7() {
		return getConstNumber(offset + 119, $tax_rate_purc_amt7);
	}

	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public void tax_rate_purc_amt7(MCNumber value) {
		setConstNumber(offset + 119, $tax_rate_purc_amt7, value);
	}

	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public void tax_rate_purc_amt7(int value) {
		setConstNumber(offset + 119, $tax_rate_purc_amt7, value);
	}

	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public void tax_rate_purc_amt7(long value) {
		setConstNumber(offset + 119, $tax_rate_purc_amt7, value);
	}

	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public void tax_rate_purc_amt7(float value) {
		setConstNumber(offset + 119, $tax_rate_purc_amt7, value);
	}

	/**
	 *  税率毎仕入額７.<p>
	 *
	 */
	public void tax_rate_purc_amt7(double value) {
		setConstNumber(offset + 119, $tax_rate_purc_amt7, value);
	}


	/**
	 *  税率毎仕入額７文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt7() {
		return getConstString(offset + 120, $s_tax_rate_purc_amt7);
	}

	/**
	 *  税率毎仕入額７文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt7(String value) {
		setConstString(offset + 120, $s_tax_rate_purc_amt7, value);
	}


	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 121, $tax_rate_tax_amt7);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 121, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 121, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 121, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 121, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 121, $tax_rate_tax_amt7, value);
	}


	/**
	 *  税率毎税額７文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt7() {
		return getConstString(offset + 122, $s_tax_rate_tax_amt7);
	}

	/**
	 *  税率毎税額７文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt7(String value) {
		setConstString(offset + 122, $s_tax_rate_tax_amt7, value);
	}


	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 123, $tax_rate_base_tax_amt7);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 123, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 123, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 123, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 123, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 123, $tax_rate_base_tax_amt7, value);
	}


	/**
	 *  税率毎基準通貨税額７文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt7() {
		return getConstString(offset + 124, $s_tax_rate_base_tax_amt7);
	}

	/**
	 *  税率毎基準通貨税額７文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt7(String value) {
		setConstString(offset + 124, $s_tax_rate_base_tax_amt7, value);
	}


	/**
	 *  税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 125, $tax_rate8);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 125, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 125, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 125, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 125, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 125, $tax_rate8, value);
	}


	/**
	 *  税率８文字列.<p>
	 *
	 */
	public String s_tax_rate8() {
		return getConstString(offset + 126, $s_tax_rate8);
	}

	/**
	 *  税率８文字列.<p>
	 *
	 */
	public void s_tax_rate8(String value) {
		setConstString(offset + 126, $s_tax_rate8, value);
	}


	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt8() {
		return getConstNumber(offset + 127, $tax_rate_purc_amt8);
	}

	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public void tax_rate_purc_amt8(MCNumber value) {
		setConstNumber(offset + 127, $tax_rate_purc_amt8, value);
	}

	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public void tax_rate_purc_amt8(int value) {
		setConstNumber(offset + 127, $tax_rate_purc_amt8, value);
	}

	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public void tax_rate_purc_amt8(long value) {
		setConstNumber(offset + 127, $tax_rate_purc_amt8, value);
	}

	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public void tax_rate_purc_amt8(float value) {
		setConstNumber(offset + 127, $tax_rate_purc_amt8, value);
	}

	/**
	 *  税率毎仕入額８.<p>
	 *
	 */
	public void tax_rate_purc_amt8(double value) {
		setConstNumber(offset + 127, $tax_rate_purc_amt8, value);
	}


	/**
	 *  税率毎仕入額８文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt8() {
		return getConstString(offset + 128, $s_tax_rate_purc_amt8);
	}

	/**
	 *  税率毎仕入額８文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt8(String value) {
		setConstString(offset + 128, $s_tax_rate_purc_amt8, value);
	}


	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 129, $tax_rate_tax_amt8);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 129, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 129, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 129, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 129, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 129, $tax_rate_tax_amt8, value);
	}


	/**
	 *  税率毎税額８文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt8() {
		return getConstString(offset + 130, $s_tax_rate_tax_amt8);
	}

	/**
	 *  税率毎税額８文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt8(String value) {
		setConstString(offset + 130, $s_tax_rate_tax_amt8, value);
	}


	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 131, $tax_rate_base_tax_amt8);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 131, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 131, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 131, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 131, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 131, $tax_rate_base_tax_amt8, value);
	}


	/**
	 *  税率毎基準通貨税額８文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt8() {
		return getConstString(offset + 132, $s_tax_rate_base_tax_amt8);
	}

	/**
	 *  税率毎基準通貨税額８文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt8(String value) {
		setConstString(offset + 132, $s_tax_rate_base_tax_amt8, value);
	}


	/**
	 *  税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 133, $tax_rate9);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 133, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 133, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 133, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 133, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 133, $tax_rate9, value);
	}


	/**
	 *  税率９文字列.<p>
	 *
	 */
	public String s_tax_rate9() {
		return getConstString(offset + 134, $s_tax_rate9);
	}

	/**
	 *  税率９文字列.<p>
	 *
	 */
	public void s_tax_rate9(String value) {
		setConstString(offset + 134, $s_tax_rate9, value);
	}


	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt9() {
		return getConstNumber(offset + 135, $tax_rate_purc_amt9);
	}

	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public void tax_rate_purc_amt9(MCNumber value) {
		setConstNumber(offset + 135, $tax_rate_purc_amt9, value);
	}

	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public void tax_rate_purc_amt9(int value) {
		setConstNumber(offset + 135, $tax_rate_purc_amt9, value);
	}

	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public void tax_rate_purc_amt9(long value) {
		setConstNumber(offset + 135, $tax_rate_purc_amt9, value);
	}

	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public void tax_rate_purc_amt9(float value) {
		setConstNumber(offset + 135, $tax_rate_purc_amt9, value);
	}

	/**
	 *  税率毎仕入額９.<p>
	 *
	 */
	public void tax_rate_purc_amt9(double value) {
		setConstNumber(offset + 135, $tax_rate_purc_amt9, value);
	}


	/**
	 *  税率毎仕入額９文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt9() {
		return getConstString(offset + 136, $s_tax_rate_purc_amt9);
	}

	/**
	 *  税率毎仕入額９文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt9(String value) {
		setConstString(offset + 136, $s_tax_rate_purc_amt9, value);
	}


	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 137, $tax_rate_tax_amt9);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 137, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 137, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 137, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 137, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 137, $tax_rate_tax_amt9, value);
	}


	/**
	 *  税率毎税額９文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt9() {
		return getConstString(offset + 138, $s_tax_rate_tax_amt9);
	}

	/**
	 *  税率毎税額９文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt9(String value) {
		setConstString(offset + 138, $s_tax_rate_tax_amt9, value);
	}


	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 139, $tax_rate_base_tax_amt9);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 139, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 139, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 139, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 139, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 139, $tax_rate_base_tax_amt9, value);
	}


	/**
	 *  税率毎基準通貨税額９文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt9() {
		return getConstString(offset + 140, $s_tax_rate_base_tax_amt9);
	}

	/**
	 *  税率毎基準通貨税額９文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt9(String value) {
		setConstString(offset + 140, $s_tax_rate_base_tax_amt9, value);
	}


	/**
	 *  税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 141, $tax_rate10);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 141, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 141, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 141, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 141, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 141, $tax_rate10, value);
	}


	/**
	 *  税率１０文字列.<p>
	 *
	 */
	public String s_tax_rate10() {
		return getConstString(offset + 142, $s_tax_rate10);
	}

	/**
	 *  税率１０文字列.<p>
	 *
	 */
	public void s_tax_rate10(String value) {
		setConstString(offset + 142, $s_tax_rate10, value);
	}


	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public MCNumber tax_rate_purc_amt10() {
		return getConstNumber(offset + 143, $tax_rate_purc_amt10);
	}

	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public void tax_rate_purc_amt10(MCNumber value) {
		setConstNumber(offset + 143, $tax_rate_purc_amt10, value);
	}

	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public void tax_rate_purc_amt10(int value) {
		setConstNumber(offset + 143, $tax_rate_purc_amt10, value);
	}

	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public void tax_rate_purc_amt10(long value) {
		setConstNumber(offset + 143, $tax_rate_purc_amt10, value);
	}

	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public void tax_rate_purc_amt10(float value) {
		setConstNumber(offset + 143, $tax_rate_purc_amt10, value);
	}

	/**
	 *  税率毎仕入額１０.<p>
	 *
	 */
	public void tax_rate_purc_amt10(double value) {
		setConstNumber(offset + 143, $tax_rate_purc_amt10, value);
	}


	/**
	 *  税率毎仕入額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_purc_amt10() {
		return getConstString(offset + 144, $s_tax_rate_purc_amt10);
	}

	/**
	 *  税率毎仕入額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_purc_amt10(String value) {
		setConstString(offset + 144, $s_tax_rate_purc_amt10, value);
	}


	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 145, $tax_rate_tax_amt10);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 145, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 145, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 145, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 145, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 145, $tax_rate_tax_amt10, value);
	}


	/**
	 *  税率毎税額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_tax_amt10() {
		return getConstString(offset + 146, $s_tax_rate_tax_amt10);
	}

	/**
	 *  税率毎税額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_tax_amt10(String value) {
		setConstString(offset + 146, $s_tax_rate_tax_amt10, value);
	}


	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 147, $tax_rate_base_tax_amt10);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 147, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 147, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 147, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 147, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 147, $tax_rate_base_tax_amt10, value);
	}


	/**
	 *  税率毎基準通貨税額１０文字列.<p>
	 *
	 */
	public String s_tax_rate_base_tax_amt10() {
		return getConstString(offset + 148, $s_tax_rate_base_tax_amt10);
	}

	/**
	 *  税率毎基準通貨税額１０文字列.<p>
	 *
	 */
	public void s_tax_rate_base_tax_amt10(String value) {
		setConstString(offset + 148, $s_tax_rate_base_tax_amt10, value);
	}


	/**
	 *  支払予定日付１.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return getConstDate(offset + 149, $pay_schd_dt1);
	}

	/**
	 *  支払予定日付１.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		setConstDate(offset + 149, $pay_schd_dt1, value);
	}


	/**
	 *  支払方法１.<p>
	 *
	 */
	public String sttl_cd1() {
		return getConstString(offset + 150, $sttl_cd1);
	}

	/**
	 *  支払方法１.<p>
	 *
	 */
	public void sttl_cd1(String value) {
		setConstString(offset + 150, $sttl_cd1, value);
	}


	/**
	 *  支払方法１.<p>
	 *
	 */
	public String sttl_nm1() {
		return getConstString(offset + 151, $sttl_nm1);
	}

	/**
	 *  支払方法１.<p>
	 *
	 */
	public void sttl_nm1(String value) {
		setConstString(offset + 151, $sttl_nm1, value);
	}


	/**
	 *  支払金額１.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return getConstNumber(offset + 152, $pay_schd_amt1);
	}

	/**
	 *  支払金額１.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		setConstNumber(offset + 152, $pay_schd_amt1, value);
	}

	/**
	 *  支払金額１.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		setConstNumber(offset + 152, $pay_schd_amt1, value);
	}

	/**
	 *  支払金額１.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		setConstNumber(offset + 152, $pay_schd_amt1, value);
	}

	/**
	 *  支払金額１.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		setConstNumber(offset + 152, $pay_schd_amt1, value);
	}

	/**
	 *  支払金額１.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		setConstNumber(offset + 152, $pay_schd_amt1, value);
	}


	/**
	 *  支払金額１文字列.<p>
	 *
	 */
	public String s_pay_schd_amt1() {
		return getConstString(offset + 153, $s_pay_schd_amt1);
	}

	/**
	 *  支払金額１文字列.<p>
	 *
	 */
	public void s_pay_schd_amt1(String value) {
		setConstString(offset + 153, $s_pay_schd_amt1, value);
	}


	/**
	 *  銀行１.<p>
	 *
	 */
	public String bank_cd1() {
		return getConstString(offset + 154, $bank_cd1);
	}

	/**
	 *  銀行１.<p>
	 *
	 */
	public void bank_cd1(String value) {
		setConstString(offset + 154, $bank_cd1, value);
	}


	/**
	 *  振込口座１（銀行名）.<p>
	 *
	 */
	public String bank_nm1() {
		return getConstString(offset + 155, $bank_nm1);
	}

	/**
	 *  振込口座１（銀行名）.<p>
	 *
	 */
	public void bank_nm1(String value) {
		setConstString(offset + 155, $bank_nm1, value);
	}


	/**
	 *  支店１.<p>
	 *
	 */
	public String branch_cd1() {
		return getConstString(offset + 156, $branch_cd1);
	}

	/**
	 *  支店１.<p>
	 *
	 */
	public void branch_cd1(String value) {
		setConstString(offset + 156, $branch_cd1, value);
	}


	/**
	 *  振込口座１（支店名）.<p>
	 *
	 */
	public String branch_nm1() {
		return getConstString(offset + 157, $branch_nm1);
	}

	/**
	 *  振込口座１（支店名）.<p>
	 *
	 */
	public void branch_nm1(String value) {
		setConstString(offset + 157, $branch_nm1, value);
	}


	/**
	 *  振込口座１（口座番号）.<p>
	 *
	 */
	public String bank_ac_no1() {
		return getConstString(offset + 158, $bank_ac_no1);
	}

	/**
	 *  振込口座１（口座番号）.<p>
	 *
	 */
	public void bank_ac_no1(String value) {
		setConstString(offset + 158, $bank_ac_no1, value);
	}


	/**
	 *  支払予定日付２.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return getConstDate(offset + 159, $pay_schd_dt2);
	}

	/**
	 *  支払予定日付２.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		setConstDate(offset + 159, $pay_schd_dt2, value);
	}


	/**
	 *  支払方法２.<p>
	 *
	 */
	public String sttl_cd2() {
		return getConstString(offset + 160, $sttl_cd2);
	}

	/**
	 *  支払方法２.<p>
	 *
	 */
	public void sttl_cd2(String value) {
		setConstString(offset + 160, $sttl_cd2, value);
	}


	/**
	 *  支払方法２.<p>
	 *
	 */
	public String sttl_nm2() {
		return getConstString(offset + 161, $sttl_nm2);
	}

	/**
	 *  支払方法２.<p>
	 *
	 */
	public void sttl_nm2(String value) {
		setConstString(offset + 161, $sttl_nm2, value);
	}


	/**
	 *  支払金額２.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return getConstNumber(offset + 162, $pay_schd_amt2);
	}

	/**
	 *  支払金額２.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		setConstNumber(offset + 162, $pay_schd_amt2, value);
	}

	/**
	 *  支払金額２.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		setConstNumber(offset + 162, $pay_schd_amt2, value);
	}

	/**
	 *  支払金額２.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		setConstNumber(offset + 162, $pay_schd_amt2, value);
	}

	/**
	 *  支払金額２.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		setConstNumber(offset + 162, $pay_schd_amt2, value);
	}

	/**
	 *  支払金額２.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		setConstNumber(offset + 162, $pay_schd_amt2, value);
	}


	/**
	 *  支払金額２文字列.<p>
	 *
	 */
	public String s_pay_schd_amt2() {
		return getConstString(offset + 163, $s_pay_schd_amt2);
	}

	/**
	 *  支払金額２文字列.<p>
	 *
	 */
	public void s_pay_schd_amt2(String value) {
		setConstString(offset + 163, $s_pay_schd_amt2, value);
	}


	/**
	 *  銀行２.<p>
	 *
	 */
	public String bank_cd2() {
		return getConstString(offset + 164, $bank_cd2);
	}

	/**
	 *  銀行２.<p>
	 *
	 */
	public void bank_cd2(String value) {
		setConstString(offset + 164, $bank_cd2, value);
	}


	/**
	 *  振込口座２（銀行名）.<p>
	 *
	 */
	public String bank_nm2() {
		return getConstString(offset + 165, $bank_nm2);
	}

	/**
	 *  振込口座２（銀行名）.<p>
	 *
	 */
	public void bank_nm2(String value) {
		setConstString(offset + 165, $bank_nm2, value);
	}


	/**
	 *  支店２.<p>
	 *
	 */
	public String branch_cd2() {
		return getConstString(offset + 166, $branch_cd2);
	}

	/**
	 *  支店２.<p>
	 *
	 */
	public void branch_cd2(String value) {
		setConstString(offset + 166, $branch_cd2, value);
	}


	/**
	 *  振込口座２（支店名）.<p>
	 *
	 */
	public String branch_nm2() {
		return getConstString(offset + 167, $branch_nm2);
	}

	/**
	 *  振込口座２（支店名）.<p>
	 *
	 */
	public void branch_nm2(String value) {
		setConstString(offset + 167, $branch_nm2, value);
	}


	/**
	 *  振込口座２（口座番号）.<p>
	 *
	 */
	public String bank_ac_no2() {
		return getConstString(offset + 168, $bank_ac_no2);
	}

	/**
	 *  振込口座２（口座番号）.<p>
	 *
	 */
	public void bank_ac_no2(String value) {
		setConstString(offset + 168, $bank_ac_no2, value);
	}


	/**
	 *  支払予定日付３.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return getConstDate(offset + 169, $pay_schd_dt3);
	}

	/**
	 *  支払予定日付３.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		setConstDate(offset + 169, $pay_schd_dt3, value);
	}


	/**
	 *  支払方法３.<p>
	 *
	 */
	public String sttl_cd3() {
		return getConstString(offset + 170, $sttl_cd3);
	}

	/**
	 *  支払方法３.<p>
	 *
	 */
	public void sttl_cd3(String value) {
		setConstString(offset + 170, $sttl_cd3, value);
	}


	/**
	 *  支払方法３.<p>
	 *
	 */
	public String sttl_nm3() {
		return getConstString(offset + 171, $sttl_nm3);
	}

	/**
	 *  支払方法３.<p>
	 *
	 */
	public void sttl_nm3(String value) {
		setConstString(offset + 171, $sttl_nm3, value);
	}


	/**
	 *  支払金額３.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return getConstNumber(offset + 172, $pay_schd_amt3);
	}

	/**
	 *  支払金額３.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		setConstNumber(offset + 172, $pay_schd_amt3, value);
	}

	/**
	 *  支払金額３.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		setConstNumber(offset + 172, $pay_schd_amt3, value);
	}

	/**
	 *  支払金額３.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		setConstNumber(offset + 172, $pay_schd_amt3, value);
	}

	/**
	 *  支払金額３.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		setConstNumber(offset + 172, $pay_schd_amt3, value);
	}

	/**
	 *  支払金額３.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		setConstNumber(offset + 172, $pay_schd_amt3, value);
	}


	/**
	 *  支払金額３文字列.<p>
	 *
	 */
	public String s_pay_schd_amt3() {
		return getConstString(offset + 173, $s_pay_schd_amt3);
	}

	/**
	 *  支払金額３文字列.<p>
	 *
	 */
	public void s_pay_schd_amt3(String value) {
		setConstString(offset + 173, $s_pay_schd_amt3, value);
	}


	/**
	 *  銀行３.<p>
	 *
	 */
	public String bank_cd3() {
		return getConstString(offset + 174, $bank_cd3);
	}

	/**
	 *  銀行３.<p>
	 *
	 */
	public void bank_cd3(String value) {
		setConstString(offset + 174, $bank_cd3, value);
	}


	/**
	 *  振込口座３（銀行名）.<p>
	 *
	 */
	public String bank_nm3() {
		return getConstString(offset + 175, $bank_nm3);
	}

	/**
	 *  振込口座３（銀行名）.<p>
	 *
	 */
	public void bank_nm3(String value) {
		setConstString(offset + 175, $bank_nm3, value);
	}


	/**
	 *  支店３.<p>
	 *
	 */
	public String branch_cd3() {
		return getConstString(offset + 176, $branch_cd3);
	}

	/**
	 *  支店３.<p>
	 *
	 */
	public void branch_cd3(String value) {
		setConstString(offset + 176, $branch_cd3, value);
	}


	/**
	 *  振込口座３（支店名）.<p>
	 *
	 */
	public String branch_nm3() {
		return getConstString(offset + 177, $branch_nm3);
	}

	/**
	 *  振込口座３（支店名）.<p>
	 *
	 */
	public void branch_nm3(String value) {
		setConstString(offset + 177, $branch_nm3, value);
	}


	/**
	 *  振込口座３（口座番号）.<p>
	 *
	 */
	public String bank_ac_no3() {
		return getConstString(offset + 178, $bank_ac_no3);
	}

	/**
	 *  振込口座３（口座番号）.<p>
	 *
	 */
	public void bank_ac_no3(String value) {
		setConstString(offset + 178, $bank_ac_no3, value);
	}


	/**
	 *  支払予定日付４.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return getConstDate(offset + 179, $pay_schd_dt4);
	}

	/**
	 *  支払予定日付４.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		setConstDate(offset + 179, $pay_schd_dt4, value);
	}


	/**
	 *  支払方法４.<p>
	 *
	 */
	public String sttl_cd4() {
		return getConstString(offset + 180, $sttl_cd4);
	}

	/**
	 *  支払方法４.<p>
	 *
	 */
	public void sttl_cd4(String value) {
		setConstString(offset + 180, $sttl_cd4, value);
	}


	/**
	 *  支払方法４.<p>
	 *
	 */
	public String sttl_nm4() {
		return getConstString(offset + 181, $sttl_nm4);
	}

	/**
	 *  支払方法４.<p>
	 *
	 */
	public void sttl_nm4(String value) {
		setConstString(offset + 181, $sttl_nm4, value);
	}


	/**
	 *  支払金額４.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return getConstNumber(offset + 182, $pay_schd_amt4);
	}

	/**
	 *  支払金額４.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		setConstNumber(offset + 182, $pay_schd_amt4, value);
	}

	/**
	 *  支払金額４.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		setConstNumber(offset + 182, $pay_schd_amt4, value);
	}

	/**
	 *  支払金額４.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		setConstNumber(offset + 182, $pay_schd_amt4, value);
	}

	/**
	 *  支払金額４.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		setConstNumber(offset + 182, $pay_schd_amt4, value);
	}

	/**
	 *  支払金額４.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		setConstNumber(offset + 182, $pay_schd_amt4, value);
	}


	/**
	 *  支払金額４文字列.<p>
	 *
	 */
	public String s_pay_schd_amt4() {
		return getConstString(offset + 183, $s_pay_schd_amt4);
	}

	/**
	 *  支払金額４文字列.<p>
	 *
	 */
	public void s_pay_schd_amt4(String value) {
		setConstString(offset + 183, $s_pay_schd_amt4, value);
	}


	/**
	 *  銀行４.<p>
	 *
	 */
	public String bank_cd4() {
		return getConstString(offset + 184, $bank_cd4);
	}

	/**
	 *  銀行４.<p>
	 *
	 */
	public void bank_cd4(String value) {
		setConstString(offset + 184, $bank_cd4, value);
	}


	/**
	 *  振込口座４（銀行名）.<p>
	 *
	 */
	public String bank_nm4() {
		return getConstString(offset + 185, $bank_nm4);
	}

	/**
	 *  振込口座４（銀行名）.<p>
	 *
	 */
	public void bank_nm4(String value) {
		setConstString(offset + 185, $bank_nm4, value);
	}


	/**
	 *  支店４.<p>
	 *
	 */
	public String branch_cd4() {
		return getConstString(offset + 186, $branch_cd4);
	}

	/**
	 *  支店４.<p>
	 *
	 */
	public void branch_cd4(String value) {
		setConstString(offset + 186, $branch_cd4, value);
	}


	/**
	 *  振込口座４（支店名）.<p>
	 *
	 */
	public String branch_nm4() {
		return getConstString(offset + 187, $branch_nm4);
	}

	/**
	 *  振込口座４（支店名）.<p>
	 *
	 */
	public void branch_nm4(String value) {
		setConstString(offset + 187, $branch_nm4, value);
	}


	/**
	 *  振込口座４（口座番号）.<p>
	 *
	 */
	public String bank_ac_no4() {
		return getConstString(offset + 188, $bank_ac_no4);
	}

	/**
	 *  振込口座４（口座番号）.<p>
	 *
	 */
	public void bank_ac_no4(String value) {
		setConstString(offset + 188, $bank_ac_no4, value);
	}


	/**
	 *  支払予定日付５.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return getConstDate(offset + 189, $pay_schd_dt5);
	}

	/**
	 *  支払予定日付５.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		setConstDate(offset + 189, $pay_schd_dt5, value);
	}


	/**
	 *  支払方法５.<p>
	 *
	 */
	public String sttl_cd5() {
		return getConstString(offset + 190, $sttl_cd5);
	}

	/**
	 *  支払方法５.<p>
	 *
	 */
	public void sttl_cd5(String value) {
		setConstString(offset + 190, $sttl_cd5, value);
	}


	/**
	 *  支払方法５.<p>
	 *
	 */
	public String sttl_nm5() {
		return getConstString(offset + 191, $sttl_nm5);
	}

	/**
	 *  支払方法５.<p>
	 *
	 */
	public void sttl_nm5(String value) {
		setConstString(offset + 191, $sttl_nm5, value);
	}


	/**
	 *  支払金額５.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return getConstNumber(offset + 192, $pay_schd_amt5);
	}

	/**
	 *  支払金額５.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		setConstNumber(offset + 192, $pay_schd_amt5, value);
	}

	/**
	 *  支払金額５.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		setConstNumber(offset + 192, $pay_schd_amt5, value);
	}

	/**
	 *  支払金額５.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		setConstNumber(offset + 192, $pay_schd_amt5, value);
	}

	/**
	 *  支払金額５.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		setConstNumber(offset + 192, $pay_schd_amt5, value);
	}

	/**
	 *  支払金額５.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		setConstNumber(offset + 192, $pay_schd_amt5, value);
	}


	/**
	 *  支払金額５文字列.<p>
	 *
	 */
	public String s_pay_schd_amt5() {
		return getConstString(offset + 193, $s_pay_schd_amt5);
	}

	/**
	 *  支払金額５文字列.<p>
	 *
	 */
	public void s_pay_schd_amt5(String value) {
		setConstString(offset + 193, $s_pay_schd_amt5, value);
	}


	/**
	 *  銀行５.<p>
	 *
	 */
	public String bank_cd5() {
		return getConstString(offset + 194, $bank_cd5);
	}

	/**
	 *  銀行５.<p>
	 *
	 */
	public void bank_cd5(String value) {
		setConstString(offset + 194, $bank_cd5, value);
	}


	/**
	 *  振込口座５（銀行名）.<p>
	 *
	 */
	public String bank_nm5() {
		return getConstString(offset + 195, $bank_nm5);
	}

	/**
	 *  振込口座５（銀行名）.<p>
	 *
	 */
	public void bank_nm5(String value) {
		setConstString(offset + 195, $bank_nm5, value);
	}


	/**
	 *  支店５.<p>
	 *
	 */
	public String branch_cd5() {
		return getConstString(offset + 196, $branch_cd5);
	}

	/**
	 *  支店５.<p>
	 *
	 */
	public void branch_cd5(String value) {
		setConstString(offset + 196, $branch_cd5, value);
	}


	/**
	 *  振込口座５（支店名）.<p>
	 *
	 */
	public String branch_nm5() {
		return getConstString(offset + 197, $branch_nm5);
	}

	/**
	 *  振込口座５（支店名）.<p>
	 *
	 */
	public void branch_nm5(String value) {
		setConstString(offset + 197, $branch_nm5, value);
	}


	/**
	 *  振込口座５（口座番号）.<p>
	 *
	 */
	public String bank_ac_no5() {
		return getConstString(offset + 198, $bank_ac_no5);
	}

	/**
	 *  振込口座５（口座番号）.<p>
	 *
	 */
	public void bank_ac_no5(String value) {
		setConstString(offset + 198, $bank_ac_no5, value);
	}


	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public boolean pay_ntc_dtl_outp_flg() {
		return getConstBoolean(offset + 199, $pay_ntc_dtl_outp_flg);
	}

	/**
	 *  支払通知書明細出力ＦＬＧ.<p>
	 *
	 */
	public void pay_ntc_dtl_outp_flg(boolean value) {
		setConstBoolean(offset + 199, $pay_ntc_dtl_outp_flg, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 200, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 200, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 201, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 201, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 202, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 202, $sub_char3, value);
	}


	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public MCNumber hdr_page() {
		return getConstNumber(offset + 203, $hdr_page);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(MCNumber value) {
		setConstNumber(offset + 203, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(int value) {
		setConstNumber(offset + 203, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(long value) {
		setConstNumber(offset + 203, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(float value) {
		setConstNumber(offset + 203, $hdr_page, value);
	}

	/**
	 *  ヘッダページ数.<p>
	 *
	 */
	public void hdr_page(double value) {
		setConstNumber(offset + 203, $hdr_page, value);
	}


	public String getString(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_addr.equalsIgnoreCase(name)) {
			return pay_ntc_addr();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($s_schd_pay_amt.equalsIgnoreCase(name)) {
			return s_schd_pay_amt();
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
		if ($s_last_pay_schd_amt.equalsIgnoreCase(name)) {
			return s_last_pay_schd_amt();
		}
		if ($s_pay_amt.equalsIgnoreCase(name)) {
			return s_pay_amt();
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			return s_sw_amt();
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			return s_bfw_amt();
		}
		if ($s_purc_amt.equalsIgnoreCase(name)) {
			return s_purc_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			return s_setoff_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			return s_sw_to_amt();
		}
		if ($s_adv_pay_bal.equalsIgnoreCase(name)) {
			return s_adv_pay_bal();
		}
		if ($s_adv_pay_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_amt();
		}
		if ($s_adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_setoff_amt();
		}
		if ($s_adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_setoff_tax_amt();
		}
		if ($s_pay_xrate.equalsIgnoreCase(name)) {
			return s_pay_xrate();
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			return s_tax_rate1();
		}
		if ($s_tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt1();
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
		if ($s_tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt2();
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
		if ($s_tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt3();
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
		if ($s_tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt4();
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
		if ($s_tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt5();
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
		if ($s_tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt6();
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
		if ($s_tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt7();
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
		if ($s_tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt8();
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
		if ($s_tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt9();
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
		if ($s_tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt10();
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt10();
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt10();
		}
		if ($sttl_cd1.equalsIgnoreCase(name)) {
			return sttl_cd1();
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			return sttl_nm1();
		}
		if ($s_pay_schd_amt1.equalsIgnoreCase(name)) {
			return s_pay_schd_amt1();
		}
		if ($bank_cd1.equalsIgnoreCase(name)) {
			return bank_cd1();
		}
		if ($bank_nm1.equalsIgnoreCase(name)) {
			return bank_nm1();
		}
		if ($branch_cd1.equalsIgnoreCase(name)) {
			return branch_cd1();
		}
		if ($branch_nm1.equalsIgnoreCase(name)) {
			return branch_nm1();
		}
		if ($bank_ac_no1.equalsIgnoreCase(name)) {
			return bank_ac_no1();
		}
		if ($sttl_cd2.equalsIgnoreCase(name)) {
			return sttl_cd2();
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			return sttl_nm2();
		}
		if ($s_pay_schd_amt2.equalsIgnoreCase(name)) {
			return s_pay_schd_amt2();
		}
		if ($bank_cd2.equalsIgnoreCase(name)) {
			return bank_cd2();
		}
		if ($bank_nm2.equalsIgnoreCase(name)) {
			return bank_nm2();
		}
		if ($branch_cd2.equalsIgnoreCase(name)) {
			return branch_cd2();
		}
		if ($branch_nm2.equalsIgnoreCase(name)) {
			return branch_nm2();
		}
		if ($bank_ac_no2.equalsIgnoreCase(name)) {
			return bank_ac_no2();
		}
		if ($sttl_cd3.equalsIgnoreCase(name)) {
			return sttl_cd3();
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			return sttl_nm3();
		}
		if ($s_pay_schd_amt3.equalsIgnoreCase(name)) {
			return s_pay_schd_amt3();
		}
		if ($bank_cd3.equalsIgnoreCase(name)) {
			return bank_cd3();
		}
		if ($bank_nm3.equalsIgnoreCase(name)) {
			return bank_nm3();
		}
		if ($branch_cd3.equalsIgnoreCase(name)) {
			return branch_cd3();
		}
		if ($branch_nm3.equalsIgnoreCase(name)) {
			return branch_nm3();
		}
		if ($bank_ac_no3.equalsIgnoreCase(name)) {
			return bank_ac_no3();
		}
		if ($sttl_cd4.equalsIgnoreCase(name)) {
			return sttl_cd4();
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			return sttl_nm4();
		}
		if ($s_pay_schd_amt4.equalsIgnoreCase(name)) {
			return s_pay_schd_amt4();
		}
		if ($bank_cd4.equalsIgnoreCase(name)) {
			return bank_cd4();
		}
		if ($bank_nm4.equalsIgnoreCase(name)) {
			return bank_nm4();
		}
		if ($branch_cd4.equalsIgnoreCase(name)) {
			return branch_cd4();
		}
		if ($branch_nm4.equalsIgnoreCase(name)) {
			return branch_nm4();
		}
		if ($bank_ac_no4.equalsIgnoreCase(name)) {
			return bank_ac_no4();
		}
		if ($sttl_cd5.equalsIgnoreCase(name)) {
			return sttl_cd5();
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			return sttl_nm5();
		}
		if ($s_pay_schd_amt5.equalsIgnoreCase(name)) {
			return s_pay_schd_amt5();
		}
		if ($bank_cd5.equalsIgnoreCase(name)) {
			return bank_cd5();
		}
		if ($bank_nm5.equalsIgnoreCase(name)) {
			return bank_nm5();
		}
		if ($branch_cd5.equalsIgnoreCase(name)) {
			return branch_cd5();
		}
		if ($branch_nm5.equalsIgnoreCase(name)) {
			return branch_nm5();
		}
		if ($bank_ac_no5.equalsIgnoreCase(name)) {
			return bank_ac_no5();
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
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			return pay_ntc_cl_day();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt1();
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt2();
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt3();
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt4();
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt5();
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt6();
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt7();
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt8();
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt9();
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			return hdr_page();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_ntc_ym.equalsIgnoreCase(name)) {
			return pay_ntc_ym();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($re_issue.equalsIgnoreCase(name)) {
			return re_issue();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			return pay_ntc_zip_cd();
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			return pay_ntc_addr1();
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			return pay_ntc_addr2();
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			return pay_ntc_addr3();
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			return pay_ntc_addr4();
		}
		if ($pay_ntc_addr.equalsIgnoreCase(name)) {
			return pay_ntc_addr();
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_nm();
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_dpt();
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn();
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			return pay_ntc_bsppl_psn_title();
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			return pay_ntc_tel();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($s_schd_pay_amt.equalsIgnoreCase(name)) {
			return s_schd_pay_amt();
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
		if ($s_last_pay_schd_amt.equalsIgnoreCase(name)) {
			return s_last_pay_schd_amt();
		}
		if ($s_pay_amt.equalsIgnoreCase(name)) {
			return s_pay_amt();
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			return s_sw_amt();
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			return s_bfw_amt();
		}
		if ($s_purc_amt.equalsIgnoreCase(name)) {
			return s_purc_amt();
		}
		if ($s_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dscnt_amt();
		}
		if ($s_ret_amt.equalsIgnoreCase(name)) {
			return s_ret_amt();
		}
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			return s_setoff_amt();
		}
		if ($s_tax_amt.equalsIgnoreCase(name)) {
			return s_tax_amt();
		}
		if ($s_sw_to_amt.equalsIgnoreCase(name)) {
			return s_sw_to_amt();
		}
		if ($s_adv_pay_bal.equalsIgnoreCase(name)) {
			return s_adv_pay_bal();
		}
		if ($s_adv_pay_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_amt();
		}
		if ($s_adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_setoff_amt();
		}
		if ($s_adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return s_adv_pay_setoff_tax_amt();
		}
		if ($s_pay_xrate.equalsIgnoreCase(name)) {
			return s_pay_xrate();
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			return s_tax_rate1();
		}
		if ($s_tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt1();
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
		if ($s_tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt2();
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
		if ($s_tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt3();
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
		if ($s_tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt4();
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
		if ($s_tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt5();
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
		if ($s_tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt6();
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
		if ($s_tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt7();
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
		if ($s_tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt8();
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
		if ($s_tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt9();
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
		if ($s_tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_purc_amt10();
		}
		if ($s_tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_tax_amt10();
		}
		if ($s_tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return s_tax_rate_base_tax_amt10();
		}
		if ($sttl_cd1.equalsIgnoreCase(name)) {
			return sttl_cd1();
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			return sttl_nm1();
		}
		if ($s_pay_schd_amt1.equalsIgnoreCase(name)) {
			return s_pay_schd_amt1();
		}
		if ($bank_cd1.equalsIgnoreCase(name)) {
			return bank_cd1();
		}
		if ($bank_nm1.equalsIgnoreCase(name)) {
			return bank_nm1();
		}
		if ($branch_cd1.equalsIgnoreCase(name)) {
			return branch_cd1();
		}
		if ($branch_nm1.equalsIgnoreCase(name)) {
			return branch_nm1();
		}
		if ($bank_ac_no1.equalsIgnoreCase(name)) {
			return bank_ac_no1();
		}
		if ($sttl_cd2.equalsIgnoreCase(name)) {
			return sttl_cd2();
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			return sttl_nm2();
		}
		if ($s_pay_schd_amt2.equalsIgnoreCase(name)) {
			return s_pay_schd_amt2();
		}
		if ($bank_cd2.equalsIgnoreCase(name)) {
			return bank_cd2();
		}
		if ($bank_nm2.equalsIgnoreCase(name)) {
			return bank_nm2();
		}
		if ($branch_cd2.equalsIgnoreCase(name)) {
			return branch_cd2();
		}
		if ($branch_nm2.equalsIgnoreCase(name)) {
			return branch_nm2();
		}
		if ($bank_ac_no2.equalsIgnoreCase(name)) {
			return bank_ac_no2();
		}
		if ($sttl_cd3.equalsIgnoreCase(name)) {
			return sttl_cd3();
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			return sttl_nm3();
		}
		if ($s_pay_schd_amt3.equalsIgnoreCase(name)) {
			return s_pay_schd_amt3();
		}
		if ($bank_cd3.equalsIgnoreCase(name)) {
			return bank_cd3();
		}
		if ($bank_nm3.equalsIgnoreCase(name)) {
			return bank_nm3();
		}
		if ($branch_cd3.equalsIgnoreCase(name)) {
			return branch_cd3();
		}
		if ($branch_nm3.equalsIgnoreCase(name)) {
			return branch_nm3();
		}
		if ($bank_ac_no3.equalsIgnoreCase(name)) {
			return bank_ac_no3();
		}
		if ($sttl_cd4.equalsIgnoreCase(name)) {
			return sttl_cd4();
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			return sttl_nm4();
		}
		if ($s_pay_schd_amt4.equalsIgnoreCase(name)) {
			return s_pay_schd_amt4();
		}
		if ($bank_cd4.equalsIgnoreCase(name)) {
			return bank_cd4();
		}
		if ($bank_nm4.equalsIgnoreCase(name)) {
			return bank_nm4();
		}
		if ($branch_cd4.equalsIgnoreCase(name)) {
			return branch_cd4();
		}
		if ($branch_nm4.equalsIgnoreCase(name)) {
			return branch_nm4();
		}
		if ($bank_ac_no4.equalsIgnoreCase(name)) {
			return bank_ac_no4();
		}
		if ($sttl_cd5.equalsIgnoreCase(name)) {
			return sttl_cd5();
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			return sttl_nm5();
		}
		if ($s_pay_schd_amt5.equalsIgnoreCase(name)) {
			return s_pay_schd_amt5();
		}
		if ($bank_cd5.equalsIgnoreCase(name)) {
			return bank_cd5();
		}
		if ($bank_nm5.equalsIgnoreCase(name)) {
			return bank_nm5();
		}
		if ($branch_cd5.equalsIgnoreCase(name)) {
			return branch_cd5();
		}
		if ($branch_nm5.equalsIgnoreCase(name)) {
			return branch_nm5();
		}
		if ($bank_ac_no5.equalsIgnoreCase(name)) {
			return bank_ac_no5();
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
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			return pay_ntc_cl_day();
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt1();
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt2();
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt3();
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt4();
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt5();
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt6();
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt7();
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt8();
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt9();
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			return tax_rate_purc_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			return hdr_page();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_ntc_ym.equalsIgnoreCase(name)) {
			return pay_ntc_ym();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			return pay_ntc_dtl_outp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_addr.equalsIgnoreCase(name)) {
			pay_ntc_addr(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
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
		if ($s_schd_pay_amt.equalsIgnoreCase(name)) {
			s_schd_pay_amt(value);
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
		if ($s_last_pay_schd_amt.equalsIgnoreCase(name)) {
			s_last_pay_schd_amt(value);
			return;
		}
		if ($s_pay_amt.equalsIgnoreCase(name)) {
			s_pay_amt(value);
			return;
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			s_sw_amt(value);
			return;
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			s_bfw_amt(value);
			return;
		}
		if ($s_purc_amt.equalsIgnoreCase(name)) {
			s_purc_amt(value);
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
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			s_setoff_amt(value);
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
		if ($s_adv_pay_bal.equalsIgnoreCase(name)) {
			s_adv_pay_bal(value);
			return;
		}
		if ($s_adv_pay_amt.equalsIgnoreCase(name)) {
			s_adv_pay_amt(value);
			return;
		}
		if ($s_adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			s_adv_pay_setoff_amt(value);
			return;
		}
		if ($s_adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($s_pay_xrate.equalsIgnoreCase(name)) {
			s_pay_xrate(value);
			return;
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			s_tax_rate1(value);
			return;
		}
		if ($s_tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt1(value);
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
		if ($s_tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt2(value);
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
		if ($s_tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt3(value);
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
		if ($s_tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt4(value);
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
		if ($s_tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt5(value);
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
		if ($s_tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt6(value);
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
		if ($s_tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt7(value);
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
		if ($s_tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt8(value);
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
		if ($s_tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt9(value);
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
		if ($s_tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt10(value);
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
		if ($sttl_cd1.equalsIgnoreCase(name)) {
			sttl_cd1(value);
			return;
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			sttl_nm1(value);
			return;
		}
		if ($s_pay_schd_amt1.equalsIgnoreCase(name)) {
			s_pay_schd_amt1(value);
			return;
		}
		if ($bank_cd1.equalsIgnoreCase(name)) {
			bank_cd1(value);
			return;
		}
		if ($bank_nm1.equalsIgnoreCase(name)) {
			bank_nm1(value);
			return;
		}
		if ($branch_cd1.equalsIgnoreCase(name)) {
			branch_cd1(value);
			return;
		}
		if ($branch_nm1.equalsIgnoreCase(name)) {
			branch_nm1(value);
			return;
		}
		if ($bank_ac_no1.equalsIgnoreCase(name)) {
			bank_ac_no1(value);
			return;
		}
		if ($sttl_cd2.equalsIgnoreCase(name)) {
			sttl_cd2(value);
			return;
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			sttl_nm2(value);
			return;
		}
		if ($s_pay_schd_amt2.equalsIgnoreCase(name)) {
			s_pay_schd_amt2(value);
			return;
		}
		if ($bank_cd2.equalsIgnoreCase(name)) {
			bank_cd2(value);
			return;
		}
		if ($bank_nm2.equalsIgnoreCase(name)) {
			bank_nm2(value);
			return;
		}
		if ($branch_cd2.equalsIgnoreCase(name)) {
			branch_cd2(value);
			return;
		}
		if ($branch_nm2.equalsIgnoreCase(name)) {
			branch_nm2(value);
			return;
		}
		if ($bank_ac_no2.equalsIgnoreCase(name)) {
			bank_ac_no2(value);
			return;
		}
		if ($sttl_cd3.equalsIgnoreCase(name)) {
			sttl_cd3(value);
			return;
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			sttl_nm3(value);
			return;
		}
		if ($s_pay_schd_amt3.equalsIgnoreCase(name)) {
			s_pay_schd_amt3(value);
			return;
		}
		if ($bank_cd3.equalsIgnoreCase(name)) {
			bank_cd3(value);
			return;
		}
		if ($bank_nm3.equalsIgnoreCase(name)) {
			bank_nm3(value);
			return;
		}
		if ($branch_cd3.equalsIgnoreCase(name)) {
			branch_cd3(value);
			return;
		}
		if ($branch_nm3.equalsIgnoreCase(name)) {
			branch_nm3(value);
			return;
		}
		if ($bank_ac_no3.equalsIgnoreCase(name)) {
			bank_ac_no3(value);
			return;
		}
		if ($sttl_cd4.equalsIgnoreCase(name)) {
			sttl_cd4(value);
			return;
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			sttl_nm4(value);
			return;
		}
		if ($s_pay_schd_amt4.equalsIgnoreCase(name)) {
			s_pay_schd_amt4(value);
			return;
		}
		if ($bank_cd4.equalsIgnoreCase(name)) {
			bank_cd4(value);
			return;
		}
		if ($bank_nm4.equalsIgnoreCase(name)) {
			bank_nm4(value);
			return;
		}
		if ($branch_cd4.equalsIgnoreCase(name)) {
			branch_cd4(value);
			return;
		}
		if ($branch_nm4.equalsIgnoreCase(name)) {
			branch_nm4(value);
			return;
		}
		if ($bank_ac_no4.equalsIgnoreCase(name)) {
			bank_ac_no4(value);
			return;
		}
		if ($sttl_cd5.equalsIgnoreCase(name)) {
			sttl_cd5(value);
			return;
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			sttl_nm5(value);
			return;
		}
		if ($s_pay_schd_amt5.equalsIgnoreCase(name)) {
			s_pay_schd_amt5(value);
			return;
		}
		if ($bank_cd5.equalsIgnoreCase(name)) {
			bank_cd5(value);
			return;
		}
		if ($bank_nm5.equalsIgnoreCase(name)) {
			bank_nm5(value);
			return;
		}
		if ($branch_cd5.equalsIgnoreCase(name)) {
			branch_cd5(value);
			return;
		}
		if ($branch_nm5.equalsIgnoreCase(name)) {
			branch_nm5(value);
			return;
		}
		if ($bank_ac_no5.equalsIgnoreCase(name)) {
			bank_ac_no5(value);
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
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_ntc_ym.equalsIgnoreCase(name)) {
			pay_ntc_ym(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($re_issue.equalsIgnoreCase(name)) {
			re_issue(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
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
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($pay_ntc_zip_cd.equalsIgnoreCase(name)) {
			pay_ntc_zip_cd(value);
			return;
		}
		if ($pay_ntc_addr1.equalsIgnoreCase(name)) {
			pay_ntc_addr1(value);
			return;
		}
		if ($pay_ntc_addr2.equalsIgnoreCase(name)) {
			pay_ntc_addr2(value);
			return;
		}
		if ($pay_ntc_addr3.equalsIgnoreCase(name)) {
			pay_ntc_addr3(value);
			return;
		}
		if ($pay_ntc_addr4.equalsIgnoreCase(name)) {
			pay_ntc_addr4(value);
			return;
		}
		if ($pay_ntc_addr.equalsIgnoreCase(name)) {
			pay_ntc_addr(value);
			return;
		}
		if ($pay_ntc_bsppl_nm.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_nm(value);
			return;
		}
		if ($pay_ntc_bsppl_dpt.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_dpt(value);
			return;
		}
		if ($pay_ntc_bsppl_psn.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn(value);
			return;
		}
		if ($pay_ntc_bsppl_psn_title.equalsIgnoreCase(name)) {
			pay_ntc_bsppl_psn_title(value);
			return;
		}
		if ($pay_ntc_tel.equalsIgnoreCase(name)) {
			pay_ntc_tel(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
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
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
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
		if ($s_schd_pay_amt.equalsIgnoreCase(name)) {
			s_schd_pay_amt(value);
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
		if ($s_last_pay_schd_amt.equalsIgnoreCase(name)) {
			s_last_pay_schd_amt(value);
			return;
		}
		if ($s_pay_amt.equalsIgnoreCase(name)) {
			s_pay_amt(value);
			return;
		}
		if ($s_sw_amt.equalsIgnoreCase(name)) {
			s_sw_amt(value);
			return;
		}
		if ($s_bfw_amt.equalsIgnoreCase(name)) {
			s_bfw_amt(value);
			return;
		}
		if ($s_purc_amt.equalsIgnoreCase(name)) {
			s_purc_amt(value);
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
		if ($s_setoff_amt.equalsIgnoreCase(name)) {
			s_setoff_amt(value);
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
		if ($s_adv_pay_bal.equalsIgnoreCase(name)) {
			s_adv_pay_bal(value);
			return;
		}
		if ($s_adv_pay_amt.equalsIgnoreCase(name)) {
			s_adv_pay_amt(value);
			return;
		}
		if ($s_adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			s_adv_pay_setoff_amt(value);
			return;
		}
		if ($s_adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			s_adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($s_pay_xrate.equalsIgnoreCase(name)) {
			s_pay_xrate(value);
			return;
		}
		if ($s_tax_rate1.equalsIgnoreCase(name)) {
			s_tax_rate1(value);
			return;
		}
		if ($s_tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt1(value);
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
		if ($s_tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt2(value);
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
		if ($s_tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt3(value);
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
		if ($s_tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt4(value);
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
		if ($s_tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt5(value);
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
		if ($s_tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt6(value);
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
		if ($s_tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt7(value);
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
		if ($s_tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt8(value);
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
		if ($s_tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt9(value);
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
		if ($s_tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			s_tax_rate_purc_amt10(value);
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
		if ($sttl_cd1.equalsIgnoreCase(name)) {
			sttl_cd1(value);
			return;
		}
		if ($sttl_nm1.equalsIgnoreCase(name)) {
			sttl_nm1(value);
			return;
		}
		if ($s_pay_schd_amt1.equalsIgnoreCase(name)) {
			s_pay_schd_amt1(value);
			return;
		}
		if ($bank_cd1.equalsIgnoreCase(name)) {
			bank_cd1(value);
			return;
		}
		if ($bank_nm1.equalsIgnoreCase(name)) {
			bank_nm1(value);
			return;
		}
		if ($branch_cd1.equalsIgnoreCase(name)) {
			branch_cd1(value);
			return;
		}
		if ($branch_nm1.equalsIgnoreCase(name)) {
			branch_nm1(value);
			return;
		}
		if ($bank_ac_no1.equalsIgnoreCase(name)) {
			bank_ac_no1(value);
			return;
		}
		if ($sttl_cd2.equalsIgnoreCase(name)) {
			sttl_cd2(value);
			return;
		}
		if ($sttl_nm2.equalsIgnoreCase(name)) {
			sttl_nm2(value);
			return;
		}
		if ($s_pay_schd_amt2.equalsIgnoreCase(name)) {
			s_pay_schd_amt2(value);
			return;
		}
		if ($bank_cd2.equalsIgnoreCase(name)) {
			bank_cd2(value);
			return;
		}
		if ($bank_nm2.equalsIgnoreCase(name)) {
			bank_nm2(value);
			return;
		}
		if ($branch_cd2.equalsIgnoreCase(name)) {
			branch_cd2(value);
			return;
		}
		if ($branch_nm2.equalsIgnoreCase(name)) {
			branch_nm2(value);
			return;
		}
		if ($bank_ac_no2.equalsIgnoreCase(name)) {
			bank_ac_no2(value);
			return;
		}
		if ($sttl_cd3.equalsIgnoreCase(name)) {
			sttl_cd3(value);
			return;
		}
		if ($sttl_nm3.equalsIgnoreCase(name)) {
			sttl_nm3(value);
			return;
		}
		if ($s_pay_schd_amt3.equalsIgnoreCase(name)) {
			s_pay_schd_amt3(value);
			return;
		}
		if ($bank_cd3.equalsIgnoreCase(name)) {
			bank_cd3(value);
			return;
		}
		if ($bank_nm3.equalsIgnoreCase(name)) {
			bank_nm3(value);
			return;
		}
		if ($branch_cd3.equalsIgnoreCase(name)) {
			branch_cd3(value);
			return;
		}
		if ($branch_nm3.equalsIgnoreCase(name)) {
			branch_nm3(value);
			return;
		}
		if ($bank_ac_no3.equalsIgnoreCase(name)) {
			bank_ac_no3(value);
			return;
		}
		if ($sttl_cd4.equalsIgnoreCase(name)) {
			sttl_cd4(value);
			return;
		}
		if ($sttl_nm4.equalsIgnoreCase(name)) {
			sttl_nm4(value);
			return;
		}
		if ($s_pay_schd_amt4.equalsIgnoreCase(name)) {
			s_pay_schd_amt4(value);
			return;
		}
		if ($bank_cd4.equalsIgnoreCase(name)) {
			bank_cd4(value);
			return;
		}
		if ($bank_nm4.equalsIgnoreCase(name)) {
			bank_nm4(value);
			return;
		}
		if ($branch_cd4.equalsIgnoreCase(name)) {
			branch_cd4(value);
			return;
		}
		if ($branch_nm4.equalsIgnoreCase(name)) {
			branch_nm4(value);
			return;
		}
		if ($bank_ac_no4.equalsIgnoreCase(name)) {
			bank_ac_no4(value);
			return;
		}
		if ($sttl_cd5.equalsIgnoreCase(name)) {
			sttl_cd5(value);
			return;
		}
		if ($sttl_nm5.equalsIgnoreCase(name)) {
			sttl_nm5(value);
			return;
		}
		if ($s_pay_schd_amt5.equalsIgnoreCase(name)) {
			s_pay_schd_amt5(value);
			return;
		}
		if ($bank_cd5.equalsIgnoreCase(name)) {
			bank_cd5(value);
			return;
		}
		if ($bank_nm5.equalsIgnoreCase(name)) {
			bank_nm5(value);
			return;
		}
		if ($branch_cd5.equalsIgnoreCase(name)) {
			branch_cd5(value);
			return;
		}
		if ($branch_nm5.equalsIgnoreCase(name)) {
			branch_nm5(value);
			return;
		}
		if ($bank_ac_no5.equalsIgnoreCase(name)) {
			bank_ac_no5(value);
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
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_ntc_cl_day.equalsIgnoreCase(name)) {
			pay_ntc_cl_day(value);
			return;
		}
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
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
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
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
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_purc_amt1.equalsIgnoreCase(name)) {
			tax_rate_purc_amt1(value);
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
		if ($tax_rate_purc_amt2.equalsIgnoreCase(name)) {
			tax_rate_purc_amt2(value);
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
		if ($tax_rate_purc_amt3.equalsIgnoreCase(name)) {
			tax_rate_purc_amt3(value);
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
		if ($tax_rate_purc_amt4.equalsIgnoreCase(name)) {
			tax_rate_purc_amt4(value);
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
		if ($tax_rate_purc_amt5.equalsIgnoreCase(name)) {
			tax_rate_purc_amt5(value);
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
		if ($tax_rate_purc_amt6.equalsIgnoreCase(name)) {
			tax_rate_purc_amt6(value);
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
		if ($tax_rate_purc_amt7.equalsIgnoreCase(name)) {
			tax_rate_purc_amt7(value);
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
		if ($tax_rate_purc_amt8.equalsIgnoreCase(name)) {
			tax_rate_purc_amt8(value);
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
		if ($tax_rate_purc_amt9.equalsIgnoreCase(name)) {
			tax_rate_purc_amt9(value);
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
		if ($tax_rate_purc_amt10.equalsIgnoreCase(name)) {
			tax_rate_purc_amt10(value);
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
		if ($hdr_page.equalsIgnoreCase(name)) {
			hdr_page(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_ntc_ym.equalsIgnoreCase(name)) {
			pay_ntc_ym(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pay_ntc_dtl_outp_flg.equalsIgnoreCase(name)) {
			pay_ntc_dtl_outp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

