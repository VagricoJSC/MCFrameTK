package mcframe.serverMSBC.MSBCL0190;

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
	 * -- MSBCL0190_MST_SIM_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0190_MST_SIM_ITM_ORDER_S01() {
		MCTempView S0_W = createTempView("W");
		MCTempView S1_T1 = createTempView("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S1_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S1_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S1_M7 = MAM_WG_R.create("M7");
		MST_ITM_ORDER_R S2_T01 = MST_ITM_ORDER_R.create("T01");
		MST_SIM_ITM_ORDER_R S3_T02 = MST_SIM_ITM_ORDER_R.create("T02");
		MSW_SIM_ITM_ORDER_KEY_R S4_M = MSW_SIM_ITM_ORDER_KEY_R.create("M");
		MST_IO_SCHD_R S5_T1 = MST_IO_SCHD_R.create("T1");
		MAM_ITM_R S5_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S5_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_BP_R S5_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S5_M6 = MAM_LOC_R.create("M6");
		MAM_WG_R S5_M7 = MAM_WG_R.create("M7");
		MAM_BP_R S5_M8 = MAM_BP_R.create("M8");
		MAM_STK_GD_R S5_M9 = MAM_STK_GD_R.create("M9");
		MSW_SIM_ITM_ORDER_KEY_R S6_M = MSW_SIM_ITM_ORDER_KEY_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0190_MST_SIM_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(S0_W.prAll())
					.from(
						subQuery()
						.select(
							value(1).as("wk_sort_num"),
							value(MSC_ORD_EXT_DAT_TYP.ORD.value()).as("ord_ext_dat_typ"),
							S1_T1.pr(S2_T01.itm_cd),
							S1_T1.pr(S2_T01.itm_sub1),
							S1_T1.pr(S2_T01.itm_sub2),
							S1_T1.pr(S2_T01.itm_sub3),
							nvl(
								S1_M20.itm_nm,
								S1_M1.itm_nm
							).as("itm_nm"),
							S1_T1.pr(S2_T01.inst_qty),
							S1_T1.pr(S2_T01.yield_schd_qty),
							S1_T1.pr(S2_T01.po_schd_dt),
							S1_T1.pr(S2_T01.mfg_st_schd_dt),
							S1_T1.pr(S2_T01.mfg_end_schd_dt),
							S1_T1.pr(S2_T01.strg_schd_dt),
							S1_T1.pr(S2_T01.accpt_schd_dt),
							S1_T1.pr(S2_T01.insp_st_schd_dt),
							S1_T1.pr(S2_T01.insp_end_schd_dt),
							S1_T1.pr(S2_T01.avl_schd_dt),
							S1_T1.pr(S2_T01.mfg_loc_cd),
							S1_M3.loc_nm.as("mfg_loc_nm"),
							S1_T1.pr(S2_T01.sppl_cd),
							S1_M4.bp_nm.as("sppl_nm"),
							S1_T1.pr(S2_T01.maker_cd),
							S1_M5.bp_nm.as("maker_nm"),
							S1_T1.pr(S2_T01.rqst_loc_cd),
							S1_M6.loc_nm.as("rqst_loc_nm"),
							S1_T1.pr(S2_T01.rqst_wg_cd),
							S1_M7.wg_nm.as("rqst_wg_nm"),
							S1_T1.pr(S2_T01.gi_schd_dt),
							S1_T1.pr(S2_T01.bom_ptn),
							S1_T1.pr(S2_T01.oper_ptn),
							S1_T1.pr(S2_T01.rqmt_no),
							S1_T1.pr(S2_T01.intr_rmrks),
							S1_T1.pr(S2_T01.sub_char1),
							S1_T1.pr(S2_T01.sub_char2),
							S1_T1.pr(S2_T01.sub_char3),
							S1_T1.pr(S2_T01.itm_ord_no),
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
							subQuery()
							.select(
								S2_T01.itm_cd,
								S2_T01.itm_sub1,
								S2_T01.itm_sub2,
								S2_T01.itm_sub3,
								S2_T01.sno1,
								S2_T01.sno2,
								S2_T01.sno3,
								S2_T01.sno4,
								S2_T01.inst_qty,
								S2_T01.yield_schd_qty,
								S2_T01.po_schd_dt,
								S2_T01.mfg_st_schd_dt,
								S2_T01.mfg_end_schd_dt,
								S2_T01.strg_schd_dt,
								S2_T01.accpt_schd_dt,
								S2_T01.insp_st_schd_dt,
								S2_T01.insp_end_schd_dt,
								S2_T01.avl_schd_dt,
								S2_T01.mfg_loc_cd,
								S2_T01.sppl_cd,
								S2_T01.maker_cd,
								S2_T01.rqst_loc_cd,
								S2_T01.rqst_wg_cd,
								S2_T01.gi_schd_dt,
								S2_T01.bom_ptn,
								S2_T01.oper_ptn,
								S2_T01.rqmt_no,
								S2_T01.intr_rmrks,
								S2_T01.sub_char1,
								S2_T01.sub_char2,
								S2_T01.sub_char3,
								S2_T01.itm_ord_no,
								S2_T01.sim_mrp_no
							)
							.from(S2_T01)
							.unionAll(
								subQuery()
								.select(
									S3_T02.itm_cd,
									S3_T02.itm_sub1,
									S3_T02.itm_sub2,
									S3_T02.itm_sub3,
									S3_T02.sno1,
									S3_T02.sno2,
									S3_T02.sno3,
									S3_T02.sno4,
									S3_T02.inst_qty,
									S3_T02.yield_schd_qty,
									S3_T02.po_schd_dt,
									S3_T02.mfg_st_schd_dt,
									S3_T02.mfg_end_schd_dt,
									S3_T02.strg_schd_dt,
									S3_T02.accpt_schd_dt,
									S3_T02.insp_st_schd_dt,
									S3_T02.insp_end_schd_dt,
									S3_T02.avl_schd_dt,
									S3_T02.mfg_loc_cd,
									S3_T02.sppl_cd,
									S3_T02.maker_cd,
									S3_T02.rqst_loc_cd,
									S3_T02.rqst_wg_cd,
									S3_T02.gi_schd_dt,
									S3_T02.bom_ptn,
									S3_T02.oper_ptn,
									S3_T02.rqmt_no,
									S3_T02.intr_rmrks,
									S3_T02.sub_char1,
									S3_T02.sub_char2,
									S3_T02.sub_char3,
									S3_T02.itm_ord_no,
									S3_T02.sim_mrp_no
								)
								.from(S3_T02)
								.where(
									S3_T02.exp_dt.isNull()
								)
							).view(S1_T1)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.pr(S2_T01.itm_cd).eq(S1_M1.itm_cd)
									.and(S1_T1.pr(S2_T01.itm_sub1).eq(S1_M1.itm_sub1))
									.and(S1_T1.pr(S2_T01.itm_sub2).eq(S1_M1.itm_sub2))
									.and(S1_T1.pr(S2_T01.itm_sub3).eq(S1_M1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M20).on(
								bracket(
									S1_T1.pr(S2_T01.itm_cd).eq(S1_M20.itm_cd)
									.and(S1_T1.pr(S2_T01.itm_sub1).eq(S1_M20.itm_sub1))
									.and(S1_T1.pr(S2_T01.itm_sub2).eq(S1_M20.itm_sub2))
									.and(S1_T1.pr(S2_T01.itm_sub3).eq(S1_M20.itm_sub3))
									.and(S1_T1.pr(S2_T01.sno1).eq(S1_M20.sno1))
									.and(S1_T1.pr(S2_T01.sno2).eq(S1_M20.sno2))
									.and(S1_T1.pr(S2_T01.sno3).eq(S1_M20.sno3))
									.and(S1_T1.pr(S2_T01.sno4).eq(S1_M20.sno4))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.pr(S2_T01.mfg_loc_cd).eq(S1_M3.loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.pr(S2_T01.sppl_cd).eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.pr(S2_T01.maker_cd).eq(S1_M5.bp_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.pr(S2_T01.rqst_loc_cd).eq(S1_M6.loc_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.pr(S2_T01.rqst_wg_cd).eq(S1_M7.wg_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_M)
									.where(
										value(0).eq(value(0))
										.and(S1_T1.pr(S2_T01.itm_ord_no).eq(S4_M.itm_ord_no))
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								cases()
									.when(S5_T1.io_typ.eq(value(MSC_IO_TYP.GR.value())))
										.then(value(2))
									.otherwise(value(3)).as("wk_sort_num"),
								value(MSC_ORD_EXT_DAT_TYP.IO_SCHD.value()).as("ord_ext_dat_typ"),
								S5_T1.itm_cd,
								S5_T1.itm_sub1,
								S5_T1.itm_sub2,
								S5_T1.itm_sub3,
								nvl(
									S5_M20.itm_nm,
									S5_M1.itm_nm
								).as("itm_nm"),
								nullValue().as("inst_qty"),
								nullValue().as("yield_schd_qty"),
								nullValue().as("po_schd_dt"),
								nullValue().as("mfg_st_schd_dt"),
								nullValue().as("mfg_end_schd_dt"),
								S5_T1.schd_dt.as("strg_schd_dt"),
								S5_T1.accpt_schd_dt,
								nullValue().as("insp_st_schd_dt"),
								nullValue().as("insp_end_schd_dt"),
								S5_T1.avl_schd_dt,
								nullValue().as("mfg_loc_cd"),
								nullValue().as("mfg_loc_nm"),
								S5_T1.sppl_cd,
								S5_M4.bp_nm.as("sppl_nm"),
								nullValue().as("maker_cd"),
								nullValue().as("maker_nm"),
								nullValue().as("rqst_loc_cd"),
								nullValue().as("rqst_loc_nm"),
								nullValue().as("rqst_wg_cd"),
								nullValue().as("rqst_wg_nm"),
								nullValue().as("gi_schd_dt"),
								nullValue().as("bom_ptn"),
								nullValue().as("oper_ptn"),
								nullValue().as("rqmt_no"),
								nullValue().as("intr_rmrks"),
								nullValue().as("sub_char1"),
								nullValue().as("sub_char2"),
								nullValue().as("sub_char3"),
								S5_T1.io_schd_pr_no.as("itm_ord_no"),
								S5_T1.base_unit_qty,
								S5_T1.in_xfr_typ,
								S5_T1.quality_typ,
								S5_T1.stk_insp_typ,
								S5_T1.stk_id_typ,
								S5_T1.asst_typ,
								S5_T1.gd_cd,
								S5_M9.gd_nm,
								S5_T1.stk_bp_cd,
								S5_M8.bp_nm.as("stk_bp_nm"),
								S5_T1.io_schd_typ,
								S5_T1.io_schd_sts_typ,
								S5_T1.io_schd_no
							)
							.from(
								S5_T1
								.leftOuterJoin(S5_M1).on(
									bracket(
										S5_T1.itm_cd.eq(S5_M1.itm_cd)
										.and(S5_T1.itm_sub1.eq(S5_M1.itm_sub1))
										.and(S5_T1.itm_sub2.eq(S5_M1.itm_sub2))
										.and(S5_T1.itm_sub3.eq(S5_M1.itm_sub3))
									)
								)
								.leftOuterJoin(S5_M20).on(
									bracket(
										S5_T1.itm_cd.eq(S5_M20.itm_cd)
										.and(S5_T1.itm_sub1.eq(S5_M20.itm_sub1))
										.and(S5_T1.itm_sub2.eq(S5_M20.itm_sub2))
										.and(S5_T1.itm_sub3.eq(S5_M20.itm_sub3))
										.and(S5_T1.sno1.eq(S5_M20.sno1))
										.and(S5_T1.sno2.eq(S5_M20.sno2))
										.and(S5_T1.sno3.eq(S5_M20.sno3))
										.and(S5_T1.sno4.eq(S5_M20.sno4))
									)
								)
								.leftOuterJoin(S5_M4).on(
									bracket(
										S5_T1.sppl_cd.eq(S5_M4.bp_cd)
									)
								)
								.leftOuterJoin(S5_M6).on(
									bracket(
										S5_T1.loc_cd.eq(S5_M6.loc_cd)
									)
								)
								.leftOuterJoin(S5_M7).on(
									bracket(
										S5_M6.wg_cd.eq(S5_M7.wg_cd)
									)
								)
								.leftOuterJoin(S5_M8).on(
									bracket(
										S5_T1.stk_bp_cd.eq(S5_M8.bp_cd)
									)
								)
								.leftOuterJoin(S5_M9).on(
									bracket(
										S5_T1.gd_cd.eq(S5_M9.gd_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_M)
										.where(
											value(0).eq(value(0))
											.and(S5_T1.io_schd_pr_no.eq(S6_M.itm_ord_no))
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
	 * -- MSBCL0190_MSVT_AVL_STK_Query_S01
	 */
	static MCQueryPlan MSBCL0190_MSVT_AVL_STK_S01() {
		MSVT_AVL_STK_R S0_T1 = MSVT_AVL_STK_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAVM_ITM_UNIT_R S0_M8 = MAVM_ITM_UNIT_R.create("M8");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_STR_LN_R S0_M5 = MAM_STR_LN_R.create("M5");
		MAM_STK_GD_R S0_M6 = MAM_STK_GD_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MSW_STK_KEY_R S1_M = MSW_STK_KEY_R.create("M");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0190_MSVT_AVL_STK_Query_S01")
					.mainQuery()
					.select(
						value(MSC_ORD_EXT_DAT_TYP.STK.value()).as("ord_ext_dat_typ"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M20.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.base_unit_qty,
						S0_T1.pack_unit_qty,
						S0_T1.pack_unit_cd,
						S0_M3.unit_nm.as("pack_unit_nm"),
						S0_M8.dec_place.as("pack_dec_place"),
						S0_T1.loc_cd.as("stk_loc_cd"),
						S0_M4.loc_nm.as("stk_loc_nm"),
						S0_T1.str_ln_cd,
						S0_M5.str_ln_nm,
						S0_T1.in_xfr_typ,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.asst_typ,
						S0_T1.gd_cd,
						S0_M6.gd_nm,
						S0_T1.stk_bp_cd,
						S0_M7.bp_nm.as("stk_bp_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M20.sno1))
								.and(S0_T1.sno2.eq(S0_M20.sno2))
								.and(S0_T1.sno3.eq(S0_M20.sno3))
								.and(S0_T1.sno4.eq(S0_M20.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.pack_unit_cd.eq(S0_M3.unit_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M8.itm_sub3))
								.and(S0_T1.pack_unit_cd.eq(S0_M8.unit_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M5.loc_cd)
								.and(S0_T1.str_ln_cd.eq(S0_M5.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.gd_cd.eq(S0_M6.gd_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.stk_bp_cd.eq(S0_M7.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.quality_typ.eq(value(MAC_QUALITY_TYP.GOOD.value())))
						.and(
							S0_T1.stk_id_typ.in(
								value(MSC_STK_ID_TYP.COSTK.value()),
								value(MSC_STK_ID_TYP.RNT_RCV.value()),
								value(MSC_STK_ID_TYP.NCV_RCV.value()),
								value(MSC_STK_ID_TYP.ONR_PROV.value())
							)
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_M)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.itm_cd.eq(S1_M.itm_cd))
									.and(S0_T1.itm_sub1.eq(S1_M.itm_sub1))
									.and(S0_T1.itm_sub2.eq(S1_M.itm_sub2))
									.and(S0_T1.itm_sub3.eq(S1_M.itm_sub3))
									.and(S0_T1.loc_cd.eq(S1_M.loc_cd))
									.and(S0_T1.lot_no.eq(S1_M.lot_no))
									.and(S0_T1.sublot_no.eq(S1_M.sublot_no))
									.and(S0_T1.sno1.eq(S1_M.sno1))
									.and(S0_T1.sno2.eq(S1_M.sno2))
									.and(S0_T1.sno3.eq(S1_M.sno3))
									.and(S0_T1.sno4.eq(S1_M.sno4))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBCL0190_MSW_ITM_ORD_F_HRRCHY_Query_S01
	 */
	static MCQueryPlan MSBCL0190_MSW_ITM_ORD_F_HRRCHY_S01() {
		MSW_ITM_ORD_F_HRRCHY_R S0_T1 = MSW_ITM_ORD_F_HRRCHY_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		MAM_ITM_R S0_M21 = MAM_ITM_R.create("M21");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_UNIT_R S0_M23 = MAM_UNIT_R.create("M23");
		MAVM_ITM_UNIT_R S0_M24 = MAVM_ITM_UNIT_R.create("M24");
		MST_ITM_ORDER_R S1_T01 = MST_ITM_ORDER_R.create("T01");
		MST_SIM_ITM_ORDER_R S2_T02 = MST_SIM_ITM_ORDER_R.create("T02");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0190_MSW_ITM_ORD_F_HRRCHY_Query_S01")
					.mainQuery()
					.select(
						S0_T1.hrrchy,
						S0_T1.itm_ord_no,
						S0_T1.chd_itm_cd.as("itm_cd"),
						S0_T1.chd_itm_sub1.as("itm_sub1"),
						S0_T1.chd_itm_sub2.as("itm_sub2"),
						S0_T1.chd_itm_sub3.as("itm_sub3"),
						nvl(
							S0_M22.itm_nm,
							S0_M21.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
						S0_T1.chd_loc_cd.as("strg_loc_cd"),
						S0_M1.loc_nm.as("strg_loc_nm"),
						S0_T1.chd_io_schd_pr_no.as("io_schd_pr_no"),
						S0_T1.chd_lot_no.as("lot_no"),
						S0_T1.chd_sublot_no.as("sublot_no"),
						S0_T1.chd_schd_alloc_qty.as("schd_alloc_qty"),
						S0_T1.chd_gi_schd_dt.as("gi_schd_dt"),
						S0_T1.chd_sno1.as("sno1"),
						S0_T1.chd_sno2.as("sno2"),
						S0_T1.chd_sno3.as("sno3"),
						S0_T1.chd_sno4.as("sno4"),
						S0_T3.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.wg_cd,
						S0_M2.wg_nm,
						decode(
							S0_M20.itm_cd,
							nullValue(),
							S0_T2.pr(S1_T01.not_fix_flg),
							value(true)
						).as("not_fix_flg"),
						S0_T2.pr(S1_T01.blk_flg),
						S0_T2.pr(S1_T01.itm_ord_typ),
						nvl(
							S0_T2.pr("sim_ord_flg"),
							value(false)
						).as("sim_ord_flg"),
						S0_M21.unit_cd.as("base_unit_cd"),
						S0_M23.unit_nm.as("base_unit_nm"),
						S0_M24.dec_place.as("base_dec_place"),
						S0_M21.stk_mng_typ
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T01.itm_ord_no,
								S1_T01.blk_flg,
								S1_T01.itm_ord_typ,
								S1_T01.not_fix_flg,
								S1_T01.itm_cd,
								S1_T01.itm_sub1,
								S1_T01.itm_sub2,
								S1_T01.itm_sub3,
								S1_T01.sno1,
								S1_T01.sno2,
								S1_T01.sno3,
								S1_T01.sno4,
								S1_T01.wg_cd,
								value(false).as("sim_ord_flg")
							)
							.from(S1_T01)
							.unionAll(
								subQuery()
								.select(
									S2_T02.itm_ord_no,
									S2_T02.blk_flg,
									S2_T02.itm_ord_typ,
									S2_T02.not_fix_flg,
									S2_T02.itm_cd,
									S2_T02.itm_sub1,
									S2_T02.itm_sub2,
									S2_T02.itm_sub3,
									S2_T02.sno1,
									S2_T02.sno2,
									S2_T02.sno3,
									S2_T02.sno4,
									S2_T02.wg_cd,
									value(true).as("sim_ord_flg")
								)
								.from(S2_T02)
								.where(
									S2_T02.exp_dt.isNull()
								)
							).view(S0_T2)
						).on(
							bracket(
								S0_T1.chd_io_schd_pr_no.eq(S0_T2.pr(S1_T01.itm_ord_no))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.chd_sno1.eq(S0_T3.sno1)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.chd_loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M2.wg_cd)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.pr(S1_T01.itm_cd).eq(S0_M20.itm_cd)
								.and(S0_T2.pr(S1_T01.itm_sub1).eq(S0_M20.itm_sub1))
								.and(S0_T2.pr(S1_T01.itm_sub2).eq(S0_M20.itm_sub2))
								.and(S0_T2.pr(S1_T01.itm_sub3).eq(S0_M20.itm_sub3))
								.and(S0_T2.pr(S1_T01.sno1).eq(S0_M20.sno1))
								.and(S0_T2.pr(S1_T01.sno2).eq(S0_M20.sno2))
								.and(S0_T2.pr(S1_T01.sno3).eq(S0_M20.sno3))
								.and(S0_T2.pr(S1_T01.sno4).eq(S0_M20.sno4))
								.and(S0_T2.pr(S1_T01.wg_cd).eq(S0_M20.wg_cd))
								.and(S0_M20.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.chd_itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T1.chd_itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T1.chd_itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T1.chd_itm_sub3.eq(S0_M21.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.pr(S1_T01.itm_cd).eq(S0_M22.itm_cd)
								.and(S0_T2.pr(S1_T01.itm_sub1).eq(S0_M22.itm_sub1))
								.and(S0_T2.pr(S1_T01.itm_sub2).eq(S0_M22.itm_sub2))
								.and(S0_T2.pr(S1_T01.itm_sub3).eq(S0_M22.itm_sub3))
								.and(S0_T2.pr(S1_T01.sno1).eq(S0_M22.sno1))
								.and(S0_T2.pr(S1_T01.sno2).eq(S0_M22.sno2))
								.and(S0_T2.pr(S1_T01.sno3).eq(S0_M22.sno3))
								.and(S0_T2.pr(S1_T01.sno4).eq(S0_M22.sno4))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M21.unit_cd.eq(S0_M23.unit_cd)
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_M21.itm_cd.eq(S0_M24.itm_cd)
								.and(S0_M21.itm_sub1.eq(S0_M24.itm_sub1))
								.and(S0_M21.itm_sub2.eq(S0_M24.itm_sub2))
								.and(S0_M21.itm_sub3.eq(S0_M24.itm_sub3))
								.and(S0_M21.unit_cd.eq(S0_M24.unit_cd))
							)
						)
					)
					.orderBy(
						S0_T1.root_id.asc(),
						S0_T1.sort_no.asc()
					)
			);
	}
}