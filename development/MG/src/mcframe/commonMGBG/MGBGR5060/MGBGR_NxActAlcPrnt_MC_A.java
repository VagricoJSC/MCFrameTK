package mcframe.commonMGBG.MGBGR5060;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MGBGR_NxActAlcPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MG";
	static final String _defaultReportId = "MGBGR5060";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMGBG.MGBGR5060.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta kai_code_META_0 = new MCReportMeta("kai_code", "", "", "", true);
	static public final MCReportMeta fy_META_0 = new MCReportMeta("fy", "", "", "", true);
	static public final MCReportMeta gtd_META_0 = new MCReportMeta("gtd", "", "", "", true);
	static public final MCReportMeta ksn_kbn_META_0 = new MCReportMeta("ksn_kbn", "", "", "", true);
	static public final MCReportMeta kmk_code_META_0 = new MCReportMeta("kmk_code", "", "10", "", true);
	static public final MCReportMeta hkm_code_META_0 = new MCReportMeta("hkm_code", "", "10", "", true);
	static public final MCReportMeta bmn_code_META_0 = new MCReportMeta("bmn_code", "", "20", "", true);
	static public final MCReportMeta fc1_META_0 = new MCReportMeta("fc1", "", "50", "", true);
	static public final MCReportMeta fc2_META_0 = new MCReportMeta("fc2", "", "50", "", true);
	static public final MCReportMeta fc3_META_0 = new MCReportMeta("fc3", "", "50", "", true);
	static public final MCReportMeta fc4_META_0 = new MCReportMeta("fc4", "", "50", "", true);
	static public final MCReportMeta prj_code_META_0 = new MCReportMeta("prj_code", "", "50", "", true);
	static public final MCReportMeta dr_zan_META_0 = new MCReportMeta("dr_zan", "", "21,8", "", true);
	static public final MCReportMeta cr_zan_META_0 = new MCReportMeta("cr_zan", "", "21,8", "", true);
	static public final MCReportMeta dr_zan_hif_META_0 = new MCReportMeta("dr_zan_hif", "", "21,8", "", true);
	static public final MCReportMeta cr_zan_hif_META_0 = new MCReportMeta("cr_zan_hif", "", "21,8", "", true);
	static public final MCReportMeta tor_cur_code_META_0 = new MCReportMeta("tor_cur_code", "", "", "", true);
	static public final MCReportMeta dr_tor_cur_zan_META_0 = new MCReportMeta("dr_tor_cur_zan", "", "", "", true);
	static public final MCReportMeta cr_tor_cur_zan_META_0 = new MCReportMeta("cr_tor_cur_zan", "", "", "", true);
	static public final MCReportMeta accrual_fy_META_0 = new MCReportMeta("accrual_fy", "", "", "", true);
	static public final MCReportMeta seido_sokyu_kbn_META_0 = new MCReportMeta("seido_sokyu_kbn", "", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			kai_code_META_0,
			fy_META_0,
			gtd_META_0,
			ksn_kbn_META_0,
			kmk_code_META_0,
			hkm_code_META_0,
			bmn_code_META_0,
			fc1_META_0,
			fc2_META_0,
			fc3_META_0,
			fc4_META_0,
			prj_code_META_0,
			dr_zan_META_0,
			cr_zan_META_0,
			dr_zan_hif_META_0,
			cr_zan_hif_META_0,
			tor_cur_code_META_0,
			dr_tor_cur_zan_META_0,
			cr_tor_cur_zan_META_0,
			accrual_fy_META_0,
			seido_sokyu_kbn_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MGBGR_NxActAlcPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

