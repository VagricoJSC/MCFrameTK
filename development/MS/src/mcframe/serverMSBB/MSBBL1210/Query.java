package mcframe.serverMSBB.MSBBL1210;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMA.dbc.MAM_COLLAT_EXP_ALL_R;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public class Query extends Query_MC  {

	/**
	 * -- MSBBL1210_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1210_MAM_COLLAT_EXP_S01() {
		MAM_COLLAT_EXP_ALL_R m1 = MAM_COLLAT_EXP_ALL_R.create("M1");
		return createQueryPlan()
				.setQuery(
						sql("MSBBL1210_MST_SLO_Query_S01")
							.mainQuery()
							.select(m1.prAll())
							.from(m1
							)
							.where(m1.match_key.eq(bind("match_key")))
							.orderBy(m1.itm_cd.asc())
						)
						;
	}
}
