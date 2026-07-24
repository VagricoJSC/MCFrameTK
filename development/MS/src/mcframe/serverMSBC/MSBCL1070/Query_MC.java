package mcframe.serverMSBC.MSBCL1070;

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
	 * -- MSBCL1070_MST_MFG_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_MFG_ACT_S01() {
		MST_MFG_ACT_R S0_T41 = MST_MFG_ACT_R.create("T41");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MCTempView S0_T16 = createTempView("T16");
		MCTempView S0_T19 = createTempView("T19");
		MST_MFG_ACT_REM_R S0_T20 = MST_MFG_ACT_REM_R.create("T20");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_YIELD_ACT_R S1 = MST_YIELD_ACT_R.create();
		MST_YIELD_SCHD_R S2 = MST_YIELD_SCHD_R.create();
		MST_YIELD_ACT_R S3_X = MST_YIELD_ACT_R.create("X");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_MFG_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T20.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T12.strg_loc_cd,
						S0_T41.base_unit_yield_qty,
						S0_T41.base_unit_dfct_qty,
						S0_T41.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T11.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T11.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T11.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T11.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T41.div_seq,
						S0_T41.mfg_act_no,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T41.mfg_aprv_sts_typ,
						S0_T41.aprv_dt,
						S0_T41.aprv_tm,
						S0_T41.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T41.aprv_usr_cd,
						S0_T41.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T1.mfg_st_schd_dt.as("ord_st_schd_dt"),
						S0_T1.mfg_end_schd_dt.as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T16.pr("max_yield_act_tm"),
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T16.pr("max_yield_act_tm").as("yield_act_hm"),
						S0_T16.pr("max_yield_ac_dt").as("yield_ac_dt"),
						trunc(
							S0_T19.pr("max_yield_schd_tm"),
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T19.pr("max_yield_schd_tm").as("yield_schd_hm"),
						trunc(
							S0_T41.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T41.st_act_tm.as("st_act_hm"),
						S0_T41.st_ac_dt.as("st_ac_dt"),
						trunc(
							S0_T41.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T41.end_act_tm.as("end_act_hm"),
						S0_T41.end_ac_dt.as("end_ac_dt"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T41.ins_usr_id.as("ins_usr_id"),
						S0_T41.ins_usr_nm.as("ins_usr_nm"),
						S0_T41.ins_func_id.as("ins_func_id"),
						S0_T41.ins_ts.as("ins_ts"),
						S0_T41.upd_usr_id.as("upd_usr_id"),
						S0_T41.upd_usr_nm.as("upd_usr_nm"),
						S0_T41.upd_func_id.as("upd_func_id"),
						S0_T41.upd_ts.as("upd_ts"),
						S0_T41.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T41
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T11.mfg_inst_no.eq(S0_T41.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T41.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1.mfg_act_no,
								max(S1.act_tm).as("max_yield_act_tm"),
								max(S1.ac_dt).as("max_yield_ac_dt")
							)
							.from(S1)
							.groupBy(S1.mfg_act_no).view(S0_T16)
						).on(
							bracket(
								S0_T16.pr(S1.mfg_act_no).eq(S0_T41.mfg_act_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								max(S2.schd_tm).as("max_yield_schd_tm"),
								S2.mfg_inst_no
							)
							.from(S2)
							.where(S2.can_flg.eq(value(false)))
							.groupBy(S2.mfg_inst_no).view(S0_T19)
						).on(
							bracket(
								S0_T19.pr(S2.mfg_inst_no).eq(S0_T41.mfg_inst_no)
							)
						)
						.innerJoin(S0_T20).on(
							bracket(
								S0_T41.mfg_inst_no.eq(S0_T20.mfg_inst_no)
								.and(S0_T41.div_seq.eq(S0_T20.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T41.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T41.act_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T41.st_ac_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T11.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T11.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T11.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T11.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T41.st_act_tm.gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T41.st_act_tm.lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T41.end_act_tm.gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T41.end_act_tm.lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T41.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T41.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T41.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T41.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T41.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T41.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T41.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(
							bind("tmp_yield_oper_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_X)
									.where(
										S3_X.mfg_act_no.eq(S0_T41.mfg_act_no)
									)
								)
							)
						)
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T41.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T41.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T41.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T16.pr("max_yield_act_tm").gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T16.pr("max_yield_act_tm").lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T16.pr("max_yield_ac_dt").gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("max_yield_ac_dt").lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").gte(bind("yield_schd_hm_fr")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").lte(bind("yield_schd_hm_to")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T20.mfg_sts_typ.asc(),
						S0_T11.st_schd_tm.asc(),
						S0_T41.mfg_inst_no.asc(),
						S0_T41.div_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T41.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T41.act_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1070_MST_MFG_INST_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_MFG_INST_S01() {
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MCTempView S0_T16 = createTempView("T16");
		MCTempView S0_T17 = createTempView("T17");
		MCTempView S0_T19 = createTempView("T19");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_MFG_ACT_R S1_TA1 = MST_MFG_ACT_R.create("TA1");
		MST_MFG_ACT_R S2_TA1 = MST_MFG_ACT_R.create("TA1");
		MST_YIELD_ACT_R S2_TA2 = MST_YIELD_ACT_R.create("TA2");
		MST_YIELD_SCHD_R S3 = MST_YIELD_SCHD_R.create();
		MST_OPER_INST_R S4_X = MST_OPER_INST_R.create("X");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_MFG_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T13.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T12.strg_loc_cd,
						S0_T11.base_unit_inst_qty,
						S0_T11.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T16.pr("base_unit_yield_qty"),
						S0_T16.pr("base_unit_dfct_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						MAPA_CALC$F_CALC_PER(
							S0_T11.base_unit_inst_qty,
							S0_T16.pr("base_unit_act_qty")
						).as("pr_rate"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T11.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T11.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T11.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T11.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.lot_no,
						S0_T12.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.abort_flg.as("inst_abort_flg"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T11.schd_chg_flg,
						S0_T1.inst_qty.as("base_unit_ord_qty"),
						S0_T1.not_inst_qty.as("base_unit_not_inst_qty"),
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T11.mfg_aprv_sts_typ,
						S0_T11.aprv_dt,
						S0_T11.aprv_tm,
						S0_T11.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T11.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T1.mfg_st_schd_dt.as("ord_st_schd_dt"),
						S0_T1.mfg_end_schd_dt.as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T17.pr("max_yield_act_tm"),
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T17.pr("max_yield_act_tm").as("yield_act_hm"),
						S0_T17.pr("max_yield_ac_dt").as("yield_ac_dt"),
						trunc(
							S0_T19.pr("max_yield_schd_tm"),
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T19.pr("max_yield_schd_tm").as("yield_schd_hm"),
						trunc(
							S0_T16.pr("min_st_act_tm"),
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T16.pr("min_st_act_tm").as("st_act_hm"),
						S0_T16.pr("min_st_ac_dt").as("st_ac_dt"),
						trunc(
							S0_T16.pr("max_end_act_tm"),
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T16.pr("max_end_act_tm").as("end_act_hm"),
						S0_T16.pr("max_end_ac_dt").as("end_ac_dt"),
						S0_T13.base_unit_mfg_qty,
						S0_T11.base_unit_inst_qty.subtract(
							bracket(
								S0_T13.base_unit_mfg_qty.add(S0_T13.base_unit_mfg_abort_qty)
							)
						).as("base_unit_mfg_rem_st_qty"),
						S0_T13.base_unit_mfg_rem_qty,
						S0_T13.base_unit_mfg_abort_qty,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T11.ins_usr_id.as("ins_usr_id"),
						S0_T11.ins_usr_nm.as("ins_usr_nm"),
						S0_T11.ins_func_id.as("ins_func_id"),
						S0_T11.ins_ts.as("ins_ts"),
						S0_T11.upd_usr_id.as("upd_usr_id"),
						S0_T11.upd_usr_nm.as("upd_usr_nm"),
						S0_T11.upd_func_id.as("upd_func_id"),
						S0_T11.upd_ts.as("upd_ts"),
						S0_T11.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T11
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S1_TA1.base_unit_yield_qty.add(S1_TA1.base_unit_dfct_qty)).as("base_unit_act_qty"),
								sum(S1_TA1.base_unit_yield_qty).as("base_unit_yield_qty"),
								sum(S1_TA1.base_unit_dfct_qty).as("base_unit_dfct_qty"),
								min(S1_TA1.st_act_tm).as("min_st_act_tm"),
								max(S1_TA1.st_act_tm).as("max_st_act_tm"),
								min(S1_TA1.end_act_tm).as("min_end_act_tm"),
								max(S1_TA1.end_act_tm).as("max_end_act_tm"),
								min(S1_TA1.st_ac_dt).as("min_st_ac_dt"),
								max(S1_TA1.st_ac_dt).as("max_st_ac_dt"),
								min(S1_TA1.end_ac_dt).as("min_end_ac_dt"),
								max(S1_TA1.end_ac_dt).as("max_end_ac_dt"),
								S1_TA1.mfg_inst_no
							)
							.from(S1_TA1)
							.groupBy(S1_TA1.mfg_inst_no).view(S0_T16)
						).on(
							bracket(
								S0_T16.pr(S1_TA1.mfg_inst_no).eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_TA1.mfg_inst_no,
								max(S2_TA2.act_tm).as("max_yield_act_tm"),
								max(S2_TA2.ac_dt).as("max_yield_ac_dt")
							)
							.from(
								S2_TA1
								.innerJoin(S2_TA2).on(
									bracket(
										S2_TA1.mfg_act_no.eq(S2_TA2.mfg_act_no)
									)
								)
							)
							.groupBy(S2_TA1.mfg_inst_no).view(S0_T17)
						).on(
							bracket(
								S0_T17.pr(S2_TA1.mfg_inst_no).eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								max(S3.schd_tm).as("max_yield_schd_tm"),
								S3.mfg_inst_no
							)
							.from(S3)
							.where(S3.can_flg.eq(value(false)))
							.groupBy(S3.mfg_inst_no).view(S0_T19)
						).on(
							bracket(
								S0_T19.pr(S3.mfg_inst_no).eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_sav_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T13.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T11.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T11.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T11.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T11.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T16.pr("min_st_act_tm").gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T16.pr("min_st_act_tm").lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T16.pr("max_end_act_tm").gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T16.pr("max_end_act_tm").lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T11.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T11.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T11.base_unit_inst_qty,
								S0_T16.pr("base_unit_act_qty")
							).gte(bind("pr_rate_fr"))
						)
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T11.base_unit_inst_qty,
								S0_T16.pr("base_unit_act_qty")
							).lte(bind("pr_rate_to"))
						)
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T12.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T11.abort_flg.eq(bind("tmp_abort_flg_str")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S4_X)
								.where(
									S4_X.mfg_inst_no.eq(S0_T11.mfg_inst_no)
									.and(S4_X.yield_oper_flg.eq(bind("tmp_yield_oper_flg_str")))
								)
							)
						)
						.and(S0_T11.can_flg.eq(value(false)))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T17.pr("max_yield_act_tm").gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T17.pr("max_yield_act_tm").lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T17.pr("max_yield_ac_dt").gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T17.pr("max_yield_ac_dt").lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").gte(bind("yield_schd_hm_fr")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").lte(bind("yield_schd_hm_to")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T13.mfg_sts_typ.asc(),
						S0_T12.mfg_mtd_typ.asc(),
						S0_T11.st_schd_tm.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T11.mfg_inst_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1070_MST_OPER_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_OPER_ACT_S01() {
		MST_OPER_ACT_R S0_T51 = MST_OPER_ACT_R.create("T51");
		MST_OPER_INST_R S0_T21 = MST_OPER_INST_R.create("T21");
		MSVT_OPER_INST_PR_R S0_T22 = MSVT_OPER_INST_PR_R.create("T22");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MST_MFG_ACT_R S0_T16 = MST_MFG_ACT_R.create("T16");
		MCTempView S0_T17 = createTempView("T17");
		MCTempView S0_T19 = createTempView("T19");
		MST_OPER_ACT_REM_R S0_T20 = MST_OPER_ACT_REM_R.create("T20");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_OPER_ORDER_R S0_T3 = MST_OPER_ORDER_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_OPER_R S0_M31 = MAM_OPER_R.create("M31");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		MAM_STR_LN_R S0_M34 = MAM_STR_LN_R.create("M34");
		MAM_USR_R S0_M35 = MAM_USR_R.create("M35");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_YIELD_ACT_R S1 = MST_YIELD_ACT_R.create();
		MST_YIELD_SCHD_R S2 = MST_YIELD_SCHD_R.create();
		MST_YIELD_ACT_R S3_X = MST_YIELD_ACT_R.create("X");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_OPER_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T20.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T12.strg_loc_cd,
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T21.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T21.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T21.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T21.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T21.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T21.intr_rmrks.as("oper_intr_rmrks"),
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T16.div_seq,
						S0_T16.mfg_act_no,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T16.mfg_aprv_sts_typ,
						S0_T16.aprv_dt,
						S0_T16.aprv_tm,
						S0_T16.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T16.aprv_usr_cd,
						S0_T16.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T21.oper_cd,
						S0_T21.oper_seq,
						S0_T21.oper_std_qty,
						S0_T21.oper_conv_qty,
						S0_T21.oper_unit_dec_place,
						S0_T51.oper_unit_cd,
						S0_T21.oper_loc_cd,
						S0_T21.oper_str_ln_cd,
						S0_T21.oper_lower_yield,
						S0_T21.oper_std_yield,
						S0_T21.oper_upper_yield,
						S0_T21.usr_cd,
						S0_T21.disp_seq,
						S0_T21.oper_rsrc,
						S0_T21.sub_char1,
						S0_T21.sub_char2,
						S0_T21.sub_char3,
						S0_T21.oper_inst_grp,
						S0_T21.oper_ord_no,
						S0_T21.oper_inst_no,
						S0_T51.oper_act_no,
						S0_T21.yield_oper_flg,
						S0_T21.yield_oper_ratio,
						S0_T21.oper_std_qty,
						S0_T21.oper_conv_qty,
						S0_T21.oper_unit_dec_place,
						S0_T21.oper_unit_conv_rnd_typ,
						S0_T51.oper_unit_qty.as("oper_unit_act_qty"),
						S0_T21.wip_rate,
						trunc(
							S0_T3.st_schd_tm,
							MCDateFmt.DD
						).as("ord_st_schd_dt"),
						trunc(
							S0_T3.end_schd_tm,
							MCDateFmt.DD
						).as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T17.pr("max_yield_act_tm"),
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T17.pr("max_yield_act_tm").as("yield_act_hm"),
						S0_T17.pr("max_yield_ac_dt").as("yield_ac_dt"),
						trunc(
							S0_T19.pr("max_yield_schd_tm"),
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T19.pr("max_yield_schd_tm").as("yield_schd_hm"),
						trunc(
							S0_T51.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T51.st_act_tm.as("st_act_hm"),
						S0_T16.st_ac_dt.as("st_ac_dt"),
						trunc(
							S0_T51.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T51.end_act_tm.as("end_act_hm"),
						S0_T16.end_ac_dt.as("end_ac_dt"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T51.ins_usr_id.as("ins_usr_id"),
						S0_T51.ins_usr_nm.as("ins_usr_nm"),
						S0_T51.ins_func_id.as("ins_func_id"),
						S0_T51.ins_ts.as("ins_ts"),
						S0_T51.upd_usr_id.as("upd_usr_id"),
						S0_T51.upd_usr_nm.as("upd_usr_nm"),
						S0_T51.upd_func_id.as("upd_func_id"),
						S0_T51.upd_ts.as("upd_ts"),
						S0_T51.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T51
						.leftOuterJoin(S0_T21).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T51.oper_inst_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T21.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								S0_T16.mfg_act_no.eq(S0_T51.mfg_act_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1.oper_act_no,
								max(S1.act_tm).as("max_yield_act_tm"),
								max(S1.ac_dt).as("max_yield_ac_dt")
							)
							.from(S1)
							.groupBy(S1.oper_act_no).view(S0_T17)
						).on(
							bracket(
								S0_T17.pr(S1.oper_act_no).eq(S0_T51.oper_act_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								max(S2.schd_tm).as("max_yield_schd_tm"),
								S2.oper_inst_no
							)
							.from(S2)
							.where(S2.can_flg.eq(value(false)))
							.groupBy(S2.oper_inst_no).view(S0_T19)
						).on(
							bracket(
								S0_T19.pr(S2.oper_inst_no).eq(S0_T21.oper_inst_no)
							)
						)
						.innerJoin(S0_T20).on(
							bracket(
								S0_T20.oper_inst_no.eq(S0_T51.oper_inst_no)
								.and(S0_T20.div_seq.eq(S0_T51.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T21.oper_ord_no.eq(S0_T3.oper_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M1.unit_cd.eq(S0_M7.unit_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T16.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T16.act_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T16.st_ac_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T21.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T21.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T21.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T21.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T51.st_act_tm.gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T51.st_act_tm.lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T51.end_act_tm.gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T51.end_act_tm.lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T16.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T16.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T16.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T16.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T51.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T51.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(
							bind("tmp_yield_oper_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S3_X)
									.where(
										S3_X.oper_act_no.eq(S0_T51.oper_act_no)
									)
								)
							)
						)
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T21.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T21.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T21.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_intr_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T16.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T16.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T51.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T51.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0_T17.pr("max_yield_act_tm").gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T17.pr("max_yield_act_tm").lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T17.pr("max_yield_ac_dt").gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T17.pr("max_yield_ac_dt").lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T21.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T21.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T21.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T21.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").gte(bind("yield_schd_hm_fr")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").lte(bind("yield_schd_hm_to")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.cutoff$and(S0_T21.oper_rsrc.like(bind("oper_rsrc")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T20.mfg_sts_typ.asc(),
						S0_T21.st_schd_tm.asc(),
						S0_T16.mfg_inst_no.asc(),
						S0_T16.div_seq.asc(),
						S0_T51.oper_inst_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T16.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T16.act_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(bracket(S0_T21.oper_loc_cd.eq(S0_M33.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M33.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(bracket(S0_T21.oper_loc_cd.eq(S0_M34.loc_cd).and(S0_T21.oper_str_ln_cd.eq(S0_M34.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M34.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_T21.oper_cd.eq(S0_M31.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(bracket(S0_T21.usr_cd.eq(S0_M35.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1070_MST_OPER_INST_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_OPER_INST_S01() {
		MST_OPER_INST_R S0_T21 = MST_OPER_INST_R.create("T21");
		MSVT_OPER_INST_PR_R S0_T22 = MSVT_OPER_INST_PR_R.create("T22");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MCTempView S0_T16 = createTempView("T16");
		MCTempView S0_T17 = createTempView("T17");
		MCTempView S0_T18 = createTempView("T18");
		MCTempView S0_T19 = createTempView("T19");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_OPER_ORDER_R S0_T3 = MST_OPER_ORDER_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_OPER_R S0_M31 = MAM_OPER_R.create("M31");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		MAM_STR_LN_R S0_M34 = MAM_STR_LN_R.create("M34");
		MAM_USR_R S0_M35 = MAM_USR_R.create("M35");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_MFG_ACT_R S1 = MST_MFG_ACT_R.create();
		MST_OPER_ACT_R S2_TA1 = MST_OPER_ACT_R.create("TA1");
		MST_OPER_ACT_R S3_TA1 = MST_OPER_ACT_R.create("TA1");
		MST_YIELD_ACT_R S3_TA2 = MST_YIELD_ACT_R.create("TA2");
		MST_YIELD_SCHD_R S4 = MST_YIELD_SCHD_R.create();
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_OPER_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T22.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T12.strg_loc_cd,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						MAPA_CALC$F_CALC_PER(
							S0_T21.base_unit_qty,
							S0_T17.pr("base_unit_act_qty")
						).as("pr_rate"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T21.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T21.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T21.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T21.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.lot_no,
						S0_T12.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T21.oper_abort_flg.as("inst_abort_flg"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T21.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T21.intr_rmrks.as("oper_intr_rmrks"),
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T21.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T11.schd_chg_flg,
						S0_T3.oper_schd_qty.as("base_unit_ord_qty"),
						S0_T3.not_oper_schd_qty.as("base_unit_not_inst_qty"),
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T11.mfg_aprv_sts_typ,
						S0_T11.aprv_dt,
						S0_T11.aprv_tm,
						S0_T11.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T11.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T21.oper_cd,
						S0_T21.oper_seq,
						S0_T21.oper_std_qty,
						S0_T21.oper_conv_qty,
						S0_T21.oper_unit_dec_place,
						S0_T21.oper_unit_cd,
						S0_T21.oper_loc_cd,
						S0_T21.oper_str_ln_cd,
						S0_T21.oper_lower_yield,
						S0_T21.oper_std_yield,
						S0_T21.oper_upper_yield,
						S0_T21.usr_cd,
						S0_T21.disp_seq,
						S0_T21.oper_rsrc,
						S0_T21.sub_char1,
						S0_T21.sub_char2,
						S0_T21.sub_char3,
						S0_T21.oper_inst_grp,
						S0_T21.oper_ord_no,
						S0_T21.oper_inst_no,
						S0_T21.yield_oper_flg,
						S0_T21.yield_oper_ratio,
						S0_T21.base_unit_qty.as("oper_base_unit_qty"),
						S0_T21.oper_std_qty,
						S0_T21.oper_conv_qty,
						S0_T21.oper_unit_dec_place,
						S0_T21.oper_unit_conv_rnd_typ,
						S0_T17.pr("oper_unit_act_qty"),
						S0_T22.base_unit_rem_qty.as("oper_base_unit_rem_qty"),
						S0_T21.wip_rate,
						trunc(
							S0_T3.st_schd_tm,
							MCDateFmt.DD
						).as("ord_st_schd_dt"),
						trunc(
							S0_T3.end_schd_tm,
							MCDateFmt.DD
						).as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T18.pr("max_yield_act_tm"),
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T18.pr("max_yield_act_tm").as("yield_act_hm"),
						S0_T18.pr("max_yield_ac_dt").as("yield_ac_dt"),
						trunc(
							S0_T19.pr("max_yield_schd_tm"),
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T19.pr("max_yield_schd_tm").as("yield_schd_hm"),
						trunc(
							S0_T17.pr("min_st_act_tm"),
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T17.pr("min_st_act_tm").as("st_act_hm"),
						S0_T16.pr("min_st_ac_dt").as("st_ac_dt"),
						trunc(
							S0_T17.pr("max_end_act_tm"),
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T17.pr("max_end_act_tm").as("end_act_hm"),
						S0_T16.pr("max_end_ac_dt").as("end_ac_dt"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T21.ins_usr_id.as("ins_usr_id"),
						S0_T21.ins_usr_nm.as("ins_usr_nm"),
						S0_T21.ins_func_id.as("ins_func_id"),
						S0_T21.ins_ts.as("ins_ts"),
						S0_T21.upd_usr_id.as("upd_usr_id"),
						S0_T21.upd_usr_nm.as("upd_usr_nm"),
						S0_T21.upd_func_id.as("upd_func_id"),
						S0_T21.upd_ts.as("upd_ts"),
						S0_T21.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T21
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T21.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S1.base_unit_yield_qty.add(S1.base_unit_dfct_qty)).as("base_unit_act_qty"),
								min(S1.st_act_tm).as("min_st_act_tm"),
								max(S1.st_act_tm).as("max_st_act_tm"),
								min(S1.end_act_tm).as("min_end_act_tm"),
								max(S1.end_act_tm).as("max_end_act_tm"),
								min(S1.st_ac_dt).as("min_st_ac_dt"),
								max(S1.st_ac_dt).as("max_st_ac_dt"),
								min(S1.end_ac_dt).as("min_end_ac_dt"),
								max(S1.end_ac_dt).as("max_end_ac_dt"),
								S1.mfg_inst_no
							)
							.from(S1)
							.groupBy(S1.mfg_inst_no).view(S0_T16)
						).on(
							bracket(
								S0_T16.pr(S1.mfg_inst_no).eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S2_TA1.oper_unit_qty).as("oper_unit_act_qty"),
								sum(S2_TA1.base_unit_qty).as("base_unit_act_qty"),
								min(S2_TA1.st_act_tm).as("min_st_act_tm"),
								max(S2_TA1.st_act_tm).as("max_st_act_tm"),
								min(S2_TA1.end_act_tm).as("min_end_act_tm"),
								max(S2_TA1.end_act_tm).as("max_end_act_tm"),
								S2_TA1.oper_inst_no
							)
							.from(S2_TA1)
							.groupBy(S2_TA1.oper_inst_no).view(S0_T17)
						).on(
							bracket(
								S0_T17.pr(S2_TA1.oper_inst_no).eq(S0_T21.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S3_TA1.oper_inst_no,
								max(S3_TA2.act_tm).as("max_yield_act_tm"),
								max(S3_TA2.ac_dt).as("max_yield_ac_dt")
							)
							.from(
								S3_TA1
								.innerJoin(S3_TA2).on(
									bracket(
										S3_TA1.oper_act_no.eq(S3_TA2.oper_act_no)
									)
								)
							)
							.groupBy(S3_TA1.oper_inst_no).view(S0_T18)
						).on(
							bracket(
								S0_T18.pr(S3_TA1.oper_inst_no).eq(S0_T21.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								max(S4.schd_tm).as("max_yield_schd_tm"),
								S4.oper_inst_no
							)
							.from(S4)
							.where(S4.can_flg.eq(value(false)))
							.groupBy(S4.oper_inst_no).view(S0_T19)
						).on(
							bracket(
								S0_T19.pr(S4.oper_inst_no).eq(S0_T21.oper_inst_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T21.oper_ord_no.eq(S0_T3.oper_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_sav_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T21.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T21.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T21.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T21.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T17.pr("min_st_act_tm").gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T17.pr("min_st_act_tm").lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T17.pr("max_end_act_tm").gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T17.pr("max_end_act_tm").lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T21.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T21.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T21.base_unit_qty,
								S0_T17.pr("base_unit_act_qty")
							).gte(bind("pr_rate_fr"))
						)
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T21.base_unit_qty,
								S0_T17.pr("base_unit_act_qty")
							).lte(bind("pr_rate_to"))
						)
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T12.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T1.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T21.oper_abort_flg.eq(bind("tmp_abort_flg_str")))
						.cutoff$and(S0_T21.yield_oper_flg.eq(bind("tmp_yield_oper_flg_str")))
						.and(S0_T21.can_flg.eq(value(false)))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T21.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T21.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T21.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_intr_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T18.pr("max_yield_act_tm").gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T18.pr("max_yield_act_tm").lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T18.pr("max_yield_ac_dt").gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T18.pr("max_yield_ac_dt").lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T21.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T21.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T21.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T21.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").gte(bind("yield_schd_hm_fr")))
						.cutoff$and(S0_T19.pr("max_yield_schd_tm").lte(bind("yield_schd_hm_to")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.cutoff$and(S0_T21.oper_rsrc.like(bind("oper_rsrc")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T13.mfg_sts_typ.asc(),
						S0_T12.mfg_mtd_typ.asc(),
						S0_T11.st_schd_tm.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T11.mfg_inst_no.asc(),
						S0_T21.oper_inst_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(bracket(S0_T21.oper_loc_cd.eq(S0_M33.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M33.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(bracket(S0_T21.oper_loc_cd.eq(S0_M34.loc_cd).and(S0_T21.oper_str_ln_cd.eq(S0_M34.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M34.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_T21.oper_cd.eq(S0_M31.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(bracket(S0_T21.usr_cd.eq(S0_M35.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1070_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_YIELD_ACT_S01() {
		MST_YIELD_ACT_R S0_T61 = MST_YIELD_ACT_R.create("T61");
		MST_YIELD_SCHD_R S0_T31 = MST_YIELD_SCHD_R.create("T31");
		MST_OPER_INST_R S0_T21 = MST_OPER_INST_R.create("T21");
		MSVT_OPER_INST_PR_R S0_T22 = MSVT_OPER_INST_PR_R.create("T22");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MST_MFG_ACT_R S0_T16 = MST_MFG_ACT_R.create("T16");
		MST_OPER_ACT_R S0_T17 = MST_OPER_ACT_R.create("T17");
		MST_YIELD_ACT_REM_R S0_T20 = MST_YIELD_ACT_REM_R.create("T20");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_OPER_ORDER_R S0_T3 = MST_OPER_ORDER_R.create("T3");
		MST_INSP_SCHD_R S0_T62 = MST_INSP_SCHD_R.create("T62");
		MST_INSP_INST_R S0_T63 = MST_INSP_INST_R.create("T63");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_USR_R S0_M27 = MAM_USR_R.create("M27");
		MAM_DPT_R S0_M28 = MAM_DPT_R.create("M28");
		MAM_OPER_R S0_M31 = MAM_OPER_R.create("M31");
		MAM_UNIT_R S0_M32 = MAM_UNIT_R.create("M32");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		MAM_STR_LN_R S0_M34 = MAM_STR_LN_R.create("M34");
		MAM_USR_R S0_M35 = MAM_USR_R.create("M35");
		MAM_BIZ_RSN_R S0_M38 = MAM_BIZ_RSN_R.create("M38");
		MAM_STK_GD_R S0_M39 = MAM_STK_GD_R.create("M39");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T20.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T61.strg_loc_cd,
						decode(
							MAC_QUALITY_TYP$IS_GOOD(S0_T61.quality_typ),
							value(true),
							S0_T61.base_unit_qty,
							value(0)
						).as("base_unit_yield_qty"),
						decode(
							MAC_QUALITY_TYP$IS_GOOD(S0_T61.quality_typ),
							value(false),
							S0_T61.base_unit_qty,
							value(0)
						).as("base_unit_dfct_qty"),
						S0_T61.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T21.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T21.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T21.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T21.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T61.lot_no,
						S0_T61.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T61.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T21.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T21.intr_rmrks.as("oper_intr_rmrks"),
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T16.div_seq,
						S0_T16.mfg_act_no,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T16.mfg_aprv_sts_typ,
						S0_T16.aprv_dt,
						S0_T16.aprv_tm,
						S0_T16.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T16.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T21.oper_cd,
						S0_T21.oper_seq,
						S0_T21.oper_loc_cd,
						S0_T21.oper_str_ln_cd,
						S0_T21.oper_lower_yield,
						S0_T21.oper_std_yield,
						S0_T21.oper_upper_yield,
						S0_T21.usr_cd,
						S0_T21.disp_seq,
						S0_T21.oper_rsrc,
						S0_T21.sub_char1,
						S0_T21.sub_char2,
						S0_T21.sub_char3,
						S0_T21.oper_inst_grp,
						S0_T21.oper_ord_no,
						S0_T21.oper_inst_no,
						S0_T61.oper_act_no,
						S0_T21.yield_oper_flg,
						S0_T21.yield_oper_ratio,
						S0_T21.wip_rate,
						trunc(
							S0_T3.st_schd_tm,
							MCDateFmt.DD
						).as("ord_st_schd_dt"),
						trunc(
							S0_T3.end_schd_tm,
							MCDateFmt.DD
						).as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T61.act_tm,
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T61.act_tm.as("yield_act_hm"),
						S0_T61.ac_dt.as("yield_ac_dt"),
						trunc(
							S0_T31.schd_tm,
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T31.schd_tm.as("yield_schd_hm"),
						trunc(
							S0_T17.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T17.st_act_tm.as("st_act_hm"),
						S0_T16.st_ac_dt.as("st_ac_dt"),
						trunc(
							S0_T17.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T17.end_act_tm.as("end_act_hm"),
						S0_T16.end_ac_dt.as("end_ac_dt"),
						decode(
							MAC_QUALITY_TYP$IS_GOOD(S0_T61.quality_typ),
							value(true),
							S0_T61.trd_unit_qty,
							value(0)
						).as("trd_unit_yield_qty"),
						decode(
							MAC_QUALITY_TYP$IS_GOOD(S0_T61.quality_typ),
							value(false),
							S0_T61.trd_unit_qty,
							value(0)
						).as("trd_unit_dfct_qty"),
						S0_T61.trd_unit_cd,
						S0_T31.yield_schd_no,
						S0_T31.intr_rmrks.as("yield_schd_intr_rmrks"),
						S0_T31.inst_rpt_rmrks.as("yield_schd_rpt_rmrks"),
						S0_T61.insp_cnt_rmrks,
						S0_T31.sub_char1.as("yield_schd_sub_char1"),
						S0_T31.sub_char2.as("yield_schd_sub_char2"),
						S0_T31.sub_char3.as("yield_schd_sub_char3"),
						S0_T61.yield_typ,
						S0_T61.yield_act_no,
						S0_T61.yield_rate,
						S0_T61.yield_rsn_cd,
						S0_T61.quality_typ,
						S0_T61.gd_cd,
						S0_T61.not_stk_flg,
						nvl(
							S0_T63.insp_sts_typ,
							S0_T62.insp_schd_sts_typ
						).as("insp_sts_typ"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T61.ins_usr_id.as("ins_usr_id"),
						S0_T61.ins_usr_nm.as("ins_usr_nm"),
						S0_T61.ins_func_id.as("ins_func_id"),
						S0_T61.ins_ts.as("ins_ts"),
						S0_T61.upd_usr_id.as("upd_usr_id"),
						S0_T61.upd_usr_nm.as("upd_usr_nm"),
						S0_T61.upd_func_id.as("upd_func_id"),
						S0_T61.upd_ts.as("upd_ts"),
						S0_T61.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP),
						// this field is appended by sql coverter.
						S0_T61.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T61.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T61.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T61.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T61
						.leftOuterJoin(S0_T31).on(
							bracket(
								S0_T31.yield_schd_no.eq(S0_T61.yield_schd_no)
							)
						)
						.innerJoin(S0_T21).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T31.oper_inst_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T22.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T21.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T16).on(
							bracket(
								S0_T16.mfg_act_no.eq(S0_T61.mfg_act_no)
							)
						)
						.leftOuterJoin(S0_T17).on(
							bracket(
								S0_T17.oper_act_no.eq(S0_T61.oper_act_no)
							)
						)
						.innerJoin(S0_T20).on(
							bracket(
								S0_T20.yield_schd_no.eq(S0_T61.yield_schd_no)
								.and(S0_T20.div_seq.eq(S0_T61.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T21.oper_ord_no.eq(S0_T3.oper_ord_no)
							)
						)
						.leftOuterJoin(S0_T62).on(
							bracket(
								S0_T16.mfg_inst_no.eq(S0_T62.src_no1)
								.and(S0_T61.yield_schd_no.eq(S0_T62.src_no3))
								.and(S0_T61.yield_act_no.eq(S0_T62.src_no4))
								.and(S0_T62.latest_flg.eq(value(true)))
								.and(S0_T62.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
							)
						)
						.leftOuterJoin(S0_T63).on(
							bracket(
								S0_T62.insp_no.eq(S0_T63.insp_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T16.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M28).on(
							bracket(
								S0_T16.act_dpt_cd.eq(S0_M28.dpt_cd)
								.and(S0_T16.st_ac_dt.between(S0_M28.st_dt, S0_M28.end_dt))
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_T21.oper_unit_cd.eq(S0_M32.unit_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T20.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T21.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T21.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T21.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T21.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T17.st_act_tm.gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T17.st_act_tm.lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T17.end_act_tm.gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T17.end_act_tm.lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T16.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T16.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T16.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T16.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T61.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T61.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T61.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T61.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T61.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T61.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T21.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T21.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T21.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_intr_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T31.yield_schd_no.like(bind("yield_schd_no")))
						.cutoff$and(S0_T16.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T16.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M28.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T61.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T61.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0_T61.yield_act_no.like(bind("yield_act_no")))
						.cutoff$and(S0_T61.act_tm.gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T61.act_tm.lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T61.ac_dt.gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T61.ac_dt.lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T21.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T21.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T21.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T21.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T31.schd_tm.gte(bind("yield_schd_dt_fr")))
						.cutoff$and(S0_T31.schd_tm.lte(bind("yield_schd_dt_to")))
						.cutoff$and(S0_T31.intr_rmrks.like(bind("yield_schd_intr_rmrks")))
						.cutoff$and(S0_T31.inst_rpt_rmrks.like(bind("yield_schd_rpt_rmrks")))
						.cutoff$and(S0_T31.insp_cnt_rmrks.like(bind("insp_cnt_rmrks")))
						.cutoff$and(S0_T31.sub_char1.like(bind("yield_schd_sub_char1")))
						.cutoff$and(S0_T31.sub_char2.like(bind("yield_schd_sub_char2")))
						.cutoff$and(S0_T31.sub_char3.like(bind("yield_schd_sub_char3")))
						.cutoff$and(S0_T61.yield_rsn_cd.like(bind("yield_rsn_cd")))
						.cutoff$and(S0_T61.yield_typ.like(bind("yield_typ")))
						.cutoff$and(S0_T61.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.cutoff$and(S0_T21.oper_rsrc.like(bind("oper_rsrc")))
						.and(S0_T61.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T20.mfg_sts_typ.asc(),
						S0_T21.st_schd_tm.asc(),
						S0_T16.mfg_inst_no.asc(),
						S0_T16.div_seq.asc(),
						S0_T21.oper_inst_no.asc(),
						S0_T61.yield_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T61.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T16.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T61.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T61.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M27).on(bracket(S0_T16.act_usr_cd.eq(S0_M27.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M27.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(bracket(S0_T21.oper_loc_cd.eq(S0_M33.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M33.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(bracket(S0_T21.oper_loc_cd.eq(S0_M34.loc_cd).and(S0_T21.oper_str_ln_cd.eq(S0_M34.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M34.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_T21.oper_cd.eq(S0_M31.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(bracket(S0_T21.usr_cd.eq(S0_M35.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("yield_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(bracket(S0_T61.yield_rsn_cd.eq(S0_M38.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.biz_rsn_nm.like(bind("yield_rsn_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M39).on(bracket(S0_T61.gd_cd.eq(S0_M39.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M39.gd_nm.like(bind("gd_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("yield_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("yield_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1070_MST_YIELD_SCHD_Query_S01
	 */
	static MCQueryPlan MSBCL1070_MST_YIELD_SCHD_S01() {
		MST_YIELD_SCHD_R S0_T31 = MST_YIELD_SCHD_R.create("T31");
		MST_OPER_INST_R S0_T21 = MST_OPER_INST_R.create("T21");
		MSVT_YIELD_SCHD_PR_R S0_T22 = MSVT_YIELD_SCHD_PR_R.create("T22");
		MST_MFG_INST_R S0_T11 = MST_MFG_INST_R.create("T11");
		MST_ITM_MFG_INST_R S0_T12 = MST_ITM_MFG_INST_R.create("T12");
		MSVT_MFG_INST_PR_R S0_T13 = MSVT_MFG_INST_PR_R.create("T13");
		MST_PO_D_R S0_T14 = MST_PO_D_R.create("T14");
		MST_PO_R S0_T15 = MST_PO_R.create("T15");
		MCTempView S0_T16 = createTempView("T16");
		MCTempView S0_T17 = createTempView("T17");
		MCTempView S0_T18 = createTempView("T18");
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_OPER_ORDER_R S0_T3 = MST_OPER_ORDER_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAVM_ITM_WG_R S0_M3 = MAVM_ITM_WG_R.create("M3");
		MAVM_RD_LOC_R S0_M4 = MAVM_RD_LOC_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LOC_GRP_R S0_M12 = MAM_LOC_GRP_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_USR_R S0_M21 = MAM_USR_R.create("M21");
		MAM_DPT_R S0_M22 = MAM_DPT_R.create("M22");
		MAM_USR_R S0_M23 = MAM_USR_R.create("M23");
		MAM_DPT_R S0_M24 = MAM_DPT_R.create("M24");
		MAM_STR_LN_R S0_M25 = MAM_STR_LN_R.create("M25");
		MAM_STR_LN_R S0_M26 = MAM_STR_LN_R.create("M26");
		MAM_OPER_R S0_M31 = MAM_OPER_R.create("M31");
		MAM_UNIT_R S0_M32 = MAM_UNIT_R.create("M32");
		MAM_LOC_R S0_M33 = MAM_LOC_R.create("M33");
		MAM_STR_LN_R S0_M34 = MAM_STR_LN_R.create("M34");
		MAM_USR_R S0_M35 = MAM_USR_R.create("M35");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM_ITM10");
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_MFG_ACT_R S1 = MST_MFG_ACT_R.create();
		MST_OPER_ACT_R S2 = MST_OPER_ACT_R.create();
		MST_YIELD_ACT_R S3 = MST_YIELD_ACT_R.create();
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1070_MST_YIELD_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T12.mfg_mtd_typ,
						S0_T22.mfg_sts_typ,
						S0_T12.itm_cd,
						S0_T12.itm_sub1,
						S0_T12.itm_sub2,
						S0_T12.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T12.mfg_loc_cd,
						S0_M4.loc_nm.as("mfg_loc_nm"),
						S0_T12.bom_ptn,
						S0_T12.sppl_cd,
						S0_T12.strg_loc_cd,
						S0_T31.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T18.pr("base_unit_yield_qty"),
						S0_T18.pr("base_unit_dfct_qty"),
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						MAPA_CALC$F_CALC_PER(
							S0_T31.base_unit_yield_qty,
							S0_T18.pr("base_unit_act_qty")
						).as("pr_rate"),
						trunc(
							S0_T11.rqst_dlv_rqst_tm,
							MCDateFmt.DD
						).as("rqst_dlv_rqst_dt"),
						S0_T11.rqst_dlv_rqst_tm.as("rqst_dlv_rqst_hm"),
						trunc(
							S0_T21.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T21.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T21.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T21.end_schd_tm.as("end_schd_hm"),
						S0_T12.oper_ptn,
						S0_T12.lot_no,
						S0_T12.sublot_no,
						S0_T12.sno1,
						S0_T12.sno2,
						S0_T12.sno3,
						S0_T12.sno4,
						S0_T11.inst_dt,
						S0_T11.inst_usr_cd,
						S0_T11.inst_dpt_cd,
						S0_M22.dpt_nm.as("inst_dpt_nm"),
						S0_T12.mfg_str_ln_cd.as("mfg_str_ln_cd"),
						S0_T12.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T21.oper_abort_flg.as("inst_abort_flg"),
						S0_T11.inst_rpt_rmrks,
						S0_T11.intr_rmrks,
						S0_T21.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T21.intr_rmrks.as("oper_intr_rmrks"),
						S0_T11.inst_po_cnt_rmrks,
						S0_T11.disp_pd,
						S0_T12.itm_lower_yield,
						S0_T12.itm_std_yield,
						S0_T12.itm_upper_yield,
						S0_T11.mfg_inst_no,
						S0_T11.mfg_inst_rev,
						S0_T11.itm_mfg_inst_no,
						S0_T1.itm_ord_no,
						S0_T11.mfg_inst_unit_typ,
						S0_T11.schd_chg_flg,
						S0_T12.wg_cd.as("mfg_loc_wg_cd"),
						S0_M4.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T12.site_cd.as("mfg_loc_site_cd"),
						S0_T11.po_d_no.as("po_d_no"),
						S0_T12.sub_char1.as("itm_mfg_inst_sub_char1"),
						S0_T12.sub_char2.as("itm_mfg_inst_sub_char2"),
						S0_T12.sub_char3.as("itm_mfg_inst_sub_char3"),
						S0_T11.sub_char1.as("mfg_inst_sub_char1"),
						S0_T11.sub_char2.as("mfg_inst_sub_char2"),
						S0_T11.sub_char3.as("mfg_inst_sub_char3"),
						S0_T11.mfg_aprv_sts_typ,
						S0_T11.aprv_dt,
						S0_T11.aprv_tm,
						S0_T11.aprv_dpt_cd,
						S0_M24.dpt_nm.as("aprv_dpt_nm"),
						S0_T11.aprv_usr_cd,
						S0_T11.aprv_rsn,
						S0_T11.aprv_flg.as("aprv_tgt_flg"),
						S0_T21.oper_cd,
						S0_T21.oper_seq,
						S0_T21.oper_loc_cd,
						S0_T21.oper_str_ln_cd,
						S0_T21.oper_lower_yield,
						S0_T21.oper_std_yield,
						S0_T21.oper_upper_yield,
						S0_T21.usr_cd,
						S0_T21.disp_seq,
						S0_T21.oper_rsrc,
						S0_T21.sub_char1,
						S0_T21.sub_char2,
						S0_T21.sub_char3,
						S0_T21.oper_inst_grp,
						S0_T21.oper_ord_no,
						S0_T21.oper_inst_no,
						S0_T21.yield_oper_ratio,
						S0_T21.wip_rate,
						trunc(
							S0_T3.st_schd_tm,
							MCDateFmt.DD
						).as("ord_st_schd_dt"),
						trunc(
							S0_T3.end_schd_tm,
							MCDateFmt.DD
						).as("ord_end_schd_dt"),
						S0_T12.unschd_inst_flg,
						S0_T12.unschd_act_flg,
						trunc(
							S0_T18.pr("max_yield_act_tm"),
							MCDateFmt.DD
						).as("yield_act_dt"),
						S0_T18.pr("max_yield_act_tm").as("yield_act_hm"),
						S0_T18.pr("max_yield_ac_dt").as("yield_ac_dt"),
						trunc(
							S0_T31.schd_tm,
							MCDateFmt.DD
						).as("yield_schd_dt"),
						S0_T31.schd_tm.as("yield_schd_hm"),
						trunc(
							S0_T17.pr("min_st_act_tm"),
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T17.pr("min_st_act_tm").as("st_act_hm"),
						S0_T16.pr("min_st_ac_dt").as("st_ac_dt"),
						trunc(
							S0_T17.pr("max_end_act_tm"),
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T17.pr("max_end_act_tm").as("end_act_hm"),
						S0_T16.pr("max_end_ac_dt").as("end_ac_dt"),
						S0_T31.trd_unit_yield_qty.as("trd_unit_yield_schd_qty"),
						S0_T31.trd_unit_cd,
						S0_T31.yield_schd_no,
						S0_T31.intr_rmrks.as("yield_schd_intr_rmrks"),
						S0_T31.inst_rpt_rmrks.as("yield_schd_rpt_rmrks"),
						S0_T31.insp_cnt_rmrks,
						S0_T31.sub_char1.as("yield_schd_sub_char1"),
						S0_T31.sub_char2.as("yield_schd_sub_char2"),
						S0_T31.sub_char3.as("yield_schd_sub_char3"),
						S0_T31.yield_typ,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T31.ins_usr_id.as("ins_usr_id"),
						S0_T31.ins_usr_nm.as("ins_usr_nm"),
						S0_T31.ins_func_id.as("ins_func_id"),
						S0_T31.ins_ts.as("ins_ts"),
						S0_T31.upd_usr_id.as("upd_usr_id"),
						S0_T31.upd_usr_nm.as("upd_usr_nm"),
						S0_T31.upd_func_id.as("upd_func_id"),
						S0_T31.upd_ts.as("upd_ts"),
						S0_T31.upd_srv_req_no.as("upd_srv_req_no"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP),
						// this field is appended by sql coverter.
						S0_T31.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T31.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T31.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T31.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T31
						.innerJoin(S0_T21).on(
							bracket(
								S0_T21.oper_inst_no.eq(S0_T31.oper_inst_no)
							)
						)
						.innerJoin(S0_T22).on(
							bracket(
								S0_T22.yield_schd_no.eq(S0_T31.yield_schd_no)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T21.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.innerJoin(S0_T12).on(
							bracket(
								S0_T11.itm_mfg_inst_no.eq(S0_T12.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T13).on(
							bracket(
								S0_T13.mfg_inst_no.eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S1.base_unit_yield_qty.add(S1.base_unit_dfct_qty)).as("base_unit_act_qty"),
								min(S1.st_act_tm).as("min_st_act_tm"),
								max(S1.st_act_tm).as("max_st_act_tm"),
								min(S1.end_act_tm).as("min_end_act_tm"),
								max(S1.end_act_tm).as("max_end_act_tm"),
								min(S1.st_ac_dt).as("min_st_ac_dt"),
								max(S1.st_ac_dt).as("max_st_ac_dt"),
								min(S1.end_ac_dt).as("min_end_ac_dt"),
								max(S1.end_ac_dt).as("max_end_ac_dt"),
								S1.mfg_inst_no
							)
							.from(S1)
							.groupBy(S1.mfg_inst_no).view(S0_T16)
						).on(
							bracket(
								S0_T16.pr(S1.mfg_inst_no).eq(S0_T11.mfg_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S2.oper_unit_qty).as("oper_unit_act_qty"),
								sum(S2.base_unit_qty).as("base_unit_act_qty"),
								min(S2.st_act_tm).as("min_st_act_tm"),
								max(S2.st_act_tm).as("max_st_act_tm"),
								min(S2.end_act_tm).as("min_end_act_tm"),
								max(S2.end_act_tm).as("max_end_act_tm"),
								S2.oper_inst_no
							)
							.from(S2)
							.groupBy(S2.oper_inst_no).view(S0_T17)
						).on(
							bracket(
								S0_T17.pr(S2.oper_inst_no).eq(S0_T21.oper_inst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								sum(S3.base_unit_qty).as("base_unit_act_qty"),
								sum(
									decode(
										MAC_QUALITY_TYP$IS_GOOD(S3.quality_typ),
										value(true),
										S3.base_unit_qty,
										value(0)
									)
								).as("base_unit_yield_qty"),
								sum(
									decode(
										MAC_QUALITY_TYP$IS_GOOD(S3.quality_typ),
										value(false),
										S3.base_unit_qty,
										value(0)
									)
								).as("base_unit_dfct_qty"),
								max(S3.act_tm).as("max_yield_act_tm"),
								max(S3.ac_dt).as("max_yield_ac_dt"),
								S3.yield_schd_no
							)
							.from(S3)
							.groupBy(S3.yield_schd_no).view(S0_T18)
						).on(
							bracket(
								S0_T18.pr(S3.yield_schd_no).eq(S0_T31.yield_schd_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T12.itm_ord_no.eq(S0_T1.itm_ord_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T21.oper_ord_no.eq(S0_T3.oper_ord_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T12.sno1.eq(S0_M2.sno1))
								.and(S0_T12.sno2.eq(S0_M2.sno2))
								.and(S0_T12.sno3.eq(S0_M2.sno3))
								.and(S0_T12.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T12.itm_cd.eq(S0_M3.itm_cd)
								.and(S0_T12.itm_sub1.eq(S0_M3.itm_sub1))
								.and(S0_T12.itm_sub2.eq(S0_M3.itm_sub2))
								.and(S0_T12.itm_sub3.eq(S0_M3.itm_sub3))
								.and(S0_T12.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M4).on(
							bracket(
								S0_T12.mfg_loc_cd.eq(S0_M4.loc_cd)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T11.inst_dpt_cd.eq(S0_M22.dpt_cd)
								.and(S0_T11.inst_dt.between(S0_M22.st_dt, S0_M22.end_dt))
							)
						)
						.leftOuterJoin(S0_M24).on(
							bracket(
								S0_T11.aprv_dpt_cd.eq(S0_M24.dpt_cd)
								.and(S0_T11.aprv_dt.between(S0_M24.st_dt, S0_M24.end_dt))
							)
						)
						.leftOuterJoin(S0_M32).on(
							bracket(
								S0_T21.oper_unit_cd.eq(S0_M32.unit_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_sav_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T22.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.and(S0_T31.can_flg.eq(value(false)))
						.cutoff$and(S0_T21.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T21.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T21.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T21.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T17.pr("min_st_act_tm").gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T17.pr("min_st_act_tm").lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T17.pr("max_end_act_tm").gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T17.pr("max_end_act_tm").lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.gte(bind("rqst_dlv_rqst_hm_fr")))
						.cutoff$and(S0_T11.rqst_dlv_rqst_tm.lte(bind("rqst_dlv_rqst_hm_to")))
						.cutoff$and(S0_T11.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T11.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T11.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T11.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("min_st_ac_dt").lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T16.pr("max_end_ac_dt").lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T31.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T31.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T31.base_unit_yield_qty,
								S0_T18.pr("base_unit_act_qty")
							).gte(bind("pr_rate_fr"))
						)
						.cutoff$and(
							MAPA_CALC$F_CALC_PER(
								S0_T31.base_unit_yield_qty,
								S0_T18.pr("base_unit_act_qty")
							).lte(bind("pr_rate_to"))
						)
						.cutoff$and(S0_T12.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T12.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T12.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M4.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T12.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T12.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T12.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T12.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T12.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T11.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T12.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T12.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T12.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T12.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T12.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T12.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T12.sno1.like(bind("sno1")))
						.cutoff$and(S0_T12.sno2.like(bind("sno2")))
						.cutoff$and(S0_T12.sno3.like(bind("sno3")))
						.cutoff$and(S0_T12.sno4.like(bind("sno4")))
						.cutoff$and(S0_T11.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T11.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M22.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T11.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T11.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M24.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T11.mfg_inst_unit_typ.like(bind("mfg_inst_unit_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T11.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T11.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T11.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T21.oper_abort_flg.eq(bind("tmp_abort_flg_str")))
						.and(S0_T21.can_flg.eq(value(false)))
						.and(S0_T31.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())))
						.cutoff$and(S0_T11.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T11.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T11.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T12.sub_char1.like(bind("itm_mfg_inst_sub_char1")))
						.cutoff$and(S0_T12.sub_char2.like(bind("itm_mfg_inst_sub_char2")))
						.cutoff$and(S0_T12.sub_char3.like(bind("itm_mfg_inst_sub_char3")))
						.cutoff$and(S0_T11.sub_char1.like(bind("mfg_inst_sub_char1")))
						.cutoff$and(S0_T11.sub_char2.like(bind("mfg_inst_sub_char2")))
						.cutoff$and(S0_T11.sub_char3.like(bind("mfg_inst_sub_char3")))
						.cutoff$and(S0_T21.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T21.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T21.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T21.intr_rmrks.like(bind("oper_intr_rmrks")))
						.cutoff$and(S0_T21.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T21.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T21.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T31.yield_schd_no.like(bind("yield_schd_no")))
						.cutoff$and(S0_T18.pr("max_yield_act_tm").gte(bind("yield_act_hm_fr")))
						.cutoff$and(S0_T18.pr("max_yield_act_tm").lte(bind("yield_act_hm_to")))
						.cutoff$and(S0_T18.pr("max_yield_ac_dt").gte(bind("yield_ac_dt_fr")))
						.cutoff$and(S0_T18.pr("max_yield_ac_dt").lte(bind("yield_ac_dt_to")))
						.cutoff$and(S0_T21.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T21.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T21.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T21.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T31.schd_tm.gte(bind("yield_schd_dt_fr")))
						.cutoff$and(S0_T31.schd_tm.lte(bind("yield_schd_dt_to")))
						.cutoff$and(S0_T31.intr_rmrks.like(bind("yield_schd_intr_rmrks")))
						.cutoff$and(S0_T31.inst_rpt_rmrks.like(bind("yield_schd_rpt_rmrks")))
						.cutoff$and(S0_T31.insp_cnt_rmrks.like(bind("insp_cnt_rmrks")))
						.cutoff$and(S0_T31.sub_char1.like(bind("yield_schd_sub_char1")))
						.cutoff$and(S0_T31.sub_char2.like(bind("yield_schd_sub_char2")))
						.cutoff$and(S0_T31.sub_char3.like(bind("yield_schd_sub_char3")))
						.cutoff$and(S0_T31.yield_typ.like(bind("yield_typ")))
						.cutoff$and(S0_T12.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.cutoff$and(S0_T21.oper_rsrc.like(bind("oper_rsrc")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T13.mfg_sts_typ.asc(),
						S0_T12.mfg_mtd_typ.asc(),
						S0_T11.st_schd_tm.asc(),
						S0_T1.itm_ord_no.asc(),
						S0_T11.mfg_inst_no.asc(),
						S0_T21.oper_inst_no.asc(),
						S0_T31.yield_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T14).on(bracket(S0_T11.po_d_no.eq(S0_T14.po_d_no)))),
				when(boundOr("po_aprv_sts_typ"))
					.view(v -> v.leftOuterJoin(S0_T15).on(bracket(S0_T14.po_no.eq(S0_T15.po_no))))
					.predicate(p -> p.cutoff$and(S0_T15.aprv_sts_typ.like(bind("po_aprv_sts_typ")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T12.sno1.eq(S0_T2.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T12.strg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T12.wg_cd.eq(S0_M8.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T12.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T12.sppl_cd.eq(S0_M10.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M4.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M5.loc_grp_cd.eq(S0_M12.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T11.inst_usr_cd.eq(S0_M21.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T11.aprv_usr_cd.eq(S0_M23.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T12.mfg_loc_cd.eq(S0_M25.loc_cd).and(S0_T12.mfg_str_ln_cd.eq(S0_M25.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M25.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M26).on(bracket(S0_T12.strg_loc_cd.eq(S0_M26.loc_cd).and(S0_T12.strg_str_ln_cd.eq(S0_M26.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M26.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(bracket(S0_T21.oper_loc_cd.eq(S0_M33.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M33.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(bracket(S0_T21.oper_loc_cd.eq(S0_M34.loc_cd).and(S0_T21.oper_str_ln_cd.eq(S0_M34.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M34.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_T21.oper_cd.eq(S0_M31.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(bracket(S0_T21.usr_cd.eq(S0_M35.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M35.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_M1.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_M1.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_M1.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_M1.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_M1.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_M1.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_M1.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_M1.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_M1.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_M1.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M10.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M10.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M10.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M10.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M10.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M10.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M10.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M10.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M10.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M10.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M10.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M10.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("po_d_no")
						))
						.addSelect(m -> toArray(
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_no_", m.po_no());
					}),
					j -> j
						.add(MST_PO_R.class, r -> toCondition(
							r.getStringNE("join_po_no_")
						))
						.addSelect(m -> toArray(
							m.aprv_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("po_aprv_sts_typ", m.aprv_sts_typ());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
}