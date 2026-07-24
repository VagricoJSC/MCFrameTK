package mcframe.serverMSBC.MSBCL6050;

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
	 * -- MSBCL6050_MST_INPT_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL6050_MST_INPT_ACT_S01() {
		MSW_ITM_MFG_INST_KEY_R S0_W1 = MSW_ITM_MFG_INST_KEY_R.create("W1");
		MST_INPT_ACT_R S0_T1 = MST_INPT_ACT_R.create("T1");
		MSW_INPT_ACT_KEY_R S1_W2 = MSW_INPT_ACT_KEY_R.create("W2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL6050_MST_INPT_ACT_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.itm_mfg_inst_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.ver_no
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value(true))
								.from(S1_W2)
								.where(
									S0_T1.inpt_act_no.eq(S1_W2.inpt_act_no)
								)
							)
						)
					)
			);
	}
}