package mcframe.serverMSBD.MSBDL0220;

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
	 * -- MSBDL0220_MBT_PURC_SLIP_SND_IF_Query_S01
	 */
	static MCQueryPlan MSBDL0220_MBT_PURC_SLIP_SND_IF_S01() {
		MBT_PURC_SLIP_SND_IF_R SLIPSNDIF = MBT_PURC_SLIP_SND_IF_R.create("PURCSLIPSNDIF");
		MAM_TRD_R TRD = MAM_TRD_R.create("TRD");
		MAM_BP_R SPPL = MAM_BP_R.create("SPPL");
		MAM_USR_R USR = MAM_USR_R.create("USR");
		MAM_DPT_R DPT = MAM_DPT_R.create("DPT");
		MAM_EXT_SYS_R EXTSYS = MAM_EXT_SYS_R.create("EXTSYS");

		return createQueryPlan()
				.setQuery(
					sql("MSBDL0220_MBT_PURC_SLIP_SND_IF_Query_S01")
						.mainQuery()
						.select(
							SLIPSNDIF.trd_cd,
							SLIPSNDIF.trd_ptn_typ,
							SLIPSNDIF.data_no,
							SLIPSNDIF.data_lno,
							SLIPSNDIF.purc_slip_no,
							SLIPSNDIF.ac_ym,
							SLIPSNDIF.ac_dt,
							SLIPSNDIF.sppl_cd,
							SPPL.bp_nm.as("sppl_nm"),
							SLIPSNDIF.usr_cd,
							SLIPSNDIF.dpt_cd,
							DPT.dpt_nm,
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
							.leftOuterJoin(SPPL).on(
								bracket(
									SLIPSNDIF.sppl_cd.eq(SPPL.bp_cd)
								)
							)
							.leftOuterJoin(DPT).on(
								bracket(
									SLIPSNDIF.dpt_cd.eq(DPT.dpt_cd)
									.and(SLIPSNDIF.ac_dt.between(DPT.st_dt, DPT.end_dt))
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
							.cutoff$and(SLIPSNDIF.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(SPPL.bp_nm.like(bind("sppl_nm")))
							.cutoff$and(SLIPSNDIF.usr_cd.like(bind("usr_cd")))
							.cutoff$and(SLIPSNDIF.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(DPT.dpt_nm.like(bind("dpt_nm")))
							.cutoff$and(SLIPSNDIF.data_no.eq(bind("data_no")))
							.cutoff$and(SLIPSNDIF.purc_slip_no.like(bind("purc_slip_no")))
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