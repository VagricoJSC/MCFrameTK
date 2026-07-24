package mcframe.serverMBBE.MBBEL0030;

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
	 * -- MBBEL0030_MBT_BIZ_DAT_DL_Query_S01
	 */
	static MCQueryPlan MBBEL0030_MBT_BIZ_DAT_DL_S01() {
		MBT_BIZ_DAT_DL_R S0_T = MBT_BIZ_DAT_DL_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBEL0030_MBT_BIZ_DAT_DL_Query_S01")
					.mainQuery()
					.select(
						S0_T.biz_dat_id,
						S0_T.biz_dat_nm,
						S0_T.biz_dat_get_typ,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_T.sql_src,
						S0_T.biz_dat_rmrks1,
						S0_T.biz_dat_rmrks2,
						S0_T.biz_dat_rmrks3,
						S0_T.print_flg,
						S0_T.dwnld_flg,
						S0_T.form_file_nm,
						S0_T.cartridge,
						S0_T.module_id,
						S0_T.logic_id,
						S0_T.func_actyp,
						S0_T.res_path,
						S0_T.dt_cond_col1,
						S0_T.dt_cond_col2,
						S0_T.dt_cond_col3,
						S0_T.dt_cond_col4,
						S0_T.dt_cond_col5,
						S0_T.dt_cond_col6,
						S0_T.dt_cond_col7,
						S0_T.dt_cond_col8,
						S0_T.dt_cond_col9,
						S0_T.dt_cond_col10,
						S0_T.str_cond_col1,
						S0_T.str_cond_col2,
						S0_T.str_cond_col3,
						S0_T.str_cond_col4,
						S0_T.str_cond_col5,
						S0_T.num_cond_col1,
						S0_T.num_cond_col2,
						S0_T.num_cond_col3,
						S0_T.num_cond_col4,
						S0_T.num_cond_col5,
						S0_T.flg_cond_col1,
						S0_T.flg_cond_col2,
						S0_T.flg_cond_col3,
						S0_T.flg_cond_col4,
						S0_T.flg_cond_col5
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.biz_dat_id.like(bind("biz_dat_id")))
						.cutoff$and(S0_T.biz_dat_nm.like(bind("biz_dat_nm")))
						.cutoff$and(S0_T.biz_dat_rmrks1.like(bind("biz_dat_rmrks1")))
						.cutoff$and(S0_T.biz_dat_rmrks2.like(bind("biz_dat_rmrks2")))
						.cutoff$and(S0_T.biz_dat_rmrks3.like(bind("biz_dat_rmrks3")))
					)
					.orderBy(S0_T.biz_dat_id.asc())
			);
	}
}