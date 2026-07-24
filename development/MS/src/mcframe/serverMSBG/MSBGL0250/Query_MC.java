package mcframe.serverMSBG.MSBGL0250;

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
	 * -- MSBGL0250_MST_RCV_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL0250_MST_RCV_ACT_S01() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MST_RCV_ACT_D_R S0_T3 = MST_RCV_ACT_D_R.create("T3");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_USR_R S0_M10 = MAM_USR_R.create("M10");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAVM_RD_DPT_R S0_M14 = MAVM_RD_DPT_R.create("M14");
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
		MST_RCV_ACT_R S1_RCV1 = MST_RCV_ACT_R.create("RCV1");
		
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		MCDynamicSQLID DS0C_RCST_GRP = createDynamicSQLID("DS0C_RCST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0250_MST_RCV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slip_sts_typ,
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.trd_cd,
						S0_T1.rcv_dt,
						S0_T1.ac_ym,
						S0_T1.ac_dt,
						S0_T1.trd_ptn_typ,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M4.dpt_nm.as("bill_dpt_nm"),
						S0_T1.ar_sttl_cd1,
						S0_T1.rcv_no,
						S0_T1.note_no,
						S0_T1.bank_ac_cd,
						S0_T1.ar_sttl_cd2,
						S0_T1.trd_cur_cd,
						bracket(
							cases()
								.when(
									S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
									.then(value(0))
								.otherwise(S0_T1.subttl1)
						).as("subttl1"),
						bracket(
							cases()
								.when(
									S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
									.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
									.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
								)
									.then(S0_T1.subttl1)
								.otherwise(S0_T1.subttl2)
						).as("subttl2"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
							S0_T1.tax_amt,
							value(0)
						).as("tax_diff_amt"),
						decode(
							S0_T1.trd_ptn_typ,
							value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
							value(0),
							S0_T1.tax_amt
						).as("tax_amt"),
						S0_T1.base_cur_cd,
						bracket(
								cases()
									.when(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
										.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
										.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
									)
										.then(value(0))
									.otherwise(S0_T1.base_cur_subttl1)
							).as("base_cur_subttl1"),
							bracket(
								cases()
									.when(
										S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value()))
										.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())))
										.or(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())))
									)
										.then(S0_T1.base_cur_subttl1)
									.otherwise(S0_T1.base_cur_subttl2)
							).as("base_cur_subttl2"),
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
								S0_T1.base_cur_tax_amt,
								value(0)
							).as("base_cur_tax_diff_amt"),
							decode(
								S0_T1.trd_ptn_typ,
								value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value()),
								value(0),
								S0_T1.base_cur_tax_amt
							).as("base_cur_tax_amt"),
						S0_T2.pr("rcv_act_no").as("sw_to_rcv_act_no"),
						S0_T2.pr("trd_cd").as("sw_to_trd_cd"),
						S0_T2.pr("bcst_cd").as("sw_to_bcst_cd"),
						S0_T1.usr_cd,
						S0_T1.dpt_cd,
						S0_M11.dpt_nm,
						S0_T1.wg_cd,
						S0_T1.prnt_flg,
						S0_T1.rcv_auto_appl_flg,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
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
						addDynamicSelect(DS0C_RCST_GRP),
						addDynamicSelect(DS0C_BCST_GRP),
						S0_T3.gen_rcv_no
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(S1_RCV1.prAll())
							.from(S1_RCV1)
							.where(
								S1_RCV1.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()),
									value(MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.value())
								)
							).view(S0_T2)
						).on(
							bracket(
								S0_T1.par_rcv_act_no.eq(S0_T2.pr("rcv_act_no"))
								.and(S0_T1.par_rcv_act_seq.eq(S0_T2.pr("rcv_act_seq")))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T3.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T3.rcv_act_seq))
								.and(S0_T3.gen_rcv_no.isNotNull())
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.innerJoin(S0_M14).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M14.dpt_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_RCST_GRP)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								bind("ar_appl_flg").eq(value(true))
								.and(
									S0_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.RCV_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())
									)
								)
							)
							.or(
								bind("susp_adv_flg").eq(value(true))
								.and(
									S0_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.RCV_SUSP.value()),
										value(MAC_TRD_PTN_TYP.RCV_ADV.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.value())
									)
								)
							)
							.or(
								bind("sw_flg").eq(value(true))
								.and(
									S0_T1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value()),
										value(MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.value())
									)
								)
							)
							.or(
								bind("tax_diff_flg").eq(value(true))
								.and(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())))
							)
						)
						.and(
							bracket(
								bind("prnt_flg").eq(value(true))
								.and(S0_T1.prnt_flg.eq(value(true)))
							)
							.or(
								bind("not_prnt_flg").eq(value(true))
								.and(S0_T1.prnt_flg.eq(value(false)))
							)
						)
						.and(
							S0_T1.slip_sts_typ.eq(decode(
									bind("can_flg"),
									value(true),
									S0_T1.slip_sts_typ,
									value(MAC_SLIP_STS_TYP.CRT.value())
								)
							)
						)
						.cutoff$and(S0_T1.rcv_dt.gte(bind("rcv_dt_fr")))
						.cutoff$and(S0_T1.rcv_dt.lte(bind("rcv_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.rcst_cd.like(bind("rcst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_T2.pr("bcst_cd").like(bind("sw_to_bcst_cd")))
						.cutoff$and(S0_T1.usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M11.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.rcv_act_no.like(bind("rcv_act_no")))
						.cutoff$and(S0_T1.rcv_no.like(bind("rcv_no")))
						.cutoff$and(S0_T1.note_no.like(bind("note_no")))
						.cutoff$and(S0_T2.pr("rcv_act_no").like(bind("sw_to_rcv_act_no")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_T1.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.rcv_auto_appl_flg.eq(bind("rcv_auto_appl_flg_true")))
						.and(
							S0_T1.trd_ptn_typ.notIn(
								value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()),
								value(MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.value())
							)
						)
						.addDynamicPredicate(DS0C_RCST_GRP)
						.addDynamicPredicate(DS0C_BCST_GRP)
						.cutoff$and(S0_T3.gen_rcv_no.like(bind("gen_rcv_no")))
					)
					.orderBy(
						S0_T1.rcv_act_no.asc(),
						S0_T1.rcv_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("rcst_grp_flg1", "rcst_grp_flg2", "rcst_grp_flg3", "rcst_grp_flg4", "rcst_grp_flg5", "rcst_grp_flg6", "rcst_grp_flg7", "rcst_grp_flg8", "rcst_grp_flg9", "rcst_grp_flg10", "rcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.rcst_cd.eq(S0_M2.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.bp_nm.like(bind("rcst_nm")))),
				when(boundOr("bcst_grp_flg1", "bcst_grp_flg2", "bcst_grp_flg3", "bcst_grp_flg4", "bcst_grp_flg5", "bcst_grp_flg6", "bcst_grp_flg7", "bcst_grp_flg8", "bcst_grp_flg9", "bcst_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.bcst_cd.eq(S0_M3.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.trd_cur_cd.eq(S0_M7.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("cur_nm")))),
				when(boundOr("sw_to_bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T2.pr("bcst_cd").eq(S0_M9.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("sw_to_bcst_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.usr_cd.eq(S0_M10.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.usr_nm.like(bind("usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.wg_cd.eq(S0_M12.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.wg_nm.like(bind("wg_nm")))),
				when(boundOr("rcst_grp_flg1"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd1.as("rcst_grp_cd1"), S0_MM11.bp_grp_nm.as("rcst_grp_nm1"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M2.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("rcst_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("rcst_grp_nm1")))),
				when(boundOr("rcst_grp_flg2"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd2.as("rcst_grp_cd2"), S0_MM12.bp_grp_nm.as("rcst_grp_nm2"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M2.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("rcst_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("rcst_grp_nm2")))),
				when(boundOr("rcst_grp_flg3"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd3.as("rcst_grp_cd3"), S0_MM13.bp_grp_nm.as("rcst_grp_nm3"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M2.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("rcst_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("rcst_grp_nm3")))),
				when(boundOr("rcst_grp_flg4"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd4.as("rcst_grp_cd4"), S0_MM14.bp_grp_nm.as("rcst_grp_nm4"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M2.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("rcst_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("rcst_grp_nm4")))),
				when(boundOr("rcst_grp_flg5"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd5.as("rcst_grp_cd5"), S0_MM15.bp_grp_nm.as("rcst_grp_nm5"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M2.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("rcst_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("rcst_grp_nm5")))),
				when(boundOr("rcst_grp_flg6"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd6.as("rcst_grp_cd6"), S0_MM16.bp_grp_nm.as("rcst_grp_nm6"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M2.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("rcst_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("rcst_grp_nm6")))),
				when(boundOr("rcst_grp_flg7"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd7.as("rcst_grp_cd7"), S0_MM17.bp_grp_nm.as("rcst_grp_nm7"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M2.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("rcst_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("rcst_grp_nm7")))),
				when(boundOr("rcst_grp_flg8"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd8.as("rcst_grp_cd8"), S0_MM18.bp_grp_nm.as("rcst_grp_nm8"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M2.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("rcst_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("rcst_grp_nm8")))),
				when(boundOr("rcst_grp_flg9"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd9.as("rcst_grp_cd9"), S0_MM19.bp_grp_nm.as("rcst_grp_nm9"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M2.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("rcst_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("rcst_grp_nm9")))),
				when(boundOr("rcst_grp_flg10"))
					.select(DS0C_RCST_GRP, S0_M2.bp_grp_cd10.as("rcst_grp_cd10"), S0_MM110.bp_grp_nm.as("rcst_grp_nm10"))
					.view(DS0C_RCST_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M2.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_RCST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("rcst_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("rcst_grp_nm10")))),
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd1.as("bcst_grp_cd1"), S0_MM21.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M3.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd2.as("bcst_grp_cd2"), S0_MM22.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M3.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd3.as("bcst_grp_cd3"), S0_MM23.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M3.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd4.as("bcst_grp_cd4"), S0_MM24.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M3.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd5.as("bcst_grp_cd5"), S0_MM25.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M3.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd6.as("bcst_grp_cd6"), S0_MM26.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M3.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd7.as("bcst_grp_cd7"), S0_MM27.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M3.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd8.as("bcst_grp_cd8"), S0_MM28.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M3.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd9.as("bcst_grp_cd9"), S0_MM29.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M3.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_M3.bp_grp_cd10.as("bcst_grp_cd10"), S0_MM210.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M3.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("bcst_grp_nm10"))))
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("sw_to_trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sw_to_trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sw_to_bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sw_to_bcst_nm", m.bp_nm());
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
}