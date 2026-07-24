package mcframe.serverMSBH.MSBHL0050;

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
	 * -- MSBHL0050_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL0050_MST_PAY_SCHD_S01() {
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_BP_GRP_R S0_BSPPL_GRP1 = MAM_BP_GRP_R.create("BSPPL_GRP1");
		MAM_BP_GRP_R S0_BSPPL_GRP2 = MAM_BP_GRP_R.create("BSPPL_GRP2");
		MAM_BP_GRP_R S0_BSPPL_GRP3 = MAM_BP_GRP_R.create("BSPPL_GRP3");
		MAM_BP_GRP_R S0_BSPPL_GRP4 = MAM_BP_GRP_R.create("BSPPL_GRP4");
		MAM_BP_GRP_R S0_BSPPL_GRP5 = MAM_BP_GRP_R.create("BSPPL_GRP5");
		MAM_BP_GRP_R S0_BSPPL_GRP6 = MAM_BP_GRP_R.create("BSPPL_GRP6");
		MAM_BP_GRP_R S0_BSPPL_GRP7 = MAM_BP_GRP_R.create("BSPPL_GRP7");
		MAM_BP_GRP_R S0_BSPPL_GRP8 = MAM_BP_GRP_R.create("BSPPL_GRP8");
		MAM_BP_GRP_R S0_BSPPL_GRP9 = MAM_BP_GRP_R.create("BSPPL_GRP9");
		MAM_BP_GRP_R S0_BSPPL_GRP10 = MAM_BP_GRP_R.create("BSPPL_GRP10");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_BP_R S0_PSPPL = MAM_BP_R.create("PSPPL");
		MAM_BP_GRP_R S0_PSPPL_GRP1 = MAM_BP_GRP_R.create("PSPPL_GRP1");
		MAM_BP_GRP_R S0_PSPPL_GRP2 = MAM_BP_GRP_R.create("PSPPL_GRP2");
		MAM_BP_GRP_R S0_PSPPL_GRP3 = MAM_BP_GRP_R.create("PSPPL_GRP3");
		MAM_BP_GRP_R S0_PSPPL_GRP4 = MAM_BP_GRP_R.create("PSPPL_GRP4");
		MAM_BP_GRP_R S0_PSPPL_GRP5 = MAM_BP_GRP_R.create("PSPPL_GRP5");
		MAM_BP_GRP_R S0_PSPPL_GRP6 = MAM_BP_GRP_R.create("PSPPL_GRP6");
		MAM_BP_GRP_R S0_PSPPL_GRP7 = MAM_BP_GRP_R.create("PSPPL_GRP7");
		MAM_BP_GRP_R S0_PSPPL_GRP8 = MAM_BP_GRP_R.create("PSPPL_GRP8");
		MAM_BP_GRP_R S0_PSPPL_GRP9 = MAM_BP_GRP_R.create("PSPPL_GRP9");
		MAM_BP_GRP_R S0_PSPPL_GRP10 = MAM_BP_GRP_R.create("PSPPL_GRP10");
		MCTempView S0V1 = createTempView("V1");
		MCTempView S1T1 = createTempView("T1");
		MST_WRK_R S1T2 = MST_WRK_R.create("T2");
		MST_PAY_CHK_R S2TA2 = MST_PAY_CHK_R.create("TA2");
		MST_PAY_SCHD_R S2TA1 = MST_PAY_SCHD_R.create("TA1");
		MAM_DPT_R S2MA1 = MAM_DPT_R.create("MA1");
		MAM_BP_R S2MA2 = MAM_BP_R.create("MA2");
		MAM_STTL_R S2MA3 = MAM_STTL_R.create("MA3");
		MAVM_RD_DPT_R S2DA1 = MAVM_RD_DPT_R.create("DA1");
		MST_PAY_ACT_R S3TB2 = MST_PAY_ACT_R.create("TB2");
		MST_PAY_ACT_D_R S3TB1 = MST_PAY_ACT_D_R.create("TB1");
		MST_PAY_CHK_R S3TB3 = MST_PAY_CHK_R.create("TB3");
		MAM_DPT_R S3MB1 = MAM_DPT_R.create("MB1");
		MAM_STTL_R S3MB2 = MAM_STTL_R.create("MB2");
		MAVM_RD_DPT_R S3DB1 = MAVM_RD_DPT_R.create("DB1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0050_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0V1.pr(S2TA2.bsppl_dpt_cd),
						S0V1.pr("bsppl_dpt_nm"),
						S0V1.pr(S2MA1.wg_cd),
						S0V1.pr(S2TA1.ap_typ),
						S0V1.pr(S2TA2.bsppl_cd),
						S0V1.pr("pay_schd_act_dt"),
						S0V1.pr(S2TA1.ap_sttl_cd),
						S0V1.pr("ap_sttl_nm"),
						S0V1.pr(S2MA3.ap_sttl_typ),
						S0V1.pr("pay_schd_amt"),
						S0V1.pr("pay_act_amt"),
						S0V1.pr(S2TA2.trd_cur_cd),
						S0V1.pr("bsppl_cl_ym"),
						S0V1.pr("bsppl_cl_day"),
						S0V1.pr(S2TA2.pay_xrate),
						S0V1.pr(S2TA2.pay_chk_no),
						S0V1.pr(S2TA2.rcpt_iv_no),
						S0V1.pr(S2TA2.rcpt_iv_mng_no),
						S0V1.pr(S2TA2.purc_act_no),
						S0V1.pr(S2TA2.wrk_no),
						S0V1.pr(S1T2.wrk_nm),
						S0V1.pr(S2TA1.asppl_cd),
						S0V1.pr(S2MA2.psppl_cd),
						S0V1.pr(S2TA1.pay_dpt_cd),
						S0V1.pr(S2TA2.aprv_no),
						S0V1.pr(S2TA2.aprv_sts_typ),
						S0V1.pr(S2TA2.aprv_flg),
						S0V1.pr("base_dt"),
						S0V1.pr(S2TA2.pay_sts_typ),
						S0V1.pr("act_flg"),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1T1.pr(S2TA2.bsppl_dpt_cd),
							S1T1.pr("bsppl_dpt_nm"),
							S1T1.pr(S2MA1.wg_cd),
							S1T1.pr(S2TA1.ap_typ),
							S1T1.pr(S2TA2.bsppl_cd),
							S1T1.pr("pay_schd_act_dt"),
							S1T1.pr(S2TA1.ap_sttl_cd),
							S1T1.pr("ap_sttl_nm"),
							S1T1.pr(S2MA3.ap_sttl_typ),
							sum(S1T1.pr("pay_schd_amt")).as("pay_schd_amt"),
							sum(S1T1.pr("pay_act_amt")).as("pay_act_amt"),
							S1T1.pr(S2TA2.trd_cur_cd),
							S1T1.pr("bsppl_cl_ym"),
							S1T1.pr("bsppl_cl_day"),
							S1T1.pr(S2TA2.pay_xrate),
							S1T1.pr(S2TA2.pay_chk_no),
							S1T1.pr(S2TA2.rcpt_iv_no),
							S1T1.pr(S2TA2.rcpt_iv_mng_no),
							S1T1.pr(S2TA2.purc_act_no),
							S1T1.pr(S2TA2.wrk_no),
							S1T2.wrk_nm,
							S1T1.pr(S2TA1.asppl_cd),
							S1T1.pr(S2MA2.psppl_cd),
							S1T1.pr(S2TA1.pay_dpt_cd),
							S1T1.pr(S2TA2.aprv_no),
							S1T1.pr(S2TA2.aprv_sts_typ),
							S1T1.pr(S2TA2.aprv_flg),
							max(S1T1.pr("base_dt")).as("base_dt"),
							S1T1.pr(S2TA2.pay_sts_typ),
							max(S1T1.pr("act_flg")).as("act_flg")
						)
						.from(
							subQuery()
							.select(
								S2TA2.bsppl_dpt_cd,
								S2MA1.dpt_nm.as("bsppl_dpt_nm"),
								S2MA1.wg_cd,
								S2TA1.ap_typ,
								S2TA2.bsppl_cd,
								S2TA1.pay_schd_dt.as("pay_schd_act_dt"),
								S2TA1.ap_sttl_cd,
								S2MA3.sttl_nm.as("ap_sttl_nm"),
								S2MA3.ap_sttl_typ,
								S2TA1.trd_cur_amt.as("pay_schd_amt"),
								value(0).as("pay_act_amt"),
								S2TA2.trd_cur_cd,
								S2TA2.bsppl_cl_dt.as("bsppl_cl_ym"),
								toChar(
									S2TA2.bsppl_cl_dt,
									MCDateTimeFmt.DD
								).as("bsppl_cl_day"),
								S2TA2.pay_xrate,
								S2TA2.pay_chk_no,
								S2TA2.rcpt_iv_no,
								S2TA2.rcpt_iv_mng_no,
								S2TA2.purc_act_no,
								S2TA2.wrk_no,
								S2TA1.asppl_cd,
								S2MA2.psppl_cd,
								S2TA1.pay_dpt_cd,
								S2TA2.aprv_no,
								S2TA2.aprv_sts_typ,
								S2TA2.aprv_flg,
								S2TA1.pay_schd_dt.as("base_dt"),
								S2TA2.pay_sts_typ,
								value(false).as("act_flg")
							)
							.from(
								S2TA2
								.leftOuterJoin(S2TA1).on(S2TA2.pay_chk_mng_no.eq(S2TA1.pay_chk_mng_no))
								.leftOuterJoin(S2MA1).on(
									S2TA2.bsppl_dpt_cd.eq(S2MA1.dpt_cd)
									.and(
										nvl2(
											S2TA2.bsppl_cl_dt,
											S2TA2.bsppl_cl_dt,
											S2TA2.reg_dt
										).between(S2MA1.st_dt, S2MA1.end_dt)
									)
								)
								.leftOuterJoin(S2MA2).on(S2TA2.bsppl_cd.eq(S2MA2.bp_cd))
								.leftOuterJoin(S2MA3).on(S2TA1.ap_sttl_cd.eq(S2MA3.sttl_cd))
								.innerJoin(S2DA1).on(S2TA2.bsppl_dpt_cd.eq(S2DA1.dpt_cd))
							)
							.where(
								value(0).eq(value(0))
								.and(
									bracket(
										bind("tmp_aprv_flg").eq(value(true))
										.and(S2TA2.aprv_flg.eq(value(false)))
									)
									.cutoff$or(
										bracket(
											S2TA2.aprv_flg.eq(value(true))
											.and(S2TA2.aprv_sts_typ.like(bind("tmp_aprv_sts_typ")))
										)
									)
								)
								.cutoff$and(S2TA1.pay_schd_dt.gte(bind("pay_schd_act_dt_fr")))
								.cutoff$and(S2TA1.pay_schd_dt.lte(bind("pay_schd_act_dt_to")))
								.cutoff$and(S2TA2.bsppl_cd.like(bind("bsppl_cd")))
								.cutoff$and(S2TA2.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
								.cutoff$and(S2MA1.dpt_nm.like(bind("bsppl_dpt_nm")))
								.cutoff$and(S2MA1.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2TA2.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2TA2.pay_chk_no.like(bind("pay_chk_no")))
								.cutoff$and(S2TA2.rcpt_iv_no.like(bind("rcpt_iv_no")))
								.cutoff$and(S2TA2.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
								.cutoff$and(S2TA2.purc_act_no.like(bind("purc_act_no")))
								.cutoff$and(S2TA2.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2TA1.ap_typ.like(bind("ap_typ")))
								.cutoff$and(S2MA2.psppl_cd.like(bind("psppl_cd")))
								.cutoff$and(S2TA2.pay_sts_typ.neq(bind("tmp_pay_sts_typ")))
							)
							.unionAll(
								subQuery()
								.select(
									S3TB3.bsppl_dpt_cd,
									S3MB1.dpt_nm.as("bsppl_dpt_nm"),
									S3MB1.wg_cd,
									S3TB1.ap_typ,
									S3TB3.bsppl_cd,
									S3TB2.pay_act_dt.as("pay_schd_act_dt"),
									S3TB1.ap_sttl_cd,
									S3MB2.sttl_nm.as("ap_sttl_nm"),
									S3MB2.ap_sttl_typ,
									value(0).as("pay_schd_amt"),
									S3TB1.trd_cur_amt.as("pay_act_amt"),
									S3TB2.trd_cur_cd,
									S3TB3.bsppl_cl_dt.as("bsppl_cl_ym"),
									toChar(
										S3TB3.bsppl_cl_dt,
										MCDateTimeFmt.DD
									).as("bsppl_cl_day"),
									S3TB3.pay_xrate,
									S3TB1.pay_chk_no,
									S3TB3.rcpt_iv_no,
									S3TB3.rcpt_iv_mng_no,
									S3TB3.purc_act_no,
									S3TB3.wrk_no,
									S3TB1.asppl_cd,
									S3TB2.psppl_cd,
									S3TB2.pay_dpt_cd,
									S3TB3.aprv_no,
									S3TB3.aprv_sts_typ,
									S3TB3.aprv_flg,
									S3TB2.ac_dt.as("base_dt"),
									S3TB3.pay_sts_typ,
									value(true).as("act_flg")
								)
								.from(
									S3TB2
									.leftOuterJoin(S3TB1).on(
										S3TB2.pay_act_no.eq(S3TB1.pay_act_no)
										.and(S3TB2.pay_act_seq.eq(S3TB1.pay_act_seq))
									)
									.innerJoin(S3TB3).on(S3TB1.pay_chk_no.eq(S3TB3.pay_chk_no))
									.leftOuterJoin(S3MB1).on(
										S3TB3.bsppl_dpt_cd.eq(S3MB1.dpt_cd)
										.and(
											nvl2(
												S3TB3.bsppl_cl_dt,
												S3TB3.bsppl_cl_dt,
												S3TB3.reg_dt
											).between(S3MB1.st_dt, S3MB1.end_dt)
										)
									)
									.leftOuterJoin(S3MB2).on(S3TB1.ap_sttl_cd.eq(S3MB2.sttl_cd))
									.innerJoin(S3DB1).on(S3TB3.bsppl_dpt_cd.eq(S3DB1.dpt_cd))
								)
								.where(
									value(0).eq(value(0))
									.and(MAC_SLIP_STS_TYP$IS_CRT(S3TB2.slip_sts_typ).eq(value(true)))
									.and(
										bracket(
											bind("tmp_aprv_flg").eq(value(true))
											.and(S3TB3.aprv_flg.eq(value(false)))
										)
										.cutoff$or(
											bracket(
												S3TB3.aprv_flg.eq(value(true))
												.and(S3TB3.aprv_sts_typ.like(bind("tmp_aprv_sts_typ")))
											)
										)
									)
									.cutoff$and(S3TB2.pay_act_dt.gte(bind("pay_schd_act_dt_fr")))
									.cutoff$and(S3TB2.pay_act_dt.lte(bind("pay_schd_act_dt_to")))
									.cutoff$and(S3TB3.bsppl_cd.like(bind("bsppl_cd")))
									.cutoff$and(S3TB3.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
									.cutoff$and(S3MB1.dpt_nm.like(bind("bsppl_dpt_nm")))
									.cutoff$and(S3MB1.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S3TB2.trd_cur_cd.like(bind("trd_cur_cd")))
									.cutoff$and(S3TB1.pay_chk_no.like(bind("pay_chk_no")))
									.cutoff$and(S3TB3.rcpt_iv_no.like(bind("rcpt_iv_no")))
									.cutoff$and(S3TB3.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
									.cutoff$and(S3TB3.purc_act_no.like(bind("purc_act_no")))
									.cutoff$and(S3TB3.wrk_no.like(bind("wrk_no")))
									.cutoff$and(S3TB1.ap_typ.like(bind("ap_typ")))
									.cutoff$and(S3TB2.psppl_cd.like(bind("psppl_cd")))
									.cutoff$and(S3TB3.pay_sts_typ.neq(bind("tmp_pay_sts_typ")))
								)
							).view(S1T1)
							.leftOuterJoin(S1T2).on(S1T1.pr(S2TA2.wrk_no).eq(S1T2.wrk_no))
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1T2.wrk_nm.like(bind("wrk_nm")))
						)
						.groupBy(
							S1T1.pr(S2TA2.bsppl_dpt_cd),
							S1T1.pr("bsppl_dpt_nm"),
							S1T1.pr(S2MA1.wg_cd),
							S1T1.pr(S2TA1.ap_typ),
							S1T1.pr(S2TA2.bsppl_cd),
							S1T1.pr("pay_schd_act_dt"),
							S1T1.pr(S2TA1.ap_sttl_cd),
							S1T1.pr("ap_sttl_nm"),
							S1T1.pr(S2MA3.ap_sttl_typ),
							S1T1.pr(S2TA2.trd_cur_cd),
							S1T1.pr(S2TA2.pay_xrate),
							S1T1.pr("bsppl_cl_ym"),
							S1T1.pr("bsppl_cl_day"),
							S1T1.pr(S2TA2.pay_chk_no),
							S1T1.pr(S2TA2.pay_sts_typ),
							S1T1.pr(S2TA2.rcpt_iv_no),
							S1T1.pr(S2TA2.rcpt_iv_mng_no),
							S1T1.pr(S2TA2.purc_act_no),
							S1T1.pr(S2TA2.wrk_no),
							S1T2.wrk_nm,
							S1T1.pr(S2TA1.asppl_cd),
							S1T1.pr(S2MA2.psppl_cd),
							S1T1.pr(S2TA1.pay_dpt_cd),
							S1T1.pr(S2TA2.aprv_no),
							S1T1.pr(S2TA2.aprv_sts_typ),
							S1T1.pr(S2TA2.aprv_flg)
						).view(S0V1)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
			)
		.setDynamicSQLInfo(
			when(boundOr("bsppl_nm", "bsppl_grp_flg1", "bsppl_grp_flg2", "bsppl_grp_flg3", "bsppl_grp_flg4", "bsppl_grp_flg5", "bsppl_grp_flg6", "bsppl_grp_flg7", "bsppl_grp_flg8", "bsppl_grp_flg9", "bsppl_grp_flg10"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0V1.pr(S2TA2.bsppl_cd))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_nm.like(bind("bsppl_nm")))),
			when(boundOr("bsppl_grp_flg1"))
				.select(DS0D, S0_BSPPL.bp_grp_cd1.as("bsppl_grp_cd1"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd1),
			when(boundOr("bsppl_grp_flg1", "bsppl_grp_cd1"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd1.like(bind("bsppl_grp_cd1")))),
			when(boundOr("bsppl_grp_flg1"))
				.select(DS0D, S0_BSPPL_GRP1.bp_grp_nm.as("bsppl_grp_nm1"))
				.groupBy(DS0D, S0_BSPPL_GRP1.bp_grp_nm),
			when(boundOr("bsppl_grp_flg1", "bsppl_grp_nm1"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP1).on(S0_BSPPL.bp_grp_cd1.eq(S0_BSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BSPPL_GRP1.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP1.bp_grp_nm.like(bind("bsppl_grp_nm1")))),
			when(boundOr("bsppl_grp_flg2"))
				.select(DS0D, S0_BSPPL.bp_grp_cd2.as("bsppl_grp_cd2"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd2),
			when(boundOr("bsppl_grp_flg2", "bsppl_grp_cd2"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd2.like(bind("bsppl_grp_cd2")))),
			when(boundOr("bsppl_grp_flg2"))
				.select(DS0D, S0_BSPPL_GRP2.bp_grp_nm.as("bsppl_grp_nm2"))
				.groupBy(DS0D, S0_BSPPL_GRP2.bp_grp_nm),
			when(boundOr("bsppl_grp_flg2", "bsppl_grp_nm2"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP2).on(S0_BSPPL.bp_grp_cd2.eq(S0_BSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BSPPL_GRP2.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP2.bp_grp_nm.like(bind("bsppl_grp_nm2")))),
			when(boundOr("bsppl_grp_flg3"))
				.select(DS0D, S0_BSPPL.bp_grp_cd3.as("bsppl_grp_cd3"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd3),
			when(boundOr("bsppl_grp_flg3", "bsppl_grp_cd3"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd3.like(bind("bsppl_grp_cd3")))),
			when(boundOr("bsppl_grp_flg3"))
				.select(DS0D, S0_BSPPL_GRP3.bp_grp_nm.as("bsppl_grp_nm3"))
				.groupBy(DS0D, S0_BSPPL_GRP3.bp_grp_nm),
			when(boundOr("bsppl_grp_flg3", "bsppl_grp_nm3"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP3).on(S0_BSPPL.bp_grp_cd3.eq(S0_BSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BSPPL_GRP3.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP3.bp_grp_nm.like(bind("bsppl_grp_nm3")))),
			when(boundOr("bsppl_grp_flg4"))
				.select(DS0D, S0_BSPPL.bp_grp_cd4.as("bsppl_grp_cd4"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd4),
			when(boundOr("bsppl_grp_flg4", "bsppl_grp_cd4"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd4.like(bind("bsppl_grp_cd4")))),
			when(boundOr("bsppl_grp_flg4"))
				.select(DS0D, S0_BSPPL_GRP4.bp_grp_nm.as("bsppl_grp_nm4"))
				.groupBy(DS0D, S0_BSPPL_GRP4.bp_grp_nm),
			when(boundOr("bsppl_grp_flg4", "bsppl_grp_nm4"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP4).on(S0_BSPPL.bp_grp_cd4.eq(S0_BSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BSPPL_GRP4.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP4.bp_grp_nm.like(bind("bsppl_grp_nm4")))),
			when(boundOr("bsppl_grp_flg5"))
				.select(DS0D, S0_BSPPL.bp_grp_cd5.as("bsppl_grp_cd5"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd5),
			when(boundOr("bsppl_grp_flg5", "bsppl_grp_cd5"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd5.like(bind("bsppl_grp_cd5")))),
			when(boundOr("bsppl_grp_flg5"))
				.select(DS0D, S0_BSPPL_GRP5.bp_grp_nm.as("bsppl_grp_nm5"))
				.groupBy(DS0D, S0_BSPPL_GRP5.bp_grp_nm),
			when(boundOr("bsppl_grp_flg5", "bsppl_grp_nm5"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP5).on(S0_BSPPL.bp_grp_cd5.eq(S0_BSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BSPPL_GRP5.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP5.bp_grp_nm.like(bind("bsppl_grp_nm5")))),
			when(boundOr("bsppl_grp_flg6"))
				.select(DS0D, S0_BSPPL.bp_grp_cd6.as("bsppl_grp_cd6"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd6),
			when(boundOr("bsppl_grp_flg6", "bsppl_grp_cd6"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd6.like(bind("bsppl_grp_cd6")))),
			when(boundOr("bsppl_grp_flg6"))
				.select(DS0D, S0_BSPPL_GRP6.bp_grp_nm.as("bsppl_grp_nm6"))
				.groupBy(DS0D, S0_BSPPL_GRP6.bp_grp_nm),
			when(boundOr("bsppl_grp_flg6", "bsppl_grp_nm6"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP6).on(S0_BSPPL.bp_grp_cd6.eq(S0_BSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BSPPL_GRP6.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP6.bp_grp_nm.like(bind("bsppl_grp_nm6")))),
			when(boundOr("bsppl_grp_flg7"))
				.select(DS0D, S0_BSPPL.bp_grp_cd7.as("bsppl_grp_cd7"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd7),
			when(boundOr("bsppl_grp_flg7", "bsppl_grp_cd7"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd7.like(bind("bsppl_grp_cd7")))),
			when(boundOr("bsppl_grp_flg7"))
				.select(DS0D, S0_BSPPL_GRP7.bp_grp_nm.as("bsppl_grp_nm7"))
				.groupBy(DS0D, S0_BSPPL_GRP7.bp_grp_nm),
			when(boundOr("bsppl_grp_flg7", "bsppl_grp_nm7"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP7).on(S0_BSPPL.bp_grp_cd7.eq(S0_BSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BSPPL_GRP7.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP7.bp_grp_nm.like(bind("bsppl_grp_nm7")))),
			when(boundOr("bsppl_grp_flg8"))
				.select(DS0D, S0_BSPPL.bp_grp_cd8.as("bsppl_grp_cd8"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd8),
			when(boundOr("bsppl_grp_flg8", "bsppl_grp_cd8"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd8.like(bind("bsppl_grp_cd8")))),
			when(boundOr("bsppl_grp_flg8"))
				.select(DS0D, S0_BSPPL_GRP8.bp_grp_nm.as("bsppl_grp_nm8"))
				.groupBy(DS0D, S0_BSPPL_GRP8.bp_grp_nm),
			when(boundOr("bsppl_grp_flg8", "bsppl_grp_nm8"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP8).on(S0_BSPPL.bp_grp_cd8.eq(S0_BSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BSPPL_GRP8.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP8.bp_grp_nm.like(bind("bsppl_grp_nm8")))),
			when(boundOr("bsppl_grp_flg9"))
				.select(DS0D, S0_BSPPL.bp_grp_cd9.as("bsppl_grp_cd9"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd9),
			when(boundOr("bsppl_grp_flg9", "bsppl_grp_cd9"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd9.like(bind("bsppl_grp_cd9")))),
			when(boundOr("bsppl_grp_flg9"))
				.select(DS0D, S0_BSPPL_GRP9.bp_grp_nm.as("bsppl_grp_nm9"))
				.groupBy(DS0D, S0_BSPPL_GRP9.bp_grp_nm),
			when(boundOr("bsppl_grp_flg9", "bsppl_grp_nm9"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP9).on(S0_BSPPL.bp_grp_cd9.eq(S0_BSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BSPPL_GRP9.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP9.bp_grp_nm.like(bind("bsppl_grp_nm9")))),
			when(boundOr("bsppl_grp_flg10"))
				.select(DS0D, S0_BSPPL.bp_grp_cd10.as("bsppl_grp_cd10"))
				.groupBy(DS0D, S0_BSPPL.bp_grp_cd10),
			when(boundOr("bsppl_grp_flg10", "bsppl_grp_cd10"))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd10.like(bind("bsppl_grp_cd10")))),
			when(boundOr("bsppl_grp_flg10"))
				.select(DS0D, S0_BSPPL_GRP10.bp_grp_nm.as("bsppl_grp_nm10"))
				.groupBy(DS0D, S0_BSPPL_GRP10.bp_grp_nm),
			when(boundOr("bsppl_grp_flg10", "bsppl_grp_nm10"))
				.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP10).on(S0_BSPPL.bp_grp_cd10.eq(S0_BSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BSPPL_GRP10.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP10.bp_grp_nm.like(bind("bsppl_grp_nm10")))),
			when(boundOr("psppl_nm", "psppl_grp_flg1", "psppl_grp_flg2", "psppl_grp_flg3", "psppl_grp_flg4", "psppl_grp_flg5", "psppl_grp_flg6", "psppl_grp_flg7", "psppl_grp_flg8", "psppl_grp_flg9", "psppl_grp_flg10"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL).on(S0_PSPPL.bp_cd.eq(S0V1.pr(S2MA2.psppl_cd))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_nm.like(bind("psppl_nm")))),
			when(boundOr("psppl_grp_flg1"))
				.select(DS0D, S0_PSPPL.bp_grp_cd1.as("psppl_grp_cd1"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd1),
			when(boundOr("psppl_grp_flg1", "psppl_grp_cd1"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd1.like(bind("psppl_grp_cd1")))),
			when(boundOr("psppl_grp_flg1"))
				.select(DS0D, S0_PSPPL_GRP1.bp_grp_nm.as("psppl_grp_nm1"))
				.groupBy(DS0D, S0_PSPPL_GRP1.bp_grp_nm),
			when(boundOr("psppl_grp_flg1", "psppl_grp_nm1"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP1).on(S0_PSPPL.bp_grp_cd1.eq(S0_PSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PSPPL_GRP1.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP1.bp_grp_nm.like(bind("psppl_grp_nm1")))),
			when(boundOr("psppl_grp_flg2"))
				.select(DS0D, S0_PSPPL.bp_grp_cd2.as("psppl_grp_cd2"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd2),
			when(boundOr("psppl_grp_flg2", "psppl_grp_cd2"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd2.like(bind("psppl_grp_cd2")))),
			when(boundOr("psppl_grp_flg2"))
				.select(DS0D, S0_PSPPL_GRP2.bp_grp_nm.as("psppl_grp_nm2"))
				.groupBy(DS0D, S0_PSPPL_GRP2.bp_grp_nm),
			when(boundOr("psppl_grp_flg2", "psppl_grp_nm2"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP2).on(S0_PSPPL.bp_grp_cd2.eq(S0_PSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PSPPL_GRP2.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP2.bp_grp_nm.like(bind("psppl_grp_nm2")))),
			when(boundOr("psppl_grp_flg3"))
				.select(DS0D, S0_PSPPL.bp_grp_cd3.as("psppl_grp_cd3"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd3),
			when(boundOr("psppl_grp_flg3", "psppl_grp_cd3"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd3.like(bind("psppl_grp_cd3")))),
			when(boundOr("psppl_grp_flg3"))
				.select(DS0D, S0_PSPPL_GRP3.bp_grp_nm.as("psppl_grp_nm3"))
				.groupBy(DS0D, S0_PSPPL_GRP3.bp_grp_nm),
			when(boundOr("psppl_grp_flg3", "psppl_grp_nm3"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP3).on(S0_PSPPL.bp_grp_cd3.eq(S0_PSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PSPPL_GRP3.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP3.bp_grp_nm.like(bind("psppl_grp_nm3")))),
			when(boundOr("psppl_grp_flg4"))
				.select(DS0D, S0_PSPPL.bp_grp_cd4.as("psppl_grp_cd4"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd4),
			when(boundOr("psppl_grp_flg4", "psppl_grp_cd4"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd4.like(bind("psppl_grp_cd4")))),
			when(boundOr("psppl_grp_flg4"))
				.select(DS0D, S0_PSPPL_GRP4.bp_grp_nm.as("psppl_grp_nm4"))
				.groupBy(DS0D, S0_PSPPL_GRP4.bp_grp_nm),
			when(boundOr("psppl_grp_flg4", "psppl_grp_nm4"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP4).on(S0_PSPPL.bp_grp_cd4.eq(S0_PSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PSPPL_GRP4.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP4.bp_grp_nm.like(bind("psppl_grp_nm4")))),
			when(boundOr("psppl_grp_flg5"))
				.select(DS0D, S0_PSPPL.bp_grp_cd5.as("psppl_grp_cd5"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd5),
			when(boundOr("psppl_grp_flg5", "psppl_grp_cd5"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd5.like(bind("psppl_grp_cd5")))),
			when(boundOr("psppl_grp_flg5"))
				.select(DS0D, S0_PSPPL_GRP5.bp_grp_nm.as("psppl_grp_nm5"))
				.groupBy(DS0D, S0_PSPPL_GRP5.bp_grp_nm),
			when(boundOr("psppl_grp_flg5", "psppl_grp_nm5"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP5).on(S0_PSPPL.bp_grp_cd5.eq(S0_PSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PSPPL_GRP5.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP5.bp_grp_nm.like(bind("psppl_grp_nm5")))),
			when(boundOr("psppl_grp_flg6"))
				.select(DS0D, S0_PSPPL.bp_grp_cd6.as("psppl_grp_cd6"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd6),
			when(boundOr("psppl_grp_flg6", "psppl_grp_cd6"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd6.like(bind("psppl_grp_cd6")))),
			when(boundOr("psppl_grp_flg6"))
				.select(DS0D, S0_PSPPL_GRP6.bp_grp_nm.as("psppl_grp_nm6"))
				.groupBy(DS0D, S0_PSPPL_GRP6.bp_grp_nm),
			when(boundOr("psppl_grp_flg6", "psppl_grp_nm6"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP6).on(S0_PSPPL.bp_grp_cd6.eq(S0_PSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PSPPL_GRP6.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP6.bp_grp_nm.like(bind("psppl_grp_nm6")))),
			when(boundOr("psppl_grp_flg7"))
				.select(DS0D, S0_PSPPL.bp_grp_cd7.as("psppl_grp_cd7"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd7),
			when(boundOr("psppl_grp_flg7", "psppl_grp_cd7"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd7.like(bind("psppl_grp_cd7")))),
			when(boundOr("psppl_grp_flg7"))
				.select(DS0D, S0_PSPPL_GRP7.bp_grp_nm.as("psppl_grp_nm7"))
				.groupBy(DS0D, S0_PSPPL_GRP7.bp_grp_nm),
			when(boundOr("psppl_grp_flg7", "psppl_grp_nm7"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP7).on(S0_PSPPL.bp_grp_cd7.eq(S0_PSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PSPPL_GRP7.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP7.bp_grp_nm.like(bind("psppl_grp_nm7")))),
			when(boundOr("psppl_grp_flg8"))
				.select(DS0D, S0_PSPPL.bp_grp_cd8.as("psppl_grp_cd8"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd8),
			when(boundOr("psppl_grp_flg8", "psppl_grp_cd8"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd8.like(bind("psppl_grp_cd8")))),
			when(boundOr("psppl_grp_flg8"))
				.select(DS0D, S0_PSPPL_GRP8.bp_grp_nm.as("psppl_grp_nm8"))
				.groupBy(DS0D, S0_PSPPL_GRP8.bp_grp_nm),
			when(boundOr("psppl_grp_flg8", "psppl_grp_nm8"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP8).on(S0_PSPPL.bp_grp_cd8.eq(S0_PSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PSPPL_GRP8.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP8.bp_grp_nm.like(bind("psppl_grp_nm8")))),
			when(boundOr("psppl_grp_flg9"))
				.select(DS0D, S0_PSPPL.bp_grp_cd9.as("psppl_grp_cd9"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd9),
			when(boundOr("psppl_grp_flg9", "psppl_grp_cd9"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd9.like(bind("psppl_grp_cd9")))),
			when(boundOr("psppl_grp_flg9"))
				.select(DS0D, S0_PSPPL_GRP9.bp_grp_nm.as("psppl_grp_nm9"))
				.groupBy(DS0D, S0_PSPPL_GRP9.bp_grp_nm),
			when(boundOr("psppl_grp_flg9", "psppl_grp_nm9"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP9).on(S0_PSPPL.bp_grp_cd9.eq(S0_PSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PSPPL_GRP9.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP9.bp_grp_nm.like(bind("psppl_grp_nm9")))),
			when(boundOr("psppl_grp_flg10"))
				.select(DS0D, S0_PSPPL.bp_grp_cd10.as("psppl_grp_cd10"))
				.groupBy(DS0D, S0_PSPPL.bp_grp_cd10),
			when(boundOr("psppl_grp_flg10", "psppl_grp_cd10"))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd10.like(bind("psppl_grp_cd10")))),
			when(boundOr("psppl_grp_flg10"))
				.select(DS0D, S0_PSPPL_GRP10.bp_grp_nm.as("psppl_grp_nm10"))
				.groupBy(DS0D, S0_PSPPL_GRP10.bp_grp_nm),
			when(boundOr("psppl_grp_flg10", "psppl_grp_nm10"))
				.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP10).on(S0_PSPPL.bp_grp_cd10.eq(S0_PSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PSPPL_GRP10.bp_grp_typ))))
				.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP10.bp_grp_nm.like(bind("psppl_grp_nm10")))),
			when(boundOr("wg_nm"))
				.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0V1.pr(S2MA1.wg_cd))))
				.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
			when(boundOr("trd_cur_nm"))
				.view(DS0D, v -> v.leftOuterJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0V1.pr(S2TA2.trd_cur_cd))))
				.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm"))))
			);
	}
	
	/**
	 * -- MSBHL0050_MST_PAY_SCHD_Query_S02
	 */
	static MCQueryPlan MSBHL0050_MST_PAY_SCHD_S02() {
		MCTempView S0V1 = createTempView("V1");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_BP_R S0_BSPPL = MAM_BP_R.create("BSPPL");
		MAM_BP_GRP_R S0_BSPPL_GRP1 = MAM_BP_GRP_R.create("BSPPL_GRP1");
		MAM_BP_GRP_R S0_BSPPL_GRP2 = MAM_BP_GRP_R.create("BSPPL_GRP2");
		MAM_BP_GRP_R S0_BSPPL_GRP3 = MAM_BP_GRP_R.create("BSPPL_GRP3");
		MAM_BP_GRP_R S0_BSPPL_GRP4 = MAM_BP_GRP_R.create("BSPPL_GRP4");
		MAM_BP_GRP_R S0_BSPPL_GRP5 = MAM_BP_GRP_R.create("BSPPL_GRP5");
		MAM_BP_GRP_R S0_BSPPL_GRP6 = MAM_BP_GRP_R.create("BSPPL_GRP6");
		MAM_BP_GRP_R S0_BSPPL_GRP7 = MAM_BP_GRP_R.create("BSPPL_GRP7");
		MAM_BP_GRP_R S0_BSPPL_GRP8 = MAM_BP_GRP_R.create("BSPPL_GRP8");
		MAM_BP_GRP_R S0_BSPPL_GRP9 = MAM_BP_GRP_R.create("BSPPL_GRP9");
		MAM_BP_GRP_R S0_BSPPL_GRP10 = MAM_BP_GRP_R.create("BSPPL_GRP10");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MST_WRK_R S0_WRK = MST_WRK_R.create("WRK");
		MAM_BP_R S0_PSPPL = MAM_BP_R.create("PSPPL");
		MAM_BP_GRP_R S0_PSPPL_GRP1 = MAM_BP_GRP_R.create("PSPPL_GRP1");
		MAM_BP_GRP_R S0_PSPPL_GRP2 = MAM_BP_GRP_R.create("PSPPL_GRP2");
		MAM_BP_GRP_R S0_PSPPL_GRP3 = MAM_BP_GRP_R.create("PSPPL_GRP3");
		MAM_BP_GRP_R S0_PSPPL_GRP4 = MAM_BP_GRP_R.create("PSPPL_GRP4");
		MAM_BP_GRP_R S0_PSPPL_GRP5 = MAM_BP_GRP_R.create("PSPPL_GRP5");
		MAM_BP_GRP_R S0_PSPPL_GRP6 = MAM_BP_GRP_R.create("PSPPL_GRP6");
		MAM_BP_GRP_R S0_PSPPL_GRP7 = MAM_BP_GRP_R.create("PSPPL_GRP7");
		MAM_BP_GRP_R S0_PSPPL_GRP8 = MAM_BP_GRP_R.create("PSPPL_GRP8");
		MAM_BP_GRP_R S0_PSPPL_GRP9 = MAM_BP_GRP_R.create("PSPPL_GRP9");
		MAM_BP_GRP_R S0_PSPPL_GRP10 = MAM_BP_GRP_R.create("PSPPL_GRP10");
		MST_PAY_CHK_R S1TA2 = MST_PAY_CHK_R.create("TA2");
		MST_PAY_SCHD_R S1TA1 = MST_PAY_SCHD_R.create("TA1");
		MAM_DPT_R S1MA1 = MAM_DPT_R.create("MA1");
		MAM_DPT_R S1MA2 = MAM_DPT_R.create("MA2");
		MAM_DPT_R S1MA3 = MAM_DPT_R.create("MA3");
		MAM_DPT_R S1MA4 = MAM_DPT_R.create("MA4");
		MAM_STTL_R S1MA5 = MAM_STTL_R.create("MA5");
		MAM_BP_R S1MA6 = MAM_BP_R.create("MA6");
		MAVM_RD_DPT_R S1DA1 = MAVM_RD_DPT_R.create("DA1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0050_MST_PAY_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0V1.pr(S1TA2.bsppl_dpt_cd),
						S0V1.pr("bsppl_dpt_nm"),
						S0V1.pr(S1MA1.wg_cd),
						S0V1.pr(S1TA2.bsppl_cd),
						S0V1.pr(S1TA1.ap_typ),
						S0V1.pr(S1TA1.pay_schd_dt),
						S0V1.pr(S1TA1.ap_sttl_cd),
						S0V1.pr("ap_sttl_nm"),
						S0V1.pr(S1MA5.ap_sttl_typ),
						S0V1.pr("pay_schd_amt"),
						S0V1.pr("bsppl_cl_ym"),
						S0V1.pr("bsppl_cl_day"),
						S0V1.pr(S1TA2.trd_cur_cd),
						S0V1.pr(S1TA2.pay_xrate),
						S0V1.pr(S1TA2.pay_chk_no),
						S0V1.pr(S1TA1.pay_schd_no),
						S0V1.pr(S1TA2.rcpt_iv_no),
						S0V1.pr(S1TA2.rcpt_iv_mng_no),
						S0V1.pr(S1TA2.purc_act_no),
						S0V1.pr(S1TA2.wrk_no),
						S0V1.pr(S1MA6.psppl_cd),
						S0V1.pr(S1TA1.pay_dpt_cd),
						S0V1.pr("pay_dpt_nm"),
						S0V1.pr(S1TA1.asppl_cd),
						S0V1.pr(S1TA1.pay_sts_typ),
						S0V1.pr(S1TA1.sw_flg),
						S0V1.pr(S1TA1.ap_dpt_cd),
						S0V1.pr("ap_dpt_nm"),
						S0V1.pr(S1TA1.pay_bank_ac_cd),
						S0V1.pr(S1TA1.bank_ac_cd),
						S0V1.pr(S1TA1.ap_setoff_typ),
						S0V1.pr(S1TA1.setoff_cd),
						S0V1.pr(S1TA1.setoff_nm),
						S0V1.pr(S1TA1.so_dpt_cd),
						S0V1.pr("so_dpt_nm"),
						S0V1.pr(S1TA1.xrate),
						S0V1.pr("com_paid_tax_cd"),
						S0V1.pr("com_paid_tax_amt"),
						S0V1.pr("exc_com_paid"),
						S0V1.pr(S1TA1.rcv_bill_no),
						S0V1.pr(S1TA1.adv_pay_act_no),
						S0V1.pr(S1TA1.note_no),
						S0V1.pr(S1TA1.note_typ),
						S0V1.pr(S1TA1.note_rsn_cd),
						S0V1.pr(S1TA1.draw_dt),
						S0V1.pr(S1TA1.due_dt),
						S0V1.pr(S1TA1.note_days),
						S0V1.pr(S1TA1.drawer_nm),
						S0V1.pr(S1TA1.draw_bank_cd),
						S0V1.pr(S1TA1.draw_branch_cd),
						S0V1.pr(S1TA1.endrsr),
						S0V1.pr(S1TA1.accptr),
						S0V1.pr(S1TA1.pay_schd_print_rmrks),
						S0V1.pr(S1TA1.pay_ntc_d_print_rmrks),
						S0V1.pr(S1TA1.trd_d_rmrks),
						S0V1.pr(S1TA1.intr_rmrks),
						S0V1.pr(S1TA1.sub_char1),
						S0V1.pr(S1TA1.sub_char2),
						S0V1.pr(S1TA1.sub_char3),
						S0V1.pr(S1TA2.aprv_no),
						S0V1.pr(S1TA2.aprv_sts_typ),
						S0V1.pr(S1TA2.aprv_flg),
						S0V1.pr(S1TA2.reg_dt),
						S0V1.pr(S1TA1.ins_usr_id),
						S0V1.pr(S1TA1.ins_usr_nm),
						S0V1.pr(S1TA1.ins_ts),
						S0V1.pr(S1TA1.ins_func_id),
						S0V1.pr(S1TA1.upd_cntr),
						S0V1.pr(S1TA1.upd_usr_id),
						S0V1.pr(S1TA1.upd_usr_nm),
						S0V1.pr(S1TA1.upd_ts),
						S0V1.pr(S1TA1.upd_func_id),
						S0V1.pr(S1TA1.upd_srv_req_no),
						addDynamicSelect(DS0D)
					)
					.from(
						subQuery()
						.select(
							S1TA2.bsppl_dpt_cd,
							S1MA1.dpt_nm.as("bsppl_dpt_nm"),
							S1MA1.wg_cd,
							S1TA1.ap_typ,
							S1TA2.bsppl_cd,
							S1TA1.pay_schd_dt,
							S1TA1.ap_sttl_cd,
							S1MA5.sttl_nm.as("ap_sttl_nm"),
							S1MA5.ap_sttl_typ,
							S1TA1.trd_cur_amt.as("pay_schd_amt"),
							S1TA2.bsppl_cl_dt.as("bsppl_cl_ym"),
							toChar(
								S1TA2.bsppl_cl_dt,
								MCDateTimeFmt.DD
							).as("bsppl_cl_day"),
							S1TA2.trd_cur_cd,
							S1TA2.pay_xrate,
							S1TA2.pay_chk_no,
							S1TA1.pay_schd_no,
							S1TA2.rcpt_iv_no,
							S1TA2.rcpt_iv_mng_no,
							S1TA2.purc_act_no,
							S1TA2.wrk_no,
							S1MA6.psppl_cd,
							S1TA1.pay_dpt_cd,
							S1MA2.dpt_nm.as("pay_dpt_nm"),
							S1TA1.asppl_cd,
							S1TA1.pay_sts_typ,
							S1TA1.sw_flg,
							S1TA1.ap_dpt_cd,
							S1MA3.dpt_nm.as("ap_dpt_nm"),
							S1TA1.pay_bank_ac_cd,
							S1TA1.bank_ac_cd,
							S1TA1.ap_setoff_typ,
							S1TA1.setoff_cd,
							S1TA1.setoff_nm,
							S1TA1.so_dpt_cd,
							S1MA4.dpt_nm.as("so_dpt_nm"),
							S1TA1.xrate,
							S1TA1.trd_cur_com_paid_tax_cd.as("com_paid_tax_cd"),
							S1TA1.trd_cur_com_paid_tax_amt.as("com_paid_tax_amt"),
							S1TA1.trd_cur_exc_com_paid.as("exc_com_paid"),
							S1TA1.rcv_bill_no,
							S1TA1.adv_pay_act_no,
							S1TA1.note_no,
							S1TA1.note_typ,
							S1TA1.note_rsn_cd,
							S1TA1.draw_dt,
							S1TA1.due_dt,
							S1TA1.note_days,
							S1TA1.drawer_nm,
							S1TA1.draw_bank_cd,
							S1TA1.draw_branch_cd,
							S1TA1.endrsr,
							S1TA1.accptr,
							S1TA1.pay_schd_print_rmrks,
							S1TA1.pay_ntc_d_print_rmrks,
							S1TA1.trd_d_rmrks,
							S1TA1.intr_rmrks,
							S1TA1.sub_char1,
							S1TA1.sub_char2,
							S1TA1.sub_char3,
							S1TA2.aprv_no,
							S1TA2.aprv_sts_typ,
							S1TA2.aprv_flg,
							S1TA2.reg_dt,
							S1TA1.ins_usr_id,
							S1TA1.ins_usr_nm,
							S1TA1.ins_ts,
							S1TA1.ins_func_id,
							S1TA1.upd_cntr,
							S1TA1.upd_usr_id,
							S1TA1.upd_usr_nm,
							S1TA1.upd_ts,
							S1TA1.upd_func_id,
							S1TA1.upd_srv_req_no
						)
						.from(
							S1TA2
							.leftOuterJoin(S1TA1).on(S1TA2.pay_chk_mng_no.eq(S1TA1.pay_chk_mng_no))
							.leftOuterJoin(S1MA1).on(
								S1TA2.bsppl_dpt_cd.eq(S1MA1.dpt_cd)
								.and(
									nvl2(
										S1TA2.bsppl_cl_dt,
										S1TA2.bsppl_cl_dt,
										S1TA2.reg_dt
									).between(S1MA1.st_dt, S1MA1.end_dt)
								)
							)
							.leftOuterJoin(S1MA2).on(
								S1TA1.pay_dpt_cd.eq(S1MA2.dpt_cd)
								.and(S1TA1.pay_schd_dt.between(S1MA2.st_dt, S1MA2.end_dt))
							)
							.leftOuterJoin(S1MA3).on(
								S1TA1.ap_dpt_cd.eq(S1MA3.dpt_cd)
								.and(S1TA2.reg_dt.between(S1MA3.st_dt, S1MA3.end_dt))
							)
							.leftOuterJoin(S1MA4).on(
								S1TA1.so_dpt_cd.eq(S1MA4.dpt_cd)
								.and(S1TA1.pay_schd_dt.between(S1MA4.st_dt, S1MA4.end_dt))
							)
							.leftOuterJoin(S1MA5).on(S1TA1.ap_sttl_cd.eq(S1MA5.sttl_cd))
							.leftOuterJoin(S1MA6).on(S1TA2.bsppl_cd.eq(S1MA6.bp_cd))
							.innerJoin(S1DA1).on(S1TA2.bsppl_dpt_cd.eq(S1DA1.dpt_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(
								bracket(
									bind("tmp_aprv_flg").eq(value(true))
									.and(S1TA2.aprv_flg.eq(value(false)))
								)
								.cutoff$or(
									bracket(
										S1TA2.aprv_flg.eq(value(true))
										.and(S1TA2.aprv_sts_typ.like(bind("tmp_aprv_sts_typ")))
									)
								)
							)
							.cutoff$and(S1TA1.pay_schd_dt.gte(bind("pay_schd_act_dt_fr")))
							.cutoff$and(S1TA1.pay_schd_dt.lte(bind("pay_schd_act_dt_to")))
							.cutoff$and(S1TA2.bsppl_cd.like(bind("bsppl_cd")))
							.cutoff$and(S1TA2.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
							.cutoff$and(S1MA1.dpt_nm.like(bind("bsppl_dpt_nm")))
							.cutoff$and(S1MA1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1TA2.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1TA2.pay_chk_no.like(bind("pay_chk_no")))
							.cutoff$and(S1TA2.rcpt_iv_no.like(bind("rcpt_iv_no")))
							.cutoff$and(S1TA2.rcpt_iv_mng_no.like(bind("rcpt_iv_mng_no")))
							.cutoff$and(S1TA2.purc_act_no.like(bind("purc_act_no")))
							.cutoff$and(S1TA2.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1TA1.ap_typ.like(bind("ap_typ")))
							.cutoff$and(S1MA6.psppl_cd.like(bind("psppl_cd")))
							.cutoff$and(S1TA1.pay_sts_typ.neq(bind("tmp_pay_sts_typ")))
							.cutoff$and(S1TA1.pay_schd_print_rmrks.like(bind("pay_schd_print_rmrks")))
							.cutoff$and(S1TA1.trd_d_rmrks.like(bind("trd_d_rmrks")))
							.cutoff$and(S1TA1.intr_rmrks.like(bind("intr_rmrks")))
							.cutoff$and(S1TA1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1TA1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1TA1.sub_char3.like(bind("sub_char3")))
						).view(S0V1)
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(addDynamicOrderBy(ORDERBY))
					)
					.setDynamicSQLInfo(
						when(boundOr("bsppl_nm", "bsppl_grp_flg1", "bsppl_grp_flg2", "bsppl_grp_flg3", "bsppl_grp_flg4", "bsppl_grp_flg5", "bsppl_grp_flg6", "bsppl_grp_flg7", "bsppl_grp_flg8", "bsppl_grp_flg9", "bsppl_grp_flg10"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0V1.pr(S1TA2.bsppl_cd))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_nm.like(bind("bsppl_nm")))),
						when(boundOr("bsppl_grp_flg1"))
							.select(DS0D, S0_BSPPL.bp_grp_cd1.as("bsppl_grp_cd1"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd1),
						when(boundOr("bsppl_grp_flg1", "bsppl_grp_cd1"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd1.like(bind("bsppl_grp_cd1")))),
						when(boundOr("bsppl_grp_flg1"))
							.select(DS0D, S0_BSPPL_GRP1.bp_grp_nm.as("bsppl_grp_nm1"))
							.groupBy(DS0D, S0_BSPPL_GRP1.bp_grp_nm),
						when(boundOr("bsppl_grp_flg1", "bsppl_grp_nm1"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP1).on(S0_BSPPL.bp_grp_cd1.eq(S0_BSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BSPPL_GRP1.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP1.bp_grp_nm.like(bind("bsppl_grp_nm1")))),
						when(boundOr("bsppl_grp_flg2"))
							.select(DS0D, S0_BSPPL.bp_grp_cd2.as("bsppl_grp_cd2"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd2),
						when(boundOr("bsppl_grp_flg2", "bsppl_grp_cd2"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd2.like(bind("bsppl_grp_cd2")))),
						when(boundOr("bsppl_grp_flg2"))
							.select(DS0D, S0_BSPPL_GRP2.bp_grp_nm.as("bsppl_grp_nm2"))
							.groupBy(DS0D, S0_BSPPL_GRP2.bp_grp_nm),
						when(boundOr("bsppl_grp_flg2", "bsppl_grp_nm2"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP2).on(S0_BSPPL.bp_grp_cd2.eq(S0_BSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BSPPL_GRP2.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP2.bp_grp_nm.like(bind("bsppl_grp_nm2")))),
						when(boundOr("bsppl_grp_flg3"))
							.select(DS0D, S0_BSPPL.bp_grp_cd3.as("bsppl_grp_cd3"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd3),
						when(boundOr("bsppl_grp_flg3", "bsppl_grp_cd3"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd3.like(bind("bsppl_grp_cd3")))),
						when(boundOr("bsppl_grp_flg3"))
							.select(DS0D, S0_BSPPL_GRP3.bp_grp_nm.as("bsppl_grp_nm3"))
							.groupBy(DS0D, S0_BSPPL_GRP3.bp_grp_nm),
						when(boundOr("bsppl_grp_flg3", "bsppl_grp_nm3"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP3).on(S0_BSPPL.bp_grp_cd3.eq(S0_BSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BSPPL_GRP3.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP3.bp_grp_nm.like(bind("bsppl_grp_nm3")))),
						when(boundOr("bsppl_grp_flg4"))
							.select(DS0D, S0_BSPPL.bp_grp_cd4.as("bsppl_grp_cd4"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd4),
						when(boundOr("bsppl_grp_flg4", "bsppl_grp_cd4"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd4.like(bind("bsppl_grp_cd4")))),
						when(boundOr("bsppl_grp_flg4"))
							.select(DS0D, S0_BSPPL_GRP4.bp_grp_nm.as("bsppl_grp_nm4"))
							.groupBy(DS0D, S0_BSPPL_GRP4.bp_grp_nm),
						when(boundOr("bsppl_grp_flg4", "bsppl_grp_nm4"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP4).on(S0_BSPPL.bp_grp_cd4.eq(S0_BSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BSPPL_GRP4.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP4.bp_grp_nm.like(bind("bsppl_grp_nm4")))),
						when(boundOr("bsppl_grp_flg5"))
							.select(DS0D, S0_BSPPL.bp_grp_cd5.as("bsppl_grp_cd5"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd5),
						when(boundOr("bsppl_grp_flg5", "bsppl_grp_cd5"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd5.like(bind("bsppl_grp_cd5")))),
						when(boundOr("bsppl_grp_flg5"))
							.select(DS0D, S0_BSPPL_GRP5.bp_grp_nm.as("bsppl_grp_nm5"))
							.groupBy(DS0D, S0_BSPPL_GRP5.bp_grp_nm),
						when(boundOr("bsppl_grp_flg5", "bsppl_grp_nm5"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP5).on(S0_BSPPL.bp_grp_cd5.eq(S0_BSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BSPPL_GRP5.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP5.bp_grp_nm.like(bind("bsppl_grp_nm5")))),
						when(boundOr("bsppl_grp_flg6"))
							.select(DS0D, S0_BSPPL.bp_grp_cd6.as("bsppl_grp_cd6"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd6),
						when(boundOr("bsppl_grp_flg6", "bsppl_grp_cd6"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd6.like(bind("bsppl_grp_cd6")))),
						when(boundOr("bsppl_grp_flg6"))
							.select(DS0D, S0_BSPPL_GRP6.bp_grp_nm.as("bsppl_grp_nm6"))
							.groupBy(DS0D, S0_BSPPL_GRP6.bp_grp_nm),
						when(boundOr("bsppl_grp_flg6", "bsppl_grp_nm6"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP6).on(S0_BSPPL.bp_grp_cd6.eq(S0_BSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BSPPL_GRP6.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP6.bp_grp_nm.like(bind("bsppl_grp_nm6")))),
						when(boundOr("bsppl_grp_flg7"))
							.select(DS0D, S0_BSPPL.bp_grp_cd7.as("bsppl_grp_cd7"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd7),
						when(boundOr("bsppl_grp_flg7", "bsppl_grp_cd7"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd7.like(bind("bsppl_grp_cd7")))),
						when(boundOr("bsppl_grp_flg7"))
							.select(DS0D, S0_BSPPL_GRP7.bp_grp_nm.as("bsppl_grp_nm7"))
							.groupBy(DS0D, S0_BSPPL_GRP7.bp_grp_nm),
						when(boundOr("bsppl_grp_flg7", "bsppl_grp_nm7"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP7).on(S0_BSPPL.bp_grp_cd7.eq(S0_BSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BSPPL_GRP7.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP7.bp_grp_nm.like(bind("bsppl_grp_nm7")))),
						when(boundOr("bsppl_grp_flg8"))
							.select(DS0D, S0_BSPPL.bp_grp_cd8.as("bsppl_grp_cd8"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd8),
						when(boundOr("bsppl_grp_flg8", "bsppl_grp_cd8"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd8.like(bind("bsppl_grp_cd8")))),
						when(boundOr("bsppl_grp_flg8"))
							.select(DS0D, S0_BSPPL_GRP8.bp_grp_nm.as("bsppl_grp_nm8"))
							.groupBy(DS0D, S0_BSPPL_GRP8.bp_grp_nm),
						when(boundOr("bsppl_grp_flg8", "bsppl_grp_nm8"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP8).on(S0_BSPPL.bp_grp_cd8.eq(S0_BSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BSPPL_GRP8.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP8.bp_grp_nm.like(bind("bsppl_grp_nm8")))),
						when(boundOr("bsppl_grp_flg9"))
							.select(DS0D, S0_BSPPL.bp_grp_cd9.as("bsppl_grp_cd9"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd9),
						when(boundOr("bsppl_grp_flg9", "bsppl_grp_cd9"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd9.like(bind("bsppl_grp_cd9")))),
						when(boundOr("bsppl_grp_flg9"))
							.select(DS0D, S0_BSPPL_GRP9.bp_grp_nm.as("bsppl_grp_nm9"))
							.groupBy(DS0D, S0_BSPPL_GRP9.bp_grp_nm),
						when(boundOr("bsppl_grp_flg9", "bsppl_grp_nm9"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP9).on(S0_BSPPL.bp_grp_cd9.eq(S0_BSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BSPPL_GRP9.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP9.bp_grp_nm.like(bind("bsppl_grp_nm9")))),
						when(boundOr("bsppl_grp_flg10"))
							.select(DS0D, S0_BSPPL.bp_grp_cd10.as("bsppl_grp_cd10"))
							.groupBy(DS0D, S0_BSPPL.bp_grp_cd10),
						when(boundOr("bsppl_grp_flg10", "bsppl_grp_cd10"))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL.bp_grp_cd10.like(bind("bsppl_grp_cd10")))),
						when(boundOr("bsppl_grp_flg10"))
							.select(DS0D, S0_BSPPL_GRP10.bp_grp_nm.as("bsppl_grp_nm10"))
							.groupBy(DS0D, S0_BSPPL_GRP10.bp_grp_nm),
						when(boundOr("bsppl_grp_flg10", "bsppl_grp_nm10"))
							.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_GRP10).on(S0_BSPPL.bp_grp_cd10.eq(S0_BSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BSPPL_GRP10.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_GRP10.bp_grp_nm.like(bind("bsppl_grp_nm10")))),
						when(boundOr("psppl_nm", "psppl_grp_flg1", "psppl_grp_flg2", "psppl_grp_flg3", "psppl_grp_flg4", "psppl_grp_flg5", "psppl_grp_flg6", "psppl_grp_flg7", "psppl_grp_flg8", "psppl_grp_flg9", "psppl_grp_flg10"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL).on(S0_PSPPL.bp_cd.eq(S0V1.pr(S1MA6.psppl_cd))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_nm.like(bind("psppl_nm")))),
						when(boundOr("psppl_grp_flg1"))
							.select(DS0D, S0_PSPPL.bp_grp_cd1.as("psppl_grp_cd1"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd1),
						when(boundOr("psppl_grp_flg1", "psppl_grp_cd1"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd1.like(bind("psppl_grp_cd1")))),
						when(boundOr("psppl_grp_flg1"))
							.select(DS0D, S0_PSPPL_GRP1.bp_grp_nm.as("psppl_grp_nm1"))
							.groupBy(DS0D, S0_PSPPL_GRP1.bp_grp_nm),
						when(boundOr("psppl_grp_flg1", "psppl_grp_nm1"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP1).on(S0_PSPPL.bp_grp_cd1.eq(S0_PSPPL_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_PSPPL_GRP1.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP1.bp_grp_nm.like(bind("psppl_grp_nm1")))),
						when(boundOr("psppl_grp_flg2"))
							.select(DS0D, S0_PSPPL.bp_grp_cd2.as("psppl_grp_cd2"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd2),
						when(boundOr("psppl_grp_flg2", "psppl_grp_cd2"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd2.like(bind("psppl_grp_cd2")))),
						when(boundOr("psppl_grp_flg2"))
							.select(DS0D, S0_PSPPL_GRP2.bp_grp_nm.as("psppl_grp_nm2"))
							.groupBy(DS0D, S0_PSPPL_GRP2.bp_grp_nm),
						when(boundOr("psppl_grp_flg2", "psppl_grp_nm2"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP2).on(S0_PSPPL.bp_grp_cd2.eq(S0_PSPPL_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_PSPPL_GRP2.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP2.bp_grp_nm.like(bind("psppl_grp_nm2")))),
						when(boundOr("psppl_grp_flg3"))
							.select(DS0D, S0_PSPPL.bp_grp_cd3.as("psppl_grp_cd3"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd3),
						when(boundOr("psppl_grp_flg3", "psppl_grp_cd3"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd3.like(bind("psppl_grp_cd3")))),
						when(boundOr("psppl_grp_flg3"))
							.select(DS0D, S0_PSPPL_GRP3.bp_grp_nm.as("psppl_grp_nm3"))
							.groupBy(DS0D, S0_PSPPL_GRP3.bp_grp_nm),
						when(boundOr("psppl_grp_flg3", "psppl_grp_nm3"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP3).on(S0_PSPPL.bp_grp_cd3.eq(S0_PSPPL_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_PSPPL_GRP3.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP3.bp_grp_nm.like(bind("psppl_grp_nm3")))),
						when(boundOr("psppl_grp_flg4"))
							.select(DS0D, S0_PSPPL.bp_grp_cd4.as("psppl_grp_cd4"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd4),
						when(boundOr("psppl_grp_flg4", "psppl_grp_cd4"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd4.like(bind("psppl_grp_cd4")))),
						when(boundOr("psppl_grp_flg4"))
							.select(DS0D, S0_PSPPL_GRP4.bp_grp_nm.as("psppl_grp_nm4"))
							.groupBy(DS0D, S0_PSPPL_GRP4.bp_grp_nm),
						when(boundOr("psppl_grp_flg4", "psppl_grp_nm4"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP4).on(S0_PSPPL.bp_grp_cd4.eq(S0_PSPPL_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_PSPPL_GRP4.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP4.bp_grp_nm.like(bind("psppl_grp_nm4")))),
						when(boundOr("psppl_grp_flg5"))
							.select(DS0D, S0_PSPPL.bp_grp_cd5.as("psppl_grp_cd5"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd5),
						when(boundOr("psppl_grp_flg5", "psppl_grp_cd5"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd5.like(bind("psppl_grp_cd5")))),
						when(boundOr("psppl_grp_flg5"))
							.select(DS0D, S0_PSPPL_GRP5.bp_grp_nm.as("psppl_grp_nm5"))
							.groupBy(DS0D, S0_PSPPL_GRP5.bp_grp_nm),
						when(boundOr("psppl_grp_flg5", "psppl_grp_nm5"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP5).on(S0_PSPPL.bp_grp_cd5.eq(S0_PSPPL_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_PSPPL_GRP5.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP5.bp_grp_nm.like(bind("psppl_grp_nm5")))),
						when(boundOr("psppl_grp_flg6"))
							.select(DS0D, S0_PSPPL.bp_grp_cd6.as("psppl_grp_cd6"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd6),
						when(boundOr("psppl_grp_flg6", "psppl_grp_cd6"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd6.like(bind("psppl_grp_cd6")))),
						when(boundOr("psppl_grp_flg6"))
							.select(DS0D, S0_PSPPL_GRP6.bp_grp_nm.as("psppl_grp_nm6"))
							.groupBy(DS0D, S0_PSPPL_GRP6.bp_grp_nm),
						when(boundOr("psppl_grp_flg6", "psppl_grp_nm6"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP6).on(S0_PSPPL.bp_grp_cd6.eq(S0_PSPPL_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_PSPPL_GRP6.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP6.bp_grp_nm.like(bind("psppl_grp_nm6")))),
						when(boundOr("psppl_grp_flg7"))
							.select(DS0D, S0_PSPPL.bp_grp_cd7.as("psppl_grp_cd7"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd7),
						when(boundOr("psppl_grp_flg7", "psppl_grp_cd7"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd7.like(bind("psppl_grp_cd7")))),
						when(boundOr("psppl_grp_flg7"))
							.select(DS0D, S0_PSPPL_GRP7.bp_grp_nm.as("psppl_grp_nm7"))
							.groupBy(DS0D, S0_PSPPL_GRP7.bp_grp_nm),
						when(boundOr("psppl_grp_flg7", "psppl_grp_nm7"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP7).on(S0_PSPPL.bp_grp_cd7.eq(S0_PSPPL_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_PSPPL_GRP7.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP7.bp_grp_nm.like(bind("psppl_grp_nm7")))),
						when(boundOr("psppl_grp_flg8"))
							.select(DS0D, S0_PSPPL.bp_grp_cd8.as("psppl_grp_cd8"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd8),
						when(boundOr("psppl_grp_flg8", "psppl_grp_cd8"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd8.like(bind("psppl_grp_cd8")))),
						when(boundOr("psppl_grp_flg8"))
							.select(DS0D, S0_PSPPL_GRP8.bp_grp_nm.as("psppl_grp_nm8"))
							.groupBy(DS0D, S0_PSPPL_GRP8.bp_grp_nm),
						when(boundOr("psppl_grp_flg8", "psppl_grp_nm8"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP8).on(S0_PSPPL.bp_grp_cd8.eq(S0_PSPPL_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_PSPPL_GRP8.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP8.bp_grp_nm.like(bind("psppl_grp_nm8")))),
						when(boundOr("psppl_grp_flg9"))
							.select(DS0D, S0_PSPPL.bp_grp_cd9.as("psppl_grp_cd9"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd9),
						when(boundOr("psppl_grp_flg9", "psppl_grp_cd9"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd9.like(bind("psppl_grp_cd9")))),
						when(boundOr("psppl_grp_flg9"))
							.select(DS0D, S0_PSPPL_GRP9.bp_grp_nm.as("psppl_grp_nm9"))
							.groupBy(DS0D, S0_PSPPL_GRP9.bp_grp_nm),
						when(boundOr("psppl_grp_flg9", "psppl_grp_nm9"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP9).on(S0_PSPPL.bp_grp_cd9.eq(S0_PSPPL_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_PSPPL_GRP9.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP9.bp_grp_nm.like(bind("psppl_grp_nm9")))),
						when(boundOr("psppl_grp_flg10"))
							.select(DS0D, S0_PSPPL.bp_grp_cd10.as("psppl_grp_cd10"))
							.groupBy(DS0D, S0_PSPPL.bp_grp_cd10),
						when(boundOr("psppl_grp_flg10", "psppl_grp_cd10"))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL.bp_grp_cd10.like(bind("psppl_grp_cd10")))),
						when(boundOr("psppl_grp_flg10"))
							.select(DS0D, S0_PSPPL_GRP10.bp_grp_nm.as("psppl_grp_nm10"))
							.groupBy(DS0D, S0_PSPPL_GRP10.bp_grp_nm),
						when(boundOr("psppl_grp_flg10", "psppl_grp_nm10"))
							.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL_GRP10).on(S0_PSPPL.bp_grp_cd10.eq(S0_PSPPL_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_PSPPL_GRP10.bp_grp_typ))))
							.predicate(DS0D, p -> p.cutoff$and(S0_PSPPL_GRP10.bp_grp_nm.like(bind("psppl_grp_nm10")))),
						when(boundOr("wg_nm"))
							.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0V1.pr(S1MA1.wg_cd))))
							.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
						when(boundOr("trd_cur_nm"))
							.view(DS0D, v -> v.leftOuterJoin(S0_TRD_CUR).on(S0_TRD_CUR.cur_cd.eq(S0V1.pr(S1TA2.trd_cur_cd))))
							.predicate(DS0D, p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
						when(boundOr("wrk_nm"))
							.view(DS0D, v -> v.leftOuterJoin(S0_WRK).on(S0_WRK.wrk_no.eq(S0V1.pr(S1TA2.wrk_no))))
							.predicate(DS0D, p -> p.cutoff$and(S0_WRK.wrk_nm.like(bind("wrk_nm"))))
			);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBHL0050_Srch01_RsltR_J01() {
		return joinInfo(
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
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
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
				.add(MAM_BP_R.class, r -> toCondition(
					r.psppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.pay_dpt_cd(), r.base_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.pay_dpt_nm(m.dpt_nm());
				})
		);
	}
	
	static MCJoinerList<Srch02_RsltR> MSBHL0050_Srch02_RsltR_J01() {
		return joinInfo(
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
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
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
				.add(MAM_BANK_AC_R.class, r -> toCondition(
					r.pay_bank_ac_cd()
				))
				.addSelect(m -> toArray(
					m.bank_ac_nm
				))
				.addMap((r, m) -> {
					r.pay_bank_ac_nm(m.bank_ac_nm());
				}),
			j -> j
				.add(MAM_BANK_AC_R.class, r -> toCondition(
					r.bank_ac_cd()
				))
				.addSelect(m -> toArray(
					m.bank_ac_nm
				))
				.addMap((r, m) -> {
					r.bank_ac_nm(m.bank_ac_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.setoff_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.setoff_nm_bp(m.bp_nm());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.com_paid_tax_cd()
				))
				.addSelect(m -> toArray(
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.com_paid_tax_nm(m.tax_nm());
					r.com_paid_tax_rate(m.tax_rate());
				}),
			j -> j
				.add(MAM_NOTE_RSN_R.class, r -> toCondition(
					r.note_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.note_rsn_nm
				))
				.addMap((r, m) -> {
					r.note_rsn_nm(m.note_rsn_nm());
				}),
			j -> j
				.add(MAM_BANK_R.class, r -> toCondition(
					r.draw_bank_cd()
				))
				.addSelect(m -> toArray(
					m.bank_nm
				))
				.addMap((r, m) -> {
					r.draw_bank_nm(m.bank_nm());
				}),
			j -> j
				.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
					r.draw_bank_cd(), r.draw_branch_cd()
				))
				.addSelect(m -> toArray(
					m.branch_nm
				))
				.addMap((r, m) -> {
					r.draw_branch_nm(m.branch_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.psppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
				})
		);
	}
}