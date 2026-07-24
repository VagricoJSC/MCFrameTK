package mcframe.serverMSBC.MSBCL5040;

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
	 * -- MSBCL5040_MST_ITM_ORDER_Query_S01 : 未確定、保存、確定（内製）
	 */
	static MCQueryPlan MSBCL5040_MST_ITM_ORDER_S01() {
		MCTempView S0_X1 = createTempView("X1");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("T1");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T1.itm_ord_no.as("key"),
						S1_T1.mfg_st_schd_dt.as("st_dt"),
						S1_T1.mfg_end_schd_dt.as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_T1.sppl_cd.eq(S1_M1.sppl_cd))
								.and(S1_T1.maker_cd.eq(S1_M1.maker_cd))
								.and(S1_T1.rqst_loc_cd.eq(S1_M1.rqst_loc_cd))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S1_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(
							S1_T1.itm_ord_sts_typ.in(
								bind("w_opn"),
								bind("w_sav"),
								bind("w_fix"),
								bind("w_fix_inst")
							)
						)
						.and(
							S1_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.OPN.value()),
								value(MSC_ITM_ORD_STS_TYP.SAV.value())
							)
							.or(
								S1_T1.itm_ord_sts_typ.in(
									value(MSC_ITM_ORD_STS_TYP.FIX.value()),
									value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
								)
							)
							.and(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.MFG.value())))
						)
						.and(S1_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S1_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(S1_T1.not_inst_qty.gt(value(0)))
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}
	
	/**
	 * -- MSBCL5040_MST_ITM_ORDER_Query_S02 : 確定（外製）
	 */
	static MCQueryPlan MSBCL5040_MST_ITM_ORDER_S02() {
		MCTempView S0_X1 = createTempView("X1");
		MST_ITM_ORDER_R S1_T1 = MST_ITM_ORDER_R.create("T1");
		MST_PO_SCHD_R S1_T2 = MST_PO_SCHD_R.create("T2");
		MST_WG_RQST_R S1_T3 = MST_WG_RQST_R.create("T3");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_ITM_ORDER_Query_S02")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T1.itm_ord_no.as("key"),
						S1_T1.mfg_st_schd_dt.as("st_dt"),
						S1_T1.mfg_end_schd_dt.as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							nvl(
								S1_T3.not_cmpl_qty,
								S1_T2.base_unit_qty
							).multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							nvl(
								S1_T3.not_cmpl_qty,
								S1_T2.base_unit_qty
							).multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.leftOuterJoin(S1_T2).on(
							bracket(
								S1_T1.itm_ord_no.eq(S1_T2.outsrc_itm_ord_no)
								.and(S1_T2.can_flg.eq(value(false)))
								.and(S1_T2.abort_flg.eq(value(false)))
								.and(S1_T2.po_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_T3).on(
							bracket(
								value(MSC_WG_RQST_SRC_TYP.ORD.value()).eq(S1_T3.wg_rqst_src_typ)
								.and(S1_T1.itm_ord_no.eq(S1_T3.wg_rqst_src_no))
								.and(S1_T3.can_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_T1.sppl_cd.eq(S1_M1.sppl_cd))
								.and(S1_T1.maker_cd.eq(S1_M1.maker_cd))
								.and(S1_T1.rqst_loc_cd.eq(S1_M1.rqst_loc_cd))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S1_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.OUTSRC.value())))
						.and(
							S1_T1.itm_ord_sts_typ.in(
								value(MSC_ITM_ORD_STS_TYP.FIX.value()),
								value(MSC_ITM_ORD_STS_TYP.PART_INST.value())
							)
						)
						.and(S1_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S1_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(
							nvl(
								S1_T3.not_cmpl_qty,
								S1_T2.base_unit_qty
							).gt(value(0))
						)
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}
	
	
	/**
	 * -- MSBCL5040_MST_MFG_ACT_Query_S01 : 完了
	 */
	static MCQueryPlan MSBCL5040_MST_MFG_ACT_S01() {
		MCTempView S0_X1 = createTempView("X1");
		MST_ITM_MFG_INST_R S1_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_ACT_R S1_T2 = MST_MFG_ACT_R.create("T2");
		MSVT_MFG_INST_PR_R S1_T3 = MSVT_MFG_INST_PR_R.create("T3");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");
		MSVT_MFG_INST_PR_R S2_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S2_X2 = MST_MFG_INST_R.create("X2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_MFG_ACT_Query_S01")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T2.mfg_act_no.as("key"),
						trunc(
							S1_T2.st_act_tm,
							MCDateFmt.DD
						).as("st_dt"),
						trunc(
							S1_T2.end_act_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							trunc(
								S1_T2.st_act_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T2.end_act_tm,
								MCDateFmt.DD
							),
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							trunc(
								S1_T2.st_act_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T2.end_act_tm,
								MCDateFmt.DD
							),
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							bracket(
								S1_T2.base_unit_yield_qty.add(
									nvl(
										S1_T2.base_unit_dfct_qty,
										value(0)
									)
								)
							).multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							bracket(
								S1_T2.base_unit_yield_qty.add(
									nvl(
										S1_T2.base_unit_dfct_qty,
										value(0)
									)
								)
							).multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.innerJoin(S1_T2).on(
							bracket(
								S1_T1.itm_mfg_inst_no.eq(S1_T2.itm_mfg_inst_no)
							)
						)
						.innerJoin(S1_T3).on(
							bracket(
								S1_T2.mfg_inst_no.eq(S1_T3.mfg_inst_no)
								.and(S1_T3.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.CMPL.value())))
							)
						)
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_M1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_M1.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_M1.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S1_T1.can_flg.eq(value(false)))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S2_X1
									.innerJoin(S2_X2).on(
										bracket(
											S2_X1.mfg_inst_no.eq(S2_X2.mfg_inst_no)
										)
									)
								)
								.where(
									S2_X1.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no)
									.and(S2_X2.can_flg.eq(value(false)))
									.and(
										S2_X1.mfg_sts_typ.in(
											value(MSC_MFG_STS_TYP.YET.value()),
											value(MSC_MFG_STS_TYP.SAV.value()),
											value(MSC_MFG_STS_TYP.ORD.value()),
											value(MSC_MFG_STS_TYP.STT.value())
										)
									)
								)
							)
						)
						.and(S1_T2.st_act_tm.lt(bind("dt_to")))
						.and(S1_T2.end_act_tm.gte(bind("dt_fr")))
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}
	
	/**
	 * -- MSBCL5040_MST_MFG_INST_Query_S01 : 指図済
	 */
	static MCQueryPlan MSBCL5040_MST_MFG_INST_S01() {
		MCTempView S0_X1 = createTempView("X1");
		MST_ITM_MFG_INST_R S1_T1 = MST_ITM_MFG_INST_R.create("T1");
		MST_MFG_INST_R S1_T2 = MST_MFG_INST_R.create("T2");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");
		MSVT_MFG_INST_PR_R S2_X1 = MSVT_MFG_INST_PR_R.create("X1");
		MST_MFG_INST_R S2_X2 = MST_MFG_INST_R.create("X2");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_MFG_INST_Query_S01")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T2.mfg_inst_no.as("key"),
						trunc(
							S1_T2.st_schd_tm,
							MCDateFmt.DD
						).as("st_dt"),
						trunc(
							S1_T2.end_schd_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							trunc(
								S1_T2.st_schd_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T2.end_schd_tm,
								MCDateFmt.DD
							),
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							trunc(
								S1_T2.st_schd_tm,
								MCDateFmt.DD
							),
							trunc(
								S1_T2.end_schd_tm,
								MCDateFmt.DD
							),
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							S1_T1.base_unit_inst_qty.multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							S1_T1.base_unit_inst_qty.multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.innerJoin(S1_T2).on(
							bracket(
								S1_T1.frst_mfg_inst_no.eq(S1_T2.mfg_inst_no)
							)
						)
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_M1.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_M1.maker_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_M1.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S1_T1.can_flg.eq(value(false)))
						.and(S1_T2.can_flg.eq(value(false)))
						.and(S1_T2.abort_flg.eq(value(false)))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(
									S2_X1
									.innerJoin(S2_X2).on(
										bracket(
											S2_X1.mfg_inst_no.eq(S2_X2.mfg_inst_no)
										)
									)
								)
								.where(
									S2_X1.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no)
									.and(S2_X2.can_flg.eq(value(false)))
									.and(
										S2_X1.mfg_sts_typ.in(
											value(MSC_MFG_STS_TYP.YET.value()),
											value(MSC_MFG_STS_TYP.SAV.value()),
											value(MSC_MFG_STS_TYP.ORD.value()),
											value(MSC_MFG_STS_TYP.STT.value())
										)
									)
								)
							)
						)
						.and(S1_T2.st_schd_tm.lt(bind("dt_to")))
						.and(S1_T2.end_schd_tm.gte(bind("dt_fr")))
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}
	
	/**
	 * -- MSBCL5040_MST_PRCD_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5040_MST_PRCD_ITM_ORDER_S01() {
		MCTempView S0_X1 = createTempView("X1");
		MST_PRCD_ITM_ORDER_R S1_T1 = MST_PRCD_ITM_ORDER_R.create("T1");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");

		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_PRCD_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T1.itm_ord_no.as("key"),
						S1_T1.mfg_st_schd_dt.as("st_dt"),
						S1_T1.mfg_end_schd_dt.as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_T1.sppl_cd.eq(S1_M1.sppl_cd))
								.and(S1_T1.maker_cd.eq(S1_M1.maker_cd))
								.and(S1_T1.rqst_loc_cd.eq(S1_M1.rqst_loc_cd))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S1_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(S1_T1.itm_ord_sts_typ.eq(value(MSC_ITM_ORD_STS_TYP.OPN.value())))
						.and(S1_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S1_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(S1_T1.not_inst_qty.gt(value(0)))
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
						.and(S1_M1.pre_po_tgt_flg.eq(value(true)))
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}
	
	/**
	 * -- MSBCL5040_MST_SIM_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL5040_MST_SIM_ITM_ORDER_S01() {
		MCTempView S0_X1 = createTempView("X1");
		MST_SIM_ITM_ORDER_R S1_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		MAVM_ITM_DTL_MFG_R S1_M1 = MAVM_ITM_DTL_MFG_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_RSRC_R S1_M3 = MAM_RSRC_R.create("M3");
		MAM_RSRC_R S1_M4 = MAM_RSRC_R.create("M4");
		MAW_LOC_KEY_R S1_W1 = MAW_LOC_KEY_R.create("W1");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL5040_MST_SIM_ITM_ORDER_Query_S01")
				.mainQuery()
				.select(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to"),
					sum(S0_X1.pr("act_qty1")).as("act_qty1"),
					sum(S0_X1.pr("act_qty2")).as("act_qty2")
				)
				.from(
					subQuery()
					.select(
						S1_T1.itm_ord_no.as("key"),
						S1_T1.mfg_st_schd_dt.as("st_dt"),
						S1_T1.mfg_end_schd_dt.as("end_dt"),
						S1_T1.mfg_loc_cd,
						MSPA_LD_CALC$F_GET_ST_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_fr"),
						MSPA_LD_CALC$F_GET_END_DT_NE(
							S1_T1.mfg_st_schd_dt,
							S1_T1.mfg_end_schd_dt,
							bind("period_typ"),
							bind("ac_cl_day")
						).as("dt_to"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty1).divide(
									nvl(
										S1_M1.rsrc_unit_qty1,
										value(1)
									)
								),
							S1_M3.dec_place,
							S1_M3.rnd_typ
						).as("act_qty1"),
						MAPA_CALC$F_RND_NE(
							S1_T1.not_inst_qty.multiply(S1_M1.rsrc_std_qty2).divide(
									nvl(
										S1_M1.rsrc_unit_qty2,
										value(1)
									)
								),
							S1_M4.dec_place,
							S1_M4.rnd_typ
						).as("act_qty2")
					)
					.from(
						S1_T1
						.innerJoin(S1_M1).on(
							bracket(
								S1_T1.itm_cd.eq(S1_M1.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_M1.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_M1.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_M1.itm_sub3))
								.and(S1_T1.mfg_loc_cd.eq(S1_M1.mfg_loc_cd))
								.and(S1_T1.sppl_cd.eq(S1_M1.sppl_cd))
								.and(S1_T1.maker_cd.eq(S1_M1.maker_cd))
								.and(S1_T1.rqst_loc_cd.eq(S1_M1.rqst_loc_cd))
								.and(S1_T1.bom_ptn.eq(S1_M1.bom_ptn))
								.and(S1_T1.wg_cd.eq(S1_M1.wg_cd))
								.and(S1_T1.master_dt.gte(S1_M1.st_dt))
								.and(S1_T1.master_dt.lte(S1_M1.end_dt))
							)
						)
						.innerJoin(S1_M2).on(
							bracket(
								S1_T1.mfg_loc_cd.eq(S1_M2.loc_cd)
								.and(S1_M2.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M3).on(
							bracket(
								S1_M2.rsrc_cd1.eq(S1_M3.rsrc_cd)
								.and(S1_M3.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S1_M4).on(
							bracket(
								S1_M2.rsrc_cd2.eq(S1_M4.rsrc_cd)
								.and(S1_M4.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S1_W1).on(
							bracket(
								S1_W1.loc_cd.eq(S1_T1.mfg_loc_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S1_T1.itm_ord_typ.in(
								value(MSC_ITM_ORD_TYP.MFG.value()),
								value(MSC_ITM_ORD_TYP.OUTSRC.value())
							)
						)
						.and(S1_T1.mfg_st_schd_dt.lt(bind("dt_to")))
						.and(S1_T1.mfg_end_schd_dt.gte(bind("dt_fr")))
						.and(S1_T1.not_inst_qty.gt(value(0)))
						.and(
							S1_M1.rsrc_std_qty1.isNotNull()
							.or(S1_M1.rsrc_std_qty2.isNotNull())
						)
						.and(S1_T1.sim_mrp_no.eq(bind("sim_mrp_no")))
						.and(S1_T1.exp_dt.isNull())
					).view(S0_X1)
				)
				.groupBy(
					S0_X1.pr(S1_T1.mfg_loc_cd),
					MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
						S0_X1.pr("key"),
						S0_X1.pr("st_dt"),
						S0_X1.pr("end_dt"),
						S0_X1.pr("dt_fr"),
						S0_X1.pr("dt_to")
					),
					S0_X1.pr("dt_fr"),
					S0_X1.pr("dt_to")
				)
			);
	}

	
}