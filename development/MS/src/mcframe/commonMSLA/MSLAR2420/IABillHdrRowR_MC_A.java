package mcframe.commonMSLA.MSLAR2420;

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
 * ブロック"IABillHdrRow"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IABillHdrRowR_MC_A extends MCConstRow {

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  請求締年月日.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	/**
	 *  請求日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 *  請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 *  先行請求書ＮＯ.<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
	/**
	 *  先行請求日.<p>
	 *
	 */
	public static final String $pre_bill_dt = "pre_bill_dt";
	/**
	 *  請求期間開始日.<p>
	 *
	 */
	public static final String $bill_st_dt = "bill_st_dt";
	/**
	 *  請求期間終了日.<p>
	 *
	 */
	public static final String $bill_end_dt = "bill_end_dt";
	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  請求者ＣＤ.<p>
	 *
	 */
	public static final String $bill_co_cd = "bill_co_cd";
	/**
	 *  請求者名.<p>
	 *
	 */
	public static final String $bill_co_nm = "bill_co_nm";
	/**
	 *  請求者法人番号.<p>
	 *
	 */
	public static final String $bill_co_ein = "bill_co_ein";
	/**
	 *  請求者事業者ＮＯ.<p>
	 *
	 */
	public static final String $bill_co_biz_co_no = "bill_co_biz_co_no";
	/**
	 *  請求者郵便番号.<p>
	 *
	 */
	public static final String $bill_co_zip_cd = "bill_co_zip_cd";
	/**
	 *  請求者住所１.<p>
	 *
	 */
	public static final String $bill_co_addr1 = "bill_co_addr1";
	/**
	 *  請求者住所２.<p>
	 *
	 */
	public static final String $bill_co_addr2 = "bill_co_addr2";
	/**
	 *  請求者住所３.<p>
	 *
	 */
	public static final String $bill_co_addr3 = "bill_co_addr3";
	/**
	 *  請求者住所４.<p>
	 *
	 */
	public static final String $bill_co_addr4 = "bill_co_addr4";
	/**
	 *  請求者部門.<p>
	 *
	 */
	public static final String $bill_co_dpt = "bill_co_dpt";
	/**
	 *  請求者ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_co_tel = "bill_co_tel";
	/**
	 *  請求者国ＣＤ.<p>
	 *
	 */
	public static final String $bill_co_cntry_cd = "bill_co_cntry_cd";
	/**
	 *  請求受領者ＣＤ.<p>
	 *
	 */
	public static final String $bill_rcpt_co_cd = "bill_rcpt_co_cd";
	/**
	 *  請求受領者名.<p>
	 *
	 */
	public static final String $bill_rcpt_co_nm = "bill_rcpt_co_nm";
	/**
	 *  請求書宛先.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	/**
	 *  請求受領者法人番号.<p>
	 *
	 */
	public static final String $bill_rcpt_co_ein = "bill_rcpt_co_ein";
	/**
	 *  請求受領者事業者ＮＯ.<p>
	 *
	 */
	public static final String $bill_rcpt_co_biz_co_no = "bill_rcpt_co_biz_co_no";
	/**
	 *  請求受領者郵便番号.<p>
	 *
	 */
	public static final String $bill_rcpt_co_zip_cd = "bill_rcpt_co_zip_cd";
	/**
	 *  請求受領者住所１.<p>
	 *
	 */
	public static final String $bill_rcpt_co_addr1 = "bill_rcpt_co_addr1";
	/**
	 *  請求受領者住所２.<p>
	 *
	 */
	public static final String $bill_rcpt_co_addr2 = "bill_rcpt_co_addr2";
	/**
	 *  請求受領者住所３.<p>
	 *
	 */
	public static final String $bill_rcpt_co_addr3 = "bill_rcpt_co_addr3";
	/**
	 *  請求受領者住所４.<p>
	 *
	 */
	public static final String $bill_rcpt_co_addr4 = "bill_rcpt_co_addr4";
	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	/**
	 *  請求受領者国ＣＤ.<p>
	 *
	 */
	public static final String $bill_rcpt_co_cntry_cd = "bill_rcpt_co_cntry_cd";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  請求為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	/**
	 *  前回請求額.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	/**
	 *  支払額.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	/**
	 *  振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 *  相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 *  差引繰越額.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	/**
	 *  今回売上額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 *  今回値引額.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	/**
	 *  今回返品額.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	/**
	 *  今回税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 *  今回振替額.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	/**
	 *  今回請求額.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	/**
	 *  税率１.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt1 = "tax_rate_sls_amt1";
	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt1 = "tax_rate_tax_amt1";
	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt1 = "tax_rate_base_tax_amt1";
	/**
	 *  税率２.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt2 = "tax_rate_sls_amt2";
	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt2 = "tax_rate_tax_amt2";
	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt2 = "tax_rate_base_tax_amt2";
	/**
	 *  税率３.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt3 = "tax_rate_sls_amt3";
	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt3 = "tax_rate_tax_amt3";
	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt3 = "tax_rate_base_tax_amt3";
	/**
	 *  税率４.<p>
	 *
	 */
	public static final String $tax_rate4 = "tax_rate4";
	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt4 = "tax_rate_sls_amt4";
	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt4 = "tax_rate_tax_amt4";
	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt4 = "tax_rate_base_tax_amt4";
	/**
	 *  税率５.<p>
	 *
	 */
	public static final String $tax_rate5 = "tax_rate5";
	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt5 = "tax_rate_sls_amt5";
	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt5 = "tax_rate_tax_amt5";
	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt5 = "tax_rate_base_tax_amt5";
	/**
	 *  税率６.<p>
	 *
	 */
	public static final String $tax_rate6 = "tax_rate6";
	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt6 = "tax_rate_sls_amt6";
	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt6 = "tax_rate_tax_amt6";
	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt6 = "tax_rate_base_tax_amt6";
	/**
	 *  税率７.<p>
	 *
	 */
	public static final String $tax_rate7 = "tax_rate7";
	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt7 = "tax_rate_sls_amt7";
	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt7 = "tax_rate_tax_amt7";
	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt7 = "tax_rate_base_tax_amt7";
	/**
	 *  税率８.<p>
	 *
	 */
	public static final String $tax_rate8 = "tax_rate8";
	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt8 = "tax_rate_sls_amt8";
	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt8 = "tax_rate_tax_amt8";
	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt8 = "tax_rate_base_tax_amt8";
	/**
	 *  税率９.<p>
	 *
	 */
	public static final String $tax_rate9 = "tax_rate9";
	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt9 = "tax_rate_sls_amt9";
	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt9 = "tax_rate_tax_amt9";
	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt9 = "tax_rate_base_tax_amt9";
	/**
	 *  税率１０.<p>
	 *
	 */
	public static final String $tax_rate10 = "tax_rate10";
	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt10 = "tax_rate_sls_amt10";
	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt10 = "tax_rate_tax_amt10";
	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt10 = "tax_rate_base_tax_amt10";
	/**
	 *  前受金残高.<p>
	 *
	 */
	public static final String $adv_amt_bal = "adv_amt_bal";
	/**
	 *  前受金入金額.<p>
	 *
	 */
	public static final String $adv_amt = "adv_amt";
	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public static final String $adv_setoff_amt = "adv_setoff_amt";
	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public static final String $adv_setoff_tax_amt = "adv_setoff_tax_amt";
	/**
	 *  入金予定日１.<p>
	 *
	 */
	public static final String $rcv_schd_dt1 = "rcv_schd_dt1";
	/**
	 *  入金予定額１.<p>
	 *
	 */
	public static final String $rcv_schd_amt1 = "rcv_schd_amt1";
	/**
	 *  入金方法ＣＤ１.<p>
	 *
	 */
	public static final String $rcv_mtd_cd1 = "rcv_mtd_cd1";
	/**
	 *  入金方法名１.<p>
	 *
	 */
	public static final String $rcv_mtd_nm1 = "rcv_mtd_nm1";
	/**
	 *  入金予定日２.<p>
	 *
	 */
	public static final String $rcv_schd_dt2 = "rcv_schd_dt2";
	/**
	 *  入金予定額２.<p>
	 *
	 */
	public static final String $rcv_schd_amt2 = "rcv_schd_amt2";
	/**
	 *  入金方法ＣＤ２.<p>
	 *
	 */
	public static final String $rcv_mtd_cd2 = "rcv_mtd_cd2";
	/**
	 *  入金方法名２.<p>
	 *
	 */
	public static final String $rcv_mtd_nm2 = "rcv_mtd_nm2";
	/**
	 *  入金予定日３.<p>
	 *
	 */
	public static final String $rcv_schd_dt3 = "rcv_schd_dt3";
	/**
	 *  入金予定額３.<p>
	 *
	 */
	public static final String $rcv_schd_amt3 = "rcv_schd_amt3";
	/**
	 *  入金方法ＣＤ３.<p>
	 *
	 */
	public static final String $rcv_mtd_cd3 = "rcv_mtd_cd3";
	/**
	 *  入金方法名３.<p>
	 *
	 */
	public static final String $rcv_mtd_nm3 = "rcv_mtd_nm3";
	/**
	 *  入金予定日４.<p>
	 *
	 */
	public static final String $rcv_schd_dt4 = "rcv_schd_dt4";
	/**
	 *  入金予定額４.<p>
	 *
	 */
	public static final String $rcv_schd_amt4 = "rcv_schd_amt4";
	/**
	 *  入金方法ＣＤ４.<p>
	 *
	 */
	public static final String $rcv_mtd_cd4 = "rcv_mtd_cd4";
	/**
	 *  入金方法名４.<p>
	 *
	 */
	public static final String $rcv_mtd_nm4 = "rcv_mtd_nm4";
	/**
	 *  入金予定日５.<p>
	 *
	 */
	public static final String $rcv_schd_dt5 = "rcv_schd_dt5";
	/**
	 *  入金予定額５.<p>
	 *
	 */
	public static final String $rcv_schd_amt5 = "rcv_schd_amt5";
	/**
	 *  入金方法ＣＤ５.<p>
	 *
	 */
	public static final String $rcv_mtd_cd5 = "rcv_mtd_cd5";
	/**
	 *  入金方法名５.<p>
	 *
	 */
	public static final String $rcv_mtd_nm5 = "rcv_mtd_nm5";
	/**
	 *  入金予定日６.<p>
	 *
	 */
	public static final String $rcv_schd_dt6 = "rcv_schd_dt6";
	/**
	 *  入金予定額６.<p>
	 *
	 */
	public static final String $rcv_schd_amt6 = "rcv_schd_amt6";
	/**
	 *  入金方法ＣＤ６.<p>
	 *
	 */
	public static final String $rcv_mtd_cd6 = "rcv_mtd_cd6";
	/**
	 *  入金方法名６.<p>
	 *
	 */
	public static final String $rcv_mtd_nm6 = "rcv_mtd_nm6";
	/**
	 *  入金予定日７.<p>
	 *
	 */
	public static final String $rcv_schd_dt7 = "rcv_schd_dt7";
	/**
	 *  入金予定額７.<p>
	 *
	 */
	public static final String $rcv_schd_amt7 = "rcv_schd_amt7";
	/**
	 *  入金方法ＣＤ７.<p>
	 *
	 */
	public static final String $rcv_mtd_cd7 = "rcv_mtd_cd7";
	/**
	 *  入金方法名７.<p>
	 *
	 */
	public static final String $rcv_mtd_nm7 = "rcv_mtd_nm7";
	/**
	 *  入金予定日８.<p>
	 *
	 */
	public static final String $rcv_schd_dt8 = "rcv_schd_dt8";
	/**
	 *  入金予定額８.<p>
	 *
	 */
	public static final String $rcv_schd_amt8 = "rcv_schd_amt8";
	/**
	 *  入金方法ＣＤ８.<p>
	 *
	 */
	public static final String $rcv_mtd_cd8 = "rcv_mtd_cd8";
	/**
	 *  入金方法名８.<p>
	 *
	 */
	public static final String $rcv_mtd_nm8 = "rcv_mtd_nm8";
	/**
	 *  入金予定日９.<p>
	 *
	 */
	public static final String $rcv_schd_dt9 = "rcv_schd_dt9";
	/**
	 *  入金予定額９.<p>
	 *
	 */
	public static final String $rcv_schd_amt9 = "rcv_schd_amt9";
	/**
	 *  入金方法ＣＤ９.<p>
	 *
	 */
	public static final String $rcv_mtd_cd9 = "rcv_mtd_cd9";
	/**
	 *  入金方法名９.<p>
	 *
	 */
	public static final String $rcv_mtd_nm9 = "rcv_mtd_nm9";
	/**
	 *  入金予定日１０.<p>
	 *
	 */
	public static final String $rcv_schd_dt10 = "rcv_schd_dt10";
	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public static final String $rcv_schd_amt10 = "rcv_schd_amt10";
	/**
	 *  入金方法ＣＤ１０.<p>
	 *
	 */
	public static final String $rcv_mtd_cd10 = "rcv_mtd_cd10";
	/**
	 *  入金方法名１０.<p>
	 *
	 */
	public static final String $rcv_mtd_nm10 = "rcv_mtd_nm10";
	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 *  口座区分.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
	/**
	 *  口座番号.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	/**
	 *  口座名義.<p>
	 *
	 */
	public static final String $bank_ac_holder = "bank_ac_holder";
	/**
	 *  口座名義別名.<p>
	 *
	 */
	public static final String $bank_ac_holder_sub = "bank_ac_holder_sub";
	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 *  銀行名.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	/**
	 *  支店名.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	/**
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 *  入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 *  請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 *  計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";
	/**
	 *  単価単位ＣＤ.<p>
	 *
	 */
	public static final String $upri_unit_cd = "upri_unit_cd";
	/**
	 *  支払済金額.<p>
	 *
	 */
	public static final String $bill_paid_amt = "bill_paid_amt";
	/**
	 *  差引請求金額.<p>
	 *
	 */
	public static final String $bill_due_amt = "bill_due_amt";
	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public static final String $ttl_bill_amt = "ttl_bill_amt";
	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public static final String $sum_bill_amt_inc_tax = "sum_bill_amt_inc_tax";
	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public static final String $sum_bill_amt = "sum_bill_amt";
	/**
	 *  課税分類（０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_ctg_per0 = "tax_rate_ctg_per0";
	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt_per0 = "tax_rate_sls_amt_per0";
	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt_per0 = "tax_rate_tax_amt_per0";
	/**
	 *  課税分類（８パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_ctg_per8 = "tax_rate_ctg_per8";
	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt_per8 = "tax_rate_sls_amt_per8";
	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt_per8 = "tax_rate_tax_amt_per8";
	/**
	 *  課税分類（１０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_ctg_per10 = "tax_rate_ctg_per10";
	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt_per10 = "tax_rate_sls_amt_per10";
	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt_per10 = "tax_rate_tax_amt_per10";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_co_cd_META = createCommonMeta($bill_co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta bill_co_nm_META = createCommonMeta($bill_co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta bill_co_ein_META = createCommonMeta($bill_co_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_co_biz_co_no_META = createCommonMeta($bill_co_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_co_zip_cd_META = createCommonMeta($bill_co_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_co_addr1_META = createCommonMeta($bill_co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_co_addr2_META = createCommonMeta($bill_co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_co_addr3_META = createCommonMeta($bill_co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_co_addr4_META = createCommonMeta($bill_co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_co_dpt_META = createCommonMeta($bill_co_dpt, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_co_tel_META = createCommonMeta($bill_co_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_co_cntry_cd_META = createCommonMeta($bill_co_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta bill_rcpt_co_cd_META = createCommonMeta($bill_rcpt_co_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_rcpt_co_nm_META = createCommonMeta($bill_rcpt_co_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_rcpt_co_ein_META = createCommonMeta($bill_rcpt_co_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_rcpt_co_biz_co_no_META = createCommonMeta($bill_rcpt_co_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_rcpt_co_zip_cd_META = createCommonMeta($bill_rcpt_co_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_rcpt_co_addr1_META = createCommonMeta($bill_rcpt_co_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_rcpt_co_addr2_META = createCommonMeta($bill_rcpt_co_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_rcpt_co_addr3_META = createCommonMeta($bill_rcpt_co_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_rcpt_co_addr4_META = createCommonMeta($bill_rcpt_co_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_rcpt_co_cntry_cd_META = createCommonMeta($bill_rcpt_co_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
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
	public static final MCMeta rcv_schd_dt1_META = createCommonMeta($rcv_schd_dt1, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt1_META = createCommonMeta($rcv_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd1_META = createCommonMeta($rcv_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm1_META = createCommonMeta($rcv_mtd_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt2_META = createCommonMeta($rcv_schd_dt2, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt2_META = createCommonMeta($rcv_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd2_META = createCommonMeta($rcv_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm2_META = createCommonMeta($rcv_mtd_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt3_META = createCommonMeta($rcv_schd_dt3, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt3_META = createCommonMeta($rcv_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd3_META = createCommonMeta($rcv_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm3_META = createCommonMeta($rcv_mtd_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt4_META = createCommonMeta($rcv_schd_dt4, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt4_META = createCommonMeta($rcv_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd4_META = createCommonMeta($rcv_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm4_META = createCommonMeta($rcv_mtd_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt5_META = createCommonMeta($rcv_schd_dt5, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt5_META = createCommonMeta($rcv_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd5_META = createCommonMeta($rcv_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm5_META = createCommonMeta($rcv_mtd_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt6_META = createCommonMeta($rcv_schd_dt6, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt6_META = createCommonMeta($rcv_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd6_META = createCommonMeta($rcv_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm6_META = createCommonMeta($rcv_mtd_nm6, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt7_META = createCommonMeta($rcv_schd_dt7, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt7_META = createCommonMeta($rcv_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd7_META = createCommonMeta($rcv_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm7_META = createCommonMeta($rcv_mtd_nm7, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt8_META = createCommonMeta($rcv_schd_dt8, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt8_META = createCommonMeta($rcv_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd8_META = createCommonMeta($rcv_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm8_META = createCommonMeta($rcv_mtd_nm8, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt9_META = createCommonMeta($rcv_schd_dt9, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt9_META = createCommonMeta($rcv_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd9_META = createCommonMeta($rcv_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm9_META = createCommonMeta($rcv_mtd_nm9, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_schd_dt10_META = createCommonMeta($rcv_schd_dt10, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_schd_amt10_META = createCommonMeta($rcv_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_mtd_cd10_META = createCommonMeta($rcv_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm10_META = createCommonMeta($rcv_mtd_nm10, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_ac_holder_sub_META = createCommonMeta($bank_ac_holder_sub, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER_SUB);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
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
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
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
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.CHAR_YMD);
	public static final MCMeta upri_unit_cd_META = createCommonMeta($upri_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta bill_paid_amt_META = createCommonMeta($bill_paid_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_due_amt_META = createCommonMeta($bill_due_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_bill_amt_META = createCommonMeta($ttl_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sum_bill_amt_inc_tax_META = createCommonMeta($sum_bill_amt_inc_tax, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sum_bill_amt_META = createCommonMeta($sum_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_ctg_per0_META = createCommonMeta($tax_rate_ctg_per0, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_sls_amt_per0_META = createCommonMeta($tax_rate_sls_amt_per0, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt_per0_META = createCommonMeta($tax_rate_tax_amt_per0, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_ctg_per8_META = createCommonMeta($tax_rate_ctg_per8, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_sls_amt_per8_META = createCommonMeta($tax_rate_sls_amt_per8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt_per8_META = createCommonMeta($tax_rate_tax_amt_per8, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_ctg_per10_META = createCommonMeta($tax_rate_ctg_per10, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_sls_amt_per10_META = createCommonMeta($tax_rate_sls_amt_per10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt_per10_META = createCommonMeta($tax_rate_tax_amt_per10, mcframe.commonMA.meta.MA_META.TAX_RATE);

	protected static final ConstMetaList<IABillHdrRowR> constMetas = new ConstMetaList<IABillHdrRowR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
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
			bill_co_cd_META,
			bill_co_nm_META,
			bill_co_ein_META,
			bill_co_biz_co_no_META,
			bill_co_zip_cd_META,
			bill_co_addr1_META,
			bill_co_addr2_META,
			bill_co_addr3_META,
			bill_co_addr4_META,
			bill_co_dpt_META,
			bill_co_tel_META,
			bill_co_cntry_cd_META,
			bill_rcpt_co_cd_META,
			bill_rcpt_co_nm_META,
			bill_bcst_nm_META,
			bill_rcpt_co_ein_META,
			bill_rcpt_co_biz_co_no_META,
			bill_rcpt_co_zip_cd_META,
			bill_rcpt_co_addr1_META,
			bill_rcpt_co_addr2_META,
			bill_rcpt_co_addr3_META,
			bill_rcpt_co_addr4_META,
			bill_bcst_dpt_META,
			bill_tel_META,
			bill_rcpt_co_cntry_cd_META,
			trd_cur_cd_META,
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
			rcv_mtd_nm1_META,
			rcv_schd_dt2_META,
			rcv_schd_amt2_META,
			rcv_mtd_cd2_META,
			rcv_mtd_nm2_META,
			rcv_schd_dt3_META,
			rcv_schd_amt3_META,
			rcv_mtd_cd3_META,
			rcv_mtd_nm3_META,
			rcv_schd_dt4_META,
			rcv_schd_amt4_META,
			rcv_mtd_cd4_META,
			rcv_mtd_nm4_META,
			rcv_schd_dt5_META,
			rcv_schd_amt5_META,
			rcv_mtd_cd5_META,
			rcv_mtd_nm5_META,
			rcv_schd_dt6_META,
			rcv_schd_amt6_META,
			rcv_mtd_cd6_META,
			rcv_mtd_nm6_META,
			rcv_schd_dt7_META,
			rcv_schd_amt7_META,
			rcv_mtd_cd7_META,
			rcv_mtd_nm7_META,
			rcv_schd_dt8_META,
			rcv_schd_amt8_META,
			rcv_mtd_cd8_META,
			rcv_mtd_nm8_META,
			rcv_schd_dt9_META,
			rcv_schd_amt9_META,
			rcv_mtd_cd9_META,
			rcv_mtd_nm9_META,
			rcv_schd_dt10_META,
			rcv_schd_amt10_META,
			rcv_mtd_cd10_META,
			rcv_mtd_nm10_META,
			bank_ac_cd_META,
			bank_ac_typ_META,
			bank_ac_no_META,
			bank_ac_holder_META,
			bank_ac_holder_sub_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			trd_cd_META,
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
			trd_unit_nm_META,
			trd_unit_qty_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			trd_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META,
			upri_unit_cd_META,
			bill_paid_amt_META,
			bill_due_amt_META,
			ttl_bill_amt_META,
			sum_bill_amt_inc_tax_META,
			sum_bill_amt_META,
			tax_rate_ctg_per0_META,
			tax_rate_sls_amt_per0_META,
			tax_rate_tax_amt_per0_META,
			tax_rate_ctg_per8_META,
			tax_rate_sls_amt_per8_META,
			tax_rate_tax_amt_per8_META,
			tax_rate_ctg_per10_META,
			tax_rate_sls_amt_per10_META,
			tax_rate_tax_amt_per10_META
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
	protected IABillHdrRowR_MC_A(ConstMetaList<? extends IABillHdrRowR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IABillHdrRowR clone() {
		return (IABillHdrRowR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IABillHdrRowR createInstance() {
		return (IABillHdrRowR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IABillHdrRowR getValues(String... names) {
		return (IABillHdrRowR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public String data_make_dt() {
		return getConstString(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(String value) {
		setConstString(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  請求締年月日.<p>
	 *
	 */
	public String bill_cl_dt() {
		return getConstString(offset + 5, $bill_cl_dt);
	}

	/**
	 *  請求締年月日.<p>
	 *
	 */
	public void bill_cl_dt(String value) {
		setConstString(offset + 5, $bill_cl_dt, value);
	}


	/**
	 *  請求日.<p>
	 *
	 */
	public String bill_dt() {
		return getConstString(offset + 6, $bill_dt);
	}

	/**
	 *  請求日.<p>
	 *
	 */
	public void bill_dt(String value) {
		setConstString(offset + 6, $bill_dt, value);
	}


	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 7, $bill_no);
	}

	/**
	 *  請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 7, $bill_no, value);
	}


	/**
	 *  請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 8, $bill_d_no);
	}

	/**
	 *  請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 8, $bill_d_no, value);
	}


	/**
	 *  先行請求書ＮＯ.<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 9, $pre_bill_no);
	}

	/**
	 *  先行請求書ＮＯ.<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 9, $pre_bill_no, value);
	}


	/**
	 *  先行請求日.<p>
	 *
	 */
	public String pre_bill_dt() {
		return getConstString(offset + 10, $pre_bill_dt);
	}

	/**
	 *  先行請求日.<p>
	 *
	 */
	public void pre_bill_dt(String value) {
		setConstString(offset + 10, $pre_bill_dt, value);
	}


	/**
	 *  請求期間開始日.<p>
	 *
	 */
	public String bill_st_dt() {
		return getConstString(offset + 11, $bill_st_dt);
	}

	/**
	 *  請求期間開始日.<p>
	 *
	 */
	public void bill_st_dt(String value) {
		setConstString(offset + 11, $bill_st_dt, value);
	}


	/**
	 *  請求期間終了日.<p>
	 *
	 */
	public String bill_end_dt() {
		return getConstString(offset + 12, $bill_end_dt);
	}

	/**
	 *  請求期間終了日.<p>
	 *
	 */
	public void bill_end_dt(String value) {
		setConstString(offset + 12, $bill_end_dt, value);
	}


	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 13, $iv_no);
	}

	/**
	 *  インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 13, $iv_no, value);
	}


	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 14, $wrk_no);
	}

	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 14, $wrk_no, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 15, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 15, $wrk_nm, value);
	}


	/**
	 *  請求者ＣＤ.<p>
	 *
	 */
	public String bill_co_cd() {
		return getConstString(offset + 16, $bill_co_cd);
	}

	/**
	 *  請求者ＣＤ.<p>
	 *
	 */
	public void bill_co_cd(String value) {
		setConstString(offset + 16, $bill_co_cd, value);
	}


	/**
	 *  請求者名.<p>
	 *
	 */
	public String bill_co_nm() {
		return getConstString(offset + 17, $bill_co_nm);
	}

	/**
	 *  請求者名.<p>
	 *
	 */
	public void bill_co_nm(String value) {
		setConstString(offset + 17, $bill_co_nm, value);
	}


	/**
	 *  請求者法人番号.<p>
	 *
	 */
	public String bill_co_ein() {
		return getConstString(offset + 18, $bill_co_ein);
	}

	/**
	 *  請求者法人番号.<p>
	 *
	 */
	public void bill_co_ein(String value) {
		setConstString(offset + 18, $bill_co_ein, value);
	}


	/**
	 *  請求者事業者ＮＯ.<p>
	 *
	 */
	public String bill_co_biz_co_no() {
		return getConstString(offset + 19, $bill_co_biz_co_no);
	}

	/**
	 *  請求者事業者ＮＯ.<p>
	 *
	 */
	public void bill_co_biz_co_no(String value) {
		setConstString(offset + 19, $bill_co_biz_co_no, value);
	}


	/**
	 *  請求者郵便番号.<p>
	 *
	 */
	public String bill_co_zip_cd() {
		return getConstString(offset + 20, $bill_co_zip_cd);
	}

	/**
	 *  請求者郵便番号.<p>
	 *
	 */
	public void bill_co_zip_cd(String value) {
		setConstString(offset + 20, $bill_co_zip_cd, value);
	}


	/**
	 *  請求者住所１.<p>
	 *
	 */
	public String bill_co_addr1() {
		return getConstString(offset + 21, $bill_co_addr1);
	}

	/**
	 *  請求者住所１.<p>
	 *
	 */
	public void bill_co_addr1(String value) {
		setConstString(offset + 21, $bill_co_addr1, value);
	}


	/**
	 *  請求者住所２.<p>
	 *
	 */
	public String bill_co_addr2() {
		return getConstString(offset + 22, $bill_co_addr2);
	}

	/**
	 *  請求者住所２.<p>
	 *
	 */
	public void bill_co_addr2(String value) {
		setConstString(offset + 22, $bill_co_addr2, value);
	}


	/**
	 *  請求者住所３.<p>
	 *
	 */
	public String bill_co_addr3() {
		return getConstString(offset + 23, $bill_co_addr3);
	}

	/**
	 *  請求者住所３.<p>
	 *
	 */
	public void bill_co_addr3(String value) {
		setConstString(offset + 23, $bill_co_addr3, value);
	}


	/**
	 *  請求者住所４.<p>
	 *
	 */
	public String bill_co_addr4() {
		return getConstString(offset + 24, $bill_co_addr4);
	}

	/**
	 *  請求者住所４.<p>
	 *
	 */
	public void bill_co_addr4(String value) {
		setConstString(offset + 24, $bill_co_addr4, value);
	}


	/**
	 *  請求者部門.<p>
	 *
	 */
	public String bill_co_dpt() {
		return getConstString(offset + 25, $bill_co_dpt);
	}

	/**
	 *  請求者部門.<p>
	 *
	 */
	public void bill_co_dpt(String value) {
		setConstString(offset + 25, $bill_co_dpt, value);
	}


	/**
	 *  請求者ＴＥＬ.<p>
	 *
	 */
	public String bill_co_tel() {
		return getConstString(offset + 26, $bill_co_tel);
	}

	/**
	 *  請求者ＴＥＬ.<p>
	 *
	 */
	public void bill_co_tel(String value) {
		setConstString(offset + 26, $bill_co_tel, value);
	}


	/**
	 *  請求者国ＣＤ.<p>
	 *
	 */
	public String bill_co_cntry_cd() {
		return getConstString(offset + 27, $bill_co_cntry_cd);
	}

	/**
	 *  請求者国ＣＤ.<p>
	 *
	 */
	public void bill_co_cntry_cd(String value) {
		setConstString(offset + 27, $bill_co_cntry_cd, value);
	}


	/**
	 *  請求受領者ＣＤ.<p>
	 *
	 */
	public String bill_rcpt_co_cd() {
		return getConstString(offset + 28, $bill_rcpt_co_cd);
	}

	/**
	 *  請求受領者ＣＤ.<p>
	 *
	 */
	public void bill_rcpt_co_cd(String value) {
		setConstString(offset + 28, $bill_rcpt_co_cd, value);
	}


	/**
	 *  請求受領者名.<p>
	 *
	 */
	public String bill_rcpt_co_nm() {
		return getConstString(offset + 29, $bill_rcpt_co_nm);
	}

	/**
	 *  請求受領者名.<p>
	 *
	 */
	public void bill_rcpt_co_nm(String value) {
		setConstString(offset + 29, $bill_rcpt_co_nm, value);
	}


	/**
	 *  請求書宛先.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 30, $bill_bcst_nm);
	}

	/**
	 *  請求書宛先.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 30, $bill_bcst_nm, value);
	}


	/**
	 *  請求受領者法人番号.<p>
	 *
	 */
	public String bill_rcpt_co_ein() {
		return getConstString(offset + 31, $bill_rcpt_co_ein);
	}

	/**
	 *  請求受領者法人番号.<p>
	 *
	 */
	public void bill_rcpt_co_ein(String value) {
		setConstString(offset + 31, $bill_rcpt_co_ein, value);
	}


	/**
	 *  請求受領者事業者ＮＯ.<p>
	 *
	 */
	public String bill_rcpt_co_biz_co_no() {
		return getConstString(offset + 32, $bill_rcpt_co_biz_co_no);
	}

	/**
	 *  請求受領者事業者ＮＯ.<p>
	 *
	 */
	public void bill_rcpt_co_biz_co_no(String value) {
		setConstString(offset + 32, $bill_rcpt_co_biz_co_no, value);
	}


	/**
	 *  請求受領者郵便番号.<p>
	 *
	 */
	public String bill_rcpt_co_zip_cd() {
		return getConstString(offset + 33, $bill_rcpt_co_zip_cd);
	}

	/**
	 *  請求受領者郵便番号.<p>
	 *
	 */
	public void bill_rcpt_co_zip_cd(String value) {
		setConstString(offset + 33, $bill_rcpt_co_zip_cd, value);
	}


	/**
	 *  請求受領者住所１.<p>
	 *
	 */
	public String bill_rcpt_co_addr1() {
		return getConstString(offset + 34, $bill_rcpt_co_addr1);
	}

	/**
	 *  請求受領者住所１.<p>
	 *
	 */
	public void bill_rcpt_co_addr1(String value) {
		setConstString(offset + 34, $bill_rcpt_co_addr1, value);
	}


	/**
	 *  請求受領者住所２.<p>
	 *
	 */
	public String bill_rcpt_co_addr2() {
		return getConstString(offset + 35, $bill_rcpt_co_addr2);
	}

	/**
	 *  請求受領者住所２.<p>
	 *
	 */
	public void bill_rcpt_co_addr2(String value) {
		setConstString(offset + 35, $bill_rcpt_co_addr2, value);
	}


	/**
	 *  請求受領者住所３.<p>
	 *
	 */
	public String bill_rcpt_co_addr3() {
		return getConstString(offset + 36, $bill_rcpt_co_addr3);
	}

	/**
	 *  請求受領者住所３.<p>
	 *
	 */
	public void bill_rcpt_co_addr3(String value) {
		setConstString(offset + 36, $bill_rcpt_co_addr3, value);
	}


	/**
	 *  請求受領者住所４.<p>
	 *
	 */
	public String bill_rcpt_co_addr4() {
		return getConstString(offset + 37, $bill_rcpt_co_addr4);
	}

	/**
	 *  請求受領者住所４.<p>
	 *
	 */
	public void bill_rcpt_co_addr4(String value) {
		setConstString(offset + 37, $bill_rcpt_co_addr4, value);
	}


	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 38, $bill_bcst_dpt);
	}

	/**
	 *  請求書送付部署.<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 38, $bill_bcst_dpt, value);
	}


	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 39, $bill_tel);
	}

	/**
	 *  請求書送付ＴＥＬ.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 39, $bill_tel, value);
	}


	/**
	 *  請求受領者国ＣＤ.<p>
	 *
	 */
	public String bill_rcpt_co_cntry_cd() {
		return getConstString(offset + 40, $bill_rcpt_co_cntry_cd);
	}

	/**
	 *  請求受領者国ＣＤ.<p>
	 *
	 */
	public void bill_rcpt_co_cntry_cd(String value) {
		setConstString(offset + 40, $bill_rcpt_co_cntry_cd, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 41, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 41, $trd_cur_cd, value);
	}


	/**
	 *  請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 42, $bill_xrate);
	}

	/**
	 *  請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 42, $bill_xrate, value);
	}

	/**
	 *  請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 42, $bill_xrate, value);
	}

	/**
	 *  請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 42, $bill_xrate, value);
	}

	/**
	 *  請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 42, $bill_xrate, value);
	}

	/**
	 *  請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 42, $bill_xrate, value);
	}


	/**
	 *  前回請求額.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 43, $last_bill_amt);
	}

	/**
	 *  前回請求額.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 43, $last_bill_amt, value);
	}

	/**
	 *  前回請求額.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 43, $last_bill_amt, value);
	}

	/**
	 *  前回請求額.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 43, $last_bill_amt, value);
	}

	/**
	 *  前回請求額.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 43, $last_bill_amt, value);
	}

	/**
	 *  前回請求額.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 43, $last_bill_amt, value);
	}


	/**
	 *  支払額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 44, $rcv_amt);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 44, $rcv_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 44, $rcv_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 44, $rcv_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 44, $rcv_amt, value);
	}

	/**
	 *  支払額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 44, $rcv_amt, value);
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
	 *  相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 46, $setoff_amt);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 46, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 46, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 46, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 46, $setoff_amt, value);
	}

	/**
	 *  相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 46, $setoff_amt, value);
	}


	/**
	 *  差引繰越額.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 47, $bfw_amt);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 47, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 47, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 47, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 47, $bfw_amt, value);
	}

	/**
	 *  差引繰越額.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 47, $bfw_amt, value);
	}


	/**
	 *  今回売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 48, $sls_amt);
	}

	/**
	 *  今回売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 48, $sls_amt, value);
	}

	/**
	 *  今回売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 48, $sls_amt, value);
	}

	/**
	 *  今回売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 48, $sls_amt, value);
	}

	/**
	 *  今回売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 48, $sls_amt, value);
	}

	/**
	 *  今回売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 48, $sls_amt, value);
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
	 *  今回返品額.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 50, $ret_amt);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 50, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 50, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 50, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 50, $ret_amt, value);
	}

	/**
	 *  今回返品額.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 50, $ret_amt, value);
	}


	/**
	 *  今回税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 51, $tax_amt);
	}

	/**
	 *  今回税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 51, $tax_amt, value);
	}

	/**
	 *  今回税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 51, $tax_amt, value);
	}

	/**
	 *  今回税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 51, $tax_amt, value);
	}

	/**
	 *  今回税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 51, $tax_amt, value);
	}

	/**
	 *  今回税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 51, $tax_amt, value);
	}


	/**
	 *  今回振替額.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 52, $sw_to_amt);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 52, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 52, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 52, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 52, $sw_to_amt, value);
	}

	/**
	 *  今回振替額.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 52, $sw_to_amt, value);
	}


	/**
	 *  今回請求額.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 53, $bill_amt);
	}

	/**
	 *  今回請求額.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 53, $bill_amt, value);
	}

	/**
	 *  今回請求額.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 53, $bill_amt, value);
	}

	/**
	 *  今回請求額.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 53, $bill_amt, value);
	}

	/**
	 *  今回請求額.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 53, $bill_amt, value);
	}

	/**
	 *  今回請求額.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 53, $bill_amt, value);
	}


	/**
	 *  税率１.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 54, $tax_rate1);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 54, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 54, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 54, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 54, $tax_rate1, value);
	}

	/**
	 *  税率１.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 54, $tax_rate1, value);
	}


	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 55, $tax_rate_sls_amt1);
	}

	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt1, value);
	}

	/**
	 *  税率毎売上額１.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 55, $tax_rate_sls_amt1, value);
	}


	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 56, $tax_rate_tax_amt1);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt1, value);
	}

	/**
	 *  税率毎税額１.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 56, $tax_rate_tax_amt1, value);
	}


	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 57, $tax_rate_base_tax_amt1);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt1, value);
	}

	/**
	 *  税率毎基準通貨税額１.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 57, $tax_rate_base_tax_amt1, value);
	}


	/**
	 *  税率２.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 58, $tax_rate2);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 58, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 58, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 58, $tax_rate2, value);
	}

	/**
	 *  税率２.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 58, $tax_rate2, value);
	}


	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 59, $tax_rate_sls_amt2);
	}

	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt2, value);
	}

	/**
	 *  税率毎売上額２.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 59, $tax_rate_sls_amt2, value);
	}


	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 60, $tax_rate_tax_amt2);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt2, value);
	}

	/**
	 *  税率毎税額２.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 60, $tax_rate_tax_amt2, value);
	}


	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 61, $tax_rate_base_tax_amt2);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt2, value);
	}

	/**
	 *  税率毎基準通貨税額２.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 61, $tax_rate_base_tax_amt2, value);
	}


	/**
	 *  税率３.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 62, $tax_rate3);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 62, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 62, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 62, $tax_rate3, value);
	}

	/**
	 *  税率３.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 62, $tax_rate3, value);
	}


	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 63, $tax_rate_sls_amt3);
	}

	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt3, value);
	}

	/**
	 *  税率毎売上額３.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 63, $tax_rate_sls_amt3, value);
	}


	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 64, $tax_rate_tax_amt3);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt3, value);
	}

	/**
	 *  税率毎税額３.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 64, $tax_rate_tax_amt3, value);
	}


	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 65, $tax_rate_base_tax_amt3);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt3, value);
	}

	/**
	 *  税率毎基準通貨税額３.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 65, $tax_rate_base_tax_amt3, value);
	}


	/**
	 *  税率４.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 66, $tax_rate4);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 66, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 66, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 66, $tax_rate4, value);
	}

	/**
	 *  税率４.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 66, $tax_rate4, value);
	}


	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 67, $tax_rate_sls_amt4);
	}

	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt4, value);
	}

	/**
	 *  税率毎売上額４.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 67, $tax_rate_sls_amt4, value);
	}


	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 68, $tax_rate_tax_amt4);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt4, value);
	}

	/**
	 *  税率毎税額４.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 68, $tax_rate_tax_amt4, value);
	}


	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 69, $tax_rate_base_tax_amt4);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt4, value);
	}

	/**
	 *  税率毎基準通貨税額４.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 69, $tax_rate_base_tax_amt4, value);
	}


	/**
	 *  税率５.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 70, $tax_rate5);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 70, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 70, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 70, $tax_rate5, value);
	}

	/**
	 *  税率５.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 70, $tax_rate5, value);
	}


	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 71, $tax_rate_sls_amt5);
	}

	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt5, value);
	}

	/**
	 *  税率毎売上額５.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 71, $tax_rate_sls_amt5, value);
	}


	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 72, $tax_rate_tax_amt5);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt5, value);
	}

	/**
	 *  税率毎税額５.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 72, $tax_rate_tax_amt5, value);
	}


	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 73, $tax_rate_base_tax_amt5);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt5, value);
	}

	/**
	 *  税率毎基準通貨税額５.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 73, $tax_rate_base_tax_amt5, value);
	}


	/**
	 *  税率６.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 74, $tax_rate6);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 74, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 74, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 74, $tax_rate6, value);
	}

	/**
	 *  税率６.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 74, $tax_rate6, value);
	}


	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 75, $tax_rate_sls_amt6);
	}

	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt6, value);
	}

	/**
	 *  税率毎売上額６.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 75, $tax_rate_sls_amt6, value);
	}


	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 76, $tax_rate_tax_amt6);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt6, value);
	}

	/**
	 *  税率毎税額６.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 76, $tax_rate_tax_amt6, value);
	}


	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 77, $tax_rate_base_tax_amt6);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt6, value);
	}

	/**
	 *  税率毎基準通貨税額６.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 77, $tax_rate_base_tax_amt6, value);
	}


	/**
	 *  税率７.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 78, $tax_rate7);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 78, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 78, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 78, $tax_rate7, value);
	}

	/**
	 *  税率７.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 78, $tax_rate7, value);
	}


	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 79, $tax_rate_sls_amt7);
	}

	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt7, value);
	}

	/**
	 *  税率毎売上額７.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 79, $tax_rate_sls_amt7, value);
	}


	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 80, $tax_rate_tax_amt7);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt7, value);
	}

	/**
	 *  税率毎税額７.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 80, $tax_rate_tax_amt7, value);
	}


	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 81, $tax_rate_base_tax_amt7);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt7, value);
	}

	/**
	 *  税率毎基準通貨税額７.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 81, $tax_rate_base_tax_amt7, value);
	}


	/**
	 *  税率８.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 82, $tax_rate8);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 82, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 82, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 82, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 82, $tax_rate8, value);
	}

	/**
	 *  税率８.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 82, $tax_rate8, value);
	}


	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 83, $tax_rate_sls_amt8);
	}

	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt8, value);
	}

	/**
	 *  税率毎売上額８.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 83, $tax_rate_sls_amt8, value);
	}


	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 84, $tax_rate_tax_amt8);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt8, value);
	}

	/**
	 *  税率毎税額８.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 84, $tax_rate_tax_amt8, value);
	}


	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 85, $tax_rate_base_tax_amt8);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt8, value);
	}

	/**
	 *  税率毎基準通貨税額８.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 85, $tax_rate_base_tax_amt8, value);
	}


	/**
	 *  税率９.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 86, $tax_rate9);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 86, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 86, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 86, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 86, $tax_rate9, value);
	}

	/**
	 *  税率９.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 86, $tax_rate9, value);
	}


	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 87, $tax_rate_sls_amt9);
	}

	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt9, value);
	}

	/**
	 *  税率毎売上額９.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 87, $tax_rate_sls_amt9, value);
	}


	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 88, $tax_rate_tax_amt9);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt9, value);
	}

	/**
	 *  税率毎税額９.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 88, $tax_rate_tax_amt9, value);
	}


	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 89, $tax_rate_base_tax_amt9);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt9, value);
	}

	/**
	 *  税率毎基準通貨税額９.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 89, $tax_rate_base_tax_amt9, value);
	}


	/**
	 *  税率１０.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 90, $tax_rate10);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 90, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 90, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 90, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 90, $tax_rate10, value);
	}

	/**
	 *  税率１０.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 90, $tax_rate10, value);
	}


	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 91, $tax_rate_sls_amt10);
	}

	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt10, value);
	}

	/**
	 *  税率毎売上額１０.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 91, $tax_rate_sls_amt10, value);
	}


	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 92, $tax_rate_tax_amt10);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 92, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 92, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 92, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 92, $tax_rate_tax_amt10, value);
	}

	/**
	 *  税率毎税額１０.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 92, $tax_rate_tax_amt10, value);
	}


	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 93, $tax_rate_base_tax_amt10);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 93, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 93, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 93, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 93, $tax_rate_base_tax_amt10, value);
	}

	/**
	 *  税率毎基準通貨税額１０.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 93, $tax_rate_base_tax_amt10, value);
	}


	/**
	 *  前受金残高.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 94, $adv_amt_bal);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 94, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 94, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 94, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 94, $adv_amt_bal, value);
	}

	/**
	 *  前受金残高.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 94, $adv_amt_bal, value);
	}


	/**
	 *  前受金入金額.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 95, $adv_amt);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 95, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 95, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 95, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 95, $adv_amt, value);
	}

	/**
	 *  前受金入金額.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 95, $adv_amt, value);
	}


	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 96, $adv_setoff_amt);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 96, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 96, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 96, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 96, $adv_setoff_amt, value);
	}

	/**
	 *  前受金相殺額.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 96, $adv_setoff_amt, value);
	}


	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 97, $adv_setoff_tax_amt);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 97, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 97, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 97, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 97, $adv_setoff_tax_amt, value);
	}

	/**
	 *  前受金相殺税額.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 97, $adv_setoff_tax_amt, value);
	}


	/**
	 *  入金予定日１.<p>
	 *
	 */
	public String rcv_schd_dt1() {
		return getConstString(offset + 98, $rcv_schd_dt1);
	}

	/**
	 *  入金予定日１.<p>
	 *
	 */
	public void rcv_schd_dt1(String value) {
		setConstString(offset + 98, $rcv_schd_dt1, value);
	}


	/**
	 *  入金予定額１.<p>
	 *
	 */
	public MCNumber rcv_schd_amt1() {
		return getConstNumber(offset + 99, $rcv_schd_amt1);
	}

	/**
	 *  入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(MCNumber value) {
		setConstNumber(offset + 99, $rcv_schd_amt1, value);
	}

	/**
	 *  入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(int value) {
		setConstNumber(offset + 99, $rcv_schd_amt1, value);
	}

	/**
	 *  入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(long value) {
		setConstNumber(offset + 99, $rcv_schd_amt1, value);
	}

	/**
	 *  入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(float value) {
		setConstNumber(offset + 99, $rcv_schd_amt1, value);
	}

	/**
	 *  入金予定額１.<p>
	 *
	 */
	public void rcv_schd_amt1(double value) {
		setConstNumber(offset + 99, $rcv_schd_amt1, value);
	}


	/**
	 *  入金方法ＣＤ１.<p>
	 *
	 */
	public String rcv_mtd_cd1() {
		return getConstString(offset + 100, $rcv_mtd_cd1);
	}

	/**
	 *  入金方法ＣＤ１.<p>
	 *
	 */
	public void rcv_mtd_cd1(String value) {
		setConstString(offset + 100, $rcv_mtd_cd1, value);
	}


	/**
	 *  入金方法名１.<p>
	 *
	 */
	public String rcv_mtd_nm1() {
		return getConstString(offset + 101, $rcv_mtd_nm1);
	}

	/**
	 *  入金方法名１.<p>
	 *
	 */
	public void rcv_mtd_nm1(String value) {
		setConstString(offset + 101, $rcv_mtd_nm1, value);
	}


	/**
	 *  入金予定日２.<p>
	 *
	 */
	public String rcv_schd_dt2() {
		return getConstString(offset + 102, $rcv_schd_dt2);
	}

	/**
	 *  入金予定日２.<p>
	 *
	 */
	public void rcv_schd_dt2(String value) {
		setConstString(offset + 102, $rcv_schd_dt2, value);
	}


	/**
	 *  入金予定額２.<p>
	 *
	 */
	public MCNumber rcv_schd_amt2() {
		return getConstNumber(offset + 103, $rcv_schd_amt2);
	}

	/**
	 *  入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(MCNumber value) {
		setConstNumber(offset + 103, $rcv_schd_amt2, value);
	}

	/**
	 *  入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(int value) {
		setConstNumber(offset + 103, $rcv_schd_amt2, value);
	}

	/**
	 *  入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(long value) {
		setConstNumber(offset + 103, $rcv_schd_amt2, value);
	}

	/**
	 *  入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(float value) {
		setConstNumber(offset + 103, $rcv_schd_amt2, value);
	}

	/**
	 *  入金予定額２.<p>
	 *
	 */
	public void rcv_schd_amt2(double value) {
		setConstNumber(offset + 103, $rcv_schd_amt2, value);
	}


	/**
	 *  入金方法ＣＤ２.<p>
	 *
	 */
	public String rcv_mtd_cd2() {
		return getConstString(offset + 104, $rcv_mtd_cd2);
	}

	/**
	 *  入金方法ＣＤ２.<p>
	 *
	 */
	public void rcv_mtd_cd2(String value) {
		setConstString(offset + 104, $rcv_mtd_cd2, value);
	}


	/**
	 *  入金方法名２.<p>
	 *
	 */
	public String rcv_mtd_nm2() {
		return getConstString(offset + 105, $rcv_mtd_nm2);
	}

	/**
	 *  入金方法名２.<p>
	 *
	 */
	public void rcv_mtd_nm2(String value) {
		setConstString(offset + 105, $rcv_mtd_nm2, value);
	}


	/**
	 *  入金予定日３.<p>
	 *
	 */
	public String rcv_schd_dt3() {
		return getConstString(offset + 106, $rcv_schd_dt3);
	}

	/**
	 *  入金予定日３.<p>
	 *
	 */
	public void rcv_schd_dt3(String value) {
		setConstString(offset + 106, $rcv_schd_dt3, value);
	}


	/**
	 *  入金予定額３.<p>
	 *
	 */
	public MCNumber rcv_schd_amt3() {
		return getConstNumber(offset + 107, $rcv_schd_amt3);
	}

	/**
	 *  入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(MCNumber value) {
		setConstNumber(offset + 107, $rcv_schd_amt3, value);
	}

	/**
	 *  入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(int value) {
		setConstNumber(offset + 107, $rcv_schd_amt3, value);
	}

	/**
	 *  入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(long value) {
		setConstNumber(offset + 107, $rcv_schd_amt3, value);
	}

	/**
	 *  入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(float value) {
		setConstNumber(offset + 107, $rcv_schd_amt3, value);
	}

	/**
	 *  入金予定額３.<p>
	 *
	 */
	public void rcv_schd_amt3(double value) {
		setConstNumber(offset + 107, $rcv_schd_amt3, value);
	}


	/**
	 *  入金方法ＣＤ３.<p>
	 *
	 */
	public String rcv_mtd_cd3() {
		return getConstString(offset + 108, $rcv_mtd_cd3);
	}

	/**
	 *  入金方法ＣＤ３.<p>
	 *
	 */
	public void rcv_mtd_cd3(String value) {
		setConstString(offset + 108, $rcv_mtd_cd3, value);
	}


	/**
	 *  入金方法名３.<p>
	 *
	 */
	public String rcv_mtd_nm3() {
		return getConstString(offset + 109, $rcv_mtd_nm3);
	}

	/**
	 *  入金方法名３.<p>
	 *
	 */
	public void rcv_mtd_nm3(String value) {
		setConstString(offset + 109, $rcv_mtd_nm3, value);
	}


	/**
	 *  入金予定日４.<p>
	 *
	 */
	public String rcv_schd_dt4() {
		return getConstString(offset + 110, $rcv_schd_dt4);
	}

	/**
	 *  入金予定日４.<p>
	 *
	 */
	public void rcv_schd_dt4(String value) {
		setConstString(offset + 110, $rcv_schd_dt4, value);
	}


	/**
	 *  入金予定額４.<p>
	 *
	 */
	public MCNumber rcv_schd_amt4() {
		return getConstNumber(offset + 111, $rcv_schd_amt4);
	}

	/**
	 *  入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(MCNumber value) {
		setConstNumber(offset + 111, $rcv_schd_amt4, value);
	}

	/**
	 *  入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(int value) {
		setConstNumber(offset + 111, $rcv_schd_amt4, value);
	}

	/**
	 *  入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(long value) {
		setConstNumber(offset + 111, $rcv_schd_amt4, value);
	}

	/**
	 *  入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(float value) {
		setConstNumber(offset + 111, $rcv_schd_amt4, value);
	}

	/**
	 *  入金予定額４.<p>
	 *
	 */
	public void rcv_schd_amt4(double value) {
		setConstNumber(offset + 111, $rcv_schd_amt4, value);
	}


	/**
	 *  入金方法ＣＤ４.<p>
	 *
	 */
	public String rcv_mtd_cd4() {
		return getConstString(offset + 112, $rcv_mtd_cd4);
	}

	/**
	 *  入金方法ＣＤ４.<p>
	 *
	 */
	public void rcv_mtd_cd4(String value) {
		setConstString(offset + 112, $rcv_mtd_cd4, value);
	}


	/**
	 *  入金方法名４.<p>
	 *
	 */
	public String rcv_mtd_nm4() {
		return getConstString(offset + 113, $rcv_mtd_nm4);
	}

	/**
	 *  入金方法名４.<p>
	 *
	 */
	public void rcv_mtd_nm4(String value) {
		setConstString(offset + 113, $rcv_mtd_nm4, value);
	}


	/**
	 *  入金予定日５.<p>
	 *
	 */
	public String rcv_schd_dt5() {
		return getConstString(offset + 114, $rcv_schd_dt5);
	}

	/**
	 *  入金予定日５.<p>
	 *
	 */
	public void rcv_schd_dt5(String value) {
		setConstString(offset + 114, $rcv_schd_dt5, value);
	}


	/**
	 *  入金予定額５.<p>
	 *
	 */
	public MCNumber rcv_schd_amt5() {
		return getConstNumber(offset + 115, $rcv_schd_amt5);
	}

	/**
	 *  入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(MCNumber value) {
		setConstNumber(offset + 115, $rcv_schd_amt5, value);
	}

	/**
	 *  入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(int value) {
		setConstNumber(offset + 115, $rcv_schd_amt5, value);
	}

	/**
	 *  入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(long value) {
		setConstNumber(offset + 115, $rcv_schd_amt5, value);
	}

	/**
	 *  入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(float value) {
		setConstNumber(offset + 115, $rcv_schd_amt5, value);
	}

	/**
	 *  入金予定額５.<p>
	 *
	 */
	public void rcv_schd_amt5(double value) {
		setConstNumber(offset + 115, $rcv_schd_amt5, value);
	}


	/**
	 *  入金方法ＣＤ５.<p>
	 *
	 */
	public String rcv_mtd_cd5() {
		return getConstString(offset + 116, $rcv_mtd_cd5);
	}

	/**
	 *  入金方法ＣＤ５.<p>
	 *
	 */
	public void rcv_mtd_cd5(String value) {
		setConstString(offset + 116, $rcv_mtd_cd5, value);
	}


	/**
	 *  入金方法名５.<p>
	 *
	 */
	public String rcv_mtd_nm5() {
		return getConstString(offset + 117, $rcv_mtd_nm5);
	}

	/**
	 *  入金方法名５.<p>
	 *
	 */
	public void rcv_mtd_nm5(String value) {
		setConstString(offset + 117, $rcv_mtd_nm5, value);
	}


	/**
	 *  入金予定日６.<p>
	 *
	 */
	public String rcv_schd_dt6() {
		return getConstString(offset + 118, $rcv_schd_dt6);
	}

	/**
	 *  入金予定日６.<p>
	 *
	 */
	public void rcv_schd_dt6(String value) {
		setConstString(offset + 118, $rcv_schd_dt6, value);
	}


	/**
	 *  入金予定額６.<p>
	 *
	 */
	public MCNumber rcv_schd_amt6() {
		return getConstNumber(offset + 119, $rcv_schd_amt6);
	}

	/**
	 *  入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(MCNumber value) {
		setConstNumber(offset + 119, $rcv_schd_amt6, value);
	}

	/**
	 *  入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(int value) {
		setConstNumber(offset + 119, $rcv_schd_amt6, value);
	}

	/**
	 *  入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(long value) {
		setConstNumber(offset + 119, $rcv_schd_amt6, value);
	}

	/**
	 *  入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(float value) {
		setConstNumber(offset + 119, $rcv_schd_amt6, value);
	}

	/**
	 *  入金予定額６.<p>
	 *
	 */
	public void rcv_schd_amt6(double value) {
		setConstNumber(offset + 119, $rcv_schd_amt6, value);
	}


	/**
	 *  入金方法ＣＤ６.<p>
	 *
	 */
	public String rcv_mtd_cd6() {
		return getConstString(offset + 120, $rcv_mtd_cd6);
	}

	/**
	 *  入金方法ＣＤ６.<p>
	 *
	 */
	public void rcv_mtd_cd6(String value) {
		setConstString(offset + 120, $rcv_mtd_cd6, value);
	}


	/**
	 *  入金方法名６.<p>
	 *
	 */
	public String rcv_mtd_nm6() {
		return getConstString(offset + 121, $rcv_mtd_nm6);
	}

	/**
	 *  入金方法名６.<p>
	 *
	 */
	public void rcv_mtd_nm6(String value) {
		setConstString(offset + 121, $rcv_mtd_nm6, value);
	}


	/**
	 *  入金予定日７.<p>
	 *
	 */
	public String rcv_schd_dt7() {
		return getConstString(offset + 122, $rcv_schd_dt7);
	}

	/**
	 *  入金予定日７.<p>
	 *
	 */
	public void rcv_schd_dt7(String value) {
		setConstString(offset + 122, $rcv_schd_dt7, value);
	}


	/**
	 *  入金予定額７.<p>
	 *
	 */
	public MCNumber rcv_schd_amt7() {
		return getConstNumber(offset + 123, $rcv_schd_amt7);
	}

	/**
	 *  入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(MCNumber value) {
		setConstNumber(offset + 123, $rcv_schd_amt7, value);
	}

	/**
	 *  入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(int value) {
		setConstNumber(offset + 123, $rcv_schd_amt7, value);
	}

	/**
	 *  入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(long value) {
		setConstNumber(offset + 123, $rcv_schd_amt7, value);
	}

	/**
	 *  入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(float value) {
		setConstNumber(offset + 123, $rcv_schd_amt7, value);
	}

	/**
	 *  入金予定額７.<p>
	 *
	 */
	public void rcv_schd_amt7(double value) {
		setConstNumber(offset + 123, $rcv_schd_amt7, value);
	}


	/**
	 *  入金方法ＣＤ７.<p>
	 *
	 */
	public String rcv_mtd_cd7() {
		return getConstString(offset + 124, $rcv_mtd_cd7);
	}

	/**
	 *  入金方法ＣＤ７.<p>
	 *
	 */
	public void rcv_mtd_cd7(String value) {
		setConstString(offset + 124, $rcv_mtd_cd7, value);
	}


	/**
	 *  入金方法名７.<p>
	 *
	 */
	public String rcv_mtd_nm7() {
		return getConstString(offset + 125, $rcv_mtd_nm7);
	}

	/**
	 *  入金方法名７.<p>
	 *
	 */
	public void rcv_mtd_nm7(String value) {
		setConstString(offset + 125, $rcv_mtd_nm7, value);
	}


	/**
	 *  入金予定日８.<p>
	 *
	 */
	public String rcv_schd_dt8() {
		return getConstString(offset + 126, $rcv_schd_dt8);
	}

	/**
	 *  入金予定日８.<p>
	 *
	 */
	public void rcv_schd_dt8(String value) {
		setConstString(offset + 126, $rcv_schd_dt8, value);
	}


	/**
	 *  入金予定額８.<p>
	 *
	 */
	public MCNumber rcv_schd_amt8() {
		return getConstNumber(offset + 127, $rcv_schd_amt8);
	}

	/**
	 *  入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(MCNumber value) {
		setConstNumber(offset + 127, $rcv_schd_amt8, value);
	}

	/**
	 *  入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(int value) {
		setConstNumber(offset + 127, $rcv_schd_amt8, value);
	}

	/**
	 *  入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(long value) {
		setConstNumber(offset + 127, $rcv_schd_amt8, value);
	}

	/**
	 *  入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(float value) {
		setConstNumber(offset + 127, $rcv_schd_amt8, value);
	}

	/**
	 *  入金予定額８.<p>
	 *
	 */
	public void rcv_schd_amt8(double value) {
		setConstNumber(offset + 127, $rcv_schd_amt8, value);
	}


	/**
	 *  入金方法ＣＤ８.<p>
	 *
	 */
	public String rcv_mtd_cd8() {
		return getConstString(offset + 128, $rcv_mtd_cd8);
	}

	/**
	 *  入金方法ＣＤ８.<p>
	 *
	 */
	public void rcv_mtd_cd8(String value) {
		setConstString(offset + 128, $rcv_mtd_cd8, value);
	}


	/**
	 *  入金方法名８.<p>
	 *
	 */
	public String rcv_mtd_nm8() {
		return getConstString(offset + 129, $rcv_mtd_nm8);
	}

	/**
	 *  入金方法名８.<p>
	 *
	 */
	public void rcv_mtd_nm8(String value) {
		setConstString(offset + 129, $rcv_mtd_nm8, value);
	}


	/**
	 *  入金予定日９.<p>
	 *
	 */
	public String rcv_schd_dt9() {
		return getConstString(offset + 130, $rcv_schd_dt9);
	}

	/**
	 *  入金予定日９.<p>
	 *
	 */
	public void rcv_schd_dt9(String value) {
		setConstString(offset + 130, $rcv_schd_dt9, value);
	}


	/**
	 *  入金予定額９.<p>
	 *
	 */
	public MCNumber rcv_schd_amt9() {
		return getConstNumber(offset + 131, $rcv_schd_amt9);
	}

	/**
	 *  入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(MCNumber value) {
		setConstNumber(offset + 131, $rcv_schd_amt9, value);
	}

	/**
	 *  入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(int value) {
		setConstNumber(offset + 131, $rcv_schd_amt9, value);
	}

	/**
	 *  入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(long value) {
		setConstNumber(offset + 131, $rcv_schd_amt9, value);
	}

	/**
	 *  入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(float value) {
		setConstNumber(offset + 131, $rcv_schd_amt9, value);
	}

	/**
	 *  入金予定額９.<p>
	 *
	 */
	public void rcv_schd_amt9(double value) {
		setConstNumber(offset + 131, $rcv_schd_amt9, value);
	}


	/**
	 *  入金方法ＣＤ９.<p>
	 *
	 */
	public String rcv_mtd_cd9() {
		return getConstString(offset + 132, $rcv_mtd_cd9);
	}

	/**
	 *  入金方法ＣＤ９.<p>
	 *
	 */
	public void rcv_mtd_cd9(String value) {
		setConstString(offset + 132, $rcv_mtd_cd9, value);
	}


	/**
	 *  入金方法名９.<p>
	 *
	 */
	public String rcv_mtd_nm9() {
		return getConstString(offset + 133, $rcv_mtd_nm9);
	}

	/**
	 *  入金方法名９.<p>
	 *
	 */
	public void rcv_mtd_nm9(String value) {
		setConstString(offset + 133, $rcv_mtd_nm9, value);
	}


	/**
	 *  入金予定日１０.<p>
	 *
	 */
	public String rcv_schd_dt10() {
		return getConstString(offset + 134, $rcv_schd_dt10);
	}

	/**
	 *  入金予定日１０.<p>
	 *
	 */
	public void rcv_schd_dt10(String value) {
		setConstString(offset + 134, $rcv_schd_dt10, value);
	}


	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public MCNumber rcv_schd_amt10() {
		return getConstNumber(offset + 135, $rcv_schd_amt10);
	}

	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(MCNumber value) {
		setConstNumber(offset + 135, $rcv_schd_amt10, value);
	}

	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(int value) {
		setConstNumber(offset + 135, $rcv_schd_amt10, value);
	}

	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(long value) {
		setConstNumber(offset + 135, $rcv_schd_amt10, value);
	}

	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(float value) {
		setConstNumber(offset + 135, $rcv_schd_amt10, value);
	}

	/**
	 *  入金予定額１０.<p>
	 *
	 */
	public void rcv_schd_amt10(double value) {
		setConstNumber(offset + 135, $rcv_schd_amt10, value);
	}


	/**
	 *  入金方法ＣＤ１０.<p>
	 *
	 */
	public String rcv_mtd_cd10() {
		return getConstString(offset + 136, $rcv_mtd_cd10);
	}

	/**
	 *  入金方法ＣＤ１０.<p>
	 *
	 */
	public void rcv_mtd_cd10(String value) {
		setConstString(offset + 136, $rcv_mtd_cd10, value);
	}


	/**
	 *  入金方法名１０.<p>
	 *
	 */
	public String rcv_mtd_nm10() {
		return getConstString(offset + 137, $rcv_mtd_nm10);
	}

	/**
	 *  入金方法名１０.<p>
	 *
	 */
	public void rcv_mtd_nm10(String value) {
		setConstString(offset + 137, $rcv_mtd_nm10, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 138, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 138, $bank_ac_cd, value);
	}


	/**
	 *  口座区分.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 139, $bank_ac_typ);
	}

	/**
	 *  口座区分.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 139, $bank_ac_typ, value);
	}


	/**
	 *  口座番号.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 140, $bank_ac_no);
	}

	/**
	 *  口座番号.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 140, $bank_ac_no, value);
	}


	/**
	 *  口座名義.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 141, $bank_ac_holder);
	}

	/**
	 *  口座名義.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 141, $bank_ac_holder, value);
	}


	/**
	 *  口座名義別名.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return getConstString(offset + 142, $bank_ac_holder_sub);
	}

	/**
	 *  口座名義別名.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		setConstString(offset + 142, $bank_ac_holder_sub, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 143, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 143, $bank_cd, value);
	}


	/**
	 *  銀行名.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 144, $bank_nm);
	}

	/**
	 *  銀行名.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 144, $bank_nm, value);
	}


	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 145, $branch_cd);
	}

	/**
	 *  支店ＣＤ.<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 145, $branch_cd, value);
	}


	/**
	 *  支店名.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 146, $branch_nm);
	}

	/**
	 *  支店名.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 146, $branch_nm, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 147, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 147, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 148, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 148, $trd_nm, value);
	}


	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 149, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 149, $trd_ptn_typ, value);
	}


	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 150, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 150, $slip_sts_typ, value);
	}


	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 151, $dlv_slip_no);
	}

	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 151, $dlv_slip_no, value);
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 152, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 152, $dlv_slip_d_no, value);
	}


	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 153, $ship_dlv_slip_no);
	}

	/**
	 *  出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 153, $ship_dlv_slip_no, value);
	}


	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 154, $ship_dlv_slip_d_no);
	}

	/**
	 *  出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 154, $ship_dlv_slip_d_no, value);
	}


	/**
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 155, $act_no);
	}

	/**
	 *  ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 155, $act_no, value);
	}


	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 156, $act_rev);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 156, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 156, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 156, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 156, $act_rev, value);
	}

	/**
	 *  ヘッダ実績改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 156, $act_rev, value);
	}


	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 157, $act_d_no);
	}

	/**
	 *  明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 157, $act_d_no, value);
	}


	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 158, $cst_po_no);
	}

	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 158, $cst_po_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 159, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 159, $cst_po_d_no, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public String ac_dt() {
		return getConstString(offset + 160, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(String value) {
		setConstString(offset + 160, $ac_dt, value);
	}


	/**
	 *  納品日.<p>
	 *
	 */
	public String dlv_dt() {
		return getConstString(offset + 161, $dlv_dt);
	}

	/**
	 *  納品日.<p>
	 *
	 */
	public void dlv_dt(String value) {
		setConstString(offset + 161, $dlv_dt, value);
	}


	/**
	 *  入金日.<p>
	 *
	 */
	public String rcv_dt() {
		return getConstString(offset + 162, $rcv_dt);
	}

	/**
	 *  入金日.<p>
	 *
	 */
	public void rcv_dt(String value) {
		setConstString(offset + 162, $rcv_dt, value);
	}


	/**
	 *  請求起算日.<p>
	 *
	 */
	public String bill_basis_dt() {
		return getConstString(offset + 163, $bill_basis_dt);
	}

	/**
	 *  請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(String value) {
		setConstString(offset + 163, $bill_basis_dt, value);
	}


	/**
	 *  計上日（基）.<p>
	 *
	 */
	public String base_ac_dt() {
		return getConstString(offset + 164, $base_ac_dt);
	}

	/**
	 *  計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(String value) {
		setConstString(offset + 164, $base_ac_dt, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 165, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 165, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 166, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 166, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 167, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 167, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 168, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 168, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 169, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 169, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 170, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 170, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 171, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 171, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 172, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 172, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 173, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 173, $itm_alt_nm4, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 174, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 174, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 175, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 175, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 176, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 176, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 177, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 177, $sno4, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 178, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 178, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 179, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 179, $trd_unit_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 180, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 180, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 180, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 180, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 180, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 180, $trd_unit_qty, value);
	}


	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 181, $interim_flg);
	}

	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 181, $interim_flg, value);
	}


	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 182, $trd_cur_upri);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 182, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 182, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 182, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 182, $trd_cur_upri, value);
	}

	/**
	 *  取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 182, $trd_cur_upri, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 183, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 183, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 183, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 183, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 183, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 183, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 184, $trd_cur_dscnt_amt);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 184, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 184, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 184, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 184, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 184, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 185, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 185, $tax_cd, value);
	}


	/**
	 *  税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 186, $tax_nm);
	}

	/**
	 *  税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 186, $tax_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 187, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 187, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 187, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 187, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 187, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 187, $tax_rate, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 188, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 188, $inc_tax_flg, value);
	}


	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 189, $trd_cur_tax_amt);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 189, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 189, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 189, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 189, $trd_cur_tax_amt, value);
	}

	/**
	 *  取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 189, $trd_cur_tax_amt, value);
	}


	/**
	 *  明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 190, $trd_d_rmrks);
	}

	/**
	 *  明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 190, $trd_d_rmrks, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 191, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 191, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 192, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 192, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 193, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 193, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 194, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 194, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 195, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 195, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 196, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 196, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 197, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 197, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 198, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 198, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 199, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 199, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 200, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 200, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 201, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 201, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 202, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 202, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 203, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 203, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 204, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 204, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 205, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 205, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 206, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 206, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 207, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 207, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 208, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 208, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 209, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 209, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 210, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 210, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 211, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 211, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 212, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 212, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 213, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 213, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 214, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 214, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 215, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 215, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 216, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 216, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 217, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 217, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 218, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 218, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 219, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 219, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 220, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 220, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 221, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 221, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 221, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 221, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 221, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 221, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 222, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 222, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 222, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 222, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 222, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 222, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 223, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 223, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 223, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 223, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 223, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 223, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 224, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 224, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 224, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 224, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 224, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 224, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 225, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 225, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 225, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 225, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 225, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 225, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public String sub_dt1() {
		return getConstString(offset + 226, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(String value) {
		setConstString(offset + 226, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public String sub_dt2() {
		return getConstString(offset + 227, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(String value) {
		setConstString(offset + 227, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public String sub_dt3() {
		return getConstString(offset + 228, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(String value) {
		setConstString(offset + 228, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public String sub_dt4() {
		return getConstString(offset + 229, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(String value) {
		setConstString(offset + 229, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public String sub_dt5() {
		return getConstString(offset + 230, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(String value) {
		setConstString(offset + 230, $sub_dt5, value);
	}


	/**
	 *  単価単位ＣＤ.<p>
	 *
	 */
	public String upri_unit_cd() {
		return getConstString(offset + 231, $upri_unit_cd);
	}

	/**
	 *  単価単位ＣＤ.<p>
	 *
	 */
	public void upri_unit_cd(String value) {
		setConstString(offset + 231, $upri_unit_cd, value);
	}


	/**
	 *  支払済金額.<p>
	 *
	 */
	public MCNumber bill_paid_amt() {
		return getConstNumber(offset + 232, $bill_paid_amt);
	}

	/**
	 *  支払済金額.<p>
	 *
	 */
	public void bill_paid_amt(MCNumber value) {
		setConstNumber(offset + 232, $bill_paid_amt, value);
	}

	/**
	 *  支払済金額.<p>
	 *
	 */
	public void bill_paid_amt(int value) {
		setConstNumber(offset + 232, $bill_paid_amt, value);
	}

	/**
	 *  支払済金額.<p>
	 *
	 */
	public void bill_paid_amt(long value) {
		setConstNumber(offset + 232, $bill_paid_amt, value);
	}

	/**
	 *  支払済金額.<p>
	 *
	 */
	public void bill_paid_amt(float value) {
		setConstNumber(offset + 232, $bill_paid_amt, value);
	}

	/**
	 *  支払済金額.<p>
	 *
	 */
	public void bill_paid_amt(double value) {
		setConstNumber(offset + 232, $bill_paid_amt, value);
	}


	/**
	 *  差引請求金額.<p>
	 *
	 */
	public MCNumber bill_due_amt() {
		return getConstNumber(offset + 233, $bill_due_amt);
	}

	/**
	 *  差引請求金額.<p>
	 *
	 */
	public void bill_due_amt(MCNumber value) {
		setConstNumber(offset + 233, $bill_due_amt, value);
	}

	/**
	 *  差引請求金額.<p>
	 *
	 */
	public void bill_due_amt(int value) {
		setConstNumber(offset + 233, $bill_due_amt, value);
	}

	/**
	 *  差引請求金額.<p>
	 *
	 */
	public void bill_due_amt(long value) {
		setConstNumber(offset + 233, $bill_due_amt, value);
	}

	/**
	 *  差引請求金額.<p>
	 *
	 */
	public void bill_due_amt(float value) {
		setConstNumber(offset + 233, $bill_due_amt, value);
	}

	/**
	 *  差引請求金額.<p>
	 *
	 */
	public void bill_due_amt(double value) {
		setConstNumber(offset + 233, $bill_due_amt, value);
	}


	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public MCNumber ttl_bill_amt() {
		return getConstNumber(offset + 234, $ttl_bill_amt);
	}

	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public void ttl_bill_amt(MCNumber value) {
		setConstNumber(offset + 234, $ttl_bill_amt, value);
	}

	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public void ttl_bill_amt(int value) {
		setConstNumber(offset + 234, $ttl_bill_amt, value);
	}

	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public void ttl_bill_amt(long value) {
		setConstNumber(offset + 234, $ttl_bill_amt, value);
	}

	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public void ttl_bill_amt(float value) {
		setConstNumber(offset + 234, $ttl_bill_amt, value);
	}

	/**
	 *  値引後明細行金額合計.<p>
	 *
	 */
	public void ttl_bill_amt(double value) {
		setConstNumber(offset + 234, $ttl_bill_amt, value);
	}


	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public MCNumber sum_bill_amt_inc_tax() {
		return getConstNumber(offset + 235, $sum_bill_amt_inc_tax);
	}

	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public void sum_bill_amt_inc_tax(MCNumber value) {
		setConstNumber(offset + 235, $sum_bill_amt_inc_tax, value);
	}

	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public void sum_bill_amt_inc_tax(int value) {
		setConstNumber(offset + 235, $sum_bill_amt_inc_tax, value);
	}

	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public void sum_bill_amt_inc_tax(long value) {
		setConstNumber(offset + 235, $sum_bill_amt_inc_tax, value);
	}

	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public void sum_bill_amt_inc_tax(float value) {
		setConstNumber(offset + 235, $sum_bill_amt_inc_tax, value);
	}

	/**
	 *  請求額（税込）.<p>
	 *
	 */
	public void sum_bill_amt_inc_tax(double value) {
		setConstNumber(offset + 235, $sum_bill_amt_inc_tax, value);
	}


	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public MCNumber sum_bill_amt() {
		return getConstNumber(offset + 236, $sum_bill_amt);
	}

	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public void sum_bill_amt(MCNumber value) {
		setConstNumber(offset + 236, $sum_bill_amt, value);
	}

	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public void sum_bill_amt(int value) {
		setConstNumber(offset + 236, $sum_bill_amt, value);
	}

	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public void sum_bill_amt(long value) {
		setConstNumber(offset + 236, $sum_bill_amt, value);
	}

	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public void sum_bill_amt(float value) {
		setConstNumber(offset + 236, $sum_bill_amt, value);
	}

	/**
	 *  請求額（税抜）.<p>
	 *
	 */
	public void sum_bill_amt(double value) {
		setConstNumber(offset + 236, $sum_bill_amt, value);
	}


	/**
	 *  課税分類（０パーセント）.<p>
	 *
	 */
	public String tax_rate_ctg_per0() {
		return getConstString(offset + 237, $tax_rate_ctg_per0);
	}

	/**
	 *  課税分類（０パーセント）.<p>
	 *
	 */
	public void tax_rate_ctg_per0(String value) {
		setConstString(offset + 237, $tax_rate_ctg_per0, value);
	}


	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt_per0() {
		return getConstNumber(offset + 238, $tax_rate_sls_amt_per0);
	}

	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per0(MCNumber value) {
		setConstNumber(offset + 238, $tax_rate_sls_amt_per0, value);
	}

	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per0(int value) {
		setConstNumber(offset + 238, $tax_rate_sls_amt_per0, value);
	}

	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per0(long value) {
		setConstNumber(offset + 238, $tax_rate_sls_amt_per0, value);
	}

	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per0(float value) {
		setConstNumber(offset + 238, $tax_rate_sls_amt_per0, value);
	}

	/**
	 *  税率毎売上額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per0(double value) {
		setConstNumber(offset + 238, $tax_rate_sls_amt_per0, value);
	}


	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt_per0() {
		return getConstNumber(offset + 239, $tax_rate_tax_amt_per0);
	}

	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per0(MCNumber value) {
		setConstNumber(offset + 239, $tax_rate_tax_amt_per0, value);
	}

	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per0(int value) {
		setConstNumber(offset + 239, $tax_rate_tax_amt_per0, value);
	}

	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per0(long value) {
		setConstNumber(offset + 239, $tax_rate_tax_amt_per0, value);
	}

	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per0(float value) {
		setConstNumber(offset + 239, $tax_rate_tax_amt_per0, value);
	}

	/**
	 *  税率毎税額（０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per0(double value) {
		setConstNumber(offset + 239, $tax_rate_tax_amt_per0, value);
	}


	/**
	 *  課税分類（８パーセント）.<p>
	 *
	 */
	public String tax_rate_ctg_per8() {
		return getConstString(offset + 240, $tax_rate_ctg_per8);
	}

	/**
	 *  課税分類（８パーセント）.<p>
	 *
	 */
	public void tax_rate_ctg_per8(String value) {
		setConstString(offset + 240, $tax_rate_ctg_per8, value);
	}


	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt_per8() {
		return getConstNumber(offset + 241, $tax_rate_sls_amt_per8);
	}

	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per8(MCNumber value) {
		setConstNumber(offset + 241, $tax_rate_sls_amt_per8, value);
	}

	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per8(int value) {
		setConstNumber(offset + 241, $tax_rate_sls_amt_per8, value);
	}

	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per8(long value) {
		setConstNumber(offset + 241, $tax_rate_sls_amt_per8, value);
	}

	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per8(float value) {
		setConstNumber(offset + 241, $tax_rate_sls_amt_per8, value);
	}

	/**
	 *  税率毎売上額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per8(double value) {
		setConstNumber(offset + 241, $tax_rate_sls_amt_per8, value);
	}


	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt_per8() {
		return getConstNumber(offset + 242, $tax_rate_tax_amt_per8);
	}

	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per8(MCNumber value) {
		setConstNumber(offset + 242, $tax_rate_tax_amt_per8, value);
	}

	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per8(int value) {
		setConstNumber(offset + 242, $tax_rate_tax_amt_per8, value);
	}

	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per8(long value) {
		setConstNumber(offset + 242, $tax_rate_tax_amt_per8, value);
	}

	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per8(float value) {
		setConstNumber(offset + 242, $tax_rate_tax_amt_per8, value);
	}

	/**
	 *  税率毎税額（８パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per8(double value) {
		setConstNumber(offset + 242, $tax_rate_tax_amt_per8, value);
	}


	/**
	 *  課税分類（１０パーセント）.<p>
	 *
	 */
	public String tax_rate_ctg_per10() {
		return getConstString(offset + 243, $tax_rate_ctg_per10);
	}

	/**
	 *  課税分類（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_ctg_per10(String value) {
		setConstString(offset + 243, $tax_rate_ctg_per10, value);
	}


	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt_per10() {
		return getConstNumber(offset + 244, $tax_rate_sls_amt_per10);
	}

	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per10(MCNumber value) {
		setConstNumber(offset + 244, $tax_rate_sls_amt_per10, value);
	}

	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per10(int value) {
		setConstNumber(offset + 244, $tax_rate_sls_amt_per10, value);
	}

	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per10(long value) {
		setConstNumber(offset + 244, $tax_rate_sls_amt_per10, value);
	}

	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per10(float value) {
		setConstNumber(offset + 244, $tax_rate_sls_amt_per10, value);
	}

	/**
	 *  税率毎売上額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_sls_amt_per10(double value) {
		setConstNumber(offset + 244, $tax_rate_sls_amt_per10, value);
	}


	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt_per10() {
		return getConstNumber(offset + 245, $tax_rate_tax_amt_per10);
	}

	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per10(MCNumber value) {
		setConstNumber(offset + 245, $tax_rate_tax_amt_per10, value);
	}

	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per10(int value) {
		setConstNumber(offset + 245, $tax_rate_tax_amt_per10, value);
	}

	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per10(long value) {
		setConstNumber(offset + 245, $tax_rate_tax_amt_per10, value);
	}

	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per10(float value) {
		setConstNumber(offset + 245, $tax_rate_tax_amt_per10, value);
	}

	/**
	 *  税率毎税額（１０パーセント）.<p>
	 *
	 */
	public void tax_rate_tax_amt_per10(double value) {
		setConstNumber(offset + 245, $tax_rate_tax_amt_per10, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
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
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
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
		if ($bill_co_cd.equalsIgnoreCase(name)) {
			return bill_co_cd();
		}
		if ($bill_co_nm.equalsIgnoreCase(name)) {
			return bill_co_nm();
		}
		if ($bill_co_ein.equalsIgnoreCase(name)) {
			return bill_co_ein();
		}
		if ($bill_co_biz_co_no.equalsIgnoreCase(name)) {
			return bill_co_biz_co_no();
		}
		if ($bill_co_zip_cd.equalsIgnoreCase(name)) {
			return bill_co_zip_cd();
		}
		if ($bill_co_addr1.equalsIgnoreCase(name)) {
			return bill_co_addr1();
		}
		if ($bill_co_addr2.equalsIgnoreCase(name)) {
			return bill_co_addr2();
		}
		if ($bill_co_addr3.equalsIgnoreCase(name)) {
			return bill_co_addr3();
		}
		if ($bill_co_addr4.equalsIgnoreCase(name)) {
			return bill_co_addr4();
		}
		if ($bill_co_dpt.equalsIgnoreCase(name)) {
			return bill_co_dpt();
		}
		if ($bill_co_tel.equalsIgnoreCase(name)) {
			return bill_co_tel();
		}
		if ($bill_co_cntry_cd.equalsIgnoreCase(name)) {
			return bill_co_cntry_cd();
		}
		if ($bill_rcpt_co_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_cd();
		}
		if ($bill_rcpt_co_nm.equalsIgnoreCase(name)) {
			return bill_rcpt_co_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_rcpt_co_ein.equalsIgnoreCase(name)) {
			return bill_rcpt_co_ein();
		}
		if ($bill_rcpt_co_biz_co_no.equalsIgnoreCase(name)) {
			return bill_rcpt_co_biz_co_no();
		}
		if ($bill_rcpt_co_zip_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_zip_cd();
		}
		if ($bill_rcpt_co_addr1.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr1();
		}
		if ($bill_rcpt_co_addr2.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr2();
		}
		if ($bill_rcpt_co_addr3.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr3();
		}
		if ($bill_rcpt_co_addr4.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_rcpt_co_cntry_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			return rcv_schd_dt1();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			return rcv_mtd_nm1();
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			return rcv_schd_dt2();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			return rcv_mtd_nm2();
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			return rcv_schd_dt3();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			return rcv_mtd_nm3();
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			return rcv_schd_dt4();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			return rcv_mtd_nm4();
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			return rcv_schd_dt5();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			return rcv_mtd_nm5();
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			return rcv_schd_dt6();
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return rcv_mtd_cd6();
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			return rcv_mtd_nm6();
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			return rcv_schd_dt7();
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return rcv_mtd_cd7();
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			return rcv_mtd_nm7();
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			return rcv_schd_dt8();
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return rcv_mtd_cd8();
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			return rcv_mtd_nm8();
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			return rcv_schd_dt9();
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return rcv_mtd_cd9();
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			return rcv_mtd_nm9();
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			return rcv_schd_dt10();
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return rcv_mtd_cd10();
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			return rcv_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($upri_unit_cd.equalsIgnoreCase(name)) {
			return upri_unit_cd();
		}
		if ($tax_rate_ctg_per0.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per0();
		}
		if ($tax_rate_ctg_per8.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per8();
		}
		if ($tax_rate_ctg_per10.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			return bill_paid_amt();
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			return bill_due_amt();
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			return ttl_bill_amt();
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			return sum_bill_amt_inc_tax();
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			return sum_bill_amt();
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per0();
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per0();
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per8();
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per8();
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per10();
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per10();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
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
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
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
		if ($bill_co_cd.equalsIgnoreCase(name)) {
			return bill_co_cd();
		}
		if ($bill_co_nm.equalsIgnoreCase(name)) {
			return bill_co_nm();
		}
		if ($bill_co_ein.equalsIgnoreCase(name)) {
			return bill_co_ein();
		}
		if ($bill_co_biz_co_no.equalsIgnoreCase(name)) {
			return bill_co_biz_co_no();
		}
		if ($bill_co_zip_cd.equalsIgnoreCase(name)) {
			return bill_co_zip_cd();
		}
		if ($bill_co_addr1.equalsIgnoreCase(name)) {
			return bill_co_addr1();
		}
		if ($bill_co_addr2.equalsIgnoreCase(name)) {
			return bill_co_addr2();
		}
		if ($bill_co_addr3.equalsIgnoreCase(name)) {
			return bill_co_addr3();
		}
		if ($bill_co_addr4.equalsIgnoreCase(name)) {
			return bill_co_addr4();
		}
		if ($bill_co_dpt.equalsIgnoreCase(name)) {
			return bill_co_dpt();
		}
		if ($bill_co_tel.equalsIgnoreCase(name)) {
			return bill_co_tel();
		}
		if ($bill_co_cntry_cd.equalsIgnoreCase(name)) {
			return bill_co_cntry_cd();
		}
		if ($bill_rcpt_co_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_cd();
		}
		if ($bill_rcpt_co_nm.equalsIgnoreCase(name)) {
			return bill_rcpt_co_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_rcpt_co_ein.equalsIgnoreCase(name)) {
			return bill_rcpt_co_ein();
		}
		if ($bill_rcpt_co_biz_co_no.equalsIgnoreCase(name)) {
			return bill_rcpt_co_biz_co_no();
		}
		if ($bill_rcpt_co_zip_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_zip_cd();
		}
		if ($bill_rcpt_co_addr1.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr1();
		}
		if ($bill_rcpt_co_addr2.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr2();
		}
		if ($bill_rcpt_co_addr3.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr3();
		}
		if ($bill_rcpt_co_addr4.equalsIgnoreCase(name)) {
			return bill_rcpt_co_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_rcpt_co_cntry_cd.equalsIgnoreCase(name)) {
			return bill_rcpt_co_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			return rcv_schd_dt1();
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			return rcv_mtd_cd1();
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			return rcv_mtd_nm1();
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			return rcv_schd_dt2();
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			return rcv_mtd_cd2();
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			return rcv_mtd_nm2();
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			return rcv_schd_dt3();
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			return rcv_mtd_cd3();
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			return rcv_mtd_nm3();
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			return rcv_schd_dt4();
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			return rcv_mtd_cd4();
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			return rcv_mtd_nm4();
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			return rcv_schd_dt5();
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			return rcv_mtd_cd5();
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			return rcv_mtd_nm5();
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			return rcv_schd_dt6();
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			return rcv_mtd_cd6();
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			return rcv_mtd_nm6();
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			return rcv_schd_dt7();
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			return rcv_mtd_cd7();
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			return rcv_mtd_nm7();
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			return rcv_schd_dt8();
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			return rcv_mtd_cd8();
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			return rcv_mtd_nm8();
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			return rcv_schd_dt9();
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			return rcv_mtd_cd9();
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			return rcv_mtd_nm9();
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			return rcv_schd_dt10();
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			return rcv_mtd_cd10();
		}
		if ($rcv_mtd_nm10.equalsIgnoreCase(name)) {
			return rcv_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		if ($upri_unit_cd.equalsIgnoreCase(name)) {
			return upri_unit_cd();
		}
		if ($tax_rate_ctg_per0.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per0();
		}
		if ($tax_rate_ctg_per8.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per8();
		}
		if ($tax_rate_ctg_per10.equalsIgnoreCase(name)) {
			return tax_rate_ctg_per10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			return bill_paid_amt();
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			return bill_due_amt();
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			return ttl_bill_amt();
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			return sum_bill_amt_inc_tax();
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			return sum_bill_amt();
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per0();
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per0();
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per8();
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per8();
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt_per10();
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt_per10();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
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
		if ($bill_co_cd.equalsIgnoreCase(name)) {
			bill_co_cd(value);
			return;
		}
		if ($bill_co_nm.equalsIgnoreCase(name)) {
			bill_co_nm(value);
			return;
		}
		if ($bill_co_ein.equalsIgnoreCase(name)) {
			bill_co_ein(value);
			return;
		}
		if ($bill_co_biz_co_no.equalsIgnoreCase(name)) {
			bill_co_biz_co_no(value);
			return;
		}
		if ($bill_co_zip_cd.equalsIgnoreCase(name)) {
			bill_co_zip_cd(value);
			return;
		}
		if ($bill_co_addr1.equalsIgnoreCase(name)) {
			bill_co_addr1(value);
			return;
		}
		if ($bill_co_addr2.equalsIgnoreCase(name)) {
			bill_co_addr2(value);
			return;
		}
		if ($bill_co_addr3.equalsIgnoreCase(name)) {
			bill_co_addr3(value);
			return;
		}
		if ($bill_co_addr4.equalsIgnoreCase(name)) {
			bill_co_addr4(value);
			return;
		}
		if ($bill_co_dpt.equalsIgnoreCase(name)) {
			bill_co_dpt(value);
			return;
		}
		if ($bill_co_tel.equalsIgnoreCase(name)) {
			bill_co_tel(value);
			return;
		}
		if ($bill_co_cntry_cd.equalsIgnoreCase(name)) {
			bill_co_cntry_cd(value);
			return;
		}
		if ($bill_rcpt_co_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_cd(value);
			return;
		}
		if ($bill_rcpt_co_nm.equalsIgnoreCase(name)) {
			bill_rcpt_co_nm(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_rcpt_co_ein.equalsIgnoreCase(name)) {
			bill_rcpt_co_ein(value);
			return;
		}
		if ($bill_rcpt_co_biz_co_no.equalsIgnoreCase(name)) {
			bill_rcpt_co_biz_co_no(value);
			return;
		}
		if ($bill_rcpt_co_zip_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_zip_cd(value);
			return;
		}
		if ($bill_rcpt_co_addr1.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr1(value);
			return;
		}
		if ($bill_rcpt_co_addr2.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr2(value);
			return;
		}
		if ($bill_rcpt_co_addr3.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr3(value);
			return;
		}
		if ($bill_rcpt_co_addr4.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr4(value);
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
		if ($bill_rcpt_co_cntry_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_cntry_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			rcv_schd_dt1(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			rcv_mtd_nm1(value);
			return;
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			rcv_schd_dt2(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			rcv_mtd_nm2(value);
			return;
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			rcv_schd_dt3(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			rcv_mtd_nm3(value);
			return;
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			rcv_schd_dt4(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			rcv_mtd_nm4(value);
			return;
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			rcv_schd_dt5(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			rcv_mtd_nm5(value);
			return;
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			rcv_schd_dt6(value);
			return;
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			rcv_mtd_cd6(value);
			return;
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			rcv_mtd_nm6(value);
			return;
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			rcv_schd_dt7(value);
			return;
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			rcv_mtd_cd7(value);
			return;
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			rcv_mtd_nm7(value);
			return;
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			rcv_schd_dt8(value);
			return;
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			rcv_mtd_cd8(value);
			return;
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			rcv_mtd_nm8(value);
			return;
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			rcv_schd_dt9(value);
			return;
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			rcv_mtd_cd9(value);
			return;
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			rcv_mtd_nm9(value);
			return;
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			rcv_schd_dt10(value);
			return;
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			rcv_mtd_cd10(value);
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($upri_unit_cd.equalsIgnoreCase(name)) {
			upri_unit_cd(value);
			return;
		}
		if ($tax_rate_ctg_per0.equalsIgnoreCase(name)) {
			tax_rate_ctg_per0(value);
			return;
		}
		if ($tax_rate_ctg_per8.equalsIgnoreCase(name)) {
			tax_rate_ctg_per8(value);
			return;
		}
		if ($tax_rate_ctg_per10.equalsIgnoreCase(name)) {
			tax_rate_ctg_per10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumber(name, value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
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
		if ($bill_co_cd.equalsIgnoreCase(name)) {
			bill_co_cd(value);
			return;
		}
		if ($bill_co_nm.equalsIgnoreCase(name)) {
			bill_co_nm(value);
			return;
		}
		if ($bill_co_ein.equalsIgnoreCase(name)) {
			bill_co_ein(value);
			return;
		}
		if ($bill_co_biz_co_no.equalsIgnoreCase(name)) {
			bill_co_biz_co_no(value);
			return;
		}
		if ($bill_co_zip_cd.equalsIgnoreCase(name)) {
			bill_co_zip_cd(value);
			return;
		}
		if ($bill_co_addr1.equalsIgnoreCase(name)) {
			bill_co_addr1(value);
			return;
		}
		if ($bill_co_addr2.equalsIgnoreCase(name)) {
			bill_co_addr2(value);
			return;
		}
		if ($bill_co_addr3.equalsIgnoreCase(name)) {
			bill_co_addr3(value);
			return;
		}
		if ($bill_co_addr4.equalsIgnoreCase(name)) {
			bill_co_addr4(value);
			return;
		}
		if ($bill_co_dpt.equalsIgnoreCase(name)) {
			bill_co_dpt(value);
			return;
		}
		if ($bill_co_tel.equalsIgnoreCase(name)) {
			bill_co_tel(value);
			return;
		}
		if ($bill_co_cntry_cd.equalsIgnoreCase(name)) {
			bill_co_cntry_cd(value);
			return;
		}
		if ($bill_rcpt_co_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_cd(value);
			return;
		}
		if ($bill_rcpt_co_nm.equalsIgnoreCase(name)) {
			bill_rcpt_co_nm(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_rcpt_co_ein.equalsIgnoreCase(name)) {
			bill_rcpt_co_ein(value);
			return;
		}
		if ($bill_rcpt_co_biz_co_no.equalsIgnoreCase(name)) {
			bill_rcpt_co_biz_co_no(value);
			return;
		}
		if ($bill_rcpt_co_zip_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_zip_cd(value);
			return;
		}
		if ($bill_rcpt_co_addr1.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr1(value);
			return;
		}
		if ($bill_rcpt_co_addr2.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr2(value);
			return;
		}
		if ($bill_rcpt_co_addr3.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr3(value);
			return;
		}
		if ($bill_rcpt_co_addr4.equalsIgnoreCase(name)) {
			bill_rcpt_co_addr4(value);
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
		if ($bill_rcpt_co_cntry_cd.equalsIgnoreCase(name)) {
			bill_rcpt_co_cntry_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($rcv_schd_dt1.equalsIgnoreCase(name)) {
			rcv_schd_dt1(value);
			return;
		}
		if ($rcv_mtd_cd1.equalsIgnoreCase(name)) {
			rcv_mtd_cd1(value);
			return;
		}
		if ($rcv_mtd_nm1.equalsIgnoreCase(name)) {
			rcv_mtd_nm1(value);
			return;
		}
		if ($rcv_schd_dt2.equalsIgnoreCase(name)) {
			rcv_schd_dt2(value);
			return;
		}
		if ($rcv_mtd_cd2.equalsIgnoreCase(name)) {
			rcv_mtd_cd2(value);
			return;
		}
		if ($rcv_mtd_nm2.equalsIgnoreCase(name)) {
			rcv_mtd_nm2(value);
			return;
		}
		if ($rcv_schd_dt3.equalsIgnoreCase(name)) {
			rcv_schd_dt3(value);
			return;
		}
		if ($rcv_mtd_cd3.equalsIgnoreCase(name)) {
			rcv_mtd_cd3(value);
			return;
		}
		if ($rcv_mtd_nm3.equalsIgnoreCase(name)) {
			rcv_mtd_nm3(value);
			return;
		}
		if ($rcv_schd_dt4.equalsIgnoreCase(name)) {
			rcv_schd_dt4(value);
			return;
		}
		if ($rcv_mtd_cd4.equalsIgnoreCase(name)) {
			rcv_mtd_cd4(value);
			return;
		}
		if ($rcv_mtd_nm4.equalsIgnoreCase(name)) {
			rcv_mtd_nm4(value);
			return;
		}
		if ($rcv_schd_dt5.equalsIgnoreCase(name)) {
			rcv_schd_dt5(value);
			return;
		}
		if ($rcv_mtd_cd5.equalsIgnoreCase(name)) {
			rcv_mtd_cd5(value);
			return;
		}
		if ($rcv_mtd_nm5.equalsIgnoreCase(name)) {
			rcv_mtd_nm5(value);
			return;
		}
		if ($rcv_schd_dt6.equalsIgnoreCase(name)) {
			rcv_schd_dt6(value);
			return;
		}
		if ($rcv_mtd_cd6.equalsIgnoreCase(name)) {
			rcv_mtd_cd6(value);
			return;
		}
		if ($rcv_mtd_nm6.equalsIgnoreCase(name)) {
			rcv_mtd_nm6(value);
			return;
		}
		if ($rcv_schd_dt7.equalsIgnoreCase(name)) {
			rcv_schd_dt7(value);
			return;
		}
		if ($rcv_mtd_cd7.equalsIgnoreCase(name)) {
			rcv_mtd_cd7(value);
			return;
		}
		if ($rcv_mtd_nm7.equalsIgnoreCase(name)) {
			rcv_mtd_nm7(value);
			return;
		}
		if ($rcv_schd_dt8.equalsIgnoreCase(name)) {
			rcv_schd_dt8(value);
			return;
		}
		if ($rcv_mtd_cd8.equalsIgnoreCase(name)) {
			rcv_mtd_cd8(value);
			return;
		}
		if ($rcv_mtd_nm8.equalsIgnoreCase(name)) {
			rcv_mtd_nm8(value);
			return;
		}
		if ($rcv_schd_dt9.equalsIgnoreCase(name)) {
			rcv_schd_dt9(value);
			return;
		}
		if ($rcv_mtd_cd9.equalsIgnoreCase(name)) {
			rcv_mtd_cd9(value);
			return;
		}
		if ($rcv_mtd_nm9.equalsIgnoreCase(name)) {
			rcv_mtd_nm9(value);
			return;
		}
		if ($rcv_schd_dt10.equalsIgnoreCase(name)) {
			rcv_schd_dt10(value);
			return;
		}
		if ($rcv_mtd_cd10.equalsIgnoreCase(name)) {
			rcv_mtd_cd10(value);
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		if ($upri_unit_cd.equalsIgnoreCase(name)) {
			upri_unit_cd(value);
			return;
		}
		if ($tax_rate_ctg_per0.equalsIgnoreCase(name)) {
			tax_rate_ctg_per0(value);
			return;
		}
		if ($tax_rate_ctg_per8.equalsIgnoreCase(name)) {
			tax_rate_ctg_per8(value);
			return;
		}
		if ($tax_rate_ctg_per10.equalsIgnoreCase(name)) {
			tax_rate_ctg_per10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
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
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($bill_paid_amt.equalsIgnoreCase(name)) {
			bill_paid_amt(value);
			return;
		}
		if ($bill_due_amt.equalsIgnoreCase(name)) {
			bill_due_amt(value);
			return;
		}
		if ($ttl_bill_amt.equalsIgnoreCase(name)) {
			ttl_bill_amt(value);
			return;
		}
		if ($sum_bill_amt_inc_tax.equalsIgnoreCase(name)) {
			sum_bill_amt_inc_tax(value);
			return;
		}
		if ($sum_bill_amt.equalsIgnoreCase(name)) {
			sum_bill_amt(value);
			return;
		}
		if ($tax_rate_sls_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per0(value);
			return;
		}
		if ($tax_rate_tax_amt_per0.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per0(value);
			return;
		}
		if ($tax_rate_sls_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per8(value);
			return;
		}
		if ($tax_rate_tax_amt_per8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per8(value);
			return;
		}
		if ($tax_rate_sls_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt_per10(value);
			return;
		}
		if ($tax_rate_tax_amt_per10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt_per10(value);
			return;
		}
		super.setNumberNE(name, value);
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
		super.setBooleanNE(name, value);
	}



}

