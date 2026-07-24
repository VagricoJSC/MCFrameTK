package mcframe.serverMSBG.MSBGL5050;

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
	 * -- MSBGL5050_MST_RCV_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_D_S01() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MST_RCV_ACT_R S0_T3 = MST_RCV_ACT_R.create("T3");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.disp_seq,
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_T3.bcst_cd)
							.otherwise(S0_T1.bcst_cd).as("bcst_cd"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M5.bp_nm)
							.otherwise(S0_M1.bp_nm).as("bcst_nm"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M5.bp_alt_nm1)
							.otherwise(S0_M1.bp_alt_nm1).as("bcst_alt_nm1"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M5.bp_alt_nm2)
							.otherwise(S0_M1.bp_alt_nm2).as("bcst_alt_nm2"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M5.bp_alt_nm3)
							.otherwise(S0_M1.bp_alt_nm3).as("bcst_alt_nm3"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M5.bp_alt_nm4)
							.otherwise(S0_M1.bp_alt_nm4).as("bcst_alt_nm4"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_T3.bill_dpt_cd)
							.otherwise(S0_T1.bill_dpt_cd).as("bill_dpt_cd"),
						cases()
							.when(
								bracket(
									S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_ADV.value()))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_SUSP.value())))
									.or(S0_T3.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())))
								)
							)
								.then(S0_M6.dpt_nm)
							.otherwise(S0_M2.dpt_nm).as("bill_dpt_nm"),
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_M4.dpt_nm.as("ar_dpt_nm"),
						S0_T1.ar_typ,
						S0_T1.iv_no.as("iv_no_data"),
						S0_T1.wrk_no,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.bcst_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M2.dpt_cd)
								.and(bind("ac_dt").between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M4.dpt_cd)
								.and(bind("ac_dt").between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T3.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T3.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T3.bcst_cd.eq(S0_M5.bp_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T3.bill_dpt_cd.eq(S0_M6.dpt_cd)
								.and(bind("ac_dt").between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
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
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("acst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("acst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("acst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("acst_alt_nm4", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_D_Query_S02
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_D_S02() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.disp_seq,
						S0_T1.bill_dpt_cd.as("bill_dpt_cd_fr"),
						S0_M1.dpt_nm.as("bill_dpt_nm_fr"),
						S0_T1.acst_cd.as("acst_cd_fr"),
						S0_T1.ar_dpt_cd.as("ar_dpt_cd_fr"),
						S0_M3.dpt_nm.as("ar_dpt_nm_fr"),
						S0_T1.ar_typ,
						S0_T1.iv_no.as("iv_no_data"),
						S0_T1.wrk_no.as("wrk_no_fr"),
						S0_T1.trd_cur_amt1,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M1.dpt_cd)
								.and(bind("ac_dt").between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M3.dpt_cd)
								.and(bind("ac_dt").between(S0_M3.st_dt, S0_M3.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no_fr")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm_fr", m.wrk_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd_fr")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm_fr", m.bp_nm());
							r.setStringNE("acst_alt_nm1_fr", m.bp_alt_nm1());
							r.setStringNE("acst_alt_nm2_fr", m.bp_alt_nm2());
							r.setStringNE("acst_alt_nm3_fr", m.bp_alt_nm3());
							r.setStringNE("acst_alt_nm4_fr", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_D_Query_S03
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_D_S03() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_D_Query_S03")
					.mainQuery()
					.select(
						S0_T1.disp_seq,
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_M2.dpt_nm.as("ar_dpt_nm"),
						S0_T1.ar_typ,
						S0_T1.iv_no.as("iv_no_data"),
						S0_T1.wrk_no,
						S0_T1.trd_cur_amt1,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M2.dpt_cd)
								.and(bind("ac_dt").between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
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
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("acst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("acst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("acst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("acst_alt_nm4", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_D_Query_S04
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_D_S04() {
		MST_RCV_ACT_D_R S0_T1 = MST_RCV_ACT_D_R.create("T1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_D_Query_S04")
					.mainQuery()
					.select(
						S0_T1.disp_seq,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M2.dpt_nm.as("bill_dpt_nm"),
						S0_T1.acst_cd,
						S0_T1.ar_dpt_cd,
						S0_M4.dpt_nm.as("ar_dpt_nm"),
						S0_T1.ar_typ,
						S0_T1.iv_no.as("iv_no_data"),
						S0_T1.wrk_no,
						S0_T1.trd_cur_tax_amt1,
						S0_T1.base_cur_tax_amt1,
						S0_T1.sub_char1.as("d_sub_char1"),
						S0_T1.sub_char2.as("d_sub_char2"),
						S0_T1.sub_char3.as("d_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M2.dpt_cd)
								.and(bind("ac_dt").between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M4.dpt_cd)
								.and(bind("ac_dt").between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
					.orderBy(S0_T1.disp_seq.asc())
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
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
							r.setStringNE("acst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("acst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("acst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("acst_alt_nm4", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_S01() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R S0_T2 = MST_RCV_ACT_D_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_T1.ar_sttl_cd1.as("rcv_mtd_cd"),
						S0_T1.rcv_dt,
						S0_T1.ar_sttl_cd2.as("ar_setoff_nm"),
						S0_T1.rcst_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_T1.rcv_no,
						S0_T2.gen_rcv_no.as("adv_gen_rcv_no"),
						S0_T1.trd_cd,
						S0_T1.ac_dt,
						S0_T1.subttl1,
						S0_T1.subttl2,
						S0_T1.note_no,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_"),
						// this field is appended by sql coverter.
						S0_T1.tax_cd2.as("join_tax_cd2_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_RCV_R.class, r -> toCondition(
							r.getStringNE("rcv_no")
						))
						.addSelect(m -> toArray(
							m.not_proc_bal
						))
						.addMap((r, m) -> {
							r.setNumberNE("not_proc_bal", m.not_proc_bal());
					}),
					j -> j
						.add(MST_NOTE_R.class, r -> toCondition(
							r.getStringNE("join_note_mng_no_")
						))
						.addSelect(m -> toArray(
							m.accptr,
							m.draw_bank_cd,
							m.draw_branch_cd,
							m.drawer_nm,
							m.due_dt,
							m.endrsr,
							m.note_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("note_typ", m.note_typ());
							r.setDateNE("due_dt", m.due_dt());
							r.setStringNE("drawer_nm", m.drawer_nm());
							r.setStringNE("endrsr", m.endrsr());
							r.setStringNE("accptr", m.accptr());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
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
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("rcv_mtd_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_mtd_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_setoff_nm")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_setoff_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd2_")
						))
						.addSelect(m -> toArray(
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
							r.setStringNE("rcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("rcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("rcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("rcst_alt_nm4", m.bp_alt_nm4());
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
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm,
							m.bank_ac_no,
							m.bank_cd,
							m.branch_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
							r.setStringNE("bank_cd", m.bank_cd());
							r.setStringNE("branch_cd", m.branch_cd());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("bank_cd"),
							r.getStringNE("branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("branch_nm", m.branch_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("report_title", m.trd_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_Query_S02
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_S02() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R S0_T2 = MST_RCV_ACT_D_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_USR_R S0_M2 = MAM_USR_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_TRD_R S0_M9 = MAM_TRD_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_M2.usr_nm,
						S0_T1.rcv_dt,
						S0_T1.bcst_cd.as("bcst_cd_to"),
						S0_M3.bp_nm.as("bcst_nm_to"),
						S0_M3.bp_alt_nm1.as("bcst_alt_nm1_to"),
						S0_M3.bp_alt_nm2.as("bcst_alt_nm2_to"),
						S0_M3.bp_alt_nm3.as("bcst_alt_nm3_to"),
						S0_M3.bp_alt_nm4.as("bcst_alt_nm4_to"),
						S0_T2.acst_cd.as("acst_cd_to"),
						S0_M4.bp_nm.as("acst_nm_to"),
						S0_M4.bp_alt_nm1.as("acst_alt_nm1_to"),
						S0_M4.bp_alt_nm2.as("acst_alt_nm2_to"),
						S0_M4.bp_alt_nm3.as("acst_alt_nm3_to"),
						S0_M4.bp_alt_nm4.as("acst_alt_nm4_to"),
						S0_T1.bill_dpt_cd.as("bill_dpt_cd_to"),
						S0_M5.dpt_nm.as("bill_dpt_nm_to"),
						S0_T2.ar_dpt_cd.as("ar_dpt_cd_to"),
						S0_M6.dpt_nm.as("ar_dpt_nm_to"),
						S0_T2.wrk_no.as("wrk_no_to"),
						S0_T3.wrk_nm.as("wrk_nm_to"),
						S0_T1.trd_cur_cd,
						S0_M7.cur_nm.as("trd_cur_nm"),
						sum(S0_T2.trd_cur_amt1).as("trd_cur_amt"),
						S0_T1.trd_rmrks,
						S0_T2.bcst_cd.as("bcst_cd_fr"),
						S0_M8.bp_nm.as("bcst_nm_fr"),
						S0_M8.bp_alt_nm1.as("bcst_alt_nm1_fr"),
						S0_M8.bp_alt_nm2.as("bcst_alt_nm2_fr"),
						S0_M8.bp_alt_nm3.as("bcst_alt_nm3_fr"),
						S0_M8.bp_alt_nm4.as("bcst_alt_nm4_fr"),
						S0_T1.trd_cd,
						S0_M9.trd_nm.as("report_title"),
						S0_T1.ac_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.par_rcv_act_no,
						S0_T1.par_rcv_act_seq
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.wrk_no.eq(S0_T3.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.usr_cd.eq(S0_M2.usr_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T1.bcst_cd.eq(S0_M3.bp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T2.acst_cd.eq(S0_M4.bp_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T2.ar_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.trd_cur_cd.eq(S0_M7.cur_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.bcst_cd.eq(S0_M8.bp_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.trd_cd.eq(S0_M9.trd_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
					.groupBy(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_M2.usr_nm,
						S0_T1.rcv_dt,
						S0_T1.bcst_cd,
						S0_M3.bp_nm,
						S0_M3.bp_alt_nm1,
						S0_M3.bp_alt_nm2,
						S0_M3.bp_alt_nm3,
						S0_M3.bp_alt_nm4,
						S0_T2.acst_cd,
						S0_M4.bp_nm,
						S0_M4.bp_alt_nm1,
						S0_M4.bp_alt_nm2,
						S0_M4.bp_alt_nm3,
						S0_M4.bp_alt_nm4,
						S0_T1.bill_dpt_cd,
						S0_M5.dpt_nm,
						S0_T2.ar_dpt_cd,
						S0_M6.dpt_nm,
						S0_T2.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.trd_cur_cd,
						S0_M7.cur_nm,
						S0_T1.trd_rmrks,
						S0_T2.bcst_cd,
						S0_M8.bp_nm,
						S0_M8.bp_alt_nm1,
						S0_M8.bp_alt_nm2,
						S0_M8.bp_alt_nm3,
						S0_M8.bp_alt_nm4,
						S0_T1.trd_cd,
						S0_M9.trd_nm,
						S0_T1.ac_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.par_rcv_act_no,
						S0_T1.par_rcv_act_seq
					)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_Query_S03
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_S03() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_T1.ar_sttl_cd1,
						S0_T1.rcv_dt.as("setoff_dt"),
						S0_T1.xrate,
						S0_T1.trd_cur_cd,
						S0_T1.debt_cred_id_cd,
						S0_T1.debt_cred_id_typ,
						cases()
							.when(S0_T1.debt_cred_id_typ.eq(value(MAC_DEBT_CRED_ID_TYP.FLEX.value())))
								.then(S0_T1.debt_cred_nm)
							.otherwise(S0_M6.bp_nm).as("debt_cred_nm"),
						S0_M6.bp_alt_nm1.as("debt_cred_alt_nm1"),
						S0_M6.bp_alt_nm2.as("debt_cred_alt_nm2"),
						S0_M6.bp_alt_nm3.as("debt_cred_alt_nm3"),
						S0_M6.bp_alt_nm4.as("debt_cred_alt_nm4"),
						S0_T1.bd_dpt_cd.as("chrg_dpt_cd"),
						S0_M7.dpt_nm.as("chrg_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.trd_cd,
						S0_T1.ac_dt,
						S0_T1.subttl1,
						S0_T1.rcv_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						// this field is appended by sql coverter.
						S0_T1.tax_cd1.as("join_tax_cd1_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.debt_cred_id_cd.eq(S0_M6.bp_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M7.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M7.st_dt, S0_M7.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_RCV_R.class, r -> toCondition(
							r.getStringNE("rcv_no")
						))
						.addSelect(m -> toArray(
							m.not_proc_bal
						))
						.addMap((r, m) -> {
							r.setNumberNE("not_proc_bal", m.not_proc_bal());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd1_")
						))
						.addSelect(m -> toArray(
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setNumberNE("tax_rate", m.tax_rate());
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
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("report_title", m.trd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_Query_S04
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_S04() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R S0_T2 = MST_RCV_ACT_D_R.create("T2");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_Query_S04")
					.mainQuery()
					.select(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_T1.rcv_dt,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M4.dpt_nm.as("bill_dpt_nm"),
						S0_T2.wrk_no,
						S0_T1.trd_cur_cd.as("cur_cd"),
						S0_T1.base_cur_cd.as("base_cur_cd"),
						S0_T1.tax_cd1.as("tax_cd"),
						S0_T1.trd_cd,
						S0_T1.ac_dt,
						S0_T1.tax_subttl1,
						S0_T1.base_cur_tax_subttl1,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.rcv_act_no.eq(S0_T2.rcv_act_no)
								.and(S0_T1.rcv_act_seq.eq(S0_T2.rcv_act_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M4.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bcst_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm,
							m.amt_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm,
							m.amt_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
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
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("report_title", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
							r.setStringNE("rcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("rcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("rcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("rcst_alt_nm4", m.bp_alt_nm4());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_ACT_Query_S05
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_ACT_S05() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_DPT_R S0_M13 = MAM_DPT_R.create("M13");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_ACT_Query_S05")
					.mainQuery()
					.select(
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.usr_cd,
						S0_T1.ar_sttl_cd1,
						S0_T1.rcv_dt,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_T1.rcv_no,
						S0_T1.ar_sttl_cd3,
						S0_T1.debt_cred_id_cd,
						cases()
							.when(S0_T1.debt_cred_id_typ.eq(value(MAC_DEBT_CRED_ID_TYP.FLEX.value())))
								.then(S0_T1.debt_cred_nm)
							.otherwise(S0_M12.bp_nm).as("debt_cred_nm"),
						S0_M12.bp_alt_nm1.as("debt_cred_alt_nm1"),
						S0_M12.bp_alt_nm2.as("debt_cred_alt_nm2"),
						S0_M12.bp_alt_nm3.as("debt_cred_alt_nm3"),
						S0_M12.bp_alt_nm4.as("debt_cred_alt_nm4"),
						S0_T1.bd_dpt_cd.as("chrg_dpt_cd"),
						S0_M13.dpt_nm.as("chrg_dpt_nm"),
						S0_T1.trd_rmrks,
						S0_T1.trd_cd,
						S0_T1.ac_dt,
						S0_T1.subttl1,
						S0_T1.note_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.debt_cred_id_cd.eq(S0_M12.bp_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M13.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M13.st_dt, S0_M13.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.rcv_act_seq.eq(bind("rcv_act_seq")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_RCV_R.class, r -> toCondition(
							r.getStringNE("rcv_no")
						))
						.addSelect(m -> toArray(
							m.not_proc_bal
						))
						.addMap((r, m) -> {
							r.setNumberNE("not_proc_bal", m.not_proc_bal());
					}),
					j -> j
						.add(MST_NOTE_R.class, r -> toCondition(
							r.getStringNE("join_note_mng_no_")
						))
						.addSelect(m -> toArray(
							m.accptr,
							m.draw_bank_cd,
							m.draw_branch_cd,
							m.drawer_nm,
							m.due_dt,
							m.endrsr,
							m.note_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("note_typ", m.note_typ());
							r.setDateNE("due_dt", m.due_dt());
							r.setStringNE("drawer_nm", m.drawer_nm());
							r.setStringNE("endrsr", m.endrsr());
							r.setStringNE("accptr", m.accptr());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
							r.setStringNE("rcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("rcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("rcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("rcst_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bcst_alt_nm4", m.bp_alt_nm4());
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
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm,
							m.bank_ac_no,
							m.bank_cd,
							m.branch_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
							r.setStringNE("bank_cd", m.bank_cd());
							r.setStringNE("branch_cd", m.branch_cd());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("bank_cd"),
							r.getStringNE("branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("branch_nm", m.branch_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd3")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm3", m.sttl_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("report_title", m.trd_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5050_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL5050_MST_RCV_S01() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5050_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_no,
						S0_T1.rcv_dpt_cd,
						S0_M1.dpt_nm.as("rcv_dpt_nm"),
						S0_T1.rcv_usr_cd,
						S0_T1.rcv_mtd_cd,
						S0_T1.rcv_dt,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.rcv_amt,
						S0_T1.rcv_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.seq_no,
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.rcv_dpt_cd.eq(S0_M1.dpt_cd)
								.and(S0_T1.rcv_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.bill_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.rcv_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
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
							m.drawer_nm,
							m.due_dt,
							m.endrsr,
							m.note_no,
							m.note_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("note_no", m.note_no());
							r.setStringNE("note_typ", m.note_typ());
							r.setDateNE("due_dt", m.due_dt());
							r.setStringNE("drawer_nm", m.drawer_nm());
							r.setStringNE("endrsr", m.endrsr());
							r.setStringNE("accptr", m.accptr());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rcv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("rcv_mtd_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_mtd_nm", m.sttl_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcst_nm", m.bp_nm());
							r.setStringNE("rcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("rcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("rcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("rcst_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bcst_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bcst_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bcst_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bcst_alt_nm4", m.bp_alt_nm4());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm,
							m.bank_ac_no,
							m.bank_cd,
							m.branch_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
							r.setStringNE("bank_cd", m.bank_cd());
							r.setStringNE("branch_cd", m.branch_cd());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
					}),
					j -> j
						.add(MAM_BANK_R.class, r -> toCondition(
							r.getStringNE("bank_cd")
						))
						.addSelect(m -> toArray(
							m.bank_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_nm", m.bank_nm());
					}),
					j -> j
						.add(MAM_BANK_BRANCH_R.class, r -> toCondition(
							r.getStringNE("bank_cd"),
							r.getStringNE("branch_cd")
						))
						.addSelect(m -> toArray(
							m.branch_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("branch_nm", m.branch_nm());
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
					})
				)
			);
	}
}