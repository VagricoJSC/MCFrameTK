package mcframe.serverMGBF.MGBFL0090;

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
	 * MGBFL0090_MGT_ACC_TOP_S01
	 */
	static MCQueryPlan MGBFL0090_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_TOP_R S0T2 = MGT_ACC_TOP_R.create("T2");
		MGT_ACC_SML_COST_R S0T3 = MGT_ACC_SML_COST_R.create("T3");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_SUNDRY_ITM_R S0PAR_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("PAR_SUNDRY_ITM");
		MAM_ITM_R S0CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_SUNDRY_ITM_R S0CHD_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("CHD_SUNDRY_ITM");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MCTempView T = createTempView("T");
		MGT_ARG_R ARG = MGT_ARG_R.create("ARG");
		MAM_COST_DPT_R MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R PAR_ITM_TYP_D = MAM_ITM_TYP_D_R.create("PAR_ITM_TYP_D");
		MAM_ITM_JNL_R PAR_ITM_JNL = MAM_ITM_JNL_R.create("PAR_ITM_JNL");
		MAM_ITM_GRP_R PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
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
		MAM_UNIT_R PAR_UNIT = MAM_UNIT_R.create("PAR_UNIT");
		MAM_COST_DPT_R INPT_DPT = MAM_COST_DPT_R.create("INPT_DPT");
		MAM_ITM_TYP_D_R CHD_ITM_TYP_D = MAM_ITM_TYP_D_R.create("CHD_ITM_TYP_D");
		MAM_ITM_JNL_R CHD_ITM_JNL = MAM_ITM_JNL_R.create("CHD_ITM_JNL");
		MAM_ITM_GRP_R CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAM_SITE_R SITE = MAM_SITE_R.create("SITE");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R STK_BP = MAM_BP_R.create("STK_BP");
		MAM_AC_RSN_R AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_UNIT_R CHD_UNIT = MAM_UNIT_R.create("CHD_UNIT");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID chdCore = createDynamicSQLID("chdCore");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0090_MGT_ACC_TOP_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T1.calc_no,
							S0T1.calc_grp_cd,
							S0T1.top_rec_no,
							S0T3.expns_cd,
							S0PAR_ITM.dec_place.as("par_dec_place"),
							S0CHD_ITM.dec_place,
							S0EXPNS.var_typ,
							S0EXPNS.expns_grp_cd,
							S0T3.act_cost,
							S0T3.std_cost,
							addDynamicSelect(core)
						)
						.from(
							S0T1
							.innerJoin(S0WG).on(S0T1.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0PAR_ITM).on(
								S0T1.itm_cd.eq(S0PAR_ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0PAR_ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0PAR_ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0PAR_ITM.itm_sub3))
							)
							.leftOuterJoin(S0PAR_SUNDRY_ITM).on(
								S0T1.itm_cd.eq(S0PAR_SUNDRY_ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0PAR_SUNDRY_ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0PAR_SUNDRY_ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0PAR_SUNDRY_ITM.itm_sub3))
								.and(S0T1.sno1.eq(S0PAR_SUNDRY_ITM.sno1))
								.and(S0T1.sno2.eq(S0PAR_SUNDRY_ITM.sno2))
								.and(S0T1.sno3.eq(S0PAR_SUNDRY_ITM.sno3))
								.and(S0T1.sno4.eq(S0PAR_SUNDRY_ITM.sno4))
							)
							.addDynamicView(core)
							.innerJoin(S0T2).on(
								S0T2.calc_no.eq(S0T1.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T1.calc_grp_cd))
								.and(S0T2.ym.eq(S0T1.ym))
								.and(S0T2.par_itm_cd.eq(S0T1.itm_cd))
								.and(S0T2.par_itm_sub1.eq(S0T1.itm_sub1))
								.and(S0T2.par_itm_sub2.eq(S0T1.itm_sub2))
								.and(S0T2.par_itm_sub3.eq(S0T1.itm_sub3))
								.and(S0T2.itm_mfg_inst_no.eq(S0T1.itm_mfg_inst_no))
								.and(S0T2.mfg_act_no.eq(S0T1.mfg_act_no))
								.and(S0T2.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
							)

							.leftOuterJoin(S0CHD_ITM).on(
								S0T2.itm_cd.eq(S0CHD_ITM.itm_cd)
								.and(S0T2.itm_sub1.eq(S0CHD_ITM.itm_sub1))
								.and(S0T2.itm_sub2.eq(S0CHD_ITM.itm_sub2))
								.and(S0T2.itm_sub3.eq(S0CHD_ITM.itm_sub3))
							)
							.leftOuterJoin(S0CHD_SUNDRY_ITM).on(
								S0T2.itm_cd.eq(S0CHD_SUNDRY_ITM.itm_cd)
								.and(S0T2.itm_sub1.eq(S0CHD_SUNDRY_ITM.itm_sub1))
								.and(S0T2.itm_sub2.eq(S0CHD_SUNDRY_ITM.itm_sub2))
								.and(S0T2.itm_sub3.eq(S0CHD_SUNDRY_ITM.itm_sub3))
								.and(S0T2.sno1.eq(S0CHD_SUNDRY_ITM.sno1))
								.and(S0T2.sno2.eq(S0CHD_SUNDRY_ITM.sno2))
								.and(S0T2.sno3.eq(S0CHD_SUNDRY_ITM.sno3))
								.and(S0T2.sno4.eq(S0CHD_SUNDRY_ITM.sno4))
							)
							.addDynamicView(chdCore)
							.leftOuterJoin(S0T3).on(
								S0T2.calc_no.eq(S0T3.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T3.calc_grp_cd))
								.and(S0T2.top_rec_no.eq(S0T3.top_rec_no))
								.and(
									nvl(
										S0T3.expns_typ,
										value(MAC_EXPNS_TYP.PROD.value())
									).eq(value(MAC_EXPNS_TYP.PROD.value()))
								)
							)
							.leftOuterJoin(S0EXPNS).on(S0T3.expns_cd.eq(S0EXPNS.expns_cd))
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T1.calc_no.like(bind("calc_no")))
							.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.cutoff$and(S0T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0T1.ym.eq(bind("ym")))
							.cutoff$and(S0PAR_ITM.itm_typ.like(bind("par_itm_typ")))
							.cutoff$and(S0PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
							.cutoff$and(S0PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
							.cutoff$and(S0T1.itm_cd.like(bind("par_itm_cd")))
							.cutoff$and(S0T1.itm_sub1.like(bind("par_itm_sub1")))
							.cutoff$and(S0T1.itm_sub2.like(bind("par_itm_sub2")))
							.cutoff$and(S0T1.itm_sub3.like(bind("par_itm_sub3")))
							.cutoff$and(
								nvl(
									S0PAR_SUNDRY_ITM.itm_nm,
									S0PAR_ITM.itm_nm
								).like(bind("par_itm_nm"))
							)
							.cutoff$and(S0T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S0T1.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S0T1.lot_no.like(bind("par_lot_no")))
							.cutoff$and(S0T1.sublot_no.like(bind("par_sublot_no")))
							.cutoff$and(S0T1.sno1.like(bind("par_sno1")))
							.cutoff$and(S0T1.sno2.like(bind("par_sno2")))
							.cutoff$and(S0T1.sno3.like(bind("par_sno3")))
							.cutoff$and(S0T1.sno4.like(bind("par_sno4")))
							.cutoff$and(S0T1.asst_typ.like(bind("par_asst_typ")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9")))
							.cutoff$and(S0PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10")))
							.cutoff$and(S0T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S0T1.po_no.like(bind("po_no")))
							.cutoff$and(S0T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S0T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S0T2.mng_dpt_cd.like(bind("inpt_dpt_cd")))
							.cutoff$and(S0CHD_ITM.itm_typ.like(bind("chd_itm_typ")))
							.cutoff$and(S0CHD_ITM.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
							.cutoff$and(S0CHD_ITM.itm_jnl_cd.like(bind("chd_itm_jnl_cd")))
							.cutoff$and(S0T2.itm_cd.like(bind("chd_itm_cd")))
							.cutoff$and(S0T2.itm_sub1.like(bind("chd_itm_sub1")))
							.cutoff$and(S0T2.itm_sub2.like(bind("chd_itm_sub2")))
							.cutoff$and(S0T2.itm_sub3.like(bind("chd_itm_sub3")))
							.cutoff$and(
								nvl(
									S0CHD_SUNDRY_ITM.itm_nm,
									S0CHD_ITM.itm_nm
								).like(bind("chd_itm_nm"))
							)
							.cutoff$and(S0T2.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S0T2.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S0T2.lot_no.like(bind("chd_lot_no")))
							.cutoff$and(S0T2.sublot_no.like(bind("chd_sublot_no")))
							.cutoff$and(S0T2.sno1.like(bind("chd_sno1")))
							.cutoff$and(S0T2.sno2.like(bind("chd_sno2")))
							.cutoff$and(S0T2.sno3.like(bind("chd_sno3")))
							.cutoff$and(S0T2.sno4.like(bind("chd_sno4")))
							.cutoff$and(S0T2.asst_typ.like(bind("chd_asst_typ")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd1.like(bind("chd_itm_grp_cd1")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd2.like(bind("chd_itm_grp_cd2")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd3.like(bind("chd_itm_grp_cd3")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd4.like(bind("chd_itm_grp_cd4")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd5.like(bind("chd_itm_grp_cd5")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd6.like(bind("chd_itm_grp_cd6")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd7.like(bind("chd_itm_grp_cd7")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd8.like(bind("chd_itm_grp_cd8")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd9.like(bind("chd_itm_grp_cd9")))
							.cutoff$and(S0CHD_ITM.itm_grp_cd10.like(bind("chd_itm_grp_cd10")))
							.cutoff$and(S0T2.mfg_purc_typ.like(bind("mfg_purc_typ")))
							.cutoff$and(
								bind("chd_asst_typ_cnd").eq(value(true))
								.and(
									S0T2.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.cutoff$and(S0T2.repurc_obli_flg.eq(bind("repurc_obli_flg")))
							.cutoff$and(S0T2.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
									.or(S0T2.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
							.cutoff$and(S0T2.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S0T2.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S0T2.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S0T2.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S0T2.oper_act_no.like(bind("oper_act_no")))
							.cutoff$and(S0T2.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S0T2.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S0T2.rec_eval_typ.like(bind("rec_eval_typ")))
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S0T2.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S0T2.bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_stk_bp_flg_str").eq(value(true))
								.and(S0T2.stk_bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_po_no_flg_str").eq(value(true))
								.and(S0T1.po_no.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S0T1.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S0T1.iv_no.isNull())
							)
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
				when(boundOr("wg_flg"))
					.select(core,S0T1.wg_cd.as("wg_cd"))
					.select(aggr,T.pr("wg_cd"))
					.groupBy(core,S0T1.wg_cd)
					.groupBy(aggr,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(boundOr("ym_flg"))
					.select(core,S0T1.ym.as("ym"))
					.select(aggr,T.pr("ym"))
					.groupBy(core,S0T1.ym)
					.groupBy(aggr,T.pr("ym"))
					.orderBy(T.pr("ym").asc()),
				when(boundOr("mng_dpt_flg"))
					.select(core,S0T1.mng_dpt_cd.as("mng_dpt_cd"))
					.select(aggr,T.pr("mng_dpt_cd"))
					.groupBy(core,S0T1.mng_dpt_cd)
					.groupBy(aggr,T.pr("mng_dpt_cd"))
					.orderBy(T.pr("mng_dpt_cd").asc()),
				when(boundOr("par_itm_typ_flg"))
					.select(core,S0PAR_ITM.itm_typ.as("par_itm_typ"))
					.select(aggr,T.pr("par_itm_typ"))
					.groupBy(core,S0PAR_ITM.itm_typ)
					.groupBy(aggr,T.pr("par_itm_typ"))
					.orderBy(T.pr("par_itm_typ").asc()),
				when(boundOr("par_itm_typ_d_flg"))
					.select(core,S0PAR_ITM.itm_typ_d_cd.as("par_itm_typ_d_cd"))
					.select(aggr,T.pr("par_itm_typ_d_cd"))
					.groupBy(core,S0PAR_ITM.itm_typ_d_cd)
					.groupBy(aggr,T.pr("par_itm_typ_d_cd"))
					.orderBy(T.pr("par_itm_typ_d_cd").asc()),
				when(boundOr("par_itm_jnl_flg"))
					.select(core,S0PAR_ITM.itm_jnl_cd.as("par_itm_jnl_cd"))
					.select(aggr,T.pr("par_itm_jnl_cd"))
					.groupBy(core,S0PAR_ITM.itm_jnl_cd)
					.groupBy(aggr,T.pr("par_itm_jnl_cd"))
					.orderBy(T.pr("par_itm_jnl_cd").asc()),
				when(boundOr("par_itm_flg"))
					.select(core,S0T1.itm_cd.as("par_itm_cd"))
					.select(aggr,T.pr("par_itm_cd"))
					.groupBy(core,S0T1.itm_cd)
					.groupBy(aggr,T.pr("par_itm_cd"))
					.orderBy(T.pr("par_itm_cd").asc()),
				when(boundOr("par_itm_flg"))
					.select(core,S0T1.itm_sub1.as("par_itm_sub1"))
					.select(aggr,T.pr("par_itm_sub1"))
					.groupBy(core,S0T1.itm_sub1)
					.groupBy(aggr,T.pr("par_itm_sub1"))
					.orderBy(T.pr("par_itm_sub1").asc()),
				when(boundOr("par_itm_flg"))
					.select(core,S0T1.itm_sub2.as("par_itm_sub2"))
					.select(aggr,T.pr("par_itm_sub2"))
					.groupBy(core,S0T1.itm_sub2)
					.groupBy(aggr,T.pr("par_itm_sub2"))
					.orderBy(T.pr("par_itm_sub2").asc()),
				when(boundOr("par_itm_flg"))
					.select(core,S0T1.itm_sub3.as("par_itm_sub3"))
					.select(aggr,T.pr("par_itm_sub3"))
					.groupBy(core,S0T1.itm_sub3)
					.groupBy(aggr,T.pr("par_itm_sub3"))
					.orderBy(T.pr("par_itm_sub3").asc()),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(core,S0T1.itm_mfg_inst_no.as("itm_mfg_inst_no"))
					.select(aggr,T.pr("itm_mfg_inst_no"))
					.groupBy(core,S0T1.itm_mfg_inst_no)
					.groupBy(aggr,T.pr("itm_mfg_inst_no"))
					.orderBy(T.pr("itm_mfg_inst_no").asc()),
				when(boundOr("mfg_act_no_flg"))
					.select(core,S0T1.mfg_act_no.as("mfg_act_no"))
					.select(aggr,T.pr("mfg_act_no"))
					.groupBy(core,S0T1.mfg_act_no)
					.groupBy(aggr,T.pr("mfg_act_no"))
					.orderBy(T.pr("mfg_act_no").asc()),
				when(boundOr("par_lot_flg"))
					.select(core,S0T1.lot_no.as("par_lot_no"))
					.select(aggr,T.pr("par_lot_no"))
					.groupBy(core,S0T1.lot_no)
					.groupBy(aggr,T.pr("par_lot_no"))
					.orderBy(T.pr("par_lot_no").asc()),
				when(boundOr("par_sublot_flg"))
					.select(core,S0T1.sublot_no.as("par_sublot_no"))
					.select(aggr,T.pr("par_sublot_no"))
					.groupBy(core,S0T1.sublot_no)
					.groupBy(aggr,T.pr("par_sublot_no"))
					.orderBy(T.pr("par_sublot_no").asc()),
				when(boundOr("par_sno1_flg"))
					.select(core,S0T1.sno1.as("par_sno1"))
					.select(aggr,T.pr("par_sno1"))
					.groupBy(core,S0T1.sno1)
					.groupBy(aggr,T.pr("par_sno1"))
					.orderBy(T.pr("par_sno1").asc()),
				when(boundOr("par_sno2_flg"))
					.select(core,S0T1.sno2.as("par_sno2"))
					.select(aggr,T.pr("par_sno2"))
					.groupBy(core,S0T1.sno2)
					.groupBy(aggr,T.pr("par_sno2"))
					.orderBy(T.pr("par_sno2").asc()),
				when(boundOr("par_sno3_flg"))
					.select(core,S0T1.sno3.as("par_sno3"))
					.select(aggr,T.pr("par_sno3"))
					.groupBy(core,S0T1.sno3)
					.groupBy(aggr,T.pr("par_sno3"))
					.orderBy(T.pr("par_sno3").asc()),
				when(boundOr("par_sno4_flg"))
					.select(core,S0T1.sno4.as("par_sno4"))
					.select(aggr,T.pr("par_sno4"))
					.groupBy(core,S0T1.sno4)
					.groupBy(aggr,T.pr("par_sno4"))
					.orderBy(T.pr("par_sno4").asc()),
				when(boundOr("par_asst_typ_flg"))
					.select(core,S0T1.asst_typ.as("par_asst_typ"))
					.select(aggr,T.pr("par_asst_typ"))
					.groupBy(core,S0T1.asst_typ)
					.groupBy(aggr,T.pr("par_asst_typ"))
					.orderBy(T.pr("par_asst_typ").asc()),
				when(boundOr("bp_flg"))
					.select(core,S0T1.bp_cd.as("bp_cd"))
					.select(aggr,T.pr("bp_cd"))
					.groupBy(core,S0T1.bp_cd)
					.groupBy(aggr,T.pr("bp_cd"))
					.orderBy(T.pr("bp_cd").asc()),
				when(boundOr("bp_flg","bp_nm","cntry_cd","cntry_nm","area_cd","area_nm","bp_grp_cd1","bp_grp_cd2","bp_grp_cd3","bp_grp_cd4","bp_grp_cd5","bp_grp_cd6","bp_grp_cd7","bp_grp_cd8","bp_grp_cd9","bp_grp_cd10","bp_grp_nm1","bp_grp_nm2","bp_grp_nm3","bp_grp_nm4","bp_grp_nm5","bp_grp_nm6","bp_grp_nm7","bp_grp_nm8","bp_grp_nm9","bp_grp_nm10","cntry_flg","area_flg","bp_grp_flg1","bp_grp_flg2","bp_grp_flg3","bp_grp_flg4","bp_grp_flg5","bp_grp_flg6","bp_grp_flg7","bp_grp_flg8","bp_grp_flg9","bp_grp_flg10"))
					.view(core, v -> v.leftOuterJoin(BP).on(S0T1.bp_cd.eq(BP.bp_cd))),
				when(boundOr("cntry_flg"))
					.select(core,BP.cntry_cd.as("cntry_cd"))
					.select(aggr,T.pr("cntry_cd"))
					.groupBy(core,BP.cntry_cd)
					.groupBy(aggr,T.pr("cntry_cd"))
					.orderBy(T.pr("cntry_cd").asc()),
				when(boundOr("cntry_flg","cntry_cd"))
					.predicate(core, p -> p.cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD")))),
				when(boundOr("area_flg"))
					.select(core,BP.area_cd.as("area_cd"))
					.select(aggr,T.pr("area_cd"))
					.groupBy(core,BP.area_cd)
					.groupBy(aggr,T.pr("area_cd"))
					.orderBy(T.pr("area_cd").asc()),
				when(boundOr("area_flg","area_cd"))
					.predicate(core, p -> p.cutoff$and(BP.area_cd.like(bind("AREA_CD")))),
				when(boundOr("po_no_flg"))
					.select(core,S0T1.po_no.as("po_no"))
					.select(aggr,T.pr("po_no"))
					.groupBy(core,S0T1.po_no)
					.groupBy(aggr,T.pr("po_no"))
					.orderBy(T.pr("po_no").asc()),
				when(boundOr("slo_no_flg"))
					.select(core,S0T1.slo_no.as("slo_no"))
					.select(aggr,T.pr("slo_no"))
					.groupBy(core,S0T1.slo_no)
					.groupBy(aggr,T.pr("slo_no"))
					.orderBy(T.pr("slo_no").asc()),
				when(boundOr("iv_no_flg"))
					.select(core,S0T1.iv_no.as("iv_no"))
					.select(aggr,T.pr("iv_no"))
					.groupBy(core,S0T1.iv_no)
					.groupBy(aggr,T.pr("iv_no"))
					.orderBy(T.pr("iv_no").asc()),
				when(boundOr("comp_qty_flg"))
					.select(core,S0PAR_ITM.unit_cd.as("par_unit_cd"))
					.select(aggr,T.pr("par_unit_cd"))
					.groupBy(core,S0PAR_ITM.unit_cd)
					.groupBy(aggr,T.pr("par_unit_cd"))
					.orderBy(T.pr("par_unit_cd").asc()),
				when(boundOr("inpt_dpt_flg"))
					.select(core,S0T2.mng_dpt_cd.as("inpt_dpt_cd"))
					.select(aggr,T.pr("inpt_dpt_cd"))
					.groupBy(core,S0T2.mng_dpt_cd)
					.groupBy(aggr,T.pr("inpt_dpt_cd"))
					.orderBy(T.pr("inpt_dpt_cd").asc()),
				when(boundOr("chd_itm_typ_flg"))
					.select(core,S0CHD_ITM.itm_typ.as("chd_itm_typ"))
					.select(aggr,T.pr("chd_itm_typ"))
					.groupBy(core,S0CHD_ITM.itm_typ)
					.groupBy(aggr,T.pr("chd_itm_typ"))
					.orderBy(T.pr("chd_itm_typ").asc()),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(core,S0CHD_ITM.itm_typ_d_cd.as("chd_itm_typ_d_cd"))
					.select(aggr,T.pr("chd_itm_typ_d_cd"))
					.groupBy(core,S0CHD_ITM.itm_typ_d_cd)
					.groupBy(aggr,T.pr("chd_itm_typ_d_cd"))
					.orderBy(T.pr("chd_itm_typ_d_cd").asc()),
				when(boundOr("chd_itm_jnl_flg"))
					.select(core,S0CHD_ITM.itm_jnl_cd.as("chd_itm_jnl_cd"))
					.select(aggr,T.pr("chd_itm_jnl_cd"))
					.groupBy(core,S0CHD_ITM.itm_jnl_cd)
					.groupBy(aggr,T.pr("chd_itm_jnl_cd"))
					.orderBy(T.pr("chd_itm_jnl_cd").asc()),
				when(boundOr("chd_itm_flg"))
					.select(core,S0T2.itm_cd.as("chd_itm_cd"))
					.select(aggr,T.pr("chd_itm_cd"))
					.groupBy(core,S0T2.itm_cd)
					.groupBy(aggr,T.pr("chd_itm_cd"))
					.orderBy(T.pr("chd_itm_cd").asc()),
				when(boundOr("chd_itm_flg"))
					.select(core,S0T2.itm_sub1.as("chd_itm_sub1"))
					.select(aggr,T.pr("chd_itm_sub1"))
					.groupBy(core,S0T2.itm_sub1)
					.groupBy(aggr,T.pr("chd_itm_sub1"))
					.orderBy(T.pr("chd_itm_sub1").asc()),
				when(boundOr("chd_itm_flg"))
					.select(core,S0T2.itm_sub2.as("chd_itm_sub2"))
					.select(aggr,T.pr("chd_itm_sub2"))
					.groupBy(core,S0T2.itm_sub2)
					.groupBy(aggr,T.pr("chd_itm_sub2"))
					.orderBy(T.pr("chd_itm_sub2").asc()),
				when(boundOr("chd_itm_flg"))
					.select(core,S0T2.itm_sub3.as("chd_itm_sub3"))
					.select(aggr,T.pr("chd_itm_sub3"))
					.groupBy(core,S0T2.itm_sub3)
					.groupBy(aggr,T.pr("chd_itm_sub3"))
					.orderBy(T.pr("chd_itm_sub3").asc()),
				when(boundOr("chd_lot_flg"))
					.select(core,S0T2.lot_no.as("chd_lot_no"))
					.select(aggr,T.pr("chd_lot_no"))
					.groupBy(core,S0T2.lot_no)
					.groupBy(aggr,T.pr("chd_lot_no"))
					.orderBy(T.pr("chd_lot_no").asc()),
				when(boundOr("chd_sublot_flg"))
					.select(core,S0T2.sublot_no.as("chd_sublot_no"))
					.select(aggr,T.pr("chd_sublot_no"))
					.groupBy(core,S0T2.sublot_no)
					.groupBy(aggr,T.pr("chd_sublot_no"))
					.orderBy(T.pr("chd_sublot_no").asc()),
				when(boundOr("chd_sno1_flg"))
					.select(core,S0T2.sno1.as("chd_sno1"))
					.select(aggr,T.pr("chd_sno1"))
					.groupBy(core,S0T2.sno1)
					.groupBy(aggr,T.pr("chd_sno1"))
					.orderBy(T.pr("chd_sno1").asc()),
				when(boundOr("chd_sno2_flg"))
					.select(core,S0T2.sno2.as("chd_sno2"))
					.select(aggr,T.pr("chd_sno2"))
					.groupBy(core,S0T2.sno2)
					.groupBy(aggr,T.pr("chd_sno2"))
					.orderBy(T.pr("chd_sno2").asc()),
				when(boundOr("chd_sno3_flg"))
					.select(core,S0T2.sno3.as("chd_sno3"))
					.select(aggr,T.pr("chd_sno3"))
					.groupBy(core,S0T2.sno3)
					.groupBy(aggr,T.pr("chd_sno3"))
					.orderBy(T.pr("chd_sno3").asc()),
				when(boundOr("chd_sno4_flg"))
					.select(core,S0T2.sno4.as("chd_sno4"))
					.select(aggr,T.pr("chd_sno4"))
					.groupBy(core,S0T2.sno4)
					.groupBy(aggr,T.pr("chd_sno4"))
					.orderBy(T.pr("chd_sno4").asc()),
				when(boundOr("chd_asst_typ_flg"))
					.select(core,S0T2.asst_typ.as("chd_asst_typ"))
					.select(aggr,T.pr("chd_asst_typ"))
					.groupBy(core,S0T2.asst_typ)
					.groupBy(aggr,T.pr("chd_asst_typ"))
					.orderBy(T.pr("chd_asst_typ").asc()),
				when(boundOr("chd_asst_typ_flg"))
					.select(core,S0T2.repurc_obli_flg.as("repurc_obli_flg"))
					.select(aggr,T.pr("repurc_obli_flg"))
					.groupBy(core,S0T2.repurc_obli_flg)
					.groupBy(aggr,T.pr("repurc_obli_flg")),
				when(boundOr("loc_flg","loc_nm","site_cd","site_nm","site_flg"))
					.view(chdCore, v -> v.leftOuterJoin(LOC).on(S0T2.loc_cd.eq(LOC.loc_cd))),
				when(boundOr("site_flg"))
					.select(core,LOC.site_cd.as("site_cd"))
					.select(aggr,T.pr("site_cd"))
					.groupBy(core,LOC.site_cd)
					.groupBy(aggr,T.pr("site_cd"))
					.orderBy(T.pr("site_cd").asc()),
				when(boundOr("site_flg","site_cd"))
					.predicate(core, p -> p.cutoff$and(LOC.site_cd.like(bind("SITE_CD")))),
				when(boundOr("loc_flg"))
					.select(core,S0T2.loc_cd.as("loc_cd"))
					.select(aggr,T.pr("loc_cd"))
					.groupBy(core,S0T2.loc_cd)
					.groupBy(aggr,T.pr("loc_cd"))
					.orderBy(T.pr("loc_cd").asc()),
				when(boundOr("str_ln_flg"))
					.select(core,S0T2.str_ln_cd.as("str_ln_cd"))
					.select(aggr,T.pr("str_ln_cd"))
					.groupBy(core,S0T2.str_ln_cd)
					.groupBy(aggr,T.pr("str_ln_cd"))
					.orderBy(T.pr("str_ln_cd").asc()),
				when(boundOr("oper_act_no_flg"))
					.select(core,S0T2.oper_act_no.as("oper_act_no"))
					.select(aggr,T.pr("oper_act_no"))
					.groupBy(core,S0T2.oper_act_no)
					.groupBy(aggr,T.pr("oper_act_no"))
					.orderBy(T.pr("oper_act_no").asc()),
				when(boundOr("oper_flg"))
					.select(core,S0T2.oper_cd.as("oper_cd"))
					.select(aggr,T.pr("oper_cd"))
					.groupBy(core,S0T2.oper_cd)
					.groupBy(aggr,T.pr("oper_cd"))
					.orderBy(T.pr("oper_cd").asc()),
				when(boundOr("disp_oper_seq_flg"))
					.select(core,S0T2.oper_seq.as("oper_seq"))
					.select(aggr,T.pr("oper_seq"))
					.groupBy(core,S0T2.oper_seq)
					.groupBy(aggr,T.pr("oper_seq"))
					.orderBy(T.pr("oper_seq").asc()),
				when(boundOr("stk_bp_flg"))
					.select(core,S0T2.stk_bp_cd.as("stk_bp_cd"))
					.select(aggr,T.pr("stk_bp_cd"))
					.groupBy(core,S0T2.stk_bp_cd)
					.groupBy(aggr,T.pr("stk_bp_cd"))
					.orderBy(T.pr("stk_bp_cd").asc()),
				when(boundOr("ac_slip_typ_flg"))
					.select(core,S0T2.ac_slip_typ.as("ac_slip_typ"))
					.select(aggr,T.pr("ac_slip_typ"))
					.groupBy(core,S0T2.ac_slip_typ)
					.groupBy(aggr,T.pr("ac_slip_typ"))
					.orderBy(T.pr("ac_slip_typ").asc()),
				when(boundOr("ac_rsn_flg"))
					.select(core,S0T2.ac_rsn_cd.as("ac_rsn_cd"))
					.select(aggr,T.pr("ac_rsn_cd"))
					.groupBy(core,S0T2.ac_rsn_cd)
					.groupBy(aggr,T.pr("ac_rsn_cd"))
					.orderBy(T.pr("ac_rsn_cd").asc()),
				when(boundOr("rec_eval_typ_flg"))
					.select(core,S0T2.rec_eval_typ.as("rec_eval_typ"))
					.select(aggr,T.pr("rec_eval_typ"))
					.groupBy(core,S0T2.rec_eval_typ)
					.groupBy(aggr,T.pr("rec_eval_typ"))
					.orderBy(T.pr("rec_eval_typ").asc()),
				when(boundOr("mng_dpt_flg","mng_dpt_nm","inpt_dpt_flg","inpt_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T1.calc_no.eq(ARG.calc_no).and(S0T1.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				when(null)
					.select(aggr,T.pr("calc_grp_cd"))
					.groupBy(aggr,T.pr("calc_grp_cd")),
				when(boundOr("wg_flg"))
					.select(core,S0WG.wg_nm.as("wg_nm"))
					.select(aggr,T.pr("wg_nm"))
					.groupBy(core,S0WG.wg_nm)
					.groupBy(aggr,T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(core,MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.select(aggr,T.pr("mng_dpt_nm"))
					.groupBy(core,MNG_DPT.dpt_nm)
					.groupBy(aggr,T.pr("mng_dpt_nm")),
				when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(MNG_DPT).on(S0T1.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(ARG.term.eq(MNG_DPT.term))))
					.predicate(core, p -> p.cutoff$and(MNG_DPT.dpt_nm.like(bind("MNG_DPT_NM")))),
				when(boundOr("par_itm_flg"))
					.select(core,nvl(S0PAR_SUNDRY_ITM.itm_nm,S0PAR_ITM.itm_nm).as("par_itm_nm"))
					.select(aggr,T.pr("par_itm_nm"))
					.groupBy(core,nvl(S0PAR_SUNDRY_ITM.itm_nm,S0PAR_ITM.itm_nm))
					.groupBy(aggr,T.pr("par_itm_nm")),
				when(boundOr("par_itm_typ_d_flg"))
					.select(core,PAR_ITM_TYP_D.itm_typ_d_nm.as("par_itm_typ_d_nm"))
					.select(aggr,T.pr("par_itm_typ_d_nm"))
					.groupBy(core,PAR_ITM_TYP_D.itm_typ_d_nm)
					.groupBy(aggr,T.pr("par_itm_typ_d_nm")),
				when(boundOr("par_itm_typ_d_flg","par_itm_typ_d_nm"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_TYP_D).on(S0PAR_ITM.itm_typ.eq(PAR_ITM_TYP_D.itm_typ).and(S0PAR_ITM.itm_typ_d_cd.eq(PAR_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_TYP_D.itm_typ_d_nm.like(bind("PAR_ITM_TYP_D_NM")))),
				when(boundOr("par_itm_jnl_flg"))
					.select(core,PAR_ITM_JNL.itm_jnl_nm.as("par_itm_jnl_nm"))
					.select(aggr,T.pr("par_itm_jnl_nm"))
					.groupBy(core,PAR_ITM_JNL.itm_jnl_nm)
					.groupBy(aggr,T.pr("par_itm_jnl_nm")),
				when(boundOr("par_itm_jnl_flg","par_itm_jnl_nm"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_JNL).on(S0PAR_ITM.itm_jnl_cd.eq(PAR_ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_JNL.itm_jnl_nm.like(bind("PAR_ITM_JNL_NM")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(core,S0PAR_ITM.itm_grp_cd1.as("par_itm_grp_cd1"))
					.select(aggr,T.pr("par_itm_grp_cd1"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd1)
					.groupBy(aggr,T.pr("par_itm_grp_cd1")),
				when(boundOr("par_itm_grp_flg1"))
					.select(core,PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.select(aggr,T.pr("par_itm_grp_nm1"))
					.groupBy(core,PAR_ITM_GRP1.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm1")),
				when(boundOr("par_itm_grp_flg1","par_itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP1).on(S0PAR_ITM.itm_grp_cd1.eq(PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP1.itm_grp_nm.like(bind("PAR_ITM_GRP_NM1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(core,S0PAR_ITM.itm_grp_cd2.as("par_itm_grp_cd2"))
					.select(aggr,T.pr("par_itm_grp_cd2"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd2)
					.groupBy(aggr,T.pr("par_itm_grp_cd2")),
				when(boundOr("par_itm_grp_flg2"))
					.select(core,PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.select(aggr,T.pr("par_itm_grp_nm2"))
					.groupBy(core,PAR_ITM_GRP2.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm2")),
				when(boundOr("par_itm_grp_flg2","par_itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP2).on(S0PAR_ITM.itm_grp_cd2.eq(PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP2.itm_grp_nm.like(bind("PAR_ITM_GRP_NM2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(core,S0PAR_ITM.itm_grp_cd3.as("par_itm_grp_cd3"))
					.select(aggr,T.pr("par_itm_grp_cd3"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd3)
					.groupBy(aggr,T.pr("par_itm_grp_cd3")),
				when(boundOr("par_itm_grp_flg3"))
					.select(core,PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.select(aggr,T.pr("par_itm_grp_nm3"))
					.groupBy(core,PAR_ITM_GRP3.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm3")),
				when(boundOr("par_itm_grp_flg3","par_itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP3).on(S0PAR_ITM.itm_grp_cd3.eq(PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP3.itm_grp_nm.like(bind("PAR_ITM_GRP_NM3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(core,S0PAR_ITM.itm_grp_cd4.as("par_itm_grp_cd4"))
					.select(aggr,T.pr("par_itm_grp_cd4"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd4)
					.groupBy(aggr,T.pr("par_itm_grp_cd4")),
				when(boundOr("par_itm_grp_flg4"))
					.select(core,PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.select(aggr,T.pr("par_itm_grp_nm4"))
					.groupBy(core,PAR_ITM_GRP4.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm4")),
				when(boundOr("par_itm_grp_flg4","par_itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP4).on(S0PAR_ITM.itm_grp_cd4.eq(PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP4.itm_grp_nm.like(bind("PAR_ITM_GRP_NM4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(core,S0PAR_ITM.itm_grp_cd5.as("par_itm_grp_cd5"))
					.select(aggr,T.pr("par_itm_grp_cd5"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd5)
					.groupBy(aggr,T.pr("par_itm_grp_cd5")),
				when(boundOr("par_itm_grp_flg5"))
					.select(core,PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.select(aggr,T.pr("par_itm_grp_nm5"))
					.groupBy(core,PAR_ITM_GRP5.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm5")),
				when(boundOr("par_itm_grp_flg5","par_itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP5).on(S0PAR_ITM.itm_grp_cd5.eq(PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP5.itm_grp_nm.like(bind("PAR_ITM_GRP_NM5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(core,S0PAR_ITM.itm_grp_cd6.as("par_itm_grp_cd6"))
					.select(aggr,T.pr("par_itm_grp_cd6"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd6)
					.groupBy(aggr,T.pr("par_itm_grp_cd6")),
				when(boundOr("par_itm_grp_flg6"))
					.select(core,PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.select(aggr,T.pr("par_itm_grp_nm6"))
					.groupBy(core,PAR_ITM_GRP6.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm6")),
				when(boundOr("par_itm_grp_flg6","par_itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP6).on(S0PAR_ITM.itm_grp_cd6.eq(PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP6.itm_grp_nm.like(bind("PAR_ITM_GRP_NM6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(core,S0PAR_ITM.itm_grp_cd7.as("par_itm_grp_cd7"))
					.select(aggr,T.pr("par_itm_grp_cd7"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd7)
					.groupBy(aggr,T.pr("par_itm_grp_cd7")),
				when(boundOr("par_itm_grp_flg7"))
					.select(core,PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.select(aggr,T.pr("par_itm_grp_nm7"))
					.groupBy(core,PAR_ITM_GRP7.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm7")),
				when(boundOr("par_itm_grp_flg7","par_itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP7).on(S0PAR_ITM.itm_grp_cd7.eq(PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP7.itm_grp_nm.like(bind("PAR_ITM_GRP_NM7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(core,S0PAR_ITM.itm_grp_cd8.as("par_itm_grp_cd8"))
					.select(aggr,T.pr("par_itm_grp_cd8"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd8)
					.groupBy(aggr,T.pr("par_itm_grp_cd8")),
				when(boundOr("par_itm_grp_flg8"))
					.select(core,PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.select(aggr,T.pr("par_itm_grp_nm8"))
					.groupBy(core,PAR_ITM_GRP8.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm8")),
				when(boundOr("par_itm_grp_flg8","par_itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP8).on(S0PAR_ITM.itm_grp_cd8.eq(PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP8.itm_grp_nm.like(bind("PAR_ITM_GRP_NM8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(core,S0PAR_ITM.itm_grp_cd9.as("par_itm_grp_cd9"))
					.select(aggr,T.pr("par_itm_grp_cd9"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd9)
					.groupBy(aggr,T.pr("par_itm_grp_cd9")),
				when(boundOr("par_itm_grp_flg9"))
					.select(core,PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.select(aggr,T.pr("par_itm_grp_nm9"))
					.groupBy(core,PAR_ITM_GRP9.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm9")),
				when(boundOr("par_itm_grp_flg9","par_itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP9).on(S0PAR_ITM.itm_grp_cd9.eq(PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP9.itm_grp_nm.like(bind("PAR_ITM_GRP_NM9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(core,S0PAR_ITM.itm_grp_cd10.as("par_itm_grp_cd10"))
					.select(aggr,T.pr("par_itm_grp_cd10"))
					.groupBy(core,S0PAR_ITM.itm_grp_cd10)
					.groupBy(aggr,T.pr("par_itm_grp_cd10")),
				when(boundOr("par_itm_grp_flg10"))
					.select(core,PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.select(aggr,T.pr("par_itm_grp_nm10"))
					.groupBy(core,PAR_ITM_GRP10.itm_grp_nm)
					.groupBy(aggr,T.pr("par_itm_grp_nm10")),
				when(boundOr("par_itm_grp_flg10","par_itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(PAR_ITM_GRP10).on(S0PAR_ITM.itm_grp_cd10.eq(PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(PAR_ITM_GRP10.itm_grp_nm.like(bind("PAR_ITM_GRP_NM10")))),
				when(boundOr("bp_flg"))
					.select(core,BP.bp_nm.as("bp_nm"))
					.select(aggr,T.pr("bp_nm"))
					.groupBy(core,BP.bp_nm)
					.groupBy(aggr,T.pr("bp_nm")),
				when(boundOr("bp_flg","bp_nm"))
					.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM")))),
				when(boundOr("bp_grp_flg1"))
					.select(core,BP.bp_grp_cd1.as("bp_grp_cd1"))
					.select(aggr,T.pr("bp_grp_cd1"))
					.groupBy(core,BP.bp_grp_cd1)
					.groupBy(aggr,T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg1","bp_grp_cd1"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1")))),
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
				when(boundOr("bp_grp_flg2","bp_grp_cd2"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2")))),
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
				when(boundOr("bp_grp_flg3","bp_grp_cd3"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3")))),
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
				when(boundOr("bp_grp_flg4","bp_grp_cd4"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4")))),
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
				when(boundOr("bp_grp_flg5","bp_grp_cd5"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5")))),
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
				when(boundOr("bp_grp_flg6","bp_grp_cd6"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6")))),
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
				when(boundOr("bp_grp_flg7","bp_grp_cd7"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7")))),
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
				when(boundOr("bp_grp_flg8","bp_grp_cd8"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8")))),
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
				when(boundOr("bp_grp_flg9","bp_grp_cd9"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9")))),
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
				when(boundOr("bp_grp_flg10","bp_grp_cd10"))
					.predicate(core, p -> p.cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10")))),
				when(boundOr("bp_grp_flg10"))
					.select(core,BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.select(aggr,T.pr("bp_grp_nm10"))
					.groupBy(core,BP_GRP10.bp_grp_nm)
					.groupBy(aggr,T.pr("bp_grp_nm10")),
				when(boundOr("bp_grp_flg10","bp_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(BP_GRP10).on(BP.bp_grp_cd10.eq(BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(BP_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(BP_GRP10.bp_grp_nm.like(bind("BP_GRP_NM10")))),
				when(boundOr("cntry_flg"))
					.select(core,CNTRY.cntry_nm.as("cntry_nm"))
					.select(aggr,T.pr("cntry_nm"))
					.groupBy(core,CNTRY.cntry_nm)
					.groupBy(aggr,T.pr("cntry_nm")),
				when(boundOr("cntry_flg","cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CNTRY).on(BP.cntry_cd.eq(CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CNTRY.cntry_nm.like(bind("CNTRY_NM")))),
				when(boundOr("area_flg"))
					.select(core,AREA.area_nm.as("area_nm"))
					.select(aggr,T.pr("area_nm"))
					.groupBy(core,AREA.area_nm)
					.groupBy(aggr,T.pr("area_nm")),
				when(boundOr("area_flg","area_nm"))
					.view(core, v -> v.leftOuterJoin(AREA).on(BP.area_cd.eq(AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(AREA.area_nm.like(bind("AREA_NM")))),
				when(boundOr("comp_qty_flg"))
					.select(core,PAR_UNIT.unit_nm.as("par_unit_nm"))
					.select(aggr,T.pr("par_unit_nm"))
					.groupBy(core,PAR_UNIT.unit_nm)
					.groupBy(aggr,T.pr("par_unit_nm")),
				when(boundOr("comp_qty_flg"))
					.view(core, v -> v.leftOuterJoin(PAR_UNIT).on(S0PAR_ITM.unit_cd.eq(PAR_UNIT.unit_cd))),
				when(boundOr("comp_qty_flg"))
					.select(aggr,max(T.pr("par_dec_place")).as("par_dec_place")),
				when(boundOr("inpt_dpt_flg"))
					.select(core,INPT_DPT.dpt_nm.as("inpt_dpt_nm"))
					.select(aggr,T.pr("inpt_dpt_nm"))
					.groupBy(core,INPT_DPT.dpt_nm)
					.groupBy(aggr,T.pr("inpt_dpt_nm")),
				when(boundOr("inpt_dpt_flg","inpt_dpt_nm"))
					.view(chdCore, v -> v.leftOuterJoin(INPT_DPT).on(S0T2.mng_dpt_cd.eq(INPT_DPT.dpt_cd).and(ARG.term.eq(INPT_DPT.term))))
					.predicate(core, p -> p.cutoff$and(INPT_DPT.dpt_nm.like(bind("INPT_DPT_NM")))),
				when(boundOr("chd_itm_flg"))
					.select(core,nvl(S0CHD_SUNDRY_ITM.itm_nm,S0CHD_ITM.itm_nm).as("chd_itm_nm"))
					.select(aggr,T.pr("chd_itm_nm"))
					.groupBy(core,nvl(S0CHD_SUNDRY_ITM.itm_nm,S0CHD_ITM.itm_nm))
					.groupBy(aggr,T.pr("chd_itm_nm")),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(core,CHD_ITM_TYP_D.itm_typ_d_nm.as("chd_itm_typ_d_nm"))
					.select(aggr,T.pr("chd_itm_typ_d_nm"))
					.groupBy(core,CHD_ITM_TYP_D.itm_typ_d_nm)
					.groupBy(aggr,T.pr("chd_itm_typ_d_nm")),
				when(boundOr("chd_itm_typ_d_flg","chd_itm_typ_d_nm"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_TYP_D).on(S0CHD_ITM.itm_typ.eq(CHD_ITM_TYP_D.itm_typ).and(S0CHD_ITM.itm_typ_d_cd.eq(CHD_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_TYP_D.itm_typ_d_nm.like(bind("CHD_ITM_TYP_D_NM")))),
				when(boundOr("chd_itm_jnl_flg"))
					.select(core,CHD_ITM_JNL.itm_jnl_nm.as("chd_itm_jnl_nm"))
					.select(aggr,T.pr("chd_itm_jnl_nm"))
					.groupBy(core,CHD_ITM_JNL.itm_jnl_nm)
					.groupBy(aggr,T.pr("chd_itm_jnl_nm")),
				when(boundOr("chd_itm_jnl_flg","chd_itm_jnl_nm"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_JNL).on(S0CHD_ITM.itm_jnl_cd.eq(CHD_ITM_JNL.itm_jnl_cd)))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_JNL.itm_jnl_nm.like(bind("CHD_ITM_JNL_NM")))),
				when(boundOr("chd_itm_grp_flg1"))
					.select(core,S0CHD_ITM.itm_grp_cd1.as("chd_itm_grp_cd1"))
					.select(aggr,T.pr("chd_itm_grp_cd1"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd1)
					.groupBy(aggr,T.pr("chd_itm_grp_cd1")),
				when(boundOr("chd_itm_grp_flg1"))
					.select(core,CHD_ITM_GRP1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.select(aggr,T.pr("chd_itm_grp_nm1"))
					.groupBy(core,CHD_ITM_GRP1.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm1")),
				when(boundOr("chd_itm_grp_flg1","chd_itm_grp_nm1"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP1).on(S0CHD_ITM.itm_grp_cd1.eq(CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP1.itm_grp_nm.like(bind("CHD_ITM_GRP_NM1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(core,S0CHD_ITM.itm_grp_cd2.as("chd_itm_grp_cd2"))
					.select(aggr,T.pr("chd_itm_grp_cd2"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd2)
					.groupBy(aggr,T.pr("chd_itm_grp_cd2")),
				when(boundOr("chd_itm_grp_flg2"))
					.select(core,CHD_ITM_GRP2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.select(aggr,T.pr("chd_itm_grp_nm2"))
					.groupBy(core,CHD_ITM_GRP2.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm2")),
				when(boundOr("chd_itm_grp_flg2","chd_itm_grp_nm2"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP2).on(S0CHD_ITM.itm_grp_cd2.eq(CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP2.itm_grp_nm.like(bind("CHD_ITM_GRP_NM2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(core,S0CHD_ITM.itm_grp_cd3.as("chd_itm_grp_cd3"))
					.select(aggr,T.pr("chd_itm_grp_cd3"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd3)
					.groupBy(aggr,T.pr("chd_itm_grp_cd3")),
				when(boundOr("chd_itm_grp_flg3"))
					.select(core,CHD_ITM_GRP3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.select(aggr,T.pr("chd_itm_grp_nm3"))
					.groupBy(core,CHD_ITM_GRP3.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm3")),
				when(boundOr("chd_itm_grp_flg3","chd_itm_grp_nm3"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP3).on(S0CHD_ITM.itm_grp_cd3.eq(CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP3.itm_grp_nm.like(bind("CHD_ITM_GRP_NM3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(core,S0CHD_ITM.itm_grp_cd4.as("chd_itm_grp_cd4"))
					.select(aggr,T.pr("chd_itm_grp_cd4"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd4)
					.groupBy(aggr,T.pr("chd_itm_grp_cd4")),
				when(boundOr("chd_itm_grp_flg4"))
					.select(core,CHD_ITM_GRP4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.select(aggr,T.pr("chd_itm_grp_nm4"))
					.groupBy(core,CHD_ITM_GRP4.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm4")),
				when(boundOr("chd_itm_grp_flg4","chd_itm_grp_nm4"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP4).on(S0CHD_ITM.itm_grp_cd4.eq(CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP4.itm_grp_nm.like(bind("CHD_ITM_GRP_NM4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(core,S0CHD_ITM.itm_grp_cd5.as("chd_itm_grp_cd5"))
					.select(aggr,T.pr("chd_itm_grp_cd5"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd5)
					.groupBy(aggr,T.pr("chd_itm_grp_cd5")),
				when(boundOr("chd_itm_grp_flg5"))
					.select(core,CHD_ITM_GRP5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.select(aggr,T.pr("chd_itm_grp_nm5"))
					.groupBy(core,CHD_ITM_GRP5.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm5")),
				when(boundOr("chd_itm_grp_flg5","chd_itm_grp_nm5"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP5).on(S0CHD_ITM.itm_grp_cd5.eq(CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP5.itm_grp_nm.like(bind("CHD_ITM_GRP_NM5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(core,S0CHD_ITM.itm_grp_cd6.as("chd_itm_grp_cd6"))
					.select(aggr,T.pr("chd_itm_grp_cd6"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd6)
					.groupBy(aggr,T.pr("chd_itm_grp_cd6")),
				when(boundOr("chd_itm_grp_flg6"))
					.select(core,CHD_ITM_GRP6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.select(aggr,T.pr("chd_itm_grp_nm6"))
					.groupBy(core,CHD_ITM_GRP6.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm6")),
				when(boundOr("chd_itm_grp_flg6","chd_itm_grp_nm6"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP6).on(S0CHD_ITM.itm_grp_cd6.eq(CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP6.itm_grp_nm.like(bind("CHD_ITM_GRP_NM6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(core,S0CHD_ITM.itm_grp_cd7.as("chd_itm_grp_cd7"))
					.select(aggr,T.pr("chd_itm_grp_cd7"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd7)
					.groupBy(aggr,T.pr("chd_itm_grp_cd7")),
				when(boundOr("chd_itm_grp_flg7"))
					.select(core,CHD_ITM_GRP7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.select(aggr,T.pr("chd_itm_grp_nm7"))
					.groupBy(core,CHD_ITM_GRP7.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm7")),
				when(boundOr("chd_itm_grp_flg7","chd_itm_grp_nm7"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP7).on(S0CHD_ITM.itm_grp_cd7.eq(CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP7.itm_grp_nm.like(bind("CHD_ITM_GRP_NM7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(core,S0CHD_ITM.itm_grp_cd8.as("chd_itm_grp_cd8"))
					.select(aggr,T.pr("chd_itm_grp_cd8"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd8)
					.groupBy(aggr,T.pr("chd_itm_grp_cd8")),
				when(boundOr("chd_itm_grp_flg8"))
					.select(core,CHD_ITM_GRP8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.select(aggr,T.pr("chd_itm_grp_nm8"))
					.groupBy(core,CHD_ITM_GRP8.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm8")),
				when(boundOr("chd_itm_grp_flg8","chd_itm_grp_nm8"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP8).on(S0CHD_ITM.itm_grp_cd8.eq(CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP8.itm_grp_nm.like(bind("CHD_ITM_GRP_NM8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(core,S0CHD_ITM.itm_grp_cd9.as("chd_itm_grp_cd9"))
					.select(aggr,T.pr("chd_itm_grp_cd9"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd9)
					.groupBy(aggr,T.pr("chd_itm_grp_cd9")),
				when(boundOr("chd_itm_grp_flg9"))
					.select(core,CHD_ITM_GRP9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.select(aggr,T.pr("chd_itm_grp_nm9"))
					.groupBy(core,CHD_ITM_GRP9.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm9")),
				when(boundOr("chd_itm_grp_flg9","chd_itm_grp_nm9"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP9).on(S0CHD_ITM.itm_grp_cd9.eq(CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP9.itm_grp_nm.like(bind("CHD_ITM_GRP_NM9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(core,S0CHD_ITM.itm_grp_cd10.as("chd_itm_grp_cd10"))
					.select(aggr,T.pr("chd_itm_grp_cd10"))
					.groupBy(core,S0CHD_ITM.itm_grp_cd10)
					.groupBy(aggr,T.pr("chd_itm_grp_cd10")),
				when(boundOr("chd_itm_grp_flg10"))
					.select(core,CHD_ITM_GRP10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.select(aggr,T.pr("chd_itm_grp_nm10"))
					.groupBy(core,CHD_ITM_GRP10.itm_grp_nm)
					.groupBy(aggr,T.pr("chd_itm_grp_nm10")),
				when(boundOr("chd_itm_grp_flg10","chd_itm_grp_nm10"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_ITM_GRP10).on(S0CHD_ITM.itm_grp_cd10.eq(CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CHD_ITM_GRP10.itm_grp_nm.like(bind("CHD_ITM_GRP_NM10")))),
				when(boundOr("site_flg"))
					.select(core,SITE.site_nm.as("site_nm"))
					.select(aggr,T.pr("site_nm"))
					.groupBy(core,SITE.site_nm)
					.groupBy(aggr,T.pr("site_nm")),
				when(boundOr("site_flg","site_nm"))
					.view(chdCore, v -> v.leftOuterJoin(SITE).on(LOC.site_cd.eq(SITE.site_cd)))
					.predicate(core, p -> p.cutoff$and(SITE.site_nm.like(bind("SITE_NM")))),
				when(boundOr("loc_flg"))
					.select(core,LOC.loc_nm.as("loc_nm"))
					.select(aggr,T.pr("loc_nm"))
					.groupBy(core,LOC.loc_nm)
					.groupBy(aggr,T.pr("loc_nm")),
				when(boundOr("loc_flg","loc_nm"))
					.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM")))),
				when(boundOr("str_ln_flg"))
					.select(core,STR_LN.str_ln_nm.as("str_ln_nm"))
					.select(aggr,T.pr("str_ln_nm"))
					.groupBy(core,STR_LN.str_ln_nm)
					.groupBy(aggr,T.pr("str_ln_nm")),
				when(boundOr("str_ln_flg","str_ln_nm"))
					.view(chdCore, v -> v.leftOuterJoin(STR_LN).on(S0T2.str_ln_cd.eq(STR_LN.str_ln_cd).and(S0T2.loc_cd.eq(STR_LN.loc_cd))))
					.predicate(core, p -> p.cutoff$and(STR_LN.str_ln_nm.like(bind("STR_LN_NM")))),
				when(boundOr("oper_flg"))
					.select(core,OPER.oper_nm.as("oper_nm"))
					.select(aggr,T.pr("oper_nm"))
					.groupBy(core,OPER.oper_nm)
					.groupBy(aggr,T.pr("oper_nm")),
				when(boundOr("oper_flg","oper_nm"))
					.view(chdCore, v -> v.leftOuterJoin(OPER).on(S0T2.oper_cd.eq(OPER.oper_cd)))
					.predicate(core, p -> p.cutoff$and(OPER.oper_nm.like(bind("OPER_NM")))),
				when(boundOr("stk_bp_flg"))
					.select(core,STK_BP.bp_nm.as("stk_bp_nm"))
					.select(aggr,T.pr("stk_bp_nm"))
					.groupBy(core,STK_BP.bp_nm)
					.groupBy(aggr,T.pr("stk_bp_nm")),
				when(boundOr("stk_bp_flg","stk_bp_nm"))
					.view(chdCore, v -> v.leftOuterJoin(STK_BP).on(S0T2.stk_bp_cd.eq(STK_BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(STK_BP.bp_nm.like(bind("STK_BP_NM")))),
				when(boundOr("ac_rsn_flg"))
					.select(core,AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
					.select(aggr,T.pr("ac_rsn_nm"))
					.groupBy(core,AC_RSN.ac_rsn_nm)
					.groupBy(aggr,T.pr("ac_rsn_nm")),
				when(boundOr("ac_rsn_flg","ac_rsn_nm"))
					.view(chdCore, v -> v.leftOuterJoin(AC_RSN).on(S0T2.ac_rsn_cd.eq(AC_RSN.ac_rsn_cd)))
					.predicate(core, p -> p.cutoff$and(AC_RSN.ac_rsn_nm.like(bind("AC_RSN_NM")))),
				when(boundOr("qty_flg"))
					.select(core,S0CHD_ITM.unit_cd.as("unit_cd"))
					.select(aggr,T.pr("unit_cd"))
					.groupBy(core,S0CHD_ITM.unit_cd)
					.groupBy(aggr,T.pr("unit_cd")),
				when(boundOr("qty_flg"))
					.select(core,CHD_UNIT.unit_nm.as("unit_nm"))
					.select(aggr,T.pr("unit_nm"))
					.groupBy(core,CHD_UNIT.unit_nm)
					.groupBy(aggr,T.pr("unit_nm")),
				when(boundOr("qty_flg"))
					.view(chdCore, v -> v.leftOuterJoin(CHD_UNIT).on(S0CHD_ITM.unit_cd.eq(CHD_UNIT.unit_cd))),
				when(boundOr("qty_flg"))
					.select(aggr,max(T.pr("dec_place")).as("dec_place")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).subtract(nvl(sum(T.pr("act_cost")),value(0))).as("amt_diff")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost")),
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
	 * -- MGBFL0090_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0090_MGT_ACC_TOP_S02() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_TOP_R S1_T2 = MGT_ACC_TOP_R.create("T2");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_SUNDRY_ITM_R S1_PAR_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("PAR_SUNDRY_ITM");
		MAM_ITM_R S1_CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_SUNDRY_ITM_R S1_CHD_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("CHD_SUNDRY_ITM");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R S1_PAR_ITM_TYP_D = MAM_ITM_TYP_D_R.create("PAR_ITM_TYP_D");
		MAM_ITM_JNL_R S1_PAR_ITM_JNL = MAM_ITM_JNL_R.create("PAR_ITM_JNL");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
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
		MAM_COST_DPT_R S1_INPT_DPT = MAM_COST_DPT_R.create("INPT_DPT");
		MAM_ITM_TYP_D_R S1_CHD_ITM_TYP_D = MAM_ITM_TYP_D_R.create("CHD_ITM_TYP_D");
		MAM_ITM_JNL_R S1_CHD_ITM_JNL = MAM_ITM_JNL_R.create("CHD_ITM_JNL");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP1 = MAM_ITM_GRP_R.create("CHD_ITM_GRP1");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP2 = MAM_ITM_GRP_R.create("CHD_ITM_GRP2");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP3 = MAM_ITM_GRP_R.create("CHD_ITM_GRP3");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP4 = MAM_ITM_GRP_R.create("CHD_ITM_GRP4");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP5 = MAM_ITM_GRP_R.create("CHD_ITM_GRP5");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP6 = MAM_ITM_GRP_R.create("CHD_ITM_GRP6");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP7 = MAM_ITM_GRP_R.create("CHD_ITM_GRP7");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP8 = MAM_ITM_GRP_R.create("CHD_ITM_GRP8");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP9 = MAM_ITM_GRP_R.create("CHD_ITM_GRP9");
		MAM_ITM_GRP_R S1_CHD_ITM_GRP10 = MAM_ITM_GRP_R.create("CHD_ITM_GRP10");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_STK_BP = MAM_BP_R.create("STK_BP");
		MAM_AC_RSN_R S1_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MGT_ARG_R S1_ARG = MGT_ARG_R.create("ARG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0090_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T2.qty,
							S1_T2.so_act_amt,
							nvl(
								S1_T2.std_upri,
								value(0)
							).as("std_upri"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T1
							.innerJoin(S1_WG).on(S1_T1.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_PAR_ITM).on(
								S1_T1.itm_cd.eq(S1_PAR_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_PAR_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_PAR_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_PAR_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_PAR_SUNDRY_ITM).on(
								S1_T1.itm_cd.eq(S1_PAR_SUNDRY_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_PAR_SUNDRY_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_PAR_SUNDRY_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_PAR_SUNDRY_ITM.itm_sub3))
								.and(S1_T1.sno1.eq(S1_PAR_SUNDRY_ITM.sno1))
								.and(S1_T1.sno2.eq(S1_PAR_SUNDRY_ITM.sno2))
								.and(S1_T1.sno3.eq(S1_PAR_SUNDRY_ITM.sno3))
								.and(S1_T1.sno4.eq(S1_PAR_SUNDRY_ITM.sno4))
							)
							.addDynamicView(DS1D)
							.innerJoin(S1_T2).on(
								S1_T2.calc_no.eq(S1_T1.calc_no)
								.and(S1_T2.calc_grp_cd.eq(S1_T1.calc_grp_cd))
								.and(S1_T2.ym.eq(S1_T1.ym))
								.and(S1_T2.par_itm_cd.eq(S1_T1.itm_cd))
								.and(S1_T2.par_itm_sub1.eq(S1_T1.itm_sub1))
								.and(S1_T2.par_itm_sub2.eq(S1_T1.itm_sub2))
								.and(S1_T2.par_itm_sub3.eq(S1_T1.itm_sub3))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no))
								.and(S1_T2.mfg_act_no.eq(S1_T1.mfg_act_no))
							)
							.leftOuterJoin(S1_CHD_ITM).on(
								S1_T2.itm_cd.eq(S1_CHD_ITM.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_CHD_ITM.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_CHD_ITM.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_CHD_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_CHD_SUNDRY_ITM).on(
								S1_T2.itm_cd.eq(S1_CHD_SUNDRY_ITM.itm_cd)
								.and(S1_T2.itm_sub1.eq(S1_CHD_SUNDRY_ITM.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_CHD_SUNDRY_ITM.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_CHD_SUNDRY_ITM.itm_sub3))
								.and(S1_T2.sno1.eq(S1_CHD_SUNDRY_ITM.sno1))
								.and(S1_T2.sno2.eq(S1_CHD_SUNDRY_ITM.sno2))
								.and(S1_T2.sno3.eq(S1_CHD_SUNDRY_ITM.sno3))
								.and(S1_T2.sno4.eq(S1_CHD_SUNDRY_ITM.sno4))
							)
							.addDynamicView(DS2D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.calc_no.like(bind("calc_no")))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.and(S1_T2.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T1.ym.eq(bind("ym")))
							.cutoff$and(S1_PAR_ITM.itm_typ.like(bind("par_itm_typ")))
							.cutoff$and(S1_PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
							.cutoff$and(S1_PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("par_itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("par_itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("par_itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("par_itm_sub3")))
							.cutoff$and(
								nvl(
									S1_PAR_SUNDRY_ITM.itm_nm,
									S1_PAR_ITM.itm_nm
								).like(bind("par_itm_nm"))
							)
							.cutoff$and(S1_T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T1.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("par_lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("par_sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("par_sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("par_sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("par_sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("par_sno4")))
							.cutoff$and(S1_T1.asst_typ.like(bind("par_asst_typ")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10")))
							.cutoff$and(S1_T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T1.po_no.like(bind("po_no")))
							.cutoff$and(S1_T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T2.mng_dpt_cd.like(bind("inpt_dpt_cd")))
							.cutoff$and(S1_CHD_ITM.itm_typ.like(bind("chd_itm_typ")))
							.cutoff$and(S1_CHD_ITM.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
							.cutoff$and(S1_CHD_ITM.itm_jnl_cd.like(bind("chd_itm_jnl_cd")))
							.cutoff$and(S1_T2.itm_cd.like(bind("chd_itm_cd")))
							.cutoff$and(S1_T2.itm_sub1.like(bind("chd_itm_sub1")))
							.cutoff$and(S1_T2.itm_sub2.like(bind("chd_itm_sub2")))
							.cutoff$and(S1_T2.itm_sub3.like(bind("chd_itm_sub3")))
							.cutoff$and(
								nvl(
									S1_CHD_SUNDRY_ITM.itm_nm,
									S1_CHD_ITM.itm_nm
								).like(bind("chd_itm_nm"))
							)
							.cutoff$and(S1_T2.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T2.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T2.lot_no.like(bind("chd_lot_no")))
							.cutoff$and(S1_T2.sublot_no.like(bind("chd_sublot_no")))
							.cutoff$and(S1_T2.sno1.like(bind("chd_sno1")))
							.cutoff$and(S1_T2.sno2.like(bind("chd_sno2")))
							.cutoff$and(S1_T2.sno3.like(bind("chd_sno3")))
							.cutoff$and(S1_T2.sno4.like(bind("chd_sno4")))
							.cutoff$and(S1_T2.asst_typ.like(bind("chd_asst_typ")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd1.like(bind("chd_itm_grp_cd1")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd2.like(bind("chd_itm_grp_cd2")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd3.like(bind("chd_itm_grp_cd3")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd4.like(bind("chd_itm_grp_cd4")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd5.like(bind("chd_itm_grp_cd5")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd6.like(bind("chd_itm_grp_cd6")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd7.like(bind("chd_itm_grp_cd7")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd8.like(bind("chd_itm_grp_cd8")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd9.like(bind("chd_itm_grp_cd9")))
							.cutoff$and(S1_CHD_ITM.itm_grp_cd10.like(bind("chd_itm_grp_cd10")))
							.cutoff$and(S1_T2.mfg_purc_typ.like(bind("mfg_purc_typ")))
							.cutoff$and(
								bind("chd_asst_typ_cnd").eq(value(true))
								.and(
									S1_T2.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.cutoff$and(S1_T2.repurc_obli_flg.eq(bind("repurc_obli_flg")))
							.cutoff$and(S1_T2.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
									.or(S1_T2.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
							.cutoff$and(S1_T2.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T2.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T2.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_T2.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T2.oper_act_no.like(bind("oper_act_no")))
							.cutoff$and(S1_T2.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T2.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T2.rec_eval_typ.like(bind("rec_eval_typ")))
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S1_T2.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T2.bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_stk_bp_flg_str").eq(value(true))
								.and(S1_T2.stk_bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_po_no_flg_str").eq(value(true))
								.and(S1_T1.po_no.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S1_T1.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S1_T1.iv_no.isNull())
							)
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
					.select(DS0D, S0_T.pr("wg_cd"))
					.groupBy(DS0D, S0_T.pr("wg_cd")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr("ym"))
					.groupBy(DS0D, S0_T.pr("ym")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_cd")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("par_itm_typ_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ")),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ_d_cd")),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ_d_nm")),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("par_itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_jnl_cd")),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("par_itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_jnl_nm")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_cd")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_sub1"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub1")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_sub2"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub2")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_sub3"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub3")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_nm")),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr("itm_mfg_inst_no"))
					.groupBy(DS0D, S0_T.pr("itm_mfg_inst_no")),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr("mfg_act_no"))
					.groupBy(DS0D, S0_T.pr("mfg_act_no")),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd1")),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm1")),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd2")),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm2")),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd3")),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm3")),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd4")),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm4")),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd5")),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm5")),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd6")),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm6")),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd7")),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm7")),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd8")),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm8")),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd9")),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm9")),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd10")),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm10")),
				when(boundOr("par_lot_flg"))
					.select(DS0D, S0_T.pr("par_lot_no"))
					.groupBy(DS0D, S0_T.pr("par_lot_no")),
				when(boundOr("par_sublot_flg"))
					.select(DS0D, S0_T.pr("par_sublot_no"))
					.groupBy(DS0D, S0_T.pr("par_sublot_no")),
				when(boundOr("par_sno1_flg"))
					.select(DS0D, S0_T.pr("par_sno1"))
					.groupBy(DS0D, S0_T.pr("par_sno1")),
				when(boundOr("par_sno2_flg"))
					.select(DS0D, S0_T.pr("par_sno2"))
					.groupBy(DS0D, S0_T.pr("par_sno2")),
				when(boundOr("par_sno3_flg"))
					.select(DS0D, S0_T.pr("par_sno3"))
					.groupBy(DS0D, S0_T.pr("par_sno3")),
				when(boundOr("par_sno4_flg"))
					.select(DS0D, S0_T.pr("par_sno4"))
					.groupBy(DS0D, S0_T.pr("par_sno4")),
				when(boundOr("par_asst_typ_flg"))
					.select(DS0D, S0_T.pr("par_asst_typ"))
					.groupBy(DS0D, S0_T.pr("par_asst_typ")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_cd"))
					.groupBy(DS0D, S0_T.pr("bp_cd")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
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
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr("po_no"))
					.groupBy(DS0D, S0_T.pr("po_no")),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr("slo_no"))
					.groupBy(DS0D, S0_T.pr("slo_no")),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr("iv_no"))
					.groupBy(DS0D, S0_T.pr("iv_no")),
				when(boundOr("comp_qty_flg"))
					.select(DS0D, S0_T.pr("par_unit_cd"))
					.groupBy(DS0D, S0_T.pr("par_unit_cd")),
				when(boundOr("inpt_dpt_flg"))
					.select(DS0D, S0_T.pr("inpt_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("inpt_dpt_cd")),
				when(boundOr("inpt_dpt_flg"))
					.select(DS0D, S0_T.pr("inpt_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("inpt_dpt_nm")),
				when(boundOr("chd_itm_typ_flg"))
					.select(DS0D, S0_T.pr("chd_itm_typ"))
					.groupBy(DS0D, S0_T.pr("chd_itm_typ")),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("chd_itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("chd_itm_typ_d_cd")),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("chd_itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("chd_itm_typ_d_nm")),
				when(boundOr("chd_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("chd_itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("chd_itm_jnl_cd")),
				when(boundOr("chd_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("chd_itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("chd_itm_jnl_nm")),
				when(boundOr("chd_itm_flg"))
					.select(DS0D, S0_T.pr("chd_itm_cd"))
					.groupBy(DS0D, S0_T.pr("chd_itm_cd")),
				when(boundOr("chd_itm_flg"))
					.select(DS0D, S0_T.pr("chd_itm_sub1"))
					.groupBy(DS0D, S0_T.pr("chd_itm_sub1")),
				when(boundOr("chd_itm_flg"))
					.select(DS0D, S0_T.pr("chd_itm_sub2"))
					.groupBy(DS0D, S0_T.pr("chd_itm_sub2")),
				when(boundOr("chd_itm_flg"))
					.select(DS0D, S0_T.pr("chd_itm_sub3"))
					.groupBy(DS0D, S0_T.pr("chd_itm_sub3")),
				when(boundOr("chd_itm_flg"))
					.select(DS0D, S0_T.pr("chd_itm_nm"))
					.groupBy(DS0D, S0_T.pr("chd_itm_nm")),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd1")),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm1")),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd2")),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm2")),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd3")),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm3")),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd4")),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm4")),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd5")),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm5")),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd6")),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm6")),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd7")),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm7")),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd8")),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm8")),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd9")),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm9")),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("chd_itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_cd10")),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("chd_itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("chd_itm_grp_nm10")),
				when(boundOr("chd_lot_flg"))
					.select(DS0D, S0_T.pr("chd_lot_no"))
					.groupBy(DS0D, S0_T.pr("chd_lot_no")),
				when(boundOr("chd_sublot_flg"))
					.select(DS0D, S0_T.pr("chd_sublot_no"))
					.groupBy(DS0D, S0_T.pr("chd_sublot_no")),
				when(boundOr("chd_sno1_flg"))
					.select(DS0D, S0_T.pr("chd_sno1"))
					.groupBy(DS0D, S0_T.pr("chd_sno1")),
				when(boundOr("chd_sno2_flg"))
					.select(DS0D, S0_T.pr("chd_sno2"))
					.groupBy(DS0D, S0_T.pr("chd_sno2")),
				when(boundOr("chd_sno3_flg"))
					.select(DS0D, S0_T.pr("chd_sno3"))
					.groupBy(DS0D, S0_T.pr("chd_sno3")),
				when(boundOr("chd_sno4_flg"))
					.select(DS0D, S0_T.pr("chd_sno4"))
					.groupBy(DS0D, S0_T.pr("chd_sno4")),
				when(boundOr("chd_asst_typ_flg"))
					.select(DS0D, S0_T.pr("chd_asst_typ"))
					.groupBy(DS0D, S0_T.pr("chd_asst_typ")),
				when(boundOr("chd_asst_typ_flg"))
					.select(DS0D, S0_T.pr("repurc_obli_flg"))
					.groupBy(DS0D, S0_T.pr("repurc_obli_flg")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_cd"))
					.groupBy(DS0D, S0_T.pr("loc_cd")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_cd"))
					.groupBy(DS0D, S0_T.pr("str_ln_cd")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("oper_act_no_flg"))
					.select(DS0D, S0_T.pr("oper_act_no"))
					.groupBy(DS0D, S0_T.pr("oper_act_no")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_cd"))
					.groupBy(DS0D, S0_T.pr("oper_cd")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("disp_oper_seq_flg"))
					.select(DS0D, S0_T.pr("oper_seq"))
					.groupBy(DS0D, S0_T.pr("oper_seq")),
				when(boundOr("stk_bp_flg"))
					.select(DS0D, S0_T.pr("stk_bp_cd"))
					.groupBy(DS0D, S0_T.pr("stk_bp_cd")),
				when(boundOr("stk_bp_flg"))
					.select(DS0D, S0_T.pr("stk_bp_nm"))
					.groupBy(DS0D, S0_T.pr("stk_bp_nm")),
				when(boundOr("ac_slip_typ_flg"))
					.select(DS0D, S0_T.pr("ac_slip_typ"))
					.groupBy(DS0D, S0_T.pr("ac_slip_typ")),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr("ac_rsn_cd"))
					.groupBy(DS0D, S0_T.pr("ac_rsn_cd")),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr("ac_rsn_nm"))
					.groupBy(DS0D, S0_T.pr("ac_rsn_nm")),
				when(boundOr("rec_eval_typ_flg"))
					.select(DS0D, S0_T.pr("rec_eval_typ"))
					.groupBy(DS0D, S0_T.pr("rec_eval_typ")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T2.qty)).as("qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T2.so_act_amt)).as("so_act_amt")),
				when(null)
					.select(DS0D, avg(S0_T.pr("std_upri")).as("std_upri")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_T1.wg_cd.as("wg_cd"))
					.groupBy(DS1D, S1_T1.wg_cd),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("ym_flg"))
					.select(DS1D, S1_T1.ym.as("ym"))
					.groupBy(DS1D, S1_T1.ym),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm", "inpt_dpt_flg", "inpt_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_ARG).on(S1_T1.calc_no.eq(S1_ARG.calc_no).and(S1_T1.calc_grp_cd.eq(S1_ARG.calc_grp_cd)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_T1.mng_dpt_cd.as("mng_dpt_cd"))
					.groupBy(DS1D, S1_T1.mng_dpt_cd),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T1.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_ARG.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("par_itm_typ_flg"))
					.select(DS1D, S1_PAR_ITM.itm_typ.as("par_itm_typ"))
					.groupBy(DS1D, S1_PAR_ITM.itm_typ),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS1D, S1_PAR_ITM.itm_typ_d_cd.as("par_itm_typ_d_cd"))
					.groupBy(DS1D, S1_PAR_ITM.itm_typ_d_cd),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS1D, S1_PAR_ITM_TYP_D.itm_typ_d_nm.as("par_itm_typ_d_nm"))
					.groupBy(DS1D, S1_PAR_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("par_itm_typ_d_flg", "par_itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_TYP_D).on(S1_PAR_ITM.itm_typ.eq(S1_PAR_ITM_TYP_D.itm_typ).and(S1_PAR_ITM.itm_typ_d_cd.eq(S1_PAR_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_TYP_D.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS1D, S1_PAR_ITM.itm_jnl_cd.as("par_itm_jnl_cd"))
					.groupBy(DS1D, S1_PAR_ITM.itm_jnl_cd),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS1D, S1_PAR_ITM_JNL.itm_jnl_nm.as("par_itm_jnl_nm"))
					.groupBy(DS1D, S1_PAR_ITM_JNL.itm_jnl_nm),
				when(boundOr("par_itm_jnl_flg", "par_itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_JNL).on(S1_PAR_ITM.itm_jnl_cd.eq(S1_PAR_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_JNL.itm_jnl_nm.like(bind("par_itm_jnl_nm")))),
				when(boundOr("par_itm_flg"))
					.select(DS1D, S1_T1.itm_cd.as("par_itm_cd"))
					.groupBy(DS1D, S1_T1.itm_cd),
				when(boundOr("par_itm_flg"))
					.select(DS1D, S1_T1.itm_sub1.as("par_itm_sub1"))
					.groupBy(DS1D, S1_T1.itm_sub1),
				when(boundOr("par_itm_flg"))
					.select(DS1D, S1_T1.itm_sub2.as("par_itm_sub2"))
					.groupBy(DS1D, S1_T1.itm_sub2),
				when(boundOr("par_itm_flg"))
					.select(DS1D, S1_T1.itm_sub3.as("par_itm_sub3"))
					.groupBy(DS1D, S1_T1.itm_sub3),
				when(boundOr("par_itm_flg"))
					.select(DS1D, nvl(S1_PAR_SUNDRY_ITM.itm_nm,S1_PAR_ITM.itm_nm).as("par_itm_nm"))
					.groupBy(DS1D, nvl(S1_PAR_SUNDRY_ITM.itm_nm,S1_PAR_ITM.itm_nm)),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS1D, S1_T1.itm_mfg_inst_no.as("itm_mfg_inst_no"))
					.groupBy(DS1D, S1_T1.itm_mfg_inst_no),
				when(boundOr("mfg_act_no_flg"))
					.select(DS1D, S1_T1.mfg_act_no.as("mfg_act_no"))
					.groupBy(DS1D, S1_T1.mfg_act_no),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd1.as("par_itm_grp_cd1"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd1),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS1D, S1_PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.groupBy(DS1D, S1_PAR_ITM_GRP1.itm_grp_nm),
				when(boundOr("par_itm_grp_flg1", "par_itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP1).on(S1_PAR_ITM.itm_grp_cd1.eq(S1_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd2.as("par_itm_grp_cd2"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd2),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS1D, S1_PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.groupBy(DS1D, S1_PAR_ITM_GRP2.itm_grp_nm),
				when(boundOr("par_itm_grp_flg2", "par_itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP2).on(S1_PAR_ITM.itm_grp_cd2.eq(S1_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd3.as("par_itm_grp_cd3"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd3),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS1D, S1_PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.groupBy(DS1D, S1_PAR_ITM_GRP3.itm_grp_nm),
				when(boundOr("par_itm_grp_flg3", "par_itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP3).on(S1_PAR_ITM.itm_grp_cd3.eq(S1_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd4.as("par_itm_grp_cd4"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd4),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS1D, S1_PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.groupBy(DS1D, S1_PAR_ITM_GRP4.itm_grp_nm),
				when(boundOr("par_itm_grp_flg4", "par_itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP4).on(S1_PAR_ITM.itm_grp_cd4.eq(S1_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd5.as("par_itm_grp_cd5"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd5),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS1D, S1_PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.groupBy(DS1D, S1_PAR_ITM_GRP5.itm_grp_nm),
				when(boundOr("par_itm_grp_flg5", "par_itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP5).on(S1_PAR_ITM.itm_grp_cd5.eq(S1_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd6.as("par_itm_grp_cd6"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd6),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS1D, S1_PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.groupBy(DS1D, S1_PAR_ITM_GRP6.itm_grp_nm),
				when(boundOr("par_itm_grp_flg6", "par_itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP6).on(S1_PAR_ITM.itm_grp_cd6.eq(S1_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd7.as("par_itm_grp_cd7"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd7),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS1D, S1_PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.groupBy(DS1D, S1_PAR_ITM_GRP7.itm_grp_nm),
				when(boundOr("par_itm_grp_flg7", "par_itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP7).on(S1_PAR_ITM.itm_grp_cd7.eq(S1_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd8.as("par_itm_grp_cd8"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd8),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS1D, S1_PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.groupBy(DS1D, S1_PAR_ITM_GRP8.itm_grp_nm),
				when(boundOr("par_itm_grp_flg8", "par_itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP8).on(S1_PAR_ITM.itm_grp_cd8.eq(S1_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd9.as("par_itm_grp_cd9"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd9),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS1D, S1_PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.groupBy(DS1D, S1_PAR_ITM_GRP9.itm_grp_nm),
				when(boundOr("par_itm_grp_flg9", "par_itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP9).on(S1_PAR_ITM.itm_grp_cd9.eq(S1_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd10.as("par_itm_grp_cd10"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd10),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS1D, S1_PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.groupBy(DS1D, S1_PAR_ITM_GRP10.itm_grp_nm),
				when(boundOr("par_itm_grp_flg10", "par_itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP10).on(S1_PAR_ITM.itm_grp_cd10.eq(S1_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10")))),
				when(boundOr("par_lot_flg"))
					.select(DS1D, S1_T1.lot_no.as("par_lot_no"))
					.groupBy(DS1D, S1_T1.lot_no),
				when(boundOr("par_sublot_flg"))
					.select(DS1D, S1_T1.sublot_no.as("par_sublot_no"))
					.groupBy(DS1D, S1_T1.sublot_no),
				when(boundOr("par_sno1_flg"))
					.select(DS1D, S1_T1.sno1.as("par_sno1"))
					.groupBy(DS1D, S1_T1.sno1),
				when(boundOr("par_sno2_flg"))
					.select(DS1D, S1_T1.sno2.as("par_sno2"))
					.groupBy(DS1D, S1_T1.sno2),
				when(boundOr("par_sno3_flg"))
					.select(DS1D, S1_T1.sno3.as("par_sno3"))
					.groupBy(DS1D, S1_T1.sno3),
				when(boundOr("par_sno4_flg"))
					.select(DS1D, S1_T1.sno4.as("par_sno4"))
					.groupBy(DS1D, S1_T1.sno4),
				when(boundOr("par_asst_typ_flg"))
					.select(DS1D, S1_T1.asst_typ.as("par_asst_typ"))
					.groupBy(DS1D, S1_T1.asst_typ),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_T1.bp_cd.as("bp_cd"))
					.groupBy(DS1D, S1_T1.bp_cd),
				when(boundOr("bp_flg", "bp_nm", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_cd1", "bp_grp_cd2", "bp_grp_cd3", "bp_grp_cd4", "bp_grp_cd5", "bp_grp_cd6", "bp_grp_cd7", "bp_grp_cd8", "bp_grp_cd9", "bp_grp_cd10", "bp_grp_nm1", "bp_grp_nm2", "bp_grp_nm3", "bp_grp_nm4", "bp_grp_nm5", "bp_grp_nm6", "bp_grp_nm7", "bp_grp_nm8", "bp_grp_nm9", "bp_grp_nm10", "cntry_flg", "area_flg", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T1.bp_cd.eq(S1_BP.bp_cd))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
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
				when(boundOr("po_no_flg"))
					.select(DS1D, S1_T1.po_no.as("po_no"))
					.groupBy(DS1D, S1_T1.po_no),
				when(boundOr("slo_no_flg"))
					.select(DS1D, S1_T1.slo_no.as("slo_no"))
					.groupBy(DS1D, S1_T1.slo_no),
				when(boundOr("iv_no_flg"))
					.select(DS1D, S1_T1.iv_no.as("iv_no"))
					.groupBy(DS1D, S1_T1.iv_no),
				when(boundOr("comp_qty_flg"))
					.select(DS1D, S1_PAR_ITM.unit_cd.as("par_unit_cd"))
					.groupBy(DS1D, S1_PAR_ITM.unit_cd),
				when(boundOr("inpt_dpt_flg"))
					.select(DS1D, S1_T2.mng_dpt_cd.as("inpt_dpt_cd"))
					.groupBy(DS1D, S1_T2.mng_dpt_cd),
				when(boundOr("inpt_dpt_flg"))
					.select(DS1D, S1_INPT_DPT.dpt_nm.as("inpt_dpt_nm"))
					.groupBy(DS1D, S1_INPT_DPT.dpt_nm),
				when(boundOr("inpt_dpt_flg", "inpt_dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_INPT_DPT).on(S1_T2.mng_dpt_cd.eq(S1_INPT_DPT.dpt_cd).and(S1_ARG.term.eq(S1_INPT_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_INPT_DPT.dpt_nm.like(bind("inpt_dpt_nm")))),
				when(boundOr("chd_itm_typ_flg"))
					.select(DS1D, S1_CHD_ITM.itm_typ.as("chd_itm_typ"))
					.groupBy(DS1D, S1_CHD_ITM.itm_typ),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(DS1D, S1_CHD_ITM.itm_typ_d_cd.as("chd_itm_typ_d_cd"))
					.groupBy(DS1D, S1_CHD_ITM.itm_typ_d_cd),
				when(boundOr("chd_itm_typ_d_flg"))
					.select(DS1D, S1_CHD_ITM_TYP_D.itm_typ_d_nm.as("chd_itm_typ_d_nm"))
					.groupBy(DS1D, S1_CHD_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("chd_itm_typ_d_flg", "chd_itm_typ_d_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_TYP_D).on(S1_CHD_ITM.itm_typ.eq(S1_CHD_ITM_TYP_D.itm_typ).and(S1_CHD_ITM.itm_typ_d_cd.eq(S1_CHD_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_TYP_D.itm_typ_d_nm.like(bind("chd_itm_typ_d_nm")))),
				when(boundOr("chd_itm_jnl_flg"))
					.select(DS1D, S1_CHD_ITM.itm_jnl_cd.as("chd_itm_jnl_cd"))
					.groupBy(DS1D, S1_CHD_ITM.itm_jnl_cd),
				when(boundOr("chd_itm_jnl_flg"))
					.select(DS1D, S1_CHD_ITM_JNL.itm_jnl_nm.as("chd_itm_jnl_nm"))
					.groupBy(DS1D, S1_CHD_ITM_JNL.itm_jnl_nm),
				when(boundOr("chd_itm_jnl_flg", "chd_itm_jnl_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_JNL).on(S1_CHD_ITM.itm_jnl_cd.eq(S1_CHD_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_JNL.itm_jnl_nm.like(bind("chd_itm_jnl_nm")))),
				when(boundOr("chd_itm_flg"))
					.select(DS1D, S1_T2.itm_cd.as("chd_itm_cd"))
					.groupBy(DS1D, S1_T2.itm_cd),
				when(boundOr("chd_itm_flg"))
					.select(DS1D, S1_T2.itm_sub1.as("chd_itm_sub1"))
					.groupBy(DS1D, S1_T2.itm_sub1),
				when(boundOr("chd_itm_flg"))
					.select(DS1D, S1_T2.itm_sub2.as("chd_itm_sub2"))
					.groupBy(DS1D, S1_T2.itm_sub2),
				when(boundOr("chd_itm_flg"))
					.select(DS1D, S1_T2.itm_sub3.as("chd_itm_sub3"))
					.groupBy(DS1D, S1_T2.itm_sub3),
				when(boundOr("chd_itm_flg"))
					.select(DS1D, nvl(S1_CHD_SUNDRY_ITM.itm_nm,S1_CHD_ITM.itm_nm).as("chd_itm_nm"))
					.groupBy(DS1D, nvl(S1_CHD_SUNDRY_ITM.itm_nm,S1_CHD_ITM.itm_nm)),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd1.as("chd_itm_grp_cd1"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd1),
				when(boundOr("chd_itm_grp_flg1"))
					.select(DS1D, S1_CHD_ITM_GRP1.itm_grp_nm.as("chd_itm_grp_nm1"))
					.groupBy(DS1D, S1_CHD_ITM_GRP1.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg1", "chd_itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP1).on(S1_CHD_ITM.itm_grp_cd1.eq(S1_CHD_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_CHD_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP1.itm_grp_nm.like(bind("chd_itm_grp_nm1")))),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd2.as("chd_itm_grp_cd2"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd2),
				when(boundOr("chd_itm_grp_flg2"))
					.select(DS1D, S1_CHD_ITM_GRP2.itm_grp_nm.as("chd_itm_grp_nm2"))
					.groupBy(DS1D, S1_CHD_ITM_GRP2.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg2", "chd_itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP2).on(S1_CHD_ITM.itm_grp_cd2.eq(S1_CHD_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_CHD_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP2.itm_grp_nm.like(bind("chd_itm_grp_nm2")))),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd3.as("chd_itm_grp_cd3"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd3),
				when(boundOr("chd_itm_grp_flg3"))
					.select(DS1D, S1_CHD_ITM_GRP3.itm_grp_nm.as("chd_itm_grp_nm3"))
					.groupBy(DS1D, S1_CHD_ITM_GRP3.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg3", "chd_itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP3).on(S1_CHD_ITM.itm_grp_cd3.eq(S1_CHD_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_CHD_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP3.itm_grp_nm.like(bind("chd_itm_grp_nm3")))),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd4.as("chd_itm_grp_cd4"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd4),
				when(boundOr("chd_itm_grp_flg4"))
					.select(DS1D, S1_CHD_ITM_GRP4.itm_grp_nm.as("chd_itm_grp_nm4"))
					.groupBy(DS1D, S1_CHD_ITM_GRP4.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg4", "chd_itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP4).on(S1_CHD_ITM.itm_grp_cd4.eq(S1_CHD_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_CHD_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP4.itm_grp_nm.like(bind("chd_itm_grp_nm4")))),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd5.as("chd_itm_grp_cd5"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd5),
				when(boundOr("chd_itm_grp_flg5"))
					.select(DS1D, S1_CHD_ITM_GRP5.itm_grp_nm.as("chd_itm_grp_nm5"))
					.groupBy(DS1D, S1_CHD_ITM_GRP5.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg5", "chd_itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP5).on(S1_CHD_ITM.itm_grp_cd5.eq(S1_CHD_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_CHD_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP5.itm_grp_nm.like(bind("chd_itm_grp_nm5")))),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd6.as("chd_itm_grp_cd6"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd6),
				when(boundOr("chd_itm_grp_flg6"))
					.select(DS1D, S1_CHD_ITM_GRP6.itm_grp_nm.as("chd_itm_grp_nm6"))
					.groupBy(DS1D, S1_CHD_ITM_GRP6.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg6", "chd_itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP6).on(S1_CHD_ITM.itm_grp_cd6.eq(S1_CHD_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_CHD_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP6.itm_grp_nm.like(bind("chd_itm_grp_nm6")))),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd7.as("chd_itm_grp_cd7"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd7),
				when(boundOr("chd_itm_grp_flg7"))
					.select(DS1D, S1_CHD_ITM_GRP7.itm_grp_nm.as("chd_itm_grp_nm7"))
					.groupBy(DS1D, S1_CHD_ITM_GRP7.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg7", "chd_itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP7).on(S1_CHD_ITM.itm_grp_cd7.eq(S1_CHD_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_CHD_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP7.itm_grp_nm.like(bind("chd_itm_grp_nm7")))),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd8.as("chd_itm_grp_cd8"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd8),
				when(boundOr("chd_itm_grp_flg8"))
					.select(DS1D, S1_CHD_ITM_GRP8.itm_grp_nm.as("chd_itm_grp_nm8"))
					.groupBy(DS1D, S1_CHD_ITM_GRP8.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg8", "chd_itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP8).on(S1_CHD_ITM.itm_grp_cd8.eq(S1_CHD_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_CHD_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP8.itm_grp_nm.like(bind("chd_itm_grp_nm8")))),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd9.as("chd_itm_grp_cd9"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd9),
				when(boundOr("chd_itm_grp_flg9"))
					.select(DS1D, S1_CHD_ITM_GRP9.itm_grp_nm.as("chd_itm_grp_nm9"))
					.groupBy(DS1D, S1_CHD_ITM_GRP9.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg9", "chd_itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP9).on(S1_CHD_ITM.itm_grp_cd9.eq(S1_CHD_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_CHD_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP9.itm_grp_nm.like(bind("chd_itm_grp_nm9")))),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS1D, S1_CHD_ITM.itm_grp_cd10.as("chd_itm_grp_cd10"))
					.groupBy(DS1D, S1_CHD_ITM.itm_grp_cd10),
				when(boundOr("chd_itm_grp_flg10"))
					.select(DS1D, S1_CHD_ITM_GRP10.itm_grp_nm.as("chd_itm_grp_nm10"))
					.groupBy(DS1D, S1_CHD_ITM_GRP10.itm_grp_nm),
				when(boundOr("chd_itm_grp_flg10", "chd_itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S1_CHD_ITM_GRP10).on(S1_CHD_ITM.itm_grp_cd10.eq(S1_CHD_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_CHD_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CHD_ITM_GRP10.itm_grp_nm.like(bind("chd_itm_grp_nm10")))),
				when(boundOr("chd_lot_flg"))
					.select(DS1D, S1_T2.lot_no.as("chd_lot_no"))
					.groupBy(DS1D, S1_T2.lot_no),
				when(boundOr("chd_sublot_flg"))
					.select(DS1D, S1_T2.sublot_no.as("chd_sublot_no"))
					.groupBy(DS1D, S1_T2.sublot_no),
				when(boundOr("chd_sno1_flg"))
					.select(DS1D, S1_T2.sno1.as("chd_sno1"))
					.groupBy(DS1D, S1_T2.sno1),
				when(boundOr("chd_sno2_flg"))
					.select(DS1D, S1_T2.sno2.as("chd_sno2"))
					.groupBy(DS1D, S1_T2.sno2),
				when(boundOr("chd_sno3_flg"))
					.select(DS1D, S1_T2.sno3.as("chd_sno3"))
					.groupBy(DS1D, S1_T2.sno3),
				when(boundOr("chd_sno4_flg"))
					.select(DS1D, S1_T2.sno4.as("chd_sno4"))
					.groupBy(DS1D, S1_T2.sno4),
				when(boundOr("chd_asst_typ_flg"))
					.select(DS1D, S1_T2.asst_typ.as("chd_asst_typ"))
					.groupBy(DS1D, S1_T2.asst_typ),
				when(boundOr("chd_asst_typ_flg"))
					.select(DS1D, S1_T2.repurc_obli_flg.as("repurc_obli_flg"))
					.groupBy(DS1D, S1_T2.repurc_obli_flg),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS2D, v -> v.leftOuterJoin(S1_LOC).on(S1_T2.loc_cd.eq(S1_LOC.loc_cd))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg", "site_cd"))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_T2.loc_cd.as("loc_cd"))
					.groupBy(DS1D, S1_T2.loc_cd),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("loc_flg", "loc_nm"))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_T2.str_ln_cd.as("str_ln_cd"))
					.groupBy(DS1D, S1_T2.str_ln_cd),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_T2.str_ln_cd.eq(S1_STR_LN.str_ln_cd).and(S1_T2.loc_cd.eq(S1_STR_LN.loc_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("oper_act_no_flg"))
					.select(DS1D, S1_T2.oper_act_no.as("oper_act_no"))
					.groupBy(DS1D, S1_T2.oper_act_no),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_T2.oper_cd.as("oper_cd"))
					.groupBy(DS1D, S1_T2.oper_cd),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_OPER).on(S1_T2.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("disp_oper_seq_flg"))
					.select(DS1D, S1_T2.oper_seq.as("oper_seq"))
					.groupBy(DS1D, S1_T2.oper_seq),
				when(boundOr("stk_bp_flg"))
					.select(DS1D, S1_T2.stk_bp_cd.as("stk_bp_cd"))
					.groupBy(DS1D, S1_T2.stk_bp_cd),
				when(boundOr("stk_bp_flg"))
					.select(DS1D, S1_STK_BP.bp_nm.as("stk_bp_nm"))
					.groupBy(DS1D, S1_STK_BP.bp_nm),
				when(boundOr("stk_bp_flg", "stk_bp_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_STK_BP).on(S1_T2.stk_bp_cd.eq(S1_STK_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_STK_BP.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("ac_slip_typ_flg"))
					.select(DS1D, S1_T2.ac_slip_typ.as("ac_slip_typ"))
					.groupBy(DS1D, S1_T2.ac_slip_typ),
				when(boundOr("ac_rsn_flg"))
					.select(DS1D, S1_T2.ac_rsn_cd.as("ac_rsn_cd"))
					.groupBy(DS1D, S1_T2.ac_rsn_cd),
				when(boundOr("ac_rsn_flg"))
					.select(DS1D, S1_AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
					.groupBy(DS1D, S1_AC_RSN.ac_rsn_nm),
				when(boundOr("ac_rsn_flg", "ac_rsn_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S1_AC_RSN).on(S1_T2.ac_rsn_cd.eq(S1_AC_RSN.ac_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("rec_eval_typ_flg"))
					.select(DS1D, S1_T2.rec_eval_typ.as("rec_eval_typ"))
					.groupBy(DS1D, S1_T2.rec_eval_typ),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_CHD_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_CHD_ITM.unit_cd)
			);
	}
	
	/**
	 * -- MGBFL0090_MGT_ACC_TOP_Query_S03
	 */
	static MCQueryPlan MGBFL0090_MGT_ACC_TOP_S03() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MGT_CALC_ITM_MFG_INST_R S1_T2 = MGT_CALC_ITM_MFG_INST_R.create("T2");
		MGT_ITM_MFG_INST_R S1_T3 = MGT_ITM_MFG_INST_R.create("T3");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_SUNDRY_ITM_R S1_PAR_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("PAR_SUNDRY_ITM");
		MGT_ACC_TOP_R S2_W = MGT_ACC_TOP_R.create("W");
		MAM_ITM_R S2_CHD_ITM = MAM_ITM_R.create("CHD_ITM");
		MAM_SUNDRY_ITM_R S2_CHD_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("CHD_SUNDRY_ITM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0090_MGT_ACC_TOP_Query_S03")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T1.ym,
							S1_T1.itm_cd.as("par_itm_cd"),
							S1_T1.itm_sub1.as("par_itm_sub1"),
							S1_T1.itm_sub2.as("par_itm_sub2"),
							S1_T1.itm_sub3.as("par_itm_sub3"),
							S1_T1.itm_mfg_inst_no,
							S1_T1.mfg_act_no,
							S1_T1.qty.as("comp_qty"),
							S1_T2.qty.as("odr_qty")
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_T2).on(
								S1_T1.calc_no.eq(S1_T2.calc_no)
								.and(S1_T1.calc_grp_cd.eq(S1_T2.calc_grp_cd))
								.and(S1_T1.itm_cd.eq(S1_T2.itm_cd))
								.and(S1_T1.itm_sub1.eq(S1_T2.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_T2.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_T2.itm_sub3))
								.and(S1_T1.itm_mfg_inst_no.eq(S1_T2.itm_mfg_inst_no))
								.and(S1_T1.mfg_act_no.eq(S1_T2.mfg_act_no))
							)
							.leftOuterJoin(S1_T3).on(
								S1_T2.calc_ctg_cd.eq(S1_T3.calc_ctg_cd)
								.and(S1_T2.itm_cd.eq(S1_T3.itm_cd))
								.and(S1_T2.itm_sub1.eq(S1_T3.itm_sub1))
								.and(S1_T2.itm_sub2.eq(S1_T3.itm_sub2))
								.and(S1_T2.itm_sub3.eq(S1_T3.itm_sub3))
								.and(S1_T2.itm_mfg_inst_no.eq(S1_T3.itm_mfg_inst_no))
								.and(S1_T2.mfg_act_no.eq(S1_T3.mfg_act_no))
							)
							.innerJoin(S1_WG).on(S1_T1.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_PAR_ITM).on(
								S1_T1.itm_cd.eq(S1_PAR_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_PAR_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_PAR_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_PAR_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_PAR_SUNDRY_ITM).on(
								S1_T1.itm_cd.eq(S1_PAR_SUNDRY_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_PAR_SUNDRY_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_PAR_SUNDRY_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_PAR_SUNDRY_ITM.itm_sub3))
								.and(S1_T1.sno1.eq(S1_PAR_SUNDRY_ITM.sno1))
								.and(S1_T1.sno2.eq(S1_PAR_SUNDRY_ITM.sno2))
								.and(S1_T1.sno3.eq(S1_PAR_SUNDRY_ITM.sno3))
								.and(S1_T1.sno4.eq(S1_PAR_SUNDRY_ITM.sno4))
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.calc_no.like(bind("calc_no")))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INST.value())))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S2_W
										.leftOuterJoin(S2_CHD_ITM).on(
											S2_W.itm_cd.eq(S2_CHD_ITM.itm_cd)
											.and(S2_W.itm_sub1.eq(S2_CHD_ITM.itm_sub1))
											.and(S2_W.itm_sub2.eq(S2_CHD_ITM.itm_sub2))
											.and(S2_W.itm_sub3.eq(S2_CHD_ITM.itm_sub3))
										)
										.leftOuterJoin(S2_CHD_SUNDRY_ITM).on(
											S2_W.itm_cd.eq(S2_CHD_SUNDRY_ITM.itm_cd)
											.and(S2_W.itm_sub1.eq(S2_CHD_SUNDRY_ITM.itm_sub1))
											.and(S2_W.itm_sub2.eq(S2_CHD_SUNDRY_ITM.itm_sub2))
											.and(S2_W.itm_sub3.eq(S2_CHD_SUNDRY_ITM.itm_sub3))
											.and(S2_W.sno1.eq(S2_CHD_SUNDRY_ITM.sno1))
											.and(S2_W.sno2.eq(S2_CHD_SUNDRY_ITM.sno2))
											.and(S2_W.sno3.eq(S2_CHD_SUNDRY_ITM.sno3))
											.and(S2_W.sno4.eq(S2_CHD_SUNDRY_ITM.sno4))
										)
									)
									.where(
										value(0).eq(value(0))
										.cutoff$and(S2_W.calc_no.like(bind("calc_no")))
										.and(S2_W.calc_grp_cd.eq(bind("calc_grp_cd")))
										.and(S2_W.calc_no.eq(S1_T1.calc_no))
										.and(S2_W.calc_grp_cd.eq(S1_T1.calc_grp_cd))
										.and(S2_W.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
										.and(S2_W.ym.eq(S1_T1.ym))
										.and(S2_W.par_itm_cd.eq(S1_T1.itm_cd))
										.and(S2_W.par_itm_sub1.eq(S1_T1.itm_sub1))
										.and(S2_W.par_itm_sub2.eq(S1_T1.itm_sub2))
										.and(S2_W.par_itm_sub3.eq(S1_T1.itm_sub3))
										.and(S2_W.itm_mfg_inst_no.eq(S1_T1.itm_mfg_inst_no))
										.and(S2_W.mfg_act_no.eq(S1_T1.mfg_act_no))
										.cutoff$and(S2_W.mng_dpt_cd.like(bind("inpt_dpt_cd")))
										.cutoff$and(S2_W.itm_cd.like(bind("chd_itm_cd")))
										.cutoff$and(S2_W.itm_sub1.like(bind("chd_itm_sub1")))
										.cutoff$and(S2_W.itm_sub2.like(bind("chd_itm_sub2")))
										.cutoff$and(S2_W.itm_sub3.like(bind("chd_itm_sub3")))
										.cutoff$and(
											nvl(
												S2_CHD_SUNDRY_ITM.itm_nm,
												S2_CHD_ITM.itm_nm
											).like(bind("chd_itm_nm"))
										)
										.cutoff$and(S2_W.lot_no.like(bind("chd_lot_no")))
										.cutoff$and(S2_W.sublot_no.like(bind("chd_sublot_no")))
										.cutoff$and(S2_W.sno1.like(bind("chd_sno1")))
										.cutoff$and(S2_W.sno2.like(bind("chd_sno2")))
										.cutoff$and(S2_W.sno3.like(bind("chd_sno3")))
										.cutoff$and(S2_W.sno4.like(bind("chd_sno4")))
										.cutoff$and(S2_W.asst_typ.like(bind("chd_asst_typ")))
										.cutoff$and(S2_W.mfg_purc_typ.like(bind("mfg_purc_typ")))
										.cutoff$and(
											bracket(
												bind("chd_asst_typ_cnd").eq(value(true))
												.and(
													S2_W.asst_typ.in(
														value(MAC_ASST_TYP.CO_SLS.value()),
														value(MAC_ASST_TYP.CO_PROD.value())
													)
												)
											)
										)
										.cutoff$and(S2_W.repurc_obli_flg.eq(bind("repurc_obli_flg")))
										.cutoff$and(S2_W.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
												.or(S2_W.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
										.cutoff$and(S2_W.loc_cd.like(bind("loc_cd")))
										.cutoff$and(S2_W.str_ln_cd.like(bind("str_ln_cd")))
										.cutoff$and(S2_W.stk_bp_cd.like(bind("stk_bp_cd")))
										.cutoff$and(S2_W.oper_cd.like(bind("oper_cd")))
										.cutoff$and(S2_W.oper_act_no.like(bind("oper_act_no")))
										.cutoff$and(S2_W.ac_slip_typ.like(bind("ac_slip_typ")))
										.cutoff$and(S2_W.ac_rsn_cd.like(bind("ac_rsn_cd")))
										.cutoff$and(S2_W.rec_eval_typ.like(bind("rec_eval_typ")))
										.cutoff$and(
											bind("no_ac_rsn_flg_str").eq(value(true))
											.and(S2_W.ac_rsn_cd.isNull())
										)
										.cutoff$and(
											bind("no_bp_flg_str").eq(value(true))
											.and(S2_W.bp_cd.isNull())
										)
										.cutoff$and(
											bind("no_stk_bp_flg_str").eq(value(true))
											.and(S2_W.stk_bp_cd.isNull())
										)
										.cutoff$and(S2_CHD_ITM.itm_typ.like(bind("chd_itm_typ")))
										.cutoff$and(S2_CHD_ITM.itm_typ_d_cd.like(bind("chd_itm_typ_d_cd")))
										.cutoff$and(S2_CHD_ITM.itm_jnl_cd.like(bind("chd_itm_jnl_cd")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd1.like(bind("chd_itm_grp_cd1")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd2.like(bind("chd_itm_grp_cd2")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd3.like(bind("chd_itm_grp_cd3")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd4.like(bind("chd_itm_grp_cd4")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd5.like(bind("chd_itm_grp_cd5")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd6.like(bind("chd_itm_grp_cd6")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd7.like(bind("chd_itm_grp_cd7")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd8.like(bind("chd_itm_grp_cd8")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd9.like(bind("chd_itm_grp_cd9")))
										.cutoff$and(S2_CHD_ITM.itm_grp_cd10.like(bind("chd_itm_grp_cd10")))
										.cutoff$and(
											nvl(
												S2_CHD_SUNDRY_ITM.itm_nm,
												S2_CHD_ITM.itm_nm
											).like(bind("chd_itm_nm"))
										)
									)
								)
							)
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T1.ym.eq(bind("ym")))
							.cutoff$and(S1_PAR_ITM.itm_typ.like(bind("par_itm_typ")))
							.cutoff$and(S1_PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
							.cutoff$and(S1_PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("par_itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("par_itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("par_itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("par_itm_sub3")))
							.cutoff$and(
								nvl(
									S1_PAR_SUNDRY_ITM.itm_nm,
									S1_PAR_ITM.itm_nm
								).like(bind("par_itm_nm"))
							)
							.cutoff$and(S1_T1.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T1.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T1.lot_no.like(bind("par_lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("par_sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("par_sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("par_sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("par_sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("par_sno4")))
							.cutoff$and(S1_T1.asst_typ.like(bind("par_asst_typ")))
							.cutoff$and(S1_T1.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T1.po_no.like(bind("po_no")))
							.cutoff$and(S1_T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(
								bind("no_po_no_flg_str").eq(value(true))
								.and(S1_T1.po_no.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S1_T1.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S1_T1.iv_no.isNull())
							)
							.cutoff$and(S1_PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10")))
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T1.ym))
					.groupBy(DS0D, S0_T.pr(S1_T1.ym)),
				when(null)
					.select(DS0D, S0_T.pr("par_itm_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_cd")),
				when(null)
					.select(DS0D, S0_T.pr("par_itm_sub1"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub1")),
				when(null)
					.select(DS0D, S0_T.pr("par_itm_sub2"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub2")),
				when(null)
					.select(DS0D, S0_T.pr("par_itm_sub3"))
					.groupBy(DS0D, S0_T.pr("par_itm_sub3")),
				when(null)
					.select(DS0D, S0_T.pr(S1_T1.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T1.itm_mfg_inst_no)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T1.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T1.mfg_act_no)),
				when(null)
					.select(DS0D, sum(S0_T.pr("comp_qty")).as("comp_qty")),
				when(null)
					.select(DS0D, max(S0_T.pr("odr_qty")).as("odr_qty"))
			);
	}
}