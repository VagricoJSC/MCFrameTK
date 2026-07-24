package mcframe.serverMGBA.MGBAL0120;

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
	 * -- MGBAL0120_MGT_PLN_PURC_Query_S01
	 */
	static MCQueryPlan MGBAL0120_MGT_PLN_PURC_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_PLN_PURC_R S1_T = MGT_PLN_PURC_R.create("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAVM_ITM_UNIT_R S1_ITM_UNIT = MAVM_ITM_UNIT_R.create("ITM_UNIT");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S1_SPPL = MAM_BP_R.create("SPPL");
		MAM_CNTRY_R S1_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S1_AREA = MAM_AREA_R.create("AREA");
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
		MAM_BP_GRP_R S1_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S1_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S1_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S1_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S1_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S1_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S1_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S1_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S1_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S1_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_COST_DPT_R S1_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MGT_ACT_PURC_R S2_T = MGT_ACT_PURC_R.create("T");
		MAVM_RD_WG_R S2_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S2_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_SUNDRY_ITM_R S2_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S2_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S2_SPPL = MAM_BP_R.create("SPPL");
		MAM_CNTRY_R S2_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S2_AREA = MAM_AREA_R.create("AREA");
		MAM_ITM_GRP_R S2_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S2_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S2_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S2_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S2_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S2_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S2_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S2_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S2_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S2_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S2_SPPL_GRP1 = MAM_BP_GRP_R.create("SPPL_GRP1");
		MAM_BP_GRP_R S2_SPPL_GRP2 = MAM_BP_GRP_R.create("SPPL_GRP2");
		MAM_BP_GRP_R S2_SPPL_GRP3 = MAM_BP_GRP_R.create("SPPL_GRP3");
		MAM_BP_GRP_R S2_SPPL_GRP4 = MAM_BP_GRP_R.create("SPPL_GRP4");
		MAM_BP_GRP_R S2_SPPL_GRP5 = MAM_BP_GRP_R.create("SPPL_GRP5");
		MAM_BP_GRP_R S2_SPPL_GRP6 = MAM_BP_GRP_R.create("SPPL_GRP6");
		MAM_BP_GRP_R S2_SPPL_GRP7 = MAM_BP_GRP_R.create("SPPL_GRP7");
		MAM_BP_GRP_R S2_SPPL_GRP8 = MAM_BP_GRP_R.create("SPPL_GRP8");
		MAM_BP_GRP_R S2_SPPL_GRP9 = MAM_BP_GRP_R.create("SPPL_GRP9");
		MAM_BP_GRP_R S2_SPPL_GRP10 = MAM_BP_GRP_R.create("SPPL_GRP10");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S2_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_COST_DPT_R S2_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0120_MGT_PLN_PURC_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
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
							S1_T.asst_typ,
							S1_T.sppl_cd,
							S1_T.alc_dpt_cd,
							S1_ITM.unit_cd,
							S1_UNIT.unit_nm,
							S1_ITM.dec_place,
							MGPA_UNIT$F_GET_CONV_QTY_NE(
								S1_T.qty,
								S1_ITM_UNIT.conv_base_qty,
								S1_ITM_UNIT.conv_qty,
								S1_ITM.dec_place,
								S1_ITM.rnd_typ
							).as("pln_qty"),
							value((MCNumber) null).as("act_qty"),
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
							.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))
							.leftOuterJoin(S1_ITM_UNIT).on(
								S1_T.itm_cd.eq(S1_ITM_UNIT.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_ITM_UNIT.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_ITM_UNIT.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_ITM_UNIT.itm_sub3))
								.and(S1_T.unit_cd.eq(S1_ITM_UNIT.unit_cd))
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
							.and(S1_T.calc_ctg_cd.eq(bind("pln_calc_ctg_cd")))
							.and(S1_T.ym.gte(bind("ym_fr")))
							.and(S1_T.ym.lt(bind("ym_to")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
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
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.sppl_cd.like(bind("sppl_cd")))
							.cutoff$and(S1_T.alc_dpt_cd.like(bind("alc_dpt_cd")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
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
						)
						.unionAll(
							subQuery()
							.select(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T.mng_dpt_cd,
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
								S2_T.asst_typ,
								S2_T.sppl_cd,
								S2_T.alc_dpt_cd,
								S2_ITM.unit_cd,
								S2_UNIT.unit_nm,
								S2_ITM.dec_place,
								value((MCNumber) null).as("pln_qty"),
								S2_T.qty.as("act_qty"),
								addDynamicSelect(DS2D)
							)
							.from(
								S2_T
								.innerJoin(S2_DAC).on(S2_T.wg_cd.eq(S2_DAC.wg_cd))
								.leftOuterJoin(S2_ITM).on(
									S2_T.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.leftOuterJoin(S2_UNIT).on(S2_ITM.unit_cd.eq(S2_UNIT.unit_cd))
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
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T.calc_ctg_cd.eq(bind("act_calc_ctg_cd")))
								.and(S2_T.ym.gte(bind("ym_fr")))
								.and(S2_T.ym.lt(bind("ym_to")))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_DAC.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
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
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.sppl_cd.like(bind("sppl_cd")))
								.cutoff$and(S2_T.alc_dpt_cd.like(bind("alc_dpt_cd")))
								.cutoff$and(S2_T.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S2_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S2_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S2_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S2_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S2_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S2_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S2_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S2_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S2_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
								.addDynamicPredicate(DS2D)
							)
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
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
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
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
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
				when(boundOr("sppl_flg"))
					.select(DS0D, S0_T.pr(S1_T.sppl_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.sppl_cd)),
				when(boundOr("sppl_flg"))
					.select(DS0D, S0_T.pr("sppl_nm"))
					.groupBy(DS0D, S0_T.pr("sppl_nm")),
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
				when(boundOr("alc_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.alc_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_dpt_cd)),
				when(boundOr("alc_dpt_flg"))
					.select(DS0D, S0_T.pr("alc_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("alc_dpt_nm")),
				when(boundOr("asst_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
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
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_T.pr("sppl_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd1")),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0D, S0_T.pr("sppl_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm1")),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_T.pr("sppl_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd2")),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0D, S0_T.pr("sppl_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm2")),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_T.pr("sppl_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd3")),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0D, S0_T.pr("sppl_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm3")),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_T.pr("sppl_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd4")),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0D, S0_T.pr("sppl_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm4")),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_T.pr("sppl_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd5")),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0D, S0_T.pr("sppl_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm5")),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_T.pr("sppl_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd6")),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0D, S0_T.pr("sppl_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm6")),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_T.pr("sppl_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd7")),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0D, S0_T.pr("sppl_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm7")),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_T.pr("sppl_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd8")),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0D, S0_T.pr("sppl_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm8")),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_T.pr("sppl_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd9")),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0D, S0_T.pr("sppl_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm9")),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_T.pr("sppl_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_cd10")),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0D, S0_T.pr("sppl_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("sppl_grp_nm10")),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.unit_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.unit_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_UNIT.unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_UNIT.unit_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, max(S0_T.pr(S1_ITM.dec_place)).as("dec_place")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_qty")).as("pln_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_qty")).as("act_qty")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_DAC.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm", "alc_dpt_flg", "alc_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_TERM.term.eq(S1_MNG_DPT.term).and(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
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
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("sppl_flg", "sppl_nm", "sppl_grp_cd1", "sppl_grp_nm1", "sppl_grp_cd2", "sppl_grp_nm2", "sppl_grp_cd3", "sppl_grp_nm3", "sppl_grp_cd4", "sppl_grp_nm4", "sppl_grp_cd5", "sppl_grp_nm5", "sppl_grp_cd6", "sppl_grp_nm6", "sppl_grp_cd7", "sppl_grp_nm7", "sppl_grp_cd8", "sppl_grp_nm8", "sppl_grp_cd9", "sppl_grp_nm9", "sppl_grp_cd10", "sppl_grp_nm10", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "cntry_flg", "area_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL).on(S1_SPPL.bp_cd.eq(S1_T.sppl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S1_SPPL.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S1_SPPL.area_cd.like(bind("area_cd"))).cutoff$and(S1_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S1_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S1_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S1_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S1_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S1_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S1_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S1_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S1_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S1_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_flg"))
					.select(DS1D, S1_SPPL.bp_nm.as("sppl_nm"))
					.groupBy(DS1D, S1_SPPL.bp_nm),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_SPPL.cntry_cd.as("cntry_cd"))
					.groupBy(DS1D, S1_SPPL.cntry_cd),
				when(boundOr("cntry_flg"))
					.select(DS1D, S1_CNTRY.cntry_nm.as("cntry_nm"))
					.groupBy(DS1D, S1_CNTRY.cntry_nm),
				when(boundOr("cntry_flg", "cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CNTRY).on(S1_SPPL.cntry_cd.eq(S1_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_flg"))
					.select(DS1D, S1_SPPL.area_cd.as("area_cd"))
					.groupBy(DS1D, S1_SPPL.area_cd),
				when(boundOr("area_flg"))
					.select(DS1D, S1_AREA.area_nm.as("area_nm"))
					.groupBy(DS1D, S1_AREA.area_nm),
				when(boundOr("area_flg", "area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AREA).on(S1_SPPL.area_cd.eq(S1_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("alc_dpt_flg"))
					.select(DS1D, S1_ALC_DPT.dpt_nm.as("alc_dpt_nm"))
					.groupBy(DS1D, S1_ALC_DPT.dpt_nm),
				when(boundOr("alc_dpt_flg", "alc_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_DPT).on(S1_TERM.term.eq(S1_ALC_DPT.term).and(S1_T.alc_dpt_cd.eq(S1_ALC_DPT.dpt_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_DPT.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ).and(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ).and(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ).and(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ).and(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ).and(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ).and(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ).and(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ).and(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ).and(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ).and(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS1D, S1_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1"))
					.select(DS1D, S1_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS1D, S1_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP1).on(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_SPPL_GRP1.bp_grp_typ).and(S1_SPPL.bp_grp_cd1.eq(S1_SPPL_GRP1.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS1D, S1_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2"))
					.select(DS1D, S1_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS1D, S1_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP2).on(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_SPPL_GRP2.bp_grp_typ).and(S1_SPPL.bp_grp_cd2.eq(S1_SPPL_GRP2.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS1D, S1_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3"))
					.select(DS1D, S1_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS1D, S1_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP3).on(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_SPPL_GRP3.bp_grp_typ).and(S1_SPPL.bp_grp_cd3.eq(S1_SPPL_GRP3.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS1D, S1_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4"))
					.select(DS1D, S1_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS1D, S1_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP4).on(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_SPPL_GRP4.bp_grp_typ).and(S1_SPPL.bp_grp_cd4.eq(S1_SPPL_GRP4.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS1D, S1_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5"))
					.select(DS1D, S1_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS1D, S1_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP5).on(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_SPPL_GRP5.bp_grp_typ).and(S1_SPPL.bp_grp_cd5.eq(S1_SPPL_GRP5.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS1D, S1_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6"))
					.select(DS1D, S1_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS1D, S1_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP6).on(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_SPPL_GRP6.bp_grp_typ).and(S1_SPPL.bp_grp_cd6.eq(S1_SPPL_GRP6.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS1D, S1_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7"))
					.select(DS1D, S1_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS1D, S1_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP7).on(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_SPPL_GRP7.bp_grp_typ).and(S1_SPPL.bp_grp_cd7.eq(S1_SPPL_GRP7.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS1D, S1_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8"))
					.select(DS1D, S1_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS1D, S1_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP8).on(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_SPPL_GRP8.bp_grp_typ).and(S1_SPPL.bp_grp_cd8.eq(S1_SPPL_GRP8.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS1D, S1_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9"))
					.select(DS1D, S1_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS1D, S1_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP9).on(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_SPPL_GRP9.bp_grp_typ).and(S1_SPPL.bp_grp_cd9.eq(S1_SPPL_GRP9.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS1D, S1_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS1D, S1_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10"))
					.select(DS1D, S1_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS1D, S1_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SPPL_GRP10).on(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_SPPL_GRP10.bp_grp_typ).and(S1_SPPL.bp_grp_cd10.eq(S1_SPPL_GRP10.bp_grp_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10")))),
				when(boundOr("wg_flg"))
					.select(DS2D, S2_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS2D, S2_DAC.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS2D, S2_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS2D, S2_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm", "alc_dpt_flg", "alc_dpt_nm"))
					.view(DS2D, v -> v.innerJoin(S2_TERM).on(S2_T.ym.gte(S2_TERM.term).and(S2_T.ym.lt(S2_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_MNG_DPT).on(S2_TERM.term.eq(S2_MNG_DPT.term).and(S2_T.mng_dpt_cd.eq(S2_MNG_DPT.dpt_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
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
				when(boundOr("itm_jnl_flg"))
					.select(DS2D, S2_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS2D, S2_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS2D, S2_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS2D, S2_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_JNL).on(S2_ITM.itm_jnl_cd.eq(S2_ITM_JNL.itm_jnl_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("sppl_flg", "sppl_nm", "sppl_grp_cd1", "sppl_grp_nm1", "sppl_grp_cd2", "sppl_grp_nm2", "sppl_grp_cd3", "sppl_grp_nm3", "sppl_grp_cd4", "sppl_grp_nm4", "sppl_grp_cd5", "sppl_grp_nm5", "sppl_grp_cd6", "sppl_grp_nm6", "sppl_grp_cd7", "sppl_grp_nm7", "sppl_grp_cd8", "sppl_grp_nm8", "sppl_grp_cd9", "sppl_grp_nm9", "sppl_grp_cd10", "sppl_grp_nm10", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "cntry_flg", "area_flg"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL).on(S2_SPPL.bp_cd.eq(S2_T.sppl_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL.bp_nm.like(bind("sppl_nm"))).cutoff$and(S2_SPPL.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S2_SPPL.area_cd.like(bind("area_cd"))).cutoff$and(S2_SPPL.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S2_SPPL.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S2_SPPL.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S2_SPPL.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S2_SPPL.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S2_SPPL.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S2_SPPL.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S2_SPPL.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S2_SPPL.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S2_SPPL.bp_grp_cd10.like(bind("sppl_grp_cd10")))),
				when(boundOr("sppl_flg"))
					.select(DS2D, S2_SPPL.bp_nm.as("sppl_nm"))
					.groupBy(DS2D, S2_SPPL.bp_nm),
				when(boundOr("cntry_flg"))
					.select(DS2D, S2_SPPL.cntry_cd.as("cntry_cd"))
					.groupBy(DS2D, S2_SPPL.cntry_cd),
				when(boundOr("cntry_flg"))
					.select(DS2D, S2_CNTRY.cntry_nm.as("cntry_nm"))
					.groupBy(DS2D, S2_CNTRY.cntry_nm),
				when(boundOr("cntry_flg", "cntry_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CNTRY).on(S2_SPPL.cntry_cd.eq(S2_CNTRY.cntry_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_flg"))
					.select(DS2D, S2_SPPL.area_cd.as("area_cd"))
					.groupBy(DS2D, S2_SPPL.area_cd),
				when(boundOr("area_flg"))
					.select(DS2D, S2_AREA.area_nm.as("area_nm"))
					.groupBy(DS2D, S2_AREA.area_nm),
				when(boundOr("area_flg", "area_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_AREA).on(S2_SPPL.area_cd.eq(S2_AREA.area_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("alc_dpt_flg"))
					.select(DS2D, S2_ALC_DPT.dpt_nm.as("alc_dpt_nm"))
					.groupBy(DS2D, S2_ALC_DPT.dpt_nm),
				when(boundOr("alc_dpt_flg", "alc_dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ALC_DPT).on(S2_TERM.term.eq(S2_ALC_DPT.term).and(S2_T.alc_dpt_cd.eq(S2_ALC_DPT.dpt_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ALC_DPT.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS2D, S2_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS2D, S2_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS2D, S2_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP1).on(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_ITM_GRP1.itm_grp_typ).and(S2_ITM.itm_grp_cd1.eq(S2_ITM_GRP1.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS2D, S2_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS2D, S2_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS2D, S2_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP2).on(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_ITM_GRP2.itm_grp_typ).and(S2_ITM.itm_grp_cd2.eq(S2_ITM_GRP2.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS2D, S2_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS2D, S2_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS2D, S2_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP3).on(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_ITM_GRP3.itm_grp_typ).and(S2_ITM.itm_grp_cd3.eq(S2_ITM_GRP3.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS2D, S2_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS2D, S2_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS2D, S2_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP4).on(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_ITM_GRP4.itm_grp_typ).and(S2_ITM.itm_grp_cd4.eq(S2_ITM_GRP4.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS2D, S2_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS2D, S2_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS2D, S2_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP5).on(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_ITM_GRP5.itm_grp_typ).and(S2_ITM.itm_grp_cd5.eq(S2_ITM_GRP5.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS2D, S2_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS2D, S2_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS2D, S2_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP6).on(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_ITM_GRP6.itm_grp_typ).and(S2_ITM.itm_grp_cd6.eq(S2_ITM_GRP6.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS2D, S2_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS2D, S2_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS2D, S2_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP7).on(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_ITM_GRP7.itm_grp_typ).and(S2_ITM.itm_grp_cd7.eq(S2_ITM_GRP7.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS2D, S2_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS2D, S2_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS2D, S2_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP8).on(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_ITM_GRP8.itm_grp_typ).and(S2_ITM.itm_grp_cd8.eq(S2_ITM_GRP8.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS2D, S2_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS2D, S2_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS2D, S2_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP9).on(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_ITM_GRP9.itm_grp_typ).and(S2_ITM.itm_grp_cd9.eq(S2_ITM_GRP9.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS2D, S2_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS2D, S2_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS2D, S2_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS2D, S2_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP10).on(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_ITM_GRP10.itm_grp_typ).and(S2_ITM.itm_grp_cd10.eq(S2_ITM_GRP10.itm_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS2D, S2_SPPL.bp_grp_cd1.as("sppl_grp_cd1"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd1),
				when(boundOr("sppl_grp_flg1"))
					.select(DS2D, S2_SPPL_GRP1.bp_grp_nm.as("sppl_grp_nm1"))
					.groupBy(DS2D, S2_SPPL_GRP1.bp_grp_nm),
				when(boundOr("sppl_grp_flg1", "sppl_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP1).on(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S2_SPPL_GRP1.bp_grp_typ).and(S2_SPPL.bp_grp_cd1.eq(S2_SPPL_GRP1.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS2D, S2_SPPL.bp_grp_cd2.as("sppl_grp_cd2"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd2),
				when(boundOr("sppl_grp_flg2"))
					.select(DS2D, S2_SPPL_GRP2.bp_grp_nm.as("sppl_grp_nm2"))
					.groupBy(DS2D, S2_SPPL_GRP2.bp_grp_nm),
				when(boundOr("sppl_grp_flg2", "sppl_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP2).on(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S2_SPPL_GRP2.bp_grp_typ).and(S2_SPPL.bp_grp_cd2.eq(S2_SPPL_GRP2.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS2D, S2_SPPL.bp_grp_cd3.as("sppl_grp_cd3"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd3),
				when(boundOr("sppl_grp_flg3"))
					.select(DS2D, S2_SPPL_GRP3.bp_grp_nm.as("sppl_grp_nm3"))
					.groupBy(DS2D, S2_SPPL_GRP3.bp_grp_nm),
				when(boundOr("sppl_grp_flg3", "sppl_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP3).on(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S2_SPPL_GRP3.bp_grp_typ).and(S2_SPPL.bp_grp_cd3.eq(S2_SPPL_GRP3.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS2D, S2_SPPL.bp_grp_cd4.as("sppl_grp_cd4"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd4),
				when(boundOr("sppl_grp_flg4"))
					.select(DS2D, S2_SPPL_GRP4.bp_grp_nm.as("sppl_grp_nm4"))
					.groupBy(DS2D, S2_SPPL_GRP4.bp_grp_nm),
				when(boundOr("sppl_grp_flg4", "sppl_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP4).on(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S2_SPPL_GRP4.bp_grp_typ).and(S2_SPPL.bp_grp_cd4.eq(S2_SPPL_GRP4.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS2D, S2_SPPL.bp_grp_cd5.as("sppl_grp_cd5"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd5),
				when(boundOr("sppl_grp_flg5"))
					.select(DS2D, S2_SPPL_GRP5.bp_grp_nm.as("sppl_grp_nm5"))
					.groupBy(DS2D, S2_SPPL_GRP5.bp_grp_nm),
				when(boundOr("sppl_grp_flg5", "sppl_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP5).on(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S2_SPPL_GRP5.bp_grp_typ).and(S2_SPPL.bp_grp_cd5.eq(S2_SPPL_GRP5.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS2D, S2_SPPL.bp_grp_cd6.as("sppl_grp_cd6"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd6),
				when(boundOr("sppl_grp_flg6"))
					.select(DS2D, S2_SPPL_GRP6.bp_grp_nm.as("sppl_grp_nm6"))
					.groupBy(DS2D, S2_SPPL_GRP6.bp_grp_nm),
				when(boundOr("sppl_grp_flg6", "sppl_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP6).on(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S2_SPPL_GRP6.bp_grp_typ).and(S2_SPPL.bp_grp_cd6.eq(S2_SPPL_GRP6.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS2D, S2_SPPL.bp_grp_cd7.as("sppl_grp_cd7"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd7),
				when(boundOr("sppl_grp_flg7"))
					.select(DS2D, S2_SPPL_GRP7.bp_grp_nm.as("sppl_grp_nm7"))
					.groupBy(DS2D, S2_SPPL_GRP7.bp_grp_nm),
				when(boundOr("sppl_grp_flg7", "sppl_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP7).on(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S2_SPPL_GRP7.bp_grp_typ).and(S2_SPPL.bp_grp_cd7.eq(S2_SPPL_GRP7.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS2D, S2_SPPL.bp_grp_cd8.as("sppl_grp_cd8"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd8),
				when(boundOr("sppl_grp_flg8"))
					.select(DS2D, S2_SPPL_GRP8.bp_grp_nm.as("sppl_grp_nm8"))
					.groupBy(DS2D, S2_SPPL_GRP8.bp_grp_nm),
				when(boundOr("sppl_grp_flg8", "sppl_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP8).on(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S2_SPPL_GRP8.bp_grp_typ).and(S2_SPPL.bp_grp_cd8.eq(S2_SPPL_GRP8.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS2D, S2_SPPL.bp_grp_cd9.as("sppl_grp_cd9"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd9),
				when(boundOr("sppl_grp_flg9"))
					.select(DS2D, S2_SPPL_GRP9.bp_grp_nm.as("sppl_grp_nm9"))
					.groupBy(DS2D, S2_SPPL_GRP9.bp_grp_nm),
				when(boundOr("sppl_grp_flg9", "sppl_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP9).on(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S2_SPPL_GRP9.bp_grp_typ).and(S2_SPPL.bp_grp_cd9.eq(S2_SPPL_GRP9.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS2D, S2_SPPL.bp_grp_cd10.as("sppl_grp_cd10"))
					.groupBy(DS2D, S2_SPPL.bp_grp_cd10),
				when(boundOr("sppl_grp_flg10"))
					.select(DS2D, S2_SPPL_GRP10.bp_grp_nm.as("sppl_grp_nm10"))
					.groupBy(DS2D, S2_SPPL_GRP10.bp_grp_nm),
				when(boundOr("sppl_grp_flg10", "sppl_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SPPL_GRP10).on(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S2_SPPL_GRP10.bp_grp_typ).and(S2_SPPL.bp_grp_cd10.eq(S2_SPPL_GRP10.bp_grp_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_SPPL_GRP10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			);
	}
}