package mcframe.serverMSBC.MSBCL0100;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBCL0100_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0100_MST_ITM_ORDER_S01() {
		MCTempView S0_W = createTempView("W");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_MRPRQMT_ALLOC_PLN_R S1_T2 = MSVT_MRPRQMT_ALLOC_PLN_R.create("T2");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S1_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S1_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S1_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S1_M7 = MAM_WG_R.create("M7");
		MAM_LOC_R S1_M8 = MAM_LOC_R.create("M8");
		MSW_ITM_ORDER_KEY_R S2_M = MSW_ITM_ORDER_KEY_R.create("M");
		MST_IO_SCHD_R S3_T1 = MST_IO_SCHD_R.create("T1");
		MSVT_MRPRQMT_ALLOC_PLN_R S3_T2 = MSVT_MRPRQMT_ALLOC_PLN_R.create("T2");
		MST_SLO_D_R S3_T5 = MST_SLO_D_R.create("T5");
		MST_SLO_R S3_T6 = MST_SLO_R.create("T6");
		MAM_ITM_R S3_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S3_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_UNIT_R S3_M2 = MAM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S3_M10 = MAVM_ITM_UNIT_R.create("M10");
		MAM_BP_R S3_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S3_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S3_M7 = MAM_WG_R.create("M7");
		MAM_BP_R S3_M8 = MAM_BP_R.create("M8");
		MAM_STK_GD_R S3_M9 = MAM_STK_GD_R.create("M9");
		MAM_BP_R S3_M11 = MAM_BP_R.create("M11");
		MAM_BP_R S3_M12 = MAM_BP_R.create("M12");
		MSW_ITM_ORDER_KEY_R S4_M = MSW_ITM_ORDER_KEY_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0100_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(S0_W.prAll())
					.from(
						subQuery()
						.select(
							value(1).as("wk_sort_num"),
							value(MSC_ORD_EXT_DAT_TYP.ORD.value()).as("ord_ext_dat_typ"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							nvl(
								S1_M20.itm_nm,
								S1_M1.itm_nm
							).as("itm_nm"),
							S1_T1.itm_ord_sts_typ,
							S1_T1.strg_loc_cd,
							S1_M8.loc_nm.as("strg_loc_nm"),
							S1_T1.inst_qty,
							S1_T1.yield_schd_qty,
							S1_M1.unit_cd.as("base_unit_cd"),
							S1_M2.unit_nm.as("base_unit_nm"),
							S1_M10.dec_place.as("base_dec_place"),
							S1_T1.po_schd_dt,
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							S1_T1.strg_schd_dt,
							S1_T1.accpt_schd_dt,
							S1_T1.insp_st_schd_dt,
							S1_T1.insp_end_schd_dt,
							S1_T1.avl_schd_dt,
							S1_T1.mfg_loc_cd,
							S1_M3.loc_nm.as("mfg_loc_nm"),
							S1_T1.sppl_cd,
							S1_M4.bp_nm.as("sppl_nm"),
							S1_T1.maker_cd,
							S1_M5.bp_nm.as("maker_nm"),
							S1_T1.gi_schd_dt,
							S1_T1.rqst_loc_cd,
							S1_M6.loc_nm.as("rqst_loc_nm"),
							S1_T1.rqst_wg_cd,
							S1_M7.wg_nm.as("rqst_wg_nm"),
							S1_T1.bom_ptn,
							S1_T1.oper_ptn,
							S1_T1.intr_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.itm_ord_no,
							nullValue().as("slo_no"),
							nullValue().as("slo_d_no"),
							nullValue().as("dlv_cd"),
							nullValue().as("dlv_nm"),
							nullValue().as("cst_cd"),
							nullValue().as("cst_nm"),
							nullValue().as("base_unit_qty"),
							nullValue().as("in_xfr_typ"),
							nullValue().as("quality_typ"),
							nullValue().as("stk_insp_typ"),
							nullValue().as("stk_id_typ"),
							nullValue().as("asst_typ"),
							nullValue().as("gd_cd"),
							nullValue().as("gd_nm"),
							nullValue().as("stk_bp_cd"),
							nullValue().as("bp_nm"),
							nullValue().as("io_schd_typ"),
							nullValue().as("io_schd_sts_typ"),
							nullValue().as("io_schd_no")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								bracket(
									value(0).eq(value(0))
									.and(S1_T2.chd_io_schd_pr_no.isNotNull())
									.and(S1_T2.chd_io_schd_pr_no.eq(S1_T1.itm_ord_no))
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M1.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									S1_T1.itm_cd.eq(S1_M20.itm_cd)
									.and(S1_T1.itm_sub1.eq(S1_M20.itm_sub1))
									.and(S1_T1.itm_sub2.eq(S1_M20.itm_sub2))
									.and(S1_T1.itm_sub3.eq(S1_M20.itm_sub3))
									.and(S1_T1.sno1.eq(S1_M20.sno1))
									.and(S1_T1.sno2.eq(S1_M20.sno2))
									.and(S1_T1.sno3.eq(S1_M20.sno3))
									.and(S1_T1.sno4.eq(S1_M20.sno4))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M1.unit_cd.eq(S1_M2.unit_cd)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_M1.itm_cd.eq(S1_M10.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_M10.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_M10.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_M10.itm_sub3))
									.and(S1_M1.unit_cd.eq(S1_M10.unit_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.mfg_loc_cd.eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.sppl_cd.eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.maker_cd.eq(S1_M5.bp_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.rqst_loc_cd.eq(S1_M6.loc_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.rqst_wg_cd.eq(S1_M7.wg_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_M8.loc_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_M)
									.where(
										value(0).eq(value(0))
										.and(S1_T1.itm_ord_no.eq(S2_M.itm_ord_no))
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								cases()
									.when(S3_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
										.then(value(2))
									.otherwise(value(3)).as("wk_sort_num"),
								value(MSC_ORD_EXT_DAT_TYP.IO_SCHD.value()).as("ord_ext_dat_typ"),
								S3_T1.itm_cd,
								S3_T1.itm_sub1,
								S3_T1.itm_sub2,
								S3_T1.itm_sub3,
								nvl(
									S3_M20.itm_nm,
									S3_M1.itm_nm
								).as("itm_nm"),
								nullValue().as("itm_ord_sts_typ"),
								nullValue().as("strg_loc_cd"),
								nullValue().as("strg_loc_nm"),
								nullValue().as("inst_qty"),
								nullValue().as("yield_schd_qty"),
								S3_M1.unit_cd.as("base_unit_cd"),
								S3_M2.unit_nm.as("base_unit_nm"),
								S3_M10.dec_place.as("base_dec_place"),
								nullValue().as("po_schd_dt"),
								nullValue().as("mfg_st_schd_dt"),
								nullValue().as("mfg_end_schd_dt"),
								S3_T1.schd_dt.as("strg_schd_dt"),
								S3_T1.accpt_schd_dt,
								nullValue().as("insp_st_schd_dt"),
								nullValue().as("insp_end_schd_dt"),
								S3_T1.avl_schd_dt,
								nullValue().as("mfg_loc_cd"),
								nullValue().as("mfg_loc_nm"),
								S3_T1.sppl_cd,
								S3_M4.bp_nm.as("sppl_nm"),
								nullValue().as("maker_cd"),
								nullValue().as("maker_nm"),
								nullValue().as("gi_schd_dt"),
								nullValue().as("rqst_loc_cd"),
								nullValue().as("rqst_loc_nm"),
								nullValue().as("rqst_wg_cd"),
								nullValue().as("rqst_wg_nm"),
								nullValue().as("bom_ptn"),
								nullValue().as("oper_ptn"),
								nullValue().as("intr_rmrks"),
								nullValue().as("sub_char1"),
								nullValue().as("sub_char2"),
								nullValue().as("sub_char3"),
								S3_T1.io_schd_pr_no.as("itm_ord_no"),
								S3_T6.slo_no,
								S3_T5.slo_d_no,
								S3_T5.dlv_cd,
								S3_M11.bp_nm.as("dlv_nm"),
								S3_T6.cst_cd,
								S3_M12.bp_nm.as("cst_nm"),
								S3_T1.base_unit_qty,
								S3_T1.in_xfr_typ,
								S3_T1.quality_typ,
								S3_T1.stk_insp_typ,
								S3_T1.stk_id_typ,
								S3_T1.asst_typ,
								S3_T1.gd_cd,
								S3_M9.gd_nm,
								S3_T1.stk_bp_cd,
								S3_M8.bp_nm.as("stk_bp_nm"),
								S3_T1.io_schd_typ,
								S3_T1.io_schd_sts_typ,
								S3_T1.io_schd_no
							)
							.from(
								S3_T1
								.leftOuterJoin(S3_T2).on(
									bracket(
										value(0).eq(value(0))
										.and(S3_T2.chd_io_schd_pr_no.isNotNull())
										.and(S3_T2.chd_io_schd_pr_no.eq(S3_T1.io_schd_pr_no))
									)
								)
								.leftOuterJoin(S3_T5).on(
									bracket(
										S3_T5.slo_d_no.eq(S3_T1.io_schd_sub_no2)
										.and(
											S3_T1.io_schd_typ.in(
												value(MSC_IO_SCHD_TYP.SLS.value()),
												value(MSC_IO_SCHD_TYP.SLS_ACXFR.value()),
												value(MSC_IO_SCHD_TYP.SHIP_OUT.value())
											)
										)
										.and(S3_T1.avl_flg.eq(value(true)))
									)
								)
								.leftOuterJoin(S3_T6).on(
									bracket(
										S3_T6.slo_no.eq(S3_T5.slo_no)
									)
								)
								.leftOuterJoin(S3_M1).on(
									bracket(
										S3_T1.itm_cd.eq(S3_M1.itm_cd)
										.and(S3_T1.itm_sub1.eq(S3_M1.itm_sub1))
										.and(S3_T1.itm_sub2.eq(S3_M1.itm_sub2))
										.and(S3_T1.itm_sub3.eq(S3_M1.itm_sub3))
									)
								)
								.leftOuterJoin(S3_M20).on(
									bracket(
										S3_T1.itm_cd.eq(S3_M20.itm_cd)
										.and(S3_T1.itm_sub1.eq(S3_M20.itm_sub1))
										.and(S3_T1.itm_sub2.eq(S3_M20.itm_sub2))
										.and(S3_T1.itm_sub3.eq(S3_M20.itm_sub3))
										.and(S3_T1.sno1.eq(S3_M20.sno1))
										.and(S3_T1.sno2.eq(S3_M20.sno2))
										.and(S3_T1.sno3.eq(S3_M20.sno3))
										.and(S3_T1.sno4.eq(S3_M20.sno4))
									)
								)
								.leftOuterJoin(S3_M2).on(
									bracket(
										S3_M1.unit_cd.eq(S3_M2.unit_cd)
									)
								)
								.leftOuterJoin(S3_M10).on(
									bracket(
										S3_M1.itm_cd.eq(S3_M10.itm_cd)
										.and(S3_M1.itm_sub1.eq(S3_M10.itm_sub1))
										.and(S3_M1.itm_sub2.eq(S3_M10.itm_sub2))
										.and(S3_M1.itm_sub3.eq(S3_M10.itm_sub3))
										.and(S3_M1.unit_cd.eq(S3_M10.unit_cd))
									)
								)
								.leftOuterJoin(S3_M4).on(
									bracket(
										S3_T1.sppl_cd.eq(S3_M4.bp_cd)
									)
								)
								.leftOuterJoin(S3_M6).on(
									bracket(
										S3_T1.loc_cd.eq(S3_M6.loc_cd)
									)
								)
								.leftOuterJoin(S3_M7).on(
									bracket(
										S3_M6.wg_cd.eq(S3_M7.wg_cd)
									)
								)
								.leftOuterJoin(S3_M8).on(
									bracket(
										S3_T1.stk_bp_cd.eq(S3_M8.bp_cd)
									)
								)
								.leftOuterJoin(S3_M9).on(
									bracket(
										S3_T1.gd_cd.eq(S3_M9.gd_cd)
									)
								)
								.leftOuterJoin(S3_M11).on(
									bracket(
										S3_T5.dlv_cd.eq(S3_M11.bp_cd)
									)
								)
								.leftOuterJoin(S3_M12).on(
									bracket(
										S3_T6.cst_cd.eq(S3_M12.bp_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									bracket(
										S3_T1.io_typ.eq(value(MSC_IO_TYP.GR.value()))
										.and(S3_T1.avl_flg.eq(value(true)))
									)
									.or(
										S3_T1.io_schd_typ.in(
											value(MSC_IO_SCHD_TYP.SLS.value()),
											value(MSC_IO_SCHD_TYP.SLS_ACXFR.value()),
											value(MSC_IO_SCHD_TYP.SHIP_OUT.value())
										)
										.and(S3_T1.avl_flg.eq(value(true)))
									)
								)
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S4_M)
										.where(
											value(0).eq(value(0))
											.and(S3_T1.io_schd_pr_no.eq(S4_M.itm_ord_no))
										)
									)
								)
							)
						).view(S0_W)
					)
					.orderBy(S0_W.pr("wk_sort_num").asc())
			);
	}
	
	/**
	 * -- MSBCL0100_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0100_MST_OPER_ORDER_S01() {
		MST_OPER_ORDER_R S0_T1 = MST_OPER_ORDER_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_SITE_R S0_M3 = MAM_SITE_R.create("M3");
		MAM_LOC_GRP_R S0_M4 = MAM_LOC_GRP_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_ITM_OPER_R S0_M7 = MAM_ITM_OPER_R.create("M7");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAM_EXT_SYS_R S0_M11 = MAM_EXT_SYS_R.create("M11");
		MAM_LOC_R S0_M12 = MAM_LOC_R.create("M12");
		MAVM_RD_LOC_R S0_V1 = MAVM_RD_LOC_R.create("V1");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MST_OPER_INST_R S1_T1 = MST_OPER_INST_R.create("T1");
		MCTempView S1_T2 = createTempView("T2");
		MST_OPER_ACT_R S2_T = MST_OPER_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0100_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_ord_no,
						S0_T1.itm_ord_no,
						S0_T2.itm_ord_sts_typ,
						S0_T1.oper_ord_sts_typ,
						S0_T1.disp_seq,
						S0_T1.oper_ptn,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T2.mfg_st_schd_dt,
						S0_T2.mfg_end_schd_dt,
						S0_T1.st_schd_tm,
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						S0_T1.inst_st_schd_tm,
						trunc(
							S0_T1.inst_st_schd_tm,
							MCDateFmt.DD
						).as("inst_st_schd_dt"),
						S0_T1.inst_st_schd_tm.as("inst_st_schd_hm"),
						S0_T1.act_st_tm,
						trunc(
							S0_T1.act_st_tm,
							MCDateFmt.DD
						).as("act_st_dt"),
						S0_T1.act_st_tm.as("act_st_hm"),
						S0_T1.end_schd_tm,
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						S0_T1.inst_end_schd_tm,
						trunc(
							S0_T1.inst_end_schd_tm,
							MCDateFmt.DD
						).as("inst_end_schd_dt"),
						S0_T1.inst_end_schd_tm.as("inst_end_schd_hm"),
						S0_T1.act_end_tm,
						trunc(
							S0_T1.act_end_tm,
							MCDateFmt.DD
						).as("act_end_dt"),
						S0_T1.act_end_tm.as("act_end_hm"),
						S0_T2.mfg_loc_cd.as("mfg_loc_cd"),
						S0_T1.loc_cd,
						S0_M5.itm_typ,
						S0_M5.itm_typ_d_cd,
						S0_M5.itm_cd,
						S0_M5.itm_sub1,
						S0_M5.itm_sub2,
						S0_M5.itm_sub3,
						nvl(
							S0_M20.itm_nm,
							S0_M5.itm_nm
						).as("itm_nm"),
						S0_T1.oper_schd_qty,
						S0_T3.pr("base_unit_qty").as("oper_inst_schd_qty"),
						S0_T3.pr("oper_unit_qty").as("oper_act_qty"),
						S0_M7.oper_unit_cd,
						S0_M5.unit_cd.as("base_unit_cd"),
						S0_M5.dec_place.as("base_dec_place"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.wg_cd,
						S0_T1.oper_rsrc,
						S0_T1.intr_rmrks.as("rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.ord_rcv_flg,
						S0_T2.ord_snd_flg,
						S0_T2.ext_sys_cd,
						S0_T2.ext_itm_ord_no,
						S0_T2.for_scheduler_frozen_flg,
						S0_T1.ext_oper_ord_no,
						S0_T1.scheduler_frozen_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3.pr(S1_T1.oper_std_qty).as("oper_inst_std_qty"),
						S0_T3.pr(S1_T1.oper_conv_qty).as("oper_inst_conv_qty"),
						S0_T3.pr(S1_T1.oper_unit_dec_place),
						S0_T3.pr(S1_T1.oper_unit_conv_rnd_typ),
						decode(
							S0_M7.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M7.oper_std_qty
						).as("oper_std_qty"),
						decode(
							S0_M7.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M7.oper_conv_qty
						).as("oper_conv_qty"),
						decode(
							S0_M7.oper_unit_cd,
							nullValue(),
							S0_M5.dec_place,
							S0_M7.dec_place
						).as("dec_place"),
						decode(
							S0_M7.oper_unit_cd,
							nullValue(),
							value(MAC_RND_TYP.RNDUP.value()),
							S0_M7.unit_conv_rnd_typ
						).as("unit_conv_rnd_typ"),
						S0_T2.upd_cntr.as("itm_order_upd_cntr"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
								.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T2.ord_gnrt_typ).eq(value(false)))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T1.oper_ord_no,
								S1_T1.oper_std_qty,
								S1_T1.oper_conv_qty,
								S1_T1.oper_unit_cd,
								S1_T1.oper_unit_conv_rnd_typ,
								S1_T1.oper_unit_dec_place,
								sum(
									nvl(
										S1_T1.base_unit_qty,
										value(0)
									)
								).as("base_unit_qty"),
								sum(S1_T2.pr("sum_act_oper_unit_qty")).as("oper_unit_qty")
							)
							.from(
								S1_T1
								.leftOuterJoin(
									subQuery()
									.select(
										S2_T.oper_inst_no,
										sum(
											nvl(
												S2_T.oper_unit_qty,
												value(0)
											)
										).as("sum_act_oper_unit_qty")
									)
									.from(S2_T)
									.where(
										value(0).eq(value(0))
									)
									.groupBy(S2_T.oper_inst_no).view(S1_T2)
								).on(
									bracket(
										S1_T1.oper_inst_no.eq(S1_T2.pr(S2_T.oper_inst_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T1.can_flg.eq(value(false)))
								.and(S1_T1.oper_ord_no.isNotNull())
							)
							.groupBy(
								S1_T1.oper_ord_no,
								S1_T1.oper_std_qty,
								S1_T1.oper_conv_qty,
								S1_T1.oper_unit_cd,
								S1_T1.oper_unit_conv_rnd_typ,
								S1_T1.oper_unit_dec_place
							).view(S0_T3)
						).on(
							bracket(
								S0_T1.oper_ord_no.eq(S0_T3.pr(S1_T1.oper_ord_no))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M5.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M20.sno1))
								.and(S0_T2.sno2.eq(S0_M20.sno2))
								.and(S0_T2.sno3.eq(S0_M20.sno3))
								.and(S0_T2.sno4.eq(S0_M20.sno4))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
								.and(S0_T2.mst_mfg_loc_cd.eq(S0_M7.loc_cd))
								.and(S0_T1.oper_ptn.eq(S0_M7.oper_ptn))
								.and(S0_T1.oper_cd.eq(S0_M7.oper_cd))
								.and(S0_T1.oper_seq.eq(S0_M7.oper_seq))
								.and(S0_T2.mfg_st_schd_dt.between(S0_M7.st_dt, S0_M7.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T2.mfg_loc_cd.eq(S0_V1.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(MAC_STR$IS_NULL_VAL(S0_T1.oper_ptn).eq(value(false)))
						.cutoff$and(S0_T1.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T1.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T1.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T1.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T2.mfg_st_schd_dt.gte(bind("mfg_st_schd_dt_fr")))
						.cutoff$and(S0_T2.mfg_st_schd_dt.lte(bind("mfg_st_schd_dt_to")))
						.cutoff$and(S0_T2.mfg_end_schd_dt.gte(bind("mfg_end_schd_dt_fr")))
						.cutoff$and(S0_T2.mfg_end_schd_dt.lte(bind("mfg_end_schd_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T1.oper_ptn.like(bind("oper_ptn")))
						.cutoff$and(S0_T1.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T1.oper_seq.eq(bind("oper_seq")))
						.cutoff$and(S0_M5.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M5.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M5.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M5.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M5.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M5.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M20.itm_nm,
								S0_M5.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.oper_rsrc.like(bind("oper_rsrc")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T2.ext_itm_ord_no.like(bind("ext_itm_ord_no")))
						.cutoff$and(S0_T1.ext_oper_ord_no.like(bind("ext_oper_ord_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.and(
							S0_T1.oper_ord_sts_typ.in(
								bind("wk_opn"),
								bind("wk_save"),
								bind("wk_fix"),
								bind("wk_part_inst"),
								bind("wk_inst"),
								bind("wk_cmpl")
							)
						)
						.cutoff$and(S0_T2.ord_rcv_flg.eq(bind("wk_ord_rcv_tgt_flg")))
						.cutoff$and(S0_T2.ord_snd_flg.eq(bind("wk_ord_snd_tgt_flg")))
					)
					.orderBy(
						S0_T1.itm_ord_no.asc(),
						S0_T1.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T2.sno1.eq(S0_T5.sno1))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.oper_cd.eq(S0_M1.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.oper_nm.like(bind("oper_nm")))),
				when(boundOr("mfg_site_nm", "loc_grp_nm", "mfg_site_cd", "loc_grp_cd", "mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T2.mfg_loc_cd.eq(S0_M2.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.site_cd.like(bind("mfg_site_cd"))).cutoff$and(S0_M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M2.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("mfg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.site_nm.like(bind("mfg_site_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.loc_cd.eq(S0_M12.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_nm.like(bind("loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M2.loc_grp_cd.eq(S0_M4.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M5.itm_typ.eq(S0_M6.itm_typ).and(S0_M5.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.wg_cd.eq(S0_M9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.ext_sys_cd.eq(S0_M11.ext_sys_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.ext_sys_nm.like(bind("ext_sys_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M5.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M5.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M5.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M5.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M5.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M5.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M5.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M5.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M5.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M5.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_site_cd", m.site_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0100_MSW_ITM_ORD_R_HRRCHY_Query_S01
	 */
	static MCQueryPlan MSBCL0100_MSW_ITM_ORD_R_HRRCHY_S01() {
		MSW_ITM_ORD_R_HRRCHY_R S0_T1 = MSW_ITM_ORD_R_HRRCHY_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		MAM_ITM_R S0_M21 = MAM_ITM_R.create("M21");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0100_MSW_ITM_ORD_R_HRRCHY_Query_S01")
					.mainQuery()
					.select(
						S0_T1.hrrchy,
						S0_T2.rqmt_no,
						S0_T1.chd_rqmt_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M22.itm_nm,
							S0_M21.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.loc_cd.as("strg_loc_cd"),
						S0_T1.itm_ord_no,
						S0_T1.io_schd_typ,
						S0_T1.io_schd_pr_no,
						S0_T1.schd_alloc_qty,
						S0_T1.gi_schd_dt,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.wg_cd,
						decode(
							S0_M20.itm_cd,
							nullValue(),
							S0_T2.not_fix_flg,
							value(true)
						).as("not_fix_flg"),
						S0_T2.blk_flg,
						S0_T2.itm_ord_typ
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M20.sno1))
								.and(S0_T2.sno2.eq(S0_M20.sno2))
								.and(S0_T2.sno3.eq(S0_M20.sno3))
								.and(S0_T2.sno4.eq(S0_M20.sno4))
								.and(S0_T2.wg_cd.eq(S0_M20.wg_cd))
								.and(S0_M20.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M21.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M22.sno1))
								.and(S0_T2.sno2.eq(S0_M22.sno2))
								.and(S0_T2.sno3.eq(S0_M22.sno3))
								.and(S0_T2.sno4.eq(S0_M22.sno4))
							)
						)
					)
					.orderBy(
						S0_T1.root_id.asc(),
						S0_T1.sort_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					})
				)
			);
	}
}