package mcframe.serverMSBC.MSBCL0320;

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
	 * -- MSBCL0320_MAM_RSRC_LOC_Query_S01
	 */
	static MCQueryPlan MSBCL0320_MAM_RSRC_LOC_S01() {
		MAM_RSRC_LOC_R S0_M1 = MAM_RSRC_LOC_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_SITE_R S0_M3 = MAM_SITE_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_LOC_GRP_R S0_M5 = MAM_LOC_GRP_R.create("M5");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0320_MAM_RSRC_LOC_Query_S01")
					.mainQuery()
					.select(
						S0_M1.mfg_loc_cd,
						S0_M1.rsrc_cd,
						S0_M2.wg_cd,
						min(S0_M1.disp_seq).as("disp_seq")
					)
					.from(
						S0_M1
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.loc_cd.eq(S0_M1.mfg_loc_cd)
								.and(
									S0_M2.rsrc_cd1.eq(S0_M1.rsrc_cd)
									.or(S0_M2.rsrc_cd2.eq(S0_M1.rsrc_cd))
								)
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_M3.site_cd.eq(S0_M2.site_cd)
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_M4.wg_cd.eq(S0_M2.wg_cd)
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_M5.loc_grp_cd.eq(S0_M2.loc_grp_cd)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.loc_cd.eq(S0_M1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M1.st_dt.lte(bind("dt_to")))
						.and(S0_M1.end_dt.gte(bind("dt_fr")))
						.cutoff$and(S0_M2.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M3.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_M2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M2.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M5.loc_grp_nm.like(bind("loc_grp_nm")))
						.cutoff$and(S0_M1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M2.loc_nm.like(bind("mfg_loc_nm")))
					)
					.groupBy(
						S0_M1.mfg_loc_cd,
						S0_M1.rsrc_cd,
						S0_M2.wg_cd
					)
			);
	}
}