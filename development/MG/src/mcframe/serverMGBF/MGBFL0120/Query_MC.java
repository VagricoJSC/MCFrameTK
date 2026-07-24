package mcframe.serverMGBF.MGBFL0120;

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
	 * -- MGBFL0120_MGT_ALC_CALC_RATE_Query_S01
	 */
	static MCQueryPlan MGBFL0120_MGT_ALC_CALC_RATE_S01() {
		MCTempView S0_T = createTempView("T");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S0_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_COST_CTG_R S0_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ALC_PTN_R S0_ALC_PTN = MAM_ALC_PTN_R.create("ALC_PTN");
		MGT_ALC_CALC_DTL_R S1_T = MGT_ALC_CALC_DTL_R.create("T");
		MGT_ALC_CALC_RATE_R S1_T2 = MGT_ALC_CALC_RATE_R.create("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAVM_RD_WG_R S1_WG2 = MAVM_RD_WG_R.create("WG2");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_EXPNS_GRP_R S1_EXPNS_GRP = MAM_EXPNS_GRP_R.create("EXPNS_GRP");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_COST_DPT_R S1_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_CNTRY_R S1_BP_CNTRY = MAM_CNTRY_R.create("BP_CNTRY");
		MAM_AREA_R S1_BP_AREA = MAM_AREA_R.create("BP_AREA");
		MAM_AC_RSN_R S1_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MAM_WK_RSN_R S1_WK_RSN = MAM_WK_RSN_R.create("WK_RSN");
		MAM_GP_ALC_R S1_GP_ALC = MAM_GP_ALC_R.create("GP_ALC");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
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
		
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0120_MGT_ALC_CALC_RATE_Query_S01")
					.mainQuery()
					.select(
						S0_T.prAll(),
						S0_DPT.dpt_nm,
						S0_LOC.loc_nm,
						S0_OPER.oper_nm,
						S0_BP.bp_nm,
						S0_CTG.ctg_nm,
						S0_ITM.itm_nm,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ALC_PTN.alc_ptn_nm
					)
					.from(
						subQuery()
						.select(
							S1_T2.ym,
							S1_T2.inpt_alc_typ,
							S1_T2.alc_ac_cd,
							S1_ALC_AC.alc_ac_nm,
							S1_T2.wg_cd,
							S1_WG2.wg_nm,
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
							S1_T2.itm_mfg_inst_no,
							S1_T2.po_no,
							S1_T2.slo_no,
							S1_T2.iv_no,
							S1_T2.expns_cd,
							S1_EXPNS.expns_nm,
							S1_EXPNS.expns_grp_cd,
							S1_EXPNS.expns_seq,
							S1_EXPNS_GRP.expns_grp_nm,
							S1_EXPNS_GRP.expns_grp_seq,
							S1_T2.alc_ptn_cd,
							S1_T2.alc_rate,
							S1_T2.std_alc_rate,
							sum(S1_T.alc_amt).as("alc_amt"),
							sum(S1_T.adj_amt).as("adj_amt"),
							sum(S1_T.alc_tgt_val).as("alc_tgt_val"),
							sum(
								nvl(
									S1_T.alc_org_tgt_val,
									decode(
										S1_T.coef_val,
										value(0),
										value(0),
										nvl(
											S1_T.alc_tgt_val.divide(S1_T.coef_val),
											value(0)
										)
									)
								)
							).as("alc_org_tgt_val")
						)
						.from(
							S1_T
							.innerJoin(S1_T2).on(
								S1_T2.calc_grp_cd.eq(S1_T.calc_grp_cd)
								.and(S1_T2.calc_no.eq(S1_T.calc_no))
								.and(S1_T2.alc_grp_id.eq(S1_T.alc_grp_id))
							)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.wg_cd))
							.innerJoin(S1_WG2).on(S1_WG2.wg_cd.eq(S1_T2.wg_cd))
							.leftOuterJoin(S1_ALC_AC).on(S1_ALC_AC.alc_ac_cd.eq(S1_T2.alc_ac_cd))
							.leftOuterJoin(S1_EXPNS).on(S1_EXPNS.expns_cd.eq(S1_T2.expns_cd))
							.leftOuterJoin(S1_EXPNS_GRP).on(S1_EXPNS_GRP.expns_grp_cd.eq(S1_EXPNS.expns_grp_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T2.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T2.calc_no.like(bind("calc_no")))
							.cutoff$and(
								bind("amt_zero_flg_str").eq(value(false))
								.and(
									S1_T.alc_amt.neq(value(0))
									.or(S1_T.adj_amt.neq(value(0)))
								)
							)
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.oper_act_no.like(bind("oper_act_no")))
							.cutoff$and(S1_T.wk_cost_cd.like(bind("wk_cost_cd")))
							.cutoff$and(S1_T.wk_rsn_cd.like(bind("wk_rsn_cd")))
							.cutoff$and(S1_T.alc_dpt_cd.like(bind("alc_dpt_cd")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.gp_alc_cd.like(bind("gp_alc_cd")))
							.cutoff$and(S1_T.act_sls_id.like(bind("act_sls_id")))
							.cutoff$and(S1_T.act_sls_id_sub.like(bind("act_sls_id_sub")))
							.cutoff$and(S1_T2.alc_ac_cd.like(bind("alc_ac_cd")))
							.cutoff$and(S1_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
							.cutoff$and(S1_T2.wg_cd.like(bind("rate_wg_cd")))
							.cutoff$and(S1_WG2.wg_nm.like(bind("rate_wg_nm")))
							.cutoff$and(S1_T2.expns_cd.like(bind("expns_cd")))
							.cutoff$and(S1_EXPNS.expns_nm.like(bind("expns_nm")))
							.cutoff$and(S1_EXPNS.expns_grp_cd.like(bind("expns_grp_cd")))
							.cutoff$and(S1_EXPNS.expns_typ.like(bind("expns_typ")))
							.cutoff$and(S1_EXPNS_GRP.expns_grp_nm.like(bind("expns_grp_nm")))
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S1_T.ac_rsn_cd.isNull())
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
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.bp_cd.isNull())
							)
							.addDynamicPredicate(DS1D)
						)
						.groupBy(
							S1_T2.ym,
							S1_T2.inpt_alc_typ,
							S1_T2.alc_ac_cd,
							S1_ALC_AC.alc_ac_nm,
							S1_T2.wg_cd,
							S1_WG2.wg_nm,
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
							S1_T2.itm_mfg_inst_no,
							S1_T2.po_no,
							S1_T2.slo_no,
							S1_T2.iv_no,
							S1_T2.expns_cd,
							S1_EXPNS.expns_nm,
							S1_EXPNS.expns_grp_cd,
							S1_EXPNS.expns_seq,
							S1_EXPNS_GRP.expns_grp_nm,
							S1_EXPNS_GRP.expns_grp_seq,
							S1_T2.alc_ptn_cd,
							S1_T2.alc_rate,
							S1_T2.std_alc_rate
						).view(S0_T)
						.innerJoin(S0_TERM).on(
							S0_T.pr(S1_T2.ym).gte(S0_TERM.term)
							.and(S0_T.pr(S1_T2.ym).lt(S0_TERM.term_end_ym))
						)
						.leftOuterJoin(S0_DPT).on(
							S0_DPT.dpt_cd.eq(S0_T.pr(S1_T2.dpt_cd))
							.and(S0_DPT.term.eq(S0_TERM.term))
						)
						.leftOuterJoin(S0_LOC).on(S0_LOC.loc_cd.eq(S0_T.pr(S1_T2.loc_cd)))
						.leftOuterJoin(S0_OPER).on(S0_OPER.oper_cd.eq(S0_T.pr(S1_T2.oper_cd)))
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T.pr(S1_T2.bp_cd)))
						.leftOuterJoin(S0_CTG).on(S0_CTG.ctg_cd.eq(S0_T.pr(S1_T2.ctg_cd)))
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.pr(S1_T2.itm_cd))
							.and(S0_ITM.itm_sub1.eq(S0_T.pr(S1_T2.itm_sub1)))
							.and(S0_ITM.itm_sub2.eq(S0_T.pr(S1_T2.itm_sub2)))
							.and(S0_ITM.itm_sub3.eq(S0_T.pr(S1_T2.itm_sub3)))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ALC_PTN).on(S0_ALC_PTN.alc_ptn_cd.eq(S0_T.pr(S1_T2.alc_ptn_cd)))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							bind("amt_zero_flg_str").eq(value(false))
							.and(
								S0_T.pr("alc_amt").neq(value(0))
								.or(S0_T.pr("adj_amt").neq(value(0)))
							)
						)
					)
					.orderBy(
						S0_T.pr(S1_EXPNS_GRP.expns_grp_seq).asc(),
						S0_T.pr(S1_EXPNS.expns_grp_cd).asc(),
						S0_T.pr(S1_EXPNS.expns_seq).asc(),
						S0_T.pr(S1_T2.expns_cd).asc(),
						S0_T.pr(S1_T2.ym).asc(),
						S0_T.pr(S1_T2.alc_ac_cd).asc(),
						S0_T.pr(S1_T2.wg_cd).asc(),
						S0_T.pr(S1_T2.dpt_cd).asc(),
						S0_T.pr(S1_T2.loc_cd).asc(),
						S0_T.pr(S1_T2.oper_cd).asc(),
						S0_T.pr(S1_T2.bp_cd).asc(),
						S0_T.pr(S1_T2.ctg_cd).asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_T.pr(S1_T2.itm_cd).asc(),
						S0_T.pr(S1_T2.itm_sub1).asc(),
						S0_T.pr(S1_T2.itm_sub2).asc(),
						S0_T.pr(S1_T2.itm_sub3).asc(),
						S0_T.pr(S1_T2.lot_no).asc(),
						S0_T.pr(S1_T2.sublot_no).asc(),
						S0_T.pr(S1_T2.sno1).asc(),
						S0_T.pr(S1_T2.sno2).asc(),
						S0_T.pr(S1_T2.sno3).asc(),
						S0_T.pr(S1_T2.sno4).asc(),
						S0_T.pr(S1_T2.itm_mfg_inst_no).asc(),
						S0_T.pr(S1_T2.po_no).asc(),
						S0_T.pr(S1_T2.slo_no).asc(),
						S0_T.pr(S1_T2.iv_no).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mng_dpt_nm", "alc_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_MNG_DPT.dpt_cd.eq(S1_T.mng_dpt_cd).and(S1_MNG_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("alc_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_DPT).on(S1_ALC_DPT.dpt_cd.eq(S1_T.alc_dpt_cd).and(S1_ALC_DPT.term.eq(S1_TERM.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_DPT.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("itm_nm", "itm_typ", "itm_typ_d_cd", "itm_typ_d_nm", "itm_jnl_cd", "itm_jnl_nm", "itm_grp_cd1", "itm_grp_nm1", "itm_grp_cd2", "itm_grp_nm2", "itm_grp_cd3", "itm_grp_nm3", "itm_grp_cd4", "itm_grp_nm4", "itm_grp_cd5", "itm_grp_nm5", "itm_grp_cd6", "itm_grp_nm6", "itm_grp_cd7", "itm_grp_nm7", "itm_grp_cd8", "itm_grp_nm8", "itm_grp_cd9", "itm_grp_nm9", "itm_grp_cd10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM).on(S1_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_ITM.itm_sub3.eq(S1_T.itm_sub3))).leftOuterJoin(S1_SUNDRY_ITM).on(S1_SUNDRY_ITM.itm_cd.eq(S1_T.itm_cd).and(S1_SUNDRY_ITM.itm_sub1.eq(S1_T.itm_sub1)).and(S1_SUNDRY_ITM.itm_sub2.eq(S1_T.itm_sub2)).and(S1_SUNDRY_ITM.itm_sub3.eq(S1_T.itm_sub3)).and(S1_SUNDRY_ITM.sno1.eq(S1_T.sno1)).and(S1_SUNDRY_ITM.sno2.eq(S1_T.sno2)).and(S1_SUNDRY_ITM.sno3.eq(S1_T.sno3)).and(S1_SUNDRY_ITM.sno4.eq(S1_T.sno4))))
					.predicate(DS1D, p -> p.cutoff$and(nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).like(bind("itm_nm"))).cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM_TYP_D.itm_typ.eq(S1_ITM.itm_typ).and(S1_ITM_TYP_D.itm_typ_d_cd.eq(S1_ITM.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM_JNL.itm_jnl_cd.eq(S1_ITM.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("loc_nm", "site_cd", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_SITE.site_cd.eq(S1_LOC.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_STR_LN.loc_cd.eq(S1_T.loc_cd).and(S1_STR_LN.str_ln_cd.eq(S1_T.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("bp_nm", "bp_cntry_cd", "bp_cntry_nm", "bp_area_cd", "bp_area_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_BP.bp_cd.eq(S1_T.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.cntry_cd.like(bind("bp_cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("bp_area_cd"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_CNTRY).on(S1_BP_CNTRY.cntry_cd.eq(S1_BP.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_CNTRY.cntry_nm.like(bind("bp_cntry_nm")))),
				when(boundOr("bp_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_AREA).on(S1_BP_AREA.area_cd.eq(S1_BP.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_AREA.area_nm.like(bind("bp_area_nm")))),
				when(boundOr("ac_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AC_RSN).on(S1_AC_RSN.ac_rsn_cd.eq(S1_T.ac_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_OPER.oper_cd.eq(S1_T.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("wk_cost_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_WK_COST).on(S1_WK_COST.wk_cost_cd.eq(S1_T.wk_cost_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_WK_COST.wk_cost_nm.like(bind("wk_cost_nm")))),
				when(boundOr("wk_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_WK_RSN).on(S1_WK_RSN.wk_rsn_cd.eq(S1_T.wk_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_WK_RSN.wk_rsn_nm.like(bind("wk_rsn_nm")))),
				when(boundOr("gp_alc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_GP_ALC).on(S1_GP_ALC.gp_alc_cd.eq(S1_T.gp_alc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_GP_ALC.gp_alc_nm.like(bind("gp_alc_nm")))),
				when(boundOr("alc_ac_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP1).on(S1_ALC_AC_GRP1.alc_ac_grp_cd.eq(S1_ALC_AC.alc_ac_grp_cd1).and(S1_ALC_AC_GRP1.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP1.value())))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))),
				when(boundOr("alc_ac_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP2).on(S1_ALC_AC_GRP2.alc_ac_grp_cd.eq(S1_ALC_AC.alc_ac_grp_cd2).and(S1_ALC_AC_GRP2.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP2.value())))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))),
				when(boundOr("alc_ac_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_AC_GRP3).on(S1_ALC_AC_GRP3.alc_ac_grp_cd.eq(S1_ALC_AC.alc_ac_grp_cd3).and(S1_ALC_AC_GRP3.alc_ac_grp_typ.eq(value(MAC_ALC_AC_GRP_TYP.GRP3.value())))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))),
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
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
}