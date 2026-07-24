package mcframe.serverMGBD.MGBDL0050;

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
	 * -- MSBDL0050_MGT_CALC_LOG_Query_S01
	 */
	static MCQueryPlan MSBDL0050_MGT_CALC_LOG_S01() {
		MGT_CALC_LOG_R S0_T1 = MGT_CALC_LOG_R.create("T1");
		MAM_CALC_GRP_R S0_M1 = MAM_CALC_GRP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0050_MGT_CALC_LOG_Query_S01")
					.mainQuery()
					.select(
						S0_T1.calc_no,
						S0_T1.seq_no,
						toTimestamp(
							S0_T1.log_time,
							MCDateTimeFmt.YYYY,
							MCDateTimeFmt.MM,
							MCDateTimeFmt.DD,
							MCDateTimeFmt.HH24,
							MCDateTimeFmt.MI,
							MCDateTimeFmt.SS
						).as("log_time"),
						S0_T1.msg_id,
						S0_T1.msg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_T1.calc_grp_cd,
						S0_M1.calc_grp_nm
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.calc_grp_cd.eq(S0_M1.calc_grp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							toTimestamp(
								S0_T1.log_time,
								MCDateTimeFmt.YYYY,
								MCDateTimeFmt.MM,
								MCDateTimeFmt.DD,
								MCDateTimeFmt.HH24,
								MCDateTimeFmt.MI,
								MCDateTimeFmt.SS
							).gte(bind("log_time_fr"))
						)
						.cutoff$and(
							toTimestamp(
								S0_T1.log_time,
								MCDateTimeFmt.YYYY,
								MCDateTimeFmt.MM,
								MCDateTimeFmt.DD,
								MCDateTimeFmt.HH24,
								MCDateTimeFmt.MI,
								MCDateTimeFmt.SS
							).lte(bind("log_time_to"))
						)
						.cutoff$and(S0_T1.calc_no.like(bind("calc_no")))
						.cutoff$and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T1.msg_id.like(bind("msg_id")))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg1")).concat(value("%"))))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg2")).concat(value("%"))))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg3")).concat(value("%"))))
					)
					.orderBy(
						pr("calc_no").desc(),
						pr("seq_no").asc()
					)
			);
	}
}