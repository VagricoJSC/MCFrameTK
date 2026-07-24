package mcframe.serverMGBA.MGBAL0140;

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
	 * -- MGBAL0140_MGT_PLN_OTHER_WK_Query_S01
	 */
	static MCQueryPlan MGBAL0140_MGT_PLN_OTHER_WK_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_PLN_OTHER_WK_R S1_T = MGT_PLN_OTHER_WK_R.create("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MGT_ACT_OTHER_WK_R S2_T = MGT_ACT_OTHER_WK_R.create("T");
		MAVM_RD_WG_R S2_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_WK_COST_R S2_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_COST_CTG_R S2_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S2_OPER = MAM_OPER_R.create("OPER");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S2_DPT = MAM_COST_DPT_R.create("DPT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0140_MGT_PLN_OTHER_WK_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.dpt_cd,
							S1_T.ctg_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
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
							.cutoff$and(S1_T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S1_T.ctg_cd.like(bind("ctg_cd")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.wk_cost_cd.like(bind("wk_cost_cd")))
							.cutoff$and(S1_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
							.addDynamicPredicate(DS1D)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T.dpt_cd,
								S2_T.ctg_cd,
								S2_T.loc_cd,
								S2_T.oper_cd,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
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
								.innerJoin(S2_DAC).on(S2_T.wg_cd.eq(S2_DAC.wg_cd))
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
								.cutoff$and(S2_T.dpt_cd.like(bind("dpt_cd")))
								.cutoff$and(S2_T.ctg_cd.like(bind("ctg_cd")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_T.oper_cd.like(bind("oper_cd")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.wk_cost_cd.like(bind("wk_cost_cd")))
								.cutoff$and(S2_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))
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
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
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
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
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
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_TERM.term.eq(S1_DPT.term).and(S1_T.dpt_cd.eq(S1_DPT.dpt_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("ctg_flg"))
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wg_flg"))
					.select(DS2D, S2_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS2D, S2_DAC.wg_nm),
				when(boundOr("dpt_flg"))
					.select(DS2D, S2_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS2D, S2_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS2D, v -> v.innerJoin(S2_TERM).on(S2_T.ym.gte(S2_TERM.term).and(S2_T.ym.lt(S2_TERM.term_end_ym)))),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DPT).on(S2_TERM.term.eq(S2_DPT.term).and(S2_T.dpt_cd.eq(S2_DPT.dpt_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("ctg_flg"))
					.select(DS2D, S2_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS2D, S2_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CTG).on(S2_T.ctg_cd.eq(S2_CTG.ctg_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("site_flg"))
					.select(DS2D, S2_LOC.site_cd.as("site_cd"))
					.groupBy(DS2D, S2_LOC.site_cd),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_LOC).on(S2_T.loc_cd.eq(S2_LOC.loc_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS2D, S2_SITE.site_nm.as("site_nm"))
					.groupBy(DS2D, S2_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SITE).on(S2_LOC.site_cd.eq(S2_SITE.site_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS2D, S2_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS2D, S2_LOC.loc_nm),
				when(boundOr("oper_flg"))
					.select(DS2D, S2_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS2D, S2_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_OPER).on(S2_T.oper_cd.eq(S2_OPER.oper_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_OPER.oper_nm.like(bind("oper_nm"))))
			);
	}
}