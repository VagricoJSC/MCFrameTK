package mcframe.serverMGBB.MGBBL0230;

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
	 * -- MGBBL0230_MGT_ST_STK_Query_S01
	 */
	static MCQueryPlan MGBBL0230_MGT_ST_STK_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ST_STK_R S1_T = MGT_ST_STK_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_CALC_GRP_R S1_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
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
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
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
		MAM_CNTRY_R S1_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S1_AREA = MAM_AREA_R.create("AREA");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0230_MGT_ST_STK_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_grp_cd,
							S1_CALC_GRP.calc_grp_nm,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_T.ym,
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
							S1_ITM.unit_cd,
							S1_UNIT.unit_nm,
							S1_ITM.dec_place,
							S1_T.asst_typ,
							S1_T.bp_cd,
							S1_T.qty,
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
							.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))
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
							.leftOuterJoin(S1_CALC_GRP).on(S1_T.calc_grp_cd.eq(S1_CALC_GRP.calc_grp_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.std_flg.eq(value(true)))
							.cutoff$and(S1_T.calc_grp_cd.like(bind("calc_grp_cd")))
							.cutoff$and(S1_CALC_GRP.calc_grp_nm.like(bind("calc_grp_nm")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
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
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
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
							.addDynamicPredicate(DS1D)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
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
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub1)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub2)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm10")),
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
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_ITM.unit_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.unit_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.calc_grp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_grp_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_CALC_GRP.calc_grp_nm))
					.groupBy(DS0D, S0_T.pr(S1_CALC_GRP.calc_grp_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.qty)).as("qty")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_TERM.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3", "bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7", "bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1", "bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5", "bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9", "bp_grp_nm10", "cntry_flg", "area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_BP.cntry_cd.as("cntry_cd"))
					.groupBy(DS1D, S1_BP.cntry_cd),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_CNTRY.cntry_nm.as("cntry_nm"))
					.groupBy(DS1D, S1_CNTRY.cntry_nm),
				when(boundOr("cntry_flg", "cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CNTRY).on(S1_BP.cntry_cd.eq(S1_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_BP.area_cd.as("area_cd"))
					.groupBy(DS1D, S1_BP.area_cd),
				when(boundOr("area_flg"))
					.select(DS1D, S1_AREA.area_nm.as("area_nm"))
					.groupBy(DS1D, S1_AREA.area_nm),
				when(boundOr("area_flg", "area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AREA).on(S1_BP.area_cd.eq(S1_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AREA.area_nm.like(bind("area_nm"))))
			);
	}

	/**
	 * MGBBL0230_MGT_ST_STK_S02
	 */
	static MCQueryPlan MGBBL0230_MGT_ST_STK_S02() {
		MGT_ST_STK_R S0T = MGT_ST_STK_R.create("T");
		MGT_ST_STK_DIFF_R S0T2 = MGT_ST_STK_DIFF_R.create("T2");
		MAM_CALC_GRP_R S0CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0UNIT = MAM_UNIT_R.create("UNIT");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MCTempView T = createTempView("T");
		MAM_TERM_R TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_GRP_R ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_R BP = MAM_BP_R.create("BP");
		MAM_BP_GRP_R BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_CNTRY_R CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R AREA = MAM_AREA_R.create("AREA");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBBL0230_MGT_ST_STK_Query_S02")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T.calc_grp_cd,
							S0CALC_GRP.calc_grp_nm,
							S0T.wg_cd,
							S0WG.wg_nm,
							S0T.ym,
							S0T.mng_dpt_cd,
							S0T.itm_cd,
							S0T.itm_sub1,
							S0T.itm_sub2,
							S0T.itm_sub3,
							S0T.lot_no,
							S0T.sublot_no,
							S0T.sno1,
							S0T.sno2,
							S0T.sno3,
							S0T.sno4,
							S0ITM.unit_cd,
							S0UNIT.unit_nm,
							S0ITM.dec_place,
							S0T.asst_typ,
							S0T.bp_cd,
							S0EXPNS.expns_grp_cd,
							S0EXPNS.var_typ,
							S0T2.expns_cd,
							S0T2.diff_amt,
							S0T2.bf_amt,
							S0T2.af_amt,
							addDynamicSelect(core)
						)
						.from(
							S0T
							.innerJoin(S0T2).on(S0T.st_stk_key.eq(S0T2.st_stk_key))
							.leftOuterJoin(S0CALC_GRP).on(S0T.calc_grp_cd.eq(S0CALC_GRP.calc_grp_cd))
							.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0UNIT).on(S0ITM.unit_cd.eq(S0UNIT.unit_cd))
							.leftOuterJoin(S0SUNDRY_ITM).on(
								S0T.itm_cd.eq(S0SUNDRY_ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0SUNDRY_ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0SUNDRY_ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0SUNDRY_ITM.itm_sub3))
								.and(S0T.sno1.eq(S0SUNDRY_ITM.sno1))
								.and(S0T.sno2.eq(S0SUNDRY_ITM.sno2))
								.and(S0T.sno3.eq(S0SUNDRY_ITM.sno3))
								.and(S0T.sno4.eq(S0SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(S0EXPNS).on(S0EXPNS.expns_cd.eq(S0T2.expns_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.std_flg.eq(value(true)))
							.cutoff$and(S0T.calc_grp_cd.like(bind("calc_grp_cd")))
							.cutoff$and(S0CALC_GRP.calc_grp_nm.like(bind("calc_grp_nm")))
							.cutoff$and(S0T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0T.ym.gte(bind("ym_fr")))
							.cutoff$and(S0T.ym.lte(bind("ym_to")))
							.cutoff$and(S0T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S0ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S0T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S0SUNDRY_ITM.itm_nm,
									S0ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S0T.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T.sno1.like(bind("sno1")))
							.cutoff$and(S0T.sno2.like(bind("sno2")))
							.cutoff$and(S0T.sno3.like(bind("sno3")))
							.cutoff$and(S0T.sno4.like(bind("sno4")))
							.cutoff$and(S0T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S0T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S0ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
							.cutoff$and(S0ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
							.cutoff$and(S0ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
							.cutoff$and(S0ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
							.cutoff$and(S0ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
							.cutoff$and(S0ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
							.cutoff$and(S0ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
							.cutoff$and(S0ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
							.cutoff$and(S0ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
							.cutoff$and(S0ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
							.addDynamicPredicate(core)
						).view(T)
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
					.select(aggr,T.pr("calc_grp_cd"))
					.groupBy(aggr,T.pr("calc_grp_cd"))
					.orderBy(T.pr("calc_grp_cd").asc()),
				when(boundOr("wg_flg"))
					.select(aggr,T.pr("wg_cd"))
					.groupBy(aggr,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(null)
					.select(aggr,T.pr("ym"))
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(boundOr("mng_dpt_flg"))
					.select(aggr,T.pr("mng_dpt_cd"))
					.groupBy(aggr,T.pr("mng_dpt_cd"))
					.orderBy(T.pr("mng_dpt_cd").asc()),
				when(boundOr("itm_typ_flg"))
					.select(core,S0ITM.itm_typ.as("itm_typ"))
					.select(aggr,T.pr("itm_typ"))
					.groupBy(core,S0ITM.itm_typ)
					.groupBy(aggr,T.pr("itm_typ"))
					.orderBy(T.pr("itm_typ").asc()),
				when(boundOr("itm_typ_d_flg"))
					.select(core,S0ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.select(aggr,T.pr("itm_typ_d_cd"))
					.groupBy(core,S0ITM.itm_typ_d_cd)
					.groupBy(aggr,T.pr("itm_typ_d_cd"))
					.orderBy(T.pr("itm_typ_d_cd").asc()),
				when(boundOr("itm_jnl_flg"))
					.select(core,S0ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.select(aggr,T.pr("itm_jnl_cd"))
					.groupBy(core,S0ITM.itm_jnl_cd)
					.groupBy(aggr,T.pr("itm_jnl_cd"))
					.orderBy(T.pr("itm_jnl_cd").asc()),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_cd"))
					.groupBy(aggr,T.pr("itm_cd"))
					.orderBy(T.pr("itm_cd").asc()),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub1"))
					.groupBy(aggr,T.pr("itm_sub1"))
					.orderBy(T.pr("itm_sub1").asc()),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub2"))
					.groupBy(aggr,T.pr("itm_sub2"))
					.orderBy(T.pr("itm_sub2").asc()),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("itm_sub3"))
					.groupBy(aggr,T.pr("itm_sub3"))
					.orderBy(T.pr("itm_sub3").asc()),
				when(boundOr("lot_flg"))
					.select(aggr,T.pr("lot_no"))
					.groupBy(aggr,T.pr("lot_no"))
					.orderBy(T.pr("lot_no").asc()),
				when(boundOr("sublot_flg"))
					.select(aggr,T.pr("sublot_no"))
					.groupBy(aggr,T.pr("sublot_no"))
					.orderBy(T.pr("sublot_no").asc()),
				when(boundOr("sno1_flg"))
					.select(aggr,T.pr("sno1"))
					.groupBy(aggr,T.pr("sno1"))
					.orderBy(T.pr("sno1").asc()),
				when(boundOr("sno2_flg"))
					.select(aggr,T.pr("sno2"))
					.groupBy(aggr,T.pr("sno2"))
					.orderBy(T.pr("sno2").asc()),
				when(boundOr("sno3_flg"))
					.select(aggr,T.pr("sno3"))
					.groupBy(aggr,T.pr("sno3"))
					.orderBy(T.pr("sno3").asc()),
				when(boundOr("sno4_flg"))
					.select(aggr,T.pr("sno4"))
					.groupBy(aggr,T.pr("sno4"))
					.orderBy(T.pr("sno4").asc()),
				when(boundOr("bp_flg"))
					.select(aggr,T.pr("bp_cd"))
					.groupBy(aggr,T.pr("bp_cd"))
					.orderBy(T.pr("bp_cd").asc()),
				when(boundOr("asst_typ_flg"))
					.select(aggr,T.pr("asst_typ"))
					.groupBy(aggr,T.pr("asst_typ"))
					.orderBy(T.pr("asst_typ").asc()),
				when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.innerJoin(TERM).on(S0T.ym.gte(TERM.term).and(S0T.ym.lt(TERM.term_end_ym)))),
				when(null)
					.select(aggr,T.pr("calc_grp_nm"))
					.groupBy(aggr,T.pr("calc_grp_nm")),
				when(boundOr("wg_flg"))
					.select(aggr,T.pr("wg_nm"))
					.groupBy(aggr,T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(core,MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.select(aggr,T.pr("mng_dpt_nm"))
					.groupBy(core,MNG_DPT.dpt_nm)
					.groupBy(aggr,T.pr("mng_dpt_nm")),
				when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(MNG_DPT).on(S0T.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(TERM.term.eq(MNG_DPT.term))))
					.predicate(core, p -> p.cutoff$and(MNG_DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				when(boundOr("itm_typ_d_flg"))
					.select(core,ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.select(aggr,T.pr("itm_typ_d_nm"))
					.groupBy(core,ITM_TYP_D.itm_typ_d_nm)
					.groupBy(aggr,T.pr("itm_typ_d_nm")),
				when(boundOr("itm_typ_d_flg","itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(S0ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(S0ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
				when(boundOr("itm_flg"))
					.select(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm).as("itm_nm"))
					.select(aggr,T.pr("itm_nm"))
					.groupBy(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm))
					.groupBy(aggr,T.pr("itm_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(core,ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.select(aggr,T.pr("itm_jnl_nm"))
					.groupBy(core,ITM_JNL.itm_jnl_nm)
					.groupBy(aggr,T.pr("itm_jnl_nm")),
				when(boundOr("itm_jnl_flg","itm_jnl_nm"))
					.view(core, v -> v.leftOuterJoin(ITM_JNL).on(S0ITM.itm_jnl_cd.eq(ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(ITM_JNL.itm_jnl_nm.like(bind("ITM_JNL_NM")))),
				when(boundOr("itm_grp_flg1"))
					.select(core,S0ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.select(aggr,T.pr("itm_grp_cd1"))
					.groupBy(core,S0ITM.itm_grp_cd1)
					.groupBy(aggr,T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg1"))
					.select(core,ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.select(aggr,T.pr("itm_grp_nm1"))
					.groupBy(core,ITM_GRP1.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg1","itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP1).on(S0ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				when(boundOr("itm_grp_flg2"))
					.select(core,S0ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.select(aggr,T.pr("itm_grp_cd2"))
					.groupBy(core,S0ITM.itm_grp_cd2)
					.groupBy(aggr,T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg2"))
					.select(core,ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.select(aggr,T.pr("itm_grp_nm2"))
					.groupBy(core,ITM_GRP2.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg2","itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP2).on(S0ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				when(boundOr("itm_grp_flg3"))
					.select(core,S0ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.select(aggr,T.pr("itm_grp_cd3"))
					.groupBy(core,S0ITM.itm_grp_cd3)
					.groupBy(aggr,T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg3"))
					.select(core,ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.select(aggr,T.pr("itm_grp_nm3"))
					.groupBy(core,ITM_GRP3.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg3","itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP3).on(S0ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				when(boundOr("itm_grp_flg4"))
					.select(core,S0ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.select(aggr,T.pr("itm_grp_cd4"))
					.groupBy(core,S0ITM.itm_grp_cd4)
					.groupBy(aggr,T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg4"))
					.select(core,ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.select(aggr,T.pr("itm_grp_nm4"))
					.groupBy(core,ITM_GRP4.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg4","itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP4).on(S0ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				when(boundOr("itm_grp_flg5"))
					.select(core,S0ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.select(aggr,T.pr("itm_grp_cd5"))
					.groupBy(core,S0ITM.itm_grp_cd5)
					.groupBy(aggr,T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg5"))
					.select(core,ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.select(aggr,T.pr("itm_grp_nm5"))
					.groupBy(core,ITM_GRP5.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg5","itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP5).on(S0ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				when(boundOr("itm_grp_flg6"))
					.select(core,S0ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.select(aggr,T.pr("itm_grp_cd6"))
					.groupBy(core,S0ITM.itm_grp_cd6)
					.groupBy(aggr,T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg6"))
					.select(core,ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.select(aggr,T.pr("itm_grp_nm6"))
					.groupBy(core,ITM_GRP6.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg6","itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP6).on(S0ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				when(boundOr("itm_grp_flg7"))
					.select(core,S0ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.select(aggr,T.pr("itm_grp_cd7"))
					.groupBy(core,S0ITM.itm_grp_cd7)
					.groupBy(aggr,T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg7"))
					.select(core,ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.select(aggr,T.pr("itm_grp_nm7"))
					.groupBy(core,ITM_GRP7.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg7","itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP7).on(S0ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				when(boundOr("itm_grp_flg8"))
					.select(core,S0ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.select(aggr,T.pr("itm_grp_cd8"))
					.groupBy(core,S0ITM.itm_grp_cd8)
					.groupBy(aggr,T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg8"))
					.select(core,ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.select(aggr,T.pr("itm_grp_nm8"))
					.groupBy(core,ITM_GRP8.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg8","itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP8).on(S0ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				when(boundOr("itm_grp_flg9"))
					.select(core,S0ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.select(aggr,T.pr("itm_grp_cd9"))
					.groupBy(core,S0ITM.itm_grp_cd9)
					.groupBy(aggr,T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg9"))
					.select(core,ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.select(aggr,T.pr("itm_grp_nm9"))
					.groupBy(core,ITM_GRP9.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg9","itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP9).on(S0ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				when(boundOr("itm_grp_flg10"))
					.select(core,S0ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.select(aggr,T.pr("itm_grp_cd10"))
					.groupBy(core,S0ITM.itm_grp_cd10)
					.groupBy(aggr,T.pr("itm_grp_cd10")),
				when(boundOr("itm_grp_flg10"))
					.select(core,ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.select(aggr,T.pr("itm_grp_nm10"))
					.groupBy(core,ITM_GRP10.itm_grp_nm)
					.groupBy(aggr,T.pr("itm_grp_nm10")),
				when(boundOr("itm_grp_flg10","itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP10).on(S0ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),
				when(boundOr("bp_flg"))
					.select(core,BP.bp_nm.as("bp_nm"))
					.select(aggr,T.pr("bp_nm"))
					.groupBy(core,BP.bp_nm)
					.groupBy(aggr,T.pr("bp_nm")),
				when(boundOr("bp_flg","bp_nm","cntry_cd","cntry_nm","area_cd","area_nm","bp_grp_cd1","bp_grp_cd2","bp_grp_cd3","bp_grp_cd4","bp_grp_cd5","bp_grp_cd6","bp_grp_cd7","bp_grp_cd8","bp_grp_cd9","bp_grp_cd10","bp_grp_nm1","bp_grp_nm2","bp_grp_nm3","bp_grp_nm4","bp_grp_nm5","bp_grp_nm6","bp_grp_nm7","bp_grp_nm8","bp_grp_nm9","bp_grp_nm10","cntry_flg","area_flg","bp_grp_flg1","bp_grp_flg2","bp_grp_flg3","bp_grp_flg4","bp_grp_flg5","bp_grp_flg6","bp_grp_flg7","bp_grp_flg8","bp_grp_flg9","bp_grp_flg10"))
					.view(core, v -> v.leftOuterJoin(BP).on(S0T.bp_cd.eq(BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM"))).cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1"))).cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2"))).cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3"))).cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4"))).cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5"))).cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6"))).cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7"))).cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8"))).cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9"))).cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10"))).cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD"))).cutoff$and(BP.area_cd.like(bind("AREA_CD")))),
				when(boundOr("bp_grp_flg1"))
					.select(core,BP.bp_grp_cd1.as("bp_grp_cd1"))
					.select(aggr,T.pr("bp_grp_cd1"))
					.groupBy(core,BP.bp_grp_cd1)
					.groupBy(aggr,T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg1"))
					.select(core,BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.select(aggr,T.pr("bp_grp_nm1"))
					.groupBy(core,BP_GRP1.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg1","bp_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(BP_GRP1).on(BP.bp_grp_cd1.eq(BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(BP_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP1.bp_grp_nm.like(bind("BP_GRP_NM1")))),
				when(boundOr("bp_grp_flg2"))
					.select(core,BP.bp_grp_cd2.as("bp_grp_cd2"))
					.select(aggr,T.pr("bp_grp_cd2"))
					.groupBy(core,BP.bp_grp_cd2)
					.groupBy(aggr,T.pr("bp_grp_cd2")),
				when(boundOr("bp_grp_flg2"))
					.select(core,BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.select(aggr,T.pr("bp_grp_nm2"))
					.groupBy(core,BP_GRP2.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg2","bp_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(BP_GRP2).on(BP.bp_grp_cd2.eq(BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(BP_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP2.bp_grp_nm.like(bind("BP_GRP_NM2")))),
				when(boundOr("bp_grp_flg3"))
					.select(core,BP.bp_grp_cd3.as("bp_grp_cd3"))
					.select(aggr,T.pr("bp_grp_cd3"))
					.groupBy(core,BP.bp_grp_cd3)
					.groupBy(aggr,T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(core,BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.select(aggr,T.pr("bp_grp_nm3"))
					.groupBy(core,BP_GRP3.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg3","bp_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(BP_GRP3).on(BP.bp_grp_cd3.eq(BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(BP_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP3.bp_grp_nm.like(bind("BP_GRP_NM3")))),
				when(boundOr("bp_grp_flg4"))
					.select(core,BP.bp_grp_cd4.as("bp_grp_cd4"))
					.select(aggr,T.pr("bp_grp_cd4"))
					.groupBy(core,BP.bp_grp_cd4)
					.groupBy(aggr,T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(core,BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.select(aggr,T.pr("bp_grp_nm4"))
					.groupBy(core,BP_GRP4.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg4","bp_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(BP_GRP4).on(BP.bp_grp_cd4.eq(BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(BP_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP4.bp_grp_nm.like(bind("BP_GRP_NM4")))),
				when(boundOr("bp_grp_flg5"))
					.select(core,BP.bp_grp_cd5.as("bp_grp_cd5"))
					.select(aggr,T.pr("bp_grp_cd5"))
					.groupBy(core,BP.bp_grp_cd5)
					.groupBy(aggr,T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(core,BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.select(aggr,T.pr("bp_grp_nm5"))
					.groupBy(core,BP_GRP5.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg5","bp_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(BP_GRP5).on(BP.bp_grp_cd5.eq(BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(BP_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP5.bp_grp_nm.like(bind("BP_GRP_NM5")))),
				when(boundOr("bp_grp_flg6"))
					.select(core,BP.bp_grp_cd6.as("bp_grp_cd6"))
					.select(aggr,T.pr("bp_grp_cd6"))
					.groupBy(core,BP.bp_grp_cd6)
					.groupBy(aggr,T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(core,BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.select(aggr,T.pr("bp_grp_nm6"))
					.groupBy(core,BP_GRP6.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg6","bp_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(BP_GRP6).on(BP.bp_grp_cd6.eq(BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(BP_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP6.bp_grp_nm.like(bind("BP_GRP_NM6")))),
				when(boundOr("bp_grp_flg7"))
					.select(core,BP.bp_grp_cd7.as("bp_grp_cd7"))
					.select(aggr,T.pr("bp_grp_cd7"))
					.groupBy(core,BP.bp_grp_cd7)
					.groupBy(aggr,T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(core,BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.select(aggr,T.pr("bp_grp_nm7"))
					.groupBy(core,BP_GRP7.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg7","bp_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(BP_GRP7).on(BP.bp_grp_cd7.eq(BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(BP_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP7.bp_grp_nm.like(bind("BP_GRP_NM7")))),
				when(boundOr("bp_grp_flg8"))
					.select(core,BP.bp_grp_cd8.as("bp_grp_cd8"))
					.select(aggr,T.pr("bp_grp_cd8"))
					.groupBy(core,BP.bp_grp_cd8)
					.groupBy(aggr,T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(core,BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.select(aggr,T.pr("bp_grp_nm8"))
					.groupBy(core,BP_GRP8.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg8","bp_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(BP_GRP8).on(BP.bp_grp_cd8.eq(BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(BP_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP8.bp_grp_nm.like(bind("BP_GRP_NM8")))),
				when(boundOr("bp_grp_flg9"))
					.select(core,BP.bp_grp_cd9.as("bp_grp_cd9"))
					.select(aggr,T.pr("bp_grp_cd9"))
					.groupBy(core,BP.bp_grp_cd9)
					.groupBy(aggr,T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(core,BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.select(aggr,T.pr("bp_grp_nm9"))
					.groupBy(core,BP_GRP9.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg9","bp_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(BP_GRP9).on(BP.bp_grp_cd9.eq(BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(BP_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP9.bp_grp_nm.like(bind("BP_GRP_NM9")))),
				when(boundOr("bp_grp_flg10"))
					.select(core,BP.bp_grp_cd10.as("bp_grp_cd10"))
					.select(aggr,T.pr("bp_grp_cd10"))
					.groupBy(core,BP.bp_grp_cd10)
					.groupBy(aggr,T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(core,BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.select(aggr,T.pr("bp_grp_nm10"))
					.groupBy(core,BP_GRP10.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm10")),
				when(boundOr("bp_grp_flg10","bp_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(BP_GRP10).on(BP.bp_grp_cd10.eq(BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP10.bp_grp_nm.like(bind("BP_GRP_NM10")))),
				when(boundOr("cntry_flg"))
					.select(core,BP.cntry_cd.as("cntry_cd"))
					.select(aggr,T.pr("cntry_cd"))
					.groupBy(core,BP.cntry_cd)
					.groupBy(aggr,T.pr("cntry_cd")),
				when(boundOr("cntry_flg"))
					.select(core,CNTRY.cntry_nm.as("cntry_nm"))
					.select(aggr,T.pr("cntry_nm"))
					.groupBy(core,CNTRY.cntry_nm)
					.groupBy(aggr,T.pr("cntry_nm")),
				when(boundOr("cntry_flg","cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CNTRY).on(BP.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				when(boundOr("area_flg"))
					.select(core,BP.area_cd.as("area_cd"))
					.select(aggr,T.pr("area_cd"))
					.groupBy(core,BP.area_cd)
					.groupBy(aggr,T.pr("area_cd")),
				when(boundOr("area_flg"))
					.select(core,AREA.area_nm.as("area_nm"))
					.select(aggr,T.pr("area_nm"))
					.groupBy(core,AREA.area_nm)
					.groupBy(aggr,T.pr("area_nm")),
				when(boundOr("area_flg","area_nm"))
					.view(core, v -> v.leftOuterJoin(AREA).on(BP.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM")))),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(boundOr("itm_flg"))
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(boundOr("itm_flg"))
					.select(aggr,max(T.pr("dec_place")).as("dec_place")),
				when(null)
					.select(aggr,sum(T.pr("diff_amt")).as("diff_amt")),
				when(null)
					.select(aggr,sum(T.pr("bf_amt")).as("bf_amt")),
				when(null)
					.select(aggr,sum(T.pr("af_amt")).as("af_amt")),
				when(null)
					.select(aggr,nvl(sum(T.pr("diff_amt")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("diff_amt"),value(0))),value(0)).as("var")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("diff_amt"),value(0))),value(0)).as("fxd")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("diff_amt"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("diff_amt"),value(0))),value(0)).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("diff_amt"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("diff_amt"),value(0))),value(0)).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("diff_amt"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("diff_amt"),value(0))),value(0)).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("diff_amt"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("diff_amt"),value(0))),value(0)).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("diff_amt"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("diff_amt"),value(0))),value(0)).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("diff_amt"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("diff_amt"),value(0))),value(0)).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("diff_amt"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("diff_amt"),value(0))),value(0)).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("diff_amt"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("diff_amt"),value(0))),value(0)).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("diff_amt"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("diff_amt"),value(0))),value(0)).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("diff_amt"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("diff_amt"),value(0))),value(0)).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("diff_amt"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("diff_amt"),value(0))),value(0)).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("diff_amt"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("diff_amt"),value(0))),value(0)).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("diff_amt"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("diff_amt"),value(0))),value(0)).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("diff_amt"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("diff_amt"),value(0))),value(0)).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("diff_amt"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("diff_amt"),value(0))),value(0)).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("diff_amt"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("diff_amt"),value(0))),value(0)).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("diff_amt"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("diff_amt"),value(0))),value(0)).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("diff_amt"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("diff_amt"),value(0))),value(0)).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("diff_amt"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("diff_amt"),value(0))),value(0)).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("diff_amt"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("diff_amt"),value(0))),value(0)).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("diff_amt"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("diff_amt"),value(0))),value(0)).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("diff_amt"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("diff_amt"),value(0))),value(0)).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("diff_amt"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("diff_amt"),value(0))),value(0)).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("diff_amt"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("diff_amt"),value(0))),value(0)).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("diff_amt"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("diff_amt"),value(0))),value(0)).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("diff_amt"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("diff_amt"),value(0))),value(0)).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("diff_amt"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("diff_amt"),value(0))),value(0)).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("diff_amt"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("diff_amt"),value(0))),value(0)).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("diff_amt"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("diff_amt"),value(0))),value(0)).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("diff_amt"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("diff_amt"),value(0))),value(0)).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("diff_amt"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("diff_amt"),value(0))),value(0)).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("diff_amt"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("diff_amt"),value(0))),value(0)).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("diff_amt"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("diff_amt"),value(0))),value(0)).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("diff_amt"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("diff_amt"),value(0))),value(0)).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("diff_amt"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("diff_amt"),value(0))),value(0)).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("diff_amt"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("diff_amt"),value(0))),value(0)).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("diff_amt"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("diff_amt"),value(0))),value(0)).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("diff_amt"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("diff_amt"),value(0))),value(0)).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("diff_amt"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("diff_amt"),value(0))),value(0)).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("diff_amt"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("diff_amt"),value(0))),value(0)).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("diff_amt"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("diff_amt"),value(0))),value(0)).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("diff_amt"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("diff_amt"),value(0))),value(0)).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("diff_amt"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("diff_amt"),value(0))),value(0)).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("diff_amt"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("diff_amt"),value(0))),value(0)).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("diff_amt"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("diff_amt"),value(0))),value(0)).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("diff_amt"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("diff_amt"),value(0))),value(0)).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("diff_amt"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("diff_amt"),value(0))),value(0)).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("diff_amt"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("diff_amt"),value(0))),value(0)).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("diff_amt"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("diff_amt"),value(0))),value(0)).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("diff_amt"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("diff_amt"),value(0))),value(0)).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("diff_amt"),value(0))),value(0)),value(0)).as("col_099"))
			);
	}
}