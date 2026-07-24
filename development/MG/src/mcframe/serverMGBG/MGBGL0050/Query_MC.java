package mcframe.serverMGBG.MGBGL0050;

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
	 * -- MGBGL0050_MGT_PA_ALC_AMT_Query_S01
	 */
	static MCQueryPlan MGBGL0050_MGT_PA_ALC_AMT_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_PLN_ALC_AMT_R S1_T = MGT_PLN_ALC_AMT_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S1_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MGT_ACT_ALC_AMT_R S2_T = MGT_ACT_ALC_AMT_R.create("T");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S2_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S2_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ALC_AC_R S2_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S2_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S2_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S2_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_COST_DPT_R S2_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S2_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S2_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S2_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBGL0050_MGT_PA_ALC_AMT_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_ctg_cd,
							S1_CALC_CTG.calc_ctg_nm,
							S1_T.alc_rec_typ,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_TERM.term,
							S1_T.ym,
							S1_T.alc_ac_cd,
							S1_ALC_AC.alc_ac_nm,
							S1_ALC_AC.alc_ac_grp_cd1,
							S1_ALC_AC.alc_ac_grp_cd2,
							S1_ALC_AC.alc_ac_grp_cd3,
							S1_T.dpt_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.bp_cd,
							S1_T.ctg_cd,
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
							S1_T.amt.as("pln_amt"),
							value(0).as("act_amt"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
							.innerJoin(S1_TERM).on(
								S1_TERM.term.lte(S1_T.ym)
								.and(S1_TERM.term_end_ym.gt(S1_T.ym))
							)
							.leftOuterJoin(S1_CALC_CTG).on(S1_T.calc_ctg_cd.eq(S1_CALC_CTG.calc_ctg_cd))
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
							.leftOuterJoin(S1_ALC_AC).on(S1_T.alc_ac_cd.eq(S1_ALC_AC.alc_ac_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_ctg_cd.like(bind("pln_calc_ctg_cd")))
							.cutoff$and(S1_CALC_CTG.calc_ctg_nm.like(bind("pln_calc_ctg_nm")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_TERM.term.gte(bind("term_fr")))
							.cutoff$and(S1_TERM.term.lte(bind("term_to")))
							.cutoff$and(
								toNumber(
									toChar(
										S1_T.ym,
										MCDateTimeFmt.YYYY
									)
								).gte(bind("y_fr"))
							)
							.cutoff$and(
								toNumber(
									toChar(
										S1_T.ym,
										MCDateTimeFmt.YYYY
									)
								).lte(bind("y_to"))
							)
							.cutoff$and(
								toChar(
									S1_T.ym,
									MCDateTimeFmt.MM
								).like(bind("months"))
							)
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.alc_rec_typ.like(bind("alc_rec_typ")))
							.cutoff$and(S1_T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.ctg_cd.like(bind("ctg_cd")))
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
							.cutoff$and(S1_T.alc_ac_cd.like(bind("alc_ac_cd")))
							.cutoff$and(S1_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
							.cutoff$and(
								bind("not_my_wg_flg_str").eq(value(true))
								.and(MGC_ALC_REC_TYP$IS_MY_WG(S1_T.alc_rec_typ).eq(value(false)))
							)
							.cutoff$and(S1_T.pre_alc_fin_flg.eq(bind("pre_alc_fin_flg_str")))
							.addDynamicPredicate(DS1D)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T.calc_ctg_cd,
								S2_CALC_CTG.calc_ctg_nm,
								S2_T.alc_rec_typ,
								S2_T.wg_cd,
								S2_WG.wg_nm,
								S2_TERM.term,
								S2_T.ym,
								S2_T.alc_ac_cd,
								S2_ALC_AC.alc_ac_nm,
								S2_ALC_AC.alc_ac_grp_cd1,
								S2_ALC_AC.alc_ac_grp_cd2,
								S2_ALC_AC.alc_ac_grp_cd3,
								S2_T.dpt_cd,
								S2_T.loc_cd,
								S2_T.oper_cd,
								S2_T.bp_cd,
								S2_T.ctg_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								value(0).as("pln_amt"),
								S2_T.amt.as("act_amt"),
								addDynamicSelect(DS2D)
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_T.wg_cd.eq(S2_WG.wg_cd))
								.innerJoin(S2_TERM).on(
									S2_TERM.term.lte(S2_T.ym)
									.and(S2_TERM.term_end_ym.gt(S2_T.ym))
								)
								.leftOuterJoin(S2_CALC_CTG).on(S2_T.calc_ctg_cd.eq(S2_CALC_CTG.calc_ctg_cd))
								.leftOuterJoin(S2_ITM).on(
									S2_T.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.leftOuterJoin(S2_SUNDRY_ITM).on(
									S2_T.itm_cd.eq(S2_SUNDRY_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_SUNDRY_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_SUNDRY_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_SUNDRY_ITM.itm_sub3))
									.and(S2_T.sno1.eq(S2_SUNDRY_ITM.sno1))
									.and(S2_T.sno2.eq(S2_SUNDRY_ITM.sno2))
									.and(S2_T.sno3.eq(S2_SUNDRY_ITM.sno3))
									.and(S2_T.sno4.eq(S2_SUNDRY_ITM.sno4))
								)
								.leftOuterJoin(S2_ALC_AC).on(S2_T.alc_ac_cd.eq(S2_ALC_AC.alc_ac_cd))
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_CALC_CTG.calc_ctg_nm.like(bind("act_calc_ctg_nm")))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_TERM.term.gte(bind("term_fr")))
								.cutoff$and(S2_TERM.term.lte(bind("term_to")))
								.cutoff$and(
									toNumber(
										toChar(
											S2_T.ym,
											MCDateTimeFmt.YYYY
										)
									).gte(bind("y_fr"))
								)
								.cutoff$and(
									toNumber(
										toChar(
											S2_T.ym,
											MCDateTimeFmt.YYYY
										)
									).lte(bind("y_to"))
								)
								.cutoff$and(
									toChar(
										S2_T.ym,
										MCDateTimeFmt.MM
									).like(bind("months"))
								)
								.cutoff$and(S2_T.ym.gte(bind("ym_fr")))
								.cutoff$and(S2_T.ym.lte(bind("ym_to")))
								.cutoff$and(S2_T.alc_rec_typ.like(bind("alc_rec_typ")))
								.cutoff$and(S2_T.dpt_cd.like(bind("dpt_cd")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_T.oper_cd.like(bind("oper_cd")))
								.cutoff$and(S2_T.bp_cd.like(bind("bp_cd")))
								.cutoff$and(S2_T.ctg_cd.like(bind("ctg_cd")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									nvl(
										S2_SUNDRY_ITM.itm_nm,
										S2_ITM.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.alc_ac_cd.like(bind("alc_ac_cd")))
								.cutoff$and(S2_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
								.cutoff$and(S2_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
								.cutoff$and(S2_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
								.cutoff$and(S2_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
								.cutoff$and(
									bind("not_my_wg_flg_str").eq(value(true))
									.and(MGC_ALC_REC_TYP$IS_MY_WG(S2_T.alc_rec_typ).eq(value(false)))
								)
								.cutoff$and(S2_T.pre_alc_fin_flg.eq(bind("pre_alc_fin_flg_str")))
								.addDynamicPredicate(DS2D)
							)
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
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.calc_ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd)),
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr(S1_CALC_CTG.calc_ctg_nm))
					.groupBy(DS0D, S0_T.pr(S1_CALC_CTG.calc_ctg_nm)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("term_flg"))
					.select(DS0D, S0_T.pr(S1_TERM.term))
					.groupBy(DS0D, S0_T.pr(S1_TERM.term)),
				when(boundOr("term_flg"))
					.select(DS0D, S0_T.pr("term_nm"))
					.groupBy(DS0D, S0_T.pr("term_nm")),
				when(boundOr("y_flg"))
					.select(DS0D, S0_T.pr("year"))
					.groupBy(DS0D, S0_T.pr("year")),
				when(boundOr("m_flg"))
					.select(DS0D, S0_T.pr("month"))
					.groupBy(DS0D, S0_T.pr("month")),
				when(boundOr("alc_rec_flg"))
					.select(DS0D, S0_T.pr(S1_T.alc_rec_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_rec_typ)),
				when(boundOr("alc_ac_flg"))
					.select(DS0D, S0_T.pr(S1_T.alc_ac_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ac_cd)),
				when(boundOr("alc_ac_flg"))
					.select(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_nm))
					.groupBy(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_nm)),
				when(boundOr("alc_ac_grp1_flg"))
					.select(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd1))
					.groupBy(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd1)),
				when(boundOr("alc_ac_grp1_flg"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm1")),
				when(boundOr("alc_ac_grp2_flg"))
					.select(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd2))
					.groupBy(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd2)),
				when(boundOr("alc_ac_grp2_flg"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm2")),
				when(boundOr("alc_ac_grp3_flg"))
					.select(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd3))
					.groupBy(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_grp_cd3)),
				when(boundOr("alc_ac_grp3_flg"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm3")),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
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
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
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
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_amt")).as("pln_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_amt")).as("act_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_amt")).subtract(sum(S0_T.pr("act_amt"))).as("diff_amt")),
				when(boundOr("term_flg"))
					.select(DS1D, S1_TERM.term_nm.as("term_nm"))
					.groupBy(DS1D, S1_TERM.term_nm),
				when(boundOr("y_flg"))
					.select(DS1D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.YYYY)).as("year"))
					.groupBy(DS1D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.YYYY))),
				when(boundOr("m_flg"))
					.select(DS1D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.MM)).as("month"))
					.groupBy(DS1D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.MM))),
				when(boundOr("alc_ac_grp1_flg"))
					.select(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_nm.as("alc_ac_grp_nm1"))
					.groupBy(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp1_flg", "alc_ac_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S1_ALC_AC_GRP1.alc_ac_grp_typ).and(S1_ALC_AC.alc_ac_grp_cd1.eq(S1_ALC_AC_GRP1.alc_ac_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))),
				when(boundOr("alc_ac_grp2_flg"))
					.select(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_nm.as("alc_ac_grp_nm2"))
					.groupBy(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp2_flg", "alc_ac_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S1_ALC_AC_GRP2.alc_ac_grp_typ).and(S1_ALC_AC.alc_ac_grp_cd2.eq(S1_ALC_AC_GRP2.alc_ac_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))),
				when(boundOr("alc_ac_grp3_flg"))
					.select(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_nm.as("alc_ac_grp_nm3"))
					.groupBy(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp3_flg", "alc_ac_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S1_ALC_AC_GRP3.alc_ac_grp_typ).and(S1_ALC_AC.alc_ac_grp_cd3.eq(S1_ALC_AC_GRP3.alc_ac_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))),
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("loc_flg", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_flg"))
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
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
				when(boundOr("term_flg"))
					.select(DS2D, S2_TERM.term_nm.as("term_nm"))
					.groupBy(DS2D, S2_TERM.term_nm),
				when(boundOr("y_flg"))
					.select(DS2D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.YYYY)).as("year"))
					.groupBy(DS2D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.YYYY))),
				when(boundOr("m_flg"))
					.select(DS2D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.MM)).as("month"))
					.groupBy(DS2D, toNumber(toChar(S1_T.ym, MCDateTimeFmt.MM))),
				when(boundOr("alc_ac_grp1_flg"))
					.select(DS2D, S2_ALC_AC_GRP1.alc_ac_grp_nm.as("alc_ac_grp_nm1"))
					.groupBy(DS2D, S2_ALC_AC_GRP1.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp1_flg", "alc_ac_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ALC_AC_GRP1).on(value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S2_ALC_AC_GRP1.alc_ac_grp_typ).and(S2_ALC_AC.alc_ac_grp_cd1.eq(S2_ALC_AC_GRP1.alc_ac_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))),
				when(boundOr("alc_ac_grp2_flg"))
					.select(DS2D, S2_ALC_AC_GRP2.alc_ac_grp_nm.as("alc_ac_grp_nm2"))
					.groupBy(DS2D, S2_ALC_AC_GRP2.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp2_flg", "alc_ac_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ALC_AC_GRP2).on(value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S2_ALC_AC_GRP2.alc_ac_grp_typ).and(S2_ALC_AC.alc_ac_grp_cd2.eq(S2_ALC_AC_GRP2.alc_ac_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))),
				when(boundOr("alc_ac_grp3_flg"))
					.select(DS2D, S2_ALC_AC_GRP3.alc_ac_grp_nm.as("alc_ac_grp_nm3"))
					.groupBy(DS2D, S2_ALC_AC_GRP3.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp3_flg", "alc_ac_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ALC_AC_GRP3).on(value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S2_ALC_AC_GRP3.alc_ac_grp_typ).and(S2_ALC_AC.alc_ac_grp_cd3.eq(S2_ALC_AC_GRP3.alc_ac_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))),
				when(boundOr("dpt_flg"))
					.select(DS2D, S2_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS2D, S2_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DPT).on(S2_T.dpt_cd.eq(S2_DPT.dpt_cd).and(S2_TERM.term.eq(S2_DPT.term))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_flg"))
					.select(DS2D, S2_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS2D, S2_LOC.loc_nm),
				when(boundOr("loc_flg", "loc_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_LOC).on(S2_T.loc_cd.eq(S2_LOC.loc_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_flg"))
					.select(DS2D, S2_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS2D, S2_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_OPER).on(S2_T.oper_cd.eq(S2_OPER.oper_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_flg"))
					.select(DS2D, S2_BP.bp_nm.as("bp_nm"))
					.groupBy(DS2D, S2_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_BP).on(S2_T.bp_cd.eq(S2_BP.bp_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("ctg_flg"))
					.select(DS2D, S2_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS2D, S2_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CTG).on(S2_T.ctg_cd.eq(S2_CTG.ctg_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_CTG.ctg_nm.like(bind("ctg_nm")))),
				when(boundOr("itm_flg"))
					.select(DS2D, nvl(S2_SUNDRY_ITM.itm_nm,S2_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS2D, nvl(S2_SUNDRY_ITM.itm_nm,S2_ITM.itm_nm)),
				when(boundOr("itm_typ_flg"))
					.select(DS2D, S2_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS2D, S2_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS2D, S2_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS2D, S2_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg"))
					.select(DS2D, S2_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS2D, S2_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_TYP_D).on(S2_ITM.itm_typ.eq(S2_ITM_TYP_D.itm_typ).and(S2_ITM.itm_typ_d_cd.eq(S2_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("calc_ctg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd).asc()),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("term_flg"))
					.orderBy(DS0D, S0_T.pr(S1_TERM.term).asc()),
				when(boundOr("y_flg"))
					.orderBy(DS0D, S0_T.pr("year").asc()),
				when(boundOr("m_flg"))
					.orderBy(DS0D, S0_T.pr("month").asc()),
				when(boundOr("alc_rec_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.alc_rec_typ).asc()),
				when(boundOr("alc_ac_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.alc_ac_cd).asc()),
				when(boundOr("dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.dpt_cd).asc())
			);
	}
}