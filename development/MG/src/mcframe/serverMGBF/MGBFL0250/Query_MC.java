package mcframe.serverMGBF.MGBFL0250;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBFL0250_MAM_CALC_COST_IO_Query_S01
	 */
	static MCQueryPlan MGBFL0250_MAM_CALC_COST_IO_S01() {
		MAM_CALC_COST_IO_R S0_M01 = MAM_CALC_COST_IO_R.create("M01");
		MGT_ARG_R S0_T01 = MGT_ARG_R.create("T01");
		MAM_COST_IO_R S0_M02 = MAM_COST_IO_R.create("M02");
		MAM_ITM_JNL_R S0_M03 = MAM_ITM_JNL_R.create("M03");
		MAM_ITM_GRP_R S0_M11 = MAM_ITM_GRP_R.create("M11");
		MAM_ITM_GRP_R S0_M12 = MAM_ITM_GRP_R.create("M12");
		MAM_ITM_GRP_R S0_M13 = MAM_ITM_GRP_R.create("M13");
		MAM_ITM_GRP_R S0_M14 = MAM_ITM_GRP_R.create("M14");
		MAM_ITM_GRP_R S0_M15 = MAM_ITM_GRP_R.create("M15");
		MAM_ITM_GRP_R S0_M16 = MAM_ITM_GRP_R.create("M16");
		MAM_ITM_GRP_R S0_M17 = MAM_ITM_GRP_R.create("M17");
		MAM_ITM_GRP_R S0_M18 = MAM_ITM_GRP_R.create("M18");
		MAM_ITM_GRP_R S0_M19 = MAM_ITM_GRP_R.create("M19");
		MAM_ITM_GRP_R S0_M20 = MAM_ITM_GRP_R.create("M20");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0250_MAM_CALC_COST_IO_Query_S01")
					.mainQuery()
					.select(
						S0_M01.calc_grp_cd,
						S0_M01.cost_io_id,
						S0_M01.auto_flg,
						S0_M01.memo1,
						S0_M01.memo2,
						S0_M01.memo3,
						S0_M02.cost_io_nm,
						S0_M02.itm_jnl_cd,
						S0_M02.itm_grp_cd1,
						S0_M02.itm_grp_cd2,
						S0_M02.itm_grp_cd3,
						S0_M02.itm_grp_cd4,
						S0_M02.itm_grp_cd5,
						S0_M02.itm_grp_cd6,
						S0_M02.itm_grp_cd7,
						S0_M02.itm_grp_cd8,
						S0_M02.itm_grp_cd9,
						S0_M02.itm_grp_cd10,
						S0_M02.prod_flg,
						S0_M02.sls_flg,
						S0_M02.other_flg,
						S0_M02.in_flg,
						S0_M02.out_flg,
						S0_M11.itm_grp_nm.as("itm_grp_nm1"),
						S0_M12.itm_grp_nm.as("itm_grp_nm2"),
						S0_M13.itm_grp_nm.as("itm_grp_nm3"),
						S0_M14.itm_grp_nm.as("itm_grp_nm4"),
						S0_M15.itm_grp_nm.as("itm_grp_nm5"),
						S0_M16.itm_grp_nm.as("itm_grp_nm6"),
						S0_M17.itm_grp_nm.as("itm_grp_nm7"),
						S0_M18.itm_grp_nm.as("itm_grp_nm8"),
						S0_M19.itm_grp_nm.as("itm_grp_nm9"),
						S0_M20.itm_grp_nm.as("itm_grp_nm10"),
						bind("calc_no").as("calc_no"),
						S0_T01.end_ym.as("ym")
					)
					.from(
						S0_M01
						.innerJoin(S0_T01).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_M01.calc_grp_cd)
							)
						)
						.innerJoin(S0_M02).on(
							bracket(
								S0_M02.cost_io_id.eq(S0_M01.cost_io_id)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.itm_grp_cd.eq(S0_M02.itm_grp_cd1)
								.and(S0_M11.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.itm_grp_cd.eq(S0_M02.itm_grp_cd2)
								.and(S0_M12.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.itm_grp_cd.eq(S0_M02.itm_grp_cd3)
								.and(S0_M13.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.itm_grp_cd.eq(S0_M02.itm_grp_cd4)
								.and(S0_M14.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.itm_grp_cd.eq(S0_M02.itm_grp_cd5)
								.and(S0_M15.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.itm_grp_cd.eq(S0_M02.itm_grp_cd6)
								.and(S0_M16.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_M17.itm_grp_cd.eq(S0_M02.itm_grp_cd7)
								.and(S0_M17.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_M18.itm_grp_cd.eq(S0_M02.itm_grp_cd8)
								.and(S0_M18.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.itm_grp_cd.eq(S0_M02.itm_grp_cd9)
								.and(S0_M19.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_grp_cd.eq(S0_M02.itm_grp_cd10)
								.and(S0_M20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.cutoff$and(S0_M01.cost_io_id.eq(bind("cost_io_id")))
						.cutoff$and(S0_M02.cost_io_nm.like(bind("cost_io_nm")))
						.cutoff$and(S0_M01.memo1.like(bind("memo1")))
						.cutoff$and(S0_M01.memo2.like(bind("memo2")))
						.cutoff$and(S0_M01.memo3.like(bind("memo3")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBFL0250_MGT_COST_ION_Query_S01
	 */
	static MCQueryPlan MGBFL0250_MGT_COST_ION_S01() {
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S1_T01 = createTempView("T01");
		MCTempView S0 = createTempView("T");
		
		
		return createQueryPlan()
				.setQuery(
					sql("MGBFL0250_MGT_COST_ION_Query_S01")
						.mainQuery()
						.select(countAll().as("cnt"))
						.from(
							subQuery()
							.select(S1_T01.prAll())
							.from(addDynamicView(REP1))
							.where(
								value(0).eq(value(0))
								.and(S1_T01.pr("calc_no").eq(bind("calc_no")))
								.and(S1_T01.pr("calc_grp_cd").eq(bind("calc_grp_cd")))
							).view(S0)
					)
			);
	}
}