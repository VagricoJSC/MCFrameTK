package mcframe.serverMGBF.MGBFL0010;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBFL0010_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0010_MGT_ACC_TOP_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S1_T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_ARG_R S1_T3 = MGT_ARG_R.create("T3");
		MGT_YM_NO_R S1_YM_NO = MGT_YM_NO_R.create("YM_NO");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MGT_CALC_ITM_MFG_INST_R S1_CALC_ITM_MFG_INST = MGT_CALC_ITM_MFG_INST_R.create("CALC_ITM_MFG_INST");
		MGT_ITM_MFG_INST_R S1_ITM_MFG_INST = MGT_ITM_MFG_INST_R.create("ITM_MFG_INST");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MGT_ARG_R S1_ARG = MGT_ARG_R.create("ARG");
		MAM_ITM_GRP_R S1_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S1_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S1_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S1_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S1_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S1_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S1_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S1_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S1_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S1_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_CNTRY_R S1_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S1_AREA = MAM_AREA_R.create("AREA");
		MAM_BP_GRP_R S1_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S1_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S1_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S1_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S1_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S1_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S1_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S1_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S1_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S1_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0010_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_no,
							S1_YM_NO.calc_no.as("fix_calc_no"),
							S1_T.calc_grp_cd,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							max(S1_T.ym).as("ym"),
							S1_T.mng_dpt_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.asst_typ,
							S1_T.bp_cd,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.iv_no,
							nvl(
								sum(
									decode(
										S1_T.calc_rec_typ,
										value(MGC_CALC_REC_TYP.ST_WIP.value()),
										S1_T2.act_cost,
										value(0)
									)
								),
								value(0)
							).as("st_wip_cost"),
							nvl(
								sum(
									decode(
										S1_T.calc_rec_typ,
										value(MGC_CALC_REC_TYP.END_WIP.value()),
										S1_T2.act_cost,
										value(0)
									)
								),
								value(0)
							).as("end_wip_cost"),
							nvl(
								sum(
									decode(
										S1_T.calc_rec_typ,
										value(MGC_CALC_REC_TYP.INST.value()),
										S1_T2.act_cost,
										value(0)
									)
								),
								value(0)
							).as("inst_cost"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
							)
							.innerJoin(S1_T3).on(
								S1_T3.calc_no.eq(S1_T.calc_no)
								.and(S1_T3.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(
									S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value()))
									.and(S1_T.ym.eq(S1_T3.st_ym))
									.or(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
									.and(S1_T.ym.eq(S1_T3.end_ym))
									.or(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								)
							)
							.leftOuterJoin(S1_YM_NO).on(
								S1_YM_NO.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_YM_NO.ym.eq(S1_T.ym))
							)
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_T.itm_cd.eq(S1_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T.itm_cd.eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T.sno1.eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T.sno2.eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T.sno3.eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T.sno4.eq(S1_SUNDRY_ITM.sno4))
							)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
							.cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
							.cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
							.cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
							.cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
							.cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
							.cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
							.cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
							.cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
							.cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_po_no_flg_str").eq(value(true))
								.and(S1_T.po_no.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S1_T.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S1_T.iv_no.isNull())
							)
							.addDynamicPredicate(DS1D)
						)
						.groupBy(
							S1_T.calc_no,
							S1_YM_NO.calc_no,
							S1_T.calc_grp_cd,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_T.mng_dpt_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_ITM.itm_typ,
							S1_ITM.itm_typ_d_cd,
							S1_ITM.itm_jnl_cd,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_ITM.unit_cd,
							S1_ITM.dec_place,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.asst_typ,
							S1_T.bp_cd,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.iv_no,
							addDynamicGroupBy(DS1D)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("qty"))
					.groupBy(DS0D, S0_T.pr("qty")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("schd_st_dt"))
					.groupBy(DS0D, S0_T.pr("schd_st_dt")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("schd_end_dt"))
					.groupBy(DS0D, S0_T.pr("schd_end_dt")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("act_st_dt"))
					.groupBy(DS0D, S0_T.pr("act_st_dt")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("act_end_dt"))
					.groupBy(DS0D, S0_T.pr("act_end_dt")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("rmrks"))
					.groupBy(DS0D, S0_T.pr("rmrks")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("sub_char1"))
					.groupBy(DS0D, S0_T.pr("sub_char1")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("sub_char2"))
					.groupBy(DS0D, S0_T.pr("sub_char2")),
				when(boundOr("mfg_inst_flg"))
					.select(DS0D, S0_T.pr("sub_char3"))
					.groupBy(DS0D, S0_T.pr("sub_char3")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.calc_grp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_grp_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.calc_no))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_no)),
				when(null)
					.select(DS0D, S0_T.pr("fix_calc_no"))
					.groupBy(DS0D, S0_T.pr("fix_calc_no")),
				when(null)
					.select(DS0D, S0_T.pr("ym"))
					.groupBy(DS0D, S0_T.pr("ym")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub1)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub2)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(null)
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(null)
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(null)
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(null)
					.select(DS0D, nvl(sum(S0_T.pr("st_wip_cost")),value(0)).as("st_wip_cost")),
				when(null)
					.select(DS0D, nvl(sum(S0_T.pr("end_wip_cost")),value(0)).as("end_wip_cost")),
				when(null)
					.select(DS0D, nvl(sum(S0_T.pr("inst_cost")),value(0)).as("inst_cost")),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_ARG).on(S1_T.calc_no.eq(S1_ARG.calc_no).and(S1_T.calc_grp_cd.eq(S1_ARG.calc_grp_cd)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_ARG.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("loc_flg", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_T.loc_cd.eq(S1_STR_LN.loc_cd).and(S1_T.str_ln_cd.eq(S1_STR_LN.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3", "bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7", "bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1", "bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5", "bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM_MFG_INST.qty.as("qty"))
					.groupBy(DS1D, S1_ITM_MFG_INST.qty),
				when(boundOr("qty_flg", "qty_flg", "mfg_inst_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CALC_ITM_MFG_INST).on(S1_CALC_ITM_MFG_INST.calc_no.eq(S1_T.calc_no).and(S1_CALC_ITM_MFG_INST.calc_grp_cd.eq(S1_T.calc_grp_cd)).and(S1_CALC_ITM_MFG_INST.itm_cd.eq(S1_T.itm_cd)).and(S1_CALC_ITM_MFG_INST.itm_sub1.eq(S1_T.itm_sub1)).and(S1_CALC_ITM_MFG_INST.itm_sub2.eq(S1_T.itm_sub2)).and(S1_CALC_ITM_MFG_INST.itm_sub3.eq(S1_T.itm_sub3)).and(S1_CALC_ITM_MFG_INST.itm_mfg_inst_no.eq(S1_T.itm_mfg_inst_no)).and(S1_CALC_ITM_MFG_INST.mfg_act_no.eq(S1_T.mfg_act_no))).leftOuterJoin(S1_ITM_MFG_INST).on(S1_ITM_MFG_INST.calc_ctg_cd.eq(S1_CALC_ITM_MFG_INST.calc_ctg_cd).and(S1_ITM_MFG_INST.itm_cd.eq(S1_CALC_ITM_MFG_INST.itm_cd)).and(S1_ITM_MFG_INST.itm_sub1.eq(S1_CALC_ITM_MFG_INST.itm_sub1)).and(S1_ITM_MFG_INST.itm_sub2.eq(S1_CALC_ITM_MFG_INST.itm_sub2)).and(S1_ITM_MFG_INST.itm_sub3.eq(S1_CALC_ITM_MFG_INST.itm_sub3)).and(S1_ITM_MFG_INST.itm_mfg_inst_no.eq(S1_CALC_ITM_MFG_INST.itm_mfg_inst_no)).and(S1_ITM_MFG_INST.mfg_act_no.eq(S1_CALC_ITM_MFG_INST.mfg_act_no)))),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(boundOr("qty_flg", "qty_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.schd_st_dt.as("schd_st_dt"))
					.groupBy(DS1D, S1_ITM_MFG_INST.schd_st_dt),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.schd_end_dt.as("schd_end_dt"))
					.groupBy(DS1D, S1_ITM_MFG_INST.schd_end_dt),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.act_st_dt.as("act_st_dt"))
					.groupBy(DS1D, S1_ITM_MFG_INST.act_st_dt),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.act_end_dt.as("act_end_dt"))
					.groupBy(DS1D, S1_ITM_MFG_INST.act_end_dt),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.rmrks.as("rmrks"))
					.groupBy(DS1D, S1_ITM_MFG_INST.rmrks),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.sub_char1.as("sub_char1"))
					.groupBy(DS1D, S1_ITM_MFG_INST.sub_char1),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.sub_char2.as("sub_char2"))
					.groupBy(DS1D, S1_ITM_MFG_INST.sub_char2),
				when(boundOr("mfg_inst_flg"))
					.select(DS1D, S1_ITM_MFG_INST.sub_char3.as("sub_char3"))
					.groupBy(DS1D, S1_ITM_MFG_INST.sub_char3),
				when(null)
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(null)
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(null)
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(null)
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(null)
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(null)
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CNTRY).on(S1_BP.cntry_cd.eq(S1_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AREA).on(S1_BP.area_cd.eq(S1_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("ym").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.itm_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub1).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub2).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub3).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.mfg_act_no).asc())
			);
	}
	/**
	 * MGBFL0010_MGT_ACC_TOP_S02
	 */
	static MCQueryPlan MGBFL0010_MGT_ACC_TOP_S02() {
		MGT_ACC_TOP_R S0T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S0T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_ARG_R S0T3 = MGT_ARG_R.create("T3");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S0LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S0OPER = MAM_OPER_R.create("OPER");
		MAM_AC_RSN_R S0AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0010_MGT_ACC_TOP_Query_S02")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							nullValue().as("ttl_grp"),
							S0T.ym,
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(1),
								value(MGC_CALC_REC_TYP.INST.value()),
								value(2),
								value(MGC_CALC_REC_TYP.COMP.value()),
								value(3),
								value(4)
							).as("calc_rec_seq"),
							S0T.calc_rec_typ,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0T.loc_cd,
							S0LOC.loc_nm,
							S0T.str_ln_cd,
							S0STR_LN.str_ln_nm,
							S0T.oper_act_no,
							S0T.oper_cd,
							S0OPER.oper_nm,
							S0T.ac_slip_typ,
							S0T.ac_rsn_cd,
							S0AC_RSN.ac_rsn_nm,
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.COMP.value()),
								S0T.act_upri,
								nullValue()
							).as("act_upri"),
							S0T.qty,
							S0ITM.unit_cd,
							S0UNIT.unit_nm,
							S0ITM.dec_place,
							S0T.per,
							S0T2.expns_cd,
							S0EXPNS.expns_grp_cd,
							S0EXPNS.var_typ,
							S0T2.act_cost
						)
						.from(
							S0T
							.leftOuterJoin(S0T2).on(
								S0T2.calc_no.eq(S0T.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
								.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
								.and(S0T2.expns_typ.eq(value(MAC_EXPNS_TYP.PROD.value())))
							)
							.innerJoin(S0T3).on(
								S0T3.calc_no.eq(S0T.calc_no)
								.and(S0T3.calc_grp_cd.eq(S0T.calc_grp_cd))
							)
							.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0UNIT).on(S0ITM.unit_cd.eq(S0UNIT.unit_cd))
							.leftOuterJoin(S0LOC).on(S0T.loc_cd.eq(S0LOC.loc_cd))
							.leftOuterJoin(S0STR_LN).on(
								S0T.loc_cd.eq(S0STR_LN.loc_cd)
								.and(S0T.str_ln_cd.eq(S0STR_LN.str_ln_cd))
							)
							.leftOuterJoin(S0OPER).on(S0T.oper_cd.eq(S0OPER.oper_cd))
							.leftOuterJoin(S0AC_RSN).on(S0T.ac_rsn_cd.eq(S0AC_RSN.ac_rsn_cd))
							.leftOuterJoin(S0EXPNS).on(S0T2.expns_cd.eq(S0EXPNS.expns_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.calc_no.like(bind("calc_no")))
							.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S0T.itm_cd.eq(bind("itm_cd")))
							.and(S0T.itm_sub1.eq(bind("itm_sub1")))
							.and(S0T.itm_sub2.eq(bind("itm_sub2")))
							.and(S0T.itm_sub3.eq(bind("itm_sub3")))
							.and(S0T.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.and(S0T.mfg_act_no.eq(bind("mfg_act_no")))
							.and(
								S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value()))
								.and(S0T.ym.eq(S0T3.st_ym))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
							)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
				.having(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr)
				)
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(null)
					.select(aggr,T.pr("calc_rec_seq"))
					.groupBy(aggr,T.pr("calc_rec_seq"))
					.orderBy(T.pr("calc_rec_seq").asc()),
				when(null)
					.select(aggr,T.pr("ttl_grp"))
					.groupBy(aggr,T.pr("ttl_grp")),
				when(null)
					.select(aggr,T.pr("calc_rec_typ"))
					.groupBy(aggr,T.pr("calc_rec_typ")),
				when(null)
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no")),
				when(null)
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no")),
				when(null)
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1")),
				when(null)
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2")),
				when(null)
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3")),
				when(null)
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4")),
				when(null)
					.select(aggr,T.pr("loc_cd"))
					.groupBy(aggr,T.pr("loc_cd")),
				when(null)
					.select(aggr,T.pr("loc_nm"))
					.groupBy(aggr,T.pr("loc_nm")),
				when(null)
					.select(aggr,T.pr("str_ln_cd"))
					.groupBy(aggr,T.pr("str_ln_cd")),
				when(null)
					.select(aggr,T.pr("str_ln_nm"))
					.groupBy(aggr,T.pr("str_ln_nm")),
				when(null)
					.select(aggr,T.pr("oper_act_no"))
					.groupBy(aggr,T.pr("oper_act_no")),
				when(null)
					.select(aggr,T.pr("oper_cd"))
					.groupBy(aggr,T.pr("oper_cd")),
				when(null)
					.select(aggr,T.pr("oper_nm"))
					.groupBy(aggr,T.pr("oper_nm")),
				when(null)
					.select(aggr,T.pr("ac_slip_typ"))
					.groupBy(aggr,T.pr("ac_slip_typ")),
				when(null)
					.select(aggr,T.pr("ac_rsn_cd"))
					.groupBy(aggr,T.pr("ac_rsn_cd")),
				when(null)
					.select(aggr,T.pr("ac_rsn_nm"))
					.groupBy(aggr,T.pr("ac_rsn_nm")),
				when(null)
					.select(aggr,T.pr("act_upri"))
					.groupBy(aggr,T.pr("act_upri")),
				when(null)
					.select(aggr,T.pr("qty"))
					.groupBy(aggr,T.pr("qty")),
				when(null)
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(null)
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(null)
					.select(aggr,T.pr("dec_place"))
					.groupBy(aggr,T.pr("dec_place")),
				when(null)
					.select(aggr,T.pr("per"))
					.groupBy(aggr,T.pr("per")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("act_cost"),value(0))),value(0)).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("act_cost"),value(0))),value(0)).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("act_cost"),value(0))),value(0)).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("act_cost"),value(0))),value(0)).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("act_cost"),value(0))),value(0)).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("act_cost"),value(0))),value(0)).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("act_cost"),value(0))),value(0)).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("act_cost"),value(0))),value(0)).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("act_cost"),value(0))),value(0)).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("act_cost"),value(0))),value(0)).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("act_cost"),value(0))),value(0)).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("act_cost"),value(0))),value(0)).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("act_cost"),value(0))),value(0)).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("act_cost"),value(0))),value(0)).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("act_cost"),value(0))),value(0)).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("act_cost"),value(0))),value(0)).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("act_cost"),value(0))),value(0)).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("act_cost"),value(0))),value(0)).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("act_cost"),value(0))),value(0)).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("act_cost"),value(0))),value(0)).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("act_cost"),value(0))),value(0)).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("act_cost"),value(0))),value(0)).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("act_cost"),value(0))),value(0)).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("act_cost"),value(0))),value(0)).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("act_cost"),value(0))),value(0)).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("act_cost"),value(0))),value(0)).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("act_cost"),value(0))),value(0)).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("act_cost"),value(0))),value(0)).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("act_cost"),value(0))),value(0)).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("act_cost"),value(0))),value(0)).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("act_cost"),value(0))),value(0)).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("act_cost"),value(0))),value(0)).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("act_cost"),value(0))),value(0)).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("act_cost"),value(0))),value(0)).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("act_cost"),value(0))),value(0)).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("act_cost"),value(0))),value(0)).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("act_cost"),value(0))),value(0)).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("act_cost"),value(0))),value(0)).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("act_cost"),value(0))),value(0)).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("act_cost"),value(0))),value(0)).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("act_cost"),value(0))),value(0)).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("act_cost"),value(0))),value(0)).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("act_cost"),value(0))),value(0)).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("act_cost"),value(0))),value(0)).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("act_cost"),value(0))),value(0)).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("act_cost"),value(0))),value(0)).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("act_cost"),value(0))),value(0)).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("act_cost"),value(0))),value(0)).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("act_cost"),value(0))),value(0)).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("act_cost"),value(0))),value(0)).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_099"))
			);
	}
	
	/**
	 * MGBFL0010_MGT_ACC_TOP_S03
	 */
	static MCQueryPlan MGBFL0010_MGT_ACC_TOP_S03() {
		MGT_ACC_TOP_R S0T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S0T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_COST_R S0T3 = MGT_ACC_COST_R.create("T3");
		MGT_ARG_R S0T4 = MGT_ARG_R.create("T4");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S0LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S0OPER = MAM_OPER_R.create("OPER");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MGT_ACC_TOP_R S1T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S1WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S1UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S1LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S1STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S1OPER = MAM_OPER_R.create("OPER");
		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0010_MGT_ACC_TOP_Query_S03")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(1),
								value(MGC_CALC_REC_TYP.INST.value()),
								value(1),
								value(2)
							).as("ttl_grp"),
							S0T.ym,
							S0T.top_rec_no,
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(1),
								value(MGC_CALC_REC_TYP.INST.value()),
								value(2),
								value(4)
							).as("calc_rec_seq"),
							S0T.calc_rec_typ,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0T.loc_cd,
							S0LOC.loc_nm,
							S0T.str_ln_cd,
							S0STR_LN.str_ln_nm,
							S0T.oper_act_no,
							S0T.oper_cd,
							S0OPER.oper_nm,
							nullValue().as("ac_slip_typ"),
							nullValue().as("ac_rsn_cd"),
							nullValue().as("ac_rsn_nm"),
							nullValue().as("act_upri"),
							S0T.qty,
							S0ITM.unit_cd,
							S0UNIT.unit_nm,
							S0ITM.dec_place,
							S0T.per,
							nullValue().as("qty_per"),
							S0T3.expns_cd,
							S0EXPNS.expns_grp_cd,
							S0EXPNS.var_typ,
							S0T3.act_cost
						)
						.from(
							S0T
							.innerJoin(S0T2).on(
								S0T2.calc_no.eq(S0T.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
								.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
								.and(S0T2.lvl.eq(value(0)))
							)
							.innerJoin(S0T3).on(
								S0T3.calc_no.eq(S0T2.calc_no)
								.and(S0T3.calc_grp_cd.eq(S0T2.calc_grp_cd))
								.and(S0T3.sml_inpt_rec_no.eq(S0T2.inpt_rec_no))
								.and(S0T3.expns_typ.eq(value(MAC_EXPNS_TYP.PROD.value())))
							)
							.innerJoin(S0T4).on(
								S0T4.calc_no.eq(S0T.calc_no)
								.and(S0T4.calc_grp_cd.eq(S0T.calc_grp_cd))
							)
							.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0UNIT).on(S0ITM.unit_cd.eq(S0UNIT.unit_cd))
							.leftOuterJoin(S0LOC).on(S0T.loc_cd.eq(S0LOC.loc_cd))
							.leftOuterJoin(S0STR_LN).on(
								S0T.loc_cd.eq(S0STR_LN.loc_cd)
								.and(S0T.str_ln_cd.eq(S0STR_LN.str_ln_cd))
							)
							.leftOuterJoin(S0OPER).on(S0T.oper_cd.eq(S0OPER.oper_cd))
							.leftOuterJoin(S0EXPNS).on(S0T3.expns_cd.eq(S0EXPNS.expns_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.calc_no.like(bind("calc_no")))
							.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S0T.itm_cd.eq(bind("itm_cd")))
							.and(S0T.itm_sub1.eq(bind("itm_sub1")))
							.and(S0T.itm_sub2.eq(bind("itm_sub2")))
							.and(S0T.itm_sub3.eq(bind("itm_sub3")))
							.and(S0T.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.and(S0T.mfg_act_no.eq(bind("mfg_act_no")))
							.and(
								S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value()))
								.and(S0T.ym.eq(S0T4.st_ym))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							)
						)
						.unionAll(
							subQuery()
							.select(
								value(2).as("ttl_grp"),
								S1T.ym,
								S1T.top_rec_no,
								value(3).as("calc_rec_seq"),
								S1T.calc_rec_typ,
								S1T.lot_no,
								S1T.sublot_no,
								S1T.sno1,
								S1T.sno2,
								S1T.sno3,
								S1T.sno4,
								S1T.loc_cd,
								S1LOC.loc_nm,
								S1T.str_ln_cd,
								S1STR_LN.str_ln_nm,
								S1T.oper_act_no,
								S1T.oper_cd,
								S1OPER.oper_nm,
								nullValue().as("ac_slip_typ"),
								nullValue().as("ac_rsn_cd"),
								nullValue().as("ac_rsn_nm"),
								nullValue().as("act_upri"),
								S1T.qty,
								S1ITM.unit_cd,
								S1UNIT.unit_nm,
								S1ITM.dec_place,
								S1T.per,
								nullValue().as("qty_per"),
								nullValue().as("expns_cd"),
								nullValue().as("expns_grp_cd"),
								nullValue().as("var_typ"),
								nullValue().as("act_cost")
							)
							.from(
								S1T
								.innerJoin(S1WG).on(S1T.wg_cd.eq(S1WG.wg_cd))
								.leftOuterJoin(S1ITM).on(
									S1T.itm_cd.eq(S1ITM.itm_cd)
									.and(S1T.itm_sub1.eq(S1ITM.itm_sub1))
									.and(S1T.itm_sub2.eq(S1ITM.itm_sub2))
									.and(S1T.itm_sub3.eq(S1ITM.itm_sub3))
								)
								.leftOuterJoin(S1UNIT).on(S1ITM.unit_cd.eq(S1UNIT.unit_cd))
								.leftOuterJoin(S1LOC).on(S1T.loc_cd.eq(S1LOC.loc_cd))
								.leftOuterJoin(S1STR_LN).on(
									S1T.loc_cd.eq(S1STR_LN.loc_cd)
									.and(S1T.str_ln_cd.eq(S1STR_LN.str_ln_cd))
								)
								.leftOuterJoin(S1OPER).on(S1T.oper_cd.eq(S1OPER.oper_cd))
							)
							.where(
								value(0).eq(value(0))
								.and(S1T.calc_no.like(bind("calc_no")))
								.and(S1T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S1T.itm_cd.eq(bind("itm_cd")))
								.and(S1T.itm_sub1.eq(bind("itm_sub1")))
								.and(S1T.itm_sub2.eq(bind("itm_sub2")))
								.and(S1T.itm_sub3.eq(bind("itm_sub3")))
								.and(S1T.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
								.and(S1T.mfg_act_no.eq(bind("mfg_act_no")))
								.and(S1T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
							)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
				.having(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr)
				)
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(null)
					.select(aggr,T.pr("calc_rec_seq"))
					.groupBy(aggr,T.pr("calc_rec_seq"))
					.orderBy(T.pr("calc_rec_seq").asc()),
				when(null)
					.select(aggr,T.pr("ttl_grp"))
					.groupBy(aggr,T.pr("ttl_grp")),
				when(null)
					.select(aggr,T.pr("calc_rec_typ"))
					.groupBy(aggr,T.pr("calc_rec_typ")),
				when(null)
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no")),
				when(null)
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no")),
				when(null)
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1")),
				when(null)
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2")),
				when(null)
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3")),
				when(null)
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4")),
				when(null)
					.select(aggr,T.pr("loc_cd"))
					.groupBy(aggr,T.pr("loc_cd")),
				when(null)
					.select(aggr,T.pr("loc_nm"))
					.groupBy(aggr,T.pr("loc_nm")),
				when(null)
					.select(aggr,T.pr("str_ln_cd"))
					.groupBy(aggr,T.pr("str_ln_cd")),
				when(null)
					.select(aggr,T.pr("str_ln_nm"))
					.groupBy(aggr,T.pr("str_ln_nm")),
				when(null)
					.select(aggr,T.pr("oper_act_no"))
					.groupBy(aggr,T.pr("oper_act_no")),
				when(null)
					.select(aggr,T.pr("oper_cd"))
					.groupBy(aggr,T.pr("oper_cd")),
				when(null)
					.select(aggr,T.pr("oper_nm"))
					.groupBy(aggr,T.pr("oper_nm")),
				when(null)
					.select(aggr,T.pr("ac_slip_typ"))
					.groupBy(aggr,T.pr("ac_slip_typ")),
				when(null)
					.select(aggr,T.pr("ac_rsn_cd"))
					.groupBy(aggr,T.pr("ac_rsn_cd")),
				when(null)
					.select(aggr,T.pr("ac_rsn_nm"))
					.groupBy(aggr,T.pr("ac_rsn_nm")),
				when(null)
					.select(aggr,T.pr("act_upri"))
					.groupBy(aggr,T.pr("act_upri")),
				when(null)
					.select(aggr,T.pr("qty"))
					.groupBy(aggr,T.pr("qty")),
				when(null)
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(null)
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(null)
					.select(aggr,T.pr("dec_place"))
					.groupBy(aggr,T.pr("dec_place")),
				when(null)
					.select(aggr,T.pr("per"))
					.groupBy(aggr,T.pr("per")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("act_cost"),value(0))),value(0)).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("act_cost"),value(0))),value(0)).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("act_cost"),value(0))),value(0)).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("act_cost"),value(0))),value(0)).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("act_cost"),value(0))),value(0)).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("act_cost"),value(0))),value(0)).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("act_cost"),value(0))),value(0)).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("act_cost"),value(0))),value(0)).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("act_cost"),value(0))),value(0)).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("act_cost"),value(0))),value(0)).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("act_cost"),value(0))),value(0)).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("act_cost"),value(0))),value(0)).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("act_cost"),value(0))),value(0)).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("act_cost"),value(0))),value(0)).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("act_cost"),value(0))),value(0)).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("act_cost"),value(0))),value(0)).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("act_cost"),value(0))),value(0)).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("act_cost"),value(0))),value(0)).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("act_cost"),value(0))),value(0)).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("act_cost"),value(0))),value(0)).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("act_cost"),value(0))),value(0)).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("act_cost"),value(0))),value(0)).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("act_cost"),value(0))),value(0)).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("act_cost"),value(0))),value(0)).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("act_cost"),value(0))),value(0)).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("act_cost"),value(0))),value(0)).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("act_cost"),value(0))),value(0)).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("act_cost"),value(0))),value(0)).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("act_cost"),value(0))),value(0)).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("act_cost"),value(0))),value(0)).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("act_cost"),value(0))),value(0)).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("act_cost"),value(0))),value(0)).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("act_cost"),value(0))),value(0)).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("act_cost"),value(0))),value(0)).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("act_cost"),value(0))),value(0)).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("act_cost"),value(0))),value(0)).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("act_cost"),value(0))),value(0)).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("act_cost"),value(0))),value(0)).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("act_cost"),value(0))),value(0)).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("act_cost"),value(0))),value(0)).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("act_cost"),value(0))),value(0)).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("act_cost"),value(0))),value(0)).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("act_cost"),value(0))),value(0)).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("act_cost"),value(0))),value(0)).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("act_cost"),value(0))),value(0)).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("act_cost"),value(0))),value(0)).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("act_cost"),value(0))),value(0)).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("act_cost"),value(0))),value(0)).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("act_cost"),value(0))),value(0)).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("act_cost"),value(0))),value(0)).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_099"))
			);
	}
	
	/**
	 * MGBFL0010_MGT_ACC_TOP_S04
	 */
	static MCQueryPlan MGBFL0010_MGT_ACC_TOP_S04() {
		MGT_ACC_TOP_R S0T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S0T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_COST_R S0T3 = MGT_ACC_COST_R.create("T3");
		MGT_ARG_R S0T4 = MGT_ARG_R.create("T4");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S0LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S0OPER = MAM_OPER_R.create("OPER");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MGT_ACC_TOP_R S1T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S1WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S1UNIT = MAM_UNIT_R.create("UNIT");
		MAM_LOC_R S1LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S1STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S1OPER = MAM_OPER_R.create("OPER");
		MCTempView T = createTempView("T");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0010_MGT_ACC_TOP_Query_S04")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(1),
								value(MGC_CALC_REC_TYP.INST.value()),
								value(1),
								value(2)
							).as("ttl_grp"),
							S0T.ym,
							S0T.top_rec_no,
							decode(
								S0T.calc_rec_typ,
								value(MGC_CALC_REC_TYP.ST_WIP.value()),
								value(1),
								value(MGC_CALC_REC_TYP.INST.value()),
								value(2),
								value(4)
							).as("calc_rec_seq"),
							S0T.calc_rec_typ,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0T.loc_cd,
							S0LOC.loc_nm,
							S0T.str_ln_cd,
							S0STR_LN.str_ln_nm,
							S0T.oper_act_no,
							S0T.oper_cd,
							S0OPER.oper_nm,
							nullValue().as("ac_slip_typ"),
							nullValue().as("ac_rsn_cd"),
							nullValue().as("ac_rsn_nm"),
							nullValue().as("act_upri"),
							S0T.qty,
							S0ITM.unit_cd,
							S0UNIT.unit_nm,
							S0ITM.dec_place,
							nullValue().as("per"),
							nullValue().as("qty_per"),
							S0T3.expns_cd,
							S0EXPNS.expns_grp_cd,
							S0EXPNS.var_typ,
							S0T3.act_cost
						)
						.from(
							S0T
							.innerJoin(S0T2).on(
								S0T2.calc_no.eq(S0T.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
								.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
								.and(S0T2.lvl.eq(value(1)))
							)
							.innerJoin(S0T3).on(
								S0T3.calc_no.eq(S0T2.calc_no)
								.and(S0T3.calc_grp_cd.eq(S0T2.calc_grp_cd))
								.and(S0T3.sml_inpt_rec_no.eq(S0T2.inpt_rec_no))
								.and(S0T3.expns_typ.eq(value(MAC_EXPNS_TYP.PROD.value())))
							)
							.innerJoin(S0T4).on(
								S0T4.calc_no.eq(S0T.calc_no)
								.and(S0T4.calc_grp_cd.eq(S0T.calc_grp_cd))
							)
							.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0UNIT).on(S0ITM.unit_cd.eq(S0UNIT.unit_cd))
							.leftOuterJoin(S0LOC).on(S0T.loc_cd.eq(S0LOC.loc_cd))
							.leftOuterJoin(S0STR_LN).on(
								S0T.loc_cd.eq(S0STR_LN.loc_cd)
								.and(S0T.str_ln_cd.eq(S0STR_LN.str_ln_cd))
							)
							.leftOuterJoin(S0OPER).on(S0T.oper_cd.eq(S0OPER.oper_cd))
							.leftOuterJoin(S0EXPNS).on(S0T3.expns_cd.eq(S0EXPNS.expns_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.calc_no.like(bind("calc_no")))
							.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S0T.itm_cd.eq(bind("itm_cd")))
							.and(S0T.itm_sub1.eq(bind("itm_sub1")))
							.and(S0T.itm_sub2.eq(bind("itm_sub2")))
							.and(S0T.itm_sub3.eq(bind("itm_sub3")))
							.and(S0T.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
							.and(S0T.mfg_act_no.eq(bind("mfg_act_no")))
							.and(
								S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value()))
								.and(S0T.ym.eq(S0T4.st_ym))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
								.or(S0T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							)
						)
						.unionAll(
							subQuery()
							.select(
								value(2).as("ttl_grp"),
								S1T.ym,
								S1T.top_rec_no,
								value(3).as("calc_rec_seq"),
								S1T.calc_rec_typ,
								S1T.lot_no,
								S1T.sublot_no,
								S1T.sno1,
								S1T.sno2,
								S1T.sno3,
								S1T.sno4,
								S1T.loc_cd,
								S1LOC.loc_nm,
								S1T.str_ln_cd,
								S1STR_LN.str_ln_nm,
								S1T.oper_act_no,
								S1T.oper_cd,
								S1OPER.oper_nm,
								nullValue().as("ac_slip_typ"),
								nullValue().as("ac_rsn_cd"),
								nullValue().as("ac_rsn_nm"),
								nullValue().as("act_upri"),
								S1T.qty,
								S1ITM.unit_cd,
								S1UNIT.unit_nm,
								S1ITM.dec_place,
								nullValue().as("per"),
								nullValue().as("qty_per"),
								nullValue().as("expns_cd"),
								nullValue().as("expns_grp_cd"),
								nullValue().as("var_typ"),
								nullValue().as("act_cost")
							)
							.from(
								S1T
								.innerJoin(S1WG).on(S1T.wg_cd.eq(S1WG.wg_cd))
								.leftOuterJoin(S1ITM).on(
									S1T.itm_cd.eq(S1ITM.itm_cd)
									.and(S1T.itm_sub1.eq(S1ITM.itm_sub1))
									.and(S1T.itm_sub2.eq(S1ITM.itm_sub2))
									.and(S1T.itm_sub3.eq(S1ITM.itm_sub3))
								)
								.leftOuterJoin(S1UNIT).on(S1ITM.unit_cd.eq(S1UNIT.unit_cd))
								.leftOuterJoin(S1LOC).on(S1T.loc_cd.eq(S1LOC.loc_cd))
								.leftOuterJoin(S1STR_LN).on(
									S1T.loc_cd.eq(S1STR_LN.loc_cd)
									.and(S1T.str_ln_cd.eq(S1STR_LN.str_ln_cd))
								)
								.leftOuterJoin(S1OPER).on(S1T.oper_cd.eq(S1OPER.oper_cd))
							)
							.where(
								value(0).eq(value(0))
								.and(S1T.calc_no.like(bind("calc_no")))
								.and(S1T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.and(S1T.itm_cd.eq(bind("itm_cd")))
								.and(S1T.itm_sub1.eq(bind("itm_sub1")))
								.and(S1T.itm_sub2.eq(bind("itm_sub2")))
								.and(S1T.itm_sub3.eq(bind("itm_sub3")))
								.and(S1T.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")))
								.and(S1T.mfg_act_no.eq(bind("mfg_act_no")))
								.and(S1T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
							)
						)
					.view(T)
				)
				.groupBy(
					addDynamicGroupBy(aggr)
				)
				.having(
					value(0).eq(value(0))
					.addDynamicPredicate(aggr)
				)
				.orderBy(
					addDynamicOrderBy()
				)
		)
			.setDynamicSQLInfo(
				when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(null)
					.select(aggr,T.pr("calc_rec_seq"))
					.groupBy(aggr,T.pr("calc_rec_seq"))
					.orderBy(T.pr("calc_rec_seq").asc()),
				when(null)
					.select(aggr,T.pr("ttl_grp"))
					.groupBy(aggr,T.pr("ttl_grp")),
				when(null)
					.select(aggr,T.pr("calc_rec_typ"))
					.groupBy(aggr,T.pr("calc_rec_typ")),
				when(null)
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no")),
				when(null)
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no")),
				when(null)
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1")),
				when(null)
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2")),
				when(null)
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3")),
				when(null)
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4")),
				when(null)
					.select(aggr,T.pr("loc_cd"))
					.groupBy(aggr,T.pr("loc_cd")),
				when(null)
					.select(aggr,T.pr("loc_nm"))
					.groupBy(aggr,T.pr("loc_nm")),
				when(null)
					.select(aggr,T.pr("str_ln_cd"))
					.groupBy(aggr,T.pr("str_ln_cd")),
				when(null)
					.select(aggr,T.pr("str_ln_nm"))
					.groupBy(aggr,T.pr("str_ln_nm")),
				when(null)
					.select(aggr,T.pr("oper_act_no"))
					.groupBy(aggr,T.pr("oper_act_no")),
				when(null)
					.select(aggr,T.pr("oper_cd"))
					.groupBy(aggr,T.pr("oper_cd")),
				when(null)
					.select(aggr,T.pr("oper_nm"))
					.groupBy(aggr,T.pr("oper_nm")),
				when(null)
					.select(aggr,T.pr("ac_slip_typ"))
					.groupBy(aggr,T.pr("ac_slip_typ")),
				when(null)
					.select(aggr,T.pr("ac_rsn_cd"))
					.groupBy(aggr,T.pr("ac_rsn_cd")),
				when(null)
					.select(aggr,T.pr("ac_rsn_nm"))
					.groupBy(aggr,T.pr("ac_rsn_nm")),
				when(null)
					.select(aggr,T.pr("act_upri"))
					.groupBy(aggr,T.pr("act_upri")),
				when(null)
					.select(aggr,T.pr("qty"))
					.groupBy(aggr,T.pr("qty")),
				when(null)
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(null)
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(null)
					.select(aggr,T.pr("dec_place"))
					.groupBy(aggr,T.pr("dec_place")),
				when(null)
					.select(aggr,T.pr("per"))
					.groupBy(aggr,T.pr("per")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("act_cost"),value(0))),value(0)).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("act_cost"),value(0))),value(0)).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("act_cost"),value(0))),value(0)).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("act_cost"),value(0))),value(0)).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("act_cost"),value(0))),value(0)).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("act_cost"),value(0))),value(0)).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("act_cost"),value(0))),value(0)).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("act_cost"),value(0))),value(0)).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("act_cost"),value(0))),value(0)).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("act_cost"),value(0))),value(0)).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("act_cost"),value(0))),value(0)).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("act_cost"),value(0))),value(0)).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("act_cost"),value(0))),value(0)).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("act_cost"),value(0))),value(0)).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("act_cost"),value(0))),value(0)).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("act_cost"),value(0))),value(0)).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("act_cost"),value(0))),value(0)).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("act_cost"),value(0))),value(0)).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("act_cost"),value(0))),value(0)).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("act_cost"),value(0))),value(0)).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("act_cost"),value(0))),value(0)).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("act_cost"),value(0))),value(0)).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("act_cost"),value(0))),value(0)).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("act_cost"),value(0))),value(0)).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("act_cost"),value(0))),value(0)).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("act_cost"),value(0))),value(0)).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("act_cost"),value(0))),value(0)).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("act_cost"),value(0))),value(0)).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("act_cost"),value(0))),value(0)).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("act_cost"),value(0))),value(0)).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("act_cost"),value(0))),value(0)).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("act_cost"),value(0))),value(0)).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("act_cost"),value(0))),value(0)).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("act_cost"),value(0))),value(0)).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("act_cost"),value(0))),value(0)).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("act_cost"),value(0))),value(0)).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("act_cost"),value(0))),value(0)).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("act_cost"),value(0))),value(0)).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("act_cost"),value(0))),value(0)).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("act_cost"),value(0))),value(0)).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("act_cost"),value(0))),value(0)).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("act_cost"),value(0))),value(0)).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("act_cost"),value(0))),value(0)).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("act_cost"),value(0))),value(0)).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("act_cost"),value(0))),value(0)).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("act_cost"),value(0))),value(0)).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("act_cost"),value(0))),value(0)).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("act_cost"),value(0))),value(0)).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("act_cost"),value(0))),value(0)).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("act_cost"),value(0))),value(0)).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_099"))
			);
	}
}