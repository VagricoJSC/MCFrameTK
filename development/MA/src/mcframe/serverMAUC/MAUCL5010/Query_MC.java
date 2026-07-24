package mcframe.serverMAUC.MAUCL5010;

import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMA.dbc.*;
import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

public class Query_MC {

	static MCQueryPlan MAUCL5010_MAW_PUSH_NTC_S01() {
		MAW_PUSH_NTC_R S0W = MAW_PUSH_NTC_R.create("W");
		MAM_PUSH_NTC_R S0M1 = MAM_PUSH_NTC_R.create("M1");
		MAVM_USR_DPT_R S0M2 = MAVM_USR_DPT_R.create("M2");
		MCTempView S1T = createTempView("T");
		MAW_PUSH_NTC_R S2W = MAW_PUSH_NTC_R.create("W");
		MAM_PUSH_NTC_R S2M1 = MAM_PUSH_NTC_R.create("M1");
		MAVM_USR_DPT_R S2M2 = MAVM_USR_DPT_R.create("M2");
		MCTempView S3T = createTempView("T");
		MAW_PUSH_NTC_R S4W = MAW_PUSH_NTC_R.create("W");
		MAM_PUSH_NTC_R S4M1 = MAM_PUSH_NTC_R.create("M1");
		MAVM_APRV_USR_R S4M2 = MAVM_APRV_USR_R.create("M2");
		MAW_PUSH_NTC_R S5W = MAW_PUSH_NTC_R.create("W");
		MAM_PUSH_NTC_R S5M1 = MAM_PUSH_NTC_R.create("M1");
		MAM_USR_ACL_R S5M2 = MAM_USR_ACL_R.create("M2");

		return createQueryPlan().setQuery(sql("MAUCL5010_MAW_PUSH_NTC_Query_S01")
			.mainQuery()
			.selectDistinct(
				S0W.push_ntc_no,
				S0M1.msg_imp_typ,
				S0M1.push_typ,
				S0M2.usr_cd
			)
			.from(
				S0W
				.innerJoin(S0M1).on(
						value(0).eq(value(0))
						.and(S0W.push_ntc_typ.eq(S0M1.push_ntc_typ))
						.and(S0W.master_dt.between(S0M1.st_dt, S0M1.end_dt))
						.and(S0W.ntc_wg_cd.eq(S0M1.ntc_wg_cd))
				)
				.innerJoin(S0M2).on(
						value(0).eq(value(0))
						.and(S0M1.ntc_dpt_cd.eq(S0M2.dpt_cd))
						.and(S0W.master_dt.between(S0M2.st_dt, S0M2.end_dt))
				)
			)
			.where(
				value(0).eq(value(0))
				.and(S0W.ntc_wg_cd.isNotNull())
				.and(S0W.ntc_dpt_cd.isNull())
				.and(S0W.ntc_aprv_role_cd.isNull())
				.and(S0W.ntc_usr_cd.isNull())
			)
			.unionAll(
				subQuery()
				.selectDistinct(
					S1T.pr(S2W.push_ntc_no),
					S1T.pr(S2M1.msg_imp_typ),
					S1T.pr(S2M1.push_typ),
					S1T.pr(S2M2.usr_cd)
				)
				.from(
					subQuery()
					.select(
						S2W.push_ntc_no,
						S2M1.msg_imp_typ,
						S2M1.push_typ,
						S2M2.usr_cd,
						rowNumber()
							.over()
							.partitionBy(
								S2W.push_ntc_no,
								S2M2.usr_cd
							)
							.orderBy(S2M1.ntc_dpt_cd.asc()).as("prio")
					)
					.from(
						S2W
						.innerJoin(S2M1).on(
								value(0).eq(value(0))
								.and(S2W.push_ntc_typ.eq(S2M1.push_ntc_typ))
								.and(S2W.master_dt.between(S2M1.st_dt, S2M1.end_dt))
								.and(S2M1.ntc_wg_cd.isNull())
								.and(S2M1.ntc_aprv_role_cd.isNull())
								.and(
									S2M1.ntc_dpt_cd.isNull()
									.or(S2W.ntc_dpt_cd.eq(S2M1.ntc_dpt_cd))
								)
						)
						.innerJoin(S2M2).on(
								value(0).eq(value(0))
								.and(S2W.ntc_dpt_cd.eq(S2M2.dpt_cd))
								.and(S2W.master_dt.between(S2M2.st_dt, S2M2.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S2W.ntc_wg_cd.isNull())
						.and(S2W.ntc_dpt_cd.isNotNull())
						.and(S2W.ntc_aprv_role_cd.isNull())
						.and(S2W.ntc_usr_cd.isNull())
					).view(S1T)
				)
				.where(
					value(0).eq(value(0))
					.and(S1T.pr("prio").eq(value(1)))
				)
				.unionAll(
					subQuery()
					.selectDistinct(
						S3T.pr(S4W.push_ntc_no),
						S3T.pr(S4M1.msg_imp_typ),
						S3T.pr(S4M1.push_typ),
						S3T.pr(S4M2.usr_cd)
					)
					.from(
						subQuery()
						.select(
							S4W.push_ntc_no,
							S4M1.msg_imp_typ,
							S4M1.push_typ,
							S4M2.usr_cd,
							rowNumber()
								.over()
								.partitionBy(
									S4W.push_ntc_no,
									S4M2.usr_cd
								)
								.orderBy(S4M1.ntc_aprv_role_cd.asc()).as("prio")
						)
						.from(
							S4W
							.innerJoin(S4M1).on(
									value(0).eq(value(0))
									.and(S4W.push_ntc_typ.eq(S4M1.push_ntc_typ))
									.and(S4W.master_dt.between(S4M1.st_dt, S4M1.end_dt))
									.and(S4M1.ntc_wg_cd.isNull())
									.and(S4M1.ntc_dpt_cd.isNull())
									.and(
										S4M1.ntc_aprv_role_cd.isNull()
										.or(S4W.ntc_aprv_role_cd.eq(S4M1.ntc_aprv_role_cd))
									)
							)
							.innerJoin(S4M2).on(
									value(0).eq(value(0))
									.and(S4W.ntc_aprv_role_cd.eq(S4M2.aprv_role_cd))
									.and(S4W.master_dt.between(S4M2.st_dt, S4M2.end_dt))
									.and(
										S4M2.main_flg.eq(value(true))
										.and(MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN(S4W.push_ntc_typ).eq(value(true)))
										.or(S4M2.main_flg.eq(value(false)))
										.and(MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB(S4W.push_ntc_typ).eq(value(true)))
									)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S4W.ntc_wg_cd.isNull())
							.and(S4W.ntc_dpt_cd.isNull())
							.and(S4W.ntc_aprv_role_cd.isNotNull())
							.and(S4W.ntc_usr_cd.isNull())
						).view(S3T)
					)
					.where(
						value(0).eq(value(0))
						.and(S3T.pr("prio").eq(value(1)))
					)
					.unionAll(
						subQuery()
						.selectDistinct(
							S5W.push_ntc_no,
							S5M1.msg_imp_typ,
							S5M1.push_typ,
							S5M2.usr_cd
						)
						.from(
							S5W
							.innerJoin(S5M1).on(
									value(0).eq(value(0))
									.and(S5W.push_ntc_typ.eq(S5M1.push_ntc_typ))
									.and(S5W.master_dt.between(S5M1.st_dt, S5M1.end_dt))
									.and(S5M1.ntc_wg_cd.isNull())
									.and(S5M1.ntc_dpt_cd.isNull())
									.and(S5M1.ntc_aprv_role_cd.isNull())
							)
							.innerJoin(S5M2).on(
									value(0).eq(value(0))
									.and(S5W.ntc_usr_cd.eq(S5M2.usr_cd))
									.and(S5W.master_dt.between(S5M2.st_dt, S5M2.end_dt))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S5W.ntc_wg_cd.isNull())
							.and(S5W.ntc_dpt_cd.isNull())
							.and(S5W.ntc_aprv_role_cd.isNull())
							.and(S5W.ntc_usr_cd.isNotNull())
						)
					)
				)
			));

	}

}