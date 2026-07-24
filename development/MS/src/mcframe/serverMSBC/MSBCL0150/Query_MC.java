package mcframe.serverMSBC.MSBCL0150;

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
	 * -- MSBCL0150_MST_SIM_MRP_Query_S01
	 */
	static MCQueryPlan MSBCL0150_MST_SIM_MRP_S01() {
		MST_SIM_MRP_R S0_T1 = MST_SIM_MRP_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MCTempView S0_T2 = createTempView("T2");
		MAM_USR_R S0_M1 = MAM_USR_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MST_SIM_ITM_ORDER_R S1_T2A = MST_SIM_ITM_ORDER_R.create("T2A");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0150_MST_SIM_MRP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sim_mrp_no,
						S0_T1.wg_cd,
						S0_T1.sim_mrp_typ,
						S0_T1.sim_usr_cd,
						S0_T1.dly_rqmt_flg,
						S0_T1.gi_flg,
						S0_T1.gr_flg,
						S0_T1.ship_flg,
						S0_T1.stk_flg,
						S0_T1.mrp_proc_dt,
						S0_T1.tree_lvl,
						nvl(
							S0_T2.pr("exp_flg"),
							value(false)
						).as("exp_flg"),
						S0_T1.intr_rmrks.as("sim_mrp_intr_rmrks"),
						S0_T1.sub_char1.as("sim_mrp_sub_char1"),
						S0_T1.sub_char2.as("sim_mrp_sub_char2"),
						S0_T1.sub_char3.as("sim_mrp_sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.wg_cd.eq(S0_DAC.wg_cd)
							)
						)
						.leftOuterJoin(
							subQuery()
							.selectDistinct(
								S1_T2A.sim_mrp_no,
								value(true).as("exp_flg")
							)
							.from(S1_T2A)
							.where(
								S1_T2A.exp_dt.isNotNull()
							).view(S0_T2)
						).on(
							bracket(
								S0_T1.sim_mrp_no.eq(S0_T2.pr(S1_T2A.sim_mrp_no))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.sim_mrp_no.like(bind("sim_mrp_no")))
						.cutoff$and(S0_T1.sim_mrp_typ.like(bind("sim_mrp_typ")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sim_usr_cd.like(bind("sim_usr_cd")))
						.cutoff$and(S0_T1.mrp_proc_dt.gte(bind("mrp_proc_dt_from")))
						.cutoff$and(S0_T1.mrp_proc_dt.lte(bind("mrp_proc_dt_to")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("sim_mrp_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sim_mrp_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sim_mrp_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sim_mrp_sub_char3")))
					)
					.orderBy(S0_T1.sim_mrp_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("sim_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.sim_usr_cd.eq(S0_M1.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.usr_nm.like(bind("sim_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.wg_cd.eq(S0_M2.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sim_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sim_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0150_MST_SIM_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL0150_MST_SIM_RQMT_S01() {
		MST_SIM_MRP_R S0_T1 = MST_SIM_MRP_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MST_SIM_RQMT_R S0_T2 = MST_SIM_RQMT_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_WG_R S0_M3 = MAM_WG_R.create("M3");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0150_MST_SIM_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sim_mrp_no,
						S0_T2.rqmt_no,
						S0_T2.due_dt,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M20.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.strg_loc_cd,
						S0_T2.wg_cd,
						S0_T2.rqmt_qty,
						S0_M1.unit_cd,
						S0_M1.dec_place.as("unit_dec_place"),
						S0_T2.sno1,
						S0_M1.sno1_mng_typ,
						S0_M1.rqmt_sno1_flg,
						S0_M1.sno1_num_typ,
						S0_T2.sno2,
						S0_M1.sno2_mng_typ,
						S0_M1.rqmt_sno2_flg,
						S0_M1.sno2_num_typ,
						S0_T2.sno3,
						S0_M1.sno3_mng_typ,
						S0_M1.rqmt_sno3_flg,
						S0_M1.sno3_num_typ,
						S0_T2.sno4,
						S0_M1.sno4_mng_typ,
						S0_M1.rqmt_sno4_flg,
						S0_M1.sno4_num_typ,
						S0_T2.mfg_loc_cd,
						S0_T2.sppl_cd,
						S0_T2.rqst_loc_cd,
						S0_T2.rqmt_typ,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_ts,
						S0_T2.ins_func_id,
						S0_T2.upd_cntr,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_ts,
						S0_T2.upd_func_id,
						S0_T2.upd_srv_req_no,
						S0_T1.wg_cd.as("join_wg_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.wg_cd.eq(S0_DAC.wg_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.sim_mrp_no.eq(S0_T2.sim_mrp_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M20.sno1))
								.and(S0_T2.sno2.eq(S0_M20.sno2))
								.and(S0_T2.sno3.eq(S0_M20.sno3))
								.and(S0_T2.sno4.eq(S0_M20.sno4))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.sim_mrp_no.like(bind("sim_mrp_no")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.sim_usr_cd.like(bind("sim_usr_cd")))
						.cutoff$and(S0_T1.mrp_proc_dt.gte(bind("mrp_proc_dt_from")))
						.cutoff$and(S0_T1.mrp_proc_dt.lte(bind("mrp_proc_dt_to")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("sim_mrp_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sim_mrp_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sim_mrp_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sim_mrp_sub_char3")))
					)
					.orderBy(S0_T2.rqmt_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.wg_nm.like(bind("wg_nm")))),
				when(boundOr("sim_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.sim_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("sim_usr_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("strg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					})
				)
			);
	}
}