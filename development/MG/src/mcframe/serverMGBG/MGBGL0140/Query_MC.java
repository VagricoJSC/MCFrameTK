package mcframe.serverMGBG.MGBGL0140;

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
	 * -- MGBGL0140_MGT_PRE_RATE_MLY_Query_S01
	 */
	static MCQueryPlan MGBGL0140_MGT_PRE_RATE_MLY_S01() {
		MGT_PRE_RATE_MLY_R S0_T1 = MGT_PRE_RATE_MLY_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0140_MGT_PRE_RATE_MLY_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pre_alc_rate_cd,
						S0_T1.ym
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T1.sa_typ.eq(bind("sa_typ")))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_T1.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
					)
					.groupBy(
						S0_T1.pre_alc_rate_cd,
						S0_T1.ym
					)
			);
	}
	
	/**
	 * -- MGBGL0140_MGT_PRE_RATE_TERM_Query_S01
	 */
	static MCQueryPlan MGBGL0140_MGT_PRE_RATE_TERM_S01() {
		MCTempView S0_M1 = createTempView("M1");
		MGT_PRE_RATE_TERM_R S0_T1 = MGT_PRE_RATE_TERM_R.create("T1");
		MAM_PRE_ALC_RATE_R S1_M1 = MAM_PRE_ALC_RATE_R.create("M1");
		MAM_TERM_R S1_M2 = MAM_TERM_R.create("M2");
		MAM_CALC_CTG_R S1_M3 = MAM_CALC_CTG_R.create("M3");
		MAM_PRE_ALC_PTN_R S1_M4 = MAM_PRE_ALC_PTN_R.create("M4");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_PRE_ALC_CTG_R S2_W = MAM_PRE_ALC_CTG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0140_MGT_PRE_RATE_TERM_Query_S01")
					.mainQuery()
					.selectDistinct(
						decode(
							S0_T1.pre_alc_rate_cd,
							nullValue(),
							value(false),
							value(true)
						).as("exist_flg"),
						S0_M1.pr(S1_WG.wg_cd),
						S0_M1.pr(S1_WG.wg_nm),
						S0_M1.pr("term"),
						S0_M1.pr(S1_M2.term_nm),
						S0_M1.pr(S1_M3.calc_ctg_cd),
						S0_M1.pr(S1_M3.calc_ctg_nm),
						S0_M1.pr(S1_M1.pre_alc_rate_cd),
						S0_M1.pr(S1_M1.pre_alc_rate_nm),
						S0_M1.pr(S1_M1.pre_alc_ptn_cd),
						S0_M1.pr(S1_M4.pre_alc_ptn_nm),
						S0_M1.pr(S1_M1.pln_mly_flg),
						S0_M1.pr(S1_M1.act_mly_flg),
						S0_M1.pr(S1_M1.pln_rule_flg)
					)
					.from(
						subQuery()
						.select(
							S1_M2.term.as("term"),
							S1_M2.term_nm,
							S1_M3.calc_ctg_cd,
							S1_M3.calc_ctg_nm,
							S1_WG.wg_cd,
							S1_WG.wg_nm,
							S1_M1.pre_alc_rate_cd,
							S1_M1.pre_alc_rate_nm,
							S1_M1.pre_alc_ptn_cd,
							S1_M4.pre_alc_ptn_nm,
							S1_M1.pln_mly_flg,
							S1_M1.act_mly_flg,
							S1_M1.pln_rule_flg
						)
						.from(
							S1_M1
							.innerJoin(S1_M2).on(S1_M2.term.eq(bind("term")))
							.innerJoin(S1_M3).on(S1_M3.calc_ctg_cd.eq(bind("calc_ctg_cd")))
							.leftOuterJoin(S1_M4).on(S1_M4.pre_alc_ptn_cd.eq(S1_M1.pre_alc_ptn_cd))
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(bind("wg_cd")))
						)
						.where(
							bracket(
								S1_M1.pln_mly_flg.eq(value(false))
								.or(
									S1_M1.act_mly_flg.eq(value(false))
									.and(S1_M1.pln_rule_flg.eq(value(false)))
								)
							)
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W)
									.where(
										S2_W.pre_alc_rate_cd.eq(S1_M1.pre_alc_rate_cd)
										.and(S2_W.wg_cd.eq(bind("wg_cd")))
										.and(S2_W.calc_ctg_cd.eq(bind("calc_ctg_cd")))
										.and(S2_W.term.eq(bind("term")))
									)
								)
							)
							.cutoff$and(S1_M1.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
							.cutoff$and(S1_M1.pre_alc_rate_nm.like(bind("pre_alc_rate_nm")))
						).view(S0_M1)
						.leftOuterJoin(S0_T1).on(
							S0_T1.pre_alc_rate_cd.eq(S0_M1.pr(S1_M1.pre_alc_rate_cd))
							.and(S0_T1.term.eq(S0_M1.pr("term")))
							.and(S0_T1.calc_ctg_cd.eq(S0_M1.pr(S1_M3.calc_ctg_cd)))
							.and(S0_T1.wg_cd.eq(S0_M1.pr(S1_WG.wg_cd)))
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_M1.pr(S1_WG.wg_cd).asc(),
						S0_M1.pr("term").asc(),
						S0_M1.pr(S1_M3.calc_ctg_cd).asc(),
						S0_M1.pr(S1_M1.pre_alc_rate_cd).asc()
					)
			);
	}
	
	/**
	 * -- MGBGL0140_MGT_PRE_RATE_TERM_Query_S02
	 */
	static MCQueryPlan MGBGL0140_MGT_PRE_RATE_TERM_S02() {
		MAM_PRE_ALC_RATE_R S0_M1 = MAM_PRE_ALC_RATE_R.create("M1");
		MAM_PRE_ALC_PTN_R S0_M2 = MAM_PRE_ALC_PTN_R.create("M2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_PRE_ALC_CTG_R S1_W = MAM_PRE_ALC_CTG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0140_MGT_PRE_RATE_TERM_Query_S02")
					.mainQuery()
					.select(
						S0_WG.wg_cd,
						S0_WG.wg_nm,
						S0_M1.pre_alc_rate_cd,
						S0_M1.pre_alc_rate_nm,
						S0_M1.pre_alc_ptn_cd,
						S0_M2.pre_alc_ptn_nm,
						S0_M1.pln_mly_flg,
						S0_M1.act_mly_flg,
						S0_M1.pln_rule_flg
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_M2).on(S0_M2.pre_alc_ptn_cd.eq(S0_M1.pre_alc_ptn_cd))
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(bind("wg_cd")))
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W)
								.where(
									S1_W.pre_alc_rate_cd.eq(S0_M1.pre_alc_rate_cd)
									.and(S1_W.calc_ctg_cd.eq(bind("calc_ctg_cd")))
									.and(S1_W.wg_cd.eq(bind("wg_cd")))
									.and(S1_W.term.eq(bind("term")))
								)
							)
						)
						.cutoff$and(S0_M1.pln_mly_flg.eq(bind("pln_mly_flg_str")))
						.cutoff$and(S0_M1.act_mly_flg.eq(bind("act_mly_flg_str")))
						.cutoff$and(S0_M1.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
						.cutoff$and(S0_M1.pre_alc_rate_nm.like(bind("pre_alc_rate_nm")))
					)
					.orderBy(
						S0_WG.wg_cd.asc(),
						S0_M1.pre_alc_rate_cd.asc()
					)
			);
	}
}