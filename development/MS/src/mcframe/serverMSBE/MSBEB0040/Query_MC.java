package mcframe.serverMSBE.MSBEB0040;

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
	 * -- MSBEB0010_MAM_LOC_Query_S01
	 */
	static MCQueryPlan MSBEB0010_MAM_LOC_S01() {
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_STR_LN_R S0_M2 = MAM_STR_LN_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEB0010_MAM_LOC_Query_S01")
					.mainQuery()
					.select(
						S0_M1.loc_cd,
						S0_M1.str_ln_tgt_flg,
						S0_M2.str_ln_cd
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.loc_cd.eq(S0_M2.loc_cd)
								.and(S0_M1.str_ln_tgt_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_M1.loc_grp_cd.eq(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.loc_cd.eq(bind("loc_cd")))
						.cutoff$and(
							bind("int_flg_true_str").eq(value(true))
							.and(S0_M1.sppl_cd.isNull())
						)
						.cutoff$and(
							bind("ext_flg_true_str").eq(value(true))
							.and(S0_M1.sppl_cd.isNotNull())
						)
					)
			);
	}
}