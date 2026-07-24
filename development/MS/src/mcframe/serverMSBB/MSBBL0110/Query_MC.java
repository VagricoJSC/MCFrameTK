package mcframe.serverMSBB.MSBBL0110;

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
	 * -- MSBBL0110_MST_FRCST_SLO_SUM_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_FRCST_SLO_SUM_S01() {
		MST_FRCST_SLO_SUM_R S0_T1 = MST_FRCST_SLO_SUM_R.create("T1");
		MSW_SPLN_USR_FIX_KEY_R S0_WK = MSW_SPLN_USR_FIX_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_FRCST_SLO_SUM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sls_dpt_cd,
						S0_T1.usr_cst_cd.as("cst_cd"),
						S0_T1.usr_wrk_no.as("wrk_no"),
						nvl(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("spln_itm_cd"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_cd"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub1"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub2"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub3"),
						S0_T1.trd_cur_cd,
						S0_T1.ym,
						sum(S0_T1.cst_frcst_qty).as("cst_frcst_qty"),
						sum(S0_T1.trd_cur_cst_frcst_amt).as("trd_cur_cst_frcst_amt"),
						sum(S0_T1.base_unit_slo_qty).as("base_unit_slo_qty"),
						sum(S0_T1.trd_cur_slo_amt).as("trd_cur_slo_amt"),
						sum(S0_T1.base_unit_pre_slo_qty).as("base_unit_pre_slo_qty"),
						sum(S0_T1.trd_cur_pre_slo_amt).as("trd_cur_pre_slo_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.usr_cd.eq(S0_T1.sls_usr_cd)
								.and(S0_WK.dpt_cd.eq(S0_T1.sls_dpt_cd))
								.and(S0_WK.cst_cd.eq(S0_T1.usr_cst_cd))
								.and(S0_WK.wrk_no.eq(S0_T1.usr_wrk_no))
								.and(
									S0_WK.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value()))
									.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
									.or(
										S0_WK.spln_itm_cd.eq(nvl(
												S0_T1.spln_itm_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
									.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
									.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
									.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								)
								.and(S0_WK.cur_cd.eq(S0_T1.trd_cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.ym.lte(bind("spln_ym_to")))
					)
					.groupBy(
						S0_T1.sls_dpt_cd,
						S0_T1.usr_cst_cd,
						S0_T1.usr_wrk_no,
						nvl(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_cd,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						),
						S0_T1.trd_cur_cd,
						S0_T1.ym
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_FRCST_SLO_SUM_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MST_FRCST_SLO_SUM_S02() {
		MST_FRCST_SLO_SUM_R S0_T1 = MST_FRCST_SLO_SUM_R.create("T1");
		MSW_SPLN_SUM_FIX_KEY_R S0_WK = MSW_SPLN_SUM_FIX_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_FRCST_SLO_SUM_Query_S02")
					.mainQuery()
					.select(
						S0_T1.sls_dpt_cd,
						S0_T1.sum_cst_cd.as("cst_cd"),
						S0_T1.sum_wrk_no.as("wrk_no"),
						nvl(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("spln_itm_cd"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_cd,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_cd"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub1"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub2"),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						).as("itm_sub3"),
						S0_T1.trd_cur_cd,
						S0_T1.ym,
						sum(S0_T1.cst_frcst_qty).as("cst_frcst_qty"),
						sum(S0_T1.trd_cur_cst_frcst_amt).as("trd_cur_cst_frcst_amt"),
						sum(S0_T1.base_unit_slo_qty).as("base_unit_slo_qty"),
						sum(S0_T1.trd_cur_slo_amt).as("trd_cur_slo_amt"),
						sum(S0_T1.base_unit_pre_slo_qty).as("base_unit_pre_slo_qty"),
						sum(S0_T1.trd_cur_pre_slo_amt).as("trd_cur_pre_slo_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(S0_WK.cst_cd.eq(S0_T1.sum_cst_cd))
								.and(S0_WK.wrk_no.eq(S0_T1.sum_wrk_no))
								.and(
									S0_WK.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value()))
									.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
									.or(
										S0_WK.spln_itm_cd.eq(nvl(
												S0_T1.spln_itm_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
									.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
									.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
									.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								)
								.and(S0_WK.cur_cd.eq(S0_T1.trd_cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.ym.lte(bind("spln_ym_to")))
					)
					.groupBy(
						S0_T1.sls_dpt_cd,
						S0_T1.sum_cst_cd,
						S0_T1.sum_wrk_no,
						nvl(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_cd,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub1,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub2,
							value(MAC_STR.NULL_VAL.value())
						),
						decode(
							nvl(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value())
							),
							value(MAC_STR.NULL_VAL.value()),
							S0_T1.itm_sub3,
							value(MAC_STR.NULL_VAL.value())
						),
						S0_T1.trd_cur_cd,
						S0_T1.ym
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLM_SUM_FIX_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLM_SUM_FIX_D01() {
		MST_SPLN_SUM_FIX_R S0_T = MST_SPLN_SUM_FIX_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		MST_SPLN_SUM_DTL_R S2_X = MST_SPLN_SUM_DTL_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLM_SUM_FIX_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.spln_vers.eq(bind("spln_vers")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.itm_cd.eq(S0_T.itm_cd))
									.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
								)
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value(1))
								.from(S2_X)
								.where(
									S2_X.spln_vers.eq(S0_T.spln_vers)
									.and(S2_X.ym.eq(S0_T.ym))
									.and(S2_X.dpt_cd.eq(S0_T.dpt_cd))
									.and(S2_X.cst_cd.eq(S0_T.cst_cd))
									.and(S2_X.wrk_no.eq(S0_T.wrk_no))
									.and(S2_X.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S2_X.itm_cd.eq(S0_T.itm_cd))
									.and(S2_X.itm_sub1.eq(S0_T.itm_sub1))
									.and(S2_X.itm_sub2.eq(S0_T.itm_sub2))
									.and(S2_X.itm_sub3.eq(S0_T.itm_sub3))
									.and(S2_X.cur_cd.eq(S0_T.cur_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLM_USR_FIX_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLM_USR_FIX_D01() {
		MST_SPLN_USR_FIX_R S0_T = MST_SPLN_USR_FIX_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		MST_SPLN_USR_DTL_R S2_X = MST_SPLN_USR_DTL_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLM_USR_FIX_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.usr_cd.eq(bind("usr_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.itm_cd.eq(S0_T.itm_cd))
									.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
								)
							)
						)
						.and(
							notExists(
								subQuery()
								.select(value(1))
								.from(S2_X)
								.where(
									S2_X.usr_cd.eq(S0_T.usr_cd)
									.and(S2_X.ym.eq(S0_T.ym))
									.and(S2_X.dpt_cd.eq(S0_T.dpt_cd))
									.and(S2_X.cst_cd.eq(S0_T.cst_cd))
									.and(S2_X.wrk_no.eq(S0_T.wrk_no))
									.and(S2_X.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S2_X.itm_cd.eq(S0_T.itm_cd))
									.and(S2_X.itm_sub1.eq(S0_T.itm_sub1))
									.and(S2_X.itm_sub2.eq(S0_T.itm_sub2))
									.and(S2_X.itm_sub3.eq(S0_T.itm_sub3))
									.and(S2_X.cur_cd.eq(S0_T.cur_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_FMT_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_FMT_S01() {
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_SPLN_ITM_R S0_M3 = MAM_SPLN_ITM_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");
		
		MAM_ITM_GRP_R S0_MMA1 = MAM_ITM_GRP_R.create("MMA1");
		MAM_ITM_GRP_R S0_MMA2 = MAM_ITM_GRP_R.create("MMA2");
		MAM_ITM_GRP_R S0_MMA3 = MAM_ITM_GRP_R.create("MMA3");
		MAM_ITM_GRP_R S0_MMA4 = MAM_ITM_GRP_R.create("MMA4");
		MAM_ITM_GRP_R S0_MMA5 = MAM_ITM_GRP_R.create("MMA5");
		MAM_ITM_GRP_R S0_MMA6 = MAM_ITM_GRP_R.create("MMA6");
		MAM_ITM_GRP_R S0_MMA7 = MAM_ITM_GRP_R.create("MMA7");
		MAM_ITM_GRP_R S0_MMA8 = MAM_ITM_GRP_R.create("MMA8");
		MAM_ITM_GRP_R S0_MMA9 = MAM_ITM_GRP_R.create("MMA9");
		MAM_ITM_GRP_R S0_MMA10 = MAM_ITM_GRP_R.create("MMA10");
		
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");

		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_FMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_M1.dpt_lvl_cd,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T3.wrk_nm,
						S0_T1.spln_itm_cd,
						S0_M3.spln_itm_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M4.itm_nm,
						S0_M4.unit_cd,
						S0_M7.unit_nm,
						S0_M4.dec_place.as("qty_dec_place"),
						S0_T1.cur_cd,
						S0_M5.cur_nm,
						S0_M5.amt_dec_place,
						bracket(
							cases()
								.when(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.spln_set_typ)
								.otherwise(S0_M3.spln_set_typ)
						).as("spln_set_typ"),
						S0_T1.disp_seq,
						S0_T1.st_ym,
						S0_T1.end_ym,
						nvl(
							S0_T2.fix_flg,
							value(false)
						).as("fix_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.usr_cd.eq(bind("usr_cd"))
								.and(S0_T2.ym.eq(bind("ym")))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.st_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.cur_cd.eq(S0_T1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_typ.eq(S0_M4.itm_typ)
								.and(S0_M6.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.unit_cd.eq(S0_M4.unit_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.st_ym.lte(bind("spln_ym_to")))
						.and(S0_T1.end_ym.gte(bind("spln_ym_fr")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(
							nvl(
								S0_T2.fix_flg,
								value(false)
							).eq(bind("fix_flg_str"))
						)
						.cutoff$and(
							nvl2(
								S0_T2.usr_cd,
								value(true),
								value(false)
							).eq(bind("reg_flg_str"))
						)
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_M3.spln_itm_nm.like(bind("spln_itm_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
				)
				.setDynamicSQLInfo(
					when(boundOr("itm_grp_flg1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA1).on(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).eq(S0_MMA1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMA1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMA1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA2).on(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).eq(S0_MMA2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMA2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMA2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA3).on(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).eq(S0_MMA3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMA3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMA3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA4).on(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).eq(S0_MMA4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMA4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMA4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA5).on(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).eq(S0_MMA5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMA5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMA5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA6).on(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).eq(S0_MMA6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMA6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMA6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA7).on(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).eq(S0_MMA7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMA7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMA7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA8).on(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).eq(S0_MMA8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMA8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMA8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA9).on(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).eq(S0_MMA9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMA9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMA9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA10).on(nvl(S0_M3.itm_grp_cd10, S0_M4.itm_grp_cd10).eq(S0_MMA10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMA10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd10, S0_M4.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMA10.itm_grp_nm.like(bind("itm_grp_nm10")))),
					when(boundOr("bp_grp_flg1"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M2.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
					when(boundOr("bp_grp_flg2"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M2.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
					when(boundOr("bp_grp_flg3"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M2.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
					when(boundOr("bp_grp_flg4"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M2.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
					when(boundOr("bp_grp_flg5"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M2.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
					when(boundOr("bp_grp_flg6"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M2.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
					when(boundOr("bp_grp_flg7"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M2.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
					when(boundOr("bp_grp_flg8"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M2.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
					when(boundOr("bp_grp_flg9"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M2.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
					when(boundOr("bp_grp_flg10"))
						.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M2.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
						.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_FMT_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_FMT_S02() {
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_VERS_R S0_T3 = MST_SPLN_SUM_VERS_R.create("T3");
		MST_WRK_R S0_T4 = MST_WRK_R.create("T4");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_SPLN_ITM_R S0_M3 = MAM_SPLN_ITM_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_UNIT_R S0_M7 = MAM_UNIT_R.create("M7");

		MAM_ITM_GRP_R S0_MMA1 = MAM_ITM_GRP_R.create("MMA1");
		MAM_ITM_GRP_R S0_MMA2 = MAM_ITM_GRP_R.create("MMA2");
		MAM_ITM_GRP_R S0_MMA3 = MAM_ITM_GRP_R.create("MMA3");
		MAM_ITM_GRP_R S0_MMA4 = MAM_ITM_GRP_R.create("MMA4");
		MAM_ITM_GRP_R S0_MMA5 = MAM_ITM_GRP_R.create("MMA5");
		MAM_ITM_GRP_R S0_MMA6 = MAM_ITM_GRP_R.create("MMA6");
		MAM_ITM_GRP_R S0_MMA7 = MAM_ITM_GRP_R.create("MMA7");
		MAM_ITM_GRP_R S0_MMA8 = MAM_ITM_GRP_R.create("MMA8");
		MAM_ITM_GRP_R S0_MMA9 = MAM_ITM_GRP_R.create("MMA9");
		MAM_ITM_GRP_R S0_MMA10 = MAM_ITM_GRP_R.create("MMA10");
		
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_FMT_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_M1.dpt_lvl_cd,
						bracket(
							cases()
								.when(S0_T1.cst_cd_unit_flg.eq(value(true)))
									.then(S0_T1.cst_cd)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("cst_cd"),
						bracket(
							cases()
								.when(S0_T1.cst_cd_unit_flg.eq(value(true)))
									.then(S0_M2.bp_nm)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("cst_nm"),
						bracket(
							cases()
								.when(S0_T1.wrk_no_unit_flg.eq(value(true)))
									.then(S0_T1.wrk_no)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("wrk_no"),
						bracket(
							cases()
								.when(S0_T1.wrk_no_unit_flg.eq(value(true)))
									.then(S0_T4.wrk_nm)
								.otherwise(value(MAC_STR.NULL_VAL.value()))
						).as("wrk_nm"),
						S0_T1.spln_itm_cd,
						S0_M3.spln_itm_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M4.itm_nm,
						S0_M4.unit_cd,
						S0_M7.unit_nm,
						S0_M4.dec_place.as("qty_dec_place"),
						S0_T1.cur_cd,
						S0_M5.cur_nm,
						S0_M5.amt_dec_place,
						bracket(
							cases()
								.when(MAC_STR$IS_NULL_VAL(S0_T1.spln_itm_cd).eq(value(false)))
									.then(S0_M3.spln_set_typ)
								.otherwise(S0_T1.spln_set_typ)
						).as("spln_set_typ"),
						S0_T1.disp_seq,
						S0_T1.st_ym,
						S0_T1.end_ym,
						nvl(
							S0_T2.fix_flg,
							value(false)
						).as("fix_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.dpt_cd.eq(S0_T1.dpt_cd)
								.and(
									S0_T2.cst_cd.eq(cases()
											.when(S0_T1.cst_cd_unit_flg.eq(value(true)))
												.then(S0_T1.cst_cd)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(
									S0_T2.wrk_no.eq(cases()
											.when(S0_T1.wrk_no_unit_flg.eq(value(true)))
												.then(S0_T1.wrk_no)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(S0_T2.ym.eq(bind("ym")))
								.and(S0_T2.spln_vers.eq(bind("spln_vers")))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_T2.dpt_cd)
								.and(S0_T3.cst_cd.eq(S0_T2.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T2.wrk_no))
								.and(S0_T3.ym.eq(S0_T2.ym))
								.and(S0_T3.spln_vers.eq(S0_T2.spln_vers))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.st_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.cur_cd.eq(S0_T1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_typ.eq(S0_M4.itm_typ)
								.and(S0_M6.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.unit_cd.eq(S0_M4.unit_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.st_ym.lte(bind("spln_ym_to")))
						.and(S0_T1.end_ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.dpt_cd.eq(bind("dpt_cd")))
						.and(
							cases()
								.when(S0_T1.cst_cd_unit_flg.eq(value(true)))
									.then(S0_T1.cst_cd)
								.otherwise(value(MAC_STR.NULL_VAL.value())).eq(bind("cst_cd"))
						)
						.and(
							cases()
								.when(S0_T1.wrk_no_unit_flg.eq(value(true)))
									.then(S0_T1.wrk_no)
								.otherwise(value(MAC_STR.NULL_VAL.value())).eq(bind("wrk_no"))
						)
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.fix_flg,
								value(false)
							).eq(bind("fix_flg_str"))
						)
						.cutoff$and(
							nvl2(
								S0_T2.dpt_cd,
								value(true),
								value(false)
							).eq(bind("reg_flg_str"))
						)
						.cutoff$and(S0_M3.spln_itm_nm.like(bind("spln_itm_nm")))
						.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA1).on(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).eq(S0_MMA1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMA1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMA1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA2).on(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).eq(S0_MMA2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMA2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMA2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA3).on(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).eq(S0_MMA3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMA3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMA3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA4).on(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).eq(S0_MMA4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMA4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMA4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA5).on(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).eq(S0_MMA5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMA5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMA5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA6).on(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).eq(S0_MMA6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMA6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMA6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA7).on(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).eq(S0_MMA7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMA7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMA7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA8).on(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).eq(S0_MMA8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMA8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMA8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA9).on(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).eq(S0_MMA9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMA9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMA9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA10).on(nvl(S0_M3.itm_grp_cd10, S0_M4.itm_grp_cd10).eq(S0_MMA10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMA10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd10, S0_M4.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMA10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M2.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M2.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M2.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M2.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M2.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M2.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M2.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M2.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M2.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M2.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_D01() {
		MST_SPLN_SUM_DTL_R S0_T = MST_SPLN_SUM_DTL_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.spln_vers.eq(bind("spln_vers")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.itm_cd.eq(S0_T.itm_cd))
									.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_I01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_I01() {
		MST_SPLN_SUM_DTL_R S0 = MST_SPLN_SUM_DTL_R.create();
		MST_SPLN_SUM_DTL_R S1_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MST_SPLN_SUM_FIX_R S1_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.ym,
						S0.spln_vers,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.spln_ym,
						S0.spln_qty,
						S0.spln_amt
					)
					.query(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.ym,
							bind("new_spln_vers"),
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							S1_T1.spln_ym,
							S1_T1.spln_qty,
							S1_T1.spln_amt
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.dpt_cd.eq(S1_T1.dpt_cd)
									.and(S1_T2.cst_cd.eq(S1_T1.cst_cd))
									.and(S1_T2.wrk_no.eq(S1_T1.wrk_no))
									.and(S1_T2.ym.eq(S1_T1.ym))
									.and(S1_T2.spln_vers.eq(S1_T1.spln_vers))
									.and(S1_T2.spln_itm_cd.eq(S1_T1.spln_itm_cd))
									.and(S1_T2.itm_cd.eq(S1_T1.itm_cd))
									.and(S1_T2.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_T2.cur_cd.eq(S1_T1.cur_cd))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.dpt_cd.eq(bind("dpt_cd")))
							.and(S1_T2.cst_cd.eq(bind("cst_cd")))
							.and(S1_T2.wrk_no.eq(bind("wrk_no")))
							.and(S1_T2.ym.eq(bind("ym")))
							.and(S1_T2.spln_vers.eq(bind("copy_spln_vers")))
							.and(S1_T2.fix_flg.eq(value(true)))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_S01() {
		MSW_SPLN_SUM_FIX_KEY_R S0_WK = MSW_SPLN_SUM_FIX_KEY_R.create("WK");
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.ym,
						S0_WK.spln_vers,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_T1.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt
					)
					.from(
						S0_WK
						.leftOuterJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_WK.dpt_cd)
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.ym.eq(S0_WK.ym))
								.and(S0_T1.spln_vers.eq(S0_WK.spln_vers))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.spln_ym.lte(bind("spln_ym_to")))
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_S02() {
		MSW_SPLN_SUM_FIX_KEY_R S0_WK = MSW_SPLN_SUM_FIX_KEY_R.create("WK");
		MST_SPLN_SUM_FIX_R S0_T1 = MST_SPLN_SUM_FIX_R.create("T1");
		MST_SPLN_SUM_DTL_R S0_T2 = MST_SPLN_SUM_DTL_R.create("T2");
		MST_SPLN_SUM_VERS_R S0_T3 = MST_SPLN_SUM_VERS_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_T2.spln_ym,
						S0_T2.spln_qty,
						S0_T2.spln_amt
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.ym.lt(S0_WK.ym)
								.and(S0_T1.dpt_cd.eq(S0_WK.dpt_cd))
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T3.ym.eq(S0_T1.ym))
								.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T3.adopted_flg.eq(value(true)))
						.and(S0_T1.fix_flg.eq(value(true)))
						.and(S0_T2.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T2.spln_ym.lte(bind("spln_ym_to")))
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_S03
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_S03() {
		MSW_SPLN_SUM_FIX_KEY_R S0_WK = MSW_SPLN_SUM_FIX_KEY_R.create("WK");
		MST_SPLN_SUM_FIX_R S0_T1 = MST_SPLN_SUM_FIX_R.create("T1");
		MST_SPLN_SUM_DTL_R S0_T2 = MST_SPLN_SUM_DTL_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_S03")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.ym,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T2.spln_ym,
						S0_T2.spln_qty,
						S0_T2.spln_amt
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_WK.dpt_cd)
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.ym.eq(S0_WK.ym))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.spln_vers.eq(bind("ref_vers")))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.spln_vers.eq(S0_T1.spln_vers))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.fix_flg.eq(value(true)))
						.and(S0_T2.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T2.spln_ym.lte(bind("spln_ym_to")))
					)
			);
	}
	/**
	 * MSBBL0110_MST_SPLN_SUM_DTL_S04
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_S04() {
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_VERS_R S0_T3 = MST_SPLN_SUM_VERS_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_SPLN_ITM_R S0_M3 = MAM_SPLN_ITM_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_USR_R S0_M8 = MAM_USR_R.create("M8");
		MST_SPLN_FMT_R S1X1 = MST_SPLN_FMT_R.create("X1");
		
		MAM_ITM_GRP_R S0_MMA1 = MAM_ITM_GRP_R.create("MMA1");
		MAM_ITM_GRP_R S0_MMA2 = MAM_ITM_GRP_R.create("MMA2");
		MAM_ITM_GRP_R S0_MMA3 = MAM_ITM_GRP_R.create("MMA3");
		MAM_ITM_GRP_R S0_MMA4 = MAM_ITM_GRP_R.create("MMA4");
		MAM_ITM_GRP_R S0_MMA5 = MAM_ITM_GRP_R.create("MMA5");
		MAM_ITM_GRP_R S0_MMA6 = MAM_ITM_GRP_R.create("MMA6");
		MAM_ITM_GRP_R S0_MMA7 = MAM_ITM_GRP_R.create("MMA7");
		MAM_ITM_GRP_R S0_MMA8 = MAM_ITM_GRP_R.create("MMA8");
		MAM_ITM_GRP_R S0_MMA9 = MAM_ITM_GRP_R.create("MMA9");
		MAM_ITM_GRP_R S0_MMA10 = MAM_ITM_GRP_R.create("MMA10");
		
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");


		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_S04")
				.mainQuery()
				.select(
					S0_T3.usr_cd,
					S0_T1.ym,
					S0_T1.dpt_cd,
					S0_M1.dpt_nm,
					S0_M1.dpt_lvl_cd,
					S0_T2.cst_cd,
					S0_M2.bp_nm.as("cst_nm"),
					S0_T1.wrk_no,
					S0_T1.spln_vers,
					S0_T3.adopted_flg,
					S0_T1.spln_itm_cd,
					S0_M3.spln_itm_nm,
					S0_T1.itm_cd,
					S0_T1.itm_sub1,
					S0_T1.itm_sub2,
					S0_T1.itm_sub3,
					S0_T2.fix_flg,
					S0_M4.itm_nm,
					S0_M4.unit_cd,
					S0_M4.dec_place.as("qty_dec_place"),
					S0_T1.cur_cd,
					decode(
						S0_T1.spln_itm_cd,
						value(MAC_STR.NULL_VAL.value()),
						bracket(
							subQuery()
							.select(max(S1X1.spln_set_typ))
							.from(S1X1)
							.where(
								value(0).eq(value(0))
								.and(S1X1.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S1X1.itm_cd.eq(S0_T1.itm_cd))
								.and(S1X1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S1X1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S1X1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						),
						S0_M3.spln_set_typ
					).as("spln_set_typ"),
					S0_T1.spln_ym,
					S0_T1.spln_qty,
					S0_T1.spln_amt,
					S0_T3.intr_rmrks,
					S0_T3.sub_char1,
					S0_T3.sub_char2,
					S0_T3.sub_char3,
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
					.innerJoin(S0_T2).on(
						bracket(
							S0_T2.spln_vers.eq(S0_T1.spln_vers)
							.and(S0_T2.ym.eq(S0_T1.ym))
							.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
							.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
							.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
							.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
							.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
							.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
							.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
						)
					)
					.innerJoin(S0_T3).on(
						bracket(
							S0_T3.spln_vers.eq(S0_T1.spln_vers)
							.and(S0_T3.ym.eq(S0_T1.ym))
							.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
							.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
							.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
						)
					)
					.innerJoin(S0_DAC).on(
						bracket(
							S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
						)
					)
					.leftOuterJoin(S0_M1).on(
						bracket(
							S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
							.and(S0_M1.sls_dpt_flg.eq(value(true)))
							.and(
								MAPA_DT$F_GET_YM_ST_DT_NE2(
									S0_T1.ym,
									bind("ac_cl_day"),
									bind("ac_cl_mon_base")
								).between(S0_M1.st_dt, S0_M1.end_dt)
							)
						)
					)
					.leftOuterJoin(S0_M2).on(
						bracket(
							S0_M2.bp_cd.eq(S0_T1.cst_cd)
							.and(S0_M2.cst_flg.eq(value(true)))
						)
					)
					.leftOuterJoin(S0_M3).on(
						bracket(
							S0_M3.spln_itm_cd.eq(S0_T1.spln_itm_cd)
						)
					)
					.leftOuterJoin(S0_M4).on(
						bracket(
							S0_M4.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
						)
					)
					.addDynamicView()
					.addDynamicView(DS0C_ITM_GRP)
					.addDynamicView(DS0C_BP_GRP)
				)
				.where(
					value(0).eq(value(0))
					.and(S0_T1.spln_ym.gte(bind("spln_ym_fr")))
					.and(S0_T1.spln_ym.lte(bind("spln_ym_to")))
					.cutoff$and(S0_T1.ym.lte(bind("ym_to")))
					.cutoff$and(S0_T3.usr_cd.like(bind("usr_cd")))
					.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
					.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
					.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
					.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
					.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
					.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
					.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
					.cutoff$and(S0_M3.spln_itm_nm.like(bind("spln_itm_nm")))
					.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ")))
					.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
					.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
					.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
					.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
					.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
					.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))
					.cutoff$and(S0_T3.adopted_flg.eq(bind("adopted_flg_str")))
					.cutoff$and(S0_T2.fix_flg.eq(bind("fix_t_flg_str")))
					.cutoff$and(
							nvl(
								S0_M1.del_flg,
								value(true)
							).eq(bind("del_flg_str"))
					)
					.cutoff$and(
						decode(
							S0_T1.cst_cd,
							value(MAC_STR.NULL_VAL.value()),
							value(false),
							nvl(
								S0_M2.del_flg,
								value(true)
							)
						).eq(bind("del_flg_str"))
					)
					.cutoff$and(
						decode(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value()),
							value(false),
							nvl(
								S0_M3.del_flg,
								value(true)
							)
						).eq(bind("del_flg_str"))
					)
					.cutoff$and(
						decode(
							S0_T1.itm_cd,
							value(MAC_STR.NULL_VAL.value()),
							value(false),
							nvl(
								S0_M4.del_flg,
								value(true)
							)
						).eq(bind("del_flg_str"))
					)
					.addDynamicPredicate()
					.addDynamicPredicate(DS0C_ITM_GRP)
					.addDynamicPredicate(DS0C_BP_GRP)
				)
			)
			.addDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA1).on(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).eq(S0_MMA1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMA1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMA1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA2).on(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).eq(S0_MMA2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMA2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMA2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA3).on(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).eq(S0_MMA3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMA3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMA3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA4).on(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).eq(S0_MMA4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMA4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMA4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA5).on(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).eq(S0_MMA5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMA5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMA5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA6).on(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).eq(S0_MMA6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMA6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMA6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA7).on(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).eq(S0_MMA7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMA7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMA7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA8).on(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).eq(S0_MMA8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMA8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMA8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA9).on(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).eq(S0_MMA9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMA9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMA9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA10).on(nvl(S0_M3.itm_grp_cd10, S0_M4.itm_grp_cd10).eq(S0_MMA10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMA10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd10, S0_M4.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMA10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M2.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M2.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M2.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M2.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M2.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M2.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M2.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M2.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M2.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M2.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				
				when(boundOr("wrk_nm","del_flg_str"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T1.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm"))).cutoff$and(decode(S0_T1.wrk_no, value(MAC_STR.NULL_VAL.value()), value(false), nvl(S0_T5.can_flg,value(true))).eq(bind("del_flg_str")))),
				when(boundOr("del_flg_str"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M5.cur_cd.eq(S0_T1.cur_cd))))
					.predicate(p -> p.cutoff$and(nvl(S0_M5.del_flg, value(true)).eq(bind("del_flg_str")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M6.itm_typ.eq(S0_M4.itm_typ).and(S0_M6.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.wg_cd.eq(S0_M1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.usr_cd.eq(S0_T3.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.usr_nm.like(bind("usr_nm"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
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
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					})
				)
			);

	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_FIX_Query_I01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_FIX_I01() {
		MST_SPLN_SUM_FIX_R S0 = MST_SPLN_SUM_FIX_R.create();
		MST_SPLN_SUM_FIX_R S1 = MST_SPLN_SUM_FIX_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_FIX_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.ym,
						S0.spln_vers,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.fix_flg
					)
					.query(
						subQuery()
						.select(
							S1.dpt_cd,
							S1.cst_cd,
							S1.wrk_no,
							S1.ym,
							bind("new_spln_vers"),
							S1.spln_itm_cd,
							S1.itm_cd,
							S1.itm_sub1,
							S1.itm_sub2,
							S1.itm_sub3,
							S1.cur_cd,
							value(false)
						)
						.from(S1)
						.where(
							value(0).eq(value(0))
							.and(S1.dpt_cd.eq(bind("dpt_cd")))
							.and(S1.cst_cd.eq(bind("cst_cd")))
							.and(S1.wrk_no.eq(bind("wrk_no")))
							.and(S1.ym.eq(bind("ym")))
							.and(S1.spln_vers.eq(bind("copy_spln_vers")))
							.and(S1.fix_flg.eq(value(true)))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_DTL_Query_S05
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_DTL_S05() {
		MCTempView S0_V1 = createTempView("V1");
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		MST_SPLN_SUM_DTL_R S1_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_DTL_Query_S05")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.dpt_cd),
						S0_V1.pr(S1_T1.cst_cd),
						S0_V1.pr(S1_T1.wrk_no),
						S0_V1.pr(S1_T1.spln_itm_cd),
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.cur_cd),
						least(
							S0_V1.pr("st_ym"),
							nvl(
								S0_W1.st_ym,
								S0_V1.pr("st_ym")
							)
						).as("st_ym"),
						greatest(
							S0_V1.pr("end_ym"),
							nvl(
								S0_W1.end_ym,
								S0_V1.pr("end_ym")
							)
						).as("end_ym"),
						decode(
							S0_W1.dpt_cd,
							nullValue(),
							value(false),
							value(true)
						).as("upd_flg")
					)
					.from(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							min(S1_T1.spln_ym).as("st_ym"),
							max(S1_T1.spln_ym).as("end_ym")
						)
						.from(S1_T1)
						.where(
							S1_T1.spln_vers.eq(bind("spln_vers"))
							.and(S1_T1.ym.eq(bind("ym")))
							.and(S1_T1.dpt_cd.eq(bind("dpt_cd")))
							.and(S1_T1.cst_cd.eq(bind("cst_cd")))
							.and(S1_T1.wrk_no.eq(bind("wrk_no")))
						)
						.groupBy(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd
						).view(S0_V1)
						.leftOuterJoin(S0_W1).on(
							bracket(
								S0_V1.pr(S1_T1.dpt_cd).eq(S0_W1.dpt_cd)
								.and(S0_V1.pr(S1_T1.cst_cd).eq(S0_W1.cst_cd))
								.and(S0_V1.pr(S1_T1.wrk_no).eq(S0_W1.wrk_no))
								.and(S0_V1.pr(S1_T1.spln_itm_cd).eq(S0_W1.spln_itm_cd))
								.and(S0_V1.pr(S1_T1.itm_cd).eq(S0_W1.itm_cd))
								.and(S0_V1.pr(S1_T1.itm_sub1).eq(S0_W1.itm_sub1))
								.and(S0_V1.pr(S1_T1.itm_sub2).eq(S0_W1.itm_sub2))
								.and(S0_V1.pr(S1_T1.itm_sub3).eq(S0_W1.itm_sub3))
								.and(S0_V1.pr(S1_T1.cur_cd).eq(S0_W1.cur_cd))
							)
						)
					)
			);
	}
	
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_D01() {
		MST_SPLN_SUM_ITM_R S0_T = MST_SPLN_SUM_ITM_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_ITM_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.spln_vers.eq(bind("spln_vers")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_Query_D02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_D02() {
		MST_SPLN_SUM_ITM_R S0_T = MST_SPLN_SUM_ITM_R.create("T");
		MSW_SPLN_SUM_DTL_KEY_R S1_W = MSW_SPLN_SUM_DTL_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_ITM_Query_D02")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.spln_vers.eq(S0_T.spln_vers)
									.and(S1_W.ym.eq(S0_T.ym))
									.and(S1_W.dpt_cd.eq(S0_T.dpt_cd))
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.spln_ym.eq(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_Query_I01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_I01() {
		MST_SPLN_SUM_ITM_R S0 = MST_SPLN_SUM_ITM_R.create();
		MST_SPLN_SUM_ITM_R S1_T1 = MST_SPLN_SUM_ITM_R.create("T1");
		MST_SPLN_SUM_FIX_R S1_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_ITM_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.ym,
						S0.spln_vers,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.spln_ym,
						S0.spln_qty,
						S0.spln_amt
					)
					.query(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.ym,
							bind("new_spln_vers"),
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							S1_T1.spln_ym,
							S1_T1.spln_qty,
							S1_T1.spln_amt
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.dpt_cd.eq(S1_T1.dpt_cd)
									.and(S1_T2.cst_cd.eq(S1_T1.cst_cd))
									.and(S1_T2.wrk_no.eq(S1_T1.wrk_no))
									.and(S1_T2.ym.eq(S1_T1.ym))
									.and(S1_T2.spln_vers.eq(S1_T1.spln_vers))
									.and(S1_T2.spln_itm_cd.eq(S1_T1.spln_itm_cd))
									.and(S1_T2.cur_cd.eq(S1_T1.cur_cd))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.dpt_cd.eq(bind("dpt_cd")))
							.and(S1_T2.cst_cd.eq(bind("cst_cd")))
							.and(S1_T2.wrk_no.eq(bind("wrk_no")))
							.and(S1_T2.ym.eq(bind("ym")))
							.and(S1_T2.spln_vers.eq(bind("copy_spln_vers")))
							.and(S1_T2.fix_flg.eq(value(true)))
							.and(S1_T2.itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_NEW_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_NEW_D01() {
		MST_SPLN_SUM_ITM_NEW_R S0_T = MST_SPLN_SUM_ITM_NEW_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_ITM_NEW_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value())))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}

	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_NEW_Query_D02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_NEW_D02() {
		MST_SPLN_SUM_ITM_NEW_R S0_T = MST_SPLN_SUM_ITM_NEW_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		return createQueryPlan().setQuery(sql("MSBBL0110_MST_SPLN_SUM_ITM_NEW_Query_D02")
				.delete(S0_T)
				.where(value(0).eq(value(0)).and(exists(subQuery().select(value(1))
						.from(S1_W)
						.where(S1_W.dpt_cd.eq(S0_T.dpt_cd)
								.and(S1_W.cst_cd.eq(S0_T.cst_cd))
								.and(S1_W.wrk_no.eq(S0_T.wrk_no))
								.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
								.and(S1_W.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S1_W.itm_cd.eq(S0_T.itm_cd))
								.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
								.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
								.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
								.and(S1_W.cur_cd.eq(S0_T.cur_cd))
								.and(S1_W.st_ym.lte(S0_T.spln_ym))
								.and(S1_W.end_ym.gte(S0_T.spln_ym)))))));
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_ITM_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_ITM_S01() {
		MSW_SPLN_FMT_R S0_W = MSW_SPLN_FMT_R.create("W");
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_ITM_R S0_T3 = MST_SPLN_SUM_ITM_R.create("T3");
		MST_SPLN_SUM_VERS_R S0_T4 = MST_SPLN_SUM_VERS_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.spln_vers,
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						nvl(
							S0_T3.itm_cd,
							S0_T1.itm_cd
						).as("itm_cd"),
						nvl(
							S0_T3.itm_sub1,
							S0_T1.itm_sub1
						).as("itm_sub1"),
						nvl(
							S0_T3.itm_sub2,
							S0_T1.itm_sub2
						).as("itm_sub2"),
						nvl(
							S0_T3.itm_sub3,
							S0_T1.itm_sub3
						).as("itm_sub3"),
						S0_T1.cur_cd,
						S0_T1.spln_ym,
						nvl(
							S0_T3.spln_qty,
							S0_T1.spln_qty
						).as("spln_qty"),
						nvl(
							S0_T3.spln_amt,
							S0_T1.spln_amt
						).as("spln_amt")
					)
					.from(
						S0_W
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_W.dpt_cd)
								.and(S0_T1.cst_cd.eq(S0_W.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_W.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_W.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_W.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_W.cur_cd))
								.and(S0_T1.spln_ym.gte(S0_W.st_ym))
								.and(S0_T1.spln_ym.lte(S0_W.end_ym))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T3.ym.eq(S0_T1.ym))
								.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T3.spln_ym.eq(S0_T1.spln_ym))
								.and(S0_T1.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T4.ym.eq(S0_T1.ym))
								.and(S0_T4.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T4.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T4.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T4.adopted_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							nvl(
								S0_T3.itm_cd,
								S0_T1.itm_cd
							).neq(value(MAC_STR.NULL_VAL.value()))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_SUM_VERS_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_SUM_VERS_S01() {
		MST_SPLN_SUM_VERS_R S0_T1 = MST_SPLN_SUM_VERS_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_SUM_VERS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_M1.dpt_lvl_cd,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.edited_flg,
						S0_T1.adopted_flg,
						S0_T1.locked_flg,
						S0_T1.ref_vers,
						S0_T1.usr_cd,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dpt_cd.eq(bind("dpt_cd")))
						.and(S0_T1.cst_cd.eq(bind("cst_cd")))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
						.and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.spln_vers.eq(bind("spln_vers")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_D01() {
		MST_SPLN_USR_DTL_R S0_T = MST_SPLN_USR_DTL_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.usr_cd.eq(bind("usr_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.itm_cd.eq(S0_T.itm_cd))
									.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
									.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
									.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S01() {
		MSW_SPLN_USR_FIX_KEY_R S0_T1 = MSW_SPLN_USR_FIX_KEY_R.create("T1");
		MST_SPLN_USR_DTL_R S0_T2 = MST_SPLN_USR_DTL_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T2.spln_ym,
						S0_T2.spln_qty,
						S0_T2.spln_amt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T2.spln_ym.lte(bind("spln_ym_to")))
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S02() {
		MSW_SPLN_USR_FIX_KEY_R S0_WK = MSW_SPLN_USR_FIX_KEY_R.create("WK");
		MST_SPLN_USR_FIX_R S0_T1 = MST_SPLN_USR_FIX_R.create("T1");
		MST_SPLN_USR_DTL_R S0_T2 = MST_SPLN_USR_DTL_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_T2.spln_ym,
						S0_T2.spln_qty,
						S0_T2.spln_amt
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.usr_cd.eq(S0_WK.usr_cd)
								.and(S0_T1.ym.lt(S0_WK.ym))
								.and(S0_T1.dpt_cd.eq(S0_WK.dpt_cd))
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.fix_flg.eq(value(true)))
						.and(S0_T2.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T2.spln_ym.lte(bind("spln_ym_to")))
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S03
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S03() {
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MST_SPLN_USR_VERS_R S0_T3 = MST_SPLN_USR_VERS_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MST_SPLN_FMT_R S0_T4 = MST_SPLN_FMT_R.create("T4");
		MST_WRK_R S0_T5 = MST_WRK_R.create("T5");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_SPLN_ITM_R S0_M3 = MAM_SPLN_ITM_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_CUR_R S0_M5 = MAM_CUR_R.create("M5");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_USR_R S0_M8 = MAM_USR_R.create("M8");
		
		MAM_ITM_GRP_R S0_MMA1 = MAM_ITM_GRP_R.create("MMA1");
		MAM_ITM_GRP_R S0_MMA2 = MAM_ITM_GRP_R.create("MMA2");
		MAM_ITM_GRP_R S0_MMA3 = MAM_ITM_GRP_R.create("MMA3");
		MAM_ITM_GRP_R S0_MMA4 = MAM_ITM_GRP_R.create("MMA4");
		MAM_ITM_GRP_R S0_MMA5 = MAM_ITM_GRP_R.create("MMA5");
		MAM_ITM_GRP_R S0_MMA6 = MAM_ITM_GRP_R.create("MMA6");
		MAM_ITM_GRP_R S0_MMA7 = MAM_ITM_GRP_R.create("MMA7");
		MAM_ITM_GRP_R S0_MMA8 = MAM_ITM_GRP_R.create("MMA8");
		MAM_ITM_GRP_R S0_MMA9 = MAM_ITM_GRP_R.create("MMA9");
		MAM_ITM_GRP_R S0_MMA10 = MAM_ITM_GRP_R.create("MMA10");
		
		MAM_BP_GRP_R S0_MMB1 = MAM_BP_GRP_R.create("MMB1");
		MAM_BP_GRP_R S0_MMB2 = MAM_BP_GRP_R.create("MMB2");
		MAM_BP_GRP_R S0_MMB3 = MAM_BP_GRP_R.create("MMB3");
		MAM_BP_GRP_R S0_MMB4 = MAM_BP_GRP_R.create("MMB4");
		MAM_BP_GRP_R S0_MMB5 = MAM_BP_GRP_R.create("MMB5");
		MAM_BP_GRP_R S0_MMB6 = MAM_BP_GRP_R.create("MMB6");
		MAM_BP_GRP_R S0_MMB7 = MAM_BP_GRP_R.create("MMB7");
		MAM_BP_GRP_R S0_MMB8 = MAM_BP_GRP_R.create("MMB8");
		MAM_BP_GRP_R S0_MMB9 = MAM_BP_GRP_R.create("MMB9");
		MAM_BP_GRP_R S0_MMB10 = MAM_BP_GRP_R.create("MMB10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");

		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S03")
					.mainQuery()
					.select(
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_M1.dpt_lvl_cd,
						S0_T2.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_M3.spln_itm_nm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T2.fix_flg,
						S0_M4.itm_nm,
						S0_M4.unit_cd,
						S0_M4.dec_place.as("qty_dec_place"),
						S0_T1.cur_cd,
						decode(
							S0_T1.spln_itm_cd,
							value(MAC_STR.NULL_VAL.value()),
							S0_T4.spln_set_typ,
							S0_M3.spln_set_typ
						).as("spln_set_typ"),
						S0_T1.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt,
						S0_T3.intr_rmrks,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
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
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T3.ym.eq(S0_T1.ym))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T4.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T4.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T4.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T4.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T4.st_ym.lte(S0_T1.spln_ym))
								.and(S0_T4.end_ym.gte(S0_T1.spln_ym))
								.and(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.spln_ym.lte(bind("spln_ym_to")))
						.cutoff$and(S0_T1.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T1.usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M1.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))
						.cutoff$and(S0_T1.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_M3.spln_itm_nm.like(bind("spln_itm_nm")))
						.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T2.fix_flg.eq(bind("fix_t_flg_str")))
						.cutoff$and(
								nvl(
									S0_M1.del_flg,
									value(true)
								).eq(bind("del_flg_str"))
						)
						.cutoff$and(
							decode(
								S0_T1.cst_cd,
								value(MAC_STR.NULL_VAL.value()),
								value(false),
								nvl(
									S0_M2.del_flg,
									value(true)
								)
							).eq(bind("del_flg_str"))
						)
						.cutoff$and(
							decode(
								S0_T1.spln_itm_cd,
								value(MAC_STR.NULL_VAL.value()),
								value(false),
								nvl(
									S0_M3.del_flg,
									value(true)
								)
							).eq(bind("del_flg_str"))
						)
						.cutoff$and(
							decode(
								S0_T1.itm_cd,
								value(MAC_STR.NULL_VAL.value()),
								value(false),
								nvl(
									S0_M4.del_flg,
									value(true)
								)
							).eq(bind("del_flg_str"))
						)
						.addDynamicPredicate()
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA1).on(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).eq(S0_MMA1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMA1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd1, S0_M4.itm_grp_cd1).like(bind("itm_grp_cd1"))).cutoff$and(S0_MMA1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA2).on(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).eq(S0_MMA2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMA2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd2, S0_M4.itm_grp_cd2).like(bind("itm_grp_cd2"))).cutoff$and(S0_MMA2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA3).on(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).eq(S0_MMA3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMA3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd3, S0_M4.itm_grp_cd3).like(bind("itm_grp_cd3"))).cutoff$and(S0_MMA3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA4).on(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).eq(S0_MMA4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMA4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd4, S0_M4.itm_grp_cd4).like(bind("itm_grp_cd4"))).cutoff$and(S0_MMA4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA5).on(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).eq(S0_MMA5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMA5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd5, S0_M4.itm_grp_cd5).like(bind("itm_grp_cd5"))).cutoff$and(S0_MMA5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA6).on(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).eq(S0_MMA6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMA6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd6, S0_M4.itm_grp_cd6).like(bind("itm_grp_cd6"))).cutoff$and(S0_MMA6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA7).on(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).eq(S0_MMA7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMA7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd7, S0_M4.itm_grp_cd7).like(bind("itm_grp_cd7"))).cutoff$and(S0_MMA7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA8).on(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).eq(S0_MMA8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMA8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd8, S0_M4.itm_grp_cd8).like(bind("itm_grp_cd8"))).cutoff$and(S0_MMA8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA9).on(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).eq(S0_MMA9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMA9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M3.itm_grp_cd9, S0_M4.itm_grp_cd9).like(bind("itm_grp_cd9"))).cutoff$and(S0_MMA9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMA10).on(nvl(S0_M3.itm_grp_cd10, S0_M4.itm_grp_cd10).eq(S0_MMA10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMA10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(nvl(S0_M4.itm_grp_cd10, S0_M4.itm_grp_cd10).like(bind("itm_grp_cd10"))).cutoff$and(S0_MMA10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB1).on(S0_M2.bp_grp_cd1.eq(S0_MMB1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMB1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MMB1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB2).on(S0_M2.bp_grp_cd2.eq(S0_MMB2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMB2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MMB2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB3).on(S0_M2.bp_grp_cd3.eq(S0_MMB3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMB3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MMB3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB4).on(S0_M2.bp_grp_cd4.eq(S0_MMB4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMB4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MMB4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB5).on(S0_M2.bp_grp_cd5.eq(S0_MMB5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMB5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MMB5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB6).on(S0_M2.bp_grp_cd6.eq(S0_MMB6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMB6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MMB6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB7).on(S0_M2.bp_grp_cd7.eq(S0_MMB7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMB7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MMB7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB8).on(S0_M2.bp_grp_cd8.eq(S0_MMB8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMB8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MMB8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB9).on(S0_M2.bp_grp_cd9.eq(S0_MMB9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMB9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MMB9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MMB10).on(S0_M2.bp_grp_cd10.eq(S0_MMB10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMB10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MMB10.bp_grp_nm.like(bind("bp_grp_nm10")))),

				when(boundOr("wrk_nm","del_flg_str"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.wrk_no.eq(S0_T1.wrk_no))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm"))).cutoff$and(decode(S0_T1.wrk_no, value(MAC_STR.NULL_VAL.value()), value(false), nvl(S0_T5.can_flg,value(true))).eq(bind("del_flg_str")))),
				when(boundOr("del_flg_str"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M5.cur_cd.eq(S0_T1.cur_cd))))
					.predicate(p -> p.cutoff$and(nvl(S0_M5.del_flg, value(true)).eq(bind("del_flg_str")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M6.itm_typ.eq(S0_M4.itm_typ).and(S0_M6.itm_typ_d_cd.eq(S0_M4.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.wg_cd.eq(S0_M1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.usr_cd.eq(S0_T1.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.usr_nm.like(bind("usr_nm"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
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
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S04
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S04() {
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MST_SPLN_FMT_R S0_T3 = MST_SPLN_FMT_R.create("T3");
		MST_SPLN_USR_VERS_R S0_T4 = MST_SPLN_USR_VERS_R.create("T4");
		MSW_SPLN_SUM_FIX_KEY_R S0_WK = MSW_SPLN_SUM_FIX_KEY_R.create("WK");
		MAM_USR_R S0_M1 = MAM_USR_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S04")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.usr_cd,
						S0_M1.usr_nm,
						S0_T4.intr_rmrks,
						S0_T1.ym,
						S0_T1.spln_ym,
						sum(S0_T1.spln_qty).as("spln_qty"),
						sum(S0_T1.spln_amt).as("spln_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ym.eq(S0_T1.ym)
								.and(S0_T2.usr_cd.eq(S0_T1.usr_cd))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T3.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T1.spln_ym.between(S0_T3.st_ym, S0_T3.end_ym))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.ym.eq(S0_T1.ym)
								.and(S0_T4.usr_cd.eq(S0_T1.usr_cd))
							)
						)
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.ym.gte(S0_T1.ym)
								.and(S0_WK.dpt_cd.eq(S0_T1.dpt_cd))
								.and(
									S0_WK.cst_cd.eq(cases()
											.when(S0_T3.cst_cd_unit_flg.eq(value(true)))
												.then(S0_T1.cst_cd)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(
									S0_WK.wrk_no.eq(cases()
											.when(S0_T3.wrk_no_unit_flg.eq(value(true)))
												.then(S0_T1.wrk_no)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_WK.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.usr_cd.eq(S0_T1.usr_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.spln_ym.lte(bind("spln_ym_to")))
					)
					.groupBy(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.usr_cd,
						S0_M1.usr_nm,
						S0_T4.intr_rmrks,
						S0_T1.ym,
						S0_T1.spln_ym
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S05
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S05() {
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MST_SPLN_FMT_R S0_T3 = MST_SPLN_FMT_R.create("T3");
		MSW_SPLN_SUM_DTL_KEY_R S0_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S05")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.spln_ym,
						sum(S0_T1.spln_qty).as("spln_qty"),
						sum(S0_T1.spln_amt).as("spln_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.ym.eq(S0_T1.ym)
								.and(S0_T2.usr_cd.eq(S0_T1.usr_cd))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T3.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T1.spln_ym.between(S0_T3.st_ym, S0_T3.end_ym))
							)
						)
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.ym.gte(S0_T1.ym)
								.and(S0_WK.dpt_cd.eq(S0_T1.dpt_cd))
								.and(
									S0_WK.cst_cd.eq(cases()
											.when(S0_T3.cst_cd_unit_flg.eq(value(true)))
												.then(S0_T1.cst_cd)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(
									S0_WK.wrk_no.eq(cases()
											.when(S0_T3.wrk_no_unit_flg.eq(value(true)))
												.then(S0_T1.wrk_no)
											.otherwise(value(MAC_STR.NULL_VAL.value()))
									)
								)
								.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_WK.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_WK.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_WK.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_WK.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_WK.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_WK.spln_ym.eq(S0_T1.spln_ym))
							)
						)
					)
					.groupBy(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.spln_ym
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_DTL_Query_S06
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_DTL_S06() {
		MCTempView S0_V1 = createTempView("V1");
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		MST_SPLN_USR_DTL_R S1_T1 = MST_SPLN_USR_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_DTL_Query_S06")
					.mainQuery()
					.select(
						S0_V1.pr(S1_T1.dpt_cd),
						S0_V1.pr(S1_T1.cst_cd),
						S0_V1.pr(S1_T1.wrk_no),
						S0_V1.pr(S1_T1.spln_itm_cd),
						S0_V1.pr(S1_T1.itm_cd),
						S0_V1.pr(S1_T1.itm_sub1),
						S0_V1.pr(S1_T1.itm_sub2),
						S0_V1.pr(S1_T1.itm_sub3),
						S0_V1.pr(S1_T1.cur_cd),
						least(
							S0_V1.pr("st_ym"),
							nvl(
								S0_W1.st_ym,
								S0_V1.pr("st_ym")
							)
						).as("st_ym"),
						greatest(
							S0_V1.pr("end_ym"),
							nvl(
								S0_W1.end_ym,
								S0_V1.pr("end_ym")
							)
						).as("end_ym")
					)
					.from(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							min(S1_T1.spln_ym).as("st_ym"),
							max(S1_T1.spln_ym).as("end_ym")
						)
						.from(S1_T1)
						.where(
							S1_T1.usr_cd.eq(bind("usr_cd"))
							.and(S1_T1.ym.eq(bind("ym")))
						)
						.groupBy(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd
						).view(S0_V1)
						.innerJoin(S0_W1).on(
							bracket(
								S0_V1.pr(S1_T1.dpt_cd).eq(S0_W1.dpt_cd)
								.and(S0_V1.pr(S1_T1.cst_cd).eq(S0_W1.cst_cd))
								.and(S0_V1.pr(S1_T1.wrk_no).eq(S0_W1.wrk_no))
								.and(S0_V1.pr(S1_T1.spln_itm_cd).eq(S0_W1.spln_itm_cd))
								.and(S0_V1.pr(S1_T1.itm_cd).eq(S0_W1.itm_cd))
								.and(S0_V1.pr(S1_T1.itm_sub1).eq(S0_W1.itm_sub1))
								.and(S0_V1.pr(S1_T1.itm_sub2).eq(S0_W1.itm_sub2))
								.and(S0_V1.pr(S1_T1.itm_sub3).eq(S0_W1.itm_sub3))
								.and(S0_V1.pr(S1_T1.cur_cd).eq(S0_W1.cur_cd))
							)
						)
					)
			);
	}

	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_ITM_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_ITM_D01() {
		MST_SPLN_USR_ITM_R S0_T = MST_SPLN_USR_ITM_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_ITM_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.usr_cd.eq(bind("usr_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_ITM_Query_D02
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_ITM_D02() {
		MST_SPLN_USR_ITM_R S0_T = MST_SPLN_USR_ITM_R.create("T");
		MSW_SPLN_USR_DTL_KEY_R S1_W = MSW_SPLN_USR_DTL_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_ITM_Query_D02")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.usr_cd.eq(S0_T.usr_cd)
									.and(S1_W.ym.eq(S0_T.ym))
									.and(S1_W.dpt_cd.eq(S0_T.dpt_cd))
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.spln_ym.eq(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_ITM_Query_I01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_ITM_I01() {
		MST_SPLN_SUM_ITM_R S0 = MST_SPLN_SUM_ITM_R.create();
		MST_SPLN_USR_ITM_R S1_T1 = MST_SPLN_USR_ITM_R.create("T1");
		MSW_SPLN_USR_DTL_KEY_R S1_WK = MSW_SPLN_USR_DTL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_ITM_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.spln_vers,
						S0.ym,
						S0.spln_ym,
						S0.spln_qty,
						S0.spln_amt
					)
					.query(
						subQuery()
						.select(
							S1_WK.dpt_cd,
							bind("cst_cd"),
							bind("wrk_no"),
							S1_WK.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_WK.cur_cd,
							bind("spln_vers"),
							bind("ym"),
							S1_WK.spln_ym,
							sum(S1_T1.spln_qty).as("spln_qty"),
							sum(S1_T1.spln_amt).as("spln_amt")
						)
						.from(
							S1_T1
							.innerJoin(S1_WK).on(
								bracket(
									S1_WK.usr_cd.eq(S1_T1.usr_cd)
									.and(S1_WK.ym.eq(S1_T1.ym))
									.and(S1_WK.dpt_cd.eq(S1_T1.dpt_cd))
									.and(S1_WK.cst_cd.eq(S1_T1.cst_cd))
									.and(S1_WK.wrk_no.eq(S1_T1.wrk_no))
									.and(S1_WK.spln_itm_cd.eq(S1_T1.spln_itm_cd))
									.and(S1_WK.cur_cd.eq(S1_T1.cur_cd))
									.and(S1_WK.spln_ym.eq(S1_T1.spln_ym))
								)
							)
						)
						.groupBy(
							S1_WK.dpt_cd,
							S1_WK.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_WK.cur_cd,
							S1_WK.spln_ym
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_ITM_NEW_Query_D01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_ITM_NEW_D01() {
		MST_SPLN_USR_ITM_NEW_R S0_T = MST_SPLN_USR_ITM_NEW_R.create("T");
		MSW_SPLN_FMT_R S1_W = MSW_SPLN_FMT_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_ITM_NEW_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.usr_cd.eq(bind("usr_cd")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(
										S1_W.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value()))
										.or(S1_W.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
										.and(S1_W.itm_cd.eq(S0_T.itm_cd))
										.and(S1_W.itm_sub1.eq(S0_T.itm_sub1))
										.and(S1_W.itm_sub2.eq(S0_T.itm_sub2))
										.and(S1_W.itm_sub3.eq(S0_T.itm_sub3))
									)
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.st_ym.lte(S0_T.spln_ym))
									.and(S1_W.end_ym.gte(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_ITM_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_ITM_S01() {
		MSW_SPLN_FMT_R S0_W = MSW_SPLN_FMT_R.create("W");
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		MST_SPLN_USR_FIX_R S0_T2 = MST_SPLN_USR_FIX_R.create("T2");
		MST_SPLN_USR_ITM_R S0_T3 = MST_SPLN_USR_ITM_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						nvl(
							S0_T3.itm_cd,
							S0_T1.itm_cd
						).as("itm_cd"),
						nvl(
							S0_T3.itm_sub1,
							S0_T1.itm_sub1
						).as("itm_sub1"),
						nvl(
							S0_T3.itm_sub2,
							S0_T1.itm_sub2
						).as("itm_sub2"),
						nvl(
							S0_T3.itm_sub3,
							S0_T1.itm_sub3
						).as("itm_sub3"),
						S0_T1.cur_cd,
						S0_T1.spln_ym,
						nvl(
							S0_T3.spln_qty,
							S0_T1.spln_qty
						).as("spln_qty"),
						nvl(
							S0_T3.spln_amt,
							S0_T1.spln_amt
						).as("spln_amt")
					)
					.from(
						S0_W
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.usr_cd.eq(bind("usr_cd"))
								.and(S0_T1.dpt_cd.eq(S0_W.dpt_cd))
								.and(S0_T1.cst_cd.eq(S0_W.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_W.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_W.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_W.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_W.cur_cd))
								.and(S0_T1.spln_ym.gte(S0_W.st_ym))
								.and(S0_T1.spln_ym.lte(S0_W.end_ym))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.usr_cd.eq(S0_T1.usr_cd)
								.and(S0_T3.ym.eq(S0_T1.ym))
								.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T3.spln_ym.eq(S0_T1.spln_ym))
								.and(S0_T1.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							nvl(
								S0_T3.itm_cd,
								S0_T1.itm_cd
							).neq(value(MAC_STR.NULL_VAL.value()))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MST_SPLN_USR_VERS_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MST_SPLN_USR_VERS_S01() {
		MST_SPLN_USR_VERS_R S0_T1 = MST_SPLN_USR_VERS_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MST_SPLN_USR_VERS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.usr_cd,
						S0_T1.ym,
						S0_T1.edited_flg,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.usr_cd.eq(bind("usr_cd")))
						.and(S0_T1.ym.eq(bind("ym")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
	 * -- MSBBL0110_MSW_SPLN_FMT_Query_I01
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_FMT_I01() {
		MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
		MST_SPLN_USR_DTL_R S1_T1 = MST_SPLN_USR_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_FMT_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.st_ym,
						S0.end_ym
					)
					.query(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							min(S1_T1.spln_ym).as("st_ym"),
							max(S1_T1.spln_ym).as("end_ym")
						)
						.from(S1_T1)
						.where(
							S1_T1.usr_cd.eq(bind("usr_cd"))
							.and(S1_T1.ym.eq(bind("ym")))
						)
						.groupBy(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_FMT_Query_I02
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_FMT_I02() {
		MSW_SPLN_FMT_R S0 = MSW_SPLN_FMT_R.create();
		MST_SPLN_SUM_DTL_R S1_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_FMT_Query_I02")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.st_ym,
						S0.end_ym
					)
					.query(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							min(S1_T1.spln_ym).as("st_ym"),
							max(S1_T1.spln_ym).as("end_ym")
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.spln_vers.eq(bind("spln_vers")))
							.and(S1_T1.ym.eq(bind("ym")))
							.and(S1_T1.dpt_cd.eq(bind("dpt_cd")))
							.and(S1_T1.cst_cd.eq(bind("cst_cd")))
							.and(S1_T1.wrk_no.eq(bind("wrk_no")))
						)
						.groupBy(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_FMT_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_FMT_S01() {
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		MST_SPLN_USR_FIX_R S0_T1 = MST_SPLN_USR_FIX_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_FMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.usr_cd,
						S0_T1.ym
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_W1.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_W1.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_W1.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_W1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.cur_cd.eq(S0_T1.cur_cd))
							)
						)
					)
					.where(
						S0_T1.usr_cd.eq(bind("usr_cd"))
						.and(S0_T1.ym.eq(bind("ym")))
					)
					.forUpdate(S0_T1.dpt_cd)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_FMT_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_FMT_S02() {
		MSW_SPLN_FMT_R S0_W1 = MSW_SPLN_FMT_R.create("W1");
		MST_SPLN_SUM_FIX_R S0_T1 = MST_SPLN_SUM_FIX_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_FMT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.spln_vers,
						S0_T1.ym
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_W1.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_W1.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_W1.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_W1.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.cur_cd.eq(S0_T1.cur_cd))
							)
						)
					)
					.where(
						S0_T1.spln_vers.eq(bind("spln_vers"))
						.and(S0_T1.ym.eq(bind("ym")))
					)
					.forUpdate(S0_T1.dpt_cd)
			);
	}

	
	/**
	 * -- MSBBL0110_MSW_SPLN_SUM_DTL_KEY_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_SUM_DTL_KEY_S01() {
		MSW_SPLN_SUM_DTL_KEY_R S0_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_SUM_DTL_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.ym,
						S0_WK.spln_vers,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_WK.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_WK.dpt_cd)
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.ym.eq(S0_WK.ym))
								.and(S0_T1.spln_vers.eq(S0_WK.spln_vers))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
								.and(S0_T1.spln_ym.eq(S0_WK.spln_ym))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_SUM_DTL_KEY_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_SUM_DTL_KEY_S02() {
		MSW_SPLN_SUM_DTL_KEY_R S0_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_SPLN_ITM_R S0_M2 = MAM_SPLN_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_SUM_DTL_KEY_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_WK.spln_ym,
						bracket(
							cases()
								.when(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.spln_set_typ)
								.otherwise(S0_M2.spln_set_typ)
						).as("spln_set_typ")
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_WK.dpt_cd)
								.and(
									cases()
										.when(S0_T1.cst_cd_unit_flg.eq(value(true)))
											.then(S0_T1.cst_cd)
										.otherwise(value(MAC_STR.NULL_VAL.value())).eq(S0_WK.cst_cd)
								)
								.and(
									cases()
										.when(S0_T1.wrk_no_unit_flg.eq(value(true)))
											.then(S0_T1.wrk_no)
										.otherwise(value(MAC_STR.NULL_VAL.value())).eq(S0_WK.wrk_no)
								)
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
								.and(S0_T1.st_ym.lte(S0_WK.spln_ym))
								.and(S0_T1.end_ym.gte(S0_WK.spln_ym))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_WK.spln_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_USR_DTL_KEY_Query_S01
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_USR_DTL_KEY_S01() {
		MSW_SPLN_USR_DTL_KEY_R S0_WK = MSW_SPLN_USR_DTL_KEY_R.create("WK");
		MST_SPLN_USR_DTL_R S0_T1 = MST_SPLN_USR_DTL_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_USR_DTL_KEY_Query_S01")
					.mainQuery()
					.select(
						S0_WK.usr_cd,
						S0_WK.ym,
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_WK.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.usr_cd.eq(S0_WK.usr_cd)
								.and(S0_T1.ym.eq(S0_WK.ym))
								.and(S0_T1.dpt_cd.eq(S0_WK.dpt_cd))
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
								.and(S0_T1.spln_ym.eq(S0_WK.spln_ym))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0110_MSW_SPLN_USR_DTL_KEY_Query_S02
	 */
	static MCQueryPlan MSBBL0110_MSW_SPLN_USR_DTL_KEY_S02() {
		MSW_SPLN_USR_DTL_KEY_R S0_WK = MSW_SPLN_USR_DTL_KEY_R.create("WK");
		MST_SPLN_FMT_R S0_T1 = MST_SPLN_FMT_R.create("T1");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_SPLN_ITM_R S0_M2 = MAM_SPLN_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0110_MSW_SPLN_USR_DTL_KEY_Query_S02")
					.mainQuery()
					.select(
						S0_WK.dpt_cd,
						S0_WK.cst_cd,
						S0_WK.wrk_no,
						S0_WK.spln_itm_cd,
						S0_WK.itm_cd,
						S0_WK.itm_sub1,
						S0_WK.itm_sub2,
						S0_WK.itm_sub3,
						S0_WK.cur_cd,
						S0_WK.spln_ym,
						bracket(
							cases()
								.when(S0_T1.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
									.then(S0_T1.spln_set_typ)
								.otherwise(S0_M2.spln_set_typ)
						).as("spln_set_typ")
					)
					.from(
						S0_WK
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.dpt_cd.eq(S0_WK.dpt_cd)
								.and(S0_T1.cst_cd.eq(S0_WK.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_WK.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_WK.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_WK.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_WK.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_WK.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_WK.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_WK.cur_cd))
								.and(S0_T1.st_ym.lte(S0_WK.spln_ym))
								.and(S0_T1.end_ym.gte(S0_WK.spln_ym))
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_WK.spln_ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
					)
			);
	}
}