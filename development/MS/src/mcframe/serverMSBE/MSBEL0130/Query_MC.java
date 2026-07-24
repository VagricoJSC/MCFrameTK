package mcframe.serverMSBE.MSBEL0130;

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
	 * -- MSBEL0130_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBEL0130_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MST_DLV_INST_RCPT_R S0_T6 = MST_DLV_INST_RCPT_R.create("T6");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_SITE_R S0_M3 = MAM_SITE_R.create("M3");
		MAM_LG_GRP_R S0_M4 = MAM_LG_GRP_R.create("M4");
		MAM_ALLOC_GRP_R S0_M5 = MAM_ALLOC_GRP_R.create("M5");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_STK_GD_R S0_M7 = MAM_STK_GD_R.create("M7");
		MAM_UNIT_R S0_M8 = MAM_UNIT_R.create("M8");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MSVM_DLV_ID_R S0_M12 = MSVM_DLV_ID_R.create("M12");
		MSVM_SHIP_TO_ID_R S0_M14 = MSVM_SHIP_TO_ID_R.create("M14");
		MAM_USR_R S0_M15 = MAM_USR_R.create("M15");
		MAM_DPT_R S0_M16 = MAM_DPT_R.create("M16");
		MAM_BP_R S0_M17 = MAM_BP_R.create("M17");
		MAM_ITM_TYP_D_R S0_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAM_STR_LN_R S0_M19 = MAM_STR_LN_R.create("M19");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAVM_RD_LOC_R S0_DACL = MAVM_RD_LOC_R.create("DACL");
		MAVM_RD_LG_GRP_R S0_DACLG = MAVM_RD_LG_GRP_R.create("DACLG");
		MAVM_RD_ALLOC_GRP_R S0_DACAG = MAVM_RD_ALLOC_GRP_R.create("DACAG");
		MAM_ITM_GRP_R S0_MMI1 = MAM_ITM_GRP_R.create("MMI1");
		MAM_ITM_GRP_R S0_MMI2 = MAM_ITM_GRP_R.create("MMI2");
		MAM_ITM_GRP_R S0_MMI3 = MAM_ITM_GRP_R.create("MMI3");
		MAM_ITM_GRP_R S0_MMI4 = MAM_ITM_GRP_R.create("MMI4");
		MAM_ITM_GRP_R S0_MMI5 = MAM_ITM_GRP_R.create("MMI5");
		MAM_ITM_GRP_R S0_MMI6 = MAM_ITM_GRP_R.create("MMI6");
		MAM_ITM_GRP_R S0_MMI7 = MAM_ITM_GRP_R.create("MMI7");
		MAM_ITM_GRP_R S0_MMI8 = MAM_ITM_GRP_R.create("MMI8");
		MAM_ITM_GRP_R S0_MMI9 = MAM_ITM_GRP_R.create("MMI9");
		MAM_ITM_GRP_R S0_MMI10 = MAM_ITM_GRP_R.create("MMI10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0130_MST_SHIP_PR_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_d_no,
						S0_T1.xfr_schd_no,
						S0_T1.alloc_scope_typ,
						S0_T1.not_lg_mix_flg,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_T2.ship_fr_lg_grp_cd,
						S0_T1.alloc_grp_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.ver_no,
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M20.itm_nm
							),
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_T3.gd_cd,
						S0_T3.pack_unit_cd,
						S0_T3.base_unit_cd,
						S0_T3.pack_unit_qty,
						S0_T3.base_unit_qty,
						S0_T1.dlv_id_typ,
						nvl(
							S0_T2.dlv_cd,
							S0_T1.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T2.dlv_cd,
							nvl(
								S0_T2.dlv_nm,
								S0_M21.bp_nm
							),
							nvl(
								S0_T1.dlv_id_nm,
								S0_M12.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T1.cst_cd,
						nvl2(
							S0_T2.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T1.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T2.tdlv_cd,
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T2.dlv_cd,
									nullValue()
								)
							),
							S0_T1.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T2.tdlv_cd,
							nvl(
								S0_T2.tdlv_nm,
								S0_M22.bp_nm
							),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T2.dlv_cd,
									nvl(
										S0_T2.dlv_nm,
										S0_M21.bp_nm
									),
									nvl(
										S0_T1.ship_to_id_nm,
										S0_M14.ship_to_id_nm
									)
								),
								nvl(
									S0_T1.ship_to_id_nm,
									S0_M14.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T2.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T2.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T2.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T2.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T2.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T2.dlv_schd_tm.as("dlv_schd_hm"),
						trunc(
							S0_T2.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T2.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						trunc(
							S0_T6.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_T6.dlv_rqst_tm.as("dlv_inst_hm"),
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M16.dpt_nm.as("rqst_dpt_nm"),
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T1.ship_pr_no,
						S0_T2.ship_schd_no,
						S0_T3.ship_alloc_sts_no,
						S0_T1.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_func_id,
						S0_T3.ins_ts,
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_func_id,
						S0_T3.upd_ts,
						S0_T3.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_T3).on(S0_T3.ship_schd_no.eq(S0_T2.ship_schd_no))
						.leftOuterJoin(S0_T6).on(S0_T6.dlv_inst_rcpt_no.eq(S0_T2.dlv_inst_rcpt_no))
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.dlv_id_typ.eq(S0_T1.dlv_id_typ)
								.and(S0_M12.dlv_id_cd.eq(S0_T1.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M14.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.dpt_cd.eq(S0_T1.rqst_dpt_cd)
								.and(S0_T1.ship_schd_tm.between(S0_M16.st_dt, S0_M16.end_dt))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_M20.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M20.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M20.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M20.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M20.sno1.eq(S0_T2.sno1))
								.and(S0_M20.sno2.eq(S0_T2.sno2))
								.and(S0_M20.sno3.eq(S0_T2.sno3))
								.and(S0_M20.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_M21).on(S0_M21.bp_cd.eq(S0_T2.dlv_cd))
						.leftOuterJoin(S0_M22).on(S0_M22.bp_cd.eq(S0_T2.tdlv_cd))
						.leftOuterJoin(S0_DACL).on(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_DACLG).on(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_DACAG).on(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.ship_inst_qty.eq(value(0)))
						.and(S0_T2.ship_act_qty.eq(value(0)))
						.and(S0_T2.sls_qty.eq(value(0)))
						.and(S0_T3.alloc_flg.eq(value(true)))
						.and(
							bracket(
								S0_T1.loc_cd.isNotNull()
								.and(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNotNull())
								.and(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNull())
								.and(S0_T1.alloc_grp_cd.isNotNull())
								.and(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
							)
						)
						.cutoff$and(S0_T2.ship_schd_tm.gte(bind("ship_schd_dt_fr")))
						.cutoff$and(S0_T2.ship_schd_tm.lte(bind("ship_schd_dt_to")))
						.cutoff$and(S0_T2.dlv_schd_tm.gte(bind("dlv_schd_dt_fr")))
						.cutoff$and(S0_T2.dlv_schd_tm.lte(bind("dlv_schd_dt_to")))
						.cutoff$and(S0_T3.ship_loc_cd.like(bind("ship_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T3.ship_str_ln_cd.like(bind("ship_str_ln_cd")))
						.cutoff$and(S0_T2.ship_fr_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_T1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T3.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T3.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T3.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T3.sno1.like(bind("sno1")))
						.cutoff$and(S0_T3.sno2.like(bind("sno2")))
						.cutoff$and(S0_T3.sno3.like(bind("sno3")))
						.cutoff$and(S0_T3.sno4.like(bind("sno4")))
						.cutoff$and(
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.itm_nm,
									S0_M20.itm_nm
								),
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T3.pack_unit_cd.like(bind("pack_unit_cd")))
						.cutoff$and(S0_T3.base_unit_cd.like(bind("base_unit_cd")))
						.cutoff$and(S0_T3.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T3.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0_T3.stk_insp_typ.like(bind("stk_insp_typ")))
						.cutoff$and(S0_T3.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T3.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0_T1.rqst_usr_cd.like(bind("rqst_usr_cd")))
						.cutoff$and(S0_T1.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_M16.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.xfr_schd_no.like(bind("xfr_schd_no")))
						.cutoff$and(S0_T2.ship_schd_no.like(bind("ship_schd_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T2.ship_schd_no.asc(),
						S0_T3.ship_alloc_sts_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("slo_no"))
					.view(v -> v.leftOuterJoin(S0_T4).on(S0_T4.slo_d_no.eq(S0_T1.slo_d_no)))
					.predicate(p -> p.cutoff$and(S0_T4.slo_no.like(bind("slo_no")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(S0_T5.sno1.eq(S0_T3.sno1)))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("wg_nm", "site_nm", "ship_loc_nm", "wg_cd", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.loc_cd.eq(S0_T3.ship_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.loc_nm.like(bind("ship_loc_nm"))).cutoff$and(S0_M1.wg_cd.like(bind("wg_cd"))).cutoff$and(S0_M1.site_cd.like(bind("site_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.wg_cd.eq(S0_M1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_M3.site_cd.eq(S0_M1.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.site_nm.like(bind("site_nm")))),
				when(boundOr("ship_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.lg_grp_cd.eq(S0_T2.ship_fr_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.lg_grp_nm.like(bind("ship_lg_grp_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.alloc_grp_cd.eq(S0_T1.alloc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_M7.gd_cd.eq(S0_T3.gd_cd)))
					.predicate(p -> p.cutoff$and(S0_M7.gd_nm.like(bind("gd_nm")))),
				when(boundOr("pack_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(S0_M8.unit_cd.eq(S0_T3.pack_unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M8.unit_nm.like(bind("pack_unit_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_M10.unit_cd.eq(S0_T3.base_unit_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(S0_M15.usr_cd.eq(S0_T1.rqst_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M15.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(S0_M17.bp_cd.eq(S0_T3.stk_bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M17.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_M18.itm_typ.eq(S0_M6.itm_typ).and(S0_M18.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ship_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M19.loc_cd.eq(S0_T3.ship_loc_cd).and(S0_M19.str_ln_cd.eq(S0_T3.ship_str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.str_ln_nm.like(bind("ship_str_ln_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_M6.itm_grp_cd1.eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_M6.itm_grp_cd2.eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_M6.itm_grp_cd3.eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_M6.itm_grp_cd4.eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_M6.itm_grp_cd5.eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_M6.itm_grp_cd6.eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_M6.itm_grp_cd7.eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_M6.itm_grp_cd8.eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_M6.itm_grp_cd9.eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_M6.itm_grp_cd10.eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
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
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setStringNE("wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
							r.setNumberNE("pack_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pack_unit_conv_qty", m.conv_qty());
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
					})
				)
			);
	}
}