package mcframe.serverMSBH.MSBHL0080;

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
	 * -- MSBHL0080_MST_ADV_PAY_ACT_Query_S01
	 */
	static MCQueryPlan MSBHL0080_MST_ADV_PAY_ACT_S01() {
		MST_ADV_PAY_ACT_R S0_T1 = MST_ADV_PAY_ACT_R.create("T1");
		MST_PAY_NOTE_R S0_T2 = MST_PAY_NOTE_R.create("T2");
		MAVM_RD_DPT_R S0_M1 = MAVM_RD_DPT_R.create("M1");
		MAVM_RD_DPT_R S0_M2 = MAVM_RD_DPT_R.create("M2");
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
		MAM_DPT_R S0_BSPPL_DPT = MAM_DPT_R.create("BSPPL_DPT");
		MAM_DPT_R S0_BD_DPT = MAM_DPT_R.create("BD_DPT");
		MAM_DPT_R S0_PAY_DPT = MAM_DPT_R.create("PAY_DPT");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_STTL_R S0_STTL = MAM_STTL_R.create("STTL");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBHL0080_MST_ADV_PAY_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.adv_pay_act_no,
						S0_T1.adv_pay_act_seq,
						S0_T1.adv_pay_act_rev,
						S0_T1.slip_sts_typ,
						S0_T1.psppl_cd,
						S0_T1.bsppl_cd,
						S0_T1.bsppl_dpt_cd,
						S0_T1.bd_dpt_cd,
						S0_T1.pay_dpt_cd,
						S0_T1.wg_cd,
						S0_T1.pay_usr_cd,
						S0_T1.pay_act_dt,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.trd_cur_cd,
						S0_T1.base_cur_cd,
						S0_T1.xrate_cd,
						S0_T1.xrate,
						S0_T1.ap_sttl_cd,
						S0_T1.ap_sttl_typ,
						S0_T1.com_paid_ap_sttl_cd,
						S0_T1.com_paid_ap_sttl_typ,
						S0_T1.trd_cur_com_paid_tax_cd,
						S0_T1.bank_ac_cd,
						S0_T1.pay_bank_ac_cd,
						S0_T1.pay_ntc_adv_pay_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_com_paid,
						S0_T1.trd_cur_com_paid_tax_amt,
						S0_T1.trd_cur_exc_com_paid,
						S0_T1.trd_cur_setoff_tgt_amt,
						S0_T1.trd_cur_setoff_schd_amt,
						S0_T1.trd_cur_setoff_act_amt,
						S0_T1.trd_cur_not_proc_bal,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_com_paid,
						S0_T1.base_cur_com_paid_tax_amt,
						S0_T1.base_cur_exc_com_paid,
						S0_T1.base_cur_setoff_tgt_amt,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.note_no,
						S0_T2.note_typ,
						S0_T2.note_rsn_cd,
						S0_T2.draw_dt,
						S0_T2.due_dt,
						S0_T2.note_days,
						S0_T2.drawer_nm,
						S0_T2.draw_bank_cd,
						S0_T2.draw_branch_cd,
						S0_T2.endrsr,
						S0_T2.accptr,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							S0_T1.adv_pay_act_no.eq(S0_T2.adv_pay_act_no)
							.and(S0_T1.adv_pay_act_seq.eq(S0_T2.adv_pay_act_seq))
						)
						.leftOuterJoin(S0_M1).on(S0_T1.bsppl_dpt_cd.eq(S0_M1.dpt_cd))
						.leftOuterJoin(S0_M2).on(S0_T1.pay_dpt_cd.eq(S0_M2.dpt_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
						.and(
							S0_M1.dpt_cd.isNotNull()
							.or(S0_M2.dpt_cd.isNotNull())
						)
						.and(
							bind("incl_appl_flg").eq(value(true))
							.or(S0_T1.trd_cur_not_proc_bal.neq(value(0)))
							.and(bind("incl_appl_flg").eq(value(false)))
						)
						.and(
							bind("incl_can_red_flg").eq(value(true))
							.or(bind("incl_can_red_flg").eq(value(false)))
							.and(S0_T1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						)
						.cutoff$and(S0_T1.pay_act_dt.gte(bind("pay_act_dt_fr")))
						.cutoff$and(S0_T1.pay_act_dt.lte(bind("pay_act_dt_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.psppl_cd.like(bind("psppl_cd")))
						.cutoff$and(S0_T1.bsppl_cd.like(bind("bsppl_cd")))
						.cutoff$and(S0_T1.bsppl_dpt_cd.like(bind("bsppl_dpt_cd")))
						.cutoff$and(S0_T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_T1.pay_dpt_cd.like(bind("pay_dpt_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.pay_usr_cd.like(bind("pay_usr_cd")))
						.cutoff$and(S0_T1.ap_sttl_cd.like(bind("ap_sttl_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.adv_pay_act_no.like(bind("adv_pay_act_no")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.note_no.like(bind("note_no")))
					)
					.orderBy(
						S0_T1.adv_pay_act_no.asc(),
						S0_T1.adv_pay_act_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("psppl_nm", "psppl_grp_flg1", "psppl_grp_flg2", "psppl_grp_flg3", "psppl_grp_flg4", "psppl_grp_flg5", "psppl_grp_flg6", "psppl_grp_flg7", "psppl_grp_flg8", "psppl_grp_flg9", "psppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PSPPL).on(S0_PSPPL.bp_cd.eq(S0_T1.psppl_cd)))
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
				when(boundOr("bsppl_nm", "bsppl_grp_flg1", "bsppl_grp_flg2", "bsppl_grp_flg3", "bsppl_grp_flg4", "bsppl_grp_flg5", "bsppl_grp_flg6", "bsppl_grp_flg7", "bsppl_grp_flg8", "bsppl_grp_flg9", "bsppl_grp_flg10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL).on(S0_BSPPL.bp_cd.eq(S0_T1.bsppl_cd)))
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
				when(boundOr("bsppl_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BSPPL_DPT).on(S0_BSPPL_DPT.dpt_cd.eq(S0_T1.bsppl_dpt_cd).and(S0_T1.ac_dt.between(S0_BSPPL_DPT.st_dt, S0_BSPPL_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BSPPL_DPT.dpt_nm.like(bind("bsppl_dpt_nm")))),
				when(boundOr("bd_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BD_DPT).on(S0_BD_DPT.dpt_cd.eq(S0_T1.bd_dpt_cd).and(S0_T1.ac_dt.between(S0_BD_DPT.st_dt, S0_BD_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BD_DPT.dpt_nm.like(bind("bd_dpt_nm")))),
				when(boundOr("pay_dpt_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_PAY_DPT).on(S0_PAY_DPT.dpt_cd.eq(S0_T1.pay_dpt_cd).and(S0_T1.ac_dt.between(S0_PAY_DPT.st_dt, S0_PAY_DPT.end_dt))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PAY_DPT.dpt_nm.like(bind("pay_dpt_nm")))),
				when(boundOr("wg_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("pay_usr_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_T1.pay_usr_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_USR.usr_nm.like(bind("pay_usr_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CUR).on(S0_CUR.cur_cd.eq(S0_T1.trd_cur_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("ap_sttl_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_STTL).on(S0_STTL.sttl_cd.eq(S0_T1.ap_sttl_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_STTL.sttl_nm.like(bind("ap_sttl_nm"))))
			);
	}
	
	static MCJoinerList<Srch01_RsltR> MSBHL0080_Srch01_RsltR_J01() {
		return joinInfo(
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
				.add(MAM_DPT_R.class, r -> toCondition(
					r.bd_dpt_cd(), r.ac_dt()
				))
				.addSelect(m -> toArray(
					m.dpt_nm
				))
				.addMap((r, m) -> {
					r.bd_dpt_nm(m.dpt_nm());
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
				.add(MAM_CUR_R.class, r -> toCondition(
					r.base_cur_cd()
				))
				.addSelect(m -> toArray(
					m.amt_dec_place,
					m.cur_nm
				))
				.addMap((r, m) -> {
					r.base_cur_nm(m.cur_nm());
					r.base_cur_amt_dec_place(m.amt_dec_place());
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
				.add(MAM_STTL_R.class, r -> toCondition(
					r.com_paid_ap_sttl_cd()
				))
				.addSelect(m -> toArray(
					m.sttl_nm
				))
				.addMap((r, m) -> {
					r.com_paid_ap_sttl_nm(m.sttl_nm());
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
				})
		);
	}
}