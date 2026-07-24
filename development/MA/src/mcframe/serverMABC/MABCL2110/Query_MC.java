package mcframe.serverMABC.MABCL2110;

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
import static mcframe.serverMABC.MABCL2110.Sql.*;

public class Query_MC {
	/**
	 * MABCL2110_MAM_CTG_CONFIG_Query_S01
	 */
	static String MABCL2110_MAM_CTG_CONFIG_S01() {
		return MCDatabaseManager.isOracle() ? MABCL2110_MAM_CTG_CONFIG_Query_S01_Ora
				: MABCL2110_MAM_CTG_CONFIG_Query_S01_Pos;
	}
	
	/**
	 * MABCL2110_MAM_CTG_CONFIG_Query_S02
	 */
	static String MABCL2110_MAM_CTG_CONFIG_S02() {
		return MCDatabaseManager.isOracle() ? MABCL2110_MAM_CTG_CONFIG_Query_S02_Ora
				: MABCL2110_MAM_CTG_CONFIG_Query_S02_Pos;
	}
	
	/**
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S03
	 */
	static MCQueryPlan MABCL2110_MAM_CTG_CONFIG_S03() {
		MAVM_CTG_CONFIG_R S0_T1 = MAVM_CTG_CONFIG_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2110_MAM_CTG_CONFIG_Query_S03")
					.mainQuery()
					.select(
						value(0).as("hrrchy"),
						value(0).as("loop_flg"),
						S0_T1.par_ctg_cd.as("ctg_cd")
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.par_ctg_cd.eq(bind("ctg_cd")))
						.and(S0_T1.term.eq(bind("term")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ctg_nm", m.ctg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MABCL2110_MAM_CTG_CONFIG_Query_S04
	 */
	static MCQueryPlan MABCL2110_MAM_CTG_CONFIG_S04() {
		MAM_COST_CTG_R S0_M1 = MAM_COST_CTG_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL2110_MAM_CTG_CONFIG_Query_S04")
					.mainQuery()
					.select(
						value(0).as("hrrchy"),
						value(0).as("loop_flg"),
						bind("chd_ctg_cd").as("ctg_cd"),
						S0_M1.ctg_nm
					)
					.from(S0_M1)
					.where(
						value(0).eq(value(0))
						.and(bind("chd_ctg_cd").eq(S0_M1.ctg_cd))
					)
			);
	}
}