package mcframe.serverMSBH.MSBHL0090;

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
	 * -- MSBHL0090_MST_PAY_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBHL0090_MST_PAY_ACT_D_S01() {
		MST_PAY_ACT_D_R S0_T1 = MST_PAY_ACT_D_R.create("T1");
		MST_PAY_SCHD_R S0_T2 = MST_PAY_SCHD_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0090_MST_PAY_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid_tax_cd,
						S0_T1.trd_cur_com_paid_tax_amt,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.ap_setoff_typ,
						S0_T1.setoff_cd,
						S0_T1.setoff_nm,
						S0_T1.so_dpt_cd,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_com_paid_tax_amt,
						S0_T1.pay_act_d_no,
						S0_T1.pay_act_d_seq,
						S0_T1.pay_chk_no,
						S0_T1.pay_chk_mng_no,
						S0_T1.pay_schd_no,
						S0_T1.ap_appl_schd_no,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.ap_typ,
						S0_T1.purc_act_no,
						S0_T1.rcpt_iv_mng_no,
						S0_T1.rcpt_iv_no,
						S0_T1.wrk_no,
						S0_T1.pay_ntc_d_print_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_d_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.disp_seq,
						S0_T2.sw_flg,
						bind("ac_dt").as("ac_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.pay_schd_no.eq(S0_T2.pay_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pay_act_no.eq(bind("pay_act_no")))
						.and(S0_T1.pay_act_seq.eq(bind("pay_act_seq")))
						.and(
							S0_T1.ap_sttl_typ.notIn(
								value(MAC_AP_STTL_TYP.APSW_IN_CHK.value()),
								value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value()),
								value(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value()),
								value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value())
							)
						)
					)
					.orderBy(S0_T1.disp_seq.asc())
			);
	}
	
	/**
	 * -- MSBHL0090_MST_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL0090_MST_PAY_ACT_S01() {
		MST_PAY_ACT_R S0_T1 = MST_PAY_ACT_R.create("T1");
		MST_PAY_NOTE_R S0_T2 = MST_PAY_NOTE_R.create("T2");
		MAVM_RD_DPT_R S0_M1 = MAVM_RD_DPT_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0090_MST_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pay_act_no,
						S0_T1.pay_act_seq,
						S0_T1.pay_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.ac_ym,
						S0_T1.pay_act_dt,
						S0_T1.ac_dt,
						S0_T1.pay_basis_dt,
						S0_T1.pay_usr_cd,
						S0_T1.pay_dpt_cd,
						S0_T1.psppl_cd,
						S0_T1.trd_cur_cd,
						S0_T1.xrate,
						S0_T1.xrate_cd,
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.ap_setoff_typ,
						S0_T1.setoff_cd,
						S0_T1.setoff_nm,
						S0_T1.so_dpt_cd,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T2.note_no,
						S0_T2.note_typ,
						S0_T2.draw_dt,
						S0_T2.note_days,
						S0_T2.due_dt,
						S0_T2.drawer_nm,
						S0_T2.endrsr,
						S0_T2.accptr,
						S0_T2.draw_bank_cd,
						S0_T2.draw_branch_cd,
						S0_T2.note_rsn_cd,
						S0_T2.sub_char1.as("note_sub_char1"),
						S0_T2.sub_char2.as("note_sub_char2"),
						S0_T2.sub_char3.as("note_sub_char3")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.pay_act_no.eq(S0_T1.pay_act_no)
								.and(S0_T2.pay_act_seq.eq(S0_T1.pay_act_seq))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.pay_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.schd_act_flg.eq(value(false)))
						.and(S0_T1.pay_act_no.eq(bind("pay_act_no")))
						.cutoff$and(
							S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.and(bind("latest_flg_str").eq(value(true)))
						)
						.cutoff$and(
							S0_T1.pay_act_rev.eq(bind("pay_act_rev"))
							.and(S0_T1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						)
					)
			);
	}
	
	/**
	 * -- MSBHL0090_MST_PAY_SCHD_Query_S01
	 */
	static MCQueryPlan MSBHL0090_MST_PAY_SCHD_S01() {
		MST_PAY_SCHD_R S0_T1 = MST_PAY_SCHD_R.create("T1");
		MST_AP_APPL_SCHD_R S0_T2 = MST_AP_APPL_SCHD_R.create("T2");
		MST_PAY_CHK_R S0_T3 = MST_PAY_CHK_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MST_PAY_ACT_D_R S1_W = MST_PAY_ACT_D_R.create("W");
		MSW_PAY_SCHD_KEY_R S2_W = MSW_PAY_SCHD_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0090_MST_PAY_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.pay_schd_dt,
						nullValue().as("pay_schd_amt"),
						nullValue().as("pay_schd_com_paid_tax_amt"),
						nullValue().as("appl_ttl_amt"),
						S0_T2.trd_cur_amt,
						S0_T1.trd_cur_com_paid_tax_cd,
						S0_T2.trd_cur_com_paid_tax_amt,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.ap_setoff_typ,
						S0_T1.setoff_cd,
						S0_T1.setoff_nm,
						S0_T1.so_dpt_cd,
						nullValue().as("pay_act_d_no"),
						nullValue().as("pay_act_d_seq"),
						nullValue().as("disp_seq"),
						S0_T3.pay_chk_no,
						S0_T3.pay_chk_mng_no,
						S0_T1.pay_schd_no,
						S0_T2.ap_appl_schd_no,
						S0_T3.bsppl_cd,
						S0_T3.bsppl_dpt_cd,
						S0_T1.asppl_cd,
						S0_T1.ap_dpt_cd,
						S0_T1.ap_typ,
						S0_T2.purc_act_no,
						S0_T2.rcpt_iv_mng_no,
						S0_T2.rcpt_iv_no,
						S0_T3.wrk_no,
						S0_T1.ap_sttl_cd.as("schd_ap_sttl_cd"),
						S0_T1.ap_sttl_typ.as("schd_ap_sttl_typ"),
						S0_T1.trd_d_rmrks,
						nullValue().as("intr_d_rmrks"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						S0_T3.upd_cntr.as("pay_chk_upd_cntr"),
						bind("ac_dt").as("ac_dt"),
						S0_T1.note_no,
						S0_T1.note_typ,
						S0_T1.draw_dt,
						S0_T1.note_days,
						S0_T1.due_dt,
						S0_T1.drawer_nm,
						S0_T1.endrsr,
						S0_T1.accptr,
						S0_T1.pay_ntc_d_print_rmrks,
						S0_T1.draw_bank_cd,
						S0_T1.draw_branch_cd,
						S0_T1.note_rsn_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.pay_schd_no.eq(S0_T1.pay_schd_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.pay_chk_mng_no.eq(S0_T1.pay_chk_mng_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T3.bsppl_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T3.aprv_flg.eq(value(false))
							.or(S0_T3.aprv_flg.eq(value(true)))
							.and(S0_T3.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
						)
						.and(
							S0_T2.pay_sts_typ.in(
								value(MSC_PAY_STS_TYP.NOT_PAY.value()),
								value(MSC_PAY_STS_TYP.PART_PAY.value())
							)
						)
						.cutoff$and(S0_T1.pay_dpt_cd.eq(bind("pay_dpt_cd")))
						.and(S0_M1.psppl_cd.eq(bind("psppl_cd")))
						.and(S0_T3.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(
							bind("ap_sttl_narrow_down_flg").eq(value(false))
							.or(S0_T1.ap_sttl_cd.like(bind("cnd_ap_sttl_cd")))
							.cutoff$or(S0_T1.ap_sttl_typ.like(bind("cnd_ap_sttl_typ")))
						)
						.cutoff$and(S0_T1.bank_ac_cd.like(bind("bank_ac_cd")))
						.cutoff$and(S0_T1.pay_bank_ac_cd.like(bind("pay_bank_ac_cd")))
						.cutoff$and(S0_T1.ap_setoff_typ.like(bind("ap_setoff_typ")))
						.cutoff$and(S0_T1.setoff_cd.like(bind("setoff_cd")))
						.cutoff$and(S0_T1.setoff_nm.like(bind("setoff_nm")))
						.cutoff$and(S0_T1.so_dpt_cd.like(bind("so_dpt_cd")))
						.cutoff$and(S0_T1.pay_schd_dt.lte(bind("pay_schd_dt")))
						.cutoff$and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_W)
								.where(
									S1_W.pay_act_no.eq(bind("pay_act_no"))
									.and(S1_W.pay_act_seq.eq(bind("pay_act_seq")))
									.and(S1_W.ap_appl_schd_no.eq(S0_T2.ap_appl_schd_no))
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S2_W)
								.where(
									S2_W.pay_schd_no.eq(S0_T1.pay_schd_no)
									.and(bind("cnd_pay_schd_no").eq(value(true)))
								)
							)
						)
					)
					.orderBy(
						S0_T1.pay_schd_dt.asc(),
						S0_T1.ap_sttl_cd.asc(),
						S0_T1.ap_dpt_cd.asc(),
						S0_T1.asppl_cd.asc(),
						S0_T2.purc_act_no.asc(),
						S0_T3.wrk_no.asc()
					)
			);
	}
	
	static MCJoinerList<Srch01_DtlR> MSBHL0090_Srch01_DtlR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MST_PAY_SCHD_R.class, r -> toCondition(
					r.pay_schd_no()
				))
				.addSelect(m -> toArray(
					m.ap_sttl_cd,
					m.ap_sttl_typ,
					m.pay_schd_dt
				))
				.addMap((r, m) -> {
					r.pay_schd_dt(m.pay_schd_dt());
					r.schd_ap_sttl_cd(m.ap_sttl_cd());
					r.schd_ap_sttl_typ(m.ap_sttl_typ());
					r.setStringNE("join_ap_sttl_cd_", m.ap_sttl_cd());
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.getStringNE("join_ap_sttl_cd_")
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.schd_ap_sttl_nm(m.sttl_nm());
				}),
			j -> j
				.add(MST_AP_APPL_SCHD_R.class, r -> toCondition(
					r.ap_appl_schd_no()
				))
				.addSelect(m -> toArray(
					m.trd_cur_amt,
					m.trd_cur_appl_amt,
					m.trd_cur_com_paid_tax_amt
				))
				.addMap((r, m) -> {
					r.pay_schd_amt(m.trd_cur_amt());
					r.pay_schd_com_paid_tax_amt(m.trd_cur_com_paid_tax_amt());
					r.appl_ttl_amt(m.trd_cur_appl_amt());
				}),
			j -> j
				.add(MAM_TAX_R.class, r -> toCondition(
					r.trd_cur_com_paid_tax_cd()
				))
				.addSelect(m -> toArray(
					m.tax_nm,
					m.tax_rate
				))
				.addMap((r, m) -> {
					r.trd_cur_com_paid_tax_nm(m.tax_nm());
					r.trd_cur_com_paid_tax_rate(m.tax_rate());
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
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.setoff_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.setoff_nm_mst(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.so_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.so_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.bsppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.bsppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bsppl_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bsppl_dpt_nm(m.dpt_nm());
				}),
			j -> j
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.asppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.asppl_nm(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.ap_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.ap_dpt_nm(m.dpt_nm());
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
				.add(MST_PAY_CHK_R.class, r -> toCondition(
					r.pay_chk_mng_no()
				))
				.addSelect(m -> toArray(
					m.upd_cntr
				))
				.addMap((r, m) -> {
					r.pay_chk_upd_cntr(m.upd_cntr());
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
				.add(MAM_NOTE_RSN_R.class, r -> toCondition(
					r.note_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.note_rsn_nm
				))
				.addMap((r, m) -> {
					r.note_rsn_nm(m.note_rsn_nm());
				})
		);
	}
	
	static MCJoinerList<Srch01_HdrR> MSBHL0090_Srch01_HdrR_J01() {
		return joinInfo(
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.pay_usr_cd()
				))
				.addSelect(m -> toArray(
					m.usr_nm
				))
				.addMap((r, m) -> {
					r.pay_usr_nm(m.usr_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.pay_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm,
					m.wg_cd
				))
				.addMap((r, m) -> {
					r.pay_dpt_nm(m.dpt_nm());
					r.wg_cd(m.wg_cd());
					r.setStringNE("join_wg_cd_", m.wg_cd());
				}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("join_wg_cd_")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.wg_nm(m.wg_nm());
				}),
			j -> j
				.add(MAM_BP_R.class, r -> toCondition(
					r.psppl_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm,
					m.psppl_rmrks
				))
				.addMap((r, m) -> {
					r.psppl_nm(m.bp_nm());
					r.psppl_rmrks(m.psppl_rmrks());
				}),
			j -> j
				.add(MAM_CUR_R.class, r -> toCondition(
					r.trd_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.trd_cur_nm(m.cur_nm());
					r.trd_cur_amt_dec_place(m.amt_dec_place());
				}),
			j -> j
				.add(MAM_STTL_R.class, r -> toCondition(
					r.ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.ap_sttl_nm(m.sttl_nm());
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
				.add(MAVM_BP_NM_R.class, r -> toCondition(
					r.setoff_cd()
				))
				.addSelect(m -> toArray(
					m.bp_nm
				))
				.addMap((r, m) -> {
					r.setoff_nm_mst(m.bp_nm());
				}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.so_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.so_dpt_nm(m.dpt_nm());
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
				.add(MAM_NOTE_RSN_R.class, r -> toCondition(
					r.note_rsn_cd()
				))
				.addSelect(m -> toArray(
					m.note_rsn_nm
				))
				.addMap((r, m) -> {
					r.note_rsn_nm(m.note_rsn_nm());
				})
		);
	}
}