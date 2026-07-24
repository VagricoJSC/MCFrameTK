package mcframe.serverMSBG.MSBGL0110;

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
	 * -- MSBGL0110_MST_MLY_AR_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL0110_MST_MLY_AR_BAL_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_DPT_R S0_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S0_MA2 = MAM_WG_R.create("MA2");
		MAM_BP_R S0_MA3 = MAM_BP_R.create("MA3");
		MAM_CUR_R S0_MA4 = MAM_CUR_R.create("MA4");
		MST_WRK_R S0_TA1 = MST_WRK_R.create("TA1");
		MCTempView S0_VA2 = createTempView("VA2");
		MAVM_RD_DPT_R S0_VA3 = MAVM_RD_DPT_R.create("VA3");
		MAM_BP_GRP_R S0_MM1 = MAM_BP_GRP_R.create("MM1");
		MAM_BP_GRP_R S0_MM2 = MAM_BP_GRP_R.create("MM2");
		MAM_BP_GRP_R S0_MM3 = MAM_BP_GRP_R.create("MM3");
		MAM_BP_GRP_R S0_MM4 = MAM_BP_GRP_R.create("MM4");
		MAM_BP_GRP_R S0_MM5 = MAM_BP_GRP_R.create("MM5");
		MAM_BP_GRP_R S0_MM6 = MAM_BP_GRP_R.create("MM6");
		MAM_BP_GRP_R S0_MM7 = MAM_BP_GRP_R.create("MM7");
		MAM_BP_GRP_R S0_MM8 = MAM_BP_GRP_R.create("MM8");
		MAM_BP_GRP_R S0_MM9 = MAM_BP_GRP_R.create("MM9");
		MAM_BP_GRP_R S0_MM10 = MAM_BP_GRP_R.create("MM10");
		MCTempView S1_T1 = createTempView("T1");
		MST_MLY_AR_BAL_R S1_T2 = MST_MLY_AR_BAL_R.create("T2");
		MST_MLY_AR_BAL_R S2_TB1 = MST_MLY_AR_BAL_R.create("TB1");
		MST_RCV_ACT_R S3_TC1 = MST_RCV_ACT_R.create("TC1");
		MST_RCV_ACT_D_R S3_TC2 = MST_RCV_ACT_D_R.create("TC2");
		MCTempView S3_VB1 = createTempView("VB1");
		MST_BILL_D_APPL_ACT_R S4_TD1 = MST_BILL_D_APPL_ACT_R.create("TD1");
		
		MCDynamicSQLID DS0C_ACST_GRP = createDynamicSQLID("DS0C_ACST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0110_MST_MLY_AR_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_T2.ar_dpt_cd),
						S0_MA1.dpt_nm.as("ar_dpt_nm"),
						S0_MA1.wg_cd,
						S0_MA2.wg_nm,
						S0_VA1.pr(S1_T2.acst_cd),
						S0_MA3.bp_nm.as("acst_nm"),
						S0_MA3.bcst_cd,
						S0_VA1.pr(S1_T2.iv_no),
						MSPA_AR_UTIL$F_GET_MAX_CL_DAY(S0_MA3.bcst_cd).as("bill_cl_day"),
						MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP(
							S0_MA3.bcst_cd,
							S0_VA1.pr(S1_T2.trd_cur_cd),
							MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
								S0_VA1.pr(S1_T2.acst_cd),
								S0_VA1.pr(S1_T2.iv_no),
								S0_VA1.pr(S1_T2.trd_cur_cd),
								S0_VA1.pr(S1_T2.wrk_no),
								S0_VA1.pr(S1_T2.ar_dpt_cd),
								S0_VA1.pr(S1_T2.ar_typ),
								bind("ar_cl_ym"),
								value(0),
								value(true)
							),
							S0_MA1.wg_cd
						).as("crryovr_mons_typ"),
						MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS(
							S0_MA3.bcst_cd,
							S0_VA1.pr(S1_T2.trd_cur_cd),
							MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
								S0_VA1.pr(S1_T2.acst_cd),
								S0_VA1.pr(S1_T2.iv_no),
								S0_VA1.pr(S1_T2.trd_cur_cd),
								S0_VA1.pr(S1_T2.wrk_no),
								S0_VA1.pr(S1_T2.ar_dpt_cd),
								S0_VA1.pr(S1_T2.ar_typ),
								bind("ar_cl_ym"),
								value(0),
								value(true)
							),
							S0_MA1.wg_cd
						).as("rcv_crryovr_mons"),
						MSPA_AR_UTIL$F_GET_MAX_RCV_DAY(
							S0_MA3.bcst_cd,
							S0_VA1.pr(S1_T2.trd_cur_cd),
							MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
								S0_VA1.pr(S1_T2.acst_cd),
								S0_VA1.pr(S1_T2.iv_no),
								S0_VA1.pr(S1_T2.trd_cur_cd),
								S0_VA1.pr(S1_T2.wrk_no),
								S0_VA1.pr(S1_T2.ar_dpt_cd),
								S0_VA1.pr(S1_T2.ar_typ),
								bind("ar_cl_ym"),
								value(0),
								value(true)
							),
							S0_MA1.wg_cd
						).as("rcv_day"),
						S0_VA1.pr(S1_T2.trd_cur_cd),
						S0_MA4.cur_nm.as("trd_cur_nm"),
						S0_MA4.amt_dec_place,
						S0_VA1.pr(S1_T2.wrk_no),
						S0_TA1.wrk_nm,
						S0_VA1.pr(S1_T2.ar_typ),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(0),
							value(true)
						).as("end_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(0),
							value(false)
						).as("start_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(1),
							value(false)
						).as("one_ar_not_appl_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(2),
							value(false)
						).as("two_ar_not_appl_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(3),
							value(false)
						).as("three_ar_not_appl_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(4),
							value(false)
						).as("four_ar_not_appl_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(5),
							value(false)
						).as("five_ar_not_appl_bal"),
						MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
							S0_VA1.pr(S1_T2.acst_cd),
							S0_VA1.pr(S1_T2.iv_no),
							S0_VA1.pr(S1_T2.trd_cur_cd),
							S0_VA1.pr(S1_T2.wrk_no),
							S0_VA1.pr(S1_T2.ar_dpt_cd),
							S0_VA1.pr(S1_T2.ar_typ),
							bind("ar_cl_ym"),
							value(6),
							value(true)
						).as("six_ar_not_appl_bal"),
						nvl(
							bracket(
								S0_VA2.pr("trd_cur_amt").subtract(S0_VA2.pr("appl_amt"))
							),
							value(0)
						).as("ar_slip_not_appl_bal"),
						S0_VA1.pr(S1_T2.ins_usr_id),
						S0_VA1.pr(S1_T2.ins_usr_nm),
						S0_VA1.pr(S1_T2.ins_ts),
						S0_VA1.pr(S1_T2.ins_func_id),
						S0_VA1.pr(S1_T2.upd_usr_id),
						S0_VA1.pr(S1_T2.upd_usr_nm),
						S0_VA1.pr(S1_T2.upd_ts),
						S0_VA1.pr(S1_T2.upd_func_id),
						S0_VA1.pr(S1_T2.upd_srv_req_no),
						addDynamicSelect(DS0C_ACST_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_T2.acst_cd,
							S1_T2.iv_no,
							S1_T2.trd_cur_cd,
							S1_T2.ar_dpt_cd,
							S1_T2.wrk_no,
							S1_T2.ar_typ,
							S1_T2.ac_ym,
							S1_T2.ins_usr_id,
							S1_T2.ins_usr_nm,
							S1_T2.ins_ts,
							S1_T2.ins_func_id,
							S1_T2.upd_usr_id,
							S1_T2.upd_usr_nm,
							S1_T2.upd_ts,
							S1_T2.upd_func_id,
							S1_T2.upd_srv_req_no
						)
						.from(
							subQuery()
							.select(
								S2_TB1.acst_cd,
								S2_TB1.iv_no,
								S2_TB1.trd_cur_cd,
								S2_TB1.ar_dpt_cd,
								S2_TB1.wrk_no,
								S2_TB1.ar_typ,
								max(S2_TB1.ac_ym).as("ac_ym")
							)
							.from(S2_TB1)
							.groupBy(
								S2_TB1.acst_cd,
								S2_TB1.iv_no,
								S2_TB1.trd_cur_cd,
								S2_TB1.ar_dpt_cd,
								S2_TB1.wrk_no,
								S2_TB1.ar_typ
							).view(S1_T1)
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T1.pr(S2_TB1.trd_cur_cd).eq(S1_T2.trd_cur_cd)
									.and(S1_T1.pr(S2_TB1.acst_cd).eq(S1_T2.acst_cd))
									.and(S1_T1.pr(S2_TB1.iv_no).eq(S1_T2.iv_no))
									.and(S1_T1.pr(S2_TB1.ar_dpt_cd).eq(S1_T2.ar_dpt_cd))
									.and(
										S1_T1.pr(S2_TB1.wrk_no).eq(S1_T2.wrk_no)
										.or(
											S1_T1.pr(S2_TB1.wrk_no).isNull()
											.and(S1_T2.wrk_no.isNull())
										)
									)
									.and(S1_T1.pr(S2_TB1.ar_typ).eq(S1_T2.ar_typ))
									.and(S1_T1.pr("ac_ym").eq(S1_T2.ac_ym))
								)
							)
						).view(S0_VA1)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_VA1.pr(S1_T2.ar_dpt_cd).eq(S0_MA1.dpt_cd)
								.and(S0_VA1.pr(S1_T2.ac_ym).between(S0_MA1.st_dt, S0_MA1.end_dt))
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA1.wg_cd.eq(S0_MA2.wg_cd)
							)
						)
						.leftOuterJoin(S0_MA3).on(
							bracket(
								S0_VA1.pr(S1_T2.acst_cd).eq(S0_MA3.bp_cd)
							)
						)
						.leftOuterJoin(S0_MA4).on(
							bracket(
								S0_VA1.pr(S1_T2.trd_cur_cd).eq(S0_MA4.cur_cd)
							)
						)
						.leftOuterJoin(S0_TA1).on(
							bracket(
								S0_VA1.pr(S1_T2.wrk_no).eq(S0_TA1.wrk_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								nvl(
									sum(S3_TC2.trd_cur_amt1.add(S3_TC2.trd_cur_amt2)),
									value(0)
								).as("trd_cur_amt"),
								nvl(
									sum(S3_VB1.pr("appl_amt")),
									value(0)
								).as("appl_amt"),
								S3_TC1.trd_cur_cd,
								S3_TC2.acst_cd,
								S3_TC2.iv_no,
								S3_TC2.ar_dpt_cd,
								S3_TC2.wrk_no,
								S3_TC2.ar_typ
							)
							.from(
								S3_TC1
								.innerJoin(S3_TC2).on(
									bracket(
										S3_TC1.rcv_act_no.eq(S3_TC2.rcv_act_no)
										.and(S3_TC1.rcv_act_seq.eq(S3_TC2.rcv_act_seq))
									)
								)
								.leftOuterJoin(
									subQuery()
									.select(
										S4_TD1.rcv_act_d_no,
										sum(S4_TD1.appl_amt).as("appl_amt")
									)
									.from(S4_TD1)
									.groupBy(S4_TD1.rcv_act_d_no).view(S3_VB1)
								).on(
									bracket(
										S3_TC2.rcv_act_d_no.eq(S3_VB1.pr(S4_TD1.rcv_act_d_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(
									S3_TC1.trd_ptn_typ.in(
										value(MAC_TRD_PTN_TYP.RCV_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_ADV_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value()),
										value(MAC_TRD_PTN_TYP.SETOFF_OTR_AR.value())
									)
								)
								.and(S3_TC1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.and(S3_TC2.appl_cmpl_flg.eq(value(false)))
							)
							.groupBy(
								S3_TC1.trd_cur_cd,
								S3_TC2.acst_cd,
								S3_TC2.iv_no,
								S3_TC2.ar_dpt_cd,
								S3_TC2.wrk_no,
								S3_TC2.ar_typ
							).view(S0_VA2)
						).on(
							bracket(
								S0_VA1.pr(S1_T2.trd_cur_cd).eq(S0_VA2.pr(S3_TC1.trd_cur_cd))
								.and(S0_VA1.pr(S1_T2.acst_cd).eq(S0_VA2.pr(S3_TC2.acst_cd)))
								.and(S0_VA1.pr(S1_T2.iv_no).eq(S0_VA2.pr(S3_TC2.iv_no)))
								.and(S0_VA1.pr(S1_T2.ar_dpt_cd).eq(S0_VA2.pr(S3_TC2.ar_dpt_cd)))
								.and(
									S0_VA1.pr(S1_T2.wrk_no).eq(S0_VA2.pr(S3_TC2.wrk_no))
									.or(
										S0_VA1.pr(S1_T2.wrk_no).isNull()
										.and(S0_VA2.pr(S3_TC2.wrk_no).isNull())
									)
								)
								.and(S0_VA1.pr(S1_T2.ar_typ).eq(S0_VA2.pr(S3_TC2.ar_typ)))
							)
						)
						.innerJoin(S0_VA3).on(
							bracket(
								S0_VA3.dpt_cd.eq(S0_VA1.pr(S1_T2.ar_dpt_cd))
							)
						)
						.addDynamicView(DS0C_ACST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_VA1.pr(S1_T2.ar_dpt_cd).like(bind("ar_dpt_cd")))
						.cutoff$and(S0_MA1.dpt_nm.like(bind("ar_dpt_nm")))
						.cutoff$and(S0_MA1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_VA1.pr(S1_T2.acst_cd).like(bind("acst_cd")))
						.cutoff$and(S0_MA3.bp_nm.like(bind("acst_nm")))
						.cutoff$and(S0_VA1.pr(S1_T2.iv_no).like(bind("iv_no")))
						.cutoff$and(S0_VA1.pr(S1_T2.wrk_no).like(bind("wrk_no")))
						.cutoff$and(S0_TA1.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_VA1.pr(S1_T2.trd_cur_cd).like(bind("trd_cur_cd")))
						.cutoff$and(S0_MA4.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_VA1.pr(S1_T2.ar_typ).like(bind("ar_typ")))
						.addDynamicPredicate(DS0C_ACST_GRP)
					)
					.orderBy(
						S0_VA1.pr(S1_T2.ar_dpt_cd).asc(),
						S0_VA1.pr(S1_T2.acst_cd).asc(),
						S0_VA1.pr(S1_T2.iv_no).asc(),
						S0_VA1.pr(S1_T2.trd_cur_cd).asc(),
						S0_VA1.pr(S1_T2.wrk_no).asc(),
						S0_VA1.pr(S1_T2.ar_typ).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("acst_grp_flg1"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd1.as("acst_grp_cd1"), S0_MM1.bp_grp_nm.as("acst_grp_nm1"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_MA3.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd1.like(bind("acst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("acst_grp_nm1")))),
				when(boundOr("acst_grp_flg2"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd2.as("acst_grp_cd2"), S0_MM2.bp_grp_nm.as("acst_grp_nm2"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_MA3.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd2.like(bind("acst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("acst_grp_nm2")))),
				when(boundOr("acst_grp_flg3"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd3.as("acst_grp_cd3"), S0_MM3.bp_grp_nm.as("acst_grp_nm3"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_MA3.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd3.like(bind("acst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("acst_grp_nm3")))),
				when(boundOr("acst_grp_flg4"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd4.as("acst_grp_cd4"), S0_MM4.bp_grp_nm.as("acst_grp_nm4"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_MA3.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd4.like(bind("acst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("acst_grp_nm4")))),
				when(boundOr("acst_grp_flg5"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd5.as("acst_grp_cd5"), S0_MM5.bp_grp_nm.as("acst_grp_nm5"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_MA3.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd5.like(bind("acst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("acst_grp_nm5")))),
				when(boundOr("acst_grp_flg6"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd6.as("acst_grp_cd6"), S0_MM6.bp_grp_nm.as("acst_grp_nm6"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_MA3.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd6.like(bind("acst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("acst_grp_nm6")))),
				when(boundOr("acst_grp_flg7"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd7.as("acst_grp_cd7"), S0_MM7.bp_grp_nm.as("acst_grp_nm7"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_MA3.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd7.like(bind("acst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("acst_grp_nm7")))),
				when(boundOr("acst_grp_flg8"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd8.as("acst_grp_cd8"), S0_MM8.bp_grp_nm.as("acst_grp_nm8"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_MA3.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd8.like(bind("acst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("acst_grp_nm8")))),
				when(boundOr("acst_grp_flg9"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd9.as("acst_grp_cd9"), S0_MM9.bp_grp_nm.as("acst_grp_nm9"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_MA3.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd9.like(bind("acst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("acst_grp_nm9")))),
				when(boundOr("acst_grp_flg10"))
					.select(DS0C_ACST_GRP, S0_MA3.bp_grp_cd10.as("acst_grp_cd10"), S0_MM10.bp_grp_nm.as("acst_grp_nm10"))
					.view(DS0C_ACST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_MA3.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_ACST_GRP, p -> p.cutoff$and(S0_MA3.bp_grp_cd10.like(bind("acst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("acst_grp_nm10"))))
			);
	}
}