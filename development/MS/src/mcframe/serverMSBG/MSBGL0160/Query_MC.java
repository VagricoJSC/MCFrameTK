package mcframe.serverMSBG.MSBGL0160;

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
	 * -- MSBGL0160_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL0160_MST_RCV_S01() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAVM_RD_DPT_R S0_M13 = MAVM_RD_DPT_R.create("M13");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0160_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.rcv_no,
						S0_T1.dat_typ.as("rcv_dat_typ"),
						S0_T1.rcv_dt,
						S0_T1.div_flg,
						S0_T1.div_src_rcv_no,
						S0_T1.rcv_dpt_cd,
						S0_M1.dpt_nm.as("rcv_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.rcv_usr_cd,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.rcv_amt,
						S0_T1.rcv_proc_amt,
						S0_T1.not_proc_bal,
						S0_T1.bank_ac_cd,
						S0_T1.xfr_psn,
						S0_T1.rcv_mtd_cd,
						S0_T1.rcv_rmrks,
						S0_T1.sub_char1.as("rcv_sub_char1"),
						S0_T1.sub_char2.as("rcv_sub_char2"),
						S0_T1.sub_char3.as("rcv_sub_char3"),
						S0_T1.rcv_auto_appl_tgt_flg,
						S0_T1.auto_appl_basis_dt,
						S0_T1.com_paid,
						S0_T1.auto_appl_sts_typ,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("rcv_upd_cntr"),
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							S0_T1.rcv_dpt_cd.eq(S0_M1.dpt_cd)
							.and(S0_T1.rcv_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.leftOuterJoin(S0_M6).on(
							S0_T1.bill_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T1.rcv_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
						.innerJoin(S0_M13).on(S0_T1.rcv_dpt_cd.eq(S0_M13.dpt_cd))
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
							r.setStringNE("note_rsn_cd", m.note_rsn_cd());
							r.setStringNE("draw_bank_cd", m.draw_bank_cd());
							r.setStringNE("draw_branch_cd", m.draw_branch_cd());
							r.setStringNE("note_sub_char1", m.sub_char1());
							r.setStringNE("note_sub_char2", m.sub_char2());
							r.setStringNE("note_sub_char3", m.sub_char3());
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
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
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
							r.getStringNE("rcv_mtd_cd")
						))
						.addSelect(m -> toArray(
							m.sttl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcv_mtd_nm", m.sttl_nm());
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
	 * -- MSBGL0160_MST_RCV_Query_S02
	 */
	static MCQueryPlan MSBGL0160_MST_RCV_S02() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0160_MST_RCV_Query_S02")
					.mainQuery()
					.select(
						S0_T1.rcv_no,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M2.dpt_nm.as("bill_dpt_nm"),
						S0_T1.rcv_amt,
						S0_T1.rcv_proc_amt,
						S0_T1.not_proc_bal,
						S0_T1.com_paid,
						S0_T1.rcv_rmrks,
						S0_T1.sub_char1.as("rcv_sub_char1"),
						S0_T1.sub_char2.as("rcv_sub_char2"),
						S0_T1.sub_char3.as("rcv_sub_char3"),
						S0_T1.rcv_auto_appl_tgt_flg,
						S0_T1.auto_appl_basis_dt,
						S0_T1.com_paid,
						S0_T1.upd_cntr.as("div_src_rcv_upd_cntr")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							S0_T1.bill_dpt_cd.eq(S0_M2.dpt_cd)
							.and(S0_T1.rcv_dt.between(S0_M2.st_dt, S0_M2.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.div_src_rcv_no.eq(bind("rcv_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bcst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bcst_nm", m.bp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL0160_MST_RCV_SCHD_Query_S01
	 */
	static MCQueryPlan MSBGL0160_MST_RCV_SCHD_S01() {
		MST_RCV_SCHD_R S0_T1 = MST_RCV_SCHD_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0160_MST_RCV_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T2.bcst_cd,
						S0_M1.bp_nm.as("bcst_nm"),
						S0_T2.bill_dpt_cd,
						S0_M2.dpt_nm.as("bill_dpt_nm"),
						S0_T1.rcv_schd_dt,
						sum(S0_T1.rcv_schd_amt).as("rcv_schd_amt"),
						S0_T2.bill_no,
						S0_T2.trd_cur_cd
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.leftOuterJoin(S0_M1).on(
							S0_T2.bcst_cd.eq(S0_M1.bp_cd)
							.and(S0_M1.bcst_flg.eq(value(true)))
						)
						.leftOuterJoin(S0_M2).on(
							S0_T2.bill_dpt_cd.eq(S0_M2.dpt_cd)
							.and(S0_T1.rcv_schd_dt.between(S0_M2.st_dt, S0_M2.end_dt))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.rcv_mtd_cd.eq(bind("rcv_mtd_cd")))
						.and(
							S0_M1.bp_cd.eq(bind("rcst_cd"))
							.or(S0_M1.rcst_cd.eq(bind("rcst_cd")))
						)
						.cutoff$and(bind("rcv_schd_dt_fr").lte(S0_T1.rcv_schd_dt))
						.cutoff$and(S0_T1.rcv_schd_dt.lte(bind("rcv_schd_dt_to")))
						.cutoff$and(S0_T2.bcst_cd.eq(bind("bcst_cd")))
						.and(
							value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).neq(S0_T2.bill_cl_sts_typ)
							.or(bind("inc_not_cl_flg").eq(value(true)))
						)
						.and(S0_T2.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(S0_T1.rcv_schd_amt.neq(value(0)))
					)
					.groupBy(
						S0_T2.bcst_cd,
						S0_M1.bp_nm,
						S0_T2.bill_dpt_cd,
						S0_M2.dpt_nm,
						S0_T1.rcv_schd_dt,
						S0_T2.bill_no,
						S0_T2.trd_cur_cd
					)
					.orderBy(
						S0_T1.rcv_schd_dt.asc(),
						S0_T2.bill_no.asc(),
						S0_T2.bcst_cd.asc(),
						S0_T2.bill_dpt_cd.asc()
					)
			);
	}
}