package mcframe.commonPFBB.PFBBR5100;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  .<p>
	 *
	 * コード
	 */
	public static final String $code = "code";
	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public static final String $name = "name";
	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public static final String $activeflag = "activeflag";
	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public static final String $searchcharacter = "searchcharacter";
	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public static final String $extension = "extension";
	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public static final String $corresptype = "corresptype";
	/**
	 *  .<p>
	 *
	 * 郵便番号
	 */
	public static final String $zip = "zip";
	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public static final String $address1 = "address1";
	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public static final String $address2 = "address2";
	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public static final String $tel1 = "tel1";
	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public static final String $tel2 = "tel2";
	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public static final String $fax = "fax";
	/**
	 *  .<p>
	 *
	 * 地域
	 */
	public static final String $regioncode = "regioncode";
	/**
	 *  .<p>
	 *
	 * 取引先口座
	 */
	public static final String $bankacctcode = "bankacctcode";
	/**
	 *  .<p>
	 *
	 * ｾｸﾞﾒﾝﾄｺｰﾄﾞ
	 */
	public static final String $segmentcode = "segmentcode";
	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public static final String $creditlimitflag = "creditlimitflag";
	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public static final String $sal_vatsummaryset = "sal_vatsummaryset";
	/**
	 *  .<p>
	 *
	 * 販売-課税区分
	 */
	public static final String $sal_taxabletypecode = "sal_taxabletypecode";
	/**
	 *  .<p>
	 *
	 * 販売-通貨
	 */
	public static final String $sal_currencycode = "sal_currencycode";
	/**
	 *  .<p>
	 *
	 * 販売-ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $sal_ratetypecode = "sal_ratetypecode";
	/**
	 *  .<p>
	 *
	 * 販売-債権ﾊﾟﾀｰﾝ
	 */
	public static final String $sal_ar_patterncode = "sal_ar_patterncode";
	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public static final String $sal_closingdate = "sal_closingdate";
	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public static final String $sal_workingdayset = "sal_workingdayset";
	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public static final String $sal_monthlymargin = "sal_monthlymargin";
	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public static final String $collectdate = "collectdate";
	/**
	 *  .<p>
	 *
	 * 販売-納品先
	 */
	public static final String $delivtocode = "delivtocode";
	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public static final String $sal_mo_invoiceflag = "sal_mo_invoiceflag";
	/**
	 *  .<p>
	 *
	 * 販売-債権決済方法
	 */
	public static final String $ar_settlemethod = "ar_settlemethod";
	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public static final String $sal_forcondition = "sal_forcondition";
	/**
	 *  .<p>
	 *
	 * 販売-回収条件
	 */
	public static final String $receivableterms = "receivableterms";
	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public static final String $sal_valueflag = "sal_valueflag";
	/**
	 *  .<p>
	 *
	 * 販売-前受ﾊﾟﾀｰﾝ
	 */
	public static final String $sal_ad_patterncode = "sal_ad_patterncode";
	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public static final String $sal_settle_discountday = "sal_settle_discountday";
	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public static final String $sal_settle_discountrate = "sal_settle_discountrate";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ1
	 */
	public static final String $flexmaster1 = "flexmaster1";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ2
	 */
	public static final String $flexmaster2 = "flexmaster2";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ3
	 */
	public static final String $flexmaster3 = "flexmaster3";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ4
	 */
	public static final String $flexmaster4 = "flexmaster4";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ5
	 */
	public static final String $flexmaster5 = "flexmaster5";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public static final String $flextext1 = "flextext1";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public static final String $flextext2 = "flextext2";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public static final String $flextext3 = "flextext3";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public static final String $flextext4 = "flextext4";
	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public static final String $flextext5 = "flextext5";
	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public static final String $h_usermaster = "h_usermaster";
	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public static final String $h_usertext = "h_usertext";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public static final String $h_flexmaster1_ar = "h_flexmaster1_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public static final String $h_flexmaster2_ar = "h_flexmaster2_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public static final String $h_flexcode1_ar = "h_flexcode1_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public static final String $h_flexcode2_ar = "h_flexcode2_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public static final String $h_flextext1_ar = "h_flextext1_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public static final String $h_flextext2_ar = "h_flextext2_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public static final String $h_flextext3_ar = "h_flextext3_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public static final String $h_flextext4_ar = "h_flextext4_ar";
	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public static final String $h_flextext5_ar = "h_flextext5_ar";
	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public static final String $pur_vatsummaryset = "pur_vatsummaryset";
	/**
	 *  .<p>
	 *
	 * 購買-課税区分
	 */
	public static final String $pur_taxabletypecode = "pur_taxabletypecode";
	/**
	 *  .<p>
	 *
	 * 購買-通貨
	 */
	public static final String $pur_currencycode = "pur_currencycode";
	/**
	 *  .<p>
	 *
	 * 購買-ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $pur_ratetypecode = "pur_ratetypecode";
	/**
	 *  .<p>
	 *
	 * 購買-債務ﾊﾟﾀｰﾝ
	 */
	public static final String $pur_ap_patterncode = "pur_ap_patterncode";
	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public static final String $pur_closingdate = "pur_closingdate";
	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public static final String $pur_workingdayset = "pur_workingdayset";
	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public static final String $pur_monthlymargin = "pur_monthlymargin";
	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public static final String $paymentdate = "paymentdate";
	/**
	 *  .<p>
	 *
	 * 購買-納入元
	 */
	public static final String $delivfromcode = "delivfromcode";
	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public static final String $pur_mo_invoiceflag = "pur_mo_invoiceflag";
	/**
	 *  .<p>
	 *
	 * 購買-債務決済方法
	 */
	public static final String $ap_settlemethod = "ap_settlemethod";
	/**
	 *  .<p>
	 *
	 * 購買-支払条件
	 */
	public static final String $paymentterms = "paymentterms";
	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public static final String $pur_valueflag = "pur_valueflag";
	/**
	 *  .<p>
	 *
	 * 購買-前払ﾊﾟﾀｰﾝ
	 */
	public static final String $pur_ad_patterncode = "pur_ad_patterncode";
	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public static final String $pur_settle_discountday = "pur_settle_discountday";
	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public static final String $pur_settle_discountrate = "pur_settle_discountrate";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public static final String $h_flexmaster1_ap = "h_flexmaster1_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public static final String $h_flexmaster2_ap = "h_flexmaster2_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public static final String $h_flexcode1_ap = "h_flexcode1_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public static final String $h_flexcode2_ap = "h_flexcode2_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public static final String $h_flextext1_ap = "h_flextext1_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public static final String $h_flextext2_ap = "h_flextext2_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public static final String $h_flextext3_ap = "h_flextext3_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public static final String $h_flextext4_ap = "h_flextext4_ap";
	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public static final String $h_flextext5_ap = "h_flextext5_ap";
	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public static final String $commission_pay = "commission_pay";
	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public static final String $iraicode = "iraicode";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public static final String $h_flexmaster1_inv = "h_flexmaster1_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public static final String $h_flexmaster2_inv = "h_flexmaster2_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public static final String $h_flexcode1_inv = "h_flexcode1_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public static final String $h_flexcode2_inv = "h_flexcode2_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public static final String $h_flextext1_inv = "h_flextext1_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public static final String $h_flextext2_inv = "h_flextext2_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public static final String $h_flextext3_inv = "h_flextext3_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public static final String $h_flextext4_inv = "h_flextext4_inv";
	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public static final String $h_flextext5_inv = "h_flextext5_inv";
	/**
	 *  .<p>
	 *
	 * E-mailアドレス
	 */
	public static final String $email = "email";
	/**
	 *  .<p>
	 *
	 * 税ID
	 */
	public static final String $taxid = "taxid";
	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public static final String $overdueextensionaldays = "overdueextensionaldays";
	/**
	 *  .<p>
	 *
	 * E-mail(Cc)
	 */
	public static final String $email_cc = "email_cc";
	/**
	 *  .<p>
	 *
	 * 税ID2
	 */
	public static final String $taxid2 = "taxid2";
	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public static final String $linkageflag = "linkageflag";
	/**
	 *  .<p>
	 *
	 * 外部連携コード
	 */
	public static final String $linkagecode = "linkagecode";
	/**
	 *  .<p>
	 *
	 * 外部連携URL
	 */
	public static final String $linkageurl = "linkageurl";


	public static final MCMeta code_META = createStringMeta($code, 20);
	public static final MCMeta name_META = createStringMeta($name, 100);
	public static final MCMeta activeflag_META = createNumberMeta($activeflag, 1, 0, false);
	public static final MCMeta searchcharacter_META = createStringMeta($searchcharacter, 1);
	public static final MCMeta extension_META = createStringMeta($extension, 2);
	public static final MCMeta corresptype_META = createNumberMeta($corresptype, 1, 0, false);
	public static final MCMeta zip_META = createStringMeta($zip, 50);
	public static final MCMeta address1_META = createStringMeta($address1, 250);
	public static final MCMeta address2_META = createStringMeta($address2, 250);
	public static final MCMeta tel1_META = createStringMeta($tel1, 50);
	public static final MCMeta tel2_META = createStringMeta($tel2, 50);
	public static final MCMeta fax_META = createStringMeta($fax, 50);
	public static final MCMeta regioncode_META = createStringMeta($regioncode, 20);
	public static final MCMeta bankacctcode_META = createStringMeta($bankacctcode, 20);
	public static final MCMeta segmentcode_META = createStringMeta($segmentcode, 20);
	public static final MCMeta creditlimitflag_META = createNumberMeta($creditlimitflag, 1, 0, false);
	public static final MCMeta sal_vatsummaryset_META = createNumberMeta($sal_vatsummaryset, 1, 0, false);
	public static final MCMeta sal_taxabletypecode_META = createStringMeta($sal_taxabletypecode, 20);
	public static final MCMeta sal_currencycode_META = createStringMeta($sal_currencycode, 20);
	public static final MCMeta sal_ratetypecode_META = createStringMeta($sal_ratetypecode, 20);
	public static final MCMeta sal_ar_patterncode_META = createStringMeta($sal_ar_patterncode, 20);
	public static final MCMeta sal_closingdate_META = createNumberMeta($sal_closingdate, 2, 0, false);
	public static final MCMeta sal_workingdayset_META = createNumberMeta($sal_workingdayset, 1, 0, false);
	public static final MCMeta sal_monthlymargin_META = createNumberMeta($sal_monthlymargin, 2, 0, false);
	public static final MCMeta collectdate_META = createNumberMeta($collectdate, 2, 0, false);
	public static final MCMeta delivtocode_META = createStringMeta($delivtocode, 20);
	public static final MCMeta sal_mo_invoiceflag_META = createNumberMeta($sal_mo_invoiceflag, 1, 0, false);
	public static final MCMeta ar_settlemethod_META = createStringMeta($ar_settlemethod, 20);
	public static final MCMeta sal_forcondition_META = createNumberMeta($sal_forcondition, 1, 0, false);
	public static final MCMeta receivableterms_META = createStringMeta($receivableterms, 100);
	public static final MCMeta sal_valueflag_META = createNumberMeta($sal_valueflag, 1, 0, false);
	public static final MCMeta sal_ad_patterncode_META = createStringMeta($sal_ad_patterncode, 20);
	public static final MCMeta sal_settle_discountday_META = createNumberMeta($sal_settle_discountday, 3, 0, false);
	public static final MCMeta sal_settle_discountrate_META = createNumberMeta($sal_settle_discountrate, 5, 4, false);
	public static final MCMeta flexmaster1_META = createStringMeta($flexmaster1, 20);
	public static final MCMeta flexmaster2_META = createStringMeta($flexmaster2, 20);
	public static final MCMeta flexmaster3_META = createStringMeta($flexmaster3, 20);
	public static final MCMeta flexmaster4_META = createStringMeta($flexmaster4, 20);
	public static final MCMeta flexmaster5_META = createStringMeta($flexmaster5, 20);
	public static final MCMeta flextext1_META = createStringMeta($flextext1, 100);
	public static final MCMeta flextext2_META = createStringMeta($flextext2, 100);
	public static final MCMeta flextext3_META = createStringMeta($flextext3, 100);
	public static final MCMeta flextext4_META = createStringMeta($flextext4, 100);
	public static final MCMeta flextext5_META = createStringMeta($flextext5, 100);
	public static final MCMeta h_usermaster_META = createStringMeta($h_usermaster, 20);
	public static final MCMeta h_usertext_META = createStringMeta($h_usertext, 100);
	public static final MCMeta h_flexmaster1_ar_META = createStringMeta($h_flexmaster1_ar, 20);
	public static final MCMeta h_flexmaster2_ar_META = createStringMeta($h_flexmaster2_ar, 20);
	public static final MCMeta h_flexcode1_ar_META = createStringMeta($h_flexcode1_ar, 20);
	public static final MCMeta h_flexcode2_ar_META = createStringMeta($h_flexcode2_ar, 20);
	public static final MCMeta h_flextext1_ar_META = createStringMeta($h_flextext1_ar, 100);
	public static final MCMeta h_flextext2_ar_META = createStringMeta($h_flextext2_ar, 100);
	public static final MCMeta h_flextext3_ar_META = createStringMeta($h_flextext3_ar, 100);
	public static final MCMeta h_flextext4_ar_META = createStringMeta($h_flextext4_ar, 100);
	public static final MCMeta h_flextext5_ar_META = createStringMeta($h_flextext5_ar, 100);
	public static final MCMeta pur_vatsummaryset_META = createNumberMeta($pur_vatsummaryset, 1, 0, false);
	public static final MCMeta pur_taxabletypecode_META = createStringMeta($pur_taxabletypecode, 20);
	public static final MCMeta pur_currencycode_META = createStringMeta($pur_currencycode, 20);
	public static final MCMeta pur_ratetypecode_META = createStringMeta($pur_ratetypecode, 20);
	public static final MCMeta pur_ap_patterncode_META = createStringMeta($pur_ap_patterncode, 20);
	public static final MCMeta pur_closingdate_META = createNumberMeta($pur_closingdate, 2, 0, false);
	public static final MCMeta pur_workingdayset_META = createNumberMeta($pur_workingdayset, 1, 0, false);
	public static final MCMeta pur_monthlymargin_META = createNumberMeta($pur_monthlymargin, 2, 0, false);
	public static final MCMeta paymentdate_META = createNumberMeta($paymentdate, 2, 0, false);
	public static final MCMeta delivfromcode_META = createStringMeta($delivfromcode, 20);
	public static final MCMeta pur_mo_invoiceflag_META = createNumberMeta($pur_mo_invoiceflag, 1, 0, false);
	public static final MCMeta ap_settlemethod_META = createStringMeta($ap_settlemethod, 20);
	public static final MCMeta paymentterms_META = createStringMeta($paymentterms, 100);
	public static final MCMeta pur_valueflag_META = createNumberMeta($pur_valueflag, 1, 0, false);
	public static final MCMeta pur_ad_patterncode_META = createStringMeta($pur_ad_patterncode, 20);
	public static final MCMeta pur_settle_discountday_META = createNumberMeta($pur_settle_discountday, 3, 0, false);
	public static final MCMeta pur_settle_discountrate_META = createNumberMeta($pur_settle_discountrate, 5, 4, false);
	public static final MCMeta h_flexmaster1_ap_META = createNumberMeta($h_flexmaster1_ap, 20, 0, false);
	public static final MCMeta h_flexmaster2_ap_META = createStringMeta($h_flexmaster2_ap, 20);
	public static final MCMeta h_flexcode1_ap_META = createStringMeta($h_flexcode1_ap, 20);
	public static final MCMeta h_flexcode2_ap_META = createStringMeta($h_flexcode2_ap, 20);
	public static final MCMeta h_flextext1_ap_META = createStringMeta($h_flextext1_ap, 100);
	public static final MCMeta h_flextext2_ap_META = createStringMeta($h_flextext2_ap, 100);
	public static final MCMeta h_flextext3_ap_META = createStringMeta($h_flextext3_ap, 100);
	public static final MCMeta h_flextext4_ap_META = createStringMeta($h_flextext4_ap, 100);
	public static final MCMeta h_flextext5_ap_META = createStringMeta($h_flextext5_ap, 100);
	public static final MCMeta commission_pay_META = createNumberMeta($commission_pay, 1, 0, false);
	public static final MCMeta iraicode_META = createStringMeta($iraicode, 60);
	public static final MCMeta h_flexmaster1_inv_META = createNumberMeta($h_flexmaster1_inv, 20, 0, false);
	public static final MCMeta h_flexmaster2_inv_META = createStringMeta($h_flexmaster2_inv, 20);
	public static final MCMeta h_flexcode1_inv_META = createStringMeta($h_flexcode1_inv, 100);
	public static final MCMeta h_flexcode2_inv_META = createStringMeta($h_flexcode2_inv, 100);
	public static final MCMeta h_flextext1_inv_META = createStringMeta($h_flextext1_inv, 100);
	public static final MCMeta h_flextext2_inv_META = createStringMeta($h_flextext2_inv, 100);
	public static final MCMeta h_flextext3_inv_META = createStringMeta($h_flextext3_inv, 100);
	public static final MCMeta h_flextext4_inv_META = createStringMeta($h_flextext4_inv, 100);
	public static final MCMeta h_flextext5_inv_META = createStringMeta($h_flextext5_inv, 100);
	public static final MCMeta email_META = createStringMeta($email, 100);
	public static final MCMeta taxid_META = createStringMeta($taxid, 20);
	public static final MCMeta overdueextensionaldays_META = createNumberMeta($overdueextensionaldays, 3, 0, false);
	public static final MCMeta email_cc_META = createStringMeta($email_cc, 250);
	public static final MCMeta taxid2_META = createStringMeta($taxid2, 20);
	public static final MCMeta linkageflag_META = createNumberMeta($linkageflag, 1, 0, false);
	public static final MCMeta linkagecode_META = createStringMeta($linkagecode, 100);
	public static final MCMeta linkageurl_META = createStringMeta($linkageurl, 1000);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			code_META,
			name_META,
			activeflag_META,
			searchcharacter_META,
			extension_META,
			corresptype_META,
			zip_META,
			address1_META,
			address2_META,
			tel1_META,
			tel2_META,
			fax_META,
			regioncode_META,
			bankacctcode_META,
			segmentcode_META,
			creditlimitflag_META,
			sal_vatsummaryset_META,
			sal_taxabletypecode_META,
			sal_currencycode_META,
			sal_ratetypecode_META,
			sal_ar_patterncode_META,
			sal_closingdate_META,
			sal_workingdayset_META,
			sal_monthlymargin_META,
			collectdate_META,
			delivtocode_META,
			sal_mo_invoiceflag_META,
			ar_settlemethod_META,
			sal_forcondition_META,
			receivableterms_META,
			sal_valueflag_META,
			sal_ad_patterncode_META,
			sal_settle_discountday_META,
			sal_settle_discountrate_META,
			flexmaster1_META,
			flexmaster2_META,
			flexmaster3_META,
			flexmaster4_META,
			flexmaster5_META,
			flextext1_META,
			flextext2_META,
			flextext3_META,
			flextext4_META,
			flextext5_META,
			h_usermaster_META,
			h_usertext_META,
			h_flexmaster1_ar_META,
			h_flexmaster2_ar_META,
			h_flexcode1_ar_META,
			h_flexcode2_ar_META,
			h_flextext1_ar_META,
			h_flextext2_ar_META,
			h_flextext3_ar_META,
			h_flextext4_ar_META,
			h_flextext5_ar_META,
			pur_vatsummaryset_META,
			pur_taxabletypecode_META,
			pur_currencycode_META,
			pur_ratetypecode_META,
			pur_ap_patterncode_META,
			pur_closingdate_META,
			pur_workingdayset_META,
			pur_monthlymargin_META,
			paymentdate_META,
			delivfromcode_META,
			pur_mo_invoiceflag_META,
			ap_settlemethod_META,
			paymentterms_META,
			pur_valueflag_META,
			pur_ad_patterncode_META,
			pur_settle_discountday_META,
			pur_settle_discountrate_META,
			h_flexmaster1_ap_META,
			h_flexmaster2_ap_META,
			h_flexcode1_ap_META,
			h_flexcode2_ap_META,
			h_flextext1_ap_META,
			h_flextext2_ap_META,
			h_flextext3_ap_META,
			h_flextext4_ap_META,
			h_flextext5_ap_META,
			commission_pay_META,
			iraicode_META,
			h_flexmaster1_inv_META,
			h_flexmaster2_inv_META,
			h_flexcode1_inv_META,
			h_flexcode2_inv_META,
			h_flextext1_inv_META,
			h_flextext2_inv_META,
			h_flextext3_inv_META,
			h_flextext4_inv_META,
			h_flextext5_inv_META,
			email_META,
			taxid_META,
			overdueextensionaldays_META,
			email_cc_META,
			taxid2_META,
			linkageflag_META,
			linkagecode_META,
			linkageurl_META
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  .<p>
	 *
	 * コード
	 */
	public String code() {
		return getConstString(offset + 0, $code);
	}

	/**
	 *  .<p>
	 *
	 * コード
	 */
	public void code(String value) {
		setConstString(offset + 0, $code, value);
	}


	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public String name() {
		return getConstString(offset + 1, $name);
	}

	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public void name(String value) {
		setConstString(offset + 1, $name, value);
	}


	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public MCNumber activeflag() {
		return getConstNumber(offset + 2, $activeflag);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(MCNumber value) {
		setConstNumber(offset + 2, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(int value) {
		setConstNumber(offset + 2, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(long value) {
		setConstNumber(offset + 2, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(float value) {
		setConstNumber(offset + 2, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(double value) {
		setConstNumber(offset + 2, $activeflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public String searchcharacter() {
		return getConstString(offset + 3, $searchcharacter);
	}

	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public void searchcharacter(String value) {
		setConstString(offset + 3, $searchcharacter, value);
	}


	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public String extension() {
		return getConstString(offset + 4, $extension);
	}

	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public void extension(String value) {
		setConstString(offset + 4, $extension, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public MCNumber corresptype() {
		return getConstNumber(offset + 5, $corresptype);
	}

	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public void corresptype(MCNumber value) {
		setConstNumber(offset + 5, $corresptype, value);
	}

	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public void corresptype(int value) {
		setConstNumber(offset + 5, $corresptype, value);
	}

	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public void corresptype(long value) {
		setConstNumber(offset + 5, $corresptype, value);
	}

	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public void corresptype(float value) {
		setConstNumber(offset + 5, $corresptype, value);
	}

	/**
	 *  .<p>
	 *
	 * 取引先区分
	 */
	public void corresptype(double value) {
		setConstNumber(offset + 5, $corresptype, value);
	}


	/**
	 *  .<p>
	 *
	 * 郵便番号
	 */
	public String zip() {
		return getConstString(offset + 6, $zip);
	}

	/**
	 *  .<p>
	 *
	 * 郵便番号
	 */
	public void zip(String value) {
		setConstString(offset + 6, $zip, value);
	}


	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public String address1() {
		return getConstString(offset + 7, $address1);
	}

	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public void address1(String value) {
		setConstString(offset + 7, $address1, value);
	}


	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public String address2() {
		return getConstString(offset + 8, $address2);
	}

	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public void address2(String value) {
		setConstString(offset + 8, $address2, value);
	}


	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public String tel1() {
		return getConstString(offset + 9, $tel1);
	}

	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public void tel1(String value) {
		setConstString(offset + 9, $tel1, value);
	}


	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public String tel2() {
		return getConstString(offset + 10, $tel2);
	}

	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public void tel2(String value) {
		setConstString(offset + 10, $tel2, value);
	}


	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public String fax() {
		return getConstString(offset + 11, $fax);
	}

	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public void fax(String value) {
		setConstString(offset + 11, $fax, value);
	}


	/**
	 *  .<p>
	 *
	 * 地域
	 */
	public String regioncode() {
		return getConstString(offset + 12, $regioncode);
	}

	/**
	 *  .<p>
	 *
	 * 地域
	 */
	public void regioncode(String value) {
		setConstString(offset + 12, $regioncode, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引先口座
	 */
	public String bankacctcode() {
		return getConstString(offset + 13, $bankacctcode);
	}

	/**
	 *  .<p>
	 *
	 * 取引先口座
	 */
	public void bankacctcode(String value) {
		setConstString(offset + 13, $bankacctcode, value);
	}


	/**
	 *  .<p>
	 *
	 * ｾｸﾞﾒﾝﾄｺｰﾄﾞ
	 */
	public String segmentcode() {
		return getConstString(offset + 14, $segmentcode);
	}

	/**
	 *  .<p>
	 *
	 * ｾｸﾞﾒﾝﾄｺｰﾄﾞ
	 */
	public void segmentcode(String value) {
		setConstString(offset + 14, $segmentcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public MCNumber creditlimitflag() {
		return getConstNumber(offset + 15, $creditlimitflag);
	}

	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public void creditlimitflag(MCNumber value) {
		setConstNumber(offset + 15, $creditlimitflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public void creditlimitflag(int value) {
		setConstNumber(offset + 15, $creditlimitflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public void creditlimitflag(long value) {
		setConstNumber(offset + 15, $creditlimitflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public void creditlimitflag(float value) {
		setConstNumber(offset + 15, $creditlimitflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 与信限度額管理
	 */
	public void creditlimitflag(double value) {
		setConstNumber(offset + 15, $creditlimitflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public MCNumber sal_vatsummaryset() {
		return getConstNumber(offset + 16, $sal_vatsummaryset);
	}

	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public void sal_vatsummaryset(MCNumber value) {
		setConstNumber(offset + 16, $sal_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public void sal_vatsummaryset(int value) {
		setConstNumber(offset + 16, $sal_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public void sal_vatsummaryset(long value) {
		setConstNumber(offset + 16, $sal_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public void sal_vatsummaryset(float value) {
		setConstNumber(offset + 16, $sal_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-付加価値税集計単位
	 */
	public void sal_vatsummaryset(double value) {
		setConstNumber(offset + 16, $sal_vatsummaryset, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-課税区分
	 */
	public String sal_taxabletypecode() {
		return getConstString(offset + 17, $sal_taxabletypecode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-課税区分
	 */
	public void sal_taxabletypecode(String value) {
		setConstString(offset + 17, $sal_taxabletypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-通貨
	 */
	public String sal_currencycode() {
		return getConstString(offset + 18, $sal_currencycode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-通貨
	 */
	public void sal_currencycode(String value) {
		setConstString(offset + 18, $sal_currencycode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-ﾚｰﾄﾀｲﾌﾟ
	 */
	public String sal_ratetypecode() {
		return getConstString(offset + 19, $sal_ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-ﾚｰﾄﾀｲﾌﾟ
	 */
	public void sal_ratetypecode(String value) {
		setConstString(offset + 19, $sal_ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-債権ﾊﾟﾀｰﾝ
	 */
	public String sal_ar_patterncode() {
		return getConstString(offset + 20, $sal_ar_patterncode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-債権ﾊﾟﾀｰﾝ
	 */
	public void sal_ar_patterncode(String value) {
		setConstString(offset + 20, $sal_ar_patterncode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public MCNumber sal_closingdate() {
		return getConstNumber(offset + 21, $sal_closingdate);
	}

	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public void sal_closingdate(MCNumber value) {
		setConstNumber(offset + 21, $sal_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public void sal_closingdate(int value) {
		setConstNumber(offset + 21, $sal_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public void sal_closingdate(long value) {
		setConstNumber(offset + 21, $sal_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public void sal_closingdate(float value) {
		setConstNumber(offset + 21, $sal_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-締日
	 */
	public void sal_closingdate(double value) {
		setConstNumber(offset + 21, $sal_closingdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public MCNumber sal_workingdayset() {
		return getConstNumber(offset + 22, $sal_workingdayset);
	}

	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public void sal_workingdayset(MCNumber value) {
		setConstNumber(offset + 22, $sal_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public void sal_workingdayset(int value) {
		setConstNumber(offset + 22, $sal_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public void sal_workingdayset(long value) {
		setConstNumber(offset + 22, $sal_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public void sal_workingdayset(float value) {
		setConstNumber(offset + 22, $sal_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-決済予定日休日時調整
	 */
	public void sal_workingdayset(double value) {
		setConstNumber(offset + 22, $sal_workingdayset, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public MCNumber sal_monthlymargin() {
		return getConstNumber(offset + 23, $sal_monthlymargin);
	}

	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public void sal_monthlymargin(MCNumber value) {
		setConstNumber(offset + 23, $sal_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public void sal_monthlymargin(int value) {
		setConstNumber(offset + 23, $sal_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public void sal_monthlymargin(long value) {
		setConstNumber(offset + 23, $sal_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public void sal_monthlymargin(float value) {
		setConstNumber(offset + 23, $sal_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-差月
	 */
	public void sal_monthlymargin(double value) {
		setConstNumber(offset + 23, $sal_monthlymargin, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public MCNumber collectdate() {
		return getConstNumber(offset + 24, $collectdate);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public void collectdate(MCNumber value) {
		setConstNumber(offset + 24, $collectdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public void collectdate(int value) {
		setConstNumber(offset + 24, $collectdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public void collectdate(long value) {
		setConstNumber(offset + 24, $collectdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public void collectdate(float value) {
		setConstNumber(offset + 24, $collectdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収日
	 */
	public void collectdate(double value) {
		setConstNumber(offset + 24, $collectdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-納品先
	 */
	public String delivtocode() {
		return getConstString(offset + 25, $delivtocode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-納品先
	 */
	public void delivtocode(String value) {
		setConstString(offset + 25, $delivtocode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public MCNumber sal_mo_invoiceflag() {
		return getConstNumber(offset + 26, $sal_mo_invoiceflag);
	}

	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public void sal_mo_invoiceflag(MCNumber value) {
		setConstNumber(offset + 26, $sal_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public void sal_mo_invoiceflag(int value) {
		setConstNumber(offset + 26, $sal_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public void sal_mo_invoiceflag(long value) {
		setConstNumber(offset + 26, $sal_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public void sal_mo_invoiceflag(float value) {
		setConstNumber(offset + 26, $sal_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-月締請求書作成対象
	 */
	public void sal_mo_invoiceflag(double value) {
		setConstNumber(offset + 26, $sal_mo_invoiceflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-債権決済方法
	 */
	public String ar_settlemethod() {
		return getConstString(offset + 27, $ar_settlemethod);
	}

	/**
	 *  .<p>
	 *
	 * 販売-債権決済方法
	 */
	public void ar_settlemethod(String value) {
		setConstString(offset + 27, $ar_settlemethod, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public MCNumber sal_forcondition() {
		return getConstNumber(offset + 28, $sal_forcondition);
	}

	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public void sal_forcondition(MCNumber value) {
		setConstNumber(offset + 28, $sal_forcondition, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public void sal_forcondition(int value) {
		setConstNumber(offset + 28, $sal_forcondition, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public void sal_forcondition(long value) {
		setConstNumber(offset + 28, $sal_forcondition, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public void sal_forcondition(float value) {
		setConstNumber(offset + 28, $sal_forcondition, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-出荷数量条件
	 */
	public void sal_forcondition(double value) {
		setConstNumber(offset + 28, $sal_forcondition, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-回収条件
	 */
	public String receivableterms() {
		return getConstString(offset + 29, $receivableterms);
	}

	/**
	 *  .<p>
	 *
	 * 販売-回収条件
	 */
	public void receivableterms(String value) {
		setConstString(offset + 29, $receivableterms, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public MCNumber sal_valueflag() {
		return getConstNumber(offset + 30, $sal_valueflag);
	}

	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public void sal_valueflag(MCNumber value) {
		setConstNumber(offset + 30, $sal_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public void sal_valueflag(int value) {
		setConstNumber(offset + 30, $sal_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public void sal_valueflag(long value) {
		setConstNumber(offset + 30, $sal_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public void sal_valueflag(float value) {
		setConstNumber(offset + 30, $sal_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-超過数量
	 */
	public void sal_valueflag(double value) {
		setConstNumber(offset + 30, $sal_valueflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-前受ﾊﾟﾀｰﾝ
	 */
	public String sal_ad_patterncode() {
		return getConstString(offset + 31, $sal_ad_patterncode);
	}

	/**
	 *  .<p>
	 *
	 * 販売-前受ﾊﾟﾀｰﾝ
	 */
	public void sal_ad_patterncode(String value) {
		setConstString(offset + 31, $sal_ad_patterncode, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public MCNumber sal_settle_discountday() {
		return getConstNumber(offset + 32, $sal_settle_discountday);
	}

	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public void sal_settle_discountday(MCNumber value) {
		setConstNumber(offset + 32, $sal_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public void sal_settle_discountday(int value) {
		setConstNumber(offset + 32, $sal_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public void sal_settle_discountday(long value) {
		setConstNumber(offset + 32, $sal_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public void sal_settle_discountday(float value) {
		setConstNumber(offset + 32, $sal_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-割引適用日数
	 */
	public void sal_settle_discountday(double value) {
		setConstNumber(offset + 32, $sal_settle_discountday, value);
	}


	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public MCNumber sal_settle_discountrate() {
		return getConstNumber(offset + 33, $sal_settle_discountrate);
	}

	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public void sal_settle_discountrate(MCNumber value) {
		setConstNumber(offset + 33, $sal_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public void sal_settle_discountrate(int value) {
		setConstNumber(offset + 33, $sal_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public void sal_settle_discountrate(long value) {
		setConstNumber(offset + 33, $sal_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public void sal_settle_discountrate(float value) {
		setConstNumber(offset + 33, $sal_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 販売-消込金額割引率
	 */
	public void sal_settle_discountrate(double value) {
		setConstNumber(offset + 33, $sal_settle_discountrate, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ1
	 */
	public String flexmaster1() {
		return getConstString(offset + 34, $flexmaster1);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void flexmaster1(String value) {
		setConstString(offset + 34, $flexmaster1, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ2
	 */
	public String flexmaster2() {
		return getConstString(offset + 35, $flexmaster2);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ2
	 */
	public void flexmaster2(String value) {
		setConstString(offset + 35, $flexmaster2, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ3
	 */
	public String flexmaster3() {
		return getConstString(offset + 36, $flexmaster3);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ3
	 */
	public void flexmaster3(String value) {
		setConstString(offset + 36, $flexmaster3, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ4
	 */
	public String flexmaster4() {
		return getConstString(offset + 37, $flexmaster4);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ4
	 */
	public void flexmaster4(String value) {
		setConstString(offset + 37, $flexmaster4, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ5
	 */
	public String flexmaster5() {
		return getConstString(offset + 38, $flexmaster5);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾏｽﾀ5
	 */
	public void flexmaster5(String value) {
		setConstString(offset + 38, $flexmaster5, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public String flextext1() {
		return getConstString(offset + 39, $flextext1);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public void flextext1(String value) {
		setConstString(offset + 39, $flextext1, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public String flextext2() {
		return getConstString(offset + 40, $flextext2);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public void flextext2(String value) {
		setConstString(offset + 40, $flextext2, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public String flextext3() {
		return getConstString(offset + 41, $flextext3);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public void flextext3(String value) {
		setConstString(offset + 41, $flextext3, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public String flextext4() {
		return getConstString(offset + 42, $flextext4);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public void flextext4(String value) {
		setConstString(offset + 42, $flextext4, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public String flextext5() {
		return getConstString(offset + 43, $flextext5);
	}

	/**
	 *  .<p>
	 *
	 * ﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public void flextext5(String value) {
		setConstString(offset + 43, $flextext5, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public String h_usermaster() {
		return getConstString(offset + 44, $h_usermaster);
	}

	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public void h_usermaster(String value) {
		setConstString(offset + 44, $h_usermaster, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public String h_usertext() {
		return getConstString(offset + 45, $h_usertext);
	}

	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public void h_usertext(String value) {
		setConstString(offset + 45, $h_usertext, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public String h_flexmaster1_ar() {
		return getConstString(offset + 46, $h_flexmaster1_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ar(String value) {
		setConstString(offset + 46, $h_flexmaster1_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public String h_flexmaster2_ar() {
		return getConstString(offset + 47, $h_flexmaster2_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public void h_flexmaster2_ar(String value) {
		setConstString(offset + 47, $h_flexmaster2_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public String h_flexcode1_ar() {
		return getConstString(offset + 48, $h_flexcode1_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public void h_flexcode1_ar(String value) {
		setConstString(offset + 48, $h_flexcode1_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public String h_flexcode2_ar() {
		return getConstString(offset + 49, $h_flexcode2_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public void h_flexcode2_ar(String value) {
		setConstString(offset + 49, $h_flexcode2_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public String h_flextext1_ar() {
		return getConstString(offset + 50, $h_flextext1_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public void h_flextext1_ar(String value) {
		setConstString(offset + 50, $h_flextext1_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public String h_flextext2_ar() {
		return getConstString(offset + 51, $h_flextext2_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public void h_flextext2_ar(String value) {
		setConstString(offset + 51, $h_flextext2_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public String h_flextext3_ar() {
		return getConstString(offset + 52, $h_flextext3_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public void h_flextext3_ar(String value) {
		setConstString(offset + 52, $h_flextext3_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public String h_flextext4_ar() {
		return getConstString(offset + 53, $h_flextext4_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public void h_flextext4_ar(String value) {
		setConstString(offset + 53, $h_flextext4_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public String h_flextext5_ar() {
		return getConstString(offset + 54, $h_flextext5_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public void h_flextext5_ar(String value) {
		setConstString(offset + 54, $h_flextext5_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public MCNumber pur_vatsummaryset() {
		return getConstNumber(offset + 55, $pur_vatsummaryset);
	}

	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public void pur_vatsummaryset(MCNumber value) {
		setConstNumber(offset + 55, $pur_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public void pur_vatsummaryset(int value) {
		setConstNumber(offset + 55, $pur_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public void pur_vatsummaryset(long value) {
		setConstNumber(offset + 55, $pur_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public void pur_vatsummaryset(float value) {
		setConstNumber(offset + 55, $pur_vatsummaryset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-付加価値税集計単位
	 */
	public void pur_vatsummaryset(double value) {
		setConstNumber(offset + 55, $pur_vatsummaryset, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-課税区分
	 */
	public String pur_taxabletypecode() {
		return getConstString(offset + 56, $pur_taxabletypecode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-課税区分
	 */
	public void pur_taxabletypecode(String value) {
		setConstString(offset + 56, $pur_taxabletypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-通貨
	 */
	public String pur_currencycode() {
		return getConstString(offset + 57, $pur_currencycode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-通貨
	 */
	public void pur_currencycode(String value) {
		setConstString(offset + 57, $pur_currencycode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-ﾚｰﾄﾀｲﾌﾟ
	 */
	public String pur_ratetypecode() {
		return getConstString(offset + 58, $pur_ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-ﾚｰﾄﾀｲﾌﾟ
	 */
	public void pur_ratetypecode(String value) {
		setConstString(offset + 58, $pur_ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-債務ﾊﾟﾀｰﾝ
	 */
	public String pur_ap_patterncode() {
		return getConstString(offset + 59, $pur_ap_patterncode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-債務ﾊﾟﾀｰﾝ
	 */
	public void pur_ap_patterncode(String value) {
		setConstString(offset + 59, $pur_ap_patterncode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public MCNumber pur_closingdate() {
		return getConstNumber(offset + 60, $pur_closingdate);
	}

	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public void pur_closingdate(MCNumber value) {
		setConstNumber(offset + 60, $pur_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public void pur_closingdate(int value) {
		setConstNumber(offset + 60, $pur_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public void pur_closingdate(long value) {
		setConstNumber(offset + 60, $pur_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public void pur_closingdate(float value) {
		setConstNumber(offset + 60, $pur_closingdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-締日
	 */
	public void pur_closingdate(double value) {
		setConstNumber(offset + 60, $pur_closingdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public MCNumber pur_workingdayset() {
		return getConstNumber(offset + 61, $pur_workingdayset);
	}

	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public void pur_workingdayset(MCNumber value) {
		setConstNumber(offset + 61, $pur_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public void pur_workingdayset(int value) {
		setConstNumber(offset + 61, $pur_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public void pur_workingdayset(long value) {
		setConstNumber(offset + 61, $pur_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public void pur_workingdayset(float value) {
		setConstNumber(offset + 61, $pur_workingdayset, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-決済予定日休日時調整
	 */
	public void pur_workingdayset(double value) {
		setConstNumber(offset + 61, $pur_workingdayset, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public MCNumber pur_monthlymargin() {
		return getConstNumber(offset + 62, $pur_monthlymargin);
	}

	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public void pur_monthlymargin(MCNumber value) {
		setConstNumber(offset + 62, $pur_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public void pur_monthlymargin(int value) {
		setConstNumber(offset + 62, $pur_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public void pur_monthlymargin(long value) {
		setConstNumber(offset + 62, $pur_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public void pur_monthlymargin(float value) {
		setConstNumber(offset + 62, $pur_monthlymargin, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-差月
	 */
	public void pur_monthlymargin(double value) {
		setConstNumber(offset + 62, $pur_monthlymargin, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public MCNumber paymentdate() {
		return getConstNumber(offset + 63, $paymentdate);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public void paymentdate(MCNumber value) {
		setConstNumber(offset + 63, $paymentdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public void paymentdate(int value) {
		setConstNumber(offset + 63, $paymentdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public void paymentdate(long value) {
		setConstNumber(offset + 63, $paymentdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public void paymentdate(float value) {
		setConstNumber(offset + 63, $paymentdate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払日
	 */
	public void paymentdate(double value) {
		setConstNumber(offset + 63, $paymentdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-納入元
	 */
	public String delivfromcode() {
		return getConstString(offset + 64, $delivfromcode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-納入元
	 */
	public void delivfromcode(String value) {
		setConstString(offset + 64, $delivfromcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public MCNumber pur_mo_invoiceflag() {
		return getConstNumber(offset + 65, $pur_mo_invoiceflag);
	}

	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public void pur_mo_invoiceflag(MCNumber value) {
		setConstNumber(offset + 65, $pur_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public void pur_mo_invoiceflag(int value) {
		setConstNumber(offset + 65, $pur_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public void pur_mo_invoiceflag(long value) {
		setConstNumber(offset + 65, $pur_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public void pur_mo_invoiceflag(float value) {
		setConstNumber(offset + 65, $pur_mo_invoiceflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-月締支払通知書作成対象
	 */
	public void pur_mo_invoiceflag(double value) {
		setConstNumber(offset + 65, $pur_mo_invoiceflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-債務決済方法
	 */
	public String ap_settlemethod() {
		return getConstString(offset + 66, $ap_settlemethod);
	}

	/**
	 *  .<p>
	 *
	 * 購買-債務決済方法
	 */
	public void ap_settlemethod(String value) {
		setConstString(offset + 66, $ap_settlemethod, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-支払条件
	 */
	public String paymentterms() {
		return getConstString(offset + 67, $paymentterms);
	}

	/**
	 *  .<p>
	 *
	 * 購買-支払条件
	 */
	public void paymentterms(String value) {
		setConstString(offset + 67, $paymentterms, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public MCNumber pur_valueflag() {
		return getConstNumber(offset + 68, $pur_valueflag);
	}

	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public void pur_valueflag(MCNumber value) {
		setConstNumber(offset + 68, $pur_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public void pur_valueflag(int value) {
		setConstNumber(offset + 68, $pur_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public void pur_valueflag(long value) {
		setConstNumber(offset + 68, $pur_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public void pur_valueflag(float value) {
		setConstNumber(offset + 68, $pur_valueflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-超過数量
	 */
	public void pur_valueflag(double value) {
		setConstNumber(offset + 68, $pur_valueflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-前払ﾊﾟﾀｰﾝ
	 */
	public String pur_ad_patterncode() {
		return getConstString(offset + 69, $pur_ad_patterncode);
	}

	/**
	 *  .<p>
	 *
	 * 購買-前払ﾊﾟﾀｰﾝ
	 */
	public void pur_ad_patterncode(String value) {
		setConstString(offset + 69, $pur_ad_patterncode, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public MCNumber pur_settle_discountday() {
		return getConstNumber(offset + 70, $pur_settle_discountday);
	}

	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public void pur_settle_discountday(MCNumber value) {
		setConstNumber(offset + 70, $pur_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public void pur_settle_discountday(int value) {
		setConstNumber(offset + 70, $pur_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public void pur_settle_discountday(long value) {
		setConstNumber(offset + 70, $pur_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public void pur_settle_discountday(float value) {
		setConstNumber(offset + 70, $pur_settle_discountday, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-割引適用日数
	 */
	public void pur_settle_discountday(double value) {
		setConstNumber(offset + 70, $pur_settle_discountday, value);
	}


	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public MCNumber pur_settle_discountrate() {
		return getConstNumber(offset + 71, $pur_settle_discountrate);
	}

	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public void pur_settle_discountrate(MCNumber value) {
		setConstNumber(offset + 71, $pur_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public void pur_settle_discountrate(int value) {
		setConstNumber(offset + 71, $pur_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public void pur_settle_discountrate(long value) {
		setConstNumber(offset + 71, $pur_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public void pur_settle_discountrate(float value) {
		setConstNumber(offset + 71, $pur_settle_discountrate, value);
	}

	/**
	 *  .<p>
	 *
	 * 購買-消込金額割引率
	 */
	public void pur_settle_discountrate(double value) {
		setConstNumber(offset + 71, $pur_settle_discountrate, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public MCNumber h_flexmaster1_ap() {
		return getConstNumber(offset + 72, $h_flexmaster1_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ap(MCNumber value) {
		setConstNumber(offset + 72, $h_flexmaster1_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ap(int value) {
		setConstNumber(offset + 72, $h_flexmaster1_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ap(long value) {
		setConstNumber(offset + 72, $h_flexmaster1_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ap(float value) {
		setConstNumber(offset + 72, $h_flexmaster1_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_ap(double value) {
		setConstNumber(offset + 72, $h_flexmaster1_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public String h_flexmaster2_ap() {
		return getConstString(offset + 73, $h_flexmaster2_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public void h_flexmaster2_ap(String value) {
		setConstString(offset + 73, $h_flexmaster2_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public String h_flexcode1_ap() {
		return getConstString(offset + 74, $h_flexcode1_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public void h_flexcode1_ap(String value) {
		setConstString(offset + 74, $h_flexcode1_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public String h_flexcode2_ap() {
		return getConstString(offset + 75, $h_flexcode2_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public void h_flexcode2_ap(String value) {
		setConstString(offset + 75, $h_flexcode2_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public String h_flextext1_ap() {
		return getConstString(offset + 76, $h_flextext1_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public void h_flextext1_ap(String value) {
		setConstString(offset + 76, $h_flextext1_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public String h_flextext2_ap() {
		return getConstString(offset + 77, $h_flextext2_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public void h_flextext2_ap(String value) {
		setConstString(offset + 77, $h_flextext2_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public String h_flextext3_ap() {
		return getConstString(offset + 78, $h_flextext3_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public void h_flextext3_ap(String value) {
		setConstString(offset + 78, $h_flextext3_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public String h_flextext4_ap() {
		return getConstString(offset + 79, $h_flextext4_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public void h_flextext4_ap(String value) {
		setConstString(offset + 79, $h_flextext4_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public String h_flextext5_ap() {
		return getConstString(offset + 80, $h_flextext5_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public void h_flextext5_ap(String value) {
		setConstString(offset + 80, $h_flextext5_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public MCNumber commission_pay() {
		return getConstNumber(offset + 81, $commission_pay);
	}

	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public void commission_pay(MCNumber value) {
		setConstNumber(offset + 81, $commission_pay, value);
	}

	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public void commission_pay(int value) {
		setConstNumber(offset + 81, $commission_pay, value);
	}

	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public void commission_pay(long value) {
		setConstNumber(offset + 81, $commission_pay, value);
	}

	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public void commission_pay(float value) {
		setConstNumber(offset + 81, $commission_pay, value);
	}

	/**
	 *  .<p>
	 *
	 * 手数料負担
	 */
	public void commission_pay(double value) {
		setConstNumber(offset + 81, $commission_pay, value);
	}


	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public String iraicode() {
		return getConstString(offset + 82, $iraicode);
	}

	/**
	 *  .<p>
	 *
	 * 振込依頼人
	 */
	public void iraicode(String value) {
		setConstString(offset + 82, $iraicode, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public MCNumber h_flexmaster1_inv() {
		return getConstNumber(offset + 83, $h_flexmaster1_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_inv(MCNumber value) {
		setConstNumber(offset + 83, $h_flexmaster1_inv, value);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_inv(int value) {
		setConstNumber(offset + 83, $h_flexmaster1_inv, value);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_inv(long value) {
		setConstNumber(offset + 83, $h_flexmaster1_inv, value);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_inv(float value) {
		setConstNumber(offset + 83, $h_flexmaster1_inv, value);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ1
	 */
	public void h_flexmaster1_inv(double value) {
		setConstNumber(offset + 83, $h_flexmaster1_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public String h_flexmaster2_inv() {
		return getConstString(offset + 84, $h_flexmaster2_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾏｽﾀ2
	 */
	public void h_flexmaster2_inv(String value) {
		setConstString(offset + 84, $h_flexmaster2_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public String h_flexcode1_inv() {
		return getConstString(offset + 85, $h_flexcode1_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ1
	 */
	public void h_flexcode1_inv(String value) {
		setConstString(offset + 85, $h_flexcode1_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public String h_flexcode2_inv() {
		return getConstString(offset + 86, $h_flexcode2_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽｺｰﾄﾞ2
	 */
	public void h_flexcode2_inv(String value) {
		setConstString(offset + 86, $h_flexcode2_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public String h_flextext1_inv() {
		return getConstString(offset + 87, $h_flextext1_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ1
	 */
	public void h_flextext1_inv(String value) {
		setConstString(offset + 87, $h_flextext1_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public String h_flextext2_inv() {
		return getConstString(offset + 88, $h_flextext2_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ2
	 */
	public void h_flextext2_inv(String value) {
		setConstString(offset + 88, $h_flextext2_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public String h_flextext3_inv() {
		return getConstString(offset + 89, $h_flextext3_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ3
	 */
	public void h_flextext3_inv(String value) {
		setConstString(offset + 89, $h_flextext3_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public String h_flextext4_inv() {
		return getConstString(offset + 90, $h_flextext4_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ4
	 */
	public void h_flextext4_inv(String value) {
		setConstString(offset + 90, $h_flextext4_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public String h_flextext5_inv() {
		return getConstString(offset + 91, $h_flextext5_inv);
	}

	/**
	 *  .<p>
	 *
	 * 在庫ﾍｯﾀﾞﾌﾚｯｸｽﾃｷｽﾄ5
	 */
	public void h_flextext5_inv(String value) {
		setConstString(offset + 91, $h_flextext5_inv, value);
	}


	/**
	 *  .<p>
	 *
	 * E-mailアドレス
	 */
	public String email() {
		return getConstString(offset + 92, $email);
	}

	/**
	 *  .<p>
	 *
	 * E-mailアドレス
	 */
	public void email(String value) {
		setConstString(offset + 92, $email, value);
	}


	/**
	 *  .<p>
	 *
	 * 税ID
	 */
	public String taxid() {
		return getConstString(offset + 93, $taxid);
	}

	/**
	 *  .<p>
	 *
	 * 税ID
	 */
	public void taxid(String value) {
		setConstString(offset + 93, $taxid, value);
	}


	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public MCNumber overdueextensionaldays() {
		return getConstNumber(offset + 94, $overdueextensionaldays);
	}

	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public void overdueextensionaldays(MCNumber value) {
		setConstNumber(offset + 94, $overdueextensionaldays, value);
	}

	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public void overdueextensionaldays(int value) {
		setConstNumber(offset + 94, $overdueextensionaldays, value);
	}

	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public void overdueextensionaldays(long value) {
		setConstNumber(offset + 94, $overdueextensionaldays, value);
	}

	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public void overdueextensionaldays(float value) {
		setConstNumber(offset + 94, $overdueextensionaldays, value);
	}

	/**
	 *  .<p>
	 *
	 * 滞留猶予期間(日数)
	 */
	public void overdueextensionaldays(double value) {
		setConstNumber(offset + 94, $overdueextensionaldays, value);
	}


	/**
	 *  .<p>
	 *
	 * E-mail(Cc)
	 */
	public String email_cc() {
		return getConstString(offset + 95, $email_cc);
	}

	/**
	 *  .<p>
	 *
	 * E-mail(Cc)
	 */
	public void email_cc(String value) {
		setConstString(offset + 95, $email_cc, value);
	}


	/**
	 *  .<p>
	 *
	 * 税ID2
	 */
	public String taxid2() {
		return getConstString(offset + 96, $taxid2);
	}

	/**
	 *  .<p>
	 *
	 * 税ID2
	 */
	public void taxid2(String value) {
		setConstString(offset + 96, $taxid2, value);
	}


	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public MCNumber linkageflag() {
		return getConstNumber(offset + 97, $linkageflag);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public void linkageflag(MCNumber value) {
		setConstNumber(offset + 97, $linkageflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public void linkageflag(int value) {
		setConstNumber(offset + 97, $linkageflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public void linkageflag(long value) {
		setConstNumber(offset + 97, $linkageflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public void linkageflag(float value) {
		setConstNumber(offset + 97, $linkageflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携フラグ
	 */
	public void linkageflag(double value) {
		setConstNumber(offset + 97, $linkageflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 外部連携コード
	 */
	public String linkagecode() {
		return getConstString(offset + 98, $linkagecode);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携コード
	 */
	public void linkagecode(String value) {
		setConstString(offset + 98, $linkagecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 外部連携URL
	 */
	public String linkageurl() {
		return getConstString(offset + 99, $linkageurl);
	}

	/**
	 *  .<p>
	 *
	 * 外部連携URL
	 */
	public void linkageurl(String value) {
		setConstString(offset + 99, $linkageurl, value);
	}


	public String getString(String name) {
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($zip.equalsIgnoreCase(name)) {
			return zip();
		}
		if ($address1.equalsIgnoreCase(name)) {
			return address1();
		}
		if ($address2.equalsIgnoreCase(name)) {
			return address2();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($regioncode.equalsIgnoreCase(name)) {
			return regioncode();
		}
		if ($bankacctcode.equalsIgnoreCase(name)) {
			return bankacctcode();
		}
		if ($segmentcode.equalsIgnoreCase(name)) {
			return segmentcode();
		}
		if ($sal_taxabletypecode.equalsIgnoreCase(name)) {
			return sal_taxabletypecode();
		}
		if ($sal_currencycode.equalsIgnoreCase(name)) {
			return sal_currencycode();
		}
		if ($sal_ratetypecode.equalsIgnoreCase(name)) {
			return sal_ratetypecode();
		}
		if ($sal_ar_patterncode.equalsIgnoreCase(name)) {
			return sal_ar_patterncode();
		}
		if ($delivtocode.equalsIgnoreCase(name)) {
			return delivtocode();
		}
		if ($ar_settlemethod.equalsIgnoreCase(name)) {
			return ar_settlemethod();
		}
		if ($receivableterms.equalsIgnoreCase(name)) {
			return receivableterms();
		}
		if ($sal_ad_patterncode.equalsIgnoreCase(name)) {
			return sal_ad_patterncode();
		}
		if ($flexmaster1.equalsIgnoreCase(name)) {
			return flexmaster1();
		}
		if ($flexmaster2.equalsIgnoreCase(name)) {
			return flexmaster2();
		}
		if ($flexmaster3.equalsIgnoreCase(name)) {
			return flexmaster3();
		}
		if ($flexmaster4.equalsIgnoreCase(name)) {
			return flexmaster4();
		}
		if ($flexmaster5.equalsIgnoreCase(name)) {
			return flexmaster5();
		}
		if ($flextext1.equalsIgnoreCase(name)) {
			return flextext1();
		}
		if ($flextext2.equalsIgnoreCase(name)) {
			return flextext2();
		}
		if ($flextext3.equalsIgnoreCase(name)) {
			return flextext3();
		}
		if ($flextext4.equalsIgnoreCase(name)) {
			return flextext4();
		}
		if ($flextext5.equalsIgnoreCase(name)) {
			return flextext5();
		}
		if ($h_usermaster.equalsIgnoreCase(name)) {
			return h_usermaster();
		}
		if ($h_usertext.equalsIgnoreCase(name)) {
			return h_usertext();
		}
		if ($h_flexmaster1_ar.equalsIgnoreCase(name)) {
			return h_flexmaster1_ar();
		}
		if ($h_flexmaster2_ar.equalsIgnoreCase(name)) {
			return h_flexmaster2_ar();
		}
		if ($h_flexcode1_ar.equalsIgnoreCase(name)) {
			return h_flexcode1_ar();
		}
		if ($h_flexcode2_ar.equalsIgnoreCase(name)) {
			return h_flexcode2_ar();
		}
		if ($h_flextext1_ar.equalsIgnoreCase(name)) {
			return h_flextext1_ar();
		}
		if ($h_flextext2_ar.equalsIgnoreCase(name)) {
			return h_flextext2_ar();
		}
		if ($h_flextext3_ar.equalsIgnoreCase(name)) {
			return h_flextext3_ar();
		}
		if ($h_flextext4_ar.equalsIgnoreCase(name)) {
			return h_flextext4_ar();
		}
		if ($h_flextext5_ar.equalsIgnoreCase(name)) {
			return h_flextext5_ar();
		}
		if ($pur_taxabletypecode.equalsIgnoreCase(name)) {
			return pur_taxabletypecode();
		}
		if ($pur_currencycode.equalsIgnoreCase(name)) {
			return pur_currencycode();
		}
		if ($pur_ratetypecode.equalsIgnoreCase(name)) {
			return pur_ratetypecode();
		}
		if ($pur_ap_patterncode.equalsIgnoreCase(name)) {
			return pur_ap_patterncode();
		}
		if ($delivfromcode.equalsIgnoreCase(name)) {
			return delivfromcode();
		}
		if ($ap_settlemethod.equalsIgnoreCase(name)) {
			return ap_settlemethod();
		}
		if ($paymentterms.equalsIgnoreCase(name)) {
			return paymentterms();
		}
		if ($pur_ad_patterncode.equalsIgnoreCase(name)) {
			return pur_ad_patterncode();
		}
		if ($h_flexmaster2_ap.equalsIgnoreCase(name)) {
			return h_flexmaster2_ap();
		}
		if ($h_flexcode1_ap.equalsIgnoreCase(name)) {
			return h_flexcode1_ap();
		}
		if ($h_flexcode2_ap.equalsIgnoreCase(name)) {
			return h_flexcode2_ap();
		}
		if ($h_flextext1_ap.equalsIgnoreCase(name)) {
			return h_flextext1_ap();
		}
		if ($h_flextext2_ap.equalsIgnoreCase(name)) {
			return h_flextext2_ap();
		}
		if ($h_flextext3_ap.equalsIgnoreCase(name)) {
			return h_flextext3_ap();
		}
		if ($h_flextext4_ap.equalsIgnoreCase(name)) {
			return h_flextext4_ap();
		}
		if ($h_flextext5_ap.equalsIgnoreCase(name)) {
			return h_flextext5_ap();
		}
		if ($iraicode.equalsIgnoreCase(name)) {
			return iraicode();
		}
		if ($h_flexmaster2_inv.equalsIgnoreCase(name)) {
			return h_flexmaster2_inv();
		}
		if ($h_flexcode1_inv.equalsIgnoreCase(name)) {
			return h_flexcode1_inv();
		}
		if ($h_flexcode2_inv.equalsIgnoreCase(name)) {
			return h_flexcode2_inv();
		}
		if ($h_flextext1_inv.equalsIgnoreCase(name)) {
			return h_flextext1_inv();
		}
		if ($h_flextext2_inv.equalsIgnoreCase(name)) {
			return h_flextext2_inv();
		}
		if ($h_flextext3_inv.equalsIgnoreCase(name)) {
			return h_flextext3_inv();
		}
		if ($h_flextext4_inv.equalsIgnoreCase(name)) {
			return h_flextext4_inv();
		}
		if ($h_flextext5_inv.equalsIgnoreCase(name)) {
			return h_flextext5_inv();
		}
		if ($email.equalsIgnoreCase(name)) {
			return email();
		}
		if ($taxid.equalsIgnoreCase(name)) {
			return taxid();
		}
		if ($email_cc.equalsIgnoreCase(name)) {
			return email_cc();
		}
		if ($taxid2.equalsIgnoreCase(name)) {
			return taxid2();
		}
		if ($linkagecode.equalsIgnoreCase(name)) {
			return linkagecode();
		}
		if ($linkageurl.equalsIgnoreCase(name)) {
			return linkageurl();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			return corresptype();
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			return creditlimitflag();
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			return sal_vatsummaryset();
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			return sal_closingdate();
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			return sal_workingdayset();
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			return sal_monthlymargin();
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			return collectdate();
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			return sal_mo_invoiceflag();
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			return sal_forcondition();
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			return sal_valueflag();
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			return sal_settle_discountday();
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			return sal_settle_discountrate();
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			return pur_vatsummaryset();
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			return pur_closingdate();
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			return pur_workingdayset();
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			return pur_monthlymargin();
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			return paymentdate();
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			return pur_mo_invoiceflag();
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			return pur_valueflag();
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			return pur_settle_discountday();
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			return pur_settle_discountrate();
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			return h_flexmaster1_ap();
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			return commission_pay();
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			return h_flexmaster1_inv();
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			return overdueextensionaldays();
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			return linkageflag();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($zip.equalsIgnoreCase(name)) {
			return zip();
		}
		if ($address1.equalsIgnoreCase(name)) {
			return address1();
		}
		if ($address2.equalsIgnoreCase(name)) {
			return address2();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($regioncode.equalsIgnoreCase(name)) {
			return regioncode();
		}
		if ($bankacctcode.equalsIgnoreCase(name)) {
			return bankacctcode();
		}
		if ($segmentcode.equalsIgnoreCase(name)) {
			return segmentcode();
		}
		if ($sal_taxabletypecode.equalsIgnoreCase(name)) {
			return sal_taxabletypecode();
		}
		if ($sal_currencycode.equalsIgnoreCase(name)) {
			return sal_currencycode();
		}
		if ($sal_ratetypecode.equalsIgnoreCase(name)) {
			return sal_ratetypecode();
		}
		if ($sal_ar_patterncode.equalsIgnoreCase(name)) {
			return sal_ar_patterncode();
		}
		if ($delivtocode.equalsIgnoreCase(name)) {
			return delivtocode();
		}
		if ($ar_settlemethod.equalsIgnoreCase(name)) {
			return ar_settlemethod();
		}
		if ($receivableterms.equalsIgnoreCase(name)) {
			return receivableterms();
		}
		if ($sal_ad_patterncode.equalsIgnoreCase(name)) {
			return sal_ad_patterncode();
		}
		if ($flexmaster1.equalsIgnoreCase(name)) {
			return flexmaster1();
		}
		if ($flexmaster2.equalsIgnoreCase(name)) {
			return flexmaster2();
		}
		if ($flexmaster3.equalsIgnoreCase(name)) {
			return flexmaster3();
		}
		if ($flexmaster4.equalsIgnoreCase(name)) {
			return flexmaster4();
		}
		if ($flexmaster5.equalsIgnoreCase(name)) {
			return flexmaster5();
		}
		if ($flextext1.equalsIgnoreCase(name)) {
			return flextext1();
		}
		if ($flextext2.equalsIgnoreCase(name)) {
			return flextext2();
		}
		if ($flextext3.equalsIgnoreCase(name)) {
			return flextext3();
		}
		if ($flextext4.equalsIgnoreCase(name)) {
			return flextext4();
		}
		if ($flextext5.equalsIgnoreCase(name)) {
			return flextext5();
		}
		if ($h_usermaster.equalsIgnoreCase(name)) {
			return h_usermaster();
		}
		if ($h_usertext.equalsIgnoreCase(name)) {
			return h_usertext();
		}
		if ($h_flexmaster1_ar.equalsIgnoreCase(name)) {
			return h_flexmaster1_ar();
		}
		if ($h_flexmaster2_ar.equalsIgnoreCase(name)) {
			return h_flexmaster2_ar();
		}
		if ($h_flexcode1_ar.equalsIgnoreCase(name)) {
			return h_flexcode1_ar();
		}
		if ($h_flexcode2_ar.equalsIgnoreCase(name)) {
			return h_flexcode2_ar();
		}
		if ($h_flextext1_ar.equalsIgnoreCase(name)) {
			return h_flextext1_ar();
		}
		if ($h_flextext2_ar.equalsIgnoreCase(name)) {
			return h_flextext2_ar();
		}
		if ($h_flextext3_ar.equalsIgnoreCase(name)) {
			return h_flextext3_ar();
		}
		if ($h_flextext4_ar.equalsIgnoreCase(name)) {
			return h_flextext4_ar();
		}
		if ($h_flextext5_ar.equalsIgnoreCase(name)) {
			return h_flextext5_ar();
		}
		if ($pur_taxabletypecode.equalsIgnoreCase(name)) {
			return pur_taxabletypecode();
		}
		if ($pur_currencycode.equalsIgnoreCase(name)) {
			return pur_currencycode();
		}
		if ($pur_ratetypecode.equalsIgnoreCase(name)) {
			return pur_ratetypecode();
		}
		if ($pur_ap_patterncode.equalsIgnoreCase(name)) {
			return pur_ap_patterncode();
		}
		if ($delivfromcode.equalsIgnoreCase(name)) {
			return delivfromcode();
		}
		if ($ap_settlemethod.equalsIgnoreCase(name)) {
			return ap_settlemethod();
		}
		if ($paymentterms.equalsIgnoreCase(name)) {
			return paymentterms();
		}
		if ($pur_ad_patterncode.equalsIgnoreCase(name)) {
			return pur_ad_patterncode();
		}
		if ($h_flexmaster2_ap.equalsIgnoreCase(name)) {
			return h_flexmaster2_ap();
		}
		if ($h_flexcode1_ap.equalsIgnoreCase(name)) {
			return h_flexcode1_ap();
		}
		if ($h_flexcode2_ap.equalsIgnoreCase(name)) {
			return h_flexcode2_ap();
		}
		if ($h_flextext1_ap.equalsIgnoreCase(name)) {
			return h_flextext1_ap();
		}
		if ($h_flextext2_ap.equalsIgnoreCase(name)) {
			return h_flextext2_ap();
		}
		if ($h_flextext3_ap.equalsIgnoreCase(name)) {
			return h_flextext3_ap();
		}
		if ($h_flextext4_ap.equalsIgnoreCase(name)) {
			return h_flextext4_ap();
		}
		if ($h_flextext5_ap.equalsIgnoreCase(name)) {
			return h_flextext5_ap();
		}
		if ($iraicode.equalsIgnoreCase(name)) {
			return iraicode();
		}
		if ($h_flexmaster2_inv.equalsIgnoreCase(name)) {
			return h_flexmaster2_inv();
		}
		if ($h_flexcode1_inv.equalsIgnoreCase(name)) {
			return h_flexcode1_inv();
		}
		if ($h_flexcode2_inv.equalsIgnoreCase(name)) {
			return h_flexcode2_inv();
		}
		if ($h_flextext1_inv.equalsIgnoreCase(name)) {
			return h_flextext1_inv();
		}
		if ($h_flextext2_inv.equalsIgnoreCase(name)) {
			return h_flextext2_inv();
		}
		if ($h_flextext3_inv.equalsIgnoreCase(name)) {
			return h_flextext3_inv();
		}
		if ($h_flextext4_inv.equalsIgnoreCase(name)) {
			return h_flextext4_inv();
		}
		if ($h_flextext5_inv.equalsIgnoreCase(name)) {
			return h_flextext5_inv();
		}
		if ($email.equalsIgnoreCase(name)) {
			return email();
		}
		if ($taxid.equalsIgnoreCase(name)) {
			return taxid();
		}
		if ($email_cc.equalsIgnoreCase(name)) {
			return email_cc();
		}
		if ($taxid2.equalsIgnoreCase(name)) {
			return taxid2();
		}
		if ($linkagecode.equalsIgnoreCase(name)) {
			return linkagecode();
		}
		if ($linkageurl.equalsIgnoreCase(name)) {
			return linkageurl();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			return corresptype();
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			return creditlimitflag();
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			return sal_vatsummaryset();
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			return sal_closingdate();
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			return sal_workingdayset();
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			return sal_monthlymargin();
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			return collectdate();
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			return sal_mo_invoiceflag();
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			return sal_forcondition();
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			return sal_valueflag();
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			return sal_settle_discountday();
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			return sal_settle_discountrate();
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			return pur_vatsummaryset();
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			return pur_closingdate();
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			return pur_workingdayset();
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			return pur_monthlymargin();
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			return paymentdate();
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			return pur_mo_invoiceflag();
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			return pur_valueflag();
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			return pur_settle_discountday();
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			return pur_settle_discountrate();
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			return h_flexmaster1_ap();
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			return commission_pay();
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			return h_flexmaster1_inv();
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			return overdueextensionaldays();
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			return linkageflag();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			searchcharacter(value);
			return;
		}
		if ($extension.equalsIgnoreCase(name)) {
			extension(value);
			return;
		}
		if ($zip.equalsIgnoreCase(name)) {
			zip(value);
			return;
		}
		if ($address1.equalsIgnoreCase(name)) {
			address1(value);
			return;
		}
		if ($address2.equalsIgnoreCase(name)) {
			address2(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($regioncode.equalsIgnoreCase(name)) {
			regioncode(value);
			return;
		}
		if ($bankacctcode.equalsIgnoreCase(name)) {
			bankacctcode(value);
			return;
		}
		if ($segmentcode.equalsIgnoreCase(name)) {
			segmentcode(value);
			return;
		}
		if ($sal_taxabletypecode.equalsIgnoreCase(name)) {
			sal_taxabletypecode(value);
			return;
		}
		if ($sal_currencycode.equalsIgnoreCase(name)) {
			sal_currencycode(value);
			return;
		}
		if ($sal_ratetypecode.equalsIgnoreCase(name)) {
			sal_ratetypecode(value);
			return;
		}
		if ($sal_ar_patterncode.equalsIgnoreCase(name)) {
			sal_ar_patterncode(value);
			return;
		}
		if ($delivtocode.equalsIgnoreCase(name)) {
			delivtocode(value);
			return;
		}
		if ($ar_settlemethod.equalsIgnoreCase(name)) {
			ar_settlemethod(value);
			return;
		}
		if ($receivableterms.equalsIgnoreCase(name)) {
			receivableterms(value);
			return;
		}
		if ($sal_ad_patterncode.equalsIgnoreCase(name)) {
			sal_ad_patterncode(value);
			return;
		}
		if ($flexmaster1.equalsIgnoreCase(name)) {
			flexmaster1(value);
			return;
		}
		if ($flexmaster2.equalsIgnoreCase(name)) {
			flexmaster2(value);
			return;
		}
		if ($flexmaster3.equalsIgnoreCase(name)) {
			flexmaster3(value);
			return;
		}
		if ($flexmaster4.equalsIgnoreCase(name)) {
			flexmaster4(value);
			return;
		}
		if ($flexmaster5.equalsIgnoreCase(name)) {
			flexmaster5(value);
			return;
		}
		if ($flextext1.equalsIgnoreCase(name)) {
			flextext1(value);
			return;
		}
		if ($flextext2.equalsIgnoreCase(name)) {
			flextext2(value);
			return;
		}
		if ($flextext3.equalsIgnoreCase(name)) {
			flextext3(value);
			return;
		}
		if ($flextext4.equalsIgnoreCase(name)) {
			flextext4(value);
			return;
		}
		if ($flextext5.equalsIgnoreCase(name)) {
			flextext5(value);
			return;
		}
		if ($h_usermaster.equalsIgnoreCase(name)) {
			h_usermaster(value);
			return;
		}
		if ($h_usertext.equalsIgnoreCase(name)) {
			h_usertext(value);
			return;
		}
		if ($h_flexmaster1_ar.equalsIgnoreCase(name)) {
			h_flexmaster1_ar(value);
			return;
		}
		if ($h_flexmaster2_ar.equalsIgnoreCase(name)) {
			h_flexmaster2_ar(value);
			return;
		}
		if ($h_flexcode1_ar.equalsIgnoreCase(name)) {
			h_flexcode1_ar(value);
			return;
		}
		if ($h_flexcode2_ar.equalsIgnoreCase(name)) {
			h_flexcode2_ar(value);
			return;
		}
		if ($h_flextext1_ar.equalsIgnoreCase(name)) {
			h_flextext1_ar(value);
			return;
		}
		if ($h_flextext2_ar.equalsIgnoreCase(name)) {
			h_flextext2_ar(value);
			return;
		}
		if ($h_flextext3_ar.equalsIgnoreCase(name)) {
			h_flextext3_ar(value);
			return;
		}
		if ($h_flextext4_ar.equalsIgnoreCase(name)) {
			h_flextext4_ar(value);
			return;
		}
		if ($h_flextext5_ar.equalsIgnoreCase(name)) {
			h_flextext5_ar(value);
			return;
		}
		if ($pur_taxabletypecode.equalsIgnoreCase(name)) {
			pur_taxabletypecode(value);
			return;
		}
		if ($pur_currencycode.equalsIgnoreCase(name)) {
			pur_currencycode(value);
			return;
		}
		if ($pur_ratetypecode.equalsIgnoreCase(name)) {
			pur_ratetypecode(value);
			return;
		}
		if ($pur_ap_patterncode.equalsIgnoreCase(name)) {
			pur_ap_patterncode(value);
			return;
		}
		if ($delivfromcode.equalsIgnoreCase(name)) {
			delivfromcode(value);
			return;
		}
		if ($ap_settlemethod.equalsIgnoreCase(name)) {
			ap_settlemethod(value);
			return;
		}
		if ($paymentterms.equalsIgnoreCase(name)) {
			paymentterms(value);
			return;
		}
		if ($pur_ad_patterncode.equalsIgnoreCase(name)) {
			pur_ad_patterncode(value);
			return;
		}
		if ($h_flexmaster2_ap.equalsIgnoreCase(name)) {
			h_flexmaster2_ap(value);
			return;
		}
		if ($h_flexcode1_ap.equalsIgnoreCase(name)) {
			h_flexcode1_ap(value);
			return;
		}
		if ($h_flexcode2_ap.equalsIgnoreCase(name)) {
			h_flexcode2_ap(value);
			return;
		}
		if ($h_flextext1_ap.equalsIgnoreCase(name)) {
			h_flextext1_ap(value);
			return;
		}
		if ($h_flextext2_ap.equalsIgnoreCase(name)) {
			h_flextext2_ap(value);
			return;
		}
		if ($h_flextext3_ap.equalsIgnoreCase(name)) {
			h_flextext3_ap(value);
			return;
		}
		if ($h_flextext4_ap.equalsIgnoreCase(name)) {
			h_flextext4_ap(value);
			return;
		}
		if ($h_flextext5_ap.equalsIgnoreCase(name)) {
			h_flextext5_ap(value);
			return;
		}
		if ($iraicode.equalsIgnoreCase(name)) {
			iraicode(value);
			return;
		}
		if ($h_flexmaster2_inv.equalsIgnoreCase(name)) {
			h_flexmaster2_inv(value);
			return;
		}
		if ($h_flexcode1_inv.equalsIgnoreCase(name)) {
			h_flexcode1_inv(value);
			return;
		}
		if ($h_flexcode2_inv.equalsIgnoreCase(name)) {
			h_flexcode2_inv(value);
			return;
		}
		if ($h_flextext1_inv.equalsIgnoreCase(name)) {
			h_flextext1_inv(value);
			return;
		}
		if ($h_flextext2_inv.equalsIgnoreCase(name)) {
			h_flextext2_inv(value);
			return;
		}
		if ($h_flextext3_inv.equalsIgnoreCase(name)) {
			h_flextext3_inv(value);
			return;
		}
		if ($h_flextext4_inv.equalsIgnoreCase(name)) {
			h_flextext4_inv(value);
			return;
		}
		if ($h_flextext5_inv.equalsIgnoreCase(name)) {
			h_flextext5_inv(value);
			return;
		}
		if ($email.equalsIgnoreCase(name)) {
			email(value);
			return;
		}
		if ($taxid.equalsIgnoreCase(name)) {
			taxid(value);
			return;
		}
		if ($email_cc.equalsIgnoreCase(name)) {
			email_cc(value);
			return;
		}
		if ($taxid2.equalsIgnoreCase(name)) {
			taxid2(value);
			return;
		}
		if ($linkagecode.equalsIgnoreCase(name)) {
			linkagecode(value);
			return;
		}
		if ($linkageurl.equalsIgnoreCase(name)) {
			linkageurl(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			searchcharacter(value);
			return;
		}
		if ($extension.equalsIgnoreCase(name)) {
			extension(value);
			return;
		}
		if ($zip.equalsIgnoreCase(name)) {
			zip(value);
			return;
		}
		if ($address1.equalsIgnoreCase(name)) {
			address1(value);
			return;
		}
		if ($address2.equalsIgnoreCase(name)) {
			address2(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($regioncode.equalsIgnoreCase(name)) {
			regioncode(value);
			return;
		}
		if ($bankacctcode.equalsIgnoreCase(name)) {
			bankacctcode(value);
			return;
		}
		if ($segmentcode.equalsIgnoreCase(name)) {
			segmentcode(value);
			return;
		}
		if ($sal_taxabletypecode.equalsIgnoreCase(name)) {
			sal_taxabletypecode(value);
			return;
		}
		if ($sal_currencycode.equalsIgnoreCase(name)) {
			sal_currencycode(value);
			return;
		}
		if ($sal_ratetypecode.equalsIgnoreCase(name)) {
			sal_ratetypecode(value);
			return;
		}
		if ($sal_ar_patterncode.equalsIgnoreCase(name)) {
			sal_ar_patterncode(value);
			return;
		}
		if ($delivtocode.equalsIgnoreCase(name)) {
			delivtocode(value);
			return;
		}
		if ($ar_settlemethod.equalsIgnoreCase(name)) {
			ar_settlemethod(value);
			return;
		}
		if ($receivableterms.equalsIgnoreCase(name)) {
			receivableterms(value);
			return;
		}
		if ($sal_ad_patterncode.equalsIgnoreCase(name)) {
			sal_ad_patterncode(value);
			return;
		}
		if ($flexmaster1.equalsIgnoreCase(name)) {
			flexmaster1(value);
			return;
		}
		if ($flexmaster2.equalsIgnoreCase(name)) {
			flexmaster2(value);
			return;
		}
		if ($flexmaster3.equalsIgnoreCase(name)) {
			flexmaster3(value);
			return;
		}
		if ($flexmaster4.equalsIgnoreCase(name)) {
			flexmaster4(value);
			return;
		}
		if ($flexmaster5.equalsIgnoreCase(name)) {
			flexmaster5(value);
			return;
		}
		if ($flextext1.equalsIgnoreCase(name)) {
			flextext1(value);
			return;
		}
		if ($flextext2.equalsIgnoreCase(name)) {
			flextext2(value);
			return;
		}
		if ($flextext3.equalsIgnoreCase(name)) {
			flextext3(value);
			return;
		}
		if ($flextext4.equalsIgnoreCase(name)) {
			flextext4(value);
			return;
		}
		if ($flextext5.equalsIgnoreCase(name)) {
			flextext5(value);
			return;
		}
		if ($h_usermaster.equalsIgnoreCase(name)) {
			h_usermaster(value);
			return;
		}
		if ($h_usertext.equalsIgnoreCase(name)) {
			h_usertext(value);
			return;
		}
		if ($h_flexmaster1_ar.equalsIgnoreCase(name)) {
			h_flexmaster1_ar(value);
			return;
		}
		if ($h_flexmaster2_ar.equalsIgnoreCase(name)) {
			h_flexmaster2_ar(value);
			return;
		}
		if ($h_flexcode1_ar.equalsIgnoreCase(name)) {
			h_flexcode1_ar(value);
			return;
		}
		if ($h_flexcode2_ar.equalsIgnoreCase(name)) {
			h_flexcode2_ar(value);
			return;
		}
		if ($h_flextext1_ar.equalsIgnoreCase(name)) {
			h_flextext1_ar(value);
			return;
		}
		if ($h_flextext2_ar.equalsIgnoreCase(name)) {
			h_flextext2_ar(value);
			return;
		}
		if ($h_flextext3_ar.equalsIgnoreCase(name)) {
			h_flextext3_ar(value);
			return;
		}
		if ($h_flextext4_ar.equalsIgnoreCase(name)) {
			h_flextext4_ar(value);
			return;
		}
		if ($h_flextext5_ar.equalsIgnoreCase(name)) {
			h_flextext5_ar(value);
			return;
		}
		if ($pur_taxabletypecode.equalsIgnoreCase(name)) {
			pur_taxabletypecode(value);
			return;
		}
		if ($pur_currencycode.equalsIgnoreCase(name)) {
			pur_currencycode(value);
			return;
		}
		if ($pur_ratetypecode.equalsIgnoreCase(name)) {
			pur_ratetypecode(value);
			return;
		}
		if ($pur_ap_patterncode.equalsIgnoreCase(name)) {
			pur_ap_patterncode(value);
			return;
		}
		if ($delivfromcode.equalsIgnoreCase(name)) {
			delivfromcode(value);
			return;
		}
		if ($ap_settlemethod.equalsIgnoreCase(name)) {
			ap_settlemethod(value);
			return;
		}
		if ($paymentterms.equalsIgnoreCase(name)) {
			paymentterms(value);
			return;
		}
		if ($pur_ad_patterncode.equalsIgnoreCase(name)) {
			pur_ad_patterncode(value);
			return;
		}
		if ($h_flexmaster2_ap.equalsIgnoreCase(name)) {
			h_flexmaster2_ap(value);
			return;
		}
		if ($h_flexcode1_ap.equalsIgnoreCase(name)) {
			h_flexcode1_ap(value);
			return;
		}
		if ($h_flexcode2_ap.equalsIgnoreCase(name)) {
			h_flexcode2_ap(value);
			return;
		}
		if ($h_flextext1_ap.equalsIgnoreCase(name)) {
			h_flextext1_ap(value);
			return;
		}
		if ($h_flextext2_ap.equalsIgnoreCase(name)) {
			h_flextext2_ap(value);
			return;
		}
		if ($h_flextext3_ap.equalsIgnoreCase(name)) {
			h_flextext3_ap(value);
			return;
		}
		if ($h_flextext4_ap.equalsIgnoreCase(name)) {
			h_flextext4_ap(value);
			return;
		}
		if ($h_flextext5_ap.equalsIgnoreCase(name)) {
			h_flextext5_ap(value);
			return;
		}
		if ($iraicode.equalsIgnoreCase(name)) {
			iraicode(value);
			return;
		}
		if ($h_flexmaster2_inv.equalsIgnoreCase(name)) {
			h_flexmaster2_inv(value);
			return;
		}
		if ($h_flexcode1_inv.equalsIgnoreCase(name)) {
			h_flexcode1_inv(value);
			return;
		}
		if ($h_flexcode2_inv.equalsIgnoreCase(name)) {
			h_flexcode2_inv(value);
			return;
		}
		if ($h_flextext1_inv.equalsIgnoreCase(name)) {
			h_flextext1_inv(value);
			return;
		}
		if ($h_flextext2_inv.equalsIgnoreCase(name)) {
			h_flextext2_inv(value);
			return;
		}
		if ($h_flextext3_inv.equalsIgnoreCase(name)) {
			h_flextext3_inv(value);
			return;
		}
		if ($h_flextext4_inv.equalsIgnoreCase(name)) {
			h_flextext4_inv(value);
			return;
		}
		if ($h_flextext5_inv.equalsIgnoreCase(name)) {
			h_flextext5_inv(value);
			return;
		}
		if ($email.equalsIgnoreCase(name)) {
			email(value);
			return;
		}
		if ($taxid.equalsIgnoreCase(name)) {
			taxid(value);
			return;
		}
		if ($email_cc.equalsIgnoreCase(name)) {
			email_cc(value);
			return;
		}
		if ($taxid2.equalsIgnoreCase(name)) {
			taxid2(value);
			return;
		}
		if ($linkagecode.equalsIgnoreCase(name)) {
			linkagecode(value);
			return;
		}
		if ($linkageurl.equalsIgnoreCase(name)) {
			linkageurl(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($corresptype.equalsIgnoreCase(name)) {
			corresptype(value);
			return;
		}
		if ($creditlimitflag.equalsIgnoreCase(name)) {
			creditlimitflag(value);
			return;
		}
		if ($sal_vatsummaryset.equalsIgnoreCase(name)) {
			sal_vatsummaryset(value);
			return;
		}
		if ($sal_closingdate.equalsIgnoreCase(name)) {
			sal_closingdate(value);
			return;
		}
		if ($sal_workingdayset.equalsIgnoreCase(name)) {
			sal_workingdayset(value);
			return;
		}
		if ($sal_monthlymargin.equalsIgnoreCase(name)) {
			sal_monthlymargin(value);
			return;
		}
		if ($collectdate.equalsIgnoreCase(name)) {
			collectdate(value);
			return;
		}
		if ($sal_mo_invoiceflag.equalsIgnoreCase(name)) {
			sal_mo_invoiceflag(value);
			return;
		}
		if ($sal_forcondition.equalsIgnoreCase(name)) {
			sal_forcondition(value);
			return;
		}
		if ($sal_valueflag.equalsIgnoreCase(name)) {
			sal_valueflag(value);
			return;
		}
		if ($sal_settle_discountday.equalsIgnoreCase(name)) {
			sal_settle_discountday(value);
			return;
		}
		if ($sal_settle_discountrate.equalsIgnoreCase(name)) {
			sal_settle_discountrate(value);
			return;
		}
		if ($pur_vatsummaryset.equalsIgnoreCase(name)) {
			pur_vatsummaryset(value);
			return;
		}
		if ($pur_closingdate.equalsIgnoreCase(name)) {
			pur_closingdate(value);
			return;
		}
		if ($pur_workingdayset.equalsIgnoreCase(name)) {
			pur_workingdayset(value);
			return;
		}
		if ($pur_monthlymargin.equalsIgnoreCase(name)) {
			pur_monthlymargin(value);
			return;
		}
		if ($paymentdate.equalsIgnoreCase(name)) {
			paymentdate(value);
			return;
		}
		if ($pur_mo_invoiceflag.equalsIgnoreCase(name)) {
			pur_mo_invoiceflag(value);
			return;
		}
		if ($pur_valueflag.equalsIgnoreCase(name)) {
			pur_valueflag(value);
			return;
		}
		if ($pur_settle_discountday.equalsIgnoreCase(name)) {
			pur_settle_discountday(value);
			return;
		}
		if ($pur_settle_discountrate.equalsIgnoreCase(name)) {
			pur_settle_discountrate(value);
			return;
		}
		if ($h_flexmaster1_ap.equalsIgnoreCase(name)) {
			h_flexmaster1_ap(value);
			return;
		}
		if ($commission_pay.equalsIgnoreCase(name)) {
			commission_pay(value);
			return;
		}
		if ($h_flexmaster1_inv.equalsIgnoreCase(name)) {
			h_flexmaster1_inv(value);
			return;
		}
		if ($overdueextensionaldays.equalsIgnoreCase(name)) {
			overdueextensionaldays(value);
			return;
		}
		if ($linkageflag.equalsIgnoreCase(name)) {
			linkageflag(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

