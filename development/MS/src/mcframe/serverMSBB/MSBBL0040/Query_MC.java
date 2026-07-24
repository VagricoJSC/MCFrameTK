package mcframe.serverMSBB.MSBBL0040;

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
	 * -- MSBBL0040_MST_CST_FRCST_D_Query_S01
	 */
	static MCQueryPlan MSBBL0040_MST_CST_FRCST_D_S01() {
		MST_CST_FRCST_H_R S0_T1 = MST_CST_FRCST_H_R.create("T1");
		MST_CST_FRCST_D_R S0_T2 = MST_CST_FRCST_D_R.create("T2");
		MST_SLO_RSN_R S0_T3 = MST_SLO_RSN_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_ITM_TYP_D_R S0_M9 = MAM_ITM_TYP_D_R.create("M9");
		MAVM_RD_DPT_R S0_M10 = MAVM_RD_DPT_R.create("M10");
		MAM_BP_GRP_R S0_CSTG1 = MAM_BP_GRP_R.create("CSTG1");
		MAM_BP_GRP_R S0_CSTG2 = MAM_BP_GRP_R.create("CSTG2");
		MAM_BP_GRP_R S0_CSTG3 = MAM_BP_GRP_R.create("CSTG3");
		MAM_BP_GRP_R S0_CSTG4 = MAM_BP_GRP_R.create("CSTG4");
		MAM_BP_GRP_R S0_CSTG5 = MAM_BP_GRP_R.create("CSTG5");
		MAM_BP_GRP_R S0_CSTG6 = MAM_BP_GRP_R.create("CSTG6");
		MAM_BP_GRP_R S0_CSTG7 = MAM_BP_GRP_R.create("CSTG7");
		MAM_BP_GRP_R S0_CSTG8 = MAM_BP_GRP_R.create("CSTG8");
		MAM_BP_GRP_R S0_CSTG9 = MAM_BP_GRP_R.create("CSTG9");
		MAM_BP_GRP_R S0_CSTG10 = MAM_BP_GRP_R.create("CSTG10");
		MAM_BP_GRP_R S0_DLVG1 = MAM_BP_GRP_R.create("DLVG1");
		MAM_BP_GRP_R S0_DLVG2 = MAM_BP_GRP_R.create("DLVG2");
		MAM_BP_GRP_R S0_DLVG3 = MAM_BP_GRP_R.create("DLVG3");
		MAM_BP_GRP_R S0_DLVG4 = MAM_BP_GRP_R.create("DLVG4");
		MAM_BP_GRP_R S0_DLVG5 = MAM_BP_GRP_R.create("DLVG5");
		MAM_BP_GRP_R S0_DLVG6 = MAM_BP_GRP_R.create("DLVG6");
		MAM_BP_GRP_R S0_DLVG7 = MAM_BP_GRP_R.create("DLVG7");
		MAM_BP_GRP_R S0_DLVG8 = MAM_BP_GRP_R.create("DLVG8");
		MAM_BP_GRP_R S0_DLVG9 = MAM_BP_GRP_R.create("DLVG9");
		MAM_BP_GRP_R S0_DLVG10 = MAM_BP_GRP_R.create("DLVG10");
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
		MCTempView S1_T = createTempView("T");
		MST_CST_FRCST_H_R S2_T1 = MST_CST_FRCST_H_R.create("T1");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_CST_FRCST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.cst_frcst_no,
						S0_T1.cst_frcst_prnt_dt,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.frcst_dpt_cd,
						S0_M3.dpt_nm.as("frcst_dpt_nm"),
						S0_T1.frcst_usr_cd,
						S0_T1.rcpt_dt,
						S0_T1.cst_frcst_slip_no,
						S0_T1.wrk_no,
						S0_T1.can_rsn_cd,
						S0_T1.can_rmrks,
						S0_T1.can_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.fix_flg,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_M5.itm_nm,
						S0_T2.frcst_period_typ,
						S0_T2.frcst_st_dt,
						S0_T2.frcst_end_dt,
						S0_T2.frcst_dt,
						S0_T2.trd_unit_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.gi_loc_cd,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.cst_frcst_slip_d_no,
						S0_T2.disp_seq,
						S0_T2.prms_qty,
						S0_T2.frcst_stop_flg,
						S0_T2.intr_rmrks.as("dtl_intr_rmrks"),
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_M5.itm_typ,
						S0_M5.itm_typ_d_cd,
						S0_T2.cst_frcst_d_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.cst_frcst_no.eq(S0_T2.cst_frcst_no)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.frcst_dpt_cd.eq(S0_M3.dpt_cd)
								.and(S0_T1.rcpt_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T2.itm_cd.eq(S0_M5.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M5.itm_sub3))
							)
						)
						.innerJoin(S0_M10).on(
							bracket(
								S0_T1.frcst_dpt_cd.eq(S0_M10.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T2.fix_flg.eq(bind("fix_flg_str")))
						.cutoff$and(S0_T2.frcst_stop_flg.eq(bind("frcst_stop_flg_str")))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_prnt_dt.gte(bind("cst_frcst_prnt_dt_fr")))
						.cutoff$and(S0_T1.cst_frcst_prnt_dt.lte(bind("cst_frcst_prnt_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.cst_frcst_slip_no.like(bind("cst_frcst_slip_no")))
						.cutoff$and(S0_T2.cst_frcst_slip_d_no.like(bind("cst_frcst_slip_d_no")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.frcst_usr_cd.like(bind("frcst_usr_cd")))
						.cutoff$and(S0_T1.frcst_dpt_cd.like(bind("frcst_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("frcst_dpt_nm")))
						.cutoff$and(S0_T1.can_rsn_cd.like(bind("can_rsn_cd")))
						.cutoff$and(S0_T1.can_rmrks.like(bind("can_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.cst_frcst_d_no.like(bind("cst_frcst_d_no")))
						.cutoff$and(S0_T2.frcst_period_typ.like(bind("frcst_period_typ")))
						.cutoff$and(S0_T2.frcst_st_dt.gte(bind("frcst_st_dt_fr")))
						.cutoff$and(S0_T2.frcst_st_dt.lte(bind("frcst_st_dt_to")))
						.cutoff$and(S0_T2.frcst_end_dt.gte(bind("frcst_end_dt_fr")))
						.cutoff$and(S0_T2.frcst_end_dt.lte(bind("frcst_end_dt_to")))
						.cutoff$and(S0_T2.frcst_dt.gte(bind("frcst_dt_fr")))
						.cutoff$and(S0_T2.frcst_dt.lte(bind("frcst_dt_to")))
						.cutoff$and(S0_M5.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M5.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M5.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.and(
							bracket(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
							.or(
								bind("inc_can_flg").eq(value(true))
								.and(
									S0_T1.can_flg.in(
										value(false),
										value(true)
									)
								)
							)
						)
						.and(
							bind("latest_flg").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										subQuery()
										.select(
											S2_T1.cst_cd,
											S2_T1.dlv_cd,
											S2_T1.frcst_dpt_cd,
											S2_T1.wrk_no,
											max(S2_T1.rcpt_dt).as("max_rcpt_dt")
										)
										.from(S2_T1)
										.where(
											value(0).eq(value(0))
											.and(
												bracket(
													bind("inc_can_flg").eq(value(false))
													.and(S2_T1.can_flg.eq(value(false)))
												)
												.or(
													bind("inc_can_flg").eq(value(true))
													.and(
														S2_T1.can_flg.in(
															value(false),
															value(true)
														)
													)
												)
											)
											.cutoff$and(S2_T1.cst_cd.like(bind("cst_cd")))
											.cutoff$and(S2_T1.dlv_cd.like(bind("dlv_cd")))
											.cutoff$and(S2_T1.frcst_dpt_cd.like(bind("frcst_dpt_cd")))
											.cutoff$and(S2_T1.wrk_no.like(bind("wrk_no")))
											.cutoff$and(S2_T1.cst_frcst_no.like(bind("cst_frcst_no")))
											.cutoff$and(S2_T1.cst_frcst_prnt_dt.gte(bind("cst_frcst_prnt_dt_fr")))
											.cutoff$and(S2_T1.cst_frcst_prnt_dt.lte(bind("cst_frcst_prnt_dt_to")))
											.cutoff$and(S2_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
											.cutoff$and(S2_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
											.cutoff$and(S2_T1.cst_frcst_slip_no.like(bind("cst_frcst_slip_no")))
											.cutoff$and(S2_T1.frcst_usr_cd.like(bind("frcst_usr_cd")))
											.cutoff$and(S2_T1.can_rsn_cd.like(bind("can_rsn_cd")))
											.cutoff$and(S2_T1.can_rmrks.like(bind("can_rmrks")))
											.cutoff$and(S2_T1.intr_rmrks.like(bind("intr_rmrks")))
											.cutoff$and(S2_T1.sub_char1.like(bind("sub_char1")))
											.cutoff$and(S2_T1.sub_char2.like(bind("sub_char2")))
											.cutoff$and(S2_T1.sub_char3.like(bind("sub_char3")))
										)
										.groupBy(
											S2_T1.cst_cd,
											S2_T1.dlv_cd,
											S2_T1.frcst_dpt_cd,
											S2_T1.wrk_no
										).view(S1_T)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.cst_cd.eq(S1_T.pr(S2_T1.cst_cd)))
										.and(
											S0_T1.dlv_cd.isNull()
											.and(S1_T.pr(S2_T1.dlv_cd).isNull())
											.or(S0_T1.dlv_cd.eq(S1_T.pr(S2_T1.dlv_cd)))
										)
										.and(S0_T1.frcst_dpt_cd.eq(S1_T.pr(S2_T1.frcst_dpt_cd)))
										.and(
											S0_T1.wrk_no.isNull()
											.and(S1_T.pr(S2_T1.wrk_no).isNull())
											.or(S0_T1.wrk_no.eq(S1_T.pr(S2_T1.wrk_no)))
										)
										.and(S0_T1.rcpt_dt.eq(S1_T.pr("max_rcpt_dt")))
									)
								)
							)
							.or(bind("latest_flg").eq(value(false)))
						)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.cst_frcst_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.can_rsn_cd.eq(S0_T3.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.slo_rsn_nm.like(bind("can_rsn_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.cst_cd.eq(S0_M1.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("cst_nm")))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.dlv_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("frcst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.frcst_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("frcst_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M5.itm_typ.eq(S0_M9.itm_typ).and(S0_M5.itm_typ_d_cd.eq(S0_M9.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M9.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd1.as("cst_grp_cd1"), S0_CSTG1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG1).on(S0_M1.bp_grp_cd1.eq(S0_CSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CSTG1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CSTG1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd2.as("cst_grp_cd2"), S0_CSTG2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG2).on(S0_M1.bp_grp_cd2.eq(S0_CSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CSTG2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CSTG2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd3.as("cst_grp_cd3"), S0_CSTG3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG3).on(S0_M1.bp_grp_cd3.eq(S0_CSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CSTG3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CSTG3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd4.as("cst_grp_cd4"), S0_CSTG4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG4).on(S0_M1.bp_grp_cd4.eq(S0_CSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CSTG4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CSTG4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd5.as("cst_grp_cd5"), S0_CSTG5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG5).on(S0_M1.bp_grp_cd5.eq(S0_CSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CSTG5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CSTG5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd6.as("cst_grp_cd6"), S0_CSTG6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG6).on(S0_M1.bp_grp_cd6.eq(S0_CSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CSTG6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CSTG6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd7.as("cst_grp_cd7"), S0_CSTG7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG7).on(S0_M1.bp_grp_cd7.eq(S0_CSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CSTG7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CSTG7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd8.as("cst_grp_cd8"), S0_CSTG8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG8).on(S0_M1.bp_grp_cd8.eq(S0_CSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CSTG8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CSTG8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd9.as("cst_grp_cd9"), S0_CSTG9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG9).on(S0_M1.bp_grp_cd9.eq(S0_CSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CSTG9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CSTG9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd10.as("cst_grp_cd10"), S0_CSTG10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG10).on(S0_M1.bp_grp_cd10.eq(S0_CSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CSTG10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CSTG10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVG1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG1).on(S0_M2.bp_grp_cd1.eq(S0_DLVG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVG1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVG1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVG2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG2).on(S0_M2.bp_grp_cd2.eq(S0_DLVG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVG2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVG2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVG3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG3).on(S0_M2.bp_grp_cd3.eq(S0_DLVG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVG3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVG3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVG4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG4).on(S0_M2.bp_grp_cd4.eq(S0_DLVG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVG4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVG4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVG5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG5).on(S0_M2.bp_grp_cd5.eq(S0_DLVG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVG5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVG5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVG6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG6).on(S0_M2.bp_grp_cd6.eq(S0_DLVG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVG6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVG6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVG7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG7).on(S0_M2.bp_grp_cd7.eq(S0_DLVG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVG7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVG7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVG8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG8).on(S0_M2.bp_grp_cd8.eq(S0_DLVG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVG8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVG8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVG9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG9).on(S0_M2.bp_grp_cd9.eq(S0_DLVG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVG9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVG9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVG10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG10).on(S0_M2.bp_grp_cd10.eq(S0_DLVG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVG10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVG10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
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
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("frcst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("frcst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setNumberNE("dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_qty_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL0040_MST_CST_FRCST_D_Query_S02
	 */
	static MCQueryPlan MSBBL0040_MST_CST_FRCST_D_S02() {
		MCTempView S0_T1 = createTempView("T1");
		MCTempView S0_T3 = createTempView("T3");
		MST_CST_FRCST_H_R S1_T1A = MST_CST_FRCST_H_R.create("T1A");
		MST_CST_FRCST_D_R S1_T1B = MST_CST_FRCST_D_R.create("T1B");
		MCTempView S1_T1C = createTempView("T1C");
		MST_CST_FRCST_H_R S2_T2A = MST_CST_FRCST_H_R.create("T2A");
		MST_CST_FRCST_D_R S2_T2B = MST_CST_FRCST_D_R.create("T2B");
		MSW_CST_FRCST_D_KEY_R S2_W = MSW_CST_FRCST_D_KEY_R.create("W");
		MST_CST_FRCST_H_R S4_T3A = MST_CST_FRCST_H_R.create("T3A");
		MST_CST_FRCST_D_R S4_T3B = MST_CST_FRCST_D_R.create("T3B");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_CST_FRCST_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pr(S2_W.cst_frcst_d_no),
						S0_T3.pr(S4_T3A.cst_frcst_prnt_dt).as("last_cst_frcst_prnt_dt"),
						S0_T3.pr("rcpt_dt").as("last_rcpt_dt"),
						sum(S0_T3.pr(S4_T3B.base_unit_qty)).as("last_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1A.cst_cd,
							S1_T1A.dlv_cd,
							S1_T1A.wrk_no,
							S1_T1A.frcst_dpt_cd,
							max(S1_T1A.rcpt_dt).as("rcpt_dt"),
							S1_T1B.itm_cd,
							S1_T1B.itm_sub1,
							S1_T1B.itm_sub2,
							S1_T1B.itm_sub3,
							S1_T1B.frcst_period_typ,
							S1_T1B.frcst_dt,
							S1_T1C.pr(S2_W.cst_frcst_d_no)
						)
						.from(
							S1_T1A
							.innerJoin(S1_T1B).on(
								bracket(
									S1_T1A.cst_frcst_no.eq(S1_T1B.cst_frcst_no)
								)
							)
							.innerJoin(
								subQuery()
								.select(
									S2_T2A.cst_cd,
									S2_T2A.dlv_cd,
									S2_T2A.wrk_no,
									S2_T2A.frcst_dpt_cd,
									S2_T2A.rcpt_dt,
									S2_T2B.itm_cd,
									S2_T2B.itm_sub1,
									S2_T2B.itm_sub2,
									S2_T2B.itm_sub3,
									S2_T2B.frcst_period_typ,
									S2_T2B.frcst_dt,
									S2_W.cst_frcst_d_no
								).from(
									S2_T2B
									.innerJoin(S2_T2A).on(
										bracket(S2_T2B.cst_frcst_no.eq(S2_T2A.cst_frcst_no)))
									.innerJoin(S2_W).on(
										bracket(S2_T2B.cst_frcst_d_no.eq(S2_W.cst_frcst_d_no)))
								).view(S1_T1C)
						).on(
							value(0).eq(value(0))
							.and(S1_T1A.cst_cd.eq(S1_T1C.pr(S2_T2A.cst_cd)))
							.and(
								S1_T1A.dlv_cd.isNull()
								.and(S1_T1C.pr(S2_T2A.dlv_cd).isNull())
								.or(S1_T1A.dlv_cd.eq(S1_T1C.pr(S2_T2A.dlv_cd)))
							)
							.and(
								S1_T1A.wrk_no.isNull()
								.and(S1_T1C.pr(S2_T2A.wrk_no).isNull())
								.or(S1_T1A.wrk_no.eq(S1_T1C.pr(S2_T2A.wrk_no)))
							)
							.and(S1_T1A.frcst_dpt_cd.eq(S1_T1C.pr(S2_T2A.frcst_dpt_cd)))
							.and(S1_T1A.rcpt_dt.lt(S1_T1C.pr(S2_T2A.rcpt_dt)))
							.and(S1_T1B.itm_cd.eq(S1_T1C.pr(S2_T2B.itm_cd)))
							.and(S1_T1B.itm_sub1.eq(S1_T1C.pr(S2_T2B.itm_sub1)))
							.and(S1_T1B.itm_sub2.eq(S1_T1C.pr(S2_T2B.itm_sub2)))
							.and(S1_T1B.itm_sub3.eq(S1_T1C.pr(S2_T2B.itm_sub3)))
							.and(S1_T1B.frcst_period_typ.eq(S1_T1C.pr(S2_T2B.frcst_period_typ)))
							.and(S1_T1B.frcst_dt.eq(S1_T1C.pr(S2_T2B.frcst_dt)))
						)
					).where(
						value(0).eq(value(0))
						.and(S1_T1A.can_flg.eq(value(false)))
					).groupBy(
							S1_T1A.cst_cd,
							S1_T1A.dlv_cd,
							S1_T1A.wrk_no,
							S1_T1A.frcst_dpt_cd,
							S1_T1B.itm_cd,
							S1_T1B.itm_sub1,
							S1_T1B.itm_sub2,
							S1_T1B.itm_sub3,
							S1_T1B.frcst_period_typ,
							S1_T1B.frcst_dt,
							S1_T1C.pr(S2_W.cst_frcst_d_no)
						).view(S0_T1)
						.innerJoin(
							subQuery()
							.select(
								S4_T3A.cst_cd,
								S4_T3A.dlv_cd,
								S4_T3A.wrk_no,
								S4_T3A.frcst_dpt_cd,
								S4_T3A.cst_frcst_prnt_dt,
								S4_T3A.rcpt_dt,
								S4_T3B.itm_cd,
								S4_T3B.itm_sub1,
								S4_T3B.itm_sub2,
								S4_T3B.itm_sub3,
								S4_T3B.frcst_period_typ,
								S4_T3B.frcst_dt,
								S4_T3B.base_unit_qty
							)
							.from(
								S4_T3A
								.innerJoin(S4_T3B).on(
									bracket(
										S4_T3A.cst_frcst_no.eq(S4_T3B.cst_frcst_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S4_T3A.can_flg.eq(value(false)))
							).view(S0_T3)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T1A.cst_cd).eq(S0_T3.pr(S4_T3A.cst_cd)))
								.and(
									S0_T1.pr(S1_T1A.dlv_cd).isNull()
									.and(S0_T3.pr(S4_T3A.dlv_cd).isNull())
									.or(S0_T1.pr(S1_T1A.dlv_cd).eq(S0_T3.pr(S4_T3A.dlv_cd)))
								)
								.and(
									S0_T1.pr(S1_T1A.wrk_no).isNull()
									.and(S0_T3.pr(S4_T3A.wrk_no).isNull())
									.or(S0_T1.pr(S1_T1A.wrk_no).eq(S0_T3.pr(S4_T3A.wrk_no)))
								)
								.and(S0_T1.pr(S1_T1A.frcst_dpt_cd).eq(S0_T3.pr(S4_T3A.frcst_dpt_cd)))
								.and(S0_T1.pr(S1_T1B.itm_cd).eq(S0_T3.pr(S4_T3B.itm_cd)))
								.and(S0_T1.pr(S1_T1B.itm_sub1).eq(S0_T3.pr(S4_T3B.itm_sub1)))
								.and(S0_T1.pr(S1_T1B.itm_sub2).eq(S0_T3.pr(S4_T3B.itm_sub2)))
								.and(S0_T1.pr(S1_T1B.itm_sub3).eq(S0_T3.pr(S4_T3B.itm_sub3)))
								.and(S0_T1.pr(S1_T1B.frcst_period_typ).eq(S0_T3.pr(S4_T3B.frcst_period_typ)))
								.and(S0_T1.pr(S1_T1B.frcst_dt).eq(S0_T3.pr(S4_T3B.frcst_dt)))
								.and(S0_T1.pr("rcpt_dt").eq(S0_T3.pr(S4_T3A.rcpt_dt)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_T1.pr(S2_W.cst_frcst_d_no),
						S0_T3.pr(S4_T3A.cst_frcst_prnt_dt),
						S0_T3.pr("rcpt_dt")
					)
			);
	}
	
	/**
	 * -- MSBBL0040_MST_CST_FRCST_H_Query_S01
	 */
	static MCQueryPlan MSBBL0040_MST_CST_FRCST_H_S01() {
		MST_CST_FRCST_H_R S0_T1 = MST_CST_FRCST_H_R.create("T1");
		MST_SLO_RSN_R S0_T2 = MST_SLO_RSN_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAVM_RD_DPT_R S0_M10 = MAVM_RD_DPT_R.create("M10");
		MAM_BP_GRP_R S0_CSTG1 = MAM_BP_GRP_R.create("CSTG1");
		MAM_BP_GRP_R S0_CSTG2 = MAM_BP_GRP_R.create("CSTG2");
		MAM_BP_GRP_R S0_CSTG3 = MAM_BP_GRP_R.create("CSTG3");
		MAM_BP_GRP_R S0_CSTG4 = MAM_BP_GRP_R.create("CSTG4");
		MAM_BP_GRP_R S0_CSTG5 = MAM_BP_GRP_R.create("CSTG5");
		MAM_BP_GRP_R S0_CSTG6 = MAM_BP_GRP_R.create("CSTG6");
		MAM_BP_GRP_R S0_CSTG7 = MAM_BP_GRP_R.create("CSTG7");
		MAM_BP_GRP_R S0_CSTG8 = MAM_BP_GRP_R.create("CSTG8");
		MAM_BP_GRP_R S0_CSTG9 = MAM_BP_GRP_R.create("CSTG9");
		MAM_BP_GRP_R S0_CSTG10 = MAM_BP_GRP_R.create("CSTG10");
		MAM_BP_GRP_R S0_DLVG1 = MAM_BP_GRP_R.create("DLVG1");
		MAM_BP_GRP_R S0_DLVG2 = MAM_BP_GRP_R.create("DLVG2");
		MAM_BP_GRP_R S0_DLVG3 = MAM_BP_GRP_R.create("DLVG3");
		MAM_BP_GRP_R S0_DLVG4 = MAM_BP_GRP_R.create("DLVG4");
		MAM_BP_GRP_R S0_DLVG5 = MAM_BP_GRP_R.create("DLVG5");
		MAM_BP_GRP_R S0_DLVG6 = MAM_BP_GRP_R.create("DLVG6");
		MAM_BP_GRP_R S0_DLVG7 = MAM_BP_GRP_R.create("DLVG7");
		MAM_BP_GRP_R S0_DLVG8 = MAM_BP_GRP_R.create("DLVG8");
		MAM_BP_GRP_R S0_DLVG9 = MAM_BP_GRP_R.create("DLVG9");
		MAM_BP_GRP_R S0_DLVG10 = MAM_BP_GRP_R.create("DLVG10");
		MCTempView S1_T = createTempView("T");
		MST_CST_FRCST_H_R S2_T1 = MST_CST_FRCST_H_R.create("T1");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_CST_FRCST_H_Query_S01")
					.mainQuery()
					.select(
						S0_T1.cst_frcst_no,
						S0_T1.cst_frcst_prnt_dt,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.frcst_dpt_cd,
						S0_M3.dpt_nm.as("frcst_dpt_nm"),
						S0_T1.frcst_usr_cd,
						S0_T1.rcpt_dt,
						S0_T1.cst_frcst_slip_no,
						S0_T1.wrk_no,
						S0_T1.can_rsn_cd,
						S0_T1.can_rmrks,
						S0_T1.can_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.frcst_dpt_cd.eq(S0_M3.dpt_cd)
								.and(S0_T1.rcpt_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.innerJoin(S0_M10).on(
							bracket(
								S0_T1.frcst_dpt_cd.eq(S0_M10.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_prnt_dt.gte(bind("cst_frcst_prnt_dt_fr")))
						.cutoff$and(S0_T1.cst_frcst_prnt_dt.lte(bind("cst_frcst_prnt_dt_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.cst_frcst_slip_no.like(bind("cst_frcst_slip_no")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T1.frcst_usr_cd.like(bind("frcst_usr_cd")))
						.cutoff$and(S0_T1.frcst_dpt_cd.like(bind("frcst_dpt_cd")))
						.cutoff$and(S0_M3.dpt_nm.like(bind("frcst_dpt_nm")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.can_rsn_cd.like(bind("can_rsn_cd")))
						.cutoff$and(S0_T1.can_rmrks.like(bind("can_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(
							bracket(
								bind("inc_can_flg").eq(value(false))
								.and(S0_T1.can_flg.eq(value(false)))
							)
							.or(
								bind("inc_can_flg").eq(value(true))
								.and(
									S0_T1.can_flg.in(
										value(false),
										value(true)
									)
								)
							)
						)
						.and(
							bind("latest_flg").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										subQuery()
										.select(
											S2_T1.cst_cd,
											S2_T1.dlv_cd,
											S2_T1.frcst_dpt_cd,
											S2_T1.wrk_no,
											max(S2_T1.rcpt_dt).as("max_rcpt_dt")
										)
										.from(S2_T1)
										.where(
											value(0).eq(value(0))
											.and(
												bracket(
													bind("inc_can_flg").eq(value(false))
													.and(S2_T1.can_flg.eq(value(false)))
												)
												.or(
													bind("inc_can_flg").eq(value(true))
													.and(
														S2_T1.can_flg.in(
															value(false),
															value(true)
														)
													)
												)
											)
											.cutoff$and(S2_T1.cst_cd.like(bind("cst_cd")))
											.cutoff$and(S2_T1.dlv_cd.like(bind("dlv_cd")))
											.cutoff$and(S2_T1.frcst_dpt_cd.like(bind("frcst_dpt_cd")))
											.cutoff$and(S2_T1.wrk_no.like(bind("wrk_no")))
											.cutoff$and(S2_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
											.cutoff$and(S2_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
											.cutoff$and(S2_T1.cst_frcst_no.like(bind("cst_frcst_no")))
											.cutoff$and(S2_T1.cst_frcst_prnt_dt.gte(bind("cst_frcst_prnt_dt_fr")))
											.cutoff$and(S2_T1.cst_frcst_prnt_dt.lte(bind("cst_frcst_prnt_dt_to")))
											.cutoff$and(S2_T1.cst_frcst_slip_no.like(bind("cst_frcst_slip_no")))
											.cutoff$and(S2_T1.frcst_usr_cd.like(bind("frcst_usr_cd")))
											.cutoff$and(S2_T1.can_rsn_cd.like(bind("can_rsn_cd")))
											.cutoff$and(S2_T1.can_rmrks.like(bind("can_rmrks")))
											.cutoff$and(S2_T1.intr_rmrks.like(bind("intr_rmrks")))
											.cutoff$and(S2_T1.sub_char1.like(bind("sub_char1")))
											.cutoff$and(S2_T1.sub_char2.like(bind("sub_char2")))
											.cutoff$and(S2_T1.sub_char3.like(bind("sub_char3")))
										)
										.groupBy(
											S2_T1.cst_cd,
											S2_T1.dlv_cd,
											S2_T1.frcst_dpt_cd,
											S2_T1.wrk_no
										).view(S1_T)
									)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.cst_cd.eq(S1_T.pr(S2_T1.cst_cd)))
										.and(
											S0_T1.dlv_cd.isNull()
											.and(S1_T.pr(S2_T1.dlv_cd).isNull())
											.or(S0_T1.dlv_cd.eq(S1_T.pr(S2_T1.dlv_cd)))
										)
										.and(S0_T1.frcst_dpt_cd.eq(S1_T.pr(S2_T1.frcst_dpt_cd)))
										.and(
											S0_T1.wrk_no.isNull()
											.and(S1_T.pr(S2_T1.wrk_no).isNull())
											.or(S0_T1.wrk_no.eq(S1_T.pr(S2_T1.wrk_no)))
										)
										.and(S0_T1.rcpt_dt.eq(S1_T.pr("max_rcpt_dt")))
									)
								)
							)
							.or(bind("latest_flg").eq(value(false)))
						)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
					)
					.orderBy(S0_T1.cst_frcst_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("can_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.can_rsn_cd.eq(S0_T2.slo_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.slo_rsn_nm.like(bind("can_rsn_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.cst_cd.eq(S0_M1.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.bp_nm.like(bind("cst_nm")))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.dlv_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("frcst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.frcst_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("frcst_usr_nm")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.wrk_no.eq(S0_T3.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd1.as("cst_grp_cd1"), S0_CSTG1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG1).on(S0_M1.bp_grp_cd1.eq(S0_CSTG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CSTG1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CSTG1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd2.as("cst_grp_cd2"), S0_CSTG2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG2).on(S0_M1.bp_grp_cd2.eq(S0_CSTG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CSTG2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CSTG2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd3.as("cst_grp_cd3"), S0_CSTG3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG3).on(S0_M1.bp_grp_cd3.eq(S0_CSTG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CSTG3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CSTG3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd4.as("cst_grp_cd4"), S0_CSTG4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG4).on(S0_M1.bp_grp_cd4.eq(S0_CSTG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CSTG4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CSTG4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd5.as("cst_grp_cd5"), S0_CSTG5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG5).on(S0_M1.bp_grp_cd5.eq(S0_CSTG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CSTG5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CSTG5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd6.as("cst_grp_cd6"), S0_CSTG6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG6).on(S0_M1.bp_grp_cd6.eq(S0_CSTG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CSTG6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CSTG6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd7.as("cst_grp_cd7"), S0_CSTG7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG7).on(S0_M1.bp_grp_cd7.eq(S0_CSTG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CSTG7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CSTG7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd8.as("cst_grp_cd8"), S0_CSTG8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG8).on(S0_M1.bp_grp_cd8.eq(S0_CSTG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CSTG8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CSTG8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd9.as("cst_grp_cd9"), S0_CSTG9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG9).on(S0_M1.bp_grp_cd9.eq(S0_CSTG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CSTG9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CSTG9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M1.bp_grp_cd10.as("cst_grp_cd10"), S0_CSTG10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_CSTG10).on(S0_M1.bp_grp_cd10.eq(S0_CSTG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CSTG10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_CSTG10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd1.as("dlv_grp_cd1"), S0_DLVG1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG1).on(S0_M2.bp_grp_cd1.eq(S0_DLVG1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLVG1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLVG1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd2.as("dlv_grp_cd2"), S0_DLVG2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG2).on(S0_M2.bp_grp_cd2.eq(S0_DLVG2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLVG2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLVG2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd3.as("dlv_grp_cd3"), S0_DLVG3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG3).on(S0_M2.bp_grp_cd3.eq(S0_DLVG3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLVG3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLVG3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd4.as("dlv_grp_cd4"), S0_DLVG4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG4).on(S0_M2.bp_grp_cd4.eq(S0_DLVG4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLVG4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLVG4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd5.as("dlv_grp_cd5"), S0_DLVG5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG5).on(S0_M2.bp_grp_cd5.eq(S0_DLVG5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLVG5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLVG5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd6.as("dlv_grp_cd6"), S0_DLVG6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG6).on(S0_M2.bp_grp_cd6.eq(S0_DLVG6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLVG6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLVG6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd7.as("dlv_grp_cd7"), S0_DLVG7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG7).on(S0_M2.bp_grp_cd7.eq(S0_DLVG7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLVG7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLVG7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd8.as("dlv_grp_cd8"), S0_DLVG8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG8).on(S0_M2.bp_grp_cd8.eq(S0_DLVG8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLVG8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLVG8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd9.as("dlv_grp_cd9"), S0_DLVG9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG9).on(S0_M2.bp_grp_cd9.eq(S0_DLVG9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLVG9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLVG9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M2.bp_grp_cd10.as("dlv_grp_cd10"), S0_DLVG10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_DLVG10).on(S0_M2.bp_grp_cd10.eq(S0_DLVG10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLVG10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_DLVG10.bp_grp_nm.like(bind("dlv_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("frcst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("frcst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL0040_MST_FRCST_SUM_Query_S01
	 */
	static MCQueryPlan MSBBL0040_MST_FRCST_SUM_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MST_FRCST_SUM_R S0_T2 = MST_FRCST_SUM_R.create("T2");
		MST_CST_FRCST_D_R S1_T1 = MST_CST_FRCST_D_R.create("T1");
		MST_CST_FRCST_H_R S1_T2 = MST_CST_FRCST_H_R.create("T2");
		MSW_CST_FRCST_D_KEY_R S2_T1A = MSW_CST_FRCST_D_KEY_R.create("T1A");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_FRCST_SUM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T1.cst_frcst_d_no),
						S0_T2.cst_frcst_qty.as("mly_net_frcst_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.cst_frcst_d_no,
							S1_T2.wrk_no,
							S1_T2.cst_cd,
							S1_T2.frcst_dpt_cd,
							S1_T2.frcst_usr_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							MAPA_DT$F_GET_AC_YM1(S1_T1.frcst_dt).as("ym")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.cst_frcst_no.eq(S1_T2.cst_frcst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T1A)
									.where(
										value(0).eq(value(0))
										.and(S1_T1.cst_frcst_d_no.eq(S2_T1A.cst_frcst_d_no))
									)
								)
							)
						).view(S0_T1)
						.leftOuterJoin(S0_T2).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T2.cst_cd).eq(S0_T2.cst_cd))
								.and(S0_T1.pr(S1_T2.frcst_dpt_cd).eq(S0_T2.sls_dpt_cd))
								.and(
									S0_T1.pr(S1_T2.frcst_usr_cd).isNull()
									.and(S0_T2.sls_usr_cd.isNull())
									.or(S0_T1.pr(S1_T2.frcst_usr_cd).eq(S0_T2.sls_usr_cd))
								)
								.and(
									S0_T1.pr(S1_T2.wrk_no).isNull()
									.and(MAC_STR$IS_NULL_VAL(S0_T2.wrk_no).eq(value(true)))
									.or(S0_T1.pr(S1_T2.wrk_no).eq(S0_T2.wrk_no))
								)
								.and(S0_T1.pr(S1_T1.itm_cd).eq(S0_T2.itm_cd))
								.and(S0_T1.pr(S1_T1.itm_sub1).eq(S0_T2.itm_sub1))
								.and(S0_T1.pr(S1_T1.itm_sub2).eq(S0_T2.itm_sub2))
								.and(S0_T1.pr(S1_T1.itm_sub3).eq(S0_T2.itm_sub3))
								.and(S0_T1.pr("ym").eq(S0_T2.ym))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBBL0040_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL0040_MST_SLO_D_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MCTempView S0_T2 = createTempView("T2");
		MST_CST_FRCST_D_R S1_T1 = MST_CST_FRCST_D_R.create("T1");
		MST_CST_FRCST_H_R S1_T2 = MST_CST_FRCST_H_R.create("T2");
		MSW_CST_FRCST_D_KEY_R S2_T1A = MSW_CST_FRCST_D_KEY_R.create("T1A");
		MST_SLO_R S3_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S3_T2 = MST_SLO_D_R.create("T2");
		MST_SHIP_PR_R S3_T3 = MST_SHIP_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T1.cst_frcst_d_no),
						sum(S0_T2.pr("base_unit_qty")).as("slo_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.cst_frcst_d_no,
							S1_T2.wrk_no,
							S1_T2.cst_cd,
							S1_T2.frcst_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.frcst_st_dt,
							S1_T1.frcst_end_dt
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.cst_frcst_no.eq(S1_T2.cst_frcst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T1A)
									.where(
										value(0).eq(value(0))
										.and(S1_T1.cst_frcst_d_no.eq(S2_T1A.cst_frcst_d_no))
									)
								)
							)
						).view(S0_T1)
						.leftOuterJoin(
							subQuery()
							.select(
								trunc(
									S3_T2.dlv_rqst_tm,
									MCDateFmt.DD
								).as("dlv_dt"),
								S3_T1.slo_dt,
								S3_T1.sls_dpt_cd,
								S3_T1.cst_cd,
								S3_T1.wrk_no,
								S3_T2.itm_cd,
								S3_T2.itm_sub1,
								S3_T2.itm_sub2,
								S3_T2.itm_sub3,
								S3_T2.base_unit_qty
							)
							.from(
								S3_T1
								.innerJoin(S3_T2).on(
									bracket(
										S3_T1.slo_no.eq(S3_T2.slo_no)
									)
								)
								.innerJoin(S3_T3).on(
									bracket(
										S3_T2.slo_d_no.eq(S3_T3.slo_d_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_T1.can_flg.eq(value(false)))
								.and(S3_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.and(S3_T2.can_flg.eq(value(false)))
								.and(S3_T2.abort_flg.eq(value(false))
								.or(bracket(S3_T2.abort_flg.eq(value(true)).and(S3_T3.ship_schd_abort_qty.lt(S3_T3.base_unit_qty)))))
								.and(S3_T2.bd_dpt_cd.isNull())
							).view(S0_T2)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T2.cst_cd).eq(S0_T2.pr(S3_T1.cst_cd)))
								.and(S0_T1.pr(S1_T2.frcst_dpt_cd).eq(S0_T2.pr(S3_T1.sls_dpt_cd)))
								.and(
									S0_T1.pr(S1_T2.wrk_no).isNull()
									.and(S0_T2.pr(S3_T1.wrk_no).isNull())
									.or(S0_T1.pr(S1_T2.wrk_no).eq(S0_T2.pr(S3_T1.wrk_no)))
								)
								.and(S0_T1.pr(S1_T1.itm_cd).eq(S0_T2.pr(S3_T2.itm_cd)))
								.and(S0_T1.pr(S1_T1.itm_sub1).eq(S0_T2.pr(S3_T2.itm_sub1)))
								.and(S0_T1.pr(S1_T1.itm_sub2).eq(S0_T2.pr(S3_T2.itm_sub2)))
								.and(S0_T1.pr(S1_T1.itm_sub3).eq(S0_T2.pr(S3_T2.itm_sub3)))
								.and(S0_T2.pr("dlv_dt").gte(S0_T1.pr(S1_T1.frcst_st_dt)))
								.and(S0_T2.pr("dlv_dt").lte(S0_T1.pr(S1_T1.frcst_end_dt)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(S0_T1.pr(S1_T1.cst_frcst_d_no))
			);
	}
	
	/**
	 * -- MSBBL0040_MST_SPLN_SUM_ITM_NEW_Query_S01
	 */
	static MCQueryPlan MSBBL0040_MST_SPLN_SUM_ITM_NEW_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MCTempView S0_T2 = createTempView("T2");
		MST_CST_FRCST_D_R S1_T1 = MST_CST_FRCST_D_R.create("T1");
		MST_CST_FRCST_H_R S1_T2 = MST_CST_FRCST_H_R.create("T2");
		MSW_CST_FRCST_D_KEY_R S2_T1A = MSW_CST_FRCST_D_KEY_R.create("T1A");
		MST_SPLN_SUM_ITM_NEW_R S3_T = MST_SPLN_SUM_ITM_NEW_R.create("T");
		MST_SPLN_SUM_ITM_NEW_R S4_TMP = MST_SPLN_SUM_ITM_NEW_R.create("TMP");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0040_MST_SPLN_SUM_ITM_NEW_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T1.cst_frcst_d_no),
						S0_T2.pr("spln_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.cst_frcst_d_no,
							S1_T2.wrk_no,
							S1_T2.cst_cd,
							S1_T2.frcst_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.frcst_dt
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.cst_frcst_no.eq(S1_T2.cst_frcst_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(MAC_PERIOD_TYP$IS_MONTHLY(S1_T1.frcst_period_typ).eq(value(true)))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T1A)
									.where(
										value(0).eq(value(0))
										.and(S1_T1.cst_frcst_d_no.eq(S2_T1A.cst_frcst_d_no))
									)
								)
							)
						).view(S0_T1)
						.leftOuterJoin(
							subQuery()
							.select(
								S3_T.dpt_cd,
								S3_T.cst_cd,
								S3_T.wrk_no,
								S3_T.itm_cd,
								S3_T.itm_sub1,
								S3_T.itm_sub2,
								S3_T.itm_sub3,
								S3_T.spln_ym,
								sum(S3_T.spln_qty).as("spln_qty")
							)
							.from(S3_T)
							.where(
								value(0).eq(value(0))
								.and(
									S3_T.ym.in(
										subQuery()
										.select(max(S4_TMP.ym))
										.from(S4_TMP)
										.where(
											value(0).eq(value(0))
											.and(S4_TMP.dpt_cd.eq(S3_T.dpt_cd))
											.and(S4_TMP.cst_cd.eq(S3_T.cst_cd))
											.and(S4_TMP.wrk_no.eq(S3_T.wrk_no))
											.and(S4_TMP.itm_cd.eq(S3_T.itm_cd))
											.and(S4_TMP.itm_sub1.eq(S3_T.itm_sub1))
											.and(S4_TMP.itm_sub2.eq(S3_T.itm_sub2))
											.and(S4_TMP.itm_sub3.eq(S3_T.itm_sub3))
											.and(S4_TMP.spln_ym.eq(S3_T.spln_ym))
										)
									)
								)
							)
							.groupBy(
								S3_T.dpt_cd,
								S3_T.cst_cd,
								S3_T.wrk_no,
								S3_T.itm_cd,
								S3_T.itm_sub1,
								S3_T.itm_sub2,
								S3_T.itm_sub3,
								S3_T.spln_ym
							).view(S0_T2)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T2.frcst_dpt_cd).eq(S0_T2.pr(S3_T.dpt_cd)))
								.and(S0_T1.pr(S1_T2.cst_cd).eq(S0_T2.pr(S3_T.cst_cd)))
								.and(
									S0_T1.pr(S1_T2.wrk_no).isNull()
									.and(S0_T2.pr(S3_T.wrk_no).eq(value(MAC_STR.NULL_VAL.value())))
									.or(S0_T1.pr(S1_T2.wrk_no).eq(S0_T2.pr(S3_T.wrk_no)))
								)
								.and(S0_T1.pr(S1_T1.itm_cd).eq(S0_T2.pr(S3_T.itm_cd)))
								.and(S0_T1.pr(S1_T1.itm_sub1).eq(S0_T2.pr(S3_T.itm_sub1)))
								.and(S0_T1.pr(S1_T1.itm_sub2).eq(S0_T2.pr(S3_T.itm_sub2)))
								.and(S0_T1.pr(S1_T1.itm_sub3).eq(S0_T2.pr(S3_T.itm_sub3)))
								.and(S0_T2.pr(S3_T.spln_ym).eq(S0_T1.pr(S1_T1.frcst_dt)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
}