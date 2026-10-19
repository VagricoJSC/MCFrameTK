package mcframe.serverMSBB.MSBBLA0010;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class Query extends Query_MC  {

	/**
	 * -- MSBBLA0010_MST_SLS_SCHD_D_S01
	 */
	public static MCQueryPlan MSBBLA0010_MST_SLS_SCHD_D_S01() {
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_D_R t1 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_D_R.create("T1");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_D_S01")
				.mainQuery()
				.select(t1.getAllColumn$())
				.from(t1)
				);
	}


	/**
	 * -- MSBBLA0010_MST_SLS_SCHD_S01
	 */
	public static MCQueryPlan MSBBLA0010_MST_SLS_SCHD_S01() {
		mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R t1 = mcframe.serverMS.dbc.MST_ZOHO_SLS_SCHD_R.create("T1");
		
		return createQueryPlan().setQuery(
				sql("MSBBLA0010_MST_SLS_SCHD_S01")
				.mainQuery()
				.select(t1.getAllColumn$())
				.from(t1)
				);

	}
	
	
}
