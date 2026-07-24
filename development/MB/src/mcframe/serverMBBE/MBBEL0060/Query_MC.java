package mcframe.serverMBBE.MBBEL0060;

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
	 * -- MBBEL0060_MBT_BIZ_DAT_DL_Query_S01
	 */
	static MCQueryPlan MBBEL0060_MBT_BIZ_DAT_DL_S01() {
		MBT_BIZ_DAT_DL_R S0_T1 = MBT_BIZ_DAT_DL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBEL0060_MBT_BIZ_DAT_DL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.biz_dat_id,
						S0_T1.biz_dat_nm,
						S0_T1.module_id,
						S0_T1.logic_id,
						S0_T1.func_actyp,
						S0_T1.biz_dat_rmrks1,
						S0_T1.biz_dat_rmrks2,
						S0_T1.biz_dat_rmrks3,
						S0_T1.print_flg,
						S0_T1.dwnld_flg,
						S0_T1.form_file_nm,
						S0_T1.cartridge,
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
						S0_T1.sql_src
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.biz_dat_id.eq(bind("biz_dat_id")))
					)
			);
	}
}