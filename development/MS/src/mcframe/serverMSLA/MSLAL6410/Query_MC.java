package mcframe.serverMSLA.MSLAL6410;

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
	 * -- MSLAL6410_MST_INSP_INST_S01
	 */
	static MCQueryPlan MSLAL6410_MST_INSP_INST_S01() {
		MSW_INSP_INST_KEY_R S0_INSPINSTKEY = MSW_INSP_INST_KEY_R.create("INSPINSTKEY");
		MST_INSP_INST_R S0_INSPINST = MST_INSP_INST_R.create("INSPINST");
		MST_INSP_SCHD_R S0_INSPSCHD = MST_INSP_SCHD_R.create("INSPSCHD");
		MCTempView S0_INSPSCHD2 = createTempView("INSPSCHD2");
		MST_STK_R S0_STK = MST_STK_R.create("STK");
		MST_MFG_INST_R S0_MFGINST = MST_MFG_INST_R.create("MFGINST");
		MST_ARR_ACT_R S0_ARRACT = MST_ARR_ACT_R.create("ARRACT");
		MAM_DPT_R S0_DPT1 = MAM_DPT_R.create("DPT1");
		MAM_DPT_R S0_DPT2 = MAM_DPT_R.create("DPT2");
		MAM_DPT_R S0_DPT3 = MAM_DPT_R.create("DPT3");
		MAM_DPT_R S0_DPT4 = MAM_DPT_R.create("DPT4");
		MAM_DPT_R S0_DPT5 = MAM_DPT_R.create("DPT5");
		MAM_USR_R S0_USR1 = MAM_USR_R.create("USR1");
		MAM_USR_R S0_USR2 = MAM_USR_R.create("USR2");
		MAM_USR_R S0_USR3 = MAM_USR_R.create("USR3");
		MST_INSP_SCHD_R S1_S0_INSPSCHD_TMP = MST_INSP_SCHD_R.create("INSPSCHD_TMP");


		return createQueryPlan()
				.setQuery(
						sql("MSLAL6410_MST_INSP_INST_S01")
								.mainQuery()
								.select(
										S0_INSPINST.insp_no,
										S0_INSPINST.insp_freq,
										S0_INSPINST.insp_typ,
										S0_INSPINST.insp_mtd_typ,
										S0_INSPINST.insp_sts_typ,
										S0_INSPINST.insp_bind_typ,
										S0_INSPINST.col_schd_flg,
										S0_INSPINST.insp_lst_prnt_flg,
										S0_INSPINST.insp_lst_prnt_tm,
										S0_INSPINST.itm_cd,
										S0_INSPINST.itm_sub1,
										S0_INSPINST.itm_sub2,
										S0_INSPINST.itm_sub3,
										S0_INSPINST.lot_no,
										S0_INSPINST.sublot_no,
										S0_ARRACT.arr_tm,
										S0_INSPINST.sppl_cd,
										S0_INSPINST.maker_cd,
										S0_INSPINST.mfg_loc_cd,
										S0_INSPINST.to_site_cd,
										S0_INSPINST.bp_lot_no,
										S0_INSPINST.pack_unit_qty,
										S0_INSPINST.pack_unit_cd,
										S0_INSPINST.base_unit_qty,
										S0_INSPINST.base_unit_cd,
										S0_INSPINST.insp_lst_no,
										S0_INSPINST.inst_dt,
										S0_INSPINST.inst_dpt_cd,
										S0_DPT4.dpt_nm.as("inst_dpt_nm"),
										S0_INSPINST.inst_usr_cd,
										cases()
												.when(S0_INSPINST.insp_typ.eq(value("1")))
												.then(
														nvl(
																S0_MFGINST.aprv_dpt_cd,
																S0_MFGINST.inst_dpt_cd
														)
												)
												.when(S0_INSPINST.insp_typ.eq(value("2")))
												.then(S0_ARRACT.arr_dpt_cd)
												.otherwise(nullValue()).as("src_dpt_cd"),
										cases()
												.when(S0_INSPINST.insp_typ.eq(value("1")))
												.then(
														nvl(
																S0_DPT1.dpt_nm,
																S0_DPT2.dpt_nm
														)
												)
												.when(S0_INSPINST.insp_typ.eq(value("2")))
												.then(S0_DPT3.dpt_nm)
												.otherwise(nullValue()).as("src_dpt_nm"),
										cases()
												.when(S0_INSPINST.insp_typ.eq(value("1")))
												.then(
														nvl(
																S0_MFGINST.aprv_usr_cd,
																S0_MFGINST.inst_usr_cd
														)
												)
												.when(S0_INSPINST.insp_typ.eq(value("2")))
												.then(S0_ARRACT.arr_usr_cd)
												.otherwise(nullValue()).as("src_usr_cd"),
										cases()
												.when(S0_INSPINST.insp_typ.eq(value("1")))
												.then(
														nvl(
																S0_USR1.usr_nm,
																S0_USR2.usr_nm
														)
												)
												.when(S0_INSPINST.insp_typ.eq(value("2")))
												.then(S0_USR3.usr_nm)
												.otherwise(nullValue()).as("src_usr_nm"),
										S0_INSPINST.master_dt,
										S0_MFGINST.st_schd_tm.as("mfg_st_schd_tm"),
										S0_MFGINST.end_schd_tm.as("mfg_end_schd_tm"),
										S0_INSPINST.st_tm.as("insp_st_tm"),
										S0_INSPINST.end_tm.as("insp_end_tm"),
										S0_INSPINST.insp_ptn_cd,
										S0_INSPINST.std_req_flg.as("std_req_flg"),
										S0_INSPINST.std_cnf_req_flg,
										S0_INSPINST.insp_std_no,
										S0_INSPINST.plnt_aprv_flg,
										S0_INSPINST.insp_rslt_prnt_flg,
										S0_INSPINST.insp_rslt_prnt_tm,
										S0_INSPINST.seq,
										S0_INSPINST.lmt_up_flg,
										S0_INSPINST.insp_aprv_flg,
										S0_INSPINST.insp_aprv_sts_typ,
										S0_INSPINST.aprv_dt,
										S0_INSPINST.insp_aprv_role_cd,
										S0_INSPINST.aprv_dpt_cd,
										S0_DPT5.dpt_nm.as("aprv_dpt_nm"),
										S0_INSPINST.aprv_usr_cd,
										S0_INSPINST.aprv_rsn,
										S0_INSPINST.act_cont_fctr,
										S0_INSPINST.intr_rmrks,
										S0_INSPSCHD.insp_schd_no,
										S0_INSPSCHD.src_no1,
										S0_INSPSCHD.src_no2,
										S0_INSPSCHD.src_no3,
										S0_INSPSCHD.src_no4,
										S0_INSPSCHD.loc_cd.as("schd_loc_cd"),
										S0_INSPSCHD.str_ln_cd.as("schd_str_ln_cd"),
										S0_INSPSCHD.stk_arrv_bp_cd.as("schd_stk_arrv_bp_cd"),
										S0_INSPSCHD.sno1.as("schd_sno1"),
										S0_INSPSCHD.sno2.as("schd_sno2"),
										S0_INSPSCHD.sno3.as("schd_sno3"),
										S0_INSPSCHD.sno4.as("schd_sno4"),
										S0_INSPSCHD.gd_cd.as("schd_gd_cd"),
										S0_INSPSCHD.quality_typ.as("schd_quality_typ"),
										S0_INSPSCHD.stk_insp_typ.as("schd_stk_insp_typ"),
										S0_INSPSCHD.stk_id_typ.as("schd_stk_id_typ"),
										S0_INSPSCHD.stk_bp_cd.as("schd_stk_bp_cd"),
										S0_INSPSCHD.pack_unit_qty.as("schd_pack_unit_qty"),
										S0_INSPSCHD.pack_unit_cd.as("schd_pack_unit_cd"),
										S0_INSPSCHD.base_unit_qty.as("schd_base_unit_qty"),
										S0_INSPSCHD.base_unit_cd.as("schd_base_unit_cd"),
										S0_STK.loc_cd.as("stk_loc_cd"),
										S0_STK.str_ln_cd.as("stk_str_ln_cd"),
										S0_STK.stk_arrv_bp_cd,
										S0_STK.sno1.as("stk_sno1"),
										S0_STK.sno2.as("stk_sno2"),
										S0_STK.sno3.as("stk_sno3"),
										S0_STK.sno4.as("stk_sno4"),
										S0_STK.fix_no_typ.as("stk_fix_no_typ"),
										S0_STK.fix_no.as("stk_fix_no"),
										S0_STK.pack_unit_cd.as("stk_pack_unit_cd"),
										S0_STK.gd_cd.as("stk_gd_cd"),
										S0_STK.quality_typ.as("stk_quality_typ"),
										S0_STK.stk_insp_typ,
										S0_STK.stk_id_typ,
										S0_STK.stk_bp_cd,
										S0_STK.pack_unit_qty.as("stk_pack_unit_qty"),
										S0_STK.base_unit_qty.as("stk_base_unit_qty"),
										S0_INSPSCHD.smpl_schd_qty,
										S0_INSPSCHD.smpl_inst_qty,
										S0_INSPSCHD.own_insp_no,
										S0_INSPSCHD.own_insp_schd_no,
										S0_INSPSCHD.org_insp_schd_no,
										S0_INSPSCHD.ac_dt,
										S0_INSPSCHD.itm_ord_no,
										S0_INSPSCHD.in_prmt_insp_flg,
										S0_INSPSCHD.trd_cd,
										S0_INSPSCHD.insp_lt,
										S0_INSPSCHD.insp_offst,
										S0_INSPSCHD.insp_cnt_rmrks
								)
								.from(
										S0_INSPINST
												.innerJoin(S0_INSPINSTKEY).on(S0_INSPINST.insp_no.eq(S0_INSPINSTKEY.insp_no))
												.innerJoin(S0_INSPSCHD).on(S0_INSPINST.insp_no.eq(S0_INSPSCHD.insp_no))
												.innerJoin(
														subQuery()
																.select(
																		S1_S0_INSPSCHD_TMP.insp_schd_no,
																		bracket(
																				cases()
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("2")))
																						.then(value("5"))
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("1")))
																						.then(value("4"))
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("3")))
																						.then(value("7"))
																						.otherwise(nullValue())
																		).as("fix_no_typ"),
																		bracket(
																				cases()
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("2")))
																						.then(S1_S0_INSPSCHD_TMP.src_no4)
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("1")))
																						.then(S1_S0_INSPSCHD_TMP.src_no4)
																						.when(S1_S0_INSPSCHD_TMP.insp_typ.eq(value("3")))
																						.then(S1_S0_INSPSCHD_TMP.insp_schd_no)
																						.otherwise(nullValue())
																		).as("fix_no")
																)
																.from(S1_S0_INSPSCHD_TMP).view(S0_INSPSCHD2)
												).on(S0_INSPSCHD.insp_schd_no.eq(S0_INSPSCHD2.pr(S1_S0_INSPSCHD_TMP.insp_schd_no)))
												.leftOuterJoin(S0_STK).on(
														S0_INSPSCHD2.pr("fix_no_typ").eq(S0_STK.fix_no_typ)
																.and(S0_INSPSCHD2.pr("fix_no").eq(S0_STK.fix_no))
												)
												.leftOuterJoin(S0_MFGINST).on(S0_INSPSCHD.src_no1.eq(S0_MFGINST.mfg_inst_no))
												.leftOuterJoin(S0_ARRACT).on(
														S0_INSPSCHD.src_no4.eq(S0_ARRACT.arr_act_no)
																.and(S0_INSPSCHD.insp_typ.eq(value("2")))
												)
												.leftOuterJoin(S0_DPT1).on(
														S0_MFGINST.aprv_dpt_cd.eq(S0_DPT1.dpt_cd)
																.and(S0_MFGINST.aprv_dt.between(S0_DPT1.st_dt, S0_DPT1.end_dt))
												)
												.leftOuterJoin(S0_DPT2).on(
														S0_MFGINST.inst_dpt_cd.eq(S0_DPT2.dpt_cd)
																.and(S0_MFGINST.inst_dt.between(S0_DPT2.st_dt, S0_DPT2.end_dt))
														)
												.leftOuterJoin(S0_DPT3).on(
														S0_ARRACT.arr_dpt_cd.eq(S0_DPT3.dpt_cd)
																.and(S0_ARRACT.arr_tm.between(S0_DPT3.st_dt, S0_DPT3.end_dt))
														)
												.leftOuterJoin(S0_USR1).on(S0_MFGINST.aprv_usr_cd.eq(S0_USR1.usr_cd))
												.leftOuterJoin(S0_USR2).on(S0_MFGINST.inst_usr_cd.eq(S0_USR2.usr_cd))
												.leftOuterJoin(S0_USR3).on(S0_ARRACT.arr_usr_cd.eq(S0_USR3.usr_cd))
												.leftOuterJoin(S0_DPT4).on(
														S0_INSPINST.inst_dpt_cd.eq(S0_DPT4.dpt_cd)
																.and(S0_INSPINST.inst_dt.between(S0_DPT4.st_dt, S0_DPT4.end_dt))
														)
												.leftOuterJoin(S0_DPT5).on(
														S0_INSPINST.aprv_dpt_cd.eq(S0_DPT5.dpt_cd)
																.and(S0_INSPINST.aprv_dt.between(S0_DPT5.st_dt, S0_DPT5.end_dt))
														)
								)
				)
				.setJoinInfo(
						joinInfo(
								j -> j
										.add(MSVT_LOT_LIST_R.class, r -> toCondition(
												r.getStringNE("itm_cd"),
												r.getStringNE("itm_sub1"),
												r.getStringNE("itm_sub2"),
												r.getStringNE("itm_sub3"),
												r.getStringNE("lot_no"),
												r.getStringNE("sublot_no")
										))
										.addSelect(m -> toArray(
												m.first_gr_dt,
												m.vld_dt,
												m.lmt_dt,
												m.lmt_dt_frm
										))
										.addMap((r, m) -> {
											r.setDateNE("first_gr_dt", m.first_gr_dt());
											r.setDateNE("vld_dt", m.vld_dt());
											r.setDateNE("lmt_dt", m.lmt_dt());
											r.setDateNE("lmt_dt_frm", m.lmt_dt_frm());
										}),
								j -> j
										.add(MST_PO_D_R.class, r -> toCondition(
												r.getStringNE("src_no1")
										))
										.addSelect(m -> toArray(
												m.po_no
										))
										.addMap((r, m) -> {
											r.setStringNE("po_no", m.po_no());
										}),
								j -> j
										.add(MAM_ITM_R.class, r -> toCondition(
												r.getStringNE("itm_cd"),
												r.getStringNE("itm_sub1"),
												r.getStringNE("itm_sub2"),
												r.getStringNE("itm_sub3")
										))
										.addSelect(m -> toArray(
												m.itm_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("itm_nm", m.itm_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("sppl_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("sppl_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("maker_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("maker_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_LOC_R.class, r -> toCondition(
												r.getStringNE("mfg_loc_cd")
										))
										.addSelect(m -> toArray(
												m.loc_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("mfg_loc_nm", m.loc_nm());
										}),
								j -> j
										.add(MAM_SITE_R.class, r -> toCondition(
												r.getStringNE("to_site_cd")
										))
										.addSelect(m -> toArray(
												m.site_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("to_site_nm", m.site_nm());
										}),
								j -> j
										.add(MAM_UNIT_R.class, r -> toCondition(
												r.getStringNE("pack_unit_cd")
										))
										.addSelect(m -> toArray(
												m.unit_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("pack_unit_nm", m.unit_nm());
										}),
								j -> j
										.add(MAM_UNIT_R.class, r -> toCondition(
												r.getStringNE("base_unit_cd")
										))
										.addSelect(m -> toArray(
												m.unit_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("base_unit_nm", m.unit_nm());
										}),
								j -> j
										.add(MAM_UNIT_R.class, r -> toCondition(
												r.getStringNE("schd_pack_unit_cd")
										))
										.addSelect(m -> toArray(
												m.unit_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_pack_unit_nm", m.unit_nm());
										}),
								j -> j
										.add(MAM_UNIT_R.class, r -> toCondition(
												r.getStringNE("schd_base_unit_cd")
										))
										.addSelect(m -> toArray(
												m.unit_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_base_unit_nm", m.unit_nm());
										}),
								j -> j
										.add(MAM_UNIT_R.class, r -> toCondition(
												r.getStringNE("stk_pack_unit_cd")
										))
										.addSelect(m -> toArray(
												m.unit_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_pack_unit_nm", m.unit_nm());
										}),
								j -> j
										.add(MAM_INSP_PTN_R.class, r -> toCondition(
												r.getStringNE("insp_ptn_cd")
										))
										.addSelect(m -> toArray(
												m.insp_ptn_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("insp_ptn_nm", m.insp_ptn_nm());
										}),
								j -> j
										.add(MAM_APRV_ROLE_R.class, r -> toCondition(
												r.getStringNE("insp_aprv_role_cd")
										))
										.addSelect(m -> toArray(
												m.aprv_role_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("insp_aprv_role_nm", m.aprv_role_nm());
										}),
								j -> j
										.add(MAM_USR_R.class, r -> toCondition(
												r.getStringNE("aprv_usr_cd")
										))
										.addSelect(m -> toArray(
												m.usr_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("aprv_usr_nm", m.usr_nm());
										}),
								j -> j
										.add(MAM_LOC_R.class, r -> toCondition(
												r.getStringNE("schd_loc_cd")
										))
										.addSelect(m -> toArray(
												m.loc_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_loc_nm", m.loc_nm());
										}),
								j -> j
										.add(MAM_STR_LN_R.class, r -> toCondition(
												r.getStringNE("schd_loc_cd"),
												r.getStringNE("schd_str_ln_cd")
										))
										.addSelect(m -> toArray(
												m.str_ln_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_str_ln_nm", m.str_ln_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("schd_stk_arrv_bp_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_stk_arrv_bp_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_STK_GD_R.class, r -> toCondition(
												r.getStringNE("schd_gd_cd")
										))
										.addSelect(m -> toArray(
												m.gd_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_gd_nm", m.gd_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("schd_stk_bp_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("schd_stk_bp_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_LOC_R.class, r -> toCondition(
												r.getStringNE("stk_loc_cd")
										))
										.addSelect(m -> toArray(
												m.loc_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_loc_nm", m.loc_nm());
										}),
								j -> j
										.add(MAM_STR_LN_R.class, r -> toCondition(
												r.getStringNE("stk_loc_cd"),
												r.getStringNE("stk_str_ln_cd")
										))
										.addSelect(m -> toArray(
												m.str_ln_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_str_ln_nm", m.str_ln_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("stk_arrv_bp_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_STK_GD_R.class, r -> toCondition(
												r.getStringNE("stk_gd_cd")
										))
										.addSelect(m -> toArray(
												m.gd_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_gd_nm", m.gd_nm());
										}),
								j -> j
										.add(MAM_BP_R.class, r -> toCondition(
												r.getStringNE("stk_bp_cd")
										))
										.addSelect(m -> toArray(
												m.bp_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("stk_bp_nm", m.bp_nm());
										}),
								j -> j
										.add(MAM_TRD_R.class, r -> toCondition(
												r.getStringNE("trd_cd")
										))
										.addSelect(m -> toArray(
												m.trd_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("trd_nm", m.trd_nm());
										}),
								j -> j
										.add(MAM_USR_R.class, r -> toCondition(
												r.getStringNE("inst_usr_cd")
										))
										.addSelect(m -> toArray(
												m.usr_nm
										))
										.addMap((r, m) -> {
											r.setStringNE("inst_usr_nm", m.usr_nm());
										})
						)
				);
	}
}
