package mcframe.serverMGBG.MGBGL0160;

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
	 * -- MGBGL0160_MAM_PRE_ALC_CTG_Query_S01
	 */
	static MCQueryPlan MGBGL0160_MAM_PRE_ALC_CTG_S01() {
		MAM_PRE_ALC_CTG_R S0_T = MAM_PRE_ALC_CTG_R.create("T");
		MAM_PRE_ALC_RATE_R S0_PRE_ALC_RATE = MAM_PRE_ALC_RATE_R.create("PRE_ALC_RATE");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAVM_WR_WG_R S0_DAC = MAVM_WR_WG_R.create("DAC");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MCTempView S0_PRE_RATE_MLY = createTempView("PRE_RATE_MLY");
		MGT_PRE_RATE_MLY_R S1_W = MGT_PRE_RATE_MLY_R.create("W");
		MGW_PRE_RATE_MLY_KEY_R S1_W2 = MGW_PRE_RATE_MLY_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0160_MAM_PRE_ALC_CTG_Query_S01")
					.mainQuery()
					.select(
						S1_W2.ym,
						S0_T.calc_ctg_cd,
						S0_CALC_CTG.calc_ctg_nm,
						S0_T.wg_cd,
						S0_DAC.wg_nm,
						S0_T.pre_alc_rate_cd,
						S0_PRE_ALC_RATE.pre_alc_rate_nm,
						S0_PRE_ALC_RATE.pre_alc_set_typ,
						S0_PRE_ALC_RATE.act_mly_flg,
						S0_PRE_ALC_RATE.pln_mly_flg,
						S0_PRE_ALC_RATE.pln_rule_flg,
						nvl2(
							S0_PRE_RATE_MLY.pr(S1_W.calc_ctg_cd),
							value(true),
							value(false)
						).as("exist_flg")
					)
					.from(
						S0_T
						.innerJoin(S0_PRE_ALC_RATE).on(
							bracket(
								S0_T.pre_alc_rate_cd.eq(S0_PRE_ALC_RATE.pre_alc_rate_cd)
								.and(S0_PRE_ALC_RATE.pre_alc_set_typ.isNotNull())
							)
						)
						.leftOuterJoin(S0_CALC_CTG).on(
							bracket(
								S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T.wg_cd.eq(S0_DAC.wg_cd)
							)
						)
						.leftOuterJoin(S1_W2).on(value(0).eq(value(0)))
						.innerJoin(S0_TERM).on(
							bracket(
								S0_T.term.eq(S0_TERM.term)
								.and(S0_TERM.term.lte(S1_W2.ym))
								.and(S0_TERM.term_end_ym.gt(S1_W2.ym))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_W.ym,
								S1_W.calc_ctg_cd,
								S1_W.pre_alc_rate_cd,
								S1_W.wg_cd
							)
							.from(S1_W)
							.where(
								value(0).eq(value(0))
								.and(S1_W.ym.gte(bind("tgt_ym_fr")))
								.and(S1_W.ym.lte(bind("tgt_ym_to")))
								.and(S1_W.sa_typ.eq(bind("sa_typ")))
								.cutoff$and(S1_W.calc_ctg_cd.like(bind("calc_ctg_cd")))
								.cutoff$and(S1_W.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
							)
							.groupBy(
								S1_W.ym,
								S1_W.calc_ctg_cd,
								S1_W.pre_alc_rate_cd,
								S1_W.wg_cd
							).view(S0_PRE_RATE_MLY)
						).on(
							bracket(
								S0_T.calc_ctg_cd.eq(S0_PRE_RATE_MLY.pr(S1_W.calc_ctg_cd))
								.and(S1_W2.ym.eq(S0_PRE_RATE_MLY.pr(S1_W.ym)))
								.and(S0_T.pre_alc_rate_cd.eq(S0_PRE_RATE_MLY.pr(S1_W.pre_alc_rate_cd)))
								.and(S0_T.wg_cd.eq(S0_PRE_RATE_MLY.pr(S1_W.wg_cd)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_DAC.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.pre_alc_rate_cd.like(bind("pre_alc_rate_cd")))
						.cutoff$and(S0_PRE_ALC_RATE.pre_alc_rate_nm.like(bind("pre_alc_rate_nm")))
						.cutoff$and(S0_PRE_ALC_RATE.pre_alc_set_typ.like(bind("pre_alc_set_typ")))
						.cutoff$and(S0_PRE_ALC_RATE.pln_mly_flg.eq(bind("pln_mly_flg_str")))
						.cutoff$and(S0_PRE_ALC_RATE.act_mly_flg.eq(bind("act_mly_flg_str")))
						.cutoff$and(
							bind("no_exist_flg_str").eq(value(true))
							.and(S0_PRE_RATE_MLY.pr(S1_W.calc_ctg_cd).isNull())
						)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.pre_alc_rate_cd.asc(),
						S1_W2.ym.asc()
					)
			);
	}
}