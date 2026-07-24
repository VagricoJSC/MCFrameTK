package mcframe.serverMABC.MABCL2120;

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

import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import static mcframe.serverMABC.MABCL2120.Sql.*;

public class Query_MC {
	/**
	 * MABCL2120_MAM_DPT_CONFIG_Query_S01
	 */
	static String MABCL2120_MAM_DPT_CONFIG_S01() {
		return MCDatabaseManager.isOracle() ? MABCL2120_MAM_DPT_CONFIG_Query_S01_Ora
				: MABCL2120_MAM_DPT_CONFIG_Query_S01_Pos;
	}
	
	/**
	 * MABCL2120_MAM_DPT_CONFIG_Query_S02
	 */
	static String MABCL2120_MAM_DPT_CONFIG_S02() {
		return MCDatabaseManager.isOracle() ? MABCL2120_MAM_DPT_CONFIG_Query_S02_Ora
				: MABCL2120_MAM_DPT_CONFIG_Query_S02_Pos;
	}
	
	/**
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S03
	 */
	static MCQueryPlan MABCL2120_MAM_DPT_CONFIG_S03() {
		MAVM_DPT_CONFIG_R S0_T1 = MAVM_DPT_CONFIG_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2120_MAM_DPT_CONFIG_Query_S03")
					.mainQuery()
					.select(
						value(0).as("hrrchy"),
						value(0).as("loop_flg"),
						S0_T1.par_dpt_cd.as("dpt_cd"),
						// this field is appended by sql coverter.
						S0_T1.term.as("join_term_")
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.par_dpt_cd.eq(bind("dpt_cd")))
						.and(S0_T1.term.eq(bind("term")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
					})
				)
			);
	}
	
	/**
	 * -- MABCL2120_MAM_DPT_CONFIG_Query_S04
	 */
	static MCQueryPlan MABCL2120_MAM_DPT_CONFIG_S04() {
		MAM_COST_DPT_R S0_M1 = MAM_COST_DPT_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2120_MAM_DPT_CONFIG_Query_S04")
					.mainQuery()
					.select(
						value(0).as("hrrchy"),
						value(0).as("loop_flg"),
						bind("chd_dpt_cd").as("dpt_cd"),
						S0_M1.dpt_nm
					)
					.from(S0_M1)
					.where(
						value(0).eq(value(0))
						.and(bind("chd_dpt_cd").eq(S0_M1.dpt_cd))
						.and(bind("chd_term").eq(S0_M1.term))
					)
			);
	}
}