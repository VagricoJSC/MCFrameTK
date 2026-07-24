package mcframe.serverMSBE.MSBEL2610;

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
	 * -- MSBEL2610_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL2610_MST_MLY_STK_DTL_S01() {
		MCTempView S0_T = createTempView("T");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MST_MLY_STK_DTL_R S1_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MST_IO_ACT_R S2_T2 = MST_IO_ACT_R.create("T2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S2_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S2_M6 = MAM_BP_R.create("M6");
		
		MSW_STKTK_ACT_KEY_R S1_W1 = MSW_STKTK_ACT_KEY_R.create("W1");
		MCDynamicSQLID DS0C_ITM_T1 = createDynamicSQLID("DS0C_ITM_T1");
		MCDynamicSQLID DS0C_ITM_T2 = createDynamicSQLID("DS0C_ITM_T2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.loc_cd),
						S0_M2.stktk_tor_ex_zero_flg,
						S0_T.pr(S1_T1.str_ln_cd),
						S0_T.pr(S1_T1.stk_arrv_bp_cd),
						S0_T.pr(S1_T1.lot_no),
						S0_T.pr(S1_T1.sublot_no),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr("fix_no_flg"),
						S0_T.pr("trd_unit_cd"),
						S0_T.pr(S1_T1.gd_cd),
						S0_T.pr(S1_T1.in_xfr_typ),
						S0_T.pr(S1_T1.quality_typ),
						S0_T.pr(S1_T1.stk_insp_typ),
						S0_T.pr(S1_T1.stk_id_typ),
						S0_T.pr(S1_T1.stk_bp_cd),
						S0_M2.wg_cd,
						sum(S0_T.pr("tor_qty")).as("tor_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							decode(
								S1_T1.fix_no,
								value(MAC_STR.NULL_VAL.value()),
								value(false),
								value(true)
							).as("fix_no_flg"),
							S1_T1.pack_unit_cd.as("trd_unit_cd"),
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							S1_T1.pack_unit_qty.as("tor_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_W1).on(
								bracket(
									S1_W1.loc_cd.eq(S1_T1.loc_cd)
									.addDynamicPredicate(DS0C_ITM_T1)
								)
							)
							.innerJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M3).on(
									bracket(
											S1_M3.loc_cd.eq(S1_T1.loc_cd)
									)
								)
							.leftOuterJoin(S1_M4).on(
									bracket(
											S1_M4.bp_cd.eq(S1_M3.sppl_cd)
									)
								)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.ac_ym.eq(bind("ac_ym")))
							.and(S1_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
							.and(S1_T1.lot_no.neq(value(MSC_PURC_UNFIX_STR.UNFIXED.value())))
							.and(S1_M1.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
							.and(value(0).eq(
									(cases()
											.when(
													S1_M3.sppl_cd.isNotNull()
													.and(S1_M4.onr_prsppl_flg.eq(value(false)))
													.and(S1_T1.stk_arrv_bp_cd.eq(value(MAC_STR.NULL_VAL.value()))))
											.then(value(1))
											.otherwise(value(0))
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T2.itm_cd,
								S2_T2.itm_sub1,
								S2_T2.itm_sub2,
								S2_T2.itm_sub3,
								S2_T2.loc_cd,
								S2_T2.str_ln_cd,
								S2_T2.stk_arrv_bp_cd,
								S2_T2.lot_no,
								S2_T2.sublot_no,
								S2_T2.sno1,
								S2_T2.sno2,
								S2_T2.sno3,
								S2_T2.sno4,
								decode(
									S2_T2.fix_no,
									value(MAC_STR.NULL_VAL.value()),
									value(false),
									value(true)
								).as("fix_no_flg"),
								S2_T2.pack_unit_cd.as("trd_unit_cd"),
								S2_T2.gd_cd,
								S2_T2.in_xfr_typ,
								S2_T2.quality_typ,
								S2_T2.stk_insp_typ,
								S2_T2.stk_id_typ,
								S2_T2.stk_bp_cd,
								sum(
									cases()
										.when(S2_T2.io_typ.eq(value(MSC_IO_TYP.GI.value())))
											.then(value(0).subtract(S2_T2.pack_unit_qty))
										.otherwise(S2_T2.pack_unit_qty)
								).as("tor_qty")
							)
							.from(
								S2_T2
								.innerJoin(S1_W1).on(
									bracket(
										S1_W1.stktk_base_dt.gte(S2_T2.ac_dt)
										.and(S1_W1.loc_cd.eq(S2_T2.loc_cd))
										.addDynamicPredicate(DS0C_ITM_T2)
									)
								)
								.leftOuterJoin(S2_M5).on(
										bracket(
												S2_M5.loc_cd.eq(S2_T2.loc_cd)
										)
									)
								.leftOuterJoin(S2_M6).on(
										bracket(
												S2_M6.bp_cd.eq(S2_M5.sppl_cd)
										)
									)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T2.ac_ym.gt(bind("ac_ym")))
								.cutoff$and(S2_T2.ac_dt.gt(bind("cl_end_dt")))
								.and(
									S2_T2.io_typ.in(
										value(MSC_IO_TYP.GI.value()),
										value(MSC_IO_TYP.GR.value())
									)
								)
								.and(S2_T2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
								.and(S2_T2.trn_typ.neq(value(MSC_TRN_TYP.RCV_ACT.value())))
								.and(S2_T2.io_act_typ.neq(value(MSC_IO_ACT_TYP.INPT_SLF.value())))
								.and(S2_T2.lot_no.neq(value(MSC_PURC_UNFIX_STR.UNFIXED.value())))
								.and(S2_T2.pack_unit_qty.neq(value(0)))
								.and(value(0).eq(
										(cases()
												.when(
														S2_M5.sppl_cd.isNotNull()
														.and(S2_M6.onr_prsppl_flg.eq(value(false)))
														.and(S2_T2.stk_arrv_bp_cd.eq(value(MAC_STR.NULL_VAL.value()))))
												.then(value(1))
												.otherwise(value(0))
										)
									)
								)
							)
							.groupBy(
								S2_T2.itm_cd,
								S2_T2.itm_sub1,
								S2_T2.itm_sub2,
								S2_T2.itm_sub3,
								S2_T2.loc_cd,
								S2_T2.str_ln_cd,
								S2_T2.stk_arrv_bp_cd,
								S2_T2.lot_no,
								S2_T2.sublot_no,
								S2_T2.sno1,
								S2_T2.sno2,
								S2_T2.sno3,
								S2_T2.sno4,
								S2_T2.fix_no,
								S2_T2.pack_unit_cd,
								S2_T2.gd_cd,
								S2_T2.in_xfr_typ,
								S2_T2.quality_typ,
								S2_T2.stk_insp_typ,
								S2_T2.stk_id_typ,
								S2_T2.stk_bp_cd
							)
						).view(S0_T)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T.pr(S1_T1.loc_cd).eq(S0_M2.loc_cd)
							)
						)
					)
					.groupBy(
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.loc_cd),
						S0_M2.stktk_tor_ex_zero_flg,
						S0_T.pr(S1_T1.str_ln_cd),
						S0_T.pr(S1_T1.stk_arrv_bp_cd),
						S0_T.pr(S1_T1.lot_no),
						S0_T.pr(S1_T1.sublot_no),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr("fix_no_flg"),
						S0_T.pr("trd_unit_cd"),
						S0_T.pr(S1_T1.gd_cd),
						S0_T.pr(S1_T1.in_xfr_typ),
						S0_T.pr(S1_T1.quality_typ),
						S0_T.pr(S1_T1.stk_insp_typ),
						S0_T.pr(S1_T1.stk_id_typ),
						S0_T.pr(S1_T1.stk_bp_cd),
						S0_M2.wg_cd
					)
					.having(
						sum(S0_T.pr("tor_qty")).neq(value(0))
						.or(S0_M2.stktk_tor_ex_zero_flg.eq(value(false)))
					)
					.orderBy(
						S0_T.pr(S1_T1.loc_cd).asc(),
						S0_T.pr(S1_T1.itm_cd).asc(),
						S0_T.pr(S1_T1.itm_sub1).asc(),
						S0_T.pr(S1_T1.itm_sub2).asc(),
						S0_T.pr(S1_T1.itm_sub3).asc(),
						S0_T.pr(S1_T1.str_ln_cd).asc(),
						S0_T.pr(S1_T1.stk_arrv_bp_cd).asc(),
						S0_T.pr(S1_T1.lot_no).asc(),
						S0_T.pr(S1_T1.sublot_no).asc(),
						S0_T.pr(S1_T1.sno1).asc(),
						S0_T.pr(S1_T1.sno2).asc(),
						S0_T.pr(S1_T1.sno3).asc(),
						S0_T.pr(S1_T1.sno4).asc(),
						S0_T.pr("fix_no_flg").asc(),
						S0_T.pr("trd_unit_cd").asc(),
						S0_T.pr(S1_T1.gd_cd).asc(),
						S0_T.pr(S1_T1.in_xfr_typ).asc(),
						S0_T.pr(S1_T1.quality_typ).asc(),
						S0_T.pr(S1_T1.stk_insp_typ).asc(),
						S0_T.pr(S1_T1.stk_id_typ).asc(),
						S0_T.pr(S1_T1.stk_bp_cd).asc(),
						S0_M2.wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("stktk_itm_spc_flg"))
					.predicate(DS0C_ITM_T1, p -> p.and(S1_W1.itm_cd.eq(S1_T1.itm_cd)).and(S1_W1.itm_sub1.eq(S1_T1.itm_sub1)).and(S1_W1.itm_sub2.eq(S1_T1.itm_sub2)).and(S1_W1.itm_sub3.eq(S1_T1.itm_sub3))),
				when(boundOr("stktk_itm_spc_flg"))
					.predicate(DS0C_ITM_T2, p -> p.and(S1_W1.itm_cd.eq(S2_T2.itm_cd)).and(S1_W1.itm_sub1.eq(S2_T2.itm_sub1)).and(S1_W1.itm_sub2.eq(S2_T2.itm_sub2)).and(S1_W1.itm_sub3.eq(S2_T2.itm_sub3)))
			);
	}
	
	/**
	 * -- MSBEL2610_MST_MLY_STK_DTL_Query_S02
	 */
	static MCQueryPlan MSBEL2610_MST_MLY_STK_DTL_S02() {
		MCTempView S0_T = createTempView("T");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MST_MLY_STK_DTL_R S1_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_R S2_M2 = MAM_ITM_R.create("M2");
		MST_IO_ACT_R S2_T2 = MST_IO_ACT_R.create("T2");
		MAM_LOC_R S1_M4 = MAM_LOC_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_LOC_R S2_M6 = MAM_LOC_R.create("M6");
		MAM_BP_R S2_M7 = MAM_BP_R.create("M7");
		
		MSW_STKTK_ACT_KEY_R S1_W1 = MSW_STKTK_ACT_KEY_R.create("W1");
		MCDynamicSQLID DS0C_ITM_T1 = createDynamicSQLID("DS0C_ITM_T1");
		MCDynamicSQLID DS0C_ITM_T2 = createDynamicSQLID("DS0C_ITM_T2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_MLY_STK_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.loc_cd),
						S0_M3.stktk_tor_ex_zero_flg,
						S0_T.pr(S1_T1.str_ln_cd),
						S0_T.pr(S1_T1.stk_arrv_bp_cd),
						S0_T.pr(S1_T1.lot_no),
						S0_T.pr(S1_T1.sublot_no),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr("fix_no_flg"),
						S0_T.pr("trd_unit_cd"),
						S0_T.pr(S1_T1.gd_cd),
						S0_T.pr(S1_T1.in_xfr_typ),
						S0_T.pr(S1_T1.quality_typ),
						S0_T.pr(S1_T1.stk_insp_typ),
						S0_T.pr(S1_T1.stk_id_typ),
						S0_T.pr(S1_T1.stk_bp_cd),
						S0_M3.wg_cd,
						sum(S0_T.pr("tor_qty")).as("tor_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.loc_cd,
							S1_T1.str_ln_cd,
							S1_T1.stk_arrv_bp_cd,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							decode(
								S1_T1.fix_no,
								value(MAC_STR.NULL_VAL.value()),
								value(false),
								value(true)
							).as("fix_no_flg"),
							S1_T1.pack_unit_cd.as("trd_unit_cd"),
							S1_T1.gd_cd,
							S1_T1.in_xfr_typ,
							S1_T1.quality_typ,
							S1_T1.stk_insp_typ,
							S1_T1.stk_id_typ,
							S1_T1.stk_bp_cd,
							S1_T1.pack_unit_qty.as("tor_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_W1).on(
								bracket(
									S1_W1.loc_cd.eq(S1_T1.loc_cd)
									.addDynamicPredicate(DS0C_ITM_T1)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M4).on(
									bracket(
											S1_M4.loc_cd.eq(S1_T1.loc_cd)
									)
								)
							.leftOuterJoin(S1_M5).on(
									bracket(
											S1_M5.bp_cd.eq(S1_M4.sppl_cd)
									)
								)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.ac_ym.eq(bind("ac_ym")))
							.and(S1_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
							.and(S1_T1.lot_no.neq(value(MSC_PURC_UNFIX_STR.UNFIXED.value())))
							.and(S1_M1.itm_cd.isNull())
							.and(value(0).eq(
									(cases()
											.when(
													S1_M4.sppl_cd.isNotNull()
													.and(S1_M5.onr_prsppl_flg.eq(value(false)))
													.and(S1_T1.stk_arrv_bp_cd.eq(value(MAC_STR.NULL_VAL.value()))))
											.then(value(1))
											.otherwise(value(0))
									)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T2.itm_cd,
								S2_T2.itm_sub1,
								S2_T2.itm_sub2,
								S2_T2.itm_sub3,
								S2_T2.loc_cd,
								S2_T2.str_ln_cd,
								S2_T2.stk_arrv_bp_cd,
								S2_T2.lot_no,
								S2_T2.sublot_no,
								S2_T2.sno1,
								S2_T2.sno2,
								S2_T2.sno3,
								S2_T2.sno4,
								decode(
									S2_T2.fix_no,
									value(MAC_STR.NULL_VAL.value()),
									value(false),
									value(true)
								).as("fix_no_flg"),
								S2_T2.pack_unit_cd.as("trd_unit_cd"),
								S2_T2.gd_cd,
								S2_T2.in_xfr_typ,
								S2_T2.quality_typ,
								S2_T2.stk_insp_typ,
								S2_T2.stk_id_typ,
								S2_T2.stk_bp_cd,
								sum(
									cases()
										.when(S2_T2.io_typ.eq(value(MSC_IO_TYP.GI.value())))
											.then(value(0).subtract(S2_T2.pack_unit_qty))
										.otherwise(S2_T2.pack_unit_qty)
								).as("tor_qty")
							)
							.from(
								S2_T2
								.innerJoin(S1_W1).on(
									bracket(
										S1_W1.stktk_base_dt.gte(S2_T2.ac_dt)
										.and(S1_W1.loc_cd.eq(S2_T2.loc_cd))
										.addDynamicPredicate(DS0C_ITM_T2)
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.itm_cd.eq(S2_T2.itm_cd)
										.and(S2_M2.itm_sub1.eq(S2_T2.itm_sub1))
										.and(S2_M2.itm_sub2.eq(S2_T2.itm_sub2))
										.and(S2_M2.itm_sub3.eq(S2_T2.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M6).on(
										bracket(
												S2_M6.loc_cd.eq(S2_T2.loc_cd)
										)
									)
								.leftOuterJoin(S2_M7).on(
										bracket(
												S2_M7.bp_cd.eq(S2_M6.sppl_cd)
										)
									)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T2.ac_ym.gt(bind("ac_ym")))
								.cutoff$and(S2_T2.ac_dt.gt(bind("cl_end_dt")))
								.and(
									S2_T2.io_typ.in(
										value(MSC_IO_TYP.GI.value()),
										value(MSC_IO_TYP.GR.value())
									)
								)
								.and(S2_T2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
								.and(S2_T2.trn_typ.neq(value(MSC_TRN_TYP.RCV_ACT.value())))
								.and(S2_T2.io_act_typ.neq(value(MSC_IO_ACT_TYP.INPT_SLF.value())))
								.and(S2_T2.lot_no.neq(value(MSC_PURC_UNFIX_STR.UNFIXED.value())))
								.and(S2_T2.pack_unit_qty.neq(value(0)))
								.and(S2_M2.itm_cd.isNull())
								.and(value(0).eq(
										(cases()
												.when(
														S2_M6.sppl_cd.isNotNull()
														.and(S2_M7.onr_prsppl_flg.eq(value(false)))
														.and(S2_T2.stk_arrv_bp_cd.eq(value(MAC_STR.NULL_VAL.value()))))
												.then(value(1))
												.otherwise(value(0))
										)
									)
								)
							)
							.groupBy(
								S2_T2.itm_cd,
								S2_T2.itm_sub1,
								S2_T2.itm_sub2,
								S2_T2.itm_sub3,
								S2_T2.loc_cd,
								S2_T2.str_ln_cd,
								S2_T2.stk_arrv_bp_cd,
								S2_T2.lot_no,
								S2_T2.sublot_no,
								S2_T2.sno1,
								S2_T2.sno2,
								S2_T2.sno3,
								S2_T2.sno4,
								S2_T2.fix_no,
								S2_T2.pack_unit_cd,
								S2_T2.gd_cd,
								S2_T2.in_xfr_typ,
								S2_T2.quality_typ,
								S2_T2.stk_insp_typ,
								S2_T2.stk_id_typ,
								S2_T2.stk_bp_cd
							)
						).view(S0_T)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T.pr(S1_T1.loc_cd).eq(S0_M3.loc_cd)
							)
						)
					)
					.groupBy(
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.loc_cd),
						S0_M3.stktk_tor_ex_zero_flg,
						S0_T.pr(S1_T1.str_ln_cd),
						S0_T.pr(S1_T1.stk_arrv_bp_cd),
						S0_T.pr(S1_T1.lot_no),
						S0_T.pr(S1_T1.sublot_no),
						S0_T.pr(S1_T1.sno1),
						S0_T.pr(S1_T1.sno2),
						S0_T.pr(S1_T1.sno3),
						S0_T.pr(S1_T1.sno4),
						S0_T.pr("fix_no_flg"),
						S0_T.pr("trd_unit_cd"),
						S0_T.pr(S1_T1.gd_cd),
						S0_T.pr(S1_T1.in_xfr_typ),
						S0_T.pr(S1_T1.quality_typ),
						S0_T.pr(S1_T1.stk_insp_typ),
						S0_T.pr(S1_T1.stk_id_typ),
						S0_T.pr(S1_T1.stk_bp_cd),
						S0_M3.wg_cd
					)
					.having(
						sum(S0_T.pr("tor_qty")).neq(value(0))
						.or(S0_M3.stktk_tor_ex_zero_flg.eq(value(false)))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("stktk_itm_spc_flg"))
					.predicate(DS0C_ITM_T1, p -> p.and(S1_W1.itm_cd.eq(S1_T1.itm_cd)).and(S1_W1.itm_sub1.eq(S1_T1.itm_sub1)).and(S1_W1.itm_sub2.eq(S1_T1.itm_sub2)).and(S1_W1.itm_sub3.eq(S1_T1.itm_sub3))),
				when(boundOr("stktk_itm_spc_flg"))
					.predicate(DS0C_ITM_T2, p -> p.and(S1_W1.itm_cd.eq(S2_T2.itm_cd)).and(S1_W1.itm_sub1.eq(S2_T2.itm_sub1)).and(S1_W1.itm_sub2.eq(S2_T2.itm_sub2)).and(S1_W1.itm_sub3.eq(S2_T2.itm_sub3)))
			);
	}
	
	/**
	 * -- MSBEL2610_MST_STKTK_ACT_Query_D01
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_ACT_D01() {
		MST_STKTK_ACT_R S0 = MST_STKTK_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_ACT_Query_D01")
					.delete(S0)
					.where(
						value(0).eq(value(0))
						.and(S0.stktk_base_dt.eq(bind("stktk_base_dt")))
						.and(S0.loc_cd.eq(bind("loc_cd")))
						.cutoff$and(S0.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0.itm_sub3.eq(bind("itm_sub3")))
					)
			);
	}
	
	/**
	 * -- MSBEL2610_MST_STKTK_ACT_Query_U01
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_ACT_U01() {
		MST_STKTK_ACT_R S0 = MST_STKTK_ACT_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_ACT_Query_U01")
					.update(S0)
					.set(S0.keep_data_flg).eq(value(true))
					.where(
						value(0).eq(value(0))
						.and(S0.stktk_base_dt.eq(bind("stktk_base_dt")))
						.and(S0.loc_cd.eq(bind("loc_cd")))
						.cutoff$and(S0.itm_cd.eq(bind("itm_cd")))
						.cutoff$and(S0.itm_sub1.eq(bind("itm_sub1")))
						.cutoff$and(S0.itm_sub2.eq(bind("itm_sub2")))
						.cutoff$and(S0.itm_sub3.eq(bind("itm_sub3")))
					)
			);
	}
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S01
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S01() {
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MST_PRE_STKTK_R S0_T2 = MST_PRE_STKTK_R.create("T2");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S01")
					.mainQuery()
					.select(
						nvl(
							S0_T1.ctrl_tgt_dt,
							bind("ctrl_tgt_dt")
						).as("ctrl_tgt_dt"),
						S0_M1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						value(MAC_STR.NULL_VAL.value()).as("itm_cd"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub1"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub2"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub3"),
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T2.last_stktk_dt,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T2.latest_stktk_st_dt,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T2.upd_cntr.as("pre_stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_cd))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub1))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub2))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub3))
								.and(bind("ctrl_tgt_dt").eq(S0_T1.ctrl_tgt_dt))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T2.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_cd))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub1))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub2))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(
							nvl(
								S0_T1.io_ctrl_flg,
								value(false)
							).eq(value(false))
						)
						.and(
							nvl(
								S0_T1.stktk_sts_typ,
								value("0")
							).eq(value("0"))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_wtg")))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_st")))
						)
						.cutoff$and(S0_M1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
					)
					.orderBy(
						pr("ctrl_tgt_dt").asc(),
						S0_M1.loc_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S02
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S02() {
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S02")
					.mainQuery()
					.select(
						nvl(
							S0_T1.ctrl_tgt_dt,
							bind("ctrl_tgt_dt")
						).as("ctrl_tgt_dt"),
						S0_M1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_M2.itm_cd,
						S0_M2.itm_sub1,
						S0_M2.itm_sub2,
						S0_M2.itm_sub3,
						S0_M2.itm_nm,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_M1
						.crossJoin(S0_M2)
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.loc_cd)
								.and(S0_M2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(bind("ctrl_tgt_dt").eq(S0_T1.ctrl_tgt_dt))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M2.del_flg.eq(value(false)))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(
							nvl(
								S0_T1.io_ctrl_flg,
								value(false)
							).eq(value(false))
						)
						.and(
							nvl(
								S0_T1.stktk_sts_typ,
								value("0")
							).eq(value("0"))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_wtg")))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_st")))
						)
						.and(S0_M2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
						.cutoff$and(S0_M1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						pr("ctrl_tgt_dt").asc(),
						S0_M1.loc_cd.asc(),
						S0_M2.itm_cd.asc(),
						S0_M2.itm_sub1.asc(),
						S0_M2.itm_sub2.asc(),
						S0_M2.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PRE_STKTK_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.last_stktk_dt,
							m.latest_stktk_st_dt,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setDateNE("last_stktk_dt", m.last_stktk_dt());
							r.setDateNE("latest_stktk_st_dt", m.latest_stktk_st_dt());
							r.setNumberNE("pre_stktk_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S03
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S03() {
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MST_PRE_STKTK_R S0_T2 = MST_PRE_STKTK_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MCTempView S0_T4 = createTempView("T4");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
		MST_STKTK_R S1_X1 = MST_STKTK_R.create("X1");
		MST_PRE_STKTK_R S2_X2 = MST_PRE_STKTK_R.create("X2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S03")
					.mainQuery()
					.select(
						nvl(
							S0_T1.ctrl_tgt_dt,
							bind("ctrl_tgt_dt")
						).as("ctrl_tgt_dt"),
						S0_M1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						value(MAC_STR.NULL_VAL.value()).as("itm_cd"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub1"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub2"),
						value(MAC_STR.NULL_VAL.value()).as("itm_sub3"),
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						nvl(
							S0_T2.last_stktk_dt,
							S0_T4.pr("last_stktk_dt")
						).as("last_stktk_dt"),
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						nvl(
							S0_T2.latest_stktk_st_dt,
							S0_T4.pr("latest_stktk_st_dt")
						).as("latest_stktk_st_dt"),
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T2.upd_cntr.as("pre_stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_cd))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub1))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub2))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T1.itm_sub3))
								.and(bind("ctrl_tgt_dt").eq(S0_T1.ctrl_tgt_dt))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T2.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_cd))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub1))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub2))
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_X1.loc_cd,
								max(S1_X1.stktk_typ).as("stktk_typ"),
								max(S1_X1.stktk_sts_typ).as("stktk_sts_typ"),
								max(S1_X1.io_ctrl_flg).as("io_ctrl_flg"),
								max(S1_X1.stktk_st_tm).as("stktk_st_tm"),
								max(S1_X1.diff_upd_tm).as("diff_upd_tm")
							)
							.from(S1_X1)
							.where(
								value(0).eq(value(0))
								.and(value(MAC_STR.NULL_VAL.value()).neq(S1_X1.itm_cd))
								.and(bind("ctrl_tgt_dt").eq(S1_X1.ctrl_tgt_dt))
							)
							.groupBy(S1_X1.loc_cd).view(S0_T3)
						).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T3.pr(S1_X1.loc_cd))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_X2.loc_cd,
								max(S2_X2.last_stktk_dt).as("last_stktk_dt"),
								max(S2_X2.latest_stktk_st_dt).as("latest_stktk_st_dt")
							)
							.from(S2_X2)
							.where(
								value(0).eq(value(0))
								.and(value(MAC_STR.NULL_VAL.value()).neq(S2_X2.itm_cd))
							)
							.groupBy(S2_X2.loc_cd).view(S0_T4)
						).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T4.pr(S2_X2.loc_cd))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(
							nvl(
								nvl(
									S0_T1.stktk_sts_typ,
									S0_T3.pr("stktk_sts_typ")
								),
								value("0")
							).eq(value("0"))
							.cutoff$or(
								nvl(
									S0_T1.stktk_sts_typ,
									S0_T3.pr("stktk_sts_typ")
								).eq(bind("tmp_stktk_sts_wtg"))
							)
						)
						.cutoff$and(S0_M1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
					)
					.orderBy(
						pr("ctrl_tgt_dt").asc(),
						S0_M1.loc_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S04
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S04() {
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MST_PRE_STKTK_R S0_T2 = MST_PRE_STKTK_R.create("T2");
		MST_STKTK_R S0_T3 = MST_STKTK_R.create("T3");
		MST_PRE_STKTK_R S0_T4 = MST_PRE_STKTK_R.create("T4");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S04")
					.mainQuery()
					.select(
						nvl(
							S0_T1.ctrl_tgt_dt,
							bind("ctrl_tgt_dt")
						).as("ctrl_tgt_dt"),
						S0_M1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_M2.itm_cd,
						S0_M2.itm_sub1,
						S0_M2.itm_sub2,
						S0_M2.itm_sub3,
						S0_M2.itm_nm,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						nvl(
							S0_T2.last_stktk_dt,
							S0_T4.last_stktk_dt
						).as("last_stktk_dt"),
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						nvl(
							S0_T2.latest_stktk_st_dt,
							S0_T4.latest_stktk_st_dt
						).as("latest_stktk_st_dt"),
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T2.upd_cntr.as("pre_stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_M1
						.crossJoin(S0_M2)
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.loc_cd)
								.and(S0_M2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(bind("ctrl_tgt_dt").eq(S0_T1.ctrl_tgt_dt))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T2.loc_cd)
								.and(S0_M2.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T3.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T3.itm_cd))
								.and(bind("ctrl_tgt_dt").eq(S0_T3.ctrl_tgt_dt))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T4.loc_cd)
								.and(value(MAC_STR.NULL_VAL.value()).eq(S0_T4.itm_cd))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M2.del_flg.eq(value(false)))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(
							nvl(
								nvl(
									S0_T1.stktk_sts_typ,
									S0_T3.stktk_sts_typ
								),
								value("0")
							).eq(value("0"))
							.cutoff$or(
								nvl(
									S0_T1.stktk_sts_typ,
									S0_T3.stktk_sts_typ
								).eq(bind("tmp_stktk_sts_wtg"))
							)
						)
						.and(S0_M2.stk_mng_typ.eq(value(MAC_STK_MNG_TYP.MNG.value())))
						.cutoff$and(S0_M1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						pr("ctrl_tgt_dt").asc(),
						S0_M1.loc_cd.asc(),
						S0_M2.itm_cd.asc(),
						S0_M2.itm_sub1.asc(),
						S0_M2.itm_sub2.asc(),
						S0_M2.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S05
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S05() {
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S05")
					.mainQuery()
					.select(
						S0_T1.ctrl_tgt_dt,
						S0_T1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_st")))
						.cutoff$and(
							S0_T1.itm_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(bind("no_itm").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.itm_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(bind("has_itm").eq(value(true)))
						)
						.cutoff$and(S0_T1.stktk_typ.eq(bind("stktk_typ")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ctrl_tgt_dt.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.itm_cd.eq(S0_M2.itm_cd).and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PRE_STKTK_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.last_stktk_dt,
							m.latest_stktk_st_dt,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setDateNE("last_stktk_dt", m.last_stktk_dt());
							r.setDateNE("latest_stktk_st_dt", m.latest_stktk_st_dt());
							r.setNumberNE("pre_stktk_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S06
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S06() {
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S06")
					.mainQuery()
					.select(
						S0_T1.ctrl_tgt_dt,
						S0_T1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(S0_T1.io_ctrl_flg.eq(value(true)))
						.and(
							S0_T1.stktk_sts_typ.eq(value("0"))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_wtg")))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_st")))
						)
						.cutoff$and(
							S0_T1.itm_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.and(bind("no_itm").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.itm_cd.neq(value(MAC_STR.NULL_VAL.value()))
							.and(bind("has_itm").eq(value(true)))
						)
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ctrl_tgt_dt.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.itm_cd.eq(S0_M2.itm_cd).and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PRE_STKTK_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.last_stktk_dt,
							m.latest_stktk_st_dt,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setDateNE("last_stktk_dt", m.last_stktk_dt());
							r.setDateNE("latest_stktk_st_dt", m.latest_stktk_st_dt());
							r.setNumberNE("pre_stktk_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S11
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S11() {
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MST_PRE_STKTK_R S0_T2 = MST_PRE_STKTK_R.create("T2");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S11")
					.mainQuery()
					.select(
						S0_T1.ctrl_tgt_dt,
						S0_T1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T2.last_stktk_dt,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T2.latest_stktk_st_dt,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T2.upd_cntr.as("pre_stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.loc_cd.eq(S0_T2.loc_cd)
								.and(S0_T1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_rfl")))
						.and(S0_T1.ctrl_tgt_dt.gte(S0_T2.latest_stktk_st_dt))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ctrl_tgt_dt.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.itm_cd.eq(S0_M2.itm_cd).and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	/**
	 * -- MSBEL2610_MST_STKTK_Query_S12
	 */
	static MCQueryPlan MSBEL2610_MST_STKTK_S12() {
		MST_STKTK_R S0_T1 = MST_STKTK_R.create("T1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_ITM_TYP_D_R S0_M3 = MAM_ITM_TYP_D_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_ALLOC_GRP_R S0_M8 = MAM_ALLOC_GRP_R.create("M8");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2610_MST_STKTK_Query_S12")
					.mainQuery()
					.select(
						S0_T1.ctrl_tgt_dt,
						S0_T1.loc_cd,
						S0_M1.loc_nm,
						S0_M1.site_cd,
						S0_M1.wg_cd,
						S0_M1.lg_grp_cd,
						S0_M1.loc_grp_cd,
						S0_M1.alloc_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.stktk_typ,
						S0_T1.stktk_sts_typ,
						S0_T1.io_ctrl_flg,
						S0_T1.act_qty_keep_flg,
						S0_T1.stktk_st_tm,
						S0_T1.diff_upd_tm,
						S0_T1.act_dpt_cd,
						S0_M9.dpt_nm.as("act_dpt_nm"),
						S0_T1.act_usr_cd,
						S0_T1.stktk_rpt_rmrks,
						S0_T1.intr_rmrks.as("stktk_intr_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("stktk_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M9.dpt_cd)
								.and(S0_M9.st_dt.lte(S0_T1.ctrl_tgt_dt))
								.and(S0_M9.end_dt.gt(S0_T1.ctrl_tgt_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.loc_cd.eq(S0_M99.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.stktk_tgt_flg.eq(value(true)))
						.and(
							S0_T1.stktk_sts_typ.eq(value("0"))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_wtg")))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_st")))
							.cutoff$or(S0_T1.stktk_sts_typ.eq(bind("tmp_stktk_sts_rfl")))
						)
						.cutoff$and(S0_T1.ctrl_tgt_dt.gte(bind("ctrl_tgt_dt_fr")))
						.cutoff$and(S0_T1.ctrl_tgt_dt.lte(bind("ctrl_tgt_dt_to")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_M1.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M9.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.stktk_rpt_rmrks.like(bind("stktk_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("stktk_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.neq(bind("tmp_not_invlist")))
							.cutoff$or(S0_T1.stktk_rpt_prnt_flg.eq(bind("tmp_invlist")))
						)
						.and(
							S0_T1.ctrl_tgt_dt.isNull()
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.neq(bind("tmp_not_difflist")))
							.cutoff$or(S0_T1.diff_rpt_prnt_flg.eq(bind("tmp_difflist")))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ctrl_tgt_dt.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.itm_cd.eq(S0_M2.itm_cd).and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1)).and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2)).and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M2.itm_nm.like(bind("itm_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.itm_typ.eq(S0_M3.itm_typ).and(S0_M2.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M1.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M1.wg_cd.eq(S0_M5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M1.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M1.loc_grp_cd.eq(S0_M7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M1.alloc_grp_cd.eq(S0_M8.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.act_usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PRE_STKTK_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.last_stktk_dt,
							m.latest_stktk_st_dt,
							m.upd_cntr
						))
						.addMap((r, m) -> {
							r.setDateNE("last_stktk_dt", m.last_stktk_dt());
							r.setDateNE("latest_stktk_st_dt", m.latest_stktk_st_dt());
							r.setNumberNE("pre_stktk_upd_cntr", m.upd_cntr());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
}