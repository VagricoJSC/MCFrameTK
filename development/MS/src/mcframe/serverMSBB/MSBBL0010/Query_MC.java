package mcframe.serverMSBB.MSBBL0010;

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
	 * -- MSBBL0010_MST_CST_FRCST_D_Query_S01
	 */
	static MCQueryPlan MSBBL0010_MST_CST_FRCST_D_S01() {
		MST_CST_FRCST_D_R S0_T1 = MST_CST_FRCST_D_R.create("T1");
		MST_CST_FRCST_H_R S0_T2 = MST_CST_FRCST_H_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAVM_ITM_UNIT_R S0_M3 = MAVM_ITM_UNIT_R.create("M3");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0010_MST_CST_FRCST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.cst_frcst_no,
						S0_T1.cst_frcst_d_no,
						S0_T1.fix_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_T1.frcst_period_typ,
						S0_T1.frcst_st_dt,
						S0_T1.frcst_end_dt,
						S0_T1.frcst_dt,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_M2.unit_nm.as("trd_unit_nm"),
						S0_M3.dec_place.as("trd_unit_dec_place"),
						S0_M3.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M3.conv_qty.as("trd_unit_conv_qty"),
						S0_M3.rnd_typ.as("trd_unit_rnd_typ"),
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_M4.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.gi_loc_cd,
						S0_M5.loc_nm.as("gi_loc_nm"),
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.cst_frcst_slip_d_no,
						S0_T1.disp_seq,
						S0_T1.prms_qty,
						S0_T1.frcst_stop_flg,
						S0_T1.intr_rmrks.as("dtl_intr_rmrks"),
						S0_T1.sub_char1.as("dtl_sub_char1"),
						S0_T1.sub_char2.as("dtl_sub_char2"),
						S0_T1.sub_char3.as("dtl_sub_char3")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.cst_frcst_no.eq(S0_T1.cst_frcst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_M1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(S0_M2.unit_cd.eq(S0_T1.trd_unit_cd))
						.leftOuterJoin(S0_M3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_M3.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_M3.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M3.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M3.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M3.unit_cd.eq(S0_T1.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(S0_M4.unit_cd.eq(S0_T1.base_unit_cd))
						.leftOuterJoin(S0_M5).on(S0_M5.loc_cd.eq(S0_T1.gi_loc_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.cst_frcst_no.eq(bind("cst_frcst_no")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBBL0010_MST_CST_FRCST_D_Query_S02
	 */
	static MCQueryPlan MSBBL0010_MST_CST_FRCST_D_S02() {
		MCTempView S0_T = createTempView("T");
		MCTempView S0_T1 = createTempView("T1");
		MCTempView S0_T2 = createTempView("T2");
		MCTempView S0_T3 = createTempView("T3");
		MST_CST_FRCST_H_R S2_T1 = MST_CST_FRCST_H_R.create("T1");
		MST_CST_FRCST_D_R S2_T2 = MST_CST_FRCST_D_R.create("T2");
		MCTempView S2_T3 = createTempView("T3");
		MST_CST_FRCST_H_R S3_T1 = MST_CST_FRCST_H_R.create("T1");
		MST_CST_FRCST_D_R S3_T2 = MST_CST_FRCST_D_R.create("T2");
		MST_SPLN_SUM_ITM_NEW_R S4_T = MST_SPLN_SUM_ITM_NEW_R.create("T");
		MST_SPLN_SUM_ITM_NEW_R S5_TMP = MST_SPLN_SUM_ITM_NEW_R.create("TMP");
		MST_SLO_R S6_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S6_T2 = MST_SLO_D_R.create("T2");
		MST_SHIP_PR_R S6_T3 = MST_SHIP_PR_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0010_MST_CST_FRCST_D_Query_S02")
					.mainQuery()
					.select(
						S0_T.pr("peg_no"),
						S0_T1.pr("last_rcpt_dt"),
						S0_T1.pr("last_cst_frcst_prnt_dt"),
						S0_T1.pr("last_qty"),
						S0_T2.pr("spln_qty"),
						S0_T3.pr("slo_qty")
					)
					.from(
						subQuery()
						.select(bind("peg_no").as("peg_no"))
						.view(S0_T)
						.leftOuterJoin(
							subQuery()
							.select(
								bind("peg_no").as("peg_no"),
								S2_T3.pr("rcpt_dt").as("last_rcpt_dt"),
								S2_T1.cst_frcst_prnt_dt.as("last_cst_frcst_prnt_dt"),
								sum(S2_T2.base_unit_qty).as("last_qty")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									bracket(
										S2_T1.cst_frcst_no.eq(S2_T2.cst_frcst_no)
									)
								)
								.innerJoin(
									subQuery()
									.select(
										bind("peg_no").as("peg_no"),
										max(S3_T1.rcpt_dt).as("rcpt_dt")
									)
									.from(
										S3_T1
										.innerJoin(S3_T2).on(
											bracket(
												S3_T1.cst_frcst_no.eq(S3_T2.cst_frcst_no)
											)
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S3_T1.can_flg.eq(value(false)))
										.and(S3_T1.cst_cd.eq(bind("cst_cd")))
										.and(
											S3_T1.dlv_cd.isNull()
											.and(bind("dlv_cd").isNull())
											.or(S3_T1.dlv_cd.eq(bind("dlv_cd")))
										)
										.and(
											S3_T1.wrk_no.isNull()
											.and(bind("wrk_no").isNull())
											.or(S3_T1.wrk_no.eq(bind("wrk_no")))
										)
										.and(S3_T1.frcst_dpt_cd.eq(bind("frcst_dpt_cd")))
										.and(S3_T1.rcpt_dt.lt(bind("rcpt_dt")))
										.and(S3_T2.itm_cd.eq(bind("itm_cd")))
										.and(S3_T2.itm_sub1.eq(bind("itm_sub1")))
										.and(S3_T2.itm_sub2.eq(bind("itm_sub2")))
										.and(S3_T2.itm_sub3.eq(bind("itm_sub3")))
										.and(S3_T2.frcst_period_typ.eq(bind("frcst_period_typ")))
										.and(S3_T2.frcst_dt.eq(bind("frcst_dt")))
									)
									.groupBy(bind("peg_no")).view(S2_T3)
								).on(
									bracket(
										S2_T1.rcpt_dt.eq(S2_T3.pr("rcpt_dt"))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.can_flg.eq(value(false)))
								.and(S2_T1.cst_cd.eq(bind("cst_cd")))
								.and(
									S2_T1.dlv_cd.isNull()
									.and(bind("dlv_cd").isNull())
									.or(S2_T1.dlv_cd.eq(bind("dlv_cd")))
								)
								.and(
									S2_T1.wrk_no.isNull()
									.and(bind("wrk_no").isNull())
									.or(S2_T1.wrk_no.eq(bind("wrk_no")))
								)
								.and(S2_T1.frcst_dpt_cd.eq(bind("frcst_dpt_cd")))
								.and(S2_T2.itm_cd.eq(bind("itm_cd")))
								.and(S2_T2.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T2.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T2.itm_sub3.eq(bind("itm_sub3")))
								.and(S2_T2.frcst_period_typ.eq(bind("frcst_period_typ")))
								.and(S2_T2.frcst_dt.eq(bind("frcst_dt")))
							)
							.groupBy(
								bind("peg_no"),
								S2_T1.cst_frcst_prnt_dt,
								S2_T3.pr("rcpt_dt")
							).view(S0_T1)
						).on(
							bracket(
								S0_T.pr("peg_no").eq(S0_T1.pr("peg_no"))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								bind("peg_no").as("peg_no"),
								sum(S4_T.spln_qty).as("spln_qty")
							)
							.from(S4_T)
							.where(
								value(0).eq(value(0))
								.and(MAC_PERIOD_TYP$IS_MONTHLY(bind("frcst_period_typ")).eq(value(true)))
								.and(S4_T.dpt_cd.eq(bind("frcst_dpt_cd")))
								.and(S4_T.cst_cd.eq(bind("cst_cd")))
								.and(
									S4_T.wrk_no.eq(value(MAC_STR.NULL_VAL.value()))
									.and(bind("wrk_no").isNull())
									.or(S4_T.wrk_no.eq(bind("wrk_no")))
								)
								.and(S4_T.itm_cd.eq(bind("itm_cd")))
								.and(S4_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S4_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S4_T.itm_sub3.eq(bind("itm_sub3")))
								.and(S4_T.spln_ym.eq(bind("frcst_dt")))
								.and(
									S4_T.ym.in(
										subQuery()
										.select(max(S5_TMP.ym))
										.from(S5_TMP)
										.where(
											value(0).eq(value(0))
											.and(S5_TMP.dpt_cd.eq(S4_T.dpt_cd))
											.and(S5_TMP.cst_cd.eq(S4_T.cst_cd))
											.and(S5_TMP.wrk_no.eq(S4_T.wrk_no))
											.and(S5_TMP.itm_cd.eq(S4_T.itm_cd))
											.and(S5_TMP.itm_sub1.eq(S4_T.itm_sub1))
											.and(S5_TMP.itm_sub2.eq(S4_T.itm_sub2))
											.and(S5_TMP.itm_sub3.eq(S4_T.itm_sub3))
											.and(S5_TMP.spln_ym.eq(S4_T.spln_ym))
										)
									)
								)
							).view(S0_T2)
						).on(
							bracket(
								S0_T.pr("peg_no").eq(S0_T2.pr("peg_no"))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								bind("peg_no").as("peg_no"),
								sum(S6_T2.base_unit_qty).as("slo_qty")
							)
							.from(
								S6_T1
								.innerJoin(S6_T2).on(
									bracket(
										S6_T1.slo_no.eq(S6_T2.slo_no)
									)
								)
								.innerJoin(S6_T3).on(
									bracket(
										S6_T2.slo_d_no.eq(S6_T3.slo_d_no)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S6_T1.can_flg.eq(value(false)))
								.and(S6_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
								.and(S6_T2.can_flg.eq(value(false)))
								.and(S6_T2.abort_flg.eq(value(false))
								.or(bracket(S6_T2.abort_flg.eq(value(true)).and(S6_T3.ship_schd_abort_qty.lt(S6_T3.base_unit_qty)))))
								.and(S6_T2.bd_dpt_cd.isNull())
								.and(S6_T1.cst_cd.eq(bind("cst_cd")))
								.and(S6_T1.sls_dpt_cd.eq(bind("frcst_dpt_cd")))
								.and(
									S6_T1.wrk_no.isNull()
									.and(bind("wrk_no").isNull())
									.or(S6_T1.wrk_no.eq(bind("wrk_no")))
								)
								.and(S6_T2.itm_cd.eq(bind("itm_cd")))
								.and(S6_T2.itm_sub1.eq(bind("itm_sub1")))
								.and(S6_T2.itm_sub2.eq(bind("itm_sub2")))
								.and(S6_T2.itm_sub3.eq(bind("itm_sub3")))
								.and(
									trunc(
										S6_T2.dlv_rqst_tm,
										MCDateFmt.DD
									).gte(bind("frcst_st_dt"))
								)
								.and(
									trunc(
										S6_T2.dlv_rqst_tm,
										MCDateFmt.DD
									).lte(bind("frcst_end_dt"))
								)
							)
							.groupBy(bind("peg_no")).view(S0_T3)
						).on(
							bracket(
								S0_T.pr("peg_no").eq(S0_T3.pr("peg_no"))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}
	
	/**
	 * -- MSBBL0010_MST_CST_FRCST_H_Query_S01
	 */
	static MCQueryPlan MSBBL0010_MST_CST_FRCST_H_S01() {
		MST_CST_FRCST_H_R S0_T1 = MST_CST_FRCST_H_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_WRK_R S0_T2 = MST_WRK_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MST_SLO_RSN_R S0_M5 = MST_SLO_RSN_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0010_MST_CST_FRCST_H_Query_S01")
					.mainQuery()
					.select(
						S0_T1.cst_frcst_no,
						S0_T1.cst_cd,
						S0_M1.bp_nm.as("cst_nm"),
						S0_T1.dlv_cd,
						S0_M2.bp_nm.as("dlv_nm"),
						S0_T1.cst_frcst_prnt_dt,
						S0_T1.cst_frcst_slip_no,
						S0_T1.frcst_dpt_cd,
						S0_M3.dpt_nm.as("frcst_dpt_nm"),
						S0_T1.frcst_usr_cd,
						S0_M4.usr_nm.as("frcst_usr_nm"),
						S0_T1.wrk_no,
						S0_T2.wrk_nm,
						S0_T1.rcpt_dt,
						S0_T1.can_rsn_cd,
						S0_M5.slo_rsn_nm.as("can_rsn_nm"),
						S0_T1.can_flg,
						S0_T1.can_rmrks,
						S0_T1.intr_rmrks,
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
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.frcst_dpt_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(S0_T2.wrk_no.eq(S0_T1.wrk_no))
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.cst_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M2.bp_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.frcst_dpt_cd.eq(S0_M3.dpt_cd)
								.and(S0_T1.cst_frcst_prnt_dt.between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.frcst_usr_cd.eq(S0_M4.usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(S0_M5.slo_rsn_cd.eq(S0_T1.can_rsn_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.cst_frcst_no.eq(bind("cst_frcst_no")))
					)
			);
	}
}