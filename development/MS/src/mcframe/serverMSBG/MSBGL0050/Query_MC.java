package mcframe.serverMSBG.MSBGL0050;

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
	 * -- MSBGL0050_MST_BILL_ACST_Query_S01
	 */
	static MCQueryPlan MSBGL0050_MST_BILL_ACST_S01() {
		MST_BILL_ACST_R S0_T1 = MST_BILL_ACST_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_WG_R S0_M1 = MAM_WG_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAVM_RD_DPT_R S0_M7 = MAVM_RD_DPT_R.create("M7");
		MAM_BP_GRP_R S0_ACST_GRP1 = MAM_BP_GRP_R.create("ACST_GRP1");
		MAM_BP_GRP_R S0_ACST_GRP2 = MAM_BP_GRP_R.create("ACST_GRP2");
		MAM_BP_GRP_R S0_ACST_GRP3 = MAM_BP_GRP_R.create("ACST_GRP3");
		MAM_BP_GRP_R S0_ACST_GRP4 = MAM_BP_GRP_R.create("ACST_GRP4");
		MAM_BP_GRP_R S0_ACST_GRP5 = MAM_BP_GRP_R.create("ACST_GRP5");
		MAM_BP_GRP_R S0_ACST_GRP6 = MAM_BP_GRP_R.create("ACST_GRP6");
		MAM_BP_GRP_R S0_ACST_GRP7 = MAM_BP_GRP_R.create("ACST_GRP7");
		MAM_BP_GRP_R S0_ACST_GRP8 = MAM_BP_GRP_R.create("ACST_GRP8");
		MAM_BP_GRP_R S0_ACST_GRP9 = MAM_BP_GRP_R.create("ACST_GRP9");
		MAM_BP_GRP_R S0_ACST_GRP10 = MAM_BP_GRP_R.create("ACST_GRP10");
		MAM_BP_GRP_R S0_BCST_GRP1 = MAM_BP_GRP_R.create("BCST_GRP1");
		MAM_BP_GRP_R S0_BCST_GRP2 = MAM_BP_GRP_R.create("BCST_GRP2");
		MAM_BP_GRP_R S0_BCST_GRP3 = MAM_BP_GRP_R.create("BCST_GRP3");
		MAM_BP_GRP_R S0_BCST_GRP4 = MAM_BP_GRP_R.create("BCST_GRP4");
		MAM_BP_GRP_R S0_BCST_GRP5 = MAM_BP_GRP_R.create("BCST_GRP5");
		MAM_BP_GRP_R S0_BCST_GRP6 = MAM_BP_GRP_R.create("BCST_GRP6");
		MAM_BP_GRP_R S0_BCST_GRP7 = MAM_BP_GRP_R.create("BCST_GRP7");
		MAM_BP_GRP_R S0_BCST_GRP8 = MAM_BP_GRP_R.create("BCST_GRP8");
		MAM_BP_GRP_R S0_BCST_GRP9 = MAM_BP_GRP_R.create("BCST_GRP9");
		MAM_BP_GRP_R S0_BCST_GRP10 = MAM_BP_GRP_R.create("BCST_GRP10");
		MST_RCV_SCHD_R S1_T5 = MST_RCV_SCHD_R.create("T5");
		MST_BILL_D_R S2_T6 = MST_BILL_D_R.create("T6");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0050_MST_BILL_ACST_Query_S01")
					.mainQuery()
					.select(
						S0_T2.base_dt.as("bill_cl_ym"),
						S0_T1.ar_dpt_cd,
						S0_M5.dpt_nm.as("ar_dpt_nm"),
						S0_T1.wg_cd,
						S0_M1.wg_nm,
						S0_T1.acst_cd,
						S0_M2.bp_nm.as("acst_nm"),
						S0_T2.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T2.bcst_cd,
						S0_M3.bp_nm.as("bcst_nm"),
						S0_T2.bill_no,
						S0_T2.iv_no,
						S0_T2.wrk_no,
						S0_T3.wrk_nm,
						MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T1.bill_mng_no).as("rcv_schd_dt"),
						cases()
							.when(
								bracket(
									subQuery()
									.select(count(S1_T5.rcv_schd_no))
									.from(S1_T5)
									.where(
										S0_T1.bill_mng_no.eq(S1_T5.bill_mng_no)
									)
								).gt(value(1))
							)
								.then(value(true))
							.otherwise(value(false)).as("multi_flg"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T2.bill_cl_dt,
							nvl(
								S0_T2.bill_cl_typ,
								S0_M3.bill_cl_typ
							),
							S0_T2.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T2.bill_dt,
						S0_T2.trd_cur_cd,
						S0_M4.cur_nm.as("trd_cur_nm"),
						S0_M4.amt_dec_place,
						S0_T1.ar_typ,
						S0_T1.last_bill_amt,
						bracket(
							S0_T1.xfr_amt.add(S0_T1.note_amt).add(S0_T1.cash_amt).add(S0_T1.sw_amt)
						).as("rcv_amt"),
						S0_T1.setoff_amt,
						S0_T1.bfw_amt,
						S0_T1.sls_amt,
						S0_T1.ret_amt,
						S0_T1.dscnt_amt,
						bracket(
							S0_T1.tax_amt.subtract(S0_T1.setoff_tax_amt)
						).as("tax_amt"),
						S0_T1.sw_to_amt,
						S0_T1.bill_amt,
						decode(
							MSC_BILL_CL_STS_TYP$IS_NOT_BILL(S0_T2.bill_cl_sts_typ),
							value(false),
							value(true),
							value(true),
							value(false)
						).as("sort_ord_flg"),
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
						addDynamicSelect(DS0C_ACST_GRP),
						addDynamicSelect(DS0C_BCST_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.wrk_no.eq(S0_T3.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.wg_cd.eq(S0_M1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.acst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.bcst_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.trd_cur_cd.eq(S0_M4.cur_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T2.base_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.bill_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T2.base_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.innerJoin(S0_M7).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M7.dpt_cd)
							)
						)
						.addDynamicView(DS0C_ACST_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(0).eq(value(1))
							.or(S0_T1.last_bill_amt.neq(value(0)))
							.or(S0_T1.xfr_amt.neq(value(0)))
							.or(S0_T1.note_amt.neq(value(0)))
							.or(S0_T1.cash_amt.neq(value(0)))
							.or(S0_T1.setoff_amt.neq(value(0)))
							.or(S0_T1.sw_amt.neq(value(0)))
							.or(S0_T1.sls_amt.neq(value(0)))
							.or(S0_T1.ret_amt.neq(value(0)))
							.or(S0_T1.dscnt_amt.neq(value(0)))
							.or(S0_T1.tax_amt.neq(value(0)))
							.or(S0_T1.sw_to_amt.neq(value(0)))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_T6)
									.where(
										S2_T6.bill_acst_no.eq(S0_T1.bill_acst_no)
									)
								)
							)
						)
						.cutoff$and(bind("bill_cl_ym_fr").lte(S0_T2.bill_cl_dt))
						.cutoff$and(S0_T2.bill_cl_dt.lte(lastDay(bind("bill_cl_ym_to"))))
						.cutoff$and(
							S0_T2.bill_cl_dt.eq(lastDay(S0_T2.bill_cl_dt))
							.and(
								nvl(
									S0_T2.bill_cl_typ,
									S0_M3.bill_cl_typ
								).in(
									value(MAC_BILL_CL_TYP.BATCH.value()),
									value(MAC_BILL_CL_TYP.MANUAL.value())
								)
							)
							.and(bind("bill_cl_day99_flg_str").eq(value(true)))
						)
						.cutoff$and(
							MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
								S0_T2.bill_cl_dt,
								nvl(
									S0_T2.bill_cl_typ,
									S0_M3.bill_cl_typ
								),
								S0_T2.bill_each_sls_flg
							).eq(bind("bill_cl_day"))
						)
						.cutoff$and(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T1.bill_mng_no).lte(bind("rcv_schd_dt_to")))
						.cutoff$and(bind("rcv_schd_dt_fr").lte(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T1.bill_mng_no)))
						.cutoff$and(S0_T2.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T2.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_M3.bp_nm.like(bind("bcst_nm")))
						.cutoff$and(S0_T1.ar_dpt_cd.like(bind("ar_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M1.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T1.acst_cd.like(bind("acst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("acst_nm")))
						.cutoff$and(S0_T2.bill_no.like(bind("bill_no")))
						.cutoff$and(S0_T2.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.ar_typ.like(bind("ar_typ")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_M4.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))
						.addDynamicPredicate(DS0C_ACST_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						pr("ar_dpt_cd").asc(),
						pr("acst_cd").asc(),
						pr("trd_cur_cd").asc(),
						pr("wrk_no").asc(),
						pr("sort_ord_flg").desc(),
						MAC_STR$IS_NULL_VAL(S0_T2.iv_no).asc(),
						pr("bill_no").asc(),
						MAC_Y4M$IS_NULL_VAL(S0_T2.bill_cl_dt).asc(),
						pr("bill_cl_ym").asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd1.as("acst_grp_cd1"), S0_ACST_GRP1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP1).on(S0_M2.bp_grp_cd1.eq(S0_ACST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ACST_GRP1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_ACST_GRP1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd2.as("acst_grp_cd2"), S0_ACST_GRP2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP2).on(S0_M2.bp_grp_cd2.eq(S0_ACST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ACST_GRP2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_ACST_GRP2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd3.as("acst_grp_cd3"), S0_ACST_GRP3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP3).on(S0_M2.bp_grp_cd3.eq(S0_ACST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ACST_GRP3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_ACST_GRP3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd4.as("acst_grp_cd4"), S0_ACST_GRP4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP4).on(S0_M2.bp_grp_cd4.eq(S0_ACST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ACST_GRP4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_ACST_GRP4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd5.as("acst_grp_cd5"), S0_ACST_GRP5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP5).on(S0_M2.bp_grp_cd5.eq(S0_ACST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ACST_GRP5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_ACST_GRP5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd6.as("acst_grp_cd6"), S0_ACST_GRP6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP6).on(S0_M2.bp_grp_cd6.eq(S0_ACST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ACST_GRP6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_ACST_GRP6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd7.as("acst_grp_cd7"), S0_ACST_GRP7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP7).on(S0_M2.bp_grp_cd7.eq(S0_ACST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ACST_GRP7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_ACST_GRP7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd8.as("acst_grp_cd8"), S0_ACST_GRP8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP8).on(S0_M2.bp_grp_cd8.eq(S0_ACST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ACST_GRP8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_ACST_GRP8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd9.as("acst_grp_cd9"), S0_ACST_GRP9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP9).on(S0_M2.bp_grp_cd9.eq(S0_ACST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ACST_GRP9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_ACST_GRP9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_M2.bp_grp_cd10.as("acst_grp_cd10"), S0_ACST_GRP10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_ACST_GRP10).on(S0_M2.bp_grp_cd10.eq(S0_ACST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ACST_GRP10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_ACST_GRP10.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd1.as("bcst_grp_cd1"), S0_BCST_GRP1.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP1).on(S0_M3.bp_grp_cd1.eq(S0_BCST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BCST_GRP1.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_BCST_GRP1.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd2.as("bcst_grp_cd2"), S0_BCST_GRP2.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP2).on(S0_M3.bp_grp_cd2.eq(S0_BCST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BCST_GRP2.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_BCST_GRP2.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd3.as("bcst_grp_cd3"), S0_BCST_GRP3.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP3).on(S0_M3.bp_grp_cd3.eq(S0_BCST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BCST_GRP3.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_BCST_GRP3.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd4.as("bcst_grp_cd4"), S0_BCST_GRP4.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP4).on(S0_M3.bp_grp_cd4.eq(S0_BCST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BCST_GRP4.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_BCST_GRP4.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd5.as("bcst_grp_cd5"), S0_BCST_GRP5.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP5).on(S0_M3.bp_grp_cd5.eq(S0_BCST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BCST_GRP5.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_BCST_GRP5.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd6.as("bcst_grp_cd6"), S0_BCST_GRP6.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP6).on(S0_M3.bp_grp_cd6.eq(S0_BCST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BCST_GRP6.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_BCST_GRP6.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd7.as("bcst_grp_cd7"), S0_BCST_GRP7.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP7).on(S0_M3.bp_grp_cd7.eq(S0_BCST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BCST_GRP7.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_BCST_GRP7.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd8.as("bcst_grp_cd8"), S0_BCST_GRP8.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP8).on(S0_M3.bp_grp_cd8.eq(S0_BCST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BCST_GRP8.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_BCST_GRP8.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd9.as("bcst_grp_cd9"), S0_BCST_GRP9.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP9).on(S0_M3.bp_grp_cd9.eq(S0_BCST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BCST_GRP9.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_BCST_GRP9.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd10.as("bcst_grp_cd10"), S0_BCST_GRP10.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_BCST_GRP10).on(S0_M3.bp_grp_cd10.eq(S0_BCST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BCST_GRP10.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_BCST_GRP10.bp_grp_nm.like(bind("bcst_grp_nm10"))))
			);
	}
}