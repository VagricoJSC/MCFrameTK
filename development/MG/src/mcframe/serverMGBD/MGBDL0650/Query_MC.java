package mcframe.serverMGBD.MGBDL0650;

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
	 * -- MGBDL0650_MGT_CUR_XRATE_Query_S01
	 */
	static MCQueryPlan MGBDL0650_MGT_CUR_XRATE_S01() {
		MGT_CUR_XRATE_R S0_T = MGT_CUR_XRATE_R.create("T");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CUR_R S0_CUR1 = MAM_CUR_R.create("CUR1");
		MAM_CUR_R S0_CUR2 = MAM_CUR_R.create("CUR2");
		MAM_XRATE_R S0_XRATE = MAM_XRATE_R.create("XRATE");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0650_MGT_CUR_XRATE_Query_S01")
					.mainQuery()
					.select(
						S0_T.fix_flg,
						S0_T.term,
						S0_TERM.term_nm,
						S0_T.fr_cur_cd,
						S0_CUR1.cur_nm.as("fr_cur_nm"),
						S0_T.to_cur_cd,
						S0_CUR2.cur_nm.as("to_cur_nm"),
						S0_T.xrate_cd,
						S0_XRATE.xrate_nm,
						S0_T.xrate,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.leftOuterJoin(S0_TERM).on(S0_T.term.eq(S0_TERM.term))
						.leftOuterJoin(S0_CUR1).on(S0_T.fr_cur_cd.eq(S0_CUR1.cur_cd))
						.leftOuterJoin(S0_CUR2).on(S0_T.to_cur_cd.eq(S0_CUR2.cur_cd))
						.leftOuterJoin(S0_XRATE).on(S0_T.xrate_cd.eq(S0_XRATE.xrate_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_T.fr_cur_cd.like(bind("fr_cur_cd")))
						.cutoff$and(S0_CUR1.cur_nm.like(bind("fr_cur_nm")))
						.cutoff$and(S0_T.to_cur_cd.like(bind("to_cur_cd")))
						.cutoff$and(S0_CUR2.cur_nm.like(bind("to_cur_nm")))
						.cutoff$and(S0_T.xrate_cd.like(bind("xrate_cd")))
						.cutoff$and(S0_XRATE.xrate_nm.like(bind("xrate_nm")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T.fix_flg.eq(bind("fix_flg_str")))
					)
					.orderBy(
						pr("term").asc(),
						pr("fr_cur_cd").asc(),
						pr("to_cur_cd").asc(),
						pr("xrate_cd").asc()
					)
			);
	}
}