package mcframe.serverMSBB.MSBBL1260;

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
	 * -- MSBBL1260_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1260_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_DLV_INST_RCPT_R S0_INSTRCPT = MST_DLV_INST_RCPT_R.create("INSTRCPT");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SLO_PRMS_H_R S0_PRMSH = MST_SLO_PRMS_H_R.create("PRMSH");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_ITM_TYP_D_R S0_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM10");
		MAM_BP_GRP_R S0_MM_DLV1 = MAM_BP_GRP_R.create("MM_DLV1");
		MAM_BP_GRP_R S0_MM_DLV2 = MAM_BP_GRP_R.create("MM_DLV2");
		MAM_BP_GRP_R S0_MM_DLV3 = MAM_BP_GRP_R.create("MM_DLV3");
		MAM_BP_GRP_R S0_MM_DLV4 = MAM_BP_GRP_R.create("MM_DLV4");
		MAM_BP_GRP_R S0_MM_DLV5 = MAM_BP_GRP_R.create("MM_DLV5");
		MAM_BP_GRP_R S0_MM_DLV6 = MAM_BP_GRP_R.create("MM_DLV6");
		MAM_BP_GRP_R S0_MM_DLV7 = MAM_BP_GRP_R.create("MM_DLV7");
		MAM_BP_GRP_R S0_MM_DLV8 = MAM_BP_GRP_R.create("MM_DLV8");
		MAM_BP_GRP_R S0_MM_DLV9 = MAM_BP_GRP_R.create("MM_DLV9");
		MAM_BP_GRP_R S0_MM_DLV10 = MAM_BP_GRP_R.create("MM_DLV10");
		MAM_BP_GRP_R S0_MM_CST1 = MAM_BP_GRP_R.create("MM_CST1");
		MAM_BP_GRP_R S0_MM_CST2 = MAM_BP_GRP_R.create("MM_CST2");
		MAM_BP_GRP_R S0_MM_CST3 = MAM_BP_GRP_R.create("MM_CST3");
		MAM_BP_GRP_R S0_MM_CST4 = MAM_BP_GRP_R.create("MM_CST4");
		MAM_BP_GRP_R S0_MM_CST5 = MAM_BP_GRP_R.create("MM_CST5");
		MAM_BP_GRP_R S0_MM_CST6 = MAM_BP_GRP_R.create("MM_CST6");
		MAM_BP_GRP_R S0_MM_CST7 = MAM_BP_GRP_R.create("MM_CST7");
		MAM_BP_GRP_R S0_MM_CST8 = MAM_BP_GRP_R.create("MM_CST8");
		MAM_BP_GRP_R S0_MM_CST9 = MAM_BP_GRP_R.create("MM_CST9");
		MAM_BP_GRP_R S0_MM_CST10 = MAM_BP_GRP_R.create("MM_CST10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1260_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("edi_send_flg"),
						S0_SHIPSCHD.pr_sts_typ,
						S0_SLO.slo_no,
						S0_SHIPPR.slo_d_no,
						S0_SLO.slo_dt,
						S0_SLO.cst_cd,
						S0_SLO.sls_usr_cd,
						S0_SLO.sls_dpt_cd,
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
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
						S0_SLOD.trd_unit_qty.as("slo_trd_unit_qty"),
						S0_SLOD.trd_unit_cd.as("slo_trd_unit_cd"),
						S0_SHIPSCHD.trd_unit_cd,
						S0_SHIPSCHD.base_unit_cd,
						S0_SHIPSCHD.dlv_inst_rcpt_no,
						trunc(
							S0_INSTRCPT.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_INSTRCPT.dlv_rqst_tm.as("dlv_inst_hm"),
						S0_INSTRCPT.trd_unit_qty.as("dlv_inst_qty"),
						S0_INSTRCPT.cst_dlv_inst_no,
						S0_INSTRCPT.cst_dlv_inst_rev,
						S0_INSTRCPT.cst_dlv_inst_d_no,
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPSCHD.ship_pr_no,
						S0_SHIPSCHD.ship_fr_lg_grp_cd,
						S0_SHIPSCHD.wg_cd.as("ship_fr_lg_grp_wg_cd"),
						trunc(
							S0_SHIPSCHD.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_SHIPSCHD.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_SHIPSCHD.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_SHIPSCHD.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						trunc(
							S0_SHIPSCHD.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_SHIPSCHD.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_SHIPSCHD.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_SHIPSCHD.dlv_schd_tm.as("dlv_schd_hm"),
						nvl(
							S0_SHIPSCHD.dlv_cd,
							S0_SLOD.dlv_cd
						).as("dlv_cd"),
						nvl2(
							S0_SHIPSCHD.dlv_cd,
							nvl(
								S0_SHIPSCHD.dlv_nm,
								S0_DLV.bp_nm
							),
							nvl(
								S0_SLOD.dlv_nm,
								S0_DLV.bp_nm
							)
						).as("dlv_nm"),
						S0_SHIPSCHD.trd_unit_qty,
						S0_SHIPSCHD.trd_unit_qty.as("trd_unit_prms_qty"),
						S0_PRMSH.slo_prms_h_no,
						S0_PRMSH.slo_prms_h_no.as("org_slo_prms_h_no"),
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_SHIPSCHD
						.leftOuterJoin(S0_INSTRCPT).on(
							bracket(
								S0_SHIPSCHD.dlv_inst_rcpt_no.eq(S0_INSTRCPT.dlv_inst_rcpt_no)
							)
						)
						.innerJoin(S0_SHIPPR).on(
							bracket(
								S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no)
							)
						)
						.innerJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_SHIPPR.slo_d_no)
							)
						)
						.innerJoin(S0_SLO).on(
							bracket(
								S0_SLOD.slo_no.eq(S0_SLO.slo_no)
							)
						)
						.leftOuterJoin(S0_PRMSH).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_PRMSH.slo_d_no)
								.and(S0_PRMSH.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value())))
								.and(S0_SLO.cst_cd.eq(S0_IFCTL.bp_cd)
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_SLO.sls_dpt_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SLOD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SLOD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SLOD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SLOD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_DLV).on(
							S0_DLV.bp_cd.eq(
								nvl(
									S0_SHIPSCHD.dlv_cd,
									S0_SLOD.dlv_cd
								)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_SLOD.slo_no.isNotNull())
						.and(S0_SHIPSCHD.ship_inst_qty.eq(value(0))).and(S0_SHIPSCHD.ship_act_qty.eq(value(0)))
						.and(S0_SHIPPR.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
						.and(S0_SHIPSCHD.abort_flg.eq(value(false)))
						.and(S0_SHIPSCHD.slo_prms_no.isNull())
						.cutoff$and(decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).eq(bind("edi_flg_str")))
						.and(bind("prms_not_prnted").eq(value(true)))
						.cutoff$and(S0_SLO.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_SLO.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_INSTRCPT.dlv_rqst_tm.gte(bind("dlv_inst_hm_fr")))
						.cutoff$and(S0_INSTRCPT.dlv_rqst_tm.lte(bind("dlv_inst_hm_to")))
						.cutoff$and(S0_SHIPSCHD.ship_rqst_tm.gte(bind("ship_rqst_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.ship_rqst_tm.lte(bind("ship_rqst_hm_to")))
						.cutoff$and(S0_SHIPSCHD.pd_inst_dlv_tm.gte(bind("pd_inst_dlv_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.pd_inst_dlv_tm.lte(bind("pd_inst_dlv_hm_to")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_SHIPSCHD.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_SLO.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_SLOD.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_SLOD.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_SLOD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_SLOD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_SLOD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_SLOD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_SLO.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_SLOD.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_SLO.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_SLOD.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_INSTRCPT.cst_dlv_inst_no.like(bind("cst_dlv_inst_no")))
						.cutoff$and(S0_INSTRCPT.cst_dlv_inst_d_no.like(bind("cst_dlv_inst_d_no")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(
							nvl(
								S0_SHIPSCHD.dlv_cd,
								S0_SLOD.dlv_cd
							).like(bind("dlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_SHIPSCHD.dlv_cd,
								nvl(
									S0_SHIPSCHD.dlv_nm,
									S0_DLV.bp_nm
								),
								nvl(
									S0_SLOD.dlv_nm,
									S0_DLV.bp_nm
								)
							).like(bind("dlv_nm"))
						)
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITMTYP).on(S0_ITMTYP.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITMTYP.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_CST).on(bracket(S0_CST.bp_cd.eq(S0_SLO.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_ITM.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_ITM.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_ITM.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_ITM.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_ITM.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_ITM.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_ITM.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_ITM.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_ITM.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_ITM.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_DLV.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_DLV.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_DLV.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_DLV.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_DLV.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_DLV.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_DLV.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_DLV.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_DLV.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_DLV.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_MM_CST1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST1).on(S0_CST.bp_grp_cd1.eq(S0_MM_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_CST1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM_CST1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_MM_CST2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST2).on(S0_CST.bp_grp_cd2.eq(S0_MM_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_CST2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM_CST2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_MM_CST3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST3).on(S0_CST.bp_grp_cd3.eq(S0_MM_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_CST3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM_CST3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_MM_CST4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST4).on(S0_CST.bp_grp_cd4.eq(S0_MM_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_CST4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM_CST4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_MM_CST5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST5).on(S0_CST.bp_grp_cd5.eq(S0_MM_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_CST5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM_CST5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_MM_CST6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST6).on(S0_CST.bp_grp_cd6.eq(S0_MM_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_CST6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM_CST6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_MM_CST7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST7).on(S0_CST.bp_grp_cd7.eq(S0_MM_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_CST7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM_CST7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_MM_CST8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST8).on(S0_CST.bp_grp_cd8.eq(S0_MM_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_CST8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM_CST8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_MM_CST9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST9).on(S0_CST.bp_grp_cd9.eq(S0_MM_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_CST9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM_CST9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_MM_CST10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST10).on(S0_CST.bp_grp_cd10.eq(S0_MM_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_CST10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM_CST10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("slo_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("slo_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("slo_trd_unit_dec_place", m.dec_place());
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
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1260_MST_SLO_PRMS_Query_S01
	 */
	static MCQueryPlan MSBBL1260_MST_SLO_PRMS_S01() {
		MST_SLO_PRMS_P_R S0_PRMSP = MST_SLO_PRMS_P_R.create("PRMSP");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SLO_PRMS_H_R S0_PRMSH = MST_SLO_PRMS_H_R.create("PRMSH");
		MST_SLO_PRMS_H_R S0_SLOPRMSH = MST_SLO_PRMS_H_R.create("SLOPRMSH");
		MST_DLV_INST_RCPT_R S0_INSTRCPT = MST_DLV_INST_RCPT_R.create("INSTRCPT");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_DPT_R S0_DPT = MAM_DPT_R.create("DPT");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_ITM_TYP_D_R S0_ITMTYP = MAM_ITM_TYP_D_R.create("ITMTYP");
		MAM_EDI_IF_CTL_R S0_IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
		MAM_ITM_GRP_R S0_MM_ITM1 = MAM_ITM_GRP_R.create("MM_ITM1");
		MAM_ITM_GRP_R S0_MM_ITM2 = MAM_ITM_GRP_R.create("MM_ITM2");
		MAM_ITM_GRP_R S0_MM_ITM3 = MAM_ITM_GRP_R.create("MM_ITM3");
		MAM_ITM_GRP_R S0_MM_ITM4 = MAM_ITM_GRP_R.create("MM_ITM4");
		MAM_ITM_GRP_R S0_MM_ITM5 = MAM_ITM_GRP_R.create("MM_ITM5");
		MAM_ITM_GRP_R S0_MM_ITM6 = MAM_ITM_GRP_R.create("MM_ITM6");
		MAM_ITM_GRP_R S0_MM_ITM7 = MAM_ITM_GRP_R.create("MM_ITM7");
		MAM_ITM_GRP_R S0_MM_ITM8 = MAM_ITM_GRP_R.create("MM_ITM8");
		MAM_ITM_GRP_R S0_MM_ITM9 = MAM_ITM_GRP_R.create("MM_ITM9");
		MAM_ITM_GRP_R S0_MM_ITM10 = MAM_ITM_GRP_R.create("MM10");
		MAM_BP_GRP_R S0_MM_DLV1 = MAM_BP_GRP_R.create("MM_DLV1");
		MAM_BP_GRP_R S0_MM_DLV2 = MAM_BP_GRP_R.create("MM_DLV2");
		MAM_BP_GRP_R S0_MM_DLV3 = MAM_BP_GRP_R.create("MM_DLV3");
		MAM_BP_GRP_R S0_MM_DLV4 = MAM_BP_GRP_R.create("MM_DLV4");
		MAM_BP_GRP_R S0_MM_DLV5 = MAM_BP_GRP_R.create("MM_DLV5");
		MAM_BP_GRP_R S0_MM_DLV6 = MAM_BP_GRP_R.create("MM_DLV6");
		MAM_BP_GRP_R S0_MM_DLV7 = MAM_BP_GRP_R.create("MM_DLV7");
		MAM_BP_GRP_R S0_MM_DLV8 = MAM_BP_GRP_R.create("MM_DLV8");
		MAM_BP_GRP_R S0_MM_DLV9 = MAM_BP_GRP_R.create("MM_DLV9");
		MAM_BP_GRP_R S0_MM_DLV10 = MAM_BP_GRP_R.create("MM_DLV10");
		MAM_BP_GRP_R S0_MM_CST1 = MAM_BP_GRP_R.create("MM_CST1");
		MAM_BP_GRP_R S0_MM_CST2 = MAM_BP_GRP_R.create("MM_CST2");
		MAM_BP_GRP_R S0_MM_CST3 = MAM_BP_GRP_R.create("MM_CST3");
		MAM_BP_GRP_R S0_MM_CST4 = MAM_BP_GRP_R.create("MM_CST4");
		MAM_BP_GRP_R S0_MM_CST5 = MAM_BP_GRP_R.create("MM_CST5");
		MAM_BP_GRP_R S0_MM_CST6 = MAM_BP_GRP_R.create("MM_CST6");
		MAM_BP_GRP_R S0_MM_CST7 = MAM_BP_GRP_R.create("MM_CST7");
		MAM_BP_GRP_R S0_MM_CST8 = MAM_BP_GRP_R.create("MM_CST8");
		MAM_BP_GRP_R S0_MM_CST9 = MAM_BP_GRP_R.create("MM_CST9");
		MAM_BP_GRP_R S0_MM_CST10 = MAM_BP_GRP_R.create("MM_CST10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCTempView S1_PRMSH = createTempView("SLOPRMSH1");
		MCTempView S1_SLOPRMSH = createTempView("SLOPRMSH2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1260_MST_SLO_PRMS_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_IFCTL.if_proc_typ,
							nullValue(),
							value(false),
							value(true)
						).as("edi_send_flg"),
						S0_SLO.slo_no,
						S0_SHIPPR.slo_d_no,
						S0_SLO.slo_dt,
						S0_SLO.cst_cd,
						S0_SLO.sls_usr_cd,
						S0_SLO.sls_dpt_cd,
						S0_DPT.dpt_nm.as("sls_dpt_nm"),
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
						S0_SHIPPR.trd_unit_qty.as("slo_trd_unit_qty"),
						S0_SLOD.trd_unit_cd.as("slo_trd_unit_cd"),
						S0_SHIPPR.ship_pr_no,
						S0_SHIPPR.base_unit_cd,
						S0_PRMSP.dlv_inst_rcpt_no,
						trunc(
							S0_INSTRCPT.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_INSTRCPT.dlv_rqst_tm.as("dlv_inst_hm"),
						S0_INSTRCPT.trd_unit_qty.as("dlv_inst_qty"),
						S0_INSTRCPT.cst_dlv_inst_no,
						S0_INSTRCPT.cst_dlv_inst_rev,
						S0_INSTRCPT.cst_dlv_inst_d_no,
						S0_PRMSP.trd_unit_prms_qty.as("trd_unit_prms_qty"),
						S0_PRMSP.slo_prms_no,
						S0_PRMSP.slo_prms_rev,
						trunc(
							S0_PRMSP.prms_dlv_tm,
							MCDateFmt.DD
						).as("prms_dlv_dt"),
						S0_PRMSP.prms_dlv_tm.as("prms_dlv_hm"),
						S1_SLOPRMSH.pr("can_flg"),
						decode(
							S0_PRMSP.slo_prms_no,
							nullValue(),
							nullValue(),
							S1_SLOPRMSH.pr("slo_prms_h_no")
						).as("slo_prms_h_no"),
						S1_SLOPRMSH.pr("slo_prms_h_no").as("org_slo_prms_h_no"),
						decode(
							S0_PRMSP.slo_prms_no,
							nullValue(),
							toDate(nullValue(), MCDateTimeFmt.YYYY,	MCDateTimeFmt.MM,MCDateTimeFmt.DD),
							S1_SLOPRMSH.pr("prms_prnt_tm")
						).as("prms_prnt_tm"),
						decode(
							S0_PRMSP.slo_prms_no,
							nullValue(),
							nullValue(),
							decode(S0_PRMSP.slo_prms_no,
									nullValue(),
									decode(S1_SLOPRMSH.pr("last_prms_rev"),
											nullValue(),
											value(1),
											S1_SLOPRMSH.pr("last_prms_rev").add(value(1))),
									decode(S1_SLOPRMSH.pr("slo_prms_prnt_flg"),
											value(true),
											S1_SLOPRMSH.pr("last_prms_rev"),
											decode(S1_SLOPRMSH.pr("last_prms_rev"),
													nullValue(),
													value(1),
													S1_SLOPRMSH.pr("last_prms_rev").add(value(1)))))
						).as("last_prms_rev"),
						decode(
							S0_PRMSP.slo_prms_no,
							nullValue(),
							value(false),
							S1_SLOPRMSH.pr("slo_prms_prnt_flg")
						).as("slo_prms_prnt_flg"),
						S1_SLOPRMSH.pr("edi_prms_flg"),
						S0_PRMSP.prms_rmrks,
						S0_PRMSP.intr_rmrks,
						S0_PRMSP.sub_char1,
						S0_PRMSP.sub_char2,
						S0_PRMSP.sub_char3,
						S0_PRMSP.ins_usr_id,
						S0_PRMSP.ins_usr_nm,
						S0_PRMSP.ins_func_id,
						S0_PRMSP.ins_ts,
						S0_PRMSP.upd_usr_id,
						S0_PRMSP.upd_usr_nm,
						S0_PRMSP.upd_func_id,
						S0_PRMSP.upd_ts,
						S0_PRMSP.upd_srv_req_no,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr"),
						addDynamicSelect(DS0D),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_PRMSP
						.innerJoin(S0_PRMSH).on(
							bracket(
								S0_PRMSH.slo_prms_h_no.eq(S0_PRMSP.slo_prms_h_no)
								.and(S0_PRMSH.slo_prms_rev.eq(S0_PRMSP.slo_prms_rev))
							)
						)
						.innerJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_PRMSP.slo_d_no)
							)
						)
						.innerJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.innerJoin(S0_SHIPPR).on(
							bracket(
								S0_SHIPPR.slo_d_no.eq(S0_PRMSP.slo_d_no)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								S0_PRMSH.slo_d_no,
								S0_PRMSH.slo_prms_h_no,
								S0_PRMSH.slo_prms_rev,
								S0_PRMSH.can_flg,
								S0_PRMSH.edi_prms_flg,
								S0_PRMSH.slo_prms_prnt_flg,
								S0_PRMSH.last_prms_rev,
								S0_PRMSH.prms_prnt_tm
							)
							.from(
								subQuery()
								.select(
									S0_SLOPRMSH.slo_d_no,
									max(S0_SLOPRMSH.slo_prms_rev).as("slo_prms_rev")
								)
								.from(S0_SLOPRMSH)
								.groupBy(S0_SLOPRMSH.slo_d_no).view(S1_PRMSH)
								.innerJoin(S0_PRMSH).on(
									S1_PRMSH.pr(S0_SLOPRMSH.slo_d_no).eq(S0_PRMSH.slo_d_no)
									.and(S1_PRMSH.pr("slo_prms_rev").eq(S0_PRMSH.slo_prms_rev))
								)
							).view(S1_SLOPRMSH)
						).on(
							bracket(
								bracket(
									S0_SLOD.slo_d_no.eq(S1_SLOPRMSH.pr(S0_PRMSH.slo_d_no))
									.and(S0_PRMSP.slo_prms_h_no.eq(S1_SLOPRMSH.pr(S0_PRMSH.slo_prms_h_no)))
									.and(S0_PRMSP.slo_prms_rev.eq(S1_SLOPRMSH.pr(S0_PRMSH.slo_prms_rev)))
								)
							)
						)
						.leftOuterJoin(S0_INSTRCPT).on(
							bracket(
								S0_PRMSP.dlv_inst_rcpt_no.eq(S0_INSTRCPT.dlv_inst_rcpt_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_SLO.sls_dpt_cd)
							)
						)
						.leftOuterJoin(S0_ITM).on(
							bracket(
								S0_SLOD.itm_cd.eq(S0_ITM.itm_cd)
								.and(S0_SLOD.itm_sub1.eq(S0_ITM.itm_sub1))
								.and(S0_SLOD.itm_sub2.eq(S0_ITM.itm_sub2))
								.and(S0_SLOD.itm_sub3.eq(S0_ITM.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DPT).on(
							bracket(
								S0_SLO.sls_dpt_cd.eq(S0_DPT.dpt_cd)
								.and(S0_SLO.slo_dt.between(S0_DPT.st_dt, S0_DPT.end_dt))
							)
						)
						.leftOuterJoin(S0_IFCTL).on(
							bracket(
								S0_IFCTL.bp_cd.eq(S0_SLO.cst_cd)
								.and(S0_IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value())))
								.and(bind("today").between(S0_IFCTL.st_dt, S0_IFCTL.end_dt))
								.and(S0_IFCTL.del_flg.eq(value(false)))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0D)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_SLO.slo_no.isNotNull())
						.and(S0_SHIPPR.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
						.and(
							bracket(
								bind("prms_not_prnted").eq(value(true))
								.and(bind("prms_prnted").eq(value(true)))
							)
							.or(
								bind("prms_not_prnted").eq(value(true))
								.and(S1_SLOPRMSH.pr("slo_prms_prnt_flg").eq(value(false)))
							)
							.or(
								bind("prms_prnted").eq(value(true))
								.and(S1_SLOPRMSH.pr("slo_prms_prnt_flg").eq(value(true)))
							)
						)
						.and(
							bracket(
								bind("trnst_flg_str").eq(value(false))
								.cutoff$and(S1_SLOPRMSH.pr("edi_prms_flg").eq(bind("edi_flg_str")))
							)
							.or(
								bind("trnst_flg_str").eq(value(true))
								.cutoff$and(decode(
									S0_IFCTL.if_proc_typ,
									nullValue(),
									value(false),
									value(true)
								).eq(bind("edi_flg_str")))
							)
						)
						.cutoff$and(S0_SLO.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_SLO.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_INSTRCPT.dlv_rqst_tm.gte(bind("dlv_inst_hm_fr")))
						.cutoff$and(S0_INSTRCPT.dlv_rqst_tm.lte(bind("dlv_inst_hm_to")))
						.cutoff$and(S0_SHIPSCHD.ship_rqst_tm.gte(bind("ship_rqst_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.ship_rqst_tm.lte(bind("ship_rqst_hm_to")))
						.cutoff$and(S0_SHIPSCHD.pd_inst_dlv_tm.gte(bind("pd_inst_dlv_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.pd_inst_dlv_tm.lte(bind("pd_inst_dlv_hm_to")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_SHIPSCHD.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_SHIPSCHD.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_PRMSP.prms_dlv_tm.gte(bind("prms_hm_fr")))
						.cutoff$and(S0_PRMSP.prms_dlv_tm.lte(bind("prms_hm_to")))
						.cutoff$and(S0_SLO.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_SLOD.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_SLOD.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_SLOD.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_SLOD.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_SLOD.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_SLOD.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_SLO.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_SHIPPR.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_SLO.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_SLOD.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_INSTRCPT.cst_dlv_inst_no.like(bind("cst_dlv_inst_no")))
						.cutoff$and(S0_INSTRCPT.cst_dlv_inst_d_no.like(bind("cst_dlv_inst_d_no")))
						.cutoff$and(S0_SHIPSCHD.ship_schd_no.like(bind("ship_schd_no")))
						.cutoff$and(S0_PRMSP.slo_prms_no.like(bind("slo_prms_no")))
						.cutoff$and(S0_PRMSP.prms_rmrks.like(bind("prms_rmrks")))
						.cutoff$and(S0_PRMSP.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_PRMSP.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_PRMSP.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_PRMSP.sub_char3.like(bind("sub_char3")))
						.and(
							bind("incl_can_flg").eq(value(true))
							.or(
								bind("incl_can_flg").eq(value(false))
								.and(S1_SLOPRMSH.pr("can_flg").eq(value(false)))
							)
						)
						.cutoff$and(
							decode(
								S0_PRMSP.slo_prms_no,
								nullValue(),
								nullValue(),
								S1_SLOPRMSH.pr("slo_prms_h_no")
							).like(bind("slo_prms_h_no"))
						)
						.cutoff$and(
							nvl(
								S0_SHIPSCHD.dlv_cd,
								S0_SLOD.dlv_cd
							).like(bind("dlv_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_SHIPSCHD.dlv_cd,
								nvl(
									S0_SHIPSCHD.dlv_nm,
									S0_DLV.bp_nm
								),
								nvl(
									S0_SLOD.dlv_nm,
									S0_DLV.bp_nm
								)
							).like(bind("dlv_nm"))
						)
						.addDynamicPredicate()
						.addDynamicPredicate(DS0D)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_SLO.slo_no.asc(),
						S0_SLOD.slo_d_no.asc(),
						S0_PRMSP.slo_prms_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITMTYP).on(S0_ITMTYP.itm_typ.eq(S0_ITM.itm_typ).and(S0_ITMTYP.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITMTYP.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ship_schd_flg_str"))
					.select(DS0D, 
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.pr_sts_typ)
							.otherwise(nullValue()).as("pr_sts_typ"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.ship_schd_no)
							.otherwise(nullValue()).as("ship_schd_no"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.ship_fr_lg_grp_cd)
							.otherwise(nullValue()).as("ship_fr_lg_grp_cd"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.wg_cd)
							.otherwise(nullValue()).as("ship_fr_lg_grp_wg_cd"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(trunc(
									S0_SHIPSCHD.ship_rqst_tm,
									MCDateFmt.DD
								))
							.otherwise(nullValue()).as("ship_rqst_dt"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.ship_rqst_tm)
							.otherwise(nullValue()).as("ship_rqst_hm"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(trunc(
									S0_SHIPSCHD.pd_inst_dlv_tm,
									MCDateFmt.DD
								))
							.otherwise(nullValue()).as("pd_inst_dlv_dt"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.pd_inst_dlv_tm)
							.otherwise(nullValue()).as("pd_inst_dlv_hm"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(trunc(
									S0_SHIPSCHD.ship_schd_tm,
									MCDateFmt.DD
								))
							.otherwise(nullValue()).as("ship_schd_dt"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.ship_schd_tm)
							.otherwise(nullValue()).as("ship_schd_hm"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(trunc(
									S0_SHIPSCHD.dlv_schd_tm,
									MCDateFmt.DD
								))
							.otherwise(nullValue()).as("dlv_schd_dt"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.dlv_schd_tm)
							.otherwise(nullValue()).as("dlv_schd_hm"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(nvl(
									S0_SHIPSCHD.dlv_cd,
									S0_SLOD.dlv_cd
								))
							.otherwise(nullValue()).as("dlv_cd"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(nvl2(
									S0_SHIPSCHD.dlv_cd,
									nvl(
										S0_SHIPSCHD.dlv_nm,
										S0_DLV.bp_nm
									),
									nvl(
										S0_SLOD.dlv_nm,
										S0_DLV.bp_nm
									)
								))
							.otherwise(nullValue()).as("dlv_nm"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(S0_SHIPSCHD.trd_unit_cd)
							.otherwise(nullValue()).as("trd_unit_cd"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(decode(
									S0_SHIPSCHD.trd_unit_qty,
									nullValue(),
									value(0),
									S0_SHIPSCHD.trd_unit_qty
								))
							.otherwise(nullValue()).as("trd_unit_qty"),
						cases()
							.when(bind("ship_schd_flg_str").eq(value(true)))
							.then(nvl2(
									S0_SHIPSCHD.ship_schd_no,	
									S0_SHIPSCHD.trd_unit_qty,
									S0_PRMSP.trd_unit_prms_qty
								))
							.otherwise(nullValue()).as("trd_unit_prms_qty")
					)
					.view(DS0D, v -> v.leftOuterJoin(S0_SHIPSCHD).on(
						bracket(
							S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no)
							.and(S0_PRMSP.slo_prms_no.eq(S0_SHIPSCHD.slo_prms_no))
						)
					)
					.leftOuterJoin(S0_DLV).on(
						S0_DLV.bp_cd.eq(
							nvl(
								S0_SHIPSCHD.dlv_cd,
								S0_SLOD.dlv_cd
							)
						)
					)),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_CST).on(bracket(S0_CST.bp_cd.eq(S0_SLO.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd1.as("itm_grp_cd1"), S0_MM_ITM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM1).on(S0_ITM.itm_grp_cd1.eq(S0_MM_ITM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM_ITM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM_ITM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd2.as("itm_grp_cd2"), S0_MM_ITM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM2).on(S0_ITM.itm_grp_cd2.eq(S0_MM_ITM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM_ITM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM_ITM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd3.as("itm_grp_cd3"), S0_MM_ITM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM3).on(S0_ITM.itm_grp_cd3.eq(S0_MM_ITM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM_ITM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM_ITM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd4.as("itm_grp_cd4"), S0_MM_ITM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM4).on(S0_ITM.itm_grp_cd4.eq(S0_MM_ITM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM_ITM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM_ITM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd5.as("itm_grp_cd5"), S0_MM_ITM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM5).on(S0_ITM.itm_grp_cd5.eq(S0_MM_ITM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM_ITM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM_ITM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd6.as("itm_grp_cd6"), S0_MM_ITM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM6).on(S0_ITM.itm_grp_cd6.eq(S0_MM_ITM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM_ITM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM_ITM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd7.as("itm_grp_cd7"), S0_MM_ITM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM7).on(S0_ITM.itm_grp_cd7.eq(S0_MM_ITM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM_ITM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM_ITM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd8.as("itm_grp_cd8"), S0_MM_ITM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM8).on(S0_ITM.itm_grp_cd8.eq(S0_MM_ITM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM_ITM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM_ITM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd9.as("itm_grp_cd9"), S0_MM_ITM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM9).on(S0_ITM.itm_grp_cd9.eq(S0_MM_ITM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM_ITM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM_ITM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_ITM.itm_grp_cd10.as("itm_grp_cd10"), S0_MM_ITM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM_ITM10).on(S0_ITM.itm_grp_cd10.eq(S0_MM_ITM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM_ITM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM_ITM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_DLV.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_DLV.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_DLV.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_DLV.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_DLV.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_DLV.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_DLV.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_DLV.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_DLV.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_DLV.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_DLV.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd1.as("cst_grp_cd1"), S0_MM_CST1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST1).on(S0_CST.bp_grp_cd1.eq(S0_MM_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_CST1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM_CST1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd2.as("cst_grp_cd2"), S0_MM_CST2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST2).on(S0_CST.bp_grp_cd2.eq(S0_MM_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_CST2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM_CST2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd3.as("cst_grp_cd3"), S0_MM_CST3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST3).on(S0_CST.bp_grp_cd3.eq(S0_MM_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_CST3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM_CST3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd4.as("cst_grp_cd4"), S0_MM_CST4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST4).on(S0_CST.bp_grp_cd4.eq(S0_MM_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_CST4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM_CST4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd5.as("cst_grp_cd5"), S0_MM_CST5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST5).on(S0_CST.bp_grp_cd5.eq(S0_MM_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_CST5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM_CST5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd6.as("cst_grp_cd6"), S0_MM_CST6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST6).on(S0_CST.bp_grp_cd6.eq(S0_MM_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_CST6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM_CST6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd7.as("cst_grp_cd7"), S0_MM_CST7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST7).on(S0_CST.bp_grp_cd7.eq(S0_MM_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_CST7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM_CST7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd8.as("cst_grp_cd8"), S0_MM_CST8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST8).on(S0_CST.bp_grp_cd8.eq(S0_MM_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_CST8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM_CST8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd9.as("cst_grp_cd9"), S0_MM_CST9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST9).on(S0_CST.bp_grp_cd9.eq(S0_MM_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_CST9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM_CST9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_CST.bp_grp_cd10.as("cst_grp_cd10"), S0_MM_CST10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST10).on(S0_CST.bp_grp_cd10.eq(S0_MM_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_CST10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM_CST10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("slo_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("slo_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("slo_trd_unit_dec_place", m.dec_place());
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
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
					})
				)
			);
	}

	/**
	 * -- MSBBL1260_MST_SLO_PRMS_Query_S02
	 */
	static MCQueryPlan MSBBL1260_MST_SLO_PRMS_S02() {
		MST_SLO_PRMS_P_R S0_PRMS = MST_SLO_PRMS_P_R.create("PRMS");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1260_MST_SLO_PRMS_Query_S02")
					.mainQuery()
					.select(max(S0_PRMS.slo_prms_rev).as("slo_prms_rev"))
					.from(S0_PRMS)
					.where(
						value(0).eq(value(0))
						.and(S0_PRMS.slo_d_no.eq(bind("slo_d_no")))
					)
			);
	}
	
	/**
	 * -- MSBBL1260_MST_SLO_PRMS_Query_S03
	 */
	static MCQueryPlan MSBBL1260_MST_SLO_PRMS_S03() {
		MST_SLO_PRMS_R S0_PRMS = MST_SLO_PRMS_R.create("PRMS");
		MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");
		MSW_SLO_D_KEY_R S0_WK = MSW_SLO_D_KEY_R.create("WK");
		MST_SLO_R S0_SLO = MST_SLO_R.create("SLO");
		MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
		MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
		MST_SLO_PRMS_H_R S0_PRMSH = MST_SLO_PRMS_H_R.create("PRMSH");
		MST_DLV_INST_RCPT_R S0_INSTRCPT = MST_DLV_INST_RCPT_R.create("INSTRCPT");
		MST_SHIP_SCHD_R W1_SHIPSCHD = MST_SHIP_SCHD_R.create("W1_SHIPSCHD");
		MST_SHIP_SCHD_R W2_SHIPSCHD = MST_SHIP_SCHD_R.create("W2_SHIPSCHD");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1260_MST_SLO_PRMS_Query_S03")
					.mainQuery()
					.select(
						S0_SLO.slo_no,
						S0_SHIPPR.slo_d_no,
						S0_SLO.slo_dt,
						S0_SLO.cst_cd,
						S0_SLO.sls_usr_cd,
						S0_SLO.sls_dpt_cd,
						S0_SLOD.itm_cd,
						S0_SLOD.itm_sub1,
						S0_SLOD.itm_sub2,
						S0_SLOD.itm_sub3,
						nvl(S0_SHIPSCHD.trd_unit_cd,
							nvl(subQuery()
									.select(max(W1_SHIPSCHD.trd_unit_cd))
									.from(W1_SHIPSCHD)
									.where(W1_SHIPSCHD.slo_prms_no.eq(S0_SHIPSCHD.slo_prms_no)),
								nvl(subQuery()
										.select(max(W2_SHIPSCHD.trd_unit_cd))
										.from(W2_SHIPSCHD)
										.where(W2_SHIPSCHD.dlv_inst_rcpt_no.eq(S0_SHIPSCHD.dlv_inst_rcpt_no)),
									S0_SHIPPR.trd_unit_cd)
							)
						).as("trd_unit_cd"),
						S0_SHIPPR.base_unit_cd,
						S0_SHIPSCHD.dlv_inst_rcpt_no,
						S0_INSTRCPT.dlv_rqst_tm,
						S0_INSTRCPT.trd_unit_qty.as("dlv_inst_qty"),
						S0_SHIPSCHD.ship_schd_no,
						S0_SHIPSCHD.ship_pr_no,
						S0_SHIPSCHD.ship_fr_lg_grp_cd,
						S0_SHIPSCHD.wg_cd.as("ship_fr_lg_grp_wg_cd"),
						S0_SHIPSCHD.ship_rqst_tm,
						S0_SHIPSCHD.pd_inst_dlv_tm,
						S0_SHIPSCHD.ship_schd_tm,
						S0_SHIPSCHD.dlv_schd_tm,
						S0_SHIPSCHD.trd_unit_qty,
						nvl2(
							S0_SHIPSCHD.ship_schd_no,	
							S0_SHIPSCHD.trd_unit_qty,
							S0_PRMS.trd_unit_prms_qty
						).as("trd_unit_prms_qty"),
						S0_PRMS.slo_prms_no,
						S0_PRMS.slo_prms_rev,
						S0_PRMS.prms_dlv_tm,
						S0_PRMSH.slo_prms_h_no,
						S0_PRMSH.slo_prms_h_no.as("org_slo_prms_h_no"),
						S0_PRMSH.prms_prnt_tm,
						S0_PRMSH.last_prms_rev,
						S0_PRMSH.slo_prms_prnt_flg,
						S0_PRMSH.edi_prms_flg,
						S0_PRMS.prms_rmrks,
						S0_PRMS.intr_rmrks,
						S0_PRMS.sub_char1,
						S0_PRMS.sub_char2,
						S0_PRMS.sub_char3,
						S0_PRMS.ins_usr_id,
						S0_PRMS.ins_usr_nm,
						S0_PRMS.ins_func_id,
						S0_PRMS.ins_ts,
						S0_PRMS.upd_usr_id,
						S0_PRMS.upd_usr_nm,
						S0_PRMS.upd_func_id,
						S0_PRMS.upd_ts,
						S0_PRMS.upd_srv_req_no,
						S0_SHIPPR.upd_cntr.as("ship_pr_upd_cntr")
					)
					.from(
						S0_PRMS
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.slo_d_no.eq(S0_PRMS.slo_d_no)
							)
						)
						.innerJoin(S0_SLOD).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_PRMS.slo_d_no)
							)
						)
						.innerJoin(S0_SLO).on(
							bracket(
								S0_SLO.slo_no.eq(S0_SLOD.slo_no)
							)
						)
						.innerJoin(S0_SHIPPR).on(
							bracket(
								S0_SHIPPR.slo_d_no.eq(S0_PRMS.slo_d_no)
							)
						)
						.leftOuterJoin(S0_SHIPSCHD).on(
							bracket(
								S0_SHIPSCHD.ship_pr_no.eq(S0_SHIPPR.ship_pr_no)
								.and(S0_PRMS.slo_prms_no.eq(S0_SHIPSCHD.slo_prms_no))
							)
						)
						.leftOuterJoin(S0_PRMSH).on(
							bracket(
								S0_SLOD.slo_d_no.eq(S0_PRMSH.slo_d_no)
								.and(S0_PRMSH.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_INSTRCPT).on(
							bracket(
								S0_SHIPSCHD.dlv_inst_rcpt_no.eq(S0_INSTRCPT.dlv_inst_rcpt_no)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_SLO.slo_no.isNotNull())
						.and(S0_SHIPPR.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
						.and(S0_PRMS.can_flg.eq(value(false)))
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
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
}