package mcframe.commonPFBB.PFBBR5200;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class PFBBR_AccountPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "PF";
	static final String _defaultReportId = "PFBBR5200";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonPFBB.PFBBR5200.DtlR.class, MCList.class);

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
	static public final MCReportMeta name_META_0 = new MCReportMeta("name", "", "100", "", true);
	static public final MCReportMeta activeflag_META_0 = new MCReportMeta("activeflag", "", "1", "", true);
	static public final MCReportMeta extension_META_0 = new MCReportMeta("extension", "", "2", "", true);
	static public final MCReportMeta searchcharacter_META_0 = new MCReportMeta("searchcharacter", "", "1", "", true);
	static public final MCReportMeta accounttype_META_0 = new MCReportMeta("accounttype", "", "4", "", true);
	static public final MCReportMeta sp_accounttype_META_0 = new MCReportMeta("sp_accounttype", "", "3", "", true);
	static public final MCReportMeta currencycode_META_0 = new MCReportMeta("currencycode", "", "20", "", true);
	static public final MCReportMeta ratetypecode_META_0 = new MCReportMeta("ratetypecode", "", "20", "", true);
	static public final MCReportMeta reval_ratetypecode_META_0 = new MCReportMeta("reval_ratetypecode", "", "20", "", true);
	static public final MCReportMeta cnsr_ratetype1_META_0 = new MCReportMeta("cnsr_ratetype1", "", "2", "", true);
	static public final MCReportMeta cnsr_ratetype2_META_0 = new MCReportMeta("cnsr_ratetype2", "", "2", "", true);
	static public final MCReportMeta subincludeflag_META_0 = new MCReportMeta("subincludeflag", "", "1", "", true);
	static public final MCReportMeta appraisalconvflag_META_0 = new MCReportMeta("appraisalconvflag", "", "1", "", true);
	static public final MCReportMeta vat_flag_META_0 = new MCReportMeta("vat_flag", "", "1", "", true);
	static public final MCReportMeta reversingflag_META_0 = new MCReportMeta("reversingflag", "", "1", "", true);
	static public final MCReportMeta aparappraisalflag_META_0 = new MCReportMeta("aparappraisalflag", "", "1", "", true);
	static public final MCReportMeta aparreversingflag_META_0 = new MCReportMeta("aparreversingflag", "", "1", "", true);
	static public final MCReportMeta tax_ac_flag_META_0 = new MCReportMeta("tax_ac_flag", "", "1", "", true);
	static public final MCReportMeta taxablecode_META_0 = new MCReportMeta("taxablecode", "", "20", "", true);
	static public final MCReportMeta taxtype_META_0 = new MCReportMeta("taxtype", "", "1", "", true);
	static public final MCReportMeta taxabletype_META_0 = new MCReportMeta("taxabletype", "", "2", "", true);
	static public final MCReportMeta openup_ar_META_0 = new MCReportMeta("openup_ar", "", "1", "", true);
	static public final MCReportMeta openup_ap_META_0 = new MCReportMeta("openup_ap", "", "1", "", true);
	static public final MCReportMeta openup_acc_META_0 = new MCReportMeta("openup_acc", "", "1", "", true);
	static public final MCReportMeta correspondentset_META_0 = new MCReportMeta("correspondentset", "", "1", "", true);
	static public final MCReportMeta descriptcontrol_META_0 = new MCReportMeta("descriptcontrol", "", "1", "", true);
	static public final MCReportMeta usermaster1control_META_0 = new MCReportMeta("usermaster1control", "", "1", "", true);
	static public final MCReportMeta usermaster2control_META_0 = new MCReportMeta("usermaster2control", "", "1", "", true);
	static public final MCReportMeta usermaster3control_META_0 = new MCReportMeta("usermaster3control", "", "1", "", true);
	static public final MCReportMeta usermaster4control_META_0 = new MCReportMeta("usermaster4control", "", "1", "", true);
	static public final MCReportMeta usermaster5control_META_0 = new MCReportMeta("usermaster5control", "", "1", "", true);
	static public final MCReportMeta usercodecontrol_META_0 = new MCReportMeta("usercodecontrol", "", "1", "", true);
	static public final MCReportMeta usertextcontrol_META_0 = new MCReportMeta("usertextcontrol", "", "1", "", true);
	static public final MCReportMeta userdatecontrol_META_0 = new MCReportMeta("userdatecontrol", "", "1", "", true);
	static public final MCReportMeta userqtycontrol_META_0 = new MCReportMeta("userqtycontrol", "", "1", "", true);
	static public final MCReportMeta correspondentsummary_META_0 = new MCReportMeta("correspondentsummary", "", "1", "", true);
	static public final MCReportMeta usermaster1summary_META_0 = new MCReportMeta("usermaster1summary", "", "1", "", true);
	static public final MCReportMeta usermaster2summary_META_0 = new MCReportMeta("usermaster2summary", "", "1", "", true);
	static public final MCReportMeta usermaster3summary_META_0 = new MCReportMeta("usermaster3summary", "", "1", "", true);
	static public final MCReportMeta usermaster4summary_META_0 = new MCReportMeta("usermaster4summary", "", "1", "", true);
	static public final MCReportMeta usermaster5summary_META_0 = new MCReportMeta("usermaster5summary", "", "1", "", true);
	static public final MCReportMeta userdatesummary_META_0 = new MCReportMeta("userdatesummary", "", "1", "", true);
	static public final MCReportMeta userqtysummary_META_0 = new MCReportMeta("userqtysummary", "", "1", "", true);
	static public final MCReportMeta pc_ratetype1_META_0 = new MCReportMeta("pc_ratetype1", "", "20", "", true);
	static public final MCReportMeta pc_exchangetype1_META_0 = new MCReportMeta("pc_exchangetype1", "", "1", "", true);
	static public final MCReportMeta pc_ratetype2_META_0 = new MCReportMeta("pc_ratetype2", "", "20", "", true);
	static public final MCReportMeta pc_exchangetype2_META_0 = new MCReportMeta("pc_exchangetype2", "", "1", "", true);
	static public final MCReportMeta pc_ratetype3_META_0 = new MCReportMeta("pc_ratetype3", "", "20", "", true);
	static public final MCReportMeta pc_exchangetype3_META_0 = new MCReportMeta("pc_exchangetype3", "", "1", "", true);
	static public final MCReportMeta safetybalancefc_META_0 = new MCReportMeta("safetybalancefc", "", "17", "", true);
	static public final MCReportMeta fstype_META_0 = new MCReportMeta("fstype", "", "20", "", true);
	static public final MCReportMeta beginend_META_0 = new MCReportMeta("beginend", "", "1", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			rectype_META_0,
			precode_META_0,
			name_META_0,
			activeflag_META_0,
			extension_META_0,
			searchcharacter_META_0,
			accounttype_META_0,
			sp_accounttype_META_0,
			currencycode_META_0,
			ratetypecode_META_0,
			reval_ratetypecode_META_0,
			cnsr_ratetype1_META_0,
			cnsr_ratetype2_META_0,
			subincludeflag_META_0,
			appraisalconvflag_META_0,
			vat_flag_META_0,
			reversingflag_META_0,
			aparappraisalflag_META_0,
			aparreversingflag_META_0,
			tax_ac_flag_META_0,
			taxablecode_META_0,
			taxtype_META_0,
			taxabletype_META_0,
			openup_ar_META_0,
			openup_ap_META_0,
			openup_acc_META_0,
			correspondentset_META_0,
			descriptcontrol_META_0,
			usermaster1control_META_0,
			usermaster2control_META_0,
			usermaster3control_META_0,
			usermaster4control_META_0,
			usermaster5control_META_0,
			usercodecontrol_META_0,
			usertextcontrol_META_0,
			userdatecontrol_META_0,
			userqtycontrol_META_0,
			correspondentsummary_META_0,
			usermaster1summary_META_0,
			usermaster2summary_META_0,
			usermaster3summary_META_0,
			usermaster4summary_META_0,
			usermaster5summary_META_0,
			userdatesummary_META_0,
			userqtysummary_META_0,
			pc_ratetype1_META_0,
			pc_exchangetype1_META_0,
			pc_ratetype2_META_0,
			pc_exchangetype2_META_0,
			pc_ratetype3_META_0,
			pc_exchangetype3_META_0,
			safetybalancefc_META_0,
			fstype_META_0,
			beginend_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected PFBBR_AccountPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

