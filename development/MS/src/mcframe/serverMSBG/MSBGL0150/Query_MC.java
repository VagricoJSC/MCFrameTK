package mcframe.serverMSBG.MSBGL0150;

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
	 * -- MSBGL0150_MST_RCV_Query_S01
	 */
	static MCQueryPlan MSBGL0150_MST_RCV_S01() {
		MST_RCV_R S0_T1 = MST_RCV_R.create("T1");
		MST_NOTE_R S0_T2 = MST_NOTE_R.create("T2");
		MST_NOTE_R S0_T3 = MST_NOTE_R.create("T3");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_BANK_AC_R S0_M8 = MAM_BANK_AC_R.create("M8");
		MAM_STTL_R S0_M9 = MAM_STTL_R.create("M9");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		
		MCDynamicSQLID DS0C_BILL_GRP = createDynamicSQLID("DS0C_BILL_GRP");
		MCDynamicSQLID DS0C_RCV_GRP = createDynamicSQLID("DS0C_RCV_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0150_MST_RCV_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dat_typ.as("rcv_dat_typ"),
						S0_T1.rcv_dpt_cd,
						S0_M1.dpt_nm.as("rcv_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.rcv_usr_cd,
						S0_T1.rcv_no,
						S0_T1.rcv_dt,
						S0_T1.rcst_cd,
						S0_T1.bcst_cd,
						S0_T1.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T1.xfr_psn,
						S0_T1.trd_cur_cd.as("cur_cd"),
						S0_T1.rcv_amt,
						S0_T1.not_proc_bal,
						S0_T1.bank_ac_cd,
						S0_T1.rcv_mtd_cd,
						S0_T1.auto_appl_sts_typ,
						S0_T1.asppl_cd,
						S0_T1.bsppl_cd,
						S0_T1.acst_cd,
						S0_T1.pay_act_no,
						S0_T1.rcv_rmrks,
						S0_T1.prnt_flg,
						S0_T1.div_flg,
						S0_T1.div_src_rcv_no,
						S0_T1.fb_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_rcv_no,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_RCV_GRP),
						addDynamicSelect(DS0C_BILL_GRP),
						S0_T1.src_rcv_act_no,
						// this field is appended by sql coverter.
						S0_T1.note_mng_no.as("join_note_mng_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_V1).on(S0_T1.rcv_dpt_cd.eq(S0_V1.dpt_cd))
						.leftOuterJoin(S0_M1).on(
							S0_T1.rcv_dpt_cd.eq(S0_M1.dpt_cd)
							.and(S0_T1.rcv_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.leftOuterJoin(S0_M6).on(
							S0_T1.bill_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T1.rcv_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
						.addDynamicView()
						.addDynamicView(DS0C_RCV_GRP)
						.addDynamicView(DS0C_BILL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("proc_flg").eq(value(true))
							.or(
								S0_T1.not_proc_bal.neq(value(0))
								.and(bind("proc_flg").eq(value(false)))
							)
						)
						.and(
							bind("rcv_flg").eq(value(true))
							.and(S0_T1.dat_typ.eq(value(MSC_RCV_DAT_TYP.RCV.value())))
							.or(bind("susp_flg").eq(value(true)))
							.and(S0_T1.dat_typ.eq(value(MSC_RCV_DAT_TYP.SUSP.value())))
							.or(bind("adv_flg").eq(value(true)))
							.and(S0_T1.dat_typ.eq(value(MSC_RCV_DAT_TYP.ADV.value())))
							.or(bind("ap_flg").eq(value(true)))
							.and(S0_T1.dat_typ.eq(value(MSC_RCV_DAT_TYP.AP.value())))
						)
						.and(
							bracket(
								bind("prnt_flg").eq(value(true))
								.and(S0_T1.prnt_flg.eq(value(true)))
							)
							.or(
								bind("not_prnt_flg").eq(value(true))
								.and(S0_T1.prnt_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("fb_t_flg").eq(value(true))
								.and(S0_T1.fb_flg.eq(value(true)))
							)
							.or(
								bind("fb_f_flg").eq(value(true))
								.and(S0_T1.fb_flg.eq(value(false)))
							)
						)
						.and(
							bind("scr_ope_flg").eq(value(false))
							.or(
								bind("scr_ope_flg").eq(value(true))
								.and(S0_T1.div_src_rcv_no.isNull())
							)
						)
						.cutoff$and(S0_T1.rcv_dt.gte(bind("rcv_dt_fr")))
						.cutoff$and(S0_T1.rcv_dt.lte(bind("rcv_dt_to")))
						.cutoff$and(S0_T1.rcst_cd.like(bind("rcst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_T1.rcv_dpt_cd.like(bind("rcv_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("rcv_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.rcv_usr_cd.like(bind("rcv_usr_cd")))
						.cutoff$and(S0_T1.rcv_rmrks.like(bind("rcv_rmrks")))
						.cutoff$and(S0_T1.rcv_no.like(bind("rcv_no")))
						.cutoff$and(S0_T1.pay_act_no.like(bind("pay_act_no")))
						.cutoff$and(S0_T1.rcv_mtd_cd.like(bind("rcv_mtd_cd")))
						.cutoff$and(S0_T1.bank_ac_cd.like(bind("bank_ac_cd")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_T1.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T1.auto_appl_sts_typ.like(bind("auto_appl_sts_typ")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_RCV_GRP)
						.addDynamicPredicate(DS0C_BILL_GRP)
					)
					.orderBy(S0_T1.rcv_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("note_no"))
					.view(v -> v.innerJoin(S0_T3).on(S0_T1.note_mng_no.eq(S0_T3.note_mng_no).and(bind("note_no").isNotNull()))),
				when(boundOr("note_no"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T1.note_mng_no.eq(S0_T2.note_mng_no)))
					.predicate(p -> p.cutoff$and(S0_T2.note_no.like(bind("note_no")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_T1.wg_cd.eq(S0_M2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("rcv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.rcv_usr_cd.eq(S0_M3.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("rcv_usr_nm")))),
				when(boundOr("rcv_grp_flg1", "rcv_grp_flg2", "rcv_grp_flg3", "rcv_grp_flg4", "rcv_grp_flg5", "rcv_grp_flg6", "rcv_grp_flg7", "rcv_grp_flg8", "rcv_grp_flg9", "rcv_grp_flg10", "rcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_T1.rcst_cd.eq(S0_M4.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("rcst_nm")))),
				when(boundOr("bill_grp_flg1", "bill_grp_flg2", "bill_grp_flg3", "bill_grp_flg4", "bill_grp_flg5", "bill_grp_flg6", "bill_grp_flg7", "bill_grp_flg8", "bill_grp_flg9", "bill_grp_flg10", "bcst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_T1.bcst_cd.eq(S0_M5.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.bp_nm.like(bind("bcst_nm")))),
				when(boundOr("cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_T1.trd_cur_cd.eq(S0_M7.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.cur_nm.like(bind("cur_nm")))),
				when(boundOr("bank_ac_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(S0_T1.bank_ac_cd.eq(S0_M8.bank_ac_cd)))
					.predicate(p -> p.cutoff$and(S0_M8.bank_ac_nm.like(bind("bank_ac_nm")))),
				when(boundOr("rcv_mtd_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(S0_T1.rcv_mtd_cd.eq(S0_M9.sttl_cd)))
					.predicate(p -> p.cutoff$and(S0_M9.sttl_nm.like(bind("rcv_mtd_nm")))),
				when(boundOr("rcv_grp_flg1"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd1.as("rcv_grp_cd1"), S0_MM11.bp_grp_nm.as("rcv_grp_nm1"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M4.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("rcv_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("rcv_grp_nm1")))),
				when(boundOr("rcv_grp_flg2"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd2.as("rcv_grp_cd2"), S0_MM12.bp_grp_nm.as("rcv_grp_nm2"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M4.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("rcv_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("rcv_grp_nm2")))),
				when(boundOr("rcv_grp_flg3"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd3.as("rcv_grp_cd3"), S0_MM13.bp_grp_nm.as("rcv_grp_nm3"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M4.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("rcv_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("rcv_grp_nm3")))),
				when(boundOr("rcv_grp_flg4"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd4.as("rcv_grp_cd4"), S0_MM14.bp_grp_nm.as("rcv_grp_nm4"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M4.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("rcv_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("rcv_grp_nm4")))),
				when(boundOr("rcv_grp_flg5"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd5.as("rcv_grp_cd5"), S0_MM15.bp_grp_nm.as("rcv_grp_nm5"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M4.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("rcv_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("rcv_grp_nm5")))),
				when(boundOr("rcv_grp_flg6"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd6.as("rcv_grp_cd6"), S0_MM16.bp_grp_nm.as("rcv_grp_nm6"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M4.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("rcv_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("rcv_grp_nm6")))),
				when(boundOr("rcv_grp_flg7"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd7.as("rcv_grp_cd7"), S0_MM17.bp_grp_nm.as("rcv_grp_nm7"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M4.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("rcv_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("rcv_grp_nm7")))),
				when(boundOr("rcv_grp_flg8"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd8.as("rcv_grp_cd8"), S0_MM18.bp_grp_nm.as("rcv_grp_nm8"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M4.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("rcv_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("rcv_grp_nm8")))),
				when(boundOr("rcv_grp_flg9"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd9.as("rcv_grp_cd9"), S0_MM19.bp_grp_nm.as("rcv_grp_nm9"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M4.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("rcv_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("rcv_grp_nm9")))),
				when(boundOr("rcv_grp_flg10"))
					.select(DS0C_RCV_GRP, S0_M4.bp_grp_cd10.as("rcv_grp_cd10"), S0_MM110.bp_grp_nm.as("rcv_grp_nm10"))
					.view(DS0C_RCV_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M4.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_RCV_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("rcv_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("rcv_grp_nm10")))),
				when(boundOr("bill_grp_flg1"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd1.as("bill_grp_cd1"), S0_MM21.bp_grp_nm.as("bill_grp_nm1"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M5.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("bill_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("bill_grp_nm1")))),
				when(boundOr("bill_grp_flg2"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd2.as("bill_grp_cd2"), S0_MM22.bp_grp_nm.as("bill_grp_nm2"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M5.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("bill_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("bill_grp_nm2")))),
				when(boundOr("bill_grp_flg3"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd3.as("bill_grp_cd3"), S0_MM23.bp_grp_nm.as("bill_grp_nm3"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M5.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("bill_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("bill_grp_nm3")))),
				when(boundOr("bill_grp_flg4"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd4.as("bill_grp_cd4"), S0_MM24.bp_grp_nm.as("bill_grp_nm4"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M5.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("bill_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("bill_grp_nm4")))),
				when(boundOr("bill_grp_flg5"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd5.as("bill_grp_cd5"), S0_MM25.bp_grp_nm.as("bill_grp_nm5"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M5.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("bill_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("bill_grp_nm5")))),
				when(boundOr("bill_grp_flg6"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd6.as("bill_grp_cd6"), S0_MM26.bp_grp_nm.as("bill_grp_nm6"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M5.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("bill_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("bill_grp_nm6")))),
				when(boundOr("bill_grp_flg7"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd7.as("bill_grp_cd7"), S0_MM27.bp_grp_nm.as("bill_grp_nm7"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M5.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("bill_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("bill_grp_nm7")))),
				when(boundOr("bill_grp_flg8"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd8.as("bill_grp_cd8"), S0_MM28.bp_grp_nm.as("bill_grp_nm8"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M5.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("bill_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("bill_grp_nm8")))),
				when(boundOr("bill_grp_flg9"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd9.as("bill_grp_cd9"), S0_MM29.bp_grp_nm.as("bill_grp_nm9"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M5.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("bill_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("bill_grp_nm9")))),
				when(boundOr("bill_grp_flg10"))
					.select(DS0C_BILL_GRP, S0_M5.bp_grp_cd10.as("bill_grp_cd10"), S0_MM210.bp_grp_nm.as("bill_grp_nm10"))
					.view(DS0C_BILL_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M5.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("bill_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("bill_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_NOTE_R.class, r -> toCondition(
							r.getStringNE("join_note_mng_no_")
						))
						.addSelect(m -> toArray(
							m.note_no
						))
						.addMap((r, m) -> {
							r.setStringNE("note_no", m.note_no());
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
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_BANK_AC_R.class, r -> toCondition(
							r.getStringNE("bank_ac_cd")
						))
						.addSelect(m -> toArray(
							m.bank_ac_nm,
							m.bank_ac_no
						))
						.addMap((r, m) -> {
							r.setStringNE("bank_ac_nm", m.bank_ac_nm());
							r.setStringNE("bank_ac_no", m.bank_ac_no());
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
							r.getStringNE("bsppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bsppl_nm", m.bp_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_EXT_SYS_R.class, r -> toCondition(
							r.getStringNE("ext_sys_cd")
						))
						.addSelect(m -> toArray(
							m.ext_sys_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ext_sys_nm", m.ext_sys_nm());
					})
				)
			);
	}
}