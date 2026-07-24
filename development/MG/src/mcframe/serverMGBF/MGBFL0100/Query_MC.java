package mcframe.serverMGBF.MGBFL0100;

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

import java.util.ArrayList;
import java.util.List;

public class Query_MC {
	
	/*
	 * MGBFL0100_MGT_ACC_TOP_S01
	 */
	static MCQueryPlan MGBFL0100_MGT_ACC_TOP_S01(String qtyDcsnTyp, String amtDcsnTyp) {
		MGT_ACC_TOP_R S0T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_SML_COST_R S0T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_CALC_ITM_MFG_INST_R S0T3 = MGT_CALC_ITM_MFG_INST_R.create("T3");
		MGT_ITM_MFG_INST_R S0T4 = MGT_ITM_MFG_INST_R.create("T4");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
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
		MAM_SITE_R SITE = MAM_SITE_R.create("SITE");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R OPER = MAM_OPER_R.create("OPER");
		MAM_AC_RSN_R AC_RSN = MAM_AC_RSN_R.create("AC_RSN");

		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");
		MCDynamicSQLID aggr2 = createDynamicSQLID("aggr2");

		return createQueryPlan()
			.setQuery(
					sql("MGBFL0100_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(
						addDynamicSelect(aggr2)
					)
					.from(
						subQuery().select(
							addDynamicSelect(aggr)
						)
						.from(
							subQuery().select(
									S0T1.calc_no,
									S0T1.calc_grp_cd,
									S0T1.top_rec_no,
									S0T1.qty,
									nvl(
										S0T1.std_upri,
										value(0)
									).as("std_upri"),
									S0T4.qty.as("odr_qty"),
									S0T2.expns_cd,
									S0EXPNS.var_typ,
									S0EXPNS.expns_grp_cd,
									S0ITM.unit_cd,
									S0UNIT.unit_nm,
									S0ITM.dec_place,
									sum(S0T2.act_cost).as("act_cost"),
									sum(S0T2.std_cost).as("std_cost"),
									addDynamicSelect(core)
								)
								.from(
									S0T1
									.leftOuterJoin(S0T2).on(
										S0T1.calc_no.eq(S0T2.calc_no)
										.and(S0T1.calc_grp_cd.eq(S0T2.calc_grp_cd))
										.and(S0T1.top_rec_no.eq(S0T2.top_rec_no))
									)
									.leftOuterJoin(S0T3).on(
										S0T1.calc_no.eq(S0T3.calc_no)
										.and(S0T1.calc_grp_cd.eq(S0T3.calc_grp_cd))
										.and(S0T1.itm_cd.eq(S0T3.itm_cd))
										.and(S0T1.itm_sub1.eq(S0T3.itm_sub1))
										.and(S0T1.itm_sub2.eq(S0T3.itm_sub2))
										.and(S0T1.itm_sub3.eq(S0T3.itm_sub3))
										.and(S0T1.itm_mfg_inst_no.eq(S0T3.itm_mfg_inst_no))
										.and(S0T1.mfg_act_no.eq(S0T3.mfg_act_no))
									)
									.leftOuterJoin(S0T4).on(
										S0T3.calc_ctg_cd.eq(S0T4.calc_ctg_cd)
										.and(S0T3.itm_cd.eq(S0T4.itm_cd))
										.and(S0T3.itm_sub1.eq(S0T4.itm_sub1))
										.and(S0T3.itm_sub2.eq(S0T4.itm_sub2))
										.and(S0T3.itm_sub3.eq(S0T4.itm_sub3))
										.and(S0T3.itm_mfg_inst_no.eq(S0T4.itm_mfg_inst_no))
										.and(S0T3.mfg_act_no.eq(S0T4.mfg_act_no))
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
									.leftOuterJoin(S0EXPNS).on(S0T2.expns_cd.eq(S0EXPNS.expns_cd))
									.addDynamicView(core)
								)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S0T1.calc_no.like(bind("calc_no")))
									.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(
										S0T1.calc_rec_typ.eq(bind("calc_rec_typ0"))
										.cutoff$or(S0T1.calc_rec_typ.eq(bind("calc_rec_typ1")))
										.cutoff$or(S0T1.calc_rec_typ.eq(bind("calc_rec_typ2")))
										.cutoff$or(S0T1.calc_rec_typ.eq(bind("calc_rec_typ3")))
										.cutoff$or(S0T1.calc_rec_typ.eq(bind("calc_rec_typ4")))
									)
									.and(
										nvl(
											S0T2.expns_typ,
											value(MAC_EXPNS_TYP.PROD.value())
										).in(
											value(MAC_EXPNS_TYP.PROD.value()),
											value(MAC_EXPNS_TYP.SPPL.value())
										)
									)
									.cutoff$and(S0T1.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
									.cutoff$and(S0ITM.itm_typ.like(bind("itm_typ")))
									.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
									.cutoff$and(S0ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
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
									.cutoff$and(S0T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
									.cutoff$and(S0T1.mfg_act_no.like(bind("mfg_act_no")))
									.cutoff$and(S0T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
									.cutoff$and(S0T1.ym.eq(bind("ym")))
									.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
									.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
									.cutoff$and(S0T1.sno1.like(bind("sno1")))
									.cutoff$and(S0T1.sno2.like(bind("sno2")))
									.cutoff$and(S0T1.sno3.like(bind("sno3")))
									.cutoff$and(S0T1.sno4.like(bind("sno4")))
									.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
									.cutoff$and(S0T1.bp_cd.like(bind("bp_cd")))
									.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
									.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
									.cutoff$and(S0T1.oper_cd.like(bind("oper_cd")))
									.cutoff$and(S0T1.ac_rsn_cd.like(bind("ac_rsn_cd")))
									.cutoff$and(S0T1.po_no.like(bind("po_no")))
									.cutoff$and(S0T1.slo_no.like(bind("slo_no")))
									.cutoff$and(S0T1.iv_no.like(bind("iv_no")))
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
									.cutoff$and(
										bind("no_ac_rsn_flg_str").eq(value(true))
										.and(S0T1.ac_rsn_cd.isNull())
									)
									.cutoff$and(
										bind("no_bp_flg_str").eq(value(true))
										.and(S0T1.bp_cd.isNull())
									)
									.cutoff$and(
										bind("no_po_no_flg_str").eq(value(true))
										.and(S0T1.po_no.isNull())
									)
									.cutoff$and(
										bind("no_slo_no_flg_str").eq(value(true))
										.and(S0T1.slo_no.isNull())
									)
									.cutoff$and(
										bind("no_iv_no_flg_str").eq(value(true))
										.and(S0T1.iv_no.isNull())
									)
									.addDynamicPredicate(core)
								)
								.groupBy(
									S0T1.calc_no,
									S0T1.calc_grp_cd,
									S0T1.top_rec_no,
									S0T1.qty,
									S0T1.std_upri,
									S0T4.qty,
									S0T2.expns_cd,
									S0EXPNS.var_typ,
									S0EXPNS.expns_grp_cd,
									S0ITM.unit_cd,
									S0UNIT.unit_nm,
									S0ITM.dec_place,
									addDynamicGroupBy(core)
								)
							.view(T)
						)
						.groupBy(
							addDynamicGroupBy(aggr)
						)
						.having(
							value(0).eq(value(0))
							.addDynamicPredicate(aggr)
						)
						.view(T)
					)
					.groupBy(
						addDynamicGroupBy(aggr2)
					)
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(aggr2)
					)
					.orderBy(
						addDynamicOrderBy()
					)
		)
			.setDynamicSQLInfo(
				createDynamicSQLInfo()
					.when(boundOr("wg_flg"))
					.select(core,S0T1.wg_cd.as("wg_cd"))
					.select(aggr,T.pr("wg_cd"))
					.select(aggr2,T.pr("wg_cd"))
					.groupBy(core,S0T1.wg_cd)
					.groupBy(aggr,T.pr("wg_cd"))
					.groupBy(aggr2,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("wg_flg"))
					.select(core,S0WG.wg_nm.as("wg_nm"))
					.select(aggr,T.pr("wg_nm"))
					.select(aggr2,T.pr("wg_nm"))
					.groupBy(core,S0WG.wg_nm)
					.groupBy(aggr,T.pr("wg_nm"))
					.groupBy(aggr2,T.pr("wg_nm"))
					.orderBy(T.pr("wg_nm").asc()),
				createDynamicSQLInfo()
					.when(null)
					.select(core,S0T1.ym.as("ym"))
					.select(aggr,T.pr("ym"))
					.select(aggr2,T.pr("ym"))
					.groupBy(core,S0T1.ym)
					.groupBy(aggr,T.pr("ym"))
					.groupBy(aggr2,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg"))
					.select(core,S0T1.mng_dpt_cd.as("mng_dpt_cd"))
					.select(aggr,T.pr("mng_dpt_cd"))
					.select(aggr2,T.pr("mng_dpt_cd"))
					.groupBy(core,S0T1.mng_dpt_cd)
					.groupBy(aggr,T.pr("mng_dpt_cd"))
					.groupBy(aggr2,T.pr("mng_dpt_cd"))
					.orderBy(T.pr("mng_dpt_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_typ_flg"))
					.select(core,S0ITM.itm_typ.as("itm_typ"))
					.select(aggr,T.pr("itm_typ"))
					.select(aggr2,T.pr("itm_typ"))
					.groupBy(core,S0ITM.itm_typ)
					.groupBy(aggr,T.pr("itm_typ"))
					.groupBy(aggr2,T.pr("itm_typ"))
					.orderBy(T.pr("itm_typ").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_typ_d_flg"))
					.select(core,S0ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.select(aggr,T.pr("itm_typ_d_cd"))
					.select(aggr2,T.pr("itm_typ_d_cd"))
					.groupBy(core,S0ITM.itm_typ_d_cd)
					.groupBy(aggr,T.pr("itm_typ_d_cd"))
					.groupBy(aggr2,T.pr("itm_typ_d_cd"))
					.orderBy(T.pr("itm_typ_d_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_jnl_flg"))
					.select(core,S0ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.select(aggr,T.pr("itm_jnl_cd"))
					.select(aggr2,T.pr("itm_jnl_cd"))
					.groupBy(core,S0ITM.itm_jnl_cd)
					.groupBy(aggr,T.pr("itm_jnl_cd"))
					.groupBy(aggr2,T.pr("itm_jnl_cd"))
					.orderBy(T.pr("itm_jnl_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_cd.as("itm_cd"))
					.select(aggr,T.pr("itm_cd"))
					.select(aggr2,T.pr("itm_cd"))
					.groupBy(core,S0T1.itm_cd)
					.groupBy(aggr,T.pr("itm_cd"))
					.groupBy(aggr2,T.pr("itm_cd"))
					.orderBy(T.pr("itm_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub1.as("itm_sub1"))
					.select(aggr,T.pr("itm_sub1"))
					.select(aggr2,T.pr("itm_sub1"))
					.groupBy(core,S0T1.itm_sub1)
					.groupBy(aggr,T.pr("itm_sub1"))
					.groupBy(aggr2,T.pr("itm_sub1"))
					.orderBy(T.pr("itm_sub1").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub2.as("itm_sub2"))
					.select(aggr,T.pr("itm_sub2"))
					.select(aggr2,T.pr("itm_sub2"))
					.groupBy(core,S0T1.itm_sub2)
					.groupBy(aggr,T.pr("itm_sub2"))
					.groupBy(aggr2,T.pr("itm_sub2"))
					.orderBy(T.pr("itm_sub2").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub3.as("itm_sub3"))
					.select(aggr,T.pr("itm_sub3"))
					.select(aggr2,T.pr("itm_sub3"))
					.groupBy(core,S0T1.itm_sub3)
					.groupBy(aggr,T.pr("itm_sub3"))
					.groupBy(aggr2,T.pr("itm_sub3"))
					.orderBy(T.pr("itm_sub3").asc()),
				createDynamicSQLInfo()
					.when(boundOr("lot_flg"))
					.select(core,S0T1.lot_no.as("lot_no"))
					.select(aggr,T.pr("lot_no"))
					.select(aggr2,T.pr("lot_no"))
					.groupBy(core,S0T1.lot_no)
					.groupBy(aggr,T.pr("lot_no"))
					.groupBy(aggr2,T.pr("lot_no"))
					.orderBy(T.pr("lot_no").asc()),
				createDynamicSQLInfo()
					.when(boundOr("sublot_flg"))
					.select(core,S0T1.sublot_no.as("sublot_no"))
					.select(aggr,T.pr("sublot_no"))
					.select(aggr2,T.pr("sublot_no"))
					.groupBy(core,S0T1.sublot_no)
					.groupBy(aggr,T.pr("sublot_no"))
					.groupBy(aggr2,T.pr("sublot_no"))
					.orderBy(T.pr("sublot_no").asc()),
				createDynamicSQLInfo()
					.when(boundOr("sno1_flg"))
					.select(core,S0T1.sno1.as("sno1"))
					.select(aggr,T.pr("sno1"))
					.select(aggr2,T.pr("sno1"))
					.groupBy(core,S0T1.sno1)
					.groupBy(aggr,T.pr("sno1"))
					.groupBy(aggr2,T.pr("sno1"))
					.orderBy(T.pr("sno1").asc()),
				createDynamicSQLInfo()
					.when(boundOr("sno2_flg"))
					.select(core,S0T1.sno2.as("sno2"))
					.select(aggr,T.pr("sno2"))
					.select(aggr2,T.pr("sno2"))
					.groupBy(core,S0T1.sno2)
					.groupBy(aggr,T.pr("sno2"))
					.groupBy(aggr2,T.pr("sno2"))
					.orderBy(T.pr("sno2").asc()),
				createDynamicSQLInfo()
					.when(boundOr("sno3_flg"))
					.select(core,S0T1.sno3.as("sno3"))
					.select(aggr,T.pr("sno3"))
					.select(aggr2,T.pr("sno3"))
					.groupBy(core,S0T1.sno3)
					.groupBy(aggr,T.pr("sno3"))
					.groupBy(aggr2,T.pr("sno3"))
					.orderBy(T.pr("sno3").asc()),
				createDynamicSQLInfo()
					.when(boundOr("sno4_flg"))
					.select(core,S0T1.sno4.as("sno4"))
					.select(aggr,T.pr("sno4"))
					.select(aggr2,T.pr("sno4"))
					.groupBy(core,S0T1.sno4)
					.groupBy(aggr,T.pr("sno4"))
					.groupBy(aggr2,T.pr("sno4"))
					.orderBy(T.pr("sno4").asc()),
				createDynamicSQLInfo()
					.when(boundOr("itm_mfg_inst_no_flg"))
					.select(core,S0T1.itm_mfg_inst_no.as("itm_mfg_inst_no"))
					.select(aggr,T.pr("itm_mfg_inst_no"))
					.select(aggr2,T.pr("itm_mfg_inst_no"))
					.groupBy(core,S0T1.itm_mfg_inst_no)
					.groupBy(aggr,T.pr("itm_mfg_inst_no"))
					.groupBy(aggr2,T.pr("itm_mfg_inst_no"))
					.orderBy(T.pr("itm_mfg_inst_no").asc()),
				createDynamicSQLInfo()
					.when(boundOr("mfg_act_no_flg"))
					.select(core,S0T1.mfg_act_no.as("mfg_act_no"))
					.select(aggr,T.pr("mfg_act_no"))
					.select(aggr2,T.pr("mfg_act_no"))
					.groupBy(core,S0T1.mfg_act_no)
					.groupBy(aggr,T.pr("mfg_act_no"))
					.groupBy(aggr2,T.pr("mfg_act_no"))
					.orderBy(T.pr("mfg_act_no").asc()),
				createDynamicSQLInfo()
					.when(boundOr("asst_typ_flg"))
					.select(core,S0T1.asst_typ.as("asst_typ"))
					.select(aggr,T.pr("asst_typ"))
					.select(aggr2,T.pr("asst_typ"))
					.groupBy(core,S0T1.asst_typ)
					.groupBy(aggr,T.pr("asst_typ"))
					.groupBy(aggr2,T.pr("asst_typ"))
					.orderBy(T.pr("asst_typ").asc()),
				createDynamicSQLInfo()
					.when(boundOr("asst_typ_flg"))
					.select(core,S0T1.repurc_obli_flg.as("repurc_obli_flg"))
					.select(aggr,T.pr("repurc_obli_flg"))
					.select(aggr2,T.pr("repurc_obli_flg"))
					.groupBy(core,S0T1.repurc_obli_flg)
					.groupBy(aggr,T.pr("repurc_obli_flg"))
					.groupBy(aggr2,T.pr("repurc_obli_flg")),
				createDynamicSQLInfo()
					.when(boundOr("site_flg"))
					.select(core,LOC.site_cd.as("site_cd"))
					.select(aggr,T.pr("site_cd"))
					.select(aggr2,T.pr("site_cd"))
					.groupBy(core,LOC.site_cd)
					.groupBy(aggr,T.pr("site_cd"))
					.groupBy(aggr2,T.pr("site_cd"))
					.orderBy(T.pr("site_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("loc_flg"))
					.select(core,S0T1.loc_cd.as("loc_cd"))
					.select(aggr,T.pr("loc_cd"))
					.select(aggr2,T.pr("loc_cd"))
					.groupBy(core,S0T1.loc_cd)
					.groupBy(aggr,T.pr("loc_cd"))
					.groupBy(aggr2,T.pr("loc_cd"))
					.orderBy(T.pr("loc_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("loc_flg","loc_nm","site_cd","site_nm","site_flg"))
					.view(core, v -> v.leftOuterJoin(LOC).on(S0T1.loc_cd.eq(LOC.loc_cd)))
					.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM"))).cutoff$and(LOC.site_cd.like(bind("SITE_CD")))),
				createDynamicSQLInfo()
					.when(boundOr("str_ln_flg"))
					.select(core,S0T1.str_ln_cd.as("str_ln_cd"))
					.select(aggr,T.pr("str_ln_cd"))
					.select(aggr2,T.pr("str_ln_cd"))
					.groupBy(core,S0T1.str_ln_cd)
					.groupBy(aggr,T.pr("str_ln_cd"))
					.groupBy(aggr2,T.pr("str_ln_cd"))
					.orderBy(T.pr("str_ln_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("bp_flg"))
					.select(core,S0T1.bp_cd.as("bp_cd"))
					.select(aggr,T.pr("bp_cd"))
					.select(aggr2,T.pr("bp_cd"))
					.groupBy(core,S0T1.bp_cd)
					.groupBy(aggr,T.pr("bp_cd"))
					.groupBy(aggr2,T.pr("bp_cd"))
					.orderBy(T.pr("bp_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("bp_flg","bp_nm","cntry_cd","cntry_nm","area_cd","area_nm","bp_grp_cd1","bp_grp_cd2","bp_grp_cd3","bp_grp_cd4","bp_grp_cd5","bp_grp_cd6","bp_grp_cd7","bp_grp_cd8","bp_grp_cd9","bp_grp_cd10","bp_grp_nm1","bp_grp_nm2","bp_grp_nm3","bp_grp_nm4","bp_grp_nm5","bp_grp_nm6","bp_grp_nm7","bp_grp_nm8","bp_grp_nm9","bp_grp_nm10","cntry_flg","area_flg","bp_grp_flg1","bp_grp_flg2","bp_grp_flg3","bp_grp_flg4","bp_grp_flg5","bp_grp_flg6","bp_grp_flg7","bp_grp_flg8","bp_grp_flg9","bp_grp_flg10"))
					.view(core, v -> v.leftOuterJoin(BP).on(S0T1.bp_cd.eq(BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM"))).cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD"))).cutoff$and(BP.area_cd.like(bind("AREA_CD"))).cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1"))).cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2"))).cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3"))).cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4"))).cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5"))).cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6"))).cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7"))).cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8"))).cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9"))).cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10")))),
				createDynamicSQLInfo()
					.when(boundOr("cntry_flg"))
					.select(core,BP.cntry_cd.as("cntry_cd"))
					.select(aggr,T.pr("cntry_cd"))
					.select(aggr2,T.pr("cntry_cd"))
					.groupBy(core,BP.cntry_cd)
					.groupBy(aggr,T.pr("cntry_cd"))
					.groupBy(aggr2,T.pr("cntry_cd"))
					.orderBy(T.pr("cntry_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("area_flg"))
					.select(core,BP.area_cd.as("area_cd"))
					.select(aggr,T.pr("area_cd"))
					.select(aggr2,T.pr("area_cd"))
					.groupBy(core,BP.area_cd)
					.groupBy(aggr,T.pr("area_cd"))
					.groupBy(aggr2,T.pr("area_cd"))
					.orderBy(T.pr("area_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("oper_flg"))
					.select(core,S0T1.oper_cd.as("oper_cd"))
					.select(aggr,T.pr("oper_cd"))
					.select(aggr2,T.pr("oper_cd"))
					.groupBy(core,S0T1.oper_cd)
					.groupBy(aggr,T.pr("oper_cd"))
					.groupBy(aggr2,T.pr("oper_cd"))
					.orderBy(T.pr("oper_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("ac_rsn_flg"))
					.select(core,S0T1.ac_rsn_cd.as("ac_rsn_cd"))
					.select(aggr,T.pr("ac_rsn_cd"))
					.select(aggr2,T.pr("ac_rsn_cd"))
					.groupBy(core,S0T1.ac_rsn_cd)
					.groupBy(aggr,T.pr("ac_rsn_cd"))
					.groupBy(aggr2,T.pr("ac_rsn_cd"))
					.orderBy(T.pr("ac_rsn_cd").asc()),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T1.calc_no.eq(ARG.calc_no).and(S0T1.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				createDynamicSQLInfo()
					.when(null)
					.select(core,S0T1.calc_rec_typ.as("calc_rec_typ"))
					.select(aggr,T.pr("calc_rec_typ"))
					.select(aggr2,T.pr("calc_rec_typ"))
					.groupBy(core,S0T1.calc_rec_typ)
					.groupBy(aggr,T.pr("calc_rec_typ"))
					.groupBy(aggr2,T.pr("calc_rec_typ")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg"))
					.select(core,MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.select(aggr,T.pr("mng_dpt_nm"))
					.select(aggr2,T.pr("mng_dpt_nm"))
					.groupBy(core,MNG_DPT.dpt_nm)
					.groupBy(aggr,T.pr("mng_dpt_nm"))
					.groupBy(aggr2,T.pr("mng_dpt_nm")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(MNG_DPT).on(S0T1.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(ARG.term.eq(MNG_DPT.term))))
					.predicate(core, p -> p.cutoff$and(MNG_DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm).as("itm_nm"))
					.select(aggr,T.pr("itm_nm"))
					.select(aggr2,T.pr("itm_nm"))
					.groupBy(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm))
					.groupBy(aggr,T.pr("itm_nm"))
					.groupBy(aggr2,T.pr("itm_nm")),
				createDynamicSQLInfo()
					.when(boundOr("itm_typ_d_flg"))
					.select(core,ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.select(aggr,T.pr("itm_typ_d_nm"))
					.select(aggr2,T.pr("itm_typ_d_nm"))
					.groupBy(core,ITM_TYP_D.itm_typ_d_nm)
					.groupBy(aggr,T.pr("itm_typ_d_nm"))
					.groupBy(aggr2,T.pr("itm_typ_d_nm")),
				createDynamicSQLInfo()
					.when(boundOr("itm_typ_d_flg","itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(S0ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(S0ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_jnl_flg"))
					.select(core,ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.select(aggr,T.pr("itm_jnl_nm"))
					.select(aggr2,T.pr("itm_jnl_nm"))
					.groupBy(core,ITM_JNL.itm_jnl_nm)
					.groupBy(aggr,T.pr("itm_jnl_nm"))
					.groupBy(aggr2,T.pr("itm_jnl_nm")),
				createDynamicSQLInfo()
					.when(boundOr("itm_jnl_flg","itm_jnl_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_JNL).on(S0ITM.itm_jnl_cd.eq(ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_JNL.itm_jnl_nm.like(bind("ITM_JNL_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg1"))
					.select(core,S0ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.select(aggr,T.pr("itm_grp_cd1"))
					.select(aggr2,T.pr("itm_grp_cd1"))
					.groupBy(core,S0ITM.itm_grp_cd1)
					.groupBy(aggr,T.pr("itm_grp_cd1"))
					.groupBy(aggr2,T.pr("itm_grp_cd1")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg1"))
					.select(core,ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.select(aggr,T.pr("itm_grp_nm1"))
					.select(aggr2,T.pr("itm_grp_nm1"))
					.groupBy(core,ITM_GRP1.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm1"))
					.groupBy(aggr2,T.pr("itm_grp_nm1")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg1","itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP1).on(S0ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg2"))
					.select(core,S0ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.select(aggr,T.pr("itm_grp_cd2"))
					.select(aggr2,T.pr("itm_grp_cd2"))
					.groupBy(core,S0ITM.itm_grp_cd2)
					.groupBy(aggr,T.pr("itm_grp_cd2"))
					.groupBy(aggr2,T.pr("itm_grp_cd2")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg2"))
					.select(core,ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.select(aggr,T.pr("itm_grp_nm2"))
					.select(aggr2,T.pr("itm_grp_nm2"))
					.groupBy(core,ITM_GRP2.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm2"))
					.groupBy(aggr2,T.pr("itm_grp_nm2")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg2","itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP2).on(S0ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg3"))
					.select(core,S0ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.select(aggr,T.pr("itm_grp_cd3"))
					.select(aggr2,T.pr("itm_grp_cd3"))
					.groupBy(core,S0ITM.itm_grp_cd3)
					.groupBy(aggr,T.pr("itm_grp_cd3"))
					.groupBy(aggr2,T.pr("itm_grp_cd3")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg3"))
					.select(core,ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.select(aggr,T.pr("itm_grp_nm3"))
					.select(aggr2,T.pr("itm_grp_nm3"))
					.groupBy(core,ITM_GRP3.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm3"))
					.groupBy(aggr2,T.pr("itm_grp_nm3")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg3","itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP3).on(S0ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg4"))
					.select(core,S0ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.select(aggr,T.pr("itm_grp_cd4"))
					.select(aggr2,T.pr("itm_grp_cd4"))
					.groupBy(core,S0ITM.itm_grp_cd4)
					.groupBy(aggr,T.pr("itm_grp_cd4"))
					.groupBy(aggr2,T.pr("itm_grp_cd4")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg4"))
					.select(core,ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.select(aggr,T.pr("itm_grp_nm4"))
					.select(aggr2,T.pr("itm_grp_nm4"))
					.groupBy(core,ITM_GRP4.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm4"))
					.groupBy(aggr2,T.pr("itm_grp_nm4")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg4","itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP4).on(S0ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg5"))
					.select(core,S0ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.select(aggr,T.pr("itm_grp_cd5"))
					.select(aggr2,T.pr("itm_grp_cd5"))
					.groupBy(core,S0ITM.itm_grp_cd5)
					.groupBy(aggr,T.pr("itm_grp_cd5"))
					.groupBy(aggr2,T.pr("itm_grp_cd5")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg5"))
					.select(core,ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.select(aggr,T.pr("itm_grp_nm5"))
					.select(aggr2,T.pr("itm_grp_nm5"))
					.groupBy(core,ITM_GRP5.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm5"))
					.groupBy(aggr2,T.pr("itm_grp_nm5")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg5","itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP5).on(S0ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg6"))
					.select(core,S0ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.select(aggr,T.pr("itm_grp_cd6"))
					.select(aggr2,T.pr("itm_grp_cd6"))
					.groupBy(core,S0ITM.itm_grp_cd6)
					.groupBy(aggr,T.pr("itm_grp_cd6"))
					.groupBy(aggr2,T.pr("itm_grp_cd6")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg6"))
					.select(core,ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.select(aggr,T.pr("itm_grp_nm6"))
					.select(aggr2,T.pr("itm_grp_nm6"))
					.groupBy(core,ITM_GRP6.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm6"))
					.groupBy(aggr2,T.pr("itm_grp_nm6")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg6","itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP6).on(S0ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg7"))
					.select(core,S0ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.select(aggr,T.pr("itm_grp_cd7"))
					.select(aggr2,T.pr("itm_grp_cd7"))
					.groupBy(core,S0ITM.itm_grp_cd7)
					.groupBy(aggr,T.pr("itm_grp_cd7"))
					.groupBy(aggr2,T.pr("itm_grp_cd7")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg7"))
					.select(core,ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.select(aggr,T.pr("itm_grp_nm7"))
					.select(aggr2,T.pr("itm_grp_nm7"))
					.groupBy(core,ITM_GRP7.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm7"))
					.groupBy(aggr2,T.pr("itm_grp_nm7")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg7","itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP7).on(S0ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg8"))
					.select(core,S0ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.select(aggr,T.pr("itm_grp_cd8"))
					.select(aggr2,T.pr("itm_grp_cd8"))
					.groupBy(core,S0ITM.itm_grp_cd8)
					.groupBy(aggr,T.pr("itm_grp_cd8"))
					.groupBy(aggr2,T.pr("itm_grp_cd8")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg8"))
					.select(core,ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.select(aggr,T.pr("itm_grp_nm8"))
					.select(aggr2,T.pr("itm_grp_nm8"))
					.groupBy(core,ITM_GRP8.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm8"))
					.groupBy(aggr2,T.pr("itm_grp_nm8")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg8","itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP8).on(S0ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg9"))
					.select(core,S0ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.select(aggr,T.pr("itm_grp_cd9"))
					.select(aggr2,T.pr("itm_grp_cd9"))
					.groupBy(core,S0ITM.itm_grp_cd9)
					.groupBy(aggr,T.pr("itm_grp_cd9"))
					.groupBy(aggr2,T.pr("itm_grp_cd9")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg9"))
					.select(core,ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.select(aggr,T.pr("itm_grp_nm9"))
					.select(aggr2,T.pr("itm_grp_nm9"))
					.groupBy(core,ITM_GRP9.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm9"))
					.groupBy(aggr2,T.pr("itm_grp_nm9")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg9","itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP9).on(S0ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg10"))
					.select(core,S0ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.select(aggr,T.pr("itm_grp_cd10"))
					.select(aggr2,T.pr("itm_grp_cd10"))
					.groupBy(core,S0ITM.itm_grp_cd10)
					.groupBy(aggr,T.pr("itm_grp_cd10"))
					.groupBy(aggr2,T.pr("itm_grp_cd10")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg10"))
					.select(core,ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.select(aggr,T.pr("itm_grp_nm10"))
					.select(aggr2,T.pr("itm_grp_nm10"))
					.groupBy(core,ITM_GRP10.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm10"))
					.groupBy(aggr2,T.pr("itm_grp_nm10")),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_flg10","itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP10).on(S0ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_flg"))
					.select(core,BP.bp_nm.as("bp_nm"))
					.select(aggr,T.pr("bp_nm"))
					.select(aggr2,T.pr("bp_nm"))
					.groupBy(core,BP.bp_nm)
					.groupBy(aggr,T.pr("bp_nm"))
					.groupBy(aggr2,T.pr("bp_nm")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg1"))
					.select(core,BP.bp_grp_cd1.as("bp_grp_cd1"))
					.select(aggr,T.pr("bp_grp_cd1"))
					.select(aggr2,T.pr("bp_grp_cd1"))
					.groupBy(core,BP.bp_grp_cd1)
					.groupBy(aggr,T.pr("bp_grp_cd1"))
					.groupBy(aggr2,T.pr("bp_grp_cd1")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg1"))
					.select(core,BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.select(aggr,T.pr("bp_grp_nm1"))
					.select(aggr2,T.pr("bp_grp_nm1"))
					.groupBy(core,BP_GRP1.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm1"))
					.groupBy(aggr2,T.pr("bp_grp_nm1")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg1","bp_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(BP_GRP1).on(BP.bp_grp_cd1.eq(BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BP_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP1.bp_grp_nm.like(bind("BP_GRP_NM1")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg2"))
					.select(core,BP.bp_grp_cd2.as("bp_grp_cd2"))
					.select(aggr,T.pr("bp_grp_cd2"))
					.select(aggr2,T.pr("bp_grp_cd2"))
					.groupBy(core,BP.bp_grp_cd2)
					.groupBy(aggr,T.pr("bp_grp_cd2"))
					.groupBy(aggr2,T.pr("bp_grp_cd2")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg2"))
					.select(core,BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.select(aggr,T.pr("bp_grp_nm2"))
					.select(aggr2,T.pr("bp_grp_nm2"))
					.groupBy(core,BP_GRP2.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm2"))
					.groupBy(aggr2,T.pr("bp_grp_nm2")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg2","bp_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(BP_GRP2).on(BP.bp_grp_cd2.eq(BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BP_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP2.bp_grp_nm.like(bind("BP_GRP_NM2")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg3"))
					.select(core,BP.bp_grp_cd3.as("bp_grp_cd3"))
					.select(aggr,T.pr("bp_grp_cd3"))
					.select(aggr2,T.pr("bp_grp_cd3"))
					.groupBy(core,BP.bp_grp_cd3)
					.groupBy(aggr,T.pr("bp_grp_cd3"))
					.groupBy(aggr2,T.pr("bp_grp_cd3")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg3"))
					.select(core,BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.select(aggr,T.pr("bp_grp_nm3"))
					.select(aggr2,T.pr("bp_grp_nm3"))
					.groupBy(core,BP_GRP3.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm3"))
					.groupBy(aggr2,T.pr("bp_grp_nm3")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg3","bp_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(BP_GRP3).on(BP.bp_grp_cd3.eq(BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BP_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP3.bp_grp_nm.like(bind("BP_GRP_NM3")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg4"))
					.select(core,BP.bp_grp_cd4.as("bp_grp_cd4"))
					.select(aggr,T.pr("bp_grp_cd4"))
					.select(aggr2,T.pr("bp_grp_cd4"))
					.groupBy(core,BP.bp_grp_cd4)
					.groupBy(aggr,T.pr("bp_grp_cd4"))
					.groupBy(aggr2,T.pr("bp_grp_cd4")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg4"))
					.select(core,BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.select(aggr,T.pr("bp_grp_nm4"))
					.select(aggr2,T.pr("bp_grp_nm4"))
					.groupBy(core,BP_GRP4.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm4"))
					.groupBy(aggr2,T.pr("bp_grp_nm4")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg4","bp_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(BP_GRP4).on(BP.bp_grp_cd4.eq(BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BP_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP4.bp_grp_nm.like(bind("BP_GRP_NM4")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg5"))
					.select(core,BP.bp_grp_cd5.as("bp_grp_cd5"))
					.select(aggr,T.pr("bp_grp_cd5"))
					.select(aggr2,T.pr("bp_grp_cd5"))
					.groupBy(core,BP.bp_grp_cd5)
					.groupBy(aggr,T.pr("bp_grp_cd5"))
					.groupBy(aggr2,T.pr("bp_grp_cd5")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg5"))
					.select(core,BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.select(aggr,T.pr("bp_grp_nm5"))
					.select(aggr2,T.pr("bp_grp_nm5"))
					.groupBy(core,BP_GRP5.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm5"))
					.groupBy(aggr2,T.pr("bp_grp_nm5")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg5","bp_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(BP_GRP5).on(BP.bp_grp_cd5.eq(BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BP_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP5.bp_grp_nm.like(bind("BP_GRP_NM5")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg6"))
					.select(core,BP.bp_grp_cd6.as("bp_grp_cd6"))
					.select(aggr,T.pr("bp_grp_cd6"))
					.select(aggr2,T.pr("bp_grp_cd6"))
					.groupBy(core,BP.bp_grp_cd6)
					.groupBy(aggr,T.pr("bp_grp_cd6"))
					.groupBy(aggr2,T.pr("bp_grp_cd6")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg6"))
					.select(core,BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.select(aggr,T.pr("bp_grp_nm6"))
					.select(aggr2,T.pr("bp_grp_nm6"))
					.groupBy(core,BP_GRP6.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm6"))
					.groupBy(aggr2,T.pr("bp_grp_nm6")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg6","bp_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(BP_GRP6).on(BP.bp_grp_cd6.eq(BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BP_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP6.bp_grp_nm.like(bind("BP_GRP_NM6")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg7"))
					.select(core,BP.bp_grp_cd7.as("bp_grp_cd7"))
					.select(aggr,T.pr("bp_grp_cd7"))
					.select(aggr2,T.pr("bp_grp_cd7"))
					.groupBy(core,BP.bp_grp_cd7)
					.groupBy(aggr,T.pr("bp_grp_cd7"))
					.groupBy(aggr2,T.pr("bp_grp_cd7")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg7"))
					.select(core,BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.select(aggr,T.pr("bp_grp_nm7"))
					.select(aggr2,T.pr("bp_grp_nm7"))
					.groupBy(core,BP_GRP7.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm7"))
					.groupBy(aggr2,T.pr("bp_grp_nm7")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg7","bp_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(BP_GRP7).on(BP.bp_grp_cd7.eq(BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BP_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP7.bp_grp_nm.like(bind("BP_GRP_NM7")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg8"))
					.select(core,BP.bp_grp_cd8.as("bp_grp_cd8"))
					.select(aggr,T.pr("bp_grp_cd8"))
					.select(aggr2,T.pr("bp_grp_cd8"))
					.groupBy(core,BP.bp_grp_cd8)
					.groupBy(aggr,T.pr("bp_grp_cd8"))
					.groupBy(aggr2,T.pr("bp_grp_cd8")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg8"))
					.select(core,BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.select(aggr,T.pr("bp_grp_nm8"))
					.select(aggr2,T.pr("bp_grp_nm8"))
					.groupBy(core,BP_GRP8.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm8"))
					.groupBy(aggr2,T.pr("bp_grp_nm8")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg8","bp_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(BP_GRP8).on(BP.bp_grp_cd8.eq(BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BP_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP8.bp_grp_nm.like(bind("BP_GRP_NM8")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg9"))
					.select(core,BP.bp_grp_cd9.as("bp_grp_cd9"))
					.select(aggr,T.pr("bp_grp_cd9"))
					.select(aggr2,T.pr("bp_grp_cd9"))
					.groupBy(core,BP.bp_grp_cd9)
					.groupBy(aggr,T.pr("bp_grp_cd9"))
					.groupBy(aggr2,T.pr("bp_grp_cd9")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg9"))
					.select(core,BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.select(aggr,T.pr("bp_grp_nm9"))
					.select(aggr2,T.pr("bp_grp_nm9"))
					.groupBy(core,BP_GRP9.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm9"))
					.groupBy(aggr2,T.pr("bp_grp_nm9")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg9","bp_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(BP_GRP9).on(BP.bp_grp_cd9.eq(BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BP_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP9.bp_grp_nm.like(bind("BP_GRP_NM9")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg10"))
					.select(core,BP.bp_grp_cd10.as("bp_grp_cd10"))
					.select(aggr,T.pr("bp_grp_cd10"))
					.select(aggr2,T.pr("bp_grp_cd10"))
					.groupBy(core,BP.bp_grp_cd10)
					.groupBy(aggr,T.pr("bp_grp_cd10"))
					.groupBy(aggr2,T.pr("bp_grp_cd10")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg10"))
					.select(core,BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.select(aggr,T.pr("bp_grp_nm10"))
					.select(aggr2,T.pr("bp_grp_nm10"))
					.groupBy(core,BP_GRP10.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm10"))
					.groupBy(aggr2,T.pr("bp_grp_nm10")),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_flg10","bp_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(BP_GRP10).on(BP.bp_grp_cd10.eq(BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP10.bp_grp_nm.like(bind("BP_GRP_NM10")))),
				createDynamicSQLInfo()
					.when(boundOr("cntry_flg"))
					.select(core,CNTRY.cntry_nm.as("cntry_nm"))
					.select(aggr,T.pr("cntry_nm"))
					.select(aggr2,T.pr("cntry_nm"))
					.groupBy(core,CNTRY.cntry_nm)
					.groupBy(aggr,T.pr("cntry_nm"))
					.groupBy(aggr2,T.pr("cntry_nm")),
				createDynamicSQLInfo()
					.when(boundOr("cntry_flg","cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CNTRY).on(BP.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("area_flg"))
					.select(core,AREA.area_nm.as("area_nm"))
					.select(aggr,T.pr("area_nm"))
					.select(aggr2,T.pr("area_nm"))
					.groupBy(core,AREA.area_nm)
					.groupBy(aggr,T.pr("area_nm"))
					.groupBy(aggr2,T.pr("area_nm")),
				createDynamicSQLInfo()
					.when(boundOr("area_flg","area_nm"))
					.view(core, v -> v.leftOuterJoin(AREA).on(BP.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("po_no_flg"))
					.select(core,S0T1.po_no.as("po_no"))
					.select(aggr,T.pr("po_no"))
					.select(aggr2,T.pr("po_no"))
					.groupBy(core,S0T1.po_no)
					.groupBy(aggr,T.pr("po_no"))
					.groupBy(aggr2,T.pr("po_no")),
				createDynamicSQLInfo()
					.when(boundOr("slo_no_flg"))
					.select(core,S0T1.slo_no.as("slo_no"))
					.select(aggr,T.pr("slo_no"))
					.select(aggr2,T.pr("slo_no"))
					.groupBy(core,S0T1.slo_no)
					.groupBy(aggr,T.pr("slo_no"))
					.groupBy(aggr2,T.pr("slo_no")),
				createDynamicSQLInfo()
					.when(boundOr("iv_no_flg"))
					.select(core,S0T1.iv_no.as("iv_no"))
					.select(aggr,T.pr("iv_no"))
					.select(aggr2,T.pr("iv_no"))
					.groupBy(core,S0T1.iv_no)
					.groupBy(aggr,T.pr("iv_no"))
					.groupBy(aggr2,T.pr("iv_no")),
				createDynamicSQLInfo()
					.when(boundOr("site_flg"))
					.select(core,SITE.site_nm.as("site_nm"))
					.select(aggr,T.pr("site_nm"))
					.select(aggr2,T.pr("site_nm"))
					.groupBy(core,SITE.site_nm)
					.groupBy(aggr,T.pr("site_nm"))
					.groupBy(aggr2,T.pr("site_nm")),
				createDynamicSQLInfo()
					.when(boundOr("site_flg","site_nm"))
					.view(core, v -> v.leftOuterJoin(SITE).on(LOC.site_cd.eq(SITE.site_cd)))
					.predicate(core, p -> p.cutoff$and(SITE.site_nm.like(bind("SITE_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("loc_flg"))
					.select(core,LOC.loc_nm.as("loc_nm"))
					.select(aggr,T.pr("loc_nm"))
					.select(aggr2,T.pr("loc_nm"))
					.groupBy(core,LOC.loc_nm)
					.groupBy(aggr,T.pr("loc_nm"))
					.groupBy(aggr2,T.pr("loc_nm")),
				createDynamicSQLInfo()
					.when(boundOr("str_ln_flg"))
					.select(core,STR_LN.str_ln_nm.as("str_ln_nm"))
					.select(aggr,T.pr("str_ln_nm"))
					.select(aggr2,T.pr("str_ln_nm"))
					.groupBy(core,STR_LN.str_ln_nm)
					.groupBy(aggr,T.pr("str_ln_nm"))
					.groupBy(aggr2,T.pr("str_ln_nm")),
				createDynamicSQLInfo()
					.when(boundOr("str_ln_flg","str_ln_nm"))
					.view(core, v -> v.leftOuterJoin(STR_LN).on(S0T1.str_ln_cd.eq(STR_LN.str_ln_cd).and(S0T1.loc_cd.eq(STR_LN.loc_cd))))
					.predicate(core, p -> p.cutoff$and(STR_LN.str_ln_nm.like(bind("STR_LN_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("oper_flg"))
					.select(core,OPER.oper_nm.as("oper_nm"))
					.select(aggr,T.pr("oper_nm"))
					.select(aggr2,T.pr("oper_nm"))
					.groupBy(core,OPER.oper_nm)
					.groupBy(aggr,T.pr("oper_nm"))
					.groupBy(aggr2,T.pr("oper_nm")),
				createDynamicSQLInfo()
					.when(boundOr("oper_flg","oper_nm"))
					.view(core, v -> v.leftOuterJoin(OPER).on(S0T1.oper_cd.eq(OPER.oper_cd)))
					.predicate(core, p -> p.cutoff$and(OPER.oper_nm.like(bind("OPER_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("ac_rsn_flg"))
					.select(core,AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
					.select(aggr,T.pr("ac_rsn_nm"))
					.select(aggr2,T.pr("ac_rsn_nm"))
					.groupBy(core,AC_RSN.ac_rsn_nm)
					.groupBy(aggr,T.pr("ac_rsn_nm"))
					.groupBy(aggr2,T.pr("ac_rsn_nm")),
				createDynamicSQLInfo()
					.when(boundOr("ac_rsn_flg","ac_rsn_nm"))
					.view(core, v -> v.leftOuterJoin(AC_RSN).on(S0T1.ac_rsn_cd.eq(AC_RSN.ac_rsn_cd)))
					.predicate(core, p -> p.cutoff$and(AC_RSN.ac_rsn_nm.like(bind("AC_RSN_NM")))),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("qty"))
					.select(aggr2,nvl(sum(T.pr("qty")),value(0)).as("qty"))
					.groupBy(aggr,T.pr("qty")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,max(T.pr("odr_qty")).as("odr_qty"))
					.select(aggr2,max(T.pr("odr_qty")).as("odr_qty")),
				createDynamicSQLInfo()
					.when(boundOr("qty_flg"))
					.select(aggr,T.pr("unit_cd"))
					.select(aggr2,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd"))
					.groupBy(aggr2,T.pr("unit_cd")),
				createDynamicSQLInfo()
					.when(boundOr("qty_flg"))
					.select(aggr,T.pr("unit_nm"))
					.select(aggr2,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm"))
					.groupBy(aggr2,T.pr("unit_nm")),
				createDynamicSQLInfo()
					.when(boundOr("qty_flg"))
					.select(aggr,max(T.pr("dec_place")).as("dec_place"))
					.select(aggr2,max(T.pr("dec_place")).as("dec_place")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("top_rec_no"))
					.groupBy(aggr,T.pr("top_rec_no")),
				createDynamicSQLInfo()
					.when(boundOr("itm_mfg_inst_no_flg"))
					.select(core,S0T1.per.as("per"))
					.select(aggr,T.pr("per"))
					.select(aggr2,T.pr("per"))
					.groupBy(core,S0T1.per)
					.groupBy(aggr,T.pr("per"))
					.groupBy(aggr2,T.pr("per")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,avg(T.pr("std_upri")).as("std_upri"))
					.select(aggr2,avg(T.pr("std_upri")).as("std_upri")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost"))
					.select(aggr2,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl"))
					.select(aggr2,nvl(sum(T.pr("ttl")),value(0)).as("ttl")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var_cost"))
					.select(aggr2,nvl(sum(T.pr("var_cost")),value(0)).as("var_cost")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd_cost"))
					.select(aggr2,nvl(sum(T.pr("fxd_cost")),value(0)).as("fxd_cost")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000"))
					.select(aggr2,nvl(sum(T.pr("col_000")),value(0)).as("col_000")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_000")),value(0)),value(0)).as("col_000")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002"))
					.select(aggr2,nvl(sum(T.pr("col_002")),value(0)).as("col_002")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_002")),value(0)),value(0)).as("col_002")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004"))
					.select(aggr2,nvl(sum(T.pr("col_004")),value(0)).as("col_004")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_004")),value(0)),value(0)).as("col_004")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006"))
					.select(aggr2,nvl(sum(T.pr("col_006")),value(0)).as("col_006")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_006")),value(0)),value(0)).as("col_006")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008"))
					.select(aggr2,nvl(sum(T.pr("col_008")),value(0)).as("col_008")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_008")),value(0)),value(0)).as("col_008")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010"))
					.select(aggr2,nvl(sum(T.pr("col_010")),value(0)).as("col_010")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_010")),value(0)),value(0)).as("col_010")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012"))
					.select(aggr2,nvl(sum(T.pr("col_012")),value(0)).as("col_012")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_012")),value(0)),value(0)).as("col_012")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014"))
					.select(aggr2,nvl(sum(T.pr("col_014")),value(0)).as("col_014")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_014")),value(0)),value(0)).as("col_014")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016"))
					.select(aggr2,nvl(sum(T.pr("col_016")),value(0)).as("col_016")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_016")),value(0)),value(0)).as("col_016")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018"))
					.select(aggr2,nvl(sum(T.pr("col_018")),value(0)).as("col_018")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_018")),value(0)),value(0)).as("col_018")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020"))
					.select(aggr2,nvl(sum(T.pr("col_020")),value(0)).as("col_020")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_020")),value(0)),value(0)).as("col_020")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022"))
					.select(aggr2,nvl(sum(T.pr("col_022")),value(0)).as("col_022")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_022")),value(0)),value(0)).as("col_022")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024"))
					.select(aggr2,nvl(sum(T.pr("col_024")),value(0)).as("col_024")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_024")),value(0)),value(0)).as("col_024")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026"))
					.select(aggr2,nvl(sum(T.pr("col_026")),value(0)).as("col_026")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_026")),value(0)),value(0)).as("col_026")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028"))
					.select(aggr2,nvl(sum(T.pr("col_028")),value(0)).as("col_028")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_028")),value(0)),value(0)).as("col_028")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030"))
					.select(aggr2,nvl(sum(T.pr("col_030")),value(0)).as("col_030")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_030")),value(0)),value(0)).as("col_030")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032"))
					.select(aggr2,nvl(sum(T.pr("col_032")),value(0)).as("col_032")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_032")),value(0)),value(0)).as("col_032")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034"))
					.select(aggr2,nvl(sum(T.pr("col_034")),value(0)).as("col_034")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_034")),value(0)),value(0)).as("col_034")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036"))
					.select(aggr2,nvl(sum(T.pr("col_036")),value(0)).as("col_036")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_036")),value(0)),value(0)).as("col_036")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038"))
					.select(aggr2,nvl(sum(T.pr("col_038")),value(0)).as("col_038")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_038")),value(0)),value(0)).as("col_038")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040"))
					.select(aggr2,nvl(sum(T.pr("col_040")),value(0)).as("col_040")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_040")),value(0)),value(0)).as("col_040")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042"))
					.select(aggr2,nvl(sum(T.pr("col_042")),value(0)).as("col_042")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_042")),value(0)),value(0)).as("col_042")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044"))
					.select(aggr2,nvl(sum(T.pr("col_044")),value(0)).as("col_044")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_044")),value(0)),value(0)).as("col_044")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046"))
					.select(aggr2,nvl(sum(T.pr("col_046")),value(0)).as("col_046")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_046")),value(0)),value(0)).as("col_046")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048"))
					.select(aggr2,nvl(sum(T.pr("col_048")),value(0)).as("col_048")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_048")),value(0)),value(0)).as("col_048")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050"))
					.select(aggr2,nvl(sum(T.pr("col_050")),value(0)).as("col_050")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_050")),value(0)),value(0)).as("col_050")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052"))
					.select(aggr2,nvl(sum(T.pr("col_052")),value(0)).as("col_052")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_052")),value(0)),value(0)).as("col_052")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054"))
					.select(aggr2,nvl(sum(T.pr("col_054")),value(0)).as("col_054")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_054")),value(0)),value(0)).as("col_054")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056"))
					.select(aggr2,nvl(sum(T.pr("col_056")),value(0)).as("col_056")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_056")),value(0)),value(0)).as("col_056")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058"))
					.select(aggr2,nvl(sum(T.pr("col_058")),value(0)).as("col_058")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_058")),value(0)),value(0)).as("col_058")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060"))
					.select(aggr2,nvl(sum(T.pr("col_060")),value(0)).as("col_060")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_060")),value(0)),value(0)).as("col_060")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062"))
					.select(aggr2,nvl(sum(T.pr("col_062")),value(0)).as("col_062")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_062")),value(0)),value(0)).as("col_062")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064"))
					.select(aggr2,nvl(sum(T.pr("col_064")),value(0)).as("col_064")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_064")),value(0)),value(0)).as("col_064")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066"))
					.select(aggr2,nvl(sum(T.pr("col_066")),value(0)).as("col_066")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_066")),value(0)),value(0)).as("col_066")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068"))
					.select(aggr2,nvl(sum(T.pr("col_068")),value(0)).as("col_068")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_068")),value(0)),value(0)).as("col_068")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070"))
					.select(aggr2,nvl(sum(T.pr("col_070")),value(0)).as("col_070")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_070")),value(0)),value(0)).as("col_070")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072"))
					.select(aggr2,nvl(sum(T.pr("col_072")),value(0)).as("col_072")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_072")),value(0)),value(0)).as("col_072")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074"))
					.select(aggr2,nvl(sum(T.pr("col_074")),value(0)).as("col_074")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_074")),value(0)),value(0)).as("col_074")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076"))
					.select(aggr2,nvl(sum(T.pr("col_076")),value(0)).as("col_076")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_076")),value(0)),value(0)).as("col_076")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078"))
					.select(aggr2,nvl(sum(T.pr("col_078")),value(0)).as("col_078")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_078")),value(0)),value(0)).as("col_078")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080"))
					.select(aggr2,nvl(sum(T.pr("col_080")),value(0)).as("col_080")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_080")),value(0)),value(0)).as("col_080")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082"))
					.select(aggr2,nvl(sum(T.pr("col_082")),value(0)).as("col_082")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_082")),value(0)),value(0)).as("col_082")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084"))
					.select(aggr2,nvl(sum(T.pr("col_084")),value(0)).as("col_084")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_084")),value(0)),value(0)).as("col_084")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086"))
					.select(aggr2,nvl(sum(T.pr("col_086")),value(0)).as("col_086")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_086")),value(0)),value(0)).as("col_086")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088"))
					.select(aggr2,nvl(sum(T.pr("col_088")),value(0)).as("col_088")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_088")),value(0)),value(0)).as("col_088")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090"))
					.select(aggr2,nvl(sum(T.pr("col_090")),value(0)).as("col_090")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_090")),value(0)),value(0)).as("col_090")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092"))
					.select(aggr2,nvl(sum(T.pr("col_092")),value(0)).as("col_092")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_092")),value(0)),value(0)).as("col_092")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094"))
					.select(aggr2,nvl(sum(T.pr("col_094")),value(0)).as("col_094")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_094")),value(0)),value(0)).as("col_094")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096"))
					.select(aggr2,nvl(sum(T.pr("col_096")),value(0)).as("col_096")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_096")),value(0)),value(0)).as("col_096")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098"))
					.select(aggr2,nvl(sum(T.pr("col_098")),value(0)).as("col_098")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_098")),value(0)),value(0)).as("col_098")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_100"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_100"),T.pr("act_cost"),value(0))),value(0)).as("col_100"))
					.select(aggr2,nvl(sum(T.pr("col_100")),value(0)).as("col_100")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_100"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_100"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_100"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_100")),value(0)),value(0)).as("col_100")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_102"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_102"),T.pr("act_cost"),value(0))),value(0)).as("col_102"))
					.select(aggr2,nvl(sum(T.pr("col_102")),value(0)).as("col_102")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_102"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_102"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_102"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_102")),value(0)),value(0)).as("col_102")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_104"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_104"),T.pr("act_cost"),value(0))),value(0)).as("col_104"))
					.select(aggr2,nvl(sum(T.pr("col_104")),value(0)).as("col_104")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_104"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_104"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_104"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_104")),value(0)),value(0)).as("col_104")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_106"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_106"),T.pr("act_cost"),value(0))),value(0)).as("col_106"))
					.select(aggr2,nvl(sum(T.pr("col_106")),value(0)).as("col_106")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_106"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_106"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_106"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_106")),value(0)),value(0)).as("col_106")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_108"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_108"),T.pr("act_cost"),value(0))),value(0)).as("col_108"))
					.select(aggr2,nvl(sum(T.pr("col_108")),value(0)).as("col_108")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_108"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_108"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_108"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_108")),value(0)),value(0)).as("col_108")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_110"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_110"),T.pr("act_cost"),value(0))),value(0)).as("col_110"))
					.select(aggr2,nvl(sum(T.pr("col_110")),value(0)).as("col_110")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_110"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_110"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_110"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_110")),value(0)),value(0)).as("col_110")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_112"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_112"),T.pr("act_cost"),value(0))),value(0)).as("col_112"))
					.select(aggr2,nvl(sum(T.pr("col_112")),value(0)).as("col_112")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_112"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_112"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_112"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_112")),value(0)),value(0)).as("col_112")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_114"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_114"),T.pr("act_cost"),value(0))),value(0)).as("col_114"))
					.select(aggr2,nvl(sum(T.pr("col_114")),value(0)).as("col_114")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_114"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_114"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_114"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_114")),value(0)),value(0)).as("col_114")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_116"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_116"),T.pr("act_cost"),value(0))),value(0)).as("col_116"))
					.select(aggr2,nvl(sum(T.pr("col_116")),value(0)).as("col_116")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_116"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_116"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_116"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_116")),value(0)),value(0)).as("col_116")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_118"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_118"),T.pr("act_cost"),value(0))),value(0)).as("col_118"))
					.select(aggr2,nvl(sum(T.pr("col_118")),value(0)).as("col_118")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_118"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_118"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_118"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_118")),value(0)),value(0)).as("col_118")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_120"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_120"),T.pr("act_cost"),value(0))),value(0)).as("col_120"))
					.select(aggr2,nvl(sum(T.pr("col_120")),value(0)).as("col_120")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_120"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_120"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_120"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_120")),value(0)),value(0)).as("col_120")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_122"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_122"),T.pr("act_cost"),value(0))),value(0)).as("col_122"))
					.select(aggr2,nvl(sum(T.pr("col_122")),value(0)).as("col_122")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_122"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_122"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_122"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_122")),value(0)),value(0)).as("col_122")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_124"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_124"),T.pr("act_cost"),value(0))),value(0)).as("col_124"))
					.select(aggr2,nvl(sum(T.pr("col_124")),value(0)).as("col_124")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_124"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_124"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_124"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_124")),value(0)),value(0)).as("col_124")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_126"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_126"),T.pr("act_cost"),value(0))),value(0)).as("col_126"))
					.select(aggr2,nvl(sum(T.pr("col_126")),value(0)).as("col_126")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_126"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_126"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_126"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_126")),value(0)),value(0)).as("col_126")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_128"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_128"),T.pr("act_cost"),value(0))),value(0)).as("col_128"))
					.select(aggr2,nvl(sum(T.pr("col_128")),value(0)).as("col_128")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_128"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_128"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_128"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_128")),value(0)),value(0)).as("col_128")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_130"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_130"),T.pr("act_cost"),value(0))),value(0)).as("col_130"))
					.select(aggr2,nvl(sum(T.pr("col_130")),value(0)).as("col_130")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_130"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_130"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_130"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_130")),value(0)),value(0)).as("col_130")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_132"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_132"),T.pr("act_cost"),value(0))),value(0)).as("col_132"))
					.select(aggr2,nvl(sum(T.pr("col_132")),value(0)).as("col_132")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_132"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_132"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_132"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_132")),value(0)),value(0)).as("col_132")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_134"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_134"),T.pr("act_cost"),value(0))),value(0)).as("col_134"))
					.select(aggr2,nvl(sum(T.pr("col_134")),value(0)).as("col_134")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_134"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_134"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_134"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_134")),value(0)),value(0)).as("col_134")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_136"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_136"),T.pr("act_cost"),value(0))),value(0)).as("col_136"))
					.select(aggr2,nvl(sum(T.pr("col_136")),value(0)).as("col_136")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_136"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_136"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_136"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_136")),value(0)),value(0)).as("col_136")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_138"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_138"),T.pr("act_cost"),value(0))),value(0)).as("col_138"))
					.select(aggr2,nvl(sum(T.pr("col_138")),value(0)).as("col_138")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_138"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_138"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_138"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_138")),value(0)),value(0)).as("col_138")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_140"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_140"),T.pr("act_cost"),value(0))),value(0)).as("col_140"))
					.select(aggr2,nvl(sum(T.pr("col_140")),value(0)).as("col_140")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_140"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_140"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_140"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_140")),value(0)),value(0)).as("col_140")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_142"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_142"),T.pr("act_cost"),value(0))),value(0)).as("col_142"))
					.select(aggr2,nvl(sum(T.pr("col_142")),value(0)).as("col_142")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_142"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_142"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_142"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_142")),value(0)),value(0)).as("col_142")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_144"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_144"),T.pr("act_cost"),value(0))),value(0)).as("col_144"))
					.select(aggr2,nvl(sum(T.pr("col_144")),value(0)).as("col_144")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_144"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_144"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_144"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_144")),value(0)),value(0)).as("col_144")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_146"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_146"),T.pr("act_cost"),value(0))),value(0)).as("col_146"))
					.select(aggr2,nvl(sum(T.pr("col_146")),value(0)).as("col_146")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_146"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_146"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_146"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_146")),value(0)),value(0)).as("col_146")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_148"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_148"),T.pr("act_cost"),value(0))),value(0)).as("col_148"))
					.select(aggr2,nvl(sum(T.pr("col_148")),value(0)).as("col_148")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_148"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_148"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_148"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_148")),value(0)),value(0)).as("col_148")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_150"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_150"),T.pr("act_cost"),value(0))),value(0)).as("col_150"))
					.select(aggr2,nvl(sum(T.pr("col_150")),value(0)).as("col_150")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_150"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_150"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_150"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_150")),value(0)),value(0)).as("col_150")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_152"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_152"),T.pr("act_cost"),value(0))),value(0)).as("col_152"))
					.select(aggr2,nvl(sum(T.pr("col_152")),value(0)).as("col_152")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_152"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_152"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_152"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_152")),value(0)),value(0)).as("col_152")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_154"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_154"),T.pr("act_cost"),value(0))),value(0)).as("col_154"))
					.select(aggr2,nvl(sum(T.pr("col_154")),value(0)).as("col_154")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_154"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_154"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_154"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_154")),value(0)),value(0)).as("col_154")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_156"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_156"),T.pr("act_cost"),value(0))),value(0)).as("col_156"))
					.select(aggr2,nvl(sum(T.pr("col_156")),value(0)).as("col_156")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_156"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_156"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_156"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_156")),value(0)),value(0)).as("col_156")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_158"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_158"),T.pr("act_cost"),value(0))),value(0)).as("col_158"))
					.select(aggr2,nvl(sum(T.pr("col_158")),value(0)).as("col_158")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_158"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_158"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_158"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_158")),value(0)),value(0)).as("col_158")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_160"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_160"),T.pr("act_cost"),value(0))),value(0)).as("col_160"))
					.select(aggr2,nvl(sum(T.pr("col_160")),value(0)).as("col_160")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_160"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_160"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_160"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_160")),value(0)),value(0)).as("col_160")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_162"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_162"),T.pr("act_cost"),value(0))),value(0)).as("col_162"))
					.select(aggr2,nvl(sum(T.pr("col_162")),value(0)).as("col_162")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_162"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_162"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_162"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_162")),value(0)),value(0)).as("col_162")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_164"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_164"),T.pr("act_cost"),value(0))),value(0)).as("col_164"))
					.select(aggr2,nvl(sum(T.pr("col_164")),value(0)).as("col_164")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_164"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_164"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_164"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_164")),value(0)),value(0)).as("col_164")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_166"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_166"),T.pr("act_cost"),value(0))),value(0)).as("col_166"))
					.select(aggr2,nvl(sum(T.pr("col_166")),value(0)).as("col_166")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_166"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_166"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_166"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_166")),value(0)),value(0)).as("col_166")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_168"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_168"),T.pr("act_cost"),value(0))),value(0)).as("col_168"))
					.select(aggr2,nvl(sum(T.pr("col_168")),value(0)).as("col_168")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_168"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_168"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_168"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_168")),value(0)),value(0)).as("col_168")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_170"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_170"),T.pr("act_cost"),value(0))),value(0)).as("col_170"))
					.select(aggr2,nvl(sum(T.pr("col_170")),value(0)).as("col_170")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_170"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_170"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_170"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_170")),value(0)),value(0)).as("col_170")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_172"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_172"),T.pr("act_cost"),value(0))),value(0)).as("col_172"))
					.select(aggr2,nvl(sum(T.pr("col_172")),value(0)).as("col_172")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_172"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_172"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_172"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_172")),value(0)),value(0)).as("col_172")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_174"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_174"),T.pr("act_cost"),value(0))),value(0)).as("col_174"))
					.select(aggr2,nvl(sum(T.pr("col_174")),value(0)).as("col_174")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_174"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_174"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_174"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_174")),value(0)),value(0)).as("col_174")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_176"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_176"),T.pr("act_cost"),value(0))),value(0)).as("col_176"))
					.select(aggr2,nvl(sum(T.pr("col_176")),value(0)).as("col_176")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_176"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_176"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_176"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_176")),value(0)),value(0)).as("col_176")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_178"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_178"),T.pr("act_cost"),value(0))),value(0)).as("col_178"))
					.select(aggr2,nvl(sum(T.pr("col_178")),value(0)).as("col_178")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_178"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_178"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_178"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_178")),value(0)),value(0)).as("col_178")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_180"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_180"),T.pr("act_cost"),value(0))),value(0)).as("col_180"))
					.select(aggr2,nvl(sum(T.pr("col_180")),value(0)).as("col_180")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_180"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_180"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_180"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_180")),value(0)),value(0)).as("col_180")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_182"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_182"),T.pr("act_cost"),value(0))),value(0)).as("col_182"))
					.select(aggr2,nvl(sum(T.pr("col_182")),value(0)).as("col_182")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_182"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_182"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_182"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_182")),value(0)),value(0)).as("col_182")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_184"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_184"),T.pr("act_cost"),value(0))),value(0)).as("col_184"))
					.select(aggr2,nvl(sum(T.pr("col_184")),value(0)).as("col_184")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_184"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_184"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_184"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_184")),value(0)),value(0)).as("col_184")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_186"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_186"),T.pr("act_cost"),value(0))),value(0)).as("col_186"))
					.select(aggr2,nvl(sum(T.pr("col_186")),value(0)).as("col_186")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_186"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_186"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_186"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_186")),value(0)),value(0)).as("col_186")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_188"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_188"),T.pr("act_cost"),value(0))),value(0)).as("col_188"))
					.select(aggr2,nvl(sum(T.pr("col_188")),value(0)).as("col_188")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_188"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_188"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_188"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_188")),value(0)),value(0)).as("col_188")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_190"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_190"),T.pr("act_cost"),value(0))),value(0)).as("col_190"))
					.select(aggr2,nvl(sum(T.pr("col_190")),value(0)).as("col_190")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_190"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_190"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_190"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_190")),value(0)),value(0)).as("col_190")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_192"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_192"),T.pr("act_cost"),value(0))),value(0)).as("col_192"))
					.select(aggr2,nvl(sum(T.pr("col_192")),value(0)).as("col_192")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_192"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_192"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_192"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_192")),value(0)),value(0)).as("col_192")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_194"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_194"),T.pr("act_cost"),value(0))),value(0)).as("col_194"))
					.select(aggr2,nvl(sum(T.pr("col_194")),value(0)).as("col_194")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_194"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_194"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_194"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_194")),value(0)),value(0)).as("col_194")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_196"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_196"),T.pr("act_cost"),value(0))),value(0)).as("col_196"))
					.select(aggr2,nvl(sum(T.pr("col_196")),value(0)).as("col_196")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_196"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_196"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_196"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_196")),value(0)),value(0)).as("col_196")),
				createDynamicSQLInfo()
					.when(boundOr("GRP_FLG_198"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_198"),T.pr("act_cost"),value(0))),value(0)).as("col_198"))
					.select(aggr2,nvl(sum(T.pr("col_198")),value(0)).as("col_198")),
				createDynamicSQLInfo()
					.when(boundOr("EXP_FLG_198"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_198"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_198"))
					.select(aggr2,nullIf(nvl(sum(T.pr("col_198")),value(0)),value(0)).as("col_198"))
					)
			.addDynamicSQLInfo(
					MGBFL0100_MGT_ACC_TOP_S01_HAVING(qtyDcsnTyp, amtDcsnTyp)
					);

	}

	static MCDynamicSQLInfo[] MGBFL0100_MGT_ACC_TOP_S01_HAVING(String qtyDcsnTyp, String amtDcsnTyp) {
		MCTempView T = createTempView("T");
		MCDynamicSQLID aggr2 = createDynamicSQLID("aggr2");
		List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();

		if (MGC_QTY_DCSN_TYP.isONLY_ZERO(qtyDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("qty")), value(0)).eq(value(0)))));
		}
		else if (MGC_QTY_DCSN_TYP.isLESS_ZERO(qtyDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("qty")), value(0)).lte(value(0)))));
		}
		else if (MGC_QTY_DCSN_TYP.isUNDR_ZERO(qtyDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("qty")), value(0)).lt(value(0)))));
		}

		if (MGC_AMT_DCSN_TYP.isONLY_ZERO(amtDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("ttl")), value(0)).eq(value(0)))));
		}
		else if (MGC_AMT_DCSN_TYP.isLESS_ZERO(amtDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("ttl")), value(0)).lte(value(0)))));
		}
		else if (MGC_AMT_DCSN_TYP.isUNDR_ZERO(amtDcsnTyp)) {
			l.add(createDynamicSQLInfo()
					.when(null)
					.predicate(aggr2, p->p.and(nvl(sum(T.pr("ttl")), value(0)).lt(value(0)))));
		}

		return l.toArray(new MCDynamicSQLInfo[0]);
	}
	
	/**
	 * -- MGBFL0100_MGT_STK_LOSS_Query_S01
	 */
	static MCQueryPlan MGBFL0100_MGT_STK_LOSS_S01() {
		MGT_STK_LOSS_R S0T1 = MGT_STK_LOSS_R.create("T1");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MGT_ARG_R ARG = MGT_ARG_R.create("ARG");
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

		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0100_MGT_STK_LOSS_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
						.select(
							S0T1.ym,
							S0T1.amt,
							addDynamicSelect(core)
						)
						.from(
							S0T1
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
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T1.calc_no.like(bind("calc_no")))
							.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S0T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S0ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
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
							.cutoff$and(S0T1.ym.eq(bind("ym")))
							.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T1.sno1.like(bind("sno1")))
							.cutoff$and(S0T1.sno2.like(bind("sno2")))
							.cutoff$and(S0T1.sno3.like(bind("sno3")))
							.cutoff$and(S0T1.sno4.like(bind("sno4")))
							.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S0T1.sppl_cd.like(bind("bp_cd")))
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
							.cutoff$and(
								bind("asst_typ_cnd").eq(value(true))
								.and(
									S0T1.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S0T1.sppl_cd.isNull())
							)
							.addDynamicPredicate(core)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
				.having(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr)
				)
		)
			.setDynamicSQLInfo(
				createDynamicSQLInfo()
					.when(boundOr("wg_flg"))
					.select(core,S0T1.wg_cd.as("wg_cd"))
					.select(aggr,T.pr("wg_cd"))
					.groupBy(core,S0T1.wg_cd)
					.groupBy(aggr,T.pr("wg_cd")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg"))
					.select(core,S0T1.mng_dpt_cd.as("mng_dpt_cd"))
					.select(aggr,T.pr("mng_dpt_cd"))
					.groupBy(core,S0T1.mng_dpt_cd)
					.groupBy(aggr,T.pr("mng_dpt_cd")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg"))
					.select(core,MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.select(aggr,T.pr("mng_dpt_nm"))
					.groupBy(core,MNG_DPT.dpt_nm)
					.groupBy(aggr,T.pr("mng_dpt_nm")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T1.calc_no.eq(ARG.calc_no).and(S0T1.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(MNG_DPT).on(S0T1.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(ARG.term.eq(MNG_DPT.term))))
					.predicate(core, p -> p.cutoff$and(MNG_DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_cd.as("itm_cd"))
					.select(aggr,T.pr("itm_cd"))
					.groupBy(core,S0T1.itm_cd)
					.groupBy(aggr,T.pr("itm_cd")),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub1.as("itm_sub1"))
					.select(aggr,T.pr("itm_sub1"))
					.groupBy(core,S0T1.itm_sub1)
					.groupBy(aggr,T.pr("itm_sub1")),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub2.as("itm_sub2"))
					.select(aggr,T.pr("itm_sub2"))
					.groupBy(core,S0T1.itm_sub2)
					.groupBy(aggr,T.pr("itm_sub2")),
				createDynamicSQLInfo()
					.when(boundOr("itm_flg"))
					.select(core,S0T1.itm_sub3.as("itm_sub3"))
					.select(aggr,T.pr("itm_sub3"))
					.groupBy(core,S0T1.itm_sub3)
					.groupBy(aggr,T.pr("itm_sub3")),
				createDynamicSQLInfo()
					.when(boundOr("lot_flg"))
					.select(core,S0T1.lot_no.as("lot_no"))
					.select(aggr,T.pr("lot_no"))
					.groupBy(core,S0T1.lot_no)
					.groupBy(aggr,T.pr("lot_no")),
				createDynamicSQLInfo()
					.when(boundOr("sublot_flg"))
					.select(core,S0T1.sublot_no.as("sublot_no"))
					.select(aggr,T.pr("sublot_no"))
					.groupBy(core,S0T1.sublot_no)
					.groupBy(aggr,T.pr("sublot_no")),
				createDynamicSQLInfo()
					.when(boundOr("sno1_flg"))
					.select(core,S0T1.sno1.as("sno1"))
					.select(aggr,T.pr("sno1"))
					.groupBy(core,S0T1.sno1)
					.groupBy(aggr,T.pr("sno1")),
				createDynamicSQLInfo()
					.when(boundOr("sno2_flg"))
					.select(core,S0T1.sno2.as("sno2"))
					.select(aggr,T.pr("sno2"))
					.groupBy(core,S0T1.sno2)
					.groupBy(aggr,T.pr("sno2")),
				createDynamicSQLInfo()
					.when(boundOr("sno3_flg"))
					.select(core,S0T1.sno3.as("sno3"))
					.select(aggr,T.pr("sno3"))
					.groupBy(core,S0T1.sno3)
					.groupBy(aggr,T.pr("sno3")),
				createDynamicSQLInfo()
					.when(boundOr("sno4_flg"))
					.select(core,S0T1.sno4.as("sno4"))
					.select(aggr,T.pr("sno4"))
					.groupBy(core,S0T1.sno4)
					.groupBy(aggr,T.pr("sno4")),
				createDynamicSQLInfo()
					.when(boundOr("bp_flg"))
					.select(core,S0T1.sppl_cd.as("bp_cd"))
					.select(aggr,T.pr("bp_cd"))
					.groupBy(core,S0T1.sppl_cd)
					.groupBy(aggr,T.pr("bp_cd")),
				createDynamicSQLInfo()
					.when(boundOr("bp_flg","bp_nm","cntry_cd","cntry_nm","area_cd","area_nm","bp_grp_cd1","bp_grp_cd2","bp_grp_cd3","bp_grp_cd4","bp_grp_cd5","bp_grp_cd6","bp_grp_cd7","bp_grp_cd8","bp_grp_cd9","bp_grp_cd10","bp_grp_nm1","bp_grp_nm2","bp_grp_nm3","bp_grp_nm4","bp_grp_nm5","bp_grp_nm6","bp_grp_nm7","bp_grp_nm8","bp_grp_nm9","bp_grp_nm10","cntry_flg","area_flg","bp_grp_flg1","bp_grp_flg2","bp_grp_flg3","bp_grp_flg4","bp_grp_flg5","bp_grp_flg6","bp_grp_flg7","bp_grp_flg8","bp_grp_flg9","bp_grp_flg10"))
					.view(core, v -> v.leftOuterJoin(BP).on(S0T1.sppl_cd.eq(BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM"))).cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD"))).cutoff$and(BP.area_cd.like(bind("AREA_CD"))).cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1"))).cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2"))).cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3"))).cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4"))).cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5"))).cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6"))).cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7"))).cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8"))).cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9"))).cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10")))),
				createDynamicSQLInfo()
					.when(boundOr("asst_typ_flg"))
					.select(core,S0T1.asst_typ.as("asst_typ"))
					.select(aggr,T.pr("asst_typ"))
					.groupBy(core,S0T1.asst_typ)
					.groupBy(aggr,T.pr("asst_typ")),
				createDynamicSQLInfo()
					.when(boundOr("qty_flg"))
					.select(core,S0ITM.unit_cd.as("unit_cd"))
					.select(aggr,T.pr("unit_cd"))
					.groupBy(core,S0ITM.unit_cd)
					.groupBy(aggr,T.pr("unit_cd")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,nvl(sum(T.pr("amt")),value(0)).as("amt")),
				createDynamicSQLInfo()
					.when(boundOr("itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(S0ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(S0ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_jnl_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_JNL).on(S0ITM.itm_jnl_cd.eq(ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_JNL.itm_jnl_nm.like(bind("ITM_JNL_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP1).on(S0ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP2).on(S0ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP3).on(S0ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP4).on(S0ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP5).on(S0ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP6).on(S0ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP7).on(S0ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP8).on(S0ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP9).on(S0ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP10).on(S0ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(BP_GRP1).on(BP.bp_grp_cd1.eq(BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BP_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP1.bp_grp_nm.like(bind("BP_GRP_NM1")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(BP_GRP2).on(BP.bp_grp_cd2.eq(BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BP_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP2.bp_grp_nm.like(bind("BP_GRP_NM2")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(BP_GRP3).on(BP.bp_grp_cd3.eq(BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BP_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP3.bp_grp_nm.like(bind("BP_GRP_NM3")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(BP_GRP4).on(BP.bp_grp_cd4.eq(BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BP_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP4.bp_grp_nm.like(bind("BP_GRP_NM4")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(BP_GRP5).on(BP.bp_grp_cd5.eq(BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BP_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP5.bp_grp_nm.like(bind("BP_GRP_NM5")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(BP_GRP6).on(BP.bp_grp_cd6.eq(BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BP_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP6.bp_grp_nm.like(bind("BP_GRP_NM6")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(BP_GRP7).on(BP.bp_grp_cd7.eq(BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BP_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP7.bp_grp_nm.like(bind("BP_GRP_NM7")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(BP_GRP8).on(BP.bp_grp_cd8.eq(BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BP_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP8.bp_grp_nm.like(bind("BP_GRP_NM8")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(BP_GRP9).on(BP.bp_grp_cd9.eq(BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BP_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP9.bp_grp_nm.like(bind("BP_GRP_NM9")))),
				createDynamicSQLInfo()
					.when(boundOr("bp_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(BP_GRP10).on(BP.bp_grp_cd10.eq(BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP10.bp_grp_nm.like(bind("BP_GRP_NM10")))),
				createDynamicSQLInfo()
					.when(boundOr("cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CNTRY).on(BP.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("area_nm"))
					.view(core, v -> v.leftOuterJoin(AREA).on(BP.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM"))))
				);
	}
}