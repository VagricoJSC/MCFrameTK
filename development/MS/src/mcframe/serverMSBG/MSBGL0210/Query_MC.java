package mcframe.serverMSBG.MSBGL0210;

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
	 * -- MSBGL0210_MST_AR_APPL_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGL0210_MST_AR_APPL_SCHD_S01() {
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MST_BILL_ACST_R S0_T2 = MST_BILL_ACST_R.create("T2");
		MST_AR_APPL_SCHD_R S0_T3 = MST_AR_APPL_SCHD_R.create("T3");
		MCTempView S0_V1 = createTempView("V1");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MST_AR_APPL_ACT_R S1_T4 = MST_AR_APPL_ACT_R.create("T4");
		MST_RCV_ACT_D_R S1_T5 = MST_RCV_ACT_D_R.create("T5");
		MST_RCV_ACT_R S1_T6 = MST_RCV_ACT_R.create("T6");
		MST_BILL_D_R S2_TT1 = MST_BILL_D_R.create("TT1");
		MAM_BP_R S3 = MAM_BP_R.create();
		MST_RCV_ACT_D_R S4_TT2 = MST_RCV_ACT_D_R.create("TT2");
		MST_RCV_ACT_R S4_TT3 = MST_RCV_ACT_R.create("TT3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_AR_APPL_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T3.appl_tgt_amt,
						S0_T3.appl_amt.as("appl_ttl_amt"),
						S0_T3.appl_amt.as("appl_ttl_amt_w"),
						nullValue().as("amt1"),
						nullValue().as("amt1_w"),
						nullValue().as("amt2"),
						nullValue().as("amt2_w"),
						nullValue().as("amt3"),
						nullValue().as("amt3_w"),
						S0_T3.not_appl_bal,
						S0_T3.rcv_schd_dt,
						S0_T3.rcv_mtd_cd.as("ar_sttl_cd1"),
						S0_T3.iv_no,
						S0_T1.wrk_no,
						S0_T2.acst_cd,
						S0_T2.ar_dpt_cd,
						S0_M4.dpt_nm.as("ar_dpt_nm"),
						S0_M4.wg_cd,
						S0_T3.ar_typ,
						S0_T1.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.bill_cl_dt,
							nvl(
								S0_T1.bill_cl_typ,
								S0_M6.bill_cl_typ
							),
							S0_T1.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T1.bill_no,
						S0_T1.bill_mng_no,
						S0_T1.bcst_cd,
						S0_M6.bp_nm.as("bcst_nm"),
						S0_T1.bill_dpt_cd,
						S0_M7.dpt_nm.as("bill_dpt_nm"),
						S0_T3.ar_appl_schd_no,
						nullValue().as("rcv_act_d_no"),
						nullValue().as("rcv_act_d_seq"),
						S0_T3.upd_cntr.as("ar_appl_schd_upd_cntr"),
						decode(
							bind("slo_no"),
							nullValue(),
							value(true),
							value(false)
						).as("other_slo_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.innerJoin(S0_T3).on(S0_T2.bill_acst_no.eq(S0_T3.bill_acst_no))
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T4.ar_appl_schd_no,
								S1_T6.rcv_act_no,
								S1_T6.rcv_act_seq
							)
							.from(
								S1_T4
								.leftOuterJoin(S1_T5).on(
									S1_T4.rcv_act_d_no.eq(S1_T5.rcv_act_d_no)
									.and(S1_T4.rcv_act_d_seq.eq(S1_T5.rcv_act_d_seq))
								)
								.leftOuterJoin(S1_T6).on(
									S1_T5.rcv_act_no.eq(S1_T6.rcv_act_no)
									.and(S1_T5.rcv_act_seq.eq(S1_T6.rcv_act_seq))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T6.rcv_act_no.eq(bind("rcv_act_no")))
								.and(S1_T6.rcv_act_seq.eq(bind("rcv_act_seq")))
							).view(S0_V1)
						).on(S0_T3.ar_appl_schd_no.eq(S0_V1.pr(S1_T4.ar_appl_schd_no)))
						.leftOuterJoin(S0_M4).on(
							S0_T2.ar_dpt_cd.eq(S0_M4.dpt_cd)
							.and(S0_T1.base_dt.between(S0_M4.st_dt, S0_M4.end_dt))
						)
						.leftOuterJoin(S0_M6).on(S0_T1.bcst_cd.eq(S0_M6.bp_cd))
						.leftOuterJoin(S0_M7).on(
							S0_T1.bill_dpt_cd.eq(S0_M7.dpt_cd)
							.and(S0_T1.base_dt.between(S0_M7.st_dt, S0_M7.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.bill_dpt_cd.eq(bind("bill_dpt_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.cutoff$and(S0_T3.rcv_schd_dt.lte(bind("rcv_schd_dt")))
						.and(
							S0_T3.rcv_mtd_cd.eq(bind("ar_sttl_cd1"))
							.or(bind("narrow_down_flg").eq(value(false)))
						)
						.and(
							value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).neq(S0_T1.bill_cl_sts_typ)
							.or(bind("not_bill_flg").eq(value(true)))
						)
						.and(
							bind("slo_flg").eq(value(true))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_TT1)
									.where(
										value(0).eq(value(0))
										.and(S2_TT1.bill_mng_no.eq(S0_T1.bill_mng_no))
										.and(S2_TT1.slo_no.eq(bind("slo_no")))
									)
								)
							)
						)
						.and(
							bind("incl_appl_flg").eq(value(true))
							.or(S0_T3.not_appl_bal.neq(value(0)))
						)
						.and(
							bind("zero_flg").eq(value(true))
							.or(S0_T3.appl_tgt_amt.neq(value(0)))
						)
						.and(
							bracket(
								bind("not_bcst_flg").eq(value(false))
								.and(S0_T1.bcst_cd.eq(bind("bcst_cd")))
							)
							.or(
								bind("not_bcst_flg").eq(value(true))
								.and(
									S0_T1.bcst_cd.in(
										subQuery()
										.select(S3.bp_cd)
										.from(S3)
										.where(
											S3.rcst_cd.eq(bind("rcst_cd"))
										)
									)
								)
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S4_TT2
									.innerJoin(S4_TT3).on(
										S4_TT2.rcv_act_no.eq(S4_TT3.rcv_act_no)
										.and(S4_TT2.rcv_act_seq.eq(S4_TT3.rcv_act_seq))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S4_TT2.rcv_act_no.eq(S0_V1.pr(S1_T6.rcv_act_no)))
									.and(S4_TT2.rcv_act_seq.eq(S0_V1.pr(S1_T6.rcv_act_seq)))
								)
							)
						)
					)
					.orderBy(
						S0_T3.rcv_schd_dt.asc(),
						S0_T3.rcv_mtd_cd.asc(),
						S0_T2.ar_dpt_cd.asc(),
						S0_T2.acst_cd.asc(),
						S0_T3.iv_no.asc(),
						S0_T1.wrk_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd1")
						))
						.addSelect(m -> toArray(
							m.ar_sttl_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm1", m.sttl_nm());
							r.setStringNE("ar_sttl_typ1", m.ar_sttl_typ());
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
	 * -- MSBGL0210_MST_AR_APPL_SCHD_Query_S02
	 */
	static MCQueryPlan MSBGL0210_MST_AR_APPL_SCHD_S02() {
		MST_BILL_R S0_T1 = MST_BILL_R.create("T1");
		MST_BILL_ACST_R S0_T2 = MST_BILL_ACST_R.create("T2");
		MST_AR_APPL_SCHD_R S0_T3 = MST_AR_APPL_SCHD_R.create("T3");
		MCTempView S0_V1 = createTempView("V1");
		MST_RCV_R S0_T8 = MST_RCV_R.create("T8");
		MAM_STTL_R S0_M1 = MAM_STTL_R.create("M1");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MST_AR_APPL_ACT_R S1_T4 = MST_AR_APPL_ACT_R.create("T4");
		MST_RCV_ACT_D_R S1_T5 = MST_RCV_ACT_D_R.create("T5");
		MST_RCV_ACT_R S1_T6 = MST_RCV_ACT_R.create("T6");
		MST_BILL_D_R S2_TT1 = MST_BILL_D_R.create("TT1");
		MST_RCV_ACT_D_R S3_TT2 = MST_RCV_ACT_D_R.create("TT2");
		MST_RCV_ACT_R S3_TT3 = MST_RCV_ACT_R.create("TT3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_AR_APPL_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T3.appl_tgt_amt,
						S0_T3.appl_amt.as("appl_ttl_amt"),
						S0_T3.appl_amt.as("appl_ttl_amt_w"),
						nullValue().as("amt1"),
						nullValue().as("amt1_w"),
						S0_T3.not_appl_bal,
						S0_T3.rcv_schd_dt,
						S0_T3.rcv_mtd_cd.as("ar_sttl_cd1"),
						S0_M1.sttl_nm.as("ar_sttl_nm1"),
						S0_M1.ar_sttl_typ.as("ar_sttl_typ1"),
						S0_T3.iv_no,
						S0_T1.wrk_no,
						S0_T2.acst_cd,
						S0_T2.ar_dpt_cd,
						S0_M4.dpt_nm.as("ar_dpt_nm"),
						S0_M4.wg_cd,
						S0_T3.ar_typ,
						S0_T1.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T1.bill_cl_dt,
							nvl(
								S0_T1.bill_cl_typ,
								S0_M6.bill_cl_typ
							),
							S0_T1.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T1.bill_no,
						S0_T1.bill_mng_no,
						S0_T1.bcst_cd,
						S0_M6.bp_nm.as("bcst_nm"),
						S0_T1.bill_dpt_cd,
						S0_M7.dpt_nm.as("bill_dpt_nm"),
						S0_T3.ar_appl_schd_no,
						nullValue().as("rcv_act_d_no"),
						nullValue().as("rcv_act_d_seq"),
						S0_T3.upd_cntr.as("ar_appl_schd_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.innerJoin(S0_T3).on(S0_T2.bill_acst_no.eq(S0_T3.bill_acst_no))
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T4.ar_appl_schd_no,
								S1_T6.rcv_act_no,
								S1_T6.rcv_act_seq
							)
							.from(
								S1_T4
								.leftOuterJoin(S1_T5).on(
									S1_T4.rcv_act_d_no.eq(S1_T5.rcv_act_d_no)
									.and(S1_T4.rcv_act_d_seq.eq(S1_T5.rcv_act_d_seq))
								)
								.leftOuterJoin(S1_T6).on(
									S1_T5.rcv_act_no.eq(S1_T6.rcv_act_no)
									.and(S1_T5.rcv_act_seq.eq(S1_T6.rcv_act_seq))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T6.rcv_act_no.eq(bind("rcv_act_no")))
								.and(S1_T6.rcv_act_seq.eq(bind("rcv_act_seq")))
							).view(S0_V1)
						).on(S0_T3.ar_appl_schd_no.eq(S0_V1.pr(S1_T4.ar_appl_schd_no)))
						.leftOuterJoin(S0_T8).on(S0_T8.rcv_no.eq(bind("setoff_rcv_no")))
						.leftOuterJoin(S0_M1).on(S0_T3.rcv_mtd_cd.eq(S0_M1.sttl_cd))
						.leftOuterJoin(S0_M4).on(
							S0_T2.ar_dpt_cd.eq(S0_M4.dpt_cd)
							.and(S0_T1.bill_cl_dt.between(S0_M4.st_dt, S0_M4.end_dt))
						)
						.leftOuterJoin(S0_M6).on(S0_T1.bcst_cd.eq(S0_M6.bp_cd))
						.leftOuterJoin(S0_M7).on(
							S0_T1.bill_dpt_cd.eq(S0_M7.dpt_cd)
							.and(S0_T1.base_dt.between(S0_M7.st_dt, S0_M7.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bcst_cd.eq(bind("setoff_bcst_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.eq(bind("setoff_trd_cur_cd")))
						.cutoff$and(S0_T3.rcv_schd_dt.lte(bind("rcv_schd_dt")))
						.and(
							S0_T3.rcv_mtd_cd.eq(bind("setoff_sttl_cd"))
							.or(
								bind("narrow_down_flg").eq(value(false))
								.and(S0_M1.ar_sttl_typ.neq(value(MAC_AR_STTL_TYP.WTAX.value())))
							)
						)
						.and(
							value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).neq(S0_T1.bill_cl_sts_typ)
							.or(bind("not_bill_flg").eq(value(true)))
						)
						.and(
							bind("slo_flg").eq(value(true))
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_TT1)
									.where(
										value(0).eq(value(0))
										.and(S2_TT1.bill_mng_no.eq(S0_T1.bill_mng_no))
										.and(S2_TT1.slo_no.eq(bind("slo_no")))
									)
								)
							)
						)
						.and(
							bind("incl_appl_flg").neq(value(false))
							.or(S0_T3.not_appl_bal.neq(value(0)))
						)
						.and(
							bind("zero_flg").eq(value(true))
							.or(S0_T3.appl_tgt_amt.neq(value(0)))
						)
						.and(
							bind("setoff_rcv_no").isNull()
							.or(
								S0_T2.ar_dpt_cd.eq(S0_T8.rcv_dpt_cd)
								.and(S0_T2.acst_cd.eq(S0_T8.acst_cd))
								.and(S0_T2.ar_typ.eq(S0_T8.ar_typ))
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S3_TT2
									.innerJoin(S3_TT3).on(
										S3_TT2.rcv_act_no.eq(S3_TT3.rcv_act_no)
										.and(S3_TT2.rcv_act_seq.eq(S3_TT3.rcv_act_seq))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S3_TT2.rcv_act_no.eq(S0_V1.pr(S1_T6.rcv_act_no)))
									.and(S3_TT2.rcv_act_seq.eq(S0_V1.pr(S1_T6.rcv_act_seq)))
								)
							)
						)
					)
					.orderBy(
						S0_T3.rcv_schd_dt.asc(),
						S0_T3.rcv_mtd_cd.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
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
	 * -- MSBGL0210_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL0210_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_AR_APPL_ACT_R S0_T2 = MST_AR_APPL_ACT_R.create("T2");
		MST_AR_APPL_SCHD_R S0_T3 = MST_AR_APPL_SCHD_R.create("T3");
		MST_BILL_ACST_R S0_T4 = MST_BILL_ACST_R.create("T4");
		MST_BILL_R S0_T5 = MST_BILL_R.create("T5");
		MST_RCV_ACT_R S0_T6 = MST_RCV_ACT_R.create("T6");
		MST_WRK_R S0_T7 = MST_WRK_R.create("T7");
		MAM_STTL_R S0_M1 = MAM_STTL_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T1.rcv_act_d_no,
						S0_T1.rcv_act_d_seq,
						S0_T1.disp_seq,
						S0_T3.appl_tgt_amt,
						S0_T3.appl_amt.as("appl_ttl_amt"),
						S0_T3.appl_amt.as("appl_ttl_amt_w"),
						S0_T1.trd_cur_amt1.as("amt1"),
						S0_T1.trd_cur_amt1.as("amt1_w"),
						S0_T1.trd_cur_amt2.as("amt2"),
						S0_T1.trd_cur_amt2.as("amt2_w"),
						S0_T1.trd_cur_amt3.as("amt3"),
						S0_T1.trd_cur_amt3.as("amt3_w"),
						S0_T3.not_appl_bal,
						S0_T3.rcv_schd_dt,
						S0_T3.rcv_mtd_cd.as("ar_sttl_cd1"),
						S0_M1.sttl_nm.as("ar_sttl_nm1"),
						S0_M1.ar_sttl_typ.as("ar_sttl_typ1"),
						S0_T1.iv_no,
						S0_T1.wrk_no,
						S0_T7.wrk_nm,
						S0_T1.acst_cd,
						S0_M2.bp_nm.as("acst_nm"),
						S0_T1.ar_dpt_cd,
						S0_M3.dpt_nm.as("ar_dpt_nm"),
						S0_M3.wg_cd,
						S0_M4.wg_nm,
						S0_T1.ar_typ,
						S0_T5.bill_cl_dt.as("bill_ym"),
						MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
							S0_T5.bill_cl_dt,
							nvl(
								S0_T5.bill_cl_typ,
								S0_M5.bill_cl_typ
							),
							S0_T5.bill_each_sls_flg
						).as("bill_cl_day"),
						S0_T5.bill_no,
						S0_T5.bill_mng_no,
						S0_T5.bcst_cd,
						S0_M5.bp_nm.as("bcst_nm"),
						S0_T5.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T1.bill_d_rmrks,
						S0_T3.ar_appl_schd_no,
						S0_T3.upd_cntr.as("ar_appl_schd_upd_cntr")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.rcv_act_d_no.eq(S0_T2.rcv_act_d_no))
						.leftOuterJoin(S0_T3).on(S0_T2.ar_appl_schd_no.eq(S0_T3.ar_appl_schd_no))
						.leftOuterJoin(S0_T4).on(S0_T3.bill_acst_no.eq(S0_T4.bill_acst_no))
						.leftOuterJoin(S0_T5).on(S0_T4.bill_mng_no.eq(S0_T5.bill_mng_no))
						.leftOuterJoin(S0_T6).on(
							S0_T1.rcv_act_no.eq(S0_T6.rcv_act_no)
							.and(S0_T1.rcv_act_seq.eq(S0_T6.rcv_act_seq))
						)
						.leftOuterJoin(S0_T7).on(S0_T1.wrk_no.eq(S0_T7.wrk_no))
						.leftOuterJoin(S0_M1).on(S0_T3.rcv_mtd_cd.eq(S0_M1.sttl_cd))
						.leftOuterJoin(S0_M2).on(S0_T1.acst_cd.eq(S0_M2.bp_cd))
						.leftOuterJoin(S0_M3).on(
							S0_T1.ar_dpt_cd.eq(S0_M3.dpt_cd)
							.and(S0_T6.ac_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M4).on(S0_M3.wg_cd.eq(S0_M4.wg_cd))
						.leftOuterJoin(S0_M5).on(S0_T5.bcst_cd.eq(S0_M5.bp_cd))
						.leftOuterJoin(S0_M6).on(
							S0_T5.bill_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T5.base_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
						.cutoff$and(S0_T6.rcst_cd.eq(bind("rcst_cd")))
						.cutoff$and(S0_T1.bcst_cd.eq(bind("bcst_cd")))
						.cutoff$and(S0_T1.bill_dpt_cd.eq(bind("bill_dpt_cd")))
						.cutoff$and(S0_T6.trd_cur_cd.eq(bind("trd_cur_cd")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBGL0210_MST_RCV_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL0210_MST_RCV_ACT_S01() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_R S0_T2 = MST_RCV_R.create("T2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAVM_RD_DPT_R S0_M19 = MAVM_RD_DPT_R.create("M19");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_RCV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.ac_ym,
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.ac_dt,
						S0_T1.bill_basis_dt,
						S0_T1.usr_cd,
						S0_T1.dpt_cd,
						S0_M3.dpt_nm,
						S0_M3.rcv_bank_ac_cd.as("def_bank_ac_cd"),
						S0_M3.wg_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.rcv_no,
						S0_T2.slo_no,
						S0_T1.rcst_cd,
						S0_T2.rcst_cd.as("old_rcst_cd"),
						S0_T1.rcv_dt,
						S0_T1.bcst_cd,
						S0_T2.bcst_cd.as("old_bcst_cd"),
						S0_T1.rcv_dt,
						S0_T1.bill_dpt_cd,
						S0_M7.dpt_nm.as("bill_dpt_nm"),
						S0_T2.bill_dpt_cd.as("old_bill_dpt_cd"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						decode(
							S0_T1.rcv_no,
							nullValue(),
							S0_T1.subttl1,
							S0_T2.rcv_amt
						).as("rcv_amt"),
						decode(
							S0_T1.rcv_no,
							nullValue(),
							value(0),
							S0_T2.not_proc_bal
						).as("not_proc_bal"),
						decode(
							S0_T1.rcv_no,
							nullValue(),
							S0_T1.subttl1,
							S0_T2.not_proc_bal.add(S0_T1.subttl1)
						).as("not_proc_bal_w"),
						S0_T1.ar_sttl_cd1,
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_T1.ar_sttl_cd2,
						S0_T1.tax_cd2.as("tax_cd"),
						S0_T1.debt_cred_id_typ,
						S0_T1.debt_cred_id_cd,
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.FLEX.value()).eq(S0_T1.debt_cred_id_typ))
								.then(S0_T1.debt_cred_nm)
							.otherwise(S0_M13.bp_nm).as("debt_cred_nm"),
						S0_T1.bd_dpt_cd,
						S0_M14.dpt_nm.as("bd_dpt_nm"),
						S0_T2.dat_typ.as("rcv_dat_typ"),
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.upd_cntr.as("rcv_act_upd_cntr"),
						S0_T2.upd_cntr.as("rcv_upd_cntr"),
						S0_T1.note_no,
						S0_T1.note_mng_no,
						// this field is appended by sql coverter.
						S0_T2.src_rcv_act_no.as("join_src_rcv_act_no_"),
						// this field is appended by sql coverter.
						S0_T2.src_rcv_act_seq.as("join_src_rcv_act_seq_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.rcv_no.eq(S0_T2.rcv_no))
						.leftOuterJoin(S0_M3).on(
							S0_T1.dpt_cd.eq(S0_M3.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M7).on(
							S0_T1.bill_dpt_cd.eq(S0_M7.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M7.st_dt, S0_M7.end_dt))
						)
						.leftOuterJoin(S0_M13).on(S0_T1.debt_cred_id_cd.eq(S0_M13.bp_cd))
						.leftOuterJoin(S0_M14).on(
							S0_T1.bd_dpt_cd.eq(S0_M14.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M14.st_dt, S0_M14.end_dt))
						)
						.innerJoin(S0_M19).on(S0_T1.dpt_cd.eq(S0_M19.dpt_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.cutoff$and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.rcv_act_rev.eq(bind("rcv_act_rev"))
							.and(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_RCV_ACT_R.class, r -> toCondition(
							r.getStringNE("join_src_rcv_act_no_"),
							r.getNumberNE("join_src_rcv_act_seq_")
						))
						.addSelect(m -> toArray(
							m.trd_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("adv_slip_cd", m.trd_cd());
					}),
					j -> j
						.add(MST_NOTE_R.class, r -> toCondition(
							r.getStringNE("note_mng_no")
						))
						.addSelect(m -> toArray(
							m.accptr,
							m.draw_bank_cd,
							m.draw_branch_cd,
							m.draw_dt,
							m.drawer_nm,
							m.due_dt,
							m.endrsr,
							m.note_rsn_cd,
							m.note_typ,
							m.sub_char1,
							m.sub_char2,
							m.sub_char3
						))
						.addMap((r, m) -> {
							r.setStringNE("note_typ", m.note_typ());
							r.setDateNE("draw_dt", m.draw_dt());
							r.setDateNE("due_dt", m.due_dt());
							r.setStringNE("drawer_nm", m.drawer_nm());
							r.setStringNE("endrsr", m.endrsr());
							r.setStringNE("accptr", m.accptr());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
							r.setStringNE("note_rsn_cd", m.note_rsn_cd());
							r.setStringNE("note_sub_char1", m.sub_char1());
							r.setStringNE("note_sub_char2", m.sub_char2());
							r.setStringNE("note_sub_char3", m.sub_char3());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
							r.setStringNE("trd_nm", m.trd_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd1")
						))
						.addSelect(m -> toArray(
							m.ar_sttl_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_typ1", m.ar_sttl_typ());
							r.setStringNE("ar_sttl_nm1", m.sttl_nm());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd2")
						))
						.addSelect(m -> toArray(
							m.ar_sttl_typ,
							m.sls_purc_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm2", m.sttl_nm());
							r.setStringNE("ar_sttl_typ2", m.ar_sttl_typ());
							r.setStringNE("sls_purc_typ2", m.sls_purc_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("adv_slip_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("adv_slip_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("draw_bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("draw_bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("draw_bank_cd"),
							r.getStringNE("draw_branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("draw_branch_nm", m.branch_nm());
					}),
					j -> j
						.add(MAM_NOTE_RSN_R.class, r -> toCondition(
							r.getStringNE("note_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.note_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("note_rsn_nm", m.note_rsn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0210_MST_RCV_ACT_Query_S02
	 */
	static MCQueryPlan MSBGL0210_MST_RCV_ACT_S02() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_R S0_T2 = MST_RCV_R.create("T2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		MAVM_RD_DPT_R S0_M11 = MAVM_RD_DPT_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_RCV_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.ac_ym,
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.ac_dt,
						S0_T1.bill_basis_dt,
						S0_T1.usr_cd,
						S0_T1.dpt_cd,
						S0_M3.dpt_nm,
						S0_M3.wg_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.rcv_no.as("setoff_rcv_no"),
						S0_T1.bcst_cd.as("setoff_bcst_cd"),
						S0_T2.bcst_cd.as("old_bcst_cd"),
						S0_T1.rcv_dt.as("setoff_dt"),
						S0_T1.trd_cur_cd.as("setoff_trd_cur_cd"),
						S0_T1.xrate.as("setoff_xrate"),
						decode(
							S0_T1.rcv_no,
							nullValue(),
							S0_T1.subttl1,
							S0_T2.rcv_amt
						).as("setoff_rcv_amt"),
						decode(
							S0_T1.rcv_no,
							nullValue(),
							value(0),
							S0_T2.not_proc_bal
						).as("setoff_not_proc_bal"),
						decode(
							S0_T1.rcv_no,
							nullValue(),
							S0_T1.subttl1,
							S0_T2.not_proc_bal.add(S0_T1.subttl1)
						).as("setoff_not_proc_bal_w"),
						S0_T1.ar_sttl_cd1.as("setoff_sttl_cd"),
						S0_T1.tax_cd1.as("setoff_tax_cd"),
						S0_T1.debt_cred_id_typ.as("setoff_debt_cred_id_typ"),
						S0_T1.debt_cred_id_cd.as("setoff_debt_cred_id_cd"),
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.FLEX.value()).eq(S0_T1.debt_cred_id_typ))
								.then(S0_T1.debt_cred_nm)
							.otherwise(S0_M9.bp_nm).as("setoff_debt_cred_nm"),
						S0_T1.bd_dpt_cd.as("setoff_bd_dpt_cd"),
						S0_M10.dpt_nm.as("setoff_bd_dpt_nm"),
						S0_T2.dat_typ.as("setoff_rcv_dat_typ"),
						S0_T1.trd_rmrks.as("setoff_trd_rmrks"),
						S0_T1.sub_char1.as("setoff_sub_char1"),
						S0_T1.sub_char2.as("setoff_sub_char2"),
						S0_T1.sub_char3.as("setoff_sub_char3"),
						S0_T1.upd_cntr.as("rcv_act_upd_cntr"),
						S0_T2.upd_cntr.as("rcv_upd_cntr")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.rcv_no.eq(S0_T2.rcv_no))
						.leftOuterJoin(S0_M3).on(
							S0_T1.dpt_cd.eq(S0_M3.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M9).on(S0_T1.debt_cred_id_cd.eq(S0_M9.bp_cd))
						.leftOuterJoin(S0_M10).on(
							S0_T1.bd_dpt_cd.eq(S0_M10.dpt_cd)
							.and(S0_T1.ac_dt.between(S0_M10.st_dt, S0_M10.end_dt))
						)
						.innerJoin(S0_M11).on(S0_T1.dpt_cd.eq(S0_M11.dpt_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.cutoff$and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.rcv_act_rev.eq(bind("rcv_act_rev"))
							.and(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm,
							m.trd_ptn_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
							r.setStringNE("trd_nm", m.trd_nm());
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
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("setoff_bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_bcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("setoff_trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("setoff_sttl_cd")
						))
						.addSelect(m -> toArray(
							m.ar_sttl_typ,
							m.sls_purc_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_sttl_nm", m.sttl_nm());
							r.setStringNE("setoff_sttl_typ", m.ar_sttl_typ());
							r.setStringNE("setoff_sls_purc_typ", m.sls_purc_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("setoff_tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_tax_nm", m.tax_nm());
							r.setNumberNE("setoff_tax_rate", m.tax_rate());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0210_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL0210_MST_RCV_S01() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_STTL_R S0_M5 = MAM_STTL_R.create("M5");
		MAM_STTL_R S0_M7 = MAM_STTL_R.create("M7");
		MAM_CO_SUB_R S1_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_CO_SUB_R S2_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_CO_SUB_R S3_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S3_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S4_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S4_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S5_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S5_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S6_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S6_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S7_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S7_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S8_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S8_MM2 = MAM_TAX_R.create("MM2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_no,
						S0_T1.slo_no,
						S0_T1.dat_typ.as("rcv_dat_typ"),
						S0_T1.rcst_cd,
						S0_T1.rcv_dt,
						S0_T1.bcst_cd,
						S0_M2.bp_nm.as("bcst_nm"),
						S0_T1.bill_dpt_cd,
						S0_M3.dpt_nm.as("bill_dpt_nm"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.rcv_amt,
						S0_T1.not_proc_bal.add(
							nvl(
								S0_T2.subttl1,
								value(0)
							)
						).as("not_proc_bal"),
						S0_T1.not_proc_bal.add(
							nvl(
								S0_T2.subttl1,
								value(0)
							)
						).as("not_proc_bal_w"),
						S0_T1.rcv_mtd_cd.as("ar_sttl_cd1"),
						S0_M5.ar_sttl_typ.as("ar_sttl_typ1"),
						S0_M5.sttl_nm.as("ar_sttl_nm1"),
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_M5.ar_setoff_cd.as("ar_sttl_cd2"),
						S0_M7.sttl_nm.as("ar_sttl_nm2"),
						S0_M7.sls_purc_typ.as("sls_purc_typ2"),
						S0_M7.debt_cred_id_typ,
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.BCST.value()).eq(S0_M7.debt_cred_id_typ))
								.then(S0_T1.bcst_cd)
							.otherwise(nullValue()).as("debt_cred_id_cd"),
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.BCST.value()).eq(S0_M7.debt_cred_id_typ))
								.then(S0_M2.bp_nm)
							.otherwise(nullValue()).as("debt_cred_nm"),
						cases()
							.when(S0_M5.ar_setoff_cd.isNull())
								.then(nullValue())
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S1_MM1.sls_tax_cd)
									.from(S1_MM1)
									.where(
										S1_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S1_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S2_MM1.purc_tax_cd)
									.from(S2_MM1)
									.where(
										S2_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S2_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("tax_cd"),
						cases()
							.when(S0_M5.ar_setoff_cd.isNull())
								.then(nullValue())
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S3_MM2.tax_nm)
									.from(
										S3_MM1
										.leftOuterJoin(S3_MM2).on(S3_MM1.sls_tax_cd.eq(S3_MM2.tax_cd))
									)
									.where(
										S3_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S3_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S4_MM2.tax_nm)
									.from(
										S4_MM1
										.leftOuterJoin(S4_MM2).on(S4_MM1.purc_tax_cd.eq(S4_MM2.tax_cd))
									)
									.where(
										S4_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S4_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("tax_nm"),
						cases()
							.when(S0_M5.ar_setoff_cd.isNull())
								.then(nullValue())
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S5_MM2.tax_rate)
									.from(
										S5_MM1
										.leftOuterJoin(S5_MM2).on(S5_MM1.sls_tax_cd.eq(S5_MM2.tax_cd))
									)
									.where(
										S5_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S5_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S6_MM2.tax_rate)
									.from(
										S6_MM1
										.leftOuterJoin(S6_MM2).on(S6_MM1.purc_tax_cd.eq(S6_MM2.tax_cd))
									)
									.where(
										S6_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S6_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("tax_rate"),
						cases()
							.when(S0_M5.ar_setoff_cd.isNull())
								.then(nullValue())
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S7_MM2.inc_tax_flg)
									.from(
										S7_MM1
										.leftOuterJoin(S7_MM2).on(S7_MM1.sls_tax_cd.eq(S7_MM2.tax_cd))
									)
									.where(
										S7_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S7_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M7.sls_purc_typ))
								.then(
									subQuery()
									.select(S8_MM2.inc_tax_flg)
									.from(
										S8_MM1
										.leftOuterJoin(S8_MM2).on(S8_MM1.purc_tax_cd.eq(S8_MM2.tax_cd))
									)
									.where(
										S8_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S8_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(value(false)).as("inc_tax_flg"),
						S0_T1.upd_cntr.as("rcv_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							S0_T1.rcv_no.eq(S0_T2.rcv_no)
							.and(S0_T2.rcv_act_no.eq(bind("rcv_act_no")))
							.and(S0_T2.rcv_act_seq.eq(bind("rcv_act_seq")))
						)
						.leftOuterJoin(S0_M2).on(S0_T1.bcst_cd.eq(S0_M2.bp_cd))
						.leftOuterJoin(S0_M3).on(
							S0_T1.bill_dpt_cd.eq(S0_M3.dpt_cd)
							.and(bind("ac_dt").between(S0_M3.st_dt, S0_M3.end_dt))
						)
						.leftOuterJoin(S0_M5).on(S0_T1.rcv_mtd_cd.eq(S0_M5.sttl_cd))
						.leftOuterJoin(S0_M7).on(S0_M5.ar_setoff_cd.eq(S0_M7.sttl_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_no.eq(bind("rcv_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_NOTE_R.class, r -> toCondition(
							r.getStringNE("join_note_mng_no_")
						))
						.addSelect(m -> toArray(
							m.accptr,
							m.draw_bank_cd,
							m.draw_branch_cd,
							m.draw_dt,
							m.drawer_nm,
							m.due_dt,
							m.endrsr,
							m.note_mng_no,
							m.note_no,
							m.note_rsn_cd,
							m.note_typ,
							m.sub_char1,
							m.sub_char2,
							m.sub_char3
						))
						.addMap((r, m) -> {
							r.setStringNE("note_mng_no", m.note_mng_no());
							r.setStringNE("note_no", m.note_no());
							r.setStringNE("note_typ", m.note_typ());
							r.setDateNE("draw_dt", m.draw_dt());
							r.setDateNE("due_dt", m.due_dt());
							r.setStringNE("drawer_nm", m.drawer_nm());
							r.setStringNE("endrsr", m.endrsr());
							r.setStringNE("accptr", m.accptr());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
							r.setStringNE("note_rsn_cd", m.note_rsn_cd());
							r.setStringNE("note_sub_char1", m.sub_char1());
							r.setStringNE("note_sub_char2", m.sub_char2());
							r.setStringNE("note_sub_char3", m.sub_char3());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("draw_bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("draw_bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("draw_bank_cd"),
							r.getStringNE("draw_branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("draw_branch_nm", m.branch_nm());
					}),
					j -> j
						.add(MAM_NOTE_RSN_R.class, r -> toCondition(
							r.getStringNE("note_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.note_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("note_rsn_nm", m.note_rsn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0210_MST_RCV_Query_S02
	 */
	static MCQueryPlan MSBGL0210_MST_RCV_S02() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MST_RCV_ACT_R S0_T2 = MST_RCV_ACT_R.create("T2");
		MAM_STTL_R S0_M3 = MAM_STTL_R.create("M3");
		MAM_CO_SUB_R S1_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_CO_SUB_R S2_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_CO_SUB_R S3_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S3_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S4_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S4_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S5_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S5_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S6_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S6_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S7_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S7_MM2 = MAM_TAX_R.create("MM2");
		MAM_CO_SUB_R S8_MM1 = MAM_CO_SUB_R.create("MM1");
		MAM_TAX_R S8_MM2 = MAM_TAX_R.create("MM2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0210_MST_RCV_Query_S02")
					.mainQuery()
					.select(
						S0_T1.rcv_no.as("setoff_rcv_no"),
						S0_T1.dat_typ.as("setoff_rcv_dat_typ"),
						S0_T1.bcst_cd.as("setoff_bcst_cd"),
						S0_T1.rcv_dt.as("setoff_dt"),
						S0_T1.trd_cur_cd.as("setoff_trd_cur_cd"),
						S0_T1.xrate.as("setoff_xrate"),
						S0_T1.rcv_amt.as("setoff_rcv_amt"),
						S0_T1.not_proc_bal.add(
							nvl(
								S0_T2.subttl1,
								value(0)
							)
						).as("setoff_not_proc_bal"),
						S0_T1.not_proc_bal.add(
							nvl(
								S0_T2.subttl1,
								value(0)
							)
						).as("setoff_not_proc_bal_w"),
						S0_T1.rcv_mtd_cd.as("setoff_sttl_cd1"),
						S0_M3.sttl_nm.as("setoff_sttl_nm1"),
						S0_M3.sls_purc_typ.as("setoff_sls_purc_typ"),
						S0_T1.bsppl_cd.as("setoff_debt_cred_id_cd"),
						S0_M3.debt_cred_id_typ.as("setoff_debt_cred_id_typ"),
						cases()
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S1_MM1.sls_tax_cd)
									.from(S1_MM1)
									.where(
										S1_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S1_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S2_MM1.purc_tax_cd)
									.from(S2_MM1)
									.where(
										S2_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S2_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("setoff_tax_cd"),
						cases()
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S3_MM2.tax_nm)
									.from(
										S3_MM1
										.leftOuterJoin(S3_MM2).on(S3_MM1.sls_tax_cd.eq(S3_MM2.tax_cd))
									)
									.where(
										S3_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S3_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S4_MM2.tax_nm)
									.from(
										S4_MM1
										.leftOuterJoin(S4_MM2).on(S4_MM1.purc_tax_cd.eq(S4_MM2.tax_cd))
									)
									.where(
										S4_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S4_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("setoff_tax_nm"),
						cases()
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S5_MM2.tax_rate)
									.from(
										S5_MM1
										.leftOuterJoin(S5_MM2).on(S5_MM1.sls_tax_cd.eq(S5_MM2.tax_cd))
									)
									.where(
										S5_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S5_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S6_MM2.tax_rate)
									.from(
										S6_MM1
										.leftOuterJoin(S6_MM2).on(S6_MM1.purc_tax_cd.eq(S6_MM2.tax_cd))
									)
									.where(
										S6_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S6_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(nullValue()).as("setoff_tax_rate"),
						cases()
							.when(value(MAC_SLS_PURC_TYP.SLS.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S7_MM2.inc_tax_flg)
									.from(
										S7_MM1
										.leftOuterJoin(S7_MM2).on(S7_MM1.sls_tax_cd.eq(S7_MM2.tax_cd))
									)
									.where(
										S7_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S7_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.when(value(MAC_SLS_PURC_TYP.PURC.value()).eq(S0_M3.sls_purc_typ))
								.then(
									subQuery()
									.select(S8_MM2.inc_tax_flg)
									.from(
										S8_MM1
										.leftOuterJoin(S8_MM2).on(S8_MM1.purc_tax_cd.eq(S8_MM2.tax_cd))
									)
									.where(
										S8_MM1.st_dt.lte(S0_T1.rcv_dt)
										.and(S8_MM1.end_dt.gte(S0_T1.rcv_dt))
									)
							)
							.otherwise(value(false)).as("setoff_inc_tax_flg"),
						S0_T1.ac_dt.as("setoff_ac_dt"),
						S0_T1.upd_cntr.as("rcv_upd_cntr")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							S0_T1.rcv_no.eq(S0_T2.rcv_no)
							.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(S0_T2.rcv_act_no.eq(bind("rcv_act_no")))
							.and(S0_T2.rcv_act_seq.eq(bind("rcv_act_seq")))
						)
						.leftOuterJoin(S0_M3).on(S0_T1.rcv_mtd_cd.eq(S0_M3.sttl_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_no.eq(bind("setoff_rcv_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("setoff_bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_bcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("setoff_trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_trd_cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("setoff_debt_cred_id_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("setoff_debt_cred_nm", m.bp_nm());
					})
				)
			);
	}
}