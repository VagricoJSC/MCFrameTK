package mcframe.commonMSLA.MSLAR2250;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_OrdSndBomPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2250";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR2250.DtlR.class, MCList.class);

	static public final MCReportClassList rowClassList = new MCReportClassList(
		MCReportSet.rowClassList,
		DTLL_RC
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
	static public final MCReportMeta data_lno_META_0 = new MCReportMeta("data_lno", "", "", "", true);
	static public final MCReportMeta data_no_META_0 = new MCReportMeta("data_no", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHMS", "", "", true);
	static public final MCReportMeta wg_cd_META_0 = new MCReportMeta("wg_cd", "", "", "", true);
	static public final MCReportMeta par_itm_cd_META_0 = new MCReportMeta("par_itm_cd", "", "", "", true);
	static public final MCReportMeta par_itm_sub1_META_0 = new MCReportMeta("par_itm_sub1", "", "", "", true);
	static public final MCReportMeta par_itm_sub2_META_0 = new MCReportMeta("par_itm_sub2", "", "", "", true);
	static public final MCReportMeta par_itm_sub3_META_0 = new MCReportMeta("par_itm_sub3", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta chd_itm_cd_META_0 = new MCReportMeta("chd_itm_cd", "", "", "", true);
	static public final MCReportMeta chd_itm_sub1_META_0 = new MCReportMeta("chd_itm_sub1", "", "", "", true);
	static public final MCReportMeta chd_itm_sub2_META_0 = new MCReportMeta("chd_itm_sub2", "", "", "", true);
	static public final MCReportMeta chd_itm_sub3_META_0 = new MCReportMeta("chd_itm_sub3", "", "", "", true);
	static public final MCReportMeta st_dt_META_0 = new MCReportMeta("st_dt", "YMD", "", "", true);
	static public final MCReportMeta end_dt_META_0 = new MCReportMeta("end_dt", "YMD", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta ph_flg_META_0 = new MCReportMeta("ph_flg", "", "", "", true);
	static public final MCReportMeta ph_bom_ptn_META_0 = new MCReportMeta("ph_bom_ptn", "", "", "", true);
	static public final MCReportMeta alt_grp_cd_META_0 = new MCReportMeta("alt_grp_cd", "", "", "", true);
	static public final MCReportMeta alt_grp_seq_META_0 = new MCReportMeta("alt_grp_seq", "", "", "", true);
	static public final MCReportMeta alt_itm_typ_META_0 = new MCReportMeta("alt_itm_typ", "", "", "", true);
	static public final MCReportMeta alt_itm_ratio_META_0 = new MCReportMeta("alt_itm_ratio", "", "", "", true);
	static public final MCReportMeta alt_alloc_prio_META_0 = new MCReportMeta("alt_alloc_prio", "", "", "", true);
	static public final MCReportMeta par_inst_qty_META_0 = new MCReportMeta("par_inst_qty", "", "", "", true);
	static public final MCReportMeta chd_rqmt_qty_META_0 = new MCReportMeta("chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta fxd_chd_rqmt_qty_META_0 = new MCReportMeta("fxd_chd_rqmt_qty", "", "", "", true);
	static public final MCReportMeta sno_typ1_META_0 = new MCReportMeta("sno_typ1", "", "", "", true);
	static public final MCReportMeta min_sno1_META_0 = new MCReportMeta("min_sno1", "", "", "", true);
	static public final MCReportMeta max_sno1_META_0 = new MCReportMeta("max_sno1", "", "", "", true);
	static public final MCReportMeta sno_typ2_META_0 = new MCReportMeta("sno_typ2", "", "", "", true);
	static public final MCReportMeta min_sno2_META_0 = new MCReportMeta("min_sno2", "", "", "", true);
	static public final MCReportMeta max_sno2_META_0 = new MCReportMeta("max_sno2", "", "", "", true);
	static public final MCReportMeta sno_typ3_META_0 = new MCReportMeta("sno_typ3", "", "", "", true);
	static public final MCReportMeta min_sno3_META_0 = new MCReportMeta("min_sno3", "", "", "", true);
	static public final MCReportMeta max_sno3_META_0 = new MCReportMeta("max_sno3", "", "", "", true);
	static public final MCReportMeta sno_typ4_META_0 = new MCReportMeta("sno_typ4", "", "", "", true);
	static public final MCReportMeta min_sno4_META_0 = new MCReportMeta("min_sno4", "", "", "", true);
	static public final MCReportMeta max_sno4_META_0 = new MCReportMeta("max_sno4", "", "", "", true);
	static public final MCReportMeta in_offst_typ_META_0 = new MCReportMeta("in_offst_typ", "", "", "", true);
	static public final MCReportMeta in_offst_META_0 = new MCReportMeta("in_offst", "", "", "", true);
	static public final MCReportMeta inpt_ctl_typ_META_0 = new MCReportMeta("inpt_ctl_typ", "", "", "", true);
	static public final MCReportMeta sub_char1_META_0 = new MCReportMeta("sub_char1", "", "", "", true);
	static public final MCReportMeta sub_char2_META_0 = new MCReportMeta("sub_char2", "", "", "", true);
	static public final MCReportMeta sub_char3_META_0 = new MCReportMeta("sub_char3", "", "", "", true);
	static public final MCReportMeta sub_char4_META_0 = new MCReportMeta("sub_char4", "", "", "", true);
	static public final MCReportMeta sub_char5_META_0 = new MCReportMeta("sub_char5", "", "", "", true);
	static public final MCReportMeta sub_char6_META_0 = new MCReportMeta("sub_char6", "", "", "", true);
	static public final MCReportMeta sub_char7_META_0 = new MCReportMeta("sub_char7", "", "", "", true);
	static public final MCReportMeta sub_char8_META_0 = new MCReportMeta("sub_char8", "", "", "", true);
	static public final MCReportMeta sub_char9_META_0 = new MCReportMeta("sub_char9", "", "", "", true);
	static public final MCReportMeta sub_char10_META_0 = new MCReportMeta("sub_char10", "", "", "", true);
	static public final MCReportMeta sub_char11_META_0 = new MCReportMeta("sub_char11", "", "", "", true);
	static public final MCReportMeta sub_char12_META_0 = new MCReportMeta("sub_char12", "", "", "", true);
	static public final MCReportMeta sub_char13_META_0 = new MCReportMeta("sub_char13", "", "", "", true);
	static public final MCReportMeta sub_char14_META_0 = new MCReportMeta("sub_char14", "", "", "", true);
	static public final MCReportMeta sub_char15_META_0 = new MCReportMeta("sub_char15", "", "", "", true);
	static public final MCReportMeta sub_char16_META_0 = new MCReportMeta("sub_char16", "", "", "", true);
	static public final MCReportMeta sub_char17_META_0 = new MCReportMeta("sub_char17", "", "", "", true);
	static public final MCReportMeta sub_char18_META_0 = new MCReportMeta("sub_char18", "", "", "", true);
	static public final MCReportMeta sub_char19_META_0 = new MCReportMeta("sub_char19", "", "", "", true);
	static public final MCReportMeta sub_char20_META_0 = new MCReportMeta("sub_char20", "", "", "", true);
	static public final MCReportMeta sub_char21_META_0 = new MCReportMeta("sub_char21", "", "", "", true);
	static public final MCReportMeta sub_char22_META_0 = new MCReportMeta("sub_char22", "", "", "", true);
	static public final MCReportMeta sub_char23_META_0 = new MCReportMeta("sub_char23", "", "", "", true);
	static public final MCReportMeta sub_char24_META_0 = new MCReportMeta("sub_char24", "", "", "", true);
	static public final MCReportMeta sub_char25_META_0 = new MCReportMeta("sub_char25", "", "", "", true);
	static public final MCReportMeta sub_char26_META_0 = new MCReportMeta("sub_char26", "", "", "", true);
	static public final MCReportMeta sub_char27_META_0 = new MCReportMeta("sub_char27", "", "", "", true);
	static public final MCReportMeta sub_char28_META_0 = new MCReportMeta("sub_char28", "", "", "", true);
	static public final MCReportMeta sub_char29_META_0 = new MCReportMeta("sub_char29", "", "", "", true);
	static public final MCReportMeta sub_char30_META_0 = new MCReportMeta("sub_char30", "", "", "", true);
	static public final MCReportMeta sub_num1_META_0 = new MCReportMeta("sub_num1", "", "", "", true);
	static public final MCReportMeta sub_num2_META_0 = new MCReportMeta("sub_num2", "", "", "", true);
	static public final MCReportMeta sub_num3_META_0 = new MCReportMeta("sub_num3", "", "", "", true);
	static public final MCReportMeta sub_num4_META_0 = new MCReportMeta("sub_num4", "", "", "", true);
	static public final MCReportMeta sub_num5_META_0 = new MCReportMeta("sub_num5", "", "", "", true);
	static public final MCReportMeta sub_dt1_META_0 = new MCReportMeta("sub_dt1", "YMD", "", "", true);
	static public final MCReportMeta sub_dt2_META_0 = new MCReportMeta("sub_dt2", "YMD", "", "", true);
	static public final MCReportMeta sub_dt3_META_0 = new MCReportMeta("sub_dt3", "YMD", "", "", true);
	static public final MCReportMeta sub_dt4_META_0 = new MCReportMeta("sub_dt4", "YMD", "", "", true);
	static public final MCReportMeta sub_dt5_META_0 = new MCReportMeta("sub_dt5", "YMD", "", "", true);

	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(MCReportSet.reportMetaMap);
	static{
		reportMetaMap.add("Dtl",
			data_lno_META_0,
			data_no_META_0,
			data_make_dt_META_0,
			wg_cd_META_0,
			par_itm_cd_META_0,
			par_itm_sub1_META_0,
			par_itm_sub2_META_0,
			par_itm_sub3_META_0,
			bom_ptn_META_0,
			oper_cd_META_0,
			oper_seq_META_0,
			chd_itm_cd_META_0,
			chd_itm_sub1_META_0,
			chd_itm_sub2_META_0,
			chd_itm_sub3_META_0,
			st_dt_META_0,
			end_dt_META_0,
			ver_no_META_0,
			ph_flg_META_0,
			ph_bom_ptn_META_0,
			alt_grp_cd_META_0,
			alt_grp_seq_META_0,
			alt_itm_typ_META_0,
			alt_itm_ratio_META_0,
			alt_alloc_prio_META_0,
			par_inst_qty_META_0,
			chd_rqmt_qty_META_0,
			fxd_chd_rqmt_qty_META_0,
			sno_typ1_META_0,
			min_sno1_META_0,
			max_sno1_META_0,
			sno_typ2_META_0,
			min_sno2_META_0,
			max_sno2_META_0,
			sno_typ3_META_0,
			min_sno3_META_0,
			max_sno3_META_0,
			sno_typ4_META_0,
			min_sno4_META_0,
			max_sno4_META_0,
			in_offst_typ_META_0,
			in_offst_META_0,
			inpt_ctl_typ_META_0,
			sub_char1_META_0,
			sub_char2_META_0,
			sub_char3_META_0,
			sub_char4_META_0,
			sub_char5_META_0,
			sub_char6_META_0,
			sub_char7_META_0,
			sub_char8_META_0,
			sub_char9_META_0,
			sub_char10_META_0,
			sub_char11_META_0,
			sub_char12_META_0,
			sub_char13_META_0,
			sub_char14_META_0,
			sub_char15_META_0,
			sub_char16_META_0,
			sub_char17_META_0,
			sub_char18_META_0,
			sub_char19_META_0,
			sub_char20_META_0,
			sub_char21_META_0,
			sub_char22_META_0,
			sub_char23_META_0,
			sub_char24_META_0,
			sub_char25_META_0,
			sub_char26_META_0,
			sub_char27_META_0,
			sub_char28_META_0,
			sub_char29_META_0,
			sub_char30_META_0,
			sub_num1_META_0,
			sub_num2_META_0,
			sub_num3_META_0,
			sub_num4_META_0,
			sub_num5_META_0,
			sub_dt1_META_0,
			sub_dt2_META_0,
			sub_dt3_META_0,
			sub_dt4_META_0,
			sub_dt5_META_0
		);
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected MSLAR_OrdSndBomPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

