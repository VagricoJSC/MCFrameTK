package mcframe.serverMGBD.MGBDL0210;

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
	 * -- MGBDL0210_MGT_ACT_ALC_AMT_Query_S01
	 */
	static MCQueryPlan MGBDL0210_MGT_ACT_ALC_AMT_S01() {
		MGT_ACT_ALC_AMT_R S0_T1 = MGT_ACT_ALC_AMT_R.create("T1");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_ACT_ALC_AMT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T1.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())))
						.and(S0_T1.pre_alc_fin_flg.eq(value(true)))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.wg_cd.eq(S1_W.wg_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0210_MGT_ACT_ALC_AMT_Query_S02
	 */
	static MCQueryPlan MGBDL0210_MGT_ACT_ALC_AMT_S02() {
		MGT_ACT_ALC_AMT_R S0_T1 = MGT_ACT_ALC_AMT_R.create("T1");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_ACT_ALC_AMT_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T1.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())))
						.and(
							S0_T1.trd_calc_grp_cd.isNotNull()
							.and(S0_T1.trd_calc_grp_cd.neq(bind("calc_grp_cd")))
							.or(S0_T1.trd_calc_no.isNotNull())
							.and(S0_T1.trd_calc_no.neq(bind("calc_no")))
							.or(S0_T1.trd_wg_cd.isNotNull())
							.and(S0_T1.trd_wg_cd.neq(bind("wg_cd")))
						)
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.wg_cd.eq(S1_W.wg_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0210_MGT_ALC_CALC_ERR_Query_S01
	 */
	static MCQueryPlan MGBDL0210_MGT_ALC_CALC_ERR_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ALC_CALC_ERR_R S1_T = MGT_ALC_CALC_ERR_R.create("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_EXPNS_GRP_R S1_EXPNS_GRP = MAM_EXPNS_GRP_R.create("EXPNS_GRP");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_PTN_R S1_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MAM_ALC_AC_R S1_CO_ALC_AC = MAM_ALC_AC_R.create("CO_ALC_AC");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
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
		MCDynamicSQLID DS1C_BP_GRP = createDynamicSQLID("DS1C_BP_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_ALC_CALC_ERR_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.inpt_alc_typ,
							S1_T.alc_ac_cd,
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
							S1_T.itm_mfg_inst_no,
							S1_T.iv_no,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.amt,
							S1_T.expns_cd,
							S1_T.alc_ptn_cd,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_DAC).on(S1_T.wg_cd.eq(S1_DAC.wg_cd))
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
							.leftOuterJoin(S1_ALC_AC_GRP1).on(
								value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S1_ALC_AC_GRP1.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd1.eq(S1_ALC_AC_GRP1.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP2).on(
								value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S1_ALC_AC_GRP2.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd2.eq(S1_ALC_AC_GRP2.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP3).on(
								value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S1_ALC_AC_GRP3.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd3.eq(S1_ALC_AC_GRP3.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_EXPNS).on(S1_T.expns_cd.eq(S1_EXPNS.expns_cd))
							.leftOuterJoin(S1_EXPNS_GRP).on(S1_EXPNS.expns_grp_cd.eq(S1_EXPNS_GRP.expns_grp_cd))
							.addDynamicView(DS1C_ITM_GRP)
							.addDynamicView(DS1C_BP_GRP)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.inpt_alc_typ.like(bind("inpt_alc_typ")))
							.cutoff$and(S1_T.alc_ac_cd.like(bind("alc_ac_cd")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
							.cutoff$and(S1_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
							.cutoff$and(S1_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
							.cutoff$and(S1_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
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
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.expns_cd.like(bind("expns_cd")))
							.cutoff$and(S1_EXPNS.expns_nm.like(bind("expns_nm")))
							.cutoff$and(S1_EXPNS_GRP.expns_grp_cd.like(bind("expns_grp_cd")))
							.cutoff$and(S1_EXPNS_GRP.expns_grp_nm.like(bind("expns_grp_nm")))
							.addDynamicPredicate(DS1C_ITM_GRP)
							.addDynamicPredicate(DS1C_BP_GRP)
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
				when(boundOr("itm_grp_flg1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(null)
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm)
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd))),
				when(boundOr("bp_grp_flg1"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(null)
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.inpt_alc_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.inpt_alc_typ)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.alc_ac_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ac_cd)),
				when(null)
					.select(DS0D, S0_T.pr("alc_ac_nm"))
					.groupBy(DS0D, S0_T.pr("alc_ac_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(null)
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(null)
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(null)
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(null)
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(null)
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
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
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.amt))
					.groupBy(DS0D, S0_T.pr(S1_T.amt)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.expns_cd)),
				when(null)
					.select(DS0D, S0_T.pr("expns_nm"))
					.groupBy(DS0D, S0_T.pr("expns_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.alc_ptn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ptn_cd)),
				when(null)
					.select(DS0D, S0_T.pr("alc_ptn_nm"))
					.groupBy(DS0D, S0_T.pr("alc_ptn_nm")),
				when(null)
					.select(DS0D, S0_T.pr("co_alc_ac_cd"))
					.groupBy(DS0D, S0_T.pr("co_alc_ac_cd")),
				when(null)
					.select(DS0D, S0_T.pr("co_alc_ac_nm"))
					.groupBy(DS0D, S0_T.pr("co_alc_ac_nm")),
				when(null)
					.select(DS1D, S1_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_DAC.wg_nm),
				when(null)
					.select(DS1D, S1_ALC_AC.alc_ac_nm.as("alc_ac_nm"))
					.groupBy(DS1D, S1_ALC_AC.alc_ac_nm),
				when(null)
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(null)
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term)))),
				when(null)
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd))),
				when(null)
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd))),
				when(null)
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd))),
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
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd)))),
				when(null)
					.select(DS1D, S1_EXPNS.expns_nm.as("expns_nm"))
					.groupBy(DS1D, S1_EXPNS.expns_nm),
				when(null)
					.select(DS1D, S1_ALC_PTN.alc_ptn_nm.as("alc_ptn_nm"))
					.groupBy(DS1D, S1_ALC_PTN.alc_ptn_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_PTN).on(S1_T.alc_ptn_cd.eq(S1_ALC_PTN.alc_ptn_cd))),
				when(null)
					.select(DS1D, S1_ALC_AC.co_alc_ac_cd.as("co_alc_ac_cd"))
					.groupBy(DS1D, S1_ALC_AC.co_alc_ac_cd),
				when(null)
					.select(DS1D, S1_CO_ALC_AC.alc_ac_nm.as("co_alc_ac_nm"))
					.groupBy(DS1D, S1_CO_ALC_AC.alc_ac_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_CO_ALC_AC).on(S1_ALC_AC.co_alc_ac_cd.eq(S1_CO_ALC_AC.alc_ac_cd).and(S1_CO_ALC_AC.del_flg.eq(value(false))))),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.inpt_alc_typ).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.alc_ac_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.dpt_cd).asc())
			);
	}
	
	/**
	 * -- MGBDL0210_MGT_ALC_CALC_ERR_Query_S02
	 */
	static MCQueryPlan MGBDL0210_MGT_ALC_CALC_ERR_S02() {
		MCTempView S0_T = createTempView("T");
		MGT_ALC_CALC_ERR_R S1_T = MGT_ALC_CALC_ERR_R.create("T");
		MAVM_WR_WG_R S1_DAC = MAVM_WR_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_EXPNS_GRP_R S1_EXPNS_GRP = MAM_EXPNS_GRP_R.create("EXPNS_GRP");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_PTN_R S1_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MAM_ALC_AC_R S1_CO_ALC_AC = MAM_ALC_AC_R.create("CO_ALC_AC");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
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
		MCDynamicSQLID DS1C_BP_GRP = createDynamicSQLID("DS1C_BP_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_ALC_CALC_ERR_Query_S02")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.inpt_alc_typ,
							S1_T.alc_ac_cd,
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
							S1_T.itm_mfg_inst_no,
							S1_T.iv_no,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.amt,
							S1_T.expns_cd,
							S1_T.alc_ptn_cd,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_DAC).on(S1_T.wg_cd.eq(S1_DAC.wg_cd))
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
							.leftOuterJoin(S1_ALC_AC_GRP1).on(
								value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S1_ALC_AC_GRP1.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd1.eq(S1_ALC_AC_GRP1.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP2).on(
								value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S1_ALC_AC_GRP2.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd2.eq(S1_ALC_AC_GRP2.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP3).on(
								value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S1_ALC_AC_GRP3.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd3.eq(S1_ALC_AC_GRP3.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_EXPNS).on(S1_T.expns_cd.eq(S1_EXPNS.expns_cd))
							.leftOuterJoin(S1_EXPNS_GRP).on(S1_EXPNS.expns_grp_cd.eq(S1_EXPNS_GRP.expns_grp_cd))
							.addDynamicView(DS1C_ITM_GRP)
							.addDynamicView(DS1C_BP_GRP)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.inpt_alc_typ.like(bind("inpt_alc_typ")))
							.cutoff$and(S1_T.alc_ac_cd.like(bind("alc_ac_cd")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
							.cutoff$and(S1_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
							.cutoff$and(S1_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
							.cutoff$and(S1_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
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
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.expns_cd.like(bind("expns_cd")))
							.cutoff$and(S1_EXPNS.expns_nm.like(bind("expns_nm")))
							.cutoff$and(S1_EXPNS_GRP.expns_grp_cd.like(bind("expns_grp_cd")))
							.cutoff$and(S1_EXPNS_GRP.expns_grp_nm.like(bind("expns_grp_nm")))
							.addDynamicPredicate(DS1C_ITM_GRP)
							.addDynamicPredicate(DS1C_BP_GRP)
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
				when(boundOr("itm_grp_flg1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(null)
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm)
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd))),
				when(boundOr("bp_grp_flg1"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS1C_BP_GRP, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1C_BP_GRP, p -> p.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(null)
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.inpt_alc_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.inpt_alc_typ)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.alc_ac_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ac_cd)),
				when(null)
					.select(DS0D, S0_T.pr("alc_ac_nm"))
					.groupBy(DS0D, S0_T.pr("alc_ac_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(null)
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(null)
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(null)
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(null)
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(null)
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
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
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.amt))
					.groupBy(DS0D, S0_T.pr(S1_T.amt)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.expns_cd)),
				when(null)
					.select(DS0D, S0_T.pr("expns_nm"))
					.groupBy(DS0D, S0_T.pr("expns_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.alc_ptn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ptn_cd)),
				when(null)
					.select(DS0D, S0_T.pr("alc_ptn_nm"))
					.groupBy(DS0D, S0_T.pr("alc_ptn_nm")),
				when(null)
					.select(DS0D, S0_T.pr("co_alc_ac_cd"))
					.groupBy(DS0D, S0_T.pr("co_alc_ac_cd")),
				when(null)
					.select(DS0D, S0_T.pr("co_alc_ac_nm"))
					.groupBy(DS0D, S0_T.pr("co_alc_ac_nm")),
				when(null)
					.select(DS1D, S1_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_DAC.wg_nm),
				when(null)
					.select(DS1D, S1_ALC_AC.alc_ac_nm.as("alc_ac_nm"))
					.groupBy(DS1D, S1_ALC_AC.alc_ac_nm),
				when(null)
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(null)
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term)))),
				when(null)
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd))),
				when(null)
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd))),
				when(null)
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd))),
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
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd)))),
				when(null)
					.select(DS1D, S1_EXPNS.expns_nm.as("expns_nm"))
					.groupBy(DS1D, S1_EXPNS.expns_nm),
				when(null)
					.select(DS1D, S1_ALC_PTN.alc_ptn_nm.as("alc_ptn_nm"))
					.groupBy(DS1D, S1_ALC_PTN.alc_ptn_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_PTN).on(S1_T.alc_ptn_cd.eq(S1_ALC_PTN.alc_ptn_cd))),
				when(null)
					.select(DS1D, S1_ALC_AC.co_alc_ac_cd.as("co_alc_ac_cd"))
					.groupBy(DS1D, S1_ALC_AC.co_alc_ac_cd),
				when(null)
					.select(DS1D, S1_CO_ALC_AC.alc_ac_nm.as("co_alc_ac_nm"))
					.groupBy(DS1D, S1_CO_ALC_AC.alc_ac_nm)
					.view(DS1D, v -> v.leftOuterJoin(S1_CO_ALC_AC).on(S1_ALC_AC.co_alc_ac_cd.eq(S1_CO_ALC_AC.alc_ac_cd).and(S1_CO_ALC_AC.del_flg.eq(value(false))))),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.inpt_alc_typ).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.alc_ac_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T.dpt_cd).asc())
			);
	}
	
	/**
	 * -- MGBDL0210_MGT_PLN_ALC_AMT_Query_S01
	 */
	static MCQueryPlan MGBDL0210_MGT_PLN_ALC_AMT_S01() {
		MGT_PLN_ALC_AMT_R S0_T1 = MGT_PLN_ALC_AMT_R.create("T1");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_PLN_ALC_AMT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T1.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())))
						.and(S0_T1.pre_alc_fin_flg.eq(value(true)))
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.wg_cd.eq(S1_W.wg_cd))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0210_MGT_PLN_ALC_AMT_Query_S02
	 */
	static MCQueryPlan MGBDL0210_MGT_PLN_ALC_AMT_S02() {
		MGT_PLN_ALC_AMT_R S0_T1 = MGT_PLN_ALC_AMT_R.create("T1");
		MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0210_MGT_PLN_ALC_AMT_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
						.and(S0_T1.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())))
						.and(
							S0_T1.trd_calc_grp_cd.isNotNull()
							.and(S0_T1.trd_calc_grp_cd.neq(bind("calc_grp_cd")))
							.or(S0_T1.trd_calc_no.isNotNull())
							.and(S0_T1.trd_calc_no.neq(bind("calc_no")))
							.or(S0_T1.trd_wg_cd.isNotNull())
							.and(S0_T1.trd_wg_cd.neq(bind("wg_cd")))
						)
						.and(S0_T1.wg_cd.eq(bind("wg_cd")))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.wg_cd.eq(S1_W.wg_cd))
								)
							)
						)
					)
			);
	}
}