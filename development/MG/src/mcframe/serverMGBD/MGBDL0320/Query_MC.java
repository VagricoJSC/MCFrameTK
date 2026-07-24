package mcframe.serverMGBD.MGBDL0320;

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
	 * -- MGBDL0320_MGT_ACT_PTN_CONFIG_Query_S01
	 */
	static MCQueryPlan MGBDL0320_MGT_ACT_PTN_CONFIG_S01() {
		MGT_ACT_PTN_CONFIG_R S0_T01 = MGT_ACT_PTN_CONFIG_R.create("T01");
		MAM_ACT_PTN_R S0_M01 = MAM_ACT_PTN_R.create("M01");
		MAM_TERM_R S0_M02 = MAM_TERM_R.create("M02");
		MAM_CALC_GRP_R S0_M03 = MAM_CALC_GRP_R.create("M03");
		MAM_XRATE_R S0_M04 = MAM_XRATE_R.create("M04");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0320_MGT_ACT_PTN_CONFIG_Query_S01")
					.mainQuery()
					.select(
						S0_T01.act_ptn_cd,
						S0_M01.act_ptn_nm,
						S0_T01.calc_act_seq,
						S0_T01.term,
						S0_M02.term_nm,
						S0_M02.term_end_ym,
						S0_T01.calc_grp_cd,
						S0_M03.calc_grp_nm,
						S0_M03.calc_seq_grp,
						S0_M03.calc_seq,
						S0_M03.max_mons,
						S0_T01.st_ym,
						S0_T01.end_ym,
						S0_T01.xrate_cd,
						S0_M04.xrate_nm,
						S0_T01.rmrks,
						S0_T01.carry_flg,
						S0_T01.err_proceed_flg,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no,
						S0_T01.upd_cntr
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.act_ptn_cd.eq(S0_M01.act_ptn_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.term.eq(S0_M02.term)
							)
						)
						.leftOuterJoin(S0_M03).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_M03.calc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M04).on(
							bracket(
								S0_T01.xrate_cd.eq(S0_M04.xrate_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T01.act_ptn_cd.like(bind("act_ptn_cd")))
						.cutoff$and(S0_M01.act_ptn_nm.like(bind("act_ptn_nm")))
						.cutoff$and(S0_T01.calc_grp_cd.like(bind("calc_grp_cd")))
						.cutoff$and(S0_M03.calc_grp_nm.like(bind("calc_grp_nm")))
						.cutoff$and(S0_T01.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T01.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T01.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T01.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T01.act_ptn_cd.asc(),
						S0_T01.calc_act_seq.asc()
					)
			);
	}
}