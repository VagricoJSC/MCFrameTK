package mcframe.serverMSBC.MSBCL1130;

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
	 * -- MSBCL1130_MST_MFG_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1130_MST_MFG_ACT_REM_S01() {
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_WRK_SNO_R S0_T4 = MST_WRK_SNO_R.create("T4");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAVM_RD_LOC_R S0_M5 = MAVM_RD_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_WG_R S0_M10 = MAM_WG_R.create("M10");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAM_ITM_TYP_D_R S0_M30 = MAM_ITM_TYP_D_R.create("M30");
		MAM_LOC_GRP_R S0_M31 = MAM_LOC_GRP_R.create("M31");
		MAM_LOC_GRP_R S0_M32 = MAM_LOC_GRP_R.create("M32");
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
				sql("MSBCL1130_MST_MFG_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						value(MSC_MFG_STS_TYP.ORD.value()).as("mfg_sts_typ"),
						nullValue().as("st_act_dt"),
						nullValue().as("st_act_hm"),
						nullValue().as("st_ac_dt"),
						nullValue().as("end_act_dt"),
						nullValue().as("end_act_hm"),
						nullValue().as("end_ac_dt"),
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_st_act_qty"),
						value(false).as("rem_abort_flg"),
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_mfg_rem_qty"),
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T2.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T2.base_unit_cd,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						nullValue().as("act_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("mfg_act_sub_char1"),
						nullValue().as("mfg_act_sub_char2"),
						nullValue().as("mfg_act_sub_char3"),
						value(false).as("act_prnt_flg"),
						nullValue().as("act_prnt_tm"),
						nullValue().as("itm_yield"),
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_M5.loc_nm.as("mfg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T3.mfg_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_M5.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T2.mfg_inst_no,
						nullValue().as("div_seq"),
						S0_T2.po_d_no,
						nullValue().as("mfg_act_no"),
						S0_T3.unschd_act_flg,
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T2.mfg_aprv_sts_typ,
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						S0_T2.aprv_flg,
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						nullValue().as("mfg_act_upd_cntr"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.div_seq.eq(value(0)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.SAV.value())))
						.and(
							S0_T2.mfg_aprv_sts_typ.isNull()
							.or(S0_T2.mfg_aprv_sts_typ.neq(value(MSC_MFG_APRV_STS_TYP.INST_OPN.value())))
						)
						.and(
							S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.or(
								S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value()))
								.and(S0_T2.po_d_no.isNotNull())
							)
						)
						.and(
							S0_T2.base_unit_inst_qty.subtract(
								bracket(
									S0_T1.base_unit_mfg_qty.add(S0_T1.base_unit_mfg_abort_qty)
								)
							).gt(value(0))
						)
						.cutoff$and(S0_T2.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T2.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T2.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T2.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T2.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T2.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T3.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T3.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M5.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T3.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M5.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T3.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T3.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T3.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T3.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.lot_no.like(bind("inst_lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("inst_sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T2.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M12.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T3.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T2.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T2.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T2.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T3.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T2.mfg_inst_no.asc(),
						S0_T2.st_schd_tm.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.sno1.eq(S0_T4.sno1))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T3.sppl_cd.eq(S0_M4.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T3.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T3.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T3.strg_loc_cd.eq(S0_M7.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M7.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T3.strg_loc_cd.eq(S0_M8.loc_cd).and(S0_T3.strg_str_ln_cd.eq(S0_M8.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T3.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T3.wg_cd.eq(S0_M10.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.inst_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_M1.itm_typ.eq(S0_M30.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M30.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M30.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_M5.loc_grp_cd.eq(S0_M31.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(bracket(S0_M7.loc_grp_cd.eq(S0_M32.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M32.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
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
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M4.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M4.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M4.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M4.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M4.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M4.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M4.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M4.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M4.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M4.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1130_MST_MFG_ACT_REM_Query_S02
	 */
	static MCQueryPlan MSBCL1130_MST_MFG_ACT_REM_S02() {
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_WRK_SNO_R S0_T4 = MST_WRK_SNO_R.create("T4");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAVM_RD_LOC_R S0_M5 = MAVM_RD_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_WG_R S0_M10 = MAM_WG_R.create("M10");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MSVT_OPER_INST_PR_R S0_T8 = MSVT_OPER_INST_PR_R.create("T8");
		MST_OPER_INST_R S0_T9 = MST_OPER_INST_R.create("T9");
		MAM_OPER_R S0_M18 = MAM_OPER_R.create("M18");
		MAM_LOC_R S0_M20 = MAM_LOC_R.create("M20");
		MAM_STR_LN_R S0_M21 = MAM_STR_LN_R.create("M21");
		MAM_USR_R S0_M22 = MAM_USR_R.create("M22");
		MAM_ITM_TYP_D_R S0_M30 = MAM_ITM_TYP_D_R.create("M30");
		MAM_LOC_GRP_R S0_M31 = MAM_LOC_GRP_R.create("M31");
		MAM_LOC_GRP_R S0_M32 = MAM_LOC_GRP_R.create("M32");
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
				sql("MSBCL1130_MST_MFG_ACT_REM_Query_S02")
					.mainQuery()
					.select(
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						value(MSC_MFG_STS_TYP.ORD.value()).as("mfg_sts_typ"),
						S0_T9.oper_cd,
						S0_T9.disp_seq,
						S0_T9.oper_seq,
						nullValue().as("st_act_dt"),
						nullValue().as("st_act_hm"),
						nullValue().as("st_ac_dt"),
						nullValue().as("end_act_dt"),
						nullValue().as("end_act_hm"),
						nullValue().as("end_ac_dt"),
						nullValue().as("oper_unit_act_qty"),
						nullValue().as("oper_unit_schd_qty"),
						nullValue().as("oper_unit_rem_qty"),
						S0_T9.oper_std_qty,
						S0_T9.oper_conv_qty,
						S0_T9.oper_unit_conv_rnd_typ,
						S0_T9.oper_unit_dec_place,
						S0_T9.oper_unit_cd,
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_st_act_qty"),
						value(false).as("rem_abort_flg"),
						bracket(
							S0_T2.base_unit_inst_qty.subtract(S0_T1.base_unit_mfg_qty)
						).as("base_unit_mfg_rem_qty"),
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T2.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						value(0).as("base_unit_yield_qty"),
						value(0).as("base_unit_dfct_qty"),
						bracket(
							S0_T9.base_unit_qty.subtract(S0_T8.base_unit_qty)
						).as("base_unit_oper_schd_qty"),
						bracket(
							S0_T9.base_unit_qty.subtract(S0_T8.base_unit_qty)
						).as("base_unit_oper_rem_qty"),
						S0_T2.base_unit_cd,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						nullValue().as("act_usr_cd"),
						nullValue().as("act_usr_nm"),
						nullValue().as("act_dpt_cd"),
						nullValue().as("act_dpt_nm"),
						nullValue().as("act_rpt_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("mfg_act_sub_char1"),
						nullValue().as("mfg_act_sub_char2"),
						nullValue().as("mfg_act_sub_char3"),
						value(false).as("act_prnt_flg"),
						nullValue().as("act_prnt_tm"),
						nullValue().as("oper_act_intr_rmrks"),
						nullValue().as("oper_act_rpt_rmrks"),
						nullValue().as("oper_act_sub_char1"),
						nullValue().as("oper_act_sub_char2"),
						nullValue().as("oper_act_sub_char3"),
						nullValue().as("itm_yield"),
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						nullValue().as("oper_yield"),
						S0_T9.oper_lower_yield,
						S0_T9.oper_std_yield,
						S0_T9.oper_upper_yield,
						S0_T9.bkf_flg,
						S0_T9.bkf_flg.as("bkf_upd_flg"),
						S0_T9.wk_cost_calc_flg,
						S0_T9.wk_cost_calc_flg.as("wk_cost_upd_calc_flg"),
						trunc(
							S0_T9.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T9.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T9.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T9.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_M5.loc_nm.as("mfg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T3.mfg_str_ln_cd,
						S0_T9.oper_loc_cd,
						S0_T9.oper_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_M5.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T2.mfg_inst_no,
						nullValue().as("div_seq"),
						S0_T2.po_d_no,
						nullValue().as("mfg_act_no"),
						S0_T3.unschd_act_flg,
						S0_T9.oper_inst_no,
						nullValue().as("oper_act_no"),
						S0_T9.wip_rate,
						S0_T9.mes_flg,
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T9.usr_cd.as("oper_usr_cd"),
						S0_T9.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T2.mfg_aprv_sts_typ,
						nullValue().as("aprv_dt"),
						nullValue().as("aprv_tm"),
						S0_T2.aprv_flg,
						nullValue().as("aprv_dpt_cd"),
						nullValue().as("aprv_dpt_nm"),
						nullValue().as("aprv_usr_cd"),
						nullValue().as("aprv_usr_nm"),
						nullValue().as("aprv_rsn"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T9.ins_usr_id,
						S0_T9.ins_usr_nm,
						S0_T9.ins_func_id,
						S0_T9.ins_ts,
						S0_T9.upd_usr_id,
						S0_T9.upd_usr_nm,
						S0_T9.upd_func_id,
						S0_T9.upd_ts,
						S0_T9.upd_srv_req_no,
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						nullValue().as("mfg_act_upd_cntr"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T8.mfg_inst_no)
							)
						)
						.innerJoin(S0_T9).on(
							bracket(
								S0_T8.oper_inst_no.eq(S0_T9.oper_inst_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.div_seq.eq(value(0)))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T9.can_flg.eq(value(false)))
						.and(S0_T9.oper_abort_flg.eq(value(false)))
						.and(S0_T1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.SAV.value())))
						.and(
							S0_T2.mfg_aprv_sts_typ.isNull()
							.or(S0_T2.mfg_aprv_sts_typ.neq(value(MSC_MFG_APRV_STS_TYP.INST_OPN.value())))
						)
						.and(
							S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.INTNL.value()))
							.or(
								S0_T3.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.EXTNL.value()))
								.and(S0_T2.po_d_no.isNotNull())
							)
						)
						.and(
							S0_T2.base_unit_inst_qty.subtract(
								bracket(
									S0_T1.base_unit_mfg_qty.add(S0_T1.base_unit_mfg_abort_qty)
								)
							).gt(value(0))
						)
						.cutoff$and(S0_T9.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T9.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T9.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T9.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T2.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T2.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T3.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T3.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M5.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T3.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M5.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T3.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T3.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T3.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T9.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T9.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T9.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T3.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.lot_no.like(bind("inst_lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("inst_sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T2.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M12.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T9.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T3.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T2.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T9.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T2.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T2.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T9.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T3.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T2.mfg_inst_no.asc(),
						S0_T9.st_schd_tm.asc(),
						S0_T9.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.sno1.eq(S0_T4.sno1))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T3.sppl_cd.eq(S0_M4.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T3.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T3.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T3.strg_loc_cd.eq(S0_M7.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M7.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T3.strg_loc_cd.eq(S0_M8.loc_cd).and(S0_T3.strg_str_ln_cd.eq(S0_M8.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T3.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T3.wg_cd.eq(S0_M10.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.inst_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_T9.oper_cd.eq(S0_M18.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T9.oper_loc_cd.eq(S0_M20.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T9.oper_loc_cd.eq(S0_M21.loc_cd).and(S0_T9.oper_str_ln_cd.eq(S0_M21.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M21.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T9.usr_cd.eq(S0_M22.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_M1.itm_typ.eq(S0_M30.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M30.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M30.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_M5.loc_grp_cd.eq(S0_M31.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(bracket(S0_M7.loc_grp_cd.eq(S0_M32.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M32.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
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
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M4.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M4.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M4.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M4.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M4.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M4.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M4.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M4.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M4.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M4.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
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
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1130_MST_MFG_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1130_MST_MFG_ACT_S01() {
		MST_MFG_ACT_R S0_T6 = MST_MFG_ACT_R.create("T6");
		MST_MFG_ACT_REM_R S0_T7 = MST_MFG_ACT_REM_R.create("T7");
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_WRK_SNO_R S0_T4 = MST_WRK_SNO_R.create("T4");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_WG_R S0_M10 = MAM_WG_R.create("M10");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAVM_ITM_WG_R S0_M13 = MAVM_ITM_WG_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_USR_R S0_M16 = MAM_USR_R.create("M16");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		MAM_ITM_TYP_D_R S0_M30 = MAM_ITM_TYP_D_R.create("M30");
		MAM_LOC_GRP_R S0_M31 = MAM_LOC_GRP_R.create("M31");
		MAM_LOC_GRP_R S0_M32 = MAM_LOC_GRP_R.create("M32");
		MAVM_APRV_USR_R S0_M99 = MAVM_APRV_USR_R.create("M99");
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
		MAVM_RD_LOC_R S1_V1 = MAVM_RD_LOC_R.create("V1");
		MAVM_APRV_USR_R S2_V2 = MAVM_APRV_USR_R.create("V2");
		MST_OPER_ACT_R S3_OA1 = MST_OPER_ACT_R.create("OA1");
		MST_INPT_ACT_REM_R S4_IAR1 = MST_INPT_ACT_REM_R.create("IAR1");
		MST_WK_ACT_REM_R S5_WAR1 = MST_WK_ACT_REM_R.create("WAR1");
		MST_YIELD_ACT_R S6_YA1 = MST_YIELD_ACT_R.create("YA1");
		MST_OPER_ACT_R S7_T10 = MST_OPER_ACT_R.create("T10");
		MST_OPER_ACT_R S8_T10 = MST_OPER_ACT_R.create("T10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1130_MST_MFG_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T7.mfg_sts_typ,
						trunc(
							S0_T6.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T6.st_act_tm.as("st_act_hm"),
						S0_T6.st_ac_dt,
						trunc(
							S0_T6.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T6.end_act_tm.as("end_act_hm"),
						S0_T6.end_ac_dt,
						S0_T7.base_unit_mfg_qty.as("base_unit_st_act_qty"),
						bracket(
							cases()
								.when(S0_T1.base_unit_mfg_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rem_abort_flg"),
						S0_T7.base_unit_mfg_rem_qty,
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T2.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T6.base_unit_yield_qty,
						S0_T6.base_unit_dfct_qty,
						S0_T6.base_unit_cd,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T6.act_usr_cd,
						S0_T6.act_dpt_cd,
						S0_M15.dpt_nm.as("act_dpt_nm"),
						S0_T6.act_rpt_rmrks,
						S0_T6.intr_rmrks,
						S0_T6.sub_char1.as("mfg_act_sub_char1"),
						S0_T6.sub_char2.as("mfg_act_sub_char2"),
						S0_T6.sub_char3.as("mfg_act_sub_char3"),
						S0_T6.act_prnt_flg,
						S0_T6.act_prnt_tm,
						S0_T6.itm_yield,
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						trunc(
							S0_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T2.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T2.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_T3.mfg_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T6.mfg_inst_no,
						S0_T7.div_seq,
						S0_T2.po_d_no,
						S0_T6.mfg_act_no,
						S0_T3.unschd_act_flg,
						S0_T6.arr_purc_auto_reg_flg,
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T6.mfg_aprv_sts_typ,
						S0_T6.aprv_dt,
						S0_T6.aprv_tm,
						S0_T2.aprv_flg,
						S0_T6.aprv_dpt_cd,
						S0_M17.dpt_nm.as("aprv_dpt_nm"),
						S0_T6.aprv_usr_cd,
						S0_T6.aprv_rsn,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T6.ins_usr_id,
						S0_T6.ins_usr_nm,
						S0_T6.ins_func_id,
						S0_T6.ins_ts,
						S0_T6.upd_usr_id,
						S0_T6.upd_usr_nm,
						S0_T6.upd_func_id,
						S0_T6.upd_ts,
						S0_T6.upd_srv_req_no,
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						S0_T6.upd_cntr.as("mfg_act_upd_cntr"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T6
						.innerJoin(S0_T7).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T7.mfg_inst_no)
								.and(S0_T6.div_seq.eq(S0_T7.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T1.div_seq.eq(value(0)))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_T3.wg_cd.eq(S0_M13.wg_cd))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T6.act_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T6.st_ac_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T6.aprv_dpt_cd.eq(S0_M17.dpt_cd)
								.and(S0_T6.aprv_dt.between(S0_M17.st_dt, S0_M17.end_dt))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T7.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T7.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.and(
							bracket(
								bind("ope_val").eq(value(false))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S1_V1)
										.where(
											S0_T3.mfg_loc_cd.eq(S1_V1.loc_cd)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_V2)
										.where(
											S2_V2.aprv_role_cd.eq(S0_T2.mfg_aprv_role_cd)
											.and(S2_V2.usr_cd.eq(bind("tmp_aprv_usr")))
											.and(S2_V2.st_dt.lte(bind("tmp_today")))
											.and(
												S2_V2.end_dt.isNull()
												.or(S2_V2.end_dt.gte(bind("tmp_today")))
											)
										)
									)
								)
							)
						)
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S3_OA1)
								.where(
									S0_T6.mfg_act_no.eq(S3_OA1.mfg_act_no)
									.and(S3_OA1.bkf_not_ref_flg.eq(bind("tmp_bkf_not_ref_flg_str")))
								)
							)
						)
						.cutoff$and(
							bind("tmp_inpt_not_comp_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S4_IAR1)
									.where(
										S0_T6.mfg_inst_no.eq(S4_IAR1.mfg_inst_no)
										.and(S0_T6.div_seq.eq(S4_IAR1.div_seq))
										.and(S4_IAR1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value())))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_wk_not_comp_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S5_WAR1)
									.where(
										S0_T6.mfg_inst_no.eq(S5_WAR1.mfg_inst_no)
										.and(S0_T6.div_seq.eq(S5_WAR1.div_seq))
										.and(S5_WAR1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value())))
									)
								)
							)
						)
						.cutoff$and(S0_T6.act_prnt_flg.eq(bind("tmp_act_prnt_flg_str")))
						.cutoff$and(S0_M1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_str")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S6_YA1)
								.where(
									S0_T6.mfg_act_no.eq(S6_YA1.mfg_act_no)
									.and(S6_YA1.stk_lst_prnt_flg.eq(bind("tmp_stk_lst_issue_flg_str")))
								)
							)
						)
						.cutoff$and(S0_T2.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T2.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T2.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T2.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T6.st_act_tm.gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T6.st_act_tm.lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T6.end_act_tm.gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T6.end_act_tm.lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T6.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T6.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T6.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T6.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T2.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T2.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T6.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T6.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T3.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T3.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_T3.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T3.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T3.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T3.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T3.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T6.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.lot_no.like(bind("inst_lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("inst_sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T2.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M12.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T6.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T6.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M15.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T6.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T6.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M17.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T3.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T6.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T6.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T2.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T2.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T6.act_rpt_rmrks.like(bind("act_rpt_rmrks")))
						.cutoff$and(S0_T6.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T6.sub_char1.like(bind("mfg_act_sub_char1")))
						.cutoff$and(S0_T6.sub_char2.like(bind("mfg_act_sub_char2")))
						.cutoff$and(S0_T6.sub_char3.like(bind("mfg_act_sub_char3")))
						.cutoff$and(
							bracket(
								bracket(
									bind("tmp_mes_tgt_flg_str").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value(true))
											.from(S7_T10)
											.where(
												S7_T10.mes_flg.eq(value(true))
												.and(S7_T10.mfg_act_no.eq(S0_T6.mfg_act_no))
												.and(S7_T10.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no))
											)
										)
									)
								)
								.or(
									bind("tmp_mes_tgt_flg_str").eq(value(false))
									.and(
										notExists(
											subQuery()
											.select(value(true))
											.from(S8_T10)
											.where(
												S8_T10.mes_flg.eq(value(true))
												.and(S8_T10.mfg_act_no.eq(S0_T6.mfg_act_no))
												.and(S8_T10.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no))
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T3.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T6.mfg_inst_no.asc(),
						S0_T2.st_schd_tm.asc(),
						S0_T7.div_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.sno1.eq(S0_T4.sno1))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T3.sppl_cd.eq(S0_M4.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_loc_grp_nm", "mfg_loc_grp_cd", "mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_grp_cd.like(bind("mfg_loc_grp_cd"))).cutoff$and(S0_M5.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T3.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T3.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T3.strg_loc_cd.eq(S0_M7.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M7.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T3.strg_loc_cd.eq(S0_M8.loc_cd).and(S0_T3.strg_str_ln_cd.eq(S0_M8.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T3.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T3.wg_cd.eq(S0_M10.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.inst_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T6.act_usr_cd.eq(S0_M14.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T6.aprv_usr_cd.eq(S0_M16.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_M1.itm_typ.eq(S0_M30.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M30.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M30.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_M5.loc_grp_cd.eq(S0_M31.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(bracket(S0_M7.loc_grp_cd.eq(S0_M32.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M32.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("tmp_today", "tmp_aprv_usr"))
					.view(v -> v.innerJoin(S0_M99).on(S0_T2.mfg_aprv_role_cd.eq(S0_M99.aprv_role_cd).and(bind("tmp_today").between(S0_M99.st_dt, S0_M99.end_dt)).and(bind("tmp_aprv_usr").eq(S0_M99.usr_cd)))),
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
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M4.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M4.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M4.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M4.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M4.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M4.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M4.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M4.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M4.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M4.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
							r.setBooleanNE("mfg_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("mfg_loc_grp_cd", m.loc_grp_cd());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL1130_MST_MFG_ACT_Query_S02
	 */
	static MCQueryPlan MSBCL1130_MST_MFG_ACT_S02() {
		MST_MFG_ACT_R S0_T6 = MST_MFG_ACT_R.create("T6");
		MST_MFG_ACT_REM_R S0_T7 = MST_MFG_ACT_REM_R.create("T7");
		MST_MFG_ACT_REM_R S0_T1 = MST_MFG_ACT_REM_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MST_WRK_SNO_R S0_T4 = MST_WRK_SNO_R.create("T4");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_BP_R S0_M4 = MAM_BP_R.create("M4");
		MAVM_RD_LOC_R S0_M5 = MAVM_RD_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_STR_LN_R S0_M8 = MAM_STR_LN_R.create("M8");
		MAM_SITE_R S0_M9 = MAM_SITE_R.create("M9");
		MAM_WG_R S0_M10 = MAM_WG_R.create("M10");
		MAM_USR_R S0_M11 = MAM_USR_R.create("M11");
		MAM_DPT_R S0_M12 = MAM_DPT_R.create("M12");
		MAVM_ITM_WG_R S0_M13 = MAVM_ITM_WG_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_USR_R S0_M16 = MAM_USR_R.create("M16");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		MST_OPER_ACT_REM_R S0_T11 = MST_OPER_ACT_REM_R.create("T11");
		MST_OPER_ACT_R S0_T10 = MST_OPER_ACT_R.create("T10");
		MST_OPER_INST_R S0_T12 = MST_OPER_INST_R.create("T12");
		MST_OPER_INST_R S0_T9 = MST_OPER_INST_R.create("T9");
		MAM_OPER_R S0_M18 = MAM_OPER_R.create("M18");
		MAM_LOC_R S0_M20 = MAM_LOC_R.create("M20");
		MAM_STR_LN_R S0_M21 = MAM_STR_LN_R.create("M21");
		MAM_USR_R S0_M22 = MAM_USR_R.create("M22");
		MAM_UNIT_R S0_M23 = MAM_UNIT_R.create("M23");
		MAM_ITM_TYP_D_R S0_M30 = MAM_ITM_TYP_D_R.create("M30");
		MAM_LOC_GRP_R S0_M31 = MAM_LOC_GRP_R.create("M31");
		MAM_LOC_GRP_R S0_M32 = MAM_LOC_GRP_R.create("M32");
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
		MST_INPT_ACT_REM_R S1_IAR1 = MST_INPT_ACT_REM_R.create("IAR1");
		MST_WK_ACT_REM_R S2_WAR1 = MST_WK_ACT_REM_R.create("WAR1");
		MST_YIELD_ACT_R S3_YA1 = MST_YIELD_ACT_R.create("YA1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1130_MST_MFG_ACT_Query_S02")
					.mainQuery()
					.select(
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T11.mfg_sts_typ,
						S0_T9.oper_cd,
						nvl(
							S0_T10.disp_seq,
							S0_T9.disp_seq
							).as("disp_seq"),
						S0_T9.oper_seq,
						trunc(
							S0_T10.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T10.st_act_tm.as("st_act_hm"),
						S0_T6.st_ac_dt,
						trunc(
							S0_T10.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T10.end_act_tm.as("end_act_hm"),
						S0_T6.end_ac_dt,
						S0_T10.oper_unit_qty.as("oper_unit_act_qty"),
						nullValue().as("oper_unit_schd_qty"),
						nullValue().as("oper_unit_rem_qty"),
						S0_T9.oper_std_qty,
						S0_T9.oper_conv_qty,
						S0_T9.oper_unit_conv_rnd_typ,
						S0_T9.oper_unit_dec_place,
						nvl(
							S0_T10.oper_unit_cd,
							S0_T9.oper_unit_cd
							).as("oper_unit_cd"),
						S0_T7.base_unit_mfg_qty.as("base_unit_st_act_qty"),
						bracket(
							cases()
								.when(S0_T1.base_unit_mfg_abort_qty.gt(value(0)))
									.then(value(true))
								.otherwise(value(false))
						).as("rem_abort_flg"),
						S0_T7.base_unit_mfg_rem_qty,
						S0_T2.base_unit_inst_qty.as("base_unit_mfg_inst_qty"),
						S0_T2.base_unit_yield_qty.as("base_unit_yield_schd_qty"),
						S0_T6.base_unit_yield_qty,
						S0_T6.base_unit_dfct_qty,
						S0_T11.base_unit_qty.as("base_unit_oper_schd_qty"),
						S0_T11.base_unit_rem_qty.as("base_unit_oper_rem_qty"),
						S0_T6.base_unit_cd,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_T3.lot_no.as("inst_lot_no"),
						S0_T3.sublot_no.as("inst_sublot_no"),
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T6.act_usr_cd,
						S0_T6.act_dpt_cd,
						S0_M15.dpt_nm.as("act_dpt_nm"),
						S0_T6.act_rpt_rmrks,
						S0_T6.intr_rmrks,
						S0_T6.sub_char1.as("mfg_act_sub_char1"),
						S0_T6.sub_char2.as("mfg_act_sub_char2"),
						S0_T6.sub_char3.as("mfg_act_sub_char3"),
						S0_T6.act_prnt_flg,
						S0_T6.act_prnt_tm,
						S0_T10.intr_rmrks.as("oper_act_intr_rmrks"),
						S0_T10.act_rpt_rmrks.as("oper_act_rpt_rmrks"),
						S0_T10.sub_char1.as("oper_act_sub_char1"),
						S0_T10.sub_char2.as("oper_act_sub_char2"),
						S0_T10.sub_char3.as("oper_act_sub_char3"),
						S0_T6.itm_yield,
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						S0_T10.oper_yield,
						S0_T9.oper_lower_yield,
						S0_T9.oper_std_yield,
						S0_T9.oper_upper_yield,
						S0_T9.bkf_flg,
						S0_T10.bkf_ctl_flg.as("bkf_upd_flg"),
						S0_T9.wk_cost_calc_flg,
						S0_T10.wk_cost_calc_ctl_flg.as("wk_cost_upd_calc_flg"),
						trunc(
							S0_T9.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T9.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T9.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T9.end_schd_tm.as("end_schd_hm"),
						S0_T3.mfg_mtd_typ,
						S0_T3.sppl_cd,
						S0_T3.mfg_loc_cd,
						S0_M5.loc_nm.as("mfg_loc_nm"),
						S0_M5.str_ln_tgt_flg.as("mfg_str_ln_tgt_flg"),
						S0_T3.mfg_str_ln_cd,
						S0_T9.oper_loc_cd,
						S0_T9.oper_str_ln_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_M5.loc_grp_cd.as("mfg_loc_grp_cd"),
						S0_T3.site_cd,
						S0_T3.wg_cd,
						S0_T3.bom_ptn,
						S0_T3.oper_ptn,
						S0_T3.itm_ord_no,
						S0_T6.mfg_inst_no,
						S0_T7.div_seq,
						S0_T2.po_d_no,
						S0_T6.mfg_act_no,
						S0_T3.unschd_act_flg,
						S0_T9.oper_inst_no,
						S0_T10.oper_act_no,
						S0_T9.wip_rate,
						S0_T6.arr_purc_auto_reg_flg,
						nvl(
							S0_T10.mes_flg,
							S0_T9.mes_flg
						).as("mes_flg"),
						S0_T10.ext_sys_cd,
						S0_T10.ext_oper_act_no,
						S0_T10.if_auto_reg_flg,
						cases()
							.when(
								S0_T11.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value()))
								.and(S0_T10.end_act_tm.isNotNull())
							)
								.then(value(true))
							.otherwise(value(false)).as("not_cmpl_flg"),
						S0_T2.inst_dt,
						S0_T2.inst_usr_cd,
						S0_T2.inst_dpt_cd,
						S0_M12.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.inst_po_cnt_rmrks,
						S0_T9.usr_cd.as("oper_usr_cd"),
						S0_T9.inst_rpt_rmrks.as("oper_inst_rpt_rmrks"),
						S0_T6.mfg_aprv_sts_typ,
						S0_T6.aprv_dt,
						S0_T6.aprv_tm,
						S0_T2.aprv_flg,
						S0_T6.aprv_dpt_cd,
						S0_M17.dpt_nm.as("aprv_dpt_nm"),
						S0_T6.aprv_usr_cd,
						S0_T6.aprv_rsn,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						nvl(
							S0_T10.ins_usr_id,
							S0_T6.ins_usr_id
						).as("ins_usr_id"),
						nvl(
							S0_T10.ins_usr_nm,
							S0_T6.ins_usr_nm
						).as("ins_usr_nm"),
						nvl(
							S0_T10.ins_func_id,
							S0_T6.ins_func_id
						).as("ins_func_id"),
						nvl(
							S0_T10.ins_ts,
							S0_T6.ins_ts
						).as("ins_ts"),
						nvl(
							S0_T10.upd_usr_id,
							S0_T6.upd_usr_id
						).as("upd_usr_id"),
						nvl(
							S0_T10.upd_usr_nm,
							S0_T6.upd_usr_nm
						).as("upd_usr_nm"),
						nvl(
							S0_T10.upd_func_id,
							S0_T6.upd_func_id
						).as("upd_func_id"),
						nvl(
							S0_T10.upd_ts,
							S0_T6.upd_ts
						).as("upd_ts"),
						nvl(
							S0_T10.upd_srv_req_no,
							S0_T6.upd_srv_req_no
						).as("upd_srv_req_no"),
						S0_T2.upd_cntr.as("mfg_inst_upd_cntr"),
						S0_T1.upd_cntr.as("mfg_inst_pr_upd_cntr"),
						S0_T6.upd_cntr.as("mfg_act_upd_cntr"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T6
						.innerJoin(S0_T7).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T7.mfg_inst_no)
								.and(S0_T6.div_seq.eq(S0_T7.div_seq))
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_T1.div_seq.eq(value(0)))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T2.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.itm_mfg_inst_no.eq(S0_T3.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M2.sno1))
								.and(S0_T3.sno2.eq(S0_M2.sno2))
								.and(S0_T3.sno3.eq(S0_M2.sno3))
								.and(S0_T3.sno4.eq(S0_M2.sno4))
							)
						)
						.innerJoin(S0_M5).on(
							bracket(
								S0_T3.mfg_loc_cd.eq(S0_M5.loc_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M12.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M12.st_dt, S0_M12.end_dt))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_T3.wg_cd.eq(S0_M13.wg_cd))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T6.act_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T6.st_ac_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T6.aprv_dpt_cd.eq(S0_M17.dpt_cd)
								.and(S0_T6.aprv_dt.between(S0_M17.st_dt, S0_M17.end_dt))
							)
						)
						.innerJoin(S0_T11).on(
							bracket(
								S0_T6.mfg_inst_no.eq(S0_T11.mfg_inst_no)
								.and(S0_T6.div_seq.eq(S0_T11.div_seq))
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T11.oper_inst_no.eq(S0_T10.oper_inst_no)
								.and(S0_T11.div_seq.eq(S0_T10.div_seq))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
									S0_T11.oper_inst_no.eq(S0_T12.oper_inst_no)
								)
							)
						.innerJoin(S0_T9).on(
							bracket(
								S0_T11.oper_inst_no.eq(S0_T9.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_T9.base_unit_cd.eq(S0_M23.unit_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T11.mfg_sts_typ.eq(bind("tmp_sts_ord_str")))
							.cutoff$or(S0_T11.mfg_sts_typ.eq(bind("tmp_sts_stt_str")))
							.cutoff$or(S0_T11.mfg_sts_typ.eq(bind("tmp_sts_cmpl_str")))
						)
						.cutoff$and(S0_T10.bkf_not_ref_flg.eq(bind("tmp_bkf_not_ref_flg_str")))
						.cutoff$and(
							bind("tmp_inpt_not_comp_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S1_IAR1)
									.where(
										S0_T10.oper_inst_no.eq(S1_IAR1.oper_inst_no)
										.and(S0_T6.div_seq.eq(S1_IAR1.div_seq))
										.and(S1_IAR1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value())))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_wk_not_comp_flg_str").eq(value(true))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_WAR1)
									.where(
										S0_T10.oper_inst_no.eq(S2_WAR1.oper_inst_no)
										.and(S0_T6.div_seq.eq(S2_WAR1.div_seq))
										.and(S2_WAR1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value())))
									)
								)
							)
						)
						.cutoff$and(S0_T6.act_prnt_flg.eq(bind("tmp_act_prnt_flg_str")))
						.cutoff$and(S0_M1.stk_lst_flg.eq(bind("tmp_stk_lst_flg_str")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S3_YA1)
								.where(
									S0_T6.mfg_act_no.eq(S3_YA1.mfg_act_no)
									.and(S3_YA1.stk_lst_prnt_flg.eq(bind("tmp_stk_lst_issue_flg_str")))
								)
							)
						)
						.cutoff$and(S0_T9.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T9.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T9.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T9.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T10.st_act_tm.gte(bind("st_act_hm_fr")))
						.cutoff$and(S0_T10.st_act_tm.lte(bind("st_act_hm_to")))
						.cutoff$and(S0_T10.end_act_tm.gte(bind("end_act_hm_fr")))
						.cutoff$and(S0_T10.end_act_tm.lte(bind("end_act_hm_to")))
						.cutoff$and(S0_T6.st_ac_dt.gte(bind("st_ac_dt_fr")))
						.cutoff$and(S0_T6.st_ac_dt.lte(bind("st_ac_dt_to")))
						.cutoff$and(S0_T6.end_ac_dt.gte(bind("end_ac_dt_fr")))
						.cutoff$and(S0_T6.end_ac_dt.lte(bind("end_ac_dt_to")))
						.cutoff$and(S0_T2.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T2.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T6.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T6.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T3.mfg_mtd_typ.like(bind("mfg_mtd_typ")))
						.cutoff$and(S0_T3.site_cd.like(bind("mfg_loc_site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.wg_cd.like(bind("mfg_loc_wg_cd")))
						.cutoff$and(S0_M5.loc_grp_cd.like(bind("mfg_loc_grp_cd")))
						.cutoff$and(S0_T3.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_M5.loc_nm.like(bind("mfg_loc_nm")))
						.cutoff$and(S0_T3.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T3.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T3.strg_str_ln_cd.like(bind("strg_str_ln_cd")))
						.cutoff$and(S0_T9.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T9.oper_loc_cd.like(bind("oper_loc_cd")))
						.cutoff$and(S0_T9.oper_str_ln_cd.like(bind("oper_str_ln_cd")))
						.cutoff$and(S0_T3.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T6.mfg_aprv_sts_typ.like(bind("mfg_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T3.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T3.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T3.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T3.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.lot_no.like(bind("inst_lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("inst_sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T2.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M12.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T6.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T6.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M15.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T9.usr_cd.like(bind("oper_usr_cd")))
						.cutoff$and(S0_T6.aprv_usr_cd.like(bind("aprv_usr_cd")))
						.cutoff$and(S0_T6.aprv_dpt_cd.like(bind("aprv_dpt_cd")))
						.cutoff$and(S0_M17.dpt_nm.like(bind("aprv_dpt_nm")))
						.cutoff$and(S0_T3.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T6.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T2.po_d_no.like(bind("po_d_no")))
						.cutoff$and(S0_T9.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T6.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T10.oper_act_no.like(bind("oper_act_no")))
						.cutoff$and(S0_T2.inst_rpt_rmrks.like(bind("inst_rpt_rmrks")))
						.cutoff$and(S0_T2.inst_po_cnt_rmrks.like(bind("inst_po_cnt_rmrks")))
						.cutoff$and(S0_T9.inst_rpt_rmrks.like(bind("oper_inst_rpt_rmrks")))
						.cutoff$and(S0_T6.act_rpt_rmrks.like(bind("act_rpt_rmrks")))
						.cutoff$and(S0_T6.intr_rmrks.like(bind("act_intr_rmrks")))
						.cutoff$and(S0_T6.sub_char1.like(bind("mfg_act_sub_char1")))
						.cutoff$and(S0_T6.sub_char2.like(bind("mfg_act_sub_char2")))
						.cutoff$and(S0_T6.sub_char3.like(bind("mfg_act_sub_char3")))
						.cutoff$and(S0_T10.intr_rmrks.like(bind("oper_act_intr_rmrks")))
						.cutoff$and(S0_T10.act_rpt_rmrks.like(bind("oper_act_rpt_rmrks")))
						.cutoff$and(S0_T10.sub_char1.like(bind("oper_act_sub_char1")))
						.cutoff$and(S0_T10.sub_char2.like(bind("oper_act_sub_char2")))
						.cutoff$and(S0_T10.sub_char3.like(bind("oper_act_sub_char3")))
						.cutoff$and(S0_T10.ext_oper_act_no.like(bind("ext_oper_act_no")))
						.cutoff$and(
							nvl(
								S0_T10.mes_flg,
								S0_T9.mes_flg
							).eq(bind("tmp_mes_tgt_flg_str"))
						)
						.cutoff$and(S0_T3.unschd_act_flg.eq(bind("tmp_unschd_act_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T6.mfg_inst_no.asc(),
						S0_T2.st_schd_tm.asc(),
						S0_T7.div_seq.asc(),
						nvl(S0_T10.disp_seq, S0_T12.disp_seq).asc(),
						S0_T10.oper_act_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_nm", "wrk_no"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.sno1.eq(S0_T4.sno1))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no")))),
				when(boundOr("wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T4.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T3.sppl_cd.eq(S0_M4.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T3.mfg_loc_cd.eq(S0_M6.loc_cd).and(S0_T3.mfg_str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("strg_loc_grp_nm", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T3.strg_loc_cd.eq(S0_M7.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_M7.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T3.strg_loc_cd.eq(S0_M8.loc_cd).and(S0_T3.strg_str_ln_cd.eq(S0_M8.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M8.str_ln_nm.like(bind("strg_str_ln_nm")))),
				when(boundOr("mfg_loc_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T3.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.site_nm.like(bind("mfg_loc_site_nm")))),
				when(boundOr("mfg_loc_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T3.wg_cd.eq(S0_M10.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.wg_nm.like(bind("mfg_loc_wg_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.inst_usr_cd.eq(S0_M11.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T6.act_usr_cd.eq(S0_M14.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("aprv_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T6.aprv_usr_cd.eq(S0_M16.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.usr_nm.like(bind("aprv_usr_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_T9.oper_cd.eq(S0_M18.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.oper_nm.like(bind("oper_nm")))),
				when(boundOr("oper_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T9.oper_loc_cd.eq(S0_M20.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.loc_nm.like(bind("oper_loc_nm")))),
				when(boundOr("oper_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_T9.oper_loc_cd.eq(S0_M21.loc_cd).and(S0_T9.oper_str_ln_cd.eq(S0_M21.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M21.str_ln_nm.like(bind("oper_str_ln_nm")))),
				when(boundOr("oper_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T9.usr_cd.eq(S0_M22.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.usr_nm.like(bind("oper_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M30).on(bracket(S0_M1.itm_typ.eq(S0_M30.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M30.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M30.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M31).on(bracket(S0_M5.loc_grp_cd.eq(S0_M31.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M31.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(bracket(S0_M7.loc_grp_cd.eq(S0_M32.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M32.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
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
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M4.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M4.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M4.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M4.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M4.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M4.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M4.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M4.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M4.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M4.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M4.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M4.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
					}),
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
							r.getStringNE("act_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("act_usr_nm", m.usr_nm());
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
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
							r.setBooleanNE("oper_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
							r.getStringNE("oper_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_usr_nm", m.usr_nm());
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
	
	/**
	 * -- MSBCL1130_MST_YIELD_ACT_REM_Query_S01
	 */
	static MCQueryPlan MSBCL1130_MST_YIELD_ACT_REM_S01() {
		MSW_MFG_ACT_REM_KEY_R S0_W1 = MSW_MFG_ACT_REM_KEY_R.create("W1");
		MST_YIELD_ACT_REM_R S0_T1 = MST_YIELD_ACT_REM_R.create("T1");
		MST_YIELD_SCHD_R S0_T2 = MST_YIELD_SCHD_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M8 = MAM_SUNDRY_ITM_R.create("M8");
		MSW_YIELD_ACT_REM_KEY_R S1_KEY = MSW_YIELD_ACT_REM_KEY_R.create("KEY");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1130_MST_YIELD_ACT_REM_Query_S01")
					.mainQuery()
					.select(
						S0_T2.oper_inst_no,
						S0_T1.mfg_inst_no,
						bracket(
							cases()
								.when(S0_T1.div_seq.eq(value(0)))
									.then(nullValue())
								.otherwise(S0_T1.div_seq)
						).as("div_seq"),
						S0_T2.yield_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M8.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						nullValue().as("trd_unit_yield_act_qty"),
						S0_T2.trd_unit_cd,
						nullValue().as("base_unit_yield_act_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_schd_qty"),
						cases()
							.when(S0_T1.div_seq.eq(value(0)))
								.then(S0_T2.base_unit_yield_qty.subtract(S0_T1.base_unit_yield_qty))
							.otherwise(S0_T1.base_unit_yield_qty).as("base_unit_yield_rem_qty"),
						S0_T2.base_unit_cd,
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						nullValue().as("act_dt"),
						nullValue().as("act_hm"),
						nullValue().as("ac_dt"),
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						value(false).as("same_lot_flg"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						nullValue().as("yield_rsn_cd"),
						nullValue().as("yield_rsn_nm"),
						value(MAC_QUALITY_TYP.GOOD.value()).as("quality_typ"),
						nullValue().as("gd_cd"),
						nullValue().as("gd_nm"),
						S0_T2.strg_loc_cd,
						S0_T2.strg_str_ln_cd,
						nullValue().as("yield_rate"),
						S0_T2.inst_rpt_rmrks,
						S0_T2.insp_cnt_rmrks,
						nullValue().as("yield_act_intr_rmrks"),
						nullValue().as("yield_act_rpt_rmrks"),
						nullValue().as("trd_rmrks"),
						nullValue().as("yield_act_sub_char1"),
						nullValue().as("yield_act_sub_char2"),
						nullValue().as("yield_act_sub_char3"),
						S0_T2.yield_schd_no,
						nullValue().as("yield_act_no"),
						S0_T1.stk_lst_prnt_flg,
						nullValue().as("mfg_sts_typ"),
						S0_T2.disp_seq,
						value(0).as("base_unit_yield_act_qty_bef")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.mfg_inst_no.eq(S0_T1.mfg_inst_no)
								.and(S0_W1.div_seq.eq(S0_T1.div_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.yield_schd_no.eq(S0_T2.yield_schd_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M8.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M8.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M8.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M8.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M8.sno1))
								.and(S0_T2.sno2.eq(S0_M8.sno2))
								.and(S0_T2.sno3.eq(S0_M8.sno3))
								.and(S0_T2.sno4.eq(S0_M8.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(S1_KEY.yield_schd_no)
								.from(S1_KEY)
								.where(
									S0_T1.yield_schd_no.eq(S1_KEY.yield_schd_no)
									.and(S0_T1.div_seq.eq(S1_KEY.div_seq))
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
	 * -- MSBCL1130_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL1130_MST_YIELD_ACT_S01() {
		MSW_MFG_ACT_KEY_R S0_W1 = MSW_MFG_ACT_KEY_R.create("W1");
		MST_YIELD_ACT_R S0_T3 = MST_YIELD_ACT_R.create("T3");
		MSW_OPER_ACT_KEY_R S0_W2 = MSW_OPER_ACT_KEY_R.create("W2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL1130_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T3.oper_act_no,
						S0_T3.mfg_act_no,
						S0_T3.yield_typ,
						S0_T3.itm_cd.as("itm_cd"),
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						nvl(
							S0_M10.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T3.trd_unit_qty.as("trd_unit_yield_act_qty"),
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty"),
						S0_T3.base_unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_conv_rnd_typ"),
						trunc(
							S0_T3.act_tm,
							MCDateFmt.DD
						).as("act_dt"),
						S0_T3.act_tm.as("act_hm"),
						S0_T3.ac_dt,
						S0_M1.lot_mng_typ,
						S0_M1.lot_no_typ,
						S0_M1.lot_no_ptn_cd,
						S0_M1.sublot_mng_typ,
						S0_M1.sublot_no_typ,
						S0_M1.sublot_no_ptn_cd,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.lot_ctl_flg.as("same_lot_flg"),
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.yield_rsn_cd,
						S0_T3.quality_typ,
						S0_T3.gd_cd,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd.as("strg_str_ln_cd"),
						S0_T3.yield_rate,
						S0_T3.insp_cnt_rmrks,
						S0_T3.intr_rmrks.as("yield_act_intr_rmrks"),
						S0_T3.act_rpt_rmrks.as("yield_act_rpt_rmrks"),
						S0_T3.trd_rmrks,
						S0_T3.sub_char1.as("yield_act_sub_char1"),
						S0_T3.sub_char2.as("yield_act_sub_char2"),
						S0_T3.sub_char3.as("yield_act_sub_char3"),
						S0_T3.yield_act_no,
						S0_T3.mes_flg,
						S0_T3.ext_sys_cd,
						S0_T3.ext_yield_act_no,
						// this field is appended by sql coverter.
						S0_T3.yield_schd_no.as("join_yield_schd_no_"),
						// this field is appended by sql coverter.
						S0_T3.div_seq.as("join_div_seq_"),
						S0_T3.stk_lst_prnt_flg,
						S0_T3.base_unit_qty.as("base_unit_yield_act_qty_bef")
					)
					.from(
						S0_W1
						.innerJoin(S0_T3).on(
							bracket(
								S0_W1.mfg_act_no.eq(S0_T3.mfg_act_no)
							)
						)
						.leftOuterJoin(S0_W2).on(
							bracket(
								S0_T3.oper_act_no.eq(S0_W2.oper_act_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M10.sno1))
								.and(S0_T3.sno2.eq(S0_M10.sno2))
								.and(S0_T3.sno3.eq(S0_M10.sno3))
								.and(S0_T3.sno4.eq(S0_M10.sno4))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_YIELD_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_yield_schd_no_")
						))
						.addSelect(m -> toArray(
							m.disp_seq,
							m.inst_rpt_rmrks,
							m.oper_inst_no,
							m.yield_schd_no
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_inst_no", m.oper_inst_no());
							r.setStringNE("inst_rpt_rmrks", m.inst_rpt_rmrks());
							r.setStringNE("yield_schd_no", m.yield_schd_no());
							r.setNumberNE("disp_seq", m.disp_seq());
					}),
					j -> j
						.add(MST_YIELD_ACT_REM_R.class, r -> toCondition(
							r.getStringNE("join_yield_schd_no_"),
							r.getNumberNE("join_div_seq_")
						))
						.addSelect(m -> toArray(
							m.base_unit_yield_qty,
							m.base_unit_yield_rem_qty,
							m.div_seq,
							m.mfg_inst_no,
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_inst_no", m.mfg_inst_no());
							r.setNumberNE("div_seq", m.div_seq());
							r.setNumberNE("base_unit_yield_schd_qty", m.base_unit_yield_qty());
							r.setNumberNE("base_unit_yield_rem_qty", m.base_unit_yield_rem_qty());
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_conv_rnd_typ", m.rnd_typ());
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setBooleanNE("strg_str_ln_tgt_flg", m.str_ln_tgt_flg());
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