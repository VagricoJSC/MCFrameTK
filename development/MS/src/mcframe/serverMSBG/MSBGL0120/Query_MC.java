package mcframe.serverMSBG.MSBGL0120;

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
	 * -- MABGL0120_MST_BILL_D_APPL_BAL_Query_S01
	 */
	static MCQueryPlan MABGL0120_MST_BILL_D_APPL_BAL_S01() {
		MST_BILL_D_APPL_BAL_R S0_T1 = MST_BILL_D_APPL_BAL_R.create("T1");
		MST_BILL_D_R S0_T2 = MST_BILL_D_R.create("T2");
		MST_BILL_R S0_T3 = MST_BILL_R.create("T3");
		MST_BILL_D_R S0_T4 = MST_BILL_D_R.create("T4");
		MST_BILL_ACST_R S0_T5 = MST_BILL_ACST_R.create("T5");
		MST_WRK_R S0_T7 = MST_WRK_R.create("T7");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_DPT_R S0_M13 = MAM_DPT_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAVM_RD_DPT_R S0_M16 = MAVM_RD_DPT_R.create("M16");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		MST_RCV_SCHD_R S1_T6 = MST_RCV_SCHD_R.create("T6");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MABGL0120_MST_BILL_D_APPL_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_T5.ar_dpt_cd,
						S0_M1.dpt_nm.as("ar_dpt_nm"),
						S0_T5.wg_cd,
						S0_T5.acst_cd,
						S0_T5.ar_typ,
						MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T3.bill_mng_no).as("rcv_schd_dt"),
						cases()
							.when(
								bracket(
									subQuery()
									.select(count(S1_T6.rcv_schd_no))
									.from(S1_T6)
									.where(
										S0_T3.bill_mng_no.eq(S1_T6.bill_mng_no)
									)
								).gt(value(1))
							)
								.then(value(true))
							.otherwise(value(false)).as("multi_flg"),
						S0_T4.slip_sts_typ,
						S0_T4.trd_cd,
						S0_T3.trd_cur_cd,
						S0_T1.appl_tgt_amt,
						S0_T1.not_appl_bal,
						S0_T4.ac_ym,
						S0_T4.ac_dt,
						S0_T4.dlv_dt,
						S0_T3.bill_dt,
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T3.bill_cl_dt,
							nvl(
								S0_T3.bill_cl_typ,
								S0_M6.bill_cl_typ
							),
							S0_T3.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T3.bill_cl_dt.as("bill_ym"),
						S0_T3.bill_no,
						S0_T4.act_no,
						S0_T4.act_d_no,
						S0_T3.iv_no,
						S0_T4.itm_cd,
						S0_T4.itm_sub1,
						S0_T4.itm_sub2,
						S0_T4.itm_sub3,
						nvl(
							S0_T4.itm_nm,
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_T4.sno1,
						S0_T4.sno2,
						S0_T4.sno3,
						S0_T4.sno4,
						S0_T4.cst_cd,
						S0_T4.dlv_cd,
						nvl(
							S0_T4.dlv_nm,
							S0_M9.bp_nm
						).as("dlv_nm"),
						S0_T4.dest_cd1,
						S0_T4.dest_cd2,
						S0_T4.dest_cd3,
						S0_T4.sls_dpt_cd,
						S0_M13.dpt_nm.as("sls_dpt_nm"),
						S0_T4.sls_usr_cd,
						S0_T4.slo_no,
						S0_T4.slo_d_no,
						S0_T4.cst_po_no,
						S0_T4.cst_po_d_no,
						S0_T4.dlv_slip_no,
						S0_T4.dlv_slip_d_no,
						S0_T4.ship_dlv_slip_no,
						S0_T4.ship_dlv_slip_d_no,
						S0_T4.ship_dlv_slip_multi_flg,
						S0_T3.wrk_no,
						S0_T4.wrk_no.as("old_wrk_no"),
						S0_T2.ac_ym.as("arsw_ac_ym"),
						S0_T2.ac_dt.as("arsw_ac_dt"),
						S0_T2.trd_cd.as("arsw_trd_cd"),
						S0_T2.act_no.as("arsw_act_no"),
						S0_T2.act_d_no.as("arsw_act_d_no"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ACST_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.bill_d_no.eq(S0_T2.bill_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.bill_mng_no.eq(S0_T3.bill_mng_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T1.parent_bill_d_no.eq(S0_T4.bill_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T2.bill_acst_no.eq(S0_T5.bill_acst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T5.ar_dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T2.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T3.bcst_cd.eq(S0_M6.bp_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M7.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T4.dlv_cd.eq(S0_M9.bp_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T4.sls_dpt_cd.eq(S0_M13.dpt_cd)
								.and(S0_T4.ac_dt.between(S0_M13.st_dt, S0_M13.end_dt))
							)
						)
						.innerJoin(S0_M16).on(
							bracket(
								S0_T5.ar_dpt_cd.eq(S0_M16.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ACST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(bind("rcv_schd_dt_fr").lte(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T3.bill_mng_no)))
						.cutoff$and(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T3.bill_mng_no).lte(bind("rcv_schd_dt_to")))
						.cutoff$and(S0_T4.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T4.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T5.acst_cd.like(bind("acst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T5.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T5.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T4.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T4.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M13.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T3.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T3.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T3.bill_no.like(bind("bill_no")))
						.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T5.ar_typ.like(bind("ar_typ")))
						.and(
							S0_T4.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value()),
								value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())
							)
						)
						.and(
							bind("incl_not_bill_flg").eq(value(true))
							.or(
								bind("incl_not_bill_flg").eq(value(false))
								.and(S0_T3.bill_cl_sts_typ.neq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())))
							)
						)
						.and(
							bind("incl_can_flg").eq(value(true))
							.or(
								bind("incl_can_flg").eq(value(false))
								.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.and(
							bind("incl_appl_flg").eq(value(true))
							.and(
									not(
											S0_T4.trd_ptn_typ.in(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()))
											.and(S0_T1.appl_tgt_amt.eq(value(0)))
									)
							)
							.or(
								bind("incl_appl_flg").eq(value(false))
								.and(S0_T1.not_appl_bal.neq(value(0)))
							)
						)
						.addDynamicPredicate(DS0C_ACST_GRP)
					)
					.orderBy(
						S0_T5.ar_dpt_cd.asc(),
						S0_T5.acst_cd.asc(),
						S0_T4.ac_dt.asc(),
						S0_T4.act_no.asc(),
						S0_T4.act_seq.asc(),
						S0_T4.act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T3.wrk_no.eq(S0_T7.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T7.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T5.wg_cd.eq(S0_M2.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T5.acst_cd.eq(S0_M3.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.bp_nm.like(bind("acst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T3.trd_cur_cd.eq(S0_M5.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T4.sls_usr_cd.eq(S0_M14.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd1.as("acst_grp_cd1"), S0_MM1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M3.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd2.as("acst_grp_cd2"), S0_MM2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M3.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd3.as("acst_grp_cd3"), S0_MM3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M3.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd4.as("acst_grp_cd4"), S0_MM4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M3.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd5.as("acst_grp_cd5"), S0_MM5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M3.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd6.as("acst_grp_cd6"), S0_MM6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M3.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd7.as("acst_grp_cd7"), S0_MM7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M3.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd8.as("acst_grp_cd8"), S0_MM8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M3.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd9.as("acst_grp_cd9"), S0_MM9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M3.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_M3.bp_grp_cd10.as("acst_grp_cd10"), S0_MM10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M3.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("acst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("old_wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("old_wrk_nm", m.wrk_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
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
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("arsw_trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("arsw_trd_nm", m.trd_nm());
					})
				)
			);
	}
}