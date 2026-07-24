package mcframe.serverMSBG.MSBGL0010;

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
	 * -- MSBGL0010_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S01() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_DPT_R S0_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S0_MA2 = MAM_WG_R.create("MA2");
		MAVM_RD_DPT_R S0_MA3 = MAVM_RD_DPT_R.create("MA3");
		MCTempView S1_VB1 = createTempView("VB1");
		MST_BILL_R S1_TB1 = MST_BILL_R.create("TB1");
		MST_BILL_R S2_TC1 = MST_BILL_R.create("TC1");
		MST_WRK_R S2_TC2 = MST_WRK_R.create("TC2");
		MAM_BP_R S2_MC1 = MAM_BP_R.create("MC1");
		MAM_CUR_R S2_MC2 = MAM_CUR_R.create("MC2");
		MST_BILL_D_R S3_TD1 = MST_BILL_D_R.create("TD1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_TB1.bill_no),
						S0_VA1.pr(S1_TB1.bcst_cd),
						S0_VA1.pr("bcst_nm"),
						S0_VA1.pr(S1_TB1.bill_dpt_cd),
						S0_VA1.pr(S1_TB1.iv_no),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						S0_VA1.pr("trd_cur_nm"),
						MAPA_XCHNG$F_GET_XRATE_NE(
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							bind("base_cur_cd"),
							bind("bill_xrate_cd"),
							bind("base_dt")
						).as("bill_xrate"),
						S0_VA1.pr(S1_TB1.wrk_no),
						S0_VA1.pr(S2_TC2.wrk_nm),
						S0_VA1.pr(S2_MC1.tax_on_bill_flg),
						S0_VA1.pr(S1_TB1.ins_usr_id),
						S0_VA1.pr(S1_TB1.ins_usr_nm),
						S0_VA1.pr(S1_TB1.ins_func_id),
						S0_VA1.pr(S1_TB1.ins_ts),
						S0_VA1.pr(S1_TB1.upd_usr_id),
						S0_VA1.pr(S1_TB1.upd_usr_nm),
						S0_VA1.pr(S1_TB1.upd_func_id),
						S0_VA1.pr(S1_TB1.upd_ts),
						S0_VA1.pr(S1_TB1.upd_srv_req_no),
						S0_VA1.pr(S1_TB1.upd_cntr),
						S0_VA1.pr(S1_TB1.bill_mng_no),
						S0_VA1.pr(S1_TB1.bill_cl_dt),
						S0_MA1.dpt_nm.as("bill_dpt_nm"),
						S0_MA1.wg_cd,
						S0_MA2.wg_nm,
						bind("bill_ym").as("bill_ym"),
						bind("bill_cl_day").as("bill_cl_day"),
						MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(
							S0_VA1.pr(S1_TB1.bcst_cd),
							S0_VA1.pr(S1_TB1.bill_dpt_cd),
							S0_VA1.pr(S1_TB1.iv_no),
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							S0_VA1.pr(S1_TB1.wrk_no)
						).as("last_bill_cl_dt"),
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg"),
						value(MAC_BILL_CL_TYP.BATCH.value()).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.bill_no,
							S1_TB1.bcst_cd,
							S1_VB1.pr("bcst_nm"),
							S1_TB1.bill_dpt_cd,
							S1_TB1.iv_no,
							S1_TB1.trd_cur_cd,
							S1_VB1.pr("trd_cur_nm"),
							S1_TB1.wrk_no,
							S1_VB1.pr(S2_TC2.wrk_nm),
							S1_VB1.pr(S2_MC1.tax_on_bill_flg),
							S1_TB1.ins_usr_id,
							S1_TB1.ins_usr_nm,
							S1_TB1.ins_func_id,
							S1_TB1.ins_ts,
							S1_TB1.upd_usr_id,
							S1_TB1.upd_usr_nm,
							S1_TB1.upd_func_id,
							S1_TB1.upd_ts,
							S1_TB1.upd_srv_req_no,
							S1_TB1.upd_cntr,
							S1_TB1.bill_mng_no,
							S1_TB1.bill_cl_dt,
							S1_TB1.base_dt
						)
						.from(
							subQuery()
							.select(
								S2_TC1.bcst_cd,
								min(S2_TC1.bill_cl_dt).as("bill_cl_dt"),
								S2_MC1.bp_nm.as("bcst_nm"),
								S2_TC1.bill_dpt_cd,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm.as("trd_cur_nm"),
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							)
							.from(
								S2_TC1
								.leftOuterJoin(S2_TC2).on(
									bracket(
										S2_TC1.wrk_no.eq(S2_TC2.wrk_no)
									)
								)
								.leftOuterJoin(S2_MC1).on(
									bracket(
										S2_TC1.bcst_cd.eq(S2_MC1.bp_cd)
									)
								)
								.leftOuterJoin(S2_MC2).on(
									bracket(
										S2_TC1.trd_cur_cd.eq(S2_MC2.cur_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S2_TC1.bill_cl_sts_typ))
								.and(value(MAC_BILL_CL_TYP.BATCH.value()).eq(S2_MC1.bill_cl_typ))
								.and(S2_MC1.del_flg.eq(value(false)))
								.cutoff$and(S2_TC1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S2_MC1.bp_nm.like(bind("bcst_nm")))
								.cutoff$and(S2_TC1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MC2.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TC1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TC2.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(
									bind("bill_cl_day").in(
										S2_MC1.bill_cl_day1,
										S2_MC1.bill_cl_day2,
										S2_MC1.bill_cl_day3,
										S2_MC1.bill_cl_day4,
										S2_MC1.bill_cl_day5
									)
								)
								.and(
									value(0).eq(value(1))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_TD1)
											.where(
												value(0).eq(value(0))
												.and(S3_TD1.bill_mng_no.eq(S2_TC1.bill_mng_no))
												.cutoff$and(
													MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(
														S2_TC1.bcst_cd,
														S3_TD1.bill_basis_dt,
														S3_TD1.bill_crryovr_times,
														bind("bill_ym"),
														bind("bill_cl_day")
													).eq(value(true))
												)
											)
										)
									)
									.or(
										MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(
											S2_TC1.bcst_cd,
											MSPA_AR_UTIL$F_GET_BCST_DPT(
												S2_TC1.bcst_cd,
												S2_TC1.base_dt,
												S2_TC1.bill_dpt_cd,
												S2_TC1.bill_dpt_cd
											),
											S2_TC1.iv_no,
											S2_TC1.trd_cur_cd,
											S2_TC1.wrk_no
										).neq(value(0))
									)
								)
							)
							.groupBy(
								S2_TC1.bcst_cd,
								S2_TC1.bill_dpt_cd,
								S2_MC1.bp_nm,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm,
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							).view(S1_VB1)
							.innerJoin(S1_TB1).on(
								bracket(
									S1_TB1.bcst_cd.eq(S1_VB1.pr(S2_TC1.bcst_cd))
									.and(S1_TB1.bill_cl_dt.eq(S1_VB1.pr("bill_cl_dt")))
									.and(S1_TB1.bill_dpt_cd.eq(S1_VB1.pr(S2_TC1.bill_dpt_cd)))
									.and(S1_TB1.trd_cur_cd.eq(S1_VB1.pr(S2_TC1.trd_cur_cd)))
									.and(S1_TB1.iv_no.eq(S1_VB1.pr(S2_TC1.iv_no)))
									.and(
										S1_TB1.wrk_no.eq(S1_VB1.pr(S2_TC1.wrk_no))
										.or(S1_TB1.wrk_no.isNull())
										.and(S1_VB1.pr(S2_TC1.wrk_no).isNull())
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S1_TB1.bill_cl_sts_typ))
						).view(S0_VA1)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_MA1.dpt_cd.eq(S0_VA1.pr(S1_TB1.bill_dpt_cd))
								.and(S0_VA1.pr(S1_TB1.base_dt).between(S0_MA1.st_dt, S0_MA1.end_dt))
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA1.wg_cd.eq(S0_MA2.wg_cd)
							)
						)
						.innerJoin(S0_MA3).on(
							bracket(
								S0_VA1.pr(S1_TB1.bill_dpt_cd).eq(S0_MA3.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_VA1.pr(S1_TB1.bcst_cd).eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_VA1.pr(S1_TB1.base_dt).between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_VA1.pr(S1_TB1.bill_dpt_cd).like(bind("bill_dpt_cd")))
						.cutoff$and(S0_MA1.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA2.wg_nm.like(bind("wg_nm")))
						.and(
								bracket(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
			);
	}
	
	/**
	 * -- MSBGL0010_MST_BILL_Query_S02
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S02() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_DPT_R S0_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S0_MA2 = MAM_WG_R.create("MA2");
		MAVM_RD_DPT_R S0_MA3 = MAVM_RD_DPT_R.create("MA3");
		MCTempView S1_VB1 = createTempView("VB1");
		MST_BILL_R S1_TB1 = MST_BILL_R.create("TB1");
		MST_BILL_R S2_TC1 = MST_BILL_R.create("TC1");
		MST_WRK_R S2_TC2 = MST_WRK_R.create("TC2");
		MAM_BP_R S2_MC1 = MAM_BP_R.create("MC1");
		MAM_CUR_R S2_MC2 = MAM_CUR_R.create("MC2");
		MST_BILL_D_R S3_TD1 = MST_BILL_D_R.create("TD1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S02")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_TB1.bill_no),
						S0_VA1.pr(S1_TB1.bcst_cd),
						S0_VA1.pr("bcst_nm"),
						S0_VA1.pr(S1_TB1.bill_dpt_cd),
						S0_VA1.pr(S1_TB1.iv_no),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						S0_VA1.pr("trd_cur_nm"),
						MAPA_XCHNG$F_GET_XRATE_NE(
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							bind("base_cur_cd"),
							bind("bill_xrate_cd"),
							bind("base_dt")
						).as("bill_xrate"),
						S0_VA1.pr(S1_TB1.wrk_no),
						S0_VA1.pr(S2_TC2.wrk_nm),
						S0_VA1.pr(S2_MC1.tax_on_bill_flg),
						S0_VA1.pr(S1_TB1.ins_usr_id),
						S0_VA1.pr(S1_TB1.ins_usr_nm),
						S0_VA1.pr(S1_TB1.ins_func_id),
						S0_VA1.pr(S1_TB1.ins_ts),
						S0_VA1.pr(S1_TB1.upd_usr_id),
						S0_VA1.pr(S1_TB1.upd_usr_nm),
						S0_VA1.pr(S1_TB1.upd_func_id),
						S0_VA1.pr(S1_TB1.upd_ts),
						S0_VA1.pr(S1_TB1.upd_srv_req_no),
						S0_VA1.pr(S1_TB1.upd_cntr),
						S0_VA1.pr(S1_TB1.bill_mng_no),
						S0_VA1.pr(S1_TB1.bill_cl_dt),
						S0_MA1.dpt_nm.as("bill_dpt_nm"),
						S0_MA1.wg_cd,
						S0_MA2.wg_nm,
						bind("bill_ym").as("bill_ym"),
						bind("bill_cl_day").as("bill_cl_day"),
						MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(
							S0_VA1.pr(S1_TB1.bcst_cd),
							S0_VA1.pr(S1_TB1.bill_dpt_cd),
							S0_VA1.pr(S1_TB1.iv_no),
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							S0_VA1.pr(S1_TB1.wrk_no)
						).as("last_bill_cl_dt"),
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg"),
						value(MAC_BILL_CL_TYP.MANUAL.value()).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.bill_no,
							S1_TB1.bcst_cd,
							S1_VB1.pr("bcst_nm"),
							S1_TB1.bill_dpt_cd,
							S1_TB1.iv_no,
							S1_TB1.trd_cur_cd,
							S1_VB1.pr("trd_cur_nm"),
							S1_TB1.wrk_no,
							S1_VB1.pr(S2_TC2.wrk_nm),
							S1_VB1.pr(S2_MC1.tax_on_bill_flg),
							S1_TB1.ins_usr_id,
							S1_TB1.ins_usr_nm,
							S1_TB1.ins_func_id,
							S1_TB1.ins_ts,
							S1_TB1.upd_usr_id,
							S1_TB1.upd_usr_nm,
							S1_TB1.upd_func_id,
							S1_TB1.upd_ts,
							S1_TB1.upd_srv_req_no,
							S1_TB1.upd_cntr,
							S1_TB1.bill_mng_no,
							S1_TB1.bill_cl_dt,
							S1_TB1.base_dt
						)
						.from(
							subQuery()
							.select(
								S2_TC1.bcst_cd,
								min(S2_TC1.bill_cl_dt).as("bill_cl_dt"),
								S2_MC1.bp_nm.as("bcst_nm"),
								S2_TC1.bill_dpt_cd,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm.as("trd_cur_nm"),
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							)
							.from(
								S2_TC1
								.leftOuterJoin(S2_TC2).on(
									bracket(
										S2_TC1.wrk_no.eq(S2_TC2.wrk_no)
									)
								)
								.leftOuterJoin(S2_MC1).on(
									bracket(
										S2_TC1.bcst_cd.eq(S2_MC1.bp_cd)
									)
								)
								.leftOuterJoin(S2_MC2).on(
									bracket(
										S2_TC1.trd_cur_cd.eq(S2_MC2.cur_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S2_TC1.bill_cl_sts_typ))
								.and(value(MAC_BILL_CL_TYP.MANUAL.value()).eq(S2_MC1.bill_cl_typ))
								.and(S2_MC1.del_flg.eq(value(false)))
								.cutoff$and(S2_TC1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S2_MC1.bp_nm.like(bind("bcst_nm")))
								.cutoff$and(S2_TC1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MC2.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TC1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TC2.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(
									bind("bill_cl_day").in(
										S2_MC1.bill_cl_day1,
										S2_MC1.bill_cl_day2,
										S2_MC1.bill_cl_day3,
										S2_MC1.bill_cl_day4,
										S2_MC1.bill_cl_day5
									)
								)
								.and(
									value(0).eq(value(1))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_TD1)
											.where(
												value(0).eq(value(0))
												.and(S3_TD1.bill_mng_no.eq(S2_TC1.bill_mng_no))
												.cutoff$and(
													MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(
														S2_TC1.bcst_cd,
														S3_TD1.bill_basis_dt,
														S3_TD1.bill_crryovr_times,
														bind("bill_ym"),
														bind("bill_cl_day")
													).eq(value(true))
												)
											)
										)
									)
									.or(
										MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(
											S2_TC1.bcst_cd,
											MSPA_AR_UTIL$F_GET_BCST_DPT(
												S2_TC1.bcst_cd,
												S2_TC1.base_dt,
												S2_TC1.bill_dpt_cd,
												S2_TC1.bill_dpt_cd
											),
											S2_TC1.iv_no,
											S2_TC1.trd_cur_cd,
											S2_TC1.wrk_no
										).neq(value(0))
									)
								)
							)
							.groupBy(
								S2_TC1.bcst_cd,
								S2_TC1.bill_dpt_cd,
								S2_MC1.bp_nm,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm,
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							).view(S1_VB1)
							.innerJoin(S1_TB1).on(
								bracket(
									S1_TB1.bcst_cd.eq(S1_VB1.pr(S2_TC1.bcst_cd))
									.and(S1_TB1.bill_cl_dt.eq(S1_VB1.pr("bill_cl_dt")))
									.and(S1_TB1.bill_dpt_cd.eq(S1_VB1.pr(S2_TC1.bill_dpt_cd)))
									.and(S1_TB1.trd_cur_cd.eq(S1_VB1.pr(S2_TC1.trd_cur_cd)))
									.and(S1_TB1.iv_no.eq(S1_VB1.pr(S2_TC1.iv_no)))
									.and(
										S1_TB1.wrk_no.eq(S1_VB1.pr(S2_TC1.wrk_no))
										.or(S1_TB1.wrk_no.isNull())
										.and(S1_VB1.pr(S2_TC1.wrk_no).isNull())
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S1_TB1.bill_cl_sts_typ))
						).view(S0_VA1)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_MA1.dpt_cd.eq(S0_VA1.pr(S1_TB1.bill_dpt_cd))
								.and(S0_VA1.pr(S1_TB1.base_dt).between(S0_MA1.st_dt, S0_MA1.end_dt))
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA1.wg_cd.eq(S0_MA2.wg_cd)
							)
						)
						.innerJoin(S0_MA3).on(
							bracket(
								S0_VA1.pr(S1_TB1.bill_dpt_cd).eq(S0_MA3.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_VA1.pr(S1_TB1.bcst_cd).eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_VA1.pr(S1_TB1.base_dt).between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_VA1.pr(S1_TB1.bill_dpt_cd).like(bind("bill_dpt_cd")))
						.cutoff$and(S0_MA1.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA2.wg_nm.like(bind("wg_nm")))
						.and(
								bracket(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
			);
	}
	
	/**
	 * -- MSBGL0010_MST_BILL_Query_S03
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S03() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_DPT_R S0_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S0_MA2 = MAM_WG_R.create("MA2");
		MAVM_RD_DPT_R S0_MA3 = MAVM_RD_DPT_R.create("MA3");
		MCTempView S1_VB1 = createTempView("VB1");
		MST_BILL_R S1_TB1 = MST_BILL_R.create("TB1");
		MST_BILL_R S2_TC1 = MST_BILL_R.create("TC1");
		MST_WRK_R S2_TC2 = MST_WRK_R.create("TC2");
		MAM_BP_R S2_MC1 = MAM_BP_R.create("MC1");
		MAM_CUR_R S2_MC2 = MAM_CUR_R.create("MC2");
		MST_BILL_D_R S3_TD1 = MST_BILL_D_R.create("TD1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S03")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_TB1.bill_no),
						S0_VA1.pr(S1_TB1.bcst_cd),
						S0_VA1.pr("bcst_nm"),
						S0_VA1.pr(S1_TB1.bill_dpt_cd),
						S0_VA1.pr(S1_TB1.iv_no),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						S0_VA1.pr("trd_cur_nm"),
						MAPA_XCHNG$F_GET_XRATE_NE(
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							bind("base_cur_cd"),
							bind("bill_xrate_cd"),
							bind("today")
						).as("bill_xrate"),
						S0_VA1.pr(S1_TB1.wrk_no),
						S0_VA1.pr(S2_TC2.wrk_nm),
						S0_VA1.pr(S2_MC1.tax_on_bill_flg),
						S0_VA1.pr(S1_TB1.ins_usr_id),
						S0_VA1.pr(S1_TB1.ins_usr_nm),
						S0_VA1.pr(S1_TB1.ins_func_id),
						S0_VA1.pr(S1_TB1.ins_ts),
						S0_VA1.pr(S1_TB1.upd_usr_id),
						S0_VA1.pr(S1_TB1.upd_usr_nm),
						S0_VA1.pr(S1_TB1.upd_func_id),
						S0_VA1.pr(S1_TB1.upd_ts),
						S0_VA1.pr(S1_TB1.upd_srv_req_no),
						S0_VA1.pr(S1_TB1.upd_cntr),
						S0_VA1.pr(S1_TB1.bill_mng_no),
						S0_VA1.pr(S1_TB1.bill_cl_dt),
						S0_MA1.dpt_nm.as("bill_dpt_nm"),
						S0_MA1.wg_cd,
						S0_MA2.wg_nm,
						bind("bill_ym").as("bill_ym"),
						MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(
							S0_VA1.pr(S1_TB1.bcst_cd),
							S0_VA1.pr(S1_TB1.bill_dpt_cd),
							S0_VA1.pr(S1_TB1.iv_no),
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							S0_VA1.pr(S1_TB1.wrk_no)
						).as("last_bill_cl_dt"),
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg"),
						value(MAC_BILL_CL_TYP.SEL.value()).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.bill_no,
							S1_TB1.bcst_cd,
							S1_VB1.pr("bcst_nm"),
							S1_TB1.bill_dpt_cd,
							S1_TB1.iv_no,
							S1_TB1.trd_cur_cd,
							S1_VB1.pr("trd_cur_nm"),
							S1_TB1.wrk_no,
							S1_VB1.pr(S2_TC2.wrk_nm),
							S1_VB1.pr(S2_MC1.tax_on_bill_flg),
							S1_TB1.ins_usr_id,
							S1_TB1.ins_usr_nm,
							S1_TB1.ins_func_id,
							S1_TB1.ins_ts,
							S1_TB1.upd_usr_id,
							S1_TB1.upd_usr_nm,
							S1_TB1.upd_func_id,
							S1_TB1.upd_ts,
							S1_TB1.upd_srv_req_no,
							S1_TB1.upd_cntr,
							S1_TB1.bill_mng_no,
							S1_TB1.bill_cl_dt,
							S1_TB1.base_dt
						)
						.from(
							subQuery()
							.select(
								S2_TC1.bcst_cd,
								min(S2_TC1.bill_cl_dt).as("bill_cl_dt"),
								S2_MC1.bp_nm.as("bcst_nm"),
								S2_TC1.bill_dpt_cd,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm.as("trd_cur_nm"),
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							)
							.from(
								S2_TC1
								.leftOuterJoin(S2_TC2).on(
									bracket(
										S2_TC1.wrk_no.eq(S2_TC2.wrk_no)
									)
								)
								.leftOuterJoin(S2_MC1).on(
									bracket(
										S2_TC1.bcst_cd.eq(S2_MC1.bp_cd)
									)
								)
								.leftOuterJoin(S2_MC2).on(
									bracket(
										S2_TC1.trd_cur_cd.eq(S2_MC2.cur_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S2_TC1.bill_cl_sts_typ))
								.and(value(MAC_BILL_CL_TYP.SEL.value()).eq(S2_MC1.bill_cl_typ))
								.and(S2_MC1.del_flg.eq(value(false)))
								.cutoff$and(S2_TC1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S2_MC1.bp_nm.like(bind("bcst_nm")))
								.cutoff$and(S2_TC1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MC2.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TC1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TC2.wrk_nm.like(bind("wrk_nm")))
								.and(
									value(0).eq(value(1))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_TD1)
											.where(
												value(0).eq(value(0))
												.and(S3_TD1.bill_mng_no.eq(S2_TC1.bill_mng_no))
											)
										)
									)
								)
							)
							.groupBy(
								S2_TC1.bcst_cd,
								S2_TC1.bill_dpt_cd,
								S2_MC1.bp_nm,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm,
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							).view(S1_VB1)
							.innerJoin(S1_TB1).on(
								bracket(
									S1_TB1.bcst_cd.eq(S1_VB1.pr(S2_TC1.bcst_cd))
									.and(S1_TB1.bill_cl_dt.eq(S1_VB1.pr("bill_cl_dt")))
									.and(S1_TB1.bill_dpt_cd.eq(S1_VB1.pr(S2_TC1.bill_dpt_cd)))
									.and(S1_TB1.trd_cur_cd.eq(S1_VB1.pr(S2_TC1.trd_cur_cd)))
									.and(S1_TB1.iv_no.eq(S1_VB1.pr(S2_TC1.iv_no)))
									.and(
										S1_TB1.wrk_no.eq(S1_VB1.pr(S2_TC1.wrk_no))
										.or(S1_TB1.wrk_no.isNull())
										.and(S1_VB1.pr(S2_TC1.wrk_no).isNull())
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S1_TB1.bill_cl_sts_typ))
						).view(S0_VA1)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_MA1.dpt_cd.eq(S0_VA1.pr(S1_TB1.bill_dpt_cd))
								.and(S0_VA1.pr(S1_TB1.base_dt).between(S0_MA1.st_dt, S0_MA1.end_dt))
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA1.wg_cd.eq(S0_MA2.wg_cd)
							)
						)
						.innerJoin(S0_MA3).on(
							bracket(
								S0_VA1.pr(S1_TB1.bill_dpt_cd).eq(S0_MA3.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_VA1.pr(S1_TB1.bcst_cd).eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_VA1.pr(S1_TB1.base_dt).between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_VA1.pr(S1_TB1.bill_dpt_cd).like(bind("bill_dpt_cd")))
						.cutoff$and(S0_MA1.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA2.wg_nm.like(bind("wg_nm")))
						.and(
								bracket(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
			);
	}
	
	/**
	 * -- MSBGL0010_MST_BILL_Query_S04
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S04() {
		MCTempView S0_VA1 = createTempView("VA1");
		MAM_DPT_R S0_MA1 = MAM_DPT_R.create("MA1");
		MAM_WG_R S0_MA2 = MAM_WG_R.create("MA2");
		MAVM_RD_DPT_R S0_MA3 = MAVM_RD_DPT_R.create("MA3");
		MCTempView S1_VB1 = createTempView("VB1");
		MST_BILL_R S1_TB1 = MST_BILL_R.create("TB1");
		MST_BILL_R S2_TC1 = MST_BILL_R.create("TC1");
		MST_WRK_R S2_TC2 = MST_WRK_R.create("TC2");
		MAM_BP_R S2_MC1 = MAM_BP_R.create("MC1");
		MAM_CUR_R S2_MC2 = MAM_CUR_R.create("MC2");
		MST_BILL_D_R S3_TD1 = MST_BILL_D_R.create("TD1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S04")
					.mainQuery()
					.select(
						S0_VA1.pr(S1_TB1.bill_no),
						S0_VA1.pr(S1_TB1.bcst_cd),
						S0_VA1.pr("bcst_nm"),
						S0_VA1.pr(S1_TB1.bill_dpt_cd),
						S0_VA1.pr(S1_TB1.iv_no),
						S0_VA1.pr(S1_TB1.trd_cur_cd),
						S0_VA1.pr("trd_cur_nm"),
						MAPA_XCHNG$F_GET_XRATE_NE(
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							bind("base_cur_cd"),
							bind("bill_xrate_cd"),
							bind("today")
						).as("bill_xrate"),
						S0_VA1.pr(S1_TB1.wrk_no),
						S0_VA1.pr(S2_TC2.wrk_nm),
						S0_VA1.pr(S2_MC1.tax_on_bill_flg),
						S0_VA1.pr(S1_TB1.ins_usr_id),
						S0_VA1.pr(S1_TB1.ins_usr_nm),
						S0_VA1.pr(S1_TB1.ins_func_id),
						S0_VA1.pr(S1_TB1.ins_ts),
						S0_VA1.pr(S1_TB1.upd_usr_id),
						S0_VA1.pr(S1_TB1.upd_usr_nm),
						S0_VA1.pr(S1_TB1.upd_func_id),
						S0_VA1.pr(S1_TB1.upd_ts),
						S0_VA1.pr(S1_TB1.upd_srv_req_no),
						S0_VA1.pr(S1_TB1.upd_cntr),
						S0_VA1.pr(S1_TB1.bill_mng_no),
						S0_VA1.pr(S1_TB1.bill_cl_dt),
						S0_MA1.dpt_nm.as("bill_dpt_nm"),
						S0_MA1.wg_cd,
						S0_MA2.wg_nm,
						bind("bill_ym").as("bill_ym"),
						MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(
							S0_VA1.pr(S1_TB1.bcst_cd),
							S0_VA1.pr(S1_TB1.bill_dpt_cd),
							S0_VA1.pr(S1_TB1.iv_no),
							S0_VA1.pr(S1_TB1.trd_cur_cd),
							S0_VA1.pr(S1_TB1.wrk_no)
						).as("last_bill_cl_dt"),
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg"),
						value(MAC_BILL_CL_TYP.EACH_SLS.value()).as("bill_cl_typ")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.bill_no,
							S1_TB1.bcst_cd,
							S1_VB1.pr("bcst_nm"),
							S1_TB1.bill_dpt_cd,
							S1_TB1.iv_no,
							S1_TB1.trd_cur_cd,
							S1_VB1.pr("trd_cur_nm"),
							S1_TB1.wrk_no,
							S1_VB1.pr(S2_TC2.wrk_nm),
							S1_VB1.pr(S2_MC1.tax_on_bill_flg),
							S1_TB1.ins_usr_id,
							S1_TB1.ins_usr_nm,
							S1_TB1.ins_func_id,
							S1_TB1.ins_ts,
							S1_TB1.upd_usr_id,
							S1_TB1.upd_usr_nm,
							S1_TB1.upd_func_id,
							S1_TB1.upd_ts,
							S1_TB1.upd_srv_req_no,
							S1_TB1.upd_cntr,
							S1_TB1.bill_mng_no,
							S1_TB1.bill_cl_dt,
							S1_TB1.base_dt
						)
						.from(
							subQuery()
							.select(
								S2_TC1.bcst_cd,
								min(S2_TC1.bill_cl_dt).as("bill_cl_dt"),
								S2_MC1.bp_nm.as("bcst_nm"),
								S2_TC1.bill_dpt_cd,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm.as("trd_cur_nm"),
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							)
							.from(
								S2_TC1
								.leftOuterJoin(S2_TC2).on(
									bracket(
										S2_TC1.wrk_no.eq(S2_TC2.wrk_no)
									)
								)
								.leftOuterJoin(S2_MC1).on(
									bracket(
										S2_TC1.bcst_cd.eq(S2_MC1.bp_cd)
									)
								)
								.leftOuterJoin(S2_MC2).on(
									bracket(
										S2_TC1.trd_cur_cd.eq(S2_MC2.cur_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S2_TC1.bill_cl_sts_typ))
								.and(value(MAC_BILL_CL_TYP.EACH_SLS.value()).eq(S2_MC1.bill_cl_typ))
								.and(S2_MC1.del_flg.eq(value(false)))
								.cutoff$and(S2_TC1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S2_MC1.bp_nm.like(bind("bcst_nm")))
								.cutoff$and(S2_TC1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S2_MC2.cur_nm.like(bind("trd_cur_nm")))
								.cutoff$and(S2_TC1.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_TC2.wrk_nm.like(bind("wrk_nm")))
								.and(
									value(0).eq(value(1))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_TD1)
											.where(
												value(0).eq(value(0))
												.and(S3_TD1.bill_mng_no.eq(S2_TC1.bill_mng_no))
												.cutoff$and(
													MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(
														S2_TC1.bcst_cd,
														S3_TD1.bill_basis_dt,
														S3_TD1.bill_crryovr_times,
														bind("bill_ym"),
														bind("bill_cl_day")
													).eq(value(true))
												)
											)
										)
									)
									.or(
										MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(
											S2_TC1.bcst_cd,
											MSPA_AR_UTIL$F_GET_BCST_DPT(
												S2_TC1.bcst_cd,
												S2_TC1.base_dt,
												S2_TC1.bill_dpt_cd,
												S2_TC1.bill_dpt_cd
											),
											S2_TC1.iv_no,
											S2_TC1.trd_cur_cd,
											S2_TC1.wrk_no
										).neq(value(0))
									)
								)
							)
							.groupBy(
								S2_TC1.bcst_cd,
								S2_TC1.bill_dpt_cd,
								S2_MC1.bp_nm,
								S2_TC1.iv_no,
								S2_TC1.trd_cur_cd,
								S2_MC2.cur_nm,
								S2_TC1.wrk_no,
								S2_TC2.wrk_nm,
								S2_MC1.tax_on_bill_flg
							).view(S1_VB1)
							.innerJoin(S1_TB1).on(
								bracket(
									S1_TB1.bcst_cd.eq(S1_VB1.pr(S2_TC1.bcst_cd))
									.and(S1_TB1.bill_cl_dt.eq(S1_VB1.pr("bill_cl_dt")))
									.and(S1_TB1.bill_dpt_cd.eq(S1_VB1.pr(S2_TC1.bill_dpt_cd)))
									.and(S1_TB1.trd_cur_cd.eq(S1_VB1.pr(S2_TC1.trd_cur_cd)))
									.and(S1_TB1.iv_no.eq(S1_VB1.pr(S2_TC1.iv_no)))
									.and(
										S1_TB1.wrk_no.eq(S1_VB1.pr(S2_TC1.wrk_no))
										.or(S1_TB1.wrk_no.isNull())
										.and(S1_VB1.pr(S2_TC1.wrk_no).isNull())
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(S1_TB1.bill_cl_sts_typ))
						).view(S0_VA1)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_MA1.dpt_cd.eq(S0_VA1.pr(S1_TB1.bill_dpt_cd))
								.and(S0_VA1.pr(S1_TB1.base_dt).between(S0_MA1.st_dt, S0_MA1.end_dt))
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA1.wg_cd.eq(S0_MA2.wg_cd)
							)
						)
						.innerJoin(S0_MA3).on(
							bracket(
								S0_VA1.pr(S1_TB1.bill_dpt_cd).eq(S0_MA3.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_VA1.pr(S1_TB1.bcst_cd).eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_VA1.pr(S1_TB1.base_dt).between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_VA1.pr(S1_TB1.bill_dpt_cd).like(bind("bill_dpt_cd")))
						.cutoff$and(S0_MA1.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA2.wg_nm.like(bind("wg_nm")))
						.and(
								bracket(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
			);
	}
	
	/**
	 * -- MSBGL0010_MST_BILL_Query_S05
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S05() {
		MST_BILL_R S0_TA1 = MST_BILL_R.create("TA1");
		MST_WRK_R S0_TA2 = MST_WRK_R.create("TA2");
		MAM_BP_R S0_MA1 = MAM_BP_R.create("MA1");
		MAM_DPT_R S0_MA2 = MAM_DPT_R.create("MA2");
		MAM_WG_R S0_MA3 = MAM_WG_R.create("MA3");
		MAM_CUR_R S0_MA4 = MAM_CUR_R.create("MA4");
		MAVM_RD_DPT_R S0_MA5 = MAVM_RD_DPT_R.create("MA5");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S05")
					.mainQuery()
					.select(
						S0_TA1.bill_no,
						S0_TA1.bcst_cd,
						S0_MA1.bp_nm.as("bcst_nm"),
						S0_MA3.wg_cd,
						S0_MA3.wg_nm,
						S0_TA1.bill_dpt_cd,
						S0_MA2.dpt_nm.as("bill_dpt_nm"),
						S0_TA1.iv_no,
						S0_TA1.bill_cl_dt,
						S0_TA1.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_TA1.bill_cl_dt,
							S0_TA1.bill_cl_typ,
							S0_TA1.bill_each_sls_flg
						).as("bill_cl_day"),
						MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_TA1.bill_mng_no).as("rcv_schd_dt"),
						S0_TA1.trd_cur_cd,
						S0_MA4.cur_nm.as("trd_cur_nm"),
						S0_TA1.bill_xrate,
						S0_TA1.wrk_no,
						S0_TA2.wrk_nm,
						S0_MA1.tax_on_bill_flg,
						S0_TA1.bill_cl_typ,
						S0_TA1.ins_usr_id,
						S0_TA1.ins_usr_nm,
						S0_TA1.ins_func_id,
						S0_TA1.ins_ts,
						S0_TA1.upd_usr_id,
						S0_TA1.upd_usr_nm,
						S0_TA1.upd_func_id,
						S0_TA1.upd_ts,
						S0_TA1.upd_srv_req_no,
						S0_TA1.upd_cntr,
						S0_TA1.bill_mng_no,
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg")
					)
					.from(
						S0_TA1
						.leftOuterJoin(S0_TA2).on(
							bracket(
								S0_TA1.wrk_no.eq(S0_TA2.wrk_no)
							)
						)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_TA1.bcst_cd.eq(S0_MA1.bp_cd)
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA2.dpt_cd.eq(S0_TA1.bill_dpt_cd)
								.and(S0_TA1.base_dt.between(S0_MA2.st_dt, S0_MA2.end_dt))
							)
						)
						.leftOuterJoin(S0_MA3).on(
							bracket(
								S0_MA2.wg_cd.eq(S0_MA3.wg_cd)
							)
						)
						.leftOuterJoin(S0_MA4).on(
							bracket(
								S0_TA1.trd_cur_cd.eq(S0_MA4.cur_cd)
							)
						)
						.innerJoin(S0_MA5).on(
							bracket(
								S0_TA1.bill_dpt_cd.eq(S0_MA5.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_TA1.bcst_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TA1.base_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.bill_no.neq(value(MAC_STR.NULL_VAL.value())))
						.and(
							bracket(
								S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.BATCH.value()))
								.and(bind("batch_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.MANUAL.value())))
								.and(bind("manual_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.SEL.value())))
								.and(bind("sel_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.EACH_SLS.value())))
								.and(bind("each_sls_flg").eq(value(true)))
							)
							.cutoff$and(
								S0_TA1.bill_cl_dt.eq(lastDay(S0_TA1.bill_cl_dt))
								.and(
									S0_TA1.bill_cl_typ.in(
										value(MAC_BILL_CL_TYP.BATCH.value()),
										value(MAC_BILL_CL_TYP.MANUAL.value())
									)
								)
								.and(bind("bill_cl_day99_flg_str").eq(value(true)))
							)
							.cutoff$and(
								MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
									S0_TA1.bill_cl_dt,
									S0_TA1.bill_cl_typ,
									S0_TA1.bill_each_sls_flg
								).eq(bind("bill_cl_day"))
							)
						)
						.and(
							S0_TA1.bill_cl_sts_typ.in(
								value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()),
								value(MSC_BILL_CL_STS_TYP.CL_BATCH.value())
							)
						)
						.and(S0_MA1.del_flg.eq(value(false)))
						.cutoff$and(S0_TA1.bill_cl_dt.gte(bind("bill_ym")))
						.cutoff$and(S0_TA1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_MA1.bp_nm.like(bind("bcst_nm")))
						.cutoff$and(S0_TA1.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_MA2.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA3.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_TA1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_MA4.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_TA1.bill_no.like(bind("bill_no")))
						.cutoff$and(S0_TA1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_TA2.wrk_nm.like(bind("wrk_nm")))
						.and(
								bracket(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
					.orderBy(
						S0_TA1.bill_dpt_cd.asc(),
						S0_TA1.bcst_cd.asc(),
						S0_TA1.trd_cur_cd.asc(),
						S0_TA1.wrk_no.asc(),
						S0_TA1.bill_mng_no.desc()
					)
			);
	}
	
	/**
	 * -- MSBGL0010_MST_BILL_Query_S06
	 */
	static MCQueryPlan MSBGL0010_MST_BILL_S06() {
		MST_BILL_R S0_TA1 = MST_BILL_R.create("TA1");
		MST_WRK_R S0_TA2 = MST_WRK_R.create("TA2");
		MAM_BP_R S0_MA1 = MAM_BP_R.create("MA1");
		MAM_DPT_R S0_MA2 = MAM_DPT_R.create("MA2");
		MAM_WG_R S0_MA3 = MAM_WG_R.create("MA3");
		MAM_CUR_R S0_MA4 = MAM_CUR_R.create("MA4");
		MAVM_RD_DPT_R S0_MA5 = MAVM_RD_DPT_R.create("MA5");
		MCTempView S0_VA1 = createTempView("VA1");
		MST_BILL_R S1_TB1 = MST_BILL_R.create("TB1");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("M1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0010_MST_BILL_Query_S06")
					.mainQuery()
					.select(
						S0_TA1.bill_no,
						S0_TA1.bcst_cd,
						S0_MA1.bp_nm.as("bcst_nm"),
						S0_MA3.wg_cd,
						S0_MA3.wg_nm,
						S0_TA1.bill_dpt_cd,
						S0_MA2.dpt_nm.as("bill_dpt_nm"),
						S0_TA1.iv_no,
						S0_TA1.bill_cl_dt,
						S0_TA1.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_TA1.bill_cl_dt,
							S0_TA1.bill_cl_typ,
							S0_TA1.bill_each_sls_flg
						).as("bill_cl_day"),
						MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_TA1.bill_mng_no).as("rcv_schd_dt"),
						S0_TA1.trd_cur_cd,
						S0_MA4.cur_nm.as("trd_cur_nm"),
						S0_TA1.bill_xrate,
						S0_TA1.wrk_no,
						S0_TA2.wrk_nm,
						S0_MA1.tax_on_bill_flg,
						S0_TA1.bill_cl_typ,
						S0_TA1.ins_usr_id,
						S0_TA1.ins_usr_nm,
						S0_TA1.ins_func_id,
						S0_TA1.ins_ts,
						S0_TA1.upd_usr_id,
						S0_TA1.upd_usr_nm,
						S0_TA1.upd_func_id,
						S0_TA1.upd_ts,
						S0_TA1.upd_srv_req_no,
						S0_TA1.upd_cntr,
						S0_TA1.bill_mng_no,
						cases()
						.when(
							M_EDI_IF_CTL.bp_cd.isNull()
						).then(value(0))
						.otherwise(value(1)).as("edi_flg")
					)
					.from(
						S0_TA1
						.leftOuterJoin(S0_TA2).on(
							bracket(
								S0_TA1.wrk_no.eq(S0_TA2.wrk_no)
							)
						)
						.leftOuterJoin(S0_MA1).on(
							bracket(
								S0_TA1.bcst_cd.eq(S0_MA1.bp_cd)
							)
						)
						.leftOuterJoin(S0_MA2).on(
							bracket(
								S0_MA2.dpt_cd.eq(S0_TA1.bill_dpt_cd)
								.and(S0_TA1.base_dt.between(S0_MA2.st_dt, S0_MA2.end_dt))
							)
						)
						.leftOuterJoin(S0_MA3).on(
							bracket(
								S0_MA2.wg_cd.eq(S0_MA3.wg_cd)
							)
						)
						.leftOuterJoin(S0_MA4).on(
							bracket(
								S0_TA1.trd_cur_cd.eq(S0_MA4.cur_cd)
							)
						)
						.innerJoin(S0_MA5).on(
							bracket(
								S0_TA1.bill_dpt_cd.eq(S0_MA5.dpt_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								S1_TB1.bcst_cd,
								S1_TB1.bill_dpt_cd,
								S1_TB1.iv_no,
								S1_TB1.trd_cur_cd,
								S1_TB1.wrk_no,
								max(S1_TB1.bill_mng_no).as("bill_mng_no")
							)
							.from(S1_TB1)
							.where(
								value(0).eq(value(0))
								.and(S1_TB1.bill_no.neq(value(MAC_STR.NULL_VAL.value())))
								.cutoff$and(S1_TB1.bcst_cd.like(bind("bcst_cd")))
								.cutoff$and(S1_TB1.bill_dpt_cd.like(bind("bill_dpt_cd")))
								.cutoff$and(S1_TB1.trd_cur_cd.like(bind("trd_cur_cd")))
								.cutoff$and(S1_TB1.bill_no.like(bind("bill_no")))
								.cutoff$and(S1_TB1.wrk_no.like(bind("wrk_no")))
							)
							.groupBy(
								S1_TB1.bcst_cd,
								S1_TB1.bill_dpt_cd,
								S1_TB1.iv_no,
								S1_TB1.trd_cur_cd,
								S1_TB1.wrk_no
							).view(S0_VA1)
						).on(
							bracket(
								S0_TA1.bcst_cd.eq(S0_VA1.pr(S1_TB1.bcst_cd))
								.and(S0_TA1.bill_dpt_cd.eq(S0_VA1.pr(S1_TB1.bill_dpt_cd)))
								.and(S0_TA1.iv_no.eq(S0_VA1.pr(S1_TB1.iv_no)))
								.and(S0_TA1.trd_cur_cd.eq(S0_VA1.pr(S1_TB1.trd_cur_cd)))
								.and(
									S0_TA1.wrk_no.eq(S0_VA1.pr(S1_TB1.wrk_no))
									.or(S0_TA1.wrk_no.isNull())
									.and(S0_VA1.pr(S1_TB1.wrk_no).isNull())
								)
								.and(S0_TA1.bill_mng_no.eq(S0_VA1.pr("bill_mng_no")))
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_TA1.bcst_cd.eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_TA1.base_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bracket(
								S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.BATCH.value()))
								.and(bind("batch_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.MANUAL.value())))
								.and(bind("manual_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.SEL.value())))
								.and(bind("sel_flg").eq(value(true)))
								.or(S0_TA1.bill_cl_typ.eq(value(MAC_BILL_CL_TYP.EACH_SLS.value())))
								.and(bind("each_sls_flg").eq(value(true)))
							)
							.cutoff$and(
								S0_TA1.bill_cl_dt.eq(lastDay(S0_TA1.bill_cl_dt))
								.and(
									S0_TA1.bill_cl_typ.in(
										value(MAC_BILL_CL_TYP.BATCH.value()),
										value(MAC_BILL_CL_TYP.MANUAL.value())
									)
								)
								.and(bind("bill_cl_day99_flg_str").eq(value(true)))
							)
							.cutoff$and(
								MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
									S0_TA1.bill_cl_dt,
									S0_TA1.bill_cl_typ,
									S0_TA1.bill_each_sls_flg
								).eq(bind("bill_cl_day"))
							)
						)
						.and(
							S0_TA1.bill_cl_sts_typ.in(
								value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()),
								value(MSC_BILL_CL_STS_TYP.CL_BATCH.value())
							)
						)
						.and(S0_MA1.del_flg.eq(value(false)))
						.cutoff$and(S0_MA1.bp_nm.like(bind("bcst_nm")))
						.cutoff$and(S0_MA2.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_MA3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_MA3.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_MA4.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_TA2.wrk_nm.like(bind("wrk_nm")))
						.and(
								(
									bind("on_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNotNull())
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(M_EDI_IF_CTL.bp_cd.isNull())
								)
						)
					)
					.orderBy(
						S0_TA1.bill_dpt_cd.asc(),
						S0_TA1.bcst_cd.asc(),
						S0_TA1.trd_cur_cd.asc(),
						S0_TA1.wrk_no.asc()
					)
			);
	}
}