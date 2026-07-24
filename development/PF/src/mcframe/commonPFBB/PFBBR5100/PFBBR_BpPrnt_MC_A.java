package mcframe.commonPFBB.PFBBR5100;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_BpPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5100";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5100.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta code_META_0 = new MCReportMeta("code", "", "20", "", true);
	static public final MCReportMeta name_META_0 = new MCReportMeta("name", "", "100", "", true);
	static public final MCReportMeta activeflag_META_0 = new MCReportMeta("activeflag", "", "1", "", true);
	static public final MCReportMeta searchcharacter_META_0 = new MCReportMeta("searchcharacter", "", "1", "", true);
	static public final MCReportMeta extension_META_0 = new MCReportMeta("extension", "", "2", "", true);
	static public final MCReportMeta corresptype_META_0 = new MCReportMeta("corresptype", "", "1", "", true);
	static public final MCReportMeta zip_META_0 = new MCReportMeta("zip", "", "50", "", true);
	static public final MCReportMeta address1_META_0 = new MCReportMeta("address1", "", "250", "", true);
	static public final MCReportMeta address2_META_0 = new MCReportMeta("address2", "", "250", "", true);
	static public final MCReportMeta tel1_META_0 = new MCReportMeta("tel1", "", "50", "", true);
	static public final MCReportMeta tel2_META_0 = new MCReportMeta("tel2", "", "50", "", true);
	static public final MCReportMeta fax_META_0 = new MCReportMeta("fax", "", "50", "", true);
	static public final MCReportMeta regioncode_META_0 = new MCReportMeta("regioncode", "", "20", "", true);
	static public final MCReportMeta bankacctcode_META_0 = new MCReportMeta("bankacctcode", "", "20", "", true);
	static public final MCReportMeta segmentcode_META_0 = new MCReportMeta("segmentcode", "", "20", "", true);
	static public final MCReportMeta creditlimitflag_META_0 = new MCReportMeta("creditlimitflag", "", "1", "", true);
	static public final MCReportMeta sal_vatsummaryset_META_0 = new MCReportMeta("sal_vatsummaryset", "", "1", "", true);
	static public final MCReportMeta sal_taxabletypecode_META_0 = new MCReportMeta("sal_taxabletypecode", "", "20", "", true);
	static public final MCReportMeta sal_currencycode_META_0 = new MCReportMeta("sal_currencycode", "", "20", "", true);
	static public final MCReportMeta sal_ratetypecode_META_0 = new MCReportMeta("sal_ratetypecode", "", "20", "", true);
	static public final MCReportMeta sal_ar_patterncode_META_0 = new MCReportMeta("sal_ar_patterncode", "", "20", "", true);
	static public final MCReportMeta sal_closingdate_META_0 = new MCReportMeta("sal_closingdate", "", "2", "", true);
	static public final MCReportMeta sal_workingdayset_META_0 = new MCReportMeta("sal_workingdayset", "", "1", "", true);
	static public final MCReportMeta sal_monthlymargin_META_0 = new MCReportMeta("sal_monthlymargin", "", "2", "", true);
	static public final MCReportMeta collectdate_META_0 = new MCReportMeta("collectdate", "", "2", "", true);
	static public final MCReportMeta delivtocode_META_0 = new MCReportMeta("delivtocode", "", "20", "", true);
	static public final MCReportMeta sal_mo_invoiceflag_META_0 = new MCReportMeta("sal_mo_invoiceflag", "", "1", "", true);
	static public final MCReportMeta ar_settlemethod_META_0 = new MCReportMeta("ar_settlemethod", "", "20", "", true);
	static public final MCReportMeta sal_forcondition_META_0 = new MCReportMeta("sal_forcondition", "", "1", "", true);
	static public final MCReportMeta receivableterms_META_0 = new MCReportMeta("receivableterms", "", "100", "", true);
	static public final MCReportMeta sal_valueflag_META_0 = new MCReportMeta("sal_valueflag", "", "1", "", true);
	static public final MCReportMeta sal_ad_patterncode_META_0 = new MCReportMeta("sal_ad_patterncode", "", "20", "", true);
	static public final MCReportMeta sal_settle_discountday_META_0 = new MCReportMeta("sal_settle_discountday", "", "3", "", true);
	static public final MCReportMeta sal_settle_discountrate_META_0 = new MCReportMeta("sal_settle_discountrate", "", "5,4", "", true);
	static public final MCReportMeta flexmaster1_META_0 = new MCReportMeta("flexmaster1", "", "20", "", true);
	static public final MCReportMeta flexmaster2_META_0 = new MCReportMeta("flexmaster2", "", "20", "", true);
	static public final MCReportMeta flexmaster3_META_0 = new MCReportMeta("flexmaster3", "", "20", "", true);
	static public final MCReportMeta flexmaster4_META_0 = new MCReportMeta("flexmaster4", "", "20", "", true);
	static public final MCReportMeta flexmaster5_META_0 = new MCReportMeta("flexmaster5", "", "20", "", true);
	static public final MCReportMeta flextext1_META_0 = new MCReportMeta("flextext1", "", "100", "", true);
	static public final MCReportMeta flextext2_META_0 = new MCReportMeta("flextext2", "", "100", "", true);
	static public final MCReportMeta flextext3_META_0 = new MCReportMeta("flextext3", "", "100", "", true);
	static public final MCReportMeta flextext4_META_0 = new MCReportMeta("flextext4", "", "100", "", true);
	static public final MCReportMeta flextext5_META_0 = new MCReportMeta("flextext5", "", "100", "", true);
	static public final MCReportMeta h_usermaster_META_0 = new MCReportMeta("h_usermaster", "", "20", "", true);
	static public final MCReportMeta h_usertext_META_0 = new MCReportMeta("h_usertext", "", "100", "", true);
	static public final MCReportMeta h_flexmaster1_ar_META_0 = new MCReportMeta("h_flexmaster1_ar", "", "20", "", true);
	static public final MCReportMeta h_flexmaster2_ar_META_0 = new MCReportMeta("h_flexmaster2_ar", "", "20", "", true);
	static public final MCReportMeta h_flexcode1_ar_META_0 = new MCReportMeta("h_flexcode1_ar", "", "20", "", true);
	static public final MCReportMeta h_flexcode2_ar_META_0 = new MCReportMeta("h_flexcode2_ar", "", "20", "", true);
	static public final MCReportMeta h_flextext1_ar_META_0 = new MCReportMeta("h_flextext1_ar", "", "100", "", true);
	static public final MCReportMeta h_flextext2_ar_META_0 = new MCReportMeta("h_flextext2_ar", "", "100", "", true);
	static public final MCReportMeta h_flextext3_ar_META_0 = new MCReportMeta("h_flextext3_ar", "", "100", "", true);
	static public final MCReportMeta h_flextext4_ar_META_0 = new MCReportMeta("h_flextext4_ar", "", "100", "", true);
	static public final MCReportMeta h_flextext5_ar_META_0 = new MCReportMeta("h_flextext5_ar", "", "100", "", true);
	static public final MCReportMeta pur_vatsummaryset_META_0 = new MCReportMeta("pur_vatsummaryset", "", "1", "", true);
	static public final MCReportMeta pur_taxabletypecode_META_0 = new MCReportMeta("pur_taxabletypecode", "", "20", "", true);
	static public final MCReportMeta pur_currencycode_META_0 = new MCReportMeta("pur_currencycode", "", "20", "", true);
	static public final MCReportMeta pur_ratetypecode_META_0 = new MCReportMeta("pur_ratetypecode", "", "20", "", true);
	static public final MCReportMeta pur_ap_patterncode_META_0 = new MCReportMeta("pur_ap_patterncode", "", "20", "", true);
	static public final MCReportMeta pur_closingdate_META_0 = new MCReportMeta("pur_closingdate", "", "2", "", true);
	static public final MCReportMeta pur_workingdayset_META_0 = new MCReportMeta("pur_workingdayset", "", "1", "", true);
	static public final MCReportMeta pur_monthlymargin_META_0 = new MCReportMeta("pur_monthlymargin", "", "2", "", true);
	static public final MCReportMeta paymentdate_META_0 = new MCReportMeta("paymentdate", "", "2", "", true);
	static public final MCReportMeta delivfromcode_META_0 = new MCReportMeta("delivfromcode", "", "20", "", true);
	static public final MCReportMeta pur_mo_invoiceflag_META_0 = new MCReportMeta("pur_mo_invoiceflag", "", "1", "", true);
	static public final MCReportMeta ap_settlemethod_META_0 = new MCReportMeta("ap_settlemethod", "", "20", "", true);
	static public final MCReportMeta paymentterms_META_0 = new MCReportMeta("paymentterms", "", "100", "", true);
	static public final MCReportMeta pur_valueflag_META_0 = new MCReportMeta("pur_valueflag", "", "1", "", true);
	static public final MCReportMeta pur_ad_patterncode_META_0 = new MCReportMeta("pur_ad_patterncode", "", "20", "", true);
	static public final MCReportMeta pur_settle_discountday_META_0 = new MCReportMeta("pur_settle_discountday", "", "3", "", true);
	static public final MCReportMeta pur_settle_discountrate_META_0 = new MCReportMeta("pur_settle_discountrate", "", "5,4", "", true);
	static public final MCReportMeta h_flexmaster1_ap_META_0 = new MCReportMeta("h_flexmaster1_ap", "", "20", "", true);
	static public final MCReportMeta h_flexmaster2_ap_META_0 = new MCReportMeta("h_flexmaster2_ap", "", "20", "", true);
	static public final MCReportMeta h_flexcode1_ap_META_0 = new MCReportMeta("h_flexcode1_ap", "", "20", "", true);
	static public final MCReportMeta h_flexcode2_ap_META_0 = new MCReportMeta("h_flexcode2_ap", "", "20", "", true);
	static public final MCReportMeta h_flextext1_ap_META_0 = new MCReportMeta("h_flextext1_ap", "", "100", "", true);
	static public final MCReportMeta h_flextext2_ap_META_0 = new MCReportMeta("h_flextext2_ap", "", "100", "", true);
	static public final MCReportMeta h_flextext3_ap_META_0 = new MCReportMeta("h_flextext3_ap", "", "100", "", true);
	static public final MCReportMeta h_flextext4_ap_META_0 = new MCReportMeta("h_flextext4_ap", "", "100", "", true);
	static public final MCReportMeta h_flextext5_ap_META_0 = new MCReportMeta("h_flextext5_ap", "", "100", "", true);
	static public final MCReportMeta commission_pay_META_0 = new MCReportMeta("commission_pay", "", "1", "", true);
	static public final MCReportMeta iraicode_META_0 = new MCReportMeta("iraicode", "", "60", "", true);
	static public final MCReportMeta h_flexmaster1_inv_META_0 = new MCReportMeta("h_flexmaster1_inv", "", "20", "", true);
	static public final MCReportMeta h_flexmaster2_inv_META_0 = new MCReportMeta("h_flexmaster2_inv", "", "20", "", true);
	static public final MCReportMeta h_flexcode1_inv_META_0 = new MCReportMeta("h_flexcode1_inv", "", "100", "", true);
	static public final MCReportMeta h_flexcode2_inv_META_0 = new MCReportMeta("h_flexcode2_inv", "", "100", "", true);
	static public final MCReportMeta h_flextext1_inv_META_0 = new MCReportMeta("h_flextext1_inv", "", "100", "", true);
	static public final MCReportMeta h_flextext2_inv_META_0 = new MCReportMeta("h_flextext2_inv", "", "100", "", true);
	static public final MCReportMeta h_flextext3_inv_META_0 = new MCReportMeta("h_flextext3_inv", "", "100", "", true);
	static public final MCReportMeta h_flextext4_inv_META_0 = new MCReportMeta("h_flextext4_inv", "", "100", "", true);
	static public final MCReportMeta h_flextext5_inv_META_0 = new MCReportMeta("h_flextext5_inv", "", "100", "", true);
	static public final MCReportMeta email_META_0 = new MCReportMeta("email", "", "100", "", true);
	static public final MCReportMeta taxid_META_0 = new MCReportMeta("taxid", "", "20", "", true);
	static public final MCReportMeta overdueextensionaldays_META_0 = new MCReportMeta("overdueextensionaldays", "", "3", "", true);
	static public final MCReportMeta email_cc_META_0 = new MCReportMeta("email_cc", "", "250", "", true);
	static public final MCReportMeta taxid2_META_0 = new MCReportMeta("taxid2", "", "20", "", true);
	static public final MCReportMeta linkageflag_META_0 = new MCReportMeta("linkageflag", "", "1", "", true);
	static public final MCReportMeta linkagecode_META_0 = new MCReportMeta("linkagecode", "", "100", "", true);
	static public final MCReportMeta linkageurl_META_0 = new MCReportMeta("linkageurl", "", "1000", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			code_META_0,
			name_META_0,
			activeflag_META_0,
			searchcharacter_META_0,
			extension_META_0,
			corresptype_META_0,
			zip_META_0,
			address1_META_0,
			address2_META_0,
			tel1_META_0,
			tel2_META_0,
			fax_META_0,
			regioncode_META_0,
			bankacctcode_META_0,
			segmentcode_META_0,
			creditlimitflag_META_0,
			sal_vatsummaryset_META_0,
			sal_taxabletypecode_META_0,
			sal_currencycode_META_0,
			sal_ratetypecode_META_0,
			sal_ar_patterncode_META_0,
			sal_closingdate_META_0,
			sal_workingdayset_META_0,
			sal_monthlymargin_META_0,
			collectdate_META_0,
			delivtocode_META_0,
			sal_mo_invoiceflag_META_0,
			ar_settlemethod_META_0,
			sal_forcondition_META_0,
			receivableterms_META_0,
			sal_valueflag_META_0,
			sal_ad_patterncode_META_0,
			sal_settle_discountday_META_0,
			sal_settle_discountrate_META_0,
			flexmaster1_META_0,
			flexmaster2_META_0,
			flexmaster3_META_0,
			flexmaster4_META_0,
			flexmaster5_META_0,
			flextext1_META_0,
			flextext2_META_0,
			flextext3_META_0,
			flextext4_META_0,
			flextext5_META_0,
			h_usermaster_META_0,
			h_usertext_META_0,
			h_flexmaster1_ar_META_0,
			h_flexmaster2_ar_META_0,
			h_flexcode1_ar_META_0,
			h_flexcode2_ar_META_0,
			h_flextext1_ar_META_0,
			h_flextext2_ar_META_0,
			h_flextext3_ar_META_0,
			h_flextext4_ar_META_0,
			h_flextext5_ar_META_0,
			pur_vatsummaryset_META_0,
			pur_taxabletypecode_META_0,
			pur_currencycode_META_0,
			pur_ratetypecode_META_0,
			pur_ap_patterncode_META_0,
			pur_closingdate_META_0,
			pur_workingdayset_META_0,
			pur_monthlymargin_META_0,
			paymentdate_META_0,
			delivfromcode_META_0,
			pur_mo_invoiceflag_META_0,
			ap_settlemethod_META_0,
			paymentterms_META_0,
			pur_valueflag_META_0,
			pur_ad_patterncode_META_0,
			pur_settle_discountday_META_0,
			pur_settle_discountrate_META_0,
			h_flexmaster1_ap_META_0,
			h_flexmaster2_ap_META_0,
			h_flexcode1_ap_META_0,
			h_flexcode2_ap_META_0,
			h_flextext1_ap_META_0,
			h_flextext2_ap_META_0,
			h_flextext3_ap_META_0,
			h_flextext4_ap_META_0,
			h_flextext5_ap_META_0,
			commission_pay_META_0,
			iraicode_META_0,
			h_flexmaster1_inv_META_0,
			h_flexmaster2_inv_META_0,
			h_flexcode1_inv_META_0,
			h_flexcode2_inv_META_0,
			h_flextext1_inv_META_0,
			h_flextext2_inv_META_0,
			h_flextext3_inv_META_0,
			h_flextext4_inv_META_0,
			h_flextext5_inv_META_0,
			email_META_0,
			taxid_META_0,
			overdueextensionaldays_META_0,
			email_cc_META_0,
			taxid2_META_0,
			linkageflag_META_0,
			linkagecode_META_0,
			linkageurl_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_BpPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

