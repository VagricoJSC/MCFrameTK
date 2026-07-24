package mcframe.serverMSBG.MSBGL0070;

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
	 * -- MSBGL0070_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL0070_MST_BILL_S01() {
		MCTempView S0_V2 = createTempView("V2");
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_STTL_R S0_M3 = MAM_STTL_R.create("M3");
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
		MCTempView S1_V1 = createTempView("V1");
		MST_BILL_R S2_TA1 = MST_BILL_R.create("TA1");
		MST_RCV_SCHD_R S2_TA2 = MST_RCV_SCHD_R.create("TA2");
		MST_WRK_R S2_TA3 = MST_WRK_R.create("TA3");
		MAM_DPT_R S2_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S2_MA2 = MAM_WG_R.create("MA2");
		MAM_STTL_R S2_MA3 = MAM_STTL_R.create("MA3");
		MAM_CUR_R S2_MA4 = MAM_CUR_R.create("MA4");
		MAVM_RD_DPT_R S2_MA5 = MAVM_RD_DPT_R.create("MA5");
		MST_BILL_R S3_TB1 = MST_BILL_R.create("TB1");
		MST_RCV_SCHD_APPL_ACT_R S3_TB2 = MST_RCV_SCHD_APPL_ACT_R.create("TB2");
		MST_WRK_R S3_TB3 = MST_WRK_R.create("TB3");
		MAM_DPT_R S3_MB1 = MAM_DPT_R.create("MB1");
		MAM_WG_R S3_MB2 = MAM_WG_R.create("MB2");
		MAM_STTL_R S3_MB3 = MAM_STTL_R.create("MB3");
		MAM_CUR_R S3_MB4 = MAM_CUR_R.create("MB4");
		MAVM_RD_DPT_R S3_MB5 = MAVM_RD_DPT_R.create("MB5");
		
		MCDynamicSQLID DS0C_BCST_GRP = createDynamicSQLID("DS0C_BCST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0070_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_V2.pr(S2_TA1.bill_dpt_cd),
						S0_V2.pr("bill_dpt_nm"),
						S0_V2.pr(S2_MA1.wg_cd),
						S0_V2.pr(S2_MA2.wg_nm),
						S0_V2.pr(S2_TA1.bcst_cd),
						S0_M1.bp_nm.as("bcst_nm"),
						S0_V2.pr("schd_act_rcv_dt"),
						S0_V2.pr(S2_TA2.rcv_mtd_cd),
						S0_V2.pr("rcv_mtd_nm"),
						S0_V2.pr(S2_TA2.rcv_typ),
						S0_M3.rcv_reg_typ,
						S0_V2.pr("rcv_schd_amt"),
						S0_V2.pr("rcv_act_amt"),
						S0_V2.pr(S2_TA1.not_appl_bal),
						S0_V2.pr("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_V2.pr("bill_ym"),
							nvl(
								S0_T1.bill_cl_typ,
								S0_M1.bill_cl_typ
							),
							S0_V2.pr(S2_TA1.bill_each_sls_flg)
						).as("bill_cl_day"),
						S0_V2.pr(S2_TA1.bill_dt),
						S0_V2.pr(S2_TA1.trd_cur_cd),
						S0_V2.pr("trd_cur_nm"),
						S0_V2.pr(S2_MA4.amt_dec_place),
						S0_V2.pr(S2_TA1.bill_no),
						S0_V2.pr(S2_TA1.iv_no),
						S0_V2.pr(S2_TA1.wrk_no),
						S0_V2.pr(S2_TA3.wrk_nm),
						S0_M1.rcst_cd,
						S0_M2.bp_nm.as("rcst_nm"),
						S0_V2.pr(S2_TA1.bill_mng_no),
						decode(
							S0_M1.bill_prnt_typ,
							value(MAC_BILL_PRNT_TYP.RCV_ADJ.value()),
							value(true),
							value(false)
						).as("rcv_schd_adjst_flg"),
						S0_V2.pr("adjst_flg"),
						addDynamicSelect(DS0C_BCST_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_V1.pr(S2_TA1.bill_dpt_cd),
							S1_V1.pr("bill_dpt_nm"),
							S1_V1.pr(S2_MA1.wg_cd),
							S1_V1.pr(S2_MA2.wg_nm),
							S1_V1.pr(S2_TA1.bcst_cd),
							S1_V1.pr("schd_act_rcv_dt"),
							S1_V1.pr(S2_TA2.rcv_mtd_cd),
							S1_V1.pr("rcv_mtd_nm"),
							S1_V1.pr(S2_TA2.rcv_typ),
							sum(
								nvl(
									S1_V1.pr(S2_TA2.rcv_schd_amt),
									value(0)
								)
							).as("rcv_schd_amt"),
							sum(
								nvl(
									S1_V1.pr("rcv_act_amt"),
									value(0)
								)
							).as("rcv_act_amt"),
							S1_V1.pr(S2_TA1.not_appl_bal),
							S1_V1.pr("bill_ym"),
							S1_V1.pr(S2_TA1.bill_each_sls_flg),
							S1_V1.pr(S2_TA1.bill_dt),
							S1_V1.pr(S2_TA1.trd_cur_cd),
							S1_V1.pr("trd_cur_nm"),
							S1_V1.pr(S2_MA4.amt_dec_place),
							S1_V1.pr(S2_TA1.bill_no),
							S1_V1.pr(S2_TA1.iv_no),
							S1_V1.pr(S2_TA1.wrk_no),
							S1_V1.pr(S2_TA3.wrk_nm),
							S1_V1.pr("adjst_flg"),
							S1_V1.pr(S2_TA1.bill_mng_no)
						)
						.from(
							subQuery()
							.select(
								S2_TA1.bill_dpt_cd,
								S2_MA1.dpt_nm.as("bill_dpt_nm"),
								S2_MA1.wg_cd,
								S2_MA2.wg_nm,
								S2_TA1.bcst_cd,
								S2_TA2.rcv_schd_dt.as("schd_act_rcv_dt"),
								S2_TA2.rcv_mtd_cd,
								S2_MA3.sttl_nm.as("rcv_mtd_nm"),
								S2_TA2.rcv_typ,
								S2_TA2.rcv_schd_amt,
								value(0).as("rcv_act_amt"),
								S2_TA1.not_appl_bal,
								S2_TA1.bill_cl_dt.as("bill_ym"),
								S2_TA1.bill_each_sls_flg,
								S2_TA1.bill_dt,
								S2_TA1.trd_cur_cd,
								S2_MA4.cur_nm.as("trd_cur_nm"),
								S2_MA4.amt_dec_place,
								S2_TA1.bill_no,
								S2_TA1.iv_no,
								S2_TA1.wrk_no,
								S2_TA3.wrk_nm,
								S2_TA1.rcv_schd_adjst_flg.as("adjst_flg"),
								S2_TA1.bill_mng_no
							)
							.from(
								S2_TA1
								.innerJoin(S2_TA2).on(
									bracket(
										S2_TA1.bill_mng_no.eq(S2_TA2.bill_mng_no)
									)
								)
								.leftOuterJoin(S2_TA3).on(
									bracket(
										S2_TA1.wrk_no.eq(S2_TA3.wrk_no)
									)
								)
								.leftOuterJoin(S2_MA1).on(
									bracket(
										S2_TA1.bill_dpt_cd.eq(S2_MA1.dpt_cd)
										.and(S2_TA1.base_dt.between(S2_MA1.st_dt, S2_MA1.end_dt))
									)
								)
								.leftOuterJoin(S2_MA2).on(
									bracket(
										S2_MA1.wg_cd.eq(S2_MA2.wg_cd)
									)
								)
								.leftOuterJoin(S2_MA3).on(
									bracket(
										S2_TA2.rcv_mtd_cd.eq(S2_MA3.sttl_cd)
									)
								)
								.leftOuterJoin(S2_MA4).on(
									bracket(
										S2_TA1.trd_cur_cd.eq(S2_MA4.cur_cd)
									)
								)
								.innerJoin(S2_MA5).on(
									bracket(
										S2_TA1.bill_dpt_cd.eq(S2_MA5.dpt_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_TA2.rcv_schd_dt.gte(bind("schd_act_rcv_dt_fr")))
								.cutoff$and(S2_TA2.rcv_schd_dt.lte(bind("schd_act_rcv_dt_to")))
								.cutoff$and(S2_TA1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S2_TA1.bill_dpt_cd.like(bind("bill_dpt_cd")))
								.cutoff$and(S2_MA1.dpt_nm.like(bind("bill_dpt_nm")))
								.cutoff$and(S2_MA1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_MA2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MA4.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TA1.bill_no.like(bind("bill_no")))
								.cutoff$and(S2_TA1.iv_no.like(bind("iv_no")))
								.cutoff$and(S2_TA1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TA3.wrk_nm.like(bind("wrk_nm")))
								.and(
									bracket(
										bind("inc_appl_flg").eq(value(false))
										.and(S2_TA1.not_appl_bal.neq(value(0)))
									)
									.or(bind("inc_appl_flg").eq(value(true)))
								)
								.and(
									bracket(
										bind("inc_not_cl_flg").eq(value(false))
										.and(
											S2_TA1.bill_cl_sts_typ.in(
												value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()),
												value(MSC_BILL_CL_STS_TYP.CL_BATCH.value()),
												value(MSC_BILL_CL_STS_TYP.EACH_SLS.value())
											)
										)
									)
									.or(bind("inc_not_cl_flg").eq(value(true)))
								)
							)
							.unionAll(
								subQuery()
								.select(
									S3_TB1.bill_dpt_cd,
									S3_MB1.dpt_nm.as("bill_dpt_nm"),
									S3_MB1.wg_cd,
									S3_MB2.wg_nm,
									S3_TB1.bcst_cd,
									S3_TB2.rcv_act_dt.as("schd_act_rcv_dt"),
									S3_TB2.rcv_mtd_cd,
									S3_MB3.sttl_nm.as("rcv_mtd_nm"),
									S3_TB2.rcv_typ,
									value(0).as("rcv_schd_amt"),
									S3_TB2.rcv_act_amt,
									S3_TB1.not_appl_bal,
									S3_TB1.bill_cl_dt.as("bill_ym"),
									S3_TB1.bill_each_sls_flg,
									S3_TB1.bill_dt,
									S3_TB1.trd_cur_cd,
									S3_MB4.cur_nm.as("trd_cur_nm"),
									S3_MB4.amt_dec_place,
									S3_TB1.bill_no,
									S3_TB1.iv_no,
									S3_TB1.wrk_no,
									S3_TB3.wrk_nm,
									S3_TB1.rcv_schd_adjst_flg.as("adjst_flg"),
									S3_TB1.bill_mng_no
								)
								.from(
									S3_TB1
									.innerJoin(S3_TB2).on(
										bracket(
											S3_TB1.bill_mng_no.eq(S3_TB2.bill_mng_no)
											.and(S3_TB2.rcv_act_amt.neq(value(0)))
										)
									)
									.leftOuterJoin(S3_TB3).on(
										bracket(
											S3_TB1.wrk_no.eq(S3_TB3.wrk_no)
										)
									)
									.leftOuterJoin(S3_MB1).on(
										bracket(
											S3_TB1.bill_dpt_cd.eq(S3_MB1.dpt_cd)
											.and(S3_TB1.base_dt.between(S3_MB1.st_dt, S3_MB1.end_dt))
										)
									)
									.leftOuterJoin(S3_MB2).on(
										bracket(
											S3_MB1.wg_cd.eq(S3_MB2.wg_cd)
										)
									)
									.leftOuterJoin(S3_MB3).on(
										bracket(
											S3_TB2.rcv_mtd_cd.eq(S3_MB3.sttl_cd)
										)
									)
									.leftOuterJoin(S3_MB4).on(
										bracket(
											S3_TB1.trd_cur_cd.eq(S3_MB4.cur_cd)
										)
									)
									.innerJoin(S3_MB5).on(
										bracket(
											S3_TB1.bill_dpt_cd.eq(S3_MB5.dpt_cd)
										)
									)
								)
								.where(
									value(0).eq(value(0))
									.cutoff$and(S3_TB2.rcv_act_dt.gte(bind("schd_act_rcv_dt_fr")))
									.cutoff$and(S3_TB2.rcv_act_dt.lte(bind("schd_act_rcv_dt_to")))
									.cutoff$and(S3_TB1.bcst_cd.like(bind("bcst_cd")))
									.cutoff$and(S3_TB1.bill_dpt_cd.like(bind("bill_dpt_cd")))
									.cutoff$and(S3_MB1.dpt_nm.like(bind("bill_dpt_nm")))
									.cutoff$and(S3_MB1.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S3_MB2.wg_nm.like(bind("wg_nm")))
									.cutoff$and(S3_TB1.trd_cur_cd.like(bind("trd_cur_cd")))
									.cutoff$and(S3_MB4.cur_nm.like(bind("trd_cur_nm")))
									.cutoff$and(S3_TB1.bill_no.like(bind("bill_no")))
									.cutoff$and(S3_TB1.iv_no.like(bind("iv_no")))
									.cutoff$and(S3_TB1.wrk_no.like(bind("wrk_no")))
									.cutoff$and(S3_TB3.wrk_nm.like(bind("wrk_nm")))
									.and(
										bracket(
											bind("inc_appl_flg").eq(value(false))
											.and(S3_TB1.not_appl_bal.neq(value(0)))
										)
										.or(bind("inc_appl_flg").eq(value(true)))
									)
									.and(
										bracket(
											bind("inc_not_cl_flg").eq(value(false))
											.and(
												S3_TB1.bill_cl_sts_typ.in(
													value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()),
													value(MSC_BILL_CL_STS_TYP.CL_BATCH.value()),
													value(MSC_BILL_CL_STS_TYP.EACH_SLS.value())
												)
											)
										)
										.or(bind("inc_not_cl_flg").eq(value(true)))
									)
								)
							).view(S1_V1)
						)
						.where(
							value(0).eq(value(0))
						)
						.groupBy(
							S1_V1.pr(S2_TA1.bill_dpt_cd),
							S1_V1.pr("bill_dpt_nm"),
							S1_V1.pr(S2_MA1.wg_cd),
							S1_V1.pr(S2_MA2.wg_nm),
							S1_V1.pr(S2_TA1.bcst_cd),
							S1_V1.pr("schd_act_rcv_dt"),
							S1_V1.pr(S2_TA2.rcv_mtd_cd),
							S1_V1.pr("rcv_mtd_nm"),
							S1_V1.pr(S2_TA2.rcv_typ),
							S1_V1.pr(S2_TA1.not_appl_bal),
							S1_V1.pr("bill_ym"),
							S1_V1.pr(S2_TA1.bill_each_sls_flg),
							S1_V1.pr(S2_TA1.bill_dt),
							S1_V1.pr(S2_TA1.trd_cur_cd),
							S1_V1.pr("trd_cur_nm"),
							S1_V1.pr(S2_MA4.amt_dec_place),
							S1_V1.pr(S2_TA1.bill_no),
							S1_V1.pr(S2_TA1.iv_no),
							S1_V1.pr(S2_TA1.wrk_no),
							S1_V1.pr(S2_TA3.wrk_nm),
							S1_V1.pr("adjst_flg"),
							S1_V1.pr(S2_TA1.bill_mng_no)
						).view(S0_V2)
						.innerJoin(S0_T1).on(
							bracket(
								S0_V2.pr(S2_TA1.bill_mng_no).eq(S0_T1.bill_mng_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_V2.pr(S2_TA1.bcst_cd).eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.rcst_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_V2.pr(S2_TA2.rcv_mtd_cd).eq(S0_M3.sttl_cd)
							)
						)
						.addDynamicView(DS0C_BCST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.bp_nm.like(bind("bcst_nm")))
						.and(
							S0_V2.pr("rcv_schd_amt").neq(value(0))
							.or(S0_V2.pr("rcv_act_amt").neq(value(0)))
							.or(S0_V2.pr(S2_TA1.not_appl_bal).neq(value(0)))
						)
						.cutoff$and(
							bracket(
								bind("rcv_schd_adjst_flg_str").eq(value(true))
								.and(S0_M1.bill_prnt_typ.eq(value(MAC_BILL_PRNT_TYP.RCV_ADJ.value())))
							)
						)
						.cutoff$and(S0_V2.pr("adjst_flg").eq(bind("adjst_flg_str")))
						.cutoff$and(S0_M1.rcst_cd.like(bind("rcst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("rcst_nm")))
						.addDynamicPredicate(DS0C_BCST_GRP)
					)
					.orderBy(
						S0_V2.pr(S2_TA1.bill_dpt_cd).asc(),
						S0_V2.pr("bill_dpt_nm").asc(),
						S0_V2.pr(S2_MA1.wg_cd).asc(),
						S0_V2.pr(S2_TA1.bcst_cd).asc(),
						S0_V2.pr("bill_ym").asc(),
						S0_V2.pr(S2_TA1.bill_dt).asc(),
						S0_V2.pr(S2_TA1.trd_cur_cd).asc(),
						S0_V2.pr(S2_TA1.bill_no).asc(),
						S0_V2.pr(S2_TA1.iv_no).asc(),
						S0_V2.pr(S2_TA1.wrk_no).asc(),
						S0_V2.pr("schd_act_rcv_dt").asc(),
						S0_V2.pr(S2_TA2.rcv_mtd_cd).asc(),
						S0_V2.pr("rcv_schd_amt").desc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bcst_grp_flg1"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd1.as("bcst_grp_cd1"), S0_MM1.bp_grp_nm.as("bcst_grp_nm1"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("bcst_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("bcst_grp_nm1")))),
				when(boundOr("bcst_grp_flg2"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd2.as("bcst_grp_cd2"), S0_MM2.bp_grp_nm.as("bcst_grp_nm2"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("bcst_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("bcst_grp_nm2")))),
				when(boundOr("bcst_grp_flg3"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd3.as("bcst_grp_cd3"), S0_MM3.bp_grp_nm.as("bcst_grp_nm3"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("bcst_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("bcst_grp_nm3")))),
				when(boundOr("bcst_grp_flg4"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd4.as("bcst_grp_cd4"), S0_MM4.bp_grp_nm.as("bcst_grp_nm4"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("bcst_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("bcst_grp_nm4")))),
				when(boundOr("bcst_grp_flg5"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd5.as("bcst_grp_cd5"), S0_MM5.bp_grp_nm.as("bcst_grp_nm5"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("bcst_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("bcst_grp_nm5")))),
				when(boundOr("bcst_grp_flg6"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd6.as("bcst_grp_cd6"), S0_MM6.bp_grp_nm.as("bcst_grp_nm6"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("bcst_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("bcst_grp_nm6")))),
				when(boundOr("bcst_grp_flg7"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd7.as("bcst_grp_cd7"), S0_MM7.bp_grp_nm.as("bcst_grp_nm7"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("bcst_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("bcst_grp_nm7")))),
				when(boundOr("bcst_grp_flg8"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd8.as("bcst_grp_cd8"), S0_MM8.bp_grp_nm.as("bcst_grp_nm8"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("bcst_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("bcst_grp_nm8")))),
				when(boundOr("bcst_grp_flg9"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd9.as("bcst_grp_cd9"), S0_MM9.bp_grp_nm.as("bcst_grp_nm9"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("bcst_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("bcst_grp_nm9")))),
				when(boundOr("bcst_grp_flg10"))
					.select(DS0C_BCST_GRP, S0_M1.bp_grp_cd10.as("bcst_grp_cd10"), S0_MM10.bp_grp_nm.as("bcst_grp_nm10"))
					.view(DS0C_BCST_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_BCST_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("bcst_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("bcst_grp_nm10"))))
			);
	}
}