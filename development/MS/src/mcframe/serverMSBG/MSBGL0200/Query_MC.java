package mcframe.serverMSBG.MSBGL0200;

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
	 * -- MSBGL0200_MST_RCV_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL0200_MST_RCV_ACT_S01() {
		MST_RCV_ACT_R S0_T1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_R S0_T2 = MST_RCV_R.create("T2");
		MST_RCV_R S0_T4 = MST_RCV_R.create("T4");
		MAM_DPT_R S0_M3 = MAM_DPT_R.create("M3");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_DPT_R S0_M14 = MAM_DPT_R.create("M14");
		MAVM_RD_DPT_R S0_M19 = MAVM_RD_DPT_R.create("M19");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0200_MST_RCV_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.ac_ym,
						S0_T1.rcv_act_no,
						S0_T1.rcv_act_seq,
						S0_T1.rcv_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.ac_dt,
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
						S0_T1.rcst_cd,
						S0_T2.rcst_cd.as("old_rcst_cd"),
						S0_T1.bcst_cd,
						S0_T2.bcst_cd.as("old_bcst_cd"),
						S0_T1.rcv_dt,
						S0_T4.div_flg,
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
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.upd_cntr.as("rcv_act_upd_cntr"),
						S0_T2.upd_cntr.as("rcv_upd_cntr"),
						S0_T1.note_no,
						S0_T1.ar_sttl_cd3,
						// this field is appended by sql coverter.
						S0_T2.note_mng_no.as("join_note_mng_no_")
						,S0_T1.bill_dtl_adv_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.rcv_no.eq(S0_T2.rcv_no))
						.leftOuterJoin(S0_T4).on(
							S0_T1.rcv_act_no.eq(S0_T4.src_rcv_act_no)
							.and(S0_T1.rcv_act_seq.eq(S0_T4.src_rcv_act_seq))
							.and(S0_T4.div_src_rcv_no.isNull())
						)
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
							,m.bill_cl_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
							r.setStringNE("bill_cl_typ", m.bill_cl_typ());
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
							m.sls_purc_typ,
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ar_sttl_nm2", m.sttl_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0200_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL0200_MST_RCV_S01() {
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
				sql("MSBGL0200_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_no,
						S0_T1.slo_no,
						S0_T1.dat_typ,
						S0_T1.rcst_cd,
						S0_T1.rcst_cd.as("old_rcst_cd"),
						S0_T1.rcv_dt,
						S0_T1.bcst_cd,
						S0_T1.bcst_cd.as("old_bcst_cd"),
						S0_M2.bp_nm.as("bcst_nm"),
						S0_T1.bill_dpt_cd,
						S0_T1.bill_dpt_cd.as("old_bill_dpt_cd"),
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
						S0_M7.debt_cred_id_typ.as("debtor_id_typ"),
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.BCST.value()).eq(S0_M7.debt_cred_id_typ))
								.then(S0_T1.bcst_cd)
							.otherwise(nullValue()).as("debtor_id_cd"),
						cases()
							.when(value(MAC_DEBT_CRED_ID_TYP.BCST.value()).eq(S0_M7.debt_cred_id_typ))
								.then(S0_M2.bp_nm)
							.otherwise(nullValue()).as("debtor_nm"),
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
						,S0_M2.bill_cl_typ
						,S0_M2.bill_dtl_adv_flg
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							S0_T1.rcv_no.eq(S0_T2.rcv_no)
							.and(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
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
						.cutoff$and(S0_T2.rcv_act_no.eq(bind("rcv_act_no")))
						.cutoff$and(S0_T2.rcv_act_seq.eq(bind("rcv_act_seq")))
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
							m.note_no,
							m.note_rsn_cd,
							m.note_typ,
							m.sub_char1,
							m.sub_char2,
							m.sub_char3
						))
						.addMap((r, m) -> {
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
}