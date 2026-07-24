package mcframe.serverMABC.MABCL1600;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;

public class Query_MC {
	
	
	/**
	 * -- MABCL1600_MAT_BLNK_BAT_CNTL_Query_S01
	 */
	static MCQueryPlan MABCL1600_MAT_BLNK_BAT_CNTL_S01() {
		MAT_BLNK_BAT_CNTL_ALL_R S0T1 = MAT_BLNK_BAT_CNTL_ALL_R.create("T1");
		
		return createQueryPlan()
			.setQuery(
				sql("MABCL1600_MAT_BLNK_BAT_CNTL_Query_S01")
				.mainQuery()
				.select(
					S0T1.if_proc_typ,
					S0T1.co_cd,
					S0T1.bat_exec_flg,
					S0T1.exec_co_cd,
					S0T1.ins_usr_id,
					S0T1.ins_usr_nm,
					S0T1.ins_ts,
					S0T1.ins_func_id,
					S0T1.upd_cntr,
					S0T1.upd_usr_id,
					S0T1.upd_usr_nm,
					S0T1.upd_ts,
					S0T1.upd_func_id,
					S0T1.upd_srv_req_no
				)
				.from(S0T1)
				.where(
					value(0).eq(value(0))
					.cutoff$and(S0T1.if_proc_typ.like(bind("if_proc_typ")))
				)
				.orderBy(S0T1.if_proc_typ.asc())
			);
	}
}