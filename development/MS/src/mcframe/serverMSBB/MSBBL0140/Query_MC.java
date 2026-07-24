package mcframe.serverMSBB.MSBBL0140;

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
	 * -- MSBBL0140_MST_SPLN_SUM_VERS_Query_S01
	 */
	static MCQueryPlan MSBBL0140_MST_SPLN_SUM_VERS_S01() {
		MST_SPLN_SUM_VERS_R S0_T1 = MST_SPLN_SUM_VERS_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_DTL_R S0_T3 = MST_SPLN_SUM_DTL_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0140_MST_SPLN_SUM_VERS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.cst_cd,
						S0_M3.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T4.wrk_nm,
						S0_T1.edited_flg,
						S0_T1.adopted_flg,
						S0_T1.locked_flg,
						S0_T1.ref_vers,
						S0_T1.usr_cd,
						S0_M4.usr_nm,
						min(S0_T2.fix_flg).as("fix_flg"),
						min(S0_T3.spln_ym).as("st_ym"),
						max(S0_T3.spln_ym).as("end_ym"),
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.spln_vers.eq(S0_T1.spln_vers))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_T2.dpt_cd)
								.and(S0_T3.cst_cd.eq(S0_T2.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T2.wrk_no))
								.and(S0_T3.ym.eq(S0_T2.ym))
								.and(S0_T3.spln_vers.eq(S0_T2.spln_vers))
								.and(S0_T3.spln_itm_cd.eq(S0_T2.spln_itm_cd))
								.and(S0_T3.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T3.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T3.cur_cd.eq(S0_T2.cur_cd))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M3.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.usr_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T1.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T1.spln_vers.like(bind("spln_vers")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.edited_flg.eq(bind("edited_flg_str")))
						.cutoff$and(S0_T1.adopted_flg.eq(bind("adopted_flg_str")))
						.cutoff$and(S0_T1.usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_M3.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_M4.usr_nm.like(bind("usr_nm")))
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.groupBy(
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.cst_cd,
						S0_M3.bp_nm,
						S0_T1.wrk_no,
						S0_T4.wrk_nm,
						S0_T1.edited_flg,
						S0_T1.adopted_flg,
						S0_T1.locked_flg,
						S0_T1.ref_vers,
						S0_T1.usr_cd,
						S0_M4.usr_nm,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.orderBy(
						S0_T1.ym.asc(),
						S0_T1.spln_vers.asc(),
						S0_T1.dpt_cd.asc(),
						S0_T1.cst_cd.asc(),
						S0_T1.wrk_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M2.wg_cd.eq(S0_M1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M3.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M3.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M3.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M3.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M3.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M3.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M3.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M3.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M3.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M3.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
	/**
	 * MSBBL0140_MST_SPLN_USR_VERS_S01
	 */
	static MCQueryPlan MSBBL0140_MST_SPLN_USR_VERS_S01() {
		MST_SPLN_USR_VERS_R S0_T1 = MST_SPLN_USR_VERS_R.create("T1");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SPLN_USR_DTL_R S0_T3 = MST_SPLN_USR_DTL_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");

		return createQueryPlan()
			.setQuery(
				sql("MSBBL0140_MST_SPLN_USR_VERS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.usr_cd,
						S0_M4.usr_nm,
						addDynamicSelect(),
						S0_T1.edited_flg,
						min(S0_T2.fix_flg).as("fix_flg"),
						min(S0_T3.spln_ym).as("st_ym"),
						max(S0_T3.spln_ym).as("end_ym"),
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ym.eq(S0_T1.ym)
								.and(S0_T2.usr_cd.eq(S0_T1.usr_cd))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T2.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_T2.dpt_cd)
								.and(S0_T3.cst_cd.eq(S0_T2.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T2.wrk_no))
								.and(S0_T3.ym.eq(S0_T2.ym))
								.and(S0_T3.usr_cd.eq(S0_T2.usr_cd))
								.and(S0_T3.spln_itm_cd.eq(S0_T2.spln_itm_cd))
								.and(S0_T3.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T3.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T3.cur_cd.eq(S0_T2.cur_cd))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.wrk_no.eq(S0_T2.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T2.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_M1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.bp_cd.eq(S0_T2.cst_cd)
								.and(S0_M3.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.usr_cd)
							)
						)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T1.ym.lte(bind("ym_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.edited_flg.eq(bind("edited_flg_str")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M4.usr_nm.like(bind("usr_nm")))
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.groupBy(
						S0_T1.ym,
						S0_T1.usr_cd,
						S0_M4.usr_nm,
						addDynamicGroupBy(),
						S0_T1.edited_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.orderBy(
						S0_T1.ym.asc(),
						S0_T1.usr_cd.asc(),
						addDynamicOrderBy()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dpt_flg"))
					.select(S0_T2.dpt_cd, S0_M1.dpt_nm)
					.predicate(p -> p.cutoff$and(S0_T2.dpt_cd.like(bind("dpt_cd"))).cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm"))))
					.groupBy(S0_T2.dpt_cd,S0_M1.dpt_nm)
					.orderBy(S0_T2.dpt_cd.asc()),
				when(boundOr("cst_flg"))
					.select(S0_T2.cst_cd, S0_M3.bp_nm.as("cst_nm"))
					.predicate(p -> p.cutoff$and(S0_T2.cst_cd.like(bind("cst_cd"))).cutoff$and(S0_M3.bp_nm.like(bind("cst_nm"))))
					.groupBy(S0_T2.cst_cd,S0_M3.bp_nm)
					.orderBy(S0_T2.cst_cd.asc()),
				when(boundOr("wrk_flg"))
					.select(S0_T2.wrk_no, S0_T4.wrk_nm)
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm"))))
					.groupBy(S0_T2.wrk_no, S0_T4.wrk_nm)
					.orderBy(S0_T2.wrk_no.asc()),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M3.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M3.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M3.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M3.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M3.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M3.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M3.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M3.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M3.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M3.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
	
}