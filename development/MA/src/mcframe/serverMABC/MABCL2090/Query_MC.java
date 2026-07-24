package mcframe.serverMABC.MABCL2090;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MABCL2090_MAM_AC_DPT_Query_S01
	 */
	static MCQueryPlan MABCL2090_MAM_AC_DPT_S01() {
		MAM_AC_DPT_R S0_M1 = MAM_AC_DPT_R.create("M1");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_X = MAM_COST_DPT_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2090_MAM_AC_DPT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_M1.ac_dpt_cd,
						S0_M1.ac_dpt_nm,
						S0_TERM.term
					)
					.from(
						S0_M1
						.crossJoin(S0_TERM)
					)
					.where(
						value(0).eq(value(0))
						.and(bind("tgt_dt").between(S0_M1.st_dt, S0_M1.end_dt))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(bind("tgt_dt").between(S0_TERM.term, S0_TERM.term_end_ym.subtractDays(value(1))))
						.cutoff$and(
							bracket(
								bind("ins_only").eq(value(true))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S1_X)
										.where(
											S1_X.dpt_cd.eq(S0_M1.ac_dpt_cd)
											.and(S1_X.term.eq(S0_TERM.term))
										)
									)
								)
							)
						)
					)
			);
	}

	/**
	 * -- MABCL2090_MAM_COST_DPT_Query_S01
	 */
	static MCQueryPlan MABCL2090_MAM_COST_DPT_S01() {
		MAW_COST_DPT_KEY_R S0_W1 = MAW_COST_DPT_KEY_R.create("W1");
		MAM_COST_DPT_R S0_T1 = MAM_COST_DPT_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2090_MAM_COST_DPT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.term
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_W1.term.eq(S0_T1.term))
							)
						)
					)
					.forUpdate(S0_T1.dpt_cd)
			);
	}
}