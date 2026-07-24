package mcframe.serverMSBC.MSBCL5020;

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
	 * -- MSBCL5020_MAM_ITM_DTL_Query_S01
	 */
	static MCQueryPlan MSBCL5020_MAM_ITM_DTL_S01() {
		MAM_ITM_DTL_R S0_T1 = MAM_ITM_DTL_R.create("T1");
		MAW_ITM_WG_KEY_R S0_W1 = MAW_ITM_WG_KEY_R.create("W1");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5020_MAM_ITM_DTL_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.wg_cd,
						S0_T1.mfg_loc_cd,
						S0_M1.loc_nm.as("mfg_loc_nm"),
						S0_M1.sppl_cd.as("mfg_sppl_cd"),
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T1.rqst_loc_cd,
						S0_M3.loc_nm.as("rqst_loc_nm"),
						S0_M3.wg_cd.as("rqst_wg_cd"),
						S0_M4.wg_nm.as("rqst_wg_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.wg_cd.eq(S0_T1.wg_cd))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.loc_cd.eq(S0_T1.mfg_loc_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.sppl_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_T1.rqst_loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.wg_cd.eq(S0_M3.wg_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T1.mfg_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_M1.loc_cd.isNotNull())
						)
						.and(
							S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_M2.bp_cd.isNotNull())
						)
						.and(
							S0_T1.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.or(S0_M3.loc_cd.isNotNull())
						)
					)
			);
	}
}