package mcframe.serverMGBF.MGBFL0210;

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
	 * -- MGBFL0210_MGT_WIP_LOC_Query_S01
	 */
	static MCQueryPlan MGBFL0210_MGT_WIP_LOC_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_WIP_LOC_R S1_T = MGT_WIP_LOC_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0210_MGT_WIP_LOC_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.ym,
							S1_T.wg_cd,
							S1_T.mng_dpt_cd,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.expns_cd,
							S1_T.st_wip_amt,
							S1_T.prod_amt,
							S1_T.inpt_amt,
							S1_T.comp_amt,
							S1_T.end_wip_amt,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
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
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
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
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.expns_cd)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.st_wip_amt)).as("st_wip_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.prod_amt)).as("prod_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.inpt_amt)).as("inpt_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.comp_amt)).as("comp_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.end_wip_amt)).as("end_wip_amt")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("mng_dpt_nm", "mng_dpt_flg"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd).and(S1_MNG_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
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
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd).asc()),
				when(boundOr("site_flg"))
					.orderBy(DS0D, S0_T.pr("site_cd").asc()),
				when(boundOr("loc_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.loc_cd).asc()),
				when(boundOr("str_ln_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.str_ln_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc())
			);
	}
	
	/**
	 * -- MGBFL0210_MGT_WIP_LOC_Query_S02
	 */
	static MCQueryPlan MGBFL0210_MGT_WIP_LOC_S02() {
		MGT_WIP_LOC_R S0_T = MGT_WIP_LOC_R.create("T");
		MAW_DPT_LOC_R S0_T2 = MAW_DPT_LOC_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MGT_ARG_R S0_ARG = MGT_ARG_R.create("ARG");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0210_MGT_WIP_LOC_Query_S02")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T2.dpt_cd.as("mng_dpt_cd"),
						S0_MNG_DPT.dpt_nm.as("mng_dpt_nm"),
						S0_T.expns_cd,
						sum(S0_T.st_wip_amt).as("st_wip_amt"),
						sum(S0_T.prod_amt).as("prod_amt"),
						sum(S0_T.inpt_amt).as("inpt_amt"),
						sum(S0_T.comp_amt).as("comp_amt"),
						sum(S0_T.end_wip_amt).as("end_wip_amt")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.loc_cd.eq(S0_T.loc_cd)
							.and(
								S0_T2.oper_cd.eq(S0_T.oper_cd)
								.or(S0_T2.oper_cd.isNull())
								.and(S0_T2.oper_null_flg.eq(value(false)))
								.or(S0_T2.oper_cd.isNull())
								.and(S0_T2.oper_null_flg.eq(value(true)))
								.and(S0_T.oper_cd.isNull())
							)
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_ARG).on(
							S0_ARG.calc_no.eq(S0_T.calc_no)
							.and(S0_ARG.calc_grp_cd.eq(S0_T.calc_grp_cd))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.term.eq(S0_ARG.term)
							.and(S0_MNG_DPT.dpt_cd.eq(S0_T2.dpt_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
						.cutoff$and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.eq(bind("wg_nm")))
						.cutoff$and(S0_T2.dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
					)
					.groupBy(
						S0_T.ym,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T2.dpt_cd,
						S0_MNG_DPT.dpt_nm,
						S0_T.expns_cd
					)
					.orderBy(
						S0_T.ym.asc(),
						S0_T.wg_cd.asc(),
						S0_T2.dpt_cd.asc()
					)
			);
	}
}