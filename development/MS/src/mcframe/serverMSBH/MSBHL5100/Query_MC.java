package mcframe.serverMSBH.MSBHL5100;

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
	 * -- MSBHL5100_MST_AP_APPL_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL5100_MST_AP_APPL_SCHD_S01() {
		MST_AP_APPL_SCHD_R S0_T1 = MST_AP_APPL_SCHD_R.create("T1");
		MST_PAY_SCHD_R S0_T2 = MST_PAY_SCHD_R.create("T2");
		MST_PAY_CHK_R S0_T3 = MST_PAY_CHK_R.create("T3");
		MSW_PAY_CHK_KEY_R S0_W1 = MSW_PAY_CHK_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL5100_MST_AP_APPL_SCHD_Query_S01")
					.mainQuery()
					.select(S0_T1.ap_appl_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.pay_schd_no.eq(S0_T2.pay_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.pay_chk_mng_no.eq(S0_T3.pay_chk_mng_no)
							)
						)
						.innerJoin(S0_W1).on(
							bracket(
								S0_W1.pay_chk_mng_no.eq(S0_T3.pay_chk_mng_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.trd_cur_amt.neq(value(0)))
					)
			);
	}
}