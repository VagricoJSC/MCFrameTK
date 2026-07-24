package mcframe.serverMGBD.MGBDL0060;

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
	 * -- MGBDL0060_MGT_ARG_Query_I01
	 */
	static MCQueryPlan MGBDL0060_MGT_ARG_I01() {
		MGT_ARG_R S0 = MGT_ARG_R.create();
		MGVT_ARG_USR_R S1_T = MGVT_ARG_USR_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0060_MGT_ARG_Query_I01")
					.insert(S0)
					.query(
						subQuery()
						.select(S1_T.prAll())
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_no.eq(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0060_MGT_USR_ITM_Query_D01
	 */
	static MCQueryPlan MGBDL0060_MGT_USR_ITM_D01() {
		MGT_USR_ITM_R S0_T = MGT_USR_ITM_R.create("T");
		MGVT_ARG_USR_R S1_W = MGVT_ARG_USR_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0060_MGT_USR_ITM_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W)
								.where(
									S1_W.calc_no.eq(bind("calc_no"))
									.and(S1_W.calc_grp_cd.eq(bind("calc_grp_cd")))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0060_MGVT_ARG_USR_Query_D01
	 */
	static MCQueryPlan MGBDL0060_MGVT_ARG_USR_D01() {
		MGVT_ARG_USR_R S0_T = MGVT_ARG_USR_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0060_MGVT_ARG_USR_Query_D01")
					.delete(S0_T)
					.where(
						S0_T.calc_no.eq(bind("calc_no"))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
					)
			);
	}
	
	/**
	 * -- MGBDL0060_MGVT_ARG_USR_Query_S01
	 */
	static MCQueryPlan MGBDL0060_MGVT_ARG_USR_S01() {
		MGVT_ARG_USR_R S0_T1 = MGVT_ARG_USR_R.create("T1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_CALC_GRP_R S0_M1 = MAM_CALC_GRP_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0060_MGVT_ARG_USR_Query_S01")
					.mainQuery()
					.select(
						S0_T1.calc_no,
						S0_T1.calc_grp_cd,
						S0_M1.calc_grp_nm,
						S0_T1.calc_st,
						S0_T1.ins_usr_id.as("calc_usr_cd"),
						S0_M2.usr_nm.as("calc_usr_nm"),
						S0_T1.rmrks,
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
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(S0_M2.usr_cd.eq(S0_T1.ins_usr_id))
						.leftOuterJoin(S0_M1).on(S0_T1.calc_grp_cd.eq(S0_M1.calc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ins_usr_id.like(bind("calc_usr_cd")))
						.cutoff$and(S0_M2.usr_nm.like(bind("calc_usr_nm")))
					)
					.orderBy(
						S0_T1.calc_grp_cd.asc(),
						S0_T1.calc_no.asc()
					)
			);
	}
}