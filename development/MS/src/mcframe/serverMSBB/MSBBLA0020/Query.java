package mcframe.serverMSBB.MSBBLA0020;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class Query extends Query_MC  {


	/**
	 * -- MSBBLA0020_SHIP_ITM_COMP_SRCH_S01
	 */
	public static MCQueryPlan MSBBLA0020_SHIP_ITM_COMP_SRCH_S01() {
		mcframe.serverMA.dbc.MAM_ITEM_SHIP_COMP_R t1 = mcframe.serverMA.dbc.MAM_ITEM_SHIP_COMP_R.create("T1");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0020_SHIP_ITM_COMP_SRCH_S01")
				.mainQuery()
				.select(t1.getAllColumn$())
				.from(t1)
				);

	}
	
	
}
