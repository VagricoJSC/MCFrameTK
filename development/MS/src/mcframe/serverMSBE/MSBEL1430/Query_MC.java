package mcframe.serverMSBE.MSBEL1430;

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
	 * -- MSBEL1430_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1430_MST_SHIP_SCHD_S01() {
		MCTempView S0_W = createTempView("W");
		MST_SHIP_SCHD_R S1_T1 = MST_SHIP_SCHD_R.create("T1");
		MAVM_RD_LG_GRP_R S1_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MST_SHIP_PR_R S1_T2 = MST_SHIP_PR_R.create("T2");
		MAM_SHIP_WK_R S1_M1 = MAM_SHIP_WK_R.create("M1");
		MAM_LG_CTL_R S1_M2 = MAM_LG_CTL_R.create("M2");
		MAM_LG_CTL_R S1_M3 = MAM_LG_CTL_R.create("M3");
		MCTempView S1_T8 = createTempView("T8");
		MAM_SHIP_WK_GRP_R S1_M4 = MAM_SHIP_WK_GRP_R.create("M4");
		MAM_SHIP_WK_GRP_R S1_M5 = MAM_SHIP_WK_GRP_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MST_SHIP_ALLOC_STS_R S2_T81 = MST_SHIP_ALLOC_STS_R.create("T81");
		MST_SHIP_SCHD_R S2_T82 = MST_SHIP_SCHD_R.create("T82");
		MAVM_ITM_UNIT_R S2_M81 = MAVM_ITM_UNIT_R.create("M81");
		MST_SHIP_INST_R S3_T1 = MST_SHIP_INST_R.create("T1");
		MST_SHIP_INST_D_R S3_T2 = MST_SHIP_INST_D_R.create("T2");
		MAVM_RD_LG_GRP_R S3_RD1 = MAVM_RD_LG_GRP_R.create("RD1");
		MAM_SHIP_WK_R S3_M1 = MAM_SHIP_WK_R.create("M1");
		MAM_LG_CTL_R S3_M2 = MAM_LG_CTL_R.create("M2");
		MAM_LG_CTL_R S3_M3 = MAM_LG_CTL_R.create("M3");
		MCTempView S3_T3 = createTempView("T3");
		MAM_SHIP_WK_GRP_R S3_M4 = MAM_SHIP_WK_GRP_R.create("M4");
		MAM_SHIP_WK_GRP_R S3_M5 = MAM_SHIP_WK_GRP_R.create("M5");
		MAM_LG_GRP_R S3_M6 = MAM_LG_GRP_R.create("M6");
		MST_SHIP_INST_D_R S4_TB1 = MST_SHIP_INST_D_R.create("TB1");
		MST_SHIP_ALLOC_STS_R S4_TB2 = MST_SHIP_ALLOC_STS_R.create("TB2");
		MAVM_ITM_UNIT_R S4_TB5 = MAVM_ITM_UNIT_R.create("TB5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1430_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_W.pr("pr_sts_typ"),
						S0_W.pr("lg_grp_cd"),
						S0_W.pr(S1_M6.lg_grp_nm),
						S0_W.pr("ship_schd_dt"),
						S0_W.pr("ship_schd_hm"),
						S0_W.pr("dlv_schd_dt"),
						S0_W.pr("dlv_schd_hm"),
						S0_W.pr(S1_T1.ship_wk_cd),
						S0_W.pr(S1_M1.ship_wk_nm),
						countAll().as("cnt"),
						sum(S0_W.pr("cnt")).as("d_cnt"),
						sum(S0_W.pr("wt")).as("wt"),
						sum(S0_W.pr("dim")).as("dim"),
						value(0).as("not_inst_ship_to_cnt"),
						value(0).as("not_inst_d_cnt"),
						value(0).as("not_inst_wt"),
						value(0).as("not_inst_dim"),
						value(0).as("inst_ship_to_cnt"),
						value(0).as("inst_d_cnt"),
						value(0).as("inst_wt"),
						value(0).as("inst_dim")
					)
					.from(
						subQuery()
						.select(
							value(true).as("pr_sts_typ"),
							S1_T1.ship_fr_lg_grp_cd.as("lg_grp_cd"),
							S1_M6.lg_grp_nm,
							trunc(
								S1_T1.ship_schd_tm,
								MCDateFmt.DD
							).as("ship_schd_dt"),
							S1_T1.ship_schd_tm.as("ship_schd_hm"),
							trunc(
								S1_T1.dlv_schd_tm,
								MCDateFmt.DD
							).as("dlv_schd_dt"),
							S1_T1.dlv_schd_tm.as("dlv_schd_hm"),
							S1_T1.ship_wk_cd,
							S1_M1.ship_wk_nm,
							nvl2(
								S1_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T2.ship_to_id_typ
							).as("ship_to_id_typ"),
							nvl(
								nvl(
									S1_T1.tdlv_cd,
									decode(
										S1_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S1_T1.dlv_cd,
										nullValue()
									)
								),
								S1_T2.ship_to_id_cd
							).as("ship_to_id_cd"),
							countAll().as("cnt"),
							sum(S1_T8.pr("wt")).as("wt"),
							sum(S1_T8.pr("dim")).as("dim")
						)
						.from(
							S1_T1
							.innerJoin(S1_RD1).on(
								bracket(
									S1_RD1.lg_grp_cd.eq(S1_T1.ship_fr_lg_grp_cd)
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.ship_pr_no.eq(S1_T1.ship_pr_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.ship_wk_cd.eq(S1_T1.ship_wk_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.fr_lg_grp_cd.eq(S1_T1.ship_fr_lg_grp_cd)
									.and(S1_M2.to_lg_grp_cd.eq(S1_T2.ship_to_lg_grp_cd))
									.and(S1_M2.ship_term_cd.eq(S1_T1.ship_term_cd))
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.fr_lg_grp_cd.eq(S1_T1.ship_fr_lg_grp_cd)
									.and(S1_M3.to_lg_grp_cd.eq(S1_T2.ship_to_lg_grp_cd))
									.and(S1_M3.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
								)
							)
							.leftOuterJoin(
								subQuery()
								.select(
									S2_T81.ship_schd_no,
									sum(
										nvl(
											S2_M81.unit_wt,
											value(0)
										).multiply(S2_T81.ent_unit_qty)
									).as("wt"),
									sum(
										nvl(
											S2_M81.unit_dim,
											value(0)
										).multiply(S2_T81.ent_unit_qty)
									).as("dim")
								)
								.from(
									S2_T81
									.innerJoin(S2_T82).on(
										bracket(
											S2_T81.ship_schd_no.eq(S2_T82.ship_schd_no)
										)
									)
									.leftOuterJoin(S2_M81).on(
										bracket(
											S2_T82.itm_cd.eq(S2_M81.itm_cd)
											.and(S2_T82.itm_sub1.eq(S2_M81.itm_sub1))
											.and(S2_T82.itm_sub2.eq(S2_M81.itm_sub2))
											.and(S2_T82.itm_sub3.eq(S2_M81.itm_sub3))
											.and(S2_T81.ent_unit_cd.eq(S2_M81.unit_cd))
										)
									)
								)
								.groupBy(S2_T81.ship_schd_no).view(S1_T8)
							).on(
								bracket(
									S1_T1.ship_schd_no.eq(S1_T8.pr(S2_T81.ship_schd_no))
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.ship_wk_grp_cd.eq(S1_M2.ship_wk_grp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.ship_wk_grp_cd.eq(S1_M3.ship_wk_grp_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M6.lg_grp_cd.eq(S1_T1.ship_fr_lg_grp_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())))
							.and(S1_T1.abort_flg.eq(value(false)))
							.and(S1_T1.ship_skip_flg.eq(value(false)))
							.cutoff$and(S1_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(
								decode(
									S1_M2.ship_term_cd,
									nullValue(),
									S1_M3.ship_wk_grp_cd,
									S1_M2.ship_wk_grp_cd
								).like(bind("ship_wk_grp_cd"))
							)
							.cutoff$and(
								decode(
									S1_M2.ship_term_cd,
									nullValue(),
									S1_M5.ship_wk_grp_nm,
									S1_M4.ship_wk_grp_nm
								).like(bind("ship_wk_grp_nm"))
							)
							.cutoff$and(S1_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
							.cutoff$and(S1_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
							.cutoff$and(
								S1_T1.ship_abl_flg.eq(value(true))
								.and(bind("ship_abl_only_flg_str").eq(value(true)))
							)
							.cutoff$and(
								bracket(
									bracket(
										bind("not_alloc_flg_str").eq(value(true))
										.and(
											S1_T2.alloc_typ.in(
												value(MAC_ALLOC_TYP.IMMED.value()),
												value(MAC_ALLOC_TYP.LATER.value())
											)
											.or(S1_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value())))
											.and(S1_T2.xfr_schd_no.isNotNull())
										)
										.and(S1_T1.alloc_qty.eq(value(0)))
									)
									.or(
										bind("part_alloc_flg_str").eq(value(true))
										.and(S1_T1.base_unit_qty.gt(S1_T1.alloc_qty))
										.and(S1_T1.alloc_qty.gt(value(0)))
									)
									.or(
										bind("all_alloc_flg_str").eq(value(true))
										.and(S1_T1.alloc_qty.eq(S1_T1.base_unit_qty))
									)
									.or(
										bind("alloc_invalid_flg_str").eq(value(true))
										.and(
											S1_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
											.and(S1_T2.xfr_schd_no.isNull())
											.or(S1_T2.alloc_typ.isNull())
										)
										.and(S1_T1.alloc_qty.eq(value(0)))
									)
								)
							)
						)
						.groupBy(
							S1_T1.pr_sts_typ,
							S1_T1.ship_fr_lg_grp_cd,
							S1_M6.lg_grp_nm,
							trunc(
								S1_T1.ship_schd_tm,
								MCDateFmt.DD
							),
							S1_T1.ship_schd_tm,
							trunc(
								S1_T1.dlv_schd_tm,
								MCDateFmt.DD
							),
							S1_T1.dlv_schd_tm,
							S1_T1.ship_wk_cd,
							S1_M1.ship_wk_nm,
							nvl2(
								S1_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S1_T2.ship_to_id_typ
							),
							nvl(
								nvl(
									S1_T1.tdlv_cd,
									decode(
										S1_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S1_T1.dlv_cd,
										nullValue()
									)
								),
								S1_T2.ship_to_id_cd
							)
						)
						.unionAll(
							subQuery()
							.select(
								value(false).as("pr_sts_typ"),
								S3_T1.ship_fr_lg_grp_cd.as("lg_grp_cd"),
								S3_M6.lg_grp_nm,
								trunc(
									S3_T1.ship_schd_tm,
									MCDateFmt.DD
								).as("ship_schd_dt"),
								S3_T1.ship_schd_tm.as("ship_schd_hm"),
								trunc(
									S3_T1.dlv_schd_tm,
									MCDateFmt.DD
								).as("dlv_schd_dt"),
								S3_T1.dlv_schd_tm.as("dlv_schd_hm"),
								S3_T1.ship_wk_cd,
								S3_M1.ship_wk_nm,
								S3_T1.ship_to_id_typ,
								S3_T1.ship_to_id_cd,
								countAll().as("cnt"),
								sum(S3_T3.pr("wt")),
								sum(S3_T3.pr("dim"))
							)
							.from(
								S3_T1
								.innerJoin(S3_T2).on(
									bracket(
										S3_T1.ship_inst_no.eq(S3_T2.ship_inst_no)
									)
								)
								.innerJoin(S3_RD1).on(
									bracket(
										S3_RD1.lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
									)
								)
								.leftOuterJoin(S3_M1).on(
									bracket(
										S3_M1.ship_wk_cd.eq(S3_T1.ship_wk_cd)
									)
								)
								.leftOuterJoin(S3_M2).on(
									bracket(
										S3_M2.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
										.and(S3_M2.to_lg_grp_cd.eq(S3_T1.ship_to_lg_grp_cd))
										.and(S3_M2.ship_term_cd.eq(S3_T1.ship_term_cd))
									)
								)
								.leftOuterJoin(S3_M3).on(
									bracket(
										S3_M3.fr_lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
										.and(S3_M3.to_lg_grp_cd.eq(S3_T1.ship_to_lg_grp_cd))
										.and(S3_M3.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
									)
								)
								.leftOuterJoin(
									subQuery()
									.select(
										S4_TB1.ship_inst_d_no,
										sum(
											nvl(
												S4_TB5.unit_wt,
												value(0)
											).multiply(S4_TB2.ent_unit_qty)
										).as("wt"),
										sum(
											nvl(
												S4_TB5.unit_dim,
												value(0)
											).multiply(S4_TB2.ent_unit_qty)
										).as("dim")
									)
									.from(
										S4_TB1
										.leftOuterJoin(S4_TB2).on(
											bracket(
												S4_TB1.ship_inst_d_no.eq(S4_TB2.ship_inst_d_no)
											)
										)
										.leftOuterJoin(S4_TB5).on(
											bracket(
												S4_TB1.itm_cd.eq(S4_TB5.itm_cd)
												.and(S4_TB1.itm_sub1.eq(S4_TB5.itm_sub1))
												.and(S4_TB1.itm_sub2.eq(S4_TB5.itm_sub2))
												.and(S4_TB1.itm_sub3.eq(S4_TB5.itm_sub3))
												.and(S4_TB2.ent_unit_cd.eq(S4_TB5.unit_cd))
											)
										)
									)
									.where(
										S4_TB1.can_flg.eq(value(false))
									)
									.groupBy(S4_TB1.ship_inst_d_no).view(S3_T3)
								).on(
									bracket(
										S3_T2.ship_inst_d_no.eq(S3_T3.pr(S4_TB1.ship_inst_d_no))
									)
								)
								.leftOuterJoin(S3_M4).on(
									bracket(
										S3_M4.ship_wk_grp_cd.eq(S3_M2.ship_wk_grp_cd)
									)
								)
								.leftOuterJoin(S3_M5).on(
									bracket(
										S3_M5.ship_wk_grp_cd.eq(S3_M3.ship_wk_grp_cd)
									)
								)
								.leftOuterJoin(S3_M6).on(
									bracket(
										S3_M6.lg_grp_cd.eq(S3_T1.ship_fr_lg_grp_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_T1.can_flg.eq(value(false)))
								.and(S3_T2.can_flg.eq(value(false)))
								.cutoff$and(S3_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S3_M6.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(
									decode(
										S3_M2.ship_term_cd,
										nullValue(),
										S3_M3.ship_wk_grp_cd,
										S3_M2.ship_wk_grp_cd
									).like(bind("ship_wk_grp_cd"))
								)
								.cutoff$and(
									decode(
										S3_M2.ship_term_cd,
										nullValue(),
										S3_M5.ship_wk_grp_nm,
										S3_M4.ship_wk_grp_nm
									).like(bind("ship_wk_grp_nm"))
								)
								.cutoff$and(S3_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
								.cutoff$and(S3_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
							)
							.groupBy(
								S3_T1.ship_fr_lg_grp_cd,
								S3_M6.lg_grp_nm,
								trunc(
									S3_T1.ship_schd_tm,
									MCDateFmt.DD
								),
								S3_T1.ship_schd_tm,
								trunc(
									S3_T1.dlv_schd_tm,
									MCDateFmt.DD
								),
								S3_T1.dlv_schd_tm,
								S3_T1.ship_wk_cd,
								S3_M1.ship_wk_nm,
								S3_T1.ship_to_id_typ,
								S3_T1.ship_to_id_cd
							)
						).view(S0_W)
					)
					.groupBy(
						S0_W.pr("pr_sts_typ"),
						S0_W.pr("lg_grp_cd"),
						S0_W.pr(S1_M6.lg_grp_nm),
						S0_W.pr("ship_schd_dt"),
						S0_W.pr("ship_schd_hm"),
						S0_W.pr("dlv_schd_dt"),
						S0_W.pr("dlv_schd_hm"),
						S0_W.pr(S1_T1.ship_wk_cd),
						S0_W.pr(S1_M1.ship_wk_nm)
					)
			);
	}
	
}