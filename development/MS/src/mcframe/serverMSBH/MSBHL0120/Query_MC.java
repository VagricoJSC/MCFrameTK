package mcframe.serverMSBH.MSBHL0120;

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
	 * -- MSBHL0120_MST_AP_D_Query_S01
	 */
	static MCQueryPlan MSBHL0120_MST_AP_D_S01() {
		MST_AP_D_R S0_T1 = MST_AP_D_R.create("T1");
		MAVM_RD_DPT_R S0_D1 = MAVM_RD_DPT_R.create("D1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MST_AP_D_R S1_ST1 = MST_AP_D_R.create("ST1");
		MST_AP_D_R S2_ST1 = MST_AP_D_R.create("ST1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0120_MST_AP_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ac_dt,
						S0_T1.slip_sts_typ,
						S0_T1.trd_cd,
						S0_T1.ap_typ,
						S0_T1.purc_act_no.as("act_no"),
						S0_T1.purc_act_rev.as("act_rev"),
						S0_T1.purc_act_seq.as("act_seq"),
						S0_T1.purc_act_d_no.as("act_d_no"),
						S0_T1.purc_act_d_seq.as("act_d_seq"),
						bracket(
							cases()
								.when(S0_M2.sppl_iv_flg.eq(value(true)))
									.then(S0_T1.rcpt_iv_no)
								.when(S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.rcpt_iv_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("rcpt_iv_no"),
						bracket(
							cases()
								.when(S0_M2.sppl_iv_flg.eq(value(true)))
									.then(S0_T1.rcpt_iv_mng_no)
								.when(S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.rcpt_iv_mng_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("rcpt_iv_mng_no"),
						S0_T1.wrk_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.interim_flg,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt.add(S0_T1.trd_cur_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_tax_amt.add(S0_T1.base_cur_amt).as("base_cur_inc_tax_amt"),
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.base_cur_dscnt_amt,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M1.dpt_nm.as("ap_dpt_nm"),
						S0_M1.wg_cd,
						S0_T1.sppl_cd,
						S0_M2.bp_nm.as("sppl_nm"),
						S0_T1.purc_dpt_cd,
						S0_T1.purc_usr_cd,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.trd_cur_proc_upri,
						S0_T1.trd_cur_proc_amt,
						S0_T1.trd_cur_onr_prov_upri,
						S0_T1.trd_cur_onr_prov_amt,
						S0_T1.base_cur_proc_upri,
						S0_T1.base_cur_proc_amt,
						S0_T1.base_cur_onr_prov_upri,
						S0_T1.base_cur_onr_prov_amt,
						S0_T1.base_purc_ac_dt,
						S0_T1.repurc_obli_flg,
						S0_T1.outsrc_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.innerJoin(S0_D1).on(S0_T1.ap_dpt_cd.eq(S0_D1.dpt_cd))
						.leftOuterJoin(S0_M1).on(
							S0_T1.ap_dpt_cd.eq(S0_M1.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.leftOuterJoin(S0_M2).on(S0_T1.sppl_cd.eq(S0_M2.bp_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									S1_ST1.ap_d_no.neq(S1_ST1.org_ap_d_no)
									.and(S1_ST1.org_ap_d_no.eq(S0_T1.ap_d_no))
								)
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S2_ST1)
								.where(
									S2_ST1.crryovr_src_ap_d_no.eq(S0_T1.ap_d_no)
								)
							)
						)
						.and(S0_T1.sw_flg.eq(value(false)))
						.and(S0_T1.ac_ym.eq(bind("ac_ym")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ap_typ.like(bind("ap_typ")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(
							bracket(
								cases()
									.when(
										bind("tmp_base_cur_cd").neq(S0_T1.trd_cur_cd)
										.and(
											S0_M2.sppl_iv_flg.eq(value(false))
											.or(
												S0_M2.sppl_iv_flg.eq(value(true))
												.and(S0_T1.rcpt_iv_no.eq(value(MAC_STR.NULL_VAL.value())))
											)
										)
									)
										.then(S0_T1.purc_act_no)
									.when(S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S0_T1.purc_act_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("purc_act_no"))
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S0_M2.sppl_iv_flg.eq(value(true)))
										.then(S0_T1.rcpt_iv_no)
									.when(S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S0_T1.rcpt_iv_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("rcpt_iv_no"))
						)
						.cutoff$and(
							bracket(
								cases()
									.when(S0_M2.sppl_iv_flg.eq(value(true)))
										.then(S0_T1.rcpt_iv_mng_no)
									.when(S0_T1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.then(S0_T1.rcpt_iv_mng_no)
									.otherwise(value(MAC_STR.NULL_VAL.value()))
							).like(bind("rcpt_iv_mng_no"))
						)
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.purc_act_no.asc(),
						S0_T1.purc_act_seq.asc(),
						S0_T1.purc_act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_T4).on(S0_T1.wrk_no.eq(S0_T4.wrk_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M8).on(S0_M1.wg_cd.eq(S0_M8.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M8.wg_nm.like(bind("wg_nm")))),
				when(boundOr("asppl_nm", "asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M7).on(S0_T1.asppl_cd.eq(S0_M7.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M7.bp_nm.like(bind("asppl_nm")))
							.cutoff$and(S0_M7.bp_grp_cd1.like(bind("asppl_grp_cd1")))
							.cutoff$and(S0_M7.bp_grp_cd2.like(bind("asppl_grp_cd2")))
							.cutoff$and(S0_M7.bp_grp_cd3.like(bind("asppl_grp_cd3")))
							.cutoff$and(S0_M7.bp_grp_cd4.like(bind("asppl_grp_cd4")))
							.cutoff$and(S0_M7.bp_grp_cd5.like(bind("asppl_grp_cd5")))
							.cutoff$and(S0_M7.bp_grp_cd6.like(bind("asppl_grp_cd6")))
							.cutoff$and(S0_M7.bp_grp_cd7.like(bind("asppl_grp_cd7")))
							.cutoff$and(S0_M7.bp_grp_cd8.like(bind("asppl_grp_cd8")))
							.cutoff$and(S0_M7.bp_grp_cd9.like(bind("asppl_grp_cd9")))
							.cutoff$and(S0_M7.bp_grp_cd10.like(bind("asppl_grp_cd10")))
							),
					
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_M7.bp_grp_cd1.as("asppl_grp_cd1"))
					.groupBy(DS0D, S0_M7.bp_grp_cd1),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL_GRP1.bp_grp_nm.as("asppl_grp_nm1"))
					.groupBy(DS0D, S0_ASPPL_GRP1.bp_grp_nm),
				when(boundOr("asppl_grp_flg1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_M7.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_M7.bp_grp_cd2.as("asppl_grp_cd2"))
					.groupBy(DS0D, S0_M7.bp_grp_cd2),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL_GRP2.bp_grp_nm.as("asppl_grp_nm2"))
					.groupBy(DS0D, S0_ASPPL_GRP2.bp_grp_nm),
				when(boundOr("asppl_grp_flg2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_M7.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_M7.bp_grp_cd3.as("asppl_grp_cd3"))
					.groupBy(DS0D, S0_M7.bp_grp_cd3),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL_GRP3.bp_grp_nm.as("asppl_grp_nm3"))
					.groupBy(DS0D, S0_ASPPL_GRP3.bp_grp_nm),
				when(boundOr("asppl_grp_flg3", "asppl_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_M7.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_M7.bp_grp_cd4.as("asppl_grp_cd4"))
					.groupBy(DS0D, S0_M7.bp_grp_cd4),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL_GRP4.bp_grp_nm.as("asppl_grp_nm4"))
					.groupBy(DS0D, S0_ASPPL_GRP4.bp_grp_nm),
				when(boundOr("asppl_grp_flg4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_M7.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_M7.bp_grp_cd5.as("asppl_grp_cd5"))
					.groupBy(DS0D, S0_M7.bp_grp_cd5),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL_GRP5.bp_grp_nm.as("asppl_grp_nm5"))
					.groupBy(DS0D, S0_ASPPL_GRP5.bp_grp_nm),
				when(boundOr("asppl_grp_flg5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_M7.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_M7.bp_grp_cd6.as("asppl_grp_cd6"))
					.groupBy(DS0D, S0_M7.bp_grp_cd6),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL_GRP6.bp_grp_nm.as("asppl_grp_nm6"))
					.groupBy(DS0D, S0_ASPPL_GRP6.bp_grp_nm),
				when(boundOr("asppl_grp_flg6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_M7.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_M7.bp_grp_cd7.as("asppl_grp_cd7"))
					.groupBy(DS0D, S0_M7.bp_grp_cd7),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL_GRP7.bp_grp_nm.as("asppl_grp_nm7"))
					.groupBy(DS0D, S0_ASPPL_GRP7.bp_grp_nm),
				when(boundOr("asppl_grp_flg7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_M7.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_M7.bp_grp_cd8.as("asppl_grp_cd8"))
					.groupBy(DS0D, S0_M7.bp_grp_cd8),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL_GRP8.bp_grp_nm.as("asppl_grp_nm8"))
					.groupBy(DS0D, S0_ASPPL_GRP8.bp_grp_nm),
				when(boundOr("asppl_grp_flg8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_M7.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_M7.bp_grp_cd9.as("asppl_grp_cd9"))
					.groupBy(DS0D, S0_M7.bp_grp_cd9),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL_GRP9.bp_grp_nm.as("asppl_grp_nm9"))
					.groupBy(DS0D, S0_ASPPL_GRP9.bp_grp_nm),
				when(boundOr("asppl_grp_flg9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_M7.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_M7.bp_grp_cd10.as("asppl_grp_cd10"))
					.groupBy(DS0D, S0_M7.bp_grp_cd10),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL_GRP10.bp_grp_nm.as("asppl_grp_nm10"))
					.groupBy(DS0D, S0_ASPPL_GRP10.bp_grp_nm),
				when(boundOr("asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_M7.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBHL0120_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL0120_MST_PAY_ACT_D_S01() {
		MST_PAY_ACT_D_R S0_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_PAY_ACT_R S0_T2 = MST_PAY_ACT_R.create("T2");
		MST_ADV_PAY_ACT_R S0_T3 = MST_ADV_PAY_ACT_R.create("T3");
		MAVM_RD_DPT_R S0_D1 = MAVM_RD_DPT_R.create("D1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MAM_BP_GRP_R S0_ASPPL_GRP1 = MAM_BP_GRP_R.create("ASPPL_GRP1");
		MAM_BP_GRP_R S0_ASPPL_GRP2 = MAM_BP_GRP_R.create("ASPPL_GRP2");
		MAM_BP_GRP_R S0_ASPPL_GRP3 = MAM_BP_GRP_R.create("ASPPL_GRP3");
		MAM_BP_GRP_R S0_ASPPL_GRP4 = MAM_BP_GRP_R.create("ASPPL_GRP4");
		MAM_BP_GRP_R S0_ASPPL_GRP5 = MAM_BP_GRP_R.create("ASPPL_GRP5");
		MAM_BP_GRP_R S0_ASPPL_GRP6 = MAM_BP_GRP_R.create("ASPPL_GRP6");
		MAM_BP_GRP_R S0_ASPPL_GRP7 = MAM_BP_GRP_R.create("ASPPL_GRP7");
		MAM_BP_GRP_R S0_ASPPL_GRP8 = MAM_BP_GRP_R.create("ASPPL_GRP8");
		MAM_BP_GRP_R S0_ASPPL_GRP9 = MAM_BP_GRP_R.create("ASPPL_GRP9");
		MAM_BP_GRP_R S0_ASPPL_GRP10 = MAM_BP_GRP_R.create("ASPPL_GRP10");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0120_MST_PAY_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T2.ac_dt,
						S0_T2.slip_sts_typ,
						S0_T2.pay_act_no.as("act_no"),
						S0_T2.pay_act_rev.as("act_rev"),
						S0_T2.pay_act_seq.as("act_seq"),
						S0_T1.pay_act_d_no.as("act_d_no"),
						S0_T1.pay_act_d_seq.as("act_d_seq"),
						S0_T1.ap_typ,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.purc_act_no,
						S0_T1.wrk_no,
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T3.ap_sttl_cd.as("adv_pay_ap_sttl_cd"),
						S0_T3.ap_sttl_typ.as("adv_pay_ap_sttl_typ"),
						S0_T1.trd_cur_amt,
						S0_T1.base_cur_amt,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_M1.dpt_nm.as("ap_dpt_nm"),
						S0_M1.wg_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.pay_act_no.eq(S0_T2.pay_act_no)
							.and(S0_T1.pay_act_seq.eq(S0_T2.pay_act_seq))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T1.adv_pay_act_no.eq(S0_T3.adv_pay_act_no)
							.and(S0_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.innerJoin(S0_D1).on(S0_T1.ap_dpt_cd.eq(S0_D1.dpt_cd))
						.leftOuterJoin(S0_M1).on(
							S0_T1.ap_dpt_cd.eq(S0_M1.dpt_cd)
							.and(S0_T2.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.ac_ym.eq(bind("ac_ym")))
						.and(
							S0_T1.ap_sttl_typ.notIn(
								value(MAC_AP_STTL_TYP.ACNT_COM_PAID.value()),
								value(MAC_AP_STTL_TYP.CASH_COM_PAID.value()),
								value(MAC_AP_STTL_TYP.APSW_IN_CHK.value()),
								value(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value()),
								value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value())
							)
						)
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.ap_typ.like(bind("ap_typ")))
						.cutoff$and(S0_T1.ap_dpt_cd.like(bind("ap_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("ap_dpt_nm")))
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.asppl_cd.like(bind("asppl_cd")))
						.cutoff$and(S0_T1.rcpt_iv_no.like(bind("rcpt_iv_no")))
						.cutoff$and(S0_T1.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
						.cutoff$and(S0_T1.purc_act_no.like(bind("purc_act_no")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T2.ac_dt.asc(),
						S0_T2.pay_act_no.asc(),
						S0_T2.pay_act_seq.asc(),
						S0_T1.pay_act_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_T4).on(S0_T1.wrk_no.eq(S0_T4.wrk_no)))
					.predicate(DS0D, p -> p.cutoff$and(S0_T4.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M8).on(S0_M1.wg_cd.eq(S0_M8.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M8.wg_nm.like(bind("wg_nm")))),
				when(boundOr("asppl_nm", 
						"asppl_grp_flg1", "asppl_grp_flg2", "asppl_grp_flg3", "asppl_grp_flg4", "asppl_grp_flg5", "asppl_grp_flg6", "asppl_grp_flg7", "asppl_grp_flg8", "asppl_grp_flg9", "asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_M7).on(S0_T1.asppl_cd.eq(S0_M7.bp_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_M7.bp_nm.like(bind("asppl_nm")))
							.cutoff$and(S0_M7.bp_grp_cd1.like(bind("asppl_grp_cd1")))
							.cutoff$and(S0_M7.bp_grp_cd2.like(bind("asppl_grp_cd2")))
							.cutoff$and(S0_M7.bp_grp_cd3.like(bind("asppl_grp_cd3")))
							.cutoff$and(S0_M7.bp_grp_cd4.like(bind("asppl_grp_cd4")))
							.cutoff$and(S0_M7.bp_grp_cd5.like(bind("asppl_grp_cd5")))
							.cutoff$and(S0_M7.bp_grp_cd6.like(bind("asppl_grp_cd6")))
							.cutoff$and(S0_M7.bp_grp_cd7.like(bind("asppl_grp_cd7")))
							.cutoff$and(S0_M7.bp_grp_cd8.like(bind("asppl_grp_cd8")))
							.cutoff$and(S0_M7.bp_grp_cd9.like(bind("asppl_grp_cd9")))
							.cutoff$and(S0_M7.bp_grp_cd10.like(bind("asppl_grp_cd10")))
							),
					
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_M7.bp_grp_cd1.as("asppl_grp_cd1"))
					.groupBy(DS0D, S0_M7.bp_grp_cd1),
				when(boundOr("asppl_grp_flg1"))
					.select(DS0D, S0_ASPPL_GRP1.bp_grp_nm.as("asppl_grp_nm1"))
					.groupBy(DS0D, S0_ASPPL_GRP1.bp_grp_nm),
				when(boundOr("asppl_grp_flg1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP1).on(S0_M7.bp_grp_cd1.eq(S0_ASPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_ASPPL_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP1.bp_grp_nm.like(bind("asppl_grp_nm1")))),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_M7.bp_grp_cd2.as("asppl_grp_cd2"))
					.groupBy(DS0D, S0_M7.bp_grp_cd2),
				when(boundOr("asppl_grp_flg2"))
					.select(DS0D, S0_ASPPL_GRP2.bp_grp_nm.as("asppl_grp_nm2"))
					.groupBy(DS0D, S0_ASPPL_GRP2.bp_grp_nm),
				when(boundOr("asppl_grp_flg2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP2).on(S0_M7.bp_grp_cd2.eq(S0_ASPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_ASPPL_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP2.bp_grp_nm.like(bind("asppl_grp_nm2")))),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_M7.bp_grp_cd3.as("asppl_grp_cd3"))
					.groupBy(DS0D, S0_M7.bp_grp_cd3),
				when(boundOr("asppl_grp_flg3"))
					.select(DS0D, S0_ASPPL_GRP3.bp_grp_nm.as("asppl_grp_nm3"))
					.groupBy(DS0D, S0_ASPPL_GRP3.bp_grp_nm),
				when(boundOr("asppl_grp_flg3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP3).on(S0_M7.bp_grp_cd3.eq(S0_ASPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_ASPPL_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP3.bp_grp_nm.like(bind("asppl_grp_nm3")))),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_M7.bp_grp_cd4.as("asppl_grp_cd4"))
					.groupBy(DS0D, S0_M7.bp_grp_cd4),
				when(boundOr("asppl_grp_flg4"))
					.select(DS0D, S0_ASPPL_GRP4.bp_grp_nm.as("asppl_grp_nm4"))
					.groupBy(DS0D, S0_ASPPL_GRP4.bp_grp_nm),
				when(boundOr("asppl_grp_flg4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP4).on(S0_M7.bp_grp_cd4.eq(S0_ASPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_ASPPL_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP4.bp_grp_nm.like(bind("asppl_grp_nm4")))),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_M7.bp_grp_cd5.as("asppl_grp_cd5"))
					.groupBy(DS0D, S0_M7.bp_grp_cd5),
				when(boundOr("asppl_grp_flg5"))
					.select(DS0D, S0_ASPPL_GRP5.bp_grp_nm.as("asppl_grp_nm5"))
					.groupBy(DS0D, S0_ASPPL_GRP5.bp_grp_nm),
				when(boundOr("asppl_grp_flg5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP5).on(S0_M7.bp_grp_cd5.eq(S0_ASPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_ASPPL_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP5.bp_grp_nm.like(bind("asppl_grp_nm5")))),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_M7.bp_grp_cd6.as("asppl_grp_cd6"))
					.groupBy(DS0D, S0_M7.bp_grp_cd6),
				when(boundOr("asppl_grp_flg6"))
					.select(DS0D, S0_ASPPL_GRP6.bp_grp_nm.as("asppl_grp_nm6"))
					.groupBy(DS0D, S0_ASPPL_GRP6.bp_grp_nm),
				when(boundOr("asppl_grp_flg6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP6).on(S0_M7.bp_grp_cd6.eq(S0_ASPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_ASPPL_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP6.bp_grp_nm.like(bind("asppl_grp_nm6")))),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_M7.bp_grp_cd7.as("asppl_grp_cd7"))
					.groupBy(DS0D, S0_M7.bp_grp_cd7),
				when(boundOr("asppl_grp_flg7"))
					.select(DS0D, S0_ASPPL_GRP7.bp_grp_nm.as("asppl_grp_nm7"))
					.groupBy(DS0D, S0_ASPPL_GRP7.bp_grp_nm),
				when(boundOr("asppl_grp_flg7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP7).on(S0_M7.bp_grp_cd7.eq(S0_ASPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_ASPPL_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP7.bp_grp_nm.like(bind("asppl_grp_nm7")))),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_M7.bp_grp_cd8.as("asppl_grp_cd8"))
					.groupBy(DS0D, S0_M7.bp_grp_cd8),
				when(boundOr("asppl_grp_flg8"))
					.select(DS0D, S0_ASPPL_GRP8.bp_grp_nm.as("asppl_grp_nm8"))
					.groupBy(DS0D, S0_ASPPL_GRP8.bp_grp_nm),
				when(boundOr("asppl_grp_flg8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP8).on(S0_M7.bp_grp_cd8.eq(S0_ASPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_ASPPL_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP8.bp_grp_nm.like(bind("asppl_grp_nm8")))),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_M7.bp_grp_cd9.as("asppl_grp_cd9"))
					.groupBy(DS0D, S0_M7.bp_grp_cd9),
				when(boundOr("asppl_grp_flg9"))
					.select(DS0D, S0_ASPPL_GRP9.bp_grp_nm.as("asppl_grp_nm9"))
					.groupBy(DS0D, S0_ASPPL_GRP9.bp_grp_nm),
				when(boundOr("asppl_grp_flg9", "asppl_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP9).on(S0_M7.bp_grp_cd9.eq(S0_ASPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_ASPPL_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP9.bp_grp_nm.like(bind("asppl_grp_nm9")))),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_M7.bp_grp_cd10.as("asppl_grp_cd10"))
					.groupBy(DS0D, S0_M7.bp_grp_cd10),
				when(boundOr("asppl_grp_flg10"))
					.select(DS0D, S0_ASPPL_GRP10.bp_grp_nm.as("asppl_grp_nm10"))
					.groupBy(DS0D, S0_ASPPL_GRP10.bp_grp_nm),
				when(boundOr("asppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ASPPL_GRP10).on(S0_M7.bp_grp_cd10.eq(S0_ASPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_ASPPL_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ASPPL_GRP10.bp_grp_nm.like(bind("asppl_grp_nm10"))))
			);
	}
	
	static MCJoinerList<Srch01_Dtl1R> MSBHL0120_Srch01_Dtl1R_J01() {
		return joinInfo(
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.trd_cd()
				))
				.addSelect(m -> toArray(
					m.trd_nm,
					m.trd_ptn_typ
				))
				.addMap((r, m) -> {
					r.trd_nm(m.trd_nm());
					r.trd_ptn_typ(m.trd_ptn_typ());
				}),
			j -> j
				.add(MST_WRK_R.class, r -> toCondition(
					r.wrk_no()
				))
				.addSelect(m -> toArray(
					m.wrk_nm
				))
				.addMap((r, m) -> {
					r.wrk_nm(m.wrk_nm());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.trd_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.trd_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAM_UNIT_R.class, r -> toCondition(
					r.base_unit_cd()
				))
				.addSelect(m -> toArray(
					m.unit_nm
				))
				.addMap((r, m) -> {
					r.base_unit_nm(m.unit_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.tax_cd()
				))
				.addSelect(m -> toArray(
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.tax_nm(m.tax_nm());
					r.tax_rate(m.tax_rate());
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.adv_pay_ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.adv_pay_ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.wg_cd()
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.sppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.sppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.purc_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.purc_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.purc_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.purc_usr_nm(m.usr_nm());
				})
		);
	}
}