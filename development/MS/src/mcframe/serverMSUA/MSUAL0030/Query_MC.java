package mcframe.serverMSUA.MSUAL0030;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMA.dbc.MAM_SLO_ALLOC_GD_R;
import mcframe.serverMA.dbc.MAM_STK_GD_R;
import mcframe.serverMS.dbc.MSW_SLO_ALLOC_GD_LL_R;
import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMA.dbc.MAFunction.*;

import mcframe.commonMA.constant.MAC_STR;

import static mcframe.serverCore.queryapi.MCQueryExecution.*;

public class Query_MC {

	static MCQueryPlan MSUAL0030_MSW_SLO_ALLOC_GD_LL_S01() {
		MSW_SLO_ALLOC_GD_LL_R S0WK = MSW_SLO_ALLOC_GD_LL_R.create("WK");
		MAM_STK_GD_R S0M = MAM_STK_GD_R.create("M");
		MAM_SLO_ALLOC_GD_R S1X = MAM_SLO_ALLOC_GD_R.create("X");
		MSW_SLO_ALLOC_GD_LL_R S2WK = MSW_SLO_ALLOC_GD_LL_R.create("WK");
		MAM_SLO_ALLOC_GD_R S2M = MAM_SLO_ALLOC_GD_R.create("M");
		MAM_STK_GD_R S2M2 = MAM_STK_GD_R.create("M2");

		return createQueryPlan().setQuery(
				sql("MSUAL0030_MSW_SLO_ALLOC_GD_LL_Query_S01")
			.mainQuery()
			.selectDistinct(
				S0WK.cst_cd.as("cst_cd"),
				S0WK.dlv_cd.as("dlv_cd"),
				S0M.gd_cd.as("gd_cd"),
				S0M.gd_nm.as("gd_nm"),
				S0M.sort_seq.as("sort_seq")
			)
			.from(
				S0WK
				.innerJoin(S0M).on(
					bracket(
						S0M.gd_cd.eq(nvl(
								S0WK.gd_cd,
								S0M.gd_cd
							)
						)
					)
				)
			)
			.where(
				value(0).eq(value(0))
				.and(S0M.slo_flg.eq(value(true)))
				.and(
					notExists(
						subQuery()
						.select(value("X"))
						.from(S1X)
						.where(
							S1X.cst_cd.eq(S0WK.cst_cd)
							.and(
								bracket(
									S1X.dlv_cd.eq(S0WK.dlv_cd)
									.or(S1X.dlv_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S0WK.dlv_cd.isNull())
							)
						)
					)
				)
			)
			.unionAll(
				subQuery()
				.selectDistinct(
					S2WK.cst_cd.as("cst_cd"),
					S2WK.dlv_cd.as("dlv_cd"),
					S2M.gd_cd.as("gd_cd"),
					S2M2.gd_nm.as("gd_nm"),
					S2M2.sort_seq.as("sort_seq")
				)
				.from(
					S2WK
					.innerJoin(S2M).on(
						bracket(
							S2M.cst_cd.eq(S2WK.cst_cd)
							.and(
								bracket(
									S2M.dlv_cd.eq(S2WK.dlv_cd)
									.or(S2M.dlv_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
								.or(S2WK.dlv_cd.isNull())
							)
						)
					)
					.innerJoin(S2M2).on(
						bracket(
							S2M2.gd_cd.eq(S2M.gd_cd)
						)
					)
				)
				.where(
					value(0).eq(value(0))
				)
			)
		);

	}

}