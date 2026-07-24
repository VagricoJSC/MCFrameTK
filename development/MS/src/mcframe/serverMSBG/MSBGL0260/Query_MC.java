package mcframe.serverMSBG.MSBGL0260;

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
	 * -- MSBGL0260_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0260_MST_RCV_ACT_D_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_BP_R S0_M7 = MAM_BP_R.create("M7");
		MAM_CUR_R S0_M8 = MAM_CUR_R.create("M8");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MST_RCV_ACT_R S1_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R S1_T2 = MST_RCV_ACT_D_R.create("T2");
		MST_WRK_R S1_T3 = MST_WRK_R.create("T3");
		MST_BILL_D_APPL_ACT_R S1_T4 = MST_BILL_D_APPL_ACT_R.create("T4");
		MAVM_RD_DPT_R S1_M12 = MAVM_RD_DPT_R.create("M12");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		MCDynamicSQLID DS0C_RCST_GRP = createDynamicSQLID("DS0C_RCST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0260_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.trd_cd),
						S0_V1.pr(S1_T1.rcv_act_no),
						S0_V1.pr(S1_T2.rcv_act_d_no),
						S0_V1.pr(S1_T1.ac_ym),
						S0_V1.pr(S1_T1.ac_dt),
						S0_V1.pr(S1_T1.rcv_dt),
						S0_V1.pr(S1_T1.rcst_cd),
						S0_V1.pr(S1_T2.bcst_cd),
						S0_V1.pr(S1_T2.bill_dpt_cd),
						S0_M4.dpt_nm.as("bill_dpt_nm"),
						S0_V1.pr(S1_T2.ar_dpt_cd),
						S0_M5.dpt_nm.as("ar_dpt_nm"),
						S0_V1.pr(S1_T2.wg_cd),
						S0_V1.pr(S1_T2.acst_cd),
						S0_V1.pr(S1_T2.iv_no),
						S0_V1.pr(S1_T1.trd_cur_cd),
						S0_V1.pr(S1_T2.wrk_no),
						S0_V1.pr(S1_T3.wrk_nm),
						S0_V1.pr(S1_T2.ar_typ),
						S0_V1.pr("tgt_appl_amt"),
						S0_V1.pr("appl_amt"),
						S0_V1.pr("not_appl_bal"),
						S0_V1.pr(S1_T1.rcv_no),
						S0_V1.pr(S1_T1.note_no),
						S0_V1.pr(S1_T1.bank_ac_cd),
						S0_V1.pr(S1_T2.trd_cur_amt1),
						S0_V1.pr(S1_T1.ar_sttl_cd2),
						S0_V1.pr(S1_T2.trd_cur_amt2),
						S0_V1.pr(S1_T1.rcv_auto_appl_flg),
						S0_V1.pr(S1_T1.trd_rmrks),
						S0_V1.pr(S1_T2.bill_d_rmrks),
						S0_V1.pr(S1_T1.sub_char1),
						S0_V1.pr(S1_T1.sub_char2),
						S0_V1.pr(S1_T1.sub_char3),
						S0_V1.pr(S1_T2.disp_seq),
						S0_V1.pr(S1_T1.ins_usr_id),
						S0_V1.pr(S1_T1.ins_usr_nm),
						S0_V1.pr(S1_T1.ins_ts),
						S0_V1.pr(S1_T1.ins_func_id),
						S0_V1.pr(S1_T1.upd_cntr),
						S0_V1.pr(S1_T1.upd_usr_id),
						S0_V1.pr(S1_T1.upd_usr_nm),
						S0_V1.pr(S1_T1.upd_ts),
						S0_V1.pr(S1_T1.upd_func_id),
						S0_V1.pr(S1_T1.upd_srv_req_no),
						addDynamicSelect(DS0C_ACST_GRP),
						addDynamicSelect(DS0C_RCST_GRP),
						addDynamicSelect(DS0C_BCST_GRP),
						S0_V1.pr(S1_T1.ar_sttl_cd1)
					)
					.from(
						subQuery()
						.select(
							S1_T1.trd_cd,
							S1_T1.rcv_act_no,
							S1_T2.rcv_act_d_no,
							S1_T1.ac_ym,
							S1_T1.ac_dt,
							S1_T1.rcv_dt,
							S1_T1.rcst_cd,
							S1_T2.bcst_cd,
							S1_T2.bill_dpt_cd,
							S1_T2.ar_dpt_cd,
							S1_T2.wg_cd,
							S1_T2.acst_cd,
							S1_T2.iv_no,
							S1_T1.trd_cur_cd,
							S1_T2.wrk_no,
							S1_T3.wrk_nm,
							S1_T2.ar_typ,
							bracket(
								S1_T2.trd_cur_amt1.add(S1_T2.trd_cur_amt2)
							).as("tgt_appl_amt"),
							nvl(
								sum(S1_T4.appl_amt),
								value(0)
							).as("appl_amt"),
							bracket(
								S1_T2.trd_cur_amt1.add(S1_T2.trd_cur_amt2)
							).subtract(
								nvl(
									sum(S1_T4.appl_amt),
									value(0)
								)
							).as("not_appl_bal"),
							S1_T1.ar_sttl_cd1,
							S1_T1.rcv_no,
							S1_T1.note_no,
							S1_T1.bank_ac_cd,
							S1_T2.trd_cur_amt1,
							S1_T1.ar_sttl_cd2,
							S1_T2.trd_cur_amt2,
							S1_T1.rcv_auto_appl_flg,
							S1_T1.trd_rmrks,
							S1_T2.bill_d_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T2.disp_seq,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							S1_T1.upd_cntr,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.rcv_act_no.eq(S1_T2.rcv_act_no)
									.and(S1_T1.rcv_act_seq.eq(S1_T2.rcv_act_seq))
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T2.wrk_no.eq(S1_T3.wrk_no)
									.and(S1_T3.can_flg.eq(value(false)))
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T2.rcv_act_d_no.eq(S1_T4.rcv_act_d_no)
								)
							)
							.innerJoin(S1_M12).on(
								bracket(
									S1_T2.ar_dpt_cd.eq(S1_M12.dpt_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.cutoff$and(S1_T1.rcv_dt.gte(bind("rcv_dt_fr")))
							.cutoff$and(S1_T1.rcv_dt.lte(bind("rcv_dt_to")))
							.cutoff$and(S1_T1.ac_dt.gte(bind("ac_dt_fr")))
							.cutoff$and(S1_T1.ac_dt.lte(bind("ac_dt_to")))
							.cutoff$and(S1_T2.acst_cd.like(bind("acst_cd")))
							.cutoff$and(S1_T1.rcst_cd.like(bind("rcst_cd")))
							.cutoff$and(S1_T2.bcst_cd.like(bind("bcst_cd")))
							.cutoff$and(S1_T2.ar_dpt_cd.like(bind("ar_dpt_cd")))
							.cutoff$and(S1_T2.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T1.trd_rmrks.like(bind("trd_rmrks")))
							.cutoff$and(S1_T1.rcv_act_no.like(bind("rcv_act_no")))
							.cutoff$and(S1_T2.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T1.trd_cd.like(bind("trd_cd")))
							.cutoff$and(S1_T1.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T2.bill_dpt_cd.like(bind("bill_dpt_cd")))
							.cutoff$and(S1_T2.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
							.cutoff$and(S1_T2.ar_typ.like(bind("ar_typ")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.and(
								bracket(
									bind("appl_cmpl_flg").eq(value(true))
								)
								.or(
									bind("appl_cmpl_flg").eq(value(false))
									.and(S1_T2.appl_cmpl_flg.eq(value(false)))
								)
							)
							.and(
								S1_T1.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.RCV_AR.value()),
									value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value()),
									value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value()),
									value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())
								)
							)
						)
						.groupBy(
							S1_T1.trd_cd,
							S1_T1.rcv_act_no,
							S1_T2.rcv_act_d_no,
							S1_T1.ac_ym,
							S1_T1.ac_dt,
							S1_T1.rcv_dt,
							S1_T1.rcst_cd,
							S1_T2.bcst_cd,
							S1_T2.bill_dpt_cd,
							S1_T2.ar_dpt_cd,
							S1_T2.wg_cd,
							S1_T2.acst_cd,
							S1_T2.iv_no,
							S1_T1.trd_cur_cd,
							S1_T2.wrk_no,
							S1_T3.wrk_nm,
							S1_T2.ar_typ,
							S1_T1.ar_sttl_cd1,
							S1_T1.rcv_no,
							S1_T1.note_no,
							S1_T1.bank_ac_cd,
							S1_T2.trd_cur_amt1,
							S1_T1.ar_sttl_cd2,
							S1_T2.trd_cur_amt2,
							S1_T1.rcv_auto_appl_flg,
							S1_T1.trd_rmrks,
							S1_T2.bill_d_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T2.disp_seq,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_ts,
							S1_T1.ins_func_id,
							S1_T1.upd_cntr,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_ts,
							S1_T1.upd_func_id,
							S1_T1.upd_srv_req_no
						).view(S0_V1)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_V1.pr(S1_T2.bill_dpt_cd).eq(S0_M4.dpt_cd)
								.and(S0_V1.pr(S1_T1.ac_dt).between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_V1.pr(S1_T2.ar_dpt_cd).eq(S0_M5.dpt_cd)
								.and(S0_V1.pr(S1_T1.ac_dt).between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ACST_GRP)
						.addDynamicView(DS0C_RCST_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate()
						.cutoff$and(S0_M5.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("bill_dpt_nm")))
						.addDynamicPredicate(DS0C_ACST_GRP)
						.addDynamicPredicate(DS0C_RCST_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						S0_V1.pr(S1_T1.ac_dt).asc(),
						S0_V1.pr(S1_T1.rcv_act_no).asc(),
						S0_V1.pr(S1_T2.rcv_act_d_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_V1.pr(S1_T1.trd_cd).eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("rcst_grp_flg1", "rcst_grp_flg2", "rcst_grp_flg3", "rcst_grp_flg4", "rcst_grp_flg5", "rcst_grp_flg6", "rcst_grp_flg7", "rcst_grp_flg8", "rcst_grp_flg9", "rcst_grp_flg10", "rcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_V1.pr(S1_T1.rcst_cd).eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.bp_nm.like(bind("rcst_nm")))),
				when(boundOr("bcst_grp_flg1", "bcst_grp_flg2", "bcst_grp_flg3", "bcst_grp_flg4", "bcst_grp_flg5", "bcst_grp_flg6", "bcst_grp_flg7", "bcst_grp_flg8", "bcst_grp_flg9", "bcst_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_V1.pr(S1_T2.bcst_cd).eq(S0_M3.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_V1.pr(S1_T2.wg_cd).eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("wg_nm")))),
				when(boundOr("acst_grp_flg1", "acst_grp_flg2", "acst_grp_flg3", "acst_grp_flg4", "acst_grp_flg5", "acst_grp_flg6", "acst_grp_flg7", "acst_grp_flg8", "acst_grp_flg9", "acst_grp_flg10", "acst_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_V1.pr(S1_T2.acst_cd).eq(S0_M7.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.bp_nm.like(bind("acst_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_V1.pr(S1_T1.trd_cur_cd).eq(S0_M8.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd1.as("acst_grp_cd1"), S0_MM11.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M7.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd2.as("acst_grp_cd2"), S0_MM12.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M7.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd3.as("acst_grp_cd3"), S0_MM13.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M7.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd4.as("acst_grp_cd4"), S0_MM14.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M7.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd5.as("acst_grp_cd5"), S0_MM15.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M7.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd6.as("acst_grp_cd6"), S0_MM16.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M7.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd7.as("acst_grp_cd7"), S0_MM17.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M7.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd8.as("acst_grp_cd8"), S0_MM18.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M7.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd9.as("acst_grp_cd9"), S0_MM19.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M7.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_M7.bp_grp_cd10.as("acst_grp_cd10"), S0_MM110.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M7.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_M7.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("acst_grp_nm10")))),
				when(boundOr("rcst_grp_flg1"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd1.as("rcst_grp_cd1"), S0_MM21.bp_grp_nm.as("rcst_grp_nm1"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M2.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("rcst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("rcst_grp_nm1")))),
				when(boundOr("rcst_grp_flg2"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd2.as("rcst_grp_cd2"), S0_MM22.bp_grp_nm.as("rcst_grp_nm2"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M2.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("rcst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("rcst_grp_nm2")))),
				when(boundOr("rcst_grp_flg3"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd3.as("rcst_grp_cd3"), S0_MM23.bp_grp_nm.as("rcst_grp_nm3"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M2.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("rcst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("rcst_grp_nm3")))),
				when(boundOr("rcst_grp_flg4"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd4.as("rcst_grp_cd4"), S0_MM24.bp_grp_nm.as("rcst_grp_nm4"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M2.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("rcst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("rcst_grp_nm4")))),
				when(boundOr("rcst_grp_flg5"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd5.as("rcst_grp_cd5"), S0_MM25.bp_grp_nm.as("rcst_grp_nm5"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M2.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("rcst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("rcst_grp_nm5")))),
				when(boundOr("rcst_grp_flg6"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd6.as("rcst_grp_cd6"), S0_MM26.bp_grp_nm.as("rcst_grp_nm6"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M2.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("rcst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("rcst_grp_nm6")))),
				when(boundOr("rcst_grp_flg7"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd7.as("rcst_grp_cd7"), S0_MM27.bp_grp_nm.as("rcst_grp_nm7"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M2.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("rcst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("rcst_grp_nm7")))),
				when(boundOr("rcst_grp_flg8"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd8.as("rcst_grp_cd8"), S0_MM28.bp_grp_nm.as("rcst_grp_nm8"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M2.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("rcst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("rcst_grp_nm8")))),
				when(boundOr("rcst_grp_flg9"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd9.as("rcst_grp_cd9"), S0_MM29.bp_grp_nm.as("rcst_grp_nm9"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M2.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("rcst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("rcst_grp_nm9")))),
				when(boundOr("rcst_grp_flg10"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd10.as("rcst_grp_cd10"), S0_MM210.bp_grp_nm.as("rcst_grp_nm10"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M2.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("rcst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("rcst_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd1.as("bcst_grp_cd1"), S0_MM31.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M3.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd2.as("bcst_grp_cd2"), S0_MM32.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M3.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd3.as("bcst_grp_cd3"), S0_MM33.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M3.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd4.as("bcst_grp_cd4"), S0_MM34.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M3.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd5.as("bcst_grp_cd5"), S0_MM35.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M3.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd6.as("bcst_grp_cd6"), S0_MM36.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M3.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd7.as("bcst_grp_cd7"), S0_MM37.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M3.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd8.as("bcst_grp_cd8"), S0_MM38.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M3.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd9.as("bcst_grp_cd9"), S0_MM39.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M3.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd10.as("bcst_grp_cd10"), S0_MM310.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M3.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("bcst_grp_nm10"))))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd1")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm1", m.sttl_nm());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm,
							m.bank_ac_no
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd2")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm2", m.sttl_nm());
					})
				)
			);
	}
}