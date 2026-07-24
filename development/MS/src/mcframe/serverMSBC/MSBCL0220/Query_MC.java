package mcframe.serverMSBC.MSBCL0220;

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
	 * -- MSBCL0220_MST_MRP_LOG_Query_S01
	 */
	static MCQueryPlan MSBCL0220_MST_MRP_LOG_S01() {
		MST_MRP_LOG_R S0_T1 = MST_MRP_LOG_R.create("T1");
		MAVM_RD_WG_R S0_V1 = MAVM_RD_WG_R.create("V1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0220_MST_MRP_LOG_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wg_cd,
						S0_T1.mrp_calc_no,
						S0_T1.seq_no,
						S0_T1.mrp_typ,
						toDate(
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
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no.as("req_no"),
						S0_V1.wg_nm,
						S0_T1.gp_batch_grp_cd,
						FCPA_GP_BATCH_GRP$F_GET_GP_BATCH_GRP_NM1(S0_T1.gp_batch_grp_cd).as("gp_batch_grp_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.wg_cd.eq(S0_V1.wg_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.msg_id.isNotNull())
						.cutoff$and(S0_T1.mrp_typ.like(bind("mrp_typ")))
						.cutoff$and(
							toDate(
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
							toDate(
								S0_T1.log_time,
								MCDateTimeFmt.YYYY,
								MCDateTimeFmt.MM,
								MCDateTimeFmt.DD,
								MCDateTimeFmt.HH24,
								MCDateTimeFmt.MI,
								MCDateTimeFmt.SS
							).lte(bind("log_time_to"))
						)
						.cutoff$and(S0_T1.mrp_calc_no.like(bind("mrp_calc_no")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_V1.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T1.gp_batch_grp_cd.eq(bind("gp_batch_grp_cd")))
						.cutoff$and(S0_T1.msg_id.like(bind("msg_id")))
						.cutoff$and(S0_T1.upd_srv_req_no.like(bind("req_no")))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg1")).concat(value("%"))))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg2")).concat(value("%"))))
						.cutoff$and(S0_T1.msg.like(value("%").concat(bind("msg3")).concat(value("%"))))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						pr("mrp_calc_no").desc(),
						pr("seq_no").asc()
					)
			);
	}
}