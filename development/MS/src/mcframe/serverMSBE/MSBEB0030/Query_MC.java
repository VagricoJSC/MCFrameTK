package mcframe.serverMSBE.MSBEB0030;

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
	 * -- MSBEB0030_MAM_STK_RPL_Query_S01
	 */
	static MCQueryPlan MSBEB0030_MAM_STK_RPL_S01() {
		MAM_STK_RPL_R S0_M1 = MAM_STK_RPL_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEB0030_MAM_STK_RPL_Query_S01")
					.mainQuery()
					.select(
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M1.loc_cd.as("strg_loc_cd"),
						S0_M1.rord_stk_qty,
						S0_M1.rord_rqst_qty,
						S0_M1.gi_schd_flg,
						S0_M1.gi_loc_cd.as("rqst_loc_cd"),
						S0_M1.gi_str_ln_cd.as("rqst_str_ln_cd"),
						S0_M4.wg_cd.as("rqst_wg_cd"),
						nvl(
							S0_M2.dec_place,
							value(0)
						).as("dec_place")
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_M1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.loc_cd.eq(S0_M1.gi_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.st_dt.lte(bind("master_dt")))
						.and(S0_M1.end_dt.gte(bind("master_dt")))
						.and(S0_M1.rord_stk_qty.isNotNull())
						.cutoff$and(S0_M3.site_cd.eq(bind("site_cd")))
						.cutoff$and(S0_M3.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.eq(bind("lg_grp_cd")))
						.cutoff$and(S0_M1.loc_cd.eq(bind("loc_cd")))
						.cutoff$and(S0_M2.itm_typ.eq(bind("itm_typ")))
						.cutoff$and(S0_M2.itm_typ_d_cd.eq(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M2.itm_grp_cd1.eq(bind("itm_grp_cd1")))
						.cutoff$and(S0_M2.itm_grp_cd2.eq(bind("itm_grp_cd2")))
						.cutoff$and(S0_M2.itm_grp_cd3.eq(bind("itm_grp_cd3")))
						.cutoff$and(S0_M2.itm_grp_cd4.eq(bind("itm_grp_cd4")))
						.cutoff$and(S0_M2.itm_grp_cd5.eq(bind("itm_grp_cd5")))
						.cutoff$and(S0_M2.itm_grp_cd6.eq(bind("itm_grp_cd6")))
						.cutoff$and(S0_M2.itm_grp_cd7.eq(bind("itm_grp_cd7")))
						.cutoff$and(S0_M2.itm_grp_cd8.eq(bind("itm_grp_cd8")))
						.cutoff$and(S0_M2.itm_grp_cd9.eq(bind("itm_grp_cd9")))
						.cutoff$and(S0_M2.itm_grp_cd10.eq(bind("itm_grp_cd10")))
					)
			);
	}
}