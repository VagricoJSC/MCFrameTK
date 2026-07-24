package mcframe.serverMSBB.MSBBL1440;

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
	 * -- MSBBL1440_MBT_SLS_SLIP_SND_IF_Query_S01
	 */
	static MCQueryPlan MSBBL1440_MBT_SLS_SLIP_SND_IF_S01() {
		MBT_SLS_SLIP_SND_IF_R SLIPSNDIF = MBT_SLS_SLIP_SND_IF_R.create("SLSSLIPSNDIF");
		MAM_TRD_R TRD = MAM_TRD_R.create("TRD");
		MAM_BP_R CST = MAM_BP_R.create("CST");
		MAM_BP_R PRSPPL = MAM_BP_R.create("PRSPPL");
		MAM_USR_R USR = MAM_USR_R.create("USR");
		MAM_DPT_R SLSDPT = MAM_DPT_R.create("SLSDPT");
		MAM_DPT_R ASSTDPT = MAM_DPT_R.create("ASSTDPT");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");

		return createQueryPlan()
				.setQuery(
					sql("MSBBL1440_MBT_SLS_SLIP_SND_IF_Query_S01")
						.mainQuery()
						.select(
							SLIPSNDIF.trd_cd,
							SLIPSNDIF.trd_ptn_typ,
							SLIPSNDIF.data_no,
							SLIPSNDIF.data_lno,
							SLIPSNDIF.sls_slip_no,
							SLIPSNDIF.ac_ym,
							SLIPSNDIF.ac_dt,
							SLIPSNDIF.cst_cd,
							CST.bp_nm.as("cst_nm"),
							SLIPSNDIF.usr_cd,
							SLIPSNDIF.sls_dpt_cd,
							SLSDPT.dpt_nm.as("sls_dpt_nm"),
							SLIPSNDIF.asst_dpt_cd,
							ASSTDPT.dpt_nm.as("asst_dpt_nm"),
							SLIPSNDIF.prsppl_cd,
							PRSPPL.bp_nm.as("prsppl_nm"),
							SLIPSNDIF.ext_sys_cd,
							SLIPSNDIF.ins_ts.as("snd_ts"),
							SLIPSNDIF.re_snd_flg,
							SLIPSNDIF.not_snd_flg,
							SLIPSNDIF.snd_to_err_flg,
							SLIPSNDIF.ins_usr_id,
							SLIPSNDIF.ins_usr_nm,
							SLIPSNDIF.ins_func_id,
							SLIPSNDIF.ins_ts,
							SLIPSNDIF.upd_cntr,
							SLIPSNDIF.upd_usr_id,
							SLIPSNDIF.upd_usr_nm,
							SLIPSNDIF.upd_func_id,
							SLIPSNDIF.upd_ts,
							SLIPSNDIF.upd_srv_req_no
						)
						.from(
							SLIPSNDIF
							.leftOuterJoin(CST).on(
								bracket(
									SLIPSNDIF.cst_cd.eq(CST.bp_cd)
								)
							)
							.leftOuterJoin(PRSPPL).on(
								bracket(
									SLIPSNDIF.prsppl_cd.eq(PRSPPL.bp_cd)
								)
							)
							.leftOuterJoin(SLSDPT).on(
								bracket(
									SLIPSNDIF.sls_dpt_cd.eq(SLSDPT.dpt_cd)
									.and(SLIPSNDIF.ac_dt.between(SLSDPT.st_dt, SLSDPT.end_dt))
								)
							)
							.leftOuterJoin(ASSTDPT).on(
								bracket(
									SLIPSNDIF.asst_dpt_cd.eq(ASSTDPT.dpt_cd)
									.and(SLIPSNDIF.ac_dt.between(ASSTDPT.st_dt, ASSTDPT.end_dt))
								)
							)
							.addDynamicView()
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(SLIPSNDIF.ac_ym.gte(bind("ac_ym_fr")))
							.cutoff$and(SLIPSNDIF.ac_ym.lte(bind("ac_ym_to")))
							.cutoff$and(SLIPSNDIF.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(SLIPSNDIF.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(SLIPSNDIF.trd_cd.like(bind("trd_cd")))
							.addDynamicPredicate()
							.cutoff$and(SLIPSNDIF.cst_cd.like(bind("cst_cd")))
							.cutoff$and(CST.bp_nm.like(bind("cst_nm")))
							.cutoff$and(SLIPSNDIF.usr_cd.like(bind("usr_cd")))
							.cutoff$and(SLIPSNDIF.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(SLSDPT.dpt_nm.like(bind("sls_dpt_nm")))
							.cutoff$and(SLIPSNDIF.asst_dpt_cd.like(bind("asst_dpt_cd")))
							.cutoff$and(ASSTDPT.dpt_nm.like(bind("asst_dpt_nm")))
							.cutoff$and(SLIPSNDIF.prsppl_cd.like(bind("prsppl_cd")))
							.cutoff$and(PRSPPL.bp_nm.like(bind("prsppl_nm")))
							.cutoff$and(SLIPSNDIF.data_no.eq(bind("data_no")))
							.cutoff$and(SLIPSNDIF.sls_slip_no.like(bind("sls_slip_no")))
							.cutoff$and(SLIPSNDIF.ext_sys_cd.like(bind("ext_sys_cd")))
						)
				)
				.setDynamicSQLInfo(
					when(boundOr("trd_nm"))
						.view(v -> v.leftOuterJoin(TRD).on(bracket(SLIPSNDIF.trd_cd.eq(TRD.trd_cd))))
						.predicate(p -> p.cutoff$and(TRD.trd_nm.like(bind("trd_nm")))),
					when(boundOr("usr_nm"))
						.view(v -> v.leftOuterJoin(USR).on(bracket(SLIPSNDIF.usr_cd.eq(USR.usr_cd))))
						.predicate(p -> p.cutoff$and(USR.usr_nm.like(bind("usr_nm")))),
					when(boundOr("ext_sys_nm"))
						.view(v -> v.leftOuterJoin(EXTSYS).on(bracket(SLIPSNDIF.ext_sys_cd.eq(EXTSYS.ext_sys_cd))))
						.predicate(p -> p.cutoff$and(EXTSYS.ext_sys_nm.like(bind("ext_sys_nm"))))
				)
				.setJoinInfo(
					joinInfo(
						j -> j
							.add(MAM_TRD_R.class, r -> toCondition(
								r.getStringNE("trd_cd")
							))
							.addSelect(m -> toArray(
								m.trd_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("trd_nm", m.trd_nm());
						}),
						j -> j
							.add(MAM_USR_R.class, r -> toCondition(
								r.getStringNE("usr_cd")
							))
							.addSelect(m -> toArray(
								m.usr_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("usr_nm", m.usr_nm());
						}),
						j -> j
							.add(MAM_EXT_SYS_R.class, r -> toCondition(
								r.getStringNE("ext_sys_cd")
							))
							.addSelect(m -> toArray(
								m.ext_sys_nm
							))
							.addMap((r, m) -> {
								r.setStringNE("ext_sys_nm", m.ext_sys_nm());
						})
					)
				);
	}
}