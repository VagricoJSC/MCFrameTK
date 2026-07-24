package mcframe.serverMGBA.MGBAL0130;

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
	 * -- MGBAL0130_MGT_PLN_ITM_WK_Query_S01
	 */
	static MCQueryPlan MGBAL0130_MGT_PLN_ITM_WK_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_PLN_ITM_WK_R S1_T = MGT_PLN_ITM_WK_R.create("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_ITM_GRP_R S1_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S1_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S1_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S1_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S1_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S1_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S1_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S1_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S1_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S1_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MGT_ACT_INST_WK_R S2_T = MGT_ACT_INST_WK_R.create("T");
		MGT_INST_OPER_R S2_T2 = MGT_INST_OPER_R.create("T2");
		MGT_ITM_MFG_INST_R S2_T3 = MGT_ITM_MFG_INST_R.create("T3");
		MAVM_RD_WG_R S2_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S2_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S2_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_OPER_R S2_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S2_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S2_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S2_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_ITM_GRP_R S2_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S2_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S2_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S2_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S2_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S2_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S2_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S2_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S2_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S2_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0130_MGT_PLN_ITM_WK_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.mng_dpt_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.oper_cd,
							S1_T.wk_cost_cd,
							S1_WK_COST.wk_cost_nm,
							S1_WK_COST.dec_place,
							S1_WK_COST.wk_cost_unit_nm,
							S1_T.wk_cost.as("pln_wk_cost"),
							value((MCNumber) null).as("act_wk_cost"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_DAC).on(S1_T.wg_cd.eq(S1_DAC.wg_cd))
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
							.innerJoin(S1_TERM).on(
								S1_T.ym.gte(S1_TERM.term)
								.and(S1_T.ym.lt(S1_TERM.term_end_ym))
							)
							.leftOuterJoin(S1_MNG_DPT).on(
								S1_TERM.term.eq(S1_MNG_DPT.term)
								.and(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd))
							)
							.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd))
							.leftOuterJoin(S1_WK_COST).on(S1_T.wk_cost_cd.eq(S1_WK_COST.wk_cost_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")))
							.and(S1_T.ym.gte(bind("ym_fr")))
							.and(S1_T.ym.lt(bind("ym_to")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.wk_cost_cd.like(bind("wk_cost_cd")))
							.cutoff$and(S1_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
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
							.addDynamicPredicate(DS1D)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T3.mng_dpt_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T3.lot_no,
								S2_T3.sublot_no,
								S2_T3.sno1,
								S2_T3.sno2,
								S2_T3.sno3,
								S2_T3.sno4,
								S2_T.loc_cd,
								S2_T.str_ln_cd,
								S2_T2.oper_cd,
								S2_T.wk_cost_cd,
								S2_WK_COST.wk_cost_nm,
								S2_WK_COST.dec_place,
								S2_WK_COST.wk_cost_unit_nm,
								value((MCNumber) null).as("pln_wk_cost"),
								S2_T.wk_cost.as("act_wk_cost"),
								addDynamicSelect(DS2D)
							)
							.from(
								S2_T
								.leftOuterJoin(S2_T2).on(
									S2_T.calc_ctg_cd.eq(S2_T2.calc_ctg_cd)
									.and(S2_T.itm_cd.eq(S2_T2.itm_cd))
									.and(S2_T.itm_sub1.eq(S2_T2.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_T2.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_T2.itm_sub3))
									.and(S2_T.itm_mfg_inst_no.eq(S2_T2.itm_mfg_inst_no))
									.and(S2_T.mfg_act_no.eq(S2_T2.mfg_act_no))
									.and(S2_T.oper_act_no.eq(S2_T2.oper_act_no))
								)
								.leftOuterJoin(S2_T3).on(
									S2_T.calc_ctg_cd.eq(S2_T3.calc_ctg_cd)
									.and(S2_T.itm_cd.eq(S2_T3.itm_cd))
									.and(S2_T.itm_sub1.eq(S2_T3.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_T3.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_T3.itm_sub3))
									.and(S2_T.itm_mfg_inst_no.eq(S2_T3.itm_mfg_inst_no))
									.and(S2_T.mfg_act_no.eq(S2_T3.mfg_act_no))
								)
								.innerJoin(S2_DAC).on(S2_T.wg_cd.eq(S2_DAC.wg_cd))
								.leftOuterJoin(S2_ITM).on(
									S2_T.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.leftOuterJoin(S2_SUNDRY_ITM).on(
									S2_T3.itm_cd.eq(S2_SUNDRY_ITM.itm_cd)
									.and(S2_T3.itm_sub1.eq(S2_SUNDRY_ITM.itm_sub1))
									.and(S2_T3.itm_sub2.eq(S2_SUNDRY_ITM.itm_sub2))
									.and(S2_T3.itm_sub3.eq(S2_SUNDRY_ITM.itm_sub3))
									.and(S2_T3.sno1.eq(S2_SUNDRY_ITM.sno1))
									.and(S2_T3.sno2.eq(S2_SUNDRY_ITM.sno2))
									.and(S2_T3.sno3.eq(S2_SUNDRY_ITM.sno3))
									.and(S2_T3.sno4.eq(S2_SUNDRY_ITM.sno4))
								)
								.innerJoin(S2_TERM).on(
									S2_T.ym.gte(S2_TERM.term)
									.and(S2_T.ym.lt(S2_TERM.term_end_ym))
								)
								.leftOuterJoin(S2_MNG_DPT).on(
									S2_TERM.term.eq(S2_MNG_DPT.term)
									.and(S2_T3.mng_dpt_cd.eq(S2_MNG_DPT.dpt_cd))
								)
								.leftOuterJoin(S2_OPER).on(S2_T2.oper_cd.eq(S2_OPER.oper_cd))
								.leftOuterJoin(S2_WK_COST).on(S2_T.wk_cost_cd.eq(S2_WK_COST.wk_cost_cd))
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T.calc_ctg_cd.eq(bind("act_calc_ctg_cd")))
								.and(S2_T.ym.gte(bind("ym_fr")))
								.and(S2_T.ym.lt(bind("ym_to")))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_DAC.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T3.mng_dpt_cd.like(bind("mng_dpt_cd")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									nvl(
										S2_SUNDRY_ITM.itm_nm,
										S2_ITM.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_T3.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T3.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T3.sno1.like(bind("sno1")))
								.cutoff$and(S2_T3.sno2.like(bind("sno2")))
								.cutoff$and(S2_T3.sno3.like(bind("sno3")))
								.cutoff$and(S2_T3.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_T2.oper_cd.like(bind("oper_cd")))
								.cutoff$and(S2_T.wk_cost_cd.like(bind("wk_cost_cd")))
								.cutoff$and(S2_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
								.cutoff$and(S2_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S2_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S2_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S2_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S2_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S2_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S2_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S2_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S2_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S2_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
								.addDynamicPredicate(DS2D)
							)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub1)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub2)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm10")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.wk_cost_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wk_cost_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.dec_place))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.dec_place)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_wk_cost")).as("pln_wk_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_wk_cost")).as("act_wk_cost")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_DAC.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_T.loc_cd.eq(S1_STR_LN.loc_cd).and(S1_T.str_ln_cd.eq(S1_STR_LN.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ).and(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ).and(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ).and(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ).and(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ).and(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ).and(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ).and(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ).and(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ).and(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ).and(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("wg_flg"))
					.select(DS2D, S2_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS2D, S2_DAC.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS2D, S2_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS2D, S2_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.predicate(DS2D, p -> p.cutoff$and(S2_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_flg"))
					.select(DS2D, nvl(S2_SUNDRY_ITM.itm_nm,S2_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS2D, nvl(S2_SUNDRY_ITM.itm_nm,S2_ITM.itm_nm)),
				when(boundOr("itm_typ_flg"))
					.select(DS2D, S2_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS2D, S2_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS2D, S2_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS2D, S2_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg"))
					.select(DS2D, S2_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS2D, S2_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_TYP_D).on(S2_ITM.itm_typ.eq(S2_ITM_TYP_D.itm_typ).and(S2_ITM.itm_typ_d_cd.eq(S2_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS2D, S2_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS2D, S2_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS2D, S2_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS2D, S2_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_JNL).on(S2_ITM.itm_jnl_cd.eq(S2_ITM_JNL.itm_jnl_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_LOC).on(S2_T.loc_cd.eq(S2_LOC.loc_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS2D, S2_LOC.site_cd.as("site_cd"))
					.groupBy(DS2D, S2_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS2D, S2_SITE.site_nm.as("site_nm"))
					.groupBy(DS2D, S2_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SITE).on(S2_LOC.site_cd.eq(S2_SITE.site_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS2D, S2_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS2D, S2_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS2D, S2_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS2D, S2_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_STR_LN).on(S2_T.loc_cd.eq(S2_STR_LN.loc_cd).and(S2_T.str_ln_cd.eq(S2_STR_LN.str_ln_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("oper_flg"))
					.select(DS2D, S2_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS2D, S2_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.predicate(DS2D, p -> p.cutoff$and(S2_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS2D, S2_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS2D, S2_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS2D, S2_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP1).on(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_ITM_GRP1.itm_grp_typ).and(S2_ITM.itm_grp_cd1.eq(S2_ITM_GRP1.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS2D, S2_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS2D, S2_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS2D, S2_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP2).on(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_ITM_GRP2.itm_grp_typ).and(S2_ITM.itm_grp_cd2.eq(S2_ITM_GRP2.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS2D, S2_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS2D, S2_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS2D, S2_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP3).on(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_ITM_GRP3.itm_grp_typ).and(S2_ITM.itm_grp_cd3.eq(S2_ITM_GRP3.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS2D, S2_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS2D, S2_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS2D, S2_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP4).on(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_ITM_GRP4.itm_grp_typ).and(S2_ITM.itm_grp_cd4.eq(S2_ITM_GRP4.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS2D, S2_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS2D, S2_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS2D, S2_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP5).on(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_ITM_GRP5.itm_grp_typ).and(S2_ITM.itm_grp_cd5.eq(S2_ITM_GRP5.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS2D, S2_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS2D, S2_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS2D, S2_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP6).on(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_ITM_GRP6.itm_grp_typ).and(S2_ITM.itm_grp_cd6.eq(S2_ITM_GRP6.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS2D, S2_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS2D, S2_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS2D, S2_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP7).on(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_ITM_GRP7.itm_grp_typ).and(S2_ITM.itm_grp_cd7.eq(S2_ITM_GRP7.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS2D, S2_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS2D, S2_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS2D, S2_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP8).on(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_ITM_GRP8.itm_grp_typ).and(S2_ITM.itm_grp_cd8.eq(S2_ITM_GRP8.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS2D, S2_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS2D, S2_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS2D, S2_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP9).on(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_ITM_GRP9.itm_grp_typ).and(S2_ITM.itm_grp_cd9.eq(S2_ITM_GRP9.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS2D, S2_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS2D, S2_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS2D, S2_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP10).on(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_ITM_GRP10.itm_grp_typ).and(S2_ITM.itm_grp_cd10.eq(S2_ITM_GRP10.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}