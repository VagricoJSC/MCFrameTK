package mcframe.serverMSBB.MSBBL1250;

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
	 * -- MSBBL1250_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1250_MST_SLO_D_S01() {
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_ITM_TYP_D_R S0_ITMTYPD = MAM_ITM_TYP_D_R.create("ITMTYPD");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("IFCTL");
		
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
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
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
							S0_SLO.slo_no,
							S0_SLOD.slo_d_no,
							S0_SLO.slo_dt,
							S0_SHIPPR.sls_sts_typ,
							S0_SLO.cst_cd,
							S0_SLO.sls_usr_cd,
							S0_SLO.sls_dpt_cd,
							S0_DPT.dpt_nm.as("sls_dpt_nm"),
							S0_SLO.assort_typ,
							S0_SLO.cst_po_no,
							S0_SLO.cst_po_rev,
							S0_SLOD.cst_itm_cd,
							S0_SLOD.cst_itm_nm,
							S0_SLOD.itm_cd,
							S0_SLOD.itm_sub1,
							S0_SLOD.itm_sub2,
							S0_SLOD.itm_sub3,
							nvl(
								S0_SLOD.itm_nm,
								S0_ITM.itm_nm
							).as("itm_nm"),
							S0_ITM.sundry_itm_flg,
							S0_SLOD.trd_unit_cd,
							S0_SLOD.trd_unit_qty.as("slo_qty"),
							S0_SLOD.trd_unit_qty,
							S0_SLOD.base_unit_cd,
							S0_SLOD.base_unit_qty,
							S0_SLOD.set_itm_grp_no,
							S0_SLOD.cst_po_d_no,
							trunc(
								S0_SHIPPR.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S0_SHIPPR.ship_schd_tm.as("ship_schd_hm"),
							trunc(
								S0_SHIPPR.dlv_schd_tm,
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							S0_SHIPPR.dlv_schd_tm.as("dlv_schd_hm"),
							S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
							S0_SLO.upd_cntr.as("slo_upd_cntr"),
							S0_SHIPPR.ship_pr_no,
							S0_SLO.trd_ptn_typ,
							S0_SLOD.vmi_flg,
							S0_SLOD.proc_typ,
							S0_SLOD.tdlv_cd.as("slo_tdlv_cd"),
							S0_SLOD.via_dlv_typ.as("slo_via_dlv_typ"),
							S0_SLOD.alloc_typ,
							S0_SHIPPR.base_unit_qty.as("ship_pr_base_unit_qty"),
							S0_SHIPPR.dlv_inst_rcpt_qty,
							S0_SHIPPR.ship_schd_abort_qty,
							S0_SHIPPR.ship_inst_typ,
							S0_SLOD.can_flg.as("slo_d_can_flg"),
							addDynamicSelect(DS0C_CST_GRP),
							addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_SLOD
						.innerJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.slo_d_no.eq(S0_SLOD.slo_d_no))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_ITM.itm_cd.eq(S0_SLOD.itm_cd)
								.and(S0_ITM.itm_sub1.eq(S0_SLOD.itm_sub1))
								.and(S0_ITM.itm_sub2.eq(S0_SLOD.itm_sub2))
								.and(S0_ITM.itm_sub3.eq(S0_SLOD.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_DPT.dpt_cd.eq(S0_SLO.sls_dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
								bracket(
									S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value())))
									.and(S0_SLO.cst_cd.eq(S0_EDI.bp_cd)
									.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
									.and(S0_EDI.del_flg.eq(value(false)))
								)
							)
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_SLO.sls_dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLOD.can_flg.eq(value(false)))
						.and(S0_SLO.can_flg.eq(value(false)))
						.and(S0_SHIPPR.ship_cmpl_flg.eq(value(false)))
						.and(S0_SHIPPR.base_unit_qty.gt(S0_SHIPPR.ship_inst_qty))
						.addDynamicPredicate()
						.cutoff$and(S0_SLO.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_SLO.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_SHIPPR.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_SHIPPR.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_SHIPPR.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_SHIPPR.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_SHIPPR.dlv_inst_rcpt_dt.gte(bind("dlv_inst_rcpt_dt_fr")))
						.cutoff$and(S0_SHIPPR.dlv_inst_rcpt_dt.lte(bind("dlv_inst_rcpt_dt_to")))
						.cutoff$and(S0_SLO.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_SLO.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_DPT.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_SLO.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_SLO.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_SLOD.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_SLO.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_SLOD.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_SLOD.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_SLOD.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_SLOD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_SLOD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_SLOD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_SLOD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_SLOD.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(
								bracket(
									bind("edi_flg_str").eq(value(true))
									.and(
										exists(
											subQuery()
											.select(value("X"))
											.from(S0_EDI)
											.where(
												S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value()))
												.and(S0_SLO.cst_cd.eq(S0_EDI.bp_cd))
												.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
												.and(S0_EDI.del_flg.eq(value(false)))
											)
										)
									)
								)
								.or(
									bracket(
										bind("edi_flg_str").eq(value(false))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S0_EDI)
												.where(
													S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value()))
													.and(S0_SLO.cst_cd.eq(S0_EDI.bp_cd))
													.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
													.and(S0_EDI.del_flg.eq(value(false)))
												)
											)
										)
									)
								)
							)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_SLO.slo_no.asc(),
						S0_SLOD.disp_seq.asc(),
						S0_SLOD.slo_d_no.asc()
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
						.view(v -> v.leftOuterJoin(S0_CST).on(S0_CST.bp_cd.eq(S0_SHIPPR.cst_cd)))
						.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
					when(boundOr("sls_usr_nm"))
						.view(v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_SLO.sls_usr_cd)))
						.predicate(p -> p.cutoff$and(S0_USR.usr_nm.like(bind("sls_usr_nm")))),
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S0_ITMTYPD).on(bracket(S0_ITMTYPD.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITMTYPD.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd)))))
						.predicate(p -> p.cutoff$and(S0_ITMTYPD.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("cst_grp_flg1"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_CST.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
					when(boundOr("cst_grp_flg2"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_CST.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
					when(boundOr("cst_grp_flg3"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_CST.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
					when(boundOr("cst_grp_flg4"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_CST.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
					when(boundOr("cst_grp_flg5"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_CST.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
					when(boundOr("cst_grp_flg6"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_CST.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
					when(boundOr("cst_grp_flg7"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_CST.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
					when(boundOr("cst_grp_flg8"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_CST.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
					when(boundOr("cst_grp_flg9"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_CST.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
					when(boundOr("cst_grp_flg10"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_CST.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_MMI1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_ITM.itm_grp_cd1.eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_MMI2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_ITM.itm_grp_cd2.eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_MMI3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_ITM.itm_grp_cd3.eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_MMI4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_ITM.itm_grp_cd4.eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_MMI5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_ITM.itm_grp_cd5.eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_MMI6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_ITM.itm_grp_cd6.eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_MMI7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_ITM.itm_grp_cd7.eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_MMI8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_ITM.itm_grp_cd8.eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_MMI9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_ITM.itm_grp_cd9.eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_MMI10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_ITM.itm_grp_cd10.eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
				)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
							,m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1250_MST_SLO_D_Query_S02
	 */
	static MCQueryPlan MSBBL1250_MST_SLO_D_S02() {
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_SLO_D_Query_S02")
					.mainQuery()
					.select(
							S0_SLOD.slo_d_no,
							S0_SLO.cst_cd,
							S0_SLO.cst_po_no,
							S0_SLOD.cst_po_d_no,
							S0_SLO.slo_dt,
							S0_SHIPPR.ship_inst_typ,
							S0_SHIPPR.ship_pr_no,
							S0_SLOD.sls_cststk_flg,
							S0_SLOD.via_dlv_typ.as("slo_via_dlv_typ")
					)
					.from(
						S0_SLOD
						.innerJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.slo_d_no.eq(S0_SLOD.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLOD.can_flg.eq(value(false)))
						.and(S0_SLO.can_flg.eq(value(false)))
						.cutoff$and(S0_SLOD.slo_d_no.eq(bind("slo_d_no")))
						.cutoff$and(S0_SLO.cst_cd.eq(bind("cst_cd")))
						.cutoff$and(S0_SLOD.cst_po_d_no.eq(bind("cst_po_d_no")))
						.cutoff$and(S0_SLO.cst_po_no.eq(bind("cst_po_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1250_MST_SLO_D_Query_S03
	 */
	static MCQueryPlan MSBBL1250_MST_SLO_D_S03() {
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		
		MSW_SLO_D_KEY_R S0_SLODKEY = MSW_SLO_D_KEY_R.create("SLODKEY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_SLO_D_Query_S03")
					.mainQuery()
					.select(
							S0_SLO.slo_no,
							S0_SLOD.slo_d_no,
							S0_SLO.slo_dt,
							S0_SHIPPR.sls_sts_typ,
							S0_SLO.cst_cd,
							S0_SLO.sls_usr_cd,
							S0_SLO.sls_dpt_cd,
							S0_DPT.dpt_nm.as("sls_dpt_nm"),
							S0_SLO.assort_typ,
							S0_SLO.cst_po_no,
							S0_SLO.cst_po_rev,
							S0_SLOD.cst_po_d_no,
							S0_SLOD.cst_itm_cd,
							S0_SLOD.cst_itm_nm,
							S0_SLOD.itm_cd,
							S0_SLOD.itm_sub1,
							S0_SLOD.itm_sub2,
							S0_SLOD.itm_sub3,
							nvl(
								S0_SLOD.itm_nm,
								S0_ITM.itm_nm
							).as("itm_nm"),
							S0_ITM.sundry_itm_flg,
							S0_SLOD.trd_unit_cd,
							S0_SLOD.trd_unit_qty.as("slo_qty"),
							S0_SLOD.trd_unit_qty.subtract(S0_SHIPPR.dlv_inst_rcpt_qty).as("trd_unit_qty"),
							S0_SLOD.base_unit_cd,
							S0_SLOD.base_unit_qty,
							S0_SLOD.set_itm_grp_no,
							trunc(
								S0_SHIPPR.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S0_SHIPPR.ship_schd_tm.as("ship_schd_hm"),
							trunc(
								S0_SHIPPR.dlv_schd_tm,
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							S0_SHIPPR.dlv_schd_tm.as("dlv_schd_hm"),
							S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
							S0_SLO.upd_cntr.as("slo_upd_cntr"),
							S0_SHIPPR.ship_pr_no,
							S0_SLO.trd_ptn_typ,
							S0_SLOD.vmi_flg,
							S0_SLOD.proc_typ,
							S0_SLOD.tdlv_cd.as("slo_tdlv_cd"),
							S0_SLOD.via_dlv_typ.as("slo_via_dlv_typ"),
							S0_SLOD.alloc_typ,
							S0_SHIPPR.base_unit_qty.as("ship_pr_base_unit_qty"),
							S0_SHIPPR.ship_schd_abort_qty,
							S0_SLOD.can_flg.as("slo_d_can_flg")
					)
					.from(
						S0_SLOD
						.innerJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.slo_d_no.eq(S0_SLOD.slo_d_no))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_ITM.itm_cd.eq(S0_SLOD.itm_cd)
								.and(S0_ITM.itm_sub1.eq(S0_SLOD.itm_sub1))
								.and(S0_ITM.itm_sub2.eq(S0_SLOD.itm_sub2))
								.and(S0_ITM.itm_sub3.eq(S0_SLOD.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_DPT.dpt_cd.eq(S0_SLO.sls_dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.innerJoin(S0_SLODKEY).on(S0_SLODKEY.slo_d_no.eq(S0_SLOD.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_SLOD.can_flg.eq(value(false)))
						.and(S0_SLO.can_flg.eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
						r.getStringNE("itm_cd"),
						r.getStringNE("itm_sub1"),
						r.getStringNE("itm_sub2"),
						r.getStringNE("itm_sub3"),
						r.getStringNE("trd_unit_cd")
					))
					.addSelect(m -> toArray(
						m.conv_base_qty,
						m.conv_qty,
						m.dec_place
						,m.rnd_typ
					))
					.addMap((r, m) -> {
						r.setNumberNE("trd_unit_dec_place", m.dec_place());
						r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
						r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
						r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1250_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBBL1250_MST_DLV_INST_RCPT_S01() {
		MST_DLV_INST_RCPT_R S0_DIR = MST_DLV_INST_RCPT_R.create("DIR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_TDLV = MAM_BP_R.create("TDLV");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_USR_R S0_USR = MAM_USR_R.create("USR");
		MAM_ITM_TYP_D_R S0_ITMTYPD = MAM_ITM_TYP_D_R.create("ITMTYPD");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("IFCTL");
		
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		MAM_BP_GRP_R S0_MMD1 = MAM_BP_GRP_R.create("MMD1");
		MAM_BP_GRP_R S0_MMD2 = MAM_BP_GRP_R.create("MMD2");
		MAM_BP_GRP_R S0_MMD3 = MAM_BP_GRP_R.create("MMD3");
		MAM_BP_GRP_R S0_MMD4 = MAM_BP_GRP_R.create("MMD4");
		MAM_BP_GRP_R S0_MMD5 = MAM_BP_GRP_R.create("MMD5");
		MAM_BP_GRP_R S0_MMD6 = MAM_BP_GRP_R.create("MMD6");
		MAM_BP_GRP_R S0_MMD7 = MAM_BP_GRP_R.create("MMD7");
		MAM_BP_GRP_R S0_MMD8 = MAM_BP_GRP_R.create("MMD8");
		MAM_BP_GRP_R S0_MMD9 = MAM_BP_GRP_R.create("MMD9");
		MAM_BP_GRP_R S0_MMD10 = MAM_BP_GRP_R.create("MMD10");
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
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
							S0_SLO.slo_no,
							S0_DIR.slo_d_no,
							S0_SLO.slo_dt,
							S0_SHIPPR.sls_sts_typ,
							S0_SLO.cst_cd,
							S0_SLO.sls_usr_cd,
							S0_SLO.sls_dpt_cd,
							S0_DPT.dpt_nm.as("sls_dpt_nm"),
							S0_SLO.assort_typ,
							S0_SLO.cst_po_no,
							S0_SLO.cst_po_rev,
							S0_SLOD.cst_itm_cd,
							S0_SLOD.cst_itm_nm,
							S0_SLOD.itm_cd,
							S0_SLOD.itm_sub1,
							S0_SLOD.itm_sub2,
							S0_SLOD.itm_sub3,
							nvl(
								S0_SLOD.itm_nm,
								S0_ITM.itm_nm
							).as("itm_nm"),
							S0_ITM.sundry_itm_flg,
							S0_SLOD.trd_unit_qty.as("slo_qty"),
							S0_SLOD.set_itm_grp_no,
							S0_SLOD.cst_po_d_no,
							trunc(
								S0_SHIPPR.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S0_SHIPPR.ship_schd_tm.as("ship_schd_hm"),
							trunc(
								S0_SHIPPR.dlv_schd_tm,
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							S0_SHIPPR.dlv_schd_tm.as("dlv_schd_hm"),
							S0_DIR.dlv_inst_rcpt_no,
							S0_DIR.dlv_inst_rcpt_rev,
							S0_SHIPPR.dlv_inst_rcpt_dt,
							S0_DIR.edi_flg,
							S0_DIR.cst_dlv_inst_no,
							S0_DIR.cst_dlv_inst_rev,
							S0_DIR.cst_dlv_inst_d_no,
							S0_DIR.trd_unit_cd,
							S0_DIR.trd_unit_qty,
							trunc(
								S0_DIR.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S0_DIR.dlv_rqst_tm.as("dlv_rqst_hm"),
							S0_DIR.cst_dlv_inst_rmrks,
							S0_DIR.cst_dlv_inst_d_rmrks,
							S0_DIR.intr_rmrks,
							S0_DIR.base_unit_cd,
							S0_DIR.base_unit_qty,
							S0_DIR.dlv_cd,
							decode(
								S0_DIR.dlv_sundry_flg,
								value(true),
								S0_DIR.dlv_nm,
								S0_DLV.bp_nm
							).as("dlv_nm"),
							S0_DIR.dlv_sundry_flg,
							S0_DIR.pri_prnt_flg,
							S0_DIR.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
							S0_DLV.cntry_cd.as("dlv_cntry_cd"),
							S0_DIR.dlv_zip_cd,
							S0_DIR.dlv_addr1,
							S0_DIR.dlv_addr2,
							S0_DIR.dlv_addr3,
							S0_DIR.dlv_addr4,
							S0_DIR.dlv_tel,
							S0_DIR.dlv_fax,
							S0_DIR.dlv_cntct_dpt,
							S0_DIR.dlv_cntct_psn,
							S0_DLV.tdlv_req_flg,
							S0_DIR.tdlv_cd,
							decode(
								S0_DIR.tdlv_sundry_flg,
								value(true),
								S0_DIR.tdlv_nm,
								S0_TDLV.bp_nm
							).as("tdlv_nm"),
							S0_DIR.tdlv_sundry_flg,
							S0_DIR.tdlv_lg_grp_cd,
							S0_TDLV.cntry_cd.as("tdlv_cntry_cd"),
							S0_DIR.tdlv_zip_cd,
							S0_DIR.tdlv_addr1,
							S0_DIR.tdlv_addr2,
							S0_DIR.tdlv_addr3,
							S0_DIR.tdlv_addr4,
							S0_DIR.tdlv_tel,
							S0_DIR.tdlv_fax,
							S0_DIR.tdlv_cntct_dpt,
							S0_DIR.tdlv_cntct_psn,
							S0_DIR.via_dlv_typ,
							S0_DIR.dlv_day_week_typ,
							S0_DIR.sub_char1,
							S0_DIR.sub_char2,
							S0_DIR.sub_char3,
							S0_DIR.ins_usr_id,
							S0_DIR.ins_usr_nm,
							S0_DIR.ins_func_id,
							S0_DIR.ins_ts,
							S0_DIR.upd_usr_id,
							S0_DIR.upd_usr_nm,
							S0_DIR.upd_func_id,
							S0_DIR.upd_ts,
							S0_DIR.upd_srv_req_no,
							S0_SHIPPR.ship_pr_no,
							S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
							S0_SLO.upd_cntr.as("slo_upd_cntr"),
							S0_SLO.trd_ptn_typ,
							S0_SLOD.vmi_flg,
							S0_SLOD.proc_typ,
							S0_SLOD.tdlv_cd.as("slo_tdlv_cd"),
							S0_SLOD.via_dlv_typ.as("slo_via_dlv_typ"),
							S0_SLOD.alloc_typ,
							S0_SLOD.sls_cststk_flg,
							S0_SHIPPR.base_unit_qty.as("ship_pr_base_unit_qty"),
							S0_SHIPPR.ship_schd_abort_qty,
							S0_SHIPPR.ship_inst_typ,
							S0_SLOD.can_flg.as("slo_d_can_flg"),
							addDynamicSelect(DS0C_CST_GRP),
							addDynamicSelect(DS0C_DLV_GRP),
							addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_DIR
						.innerJoin(S0_SLOD).on(S0_SLOD.slo_d_no.eq(S0_DIR.slo_d_no))
						.innerJoin(S0_SLO).on(S0_SLO.slo_no.eq(S0_SLOD.slo_no))
						.innerJoin(S0_SHIPPR).on(S0_SHIPPR.slo_d_no.eq(S0_SLOD.slo_d_no))
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_ITM.itm_cd.eq(S0_SLOD.itm_cd)
								.and(S0_ITM.itm_sub1.eq(S0_SLOD.itm_sub1))
								.and(S0_ITM.itm_sub2.eq(S0_SLOD.itm_sub2))
								.and(S0_ITM.itm_sub3.eq(S0_SLOD.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DLV).on(S0_DIR.dlv_cd.eq(S0_DLV.bp_cd))
						.leftOuterJoin(S0_TDLV).on(S0_DIR.tdlv_cd.eq(S0_TDLV.bp_cd))
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_DPT.dpt_cd.eq(S0_SLO.sls_dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_EDI).on(
							bracket(
								S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value())))
								.and(S0_SLO.cst_cd.eq(S0_EDI.bp_cd)
								.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
								.and(S0_EDI.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_SLO.sls_dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_DIR.can_flg.eq(value(false)))
						.and(S0_SLOD.can_flg.eq(value(false)))
						.and(S0_SLOD.abort_flg.eq(value(false))
						.or(bracket(S0_SLOD.abort_flg.eq(value(true)).and(S0_SHIPPR.ship_schd_abort_qty.lt(S0_SHIPPR.base_unit_qty)))))
						.addDynamicPredicate()
						.and(
							bracket(
								bind("ref_flg").eq(value(true))
								.cutoff$and(S0_DIR.edi_flg.eq(bind("edi_flg_str")))
							)
							.or(
								bind("ref_flg").eq(value(false))
								.cutoff$and(decode(
									S0_EDI.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								).eq(bind("edi_flg_str")))
							)
						)
						.cutoff$and(S0_SLO.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_SLO.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_SHIPPR.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_SHIPPR.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_SHIPPR.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_SHIPPR.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_SHIPPR.dlv_inst_rcpt_dt.gte(bind("dlv_inst_rcpt_dt_fr")))
						.cutoff$and(S0_SHIPPR.dlv_inst_rcpt_dt.lte(bind("dlv_inst_rcpt_dt_to")))
						.cutoff$and(S0_DIR.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_DIR.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_SLO.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_SLO.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_DPT.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_SLO.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_DIR.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_DIR.dlv_nm,
								S0_DLV.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_DIR.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(
							nvl(
								S0_DIR.tdlv_nm,
								S0_TDLV.bp_nm
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_SLO.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_SLOD.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_SLO.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_SLOD.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_DIR.dlv_inst_rcpt_no.like(bind("dlv_inst_rcpt_no")))
						.cutoff$and(S0_DIR.cst_dlv_inst_no.like(bind("cst_dlv_inst_no")))
						.cutoff$and(S0_DIR.cst_dlv_inst_d_no.like(bind("cst_dlv_inst_d_no")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_SLOD.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_SLOD.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_SLOD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_SLOD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_SLOD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_SLOD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_DIR.cst_dlv_inst_rmrks.like(bind("cst_dlv_inst_rmrks")))
						.cutoff$and(S0_DIR.cst_dlv_inst_d_rmrks.like(bind("cst_dlv_inst_d_rmrks")))
						.cutoff$and(S0_DIR.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_DIR.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_DIR.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_DIR.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							nvl(
								S0_SLOD.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_SLO.slo_no.asc(),
						S0_SLOD.disp_seq.asc(),
						S0_SLOD.slo_d_no.asc(),
						S0_DIR.dlv_rqst_tm.asc(),
						S0_DIR.dlv_inst_rcpt_no.asc()
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
						.view(v -> v.leftOuterJoin(S0_CST).on(S0_CST.bp_cd.eq(S0_SLO.cst_cd)))
						.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
					when(boundOr("sls_usr_nm"))
						.view(v -> v.leftOuterJoin(S0_USR).on(S0_USR.usr_cd.eq(S0_SLO.sls_usr_cd)))
						.predicate(p -> p.cutoff$and(S0_USR.usr_nm.like(bind("sls_usr_nm")))),
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S0_ITMTYPD).on(bracket(S0_ITMTYPD.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITMTYPD.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd)))))
						.predicate(p -> p.cutoff$and(S0_ITMTYPD.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("cst_grp_flg1"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_MMC1.bp_grp_nm.as("cst_grp_nm1"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_CST.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
					when(boundOr("cst_grp_flg2"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_MMC2.bp_grp_nm.as("cst_grp_nm2"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_CST.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
					when(boundOr("cst_grp_flg3"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_MMC3.bp_grp_nm.as("cst_grp_nm3"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_CST.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
					when(boundOr("cst_grp_flg4"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_MMC4.bp_grp_nm.as("cst_grp_nm4"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_CST.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
					when(boundOr("cst_grp_flg5"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_MMC5.bp_grp_nm.as("cst_grp_nm5"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_CST.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
					when(boundOr("cst_grp_flg6"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_MMC6.bp_grp_nm.as("cst_grp_nm6"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_CST.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
					when(boundOr("cst_grp_flg7"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_MMC7.bp_grp_nm.as("cst_grp_nm7"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_CST.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
					when(boundOr("cst_grp_flg8"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_MMC8.bp_grp_nm.as("cst_grp_nm8"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_CST.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
					when(boundOr("cst_grp_flg9"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_MMC9.bp_grp_nm.as("cst_grp_nm9"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_CST.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
					when(boundOr("cst_grp_flg10"))
						.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_MMC10.bp_grp_nm.as("cst_grp_nm10"))
						.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_CST.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
						.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10")))),
					when(boundOr("dlv_grp_flg1"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_MMD1.bp_grp_nm.as("dlv_grp_nm1"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD1).on(S0_DLV.bp_grp_cd1.eq(S0_MMD1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMD1.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MMD1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
					when(boundOr("dlv_grp_flg2"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_MMD2.bp_grp_nm.as("dlv_grp_nm2"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD2).on(S0_DLV.bp_grp_cd2.eq(S0_MMD2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMD2.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MMD2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
					when(boundOr("dlv_grp_flg3"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_MMD3.bp_grp_nm.as("dlv_grp_nm3"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD3).on(S0_DLV.bp_grp_cd3.eq(S0_MMD3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMD3.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MMD3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
					when(boundOr("dlv_grp_flg4"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_MMD4.bp_grp_nm.as("dlv_grp_nm4"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD4).on(S0_DLV.bp_grp_cd4.eq(S0_MMD4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMD4.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MMD4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
					when(boundOr("dlv_grp_flg5"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_MMD5.bp_grp_nm.as("dlv_grp_nm5"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD5).on(S0_DLV.bp_grp_cd5.eq(S0_MMD5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMD5.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MMD5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
					when(boundOr("dlv_grp_flg6"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_MMD6.bp_grp_nm.as("dlv_grp_nm6"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD6).on(S0_DLV.bp_grp_cd6.eq(S0_MMD6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMD6.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MMD6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
					when(boundOr("dlv_grp_flg7"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_MMD7.bp_grp_nm.as("dlv_grp_nm7"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD7).on(S0_DLV.bp_grp_cd7.eq(S0_MMD7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMD7.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MMD7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
					when(boundOr("dlv_grp_flg8"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_MMD8.bp_grp_nm.as("dlv_grp_nm8"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD8).on(S0_DLV.bp_grp_cd8.eq(S0_MMD8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMD8.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MMD8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
					when(boundOr("dlv_grp_flg9"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_MMD9.bp_grp_nm.as("dlv_grp_nm9"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD9).on(S0_DLV.bp_grp_cd9.eq(S0_MMD9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMD9.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MMD9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
					when(boundOr("dlv_grp_flg10"))
						.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_MMD10.bp_grp_nm.as("dlv_grp_nm10"))
						.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD10).on(S0_DLV.bp_grp_cd10.eq(S0_MMD10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMD10.bp_grp_typ))))
						.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MMD10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_MMI1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_ITM.itm_grp_cd1.eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_MMI2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_ITM.itm_grp_cd2.eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_MMI3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_ITM.itm_grp_cd3.eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_MMI4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_ITM.itm_grp_cd4.eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_MMI5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_ITM.itm_grp_cd5.eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_MMI6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_ITM.itm_grp_cd6.eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_MMI7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_ITM.itm_grp_cd7.eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_MMI8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_ITM.itm_grp_cd8.eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_MMI9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_ITM.itm_grp_cd9.eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_MMI10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_ITM.itm_grp_cd10.eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
				)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
							,m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1250_MST_DLV_INST_RCPT_Query_S02
	 */
	static MCQueryPlan MSBBL1250_MST_DLV_INST_RCPT_S02() {
		MST_DLV_INST_RCPT_R S0_DIR = MST_DLV_INST_RCPT_R.create("DIR");
		MSW_SLO_D_KEY_R S0_SLODKEY = MSW_SLO_D_KEY_R.create("SLODKEY");
		MSW_DLV_INST_RCPT_KEY_R S0_DIRKEY = MSW_DLV_INST_RCPT_KEY_R.create("DIRKEY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_DLV_INST_RCPT_Query_S02")
					.mainQuery()
					.select(
							S0_DIR.dlv_inst_rcpt_no,
							S0_DIR.dlv_inst_rcpt_rev,
							S0_DIR.slo_d_no,
							S0_DIR.cst_dlv_inst_no,
							S0_DIR.cst_dlv_inst_rev,
							S0_DIR.cst_dlv_inst_d_no,
							S0_DIR.dlv_rqst_tm,
							S0_DIR.trd_unit_qty,
							S0_DIR.cst_dlv_inst_rmrks,
							S0_DIR.cst_dlv_inst_d_rmrks,
							S0_DIR.intr_rmrks,
							S0_DIR.edi_flg,
							S0_DIR.dlv_cd,
							S0_DIR.dlv_nm,
							S0_DIR.dlv_cntct_dpt,
							S0_DIR.dlv_cntct_psn,
							S0_DIR.dlv_zip_cd,
							S0_DIR.dlv_addr1,
							S0_DIR.dlv_addr2,
							S0_DIR.dlv_addr3,
							S0_DIR.dlv_addr4,
							S0_DIR.dlv_tel,
							S0_DIR.dlv_fax,
							S0_DIR.dlv_lg_grp_cd,
							S0_DIR.pri_prnt_flg,
							S0_DIR.tdlv_cd,
							S0_DIR.tdlv_nm,
							S0_DIR.via_dlv_typ,
							S0_DIR.tdlv_cntct_dpt,
							S0_DIR.tdlv_cntct_psn,
							S0_DIR.tdlv_zip_cd,
							S0_DIR.tdlv_addr1,
							S0_DIR.tdlv_addr2,
							S0_DIR.tdlv_addr3,
							S0_DIR.tdlv_addr4,
							S0_DIR.tdlv_tel,
							S0_DIR.tdlv_fax,
							S0_DIR.tdlv_lg_grp_cd,
							S0_DIR.dlv_day_week_typ,
							S0_DIR.sub_char1,
							S0_DIR.sub_char2,
							S0_DIR.sub_char3
					)
					.from(
						S0_DIR
						.innerJoin(S0_SLODKEY).on(S0_SLODKEY.slo_d_no.eq(S0_DIR.slo_d_no))
						.leftOuterJoin(S0_DIRKEY).on(S0_DIRKEY.dlv_inst_rcpt_no.eq(S0_DIR.dlv_inst_rcpt_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_DIR.can_flg.eq(value(false)))
						.and(S0_DIRKEY.dlv_inst_rcpt_no.isNull())
					)
			);
	}
	
	/**
	 * -- MSBBL1250_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1250_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MSW_SLO_D_KEY_R S0_SLODKEY = MSW_SLO_D_KEY_R.create("SLODKEY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1250_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_SHIPPR.slo_d_no,
						sum(S0_SHIPSCHD.alloc_qty).as("alloc_qty")
					)
					.from(
						S0_SHIPSCHD
						.innerJoin(S0_SHIPPR).on(S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no))
						.innerJoin(S0_SLODKEY).on(S0_SHIPPR.slo_d_no.eq(S0_SLODKEY.slo_d_no))
					)
					.groupBy(S0_SHIPPR.slo_d_no)
			);
	}
}