package mcframe.serverMSBG.MSBGL0030;

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
	 * -- MSBGL0030_MST_BILL_Query_S01
	 */
	static MCQueryPlan MSBGL0030_MST_BILL_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
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
		MST_BILL_R S1_T = MST_BILL_R.create("T");
		MAM_BP_R S1_M = MAM_BP_R.create("M");
		MST_RCV_SCHD_R S2_T4 = MST_RCV_SCHD_R.create("T4");
		MST_BILL_D_R S3_T3 = MST_BILL_D_R.create("T3");
		MST_BILL_D_R S4_T4 = MST_BILL_D_R.create("T4");
		MST_BILL_D_R S5_BILLD1 = MST_BILL_D_R.create("BILLD1");
		MST_BILL_D_R S6_BILLD2 = MST_BILL_D_R.create("BILLD2");
		MAM_EDI_IF_CTL_R M_EDI_IF_CTL = MAM_EDI_IF_CTL_R.create("MEDIIFCTL");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0030_MST_BILL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T.bill_mng_no),
						S0_T1.pr(S1_T.prnt_flg),
						S0_T1.pr(S1_T.bill_cl_dt).as("bill_cl_ym"),
						S0_T1.pr(S1_T.bill_dpt_cd),
						S0_M1.dpt_nm.as("bill_dpt_nm"),
						S0_T1.pr(S1_T.wg_cd),
						S0_M2.wg_nm,
						S0_T1.pr(S1_T.bcst_cd),
						S0_M3.bp_nm.as("bcst_nm"),
						S0_T1.pr(S1_T.foreign_flg),
						S0_T1.pr(S1_T.bill_no),
						S0_T1.pr(S1_T.bill_rev),
						S0_T1.pr(S1_T.pre_bill_no),
						S0_T1.pr(S1_T.iv_no),
						S0_T1.pr(S1_T.wrk_no),
						S0_T2.wrk_nm,
						S0_T1.pr("rcv_schd_dt"),
						S0_T1.pr("multi_flg"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.pr(S1_T.bill_cl_dt),
							S0_T1.pr("bill_cl_typ"),
							S0_T1.pr(S1_T.bill_each_sls_flg)
						).as("bill_cl_day"),
						S0_T1.pr(S1_T.bill_dt),
						S0_T1.pr(S1_T.pre_bill_dt),
						S0_T1.pr(S1_T.trd_cur_cd),
						S0_M4.cur_nm.as("trd_cur_nm"),
						S0_T1.pr(S1_T.bill_xrate),
						S0_T1.pr("interim_flg"),
						S0_T1.pr(S1_T.last_bill_amt),
						S0_T1.pr("rcv_amt"),
						S0_T1.pr(S1_T.setoff_amt),
						S0_T1.pr(S1_T.bfw_amt),
						S0_T1.pr(S1_T.sls_amt),
						S0_T1.pr(S1_T.ret_amt),
						S0_T1.pr(S1_T.dscnt_amt),
						S0_T1.pr("tax_amt"),
						S0_T1.pr(S1_T.sw_to_amt),
						S0_T1.pr(S1_T.bill_amt),
						S0_M4.amt_dec_place,
						S0_T1.pr(S1_T.bill_cl_sts_typ),
						S0_T1.pr("edi_flg"),
						S0_T1.pr("d_cnt"),
						S0_T1.pr("sort_ord_flg"),
						S0_M3.sls_interim_cl_flg,
						decode(
							S0_M3.bill_prnt_typ,
							value(MAC_BILL_PRNT_TYP.RCV_ADJ.value()),
							value(true),
							value(false)
						).as("rcv_schd_adjst_flg"),
						S0_T1.pr("adjst_flg"),
						S0_T1.pr(S1_T.ins_usr_id),
						S0_T1.pr(S1_T.ins_usr_nm),
						S0_T1.pr(S1_T.ins_func_id),
						S0_T1.pr(S1_T.ins_ts),
						S0_T1.pr(S1_T.upd_usr_id),
						S0_T1.pr(S1_T.upd_usr_nm),
						S0_T1.pr(S1_T.upd_func_id),
						S0_T1.pr(S1_T.upd_ts),
						S0_T1.pr(S1_T.upd_srv_req_no),
						addDynamicSelect(DS0C_BP_GRP)
					)
					.from(
						subQuery()
						.select(
							S1_T.bill_mng_no,
							S1_T.prnt_flg,
							S1_T.bill_cl_dt,
							S1_T.base_dt,
							S1_T.bill_dpt_cd,
							S1_T.wg_cd,
							S1_T.bcst_cd,
							S1_T.foreign_flg,
							S1_T.bill_no,
							S1_T.bill_rev,
							S1_T.iv_no,
							S1_T.pre_bill_no,
							S1_T.wrk_no,
							MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S1_T.bill_mng_no).as("rcv_schd_dt"),
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(S2_T4.rcv_schd_no))
										.from(S2_T4)
										.where(
											S1_T.bill_mng_no.eq(S2_T4.bill_mng_no)
										)
									).gt(value(1))
								)
									.then(value(true))
								.otherwise(value(false)).as("multi_flg"),
							S1_T.bill_dt,
							S1_T.pre_bill_dt,
							S1_T.trd_cur_cd,
							S1_T.bill_xrate,
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(S3_T3.bill_d_no))
										.from(S3_T3)
										.where(
											S1_T.bill_mng_no.eq(S3_T3.bill_mng_no)
											.and(S3_T3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
											.and(S3_T3.interim_flg.eq(value(true)))
										)
									).gt(value(0))
								)
									.then(value(true))
								.otherwise(value(false)).as("interim_flg"),
							S1_T.last_bill_amt,
							bracket(
								S1_T.xfr_amt.add(S1_T.note_amt).add(S1_T.cash_amt).add(S1_T.sw_amt)
							).as("rcv_amt"),
							S1_T.setoff_amt,
							S1_T.bfw_amt,
							S1_T.sls_amt,
							S1_T.ret_amt,
							S1_T.dscnt_amt,
							bracket(
								S1_T.tax_amt.subtract(S1_T.setoff_tax_amt)
							).as("tax_amt"),
							S1_T.sw_to_amt,
							S1_T.bill_amt,
							cases()
							.when(S1_T.prnt_flg.eq(value(true))).then(S1_T.edi_flg)
							.when(
									exists(
											subQuery()
											.select(value("X"))
											.from(M_EDI_IF_CTL)
											.where(
												S1_T.bcst_cd.eq(M_EDI_IF_CTL.bp_cd)
												.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
												.and(S1_T.base_dt.between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
												.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
											)
										)
							).then(value(true))
							.otherwise(value(false))
							.as("edi_flg"),
							S1_T.bill_cl_sts_typ,
							nvl(
								S1_T.bill_cl_typ,
								S1_M.bill_cl_typ
							).as("bill_cl_typ"),
							S1_T.rcv_schd_adjst_flg.as("adjst_flg"),
							bracket(
								subQuery()
								.select(countAll())
								.from(S4_T4)
								.where(
									S1_T.bill_mng_no.eq(S4_T4.bill_mng_no)
								)
							).as("d_cnt"),
							decode(
								MSC_BILL_CL_STS_TYP$IS_NOT_BILL(S1_T.bill_cl_sts_typ),
								value(false),
								value(true),
								value(true),
								value(false)
							).as("sort_ord_flg"),
							S1_T.ins_usr_id,
							S1_T.ins_usr_nm,
							S1_T.ins_func_id,
							S1_T.ins_ts,
							S1_T.upd_usr_id,
							S1_T.upd_usr_nm,
							S1_T.upd_func_id,
							S1_T.upd_ts,
							S1_T.upd_srv_req_no,
							S1_T.bill_each_sls_flg
						)
						.from(
							S1_T
							.leftOuterJoin(S1_M).on(
								bracket(
									S1_T.bcst_cd.eq(S1_M.bp_cd)
								)
							)
						).view(S0_T1)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.pr(S1_T.wrk_no).eq(S0_T2.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.pr(S1_T.bill_dpt_cd).eq(S0_M1.dpt_cd)
								.and(S0_T1.pr(S1_T.base_dt).between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.pr(S1_T.wg_cd).eq(S0_M2.wg_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.pr(S1_T.bcst_cd).eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.pr(S1_T.trd_cur_cd).eq(S0_M4.cur_cd)
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T1.pr(S1_T.bill_dpt_cd).eq(S0_V1.dpt_cd)
							)
						)
						.leftOuterJoin(M_EDI_IF_CTL).on(
								bracket(
									S0_T1.pr(S1_T.bcst_cd).eq(M_EDI_IF_CTL.bp_cd)
									.and(M_EDI_IF_CTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value())))
									.and(S0_T1.pr(S1_T.base_dt).between(M_EDI_IF_CTL.st_dt, M_EDI_IF_CTL.end_dt))
									.and(M_EDI_IF_CTL.del_flg.eq(value(false)))
								)
							)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(bind("bill_cl_ym_from").lte(S0_T1.pr(S1_T.bill_cl_dt)))
						.cutoff$and(S0_T1.pr(S1_T.bill_cl_dt).lte(lastDay(bind("bill_cl_ym_to"))))
						.cutoff$and(
							S0_T1.pr(S1_T.bill_cl_dt).eq(lastDay(S0_T1.pr(S1_T.bill_cl_dt)))
							.and(
								S0_T1.pr("bill_cl_typ").in(
									value(MAC_BILL_CL_TYP.BATCH.value()),
									value(MAC_BILL_CL_TYP.MANUAL.value())
								)
							)
							.and(bind("bill_cl_day99_flg_str").eq(value(true)))
						)
						.cutoff$and(
							MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
								S0_T1.pr(S1_T.bill_cl_dt),
								S0_T1.pr("bill_cl_typ"),
								S0_T1.pr(S1_T.bill_each_sls_flg)
							).eq(bind("bill_cl_day"))
						)
						.cutoff$and(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T1.pr(S1_T.bill_mng_no)).lte(bind("rcv_schd_dt_to")))
						.cutoff$and(bind("rcv_schd_dt_from").lte(MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(S0_T1.pr(S1_T.bill_mng_no))))
						.cutoff$and(S0_T1.pr(S1_T.bill_dpt_cd).like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T1.pr(S1_T.wg_cd).like(bind("wg_cd")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T1.pr(S1_T.bcst_cd).like(bind("bcst_cd")))
						.cutoff$and(S0_M3.bp_nm.like(bind("bcst_nm")))
						.cutoff$and(S0_T1.pr(S1_T.bill_no).like(bind("bill_no")))
						.cutoff$and(S0_T1.pr(S1_T.pre_bill_no).like(bind("pre_bill_no")))
						.cutoff$and(S0_T1.pr(S1_T.iv_no).like(bind("iv_no")))
						.cutoff$and(S0_T1.pr(S1_T.trd_cur_cd).like(bind("trd_cur_cd")))
						.cutoff$and(S0_M4.cur_nm.like(bind("trd_cur_nm")))
						.cutoff$and(S0_T1.pr(S1_T.wrk_no).like(bind("wrk_no")))
						.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(
							bracket(
								bind("inc_no_bill_flg_str").eq(bind("inc_no_bill_flg_str"))
								.and(
									S0_T1.pr(S1_T.last_bill_amt).neq(value(0))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S5_BILLD1)
											.where(
												S5_BILLD1.bill_mng_no.eq(S0_T1.pr(S1_T.bill_mng_no))
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("interim_flg_str").eq(bind("interim_flg_str"))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_BILLD2)
										.where(
											S6_BILLD2.bill_mng_no.eq(S0_T1.pr(S1_T.bill_mng_no))
											.and(S6_BILLD2.interim_flg.eq(value(true)))
											.and(S6_BILLD2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
										)
									)
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.or(S0_T1.pr(S1_T.bill_cl_sts_typ).eq(bind("cl_batch")))
							.or(S0_T1.pr(S1_T.bill_cl_sts_typ).eq(bind("cl_scrn")))
							.or(S0_T1.pr(S1_T.bill_cl_sts_typ).eq(bind("each_sls")))
							.or(S0_T1.pr(S1_T.bill_cl_sts_typ).eq(bind("not_bill")))
						)
						.cutoff$and(
							bracket(
								bind("not_prnt_ex_flg_str").eq(value(true))
								.and(S0_M3.bill_prnt_typ.neq(value(MAC_BILL_PRNT_TYP.NOT_PRNT.value())))
							)
						)
						.cutoff$and(
							bracket(
								bind("rcv_schd_adjst_flg_str").eq(value(true))
								.and(S0_M3.bill_prnt_typ.eq(value(MAC_BILL_PRNT_TYP.RCV_ADJ.value())))
							)
						)
						.cutoff$and(S0_T1.pr(S1_T.prnt_flg).eq(bind("prnt_flg_str")))
						.cutoff$and(S0_T1.pr(S1_T.foreign_flg).eq(bind("foreign_flg_str")))
						.cutoff$and(S0_T1.pr("adjst_flg").eq(bind("adjst_flg_str")))
						.and(
								(
									bind("on_edi_flg").eq(value(true))
									.and(S0_T1.pr("edi_flg").eq(value(true)))
								)
								.or(
									bind("off_edi_flg").eq(value(true))
									.and(S0_T1.pr("edi_flg").eq(value(false)))
								)
						)
						.and(
								
								(
									S0_T1.pr("edi_flg").eq(value(true))
									.and(S0_T1.pr("prnt_flg").eq(value(false)))
								)
								.or(
									S0_T1.pr("edi_flg").eq(value(false))
								)
								.or(bind("ref_mode").eq(value(true)))
						)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T1.pr(S1_T.bill_dpt_cd).asc(),
						S0_T1.pr(S1_T.bcst_cd).asc(),
						S0_T1.pr(S1_T.trd_cur_cd).asc(),
						S0_T1.pr(S1_T.wrk_no).asc(),
						S0_T1.pr("sort_ord_flg").desc(),
						MAC_STR$IS_NULL_VAL(S0_T1.pr(S1_T.iv_no)).asc(),
						S0_T1.pr(S1_T.bill_no).asc(),
						MAC_Y4M$IS_NULL_VAL(S0_T1.pr(S1_T.bill_cl_dt)).asc(),
						S0_T1.pr(S1_T.bill_cl_dt).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bp_grp_flg1"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd1.as("bp_grp_cd1"), S0_MM1.bp_grp_nm.as("bp_grp_nm1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M3.bp_grp_cd1.eq(S0_MM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MM1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd2.as("bp_grp_cd2"), S0_MM2.bp_grp_nm.as("bp_grp_nm2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M3.bp_grp_cd2.eq(S0_MM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MM2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd3.as("bp_grp_cd3"), S0_MM3.bp_grp_nm.as("bp_grp_nm3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M3.bp_grp_cd3.eq(S0_MM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MM3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd4.as("bp_grp_cd4"), S0_MM4.bp_grp_nm.as("bp_grp_nm4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M3.bp_grp_cd4.eq(S0_MM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MM4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd5.as("bp_grp_cd5"), S0_MM5.bp_grp_nm.as("bp_grp_nm5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M3.bp_grp_cd5.eq(S0_MM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MM5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd6.as("bp_grp_cd6"), S0_MM6.bp_grp_nm.as("bp_grp_nm6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M3.bp_grp_cd6.eq(S0_MM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MM6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd7.as("bp_grp_cd7"), S0_MM7.bp_grp_nm.as("bp_grp_nm7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M3.bp_grp_cd7.eq(S0_MM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MM7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd8.as("bp_grp_cd8"), S0_MM8.bp_grp_nm.as("bp_grp_nm8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M3.bp_grp_cd8.eq(S0_MM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MM8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd9.as("bp_grp_cd9"), S0_MM9.bp_grp_nm.as("bp_grp_nm9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M3.bp_grp_cd9.eq(S0_MM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MM9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS0C_BP_GRP, S0_M3.bp_grp_cd10.as("bp_grp_cd10"), S0_MM10.bp_grp_nm.as("bp_grp_nm10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M3.bp_grp_cd10.eq(S0_MM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MM10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
}