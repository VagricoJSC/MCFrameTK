package mcframe.serverMGBF.MGBFL0400;

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
	
	/**
	 * -- MGBFL0400_MAM_RPT_KEY_CONF_Query_S01
	 */
	static MCQueryPlan MGBFL0400_MAM_RPT_KEY_CONF_S01() {
		MAM_RPT_KEY_CONF_R S0T = MAM_RPT_KEY_CONF_R.create("T");
		MAM_COST_DPT_R S0DPT = MAM_COST_DPT_R.create("DPT");
		MAM_WG_R S0WG = MAM_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_JNL_R S0ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_GRP_R S0ITM_GRP = MAM_ITM_GRP_R.create("ITM_GRP");
		MGT_CALC_FIX_R S0CALC_FIX = MGT_CALC_FIX_R.create("CALC_FIX");
		MGT_ARG_R S0ARG = MGT_ARG_R.create("ARG");
		MGT_CALC_FIX_R S1T2 = MGT_CALC_FIX_R.create("T2");
		MAVM_RD_WG_R S2DAC = MAVM_RD_WG_R.create("DAC");

		return createQueryPlan()
				.setQuery(
						sql("MGBFL0400_MAM_RPT_KEY_CONF_Query_S01")
						.mainQuery()
						.selectDistinct(
							S0T.rpt_key_seq,
							S0T.dpt_cd,
							S0DPT.dpt_nm,
							S0T.wg_cd,
							S0WG.wg_nm,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0ITM.itm_nm,
							S0T.itm_jnl_cd,
							S0ITM_JNL.itm_jnl_nm,
							S0T.itm_grp_typ,
							S0T.itm_grp_cd,
							S0ITM_GRP.itm_grp_nm
						)
						.from(
							S0T
							.innerJoin(S0CALC_FIX).on(
									S0CALC_FIX.calc_grp_cd.eq(bind("calc_grp_cd"))
									.and(
										S0CALC_FIX.ym.eq(subQuery()
											.select(max(S1T2.ym))
											.from(S1T2)
											.where(
												value(0).eq(value(0))
												.and(S1T2.calc_grp_cd.eq(bind("calc_grp_cd")))
												.and(S1T2.ym.gte(bind("ym_fr")))
												.and(S1T2.ym.lte(bind("ym_to")))
											)
										)
								)
							)
							.innerJoin(S0ARG).on(
									S0CALC_FIX.calc_no.eq(S0ARG.calc_no)
									.and(S0CALC_FIX.calc_grp_cd.eq(S0ARG.calc_grp_cd))
							)
							.leftOuterJoin(S0DPT).on(
									S0T.dpt_cd.eq(S0DPT.dpt_cd)
									.and(S0ARG.term.eq(S0DPT.term))
							)
							.leftOuterJoin(S0WG).on(
									S0T.wg_cd.eq(S0WG.wg_cd)
							)
							.leftOuterJoin(S0ITM).on(
									S0T.itm_cd.eq(S0ITM.itm_cd)
									.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
									.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
									.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0ITM_JNL).on(
									S0T.itm_jnl_cd.eq(S0ITM_JNL.itm_jnl_cd)
							)
							.leftOuterJoin(S0ITM_GRP).on(
									S0T.itm_grp_typ.eq(S0ITM_GRP.itm_grp_typ)
									.and(S0T.itm_grp_cd.eq(S0ITM_GRP.itm_grp_cd))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S0T.wg_cd.isNull()
								.or(
									exists(
										subQuery()
										.select(S2DAC.wg_cd)
										.from(S2DAC)
										.where(
											S0T.wg_cd.eq(S2DAC.wg_cd)
										)
									)
								)
							)
							.and(S0T.rpt_key_cd.eq(bind("rpt_key_cd")))
							.cutoff$and(S0T.dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(
								bracket(
									S0T.wg_cd.isNull()
									.or(S0T.wg_cd.like(bind("wg_cd")))
								)
							)
							.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S0ITM.itm_nm.like(bind("itm_nm")))
							.cutoff$and(S0T.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S0ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
							.cutoff$and(S0T.itm_grp_cd.like(bind("itm_grp_cd")))
							.cutoff$and(S0ITM_GRP.itm_grp_nm.like(bind("itm_grp_nm")))
							.cutoff$and(S0T.itm_grp_typ.eq(bind("itm_grp_typ")))
						)
					);
	}
	
	/**
	 * -- MGBFL0400_MGT_CALC_FIX_Query_S01
	 */
	static MCQueryPlan MGBFL0400_MGT_CALC_FIX_S01() {
		MGT_CALC_FIX_R S0_T = MGT_CALC_FIX_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0400_MGT_CALC_FIX_Query_S01")
					.mainQuery()
					.select(max(S0_T.ym).as("max_month"))
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.ym.gte(bind("ym_fr")))
						.and(S0_T.ym.lte(bind("ym_to")))
					)
			);
	}
	
	/**
	 * -- MGBFL0400_MGT_CALC_FIX_Query_S02
	 */
	static MCQueryPlan MGBFL0400_MGT_CALC_FIX_S02() {
		MGT_CALC_FIX_R S0_T = MGT_CALC_FIX_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0400_MGT_CALC_FIX_Query_S02")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_T.calc_no
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
					)
			);
	}
	
	/*
	 * MGBFL0400_MGT_RPT_S01
	 */
	static MCQueryPlan MGBFL0400_MGT_RPT_S01(List<String[]> bindList, List<String> ymList, String rptKeyTyp) {
		MGT_RPT_R S0T = MGT_RPT_R.create("T");
		MGT_CALC_FIX_R S0CALC_FIX = MGT_CALC_FIX_R.create("CALC_FIX");
		MAM_RPT_CONF_R S0RPT_CONF = MAM_RPT_CONF_R.create("RPT_CONF");
		MAVM_RD_WG_R S0DAC = MAVM_RD_WG_R.create("DAC");
		MGT_ARG_R ARG = MGT_ARG_R.create("ARG");
		MAM_COST_DPT_R DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_JNL_R ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_GRP_R ITM_GRP = MAM_ITM_GRP_R.create("ITM_GRP");

		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0400_MGT_RPT_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T.rpt_row_cd,
							S0T.ym,
							S0T.dpt_cd,
							S0T.wg_cd,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0T.itm_jnl_cd,
							S0T.itm_grp_typ,
							S0T.itm_grp_cd,
							S0T.rpt_val,
							S0RPT_CONF.rpt_tgt_typ,
							S0RPT_CONF.rpt_pre_word,
							S0RPT_CONF.rpt_row_nm,
							S0RPT_CONF.rpt_seq,
							S0RPT_CONF.fg_r,
							S0RPT_CONF.fg_g,
							S0RPT_CONF.fg_b,
							S0RPT_CONF.bg_r,
							S0RPT_CONF.bg_g,
							S0RPT_CONF.bg_b,
							S0RPT_CONF.qty_unit_typ,
							addDynamicSelect(core)
						)
						.from(
							S0T
							.innerJoin(S0CALC_FIX).on(
								S0CALC_FIX.calc_grp_cd.eq(bind("calc_grp_cd"))
								.and(S0CALC_FIX.ym.gte(bind("ym_fr")))
								.and(S0CALC_FIX.ym.lte(bind("ym_to")))
								.and(S0T.calc_no.eq(S0CALC_FIX.calc_no))
								.and(S0T.calc_grp_cd.eq(S0CALC_FIX.calc_grp_cd))
								.and(S0T.ym.eq(S0CALC_FIX.ym))
							)
							.innerJoin(S0RPT_CONF).on(
								S0RPT_CONF.rpt_ptn_cd.eq(S0T.rpt_ptn_cd)
								.and(S0RPT_CONF.rpt_row_cd.eq(S0T.rpt_row_cd))
								.and(S0RPT_CONF.hdn_flg.eq(value(false)))
							)
							.innerJoin(S0DAC).on(S0T.wg_cd.eq(S0DAC.wg_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.rpt_ptn_cd.eq(bind("rpt_ptn_cd")))
							.and(S0T.rpt_key_cd.eq(bind("rpt_key_cd")))
							.cutoff$and(S0T.dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S0T.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S0T.itm_grp_cd.like(bind("itm_grp_cd")))
							.cutoff$and(S0T.itm_grp_typ.eq(bind("itm_grp_typ")))
							.cutoff$and(S0T.wg_cd.like(bind("wg_cd")))
							.addDynamicPredicate(core)
						)
						.groupBy(
							S0T.rpt_row_cd,
							S0T.ym,
							S0T.dpt_cd,
							S0T.wg_cd,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0T.itm_jnl_cd,
							S0T.itm_grp_typ,
							S0T.itm_grp_cd,
							S0T.rpt_val,
							S0RPT_CONF.rpt_tgt_typ,
							S0RPT_CONF.rpt_pre_word,
							S0RPT_CONF.rpt_row_nm,
							S0RPT_CONF.rpt_seq,
							S0RPT_CONF.fg_r,
							S0RPT_CONF.fg_g,
							S0RPT_CONF.fg_b,
							S0RPT_CONF.bg_r,
							S0RPT_CONF.bg_g,
							S0RPT_CONF.bg_b,
							S0RPT_CONF.qty_unit_typ
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
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("rpt_seq"))
					.groupBy(aggr,T.pr("rpt_seq"))
					.orderBy(T.pr("rpt_seq").asc()),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T.calc_no.eq(ARG.calc_no).and(S0T.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("rpt_row_cd"))
					.groupBy(aggr,T.pr("rpt_row_cd")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("rpt_tgt_typ"))
					.groupBy(aggr,T.pr("rpt_tgt_typ")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("rpt_pre_word"))
					.groupBy(aggr,T.pr("rpt_pre_word")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("rpt_row_nm"))
					.groupBy(aggr,T.pr("rpt_row_nm")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("fg_r"))
					.groupBy(aggr,T.pr("fg_r")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("fg_g"))
					.groupBy(aggr,T.pr("fg_g")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("fg_b"))
					.groupBy(aggr,T.pr("fg_b")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("bg_r"))
					.groupBy(aggr,T.pr("bg_r")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("bg_g"))
					.groupBy(aggr,T.pr("bg_g")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("bg_b"))
					.groupBy(aggr,T.pr("bg_b")),
				createDynamicSQLInfo()
					.when(null)
					.select(aggr,T.pr("qty_unit_typ"))
					.groupBy(aggr,T.pr("qty_unit_typ")),
				createDynamicSQLInfo()
					.when(boundOr("mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(DPT).on(S0T.dpt_cd.eq(DPT.dpt_cd).and(ARG.term.eq(DPT.term))))
					.predicate(core, p -> p.cutoff$and(DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_nm"))
					.view(core, v -> v.leftOuterJoin(ITM).on(S0T.itm_cd.eq(ITM.itm_cd).and(S0T.itm_sub1.eq(ITM.itm_sub1)).and(S0T.itm_sub2.eq(ITM.itm_sub2)).and(S0T.itm_sub3.eq(ITM.itm_sub3))))
					.predicate(core, p -> p.cutoff$and(ITM.itm_nm.like(bind("ITM_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_jnl_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_JNL).on(S0T.itm_jnl_cd.eq(ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_JNL.itm_jnl_nm.like(bind("ITM_JNL_NM")))),
				createDynamicSQLInfo()
					.when(boundOr("itm_grp_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP).on(S0T.itm_grp_cd.eq(ITM_GRP.itm_grp_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_GRP.itm_grp_nm.like(bind("ITM_GRP_NM"))))
				)
			.addDynamicSQLInfo(MGBFL0400_MGT_RPT_S01_ADD(bindList, ymList, rptKeyTyp));
	}

	/*
	 * MGBFL0400_MGT_RPT_S01_ADD
	 */
	static MCDynamicSQLInfo[] MGBFL0400_MGT_RPT_S01_ADD(List<String[]> bindList, List<String> ymList, String rptKeyTyp) {
		MCTempView T = createTempView("T");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");
		List<MCDynamicSQLInfo> l = new ArrayList<MCDynamicSQLInfo>();
		String col = "col_";
		int i = 0;

		for (String[] b : bindList) {
			for (String ym : ymList) {
				if (MAC_RPT_KEY_TYP.isMNG_DPT(rptKeyTyp)) {
					l.add(createDynamicSQLInfo().when(null).select(aggr,
							nullIf(nvl(sum(decode(T.pr("ym"), bind(ym),
									decode(T.pr("dpt_cd"), bind(b[0]), T.pr("rpt_val"),
											value(0)),
									value(0))), value(0)), value(0)).as(col + i)));
				}
				else if (MAC_RPT_KEY_TYP.isWG(rptKeyTyp)) {
					l.add(createDynamicSQLInfo().when(null).select(aggr,
							nullIf(nvl(sum(decode(T.pr("ym"), bind(ym),
									decode(T.pr("wg_cd"), bind(b[0]), T.pr("rpt_val"),
											value(0)),
									value(0))), value(0)), value(0)).as(col + i)));
				}
				else if (MAC_RPT_KEY_TYP.isITM(rptKeyTyp)) {
					l.add(createDynamicSQLInfo().when(null).select(aggr,
							nullIf(nvl(sum(decode(T.pr("ym"), bind(ym), decode(
									T.pr("itm_cd"), bind(b[0]),
									decode(T.pr("itm_sub1"), bind(b[1]),
											decode(T.pr("itm_sub2"), bind(b[2]),
													decode(T.pr("itm_sub3"), bind(b[3]),
															T.pr("rpt_val"), value(0)),
													value(0)),
											value(0)),
									value(0)), value(0))), value(0)), value(0))
											.as(col + i)));
				}
				else if (MAC_RPT_KEY_TYP.isITM_JNL(rptKeyTyp)) {
					l.add(createDynamicSQLInfo().when(null).select(aggr, nullIf(nvl(
							sum(decode(T.pr("ym"), bind(ym),
									decode(T.pr("itm_jnl_cd"), bind(b[0]),
											T.pr("rpt_val"), value(0)),
									value(0))),
							value(0)), value(0)).as(col + i)));
				}
				else {
					l.add(createDynamicSQLInfo().when(null)
							.select(aggr, nullIf(
									nvl(sum(decode(T.pr("ym"), bind(ym),
											decode(T.pr("itm_grp_typ"), bind(b[0]),
													decode(T.pr("itm_grp_cd"), bind(b[1]),
															T.pr("rpt_val"), value(0)),
													value(0)),
											value(0))), value(0)),
									value(0)).as(col + i)));
				}
				i++;
			}
		}
		return l.toArray(new MCDynamicSQLInfo[0]);
	}
}