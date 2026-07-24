package mcframe.serverMGBF.MGBFL0110;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/*
	 * MGBFL0110_MGT_STD_TOP_S01
	 */
	static MCQueryPlan MGBFL0110_MGT_STD_TOP_S01() {
		MGT_ACC_TOP_R S0T1 = MGT_ACC_TOP_R.create("T1");
		MCTempView S0T2 = createTempView("T2");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MGT_ARG_R S0ARG = MGT_ARG_R.create("ARG");
		MAM_COST_DPT_R S0MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R S0ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S0SPPL = MAM_BP_R.create("SPPL");
		MGT_ACC_TOP_R S1W1 = MGT_ACC_TOP_R.create("W1");
		MGT_ACC_SML_COST_R S1W2 = MGT_ACC_SML_COST_R.create("W2");
		MCTempView T = createTempView("T");
		MAM_ITM_GRP_R ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_CNTRY_R CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R AREA = MAM_AREA_R.create("AREA");
		MAM_BP_GRP_R SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0110_MGT_STD_TOP_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T1.wg_cd,
							S0WG.wg_nm,
							S0T1.ym,
							S0T1.mng_dpt_cd,
							S0MNG_DPT.dpt_nm.as("mng_dpt_nm"),
							S0T1.itm_cd,
							S0T1.itm_sub1,
							S0T1.itm_sub2,
							S0T1.itm_sub3,
							nvl(
								S0SUNDRY_ITM.itm_nm,
								S0ITM.itm_nm
							).as("itm_nm"),
							S0ITM.itm_typ,
							S0ITM.itm_typ_d_cd,
							S0ITM_TYP_D.itm_typ_d_nm,
							S0ITM.itm_jnl_cd,
							S0ITM_JNL.itm_jnl_nm,
							S0T1.lot_no,
							S0T1.sublot_no,
							S0T1.sno1,
							S0T1.sno2,
							S0T1.sno3,
							S0T1.sno4,
							S0T1.bp_cd.as("sppl_cd"),
							S0SPPL.bp_nm.as("sppl_nm"),
							S0T1.asst_typ,
							S0T1.repurc_obli_flg,
							S0T1.qty,
							S0ITM.unit_cd,
							S0UNIT.unit_nm,
							S0ITM.dec_place,
							S0T2.pr(S1W2.expns_cd),
							S0EXPNS.var_typ,
							S0EXPNS.expns_grp_cd,
							S0T2.pr("act_cost"),
							S0T2.pr("std_cost")
						)
						.from(
							S0T1
							.leftOuterJoin(
								subQuery()
								.select(
									S1W2.calc_no,
									S1W2.calc_grp_cd,
									S1W2.top_rec_no,
									S1W2.expns_cd,
									nvl(
										S1W2.act_cost,
										value(0)
									).as("act_cost"),
									nvl(
										S1W2.std_cost,
										value(0)
									).as("std_cost")
								)
								.from(
									S1W1
									.leftOuterJoin(S1W2).on(
										S1W1.calc_no.eq(S1W2.calc_no)
										.and(S1W1.calc_grp_cd.eq(S1W2.calc_grp_cd))
										.and(S1W1.top_rec_no.eq(S1W2.top_rec_no))
										.and(
											S1W2.expns_typ.in(
												value(MAC_EXPNS_TYP.PROD.value()),
												value(MAC_EXPNS_TYP.SPPL.value())
											)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1W1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.cutoff$and(S1W1.calc_no.like(bind("calc_no")))
								).view(S0T2)
							).on(
								S0T1.calc_no.eq(S0T2.pr(S1W2.calc_no))
								.and(S0T1.calc_grp_cd.eq(S0T2.pr(S1W2.calc_grp_cd)))
								.and(S0T1.top_rec_no.eq(S0T2.pr(S1W2.top_rec_no)))
							)
							.innerJoin(S0WG).on(S0T1.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T1.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0SUNDRY_ITM).on(
								S0T1.itm_cd.eq(S0SUNDRY_ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0SUNDRY_ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0SUNDRY_ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0SUNDRY_ITM.itm_sub3))
								.and(S0T1.sno1.eq(S0SUNDRY_ITM.sno1))
								.and(S0T1.sno2.eq(S0SUNDRY_ITM.sno2))
								.and(S0T1.sno3.eq(S0SUNDRY_ITM.sno3))
								.and(S0T1.sno4.eq(S0SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(S0UNIT).on(S0ITM.unit_cd.eq(S0UNIT.unit_cd))
							.leftOuterJoin(S0EXPNS).on(S0T2.pr(S1W2.expns_cd).eq(S0EXPNS.expns_cd))
							.innerJoin(S0ARG).on(
								S0T1.calc_no.eq(S0ARG.calc_no)
								.and(S0T1.calc_grp_cd.eq(S0ARG.calc_grp_cd))
							)
							.leftOuterJoin(S0MNG_DPT).on(
								S0T1.mng_dpt_cd.eq(S0MNG_DPT.dpt_cd)
								.and(S0ARG.term.eq(S0MNG_DPT.term))
							)
							.leftOuterJoin(S0ITM_TYP_D).on(
								S0ITM.itm_typ.eq(S0ITM_TYP_D.itm_typ)
								.and(S0ITM.itm_typ_d_cd.eq(S0ITM_TYP_D.itm_typ_d_cd))
							)
							.leftOuterJoin(S0ITM_JNL).on(S0ITM.itm_jnl_cd.eq(S0ITM_JNL.itm_jnl_cd))
							.leftOuterJoin(S0SPPL).on(S0T1.bp_cd.eq(S0SPPL.bp_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T1.calc_no.like(bind("calc_no")))
							.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.AVE.value())))
							.cutoff$and(S0T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S0ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S0ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S0ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
							.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S0SUNDRY_ITM.itm_nm,
									S0ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S0T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(S0T1.ym.eq(bind("ym")))
							.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T1.sno1.like(bind("sno1")))
							.cutoff$and(S0T1.sno2.like(bind("sno2")))
							.cutoff$and(S0T1.sno3.like(bind("sno3")))
							.cutoff$and(S0T1.sno4.like(bind("sno4")))
							.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								bind("asst_typ_cnd").eq(value(true))
								.and(
									S0T1.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.cutoff$and(S0T1.repurc_obli_flg.eq(bind("repurc_obli_flg")))
							.cutoff$and(S0T1.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
									.or(S0T1.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
							.cutoff$and(S0T1.bp_cd.like(bind("sppl_cd")))
							.cutoff$and(S0SPPL.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(S0SPPL.cntry_cd.like(bind("cntry_cd")))
							.cutoff$and(S0SPPL.area_cd.like(bind("area_cd")))
							.cutoff$and(S0ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
							.cutoff$and(S0ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
							.cutoff$and(S0ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
							.cutoff$and(S0ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
							.cutoff$and(S0ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
							.cutoff$and(S0ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
							.cutoff$and(S0ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
							.cutoff$and(S0ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
							.cutoff$and(S0ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
							.cutoff$and(S0ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
							.cutoff$and(S0SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1")))
							.cutoff$and(S0SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2")))
							.cutoff$and(S0SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3")))
							.cutoff$and(S0SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4")))
							.cutoff$and(S0SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5")))
							.cutoff$and(S0SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6")))
							.cutoff$and(S0SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7")))
							.cutoff$and(S0SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8")))
							.cutoff$and(S0SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9")))
							.cutoff$and(S0SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))
							.addDynamicPredicate(core)
						).view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
				.having(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr)
				)
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				when(null)
					.select(aggr,T.pr("wg_cd"))
					.groupBy(aggr,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(null)
					.select(aggr,T.pr("mng_dpt_cd"))
					.groupBy(aggr,T.pr("mng_dpt_cd"))
					.orderBy(T.pr("mng_dpt_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_typ"))
					.groupBy(aggr,T.pr("itm_typ"))
					.orderBy(T.pr("itm_typ").asc()),
				when(null)
					.select(aggr,T.pr("itm_typ_d_cd"))
					.groupBy(aggr,T.pr("itm_typ_d_cd"))
					.orderBy(T.pr("itm_typ_d_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_jnl_cd"))
					.groupBy(aggr,T.pr("itm_jnl_cd"))
					.orderBy(T.pr("itm_jnl_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_cd"))
					.groupBy(aggr,T.pr("itm_cd"))
					.orderBy(T.pr("itm_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub1"))
					.groupBy(aggr,T.pr("itm_sub1"))
					.orderBy(T.pr("itm_sub1").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub2"))
					.groupBy(aggr,T.pr("itm_sub2"))
					.orderBy(T.pr("itm_sub2").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub3"))
					.groupBy(aggr,T.pr("itm_sub3"))
					.orderBy(T.pr("itm_sub3").asc()),
				when(null)
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no"))
					.orderBy(T.pr("lot_no").asc()),
				when(null)
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no"))
					.orderBy(T.pr("sublot_no").asc()),
				when(null)
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1"))
					.orderBy(T.pr("sno1").asc()),
				when(null)
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2"))
					.orderBy(T.pr("sno2").asc()),
				when(null)
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3"))
					.orderBy(T.pr("sno3").asc()),
				when(null)
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4"))
					.orderBy(T.pr("sno4").asc()),
				when(null)
					.select(aggr,T.pr("sppl_cd"))
					.groupBy(aggr,T.pr("sppl_cd"))
					.orderBy(T.pr("sppl_cd").asc()),
				when(null)
					.select(aggr,T.pr("asst_typ"))
					.groupBy(aggr,T.pr("asst_typ"))
					.orderBy(T.pr("asst_typ").asc()),
				when(null)
					.select(aggr,T.pr("repurc_obli_flg"))
					.groupBy(aggr,T.pr("repurc_obli_flg")),
				when(null)
					.select(aggr,T.pr("wg_nm"))
					.groupBy(aggr,T.pr("wg_nm")),
				when(null)
					.select(aggr,T.pr("mng_dpt_nm"))
					.groupBy(aggr,T.pr("mng_dpt_nm")),
				when(null)
					.select(aggr,T.pr("itm_nm"))
					.groupBy(aggr,T.pr("itm_nm")),
				when(null)
					.select(aggr,T.pr("itm_typ_d_nm"))
					.groupBy(aggr,T.pr("itm_typ_d_nm")),
				when(null)
					.select(aggr,T.pr("itm_jnl_nm"))
					.groupBy(aggr,T.pr("itm_jnl_nm")),
				when(null)
					.select(aggr,T.pr("sppl_nm"))
					.groupBy(aggr,T.pr("sppl_nm")),
				when(null)
					.select(aggr,avg(T.pr("qty")).as("qty")),
				when(null)
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(null)
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(null)
					.select(aggr,T.pr("dec_place"))
					.groupBy(aggr,T.pr("dec_place")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost_ttl")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_100"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_100"),T.pr("act_cost"),value(0))),value(0)).as("col_100")),
				when(boundOr("exp_flg_100"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_100"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_100")),
				when(boundOr("grp_flg_102"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_102"),T.pr("act_cost"),value(0))),value(0)).as("col_102")),
				when(boundOr("exp_flg_102"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_102"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_102")),
				when(boundOr("grp_flg_104"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_104"),T.pr("act_cost"),value(0))),value(0)).as("col_104")),
				when(boundOr("exp_flg_104"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_104"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_104")),
				when(boundOr("grp_flg_106"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_106"),T.pr("act_cost"),value(0))),value(0)).as("col_106")),
				when(boundOr("exp_flg_106"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_106"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_106")),
				when(boundOr("grp_flg_108"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_108"),T.pr("act_cost"),value(0))),value(0)).as("col_108")),
				when(boundOr("exp_flg_108"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_108"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_108")),
				when(boundOr("grp_flg_110"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_110"),T.pr("act_cost"),value(0))),value(0)).as("col_110")),
				when(boundOr("exp_flg_110"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_110"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_110")),
				when(boundOr("grp_flg_112"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_112"),T.pr("act_cost"),value(0))),value(0)).as("col_112")),
				when(boundOr("exp_flg_112"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_112"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_112")),
				when(boundOr("grp_flg_114"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_114"),T.pr("act_cost"),value(0))),value(0)).as("col_114")),
				when(boundOr("exp_flg_114"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_114"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_114")),
				when(boundOr("grp_flg_116"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_116"),T.pr("act_cost"),value(0))),value(0)).as("col_116")),
				when(boundOr("exp_flg_116"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_116"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_116")),
				when(boundOr("grp_flg_118"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_118"),T.pr("act_cost"),value(0))),value(0)).as("col_118")),
				when(boundOr("exp_flg_118"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_118"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_118")),
				when(boundOr("grp_flg_120"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_120"),T.pr("act_cost"),value(0))),value(0)).as("col_120")),
				when(boundOr("exp_flg_120"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_120"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_120")),
				when(boundOr("grp_flg_122"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_122"),T.pr("act_cost"),value(0))),value(0)).as("col_122")),
				when(boundOr("exp_flg_122"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_122"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_122")),
				when(boundOr("grp_flg_124"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_124"),T.pr("act_cost"),value(0))),value(0)).as("col_124")),
				when(boundOr("exp_flg_124"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_124"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_124")),
				when(boundOr("grp_flg_126"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_126"),T.pr("act_cost"),value(0))),value(0)).as("col_126")),
				when(boundOr("exp_flg_126"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_126"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_126")),
				when(boundOr("grp_flg_128"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_128"),T.pr("act_cost"),value(0))),value(0)).as("col_128")),
				when(boundOr("exp_flg_128"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_128"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_128")),
				when(boundOr("grp_flg_130"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_130"),T.pr("act_cost"),value(0))),value(0)).as("col_130")),
				when(boundOr("exp_flg_130"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_130"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_130")),
				when(boundOr("grp_flg_132"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_132"),T.pr("act_cost"),value(0))),value(0)).as("col_132")),
				when(boundOr("exp_flg_132"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_132"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_132")),
				when(boundOr("grp_flg_134"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_134"),T.pr("act_cost"),value(0))),value(0)).as("col_134")),
				when(boundOr("exp_flg_134"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_134"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_134")),
				when(boundOr("grp_flg_136"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_136"),T.pr("act_cost"),value(0))),value(0)).as("col_136")),
				when(boundOr("exp_flg_136"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_136"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_136")),
				when(boundOr("grp_flg_138"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_138"),T.pr("act_cost"),value(0))),value(0)).as("col_138")),
				when(boundOr("exp_flg_138"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_138"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_138")),
				when(boundOr("grp_flg_140"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_140"),T.pr("act_cost"),value(0))),value(0)).as("col_140")),
				when(boundOr("exp_flg_140"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_140"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_140")),
				when(boundOr("grp_flg_142"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_142"),T.pr("act_cost"),value(0))),value(0)).as("col_142")),
				when(boundOr("exp_flg_142"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_142"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_142")),
				when(boundOr("grp_flg_144"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_144"),T.pr("act_cost"),value(0))),value(0)).as("col_144")),
				when(boundOr("exp_flg_144"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_144"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_144")),
				when(boundOr("grp_flg_146"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_146"),T.pr("act_cost"),value(0))),value(0)).as("col_146")),
				when(boundOr("exp_flg_146"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_146"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_146")),
				when(boundOr("grp_flg_148"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_148"),T.pr("act_cost"),value(0))),value(0)).as("col_148")),
				when(boundOr("exp_flg_148"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_148"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_148")),
				when(boundOr("grp_flg_150"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_150"),T.pr("act_cost"),value(0))),value(0)).as("col_150")),
				when(boundOr("exp_flg_150"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_150"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_150")),
				when(boundOr("grp_flg_152"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_152"),T.pr("act_cost"),value(0))),value(0)).as("col_152")),
				when(boundOr("exp_flg_152"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_152"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_152")),
				when(boundOr("grp_flg_154"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_154"),T.pr("act_cost"),value(0))),value(0)).as("col_154")),
				when(boundOr("exp_flg_154"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_154"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_154")),
				when(boundOr("grp_flg_156"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_156"),T.pr("act_cost"),value(0))),value(0)).as("col_156")),
				when(boundOr("exp_flg_156"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_156"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_156")),
				when(boundOr("grp_flg_158"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_158"),T.pr("act_cost"),value(0))),value(0)).as("col_158")),
				when(boundOr("exp_flg_158"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_158"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_158")),
				when(boundOr("grp_flg_160"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_160"),T.pr("act_cost"),value(0))),value(0)).as("col_160")),
				when(boundOr("exp_flg_160"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_160"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_160")),
				when(boundOr("grp_flg_162"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_162"),T.pr("act_cost"),value(0))),value(0)).as("col_162")),
				when(boundOr("exp_flg_162"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_162"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_162")),
				when(boundOr("grp_flg_164"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_164"),T.pr("act_cost"),value(0))),value(0)).as("col_164")),
				when(boundOr("exp_flg_164"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_164"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_164")),
				when(boundOr("grp_flg_166"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_166"),T.pr("act_cost"),value(0))),value(0)).as("col_166")),
				when(boundOr("exp_flg_166"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_166"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_166")),
				when(boundOr("grp_flg_168"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_168"),T.pr("act_cost"),value(0))),value(0)).as("col_168")),
				when(boundOr("exp_flg_168"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_168"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_168")),
				when(boundOr("grp_flg_170"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_170"),T.pr("act_cost"),value(0))),value(0)).as("col_170")),
				when(boundOr("exp_flg_170"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_170"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_170")),
				when(boundOr("grp_flg_172"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_172"),T.pr("act_cost"),value(0))),value(0)).as("col_172")),
				when(boundOr("exp_flg_172"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_172"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_172")),
				when(boundOr("grp_flg_174"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_174"),T.pr("act_cost"),value(0))),value(0)).as("col_174")),
				when(boundOr("exp_flg_174"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_174"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_174")),
				when(boundOr("grp_flg_176"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_176"),T.pr("act_cost"),value(0))),value(0)).as("col_176")),
				when(boundOr("exp_flg_176"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_176"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_176")),
				when(boundOr("grp_flg_178"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_178"),T.pr("act_cost"),value(0))),value(0)).as("col_178")),
				when(boundOr("exp_flg_178"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_178"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_178")),
				when(boundOr("grp_flg_180"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_180"),T.pr("act_cost"),value(0))),value(0)).as("col_180")),
				when(boundOr("exp_flg_180"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_180"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_180")),
				when(boundOr("grp_flg_182"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_182"),T.pr("act_cost"),value(0))),value(0)).as("col_182")),
				when(boundOr("exp_flg_182"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_182"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_182")),
				when(boundOr("grp_flg_184"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_184"),T.pr("act_cost"),value(0))),value(0)).as("col_184")),
				when(boundOr("exp_flg_184"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_184"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_184")),
				when(boundOr("grp_flg_186"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_186"),T.pr("act_cost"),value(0))),value(0)).as("col_186")),
				when(boundOr("exp_flg_186"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_186"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_186")),
				when(boundOr("grp_flg_188"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_188"),T.pr("act_cost"),value(0))),value(0)).as("col_188")),
				when(boundOr("exp_flg_188"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_188"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_188")),
				when(boundOr("grp_flg_190"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_190"),T.pr("act_cost"),value(0))),value(0)).as("col_190")),
				when(boundOr("exp_flg_190"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_190"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_190")),
				when(boundOr("grp_flg_192"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_192"),T.pr("act_cost"),value(0))),value(0)).as("col_192")),
				when(boundOr("exp_flg_192"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_192"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_192")),
				when(boundOr("grp_flg_194"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_194"),T.pr("act_cost"),value(0))),value(0)).as("col_194")),
				when(boundOr("exp_flg_194"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_194"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_194")),
				when(boundOr("grp_flg_196"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_196"),T.pr("act_cost"),value(0))),value(0)).as("col_196")),
				when(boundOr("exp_flg_196"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_196"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_196")),
				when(boundOr("grp_flg_198"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_198"),T.pr("act_cost"),value(0))),value(0)).as("col_198")),
				when(boundOr("exp_flg_198"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_198"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_198")),
				when(boundOr("itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP1).on(S0ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				when(boundOr("itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP2).on(S0ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				when(boundOr("itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP3).on(S0ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				when(boundOr("itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP4).on(S0ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				when(boundOr("itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP5).on(S0ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				when(boundOr("itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP6).on(S0ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				when(boundOr("itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP7).on(S0ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				when(boundOr("itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP8).on(S0ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				when(boundOr("itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP9).on(S0ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				when(boundOr("itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP10).on(S0ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),
				when(boundOr("cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CNTRY).on(S0SPPL.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				when(boundOr("area_nm"))
					.view(core, v -> v.leftOuterJoin(AREA).on(S0SPPL.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM")))),
				when(boundOr("sppl_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP1).on(S0SPPL.bp_grp_cd1.eq(SPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(SPPL_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP1.bp_grp_nm.like(bind("SPPL_GRP_NM1")))),
				when(boundOr("sppl_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP2).on(S0SPPL.bp_grp_cd2.eq(SPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(SPPL_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP2.bp_grp_nm.like(bind("SPPL_GRP_NM2")))),
				when(boundOr("sppl_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP3).on(S0SPPL.bp_grp_cd3.eq(SPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(SPPL_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP3.bp_grp_nm.like(bind("SPPL_GRP_NM3")))),
				when(boundOr("sppl_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP4).on(S0SPPL.bp_grp_cd4.eq(SPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(SPPL_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP4.bp_grp_nm.like(bind("SPPL_GRP_NM4")))),
				when(boundOr("sppl_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP5).on(S0SPPL.bp_grp_cd5.eq(SPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(SPPL_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP5.bp_grp_nm.like(bind("SPPL_GRP_NM5")))),
				when(boundOr("sppl_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP6).on(S0SPPL.bp_grp_cd6.eq(SPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(SPPL_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP6.bp_grp_nm.like(bind("SPPL_GRP_NM6")))),
				when(boundOr("sppl_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP7).on(S0SPPL.bp_grp_cd7.eq(SPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(SPPL_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP7.bp_grp_nm.like(bind("SPPL_GRP_NM7")))),
				when(boundOr("sppl_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP8).on(S0SPPL.bp_grp_cd8.eq(SPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(SPPL_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP8.bp_grp_nm.like(bind("SPPL_GRP_NM8")))),
				when(boundOr("sppl_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP9).on(S0SPPL.bp_grp_cd9.eq(SPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(SPPL_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP9.bp_grp_nm.like(bind("SPPL_GRP_NM9")))),
				when(boundOr("sppl_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(SPPL_GRP10).on(S0SPPL.bp_grp_cd10.eq(SPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(SPPL_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(SPPL_GRP10.bp_grp_nm.like(bind("SPPL_GRP_NM10"))))
			);
	}
}