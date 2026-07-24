package mcframe.serverMSBE.MSBEL5020;

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
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

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
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBEL5020_MST_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBEL5020_MST_IO_SCHD_D01() {
		MST_IO_SCHD_R S0_T = MST_IO_SCHD_R.create("T");
		MSW_IO_SCHD_DEL_R S1_W = MSW_IO_SCHD_DEL_R.create("W");
		MSC_IO_SCHD_TYP_MAP_R S1_C = MSC_IO_SCHD_TYP_MAP_R.create("C");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5020_MST_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_W
									.innerJoin(S1_C).on(
										S1_W.io_schd_typ.eq(S1_C.io_schd_typ)
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S1_C.rel_io_schd_typ.eq(S0_T.io_schd_typ))
									.and(S1_W.io_schd_sts_typ.eq(S0_T.io_schd_sts_typ))
									.and(S1_W.io_schd_no.eq(S0_T.io_schd_no))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL5020_MST_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL5020_MST_IO_SCHD_S01() {
		MST_IO_SCHD_R S0_T = MST_IO_SCHD_R.create("T");
		MSW_IO_SCHD_DEL_R S1_W = MSW_IO_SCHD_DEL_R.create("W");
		MSC_IO_SCHD_TYP_MAP_R S1_C = MSC_IO_SCHD_TYP_MAP_R.create("C");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5020_MST_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T.slip_schd_no,
						S0_T.io_typ
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S1_W
									.innerJoin(S1_C).on(S1_W.io_schd_typ.eq(S1_C.io_schd_typ))
								)
								.where(
									value(0).eq(value(0))
									.and(S1_C.rel_io_schd_typ.eq(S0_T.io_schd_typ))
									.and(S1_W.io_schd_sts_typ.eq(S0_T.io_schd_sts_typ))
									.and(S1_W.io_schd_no.eq(S0_T.io_schd_no))
								)
							)
						)
						.and(MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE(S0_T.io_schd_typ).eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MSBEL5020_MST_IO_SCHD_Query_U01
	 */
	static MCQueryPlan MSBEL5020_MST_IO_SCHD_U01() {
		MST_IO_SCHD_R S0_T = MST_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL5020_MST_IO_SCHD_Query_U01")
					.update(S0_T)
					.set(S0_T.io_schd_sts_typ).eq(bind("upd_io_schd_sts_typ"))
					.set(S0_T.avl_schd_dt).eq(cases()
							.when(MSC_IO_TYP$IS_GI(S0_T.io_typ).eq(value(true)))
								.then(nullValue())
							.when(
								bind("upd_insp_cmpl_schd_dt").isNotNull()
								.and(S0_T.accpt_schd_dt.isNotNull())
							)
								.then(
									greatest(
										S0_T.schd_dt,
										S0_T.accpt_schd_dt,
										bind("upd_insp_cmpl_schd_dt")
									)
							)
							.when(S0_T.accpt_schd_dt.isNotNull())
								.then(
									greatest(
										S0_T.schd_dt,
										S0_T.accpt_schd_dt
									)
							)
							.when(bind("upd_insp_cmpl_schd_dt").isNotNull())
								.then(
									greatest(
										S0_T.schd_dt,
										bind("upd_insp_cmpl_schd_dt")
									)
							)
							.otherwise(S0_T.schd_dt)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.io_schd_typ.eq(bind("io_schd_typ")))
						.and(S0_T.io_schd_sts_typ.eq(bind("io_schd_sts_typ")))
						.and(S0_T.io_schd_no.eq(bind("io_schd_no")))
						.and(
							bind("io_schd_seq").isNull()
							.or(S0_T.io_schd_seq.eq(bind("io_schd_seq")))
						)
					)
			);
	}
}