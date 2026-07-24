package mcframe.serverMSUC.MSUCL0050;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMS.dbc.MST_CLOSE_R;
import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

public class Query_MC {

	static MCQueryPlan MSUCL0050_MST_CLOSE_S01() {
		MST_CLOSE_R S1 = MST_CLOSE_R.create();
		MST_CLOSE_R S2 = MST_CLOSE_R.create();
		MST_CLOSE_R S3 = MST_CLOSE_R.create();
		MST_CLOSE_R S4 = MST_CLOSE_R.create();
		MST_CLOSE_R S5 = MST_CLOSE_R.create();

		return createQueryPlan().setQuery(sql("MSUCL0050_MST_CLOSE_Query_S01")
			.mainQuery()
			.select(
					subQuery()
						.select(max(S1.ym))
						.from(S1)
						.where(
							S1.sls_cl_flg.eq(value(true))
					).as("sls_cl_ym"),
					subQuery()
						.select(max(S2.ym))
						.from(S2)
						.where(
							S2.purc_cl_flg.eq(value(true))
					).as("purc_cl_ym"),
					subQuery()
						.select(max(S3.ym))
						.from(S3)
						.where(
							S3.rcv_cl_flg.eq(value(true))
					).as("rcv_cl_ym"),
					subQuery()
						.select(max(S4.ym))
						.from(S4)
						.where(
							S4.pay_cl_flg.eq(value(true))
					).as("pay_cl_ym"),
					subQuery()
						.select(max(S5.ym))
						.from(S5)
						.where(
							S5.stk_cl_flg.eq(value(true))
					).as("stk_cl_ym")
				));
	}

}