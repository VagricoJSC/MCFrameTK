package mcframe.serverMSBC.MSBCB1040;

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
	 * -- MSBCB1040_MST_OPER_ACT_Query_S01
	 */
	static MCQueryPlan MSBCB1040_MST_OPER_ACT_S01() {
		MST_OPER_ACT_R S0_T1 = MST_OPER_ACT_R.create("T1");
		MST_OPER_ACT_REM_R S0_T2 = MST_OPER_ACT_REM_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCB1040_MST_OPER_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_act_no,
						S0_T2.mfg_inst_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_T2.oper_inst_no)
								.and(S0_T1.div_seq.eq(S0_T2.div_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value())))
						.and(S0_T1.if_auto_reg_flg.eq(value(true)))
						.cutoff$and(S0_T3.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0_T3.mfg_loc_cd.eq(bind("mfg_loc_cd")))
					)
			);
	}
}