package mcframe.commonPFBB.PFBBR5210;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_SubAccountPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5210";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5210.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta rectype_META_0 = new MCReportMeta("rectype", "", "1", "", true);
	static public final MCReportMeta precode_META_0 = new MCReportMeta("precode", "", "20", "", true);
	static public final MCReportMeta code_META_0 = new MCReportMeta("code", "", "20", "", true);
	static public final MCReportMeta name_META_0 = new MCReportMeta("name", "", "100", "", true);
	static public final MCReportMeta activeflag_META_0 = new MCReportMeta("activeflag", "", "1", "", true);
	static public final MCReportMeta extension_META_0 = new MCReportMeta("extension", "", "2", "", true);
	static public final MCReportMeta searchcharacter_META_0 = new MCReportMeta("searchcharacter", "", "1", "", true);
	static public final MCReportMeta currencycode_META_0 = new MCReportMeta("currencycode", "", "20", "", true);
	static public final MCReportMeta ratetypecode_META_0 = new MCReportMeta("ratetypecode", "", "20", "", true);
	static public final MCReportMeta reval_ratetypecode_META_0 = new MCReportMeta("reval_ratetypecode", "", "20", "", true);
	static public final MCReportMeta cnsr_ratetype1_META_0 = new MCReportMeta("cnsr_ratetype1", "", "2", "", true);
	static public final MCReportMeta cnsr_ratetype2_META_0 = new MCReportMeta("cnsr_ratetype2", "", "2", "", true);
	static public final MCReportMeta appraisalconvflag_META_0 = new MCReportMeta("appraisalconvflag", "", "1", "", true);
	static public final MCReportMeta vat_flag_META_0 = new MCReportMeta("vat_flag", "", "1", "", true);
	static public final MCReportMeta reversingflag_META_0 = new MCReportMeta("reversingflag", "", "1", "", true);
	static public final MCReportMeta aparappraisalflag_META_0 = new MCReportMeta("aparappraisalflag", "", "1", "", true);
	static public final MCReportMeta aparreversingflag_META_0 = new MCReportMeta("aparreversingflag", "", "1", "", true);
	static public final MCReportMeta tax_ac_flag_META_0 = new MCReportMeta("tax_ac_flag", "", "1", "", true);
	static public final MCReportMeta taxablecode_META_0 = new MCReportMeta("taxablecode", "", "20", "", true);
	static public final MCReportMeta openup_ar_META_0 = new MCReportMeta("openup_ar", "", "1", "", true);
	static public final MCReportMeta openup_ap_META_0 = new MCReportMeta("openup_ap", "", "1", "", true);
	static public final MCReportMeta openup_acc_META_0 = new MCReportMeta("openup_acc", "", "1", "", true);
	static public final MCReportMeta safetybalancefc_META_0 = new MCReportMeta("safetybalancefc", "", "17,2", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			rectype_META_0,
			precode_META_0,
			code_META_0,
			name_META_0,
			activeflag_META_0,
			extension_META_0,
			searchcharacter_META_0,
			currencycode_META_0,
			ratetypecode_META_0,
			reval_ratetypecode_META_0,
			cnsr_ratetype1_META_0,
			cnsr_ratetype2_META_0,
			appraisalconvflag_META_0,
			vat_flag_META_0,
			reversingflag_META_0,
			aparappraisalflag_META_0,
			aparreversingflag_META_0,
			tax_ac_flag_META_0,
			taxablecode_META_0,
			openup_ar_META_0,
			openup_ap_META_0,
			openup_acc_META_0,
			safetybalancefc_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_SubAccountPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

