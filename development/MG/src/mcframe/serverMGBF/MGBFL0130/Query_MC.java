package mcframe.serverMGBF.MGBFL0130;

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
	 * -- MGBFL0130_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0130_MGT_ACC_TOP_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MCTempView S1_T2 = createTempView("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R S1_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S1_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S1_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S1_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S1_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S1_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S1_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S1_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S1_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S1_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R S1_BP_CNTRY = MAM_CNTRY_R.create("BP_CNTRY");
		MAM_AREA_R S1_BP_AREA = MAM_AREA_R.create("BP_AREA");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0130_MGT_ACC_TOP_Query_S01")
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
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.bp_cd,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.iv_no,
							S1_T.asst_typ,
							S1_T2.pr("expns_cd"),
							S1_EXPNS.expns_grp_cd,
							S1_T2.pr("act_cost"),
							S1_T2.pr("std_cost"),
							S1_T2.pr("diff_up"),
							S1_T2.pr("diff_qty"),
							S1_T2.pr("diff_wk"),
							S1_T2.pr("diff_rt"),
							S1_T2.pr("diff_std"),
							S1_T2.pr("diff_a"),
							S1_T2.pr("diff_b"),
							S1_T2.pr("diff_c"),
							S1_T2.pr("diff_d"),
							S1_T2.pr("diff_e"),
							value(0).as("act_cost2"),
							value(0).as("std_cost2"),
							value(0).as("diff_up2"),
							value(0).as("diff_qty2"),
							value(0).as("diff_wk2"),
							value(0).as("diff_rt2"),
							value(0).as("diff_std2"),
							value(0).as("diff_a2"),
							value(0).as("diff_b2"),
							value(0).as("diff_c2"),
							value(0).as("diff_d2"),
							value(0).as("diff_e2"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.addDynamicView(REP1)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.leftOuterJoin(S1_EXPNS).on(S1_EXPNS.expns_cd.eq(S1_T2.pr("expns_cd")))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
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
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.addDynamicPredicate(DS1D)
							.addDynamicPredicate(REP1)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
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
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm10")),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm10")),
				when(boundOr("bp_cntry_flg"))
					.select(DS0D, S0_T.pr("bp_cntry_cd"))
					.groupBy(DS0D, S0_T.pr("bp_cntry_cd")),
				when(boundOr("bp_cntry_flg"))
					.select(DS0D, S0_T.pr("bp_cntry_nm"))
					.groupBy(DS0D, S0_T.pr("bp_cntry_nm")),
				when(boundOr("bp_area_flg"))
					.select(DS0D, S0_T.pr("bp_area_cd"))
					.groupBy(DS0D, S0_T.pr("bp_area_cd")),
				when(boundOr("bp_area_flg"))
					.select(DS0D, S0_T.pr("bp_area_nm"))
					.groupBy(DS0D, S0_T.pr("bp_area_nm")),
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, S0_T.pr("expns_cd"))
					.groupBy(DS0D, S0_T.pr("expns_cd")),
				when(null)
					.select(DS0D, S0_T.pr(S1_EXPNS.expns_grp_cd))
					.groupBy(DS0D, S0_T.pr(S1_EXPNS.expns_grp_cd)),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost")).as("act_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std_cost")).as("std_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_up")).as("diff_up")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_qty")).as("diff_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_wk")).as("diff_wk")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_rt")).as("diff_rt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_std")).as("diff_std")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_a")).as("diff_a")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_b")).as("diff_b")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_c")).as("diff_c")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_d")).as("diff_d")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_e")).as("diff_e")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost2")).as("act_cost2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std_cost2")).as("std_cost2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_up2")).as("diff_up2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_qty2")).as("diff_qty2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_wk2")).as("diff_wk2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_rt2")).as("diff_rt2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_std2")).as("diff_std2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_a2")).as("diff_a2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_b2")).as("diff_b2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_c2")).as("diff_c2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_d2")).as("diff_d2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_e2")).as("diff_e2")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_nm", "mng_dpt_flg"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd).and(S1_MNG_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_flg", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_nm1", "itm_grp_cd2", "itm_grp_nm2", "itm_grp_cd3", "itm_grp_nm3", "itm_grp_cd4", "itm_grp_nm4", "itm_grp_cd5", "itm_grp_nm5", "itm_grp_cd6", "itm_grp_nm6", "itm_grp_cd7", "itm_grp_nm7", "itm_grp_cd8", "itm_grp_nm8", "itm_grp_cd9", "itm_grp_nm9", "itm_grp_cd10", "itm_grp_nm10", "itm_typ_flg", "itm_jnl_flg", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM).on(S1_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_ITM.itm_sub3.eq(S1_T.itm_sub3))).leftOuterJoin(S1_SUNDRY_ITM).on(S1_SUNDRY_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_SUNDRY_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_SUNDRY_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_SUNDRY_ITM.itm_sub3.eq(S1_T.itm_sub3)).and(S1_SUNDRY_ITM.sno1.eq(S1_T.sno1)).and(S1_SUNDRY_ITM.sno2.eq(S1_T.sno2)).and(S1_SUNDRY_ITM.sno3.eq(S1_T.sno3)).and(S1_SUNDRY_ITM.sno4.eq(S1_T.sno4))).leftOuterJoin(S1_UNIT).on(S1_UNIT.unit_cd.eq(S1_ITM.unit_cd)))
					.predicate(DS1D, p -> p.cutoff$and(nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM_TYP_D.itm_typ.eq(S1_ITM.itm_typ).and(S1_ITM_TYP_D.itm_typ_d_cd.eq(S1_ITM.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM_JNL.itm_jnl_cd.eq(S1_ITM.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_STR_LN.loc_cd.eq(S1_T.loc_cd).and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm", "bp_cntry_cd", "bp_cntry_nm", "bp_area_cd", "bp_area_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10", "bp_cntry_flg", "bp_area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_BP.bp_cd.eq(S1_T.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.cntry_cd.like(bind("bp_cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("bp_area_cd"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("bp_cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("bp_cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("bp_cntry_flg"))
					.select(DS1D, S1_BP_CNTRY.cntry_nm.as("bp_cntry_nm"))
					.groupBy(DS1D, S1_BP_CNTRY.cntry_nm),
				when(boundOr("bp_cntry_flg", "bp_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_CNTRY).on(S1_BP_CNTRY.cntry_cd.eq(S1_BP.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_CNTRY.cntry_nm.like(bind("bp_cntry_nm")))),
				when(boundOr("bp_area_flg"))
					.select(DS1D, S1_BP.area_cd.as("bp_area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("bp_area_flg"))
					.select(DS1D, S1_BP_AREA.area_nm.as("bp_area_nm"))
					.groupBy(DS1D, S1_BP_AREA.area_nm),
				when(boundOr("bp_area_flg", "bp_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_AREA).on(S1_BP_AREA.area_cd.eq(S1_BP.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_AREA.area_nm.like(bind("bp_area_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub3).asc()),
				when(boundOr("itm_mfg_inst_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no).asc()),
				when(boundOr("mfg_act_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mfg_act_no).asc()),
				when(boundOr("itm_grp_flg1"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd1").asc()),
				when(boundOr("itm_grp_flg2"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd2").asc()),
				when(boundOr("itm_grp_flg3"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd3").asc()),
				when(boundOr("itm_grp_flg4"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd4").asc()),
				when(boundOr("itm_grp_flg5"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd5").asc()),
				when(boundOr("itm_grp_flg6"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd6").asc()),
				when(boundOr("itm_grp_flg7"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd7").asc()),
				when(boundOr("itm_grp_flg8"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd8").asc()),
				when(boundOr("itm_grp_flg9"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd9").asc()),
				when(boundOr("itm_grp_flg10"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd10").asc()),
				when(boundOr("lot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.lot_no).asc()),
				when(boundOr("sublot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sublot_no).asc()),
				when(boundOr("sno2_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno2).asc()),
				when(boundOr("sno4_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno4).asc()),
				when(boundOr("loc_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.loc_cd).asc()),
				when(boundOr("str_ln_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.str_ln_cd).asc()),
				when(boundOr("bp_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.bp_cd).asc()),
				when(boundOr("bp_grp_flg1"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd1").asc()),
				when(boundOr("bp_grp_flg2"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd2").asc()),
				when(boundOr("itm_typ_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(boundOr("itm_typ_d_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(boundOr("itm_jnl_flg"))
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub1).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub2).asc()),
				when(boundOr("sno1_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno1).asc()),
				when(boundOr("sno3_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno3).asc()),
				when(boundOr("site_flg"))
					.orderBy(DS0D, S0_T.pr("site_cd").asc()),
				when(boundOr("bp_grp_flg3"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd3").asc()),
				when(boundOr("bp_grp_flg4"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd4").asc()),
				when(boundOr("bp_grp_flg5"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd5").asc()),
				when(boundOr("bp_grp_flg6"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd6").asc()),
				when(boundOr("bp_grp_flg7"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd7").asc()),
				when(boundOr("bp_grp_flg8"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd8").asc()),
				when(boundOr("bp_grp_flg9"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd9").asc()),
				when(boundOr("bp_grp_flg10"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd10").asc()),
				when(boundOr("bp_cntry_flg"))
					.orderBy(DS0D, S0_T.pr("bp_cntry_cd").asc()),
				when(boundOr("bp_area_flg"))
					.orderBy(DS0D, S0_T.pr("bp_area_cd").asc()),
				when(boundOr("po_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.po_no).asc()),
				when(boundOr("slo_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.slo_no).asc()),
				when(boundOr("iv_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.iv_no).asc()),
				when(boundOr("asst_typ_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.asst_typ).asc())
			);
	}

	/**
	 * -- MGBFL0130_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0130_MGT_ACC_TOP_S02() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_COST_R S1_T2 = MGT_ACC_COST_R.create("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R S1_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S1_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S1_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S1_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S1_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S1_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S1_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S1_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S1_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S1_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R S1_BP_CNTRY = MAM_CNTRY_R.create("BP_CNTRY");
		MAM_AREA_R S1_BP_AREA = MAM_AREA_R.create("BP_AREA");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MGT_ACC_INPT_R S2_W = MGT_ACC_INPT_R.create("W");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0130_MGT_ACC_TOP_Query_S02")
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
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.bp_cd,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.iv_no,
							S1_T.asst_typ,
							S1_T2.expns_cd,
							S1_EXPNS.expns_grp_cd,
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.act_cost,
								value(0)
							).as("act_cost"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.std_cost,
								value(0)
							).as("std_cost"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_up,
								value(0)
							).as("diff_up"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_qty,
								value(0)
							).as("diff_qty"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_wk,
								value(0)
							).as("diff_wk"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_rt,
								value(0)
							).as("diff_rt"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_std,
								value(0)
							).as("diff_std"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_a,
								value(0)
							).as("diff_a"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_b,
								value(0)
							).as("diff_b"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_c,
								value(0)
							).as("diff_c"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_d,
								value(0)
							).as("diff_d"),
							decode(
								S1_T2.oper_cost_flg,
								value(true),
								S1_T2.diff_e,
								value(0)
							).as("diff_e"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.act_cost,
								value(0)
							).as("act_cost2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.std_cost,
								value(0)
							).as("std_cost2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_up,
								value(0)
							).as("diff_up2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_qty,
								value(0)
							).as("diff_qty2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_wk,
								value(0)
							).as("diff_wk2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_rt,
								value(0)
							).as("diff_rt2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_std,
								value(0)
							).as("diff_std2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_a,
								value(0)
							).as("diff_a2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_b,
								value(0)
							).as("diff_b2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_c,
								value(0)
							).as("diff_c2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_d,
								value(0)
							).as("diff_d2"),
							decode(
								S1_T2.oper_cost_flg,
								value(false),
								S1_T2.diff_e,
								value(0)
							).as("diff_e2"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
							)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.leftOuterJoin(S1_EXPNS).on(S1_EXPNS.expns_cd.eq(S1_T2.expns_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
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
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.addDynamicPredicate(DS1D)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
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
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm10")),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm10")),
				when(boundOr("bp_cntry_flg"))
					.select(DS0D, S0_T.pr("bp_cntry_cd"))
					.groupBy(DS0D, S0_T.pr("bp_cntry_cd")),
				when(boundOr("bp_cntry_flg"))
					.select(DS0D, S0_T.pr("bp_cntry_nm"))
					.groupBy(DS0D, S0_T.pr("bp_cntry_nm")),
				when(boundOr("bp_area_flg"))
					.select(DS0D, S0_T.pr("bp_area_cd"))
					.groupBy(DS0D, S0_T.pr("bp_area_cd")),
				when(boundOr("bp_area_flg"))
					.select(DS0D, S0_T.pr("bp_area_nm"))
					.groupBy(DS0D, S0_T.pr("bp_area_nm")),
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.expns_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_EXPNS.expns_grp_cd))
					.groupBy(DS0D, S0_T.pr(S1_EXPNS.expns_grp_cd)),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost")).as("act_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std_cost")).as("std_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_up")).as("diff_up")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_qty")).as("diff_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_wk")).as("diff_wk")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_rt")).as("diff_rt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_std")).as("diff_std")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_a")).as("diff_a")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_b")).as("diff_b")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_c")).as("diff_c")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_d")).as("diff_d")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_e")).as("diff_e")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost2")).as("act_cost2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std_cost2")).as("std_cost2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_up2")).as("diff_up2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_qty2")).as("diff_qty2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_wk2")).as("diff_wk2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_rt2")).as("diff_rt2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_std2")).as("diff_std2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_a2")).as("diff_a2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_b2")).as("diff_b2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_c2")).as("diff_c2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_d2")).as("diff_d2")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_e2")).as("diff_e2")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_nm", "mng_dpt_flg"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd).and(S1_MNG_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_flg", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_nm1", "itm_grp_cd2", "itm_grp_nm2", "itm_grp_cd3", "itm_grp_nm3", "itm_grp_cd4", "itm_grp_nm4", "itm_grp_cd5", "itm_grp_nm5", "itm_grp_cd6", "itm_grp_nm6", "itm_grp_cd7", "itm_grp_nm7", "itm_grp_cd8", "itm_grp_nm8", "itm_grp_cd9", "itm_grp_nm9", "itm_grp_cd10", "itm_grp_nm10", "itm_typ_flg", "itm_jnl_flg", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM).on(S1_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_ITM.itm_sub3.eq(S1_T.itm_sub3))).leftOuterJoin(S1_SUNDRY_ITM).on(S1_SUNDRY_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_SUNDRY_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_SUNDRY_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_SUNDRY_ITM.itm_sub3.eq(S1_T.itm_sub3)).and(S1_SUNDRY_ITM.sno1.eq(S1_T.sno1)).and(S1_SUNDRY_ITM.sno2.eq(S1_T.sno2)).and(S1_SUNDRY_ITM.sno3.eq(S1_T.sno3)).and(S1_SUNDRY_ITM.sno4.eq(S1_T.sno4))).leftOuterJoin(S1_UNIT).on(S1_UNIT.unit_cd.eq(S1_ITM.unit_cd)))
					.predicate(DS1D, p -> p.cutoff$and(nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM_TYP_D.itm_typ.eq(S1_ITM.itm_typ).and(S1_ITM_TYP_D.itm_typ_d_cd.eq(S1_ITM.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM_JNL.itm_jnl_cd.eq(S1_ITM.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_STR_LN.loc_cd.eq(S1_T.loc_cd).and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm", "bp_cntry_cd", "bp_cntry_nm", "bp_area_cd", "bp_area_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10", "bp_cntry_flg", "bp_area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_BP.bp_cd.eq(S1_T.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.cntry_cd.like(bind("bp_cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("bp_area_cd"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("bp_cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("bp_cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("bp_cntry_flg"))
					.select(DS1D, S1_BP_CNTRY.cntry_nm.as("bp_cntry_nm"))
					.groupBy(DS1D, S1_BP_CNTRY.cntry_nm),
				when(boundOr("bp_cntry_flg", "bp_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_CNTRY).on(S1_BP_CNTRY.cntry_cd.eq(S1_BP.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_CNTRY.cntry_nm.like(bind("bp_cntry_nm")))),
				when(boundOr("bp_area_flg"))
					.select(DS1D, S1_BP.area_cd.as("bp_area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("bp_area_flg"))
					.select(DS1D, S1_BP_AREA.area_nm.as("bp_area_nm"))
					.groupBy(DS1D, S1_BP_AREA.area_nm),
				when(boundOr("bp_area_flg", "bp_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_AREA).on(S1_BP_AREA.area_cd.eq(S1_BP.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_AREA.area_nm.like(bind("bp_area_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("except_inpt_flg"))
					.predicate(DS1D, p -> p.and(exists(subQuery().select(value("X")).from(S2_W).where(value(0).eq(value(0)).and(S2_W.calc_no.eq(S1_T2.calc_no)).and(S2_W.calc_grp_cd.eq(S1_T2.calc_grp_cd)).and(S2_W.inpt_rec_no.eq(S1_T2.inpt_rec_no)).and(S2_W.top_rec_no.eq(S1_T2.top_rec_no)).and(S2_W.lvl.eq(value(0))))))),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub3).asc()),
				when(boundOr("itm_mfg_inst_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no).asc()),
				when(boundOr("mfg_act_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mfg_act_no).asc()),
				when(boundOr("itm_grp_flg1"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd1").asc()),
				when(boundOr("itm_grp_flg2"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd2").asc()),
				when(boundOr("itm_grp_flg3"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd3").asc()),
				when(boundOr("itm_grp_flg4"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd4").asc()),
				when(boundOr("itm_grp_flg5"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd5").asc()),
				when(boundOr("itm_grp_flg6"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd6").asc()),
				when(boundOr("itm_grp_flg7"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd7").asc()),
				when(boundOr("itm_grp_flg8"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd8").asc()),
				when(boundOr("itm_grp_flg9"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd9").asc()),
				when(boundOr("itm_grp_flg10"))
					.orderBy(DS0D, S0_T.pr("itm_grp_cd10").asc()),
				when(boundOr("lot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.lot_no).asc()),
				when(boundOr("sublot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sublot_no).asc()),
				when(boundOr("sno2_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno2).asc()),
				when(boundOr("sno4_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno4).asc()),
				when(boundOr("loc_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.loc_cd).asc()),
				when(boundOr("str_ln_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.str_ln_cd).asc()),
				when(boundOr("bp_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.bp_cd).asc()),
				when(boundOr("bp_grp_flg1"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd1").asc()),
				when(boundOr("bp_grp_flg2"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd2").asc()),
				when(boundOr("itm_typ_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(boundOr("itm_typ_d_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(boundOr("itm_jnl_flg"))
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub1).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub2).asc()),
				when(boundOr("sno1_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno1).asc()),
				when(boundOr("sno3_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.sno3).asc()),
				when(boundOr("site_flg"))
					.orderBy(DS0D, S0_T.pr("site_cd").asc()),
				when(boundOr("bp_grp_flg3"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd3").asc()),
				when(boundOr("bp_grp_flg4"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd4").asc()),
				when(boundOr("bp_grp_flg5"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd5").asc()),
				when(boundOr("bp_grp_flg6"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd6").asc()),
				when(boundOr("bp_grp_flg7"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd7").asc()),
				when(boundOr("bp_grp_flg8"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd8").asc()),
				when(boundOr("bp_grp_flg9"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd9").asc()),
				when(boundOr("bp_grp_flg10"))
					.orderBy(DS0D, S0_T.pr("bp_grp_cd10").asc()),
				when(boundOr("bp_cntry_flg"))
					.orderBy(DS0D, S0_T.pr("bp_cntry_cd").asc()),
				when(boundOr("bp_area_flg"))
					.orderBy(DS0D, S0_T.pr("bp_area_cd").asc()),
				when(boundOr("po_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.po_no).asc()),
				when(boundOr("slo_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.slo_no).asc()),
				when(boundOr("iv_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.iv_no).asc()),
				when(boundOr("asst_typ_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.asst_typ).asc())
			);
	}
	
	/**
	 * -- MGBFL0130_MGT_ACC_TOP_Query_S03
	 */
	static MCQueryPlan MGBFL0130_MGT_ACC_TOP_S03() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R S1_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S1_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S1_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S1_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S1_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S1_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S1_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S1_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S1_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S1_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R S1_BP_CNTRY = MAM_CNTRY_R.create("BP_CNTRY");
		MAM_AREA_R S1_BP_AREA = MAM_AREA_R.create("BP_AREA");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0130_MGT_ACC_TOP_Query_S03")
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
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.bp_cd,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.iv_no,
							S1_T.asst_typ,
							S1_T.qty,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
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
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.addDynamicPredicate(DS1D)
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
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
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
				when(boundOr("itm_nm_flg"))
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
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
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_cntry_flg"))
					.select(DS0D, S0_T.pr("bp_cntry_cd"))
					.groupBy(DS0D, S0_T.pr("bp_cntry_cd")),
				when(boundOr("bp_area_flg"))
					.select(DS0D, S0_T.pr("bp_area_cd"))
					.groupBy(DS0D, S0_T.pr("bp_area_cd")),
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.qty)).as("qty")),
				when(null)
					.select(DS0D, max(S0_T.pr(S1_T.qty)).as("inst_qty")),
				when(boundOr("mng_dpt_nm", "mng_dpt_flg"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd).and(S1_MNG_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_flg", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_nm1", "itm_grp_cd2", "itm_grp_nm2", "itm_grp_cd3", "itm_grp_nm3", "itm_grp_cd4", "itm_grp_nm4", "itm_grp_cd5", "itm_grp_nm5", "itm_grp_cd6", "itm_grp_nm6", "itm_grp_cd7", "itm_grp_nm7", "itm_grp_cd8", "itm_grp_nm8", "itm_grp_cd9", "itm_grp_nm9", "itm_grp_cd10", "itm_grp_nm10", "itm_typ_flg", "itm_jnl_flg", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM).on(S1_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_ITM.itm_sub3.eq(S1_T.itm_sub3))).leftOuterJoin(S1_SUNDRY_ITM).on(S1_SUNDRY_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_SUNDRY_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_SUNDRY_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_SUNDRY_ITM.itm_sub3.eq(S1_T.itm_sub3)).and(S1_SUNDRY_ITM.sno1.eq(S1_T.sno1)).and(S1_SUNDRY_ITM.sno2.eq(S1_T.sno2)).and(S1_SUNDRY_ITM.sno3.eq(S1_T.sno3)).and(S1_SUNDRY_ITM.sno4.eq(S1_T.sno4))))
					.predicate(DS1D, p -> p.cutoff$and(nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_nm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM_TYP_D.itm_typ.eq(S1_ITM.itm_typ).and(S1_ITM_TYP_D.itm_typ_d_cd.eq(S1_ITM.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM_JNL.itm_jnl_cd.eq(S1_ITM.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_STR_LN.loc_cd.eq(S1_T.loc_cd).and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_flg", "bp_nm", "bp_cntry_cd", "bp_cntry_nm", "bp_area_cd", "bp_area_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10", "bp_cntry_flg", "bp_area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_BP.bp_cd.eq(S1_T.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.cntry_cd.like(bind("bp_cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("bp_area_cd"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("bp_cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("bp_cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("bp_cntry_flg", "bp_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_CNTRY).on(S1_BP_CNTRY.cntry_cd.eq(S1_BP.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_CNTRY.cntry_nm.like(bind("bp_cntry_nm")))),
				when(boundOr("bp_area_flg"))
					.select(DS1D, S1_BP.area_cd.as("bp_area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("bp_area_flg", "bp_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_AREA).on(S1_BP_AREA.area_cd.eq(S1_BP.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_AREA.area_nm.like(bind("bp_area_nm"))))
			);
	}
	
	/**
	 * -- MGBFL0130_MGT_ACC_TOP_Query_S04
	 */
	static MCQueryPlan MGBFL0130_MGT_ACC_TOP_S04() {
		MCTempView S0_T = createTempView("T");
		MCTempView S1_T = createTempView("T");
		MGT_CALC_ITM_MFG_INST_R S1_T2 = MGT_CALC_ITM_MFG_INST_R.create("T2");
		MGT_ITM_MFG_INST_R S1_T3 = MGT_ITM_MFG_INST_R.create("T3");
		MGT_ACC_TOP_R S2_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_COST_DPT_R S2_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S2_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S2_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S2_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S2_BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R S2_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S2_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S2_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S2_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S2_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S2_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S2_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S2_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S2_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S2_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R S2_BP_CNTRY = MAM_CNTRY_R.create("BP_CNTRY");
		MAM_AREA_R S2_BP_AREA = MAM_AREA_R.create("BP_AREA");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0130_MGT_ACC_TOP_Query_S04")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.pr(S2_T.itm_cd),
							S1_T.pr(S2_T.itm_sub1),
							S1_T.pr(S2_T.itm_sub2),
							S1_T.pr(S2_T.itm_sub3),
							S1_T.pr(S2_T.itm_mfg_inst_no),
							S1_T.pr(S2_T.mfg_act_no),
							S1_T3.qty
						)
						.from(
							subQuery()
							.selectDistinct(
								S2_T.calc_no,
								S2_T.calc_grp_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.itm_mfg_inst_no,
								S2_T.mfg_act_no
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_WG.wg_cd.eq(S2_T.wg_cd))
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T.calc_no.like(bind("calc_no")))
								.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S2_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T.ym.eq(bind("ym")))
								.cutoff$and(S2_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
								.cutoff$and(S2_T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S2_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_T.bp_cd.like(bind("bp_cd")))
								.cutoff$and(S2_T.po_no.like(bind("po_no")))
								.cutoff$and(S2_T.slo_no.like(bind("slo_no")))
								.cutoff$and(S2_T.iv_no.like(bind("iv_no")))
								.cutoff$and(S2_T.asst_typ.like(bind("asst_typ")))
								.cutoff$and(
									bind("no_po_no_flg_str").eq(value(true))
									.and(S2_T.po_no.isNull())
								)
								.cutoff$and(
									bind("no_slo_no_flg_str").eq(value(true))
									.and(S2_T.slo_no.isNull())
								)
								.cutoff$and(
									bind("no_iv_no_flg_str").eq(value(true))
									.and(S2_T.iv_no.isNull())
								)
								.cutoff$and(
									bind("no_bp_flg_str").eq(value(true))
									.and(S2_T.bp_cd.isNull())
								)
								.addDynamicPredicate(DS2D)
							).view(S1_T)
							.leftOuterJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.pr(S2_T.calc_no))
								.and(S1_T2.calc_grp_cd.eq(S1_T.pr(S2_T.calc_grp_cd)))
								.and(S1_T2.itm_cd.eq(S1_T.pr(S2_T.itm_cd)))
								.and(S1_T2.itm_sub1.eq(S1_T.pr(S2_T.itm_sub1)))
								.and(S1_T2.itm_sub2.eq(S1_T.pr(S2_T.itm_sub2)))
								.and(S1_T2.itm_sub3.eq(S1_T.pr(S2_T.itm_sub3)))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_T.pr(S2_T.itm_mfg_inst_no)))
								.and(S1_T2.mfg_act_no.eq(S1_T.pr(S2_T.mfg_act_no)))
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
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S2_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S2_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub1)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S2_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub2)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S2_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub3)),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S2_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_mfg_inst_no)),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr(S2_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S2_T.mfg_act_no)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T3.qty)).as("qty")),
				when(null)
					.select(DS0D, max(S0_T.pr(S1_T3.qty)).as("inst_qty")),
				when(boundOr("mng_dpt_nm", "mng_dpt_flg"))
					.view(DS2D, v -> v.innerJoin(S2_TERM).on(S2_T.ym.gte(S2_TERM.term).and(S2_T.ym.lt(S2_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_MNG_DPT).on(S2_MNG_DPT.dpt_cd.eq(S2_T.mng_dpt_cd).and(S2_MNG_DPT.term.eq(S2_TERM.term))))
					.predicate(DS2D, p -> p.cutoff$and(S2_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_flg", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_nm1", "itm_grp_cd2", "itm_grp_nm2", "itm_grp_cd3", "itm_grp_nm3", "itm_grp_cd4", "itm_grp_nm4", "itm_grp_cd5", "itm_grp_nm5", "itm_grp_cd6", "itm_grp_nm6", "itm_grp_cd7", "itm_grp_nm7", "itm_grp_cd8", "itm_grp_nm8", "itm_grp_cd9", "itm_grp_nm9", "itm_grp_cd10", "itm_grp_nm10", "itm_typ_flg", "itm_jnl_flg", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM).on(S2_ITM.itm_cd.eq(S2_T.itm_cd).and(S2_ITM.itm_sub1.eq(S2_T.itm_sub1)).and(S2_ITM.itm_sub2.eq(S2_T.itm_sub2)).and(S2_ITM.itm_sub3.eq(S2_T.itm_sub3))).leftOuterJoin(S2_SUNDRY_ITM).on(S2_SUNDRY_ITM.itm_cd.eq(S2_T.itm_cd).and(S2_SUNDRY_ITM.itm_sub1.eq(S2_T.itm_sub1)).and(S2_SUNDRY_ITM.itm_sub2.eq(S2_T.itm_sub2)).and(S2_SUNDRY_ITM.itm_sub3.eq(S2_T.itm_sub3)).and(S2_SUNDRY_ITM.sno1.eq(S2_T.sno1)).and(S2_SUNDRY_ITM.sno2.eq(S2_T.sno2)).and(S2_SUNDRY_ITM.sno3.eq(S2_T.sno3)).and(S2_SUNDRY_ITM.sno4.eq(S2_T.sno4))))
					.predicate(DS2D, p -> p.cutoff$and(nvl(S2_SUNDRY_ITM.itm_nm,S2_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S2_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S2_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S2_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S2_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S2_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S2_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S2_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S2_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S2_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S2_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_TYP_D).on(S2_ITM_TYP_D.itm_typ.eq(S2_ITM.itm_typ).and(S2_ITM_TYP_D.itm_typ_d_cd.eq(S2_ITM.itm_typ_d_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_JNL).on(S2_ITM_JNL.itm_jnl_cd.eq(S2_ITM.itm_jnl_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP1).on(S2_ITM.itm_grp_cd1.eq(S2_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_ITM_GRP1.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP2).on(S2_ITM.itm_grp_cd2.eq(S2_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_ITM_GRP2.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP3).on(S2_ITM.itm_grp_cd3.eq(S2_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_ITM_GRP3.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP4).on(S2_ITM.itm_grp_cd4.eq(S2_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_ITM_GRP4.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP5).on(S2_ITM.itm_grp_cd5.eq(S2_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_ITM_GRP5.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP6).on(S2_ITM.itm_grp_cd6.eq(S2_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_ITM_GRP6.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP7).on(S2_ITM.itm_grp_cd7.eq(S2_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_ITM_GRP7.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP8).on(S2_ITM.itm_grp_cd8.eq(S2_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_ITM_GRP8.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP9).on(S2_ITM.itm_grp_cd9.eq(S2_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_ITM_GRP9.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP10).on(S2_ITM.itm_grp_cd10.eq(S2_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_ITM_GRP10.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS2D, v -> v.leftOuterJoin(S2_LOC).on(S2_LOC.loc_cd.eq(S2_T.loc_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S2_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg", "site_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SITE).on(S2_SITE.site_cd.eq(S2_LOC.site_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_STR_LN).on(S2_STR_LN.loc_cd.eq(S2_T.loc_cd).and(S2_STR_LN.str_ln_cd.eq(S2_T.str_ln_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_flg", "bp_nm", "bp_cntry_cd", "bp_cntry_nm", "bp_area_cd", "bp_area_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10", "bp_cntry_flg", "bp_area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP).on(S2_BP.bp_cd.eq(S2_T.bp_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S2_BP.cntry_cd.like(bind("bp_cntry_cd"))).cutoff$and(S2_BP.area_cd.like(bind("bp_area_cd"))).cutoff$and(S2_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S2_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S2_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S2_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S2_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S2_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S2_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S2_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S2_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S2_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP1).on(S2_BP.bp_grp_cd1.eq(S2_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S2_BP_GRP1.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP2).on(S2_BP.bp_grp_cd2.eq(S2_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S2_BP_GRP2.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP3).on(S2_BP.bp_grp_cd3.eq(S2_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S2_BP_GRP3.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP4).on(S2_BP.bp_grp_cd4.eq(S2_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S2_BP_GRP4.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP5).on(S2_BP.bp_grp_cd5.eq(S2_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S2_BP_GRP5.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP6).on(S2_BP.bp_grp_cd6.eq(S2_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S2_BP_GRP6.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP7).on(S2_BP.bp_grp_cd7.eq(S2_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S2_BP_GRP7.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP8).on(S2_BP.bp_grp_cd8.eq(S2_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S2_BP_GRP8.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP9).on(S2_BP.bp_grp_cd9.eq(S2_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S2_BP_GRP9.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_GRP10).on(S2_BP.bp_grp_cd10.eq(S2_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S2_BP_GRP10.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("bp_cntry_flg", "bp_cntry_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_CNTRY).on(S2_BP_CNTRY.cntry_cd.eq(S2_BP.cntry_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_CNTRY.cntry_nm.like(bind("bp_cntry_nm")))),
				when(boundOr("bp_area_flg", "bp_area_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP_AREA).on(S2_BP_AREA.area_cd.eq(S2_BP.area_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP_AREA.area_nm.like(bind("bp_area_nm"))))
			);
	}
	
}