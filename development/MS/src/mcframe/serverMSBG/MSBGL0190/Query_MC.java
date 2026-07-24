package mcframe.serverMSBG.MSBGL0190;

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
	 * -- MSBGL0190_MST_NOTE_Query_S01
	 */
	static MCQueryPlan MSBGL0190_MST_NOTE_S01() {
		MST_NOTE_R S0_T1 = MST_NOTE_R.create("T1");
		MST_RCV_R S0_T2 = MST_RCV_R.create("T2");
		MAVM_RD_DPT_R S0_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_CUR_R S0_M7 = MAM_CUR_R.create("M7");
		MAM_BANK_R S0_M8 = MAM_BANK_R.create("M8");
		MAM_BANK_BRANCH_R S0_M9 = MAM_BANK_BRANCH_R.create("M9");
		MAM_NOTE_RSN_R S0_M10 = MAM_NOTE_RSN_R.create("M10");
		MAM_STTL_R S0_M11 = MAM_STTL_R.create("M11");
		MAM_EXT_SYS_R S0_M12 = MAM_EXT_SYS_R.create("M12");
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
		MST_NOTE_R S1_T1 = MST_NOTE_R.create("T1");
		MST_RCV_ACT_R S1_T2 = MST_RCV_ACT_R.create("T2");
		MAVM_RD_DPT_R S1_V1 = MAVM_RD_DPT_R.create("V1");
		MAM_DPT_R S1_M1 = MAM_DPT_R.create("M1");
		MAM_WG_R S1_M2 = MAM_WG_R.create("M2");
		MAM_USR_R S1_M3 = MAM_USR_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_BP_R S1_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S1_M6 = MAM_DPT_R.create("M6");
		MAM_CUR_R S1_M7 = MAM_CUR_R.create("M7");
		MAM_BANK_R S1_M8 = MAM_BANK_R.create("M8");
		MAM_BANK_BRANCH_R S1_M9 = MAM_BANK_BRANCH_R.create("M9");
		MAM_NOTE_RSN_R S1_M10 = MAM_NOTE_RSN_R.create("M10");
		MAM_STTL_R S1_M11 = MAM_STTL_R.create("M11");
		MAM_BP_GRP_R S1_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S1_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S1_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S1_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S1_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S1_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S1_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S1_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S1_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S1_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S1_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S1_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S1_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S1_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S1_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S1_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S1_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S1_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S1_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S1_MM210 = MAM_BP_GRP_R.create("MM210");
		
		MCDynamicSQLID DS0C_BILL_GRP = createDynamicSQLID("DS0C_BILL_GRP");
		MCDynamicSQLID DS0C_RCV_GRP = createDynamicSQLID("DS0C_RCV_GRP");
		MCDynamicSQLID DS1C_BILL_GRP = createDynamicSQLID("DS1C_BILL_GRP");
		MCDynamicSQLID DS1C_RCV_GRP = createDynamicSQLID("DS1C_RCV_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL0190_MST_NOTE_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mat_flg,
						S0_T2.rcv_dpt_cd,
						S0_M1.dpt_nm.as("rcv_dpt_nm"),
						S0_T2.wg_cd,
						S0_M2.wg_nm,
						S0_T2.rcv_usr_cd,
						S0_M3.usr_nm.as("rcv_usr_nm"),
						S0_T2.rcv_dt,
						S0_T2.rcst_cd,
						S0_M4.bp_nm.as("rcst_nm"),
						S0_T2.bcst_cd,
						S0_M5.bp_nm.as("bcst_nm"),
						S0_T2.bill_dpt_cd,
						S0_M6.dpt_nm.as("bill_dpt_nm"),
						S0_T2.trd_cur_cd.as("cur_cd"),
						S0_M7.cur_nm,
						S0_M7.amt_dec_place,
						S0_T2.rcv_amt,
						S0_T1.note_no,
						S0_T1.note_typ,
						S0_T1.draw_dt,
						S0_T1.due_dt,
						S0_T1.drawer_nm,
						S0_T1.endrsr,
						S0_T1.accptr,
						S0_T1.draw_bank_cd,
						S0_M8.bank_nm.as("draw_bank_nm"),
						S0_T1.draw_branch_cd,
						S0_M9.branch_nm.as("draw_branch_nm"),
						S0_T1.note_rsn_cd,
						S0_M10.note_rsn_nm,
						S0_T2.rcv_no,
						S0_T2.rcv_mtd_cd,
						S0_M11.sttl_nm.as("rcv_mtd_nm"),
						nullValue().as("rcv_act_no"),
						S0_T2.fb_flg,
						S0_T2.ext_sys_cd,
						S0_M12.ext_sys_nm,
						S0_T2.ext_rcv_no,
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
						addDynamicSelect(DS0C_BILL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.note_mng_no.eq(S0_T2.note_mng_no))
						.innerJoin(S0_V1).on(S0_T2.rcv_dpt_cd.eq(S0_V1.dpt_cd))
						.leftOuterJoin(S0_M1).on(
							S0_T2.rcv_dpt_cd.eq(S0_M1.dpt_cd)
							.and(S0_T2.rcv_dt.between(S0_M1.st_dt, S0_M1.end_dt))
						)
						.leftOuterJoin(S0_M2).on(S0_T2.wg_cd.eq(S0_M2.wg_cd))
						.leftOuterJoin(S0_M3).on(S0_T2.rcv_usr_cd.eq(S0_M3.usr_cd))
						.leftOuterJoin(S0_M4).on(S0_T2.rcst_cd.eq(S0_M4.bp_cd))
						.leftOuterJoin(S0_M5).on(S0_T2.bcst_cd.eq(S0_M5.bp_cd))
						.leftOuterJoin(S0_M6).on(
							S0_T2.bill_dpt_cd.eq(S0_M6.dpt_cd)
							.and(S0_T2.rcv_dt.between(S0_M6.st_dt, S0_M6.end_dt))
						)
						.leftOuterJoin(S0_M7).on(S0_T2.trd_cur_cd.eq(S0_M7.cur_cd))
						.leftOuterJoin(S0_M8).on(S0_T1.draw_bank_cd.eq(S0_M8.bank_cd))
						.leftOuterJoin(S0_M9).on(
							S0_T1.draw_bank_cd.eq(S0_M9.bank_cd)
							.and(S0_T1.draw_branch_cd.eq(S0_M9.branch_cd))
						)
						.leftOuterJoin(S0_M10).on(S0_T1.note_rsn_cd.eq(S0_M10.note_rsn_cd))
						.leftOuterJoin(S0_M11).on(S0_T2.rcv_mtd_cd.eq(S0_M11.sttl_cd))
						.leftOuterJoin(S0_M12).on(S0_T2.ext_sys_cd.eq(S0_M12.ext_sys_cd))
						.addDynamicView(DS0C_RCV_GRP)
						.addDynamicView(DS0C_BILL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(value(MSC_RCV_DAT_TYP.RCV.value()).eq(S0_T2.dat_typ))
						.and(S0_T2.div_src_rcv_no.isNull())
						.and(
							S0_T1.mat_flg.eq(bind("mat_flg"))
							.or(
								S0_T1.mat_flg.eq(decode(
										bind("not_mat_flg"),
										value(true),
										value(false),
										value(true)
									)
								)
							)
						)
						.and(
							bracket(
								bind("fb_t_flg").eq(value(true))
								.and(S0_T2.fb_flg.eq(value(true)))
							)
							.or(
								bind("fb_f_flg").eq(value(true))
								.and(S0_T2.fb_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T2.rcv_dt.gte(bind("rcv_dt_fr")))
						.cutoff$and(S0_T2.rcv_dt.lte(bind("rcv_dt_to")))
						.cutoff$and(S0_T1.draw_dt.gte(bind("draw_dt_fr")))
						.cutoff$and(S0_T1.draw_dt.lte(bind("draw_dt_to")))
						.cutoff$and(S0_T1.due_dt.gte(bind("due_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("due_dt_to")))
						.cutoff$and(S0_T2.rcst_cd.like(bind("rcst_cd")))
						.cutoff$and(S0_M4.bp_nm.like(bind("rcst_nm")))
						.cutoff$and(S0_T2.rcv_dpt_cd.like(bind("rcv_dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("rcv_dpt_nm")))
						.cutoff$and(S0_T2.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T2.rcv_usr_cd.like(bind("rcv_usr_cd")))
						.cutoff$and(S0_M3.usr_nm.like(bind("rcv_usr_nm")))
						.cutoff$and(S0_T2.bcst_cd.like(bind("bcst_cd")))
						.cutoff$and(S0_M5.bp_nm.like(bind("bcst_nm")))
						.cutoff$and(S0_T2.bill_dpt_cd.like(bind("bill_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("bill_dpt_nm")))
						.cutoff$and(S0_T1.note_no.like(bind("note_no")))
						.cutoff$and(S0_T1.note_typ.like(bind("note_typ")))
						.cutoff$and(S0_T1.drawer_nm.like(bind("drawer_nm")))
						.cutoff$and(S0_T1.note_rsn_cd.like(bind("note_rsn_cd")))
						.cutoff$and(S0_M10.note_rsn_nm.like(bind("note_rsn_nm")))
						.cutoff$and(S0_T2.trd_cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_M7.cur_nm.like(bind("cur_nm")))
						.cutoff$and(S0_T2.rcv_no.like(bind("rcv_no")))
						.cutoff$and(S0_T2.div_src_rcv_no.like(bind("rcv_act_no")))
						.cutoff$and(S0_T2.rcv_mtd_cd.like(bind("rcv_mtd_cd")))
						.cutoff$and(S0_M11.sttl_nm.like(bind("rcv_mtd_nm")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_RCV_GRP)
						.addDynamicPredicate(DS0C_BILL_GRP)
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.mat_flg,
							S1_T2.dpt_cd,
							S1_M1.dpt_nm.as("rcv_dpt_nm"),
							S1_T2.wg_cd,
							S1_M2.wg_nm,
							S1_T2.usr_cd,
							S1_M3.usr_nm.as("rcv_usr_nm"),
							S1_T2.rcv_dt,
							S1_T2.rcst_cd,
							S1_M4.bp_nm.as("rcst_nm"),
							S1_T2.bcst_cd,
							S1_M5.bp_nm.as("bcst_nm"),
							S1_T2.bill_dpt_cd,
							S1_M6.dpt_nm.as("bill_dpt_nm"),
							S1_T2.trd_cur_cd.as("cur_cd"),
							S1_M7.cur_nm,
							S1_M7.amt_dec_place,
							S1_T2.trd_cur_amt,
							S1_T1.note_no,
							S1_T1.note_typ,
							S1_T1.draw_dt,
							S1_T1.due_dt,
							S1_T1.drawer_nm,
							S1_T1.endrsr,
							S1_T1.accptr,
							S1_T1.draw_bank_cd,
							S1_M8.bank_nm.as("draw_bank_nm"),
							S1_T1.draw_branch_cd,
							S1_M9.branch_nm.as("draw_branch_nm"),
							S1_T1.note_rsn_cd,
							S1_M10.note_rsn_nm,
							nullValue().as("rcv_no"),
							S1_T2.ar_sttl_cd1,
							S1_M11.sttl_nm.as("rcv_mtd_nm"),
							S1_T2.rcv_act_no,
							nullValue().as("fb_flg"),
							nullValue().as("ext_sys_cd"),
							nullValue().as("ext_sys_nm"),
							nullValue().as("ext_rcv_no"),
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							S1_T1.ins_usr_id,
							S1_T1.ins_usr_nm,
							S1_T1.ins_func_id,
							S1_T1.ins_ts,
							S1_T1.upd_usr_id,
							S1_T1.upd_usr_nm,
							S1_T1.upd_func_id,
							S1_T1.upd_ts,
							S1_T1.upd_srv_req_no,
							addDynamicSelect(DS1C_RCV_GRP),
							addDynamicSelect(DS1C_BILL_GRP)
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(S1_T1.note_mng_no.eq(S1_T2.note_mng_no))
							.innerJoin(S1_V1).on(S1_T2.dpt_cd.eq(S1_V1.dpt_cd))
							.leftOuterJoin(S1_M1).on(
								S1_T2.dpt_cd.eq(S1_M1.dpt_cd)
								.and(S1_T2.ac_dt.between(S1_M1.st_dt, S1_M1.end_dt))
							)
							.leftOuterJoin(S1_M2).on(S1_T2.wg_cd.eq(S1_M2.wg_cd))
							.leftOuterJoin(S1_M3).on(S1_T2.usr_cd.eq(S1_M3.usr_cd))
							.leftOuterJoin(S1_M4).on(S1_T2.rcst_cd.eq(S1_M4.bp_cd))
							.leftOuterJoin(S1_M5).on(S1_T2.bcst_cd.eq(S1_M5.bp_cd))
							.leftOuterJoin(S1_M6).on(
								S1_T2.bill_dpt_cd.eq(S1_M6.dpt_cd)
								.and(S1_T2.ac_dt.between(S1_M6.st_dt, S1_M6.end_dt))
							)
							.leftOuterJoin(S1_M7).on(S1_T2.trd_cur_cd.eq(S1_M7.cur_cd))
							.leftOuterJoin(S1_M8).on(S1_T1.draw_bank_cd.eq(S1_M8.bank_cd))
							.leftOuterJoin(S1_M9).on(
								S1_T1.draw_bank_cd.eq(S1_M9.bank_cd)
								.and(S1_T1.draw_branch_cd.eq(S1_M9.branch_cd))
							)
							.leftOuterJoin(S1_M10).on(S1_T1.note_rsn_cd.eq(S1_M10.note_rsn_cd))
							.leftOuterJoin(S1_M11).on(S1_T2.ar_sttl_cd1.eq(S1_M11.sttl_cd))
							.addDynamicView(DS1C_RCV_GRP)
							.addDynamicView(DS1C_BILL_GRP)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.note_mng_no.eq(S1_T2.note_mng_no))
							.and(S1_T2.rcv_no.isNull())
							.and(S1_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.and(S1_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.RCV_AR.value())))
							.and(
								S1_T1.mat_flg.eq(bind("mat_flg"))
								.or(
									S1_T1.mat_flg.eq(decode(
											bind("not_mat_flg"),
											value(true),
											value(false),
											value(true)
										)
									)
								)
							)
							.cutoff$and(S1_T2.rcv_dt.gte(bind("rcv_dt_fr")))
							.cutoff$and(S1_T2.rcv_dt.lte(bind("rcv_dt_to")))
							.cutoff$and(S1_T1.draw_dt.gte(bind("draw_dt_fr")))
							.cutoff$and(S1_T1.draw_dt.lte(bind("draw_dt_to")))
							.cutoff$and(S1_T1.due_dt.gte(bind("due_dt_fr")))
							.cutoff$and(S1_T1.due_dt.lte(bind("due_dt_to")))
							.cutoff$and(S1_T2.rcst_cd.like(bind("rcst_cd")))
							.cutoff$and(S1_M4.bp_nm.like(bind("rcst_nm")))
							.cutoff$and(S1_T2.dpt_cd.like(bind("rcv_dpt_cd")))
							.cutoff$and(S1_M1.dpt_nm.like(bind("rcv_dpt_nm")))
							.cutoff$and(S1_T2.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M2.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T2.usr_cd.like(bind("rcv_usr_cd")))
							.cutoff$and(S1_M3.usr_nm.like(bind("rcv_usr_nm")))
							.cutoff$and(S1_T2.bcst_cd.like(bind("bcst_cd")))
							.cutoff$and(S1_M5.bp_nm.like(bind("bcst_nm")))
							.cutoff$and(S1_T2.bill_dpt_cd.like(bind("bill_dpt_cd")))
							.cutoff$and(S1_M6.dpt_nm.like(bind("bill_dpt_nm")))
							.cutoff$and(S1_T1.note_no.like(bind("note_no")))
							.cutoff$and(S1_T1.note_typ.like(bind("note_typ")))
							.cutoff$and(S1_T1.drawer_nm.like(bind("drawer_nm")))
							.cutoff$and(S1_T1.note_rsn_cd.like(bind("note_rsn_cd")))
							.cutoff$and(S1_M10.note_rsn_nm.like(bind("note_rsn_nm")))
							.cutoff$and(S1_T2.trd_cur_cd.like(bind("cur_cd")))
							.cutoff$and(S1_M7.cur_nm.like(bind("cur_nm")))
							.cutoff$and(S1_T2.rcv_no.like(bind("rcv_no")))
							.cutoff$and(S1_T2.rcv_act_no.like(bind("rcv_act_no")))
							.cutoff$and(S1_T2.ar_sttl_cd1.like(bind("rcv_mtd_cd")))
							.cutoff$and(S1_M11.sttl_nm.like(bind("rcv_mtd_nm")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.addDynamicPredicate(DS1C_RCV_GRP)
							.addDynamicPredicate(DS1C_BILL_GRP)
						)
					)
					.orderBy(pr("note_no").asc())
			)
			.setDynamicSQLInfo(
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
					.predicate(DS0C_BILL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("bill_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("bill_grp_nm10")))),
				when(boundOr("rcv_grp_flg1"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd1.as("rcv_grp_cd1"), S1_MM11.bp_grp_nm.as("rcv_grp_nm1"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM11).on(S1_M4.bp_grp_cd1.eq(S1_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM11.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd1.like(bind("rcv_grp_cd1"))).cutoff$and(S1_MM11.bp_grp_nm.like(bind("rcv_grp_nm1")))),
				when(boundOr("rcv_grp_flg2"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd2.as("rcv_grp_cd2"), S1_MM12.bp_grp_nm.as("rcv_grp_nm2"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM12).on(S1_M4.bp_grp_cd2.eq(S1_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM12.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd2.like(bind("rcv_grp_cd2"))).cutoff$and(S1_MM12.bp_grp_nm.like(bind("rcv_grp_nm2")))),
				when(boundOr("rcv_grp_flg3"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd3.as("rcv_grp_cd3"), S1_MM13.bp_grp_nm.as("rcv_grp_nm3"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM13).on(S1_M4.bp_grp_cd3.eq(S1_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM13.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd3.like(bind("rcv_grp_cd3"))).cutoff$and(S1_MM13.bp_grp_nm.like(bind("rcv_grp_nm3")))),
				when(boundOr("rcv_grp_flg4"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd4.as("rcv_grp_cd4"), S1_MM14.bp_grp_nm.as("rcv_grp_nm4"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM14).on(S1_M4.bp_grp_cd4.eq(S1_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM14.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd4.like(bind("rcv_grp_cd4"))).cutoff$and(S1_MM14.bp_grp_nm.like(bind("rcv_grp_nm4")))),
				when(boundOr("rcv_grp_flg5"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd5.as("rcv_grp_cd5"), S1_MM15.bp_grp_nm.as("rcv_grp_nm5"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM15).on(S1_M4.bp_grp_cd5.eq(S1_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM15.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd5.like(bind("rcv_grp_cd5"))).cutoff$and(S1_MM15.bp_grp_nm.like(bind("rcv_grp_nm5")))),
				when(boundOr("rcv_grp_flg6"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd6.as("rcv_grp_cd6"), S1_MM16.bp_grp_nm.as("rcv_grp_nm6"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM16).on(S1_M4.bp_grp_cd6.eq(S1_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM16.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd6.like(bind("rcv_grp_cd6"))).cutoff$and(S1_MM16.bp_grp_nm.like(bind("rcv_grp_nm6")))),
				when(boundOr("rcv_grp_flg7"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd7.as("rcv_grp_cd7"), S1_MM17.bp_grp_nm.as("rcv_grp_nm7"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM17).on(S1_M4.bp_grp_cd7.eq(S1_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM17.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd7.like(bind("rcv_grp_cd7"))).cutoff$and(S1_MM17.bp_grp_nm.like(bind("rcv_grp_nm7")))),
				when(boundOr("rcv_grp_flg8"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd8.as("rcv_grp_cd8"), S1_MM18.bp_grp_nm.as("rcv_grp_nm8"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM18).on(S1_M4.bp_grp_cd8.eq(S1_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM18.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd8.like(bind("rcv_grp_cd8"))).cutoff$and(S1_MM18.bp_grp_nm.like(bind("rcv_grp_nm8")))),
				when(boundOr("rcv_grp_flg9"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd9.as("rcv_grp_cd9"), S1_MM19.bp_grp_nm.as("rcv_grp_nm9"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM19).on(S1_M4.bp_grp_cd9.eq(S1_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM19.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd9.like(bind("rcv_grp_cd9"))).cutoff$and(S1_MM19.bp_grp_nm.like(bind("rcv_grp_nm9")))),
				when(boundOr("rcv_grp_flg10"))
					.select(DS1C_RCV_GRP, S1_M4.bp_grp_cd10.as("rcv_grp_cd10"), S1_MM110.bp_grp_nm.as("rcv_grp_nm10"))
					.view(DS1C_RCV_GRP, v -> v.leftOuterJoin(S1_MM110).on(S1_M4.bp_grp_cd10.eq(S1_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM110.bp_grp_typ))))
					.predicate(DS1C_RCV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd10.like(bind("rcv_grp_cd10"))).cutoff$and(S1_MM110.bp_grp_nm.like(bind("rcv_grp_nm10")))),
				when(boundOr("bill_grp_flg1"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd1.as("bill_grp_cd1"), S1_MM21.bp_grp_nm.as("bill_grp_nm1"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM21).on(S1_M5.bp_grp_cd1.eq(S1_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM21.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd1.like(bind("bill_grp_cd1"))).cutoff$and(S1_MM21.bp_grp_nm.like(bind("bill_grp_nm1")))),
				when(boundOr("bill_grp_flg2"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd2.as("bill_grp_cd2"), S1_MM22.bp_grp_nm.as("bill_grp_nm2"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM22).on(S1_M5.bp_grp_cd2.eq(S1_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM22.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd2.like(bind("bill_grp_cd2"))).cutoff$and(S1_MM22.bp_grp_nm.like(bind("bill_grp_nm2")))),
				when(boundOr("bill_grp_flg3"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd3.as("bill_grp_cd3"), S1_MM23.bp_grp_nm.as("bill_grp_nm3"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM23).on(S1_M5.bp_grp_cd3.eq(S1_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM23.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd3.like(bind("bill_grp_cd3"))).cutoff$and(S1_MM23.bp_grp_nm.like(bind("bill_grp_nm3")))),
				when(boundOr("bill_grp_flg4"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd4.as("bill_grp_cd4"), S1_MM24.bp_grp_nm.as("bill_grp_nm4"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM24).on(S1_M5.bp_grp_cd4.eq(S1_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM24.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd4.like(bind("bill_grp_cd4"))).cutoff$and(S1_MM24.bp_grp_nm.like(bind("bill_grp_nm4")))),
				when(boundOr("bill_grp_flg5"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd5.as("bill_grp_cd5"), S1_MM25.bp_grp_nm.as("bill_grp_nm5"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM25).on(S1_M5.bp_grp_cd5.eq(S1_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM25.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd5.like(bind("bill_grp_cd5"))).cutoff$and(S1_MM25.bp_grp_nm.like(bind("bill_grp_nm5")))),
				when(boundOr("bill_grp_flg6"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd6.as("bill_grp_cd6"), S1_MM26.bp_grp_nm.as("bill_grp_nm6"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM26).on(S1_M5.bp_grp_cd6.eq(S1_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM26.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd6.like(bind("bill_grp_cd6"))).cutoff$and(S1_MM26.bp_grp_nm.like(bind("bill_grp_nm6")))),
				when(boundOr("bill_grp_flg7"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd7.as("bill_grp_cd7"), S1_MM27.bp_grp_nm.as("bill_grp_nm7"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM27).on(S1_M5.bp_grp_cd7.eq(S1_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM27.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd7.like(bind("bill_grp_cd7"))).cutoff$and(S1_MM27.bp_grp_nm.like(bind("bill_grp_nm7")))),
				when(boundOr("bill_grp_flg8"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd8.as("bill_grp_cd8"), S1_MM28.bp_grp_nm.as("bill_grp_nm8"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM28).on(S1_M5.bp_grp_cd8.eq(S1_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM28.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd8.like(bind("bill_grp_cd8"))).cutoff$and(S1_MM28.bp_grp_nm.like(bind("bill_grp_nm8")))),
				when(boundOr("bill_grp_flg9"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd9.as("bill_grp_cd9"), S1_MM29.bp_grp_nm.as("bill_grp_nm9"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM29).on(S1_M5.bp_grp_cd9.eq(S1_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM29.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd9.like(bind("bill_grp_cd9"))).cutoff$and(S1_MM29.bp_grp_nm.like(bind("bill_grp_nm9")))),
				when(boundOr("bill_grp_flg10"))
					.select(DS1C_BILL_GRP, S1_M5.bp_grp_cd10.as("bill_grp_cd10"), S1_MM210.bp_grp_nm.as("bill_grp_nm10"))
					.view(DS1C_BILL_GRP, v -> v.leftOuterJoin(S1_MM210).on(S1_M5.bp_grp_cd10.eq(S1_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM210.bp_grp_typ))))
					.predicate(DS1C_BILL_GRP, p -> p.cutoff$and(S1_M5.bp_grp_cd10.like(bind("bill_grp_cd10"))).cutoff$and(S1_MM210.bp_grp_nm.like(bind("bill_grp_nm10"))))
			);
	}
}