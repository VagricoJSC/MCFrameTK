package mcframe.serverMABC.MABCL0400;

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
	 * -- MABCL0400_MAW_IMP_ITM_Query_I01
	 */
	static MCQueryPlan MABCL0400_MAW_IMP_ITM_I01() {
		MAW_IMP_ITM_R S0 = MAW_IMP_ITM_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL0400_MAW_IMP_ITM_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3
					)
					.values(
						bind("itm_cd"),
						bind("itm_sub1"),
						bind("itm_sub2"),
						bind("itm_sub3")
					)
			);
	}
}