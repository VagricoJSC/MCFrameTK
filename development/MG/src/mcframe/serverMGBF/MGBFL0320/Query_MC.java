package mcframe.serverMGBF.MGBFL0320;

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
	 * -- MGBFL0320_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0320_MGT_ACC_TOP_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_CALC_GRP_R S0_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_TYP_D = MAM_ITM_TYP_D_R.create("TYP_D");
		MAM_ITM_JNL_R S0_JNL = MAM_ITM_JNL_R.create("JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S0_AREA = MAM_AREA_R.create("AREA");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S0_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S0_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S0_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S0_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S0_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S0_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S0_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S0_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S0_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S0_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MGT_ACC_SML_COST_R S1_T2 = MGT_ACC_SML_COST_R.create("T2");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0320_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T1.calc_grp_cd),
						S0_T1.pr(S1_T1.calc_no),
						S0_T1.pr(S1_T1.ym),
						S0_T1.pr(S1_T1.wg_cd),
						S0_T1.pr(S1_WG.wg_nm),
						S0_T1.pr(S1_T1.mng_dpt_cd),
						S0_T1.pr(S1_T1.itm_cd),
						S0_T1.pr("itm_sub1_data"),
						S0_T1.pr("itm_sub2_data"),
						S0_T1.pr("itm_sub3_data"),
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_alt_nm1,
						S0_ITM.itm_alt_nm2,
						S0_ITM.itm_alt_nm3,
						S0_ITM.itm_alt_nm4,
						S0_ITM.itm_jnl_cd,
						S0_T1.pr("lot_no_data"),
						S0_T1.pr("sublot_no_data"),
						S0_T1.pr("sno1_data"),
						S0_T1.pr("sno2_data"),
						S0_T1.pr("sno3_data"),
						S0_T1.pr("sno4_data"),
						S0_T1.pr(S1_T1.asst_typ),
						S0_T1.pr(S1_T1.qty),
						S0_ITM.unit_cd,
						S0_T1.pr("amt"),
						S0_T1.pr("std_amt"),
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_"),
						// this field is appended by sql coverter.
						S0_T1.pr(S1_T1.bp_cd).as("join_bp_cd_")
					)
					.from(
						subQuery()
						.select(
							S1_T1.calc_grp_cd,
							S1_T1.calc_no,
							S1_T1.ym,
							S1_T1.wg_cd,
							S1_WG.wg_nm,
							S1_T1.mng_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1.as("itm_sub1_data"),
							S1_T1.itm_sub2.as("itm_sub2_data"),
							S1_T1.itm_sub3.as("itm_sub3_data"),
							S1_T1.lot_no.as("lot_no_data"),
							S1_T1.sublot_no.as("sublot_no_data"),
							S1_T1.sno1.as("sno1_data"),
							S1_T1.sno2.as("sno2_data"),
							S1_T1.sno3.as("sno3_data"),
							S1_T1.sno4.as("sno4_data"),
							S1_T1.bp_cd,
							S1_T1.asst_typ,
							S1_T1.qty,
							nvl(
								sum(S1_T2.act_cost),
								value(0)
							).as("amt"),
							nvl(
								sum(S1_T2.std_cost),
								value(0)
							).as("std_amt")
						)
						.from(
							S1_T1
							.innerJoin(S1_WG).on(S1_T1.wg_cd.eq(S1_WG.wg_cd))
							.innerJoin(S1_T2).on(
								S1_T1.calc_grp_cd.eq(S1_T2.calc_grp_cd)
								.and(S1_T1.calc_no.eq(S1_T2.calc_no))
								.and(S1_T1.top_rec_no.eq(S1_T2.top_rec_no))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T1.calc_no.eq(bind("calc_no")))
							.and(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.AVE.value())))
							.and(
								S1_T2.expns_typ.in(
									value(MAC_EXPNS_TYP.PROD.value()),
									value(MAC_EXPNS_TYP.SPPL.value())
								)
							)
							.and(
								S1_T1.asst_typ.in(
									value(MAC_ASST_TYP.CO_SLS.value()),
									value(MAC_ASST_TYP.CO_PROD.value())
								)
							)
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T1.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T1.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T1.bp_cd.isNull())
							)
						)
						.groupBy(
							S1_T1.calc_grp_cd,
							S1_T1.calc_no,
							S1_T1.ym,
							S1_T1.wg_cd,
							S1_WG.wg_nm,
							S1_T1.mng_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.bp_cd,
							S1_T1.asst_typ,
							S1_T1.qty
						).view(S0_T1)
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T1.pr(S1_T1.ym))
							.and(S0_TERM.term_end_ym.gt(S0_T1.pr(S1_T1.ym)))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T1.pr(S1_T1.itm_cd).eq(S0_ITM.itm_cd)
							.and(S0_T1.pr("itm_sub1_data").eq(S0_ITM.itm_sub1))
							.and(S0_T1.pr("itm_sub2_data").eq(S0_ITM.itm_sub2))
							.and(S0_T1.pr("itm_sub3_data").eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRY_ITM).on(
							S0_T1.pr(S1_T1.itm_cd).eq(S0_SUNDRY_ITM.itm_cd)
							.and(S0_T1.pr("itm_sub1_data").eq(S0_SUNDRY_ITM.itm_sub1))
							.and(S0_T1.pr("itm_sub2_data").eq(S0_SUNDRY_ITM.itm_sub2))
							.and(S0_T1.pr("itm_sub3_data").eq(S0_SUNDRY_ITM.itm_sub3))
							.and(S0_T1.pr("sno1_data").eq(S0_SUNDRY_ITM.sno1))
							.and(S0_T1.pr("sno2_data").eq(S0_SUNDRY_ITM.sno2))
							.and(S0_T1.pr("sno3_data").eq(S0_SUNDRY_ITM.sno3))
							.and(S0_T1.pr("sno4_data").eq(S0_SUNDRY_ITM.sno4))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							nvl(
								S0_SUNDRY_ITM.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mng_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T1.pr(S1_T1.mng_dpt_cd).eq(S0_DPT.dpt_cd).and(S0_TERM.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_TYP_D).on(S0_ITM.itm_typ.eq(S0_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("cntry_nm", "area_nm", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm", "cntry_cd", "area_cd"))
					.view(v -> v.leftOuterJoin(S0_BP).on(S0_T1.pr(S1_T1.bp_cd).eq(S0_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S0_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S0_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_CNTRY).on(S0_BP.cntry_cd.eq(S0_CNTRY.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(v -> v.leftOuterJoin(S0_AREA).on(S0_BP.area_cd.eq(S0_AREA.area_cd)))
					.predicate(p -> p.cutoff$and(S0_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_BP.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_BP.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_BP.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_BP.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_BP.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_BP.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_BP.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_BP.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_BP.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_BP.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("calc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_grp_nm", m.calc_grp_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("mng_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mng_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
							r.setNumberNE("unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bp_cd_")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
					})
				)
			);
	}
	
	/**
	 * -- MGBFL0320_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0320_MGT_ACC_TOP_S02() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_CALC_GRP_R S0_CALC_GRP = MAM_CALC_GRP_R.create("CALC_GRP");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_TYP_D = MAM_ITM_TYP_D_R.create("TYP_D");
		MAM_ITM_JNL_R S0_JNL = MAM_ITM_JNL_R.create("JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R S0_DIM_UNIT = MAM_UNIT_R.create("DIM_UNIT");
		MAM_UNIT_R S0_WT_UNIT = MAM_UNIT_R.create("WT_UNIT");
		MAM_UNIT_R S0_CONTS_UNIT = MAM_UNIT_R.create("CONTS_UNIT");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S0_AREA = MAM_AREA_R.create("AREA");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S0_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S0_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S0_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S0_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S0_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S0_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S0_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S0_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S0_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S0_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MGT_ACC_SML_COST_R S1_T2 = MGT_ACC_SML_COST_R.create("T2");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0320_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(
						S0_T1.pr(S1_T1.calc_grp_cd),
						S0_T1.pr(S1_T1.calc_no),
						S0_T1.pr(S1_T1.ym),
						S0_T1.pr(S1_T1.wg_cd),
						S0_T1.pr(S1_WG.wg_nm),
						S0_T1.pr(S1_T1.mng_dpt_cd),
						S0_T1.pr(S1_T1.itm_cd),
						S0_T1.pr("itm_sub1_data"),
						S0_T1.pr("itm_sub2_data"),
						S0_T1.pr("itm_sub3_data"),
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_alt_nm1,
						S0_ITM.itm_alt_nm2,
						S0_ITM.itm_alt_nm3,
						S0_ITM.itm_alt_nm4,
						S0_ITM.itm_jnl_cd,
						S0_T1.pr("lot_no_data"),
						S0_T1.pr("sublot_no_data"),
						S0_T1.pr("sno1_data"),
						S0_T1.pr("sno2_data"),
						S0_T1.pr("sno3_data"),
						S0_T1.pr("sno4_data"),
						S0_T1.pr(S1_T1.bp_cd),
						S0_T1.pr(S1_T1.asst_typ),
						S0_T1.pr(S1_T1.qty),
						S0_ITM.unit_cd,
						S0_T1.pr("amt"),
						S0_T1.pr("ave_amt"),
						S0_T1.pr("std_amt"),
						S0_ITM.dim_unit_cd,
						S0_DIM_UNIT.unit_nm.as("dim_unit_nm"),
						S0_DIM_UNIT.dec_place.as("dim_unit_dec_place"),
						S0_ITM.wt_unit_cd,
						S0_WT_UNIT.unit_nm.as("wt_unit_nm"),
						S0_WT_UNIT.dec_place.as("wt_unit_dec_place"),
						S0_ITM.conts_unit_cd,
						S0_CONTS_UNIT.unit_nm.as("conts_unit_nm"),
						S0_CONTS_UNIT.dec_place.as("conts_unit_dec_place"),
						decode(
							S0_ITM.dim_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								S0_T1.pr(S1_T1.qty).multiply(S0_ITM.dim),
								nvl(
									S0_DIM_UNIT.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("dim_qty"),
						decode(
							S0_ITM.wt_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								S0_T1.pr(S1_T1.qty).multiply(S0_ITM.wt),
								nvl(
									S0_WT_UNIT.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("wt_qty"),
						decode(
							S0_ITM.conts_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								S0_T1.pr(S1_T1.qty).multiply(S0_ITM.conts_qty),
								nvl(
									S0_CONTS_UNIT.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("conts_qty"),
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						subQuery()
						.select(
							S1_T1.calc_grp_cd,
							S1_T1.calc_no,
							S1_T1.ym,
							S1_T1.wg_cd,
							S1_WG.wg_nm,
							S1_T1.mng_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1.as("itm_sub1_data"),
							S1_T1.itm_sub2.as("itm_sub2_data"),
							S1_T1.itm_sub3.as("itm_sub3_data"),
							S1_T1.lot_no.as("lot_no_data"),
							S1_T1.sublot_no.as("sublot_no_data"),
							S1_T1.sno1.as("sno1_data"),
							S1_T1.sno2.as("sno2_data"),
							S1_T1.sno3.as("sno3_data"),
							S1_T1.sno4.as("sno4_data"),
							S1_T1.bp_cd,
							S1_T1.asst_typ,
							S1_T1.qty,
							S1_T1.act_upri.as("ave_amt"),
							S1_T1.std_upri.as("std_amt"),
							nvl(
								sum(S1_T2.act_cost),
								value(0)
							).as("amt")
						)
						.from(
							S1_T1
							.innerJoin(S1_WG).on(S1_T1.wg_cd.eq(S1_WG.wg_cd))
							.innerJoin(S1_T2).on(
								S1_T1.calc_grp_cd.eq(S1_T2.calc_grp_cd)
								.and(S1_T1.calc_no.eq(S1_T2.calc_no))
								.and(S1_T1.top_rec_no.eq(S1_T2.top_rec_no))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T1.calc_no.eq(bind("calc_no")))
							.and(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
							.and(
								S1_T2.expns_typ.in(
									value(MAC_EXPNS_TYP.PROD.value()),
									value(MAC_EXPNS_TYP.SPPL.value())
								)
							)
							.and(
								S1_T1.asst_typ.in(
									value(MAC_ASST_TYP.CO_SLS.value()),
									value(MAC_ASST_TYP.CO_PROD.value())
								)
							)
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T1.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T1.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T1.bp_cd.isNull())
							)
						)
						.groupBy(
							S1_T1.calc_grp_cd,
							S1_T1.calc_no,
							S1_T1.ym,
							S1_T1.wg_cd,
							S1_WG.wg_nm,
							S1_T1.mng_dpt_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.lot_no,
							S1_T1.sublot_no,
							S1_T1.sno1,
							S1_T1.sno2,
							S1_T1.sno3,
							S1_T1.sno4,
							S1_T1.bp_cd,
							S1_T1.asst_typ,
							S1_T1.qty,
							S1_T1.act_upri,
							S1_T1.std_upri
						).view(S0_T1)
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T1.pr(S1_T1.ym))
							.and(S0_TERM.term_end_ym.gt(S0_T1.pr(S1_T1.ym)))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T1.pr(S1_T1.itm_cd).eq(S0_ITM.itm_cd)
							.and(S0_T1.pr("itm_sub1_data").eq(S0_ITM.itm_sub1))
							.and(S0_T1.pr("itm_sub2_data").eq(S0_ITM.itm_sub2))
							.and(S0_T1.pr("itm_sub3_data").eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRY_ITM).on(
							S0_T1.pr(S1_T1.itm_cd).eq(S0_SUNDRY_ITM.itm_cd)
							.and(S0_T1.pr("itm_sub1_data").eq(S0_SUNDRY_ITM.itm_sub1))
							.and(S0_T1.pr("itm_sub2_data").eq(S0_SUNDRY_ITM.itm_sub2))
							.and(S0_T1.pr("itm_sub3_data").eq(S0_SUNDRY_ITM.itm_sub3))
							.and(S0_T1.pr("sno1_data").eq(S0_SUNDRY_ITM.sno1))
							.and(S0_T1.pr("sno2_data").eq(S0_SUNDRY_ITM.sno2))
							.and(S0_T1.pr("sno3_data").eq(S0_SUNDRY_ITM.sno3))
							.and(S0_T1.pr("sno4_data").eq(S0_SUNDRY_ITM.sno4))
						)
						.leftOuterJoin(S0_DIM_UNIT).on(S0_ITM.dim_unit_cd.eq(S0_DIM_UNIT.unit_cd))
						.leftOuterJoin(S0_WT_UNIT).on(S0_ITM.wt_unit_cd.eq(S0_WT_UNIT.unit_cd))
						.leftOuterJoin(S0_CONTS_UNIT).on(S0_ITM.conts_unit_cd.eq(S0_CONTS_UNIT.unit_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							nvl(
								S0_SUNDRY_ITM.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mng_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T1.pr(S1_T1.mng_dpt_cd).eq(S0_DPT.dpt_cd).and(S0_TERM.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_TYP_D).on(S0_ITM.itm_typ.eq(S0_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("cntry_nm", "area_nm", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm", "cntry_cd", "area_cd"))
					.view(v -> v.leftOuterJoin(S0_BP).on(S0_T1.pr(S1_T1.bp_cd).eq(S0_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S0_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S0_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_CNTRY).on(S0_BP.cntry_cd.eq(S0_CNTRY.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(v -> v.leftOuterJoin(S0_AREA).on(S0_BP.area_cd.eq(S0_AREA.area_cd)))
					.predicate(p -> p.cutoff$and(S0_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_BP.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_BP.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_BP.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_BP.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_BP.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_BP.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_BP.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_BP.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_BP.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_BP.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("calc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_grp_nm", m.calc_grp_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("mng_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mng_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
							r.setNumberNE("unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.bp_alt_nm1,
							m.bp_alt_nm2,
							m.bp_alt_nm3,
							m.bp_alt_nm4,
							m.bp_nm,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
							r.setStringNE("bp_alt_nm1", m.bp_alt_nm1());
							r.setStringNE("bp_alt_nm2", m.bp_alt_nm2());
							r.setStringNE("bp_alt_nm3", m.bp_alt_nm3());
							r.setStringNE("bp_alt_nm4", m.bp_alt_nm4());
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
					})
				)
			);
	}
	
}