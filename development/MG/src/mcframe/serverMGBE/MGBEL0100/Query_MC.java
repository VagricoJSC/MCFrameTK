package mcframe.serverMGBE.MGBEL0100;

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
	 * -- MGBEL0100_MGT_ARG_Query_S01
	 */
	static MCQueryPlan MGBEL0100_MGT_ARG_S01() {
		MGT_ARG_R S0_T01 = MGT_ARG_R.create("T01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_ARG_Query_S01")
					.mainQuery()
					.select(S0_T01.term)
					.from(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.and(S0_T01.calc_grp_cd.eq(bind("calc_grp_cd")))
					)
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_CALC_STD_ALC_RATE_Query_S01
	 */
	static MCQueryPlan MGBEL0100_MGT_CALC_STD_ALC_RATE_S01() {
		MGT_CALC_STD_ALC_RATE_R S0_T01 = MGT_CALC_STD_ALC_RATE_R.create("T01");
		MGT_STD_ALC_RATE_R S0_T02 = MGT_STD_ALC_RATE_R.create("T02");
		MAM_CALC_CTG_R S0_M01 = MAM_CALC_CTG_R.create("M01");
		MAM_ALC_AC_R S0_M02 = MAM_ALC_AC_R.create("M02");
		MAM_COST_DPT_R S0_M03 = MAM_COST_DPT_R.create("M03");
		MAM_LOC_R S0_M04 = MAM_LOC_R.create("M04");
		MAM_OPER_R S0_M05 = MAM_OPER_R.create("M05");
		MAM_BP_R S0_M06 = MAM_BP_R.create("M06");
		MAM_COST_CTG_R S0_M07 = MAM_COST_CTG_R.create("M07");
		MAM_ITM_R S0_M08 = MAM_ITM_R.create("M08");
		MAM_ALC_PTN_R S0_M09 = MAM_ALC_PTN_R.create("M09");
		MAM_CALC_GRP_R S0_M10 = MAM_CALC_GRP_R.create("M10");
		MAM_ALC_PTN_R S0_M11 = MAM_ALC_PTN_R.create("M11");
		MAVM_RD_WG_R S0_M12 = MAVM_RD_WG_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_ITM_JNL_R S0_M14 = MAM_ITM_JNL_R.create("M14");
		MAM_ALC_AC_GRP_R S0_M15 = MAM_ALC_AC_GRP_R.create("M15");
		MAM_ALC_AC_GRP_R S0_M16 = MAM_ALC_AC_GRP_R.create("M16");
		MAM_ALC_AC_GRP_R S0_M17 = MAM_ALC_AC_GRP_R.create("M17");
		MAM_EXPNS_R S0_M18 = MAM_EXPNS_R.create("M18");
		MAM_EXPNS_R S0_M19 = MAM_EXPNS_R.create("M19");
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
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_CALC_STD_ALC_RATE_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_T02.fix_flg,
							value(true),
							value(true),
							value(false)
						).as("fix"),
						S0_T01.calc_ctg_cd,
						S0_T01.alc_ac_cd,
						S0_M02.alc_ac_nm,
						S0_T01.dpt_cd,
						S0_M03.dpt_nm,
						S0_T01.loc_cd,
						S0_T01.oper_cd,
						S0_T01.bp_cd,
						S0_T01.ctg_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_T01.wg_cd,
						S0_M12.wg_nm,
						S0_T01.alc_rate,
						S0_T01.alc_ptn_cd,
						S0_T01.expns_cd,
						decode(
							S0_T02.fix_flg,
							value(true),
							S0_T02.alc_rate,
							nullValue()
						).as("fix_alc_rate"),
						decode(
							S0_T02.fix_flg,
							value(true),
							S0_T02.fix_alc_ptn_cd,
							nullValue()
						).as("fix_alc_ptn_cd"),
						decode(
							S0_T02.fix_flg,
							value(true),
							S0_T02.fix_expns_cd,
							nullValue()
						).as("fix_expns_cd"),
						decode(
							S0_T02.fix_flg,
							value(true),
							S0_T02.calc_grp_cd,
							nullValue()
						).as("fix_calc_grp_cd"),
						decode(
							S0_T02.fix_flg,
							value(true),
							S0_T02.calc_no,
							nullValue()
						).as("fix_calc_no"),
						// this field is appended by sql coverter.
						S0_T02.calc_grp_cd.as("join_calc_grp_cd_"),
						// this field is appended by sql coverter.
						S0_T02.fix_alc_ptn_cd.as("join_fix_alc_ptn_cd_"),
						// this field is appended by sql coverter.
						S0_T02.fix_expns_cd.as("join_fix_expns_cd_")
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_T02).on(
							nvl(
								S0_T01.alc_ac_cd,
								value(MAC_STR.NULL_VAL.value())
							).eq(nvl(
									S0_T02.alc_ac_cd,
									value(MAC_STR.NULL_VAL.value())
								)
							)
							.and(
								nvl(
									S0_T01.dpt_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.dpt_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.loc_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.loc_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.oper_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.oper_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.bp_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.bp_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.ctg_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.ctg_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.itm_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.itm_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.itm_sub1,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.itm_sub1,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.itm_sub2,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.itm_sub2,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(
								nvl(
									S0_T01.itm_sub3,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_T02.itm_sub3,
										value(MAC_STR.NULL_VAL.value())
									)
								)
							)
							.and(S0_T01.calc_ctg_cd.eq(S0_T02.calc_ctg_cd))
							.and(S0_T01.wg_cd.eq(S0_T02.wg_cd))
							.and(S0_T02.term.eq(bind("term")))
						)
						.leftOuterJoin(S0_M02).on(S0_T01.alc_ac_cd.eq(S0_M02.alc_ac_cd))
						.leftOuterJoin(S0_M03).on(
							S0_T01.dpt_cd.eq(S0_M03.dpt_cd)
							.and(S0_M03.term.eq(bind("term")))
						)
						.innerJoin(S0_M12).on(S0_T01.wg_cd.eq(S0_M12.wg_cd))
						.leftOuterJoin(S0_M15).on(
							S0_M02.alc_ac_grp_cd1.eq(S0_M15.alc_ac_grp_cd)
							.and(S0_M15.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value())))
						)
						.leftOuterJoin(S0_M16).on(
							S0_M02.alc_ac_grp_cd2.eq(S0_M16.alc_ac_grp_cd)
							.and(S0_M16.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value())))
						)
						.leftOuterJoin(S0_M17).on(
							S0_M02.alc_ac_grp_cd3.eq(S0_M17.alc_ac_grp_cd)
							.and(S0_M17.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value())))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.and(S0_T01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T01.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T01.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M12.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T01.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M03.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T01.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T01.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T01.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T01.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T01.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T01.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T01.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T01.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T01.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_M02.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_M02.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_M15.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_M02.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_M16.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_M02.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_M17.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T01.bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_dpt_flg_str").eq(value(true))
							.and(S0_T01.dpt_cd.isNull())
						)
						.cutoff$and(
							bind("no_loc_flg_str").eq(value(true))
							.and(S0_T01.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_oper_flg_str").eq(value(true))
							.and(S0_T01.oper_cd.isNull())
						)
						.cutoff$and(
							bind("no_ctg_flg_str").eq(value(true))
							.and(S0_T01.ctg_cd.isNull())
						)
						.cutoff$and(
							bind("no_itm_flg_str").eq(value(true))
							.and(S0_T01.itm_cd.isNull())
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T01.alc_ac_cd.asc(),
						S0_T01.dpt_cd.asc(),
						S0_T01.loc_cd.asc(),
						S0_T01.oper_cd.asc(),
						S0_T01.bp_cd.asc(),
						S0_T01.ctg_cd.asc(),
						S0_T01.itm_sub1.asc(),
						S0_T01.itm_sub2.asc(),
						S0_T01.itm_sub3.asc(),
						S0_T01.wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_M01).on(S0_T01.calc_ctg_cd.eq(S0_M01.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_M01.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M04).on(S0_T01.loc_cd.eq(S0_M04.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M04.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M05).on(S0_T01.oper_cd.eq(S0_M05.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_M05.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M06).on(S0_T01.bp_cd.eq(S0_M06.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M06.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_M07).on(S0_T01.ctg_cd.eq(S0_M07.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_M07.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_typ_d_nm", "itm_jnl_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_jnl_cd"))
					.view(v -> v.leftOuterJoin(S0_M08).on(S0_T01.itm_cd.eq(S0_M08.itm_cd).and(S0_T01.itm_sub1.eq(S0_M08.itm_sub1)).and(S0_T01.itm_sub2.eq(S0_M08.itm_sub2)).and(S0_T01.itm_sub3.eq(S0_M08.itm_sub3))))
					.predicate(p -> p.cutoff$and(S0_M08.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M08.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M08.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M08.itm_jnl_cd.like(bind("itm_jnl_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_M08.itm_typ.eq(S0_M13.itm_typ).and(S0_M08.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_M08.itm_jnl_cd.eq(S0_M14.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_M14.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M08.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M08.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M08.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M08.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M08.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M08.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M08.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M08.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M08.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M08.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_M06.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_M06.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_M06.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_M06.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_M06.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_M06.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_M06.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_M06.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_M06.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_M06.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_cd,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_jnl_cd", m.itm_jnl_cd());
					}),
					j -> j
						.add(MAM_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("alc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_ptn_nm", m.alc_ptn_nm());
					}),
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("join_calc_grp_cd_")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_calc_grp_nm", m.calc_grp_nm());
					}),
					j -> j
						.add(MAM_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("join_fix_alc_ptn_cd_")
						))
						.addSelect(m -> toArray(
							m.alc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_alc_ptn_nm", m.alc_ptn_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("expns_nm", m.expns_nm());
					}),
					j -> j
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("join_fix_expns_cd_")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_expns_nm", m.expns_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_S01
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_S01() {
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		MAM_CALC_CTG_R S0_M01 = MAM_CALC_CTG_R.create("M01");
		MAM_ALC_AC_R S0_M02 = MAM_ALC_AC_R.create("M02");
		MAM_COST_DPT_R S0_M03 = MAM_COST_DPT_R.create("M03");
		MAM_LOC_R S0_M04 = MAM_LOC_R.create("M04");
		MAM_OPER_R S0_M05 = MAM_OPER_R.create("M05");
		MAM_BP_R S0_M06 = MAM_BP_R.create("M06");
		MAM_COST_CTG_R S0_M07 = MAM_COST_CTG_R.create("M07");
		MAM_ITM_R S0_M08 = MAM_ITM_R.create("M08");
		MAM_ALC_PTN_R S0_M09 = MAM_ALC_PTN_R.create("M09");
		MAM_CALC_GRP_R S0_M10 = MAM_CALC_GRP_R.create("M10");
		MAM_EXPNS_R S0_M11 = MAM_EXPNS_R.create("M11");
		MAVM_RD_WG_R S0_M12 = MAVM_RD_WG_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
		MAM_ITM_JNL_R S0_M14 = MAM_ITM_JNL_R.create("M14");
		MAM_ALC_AC_GRP_R S0_M15 = MAM_ALC_AC_GRP_R.create("M15");
		MAM_ALC_AC_GRP_R S0_M16 = MAM_ALC_AC_GRP_R.create("M16");
		MAM_ALC_AC_GRP_R S0_M17 = MAM_ALC_AC_GRP_R.create("M17");
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
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_T01.fix_flg,
							value(true),
							value(true),
							value(false)
						).as("fix"),
						S0_T01.calc_ctg_cd,
						S0_T01.alc_ac_cd,
						S0_M02.alc_ac_nm,
						S0_T01.dpt_cd,
						S0_M03.dpt_nm,
						S0_T01.loc_cd,
						S0_T01.oper_cd,
						S0_T01.bp_cd,
						S0_T01.ctg_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_T01.wg_cd,
						S0_M12.wg_nm,
						S0_T01.alc_rate,
						S0_T01.fix_alc_ptn_cd.as("alc_ptn_cd"),
						S0_T01.fix_expns_cd.as("expns_cd"),
						S0_T01.alc_rate.as("fix_alc_rate"),
						S0_T01.fix_alc_ptn_cd,
						S0_T01.fix_expns_cd,
						S0_T01.calc_no.as("fix_calc_no"),
						S0_T01.calc_grp_cd.as("fix_calc_grp_cd")
					)
					.from(
						S0_T01
						.leftOuterJoin(S0_M02).on(S0_T01.alc_ac_cd.eq(S0_M02.alc_ac_cd))
						.leftOuterJoin(S0_M03).on(
							S0_T01.dpt_cd.eq(S0_M03.dpt_cd)
							.and(S0_M03.term.eq(bind("term")))
						)
						.innerJoin(S0_M12).on(S0_T01.wg_cd.eq(S0_M12.wg_cd))
						.leftOuterJoin(S0_M15).on(
							S0_M02.alc_ac_grp_cd1.eq(S0_M15.alc_ac_grp_cd)
							.and(S0_M15.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value())))
						)
						.leftOuterJoin(S0_M16).on(
							S0_M02.alc_ac_grp_cd2.eq(S0_M16.alc_ac_grp_cd)
							.and(S0_M16.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value())))
						)
						.leftOuterJoin(S0_M17).on(
							S0_M02.alc_ac_grp_cd3.eq(S0_M17.alc_ac_grp_cd)
							.and(S0_M17.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value())))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.calc_no.eq(bind("calc_no")))
						.and(S0_T01.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T01.term.eq(bind("term")))
						.cutoff$and(S0_T01.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T01.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M12.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T01.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M03.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T01.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T01.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T01.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T01.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T01.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T01.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T01.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T01.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T01.alc_ac_cd.like(bind("alc_ac_cd")))
						.cutoff$and(S0_M02.alc_ac_nm.like(bind("alc_ac_nm")))
						.cutoff$and(S0_M02.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
						.cutoff$and(S0_M15.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
						.cutoff$and(S0_M02.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
						.cutoff$and(S0_M16.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
						.cutoff$and(S0_M02.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
						.cutoff$and(S0_M17.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T01.bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_dpt_flg_str").eq(value(true))
							.and(S0_T01.dpt_cd.isNull())
						)
						.cutoff$and(
							bind("no_loc_flg_str").eq(value(true))
							.and(S0_T01.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_oper_flg_str").eq(value(true))
							.and(S0_T01.oper_cd.isNull())
						)
						.cutoff$and(
							bind("no_ctg_flg_str").eq(value(true))
							.and(S0_T01.ctg_cd.isNull())
						)
						.cutoff$and(
							bind("no_itm_flg_str").eq(value(true))
							.and(S0_T01.itm_cd.isNull())
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T01.alc_ac_cd.asc(),
						S0_T01.dpt_cd.asc(),
						S0_T01.loc_cd.asc(),
						S0_T01.oper_cd.asc(),
						S0_T01.bp_cd.asc(),
						S0_T01.ctg_cd.asc(),
						S0_T01.itm_sub1.asc(),
						S0_T01.itm_sub2.asc(),
						S0_T01.itm_sub3.asc(),
						S0_T01.wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_M01).on(S0_T01.calc_ctg_cd.eq(S0_M01.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_M01.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M04).on(S0_T01.loc_cd.eq(S0_M04.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M04.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M05).on(S0_T01.oper_cd.eq(S0_M05.oper_cd)))
					.predicate(p -> p.cutoff$and(S0_M05.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M06).on(S0_T01.bp_cd.eq(S0_M06.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_M06.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_M07).on(S0_T01.ctg_cd.eq(S0_M07.ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_M07.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_typ_d_nm", "itm_jnl_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd", "itm_jnl_cd"))
					.view(v -> v.leftOuterJoin(S0_M08).on(S0_T01.itm_cd.eq(S0_M08.itm_cd).and(S0_T01.itm_sub1.eq(S0_M08.itm_sub1)).and(S0_T01.itm_sub2.eq(S0_M08.itm_sub2)).and(S0_T01.itm_sub3.eq(S0_M08.itm_sub3))))
					.predicate(p -> p.cutoff$and(S0_M08.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M08.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M08.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M08.itm_jnl_cd.like(bind("itm_jnl_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(S0_M08.itm_typ.eq(S0_M13.itm_typ).and(S0_M08.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(S0_M08.itm_jnl_cd.eq(S0_M14.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_M14.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_M08.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_M08.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_M08.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_M08.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_M08.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_M08.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_M08.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_M08.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_M08.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_M08.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M08.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_M06.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_M06.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_M06.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_M06.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_M06.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_M06.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_M06.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_M06.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_M06.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_M06.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M06.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_cd,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("itm_jnl_cd", m.itm_jnl_cd());
					}),
					j -> j
						.add(MAM_ALC_PTN_R.class, r -> toCondition(
							r.getStringNE("alc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.alc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alc_ptn_nm", m.alc_ptn_nm());
							r.setStringNE("fix_alc_ptn_nm", m.alc_ptn_nm());
					}),
					j -> j
						.add(MAM_CALC_GRP_R.class, r -> toCondition(
							r.getStringNE("fix_calc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.calc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("fix_calc_grp_nm", m.calc_grp_nm());
					}),
					j -> j
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("expns_nm", m.expns_nm());
							r.setStringNE("fix_expns_nm", m.expns_nm());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_S02
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_S02() {
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		MGW_STD_ALC_RATE_R S1_W01 = MGW_STD_ALC_RATE_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_S02")
					.mainQuery()
					.select(S0_T01.prAll())
					.from(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W01)
								.where(
									value(0).eq(value(0))
									.and(
										nvl(
											S0_T01.alc_ac_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.alc_ac_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.dpt_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.loc_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.loc_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.oper_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.oper_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.bp_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.bp_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.ctg_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.ctg_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub1,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub1,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub2,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub2,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub3,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub3,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(S0_T01.term.eq(S1_W01.term))
									.and(S0_T01.calc_ctg_cd.eq(S1_W01.calc_ctg_cd))
									.and(S0_T01.wg_cd.eq(S1_W01.wg_cd))
								)
							)
						)
						.cutoff$and(S0_T01.fix_flg.eq(bind("fix_flg")))
					)
					.forUpdateNoWait()
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_S03
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_S03() {
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		MAM_CALC_GRP_R S0_M01 = MAM_CALC_GRP_R.create("M01");
		MAM_ALC_AC_R S0_M02 = MAM_ALC_AC_R.create("M02");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_S03")
					.mainQuery()
					.select(
						S0_T01.calc_ctg_cd,
						S0_T01.alc_ac_cd,
						S0_T01.dpt_cd,
						S0_T01.loc_cd,
						S0_T01.oper_cd,
						S0_T01.bp_cd,
						S0_T01.ctg_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_T01.wg_cd,
						S0_T01.alc_rate
					)
					.from(
						S0_T01
						.innerJoin(S0_M01).on(S0_T01.calc_grp_cd.eq(S0_M01.calc_grp_cd))
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.term.eq(bind("pre_term")))
						.and(S0_T01.fix_flg.eq(value(true)))
						.cutoff$and(S0_T01.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.cutoff$and(S0_T01.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T01.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T01.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T01.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T01.ctg_cd.like(bind("ctg_cd")))
						.cutoff$and(S0_T01.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T01.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T01.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T01.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T01.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T01.alc_ac_cd.like(bind("alc_ac_cd")))
						.addDynamicPredicate()
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T01.bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_dpt_flg_str").eq(value(true))
							.and(S0_T01.dpt_cd.isNull())
						)
						.cutoff$and(
							bind("no_loc_flg_str").eq(value(true))
							.and(S0_T01.loc_cd.isNull())
						)
						.cutoff$and(
							bind("no_oper_flg_str").eq(value(true))
							.and(S0_T01.oper_cd.isNull())
						)
						.cutoff$and(
							bind("no_ctg_flg_str").eq(value(true))
							.and(S0_T01.ctg_cd.isNull())
						)
						.cutoff$and(
							bind("no_itm_flg_str").eq(value(true))
							.and(S0_T01.itm_cd.isNull())
						)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("alc_ac_grp_cd1", "alc_ac_grp_cd2", "alc_ac_grp_cd3"))
					.view(v -> v.leftOuterJoin(S0_M02).on(S0_T01.alc_ac_cd.eq(S0_M02.alc_ac_cd)))
					.predicate(p -> p.cutoff$and(S0_M02.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1"))).cutoff$and(S0_M02.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2"))).cutoff$and(S0_M02.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3"))))
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_S04
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_S04() {
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		MGW_STD_ALC_RATE_R S1_W01 = MGW_STD_ALC_RATE_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_S04")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T01)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W01)
								.where(
									value(0).eq(value(0))
									.and(
										nvl(
											S0_T01.alc_ac_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.alc_ac_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.dpt_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.loc_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.loc_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.oper_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.oper_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.bp_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.bp_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.ctg_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.ctg_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub1,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub1,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub2,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub2,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub3,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub3,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(S0_T01.term.eq(S1_W01.term))
									.and(S0_T01.calc_ctg_cd.eq(S1_W01.calc_ctg_cd))
									.and(S0_T01.wg_cd.eq(S1_W01.wg_cd))
								)
							)
						)
						.cutoff$and(S0_T01.fix_flg.eq(bind("fix_flg")))
					)
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_S05
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_S05() {
		MGW_STD_ALC_RATE_R S0_W01 = MGW_STD_ALC_RATE_R.create("W01");
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_S05")
					.mainQuery()
					.select(
						S0_T01.alc_ac_cd,
						S0_T01.dpt_cd,
						S0_T01.loc_cd,
						S0_T01.oper_cd,
						S0_T01.bp_cd,
						S0_T01.ctg_cd,
						S0_T01.itm_cd,
						S0_T01.itm_sub1,
						S0_T01.itm_sub2,
						S0_T01.itm_sub3,
						S0_T01.wg_cd,
						S0_T01.term,
						S0_T01.calc_ctg_cd
					)
					.from(
						S0_W01
						.innerJoin(S0_T01).on(
							bracket(
								nvl(
									S0_T01.alc_ac_cd,
									value(MAC_STR.NULL_VAL.value())
								).eq(nvl(
										S0_W01.alc_ac_cd,
										value(MAC_STR.NULL_VAL.value())
									)
								)
								.and(
									nvl(
										S0_T01.dpt_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.dpt_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.loc_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.loc_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.oper_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.oper_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.bp_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.bp_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.ctg_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.ctg_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.itm_cd,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.itm_cd,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.itm_sub1,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.itm_sub1,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.itm_sub2,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.itm_sub2,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0_T01.itm_sub3,
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0_W01.itm_sub3,
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(S0_T01.term.eq(S0_W01.term))
								.and(S0_T01.calc_ctg_cd.eq(S0_W01.calc_ctg_cd))
								.and(S0_T01.wg_cd.eq(S0_W01.wg_cd))
							)
						)
					)
					.forUpdate(S0_T01.alc_ac_cd)
			);
	}
	
	/**
	 * -- MGBEL0100_MGT_STD_ALC_RATE_Query_U02
	 */
	static MCQueryPlan MGBEL0100_MGT_STD_ALC_RATE_U02() {
		MGT_STD_ALC_RATE_R S0_T01 = MGT_STD_ALC_RATE_R.create("T01");
		MGW_STD_ALC_RATE_R S1_W01 = MGW_STD_ALC_RATE_R.create("W01");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGT_STD_ALC_RATE_Query_U02")
					.update(S0_T01)
					.set(S0_T01.fix_flg).eq(value(false))
					.set(S0_T01.fix_alc_ptn_cd).eq(nullValue())
					.set(S0_T01.fix_expns_cd).eq(nullValue())
					.set(S0_T01.calc_grp_cd).eq(nullValue())
					.set(S0_T01.calc_no).eq(nullValue())
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W01)
								.where(
									value(0).eq(value(0))
									.and(
										nvl(
											S0_T01.alc_ac_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.alc_ac_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.dpt_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.loc_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.loc_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.oper_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.oper_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.bp_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.bp_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.ctg_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.ctg_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_cd,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_cd,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub1,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub1,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub2,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub2,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S0_T01.itm_sub3,
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S1_W01.itm_sub3,
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(S0_T01.term.eq(S1_W01.term))
									.and(S0_T01.calc_ctg_cd.eq(S1_W01.calc_ctg_cd))
									.and(S0_T01.wg_cd.eq(S1_W01.wg_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBEL0100_MGW_STD_ALC_RATE_Query_I01
	 */
	static MCQueryPlan MGBEL0100_MGW_STD_ALC_RATE_I01() {
		MGW_STD_ALC_RATE_R S0 = MGW_STD_ALC_RATE_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0100_MGW_STD_ALC_RATE_Query_I01")
					.insert(S0)
					.columns(
						S0.alc_ac_cd,
						S0.dpt_cd,
						S0.loc_cd,
						S0.oper_cd,
						S0.bp_cd,
						S0.ctg_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.wg_cd,
						S0.alc_rate,
						S0.alc_ptn_cd,
						S0.expns_cd,
						S0.calc_ctg_cd,
						S0.term
					)
					.values(
						bind("alc_ac_cd"),
						bind("dpt_cd"),
						bind("loc_cd"),
						bind("oper_cd"),
						bind("bp_cd"),
						bind("ctg_cd"),
						bind("itm_cd"),
						bind("itm_sub1"),
						bind("itm_sub2"),
						bind("itm_sub3"),
						bind("wg_cd"),
						bind("alc_rate"),
						bind("alc_ptn_cd"),
						bind("expns_cd"),
						bind("calc_ctg_cd"),
						bindEx("term")
					)
			);
	}
}