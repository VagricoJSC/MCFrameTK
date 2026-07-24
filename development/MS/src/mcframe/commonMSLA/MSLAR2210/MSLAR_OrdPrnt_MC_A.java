package mcframe.commonMSLA.MSLAR2210;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;

@SuppressWarnings({"all"})
abstract public class MSLAR_OrdPrnt_MC_A extends MCReportSet {

	static final String _defaultModuleId = "MS";
	static final String _defaultReportId = "MSLAR2210";
	static final String _version = "000000";

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
	static public final MCReportClass DTLL_RC = new MCReportClass("Dtl", mcframe.commonMSLA.MSLAR2210.DtlR.class, MCList.class);

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
	static public final MCReportMeta trd_typ_cd_META_0 = new MCReportMeta("trd_typ_cd", "", "", "", true);
	static public final MCReportMeta data_crud_typ_META_0 = new MCReportMeta("data_crud_typ", "", "", "", true);
	static public final MCReportMeta data_make_dt_META_0 = new MCReportMeta("data_make_dt", "YMDHMS", "", "", true);
	static public final MCReportMeta ext_itm_ord_no_META_0 = new MCReportMeta("ext_itm_ord_no", "", "", "", true);
	static public final MCReportMeta ext_oper_ord_no_META_0 = new MCReportMeta("ext_oper_ord_no", "", "", "", true);
	static public final MCReportMeta itm_ord_typ_META_0 = new MCReportMeta("itm_ord_typ", "", "", "", true);
	static public final MCReportMeta itm_ord_no_META_0 = new MCReportMeta("itm_ord_no", "", "", "", true);
	static public final MCReportMeta oper_ord_no_META_0 = new MCReportMeta("oper_ord_no", "", "", "", true);
	static public final MCReportMeta itm_ord_sts_typ_META_0 = new MCReportMeta("itm_ord_sts_typ", "", "", "", true);
	static public final MCReportMeta oper_ord_sts_typ_META_0 = new MCReportMeta("oper_ord_sts_typ", "", "", "", true);
	static public final MCReportMeta itm_cd_META_0 = new MCReportMeta("itm_cd", "", "", "", true);
	static public final MCReportMeta itm_sub1_META_0 = new MCReportMeta("itm_sub1", "", "", "", true);
	static public final MCReportMeta itm_sub2_META_0 = new MCReportMeta("itm_sub2", "", "", "", true);
	static public final MCReportMeta itm_sub3_META_0 = new MCReportMeta("itm_sub3", "", "", "", true);
	static public final MCReportMeta itm_nm_META_0 = new MCReportMeta("itm_nm", "", "", "", true);
	static public final MCReportMeta ver_no_META_0 = new MCReportMeta("ver_no", "", "", "", true);
	static public final MCReportMeta strg_loc_cd_META_0 = new MCReportMeta("strg_loc_cd", "", "", "", true);
	static public final MCReportMeta strg_loc_nm_META_0 = new MCReportMeta("strg_loc_nm", "", "", "", true);
	static public final MCReportMeta mfg_loc_cd_META_0 = new MCReportMeta("mfg_loc_cd", "", "", "", true);
	static public final MCReportMeta mfg_loc_nm_META_0 = new MCReportMeta("mfg_loc_nm", "", "", "", true);
	static public final MCReportMeta bom_ptn_META_0 = new MCReportMeta("bom_ptn", "", "", "", true);
	static public final MCReportMeta oper_ptn_META_0 = new MCReportMeta("oper_ptn", "", "", "", true);
	static public final MCReportMeta inst_qty_META_0 = new MCReportMeta("inst_qty", "", "", "", true);
	static public final MCReportMeta yield_schd_qty_META_0 = new MCReportMeta("yield_schd_qty", "", "", "", true);
	static public final MCReportMeta po_schd_dt_META_0 = new MCReportMeta("po_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_st_schd_dt_META_0 = new MCReportMeta("mfg_st_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta mfg_end_schd_dt_META_0 = new MCReportMeta("mfg_end_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta strg_schd_dt_META_0 = new MCReportMeta("strg_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta accpt_schd_dt_META_0 = new MCReportMeta("accpt_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_st_schd_dt_META_0 = new MCReportMeta("insp_st_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta insp_end_schd_dt_META_0 = new MCReportMeta("insp_end_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta avl_schd_dt_META_0 = new MCReportMeta("avl_schd_dt", "YMD", "", "", true);
	static public final MCReportMeta master_dt_META_0 = new MCReportMeta("master_dt", "YMD", "", "", true);
	static public final MCReportMeta sno1_META_0 = new MCReportMeta("sno1", "", "", "", true);
	static public final MCReportMeta sno2_META_0 = new MCReportMeta("sno2", "", "", "", true);
	static public final MCReportMeta sno3_META_0 = new MCReportMeta("sno3", "", "", "", true);
	static public final MCReportMeta sno4_META_0 = new MCReportMeta("sno4", "", "", "", true);
	static public final MCReportMeta inst_po_cnt_rmrks_META_0 = new MCReportMeta("inst_po_cnt_rmrks", "", "", "", true);
	static public final MCReportMeta itm_ord_intr_rmrks_META_0 = new MCReportMeta("itm_ord_intr_rmrks", "", "", "", true);
	static public final MCReportMeta itm_ord_sub_char1_META_0 = new MCReportMeta("itm_ord_sub_char1", "", "", "", true);
	static public final MCReportMeta itm_ord_sub_char2_META_0 = new MCReportMeta("itm_ord_sub_char2", "", "", "", true);
	static public final MCReportMeta itm_ord_sub_char3_META_0 = new MCReportMeta("itm_ord_sub_char3", "", "", "", true);
	static public final MCReportMeta st_schd_tm_META_0 = new MCReportMeta("st_schd_tm", "YMDHMS", "", "", true);
	static public final MCReportMeta end_schd_tm_META_0 = new MCReportMeta("end_schd_tm", "YMDHMS", "", "", true);
	static public final MCReportMeta oper_schd_qty_META_0 = new MCReportMeta("oper_schd_qty", "", "", "", true);
	static public final MCReportMeta scheduler_frozen_flg_META_0 = new MCReportMeta("scheduler_frozen_flg", "", "", "", true);
	static public final MCReportMeta disp_seq_META_0 = new MCReportMeta("disp_seq", "", "", "", true);
	static public final MCReportMeta oper_cd_META_0 = new MCReportMeta("oper_cd", "", "", "", true);
	static public final MCReportMeta oper_nm_META_0 = new MCReportMeta("oper_nm", "", "", "", true);
	static public final MCReportMeta oper_seq_META_0 = new MCReportMeta("oper_seq", "", "", "", true);
	static public final MCReportMeta loc_cd_META_0 = new MCReportMeta("loc_cd", "", "", "", true);
	static public final MCReportMeta loc_nm_META_0 = new MCReportMeta("loc_nm", "", "", "", true);
	static public final MCReportMeta oper_rsrc_META_0 = new MCReportMeta("oper_rsrc", "", "", "", true);
	static public final MCReportMeta oper_ord_intr_rmrks_META_0 = new MCReportMeta("oper_ord_intr_rmrks", "", "", "", true);
	static public final MCReportMeta oper_ord_sub_char1_META_0 = new MCReportMeta("oper_ord_sub_char1", "", "", "", true);
	static public final MCReportMeta oper_ord_sub_char2_META_0 = new MCReportMeta("oper_ord_sub_char2", "", "", "", true);
	static public final MCReportMeta oper_ord_sub_char3_META_0 = new MCReportMeta("oper_ord_sub_char3", "", "", "", true);
	static public final MCReportMeta co_cd_META_0 = new MCReportMeta("co_cd", "", "", "", true);
	static public final MCReportMeta co_nm_META_0 = new MCReportMeta("co_nm", "", "", "", true);
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
			trd_typ_cd_META_0,
			data_crud_typ_META_0,
			data_make_dt_META_0,
			ext_itm_ord_no_META_0,
			ext_oper_ord_no_META_0,
			itm_ord_typ_META_0,
			itm_ord_no_META_0,
			oper_ord_no_META_0,
			itm_ord_sts_typ_META_0,
			oper_ord_sts_typ_META_0,
			itm_cd_META_0,
			itm_sub1_META_0,
			itm_sub2_META_0,
			itm_sub3_META_0,
			itm_nm_META_0,
			ver_no_META_0,
			strg_loc_cd_META_0,
			strg_loc_nm_META_0,
			mfg_loc_cd_META_0,
			mfg_loc_nm_META_0,
			bom_ptn_META_0,
			oper_ptn_META_0,
			inst_qty_META_0,
			yield_schd_qty_META_0,
			po_schd_dt_META_0,
			mfg_st_schd_dt_META_0,
			mfg_end_schd_dt_META_0,
			strg_schd_dt_META_0,
			accpt_schd_dt_META_0,
			insp_st_schd_dt_META_0,
			insp_end_schd_dt_META_0,
			avl_schd_dt_META_0,
			master_dt_META_0,
			sno1_META_0,
			sno2_META_0,
			sno3_META_0,
			sno4_META_0,
			inst_po_cnt_rmrks_META_0,
			itm_ord_intr_rmrks_META_0,
			itm_ord_sub_char1_META_0,
			itm_ord_sub_char2_META_0,
			itm_ord_sub_char3_META_0,
			st_schd_tm_META_0,
			end_schd_tm_META_0,
			oper_schd_qty_META_0,
			scheduler_frozen_flg_META_0,
			disp_seq_META_0,
			oper_cd_META_0,
			oper_nm_META_0,
			oper_seq_META_0,
			loc_cd_META_0,
			loc_nm_META_0,
			oper_rsrc_META_0,
			oper_ord_intr_rmrks_META_0,
			oper_ord_sub_char1_META_0,
			oper_ord_sub_char2_META_0,
			oper_ord_sub_char3_META_0,
			co_cd_META_0,
			co_nm_META_0,
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
	protected MSLAR_OrdPrnt_MC_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

