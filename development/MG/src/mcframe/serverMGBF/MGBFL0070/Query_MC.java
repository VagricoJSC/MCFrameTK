package mcframe.serverMGBF.MGBFL0070;

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
	
	/**
	 * MGBFL0070_MGT_ACC_TOP_S01
	 */
	static MCQueryPlan MGBFL0070_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_COST_R S0T2 = MGT_ACC_COST_R.create("T2");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_OPER_R S0OPER = MAM_OPER_R.create("OPER");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MGT_ACC_INPT_R S1W = MGT_ACC_INPT_R.create("W");
		MCTempView T = createTempView("T");
		MGT_ARG_R ARG = MGT_ARG_R.create("ARG");
		MAM_COST_DPT_R MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_SITE_R SITE = MAM_SITE_R.create("SITE");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R AREA = MAM_AREA_R.create("AREA");

		MAM_ITM_R S2ITM = MAM_ITM_R.create("ITM");
		MGT_ARG_R ARG2 = MGT_ARG_R.create("ARG2");
		MAM_COST_DPT_R MNG_DPT2 = MAM_COST_DPT_R.create("MNG_DPT2");
		MAM_ITM_TYP_D_R ITM_TYP_D2 = MAM_ITM_TYP_D_R.create("ITM_TYP_D2");
		MAM_ITM_JNL_R ITM_JNL2 = MAM_ITM_JNL_R.create("ITM_JNL2");
		MAM_ITM_GRP_R ITM_GRP21 = MAM_ITM_GRP_R.create("ITM_GRP21");
		MAM_ITM_GRP_R ITM_GRP22 = MAM_ITM_GRP_R.create("ITM_GRP22");
		MAM_ITM_GRP_R ITM_GRP23 = MAM_ITM_GRP_R.create("ITM_GRP23");
		MAM_ITM_GRP_R ITM_GRP24 = MAM_ITM_GRP_R.create("ITM_GRP24");
		MAM_ITM_GRP_R ITM_GRP25 = MAM_ITM_GRP_R.create("ITM_GRP25");
		MAM_ITM_GRP_R ITM_GRP26 = MAM_ITM_GRP_R.create("ITM_GRP26");
		MAM_ITM_GRP_R ITM_GRP27 = MAM_ITM_GRP_R.create("ITM_GRP27");
		MAM_ITM_GRP_R ITM_GRP28 = MAM_ITM_GRP_R.create("ITM_GRP28");
		MAM_ITM_GRP_R ITM_GRP29 = MAM_ITM_GRP_R.create("ITM_GRP29");
		MAM_ITM_GRP_R ITM_GRP210 = MAM_ITM_GRP_R.create("ITM_GRP210");
		MAM_SITE_R SITE2 = MAM_SITE_R.create("SITE2");
		MAM_LOC_R LOC2 = MAM_LOC_R.create("LOC2");
		MAM_STR_LN_R STR_LN2 = MAM_STR_LN_R.create("STR_LN2");
		MAM_OPER_R OPER2 = MAM_OPER_R.create("OPER2");
		MAM_BP_R BP2 = MAM_BP_R.create("BP2");
		MAM_BP_GRP_R BP_GRP21 = MAM_BP_GRP_R.create("BP_GRP21");
		MAM_BP_GRP_R BP_GRP22 = MAM_BP_GRP_R.create("BP_GRP22");
		MAM_BP_GRP_R BP_GRP23 = MAM_BP_GRP_R.create("BP_GRP23");
		MAM_BP_GRP_R BP_GRP24 = MAM_BP_GRP_R.create("BP_GRP24");
		MAM_BP_GRP_R BP_GRP25 = MAM_BP_GRP_R.create("BP_GRP25");
		MAM_BP_GRP_R BP_GRP26 = MAM_BP_GRP_R.create("BP_GRP26");
		MAM_BP_GRP_R BP_GRP27 = MAM_BP_GRP_R.create("BP_GRP27");
		MAM_BP_GRP_R BP_GRP28 = MAM_BP_GRP_R.create("BP_GRP28");
		MAM_BP_GRP_R BP_GRP29 = MAM_BP_GRP_R.create("BP_GRP29");
		MAM_BP_GRP_R BP_GRP210 = MAM_BP_GRP_R.create("BP_GRP210");
		MAM_CNTRY_R CNTRY2 = MAM_CNTRY_R.create("CNTRY2");
		MAM_AREA_R AREA2 = MAM_AREA_R.create("AREA2");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");
		MCDynamicSQLID aggr2 = createDynamicSQLID("aggr2");
		MCDynamicSQLID chdCore = createDynamicSQLID("chdCore");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0070_MGT_ACC_TOP_Query_S01")
				.mainQuery()
				.select(
						addDynamicSelect(aggr2)
				)
				.from(
					subQuery()
					.select(
						addDynamicSelect(aggr)
					)
					.from(
						subQuery()
						.select(
								S0T.calc_no,
								S0T.calc_grp_cd,
								S0T.wg_cd,
								S0WG.wg_nm,
								S0T.ym,
								S0T.mng_dpt_cd,
								S0T.itm_cd,
								S0T.itm_sub1,
								S0T.itm_sub2,
								S0T.itm_sub3,
								S0SUNDRY_ITM.itm_nm,
								S0T.lot_no,
								S0T.sublot_no,
								S0T.sno1,
								S0T.sno2,
								S0T.sno3,
								S0T.sno4,
								S0T.itm_mfg_inst_no,
								S0T.mfg_act_no,
								S0T.ac_slip_typ,
								S0T.ac_rsn_cd,
								S0T2.loc_cd,
								S0T2.str_ln_cd,
								S0T.asst_typ,
								S0T.bp_cd,
								S0T.po_no,
								S0T.slo_no,
								S0T.iv_no,
								S0T2.oper_act_no,
								S0T2.oper_seq,
								S0T2.oper_cd,
								decode(
									S0T2.oper_cost_flg,
									value(false),
									S0T2.act_cost,
									value(0)
								).as("mfg_inpt_cost"),
								decode(
									S0T2.oper_cost_flg,
									value(true),
									S0T2.act_cost,
									value(0)
								).as("act_cost"),
								S0EXPNS.expns_grp_cd,
								S0EXPNS.var_typ,
								S0T2.expns_cd,
								S0T2.expns_typ,
								addDynamicSelect(core)
							)
							.from(
								S0T
								.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
								.leftOuterJoin(S0SUNDRY_ITM).on(
									S0T.itm_cd.eq(S0SUNDRY_ITM.itm_cd)
									.and(S0T.itm_sub1.eq(S0SUNDRY_ITM.itm_sub1))
									.and(S0T.itm_sub2.eq(S0SUNDRY_ITM.itm_sub2))
									.and(S0T.itm_sub3.eq(S0SUNDRY_ITM.itm_sub3))
									.and(S0T.sno1.eq(S0SUNDRY_ITM.sno1))
									.and(S0T.sno2.eq(S0SUNDRY_ITM.sno2))
									.and(S0T.sno3.eq(S0SUNDRY_ITM.sno3))
									.and(S0T.sno4.eq(S0SUNDRY_ITM.sno4))
								)
								.addDynamicView(core)
								.innerJoin(S0T2).on(
									S0T2.calc_no.eq(S0T.calc_no)
									.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
									.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
									.and(S0T2.act_cost.neq(value(0)))
									.and(
										nvl(
											S0T2.expns_typ,
											value(MAC_EXPNS_TYP.PROD.value())
										).eq(value(MAC_EXPNS_TYP.PROD.value()))
									)
								)
								.leftOuterJoin(S0EXPNS).on(S0EXPNS.expns_cd.eq(S0T2.expns_cd))
								.addDynamicView(chdCore)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S0T.calc_no.like(bind("calc_no")))
								.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.cutoff$and(S0T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S0T.ym.eq(bind("ym")))
								.cutoff$and(S0T.mng_dpt_cd.like(bind("mng_dpt_cd")))
								.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S0T.lot_no.like(bind("lot_no")))
								.cutoff$and(S0T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S0T.sno1.like(bind("sno1")))
								.cutoff$and(S0T.sno2.like(bind("sno2")))
								.cutoff$and(S0T.sno3.like(bind("sno3")))
								.cutoff$and(S0T.sno4.like(bind("sno4")))
								.cutoff$and(S0T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S0T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S0T.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S0T.ac_slip_typ.like(bind("ac_slip_typ")))
								.cutoff$and(S0T.ac_rsn_cd.like(bind("ac_rsn_cd")))
								.cutoff$and(S0T2.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S0T2.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S0T2.oper_cd.like(bind("oper_cd")))
								.cutoff$and(S0T2.oper_act_no.like(bind("oper_act_no")))
								.cutoff$and(S0T.bp_cd.like(bind("bp_cd")))
								.cutoff$and(S0T.po_no.like(bind("po_no")))
								.cutoff$and(S0T.slo_no.like(bind("slo_no")))
								.cutoff$and(S0T.iv_no.like(bind("iv_no")))
								.cutoff$and(
									bind("no_bp_flg_str").eq(value(true))
									.and(S0T.bp_cd.isNull())
								)
								.cutoff$and(
									bind("no_oper_act_no_flg_str").eq(value(true))
									.and(S0T2.oper_act_no.isNull())
								)
								.cutoff$and(
									bind("no_po_no_flg_str").eq(value(true))
									.and(S0T.po_no.isNull())
								)
								.cutoff$and(
									bind("no_slo_no_flg_str").eq(value(true))
									.and(S0T.slo_no.isNull())
								)
								.cutoff$and(
									bind("no_iv_no_flg_str").eq(value(true))
									.and(S0T.iv_no.isNull())
								)
								.cutoff$and(
									bind("inpt_cnd").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S1W)
											.where(
												value(0).eq(value(0))
												.and(S1W.calc_no.eq(S0T2.calc_no))
												.and(S1W.calc_grp_cd.eq(S0T2.calc_grp_cd))
												.and(S1W.inpt_rec_no.eq(S0T2.inpt_rec_no))
												.and(S1W.top_rec_no.eq(S0T2.top_rec_no))
												.and(S1W.lvl.eq(value(0)))
											)
										)
									)
								)
								.addDynamicPredicate(core)
							).view(T)
					)
					.groupBy(
						addDynamicGroupBy(aggr)
					)
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(aggr)
					).view(T)
					.addDynamicView(aggr2)
				)
				.where(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr2)
				)
				.groupBy(
					addDynamicGroupBy(aggr2)
				)
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.select(aggr,T.pr("wg_cd"))
					.groupBy(aggr,T.pr("wg_cd"))
					.select(aggr2,T.pr("wg_cd"))
					.groupBy(aggr2,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(boundOr("ym_flg"))
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.select(aggr2,T.pr("ym"))
					.groupBy(aggr2,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(boundOr("mng_dpt_flg"))
					.select(aggr,T.pr("mng_dpt_cd"))
					.groupBy(aggr,T.pr("mng_dpt_cd"))
					.select(aggr2,T.pr("mng_dpt_cd"))
					.groupBy(aggr2,T.pr("mng_dpt_cd"))
					.orderBy(T.pr("mng_dpt_cd").asc()),
				when(boundOr("itm_typ_flg"))
					.select(aggr2,S2ITM.itm_typ.as("itm_typ"))
					.groupBy(aggr2,S2ITM.itm_typ)
					.orderBy(S2ITM.itm_typ.asc()),
				when(boundOr("itm_typ_d_flg"))
					.select(aggr2,S2ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(aggr2,S2ITM.itm_typ_d_cd)
					.orderBy(S2ITM.itm_typ_d_cd.asc()),
				when(boundOr("itm_jnl_flg"))
					.select(aggr2,S2ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(aggr2,S2ITM.itm_jnl_cd)
					.orderBy(S2ITM.itm_jnl_cd.asc()),
				when(null)
					.select(aggr,T.pr("calc_no"),T.pr("calc_grp_cd"))
					.groupBy(aggr,T.pr("calc_no"),T.pr("calc_grp_cd")),
				when(boundOr("itm_flg"))
					.select(aggr2,T.pr("itm_cd"),T.pr("itm_sub1"),T.pr("itm_sub2"),T.pr("itm_sub3"))
					.groupBy(aggr2,T.pr("itm_cd"),T.pr("itm_sub1"),T.pr("itm_sub2"),T.pr("itm_sub3"))
					.orderBy(T.pr("itm_cd").asc(),T.pr("itm_sub1").asc(),T.pr("itm_sub2").asc(),T.pr("itm_sub3").asc()),
				when(boundOr("itm_mfg_inst_flg"))
					.select(aggr,T.pr("itm_mfg_inst_no"))
					.groupBy(aggr,T.pr("itm_mfg_inst_no"))
					.select(aggr2,T.pr("itm_mfg_inst_no"))
					.groupBy(aggr2,T.pr("itm_mfg_inst_no"))
					.orderBy(T.pr("itm_mfg_inst_no").asc()),
				when(boundOr("mfg_act_flg"))
					.select(aggr,T.pr("mfg_act_no"))
					.groupBy(aggr,T.pr("mfg_act_no"))
					.select(aggr2,T.pr("mfg_act_no"))
					.groupBy(aggr2,T.pr("mfg_act_no"))
					.orderBy(T.pr("mfg_act_no").asc()),
				when(boundOr("oper_act_flg"))
					.select(aggr,T.pr("oper_act_no"))
					.groupBy(aggr,T.pr("oper_act_no"))
					.select(aggr2,T.pr("oper_act_no"))
					.groupBy(aggr2,T.pr("oper_act_no"))
					.orderBy(T.pr("oper_act_no").asc()),
				when(null)
					.select(aggr,T.pr("oper_cd"))
					.groupBy(aggr,T.pr("oper_cd"))
					.select(aggr2,T.pr("oper_cd"))
					.groupBy(aggr2,T.pr("oper_cd"))
					.orderBy(T.pr("oper_cd").asc()),
				when(boundOr("wg_flg"))
					.select(aggr,T.pr("wg_nm"))
					.groupBy(aggr,T.pr("wg_nm"))
					.select(aggr2,T.pr("wg_nm"))
					.groupBy(aggr2,T.pr("wg_nm")),
				when(boundOr("mng_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T.calc_no.eq(ARG.calc_no).and(S0T.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				when(boundOr("mng_dpt_nm"))
					.view(core, v -> v.innerJoin(MNG_DPT).on(S0T.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(ARG.term.eq(MNG_DPT.term))))
					.predicate(core, p -> p.cutoff$and(MNG_DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				when(boundOr("mng_dpt_flg"))
					.view(aggr2, v -> v.innerJoin(ARG2).on(T.pr("calc_no").eq(ARG2.calc_no).and(T.pr("calc_grp_cd").eq(ARG2.calc_grp_cd)))),
				when(boundOr("mng_dpt_flg"))
					.view(aggr2, v -> v.leftOuterJoin(MNG_DPT2).on(T.pr("mng_dpt_cd").eq(MNG_DPT2.dpt_cd).and(ARG2.term.eq(MNG_DPT2.term))))
					.select(aggr2,MNG_DPT2.dpt_nm.as("mng_dpt_nm"))
					.groupBy(aggr2,MNG_DPT2.dpt_nm),

				// 検索条件（品目関連）
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm",
						"itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_cd2",
						"itm_grp_cd3", "itm_grp_cd4", "itm_grp_cd5",
						"itm_grp_cd6", "itm_grp_cd7", "itm_grp_cd8",
						"itm_grp_cd9", "itm_grp_cd10", "itm_grp_nm1",
						"itm_grp_nm2", "itm_grp_nm3", "itm_grp_nm4",
						"itm_grp_nm5", "itm_grp_nm6", "itm_grp_nm7",
						"itm_grp_nm8", "itm_grp_nm9", "itm_grp_nm10"))
					.view(core, v -> v.innerJoin(S0ITM).on(
							S0T.itm_cd.eq(S0ITM.itm_cd)
							.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
							.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
							.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
						)
					),
				when(boundOr("itm_nm"))
					.predicate(core, p -> p.cutoff$and(
							nvl(
									S0SUNDRY_ITM.itm_nm,
									S0ITM.itm_nm
								).like(bind("itm_nm"))
							)),
				when(boundOr("itm_typ"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_typ.like(bind("ITM_TYP")))),
				when(boundOr("itm_typ_d_cd"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("ITM_TYP_D_CD")))),
				when(boundOr("itm_typ_d_nm"))
					.view(core, v -> v.innerJoin(ITM_TYP_D).on(S0ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(S0ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
				when(boundOr("itm_jnl_cd"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_jnl_cd.like(bind("ITM_JNL_CD")))),
				when(boundOr("itm_jnl_nm"))
					.view(core, v -> v.innerJoin(ITM_JNL).on(S0ITM.itm_jnl_cd.eq(ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_JNL.itm_jnl_nm.like(bind("ITM_JNL_NM")))),
				when(boundOr("itm_grp_cd1"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd1.like(bind("ITM_GRP_CD1")))),
				when(boundOr("itm_grp_cd2"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd2.like(bind("ITM_GRP_CD2")))),
				when(boundOr("itm_grp_cd3"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd3.like(bind("ITM_GRP_CD3")))),
				when(boundOr("itm_grp_cd4"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd4.like(bind("ITM_GRP_CD4")))),
				when(boundOr("itm_grp_cd5"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd5.like(bind("ITM_GRP_CD5")))),
				when(boundOr("itm_grp_cd6"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd6.like(bind("ITM_GRP_CD6")))),
				when(boundOr("itm_grp_cd7"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd7.like(bind("ITM_GRP_CD7")))),
				when(boundOr("itm_grp_cd8"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd8.like(bind("ITM_GRP_CD8")))),
				when(boundOr("itm_grp_cd9"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd9.like(bind("ITM_GRP_CD9")))),
				when(boundOr("itm_grp_cd10"))
					.predicate(core, p -> p.cutoff$and(S0ITM.itm_grp_cd10.like(bind("ITM_GRP_CD10")))),
				when(boundOr("itm_grp_nm1"))
					.view(core, v -> v.innerJoin(ITM_GRP1).on(S0ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				when(boundOr("itm_grp_nm2"))
					.view(core, v -> v.innerJoin(ITM_GRP2).on(S0ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				when(boundOr("itm_grp_nm3"))
					.view(core, v -> v.innerJoin(ITM_GRP3).on(S0ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				when(boundOr("itm_grp_nm4"))
					.view(core, v -> v.innerJoin(ITM_GRP4).on(S0ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				when(boundOr("itm_grp_nm5"))
					.view(core, v -> v.innerJoin(ITM_GRP5).on(S0ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				when(boundOr("itm_grp_nm6"))
					.view(core, v -> v.innerJoin(ITM_GRP6).on(S0ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				when(boundOr("itm_grp_nm7"))
					.view(core, v -> v.innerJoin(ITM_GRP7).on(S0ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				when(boundOr("itm_grp_nm8"))
					.view(core, v -> v.innerJoin(ITM_GRP8).on(S0ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				when(boundOr("itm_grp_nm9"))
					.view(core, v -> v.innerJoin(ITM_GRP9).on(S0ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				when(boundOr("itm_grp_nm10"))
					.view(core, v -> v.innerJoin(ITM_GRP10).on(S0ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),

				// 項目表示（品目関連）
				when(boundOr("itm_flg", "itm_typ_d_flg", "itm_jnl_flg",
						"itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3",
						"itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6",
						"itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9",
						"itm_grp_flg10", "qty_flg"))
					.view(aggr2, v -> v.leftOuterJoin(S2ITM).on(
							T.pr("itm_cd").eq(S2ITM.itm_cd)
							.and(T.pr("itm_sub1").eq(S2ITM.itm_sub1))
							.and(T.pr("itm_sub2").eq(S2ITM.itm_sub2))
							.and(T.pr("itm_sub3").eq(S2ITM.itm_sub3))
						)
					)
					.select(aggr,T.pr("itm_cd"),T.pr("itm_sub1"),T.pr("itm_sub2"),T.pr("itm_sub3"),T.pr("itm_nm")) // itm_nmは諸口品名
					.groupBy(aggr,T.pr("itm_cd"),T.pr("itm_sub1"),T.pr("itm_sub2"),T.pr("itm_sub3"),T.pr("itm_nm")),
				when(boundOr("itm_flg"))
					.select(aggr2,nvl(T.pr("itm_nm"),S2ITM.itm_nm).as("itm_nm"))
					.groupBy(aggr2,nvl(T.pr("itm_nm"),S2ITM.itm_nm)),
				when(boundOr("itm_typ_d_flg"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_TYP_D2).on(S2ITM.itm_typ.eq(ITM_TYP_D2.itm_typ).and(S2ITM.itm_typ_d_cd.eq(ITM_TYP_D2.itm_typ_d_cd))))
					.select(aggr2,ITM_TYP_D2.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(aggr2,ITM_TYP_D2.itm_typ_d_nm),
				when(boundOr("itm_jnl_flg"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_JNL2).on(S2ITM.itm_jnl_cd.eq(ITM_JNL2.itm_jnl_cd)))
					.select(aggr2,ITM_JNL2.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(aggr2,ITM_JNL2.itm_jnl_nm),
				when(boundOr("itm_grp_flg1"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP21).on(S2ITM.itm_grp_cd1.eq(ITM_GRP21.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP21.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd1,ITM_GRP21.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(aggr2,S2ITM.itm_grp_cd1,ITM_GRP21.itm_grp_nm),
				when(boundOr("itm_grp_flg2"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP22).on(S2ITM.itm_grp_cd2.eq(ITM_GRP22.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP22.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd2,ITM_GRP22.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(aggr2,S2ITM.itm_grp_cd2,ITM_GRP22.itm_grp_nm),
				when(boundOr("itm_grp_flg3"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP23).on(S2ITM.itm_grp_cd3.eq(ITM_GRP23.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP23.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd3,ITM_GRP23.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(aggr2,S2ITM.itm_grp_cd3,ITM_GRP23.itm_grp_nm),
				when(boundOr("itm_grp_flg4"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP24).on(S2ITM.itm_grp_cd4.eq(ITM_GRP24.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP24.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd4,ITM_GRP24.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(aggr2,S2ITM.itm_grp_cd4,ITM_GRP24.itm_grp_nm),
				when(boundOr("itm_grp_flg5"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP25).on(S2ITM.itm_grp_cd5.eq(ITM_GRP25.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP25.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd5,ITM_GRP25.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(aggr2,S2ITM.itm_grp_cd5,ITM_GRP25.itm_grp_nm),
				when(boundOr("itm_grp_flg6"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP26).on(S2ITM.itm_grp_cd6.eq(ITM_GRP26.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP26.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd6,ITM_GRP26.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(aggr2,S2ITM.itm_grp_cd6,ITM_GRP26.itm_grp_nm),
				when(boundOr("itm_grp_flg7"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP27).on(S2ITM.itm_grp_cd7.eq(ITM_GRP27.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP27.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd7,ITM_GRP27.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(aggr2,S2ITM.itm_grp_cd7,ITM_GRP27.itm_grp_nm),
				when(boundOr("itm_grp_flg8"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP28).on(S2ITM.itm_grp_cd8.eq(ITM_GRP28.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP28.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd8,ITM_GRP28.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(aggr2,S2ITM.itm_grp_cd8,ITM_GRP28.itm_grp_nm),
				when(boundOr("itm_grp_flg9"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP29).on(S2ITM.itm_grp_cd9.eq(ITM_GRP29.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP29.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd9,ITM_GRP29.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(aggr2,S2ITM.itm_grp_cd9,ITM_GRP29.itm_grp_nm),
				when(boundOr("itm_grp_flg10"))
					.view(aggr2, v -> v.leftOuterJoin(ITM_GRP210).on(S2ITM.itm_grp_cd10.eq(ITM_GRP210.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP210.itm_grp_typ))))
					.select(aggr2,S2ITM.itm_grp_cd10,ITM_GRP210.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(aggr2,S2ITM.itm_grp_cd10,ITM_GRP210.itm_grp_nm),

				when(boundOr("lot_flg"))
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no"))
					.select(aggr2,T.pr("lot_no"))
					.groupBy(aggr2,T.pr("lot_no")),
				when(boundOr("sublot_flg"))
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no"))
					.select(aggr2,T.pr("sublot_no"))
					.groupBy(aggr2,T.pr("sublot_no")),
				when(boundOr("sno1_flg"))
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1"))
					.select(aggr2,T.pr("sno1"))
					.groupBy(aggr2,T.pr("sno1")),
				when(boundOr("sno2_flg"))
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2"))
					.select(aggr2,T.pr("sno2"))
					.groupBy(aggr2,T.pr("sno2")),
				when(boundOr("sno3_flg"))
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3"))
					.select(aggr2,T.pr("sno3"))
					.groupBy(aggr2,T.pr("sno3")),
				when(boundOr("sno4_flg"))
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4"))
					.select(aggr2,T.pr("sno4"))
					.groupBy(aggr2,T.pr("sno4")),

				// 検索条件（場所関連）
				when(boundOr("loc_nm","site_cd","site_nm"))
					.view(chdCore, v -> v.innerJoin(LOC).on(S0T2.loc_cd.eq(LOC.loc_cd))),
				when(boundOr("loc_nm"))
					.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM")))),
				when(boundOr("site_cd"))
					.predicate(core, p -> p.cutoff$and(LOC.site_cd.like(bind("SITE_CD")))),
				when(boundOr("site_nm"))
					.view(chdCore, v -> v.innerJoin(SITE).on(LOC.site_cd.eq(SITE.site_cd)))
					.predicate(core, p -> p.cutoff$and(SITE.site_nm.like(bind("SITE_NM")))),

				// 項目表示（場所関連）
				when(boundOr("loc_flg","site_flg"))
					.view(aggr2, v -> v.leftOuterJoin(LOC2).on(T.pr("loc_cd").eq(LOC2.loc_cd))),
				when(boundOr("loc_flg"))
					.select(aggr,T.pr("loc_cd"))
					.groupBy(aggr,T.pr("loc_cd"))
					.select(aggr2,T.pr("loc_cd"),LOC2.loc_nm)
					.groupBy(aggr2,T.pr("loc_cd"),LOC2.loc_nm),
				when(boundOr("site_flg"))
					.view(aggr2, v -> v.leftOuterJoin(SITE2).on(LOC2.site_cd.eq(SITE2.site_cd)))
					.select(aggr2,LOC2.site_cd.as("site_cd"),SITE2.site_nm.as("site_nm"))
					.groupBy(aggr2,LOC2.site_cd,SITE2.site_nm),

				when(boundOr("str_ln_nm"))
					.view(chdCore, v -> v.innerJoin(STR_LN).on(S0T2.loc_cd.eq(STR_LN.loc_cd).and(S0T2.str_ln_cd.eq(STR_LN.str_ln_cd))))
					.predicate(core, p -> p.cutoff$and(STR_LN.str_ln_nm.like(bind("STR_LN_NM")))),
				when(boundOr("str_ln_flg"))
					.view(aggr2, v -> v.leftOuterJoin(STR_LN2).on(T.pr("loc_cd").eq(STR_LN2.loc_cd).and(T.pr("str_ln_cd").eq(STR_LN2.str_ln_cd))))
					.select(aggr,T.pr("str_ln_cd"))
					.groupBy(aggr,T.pr("str_ln_cd"))
					.select(aggr2,T.pr("str_ln_cd"),STR_LN2.str_ln_nm)
					.groupBy(aggr2,T.pr("str_ln_cd"),STR_LN2.str_ln_nm),
				when(boundOr("oper_nm"))
					.view(chdCore, v -> v.innerJoin(S0OPER).on(S0T2.oper_cd.eq(S0OPER.oper_cd)))
					.predicate(core, p -> p.cutoff$and(S0OPER.oper_nm.like(bind("oper_nm")))),
				when(null)
					.view(aggr2, v -> v.leftOuterJoin(OPER2).on(T.pr("oper_cd").eq(OPER2.oper_cd)))
					.select(aggr2,T.pr("oper_cd"),OPER2.oper_nm.as("oper_nm"))
					.groupBy(aggr2,T.pr("oper_cd"),OPER2.oper_nm),
				when(boundOr("oper_act_flg"))
					.select(aggr,T.pr("oper_seq"))
					.groupBy(aggr,T.pr("oper_seq"))
					.select(aggr2,T.pr("oper_seq"))
					.groupBy(aggr2,T.pr("oper_seq")),

				// 検索条件（取引先関連）
				when(boundOr("bp_nm", "cntry_cd", "cntry_nm", "area_cd",
						"area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3",
						"bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7",
						"bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1",
						"bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5",
						"bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9",
						"bp_grp_nm10"))
					.view(core, v -> v.innerJoin(BP).on(S0T.bp_cd.eq(BP.bp_cd))),
				when(boundOr("bp_nm"))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM")))),
				when(boundOr("cntry_cd"))
					.predicate(core, p -> p.cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD")))),
				when(boundOr("cntry_nm"))
					.view(core, v -> v.innerJoin(CNTRY).on(BP.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				when(boundOr("area_cd"))
					.predicate(core, p -> p.cutoff$and(BP.area_cd.like(bind("AREA_CD")))),
				when(boundOr("area_nm"))
					.view(core, v -> v.innerJoin(AREA).on(BP.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM")))),
				when(boundOr("bp_grp_cd1"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1")))),
				when(boundOr("bp_grp_cd2"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2")))),
				when(boundOr("bp_grp_cd3"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3")))),
				when(boundOr("bp_grp_cd4"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4")))),
				when(boundOr("bp_grp_cd5"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5")))),
				when(boundOr("bp_grp_cd6"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6")))),
				when(boundOr("bp_grp_cd7"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7")))),
				when(boundOr("bp_grp_cd8"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8")))),
				when(boundOr("bp_grp_cd9"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9")))),
				when(boundOr("bp_grp_cd10"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10")))),
				when(boundOr("bp_grp_nm1"))
					.view(core, v -> v.innerJoin(BP_GRP1).on(BP.bp_grp_cd1.eq(BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BP_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP1.bp_grp_nm.like(bind("BP_GRP_NM1")))),
				when(boundOr("bp_grp_nm2"))
					.view(core, v -> v.innerJoin(BP_GRP2).on(BP.bp_grp_cd2.eq(BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BP_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP2.bp_grp_nm.like(bind("BP_GRP_NM2")))),
				when(boundOr("bp_grp_nm3"))
					.view(core, v -> v.innerJoin(BP_GRP3).on(BP.bp_grp_cd3.eq(BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BP_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP3.bp_grp_nm.like(bind("BP_GRP_NM3")))),
				when(boundOr("bp_grp_nm4"))
					.view(core, v -> v.innerJoin(BP_GRP4).on(BP.bp_grp_cd4.eq(BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BP_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP4.bp_grp_nm.like(bind("BP_GRP_NM4")))),
				when(boundOr("bp_grp_nm5"))
					.view(core, v -> v.innerJoin(BP_GRP5).on(BP.bp_grp_cd5.eq(BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BP_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP5.bp_grp_nm.like(bind("BP_GRP_NM5")))),
				when(boundOr("bp_grp_nm6"))
					.view(core, v -> v.innerJoin(BP_GRP6).on(BP.bp_grp_cd6.eq(BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BP_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP6.bp_grp_nm.like(bind("BP_GRP_NM6")))),
				when(boundOr("bp_grp_nm7"))
					.view(core, v -> v.innerJoin(BP_GRP7).on(BP.bp_grp_cd7.eq(BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BP_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP7.bp_grp_nm.like(bind("BP_GRP_NM7")))),
				when(boundOr("bp_grp_nm8"))
					.view(core, v -> v.innerJoin(BP_GRP8).on(BP.bp_grp_cd8.eq(BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BP_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP8.bp_grp_nm.like(bind("BP_GRP_NM8")))),
				when(boundOr("bp_grp_nm9"))
					.view(core, v -> v.innerJoin(BP_GRP9).on(BP.bp_grp_cd9.eq(BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BP_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP9.bp_grp_nm.like(bind("BP_GRP_NM9")))),
				when(boundOr("bp_grp_nm10"))
					.view(core, v -> v.innerJoin(BP_GRP10).on(BP.bp_grp_cd10.eq(BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP10.bp_grp_nm.like(bind("BP_GRP_NM10")))),

				// 項目表示（取引先関連）
				when(boundOr("bp_flg", "cntry_flg", "area_flg", "bp_grp_flg1",
						"bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4",
						"bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7",
						"bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(aggr2, v -> v.leftOuterJoin(BP2).on(T.pr("bp_cd").eq(BP2.bp_cd)))
					.select(aggr,T.pr("bp_cd"))
					.groupBy(aggr,T.pr("bp_cd")),
				when(boundOr("bp_flg"))
					.select(aggr2,T.pr("bp_cd"),BP2.bp_nm)
					.groupBy(aggr2,T.pr("bp_cd"),BP2.bp_nm),
				when(boundOr("cntry_flg"))
					.view(aggr2, v -> v.leftOuterJoin(CNTRY2).on(BP2.cntry_cd.eq(CNTRY2.cntry_cd)))
					.select(aggr2,BP2.cntry_cd,CNTRY2.cntry_nm)
					.groupBy(aggr2,BP2.cntry_cd,CNTRY2.cntry_nm),
				when(boundOr("area_flg"))
					.view(aggr2, v -> v.leftOuterJoin(AREA2).on(BP2.area_cd.eq(AREA2.area_cd)))
					.select(aggr2,BP2.area_cd,AREA2.area_nm)
					.groupBy(aggr2,BP2.area_cd,AREA2.area_nm),
				when(boundOr("bp_grp_flg1"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP21).on(BP2.bp_grp_cd1.eq(BP_GRP21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BP_GRP21.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd1,BP_GRP21.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(aggr2,BP2.bp_grp_cd1,BP_GRP21.bp_grp_nm),
				when(boundOr("bp_grp_flg2"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP22).on(BP2.bp_grp_cd2.eq(BP_GRP22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BP_GRP22.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd2,BP_GRP22.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(aggr2,BP2.bp_grp_cd2,BP_GRP22.bp_grp_nm),
				when(boundOr("bp_grp_flg3"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP23).on(BP2.bp_grp_cd3.eq(BP_GRP23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BP_GRP23.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd3,BP_GRP23.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(aggr2,BP2.bp_grp_cd3,BP_GRP23.bp_grp_nm),
				when(boundOr("bp_grp_flg4"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP24).on(BP2.bp_grp_cd4.eq(BP_GRP24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BP_GRP24.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd4,BP_GRP24.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(aggr2,BP2.bp_grp_cd4,BP_GRP24.bp_grp_nm),
				when(boundOr("bp_grp_flg5"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP25).on(BP2.bp_grp_cd5.eq(BP_GRP25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BP_GRP25.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd5,BP_GRP25.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(aggr2,BP2.bp_grp_cd5,BP_GRP25.bp_grp_nm),
				when(boundOr("bp_grp_flg6"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP26).on(BP2.bp_grp_cd6.eq(BP_GRP26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BP_GRP26.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd6,BP_GRP26.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(aggr2,BP2.bp_grp_cd6,BP_GRP26.bp_grp_nm),
				when(boundOr("bp_grp_flg7"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP27).on(BP2.bp_grp_cd7.eq(BP_GRP27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BP_GRP27.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd7,BP_GRP27.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(aggr2,BP2.bp_grp_cd7,BP_GRP27.bp_grp_nm),
				when(boundOr("bp_grp_flg8"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP28).on(BP2.bp_grp_cd8.eq(BP_GRP28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BP_GRP28.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd8,BP_GRP28.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(aggr2,BP2.bp_grp_cd8,BP_GRP28.bp_grp_nm),
				when(boundOr("bp_grp_flg9"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP29).on(BP2.bp_grp_cd9.eq(BP_GRP29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BP_GRP29.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd9,BP_GRP29.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(aggr2,BP2.bp_grp_cd9,BP_GRP29.bp_grp_nm),
				when(boundOr("bp_grp_flg10"))
					.view(aggr2, v -> v.leftOuterJoin(BP_GRP210).on(BP2.bp_grp_cd10.eq(BP_GRP210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP210.bp_grp_typ))))
					.select(aggr2,BP2.bp_grp_cd10,BP_GRP210.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(aggr2,BP2.bp_grp_cd10,BP_GRP210.bp_grp_nm),

				when(boundOr("asst_typ_flg"))
					.select(aggr,T.pr("asst_typ"))
					.groupBy(aggr,T.pr("asst_typ"))
					.select(aggr2,T.pr("asst_typ"))
					.groupBy(aggr2,T.pr("asst_typ")),
				when(boundOr("po_no_flg"))
					.select(aggr,T.pr("po_no"))
					.groupBy(aggr,T.pr("po_no"))
					.select(aggr2,T.pr("po_no"))
					.groupBy(aggr2,T.pr("po_no")),
				when(boundOr("slo_no_flg"))
					.select(aggr,T.pr("slo_no"))
					.groupBy(aggr,T.pr("slo_no"))
					.select(aggr2,T.pr("slo_no"))
					.groupBy(aggr2,T.pr("slo_no")),
				when(boundOr("iv_no_flg"))
					.select(aggr,T.pr("iv_no"))
					.groupBy(aggr,T.pr("iv_no"))
					.select(aggr2,T.pr("iv_no"))
					.groupBy(aggr2,T.pr("iv_no")),
				when(boundOr("qty_flg"))
					.view(aggr2, v -> v.leftOuterJoin(S0UNIT).on(S2ITM.unit_cd.eq(S0UNIT.unit_cd)))
					.select(aggr2,S2ITM.unit_cd,S0UNIT.unit_nm,S2ITM.dec_place)
					.groupBy(aggr2,S2ITM.unit_cd,S0UNIT.unit_nm,S2ITM.dec_place),
				when(null)
					.select(aggr,nvl(sum(T.pr("mfg_inpt_cost")),value(0)).as("mfg_inpt_cost"))
					.select(aggr2,sum(T.pr("mfg_inpt_cost")).as("mfg_inpt_cost")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl"))
					.select(aggr2,sum(T.pr("ttl")).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var"))
					.select(aggr2,sum(T.pr("var")).as("var")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd"))
					.select(aggr2,sum(T.pr("fxd")).as("fxd")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000"))
					.select(aggr2,sum(T.pr("col_000")).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000"))
					.select(aggr2,sum(T.pr("col_000")).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("act_cost"),value(0))),value(0)).as("col_001"))
					.select(aggr2,sum(T.pr("col_001")).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_001"))
					.select(aggr2,sum(T.pr("col_001")).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002"))
					.select(aggr2,sum(T.pr("col_002")).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002"))
					.select(aggr2,sum(T.pr("col_002")).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("act_cost"),value(0))),value(0)).as("col_003"))
					.select(aggr2,sum(T.pr("col_003")).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_003"))
					.select(aggr2,sum(T.pr("col_003")).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004"))
					.select(aggr2,sum(T.pr("col_004")).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004"))
					.select(aggr2,sum(T.pr("col_004")).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("act_cost"),value(0))),value(0)).as("col_005"))
					.select(aggr2,sum(T.pr("col_005")).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_005"))
					.select(aggr2,sum(T.pr("col_005")).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006"))
					.select(aggr2,sum(T.pr("col_006")).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006"))
					.select(aggr2,sum(T.pr("col_006")).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("act_cost"),value(0))),value(0)).as("col_007"))
					.select(aggr2,sum(T.pr("col_007")).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_007"))
					.select(aggr2,sum(T.pr("col_007")).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008"))
					.select(aggr2,sum(T.pr("col_008")).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008"))
					.select(aggr2,sum(T.pr("col_008")).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("act_cost"),value(0))),value(0)).as("col_009"))
					.select(aggr2,sum(T.pr("col_009")).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_009"))
					.select(aggr2,sum(T.pr("col_009")).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010"))
					.select(aggr2,sum(T.pr("col_010")).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010"))
					.select(aggr2,sum(T.pr("col_010")).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("act_cost"),value(0))),value(0)).as("col_011"))
					.select(aggr2,sum(T.pr("col_011")).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_011"))
					.select(aggr2,sum(T.pr("col_011")).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012"))
					.select(aggr2,sum(T.pr("col_012")).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012"))
					.select(aggr2,sum(T.pr("col_012")).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("act_cost"),value(0))),value(0)).as("col_013"))
					.select(aggr2,sum(T.pr("col_013")).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_013"))
					.select(aggr2,sum(T.pr("col_013")).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014"))
					.select(aggr2,sum(T.pr("col_014")).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014"))
					.select(aggr2,sum(T.pr("col_014")).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("act_cost"),value(0))),value(0)).as("col_015"))
					.select(aggr2,sum(T.pr("col_015")).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_015"))
					.select(aggr2,sum(T.pr("col_015")).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016"))
					.select(aggr2,sum(T.pr("col_016")).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016"))
					.select(aggr2,sum(T.pr("col_016")).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("act_cost"),value(0))),value(0)).as("col_017"))
					.select(aggr2,sum(T.pr("col_017")).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_017"))
					.select(aggr2,sum(T.pr("col_017")).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018"))
					.select(aggr2,sum(T.pr("col_018")).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018"))
					.select(aggr2,sum(T.pr("col_018")).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("act_cost"),value(0))),value(0)).as("col_019"))
					.select(aggr2,sum(T.pr("col_019")).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_019"))
					.select(aggr2,sum(T.pr("col_019")).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020"))
					.select(aggr2,sum(T.pr("col_020")).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020"))
					.select(aggr2,sum(T.pr("col_020")).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("act_cost"),value(0))),value(0)).as("col_021"))
					.select(aggr2,sum(T.pr("col_021")).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_021"))
					.select(aggr2,sum(T.pr("col_021")).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022"))
					.select(aggr2,sum(T.pr("col_022")).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022"))
					.select(aggr2,sum(T.pr("col_022")).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("act_cost"),value(0))),value(0)).as("col_023"))
					.select(aggr2,sum(T.pr("col_023")).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_023"))
					.select(aggr2,sum(T.pr("col_023")).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024"))
					.select(aggr2,sum(T.pr("col_024")).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024"))
					.select(aggr2,sum(T.pr("col_024")).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("act_cost"),value(0))),value(0)).as("col_025"))
					.select(aggr2,sum(T.pr("col_025")).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_025"))
					.select(aggr2,sum(T.pr("col_025")).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026"))
					.select(aggr2,sum(T.pr("col_026")).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026"))
					.select(aggr2,sum(T.pr("col_026")).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("act_cost"),value(0))),value(0)).as("col_027"))
					.select(aggr2,sum(T.pr("col_027")).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_027"))
					.select(aggr2,sum(T.pr("col_027")).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028"))
					.select(aggr2,sum(T.pr("col_028")).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028"))
					.select(aggr2,sum(T.pr("col_028")).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("act_cost"),value(0))),value(0)).as("col_029"))
					.select(aggr2,sum(T.pr("col_029")).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_029"))
					.select(aggr2,sum(T.pr("col_029")).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030"))
					.select(aggr2,sum(T.pr("col_030")).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030"))
					.select(aggr2,sum(T.pr("col_030")).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("act_cost"),value(0))),value(0)).as("col_031"))
					.select(aggr2,sum(T.pr("col_031")).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_031"))
					.select(aggr2,sum(T.pr("col_031")).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032"))
					.select(aggr2,sum(T.pr("col_032")).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032"))
					.select(aggr2,sum(T.pr("col_032")).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("act_cost"),value(0))),value(0)).as("col_033"))
					.select(aggr2,sum(T.pr("col_033")).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_033"))
					.select(aggr2,sum(T.pr("col_033")).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034"))
					.select(aggr2,sum(T.pr("col_034")).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034"))
					.select(aggr2,sum(T.pr("col_034")).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("act_cost"),value(0))),value(0)).as("col_035"))
					.select(aggr2,sum(T.pr("col_035")).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_035"))
					.select(aggr2,sum(T.pr("col_035")).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036"))
					.select(aggr2,sum(T.pr("col_036")).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036"))
					.select(aggr2,sum(T.pr("col_036")).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("act_cost"),value(0))),value(0)).as("col_037"))
					.select(aggr2,sum(T.pr("col_037")).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_037"))
					.select(aggr2,sum(T.pr("col_037")).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038"))
					.select(aggr2,sum(T.pr("col_038")).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038"))
					.select(aggr2,sum(T.pr("col_038")).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("act_cost"),value(0))),value(0)).as("col_039"))
					.select(aggr2,sum(T.pr("col_039")).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_039"))
					.select(aggr2,sum(T.pr("col_039")).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040"))
					.select(aggr2,sum(T.pr("col_040")).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040"))
					.select(aggr2,sum(T.pr("col_040")).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("act_cost"),value(0))),value(0)).as("col_041"))
					.select(aggr2,sum(T.pr("col_041")).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_041"))
					.select(aggr2,sum(T.pr("col_041")).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042"))
					.select(aggr2,sum(T.pr("col_042")).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042"))
					.select(aggr2,sum(T.pr("col_042")).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("act_cost"),value(0))),value(0)).as("col_043"))
					.select(aggr2,sum(T.pr("col_043")).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_043"))
					.select(aggr2,sum(T.pr("col_043")).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044"))
					.select(aggr2,sum(T.pr("col_044")).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044"))
					.select(aggr2,sum(T.pr("col_044")).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("act_cost"),value(0))),value(0)).as("col_045"))
					.select(aggr2,sum(T.pr("col_045")).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_045"))
					.select(aggr2,sum(T.pr("col_045")).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046"))
					.select(aggr2,sum(T.pr("col_046")).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046"))
					.select(aggr2,sum(T.pr("col_046")).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("act_cost"),value(0))),value(0)).as("col_047"))
					.select(aggr2,sum(T.pr("col_047")).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_047"))
					.select(aggr2,sum(T.pr("col_047")).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048"))
					.select(aggr2,sum(T.pr("col_048")).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048"))
					.select(aggr2,sum(T.pr("col_048")).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("act_cost"),value(0))),value(0)).as("col_049"))
					.select(aggr2,sum(T.pr("col_049")).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_049"))
					.select(aggr2,sum(T.pr("col_049")).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050"))
					.select(aggr2,sum(T.pr("col_050")).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050"))
					.select(aggr2,sum(T.pr("col_050")).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("act_cost"),value(0))),value(0)).as("col_051"))
					.select(aggr2,sum(T.pr("col_051")).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_051"))
					.select(aggr2,sum(T.pr("col_051")).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052"))
					.select(aggr2,sum(T.pr("col_052")).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052"))
					.select(aggr2,sum(T.pr("col_052")).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("act_cost"),value(0))),value(0)).as("col_053"))
					.select(aggr2,sum(T.pr("col_053")).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_053"))
					.select(aggr2,sum(T.pr("col_053")).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054"))
					.select(aggr2,sum(T.pr("col_054")).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054"))
					.select(aggr2,sum(T.pr("col_054")).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("act_cost"),value(0))),value(0)).as("col_055"))
					.select(aggr2,sum(T.pr("col_055")).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_055"))
					.select(aggr2,sum(T.pr("col_055")).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056"))
					.select(aggr2,sum(T.pr("col_056")).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056"))
					.select(aggr2,sum(T.pr("col_056")).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("act_cost"),value(0))),value(0)).as("col_057"))
					.select(aggr2,sum(T.pr("col_057")).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_057"))
					.select(aggr2,sum(T.pr("col_057")).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058"))
					.select(aggr2,sum(T.pr("col_058")).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058"))
					.select(aggr2,sum(T.pr("col_058")).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("act_cost"),value(0))),value(0)).as("col_059"))
					.select(aggr2,sum(T.pr("col_059")).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_059"))
					.select(aggr2,sum(T.pr("col_059")).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060"))
					.select(aggr2,sum(T.pr("col_060")).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060"))
					.select(aggr2,sum(T.pr("col_060")).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("act_cost"),value(0))),value(0)).as("col_061"))
					.select(aggr2,sum(T.pr("col_061")).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_061"))
					.select(aggr2,sum(T.pr("col_061")).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062"))
					.select(aggr2,sum(T.pr("col_062")).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062"))
					.select(aggr2,sum(T.pr("col_062")).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("act_cost"),value(0))),value(0)).as("col_063"))
					.select(aggr2,sum(T.pr("col_063")).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_063"))
					.select(aggr2,sum(T.pr("col_063")).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064"))
					.select(aggr2,sum(T.pr("col_064")).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064"))
					.select(aggr2,sum(T.pr("col_064")).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("act_cost"),value(0))),value(0)).as("col_065"))
					.select(aggr2,sum(T.pr("col_065")).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_065"))
					.select(aggr2,sum(T.pr("col_065")).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066"))
					.select(aggr2,sum(T.pr("col_066")).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066"))
					.select(aggr2,sum(T.pr("col_066")).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("act_cost"),value(0))),value(0)).as("col_067"))
					.select(aggr2,sum(T.pr("col_067")).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_067"))
					.select(aggr2,sum(T.pr("col_067")).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068"))
					.select(aggr2,sum(T.pr("col_068")).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068"))
					.select(aggr2,sum(T.pr("col_068")).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("act_cost"),value(0))),value(0)).as("col_069"))
					.select(aggr2,sum(T.pr("col_069")).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_069"))
					.select(aggr2,sum(T.pr("col_069")).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070"))
					.select(aggr2,sum(T.pr("col_070")).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070"))
					.select(aggr2,sum(T.pr("col_070")).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("act_cost"),value(0))),value(0)).as("col_071"))
					.select(aggr2,sum(T.pr("col_071")).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_071"))
					.select(aggr2,sum(T.pr("col_071")).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072"))
					.select(aggr2,sum(T.pr("col_072")).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072"))
					.select(aggr2,sum(T.pr("col_072")).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("act_cost"),value(0))),value(0)).as("col_073"))
					.select(aggr2,sum(T.pr("col_073")).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_073"))
					.select(aggr2,sum(T.pr("col_073")).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074"))
					.select(aggr2,sum(T.pr("col_074")).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074"))
					.select(aggr2,sum(T.pr("col_074")).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("act_cost"),value(0))),value(0)).as("col_075"))
					.select(aggr2,sum(T.pr("col_075")).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_075"))
					.select(aggr2,sum(T.pr("col_075")).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076"))
					.select(aggr2,sum(T.pr("col_076")).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076"))
					.select(aggr2,sum(T.pr("col_076")).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("act_cost"),value(0))),value(0)).as("col_077"))
					.select(aggr2,sum(T.pr("col_077")).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_077"))
					.select(aggr2,sum(T.pr("col_077")).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078"))
					.select(aggr2,sum(T.pr("col_078")).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078"))
					.select(aggr2,sum(T.pr("col_078")).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("act_cost"),value(0))),value(0)).as("col_079"))
					.select(aggr2,sum(T.pr("col_079")).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_079"))
					.select(aggr2,sum(T.pr("col_079")).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080"))
					.select(aggr2,sum(T.pr("col_080")).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080"))
					.select(aggr2,sum(T.pr("col_080")).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("act_cost"),value(0))),value(0)).as("col_081"))
					.select(aggr2,sum(T.pr("col_081")).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_081"))
					.select(aggr2,sum(T.pr("col_081")).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082"))
					.select(aggr2,sum(T.pr("col_082")).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082"))
					.select(aggr2,sum(T.pr("col_082")).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("act_cost"),value(0))),value(0)).as("col_083"))
					.select(aggr2,sum(T.pr("col_083")).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_083"))
					.select(aggr2,sum(T.pr("col_083")).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084"))
					.select(aggr2,sum(T.pr("col_084")).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084"))
					.select(aggr2,sum(T.pr("col_084")).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("act_cost"),value(0))),value(0)).as("col_085"))
					.select(aggr2,sum(T.pr("col_085")).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_085"))
					.select(aggr2,sum(T.pr("col_085")).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086"))
					.select(aggr2,sum(T.pr("col_086")).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086"))
					.select(aggr2,sum(T.pr("col_086")).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("act_cost"),value(0))),value(0)).as("col_087"))
					.select(aggr2,sum(T.pr("col_087")).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_087"))
					.select(aggr2,sum(T.pr("col_087")).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088"))
					.select(aggr2,sum(T.pr("col_088")).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088"))
					.select(aggr2,sum(T.pr("col_088")).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("act_cost"),value(0))),value(0)).as("col_089"))
					.select(aggr2,sum(T.pr("col_089")).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_089"))
					.select(aggr2,sum(T.pr("col_089")).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090"))
					.select(aggr2,sum(T.pr("col_090")).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090"))
					.select(aggr2,sum(T.pr("col_090")).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("act_cost"),value(0))),value(0)).as("col_091"))
					.select(aggr2,sum(T.pr("col_091")).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_091"))
					.select(aggr2,sum(T.pr("col_091")).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092"))
					.select(aggr2,sum(T.pr("col_092")).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092"))
					.select(aggr2,sum(T.pr("col_092")).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("act_cost"),value(0))),value(0)).as("col_093"))
					.select(aggr2,sum(T.pr("col_093")).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_093"))
					.select(aggr2,sum(T.pr("col_093")).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094"))
					.select(aggr2,sum(T.pr("col_094")).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094"))
					.select(aggr2,sum(T.pr("col_094")).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("act_cost"),value(0))),value(0)).as("col_095"))
					.select(aggr2,sum(T.pr("col_095")).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_095"))
					.select(aggr2,sum(T.pr("col_095")).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096"))
					.select(aggr2,sum(T.pr("col_096")).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096"))
					.select(aggr2,sum(T.pr("col_096")).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("act_cost"),value(0))),value(0)).as("col_097"))
					.select(aggr2,sum(T.pr("col_097")).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_097"))
					.select(aggr2,sum(T.pr("col_097")).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098"))
					.select(aggr2,sum(T.pr("col_098")).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098"))
					.select(aggr2,sum(T.pr("col_098")).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("act_cost"),value(0))),value(0)).as("col_099"))
					.select(aggr2,sum(T.pr("col_099")).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_099"))
					.select(aggr2,sum(T.pr("col_099")).as("col_099"))
			);
	}
	
	/**
	 * -- MGBFL0070_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0070_MGT_ACC_TOP_S02() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_CALC_ITM_MFG_INST_R S1_T2 = MGT_CALC_ITM_MFG_INST_R.create("T2");
		MGT_ITM_MFG_INST_R S1_T3 = MGT_ITM_MFG_INST_R.create("T3");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MGT_ACC_COST_R S2_W = MGT_ACC_COST_R.create("W");
		MGT_ACC_INPT_R S3_W2 = MGT_ACC_INPT_R.create("W2");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0070_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.ym,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T.qty,
							S1_T3.qty.as("odr_qty")
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.itm_cd.eq(S1_T.itm_cd))
								.and(S1_T2.itm_sub1.eq(S1_T.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_T.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_T.itm_sub3))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_T.itm_mfg_inst_no))
								.and(S1_T2.mfg_act_no.eq(S1_T.mfg_act_no))
							)
							.leftOuterJoin(S1_T3).on(
								S1_T3.calc_ctg_cd.eq(S1_T2.calc_ctg_cd)
								.and(S1_T3.itm_cd.eq(S1_T2.itm_cd))
								.and(S1_T3.itm_sub1.eq(S1_T2.itm_sub1))
								.and(S1_T3.itm_sub2.eq(S1_T2.itm_sub2))
								.and(S1_T3.itm_sub3.eq(S1_T2.itm_sub3))
								.and(S1_T3.itm_mfg_inst_no.eq(S1_T2.itm_mfg_inst_no))
								.and(S1_T3.mfg_act_no.eq(S1_T2.mfg_act_no))
							)
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_T.itm_cd.eq(S1_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T.itm_cd.eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T.sno1.eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T.sno2.eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T.sno3.eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T.sno4.eq(S1_SUNDRY_ITM.sno4))
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W)
									.where(
										value(0).eq(value(0))
										.and(S2_W.calc_no.eq(S1_T.calc_no))
										.and(S2_W.calc_grp_cd.eq(S1_T.calc_grp_cd))
										.and(S2_W.top_rec_no.eq(S1_T.top_rec_no))
										.and(
											nvl(
												S2_W.expns_typ,
												value(MAC_EXPNS_TYP.PROD.value())
											).eq(value(MAC_EXPNS_TYP.PROD.value()))
										)
										.and(S2_W.act_cost.neq(value(0)))
										.cutoff$and(S2_W.loc_cd.like(bind("loc_cd")))
										.cutoff$and(S2_W.str_ln_cd.like(bind("str_ln_cd")))
										.cutoff$and(S2_W.oper_cd.like(bind("oper_cd")))
										.cutoff$and(S2_W.oper_act_no.like(bind("oper_act_no")))
										.cutoff$and(
											bind("no_oper_act_no_flg_str").eq(value(true))
											.and(S2_W.oper_act_no.isNull())
										)
										.cutoff$and(
											bind("inpt_cnd").eq(value(true))
											.and(
												exists(
													subQuery()
													.select(value("X"))
													.from(S3_W2)
													.where(
														value(0).eq(value(0))
														.and(S3_W2.calc_no.eq(S2_W.calc_no))
														.and(S3_W2.calc_grp_cd.eq(S2_W.calc_grp_cd))
														.and(S3_W2.inpt_rec_no.eq(S2_W.inpt_rec_no))
														.and(S3_W2.top_rec_no.eq(S2_W.top_rec_no))
														.and(S3_W2.lvl.eq(value(0)))
													)
												)
											)
										)
									)
								)
							)
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_po_no_flg_str").eq(value(true))
								.and(S1_T.po_no.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S1_T.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S1_T.iv_no.isNull())
							)
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
							.cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
							.cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
							.cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
							.cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
							.cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
							.cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
							.cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
							.cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
							.cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub1)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub2)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.qty)).as("qty")),
				when(null)
					.select(DS0D, max(S0_T.pr("odr_qty")).as("odr_qty"))
			);
	}
}