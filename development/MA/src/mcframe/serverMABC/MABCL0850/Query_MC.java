package mcframe.serverMABC.MABCL0850;

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
import static mcframe.serverMABC.MABCL0850.Sql.*;

public class Query_MC {
	/**
	 * MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01
	 */
	static String MABCL0850_MAM_SLS_ITM_GRP_LCL_S01() {
		return MCDatabaseManager.isOracle() ? MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Ora
				: MABCL0850_MAM_SLS_ITM_GRP_LCL_Query_S01_Pos;
	}

	/**
	 * MABCL0850_MAM_SLS_ITM_GRP_Query_S01
	 */
	static String MABCL0850_MAM_SLS_ITM_GRP_S01() {
		return MCDatabaseManager.isOracle() ? MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Ora
				: MABCL0850_MAM_SLS_ITM_GRP_Query_S01_Pos;
	}
}