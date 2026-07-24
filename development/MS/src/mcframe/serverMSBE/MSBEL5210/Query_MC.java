package mcframe.serverMSBE.MSBEL5210;

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
	 * -- MSBEL5210_MST_XFR_INST_Query_D01
	 */
	static MCQueryPlan MSBEL5210_MST_XFR_INST_D01() {
		MST_XFR_INST_R S0 = MST_XFR_INST_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5210_MST_XFR_INST_Query_D01")
					.delete(S0)
					.where(
						value(0).eq(value(0))
						.and(S0.xfr_inst_no.eq(bind("xfr_inst_no")))
					)
			);
	}
	
	/**
	 * -- MSBEL5210_MST_XFR_INST_D_Query_D01
	 */
	static MCQueryPlan MSBEL5210_MST_XFR_INST_D_D01() {
		MST_XFR_INST_D_R S0 = MST_XFR_INST_D_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5210_MST_XFR_INST_D_Query_D01")
					.delete(S0)
					.where(
						value(0).eq(value(0))
						.and(S0.xfr_inst_no.eq(bind("xfr_inst_no")))
					)
			);
	}
}