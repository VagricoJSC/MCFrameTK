package mcframe.serverMGBD.MGBDL0340;

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
	 * -- MGBDL0340_MGT_PARM_Query_S01
	 */
	static MCQueryPlan MGBDL0340_MGT_PARM_S01() {
		MGT_PARM_R S0_T01 = MGT_PARM_R.create("T01");
		MGC_PARM_REMARK_R S0_C01 = MGC_PARM_REMARK_R.create("C01");
		MAM_CALC_GRP_R S0_M01 = MAM_CALC_GRP_R.create("M01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0340_MGT_PARM_Query_S01")
					.mainQuery()
					.select(
						S0_T01.calc_grp_cd,
						S0_M01.calc_grp_nm,
						S0_T01.parm_key,
						S0_T01.parm_val,
						S0_C01.parm_biz_grp,
						S0_C01.parm_remark,
						S0_T01.rmrks,
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
						.leftOuterJoin(S0_C01).on(
							bracket(
								S0_T01.parm_key.eq(S0_C01.parm_key)
								.and(S0_C01.lcl_cd.eq(FCPA_CONTEXT$F_GET_LOCALE()))
							)
						)
						.leftOuterJoin(S0_M01).on(
							bracket(
								S0_T01.calc_grp_cd.eq(S0_M01.calc_grp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T01.calc_grp_cd.like(bind("calc_grp_cd")))
						.cutoff$and(S0_M01.calc_grp_nm.like(bind("calc_grp_nm")))
						.cutoff$and(S0_T01.parm_key.like(bind("parm_key")))
						.cutoff$and(S0_C01.parm_biz_grp.like(bind("parm_biz_grp")))
						.cutoff$and(S0_C01.parm_remark.like(bind("parm_remark")))
						.cutoff$and(S0_T01.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T01.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T01.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T01.sub_char3.like(bind("sub_char3")))
					)
					.orderBy(
						S0_T01.calc_grp_cd.asc(),
						S0_T01.parm_key.asc()
					)
			);
	}
}