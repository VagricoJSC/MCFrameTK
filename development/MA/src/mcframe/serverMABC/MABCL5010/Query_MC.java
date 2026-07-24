package mcframe.serverMABC.MABCL5010;

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
	 * -- MABCL5010_MAM_SUNDRY_ITM_Query_S01
	 */
	static MCQueryPlan MABCL5010_MAM_SUNDRY_ITM_S01() {
		MAW_SUNDRY_ITM_KEY_R S0_W1 = MAW_SUNDRY_ITM_KEY_R.create("W1");
		MAM_SUNDRY_ITM_R S0_T1 = MAM_SUNDRY_ITM_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL5010_MAM_SUNDRY_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.itm_nm
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.sno1.eq(S0_T1.sno1))
								.and(S0_W1.sno2.eq(S0_T1.sno2))
								.and(S0_W1.sno3.eq(S0_T1.sno3))
								.and(S0_W1.sno4.eq(S0_T1.sno4))
							)
						)
					)
					.forUpdate(S0_T1.itm_cd)
			);
	}
	
}