package mcframe.serverMSUA.MSUAL1090;

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
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

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
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSUAL1090_MAM_SET_ITM_Query_S01
	 */
	static MCQueryPlan MSUAL1090_MAM_SET_ITM_S01() {
		MAM_SET_ITM_R S0_M1 = MAM_SET_ITM_R.create("M1");
		MAM_SET_GRP_R S0_M2 = MAM_SET_GRP_R.create("M2");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAVM_ITM_UNIT_R S0_M4 = MAVM_ITM_UNIT_R.create("M4");
		MAM_UNIT_R S0_M5 = MAM_UNIT_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSUAL1090_MAM_SET_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_M1.set_grp_cd,
						S0_M2.set_grp_nm,
						S0_M2.ship_assort_flg,
						S0_M2.st_dt,
						S0_M2.end_dt,
						S0_M1.set_itm_cd,
						S0_M1.set_itm_sub1,
						S0_M1.set_itm_sub2,
						S0_M1.set_itm_sub3,
						S0_M3.itm_nm.as("set_itm_nm"),
						S0_M4.dec_place,
						S0_M1.set_itm_unit_cd,
						S0_M5.unit_nm.as("set_itm_unit_nm"),
						MAPA_CALC$F_RND_NE(
							bracket(
								bracket(
									bind("main_itm_qty").multiply(S0_M1.set_itm_qty)
								).divide(S0_M1.main_itm_qty)
							),
							S0_M4.dec_place,
							value(MAC_RND_TYP.RNDUP.value())
						).as("qty")
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_M2).on(S0_M2.set_grp_cd.eq(S0_M1.set_grp_cd))
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.itm_cd.eq(S0_M1.set_itm_cd)
								.and(S0_M3.itm_sub1.eq(S0_M1.set_itm_sub1))
								.and(S0_M3.itm_sub2.eq(S0_M1.set_itm_sub2))
								.and(S0_M3.itm_sub3.eq(S0_M1.set_itm_sub3))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_M1.set_itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_M1.set_itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_M1.set_itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_M1.set_itm_sub3))
								.and(S0_M4.unit_cd.eq(S0_M1.set_itm_unit_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.unit_cd.eq(S0_M1.set_itm_unit_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.set_grp_cd.like(bind("set_grp_cd")))
						.cutoff$and(S0_M2.set_grp_nm.like(bind("set_grp_nm")))
						.cutoff$and(bind("base_dt").between(S0_M2.st_dt, S0_M2.end_dt))
						.and(S0_M1.main_itm_cd.eq(bind("main_itm_cd")))
						.and(S0_M1.main_itm_sub1.eq(bind("main_itm_sub1")))
						.and(S0_M1.main_itm_sub2.eq(bind("main_itm_sub2")))
						.and(S0_M1.main_itm_sub3.eq(bind("main_itm_sub3")))
						.and(S0_M1.main_itm_unit_cd.eq(bind("main_itm_unit_cd")))
					)
					.orderBy(
						S0_M1.set_grp_cd.asc(),
						S0_M1.set_itm_cd.asc(),
						S0_M1.set_itm_sub1.asc(),
						S0_M1.set_itm_sub2.asc(),
						S0_M1.set_itm_sub3.asc(),
						S0_M1.set_itm_unit_cd.asc()
					)
			);
	}
}