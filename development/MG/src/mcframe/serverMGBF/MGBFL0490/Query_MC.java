package mcframe.serverMGBF.MGBFL0490;

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
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S0_T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_YM_NO_R S0_T3 = MGT_YM_NO_R.create("T3");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						sum(S0_T2.act_cost).as("act_cost")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.innerJoin(S0_T3).on(
							S0_T3.calc_grp_cd.eq(S0_T.calc_grp_cd)
							.and(S0_T3.ym.eq(S0_T.ym))
							.and(S0_T3.calc_no.eq(S0_T.calc_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
						)
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.dpt_cd.eq(S0_T.mng_dpt_cd)
							.and(S0_MNG_DPT.term.eq(S0_TERM.term))
						)
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
					)
					.groupBy(
						S0_T.ym,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place
					)
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S02() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_YM_NO_R S0_T2 = MGT_YM_NO_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R S0_DIM = MAM_UNIT_R.create("DIM");
		MAM_UNIT_R S0_WT = MAM_UNIT_R.create("WT");
		MAM_UNIT_R S0_CONTS = MAM_UNIT_R.create("CONTS");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_ITM.dim_unit_cd,
						S0_DIM.unit_nm.as("dim_unit_nm"),
						nvl(
							S0_DIM.dec_place,
							value(2)
						).as("dim_dec_place"),
						S0_ITM.wt_unit_cd,
						S0_WT.unit_nm.as("wt_unit_nm"),
						nvl(
							S0_WT.dec_place,
							value(2)
						).as("wt_dec_place"),
						S0_ITM.conts_unit_cd,
						S0_CONTS.unit_nm.as("conts_unit_nm"),
						nvl(
							S0_CONTS.dec_place,
							value(2)
						).as("conts_dec_place"),
						sum(S0_T.qty).as("qty"),
						decode(
								S0_ITM.dim_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									sum(S0_T.qty).multiply(S0_ITM.dim),
									nvl(
										S0_DIM.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("dim"),
							decode(
								S0_ITM.wt_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									sum(S0_T.qty).multiply(S0_ITM.wt),
									nvl(
										S0_WT.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("wt"),
							decode(
								S0_ITM.conts_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									sum(S0_T.qty).multiply(S0_ITM.conts_qty),
									nvl(
										S0_CONTS.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("conts")
							)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd)
							.and(S0_T2.ym.eq(S0_T.ym))
							.and(S0_T2.calc_no.eq(S0_T.calc_no))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
						)
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.leftOuterJoin(S0_DIM).on(S0_DIM.unit_cd.eq(S0_ITM.dim_unit_cd))
						.leftOuterJoin(S0_WT).on(S0_WT.unit_cd.eq(S0_ITM.wt_unit_cd))
						.leftOuterJoin(S0_CONTS).on(S0_CONTS.unit_cd.eq(S0_ITM.conts_unit_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.dpt_cd.eq(S0_T.mng_dpt_cd)
							.and(S0_MNG_DPT.term.eq(S0_TERM.term))
						)
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
					)
					.groupBy(
						S0_T.ym,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_ITM.dim_unit_cd,
						S0_DIM.unit_nm,
						S0_DIM.dec_place,
						S0_ITM.wt_unit_cd,
						S0_WT.unit_nm,
						S0_WT.dec_place,
						S0_ITM.conts_unit_cd,
						S0_CONTS.unit_nm,
						S0_CONTS.dec_place,
						S0_ITM.dim,
						S0_ITM.wt,
						S0_ITM.conts_qty
					)
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S03
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S03() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_TOP_R S1_T2 = MGT_ACC_TOP_R.create("T2");
		MGT_ACC_SML_COST_R S1_T3 = MGT_ACC_SML_COST_R.create("T3");
		MGT_YM_NO_R S1_T4 = MGT_YM_NO_R.create("T4");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_AC_RSN_R S1_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S03")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.ym,
							S1_T2.calc_no,
							S1_T2.calc_grp_cd,
							S1_T2.top_rec_no,
							S1_T2.oper_cd,
							S1_OPER.oper_nm,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							nvl(
								S1_SUNDRY_ITM.itm_nm,
								S1_ITM.itm_nm
							).as("itm_nm"),
							S1_ITM.itm_typ,
							S1_ITM.itm_typ_d_cd,
							S1_ITM_TYP_D.itm_typ_d_nm,
							S1_ITM.itm_jnl_cd,
							S1_ITM_JNL.itm_jnl_nm,
							S1_T2.ac_rsn_cd.as("inpt_rsn_cd"),
							S1_AC_RSN.ac_rsn_nm.as("inpt_rsn_nm"),
							S1_T2.asst_typ,
							S1_ITM.unit_cd,
							S1_UNIT.unit_nm,
							S1_ITM.dec_place,
							decode(
								S1_T2.calc_grp_cd,
								bind("calc_grp_cd"),
								S1_T2.qty,
								value(0)
							).as("qty"),
							sum(
								decode(
									S1_T2.calc_grp_cd,
									bind("calc_grp_cd"),
									S1_T3.act_cost,
									value(0)
								)
							).as("act_cost"),
							decode(
								S1_T2.calc_grp_cd,
								bind("pln_calc_grp_cd"),
								S1_T2.qty,
								value(0)
							).as("pln_qty"),
							sum(
								decode(
									S1_T2.calc_grp_cd,
									bind("pln_calc_grp_cd"),
									S1_T3.act_cost,
									value(0)
								)
							).as("pln_cost")
						)
						.from(
							S1_T
							.innerJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.ym.eq(S1_T.ym))
								.and(S1_T2.par_itm_cd.eq(S1_T.itm_cd))
								.and(S1_T2.par_itm_sub1.eq(S1_T.itm_sub1))
								.and(S1_T2.par_itm_sub2.eq(S1_T.itm_sub2))
								.and(S1_T2.par_itm_sub3.eq(S1_T.itm_sub3))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_T.itm_mfg_inst_no))
								.and(S1_T2.mfg_act_no.eq(S1_T.mfg_act_no))
							)
							.leftOuterJoin(S1_T3).on(
								S1_T3.calc_no.eq(S1_T2.calc_no)
								.and(S1_T3.calc_grp_cd.eq(S1_T2.calc_grp_cd))
								.and(S1_T3.top_rec_no.eq(S1_T2.top_rec_no))
							)
							.innerJoin(S1_T4).on(
								S1_T4.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_T4.ym.eq(S1_T.ym))
								.and(S1_T4.calc_no.eq(S1_T.calc_no))
							)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T2.itm_cd)
								.and(S1_ITM.itm_sub1.eq(S1_T2.itm_sub1))
								.and(S1_ITM.itm_sub2.eq(S1_T2.itm_sub2))
								.and(S1_ITM.itm_sub3.eq(S1_T2.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_SUNDRY_ITM.itm_cd.eq(S1_T2.itm_cd)
								.and(S1_SUNDRY_ITM.itm_sub1.eq(S1_T2.itm_sub1))
								.and(S1_SUNDRY_ITM.itm_sub2.eq(S1_T2.itm_sub2))
								.and(S1_SUNDRY_ITM.itm_sub3.eq(S1_T2.itm_sub3))
								.and(S1_SUNDRY_ITM.sno1.eq(S1_T2.sno1))
								.and(S1_SUNDRY_ITM.sno2.eq(S1_T2.sno2))
								.and(S1_SUNDRY_ITM.sno3.eq(S1_T2.sno3))
								.and(S1_SUNDRY_ITM.sno4.eq(S1_T2.sno4))
							)
							.leftOuterJoin(S1_ITM_TYP_D).on(
								S1_ITM_TYP_D.itm_typ.eq(S1_ITM.itm_typ)
								.and(S1_ITM_TYP_D.itm_typ_d_cd.eq(S1_ITM.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_ITM_JNL).on(S1_ITM_JNL.itm_jnl_cd.eq(S1_ITM.itm_jnl_cd))
							.leftOuterJoin(S1_UNIT).on(S1_UNIT.unit_cd.eq(S1_ITM.unit_cd))
							.innerJoin(S1_TERM).on(
								S1_TERM.term.lte(S1_T.ym)
								.and(S1_TERM.term_end_ym.gt(S1_T.ym))
							)
							.leftOuterJoin(S1_MNG_DPT).on(
								S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd)
								.and(S1_MNG_DPT.term.eq(S1_TERM.term))
							)
							.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
							.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
							.leftOuterJoin(S1_OPER).on(S1_OPER.oper_cd.eq(S1_T2.oper_cd))
							.leftOuterJoin(S1_AC_RSN).on(S1_AC_RSN.ac_rsn_cd.eq(S1_T2.ac_rsn_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.calc_grp_cd.in(
									bind("calc_grp_cd"),
									bind("pln_calc_grp_cd")
								)
							)
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.and(S1_T.ym.between(bind("ym_fr"), bind("ym_to")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.and(S1_T2.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
						)
						.groupBy(
							S1_T.ym,
							S1_T2.calc_no,
							S1_T2.calc_grp_cd,
							S1_T2.top_rec_no,
							S1_T2.oper_cd,
							S1_OPER.oper_nm,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_ITM.itm_nm,
							S1_SUNDRY_ITM.itm_nm,
							S1_ITM.itm_typ,
							S1_ITM.itm_typ_d_cd,
							S1_ITM_TYP_D.itm_typ_d_nm,
							S1_ITM.itm_jnl_cd,
							S1_ITM_JNL.itm_jnl_nm,
							S1_T2.ac_rsn_cd,
							S1_AC_RSN.ac_rsn_nm,
							S1_T2.asst_typ,
							S1_ITM.unit_cd,
							S1_UNIT.unit_nm,
							S1_ITM.dec_place,
							S1_T2.qty
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
				when(boundOr("inpt_oper_flg"))
					.select(DS0D, S0_T.pr(S1_T2.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.oper_cd)),
				when(boundOr("inpt_oper_flg"))
					.select(DS0D, S0_T.pr(S1_OPER.oper_nm))
					.groupBy(DS0D, S0_T.pr(S1_OPER.oper_nm)),
				when(boundOr("inpt_rsn_flg"))
					.select(DS0D, S0_T.pr("inpt_rsn_cd"))
					.groupBy(DS0D, S0_T.pr("inpt_rsn_cd")),
				when(boundOr("inpt_rsn_flg"))
					.select(DS0D, S0_T.pr("inpt_rsn_nm"))
					.groupBy(DS0D, S0_T.pr("inpt_rsn_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub1)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub2)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub3)),
				when(null)
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM_TYP_D.itm_typ_d_nm))
					.groupBy(DS0D, S0_T.pr(S1_ITM_TYP_D.itm_typ_d_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM_JNL.itm_jnl_nm))
					.groupBy(DS0D, S0_T.pr(S1_ITM_JNL.itm_jnl_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T2.asst_typ)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.unit_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.unit_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_UNIT.unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_UNIT.unit_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.dec_place))
					.groupBy(DS0D, S0_T.pr(S1_ITM.dec_place)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty")).as("qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost")).as("act_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_qty")).as("pln_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_cost")).as("pln_cost")),
				when(boundOr("inpt_oper_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.oper_cd).asc()),
				when(boundOr("inpt_rsn_flg"))
					.orderBy(DS0D, S0_T.pr("inpt_rsn_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub1).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub2).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub3).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_typ).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.asst_typ).asc())
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S04
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S04() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_INPT_R S1_T2 = MGT_ACC_INPT_R.create("T2");
		MGT_ACC_WK_R S1_T3 = MGT_ACC_WK_R.create("T3");
		MGT_ACC_COST_R S1_T4 = MGT_ACC_COST_R.create("T4");
		MGT_YM_NO_R S1_T5 = MGT_YM_NO_R.create("T5");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_RSN_R S1_WK_RSN = MAM_WK_RSN_R.create("WK_RSN");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S04")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_no,
							S1_T.calc_grp_cd,
							S1_T.top_rec_no,
							S1_T.ym,
							S1_T3.oper_cd,
							S1_OPER.oper_nm,
							S1_T3.wk_cost_cd,
							S1_T3.wk_rsn_cd,
							S1_WK_RSN.wk_rsn_nm,
							S1_WK_COST.wk_cost_nm,
							S1_WK_COST.wk_cost_unit_nm,
							S1_WK_COST.dec_place,
							decode(
								S1_T.calc_grp_cd,
								bind("calc_grp_cd"),
								S1_T3.act_wk_cost,
								value(0)
							).as("qty"),
							sum(
								decode(
									S1_T.calc_grp_cd,
									bind("calc_grp_cd"),
									S1_T4.act_cost,
									value(0)
								)
							).as("act_cost"),
							decode(
								S1_T.calc_grp_cd,
								bind("pln_calc_grp_cd"),
								S1_T3.act_wk_cost,
								value(0)
							).as("pln_qty"),
							sum(
								decode(
									S1_T.calc_grp_cd,
									bind("pln_calc_grp_cd"),
									S1_T4.act_cost,
									value(0)
								)
							).as("pln_cost")
						)
						.from(
							S1_T
							.innerJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
							)
							.innerJoin(S1_T3).on(
								S1_T3.calc_no.eq(S1_T2.calc_no)
								.and(S1_T3.calc_grp_cd.eq(S1_T2.calc_grp_cd))
								.and(S1_T3.inpt_rec_no.eq(S1_T2.inpt_rec_no))
							)
							.leftOuterJoin(S1_T4).on(
								S1_T4.calc_no.eq(S1_T3.calc_no)
								.and(S1_T4.calc_grp_cd.eq(S1_T3.calc_grp_cd))
								.and(S1_T4.inpt_rec_no.eq(S1_T3.inpt_rec_no))
								.and(S1_T4.wk_rec_no.eq(S1_T3.wk_rec_no))
							)
							.innerJoin(S1_T5).on(
								S1_T5.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_T5.ym.eq(S1_T.ym))
								.and(S1_T5.calc_no.eq(S1_T.calc_no))
							)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.leftOuterJoin(S1_WK_COST).on(S1_WK_COST.wk_cost_cd.eq(S1_T3.wk_cost_cd))
							.innerJoin(S1_TERM).on(
								S1_TERM.term.lte(S1_T.ym)
								.and(S1_TERM.term_end_ym.gt(S1_T.ym))
							)
							.leftOuterJoin(S1_MNG_DPT).on(
								S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd)
								.and(S1_MNG_DPT.term.eq(S1_TERM.term))
							)
							.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
							.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
							.leftOuterJoin(S1_OPER).on(S1_OPER.oper_cd.eq(S1_T3.oper_cd))
							.leftOuterJoin(S1_WK_RSN).on(S1_WK_RSN.wk_rsn_cd.eq(S1_T3.wk_rsn_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.calc_grp_cd.in(
									bind("calc_grp_cd"),
									bind("pln_calc_grp_cd")
								)
							)
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.and(S1_T.ym.between(bind("ym_fr"), bind("ym_to")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.and(S1_T2.lvl.eq(value(0)))
							.and(S1_T3.act_wk_cost.neq(value(0)))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
						)
						.groupBy(
							S1_T.calc_no,
							S1_T.calc_grp_cd,
							S1_T.top_rec_no,
							S1_T.ym,
							S1_T3.oper_cd,
							S1_OPER.oper_nm,
							S1_T3.wk_cost_cd,
							S1_T3.wk_rsn_cd,
							S1_WK_RSN.wk_rsn_nm,
							S1_WK_COST.wk_cost_nm,
							S1_WK_COST.wk_cost_unit_nm,
							S1_WK_COST.dec_place,
							S1_T3.act_wk_cost
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
				when(boundOr("wk_oper_flg"))
					.select(DS0D, S0_T.pr(S1_T3.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T3.oper_cd)),
				when(boundOr("wk_oper_flg"))
					.select(DS0D, S0_T.pr(S1_OPER.oper_nm))
					.groupBy(DS0D, S0_T.pr(S1_OPER.oper_nm)),
				when(boundOr("wk_rsn_flg"))
					.select(DS0D, S0_T.pr(S1_T3.wk_rsn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T3.wk_rsn_cd)),
				when(boundOr("wk_rsn_flg"))
					.select(DS0D, S0_T.pr(S1_WK_RSN.wk_rsn_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_RSN.wk_rsn_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T3.wk_cost_cd))
					.groupBy(DS0D, S0_T.pr(S1_T3.wk_cost_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.wk_cost_unit_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_WK_COST.dec_place))
					.groupBy(DS0D, S0_T.pr(S1_WK_COST.dec_place)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty")).as("qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost")).as("act_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_qty")).as("pln_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_cost")).as("pln_cost")),
				when(boundOr("wk_oper_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T3.oper_cd).asc()),
				when(boundOr("wk_rsn_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T3.wk_rsn_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T3.wk_cost_cd).asc())
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S05
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S05() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_YM_NO_R S0_T2 = MGT_YM_NO_R.create("T2");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S05")
					.mainQuery()
					.select(
						S0_T.ym,
						S0_T.bp_cd,
						S0_BP.bp_nm,
						sum(
							decode(
								S0_T.calc_grp_cd,
								bind("calc_grp_cd"),
								S0_T.amt,
								value(0)
							)
						).as("act_cost"),
						sum(
							decode(
								S0_T.calc_grp_cd,
								bind("pln_calc_grp_cd"),
								S0_T.amt,
								value(0)
							)
						).as("pln_cost")
					)
					.from(
						S0_T
						.innerJoin(S0_T2).on(
							S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd)
							.and(S0_T2.ym.eq(S0_T.ym))
							.and(S0_T2.calc_no.eq(S0_T.calc_no))
						)
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T.bp_cd))
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.dpt_cd.eq(S0_T.mng_dpt_cd)
							.and(S0_MNG_DPT.term.eq(S0_TERM.term))
						)
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.loc_cd))
						.leftOuterJoin(S0_SITE).on(S0_SITE.site_cd.eq(S0_LOC.site_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_T.calc_grp_cd.in(
								bind("calc_grp_cd"),
								bind("pln_calc_grp_cd")
							)
						)
						.and(S0_T.itm_cd.eq(bind("itm_cd")))
						.and(S0_T.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T.ym.between(bind("ym_fr"), bind("ym_to")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
						.and(
							nvl(
								S0_T.amt,
								value(0)
							).neq(value(0))
						)
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
					)
					.groupBy(
						S0_T.ym,
						S0_T.bp_cd,
						S0_BP.bp_nm
					)
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S06
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S06() {
		MCTempView S0_T = createTempView("T");
		MGT_ALC_CALC_DTL_R S1_T = MGT_ALC_CALC_DTL_R.create("T");
		MGT_ALC_CALC_RATE_R S1_T2 = MGT_ALC_CALC_RATE_R.create("T2");
		MGT_YM_NO_R S1_T3 = MGT_YM_NO_R.create("T3");
		MAVM_RD_WG_R S1_CND_WG = MAVM_RD_WG_R.create("CND_WG");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_TERM_R S1_CND_TERM = MAM_TERM_R.create("CND_TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_CND_LOC = MAM_LOC_R.create("CND_LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_WG_R S1_WG = MAM_WG_R.create("WG");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S06")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T2.ym,
							S1_T2.alc_ac_cd,
							S1_ALC_AC.alc_ac_nm,
							S1_T2.wg_cd,
							S1_T2.dpt_cd,
							S1_T2.loc_cd,
							S1_T2.oper_cd,
							S1_T2.bp_cd,
							S1_T2.ctg_cd,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.lot_no,
							S1_T2.sublot_no,
							S1_T2.sno1,
							S1_T2.sno2,
							S1_T2.sno3,
							S1_T2.sno4,
							S1_T2.expns_cd,
							S1_EXPNS.expns_nm,
							sum(
								decode(
									S1_T.calc_grp_cd,
									bind("calc_grp_cd"),
									S1_T.alc_amt.add(S1_T.adj_amt),
									value(0)
								)
							).as("act_cost"),
							sum(
								decode(
									S1_T.calc_grp_cd,
									bind("pln_calc_grp_cd"),
									S1_T.alc_amt.add(S1_T.adj_amt),
									value(0)
								)
							).as("pln_cost"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_T2).on(
								S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_T2.calc_no.eq(S1_T.calc_no))
								.and(S1_T2.alc_grp_id.eq(S1_T.alc_grp_id))
							)
							.innerJoin(S1_T3).on(
								S1_T3.calc_grp_cd.eq(S1_T2.calc_grp_cd)
								.and(S1_T3.ym.eq(S1_T2.ym))
								.and(S1_T3.calc_no.eq(S1_T2.calc_no))
							)
							.innerJoin(S1_CND_WG).on(S1_CND_WG.wg_cd.eq(S1_T.wg_cd))
							.leftOuterJoin(S1_EXPNS).on(S1_EXPNS.expns_cd.eq(S1_T2.expns_cd))
							.leftOuterJoin(S1_ALC_AC).on(S1_ALC_AC.alc_ac_cd.eq(S1_T2.alc_ac_cd))
							.innerJoin(S1_CND_TERM).on(
								S1_CND_TERM.term.lte(S1_T.ym)
								.and(S1_CND_TERM.term_end_ym.gt(S1_T.ym))
							)
							.leftOuterJoin(S1_MNG_DPT).on(
								S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd)
								.and(S1_MNG_DPT.term.eq(S1_CND_TERM.term))
							)
							.leftOuterJoin(S1_CND_LOC).on(S1_CND_LOC.loc_cd.eq(S1_T.loc_cd))
							.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_CND_LOC.site_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.calc_grp_cd.in(
									bind("calc_grp_cd"),
									bind("pln_calc_grp_cd")
								)
							)
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.and(S1_T.itm_mfg_inst_no.isNotNull())
							.and(
								S1_T.alc_amt.neq(value(0))
								.or(S1_T.adj_amt.neq(value(0)))
							)
							.and(S1_T2.ym.between(bind("ym_fr"), bind("ym_to")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_CND_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_CND_LOC.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_CND_LOC.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.addDynamicPredicate(DS1D)
						)
						.groupBy(
							S1_T2.ym,
							S1_T2.alc_ac_cd,
							S1_ALC_AC.alc_ac_nm,
							S1_T2.wg_cd,
							S1_T2.dpt_cd,
							S1_T2.loc_cd,
							S1_T2.oper_cd,
							S1_T2.bp_cd,
							S1_T2.ctg_cd,
							S1_T2.itm_cd,
							S1_T2.itm_sub1,
							S1_T2.itm_sub2,
							S1_T2.itm_sub3,
							S1_T2.lot_no,
							S1_T2.sublot_no,
							S1_T2.sno1,
							S1_T2.sno2,
							S1_T2.sno3,
							S1_T2.sno4,
							S1_T2.expns_cd,
							S1_EXPNS.expns_nm,
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
					.select(DS0D, S0_T.pr(S1_T2.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.alc_ac_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.alc_ac_cd)),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr(S1_T2.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T2.lot_no)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T2.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T2.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T2.sno2)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T2.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T2.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T2.sublot_no)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T2.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T2.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T2.sno4)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T2.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T2.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.ctg_cd)),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T2.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub2)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T2.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub3)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T2.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T2.sno1)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T2.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T2.sno3)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.expns_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T2.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T2.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T2.itm_sub1)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(null)
					.select(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_nm))
					.groupBy(DS0D, S0_T.pr(S1_ALC_AC.alc_ac_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_EXPNS.expns_nm))
					.groupBy(DS0D, S0_T.pr(S1_EXPNS.expns_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T2.ym))
					.groupBy(DS0D, S0_T.pr(S1_T2.ym)),
				when(null)
					.select(DS0D, sum(S0_T.pr("act_cost")).as("act_cost")),
				when(null)
					.select(DS0D, sum(S0_T.pr("pln_cost")).as("pln_cost")),
				when(boundOr("wg_flg", "wg_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_WG).on(S1_T2.wg_cd.eq(S1_WG.wg_cd))),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("dpt_flg"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T2.ym.gte(S1_TERM.term).and(S1_T2.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("dpt_flg", "dpt_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T2.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term)))),
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("loc_flg", "loc_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T2.loc_cd.eq(S1_LOC.loc_cd))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("oper_flg", "oper_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T2.oper_cd.eq(S1_OPER.oper_cd))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("bp_flg", "bp_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T2.bp_cd.eq(S1_BP.bp_cd))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("ctg_flg", "ctg_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T2.ctg_cd.eq(S1_CTG.ctg_cd))),
				when(boundOr("ctg_flg"))
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.itm_nm.as("itm_nm"))
					.groupBy(DS1D, S1_ITM.itm_nm),
				when(boundOr("itm_flg", "itm_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM).on(S1_T2.itm_cd.eq(S1_ITM.itm_cd).and(S1_T2.itm_sub1.eq(S1_ITM.itm_sub1)).and(S1_T2.itm_sub2.eq(S1_ITM.itm_sub2)).and(S1_T2.itm_sub3.eq(S1_ITM.itm_sub3)))),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.wg_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.alc_ac_cd).asc()),
				when(boundOr("lot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.lot_no).asc()),
				when(boundOr("dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.dpt_cd).asc()),
				when(boundOr("sno2_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.sno2).asc()),
				when(boundOr("loc_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.loc_cd).asc()),
				when(boundOr("sublot_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.sublot_no).asc()),
				when(boundOr("oper_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.oper_cd).asc()),
				when(boundOr("sno4_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.sno4).asc()),
				when(boundOr("bp_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.bp_cd).asc()),
				when(boundOr("ctg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.ctg_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub2).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub3).asc()),
				when(boundOr("sno1_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.sno1).asc()),
				when(boundOr("sno3_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.sno3).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_T2.expns_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T2.itm_sub1).asc())
			);
	}
	
	/**
	 * -- MGBFL0490_MGT_ACC_TOP_Query_S07
	 */
	static MCQueryPlan MGBFL0490_MGT_ACC_TOP_S07() {
		MCTempView S0_T = createTempView("T");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_UNIT_R S0_DIM = MAM_UNIT_R.create("DIM");
		MAM_UNIT_R S0_WT = MAM_UNIT_R.create("WT");
		MAM_UNIT_R S0_CONTS = MAM_UNIT_R.create("CONTS");
		MGT_ACC_TOP_R S1_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S1_T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_YM_NO_R S1_T3 = MGT_YM_NO_R.create("T3");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0490_MGT_ACC_TOP_Query_S07")
					.mainQuery()
					.select(
						sum(S0_T.pr(S1_T.qty)).as("pln_qty"),
						sum(S0_T.pr("act_cost")).as("pln_cost"),
						decode(
							S0_ITM.dim_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								sum(S0_T.pr(S1_T.qty)).multiply(S0_ITM.dim),
								nvl(
									S0_DIM.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("pln_dim"),
						decode(
							S0_ITM.wt_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								sum(S0_T.pr(S1_T.qty)).multiply(S0_ITM.wt),
								nvl(
									S0_WT.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("pln_wt"),
						decode(
							S0_ITM.conts_unit_cd,
							nullValue(),
							nullValue(),
							MAPA_CALC$F_RND(
								sum(S0_T.pr(S1_T.qty)).multiply(S0_ITM.conts_qty),
								nvl(
									S0_CONTS.dec_place,
									value(2)
								),
								value(MAC_RND_TYP.RNDOFF.value())
							)
						).as("pln_conts")
					)
					.from(
						subQuery()
						.select(
							S1_T.calc_no,
							S1_T.calc_grp_cd,
							S1_T.top_rec_no,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.qty,
							sum(S1_T2.act_cost).as("act_cost")
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd))
								.and(S1_T2.top_rec_no.eq(S1_T.top_rec_no))
							)
							.innerJoin(S1_T3).on(
								S1_T3.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_T3.ym.eq(S1_T.ym))
								.and(S1_T3.calc_no.eq(S1_T.calc_no))
							)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.innerJoin(S1_TERM).on(
								S1_TERM.term.lte(S1_T.ym)
								.and(S1_TERM.term_end_ym.gt(S1_T.ym))
							)
							.leftOuterJoin(S1_MNG_DPT).on(
								S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd)
								.and(S1_MNG_DPT.term.eq(S1_TERM.term))
							)
							.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd))
							.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd))
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("pln_calc_grp_cd")))
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.and(S1_T.ym.between(bind("ym_fr"), bind("ym_to")))
							.and(S1_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
						)
						.groupBy(
							S1_T.calc_no,
							S1_T.calc_grp_cd,
							S1_T.top_rec_no,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.qty
						).view(S0_T)
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.pr(S1_T.itm_cd))
							.and(S0_ITM.itm_sub1.eq(S0_T.pr(S1_T.itm_sub1)))
							.and(S0_ITM.itm_sub2.eq(S0_T.pr(S1_T.itm_sub2)))
							.and(S0_ITM.itm_sub3.eq(S0_T.pr(S1_T.itm_sub3)))
						)
						.leftOuterJoin(S0_DIM).on(S0_DIM.unit_cd.eq(S0_ITM.dim_unit_cd))
						.leftOuterJoin(S0_WT).on(S0_WT.unit_cd.eq(S0_ITM.wt_unit_cd))
						.leftOuterJoin(S0_CONTS).on(S0_CONTS.unit_cd.eq(S0_ITM.conts_unit_cd))
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_ITM.dim,
						S0_ITM.dim_unit_cd,
						S0_ITM.wt,
						S0_ITM.wt_unit_cd,
						S0_ITM.conts_qty,
						S0_ITM.conts_unit_cd,
						S0_DIM.dec_place,
						S0_WT.dec_place,
						S0_CONTS.dec_place
					)
			);
	}
}