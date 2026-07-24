package mcframe.serverMSBD.MSBDL5280;

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
	 * -- MSBDL5280_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBDL5280_MST_PO_S01() {
		MCTempView S0_V = createTempView("V");
		MST_PO_R S1_T1 = MST_PO_R.create("T1");
		MST_PO_D_R S1_T2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R S1_T5 = MST_ARR_PR_R.create("T5");
		MST_DLV_INST_R S1_T3 = MST_DLV_INST_R.create("T3");
		MST_DLV_INST_D_R S1_T4 = MST_DLV_INST_D_R.create("T4");
		MCTempView S1_V1 = createTempView("V1");
		MSW_PURC_FRCST_BAL_KEY_R S2_WK = MSW_PURC_FRCST_BAL_KEY_R.create("WK");
		MST_PO_R S3_T1 = MST_PO_R.create("T1");
		MST_PO_D_R S3_T2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R S3_T3 = MST_ARR_PR_R.create("T3");
		MCTempView S3_V1 = createTempView("V1");
		MCTempView S3_V2 = createTempView("V2");
		MSW_PURC_FRCST_BAL_KEY_R S4_WK = MSW_PURC_FRCST_BAL_KEY_R.create("WK");
		MST_DLV_INST_R S5_INST = MST_DLV_INST_R.create("INST");
		MST_DLV_INST_D_R S5_INSTD = MST_DLV_INST_D_R.create("INSTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PO_Query_S01")
					.mainQuery()
					.select(
						S0_V.pr(S1_T1.wg_cd),
						S0_V.pr(S1_T1.sppl_cd),
						S0_V.pr(S1_T2.itm_cd),
						S0_V.pr(S1_T2.itm_sub1),
						S0_V.pr(S1_T2.itm_sub2),
						S0_V.pr(S1_T2.itm_sub3),
						S0_V.pr("dlv_rqst_dt"),
						sum(S0_V.pr("base_unit_qty")).as("base_unit_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T1.wg_cd,
							S1_T1.sppl_cd,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							trunc(
								S1_T4.dlv_rqst_tm,
								MCDateFmt.DD
							).as("dlv_rqst_dt"),
							S1_T4.base_unit_qty.as("base_unit_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.po_no.eq(S1_T1.po_no)
								)
							)
							.innerJoin(S1_T5).on(
								bracket(
									S1_T5.po_d_no.eq(S1_T2.po_d_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T3.po_d_no.eq(S1_T2.po_d_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T4.dlv_inst_no.eq(S1_T3.dlv_inst_no)
								)
							)
							.innerJoin(
								subQuery()
								.select(
									S2_WK.wg_cd,
									S2_WK.sppl_cd,
									S2_WK.itm_cd,
									S2_WK.itm_sub1,
									S2_WK.itm_sub2,
									S2_WK.itm_sub3,
									min(S2_WK.ym).as("dt_fr"),
									max(S2_WK.ym).as("dt_to")
								)
								.from(S2_WK)
								.groupBy(
									S2_WK.wg_cd,
									S2_WK.sppl_cd,
									S2_WK.itm_cd,
									S2_WK.itm_sub1,
									S2_WK.itm_sub2,
									S2_WK.itm_sub3
								).view(S1_V1)
							).on(
								bracket(
									trunc(
										S1_T4.dlv_rqst_tm,
										MCDateFmt.DD
									).between(S1_V1.pr("dt_fr"), S1_V1.pr("dt_to"))
									.and(S1_V1.pr(S2_WK.wg_cd).eq(S1_T1.wg_cd))
									.and(S1_V1.pr(S2_WK.sppl_cd).eq(S1_T1.sppl_cd))
									.and(S1_V1.pr(S2_WK.itm_cd).eq(S1_T2.itm_cd))
									.and(S1_V1.pr(S2_WK.itm_sub1).eq(S1_T2.itm_sub1))
									.and(S1_V1.pr(S2_WK.itm_sub2).eq(S1_T2.itm_sub2))
									.and(S1_V1.pr(S2_WK.itm_sub3).eq(S1_T2.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.can_flg.eq(value(false)))
							.and(S1_T5.abort_flg.eq(value(false))
							.or(
								bracket(
									S1_T5.abort_flg.eq(value(true))
									.and(S1_T5.arr_schd_abort_qty.lt(S1_T5.base_unit_qty)
									.or(S1_T5.purc_schd_abort_qty.lt(S1_T5.base_unit_qty))))
								)
							)
							.and(
								S1_T1.aprv_flg.eq(value(false))
								.or(S1_T1.aprv_flg.eq(value(true)))
								.and(S1_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
							)
							.and(S1_T3.can_flg.eq(value(false)))
							.and(S1_T4.can_flg.eq(value(false)))
							.and(S1_T4.purc_act_d_no.isNull())
						)
						.unionAll(
							subQuery()
							.select(
								S3_T1.wg_cd,
								S3_T1.sppl_cd,
								S3_T2.itm_cd,
								S3_T2.itm_sub1,
								S3_T2.itm_sub2,
								S3_T2.itm_sub3,
								trunc(
									S3_T2.dlv_rqst_tm,
									MCDateFmt.DD
								).as("dlv_rqst_dt"),
								S3_T2.base_unit_qty.subtract(
									nvl(
										S3_V2.pr("base_unit_qty"),
										value(0)
									)
								).as("base_unit_qty")
							)
							.from(
								S3_T1
								.innerJoin(S3_T2).on(
									bracket(
										S3_T2.po_no.eq(S3_T1.po_no)
									)
								)
								.innerJoin(S3_T3).on(
									bracket(
										S3_T3.po_d_no.eq(S3_T2.po_d_no)
									)
								)
								.innerJoin(
									subQuery()
									.select(
										S4_WK.wg_cd,
										S4_WK.sppl_cd,
										S4_WK.itm_cd,
										S4_WK.itm_sub1,
										S4_WK.itm_sub2,
										S4_WK.itm_sub3,
										min(S4_WK.ym).as("dt_fr"),
										max(S4_WK.ym).as("dt_to")
									)
									.from(S4_WK)
									.groupBy(
										S4_WK.wg_cd,
										S4_WK.sppl_cd,
										S4_WK.itm_cd,
										S4_WK.itm_sub1,
										S4_WK.itm_sub2,
										S4_WK.itm_sub3
									).view(S3_V1)
								).on(
									bracket(
										trunc(
											S3_T2.dlv_rqst_tm,
											MCDateFmt.DD
										).between(S3_V1.pr("dt_fr"), S3_V1.pr("dt_to"))
										.and(S3_V1.pr(S4_WK.wg_cd).eq(S3_T1.wg_cd))
										.and(S3_V1.pr(S4_WK.sppl_cd).eq(S3_T1.sppl_cd))
										.and(S3_V1.pr(S4_WK.itm_cd).eq(S3_T2.itm_cd))
										.and(S3_V1.pr(S4_WK.itm_sub1).eq(S3_T2.itm_sub1))
										.and(S3_V1.pr(S4_WK.itm_sub2).eq(S3_T2.itm_sub2))
										.and(S3_V1.pr(S4_WK.itm_sub3).eq(S3_T2.itm_sub3))
									)
								)
								.leftOuterJoin(
									subQuery()
									.select(
										S5_INST.po_d_no,
										sum(S5_INSTD.base_unit_qty).as("base_unit_qty")
									)
									.from(
										S5_INST
										.innerJoin(S5_INSTD).on(
											bracket(
												S5_INST.dlv_inst_no.eq(S5_INSTD.dlv_inst_no)
											)
										)
									)
									.where(
										S5_INST.can_flg.eq(value(false))
										.and(S5_INSTD.purc_act_d_no.isNull())
										.and(S5_INSTD.can_flg.eq(value(false)))
									)
									.groupBy(S5_INST.po_d_no).view(S3_V2)
								).on(
									bracket(
										S3_T2.po_d_no.eq(S3_V2.pr(S5_INST.po_d_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_T1.can_flg.eq(value(false)))
								.and(S3_T3.abort_flg.eq(value(false))
								.or(
									bracket(
										S3_T3.abort_flg.eq(value(true))
										.and(S3_T3.arr_schd_abort_qty.lt(S3_T3.base_unit_qty)
										.or(S3_T3.purc_schd_abort_qty.lt(S3_T3.base_unit_qty))))
									)
								)								
								.and(
									S3_T1.aprv_flg.eq(value(false))
									.or(S3_T1.aprv_flg.eq(value(true)))
									.and(S3_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
								)
								.and(
									S3_T2.base_unit_qty.subtract(nvl(
											S3_V2.pr("base_unit_qty"),
											value(0)
										)).gt(value(0))
								)
							)
						).view(S0_V)
					)
					.groupBy(
						S0_V.pr(S1_T1.wg_cd),
						S0_V.pr(S1_T1.sppl_cd),
						S0_V.pr(S1_T2.itm_cd),
						S0_V.pr(S1_T2.itm_sub1),
						S0_V.pr(S1_T2.itm_sub2),
						S0_V.pr(S1_T2.itm_sub3),
						S0_V.pr("dlv_rqst_dt")
					)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PO_Query_S02
	 */
	static MCQueryPlan MSBDL5280_MST_PO_S02() {
		MCTempView S0_V = createTempView("V");
		MST_PO_R S1_T1 = MST_PO_R.create("T1");
		MST_PO_D_R S1_T2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R S1_T3 = MST_ARR_PR_R.create("T3");
		MST_DLV_INST_R S1_T4 = MST_DLV_INST_R.create("T4");
		MST_DLV_INST_D_R S1_T5 = MST_DLV_INST_D_R.create("T5");
		MCTempView S1_V1 = createTempView("V1");
		MST_PURC_FRCST_H_R S2_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_FIX_R S2_TF = MST_PURC_FRCST_FIX_R.create("TF");
		MST_PURC_FRCST_D_R S2_TD = MST_PURC_FRCST_D_R.create("TD");
		MCTempView S2_VH = createTempView("VH");
		MSW_PURC_FRCST_H_KEY_R S3_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S3_TH = MST_PURC_FRCST_H_R.create("TH");
		MSW_PURC_FRCST_H_KEY_R S4_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S4_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_H_R S4_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PO_R S5_T1 = MST_PO_R.create("T1");
		MST_PO_D_R S5_T2 = MST_PO_D_R.create("T2");
		MST_ARR_PR_R S5_T3 = MST_ARR_PR_R.create("T3");
		MCTempView S5_V1 = createTempView("V1");
		MCTempView S5_V2 = createTempView("V2");
		MST_PURC_FRCST_H_R S6_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_FIX_R S6_TF = MST_PURC_FRCST_FIX_R.create("TF");
		MST_PURC_FRCST_D_R S6_TD = MST_PURC_FRCST_D_R.create("TD");
		MCTempView S6_VH = createTempView("VH");
		MSW_PURC_FRCST_H_KEY_R S7_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S7_TH = MST_PURC_FRCST_H_R.create("TH");
		MSW_PURC_FRCST_H_KEY_R S8_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S8_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_H_R S8_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_DLV_INST_R S9_INST = MST_DLV_INST_R.create("INST");
		MST_DLV_INST_D_R S9_INSTD = MST_DLV_INST_D_R.create("INSTD");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PO_Query_S02")
					.mainQuery()
					.select(
						S0_V.pr(S1_T2.itm_cd),
						S0_V.pr(S1_T2.itm_sub1).as("itm_sub1_data"),
						S0_V.pr(S1_T2.itm_sub2).as("itm_sub2_data"),
						S0_V.pr(S1_T2.itm_sub3).as("itm_sub3_data"),
						S0_V.pr(S2_TD.pf_period_typ),
						S0_V.pr(S2_TD.pf_period_st_dt),
						S0_V.pr(S2_TD.pf_period_end_dt),
						sum(S0_V.pr("po_qty")).as("po_qty")
					)
					.from(
						subQuery()
						.select(
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_V1.pr(S2_TD.pf_period_typ),
							S1_V1.pr(S2_TD.pf_period_st_dt),
							S1_V1.pr(S2_TD.pf_period_end_dt),
							S1_T5.base_unit_qty.as("po_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.po_no.eq(S1_T1.po_no)
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T3.po_d_no.eq(S1_T2.po_d_no)
								)
							)
							.innerJoin(S1_T4).on(
								bracket(
									S1_T3.po_d_no.eq(S1_T4.po_d_no)
								)
							)
							.innerJoin(S1_T5).on(
								bracket(
									S1_T4.dlv_inst_no.eq(S1_T5.dlv_inst_no)
								)
							)
							.innerJoin(
								subQuery()
								.selectDistinct(
									S2_TH.sppl_cd,
									S2_TH.wg_cd,
									S2_TF.itm_cd,
									S2_TF.itm_sub1,
									S2_TF.itm_sub2,
									S2_TF.itm_sub3,
									S2_TD.pf_period_typ,
									S2_TD.pf_period_st_dt,
									S2_TD.pf_period_end_dt
								)
								.from(
									S2_TH
									.innerJoin(S2_TF).on(
										bracket(
											S2_TF.purc_frcst_no.eq(S2_TH.purc_frcst_no)
										)
									)
									.innerJoin(S2_TD).on(
										bracket(
											S2_TD.purc_frcst_fix_no.eq(S2_TF.purc_frcst_fix_no)
										)
									)
									.innerJoin(
										subQuery()
										.select(
											S3_TH.pf_dt,
											S3_TH.sppl_cd,
											S3_TH.wg_cd
										)
										.from(
											S3_WK
											.innerJoin(S3_TH).on(
												bracket(
													S3_TH.purc_frcst_no.eq(S3_WK.purc_frcst_no)
												)
											)
										)
										.union(
											subQuery()
											.select(
												max(S4_TH.pf_dt).as("pf_dt"),
												S4_TH.sppl_cd,
												S4_TH.wg_cd
											)
											.from(
												S4_WK
												.innerJoin(S4_T1).on(
													bracket(
														S4_T1.purc_frcst_no.eq(S4_WK.purc_frcst_no)
													)
												)
												.innerJoin(S4_TH).on(
													bracket(
														S4_TH.sppl_cd.eq(S4_T1.sppl_cd)
														.and(S4_TH.wg_cd.eq(S4_T1.wg_cd))
														.and(S4_TH.pf_dt.lt(S4_T1.pf_dt))
														.and(S4_TH.del_flg.eq(value(false)))
													)
												)
											)
											.groupBy(
												S4_TH.sppl_cd,
												S4_TH.wg_cd
											)
										).view(S2_VH)
									).on(
										bracket(
											S2_VH.pr(S3_TH.pf_dt).eq(S2_TH.pf_dt)
											.and(S2_VH.pr(S3_TH.sppl_cd).eq(S2_TH.sppl_cd))
											.and(S2_VH.pr(S3_TH.wg_cd).eq(S2_TH.wg_cd))
										)
									)
								).view(S1_V1)
							).on(
								bracket(
									trunc(
										S1_T5.dlv_rqst_tm,
										MCDateFmt.DD
									).between(S1_V1.pr(S2_TD.pf_period_st_dt), S1_V1.pr(S2_TD.pf_period_end_dt))
									.and(S1_V1.pr(S2_TH.wg_cd).eq(S1_T1.wg_cd))
									.and(S1_V1.pr(S2_TH.sppl_cd).eq(S1_T1.sppl_cd))
									.and(S1_V1.pr(S2_TF.itm_cd).eq(S1_T2.itm_cd))
									.and(S1_V1.pr(S2_TF.itm_sub1).eq(S1_T2.itm_sub1))
									.and(S1_V1.pr(S2_TF.itm_sub2).eq(S1_T2.itm_sub2))
									.and(S1_V1.pr(S2_TF.itm_sub3).eq(S1_T2.itm_sub3))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.can_flg.eq(value(false)))
							.and(S1_T4.can_flg.eq(value(false)))
							.and(S1_T5.can_flg.eq(value(false)))
							.and(S1_T3.abort_flg.eq(value(false))
							.or(
								bracket(
									S1_T3.abort_flg.eq(value(true))
									.and(S1_T3.arr_schd_abort_qty.lt(S1_T3.base_unit_qty)
									.or(S1_T3.purc_schd_abort_qty.lt(S1_T3.base_unit_qty))))
								)
							)
							.and(
								S1_T1.aprv_flg.eq(value(false))
								.or(S1_T1.aprv_flg.eq(value(true)))
								.and(S1_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
							)
							.and(S1_T5.purc_act_d_no.isNull())
						)
						.unionAll(
							subQuery()
							.select(
								S5_T2.itm_cd,
								S5_T2.itm_sub1,
								S5_T2.itm_sub2,
								S5_T2.itm_sub3,
								S5_V1.pr(S6_TD.pf_period_typ),
								S5_V1.pr(S6_TD.pf_period_st_dt),
								S5_V1.pr(S6_TD.pf_period_end_dt),
								S5_T2.base_unit_qty.subtract(
									nvl(
										S5_V2.pr("base_unit_qty"),
										value(0)
									)
								).as("po_qty")
							)
							.from(
								S5_T1
								.innerJoin(S5_T2).on(
									bracket(
										S5_T2.po_no.eq(S5_T1.po_no)
									)
								)
								.innerJoin(S5_T3).on(
									bracket(
										S5_T3.po_d_no.eq(S5_T2.po_d_no)
									)
								)
								.innerJoin(
									subQuery()
									.selectDistinct(
										S6_TH.sppl_cd,
										S6_TH.wg_cd,
										S6_TF.itm_cd,
										S6_TF.itm_sub1,
										S6_TF.itm_sub2,
										S6_TF.itm_sub3,
										S6_TD.pf_period_typ,
										S6_TD.pf_period_st_dt,
										S6_TD.pf_period_end_dt
									)
									.from(
										S6_TH
										.innerJoin(S6_TF).on(
											bracket(
												S6_TF.purc_frcst_no.eq(S6_TH.purc_frcst_no)
											)
										)
										.innerJoin(S6_TD).on(
											bracket(
												S6_TD.purc_frcst_fix_no.eq(S6_TF.purc_frcst_fix_no)
											)
										)
										.innerJoin(
											subQuery()
											.select(
												S7_TH.pf_dt,
												S7_TH.sppl_cd,
												S7_TH.wg_cd
											)
											.from(
												S7_WK
												.innerJoin(S7_TH).on(
													bracket(
														S7_TH.purc_frcst_no.eq(S7_WK.purc_frcst_no)
													)
												)
											)
											.union(
												subQuery()
												.select(
													max(S8_TH.pf_dt).as("pf_dt"),
													S8_TH.sppl_cd,
													S8_TH.wg_cd
												)
												.from(
													S8_WK
													.innerJoin(S8_T1).on(
														bracket(
															S8_T1.purc_frcst_no.eq(S8_WK.purc_frcst_no)
														)
													)
													.innerJoin(S8_TH).on(
														bracket(
															S8_TH.sppl_cd.eq(S8_T1.sppl_cd)
															.and(S8_TH.wg_cd.eq(S8_T1.wg_cd))
															.and(S8_TH.pf_dt.lt(S8_T1.pf_dt))
															.and(S8_TH.del_flg.eq(value(false)))
														)
													)
												)
												.groupBy(
													S8_TH.sppl_cd,
													S8_TH.wg_cd
												)
											).view(S6_VH)
										).on(
											bracket(
												S6_VH.pr(S7_TH.pf_dt).eq(S6_TH.pf_dt)
												.and(S6_VH.pr(S7_TH.sppl_cd).eq(S6_TH.sppl_cd))
												.and(S6_VH.pr(S7_TH.wg_cd).eq(S6_TH.wg_cd))
											)
										)
									).view(S5_V1)
								).on(
									bracket(
										trunc(
											S5_T2.dlv_rqst_tm,
											MCDateFmt.DD
										).between(S5_V1.pr(S6_TD.pf_period_st_dt), S5_V1.pr(S6_TD.pf_period_end_dt))
										.and(S5_V1.pr(S6_TH.wg_cd).eq(S5_T1.wg_cd))
										.and(S5_V1.pr(S6_TH.sppl_cd).eq(S5_T1.sppl_cd))
										.and(S5_V1.pr(S6_TF.itm_cd).eq(S5_T2.itm_cd))
										.and(S5_V1.pr(S6_TF.itm_sub1).eq(S5_T2.itm_sub1))
										.and(S5_V1.pr(S6_TF.itm_sub2).eq(S5_T2.itm_sub2))
										.and(S5_V1.pr(S6_TF.itm_sub3).eq(S5_T2.itm_sub3))
									)
								)
								.leftOuterJoin(
									subQuery()
									.select(
										S9_INST.po_d_no,
										sum(S9_INSTD.base_unit_qty).as("base_unit_qty")
									)
									.from(
										S9_INST
										.innerJoin(S9_INSTD).on(
											bracket(
												S9_INST.dlv_inst_no.eq(S9_INSTD.dlv_inst_no)
											)
										)
									)
									.where(
										S9_INST.can_flg.eq(value(false))
										.and(S9_INSTD.can_flg.eq(value(false)))
										.and(S9_INSTD.purc_act_d_no.isNull())
									)
									.groupBy(S9_INST.po_d_no).view(S5_V2)
								).on(
									bracket(
										S5_T2.po_d_no.eq(S5_V2.pr(S9_INST.po_d_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S5_T1.can_flg.eq(value(false)))
								.and(S1_T3.abort_flg.eq(value(false))
								.or(
									bracket(
										S1_T3.abort_flg.eq(value(true))
										.and(S1_T3.arr_schd_abort_qty.lt(S1_T3.base_unit_qty)
										.or(S1_T3.purc_schd_abort_qty.lt(S1_T3.base_unit_qty))))
									)
								)
								.and(
									S5_T1.aprv_flg.eq(value(false))
									.or(S5_T1.aprv_flg.eq(value(true)))
									.and(S5_T1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))
								)
								.and(
									S5_T2.base_unit_qty.subtract(nvl(
											S5_V2.pr("base_unit_qty"),
											value(0)
										)).gt(value(0))
								)
							)
						).view(S0_V)
					)
					.groupBy(
						S0_V.pr(S1_T2.itm_cd),
						S0_V.pr(S1_T2.itm_sub1),
						S0_V.pr(S1_T2.itm_sub2),
						S0_V.pr(S1_T2.itm_sub3),
						S0_V.pr(S2_TD.pf_period_typ),
						S0_V.pr(S2_TD.pf_period_st_dt),
						S0_V.pr(S2_TD.pf_period_end_dt)
					)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PURC_FRCST_H_Query_S01
	 */
	static MCQueryPlan MSBDL5280_MST_PURC_FRCST_H_S01() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MSW_PURC_FRCST_H_KEY_R S0_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MCTempView S0_V1 = createTempView("V1");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_CO_R S0_M5 = MAM_CO_R.create("M5");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_H_R S1_H1 = MST_PURC_FRCST_H_R.create("H1");
		MSW_PURC_FRCST_H_KEY_R S1_W1 = MSW_PURC_FRCST_H_KEY_R.create("W1");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_CNTRY_R S0_M7 = MAM_CNTRY_R.create("M7");
		MAM_CNTRY_R SO_M8 = MAM_CNTRY_R.create("M8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PURC_FRCST_H_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_frcst_no,
						S0_T1.pf_dt,
						S0_V1.pr("pf_dt").as("pre_pf_dt"),
						S0_T1.pf_rpt_no,
						S0_T1.pf_rpt_dt.as("pfprt_rpt_dt"),
						S0_T1.sppl_cd,
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.ZIP_CD.value())
						).as("sppl_zip_cd"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.ADDR1.value())
						).as("sppl_addr1"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.ADDR2.value())
						).as("sppl_addr2"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.ADDR3.value())
						).as("sppl_addr3"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.ADDR4.value())
						).as("sppl_addr4"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.TEL.value())
						).as("sppl_tel"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.FAX.value())
						).as("sppl_fax"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT.value())
						).as("sppl_cntct_dpt"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN.value())
						).as("sppl_cntct_psn"),
						MAPA_BP$F_GET_BP_ADDR(
							S0_T1.sppl_cd,
							S0_T1.pf_dt,
							value(MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE.value())
						).as("sppl_cntct_psn_title"),
						S0_T1.wg_cd,
						S0_T1.pf_usr_cd,
						S0_T1.pf_dpt_cd,
						S0_M4.dpt_nm.as("pf_dpt_nm"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.zip_cd,
							S0_M5.zip_cd
						).as("dpt_zip_cd"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.addr1,
							S0_M5.addr1
						).as("dpt_addr1"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.addr2,
							S0_M5.addr2
						).as("dpt_addr2"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.addr3,
							S0_M5.addr3
						).as("dpt_addr3"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.addr4,
							S0_M5.addr4
						).as("dpt_addr4"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.tel,
							S0_M5.tel
						).as("dpt_tel"),
						nvl2(
							S0_T1.pf_dpt_cd,
							S0_M4.fax,
							S0_M5.fax
						).as("dpt_fax"),
						S0_T1.rpt_rmrks.as("pf_rpt_rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
						,S0_M7.cntry_nm.as("sppl_cntry_nm"),
						SO_M8.cntry_nm.as("dpt_cntry_nm")
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_TH.purc_frcst_no,
								max(S1_H1.pf_dt).as("pf_dt")
							)
							.from(
								S1_TH
								.innerJoin(S1_H1).on(
									bracket(
										S1_H1.sppl_cd.eq(S1_TH.sppl_cd)
										.and(S1_H1.wg_cd.eq(S1_TH.wg_cd))
										.and(S1_H1.pf_dt.lt(S1_TH.pf_dt))
										.and(S1_H1.del_flg.eq(value(false)))
									)
								)
								.innerJoin(S1_W1).on(
									bracket(
										S1_W1.purc_frcst_no.eq(S1_TH.purc_frcst_no)
									)
								)
							)
							.groupBy(S1_TH.purc_frcst_no).view(S0_V1)
						).on(
							bracket(
								S0_V1.pr(S1_TH.purc_frcst_no).eq(S0_T1.purc_frcst_no)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.pf_dpt_cd)
								.and(S0_T1.pf_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.crossJoin(S0_M5)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M6.sppl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.cntry_cd.eq(S0_M6.cntry_cd)
							)
						)
						.leftOuterJoin(SO_M8).on(
							bracket(
								SO_M8.cntry_cd.eq(S0_M5.cntry_cd)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setStringNE("sppl_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("sppl_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("sppl_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("sppl_alt_nm4", m.bp_alt_nm4());
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
							r.getStringNE("pf_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pf_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PURC_FRCST_H_Query_S02
	 */
	static MCQueryPlan MSBDL5280_MST_PURC_FRCST_H_S02() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MSW_PURC_FRCST_H_KEY_R S0_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MAM_BP_ITM_R S0_M4 = MAM_BP_ITM_R.create("M4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PURC_FRCST_H_Query_S02")
					.mainQuery()
					.select(
						S0_T1.purc_frcst_no,
						S0_T2.rpt_rmrks.as("pf_rpt_d_rmrks"),
						S0_T2.sub_char1.as("d_sub_char1"),
						S0_T2.sub_char2.as("d_sub_char2"),
						S0_T2.sub_char3.as("d_sub_char3"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1.as("itm_sub1_data"),
						S0_T2.itm_sub2.as("itm_sub2_data"),
						S0_T2.itm_sub3.as("itm_sub3_data"),
						S0_M4.bp_itm_cd.as("sppl_itm_cd"),
						S0_M4.bp_itm_nm.as("sppl_itm_nm"),
						S0_T2.trd_unit_cd.as("unit_cd"),
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.pf_period_end_dt,
						S0_T3.fix_period_flg.as("ym_flg"),
						S0_T3.trd_unit_pf_qty.as("qty"),
						value(1).as("disp_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_no.eq(S0_T2.purc_frcst_no)
								.and(S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M4.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_M4.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.pf_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data")
						))
						.addSelect(m -> toArray(
							m.itm_alt_nm1,
							m.itm_alt_nm2,
							m.itm_alt_nm3,
							m.itm_alt_nm4,
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_alt_nm1", m.itm_alt_nm1());
							r.setStringNE("itm_alt_nm2", m.itm_alt_nm2());
							r.setStringNE("itm_alt_nm3", m.itm_alt_nm3());
							r.setStringNE("itm_alt_nm4", m.itm_alt_nm4());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PURC_FRCST_H_Query_S03
	 */
	static MCQueryPlan MSBDL5280_MST_PURC_FRCST_H_S03() {
		MCTempView S0_V1 = createTempView("V1");
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MAM_BP_ITM_R S0_M4 = MAM_BP_ITM_R.create("M4");
		MST_PURC_FRCST_H_R S1_T1 = MST_PURC_FRCST_H_R.create("T1");
		MSW_PURC_FRCST_H_KEY_R S1_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PURC_FRCST_H_Query_S03")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.purc_frcst_no),
						S0_T2.itm_cd,
						S0_T2.itm_sub1.as("itm_sub1_data"),
						S0_T2.itm_sub2.as("itm_sub2_data"),
						S0_T2.itm_sub3.as("itm_sub3_data"),
						S0_T2.trd_unit_cd.as("unit_cd"),
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.pf_period_end_dt,
						S0_T3.trd_unit_pf_qty.as("pre_qty"),
						S0_T3.fix_period_flg.as("pre_ym_flg"),
						S0_M4.bp_itm_cd.as("sppl_itm_cd"),
						S0_M4.bp_itm_nm.as("sppl_itm_nm"),
						value(2).as("disp_seq")
					)
					.from(
						subQuery()
						.select(
							S1_T1.purc_frcst_no,
							S1_TH.sppl_cd,
							S1_TH.wg_cd,
							max(S1_TH.pf_dt).as("pf_dt")
						)
						.from(
							S1_T1
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.purc_frcst_no.eq(S1_T1.purc_frcst_no)
								)
							)
							.innerJoin(S1_TH).on(
								bracket(
									S1_TH.sppl_cd.eq(S1_T1.sppl_cd)
									.and(S1_TH.wg_cd.eq(S1_T1.wg_cd))
									.and(S1_TH.pf_dt.lt(S1_T1.pf_dt))
									.and(S1_TH.del_flg.eq(value(false)))
								)
							)
						)
						.groupBy(
							S1_T1.purc_frcst_no,
							S1_TH.sppl_cd,
							S1_TH.wg_cd
						).view(S0_V1)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.pf_dt.eq(S0_V1.pr("pf_dt"))
								.and(S0_T1.sppl_cd.eq(S0_V1.pr(S1_TH.sppl_cd)))
								.and(S0_T1.wg_cd.eq(S0_V1.pr(S1_TH.wg_cd)))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M4.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_M4.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.pf_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data")
						))
						.addSelect(m -> toArray(
							m.itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1_data"),
							r.getStringNE("itm_sub2_data"),
							r.getStringNE("itm_sub3_data"),
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PURC_FRCST_H_Query_S04
	 */
	static MCQueryPlan MSBDL5280_MST_PURC_FRCST_H_S04() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_ITM_TYP_D_R S0_M5 = MAM_ITM_TYP_D_R.create("M5");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PURC_FRCST_H_Query_S04")
					.mainQuery()
					.select(
						S0_T1.wg_cd,
						S0_M2.wg_nm,
						S0_T1.sppl_cd,
						S0_M1.bp_nm.as("sppl_nm"),
						S0_M1.subcon_flg,
						S0_T1.pf_dt,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.pf_period_end_dt,
						S0_T2.trd_unit_cd,
						S0_T3.trd_unit_pf_qty,
						S0_T2.base_unit_cd,
						S0_T3.base_unit_pf_qty,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_no.eq(S0_T2.purc_frcst_no)
								.and(S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M1.sppl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.pf_dt.lte(bind("std_pf_dt")))
						.cutoff$and(S0_T3.pf_period_st_dt.gte(bind("ymd_fr")))
						.cutoff$and(S0_T3.pf_period_st_dt.lte(bind("ymd_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.and(S0_T1.del_flg.eq(value(false)))
						.and(S0_T2.fix_flg.eq(value(true)))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_M1.subcon_flg.eq(bind("subcon_flg_str")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dac_flg"))
					.view(v -> v.innerJoin(S0_DAC).on(bracket(S0_DAC.wg_cd.eq(S0_T1.wg_cd)))),
				when(boundOr("fix_period_flg"))
					.predicate(p -> p.and(S0_T3.fix_period_flg.eq(value(true)))),
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.itm_cd.eq(S0_T2.itm_cd).and(S0_M4.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_M4.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_M4.itm_sub3.eq(S0_T2.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M4.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M5.itm_typ.eq(S0_M4.itm_typ).and(S0_M5.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M5.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M4.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M4.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M4.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M4.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M4.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M4.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M4.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M4.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M4.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M4.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M1.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M1.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M1.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M1.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M1.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M1.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M1.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M1.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M1.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M1.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("join_itm_typ_d_cd_")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_cd,
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBDL5280_MST_PURC_FRCST_H_Query_S05
	 */
	static MCQueryPlan MSBDL5280_MST_PURC_FRCST_H_S05() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MSW_PURC_FRCST_FIX_KEY_R S0_WK = MSW_PURC_FRCST_FIX_KEY_R.create("WK");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5280_MST_PURC_FRCST_H_Query_S05")
					.mainQuery()
					.select(
						S0_T1.wg_cd,
						S0_M2.wg_nm,
						S0_T1.sppl_cd,
						S0_M1.bp_nm.as("sppl_nm"),
						S0_M1.subcon_flg,
						S0_T1.pf_dt,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.pf_period_end_dt,
						S0_T2.trd_unit_cd,
						S0_T3.trd_unit_pf_qty,
						S0_T2.base_unit_cd,
						S0_T3.base_unit_pf_qty,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_no.eq(S0_T2.purc_frcst_no)
								.and(S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M1.sppl_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T3.pf_period_st_dt.gte(bind("ymd_fr")))
						.cutoff$and(S0_T3.pf_period_st_dt.lte(bind("ymd_to")))
						.addDynamicPredicate()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dac_flg"))
					.view(v -> v.innerJoin(S0_DAC).on(bracket(S0_DAC.wg_cd.eq(S0_T1.wg_cd)))),
				when(boundOr("fix_period_flg"))
					.predicate(p -> p.and(S0_T3.fix_period_flg.eq(value(true)))),
				when(boundOr("itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.itm_cd.eq(S0_T2.itm_cd).and(S0_M4.itm_sub1.eq(S0_T2.itm_sub1)).and(S0_M4.itm_sub2.eq(S0_T2.itm_sub2)).and(S0_M4.itm_sub3.eq(S0_T2.itm_sub3))))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M4.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ)))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M4.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ)))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M4.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ)))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M4.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ)))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M4.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ)))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M4.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ)))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M4.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ)))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M4.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ)))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M4.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ)))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M4.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ)))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M1.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M1.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M1.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M1.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M1.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M1.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M1.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M1.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M1.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ)))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M1.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("join_itm_typ_d_cd_")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_cd,
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
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
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}

}