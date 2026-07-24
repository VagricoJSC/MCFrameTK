package mcframe.serverMGBF.MGBFL0140;

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
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_UNIT.unit_nm,
						S0_UNIT.unit_nm.as("inst_unit_nm"),
						sum(S0_T.qty).as("qty")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
						)
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T.iv_no.isNull())
						)
					)
					.groupBy(
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_UNIT.unit_nm
					)
			);
	}

	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S02() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MGT_ACC_INPT_R S1_W = MGT_ACC_INPT_R.create("W");
		
		MCTempView S0_T2 = createTempView("T2");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(
						S0_T2.pr("expns_cd"),
						S0_EXPNS.expns_grp_cd,
						sum(S0_T2.pr("act_cost")).as("act_cost"),
						sum(S0_T2.pr("std_cost")).as("std_cost"),
						sum(S0_T2.pr("diff_up")).as("diff_up"),
						sum(S0_T2.pr("diff_qty")).as("diff_qty"),
						sum(S0_T2.pr("diff_wk")).as("diff_wk"),
						sum(S0_T2.pr("diff_rt")).as("diff_rt"),
						sum(S0_T2.pr("diff_std")).as("diff_std"),
						sum(S0_T2.pr("diff_a")).as("diff_a"),
						sum(S0_T2.pr("diff_b")).as("diff_b"),
						sum(S0_T2.pr("diff_c")).as("diff_c"),
						sum(S0_T2.pr("diff_d")).as("diff_d"),
						sum(S0_T2.pr("diff_e")).as("diff_e")
					)
					.from(
						S0_T
						.addDynamicView(REP1)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T2.pr("expns_cd")))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T.iv_no.isNull())
						)
						.addDynamicPredicate(DS0D)
					)
					.groupBy(
						S0_T2.pr("expns_cd"),
						S0_EXPNS.expns_grp_cd
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("except_inpt_flg"))
						.predicate(DS0D, p -> p.and(exists(subQuery().select(value("X")).from(S1_W).where(value(0).eq(value(0)).and(S1_W.calc_no.eq(S0_T2.pr("calc_no"))).and(S1_W.calc_grp_cd.eq(S0_T2.pr("calc_grp_cd"))).and(S1_W.inpt_rec_no.eq(S0_T2.pr("inpt_rec_no"))).and(S1_W.top_rec_no.eq(S0_T2.pr("top_rec_no"))).and(S1_W.lvl.eq(value(0)))))))
			);
	}

	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S03
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S03() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_COST_R S0_T2 = MGT_ACC_COST_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MGT_ACC_INPT_R S1_W = MGT_ACC_INPT_R.create("W");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S03")
					.mainQuery()
					.select(
						S0_T2.expns_cd,
						S0_EXPNS.expns_grp_cd,
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.act_cost,
								value(0)
							)
						).as("act_cost"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.std_cost,
								value(0)
							)
						).as("std_cost"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_up,
								value(0)
							)
						).as("diff_up"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_qty,
								value(0)
							)
						).as("diff_qty"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_wk,
								value(0)
							)
						).as("diff_wk"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_rt,
								value(0)
							)
						).as("diff_rt"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_std,
								value(0)
							)
						).as("diff_std"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_a,
								value(0)
							)
						).as("diff_a"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_b,
								value(0)
							)
						).as("diff_b"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_c,
								value(0)
							)
						).as("diff_c"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_d,
								value(0)
							)
						).as("diff_d"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(true),
								S0_T2.diff_e,
								value(0)
							)
						).as("diff_e")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T2.expns_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T.iv_no.isNull())
						)
						.addDynamicPredicate(DS0D)
					)
					.groupBy(
						S0_T2.expns_cd,
						S0_EXPNS.expns_grp_cd
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("except_inpt_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(value("X")).from(S1_W).where(value(0).eq(value(0)).and(S1_W.calc_no.eq(S0_T2.calc_no)).and(S1_W.calc_grp_cd.eq(S0_T2.calc_grp_cd)).and(S1_W.inpt_rec_no.eq(S0_T2.inpt_rec_no)).and(S1_W.top_rec_no.eq(S0_T2.top_rec_no)).and(S1_W.lvl.eq(value(0)))))))
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S04
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S04() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_COST_R S0_T2 = MGT_ACC_COST_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S04")
					.mainQuery()
					.select(
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.act_cost,
								value(0)
							)
						).as("act_cost"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.std_cost,
								value(0)
							)
						).as("std_cost"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_up,
								value(0)
							)
						).as("diff_up"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_qty,
								value(0)
							)
						).as("diff_qty"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_wk,
								value(0)
							)
						).as("diff_wk"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_rt,
								value(0)
							)
						).as("diff_rt"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_std,
								value(0)
							)
						).as("diff_std"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_a,
								value(0)
							)
						).as("diff_a"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_b,
								value(0)
							)
						).as("diff_b"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_c,
								value(0)
							)
						).as("diff_c"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_d,
								value(0)
							)
						).as("diff_d"),
						sum(
							decode(
								S0_T2.oper_cost_flg,
								value(false),
								S0_T2.diff_e,
								value(0)
							)
						).as("diff_e")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T.iv_no.isNull())
						)
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S05
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S05() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S0_T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_COST_R S0_T3 = MGT_ACC_COST_R.create("T3");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MCTempView S0_T4 = createTempView("T4");
		MCTempView S0_T5 = createTempView("T5");
		MCTempView S0_T6 = createTempView("T6");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S1_T2 = MGT_ACC_INPT_R.create("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MGT_ACC_TOP_R S2_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S2_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MGT_ITM_MFG_INST_R S3_T = MGT_ITM_MFG_INST_R.create("T");
		MGT_ACC_TOP_R S4_W1 = MGT_ACC_TOP_R.create("W1");
		MGT_CALC_ITM_MFG_INST_R S4_CALC_INST = MGT_CALC_ITM_MFG_INST_R.create("CALC_INST");
		MAVM_RD_WG_R S4_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S4_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S4_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S4_STR_LN = MAM_STR_LN_R.create("STR_LN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S05")
					.mainQuery()
					.select(
						S0_T5.pr(S2_T.calc_no),
						S0_T5.pr("top_rec_no"),
						S0_T2.lvl,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.itm_mfg_inst_no,
							nullValue()
						).as("itm_mfg_inst_no"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.mfg_act_no,
							nullValue()
						).as("mfg_act_no"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.wg_cd,
							nullValue()
						).as("wg_cd"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_WG.wg_nm,
							nullValue()
						).as("wg_nm"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.loc_cd,
							nullValue()
						).as("loc_cd"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_LOC.loc_nm,
							nullValue()
						).as("loc_nm"),
						S0_T2.asst_typ,
						S0_T.po_no,
						S0_T.slo_no,
						S0_T.iv_no,
						S0_T4.pr("qty"),
						S0_T6.pr("inst_qty"),
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T4.pr(S1_T2.std_upri),
						decode(
							S0_T4.pr(S1_T2.act_upri),
							value(0),
							nullValue(),
							S0_T4.pr(S1_T2.act_upri)
						).as("act_upri"),
						S0_T3.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ,
						sum(S0_T3.act_cost).as("act_cost"),
						sum(S0_T3.diff_up).as("diff_up")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T3.calc_no.eq(S0_T2.calc_no)
							.and(S0_T3.calc_grp_cd.eq(S0_T2.calc_grp_cd))
							.and(S0_T3.sml_inpt_rec_no.eq(S0_T2.inpt_rec_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T3.expns_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
						.innerJoin(
							subQuery()
							.select(
								S1_T2.lvl,
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T2.lot_no,
								S1_T2.sublot_no,
								S1_T2.sno1,
								S1_T2.sno2,
								S1_T2.sno3,
								S1_T2.sno4,
								S1_T2.asst_typ,
								S1_T.calc_no,
								S1_T.calc_grp_cd,
								S1_T.itm_cd.as("p_itm_cd"),
								S1_T.itm_sub1.as("p_itm_sub1"),
								S1_T.itm_sub2.as("p_itm_sub2"),
								S1_T.itm_sub3.as("p_itm_sub3"),
								S1_T.itm_mfg_inst_no,
								S1_T.mfg_act_no,
								S1_T.lot_no.as("p_lot_no"),
								S1_T.sublot_no.as("p_sublot_no"),
								S1_T.sno1.as("p_sno1"),
								S1_T.sno2.as("p_sno2"),
								S1_T.sno3.as("p_sno3"),
								S1_T.sno4.as("p_sno4"),
								S1_T.wg_cd,
								S1_T.loc_cd,
								S1_T.asst_typ.as("p_asst_typ"),
								S1_T.po_no,
								S1_T.slo_no,
								S1_T.iv_no,
								sum(S1_T2.act_qty).as("qty"),
								S1_T.ym,
								S1_T2.std_upri,
								S1_T2.act_upri
							)
							.from(
								S1_T
								.innerJoin(S1_T2).on(
									S1_T2.calc_no.eq(S1_T.calc_no)
									.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
									.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
								)
								.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
								.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
								.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
								.leftOuterJoin(S1_STR_LN).on(
									S1_STR_LN.loc_cd.eq(S1_T.loc_cd)
									.and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
								.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S1_T.itm_cd.eq(bind("itm_cd")))
								.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
								.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.and(S1_T2.lvl.between(value(0), bind("lvl")))
								.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S1_T.ym.eq(bind("ym")))
								.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S1_T.sno1.like(bind("sno1")))
								.cutoff$and(S1_T.sno2.like(bind("sno2")))
								.cutoff$and(S1_T.sno3.like(bind("sno3")))
								.cutoff$and(S1_T.sno4.like(bind("sno4")))
								.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
								.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
								.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
								.cutoff$and(S1_T.po_no.like(bind("po_no")))
								.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
								.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
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
							)
							.groupBy(
								S1_T.ym,
								S1_T2.std_upri,
								S1_T2.act_upri,
								S1_T.calc_no,
								S1_T.calc_grp_cd,
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
								S1_T.wg_cd,
								S1_T.loc_cd,
								S1_T.asst_typ,
								S1_T.po_no,
								S1_T.slo_no,
								S1_T.iv_no,
								S1_T2.lvl,
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T2.lot_no,
								S1_T2.sublot_no,
								S1_T2.sno1,
								S1_T2.sno2,
								S1_T2.sno3,
								S1_T2.sno4,
								S1_T2.asst_typ
							).view(S0_T4)
						).on(
							S0_T4.pr(S1_T.calc_no).eq(S0_T.calc_no)
							.and(S0_T4.pr(S1_T.calc_grp_cd).eq(S0_T.calc_grp_cd))
							.and(S0_T4.pr("p_itm_cd").eq(S0_T.itm_cd))
							.and(S0_T4.pr("p_itm_sub1").eq(S0_T.itm_sub1))
							.and(S0_T4.pr("p_itm_sub2").eq(S0_T.itm_sub2))
							.and(S0_T4.pr("p_itm_sub3").eq(S0_T.itm_sub3))
							.and(
								nvl(
									S0_T4.pr(S1_T.itm_mfg_inst_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.itm_mfg_inst_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T4.pr(S1_T.mfg_act_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.mfg_act_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(S0_T4.pr("p_lot_no").eq(S0_T.lot_no))
							.and(S0_T4.pr("p_sublot_no").eq(S0_T.sublot_no))
							.and(S0_T4.pr("p_sno1").eq(S0_T.sno1))
							.and(S0_T4.pr("p_sno2").eq(S0_T.sno2))
							.and(S0_T4.pr("p_sno3").eq(S0_T.sno3))
							.and(S0_T4.pr("p_sno4").eq(S0_T.sno4))
							.and(S0_T4.pr(S1_T.wg_cd).eq(S0_T.wg_cd))
							.and(
								nvl(
									S0_T4.pr(S1_T.loc_cd),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.loc_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(S0_T4.pr("p_asst_typ").eq(S0_T.asst_typ))
							.and(
								nvl(
									S0_T4.pr(S1_T.po_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.po_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T4.pr(S1_T.slo_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.slo_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T4.pr(S1_T.iv_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.iv_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(S0_T4.pr(S1_T.ym).eq(S0_T.ym))
							.and(S0_T4.pr(S1_T2.std_upri).eq(S0_T2.std_upri))
							.and(S0_T4.pr(S1_T2.act_upri).eq(S0_T2.act_upri))
							.and(S0_T4.pr(S1_T2.lvl).eq(S0_T2.lvl))
							.and(S0_T4.pr(S1_T2.itm_cd).eq(S0_T2.itm_cd))
							.and(S0_T4.pr(S1_T2.itm_sub1).eq(S0_T2.itm_sub1))
							.and(S0_T4.pr(S1_T2.itm_sub2).eq(S0_T2.itm_sub2))
							.and(S0_T4.pr(S1_T2.itm_sub3).eq(S0_T2.itm_sub3))
							.and(S0_T4.pr(S1_T2.lot_no).eq(S0_T2.lot_no))
							.and(S0_T4.pr(S1_T2.sublot_no).eq(S0_T2.sublot_no))
							.and(S0_T4.pr(S1_T2.sno1).eq(S0_T2.sno1))
							.and(S0_T4.pr(S1_T2.sno2).eq(S0_T2.sno2))
							.and(S0_T4.pr(S1_T2.sno3).eq(S0_T2.sno3))
							.and(S0_T4.pr(S1_T2.sno4).eq(S0_T2.sno4))
							.and(S0_T4.pr(S1_T2.asst_typ).eq(S0_T2.asst_typ))
						)
						.innerJoin(
							subQuery()
							.select(
								rowNumber()
									.over()
									.orderBy(
										S2_T.calc_no.asc(),
										S2_T.calc_grp_cd.asc(),
										S2_T.ym.asc(),
										S2_T.itm_cd.asc(),
										S2_T.itm_sub1.asc(),
										S2_T.itm_sub2.asc(),
										S2_T.itm_sub3.asc(),
										S2_T.itm_mfg_inst_no.asc(),
										S2_T.mfg_act_no.asc(),
										S2_T.lot_no.asc(),
										S2_T.sublot_no.asc(),
										S2_T.sno1.asc(),
										S2_T.sno2.asc(),
										S2_T.sno3.asc(),
										S2_T.sno4.asc(),
										S2_T.wg_cd.asc(),
										S2_T.loc_cd.asc(),
										S2_T.po_no.asc(),
										S2_T.slo_no.asc(),
										S2_T.iv_no.asc(),
										S2_T.asst_typ.asc()
									).as("top_rec_no"),
								S2_T.ym,
								S2_T.calc_no,
								S2_T.calc_grp_cd,
								S2_T.itm_cd.as("p_itm_cd"),
								S2_T.itm_sub1.as("p_itm_sub1"),
								S2_T.itm_sub2.as("p_itm_sub2"),
								S2_T.itm_sub3.as("p_itm_sub3"),
								S2_T.itm_mfg_inst_no,
								S2_T.mfg_act_no,
								S2_T.lot_no.as("p_lot_no"),
								S2_T.sublot_no.as("p_sublot_no"),
								S2_T.sno1.as("p_sno1"),
								S2_T.sno2.as("p_sno2"),
								S2_T.sno3.as("p_sno3"),
								S2_T.sno4.as("p_sno4"),
								S2_T.wg_cd,
								S2_T.loc_cd,
								S2_T.po_no,
								S2_T.slo_no,
								S2_T.iv_no,
								S2_T.asst_typ.as("p_asst_typ")
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_WG.wg_cd.eq(S2_T.wg_cd))
								.leftOuterJoin(S2_LOC).on(S2_LOC.loc_cd.eq(S2_T.loc_cd))
								.leftOuterJoin(S2_SITE).on(S2_SITE.site_cd.eq(S2_LOC.site_cd))
								.leftOuterJoin(S2_STR_LN).on(
									S2_STR_LN.loc_cd.eq(S2_T.loc_cd)
									.and(S2_STR_LN.str_ln_cd.eq(S2_T.str_ln_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T.calc_no.like(bind("calc_no")))
								.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S2_T.itm_cd.eq(bind("itm_cd")))
								.and(S2_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T.itm_sub3.eq(bind("itm_sub3")))
								.and(S2_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S2_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S2_T.ym.eq(bind("ym")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_LOC.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
								.cutoff$and(S2_T.po_no.like(bind("po_no")))
								.cutoff$and(S2_T.slo_no.like(bind("slo_no")))
								.cutoff$and(S2_T.iv_no.like(bind("iv_no")))
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
							)
							.groupBy(
								S2_T.ym,
								S2_T.calc_no,
								S2_T.calc_grp_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.itm_mfg_inst_no,
								S2_T.mfg_act_no,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								S2_T.wg_cd,
								S2_T.loc_cd,
								S2_T.po_no,
								S2_T.slo_no,
								S2_T.iv_no,
								S2_T.asst_typ
							).view(S0_T5)
						).on(
							S0_T5.pr(S2_T.ym).eq(S0_T.ym)
							.and(S0_T5.pr(S2_T.calc_no).eq(S0_T.calc_no))
							.and(S0_T5.pr(S2_T.calc_grp_cd).eq(S0_T.calc_grp_cd))
							.and(S0_T5.pr("p_itm_cd").eq(S0_T.itm_cd))
							.and(S0_T5.pr("p_itm_sub1").eq(S0_T.itm_sub1))
							.and(S0_T5.pr("p_itm_sub2").eq(S0_T.itm_sub2))
							.and(S0_T5.pr("p_itm_sub3").eq(S0_T.itm_sub3))
							.and(S0_T5.pr(S2_T.itm_mfg_inst_no).eq(S0_T.itm_mfg_inst_no))
							.and(S0_T5.pr(S2_T.mfg_act_no).eq(S0_T.mfg_act_no))
							.and(S0_T5.pr("p_lot_no").eq(S0_T.lot_no))
							.and(S0_T5.pr("p_sublot_no").eq(S0_T.sublot_no))
							.and(S0_T5.pr("p_sno1").eq(S0_T.sno1))
							.and(S0_T5.pr("p_sno2").eq(S0_T.sno2))
							.and(S0_T5.pr("p_sno3").eq(S0_T.sno3))
							.and(S0_T5.pr("p_sno4").eq(S0_T.sno4))
							.and(S0_T5.pr(S2_T.wg_cd).eq(S0_T.wg_cd))
							.and(S0_T5.pr(S2_T.loc_cd).eq(S0_T.loc_cd))
							.and(S0_T5.pr("p_asst_typ").eq(S0_T.asst_typ))
							.and(
								nvl(
									S0_T5.pr(S2_T.po_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.po_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T5.pr(S2_T.slo_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.slo_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T5.pr(S2_T.iv_no),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.iv_no,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S3_T.itm_cd,
								S3_T.itm_sub1,
								S3_T.itm_sub2,
								S3_T.itm_sub3,
								S3_T.itm_mfg_inst_no,
								S3_T.mfg_act_no,
								sum(S3_T.qty).as("inst_qty")
							)
							.from(S3_T)
							.where(
								value(0).eq(value(0))
								.and(S3_T.itm_cd.eq(bind("itm_cd")))
								.and(S3_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S3_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S3_T.itm_sub3.eq(bind("itm_sub3")))
								.cutoff$and(S3_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S3_T.mfg_act_no.like(bind("mfg_act_no")))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S4_W1
											.innerJoin(S4_CALC_INST).on(
												S4_W1.calc_no.eq(S4_CALC_INST.calc_no)
												.and(S4_W1.calc_grp_cd.eq(S4_CALC_INST.calc_grp_cd))
												.and(S4_W1.itm_cd.eq(S4_CALC_INST.itm_cd))
												.and(S4_W1.itm_sub1.eq(S4_CALC_INST.itm_sub1))
												.and(S4_W1.itm_sub2.eq(S4_CALC_INST.itm_sub2))
												.and(S4_W1.itm_sub3.eq(S4_CALC_INST.itm_sub3))
												.and(S4_W1.itm_mfg_inst_no.eq(S4_CALC_INST.itm_mfg_inst_no))
												.and(S4_W1.mfg_act_no.eq(S4_CALC_INST.mfg_act_no))
											)
											.innerJoin(S4_WG).on(S4_WG.wg_cd.eq(S4_W1.wg_cd))
											.leftOuterJoin(S4_LOC).on(S4_LOC.loc_cd.eq(S4_W1.loc_cd))
											.leftOuterJoin(S4_SITE).on(S4_SITE.site_cd.eq(S4_LOC.site_cd))
											.leftOuterJoin(S4_STR_LN).on(
												S4_STR_LN.loc_cd.eq(S4_W1.loc_cd)
												.and(S4_STR_LN.str_ln_cd.eq(S4_W1.str_ln_cd))
											)
										)
										.where(
											value(0).eq(value(0))
											.cutoff$and(S4_W1.calc_no.like(bind("calc_no")))
											.and(S4_W1.calc_grp_cd.eq(bind("calc_grp_cd")))
											.and(S4_W1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
											.and(S4_CALC_INST.calc_ctg_cd.eq(S3_T.calc_ctg_cd))
											.and(S4_CALC_INST.itm_cd.eq(S3_T.itm_cd))
											.and(S4_CALC_INST.itm_sub1.eq(S3_T.itm_sub1))
											.and(S4_CALC_INST.itm_sub2.eq(S3_T.itm_sub2))
											.and(S4_CALC_INST.itm_sub3.eq(S3_T.itm_sub3))
											.and(S4_CALC_INST.itm_mfg_inst_no.eq(S3_T.itm_mfg_inst_no))
											.and(S4_CALC_INST.mfg_act_no.eq(S3_T.mfg_act_no))
											.cutoff$and(S4_W1.wg_cd.like(bind("wg_cd")))
											.cutoff$and(S4_WG.wg_nm.like(bind("wg_nm")))
											.cutoff$and(S4_W1.ym.eq(bind("ym")))
											.cutoff$and(S4_W1.lot_no.like(bind("lot_no")))
											.cutoff$and(S4_W1.sublot_no.like(bind("sublot_no")))
											.cutoff$and(S4_W1.sno1.like(bind("sno1")))
											.cutoff$and(S4_W1.sno2.like(bind("sno2")))
											.cutoff$and(S4_W1.sno3.like(bind("sno3")))
											.cutoff$and(S4_W1.sno4.like(bind("sno4")))
											.cutoff$and(S4_W1.loc_cd.like(bind("loc_cd")))
											.cutoff$and(S4_LOC.loc_nm.like(bind("loc_nm")))
											.cutoff$and(S4_LOC.site_cd.like(bind("site_cd")))
											.cutoff$and(S4_SITE.site_nm.like(bind("site_nm")))
											.cutoff$and(S4_W1.str_ln_cd.like(bind("str_ln_cd")))
											.cutoff$and(S4_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
											.cutoff$and(S4_W1.po_no.like(bind("po_no")))
											.cutoff$and(S4_W1.slo_no.like(bind("slo_no")))
											.cutoff$and(S4_W1.iv_no.like(bind("iv_no")))
											.cutoff$and(
												bind("no_po_no_flg_str").eq(value(true))
												.and(S3_T.po_no.isNull())
											)
											.cutoff$and(
												bind("no_slo_no_flg_str").eq(value(true))
												.and(S3_T.slo_no.isNull())
											)
											.cutoff$and(
												bind("no_iv_no_flg_str").eq(value(true))
												.and(S3_T.iv_no.isNull())
											)
										)
									)
								)
							)
							.groupBy(
								S3_T.itm_cd,
								S3_T.itm_sub1,
								S3_T.itm_sub2,
								S3_T.itm_sub3,
								S3_T.itm_mfg_inst_no,
								S3_T.mfg_act_no
							).view(S0_T6)
						).on(
							S0_T6.pr(S3_T.itm_cd).eq(S0_T.itm_cd)
							.and(S0_T6.pr(S3_T.itm_sub1).eq(S0_T.itm_sub1))
							.and(S0_T6.pr(S3_T.itm_sub2).eq(S0_T.itm_sub2))
							.and(S0_T6.pr(S3_T.itm_sub3).eq(S0_T.itm_sub3))
							.and(S0_T6.pr(S3_T.itm_mfg_inst_no).eq(S0_T.itm_mfg_inst_no))
							.and(S0_T6.pr(S3_T.mfg_act_no).eq(S0_T.mfg_act_no))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.and(S0_T2.lvl.between(value(0), bind("lvl")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_T.po_no.like(bind("po_no")))
						.cutoff$and(S0_T.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T.iv_no.like(bind("iv_no")))
						.cutoff$and(
							bind("no_po_no_flg_str").eq(value(true))
							.and(S0_T.po_no.isNull())
						)
						.cutoff$and(
							bind("no_slo_no_flg_str").eq(value(true))
							.and(S0_T.slo_no.isNull())
						)
						.cutoff$and(
							bind("no_iv_no_flg_str").eq(value(true))
							.and(S0_T.iv_no.isNull())
						)
					)
					.groupBy(
						S0_T5.pr(S2_T.calc_no),
						S0_T5.pr("top_rec_no"),
						S0_T2.lvl,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_T.itm_mfg_inst_no,
						S0_T.mfg_act_no,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.loc_cd,
						S0_LOC.loc_nm,
						S0_T2.asst_typ,
						S0_T.po_no,
						S0_T.slo_no,
						S0_T.iv_no,
						S0_T4.pr("qty"),
						S0_T6.pr("inst_qty"),
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T4.pr(S1_T2.std_upri),
						S0_T4.pr(S1_T2.act_upri),
						S0_T3.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S06
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S06() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S0_T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_COST_R S0_T3 = MGT_ACC_COST_R.create("T3");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MCTempView S0_T4 = createTempView("T4");
		MCTempView S0_T5 = createTempView("T5");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S1_T2 = MGT_ACC_INPT_R.create("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MGT_ACC_TOP_R S2_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S2_STR_LN = MAM_STR_LN_R.create("STR_LN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S06")
					.mainQuery()
					.select(
						S0_T5.pr(S2_T.calc_no),
						S0_T5.pr("top_rec_no"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.wg_cd,
							nullValue()
						).as("wg_cd"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_WG.wg_nm,
							nullValue()
						).as("wg_nm"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_T.loc_cd,
							nullValue()
						).as("loc_cd"),
						decode(
							S0_T2.lvl,
							value(0),
							S0_LOC.loc_nm,
							nullValue()
						).as("loc_nm"),
						S0_T2.lvl,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T4.pr(S1_T2.std_upri),
						S0_T4.pr("std_qty"),
						S0_T4.pr("act_qty"),
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T3.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ,
						S0_T4.pr(S1_T2.act_upri),
						sum(S0_T3.std_cost).as("std_cost"),
						sum(S0_T3.act_cost).as("act_cost"),
						sum(S0_T3.std_cost).subtract(sum(S0_T3.act_cost)).as("diff_cost"),
						sum(S0_T3.diff_qty).as("diff_qty")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T3.calc_no.eq(S0_T2.calc_no)
							.and(S0_T3.calc_grp_cd.eq(S0_T2.calc_grp_cd))
							.and(S0_T3.sml_inpt_rec_no.eq(S0_T2.inpt_rec_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.leftOuterJoin(S0_OPER).on(S0_OPER.oper_cd.eq(S0_T2.oper_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T3.expns_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
						.innerJoin(
							subQuery()
							.select(
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3,
								S1_T.calc_no,
								S1_T.calc_grp_cd,
								S1_T.itm_cd.as("p_itm_cd"),
								S1_T.itm_sub1.as("p_itm_sub1"),
								S1_T.itm_sub2.as("p_itm_sub2"),
								S1_T.itm_sub3.as("p_itm_sub3"),
								S1_T2.lvl,
								S1_T.wg_cd,
								S1_T.loc_cd,
								S1_T2.oper_cd,
								sum(S1_T2.std_qty).as("std_qty"),
								sum(S1_T2.act_qty).as("act_qty"),
								S1_T.ym,
								S1_T2.act_upri,
								S1_T2.std_upri
							)
							.from(
								S1_T
								.innerJoin(S1_T2).on(
									S1_T2.calc_no.eq(S1_T.calc_no)
									.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
									.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
								)
								.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
								.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
								.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
								.leftOuterJoin(S1_STR_LN).on(
									S1_STR_LN.loc_cd.eq(S1_T.loc_cd)
									.and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
								.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S1_T.itm_cd.eq(bind("itm_cd")))
								.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
								.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.and(S1_T2.lvl.between(value(0), bind("lvl")))
								.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S1_T.ym.eq(bind("ym")))
								.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S1_T.sno1.like(bind("sno1")))
								.cutoff$and(S1_T.sno2.like(bind("sno2")))
								.cutoff$and(S1_T.sno3.like(bind("sno3")))
								.cutoff$and(S1_T.sno4.like(bind("sno4")))
								.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
								.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
								.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
							)
							.groupBy(
								S1_T.ym,
								S1_T2.act_upri,
								S1_T2.std_upri,
								S1_T.calc_no,
								S1_T.calc_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T2.lvl,
								S1_T.wg_cd,
								S1_T.loc_cd,
								S1_T2.oper_cd,
								S1_T2.itm_cd,
								S1_T2.itm_sub1,
								S1_T2.itm_sub2,
								S1_T2.itm_sub3
							).view(S0_T4)
						).on(
							S0_T4.pr(S1_T.calc_no).eq(S0_T.calc_no)
							.and(S0_T4.pr(S1_T.calc_grp_cd).eq(S0_T.calc_grp_cd))
							.and(S0_T4.pr("p_itm_cd").eq(S0_T.itm_cd))
							.and(S0_T4.pr("p_itm_sub1").eq(S0_T.itm_sub1))
							.and(S0_T4.pr("p_itm_sub2").eq(S0_T.itm_sub2))
							.and(S0_T4.pr("p_itm_sub3").eq(S0_T.itm_sub3))
							.and(S0_T4.pr(S1_T.ym).eq(S0_T.ym))
							.and(S0_T4.pr(S1_T2.std_upri).eq(S0_T2.std_upri))
							.and(S0_T4.pr(S1_T2.act_upri).eq(S0_T2.act_upri))
							.and(S0_T4.pr(S1_T2.lvl).eq(S0_T2.lvl))
							.and(S0_T4.pr(S1_T.wg_cd).eq(S0_T.wg_cd))
							.and(
								nvl(
									S0_T4.pr(S1_T.loc_cd),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.loc_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T4.pr(S1_T2.oper_cd),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T2.oper_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(S0_T4.pr(S1_T2.itm_cd).eq(S0_T2.itm_cd))
							.and(S0_T4.pr(S1_T2.itm_sub1).eq(S0_T2.itm_sub1))
							.and(S0_T4.pr(S1_T2.itm_sub2).eq(S0_T2.itm_sub2))
							.and(S0_T4.pr(S1_T2.itm_sub3).eq(S0_T2.itm_sub3))
						)
						.innerJoin(
							subQuery()
							.select(
								rowNumber()
									.over()
									.orderBy(
										S2_T.calc_no.asc(),
										S2_T.calc_grp_cd.asc(),
										S2_T.ym.asc(),
										S2_T.itm_cd.asc(),
										S2_T.itm_sub1.asc(),
										S2_T.itm_sub2.asc(),
										S2_T.itm_sub3.asc(),
										S2_T.wg_cd.asc(),
										S2_T.loc_cd.asc()
									).as("top_rec_no"),
								S2_T.ym,
								S2_T.calc_no,
								S2_T.calc_grp_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.wg_cd,
								S2_T.loc_cd
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_WG.wg_cd.eq(S2_T.wg_cd))
								.leftOuterJoin(S2_LOC).on(S2_LOC.loc_cd.eq(S2_T.loc_cd))
								.leftOuterJoin(S2_SITE).on(S2_SITE.site_cd.eq(S2_LOC.site_cd))
								.leftOuterJoin(S2_STR_LN).on(
									S2_STR_LN.loc_cd.eq(S2_T.loc_cd)
									.and(S2_STR_LN.str_ln_cd.eq(S2_T.str_ln_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T.calc_no.like(bind("calc_no")))
								.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S2_T.itm_cd.eq(bind("itm_cd")))
								.and(S2_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T.itm_sub3.eq(bind("itm_sub3")))
								.and(S2_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S2_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S2_T.ym.eq(bind("ym")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_LOC.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
							)
							.groupBy(
								S2_T.ym,
								S2_T.calc_no,
								S2_T.calc_grp_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.wg_cd,
								S2_T.loc_cd
							).view(S0_T5)
						).on(
							S0_T5.pr(S2_T.ym).eq(S0_T.ym)
							.and(S0_T5.pr(S2_T.calc_no).eq(S0_T.calc_no))
							.and(S0_T5.pr(S2_T.calc_grp_cd).eq(S0_T.calc_grp_cd))
							.and(S0_T5.pr(S2_T.itm_cd).eq(S0_T.itm_cd))
							.and(S0_T5.pr(S2_T.itm_sub1).eq(S0_T.itm_sub1))
							.and(S0_T5.pr(S2_T.itm_sub2).eq(S0_T.itm_sub2))
							.and(S0_T5.pr(S2_T.itm_sub3).eq(S0_T.itm_sub3))
							.and(S0_T5.pr(S2_T.wg_cd).eq(S0_T.wg_cd))
							.and(
								nvl(
									S0_T5.pr(S2_T.loc_cd),
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T.loc_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.and(S0_T2.lvl.between(value(0), bind("lvl")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
					)
					.groupBy(
						S0_T5.pr(S2_T.calc_no),
						S0_T5.pr("top_rec_no"),
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.loc_cd,
						S0_LOC.loc_nm,
						S0_T2.lvl,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T4.pr(S1_T2.std_upri),
						S0_T4.pr("std_qty"),
						S0_T4.pr("act_qty"),
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T3.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ,
						S0_T4.pr(S1_T2.act_upri)
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ACC_TOP_Query_S07
	 */
	static MCQueryPlan MGBFL0140_MGT_ACC_TOP_S07() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S0_T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_WK_R S0_T3 = MGT_ACC_WK_R.create("T3");
		MGT_ACC_COST_R S0_T4 = MGT_ACC_COST_R.create("T4");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_LOC_R S0_LOC2 = MAM_LOC_R.create("LOC2");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S0_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ACC_TOP_Query_S07")
					.mainQuery()
					.select(
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T3.loc_cd,
						S0_LOC2.loc_nm,
						S0_T3.oper_cd,
						S0_OPER.oper_nm,
						S0_T3.oper_seq,
						S0_T3.wk_cost_cd,
						S0_WK_COST.wk_cost_nm,
						S0_WK_COST.wk_cost_unit_nm,
						S0_WK_COST.dec_place,
						S0_T4.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ,
						sum(S0_T3.std_wk_cost).as("std_wk_cost"),
						sum(S0_T3.act_wk_cost).as("act_wk_cost"),
						nvl(
							sum(S0_T3.std_wk_cost),
							value(0)
						).subtract(
							nvl(
								sum(S0_T3.act_wk_cost),
								value(0)
							)
						).as("diff_wk_cost"),
						sum(S0_T4.std_cost).as("std_cost"),
						sum(S0_T4.act_cost).as("act_cost"),
						sum(S0_T4.std_cost).subtract(sum(S0_T4.act_cost)).as("diff_cost"),
						sum(S0_T4.diff_wk).as("diff_wk")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.innerJoin(S0_T3).on(
							S0_T3.calc_no.eq(S0_T2.calc_no)
							.and(S0_T3.calc_grp_cd.eq(S0_T2.calc_grp_cd))
							.and(S0_T3.inpt_rec_no.eq(S0_T2.inpt_rec_no))
						)
						.leftOuterJoin(S0_T4).on(
							S0_T4.calc_no.eq(S0_T3.calc_no)
							.and(S0_T4.calc_grp_cd.eq(S0_T3.calc_grp_cd))
							.and(S0_T4.inpt_rec_no.eq(S0_T3.inpt_rec_no))
							.and(S0_T4.wk_rec_no.eq(S0_T3.wk_rec_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
						.leftOuterJoin(S0_LOC2).on(S0_LOC2.loc_cd.eq(S0_T3.loc_cd))
						.leftOuterJoin(S0_OPER).on(S0_OPER.oper_cd.eq(S0_T3.oper_cd))
						.leftOuterJoin(S0_WK_COST).on(S0_WK_COST.wk_cost_cd.eq(S0_T3.wk_cost_cd))
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T4.expns_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.and(S0_T2.lvl.eq(value(0)))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
					)
					.groupBy(
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T3.loc_cd,
						S0_LOC2.loc_nm,
						S0_T3.oper_cd,
						S0_OPER.oper_nm,
						S0_T3.oper_seq,
						S0_T3.wk_cost_cd,
						S0_WK_COST.wk_cost_nm,
						S0_WK_COST.wk_cost_unit_nm,
						S0_WK_COST.dec_place,
						S0_T4.expns_cd,
						S0_EXPNS.expns_grp_cd,
						S0_EXPNS.var_typ
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ALC_CALC_DTL_Query_S01
	 */
	static MCQueryPlan MGBFL0140_MGT_ALC_CALC_DTL_S01() {
		MGT_ALC_CALC_DTL_R S0_T = MGT_ALC_CALC_DTL_R.create("T");
		MGT_ALC_CALC_RATE_R S0_T2 = MGT_ALC_CALC_RATE_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAVM_RD_WG_R S0_WG2 = MAVM_RD_WG_R.create("WG2");
		MGT_ARG_R S0_ARG = MGT_ARG_R.create("ARG");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOCT2 = MAM_LOC_R.create("LOCT2");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_ALC_PTN_R S0_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ALC_CALC_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T2.ym,
						S0_T2.inpt_alc_typ,
						S0_T2.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T2.wg_cd,
						S0_WG2.wg_nm,
						S0_T2.dpt_cd,
						S0_DPT.dpt_nm,
						S0_T2.loc_cd,
						S0_LOCT2.loc_nm,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.bp_cd,
						S0_BP.bp_nm,
						S0_T2.ctg_cd,
						S0_CTG.ctg_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.itm_mfg_inst_no,
						S0_T2.iv_no,
						S0_T2.po_no,
						S0_T2.slo_no,
						S0_T2.std_alc_rate,
						S0_T2.alc_rate,
						S0_T2.expns_cd,
						S0_EXPNS.expns_nm,
						S0_T2.alc_ptn_cd,
						S0_ALC_PTN.alc_ptn_nm,
						S0_T2.diff_calc_typ,
						sum(S0_T.std_alc_tgt_val).as("std_alc_tgt_val"),
						sum(S0_T.alc_tgt_val).as("alc_tgt_val"),
						sum(S0_T.std_alc_amt).as("std_alc_amt"),
						sum(S0_T.alc_amt.add(S0_T.adj_amt)).as("alc_amt")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.alc_grp_id.eq(S0_T.alc_grp_id))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_WG2).on(S0_WG2.wg_cd.eq(S0_T2.wg_cd))
						.innerJoin(S0_ARG).on(
							S0_ARG.calc_no.eq(S0_T.calc_no)
							.and(S0_ARG.calc_grp_cd.eq(S0_T.calc_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC).on(S0_ALC_AC.alc_ac_cd.eq(S0_T2.alc_ac_cd))
						.leftOuterJoin(S0_DPT).on(
							S0_DPT.term.eq(S0_ARG.term)
							.and(S0_DPT.dpt_cd.eq(S0_T2.dpt_cd))
						)
						.leftOuterJoin(S0_LOCT2).on(S0_LOCT2.loc_cd.eq(S0_T2.loc_cd))
						.leftOuterJoin(S0_OPER).on(S0_OPER.oper_cd.eq(S0_T2.oper_cd))
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T2.bp_cd))
						.leftOuterJoin(S0_CTG).on(S0_CTG.ctg_cd.eq(S0_T2.ctg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))
						)
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T2.expns_cd))
						.leftOuterJoin(S0_ALC_PTN).on(S0_ALC_PTN.alc_ptn_cd.eq(S0_T2.alc_ptn_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.itm_mfg_inst_no.isNotNull())
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
					)
					.groupBy(
						S0_T2.ym,
						S0_T2.inpt_alc_typ,
						S0_T2.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T2.wg_cd,
						S0_WG2.wg_nm,
						S0_T2.dpt_cd,
						S0_DPT.dpt_nm,
						S0_T2.loc_cd,
						S0_LOCT2.loc_nm,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.bp_cd,
						S0_BP.bp_nm,
						S0_T2.ctg_cd,
						S0_CTG.ctg_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.itm_mfg_inst_no,
						S0_T2.iv_no,
						S0_T2.po_no,
						S0_T2.slo_no,
						S0_T2.std_alc_rate,
						S0_T2.alc_rate,
						S0_T2.expns_cd,
						S0_EXPNS.expns_nm,
						S0_T2.alc_ptn_cd,
						S0_ALC_PTN.alc_ptn_nm,
						S0_T2.diff_calc_typ
					)
					.orderBy(
						S0_T2.ym.asc(),
						S0_T2.inpt_alc_typ.asc(),
						S0_T2.alc_ac_cd.asc(),
						S0_T2.wg_cd.asc(),
						S0_T2.dpt_cd.asc(),
						S0_T2.loc_cd.asc(),
						S0_T2.oper_cd.asc(),
						S0_T2.bp_cd.asc(),
						S0_T2.ctg_cd.asc(),
						S0_T2.itm_cd.asc(),
						S0_T2.itm_sub1.asc(),
						S0_T2.itm_sub2.asc(),
						S0_T2.itm_sub3.asc(),
						S0_T2.lot_no.asc(),
						S0_T2.sublot_no.asc(),
						S0_T2.sno1.asc(),
						S0_T2.sno2.asc(),
						S0_T2.sno3.asc(),
						S0_T2.sno4.asc(),
						S0_T2.itm_mfg_inst_no.asc()
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ALC_CALC_DTL_Query_S02
	 */
	static MCQueryPlan MGBFL0140_MGT_ALC_CALC_DTL_S02() {
		MGT_ALC_CALC_DTL_R S0_T = MGT_ALC_CALC_DTL_R.create("T");
		MGT_ALC_CALC_RATE_R S0_T2 = MGT_ALC_CALC_RATE_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAVM_RD_WG_R S0_WG2 = MAVM_RD_WG_R.create("WG2");
		MGT_ARG_R S0_ARG = MGT_ARG_R.create("ARG");
		MAM_ALC_AC_R S0_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOCT2 = MAM_LOC_R.create("LOCT2");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_ALC_PTN_R S0_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ALC_CALC_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T2.ym,
						S0_T2.inpt_alc_typ,
						S0_T2.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T2.wg_cd,
						S0_WG2.wg_nm,
						S0_T2.dpt_cd,
						S0_DPT.dpt_nm,
						S0_T2.loc_cd,
						S0_LOCT2.loc_nm,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.bp_cd,
						S0_BP.bp_nm,
						S0_T2.ctg_cd,
						S0_CTG.ctg_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.itm_mfg_inst_no,
						S0_T2.iv_no,
						S0_T2.po_no,
						S0_T2.slo_no,
						S0_T2.std_alc_rate,
						S0_T2.alc_rate,
						S0_T2.expns_cd,
						S0_EXPNS.expns_nm,
						S0_T2.alc_ptn_cd,
						S0_ALC_PTN.alc_ptn_nm,
						S0_T2.diff_calc_typ,
						sum(S0_T.std_alc_tgt_val).as("std_alc_tgt_val"),
						sum(S0_T.alc_tgt_val).as("alc_tgt_val"),
						sum(S0_T.std_alc_amt).as("std_alc_amt"),
						sum(S0_T.alc_amt.add(S0_T.adj_amt)).as("alc_amt")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.alc_grp_id.eq(S0_T.alc_grp_id))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_WG2).on(S0_WG2.wg_cd.eq(S0_T2.wg_cd))
						.innerJoin(S0_ARG).on(
							S0_ARG.calc_no.eq(S0_T.calc_no)
							.and(S0_ARG.calc_grp_cd.eq(S0_T.calc_grp_cd))
						)
						.leftOuterJoin(S0_ALC_AC).on(S0_ALC_AC.alc_ac_cd.eq(S0_T2.alc_ac_cd))
						.leftOuterJoin(S0_DPT).on(
							S0_DPT.term.eq(S0_ARG.term)
							.and(S0_DPT.dpt_cd.eq(S0_T2.dpt_cd))
						)
						.leftOuterJoin(S0_LOCT2).on(S0_LOCT2.loc_cd.eq(S0_T2.loc_cd))
						.leftOuterJoin(S0_OPER).on(S0_OPER.oper_cd.eq(S0_T2.oper_cd))
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T2.bp_cd))
						.leftOuterJoin(S0_CTG).on(S0_CTG.ctg_cd.eq(S0_T2.ctg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T2.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T2.itm_sub3))
						)
						.leftOuterJoin(S0_EXPNS).on(S0_EXPNS.expns_cd.eq(S0_T2.expns_cd))
						.leftOuterJoin(S0_ALC_PTN).on(S0_ALC_PTN.alc_ptn_cd.eq(S0_T2.alc_ptn_cd))
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
						.leftOuterJoin(S0_STR_LN).on(
							S0_STR_LN.loc_cd.eq(S0_T.loc_cd)
							.and(S0_STR_LN.str_ln_cd.eq(S0_T.str_ln_cd))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(
							nvl(
								S0_T.oper_cd,
								value(MAC_STR.NULL_VAL.value())
							).eq(nvl(
									bind("oper_cd"),
									value(MAC_STR.NULL_VAL.value())
								)
							)
						)
						.and(S0_T.wk_cost_cd.eq(bind("wk_cost_cd")))
						.and(S0_T.loc_cd.eq(bind("loc_cd2")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
					)
					.groupBy(
						S0_T2.ym,
						S0_T2.inpt_alc_typ,
						S0_T2.alc_ac_cd,
						S0_ALC_AC.alc_ac_nm,
						S0_T2.wg_cd,
						S0_WG2.wg_nm,
						S0_T2.dpt_cd,
						S0_DPT.dpt_nm,
						S0_T2.loc_cd,
						S0_LOCT2.loc_nm,
						S0_T2.oper_cd,
						S0_OPER.oper_nm,
						S0_T2.bp_cd,
						S0_BP.bp_nm,
						S0_T2.ctg_cd,
						S0_CTG.ctg_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.itm_mfg_inst_no,
						S0_T2.iv_no,
						S0_T2.po_no,
						S0_T2.slo_no,
						S0_T2.std_alc_rate,
						S0_T2.alc_rate,
						S0_T2.expns_cd,
						S0_EXPNS.expns_nm,
						S0_T2.alc_ptn_cd,
						S0_ALC_PTN.alc_ptn_nm,
						S0_T2.diff_calc_typ
					)
					.orderBy(
						S0_T2.ym.asc(),
						S0_T2.inpt_alc_typ.asc(),
						S0_T2.alc_ac_cd.asc(),
						S0_T2.wg_cd.asc(),
						S0_T2.dpt_cd.asc(),
						S0_T2.loc_cd.asc(),
						S0_T2.oper_cd.asc(),
						S0_T2.bp_cd.asc(),
						S0_T2.ctg_cd.asc(),
						S0_T2.itm_cd.asc(),
						S0_T2.itm_sub1.asc(),
						S0_T2.itm_sub2.asc(),
						S0_T2.itm_sub3.asc(),
						S0_T2.lot_no.asc(),
						S0_T2.sublot_no.asc(),
						S0_T2.sno1.asc(),
						S0_T2.sno2.asc(),
						S0_T2.sno3.asc(),
						S0_T2.sno4.asc(),
						S0_T2.itm_mfg_inst_no.asc()
					)
			);
	}
	
	/**
	 * -- MGBFL0140_MGT_ITM_MFG_INST_Query_S01
	 */
	static MCQueryPlan MGBFL0140_MGT_ITM_MFG_INST_S01() {
		MGT_ITM_MFG_INST_R S0_INST = MGT_ITM_MFG_INST_R.create("INST");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_CALC_ITM_MFG_INST_R S1_CALC_INST = MGT_CALC_ITM_MFG_INST_R.create("CALC_INST");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0140_MGT_ITM_MFG_INST_Query_S01")
					.mainQuery()
					.select(sum(S0_INST.qty).as("inst_qty"))
					.from(S0_INST)
					.where(
						value(0).eq(value(0))
						.and(S0_INST.itm_cd.eq(bind("itm_cd")))
						.and(S0_INST.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_INST.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_INST.itm_sub3.eq(bind("itm_sub3")))
						.cutoff$and(S0_INST.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_INST.mfg_act_no.like(bind("mfg_act_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_T
									.innerJoin(S1_CALC_INST).on(
										S1_T.calc_no.eq(S1_CALC_INST.calc_no)
										.and(S1_T.calc_grp_cd.eq(S1_CALC_INST.calc_grp_cd))
										.and(S1_T.itm_cd.eq(S1_CALC_INST.itm_cd))
										.and(S1_T.itm_sub1.eq(S1_CALC_INST.itm_sub1))
										.and(S1_T.itm_sub2.eq(S1_CALC_INST.itm_sub2))
										.and(S1_T.itm_sub3.eq(S1_CALC_INST.itm_sub3))
										.and(S1_T.itm_mfg_inst_no.eq(S1_CALC_INST.itm_mfg_inst_no))
										.and(S1_T.mfg_act_no.eq(S1_CALC_INST.mfg_act_no))
									)
									.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
									.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
									.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
									.leftOuterJoin(S1_STR_LN).on(
										S1_STR_LN.loc_cd.eq(S1_T.loc_cd)
										.and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))
									)
								)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
									.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
									.and(S1_CALC_INST.calc_ctg_cd.eq(S0_INST.calc_ctg_cd))
									.and(S1_CALC_INST.itm_cd.eq(S0_INST.itm_cd))
									.and(S1_CALC_INST.itm_sub1.eq(S0_INST.itm_sub1))
									.and(S1_CALC_INST.itm_sub2.eq(S0_INST.itm_sub2))
									.and(S1_CALC_INST.itm_sub3.eq(S0_INST.itm_sub3))
									.and(S1_CALC_INST.itm_mfg_inst_no.eq(S0_INST.itm_mfg_inst_no))
									.and(S1_CALC_INST.mfg_act_no.eq(S0_INST.mfg_act_no))
									.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
									.cutoff$and(S1_T.ym.eq(bind("ym")))
									.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
									.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
									.cutoff$and(S1_T.sno1.like(bind("sno1")))
									.cutoff$and(S1_T.sno2.like(bind("sno2")))
									.cutoff$and(S1_T.sno3.like(bind("sno3")))
									.cutoff$and(S1_T.sno4.like(bind("sno4")))
									.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
									.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
									.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
									.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
									.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
									.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))
									.cutoff$and(S1_T.po_no.like(bind("po_no")))
									.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
									.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
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
								)
							)
						)
					)
			);
	}
}