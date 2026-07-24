package mcframe.serverMBBE.MBBEL0050;

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
	 * -- MBBEL0050_MAT_BIZ_DAT_DL_HST_Query_S01
	 */
	static MCQueryPlan MBBEL0050_MAT_BIZ_DAT_DL_HST_S01() {
		MAT_BIZ_DAT_DL_HST_R S0_T = MAT_BIZ_DAT_DL_HST_R.create("T");
		MBT_BIZ_DAT_DL_R S0_T2 = MBT_BIZ_DAT_DL_R.create("T2");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBEL0050_MAT_BIZ_DAT_DL_HST_Query_S01")
					.mainQuery()
					.select(
						S0_T.biz_dat_dl_hst_no,
						S0_T.biz_dat_file_typ,
						S0_T.biz_dat_dl_sts_typ,
						S0_T.proc_st_tm,
						S0_T.proc_end_tm,
						S0_T.biz_dat_id,
						S0_T2.biz_dat_nm,
						S0_T.biz_dat_dl_cond,
						S0_T.usr_cd,
						S0_USR.usr_nm,
						S0_T.file_bin,
						S0_T.file_size,
						S0_T.data_cnt,
						S0_T.dl_tm,
						S0_T.dl_file_path,
						S0_T.dl_file_nm,
						S0_T2.biz_dat_rmrks1,
						S0_T2.biz_dat_rmrks2,
						S0_T2.biz_dat_rmrks3,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_T.upd_cntr
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(S0_T2.biz_dat_id.eq(S0_T.biz_dat_id))
						.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_T.usr_cd))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.proc_st_tm.gte(bind("proc_st_tm_fr")))
						.cutoff$and(S0_T.proc_st_tm.lte(bind("proc_st_tm_to")))
						.cutoff$and(S0_T.proc_end_tm.gte(bind("proc_end_tm_fr")))
						.cutoff$and(S0_T.proc_end_tm.lte(bind("proc_end_tm_to")))
						.cutoff$and(S0_T.biz_dat_id.like(bind("biz_dat_id")))
						.cutoff$and(S0_T2.biz_dat_nm.like(bind("biz_dat_nm")))
						.cutoff$and(S0_T2.biz_dat_rmrks1.like(bind("biz_dat_rmrks1")))
						.cutoff$and(S0_T2.biz_dat_rmrks2.like(bind("biz_dat_rmrks2")))
						.cutoff$and(S0_T2.biz_dat_rmrks3.like(bind("biz_dat_rmrks3")))
						.cutoff$and(S0_T.dl_tm.gte(bind("dl_tm_fr")))
						.cutoff$and(S0_T.dl_tm.lte(bind("dl_tm_to")))
						.cutoff$and(S0_T.dl_file_nm.like(bind("dl_file_nm")))
						.cutoff$and(S0_T.file_size.gte(bind("file_size_fr")))
						.cutoff$and(S0_T.file_size.lte(bind("file_size_to")))
						.cutoff$and(S0_T.usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_USR.usr_nm.like(bind("usr_nm")))
						.cutoff$and(S0_T.biz_dat_dl_cond.like(bind("biz_dat_dl_cond")))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T.biz_dat_dl_sts_typ.eq(bind("dl_sts_running")))
							.cutoff$or(S0_T.biz_dat_dl_sts_typ.eq(bind("dl_sts_success")))
							.cutoff$or(S0_T.biz_dat_dl_sts_typ.eq(bind("dl_sts_error")))
							.cutoff$or(S0_T.biz_dat_dl_sts_typ.eq(bind("dl_sts_download")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T.biz_dat_file_typ.eq(bind("biz_dat_file_typ_csv")))
							.cutoff$or(S0_T.biz_dat_file_typ.eq(bind("biz_dat_file_typ_excel")))
							.cutoff$or(S0_T.biz_dat_file_typ.eq(bind("biz_dat_file_typ_screen")))
							.cutoff$or(S0_T.biz_dat_file_typ.eq(bind("biz_dat_file_typ_report")))
						)
					)
					.orderBy(S0_T.biz_dat_dl_hst_no.desc())
			);
	}
}