package mcframe.serverMGBF.MGBFL0170;

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
	 * -- MGBFL0170_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0170_MGT_ACC_TOP_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
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
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_GRP_WG_R S2_GW = MAM_GRP_WG_R.create("GW");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0170_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_WG.wg_nm,
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
							S1_T.bp_cd,
							S1_T.asst_typ,
							nvl(
								nullValue(),
								value(0)
							).as("act_qty"),
							S1_T.qty.as("calc_qty"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
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
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_no.eq(bind("calc_no")))
							.and(S1_T.ym.eq(bind("ym")))
							.and(
								S1_T.wg_cd.eq(bind("runtime_wg_cd"))
								.or(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_GW)
										.where(
											value(0).eq(value(0))
											.and(S2_GW.calc_grp_cd.eq(S1_T.calc_grp_cd))
											.and(S2_GW.wg_cd.eq(S1_T.wg_cd))
											.and(S2_GW.del_flg.eq(value(false)))
										)
									)
								)
							)
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
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
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
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
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								bind("asst_cnd").eq(value(true))
								.and(
									S1_T.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.addDynamicPredicate(DS1D)
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
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
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
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("cntry_flg"))
					.select(DS0D, S0_T.pr("cntry_cd"))
					.groupBy(DS0D, S0_T.pr("cntry_cd")),
				when(boundOr("cntry_flg"))
					.select(DS0D, S0_T.pr("cntry_nm"))
					.groupBy(DS0D, S0_T.pr("cntry_nm")),
				when(boundOr("area_flg"))
					.select(DS0D, S0_T.pr("area_cd"))
					.groupBy(DS0D, S0_T.pr("area_cd")),
				when(boundOr("area_flg"))
					.select(DS0D, S0_T.pr("area_nm"))
					.groupBy(DS0D, S0_T.pr("area_nm")),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm10")),
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
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(null)
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(null)
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_qty")).as("act_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("calc_qty")).as("calc_qty")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_TERM.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("bp_flg", "bp_nm", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3", "bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7", "bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1", "bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5", "bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9", "bp_grp_nm10", "cntry_flg", "area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("cntry_flg", "cntry_cd"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.cntry_cd.like(bind("cntry_cd")))),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_CNTRY.cntry_nm.as("cntry_nm"))
					.groupBy(DS1D, S1_CNTRY.cntry_nm),
				when(boundOr("cntry_flg", "cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CNTRY).on(S1_BP.cntry_cd.eq(S1_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_BP.area_cd.as("area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("area_flg", "area_cd"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_AREA.area_nm.as("area_nm"))
					.groupBy(DS1D, S1_AREA.area_nm),
				when(boundOr("area_flg", "area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AREA).on(S1_BP.area_cd.eq(S1_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg1", "bp_grp_cd1"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("bp_grp_flg2", "bp_grp_cd2"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3", "bp_grp_cd3"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4", "bp_grp_cd4"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5", "bp_grp_cd5"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6", "bp_grp_cd6"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7", "bp_grp_cd7"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8", "bp_grp_cd8"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9", "bp_grp_cd9"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10", "bp_grp_cd10"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
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
				when(null)
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(null)
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(null)
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd).asc()),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
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
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc())
			);
	}
	
	/**
	 * -- MGBFL0170_MGT_ACT_STK_Query_S01
	 */
	static MCQueryPlan MGBFL0170_MGT_ACT_STK_S01() {
		MCTempView S0_T = createTempView("T");
		MCTempView S1_T = createTempView("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MGW_CALC_CTG_R S1_W1 = MGW_CALC_CTG_R.create("W1");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
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
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MGT_ACT_STK_R S2_W = MGT_ACT_STK_R.create("W");
		MAM_GRP_WG_R S3_GW = MAM_GRP_WG_R.create("GW");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0170_MGT_ACT_STK_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.pr("wg_cd"),
							S1_WG.wg_nm,
							S1_T.pr(S2_W.mng_dpt_cd),
							S1_T.pr(S2_W.itm_cd),
							S1_T.pr(S2_W.itm_sub1),
							S1_T.pr(S2_W.itm_sub2),
							S1_T.pr(S2_W.itm_sub3),
							S1_T.pr(S2_W.lot_no),
							S1_T.pr(S2_W.sublot_no),
							S1_T.pr(S2_W.sno1),
							S1_T.pr(S2_W.sno2),
							S1_T.pr(S2_W.sno3),
							S1_T.pr(S2_W.sno4),
							S1_T.pr(S2_W.bp_cd),
							S1_T.pr(S2_W.asst_typ),
							S1_T.pr(S2_W.qty).as("act_qty"),
							nvl(
								nullValue(),
								value(0)
							).as("calc_qty"),
							addDynamicSelect(DS1D)
						)
						.from(
							subQuery()
							.select(
								S2_W.ym,
								S2_W.calc_ctg_cd,
								nvl(
									bind("runtime_wg_cd"),
									S2_W.wg_cd
								).as("wg_cd"),
								S2_W.mng_dpt_cd,
								S2_W.itm_cd,
								S2_W.itm_sub1,
								S2_W.itm_sub2,
								S2_W.itm_sub3,
								S2_W.lot_no,
								S2_W.sublot_no,
								S2_W.sno1,
								S2_W.sno2,
								S2_W.sno3,
								S2_W.sno4,
								S2_W.bp_cd,
								S2_W.asst_typ,
								S2_W.qty
							)
							.from(S2_W)
							.where(
								value(0).eq(value(0))
								.and(S2_W.ym.eq(bind("ym")))
								.and(
									S2_W.wg_cd.eq(bind("runtime_wg_cd"))
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S3_GW)
											.where(
												value(0).eq(value(0))
												.and(S3_GW.calc_grp_cd.eq(bind("calc_grp_cd")))
												.and(S3_GW.wg_cd.eq(S2_W.wg_cd))
												.and(S3_GW.del_flg.eq(value(false)))
											)
										)
									)
								)
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_T.pr("wg_cd").eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_T.pr(S2_W.itm_cd).eq(S1_ITM.itm_cd)
								.and(S1_T.pr(S2_W.itm_sub1).eq(S1_ITM.itm_sub1))
								.and(S1_T.pr(S2_W.itm_sub2).eq(S1_ITM.itm_sub2))
								.and(S1_T.pr(S2_W.itm_sub3).eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T.pr(S2_W.itm_cd).eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T.pr(S2_W.itm_sub1).eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T.pr(S2_W.itm_sub2).eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T.pr(S2_W.itm_sub3).eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T.pr(S2_W.sno1).eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T.pr(S2_W.sno2).eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T.pr(S2_W.sno3).eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T.pr(S2_W.sno4).eq(S1_SUNDRY_ITM.sno4))
							)
							.innerJoin(S1_W1).on(S1_T.pr(S2_W.calc_ctg_cd).eq(S1_W1.calc_ctg_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.pr("wg_cd").like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.pr(S2_W.mng_dpt_cd).like(bind("mng_dpt_cd")))
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_T.pr(S2_W.itm_cd).like(bind("itm_cd")))
							.cutoff$and(S1_T.pr(S2_W.itm_sub1).like(bind("itm_sub1")))
							.cutoff$and(S1_T.pr(S2_W.itm_sub2).like(bind("itm_sub2")))
							.cutoff$and(S1_T.pr(S2_W.itm_sub3).like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T.pr(S2_W.lot_no).like(bind("lot_no")))
							.cutoff$and(S1_T.pr(S2_W.sublot_no).like(bind("sublot_no")))
							.cutoff$and(S1_T.pr(S2_W.sno1).like(bind("sno1")))
							.cutoff$and(S1_T.pr(S2_W.sno2).like(bind("sno2")))
							.cutoff$and(S1_T.pr(S2_W.sno3).like(bind("sno3")))
							.cutoff$and(S1_T.pr(S2_W.sno4).like(bind("sno4")))
							.cutoff$and(S1_T.pr(S2_W.bp_cd).like(bind("bp_cd")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.pr(S2_W.bp_cd).isNull())
							)
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
							.cutoff$and(S1_T.pr(S2_W.asst_typ).like(bind("asst_typ")))
							.cutoff$and(
								bind("asst_cnd").eq(value(true))
								.and(
									S1_T.pr(S2_W.asst_typ).in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.addDynamicPredicate(DS1D)
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
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S2_W.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S2_W.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_cd"))
					.groupBy(DS0D, S0_T.pr("wg_cd")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S2_W.lot_no))
					.groupBy(DS0D, S0_T.pr(S2_W.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S2_W.sublot_no))
					.groupBy(DS0D, S0_T.pr(S2_W.sublot_no)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S2_W.sno1))
					.groupBy(DS0D, S0_T.pr(S2_W.sno1)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S2_W.sno2))
					.groupBy(DS0D, S0_T.pr(S2_W.sno2)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S2_W.sno3))
					.groupBy(DS0D, S0_T.pr(S2_W.sno3)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S2_W.sno4))
					.groupBy(DS0D, S0_T.pr(S2_W.sno4)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S2_W.bp_cd))
					.groupBy(DS0D, S0_T.pr(S2_W.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("cntry_flg"))
					.select(DS0D, S0_T.pr("cntry_cd"))
					.groupBy(DS0D, S0_T.pr("cntry_cd")),
				when(boundOr("cntry_flg"))
					.select(DS0D, S0_T.pr("cntry_nm"))
					.groupBy(DS0D, S0_T.pr("cntry_nm")),
				when(boundOr("area_flg"))
					.select(DS0D, S0_T.pr("area_cd"))
					.groupBy(DS0D, S0_T.pr("area_cd")),
				when(boundOr("area_flg"))
					.select(DS0D, S0_T.pr("area_nm"))
					.groupBy(DS0D, S0_T.pr("area_nm")),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S2_W.asst_typ))
					.groupBy(DS0D, S0_T.pr(S2_W.asst_typ)),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm10")),
				when(null)
					.select(DS0D, S0_T.pr(S2_W.itm_cd))
					.groupBy(DS0D, S0_T.pr(S2_W.itm_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S2_W.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S2_W.itm_sub1)),
				when(null)
					.select(DS0D, S0_T.pr(S2_W.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S2_W.itm_sub2)),
				when(null)
					.select(DS0D, S0_T.pr(S2_W.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S2_W.itm_sub3)),
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
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(null)
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(null)
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_qty")).as("act_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("calc_qty")).as("calc_qty")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.pr(S2_W.ym).gte(S1_TERM.term).and(S1_T.pr(S2_W.ym).lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.pr(S2_W.mng_dpt_cd).eq(S1_MNG_DPT.dpt_cd).and(S1_TERM.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("bp_flg", "bp_nm", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3", "bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7", "bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1", "bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5", "bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9", "bp_grp_nm10", "cntry_flg", "area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.pr(S2_W.bp_cd).eq(S1_BP.bp_cd))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("cntry_flg", "cntry_cd"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.cntry_cd.like(bind("cntry_cd")))),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_CNTRY.cntry_nm.as("cntry_nm"))
					.groupBy(DS1D, S1_CNTRY.cntry_nm),
				when(boundOr("cntry_flg", "cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CNTRY).on(S1_BP.cntry_cd.eq(S1_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_BP.area_cd.as("area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("area_flg", "area_cd"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_AREA.area_nm.as("area_nm"))
					.groupBy(DS1D, S1_AREA.area_nm),
				when(boundOr("area_flg", "area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AREA).on(S1_BP.area_cd.eq(S1_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg1", "bp_grp_cd1"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("bp_grp_flg2", "bp_grp_cd2"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3", "bp_grp_cd3"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4", "bp_grp_cd4"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5", "bp_grp_cd5"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6", "bp_grp_cd6"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7", "bp_grp_cd7"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8", "bp_grp_cd8"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9", "bp_grp_cd9"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10", "bp_grp_cd10"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
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
				when(null)
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(null)
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(null)
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S2_W.mng_dpt_cd).asc()),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr("wg_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S2_W.itm_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S2_W.itm_sub1).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S2_W.itm_sub2).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S2_W.itm_sub3).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc())
			);
	}
}