package mcframe.serverMBBB.MBBBL0110;

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
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBBL0110_MBT_JNL_HISTORY_Query_S01
	 */
	static MCQueryPlan MBBBL0110_MBT_JNL_HISTORY_S01() {
		MBT_JNL_HISTORY_R S0_T = MBT_JNL_HISTORY_R.create("T");
		MAM_JNL_ACT_R S0_JNL_ACT = MAM_JNL_ACT_R.create("JNL_ACT");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL0110_MBT_JNL_HISTORY_Query_S01")
					.mainQuery()
					.select(
						S0_T.jnl_grp_no,
						S0_T.ac_ym,
						S0_T.st_dt,
						S0_T.end_dt,
						S0_T.ac_slip_dt,
						S0_T.jnl_act_cd,
						S0_JNL_ACT.jnl_act_nm,
						S0_JNL_ACT.jnl_del_flg,
						S0_T.data_typ,
						S0_T.rerun_flg,
						S0_T.jnl_rmrks,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_func_id,
						S0_T.ins_ts,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_func_id,
						S0_T.upd_ts,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.leftOuterJoin(S0_JNL_ACT).on(
							bracket(
								S0_JNL_ACT.jnl_act_cd.eq(S0_T.jnl_act_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.ac_ym.gte(bind("ac_ym_fr")))
						.cutoff$and(S0_T.ac_ym.lte(bind("ac_ym_to")))
						.cutoff$and(S0_T.ac_slip_dt.eq(bind("ac_slip_dt")))
						.cutoff$and(S0_T.jnl_act_cd.like(bind("jnl_act_cd")))
						.cutoff$and(S0_T.data_typ.like(bind("data_typ")))
						.cutoff$and(S0_T.jnl_rmrks.like(bind("jnl_rmrks")))
					)
					.orderBy(S0_T.jnl_grp_no.asc())
			);
	}
}