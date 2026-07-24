package mcframe.serverMGBD.MGBDL0070;

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
	 * -- MGBDL0070_MGT_CALC_FIX_Query_S01
	 */
	static MCQueryPlan MGBDL0070_MGT_CALC_FIX_S01() {
		MGT_CALC_FIX_R S0_T01 = MGT_CALC_FIX_R.create("T01");
		MGT_ARG_R S0_T02 = MGT_ARG_R.create("T02");
		MAM_CALC_GRP_R S0_M01 = MAM_CALC_GRP_R.create("M01");
		MAM_TERM_R S0_M02 = MAM_TERM_R.create("M02");
		MAM_USR_R S0_M03 = MAM_USR_R.create("M03");
		MAM_USR_R S0_M04 = MAM_USR_R.create("M04");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0070_MGT_CALC_FIX_Query_S01")
					.mainQuery()
					.select(
						S0_T01.ym,
						S0_T01.calc_grp_cd,
						S0_M01.calc_grp_nm,
						S0_T01.calc_no,
						S0_T02.st_ym,
						S0_T02.end_ym,
						S0_T02.term,
						S0_M02.term_nm,
						S0_T02.ins_usr_id.as("calc_usr_cd"),
						S0_M03.usr_nm.as("calc_usr_nm"),
						S0_T01.ins_usr_id.as("fix_usr_cd"),
						S0_M04.usr_nm.as("fix_usr_nm"),
						S0_T01.ins_ts.as("fix_ts"),
						S0_T02.rmrks.as("calc_rmrks"),
						S0_T02.sub_char1,
						S0_T02.sub_char2,
						S0_T02.sub_char3,
						S0_T02.ins_usr_id,
						S0_T02.ins_usr_nm,
						S0_T02.ins_func_id,
						S0_T02.ins_ts,
						S0_T02.upd_usr_id,
						S0_T02.upd_usr_nm,
						S0_T02.upd_func_id,
						S0_T02.upd_ts,
						S0_T02.upd_srv_req_no
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_T02.calc_grp_cd)
								.and(S0_T01.calc_no.eq(S0_T02.calc_no))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_M01.calc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T02.term.eq(S0_M02.term)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_T02.ins_usr_id.eq(S0_M03.usr_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.ins_usr_id.eq(S0_M04.usr_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T01.calc_grp_cd.like(bind("calc_grp_cd")))
						.cutoff$and(S0_M01.calc_grp_nm.like(bind("calc_grp_nm")))
						.cutoff$and(S0_T01.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T01.ym.lte(bind("ym_to")))
					)
					.orderBy(
						S0_T01.ym.asc(),
						S0_T01.calc_grp_cd.asc()
					)
			);
	}
	
	/**
	 * -- MGBDL0070_MGT_YM_NO_Query_S01
	 */
	static MCQueryPlan MGBDL0070_MGT_YM_NO_S01() {
		MGT_YM_NO_R S0_T01 = MGT_YM_NO_R.create("T01");
		MGT_ARG_R S0_T02 = MGT_ARG_R.create("T02");
		MAM_CALC_GRP_R S0_M01 = MAM_CALC_GRP_R.create("M01");
		MAM_TERM_R S0_M02 = MAM_TERM_R.create("M02");
		MAM_USR_R S0_M03 = MAM_USR_R.create("M03");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0070_MGT_YM_NO_Query_S01")
					.mainQuery()
					.select(
						S0_T01.ym,
						S0_T01.calc_grp_cd,
						S0_M01.calc_grp_nm,
						S0_T01.calc_no,
						S0_T02.st_ym,
						S0_T02.end_ym,
						S0_T02.term,
						S0_M02.term_nm,
						S0_T02.ins_usr_id.as("calc_usr_cd"),
						S0_M03.usr_nm.as("calc_usr_nm"),
						S0_T02.rmrks.as("calc_rmrks"),
						S0_T02.sub_char1,
						S0_T02.sub_char2,
						S0_T02.sub_char3,
						S0_T02.ins_usr_id,
						S0_T02.ins_usr_nm,
						S0_T02.ins_func_id,
						S0_T02.ins_ts,
						S0_T02.upd_usr_id,
						S0_T02.upd_usr_nm,
						S0_T02.upd_func_id,
						S0_T02.upd_ts,
						S0_T02.upd_srv_req_no
					)
					.from(
						S0_T01
						.innerJoin(S0_T02).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_T02.calc_grp_cd)
								.and(S0_T01.calc_no.eq(S0_T02.calc_no))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_M01.calc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T02.term.eq(S0_M02.term)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_T02.ins_usr_id.eq(S0_M03.usr_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T01.calc_grp_cd.like(bind("calc_grp_cd")))
						.cutoff$and(S0_M01.calc_grp_nm.like(bind("calc_grp_nm")))
						.cutoff$and(S0_T01.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T01.ym.lte(bind("ym_to")))
					)
					.orderBy(
						S0_T01.ym.asc(),
						S0_T01.calc_grp_cd.asc()
					)
			);
	}
}