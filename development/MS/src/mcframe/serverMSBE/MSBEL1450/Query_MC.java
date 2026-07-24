package mcframe.serverMSBE.MSBEL1450;

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
import mcframe.serverCore.queryapi.IFMCSQL.MCSingleView;
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
	 * -- MSBEL1450_MST_SHIP_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL1450_MST_SHIP_ACT_S01() {
		MST_SHIP_ACT_R S0_T1 = MST_SHIP_ACT_R.create("T1");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_ACT_D_P_R S0_T2 = MST_SHIP_ACT_D_P_R.create("T2");
		MST_SHIP_INST_R S0_T3 = MST_SHIP_INST_R.create("T3");
		MST_SHIP_ALLOC_STS_R S0_T4 = MST_SHIP_ALLOC_STS_R.create("T4");
		MST_SHIP_SCHD_R S0_T6 = MST_SHIP_SCHD_R.create("T6");
		MST_SHIP_PR_R S0_T7 = MST_SHIP_PR_R.create("T7");
		MST_DLV_SLIP_R S0_T8 = MST_DLV_SLIP_R.create("T8");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_LG_GRP_R S0_M7 = MAM_LG_GRP_R.create("M7");
		MST_SHIP_ACT_D_R S1_SHIP_ACT_D = MST_SHIP_ACT_D_R.create("SHIP_ACT_D");
		MST_SHIP_ACT_D_R S2 = MST_SHIP_ACT_D_R.create();
		MST_SHIP_ACT_D_R S3 = MST_SHIP_ACT_D_R.create();
		MST_SHIP_ACT_D_P_R S4_W1 = MST_SHIP_ACT_D_P_R.create("W11");
		MST_DLV_SLIP_R S4_W2 = MST_DLV_SLIP_R.create("W12");
		MST_SHIP_ACT_D_P_R S5_W1 = MST_SHIP_ACT_D_P_R.create("W21");
		MST_DLV_SLIP_R S5_W2 = MST_DLV_SLIP_R.create("W22");
		MST_SHIP_ACT_D_P_R S6_W1 = MST_SHIP_ACT_D_P_R.create("W31");
		MST_DLV_SLIP_R S6_W2 = MST_DLV_SLIP_R.create("W32");
		MST_SHIP_ACT_D_P_R S7_W1 = MST_SHIP_ACT_D_P_R.create("W41");
		MST_DLV_SLIP_R S7_W2 = MST_DLV_SLIP_R.create("W42");
		MST_SLS_ACT_R S9 = MST_SLS_ACT_R.create("T9");
		MST_DLV_SLIP_R S16 = MST_DLV_SLIP_R.create();

		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1450_MST_SHIP_ACT_Query_S01")
					.mainQuery()
					.select(
						trunc(
							S0_T3.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T3.ship_inst_tm.as("ship_inst_hm"),
						trunc(
							S0_T3.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T3.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_T1.ac_dt,
						trunc(
							S0_T3.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T3.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M7.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M7.ship_slip_act_flg.as("dlv_prnt_flg"),
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M5.loc_nm,
								S0_M6.bp_nm
							),
							S0_T1.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						countAll().as("d_cnt"),
						sum(S0_M2.unit_wt.multiply(S0_T2.trd_unit_qty)).as("wt"),
						sum(S0_M2.unit_dim.multiply(S0_T2.trd_unit_qty)).as("dim"),
						S0_T1.ship_act_no,
						S0_T1.ship_inst_no,
						max(
							S0_T8.slip_prnt_flg
						).as("dlv_prnted_flg"),
						max(
							S0_T8.ship_adv_prnt_flg
						).as("adv_prnted_flg"),
						countDistinct(S0_T2.dlv_slip_no).as("slip_cnt"),
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ship_usr_cd.as("act_usr_cd"),
						S0_M3.usr_nm.as("act_usr_nm"),
						S0_T1.ship_dpt_cd.as("act_dpt_cd"),
						S0_M4.dpt_nm.as("act_dpt_nm"),
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						max(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(value(1)))
										.from(S1_SHIP_ACT_D)
										.where(
											S1_SHIP_ACT_D.ship_act_no.eq(S0_T1.ship_act_no)
											.and(S1_SHIP_ACT_D.wms_flg.eq(value(true)))
											.and(S1_SHIP_ACT_D.can_flg.eq(value(false)).or(S1_SHIP_ACT_D.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true))).and(S1_SHIP_ACT_D.upd_srv_req_no.eq(S0_T1.upd_srv_req_no))))
										)
									).gt(value(0))
								)
									.then(value(1))
								.otherwise(value(0))
						).as("wms_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_act_no.eq(S0_T1.ship_act_no)
								.and(S0_T2.ship_act_rev.eq(S0_T1.ship_act_rev))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.ship_alloc_sts_no.eq(S0_T2.ship_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.ship_schd_no.eq(S0_T4.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.ship_pr_no.eq(S0_T6.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T8.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M2.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.usr_cd.eq(S0_T1.ship_usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.ship_dpt_cd)
								.and(S0_M4.st_dt.lte(S0_T1.ac_dt))
								.and(S0_M4.end_dt.gte(S0_T1.ac_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.loc_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bp_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S9).on(
							bracket(
								S9.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S9.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M7.lg_grp_nm.like(bind("lg_grp_nm")))
						.cutoff$and(
								S0_T1.can_flg.eq(value(false))
								.and(bind("not_prnt_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								S0_T2.can_flg.eq(value(false))
								.and(bind("not_prnt_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									bind("prnt_mode_flg").eq(value(true))
									.and(
										S0_T1.can_flg.eq(value(false))
										.and(S0_T2.can_flg.eq(value(false)))
									)
									.or(
										S0_T1.can_flg.eq(value(true))
										.and(bind("can_disp_flg").eq(value(true)))
										.and(S0_T2.upd_srv_req_no.eq(S0_T1.upd_srv_req_no))
									)
								)
							)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2)
										.where(
											S2.ship_act_no.eq(S0_T1.ship_act_no)
											.and(
												S2.can_flg.eq(value(false))
												.or(
													S2.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S2.wms_flg.eq(value(true)))
										)
									)
								)
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3)
										.where(
											S3.ship_act_no.eq(S0_T1.ship_act_no)
											.and(
												S3.can_flg.eq(value(false))
												.or(
													S3.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S3.wms_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(S0_T2.ext_ship_act_no.like(bind("ext_ship_act_no")))
						.and(
							bracket(
								bind("dlv_not_prnted").eq(value(true))
								.and(bind("dlv_prnted").eq(value(true)))
							)
							.or(
								bind("dlv_not_prnted").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S4_W1
											.innerJoin(S4_W2).on(
												S4_W2.dlv_slip_no.eq(S4_W1.dlv_slip_no)
												.and(S4_W2.dlv_slip_seq.eq(S4_W1.dlv_slip_seq))
											)
										)
										.where(
											S4_W1.ship_act_no.eq(S0_T1.ship_act_no)
											.and(S4_W1.ship_act_rev.eq(S0_T1.ship_act_rev))
											.and(
												S4_W1.can_flg.eq(value(false))
												.or(
													S4_W1.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S4_W2.slip_prnt_flg.eq(value(true)))
										)
									)
								)
							)
							.or(
								bind("dlv_prnted").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S5_W1
											.innerJoin(S5_W2).on(
												S5_W2.dlv_slip_no.eq(S5_W1.dlv_slip_no)
												.and(S5_W2.dlv_slip_seq.eq(S5_W1.dlv_slip_seq))
											)
										)
										.where(
											S5_W1.ship_act_no.eq(S0_T1.ship_act_no)
											.and(S5_W1.ship_act_rev.eq(S0_T1.ship_act_rev))
											.and(
												S5_W1.can_flg.eq(value(false))
												.or(
													S5_W1.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S5_W2.slip_prnt_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.and(
							bracket(
								bind("adv_not_prnted").eq(value(true))
								.and(bind("adv_prnted").eq(value(true)))
							)
							.or(
								bind("adv_not_prnted").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_W1
											.innerJoin(S6_W2).on(
												S6_W2.dlv_slip_no.eq(S6_W1.dlv_slip_no)
												.and(S6_W2.dlv_slip_seq.eq(S6_W1.dlv_slip_seq))
											)
										)
										.where(
											S6_W1.ship_act_no.eq(S0_T1.ship_act_no)
											.and(S6_W1.ship_act_rev.eq(S0_T1.ship_act_rev))
											.and(
												S6_W1.can_flg.eq(value(false))
												.or(
													S6_W1.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S6_W2.ship_adv_prnt_flg.eq(value(true)))
										)
									)
								)
							)
							.or(
								bind("adv_prnted").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S7_W1
											.innerJoin(S7_W2).on(
												S7_W2.dlv_slip_no.eq(S7_W1.dlv_slip_no)
												.and(S7_W2.dlv_slip_seq.eq(S7_W1.dlv_slip_seq))
											)
										)
										.where(
											S7_W1.ship_act_no.eq(S0_T1.ship_act_no)
											.and(S7_W1.ship_act_rev.eq(S0_T1.ship_act_rev))
											.and(
												S7_W1.can_flg.eq(value(false))
												.or(
													S7_W1.can_flg.eq(value(true))
													.and(S0_T1.can_flg.eq(value(true)))
												)
											)
											.and(S7_W2.ship_adv_prnt_flg.eq(value(true)))
										)
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_dlv_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_tm,
									S0_T7.dlv_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_ship_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.ship_tm,
									S0_T6.ship_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_pd_inst_dlv").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_tm,
									S0_T6.pd_inst_dlv_tm
								).eq(value(false))
							)
						)
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(false),
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.LOC.value()),
									S0_M5.loc_nm,
									S0_M6.bp_nm
								),
								S0_T1.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T1.ship_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_M3.usr_nm.like(bind("act_usr_nm")))
						.cutoff$and(S0_T1.ship_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T1.ship_act_no.like(bind("ship_act_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T3.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T3.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T3.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T3.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T3.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T3.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(
							bind("display_chk_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S16)
									.where(
										S16.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
										.and(S16.dlv_slip_act_no.eq(S0_T1.ship_act_no))
									)
								)
								.or(S9.ship_act_sync_flg.eq(value(true)))
							)
						)
					)
					.groupBy(
						S0_T3.ship_inst_tm,
						S0_T3.ship_schd_tm,
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T1.ac_dt,
						S0_T3.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M7.lg_grp_nm,
						S0_M7.ship_slip_act_flg,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M5.loc_nm,
								S0_M6.bp_nm
							),
							S0_T1.ship_to_id_nm
						),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_act_no,
						S0_T1.ship_inst_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ship_usr_cd,
						S0_M3.usr_nm,
						S0_T1.ship_dpt_cd,
						S0_M4.dpt_nm,
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr
					)
					.orderBy(S0_T1.ship_act_no.asc())
			);
	}
	
	/**
	 * -- MSBEL1450_MST_SHIP_ACT_Query_S02
	 */
	static MCQueryPlan MSBEL1450_MST_SHIP_ACT_S02() {
		MST_SHIP_ACT_R S0_T1 = MST_SHIP_ACT_R.create("T1");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_ACT_D_R S0_T2 = MST_SHIP_ACT_D_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_INST_D_R S0_T4 = MST_SHIP_INST_D_R.create("T4");
		MST_SHIP_INST_R S0_T5 = MST_SHIP_INST_R.create("T5");
		MST_SHIP_SCHD_R S0_T6 = MST_SHIP_SCHD_R.create("T6");
		MST_SHIP_PR_R S0_T7 = MST_SHIP_PR_R.create("T7");
		MST_SLO_D_R S0_T8 = MST_SLO_D_R.create("T8");
		MST_SLO_R S0_T9 = MST_SLO_R.create("T9");
		MSVT_LOT_LIST_R S0_T10 = MSVT_LOT_LIST_R.create("T10");
		MST_SLS_ACT_R S0_T12 = MST_SLS_ACT_R.create("T12");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_SITE_R S0_M14 = MAM_SITE_R.create("M14");
		MAM_WG_R S0_M15 = MAM_WG_R.create("M15");
		MAM_STR_LN_R S0_M16 = MAM_STR_LN_R.create("M16");
		MAM_ALLOC_GRP_R S0_M17 = MAM_ALLOC_GRP_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_ITM_TYP_D_R S0_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_USR_R S0_M20 = MAM_USR_R.create("M20");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_SUNDRY_ITM_R S0_M23 = MAM_SUNDRY_ITM_R.create("M23");
		MAM_LOC_R S0_M24 = MAM_LOC_R.create("M24");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_LOC_R S0_M26 = MAM_LOC_R.create("M26");
		MAM_STR_LN_R S0_M27 = MAM_STR_LN_R.create("M27");
		MAM_LG_GRP_R S0_M28 = MAM_LG_GRP_R.create("M28");
		MAM_EXT_SYS_R S0_M29 = MAM_EXT_SYS_R.create("M29");
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
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S0_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S0_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S0_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S0_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S0_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S0_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S0_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S0_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S0_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S0_MM410 = MAM_ITM_GRP_R.create("MM410");
		MST_DLV_SLIP_R S0_T13 = MST_DLV_SLIP_R.create("T13");
		MST_DLV_SLIP_R S0_T14 = MST_DLV_SLIP_R.create("T14");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1450_MST_SHIP_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_M3.trd_nm,
						trunc(
							S0_T5.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T5.ship_inst_tm.as("ship_inst_hm"),
						trunc(
							S0_T5.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T5.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_T1.ac_dt,
						trunc(
							S0_T5.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T5.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M28.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M24.loc_nm,
								S0_M25.bp_nm
							),
							S0_T1.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T2.dlv_id_typ,
						S0_T2.dlv_id_cd,
						decode(
							S0_T2.dlv_sundry_flg,
							value(false),
							decode(
								S0_T2.dlv_id_typ,
								value(MSC_DLV_ID_TYP.LOC.value()),
								S0_M26.loc_nm,
								S0_M22.bp_nm
							),
							S0_T2.dlv_id_nm
						).as("dlv_id_nm"),
						S0_T2.dlv_str_ln_cd,
						S0_M6.str_ln_nm.as("dlv_str_ln_nm"),
						nvl(
							S0_T7.cst_cd,
							S0_T1.cst_cd
						).as("cst_cd"),
						S0_M18.bp_nm.as("cst_nm"),
						S0_T1.rqst_usr_cd,
						S0_M4.usr_nm.as("rqst_usr_nm"),
						S0_T1.rqst_dpt_cd,
						S0_M5.dpt_nm.as("rqst_dpt_nm"),
						S0_T8.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1.as("d_sub_char1"),
						S0_T2.sub_char2.as("d_sub_char2"),
						S0_T2.sub_char3.as("d_sub_char3"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M23.itm_nm
							),
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.ver_no,
						S0_T2.trd_unit_cd,
						S0_M8.unit_nm.as("trd_unit_nm"),
						S0_M8.dec_place.as("trd_unit_dec_place"),
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_M9.unit_nm.as("base_unit_nm"),
						S0_M9.dec_place.as("base_unit_dec_place"),
						S0_T2.base_unit_qty,
						S0_T6.base_unit_qty.as("schd_qty"),
						S0_T4.base_unit_qty.as("inst_qty"),
						S0_T10.act_cont_fctr,
						S0_M7.std_cont_fctr,
						S0_M7.cont_fctr_unit_cd,
						S0_M10.unit_nm.as("cont_fctr_unit_nm"),
						S0_M7.cont_fctr_flg,
						S0_M7.cont_fctr_rnd_typ,
						S0_M7.cont_fctr_dec_place,
						trunc(
							S0_T7.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T7.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T6.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T6.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T6.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T6.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						nvl(
							S0_T6.dlv_day_week_typ,
							S0_T8.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T6.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.ship_loc_cd,
						S0_M13.loc_nm.as("ship_loc_nm"),
						S0_T2.ship_str_ln_cd,
						S0_M27.str_ln_nm.as("ship_str_ln_nm"),
						nvl(
							S0_T2.lot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("lot_no"),
						nvl(
							S0_T2.sublot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("sublot_no"),
						S0_T2.gd_cd,
						S0_M11.gd_nm,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.stk_bp_cd,
						S0_M12.bp_nm.as("stk_bp_nm"),
						S0_M2.unit_wt.multiply(S0_T2.trd_unit_qty).as("wt"),
						S0_M2.unit_dim.multiply(S0_T2.trd_unit_qty).as("dim"),
						S0_T1.ship_act_no,
						S0_T2.ship_act_d_no,
						S0_T2.disp_seq,
						S0_T1.ship_inst_no,
						S0_T4.ship_inst_d_no,
						S0_T4.disp_seq.as("ship_inst_disp_seq"),
						S0_T6.ship_schd_no,
						S0_T2.dlv_slip_no,
						S0_T13.dlv_slip_rev,
						S0_T2.dlv_slip_d_no,
						S0_T1.ship_usr_cd.as("act_usr_cd"),
						S0_M20.usr_nm.as("act_usr_nm"),
						S0_T1.ship_dpt_cd.as("act_dpt_cd"),
						S0_M21.dpt_nm.as("act_dpt_nm"),
						max(
							S0_T13.slip_prnt_flg
						).as("dlv_prnted_flg"),
						max(
							S0_T13.ship_adv_prnt_flg
						).as("adv_prnted_flg"),
						countDistinct(S0_T2.dlv_slip_no).as("slip_cnt"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr,
						max(S0_T2.wms_flg).as("wms_flg"),
						max(S0_T2.ext_ship_act_no).as("ext_ship_act_no"),
						S0_T2.ext_sys_cd,
						S0_M29.ext_sys_nm
					)
					.from(
						S0_T1
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_act_no.eq(S0_T1.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_alloc_sts_no.eq(S0_T2.ship_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.ship_inst_d_no.eq(S0_T3.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.ship_inst_no.eq(S0_T4.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.ship_schd_no.eq(S0_T3.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T7.ship_pr_no.eq(S0_T6.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.slo_d_no.eq(S0_T7.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T10.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T10.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T10.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T10.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T10.lot_no.eq(S0_T2.lot_no))
								.and(S0_T10.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T12.ship_act_no.eq(S0_T1.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T13.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T13.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T14).on(
							bracket(
								S0_T14.dlv_slip_no.eq(S0_T3.dlv_slip_no)
								.and(S0_T14.dlv_slip_seq.eq(S0_T3.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M2.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.trd_cd.eq(S0_T2.trd_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.rqst_usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.rqst_dpt_cd)
								.and(S0_M5.st_dt.lte(S0_T1.ac_dt))
								.and(S0_M5.end_dt.gte(S0_T1.ac_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.loc_cd.eq(S0_T2.dlv_id_cd)
								.and(S0_M6.str_ln_cd.eq(S0_T2.dlv_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M7.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M7.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M7.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.unit_cd.eq(S0_T2.trd_unit_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.unit_cd.eq(S0_T2.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.unit_cd.eq(S0_M7.cont_fctr_unit_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.gd_cd.eq(S0_T2.gd_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.bp_cd.eq(S0_T2.stk_bp_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.loc_cd.eq(S0_T2.ship_loc_cd)
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_M18.bp_cd.eq(nvl(
										S0_T7.cst_cd,
										S0_T1.cst_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.usr_cd.eq(S0_T1.ship_usr_cd)
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_M21.dpt_cd.eq(S0_T1.ship_dpt_cd)
								.and(S0_M21.st_dt.lte(S0_T1.ac_dt))
								.and(S0_M21.end_dt.gte(S0_T1.ac_dt))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.bp_cd.eq(S0_T2.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M23.sno1))
								.and(S0_T2.sno2.eq(S0_M23.sno2))
								.and(S0_T2.sno3.eq(S0_M23.sno3))
								.and(S0_T2.sno4.eq(S0_M23.sno4))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_M24.loc_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.bp_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_M26.loc_cd.eq(S0_T2.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.loc_cd.eq(S0_T2.ship_loc_cd)
								.and(S0_M27.str_ln_cd.eq(S0_T2.ship_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_M28.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.ext_sys_cd.eq(S0_T2.ext_sys_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M28.lg_grp_nm.like(bind("lg_grp_nm")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(S0_T2.wms_flg.eq(value(true)))
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									S0_T2.wms_flg.eq(value(false))
									.or(S0_T2.wms_flg.isNull())
								)
							)
						)
						.cutoff$and(S0_T2.ext_ship_act_no.like(bind("ext_ship_act_no")))
						.and(
							bracket(
								bind("dlv_not_prnted").eq(value(true))
								.and(bind("dlv_prnted").eq(value(true)))
							)
							.or(
								bind("dlv_not_prnted").eq(value(false))
								.and(
									S0_T13.slip_prnt_flg.eq(value(true))
								)
							)
							.or(
								bind("dlv_prnted").eq(value(false))
								.and(
									S0_T13.slip_prnt_flg.eq(value(false))
								)
							)
						)
						.and(
							bracket(
								bind("adv_not_prnted").eq(value(true))
								.and(bind("adv_prnted").eq(value(true)))
							)
							.or(
								bind("adv_not_prnted").eq(value(false))
								.and(
									S0_T13.ship_adv_prnt_flg.eq(value(true))
								)
							)
							.or(
								bind("adv_prnted").eq(value(false))
								.and(
									S0_T13.ship_adv_prnt_flg.eq(value(false))
								)
							)
						)
						.cutoff$and(
							bind("tmp_dlv_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_tm,
									S0_T7.dlv_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_ship_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.ship_tm,
									S0_T6.ship_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_pd_inst_dlv").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_tm,
									S0_T6.pd_inst_dlv_tm
								).eq(value(false))
							)
						)
						.cutoff$and(S0_M13.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T5.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T5.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T5.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T5.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T5.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T5.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T2.ship_loc_cd.like(bind("ship_loc_cd")))
						.cutoff$and(S0_M13.loc_nm.like(bind("ship_loc_nm")))
						.cutoff$and(S0_T2.ship_str_ln_cd.like(bind("ship_str_ln_cd")))
						.cutoff$and(S0_T7.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(false),
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.LOC.value()),
									S0_M24.loc_nm,
									S0_M25.bp_nm
								),
								S0_T1.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T2.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(S0_T2.dlv_id_cd.like(bind("dlv_id_cd")))
						.cutoff$and(
							decode(
								S0_T2.dlv_sundry_flg,
								value(false),
								decode(
									S0_T2.dlv_id_typ,
									value(MSC_DLV_ID_TYP.LOC.value()),
									S0_M26.loc_nm,
									S0_M22.bp_nm
								),
								S0_T2.dlv_id_nm
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T7.cst_cd,
								S0_T1.cst_cd
							).like(bind("cst_cd"))
						)
						.cutoff$and(S0_M18.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.itm_nm,
									S0_M23.itm_nm
								),
								S0_M7.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T1.ship_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_M20.usr_nm.like(bind("act_usr_nm")))
						.cutoff$and(S0_T1.ship_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M21.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T6.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(S0_T5.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T1.ship_act_no.like(bind("ship_act_no")))
						.cutoff$and(S0_T2.ship_act_d_no.like(bind("ship_act_d_no")))
						.cutoff$and(S0_T2.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("d_sub_char3")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T2.trd_cd,
						S0_M3.trd_nm,
						S0_T5.ship_inst_tm,
						S0_T5.ship_schd_tm,
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T1.ac_dt,
						S0_T5.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M28.lg_grp_nm,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M24.loc_nm,
								S0_M25.bp_nm
							),
							S0_T1.ship_to_id_nm
						),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T2.dlv_id_typ,
						S0_T2.dlv_id_cd,
						decode(
							S0_T2.dlv_sundry_flg,
							value(false),
							decode(
								S0_T2.dlv_id_typ,
								value(MSC_DLV_ID_TYP.LOC.value()),
								S0_M26.loc_nm,
								S0_M22.bp_nm
							),
							S0_T2.dlv_id_nm
						),
						S0_T2.dlv_str_ln_cd,
						S0_M6.str_ln_nm,
						nvl(
							S0_T7.cst_cd,
							S0_T1.cst_cd
						),
						S0_M18.bp_nm,
						S0_T1.rqst_usr_cd,
						S0_M4.usr_nm,
						S0_T1.rqst_dpt_cd,
						S0_M5.dpt_nm,
						S0_T8.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M23.itm_nm
							),
							S0_M7.itm_nm
						),
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.ver_no,
						S0_T2.trd_unit_cd,
						S0_M8.unit_nm,
						S0_M8.dec_place,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_M9.unit_nm,
						S0_M9.dec_place,
						S0_T2.base_unit_qty,
						S0_T6.base_unit_qty,
						S0_T4.base_unit_qty,
						S0_T10.act_cont_fctr,
						S0_M7.std_cont_fctr,
						S0_M7.cont_fctr_unit_cd,
						S0_M10.unit_nm,
						S0_M7.cont_fctr_flg,
						S0_M7.cont_fctr_rnd_typ,
						S0_M7.cont_fctr_dec_place,
						S0_T7.dlv_rqst_tm,
						S0_T6.ship_rqst_tm,
						S0_T6.pd_inst_dlv_tm,
						nvl(
							S0_T6.dlv_day_week_typ,
							S0_T8.dlv_day_week_typ
						),
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T6.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.ship_loc_cd,
						S0_M13.loc_nm,
						S0_T2.ship_str_ln_cd,
						S0_M27.str_ln_nm,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.gd_cd,
						S0_M11.gd_nm,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.stk_bp_cd,
						S0_M12.bp_nm,
						S0_M2.unit_wt,
						S0_M2.unit_dim,
						S0_T1.ship_act_no,
						S0_T2.ship_act_d_no,
						S0_T2.disp_seq,
						S0_T1.ship_inst_no,
						S0_T4.ship_inst_d_no,
						S0_T4.disp_seq,
						S0_T6.ship_schd_no,
						S0_T2.dlv_slip_no,
						S0_T13.dlv_slip_rev,
						S0_T2.dlv_slip_d_no,
						S0_T1.ship_usr_cd,
						S0_M20.usr_nm,
						S0_T1.ship_dpt_cd,
						S0_M21.dpt_nm,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr,
						S0_T2.ext_sys_cd,
						S0_M29.ext_sys_nm
					)
					.orderBy(
						S0_T1.ship_act_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("slo_no"))
					.view(v -> v.leftOuterJoin(S0_T9).on(bracket(S0_T9.slo_no.eq(S0_T8.slo_no))))
					.predicate(p -> p.cutoff$and(S0_T9.slo_no.like(bind("slo_no")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.site_cd.eq(S0_M13.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M15.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_M16.loc_cd.eq(S0_T2.ship_loc_cd).and(S0_M16.str_ln_cd.eq(S0_T2.ship_str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M16.str_ln_nm.like(bind("ship_str_ln_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_M17.alloc_grp_cd.eq(S0_T7.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M19.itm_typ.eq(S0_M7.itm_typ).and(S0_M19.itm_typ_d_cd.eq(S0_M7.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M22.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M22.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M22.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M22.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M22.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M22.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M22.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M22.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M22.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M22.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M18.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M18.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M18.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M18.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M18.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M18.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M18.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M18.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M18.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M18.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM41).on(S0_M7.itm_grp_cd1.eq(S0_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM41.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM42).on(S0_M7.itm_grp_cd2.eq(S0_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM42.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM43).on(S0_M7.itm_grp_cd3.eq(S0_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM43.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM44).on(S0_M7.itm_grp_cd4.eq(S0_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM44.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM45).on(S0_M7.itm_grp_cd5.eq(S0_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM45.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM46).on(S0_M7.itm_grp_cd6.eq(S0_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM46.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM47).on(S0_M7.itm_grp_cd7.eq(S0_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM47.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM48).on(S0_M7.itm_grp_cd8.eq(S0_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM48.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM49).on(S0_M7.itm_grp_cd9.eq(S0_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM49.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM410).on(S0_M7.itm_grp_cd10.eq(S0_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBEL1450_MST_SHIP_ACT_Query_S03
	 */
	static MCQueryPlan MSBEL1450_MST_SHIP_ACT_S03() {
		MST_SHIP_ACT_R S0_T1 = MST_SHIP_ACT_R.create("T1");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_ACT_D_R S0_T2 = MST_SHIP_ACT_D_R.create("T2");
		MST_SHIP_INST_R S0_T3 = MST_SHIP_INST_R.create("T3");
		MST_SLO_R S0_T4 = MST_SLO_R.create("T4");
		MST_SLS_ACT_R S0_T5 = MST_SLS_ACT_R.create("T5");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAM_TRD_R S0_M2 = MAM_TRD_R.create("M2");
		MAM_BP_R S0_M3 = MAM_BP_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_LG_GRP_R S0_M10 = MAM_LG_GRP_R.create("M10");
		
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
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MST_DLV_SLIP_R S1 = MST_DLV_SLIP_R.create();
		MST_DLV_SLIP_R S0_T13 = MST_DLV_SLIP_R.create("T13");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1450_MST_SHIP_ACT_Query_S03")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_M2.trd_nm,
						trunc(
							S0_T3.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T3.ship_inst_tm.as("ship_inst_hm"),
						trunc(
							S0_T3.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T3.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T1.ship_tm.as("ship_hm"),
						trunc(
							S0_T1.dlv_tm,
							MCDateFmt.DD
						).as("dlv_dt"),
						S0_T1.dlv_tm.as("dlv_hm"),
						S0_T1.ac_dt,
						trunc(
							S0_T3.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T3.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M10.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M7.loc_nm,
								S0_M8.bp_nm
							),
							S0_T1.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T2.dlv_id_typ,
						S0_T2.dlv_id_cd,
						decode(
							S0_T2.dlv_sundry_flg,
							value(false),
							decode(
								S0_T2.dlv_id_typ,
								value(MSC_DLV_ID_TYP.LOC.value()),
								S0_M9.loc_nm,
								S0_M6.bp_nm
							),
							S0_T2.dlv_id_nm
						).as("dlv_id_nm"),
						nvl(
							S0_T4.cst_cd,
							S0_T1.cst_cd
						).as("cst_cd"),
						S0_M3.bp_nm.as("cst_nm"),
						S0_T13.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.trd_rmrks,
						S0_T1.ship_act_no,
						S0_T1.ship_inst_no,
						S0_T2.dlv_slip_no,
						S0_T2.dlv_slip_seq,
						S0_T13.dlv_slip_rev,
						S0_T1.ship_usr_cd.as("act_usr_cd"),
						S0_M4.usr_nm.as("act_usr_nm"),
						S0_T1.ship_dpt_cd.as("act_dpt_cd"),
						S0_M5.dpt_nm.as("act_dpt_nm"),
						S0_T13.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_T13.ship_adv_prnt_flg.as("adv_prnted_flg"),
						S0_T1.can_flg,
						S0_T13.ins_usr_id,
						S0_T13.ins_usr_nm,
						S0_T13.ins_func_id,
						S0_T13.ins_ts,
						S0_T13.upd_usr_id,
						S0_T13.upd_usr_nm,
						S0_T13.upd_func_id,
						S0_T13.upd_ts,
						S0_T13.upd_srv_req_no,
						S0_T1.upd_cntr,
						max(S0_T2.wms_flg).as("wms_flg"),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_act_no.eq(S0_T1.ship_act_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T5.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						)
						.leftOuterJoin(S0_T13).on(
							bracket(
								S0_T13.dlv_slip_no.eq(S0_T2.dlv_slip_no)
								.and(S0_T13.dlv_slip_seq.eq(S0_T2.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.slo_no.eq(S0_T13.slo_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.trd_cd.eq(S0_T2.trd_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.bp_cd.eq(nvl(
										S0_T4.cst_cd,
										S0_T1.cst_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.ship_usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.ship_dpt_cd)
								.and(S0_M5.st_dt.lte(S0_T1.ac_dt))
								.and(S0_M5.end_dt.gte(S0_T1.ac_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bp_cd.eq(S0_T2.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.loc_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.bp_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.loc_cd.eq(S0_T2.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M10.lg_grp_nm.like(bind("lg_grp_nm")))
						.cutoff$and(
								S0_T1.can_flg.eq(value(false))
								.and(bind("not_prnt_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								S0_T2.can_flg.eq(value(false))
								.and(bind("not_prnt_mode_flg").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									bind("prnt_mode_flg").eq(value(true))
									.and(
										S0_T1.can_flg.eq(value(false))
										.and(S0_T2.can_flg.eq(value(false)))
									)
									.or(
										S0_T1.can_flg.eq(value(true))
										.and(bind("can_disp_flg").eq(value(true)))
										.and(S0_T2.upd_srv_req_no.eq(S0_T1.upd_srv_req_no))
									)
								)
							)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(S0_T2.wms_flg.eq(value(true)))
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									S0_T2.wms_flg.eq(value(false))
									.or(S0_T2.wms_flg.isNull())
								)
							)
						)
						.and(
							bracket(
								bind("dlv_not_prnted").eq(value(true))
								.and(bind("dlv_prnted").eq(value(true)))
							)
							.or(
								bind("dlv_not_prnted").eq(value(false))
								.and(S0_T13.slip_prnt_flg.eq(value(true))
								)
							)
							.or(
								bind("dlv_prnted").eq(value(false))
								.and(S0_T13.slip_prnt_flg.eq(value(false))
								)
							)
						)
						.and(
							bracket(
								bind("adv_not_prnted").eq(value(true))
								.and(bind("adv_prnted").eq(value(true)))
							)
							.or(
								bind("adv_not_prnted").eq(value(false))
								.and(S0_T13.ship_adv_prnt_flg.eq(value(true))
								)
							)
							.or(
								bind("adv_prnted").eq(value(false))
								.and(S0_T13.ship_adv_prnt_flg.eq(value(false))
								)
							)
						)
						.addDynamicPredicate()
						.cutoff$and(S0_T3.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T3.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T3.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T3.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T3.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T3.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T1.ship_tm.gte(bind("ship_hm_fr")))
						.cutoff$and(S0_T1.ship_tm.lte(bind("ship_hm_to")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(false),
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.LOC.value()),
									S0_M7.loc_nm,
									S0_M8.bp_nm
								),
								S0_T1.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T2.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(S0_T2.dlv_id_cd.like(bind("dlv_id_cd")))
						.cutoff$and(
							decode(
								S0_T2.dlv_sundry_flg,
								value(false),
								decode(
									S0_T2.dlv_id_typ,
									value(MSC_DLV_ID_TYP.LOC.value()),
									S0_M9.loc_nm,
									S0_M6.bp_nm
								),
								S0_T2.dlv_id_nm
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(
							nvl(
								S0_T4.cst_cd,
								S0_T1.cst_cd
							).like(bind("cst_cd"))
						)
						.cutoff$and(S0_M3.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M2.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_T1.ship_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_M4.usr_nm.like(bind("act_usr_nm")))
						.cutoff$and(S0_T1.ship_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T3.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T1.ship_act_no.like(bind("ship_act_no")))
						.cutoff$and(S0_T2.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T13.slo_no.like(bind("slo_no")))
						.cutoff$and(
							bind("display_chk_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1)
									.where(
										S1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
										.and(S1.dlv_slip_act_no.eq(S0_T1.ship_act_no))
									)
								)
								.or(S0_T5.ship_act_sync_flg.eq(value(true)))
							)
						)
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T2.trd_cd,
						S0_M2.trd_nm,
						S0_T3.ship_inst_tm,
						S0_T3.ship_schd_tm,
						S0_T1.ship_tm,
						S0_T1.dlv_tm,
						S0_T1.ac_dt,
						S0_T3.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M10.lg_grp_nm,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M7.loc_nm,
								S0_M8.bp_nm
							),
							S0_T1.ship_to_id_nm
						),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T2.dlv_id_typ,
						S0_T2.dlv_id_cd,
						decode(
							S0_T2.dlv_sundry_flg,
							value(false),
							decode(
								S0_T2.dlv_id_typ,
								value(MSC_DLV_ID_TYP.LOC.value()),
								S0_M9.loc_nm,
								S0_M6.bp_nm
							),
							S0_T2.dlv_id_nm
						),
						nvl(
							S0_T4.cst_cd,
							S0_T1.cst_cd
						),
						S0_M3.bp_nm,
						S0_T13.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.trd_rmrks,
						S0_T1.ship_act_no,
						S0_T1.ship_inst_no,
						S0_T2.dlv_slip_no,
						S0_T2.dlv_slip_seq,
						S0_T13.dlv_slip_rev,
						S0_T1.ship_usr_cd,
						S0_M4.usr_nm,
						S0_T1.ship_dpt_cd,
						S0_M5.dpt_nm,
						S0_T13.slip_prnt_flg,
						S0_T13.ship_adv_prnt_flg,
						S0_T1.can_flg,
						S0_T13.ins_usr_id,
						S0_T13.ins_usr_nm,
						S0_T13.ins_func_id,
						S0_T13.ins_ts,
						S0_T13.upd_usr_id,
						S0_T13.upd_usr_nm,
						S0_T13.upd_func_id,
						S0_T13.upd_ts,
						S0_T13.upd_srv_req_no,
						S0_T1.upd_cntr,
						addDynamicGroupBy(DS0C_DLV_GRP),
						addDynamicGroupBy(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T2.dlv_slip_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M6.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd1, S0_MM21.bp_grp_nm),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M6.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd2, S0_MM22.bp_grp_nm),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M6.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd3, S0_MM23.bp_grp_nm),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M6.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd4, S0_MM24.bp_grp_nm),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M6.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd5, S0_MM25.bp_grp_nm),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M6.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd6, S0_MM26.bp_grp_nm),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M6.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd7, S0_MM27.bp_grp_nm),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M6.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd8, S0_MM28.bp_grp_nm),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M6.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd9, S0_MM29.bp_grp_nm),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M6.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M6.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M6.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10"))))
					.groupBy(DS0C_DLV_GRP, S0_M6.bp_grp_cd10, S0_MM210.bp_grp_nm),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd1.as("cst_grp_cd1"), S0_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M3.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd1, S0_MM31.bp_grp_nm),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd2.as("cst_grp_cd2"), S0_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M3.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd2, S0_MM32.bp_grp_nm),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd3.as("cst_grp_cd3"), S0_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M3.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd3, S0_MM33.bp_grp_nm),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd4.as("cst_grp_cd4"), S0_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M3.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd4, S0_MM34.bp_grp_nm),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd5.as("cst_grp_cd5"), S0_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M3.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd5, S0_MM35.bp_grp_nm),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd6.as("cst_grp_cd6"), S0_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M3.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd6, S0_MM36.bp_grp_nm),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd7.as("cst_grp_cd7"), S0_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M3.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd7, S0_MM37.bp_grp_nm),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd8.as("cst_grp_cd8"), S0_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M3.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd8, S0_MM38.bp_grp_nm),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd9.as("cst_grp_cd9"), S0_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M3.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd9, S0_MM39.bp_grp_nm),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M3.bp_grp_cd10.as("cst_grp_cd10"), S0_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M3.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M3.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10"))))
					.groupBy(DS0C_CST_GRP, S0_M3.bp_grp_cd10, S0_MM310.bp_grp_nm)
			);
	}
	
	/**
	 * -- MSBEL1450_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1450_MST_SHIP_INST_S01() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_INST_D_R S0_T2 = MST_SHIP_INST_D_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_LG_GRP_R S0_M3 = MAM_LG_GRP_R.create("M3");
		MSVM_SHIP_TO_ID_R S0_M4 = MSVM_SHIP_TO_ID_R.create("M4");
		MAM_SCM_IF_CTL_R S1_CTL1 = MAM_SCM_IF_CTL_R.create("CTL1");
		MST_SHIP_SCHD_R S3_W1 = MST_SHIP_SCHD_R.create("W1");
		MST_SHIP_SCHD_R S4_W1 = MST_SHIP_SCHD_R.create("W1");
		MST_SHIP_PR_R S4_W2 = MST_SHIP_PR_R.create("W2");
		MAM_SCM_IF_CTL_R S5 = MAM_SCM_IF_CTL_R.create();
		MAM_SCM_IF_CTL_R S6 = MAM_SCM_IF_CTL_R.create();
		
		MCSubQuery S0_M2_unit_wt = subQuery().select(S0_M2.unit_wt).from(S0_M2).where(
				bracket(
						S0_M2.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M2.unit_cd.eq(S0_T3.ent_unit_cd))
					));
		
		MCSubQuery S0_M2_unit_dim = subQuery().select(S0_M2.unit_dim).from(S0_M2).where(
				bracket(
						S0_M2.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M2.unit_cd.eq(S0_T3.ent_unit_cd))
					));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1450_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						trunc(
							S0_T1.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.ship_inst_tm.as("ship_inst_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M3.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_M3.ship_slip_act_flg.as("dlv_prnt_flg"),
						S0_M3.ship_slip_act_flg.as("adv_prnt_flg"),
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M4.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						countAll().as("d_cnt"),
						sum(S0_M2_unit_wt.multiply(S0_T3.ent_unit_qty)).as("wt"),
						sum(S0_M2_unit_dim.multiply(S0_T3.ent_unit_qty)).as("dim"),
						S0_T1.ship_inst_no,
						max(S0_T3.dlv_slip_no).as("dlv_slip_no"),
						S0_T1.dlv_prnt_flg.as("dlv_prnted_flg"),
						S0_T1.ship_adv_prnt_flg.as("adv_prnted_flg"),
						countDistinct(S0_T3.dlv_slip_no).as("slip_cnt"),
						S0_T1.iv_no,
						cases()
							.when(bind("ope").eq(value("3")))
								.then(S0_T1.intr_rmrks)
							.otherwise(nullValue()).as("intr_rmrks"),
						cases()
							.when(bind("ope").eq(value("3")))
								.then(S0_T1.sub_char1)
							.otherwise(nullValue()).as("sub_char1"),
						cases()
							.when(bind("ope").eq(value("3")))
								.then(S0_T1.sub_char2)
							.otherwise(nullValue()).as("sub_char2"),
						cases()
							.when(bind("ope").eq(value("3")))
								.then(S0_T1.sub_char3)
							.otherwise(nullValue()).as("sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr,
						max(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(value(1)))
										.from(S1_CTL1)
										.where(
											S1_CTL1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S1_CTL1.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S1_CTL1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S1_CTL1.st_dt, S1_CTL1.end_dt))
											.and(S1_CTL1.del_flg.eq(value(false)))
										)
									).gt(value(0))
								)
									.then(value(1))
								.otherwise(value(0))
						).as("wms_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M4.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M3.lg_grp_nm.like(bind("lg_grp_nm")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_act_qty).gt(value(0)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S3_W1)
								.where(
									S3_W1.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
									.and(S3_W1.cmpl_flg.eq(value(false)))
								)
							)
							.or(S0_T1.iv_no.isNull())
						)
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S4_W1
									.innerJoin(S4_W2).on(
										bracket(
											S4_W2.ship_pr_no.eq(S4_W1.ship_pr_no)
										)
									)
								)
								.where(
									S4_W1.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
									.and(S4_W2.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.PICK.value())))
									.cutoff$and(
										bind("tmp_dlv_rqst").eq(value(0))
										.and(
											MAPA_DT$F_IS_BEFORE_AFTER(
												S0_T1.dlv_schd_tm,
												S4_W2.dlv_rqst_tm
											).eq(value(false))
										)
									)
									.cutoff$and(
										bind("tmp_ship_rqst").eq(value(0))
										.and(
											MAPA_DT$F_IS_BEFORE_AFTER(
												S0_T1.ship_schd_tm,
												S4_W1.ship_rqst_tm
											).eq(value(false))
										)
									)
									.cutoff$and(
										bind("tmp_pd_inst_dlv").eq(value(0))
										.and(
											MAPA_DT$F_IS_BEFORE_AFTER(
												S0_T1.dlv_schd_tm,
												S4_W1.pd_inst_dlv_tm
											).eq(value(false))
										)
									)
								)
							)
						)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S5)
										.where(
											S5.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S5.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S5.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S5.st_dt, S5.end_dt))
											.and(S5.del_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S6)
										.where(
											S6.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S6.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S6.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S6.st_dt, S6.end_dt))
											.and(S6.del_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.and(bind("ext_ship_act_no").isNull())
						.and(
							bracket(
								bind("dlv_not_prnted").eq(value(true))
								.and(bind("dlv_prnted").eq(value(true)))
							)
							.or(
								bind("dlv_not_prnted").eq(value(false))
								.and(S0_T1.dlv_prnt_flg.eq(value(true)))
							)
							.or(
								bind("dlv_prnted").eq(value(false))
								.and(S0_T1.dlv_prnt_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("adv_not_prnted").eq(value(true))
								.and(bind("adv_prnted").eq(value(true)))
							)
							.or(
								bind("adv_not_prnted").eq(value(false))
								.and(S0_T1.ship_adv_prnt_flg.eq(value(true)))
							)
							.or(
								bind("adv_prnted").eq(value(false))
								.and(S0_T1.ship_adv_prnt_flg.eq(value(false)))
							)
						)
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T1.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(true),
								S0_T1.ship_to_id_nm,
								S0_M4.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T3.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.and(bind("act_usr_cd").isNull())
						.and(bind("act_usr_nm").isNull())
						.and(bind("act_dpt_cd").isNull())
						.and(bind("act_dpt_nm").isNull())
						.and(bind("ship_act_no").isNull())
						.and(bind("dlv_ship_no").isNull())
					)
					.groupBy(
						S0_T1.ship_inst_tm,
						S0_T1.ship_schd_tm,
						S0_T1.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M3.lg_grp_nm,
						S0_M3.ship_slip_act_flg,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M4.ship_to_id_nm
						),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T1.ship_inst_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.dlv_prnt_flg,
						S0_T1.ship_adv_prnt_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr
					)
					.orderBy(
						S0_T1.ship_schd_tm.asc(),
						S0_T1.ship_inst_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBEL1450_MST_SHIP_INST_Query_S02
	 */
	static MCQueryPlan MSBEL1450_MST_SHIP_INST_S02() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MAVM_RD_LG_GRP_R S0_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_INST_D_R S0_T2 = MST_SHIP_INST_D_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_SCHD_R S0_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_PR_R S0_T5 = MST_SHIP_PR_R.create("T5");
		MST_SLO_D_R S0_T6 = MST_SLO_D_R.create("T6");
		MST_SLO_R S0_T7 = MST_SLO_R.create("T7");
		MSVT_LOT_LIST_R S0_T8 = MSVT_LOT_LIST_R.create("T8");
		MST_DLV_SLIP_R S0_T9 = MST_DLV_SLIP_R.create("T9");
		MAM_SHIP_TERM_R S0_M1 = MAM_SHIP_TERM_R.create("M1");
		MAVM_ITM_UNIT_R S0_M2 = MAVM_ITM_UNIT_R.create("M2");
		MAM_TRD_R S0_M3 = MAM_TRD_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_LOC_R S0_M13 = MAM_LOC_R.create("M13");
		MAM_SITE_R S0_M14 = MAM_SITE_R.create("M14");
		MAM_WG_R S0_M15 = MAM_WG_R.create("M15");
		MAM_STR_LN_R S0_M16 = MAM_STR_LN_R.create("M16");
		MAM_ALLOC_GRP_R S0_M17 = MAM_ALLOC_GRP_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_ITM_TYP_D_R S0_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAM_SUNDRY_ITM_R S0_M23 = MAM_SUNDRY_ITM_R.create("M23");
		MAM_LOC_R S0_M24 = MAM_LOC_R.create("M24");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_LOC_R S0_M26 = MAM_LOC_R.create("M26");
		MAM_STR_LN_R S0_M27 = MAM_STR_LN_R.create("M27");
		MAM_LG_GRP_R S0_M28 = MAM_LG_GRP_R.create("M28");
		MAVM_ITM_UNIT_R S0_M29 = MAVM_ITM_UNIT_R.create("M29");
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
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S0_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S0_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S0_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S0_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S0_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S0_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S0_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S0_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S0_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S0_MM410 = MAM_ITM_GRP_R.create("MM410");
		MAM_SCM_IF_CTL_R S1_CTL1 = MAM_SCM_IF_CTL_R.create("CTL1");
		MAM_SCM_IF_CTL_R S3 = MAM_SCM_IF_CTL_R.create();
		MAM_SCM_IF_CTL_R S4 = MAM_SCM_IF_CTL_R.create();
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1450_MST_SHIP_INST_Query_S02")
					.mainQuery()
					.select(
						S0_T2.trd_cd,
						S0_M3.trd_nm,
						trunc(
							S0_T1.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.ship_inst_tm.as("ship_inst_hm"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M28.lg_grp_nm.as("ship_fr_lg_grp_nm"),
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M24.loc_nm,
								S0_M25.bp_nm
							),
							S0_T1.ship_to_id_nm
						).as("ship_to_id_nm"),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T5.dlv_id_typ,
						nvl(
							S0_T4.dlv_cd,
							S0_T5.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T4.dlv_cd,
							nvl(
								S0_T4.dlv_nm,
								S0_M22.bp_nm
							),
							decode(
								S0_T5.dlv_sundry_flg,
								value(false),
								decode(
									S0_T5.dlv_id_typ,
									value(MSC_DLV_ID_TYP.LOC.value()),
									S0_M26.loc_nm,
									S0_M22.bp_nm
								),
								S0_T5.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T2.dlv_str_ln_cd,
						S0_M6.str_ln_nm.as("dlv_str_ln_nm"),
						S0_T5.cst_cd,
						S0_M18.bp_nm.as("cst_nm"),
						S0_T1.inst_usr_cd.as("rqst_usr_cd"),
						S0_M4.usr_nm.as("rqst_usr_nm"),
						S0_T1.inst_dpt_cd.as("rqst_dpt_cd"),
						S0_M5.dpt_nm.as("rqst_dpt_nm"),
						S0_T6.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1.as("d_sub_char1"),
						S0_T2.sub_char2.as("d_sub_char2"),
						S0_T2.sub_char3.as("d_sub_char3"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M23.itm_nm
							),
							S0_M7.itm_nm
						).as("itm_nm"),
						S0_T6.cst_itm_cd,
						S0_T6.cst_itm_nm,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.ver_no,
						S0_T3.ent_unit_cd.as("trd_unit_cd"),
						S0_M8.unit_nm.as("trd_unit_nm"),
						S0_M29.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M29.conv_qty.as("trd_unit_conv_qty"),
						S0_M29.dec_place.as("trd_unit_dec_place"),
						S0_M29.rnd_typ.as("trd_unit_rnd_typ"),
						S0_T3.ent_unit_qty.as("trd_unit_qty"),
						S0_T3.base_unit_cd,
						S0_M9.unit_nm.as("base_unit_nm"),
						S0_M9.dec_place.as("base_unit_dec_place"),
						S0_M9.rnd_typ.as("base_unit_rnd_typ"),
						S0_T3.base_unit_qty,
						S0_T4.base_unit_qty.as("schd_qty"),
						S0_T2.base_unit_qty.as("inst_qty"),
						S0_T3.ship_act_qty.as("act_qty"),
						S0_T8.act_cont_fctr,
						S0_M7.std_cont_fctr,
						S0_M7.cont_fctr_unit_cd,
						S0_M10.unit_nm.as("cont_fctr_unit_nm"),
						S0_M7.cont_fctr_flg,
						S0_M7.cont_fctr_rnd_typ,
						S0_M7.cont_fctr_dec_place,
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T5.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T4.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T4.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T4.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T4.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						nvl(
							S0_T4.dlv_day_week_typ,
							S0_T6.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T2.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T3.ship_loc_cd,
						S0_M13.loc_nm.as("ship_loc_nm"),
						S0_T3.ship_str_ln_cd,
						S0_M27.str_ln_nm.as("ship_str_ln_nm"),
						nvl(
							S0_T3.lot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("lot_no"),
						nvl(
							S0_T3.sublot_no,
							value(MAC_STR.NULL_VAL.value())
						).as("sublot_no"),
						S0_T3.gd_cd,
						S0_M11.gd_nm,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_M12.bp_nm.as("stk_bp_nm"),
						S0_M2.unit_wt.multiply(S0_T3.ent_unit_qty).as("wt"),
						S0_M2.unit_dim.multiply(S0_T3.ent_unit_qty).as("dim"),
						S0_T1.ship_inst_no,
						S0_T2.ship_inst_d_no,
						S0_T3.disp_seq.as("ship_inst_disp_seq"),
						S0_T4.ship_schd_no,
						S0_T3.dlv_slip_no,
						S0_T9.dlv_slip_rev,
						S0_T9.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_T9.ship_adv_prnt_flg.as("adv_prnted_flg"),
						max(S0_T3.dlv_slip_d_no).as("dlv_slip_d_no"),
						countDistinct(S0_T3.dlv_slip_no).as("slip_cnt"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr,
						max(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(value(1)))
										.from(S1_CTL1)
										.where(
											S1_CTL1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S1_CTL1.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S1_CTL1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S1_CTL1.st_dt, S1_CTL1.end_dt))
											.and(S1_CTL1.del_flg.eq(value(false)))
										)
									).gt(value(0))
								)
									.then(value(1))
								.otherwise(value(0))
						).as("wms_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_RD1).on(
							bracket(
								S0_RD1.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T6.slo_d_no.eq(S0_T5.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T8.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T8.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T8.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T8.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T8.lot_no.eq(S0_T2.lot_no))
								.and(S0_T8.sublot_no.eq(S0_T2.sublot_no))
							)
						)
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T9.dlv_slip_no.eq(S0_T3.dlv_slip_no)
								.and(S0_T9.dlv_slip_seq.eq(S0_T3.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.ship_term_cd.eq(S0_T1.ship_term_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M2.unit_cd.eq(S0_T3.ent_unit_cd))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.trd_cd.eq(S0_T2.trd_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.usr_cd.eq(S0_T1.inst_usr_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.inst_dpt_cd)
								.and(S0_M5.st_dt.lte(S0_T1.ship_inst_tm))
								.and(S0_M5.end_dt.gte(S0_T1.ship_inst_tm))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.loc_cd.eq(S0_T5.dlv_id_cd)
								.and(S0_M6.str_ln_cd.eq(S0_T2.dlv_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M7.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M7.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M7.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.unit_cd.eq(S0_T3.ent_unit_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.unit_cd.eq(S0_T3.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.unit_cd.eq(S0_M7.cont_fctr_unit_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.gd_cd.eq(S0_T3.gd_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.bp_cd.eq(S0_T3.stk_bp_cd)
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.loc_cd.eq(S0_T3.ship_loc_cd)
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_M18.bp_cd.eq(S0_T5.cst_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.bp_cd.eq(nvl(
										S0_T4.dlv_cd,
										S0_T5.dlv_id_cd
									)
								)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M23.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M23.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M23.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M23.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M23.sno1))
								.and(S0_T2.sno2.eq(S0_M23.sno2))
								.and(S0_T2.sno3.eq(S0_M23.sno3))
								.and(S0_T2.sno4.eq(S0_M23.sno4))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_M24.loc_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								S0_M25.bp_cd.eq(S0_T1.ship_to_id_cd)
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_M26.loc_cd.eq(S0_T5.dlv_id_cd)
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_M27.loc_cd.eq(S0_T3.ship_loc_cd)
								.and(S0_M27.str_ln_cd.eq(S0_T3.ship_str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_M28.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M29).on(
							bracket(
								S0_M29.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M29.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M29.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M29.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M29.unit_cd.eq(S0_T3.ent_unit_cd))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M28.lg_grp_nm.like(bind("lg_grp_nm")))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T3.base_unit_qty.subtract(S0_T3.ship_act_qty).gt(value(0)))
						.and(
							S0_T4.cmpl_flg.eq(value(false))
							.or(S0_T1.iv_no.isNull())
						)
						.and(
							bracket(
								bind("wms_flg").eq(value(true))
								.and(bind("not_wms_flg").eq(value(true)))
							)
							.or(
								bind("not_wms_flg").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3)
										.where(
											S3.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S3.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S3.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S3.st_dt, S3.end_dt))
											.and(S3.del_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bind("wms_flg").eq(value(false))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S4)
										.where(
											S4.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
											.and(
												S4.loc_cd.eq(S0_T3.ship_loc_cd)
												.or(S4.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd))
											)
											.and(bind("today").between(S4.st_dt, S4.end_dt))
											.and(S4.del_flg.eq(value(false)))
										)
									)
								)
							)
						)
						.and(
							bracket(
								bind("dlv_not_prnted").eq(value(true))
								.and(bind("dlv_prnted").eq(value(true)))
							)
							.or(
								bind("dlv_not_prnted").eq(value(false))
								.and(S0_T9.slip_prnt_flg.eq(value(true)))
							)
							.or(
								bind("dlv_prnted").eq(value(false))
								.and(S0_T9.slip_prnt_flg.eq(value(false)))
							)
						)
						.and(
							bracket(
								bind("adv_not_prnted").eq(value(true))
								.and(bind("adv_prnted").eq(value(true)))
							)
							.or(
								bind("adv_not_prnted").eq(value(false))
								.and(S0_T9.ship_adv_prnt_flg.eq(value(true)))
							)
							.or(
								bind("adv_prnted").eq(value(false))
								.and(S0_T9.ship_adv_prnt_flg.eq(value(false)))
							)
						)
						.cutoff$and(
							bind("tmp_dlv_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T5.dlv_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_ship_rqst").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.ship_schd_tm,
									S0_T4.ship_rqst_tm
								).eq(value(false))
							)
						)
						.cutoff$and(
							bind("tmp_pd_inst_dlv").eq(value(0))
							.and(
								MAPA_DT$F_IS_BEFORE_AFTER(
									S0_T1.dlv_schd_tm,
									S0_T4.pd_inst_dlv_tm
								).eq(value(false))
							)
						)
						.cutoff$and(S0_M13.site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T1.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T3.ship_loc_cd.like(bind("ship_loc_cd")))
						.cutoff$and(S0_M13.loc_nm.like(bind("ship_loc_nm")))
						.cutoff$and(S0_T3.ship_str_ln_cd.like(bind("ship_str_ln_cd")))
						.cutoff$and(S0_T5.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(false),
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.LOC.value()),
									S0_M24.loc_nm,
									S0_M25.bp_nm
								),
								S0_T1.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T5.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(
							nvl(
								S0_T4.dlv_cd,
								S0_T5.dlv_id_cd
							).like(bind("dlv_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T4.dlv_cd,
								nvl(
									S0_T4.dlv_nm,
									S0_M22.bp_nm
								),
								decode(
									S0_T5.dlv_sundry_flg,
									value(false),
									decode(
										S0_T5.dlv_id_typ,
										value(MSC_DLV_ID_TYP.LOC.value()),
										S0_M26.loc_nm,
										S0_M22.bp_nm
									),
									S0_T5.dlv_id_nm
								)
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(S0_T5.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_M1.ship_term_nm.like(bind("ship_term_nm")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M3.trd_nm.like(bind("trd_nm")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.itm_nm,
									S0_M23.itm_nm
								),
								S0_M7.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T6.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T6.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T4.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T3.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("d_sub_char3")))
						.and(bind("act_usr_cd").isNull())
						.and(bind("act_usr_nm").isNull())
						.and(bind("act_dpt_cd").isNull())
						.and(bind("act_dpt_nm").isNull())
						.and(bind("ship_act_no").isNull())
						.and(bind("ext_ship_act_no").isNull())
						.and(bind("ship_act_d_no").isNull())
						.and(bind("dlv_ship_no").isNull())
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T2.trd_cd,
						S0_M3.trd_nm,
						S0_T1.ship_inst_tm,
						S0_T1.ship_schd_tm,
						S0_T1.dlv_schd_tm,
						S0_T1.ship_term_cd,
						S0_M1.ship_term_nm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_M28.lg_grp_nm,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(false),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M24.loc_nm,
								S0_M25.bp_nm
							),
							S0_T1.ship_to_id_nm
						),
						S0_T1.ship_to_zip_cd,
						S0_T1.ship_to_addr1,
						S0_T1.ship_to_addr2,
						S0_T1.ship_to_addr3,
						S0_T1.ship_to_addr4,
						S0_T1.ship_to_cntct_dpt,
						S0_T1.ship_to_cntct_psn,
						S0_T1.ship_to_tel,
						S0_T1.ship_to_fax,
						S0_T5.dlv_id_typ,
						nvl(
							S0_T4.dlv_cd,
							S0_T5.dlv_id_cd
						),
						nvl2(
							S0_T4.dlv_cd,
							nvl(
								S0_T4.dlv_nm,
								S0_M22.bp_nm
							),
							decode(
								S0_T5.dlv_sundry_flg,
								value(false),
								decode(
									S0_T5.dlv_id_typ,
									value(MSC_DLV_ID_TYP.LOC.value()),
									S0_M26.loc_nm,
									S0_M22.bp_nm
								),
								S0_T5.dlv_id_nm
							)
						),
						S0_T2.dlv_str_ln_cd,
						S0_M6.str_ln_nm,
						S0_T5.cst_cd,
						S0_M18.bp_nm,
						S0_T1.inst_usr_cd,
						S0_M4.usr_nm,
						S0_T1.inst_dpt_cd,
						S0_M5.dpt_nm,
						S0_T6.slo_no,
						S0_T1.iv_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M23.itm_nm
							),
							S0_M7.itm_nm
						),
						S0_T6.cst_itm_cd,
						S0_T6.cst_itm_nm,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.ver_no,
						S0_T3.ent_unit_cd,
						S0_M8.unit_nm,
						S0_M29.conv_base_qty,
						S0_M29.conv_qty,
						S0_M29.dec_place,
						S0_M29.rnd_typ,
						S0_T3.ent_unit_qty,
						S0_T3.base_unit_cd,
						S0_M9.unit_nm,
						S0_M9.dec_place,
						S0_M9.rnd_typ,
						S0_T3.base_unit_qty,
						S0_T4.base_unit_qty,
						S0_T2.base_unit_qty,
						S0_T3.ship_act_qty,
						S0_T8.act_cont_fctr,
						S0_M7.std_cont_fctr,
						S0_M7.cont_fctr_unit_cd,
						S0_M10.unit_nm,
						S0_M7.cont_fctr_flg,
						S0_M7.cont_fctr_rnd_typ,
						S0_M7.cont_fctr_dec_place,
						S0_T5.dlv_rqst_tm,
						S0_T4.ship_rqst_tm,
						S0_T4.pd_inst_dlv_tm,
						nvl(
							S0_T4.dlv_day_week_typ,
							S0_T6.dlv_day_week_typ
						),
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T2.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T3.ship_loc_cd,
						S0_M13.loc_nm,
						S0_T3.ship_str_ln_cd,
						S0_M27.str_ln_nm,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.gd_cd,
						S0_M11.gd_nm,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_M12.bp_nm,
						S0_M2.unit_wt,
						S0_M2.unit_dim,
						S0_T1.ship_inst_no,
						S0_T2.ship_inst_d_no,
						S0_T3.disp_seq,
						S0_T4.ship_schd_no,
						S0_T3.dlv_slip_no,
						S0_T9.dlv_slip_rev,
						S0_T9.slip_prnt_flg,
						S0_T9.ship_adv_prnt_flg,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr
					)
					.orderBy(
						S0_T1.ship_schd_tm.asc(),
						S0_T1.ship_inst_no.asc(),
						S0_T3.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("slo_no"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T7.slo_no.eq(S0_T6.slo_no))))
					.predicate(p -> p.cutoff$and(S0_T7.slo_no.like(bind("slo_no")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.site_cd.eq(S0_M13.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M15.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ship_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_M16.loc_cd.eq(S0_T3.ship_loc_cd).and(S0_M16.str_ln_cd.eq(S0_T3.ship_str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M16.str_ln_nm.like(bind("ship_str_ln_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_M17.alloc_grp_cd.eq(S0_T5.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M19.itm_typ.eq(S0_M7.itm_typ).and(S0_M19.itm_typ_d_cd.eq(S0_M7.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M22.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M22.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M22.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M22.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M22.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M22.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M22.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M22.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M22.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M22.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M22.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M18.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M18.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M18.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M18.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M18.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M18.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M18.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M18.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M18.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M18.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM41).on(S0_M7.itm_grp_cd1.eq(S0_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM41.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM42).on(S0_M7.itm_grp_cd2.eq(S0_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM42.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM43).on(S0_M7.itm_grp_cd3.eq(S0_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM43.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM44).on(S0_M7.itm_grp_cd4.eq(S0_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM44.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM45).on(S0_M7.itm_grp_cd5.eq(S0_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM45.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM46).on(S0_M7.itm_grp_cd6.eq(S0_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM46.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM47).on(S0_M7.itm_grp_cd7.eq(S0_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM47.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM48).on(S0_M7.itm_grp_cd8.eq(S0_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM48.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM49).on(S0_M7.itm_grp_cd9.eq(S0_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM49.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM410).on(S0_M7.itm_grp_cd10.eq(S0_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
}